package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class utils_subs_0 {


public static RemoteObject  _addthis(RemoteObject _ba,RemoteObject _str,RemoteObject _new,RemoteObject _sep,RemoteObject _space) throws Exception{
try {
		Debug.PushSubsStack("addthis (utils) ","utils",3,_ba,utils.mostCurrent,839);
if (RapidSub.canDelegate("addthis")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","addthis", _ba, _str, _new, _sep, _space);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("str", _str);
Debug.locals.put("new", _new);
Debug.locals.put("sep", _sep);
Debug.locals.put("space", _space);
 BA.debugLineNum = 839;BA.debugLine="Sub addthis(str As String, new As String, sep As S";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="Dim ret As String = str";
Debug.ShouldStop(128);
_ret = _str;Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 841;BA.debugLine="sep = IfNullOrEmpty(sep, \",\")";
Debug.ShouldStop(256);
_sep = _ifnullorempty(_ba,_sep,RemoteObject.createImmutable(","));Debug.locals.put("sep", _sep);
 BA.debugLineNum = 842;BA.debugLine="If (space = True) Then sep = sep & \" \"";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean("=",_space,utils.mostCurrent.__c.getField(true,"True")))) { 
_sep = RemoteObject.concat(_sep,RemoteObject.createImmutable(" "));Debug.locals.put("sep", _sep);};
 BA.debugLineNum = 843;BA.debugLine="If NNE(ret) Then";
Debug.ShouldStop(1024);
if (_nne(_ba,_ret).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 844;BA.debugLine="ret = ret & sep";
Debug.ShouldStop(2048);
_ret = RemoteObject.concat(_ret,_sep);Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 846;BA.debugLine="ret = ret & new";
Debug.ShouldStop(8192);
_ret = RemoteObject.concat(_ret,_new);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 847;BA.debugLine="Return ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b64tobitmap(RemoteObject _ba,RemoteObject _b64str) throws Exception{
try {
		Debug.PushSubsStack("B64ToBitmap (utils) ","utils",3,_ba,utils.mostCurrent,2516);
if (RapidSub.canDelegate("b64tobitmap")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","b64tobitmap", _ba, _b64str);}
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
RemoteObject _dc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
;
Debug.locals.put("b64str", _b64str);
 BA.debugLineNum = 2516;BA.debugLine="Sub B64ToBitmap(b64str As String) As B4XBitmap";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2518;BA.debugLine="Dim Base64Con As Base64Convert";
Debug.ShouldStop(2097152);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 2519;BA.debugLine="Base64Con.Initialize";
Debug.ShouldStop(4194304);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 2520;BA.debugLine="Dim dc As BitmapDrawable";
Debug.ShouldStop(8388608);
_dc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("dc", _dc);
 BA.debugLineNum = 2521;BA.debugLine="If (NNE(b64str)) Then";
Debug.ShouldStop(16777216);
if ((_nne(_ba,_b64str)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2522;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 2523;BA.debugLine="dc.Initialize(Base64Con.DecodeToImage(b64str))";
Debug.ShouldStop(67108864);
_dc.runVoidMethod ("Initialize",(Object)((_base64con.runMethod(false,"_v5",(Object)(_b64str)).getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 2525;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","611010057",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 2528;BA.debugLine="If Not(dc.IsInitialized) Then";
Debug.ShouldStop(-2147483648);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_dc.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2529;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(1);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 2531;BA.debugLine="bmp.Initialize(Starter.InternalFolder, \"vazio.pn";
Debug.ShouldStop(4);
_bmp.runVoidMethod ("Initialize",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("vazio.png")));
 BA.debugLineNum = 2532;BA.debugLine="dc.Initialize(bmp)";
Debug.ShouldStop(8);
_dc.runVoidMethod ("Initialize",(Object)((_bmp.getObject())));
 };
 BA.debugLineNum = 2534;BA.debugLine="Return dc.Bitmap";
Debug.ShouldStop(32);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), _dc.runMethod(false,"getBitmap"));
 BA.debugLineNum = 2543;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bitmap2file(RemoteObject _ba,RemoteObject _bmp,RemoteObject _folder,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Bitmap2File (utils) ","utils",3,_ba,utils.mostCurrent,2545);
if (RapidSub.canDelegate("bitmap2file")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","bitmap2file", _ba, _bmp, _folder, _filename);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
;
Debug.locals.put("BMP", _bmp);
Debug.locals.put("Folder", _folder);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 2545;BA.debugLine="Sub Bitmap2File(BMP As B4XBitmap, Folder As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2546;BA.debugLine="Dim Out As OutputStream";
Debug.ShouldStop(131072);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("Out", _out);
 BA.debugLineNum = 2547;BA.debugLine="Out = File.OpenOutput(Folder, Filename, False)";
Debug.ShouldStop(262144);
_out = utils.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_folder),(Object)(_filename),(Object)(utils.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);
 BA.debugLineNum = 2548;BA.debugLine="BMP.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALI";
Debug.ShouldStop(524288);
_bmp.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(utils.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),utils.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 2549;BA.debugLine="Out.Close";
Debug.ShouldStop(1048576);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 2550;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bool2int(RemoteObject _ba,RemoteObject _inbool) throws Exception{
try {
		Debug.PushSubsStack("Bool2Int (utils) ","utils",3,_ba,utils.mostCurrent,1922);
if (RapidSub.canDelegate("bool2int")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","bool2int", _ba, _inbool);}
RemoteObject _ret = RemoteObject.createImmutable(0);
;
Debug.locals.put("inBool", _inbool);
 BA.debugLineNum = 1922;BA.debugLine="Sub Bool2Int(inBool As Boolean) As Int";
Debug.ShouldStop(2);
 BA.debugLineNum = 1923;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(4);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1924;BA.debugLine="If inBool Then ret = 1";
Debug.ShouldStop(8);
if (_inbool.<Boolean>get().booleanValue()) { 
_ret = BA.numberCast(int.class, 1);Debug.locals.put("ret", _ret);};
 BA.debugLineNum = 1925;BA.debugLine="Return ret";
Debug.ShouldStop(16);
if (true) return _ret;
 BA.debugLineNum = 1926;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bool2string(RemoteObject _ba,RemoteObject _inbool) throws Exception{
try {
		Debug.PushSubsStack("Bool2String (utils) ","utils",3,_ba,utils.mostCurrent,1928);
if (RapidSub.canDelegate("bool2string")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","bool2string", _ba, _inbool);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("inBool", _inbool);
 BA.debugLineNum = 1928;BA.debugLine="Sub Bool2String(inBool As Boolean) As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 1929;BA.debugLine="Dim ret As String = \"False\"";
Debug.ShouldStop(256);
_ret = BA.ObjectToString("False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1930;BA.debugLine="If inBool Then ret = \"True\"";
Debug.ShouldStop(512);
if (_inbool.<Boolean>get().booleanValue()) { 
_ret = BA.ObjectToString("True");Debug.locals.put("ret", _ret);};
 BA.debugLineNum = 1931;BA.debugLine="Return ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 1932;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcangled(RemoteObject _ba,RemoteObject _frompoint,RemoteObject _topoint) throws Exception{
try {
		Debug.PushSubsStack("CalcAngleD (utils) ","utils",3,_ba,utils.mostCurrent,3159);
if (RapidSub.canDelegate("calcangled")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","calcangled", _ba, _frompoint, _topoint);}
RemoteObject _dirx = RemoteObject.createImmutable(0f);
RemoteObject _diry = RemoteObject.createImmutable(0f);
;
Debug.locals.put("fromPoint", _frompoint);
Debug.locals.put("toPoint", _topoint);
 BA.debugLineNum = 3159;BA.debugLine="Public Sub CalcAngleD(fromPoint As PointApi, toPoi";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 3160;BA.debugLine="Dim dirX = toPoint.X - fromPoint.X As Float";
Debug.ShouldStop(8388608);
_dirx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_topoint.getField(true,"X" /*RemoteObject*/ ),_frompoint.getField(true,"X" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dirX", _dirx);Debug.locals.put("dirX", _dirx);
 BA.debugLineNum = 3161;BA.debugLine="Dim dirY = toPoint.Y - fromPoint.Y As Float";
Debug.ShouldStop(16777216);
_diry = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_topoint.getField(true,"Y" /*RemoteObject*/ ),_frompoint.getField(true,"Y" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dirY", _diry);Debug.locals.put("dirY", _diry);
 BA.debugLineNum = 3162;BA.debugLine="Return ATan2D(dirY, dirX)";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"ATan2D",(Object)(BA.numberCast(double.class, _diry)),(Object)(BA.numberCast(double.class, _dirx))));
 BA.debugLineNum = 3163;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callapi(RemoteObject _ba,RemoteObject _typelog,RemoteObject _params,RemoteObject _target,RemoteObject _url,RemoteObject _funcreturn,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("CallApi (utils) ","utils",3,_ba,utils.mostCurrent,3374);
if (RapidSub.canDelegate("callapi")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","callapi", _ba, _typelog, _params, _target, _url, _funcreturn, _request);}
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
;
Debug.locals.put("TypeLog", _typelog);
Debug.locals.put("params", _params);
Debug.locals.put("target", _target);
Debug.locals.put("url", _url);
Debug.locals.put("funcReturn", _funcreturn);
Debug.locals.put("request", _request);
 BA.debugLineNum = 3374;BA.debugLine="Sub CallApi(TypeLog As Int, params As Map, target";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3376;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorkerN";
Debug.ShouldStop(32768);
_workernd = utils.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,_ba,(Object)(BA.numberCast(int.class, 4)),(Object)(_request.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3377;BA.debugLine="save2updateFile(url, MapToJson(params), TypeLog,";
Debug.ShouldStop(65536);
_save2updatefile(_ba,_url,_maptojson(_ba,_params),_typelog,_request,_workernd);
 BA.debugLineNum = 3380;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 3381;BA.debugLine="Starter.ApiCall.UpdateData2Server(params, target";
Debug.ShouldStop(1048576);
utils.mostCurrent._starter._apicall /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.api.class, "_updatedata2server" /*void*/ ,(Object)(_params),(Object)(_target),(Object)(_url),(Object)(_funcreturn),(Object)(utils.mostCurrent.__c.getField(true,"True")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e6.toString()); BA.debugLineNum = 3383;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(4194304);
_workernd = utils.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,_ba,(Object)(BA.numberCast(int.class, 4)),(Object)(_request.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3384;BA.debugLine="save2update(url, MapToJson(params), TypeLog, Wor";
Debug.ShouldStop(8388608);
_save2update(_ba,_url,_maptojson(_ba,_params),_typelog,_workernd);
 };
 BA.debugLineNum = 3386;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _callapilocalsaved(RemoteObject _ba,RemoteObject _filedata,RemoteObject _target,RemoteObject _funcreturn) throws Exception{
try {
		Debug.PushSubsStack("CallApiLocalSaved (utils) ","utils",3,_ba,utils.mostCurrent,3388);
if (RapidSub.canDelegate("callapilocalsaved")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","callapilocalsaved", _ba, _filedata, _target, _funcreturn);}
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _reader = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _linetext = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _paramsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("filedata", _filedata);
Debug.locals.put("target", _target);
Debug.locals.put("funcReturn", _funcreturn);
 BA.debugLineNum = 3388;BA.debugLine="Sub CallApiLocalSaved(filedata As String, target A";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3390;BA.debugLine="Dim Continua As Boolean = False";
Debug.ShouldStop(536870912);
_continua = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 3391;BA.debugLine="If File.Exists(Starter.SharedFolder, filedata) Th";
Debug.ShouldStop(1073741824);
if (utils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filedata)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3393;BA.debugLine="Dim Reader As TextReader";
Debug.ShouldStop(1);
_reader = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("Reader", _reader);
 BA.debugLineNum = 3394;BA.debugLine="Reader.Initialize(File.OpenInput(Starter.SharedF";
Debug.ShouldStop(2);
_reader.runVoidMethod ("Initialize",(Object)((utils.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filedata)).getObject())));
 BA.debugLineNum = 3395;BA.debugLine="Dim lineText As List = Reader.ReadList";
Debug.ShouldStop(4);
_linetext = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_linetext = _reader.runMethod(false,"ReadList");Debug.locals.put("lineText", _linetext);Debug.locals.put("lineText", _linetext);
 BA.debugLineNum = 3396;BA.debugLine="Reader.Close";
Debug.ShouldStop(8);
_reader.runVoidMethod ("Close");
 BA.debugLineNum = 3398;BA.debugLine="If (lineText.Size > 1) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean(">",_linetext.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 3399;BA.debugLine="Dim lst As List = Regex.Split(\"\\=\", lineText.Ge";
Debug.ShouldStop(64);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\=")),(Object)(BA.ObjectToString(_linetext.runMethod(false,"Get",(Object)(utils.mostCurrent._sharecode._upvalues /*RemoteObject*/ )))))));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3400;BA.debugLine="Log($\"${lst.Get(0)}:${lst.Get(1)}\"$)";
Debug.ShouldStop(128);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","615073292",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),RemoteObject.createImmutable(":"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3401;BA.debugLine="Dim paramsmap As Map '= lineText.Get(ShareCode.";
Debug.ShouldStop(256);
_paramsmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("paramsmap", _paramsmap);
 BA.debugLineNum = 3402;BA.debugLine="paramsmap.Initialize";
Debug.ShouldStop(512);
_paramsmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 3403;BA.debugLine="paramsmap.Put(lst.Get(0), lst.Get(1))";
Debug.ShouldStop(1024);
_paramsmap.runVoidMethod ("Put",(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 3405;BA.debugLine="Continua = True";
Debug.ShouldStop(4096);
_continua = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);
 };
 BA.debugLineNum = 3408;BA.debugLine="If (Continua) Then";
Debug.ShouldStop(32768);
if ((_continua).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3410;BA.debugLine="Log(paramsmap.Get(\"up_values\"))";
Debug.ShouldStop(131072);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","615073302",BA.ObjectToString(_paramsmap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("up_values"))))),0);
 };
 };
 BA.debugLineNum = 3423;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calljobapi(RemoteObject _ba,RemoteObject _jobapi,RemoteObject _jobparams,RemoteObject _jobobject,RemoteObject _jobname) throws Exception{
try {
		Debug.PushSubsStack("CallJobAPI (utils) ","utils",3,_ba,utils.mostCurrent,2429);
if (RapidSub.canDelegate("calljobapi")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","calljobapi", _ba, _jobapi, _jobparams, _jobobject, _jobname);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _urlpath = RemoteObject.createImmutable("");
;
Debug.locals.put("JobAPI", _jobapi);
Debug.locals.put("jobParams", _jobparams);
Debug.locals.put("jobObject", _jobobject);
Debug.locals.put("jobName", _jobname);
 BA.debugLineNum = 2429;BA.debugLine="Sub CallJobAPI(JobAPI As String, jobParams As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2433;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2434;BA.debugLine="params.Initialize";
Debug.ShouldStop(2);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2435;BA.debugLine="params.Clear";
Debug.ShouldStop(4);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2436;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((utils.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2438;BA.debugLine="For i=0 To jobParams.Size-1";
Debug.ShouldStop(32);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_jobparams.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2439;BA.debugLine="Dim m As Map = jobParams.Get(i)";
Debug.ShouldStop(64);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _jobparams.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);
 BA.debugLineNum = 2440;BA.debugLine="params.Put(m.GetKeyAt(0), m.GetValueAt(0))";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0)))),(Object)(_m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2449;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(65536);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2450;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(131072);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2451;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(262144);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2452;BA.debugLine="Log(\"DATA:\" & data)";
Debug.ShouldStop(524288);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","610813463",RemoteObject.concat(RemoteObject.createImmutable("DATA:"),_data),0);
 BA.debugLineNum = 2454;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(2097152);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2456;BA.debugLine="Job.Initialize(\"\", jobObject)";
Debug.ShouldStop(8388608);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_jobobject));
 BA.debugLineNum = 2458;BA.debugLine="Dim URLpath As String = $\"https://${ShareCode.APP";
Debug.ShouldStop(33554432);
_urlpath = (RemoteObject.concat(RemoteObject.createImmutable("https://"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_jobapi))),RemoteObject.createImmutable("")));Debug.locals.put("URLpath", _urlpath);Debug.locals.put("URLpath", _urlpath);
 BA.debugLineNum = 2461;BA.debugLine="Job.PostString(URLpath, data )";
Debug.ShouldStop(268435456);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_urlpath),(Object)(_data));
 BA.debugLineNum = 2462;BA.debugLine="Log( URLpath )";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","610813473",_urlpath,0);
 BA.debugLineNum = 2463;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(1073741824);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2464;BA.debugLine="Return Job";
Debug.ShouldStop(-2147483648);
if (true) return _job;
 BA.debugLineNum = 2465;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changebuttonwithcolormain(RemoteObject _ba,RemoteObject _btn,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("ChangeButtonWithColorMain (utils) ","utils",3,_ba,utils.mostCurrent,3664);
if (RapidSub.canDelegate("changebuttonwithcolormain")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","changebuttonwithcolormain", _ba, _btn, _state);}
;
Debug.locals.put("btn", _btn);
Debug.locals.put("State", _state);
 BA.debugLineNum = 3664;BA.debugLine="Sub ChangeButtonWithColorMain(btn As Button, State";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3665;BA.debugLine="btn = Sender";
Debug.ShouldStop(65536);
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), utils.mostCurrent.__c.runMethod(false,"Sender",_ba));
 BA.debugLineNum = 3666;BA.debugLine="If Not(btn.IsInitialized) Then";
Debug.ShouldStop(131072);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_btn.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3667;BA.debugLine="btn.Initialize(\"\")";
Debug.ShouldStop(262144);
_btn.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 };
 BA.debugLineNum = 3670;BA.debugLine="btn.Enabled = State";
Debug.ShouldStop(2097152);
_btn.runMethod(true,"setEnabled",_state);
 BA.debugLineNum = 3672;BA.debugLine="If (btn.Enabled) Then";
Debug.ShouldStop(8388608);
if ((_btn.runMethod(true,"getEnabled")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3673;BA.debugLine="btn.Color = Consts.ColorMain";
Debug.ShouldStop(16777216);
_btn.runVoidMethod ("setColor",utils.mostCurrent._consts._colormain /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 3675;BA.debugLine="btn.Color = Colors.Gray";
Debug.ShouldStop(67108864);
_btn.runVoidMethod ("setColor",utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 };
 BA.debugLineNum = 3677;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _color2hex(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("Color2Hex (utils) ","utils",3,_ba,utils.mostCurrent,61);
if (RapidSub.canDelegate("color2hex")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","color2hex", _ba, _instr);}
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 61;BA.debugLine="Sub Color2Hex (inStr As String) As String";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="If NNE(inStr) Then";
Debug.ShouldStop(1073741824);
if (_nne(_ba,_instr).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="Select Case inStr.ToLowerCase";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_instr.runMethod(true,"toLowerCase"),BA.ObjectToString("red"),BA.ObjectToString("green"),BA.ObjectToString("blue"),BA.ObjectToString("orange"),BA.ObjectToString("white"),BA.ObjectToString("black"))) {
case 0: {
 BA.debugLineNum = 66;BA.debugLine="Return \"#ff5c33\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("#ff5c33");
 break; }
case 1: {
 BA.debugLineNum = 68;BA.debugLine="Return \"#b3ff66\"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString("#b3ff66");
 break; }
case 2: {
 BA.debugLineNum = 70;BA.debugLine="Return \"#3399ff\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("#3399ff");
 break; }
case 3: {
 BA.debugLineNum = 72;BA.debugLine="Return \"#ffc333\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("#ffc333");
 break; }
case 4: {
 BA.debugLineNum = 74;BA.debugLine="Return \"#ffffff\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("#ffffff");
 break; }
case 5: {
 BA.debugLineNum = 76;BA.debugLine="Return \"#000000\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("#000000");
 break; }
default: {
 BA.debugLineNum = 78;BA.debugLine="Return inStr";
Debug.ShouldStop(8192);
if (true) return _instr;
 break; }
}
;
 }else {
 BA.debugLineNum = 81;BA.debugLine="Return \"#ffffff\"";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToString("#ffffff");
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorint(RemoteObject _ba,RemoteObject _iint) throws Exception{
try {
		Debug.PushSubsStack("ColorInt (utils) ","utils",3,_ba,utils.mostCurrent,3049);
if (RapidSub.canDelegate("colorint")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","colorint", _ba, _iint);}
RemoteObject _ret = RemoteObject.createImmutable(0);
;
Debug.locals.put("iint", _iint);
 BA.debugLineNum = 3049;BA.debugLine="Sub ColorInt( iint As Int) As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 3050;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(512);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 3051;BA.debugLine="If iint = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_iint,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3052;BA.debugLine="ret = Colors.Blue";
Debug.ShouldStop(2048);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3053;BA.debugLine="else if iint = 1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_iint,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3054;BA.debugLine="ret = Colors.Yellow";
Debug.ShouldStop(8192);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3055;BA.debugLine="Else If iint = 2 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_iint,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 3056;BA.debugLine="ret = Colors.Green";
Debug.ShouldStop(32768);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Green");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3057;BA.debugLine="Else If iint = 3 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_iint,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 3058;BA.debugLine="ret = Colors.Red";
Debug.ShouldStop(131072);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3059;BA.debugLine="Else If iint = 4 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_iint,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 3060;BA.debugLine="ret = Colors.Red";
Debug.ShouldStop(524288);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3061;BA.debugLine="Else If iint = 5 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_iint,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 3062;BA.debugLine="ret = Colors.Gray";
Debug.ShouldStop(2097152);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray");Debug.locals.put("ret", _ret);
 }}}}}}
;
 BA.debugLineNum = 3064;BA.debugLine="Return ret";
Debug.ShouldStop(8388608);
if (true) return _ret;
 BA.debugLineNum = 3065;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _colorstring(RemoteObject _ba,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("ColorString (utils) ","utils",3,_ba,utils.mostCurrent,3030);
if (RapidSub.canDelegate("colorstring")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","colorstring", _ba, _str);}
RemoteObject _ret = RemoteObject.createImmutable(0);
;
Debug.locals.put("str", _str);
 BA.debugLineNum = 3030;BA.debugLine="Sub ColorString( str As String) As Int";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3031;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(4194304);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 3032;BA.debugLine="If isNullOrEmpty(str) Then str = \"BLUE\"";
Debug.ShouldStop(8388608);
if (_isnullorempty(_ba,_str).<Boolean>get().booleanValue()) { 
_str = BA.ObjectToString("BLUE");Debug.locals.put("str", _str);};
 BA.debugLineNum = 3033;BA.debugLine="If str.ToUpperCase = \"BLUE\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"toUpperCase"),BA.ObjectToString("BLUE"))) { 
 BA.debugLineNum = 3034;BA.debugLine="ret = Colors.Blue";
Debug.ShouldStop(33554432);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3035;BA.debugLine="else if str.ToUpperCase = \"YELLOW\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"toUpperCase"),BA.ObjectToString("YELLOW"))) { 
 BA.debugLineNum = 3036;BA.debugLine="ret = Colors.Yellow";
Debug.ShouldStop(134217728);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3037;BA.debugLine="Else If str.ToUpperCase = \"GREEN\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"toUpperCase"),BA.ObjectToString("GREEN"))) { 
 BA.debugLineNum = 3038;BA.debugLine="ret = Colors.Green";
Debug.ShouldStop(536870912);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Green");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3039;BA.debugLine="Else If str.ToUpperCase = \"RED\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"toUpperCase"),BA.ObjectToString("RED"))) { 
 BA.debugLineNum = 3040;BA.debugLine="ret = Colors.Red";
Debug.ShouldStop(-2147483648);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3041;BA.debugLine="Else If str.ToUpperCase = \"ORANGE\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"toUpperCase"),BA.ObjectToString("ORANGE"))) { 
 BA.debugLineNum = 3042;BA.debugLine="ret = Colors.Red";
Debug.ShouldStop(2);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 3043;BA.debugLine="Else If str.ToUpperCase = \"GRAY\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_str.runMethod(true,"toUpperCase"),BA.ObjectToString("GRAY"))) { 
 BA.debugLineNum = 3044;BA.debugLine="ret = Colors.Gray";
Debug.ShouldStop(8);
_ret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray");Debug.locals.put("ret", _ret);
 }}}}}}
;
 BA.debugLineNum = 3046;BA.debugLine="Return ret";
Debug.ShouldStop(32);
if (true) return _ret;
 BA.debugLineNum = 3047;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _compareonlyvaluescondition(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("CompareOnlyValuesCondition (utils) ","utils",3,_ba,utils.mostCurrent,597);
if (RapidSub.canDelegate("compareonlyvaluescondition")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","compareonlyvaluescondition", _ba, _instr);}
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _vvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parcela1 = RemoteObject.createImmutable("");
RemoteObject _parcela2 = RemoteObject.createImmutable("");
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 597;BA.debugLine="Sub CompareOnlyValuesCondition(inStr As String) As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 599;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(4194304);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 600;BA.debugLine="Log(inStr)";
Debug.ShouldStop(8388608);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","64063235",_instr,0);
 BA.debugLineNum = 602;BA.debugLine="If inStr.Contains(\">=\") Then";
Debug.ShouldStop(33554432);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(">="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 603;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>=\", inStr )";
Debug.ShouldStop(67108864);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\>=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 605;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(268435456);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 606;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(536870912);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 608;BA.debugLine="ret = (vValues.Get(0) >= vValues.Get(1))";
Debug.ShouldStop(-2147483648);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("g",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 609;BA.debugLine="else If inStr.Contains(\"<=\") Then";
Debug.ShouldStop(1);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 610;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<=\", inStr )";
Debug.ShouldStop(2);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\<=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 612;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(8);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 613;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(16);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 615;BA.debugLine="ret = (vValues.Get(0) <= vValues.Get(1))";
Debug.ShouldStop(64);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("k",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 616;BA.debugLine="else If inStr.Contains(\"!=\") Then";
Debug.ShouldStop(128);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("!="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 617;BA.debugLine="Dim vValues As List = Regex.Split(\"\\!=\", inStr )";
Debug.ShouldStop(256);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\!=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 619;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(1024);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 620;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(2048);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 622;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
Debug.ShouldStop(8192);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 623;BA.debugLine="else If inStr.Contains(\"<>\") Then";
Debug.ShouldStop(16384);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<>"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 624;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<>\", inStr )";
Debug.ShouldStop(32768);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\<>")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 626;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(131072);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 627;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(262144);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 629;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
Debug.ShouldStop(1048576);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 630;BA.debugLine="else If inStr.Contains(\"<\") Then";
Debug.ShouldStop(2097152);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 631;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<\", inStr )";
Debug.ShouldStop(4194304);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\<")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 633;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(16777216);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 634;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(33554432);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 636;BA.debugLine="ret = (vValues.Get(0) < vValues.Get(1))";
Debug.ShouldStop(134217728);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("<",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 637;BA.debugLine="else If inStr.Contains(\">\") Then";
Debug.ShouldStop(268435456);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(">"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 638;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>\", inStr )";
Debug.ShouldStop(536870912);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\>")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 640;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(-2147483648);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 641;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(1);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 643;BA.debugLine="ret = (vValues.Get(0) > vValues.Get(1))";
Debug.ShouldStop(4);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean(">",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 644;BA.debugLine="else If inStr.Contains(\"=\") Then";
Debug.ShouldStop(8);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 645;BA.debugLine="Dim vValues As List = Regex.Split(\"\\=\", inStr )";
Debug.ShouldStop(16);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 647;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(64);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 648;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(128);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 650;BA.debugLine="ret = (vValues.Get(0) = vValues.Get(1))";
Debug.ShouldStop(512);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }}}}}}}
;
 BA.debugLineNum = 652;BA.debugLine="Return ret";
Debug.ShouldStop(2048);
if (true) return _ret;
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _comparevaluescondition(RemoteObject _ba,RemoteObject _instr,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("CompareValuesCondition (utils) ","utils",3,_ba,utils.mostCurrent,253);
if (RapidSub.canDelegate("comparevaluescondition")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","comparevaluescondition", _ba, _instr, _this);}
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _thistag = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _request = RemoteObject.createImmutable("");
RemoteObject _action_tagcode = RemoteObject.createImmutable("");
RemoteObject _task_tagcode = RemoteObject.createImmutable("");
RemoteObject _item_tagcode = RemoteObject.createImmutable("");
RemoteObject _unique_key = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _execute_status = RemoteObject.createImmutable(0);
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _repeatitemcounter = RemoteObject.createImmutable(0);
RemoteObject _repeatfieldcounter = RemoteObject.createImmutable(0);
RemoteObject _vvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parcela1 = RemoteObject.createImmutable("");
RemoteObject _parcela2 = RemoteObject.createImmutable("");
RemoteObject _val2get = RemoteObject.createImmutable("");
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("this", _this);
 BA.debugLineNum = 253;BA.debugLine="Sub CompareValuesCondition(inStr As String, this A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(1073741824);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 256;BA.debugLine="Log(inStr)";
Debug.ShouldStop(-2147483648);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932163",_instr,0);
 BA.debugLineNum = 257;BA.debugLine="If NNE(this.Tag) Then";
Debug.ShouldStop(1);
if (_nne(_ba,BA.ObjectToString(_this.runMethod(false,"getTag"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 259;BA.debugLine="Try";
Debug.ShouldStop(4);
try { BA.debugLineNum = 260;BA.debugLine="Dim thisTag As List = Regex.Split(\"\\|\",this.Tag";
Debug.ShouldStop(8);
_thistag = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_thistag = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_this.runMethod(false,"getTag"))))));Debug.locals.put("thisTag", _thistag);Debug.locals.put("thisTag", _thistag);
 BA.debugLineNum = 261;BA.debugLine="Dim request As String = thisTag.Get(0)";
Debug.ShouldStop(16);
_request = BA.ObjectToString(_thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("request", _request);Debug.locals.put("request", _request);
 BA.debugLineNum = 262;BA.debugLine="Dim action_tagcode As String = thisTag.Get(1)";
Debug.ShouldStop(32);
_action_tagcode = BA.ObjectToString(_thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("action_tagcode", _action_tagcode);Debug.locals.put("action_tagcode", _action_tagcode);
 BA.debugLineNum = 263;BA.debugLine="Dim task_tagcode As String = thisTag.Get(2)";
Debug.ShouldStop(64);
_task_tagcode = BA.ObjectToString(_thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("task_tagcode", _task_tagcode);Debug.locals.put("task_tagcode", _task_tagcode);
 BA.debugLineNum = 264;BA.debugLine="Dim item_tagcode As String = thisTag.Get(3)";
Debug.ShouldStop(128);
_item_tagcode = BA.ObjectToString(_thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3))));Debug.locals.put("item_tagcode", _item_tagcode);Debug.locals.put("item_tagcode", _item_tagcode);
 BA.debugLineNum = 265;BA.debugLine="Dim unique_key As String = thisTag.Get(4)";
Debug.ShouldStop(256);
_unique_key = BA.ObjectToString(_thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 4))));Debug.locals.put("unique_key", _unique_key);Debug.locals.put("unique_key", _unique_key);
 BA.debugLineNum = 266;BA.debugLine="Dim tagcode As String = thisTag.Get(5)";
Debug.ShouldStop(512);
_tagcode = BA.ObjectToString(_thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 5))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 267;BA.debugLine="Dim execute_status As Int = thisTag.Get(6)";
Debug.ShouldStop(1024);
_execute_status = BA.numberCast(int.class, _thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 6))));Debug.locals.put("execute_status", _execute_status);Debug.locals.put("execute_status", _execute_status);
 BA.debugLineNum = 268;BA.debugLine="Dim repeatcounter As Int = thisTag.Get(7)";
Debug.ShouldStop(2048);
_repeatcounter = BA.numberCast(int.class, _thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 7))));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 269;BA.debugLine="Dim repeatitemcounter As Int = thisTag.Get(8)";
Debug.ShouldStop(4096);
_repeatitemcounter = BA.numberCast(int.class, _thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 8))));Debug.locals.put("repeatitemcounter", _repeatitemcounter);Debug.locals.put("repeatitemcounter", _repeatitemcounter);
 BA.debugLineNum = 270;BA.debugLine="Dim repeatfieldcounter As Int = thisTag.Get(9)";
Debug.ShouldStop(8192);
_repeatfieldcounter = BA.numberCast(int.class, _thistag.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 9))));Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e17) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e17.toString()); BA.debugLineNum = 272;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932179",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 273;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(65536);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 279;BA.debugLine="If inStr.Contains(\">=\") Then";
Debug.ShouldStop(4194304);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(">="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 280;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>=\", inStr )";
Debug.ShouldStop(8388608);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\>=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 282;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(33554432);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 283;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(67108864);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 285;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 286;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(536870912);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 287;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(1073741824);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 288;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 289;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(1);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 296;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(128);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e32) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e32.toString()); BA.debugLineNum = 298;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932205",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 299;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(1024);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 303;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 304;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(32768);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 305;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(65536);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 306;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 307;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(262144);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 314;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(33554432);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e43) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e43.toString()); BA.debugLineNum = 316;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932223",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 320;BA.debugLine="ret = (vValues.Get(0) >= vValues.Get(1))";
Debug.ShouldStop(-2147483648);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("g",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 321;BA.debugLine="else If inStr.Contains(\"<=\") Then";
Debug.ShouldStop(1);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 322;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<=\", inStr )";
Debug.ShouldStop(2);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\<=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 324;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(8);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 325;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(16);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 327;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 328;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(128);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 329;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(256);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 330;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 331;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(1024);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 338;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(131072);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e58) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e58.toString()); BA.debugLineNum = 340;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932247",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 341;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(1048576);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 345;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 346;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(33554432);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 347;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(67108864);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 348;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 349;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(268435456);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 356;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(8);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e69) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e69.toString()); BA.debugLineNum = 358;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932265",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 362;BA.debugLine="ret = (vValues.Get(0) <= vValues.Get(1))";
Debug.ShouldStop(512);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("k",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 363;BA.debugLine="else If inStr.Contains(\"!=\") Then";
Debug.ShouldStop(1024);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("!="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 364;BA.debugLine="Dim vValues As List = Regex.Split(\"\\!=\", inStr )";
Debug.ShouldStop(2048);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\!=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 366;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(8192);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 367;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(16384);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 369;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 370;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(131072);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 371;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(262144);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 372;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 373;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(1048576);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 380;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(134217728);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e84) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e84.toString()); BA.debugLineNum = 382;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932289",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 383;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(1073741824);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 387;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 388;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(8);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 389;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(16);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 390;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 391;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(64);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 398;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(8192);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e95) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e95.toString()); BA.debugLineNum = 400;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932307",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 404;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
Debug.ShouldStop(524288);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 405;BA.debugLine="else If inStr.Contains(\"<>\") Then";
Debug.ShouldStop(1048576);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<>"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 406;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<>\", inStr )";
Debug.ShouldStop(2097152);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\<>")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 408;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(8388608);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 409;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(16777216);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 411;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 412;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(134217728);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 413;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(268435456);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 414;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 415;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(1073741824);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 422;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(32);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e110) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e110.toString()); BA.debugLineNum = 424;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932331",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 425;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(256);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 429;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 430;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(8192);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 431;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(16384);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 432;BA.debugLine="Try";
Debug.ShouldStop(32768);
try { BA.debugLineNum = 433;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(65536);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 440;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(8388608);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e121) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e121.toString()); BA.debugLineNum = 442;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932349",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 443;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(67108864);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 447;BA.debugLine="ret = (vValues.Get(0) <> vValues.Get(1))";
Debug.ShouldStop(1073741824);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 448;BA.debugLine="else If inStr.Contains(\"<\") Then";
Debug.ShouldStop(-2147483648);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("<"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 449;BA.debugLine="Dim vValues As List = Regex.Split(\"\\<\", inStr )";
Debug.ShouldStop(1);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\<")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 451;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(4);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 452;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(8);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 454;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 455;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(64);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 456;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(128);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 457;BA.debugLine="Try";
Debug.ShouldStop(256);
try { BA.debugLineNum = 458;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(512);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 465;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(65536);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e137) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e137.toString()); BA.debugLineNum = 467;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932374",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 468;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(524288);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 472;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 473;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(16777216);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 474;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(33554432);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 475;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 476;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(134217728);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 483;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(4);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e148) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e148.toString()); BA.debugLineNum = 485;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932392",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 486;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(32);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 490;BA.debugLine="ret = (vValues.Get(0) < vValues.Get(1))";
Debug.ShouldStop(512);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("<",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 491;BA.debugLine="else If inStr.Contains(\">\") Then";
Debug.ShouldStop(1024);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable(">"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 492;BA.debugLine="Dim vValues As List = Regex.Split(\"\\>\", inStr )";
Debug.ShouldStop(2048);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\>")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 494;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(8192);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 495;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(16384);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 497;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 498;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(131072);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 499;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(262144);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 500;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 501;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(1048576);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 508;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(134217728);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e164) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e164.toString()); BA.debugLineNum = 510;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932417",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 511;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(1073741824);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 515;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 516;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(8);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 517;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(16);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 518;BA.debugLine="Try";
Debug.ShouldStop(32);
try { BA.debugLineNum = 519;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(64);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 526;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(8192);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e175) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e175.toString()); BA.debugLineNum = 528;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932435",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 529;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(65536);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 533;BA.debugLine="ret = (vValues.Get(0) > vValues.Get(1))";
Debug.ShouldStop(1048576);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean(">",BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),BA.numberCast(double.class, _vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 534;BA.debugLine="else If inStr.Contains(\"=\") Then";
Debug.ShouldStop(2097152);
if (_instr.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("="))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 535;BA.debugLine="Dim vValues As List = Regex.Split(\"\\=\", inStr )";
Debug.ShouldStop(4194304);
_vvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_vvalues = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\=")),(Object)(_instr))));Debug.locals.put("vValues", _vvalues);Debug.locals.put("vValues", _vvalues);
 BA.debugLineNum = 537;BA.debugLine="Dim Parcela1 As String = vValues.Get(0)";
Debug.ShouldStop(16777216);
_parcela1 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Parcela1", _parcela1);Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 538;BA.debugLine="Dim Parcela2 As String = vValues.Get(1)";
Debug.ShouldStop(33554432);
_parcela2 = BA.ObjectToString(_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("Parcela2", _parcela2);Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 540;BA.debugLine="If Parcela1.Contains(\"[\") And Parcela1.Contains(";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela1.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 541;BA.debugLine="Parcela1 = Parcela1.Replace(\"[\",\"\")";
Debug.ShouldStop(268435456);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 542;BA.debugLine="Parcela1 = Parcela1.Replace(\"]\",\"\")";
Debug.ShouldStop(536870912);
_parcela1 = _parcela1.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela1", _parcela1);
 BA.debugLineNum = 543;BA.debugLine="Try";
Debug.ShouldStop(1073741824);
try { BA.debugLineNum = 544;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(-2147483648);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela1))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 551;BA.debugLine="vValues.Set(0,val2get)";
Debug.ShouldStop(64);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 0)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e191) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e191.toString()); BA.debugLineNum = 553;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932460",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 554;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(512);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 558;BA.debugLine="If Parcela2.Contains(\"[\") And Parcela2.Contains(";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("[")))) && RemoteObject.solveBoolean(".",_parcela2.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("]"))))) { 
 BA.debugLineNum = 559;BA.debugLine="Parcela2 = Parcela2.Replace(\"[\",\"\")";
Debug.ShouldStop(16384);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("[")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 560;BA.debugLine="Parcela2 = Parcela2.Replace(\"]\",\"\")";
Debug.ShouldStop(32768);
_parcela2 = _parcela2.runMethod(true,"replace",(Object)(BA.ObjectToString("]")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Parcela2", _parcela2);
 BA.debugLineNum = 561;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 562;BA.debugLine="Dim val2get As String = DBStructures.GetScript";
Debug.ShouldStop(131072);
_val2get = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_value from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("				and request_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				and task_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And item_tagcode = '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parcela2))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("				And repeatcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				and repeatfieldcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("				And repeatitemcounter = "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("execute_value")));Debug.locals.put("val2get", _val2get);Debug.locals.put("val2get", _val2get);
 BA.debugLineNum = 569;BA.debugLine="vValues.Set(1,val2get)";
Debug.ShouldStop(16777216);
_vvalues.runVoidMethod ("Set",(Object)(BA.numberCast(int.class, 1)),(Object)((_val2get)));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e202) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e202.toString()); BA.debugLineNum = 571;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","63932478",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 572;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(134217728);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 576;BA.debugLine="ret = (vValues.Get(0) = vValues.Get(1))";
Debug.ShouldStop(-2147483648);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_vvalues.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }}}}}}}
;
 BA.debugLineNum = 578;BA.debugLine="Return ret";
Debug.ShouldStop(2);
if (true) return _ret;
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _concatwith(RemoteObject _ba,RemoteObject _base,RemoteObject _newstr,RemoteObject _divider) throws Exception{
try {
		Debug.PushSubsStack("concatWith (utils) ","utils",3,_ba,utils.mostCurrent,655);
if (RapidSub.canDelegate("concatwith")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","concatwith", _ba, _base, _newstr, _divider);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("base", _base);
Debug.locals.put("newstr", _newstr);
Debug.locals.put("divider", _divider);
 BA.debugLineNum = 655;BA.debugLine="Sub concatWith(base As String, newstr As String, d";
Debug.ShouldStop(16384);
 BA.debugLineNum = 656;BA.debugLine="Dim ret As String = base";
Debug.ShouldStop(32768);
_ret = _base;Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 657;BA.debugLine="If NNE(newstr) Then";
Debug.ShouldStop(65536);
if (_nne(_ba,_newstr).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 660;BA.debugLine="ret = $\"${ret}${IfTrue(NE(ret), \"\", divider)}${n";
Debug.ShouldStop(524288);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ret))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_iftrue(_ba,_ne(_ba,_ret),BA.ObjectToString(""),_divider)))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newstr))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 662;BA.debugLine="Return ret";
Debug.ShouldStop(2097152);
if (true) return _ret;
 BA.debugLineNum = 663;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertimage(RemoteObject _ba,RemoteObject _image,RemoteObject _imagecounter,RemoteObject _percent) throws Exception{
try {
		Debug.PushSubsStack("ConvertImage (utils) ","utils",3,_ba,utils.mostCurrent,960);
if (RapidSub.canDelegate("convertimage")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","convertimage", _ba, _image, _imagecounter, _percent);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _abcfile = RemoteObject.createImmutable("");
RemoteObject _deffile = RemoteObject.createImmutable("");
RemoteObject _bw = RemoteObject.createImmutable(0);
RemoteObject _bh = RemoteObject.createImmutable(0);
RemoteObject _newbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
;
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("percent", _percent);
 BA.debugLineNum = 960;BA.debugLine="Sub ConvertImage(image As String, ImageCounter As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 961;BA.debugLine="Dim bmp As B4XBitmap = B64ToBitmap(image)";
Debug.ShouldStop(1);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _b64tobitmap(_ba,_image);Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 962;BA.debugLine="Dim abcFile As String = $\"ABC${ImageCounter}.png\"";
Debug.ShouldStop(2);
_abcfile = (RemoteObject.concat(RemoteObject.createImmutable("ABC"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("abcFile", _abcfile);Debug.locals.put("abcFile", _abcfile);
 BA.debugLineNum = 963;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
Debug.ShouldStop(4);
_deffile = (RemoteObject.concat(RemoteObject.createImmutable("DEF"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("defFile", _deffile);Debug.locals.put("defFile", _deffile);
 BA.debugLineNum = 965;BA.debugLine="Bitmap2File(bmp, Starter.SharedFolder, abcFile)";
Debug.ShouldStop(16);
_bitmap2file(_ba,_bmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_abcfile);
 BA.debugLineNum = 970;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
Debug.ShouldStop(512);
_bw = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 971;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
Debug.ShouldStop(1024);
_bh = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bh", _bh);Debug.locals.put("bh", _bh);
 BA.debugLineNum = 972;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapSample(Starte";
Debug.ShouldStop(2048);
_newbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_newbmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), utils.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(utils.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_abcfile),(Object)(_bw),(Object)(_bh)).getObject());Debug.locals.put("newbmp", _newbmp);
 BA.debugLineNum = 973;BA.debugLine="Bitmap2File(newbmp, Starter.Provider.SharedFolder";
Debug.ShouldStop(4096);
_bitmap2file(_ba,_newbmp,utils.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ),_deffile);
 BA.debugLineNum = 975;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(16384);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 975;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(16384);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 976;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
Debug.ShouldStop(32768);
_image = _base64con.runMethod(true,"_v6",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 980;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, abcFil";
Debug.ShouldStop(524288);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_abcfile));
 BA.debugLineNum = 981;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, defFil";
Debug.ShouldStop(1048576);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deffile));
 BA.debugLineNum = 982;BA.debugLine="Return image";
Debug.ShouldStop(2097152);
if (true) return _image;
 BA.debugLineNum = 983;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertimagefromfile(RemoteObject _ba,RemoteObject _image,RemoteObject _imagecounter,RemoteObject _percent) throws Exception{
try {
		Debug.PushSubsStack("ConvertImageFromFile (utils) ","utils",3,_ba,utils.mostCurrent,985);
if (RapidSub.canDelegate("convertimagefromfile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","convertimagefromfile", _ba, _image, _imagecounter, _percent);}
RemoteObject _deffile = RemoteObject.createImmutable("");
RemoteObject _bw = RemoteObject.createImmutable(0);
RemoteObject _bh = RemoteObject.createImmutable(0);
RemoteObject _newbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
;
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("percent", _percent);
 BA.debugLineNum = 985;BA.debugLine="Sub ConvertImageFromFile(image As String, ImageCou";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 988;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
Debug.ShouldStop(134217728);
_deffile = (RemoteObject.concat(RemoteObject.createImmutable("DEF"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("defFile", _deffile);Debug.locals.put("defFile", _deffile);
 BA.debugLineNum = 990;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
Debug.ShouldStop(536870912);
_bw = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 991;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
Debug.ShouldStop(1073741824);
_bh = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bh", _bh);Debug.locals.put("bh", _bh);
 BA.debugLineNum = 992;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapSample(Starte";
Debug.ShouldStop(-2147483648);
_newbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_newbmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), utils.mostCurrent.__c.runMethod(false,"LoadBitmapSample",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_image),(Object)(_bw),(Object)(_bh)).getObject());Debug.locals.put("newbmp", _newbmp);
 BA.debugLineNum = 993;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
Debug.ShouldStop(1);
_bitmap2file(_ba,_newbmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_deffile);
 BA.debugLineNum = 995;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(4);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 995;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(4);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 996;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
Debug.ShouldStop(8);
_image = _base64con.runMethod(true,"_v6",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 1000;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
Debug.ShouldStop(128);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));
 BA.debugLineNum = 1001;BA.debugLine="Return image";
Debug.ShouldStop(256);
if (true) return _image;
 BA.debugLineNum = 1002;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertimagesize(RemoteObject _ba,RemoteObject _image,RemoteObject _imagecounter,RemoteObject _percent) throws Exception{
try {
		Debug.PushSubsStack("ConvertImageSize (utils) ","utils",3,_ba,utils.mostCurrent,892);
if (RapidSub.canDelegate("convertimagesize")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","convertimagesize", _ba, _image, _imagecounter, _percent);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _abcfile = RemoteObject.createImmutable("");
RemoteObject _deffile = RemoteObject.createImmutable("");
RemoteObject _bw = RemoteObject.createImmutable(0);
RemoteObject _bh = RemoteObject.createImmutable(0);
RemoteObject _newbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
;
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("percent", _percent);
 BA.debugLineNum = 892;BA.debugLine="Sub ConvertImageSize(image As String, ImageCounter";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 893;BA.debugLine="Dim bmp As B4XBitmap = B64ToBitmap(image)";
Debug.ShouldStop(268435456);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _b64tobitmap(_ba,_image);Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 894;BA.debugLine="Dim abcFile As String = $\"ABC${ImageCounter}.png\"";
Debug.ShouldStop(536870912);
_abcfile = (RemoteObject.concat(RemoteObject.createImmutable("ABC"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("abcFile", _abcfile);Debug.locals.put("abcFile", _abcfile);
 BA.debugLineNum = 895;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
Debug.ShouldStop(1073741824);
_deffile = (RemoteObject.concat(RemoteObject.createImmutable("DEF"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("defFile", _deffile);Debug.locals.put("defFile", _deffile);
 BA.debugLineNum = 896;BA.debugLine="Bitmap2File(bmp, Starter.SharedFolder, abcFile)";
Debug.ShouldStop(-2147483648);
_bitmap2file(_ba,_bmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_abcfile);
 BA.debugLineNum = 897;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
Debug.ShouldStop(1);
_bw = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 898;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
Debug.ShouldStop(2);
_bh = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bh", _bh);Debug.locals.put("bh", _bh);
 BA.debugLineNum = 899;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
Debug.ShouldStop(4);
_newbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_newbmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), utils.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_abcfile),(Object)(_bw),(Object)(_bh),(Object)(utils.mostCurrent.__c.getField(true,"True"))).getObject());Debug.locals.put("newbmp", _newbmp);
 BA.debugLineNum = 900;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
Debug.ShouldStop(8);
_bitmap2file(_ba,_newbmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_deffile);
 BA.debugLineNum = 902;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(32);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 902;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(32);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 903;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
Debug.ShouldStop(64);
_image = _base64con.runMethod(true,"_v6",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 907;BA.debugLine="File.Delete(Starter.SharedFolder, abcFile)";
Debug.ShouldStop(1024);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_abcfile));
 BA.debugLineNum = 908;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
Debug.ShouldStop(2048);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));
 BA.debugLineNum = 909;BA.debugLine="Return image";
Debug.ShouldStop(4096);
if (true) return _image;
 BA.debugLineNum = 910;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertimagesizefromfile(RemoteObject _ba,RemoteObject _image,RemoteObject _imagecounter,RemoteObject _percent) throws Exception{
try {
		Debug.PushSubsStack("ConvertImageSizeFromFile (utils) ","utils",3,_ba,utils.mostCurrent,912);
if (RapidSub.canDelegate("convertimagesizefromfile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","convertimagesizefromfile", _ba, _image, _imagecounter, _percent);}
RemoteObject _deffile = RemoteObject.createImmutable("");
RemoteObject _bw = RemoteObject.createImmutable(0);
RemoteObject _bh = RemoteObject.createImmutable(0);
RemoteObject _newbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
;
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("percent", _percent);
 BA.debugLineNum = 912;BA.debugLine="Sub ConvertImageSizeFromFile(image As String, Imag";
Debug.ShouldStop(32768);
 BA.debugLineNum = 913;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
Debug.ShouldStop(65536);
_deffile = (RemoteObject.concat(RemoteObject.createImmutable("DEF"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("defFile", _deffile);Debug.locals.put("defFile", _deffile);
 BA.debugLineNum = 914;BA.debugLine="Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH -";
Debug.ShouldStop(131072);
_bw = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_width /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bw", _bw);Debug.locals.put("bw", _bw);
 BA.debugLineNum = 915;BA.debugLine="Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT -";
Debug.ShouldStop(262144);
_bh = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._sharecode._device_def_img_height /*RemoteObject*/ ,_percent}, "/",0, 0))}, "-",1, 0));Debug.locals.put("bh", _bh);Debug.locals.put("bh", _bh);
 BA.debugLineNum = 916;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
Debug.ShouldStop(524288);
_newbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_newbmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), utils.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_image),(Object)(_bw),(Object)(_bh),(Object)(utils.mostCurrent.__c.getField(true,"True"))).getObject());Debug.locals.put("newbmp", _newbmp);
 BA.debugLineNum = 917;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
Debug.ShouldStop(1048576);
_bitmap2file(_ba,_newbmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_deffile);
 BA.debugLineNum = 919;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(4194304);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 919;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(4194304);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 920;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
Debug.ShouldStop(8388608);
_image = _base64con.runMethod(true,"_v6",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 924;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));
 BA.debugLineNum = 925;BA.debugLine="Return image";
Debug.ShouldStop(268435456);
if (true) return _image;
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertimagesizefromfilewh(RemoteObject _ba,RemoteObject _image,RemoteObject _imagecounter,RemoteObject _bw,RemoteObject _bh) throws Exception{
try {
		Debug.PushSubsStack("ConvertImageSizeFromFileWH (utils) ","utils",3,_ba,utils.mostCurrent,946);
if (RapidSub.canDelegate("convertimagesizefromfilewh")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","convertimagesizefromfilewh", _ba, _image, _imagecounter, _bw, _bh);}
RemoteObject _deffile = RemoteObject.createImmutable("");
RemoteObject _newbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
;
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("bw", _bw);
Debug.locals.put("bh", _bh);
 BA.debugLineNum = 946;BA.debugLine="Sub ConvertImageSizeFromFileWH(image As String, Im";
Debug.ShouldStop(131072);
 BA.debugLineNum = 947;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
Debug.ShouldStop(262144);
_deffile = (RemoteObject.concat(RemoteObject.createImmutable("DEF"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("defFile", _deffile);Debug.locals.put("defFile", _deffile);
 BA.debugLineNum = 948;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
Debug.ShouldStop(524288);
_newbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_newbmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), utils.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_image),(Object)(_bw),(Object)(_bh),(Object)(utils.mostCurrent.__c.getField(true,"True"))).getObject());Debug.locals.put("newbmp", _newbmp);
 BA.debugLineNum = 949;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
Debug.ShouldStop(1048576);
_bitmap2file(_ba,_newbmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_deffile);
 BA.debugLineNum = 951;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(4194304);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 951;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(4194304);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 952;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
Debug.ShouldStop(8388608);
_image = _base64con.runMethod(true,"_v6",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 956;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));
 BA.debugLineNum = 957;BA.debugLine="Return image";
Debug.ShouldStop(268435456);
if (true) return _image;
 BA.debugLineNum = 958;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertimagesizewh(RemoteObject _ba,RemoteObject _image,RemoteObject _imagecounter,RemoteObject _bw,RemoteObject _bh) throws Exception{
try {
		Debug.PushSubsStack("ConvertImageSizeWH (utils) ","utils",3,_ba,utils.mostCurrent,928);
if (RapidSub.canDelegate("convertimagesizewh")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","convertimagesizewh", _ba, _image, _imagecounter, _bw, _bh);}
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _abcfile = RemoteObject.createImmutable("");
RemoteObject _deffile = RemoteObject.createImmutable("");
RemoteObject _newbmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _base64con = RemoteObject.declareNull("com.simplysoftware.base64convert.base64convert");
;
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("bw", _bw);
Debug.locals.put("bh", _bh);
 BA.debugLineNum = 928;BA.debugLine="Sub ConvertImageSizeWH(image As String, ImageCount";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 929;BA.debugLine="Dim bmp As B4XBitmap = B64ToBitmap(image)";
Debug.ShouldStop(1);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_bmp = _b64tobitmap(_ba,_image);Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 930;BA.debugLine="Dim abcFile As String = $\"ABC${ImageCounter}.png\"";
Debug.ShouldStop(2);
_abcfile = (RemoteObject.concat(RemoteObject.createImmutable("ABC"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("abcFile", _abcfile);Debug.locals.put("abcFile", _abcfile);
 BA.debugLineNum = 931;BA.debugLine="Dim defFile As String = $\"DEF${ImageCounter}.png\"";
Debug.ShouldStop(4);
_deffile = (RemoteObject.concat(RemoteObject.createImmutable("DEF"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_imagecounter))),RemoteObject.createImmutable(".png")));Debug.locals.put("defFile", _deffile);Debug.locals.put("defFile", _deffile);
 BA.debugLineNum = 932;BA.debugLine="Bitmap2File(bmp, Starter.SharedFolder, abcFile)";
Debug.ShouldStop(8);
_bitmap2file(_ba,_bmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_abcfile);
 BA.debugLineNum = 933;BA.debugLine="Dim newbmp As B4XBitmap = LoadBitmapResize(Starte";
Debug.ShouldStop(16);
_newbmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_newbmp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper"), utils.mostCurrent.__c.runMethod(false,"LoadBitmapResize",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_abcfile),(Object)(_bw),(Object)(_bh),(Object)(utils.mostCurrent.__c.getField(true,"True"))).getObject());Debug.locals.put("newbmp", _newbmp);
 BA.debugLineNum = 934;BA.debugLine="Bitmap2File(newbmp, Starter.SharedFolder, defFile";
Debug.ShouldStop(32);
_bitmap2file(_ba,_newbmp,utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ,_deffile);
 BA.debugLineNum = 936;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(128);
_base64con = RemoteObject.createNew ("com.simplysoftware.base64convert.base64convert");Debug.locals.put("Base64Con", _base64con);
 BA.debugLineNum = 936;BA.debugLine="Dim Base64Con As Base64Convert : Base64Con.Initia";
Debug.ShouldStop(128);
_base64con.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 937;BA.debugLine="Dim image As String = Base64Con.EncodeFromImage(S";
Debug.ShouldStop(256);
_image = _base64con.runMethod(true,"_v6",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));Debug.locals.put("image", _image);Debug.locals.put("image", _image);
 BA.debugLineNum = 941;BA.debugLine="File.Delete(Starter.SharedFolder, abcFile)";
Debug.ShouldStop(4096);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_abcfile));
 BA.debugLineNum = 942;BA.debugLine="File.Delete(Starter.SharedFolder, defFile)";
Debug.ShouldStop(8192);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_deffile));
 BA.debugLineNum = 943;BA.debugLine="Return image";
Debug.ShouldStop(16384);
if (true) return _image;
 BA.debugLineNum = 944;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfileprovideruri(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("CreateFileProviderUri (utils) ","utils",3,_ba,utils.mostCurrent,1517);
if (RapidSub.canDelegate("createfileprovideruri")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","createfileprovideruri", _ba, _filename);}
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1517;BA.debugLine="Sub CreateFileProviderUri (FileName As String) As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1519;BA.debugLine="Return Starter.Provider.GetFileUri(FileName)";
Debug.ShouldStop(16384);
if (true) return utils.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename));
 BA.debugLineNum = 1532;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createmapicon(RemoteObject _ba,RemoteObject _counter,RemoteObject _colorstr) throws Exception{
try {
		Debug.PushSubsStack("CreateMapIcon (utils) ","utils",3,_ba,utils.mostCurrent,2216);
if (RapidSub.canDelegate("createmapicon")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","createmapicon", _ba, _counter, _colorstr);}
RemoteObject _pbd = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _cvsrect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _fnt = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _centerx = RemoteObject.createImmutable(0);
RemoteObject _centery = RemoteObject.createImmutable(0);
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
;
Debug.locals.put("Counter", _counter);
Debug.locals.put("ColorStr", _colorstr);
 BA.debugLineNum = 2216;BA.debugLine="Sub CreateMapIcon(Counter As Int, ColorStr As Stri";
Debug.ShouldStop(128);
 BA.debugLineNum = 2218;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(512);
utils._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 2220;BA.debugLine="Dim pbd As Panel";
Debug.ShouldStop(2048);
_pbd = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("pbd", _pbd);
 BA.debugLineNum = 2221;BA.debugLine="pbd.Initialize(\"\")";
Debug.ShouldStop(4096);
_pbd.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2222;BA.debugLine="pbd.Width = 37dip";
Debug.ShouldStop(8192);
_pbd.runMethod(true,"setWidth",utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 2223;BA.debugLine="pbd.Height = 64dip";
Debug.ShouldStop(16384);
_pbd.runMethod(true,"setHeight",utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64))));
 BA.debugLineNum = 2224;BA.debugLine="pbd.SetBackgroundImage(LoadBitmap(File.DirAssets,";
Debug.ShouldStop(32768);
_pbd.runVoidMethod ("SetBackgroundImageNew",(Object)((utils.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(utils.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("p_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colorstr))),RemoteObject.createImmutable(".png"))))).getObject())));
 BA.debugLineNum = 2225;BA.debugLine="Dim cvs As B4XCanvas";
Debug.ShouldStop(65536);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 2226;BA.debugLine="cvs.Initialize(pbd)";
Debug.ShouldStop(131072);
_cvs.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pbd.getObject()));
 BA.debugLineNum = 2227;BA.debugLine="Dim cvsRect As B4XRect";
Debug.ShouldStop(262144);
_cvsrect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("cvsRect", _cvsrect);
 BA.debugLineNum = 2228;BA.debugLine="cvsRect.Initialize(0, 0, 37dip, 37dip)";
Debug.ShouldStop(524288);
_cvsrect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 37))))),(Object)(BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 37))))));
 BA.debugLineNum = 2229;BA.debugLine="Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFA";
Debug.ShouldStop(1048576);
_fnt = utils._xui.runMethod(false,"CreateFont",(Object)(utils.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT")),(Object)(BA.numberCast(float.class, utils.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("fnt", _fnt);Debug.locals.put("fnt", _fnt);
 BA.debugLineNum = 2230;BA.debugLine="Dim CenterX As Int = (cvsRect.left+cvsRect.Right)";
Debug.ShouldStop(2097152);
_centerx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cvsrect.runMethod(true,"getLeft"),_cvsrect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("CenterX", _centerx);Debug.locals.put("CenterX", _centerx);
 BA.debugLineNum = 2231;BA.debugLine="Dim CenterY As Int = (cvsRect.Top+cvsRect.Bottom)";
Debug.ShouldStop(4194304);
_centery = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_cvsrect.runMethod(true,"getTop"),_cvsrect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("CenterY", _centery);Debug.locals.put("CenterY", _centery);
 BA.debugLineNum = 2232;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Counter, fnt)";
Debug.ShouldStop(8388608);
_r = _cvs.runMethod(false,"MeasureText",(Object)(BA.NumberToString(_counter)),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 2233;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
Debug.ShouldStop(16777216);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),_r.runMethod(true,"getTop")}, "-/-",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 2234;BA.debugLine="cvs.DrawText(Counter, CenterX, baseline, fnt, Col";
Debug.ShouldStop(33554432);
_cvs.runVoidMethod ("DrawText",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.NumberToString(_counter)),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 2235;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(67108864);
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 2236;BA.debugLine="Return cvs.CreateBitmap";
Debug.ShouldStop(134217728);
if (true) return _cvs.runMethod(false,"CreateBitmap");
 BA.debugLineNum = 2237;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dashdotline(RemoteObject _ba,RemoteObject _vw,RemoteObject _frompoint,RemoteObject _topoint,RemoteObject _strokewdt,RemoteObject _dotspc,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("dashdotLine (utils) ","utils",3,_ba,utils.mostCurrent,3224);
if (RapidSub.canDelegate("dashdotline")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dashdotline", _ba, _vw, _frompoint, _topoint, _strokewdt, _dotspc, _clr);}
RemoteObject _newpt = null;
RemoteObject _stp = RemoteObject.createImmutable(0);
RemoteObject _blankspc = RemoteObject.createImmutable(0f);
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _lng = RemoteObject.createImmutable(0);
RemoteObject _ct = RemoteObject.createImmutable(0);
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("vw", _vw);
Debug.locals.put("fromPoint", _frompoint);
Debug.locals.put("toPoint", _topoint);
Debug.locals.put("strokeWdt", _strokewdt);
Debug.locals.put("dotSpc", _dotspc);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 3224;BA.debugLine="Public Sub dashdotLine(vw As ImageView, fromPoint";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3225;BA.debugLine="Dim NewPt(3) As PointApi";
Debug.ShouldStop(16777216);
_newpt = RemoteObject.createNewArray ("xevolution.vrcg.devdemov2400.types._pointapi", new int[] {3}, new Object[]{});Debug.locals.put("NewPt", _newpt);
 BA.debugLineNum = 3226;BA.debugLine="Dim stp As Int";
Debug.ShouldStop(33554432);
_stp = RemoteObject.createImmutable(0);Debug.locals.put("stp", _stp);
 BA.debugLineNum = 3227;BA.debugLine="Dim BlankSpc As Float";
Debug.ShouldStop(67108864);
_blankspc = RemoteObject.createImmutable(0f);Debug.locals.put("BlankSpc", _blankspc);
 BA.debugLineNum = 3228;BA.debugLine="Dim Angle, lng As Double";
Debug.ShouldStop(134217728);
_angle = RemoteObject.createImmutable(0);Debug.locals.put("Angle", _angle);
_lng = RemoteObject.createImmutable(0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3229;BA.debugLine="Dim ct As Double";
Debug.ShouldStop(268435456);
_ct = RemoteObject.createImmutable(0);Debug.locals.put("ct", _ct);
 BA.debugLineNum = 3230;BA.debugLine="Dim cvs As Canvas";
Debug.ShouldStop(536870912);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 3231;BA.debugLine="cvs.Initialize(vw)";
Debug.ShouldStop(1073741824);
_cvs.runVoidMethod ("Initialize",(Object)((_vw.getObject())));
 BA.debugLineNum = 3233;BA.debugLine="Dim Obj1 As Reflector";
Debug.ShouldStop(1);
_obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("Obj1", _obj1);
 BA.debugLineNum = 3234;BA.debugLine="Obj1.Target = cvs";
Debug.ShouldStop(2);
_obj1.setField ("Target",(_cvs));
 BA.debugLineNum = 3235;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
Debug.ShouldStop(4);
_obj1.setField ("Target",_obj1.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("paint"))));
 BA.debugLineNum = 3236;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
Debug.ShouldStop(8);
_obj1.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 3238;BA.debugLine="Angle = 90 - CalcAngleD(fromPoint, toPoint)";
Debug.ShouldStop(32);
_angle = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(90),_calcangled(_ba,_frompoint,_topoint)}, "-",1, 0);Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 3239;BA.debugLine="lng = Distance(fromPoint, toPoint)";
Debug.ShouldStop(64);
_lng = BA.numberCast(double.class, _distance(_ba,_frompoint,_topoint));Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3240;BA.debugLine="lng = lng - dotSpc";
Debug.ShouldStop(128);
_lng = RemoteObject.solve(new RemoteObject[] {_lng,_dotspc}, "-",1, 0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3241;BA.debugLine="BlankSpc = dotSpc + strokeWdt";
Debug.ShouldStop(256);
_blankspc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dotspc,_strokewdt}, "+",1, 0));Debug.locals.put("BlankSpc", _blankspc);
 BA.debugLineNum = 3242;BA.debugLine="dotSpc = dotSpc + BlankSpc";
Debug.ShouldStop(512);
_dotspc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dotspc,_blankspc}, "+",1, 0));Debug.locals.put("dotSpc", _dotspc);
 BA.debugLineNum = 3243;BA.debugLine="stp = lng / dotSpc";
Debug.ShouldStop(1024);
_stp = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_lng,_dotspc}, "/",0, 0));Debug.locals.put("stp", _stp);
 BA.debugLineNum = 3244;BA.debugLine="dotSpc = lng / stp";
Debug.ShouldStop(2048);
_dotspc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_lng,_stp}, "/",0, 0));Debug.locals.put("dotSpc", _dotspc);
 BA.debugLineNum = 3245;BA.debugLine="lng = lng - dotSpc / 2";
Debug.ShouldStop(4096);
_lng = RemoteObject.solve(new RemoteObject[] {_lng,_dotspc,RemoteObject.createImmutable(2)}, "-/",1, 0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3246;BA.debugLine="For ct = 0 To lng Step dotSpc";
Debug.ShouldStop(8192);
{
final double step20 = (double) (0 + _dotspc.<Float>get().floatValue());
final double limit20 = _lng.<Double>get().doubleValue();
_ct = BA.numberCast(double.class, 0) ;
for (;(step20 > 0 && _ct.<Double>get().doubleValue() <= limit20) || (step20 < 0 && _ct.<Double>get().doubleValue() >= limit20) ;_ct = RemoteObject.createImmutable((double)(0 + _ct.<Double>get().doubleValue() + step20))  ) {
Debug.locals.put("ct", _ct);
 BA.debugLineNum = 3247;BA.debugLine="NewPt(0).x   = fromPoint.x + ct * SinD(Angle)";
Debug.ShouldStop(16384);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),_ct,utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3248;BA.debugLine="NewPt(0).y = fromPoint.y + ct * CosD(Angle)";
Debug.ShouldStop(32768);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),_ct,utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3249;BA.debugLine="NewPt(1).x = fromPoint.x + (ct + dotSpc - BlankS";
Debug.ShouldStop(65536);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_ct,_dotspc,_blankspc}, "+-",2, 0)),utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3250;BA.debugLine="NewPt(1).y = fromPoint.y + (ct + dotSpc - BlankS";
Debug.ShouldStop(131072);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_ct,_dotspc,_blankspc}, "+-",2, 0)),utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3251;BA.debugLine="NewPt(2).x = fromPoint.x + (ct + dotSpc - BlankS";
Debug.ShouldStop(262144);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_ct,_dotspc,_blankspc,RemoteObject.createImmutable(2)}, "+-/",2, 0)),utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3252;BA.debugLine="NewPt(2).y = fromPoint.y + (ct + dotSpc - BlankS";
Debug.ShouldStop(524288);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_ct,_dotspc,_blankspc,RemoteObject.createImmutable(2)}, "+-/",2, 0)),utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3253;BA.debugLine="cvs.drawline(NewPt(0).x, NewPt(0).y, NewPt(1).x,";
Debug.ShouldStop(1048576);
_cvs.runVoidMethod ("DrawLine",(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(true,"Y" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).getField(true,"Y" /*RemoteObject*/ )),(Object)(_clr),(Object)(_strokewdt));
 BA.debugLineNum = 3254;BA.debugLine="cvs.drawCircle(NewPt(2).x, NewPt(2).y, strokeWdt";
Debug.ShouldStop(2097152);
_cvs.runVoidMethod ("DrawCircle",(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 2)).getField(true,"Y" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_strokewdt,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_clr),(Object)(utils.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("ct", _ct);
;
 BA.debugLineNum = 3256;BA.debugLine="NewPt(0).x = fromPoint.x + ct * SinD(Angle)";
Debug.ShouldStop(8388608);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),_ct,utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3257;BA.debugLine="NewPt(0).y = fromPoint.y + ct * CosD(Angle)";
Debug.ShouldStop(16777216);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),_ct,utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3258;BA.debugLine="cvs.drawline(NewPt(0).x, NewPt(0).y, toPoint.x, t";
Debug.ShouldStop(33554432);
_cvs.runVoidMethod ("DrawLine",(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(true,"Y" /*RemoteObject*/ )),(Object)(_topoint.getField(true,"X" /*RemoteObject*/ )),(Object)(_topoint.getField(true,"Y" /*RemoteObject*/ )),(Object)(_clr),(Object)(_strokewdt));
 BA.debugLineNum = 3259;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dashline(RemoteObject _ba,RemoteObject _vw,RemoteObject _frompoint,RemoteObject _topoint,RemoteObject _strokewdt,RemoteObject _dotspc,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("dashLine (utils) ","utils",3,_ba,utils.mostCurrent,3190);
if (RapidSub.canDelegate("dashline")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dashline", _ba, _vw, _frompoint, _topoint, _strokewdt, _dotspc, _clr);}
RemoteObject _newpt = null;
RemoteObject _stp = RemoteObject.createImmutable(0);
RemoteObject _blankspc = RemoteObject.createImmutable(0f);
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _lng = RemoteObject.createImmutable(0);
RemoteObject _ct = RemoteObject.createImmutable(0);
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("vw", _vw);
Debug.locals.put("fromPoint", _frompoint);
Debug.locals.put("toPoint", _topoint);
Debug.locals.put("strokeWdt", _strokewdt);
Debug.locals.put("dotSpc", _dotspc);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 3190;BA.debugLine="Public Sub dashLine(vw As ImageView, fromPoint As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3191;BA.debugLine="Dim NewPt(2) As PointApi";
Debug.ShouldStop(4194304);
_newpt = RemoteObject.createNewArray ("xevolution.vrcg.devdemov2400.types._pointapi", new int[] {2}, new Object[]{});Debug.locals.put("NewPt", _newpt);
 BA.debugLineNum = 3192;BA.debugLine="Dim stp As Int";
Debug.ShouldStop(8388608);
_stp = RemoteObject.createImmutable(0);Debug.locals.put("stp", _stp);
 BA.debugLineNum = 3193;BA.debugLine="Dim BlankSpc As Float = 1.75	'Percent";
Debug.ShouldStop(16777216);
_blankspc = BA.numberCast(float.class, 1.75);Debug.locals.put("BlankSpc", _blankspc);Debug.locals.put("BlankSpc", _blankspc);
 BA.debugLineNum = 3194;BA.debugLine="Dim Angle, lng As Double";
Debug.ShouldStop(33554432);
_angle = RemoteObject.createImmutable(0);Debug.locals.put("Angle", _angle);
_lng = RemoteObject.createImmutable(0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3195;BA.debugLine="Dim ct As Double";
Debug.ShouldStop(67108864);
_ct = RemoteObject.createImmutable(0);Debug.locals.put("ct", _ct);
 BA.debugLineNum = 3196;BA.debugLine="Dim cvs As Canvas";
Debug.ShouldStop(134217728);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 3197;BA.debugLine="cvs.Initialize(vw)";
Debug.ShouldStop(268435456);
_cvs.runVoidMethod ("Initialize",(Object)((_vw.getObject())));
 BA.debugLineNum = 3199;BA.debugLine="Dim Obj1 As Reflector";
Debug.ShouldStop(1073741824);
_obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("Obj1", _obj1);
 BA.debugLineNum = 3200;BA.debugLine="Obj1.Target = cvs";
Debug.ShouldStop(-2147483648);
_obj1.setField ("Target",(_cvs));
 BA.debugLineNum = 3201;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
Debug.ShouldStop(1);
_obj1.setField ("Target",_obj1.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("paint"))));
 BA.debugLineNum = 3202;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
Debug.ShouldStop(2);
_obj1.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 3204;BA.debugLine="Angle = 90 - CalcAngleD(fromPoint, toPoint)";
Debug.ShouldStop(8);
_angle = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(90),_calcangled(_ba,_frompoint,_topoint)}, "-",1, 0);Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 3205;BA.debugLine="lng = Distance(fromPoint, toPoint)";
Debug.ShouldStop(16);
_lng = BA.numberCast(double.class, _distance(_ba,_frompoint,_topoint));Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3206;BA.debugLine="If lng < dotSpc * 2.75 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("<",_lng,RemoteObject.solve(new RemoteObject[] {_dotspc,RemoteObject.createImmutable(2.75)}, "*",0, 0))) { 
 BA.debugLineNum = 3207;BA.debugLine="cvs.drawline(fromPoint.x, fromPoint.y, toPoint.x";
Debug.ShouldStop(64);
_cvs.runVoidMethod ("DrawLine",(Object)(_frompoint.getField(true,"X" /*RemoteObject*/ )),(Object)(_frompoint.getField(true,"Y" /*RemoteObject*/ )),(Object)(_topoint.getField(true,"X" /*RemoteObject*/ )),(Object)(_topoint.getField(true,"Y" /*RemoteObject*/ )),(Object)(_clr),(Object)(_strokewdt));
 BA.debugLineNum = 3208;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 3210;BA.debugLine="lng = lng - dotSpc";
Debug.ShouldStop(512);
_lng = RemoteObject.solve(new RemoteObject[] {_lng,_dotspc}, "-",1, 0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3211;BA.debugLine="dotSpc = dotSpc * BlankSpc";
Debug.ShouldStop(1024);
_dotspc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_dotspc,_blankspc}, "*",0, 0));Debug.locals.put("dotSpc", _dotspc);
 BA.debugLineNum = 3212;BA.debugLine="stp = lng / dotSpc";
Debug.ShouldStop(2048);
_stp = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_lng,_dotspc}, "/",0, 0));Debug.locals.put("stp", _stp);
 BA.debugLineNum = 3213;BA.debugLine="dotSpc = lng / stp";
Debug.ShouldStop(4096);
_dotspc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_lng,_stp}, "/",0, 0));Debug.locals.put("dotSpc", _dotspc);
 BA.debugLineNum = 3214;BA.debugLine="lng = lng + dotSpc / 2";
Debug.ShouldStop(8192);
_lng = RemoteObject.solve(new RemoteObject[] {_lng,_dotspc,RemoteObject.createImmutable(2)}, "+/",1, 0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3215;BA.debugLine="For ct = 0 To lng Step dotSpc";
Debug.ShouldStop(16384);
{
final double step23 = (double) (0 + _dotspc.<Float>get().floatValue());
final double limit23 = _lng.<Double>get().doubleValue();
_ct = BA.numberCast(double.class, 0) ;
for (;(step23 > 0 && _ct.<Double>get().doubleValue() <= limit23) || (step23 < 0 && _ct.<Double>get().doubleValue() >= limit23) ;_ct = RemoteObject.createImmutable((double)(0 + _ct.<Double>get().doubleValue() + step23))  ) {
Debug.locals.put("ct", _ct);
 BA.debugLineNum = 3216;BA.debugLine="NewPt(0).x   = fromPoint.x + ct * SinD(Angle)";
Debug.ShouldStop(32768);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),_ct,utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3217;BA.debugLine="NewPt(0).y = fromPoint.y + ct * CosD(Angle)";
Debug.ShouldStop(65536);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),_ct,utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3218;BA.debugLine="NewPt(1).x = fromPoint.x + (ct+dotSpc/BlankSpc)";
Debug.ShouldStop(131072);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_ct,_dotspc,_blankspc}, "+/",1, 0)),utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3219;BA.debugLine="NewPt(1).y =  fromPoint.y + (ct+dotSpc/BlankSpc)";
Debug.ShouldStop(262144);
_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_ct,_dotspc,_blankspc}, "+/",1, 0)),utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+*",1, 0)));
 BA.debugLineNum = 3220;BA.debugLine="cvs.drawline(NewPt(0).x, NewPt(0).y,NewPt(1).x,";
Debug.ShouldStop(524288);
_cvs.runVoidMethod ("DrawLine",(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 0)).getField(true,"Y" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getArrayElement(false, /*RemoteObject*/ BA.numberCast(int.class, 1)).getField(true,"Y" /*RemoteObject*/ )),(Object)(_clr),(Object)(_strokewdt));
 }
}Debug.locals.put("ct", _ct);
;
 BA.debugLineNum = 3222;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbdatacount(RemoteObject _ba,RemoteObject _dbsql,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("DBDataCount (utils) ","utils",3,_ba,utils.mostCurrent,1710);
if (RapidSub.canDelegate("dbdatacount")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dbdatacount", _ba, _dbsql, _script);}
RemoteObject _val = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("DBSQL", _dbsql);
Debug.locals.put("script", _script);
 BA.debugLineNum = 1710;BA.debugLine="Sub DBDataCount(DBSQL As SQL, script As String) As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1720;BA.debugLine="Dim val As Int = 0";
Debug.ShouldStop(8388608);
_val = BA.numberCast(int.class, 0);Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1721;BA.debugLine="Dim Record As ResultSet";
Debug.ShouldStop(16777216);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1722;BA.debugLine="Record = DBSQL.ExecQuery(script)";
Debug.ShouldStop(33554432);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _dbsql.runMethod(false,"ExecQuery",(Object)(_script)));
 BA.debugLineNum = 1723;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(67108864);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1724;BA.debugLine="val = Record.GetInt(\"COUNTER\")";
Debug.ShouldStop(134217728);
_val = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("COUNTER")));Debug.locals.put("val", _val);
 }
;
 BA.debugLineNum = 1726;BA.debugLine="Record.Close";
Debug.ShouldStop(536870912);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1727;BA.debugLine="Return val";
Debug.ShouldStop(1073741824);
if (true) return _val;
 BA.debugLineNum = 1728;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dbdataexists(RemoteObject _ba,RemoteObject _dbsql,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("DBDataExists (utils) ","utils",3,_ba,utils.mostCurrent,1698);
if (RapidSub.canDelegate("dbdataexists")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dbdataexists", _ba, _dbsql, _script);}
RemoteObject _val = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _hasdata = RemoteObject.createImmutable(false);
;
Debug.locals.put("DBSQL", _dbsql);
Debug.locals.put("script", _script);
 BA.debugLineNum = 1698;BA.debugLine="Sub DBDataExists(DBSQL As SQL, script As String) A";
Debug.ShouldStop(2);
 BA.debugLineNum = 1699;BA.debugLine="Dim val As Int = 0";
Debug.ShouldStop(4);
_val = BA.numberCast(int.class, 0);Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 1700;BA.debugLine="Dim Record As ResultSet";
Debug.ShouldStop(8);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1701;BA.debugLine="Record = DBSQL.ExecQuery(script)";
Debug.ShouldStop(16);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), _dbsql.runMethod(false,"ExecQuery",(Object)(_script)));
 BA.debugLineNum = 1702;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(32);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1703;BA.debugLine="val = val + 1";
Debug.ShouldStop(64);
_val = RemoteObject.solve(new RemoteObject[] {_val,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("val", _val);
 }
;
 BA.debugLineNum = 1705;BA.debugLine="Dim hasData As Boolean = val >= 1";
Debug.ShouldStop(256);
_hasdata = BA.ObjectToBoolean(RemoteObject.solveBoolean("g",_val,BA.numberCast(double.class, 1)));Debug.locals.put("hasData", _hasdata);Debug.locals.put("hasData", _hasdata);
 BA.debugLineNum = 1706;BA.debugLine="Record.Close";
Debug.ShouldStop(512);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1707;BA.debugLine="Return hasData";
Debug.ShouldStop(1024);
if (true) return _hasdata;
 BA.debugLineNum = 1708;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _decimal(RemoteObject _ba,RemoteObject _value,RemoteObject _decimalplaces) throws Exception{
try {
		Debug.PushSubsStack("Decimal (utils) ","utils",3,_ba,utils.mostCurrent,1843);
if (RapidSub.canDelegate("decimal")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","decimal", _ba, _value, _decimalplaces);}
RemoteObject _multiplier = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
;
Debug.locals.put("value", _value);
Debug.locals.put("decimalPlaces", _decimalplaces);
 BA.debugLineNum = 1843;BA.debugLine="Sub Decimal(value As Double, decimalPlaces As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1844;BA.debugLine="Dim multiplier = Power(10, decimalPlaces) As Int";
Debug.ShouldStop(524288);
_multiplier = BA.numberCast(int.class, utils.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, _decimalplaces))));Debug.locals.put("multiplier", _multiplier);Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 1845;BA.debugLine="Dim result = value * multiplier As Int";
Debug.ShouldStop(1048576);
_result = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_value,_multiplier}, "*",0, 0));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 1846;BA.debugLine="Return (result / multiplier)";
Debug.ShouldStop(2097152);
if (true) return (RemoteObject.solve(new RemoteObject[] {_result,_multiplier}, "/",0, 0));
 BA.debugLineNum = 1847;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deviceinfo(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DeviceInfo (utils) ","utils",3,_ba,utils.mostCurrent,1989);
if (RapidSub.canDelegate("deviceinfo")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","deviceinfo", _ba);}
RemoteObject _devicescreensize = RemoteObject.createImmutable(0);
RemoteObject _strdevicetype = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 1989;BA.debugLine="Sub DeviceInfo As DeviceInformation";
Debug.ShouldStop(16);
 BA.debugLineNum = 1990;BA.debugLine="Dim DevicescreenSize As Int = DeviceType";
Debug.ShouldStop(32);
_devicescreensize = _devicetype(_ba);Debug.locals.put("DevicescreenSize", _devicescreensize);Debug.locals.put("DevicescreenSize", _devicescreensize);
 BA.debugLineNum = 1991;BA.debugLine="Dim StrDeviceType As String = \"Tablet\"";
Debug.ShouldStop(64);
_strdevicetype = BA.ObjectToString("Tablet");Debug.locals.put("StrDeviceType", _strdevicetype);Debug.locals.put("StrDeviceType", _strdevicetype);
 BA.debugLineNum = 1992;BA.debugLine="If DevicescreenSize < 7 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",_devicescreensize,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 1993;BA.debugLine="StrDeviceType = \"Smart Phone\"";
Debug.ShouldStop(256);
_strdevicetype = BA.ObjectToString("Smart Phone");Debug.locals.put("StrDeviceType", _strdevicetype);
 };
 BA.debugLineNum = 1995;BA.debugLine="Return Types.MakeDeviceInformation(StrDeviceType,";
Debug.ShouldStop(1024);
if (true) return utils.mostCurrent._types.runMethod(false,"_makedeviceinformation" /*RemoteObject*/ ,_ba,(Object)(_strdevicetype),(Object)(_devicescreensize),(Object)(_hasfeature(_ba,RemoteObject.createImmutable("android.hardware.telephony"))));
 BA.debugLineNum = 1996;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deviceinfostring(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DeviceInfoString (utils) ","utils",3,_ba,utils.mostCurrent,2016);
if (RapidSub.canDelegate("deviceinfostring")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","deviceinfostring", _ba);}
RemoteObject _devicescreensize = RemoteObject.createImmutable(0);
RemoteObject _strdevicetype = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 2016;BA.debugLine="Sub DeviceInfoString As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 2017;BA.debugLine="Dim DevicescreenSize As Int = 0";
Debug.ShouldStop(1);
_devicescreensize = BA.numberCast(int.class, 0);Debug.locals.put("DevicescreenSize", _devicescreensize);Debug.locals.put("DevicescreenSize", _devicescreensize);
 BA.debugLineNum = 2018;BA.debugLine="Dim StrDeviceType As String = \"\"";
Debug.ShouldStop(2);
_strdevicetype = BA.ObjectToString("");Debug.locals.put("StrDeviceType", _strdevicetype);Debug.locals.put("StrDeviceType", _strdevicetype);
 BA.debugLineNum = 2019;BA.debugLine="DevicescreenSize = DeviceType";
Debug.ShouldStop(4);
_devicescreensize = _devicetype(_ba);Debug.locals.put("DevicescreenSize", _devicescreensize);
 BA.debugLineNum = 2020;BA.debugLine="If DevicescreenSize < 7 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_devicescreensize,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 2021;BA.debugLine="StrDeviceType = \"Smart Phone\"";
Debug.ShouldStop(16);
_strdevicetype = BA.ObjectToString("Smart Phone");Debug.locals.put("StrDeviceType", _strdevicetype);
 }else {
 BA.debugLineNum = 2023;BA.debugLine="StrDeviceType = \"Tablet\"";
Debug.ShouldStop(64);
_strdevicetype = BA.ObjectToString("Tablet");Debug.locals.put("StrDeviceType", _strdevicetype);
 };
 BA.debugLineNum = 2025;BA.debugLine="Return \"Device= \" & StrDeviceType & CRLF & \"Scree";
Debug.ShouldStop(256);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("Device= "),_strdevicetype,utils.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Screen Size= "),_devicescreensize,utils.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Telephony capable= "),_hasfeature(_ba,RemoteObject.createImmutable("android.hardware.telephony")));
 BA.debugLineNum = 2026;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _devicetype(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DeviceType (utils) ","utils",3,_ba,utils.mostCurrent,2028);
if (RapidSub.canDelegate("devicetype")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","devicetype", _ba);}
;
 BA.debugLineNum = 2028;BA.debugLine="Sub DeviceType As Int";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2029;BA.debugLine="Return Ceil(GetDeviceLayoutValues.ApproximateScre";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(int.class, utils.mostCurrent.__c.runMethod(true,"Ceil",(Object)(utils.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",_ba).runMethod(true,"getApproximateScreenSize"))));
 BA.debugLineNum = 2030;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _displaygetrotation(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("DisplayGetRotation (utils) ","utils",3,_ba,utils.mostCurrent,1891);
if (RapidSub.canDelegate("displaygetrotation")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","displaygetrotation", _ba);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
 BA.debugLineNum = 1891;BA.debugLine="Sub DisplayGetRotation As Int";
Debug.ShouldStop(4);
 BA.debugLineNum = 1892;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(8);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 1893;BA.debugLine="r.Target = r.GetActivity";
Debug.ShouldStop(16);
_r.setField ("Target",(_r.runMethod(false,"GetActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 1894;BA.debugLine="r.Target = r.RunMethod(\"getWindowManager\")";
Debug.ShouldStop(32);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getWindowManager"))));
 BA.debugLineNum = 1895;BA.debugLine="r.Target = r.RunMethod(\"getDefaultDisplay\")";
Debug.ShouldStop(64);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getDefaultDisplay"))));
 BA.debugLineNum = 1896;BA.debugLine="Return r.RunMethod(\"getRotation\")";
Debug.ShouldStop(128);
if (true) return BA.numberCast(int.class, _r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getRotation"))));
 BA.debugLineNum = 1897;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _distance(RemoteObject _ba,RemoteObject _frompoint,RemoteObject _topoint) throws Exception{
try {
		Debug.PushSubsStack("Distance (utils) ","utils",3,_ba,utils.mostCurrent,3137);
if (RapidSub.canDelegate("distance")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","distance", _ba, _frompoint, _topoint);}
RemoteObject _d = RemoteObject.createImmutable(0f);
;
Debug.locals.put("fromPoint", _frompoint);
Debug.locals.put("toPoint", _topoint);
 BA.debugLineNum = 3137;BA.debugLine="Public Sub Distance(fromPoint As PointApi, toPoint";
Debug.ShouldStop(1);
 BA.debugLineNum = 3138;BA.debugLine="Dim d As Float";
Debug.ShouldStop(2);
_d = RemoteObject.createImmutable(0f);Debug.locals.put("d", _d);
 BA.debugLineNum = 3139;BA.debugLine="d = Sqrt(Power(Abs(toPoint.x - fromPoint.x),2) +";
Debug.ShouldStop(4);
_d = BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {utils.mostCurrent.__c.runMethod(true,"Power",(Object)(utils.mostCurrent.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_topoint.getField(true,"X" /*RemoteObject*/ ),_frompoint.getField(true,"X" /*RemoteObject*/ )}, "-",1, 0)))),(Object)(BA.numberCast(double.class, 2))),utils.mostCurrent.__c.runMethod(true,"Power",(Object)(utils.mostCurrent.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {_topoint.getField(true,"Y" /*RemoteObject*/ ),_frompoint.getField(true,"Y" /*RemoteObject*/ )}, "-",1, 0)))),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));Debug.locals.put("d", _d);
 BA.debugLineNum = 3140;BA.debugLine="Return d";
Debug.ShouldStop(8);
if (true) return _d;
 BA.debugLineNum = 3141;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dotline(RemoteObject _ba,RemoteObject _vw,RemoteObject _frompoint,RemoteObject _topoint,RemoteObject _strokewdt,RemoteObject _dotspc,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("dotLine (utils) ","utils",3,_ba,utils.mostCurrent,3165);
if (RapidSub.canDelegate("dotline")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dotline", _ba, _vw, _frompoint, _topoint, _strokewdt, _dotspc, _clr);}
RemoteObject _newpt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._pointapi");
RemoteObject _stp = RemoteObject.createImmutable(0);
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _lng = RemoteObject.createImmutable(0);
RemoteObject _ct = RemoteObject.createImmutable(0);
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("vw", _vw);
Debug.locals.put("fromPoint", _frompoint);
Debug.locals.put("toPoint", _topoint);
Debug.locals.put("strokeWdt", _strokewdt);
Debug.locals.put("dotSpc", _dotspc);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 3165;BA.debugLine="Public Sub dotLine(vw As ImageView, fromPoint As P";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3166;BA.debugLine="Dim NewPt As PointApi";
Debug.ShouldStop(536870912);
_newpt = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._pointapi");Debug.locals.put("NewPt", _newpt);
 BA.debugLineNum = 3167;BA.debugLine="Dim stp As Int";
Debug.ShouldStop(1073741824);
_stp = RemoteObject.createImmutable(0);Debug.locals.put("stp", _stp);
 BA.debugLineNum = 3168;BA.debugLine="Dim Angle, lng As Double";
Debug.ShouldStop(-2147483648);
_angle = RemoteObject.createImmutable(0);Debug.locals.put("Angle", _angle);
_lng = RemoteObject.createImmutable(0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3169;BA.debugLine="Dim ct As Double";
Debug.ShouldStop(1);
_ct = RemoteObject.createImmutable(0);Debug.locals.put("ct", _ct);
 BA.debugLineNum = 3170;BA.debugLine="Dim cvs As Canvas";
Debug.ShouldStop(2);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 3171;BA.debugLine="cvs.Initialize(vw)";
Debug.ShouldStop(4);
_cvs.runVoidMethod ("Initialize",(Object)((_vw.getObject())));
 BA.debugLineNum = 3173;BA.debugLine="Dim Obj1 As Reflector";
Debug.ShouldStop(16);
_obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("Obj1", _obj1);
 BA.debugLineNum = 3174;BA.debugLine="Obj1.Target = cvs";
Debug.ShouldStop(32);
_obj1.setField ("Target",(_cvs));
 BA.debugLineNum = 3175;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
Debug.ShouldStop(64);
_obj1.setField ("Target",_obj1.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("paint"))));
 BA.debugLineNum = 3176;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
Debug.ShouldStop(128);
_obj1.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 3178;BA.debugLine="Angle =  90 - CalcAngleD(fromPoint, toPoint)";
Debug.ShouldStop(512);
_angle = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(90),_calcangled(_ba,_frompoint,_topoint)}, "-",1, 0);Debug.locals.put("Angle", _angle);
 BA.debugLineNum = 3179;BA.debugLine="lng = Distance(fromPoint, toPoint)";
Debug.ShouldStop(1024);
_lng = BA.numberCast(double.class, _distance(_ba,_frompoint,_topoint));Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3180;BA.debugLine="stp = lng / dotSpc";
Debug.ShouldStop(2048);
_stp = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_lng,_dotspc}, "/",0, 0));Debug.locals.put("stp", _stp);
 BA.debugLineNum = 3181;BA.debugLine="dotSpc = lng / stp";
Debug.ShouldStop(4096);
_dotspc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_lng,_stp}, "/",0, 0));Debug.locals.put("dotSpc", _dotspc);
 BA.debugLineNum = 3182;BA.debugLine="lng = lng + dotSpc / 4";
Debug.ShouldStop(8192);
_lng = RemoteObject.solve(new RemoteObject[] {_lng,_dotspc,RemoteObject.createImmutable(4)}, "+/",1, 0);Debug.locals.put("lng", _lng);
 BA.debugLineNum = 3183;BA.debugLine="For ct = 0 To stp";
Debug.ShouldStop(16384);
{
final double step16 = 1;
final double limit16 = (double) (0 + _stp.<Integer>get().intValue());
_ct = BA.numberCast(double.class, 0) ;
for (;(step16 > 0 && _ct.<Double>get().doubleValue() <= limit16) || (step16 < 0 && _ct.<Double>get().doubleValue() >= limit16) ;_ct = RemoteObject.createImmutable((double)(0 + _ct.<Double>get().doubleValue() + step16))  ) {
Debug.locals.put("ct", _ct);
 BA.debugLineNum = 3184;BA.debugLine="NewPt.x = fromPoint.x + ct * dotSpc * SinD(Angle";
Debug.ShouldStop(32768);
_newpt.setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),_ct,_dotspc,utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(_angle))}, "+**",1, 0)));
 BA.debugLineNum = 3185;BA.debugLine="NewPt.y = fromPoint.y + ct * dotSpc * CosD(An";
Debug.ShouldStop(65536);
_newpt.setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),_ct,_dotspc,utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(_angle))}, "+**",1, 0)));
 BA.debugLineNum = 3186;BA.debugLine="cvs.drawCircle(NewPt.x, NewPt.y, strokeWdt / 2,";
Debug.ShouldStop(131072);
_cvs.runVoidMethod ("DrawCircle",(Object)(_newpt.getField(true,"X" /*RemoteObject*/ )),(Object)(_newpt.getField(true,"Y" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_strokewdt,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(_clr),(Object)(utils.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("ct", _ct);
;
 BA.debugLineNum = 3188;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject _ba,RemoteObject _callback,RemoteObject _link) throws Exception{
try {
		Debug.PushSubsStack("Download (utils) ","utils",3,_ba,utils.mostCurrent,2504);
if (RapidSub.canDelegate("download")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","download", _ba, _callback, _link);}
RemoteObject _j = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
;
Debug.locals.put("Callback", _callback);
Debug.locals.put("link", _link);
 BA.debugLineNum = 2504;BA.debugLine="Sub Download (Callback As Object, link As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 2505;BA.debugLine="Dim j As HttpJob";
Debug.ShouldStop(256);
_j = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("j", _j);
 BA.debugLineNum = 2506;BA.debugLine="j.Initialize(\"\", Callback)";
Debug.ShouldStop(512);
_j.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(BA.ObjectToString("")),(Object)(_callback));
 BA.debugLineNum = 2507;BA.debugLine="j.Download(link)";
Debug.ShouldStop(1024);
_j.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_link));
 BA.debugLineNum = 2508;BA.debugLine="Return j";
Debug.ShouldStop(2048);
if (true) return _j;
 BA.debugLineNum = 2509;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawpoints(RemoteObject _ba,RemoteObject _vw,RemoteObject _frompoint,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("drawPoints (utils) ","utils",3,_ba,utils.mostCurrent,3261);
if (RapidSub.canDelegate("drawpoints")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","drawpoints", _ba, _vw, _frompoint, _clr);}
RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
RemoteObject _obj1 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("vw", _vw);
Debug.locals.put("fromPoint", _frompoint);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 3261;BA.debugLine="Public Sub drawPoints(vw As ImageView, fromPoint A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3262;BA.debugLine="Dim cvs As Canvas";
Debug.ShouldStop(536870912);
_cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 3263;BA.debugLine="cvs.Initialize(vw)";
Debug.ShouldStop(1073741824);
_cvs.runVoidMethod ("Initialize",(Object)((_vw.getObject())));
 BA.debugLineNum = 3265;BA.debugLine="Dim Obj1 As Reflector";
Debug.ShouldStop(1);
_obj1 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("Obj1", _obj1);
 BA.debugLineNum = 3266;BA.debugLine="Obj1.Target = cvs";
Debug.ShouldStop(2);
_obj1.setField ("Target",(_cvs));
 BA.debugLineNum = 3267;BA.debugLine="Obj1.Target = Obj1.GetField(\"paint\")";
Debug.ShouldStop(4);
_obj1.setField ("Target",_obj1.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("paint"))));
 BA.debugLineNum = 3268;BA.debugLine="Obj1.RunMethod2(\"setAntiAlias\", True, \"java.la";
Debug.ShouldStop(8);
_obj1.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setAntiAlias")),(Object)(BA.ObjectToString(utils.mostCurrent.__c.getField(true,"True"))),(Object)(RemoteObject.createImmutable("java.lang.boolean")));
 BA.debugLineNum = 3270;BA.debugLine="cvs.DrawLine(fromPoint.x, fromPoint.y - 10, fromP";
Debug.ShouldStop(32);
_cvs.runVoidMethod ("DrawLine",(Object)(_frompoint.getField(true,"X" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "-",1, 0))),(Object)(_frompoint.getField(true,"X" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"Y" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "+",1, 0))),(Object)(_clr),(Object)(BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 3271;BA.debugLine="cvs.DrawLine(fromPoint.x - 10, fromPoint.y, fromP";
Debug.ShouldStop(64);
_cvs.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "-",1, 0))),(Object)(_frompoint.getField(true,"Y" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_frompoint.getField(true,"X" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "+",1, 0))),(Object)(_frompoint.getField(true,"Y" /*RemoteObject*/ )),(Object)(_clr),(Object)(BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 3272;BA.debugLine="cvs.drawCircle(fromPoint.x , fromPoint.y, 10, clr";
Debug.ShouldStop(128);
_cvs.runVoidMethod ("DrawCircle",(Object)(_frompoint.getField(true,"X" /*RemoteObject*/ )),(Object)(_frompoint.getField(true,"Y" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 10)),(Object)(_clr),(Object)(utils.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(float.class, 0.5)));
 BA.debugLineNum = 3273;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawtextwithborder2(RemoteObject _ba,RemoteObject _cvs1,RemoteObject _text,RemoteObject _fnt,RemoteObject _clr,RemoteObject _centerx,RemoteObject _centery,RemoteObject _border,RemoteObject _bline) throws Exception{
try {
		Debug.PushSubsStack("DrawTextWithBorder2 (utils) ","utils",3,_ba,utils.mostCurrent,861);
if (RapidSub.canDelegate("drawtextwithborder2")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","drawtextwithborder2", _ba, _cvs1, _text, _fnt, _clr, _centerx, _centery, _border, _bline);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
RemoteObject _ro = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
;
Debug.locals.put("cvs1", _cvs1);
Debug.locals.put("Text", _text);
Debug.locals.put("Fnt", _fnt);
Debug.locals.put("Clr", _clr);
Debug.locals.put("CenterX", _centerx);
Debug.locals.put("CenterY", _centery);
Debug.locals.put("border", _border);
Debug.locals.put("bline", _bline);
 BA.debugLineNum = 861;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 863;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
Debug.ShouldStop(1073741824);
_r = _cvs1.runMethod(false,"MeasureText",(Object)(_text),(Object)(_fnt));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 864;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(-2147483648);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 865;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
Debug.ShouldStop(1);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 867;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
Debug.ShouldStop(4);
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_centery,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),_fnt.runMethod(true,"getSize")}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),_r.runMethod(true,"getTop")}, "--",2, 0));Debug.locals.put("baseline", _baseline);Debug.locals.put("baseline", _baseline);
 BA.debugLineNum = 869;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
Debug.ShouldStop(16);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "+/",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "+/",1, 0))));
 BA.debugLineNum = 870;BA.debugLine="If (bline >=1) Then";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("g",_bline,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 871;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
Debug.ShouldStop(64);
_cvs1.runVoidMethod ("DrawLine",(Object)(_r.runMethod(true,"getLeft")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_r.runMethod(true,"getRight")),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_clr),(Object)(BA.numberCast(float.class, _bline)));
 };
 BA.debugLineNum = 873;BA.debugLine="If (border >=1) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("g",_border,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 874;BA.debugLine="Dim ro As B4XRect";
Debug.ShouldStop(512);
_ro = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("ro", _ro);
 BA.debugLineNum = 875;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
Debug.ShouldStop(1024);
_ro.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getLeft"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getTop"),_border}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getRight"),_border}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getBottom"),_border}, "+",1, 0))));
 BA.debugLineNum = 876;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
Debug.ShouldStop(2048);
_cvs1.runVoidMethod ("DrawRect",(Object)(_ro),(Object)(_clr),(Object)(utils.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 BA.debugLineNum = 877;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
Debug.ShouldStop(4096);
_cvs1.runVoidMethod ("DrawRect",(Object)(_r),(Object)(utils.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(utils.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, _border)));
 };
 BA.debugLineNum = 880;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
Debug.ShouldStop(32768);
_cvs1.runVoidMethod ("DrawText",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)(_text),(Object)(BA.numberCast(float.class, _centerx)),(Object)(BA.numberCast(float.class, _baseline)),(Object)(_fnt),(Object)(_clr),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 881;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dtgeosave2canvas(RemoteObject _ba,RemoteObject _cvs,RemoteObject _la,RemoteObject _lo) throws Exception{
try {
		Debug.PushSubsStack("DTGEOSave2Canvas (utils) ","utils",3,_ba,utils.mostCurrent,850);
if (RapidSub.canDelegate("dtgeosave2canvas")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dtgeosave2canvas", _ba, _cvs, _la, _lo);}
RemoteObject _datetimename = RemoteObject.createImmutable("");
RemoteObject _f = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _drect = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
;
Debug.locals.put("cvs", _cvs);
Debug.locals.put("la", _la);
Debug.locals.put("lo", _lo);
 BA.debugLineNum = 850;BA.debugLine="Sub DTGEOSave2Canvas(cvs As B4XCanvas, la As Strin";
Debug.ShouldStop(131072);
 BA.debugLineNum = 851;BA.debugLine="Private xui As XUI";
Debug.ShouldStop(262144);
utils._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 BA.debugLineNum = 852;BA.debugLine="Dim DateTimeName As String = $\"${MakeDateTimeSlas";
Debug.ShouldStop(524288);
_datetimename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_makedatetimeslash2(_ba)))),RemoteObject.createImmutable("  -  "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_la))),RemoteObject.createImmutable("/"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lo))),RemoteObject.createImmutable("")));Debug.locals.put("DateTimeName", _datetimename);Debug.locals.put("DateTimeName", _datetimename);
 BA.debugLineNum = 853;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
Debug.ShouldStop(1048576);
_f = utils._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, utils.mostCurrent._sharecode._device_def_font_size /*RemoteObject*/ )));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 854;BA.debugLine="Dim dRect As B4XRect";
Debug.ShouldStop(2097152);
_drect = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");Debug.locals.put("dRect", _drect);
 BA.debugLineNum = 855;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
Debug.ShouldStop(4194304);
_drect.runVoidMethod ("Initialize",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight"),utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 18)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_cvs.runMethod(false,"getTargetRect").runMethod(true,"getLeft"),utils.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 350)))}, "+",1, 0))),(Object)(_cvs.runMethod(false,"getTargetRect").runMethod(true,"getHeight")));
 BA.debugLineNum = 856;BA.debugLine="DrawTextWithBorder2(cvs, DateTimeName, f, Consts.";
Debug.ShouldStop(8388608);
_drawtextwithborder2(_ba,_cvs,_datetimename,_f,utils.mostCurrent._consts._colordarkgray /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getLeft"),_drect.runMethod(true,"getRight")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_drect.runMethod(true,"getTop"),_drect.runMethod(true,"getBottom")}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0)),BA.numberCast(int.class, 1),BA.numberCast(int.class, 0));
 BA.debugLineNum = 857;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(16777216);
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 858;BA.debugLine="Return cvs";
Debug.ShouldStop(33554432);
if (true) return _cvs;
 BA.debugLineNum = 859;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dtp(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("DTP (utils) ","utils",3,_ba,utils.mostCurrent,2936);
if (RapidSub.canDelegate("dtp")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dtp", _ba, _instr);}
RemoteObject _ret = RemoteObject.createImmutable(0L);
RemoteObject _retl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2936;BA.debugLine="Sub DTP(inStr As String) As Long";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2937;BA.debugLine="Dim ret As Long = 0";
Debug.ShouldStop(16777216);
_ret = BA.numberCast(long.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2938;BA.debugLine="Dim retL As List = DTS2LSTS(inStr)";
Debug.ShouldStop(33554432);
_retl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_retl = _dts2lsts(_ba,_instr);Debug.locals.put("retL", _retl);Debug.locals.put("retL", _retl);
 BA.debugLineNum = 2939;BA.debugLine="If (retL.Size = 1) Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_retl.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2940;BA.debugLine="ret = DateTime.DateParse(retL.Get(0))";
Debug.ShouldStop(134217728);
_ret = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_retl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("ret", _ret);
 }else 
{ BA.debugLineNum = 2941;BA.debugLine="else If (retL.Size = 2) Then";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("=",_retl.runMethod(true,"getSize"),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 2942;BA.debugLine="ret = DateTime.DateTimeParse(retL.Get(0), retL.G";
Debug.ShouldStop(536870912);
_ret = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateTimeParse",(Object)(BA.ObjectToString(_retl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.ObjectToString(_retl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 }}
;
 BA.debugLineNum = 2944;BA.debugLine="Return ret";
Debug.ShouldStop(-2147483648);
if (true) return _ret;
 BA.debugLineNum = 2945;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dts2l(RemoteObject _ba,RemoteObject _instr,RemoteObject _istime) throws Exception{
try {
		Debug.PushSubsStack("DTS2L (utils) ","utils",3,_ba,utils.mostCurrent,2897);
if (RapidSub.canDelegate("dts2l")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dts2l", _ba, _instr, _istime);}
RemoteObject _spliter = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ret = RemoteObject.createImmutable(0L);
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("isTime", _istime);
 BA.debugLineNum = 2897;BA.debugLine="Sub DTS2L(inStr As String, isTime As Boolean) As L";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2898;BA.debugLine="Dim spliter As List = Regex.Split(\" \", inStr)";
Debug.ShouldStop(131072);
_spliter = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spliter = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_instr))));Debug.locals.put("spliter", _spliter);Debug.locals.put("spliter", _spliter);
 BA.debugLineNum = 2899;BA.debugLine="Dim ret As Long = 0";
Debug.ShouldStop(262144);
_ret = BA.numberCast(long.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2900;BA.debugLine="If (spliter.Size >= 1) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("g",_spliter.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2901;BA.debugLine="If Not(isTime) Then";
Debug.ShouldStop(1048576);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_istime)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2902;BA.debugLine="ret = DateTime.DateParse(spliter.get(0))";
Debug.ShouldStop(2097152);
_ret = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_spliter.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("ret", _ret);
 }else {
 BA.debugLineNum = 2904;BA.debugLine="If (spliter.Size = 2) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("=",_spliter.runMethod(true,"getSize"),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 2905;BA.debugLine="ret = DateTime.TimeParse(spliter.get(1))";
Debug.ShouldStop(16777216);
_ret = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(BA.ObjectToString(_spliter.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("ret", _ret);
 };
 };
 };
 BA.debugLineNum = 2909;BA.debugLine="Return ret";
Debug.ShouldStop(268435456);
if (true) return _ret;
 BA.debugLineNum = 2910;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dts2lstl(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("DTS2LSTL (utils) ","utils",3,_ba,utils.mostCurrent,2915);
if (RapidSub.canDelegate("dts2lstl")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dts2lstl", _ba, _instr);}
RemoteObject _spliter = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2915;BA.debugLine="Sub DTS2LSTL(inStr As String) As List";
Debug.ShouldStop(4);
 BA.debugLineNum = 2916;BA.debugLine="Dim spliter As List = Regex.Split(\" \", inStr)";
Debug.ShouldStop(8);
_spliter = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spliter = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_instr))));Debug.locals.put("spliter", _spliter);Debug.locals.put("spliter", _spliter);
 BA.debugLineNum = 2917;BA.debugLine="Dim ret As List : ret.initialize";
Debug.ShouldStop(16);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2917;BA.debugLine="Dim ret As List : ret.initialize";
Debug.ShouldStop(16);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 2918;BA.debugLine="For n=0 To spliter.Size-1";
Debug.ShouldStop(32);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_spliter.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step4 > 0 && _n <= limit4) || (step4 < 0 && _n >= limit4) ;_n = ((int)(0 + _n + step4))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 2919;BA.debugLine="If n=0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_n),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 2920;BA.debugLine="ret.Add(DateTime.DateParse(spliter.get(0)))";
Debug.ShouldStop(128);
_ret.runVoidMethod ("Add",(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_spliter.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))))))));
 }else {
 BA.debugLineNum = 2922;BA.debugLine="ret.Add(DateTime.TimeParse(spliter.get(1)))";
Debug.ShouldStop(512);
_ret.runVoidMethod ("Add",(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(BA.ObjectToString(_spliter.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))))))));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 2925;BA.debugLine="Return ret";
Debug.ShouldStop(4096);
if (true) return _ret;
 BA.debugLineNum = 2926;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dts2lsts(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("DTS2LSTS (utils) ","utils",3,_ba,utils.mostCurrent,2931);
if (RapidSub.canDelegate("dts2lsts")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dts2lsts", _ba, _instr);}
RemoteObject _spliter = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2931;BA.debugLine="Sub DTS2LSTS(inStr As String) As List";
Debug.ShouldStop(262144);
 BA.debugLineNum = 2932;BA.debugLine="Dim spliter As List = Regex.Split(\" \", inStr)";
Debug.ShouldStop(524288);
_spliter = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_spliter = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_instr))));Debug.locals.put("spliter", _spliter);Debug.locals.put("spliter", _spliter);
 BA.debugLineNum = 2933;BA.debugLine="Return spliter";
Debug.ShouldStop(1048576);
if (true) return _spliter;
 BA.debugLineNum = 2934;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dtsbtw(RemoteObject _ba,RemoteObject _instr1,RemoteObject _instr2) throws Exception{
try {
		Debug.PushSubsStack("DTSBTW (utils) ","utils",3,_ba,utils.mostCurrent,2950);
if (RapidSub.canDelegate("dtsbtw")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dtsbtw", _ba, _instr1, _instr2);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _per = RemoteObject.declareNull("b4a.example.dateutils._period");
;
Debug.locals.put("inStr1", _instr1);
Debug.locals.put("inStr2", _instr2);
 BA.debugLineNum = 2950;BA.debugLine="Sub DTSBTW(inStr1 As String, inStr2 As String) As";
Debug.ShouldStop(32);
 BA.debugLineNum = 2951;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(64);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2952;BA.debugLine="If NNE(inStr1) And NNE(inStr2) Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",_nne(_ba,_instr1)) && RemoteObject.solveBoolean(".",_nne(_ba,_instr2))) { 
 BA.debugLineNum = 2953;BA.debugLine="Dim per As Period = DateUtils.PeriodBetween(DTP(";
Debug.ShouldStop(256);
_per = utils.mostCurrent._dateutils.runMethod(false,"_periodbetween",_ba,(Object)(_dtp(_ba,_instr1)),(Object)(_dtp(_ba,_instr2)));Debug.locals.put("per", _per);Debug.locals.put("per", _per);
 BA.debugLineNum = 2954;BA.debugLine="Dim ret As String = $\"${per.Minutes}:${per.Secon";
Debug.ShouldStop(512);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_per.getField(true,"Minutes")))),RemoteObject.createImmutable(":"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_per.getField(true,"Seconds")))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 2956;BA.debugLine="Return ret";
Debug.ShouldStop(2048);
if (true) return _ret;
 BA.debugLineNum = 2957;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dtsbtwl(RemoteObject _ba,RemoteObject _inval1,RemoteObject _inval2) throws Exception{
try {
		Debug.PushSubsStack("DTSBTWL (utils) ","utils",3,_ba,utils.mostCurrent,2962);
if (RapidSub.canDelegate("dtsbtwl")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","dtsbtwl", _ba, _inval1, _inval2);}
RemoteObject _ret = RemoteObject.createImmutable("");
RemoteObject _per = RemoteObject.declareNull("b4a.example.dateutils._period");
;
Debug.locals.put("inVal1", _inval1);
Debug.locals.put("inVal2", _inval2);
 BA.debugLineNum = 2962;BA.debugLine="Sub DTSBTWL(inVal1 As Long, inVal2 As Long) As Str";
Debug.ShouldStop(131072);
 BA.debugLineNum = 2963;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(262144);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2964;BA.debugLine="Dim per As Period = DateUtils.PeriodBetween(inVal";
Debug.ShouldStop(524288);
_per = utils.mostCurrent._dateutils.runMethod(false,"_periodbetween",_ba,(Object)(_inval1),(Object)(_inval2));Debug.locals.put("per", _per);Debug.locals.put("per", _per);
 BA.debugLineNum = 2965;BA.debugLine="Dim ret As String = $\"${per.Minutes}:${per.Second";
Debug.ShouldStop(1048576);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_per.getField(true,"Minutes")))),RemoteObject.createImmutable(":"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_per.getField(true,"Seconds")))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2966;BA.debugLine="Return ret";
Debug.ShouldStop(2097152);
if (true) return _ret;
 BA.debugLineNum = 2967;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("EscapeField (utils) ","utils",3,_ba,utils.mostCurrent,1427);
if (RapidSub.canDelegate("escapefield")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","escapefield", _ba, _f);}
;
Debug.locals.put("f", _f);
 BA.debugLineNum = 1427;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1428;BA.debugLine="Return \"[\" & f & \"]\"";
Debug.ShouldStop(524288);
if (true) return RemoteObject.concat(RemoteObject.createImmutable("["),_f,RemoteObject.createImmutable("]"));
 BA.debugLineNum = 1429;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _esmtpreturn_messagesent(RemoteObject _ba,RemoteObject _success) throws Exception{
try {
		Debug.PushSubsStack("eSMTPReturn_MessageSent (utils) ","utils",3,_ba,utils.mostCurrent,3355);
if (RapidSub.canDelegate("esmtpreturn_messagesent")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","esmtpreturn_messagesent", _ba, _success);}
;
Debug.locals.put("Success", _success);
 BA.debugLineNum = 3355;BA.debugLine="Sub eSMTPReturn_MessageSent(Success As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3356;BA.debugLine="Log(\"SMTP send: \" & Success )";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","614942209",RemoteObject.concat(RemoteObject.createImmutable("SMTP send: "),_success),0);
 BA.debugLineNum = 3357;BA.debugLine="If Success Then";
Debug.ShouldStop(268435456);
if (_success.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3359;BA.debugLine="ToastMessageShow(\"Email Enviado !\",True)";
Debug.ShouldStop(1073741824);
utils.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Email Enviado !")),(Object)(utils.mostCurrent.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 3366;BA.debugLine="ToastMessageShow(\"Email NÃO enviado !\",True)";
Debug.ShouldStop(32);
utils.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Email NÃO enviado !")),(Object)(utils.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 3370;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(512);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","614942223",utils.mostCurrent.__c.runMethod(false,"LastException",_ba).runMethod(true,"getMessage"),0);
 };
 BA.debugLineNum = 3372;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fieldinlist(RemoteObject _ba,RemoteObject _do_field,RemoteObject _inlist) throws Exception{
try {
		Debug.PushSubsStack("FieldInList (utils) ","utils",3,_ba,utils.mostCurrent,174);
if (RapidSub.canDelegate("fieldinlist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","fieldinlist", _ba, _do_field, _inlist);}
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("do_field", _do_field);
Debug.locals.put("inList", _inlist);
 BA.debugLineNum = 174;BA.debugLine="Sub FieldInList(do_field As String, inList As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 175;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(16384);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 176;BA.debugLine="If (NNE(do_field) And NNE(inList)) Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean(".",_nne(_ba,_do_field)) && RemoteObject.solveBoolean(".",_nne(_ba,_inlist)))) { 
 BA.debugLineNum = 177;BA.debugLine="Dim Lista As List = Regex.Split(\"\\|\", inList )";
Debug.ShouldStop(65536);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lista = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_inlist))));Debug.locals.put("Lista", _lista);Debug.locals.put("Lista", _lista);
 BA.debugLineNum = 178;BA.debugLine="ret = (Lista.IndexOf(do_field) >= 0)";
Debug.ShouldStop(131072);
_ret = BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_lista.runMethod(true,"IndexOf",(Object)((_do_field))),BA.numberCast(double.class, 0))));Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 180;BA.debugLine="Return ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fieldresultset2sqlarray(RemoteObject _ba,RemoteObject _inlist,RemoteObject _infield) throws Exception{
try {
		Debug.PushSubsStack("FieldResultSet2SQLArray (utils) ","utils",3,_ba,utils.mostCurrent,183);
if (RapidSub.canDelegate("fieldresultset2sqlarray")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","fieldresultset2sqlarray", _ba, _inlist, _infield);}
RemoteObject _sret = RemoteObject.createImmutable("");
RemoteObject _tgcode = RemoteObject.createImmutable("");
;
Debug.locals.put("inList", _inlist);
Debug.locals.put("inField", _infield);
 BA.debugLineNum = 183;BA.debugLine="Sub FieldResultSet2SQLArray(inList As ResultSet, i";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 184;BA.debugLine="Dim sRet As String = \"\"";
Debug.ShouldStop(8388608);
_sret = BA.ObjectToString("");Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 185;BA.debugLine="Do While inList.NextRow";
Debug.ShouldStop(16777216);
while (_inlist.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 186;BA.debugLine="Dim TgCode As String = inList.GetString(inField)";
Debug.ShouldStop(33554432);
_tgcode = _inlist.runMethod(true,"GetString",(Object)(_infield));Debug.locals.put("TgCode", _tgcode);Debug.locals.put("TgCode", _tgcode);
 BA.debugLineNum = 187;BA.debugLine="If (NNE(sRet)) Then";
Debug.ShouldStop(67108864);
if ((_nne(_ba,_sret)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="sRet = $\"${sRet},\"$";
Debug.ShouldStop(134217728);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(",")));Debug.locals.put("sRet", _sret);
 };
 BA.debugLineNum = 190;BA.debugLine="sRet = $\"${sRet}'${TgCode}'\"$";
Debug.ShouldStop(536870912);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable("'"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tgcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sRet", _sret);
 }
;
 BA.debugLineNum = 192;BA.debugLine="If (NNE(sRet)) Then";
Debug.ShouldStop(-2147483648);
if ((_nne(_ba,_sret)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="sRet = $\"(${sRet})\"$";
Debug.ShouldStop(1);
_sret = (RemoteObject.concat(RemoteObject.createImmutable("("),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(")")));Debug.locals.put("sRet", _sret);
 }else {
 BA.debugLineNum = 195;BA.debugLine="sRet = $\"('')\"$";
Debug.ShouldStop(4);
_sret = (RemoteObject.createImmutable("('')"));Debug.locals.put("sRet", _sret);
 };
 BA.debugLineNum = 197;BA.debugLine="Return sRet";
Debug.ShouldStop(16);
if (true) return _sret;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findkeyforvalue(RemoteObject _ba,RemoteObject _m,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("FindKeyForValue (utils) ","utils",3,_ba,utils.mostCurrent,2399);
if (RapidSub.canDelegate("findkeyforvalue")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","findkeyforvalue", _ba, _m, _v);}
RemoteObject _k = RemoteObject.declareNull("Object");
;
Debug.locals.put("m", _m);
Debug.locals.put("v", _v);
 BA.debugLineNum = 2399;BA.debugLine="Sub FindKeyForValue(m As Map, v As Object) As Obje";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 2400;BA.debugLine="For Each k As Object In m.Keys";
Debug.ShouldStop(-2147483648);
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = group1.runMethod(false,"Get",index1);Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 2401;BA.debugLine="If m.Get(k) = v Then Return k";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_m.runMethod(false,"Get",(Object)(_k)),_v)) { 
if (true) return _k;};
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 2403;BA.debugLine="Return \"\"";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable((""));
 BA.debugLineNum = 2404;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatfilesize(RemoteObject _ba,RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("FormatFileSize (utils) ","utils",3,_ba,utils.mostCurrent,816);
if (RapidSub.canDelegate("formatfilesize")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","formatfilesize", _ba, _bytes);}
RemoteObject _unit = null;
RemoteObject _po = RemoteObject.createImmutable(0);
RemoteObject _si = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
;
Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 816;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 817;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
Debug.ShouldStop(65536);
_unit = RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(" Byte"),BA.ObjectToString(" Kb"),BA.ObjectToString(" Mb"),BA.ObjectToString(" Gb"),BA.ObjectToString(" Tb"),BA.ObjectToString(" Pb"),BA.ObjectToString(" Eb"),BA.ObjectToString(" Zb"),RemoteObject.createImmutable(" Yb")});Debug.locals.put("Unit", _unit);Debug.locals.put("Unit", _unit);
 BA.debugLineNum = 818;BA.debugLine="If Bytes = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_bytes,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 819;BA.debugLine="Return \"0 Bytes\"";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToString("0 Bytes");
 }else {
 BA.debugLineNum = 821;BA.debugLine="Private Po, Si As Double";
Debug.ShouldStop(1048576);
_po = RemoteObject.createImmutable(0);Debug.locals.put("Po", _po);
_si = RemoteObject.createImmutable(0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 822;BA.debugLine="Private I As Int";
Debug.ShouldStop(2097152);
_i = RemoteObject.createImmutable(0);Debug.locals.put("I", _i);
 BA.debugLineNum = 823;BA.debugLine="Bytes = Abs(Bytes)";
Debug.ShouldStop(4194304);
_bytes = BA.numberCast(float.class, utils.mostCurrent.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _bytes))));Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 824;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
Debug.ShouldStop(8388608);
_i = BA.numberCast(int.class, utils.mostCurrent.__c.runMethod(true,"Floor",(Object)(utils.mostCurrent.__c.runMethod(true,"Logarithm",(Object)(BA.numberCast(double.class, _bytes)),(Object)(BA.numberCast(double.class, 1024))))));Debug.locals.put("I", _i);
 BA.debugLineNum = 825;BA.debugLine="Po = Power(1024, I)";
Debug.ShouldStop(16777216);
_po = utils.mostCurrent.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, _i)));Debug.locals.put("Po", _po);
 BA.debugLineNum = 826;BA.debugLine="Si = Bytes / Po";
Debug.ShouldStop(33554432);
_si = RemoteObject.solve(new RemoteObject[] {_bytes,_po}, "/",0, 0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 827;BA.debugLine="Return NumberFormat(Si, 1, 1) & Unit(I)";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.concat(utils.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(_si),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1))),_unit.getArrayElement(true,_i));
 };
 BA.debugLineNum = 829;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formulainblocks(RemoteObject _ba,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("FormulaInBlocks (utils) ","utils",3,_ba,utils.mostCurrent,200);
if (RapidSub.canDelegate("formulainblocks")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","formulainblocks", _ba, _formula);}
RemoteObject _blocks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _blocksand = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _blocksor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("Formula", _formula);
 BA.debugLineNum = 200;BA.debugLine="Sub FormulaInBlocks(Formula As String) As List";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Dim Blocks As List : Blocks.initialize";
Debug.ShouldStop(256);
_blocks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Blocks", _blocks);
 BA.debugLineNum = 201;BA.debugLine="Dim Blocks As List : Blocks.initialize";
Debug.ShouldStop(256);
_blocks.runVoidMethod ("Initialize");
 BA.debugLineNum = 202;BA.debugLine="Dim BlocksAnd As List = Regex.Split(\"\\&&\", Formul";
Debug.ShouldStop(512);
_blocksand = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_blocksand = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\&&")),(Object)(_formula))));Debug.locals.put("BlocksAnd", _blocksand);Debug.locals.put("BlocksAnd", _blocksand);
 BA.debugLineNum = 203;BA.debugLine="If (BlocksAnd.Size >0) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean(">",_blocksand.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 204;BA.debugLine="For i = 0 To BlocksAnd.Size-1";
Debug.ShouldStop(2048);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_blocksand.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="Dim BlocksOr As List = Regex.Split(\"\\|\\|\", Bloc";
Debug.ShouldStop(4096);
_blocksor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_blocksor = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|\\|")),(Object)(BA.ObjectToString(_blocksand.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))))));Debug.locals.put("BlocksOr", _blocksor);Debug.locals.put("BlocksOr", _blocksor);
 BA.debugLineNum = 206;BA.debugLine="If (BlocksOr.Size >0) Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean(">",_blocksor.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 207;BA.debugLine="Blocks.AddAll(BlocksOr)";
Debug.ShouldStop(16384);
_blocks.runVoidMethod ("AddAll",(Object)(_blocksor));
 }else {
 BA.debugLineNum = 209;BA.debugLine="Blocks.Add(BlocksAnd.Get(i))";
Debug.ShouldStop(65536);
_blocks.runVoidMethod ("Add",(Object)(_blocksand.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 213;BA.debugLine="Dim BlocksOr As List = Regex.Split(\"\\|\\|\", Formu";
Debug.ShouldStop(1048576);
_blocksor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_blocksor = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|\\|")),(Object)(_formula))));Debug.locals.put("BlocksOr", _blocksor);Debug.locals.put("BlocksOr", _blocksor);
 BA.debugLineNum = 214;BA.debugLine="If (BlocksOr.Size >0) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean(">",_blocksor.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 215;BA.debugLine="For i = 0 To BlocksOr.Size-1";
Debug.ShouldStop(4194304);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_blocksor.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16) ;_i = ((int)(0 + _i + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 216;BA.debugLine="Blocks.Add(BlocksOr.Get(i))";
Debug.ShouldStop(8388608);
_blocks.runVoidMethod ("Add",(Object)(_blocksor.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 219;BA.debugLine="Blocks.Add(Formula)";
Debug.ShouldStop(67108864);
_blocks.runVoidMethod ("Add",(Object)((_formula)));
 };
 };
 BA.debugLineNum = 222;BA.debugLine="Return Blocks";
Debug.ShouldStop(536870912);
if (true) return _blocks;
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generatetagcode(RemoteObject _ba,RemoteObject _prefix) throws Exception{
try {
		Debug.PushSubsStack("GenerateTagcode (utils) ","utils",3,_ba,utils.mostCurrent,1946);
if (RapidSub.canDelegate("generatetagcode")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","generatetagcode", _ba, _prefix);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
Debug.locals.put("prefix", _prefix);
 BA.debugLineNum = 1946;BA.debugLine="Sub GenerateTagcode(prefix As String) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1947;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(67108864);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 1948;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1949;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}_$t";
Debug.ShouldStop(268435456);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_randomint2(_ba,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 1950;BA.debugLine="If Not(isNullOrEmpty(prefix)) Then";
Debug.ShouldStop(536870912);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_isnullorempty(_ba,_prefix))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1951;BA.debugLine="DateName = $\"${prefix}${DateName}\"$";
Debug.ShouldStop(1073741824);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_prefix))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datename))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);
 };
 BA.debugLineNum = 1953;BA.debugLine="Return DateName";
Debug.ShouldStop(1);
if (true) return _datename;
 BA.debugLineNum = 1954;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalltablabels(RemoteObject _ba,RemoteObject _tabstrip) throws Exception{
try {
		Debug.PushSubsStack("GetAllTabLabels (utils) ","utils",3,_ba,utils.mostCurrent,2588);
if (RapidSub.canDelegate("getalltablabels")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getalltablabels", _ba, _tabstrip);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _tc = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
;
Debug.locals.put("tabstrip", _tabstrip);
 BA.debugLineNum = 2588;BA.debugLine="Public Sub GetAllTabLabels (tabstrip As TabStrip)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 2589;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(268435456);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2590;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(536870912);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 2591;BA.debugLine="r.Target = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(1073741824);
_r.setField ("Target",_jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 2592;BA.debugLine="Dim tc As Panel = r.GetField(\"tabsContainer\")";
Debug.ShouldStop(-2147483648);
_tc = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabsContainer"))));Debug.locals.put("tc", _tc);
 BA.debugLineNum = 2593;BA.debugLine="Dim res As List";
Debug.ShouldStop(1);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 2594;BA.debugLine="res.Initialize";
Debug.ShouldStop(2);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 2595;BA.debugLine="For Each v As View In tc";
Debug.ShouldStop(4);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group7 = _tc;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), group7.runMethod(false,"Get",index7));
Debug.locals.put("v", _v);
 BA.debugLineNum = 2596;BA.debugLine="If v Is Label Then res.Add(v)";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.widget.TextView"))) { 
_res.runVoidMethod ("Add",(Object)((_v.getObject())));};
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 2598;BA.debugLine="Return res";
Debug.ShouldStop(32);
if (true) return _res;
 BA.debugLineNum = 2599;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getalltabpanels(RemoteObject _ba,RemoteObject _tabstrip) throws Exception{
try {
		Debug.PushSubsStack("GetAllTabPanels (utils) ","utils",3,_ba,utils.mostCurrent,2664);
if (RapidSub.canDelegate("getalltabpanels")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getalltabpanels", _ba, _tabstrip);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _tc = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
;
Debug.locals.put("tabstrip", _tabstrip);
 BA.debugLineNum = 2664;BA.debugLine="Public Sub GetAllTabPanels (tabstrip As TabStrip)";
Debug.ShouldStop(128);
 BA.debugLineNum = 2665;BA.debugLine="Dim res As List";
Debug.ShouldStop(256);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 2666;BA.debugLine="res.Initialize";
Debug.ShouldStop(512);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 2668;BA.debugLine="Dim jo As JavaObject = tabstrip";
Debug.ShouldStop(2048);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _tabstrip);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2669;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(4096);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 2670;BA.debugLine="r.Target = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(8192);
_r.setField ("Target",_jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 2671;BA.debugLine="Dim tc As Panel = r.GetField(\"tabsContainer\")";
Debug.ShouldStop(16384);
_tc = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_tc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabsContainer"))));Debug.locals.put("tc", _tc);
 BA.debugLineNum = 2672;BA.debugLine="Dim res As List";
Debug.ShouldStop(32768);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("res", _res);
 BA.debugLineNum = 2673;BA.debugLine="res.Initialize";
Debug.ShouldStop(65536);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 2674;BA.debugLine="For Each v As View In tc";
Debug.ShouldStop(131072);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group9 = _tc;
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), group9.runMethod(false,"Get",index9));
Debug.locals.put("v", _v);
 BA.debugLineNum = 2675;BA.debugLine="If v Is Panel Then res.Add(v)";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("android.view.ViewGroup"))) { 
_res.runVoidMethod ("Add",(Object)((_v.getObject())));};
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 2684;BA.debugLine="Return res";
Debug.ShouldStop(134217728);
if (true) return _res;
 BA.debugLineNum = 2685;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getappname(RemoteObject _ba,RemoteObject _upper) throws Exception{
try {
		Debug.PushSubsStack("GetAppName (utils) ","utils",3,_ba,utils.mostCurrent,3680);
if (RapidSub.canDelegate("getappname")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getappname", _ba, _upper);}
RemoteObject _name = RemoteObject.declareNull("Object");
RemoteObject _sname = RemoteObject.createImmutable("");
;
Debug.locals.put("Upper", _upper);
 BA.debugLineNum = 3680;BA.debugLine="Sub GetAppName(Upper As Boolean) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3686;BA.debugLine="Dim name As Object = Application.LabelName";
Debug.ShouldStop(32);
_name = (utils.mostCurrent.__c.getField(false,"Application").runMethod(true,"getLabelName"));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 3688;BA.debugLine="If (Upper) Then";
Debug.ShouldStop(128);
if ((_upper).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3689;BA.debugLine="Dim sName As String = name";
Debug.ShouldStop(256);
_sname = BA.ObjectToString(_name);Debug.locals.put("sName", _sname);Debug.locals.put("sName", _sname);
 BA.debugLineNum = 3690;BA.debugLine="Return sName.ToUpperCase";
Debug.ShouldStop(512);
if (true) return _sname.runMethod(true,"toUpperCase");
 }else {
 BA.debugLineNum = 3692;BA.debugLine="Return name";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString(_name);
 };
 BA.debugLineNum = 3694;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getaspriority(RemoteObject _ba,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("getASPriority (utils) ","utils",3,_ba,utils.mostCurrent,1445);
if (RapidSub.canDelegate("getaspriority")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getaspriority", _ba, _id);}
RemoteObject _retstr = RemoteObject.createImmutable("");
RemoteObject _inrecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
;
Debug.locals.put("id", _id);
 BA.debugLineNum = 1445;BA.debugLine="Sub getASPriority(id As Int) As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 1446;BA.debugLine="Dim retStr As String = \"\"";
Debug.ShouldStop(32);
_retstr = BA.ObjectToString("");Debug.locals.put("retStr", _retstr);Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 1447;BA.debugLine="Private inRecord As ResultSet";
Debug.ShouldStop(64);
_inrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("inRecord", _inrecord);
 BA.debugLineNum = 1448;BA.debugLine="Dim sSQL As String = $\"select tagcode from type_p";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select tagcode from type_prioritytypes where id="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1449;BA.debugLine="inRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(256);
_inrecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1450;BA.debugLine="Do While inRecord.NextRow";
Debug.ShouldStop(512);
while (_inrecord.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1451;BA.debugLine="retStr = inRecord.GetString(\"tagcode\")";
Debug.ShouldStop(1024);
_retstr = _inrecord.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 1452;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 }
;
 BA.debugLineNum = 1455;BA.debugLine="inRecord.Close";
Debug.ShouldStop(16384);
_inrecord.runVoidMethod ("Close");
 BA.debugLineNum = 1456;BA.debugLine="Return retStr";
Debug.ShouldStop(32768);
if (true) return _retstr;
 BA.debugLineNum = 1457;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getasstatus(RemoteObject _ba,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("getASStatus (utils) ","utils",3,_ba,utils.mostCurrent,1432);
if (RapidSub.canDelegate("getasstatus")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getasstatus", _ba, _id);}
RemoteObject _retstr = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
;
Debug.locals.put("id", _id);
 BA.debugLineNum = 1432;BA.debugLine="Sub getASStatus(id As Int) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1433;BA.debugLine="Dim retStr As String = \"\"";
Debug.ShouldStop(16777216);
_retstr = BA.ObjectToString("");Debug.locals.put("retStr", _retstr);Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 1434;BA.debugLine="Private Record As ResultSet";
Debug.ShouldStop(33554432);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1435;BA.debugLine="Dim sSQL As String = $\"select tagcode from type_o";
Debug.ShouldStop(67108864);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select tagcode from type_operationtypes where id="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1436;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(134217728);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1437;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(268435456);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1438;BA.debugLine="retStr = Record.GetString(\"tagcode\")";
Debug.ShouldStop(536870912);
_retstr = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 1439;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 }
;
 BA.debugLineNum = 1441;BA.debugLine="Record.Close";
Debug.ShouldStop(1);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1442;BA.debugLine="Return retStr";
Debug.ShouldStop(2);
if (true) return _retstr;
 BA.debugLineNum = 1443;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getasurgency(RemoteObject _ba,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("getASUrgency (utils) ","utils",3,_ba,utils.mostCurrent,1460);
if (RapidSub.canDelegate("getasurgency")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getasurgency", _ba, _id);}
RemoteObject _retstr = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
;
Debug.locals.put("id", _id);
 BA.debugLineNum = 1460;BA.debugLine="Sub getASUrgency(id As Int) As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1461;BA.debugLine="Dim retStr As String = \"\"";
Debug.ShouldStop(1048576);
_retstr = BA.ObjectToString("");Debug.locals.put("retStr", _retstr);Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 1462;BA.debugLine="Private Record As ResultSet";
Debug.ShouldStop(2097152);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1469;BA.debugLine="Dim sSQL As String = $\"select tagcode from type_g";
Debug.ShouldStop(268435456);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select tagcode from type_gravitytypes where id="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1471;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(1073741824);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1472;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(-2147483648);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1473;BA.debugLine="retStr = Record.GetString(\"tagcode\")";
Debug.ShouldStop(1);
_retstr = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 1474;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 }
;
 BA.debugLineNum = 1476;BA.debugLine="Record.Close";
Debug.ShouldStop(8);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1477;BA.debugLine="Return retStr";
Debug.ShouldStop(16);
if (true) return _retstr;
 BA.debugLineNum = 1478;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolorbyname(RemoteObject _ba,RemoteObject _colorname) throws Exception{
try {
		Debug.PushSubsStack("GetColorByName (utils) ","utils",3,_ba,utils.mostCurrent,38);
if (RapidSub.canDelegate("getcolorbyname")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcolorbyname", _ba, _colorname);}
RemoteObject _colorret = RemoteObject.createImmutable(0);
;
Debug.locals.put("colorname", _colorname);
 BA.debugLineNum = 38;BA.debugLine="Sub GetColorByName(colorname As String) As Int";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Select Case colorname.ToLowerCase";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_colorname.runMethod(true,"toLowerCase"),BA.ObjectToString("white"),BA.ObjectToString("black"),BA.ObjectToString("red"),BA.ObjectToString("green"),BA.ObjectToString("blue"),BA.ObjectToString("yellow"),BA.ObjectToString("lightgray"))) {
case 0: {
 BA.debugLineNum = 41;BA.debugLine="Dim ColorRet As Int = Colors.White";
Debug.ShouldStop(256);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"White");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
case 1: {
 BA.debugLineNum = 43;BA.debugLine="Dim ColorRet As Int = Colors.Black";
Debug.ShouldStop(1024);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
case 2: {
 BA.debugLineNum = 45;BA.debugLine="Dim ColorRet As Int = Colors.Red";
Debug.ShouldStop(4096);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Red");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
case 3: {
 BA.debugLineNum = 47;BA.debugLine="Dim ColorRet As Int = Colors.Green";
Debug.ShouldStop(16384);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Green");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
case 4: {
 BA.debugLineNum = 49;BA.debugLine="Dim ColorRet As Int = Colors.Blue";
Debug.ShouldStop(65536);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Blue");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
case 5: {
 BA.debugLineNum = 51;BA.debugLine="Dim ColorRet As Int = Colors.Yellow";
Debug.ShouldStop(262144);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Yellow");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
case 6: {
 BA.debugLineNum = 53;BA.debugLine="Dim ColorRet As Int = Colors.LightGray";
Debug.ShouldStop(1048576);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
default: {
 BA.debugLineNum = 55;BA.debugLine="Dim ColorRet As Int = Colors.Black";
Debug.ShouldStop(4194304);
_colorret = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");Debug.locals.put("ColorRet", _colorret);Debug.locals.put("ColorRet", _colorret);
 break; }
}
;
 BA.debugLineNum = 58;BA.debugLine="Return ColorRet";
Debug.ShouldStop(33554432);
if (true) return _colorret;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetime(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetime (utils) ","utils",3,_ba,utils.mostCurrent,2851);
if (RapidSub.canDelegate("getcurrdatetime")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetime", _ba);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 2851;BA.debugLine="Sub GetCurrDatetime As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 2852;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(8);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 2853;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(16);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2854;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now} $t";
Debug.ShouldStop(32);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(" "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 2855;BA.debugLine="Return DateName";
Debug.ShouldStop(64);
if (true) return _datename;
 BA.debugLineNum = 2856;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimeext(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeExt (utils) ","utils",3,_ba,utils.mostCurrent,2881);
if (RapidSub.canDelegate("getcurrdatetimeext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimeext", _ba);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 2881;BA.debugLine="Sub GetCurrDatetimeExt As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 2882;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(2);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 2883;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(4);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2884;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now} $t";
Debug.ShouldStop(8);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(" "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 2885;BA.debugLine="Return DateName";
Debug.ShouldStop(16);
if (true) return _datename;
 BA.debugLineNum = 2886;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimefixed(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeFixed (utils) ","utils",3,_ba,utils.mostCurrent,2888);
if (RapidSub.canDelegate("getcurrdatetimefixed")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimefixed", _ba);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 2888;BA.debugLine="Sub GetCurrDatetimeFixed As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 2889;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(256);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2890;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now} 00";
Debug.ShouldStop(512);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(" 00:00:01")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 2891;BA.debugLine="Return DateName";
Debug.ShouldStop(1024);
if (true) return _datename;
 BA.debugLineNum = 2892;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimeformat(RemoteObject _ba,RemoteObject _formdate,RemoteObject _formtime,RemoteObject _space) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeFormat (utils) ","utils",3,_ba,utils.mostCurrent,2797);
if (RapidSub.canDelegate("getcurrdatetimeformat")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimeformat", _ba, _formdate, _formtime, _space);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("formDate", _formdate);
Debug.locals.put("formTime", _formtime);
Debug.locals.put("space", _space);
 BA.debugLineNum = 2797;BA.debugLine="Sub GetCurrDatetimeFormat(formDate As String, form";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2798;BA.debugLine="DateTime.DateFormat = formDate";
Debug.ShouldStop(8192);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_formdate);
 BA.debugLineNum = 2799;BA.debugLine="DateTime.TimeFormat = formTime";
Debug.ShouldStop(16384);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_formtime);
 BA.debugLineNum = 2800;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(32768);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2801;BA.debugLine="If space Then ret = \" \"";
Debug.ShouldStop(65536);
if (_space.<Boolean>get().booleanValue()) { 
_ret = BA.ObjectToString(" ");Debug.locals.put("ret", _ret);};
 BA.debugLineNum = 2802;BA.debugLine="ret = $\"${DateTime.Date(DateTime.Now)}${ret}${Dat";
Debug.ShouldStop(131072);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ret))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2803;BA.debugLine="Return ret";
Debug.ShouldStop(262144);
if (true) return _ret;
 BA.debugLineNum = 2804;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimefrom(RemoteObject _ba,RemoteObject _fromdate,RemoteObject _fromtime) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeFrom (utils) ","utils",3,_ba,utils.mostCurrent,2806);
if (RapidSub.canDelegate("getcurrdatetimefrom")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimefrom", _ba, _fromdate, _fromtime);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("fromDate", _fromdate);
Debug.locals.put("fromTime", _fromtime);
 BA.debugLineNum = 2806;BA.debugLine="Sub GetCurrDatetimeFrom(fromDate As String, fromTi";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 2807;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(4194304);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2808;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(8388608);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 2809;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(16777216);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2810;BA.debugLine="ret = $\"${fromDate} ${fromTime}\"$";
Debug.ShouldStop(33554432);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fromdate))),RemoteObject.createImmutable(" "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fromtime))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2811;BA.debugLine="Return ret";
Debug.ShouldStop(67108864);
if (true) return _ret;
 BA.debugLineNum = 2812;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimet(RemoteObject _ba,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeT (utils) ","utils",3,_ba,utils.mostCurrent,2858);
if (RapidSub.canDelegate("getcurrdatetimet")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimet", _ba, _separator);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
Debug.locals.put("Separator", _separator);
 BA.debugLineNum = 2858;BA.debugLine="Sub GetCurrDatetimeT(Separator As String) As Strin";
Debug.ShouldStop(512);
 BA.debugLineNum = 2859;BA.debugLine="If (Separator = \"\") Then Separator = \" \"";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("=",_separator,RemoteObject.createImmutable("")))) { 
_separator = BA.ObjectToString(" ");Debug.locals.put("Separator", _separator);};
 BA.debugLineNum = 2860;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(2048);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 2861;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(4096);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2862;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}${S";
Debug.ShouldStop(8192);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_separator))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 2863;BA.debugLine="Return DateName";
Debug.ShouldStop(16384);
if (true) return _datename;
 BA.debugLineNum = 2864;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimet2(RemoteObject _ba,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeT2 (utils) ","utils",3,_ba,utils.mostCurrent,2866);
if (RapidSub.canDelegate("getcurrdatetimet2")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimet2", _ba, _separator);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
Debug.locals.put("Separator", _separator);
 BA.debugLineNum = 2866;BA.debugLine="Sub GetCurrDatetimeT2(Separator As String) As Stri";
Debug.ShouldStop(131072);
 BA.debugLineNum = 2867;BA.debugLine="If (Separator = \"\") Then Separator = \" \"";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",_separator,RemoteObject.createImmutable("")))) { 
_separator = BA.ObjectToString(" ");Debug.locals.put("Separator", _separator);};
 BA.debugLineNum = 2868;BA.debugLine="DateTime.TimeFormat = \"HHmm\"";
Debug.ShouldStop(524288);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmm"));
 BA.debugLineNum = 2869;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(1048576);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 2870;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}${S";
Debug.ShouldStop(2097152);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_separator))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 2871;BA.debugLine="Return DateName";
Debug.ShouldStop(4194304);
if (true) return _datename;
 BA.debugLineNum = 2872;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrdatetimet2ext(RemoteObject _ba,RemoteObject _separator) throws Exception{
try {
		Debug.PushSubsStack("GetCurrDatetimeT2Ext (utils) ","utils",3,_ba,utils.mostCurrent,2874);
if (RapidSub.canDelegate("getcurrdatetimet2ext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrdatetimet2ext", _ba, _separator);}
RemoteObject _datename = RemoteObject.createImmutable("");
;
Debug.locals.put("Separator", _separator);
 BA.debugLineNum = 2874;BA.debugLine="Sub GetCurrDatetimeT2Ext(Separator As String) As S";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2875;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(67108864);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 2876;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 2877;BA.debugLine="Dim DateName As String = $\"$date{DateTime.Now}${S";
Debug.ShouldStop(268435456);
_datename = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_separator))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("DateName", _datename);Debug.locals.put("DateName", _datename);
 BA.debugLineNum = 2878;BA.debugLine="Return DateName";
Debug.ShouldStop(536870912);
if (true) return _datename;
 BA.debugLineNum = 2879;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentdate(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentDate (utils) ","utils",3,_ba,utils.mostCurrent,2777);
if (RapidSub.canDelegate("getcurrentdate")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrentdate", _ba);}
;
 BA.debugLineNum = 2777;BA.debugLine="Sub GetCurrentDate As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2778;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(33554432);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2779;BA.debugLine="Return DateTime.Date(DateTime.Now)";
Debug.ShouldStop(67108864);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 2780;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentdateformat(RemoteObject _ba,RemoteObject _form) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentDateFormat (utils) ","utils",3,_ba,utils.mostCurrent,2782);
if (RapidSub.canDelegate("getcurrentdateformat")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrentdateformat", _ba, _form);}
;
Debug.locals.put("form", _form);
 BA.debugLineNum = 2782;BA.debugLine="Sub GetCurrentDateFormat(form As String) As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2783;BA.debugLine="DateTime.DateFormat = form";
Debug.ShouldStop(1073741824);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_form);
 BA.debugLineNum = 2784;BA.debugLine="Return DateTime.Date(DateTime.Now)";
Debug.ShouldStop(-2147483648);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 2785;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentticks(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentTicks (utils) ","utils",3,_ba,utils.mostCurrent,2829);
if (RapidSub.canDelegate("getcurrentticks")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrentticks", _ba);}
;
 BA.debugLineNum = 2829;BA.debugLine="Sub GetCurrentTicks As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2830;BA.debugLine="Return DateTime.Now";
Debug.ShouldStop(8192);
if (true) return BA.NumberToString(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 2831;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttime(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentTime (utils) ","utils",3,_ba,utils.mostCurrent,2814);
if (RapidSub.canDelegate("getcurrenttime")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrenttime", _ba);}
;
 BA.debugLineNum = 2814;BA.debugLine="Sub GetCurrentTime As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2815;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(1073741824);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 2816;BA.debugLine="Return DateTime.Time(DateTime.Now)";
Debug.ShouldStop(-2147483648);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 2817;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttimeext(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentTimeExt (utils) ","utils",3,_ba,utils.mostCurrent,2819);
if (RapidSub.canDelegate("getcurrenttimeext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrenttimeext", _ba);}
;
 BA.debugLineNum = 2819;BA.debugLine="Sub GetCurrentTimeExt As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 2820;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(8);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 2821;BA.debugLine="Return DateTime.Time(DateTime.Now)";
Debug.ShouldStop(16);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 2822;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrenttimeext2(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetCurrentTimeExt2 (utils) ","utils",3,_ba,utils.mostCurrent,2824);
if (RapidSub.canDelegate("getcurrenttimeext2")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getcurrenttimeext2", _ba);}
;
 BA.debugLineNum = 2824;BA.debugLine="Sub GetCurrentTimeExt2 As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 2825;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(256);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 2826;BA.debugLine="Return DateTime.Time(DateTime.Now)";
Debug.ShouldStop(512);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));
 BA.debugLineNum = 2827;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdate(RemoteObject _ba,RemoteObject _dt) throws Exception{
try {
		Debug.PushSubsStack("GetDate (utils) ","utils",3,_ba,utils.mostCurrent,2787);
if (RapidSub.canDelegate("getdate")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getdate", _ba, _dt);}
;
Debug.locals.put("dt", _dt);
 BA.debugLineNum = 2787;BA.debugLine="Sub GetDate(dt As Long) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 2788;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(8);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2789;BA.debugLine="Return DateTime.Date(dt)";
Debug.ShouldStop(16);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dt));
 BA.debugLineNum = 2790;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdateformat(RemoteObject _ba,RemoteObject _dt,RemoteObject _form) throws Exception{
try {
		Debug.PushSubsStack("GetDateFormat (utils) ","utils",3,_ba,utils.mostCurrent,2792);
if (RapidSub.canDelegate("getdateformat")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getdateformat", _ba, _dt, _form);}
;
Debug.locals.put("dt", _dt);
Debug.locals.put("form", _form);
 BA.debugLineNum = 2792;BA.debugLine="Sub GetDateFormat(dt As Long, form As String) As S";
Debug.ShouldStop(128);
 BA.debugLineNum = 2793;BA.debugLine="DateTime.DateFormat = form";
Debug.ShouldStop(256);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_form);
 BA.debugLineNum = 2794;BA.debugLine="Return DateTime.Date(dt)";
Debug.ShouldStop(512);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_dt));
 BA.debugLineNum = 2795;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdevicetype(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceType (utils) ","utils",3,_ba,utils.mostCurrent,1871);
if (RapidSub.canDelegate("getdevicetype")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getdevicetype", _ba);}
RemoteObject _layval = RemoteObject.declareNull("anywheresoftware.b4a.keywords.LayoutValues");
RemoteObject _rot = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 1871;BA.debugLine="Sub GetDeviceType As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1872;BA.debugLine="Dim LayVal As LayoutValues = GetDeviceLayoutValue";
Debug.ShouldStop(32768);
_layval = utils.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",_ba);Debug.locals.put("LayVal", _layval);Debug.locals.put("LayVal", _layval);
 BA.debugLineNum = 1873;BA.debugLine="Dim Rot As Int = DisplayGetRotation";
Debug.ShouldStop(65536);
_rot = _displaygetrotation(_ba);Debug.locals.put("Rot", _rot);Debug.locals.put("Rot", _rot);
 BA.debugLineNum = 1875;BA.debugLine="If LayVal.Height = LayVal.Width Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_layval.getField(true,"Height"),BA.numberCast(double.class, _layval.getField(true,"Width")))) { 
 BA.debugLineNum = 1876;BA.debugLine="Return 2";
Debug.ShouldStop(524288);
if (true) return BA.numberCast(int.class, 2);
 }else 
{ BA.debugLineNum = 1877;BA.debugLine="Else If Rot = 0 Or Rot = 2 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_rot,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_rot,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1878;BA.debugLine="If LayVal.Height > LayVal.Width Then Return 0";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(">",_layval.getField(true,"Height"),BA.numberCast(double.class, _layval.getField(true,"Width")))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 1879;BA.debugLine="Return 1";
Debug.ShouldStop(4194304);
if (true) return BA.numberCast(int.class, 1);
 }else {
 BA.debugLineNum = 1881;BA.debugLine="If LayVal.Height < LayVal.Width Then Return 0";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",_layval.getField(true,"Height"),BA.numberCast(double.class, _layval.getField(true,"Width")))) { 
if (true) return BA.numberCast(int.class, 0);};
 BA.debugLineNum = 1882;BA.debugLine="Return 1";
Debug.ShouldStop(33554432);
if (true) return BA.numberCast(int.class, 1);
 }}
;
 BA.debugLineNum = 1884;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdoctype(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetDocType (utils) ","utils",3,_ba,utils.mostCurrent,1638);
if (RapidSub.canDelegate("getdoctype")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getdoctype", _ba, _filename);}
RemoteObject _doc = RemoteObject.createImmutable("");
RemoteObject _docx = RemoteObject.createImmutable("");
RemoteObject _pdf = RemoteObject.createImmutable("");
RemoteObject _ppt = RemoteObject.createImmutable("");
RemoteObject _pptx = RemoteObject.createImmutable("");
RemoteObject _xls = RemoteObject.createImmutable("");
RemoteObject _xlsx = RemoteObject.createImmutable("");
RemoteObject _png = RemoteObject.createImmutable("");
RemoteObject _jpeg = RemoteObject.createImmutable("");
RemoteObject _jpg = RemoteObject.createImmutable("");
RemoteObject _txt = RemoteObject.createImmutable("");
RemoteObject _gif = RemoteObject.createImmutable("");
RemoteObject _zip = RemoteObject.createImmutable("");
RemoteObject _rar = RemoteObject.createImmutable("");
RemoteObject _rtf = RemoteObject.createImmutable("");
RemoteObject _wav = RemoteObject.createImmutable("");
RemoteObject _mp3 = RemoteObject.createImmutable("");
RemoteObject _ext = RemoteObject.createImmutable("");
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1638;BA.debugLine="Sub GetDocType(FileName As String) As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 1639;BA.debugLine="Dim DOC As String = \".doc\"";
Debug.ShouldStop(64);
_doc = BA.ObjectToString(".doc");Debug.locals.put("DOC", _doc);Debug.locals.put("DOC", _doc);
 BA.debugLineNum = 1640;BA.debugLine="Dim DOCX As String = \".docx\"";
Debug.ShouldStop(128);
_docx = BA.ObjectToString(".docx");Debug.locals.put("DOCX", _docx);Debug.locals.put("DOCX", _docx);
 BA.debugLineNum = 1641;BA.debugLine="Dim PDF As String = \".pdf\"";
Debug.ShouldStop(256);
_pdf = BA.ObjectToString(".pdf");Debug.locals.put("PDF", _pdf);Debug.locals.put("PDF", _pdf);
 BA.debugLineNum = 1642;BA.debugLine="Dim PPT As String = \".ppt\"";
Debug.ShouldStop(512);
_ppt = BA.ObjectToString(".ppt");Debug.locals.put("PPT", _ppt);Debug.locals.put("PPT", _ppt);
 BA.debugLineNum = 1643;BA.debugLine="Dim PPTX As String = \".pptx\"";
Debug.ShouldStop(1024);
_pptx = BA.ObjectToString(".pptx");Debug.locals.put("PPTX", _pptx);Debug.locals.put("PPTX", _pptx);
 BA.debugLineNum = 1644;BA.debugLine="Dim XLS As String = \".xls\"";
Debug.ShouldStop(2048);
_xls = BA.ObjectToString(".xls");Debug.locals.put("XLS", _xls);Debug.locals.put("XLS", _xls);
 BA.debugLineNum = 1645;BA.debugLine="Dim XLSX As String = \".xlsx\"";
Debug.ShouldStop(4096);
_xlsx = BA.ObjectToString(".xlsx");Debug.locals.put("XLSX", _xlsx);Debug.locals.put("XLSX", _xlsx);
 BA.debugLineNum = 1646;BA.debugLine="Dim PNG As String = \".png\"";
Debug.ShouldStop(8192);
_png = BA.ObjectToString(".png");Debug.locals.put("PNG", _png);Debug.locals.put("PNG", _png);
 BA.debugLineNum = 1647;BA.debugLine="Dim JPEG As String = \".jpeg\"";
Debug.ShouldStop(16384);
_jpeg = BA.ObjectToString(".jpeg");Debug.locals.put("JPEG", _jpeg);Debug.locals.put("JPEG", _jpeg);
 BA.debugLineNum = 1648;BA.debugLine="Dim JPG As String = \".jpg\"";
Debug.ShouldStop(32768);
_jpg = BA.ObjectToString(".jpg");Debug.locals.put("JPG", _jpg);Debug.locals.put("JPG", _jpg);
 BA.debugLineNum = 1649;BA.debugLine="Dim TXT As String = \".txt\"";
Debug.ShouldStop(65536);
_txt = BA.ObjectToString(".txt");Debug.locals.put("TXT", _txt);Debug.locals.put("TXT", _txt);
 BA.debugLineNum = 1650;BA.debugLine="Dim GIF As String = \".gif\"";
Debug.ShouldStop(131072);
_gif = BA.ObjectToString(".gif");Debug.locals.put("GIF", _gif);Debug.locals.put("GIF", _gif);
 BA.debugLineNum = 1651;BA.debugLine="Dim ZIP As String = \".zip\"";
Debug.ShouldStop(262144);
_zip = BA.ObjectToString(".zip");Debug.locals.put("ZIP", _zip);Debug.locals.put("ZIP", _zip);
 BA.debugLineNum = 1652;BA.debugLine="Dim RAR As String = \".rar\"";
Debug.ShouldStop(524288);
_rar = BA.ObjectToString(".rar");Debug.locals.put("RAR", _rar);Debug.locals.put("RAR", _rar);
 BA.debugLineNum = 1653;BA.debugLine="Dim RTF As String = \".rtf\"";
Debug.ShouldStop(1048576);
_rtf = BA.ObjectToString(".rtf");Debug.locals.put("RTF", _rtf);Debug.locals.put("RTF", _rtf);
 BA.debugLineNum = 1654;BA.debugLine="Dim WAV As String = \".wav\"";
Debug.ShouldStop(2097152);
_wav = BA.ObjectToString(".wav");Debug.locals.put("WAV", _wav);Debug.locals.put("WAV", _wav);
 BA.debugLineNum = 1655;BA.debugLine="Dim MP3 As String = \".mp3\"";
Debug.ShouldStop(4194304);
_mp3 = BA.ObjectToString(".mp3");Debug.locals.put("MP3", _mp3);Debug.locals.put("MP3", _mp3);
 BA.debugLineNum = 1657;BA.debugLine="Dim Ext As String = GetFileExt(FileName)";
Debug.ShouldStop(16777216);
_ext = _getfileext(_ba,_filename);Debug.locals.put("Ext", _ext);Debug.locals.put("Ext", _ext);
 BA.debugLineNum = 1659;BA.debugLine="If(Ext.EqualsIgnoreCase(DOC) Or Ext.EqualsIgnoreC";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_doc))) || RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_docx))))) { 
 BA.debugLineNum = 1660;BA.debugLine="Return \"application/msword\"";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToString("application/msword");
 }else 
{ BA.debugLineNum = 1661;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(PDF)) Then";
Debug.ShouldStop(268435456);
if ((_ext.runMethod(true,"equalsIgnoreCase",(Object)(_pdf))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1662;BA.debugLine="Return \"application/pdf\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("application/pdf");
 }else 
{ BA.debugLineNum = 1663;BA.debugLine="Else If(Ext.EqualsIgnoreCase(PPT) Or Ext.EqualsIg";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_ppt))) || RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_pptx))))) { 
 BA.debugLineNum = 1664;BA.debugLine="Return \"application/vnd.ms-powerpoint\"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString("application/vnd.ms-powerpoint");
 }else 
{ BA.debugLineNum = 1665;BA.debugLine="Else If(Ext.EqualsIgnoreCase(XLS) Or Ext.EqualsIg";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_xls))) || RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_xlsx))))) { 
 BA.debugLineNum = 1666;BA.debugLine="Return \"application/vnd.ms-excel\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("application/vnd.ms-excel");
 }else 
{ BA.debugLineNum = 1667;BA.debugLine="Else If(Ext.EqualsIgnoreCase(PNG) Or Ext.EqualsIg";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_png))) || RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_jpeg))) || RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_jpg))))) { 
 BA.debugLineNum = 1668;BA.debugLine="Return \"image/jpeg\"";
Debug.ShouldStop(8);
if (true) return BA.ObjectToString("image/jpeg");
 }else 
{ BA.debugLineNum = 1669;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(TXT)) Then";
Debug.ShouldStop(16);
if ((_ext.runMethod(true,"equalsIgnoreCase",(Object)(_txt))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1670;BA.debugLine="Return \"text/plain\"";
Debug.ShouldStop(32);
if (true) return BA.ObjectToString("text/plain");
 }else 
{ BA.debugLineNum = 1671;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(GIF)) Then";
Debug.ShouldStop(64);
if ((_ext.runMethod(true,"equalsIgnoreCase",(Object)(_gif))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1672;BA.debugLine="Return \"image/gif\"";
Debug.ShouldStop(128);
if (true) return BA.ObjectToString("image/gif");
 }else 
{ BA.debugLineNum = 1673;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(ZIP)) Then";
Debug.ShouldStop(256);
if ((_ext.runMethod(true,"equalsIgnoreCase",(Object)(_zip))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1674;BA.debugLine="Return \"application/zip\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("application/zip");
 }else 
{ BA.debugLineNum = 1675;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(RAR)) Then";
Debug.ShouldStop(1024);
if ((_ext.runMethod(true,"equalsIgnoreCase",(Object)(_rar))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1676;BA.debugLine="Return \"application/x-rar-compressed\"";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("application/x-rar-compressed");
 }else 
{ BA.debugLineNum = 1677;BA.debugLine="Else If	(Ext.EqualsIgnoreCase(RTF)) Then";
Debug.ShouldStop(4096);
if ((_ext.runMethod(true,"equalsIgnoreCase",(Object)(_rtf))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1678;BA.debugLine="Return \"application/rtf\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("application/rtf");
 }else 
{ BA.debugLineNum = 1679;BA.debugLine="Else If(Ext.EqualsIgnoreCase(WAV) Or Ext.EqualsIg";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_wav))) || RemoteObject.solveBoolean(".",_ext.runMethod(true,"equalsIgnoreCase",(Object)(_mp3))))) { 
 BA.debugLineNum = 1680;BA.debugLine="Return \"audio/x-wav\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("audio/x-wav");
 }}}}}}}}}}}
;
 BA.debugLineNum = 1682;BA.debugLine="Return \"\"";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 1683;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfileext(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFileExt (utils) ","utils",3,_ba,utils.mostCurrent,1685);
if (RapidSub.canDelegate("getfileext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getfileext", _ba, _filename);}
;
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1685;BA.debugLine="Sub GetFileExt(FileName As String) As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1686;BA.debugLine="If NNE(FileName) Then";
Debug.ShouldStop(2097152);
if (_nne(_ba,_filename).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1687;BA.debugLine="Return FileName.SubString2(FileName.LastIndexof(";
Debug.ShouldStop(4194304);
if (true) return _filename.runMethod(true,"substring",(Object)(_filename.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))),(Object)(_filename.runMethod(true,"length")));
 }else {
 BA.debugLineNum = 1689;BA.debugLine="Return \"\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 1691;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfreemem(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetFreeMem (utils) ","utils",3,_ba,utils.mostCurrent,3275);
if (RapidSub.canDelegate("getfreemem")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getfreemem", _ba);}
;
 BA.debugLineNum = 3275;BA.debugLine="Sub GetFreeMem As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3284;BA.debugLine="Return \"\" '\"F:\" & Round2(FM,2) & \",  T:\" & Round2";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("");
 BA.debugLineNum = 3295;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgeolocationformat(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getGeoLocationFormat (utils) ","utils",3,_ba,utils.mostCurrent,1167);
if (RapidSub.canDelegate("getgeolocationformat")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getgeolocationformat", _ba);}
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 1167;BA.debugLine="Sub getGeoLocationFormat As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1168;BA.debugLine="Private sACLALatitude As String = \"\"";
Debug.ShouldStop(32768);
_saclalatitude = BA.ObjectToString("");Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 1169;BA.debugLine="Private sACLALongitude As String = \"\"";
Debug.ShouldStop(65536);
_saclalongitude = BA.ObjectToString("");Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 1170;BA.debugLine="If Not(isNullOrEmpty(LocationService.GeoLocal.lat";
Debug.ShouldStop(131072);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_isnullorempty(_ba,utils.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1171;BA.debugLine="Try";
Debug.ShouldStop(262144);
try { BA.debugLineNum = 1172;BA.debugLine="sACLALatitude = LocationService.GeoLocal.lat";
Debug.ShouldStop(524288);
_saclalatitude = utils.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ );Debug.locals.put("sACLALatitude", _saclalatitude);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e7) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e7.toString()); BA.debugLineNum = 1174;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65767175",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 1175;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(4194304);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 1178;BA.debugLine="If Not(isNullOrEmpty(LocationService.GeoLocal.lon";
Debug.ShouldStop(33554432);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_isnullorempty(_ba,utils.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1179;BA.debugLine="Try";
Debug.ShouldStop(67108864);
try { BA.debugLineNum = 1180;BA.debugLine="sACLALongitude = LocationService.GeoLocal.lon";
Debug.ShouldStop(134217728);
_saclalongitude = utils.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ );Debug.locals.put("sACLALongitude", _saclalongitude);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e15.toString()); BA.debugLineNum = 1182;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65767183",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 1183;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(1073741824);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 1186;BA.debugLine="Return $\"${sACLALatitude},${sACLALongitude}\"$";
Debug.ShouldStop(2);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalatitude))),RemoteObject.createImmutable(","),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalongitude))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 1187;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getintentfiletype(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetIntentFileType (utils) ","utils",3,_ba,utils.mostCurrent,1603);
if (RapidSub.canDelegate("getintentfiletype")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getintentfiletype", _ba, _filename);}
RemoteObject _filetype = RemoteObject.createImmutable("");
;
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 1603;BA.debugLine="Sub GetIntentFileType(filename As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 1604;BA.debugLine="Dim Filetype As String";
Debug.ShouldStop(8);
_filetype = RemoteObject.createImmutable("");Debug.locals.put("Filetype", _filetype);
 BA.debugLineNum = 1605;BA.debugLine="Filetype = filename.Substring(filename.LastIndexO";
Debug.ShouldStop(16);
_filetype = _filename.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_filename.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("Filetype", _filetype);
 BA.debugLineNum = 1606;BA.debugLine="Log(filename)";
Debug.ShouldStop(32);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66946819",_filename,0);
 BA.debugLineNum = 1608;BA.debugLine="Select Filetype";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(_filetype,BA.ObjectToString("doc"),BA.ObjectToString("docx"),BA.ObjectToString("jpg"),BA.ObjectToString("mp3"),BA.ObjectToString("mpeg"),BA.ObjectToString("ppt"),BA.ObjectToString("pptx"),BA.ObjectToString("pdf"),BA.ObjectToString("xls"),BA.ObjectToString("xlsx"),BA.ObjectToString("txt"),BA.ObjectToString("xml"))) {
case 0: {
 BA.debugLineNum = 1610;BA.debugLine="Return \"application/msword\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("application/msword");
 break; }
case 1: {
 BA.debugLineNum = 1612;BA.debugLine="Return \"application/vnd.openxmlformats-officedo";
Debug.ShouldStop(2048);
if (true) return BA.ObjectToString("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
 break; }
case 2: {
 BA.debugLineNum = 1614;BA.debugLine="Return \"image/jpeg\"";
Debug.ShouldStop(8192);
if (true) return BA.ObjectToString("image/jpeg");
 break; }
case 3: {
 BA.debugLineNum = 1616;BA.debugLine="Return \"audio/mpeg\"";
Debug.ShouldStop(32768);
if (true) return BA.ObjectToString("audio/mpeg");
 break; }
case 4: {
 BA.debugLineNum = 1618;BA.debugLine="Return \"video/mpeg\"";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToString("video/mpeg");
 break; }
case 5: {
 BA.debugLineNum = 1620;BA.debugLine="Return \"application/vnd.ms-powerpointtd>\"";
Debug.ShouldStop(524288);
if (true) return BA.ObjectToString("application/vnd.ms-powerpointtd>");
 break; }
case 6: {
 BA.debugLineNum = 1622;BA.debugLine="Return \"application/vnd.openxmlformats-officedo";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToString("application/vnd.openxmlformats-officedocument.presentationml.presentation");
 break; }
case 7: {
 BA.debugLineNum = 1624;BA.debugLine="Return \"application/pdf\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("application/pdf");
 break; }
case 8: {
 BA.debugLineNum = 1626;BA.debugLine="Return \"application/vnd.ms-excel\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("application/vnd.ms-excel");
 break; }
case 9: {
 BA.debugLineNum = 1628;BA.debugLine="Return \"application/vnd.openxmlformats-officedo";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToString("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
 break; }
case 10: {
 BA.debugLineNum = 1630;BA.debugLine="Return \"text/plain\"";
Debug.ShouldStop(536870912);
if (true) return BA.ObjectToString("text/plain");
 break; }
case 11: {
 BA.debugLineNum = 1632;BA.debugLine="Return \"application/xml\"";
Debug.ShouldStop(-2147483648);
if (true) return BA.ObjectToString("application/xml");
 break; }
default: {
 BA.debugLineNum = 1634;BA.debugLine="Return \"application/vnd.android.package-archive";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("application/vnd.android.package-archive");
 break; }
}
;
 BA.debugLineNum = 1636;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlast60days(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetLast60Days (utils) ","utils",3,_ba,utils.mostCurrent,2842);
if (RapidSub.canDelegate("getlast60days")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlast60days", _ba);}
RemoteObject _p60 = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _newdate = RemoteObject.createImmutable(0L);
;
 BA.debugLineNum = 2842;BA.debugLine="Sub GetLast60Days As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 2843;BA.debugLine="Dim p60 As Period";
Debug.ShouldStop(67108864);
_p60 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p60", _p60);
 BA.debugLineNum = 2844;BA.debugLine="p60.days = -60";
Debug.ShouldStop(134217728);
_p60.setField ("Days",BA.numberCast(int.class, -(double) (0 + 60)));
 BA.debugLineNum = 2845;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(268435456);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 2846;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2847;BA.debugLine="Dim NewDate As Long = DateUtils.AddPeriod(DateTim";
Debug.ShouldStop(1073741824);
_newdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_p60));Debug.locals.put("NewDate", _newdate);Debug.locals.put("NewDate", _newdate);
 BA.debugLineNum = 2848;BA.debugLine="Return $\"$date{NewDate} 00:10\"$";
Debug.ShouldStop(-2147483648);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((_newdate))),RemoteObject.createImmutable(" 00:10")));
 BA.debugLineNum = 2849;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastmonthdate(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetLastMonthDate (utils) ","utils",3,_ba,utils.mostCurrent,2701);
if (RapidSub.canDelegate("getlastmonthdate")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlastmonthdate", _ba);}
;
 BA.debugLineNum = 2701;BA.debugLine="Sub GetLastMonthDate As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 2702;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(8192);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2709;BA.debugLine="Return DateTime.Date(GetLastMonthDateLong)";
Debug.ShouldStop(1048576);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_getlastmonthdatelong(_ba)));
 BA.debugLineNum = 2710;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastmonthdatelong(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetLastMonthDateLong (utils) ","utils",3,_ba,utils.mostCurrent,2692);
if (RapidSub.canDelegate("getlastmonthdatelong")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlastmonthdatelong", _ba);}
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
RemoteObject _lastmonthdate = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
 BA.debugLineNum = 2692;BA.debugLine="Sub GetLastMonthDateLong As Long";
Debug.ShouldStop(8);
 BA.debugLineNum = 2693;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
Debug.ShouldStop(16);
_currentdate = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 2694;BA.debugLine="Dim LastMonthDate  As Long";
Debug.ShouldStop(32);
_lastmonthdate = RemoteObject.createImmutable(0L);Debug.locals.put("LastMonthDate", _lastmonthdate);
 BA.debugLineNum = 2695;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(64);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2696;BA.debugLine="p1.Days = -30";
Debug.ShouldStop(128);
_p1.setField ("Days",BA.numberCast(int.class, -(double) (0 + 30)));
 BA.debugLineNum = 2697;BA.debugLine="LastMonthDate = DateUtils.AddPeriod(CurrentDate,";
Debug.ShouldStop(256);
_lastmonthdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentdate),(Object)(_p1));Debug.locals.put("LastMonthDate", _lastmonthdate);
 BA.debugLineNum = 2698;BA.debugLine="Return LastMonthDate";
Debug.ShouldStop(512);
if (true) return _lastmonthdate;
 BA.debugLineNum = 2699;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastndays(RemoteObject _ba,RemoteObject _days) throws Exception{
try {
		Debug.PushSubsStack("GetLastNDays (utils) ","utils",3,_ba,utils.mostCurrent,2722);
if (RapidSub.canDelegate("getlastndays")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlastndays", _ba, _days);}
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
RemoteObject _lastweekdate = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
Debug.locals.put("days", _days);
 BA.debugLineNum = 2722;BA.debugLine="Sub GetLastNDays(days As Int) As String";
Debug.ShouldStop(2);
 BA.debugLineNum = 2723;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(4);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2724;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
Debug.ShouldStop(8);
_currentdate = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 2725;BA.debugLine="Dim LastWeekDate  As Long";
Debug.ShouldStop(16);
_lastweekdate = RemoteObject.createImmutable(0L);Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2726;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(32);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2727;BA.debugLine="p1.Days = -days";
Debug.ShouldStop(64);
_p1.setField ("Days",BA.numberCast(int.class, -(double) (0 + _days.<Integer>get().intValue())));
 BA.debugLineNum = 2728;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
Debug.ShouldStop(128);
_lastweekdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentdate),(Object)(_p1));Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2729;BA.debugLine="Return DateTime.Date(LastWeekDate)";
Debug.ShouldStop(256);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lastweekdate));
 BA.debugLineNum = 2730;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastndayslong(RemoteObject _ba,RemoteObject _days) throws Exception{
try {
		Debug.PushSubsStack("GetLastNDaysLong (utils) ","utils",3,_ba,utils.mostCurrent,2747);
if (RapidSub.canDelegate("getlastndayslong")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlastndayslong", _ba, _days);}
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
RemoteObject _lastweekdate = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
Debug.locals.put("days", _days);
 BA.debugLineNum = 2747;BA.debugLine="Sub GetLastNDaysLong(days As Int) As Long";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2748;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2749;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
Debug.ShouldStop(268435456);
_currentdate = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 2750;BA.debugLine="Dim LastWeekDate  As Long";
Debug.ShouldStop(536870912);
_lastweekdate = RemoteObject.createImmutable(0L);Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2751;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(1073741824);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2752;BA.debugLine="p1.Days = -days";
Debug.ShouldStop(-2147483648);
_p1.setField ("Days",BA.numberCast(int.class, -(double) (0 + _days.<Integer>get().intValue())));
 BA.debugLineNum = 2753;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
Debug.ShouldStop(1);
_lastweekdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentdate),(Object)(_p1));Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2754;BA.debugLine="Return LastWeekDate";
Debug.ShouldStop(2);
if (true) return _lastweekdate;
 BA.debugLineNum = 2755;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastweekdate(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetLastWeekDate (utils) ","utils",3,_ba,utils.mostCurrent,2712);
if (RapidSub.canDelegate("getlastweekdate")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlastweekdate", _ba);}
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
RemoteObject _lastweekdate = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
 BA.debugLineNum = 2712;BA.debugLine="Sub GetLastWeekDate As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2713;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(16777216);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2714;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
Debug.ShouldStop(33554432);
_currentdate = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 2715;BA.debugLine="Dim LastWeekDate  As Long";
Debug.ShouldStop(67108864);
_lastweekdate = RemoteObject.createImmutable(0L);Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2716;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(134217728);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2717;BA.debugLine="p1.Days = -7";
Debug.ShouldStop(268435456);
_p1.setField ("Days",BA.numberCast(int.class, -(double) (0 + 7)));
 BA.debugLineNum = 2718;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
Debug.ShouldStop(536870912);
_lastweekdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentdate),(Object)(_p1));Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2719;BA.debugLine="Return DateTime.Date(LastWeekDate)";
Debug.ShouldStop(1073741824);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lastweekdate));
 BA.debugLineNum = 2720;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistasstr(RemoteObject _ba,RemoteObject _arr) throws Exception{
try {
		Debug.PushSubsStack("GetListAsStr (utils) ","utils",3,_ba,utils.mostCurrent,3015);
if (RapidSub.canDelegate("getlistasstr")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlistasstr", _ba, _arr);}
RemoteObject _sret = RemoteObject.createImmutable("");
int _n = 0;
;
Debug.locals.put("arr", _arr);
 BA.debugLineNum = 3015;BA.debugLine="Sub GetListAsStr(arr As List) As String";
Debug.ShouldStop(64);
 BA.debugLineNum = 3016;BA.debugLine="Dim sRet As String = \"\"";
Debug.ShouldStop(128);
_sret = BA.ObjectToString("");Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 3017;BA.debugLine="If (arr.IsInitialized) Then";
Debug.ShouldStop(256);
if ((_arr.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3018;BA.debugLine="If (arr.Size >0) Then";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean(">",_arr.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 3019;BA.debugLine="For n=0 To arr.Size-1";
Debug.ShouldStop(1024);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_arr.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step4 > 0 && _n <= limit4) || (step4 < 0 && _n >= limit4) ;_n = ((int)(0 + _n + step4))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3020;BA.debugLine="If NNE(sRet) Then";
Debug.ShouldStop(2048);
if (_nne(_ba,_sret).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3021;BA.debugLine="sRet = $\"${sRet}, \"$";
Debug.ShouldStop(4096);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(", ")));Debug.locals.put("sRet", _sret);
 };
 BA.debugLineNum = 3023;BA.debugLine="sRet = $\"${sRet}${arr.Get(n)}\"$";
Debug.ShouldStop(16384);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_arr.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))))),RemoteObject.createImmutable("")));Debug.locals.put("sRet", _sret);
 }
}Debug.locals.put("n", _n);
;
 };
 };
 BA.debugLineNum = 3027;BA.debugLine="Return sRet";
Debug.ShouldStop(262144);
if (true) return _sret;
 BA.debugLineNum = 3028;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getliststrarrayitems(RemoteObject _ba,RemoteObject _arr) throws Exception{
try {
		Debug.PushSubsStack("GetListStrArrayItems (utils) ","utils",3,_ba,utils.mostCurrent,3010);
if (RapidSub.canDelegate("getliststrarrayitems")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getliststrarrayitems", _ba, _arr);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("arr", _arr);
 BA.debugLineNum = 3010;BA.debugLine="Sub GetListStrArrayItems(arr() As String) As List";
Debug.ShouldStop(2);
 BA.debugLineNum = 3011;BA.debugLine="Dim lst As List = arr";
Debug.ShouldStop(4);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(_arr));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 3012;BA.debugLine="Return lst";
Debug.ShouldStop(8);
if (true) return _lst;
 BA.debugLineNum = 3013;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlocaluserstatus(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetLocalUserStatus (utils) ","utils",3,_ba,utils.mostCurrent,3639);
if (RapidSub.canDelegate("getlocaluserstatus")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlocaluserstatus", _ba);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 3639;BA.debugLine="Sub GetLocalUserStatus As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 3641;BA.debugLine="If ShareCode.USER_LOCAL_MAP.IsInitialized Then";
Debug.ShouldStop(16777216);
if (utils.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3642;BA.debugLine="ShareCode.USER_LOCAL_MAP.Clear";
Debug.ShouldStop(33554432);
utils.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 3644;BA.debugLine="ShareCode.USER_LOCAL_MAP.Initialize";
Debug.ShouldStop(134217728);
utils.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 3647;BA.debugLine="If File.Exists(	Starter.InternalFolder,\"USER_STAT";
Debug.ShouldStop(1073741824);
if (utils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("USER_STATUS.MAP"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3648;BA.debugLine="ShareCode.USER_LOCAL_MAP = File.readMap(Starter.";
Debug.ShouldStop(-2147483648);
utils.mostCurrent._sharecode._user_local_map /*RemoteObject*/  = utils.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadMap",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable("USER_STATUS.MAP")));
 BA.debugLineNum = 3649;BA.debugLine="Dim ret As String = ShareCode.USER_LOCAL_MAP.Get";
Debug.ShouldStop(1);
_ret = BA.ObjectToString(utils.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runMethod(false,"Get",(Object)((utils.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 }else {
 BA.debugLineNum = 3651;BA.debugLine="ret = \"\"";
Debug.ShouldStop(4);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 3654;BA.debugLine="Return ret";
Debug.ShouldStop(32);
if (true) return _ret;
 BA.debugLineNum = 3656;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlogerrorslist(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getLogErrorsList (utils) ","utils",3,_ba,utils.mostCurrent,1210);
if (RapidSub.canDelegate("getlogerrorslist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlogerrorslist", _ba);}
RemoteObject _strlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _condition = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 1210;BA.debugLine="Sub getLogErrorsList As List";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1211;BA.debugLine="Dim StrList As List";
Debug.ShouldStop(67108864);
_strlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("StrList", _strlist);
 BA.debugLineNum = 1212;BA.debugLine="StrList.Initialize";
Debug.ShouldStop(134217728);
_strlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1214;BA.debugLine="Private Record As ResultSet";
Debug.ShouldStop(536870912);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1215;BA.debugLine="Dim sSQL As String = $\"select * from log_errors w";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.createImmutable("select * from log_errors where reported=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1216;BA.debugLine="Record = Starter.LocalSQLWRK.ExecQuery(sSQL)";
Debug.ShouldStop(-2147483648);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1217;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(1);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1221;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1222;BA.debugLine="params.Initialize";
Debug.ShouldStop(32);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1223;BA.debugLine="params.Put(\"logdatetime\", Record.GetString(\"log";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdatetime"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logdatetime"))))));
 BA.debugLineNum = 1224;BA.debugLine="params.Put(\"logaction\", Record.GetString(\"logac";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logaction"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logaction"))))));
 BA.debugLineNum = 1225;BA.debugLine="params.Put(\"loguser\", Record.GetString(\"loguser";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loguser"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loguser"))))));
 BA.debugLineNum = 1226;BA.debugLine="params.Put(\"loglocation\", Record.GetString(\"log";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglocation"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loglocation"))))));
 BA.debugLineNum = 1227;BA.debugLine="params.Put(\"logmessage\", Record.GetString(\"logm";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logmessage"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logmessage"))))));
 BA.debugLineNum = 1228;BA.debugLine="params.Put(\"logdevice\", Record.GetString(\"logde";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdevice"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logdevice"))))));
 BA.debugLineNum = 1229;BA.debugLine="params.Put(\"reported\", 1)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1230;BA.debugLine="StrList.Add(params)";
Debug.ShouldStop(8192);
_strlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1232;BA.debugLine="Dim Mapping As Map";
Debug.ShouldStop(32768);
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Mapping", _mapping);
 BA.debugLineNum = 1233;BA.debugLine="Mapping.Initialize";
Debug.ShouldStop(65536);
_mapping.runVoidMethod ("Initialize");
 BA.debugLineNum = 1234;BA.debugLine="Mapping.Put(\"reported\", 1)";
Debug.ShouldStop(131072);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1235;BA.debugLine="Dim Condition As Map";
Debug.ShouldStop(262144);
_condition = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 1236;BA.debugLine="Condition.Initialize";
Debug.ShouldStop(524288);
_condition.runVoidMethod ("Initialize");
 BA.debugLineNum = 1237;BA.debugLine="Condition.Put(\"logdatetime\", Record.GetString(\"";
Debug.ShouldStop(1048576);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdatetime"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logdatetime"))))));
 BA.debugLineNum = 1238;BA.debugLine="Condition.Put(\"loglocation\", Record.GetString(\"";
Debug.ShouldStop(2097152);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglocation"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loglocation"))))));
 BA.debugLineNum = 1239;BA.debugLine="Condition.Put(\"reported\", 0)";
Debug.ShouldStop(4194304);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1240;BA.debugLine="DBUtils.UpdateRecord2(Starter.LocalSQLWRK, \"log_";
Debug.ShouldStop(8388608);
utils.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("log_errors")),(Object)(_mapping),(Object)(_condition));
 }
;
 BA.debugLineNum = 1244;BA.debugLine="Record.Close";
Debug.ShouldStop(134217728);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1245;BA.debugLine="Return StrList";
Debug.ShouldStop(268435456);
if (true) return _strlist;
 BA.debugLineNum = 1246;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlogpositionslist(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("getLogPositionsList (utils) ","utils",3,_ba,utils.mostCurrent,1248);
if (RapidSub.canDelegate("getlogpositionslist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getlogpositionslist", _ba);}
RemoteObject _strlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _condition = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 1248;BA.debugLine="Sub getLogPositionsList As List";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1249;BA.debugLine="Dim StrList As List";
Debug.ShouldStop(1);
_strlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("StrList", _strlist);
 BA.debugLineNum = 1250;BA.debugLine="StrList.Initialize";
Debug.ShouldStop(2);
_strlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1252;BA.debugLine="Private Record As ResultSet";
Debug.ShouldStop(8);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 1253;BA.debugLine="Dim sSQL As String = $\"select * from log_position";
Debug.ShouldStop(16);
_ssql = (RemoteObject.createImmutable("select * from log_positions where reported=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1254;BA.debugLine="Record = Starter.LocalSQLWRK.ExecQuery(sSQL)";
Debug.ShouldStop(32);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 1255;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(64);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1259;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1024);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1260;BA.debugLine="params.Initialize";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1261;BA.debugLine="params.Put(\"logdatetime\", Record.GetString(\"log";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdatetime"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logdatetime"))))));
 BA.debugLineNum = 1262;BA.debugLine="params.Put(\"loguser\", Record.GetString(\"loguser";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loguser"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loguser"))))));
 BA.debugLineNum = 1263;BA.debugLine="params.Put(\"loglatitude\", Record.GetString(\"log";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglatitude"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loglatitude"))))));
 BA.debugLineNum = 1264;BA.debugLine="params.Put(\"loglongitude\", Record.GetString(\"lo";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglongitude"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loglongitude"))))));
 BA.debugLineNum = 1265;BA.debugLine="params.Put(\"logdevice\", Record.GetString(\"logde";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdevice"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logdevice"))))));
 BA.debugLineNum = 1266;BA.debugLine="params.Put(\"reported\", 1)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1267;BA.debugLine="StrList.Add(params)";
Debug.ShouldStop(262144);
_strlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1269;BA.debugLine="Dim Mapping As Map";
Debug.ShouldStop(1048576);
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Mapping", _mapping);
 BA.debugLineNum = 1270;BA.debugLine="Mapping.Initialize";
Debug.ShouldStop(2097152);
_mapping.runVoidMethod ("Initialize");
 BA.debugLineNum = 1271;BA.debugLine="Mapping.Put(\"reported\", 1)";
Debug.ShouldStop(4194304);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1272;BA.debugLine="Dim Condition As Map";
Debug.ShouldStop(8388608);
_condition = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Condition", _condition);
 BA.debugLineNum = 1273;BA.debugLine="Condition.Initialize";
Debug.ShouldStop(16777216);
_condition.runVoidMethod ("Initialize");
 BA.debugLineNum = 1274;BA.debugLine="Condition.Put(\"logdatetime\", Record.GetString(\"";
Debug.ShouldStop(33554432);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdatetime"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("logdatetime"))))));
 BA.debugLineNum = 1275;BA.debugLine="Condition.Put(\"loglatitude\", Record.GetString(\"";
Debug.ShouldStop(67108864);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglatitude"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loglatitude"))))));
 BA.debugLineNum = 1276;BA.debugLine="Condition.Put(\"loglongitude\", Record.GetString(";
Debug.ShouldStop(134217728);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglongitude"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("loglongitude"))))));
 BA.debugLineNum = 1277;BA.debugLine="Condition.Put(\"reported\", 0)";
Debug.ShouldStop(268435456);
_condition.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1278;BA.debugLine="DBUtils.UpdateRecord2(Starter.LocalSQLWRK, \"log_";
Debug.ShouldStop(536870912);
utils.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("log_positions")),(Object)(_mapping),(Object)(_condition));
 }
;
 BA.debugLineNum = 1282;BA.debugLine="Record.Close";
Debug.ShouldStop(2);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1283;BA.debugLine="Return StrList";
Debug.ShouldStop(4);
if (true) return _strlist;
 BA.debugLineNum = 1284;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapkeyindex(RemoteObject _ba,RemoteObject _mm,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetMapKeyIndex (utils) ","utils",3,_ba,utils.mostCurrent,2406);
if (RapidSub.canDelegate("getmapkeyindex")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getmapkeyindex", _ba, _mm, _index);}
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("Object");
RemoteObject _k = RemoteObject.createImmutable("");
;
Debug.locals.put("mm", _mm);
Debug.locals.put("index", _index);
 BA.debugLineNum = 2406;BA.debugLine="Sub GetMapKeyIndex(mm As Map, index As Int) As Obj";
Debug.ShouldStop(32);
 BA.debugLineNum = 2407;BA.debugLine="Dim idx As Int = 0";
Debug.ShouldStop(64);
_idx = BA.numberCast(int.class, 0);Debug.locals.put("idx", _idx);Debug.locals.put("idx", _idx);
 BA.debugLineNum = 2408;BA.debugLine="Dim v As Object = \"\"";
Debug.ShouldStop(128);
_v = RemoteObject.createImmutable((""));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 2409;BA.debugLine="For Each k As String In mm.Keys";
Debug.ShouldStop(256);
{
final RemoteObject group3 = _mm.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 2410;BA.debugLine="If idx = index Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_idx,BA.numberCast(double.class, _index))) { 
 BA.debugLineNum = 2411;BA.debugLine="v = k 'mm.Get(k)";
Debug.ShouldStop(1024);
_v = (_k);Debug.locals.put("v", _v);
 BA.debugLineNum = 2412;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 BA.debugLineNum = 2414;BA.debugLine="idx = idx + 1";
Debug.ShouldStop(8192);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idx", _idx);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 2416;BA.debugLine="Return v";
Debug.ShouldStop(32768);
if (true) return _v;
 BA.debugLineNum = 2417;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnextndays(RemoteObject _ba,RemoteObject _days) throws Exception{
try {
		Debug.PushSubsStack("GetNextNDays (utils) ","utils",3,_ba,utils.mostCurrent,2767);
if (RapidSub.canDelegate("getnextndays")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getnextndays", _ba, _days);}
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
RemoteObject _lastweekdate = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
Debug.locals.put("days", _days);
 BA.debugLineNum = 2767;BA.debugLine="Sub GetNextNDays(days As Int) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 2768;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(32768);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2769;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
Debug.ShouldStop(65536);
_currentdate = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 2770;BA.debugLine="Dim LastWeekDate  As Long";
Debug.ShouldStop(131072);
_lastweekdate = RemoteObject.createImmutable(0L);Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2771;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(262144);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2772;BA.debugLine="p1.Days = days";
Debug.ShouldStop(524288);
_p1.setField ("Days",_days);
 BA.debugLineNum = 2773;BA.debugLine="LastWeekDate = DateUtils.AddPeriod(CurrentDate, p";
Debug.ShouldStop(1048576);
_lastweekdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentdate),(Object)(_p1));Debug.locals.put("LastWeekDate", _lastweekdate);
 BA.debugLineNum = 2774;BA.debugLine="Return DateTime.Date(LastWeekDate)";
Debug.ShouldStop(2097152);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_lastweekdate));
 BA.debugLineNum = 2775;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnextweekdate(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetNextWeekDate (utils) ","utils",3,_ba,utils.mostCurrent,2757);
if (RapidSub.canDelegate("getnextweekdate")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getnextweekdate", _ba);}
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
RemoteObject _nextweekdate = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
 BA.debugLineNum = 2757;BA.debugLine="Sub GetNextWeekDate As String";
Debug.ShouldStop(16);
 BA.debugLineNum = 2758;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(32);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2759;BA.debugLine="Dim CurrentDate As Long = DateTime.Now";
Debug.ShouldStop(64);
_currentdate = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 2760;BA.debugLine="Dim NextWeekDate  As Long";
Debug.ShouldStop(128);
_nextweekdate = RemoteObject.createImmutable(0L);Debug.locals.put("NextWeekDate", _nextweekdate);
 BA.debugLineNum = 2761;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(256);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2762;BA.debugLine="p1.Days = 7";
Debug.ShouldStop(512);
_p1.setField ("Days",BA.numberCast(int.class, 7));
 BA.debugLineNum = 2763;BA.debugLine="NextWeekDate = DateUtils.AddPeriod(CurrentDate, p";
Debug.ShouldStop(1024);
_nextweekdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentdate),(Object)(_p1));Debug.locals.put("NextWeekDate", _nextweekdate);
 BA.debugLineNum = 2764;BA.debugLine="Return DateTime.Date(NextWeekDate)";
Debug.ShouldStop(2048);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_nextweekdate));
 BA.debugLineNum = 2765;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablecolumnsvalues(RemoteObject _ba,RemoteObject _table) throws Exception{
try {
		Debug.PushSubsStack("GetTableColumnsValues (utils) ","utils",3,_ba,utils.mostCurrent,3707);
if (RapidSub.canDelegate("gettablecolumnsvalues")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","gettablecolumnsvalues", _ba, _table);}
RemoteObject _mainscript = RemoteObject.createImmutable("");
RemoteObject _columns = RemoteObject.createImmutable("");
RemoteObject _script = RemoteObject.createImmutable("");
RemoteObject _recordori = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
int _n = 0;
RemoteObject _valueslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _values = RemoteObject.createImmutable("");
;
Debug.locals.put("table", _table);
 BA.debugLineNum = 3707;BA.debugLine="Sub GetTableColumnsValues(table As String) As Stri";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3708;BA.debugLine="Dim MainScript As String = \"\"";
Debug.ShouldStop(134217728);
_mainscript = BA.ObjectToString("");Debug.locals.put("MainScript", _mainscript);Debug.locals.put("MainScript", _mainscript);
 BA.debugLineNum = 3709;BA.debugLine="Dim Columns As String = \"\"";
Debug.ShouldStop(268435456);
_columns = BA.ObjectToString("");Debug.locals.put("Columns", _columns);Debug.locals.put("Columns", _columns);
 BA.debugLineNum = 3710;BA.debugLine="Dim Script As String = $\"select * from ${table} l";
Debug.ShouldStop(536870912);
_script = (RemoteObject.concat(RemoteObject.createImmutable("select * from "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" limit 1")));Debug.locals.put("Script", _script);Debug.locals.put("Script", _script);
 BA.debugLineNum = 3712;BA.debugLine="Private RecordOri As ResultSet = Starter.LocalSQL";
Debug.ShouldStop(-2147483648);
_recordori = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordori = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_script)));Debug.locals.put("RecordOri", _recordori);
 BA.debugLineNum = 3713;BA.debugLine="For n=0 To RecordOri.ColumnCount-1";
Debug.ShouldStop(1);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_recordori.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3714;BA.debugLine="If NNE(Columns) Then";
Debug.ShouldStop(2);
if (_nne(_ba,_columns).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3715;BA.debugLine="Columns = $\"${Columns},\"$";
Debug.ShouldStop(4);
_columns = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_columns))),RemoteObject.createImmutable(",")));Debug.locals.put("Columns", _columns);
 };
 BA.debugLineNum = 3717;BA.debugLine="Columns = $\"${Columns} ${ RecordOri.GetColumnNam";
Debug.ShouldStop(16);
_columns = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_columns))),RemoteObject.createImmutable(" "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_recordori.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _n)))))),RemoteObject.createImmutable("")));Debug.locals.put("Columns", _columns);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3719;BA.debugLine="Dim ValuesList As List : ValuesList.Initialize";
Debug.ShouldStop(64);
_valueslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ValuesList", _valueslist);
 BA.debugLineNum = 3719;BA.debugLine="Dim ValuesList As List : ValuesList.Initialize";
Debug.ShouldStop(64);
_valueslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 3720;BA.debugLine="If NNE(Columns) Then";
Debug.ShouldStop(128);
if (_nne(_ba,_columns).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3721;BA.debugLine="Do While RecordOri.NextRow";
Debug.ShouldStop(256);
while (_recordori.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 3722;BA.debugLine="Dim Values As String = \"\"";
Debug.ShouldStop(512);
_values = BA.ObjectToString("");Debug.locals.put("Values", _values);Debug.locals.put("Values", _values);
 BA.debugLineNum = 3723;BA.debugLine="For n=0 To RecordOri.ColumnCount-1";
Debug.ShouldStop(1024);
{
final int step16 = 1;
final int limit16 = RemoteObject.solve(new RemoteObject[] {_recordori.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step16 > 0 && _n <= limit16) || (step16 < 0 && _n >= limit16) ;_n = ((int)(0 + _n + step16))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3724;BA.debugLine="If NNE(Values) Then";
Debug.ShouldStop(2048);
if (_nne(_ba,_values).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3725;BA.debugLine="Values = $\"${Values},\"$";
Debug.ShouldStop(4096);
_values = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_values))),RemoteObject.createImmutable(",")));Debug.locals.put("Values", _values);
 };
 BA.debugLineNum = 3727;BA.debugLine="Values = $\"${Values} '${RecordOri.GetString(Re";
Debug.ShouldStop(16384);
_values = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_values))),RemoteObject.createImmutable(" '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_recordori.runMethod(true,"GetString",(Object)(_recordori.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _n)))))))),RemoteObject.createImmutable("'")));Debug.locals.put("Values", _values);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3729;BA.debugLine="If NNE(Values) Then";
Debug.ShouldStop(65536);
if (_nne(_ba,_values).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3730;BA.debugLine="Values = $\"(${Values})\"$";
Debug.ShouldStop(131072);
_values = (RemoteObject.concat(RemoteObject.createImmutable("("),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_values))),RemoteObject.createImmutable(")")));Debug.locals.put("Values", _values);
 BA.debugLineNum = 3731;BA.debugLine="ValuesList.Add(Values)";
Debug.ShouldStop(262144);
_valueslist.runVoidMethod ("Add",(Object)((_values)));
 };
 }
;
 };
 BA.debugLineNum = 3736;BA.debugLine="If (ValuesList.Size > 0) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean(">",_valueslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 3737;BA.debugLine="For n=0 To ValuesList.Size-1";
Debug.ShouldStop(16777216);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_valueslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step29 > 0 && _n <= limit29) || (step29 < 0 && _n >= limit29) ;_n = ((int)(0 + _n + step29))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3738;BA.debugLine="If NNE(MainScript) Then";
Debug.ShouldStop(33554432);
if (_nne(_ba,_mainscript).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3739;BA.debugLine="MainScript = $\"${MainScript},\"$";
Debug.ShouldStop(67108864);
_mainscript = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mainscript))),RemoteObject.createImmutable(",")));Debug.locals.put("MainScript", _mainscript);
 };
 BA.debugLineNum = 3741;BA.debugLine="MainScript = $\"${MainScript} '${ValuesList.get(";
Debug.ShouldStop(268435456);
_mainscript = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mainscript))),RemoteObject.createImmutable(" '"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_valueslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))))),RemoteObject.createImmutable("'")));Debug.locals.put("MainScript", _mainscript);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3743;BA.debugLine="If NNE(MainScript) Then";
Debug.ShouldStop(1073741824);
if (_nne(_ba,_mainscript).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3744;BA.debugLine="MainScript = $\"insert into ${table} (${Columns}";
Debug.ShouldStop(-2147483648);
_mainscript = (RemoteObject.concat(RemoteObject.createImmutable("insert into "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(" ("),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_columns))),RemoteObject.createImmutable(") values "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mainscript))),RemoteObject.createImmutable(";")));Debug.locals.put("MainScript", _mainscript);
 };
 };
 BA.debugLineNum = 3747;BA.debugLine="Return MainScript";
Debug.ShouldStop(4);
if (true) return _mainscript;
 BA.debugLineNum = 3748;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getversion(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetVersion (utils) ","utils",3,_ba,utils.mostCurrent,3696);
if (RapidSub.canDelegate("getversion")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getversion", _ba);}
RemoteObject _name = RemoteObject.declareNull("Object");
;
 BA.debugLineNum = 3696;BA.debugLine="Sub GetVersion As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 3702;BA.debugLine="Dim name As Object = Application.VersionCode";
Debug.ShouldStop(2097152);
_name = (utils.mostCurrent.__c.getField(false,"Application").runMethod(true,"getVersionCode"));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 3704;BA.debugLine="Return name";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString(_name);
 BA.debugLineNum = 3705;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getviewtext(RemoteObject _ba,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("getViewText (utils) ","utils",3,_ba,utils.mostCurrent,2264);
if (RapidSub.canDelegate("getviewtext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getviewtext", _ba, _v);}
RemoteObject _ret = RemoteObject.createImmutable("");
;
Debug.locals.put("v", _v);
 BA.debugLineNum = 2264;BA.debugLine="Sub getViewText(v As B4XView) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2265;BA.debugLine="Dim ret As String = v.Text";
Debug.ShouldStop(16777216);
_ret = _v.runMethod(true,"getText");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 2266;BA.debugLine="Return ret";
Debug.ShouldStop(33554432);
if (true) return _ret;
 BA.debugLineNum = 2267;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getyesterday(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetYesterday (utils) ","utils",3,_ba,utils.mostCurrent,2833);
if (RapidSub.canDelegate("getyesterday")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","getyesterday", _ba);}
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _newdate = RemoteObject.createImmutable(0L);
;
 BA.debugLineNum = 2833;BA.debugLine="Sub GetYesterday As String";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2834;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(131072);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2835;BA.debugLine="p1.days = -1";
Debug.ShouldStop(262144);
_p1.setField ("Days",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 2836;BA.debugLine="DateTime.TimeFormat = \"HH:mm\"";
Debug.ShouldStop(524288);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 2837;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1048576);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2838;BA.debugLine="Dim NewDate As Long = DateUtils.AddPeriod(DateTim";
Debug.ShouldStop(2097152);
_newdate = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_p1));Debug.locals.put("NewDate", _newdate);Debug.locals.put("NewDate", _newdate);
 BA.debugLineNum = 2839;BA.debugLine="Return $\"$date{NewDate} 00:10\"$";
Debug.ShouldStop(4194304);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((_newdate))),RemoteObject.createImmutable(" 00:10")));
 BA.debugLineNum = 2840;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasfeature(RemoteObject _ba,RemoteObject _feature) throws Exception{
try {
		Debug.PushSubsStack("HasFeature (utils) ","utils",3,_ba,utils.mostCurrent,1998);
if (RapidSub.canDelegate("hasfeature")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","hasfeature", _ba, _feature);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("Feature", _feature);
 BA.debugLineNum = 1998;BA.debugLine="Sub HasFeature(Feature As String) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1999;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(16384);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 2000;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(32768);
_r.setField ("Target",(_r.runMethod(false,"GetContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 2001;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
Debug.ShouldStop(65536);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPackageManager"))));
 BA.debugLineNum = 2002;BA.debugLine="Return r.RunMethod2(\"hasSystemFeature\", Feature,";
Debug.ShouldStop(131072);
if (true) return BA.ObjectToBoolean(_r.runMethod(false,"RunMethod2",(Object)(BA.ObjectToString("hasSystemFeature")),(Object)(_feature),(Object)(RemoteObject.createImmutable("java.lang.String"))));
 BA.debugLineNum = 2003;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hextocolor(RemoteObject _ba,RemoteObject _hex) throws Exception{
try {
		Debug.PushSubsStack("HexToColor (utils) ","utils",3,_ba,utils.mostCurrent,2005);
if (RapidSub.canDelegate("hextocolor")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","hextocolor", _ba, _hex);}
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _ints = null;
;
Debug.locals.put("Hex", _hex);
 BA.debugLineNum = 2005;BA.debugLine="Sub HexToColor(Hex As String) As Int";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2006;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(2097152);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 2007;BA.debugLine="If Hex.StartsWith(\"#\") Then";
Debug.ShouldStop(4194304);
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("#"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2008;BA.debugLine="Hex = Hex.SubString(1)";
Debug.ShouldStop(8388608);
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Hex", _hex);
 }else 
{ BA.debugLineNum = 2009;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
Debug.ShouldStop(16777216);
if (_hex.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("0x"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2010;BA.debugLine="Hex = Hex.SubString(2)";
Debug.ShouldStop(33554432);
_hex = _hex.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("Hex", _hex);
 }}
;
 BA.debugLineNum = 2012;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
Debug.ShouldStop(134217728);
_ints = _bc.runMethod(false,"IntsFromBytes",(Object)(_bc.runMethod(false,"HexToBytes",(Object)(_hex))));Debug.locals.put("ints", _ints);Debug.locals.put("ints", _ints);
 BA.debugLineNum = 2013;BA.debugLine="Return ints(0)";
Debug.ShouldStop(268435456);
if (true) return _ints.getArrayElement(true,BA.numberCast(int.class, 0));
 BA.debugLineNum = 2014;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _htmlcolor2int(RemoteObject _ba,RemoteObject _hcolor) throws Exception{
try {
		Debug.PushSubsStack("HtmlColor2Int (utils) ","utils",3,_ba,utils.mostCurrent,3805);
if (RapidSub.canDelegate("htmlcolor2int")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","htmlcolor2int", _ba, _hcolor);}
RemoteObject _resultint = RemoteObject.createImmutable(0);
;
Debug.locals.put("Hcolor", _hcolor);
 BA.debugLineNum = 3805;BA.debugLine="Sub HtmlColor2Int(Hcolor As String) As Int";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3807;BA.debugLine="Dim ResultInt As Int = 0";
Debug.ShouldStop(1073741824);
_resultint = BA.numberCast(int.class, 0);Debug.locals.put("ResultInt", _resultint);Debug.locals.put("ResultInt", _resultint);
 BA.debugLineNum = 3809;BA.debugLine="If Hcolor = \"#02b8c5\" Or Hcolor = \"blue\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#02b8c5")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("blue"))) { 
 BA.debugLineNum = 3810;BA.debugLine="ResultInt = Consts.ColorBlue";
Debug.ShouldStop(2);
_resultint = utils.mostCurrent._consts._colorblue /*RemoteObject*/ ;Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3811;BA.debugLine="else if Hcolor = \"#febb03\" Or Hcolor = \"yellow\" T";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#febb03")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("yellow"))) { 
 BA.debugLineNum = 3812;BA.debugLine="ResultInt = Consts.ColorYellow";
Debug.ShouldStop(8);
_resultint = utils.mostCurrent._consts._coloryellow /*RemoteObject*/ ;Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3813;BA.debugLine="else if Hcolor = \"#0d893c\" Or Hcolor = \"green\" Th";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#0d893c")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("green"))) { 
 BA.debugLineNum = 3814;BA.debugLine="ResultInt = Consts.ColorGreen";
Debug.ShouldStop(32);
_resultint = utils.mostCurrent._consts._colorgreen /*RemoteObject*/ ;Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3815;BA.debugLine="else if Hcolor = \"#d13339\" Or Hcolor = \"red\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#d13339")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("red"))) { 
 BA.debugLineNum = 3816;BA.debugLine="ResultInt = Consts.ColorRed";
Debug.ShouldStop(128);
_resultint = utils.mostCurrent._consts._colorred /*RemoteObject*/ ;Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3817;BA.debugLine="else if Hcolor =\"#717a8e\" Or Hcolor = \"gray\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#717a8e")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("gray"))) { 
 BA.debugLineNum = 3818;BA.debugLine="ResultInt = Consts.ColorGray";
Debug.ShouldStop(512);
_resultint = utils.mostCurrent._consts._colorgray /*RemoteObject*/ ;Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3819;BA.debugLine="else if Hcolor = \"#0b7030\" Or Hcolor = \"darkgreen";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#0b7030")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("darkgreen"))) { 
 BA.debugLineNum = 3820;BA.debugLine="ResultInt = Consts.DarkGreen";
Debug.ShouldStop(2048);
_resultint = utils.mostCurrent._consts._darkgreen /*RemoteObject*/ ;Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3821;BA.debugLine="else if Hcolor = \"#000000\" Or Hcolor = \"black\" Th";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#000000")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("black"))) { 
 BA.debugLineNum = 3822;BA.debugLine="ResultInt = Colors.Black";
Debug.ShouldStop(8192);
_resultint = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");Debug.locals.put("ResultInt", _resultint);
 }else 
{ BA.debugLineNum = 3823;BA.debugLine="else if Hcolor = \"#ffffff\" Or Hcolor = \"white\" Th";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("#ffffff")) || RemoteObject.solveBoolean("=",_hcolor,BA.ObjectToString("white"))) { 
 BA.debugLineNum = 3824;BA.debugLine="ResultInt = Colors.white";
Debug.ShouldStop(32768);
_resultint = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"White");Debug.locals.put("ResultInt", _resultint);
 }else {
 BA.debugLineNum = 3826;BA.debugLine="ResultInt = Colors.Black";
Debug.ShouldStop(131072);
_resultint = utils.mostCurrent.__c.getField(false,"Colors").getField(true,"Black");Debug.locals.put("ResultInt", _resultint);
 }}}}}}}}
;
 BA.debugLineNum = 3829;BA.debugLine="Return ResultInt";
Debug.ShouldStop(1048576);
if (true) return _resultint;
 BA.debugLineNum = 3830;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ifnotnullorempty(RemoteObject _ba,RemoteObject _instr,RemoteObject _notstr) throws Exception{
try {
		Debug.PushSubsStack("IfNotNullOrEmpty (utils) ","utils",3,_ba,utils.mostCurrent,2353);
if (RapidSub.canDelegate("ifnotnullorempty")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","ifnotnullorempty", _ba, _instr, _notstr);}
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("notStr", _notstr);
 BA.debugLineNum = 2353;BA.debugLine="Sub IfNotNullOrEmpty(inStr As String, notStr As St";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2354;BA.debugLine="If NNE(inStr) Then";
Debug.ShouldStop(131072);
if (_nne(_ba,_instr).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2355;BA.debugLine="Return notStr";
Debug.ShouldStop(262144);
if (true) return _notstr;
 }else {
 BA.debugLineNum = 2357;BA.debugLine="Return inStr";
Debug.ShouldStop(1048576);
if (true) return _instr;
 };
 BA.debugLineNum = 2359;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ifnotnulloremptyadd(RemoteObject _ba,RemoteObject _instr,RemoteObject _addstr) throws Exception{
try {
		Debug.PushSubsStack("IfNotNullOrEmptyAdd (utils) ","utils",3,_ba,utils.mostCurrent,2361);
if (RapidSub.canDelegate("ifnotnulloremptyadd")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","ifnotnulloremptyadd", _ba, _instr, _addstr);}
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("addStr", _addstr);
 BA.debugLineNum = 2361;BA.debugLine="Sub IfNotNullOrEmptyAdd(inStr As String, addStr As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2362;BA.debugLine="If NNE(inStr) Then";
Debug.ShouldStop(33554432);
if (_nne(_ba,_instr).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2363;BA.debugLine="Return $\"${inStr}${addStr}\"$";
Debug.ShouldStop(67108864);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_instr))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_addstr))),RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 2365;BA.debugLine="Return inStr";
Debug.ShouldStop(268435456);
if (true) return _instr;
 };
 BA.debugLineNum = 2367;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ifnullorempty(RemoteObject _ba,RemoteObject _instr,RemoteObject _nullstr) throws Exception{
try {
		Debug.PushSubsStack("IfNullOrEmpty (utils) ","utils",3,_ba,utils.mostCurrent,2321);
if (RapidSub.canDelegate("ifnullorempty")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","ifnullorempty", _ba, _instr, _nullstr);}
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("nullStr", _nullstr);
 BA.debugLineNum = 2321;BA.debugLine="Sub IfNullOrEmpty(inStr As String, nullStr As Stri";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2322;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 2323;BA.debugLine="If (isNullOrEmpty(inStr) = True) Then";
Debug.ShouldStop(262144);
if ((RemoteObject.solveBoolean("=",_isnullorempty(_ba,_instr),utils.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 2324;BA.debugLine="Return nullStr";
Debug.ShouldStop(524288);
Debug.CheckDeviceExceptions();if (true) return _nullstr;
 }else {
 BA.debugLineNum = 2326;BA.debugLine="Return inStr";
Debug.ShouldStop(2097152);
Debug.CheckDeviceExceptions();if (true) return _instr;
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 2329;BA.debugLine="Return nullStr";
Debug.ShouldStop(16777216);
if (true) return _nullstr;
 };
 BA.debugLineNum = 2331;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ifnulloremptydouble(RemoteObject _ba,RemoteObject _instr,RemoteObject _nullstr) throws Exception{
try {
		Debug.PushSubsStack("IfNullOrEmptyDouble (utils) ","utils",3,_ba,utils.mostCurrent,2345);
if (RapidSub.canDelegate("ifnulloremptydouble")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","ifnulloremptydouble", _ba, _instr, _nullstr);}
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("nullStr", _nullstr);
 BA.debugLineNum = 2345;BA.debugLine="Sub IfNullOrEmptyDouble(inStr As String, nullStr A";
Debug.ShouldStop(256);
 BA.debugLineNum = 2346;BA.debugLine="If ((isNullOrEmpty(inStr) = True) Or Not(TestNumb";
Debug.ShouldStop(512);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_isnullorempty(_ba,_instr),utils.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_testnumber(_ba,_instr)))))) { 
 BA.debugLineNum = 2347;BA.debugLine="Return nullStr";
Debug.ShouldStop(1024);
if (true) return _nullstr;
 }else {
 BA.debugLineNum = 2349;BA.debugLine="Return inStr";
Debug.ShouldStop(4096);
if (true) return BA.numberCast(double.class, _instr);
 };
 BA.debugLineNum = 2351;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ifnulloremptyint(RemoteObject _ba,RemoteObject _instr,RemoteObject _nullstr) throws Exception{
try {
		Debug.PushSubsStack("IfNullOrEmptyInt (utils) ","utils",3,_ba,utils.mostCurrent,2333);
if (RapidSub.canDelegate("ifnulloremptyint")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","ifnulloremptyint", _ba, _instr, _nullstr);}
;
Debug.locals.put("inStr", _instr);
Debug.locals.put("nullStr", _nullstr);
 BA.debugLineNum = 2333;BA.debugLine="Sub IfNullOrEmptyInt(inStr As String, nullStr As I";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2334;BA.debugLine="If ((isNullOrEmpty(inStr) = True) Or Not(IsNumber";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_isnullorempty(_ba,_instr),utils.mostCurrent.__c.getField(true,"True"))))) || RemoteObject.solveBoolean(".",utils.mostCurrent.__c.runMethod(true,"Not",(Object)(utils.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_instr))))))) { 
 BA.debugLineNum = 2335;BA.debugLine="Return nullStr";
Debug.ShouldStop(1073741824);
if (true) return _nullstr;
 }else {
 BA.debugLineNum = 2337;BA.debugLine="Return inStr";
Debug.ShouldStop(1);
if (true) return BA.numberCast(int.class, _instr);
 };
 BA.debugLineNum = 2339;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iftrue(RemoteObject _ba,RemoteObject _condition,RemoteObject _strue,RemoteObject _sfalse) throws Exception{
try {
		Debug.PushSubsStack("IfTrue (utils) ","utils",3,_ba,utils.mostCurrent,2313);
if (RapidSub.canDelegate("iftrue")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","iftrue", _ba, _condition, _strue, _sfalse);}
;
Debug.locals.put("condition", _condition);
Debug.locals.put("sTrue", _strue);
Debug.locals.put("sFalse", _sfalse);
 BA.debugLineNum = 2313;BA.debugLine="Sub IfTrue(condition As Boolean, sTrue As String,";
Debug.ShouldStop(256);
 BA.debugLineNum = 2314;BA.debugLine="If (condition) Then";
Debug.ShouldStop(512);
if ((_condition).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2315;BA.debugLine="Return sTrue";
Debug.ShouldStop(1024);
if (true) return _strue;
 }else {
 BA.debugLineNum = 2317;BA.debugLine="Return sFalse";
Debug.ShouldStop(4096);
if (true) return _sfalse;
 };
 BA.debugLineNum = 2319;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagetobase64(RemoteObject _ba,RemoteObject _folder,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ImageToBase64 (utils) ","utils",3,_ba,utils.mostCurrent,3465);
if (RapidSub.canDelegate("imagetobase64")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","imagetobase64", _ba, _folder, _filename);}
RemoteObject _continuar = RemoteObject.createImmutable(false);
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
;
Debug.locals.put("Folder", _folder);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 3465;BA.debugLine="Sub ImageToBase64(Folder As String, Filename As St";
Debug.ShouldStop(256);
 BA.debugLineNum = 3466;BA.debugLine="Dim Continuar As Boolean = True";
Debug.ShouldStop(512);
_continuar = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continuar", _continuar);Debug.locals.put("Continuar", _continuar);
 BA.debugLineNum = 3467;BA.debugLine="Try";
Debug.ShouldStop(1024);
try { BA.debugLineNum = 3468;BA.debugLine="Dim img As B4XBitmap = xui.LoadBitmap(Folder, Fi";
Debug.ShouldStop(2048);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
_img = utils._xui.runMethod(false,"LoadBitmap",(Object)(_folder),(Object)(_filename));Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e5.toString()); BA.debugLineNum = 3470;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8192);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","615204357",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 3471;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(16384);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 BA.debugLineNum = 3472;BA.debugLine="Continuar = False";
Debug.ShouldStop(32768);
_continuar = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("Continuar", _continuar);
 };
 BA.debugLineNum = 3474;BA.debugLine="If Continuar Then";
Debug.ShouldStop(131072);
if (_continuar.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3475;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(262144);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 3476;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(524288);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 3477;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(1048576);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3478;BA.debugLine="img.WriteToStream(out, ShareCode.DEVICE_DEF_QUAL";
Debug.ShouldStop(2097152);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(utils.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),utils.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 3479;BA.debugLine="Return su.EncodeBase64(out.ToBytesArray)";
Debug.ShouldStop(4194304);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_out.runMethod(false,"ToBytesArray")));
 };
 BA.debugLineNum = 3481;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagetobase642(RemoteObject _ba,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("ImageToBase642 (utils) ","utils",3,_ba,utils.mostCurrent,3483);
if (RapidSub.canDelegate("imagetobase642")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","imagetobase642", _ba, _img);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
;
Debug.locals.put("img", _img);
 BA.debugLineNum = 3483;BA.debugLine="Sub ImageToBase642(img As B4XBitmap) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3484;BA.debugLine="If img.IsInitialized Then";
Debug.ShouldStop(134217728);
if (_img.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3486;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(536870912);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 3487;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1073741824);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 3488;BA.debugLine="out.InitializeToBytesArray(0)";
Debug.ShouldStop(-2147483648);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3489;BA.debugLine="img.WriteToStream(out, ShareCode.DEVICE_DEF_QUAL";
Debug.ShouldStop(1);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(utils.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),utils.mostCurrent._sharecode._device_def_img_filetype /*RemoteObject*/ )));
 BA.debugLineNum = 3490;BA.debugLine="Return su.EncodeBase64(out.ToBytesArray)";
Debug.ShouldStop(2);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_out.runMethod(false,"ToBytesArray")));
 };
 BA.debugLineNum = 3492;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _incchars(RemoteObject _ba,RemoteObject _len,RemoteObject _charstr,RemoteObject _toleft) throws Exception{
try {
		Debug.PushSubsStack("IncChars (utils) ","utils",3,_ba,utils.mostCurrent,1030);
if (RapidSub.canDelegate("incchars")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","incchars", _ba, _len, _charstr, _toleft);}
RemoteObject _ret = RemoteObject.createImmutable("");
int _n = 0;
;
Debug.locals.put("len", _len);
Debug.locals.put("charstr", _charstr);
Debug.locals.put("toLeft", _toleft);
 BA.debugLineNum = 1030;BA.debugLine="Sub IncChars(len As Int, charstr As String, toLeft";
Debug.ShouldStop(32);
 BA.debugLineNum = 1031;BA.debugLine="Dim ret As String = \"\"";
Debug.ShouldStop(64);
_ret = BA.ObjectToString("");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1032;BA.debugLine="For n=0 To len-1";
Debug.ShouldStop(128);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_len,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step2 > 0 && _n <= limit2) || (step2 < 0 && _n >= limit2) ;_n = ((int)(0 + _n + step2))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 1033;BA.debugLine="If (toLeft = True) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_toleft,utils.mostCurrent.__c.getField(true,"True")))) { 
 BA.debugLineNum = 1034;BA.debugLine="ret = $\"${charstr}${ret}\"$";
Debug.ShouldStop(512);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_charstr))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ret))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 }else {
 BA.debugLineNum = 1036;BA.debugLine="ret = $\"${ret}${charstr}\"$";
Debug.ShouldStop(2048);
_ret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ret))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_charstr))),RemoteObject.createImmutable("")));Debug.locals.put("ret", _ret);
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1039;BA.debugLine="Return ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 1040;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertmapswithlog(RemoteObject _ba,RemoteObject _sql,RemoteObject _typelog,RemoteObject _tablename,RemoteObject _listofmaps,RemoteObject _request,RemoteObject _local) throws Exception{
try {
		Debug.PushSubsStack("InsertMapsWithLog (utils) ","utils",3,_ba,utils.mostCurrent,1354);
if (RapidSub.canDelegate("insertmapswithlog")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","insertmapswithlog", _ba, _sql, _typelog, _tablename, _listofmaps, _request, _local);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i1 = 0;
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ss = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TypeLog", _typelog);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("ListOfMaps", _listofmaps);
Debug.locals.put("request", _request);
Debug.locals.put("Local", _local);
 BA.debugLineNum = 1354;BA.debugLine="Public Sub InsertMapsWithLog(SQL As SQL, TypeLog A";
Debug.ShouldStop(512);
 BA.debugLineNum = 1355;BA.debugLine="Dim sb, columns, values As StringBuilder";
Debug.ShouldStop(1024);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 1357;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_listofmaps.runMethod(true,"getSize"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))),_listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 1358;BA.debugLine="Log(\"Same Map found twice in list. Each item in";
Debug.ShouldStop(8192);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66094852",RemoteObject.createImmutable("Same Map found twice in list. Each item in the list should include a different map object."),0);
 BA.debugLineNum = 1359;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1361;BA.debugLine="SQL.BeginTransaction";
Debug.ShouldStop(65536);
_sql.runVoidMethod ("BeginTransaction");
 BA.debugLineNum = 1362;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1363;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
Debug.ShouldStop(262144);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
for (;(step8 > 0 && _i1 <= limit8) || (step8 < 0 && _i1 >= limit8) ;_i1 = ((int)(0 + _i1 + step8))  ) {
Debug.locals.put("i1", _i1);
 BA.debugLineNum = 1364;BA.debugLine="sb.Initialize";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1365;BA.debugLine="columns.Initialize";
Debug.ShouldStop(1048576);
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 1366;BA.debugLine="values.Initialize";
Debug.ShouldStop(2097152);
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 1367;BA.debugLine="Dim listOfValues As List";
Debug.ShouldStop(4194304);
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 1368;BA.debugLine="listOfValues.Initialize";
Debug.ShouldStop(8388608);
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 1369;BA.debugLine="sb.Append(\"INSERT INTO \" & TableName & \" (\")";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO "),_tablename,RemoteObject.createImmutable(" ("))));
 BA.debugLineNum = 1370;BA.debugLine="Dim m As Map = ListOfMaps.Get(i1)";
Debug.ShouldStop(33554432);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _listofmaps.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 1371;BA.debugLine="For Each col As String In m.Keys";
Debug.ShouldStop(67108864);
{
final RemoteObject group16 = _m.runMethod(false,"Keys");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_col = BA.ObjectToString(group16.runMethod(false,"Get",index16));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 1372;BA.debugLine="Dim value As Object = m.Get(col)";
Debug.ShouldStop(134217728);
_value = _m.runMethod(false,"Get",(Object)((_col)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1379;BA.debugLine="If col = \"id\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_col,BA.ObjectToString("id"))) { 
 BA.debugLineNum = 1380;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(T";
Debug.ShouldStop(8);
_maxid = RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,_ba,(Object)(_tablename),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxid", _maxid);Debug.locals.put("maxid", _maxid);
 BA.debugLineNum = 1381;BA.debugLine="value = maxid";
Debug.ShouldStop(16);
_value = (_maxid);Debug.locals.put("value", _value);
 };
 BA.debugLineNum = 1384;BA.debugLine="If listOfValues.Size > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_listofvalues.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1385;BA.debugLine="columns.Append(\", \")";
Debug.ShouldStop(256);
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 1386;BA.debugLine="values.Append(\", \")";
Debug.ShouldStop(512);
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 1388;BA.debugLine="columns.Append(col)";
Debug.ShouldStop(2048);
_columns.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 1389;BA.debugLine="values.Append($\"'${value}'\"$)";
Debug.ShouldStop(4096);
_values.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("'"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable("'")))));
 BA.debugLineNum = 1390;BA.debugLine="listOfValues.Add(value)";
Debug.ShouldStop(8192);
_listofvalues.runVoidMethod ("Add",(Object)(_value));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1392;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(_columns.runMethod(true,"ToString"))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable(") VALUES ("))).runMethod(false,"Append",(Object)(_values.runMethod(true,"ToString"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 1393;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i1),BA.numberCast(double.class, 0))) { 
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66094887",RemoteObject.concat(RemoteObject.createImmutable("InsertMaps (first query out of "),_listofmaps.runMethod(true,"getSize"),RemoteObject.createImmutable("): "),_sb.runMethod(true,"ToString")),0);};
 BA.debugLineNum = 1395;BA.debugLine="Log(sb.ToString)";
Debug.ShouldStop(262144);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66094889",_sb.runMethod(true,"ToString"),0);
 BA.debugLineNum = 1396;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 1397;BA.debugLine="SQL.ExecNonQuery(sb.ToString)";
Debug.ShouldStop(1048576);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e36.toString()); BA.debugLineNum = 1399;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66094893",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 1400;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(8388608);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 BA.debugLineNum = 1401;BA.debugLine="logError(Local, ShareCode.SESS_OPER_User, $\"${";
Debug.ShouldStop(16777216);
_logerror(_ba,_local,utils.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sb.runMethod(true,"ToString")))),RemoteObject.createImmutable(" :: "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.runMethod(false,"LastException",_ba).getObject()))),RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 1404;BA.debugLine="If NNE(request) Then";
Debug.ShouldStop(134217728);
if (_nne(_ba,_request).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1405;BA.debugLine="Dim ss As String = sb.ToString";
Debug.ShouldStop(268435456);
_ss = _sb.runMethod(true,"ToString");Debug.locals.put("ss", _ss);Debug.locals.put("ss", _ss);
 BA.debugLineNum = 1406;BA.debugLine="If Not(ss.EndsWith(\";\")) Then";
Debug.ShouldStop(536870912);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_ss.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1407;BA.debugLine="ss = $\"${ss};\"$";
Debug.ShouldStop(1073741824);
_ss = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ss))),RemoteObject.createImmutable(";")));Debug.locals.put("ss", _ss);
 };
 BA.debugLineNum = 1409;BA.debugLine="SaveScriptToLog(request, ss)";
Debug.ShouldStop(1);
_savescripttolog(_ba,_request,_ss);
 BA.debugLineNum = 1410;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(2);
_workernd = utils.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,_ba,(Object)(BA.numberCast(int.class, 4)),(Object)(_request.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 1411;BA.debugLine="save2updateFile(TableName, ss, TypeLog, reques";
Debug.ShouldStop(4);
_save2updatefile(_ba,_tablename,_ss,_typelog,_request,_workernd);
 };
 }
}Debug.locals.put("i1", _i1);
;
 BA.debugLineNum = 1414;BA.debugLine="SQL.TransactionSuccessful";
Debug.ShouldStop(32);
_sql.runVoidMethod ("TransactionSuccessful");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e52) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e52.toString()); BA.debugLineNum = 1416;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66094910",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 1417;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(256);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 BA.debugLineNum = 1423;BA.debugLine="SQL.EndTransaction";
Debug.ShouldStop(16384);
_sql.runVoidMethod ("EndTransaction");
 BA.debugLineNum = 1425;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insidegeofence(RemoteObject _ba,RemoteObject _lat,RemoteObject _lon,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("InsideGeoFence (utils) ","utils",3,_ba,utils.mostCurrent,3882);
if (RapidSub.canDelegate("insidegeofence")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","insidegeofence", _ba, _lat, _lon, _offset);}
RemoteObject _currentlatitude = RemoteObject.createImmutable(0);
RemoteObject _currentlongitude = RemoteObject.createImmutable(0);
RemoteObject _evallat = RemoteObject.createImmutable(false);
RemoteObject _evallon = RemoteObject.createImmutable(false);
RemoteObject _pi = RemoteObject.createImmutable(0f);
RemoteObject _minuslat = RemoteObject.createImmutable(0);
RemoteObject _minuslon = RemoteObject.createImmutable(0);
RemoteObject _pluslat = RemoteObject.createImmutable(0);
RemoteObject _pluslon = RemoteObject.createImmutable(0);
;
Debug.locals.put("lat", _lat);
Debug.locals.put("lon", _lon);
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 3882;BA.debugLine="Sub InsideGeoFence(lat As Double, lon As Double, o";
Debug.ShouldStop(512);
 BA.debugLineNum = 3884;BA.debugLine="Private CurrentLatitude As Double = IfNullOrEmpty";
Debug.ShouldStop(2048);
_currentlatitude = BA.numberCast(double.class, _ifnullorempty(_ba,utils.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ ),RemoteObject.createImmutable("")));Debug.locals.put("CurrentLatitude", _currentlatitude);Debug.locals.put("CurrentLatitude", _currentlatitude);
 BA.debugLineNum = 3885;BA.debugLine="Private CurrentLongitude As Double = IfNullOrEmpt";
Debug.ShouldStop(4096);
_currentlongitude = BA.numberCast(double.class, _ifnullorempty(_ba,utils.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ ),RemoteObject.createImmutable("")));Debug.locals.put("CurrentLongitude", _currentlongitude);Debug.locals.put("CurrentLongitude", _currentlongitude);
 BA.debugLineNum = 3887;BA.debugLine="Dim EvalLat As Boolean = False";
Debug.ShouldStop(16384);
_evallat = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("EvalLat", _evallat);Debug.locals.put("EvalLat", _evallat);
 BA.debugLineNum = 3888;BA.debugLine="Dim EvalLon As Boolean = False";
Debug.ShouldStop(32768);
_evallon = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("EvalLon", _evallon);Debug.locals.put("EvalLon", _evallon);
 BA.debugLineNum = 3890;BA.debugLine="If lat = 0 Then	lat = CurrentLatitude";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_lat,BA.numberCast(double.class, 0))) { 
_lat = _currentlatitude;Debug.locals.put("lat", _lat);};
 BA.debugLineNum = 3891;BA.debugLine="If lon = 0 Then lon = CurrentLongitude";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_lon,BA.numberCast(double.class, 0))) { 
_lon = _currentlongitude;Debug.locals.put("lon", _lon);};
 BA.debugLineNum = 3893;BA.debugLine="If offset < = 0 Then offset = 2";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("k",_offset,BA.numberCast(double.class, 0))) { 
_offset = BA.numberCast(int.class, 2);Debug.locals.put("offset", _offset);};
 BA.debugLineNum = 3895;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 3896;BA.debugLine="Dim pi As Float = 3.14159";
Debug.ShouldStop(8388608);
_pi = BA.numberCast(float.class, 3.14159);Debug.locals.put("pi", _pi);Debug.locals.put("pi", _pi);
 BA.debugLineNum = 3897;BA.debugLine="Dim Minuslat As Double = lat - (180/pi)*(offset/";
Debug.ShouldStop(16777216);
_minuslat = RemoteObject.solve(new RemoteObject[] {_lat,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(180),_pi}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(6378137)}, "/",0, 0))}, "-*",1, 0);Debug.locals.put("Minuslat", _minuslat);Debug.locals.put("Minuslat", _minuslat);
 BA.debugLineNum = 3898;BA.debugLine="Dim Minuslon As Double = lon - (180/pi)*(offset/";
Debug.ShouldStop(33554432);
_minuslon = RemoteObject.solve(new RemoteObject[] {_lon,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(180),_pi}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(6378137)}, "/",0, 0)),utils.mostCurrent.__c.runMethod(true,"Cos",(Object)(_lat))}, "-*/",1, 0);Debug.locals.put("Minuslon", _minuslon);Debug.locals.put("Minuslon", _minuslon);
 BA.debugLineNum = 3900;BA.debugLine="Dim Pluslat As Double = lat + (180/pi)*(offset/6";
Debug.ShouldStop(134217728);
_pluslat = RemoteObject.solve(new RemoteObject[] {_lat,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(180),_pi}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(6378137)}, "/",0, 0))}, "+*",1, 0);Debug.locals.put("Pluslat", _pluslat);Debug.locals.put("Pluslat", _pluslat);
 BA.debugLineNum = 3901;BA.debugLine="Dim Pluslon As Double = lon + (180/pi)*(offset/6";
Debug.ShouldStop(268435456);
_pluslon = RemoteObject.solve(new RemoteObject[] {_lon,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(180),_pi}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {_offset,RemoteObject.createImmutable(6378137)}, "/",0, 0)),utils.mostCurrent.__c.runMethod(true,"Cos",(Object)(_lat))}, "+*/",1, 0);Debug.locals.put("Pluslon", _pluslon);Debug.locals.put("Pluslon", _pluslon);
 BA.debugLineNum = 3903;BA.debugLine="If CurrentLatitude >= Minuslat And CurrentLatitu";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("g",_currentlatitude,_minuslat) && RemoteObject.solveBoolean("k",_currentlatitude,_pluslat)) { 
 BA.debugLineNum = 3904;BA.debugLine="EvalLat = True";
Debug.ShouldStop(-2147483648);
_evallat = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("EvalLat", _evallat);
 };
 BA.debugLineNum = 3907;BA.debugLine="If CurrentLongitude >= Minuslon And CurrentLongi";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("g",_currentlongitude,_minuslon) && RemoteObject.solveBoolean("k",_currentlongitude,_pluslon)) { 
 BA.debugLineNum = 3908;BA.debugLine="EvalLon = True";
Debug.ShouldStop(8);
_evallon = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("EvalLon", _evallon);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e21) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e21.toString()); BA.debugLineNum = 3911;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","616121885",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 3912;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(128);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 BA.debugLineNum = 3915;BA.debugLine="If EvalLat = True And EvalLon = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_evallat,utils.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_evallon,utils.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3916;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return utils.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 3918;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return utils.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 3921;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _int2bool(RemoteObject _ba,RemoteObject _inint) throws Exception{
try {
		Debug.PushSubsStack("Int2Bool (utils) ","utils",3,_ba,utils.mostCurrent,1934);
if (RapidSub.canDelegate("int2bool")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","int2bool", _ba, _inint);}
RemoteObject _ret = RemoteObject.createImmutable(false);
;
Debug.locals.put("inInt", _inint);
 BA.debugLineNum = 1934;BA.debugLine="Sub Int2Bool(inInt As Int) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1935;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(16384);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1936;BA.debugLine="If inInt=1 Then ret = True";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_inint,BA.numberCast(double.class, 1))) { 
_ret = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);};
 BA.debugLineNum = 1937;BA.debugLine="Return ret";
Debug.ShouldStop(65536);
if (true) return _ret;
 BA.debugLineNum = 1938;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inttodip(RemoteObject _ba,RemoteObject _integer) throws Exception{
try {
		Debug.PushSubsStack("IntToDIP (utils) ","utils",3,_ba,utils.mostCurrent,161);
if (RapidSub.canDelegate("inttodip")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","inttodip", _ba, _integer);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _scale = RemoteObject.createImmutable(0f);
RemoteObject _dip = RemoteObject.createImmutable(0);
;
Debug.locals.put("Integer", _integer);
 BA.debugLineNum = 161;BA.debugLine="Sub IntToDIP(Integer As Int) As Int";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 163;BA.debugLine="Dim scale As Float";
Debug.ShouldStop(4);
_scale = RemoteObject.createImmutable(0f);Debug.locals.put("scale", _scale);
 BA.debugLineNum = 164;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(8);
_r.setField ("Target",(_r.runMethod(false,"GetContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 165;BA.debugLine="r.Target = r.RunMethod(\"getResources\")";
Debug.ShouldStop(16);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getResources"))));
 BA.debugLineNum = 166;BA.debugLine="r.Target = r.RunMethod(\"getDisplayMetrics\")";
Debug.ShouldStop(32);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getDisplayMetrics"))));
 BA.debugLineNum = 167;BA.debugLine="scale = r.GetField(\"density\")";
Debug.ShouldStop(64);
_scale = BA.numberCast(float.class, _r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("density"))));Debug.locals.put("scale", _scale);
 BA.debugLineNum = 169;BA.debugLine="Dim DIP As Int";
Debug.ShouldStop(256);
_dip = RemoteObject.createImmutable(0);Debug.locals.put("DIP", _dip);
 BA.debugLineNum = 170;BA.debugLine="DIP = Integer * scale + 0.5";
Debug.ShouldStop(512);
_dip = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_integer,_scale,RemoteObject.createImmutable(0.5)}, "*+",1, 0));Debug.locals.put("DIP", _dip);
 BA.debugLineNum = 171;BA.debugLine="Return DIP";
Debug.ShouldStop(1024);
if (true) return _dip;
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _islandscapedefaultorientation(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("IsLandscapeDefaultOrientation (utils) ","utils",3,_ba,utils.mostCurrent,1850);
if (RapidSub.canDelegate("islandscapedefaultorientation")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","islandscapedefaultorientation", _ba);}
RemoteObject _context = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rotation = RemoteObject.createImmutable(0);
RemoteObject _configorientation = RemoteObject.createImmutable(0);
;
 BA.debugLineNum = 1850;BA.debugLine="Sub IsLandscapeDefaultOrientation As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1851;BA.debugLine="Dim context As JavaObject";
Debug.ShouldStop(67108864);
_context = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("context", _context);
 BA.debugLineNum = 1852;BA.debugLine="context = context.InitializeStatic(\"anywheresoftw";
Debug.ShouldStop(134217728);
_context = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _context.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("anywheresoftware.b4a.BA"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("applicationContext"))));
 BA.debugLineNum = 1853;BA.debugLine="Dim rotation As Int = context.RunMethodJO(\"getSys";
Debug.ShouldStop(268435456);
_rotation = BA.numberCast(int.class, _context.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getSystemService")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("window"))}))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDefaultDisplay")),(Object)((utils.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRotation")),(Object)((utils.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("rotation", _rotation);Debug.locals.put("rotation", _rotation);
 BA.debugLineNum = 1855;BA.debugLine="Dim configOrientation As Int = context.RunMethodJ";
Debug.ShouldStop(1073741824);
_configorientation = BA.numberCast(int.class, _context.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getResources")),(Object)((utils.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getConfiguration")),(Object)((utils.mostCurrent.__c.getField(false,"Null")))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("orientation"))));Debug.locals.put("configOrientation", _configorientation);Debug.locals.put("configOrientation", _configorientation);
 BA.debugLineNum = 1857;BA.debugLine="If ((rotation = 0 Or rotation = 2) And configOrie";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_rotation,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_rotation,BA.numberCast(double.class, 2))))) && RemoteObject.solveBoolean("=",_configorientation,BA.numberCast(double.class, 2))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_rotation,BA.numberCast(double.class, 1)) || RemoteObject.solveBoolean("=",_rotation,BA.numberCast(double.class, 3))))) && RemoteObject.solveBoolean("=",_configorientation,BA.numberCast(double.class, 1)))))) { 
 BA.debugLineNum = 1859;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return utils.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1861;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) return utils.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 1863;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnull(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("isNull (utils) ","utils",3,_ba,utils.mostCurrent,2283);
if (RapidSub.canDelegate("isnull")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","isnull", _ba, _instr);}
RemoteObject _r = RemoteObject.createImmutable(false);
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2283;BA.debugLine="Sub isNull(inStr As String) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 2284;BA.debugLine="Dim r As Boolean = False";
Debug.ShouldStop(2048);
_r = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 2285;BA.debugLine="If (inStr = Null) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("n",_instr))) { 
 BA.debugLineNum = 2286;BA.debugLine="r = True";
Debug.ShouldStop(8192);
_r = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("r", _r);
 }else 
{ BA.debugLineNum = 2287;BA.debugLine="Else if (inStr = \"null\") Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("=",_instr,RemoteObject.createImmutable("null")))) { 
 BA.debugLineNum = 2288;BA.debugLine="r = True";
Debug.ShouldStop(32768);
_r = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("r", _r);
 }}
;
 BA.debugLineNum = 2290;BA.debugLine="Return r";
Debug.ShouldStop(131072);
if (true) return _r;
 BA.debugLineNum = 2291;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnullorempty(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("isNullOrEmpty (utils) ","utils",3,_ba,utils.mostCurrent,2293);
if (RapidSub.canDelegate("isnullorempty")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","isnullorempty", _ba, _instr);}
RemoteObject _r = RemoteObject.createImmutable(false);
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2293;BA.debugLine="Sub isNullOrEmpty(inStr As String) As Boolean";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2294;BA.debugLine="Dim r As Boolean = False";
Debug.ShouldStop(2097152);
_r = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 2295;BA.debugLine="If (inStr = Null) Then";
Debug.ShouldStop(4194304);
if ((RemoteObject.solveBoolean("n",_instr))) { 
 BA.debugLineNum = 2296;BA.debugLine="r = True";
Debug.ShouldStop(8388608);
_r = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("r", _r);
 }else 
{ BA.debugLineNum = 2297;BA.debugLine="Else if (inStr.ToLowerCase = \"null\") Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("=",_instr.runMethod(true,"toLowerCase"),RemoteObject.createImmutable("null")))) { 
 BA.debugLineNum = 2298;BA.debugLine="r = True";
Debug.ShouldStop(33554432);
_r = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("r", _r);
 }else 
{ BA.debugLineNum = 2299;BA.debugLine="Else if (inStr = \"\") Then";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_instr,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 2300;BA.debugLine="r = True";
Debug.ShouldStop(134217728);
_r = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("r", _r);
 }}}
;
 BA.debugLineNum = 2302;BA.debugLine="Return r";
Debug.ShouldStop(536870912);
if (true) return _r;
 BA.debugLineNum = 2303;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnumeric(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("isNumeric (utils) ","utils",3,_ba,utils.mostCurrent,2269);
if (RapidSub.canDelegate("isnumeric")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","isnumeric", _ba, _instr);}
RemoteObject _r = RemoteObject.createImmutable(false);
RemoteObject _n = RemoteObject.createImmutable(0);
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2269;BA.debugLine="Sub isNumeric(inStr As String) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2270;BA.debugLine="Dim r As Boolean = False";
Debug.ShouldStop(536870912);
_r = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 2271;BA.debugLine="If Not( isNullOrEmpty(inStr) ) Then";
Debug.ShouldStop(1073741824);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_isnullorempty(_ba,_instr))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2272;BA.debugLine="Dim n As Int = 0";
Debug.ShouldStop(-2147483648);
_n = BA.numberCast(int.class, 0);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 2273;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 2274;BA.debugLine="n = n + inStr";
Debug.ShouldStop(2);
_n = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_n,BA.numberCast(double.class, _instr)}, "+",1, 0));Debug.locals.put("n", _n);
 BA.debugLineNum = 2275;BA.debugLine="r = True";
Debug.ShouldStop(4);
_r = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("r", _r);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e8) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e8.toString()); BA.debugLineNum = 2277;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","69764872",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 };
 BA.debugLineNum = 2280;BA.debugLine="Return r";
Debug.ShouldStop(128);
if (true) return _r;
 BA.debugLineNum = 2281;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _issmartphone(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("IsSmartPhone (utils) ","utils",3,_ba,utils.mostCurrent,2032);
if (RapidSub.canDelegate("issmartphone")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","issmartphone", _ba);}
;
 BA.debugLineNum = 2032;BA.debugLine="Sub IsSmartPhone As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2033;BA.debugLine="Return DeviceType < 7";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("<",_devicetype(_ba),BA.numberCast(double.class, 7)));
 BA.debugLineNum = 2034;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvaliddate(RemoteObject _ba,RemoteObject _mdate) throws Exception{
try {
		Debug.PushSubsStack("isValidDate (utils) ","utils",3,_ba,utils.mostCurrent,883);
if (RapidSub.canDelegate("isvaliddate")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","isvaliddate", _ba, _mdate);}
;
Debug.locals.put("mDate", _mdate);
 BA.debugLineNum = 883;BA.debugLine="Sub isValidDate(mDate As String) As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 884;BA.debugLine="Try";
Debug.ShouldStop(524288);
try { BA.debugLineNum = 885;BA.debugLine="DateTime.DateParse(mDate)";
Debug.ShouldStop(1048576);
utils.mostCurrent.__c.getField(false,"DateTime").runVoidMethod ("DateParse",(Object)(_mdate));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e4.toString()); BA.debugLineNum = 887;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return utils.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 889;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) return utils.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 890;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobapimap(RemoteObject _ba,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobAPIMAP (utils) ","utils",3,_ba,utils.mostCurrent,92);
if (RapidSub.canDelegate("jobapimap")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","jobapimap", _ba, _job);}
RemoteObject _resultstr = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("job", _job);
 BA.debugLineNum = 92;BA.debugLine="Sub JobAPIMAP(job  As HttpJob) As Map";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim ResultStr As String = job.GetString";
Debug.ShouldStop(268435456);
_resultstr = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 94;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(536870912);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 95;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") The";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("=",utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_resultstr),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
 BA.debugLineNum = 96;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFunc";
Debug.ShouldStop(-2147483648);
_resultstr = utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_resultstr),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_resultstr)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("ResultStr", _resultstr);
 };
 BA.debugLineNum = 98;BA.debugLine="JSON1.Initialize(ResultStr)";
Debug.ShouldStop(2);
_json1.runVoidMethod ("Initialize",(Object)(_resultstr));
 BA.debugLineNum = 99;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(4);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 100;BA.debugLine="Return MapJSON";
Debug.ShouldStop(8);
if (true) return _mapjson;
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobapistatus(RemoteObject _ba,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobAPIStatus (utils) ","utils",3,_ba,utils.mostCurrent,2472);
if (RapidSub.canDelegate("jobapistatus")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","jobapistatus", _ba, _job);}
RemoteObject _resultstr = RemoteObject.createImmutable("");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
;
Debug.locals.put("job", _job);
 BA.debugLineNum = 2472;BA.debugLine="Sub JobAPIStatus(job  As HttpJob) As Int";
Debug.ShouldStop(128);
 BA.debugLineNum = 2473;BA.debugLine="Dim ResultStr As String = job.GetString";
Debug.ShouldStop(256);
_resultstr = _job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 2475;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(1024);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2476;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") The";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean("=",utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_resultstr),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
 BA.debugLineNum = 2477;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFunc";
Debug.ShouldStop(4096);
_resultstr = utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_resultstr),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_resultstr)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("ResultStr", _resultstr);
 };
 BA.debugLineNum = 2480;BA.debugLine="If ResultStr.StartsWith(\"Array\") Then";
Debug.ShouldStop(32768);
if (_resultstr.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("Array"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2481;BA.debugLine="If ResultStr.SubString(8).StartsWith(\")\") Then";
Debug.ShouldStop(65536);
if (_resultstr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 8))).runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable(")"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2482;BA.debugLine="ResultStr = ResultStr.SubString(9)";
Debug.ShouldStop(131072);
_resultstr = _resultstr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 9)));Debug.locals.put("ResultStr", _resultstr);
 };
 };
 BA.debugLineNum = 2486;BA.debugLine="JSON1.Initialize(ResultStr)";
Debug.ShouldStop(2097152);
_json1.runVoidMethod ("Initialize",(Object)(_resultstr));
 BA.debugLineNum = 2487;BA.debugLine="Try";
Debug.ShouldStop(4194304);
try { BA.debugLineNum = 2488;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(8388608);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 2489;BA.debugLine="Dim status As Int = MapJSON.Get(\"status\")";
Debug.ShouldStop(16777216);
_status = BA.numberCast(int.class, _mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e16) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e16.toString()); BA.debugLineNum = 2491;BA.debugLine="Dim status As Int = 1";
Debug.ShouldStop(67108864);
_status = BA.numberCast(int.class, 1);Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 2492;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","610878996",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 2495;BA.debugLine="Return status";
Debug.ShouldStop(1073741824);
if (true) return _status;
 BA.debugLineNum = 2496;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _json2map(RemoteObject _ba,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("JSON2MAP (utils) ","utils",3,_ba,utils.mostCurrent,13);
if (RapidSub.canDelegate("json2map")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","json2map", _ba, _script);}
RemoteObject _ret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
;
Debug.locals.put("script", _script);
 BA.debugLineNum = 13;BA.debugLine="Sub JSON2MAP(script As String) As Map";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="Dim Ret As Map : Ret.initialize";
Debug.ShouldStop(8192);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 14;BA.debugLine="Dim Ret As Map : Ret.initialize";
Debug.ShouldStop(8192);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 15;BA.debugLine="If NNE(script) Then";
Debug.ShouldStop(16384);
if (_nne(_ba,_script).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 16;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(32768);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 17;BA.debugLine="Try";
Debug.ShouldStop(65536);
try { BA.debugLineNum = 18;BA.debugLine="JSON1.Initialize(script)";
Debug.ShouldStop(131072);
_json1.runVoidMethod ("Initialize",(Object)(_script));
 BA.debugLineNum = 19;BA.debugLine="Dim Ret As Map = JSON1.NextObject";
Debug.ShouldStop(262144);
_ret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ret = _json1.runMethod(false,"NextObject");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e9.toString()); BA.debugLineNum = 21;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","62752520",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 22;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(2097152);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 };
 };
 BA.debugLineNum = 25;BA.debugLine="Return Ret";
Debug.ShouldStop(16777216);
if (true) return _ret;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jsontomap(RemoteObject _ba,RemoteObject _strjson) throws Exception{
try {
		Debug.PushSubsStack("JsonToMap (utils) ","utils",3,_ba,utils.mostCurrent,1730);
if (RapidSub.canDelegate("jsontomap")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","jsontomap", _ba, _strjson);}
RemoteObject _jmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
;
Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 1730;BA.debugLine="Sub JsonToMap(strJSON As String) As Map";
Debug.ShouldStop(2);
 BA.debugLineNum = 1732;BA.debugLine="Dim jMap As Map";
Debug.ShouldStop(8);
_jmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("jMap", _jmap);
 BA.debugLineNum = 1733;BA.debugLine="jMap.Initialize";
Debug.ShouldStop(16);
_jmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 1734;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(32);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1735;BA.debugLine="JSON.Initialize(strJSON)";
Debug.ShouldStop(64);
_json.runVoidMethod ("Initialize",(Object)(_strjson));
 BA.debugLineNum = 1736;BA.debugLine="jMap = JSON.NextObject";
Debug.ShouldStop(128);
_jmap = _json.runMethod(false,"NextObject");Debug.locals.put("jMap", _jmap);
 BA.debugLineNum = 1737;BA.debugLine="Return jMap";
Debug.ShouldStop(256);
if (true) return _jmap;
 BA.debugLineNum = 1738;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _left(RemoteObject _ba,RemoteObject _strtext,RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("Left (utils) ","utils",3,_ba,utils.mostCurrent,129);
if (RapidSub.canDelegate("left")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","left", _ba, _strtext, _strlength);}
RemoteObject _strfunc = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
;
Debug.locals.put("StrText", _strtext);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 129;BA.debugLine="Sub Left(StrText As String, StrLength As Int) As S";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="Private strfunc As StringFunctions";
Debug.ShouldStop(2);
_strfunc = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("strfunc", _strfunc);
 BA.debugLineNum = 131;BA.debugLine="strfunc.Initialize";
Debug.ShouldStop(4);
_strfunc.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 132;BA.debugLine="Return strfunc.Left(StrText, StrLength)";
Debug.ShouldStop(8);
if (true) return _strfunc.runMethod(true,"_vvv6",(Object)(_strtext),(Object)(BA.numberCast(long.class, _strlength)));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2str(RemoteObject _ba,RemoteObject _inlist,RemoteObject _divider) throws Exception{
try {
		Debug.PushSubsStack("List2Str (utils) ","utils",3,_ba,utils.mostCurrent,2194);
if (RapidSub.canDelegate("list2str")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","list2str", _ba, _inlist, _divider);}
RemoteObject _sret = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("inList", _inlist);
Debug.locals.put("divider", _divider);
 BA.debugLineNum = 2194;BA.debugLine="Sub List2Str(inList As List, divider As String) As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 2195;BA.debugLine="Dim sRet As String = \"\"";
Debug.ShouldStop(262144);
_sret = BA.ObjectToString("");Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2196;BA.debugLine="If (divider=\"\") Then divider = \"|\"";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_divider,RemoteObject.createImmutable("")))) { 
_divider = BA.ObjectToString("|");Debug.locals.put("divider", _divider);};
 BA.debugLineNum = 2197;BA.debugLine="For i=0 To inList.Size-1";
Debug.ShouldStop(1048576);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_inlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2198;BA.debugLine="If (sRet <> \"\") Then sRet = $\"${sRet}${divider}\"";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("!",_sret,RemoteObject.createImmutable("")))) { 
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_divider))),RemoteObject.createImmutable("")));Debug.locals.put("sRet", _sret);};
 BA.debugLineNum = 2199;BA.debugLine="sRet = $\"${sRet}${inList.Get(i)}\"$";
Debug.ShouldStop(4194304);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_inlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable("")));Debug.locals.put("sRet", _sret);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2201;BA.debugLine="Return sRet";
Debug.ShouldStop(16777216);
if (true) return _sret;
 BA.debugLineNum = 2202;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listofpairs(RemoteObject _ba,RemoteObject _pairs,RemoteObject _splitter) throws Exception{
try {
		Debug.PushSubsStack("ListOfPairs (utils) ","utils",3,_ba,utils.mostCurrent,2369);
if (RapidSub.canDelegate("listofpairs")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","listofpairs", _ba, _pairs, _splitter);}
RemoteObject _retlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _splt = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("pairs", _pairs);
Debug.locals.put("splitter", _splitter);
 BA.debugLineNum = 2369;BA.debugLine="Sub ListOfPairs(pairs() As String, splitter As Str";
Debug.ShouldStop(1);
 BA.debugLineNum = 2370;BA.debugLine="Dim retList As List";
Debug.ShouldStop(2);
_retlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("retList", _retlist);
 BA.debugLineNum = 2371;BA.debugLine="retList.Initialize";
Debug.ShouldStop(4);
_retlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2372;BA.debugLine="Dim splt As String = splitter";
Debug.ShouldStop(8);
_splt = _splitter;Debug.locals.put("splt", _splt);Debug.locals.put("splt", _splt);
 BA.debugLineNum = 2373;BA.debugLine="If (splt = \"\") Then splt = \"=>\"";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",_splt,RemoteObject.createImmutable("")))) { 
_splt = BA.ObjectToString("=>");Debug.locals.put("splt", _splt);};
 BA.debugLineNum = 2374;BA.debugLine="For i=0 To pairs.Length-1";
Debug.ShouldStop(32);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_pairs.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2375;BA.debugLine="Dim lst As List = Regex.Split((\"\\\"&splt), pairs(";
Debug.ShouldStop(64);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\\"),_splt))),(Object)(_pairs.getArrayElement(true,BA.numberCast(int.class, _i))))));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2376;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 2377;BA.debugLine="map.Initialize";
Debug.ShouldStop(256);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 2378;BA.debugLine="map.Put(lst.Get(0), lst.Get(1))";
Debug.ShouldStop(512);
_map.runVoidMethod ("Put",(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 2379;BA.debugLine="retList.Add(map)";
Debug.ShouldStop(1024);
_retlist.runVoidMethod ("Add",(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2381;BA.debugLine="Return retList";
Debug.ShouldStop(4096);
if (true) return _retlist;
 BA.debugLineNum = 2382;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listofpairslist(RemoteObject _ba,RemoteObject _pairs,RemoteObject _splitter) throws Exception{
try {
		Debug.PushSubsStack("ListOfPairsList (utils) ","utils",3,_ba,utils.mostCurrent,2384);
if (RapidSub.canDelegate("listofpairslist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","listofpairslist", _ba, _pairs, _splitter);}
RemoteObject _retlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _splt = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("pairs", _pairs);
Debug.locals.put("splitter", _splitter);
 BA.debugLineNum = 2384;BA.debugLine="Sub ListOfPairsList(pairs As List, splitter As Str";
Debug.ShouldStop(32768);
 BA.debugLineNum = 2385;BA.debugLine="Dim retList As List";
Debug.ShouldStop(65536);
_retlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("retList", _retlist);
 BA.debugLineNum = 2386;BA.debugLine="retList.Initialize";
Debug.ShouldStop(131072);
_retlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2387;BA.debugLine="Dim splt As String = splitter";
Debug.ShouldStop(262144);
_splt = _splitter;Debug.locals.put("splt", _splt);Debug.locals.put("splt", _splt);
 BA.debugLineNum = 2388;BA.debugLine="If (splt = \"\") Then splt = \"=>\"";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_splt,RemoteObject.createImmutable("")))) { 
_splt = BA.ObjectToString("=>");Debug.locals.put("splt", _splt);};
 BA.debugLineNum = 2389;BA.debugLine="For i=0 To pairs.size-1";
Debug.ShouldStop(1048576);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_pairs.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2390;BA.debugLine="Dim lst As List = Regex.Split((\"\\\"&splt), pairs.";
Debug.ShouldStop(2097152);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\\"),_splt))),(Object)(BA.ObjectToString(_pairs.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))))));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 2391;BA.debugLine="Dim map As Map";
Debug.ShouldStop(4194304);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 2392;BA.debugLine="map.Initialize";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 2393;BA.debugLine="map.Put(lst.Get(0), lst.Get(1))";
Debug.ShouldStop(16777216);
_map.runVoidMethod ("Put",(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 2394;BA.debugLine="retList.Add(map)";
Debug.ShouldStop(33554432);
_retlist.runVoidMethod ("Add",(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2396;BA.debugLine="Return retList";
Debug.ShouldStop(134217728);
if (true) return _retlist;
 BA.debugLineNum = 2397;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loadjsonfile(RemoteObject _ba,RemoteObject _folder,RemoteObject _filearg) throws Exception{
try {
		Debug.PushSubsStack("LoadJSONFile (utils) ","utils",3,_ba,utils.mostCurrent,2994);
if (RapidSub.canDelegate("loadjsonfile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","loadjsonfile", _ba, _folder, _filearg);}
RemoteObject _jsondata = RemoteObject.createImmutable("");
;
Debug.locals.put("Folder", _folder);
Debug.locals.put("FileArg", _filearg);
 BA.debugLineNum = 2994;BA.debugLine="Sub LoadJSONFile( Folder As String, FileArg As Str";
Debug.ShouldStop(131072);
 BA.debugLineNum = 2995;BA.debugLine="Dim JSONData As String = File.ReadString(Folder,F";
Debug.ShouldStop(262144);
_jsondata = utils.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(_folder),(Object)(_filearg));Debug.locals.put("JSONData", _jsondata);Debug.locals.put("JSONData", _jsondata);
 BA.debugLineNum = 3003;BA.debugLine="Starter.StrFunc.Initialize";
Debug.ShouldStop(67108864);
utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 3004;BA.debugLine="If (Starter.StrFunc.Left(JSONData, 1) = \"[\") Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_jsondata),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
 BA.debugLineNum = 3005;BA.debugLine="JSONData = Starter.StrFunc.Trim(Starter.StrFunc.";
Debug.ShouldStop(268435456);
_jsondata = utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_jsondata),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_jsondata)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("JSONData", _jsondata);
 };
 BA.debugLineNum = 3007;BA.debugLine="Return JSONData";
Debug.ShouldStop(1073741824);
if (true) return _jsondata;
 BA.debugLineNum = 3008;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logall(RemoteObject _ba,RemoteObject _title,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("logall (utils) ","utils",3,_ba,utils.mostCurrent,831);
if (RapidSub.canDelegate("logall")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","logall", _ba, _title, _values);}
RemoteObject _ss = RemoteObject.createImmutable("");
RemoteObject _lg = RemoteObject.createImmutable("");
;
Debug.locals.put("title", _title);
Debug.locals.put("values", _values);
 BA.debugLineNum = 831;BA.debugLine="Sub logall(title As String, values() As String)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 832;BA.debugLine="Dim ss As String";
Debug.ShouldStop(-2147483648);
_ss = RemoteObject.createImmutable("");Debug.locals.put("ss", _ss);
 BA.debugLineNum = 833;BA.debugLine="For Each lg As String In values";
Debug.ShouldStop(1);
{
final RemoteObject group2 = _values;
final int groupLen2 = group2.getField(true,"length").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lg = group2.getArrayElement(true,RemoteObject.createImmutable(index2));Debug.locals.put("lg", _lg);
Debug.locals.put("lg", _lg);
 BA.debugLineNum = 834;BA.debugLine="ss = addthis(ss, lg, \",\", True)";
Debug.ShouldStop(2);
_ss = _addthis(_ba,_ss,_lg,BA.ObjectToString(","),utils.mostCurrent.__c.getField(true,"True"));Debug.locals.put("ss", _ss);
 }
}Debug.locals.put("lg", _lg);
;
 BA.debugLineNum = 836;BA.debugLine="Log(title & ss)";
Debug.ShouldStop(8);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","64325381",RemoteObject.concat(_title,_ss),0);
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logchangefile(RemoteObject _ba,RemoteObject _filename,RemoteObject _origin,RemoteObject _updated,RemoteObject _changed,RemoteObject _filedate) throws Exception{
try {
		Debug.PushSubsStack("logChangeFile (utils) ","utils",3,_ba,utils.mostCurrent,1068);
if (RapidSub.canDelegate("logchangefile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","logchangefile", _ba, _filename, _origin, _updated, _changed, _filedate);}
RemoteObject _doupdate = RemoteObject.createImmutable(false);
RemoteObject _sqlscript = RemoteObject.createImmutable("");
;
Debug.locals.put("filename", _filename);
Debug.locals.put("origin", _origin);
Debug.locals.put("updated", _updated);
Debug.locals.put("changed", _changed);
Debug.locals.put("filedate", _filedate);
 BA.debugLineNum = 1068;BA.debugLine="Sub logChangeFile(filename As String, origin As In";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1069;BA.debugLine="Dim doUpdate As Boolean = DBDataExists(Starter.Lo";
Debug.ShouldStop(4096);
_doupdate = _dbdataexists(_ba,utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("select * from log_files where filename='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("'"))));Debug.locals.put("doUpdate", _doupdate);Debug.locals.put("doUpdate", _doupdate);
 BA.debugLineNum = 1070;BA.debugLine="If (doUpdate) Then";
Debug.ShouldStop(8192);
if ((_doupdate).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1071;BA.debugLine="Dim sqlScript As String = $\"update log_files set";
Debug.ShouldStop(16384);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable("update log_files set origin="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_origin))),RemoteObject.createImmutable(", changed="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_changed))),RemoteObject.createImmutable(", filedate='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filedate))),RemoteObject.createImmutable("' where filename='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable("'")));Debug.locals.put("sqlScript", _sqlscript);Debug.locals.put("sqlScript", _sqlscript);
 BA.debugLineNum = 1072;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(sqlScript)";
Debug.ShouldStop(32768);
utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 }else {
 BA.debugLineNum = 1074;BA.debugLine="logFile(filename, origin, updated, changed, file";
Debug.ShouldStop(131072);
_logfile(_ba,_filename,_origin,_updated,_changed,_filedate);
 };
 BA.debugLineNum = 1076;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logerror(RemoteObject _ba,RemoteObject _logaction,RemoteObject _loguser,RemoteObject _logmessage) throws Exception{
try {
		Debug.PushSubsStack("logError (utils) ","utils",3,_ba,utils.mostCurrent,1130);
if (RapidSub.canDelegate("logerror")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","logerror", _ba, _logaction, _loguser, _logmessage);}
RemoteObject _loglocations = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("logaction", _logaction);
Debug.locals.put("loguser", _loguser);
Debug.locals.put("logmessage", _logmessage);
 BA.debugLineNum = 1130;BA.debugLine="Sub logError(logaction As String, loguser As Strin";
Debug.ShouldStop(512);
 BA.debugLineNum = 1132;BA.debugLine="Dim logLocations As String = getGeoLocationFormat";
Debug.ShouldStop(2048);
_loglocations = _getgeolocationformat(_ba);Debug.locals.put("logLocations", _loglocations);Debug.locals.put("logLocations", _loglocations);
 BA.debugLineNum = 1136;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1137;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1138;BA.debugLine="params.Put(\"logdatetime\", GetCurrDatetime)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdatetime"))),(Object)((_getcurrdatetime(_ba))));
 BA.debugLineNum = 1139;BA.debugLine="params.Put(\"logaction\", logaction)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logaction"))),(Object)((_logaction)));
 BA.debugLineNum = 1140;BA.debugLine="params.Put(\"loguser\", loguser)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loguser"))),(Object)((_loguser)));
 BA.debugLineNum = 1141;BA.debugLine="params.Put(\"loglocation\", logLocations)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglocation"))),(Object)((_loglocations)));
 BA.debugLineNum = 1142;BA.debugLine="params.Put(\"logmessage\", logmessage)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logmessage"))),(Object)((_logmessage)));
 BA.debugLineNum = 1143;BA.debugLine="params.Put(\"logdevice\", ShareCode.APP_Authorizati";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdevice"))),(Object)((utils.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1144;BA.debugLine="params.Put(\"reported\", 0)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1145;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(16777216);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 1146;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(33554432);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1147;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(67108864);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1148;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"log_erro";
Debug.ShouldStop(134217728);
utils.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("log_errors")),(Object)(_insertlist));
 BA.debugLineNum = 1149;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logfile(RemoteObject _ba,RemoteObject _filename,RemoteObject _origin,RemoteObject _uploaded,RemoteObject _changed,RemoteObject _filedate) throws Exception{
try {
		Debug.PushSubsStack("logFile (utils) ","utils",3,_ba,utils.mostCurrent,1054);
if (RapidSub.canDelegate("logfile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","logfile", _ba, _filename, _origin, _uploaded, _changed, _filedate);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("filename", _filename);
Debug.locals.put("origin", _origin);
Debug.locals.put("uploaded", _uploaded);
Debug.locals.put("changed", _changed);
Debug.locals.put("filedate", _filedate);
 BA.debugLineNum = 1054;BA.debugLine="Sub logFile(filename As String, origin As Int, upl";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1055;BA.debugLine="Dim params As Map";
Debug.ShouldStop(1073741824);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1056;BA.debugLine="params.Initialize";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1057;BA.debugLine="params.Put(\"filename\", filename)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filename"))),(Object)((_filename)));
 BA.debugLineNum = 1058;BA.debugLine="params.Put(\"origin\", origin)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)((_origin)));
 BA.debugLineNum = 1059;BA.debugLine="params.Put(\"uploaded\", uploaded)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("uploaded"))),(Object)((_uploaded)));
 BA.debugLineNum = 1060;BA.debugLine="params.Put(\"changed\", changed)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("changed"))),(Object)((_changed)));
 BA.debugLineNum = 1061;BA.debugLine="params.Put(\"filedate\", filedate)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filedate"))),(Object)((_filedate)));
 BA.debugLineNum = 1062;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(32);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 1063;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(64);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1064;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(128);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1065;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"log_file";
Debug.ShouldStop(256);
utils.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("log_files")),(Object)(_insertlist));
 BA.debugLineNum = 1066;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logfilelist(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("logFileList (utils) ","utils",3,_ba,utils.mostCurrent,1078);
if (RapidSub.canDelegate("logfilelist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","logfilelist", _ba);}
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
 BA.debugLineNum = 1078;BA.debugLine="Sub logFileList As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1079;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(4194304);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 1080;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(8388608);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1081;BA.debugLine="Return InsertList";
Debug.ShouldStop(16777216);
if (true) return _insertlist;
 BA.debugLineNum = 1082;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _loglocation(RemoteObject _ba,RemoteObject _loglatitude,RemoteObject _loglongitude,RemoteObject _loguser) throws Exception{
try {
		Debug.PushSubsStack("logLocation (utils) ","utils",3,_ba,utils.mostCurrent,1151);
if (RapidSub.canDelegate("loglocation")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","loglocation", _ba, _loglatitude, _loglongitude, _loguser);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("loglatitude", _loglatitude);
Debug.locals.put("loglongitude", _loglongitude);
Debug.locals.put("loguser", _loguser);
 BA.debugLineNum = 1151;BA.debugLine="Sub logLocation(loglatitude As String, loglongitud";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1152;BA.debugLine="Dim params As Map";
Debug.ShouldStop(-2147483648);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1153;BA.debugLine="params.Initialize";
Debug.ShouldStop(1);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1154;BA.debugLine="params.Put(\"logdatetime\", GetCurrDatetime)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdatetime"))),(Object)((_getcurrdatetime(_ba))));
 BA.debugLineNum = 1155;BA.debugLine="params.Put(\"loguser\", loguser)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loguser"))),(Object)((_loguser)));
 BA.debugLineNum = 1156;BA.debugLine="params.Put(\"loglatitude\", loglatitude)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglatitude"))),(Object)((_loglatitude)));
 BA.debugLineNum = 1157;BA.debugLine="params.Put(\"loglongitude\", loglongitude)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("loglongitude"))),(Object)((_loglongitude)));
 BA.debugLineNum = 1158;BA.debugLine="params.Put(\"logdevice\", ShareCode.APP_Authorizati";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("logdevice"))),(Object)((utils.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1159;BA.debugLine="params.Put(\"reported\", 0)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1160;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(128);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 1161;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(256);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1162;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(512);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1163;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"log_posi";
Debug.ShouldStop(1024);
utils.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("log_positions")),(Object)(_insertlist));
 BA.debugLineNum = 1164;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _logs2server(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Logs2Server (utils) ","utils",3,_ba,utils.mostCurrent,1286);
if (RapidSub.canDelegate("logs2server")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","logs2server", _ba);}
RemoteObject _biglist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
 BA.debugLineNum = 1286;BA.debugLine="Sub Logs2Server As List";
Debug.ShouldStop(32);
 BA.debugLineNum = 1287;BA.debugLine="Dim BigList As List";
Debug.ShouldStop(64);
_biglist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("BigList", _biglist);
 BA.debugLineNum = 1288;BA.debugLine="BigList.Initialize";
Debug.ShouldStop(128);
_biglist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1290;BA.debugLine="Dim params As Map";
Debug.ShouldStop(512);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1291;BA.debugLine="params.Initialize";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1292;BA.debugLine="params.Put(\"errors\", getLogErrorsList)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("errors"))),(Object)((_getlogerrorslist(_ba).getObject())));
 BA.debugLineNum = 1294;BA.debugLine="BigList.Add(params)";
Debug.ShouldStop(8192);
_biglist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1296;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1297;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1298;BA.debugLine="params.Put(\"positions\", getLogPositionsList)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("positions"))),(Object)((_getlogpositionslist(_ba).getObject())));
 BA.debugLineNum = 1299;BA.debugLine="BigList.Add(params)";
Debug.ShouldStop(262144);
_biglist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1302;BA.debugLine="Return BigList";
Debug.ShouldStop(2097152);
if (true) return _biglist;
 BA.debugLineNum = 1303;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loguseraction(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _meobject) throws Exception{
try {
		Debug.PushSubsStack("LogUserAction (utils) ","utils",3,_ba,utils.mostCurrent,3556);
if (RapidSub.canDelegate("loguseraction")) { xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","loguseraction", _ba, _tagcode, _meobject); return;}
ResumableSub_LogUserAction rsub = new ResumableSub_LogUserAction(null,_ba,_tagcode,_meobject);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LogUserAction extends BA.ResumableSub {
public ResumableSub_LogUserAction(xevolution.vrcg.devdemov2400.utils parent,RemoteObject _ba,RemoteObject _tagcode,RemoteObject _meobject) {
this.parent = parent;
this._ba = _ba;
this._tagcode = _tagcode;
this._meobject = _meobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.utils parent;
RemoteObject _ba;
RemoteObject _tagcode;
RemoteObject _meobject;
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LogUserAction (utils) ","utils",3,_ba,utils.mostCurrent,3556);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("MeObject", _meobject);
 BA.debugLineNum = 3583;BA.debugLine="Private sACLALatitude As String = IfNullOrEmpty(L";
Debug.ShouldStop(1073741824);
_saclalatitude = _ifnullorempty(_ba,parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ ),RemoteObject.createImmutable(""));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 3584;BA.debugLine="Private sACLALongitude As String = IfNullOrEmpty(";
Debug.ShouldStop(-2147483648);
_saclalongitude = _ifnullorempty(_ba,parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ ),RemoteObject.createImmutable(""));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 3586;BA.debugLine="Private sACLADatetime As String = GetCurrDatetime";
Debug.ShouldStop(2);
_sacladatetime = _getcurrdatetime(_ba);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 3588;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3589;BA.debugLine="params.Initialize";
Debug.ShouldStop(16);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3590;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3591;BA.debugLine="params.Put(\"ACLAAuthorization\", ShareCode.APP_Aut";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAuthorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 3592;BA.debugLine="params.Put(\"ACLASessUser\", ShareCode.SESS_OPER_Us";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLASessUser"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 3593;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 3594;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 3595;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 3596;BA.debugLine="params.Put(\"ACLAType\", tagcode)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAType"))),(Object)((_tagcode)));
 BA.debugLineNum = 3597;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3598;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3599;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3600;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3601;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3602;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3603;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(262144);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/mobile/user/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3604;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 3605;BA.debugLine="CallApi(0, params, MeObject, Url, \"\", \"\")";
Debug.ShouldStop(1048576);
_callapi(_ba,BA.numberCast(int.class, 0),_params,_meobject,_url,BA.ObjectToString(""),RemoteObject.createImmutable(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3607;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(4194304);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,_ba,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3608;BA.debugLine="save2update(Url, MapToJson(params), 0, WorkerND)";
Debug.ShouldStop(8388608);
_save2update(_ba,_url,_maptojson(_ba,_params),BA.numberCast(int.class, 0),_workernd);
 if (true) break;
;
 BA.debugLineNum = 3618;BA.debugLine="If ShareCode.USER_LOCAL_MAP.IsInitialized Then";
Debug.ShouldStop(2);

case 6:
//if
this.state = 11;
if (parent.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 3619;BA.debugLine="ShareCode.USER_LOCAL_MAP.Clear";
Debug.ShouldStop(4);
parent.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runVoidMethod ("Clear");
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3621;BA.debugLine="ShareCode.USER_LOCAL_MAP.Initialize";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runVoidMethod ("Initialize");
 if (true) break;

case 11:
//C
this.state = -1;
;
 BA.debugLineNum = 3624;BA.debugLine="ShareCode.USER_LOCAL_MAP.Put(ShareCode.SESS_OPER";
Debug.ShouldStop(128);
parent.mostCurrent._sharecode._user_local_map /*RemoteObject*/ .runVoidMethod ("Put",(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )),(Object)((_tagcode)));
 BA.debugLineNum = 3625;BA.debugLine="File.WriteMap(Starter.InternalFolder,\"USER_STATU";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(BA.ObjectToString("USER_STATUS.MAP")),(Object)(parent.mostCurrent._sharecode._user_local_map /*RemoteObject*/ ));
 BA.debugLineNum = 3627;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(1024);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 3628;BA.debugLine="Writer.Initialize(File.OpenOutput(Starter.Intern";
Debug.ShouldStop(2048);
_writer.runVoidMethod ("Initialize",(Object)((parent.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_status.lst")))),(Object)(parent.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 3629;BA.debugLine="Writer.WriteLine($\"${ShareCode.SESS_OPER_User}|$";
Debug.ShouldStop(4096);
_writer.runVoidMethod ("WriteLine",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("|"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sacladatetime))),RemoteObject.createImmutable("|"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalatitude))),RemoteObject.createImmutable("|"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_saclalongitude))),RemoteObject.createImmutable("|"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3630;BA.debugLine="Writer.WriteLine(\"This is the second line.\")";
Debug.ShouldStop(8192);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.createImmutable("This is the second line.")));
 BA.debugLineNum = 3631;BA.debugLine="Writer.Close";
Debug.ShouldStop(16384);
_writer.runVoidMethod ("Close");
 BA.debugLineNum = 3634;BA.debugLine="Sleep(250)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utils", "loguseraction"),BA.numberCast(int.class, 250));
this.state = 12;
return;
case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 3636;BA.debugLine="End Sub";
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
public static RemoteObject  _makecomposedbutton(RemoteObject _ba,RemoteObject _cppanel,RemoteObject _icon,RemoteObject _texto) throws Exception{
try {
		Debug.PushSubsStack("MakeComposedButton (utils) ","utils",3,_ba,utils.mostCurrent,2108);
if (RapidSub.canDelegate("makecomposedbutton")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makecomposedbutton", _ba, _cppanel, _icon, _texto);}
RemoteObject _cplabelicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cplabeltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _bcolor = RemoteObject.createImmutable(0);
RemoteObject _fcolor = RemoteObject.createImmutable(0);
RemoteObject _cdw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("CPPanel", _cppanel);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Texto", _texto);
 BA.debugLineNum = 2108;BA.debugLine="Sub MakeComposedButton(CPPanel As Panel, Icon As S";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 2110;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(536870912);
if ((utils.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2111;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton_devices_2\"";
Debug.ShouldStop(1073741824);
_cppanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CP_ComposedButton_devices_2")),_ba);
 }else {
 BA.debugLineNum = 2113;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton\")";
Debug.ShouldStop(1);
_cppanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CP_ComposedButton")),_ba);
 };
 BA.debugLineNum = 2122;BA.debugLine="Dim CPLabelIcon As Label = CPPanel.GetView(0)";
Debug.ShouldStop(512);
_cplabelicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_cplabelicon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _cppanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("CPLabelIcon", _cplabelicon);
 BA.debugLineNum = 2123;BA.debugLine="Dim CPLabelText As Label = CPPanel.GetView(1)";
Debug.ShouldStop(1024);
_cplabeltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_cplabeltext = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _cppanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("CPLabelText", _cplabeltext);
 BA.debugLineNum = 2124;BA.debugLine="CPLabelIcon.Text = Icon";
Debug.ShouldStop(2048);
_cplabelicon.runMethod(true,"setText",BA.ObjectToCharSequence(_icon));
 BA.debugLineNum = 2125;BA.debugLine="CPLabelText.Text = Texto";
Debug.ShouldStop(4096);
_cplabeltext.runMethod(true,"setText",BA.ObjectToCharSequence(_texto));
 BA.debugLineNum = 2126;BA.debugLine="Dim bColor As Int = Colors.ARGB(255, 0, 120, 200)";
Debug.ShouldStop(8192);
_bcolor = utils.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 200)));Debug.locals.put("bColor", _bcolor);Debug.locals.put("bColor", _bcolor);
 BA.debugLineNum = 2127;BA.debugLine="Dim fColor As Int = Colors.ARGB(255, 240, 240, 24";
Debug.ShouldStop(16384);
_fcolor = utils.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 240)),(Object)(BA.numberCast(int.class, 240)),(Object)(BA.numberCast(int.class, 240)));Debug.locals.put("fColor", _fcolor);Debug.locals.put("fColor", _fcolor);
 BA.debugLineNum = 2130;BA.debugLine="Dim cdw As ColorDrawable";
Debug.ShouldStop(131072);
_cdw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdw", _cdw);
 BA.debugLineNum = 2131;BA.debugLine="cdw.Initialize2(fColor, 5, 1, bColor)";
Debug.ShouldStop(262144);
_cdw.runVoidMethod ("Initialize2",(Object)(_fcolor),(Object)(BA.numberCast(int.class, 5)),(Object)(BA.numberCast(int.class, 1)),(Object)(_bcolor));
 BA.debugLineNum = 2132;BA.debugLine="CPPanel.Background = cdw";
Debug.ShouldStop(524288);
_cppanel.runMethod(false,"setBackground",(_cdw.getObject()));
 BA.debugLineNum = 2137;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecomposedbuttonext(RemoteObject _ba,RemoteObject _cppanel,RemoteObject _icon,RemoteObject _texto,RemoteObject _cpdefs) throws Exception{
try {
		Debug.PushSubsStack("MakeComposedButtonExt (utils) ","utils",3,_ba,utils.mostCurrent,2037);
if (RapidSub.canDelegate("makecomposedbuttonext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makecomposedbuttonext", _ba, _cppanel, _icon, _texto, _cpdefs);}
RemoteObject _cplabelicon = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _cplabeltext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _gc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _cdw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("CPPanel", _cppanel);
Debug.locals.put("Icon", _icon);
Debug.locals.put("Texto", _texto);
Debug.locals.put("CPDefs", _cpdefs);
 BA.debugLineNum = 2037;BA.debugLine="Sub MakeComposedButtonExt(CPPanel As Panel, Icon A";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2039;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(4194304);
if ((utils.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2040;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton_devices_2\"";
Debug.ShouldStop(8388608);
_cppanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CP_ComposedButton_devices_2")),_ba);
 }else {
 BA.debugLineNum = 2042;BA.debugLine="CPPanel.LoadLayout(\"CP_ComposedButton\")";
Debug.ShouldStop(33554432);
_cppanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("CP_ComposedButton")),_ba);
 };
 BA.debugLineNum = 2051;BA.debugLine="Dim CPLabelIcon As Label = CPPanel.GetView(0)";
Debug.ShouldStop(4);
_cplabelicon = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_cplabelicon = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _cppanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("CPLabelIcon", _cplabelicon);
 BA.debugLineNum = 2052;BA.debugLine="Dim CPLabelText As Label = CPPanel.GetView(1)";
Debug.ShouldStop(8);
_cplabeltext = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_cplabeltext = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _cppanel.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("CPLabelText", _cplabeltext);
 BA.debugLineNum = 2053;BA.debugLine="CPLabelIcon.Text = Icon";
Debug.ShouldStop(16);
_cplabelicon.runMethod(true,"setText",BA.ObjectToCharSequence(_icon));
 BA.debugLineNum = 2055;BA.debugLine="CPLabelIcon.Color = CPDefs.IconBKColor";
Debug.ShouldStop(64);
_cplabelicon.runVoidMethod ("setColor",_cpdefs.getField(true,"IconBKColor" /*RemoteObject*/ ));
 BA.debugLineNum = 2056;BA.debugLine="CPLabelIcon.TextColor = CPDefs.IconColor";
Debug.ShouldStop(128);
_cplabelicon.runMethod(true,"setTextColor",_cpdefs.getField(true,"IconColor" /*RemoteObject*/ ));
 BA.debugLineNum = 2066;BA.debugLine="CPLabelText.Text = Texto";
Debug.ShouldStop(131072);
_cplabeltext.runMethod(true,"setText",BA.ObjectToCharSequence(_texto));
 BA.debugLineNum = 2068;BA.debugLine="CPLabelText.Color = CPDefs.TextSBKColor";
Debug.ShouldStop(524288);
_cplabeltext.runVoidMethod ("setColor",_cpdefs.getField(true,"TextSBKColor" /*RemoteObject*/ ));
 BA.debugLineNum = 2069;BA.debugLine="CPLabelText.TextColor = CPDefs.TextColor";
Debug.ShouldStop(1048576);
_cplabeltext.runMethod(true,"setTextColor",_cpdefs.getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 2079;BA.debugLine="If (CPDefs.TextSBKColor <> CPDefs.TextEBKColor) T";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("!",_cpdefs.getField(true,"TextSBKColor" /*RemoteObject*/ ),BA.numberCast(double.class, _cpdefs.getField(true,"TextEBKColor" /*RemoteObject*/ ))))) { 
 BA.debugLineNum = 2081;BA.debugLine="Dim gc As GradientDrawable";
Debug.ShouldStop(1);
_gc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gc", _gc);
 BA.debugLineNum = 2082;BA.debugLine="gc.Initialize(\"TOP_BOTTOM\", Array As Int(CPDefs.";
Debug.ShouldStop(2);
_gc.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {_cpdefs.getField(true,"TextSBKColor" /*RemoteObject*/ ),_cpdefs.getField(true,"TextEBKColor" /*RemoteObject*/ )})));
 BA.debugLineNum = 2083;BA.debugLine="CPLabelText.Background = gc";
Debug.ShouldStop(4);
_cplabeltext.runMethod(false,"setBackground",(_gc.getObject()));
 };
 BA.debugLineNum = 2087;BA.debugLine="Dim cdw As ColorDrawable";
Debug.ShouldStop(64);
_cdw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cdw", _cdw);
 BA.debugLineNum = 2088;BA.debugLine="cdw.Initialize2(CPDefs.PanelColor, CPDefs.BorderR";
Debug.ShouldStop(128);
_cdw.runVoidMethod ("Initialize2",(Object)(_cpdefs.getField(true,"PanelColor" /*RemoteObject*/ )),(Object)(_cpdefs.getField(true,"BorderRadius" /*RemoteObject*/ )),(Object)(_cpdefs.getField(true,"BorderWidth" /*RemoteObject*/ )),(Object)(_cpdefs.getField(true,"BorderColor" /*RemoteObject*/ )));
 BA.debugLineNum = 2089;BA.debugLine="CPPanel.Background = cdw";
Debug.ShouldStop(256);
_cppanel.runMethod(false,"setBackground",(_cdw.getObject()));
 BA.debugLineNum = 2095;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedatetimeslash(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeDateTimeSlash (utils) ","utils",3,_ba,utils.mostCurrent,1976);
if (RapidSub.canDelegate("makedatetimeslash")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makedatetimeslash", _ba);}
;
 BA.debugLineNum = 1976;BA.debugLine="Sub MakeDateTimeSlash As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1977;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(16777216);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 1978;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
Debug.ShouldStop(33554432);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy/MM/dd"));
 BA.debugLineNum = 1979;BA.debugLine="Return $\"$date{DateTime.Now}$time{DateTime.Now}\"$";
Debug.ShouldStop(67108864);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 1980;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedatetimeslash2(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeDateTimeSlash2 (utils) ","utils",3,_ba,utils.mostCurrent,1982);
if (RapidSub.canDelegate("makedatetimeslash2")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makedatetimeslash2", _ba);}
;
 BA.debugLineNum = 1982;BA.debugLine="Sub MakeDateTimeSlash2 As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1983;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(1073741824);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 1984;BA.debugLine="DateTime.DateFormat = \"yyyy/MM/dd\"";
Debug.ShouldStop(-2147483648);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy/MM/dd"));
 BA.debugLineNum = 1985;BA.debugLine="Return $\"$date{DateTime.Now}  -  $time{DateTime.N";
Debug.ShouldStop(1);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("  -  "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 1986;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makefilename(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeFileName (utils) ","utils",3,_ba,utils.mostCurrent,1970);
if (RapidSub.canDelegate("makefilename")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makefilename", _ba);}
;
 BA.debugLineNum = 1970;BA.debugLine="Sub MakeFileName As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1971;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(262144);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 1972;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(524288);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1973;BA.debugLine="Return $\"$date{DateTime.Now}$time{DateTime.Now}${";
Debug.ShouldStop(1048576);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_randomint2(_ba,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 1974;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makenulllist(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeNullList (utils) ","utils",3,_ba,utils.mostCurrent,155);
if (RapidSub.canDelegate("makenulllist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makenulllist", _ba);}
RemoteObject _retlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
 BA.debugLineNum = 155;BA.debugLine="Sub MakeNullList As List";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="Dim retList As List";
Debug.ShouldStop(134217728);
_retlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("retList", _retlist);
 BA.debugLineNum = 157;BA.debugLine="retList.Initialize";
Debug.ShouldStop(268435456);
_retlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 158;BA.debugLine="Return retList";
Debug.ShouldStop(536870912);
if (true) return _retlist;
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequesttagcode(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestTagcode (utils) ","utils",3,_ba,utils.mostCurrent,1963);
if (RapidSub.canDelegate("makerequesttagcode")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","makerequesttagcode", _ba);}
;
 BA.debugLineNum = 1963;BA.debugLine="Sub MakeRequestTagcode As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1964;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(2048);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 1966;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(8192);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1967;BA.debugLine="Return $\"IE_$date{DateTime.Now}_$time{DateTime.No";
Debug.ShouldStop(16384);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable("IE_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_randomint2(_ba,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable("")));
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
public static RemoteObject  _maketabpaneleffect(RemoteObject _ba,RemoteObject _cppanel,RemoteObject _colorstart,RemoteObject _colorend) throws Exception{
try {
		Debug.PushSubsStack("MakeTabPanelEffect (utils) ","utils",3,_ba,utils.mostCurrent,2097);
if (RapidSub.canDelegate("maketabpaneleffect")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","maketabpaneleffect", _ba, _cppanel, _colorstart, _colorend);}
RemoteObject _gc = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
;
Debug.locals.put("CPPanel", _cppanel);
Debug.locals.put("ColorStart", _colorstart);
Debug.locals.put("ColorEnd", _colorend);
 BA.debugLineNum = 2097;BA.debugLine="Sub MakeTabPanelEffect(CPPanel As Panel, ColorStar";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2100;BA.debugLine="Dim gc As GradientDrawable";
Debug.ShouldStop(524288);
_gc = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gc", _gc);
 BA.debugLineNum = 2101;BA.debugLine="gc.Initialize(\"TOP_BOTTOM\", Array As Int(ColorSta";
Debug.ShouldStop(1048576);
_gc.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {_colorstart,_colorend})));
 BA.debugLineNum = 2102;BA.debugLine="CPPanel.Background = gc";
Debug.ShouldStop(2097152);
_cppanel.runMethod(false,"setBackground",(_gc.getObject()));
 BA.debugLineNum = 2106;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketagcode(RemoteObject _ba,RemoteObject _prefix) throws Exception{
try {
		Debug.PushSubsStack("MakeTagcode (utils) ","utils",3,_ba,utils.mostCurrent,1956);
if (RapidSub.canDelegate("maketagcode")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","maketagcode", _ba, _prefix);}
;
Debug.locals.put("prefix", _prefix);
 BA.debugLineNum = 1956;BA.debugLine="Sub MakeTagcode(prefix As String) As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 1957;BA.debugLine="DateTime.TimeFormat = \"HHmmss\"";
Debug.ShouldStop(16);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HHmmss"));
 BA.debugLineNum = 1959;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(64);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 1960;BA.debugLine="Return $\"${prefix}_$date{DateTime.Now}_$time{Date";
Debug.ShouldStop(128);
if (true) return (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_prefix))),RemoteObject.createImmutable("_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_randomint2(_ba,BA.numberCast(int.class, 2))))),RemoteObject.createImmutable("")));
 BA.debugLineNum = 1961;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maptojson(RemoteObject _ba,RemoteObject _mmap) throws Exception{
try {
		Debug.PushSubsStack("MapToJson (utils) ","utils",3,_ba,utils.mostCurrent,1740);
if (RapidSub.canDelegate("maptojson")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","maptojson", _ba, _mmap);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
;
Debug.locals.put("mMap", _mmap);
 BA.debugLineNum = 1740;BA.debugLine="Sub MapToJson(mMap As Map) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1741;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(4096);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1742;BA.debugLine="JSON.Initialize(mMap)";
Debug.ShouldStop(8192);
_json.runVoidMethod ("Initialize",(Object)(_mmap));
 BA.debugLineNum = 1743;BA.debugLine="Dim Data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(16384);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Data", _data);Debug.locals.put("Data", _data);
 BA.debugLineNum = 1744;BA.debugLine="Return Data";
Debug.ShouldStop(32768);
if (true) return _data;
 BA.debugLineNum = 1745;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _measuremultilinetextheight(RemoteObject _ba,RemoteObject _actme,RemoteObject _font,RemoteObject _width,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("MeasureMultilineTextHeight (utils) ","utils",3,_ba,utils.mostCurrent,3426);
if (RapidSub.canDelegate("measuremultilinetextheight")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","measuremultilinetextheight", _ba, _actme, _font, _width, _text);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("ActMe", _actme);
Debug.locals.put("Font", _font);
Debug.locals.put("Width", _width);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 3426;BA.debugLine="Sub MeasureMultilineTextHeight (ActMe As Object, F";
Debug.ShouldStop(2);
 BA.debugLineNum = 3427;BA.debugLine="Dim jo As JavaObject = ActMe";
Debug.ShouldStop(4);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _actme);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 3428;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
Debug.ShouldStop(8);
if (true) return BA.numberCast(double.class, _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("MeasureMultilineTextHeight")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_font),(_text),(_width)}))));
 BA.debugLineNum = 3429;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mid(RemoteObject _ba,RemoteObject _strtext,RemoteObject _strstart,RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("Mid (utils) ","utils",3,_ba,utils.mostCurrent,141);
if (RapidSub.canDelegate("mid")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","mid", _ba, _strtext, _strstart, _strlength);}
RemoteObject _strfunc = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
;
Debug.locals.put("StrText", _strtext);
Debug.locals.put("StrStart", _strstart);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 141;BA.debugLine="Sub Mid(StrText As String, StrStart As Int, StrLen";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Private strfunc As StringFunctions";
Debug.ShouldStop(8192);
_strfunc = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("strfunc", _strfunc);
 BA.debugLineNum = 143;BA.debugLine="strfunc.Initialize";
Debug.ShouldStop(16384);
_strfunc.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 144;BA.debugLine="Return strfunc.Mid(StrText, StrStart, StrLength)";
Debug.ShouldStop(32768);
if (true) return _strfunc.runMethod(true,"_vvvv5",(Object)(_strtext),(Object)(_strstart),(Object)(_strlength));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ne(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("NE (utils) ","utils",3,_ba,utils.mostCurrent,2309);
if (RapidSub.canDelegate("ne")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","ne", _ba, _instr);}
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2309;BA.debugLine="Sub NE(inStr As String) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 2310;BA.debugLine="Return isNullOrEmpty(inStr)";
Debug.ShouldStop(32);
if (true) return _isnullorempty(_ba,_instr);
 BA.debugLineNum = 2311;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _negativetopositive(RemoteObject _ba,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("NegativeToPositive (utils) ","utils",3,_ba,utils.mostCurrent,113);
if (RapidSub.canDelegate("negativetopositive")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","negativetopositive", _ba, _val);}
RemoteObject _s = RemoteObject.createImmutable("");
;
Debug.locals.put("val", _val);
 BA.debugLineNum = 113;BA.debugLine="Sub NegativeToPositive(val As Int) As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Dim s As String = val";
Debug.ShouldStop(131072);
_s = BA.NumberToString(_val);Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 115;BA.debugLine="s = s.Replace(\"-\", \"\")";
Debug.ShouldStop(262144);
_s = _s.runMethod(true,"replace",(Object)(BA.ObjectToString("-")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("s", _s);
 BA.debugLineNum = 116;BA.debugLine="Return s";
Debug.ShouldStop(524288);
if (true) return BA.numberCast(int.class, _s);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _new_point(RemoteObject _ba,RemoteObject _nangle,RemoteObject _nradius,RemoteObject _centerx,RemoteObject _centery) throws Exception{
try {
		Debug.PushSubsStack("New_Point (utils) ","utils",3,_ba,utils.mostCurrent,3144);
if (RapidSub.canDelegate("new_point")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","new_point", _ba, _nangle, _nradius, _centerx, _centery);}
RemoteObject _pt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._pointapi");
;
Debug.locals.put("nAngle", _nangle);
Debug.locals.put("nRadius", _nradius);
Debug.locals.put("CenterX", _centerx);
Debug.locals.put("CenterY", _centery);
 BA.debugLineNum = 3144;BA.debugLine="Public Sub New_Point(nAngle As Float, nRadius As F";
Debug.ShouldStop(128);
 BA.debugLineNum = 3145;BA.debugLine="Dim pt As PointApi";
Debug.ShouldStop(256);
_pt = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._pointapi");Debug.locals.put("pt", _pt);
 BA.debugLineNum = 3146;BA.debugLine="pt.x = CenterX + (nRadius) * CosD(nAngle)";
Debug.ShouldStop(512);
_pt.setField ("X" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centerx,(_nradius),utils.mostCurrent.__c.runMethod(true,"CosD",(Object)(BA.numberCast(double.class, _nangle)))}, "+*",1, 0)));
 BA.debugLineNum = 3147;BA.debugLine="pt.Y  = CenterY - (nRadius) * SinD(nAngle)";
Debug.ShouldStop(1024);
_pt.setField ("Y" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_centery,(_nradius),utils.mostCurrent.__c.runMethod(true,"SinD",(Object)(BA.numberCast(double.class, _nangle)))}, "-*",1, 0)));
 BA.debugLineNum = 3148;BA.debugLine="Return pt";
Debug.ShouldStop(2048);
if (true) return _pt;
 BA.debugLineNum = 3149;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nne(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("NNE (utils) ","utils",3,_ba,utils.mostCurrent,2305);
if (RapidSub.canDelegate("nne")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","nne", _ba, _instr);}
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 2305;BA.debugLine="Sub NNE(inStr As String) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 2306;BA.debugLine="Return Not( isNullOrEmpty(inStr) )";
Debug.ShouldStop(2);
if (true) return utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_isnullorempty(_ba,_instr)));
 BA.debugLineNum = 2307;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private xui As XUI";
utils._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _queryintent(RemoteObject _ba,RemoteObject _intent1) throws Exception{
try {
		Debug.PushSubsStack("QueryIntent (utils) ","utils",3,_ba,utils.mostCurrent,2973);
if (RapidSub.canDelegate("queryintent")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","queryintent", _ba, _intent1);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 2973;BA.debugLine="Sub QueryIntent(Intent1 As Intent) As List";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2975;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(1073741824);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 2976;BA.debugLine="r.Target = r.GetContext";
Debug.ShouldStop(-2147483648);
_r.setField ("Target",(_r.runMethod(false,"GetContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba))));
 BA.debugLineNum = 2977;BA.debugLine="r.Target = r.RunMethod(\"getPackageManager\")";
Debug.ShouldStop(1);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getPackageManager"))));
 BA.debugLineNum = 2978;BA.debugLine="Dim list1 As List";
Debug.ShouldStop(2);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list1", _list1);
 BA.debugLineNum = 2979;BA.debugLine="list1 = r.RunMethod4(\"queryIntentActivities\", Arr";
Debug.ShouldStop(4);
_list1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _r.runMethod(false,"RunMethod4",(Object)(BA.ObjectToString("queryIntentActivities")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_intent1.getObject()),RemoteObject.createImmutable((0))})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("android.content.Intent"),RemoteObject.createImmutable("java.lang.int")}))));
 BA.debugLineNum = 2981;BA.debugLine="Dim listRes As List";
Debug.ShouldStop(16);
_listres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listRes", _listres);
 BA.debugLineNum = 2982;BA.debugLine="listRes.Initialize";
Debug.ShouldStop(32);
_listres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2984;BA.debugLine="For i = 0 To list1.Size - 1";
Debug.ShouldStop(128);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2985;BA.debugLine="r.Target = list1.Get(i)";
Debug.ShouldStop(256);
_r.setField ("Target",_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 2986;BA.debugLine="r.Target = r.GetField(\"activityInfo\")";
Debug.ShouldStop(512);
_r.setField ("Target",_r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("activityInfo"))));
 BA.debugLineNum = 2988;BA.debugLine="listRes.Add(r.GetField(\"packageName\"))";
Debug.ShouldStop(2048);
_listres.runVoidMethod ("Add",(Object)(_r.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("packageName")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2991;BA.debugLine="Return listRes";
Debug.ShouldStop(16384);
if (true) return _listres;
 BA.debugLineNum = 2992;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randomint2(RemoteObject _ba,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("RandomInt2 (utils) ","utils",3,_ba,utils.mostCurrent,1558);
if (RapidSub.canDelegate("randomint2")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","randomint2", _ba, _length);}
RemoteObject _abc = RemoteObject.createImmutable("");
RemoteObject _randomstr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
;
Debug.locals.put("length", _length);
 BA.debugLineNum = 1558;BA.debugLine="Sub RandomInt2(length As Int) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1559;BA.debugLine="Dim abc As String = \"0123456789\"";
Debug.ShouldStop(4194304);
_abc = BA.ObjectToString("0123456789");Debug.locals.put("abc", _abc);Debug.locals.put("abc", _abc);
 BA.debugLineNum = 1560;BA.debugLine="Dim RandomStr As StringBuilder";
Debug.ShouldStop(8388608);
_randomstr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("RandomStr", _randomstr);
 BA.debugLineNum = 1561;BA.debugLine="RandomStr.Initialize";
Debug.ShouldStop(16777216);
_randomstr.runVoidMethod ("Initialize");
 BA.debugLineNum = 1562;BA.debugLine="For i = 0 To length - 1";
Debug.ShouldStop(33554432);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1563;BA.debugLine="RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))";
Debug.ShouldStop(67108864);
_randomstr.runVoidMethod ("Append",(Object)(BA.ObjectToString(_abc.runMethod(true,"charAt",(Object)(utils.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_abc.runMethod(true,"length"))))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1565;BA.debugLine="Return RandomStr.ToString";
Debug.ShouldStop(268435456);
if (true) return _randomstr.runMethod(true,"ToString");
 BA.debugLineNum = 1566;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randomstring(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("RandomString (utils) ","utils",3,_ba,utils.mostCurrent,1535);
if (RapidSub.canDelegate("randomstring")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","randomstring", _ba);}
RemoteObject _length = RemoteObject.createImmutable(0);
RemoteObject _abc = RemoteObject.createImmutable("");
RemoteObject _randomstr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
;
 BA.debugLineNum = 1535;BA.debugLine="Sub RandomString() As String";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1536;BA.debugLine="Dim length As Int = 15";
Debug.ShouldStop(-2147483648);
_length = BA.numberCast(int.class, 15);Debug.locals.put("length", _length);Debug.locals.put("length", _length);
 BA.debugLineNum = 1537;BA.debugLine="Dim abc As String = \"0123456789ABCDEFGHIJKLMNOPQR";
Debug.ShouldStop(1);
_abc = BA.ObjectToString("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");Debug.locals.put("abc", _abc);Debug.locals.put("abc", _abc);
 BA.debugLineNum = 1538;BA.debugLine="Dim RandomStr As StringBuilder";
Debug.ShouldStop(2);
_randomstr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("RandomStr", _randomstr);
 BA.debugLineNum = 1539;BA.debugLine="RandomStr.Initialize";
Debug.ShouldStop(4);
_randomstr.runVoidMethod ("Initialize");
 BA.debugLineNum = 1540;BA.debugLine="For i = 0 To length - 1";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1541;BA.debugLine="RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))";
Debug.ShouldStop(16);
_randomstr.runVoidMethod ("Append",(Object)(BA.ObjectToString(_abc.runMethod(true,"charAt",(Object)(utils.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_abc.runMethod(true,"length"))))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1543;BA.debugLine="Return MakeFileName & RandomStr.ToString";
Debug.ShouldStop(64);
if (true) return RemoteObject.concat(_makefilename(_ba),_randomstr.runMethod(true,"ToString"));
 BA.debugLineNum = 1544;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _randomstring2(RemoteObject _ba,RemoteObject _length) throws Exception{
try {
		Debug.PushSubsStack("RandomString2 (utils) ","utils",3,_ba,utils.mostCurrent,1547);
if (RapidSub.canDelegate("randomstring2")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","randomstring2", _ba, _length);}
RemoteObject _abc = RemoteObject.createImmutable("");
RemoteObject _randomstr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
;
Debug.locals.put("length", _length);
 BA.debugLineNum = 1547;BA.debugLine="Sub RandomString2(length As Int) As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1549;BA.debugLine="Dim abc As String = \"0123456789ABCDEFGHIJKLMNOPQR";
Debug.ShouldStop(4096);
_abc = BA.ObjectToString("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");Debug.locals.put("abc", _abc);Debug.locals.put("abc", _abc);
 BA.debugLineNum = 1550;BA.debugLine="Dim RandomStr As StringBuilder";
Debug.ShouldStop(8192);
_randomstr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("RandomStr", _randomstr);
 BA.debugLineNum = 1551;BA.debugLine="RandomStr.Initialize";
Debug.ShouldStop(16384);
_randomstr.runVoidMethod ("Initialize");
 BA.debugLineNum = 1552;BA.debugLine="For i = 0 To length - 1";
Debug.ShouldStop(32768);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_length,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1553;BA.debugLine="RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))";
Debug.ShouldStop(65536);
_randomstr.runVoidMethod ("Append",(Object)(BA.ObjectToString(_abc.runMethod(true,"charAt",(Object)(utils.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(_abc.runMethod(true,"length"))))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1555;BA.debugLine="Return RandomStr.ToString";
Debug.ShouldStop(262144);
if (true) return _randomstr.runMethod(true,"ToString");
 BA.debugLineNum = 1556;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeduplicates(RemoteObject _ba,RemoteObject _plist) throws Exception{
try {
		Debug.PushSubsStack("RemoveDuplicates (utils) ","utils",3,_ba,utils.mostCurrent,3923);
if (RapidSub.canDelegate("removeduplicates")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","removeduplicates", _ba, _plist);}
RemoteObject _lstnew = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _objitem = RemoteObject.declareNull("Object");
int _i = 0;
;
Debug.locals.put("pList", _plist);
 BA.debugLineNum = 3923;BA.debugLine="Sub RemoveDuplicates(pList As List) As List";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3924;BA.debugLine="If pList = Null Or Not(pList.IsInitialized) Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("n",_plist) || RemoteObject.solveBoolean(".",utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_plist.runMethod(true,"IsInitialized"))))) { 
if (true) return _plist;};
 BA.debugLineNum = 3926;BA.debugLine="Dim lstNew As List : lstNew.Initialize";
Debug.ShouldStop(2097152);
_lstnew = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstNew", _lstnew);
 BA.debugLineNum = 3926;BA.debugLine="Dim lstNew As List : lstNew.Initialize";
Debug.ShouldStop(2097152);
_lstnew.runVoidMethod ("Initialize");
 BA.debugLineNum = 3927;BA.debugLine="Dim objItem As Object";
Debug.ShouldStop(4194304);
_objitem = RemoteObject.createNew ("Object");Debug.locals.put("objItem", _objitem);
 BA.debugLineNum = 3929;BA.debugLine="For i = 0 To pList.Size - 1";
Debug.ShouldStop(16777216);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_plist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3930;BA.debugLine="objItem = pList.Get(i)";
Debug.ShouldStop(33554432);
_objitem = _plist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("objItem", _objitem);
 BA.debugLineNum = 3931;BA.debugLine="If lstNew.IndexOf(objItem) = - 1 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_lstnew.runMethod(true,"IndexOf",(Object)(_objitem)),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 3932;BA.debugLine="lstNew.Add(objItem)";
Debug.ShouldStop(134217728);
_lstnew.runVoidMethod ("Add",(Object)(_objitem));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3936;BA.debugLine="Return lstNew";
Debug.ShouldStop(-2147483648);
if (true) return _lstnew;
 BA.debugLineNum = 3937;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replaceformulafields(RemoteObject _ba,RemoteObject _request_tagcode,RemoteObject _task_tagcode,RemoteObject _item_tagcode,RemoteObject _repeatcounter,RemoteObject _repeatitemcounter,RemoteObject _repeatfieldcounter,RemoteObject _formula,RemoteObject _thistext) throws Exception{
try {
		Debug.PushSubsStack("ReplaceFormulaFields (utils) ","utils",3,_ba,utils.mostCurrent,3833);
if (RapidSub.canDelegate("replaceformulafields")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","replaceformulafields", _ba, _request_tagcode, _task_tagcode, _item_tagcode, _repeatcounter, _repeatitemcounter, _repeatfieldcounter, _formula, _thistext);}
RemoteObject _formularesult = RemoteObject.createImmutable("");
RemoteObject _posisstart = RemoteObject.createImmutable(0);
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _posisend = RemoteObject.createImmutable(0);
RemoteObject _valor = RemoteObject.createImmutable("");
RemoteObject _getresultvalor = RemoteObject.createImmutable("");
;
Debug.locals.put("request_tagcode", _request_tagcode);
Debug.locals.put("task_tagcode", _task_tagcode);
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("repeatcounter", _repeatcounter);
Debug.locals.put("repeatitemcounter", _repeatitemcounter);
Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);
Debug.locals.put("Formula", _formula);
Debug.locals.put("thisText", _thistext);
 BA.debugLineNum = 3833;BA.debugLine="Sub ReplaceFormulaFields(request_tagcode As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3836;BA.debugLine="Log(\"ENTROU EM : ReplaceFormulaFields\")";
Debug.ShouldStop(134217728);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","616056323",RemoteObject.createImmutable("ENTROU EM : ReplaceFormulaFields"),0);
 BA.debugLineNum = 3837;BA.debugLine="Dim FormulaResult As String = Formula.ToUpperCase";
Debug.ShouldStop(268435456);
_formularesult = _formula.runMethod(true,"toUpperCase").runMethod(true,"replace",(Object)(BA.ObjectToString("[TV]")),(Object)(_thistext));Debug.locals.put("FormulaResult", _formularesult);Debug.locals.put("FormulaResult", _formularesult);
 BA.debugLineNum = 3839;BA.debugLine="Dim PosisStart As Int = FormulaResult.IndexOf(\"[\"";
Debug.ShouldStop(1073741824);
_posisstart = _formularesult.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("[")));Debug.locals.put("PosisStart", _posisstart);Debug.locals.put("PosisStart", _posisstart);
 BA.debugLineNum = 3840;BA.debugLine="Dim counter As Int = 0";
Debug.ShouldStop(-2147483648);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("counter", _counter);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 3841;BA.debugLine="Do While PosisStart >=0";
Debug.ShouldStop(1);
while (RemoteObject.solveBoolean("g",_posisstart,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 3842;BA.debugLine="Dim PosisEnd As Int = FormulaResult.IndexOf(\"]\")";
Debug.ShouldStop(2);
_posisend = _formularesult.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("]")));Debug.locals.put("PosisEnd", _posisend);Debug.locals.put("PosisEnd", _posisend);
 BA.debugLineNum = 3843;BA.debugLine="Log($\"${PosisStart}, ${PosisEnd}\"$)";
Debug.ShouldStop(4);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","616056330",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_posisstart))),RemoteObject.createImmutable(", "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_posisend))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3844;BA.debugLine="If (PosisEnd >= 0) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("g",_posisend,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 3845;BA.debugLine="Dim Valor As String = FormulaResult.SubString2(";
Debug.ShouldStop(16);
_valor = _formularesult.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_posisstart,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_posisend));Debug.locals.put("Valor", _valor);Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 3847;BA.debugLine="Dim getResultValor As String = DBStructures.Get";
Debug.ShouldStop(64);
_getresultvalor = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(execute_value, 0) as valor\n"),RemoteObject.createImmutable("						from dta_requests_values where request_tagcode='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and task_tagcode='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and item_tagcode='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_valor))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and repeatcounter="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and repeatitemcounter="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatitemcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and repeatfieldcounter="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						limit 1")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("getResultValor", _getresultvalor);Debug.locals.put("getResultValor", _getresultvalor);
 BA.debugLineNum = 3856;BA.debugLine="If getResultValor =\"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_getresultvalor,BA.ObjectToString(""))) { 
 BA.debugLineNum = 3857;BA.debugLine="Dim getResultValor As String = DBStructures.Ge";
Debug.ShouldStop(65536);
_getresultvalor = utils.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,_ba,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(execute_value, 0) as valor\n"),RemoteObject.createImmutable("						from dta_requests_values where request_tagcode='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and task_tagcode='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("						and item_tagcode='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_valor))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("						and repeatcounter="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						and repeatitemcounter=0\n"),RemoteObject.createImmutable("						and repeatfieldcounter="),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatfieldcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("						limit 1")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("getResultValor", _getresultvalor);Debug.locals.put("getResultValor", _getresultvalor);
 BA.debugLineNum = 3865;BA.debugLine="If  getResultValor = \"\" Then getResultValor =";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_getresultvalor,BA.ObjectToString(""))) { 
_getresultvalor = BA.ObjectToString("0");Debug.locals.put("getResultValor", _getresultvalor);};
 };
 BA.debugLineNum = 3870;BA.debugLine="FormulaResult = FormulaResult.Replace($\"[${Valo";
Debug.ShouldStop(536870912);
_formularesult = _formularesult.runMethod(true,"replace",(Object)((RemoteObject.concat(RemoteObject.createImmutable("["),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_valor))),RemoteObject.createImmutable("]")))),(Object)(_getresultvalor));Debug.locals.put("FormulaResult", _formularesult);
 BA.debugLineNum = 3871;BA.debugLine="Dim PosisStart As Int = FormulaResult.IndexOf(\"";
Debug.ShouldStop(1073741824);
_posisstart = _formularesult.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("[")));Debug.locals.put("PosisStart", _posisstart);Debug.locals.put("PosisStart", _posisstart);
 BA.debugLineNum = 3872;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(-2147483648);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 }else {
 BA.debugLineNum = 3874;BA.debugLine="Exit";
Debug.ShouldStop(2);
if (true) break;
 };
 }
;
 BA.debugLineNum = 3878;BA.debugLine="Return FormulaResult";
Debug.ShouldStop(32);
if (true) return _formularesult;
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
public static RemoteObject  _resizebitmap(RemoteObject _ba,RemoteObject _bmp,RemoteObject _scale) throws Exception{
try {
		Debug.PushSubsStack("ResizeBitmap (utils) ","utils",3,_ba,utils.mostCurrent,2569);
if (RapidSub.canDelegate("resizebitmap")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","resizebitmap", _ba, _bmp, _scale);}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _ss = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
;
Debug.locals.put("bmp", _bmp);
Debug.locals.put("scale", _scale);
 BA.debugLineNum = 2569;BA.debugLine="Sub ResizeBitmap(bmp As Bitmap, scale As Float) As";
Debug.ShouldStop(256);
 BA.debugLineNum = 2570;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(512);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 2571;BA.debugLine="img.Initialize(\"\")";
Debug.ShouldStop(1024);
_img.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2572;BA.debugLine="img.Width = bmp.Width * scale";
Debug.ShouldStop(2048);
_img.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getWidth"),_scale}, "*",0, 0)));
 BA.debugLineNum = 2573;BA.debugLine="img.Height = bmp.Height * scale";
Debug.ShouldStop(4096);
_img.runMethod(true,"setHeight",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_bmp.runMethod(true,"getHeight"),_scale}, "*",0, 0)));
 BA.debugLineNum = 2574;BA.debugLine="Dim ss As B4XCanvas";
Debug.ShouldStop(8192);
_ss = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("ss", _ss);
 BA.debugLineNum = 2575;BA.debugLine="ss.Initialize(img)";
Debug.ShouldStop(16384);
_ss.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _img.getObject()));
 BA.debugLineNum = 2576;BA.debugLine="ss.DrawBitmap(bmp, ss.TargetRect)";
Debug.ShouldStop(32768);
_ss.runVoidMethod ("DrawBitmap",(Object)((_bmp.getObject())),(Object)(_ss.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 2577;BA.debugLine="Dim res As Bitmap = ss.CreateBitmap";
Debug.ShouldStop(65536);
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_res = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _ss.runMethod(false,"CreateBitmap").getObject());Debug.locals.put("res", _res);
 BA.debugLineNum = 2578;BA.debugLine="ss.Release";
Debug.ShouldStop(131072);
_ss.runVoidMethod ("Release");
 BA.debugLineNum = 2579;BA.debugLine="Return res";
Debug.ShouldStop(262144);
if (true) return _res;
 BA.debugLineNum = 2580;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reversqlfromfilesanddelete(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("ReverSQLFromFilesAndDelete (utils) ","utils",3,_ba,utils.mostCurrent,3766);
if (RapidSub.canDelegate("reversqlfromfilesanddelete")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","reversqlfromfilesanddelete", _ba);}
RemoteObject _filelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _script = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 3766;BA.debugLine="Sub ReverSQLFromFilesAndDelete";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 3767;BA.debugLine="Dim FileList As List = File.ListFiles(Starter.Int";
Debug.ShouldStop(4194304);
_filelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filelist = utils.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ));Debug.locals.put("FileList", _filelist);Debug.locals.put("FileList", _filelist);
 BA.debugLineNum = 3768;BA.debugLine="For n=0 To FileList.Size-1";
Debug.ShouldStop(8388608);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_filelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step2 > 0 && _n <= limit2) || (step2 < 0 && _n >= limit2) ;_n = ((int)(0 + _n + step2))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3769;BA.debugLine="Dim filename As String = FileList.Get(n)";
Debug.ShouldStop(16777216);
_filename = BA.ObjectToString(_filelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 3770;BA.debugLine="If (filename.StartsWith(\"sql_\") And filename.End";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean(".",_filename.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("sql_")))) && RemoteObject.solveBoolean(".",_filename.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".recover")))))) { 
 BA.debugLineNum = 3771;BA.debugLine="Dim Script As String = File.ReadString(Starter.";
Debug.ShouldStop(67108864);
_script = utils.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));Debug.locals.put("Script", _script);Debug.locals.put("Script", _script);
 BA.debugLineNum = 3772;BA.debugLine="If NNE(Script) Then";
Debug.ShouldStop(134217728);
if (_nne(_ba,_script).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3773;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(Script)";
Debug.ShouldStop(268435456);
utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_script));
 BA.debugLineNum = 3774;BA.debugLine="File.Delete(Starter.InternalFolder, filename)";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename));
 };
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3778;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _right(RemoteObject _ba,RemoteObject _strtext,RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("Right (utils) ","utils",3,_ba,utils.mostCurrent,135);
if (RapidSub.canDelegate("right")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","right", _ba, _strtext, _strlength);}
RemoteObject _strfunc = RemoteObject.declareNull("adr.stringfunctions.stringfunctions");
;
Debug.locals.put("StrText", _strtext);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 135;BA.debugLine="Sub Right(StrText As String, StrLength As Int) As";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Private strfunc As StringFunctions";
Debug.ShouldStop(128);
_strfunc = RemoteObject.createNew ("adr.stringfunctions.stringfunctions");Debug.locals.put("strfunc", _strfunc);
 BA.debugLineNum = 137;BA.debugLine="strfunc.Initialize";
Debug.ShouldStop(256);
_strfunc.runVoidMethod ("_initialize",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 138;BA.debugLine="Return strfunc.Right(StrText, StrLength)";
Debug.ShouldStop(512);
if (true) return _strfunc.runMethod(true,"_vvvvv7",(Object)(_strtext),(Object)(BA.numberCast(long.class, _strlength)));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _save2update(RemoteObject _ba,RemoteObject _tablename,RemoteObject _data,RemoteObject _typelog,RemoteObject _wnd) throws Exception{
try {
		Debug.PushSubsStack("save2update (utils) ","utils",3,_ba,utils.mostCurrent,1775);
if (RapidSub.canDelegate("save2update")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","save2update", _ba, _tablename, _data, _typelog, _wnd);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("tablename", _tablename);
Debug.locals.put("Data", _data);
Debug.locals.put("typelog", _typelog);
Debug.locals.put("WND", _wnd);
 BA.debugLineNum = 1775;BA.debugLine="Sub save2update(tablename As String, Data As Strin";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1776;BA.debugLine="save2updateFile(tablename, Data, typelog, \"OFFLIN";
Debug.ShouldStop(32768);
_save2updatefile(_ba,_tablename,_data,_typelog,BA.ObjectToString("OFFLINE"),_wnd);
 BA.debugLineNum = 1784;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1785;BA.debugLine="params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1786;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_date"))),(Object)((_getcurrdatetimeext(_ba))));
 BA.debugLineNum = 1787;BA.debugLine="params.Put(\"up_state\", 0)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_state"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1788;BA.debugLine="params.Put(\"up_type\", typelog)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_type"))),(Object)((_typelog)));
 BA.debugLineNum = 1789;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tableurl"))),(Object)((_tablename)));
 BA.debugLineNum = 1790;BA.debugLine="params.Put(\"up_values\", Data)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_values"))),(Object)((_data)));
 BA.debugLineNum = 1791;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_typeoper"))),(Object)((_wnd.getField(true,"up_typeoper" /*RemoteObject*/ ))));
 BA.debugLineNum = 1792;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tagcode"))),(Object)((_wnd.getField(true,"up_tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1793;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_task"))),(Object)((_wnd.getField(true,"up_task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1794;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_itemtagcode"))),(Object)((_wnd.getField(true,"up_itemtagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1796;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(8);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 1797;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(16);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1798;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(32);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1802;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 1803;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"loc_upd";
Debug.ShouldStop(1024);
utils.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("loc_updatesrever")),(Object)(_insertlist));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e19.toString()); BA.debugLineNum = 1805;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4096);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1806;BA.debugLine="params.Initialize";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1807;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_date"))),(Object)((_getcurrdatetimeext(_ba))));
 BA.debugLineNum = 1808;BA.debugLine="params.Put(\"up_state\", 0)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_state"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1809;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tableurl"))),(Object)((_tablename)));
 BA.debugLineNum = 1810;BA.debugLine="params.Put(\"up_values\", Data)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_values"))),(Object)((_data)));
 BA.debugLineNum = 1811;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_typeoper"))),(Object)((_wnd.getField(true,"up_typeoper" /*RemoteObject*/ ))));
 BA.debugLineNum = 1812;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tagcode"))),(Object)((_wnd.getField(true,"up_tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1813;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_task"))),(Object)((_wnd.getField(true,"up_task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1814;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_itemtagcode"))),(Object)((_wnd.getField(true,"up_itemtagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1815;BA.debugLine="InsertList.Clear";
Debug.ShouldStop(4194304);
_insertlist.runVoidMethod ("Clear");
 BA.debugLineNum = 1816;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(8388608);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1817;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"loc_upd";
Debug.ShouldStop(16777216);
utils.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(BA.ObjectToString("loc_updatesrever")),(Object)(_insertlist));
 };
 BA.debugLineNum = 1822;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _save2updatefile(RemoteObject _ba,RemoteObject _tablename,RemoteObject _data,RemoteObject _typelog,RemoteObject _request,RemoteObject _wnd) throws Exception{
try {
		Debug.PushSubsStack("save2updateFile (utils) ","utils",3,_ba,utils.mostCurrent,1824);
if (RapidSub.canDelegate("save2updatefile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","save2updatefile", _ba, _tablename, _data, _typelog, _request, _wnd);}
RemoteObject _requeststr = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("tablename", _tablename);
Debug.locals.put("Data", _data);
Debug.locals.put("typelog", _typelog);
Debug.locals.put("request", _request);
Debug.locals.put("WND", _wnd);
 BA.debugLineNum = 1824;BA.debugLine="Sub save2updateFile(tablename As String, Data As S";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1826;BA.debugLine="Dim RequestStr As String = IfNotNullOrEmptyAdd(re";
Debug.ShouldStop(2);
_requeststr = _ifnotnulloremptyadd(_ba,_request,RemoteObject.createImmutable("_"));Debug.locals.put("RequestStr", _requeststr);Debug.locals.put("RequestStr", _requeststr);
 BA.debugLineNum = 1827;BA.debugLine="Dim FileName As String = $\"APICALL_${RequestStr}_";
Debug.ShouldStop(4);
_filename = (RemoteObject.concat(RemoteObject.createImmutable("APICALL_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_requeststr))),RemoteObject.createImmutable("_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("__"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_getcurrdatetimet2ext(_ba,RemoteObject.createImmutable("_"))))),RemoteObject.createImmutable(".svrlog")));Debug.locals.put("FileName", _filename);Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 1828;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1829;BA.debugLine="params.Initialize";
Debug.ShouldStop(16);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1830;BA.debugLine="params.Put(\"up_user\", ShareCode.SESS_OPER_User)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_user"))),(Object)((utils.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 1831;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_date"))),(Object)((_getcurrdatetimeext(_ba))));
 BA.debugLineNum = 1832;BA.debugLine="params.Put(\"up_state\", 0)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_state"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1833;BA.debugLine="params.Put(\"up_type\", typelog)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_type"))),(Object)((_typelog)));
 BA.debugLineNum = 1834;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tableurl"))),(Object)((_tablename)));
 BA.debugLineNum = 1835;BA.debugLine="params.Put(\"up_values\", Data)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_values"))),(Object)((_data)));
 BA.debugLineNum = 1836;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_typeoper"))),(Object)((_wnd.getField(true,"up_typeoper" /*RemoteObject*/ ))));
 BA.debugLineNum = 1837;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tagcode"))),(Object)((_wnd.getField(true,"up_tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1838;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_task"))),(Object)((_wnd.getField(true,"up_task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1839;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_itemtagcode"))),(Object)((_wnd.getField(true,"up_itemtagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1840;BA.debugLine="File.WriteMap(Starter.SharedFolder, FileName, par";
Debug.ShouldStop(32768);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteMap",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(_params));
 BA.debugLineNum = 1841;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveemail2update(RemoteObject _ba,RemoteObject _request,RemoteObject _data,RemoteObject _typelog,RemoteObject _wnd) throws Exception{
try {
		Debug.PushSubsStack("saveEmail2update (utils) ","utils",3,_ba,utils.mostCurrent,1747);
if (RapidSub.canDelegate("saveemail2update")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","saveemail2update", _ba, _request, _data, _typelog, _wnd);}
RemoteObject _tablename = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _insertlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("request", _request);
Debug.locals.put("data", _data);
Debug.locals.put("typelog", _typelog);
Debug.locals.put("WND", _wnd);
 BA.debugLineNum = 1747;BA.debugLine="Sub saveEmail2update(request As String, data As St";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1749;BA.debugLine="Dim tablename As String = \"loc_updateemails\"";
Debug.ShouldStop(1048576);
_tablename = BA.ObjectToString("loc_updateemails");Debug.locals.put("tablename", _tablename);Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 1750;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2097152);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1752;BA.debugLine="params.Initialize";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1753;BA.debugLine="params.Put(\"up_date\", GetCurrDatetimeExt)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_date"))),(Object)((_getcurrdatetimeext(_ba))));
 BA.debugLineNum = 1754;BA.debugLine="params.Put(\"up_state\", 0)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_state"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 1755;BA.debugLine="params.Put(\"up_type\", typelog)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_type"))),(Object)((_typelog)));
 BA.debugLineNum = 1756;BA.debugLine="params.Put(\"up_tableurl\", tablename)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tableurl"))),(Object)((_tablename)));
 BA.debugLineNum = 1757;BA.debugLine="params.Put(\"up_values\", data)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_values"))),(Object)((_data)));
 BA.debugLineNum = 1758;BA.debugLine="params.Put(\"up_typeoper\",WND.up_typeoper)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_typeoper"))),(Object)((_wnd.getField(true,"up_typeoper" /*RemoteObject*/ ))));
 BA.debugLineNum = 1759;BA.debugLine="params.Put(\"up_tagcode\",WND.up_tagcode)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_tagcode"))),(Object)((_wnd.getField(true,"up_tagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1760;BA.debugLine="params.Put(\"up_task\",WND.up_task)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_task"))),(Object)((_wnd.getField(true,"up_task" /*RemoteObject*/ ))));
 BA.debugLineNum = 1761;BA.debugLine="params.Put(\"up_itemtagcode\",WND.up_itemtagcode)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("up_itemtagcode"))),(Object)((_wnd.getField(true,"up_itemtagcode" /*RemoteObject*/ ))));
 BA.debugLineNum = 1763;BA.debugLine="Dim InsertList As List";
Debug.ShouldStop(4);
_insertlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("InsertList", _insertlist);
 BA.debugLineNum = 1764;BA.debugLine="InsertList.Initialize";
Debug.ShouldStop(8);
_insertlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1765;BA.debugLine="InsertList.Add(params)";
Debug.ShouldStop(16);
_insertlist.runVoidMethod ("Add",(Object)((_params.getObject())));
 BA.debugLineNum = 1767;BA.debugLine="Try";
Debug.ShouldStop(64);
try { BA.debugLineNum = 1768;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, tablenam";
Debug.ShouldStop(128);
utils.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,_ba,(Object)(utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ ),(Object)(_tablename),(Object)(_insertlist));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e19.toString()); BA.debugLineNum = 1770;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","67405591",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 };
 BA.debugLineNum = 1773;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveimagefromb64tofile(RemoteObject _ba,RemoteObject _b64,RemoteObject _filename,RemoteObject _filetype) throws Exception{
try {
		Debug.PushSubsStack("SaveImageFromB64ToFile (utils) ","utils",3,_ba,utils.mostCurrent,1917);
if (RapidSub.canDelegate("saveimagefromb64tofile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","saveimagefromb64tofile", _ba, _b64, _filename, _filetype);}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
;
Debug.locals.put("b64", _b64);
Debug.locals.put("filename", _filename);
Debug.locals.put("filetype", _filetype);
 BA.debugLineNum = 1917;BA.debugLine="Sub SaveImageFromB64ToFile( b64 As String, filenam";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1918;BA.debugLine="Dim img As Bitmap = B64ToBitmap(b64)";
Debug.ShouldStop(536870912);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_img = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _b64tobitmap(_ba,_b64).getObject());Debug.locals.put("img", _img);
 BA.debugLineNum = 1919;BA.debugLine="SaveImageviewToFile(img, filename, filetype)";
Debug.ShouldStop(1073741824);
_saveimageviewtofile(_ba,_img,_filename,_filetype);
 BA.debugLineNum = 1920;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _saveimageviewtofile(RemoteObject _ba,RemoteObject _img,RemoteObject _filename,RemoteObject _filetype) throws Exception{
try {
		Debug.PushSubsStack("SaveImageviewToFile (utils) ","utils",3,_ba,utils.mostCurrent,1902);
if (RapidSub.canDelegate("saveimageviewtofile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","saveimageviewtofile", _ba, _img, _filename, _filetype);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
;
Debug.locals.put("img", _img);
Debug.locals.put("filename", _filename);
Debug.locals.put("filetype", _filetype);
 BA.debugLineNum = 1902;BA.debugLine="Sub SaveImageviewToFile(img As Bitmap, filename As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1907;BA.debugLine="Dim Out As OutputStream";
Debug.ShouldStop(262144);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("Out", _out);
 BA.debugLineNum = 1909;BA.debugLine="Out = File.OpenOutput(Starter.InternalFolder, fil";
Debug.ShouldStop(1048576);
_out = utils.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(utils.mostCurrent.__c.getField(true,"False")));Debug.locals.put("Out", _out);
 BA.debugLineNum = 1913;BA.debugLine="img.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALI";
Debug.ShouldStop(16777216);
_img.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(utils.mostCurrent._sharecode._device_def_quality /*RemoteObject*/ ),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),_filetype)));
 BA.debugLineNum = 1914;BA.debugLine="Out.Close";
Debug.ShouldStop(33554432);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 1915;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savescripttolog(RemoteObject _ba,RemoteObject _request,RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("SaveScriptToLog (utils) ","utils",3,_ba,utils.mostCurrent,1107);
if (RapidSub.canDelegate("savescripttolog")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","savescripttolog", _ba, _request, _script);}
RemoteObject _tsave = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
RemoteObject _dt = RemoteObject.createImmutable("");
;
Debug.locals.put("request", _request);
Debug.locals.put("script", _script);
 BA.debugLineNum = 1107;BA.debugLine="Sub SaveScriptToLog(request As String, script As S";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1109;BA.debugLine="Dim tSave As TextWriter";
Debug.ShouldStop(1048576);
_tsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("tSave", _tsave);
 BA.debugLineNum = 1110;BA.debugLine="Dim dt As String = GetCurrDatetimeT2(\"\")";
Debug.ShouldStop(2097152);
_dt = _getcurrdatetimet2(_ba,RemoteObject.createImmutable(""));Debug.locals.put("dt", _dt);Debug.locals.put("dt", _dt);
 BA.debugLineNum = 1111;BA.debugLine="tSave.Initialize(File.OpenOutput(Starter.SharedFo";
Debug.ShouldStop(4194304);
_tsave.runVoidMethod ("Initialize",(Object)((utils.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable("request_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request.runMethod(true,"trim")))),RemoteObject.createImmutable("_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dt))),RemoteObject.createImmutable(".log")))),(Object)(utils.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 1112;BA.debugLine="tSave.WriteLine(script)";
Debug.ShouldStop(8388608);
_tsave.runVoidMethod ("WriteLine",(Object)(_script));
 BA.debugLineNum = 1113;BA.debugLine="tSave.Close";
Debug.ShouldStop(16777216);
_tsave.runVoidMethod ("Close");
 BA.debugLineNum = 1128;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savesql2fileanddelete(RemoteObject _ba,RemoteObject _table,RemoteObject _continuejob) throws Exception{
try {
		Debug.PushSubsStack("SaveSQL2FileAndDelete (utils) ","utils",3,_ba,utils.mostCurrent,3750);
if (RapidSub.canDelegate("savesql2fileanddelete")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","savesql2fileanddelete", _ba, _table, _continuejob);}
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _script = RemoteObject.createImmutable("");
RemoteObject _filename = RemoteObject.createImmutable("");
;
Debug.locals.put("table", _table);
Debug.locals.put("ContinueJob", _continuejob);
 BA.debugLineNum = 3750;BA.debugLine="Sub SaveSQL2FileAndDelete(table As String, Continu";
Debug.ShouldStop(32);
 BA.debugLineNum = 3751;BA.debugLine="Dim ret As Boolean = ContinueJob";
Debug.ShouldStop(64);
_ret = _continuejob;Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 3752;BA.debugLine="If (ret) Then";
Debug.ShouldStop(128);
if ((_ret).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3753;BA.debugLine="Dim Script As String = GetTableColumnsValues(tab";
Debug.ShouldStop(256);
_script = _gettablecolumnsvalues(_ba,_table);Debug.locals.put("Script", _script);Debug.locals.put("Script", _script);
 BA.debugLineNum = 3754;BA.debugLine="If NNE(Script) Then";
Debug.ShouldStop(512);
if (_nne(_ba,_script).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3755;BA.debugLine="Dim filename As String = $\"sql_${table}.recover";
Debug.ShouldStop(1024);
_filename = (RemoteObject.concat(RemoteObject.createImmutable("sql_"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable(".recover")));Debug.locals.put("filename", _filename);Debug.locals.put("filename", _filename);
 BA.debugLineNum = 3756;BA.debugLine="File.WriteString(Starter.InternalFolder, filena";
Debug.ShouldStop(2048);
utils.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(_script));
 BA.debugLineNum = 3757;BA.debugLine="If (File.Exists(Starter.InternalFolder, filenam";
Debug.ShouldStop(4096);
if ((utils.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(utils.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3758;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"delete from";
Debug.ShouldStop(8192);
utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.concat(RemoteObject.createImmutable("delete from "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_table))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3759;BA.debugLine="ret = True";
Debug.ShouldStop(16384);
_ret = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 };
 };
 };
 BA.debugLineNum = 3763;BA.debugLine="Return ret";
Debug.ShouldStop(262144);
if (true) return _ret;
 BA.debugLineNum = 3764;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savesqltolog(RemoteObject _ba,RemoteObject _local,RemoteObject _sqlscript,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("SaveSQLToLog (utils) ","utils",3,_ba,utils.mostCurrent,1084);
if (RapidSub.canDelegate("savesqltolog")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","savesqltolog", _ba, _local, _sqlscript, _request);}
RemoteObject _ret = RemoteObject.createImmutable(false);
;
Debug.locals.put("Local", _local);
Debug.locals.put("SQLScript", _sqlscript);
Debug.locals.put("request", _request);
 BA.debugLineNum = 1084;BA.debugLine="Sub SaveSQLToLog(Local As String, SQLScript As Str";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1085;BA.debugLine="Dim ret As Boolean = True";
Debug.ShouldStop(268435456);
_ret = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1086;BA.debugLine="Try";
Debug.ShouldStop(536870912);
try { BA.debugLineNum = 1087;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(SQLScript)";
Debug.ShouldStop(1073741824);
utils.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sqlscript));
 BA.debugLineNum = 1088;BA.debugLine="Log(SQLScript)";
Debug.ShouldStop(-2147483648);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65505028",_sqlscript,0);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e6.toString()); BA.debugLineNum = 1090;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65505030",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 1091;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(4);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 BA.debugLineNum = 1092;BA.debugLine="logError(Local, ShareCode.SESS_OPER_User, $\"${SQ";
Debug.ShouldStop(8);
_logerror(_ba,_local,utils.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlscript))),RemoteObject.createImmutable(" :: "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.runMethod(false,"LastException",_ba).getObject()))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1093;BA.debugLine="Log(\"ERROR : \" & SQLScript)";
Debug.ShouldStop(16);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65505033",RemoteObject.concat(RemoteObject.createImmutable("ERROR : "),_sqlscript),0);
 BA.debugLineNum = 1094;BA.debugLine="ret = False";
Debug.ShouldStop(32);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 1097;BA.debugLine="If NNE(request) Then";
Debug.ShouldStop(256);
if (_nne(_ba,_request).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1098;BA.debugLine="If Not(SQLScript.EndsWith(\";\")) Then";
Debug.ShouldStop(512);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_sqlscript.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1099;BA.debugLine="SQLScript = $\"${SQLScript};\"$";
Debug.ShouldStop(1024);
_sqlscript = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sqlscript))),RemoteObject.createImmutable(";")));Debug.locals.put("SQLScript", _sqlscript);
 };
 BA.debugLineNum = 1101;BA.debugLine="SaveScriptToLog(request, SQLScript)";
Debug.ShouldStop(4096);
_savescripttolog(_ba,_request,_sqlscript);
 };
 BA.debugLineNum = 1103;BA.debugLine="Return ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 1104;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _securerandomgenerator(RemoteObject _ba,RemoteObject _minimum,RemoteObject _maximum) throws Exception{
try {
		Debug.PushSubsStack("SecureRandomGenerator (utils) ","utils",3,_ba,utils.mostCurrent,1504);
if (RapidSub.canDelegate("securerandomgenerator")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","securerandomgenerator", _ba, _minimum, _maximum);}
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper");
RemoteObject _data = null;
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _random = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.createImmutable(0);
;
Debug.locals.put("Minimum", _minimum);
Debug.locals.put("Maximum", _maximum);
 BA.debugLineNum = 1504;BA.debugLine="Sub SecureRandomGenerator(Minimum As Int, Maximum";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1505;BA.debugLine="Dim sr As SecureRandom";
Debug.ShouldStop(1);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper");Debug.locals.put("sr", _sr);
 BA.debugLineNum = 1506;BA.debugLine="Dim data(4) As Byte";
Debug.ShouldStop(2);
_data = RemoteObject.createNewArray ("byte", new int[] {4}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 1507;BA.debugLine="sr.GetRandomBytes(data)";
Debug.ShouldStop(4);
_sr.runVoidMethod ("GetRandomBytes",(Object)(_data));
 BA.debugLineNum = 1508;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(8);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1509;BA.debugLine="Dim random As Int = bc.IntsFromBytes(data)(0)";
Debug.ShouldStop(16);
_random = _bc.runMethod(false,"IntsFromBytes",(Object)(_data)).getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("random", _random);Debug.locals.put("random", _random);
 BA.debugLineNum = 1510;BA.debugLine="Maximum = Maximum - 1";
Debug.ShouldStop(32);
_maximum = RemoteObject.solve(new RemoteObject[] {_maximum,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("Maximum", _maximum);
 BA.debugLineNum = 1511;BA.debugLine="Dim d As Double = random / 0x7FFFFFFF";
Debug.ShouldStop(64);
_d = RemoteObject.solve(new RemoteObject[] {_random,RemoteObject.createImmutable(0x7fffffff)}, "/",0, 0);Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 1512;BA.debugLine="Dim res As Int = Round(d * (Maximum - Minimum + 1";
Debug.ShouldStop(128);
_res = BA.numberCast(int.class, utils.mostCurrent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {_d,(RemoteObject.solve(new RemoteObject[] {_maximum,_minimum,RemoteObject.createImmutable(1)}, "-+",2, 1)),RemoteObject.createImmutable(2),(RemoteObject.solve(new RemoteObject[] {_minimum,_maximum}, "+",1, 1)),RemoteObject.createImmutable(2)}, "*/+/",1, 0))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1514;BA.debugLine="Return res";
Debug.ShouldStop(512);
if (true) return _res;
 BA.debugLineNum = 1515;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectfieldfromlocalsqlwrkconfigtable(RemoteObject _ba,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("SelectFieldFromLocalSQLWRKConfigTable (utils) ","utils",3,_ba,utils.mostCurrent,665);
if (RapidSub.canDelegate("selectfieldfromlocalsqlwrkconfigtable")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","selectfieldfromlocalsqlwrkconfigtable", _ba, _columnname);}
RemoteObject _retstr = RemoteObject.createImmutable("");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
;
Debug.locals.put("columnName", _columnname);
 BA.debugLineNum = 665;BA.debugLine="Sub SelectFieldFromLocalSQLWRKConfigTable(columnNa";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 666;BA.debugLine="Dim retStr As String = \"\"";
Debug.ShouldStop(33554432);
_retstr = BA.ObjectToString("");Debug.locals.put("retStr", _retstr);Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 667;BA.debugLine="Dim SQL As String = $\"select ${columnName} from c";
Debug.ShouldStop(67108864);
_sql = (RemoteObject.concat(RemoteObject.createImmutable("select "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_columnname))),RemoteObject.createImmutable(" from config where id=1")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 668;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLWRK";
Debug.ShouldStop(134217728);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), utils.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 669;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(268435456);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 670;BA.debugLine="retStr = Record.GetString($\"${columnName}\"$)";
Debug.ShouldStop(536870912);
_retstr = _record.runMethod(true,"GetString",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_columnname))),RemoteObject.createImmutable("")))));Debug.locals.put("retStr", _retstr);
 BA.debugLineNum = 671;BA.debugLine="Exit";
Debug.ShouldStop(1073741824);
if (true) break;
 }
;
 BA.debugLineNum = 673;BA.debugLine="Record.Close";
Debug.ShouldStop(1);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 674;BA.debugLine="Return retStr";
Debug.ShouldStop(2);
if (true) return _retstr;
 BA.debugLineNum = 675;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendemail(RemoteObject _ba,RemoteObject _emailto,RemoteObject _subject,RemoteObject _details) throws Exception{
try {
		Debug.PushSubsStack("SendEmail (utils) ","utils",3,_ba,utils.mostCurrent,3297);
if (RapidSub.canDelegate("sendemail")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","sendemail", _ba, _emailto, _subject, _details);}
RemoteObject _esmtp = RemoteObject.declareNull("anywheresoftware.b4a.net.SMTPWrapper");
;
Debug.locals.put("EmailTo", _emailto);
Debug.locals.put("Subject", _subject);
Debug.locals.put("Details", _details);
 BA.debugLineNum = 3297;BA.debugLine="Sub SendEmail(EmailTo As String, Subject As String";
Debug.ShouldStop(1);
 BA.debugLineNum = 3298;BA.debugLine="Dim eSMTP As SMTP";
Debug.ShouldStop(2);
_esmtp = RemoteObject.createNew ("anywheresoftware.b4a.net.SMTPWrapper");Debug.locals.put("eSMTP", _esmtp);
 BA.debugLineNum = 3299;BA.debugLine="eSMTP.Initialize($\"mail.${ShareCode.APPL_HOST}\"$,";
Debug.ShouldStop(4);
_esmtp.runVoidMethod ("Initialize",(Object)((RemoteObject.concat(RemoteObject.createImmutable("mail."),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 587)),(Object)((RemoteObject.concat(RemoteObject.createImmutable("alertas@"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.ObjectToString("..Alertas@VRCG_20!9")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3300;BA.debugLine="eSMTP.StartTLSMode = True";
Debug.ShouldStop(8);
_esmtp.runMethod(true,"setStartTLSMode",utils.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3302;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase.Contains(\"g";
Debug.ShouldStop(32);
if ((utils.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase").runMethod(true,"contains",(Object)(RemoteObject.createImmutable("grandative")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3303;BA.debugLine="eSMTP.MailFrom = \"apoioaocliente@grandative.pt\"";
Debug.ShouldStop(64);
_esmtp.setField ("MailFrom",BA.ObjectToString("apoioaocliente@grandative.pt"));
 }else 
{ BA.debugLineNum = 3304;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase = \"bra";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",utils.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("brasfone")))) { 
 BA.debugLineNum = 3305;BA.debugLine="eSMTP.MailFrom = \"info@vehiclestoragefaro.com\"";
Debug.ShouldStop(256);
_esmtp.setField ("MailFrom",BA.ObjectToString("info@vehiclestoragefaro.com"));
 }}
;
 BA.debugLineNum = 3308;BA.debugLine="eSMTP.HtmlBody = True";
Debug.ShouldStop(2048);
_esmtp.runMethod(true,"setHtmlBody",utils.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3309;BA.debugLine="eSMTP.To.AddAll(Regex.Split(\"\\;\", EmailTo ))";
Debug.ShouldStop(4096);
_esmtp.runMethod(false,"getTo").runVoidMethod ("AddAll",(Object)(utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\;")),(Object)(_emailto))))));
 BA.debugLineNum = 3310;BA.debugLine="eSMTP.BCC.Add(\"palpedrinha@gmail.com\")";
Debug.ShouldStop(8192);
_esmtp.runMethod(false,"getBCC").runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("palpedrinha@gmail.com"))));
 BA.debugLineNum = 3311;BA.debugLine="eSMTP.Subject = Subject";
Debug.ShouldStop(16384);
_esmtp.runMethod(true,"setSubject",_subject);
 BA.debugLineNum = 3312;BA.debugLine="eSMTP.Body = Details";
Debug.ShouldStop(32768);
_esmtp.runMethod(true,"setBody",_details);
 BA.debugLineNum = 3313;BA.debugLine="eSMTP.Send";
Debug.ShouldStop(65536);
_esmtp.runVoidMethod ("Send",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 3314;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sendemailext(RemoteObject _ba,RemoteObject _emailto,RemoteObject _emailcc,RemoteObject _subject,RemoteObject _details,RemoteObject _imglist) throws Exception{
try {
		Debug.PushSubsStack("SendEmailExt (utils) ","utils",3,_ba,utils.mostCurrent,3316);
if (RapidSub.canDelegate("sendemailext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","sendemailext", _ba, _emailto, _emailcc, _subject, _details, _imglist);}
;
Debug.locals.put("EmailTo", _emailto);
Debug.locals.put("EmailCC", _emailcc);
Debug.locals.put("Subject", _subject);
Debug.locals.put("Details", _details);
Debug.locals.put("imgList", _imglist);
 BA.debugLineNum = 3316;BA.debugLine="Sub SendEmailExt(EmailTo As String, EmailCC As Str";
Debug.ShouldStop(524288);
 BA.debugLineNum = 3319;BA.debugLine="Starter.RequestEmailFromBO(\"\",EmailTo,EmailCC, Su";
Debug.ShouldStop(4194304);
utils.mostCurrent._starter.runVoidMethod ("_requestemailfrombo" /*RemoteObject*/ ,(Object)(BA.ObjectToString("")),(Object)(_emailto),(Object)(_emailcc),(Object)(_subject),(Object)(RemoteObject.createImmutable("")));
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
public static RemoteObject  _setbuttonbackgroundcolortomaincolorwithradius(RemoteObject _ba,RemoteObject _view,RemoteObject _radius) throws Exception{
try {
		Debug.PushSubsStack("SetButtonBackgroundColorToMainColorWithRadius (utils) ","utils",3,_ba,utils.mostCurrent,3106);
if (RapidSub.canDelegate("setbuttonbackgroundcolortomaincolorwithradius")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setbuttonbackgroundcolortomaincolorwithradius", _ba, _view, _radius);}
RemoteObject _cdrawable = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("view", _view);
Debug.locals.put("radius", _radius);
 BA.debugLineNum = 3106;BA.debugLine="Sub SetButtonBackgroundColorToMainColorWithRadius(";
Debug.ShouldStop(2);
 BA.debugLineNum = 3108;BA.debugLine="Dim CDrawable As ColorDrawable";
Debug.ShouldStop(8);
_cdrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CDrawable", _cdrawable);
 BA.debugLineNum = 3109;BA.debugLine="CDrawable.Initialize(Consts.ColorMain, radius)";
Debug.ShouldStop(16);
_cdrawable.runVoidMethod ("Initialize",(Object)(utils.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(_radius));
 BA.debugLineNum = 3110;BA.debugLine="view.Background = CDrawable";
Debug.ShouldStop(32);
_view.runMethod(false,"setBackground",(_cdrawable.getObject()));
 BA.debugLineNum = 3115;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdialogcolors(RemoteObject _ba,RemoteObject _dialog,RemoteObject _backcolor,RemoteObject _bordercolor,RemoteObject _borderwidth,RemoteObject _borderradius) throws Exception{
try {
		Debug.PushSubsStack("SetDialogColors (utils) ","utils",3,_ba,utils.mostCurrent,2139);
if (RapidSub.canDelegate("setdialogcolors")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setdialogcolors", _ba, _dialog, _backcolor, _bordercolor, _borderwidth, _borderradius);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("dialog", _dialog);
Debug.locals.put("backColor", _backcolor);
Debug.locals.put("borderColor", _bordercolor);
Debug.locals.put("borderWidth", _borderwidth);
Debug.locals.put("borderRadius", _borderradius);
 BA.debugLineNum = 2139;BA.debugLine="Sub SetDialogColors(dialog As Object, backColor As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2142;BA.debugLine="Dim jo As JavaObject = dialog";
Debug.ShouldStop(536870912);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _dialog);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2143;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(1073741824);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 2144;BA.debugLine="cd.Initialize2(backColor, borderRadius, borderWid";
Debug.ShouldStop(-2147483648);
_cd.runVoidMethod ("Initialize2",(Object)(_backcolor),(Object)(_borderradius),(Object)(_borderwidth),(Object)(_bordercolor));
 BA.debugLineNum = 2145;BA.debugLine="jo.RunMethodJO(\"getWindow\", Null).RunMethod(\"setB";
Debug.ShouldStop(1);
_jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((utils.mostCurrent.__c.getField(false,"Null")))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setBackgroundDrawable")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})));
 BA.debugLineNum = 2149;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdialogtitle(RemoteObject _ba,RemoteObject _dialog,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("SetDialogtitle (utils) ","utils",3,_ba,utils.mostCurrent,2152);
if (RapidSub.canDelegate("setdialogtitle")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setdialogtitle", _ba, _dialog, _title);}
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("dialog", _dialog);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 2152;BA.debugLine="Sub SetDialogtitle(dialog As Object, Title As Stri";
Debug.ShouldStop(128);
 BA.debugLineNum = 2153;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(256);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 2155;BA.debugLine="Dim jo As JavaObject = dialog";
Debug.ShouldStop(1024);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _dialog);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2156;BA.debugLine="jo.RunMethod(\"setTitle\", Array(cs.Initialize.Appe";
Debug.ShouldStop(2048);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setTitle")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cs.runMethod(false,"Initialize").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_title))).runMethod(false,"PopAll").getObject())})));
 BA.debugLineNum = 2162;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontsizelist(RemoteObject _ba,RemoteObject _fontsize,RemoteObject _inlist) throws Exception{
try {
		Debug.PushSubsStack("SetFontSizeList (utils) ","utils",3,_ba,utils.mostCurrent,2552);
if (RapidSub.canDelegate("setfontsizelist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setfontsizelist", _ba, _fontsize, _inlist);}
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
;
Debug.locals.put("fontsize", _fontsize);
Debug.locals.put("inList", _inlist);
 BA.debugLineNum = 2552;BA.debugLine="Sub SetFontSizeList(fontsize As Int, inList As Lis";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 2553;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(16777216);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 2554;BA.debugLine="Dim Items As List";
Debug.ShouldStop(33554432);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("Items", _items);
 BA.debugLineNum = 2555;BA.debugLine="Items.Initialize";
Debug.ShouldStop(67108864);
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 2557;BA.debugLine="For i = 0 To inList.Size-1";
Debug.ShouldStop(268435456);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_inlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2558;BA.debugLine="Items.Add( cs.Initialize.Typeface(Typeface.DEFAU";
Debug.ShouldStop(536870912);
_items.runVoidMethod ("Add",(Object)((_cs.runMethod(false,"Initialize").runMethod(false,"Typeface",(Object)(utils.mostCurrent.__c.getField(false,"Typeface").getField(false,"DEFAULT"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_inlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).runMethod(false,"PopAll").getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2566;BA.debugLine="Return Items";
Debug.ShouldStop(32);
if (true) return _items;
 BA.debugLineNum = 2567;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnhours(RemoteObject _ba,RemoteObject _hours,RemoteObject _currhora) throws Exception{
try {
		Debug.PushSubsStack("SetNHours (utils) ","utils",3,_ba,utils.mostCurrent,2732);
if (RapidSub.canDelegate("setnhours")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setnhours", _ba, _hours, _currhora);}
RemoteObject _currentime = RemoteObject.createImmutable(0L);
RemoteObject _newtime = RemoteObject.createImmutable(0L);
RemoteObject _p1 = RemoteObject.declareNull("b4a.example.dateutils._period");
;
Debug.locals.put("hours", _hours);
Debug.locals.put("CurrHora", _currhora);
 BA.debugLineNum = 2732;BA.debugLine="Sub SetNHours(hours As Int, CurrHora As String) As";
Debug.ShouldStop(2048);
 BA.debugLineNum = 2733;BA.debugLine="DateTime.timeFormat = \"HH:mm\"";
Debug.ShouldStop(4096);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm"));
 BA.debugLineNum = 2734;BA.debugLine="If NNE(CurrHora) Then";
Debug.ShouldStop(8192);
if (_nne(_ba,_currhora).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2735;BA.debugLine="Dim Currentime As Long = DateTime.TimeParse(Curr";
Debug.ShouldStop(16384);
_currentime = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"TimeParse",(Object)(_currhora));Debug.locals.put("Currentime", _currentime);Debug.locals.put("Currentime", _currentime);
 }else {
 BA.debugLineNum = 2737;BA.debugLine="Dim Currentime As Long = DateTime.Now";
Debug.ShouldStop(65536);
_currentime = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("Currentime", _currentime);Debug.locals.put("Currentime", _currentime);
 };
 BA.debugLineNum = 2740;BA.debugLine="Dim NewTime As Long";
Debug.ShouldStop(524288);
_newtime = RemoteObject.createImmutable(0L);Debug.locals.put("NewTime", _newtime);
 BA.debugLineNum = 2741;BA.debugLine="Dim p1 As Period";
Debug.ShouldStop(1048576);
_p1 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p1", _p1);
 BA.debugLineNum = 2742;BA.debugLine="p1.Hours = hours";
Debug.ShouldStop(2097152);
_p1.setField ("Hours",_hours);
 BA.debugLineNum = 2743;BA.debugLine="NewTime = DateUtils.AddPeriod(Currentime, p1)";
Debug.ShouldStop(4194304);
_newtime = utils.mostCurrent._dateutils.runMethod(true,"_addperiod",_ba,(Object)(_currentime),(Object)(_p1));Debug.locals.put("NewTime", _newtime);
 BA.debugLineNum = 2744;BA.debugLine="Return DateTime.time(NewTime)";
Debug.ShouldStop(8388608);
if (true) return utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(_newtime));
 BA.debugLineNum = 2745;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogressdrawable(RemoteObject _ba,RemoteObject _p,RemoteObject _drawable) throws Exception{
try {
		Debug.PushSubsStack("SetProgressDrawable (utils) ","utils",3,_ba,utils.mostCurrent,3125);
if (RapidSub.canDelegate("setprogressdrawable")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setprogressdrawable", _ba, _p, _drawable);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _clipdrawable = RemoteObject.declareNull("Object");
;
Debug.locals.put("p", _p);
Debug.locals.put("drawable", _drawable);
 BA.debugLineNum = 3125;BA.debugLine="Sub SetProgressDrawable(p As ProgressBar, drawable";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 3126;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(2097152);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 3127;BA.debugLine="Dim clipDrawable As Object";
Debug.ShouldStop(4194304);
_clipdrawable = RemoteObject.createNew ("Object");Debug.locals.put("clipDrawable", _clipdrawable);
 BA.debugLineNum = 3128;BA.debugLine="clipDrawable = r.CreateObject2(\"android.graphics.";
Debug.ShouldStop(8388608);
_clipdrawable = _r.runMethod(false,"CreateObject2",(Object)(BA.ObjectToString("android.graphics.drawable.ClipDrawable")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_drawable,(utils.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT")),RemoteObject.createImmutable((1))})),(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("android.graphics.drawable.Drawable"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));Debug.locals.put("clipDrawable", _clipdrawable);
 BA.debugLineNum = 3130;BA.debugLine="r.Target = p";
Debug.ShouldStop(33554432);
_r.setField ("Target",(_p.getObject()));
 BA.debugLineNum = 3131;BA.debugLine="r.Target = r.RunMethod(\"getProgressDrawable\") 'Ge";
Debug.ShouldStop(67108864);
_r.setField ("Target",_r.runMethod(false,"RunMethod",(Object)(RemoteObject.createImmutable("getProgressDrawable"))));
 BA.debugLineNum = 3132;BA.debugLine="r.RunMethod4(\"setDrawableByLayerId\", Array As Obj";
Debug.ShouldStop(134217728);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDrawableByLayerId")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_r.runMethod(false,"GetStaticField",(Object)(BA.ObjectToString("android.R$id")),(Object)(RemoteObject.createImmutable("progress"))),_clipdrawable})),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 3134;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogressdrawableext(RemoteObject _ba,RemoteObject _p,RemoteObject _posis,RemoteObject _colrs,RemoteObject _radcorner) throws Exception{
try {
		Debug.PushSubsStack("SetProgressDrawableExt (utils) ","utils",3,_ba,utils.mostCurrent,3118);
if (RapidSub.canDelegate("setprogressdrawableext")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setprogressdrawableext", _ba, _p, _posis, _colrs, _radcorner);}
RemoteObject _gd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
;
Debug.locals.put("p", _p);
Debug.locals.put("posis", _posis);
Debug.locals.put("colrs", _colrs);
Debug.locals.put("radcorner", _radcorner);
 BA.debugLineNum = 3118;BA.debugLine="Sub SetProgressDrawableExt(p As ProgressBar, posis";
Debug.ShouldStop(8192);
 BA.debugLineNum = 3119;BA.debugLine="Dim gd As GradientDrawable";
Debug.ShouldStop(16384);
_gd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gd", _gd);
 BA.debugLineNum = 3120;BA.debugLine="gd.Initialize(posis, colrs)";
Debug.ShouldStop(32768);
_gd.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),_posis)),(Object)(_colrs));
 BA.debugLineNum = 3121;BA.debugLine="gd.CornerRadius = radcorner";
Debug.ShouldStop(65536);
_gd.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _radcorner));
 BA.debugLineNum = 3122;BA.debugLine="SetProgressDrawable(p, gd)";
Debug.ShouldStop(131072);
_setprogressdrawable(_ba,_p,(_gd.getObject()));
 BA.debugLineNum = 3123;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewbackgroundcolortomaincolor(RemoteObject _ba,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("SetViewBackgroundColorToMainColor (utils) ","utils",3,_ba,utils.mostCurrent,3096);
if (RapidSub.canDelegate("setviewbackgroundcolortomaincolor")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setviewbackgroundcolortomaincolor", _ba, _view);}
RemoteObject _cdrawable = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("view", _view);
 BA.debugLineNum = 3096;BA.debugLine="Sub SetViewBackgroundColorToMainColor(view As View";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3098;BA.debugLine="Dim CDrawable As ColorDrawable";
Debug.ShouldStop(33554432);
_cdrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CDrawable", _cdrawable);
 BA.debugLineNum = 3099;BA.debugLine="CDrawable.Initialize(Consts.ColorMain, 0)";
Debug.ShouldStop(67108864);
_cdrawable.runVoidMethod ("Initialize",(Object)(utils.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 3100;BA.debugLine="view.Background = CDrawable";
Debug.ShouldStop(134217728);
_view.runMethod(false,"setBackground",(_cdrawable.getObject()));
 BA.debugLineNum = 3104;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewbackgroundcolortomaingradientcolor(RemoteObject _ba,RemoteObject _view) throws Exception{
try {
		Debug.PushSubsStack("SetViewBackgroundColorToMainGradientColor (utils) ","utils",3,_ba,utils.mostCurrent,3084);
if (RapidSub.canDelegate("setviewbackgroundcolortomaingradientcolor")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","setviewbackgroundcolortomaingradientcolor", _ba, _view);}
RemoteObject _gdrawable = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
;
Debug.locals.put("view", _view);
 BA.debugLineNum = 3084;BA.debugLine="Sub SetViewBackgroundColorToMainGradientColor(view";
Debug.ShouldStop(2048);
 BA.debugLineNum = 3086;BA.debugLine="Dim GDrawable As GradientDrawable";
Debug.ShouldStop(8192);
_gdrawable = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("GDrawable", _gdrawable);
 BA.debugLineNum = 3087;BA.debugLine="GDrawable.Initialize(\"TOP_BOTTOM\", Array As Int(C";
Debug.ShouldStop(16384);
_gdrawable.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {utils.mostCurrent._consts._colormain /*RemoteObject*/ ,utils.mostCurrent._consts._colorsub /*RemoteObject*/ })));
 BA.debugLineNum = 3088;BA.debugLine="view.Background = GDrawable";
Debug.ShouldStop(32768);
_view.runMethod(false,"setBackground",(_gdrawable.getObject()));
 BA.debugLineNum = 3094;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showcustomtoast(RemoteObject _ba,RemoteObject _text,RemoteObject _longduration,RemoteObject _times2show,RemoteObject _backgroundcolor) throws Exception{
try {
		Debug.PushSubsStack("ShowCustomToast (utils) ","utils",3,_ba,utils.mostCurrent,3780);
if (RapidSub.canDelegate("showcustomtoast")) { xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","showcustomtoast", _ba, _text, _longduration, _times2show, _backgroundcolor); return;}
ResumableSub_ShowCustomToast rsub = new ResumableSub_ShowCustomToast(null,_ba,_text,_longduration,_times2show,_backgroundcolor);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowCustomToast extends BA.ResumableSub {
public ResumableSub_ShowCustomToast(xevolution.vrcg.devdemov2400.utils parent,RemoteObject _ba,RemoteObject _text,RemoteObject _longduration,RemoteObject _times2show,RemoteObject _backgroundcolor) {
this.parent = parent;
this._ba = _ba;
this._text = _text;
this._longduration = _longduration;
this._times2show = _times2show;
this._backgroundcolor = _backgroundcolor;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.utils parent;
RemoteObject _ba;
RemoteObject _text;
RemoteObject _longduration;
RemoteObject _times2show;
RemoteObject _backgroundcolor;
RemoteObject _ctxt = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _toast = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
int _x = 0;
int step14;
int limit14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowCustomToast (utils) ","utils",3,_ba,utils.mostCurrent,3780);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("Text", _text);
Debug.locals.put("LongDuration", _longduration);
Debug.locals.put("Times2Show", _times2show);
Debug.locals.put("BackgroundColor", _backgroundcolor);
 BA.debugLineNum = 3782;BA.debugLine="Dim ctxt As JavaObject";
Debug.ShouldStop(32);
_ctxt = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("ctxt", _ctxt);
 BA.debugLineNum = 3783;BA.debugLine="ctxt.InitializeContext";
Debug.ShouldStop(64);
_ctxt.runVoidMethod ("InitializeContext",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba));
 BA.debugLineNum = 3784;BA.debugLine="Dim duration As Int";
Debug.ShouldStop(128);
_duration = RemoteObject.createImmutable(0);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 3785;BA.debugLine="If LongDuration Then duration = 1 Else duration =";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 8;
if (_longduration.<Boolean>get().booleanValue()) { 
this.state = 3;
;}
else {
this.state = 5;
;}if (true) break;

case 3:
//C
this.state = 8;
_duration = BA.numberCast(int.class, 1);Debug.locals.put("duration", _duration);
if (true) break;

case 5:
//C
this.state = 8;
_duration = BA.numberCast(int.class, 0);Debug.locals.put("duration", _duration);
if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 3786;BA.debugLine="Dim toast As JavaObject";
Debug.ShouldStop(512);
_toast = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("toast", _toast);
 BA.debugLineNum = 3787;BA.debugLine="toast = toast.InitializeStatic(\"android.widget.To";
Debug.ShouldStop(1024);
_toast = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _toast.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("android.widget.Toast"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("makeText")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_ctxt.getObject()),_text,(_duration)}))));
 BA.debugLineNum = 3788;BA.debugLine="Dim v As View = toast.RunMethod(\"getView\", Null)";
Debug.ShouldStop(2048);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _toast.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getView")),(Object)((parent.mostCurrent.__c.getField(false,"Null")))));Debug.locals.put("v", _v);
 BA.debugLineNum = 3789;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(4096);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 3790;BA.debugLine="cd.Initialize(BackgroundColor, 20dip)";
Debug.ShouldStop(8192);
_cd.runVoidMethod ("Initialize",(Object)(_backgroundcolor),(Object)(parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))));
 BA.debugLineNum = 3791;BA.debugLine="v.Background = cd";
Debug.ShouldStop(16384);
_v.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 3793;BA.debugLine="toast.RunMethod(\"setGravity\", Array(Bit.Or(Gravit";
Debug.ShouldStop(65536);
_toast.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setGravity")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(parent.mostCurrent.__c.getField(false,"Bit").runMethod(true,"Or",(Object)(parent.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL")),(Object)(parent.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")))),RemoteObject.createImmutable((0)),RemoteObject.createImmutable((0))})));
 BA.debugLineNum = 3794;BA.debugLine="toast.RunMethod(\"show\", Null)";
Debug.ShouldStop(131072);
_toast.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("show")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 BA.debugLineNum = 3796;BA.debugLine="If Times2Show > 0 Then";
Debug.ShouldStop(524288);
if (true) break;

case 9:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",_times2show,BA.numberCast(double.class, 0))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3797;BA.debugLine="For x=1 To Times2Show";
Debug.ShouldStop(1048576);
if (true) break;

case 12:
//for
this.state = 15;
step14 = 1;
limit14 = _times2show.<Integer>get().intValue();
_x = 1 ;
Debug.locals.put("x", _x);
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
Debug.locals.put("x", _x);
if (true) break;

case 14:
//C
this.state = 18;
 BA.debugLineNum = 3798;BA.debugLine="Sleep(3750)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "utils", "showcustomtoast"),BA.numberCast(int.class, 3750));
this.state = 19;
return;
case 19:
//C
this.state = 18;
;
 BA.debugLineNum = 3799;BA.debugLine="toast.RunMethod(\"show\", Null)";
Debug.ShouldStop(4194304);
_toast.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("show")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
Debug.locals.put("x", _x);
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3803;BA.debugLine="End Sub";
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
public static RemoteObject  _showlog(RemoteObject _ba,RemoteObject _text,RemoteObject _value,RemoteObject _division) throws Exception{
try {
		Debug.PushSubsStack("ShowLog (utils) ","utils",3,_ba,utils.mostCurrent,1022);
if (RapidSub.canDelegate("showlog")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","showlog", _ba, _text, _value, _division);}
RemoteObject _strdiv = RemoteObject.createImmutable("");
;
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
Debug.locals.put("Division", _division);
 BA.debugLineNum = 1022;BA.debugLine="Sub ShowLog(Text As String, Value As String, Divis";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1023;BA.debugLine="If Division Then";
Debug.ShouldStop(1073741824);
if (_division.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1024;BA.debugLine="Dim StrDiv As String = IncChars(Text.Length+Valu";
Debug.ShouldStop(-2147483648);
_strdiv = _incchars(_ba,RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),_value.runMethod(true,"length"),RemoteObject.createImmutable(2)}, "++",2, 1),BA.ObjectToString("="),utils.mostCurrent.__c.getField(true,"True"));Debug.locals.put("StrDiv", _strdiv);Debug.locals.put("StrDiv", _strdiv);
 BA.debugLineNum = 1025;BA.debugLine="Log($\"${StrDiv}\"$)";
Debug.ShouldStop(1);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65111811",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strdiv))),RemoteObject.createImmutable(""))),0);
 };
 BA.debugLineNum = 1027;BA.debugLine="Log($\"${Text}: ${Value}\"$)";
Debug.ShouldStop(4);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65111813",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_text))),RemoteObject.createImmutable(": "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable(""))),0);
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
public static RemoteObject  _showloglist(RemoteObject _ba,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ShowLogList (utils) ","utils",3,_ba,utils.mostCurrent,1042);
if (RapidSub.canDelegate("showloglist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","showloglist", _ba, _text, _value);}
RemoteObject _strdiv = RemoteObject.createImmutable("");
int _n = 0;
;
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1042;BA.debugLine="Sub ShowLogList(Text As String, Value As List)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1043;BA.debugLine="Log($\"${Text}: Lista de valores\"$)";
Debug.ShouldStop(262144);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65242881",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_text))),RemoteObject.createImmutable(": Lista de valores"))),0);
 BA.debugLineNum = 1044;BA.debugLine="Dim StrDiv As String = IncChars(Text.Length+2, \"=";
Debug.ShouldStop(524288);
_strdiv = _incchars(_ba,RemoteObject.solve(new RemoteObject[] {_text.runMethod(true,"length"),RemoteObject.createImmutable(2)}, "+",1, 1),BA.ObjectToString("="),utils.mostCurrent.__c.getField(true,"True"));Debug.locals.put("StrDiv", _strdiv);Debug.locals.put("StrDiv", _strdiv);
 BA.debugLineNum = 1045;BA.debugLine="If (Value.Size >= 1) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("g",_value.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1046;BA.debugLine="For n=0 To Value.Size-1";
Debug.ShouldStop(2097152);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_value.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step4 > 0 && _n <= limit4) || (step4 < 0 && _n >= limit4) ;_n = ((int)(0 + _n + step4))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 1047;BA.debugLine="Log($\"${StrDiv}- ${Value.Get(n)}\"$)";
Debug.ShouldStop(4194304);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65242885",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strdiv))),RemoteObject.createImmutable("- "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))))),RemoteObject.createImmutable(""))),0);
 }
}Debug.locals.put("n", _n);
;
 }else {
 BA.debugLineNum = 1050;BA.debugLine="Log($\"${StrDiv}- Sem valores\"$)";
Debug.ShouldStop(33554432);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","65242888",(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strdiv))),RemoteObject.createImmutable("- Sem valores"))),0);
 };
 BA.debugLineNum = 1052;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showprocinlog(RemoteObject _ba,RemoteObject _module2show,RemoteObject _procedure2show,RemoteObject _data2show) throws Exception{
try {
		Debug.PushSubsStack("ShowProcinLog (utils) ","utils",3,_ba,utils.mostCurrent,28);
if (RapidSub.canDelegate("showprocinlog")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","showprocinlog", _ba, _module2show, _procedure2show, _data2show);}
;
Debug.locals.put("Module2Show", _module2show);
Debug.locals.put("Procedure2Show", _procedure2show);
Debug.locals.put("Data2Show", _data2show);
 BA.debugLineNum = 28;BA.debugLine="Sub ShowProcinLog(Module2Show As String, Procedure";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="Log($\"===========================================";
Debug.ShouldStop(536870912);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","62818050",(RemoteObject.createImmutable("=========================================================")),0);
 BA.debugLineNum = 31;BA.debugLine="Log($\"Modulo : ${Module2Show}\"$)";
Debug.ShouldStop(1073741824);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","62818051",(RemoteObject.concat(RemoteObject.createImmutable("Modulo : "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_module2show))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 32;BA.debugLine="Log($\"Sub : ${Procedure2Show}\"$)";
Debug.ShouldStop(-2147483648);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","62818052",(RemoteObject.concat(RemoteObject.createImmutable("Sub : "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_procedure2show))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 33;BA.debugLine="Log($\"Dados : ${Data2Show}\"$)";
Debug.ShouldStop(1);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","62818053",(RemoteObject.concat(RemoteObject.createImmutable("Dados : "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data2show))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 34;BA.debugLine="Log($\"===========================================";
Debug.ShouldStop(2);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","62818054",(RemoteObject.createImmutable("=========================================================")),0);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sitoboolean(RemoteObject _ba,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SIToBoolean (utils) ","utils",3,_ba,utils.mostCurrent,1014);
if (RapidSub.canDelegate("sitoboolean")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","sitoboolean", _ba, _v);}
;
Debug.locals.put("v", _v);
 BA.debugLineNum = 1014;BA.debugLine="Sub SIToBoolean(v As String) As Boolean";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1015;BA.debugLine="If (v.ToUpperCase = \"NO\") Or (v = \"0\") Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_v.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("NO"))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_v,RemoteObject.createImmutable("0")))))) { 
 BA.debugLineNum = 1016;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) return utils.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 1018;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) return utils.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 1020;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _str2list(RemoteObject _ba,RemoteObject _inlist,RemoteObject _divider) throws Exception{
try {
		Debug.PushSubsStack("Str2List (utils) ","utils",3,_ba,utils.mostCurrent,2205);
if (RapidSub.canDelegate("str2list")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","str2list", _ba, _inlist, _divider);}
RemoteObject _sret = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("inList", _inlist);
Debug.locals.put("divider", _divider);
 BA.debugLineNum = 2205;BA.debugLine="Sub Str2List(inList As String, divider As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2206;BA.debugLine="If NNE(inList) Then";
Debug.ShouldStop(536870912);
if (_nne(_ba,_inlist).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2207;BA.debugLine="Dim sRet As List = Regex.Split($\"\\${divider}\"$,";
Debug.ShouldStop(1073741824);
_sret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_sret = utils.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(utils.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)((RemoteObject.concat(RemoteObject.createImmutable("\\"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_divider))),RemoteObject.createImmutable("")))),(Object)(_inlist))));Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 }else {
 BA.debugLineNum = 2209;BA.debugLine="Dim sRet As List : sRet.Initialize";
Debug.ShouldStop(1);
_sret = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2209;BA.debugLine="Dim sRet As List : sRet.Initialize";
Debug.ShouldStop(1);
_sret.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 2211;BA.debugLine="Return sRet";
Debug.ShouldStop(4);
if (true) return _sret;
 BA.debugLineNum = 2212;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strcnllist2sqlarray(RemoteObject _ba,RemoteObject _inlist,RemoteObject _isname) throws Exception{
try {
		Debug.PushSubsStack("StrCNLList2SQLArray (utils) ","utils",3,_ba,utils.mostCurrent,2165);
if (RapidSub.canDelegate("strcnllist2sqlarray")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","strcnllist2sqlarray", _ba, _inlist, _isname);}
RemoteObject _sret = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _r = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
RemoteObject _value = RemoteObject.createImmutable("");
;
Debug.locals.put("inList", _inlist);
Debug.locals.put("isName", _isname);
 BA.debugLineNum = 2165;BA.debugLine="Sub StrCNLList2SQLArray(inList As List, isName As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 2166;BA.debugLine="Dim sRet As String = \"\"";
Debug.ShouldStop(2097152);
_sret = BA.ObjectToString("");Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2167;BA.debugLine="For i=0 To inList.Size-1";
Debug.ShouldStop(4194304);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_inlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2168;BA.debugLine="Dim r As CodeNameList = inList.Get(i)";
Debug.ShouldStop(8388608);
_r = (_inlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 2169;BA.debugLine="Dim value As String = r.TagCode";
Debug.ShouldStop(16777216);
_value = _r.getField(true,"TagCode" /*RemoteObject*/ );Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 2170;BA.debugLine="If isName=True Then value = r.Name";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_isname,utils.mostCurrent.__c.getField(true,"True"))) { 
_value = _r.getField(true,"Name" /*RemoteObject*/ );Debug.locals.put("value", _value);};
 BA.debugLineNum = 2171;BA.debugLine="If (sRet <> \"\") Then sRet = $\"${sRet},\"$";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("!",_sret,RemoteObject.createImmutable("")))) { 
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(",")));Debug.locals.put("sRet", _sret);};
 BA.debugLineNum = 2172;BA.debugLine="sRet = $\"${sRet}'${value}'\"$";
Debug.ShouldStop(134217728);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable("'"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_value))),RemoteObject.createImmutable("'")));Debug.locals.put("sRet", _sret);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2175;BA.debugLine="sRet = $\"(${sRet})\"$";
Debug.ShouldStop(1073741824);
_sret = (RemoteObject.concat(RemoteObject.createImmutable("("),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(")")));Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2176;BA.debugLine="Return sRet";
Debug.ShouldStop(-2147483648);
if (true) return _sret;
 BA.debugLineNum = 2177;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _string2bool(RemoteObject _ba,RemoteObject _instr) throws Exception{
try {
		Debug.PushSubsStack("String2Bool (utils) ","utils",3,_ba,utils.mostCurrent,1940);
if (RapidSub.canDelegate("string2bool")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","string2bool", _ba, _instr);}
RemoteObject _ret = RemoteObject.createImmutable(false);
;
Debug.locals.put("inStr", _instr);
 BA.debugLineNum = 1940;BA.debugLine="Sub String2Bool(inStr As String) As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1941;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(1048576);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1942;BA.debugLine="If inStr = \"True\" Then ret = True";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_instr,BA.ObjectToString("True"))) { 
_ret = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);};
 BA.debugLineNum = 1943;BA.debugLine="Return ret";
Debug.ShouldStop(4194304);
if (true) return _ret;
 BA.debugLineNum = 1944;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _striptime(RemoteObject _ba,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("StripTime (utils) ","utils",3,_ba,utils.mostCurrent,2969);
if (RapidSub.canDelegate("striptime")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","striptime", _ba, _ticks);}
;
Debug.locals.put("Ticks", _ticks);
 BA.debugLineNum = 2969;BA.debugLine="Sub StripTime(Ticks As Long) As Long";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 2970;BA.debugLine="Return(DateTime.DateParse(DateTime.Date(Ticks)))";
Debug.ShouldStop(33554432);
if (true) return (utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_ticks)))));
 BA.debugLineNum = 2971;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _strlist2sqlarray(RemoteObject _ba,RemoteObject _inlist) throws Exception{
try {
		Debug.PushSubsStack("StrList2SQLArray (utils) ","utils",3,_ba,utils.mostCurrent,2179);
if (RapidSub.canDelegate("strlist2sqlarray")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","strlist2sqlarray", _ba, _inlist);}
RemoteObject _sret = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("inList", _inlist);
 BA.debugLineNum = 2179;BA.debugLine="Sub StrList2SQLArray(inList As List) As String";
Debug.ShouldStop(4);
 BA.debugLineNum = 2180;BA.debugLine="Dim sRet As String = \"\"";
Debug.ShouldStop(8);
_sret = BA.ObjectToString("");Debug.locals.put("sRet", _sret);Debug.locals.put("sRet", _sret);
 BA.debugLineNum = 2181;BA.debugLine="For i=0 To inList.Size-1";
Debug.ShouldStop(16);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_inlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 2182;BA.debugLine="If (sRet <> \"\") Then sRet = $\"${sRet},\"$";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("!",_sret,RemoteObject.createImmutable("")))) { 
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(",")));Debug.locals.put("sRet", _sret);};
 BA.debugLineNum = 2183;BA.debugLine="sRet = $\"${sRet}'${inList.Get(i)}'\"$";
Debug.ShouldStop(64);
_sret = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable("'"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_inlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable("'")));Debug.locals.put("sRet", _sret);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2186;BA.debugLine="If (NNE(sRet)) Then";
Debug.ShouldStop(512);
if ((_nne(_ba,_sret)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2187;BA.debugLine="sRet = $\"(${sRet})\"$";
Debug.ShouldStop(1024);
_sret = (RemoteObject.concat(RemoteObject.createImmutable("("),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sret))),RemoteObject.createImmutable(")")));Debug.locals.put("sRet", _sret);
 }else {
 BA.debugLineNum = 2189;BA.debugLine="sRet = $\"('')\"$";
Debug.ShouldStop(4096);
_sret = (RemoteObject.createImmutable("('')"));Debug.locals.put("sRet", _sret);
 };
 BA.debugLineNum = 2191;BA.debugLine="Return sRet";
Debug.ShouldStop(16384);
if (true) return _sret;
 BA.debugLineNum = 2192;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _test4true(RemoteObject _ba,RemoteObject _tv,RemoteObject _formula,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("Test4True (utils) ","utils",3,_ba,utils.mostCurrent,237);
if (RapidSub.canDelegate("test4true")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","test4true", _ba, _tv, _formula, _this);}
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _blocks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _vbool = RemoteObject.createImmutable(false);
;
Debug.locals.put("tv", _tv);
Debug.locals.put("Formula", _formula);
Debug.locals.put("this", _this);
 BA.debugLineNum = 237;BA.debugLine="Sub Test4True(tv As String, Formula As String, thi";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(8192);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 239;BA.debugLine="Formula = Formula.ToLowerCase.Replace(\"[tv]\", tv)";
Debug.ShouldStop(16384);
_formula = _formula.runMethod(true,"toLowerCase").runMethod(true,"replace",(Object)(BA.ObjectToString("[tv]")),(Object)(_tv)).runMethod(true,"replace",(Object)(BA.ObjectToString("tv")),(Object)(_tv));Debug.locals.put("Formula", _formula);
 BA.debugLineNum = 240;BA.debugLine="Dim Blocks As List = FormulaInBlocks(Formula)";
Debug.ShouldStop(32768);
_blocks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_blocks = _formulainblocks(_ba,_formula);Debug.locals.put("Blocks", _blocks);Debug.locals.put("Blocks", _blocks);
 BA.debugLineNum = 241;BA.debugLine="If (Blocks.Size >= 1) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("g",_blocks.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 242;BA.debugLine="ret = True";
Debug.ShouldStop(131072);
_ret = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 243;BA.debugLine="For n = 0 To Blocks.Size-1";
Debug.ShouldStop(262144);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_blocks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step6 > 0 && _n <= limit6) || (step6 < 0 && _n >= limit6) ;_n = ((int)(0 + _n + step6))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 244;BA.debugLine="Dim str As String = Blocks.Get(n)";
Debug.ShouldStop(524288);
_str = BA.ObjectToString(_blocks.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 245;BA.debugLine="Dim vbool As Boolean = CompareValuesCondition(s";
Debug.ShouldStop(1048576);
_vbool = _comparevaluescondition(_ba,_str,_this);Debug.locals.put("vbool", _vbool);Debug.locals.put("vbool", _vbool);
 BA.debugLineNum = 246;BA.debugLine="ret = ret And vbool";
Debug.ShouldStop(2097152);
_ret = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_ret) && RemoteObject.solveBoolean(".",_vbool));Debug.locals.put("ret", _ret);
 }
}Debug.locals.put("n", _n);
;
 };
 BA.debugLineNum = 250;BA.debugLine="Return ret";
Debug.ShouldStop(33554432);
if (true) return _ret;
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _test4truelist(RemoteObject _ba,RemoteObject _tv,RemoteObject _cv,RemoteObject _formula,RemoteObject _this) throws Exception{
try {
		Debug.PushSubsStack("Test4TrueList (utils) ","utils",3,_ba,utils.mostCurrent,225);
if (RapidSub.canDelegate("test4truelist")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","test4truelist", _ba, _tv, _cv, _formula, _this);}
int _n = 0;
;
Debug.locals.put("tv", _tv);
Debug.locals.put("cv", _cv);
Debug.locals.put("Formula", _formula);
Debug.locals.put("this", _this);
 BA.debugLineNum = 225;BA.debugLine="Sub Test4TrueList(tv As String, cv As List, Formul";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="For n=0 To cv.Size";
Debug.ShouldStop(2);
{
final int step1 = 1;
final int limit1 = _cv.runMethod(true,"getSize").<Integer>get().intValue();
_n = 0 ;
for (;(step1 > 0 && _n <= limit1) || (step1 < 0 && _n >= limit1) ;_n = ((int)(0 + _n + step1))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 227;BA.debugLine="Formula = Formula.Replace($\"[cv${n}]\"$, cv.Get(n";
Debug.ShouldStop(4);
_formula = _formula.runMethod(true,"replace",(Object)((RemoteObject.concat(RemoteObject.createImmutable("[cv"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("]")))),(Object)(BA.ObjectToString(_cv.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n)))))).runMethod(true,"replace",(Object)((RemoteObject.concat(RemoteObject.createImmutable("cv"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("")))),(Object)(BA.ObjectToString(_cv.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))))));Debug.locals.put("Formula", _formula);
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 229;BA.debugLine="Return Test4True(tv, Formula,this)";
Debug.ShouldStop(16);
if (true) return _test4true(_ba,_tv,_formula,_this);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _test4trueonlyvalues(RemoteObject _ba,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("Test4TrueOnlyValues (utils) ","utils",3,_ba,utils.mostCurrent,582);
if (RapidSub.canDelegate("test4trueonlyvalues")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","test4trueonlyvalues", _ba, _formula);}
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _blocks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _str = RemoteObject.createImmutable("");
RemoteObject _vbool = RemoteObject.createImmutable(false);
;
Debug.locals.put("Formula", _formula);
 BA.debugLineNum = 582;BA.debugLine="Sub Test4TrueOnlyValues(Formula As String) As Bool";
Debug.ShouldStop(32);
 BA.debugLineNum = 583;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(64);
_ret = utils.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 584;BA.debugLine="Dim Blocks As List = FormulaInBlocks(Formula)";
Debug.ShouldStop(128);
_blocks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_blocks = _formulainblocks(_ba,_formula);Debug.locals.put("Blocks", _blocks);Debug.locals.put("Blocks", _blocks);
 BA.debugLineNum = 585;BA.debugLine="If (Blocks.Size >= 1) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("g",_blocks.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 586;BA.debugLine="ret = True";
Debug.ShouldStop(512);
_ret = utils.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 587;BA.debugLine="For n = 0 To Blocks.Size-1";
Debug.ShouldStop(1024);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_blocks.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step5 > 0 && _n <= limit5) || (step5 < 0 && _n >= limit5) ;_n = ((int)(0 + _n + step5))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 588;BA.debugLine="Dim str As String = Blocks.Get(n)";
Debug.ShouldStop(2048);
_str = BA.ObjectToString(_blocks.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("str", _str);Debug.locals.put("str", _str);
 BA.debugLineNum = 589;BA.debugLine="Dim vbool As Boolean = CompareOnlyValuesConditi";
Debug.ShouldStop(4096);
_vbool = _compareonlyvaluescondition(_ba,_str);Debug.locals.put("vbool", _vbool);Debug.locals.put("vbool", _vbool);
 BA.debugLineNum = 590;BA.debugLine="ret = ret And vbool";
Debug.ShouldStop(8192);
_ret = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_ret) && RemoteObject.solveBoolean(".",_vbool));Debug.locals.put("ret", _ret);
 }
}Debug.locals.put("n", _n);
;
 };
 BA.debugLineNum = 594;BA.debugLine="Return ret";
Debug.ShouldStop(131072);
if (true) return _ret;
 BA.debugLineNum = 595;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _testnumber(RemoteObject _ba,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("TestNumber (utils) ","utils",3,_ba,utils.mostCurrent,2341);
if (RapidSub.canDelegate("testnumber")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","testnumber", _ba, _s);}
;
Debug.locals.put("s", _s);
 BA.debugLineNum = 2341;BA.debugLine="Sub TestNumber(s As String) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 2342;BA.debugLine="Return IsNumber(s) And Regex.IsMatch(\"[\\d\\.]+\", s";
Debug.ShouldStop(32);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",utils.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(_s))) && RemoteObject.solveBoolean(".",utils.mostCurrent.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(BA.ObjectToString("[\\d\\.]+")),(Object)(_s))));
 BA.debugLineNum = 2343;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textjson2map(RemoteObject _ba,RemoteObject _resultstr) throws Exception{
try {
		Debug.PushSubsStack("TextJSON2MAP (utils) ","utils",3,_ba,utils.mostCurrent,103);
if (RapidSub.canDelegate("textjson2map")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","textjson2map", _ba, _resultstr);}
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 103;BA.debugLine="Sub TextJSON2MAP(ResultStr As String) As Map";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(128);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 105;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") The";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv6",(Object)(_resultstr),(Object)(BA.numberCast(long.class, 1))),RemoteObject.createImmutable("[")))) { 
 BA.debugLineNum = 106;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFunc";
Debug.ShouldStop(512);
_resultstr = utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvvvvv4",(Object)(utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvvv5",(Object)(_resultstr),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {utils.mostCurrent._starter._strfunc /*RemoteObject*/ .runMethod(true,"_vvv7",(Object)(_resultstr)),RemoteObject.createImmutable(1)}, "-",1, 2))))));Debug.locals.put("ResultStr", _resultstr);
 };
 BA.debugLineNum = 108;BA.debugLine="JSON1.Initialize(ResultStr)";
Debug.ShouldStop(2048);
_json1.runVoidMethod ("Initialize",(Object)(_resultstr));
 BA.debugLineNum = 109;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(4096);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 110;BA.debugLine="Return MapJSON";
Debug.ShouldStop(8192);
if (true) return _mapjson;
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _udid(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("udid (utils) ","utils",3,_ba,utils.mostCurrent,1481);
if (RapidSub.canDelegate("udid")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","udid", _ba);}
RemoteObject _sr = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper");
RemoteObject _data = null;
RemoteObject _bc = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
RemoteObject _hex = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _stp = RemoteObject.createImmutable(0);
RemoteObject _ret = RemoteObject.createImmutable("");
;
 BA.debugLineNum = 1481;BA.debugLine="Sub udid As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 1482;BA.debugLine="Dim sr As SecureRandom";
Debug.ShouldStop(512);
_sr = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.CipherWrapper.SecureRandomWrapper");Debug.locals.put("sr", _sr);
 BA.debugLineNum = 1483;BA.debugLine="Dim data(16) As Byte";
Debug.ShouldStop(1024);
_data = RemoteObject.createNewArray ("byte", new int[] {16}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 1484;BA.debugLine="sr.GetRandomBytes(data)";
Debug.ShouldStop(2048);
_sr.runVoidMethod ("GetRandomBytes",(Object)(_data));
 BA.debugLineNum = 1485;BA.debugLine="Dim bc As ByteConverter";
Debug.ShouldStop(4096);
_bc = RemoteObject.createNew ("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 1486;BA.debugLine="Dim hex As String = bc.HexFromBytes(data)";
Debug.ShouldStop(8192);
_hex = _bc.runMethod(true,"HexFromBytes",(Object)(_data));Debug.locals.put("hex", _hex);Debug.locals.put("hex", _hex);
 BA.debugLineNum = 1487;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16384);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1488;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1489;BA.debugLine="Dim i As Int";
Debug.ShouldStop(65536);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1490;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
Debug.ShouldStop(131072);
{
final RemoteObject group9 = RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable((8)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((12))});
final int groupLen9 = group9.getField(true,"length").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_stp = BA.numberCast(int.class, group9.getArrayElement(false,RemoteObject.createImmutable(index9)));Debug.locals.put("stp", _stp);
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 1491;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 0))) { 
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("-")));};
 BA.debugLineNum = 1492;BA.debugLine="sb.Append(hex.SubString2(i, i + stp))";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(_hex.runMethod(true,"substring",(Object)(_i),(Object)(RemoteObject.solve(new RemoteObject[] {_i,_stp}, "+",1, 1)))));
 BA.debugLineNum = 1493;BA.debugLine="i = i + stp";
Debug.ShouldStop(1048576);
_i = RemoteObject.solve(new RemoteObject[] {_i,_stp}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("stp", _stp);
;
 BA.debugLineNum = 1495;BA.debugLine="Dim Ret As String = \"\"";
Debug.ShouldStop(4194304);
_ret = BA.ObjectToString("");Debug.locals.put("Ret", _ret);Debug.locals.put("Ret", _ret);
 BA.debugLineNum = 1496;BA.debugLine="If (sb.Length >= 1) Then";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("g",_sb.runMethod(true,"getLength"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1497;BA.debugLine="Ret = sb.ToString";
Debug.ShouldStop(16777216);
_ret = _sb.runMethod(true,"ToString");Debug.locals.put("Ret", _ret);
 }else {
 BA.debugLineNum = 1499;BA.debugLine="Ret = GenerateTagcode(\"PRE_\" )";
Debug.ShouldStop(67108864);
_ret = _generatetagcode(_ba,RemoteObject.createImmutable("PRE_"));Debug.locals.put("Ret", _ret);
 };
 BA.debugLineNum = 1501;BA.debugLine="Return Ret";
Debug.ShouldStop(268435456);
if (true) return _ret;
 BA.debugLineNum = 1502;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateliteupdatedatetime(RemoteObject _ba,RemoteObject _datet) throws Exception{
try {
		Debug.PushSubsStack("UpdateLiteUpdateDateTime (utils) ","utils",3,_ba,utils.mostCurrent,3658);
if (RapidSub.canDelegate("updateliteupdatedatetime")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","updateliteupdatedatetime", _ba, _datet);}
;
Debug.locals.put("dateT", _datet);
 BA.debugLineNum = 3658;BA.debugLine="Sub UpdateLiteUpdateDateTime(dateT As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 3659;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_LI";
Debug.ShouldStop(1024);
utils.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_LITE_LAST_UPDATE")),(Object)(_datet));
 BA.debugLineNum = 3660;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(2048);
utils.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 BA.debugLineNum = 3661;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Starter";
Debug.ShouldStop(4096);
utils.mostCurrent._sharecode._app_last_lite_update_datetime /*RemoteObject*/  = utils.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("APP_LITE_LAST_UPDATE")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3662;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecord2withlog(RemoteObject _ba,RemoteObject _sql,RemoteObject _tablename,RemoteObject _fields,RemoteObject _wherefieldequals,RemoteObject _request,RemoteObject _local) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecord2WithLog (utils) ","utils",3,_ba,utils.mostCurrent,1307);
if (RapidSub.canDelegate("updaterecord2withlog")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","updaterecord2withlog", _ba, _sql, _tablename, _fields, _wherefieldequals, _request, _local);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _ss = RemoteObject.createImmutable("");
;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("Fields", _fields);
Debug.locals.put("WhereFieldEquals", _wherefieldequals);
Debug.locals.put("request", _request);
Debug.locals.put("Local", _local);
 BA.debugLineNum = 1307;BA.debugLine="Public Sub UpdateRecord2WithLog(SQL As SQL, TableN";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1308;BA.debugLine="If WhereFieldEquals.Size = 0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_wherefieldequals.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1309;BA.debugLine="Log(\"WhereFieldEquals map empty!\")";
Debug.ShouldStop(268435456);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66029314",RemoteObject.createImmutable("WhereFieldEquals map empty!"),0);
 BA.debugLineNum = 1310;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1312;BA.debugLine="If Fields.Size = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_fields.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1313;BA.debugLine="Log(\"Fields empty\")";
Debug.ShouldStop(1);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66029318",RemoteObject.createImmutable("Fields empty"),0);
 BA.debugLineNum = 1314;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1316;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1317;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1318;BA.debugLine="sb.Append(\"UPDATE \").Append(TableName).Append(\" S";
Debug.ShouldStop(32);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("UPDATE "))).runMethod(false,"Append",(Object)(_tablename)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" SET ")));
 BA.debugLineNum = 1319;BA.debugLine="Dim args As List";
Debug.ShouldStop(64);
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("args", _args);
 BA.debugLineNum = 1320;BA.debugLine="args.Initialize";
Debug.ShouldStop(128);
_args.runVoidMethod ("Initialize");
 BA.debugLineNum = 1321;BA.debugLine="For Each col As String In Fields.Keys";
Debug.ShouldStop(256);
{
final RemoteObject group14 = _fields.runMethod(false,"Keys");
final int groupLen14 = group14.runMethod(true,"getSize").<Integer>get()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_col = BA.ObjectToString(group14.runMethod(false,"Get",index14));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 1322;BA.debugLine="sb.Append(col).Append($\"='${Fields.Get(col)}',\"$";
Debug.ShouldStop(512);
_sb.runMethod(false,"Append",(Object)(_col)).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_fields.runMethod(false,"Get",(Object)((_col))))),RemoteObject.createImmutable("',")))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1326;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 1327;BA.debugLine="sb.Append(\" WHERE \")";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" WHERE ")));
 BA.debugLineNum = 1328;BA.debugLine="For Each col As String In WhereFieldEquals.Keys";
Debug.ShouldStop(32768);
{
final RemoteObject group19 = _wherefieldequals.runMethod(false,"Keys");
final int groupLen19 = group19.runMethod(true,"getSize").<Integer>get()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_col = BA.ObjectToString(group19.runMethod(false,"Get",index19));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 1329;BA.debugLine="sb.Append(col).Append($\"='${Fields.Get(col)}' AN";
Debug.ShouldStop(65536);
_sb.runMethod(false,"Append",(Object)(_col)).runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("='"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_fields.runMethod(false,"Get",(Object)((_col))))),RemoteObject.createImmutable("' AND ")))));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 1333;BA.debugLine="sb.Remove(sb.Length - \" AND \".Length, sb.Length)";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(" AND ").runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 1334;BA.debugLine="Log(\"UpdateRecord: \" & sb.ToString)";
Debug.ShouldStop(2097152);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66029339",RemoteObject.concat(RemoteObject.createImmutable("UpdateRecord: "),_sb.runMethod(true,"ToString")),0);
 BA.debugLineNum = 1336;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 1337;BA.debugLine="SQL.ExecNonQuery(sb.ToString)";
Debug.ShouldStop(16777216);
_sql.runVoidMethod ("ExecNonQuery",(Object)(_sb.runMethod(true,"ToString")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e27) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e27.toString()); BA.debugLineNum = 1339;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66029344",BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)),0);
 BA.debugLineNum = 1340;BA.debugLine="WriteErrors2Log(LastException)";
Debug.ShouldStop(134217728);
_writeerrors2log(_ba,BA.ObjectToString(utils.mostCurrent.__c.runMethod(false,"LastException",_ba)));
 BA.debugLineNum = 1341;BA.debugLine="logError(Local, ShareCode.SESS_OPER_User, $\"${sb";
Debug.ShouldStop(268435456);
_logerror(_ba,_local,utils.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sb.runMethod(true,"ToString")))),RemoteObject.createImmutable(" :: "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.runMethod(false,"LastException",_ba).getObject()))),RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 1345;BA.debugLine="If NNE(request) Then";
Debug.ShouldStop(1);
if (_nne(_ba,_request).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1346;BA.debugLine="Dim ss As String = sb.ToString";
Debug.ShouldStop(2);
_ss = _sb.runMethod(true,"ToString");Debug.locals.put("ss", _ss);Debug.locals.put("ss", _ss);
 BA.debugLineNum = 1347;BA.debugLine="If Not(ss.EndsWith(\";\")) Then";
Debug.ShouldStop(4);
if (utils.mostCurrent.__c.runMethod(true,"Not",(Object)(_ss.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1348;BA.debugLine="ss = $\"${ss};\"$";
Debug.ShouldStop(8);
_ss = (RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ss))),RemoteObject.createImmutable(";")));Debug.locals.put("ss", _ss);
 };
 BA.debugLineNum = 1350;BA.debugLine="SaveScriptToLog(request, ss)";
Debug.ShouldStop(32);
_savescripttolog(_ba,_request,_ss);
 };
 BA.debugLineNum = 1352;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _viewfile(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ViewFile (utils) ","utils",3,_ba,utils.mostCurrent,1589);
if (RapidSub.canDelegate("viewfile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","viewfile", _ba, _filename);}
RemoteObject _intentfile = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _intentfiletype = RemoteObject.createImmutable("");
;
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 1589;BA.debugLine="Sub ViewFile(filename As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1590;BA.debugLine="Dim IntentFile As Intent";
Debug.ShouldStop(2097152);
_intentfile = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("IntentFile", _intentfile);
 BA.debugLineNum = 1591;BA.debugLine="IntentFile.Initialize(IntentFile.ACTION_VIEW, Sta";
Debug.ShouldStop(4194304);
_intentfile.runVoidMethod ("Initialize",(Object)(_intentfile.getField(true,"ACTION_VIEW")),(Object)(BA.ObjectToString(utils.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)))));
 BA.debugLineNum = 1592;BA.debugLine="Dim IntentFileType As String = GetIntentFileType(";
Debug.ShouldStop(8388608);
_intentfiletype = _getintentfiletype(_ba,_filename);Debug.locals.put("IntentFileType", _intentfiletype);Debug.locals.put("IntentFileType", _intentfiletype);
 BA.debugLineNum = 1593;BA.debugLine="Log(IntentFileType)";
Debug.ShouldStop(16777216);
utils.mostCurrent.__c.runVoidMethod ("LogImpl","66881284",_intentfiletype,0);
 BA.debugLineNum = 1594;BA.debugLine="IntentFile.SetType(IntentFileType)";
Debug.ShouldStop(33554432);
_intentfile.runVoidMethod ("SetType",(Object)(_intentfiletype));
 BA.debugLineNum = 1595;BA.debugLine="IntentFile.Flags = 1 'FLAG_GRANT_READ_URI_PERMISS";
Debug.ShouldStop(67108864);
_intentfile.runMethod(true,"setFlags",BA.numberCast(int.class, 1));
 BA.debugLineNum = 1596;BA.debugLine="Try";
Debug.ShouldStop(134217728);
try { BA.debugLineNum = 1597;BA.debugLine="StartActivity(IntentFile)";
Debug.ShouldStop(268435456);
utils.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((_intentfile.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba), e10.toString()); BA.debugLineNum = 1599;BA.debugLine="ToastMessageShow(\"Você nao tem aplicação para ab";
Debug.ShouldStop(1073741824);
utils.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Você nao tem aplicação para abrir este tipo de arquivo")),(Object)(utils.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 1601;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _viewpdffile(RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("ViewPDFFile (utils) ","utils",3,_ba,utils.mostCurrent,1569);
if (RapidSub.canDelegate("viewpdffile")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","viewpdffile", _ba, _filename);}
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _applicationtype = RemoteObject.createImmutable("");
RemoteObject _pdfappslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
;
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 1569;BA.debugLine="Sub ViewPDFFile(filename As String)";
Debug.ShouldStop(1);
 BA.debugLineNum = 1570;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(2);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 1573;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, Starter.P";
Debug.ShouldStop(16);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(BA.ObjectToString(utils.mostCurrent._starter._provider /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)))));
 BA.debugLineNum = 1574;BA.debugLine="Dim ApplicationType As String = GetDocType(filena";
Debug.ShouldStop(32);
_applicationtype = _getdoctype(_ba,_filename);Debug.locals.put("ApplicationType", _applicationtype);Debug.locals.put("ApplicationType", _applicationtype);
 BA.debugLineNum = 1575;BA.debugLine="Intent1.SetType(ApplicationType)";
Debug.ShouldStop(64);
_intent1.runVoidMethod ("SetType",(Object)(_applicationtype));
 BA.debugLineNum = 1576;BA.debugLine="Intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION";
Debug.ShouldStop(128);
_intent1.runMethod(true,"setFlags",BA.numberCast(int.class, 1));
 BA.debugLineNum = 1577;BA.debugLine="Dim pdfAppsList As List";
Debug.ShouldStop(256);
_pdfappslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1578;BA.debugLine="pdfAppsList = QueryIntent(Intent1)";
Debug.ShouldStop(512);
_pdfappslist = _queryintent(_ba,_intent1);Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1579;BA.debugLine="If pdfAppsList.size>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_pdfappslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1580;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(2048);
utils.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((_intent1.getObject())));
 };
 BA.debugLineNum = 1582;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeerrors2log(RemoteObject _ba,RemoteObject _error2log) throws Exception{
try {
		Debug.PushSubsStack("WriteErrors2Log (utils) ","utils",3,_ba,utils.mostCurrent,3939);
if (RapidSub.canDelegate("writeerrors2log")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","writeerrors2log", _ba, _error2log);}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
RemoteObject _dtf = RemoteObject.createImmutable("");
RemoteObject _date2name = RemoteObject.createImmutable("");
;
Debug.locals.put("Error2log", _error2log);
 BA.debugLineNum = 3939;BA.debugLine="Sub WriteErrors2Log(Error2log As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 3940;BA.debugLine="If NNE(Error2log) Then";
Debug.ShouldStop(8);
if (_nne(_ba,_error2log).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3941;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(16);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 3943;BA.debugLine="Dim dtf As String = DateTime.DateFormat";
Debug.ShouldStop(64);
_dtf = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("dtf", _dtf);Debug.locals.put("dtf", _dtf);
 BA.debugLineNum = 3944;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(128);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 3945;BA.debugLine="Dim date2name As String = DateTime.Date(DateTime";
Debug.ShouldStop(256);
_date2name = utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("date2name", _date2name);Debug.locals.put("date2name", _date2name);
 BA.debugLineNum = 3946;BA.debugLine="DateTime.DateFormat = dtf";
Debug.ShouldStop(512);
utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dtf);
 BA.debugLineNum = 3948;BA.debugLine="Writer.Initialize(File.OpenOutput(Starter.Shared";
Debug.ShouldStop(2048);
_writer.runVoidMethod ("Initialize",(Object)((utils.mostCurrent.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(utils.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_date2name))),RemoteObject.createImmutable("-ErrorsLog.txt")))),(Object)(utils.mostCurrent.__c.getField(true,"True"))).getObject())));
 BA.debugLineNum = 3949;BA.debugLine="Writer.WriteLine($\"[${DateTime.Date(DateTime.Now";
Debug.ShouldStop(4096);
_writer.runVoidMethod ("WriteLine",(Object)((RemoteObject.concat(RemoteObject.createImmutable("["),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable(" - "),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(utils.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))))),RemoteObject.createImmutable("]"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((utils.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_error2log))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3950;BA.debugLine="Writer.Close";
Debug.ShouldStop(8192);
_writer.runVoidMethod ("Close");
 };
 BA.debugLineNum = 3952;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _zeroleft(RemoteObject _ba,RemoteObject _strtext,RemoteObject _strlength) throws Exception{
try {
		Debug.PushSubsStack("ZeroLeft (utils) ","utils",3,_ba,utils.mostCurrent,119);
if (RapidSub.canDelegate("zeroleft")) { return xevolution.vrcg.devdemov2400.utils.remoteMe.runUserSub(false, "utils","zeroleft", _ba, _strtext, _strlength);}
RemoteObject _difnum = RemoteObject.createImmutable(0);
int _n = 0;
;
Debug.locals.put("StrText", _strtext);
Debug.locals.put("StrLength", _strlength);
 BA.debugLineNum = 119;BA.debugLine="Sub ZeroLeft(StrText As String, StrLength As Int)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Dim difnum As Int = StrLength - StrText.Length";
Debug.ShouldStop(8388608);
_difnum = RemoteObject.solve(new RemoteObject[] {_strlength,_strtext.runMethod(true,"length")}, "-",1, 1);Debug.locals.put("difnum", _difnum);Debug.locals.put("difnum", _difnum);
 BA.debugLineNum = 121;BA.debugLine="If (difnum > 0) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean(">",_difnum,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 122;BA.debugLine="For n=0 To difnum-1";
Debug.ShouldStop(33554432);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {_difnum,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step3 > 0 && _n <= limit3) || (step3 < 0 && _n >= limit3) ;_n = ((int)(0 + _n + step3))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 123;BA.debugLine="StrText = $\"0${StrText}\"$";
Debug.ShouldStop(67108864);
_strtext = (RemoteObject.concat(RemoteObject.createImmutable("0"),utils.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strtext))),RemoteObject.createImmutable("")));Debug.locals.put("StrText", _strtext);
 }
}Debug.locals.put("n", _n);
;
 };
 BA.debugLineNum = 126;BA.debugLine="Return StrText";
Debug.ShouldStop(536870912);
if (true) return _strtext;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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