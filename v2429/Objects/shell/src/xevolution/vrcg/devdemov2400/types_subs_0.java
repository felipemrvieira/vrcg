package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class types_subs_0 {


public static RemoteObject  _clearcladata(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("ClearCLAData (types) ","types",61,_ba,types.mostCurrent,1290);
if (RapidSub.canDelegate("clearcladata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","clearcladata", _ba);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._cladata");
;
 BA.debugLineNum = 1290;BA.debugLine="Sub ClearCLAData() As CLAData";
Debug.ShouldStop(512);
 BA.debugLineNum = 1291;BA.debugLine="Private this As CLAData";
Debug.ShouldStop(1024);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._cladata");Debug.locals.put("this", _this);
 BA.debugLineNum = 1292;BA.debugLine="this.Initialize";
Debug.ShouldStop(2048);
_this.runVoidMethod ("Initialize");
 BA.debugLineNum = 1293;BA.debugLine="this.Request = \"\"";
Debug.ShouldStop(4096);
_this.setField ("Request" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1294;BA.debugLine="this.Action = \"\"";
Debug.ShouldStop(8192);
_this.setField ("Action" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1295;BA.debugLine="this.Task = \"\"";
Debug.ShouldStop(16384);
_this.setField ("Task" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1296;BA.debugLine="this.Item = \"\"";
Debug.ShouldStop(32768);
_this.setField ("Item" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1297;BA.debugLine="this.UniqueKey = \"\"";
Debug.ShouldStop(65536);
_this.setField ("UniqueKey" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1298;BA.debugLine="this.Tagcode = \"\"";
Debug.ShouldStop(131072);
_this.setField ("Tagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1299;BA.debugLine="this.RepeatCounter = 0";
Debug.ShouldStop(262144);
_this.setField ("RepeatCounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1300;BA.debugLine="this.ReadOnly = False";
Debug.ShouldStop(524288);
_this.setField ("ReadOnly" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1301;BA.debugLine="this.Composed = False";
Debug.ShouldStop(1048576);
_this.setField ("Composed" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1302;BA.debugLine="this.StatusMaster = ClearCLAStatus";
Debug.ShouldStop(2097152);
_this.setField ("StatusMaster" /*RemoteObject*/ ,_clearclastatus(_ba));
 BA.debugLineNum = 1303;BA.debugLine="this.StatusChild = ClearCLAStatus";
Debug.ShouldStop(4194304);
_this.setField ("StatusChild" /*RemoteObject*/ ,_clearclastatus(_ba));
 BA.debugLineNum = 1304;BA.debugLine="Return this";
Debug.ShouldStop(8388608);
if (true) return _this;
 BA.debugLineNum = 1305;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearclastatus(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("ClearCLAStatus (types) ","types",61,_ba,types.mostCurrent,1252);
if (RapidSub.canDelegate("clearclastatus")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","clearclastatus", _ba);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._clastatus");
;
 BA.debugLineNum = 1252;BA.debugLine="Sub ClearCLAStatus() As CLAStatus";
Debug.ShouldStop(8);
 BA.debugLineNum = 1253;BA.debugLine="Private this As CLAStatus";
Debug.ShouldStop(16);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._clastatus");Debug.locals.put("this", _this);
 BA.debugLineNum = 1254;BA.debugLine="this.Initialize";
Debug.ShouldStop(32);
_this.runVoidMethod ("Initialize");
 BA.debugLineNum = 1255;BA.debugLine="this.Status = 0";
Debug.ShouldStop(64);
_this.setField ("Status" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1256;BA.debugLine="this.StartDate = \"\"";
Debug.ShouldStop(128);
_this.setField ("StartDate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1257;BA.debugLine="this.Starttime = \"\"";
Debug.ShouldStop(256);
_this.setField ("Starttime" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1258;BA.debugLine="this.Endtime = \"\"";
Debug.ShouldStop(512);
_this.setField ("Endtime" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1259;BA.debugLine="this.Duration = \"\"";
Debug.ShouldStop(1024);
_this.setField ("Duration" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1260;BA.debugLine="this.Points = 0";
Debug.ShouldStop(2048);
_this.setField ("Points" /*RemoteObject*/ ,BA.numberCast(double.class, 0));
 BA.debugLineNum = 1261;BA.debugLine="this.Risk = 0";
Debug.ShouldStop(4096);
_this.setField ("Risk" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1262;BA.debugLine="this.Result = 0";
Debug.ShouldStop(8192);
_this.setField ("Result" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1263;BA.debugLine="this.ResultDesc = \"\"";
Debug.ShouldStop(16384);
_this.setField ("ResultDesc" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1264;BA.debugLine="this.HasImages = False";
Debug.ShouldStop(32768);
_this.setField ("HasImages" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1265;BA.debugLine="this.HasActions = False";
Debug.ShouldStop(65536);
_this.setField ("HasActions" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1266;BA.debugLine="this.HasSignatures = False";
Debug.ShouldStop(131072);
_this.setField ("HasSignatures" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1267;BA.debugLine="this.ReportGenerated = False";
Debug.ShouldStop(262144);
_this.setField ("ReportGenerated" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1268;BA.debugLine="this.CanChange = False";
Debug.ShouldStop(524288);
_this.setField ("CanChange" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1269;BA.debugLine="Return this";
Debug.ShouldStop(1048576);
if (true) return _this;
 BA.debugLineNum = 1270;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearedcarobject(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("ClearedCarObject (types) ","types",61,_ba,types.mostCurrent,711);
if (RapidSub.canDelegate("clearedcarobject")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","clearedcarobject", _ba);}
RemoteObject _obt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._carobject");
;
 BA.debugLineNum = 711;BA.debugLine="Sub ClearedCarObject As CarObject";
Debug.ShouldStop(64);
 BA.debugLineNum = 712;BA.debugLine="Dim obt As CarObject";
Debug.ShouldStop(128);
_obt = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._carobject");Debug.locals.put("obt", _obt);
 BA.debugLineNum = 713;BA.debugLine="obt.Initialize";
Debug.ShouldStop(256);
_obt.runVoidMethod ("Initialize");
 BA.debugLineNum = 714;BA.debugLine="obt.obj = \"\"";
Debug.ShouldStop(512);
_obt.setField ("obj" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 715;BA.debugLine="obt.brand = \"\"";
Debug.ShouldStop(1024);
_obt.setField ("brand" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 716;BA.debugLine="obt.model = \"\"";
Debug.ShouldStop(2048);
_obt.setField ("model" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 717;BA.debugLine="obt.plate = \"\"";
Debug.ShouldStop(4096);
_obt.setField ("plate" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 718;BA.debugLine="obt.km = 0";
Debug.ShouldStop(8192);
_obt.setField ("km" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 719;BA.debugLine="Return obt";
Debug.ShouldStop(16384);
if (true) return _obt;
 BA.debugLineNum = 720;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cleartyperundatefilters(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("ClearTypeRunDateFilters (types) ","types",61,_ba,types.mostCurrent,1315);
if (RapidSub.canDelegate("cleartyperundatefilters")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","cleartyperundatefilters", _ba);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._rundatefilters");
;
 BA.debugLineNum = 1315;BA.debugLine="Sub ClearTypeRunDateFilters() As RunDateFilters";
Debug.ShouldStop(4);
 BA.debugLineNum = 1316;BA.debugLine="Private this As RunDateFilters";
Debug.ShouldStop(8);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._rundatefilters");Debug.locals.put("this", _this);
 BA.debugLineNum = 1317;BA.debugLine="this.Initialize";
Debug.ShouldStop(16);
_this.runVoidMethod ("Initialize");
 BA.debugLineNum = 1318;BA.debugLine="this.DateStart = \"\"";
Debug.ShouldStop(32);
_this.setField ("DateStart" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1319;BA.debugLine="this.DateEnd = \"\"";
Debug.ShouldStop(64);
_this.setField ("DateEnd" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1320;BA.debugLine="Return this";
Debug.ShouldStop(128);
if (true) return _this;
 BA.debugLineNum = 1321;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findmarkerinfoindex(RemoteObject _ba,RemoteObject _ml,RemoteObject _slat,RemoteObject _slong) throws Exception{
try {
		Debug.PushSubsStack("FindMarkerInfoIndex (types) ","types",61,_ba,types.mostCurrent,396);
if (RapidSub.canDelegate("findmarkerinfoindex")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","findmarkerinfoindex", _ba, _ml, _slat, _slong);}
RemoteObject _ret = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _mi = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._markerinfo");
;
Debug.locals.put("ml", _ml);
Debug.locals.put("sLat", _slat);
Debug.locals.put("sLong", _slong);
 BA.debugLineNum = 396;BA.debugLine="Sub FindMarkerInfoIndex(ml As List, sLat As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 397;BA.debugLine="Dim ret As Int = -1";
Debug.ShouldStop(4096);
_ret = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 398;BA.debugLine="For n = 0 To ml.Size-1";
Debug.ShouldStop(8192);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_ml.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step2 > 0 && _n <= limit2) || (step2 < 0 && _n >= limit2) ;_n = ((int)(0 + _n + step2))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 399;BA.debugLine="Dim mi As MarkerInfo = ml.Get(n)";
Debug.ShouldStop(16384);
_mi = (_ml.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("mi", _mi);Debug.locals.put("mi", _mi);
 BA.debugLineNum = 400;BA.debugLine="If (mi.Latitude=sLat) And (mi.Longitude=sLong) T";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_mi.getField(true,"Latitude" /*RemoteObject*/ ),_slat)))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_mi.getField(true,"Longitude" /*RemoteObject*/ ),_slong))))) { 
 BA.debugLineNum = 401;BA.debugLine="ret = n";
Debug.ShouldStop(65536);
_ret = BA.numberCast(int.class, _n);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 402;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 405;BA.debugLine="Return ret";
Debug.ShouldStop(1048576);
if (true) return _ret;
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgeodata(RemoteObject _ba,RemoteObject _g,RemoteObject _lat,RemoteObject _lon,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("getGeoData (types) ","types",61,_ba,types.mostCurrent,1224);
if (RapidSub.canDelegate("getgeodata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","getgeodata", _ba, _g, _lat, _lon, _date);}
;
Debug.locals.put("g", _g);
Debug.locals.put("lat", _lat);
Debug.locals.put("lon", _lon);
Debug.locals.put("date", _date);
 BA.debugLineNum = 1224;BA.debugLine="Sub getGeoData(g  As GeoData, lat As String, lon A";
Debug.ShouldStop(128);
 BA.debugLineNum = 1225;BA.debugLine="lat = g.lat";
Debug.ShouldStop(256);
_lat = _g.getField(true,"lat" /*RemoteObject*/ );Debug.locals.put("lat", _lat);
 BA.debugLineNum = 1226;BA.debugLine="lon = g.lon";
Debug.ShouldStop(512);
_lon = _g.getField(true,"lon" /*RemoteObject*/ );Debug.locals.put("lon", _lon);
 BA.debugLineNum = 1227;BA.debugLine="date = g.date";
Debug.ShouldStop(1024);
_date = _g.getField(true,"date" /*RemoteObject*/ );Debug.locals.put("date", _date);
 BA.debugLineNum = 1228;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeactivityparams(RemoteObject _ba,RemoteObject _activ,RemoteObject _activobj,RemoteObject _posis,RemoteObject _innerobject,RemoteObject _obs) throws Exception{
try {
		Debug.PushSubsStack("MakeActivityParams (types) ","types",61,_ba,types.mostCurrent,656);
if (RapidSub.canDelegate("makeactivityparams")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeactivityparams", _ba, _activ, _activobj, _posis, _innerobject, _obs);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._activityparams");
;
Debug.locals.put("activ", _activ);
Debug.locals.put("activObj", _activobj);
Debug.locals.put("Posis", _posis);
Debug.locals.put("innerObject", _innerobject);
Debug.locals.put("Obs", _obs);
 BA.debugLineNum = 656;BA.debugLine="Sub MakeActivityParams(activ As Activity, activOb";
Debug.ShouldStop(32768);
 BA.debugLineNum = 657;BA.debugLine="Dim ret As ActivityParams";
Debug.ShouldStop(65536);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._activityparams");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 659;BA.debugLine="ret.Initialize";
Debug.ShouldStop(262144);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 660;BA.debugLine="ret.activ = activ";
Debug.ShouldStop(524288);
_ret.setField ("activ" /*RemoteObject*/ ,_activ);
 BA.debugLineNum = 661;BA.debugLine="ret.activObj = activObj";
Debug.ShouldStop(1048576);
_ret.setField ("activObj" /*RemoteObject*/ ,_activobj);
 BA.debugLineNum = 662;BA.debugLine="ret.Posis = Posis";
Debug.ShouldStop(2097152);
_ret.setField ("Posis" /*RemoteObject*/ ,_posis);
 BA.debugLineNum = 663;BA.debugLine="ret.innerObject = innerObject";
Debug.ShouldStop(4194304);
_ret.setField ("innerObject" /*RemoteObject*/ ,_innerobject);
 BA.debugLineNum = 664;BA.debugLine="ret.Obs = Obs";
Debug.ShouldStop(8388608);
_ret.setField ("Obs" /*RemoteObject*/ ,_obs);
 BA.debugLineNum = 665;BA.debugLine="Return ret";
Debug.ShouldStop(16777216);
if (true) return _ret;
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeaddress(RemoteObject _ba,RemoteObject _addresstype,RemoteObject _addressname,RemoteObject _addressname2,RemoteObject _addresscity,RemoteObject _addresspostalcode,RemoteObject _addresslatitude,RemoteObject _addresslongitude,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("MakeAddress (types) ","types",61,_ba,types.mostCurrent,1071);
if (RapidSub.canDelegate("makeaddress")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeaddress", _ba, _addresstype, _addressname, _addressname2, _addresscity, _addresspostalcode, _addresslatitude, _addresslongitude, _asnew);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._address");
;
Debug.locals.put("AddressType", _addresstype);
Debug.locals.put("AddressName", _addressname);
Debug.locals.put("AddressName2", _addressname2);
Debug.locals.put("AddressCity", _addresscity);
Debug.locals.put("AddressPostalCode", _addresspostalcode);
Debug.locals.put("AddressLatitude", _addresslatitude);
Debug.locals.put("AddressLongitude", _addresslongitude);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1071;BA.debugLine="Sub MakeAddress(AddressType As Int, AddressName As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1072;BA.debugLine="Dim ret As Address";
Debug.ShouldStop(32768);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._address");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1073;BA.debugLine="ret.Initialize";
Debug.ShouldStop(65536);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1074;BA.debugLine="ret.AddressType = AddressType";
Debug.ShouldStop(131072);
_ret.setField ("AddressType" /*RemoteObject*/ ,_addresstype);
 BA.debugLineNum = 1075;BA.debugLine="ret.AddressName = AddressName";
Debug.ShouldStop(262144);
_ret.setField ("AddressName" /*RemoteObject*/ ,_addressname);
 BA.debugLineNum = 1076;BA.debugLine="ret.AddressName2 = AddressName2";
Debug.ShouldStop(524288);
_ret.setField ("AddressName2" /*RemoteObject*/ ,_addressname2);
 BA.debugLineNum = 1077;BA.debugLine="ret.AddressCity = AddressCity";
Debug.ShouldStop(1048576);
_ret.setField ("AddressCity" /*RemoteObject*/ ,_addresscity);
 BA.debugLineNum = 1078;BA.debugLine="ret.AddressPostalCode = AddressPostalCode";
Debug.ShouldStop(2097152);
_ret.setField ("AddressPostalCode" /*RemoteObject*/ ,_addresspostalcode);
 BA.debugLineNum = 1079;BA.debugLine="ret.AddressLatitude = AddressLatitude";
Debug.ShouldStop(4194304);
_ret.setField ("AddressLatitude" /*RemoteObject*/ ,_addresslatitude);
 BA.debugLineNum = 1080;BA.debugLine="ret.AddressLongitude = AddressLongitude";
Debug.ShouldStop(8388608);
_ret.setField ("AddressLongitude" /*RemoteObject*/ ,_addresslongitude);
 BA.debugLineNum = 1081;BA.debugLine="ret.asNew = asNew";
Debug.ShouldStop(16777216);
_ret.setField ("asNew" /*RemoteObject*/ ,_asnew);
 BA.debugLineNum = 1082;BA.debugLine="Return ret";
Debug.ShouldStop(33554432);
if (true) return _ret;
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeauthorization(RemoteObject _ba,RemoteObject _instance,RemoteObject _authorization,RemoteObject _version,RemoteObject _subdomain) throws Exception{
try {
		Debug.PushSubsStack("MakeAuthorization (types) ","types",61,_ba,types.mostCurrent,1005);
if (RapidSub.canDelegate("makeauthorization")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeauthorization", _ba, _instance, _authorization, _version, _subdomain);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._authorization");
;
Debug.locals.put("Instance", _instance);
Debug.locals.put("Authorization", _authorization);
Debug.locals.put("Version", _version);
Debug.locals.put("SubDomain", _subdomain);
 BA.debugLineNum = 1005;BA.debugLine="Sub MakeAuthorization(Instance As String, Authoriz";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1006;BA.debugLine="Dim ret As Authorization";
Debug.ShouldStop(8192);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._authorization");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1011;BA.debugLine="ret.Initialize";
Debug.ShouldStop(262144);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1012;BA.debugLine="ret.Instance = Instance";
Debug.ShouldStop(524288);
_ret.setField ("Instance" /*RemoteObject*/ ,_instance);
 BA.debugLineNum = 1013;BA.debugLine="ret.Authorization = Authorization";
Debug.ShouldStop(1048576);
_ret.setField ("Authorization" /*RemoteObject*/ ,_authorization);
 BA.debugLineNum = 1014;BA.debugLine="ret.Version = Version";
Debug.ShouldStop(2097152);
_ret.setField ("Version" /*RemoteObject*/ ,_version);
 BA.debugLineNum = 1015;BA.debugLine="ret.SubDomain = SubDomain";
Debug.ShouldStop(4194304);
_ret.setField ("SubDomain" /*RemoteObject*/ ,_subdomain);
 BA.debugLineNum = 1016;BA.debugLine="Return ret";
Debug.ShouldStop(8388608);
if (true) return _ret;
 BA.debugLineNum = 1017;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeb4xsrecords(RemoteObject _ba,RemoteObject _component,RemoteObject _idgroup,RemoteObject _iditem,RemoteObject _item_tagcode,RemoteObject _enabled,RemoteObject _answer_tagcode) throws Exception{
try {
		Debug.PushSubsStack("MakeB4XSRecords (types) ","types",61,_ba,types.mostCurrent,307);
if (RapidSub.canDelegate("makeb4xsrecords")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeb4xsrecords", _ba, _component, _idgroup, _iditem, _item_tagcode, _enabled, _answer_tagcode);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._b4xsrecords");
;
Debug.locals.put("component", _component);
Debug.locals.put("idgroup", _idgroup);
Debug.locals.put("iditem", _iditem);
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("Enabled", _enabled);
Debug.locals.put("answer_tagcode", _answer_tagcode);
 BA.debugLineNum = 307;BA.debugLine="Sub MakeB4XSRecords(component As B4XStateButton, i";
Debug.ShouldStop(262144);
 BA.debugLineNum = 308;BA.debugLine="Dim ret As B4XSRecords";
Debug.ShouldStop(524288);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._b4xsrecords");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 309;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1048576);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 310;BA.debugLine="ret.component = component";
Debug.ShouldStop(2097152);
_ret.setField ("component" /*RemoteObject*/ ,_component);
 BA.debugLineNum = 311;BA.debugLine="ret.idgroup = idgroup";
Debug.ShouldStop(4194304);
_ret.setField ("idgroup" /*RemoteObject*/ ,_idgroup);
 BA.debugLineNum = 312;BA.debugLine="ret.iditem = iditem";
Debug.ShouldStop(8388608);
_ret.setField ("iditem" /*RemoteObject*/ ,_iditem);
 BA.debugLineNum = 313;BA.debugLine="ret.item_tagcode = item_tagcode";
Debug.ShouldStop(16777216);
_ret.setField ("item_tagcode" /*RemoteObject*/ ,_item_tagcode);
 BA.debugLineNum = 314;BA.debugLine="ret.Enabled = Enabled";
Debug.ShouldStop(33554432);
_ret.setField ("Enabled" /*RemoteObject*/ ,_enabled);
 BA.debugLineNum = 315;BA.debugLine="ret.answer_tagcode = answer_tagcode";
Debug.ShouldStop(67108864);
_ret.setField ("answer_tagcode" /*RemoteObject*/ ,_answer_tagcode);
 BA.debugLineNum = 316;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecarobject(RemoteObject _ba,RemoteObject _obj,RemoteObject _brand,RemoteObject _model,RemoteObject _plate,RemoteObject _km) throws Exception{
try {
		Debug.PushSubsStack("MakeCarObject (types) ","types",61,_ba,types.mostCurrent,722);
if (RapidSub.canDelegate("makecarobject")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecarobject", _ba, _obj, _brand, _model, _plate, _km);}
RemoteObject _obt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._carobject");
;
Debug.locals.put("obj", _obj);
Debug.locals.put("brand", _brand);
Debug.locals.put("model", _model);
Debug.locals.put("plate", _plate);
Debug.locals.put("km", _km);
 BA.debugLineNum = 722;BA.debugLine="Sub MakeCarObject(obj As String, brand As String,";
Debug.ShouldStop(131072);
 BA.debugLineNum = 723;BA.debugLine="Dim obt As CarObject";
Debug.ShouldStop(262144);
_obt = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._carobject");Debug.locals.put("obt", _obt);
 BA.debugLineNum = 724;BA.debugLine="obt.Initialize";
Debug.ShouldStop(524288);
_obt.runVoidMethod ("Initialize");
 BA.debugLineNum = 725;BA.debugLine="obt.obj = obj";
Debug.ShouldStop(1048576);
_obt.setField ("obj" /*RemoteObject*/ ,_obj);
 BA.debugLineNum = 726;BA.debugLine="obt.brand = brand";
Debug.ShouldStop(2097152);
_obt.setField ("brand" /*RemoteObject*/ ,_brand);
 BA.debugLineNum = 727;BA.debugLine="obt.model = model";
Debug.ShouldStop(4194304);
_obt.setField ("model" /*RemoteObject*/ ,_model);
 BA.debugLineNum = 728;BA.debugLine="obt.plate = plate";
Debug.ShouldStop(8388608);
_obt.setField ("plate" /*RemoteObject*/ ,_plate);
 BA.debugLineNum = 729;BA.debugLine="obt.km = km";
Debug.ShouldStop(16777216);
_obt.setField ("km" /*RemoteObject*/ ,_km);
 BA.debugLineNum = 730;BA.debugLine="Return obt";
Debug.ShouldStop(33554432);
if (true) return _obt;
 BA.debugLineNum = 731;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makechapterrow(RemoteObject _ba,RemoteObject _id,RemoteObject _itemtagcode,RemoteObject _rootpanel,RemoteObject _panelexpanded,RemoteObject _readonly,RemoteObject _canexpand,RemoteObject _itemsloaded,RemoteObject _reloaditems) throws Exception{
try {
		Debug.PushSubsStack("MakeChapterRow (types) ","types",61,_ba,types.mostCurrent,220);
if (RapidSub.canDelegate("makechapterrow")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makechapterrow", _ba, _id, _itemtagcode, _rootpanel, _panelexpanded, _readonly, _canexpand, _itemsloaded, _reloaditems);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._chapterrow");
;
Debug.locals.put("ID", _id);
Debug.locals.put("ItemTagcode", _itemtagcode);
Debug.locals.put("RootPanel", _rootpanel);
Debug.locals.put("PanelExpanded", _panelexpanded);
Debug.locals.put("ReadOnly", _readonly);
Debug.locals.put("CanExpand", _canexpand);
Debug.locals.put("ItemsLoaded", _itemsloaded);
Debug.locals.put("ReloadItems", _reloaditems);
 BA.debugLineNum = 220;BA.debugLine="Sub MakeChapterRow(ID As Int, ItemTagcode As Strin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 221;BA.debugLine="Dim res As ChapterRow";
Debug.ShouldStop(268435456);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._chapterrow");Debug.locals.put("res", _res);
 BA.debugLineNum = 222;BA.debugLine="res.initialize";
Debug.ShouldStop(536870912);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 223;BA.debugLine="res.ID = ID";
Debug.ShouldStop(1073741824);
_res.setField ("ID" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 224;BA.debugLine="res.ItemTagcode = ItemTagcode";
Debug.ShouldStop(-2147483648);
_res.setField ("ItemTagcode" /*RemoteObject*/ ,_itemtagcode);
 BA.debugLineNum = 225;BA.debugLine="res.RootPanel = RootPanel";
Debug.ShouldStop(1);
_res.setField ("RootPanel" /*RemoteObject*/ ,_rootpanel);
 BA.debugLineNum = 226;BA.debugLine="res.PanelExpanded = PanelExpanded";
Debug.ShouldStop(2);
_res.setField ("PanelExpanded" /*RemoteObject*/ ,_panelexpanded);
 BA.debugLineNum = 227;BA.debugLine="res.ReadOnly = ReadOnly";
Debug.ShouldStop(4);
_res.setField ("ReadOnly" /*RemoteObject*/ ,_readonly);
 BA.debugLineNum = 228;BA.debugLine="res.CanExpand = CanExpand";
Debug.ShouldStop(8);
_res.setField ("CanExpand" /*RemoteObject*/ ,_canexpand);
 BA.debugLineNum = 229;BA.debugLine="res.ItemsLoaded = ItemsLoaded";
Debug.ShouldStop(16);
_res.setField ("ItemsLoaded" /*RemoteObject*/ ,_itemsloaded);
 BA.debugLineNum = 230;BA.debugLine="res.ReloadItems = ReloadItems";
Debug.ShouldStop(32);
_res.setField ("ReloadItems" /*RemoteObject*/ ,_reloaditems);
 BA.debugLineNum = 231;BA.debugLine="Return res";
Debug.ShouldStop(64);
if (true) return _res;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecla_items(RemoteObject _ba,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _answer,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("MakeCLA_Items (types) ","types",61,_ba,types.mostCurrent,839);
if (RapidSub.canDelegate("makecla_items")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecla_items", _ba, _task, _item, _uniquekey, _answer, _title);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._cla_items");
;
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Answer", _answer);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 839;BA.debugLine="Sub MakeCLA_Items(Task As String, Item As String,";
Debug.ShouldStop(64);
 BA.debugLineNum = 840;BA.debugLine="Dim ret As CLA_Items";
Debug.ShouldStop(128);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._cla_items");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 841;BA.debugLine="ret.Initialize";
Debug.ShouldStop(256);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 842;BA.debugLine="ret.Task = Task";
Debug.ShouldStop(512);
_ret.setField ("Task" /*RemoteObject*/ ,_task);
 BA.debugLineNum = 843;BA.debugLine="ret.Item = Item";
Debug.ShouldStop(1024);
_ret.setField ("Item" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 844;BA.debugLine="ret.UniqueKey = UniqueKey";
Debug.ShouldStop(2048);
_ret.setField ("UniqueKey" /*RemoteObject*/ ,_uniquekey);
 BA.debugLineNum = 845;BA.debugLine="ret.Answer = Answer";
Debug.ShouldStop(4096);
_ret.setField ("Answer" /*RemoteObject*/ ,_answer);
 BA.debugLineNum = 846;BA.debugLine="ret.Title = Title";
Debug.ShouldStop(8192);
_ret.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 847;BA.debugLine="Return ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecladata(RemoteObject _ba,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _tagcode,RemoteObject _repeatcounter,RemoteObject _readonly,RemoteObject _composed,RemoteObject _statusmaster,RemoteObject _statuschild) throws Exception{
try {
		Debug.PushSubsStack("MakeCLAData (types) ","types",61,_ba,types.mostCurrent,1272);
if (RapidSub.canDelegate("makecladata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecladata", _ba, _request, _action, _task, _item, _uniquekey, _tagcode, _repeatcounter, _readonly, _composed, _statusmaster, _statuschild);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._cladata");
;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("RepeatCounter", _repeatcounter);
Debug.locals.put("ReadOnly", _readonly);
Debug.locals.put("Composed", _composed);
Debug.locals.put("StatusMaster", _statusmaster);
Debug.locals.put("StatusChild", _statuschild);
 BA.debugLineNum = 1272;BA.debugLine="Sub MakeCLAData(Request As String, Action As Strin";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1274;BA.debugLine="Private this As CLAData";
Debug.ShouldStop(33554432);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._cladata");Debug.locals.put("this", _this);
 BA.debugLineNum = 1275;BA.debugLine="this.Initialize";
Debug.ShouldStop(67108864);
_this.runVoidMethod ("Initialize");
 BA.debugLineNum = 1276;BA.debugLine="this.Request = Request";
Debug.ShouldStop(134217728);
_this.setField ("Request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 1277;BA.debugLine="this.Action = Action";
Debug.ShouldStop(268435456);
_this.setField ("Action" /*RemoteObject*/ ,_action);
 BA.debugLineNum = 1278;BA.debugLine="this.Task = Task";
Debug.ShouldStop(536870912);
_this.setField ("Task" /*RemoteObject*/ ,_task);
 BA.debugLineNum = 1279;BA.debugLine="this.Item = Item";
Debug.ShouldStop(1073741824);
_this.setField ("Item" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 1280;BA.debugLine="this.UniqueKey = UniqueKey";
Debug.ShouldStop(-2147483648);
_this.setField ("UniqueKey" /*RemoteObject*/ ,_uniquekey);
 BA.debugLineNum = 1281;BA.debugLine="this.Tagcode = Tagcode";
Debug.ShouldStop(1);
_this.setField ("Tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1282;BA.debugLine="this.RepeatCounter = RepeatCounter";
Debug.ShouldStop(2);
_this.setField ("RepeatCounter" /*RemoteObject*/ ,_repeatcounter);
 BA.debugLineNum = 1283;BA.debugLine="this.ReadOnly = ReadOnly";
Debug.ShouldStop(4);
_this.setField ("ReadOnly" /*RemoteObject*/ ,_readonly);
 BA.debugLineNum = 1284;BA.debugLine="this.Composed = Composed";
Debug.ShouldStop(8);
_this.setField ("Composed" /*RemoteObject*/ ,_composed);
 BA.debugLineNum = 1285;BA.debugLine="this.StatusMaster = StatusMaster";
Debug.ShouldStop(16);
_this.setField ("StatusMaster" /*RemoteObject*/ ,_statusmaster);
 BA.debugLineNum = 1286;BA.debugLine="this.StatusChild = StatusChild";
Debug.ShouldStop(32);
_this.setField ("StatusChild" /*RemoteObject*/ ,_statuschild);
 BA.debugLineNum = 1287;BA.debugLine="Return this";
Debug.ShouldStop(64);
if (true) return _this;
 BA.debugLineNum = 1288;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeclaievent(RemoteObject _ba,RemoteObject _event_tagcode,RemoteObject _position,RemoteObject _type_item,RemoteObject _active,RemoteObject _value,RemoteObject _formula,RemoteObject _have_formula,RemoteObject _have_condition,RemoteObject _have_status,RemoteObject _is_jump,RemoteObject _is_status,RemoteObject _is_alert,RemoteObject _is_email,RemoteObject _is_more,RemoteObject _is_foto,RemoteObject _is_action,RemoteObject _inc_object_contacts,RemoteObject _team_tagcode,RemoteObject _email_to,RemoteObject _email_cc,RemoteObject _use_internal_image,RemoteObject _default_typerequest,RemoteObject _resobsgrp_tagcode,RemoteObject _add_entity_email,RemoteObject _add_object_email,RemoteObject _request_signature) throws Exception{
try {
		Debug.PushSubsStack("MakeCLAIEvent (types) ","types",61,_ba,types.mostCurrent,559);
if (RapidSub.canDelegate("makeclaievent")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeclaievent", _ba, _event_tagcode, _position, _type_item, _active, _value, _formula, _have_formula, _have_condition, _have_status, _is_jump, _is_status, _is_alert, _is_email, _is_more, _is_foto, _is_action, _inc_object_contacts, _team_tagcode, _email_to, _email_cc, _use_internal_image, _default_typerequest, _resobsgrp_tagcode, _add_entity_email, _add_object_email, _request_signature);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._claievent");
;
Debug.locals.put("event_tagcode", _event_tagcode);
Debug.locals.put("position", _position);
Debug.locals.put("type_item", _type_item);
Debug.locals.put("active", _active);
Debug.locals.put("value", _value);
Debug.locals.put("formula", _formula);
Debug.locals.put("have_formula", _have_formula);
Debug.locals.put("have_condition", _have_condition);
Debug.locals.put("have_status", _have_status);
Debug.locals.put("is_jump", _is_jump);
Debug.locals.put("is_status", _is_status);
Debug.locals.put("is_alert", _is_alert);
Debug.locals.put("is_email", _is_email);
Debug.locals.put("is_more", _is_more);
Debug.locals.put("is_foto", _is_foto);
Debug.locals.put("is_action", _is_action);
Debug.locals.put("inc_object_contacts", _inc_object_contacts);
Debug.locals.put("team_tagcode", _team_tagcode);
Debug.locals.put("email_to", _email_to);
Debug.locals.put("email_cc", _email_cc);
Debug.locals.put("use_internal_image", _use_internal_image);
Debug.locals.put("default_typerequest", _default_typerequest);
Debug.locals.put("resobsgrp_tagcode", _resobsgrp_tagcode);
Debug.locals.put("add_entity_email", _add_entity_email);
Debug.locals.put("add_object_email", _add_object_email);
Debug.locals.put("request_signature", _request_signature);
 BA.debugLineNum = 559;BA.debugLine="Sub MakeCLAIEvent(event_tagcode As String, positio";
Debug.ShouldStop(16384);
 BA.debugLineNum = 563;BA.debugLine="Dim ret As CLAIEvent";
Debug.ShouldStop(262144);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._claievent");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 564;BA.debugLine="ret.Initialize";
Debug.ShouldStop(524288);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 566;BA.debugLine="ret.event_tagcode = event_tagcode";
Debug.ShouldStop(2097152);
_ret.setField ("event_tagcode" /*RemoteObject*/ ,_event_tagcode);
 BA.debugLineNum = 567;BA.debugLine="ret.position = position";
Debug.ShouldStop(4194304);
_ret.setField ("position" /*RemoteObject*/ ,_position);
 BA.debugLineNum = 568;BA.debugLine="ret.type_item = type_item";
Debug.ShouldStop(8388608);
_ret.setField ("type_item" /*RemoteObject*/ ,_type_item);
 BA.debugLineNum = 569;BA.debugLine="ret.active = active";
Debug.ShouldStop(16777216);
_ret.setField ("active" /*RemoteObject*/ ,_active);
 BA.debugLineNum = 570;BA.debugLine="ret.value = value";
Debug.ShouldStop(33554432);
_ret.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 571;BA.debugLine="ret.formula = formula";
Debug.ShouldStop(67108864);
_ret.setField ("formula" /*RemoteObject*/ ,_formula);
 BA.debugLineNum = 572;BA.debugLine="ret.have_formula = have_formula";
Debug.ShouldStop(134217728);
_ret.setField ("have_formula" /*RemoteObject*/ ,_have_formula);
 BA.debugLineNum = 573;BA.debugLine="ret.have_condition = have_condition";
Debug.ShouldStop(268435456);
_ret.setField ("have_condition" /*RemoteObject*/ ,_have_condition);
 BA.debugLineNum = 574;BA.debugLine="ret.have_status = have_status";
Debug.ShouldStop(536870912);
_ret.setField ("have_status" /*RemoteObject*/ ,_have_status);
 BA.debugLineNum = 575;BA.debugLine="ret.is_jump = is_jump";
Debug.ShouldStop(1073741824);
_ret.setField ("is_jump" /*RemoteObject*/ ,_is_jump);
 BA.debugLineNum = 576;BA.debugLine="ret.is_status = is_status";
Debug.ShouldStop(-2147483648);
_ret.setField ("is_status" /*RemoteObject*/ ,_is_status);
 BA.debugLineNum = 577;BA.debugLine="ret.is_alert = is_alert";
Debug.ShouldStop(1);
_ret.setField ("is_alert" /*RemoteObject*/ ,_is_alert);
 BA.debugLineNum = 578;BA.debugLine="ret.is_email = is_email";
Debug.ShouldStop(2);
_ret.setField ("is_email" /*RemoteObject*/ ,_is_email);
 BA.debugLineNum = 579;BA.debugLine="ret.is_more = is_more";
Debug.ShouldStop(4);
_ret.setField ("is_more" /*RemoteObject*/ ,_is_more);
 BA.debugLineNum = 580;BA.debugLine="ret.is_foto = is_foto";
Debug.ShouldStop(8);
_ret.setField ("is_foto" /*RemoteObject*/ ,_is_foto);
 BA.debugLineNum = 581;BA.debugLine="ret.is_action = is_action";
Debug.ShouldStop(16);
_ret.setField ("is_action" /*RemoteObject*/ ,_is_action);
 BA.debugLineNum = 582;BA.debugLine="ret.inc_object_contacts = inc_object_contacts";
Debug.ShouldStop(32);
_ret.setField ("inc_object_contacts" /*RemoteObject*/ ,_inc_object_contacts);
 BA.debugLineNum = 583;BA.debugLine="ret.team_tagcode = team_tagcode";
Debug.ShouldStop(64);
_ret.setField ("team_tagcode" /*RemoteObject*/ ,_team_tagcode);
 BA.debugLineNum = 584;BA.debugLine="ret.email_to = email_to";
Debug.ShouldStop(128);
_ret.setField ("email_to" /*RemoteObject*/ ,_email_to);
 BA.debugLineNum = 585;BA.debugLine="ret.email_cc = email_cc";
Debug.ShouldStop(256);
_ret.setField ("email_cc" /*RemoteObject*/ ,_email_cc);
 BA.debugLineNum = 586;BA.debugLine="ret.use_internal_image = use_internal_image";
Debug.ShouldStop(512);
_ret.setField ("use_internal_image" /*RemoteObject*/ ,_use_internal_image);
 BA.debugLineNum = 587;BA.debugLine="ret.default_typerequest = default_typerequest";
Debug.ShouldStop(1024);
_ret.setField ("default_typerequest" /*RemoteObject*/ ,_default_typerequest);
 BA.debugLineNum = 588;BA.debugLine="ret.resobsgrp_tagcode = resobsgrp_tagcode";
Debug.ShouldStop(2048);
_ret.setField ("resobsgrp_tagcode" /*RemoteObject*/ ,_resobsgrp_tagcode);
 BA.debugLineNum = 589;BA.debugLine="ret.add_entity_email = add_entity_email";
Debug.ShouldStop(4096);
_ret.setField ("add_entity_email" /*RemoteObject*/ ,_add_entity_email);
 BA.debugLineNum = 590;BA.debugLine="ret.add_object_email = add_object_email";
Debug.ShouldStop(8192);
_ret.setField ("add_object_email" /*RemoteObject*/ ,_add_object_email);
 BA.debugLineNum = 591;BA.debugLine="ret.request_signature = request_signature";
Debug.ShouldStop(16384);
_ret.setField ("request_signature" /*RemoteObject*/ ,_request_signature);
 BA.debugLineNum = 592;BA.debugLine="Return ret";
Debug.ShouldStop(32768);
if (true) return _ret;
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeclastatus(RemoteObject _ba,RemoteObject _status,RemoteObject _startdate,RemoteObject _starttime,RemoteObject _endtime,RemoteObject _duration,RemoteObject _points,RemoteObject _risk,RemoteObject _result,RemoteObject _resultdesc,RemoteObject _hasimages,RemoteObject _hasactions,RemoteObject _hassignatures,RemoteObject _reportgenerated,RemoteObject _canchange) throws Exception{
try {
		Debug.PushSubsStack("MakeCLAStatus (types) ","types",61,_ba,types.mostCurrent,1230);
if (RapidSub.canDelegate("makeclastatus")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeclastatus", _ba, _status, _startdate, _starttime, _endtime, _duration, _points, _risk, _result, _resultdesc, _hasimages, _hasactions, _hassignatures, _reportgenerated, _canchange);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._clastatus");
;
Debug.locals.put("Status", _status);
Debug.locals.put("StartDate", _startdate);
Debug.locals.put("Starttime", _starttime);
Debug.locals.put("Endtime", _endtime);
Debug.locals.put("Duration", _duration);
Debug.locals.put("Points", _points);
Debug.locals.put("Risk", _risk);
Debug.locals.put("Result", _result);
Debug.locals.put("ResultDesc", _resultdesc);
Debug.locals.put("HasImages", _hasimages);
Debug.locals.put("HasActions", _hasactions);
Debug.locals.put("HasSignatures", _hassignatures);
Debug.locals.put("ReportGenerated", _reportgenerated);
Debug.locals.put("CanChange", _canchange);
 BA.debugLineNum = 1230;BA.debugLine="Sub MakeCLAStatus(Status As Int, StartDate As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1233;BA.debugLine="Private this As CLAStatus";
Debug.ShouldStop(65536);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._clastatus");Debug.locals.put("this", _this);
 BA.debugLineNum = 1234;BA.debugLine="this.Initialize";
Debug.ShouldStop(131072);
_this.runVoidMethod ("Initialize");
 BA.debugLineNum = 1235;BA.debugLine="this.Status = Status";
Debug.ShouldStop(262144);
_this.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 1236;BA.debugLine="this.StartDate = StartDate";
Debug.ShouldStop(524288);
_this.setField ("StartDate" /*RemoteObject*/ ,_startdate);
 BA.debugLineNum = 1237;BA.debugLine="this.Starttime = Starttime";
Debug.ShouldStop(1048576);
_this.setField ("Starttime" /*RemoteObject*/ ,_starttime);
 BA.debugLineNum = 1238;BA.debugLine="this.Endtime = Endtime";
Debug.ShouldStop(2097152);
_this.setField ("Endtime" /*RemoteObject*/ ,_endtime);
 BA.debugLineNum = 1239;BA.debugLine="this.Duration = Duration";
Debug.ShouldStop(4194304);
_this.setField ("Duration" /*RemoteObject*/ ,_duration);
 BA.debugLineNum = 1240;BA.debugLine="this.Points = Points";
Debug.ShouldStop(8388608);
_this.setField ("Points" /*RemoteObject*/ ,_points);
 BA.debugLineNum = 1241;BA.debugLine="this.Risk = Risk";
Debug.ShouldStop(16777216);
_this.setField ("Risk" /*RemoteObject*/ ,_risk);
 BA.debugLineNum = 1242;BA.debugLine="this.Result = Result";
Debug.ShouldStop(33554432);
_this.setField ("Result" /*RemoteObject*/ ,_result);
 BA.debugLineNum = 1243;BA.debugLine="this.ResultDesc = ResultDesc";
Debug.ShouldStop(67108864);
_this.setField ("ResultDesc" /*RemoteObject*/ ,_resultdesc);
 BA.debugLineNum = 1244;BA.debugLine="this.HasImages = HasImages";
Debug.ShouldStop(134217728);
_this.setField ("HasImages" /*RemoteObject*/ ,_hasimages);
 BA.debugLineNum = 1245;BA.debugLine="this.HasActions = HasActions";
Debug.ShouldStop(268435456);
_this.setField ("HasActions" /*RemoteObject*/ ,_hasactions);
 BA.debugLineNum = 1246;BA.debugLine="this.HasSignatures = HasSignatures";
Debug.ShouldStop(536870912);
_this.setField ("HasSignatures" /*RemoteObject*/ ,_hassignatures);
 BA.debugLineNum = 1247;BA.debugLine="this.ReportGenerated = ReportGenerated";
Debug.ShouldStop(1073741824);
_this.setField ("ReportGenerated" /*RemoteObject*/ ,_reportgenerated);
 BA.debugLineNum = 1248;BA.debugLine="this.CanChange = CanChange";
Debug.ShouldStop(-2147483648);
_this.setField ("CanChange" /*RemoteObject*/ ,_canchange);
 BA.debugLineNum = 1249;BA.debugLine="Return this";
Debug.ShouldStop(1);
if (true) return _this;
 BA.debugLineNum = 1250;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeclataskitem(RemoteObject _ba,RemoteObject _task_tagcode,RemoteObject _item_tagcode,RemoteObject _unique_key,RemoteObject _position,RemoteObject _level,RemoteObject _parent_tagcode,RemoteObject _item_type,RemoteObject _points,RemoteObject _risk,RemoteObject _data_type,RemoteObject _bullet_master,RemoteObject _bullet_child,RemoteObject _type_answer,RemoteObject _typified_answers,RemoteObject _mandatory,RemoteObject _critical,RemoteObject _repeated,RemoteObject _multiple,RemoteObject _on_report,RemoteObject _has_signature,RemoteObject _has_articles,RemoteObject _type_nonconformity,RemoteObject _ta_tagcode,RemoteObject _ta_override_result,RemoteObject _ta_jump_tagcode,RemoteObject _defobj_tagcode,RemoteObject _info_notes,RemoteObject _asw_notes,RemoteObject _validate_execution,RemoteObject _cla_obs,RemoteObject _force_signature,RemoteObject _force_picture,RemoteObject _force_time,RemoteObject _type_time_control,RemoteObject _time_run_anyway,RemoteObject _dependent_key,RemoteObject _time_duration,RemoteObject _force_control,RemoteObject _type_control,RemoteObject _control_run_anyway,RemoteObject _control_condition,RemoteObject _do_tagcode,RemoteObject _do_associate_type,RemoteObject _do_object_image,RemoteObject _reference,RemoteObject _do_subgroup,RemoteObject _do_subsubgroup,RemoteObject _do_affected_table,RemoteObject _do_affected_tagcode,RemoteObject _do_affected_field,RemoteObject _change_title_totime,RemoteObject _answer_change_title) throws Exception{
try {
		Debug.PushSubsStack("MakeCLATaskItem (types) ","types",61,_ba,types.mostCurrent,475);
if (RapidSub.canDelegate("makeclataskitem")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeclataskitem", _ba, _task_tagcode, _item_tagcode, _unique_key, _position, _level, _parent_tagcode, _item_type, _points, _risk, _data_type, _bullet_master, _bullet_child, _type_answer, _typified_answers, _mandatory, _critical, _repeated, _multiple, _on_report, _has_signature, _has_articles, _type_nonconformity, _ta_tagcode, _ta_override_result, _ta_jump_tagcode, _defobj_tagcode, _info_notes, _asw_notes, _validate_execution, _cla_obs, _force_signature, _force_picture, _force_time, _type_time_control, _time_run_anyway, _dependent_key, _time_duration, _force_control, _type_control, _control_run_anyway, _control_condition, _do_tagcode, _do_associate_type, _do_object_image, _reference, _do_subgroup, _do_subsubgroup, _do_affected_table, _do_affected_tagcode, _do_affected_field, _change_title_totime, _answer_change_title);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._clataskitem");
;
Debug.locals.put("task_tagcode", _task_tagcode);
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("unique_key", _unique_key);
Debug.locals.put("position", _position);
Debug.locals.put("level", _level);
Debug.locals.put("parent_tagcode", _parent_tagcode);
Debug.locals.put("item_type", _item_type);
Debug.locals.put("points", _points);
Debug.locals.put("risk", _risk);
Debug.locals.put("data_type", _data_type);
Debug.locals.put("bullet_master", _bullet_master);
Debug.locals.put("bullet_child", _bullet_child);
Debug.locals.put("type_answer", _type_answer);
Debug.locals.put("typified_answers", _typified_answers);
Debug.locals.put("mandatory", _mandatory);
Debug.locals.put("critical", _critical);
Debug.locals.put("repeated", _repeated);
Debug.locals.put("multiple", _multiple);
Debug.locals.put("on_report", _on_report);
Debug.locals.put("has_signature", _has_signature);
Debug.locals.put("has_articles", _has_articles);
Debug.locals.put("type_nonconformity", _type_nonconformity);
Debug.locals.put("ta_tagcode", _ta_tagcode);
Debug.locals.put("ta_override_result", _ta_override_result);
Debug.locals.put("ta_jump_tagcode", _ta_jump_tagcode);
Debug.locals.put("defobj_tagcode", _defobj_tagcode);
Debug.locals.put("info_notes", _info_notes);
Debug.locals.put("asw_notes", _asw_notes);
Debug.locals.put("validate_execution", _validate_execution);
Debug.locals.put("cla_obs", _cla_obs);
Debug.locals.put("force_signature", _force_signature);
Debug.locals.put("force_picture", _force_picture);
Debug.locals.put("force_time", _force_time);
Debug.locals.put("type_time_control", _type_time_control);
Debug.locals.put("time_run_anyway", _time_run_anyway);
Debug.locals.put("dependent_key", _dependent_key);
Debug.locals.put("time_duration", _time_duration);
Debug.locals.put("force_control", _force_control);
Debug.locals.put("type_control", _type_control);
Debug.locals.put("control_run_anyway", _control_run_anyway);
Debug.locals.put("control_condition", _control_condition);
Debug.locals.put("do_tagcode", _do_tagcode);
Debug.locals.put("do_associate_type", _do_associate_type);
Debug.locals.put("do_object_image", _do_object_image);
Debug.locals.put("reference", _reference);
Debug.locals.put("do_subgroup", _do_subgroup);
Debug.locals.put("do_subsubgroup", _do_subsubgroup);
Debug.locals.put("do_affected_table", _do_affected_table);
Debug.locals.put("do_affected_tagcode", _do_affected_tagcode);
Debug.locals.put("do_affected_field", _do_affected_field);
Debug.locals.put("change_title_totime", _change_title_totime);
Debug.locals.put("answer_change_title", _answer_change_title);
 BA.debugLineNum = 475;BA.debugLine="Sub MakeCLATaskItem(task_tagcode As String,item_ta";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 485;BA.debugLine="Dim ret As CLATaskItem";
Debug.ShouldStop(16);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._clataskitem");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 486;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 487;BA.debugLine="ret.task_tagcode = task_tagcode";
Debug.ShouldStop(64);
_ret.setField ("task_tagcode" /*RemoteObject*/ ,_task_tagcode);
 BA.debugLineNum = 488;BA.debugLine="ret.item_tagcode = item_tagcode";
Debug.ShouldStop(128);
_ret.setField ("item_tagcode" /*RemoteObject*/ ,_item_tagcode);
 BA.debugLineNum = 489;BA.debugLine="ret.unique_key = unique_key";
Debug.ShouldStop(256);
_ret.setField ("unique_key" /*RemoteObject*/ ,_unique_key);
 BA.debugLineNum = 490;BA.debugLine="ret.position = position";
Debug.ShouldStop(512);
_ret.setField ("position" /*RemoteObject*/ ,_position);
 BA.debugLineNum = 491;BA.debugLine="ret.level = level";
Debug.ShouldStop(1024);
_ret.setField ("level" /*RemoteObject*/ ,_level);
 BA.debugLineNum = 492;BA.debugLine="ret.parent_tagcode = parent_tagcode";
Debug.ShouldStop(2048);
_ret.setField ("parent_tagcode" /*RemoteObject*/ ,_parent_tagcode);
 BA.debugLineNum = 493;BA.debugLine="ret.item_type = item_type";
Debug.ShouldStop(4096);
_ret.setField ("item_type" /*RemoteObject*/ ,_item_type);
 BA.debugLineNum = 494;BA.debugLine="ret.points = points";
Debug.ShouldStop(8192);
_ret.setField ("points" /*RemoteObject*/ ,_points);
 BA.debugLineNum = 495;BA.debugLine="ret.risk = risk";
Debug.ShouldStop(16384);
_ret.setField ("risk" /*RemoteObject*/ ,_risk);
 BA.debugLineNum = 496;BA.debugLine="ret.data_type = data_type";
Debug.ShouldStop(32768);
_ret.setField ("data_type" /*RemoteObject*/ ,_data_type);
 BA.debugLineNum = 497;BA.debugLine="ret.bullet_master = bullet_master";
Debug.ShouldStop(65536);
_ret.setField ("bullet_master" /*RemoteObject*/ ,_bullet_master);
 BA.debugLineNum = 498;BA.debugLine="ret.bullet_child = bullet_child";
Debug.ShouldStop(131072);
_ret.setField ("bullet_child" /*RemoteObject*/ ,_bullet_child);
 BA.debugLineNum = 499;BA.debugLine="ret.type_answer = type_answer";
Debug.ShouldStop(262144);
_ret.setField ("type_answer" /*RemoteObject*/ ,_type_answer);
 BA.debugLineNum = 500;BA.debugLine="ret.typified_answers = typified_answers";
Debug.ShouldStop(524288);
_ret.setField ("typified_answers" /*RemoteObject*/ ,_typified_answers);
 BA.debugLineNum = 501;BA.debugLine="ret.mandatory = mandatory";
Debug.ShouldStop(1048576);
_ret.setField ("mandatory" /*RemoteObject*/ ,_mandatory);
 BA.debugLineNum = 502;BA.debugLine="ret.critical = critical";
Debug.ShouldStop(2097152);
_ret.setField ("critical" /*RemoteObject*/ ,_critical);
 BA.debugLineNum = 503;BA.debugLine="ret.repeated = repeated";
Debug.ShouldStop(4194304);
_ret.setField ("repeated" /*RemoteObject*/ ,_repeated);
 BA.debugLineNum = 504;BA.debugLine="ret.multiple = multiple";
Debug.ShouldStop(8388608);
_ret.setField ("multiple" /*RemoteObject*/ ,_multiple);
 BA.debugLineNum = 505;BA.debugLine="ret.on_report = on_report";
Debug.ShouldStop(16777216);
_ret.setField ("on_report" /*RemoteObject*/ ,_on_report);
 BA.debugLineNum = 506;BA.debugLine="ret.has_signature = has_signature";
Debug.ShouldStop(33554432);
_ret.setField ("has_signature" /*RemoteObject*/ ,_has_signature);
 BA.debugLineNum = 507;BA.debugLine="ret.has_articles = has_articles";
Debug.ShouldStop(67108864);
_ret.setField ("has_articles" /*RemoteObject*/ ,_has_articles);
 BA.debugLineNum = 508;BA.debugLine="ret.type_nonconformity = type_nonconformity";
Debug.ShouldStop(134217728);
_ret.setField ("type_nonconformity" /*RemoteObject*/ ,_type_nonconformity);
 BA.debugLineNum = 509;BA.debugLine="ret.ta_tagcode = ta_tagcode";
Debug.ShouldStop(268435456);
_ret.setField ("ta_tagcode" /*RemoteObject*/ ,_ta_tagcode);
 BA.debugLineNum = 510;BA.debugLine="ret.ta_override_result = ta_override_result";
Debug.ShouldStop(536870912);
_ret.setField ("ta_override_result" /*RemoteObject*/ ,_ta_override_result);
 BA.debugLineNum = 511;BA.debugLine="ret.ta_jump_tagcode = ta_jump_tagcode";
Debug.ShouldStop(1073741824);
_ret.setField ("ta_jump_tagcode" /*RemoteObject*/ ,_ta_jump_tagcode);
 BA.debugLineNum = 512;BA.debugLine="ret.defobj_tagcode = defobj_tagcode";
Debug.ShouldStop(-2147483648);
_ret.setField ("defobj_tagcode" /*RemoteObject*/ ,_defobj_tagcode);
 BA.debugLineNum = 513;BA.debugLine="ret.info_notes = info_notes";
Debug.ShouldStop(1);
_ret.setField ("info_notes" /*RemoteObject*/ ,_info_notes);
 BA.debugLineNum = 514;BA.debugLine="ret.asw_notes = asw_notes";
Debug.ShouldStop(2);
_ret.setField ("asw_notes" /*RemoteObject*/ ,_asw_notes);
 BA.debugLineNum = 515;BA.debugLine="ret.validate_execution = validate_execution";
Debug.ShouldStop(4);
_ret.setField ("validate_execution" /*RemoteObject*/ ,_validate_execution);
 BA.debugLineNum = 516;BA.debugLine="ret.cla_obs = cla_obs";
Debug.ShouldStop(8);
_ret.setField ("cla_obs" /*RemoteObject*/ ,_cla_obs);
 BA.debugLineNum = 517;BA.debugLine="ret.force_signature = force_signature";
Debug.ShouldStop(16);
_ret.setField ("force_signature" /*RemoteObject*/ ,_force_signature);
 BA.debugLineNum = 518;BA.debugLine="ret.force_picture = force_picture";
Debug.ShouldStop(32);
_ret.setField ("force_picture" /*RemoteObject*/ ,_force_picture);
 BA.debugLineNum = 519;BA.debugLine="ret.force_time = force_time";
Debug.ShouldStop(64);
_ret.setField ("force_time" /*RemoteObject*/ ,_force_time);
 BA.debugLineNum = 520;BA.debugLine="ret.type_time_control = type_time_control";
Debug.ShouldStop(128);
_ret.setField ("type_time_control" /*RemoteObject*/ ,_type_time_control);
 BA.debugLineNum = 521;BA.debugLine="ret.time_run_anyway = time_run_anyway";
Debug.ShouldStop(256);
_ret.setField ("time_run_anyway" /*RemoteObject*/ ,_time_run_anyway);
 BA.debugLineNum = 522;BA.debugLine="ret.dependent_key = dependent_key";
Debug.ShouldStop(512);
_ret.setField ("dependent_key" /*RemoteObject*/ ,_dependent_key);
 BA.debugLineNum = 523;BA.debugLine="ret.time_duration = time_duration";
Debug.ShouldStop(1024);
_ret.setField ("time_duration" /*RemoteObject*/ ,_time_duration);
 BA.debugLineNum = 524;BA.debugLine="ret.force_control = force_control";
Debug.ShouldStop(2048);
_ret.setField ("force_control" /*RemoteObject*/ ,_force_control);
 BA.debugLineNum = 525;BA.debugLine="ret.type_control = type_control";
Debug.ShouldStop(4096);
_ret.setField ("type_control" /*RemoteObject*/ ,_type_control);
 BA.debugLineNum = 526;BA.debugLine="ret.control_run_anyway = control_run_anyway";
Debug.ShouldStop(8192);
_ret.setField ("control_run_anyway" /*RemoteObject*/ ,_control_run_anyway);
 BA.debugLineNum = 527;BA.debugLine="ret.control_condition = control_condition";
Debug.ShouldStop(16384);
_ret.setField ("control_condition" /*RemoteObject*/ ,_control_condition);
 BA.debugLineNum = 528;BA.debugLine="ret.do_tagcode = do_tagcode";
Debug.ShouldStop(32768);
_ret.setField ("do_tagcode" /*RemoteObject*/ ,_do_tagcode);
 BA.debugLineNum = 529;BA.debugLine="ret.do_associate_type = do_associate_type";
Debug.ShouldStop(65536);
_ret.setField ("do_associate_type" /*RemoteObject*/ ,_do_associate_type);
 BA.debugLineNum = 530;BA.debugLine="ret.do_object_image = do_object_image";
Debug.ShouldStop(131072);
_ret.setField ("do_object_image" /*RemoteObject*/ ,_do_object_image);
 BA.debugLineNum = 531;BA.debugLine="ret.reference = reference";
Debug.ShouldStop(262144);
_ret.setField ("reference" /*RemoteObject*/ ,_reference);
 BA.debugLineNum = 532;BA.debugLine="ret.do_subgroup = do_subgroup";
Debug.ShouldStop(524288);
_ret.setField ("do_subgroup" /*RemoteObject*/ ,_do_subgroup);
 BA.debugLineNum = 533;BA.debugLine="ret.do_subsubgroup = do_subsubgroup";
Debug.ShouldStop(1048576);
_ret.setField ("do_subsubgroup" /*RemoteObject*/ ,_do_subsubgroup);
 BA.debugLineNum = 534;BA.debugLine="ret.do_affected_table = do_affected_table";
Debug.ShouldStop(2097152);
_ret.setField ("do_affected_table" /*RemoteObject*/ ,_do_affected_table);
 BA.debugLineNum = 535;BA.debugLine="ret.do_affected_tagcode = do_affected_tagcode";
Debug.ShouldStop(4194304);
_ret.setField ("do_affected_tagcode" /*RemoteObject*/ ,_do_affected_tagcode);
 BA.debugLineNum = 536;BA.debugLine="ret.do_affected_field = do_affected_field";
Debug.ShouldStop(8388608);
_ret.setField ("do_affected_field" /*RemoteObject*/ ,_do_affected_field);
 BA.debugLineNum = 537;BA.debugLine="ret.change_title_totime = change_title_totime";
Debug.ShouldStop(16777216);
_ret.setField ("change_title_totime" /*RemoteObject*/ ,_change_title_totime);
 BA.debugLineNum = 538;BA.debugLine="ret.answer_change_title = answer_change_title";
Debug.ShouldStop(33554432);
_ret.setField ("answer_change_title" /*RemoteObject*/ ,_answer_change_title);
 BA.debugLineNum = 539;BA.debugLine="Return ret";
Debug.ShouldStop(67108864);
if (true) return _ret;
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeclataskitemclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeCLATaskItemClear (types) ","types",61,_ba,types.mostCurrent,542);
if (RapidSub.canDelegate("makeclataskitemclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeclataskitemclear", _ba);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._clataskitem");
;
 BA.debugLineNum = 542;BA.debugLine="Sub MakeCLATaskItemClear As CLATaskItem";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 543;BA.debugLine="Dim ret As CLATaskItem";
Debug.ShouldStop(1073741824);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._clataskitem");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 544;BA.debugLine="ret.Initialize";
Debug.ShouldStop(-2147483648);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 545;BA.debugLine="Return ret";
Debug.ShouldStop(1);
if (true) return _ret;
 BA.debugLineNum = 546;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecodenamelist(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("MakeCodeNameList (types) ","types",61,_ba,types.mostCurrent,802);
if (RapidSub.canDelegate("makecodenamelist")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecodenamelist", _ba, _tagcode, _name);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
;
Debug.locals.put("TagCode", _tagcode);
Debug.locals.put("Name", _name);
 BA.debugLineNum = 802;BA.debugLine="Sub MakeCodeNameList(TagCode As String, Name As St";
Debug.ShouldStop(2);
 BA.debugLineNum = 803;BA.debugLine="Dim ret As CodeNameList";
Debug.ShouldStop(4);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._codenamelist");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 804;BA.debugLine="ret.Initialize";
Debug.ShouldStop(8);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 805;BA.debugLine="ret.Tagcode = TagCode";
Debug.ShouldStop(16);
_ret.setField ("TagCode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 806;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(32);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 807;BA.debugLine="Return ret";
Debug.ShouldStop(64);
if (true) return _ret;
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecomponentrecords(RemoteObject _ba,RemoteObject _component,RemoteObject _idgroup,RemoteObject _item_tagcode,RemoteObject _height,RemoteObject _repeatitemcounter,RemoteObject _repeatfieldcounter,RemoteObject _enabled) throws Exception{
try {
		Debug.PushSubsStack("MakeComponentRecords (types) ","types",61,_ba,types.mostCurrent,319);
if (RapidSub.canDelegate("makecomponentrecords")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecomponentrecords", _ba, _component, _idgroup, _item_tagcode, _height, _repeatitemcounter, _repeatfieldcounter, _enabled);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._componentrecords");
;
Debug.locals.put("component", _component);
Debug.locals.put("idgroup", _idgroup);
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("Height", _height);
Debug.locals.put("RepeatItemCounter", _repeatitemcounter);
Debug.locals.put("RepeatFieldCounter", _repeatfieldcounter);
Debug.locals.put("Enabled", _enabled);
 BA.debugLineNum = 319;BA.debugLine="Sub MakeComponentRecords(component As B4XView, idg";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 320;BA.debugLine="Dim ret As ComponentRecords";
Debug.ShouldStop(-2147483648);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._componentrecords");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 321;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 322;BA.debugLine="ret.component = component";
Debug.ShouldStop(2);
_ret.setField ("component" /*RemoteObject*/ ,_component);
 BA.debugLineNum = 323;BA.debugLine="ret.idgroup = idgroup";
Debug.ShouldStop(4);
_ret.setField ("idgroup" /*RemoteObject*/ ,_idgroup);
 BA.debugLineNum = 324;BA.debugLine="ret.item_tagcode = item_tagcode";
Debug.ShouldStop(8);
_ret.setField ("item_tagcode" /*RemoteObject*/ ,_item_tagcode);
 BA.debugLineNum = 325;BA.debugLine="ret.Height = Height";
Debug.ShouldStop(16);
_ret.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 326;BA.debugLine="ret.RepeatItemCounter = RepeatItemCounter";
Debug.ShouldStop(32);
_ret.setField ("RepeatItemCounter" /*RemoteObject*/ ,_repeatitemcounter);
 BA.debugLineNum = 327;BA.debugLine="ret.RepeatFieldCounter = RepeatFieldCounter";
Debug.ShouldStop(64);
_ret.setField ("RepeatFieldCounter" /*RemoteObject*/ ,_repeatfieldcounter);
 BA.debugLineNum = 328;BA.debugLine="ret.Enabled = Enabled";
Debug.ShouldStop(128);
_ret.setField ("Enabled" /*RemoteObject*/ ,_enabled);
 BA.debugLineNum = 329;BA.debugLine="Return ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecomposedbuttondefs(RemoteObject _ba,RemoteObject _panelcolor,RemoteObject _iconcolor,RemoteObject _iconbkcolor,RemoteObject _textcolor,RemoteObject _textsbkcolor,RemoteObject _textebkcolor,RemoteObject _bordercolor,RemoteObject _borderwidth,RemoteObject _borderradius) throws Exception{
try {
		Debug.PushSubsStack("MakeComposedButtonDefs (types) ","types",61,_ba,types.mostCurrent,988);
if (RapidSub.canDelegate("makecomposedbuttondefs")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecomposedbuttondefs", _ba, _panelcolor, _iconcolor, _iconbkcolor, _textcolor, _textsbkcolor, _textebkcolor, _bordercolor, _borderwidth, _borderradius);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._composedbuttondefs");
;
Debug.locals.put("PanelColor", _panelcolor);
Debug.locals.put("IconColor", _iconcolor);
Debug.locals.put("IconBKColor", _iconbkcolor);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("TextSBKColor", _textsbkcolor);
Debug.locals.put("TextEBKColor", _textebkcolor);
Debug.locals.put("BorderColor", _bordercolor);
Debug.locals.put("BorderWidth", _borderwidth);
Debug.locals.put("BorderRadius", _borderradius);
 BA.debugLineNum = 988;BA.debugLine="Sub MakeComposedButtonDefs(PanelColor As Int, Icon";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 990;BA.debugLine="Dim ret As ComposedButtonDefs";
Debug.ShouldStop(536870912);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._composedbuttondefs");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 991;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1073741824);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 992;BA.debugLine="ret.PanelColor = PanelColor";
Debug.ShouldStop(-2147483648);
_ret.setField ("PanelColor" /*RemoteObject*/ ,_panelcolor);
 BA.debugLineNum = 993;BA.debugLine="ret.IconColor = IconColor";
Debug.ShouldStop(1);
_ret.setField ("IconColor" /*RemoteObject*/ ,_iconcolor);
 BA.debugLineNum = 994;BA.debugLine="ret.IconBKColor = IconBKColor";
Debug.ShouldStop(2);
_ret.setField ("IconBKColor" /*RemoteObject*/ ,_iconbkcolor);
 BA.debugLineNum = 995;BA.debugLine="ret.TextColor = TextColor";
Debug.ShouldStop(4);
_ret.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 996;BA.debugLine="ret.TextSBKColor = TextSBKColor";
Debug.ShouldStop(8);
_ret.setField ("TextSBKColor" /*RemoteObject*/ ,_textsbkcolor);
 BA.debugLineNum = 997;BA.debugLine="ret.TextEBKColor = TextEBKColor";
Debug.ShouldStop(16);
_ret.setField ("TextEBKColor" /*RemoteObject*/ ,_textebkcolor);
 BA.debugLineNum = 998;BA.debugLine="ret.BorderColor = BorderColor";
Debug.ShouldStop(32);
_ret.setField ("BorderColor" /*RemoteObject*/ ,_bordercolor);
 BA.debugLineNum = 999;BA.debugLine="ret.BorderWidth = BorderWidth";
Debug.ShouldStop(64);
_ret.setField ("BorderWidth" /*RemoteObject*/ ,_borderwidth);
 BA.debugLineNum = 1000;BA.debugLine="ret.BorderRadius = BorderRadius";
Debug.ShouldStop(128);
_ret.setField ("BorderRadius" /*RemoteObject*/ ,_borderradius);
 BA.debugLineNum = 1001;BA.debugLine="Return ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 1002;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecontact(RemoteObject _ba,RemoteObject _contacttype,RemoteObject _contactname,RemoteObject _contactphone,RemoteObject _contactemail,RemoteObject _contacttitle,RemoteObject _tagcode,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("MakeContact (types) ","types",61,_ba,types.mostCurrent,1057);
if (RapidSub.canDelegate("makecontact")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecontact", _ba, _contacttype, _contactname, _contactphone, _contactemail, _contacttitle, _tagcode, _asnew);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._contactrecord");
;
Debug.locals.put("contactType", _contacttype);
Debug.locals.put("contactName", _contactname);
Debug.locals.put("contactPhone", _contactphone);
Debug.locals.put("contactEmail", _contactemail);
Debug.locals.put("contactTitle", _contacttitle);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1057;BA.debugLine="Sub MakeContact(contactType As Int, contactName As";
Debug.ShouldStop(1);
 BA.debugLineNum = 1058;BA.debugLine="Dim ret As ContactRecord";
Debug.ShouldStop(2);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._contactrecord");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1059;BA.debugLine="ret.Initialize";
Debug.ShouldStop(4);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1060;BA.debugLine="ret.contactType = contactType";
Debug.ShouldStop(8);
_ret.setField ("contactType" /*RemoteObject*/ ,_contacttype);
 BA.debugLineNum = 1061;BA.debugLine="ret.contactName = contactName";
Debug.ShouldStop(16);
_ret.setField ("contactName" /*RemoteObject*/ ,_contactname);
 BA.debugLineNum = 1062;BA.debugLine="ret.contactPhone = contactPhone";
Debug.ShouldStop(32);
_ret.setField ("contactPhone" /*RemoteObject*/ ,_contactphone);
 BA.debugLineNum = 1063;BA.debugLine="ret.contactEmail = contactEmail";
Debug.ShouldStop(64);
_ret.setField ("contactEmail" /*RemoteObject*/ ,_contactemail);
 BA.debugLineNum = 1064;BA.debugLine="ret.contactTitle = contactTitle";
Debug.ShouldStop(128);
_ret.setField ("contactTitle" /*RemoteObject*/ ,_contacttitle);
 BA.debugLineNum = 1065;BA.debugLine="ret.tagcode = tagcode";
Debug.ShouldStop(256);
_ret.setField ("tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1066;BA.debugLine="ret.asNew = asNew";
Debug.ShouldStop(512);
_ret.setField ("asNew" /*RemoteObject*/ ,_asnew);
 BA.debugLineNum = 1067;BA.debugLine="Return ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 1068;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecreaterequestreturn(RemoteObject _ba,RemoteObject _requesttagcode,RemoteObject _status,RemoteObject _stage) throws Exception{
try {
		Debug.PushSubsStack("MakeCreateRequestReturn (types) ","types",61,_ba,types.mostCurrent,259);
if (RapidSub.canDelegate("makecreaterequestreturn")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecreaterequestreturn", _ba, _requesttagcode, _status, _stage);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._createrequestreturn");
;
Debug.locals.put("RequestTagcode", _requesttagcode);
Debug.locals.put("Status", _status);
Debug.locals.put("Stage", _stage);
 BA.debugLineNum = 259;BA.debugLine="Sub MakeCreateRequestReturn(RequestTagcode As Stri";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="Dim res As CreateRequestReturn";
Debug.ShouldStop(8);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._createrequestreturn");Debug.locals.put("res", _res);
 BA.debugLineNum = 261;BA.debugLine="res.initialize";
Debug.ShouldStop(16);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 262;BA.debugLine="res.RequestTagcode = RequestTagcode";
Debug.ShouldStop(32);
_res.setField ("RequestTagcode" /*RemoteObject*/ ,_requesttagcode);
 BA.debugLineNum = 263;BA.debugLine="res.Status = Status";
Debug.ShouldStop(64);
_res.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 264;BA.debugLine="res.Stage = Stage";
Debug.ShouldStop(128);
_res.setField ("Stage" /*RemoteObject*/ ,_stage);
 BA.debugLineNum = 265;BA.debugLine="Return res";
Debug.ShouldStop(256);
if (true) return _res;
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makecreaterequestreturnclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeCreateRequestReturnClear (types) ","types",61,_ba,types.mostCurrent,268);
if (RapidSub.canDelegate("makecreaterequestreturnclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makecreaterequestreturnclear", _ba);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._createrequestreturn");
;
 BA.debugLineNum = 268;BA.debugLine="Sub MakeCreateRequestReturnClear As CreateRequestR";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="Dim res As CreateRequestReturn";
Debug.ShouldStop(4096);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._createrequestreturn");Debug.locals.put("res", _res);
 BA.debugLineNum = 270;BA.debugLine="res.initialize";
Debug.ShouldStop(8192);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 271;BA.debugLine="res.RequestTagcode = \"\"";
Debug.ShouldStop(16384);
_res.setField ("RequestTagcode" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 272;BA.debugLine="res.Status = 0";
Debug.ShouldStop(32768);
_res.setField ("Status" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 273;BA.debugLine="res.Stage = 0";
Debug.ShouldStop(65536);
_res.setField ("Stage" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 274;BA.debugLine="Return res";
Debug.ShouldStop(131072);
if (true) return _res;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedb_itc(RemoteObject _ba,RemoteObject _id,RemoteObject _tagcode,RemoteObject _title,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("MakeDB_ITC (types) ","types",61,_ba,types.mostCurrent,782);
if (RapidSub.canDelegate("makedb_itc")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makedb_itc", _ba, _id, _tagcode, _title, _color);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._db_itc");
;
Debug.locals.put("ID", _id);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("Title", _title);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 782;BA.debugLine="Sub MakeDB_ITC(ID As Int, Tagcode As String, Title";
Debug.ShouldStop(8192);
 BA.debugLineNum = 783;BA.debugLine="Dim ret As DB_ITC";
Debug.ShouldStop(16384);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._db_itc");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 784;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 785;BA.debugLine="ret.ID = ID";
Debug.ShouldStop(65536);
_ret.setField ("ID" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 786;BA.debugLine="ret.TagCode = Tagcode";
Debug.ShouldStop(131072);
_ret.setField ("TagCode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 787;BA.debugLine="ret.Title = Title";
Debug.ShouldStop(262144);
_ret.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 788;BA.debugLine="ret.Color = Color";
Debug.ShouldStop(524288);
_ret.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 789;BA.debugLine="Return ret";
Debug.ShouldStop(1048576);
if (true) return _ret;
 BA.debugLineNum = 790;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedeviceinformation(RemoteObject _ba,RemoteObject _description,RemoteObject _size,RemoteObject _havephone) throws Exception{
try {
		Debug.PushSubsStack("MakeDeviceInformation (types) ","types",61,_ba,types.mostCurrent,792);
if (RapidSub.canDelegate("makedeviceinformation")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makedeviceinformation", _ba, _description, _size, _havephone);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._deviceinformation");
;
Debug.locals.put("Description", _description);
Debug.locals.put("Size", _size);
Debug.locals.put("HavePhone", _havephone);
 BA.debugLineNum = 792;BA.debugLine="Sub MakeDeviceInformation(Description As String, S";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 793;BA.debugLine="Dim ret As DeviceInformation";
Debug.ShouldStop(16777216);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._deviceinformation");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 794;BA.debugLine="ret.Initialize";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 795;BA.debugLine="ret.Description = Description";
Debug.ShouldStop(67108864);
_ret.setField ("Description" /*RemoteObject*/ ,_description);
 BA.debugLineNum = 796;BA.debugLine="ret.Size = Size";
Debug.ShouldStop(134217728);
_ret.setField ("Size" /*RemoteObject*/ ,_size);
 BA.debugLineNum = 797;BA.debugLine="ret.HavePhone = HavePhone";
Debug.ShouldStop(268435456);
_ret.setField ("HavePhone" /*RemoteObject*/ ,_havephone);
 BA.debugLineNum = 798;BA.debugLine="Return ret";
Debug.ShouldStop(536870912);
if (true) return _ret;
 BA.debugLineNum = 799;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedownupfile(RemoteObject _ba,RemoteObject _filename,RemoteObject _filetype,RemoteObject _filedatetime) throws Exception{
try {
		Debug.PushSubsStack("MakeDownUpFile (types) ","types",61,_ba,types.mostCurrent,686);
if (RapidSub.canDelegate("makedownupfile")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makedownupfile", _ba, _filename, _filetype, _filedatetime);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._downupfile");
;
Debug.locals.put("Filename", _filename);
Debug.locals.put("FileType", _filetype);
Debug.locals.put("FileDateTime", _filedatetime);
 BA.debugLineNum = 686;BA.debugLine="Sub MakeDownUpFile(Filename As String, FileType As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 687;BA.debugLine="Dim ret As DownUpFile";
Debug.ShouldStop(16384);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._downupfile");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 688;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 689;BA.debugLine="ret.Filename = Filename";
Debug.ShouldStop(65536);
_ret.setField ("Filename" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 690;BA.debugLine="ret.FileType = FileType";
Debug.ShouldStop(131072);
_ret.setField ("FileType" /*RemoteObject*/ ,_filetype);
 BA.debugLineNum = 691;BA.debugLine="ret.FileDateTime = FileDateTime";
Debug.ShouldStop(262144);
_ret.setField ("FileDateTime" /*RemoteObject*/ ,_filedatetime);
 BA.debugLineNum = 692;BA.debugLine="Return ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeentityfilter(RemoteObject _ba,RemoteObject _typeentity,RemoteObject _status,RemoteObject _region,RemoteObject _local,RemoteObject _name,RemoteObject _address,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("MakeEntityFilter (types) ","types",61,_ba,types.mostCurrent,1111);
if (RapidSub.canDelegate("makeentityfilter")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeentityfilter", _ba, _typeentity, _status, _region, _local, _name, _address, _request);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._entityfilter");
;
Debug.locals.put("TypeEntity", _typeentity);
Debug.locals.put("Status", _status);
Debug.locals.put("Region", _region);
Debug.locals.put("Local", _local);
Debug.locals.put("Name", _name);
Debug.locals.put("Address", _address);
Debug.locals.put("request", _request);
 BA.debugLineNum = 1111;BA.debugLine="Sub MakeEntityFilter(TypeEntity As Int, Status As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1112;BA.debugLine="Dim ret As EntityFilter";
Debug.ShouldStop(8388608);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._entityfilter");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1113;BA.debugLine="ret.Initialize";
Debug.ShouldStop(16777216);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1114;BA.debugLine="ret.TypeEntity = TypeEntity";
Debug.ShouldStop(33554432);
_ret.setField ("TypeEntity" /*RemoteObject*/ ,_typeentity);
 BA.debugLineNum = 1115;BA.debugLine="ret.Status = Status";
Debug.ShouldStop(67108864);
_ret.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 1116;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(134217728);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 1117;BA.debugLine="ret.Region = Region";
Debug.ShouldStop(268435456);
_ret.setField ("Region" /*RemoteObject*/ ,_region);
 BA.debugLineNum = 1118;BA.debugLine="ret.Local = Local";
Debug.ShouldStop(536870912);
_ret.setField ("Local" /*RemoteObject*/ ,_local);
 BA.debugLineNum = 1119;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(1073741824);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 1120;BA.debugLine="ret.Address = Address";
Debug.ShouldStop(-2147483648);
_ret.setField ("Address" /*RemoteObject*/ ,_address);
 BA.debugLineNum = 1121;BA.debugLine="ret.Request = request";
Debug.ShouldStop(1);
_ret.setField ("request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 1122;BA.debugLine="Return ret";
Debug.ShouldStop(2);
if (true) return _ret;
 BA.debugLineNum = 1123;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeentityinformation(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _enttype,RemoteObject _entname,RemoteObject _entaddress,RemoteObject _entaddress2,RemoteObject _entcpostal,RemoteObject _entcity,RemoteObject _entctnphone,RemoteObject _entctnname,RemoteObject _entlatitude,RemoteObject _entlongitude,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("MakeEntityInformation (types) ","types",61,_ba,types.mostCurrent,1038);
if (RapidSub.canDelegate("makeentityinformation")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeentityinformation", _ba, _tagcode, _enttype, _entname, _entaddress, _entaddress2, _entcpostal, _entcity, _entctnphone, _entctnname, _entlatitude, _entlongitude, _asnew);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._entityinformation");
;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("entType", _enttype);
Debug.locals.put("entName", _entname);
Debug.locals.put("entAddress", _entaddress);
Debug.locals.put("entAddress2", _entaddress2);
Debug.locals.put("entCpostal", _entcpostal);
Debug.locals.put("entCity", _entcity);
Debug.locals.put("entCtnPhone", _entctnphone);
Debug.locals.put("entCtnName", _entctnname);
Debug.locals.put("entLatitude", _entlatitude);
Debug.locals.put("entLongitude", _entlongitude);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1038;BA.debugLine="Sub MakeEntityInformation(tagcode As String, entTy";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1040;BA.debugLine="Dim ret As EntityInformation";
Debug.ShouldStop(32768);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._entityinformation");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1041;BA.debugLine="ret.Initialize";
Debug.ShouldStop(65536);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1042;BA.debugLine="ret.tagcode = tagcode";
Debug.ShouldStop(131072);
_ret.setField ("tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1043;BA.debugLine="ret.entType = entType";
Debug.ShouldStop(262144);
_ret.setField ("entType" /*RemoteObject*/ ,_enttype);
 BA.debugLineNum = 1044;BA.debugLine="ret.entName = entName";
Debug.ShouldStop(524288);
_ret.setField ("entName" /*RemoteObject*/ ,_entname);
 BA.debugLineNum = 1045;BA.debugLine="ret.entAddress = entAddress";
Debug.ShouldStop(1048576);
_ret.setField ("entAddress" /*RemoteObject*/ ,_entaddress);
 BA.debugLineNum = 1046;BA.debugLine="ret.entAddress2 = entAddress2";
Debug.ShouldStop(2097152);
_ret.setField ("entAddress2" /*RemoteObject*/ ,_entaddress2);
 BA.debugLineNum = 1047;BA.debugLine="ret.entCpostal = entCpostal";
Debug.ShouldStop(4194304);
_ret.setField ("entCpostal" /*RemoteObject*/ ,_entcpostal);
 BA.debugLineNum = 1048;BA.debugLine="ret.entCity = entCity";
Debug.ShouldStop(8388608);
_ret.setField ("entCity" /*RemoteObject*/ ,_entcity);
 BA.debugLineNum = 1049;BA.debugLine="ret.entCtnPhone = entCtnPhone";
Debug.ShouldStop(16777216);
_ret.setField ("entCtnPhone" /*RemoteObject*/ ,_entctnphone);
 BA.debugLineNum = 1050;BA.debugLine="ret.entCtnName = entCtnName";
Debug.ShouldStop(33554432);
_ret.setField ("entCtnName" /*RemoteObject*/ ,_entctnname);
 BA.debugLineNum = 1051;BA.debugLine="ret.entLatitude = entLatitude";
Debug.ShouldStop(67108864);
_ret.setField ("entLatitude" /*RemoteObject*/ ,_entlatitude);
 BA.debugLineNum = 1052;BA.debugLine="ret.entLongitude = entLongitude";
Debug.ShouldStop(134217728);
_ret.setField ("entLongitude" /*RemoteObject*/ ,_entlongitude);
 BA.debugLineNum = 1053;BA.debugLine="ret.asNew = asNew";
Debug.ShouldStop(268435456);
_ret.setField ("asNew" /*RemoteObject*/ ,_asnew);
 BA.debugLineNum = 1054;BA.debugLine="Return ret";
Debug.ShouldStop(536870912);
if (true) return _ret;
 BA.debugLineNum = 1055;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeexternaldocsinfo(RemoteObject _ba,RemoteObject _status,RemoteObject _refdoc,RemoteObject _refnumber,RemoteObject _typedoc,RemoteObject _externalid) throws Exception{
try {
		Debug.PushSubsStack("MakeExternalDocsInfo (types) ","types",61,_ba,types.mostCurrent,353);
if (RapidSub.canDelegate("makeexternaldocsinfo")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeexternaldocsinfo", _ba, _status, _refdoc, _refnumber, _typedoc, _externalid);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._externaldocsinfo");
;
Debug.locals.put("status", _status);
Debug.locals.put("refdoc", _refdoc);
Debug.locals.put("refnumber", _refnumber);
Debug.locals.put("typeDoc", _typedoc);
Debug.locals.put("externalID", _externalid);
 BA.debugLineNum = 353;BA.debugLine="Sub MakeExternalDocsInfo(status As Int, refdoc As";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="Dim ret As ExternalDocsInfo";
Debug.ShouldStop(2);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._externaldocsinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 355;BA.debugLine="ret.Initialize";
Debug.ShouldStop(4);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 356;BA.debugLine="ret.status = status";
Debug.ShouldStop(8);
_ret.setField ("status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 357;BA.debugLine="ret.refdoc = refdoc";
Debug.ShouldStop(16);
_ret.setField ("refdoc" /*RemoteObject*/ ,_refdoc);
 BA.debugLineNum = 358;BA.debugLine="ret.refnumber = refnumber";
Debug.ShouldStop(32);
_ret.setField ("refnumber" /*RemoteObject*/ ,_refnumber);
 BA.debugLineNum = 359;BA.debugLine="ret.typeDoc = typeDoc";
Debug.ShouldStop(64);
_ret.setField ("typeDoc" /*RemoteObject*/ ,_typedoc);
 BA.debugLineNum = 360;BA.debugLine="ret.externalID = externalID";
Debug.ShouldStop(128);
_ret.setField ("externalID" /*RemoteObject*/ ,_externalid);
 BA.debugLineNum = 361;BA.debugLine="Return ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeextrainfo(RemoteObject _ba,RemoteObject _titleinfo,RemoteObject _txtinfo,RemoteObject _itc,RemoteObject _rc,RemoteObject _ric,RemoteObject _rfc) throws Exception{
try {
		Debug.PushSubsStack("MakeExtraInfo (types) ","types",61,_ba,types.mostCurrent,1323);
if (RapidSub.canDelegate("makeextrainfo")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeextrainfo", _ba, _titleinfo, _txtinfo, _itc, _rc, _ric, _rfc);}
RemoteObject _exinfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._extrainfo");
;
Debug.locals.put("TitleInfo", _titleinfo);
Debug.locals.put("TxtInfo", _txtinfo);
Debug.locals.put("ITC", _itc);
Debug.locals.put("rc", _rc);
Debug.locals.put("ric", _ric);
Debug.locals.put("rfc", _rfc);
 BA.debugLineNum = 1323;BA.debugLine="Sub MakeExtraInfo(TitleInfo As String, TxtInfo As";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1324;BA.debugLine="Private eXInfo As ExtraInfo";
Debug.ShouldStop(2048);
_exinfo = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._extrainfo");Debug.locals.put("eXInfo", _exinfo);
 BA.debugLineNum = 1325;BA.debugLine="eXInfo.Initialize";
Debug.ShouldStop(4096);
_exinfo.runVoidMethod ("Initialize");
 BA.debugLineNum = 1326;BA.debugLine="eXInfo.titleinfo = TitleInfo";
Debug.ShouldStop(8192);
_exinfo.setField ("titleinfo" /*RemoteObject*/ ,_titleinfo);
 BA.debugLineNum = 1327;BA.debugLine="eXInfo.textoInfo = TxtInfo";
Debug.ShouldStop(16384);
_exinfo.setField ("textoInfo" /*RemoteObject*/ ,_txtinfo);
 BA.debugLineNum = 1328;BA.debugLine="eXInfo.item_tagcode = ITC";
Debug.ShouldStop(32768);
_exinfo.setField ("item_tagcode" /*RemoteObject*/ ,_itc);
 BA.debugLineNum = 1329;BA.debugLine="eXInfo.rc = rc";
Debug.ShouldStop(65536);
_exinfo.setField ("rc" /*RemoteObject*/ ,_rc);
 BA.debugLineNum = 1330;BA.debugLine="eXInfo.ric = ric";
Debug.ShouldStop(131072);
_exinfo.setField ("ric" /*RemoteObject*/ ,_ric);
 BA.debugLineNum = 1331;BA.debugLine="eXInfo.rfc = rfc";
Debug.ShouldStop(262144);
_exinfo.setField ("rfc" /*RemoteObject*/ ,_rfc);
 BA.debugLineNum = 1332;BA.debugLine="Return eXInfo";
Debug.ShouldStop(524288);
if (true) return _exinfo;
 BA.debugLineNum = 1333;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makefieldreference(RemoteObject _ba,RemoteObject _tagname,RemoteObject _tagobject,RemoteObject _fieldcounter) throws Exception{
try {
		Debug.PushSubsStack("MakeFieldReference (types) ","types",61,_ba,types.mostCurrent,344);
if (RapidSub.canDelegate("makefieldreference")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makefieldreference", _ba, _tagname, _tagobject, _fieldcounter);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._fieldreference");
;
Debug.locals.put("tagname", _tagname);
Debug.locals.put("tagobject", _tagobject);
Debug.locals.put("FieldCounter", _fieldcounter);
 BA.debugLineNum = 344;BA.debugLine="Sub MakeFieldReference(tagname As String, tagobjec";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="Dim ret As FieldReference";
Debug.ShouldStop(16777216);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._fieldreference");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 346;BA.debugLine="ret.Initialize";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 347;BA.debugLine="ret.tagname = tagname";
Debug.ShouldStop(67108864);
_ret.setField ("tagname" /*RemoteObject*/ ,_tagname);
 BA.debugLineNum = 348;BA.debugLine="ret.tagobject = tagobject";
Debug.ShouldStop(134217728);
_ret.setField ("tagobject" /*RemoteObject*/ ,_tagobject);
 BA.debugLineNum = 349;BA.debugLine="ret.FieldCounter = FieldCounter";
Debug.ShouldStop(268435456);
_ret.setField ("FieldCounter" /*RemoteObject*/ ,_fieldcounter);
 BA.debugLineNum = 350;BA.debugLine="Return ret";
Debug.ShouldStop(536870912);
if (true) return _ret;
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makefiledownloadinformation(RemoteObject _ba,RemoteObject _downloaded,RemoteObject _downloadfilename,RemoteObject _status) throws Exception{
try {
		Debug.PushSubsStack("MakeFileDownloadInformation (types) ","types",61,_ba,types.mostCurrent,241);
if (RapidSub.canDelegate("makefiledownloadinformation")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makefiledownloadinformation", _ba, _downloaded, _downloadfilename, _status);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._filedownloadinformation");
;
Debug.locals.put("Downloaded", _downloaded);
Debug.locals.put("DownloadFilename", _downloadfilename);
Debug.locals.put("Status", _status);
 BA.debugLineNum = 241;BA.debugLine="Sub MakeFileDownloadInformation(Downloaded As Bool";
Debug.ShouldStop(65536);
 BA.debugLineNum = 242;BA.debugLine="Dim res As FileDownloadInformation";
Debug.ShouldStop(131072);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._filedownloadinformation");Debug.locals.put("res", _res);
 BA.debugLineNum = 243;BA.debugLine="res.initialize";
Debug.ShouldStop(262144);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 244;BA.debugLine="res.Downloaded = Downloaded";
Debug.ShouldStop(524288);
_res.setField ("Downloaded" /*RemoteObject*/ ,_downloaded);
 BA.debugLineNum = 245;BA.debugLine="res.DownloadFilename = DownloadFilename";
Debug.ShouldStop(1048576);
_res.setField ("DownloadFilename" /*RemoteObject*/ ,_downloadfilename);
 BA.debugLineNum = 246;BA.debugLine="res.Status = Status";
Debug.ShouldStop(2097152);
_res.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 247;BA.debugLine="Return res";
Debug.ShouldStop(4194304);
if (true) return _res;
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makefiledownloadinformationclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeFileDownloadInformationClear (types) ","types",61,_ba,types.mostCurrent,250);
if (RapidSub.canDelegate("makefiledownloadinformationclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makefiledownloadinformationclear", _ba);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._filedownloadinformation");
;
 BA.debugLineNum = 250;BA.debugLine="Sub MakeFileDownloadInformationClear As FileDownlo";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim res As FileDownloadInformation";
Debug.ShouldStop(67108864);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._filedownloadinformation");Debug.locals.put("res", _res);
 BA.debugLineNum = 252;BA.debugLine="res.initialize";
Debug.ShouldStop(134217728);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 253;BA.debugLine="res.Downloaded = False";
Debug.ShouldStop(268435456);
_res.setField ("Downloaded" /*RemoteObject*/ ,types.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 254;BA.debugLine="res.DownloadFilename = \"\"";
Debug.ShouldStop(536870912);
_res.setField ("DownloadFilename" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 255;BA.debugLine="res.Status = 0";
Debug.ShouldStop(1073741824);
_res.setField ("Status" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 256;BA.debugLine="Return res";
Debug.ShouldStop(-2147483648);
if (true) return _res;
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makefileshot(RemoteObject _ba,RemoteObject _folder,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("MakeFileShot (types) ","types",61,_ba,types.mostCurrent,755);
if (RapidSub.canDelegate("makefileshot")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makefileshot", _ba, _folder, _filename);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._fileshot");
;
Debug.locals.put("Folder", _folder);
Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 755;BA.debugLine="Sub MakeFileShot(Folder As String, Filename As Str";
Debug.ShouldStop(262144);
 BA.debugLineNum = 756;BA.debugLine="Dim ret As FileShot";
Debug.ShouldStop(524288);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._fileshot");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 757;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1048576);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 758;BA.debugLine="ret.Folder = Folder";
Debug.ShouldStop(2097152);
_ret.setField ("Folder" /*RemoteObject*/ ,_folder);
 BA.debugLineNum = 759;BA.debugLine="ret.Filename = Filename";
Debug.ShouldStop(4194304);
_ret.setField ("Filename" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 760;BA.debugLine="Return ret";
Debug.ShouldStop(8388608);
if (true) return _ret;
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makegeoreference(RemoteObject _ba,RemoteObject _latitude,RemoteObject _longitude,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("MakeGeoReference (types) ","types",61,_ba,types.mostCurrent,1102);
if (RapidSub.canDelegate("makegeoreference")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makegeoreference", _ba, _latitude, _longitude, _asnew);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._georeference");
;
Debug.locals.put("Latitude", _latitude);
Debug.locals.put("Longitude", _longitude);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1102;BA.debugLine="Sub MakeGeoReference(Latitude As String, Longitude";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1103;BA.debugLine="Dim ret As GeoReference";
Debug.ShouldStop(16384);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._georeference");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1104;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1105;BA.debugLine="ret.Latitude = Latitude";
Debug.ShouldStop(65536);
_ret.setField ("Latitude" /*RemoteObject*/ ,_latitude);
 BA.debugLineNum = 1106;BA.debugLine="ret.Longitude = Longitude";
Debug.ShouldStop(131072);
_ret.setField ("Longitude" /*RemoteObject*/ ,_longitude);
 BA.debugLineNum = 1107;BA.debugLine="ret.asNew = asNew";
Debug.ShouldStop(262144);
_ret.setField ("asNew" /*RemoteObject*/ ,_asnew);
 BA.debugLineNum = 1108;BA.debugLine="Return ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 1109;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeimageviewdata(RemoteObject _ba,RemoteObject _b64,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("MakeImageViewData (types) ","types",61,_ba,types.mostCurrent,695);
if (RapidSub.canDelegate("makeimageviewdata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeimageviewdata", _ba, _b64, _filename);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
;
Debug.locals.put("b64", _b64);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 695;BA.debugLine="Sub MakeImageViewData(b64 As String, filename As S";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 696;BA.debugLine="Dim ret As ImageViewData";
Debug.ShouldStop(8388608);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._imageviewdata");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 697;BA.debugLine="ret.Initialize";
Debug.ShouldStop(16777216);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 698;BA.debugLine="ret.b64 = b64";
Debug.ShouldStop(33554432);
_ret.setField ("b64" /*RemoteObject*/ ,_b64);
 BA.debugLineNum = 699;BA.debugLine="ret.filename = filename";
Debug.ShouldStop(67108864);
_ret.setField ("filename" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 700;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 701;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeimageviewdataclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeImageViewDataClear (types) ","types",61,_ba,types.mostCurrent,703);
if (RapidSub.canDelegate("makeimageviewdataclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeimageviewdataclear", _ba);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._imageviewdata");
;
 BA.debugLineNum = 703;BA.debugLine="Sub MakeImageViewDataClear As ImageViewData";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 704;BA.debugLine="Dim ret As ImageViewData";
Debug.ShouldStop(-2147483648);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._imageviewdata");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 705;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 706;BA.debugLine="ret.b64 = \"\"";
Debug.ShouldStop(2);
_ret.setField ("b64" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 707;BA.debugLine="ret.filename = \"\"";
Debug.ShouldStop(4);
_ret.setField ("filename" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 708;BA.debugLine="Return ret";
Debug.ShouldStop(8);
if (true) return _ret;
 BA.debugLineNum = 709;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeinterv(RemoteObject _ba,RemoteObject _id,RemoteObject _code,RemoteObject _status,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("MakeInterv (types) ","types",61,_ba,types.mostCurrent,1193);
if (RapidSub.canDelegate("makeinterv")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeinterv", _ba, _id, _code, _status, _color);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._intervention");
;
Debug.locals.put("id", _id);
Debug.locals.put("code", _code);
Debug.locals.put("status", _status);
Debug.locals.put("color", _color);
 BA.debugLineNum = 1193;BA.debugLine="Sub MakeInterv(id As Int, code As String, status A";
Debug.ShouldStop(256);
 BA.debugLineNum = 1194;BA.debugLine="Dim ret As Intervention";
Debug.ShouldStop(512);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._intervention");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1195;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1024);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1196;BA.debugLine="ret.id = id";
Debug.ShouldStop(2048);
_ret.setField ("id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 1197;BA.debugLine="ret.code = code";
Debug.ShouldStop(4096);
_ret.setField ("code" /*RemoteObject*/ ,_code);
 BA.debugLineNum = 1198;BA.debugLine="ret.color = color";
Debug.ShouldStop(8192);
_ret.setField ("color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1199;BA.debugLine="ret.status = status";
Debug.ShouldStop(16384);
_ret.setField ("status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 1200;BA.debugLine="Return ret";
Debug.ShouldStop(32768);
if (true) return _ret;
 BA.debugLineNum = 1201;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makekpifilter(RemoteObject _ba,RemoteObject _period,RemoteObject _sdate,RemoteObject _edate) throws Exception{
try {
		Debug.PushSubsStack("MakeKPIFilter (types) ","types",61,_ba,types.mostCurrent,1170);
if (RapidSub.canDelegate("makekpifilter")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makekpifilter", _ba, _period, _sdate, _edate);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._kpifilter");
;
Debug.locals.put("period", _period);
Debug.locals.put("SDate", _sdate);
Debug.locals.put("EDate", _edate);
 BA.debugLineNum = 1170;BA.debugLine="Sub MakeKPIFilter(period As Int, SDate As String,";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1171;BA.debugLine="Dim ret As KPIFilter";
Debug.ShouldStop(262144);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._kpifilter");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1172;BA.debugLine="ret.Initialize";
Debug.ShouldStop(524288);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1173;BA.debugLine="ret.SDate = SDate";
Debug.ShouldStop(1048576);
_ret.setField ("SDate" /*RemoteObject*/ ,_sdate);
 BA.debugLineNum = 1174;BA.debugLine="ret.EDate = EDate";
Debug.ShouldStop(2097152);
_ret.setField ("EDate" /*RemoteObject*/ ,_edate);
 BA.debugLineNum = 1175;BA.debugLine="ret.period = period";
Debug.ShouldStop(4194304);
_ret.setField ("period" /*RemoteObject*/ ,_period);
 BA.debugLineNum = 1176;BA.debugLine="Return ret";
Debug.ShouldStop(8388608);
if (true) return _ret;
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makemandatoryrecords(RemoteObject _ba,RemoteObject _item_tagcode,RemoteObject _mandatory,RemoteObject _bullet_master,RemoteObject _bullet_child,RemoteObject _enabled,RemoteObject _value_in) throws Exception{
try {
		Debug.PushSubsStack("MakeMandatoryRecords (types) ","types",61,_ba,types.mostCurrent,332);
if (RapidSub.canDelegate("makemandatoryrecords")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makemandatoryrecords", _ba, _item_tagcode, _mandatory, _bullet_master, _bullet_child, _enabled, _value_in);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._mandatoryrecords");
;
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("mandatory", _mandatory);
Debug.locals.put("bullet_master", _bullet_master);
Debug.locals.put("bullet_child", _bullet_child);
Debug.locals.put("Enabled", _enabled);
Debug.locals.put("value_in", _value_in);
 BA.debugLineNum = 332;BA.debugLine="Sub MakeMandatoryRecords(item_tagcode As String, m";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="Dim ret As MandatoryRecords";
Debug.ShouldStop(4096);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._mandatoryrecords");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 334;BA.debugLine="ret.Initialize";
Debug.ShouldStop(8192);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 335;BA.debugLine="ret.item_tagcode = item_tagcode";
Debug.ShouldStop(16384);
_ret.setField ("item_tagcode" /*RemoteObject*/ ,_item_tagcode);
 BA.debugLineNum = 336;BA.debugLine="ret.mandatory = mandatory";
Debug.ShouldStop(32768);
_ret.setField ("mandatory" /*RemoteObject*/ ,_mandatory);
 BA.debugLineNum = 337;BA.debugLine="ret.bullet_master = bullet_master";
Debug.ShouldStop(65536);
_ret.setField ("bullet_master" /*RemoteObject*/ ,_bullet_master);
 BA.debugLineNum = 338;BA.debugLine="ret.bullet_child = bullet_child";
Debug.ShouldStop(131072);
_ret.setField ("bullet_child" /*RemoteObject*/ ,_bullet_child);
 BA.debugLineNum = 339;BA.debugLine="ret.Enabled = Enabled";
Debug.ShouldStop(262144);
_ret.setField ("Enabled" /*RemoteObject*/ ,_enabled);
 BA.debugLineNum = 340;BA.debugLine="ret.value_in = value_in";
Debug.ShouldStop(524288);
_ret.setField ("value_in" /*RemoteObject*/ ,_value_in);
 BA.debugLineNum = 341;BA.debugLine="Return ret";
Debug.ShouldStop(1048576);
if (true) return _ret;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makemarkerinfo(RemoteObject _ba,RemoteObject _latitude,RemoteObject _longitude,RemoteObject _markerpoint) throws Exception{
try {
		Debug.PushSubsStack("MAkeMarkerInfo (types) ","types",61,_ba,types.mostCurrent,387);
if (RapidSub.canDelegate("makemarkerinfo")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makemarkerinfo", _ba, _latitude, _longitude, _markerpoint);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._markerinfo");
;
Debug.locals.put("Latitude", _latitude);
Debug.locals.put("Longitude", _longitude);
Debug.locals.put("MarkerPoint", _markerpoint);
 BA.debugLineNum = 387;BA.debugLine="Sub MAkeMarkerInfo(Latitude As String, Longitude A";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="Dim ret As MarkerInfo";
Debug.ShouldStop(8);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._markerinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 389;BA.debugLine="ret.Initialize";
Debug.ShouldStop(16);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 390;BA.debugLine="ret.Latitude = Latitude";
Debug.ShouldStop(32);
_ret.setField ("Latitude" /*RemoteObject*/ ,_latitude);
 BA.debugLineNum = 391;BA.debugLine="ret.Longitude = Longitude";
Debug.ShouldStop(64);
_ret.setField ("Longitude" /*RemoteObject*/ ,_longitude);
 BA.debugLineNum = 392;BA.debugLine="ret.MarkerPoint = MarkerPoint";
Debug.ShouldStop(128);
_ret.setField ("MarkerPoint" /*RemoteObject*/ ,_markerpoint);
 BA.debugLineNum = 393;BA.debugLine="Return ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makemnowtu(RemoteObject _ba,RemoteObject _make_new_object,RemoteObject _upd_existing_object,RemoteObject _where_to_update,RemoteObject _cl_is_father,RemoteObject _requesttypegroup,RemoteObject _objecttagvalue,RemoteObject _object_type,RemoteObject _objecttagrelvalue,RemoteObject _object_type_rel,RemoteObject _realobjectrelationtochange,RemoteObject _realobjecttochange,RemoteObject _resinsert) throws Exception{
try {
		Debug.PushSubsStack("MakeMNOWTU (types) ","types",61,_ba,types.mostCurrent,286);
if (RapidSub.canDelegate("makemnowtu")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makemnowtu", _ba, _make_new_object, _upd_existing_object, _where_to_update, _cl_is_father, _requesttypegroup, _objecttagvalue, _object_type, _objecttagrelvalue, _object_type_rel, _realobjectrelationtochange, _realobjecttochange, _resinsert);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._mnowtu");
;
Debug.locals.put("MAKE_New_Object", _make_new_object);
Debug.locals.put("UPD_Existing_Object", _upd_existing_object);
Debug.locals.put("WHERE_To_Update", _where_to_update);
Debug.locals.put("cl_is_father", _cl_is_father);
Debug.locals.put("RequestTypeGroup", _requesttypegroup);
Debug.locals.put("objectTagValue", _objecttagvalue);
Debug.locals.put("object_type", _object_type);
Debug.locals.put("objectTagRelValue", _objecttagrelvalue);
Debug.locals.put("object_type_rel", _object_type_rel);
Debug.locals.put("RealObjectRelationToChange", _realobjectrelationtochange);
Debug.locals.put("RealObjectToChange", _realobjecttochange);
Debug.locals.put("ResInsert", _resinsert);
 BA.debugLineNum = 286;BA.debugLine="Sub MakeMNOWTU( MAKE_New_Object As Int, UPD_Existi";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 290;BA.debugLine="Dim ret As MNOWTU";
Debug.ShouldStop(2);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._mnowtu");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 291;BA.debugLine="ret.Initialize";
Debug.ShouldStop(4);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 292;BA.debugLine="ret.MAKE_New_Object = MAKE_New_Object";
Debug.ShouldStop(8);
_ret.setField ("MAKE_New_Object" /*RemoteObject*/ ,_make_new_object);
 BA.debugLineNum = 293;BA.debugLine="ret.UPD_Existing_Object = UPD_Existing_Object";
Debug.ShouldStop(16);
_ret.setField ("UPD_Existing_Object" /*RemoteObject*/ ,_upd_existing_object);
 BA.debugLineNum = 294;BA.debugLine="ret.WHERE_To_Update = WHERE_To_Update";
Debug.ShouldStop(32);
_ret.setField ("WHERE_To_Update" /*RemoteObject*/ ,_where_to_update);
 BA.debugLineNum = 295;BA.debugLine="ret.cl_is_father = cl_is_father";
Debug.ShouldStop(64);
_ret.setField ("cl_is_father" /*RemoteObject*/ ,_cl_is_father);
 BA.debugLineNum = 296;BA.debugLine="ret.RequestTypeGroup = RequestTypeGroup";
Debug.ShouldStop(128);
_ret.setField ("RequestTypeGroup" /*RemoteObject*/ ,_requesttypegroup);
 BA.debugLineNum = 297;BA.debugLine="ret.objectTagValue = objectTagValue";
Debug.ShouldStop(256);
_ret.setField ("objectTagValue" /*RemoteObject*/ ,_objecttagvalue);
 BA.debugLineNum = 298;BA.debugLine="ret.object_type = object_type";
Debug.ShouldStop(512);
_ret.setField ("object_type" /*RemoteObject*/ ,_object_type);
 BA.debugLineNum = 299;BA.debugLine="ret.objectTagRelValue = objectTagRelValue";
Debug.ShouldStop(1024);
_ret.setField ("objectTagRelValue" /*RemoteObject*/ ,_objecttagrelvalue);
 BA.debugLineNum = 300;BA.debugLine="ret.object_type_rel = object_type_rel";
Debug.ShouldStop(2048);
_ret.setField ("object_type_rel" /*RemoteObject*/ ,_object_type_rel);
 BA.debugLineNum = 301;BA.debugLine="ret.RealObjectRelationToChange = RealObjectRelati";
Debug.ShouldStop(4096);
_ret.setField ("RealObjectRelationToChange" /*RemoteObject*/ ,_realobjectrelationtochange);
 BA.debugLineNum = 302;BA.debugLine="ret.RealObjectToChange = RealObjectToChange";
Debug.ShouldStop(8192);
_ret.setField ("RealObjectToChange" /*RemoteObject*/ ,_realobjecttochange);
 BA.debugLineNum = 303;BA.debugLine="ret.ResInsert = ResInsert";
Debug.ShouldStop(16384);
_ret.setField ("ResInsert" /*RemoteObject*/ ,_resinsert);
 BA.debugLineNum = 304;BA.debugLine="Return ret";
Debug.ShouldStop(32768);
if (true) return _ret;
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makenewobjecttags(RemoteObject _ba,RemoteObject _objecttag,RemoteObject _addresstag,RemoteObject _contacttag,RemoteObject _fieldstag) throws Exception{
try {
		Debug.PushSubsStack("MakeNewObjectTags (types) ","types",61,_ba,types.mostCurrent,364);
if (RapidSub.canDelegate("makenewobjecttags")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makenewobjecttags", _ba, _objecttag, _addresstag, _contacttag, _fieldstag);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._newobjecttags");
;
Debug.locals.put("ObjectTag", _objecttag);
Debug.locals.put("AddressTag", _addresstag);
Debug.locals.put("ContactTag", _contacttag);
Debug.locals.put("FieldsTag", _fieldstag);
 BA.debugLineNum = 364;BA.debugLine="Sub MakeNewObjectTags(ObjectTag As String, Address";
Debug.ShouldStop(2048);
 BA.debugLineNum = 365;BA.debugLine="Dim ret As NewObjectTags";
Debug.ShouldStop(4096);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._newobjecttags");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 366;BA.debugLine="ret.Initialize";
Debug.ShouldStop(8192);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="ret.ObjectTag = ObjectTag";
Debug.ShouldStop(16384);
_ret.setField ("ObjectTag" /*RemoteObject*/ ,_objecttag);
 BA.debugLineNum = 368;BA.debugLine="ret.AddressTag = AddressTag";
Debug.ShouldStop(32768);
_ret.setField ("AddressTag" /*RemoteObject*/ ,_addresstag);
 BA.debugLineNum = 369;BA.debugLine="ret.ContactTag = ContactTag";
Debug.ShouldStop(65536);
_ret.setField ("ContactTag" /*RemoteObject*/ ,_contacttag);
 BA.debugLineNum = 370;BA.debugLine="If Not(FieldsTag.IsInitialized) Then";
Debug.ShouldStop(131072);
if (types.mostCurrent.__c.runMethod(true,"Not",(Object)(_fieldstag.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 371;BA.debugLine="FieldsTag.Initialize";
Debug.ShouldStop(262144);
_fieldstag.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 373;BA.debugLine="ret.FieldsTag = FieldsTag";
Debug.ShouldStop(1048576);
_ret.setField ("FieldsTag" /*RemoteObject*/ ,_fieldstag);
 BA.debugLineNum = 374;BA.debugLine="Return ret";
Debug.ShouldStop(2097152);
if (true) return _ret;
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makenewobjecttagsclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeNewObjectTagsClear (types) ","types",61,_ba,types.mostCurrent,377);
if (RapidSub.canDelegate("makenewobjecttagsclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makenewobjecttagsclear", _ba);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._newobjecttags");
;
 BA.debugLineNum = 377;BA.debugLine="Sub MakeNewObjectTagsClear As NewObjectTags";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 378;BA.debugLine="Dim ret As NewObjectTags";
Debug.ShouldStop(33554432);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._newobjecttags");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 379;BA.debugLine="ret.Initialize";
Debug.ShouldStop(67108864);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 380;BA.debugLine="ret.ObjectTag = \"\"";
Debug.ShouldStop(134217728);
_ret.setField ("ObjectTag" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 381;BA.debugLine="ret.AddressTag = \"\"";
Debug.ShouldStop(268435456);
_ret.setField ("AddressTag" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 382;BA.debugLine="ret.ContactTag = \"\"";
Debug.ShouldStop(536870912);
_ret.setField ("ContactTag" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 383;BA.debugLine="ret.FieldsTag.Initialize";
Debug.ShouldStop(1073741824);
_ret.getField(false,"FieldsTag" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 384;BA.debugLine="Return ret";
Debug.ShouldStop(-2147483648);
if (true) return _ret;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeobjectfilter(RemoteObject _ba,RemoteObject _typeobject,RemoteObject _zoneobject,RemoteObject _status,RemoteObject _region,RemoteObject _local,RemoteObject _name,RemoteObject _address,RemoteObject _request) throws Exception{
try {
		Debug.PushSubsStack("MakeObjectFilter (types) ","types",61,_ba,types.mostCurrent,1125);
if (RapidSub.canDelegate("makeobjectfilter")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeobjectfilter", _ba, _typeobject, _zoneobject, _status, _region, _local, _name, _address, _request);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectfilter");
;
Debug.locals.put("TypeObject", _typeobject);
Debug.locals.put("ZoneObject", _zoneobject);
Debug.locals.put("Status", _status);
Debug.locals.put("Region", _region);
Debug.locals.put("Local", _local);
Debug.locals.put("Name", _name);
Debug.locals.put("Address", _address);
Debug.locals.put("request", _request);
 BA.debugLineNum = 1125;BA.debugLine="Sub MakeObjectFilter(TypeObject As Int, ZoneObject";
Debug.ShouldStop(16);
 BA.debugLineNum = 1126;BA.debugLine="Dim ret As ObjectFilter";
Debug.ShouldStop(32);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._objectfilter");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1127;BA.debugLine="ret.Initialize";
Debug.ShouldStop(64);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1128;BA.debugLine="ret.TypeObject = TypeObject";
Debug.ShouldStop(128);
_ret.setField ("TypeObject" /*RemoteObject*/ ,_typeobject);
 BA.debugLineNum = 1129;BA.debugLine="ret.ZoneObject = ZoneObject";
Debug.ShouldStop(256);
_ret.setField ("ZoneObject" /*RemoteObject*/ ,_zoneobject);
 BA.debugLineNum = 1130;BA.debugLine="ret.Status = Status";
Debug.ShouldStop(512);
_ret.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 1131;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(1024);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 1132;BA.debugLine="ret.Region = Region";
Debug.ShouldStop(2048);
_ret.setField ("Region" /*RemoteObject*/ ,_region);
 BA.debugLineNum = 1133;BA.debugLine="ret.Local = Local";
Debug.ShouldStop(4096);
_ret.setField ("Local" /*RemoteObject*/ ,_local);
 BA.debugLineNum = 1134;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(8192);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 1135;BA.debugLine="ret.Address = Address";
Debug.ShouldStop(16384);
_ret.setField ("Address" /*RemoteObject*/ ,_address);
 BA.debugLineNum = 1136;BA.debugLine="ret.Request = request";
Debug.ShouldStop(32768);
_ret.setField ("Request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 1137;BA.debugLine="Return ret";
Debug.ShouldStop(65536);
if (true) return _ret;
 BA.debugLineNum = 1138;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeobjectinformation(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _itype,RemoteObject _name,RemoteObject _address,RemoteObject _address2,RemoteObject _cpostal,RemoteObject _city,RemoteObject _ctnphone,RemoteObject _ctnname,RemoteObject _latitude,RemoteObject _longitude,RemoteObject _asnew) throws Exception{
try {
		Debug.PushSubsStack("MakeObjectInformation (types) ","types",61,_ba,types.mostCurrent,1019);
if (RapidSub.canDelegate("makeobjectinformation")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeobjectinformation", _ba, _tagcode, _itype, _name, _address, _address2, _cpostal, _city, _ctnphone, _ctnname, _latitude, _longitude, _asnew);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectinformation");
;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("iType", _itype);
Debug.locals.put("Name", _name);
Debug.locals.put("Address", _address);
Debug.locals.put("Address2", _address2);
Debug.locals.put("Cpostal", _cpostal);
Debug.locals.put("City", _city);
Debug.locals.put("CtnPhone", _ctnphone);
Debug.locals.put("CtnName", _ctnname);
Debug.locals.put("Latitude", _latitude);
Debug.locals.put("Longitude", _longitude);
Debug.locals.put("asNew", _asnew);
 BA.debugLineNum = 1019;BA.debugLine="Sub MakeObjectInformation(tagcode As String, iType";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1021;BA.debugLine="Dim ret As ObjectInformation";
Debug.ShouldStop(268435456);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._objectinformation");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1022;BA.debugLine="ret.Initialize";
Debug.ShouldStop(536870912);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1023;BA.debugLine="ret.tagcode = tagcode";
Debug.ShouldStop(1073741824);
_ret.setField ("tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 1024;BA.debugLine="ret.iType = iType";
Debug.ShouldStop(-2147483648);
_ret.setField ("iType" /*RemoteObject*/ ,_itype);
 BA.debugLineNum = 1025;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(1);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 1026;BA.debugLine="ret.Address = Address";
Debug.ShouldStop(2);
_ret.setField ("Address" /*RemoteObject*/ ,_address);
 BA.debugLineNum = 1027;BA.debugLine="ret.Address2 = Address2";
Debug.ShouldStop(4);
_ret.setField ("Address2" /*RemoteObject*/ ,_address2);
 BA.debugLineNum = 1028;BA.debugLine="ret.Cpostal = Cpostal";
Debug.ShouldStop(8);
_ret.setField ("Cpostal" /*RemoteObject*/ ,_cpostal);
 BA.debugLineNum = 1029;BA.debugLine="ret.City = City";
Debug.ShouldStop(16);
_ret.setField ("City" /*RemoteObject*/ ,_city);
 BA.debugLineNum = 1030;BA.debugLine="ret.CtnPhone = CtnPhone";
Debug.ShouldStop(32);
_ret.setField ("CtnPhone" /*RemoteObject*/ ,_ctnphone);
 BA.debugLineNum = 1031;BA.debugLine="ret.CtnName = CtnName";
Debug.ShouldStop(64);
_ret.setField ("CtnName" /*RemoteObject*/ ,_ctnname);
 BA.debugLineNum = 1032;BA.debugLine="ret.Latitude = Latitude";
Debug.ShouldStop(128);
_ret.setField ("Latitude" /*RemoteObject*/ ,_latitude);
 BA.debugLineNum = 1033;BA.debugLine="ret.Longitude = Longitude";
Debug.ShouldStop(256);
_ret.setField ("Longitude" /*RemoteObject*/ ,_longitude);
 BA.debugLineNum = 1034;BA.debugLine="ret.asNew = asNew";
Debug.ShouldStop(512);
_ret.setField ("asNew" /*RemoteObject*/ ,_asnew);
 BA.debugLineNum = 1035;BA.debugLine="Return ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 1036;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeobjecttype(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _title,RemoteObject _color,RemoteObject _have_contracts,RemoteObject _have_warehouse,RemoteObject _have_documents,RemoteObject _isgroup,RemoteObject _doctemplate_id,RemoteObject _doctemplate) throws Exception{
try {
		Debug.PushSubsStack("MakeObjectType (types) ","types",61,_ba,types.mostCurrent,972);
if (RapidSub.canDelegate("makeobjecttype")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeobjecttype", _ba, _tagcode, _title, _color, _have_contracts, _have_warehouse, _have_documents, _isgroup, _doctemplate_id, _doctemplate);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttype");
;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("color", _color);
Debug.locals.put("have_contracts", _have_contracts);
Debug.locals.put("have_warehouse", _have_warehouse);
Debug.locals.put("have_documents", _have_documents);
Debug.locals.put("isgroup", _isgroup);
Debug.locals.put("doctemplate_id", _doctemplate_id);
Debug.locals.put("doctemplate", _doctemplate);
 BA.debugLineNum = 972;BA.debugLine="Sub MakeObjectType(tagcode As String, title As Str";
Debug.ShouldStop(2048);
 BA.debugLineNum = 974;BA.debugLine="Dim ret As ObjectType";
Debug.ShouldStop(8192);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._objecttype");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 975;BA.debugLine="ret.Initialize";
Debug.ShouldStop(16384);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 976;BA.debugLine="ret.tagcode = tagcode";
Debug.ShouldStop(32768);
_ret.setField ("tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 977;BA.debugLine="ret.title = title";
Debug.ShouldStop(65536);
_ret.setField ("title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 978;BA.debugLine="ret.color = color";
Debug.ShouldStop(131072);
_ret.setField ("color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 979;BA.debugLine="ret.have_contracts = have_contracts";
Debug.ShouldStop(262144);
_ret.setField ("have_contracts" /*RemoteObject*/ ,_have_contracts);
 BA.debugLineNum = 980;BA.debugLine="ret.have_warehouse = have_warehouse";
Debug.ShouldStop(524288);
_ret.setField ("have_warehouse" /*RemoteObject*/ ,_have_warehouse);
 BA.debugLineNum = 981;BA.debugLine="ret.have_documents = have_documents";
Debug.ShouldStop(1048576);
_ret.setField ("have_documents" /*RemoteObject*/ ,_have_documents);
 BA.debugLineNum = 982;BA.debugLine="ret.isgroup = isgroup";
Debug.ShouldStop(2097152);
_ret.setField ("isgroup" /*RemoteObject*/ ,_isgroup);
 BA.debugLineNum = 983;BA.debugLine="ret.doctemplate_id = doctemplate_id";
Debug.ShouldStop(4194304);
_ret.setField ("doctemplate_id" /*RemoteObject*/ ,_doctemplate_id);
 BA.debugLineNum = 984;BA.debugLine="ret.doctemplate = doctemplate";
Debug.ShouldStop(8388608);
_ret.setField ("doctemplate" /*RemoteObject*/ ,_doctemplate);
 BA.debugLineNum = 985;BA.debugLine="Return ret";
Debug.ShouldStop(16777216);
if (true) return _ret;
 BA.debugLineNum = 986;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeobjecttypes(RemoteObject _ba,RemoteObject _id,RemoteObject _tagcode,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("MakeObjectTypes (types) ","types",61,_ba,types.mostCurrent,733);
if (RapidSub.canDelegate("makeobjecttypes")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeobjecttypes", _ba, _id, _tagcode, _title);}
RemoteObject _obt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttypes");
;
Debug.locals.put("id", _id);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
 BA.debugLineNum = 733;BA.debugLine="Sub MakeObjectTypes(id As Int, tagcode As String,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 734;BA.debugLine="Dim obt As ObjectTypes";
Debug.ShouldStop(536870912);
_obt = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._objecttypes");Debug.locals.put("obt", _obt);
 BA.debugLineNum = 735;BA.debugLine="obt.Initialize";
Debug.ShouldStop(1073741824);
_obt.runVoidMethod ("Initialize");
 BA.debugLineNum = 736;BA.debugLine="obt.id = id";
Debug.ShouldStop(-2147483648);
_obt.setField ("id" /*RemoteObject*/ ,_id);
 BA.debugLineNum = 737;BA.debugLine="obt.tagcode = tagcode";
Debug.ShouldStop(1);
_obt.setField ("tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 738;BA.debugLine="obt.title = title";
Debug.ShouldStop(2);
_obt.setField ("title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 739;BA.debugLine="Return obt";
Debug.ShouldStop(4);
if (true) return _obt;
 BA.debugLineNum = 740;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeothercla(RemoteObject _ba,RemoteObject _filter,RemoteObject _filter2,RemoteObject _filter3) throws Exception{
try {
		Debug.PushSubsStack("MakeOtherCLA (types) ","types",61,_ba,types.mostCurrent,942);
if (RapidSub.canDelegate("makeothercla")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeothercla", _ba, _filter, _filter2, _filter3);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._othercla");
;
Debug.locals.put("Filter", _filter);
Debug.locals.put("Filter2", _filter2);
Debug.locals.put("Filter3", _filter3);
 BA.debugLineNum = 942;BA.debugLine="Sub MakeOtherCLA(Filter As String, Filter2 As Stri";
Debug.ShouldStop(8192);
 BA.debugLineNum = 943;BA.debugLine="Dim ret As OtherCLA";
Debug.ShouldStop(16384);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._othercla");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 944;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 945;BA.debugLine="ret.Filter = Filter";
Debug.ShouldStop(65536);
_ret.setField ("Filter" /*RemoteObject*/ ,_filter);
 BA.debugLineNum = 946;BA.debugLine="ret.Filter2 = Filter2";
Debug.ShouldStop(131072);
_ret.setField ("Filter2" /*RemoteObject*/ ,_filter2);
 BA.debugLineNum = 947;BA.debugLine="ret.Filter3 = Filter3";
Debug.ShouldStop(262144);
_ret.setField ("Filter3" /*RemoteObject*/ ,_filter3);
 BA.debugLineNum = 948;BA.debugLine="Return ret";
Debug.ShouldStop(524288);
if (true) return _ret;
 BA.debugLineNum = 949;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeotherreturnvalues(RemoteObject _ba,RemoteObject _retvalue,RemoteObject _retsave,RemoteObject _rettag) throws Exception{
try {
		Debug.PushSubsStack("MakeOtherReturnValues (types) ","types",61,_ba,types.mostCurrent,277);
if (RapidSub.canDelegate("makeotherreturnvalues")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeotherreturnvalues", _ba, _retvalue, _retsave, _rettag);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._otherreturnvalues");
;
Debug.locals.put("RetValue", _retvalue);
Debug.locals.put("RetSave", _retsave);
Debug.locals.put("RetTag", _rettag);
 BA.debugLineNum = 277;BA.debugLine="Sub MakeOtherReturnValues(RetValue As String, RetS";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 278;BA.debugLine="Dim res As OtherReturnValues";
Debug.ShouldStop(2097152);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._otherreturnvalues");Debug.locals.put("res", _res);
 BA.debugLineNum = 279;BA.debugLine="res.initialize";
Debug.ShouldStop(4194304);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 280;BA.debugLine="res.RetValue = RetValue";
Debug.ShouldStop(8388608);
_res.setField ("RetValue" /*RemoteObject*/ ,_retvalue);
 BA.debugLineNum = 281;BA.debugLine="res.RetSave = RetSave";
Debug.ShouldStop(16777216);
_res.setField ("RetSave" /*RemoteObject*/ ,_retsave);
 BA.debugLineNum = 282;BA.debugLine="res.RetTag = RetTag";
Debug.ShouldStop(33554432);
_res.setField ("RetTag" /*RemoteObject*/ ,_rettag);
 BA.debugLineNum = 283;BA.debugLine="Return res";
Debug.ShouldStop(67108864);
if (true) return _res;
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makepagea4(RemoteObject _ba,RemoteObject _a4size,RemoteObject _a4margins,RemoteObject _pageheight,RemoteObject _pageheaderheight,RemoteObject _pagefooterheight,RemoteObject _pagefirstheight,RemoteObject _pagelabelheight,RemoteObject _pagelabelspaceheight,RemoteObject _pagelabelboxheight,RemoteObject _pagetextmargins,RemoteObject _pagetextheight,RemoteObject _pageimgrowheight,RemoteObject _imgrowheight,RemoteObject _pagerowheight,RemoteObject _pagetextrowheight,RemoteObject _pageheader,RemoteObject _pagefooter,RemoteObject _pagecontent,RemoteObject _pagesignature,RemoteObject _pageobservations,RemoteObject _pageimages,RemoteObject _pagenonconformities,RemoteObject _pagetemplate,RemoteObject _pagefirst,RemoteObject _pagenext,RemoteObject _pagelast) throws Exception{
try {
		Debug.PushSubsStack("MakePageA4 (types) ","types",61,_ba,types.mostCurrent,596);
if (RapidSub.canDelegate("makepagea4")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makepagea4", _ba, _a4size, _a4margins, _pageheight, _pageheaderheight, _pagefooterheight, _pagefirstheight, _pagelabelheight, _pagelabelspaceheight, _pagelabelboxheight, _pagetextmargins, _pagetextheight, _pageimgrowheight, _imgrowheight, _pagerowheight, _pagetextrowheight, _pageheader, _pagefooter, _pagecontent, _pagesignature, _pageobservations, _pageimages, _pagenonconformities, _pagetemplate, _pagefirst, _pagenext, _pagelast);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._pagea4");
;
Debug.locals.put("A4Size", _a4size);
Debug.locals.put("A4Margins", _a4margins);
Debug.locals.put("PageHeight", _pageheight);
Debug.locals.put("PageHeaderHeight", _pageheaderheight);
Debug.locals.put("PageFooterHeight", _pagefooterheight);
Debug.locals.put("PageFirstHeight", _pagefirstheight);
Debug.locals.put("PageLabelHeight", _pagelabelheight);
Debug.locals.put("PageLabelSpaceHeight", _pagelabelspaceheight);
Debug.locals.put("PageLabelBoxHeight", _pagelabelboxheight);
Debug.locals.put("PageTextMargins", _pagetextmargins);
Debug.locals.put("PageTextHeight", _pagetextheight);
Debug.locals.put("PageImgRowHeight", _pageimgrowheight);
Debug.locals.put("ImgRowHeight", _imgrowheight);
Debug.locals.put("PageRowHeight", _pagerowheight);
Debug.locals.put("PageTextRowHeight", _pagetextrowheight);
Debug.locals.put("PageHeader", _pageheader);
Debug.locals.put("PageFooter", _pagefooter);
Debug.locals.put("PageContent", _pagecontent);
Debug.locals.put("PageSignature", _pagesignature);
Debug.locals.put("PageObservations", _pageobservations);
Debug.locals.put("PageImages", _pageimages);
Debug.locals.put("PageNonConformities", _pagenonconformities);
Debug.locals.put("PageTemplate", _pagetemplate);
Debug.locals.put("PageFirst", _pagefirst);
Debug.locals.put("PageNext", _pagenext);
Debug.locals.put("PageLast", _pagelast);
 BA.debugLineNum = 596;BA.debugLine="Sub MakePageA4(A4Size As Double, A4Margins As Doub";
Debug.ShouldStop(524288);
 BA.debugLineNum = 602;BA.debugLine="Dim ret As PageA4";
Debug.ShouldStop(33554432);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._pagea4");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 603;BA.debugLine="ret.Initialize";
Debug.ShouldStop(67108864);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 604;BA.debugLine="ret.A4Size = A4Size";
Debug.ShouldStop(134217728);
_ret.setField ("A4Size" /*RemoteObject*/ ,_a4size);
 BA.debugLineNum = 605;BA.debugLine="ret.A4Margins = A4Margins";
Debug.ShouldStop(268435456);
_ret.setField ("A4Margins" /*RemoteObject*/ ,_a4margins);
 BA.debugLineNum = 606;BA.debugLine="ret.PageHeight = PageHeight";
Debug.ShouldStop(536870912);
_ret.setField ("PageHeight" /*RemoteObject*/ ,_pageheight);
 BA.debugLineNum = 607;BA.debugLine="ret.PageHeaderHeight = PageHeaderHeight";
Debug.ShouldStop(1073741824);
_ret.setField ("PageHeaderHeight" /*RemoteObject*/ ,_pageheaderheight);
 BA.debugLineNum = 608;BA.debugLine="ret.PageFooterHeight = PageFooterHeight";
Debug.ShouldStop(-2147483648);
_ret.setField ("PageFooterHeight" /*RemoteObject*/ ,_pagefooterheight);
 BA.debugLineNum = 609;BA.debugLine="ret.PageFirstHeight = PageFirstHeight";
Debug.ShouldStop(1);
_ret.setField ("PageFirstHeight" /*RemoteObject*/ ,_pagefirstheight);
 BA.debugLineNum = 610;BA.debugLine="ret.PageLabelHeight = PageLabelHeight";
Debug.ShouldStop(2);
_ret.setField ("PageLabelHeight" /*RemoteObject*/ ,_pagelabelheight);
 BA.debugLineNum = 611;BA.debugLine="ret.PageLabelSpaceHeight = PageLabelSpaceHeight";
Debug.ShouldStop(4);
_ret.setField ("PageLabelSpaceHeight" /*RemoteObject*/ ,_pagelabelspaceheight);
 BA.debugLineNum = 612;BA.debugLine="ret.PageLabelBoxHeight = PageLabelBoxHeight";
Debug.ShouldStop(8);
_ret.setField ("PageLabelBoxHeight" /*RemoteObject*/ ,_pagelabelboxheight);
 BA.debugLineNum = 613;BA.debugLine="ret.PageTextMargins = PageTextMargins";
Debug.ShouldStop(16);
_ret.setField ("PageTextMargins" /*RemoteObject*/ ,_pagetextmargins);
 BA.debugLineNum = 614;BA.debugLine="ret.PageTextHeight = PageTextHeight";
Debug.ShouldStop(32);
_ret.setField ("PageTextHeight" /*RemoteObject*/ ,_pagetextheight);
 BA.debugLineNum = 615;BA.debugLine="ret.PageImgRowHeight = PageImgRowHeight";
Debug.ShouldStop(64);
_ret.setField ("PageImgRowHeight" /*RemoteObject*/ ,_pageimgrowheight);
 BA.debugLineNum = 616;BA.debugLine="ret.ImgRowHeight = ImgRowHeight";
Debug.ShouldStop(128);
_ret.setField ("ImgRowHeight" /*RemoteObject*/ ,_imgrowheight);
 BA.debugLineNum = 617;BA.debugLine="ret.PageRowHeight = PageRowHeight";
Debug.ShouldStop(256);
_ret.setField ("PageRowHeight" /*RemoteObject*/ ,_pagerowheight);
 BA.debugLineNum = 618;BA.debugLine="ret.PageTextRowHeight = PageTextRowHeight";
Debug.ShouldStop(512);
_ret.setField ("PageTextRowHeight" /*RemoteObject*/ ,_pagetextrowheight);
 BA.debugLineNum = 619;BA.debugLine="ret.PageHeader = PageHeader";
Debug.ShouldStop(1024);
_ret.setField ("PageHeader" /*RemoteObject*/ ,_pageheader);
 BA.debugLineNum = 620;BA.debugLine="ret.PageFooter = PageFooter";
Debug.ShouldStop(2048);
_ret.setField ("PageFooter" /*RemoteObject*/ ,_pagefooter);
 BA.debugLineNum = 621;BA.debugLine="ret.PageContent = PageContent";
Debug.ShouldStop(4096);
_ret.setField ("PageContent" /*RemoteObject*/ ,_pagecontent);
 BA.debugLineNum = 622;BA.debugLine="ret.PageSignature = PageSignature";
Debug.ShouldStop(8192);
_ret.setField ("PageSignature" /*RemoteObject*/ ,_pagesignature);
 BA.debugLineNum = 623;BA.debugLine="ret.PageObservations = PageObservations";
Debug.ShouldStop(16384);
_ret.setField ("PageObservations" /*RemoteObject*/ ,_pageobservations);
 BA.debugLineNum = 624;BA.debugLine="ret.PageImages = PageImages";
Debug.ShouldStop(32768);
_ret.setField ("PageImages" /*RemoteObject*/ ,_pageimages);
 BA.debugLineNum = 625;BA.debugLine="ret.PageNonConformities = PageNonConformities";
Debug.ShouldStop(65536);
_ret.setField ("PageNonConformities" /*RemoteObject*/ ,_pagenonconformities);
 BA.debugLineNum = 626;BA.debugLine="ret.PageTemplate = PageTemplate";
Debug.ShouldStop(131072);
_ret.setField ("PageTemplate" /*RemoteObject*/ ,_pagetemplate);
 BA.debugLineNum = 627;BA.debugLine="ret.PageFirst = PageFirst";
Debug.ShouldStop(262144);
_ret.setField ("PageFirst" /*RemoteObject*/ ,_pagefirst);
 BA.debugLineNum = 628;BA.debugLine="ret.PageNext = PageNext";
Debug.ShouldStop(524288);
_ret.setField ("PageNext" /*RemoteObject*/ ,_pagenext);
 BA.debugLineNum = 629;BA.debugLine="ret.PageLast = PageLast";
Debug.ShouldStop(1048576);
_ret.setField ("PageLast" /*RemoteObject*/ ,_pagelast);
 BA.debugLineNum = 630;BA.debugLine="Return ret";
Debug.ShouldStop(2097152);
if (true) return _ret;
 BA.debugLineNum = 631;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makepagedata(RemoteObject _ba,RemoteObject _pagesout,RemoteObject _pagenumber,RemoteObject _pagetotal,RemoteObject _buildpage,RemoteObject _pointcounter,RemoteObject _linecounter,RemoteObject _currtotal,RemoteObject _imagecounter,RemoteObject _draft,RemoteObject _out,RemoteObject _request_obs,RemoteObject _technical) throws Exception{
try {
		Debug.PushSubsStack("MakePageData (types) ","types",61,_ba,types.mostCurrent,633);
if (RapidSub.canDelegate("makepagedata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makepagedata", _ba, _pagesout, _pagenumber, _pagetotal, _buildpage, _pointcounter, _linecounter, _currtotal, _imagecounter, _draft, _out, _request_obs, _technical);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._pagedata");
;
Debug.locals.put("PagesOut", _pagesout);
Debug.locals.put("PageNumber", _pagenumber);
Debug.locals.put("PageTotal", _pagetotal);
Debug.locals.put("BuildPage", _buildpage);
Debug.locals.put("PointCounter", _pointcounter);
Debug.locals.put("LineCounter", _linecounter);
Debug.locals.put("CurrTotal", _currtotal);
Debug.locals.put("ImageCounter", _imagecounter);
Debug.locals.put("Draft", _draft);
Debug.locals.put("Out", _out);
Debug.locals.put("request_obs", _request_obs);
Debug.locals.put("Technical", _technical);
 BA.debugLineNum = 633;BA.debugLine="Sub MakePageData(PagesOut As List, PageNumber As I";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 635;BA.debugLine="Dim ret As PageData";
Debug.ShouldStop(67108864);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._pagedata");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 636;BA.debugLine="ret.Initialize";
Debug.ShouldStop(134217728);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 637;BA.debugLine="ret.PagesOut = PagesOut";
Debug.ShouldStop(268435456);
_ret.setField ("PagesOut" /*RemoteObject*/ ,_pagesout);
 BA.debugLineNum = 638;BA.debugLine="ret.PageNumber = PageNumber";
Debug.ShouldStop(536870912);
_ret.setField ("PageNumber" /*RemoteObject*/ ,_pagenumber);
 BA.debugLineNum = 639;BA.debugLine="ret.PageTotal = PageTotal";
Debug.ShouldStop(1073741824);
_ret.setField ("PageTotal" /*RemoteObject*/ ,_pagetotal);
 BA.debugLineNum = 640;BA.debugLine="ret.BuildPage = BuildPage";
Debug.ShouldStop(-2147483648);
_ret.setField ("BuildPage" /*RemoteObject*/ ,_buildpage);
 BA.debugLineNum = 641;BA.debugLine="ret.PointCounter = PointCounter";
Debug.ShouldStop(1);
_ret.setField ("PointCounter" /*RemoteObject*/ ,_pointcounter);
 BA.debugLineNum = 642;BA.debugLine="ret.LineCounter = LineCounter";
Debug.ShouldStop(2);
_ret.setField ("LineCounter" /*RemoteObject*/ ,_linecounter);
 BA.debugLineNum = 643;BA.debugLine="ret.CurrTotal = CurrTotal";
Debug.ShouldStop(4);
_ret.setField ("CurrTotal" /*RemoteObject*/ ,_currtotal);
 BA.debugLineNum = 644;BA.debugLine="ret.ImageCounter = ImageCounter";
Debug.ShouldStop(8);
_ret.setField ("ImageCounter" /*RemoteObject*/ ,_imagecounter);
 BA.debugLineNum = 645;BA.debugLine="ret.Draft = Draft";
Debug.ShouldStop(16);
_ret.setField ("Draft" /*RemoteObject*/ ,_draft);
 BA.debugLineNum = 646;BA.debugLine="ret.Out = Out";
Debug.ShouldStop(32);
_ret.setField ("Out" /*RemoteObject*/ ,_out);
 BA.debugLineNum = 647;BA.debugLine="ret.request_obs = request_obs";
Debug.ShouldStop(64);
_ret.setField ("request_obs" /*RemoteObject*/ ,_request_obs);
 BA.debugLineNum = 648;BA.debugLine="ret.Technical = Technical";
Debug.ShouldStop(128);
_ret.setField ("Technical" /*RemoteObject*/ ,_technical);
 BA.debugLineNum = 649;BA.debugLine="Return ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 650;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makepievaluestype(RemoteObject _ba,RemoteObject _name,RemoteObject _value,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("MakePieValuesType (types) ","types",61,_ba,types.mostCurrent,409);
if (RapidSub.canDelegate("makepievaluestype")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makepievaluestype", _ba, _name, _value, _color);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._pievaluestype");
;
Debug.locals.put("Name", _name);
Debug.locals.put("Value", _value);
Debug.locals.put("Color", _color);
 BA.debugLineNum = 409;BA.debugLine="Sub MakePieValuesType(Name As String, Value As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 410;BA.debugLine="Dim ret As PieValuesType";
Debug.ShouldStop(33554432);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._pievaluestype");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 411;BA.debugLine="ret.Initialize";
Debug.ShouldStop(67108864);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 412;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(134217728);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 413;BA.debugLine="ret.Value = Value";
Debug.ShouldStop(268435456);
_ret.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 414;BA.debugLine="ret.Color = Color";
Debug.ShouldStop(536870912);
_ret.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 415;BA.debugLine="Return ret";
Debug.ShouldStop(1073741824);
if (true) return _ret;
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequestcla(RemoteObject _ba,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _repeatcounter,RemoteObject _tasktype,RemoteObject _status,RemoteObject _info,RemoteObject _other) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestCLA (types) ","types",61,_ba,types.mostCurrent,927);
if (RapidSub.canDelegate("makerequestcla")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestcla", _ba, _request, _action, _task, _repeatcounter, _tasktype, _status, _info, _other);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("RepeatCounter", _repeatcounter);
Debug.locals.put("TaskType", _tasktype);
Debug.locals.put("Status", _status);
Debug.locals.put("Info", _info);
Debug.locals.put("Other", _other);
 BA.debugLineNum = 927;BA.debugLine="Sub MakeRequestCLA(Request As String, Action As St";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 929;BA.debugLine="Dim ret As RequestCLA";
Debug.ShouldStop(1);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestcla");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 930;BA.debugLine="ret.Initialize";
Debug.ShouldStop(2);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 931;BA.debugLine="ret.Request = Request";
Debug.ShouldStop(4);
_ret.setField ("Request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 932;BA.debugLine="ret.Action = Action";
Debug.ShouldStop(8);
_ret.setField ("Action" /*RemoteObject*/ ,_action);
 BA.debugLineNum = 933;BA.debugLine="ret.Task = Task";
Debug.ShouldStop(16);
_ret.setField ("Task" /*RemoteObject*/ ,_task);
 BA.debugLineNum = 934;BA.debugLine="ret.RepeatCounter = RepeatCounter";
Debug.ShouldStop(32);
_ret.setField ("RepeatCounter" /*RemoteObject*/ ,_repeatcounter);
 BA.debugLineNum = 935;BA.debugLine="ret.TaskType = TaskType";
Debug.ShouldStop(64);
_ret.setField ("TaskType" /*RemoteObject*/ ,_tasktype);
 BA.debugLineNum = 936;BA.debugLine="ret.Status = Status";
Debug.ShouldStop(128);
_ret.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 937;BA.debugLine="ret.Info = Info";
Debug.ShouldStop(256);
_ret.setField ("Info" /*RemoteObject*/ ,_info);
 BA.debugLineNum = 938;BA.debugLine="ret.Other = Other";
Debug.ShouldStop(512);
_ret.setField ("Other" /*RemoteObject*/ ,_other);
 BA.debugLineNum = 939;BA.debugLine="Return ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 940;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequestclaitem(RemoteObject _ba,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _tagcode,RemoteObject _repeatcounter,RemoteObject _repeatitemcounter,RemoteObject _repeatfieldcounter,RemoteObject _title,RemoteObject _answer,RemoteObject _value,RemoteObject _origin,RemoteObject _baseimage,RemoteObject _onreport,RemoteObject _tagobject,RemoteObject _taskinfo,RemoteObject _selectscript) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestCLAItem (types) ","types",61,_ba,types.mostCurrent,900);
if (RapidSub.canDelegate("makerequestclaitem")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestclaitem", _ba, _request, _action, _task, _item, _uniquekey, _tagcode, _repeatcounter, _repeatitemcounter, _repeatfieldcounter, _title, _answer, _value, _origin, _baseimage, _onreport, _tagobject, _taskinfo, _selectscript);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaitem");
;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("RepeatCounter", _repeatcounter);
Debug.locals.put("RepeatItemCounter", _repeatitemcounter);
Debug.locals.put("repeatfieldcounter", _repeatfieldcounter);
Debug.locals.put("Title", _title);
Debug.locals.put("Answer", _answer);
Debug.locals.put("Value", _value);
Debug.locals.put("Origin", _origin);
Debug.locals.put("BaseImage", _baseimage);
Debug.locals.put("OnReport", _onreport);
Debug.locals.put("TagObject", _tagobject);
Debug.locals.put("TaskInfo", _taskinfo);
Debug.locals.put("SelectScript", _selectscript);
 BA.debugLineNum = 900;BA.debugLine="Sub MakeRequestCLAItem(Request As String, Action A";
Debug.ShouldStop(8);
 BA.debugLineNum = 904;BA.debugLine="Dim ret As RequestCLAItem";
Debug.ShouldStop(128);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 905;BA.debugLine="ret.Initialize";
Debug.ShouldStop(256);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 906;BA.debugLine="ret.Request = Request";
Debug.ShouldStop(512);
_ret.setField ("Request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 907;BA.debugLine="ret.Action = Action";
Debug.ShouldStop(1024);
_ret.setField ("Action" /*RemoteObject*/ ,_action);
 BA.debugLineNum = 908;BA.debugLine="ret.Task = Task";
Debug.ShouldStop(2048);
_ret.setField ("Task" /*RemoteObject*/ ,_task);
 BA.debugLineNum = 909;BA.debugLine="ret.Item = Item";
Debug.ShouldStop(4096);
_ret.setField ("Item" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 910;BA.debugLine="ret.UniqueKey = UniqueKey";
Debug.ShouldStop(8192);
_ret.setField ("UniqueKey" /*RemoteObject*/ ,_uniquekey);
 BA.debugLineNum = 911;BA.debugLine="ret.Tagcode = Tagcode";
Debug.ShouldStop(16384);
_ret.setField ("Tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 912;BA.debugLine="ret.RepeatCounter = RepeatCounter";
Debug.ShouldStop(32768);
_ret.setField ("RepeatCounter" /*RemoteObject*/ ,_repeatcounter);
 BA.debugLineNum = 913;BA.debugLine="ret.RepeatItemCounter = RepeatItemCounter";
Debug.ShouldStop(65536);
_ret.setField ("RepeatItemCounter" /*RemoteObject*/ ,_repeatitemcounter);
 BA.debugLineNum = 914;BA.debugLine="ret.repeatfieldcounter = repeatfieldcounter";
Debug.ShouldStop(131072);
_ret.setField ("repeatfieldcounter" /*RemoteObject*/ ,_repeatfieldcounter);
 BA.debugLineNum = 915;BA.debugLine="ret.Title = Title";
Debug.ShouldStop(262144);
_ret.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 916;BA.debugLine="ret.Answer = Answer";
Debug.ShouldStop(524288);
_ret.setField ("Answer" /*RemoteObject*/ ,_answer);
 BA.debugLineNum = 917;BA.debugLine="ret.Value = Value";
Debug.ShouldStop(1048576);
_ret.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 918;BA.debugLine="ret.Origin = Origin";
Debug.ShouldStop(2097152);
_ret.setField ("Origin" /*RemoteObject*/ ,_origin);
 BA.debugLineNum = 919;BA.debugLine="ret.BaseImage = BaseImage";
Debug.ShouldStop(4194304);
_ret.setField ("BaseImage" /*RemoteObject*/ ,_baseimage);
 BA.debugLineNum = 920;BA.debugLine="ret.OnReport = OnReport";
Debug.ShouldStop(8388608);
_ret.setField ("OnReport" /*RemoteObject*/ ,_onreport);
 BA.debugLineNum = 921;BA.debugLine="ret.TagObject = TagObject";
Debug.ShouldStop(16777216);
_ret.setField ("TagObject" /*RemoteObject*/ ,_tagobject);
 BA.debugLineNum = 922;BA.debugLine="ret.TaskInfo = TaskInfo";
Debug.ShouldStop(33554432);
_ret.setField ("TaskInfo" /*RemoteObject*/ ,_taskinfo);
 BA.debugLineNum = 923;BA.debugLine="ret.SelectScript = SelectScript";
Debug.ShouldStop(67108864);
_ret.setField ("SelectScript" /*RemoteObject*/ ,_selectscript);
 BA.debugLineNum = 924;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 925;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequestclaobs(RemoteObject _ba,RemoteObject _child,RemoteObject _cla,RemoteObject _obs) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestCLAOBS (types) ","types",61,_ba,types.mostCurrent,952);
if (RapidSub.canDelegate("makerequestclaobs")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestclaobs", _ba, _child, _cla, _obs);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestclaobs");
;
Debug.locals.put("child", _child);
Debug.locals.put("cla", _cla);
Debug.locals.put("Obs", _obs);
 BA.debugLineNum = 952;BA.debugLine="Sub MakeRequestCLAOBS(child As Boolean, cla As Req";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 953;BA.debugLine="Dim ret As RequestCLAOBS";
Debug.ShouldStop(16777216);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaobs");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 954;BA.debugLine="ret.Initialize";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 955;BA.debugLine="ret.child = child";
Debug.ShouldStop(67108864);
_ret.setField ("child" /*RemoteObject*/ ,_child);
 BA.debugLineNum = 956;BA.debugLine="ret.cla = cla";
Debug.ShouldStop(134217728);
_ret.setField ("cla" /*RemoteObject*/ ,_cla);
 BA.debugLineNum = 957;BA.debugLine="ret.Obs = Obs";
Debug.ShouldStop(268435456);
_ret.setField ("Obs" /*RemoteObject*/ ,_obs);
 BA.debugLineNum = 958;BA.debugLine="Return ret";
Debug.ShouldStop(536870912);
if (true) return _ret;
 BA.debugLineNum = 959;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequestdata(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _entity,RemoteObject _latitude,RemoteObject _longitude,RemoteObject _requesttype,RemoteObject _favorite,RemoteObject _clientreport,RemoteObject _requestcanadd,RemoteObject _requestcandelete) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestData (types) ","types",61,_ba,types.mostCurrent,823);
if (RapidSub.canDelegate("makerequestdata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestdata", _ba, _tagcode, _entity, _latitude, _longitude, _requesttype, _favorite, _clientreport, _requestcanadd, _requestcandelete);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestdata");
;
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("Entity", _entity);
Debug.locals.put("Latitude", _latitude);
Debug.locals.put("Longitude", _longitude);
Debug.locals.put("RequestType", _requesttype);
Debug.locals.put("Favorite", _favorite);
Debug.locals.put("ClientReport", _clientreport);
Debug.locals.put("RequestCanAdd", _requestcanadd);
Debug.locals.put("RequestCanDelete", _requestcandelete);
 BA.debugLineNum = 823;BA.debugLine="Sub MakeRequestData(Tagcode As String, Entity As S";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 825;BA.debugLine="Dim ret As RequestData";
Debug.ShouldStop(16777216);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestdata");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 826;BA.debugLine="ret.Initialize";
Debug.ShouldStop(33554432);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 827;BA.debugLine="ret.Tagcode = Tagcode";
Debug.ShouldStop(67108864);
_ret.setField ("Tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 828;BA.debugLine="ret.Entity = Entity";
Debug.ShouldStop(134217728);
_ret.setField ("Entity" /*RemoteObject*/ ,_entity);
 BA.debugLineNum = 829;BA.debugLine="ret.Latitude = Latitude";
Debug.ShouldStop(268435456);
_ret.setField ("Latitude" /*RemoteObject*/ ,_latitude);
 BA.debugLineNum = 830;BA.debugLine="ret.Longitude = Longitude";
Debug.ShouldStop(536870912);
_ret.setField ("Longitude" /*RemoteObject*/ ,_longitude);
 BA.debugLineNum = 831;BA.debugLine="ret.RequestType = RequestType";
Debug.ShouldStop(1073741824);
_ret.setField ("RequestType" /*RemoteObject*/ ,_requesttype);
 BA.debugLineNum = 832;BA.debugLine="ret.Favorite = Favorite";
Debug.ShouldStop(-2147483648);
_ret.setField ("Favorite" /*RemoteObject*/ ,_favorite);
 BA.debugLineNum = 833;BA.debugLine="ret.ClientReport = ClientReport";
Debug.ShouldStop(1);
_ret.setField ("ClientReport" /*RemoteObject*/ ,_clientreport);
 BA.debugLineNum = 834;BA.debugLine="ret.RequestCanAdd = RequestCanAdd";
Debug.ShouldStop(2);
_ret.setField ("RequestCanAdd" /*RemoteObject*/ ,_requestcanadd);
 BA.debugLineNum = 835;BA.debugLine="ret.RequestCanDelete = RequestCanDelete";
Debug.ShouldStop(4);
_ret.setField ("RequestCanDelete" /*RemoteObject*/ ,_requestcandelete);
 BA.debugLineNum = 836;BA.debugLine="Return ret";
Debug.ShouldStop(8);
if (true) return _ret;
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequestfilter(RemoteObject _ba,RemoteObject _sdate,RemoteObject _edate,RemoteObject _state,RemoteObject _task,RemoteObject _entity,RemoteObject _route,RemoteObject _tprequest) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestFilter (types) ","types",61,_ba,types.mostCurrent,1179);
if (RapidSub.canDelegate("makerequestfilter")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestfilter", _ba, _sdate, _edate, _state, _task, _entity, _route, _tprequest);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestfilter");
;
Debug.locals.put("SDate", _sdate);
Debug.locals.put("EDate", _edate);
Debug.locals.put("State", _state);
Debug.locals.put("Task", _task);
Debug.locals.put("Entity", _entity);
Debug.locals.put("Route", _route);
Debug.locals.put("TPRequest", _tprequest);
 BA.debugLineNum = 1179;BA.debugLine="Sub MakeRequestFilter(SDate As String, EDate As St";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1181;BA.debugLine="Dim ret As RequestFilter";
Debug.ShouldStop(268435456);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestfilter");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1182;BA.debugLine="ret.Initialize";
Debug.ShouldStop(536870912);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1183;BA.debugLine="ret.SDate = SDate";
Debug.ShouldStop(1073741824);
_ret.setField ("SDate" /*RemoteObject*/ ,_sdate);
 BA.debugLineNum = 1184;BA.debugLine="ret.EDate = EDate";
Debug.ShouldStop(-2147483648);
_ret.setField ("EDate" /*RemoteObject*/ ,_edate);
 BA.debugLineNum = 1185;BA.debugLine="ret.State = State";
Debug.ShouldStop(1);
_ret.setField ("State" /*RemoteObject*/ ,_state);
 BA.debugLineNum = 1186;BA.debugLine="ret.Task = Task";
Debug.ShouldStop(2);
_ret.setField ("Task" /*RemoteObject*/ ,_task);
 BA.debugLineNum = 1187;BA.debugLine="ret.Entity = Entity";
Debug.ShouldStop(4);
_ret.setField ("Entity" /*RemoteObject*/ ,_entity);
 BA.debugLineNum = 1188;BA.debugLine="ret.Route = Route";
Debug.ShouldStop(8);
_ret.setField ("Route" /*RemoteObject*/ ,_route);
 BA.debugLineNum = 1189;BA.debugLine="ret.TPRequest = TPRequest";
Debug.ShouldStop(16);
_ret.setField ("TPRequest" /*RemoteObject*/ ,_tprequest);
 BA.debugLineNum = 1190;BA.debugLine="Return ret";
Debug.ShouldStop(32);
if (true) return _ret;
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
public static RemoteObject  _makerequestinfo(RemoteObject _ba,RemoteObject _request,RemoteObject _rientity,RemoteObject _riobject,RemoteObject _rityperequest,RemoteObject _ritechnical,RemoteObject _riteam,RemoteObject _rivehicle,RemoteObject _rinotes,RemoteObject _riroute,RemoteObject _rireference,RemoteObject _ridetails) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestInfo (types) ","types",61,_ba,types.mostCurrent,429);
if (RapidSub.canDelegate("makerequestinfo")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestinfo", _ba, _request, _rientity, _riobject, _rityperequest, _ritechnical, _riteam, _rivehicle, _rinotes, _riroute, _rireference, _ridetails);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestinfo");
;
Debug.locals.put("Request", _request);
Debug.locals.put("RIEntity", _rientity);
Debug.locals.put("RIObject", _riobject);
Debug.locals.put("RITypeRequest", _rityperequest);
Debug.locals.put("RITechnical", _ritechnical);
Debug.locals.put("RITeam", _riteam);
Debug.locals.put("RIVehicle", _rivehicle);
Debug.locals.put("RINotes", _rinotes);
Debug.locals.put("RIRoute", _riroute);
Debug.locals.put("RIReference", _rireference);
Debug.locals.put("RIDetails", _ridetails);
 BA.debugLineNum = 429;BA.debugLine="Sub MakeRequestInfo(Request As String, RIEntity As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 431;BA.debugLine="Dim ret As RequestInfo";
Debug.ShouldStop(16384);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 432;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32768);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 433;BA.debugLine="ret.Request = Request";
Debug.ShouldStop(65536);
_ret.setField ("Request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 434;BA.debugLine="ret.RIEntity = RIEntity";
Debug.ShouldStop(131072);
_ret.setField ("RIEntity" /*RemoteObject*/ ,_rientity);
 BA.debugLineNum = 435;BA.debugLine="ret.RIObject = RIObject";
Debug.ShouldStop(262144);
_ret.setField ("RIObject" /*RemoteObject*/ ,_riobject);
 BA.debugLineNum = 436;BA.debugLine="ret.RITypeRequest = RITypeRequest";
Debug.ShouldStop(524288);
_ret.setField ("RITypeRequest" /*RemoteObject*/ ,_rityperequest);
 BA.debugLineNum = 437;BA.debugLine="ret.RITechnical = RITechnical";
Debug.ShouldStop(1048576);
_ret.setField ("RITechnical" /*RemoteObject*/ ,_ritechnical);
 BA.debugLineNum = 438;BA.debugLine="ret.RITeam = RITeam";
Debug.ShouldStop(2097152);
_ret.setField ("RITeam" /*RemoteObject*/ ,_riteam);
 BA.debugLineNum = 439;BA.debugLine="ret.RIVehicle = RIVehicle";
Debug.ShouldStop(4194304);
_ret.setField ("RIVehicle" /*RemoteObject*/ ,_rivehicle);
 BA.debugLineNum = 440;BA.debugLine="ret.RINotes = RINotes";
Debug.ShouldStop(8388608);
_ret.setField ("RINotes" /*RemoteObject*/ ,_rinotes);
 BA.debugLineNum = 441;BA.debugLine="ret.RITeam = RIRoute";
Debug.ShouldStop(16777216);
_ret.setField ("RITeam" /*RemoteObject*/ ,_riroute);
 BA.debugLineNum = 442;BA.debugLine="ret.RIVehicle = RIReference";
Debug.ShouldStop(33554432);
_ret.setField ("RIVehicle" /*RemoteObject*/ ,_rireference);
 BA.debugLineNum = 443;BA.debugLine="ret.RINotes = RIDetails";
Debug.ShouldStop(67108864);
_ret.setField ("RINotes" /*RemoteObject*/ ,_ridetails);
 BA.debugLineNum = 444;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
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
public static RemoteObject  _makerequestinfoclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestInfoClear (types) ","types",61,_ba,types.mostCurrent,448);
if (RapidSub.canDelegate("makerequestinfoclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequestinfoclear", _ba);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestinfo");
;
 BA.debugLineNum = 448;BA.debugLine="Sub MakeRequestInfoClear As RequestInfo";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 449;BA.debugLine="Dim ret As RequestInfo";
Debug.ShouldStop(1);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 450;BA.debugLine="ret.Initialize";
Debug.ShouldStop(2);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 451;BA.debugLine="ret.Request = \"\"";
Debug.ShouldStop(4);
_ret.setField ("Request" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 452;BA.debugLine="ret.RIEntity = \"\"";
Debug.ShouldStop(8);
_ret.setField ("RIEntity" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 453;BA.debugLine="ret.RIObject = \"\"";
Debug.ShouldStop(16);
_ret.setField ("RIObject" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 454;BA.debugLine="ret.RITypeRequest = \"\"";
Debug.ShouldStop(32);
_ret.setField ("RITypeRequest" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 455;BA.debugLine="ret.RITechnical = \"\"";
Debug.ShouldStop(64);
_ret.setField ("RITechnical" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 456;BA.debugLine="ret.RITeam = \"\"";
Debug.ShouldStop(128);
_ret.setField ("RITeam" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 457;BA.debugLine="ret.RIVehicle = \"\"";
Debug.ShouldStop(256);
_ret.setField ("RIVehicle" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 458;BA.debugLine="ret.RINotes = \"\"";
Debug.ShouldStop(512);
_ret.setField ("RINotes" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 459;BA.debugLine="ret.RITeam = \"\"";
Debug.ShouldStop(1024);
_ret.setField ("RITeam" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 460;BA.debugLine="ret.RIVehicle = \"\"";
Debug.ShouldStop(2048);
_ret.setField ("RIVehicle" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 461;BA.debugLine="ret.RINotes = \"\"";
Debug.ShouldStop(4096);
_ret.setField ("RINotes" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 462;BA.debugLine="Return ret";
Debug.ShouldStop(8192);
if (true) return _ret;
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequesttaskinfo(RemoteObject _ba,RemoteObject _requesttype,RemoteObject _closetype,RemoteObject _requestresult,RemoteObject _requestresoptions,RemoteObject _inpause,RemoteObject _duration,RemoteObject _points,RemoteObject _risk,RemoteObject _map1,RemoteObject _map2,RemoteObject _reqindex) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestTaskInfo (types) ","types",61,_ba,types.mostCurrent,867);
if (RapidSub.canDelegate("makerequesttaskinfo")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequesttaskinfo", _ba, _requesttype, _closetype, _requestresult, _requestresoptions, _inpause, _duration, _points, _risk, _map1, _map2, _reqindex);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
;
Debug.locals.put("RequestType", _requesttype);
Debug.locals.put("CloseType", _closetype);
Debug.locals.put("RequestResult", _requestresult);
Debug.locals.put("RequestResOptions", _requestresoptions);
Debug.locals.put("InPause", _inpause);
Debug.locals.put("Duration", _duration);
Debug.locals.put("Points", _points);
Debug.locals.put("Risk", _risk);
Debug.locals.put("Map1", _map1);
Debug.locals.put("Map2", _map2);
Debug.locals.put("ReqIndex", _reqindex);
 BA.debugLineNum = 867;BA.debugLine="Sub MakeRequestTaskInfo(RequestType As Int, CloseT";
Debug.ShouldStop(4);
 BA.debugLineNum = 869;BA.debugLine="Dim ret As RequestTaskInfo";
Debug.ShouldStop(16);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requesttaskinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 870;BA.debugLine="ret.Initialize";
Debug.ShouldStop(32);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 871;BA.debugLine="ret.RequestType = RequestType";
Debug.ShouldStop(64);
_ret.setField ("RequestType" /*RemoteObject*/ ,_requesttype);
 BA.debugLineNum = 872;BA.debugLine="ret.CloseType = CloseType";
Debug.ShouldStop(128);
_ret.setField ("CloseType" /*RemoteObject*/ ,_closetype);
 BA.debugLineNum = 873;BA.debugLine="ret.RequestResult = RequestResult";
Debug.ShouldStop(256);
_ret.setField ("RequestResult" /*RemoteObject*/ ,_requestresult);
 BA.debugLineNum = 874;BA.debugLine="ret.RequestResOptions = RequestResOptions";
Debug.ShouldStop(512);
_ret.setField ("RequestResOptions" /*RemoteObject*/ ,_requestresoptions);
 BA.debugLineNum = 875;BA.debugLine="ret.InPause = InPause";
Debug.ShouldStop(1024);
_ret.setField ("InPause" /*RemoteObject*/ ,_inpause);
 BA.debugLineNum = 876;BA.debugLine="ret.Duration = Duration";
Debug.ShouldStop(2048);
_ret.setField ("Duration" /*RemoteObject*/ ,_duration);
 BA.debugLineNum = 877;BA.debugLine="ret.Points = Points";
Debug.ShouldStop(4096);
_ret.setField ("Points" /*RemoteObject*/ ,_points);
 BA.debugLineNum = 878;BA.debugLine="ret.Risk = Risk";
Debug.ShouldStop(8192);
_ret.setField ("Risk" /*RemoteObject*/ ,_risk);
 BA.debugLineNum = 879;BA.debugLine="If Map1.IsInitialized Then";
Debug.ShouldStop(16384);
if (_map1.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 880;BA.debugLine="ret.Map1 = Map1";
Debug.ShouldStop(32768);
_ret.setField ("Map1" /*RemoteObject*/ ,_map1);
 }else {
 BA.debugLineNum = 882;BA.debugLine="ret.Map1.Initialize";
Debug.ShouldStop(131072);
_ret.getField(false,"Map1" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 885;BA.debugLine="If Map2.IsInitialized Then";
Debug.ShouldStop(1048576);
if (_map2.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 886;BA.debugLine="ret.Map2 = Map2";
Debug.ShouldStop(2097152);
_ret.setField ("Map2" /*RemoteObject*/ ,_map2);
 }else {
 BA.debugLineNum = 888;BA.debugLine="ret.Map2.Initialize";
Debug.ShouldStop(8388608);
_ret.getField(false,"Map2" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 890;BA.debugLine="ret.ReqIndex = ReqIndex";
Debug.ShouldStop(33554432);
_ret.setField ("ReqIndex" /*RemoteObject*/ ,_reqindex);
 BA.debugLineNum = 891;BA.debugLine="Return ret";
Debug.ShouldStop(67108864);
if (true) return _ret;
 BA.debugLineNum = 892;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerequesttaskinfoclear(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("MakeRequestTaskInfoClear (types) ","types",61,_ba,types.mostCurrent,894);
if (RapidSub.canDelegate("makerequesttaskinfoclear")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerequesttaskinfoclear", _ba);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
;
 BA.debugLineNum = 894;BA.debugLine="Sub MakeRequestTaskInfoClear As RequestTaskInfo";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 895;BA.debugLine="Dim ret As RequestTaskInfo";
Debug.ShouldStop(1073741824);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requesttaskinfo");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 896;BA.debugLine="ret.Initialize";
Debug.ShouldStop(-2147483648);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 897;BA.debugLine="Return ret";
Debug.ShouldStop(1);
if (true) return _ret;
 BA.debugLineNum = 898;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeresultoptions(RemoteObject _ba,RemoteObject _valint,RemoteObject _valstr,RemoteObject _valtitle) throws Exception{
try {
		Debug.PushSubsStack("MakeResultOptions (types) ","types",61,_ba,types.mostCurrent,763);
if (RapidSub.canDelegate("makeresultoptions")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeresultoptions", _ba, _valint, _valstr, _valtitle);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._resultoptions");
;
Debug.locals.put("ValInt", _valint);
Debug.locals.put("ValStr", _valstr);
Debug.locals.put("ValTitle", _valtitle);
 BA.debugLineNum = 763;BA.debugLine="Sub MakeResultOptions(ValInt As Int, ValStr As Str";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 764;BA.debugLine="Dim ret As ResultOptions";
Debug.ShouldStop(134217728);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._resultoptions");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 765;BA.debugLine="ret.Initialize";
Debug.ShouldStop(268435456);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 766;BA.debugLine="ret.ValInt = ValInt";
Debug.ShouldStop(536870912);
_ret.setField ("ValInt" /*RemoteObject*/ ,_valint);
 BA.debugLineNum = 767;BA.debugLine="ret.ValStr = ValStr";
Debug.ShouldStop(1073741824);
_ret.setField ("ValStr" /*RemoteObject*/ ,_valstr);
 BA.debugLineNum = 768;BA.debugLine="ret.ValTitle = ValTitle";
Debug.ShouldStop(-2147483648);
_ret.setField ("ValTitle" /*RemoteObject*/ ,_valtitle);
 BA.debugLineNum = 769;BA.debugLine="Return ret";
Debug.ShouldStop(1);
if (true) return _ret;
 BA.debugLineNum = 770;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makereturnfielddata(RemoteObject _ba,RemoteObject _item_tagcode,RemoteObject _field_value) throws Exception{
try {
		Debug.PushSubsStack("MakeReturnFieldData (types) ","types",61,_ba,types.mostCurrent,233);
if (RapidSub.canDelegate("makereturnfielddata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makereturnfielddata", _ba, _item_tagcode, _field_value);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._returnfielddata");
;
Debug.locals.put("item_tagcode", _item_tagcode);
Debug.locals.put("field_value", _field_value);
 BA.debugLineNum = 233;BA.debugLine="Sub MakeReturnFieldData(item_tagcode As String, fi";
Debug.ShouldStop(256);
 BA.debugLineNum = 234;BA.debugLine="Dim res As ReturnFieldData";
Debug.ShouldStop(512);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._returnfielddata");Debug.locals.put("res", _res);
 BA.debugLineNum = 235;BA.debugLine="res.initialize";
Debug.ShouldStop(1024);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 236;BA.debugLine="res.item_tagcode = item_tagcode";
Debug.ShouldStop(2048);
_res.setField ("item_tagcode" /*RemoteObject*/ ,_item_tagcode);
 BA.debugLineNum = 237;BA.debugLine="res.field_value = field_value";
Debug.ShouldStop(4096);
_res.setField ("field_value" /*RemoteObject*/ ,_field_value);
 BA.debugLineNum = 238;BA.debugLine="Return res";
Debug.ShouldStop(8192);
if (true) return _res;
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makereturnfromcantrolsub(RemoteObject _ba,RemoteObject _toc,RemoteObject _subres) throws Exception{
try {
		Debug.PushSubsStack("MakeReturnFromCantrolSub (types) ","types",61,_ba,types.mostCurrent,190);
if (RapidSub.canDelegate("makereturnfromcantrolsub")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makereturnfromcantrolsub", _ba, _toc, _subres);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._returnfromcantrolsub");
;
Debug.locals.put("TOC", _toc);
Debug.locals.put("SubRes", _subres);
 BA.debugLineNum = 190;BA.debugLine="Sub MakeReturnFromCantrolSub(TOC As Int, SubRes As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 191;BA.debugLine="Dim res As ReturnFromCantrolSub";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._returnfromcantrolsub");Debug.locals.put("res", _res);
 BA.debugLineNum = 192;BA.debugLine="res.Initialize";
Debug.ShouldStop(-2147483648);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 193;BA.debugLine="res.TypeOfControl = TOC";
Debug.ShouldStop(1);
_res.setField ("TypeOfControl" /*RemoteObject*/ ,_toc);
 BA.debugLineNum = 194;BA.debugLine="res.SubResult = SubRes";
Debug.ShouldStop(2);
_res.setField ("SubResult" /*RemoteObject*/ ,_subres);
 BA.debugLineNum = 195;BA.debugLine="Return res";
Debug.ShouldStop(4);
if (true) return _res;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makerowpanelinfo(RemoteObject _ba,RemoteObject _pan,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("MakeRowPanelInfo (types) ","types",61,_ba,types.mostCurrent,212);
if (RapidSub.canDelegate("makerowpanelinfo")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makerowpanelinfo", _ba, _pan, _height);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._rowpanelinfo");
;
Debug.locals.put("Pan", _pan);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 212;BA.debugLine="Sub MakeRowPanelInfo(Pan As Panel, Height As Int)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Dim res As RowPanelInfo";
Debug.ShouldStop(1048576);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._rowpanelinfo");Debug.locals.put("res", _res);
 BA.debugLineNum = 214;BA.debugLine="res.initialize";
Debug.ShouldStop(2097152);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 215;BA.debugLine="res.Pan = Pan";
Debug.ShouldStop(4194304);
_res.setField ("Pan" /*RemoteObject*/ ,_pan);
 BA.debugLineNum = 216;BA.debugLine="res.Height = Height";
Debug.ShouldStop(8388608);
_res.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 217;BA.debugLine="Return res";
Debug.ShouldStop(16777216);
if (true) return _res;
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeshotfoto(RemoteObject _ba,RemoteObject _filename,RemoteObject _datentime,RemoteObject _latitude,RemoteObject _longitude,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("MakeShotFoto (types) ","types",61,_ba,types.mostCurrent,418);
if (RapidSub.canDelegate("makeshotfoto")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeshotfoto", _ba, _filename, _datentime, _latitude, _longitude, _title);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._shotfoto");
;
Debug.locals.put("FileName", _filename);
Debug.locals.put("DateNTime", _datentime);
Debug.locals.put("Latitude", _latitude);
Debug.locals.put("Longitude", _longitude);
Debug.locals.put("Title", _title);
 BA.debugLineNum = 418;BA.debugLine="Sub MakeShotFoto(FileName As String, DateNTime As";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="Dim ret As ShotFoto";
Debug.ShouldStop(4);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._shotfoto");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 420;BA.debugLine="ret.Initialize";
Debug.ShouldStop(8);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 421;BA.debugLine="ret.FileName = FileName";
Debug.ShouldStop(16);
_ret.setField ("FileName" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 422;BA.debugLine="ret.DateNTime = DateNTime";
Debug.ShouldStop(32);
_ret.setField ("DateNTime" /*RemoteObject*/ ,_datentime);
 BA.debugLineNum = 423;BA.debugLine="ret.Latitude = Latitude";
Debug.ShouldStop(64);
_ret.setField ("Latitude" /*RemoteObject*/ ,_latitude);
 BA.debugLineNum = 424;BA.debugLine="ret.Longitude = Longitude";
Debug.ShouldStop(128);
_ret.setField ("Longitude" /*RemoteObject*/ ,_longitude);
 BA.debugLineNum = 425;BA.debugLine="ret.Title = Title";
Debug.ShouldStop(256);
_ret.setField ("Title" /*RemoteObject*/ ,_title);
 BA.debugLineNum = 426;BA.debugLine="Return ret";
Debug.ShouldStop(512);
if (true) return _ret;
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makesingleclaitem(RemoteObject _ba,RemoteObject _request_tc,RemoteObject _task_tc,RemoteObject _item_tc,RemoteObject _uk,RemoteObject _tc,RemoteObject _rc,RemoteObject _ric,RemoteObject _rfc) throws Exception{
try {
		Debug.PushSubsStack("MakeSingleCLAItem (types) ","types",61,_ba,types.mostCurrent,198);
if (RapidSub.canDelegate("makesingleclaitem")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makesingleclaitem", _ba, _request_tc, _task_tc, _item_tc, _uk, _tc, _rc, _ric, _rfc);}
RemoteObject _res = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._singleclaitem");
;
Debug.locals.put("request_tc", _request_tc);
Debug.locals.put("task_tc", _task_tc);
Debug.locals.put("item_tc", _item_tc);
Debug.locals.put("uk", _uk);
Debug.locals.put("tc", _tc);
Debug.locals.put("rc", _rc);
Debug.locals.put("ric", _ric);
Debug.locals.put("rfc", _rfc);
 BA.debugLineNum = 198;BA.debugLine="Sub MakeSingleCLAItem(request_tc As String, task_t";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="Dim res As SingleCLAItem";
Debug.ShouldStop(64);
_res = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._singleclaitem");Debug.locals.put("res", _res);
 BA.debugLineNum = 200;BA.debugLine="res.Initialize";
Debug.ShouldStop(128);
_res.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="res.request_tc = request_tc";
Debug.ShouldStop(256);
_res.setField ("request_tc" /*RemoteObject*/ ,_request_tc);
 BA.debugLineNum = 202;BA.debugLine="res.task_tc = task_tc";
Debug.ShouldStop(512);
_res.setField ("task_tc" /*RemoteObject*/ ,_task_tc);
 BA.debugLineNum = 203;BA.debugLine="res.item_tc = item_tc";
Debug.ShouldStop(1024);
_res.setField ("item_tc" /*RemoteObject*/ ,_item_tc);
 BA.debugLineNum = 204;BA.debugLine="res.uk = uk";
Debug.ShouldStop(2048);
_res.setField ("uk" /*RemoteObject*/ ,_uk);
 BA.debugLineNum = 205;BA.debugLine="res.tc = tc";
Debug.ShouldStop(4096);
_res.setField ("tc" /*RemoteObject*/ ,_tc);
 BA.debugLineNum = 206;BA.debugLine="res.rc = rc";
Debug.ShouldStop(8192);
_res.setField ("rc" /*RemoteObject*/ ,_rc);
 BA.debugLineNum = 207;BA.debugLine="res.ric = ric";
Debug.ShouldStop(16384);
_res.setField ("ric" /*RemoteObject*/ ,_ric);
 BA.debugLineNum = 208;BA.debugLine="res.rfc = rfc";
Debug.ShouldStop(32768);
_res.setField ("rfc" /*RemoteObject*/ ,_rfc);
 BA.debugLineNum = 209;BA.debugLine="Return res";
Debug.ShouldStop(65536);
if (true) return _res;
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makestatusfiltertask(RemoteObject _ba,RemoteObject _active,RemoteObject _inactive,RemoteObject _singular,RemoteObject _plural) throws Exception{
try {
		Debug.PushSubsStack("MakeStatusFilterTask (types) ","types",61,_ba,types.mostCurrent,465);
if (RapidSub.canDelegate("makestatusfiltertask")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makestatusfiltertask", _ba, _active, _inactive, _singular, _plural);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._statusfiltertask");
;
Debug.locals.put("active", _active);
Debug.locals.put("inactive", _inactive);
Debug.locals.put("singular", _singular);
Debug.locals.put("plural", _plural);
 BA.debugLineNum = 465;BA.debugLine="Sub MakeStatusFilterTask(active As Boolean, inacti";
Debug.ShouldStop(65536);
 BA.debugLineNum = 466;BA.debugLine="Dim ret As StatusFilterTask";
Debug.ShouldStop(131072);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._statusfiltertask");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 467;BA.debugLine="ret.Initialize";
Debug.ShouldStop(262144);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 468;BA.debugLine="ret.active = active";
Debug.ShouldStop(524288);
_ret.setField ("active" /*RemoteObject*/ ,_active);
 BA.debugLineNum = 469;BA.debugLine="ret.inactive = inactive";
Debug.ShouldStop(1048576);
_ret.setField ("inactive" /*RemoteObject*/ ,_inactive);
 BA.debugLineNum = 470;BA.debugLine="ret.singular = singular";
Debug.ShouldStop(2097152);
_ret.setField ("singular" /*RemoteObject*/ ,_singular);
 BA.debugLineNum = 471;BA.debugLine="ret.plural = plural";
Debug.ShouldStop(4194304);
_ret.setField ("plural" /*RemoteObject*/ ,_plural);
 BA.debugLineNum = 472;BA.debugLine="Return ret";
Debug.ShouldStop(8388608);
if (true) return _ret;
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketablecounters(RemoteObject _ba,RemoteObject _tablename,RemoteObject _counter) throws Exception{
try {
		Debug.PushSubsStack("MakeTableCounters (types) ","types",61,_ba,types.mostCurrent,678);
if (RapidSub.canDelegate("maketablecounters")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","maketablecounters", _ba, _tablename, _counter);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._tablecounters");
;
Debug.locals.put("tablename", _tablename);
Debug.locals.put("counter", _counter);
 BA.debugLineNum = 678;BA.debugLine="Sub MakeTableCounters(tablename As String, counter";
Debug.ShouldStop(32);
 BA.debugLineNum = 679;BA.debugLine="Dim ret As TableCounters";
Debug.ShouldStop(64);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._tablecounters");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 680;BA.debugLine="ret.Initialize";
Debug.ShouldStop(128);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 681;BA.debugLine="ret.tablename = tablename";
Debug.ShouldStop(256);
_ret.setField ("tablename" /*RemoteObject*/ ,_tablename);
 BA.debugLineNum = 682;BA.debugLine="ret.counter = counter";
Debug.ShouldStop(512);
_ret.setField ("counter" /*RemoteObject*/ ,_counter);
 BA.debugLineNum = 683;BA.debugLine="Return ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 684;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketaglisttype(RemoteObject _ba,RemoteObject _tagcode,RemoteObject _tagname,RemoteObject _taggroup) throws Exception{
try {
		Debug.PushSubsStack("MakeTagListType (types) ","types",61,_ba,types.mostCurrent,668);
if (RapidSub.canDelegate("maketaglisttype")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","maketaglisttype", _ba, _tagcode, _tagname, _taggroup);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taglisttype");
;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("tagname", _tagname);
Debug.locals.put("taggroup", _taggroup);
 BA.debugLineNum = 668;BA.debugLine="Sub MakeTagListType(tagcode As String, tagname As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 669;BA.debugLine="Dim ret As TagListType";
Debug.ShouldStop(268435456);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._taglisttype");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 670;BA.debugLine="ret.Initialize";
Debug.ShouldStop(536870912);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 671;BA.debugLine="ret.tagcode = tagcode";
Debug.ShouldStop(1073741824);
_ret.setField ("tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 672;BA.debugLine="ret.tagname = tagname";
Debug.ShouldStop(-2147483648);
_ret.setField ("tagname" /*RemoteObject*/ ,_tagname);
 BA.debugLineNum = 673;BA.debugLine="ret.taggroup = taggroup";
Debug.ShouldStop(1);
_ret.setField ("taggroup" /*RemoteObject*/ ,_taggroup);
 BA.debugLineNum = 674;BA.debugLine="Return ret";
Debug.ShouldStop(2);
if (true) return _ret;
 BA.debugLineNum = 676;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketaskfilter(RemoteObject _ba,RemoteObject _typetask,RemoteObject _status,RemoteObject _updated,RemoteObject _withrequests,RemoteObject _group) throws Exception{
try {
		Debug.PushSubsStack("MakeTaskFilter (types) ","types",61,_ba,types.mostCurrent,961);
if (RapidSub.canDelegate("maketaskfilter")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","maketaskfilter", _ba, _typetask, _status, _updated, _withrequests, _group);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._taskfilter");
;
Debug.locals.put("TypeTask", _typetask);
Debug.locals.put("Status", _status);
Debug.locals.put("Updated", _updated);
Debug.locals.put("WithRequests", _withrequests);
Debug.locals.put("Group", _group);
 BA.debugLineNum = 961;BA.debugLine="Sub MakeTaskFilter(TypeTask As Int, Status As Int,";
Debug.ShouldStop(1);
 BA.debugLineNum = 962;BA.debugLine="Dim ret As TaskFilter";
Debug.ShouldStop(2);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._taskfilter");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 963;BA.debugLine="ret.Initialize";
Debug.ShouldStop(4);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 964;BA.debugLine="ret.TypeTask = TypeTask";
Debug.ShouldStop(8);
_ret.setField ("TypeTask" /*RemoteObject*/ ,_typetask);
 BA.debugLineNum = 965;BA.debugLine="ret.Status = Status";
Debug.ShouldStop(16);
_ret.setField ("Status" /*RemoteObject*/ ,_status);
 BA.debugLineNum = 966;BA.debugLine="ret.Updated = Updated";
Debug.ShouldStop(32);
_ret.setField ("Updated" /*RemoteObject*/ ,_updated);
 BA.debugLineNum = 967;BA.debugLine="ret.WithRequests = WithRequests";
Debug.ShouldStop(64);
_ret.setField ("WithRequests" /*RemoteObject*/ ,_withrequests);
 BA.debugLineNum = 968;BA.debugLine="ret.Group = Group";
Debug.ShouldStop(128);
_ret.setField ("Group" /*RemoteObject*/ ,_group);
 BA.debugLineNum = 969;BA.debugLine="Return ret";
Debug.ShouldStop(256);
if (true) return _ret;
 BA.debugLineNum = 970;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketestrequestitem(RemoteObject _ba,RemoteObject _request,RemoteObject _action,RemoteObject _task,RemoteObject _item,RemoteObject _uniquekey,RemoteObject _tagcode,RemoteObject _value,RemoteObject _obs,RemoteObject _actionsub,RemoteObject _image) throws Exception{
try {
		Debug.PushSubsStack("MakeTestRequestItem (types) ","types",61,_ba,types.mostCurrent,850);
if (RapidSub.canDelegate("maketestrequestitem")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","maketestrequestitem", _ba, _request, _action, _task, _item, _uniquekey, _tagcode, _value, _obs, _actionsub, _image);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._testrequestitem");
;
Debug.locals.put("Request", _request);
Debug.locals.put("Action", _action);
Debug.locals.put("Task", _task);
Debug.locals.put("Item", _item);
Debug.locals.put("UniqueKey", _uniquekey);
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("Value", _value);
Debug.locals.put("Obs", _obs);
Debug.locals.put("ActionSub", _actionsub);
Debug.locals.put("Image", _image);
 BA.debugLineNum = 850;BA.debugLine="Sub MakeTestRequestItem(Request As String, Action";
Debug.ShouldStop(131072);
 BA.debugLineNum = 852;BA.debugLine="Dim ret As TestRequestItem";
Debug.ShouldStop(524288);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._testrequestitem");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 853;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1048576);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 854;BA.debugLine="ret.Request = Request";
Debug.ShouldStop(2097152);
_ret.setField ("Request" /*RemoteObject*/ ,_request);
 BA.debugLineNum = 855;BA.debugLine="ret.Action = Action";
Debug.ShouldStop(4194304);
_ret.setField ("Action" /*RemoteObject*/ ,_action);
 BA.debugLineNum = 856;BA.debugLine="ret.Task = Task";
Debug.ShouldStop(8388608);
_ret.setField ("Task" /*RemoteObject*/ ,_task);
 BA.debugLineNum = 857;BA.debugLine="ret.Item = Item";
Debug.ShouldStop(16777216);
_ret.setField ("Item" /*RemoteObject*/ ,_item);
 BA.debugLineNum = 858;BA.debugLine="ret.UniqueKey = UniqueKey";
Debug.ShouldStop(33554432);
_ret.setField ("UniqueKey" /*RemoteObject*/ ,_uniquekey);
 BA.debugLineNum = 859;BA.debugLine="ret.Tagcode = Tagcode";
Debug.ShouldStop(67108864);
_ret.setField ("Tagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 860;BA.debugLine="ret.Value = Value";
Debug.ShouldStop(134217728);
_ret.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 861;BA.debugLine="ret.Obs = Obs";
Debug.ShouldStop(268435456);
_ret.setField ("Obs" /*RemoteObject*/ ,_obs);
 BA.debugLineNum = 862;BA.debugLine="ret.ActionSub = ActionSub";
Debug.ShouldStop(536870912);
_ret.setField ("ActionSub" /*RemoteObject*/ ,_actionsub);
 BA.debugLineNum = 863;BA.debugLine="ret.Image = Image";
Debug.ShouldStop(1073741824);
_ret.setField ("Image" /*RemoteObject*/ ,_image);
 BA.debugLineNum = 864;BA.debugLine="Return ret";
Debug.ShouldStop(-2147483648);
if (true) return _ret;
 BA.debugLineNum = 865;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketriplevalues(RemoteObject _ba,RemoteObject _value1,RemoteObject _value2,RemoteObject _value3) throws Exception{
try {
		Debug.PushSubsStack("MakeTripleValues (types) ","types",61,_ba,types.mostCurrent,549);
if (RapidSub.canDelegate("maketriplevalues")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","maketriplevalues", _ba, _value1, _value2, _value3);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._triplevalues");
;
Debug.locals.put("value1", _value1);
Debug.locals.put("value2", _value2);
Debug.locals.put("value3", _value3);
 BA.debugLineNum = 549;BA.debugLine="Sub MakeTripleValues(value1 As String, value2 As S";
Debug.ShouldStop(16);
 BA.debugLineNum = 550;BA.debugLine="Dim ret As TripleValues";
Debug.ShouldStop(32);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._triplevalues");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 551;BA.debugLine="ret.Initialize";
Debug.ShouldStop(64);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 552;BA.debugLine="ret.value1 = value1";
Debug.ShouldStop(128);
_ret.setField ("value1" /*RemoteObject*/ ,_value1);
 BA.debugLineNum = 553;BA.debugLine="ret.value2 = value2";
Debug.ShouldStop(256);
_ret.setField ("value2" /*RemoteObject*/ ,_value2);
 BA.debugLineNum = 554;BA.debugLine="ret.value3 = value3";
Debug.ShouldStop(512);
_ret.setField ("value3" /*RemoteObject*/ ,_value3);
 BA.debugLineNum = 555;BA.debugLine="Return ret";
Debug.ShouldStop(1024);
if (true) return _ret;
 BA.debugLineNum = 556;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketyperundatefilters(RemoteObject _ba,RemoteObject _datestart,RemoteObject _dateend) throws Exception{
try {
		Debug.PushSubsStack("MakeTypeRunDateFilters (types) ","types",61,_ba,types.mostCurrent,1307);
if (RapidSub.canDelegate("maketyperundatefilters")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","maketyperundatefilters", _ba, _datestart, _dateend);}
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._rundatefilters");
;
Debug.locals.put("DateStart", _datestart);
Debug.locals.put("DateEnd", _dateend);
 BA.debugLineNum = 1307;BA.debugLine="Sub MakeTypeRunDateFilters(DateStart As String, Da";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1308;BA.debugLine="Private this As RunDateFilters";
Debug.ShouldStop(134217728);
_this = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._rundatefilters");Debug.locals.put("this", _this);
 BA.debugLineNum = 1309;BA.debugLine="this.Initialize";
Debug.ShouldStop(268435456);
_this.runVoidMethod ("Initialize");
 BA.debugLineNum = 1310;BA.debugLine="this.DateStart = DateStart";
Debug.ShouldStop(536870912);
_this.setField ("DateStart" /*RemoteObject*/ ,_datestart);
 BA.debugLineNum = 1311;BA.debugLine="this.DateEnd = DateEnd";
Debug.ShouldStop(1073741824);
_this.setField ("DateEnd" /*RemoteObject*/ ,_dateend);
 BA.debugLineNum = 1312;BA.debugLine="Return this";
Debug.ShouldStop(-2147483648);
if (true) return _this;
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
public static RemoteObject  _makeunavailable(RemoteObject _ba,RemoteObject _startdate,RemoteObject _enddate,RemoteObject _reason) throws Exception{
try {
		Debug.PushSubsStack("MakeUnavailable (types) ","types",61,_ba,types.mostCurrent,1151);
if (RapidSub.canDelegate("makeunavailable")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeunavailable", _ba, _startdate, _enddate, _reason);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._unavailable");
;
Debug.locals.put("startDate", _startdate);
Debug.locals.put("endDate", _enddate);
Debug.locals.put("reason", _reason);
 BA.debugLineNum = 1151;BA.debugLine="Sub MakeUnavailable(startDate As String, endDate A";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1152;BA.debugLine="Dim ret As Unavailable";
Debug.ShouldStop(-2147483648);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._unavailable");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1153;BA.debugLine="ret.Initialize";
Debug.ShouldStop(1);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1154;BA.debugLine="ret.StartDate = startDate";
Debug.ShouldStop(2);
_ret.setField ("StartDate" /*RemoteObject*/ ,_startdate);
 BA.debugLineNum = 1155;BA.debugLine="ret.EndDate = endDate";
Debug.ShouldStop(4);
_ret.setField ("EndDate" /*RemoteObject*/ ,_enddate);
 BA.debugLineNum = 1156;BA.debugLine="ret.Reason = reason";
Debug.ShouldStop(8);
_ret.setField ("Reason" /*RemoteObject*/ ,_reason);
 BA.debugLineNum = 1157;BA.debugLine="Return ret";
Debug.ShouldStop(16);
if (true) return _ret;
 BA.debugLineNum = 1158;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeunavailable2(RemoteObject _ba,RemoteObject _startdate,RemoteObject _enddate,RemoteObject _reason,RemoteObject _cause) throws Exception{
try {
		Debug.PushSubsStack("MakeUnavailable2 (types) ","types",61,_ba,types.mostCurrent,1160);
if (RapidSub.canDelegate("makeunavailable2")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeunavailable2", _ba, _startdate, _enddate, _reason, _cause);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._unavailable2");
;
Debug.locals.put("startDate", _startdate);
Debug.locals.put("endDate", _enddate);
Debug.locals.put("reason", _reason);
Debug.locals.put("cause", _cause);
 BA.debugLineNum = 1160;BA.debugLine="Sub MakeUnavailable2(startDate As String, endDate";
Debug.ShouldStop(128);
 BA.debugLineNum = 1161;BA.debugLine="Dim ret As Unavailable2";
Debug.ShouldStop(256);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._unavailable2");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1162;BA.debugLine="ret.Initialize";
Debug.ShouldStop(512);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1163;BA.debugLine="ret.StartDate = startDate";
Debug.ShouldStop(1024);
_ret.setField ("StartDate" /*RemoteObject*/ ,_startdate);
 BA.debugLineNum = 1164;BA.debugLine="ret.EndDate = endDate";
Debug.ShouldStop(2048);
_ret.setField ("EndDate" /*RemoteObject*/ ,_enddate);
 BA.debugLineNum = 1165;BA.debugLine="ret.Reason = reason";
Debug.ShouldStop(4096);
_ret.setField ("Reason" /*RemoteObject*/ ,_reason);
 BA.debugLineNum = 1166;BA.debugLine="ret.cause = cause";
Debug.ShouldStop(8192);
_ret.setField ("Cause" /*RemoteObject*/ ,_cause);
 BA.debugLineNum = 1167;BA.debugLine="Return ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 1168;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeworkernewdata(RemoteObject _ba,RemoteObject _up_typeoper,RemoteObject _up_tagcode,RemoteObject _up_task,RemoteObject _up_itemtagcode) throws Exception{
try {
		Debug.PushSubsStack("MakeWorkerNewData (types) ","types",61,_ba,types.mostCurrent,1335);
if (RapidSub.canDelegate("makeworkernewdata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","makeworkernewdata", _ba, _up_typeoper, _up_tagcode, _up_task, _up_itemtagcode);}
RemoteObject _wndata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
;
Debug.locals.put("up_typeoper", _up_typeoper);
Debug.locals.put("up_tagcode", _up_tagcode);
Debug.locals.put("up_task", _up_task);
Debug.locals.put("up_itemtagcode", _up_itemtagcode);
 BA.debugLineNum = 1335;BA.debugLine="Sub MakeWorkerNewData(up_typeoper As Int, up_tagco";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1336;BA.debugLine="Private WNData As WorkerNewData";
Debug.ShouldStop(8388608);
_wndata = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._workernewdata");Debug.locals.put("WNData", _wndata);
 BA.debugLineNum = 1337;BA.debugLine="WNData.Initialize";
Debug.ShouldStop(16777216);
_wndata.runVoidMethod ("Initialize");
 BA.debugLineNum = 1338;BA.debugLine="WNData.up_typeoper = up_typeoper";
Debug.ShouldStop(33554432);
_wndata.setField ("up_typeoper" /*RemoteObject*/ ,_up_typeoper);
 BA.debugLineNum = 1339;BA.debugLine="WNData.up_tagcode = up_tagcode";
Debug.ShouldStop(67108864);
_wndata.setField ("up_tagcode" /*RemoteObject*/ ,_up_tagcode);
 BA.debugLineNum = 1340;BA.debugLine="WNData.up_task = up_task";
Debug.ShouldStop(134217728);
_wndata.setField ("up_task" /*RemoteObject*/ ,_up_task);
 BA.debugLineNum = 1341;BA.debugLine="WNData.up_itemtagcode = up_itemtagcode";
Debug.ShouldStop(268435456);
_wndata.setField ("up_itemtagcode" /*RemoteObject*/ ,_up_itemtagcode);
 BA.debugLineNum = 1342;BA.debugLine="Return WNData";
Debug.ShouldStop(536870912);
if (true) return _wndata;
 BA.debugLineNum = 1343;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newautoidentification(RemoteObject _ba,RemoteObject _tag,RemoteObject _objtagcode,RemoteObject _plate,RemoteObject _name,RemoteObject _model) throws Exception{
try {
		Debug.PushSubsStack("NewAutoIdentification (types) ","types",61,_ba,types.mostCurrent,1140);
if (RapidSub.canDelegate("newautoidentification")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","newautoidentification", _ba, _tag, _objtagcode, _plate, _name, _model);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._autoidentification");
;
Debug.locals.put("Tag", _tag);
Debug.locals.put("objTagcode", _objtagcode);
Debug.locals.put("Plate", _plate);
Debug.locals.put("Name", _name);
Debug.locals.put("Model", _model);
 BA.debugLineNum = 1140;BA.debugLine="Sub NewAutoIdentification(Tag As String, objTagcod";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1141;BA.debugLine="Dim ret As AutoIdentification";
Debug.ShouldStop(1048576);
_ret = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._autoidentification");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 1142;BA.debugLine="ret.Initialize";
Debug.ShouldStop(2097152);
_ret.runVoidMethod ("Initialize");
 BA.debugLineNum = 1143;BA.debugLine="ret.Tag = Tag";
Debug.ShouldStop(4194304);
_ret.setField ("Tag" /*RemoteObject*/ ,_tag);
 BA.debugLineNum = 1144;BA.debugLine="ret.Plate = Plate";
Debug.ShouldStop(8388608);
_ret.setField ("Plate" /*RemoteObject*/ ,_plate);
 BA.debugLineNum = 1145;BA.debugLine="ret.objTagcode = objTagcode";
Debug.ShouldStop(16777216);
_ret.setField ("objTagcode" /*RemoteObject*/ ,_objtagcode);
 BA.debugLineNum = 1146;BA.debugLine="ret.Name = Name";
Debug.ShouldStop(33554432);
_ret.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 1147;BA.debugLine="ret.Model = Model";
Debug.ShouldStop(67108864);
_ret.setField ("Model" /*RemoteObject*/ ,_model);
 BA.debugLineNum = 1148;BA.debugLine="Return ret";
Debug.ShouldStop(134217728);
if (true) return _ret;
 BA.debugLineNum = 1149;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objecttypesinlist(RemoteObject _ba,RemoteObject _otlist,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("ObjectTypesInList (types) ","types",61,_ba,types.mostCurrent,742);
if (RapidSub.canDelegate("objecttypesinlist")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","objecttypesinlist", _ba, _otlist, _title);}
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttypes");
int _n = 0;
RemoteObject _this = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttypes");
;
Debug.locals.put("otList", _otlist);
Debug.locals.put("title", _title);
 BA.debugLineNum = 742;BA.debugLine="Sub ObjectTypesInList(otList As List, title As Str";
Debug.ShouldStop(32);
 BA.debugLineNum = 743;BA.debugLine="Dim ret As ObjectTypes = MakeObjectTypes(0, \"\", \"";
Debug.ShouldStop(64);
_ret = _makeobjecttypes(_ba,BA.numberCast(int.class, 0),BA.ObjectToString(""),RemoteObject.createImmutable("(Todos)"));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 744;BA.debugLine="For n = 0 To otList.Size-1";
Debug.ShouldStop(128);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_otlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step2 > 0 && _n <= limit2) || (step2 < 0 && _n >= limit2) ;_n = ((int)(0 + _n + step2))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 745;BA.debugLine="Dim this As ObjectTypes = otList.Get(n)";
Debug.ShouldStop(256);
_this = (_otlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("this", _this);Debug.locals.put("this", _this);
 BA.debugLineNum = 746;BA.debugLine="If this.title = title Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_this.getField(true,"title" /*RemoteObject*/ ),_title)) { 
 BA.debugLineNum = 747;BA.debugLine="ret = this";
Debug.ShouldStop(1024);
_ret = _this;Debug.locals.put("ret", _ret);
 BA.debugLineNum = 748;BA.debugLine="Exit";
Debug.ShouldStop(2048);
if (true) break;
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 751;BA.debugLine="Return ret";
Debug.ShouldStop(16384);
if (true) return _ret;
 BA.debugLineNum = 752;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Type RowPanelInfo(Pan As Panel, Height As Int)";
;
 //BA.debugLineNum = 5;BA.debugLine="Type ChapterRow(ID As Int, ItemTagcode As String,";
;
 //BA.debugLineNum = 6;BA.debugLine="Type ReturnFieldData(item_tagcode As String, fiel";
;
 //BA.debugLineNum = 7;BA.debugLine="Type FileDownloadInformation(Downloaded As Boolea";
;
 //BA.debugLineNum = 8;BA.debugLine="Type CreateRequestReturn(RequestTagcode As String";
;
 //BA.debugLineNum = 9;BA.debugLine="Type OtherReturnValues(RetValue As String, RetSav";
;
 //BA.debugLineNum = 10;BA.debugLine="Type MandatoryRecords(item_tagcode As String, man";
;
 //BA.debugLineNum = 11;BA.debugLine="Type ComponentRecords(component As B4XView, idgro";
;
 //BA.debugLineNum = 12;BA.debugLine="Type B4XSRecords(component As B4XStateButton, idg";
;
 //BA.debugLineNum = 13;BA.debugLine="Type FieldReference(tagname As String, tagobject";
;
 //BA.debugLineNum = 14;BA.debugLine="Type ExternalDocsInfo(status As Int, refdoc As St";
;
 //BA.debugLineNum = 15;BA.debugLine="Type RunTypeAction(tagcode As String, title As St";
;
 //BA.debugLineNum = 16;BA.debugLine="Type NewObjectTags(ObjectTag As String, AddressTa";
;
 //BA.debugLineNum = 17;BA.debugLine="Type MNOWTU( MAKE_New_Object As Int, UPD_Existing";
;
 //BA.debugLineNum = 22;BA.debugLine="Type ShotFoto(FileName As String, DateNTime As St";
;
 //BA.debugLineNum = 23;BA.debugLine="Type StatusFilterTask(active As Boolean, inactive";
;
 //BA.debugLineNum = 24;BA.debugLine="Type TripleValues(value1 As String, value2 As Str";
;
 //BA.debugLineNum = 25;BA.debugLine="Type MarkerInfo(Latitude As String, Longitude As";
;
 //BA.debugLineNum = 26;BA.debugLine="Type PieValuesType(Name As String, Value As Int,";
;
 //BA.debugLineNum = 27;BA.debugLine="Type CLAIEvent(event_tagcode As String,position A";
;
 //BA.debugLineNum = 32;BA.debugLine="Type Intent(name As String)";
;
 //BA.debugLineNum = 33;BA.debugLine="Type PointApi(X As Float, Y As Float)";
;
 //BA.debugLineNum = 37;BA.debugLine="Type PageA4(A4Size As Double, A4Margins As Double";
;
 //BA.debugLineNum = 44;BA.debugLine="Type PageData(PagesOut As List, PageNumber As Int";
;
 //BA.debugLineNum = 50;BA.debugLine="Type ActivityParams(activ As Activity, activObj A";
;
 //BA.debugLineNum = 52;BA.debugLine="Type TagListType(tagcode As String, tagname As St";
;
 //BA.debugLineNum = 53;BA.debugLine="Type TableCounters(tablename As String, counter A";
;
 //BA.debugLineNum = 54;BA.debugLine="Type DownUpFile(Filename As String, FileType As S";
;
 //BA.debugLineNum = 55;BA.debugLine="Type FileShot(Folder As String, Filename As Strin";
;
 //BA.debugLineNum = 56;BA.debugLine="Type DB_ITC(ID As Int, Title As String, Color As";
;
 //BA.debugLineNum = 57;BA.debugLine="Type DeviceInformation(Description As String, Siz";
;
 //BA.debugLineNum = 58;BA.debugLine="Type CodeNameList(TagCode As String, Name As Stri";
;
 //BA.debugLineNum = 59;BA.debugLine="Type ResultOptions(ValInt As Int, ValStr As Strin";
;
 //BA.debugLineNum = 60;BA.debugLine="Type ExtraInfo(titleinfo As String, textoInfo As";
;
 //BA.debugLineNum = 62;BA.debugLine="Type CLATaskItem(task_tagcode As String,item_tagc";
;
 //BA.debugLineNum = 73;BA.debugLine="Type CLA_Items(Task As String, Item As String, Un";
;
 //BA.debugLineNum = 75;BA.debugLine="Type RequestCLAItem(Request As String, Action As";
;
 //BA.debugLineNum = 92;BA.debugLine="Type TestRequestItem(Request As String, Action As";
;
 //BA.debugLineNum = 106;BA.debugLine="Type OtherCLA(Filter As String, Filter2 As String";
;
 //BA.debugLineNum = 108;BA.debugLine="Type RequestTaskInfo(RequestType As Int, CloseTyp";
;
 //BA.debugLineNum = 110;BA.debugLine="Type RequestCLA(Request As String, Action As Stri";
;
 //BA.debugLineNum = 111;BA.debugLine="Type RequestCLAOBS(child As Boolean, cla As Reque";
;
 //BA.debugLineNum = 112;BA.debugLine="Type RequestInfo(Request As String, RIEntity As S";
;
 //BA.debugLineNum = 116;BA.debugLine="Type RequestData(Tagcode As String, Entity As Str";
;
 //BA.debugLineNum = 119;BA.debugLine="Type Authorization(Instance As String, Authorizat";
;
 //BA.debugLineNum = 123;BA.debugLine="Type ComposedButtonDefs(PanelColor As Int, IconCo";
;
 //BA.debugLineNum = 125;BA.debugLine="Type Point(X As Int, Y As Int)";
;
 //BA.debugLineNum = 126;BA.debugLine="Type RRefer( Left As Int, Top As Int, Right As In";
;
 //BA.debugLineNum = 127;BA.debugLine="Type PinPoint(fileName As String, bmrIndex As Int";
;
 //BA.debugLineNum = 128;BA.debugLine="Type BMR(btm As B4XBitmap, rct As RRefer)";
;
 //BA.debugLineNum = 129;BA.debugLine="Type GeoData(lat As String, lon As String, date A";
;
 //BA.debugLineNum = 131;BA.debugLine="Type Intervention(id As Int, code As String, stat";
;
 //BA.debugLineNum = 134;BA.debugLine="Type RequestFilter(SDate As String, EDate As Stri";
;
 //BA.debugLineNum = 137;BA.debugLine="Type EntityFilter(TypeEntity As Int, Status As In";
;
 //BA.debugLineNum = 138;BA.debugLine="Type KPIFilter(period As Int, SDate As String, ED";
;
 //BA.debugLineNum = 139;BA.debugLine="Type ObjectFilter(TypeObject As Int, ZoneObject A";
;
 //BA.debugLineNum = 140;BA.debugLine="Type TaskFilter(TypeTask As Int, Status As Int, U";
;
 //BA.debugLineNum = 142;BA.debugLine="Type Unavailable(StartDate As String, EndDate As";
;
 //BA.debugLineNum = 143;BA.debugLine="Type Unavailable2(StartDate As String, EndDate As";
;
 //BA.debugLineNum = 144;BA.debugLine="Type AutoIdentification(Tag As String, objTagcode";
;
 //BA.debugLineNum = 148;BA.debugLine="Type Address(AddressType As Int, AddressName As S";
;
 //BA.debugLineNum = 155;BA.debugLine="Type GeoReference(Latitude As String, Longitude A";
;
 //BA.debugLineNum = 156;BA.debugLine="Type ContactRecord(contactType As Int, contactNam";
;
 //BA.debugLineNum = 159;BA.debugLine="Type EntityInformation(tagcode As String, entType";
;
 //BA.debugLineNum = 162;BA.debugLine="Type ObjectInformation(tagcode As String, iType A";
;
 //BA.debugLineNum = 165;BA.debugLine="Type ObjectType(tagcode As String, title As Strin";
;
 //BA.debugLineNum = 168;BA.debugLine="Type CLAStatus(Status As Int, StartDate As String";
;
 //BA.debugLineNum = 171;BA.debugLine="Type CLAData(Request As String, Action As String,";
;
 //BA.debugLineNum = 174;BA.debugLine="Type RunDateFilters(DateStart As String, DateEnd";
;
 //BA.debugLineNum = 176;BA.debugLine="Public Const ZONEOBJECTSFILTER As List = Array As";
types._zoneobjectsfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
types._zoneobjectsfilter = types.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("Todos"),BA.ObjectToString("Intervenções do dia"),BA.ObjectToString("Intervenções agendadas"),RemoteObject.createImmutable("Localização periférica")})));
 //BA.debugLineNum = 178;BA.debugLine="Public Const COLLAPSE_ICON As String = Chr(0xF106";
types._collapse_icon = BA.ObjectToString(types.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf106))));
 //BA.debugLineNum = 179;BA.debugLine="Public Const EXPAND_ICON As String = Chr(0xF107)";
types._expand_icon = BA.ObjectToString(types.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf107))));
 //BA.debugLineNum = 182;BA.debugLine="Type ObjectTypes(id As Int, tagcode As String, ti";
;
 //BA.debugLineNum = 183;BA.debugLine="Type CarObject(obj As String, brand As String, mo";
;
 //BA.debugLineNum = 184;BA.debugLine="Type ImageViewData(b64 As String, filename As Str";
;
 //BA.debugLineNum = 185;BA.debugLine="Type WorkerNewData(up_typeoper As Int, up_tagcode";
;
 //BA.debugLineNum = 186;BA.debugLine="Type SingleCLAItem(request_tc As String, task_tc";
;
 //BA.debugLineNum = 187;BA.debugLine="Type ReturnFromCantrolSub(TypeOfControl As Int, S";
;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _setgeodata(RemoteObject _ba,RemoteObject _lat,RemoteObject _lon) throws Exception{
try {
		Debug.PushSubsStack("setGeoData (types) ","types",61,_ba,types.mostCurrent,1203);
if (RapidSub.canDelegate("setgeodata")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","setgeodata", _ba, _lat, _lon);}
RemoteObject _g = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._geodata");
;
Debug.locals.put("lat", _lat);
Debug.locals.put("lon", _lon);
 BA.debugLineNum = 1203;BA.debugLine="Sub setGeoData(lat As String, lon As String) As Ge";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1204;BA.debugLine="Dim g As GeoData";
Debug.ShouldStop(524288);
_g = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._geodata");Debug.locals.put("g", _g);
 BA.debugLineNum = 1205;BA.debugLine="g.Initialize";
Debug.ShouldStop(1048576);
_g.runVoidMethod ("Initialize");
 BA.debugLineNum = 1206;BA.debugLine="g.lat = lat";
Debug.ShouldStop(2097152);
_g.setField ("lat" /*RemoteObject*/ ,_lat);
 BA.debugLineNum = 1207;BA.debugLine="g.lon = lon";
Debug.ShouldStop(4194304);
_g.setField ("lon" /*RemoteObject*/ ,_lon);
 BA.debugLineNum = 1208;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
Debug.ShouldStop(8388608);
types.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH:mm:ss"));
 BA.debugLineNum = 1209;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(16777216);
types.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 1210;BA.debugLine="g.date = $\"$date{DateTime.Now} $time{DateTime.Now";
Debug.ShouldStop(33554432);
_g.setField ("date" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),types.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((types.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(" "),types.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("time")),(Object)((types.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1212;BA.debugLine="Return g";
Debug.ShouldStop(134217728);
if (true) return _g;
 BA.debugLineNum = 1213;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgeodatadt(RemoteObject _ba,RemoteObject _lat,RemoteObject _lon,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("setGeoDataDT (types) ","types",61,_ba,types.mostCurrent,1215);
if (RapidSub.canDelegate("setgeodatadt")) { return xevolution.vrcg.devdemov2400.types.remoteMe.runUserSub(false, "types","setgeodatadt", _ba, _lat, _lon, _date);}
RemoteObject _g = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._geodata");
;
Debug.locals.put("lat", _lat);
Debug.locals.put("lon", _lon);
Debug.locals.put("date", _date);
 BA.debugLineNum = 1215;BA.debugLine="Sub setGeoDataDT(lat As String, lon As String, dat";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1216;BA.debugLine="Dim g As GeoData";
Debug.ShouldStop(-2147483648);
_g = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._geodata");Debug.locals.put("g", _g);
 BA.debugLineNum = 1217;BA.debugLine="g.Initialize";
Debug.ShouldStop(1);
_g.runVoidMethod ("Initialize");
 BA.debugLineNum = 1218;BA.debugLine="g.lat = lat";
Debug.ShouldStop(2);
_g.setField ("lat" /*RemoteObject*/ ,_lat);
 BA.debugLineNum = 1219;BA.debugLine="g.lon = lon";
Debug.ShouldStop(4);
_g.setField ("lon" /*RemoteObject*/ ,_lon);
 BA.debugLineNum = 1220;BA.debugLine="g.date = date";
Debug.ShouldStop(8);
_g.setField ("date" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 1221;BA.debugLine="Return g";
Debug.ShouldStop(16);
if (true) return _g;
 BA.debugLineNum = 1222;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}