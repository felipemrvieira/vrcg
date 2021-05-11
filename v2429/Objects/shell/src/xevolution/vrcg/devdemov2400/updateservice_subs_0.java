package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class updateservice_subs_0 {


public static void  _downloadfileswithftp(RemoteObject _isfirsttime,RemoteObject _datacontrol) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,232);
if (RapidSub.canDelegate("downloadfileswithftp")) { xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","downloadfileswithftp", _isfirsttime, _datacontrol); return;}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_isfirsttime,_datacontrol);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.updateservice parent,RemoteObject _isfirsttime,RemoteObject _datacontrol) {
this.parent = parent;
this._isfirsttime = _isfirsttime;
this._datacontrol = _datacontrol;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.updateservice parent;
RemoteObject _isfirsttime;
RemoteObject _datacontrol;
RemoteObject _flist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _ext = RemoteObject.createImmutable("");
RemoteObject _flistlast = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fname1 = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._downupfile");
RemoteObject _makecopy = RemoteObject.createImmutable(false);
RemoteObject _sf = RemoteObject.declareNull("Object");
int step14;
int limit14;
int step30;
int limit30;
int step46;
int limit46;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,232);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("isfirsttime", _isfirsttime);
Debug.locals.put("datacontrol", _datacontrol);
 BA.debugLineNum = 233;BA.debugLine="If (Not(isfirsttime)) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 67;
if ((parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_isfirsttime))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 234;BA.debugLine="If (Utils.isNullOrEmpty(datacontrol)) Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,updateservice.processBA,(Object)(_datacontrol))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 235;BA.debugLine="datacontrol = Utils.GetCurrentDate 'Utils.GetLa";
Debug.ShouldStop(1024);
_datacontrol = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,updateservice.processBA);Debug.locals.put("datacontrol", _datacontrol);
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 242;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192872458",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 243;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APP_DOMAIN} \"$)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192872459",(RemoteObject.concat(RemoteObject.createImmutable(" 		INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 244;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192872460",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 245;BA.debugLine="Dim flist As List  ' = File.ListFiles(Starter.In";
Debug.ShouldStop(1048576);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 247;BA.debugLine="Dim sfl As Object = Starter.GlobalFTP.List(\"/\" &";
Debug.ShouldStop(4194304);
_sfl = parent.mostCurrent._starter._globalftp /*RemoteObject*/ .runMethod(false,"List",updateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 248;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", updateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "downloadfileswithftp"), _sfl);
this.state = 68;
return;
case 68:
//C
this.state = 8;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 249;BA.debugLine="If Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 8:
//if
this.state = 29;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 256;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 11:
//if
this.state = 28;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 257;BA.debugLine="flist.Initialize";
Debug.ShouldStop(1);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 258;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(2);
if (true) break;

case 14:
//for
this.state = 27;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 69;
if (true) break;

case 69:
//C
this.state = 27;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 16;
if (true) break;

case 70:
//C
this.state = 69;
_i = ((int)(0 + _i + step14)) ;
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 259;BA.debugLine="Dim fName As String = Files(i).Name";
Debug.ShouldStop(4);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 260;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWit";
Debug.ShouldStop(8);
if (true) break;

case 17:
//if
this.state = 26;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))))) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 261;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
Debug.ShouldStop(16);
_ext = _fname.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 262;BA.debugLine="If (Files(i).Timestamp >= DateTime.DateParse";
Debug.ShouldStop(32);
if (true) break;

case 20:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_datacontrol))))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 263;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Nam";
Debug.ShouldStop(64);
_flist.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,updateservice.processBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 if (true) break;

case 26:
//C
this.state = 70;
;
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
Debug.locals.put("i", _i);
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;
;
 BA.debugLineNum = 272;BA.debugLine="If (flist.IsInitialized) Then";
Debug.ShouldStop(32768);

case 29:
//if
this.state = 66;
if ((_flist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 273;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(65536);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 274;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(131072);
_flistlast.runVoidMethod ("Initialize");
 BA.debugLineNum = 278;BA.debugLine="If (flist.Size>=1) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 32:
//if
this.state = 52;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 279;BA.debugLine="For i=0 To flist.Size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 35:
//for
this.state = 51;
step30 = 1;
limit30 = RemoteObject.solve(new RemoteObject[] {_flist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 71;
if (true) break;

case 71:
//C
this.state = 51;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 37;
if (true) break;

case 72:
//C
this.state = 71;
_i = ((int)(0 + _i + step30)) ;
Debug.locals.put("i", _i);
if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 280;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
Debug.ShouldStop(8388608);
_fname1 = (_flist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 281;BA.debugLine="Dim makeCopy As Boolean = False";
Debug.ShouldStop(16777216);
_makecopy = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 282;BA.debugLine="If (File.Exists(Starter.InternalFolder, fName";
Debug.ShouldStop(33554432);
if (true) break;

case 38:
//if
this.state = 47;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname1.getField(true,"Filename" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
this.state = 40;
}else {
this.state = 46;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 283;BA.debugLine="If (fName1.FileDateTime > File.LastModified(";
Debug.ShouldStop(67108864);
if (true) break;

case 41:
//if
this.state = 44;
if ((RemoteObject.solveBoolean(">",_fname1.getField(true,"FileDateTime" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(false,"File").runMethod(true,"LastModified",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname1.getField(true,"Filename" /*RemoteObject*/ )))))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 284;BA.debugLine="makeCopy = True";
Debug.ShouldStop(134217728);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);
 if (true) break;

case 44:
//C
this.state = 47;
;
 if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 287;BA.debugLine="makeCopy = True";
Debug.ShouldStop(1073741824);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);
 if (true) break;
;
 BA.debugLineNum = 290;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(2);

case 47:
//if
this.state = 50;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 291;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(4);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 50:
//C
this.state = 72;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 299;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(1024);

case 52:
//if
this.state = 65;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 300;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(2048);
if (true) break;

case 55:
//for
this.state = 64;
step46 = 1;
limit46 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 73;
if (true) break;

case 73:
//C
this.state = 64;
if ((step46 > 0 && _i <= limit46) || (step46 < 0 && _i >= limit46)) this.state = 57;
if (true) break;

case 74:
//C
this.state = 73;
_i = ((int)(0 + _i + step46)) ;
Debug.locals.put("i", _i);
if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 301;BA.debugLine="Dim fName As String = flistLast.Get(i)";
Debug.ShouldStop(4096);
_fname = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 303;BA.debugLine="Log(fName)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192872519",_fname,0);
 BA.debugLineNum = 304;BA.debugLine="Dim sf As Object = Starter.GlobalFTP.Download";
Debug.ShouldStop(32768);
_sf = parent.mostCurrent._starter._globalftp /*RemoteObject*/ .runMethod(false,"DownloadFile",updateservice.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 305;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", updateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "downloadfileswithftp"), _sf);
this.state = 75;
return;
case 75:
//C
this.state = 58;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 306;BA.debugLine="If Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 58:
//if
this.state = 63;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
 BA.debugLineNum = 307;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192872523",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 309;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192872525",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;

case 63:
//C
this.state = 74;
;
 if (true) break;
if (true) break;

case 64:
//C
this.state = 65;
Debug.locals.put("i", _i);
;
 if (true) break;

case 65:
//C
this.state = 66;
;
 if (true) break;

case 66:
//C
this.state = 67;
;
 if (true) break;

case 67:
//C
this.state = -1;
;
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static void  _ftp_listcompleted(RemoteObject _serverpath,RemoteObject _success,RemoteObject _folders,RemoteObject _files) throws Exception{
}
public static void  _ftp_downloadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static void  _downloadtable(RemoteObject _groupname,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("DownloadTable (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,119);
if (RapidSub.canDelegate("downloadtable")) { xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","downloadtable", _groupname, _tablename); return;}
ResumableSub_DownloadTable rsub = new ResumableSub_DownloadTable(null,_groupname,_tablename);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DownloadTable extends BA.ResumableSub {
public ResumableSub_DownloadTable(xevolution.vrcg.devdemov2400.updateservice parent,RemoteObject _groupname,RemoteObject _tablename) {
this.parent = parent;
this._groupname = _groupname;
this._tablename = _tablename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.updateservice parent;
RemoteObject _groupname;
RemoteObject _tablename;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadTable (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,119);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("groupName", _groupname);
Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 120;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(8388608);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/download/table/update")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 121;BA.debugLine="Log(\"**********  \" & tablename & \"  ***********\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192610306",RemoteObject.concat(RemoteObject.createImmutable("**********  "),_tablename,RemoteObject.createImmutable("  ***********")),0);
 BA.debugLineNum = 122;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(33554432);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 123;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,updateservice.processBA,(Object)(BA.ObjectToString("")),(Object)(updateservice.getObject()));
 BA.debugLineNum = 124;BA.debugLine="Job.PostString(ServerAddress, MakeTableMaps(group";
Debug.ShouldStop(134217728);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_maketablemaps(_groupname,_tablename)));
 BA.debugLineNum = 125;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(268435456);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 127;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", updateservice.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "downloadtable"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 128;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 12;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 129;BA.debugLine="Try";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 130;BA.debugLine="InsertUpdateTable(Job.GetString)";
Debug.ShouldStop(2);
_insertupdatetable(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 132;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192610317",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",updateservice.processBA)),0);
 BA.debugLineNum = 133;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,updateservice.processBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",updateservice.processBA))));
 BA.debugLineNum = 134;BA.debugLine="Utils.logError($\"Download ${groupName}: \"$, Sha";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,updateservice.processBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Download "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_groupname))),RemoteObject.createImmutable(": ")))),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",updateservice.processBA))));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 137;BA.debugLine="Utils.logError($\"Download ${groupName}: \"$, Shar";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,updateservice.processBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("Download "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_groupname))),RemoteObject.createImmutable(": ")))),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 139;BA.debugLine="Job.Release";
Debug.ShouldStop(1024);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",updateservice.processBA, e0.toString());}
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _getallexistingrecords(RemoteObject _tablename,RemoteObject _idlists) throws Exception{
try {
		Debug.PushSubsStack("GetAllExistingRecords (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,189);
if (RapidSub.canDelegate("getallexistingrecords")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","getallexistingrecords", _tablename, _idlists);}
RemoteObject _retlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _mid = RemoteObject.createImmutable(0);
Debug.locals.put("tablename", _tablename);
Debug.locals.put("idLists", _idlists);
 BA.debugLineNum = 189;BA.debugLine="Sub GetAllExistingRecords(tablename As String, idL";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Dim retList As List";
Debug.ShouldStop(536870912);
_retlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("retList", _retlist);
 BA.debugLineNum = 191;BA.debugLine="retList.Initialize";
Debug.ShouldStop(1073741824);
_retlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="If (Utils.NNE(idLists)) Then";
Debug.ShouldStop(-2147483648);
if ((updateservice.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,updateservice.processBA,(Object)(_idlists))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 193;BA.debugLine="Dim sSQL As String = $\"Select id from ${tablenam";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("Select id from "),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable(" where id in "),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idlists))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 194;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(2);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 195;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 196;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(8);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), updateservice.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 197;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 198;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(32);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _row.<Integer>get().intValue() <= limit9) || (step9 < 0 && _row.<Integer>get().intValue() >= limit9) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 199;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(64);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 200;BA.debugLine="Dim mID As Int = Record.GetInt(\"id\")";
Debug.ShouldStop(128);
_mid = _record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 201;BA.debugLine="retList.Add(mID)";
Debug.ShouldStop(256);
_retlist.runVoidMethod ("Add",(Object)((_mid)));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 204;BA.debugLine="Record.Close";
Debug.ShouldStop(2048);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 206;BA.debugLine="Return retList";
Debug.ShouldStop(8192);
if (true) return _retlist;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlistmapsid(RemoteObject _innerlist) throws Exception{
try {
		Debug.PushSubsStack("GetListMapsID (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,212);
if (RapidSub.canDelegate("getlistmapsid")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","getlistmapsid", _innerlist);}
RemoteObject _itemslist = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable(0);
Debug.locals.put("innerList", _innerlist);
 BA.debugLineNum = 212;BA.debugLine="Sub GetListMapsID(innerList As List) As String 'Li";
Debug.ShouldStop(524288);
 BA.debugLineNum = 215;BA.debugLine="Dim itemsList As String = \"\"";
Debug.ShouldStop(4194304);
_itemslist = BA.ObjectToString("");Debug.locals.put("itemsList", _itemslist);Debug.locals.put("itemsList", _itemslist);
 BA.debugLineNum = 216;BA.debugLine="For Each row As Map In innerList";
Debug.ShouldStop(8388608);
_row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group2 = _innerlist;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_row = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group2.runMethod(false,"Get",index2));
Debug.locals.put("row", _row);
 BA.debugLineNum = 217;BA.debugLine="Dim ID As Int = row.Get(\"id\")";
Debug.ShouldStop(16777216);
_id = BA.numberCast(int.class, _row.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 218;BA.debugLine="If Utils.NNE(itemsList) Then";
Debug.ShouldStop(33554432);
if (updateservice.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,updateservice.processBA,(Object)(_itemslist)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 219;BA.debugLine="itemsList = $\"${itemsList},\"$";
Debug.ShouldStop(67108864);
_itemslist = (RemoteObject.concat(RemoteObject.createImmutable(""),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemslist))),RemoteObject.createImmutable(",")));Debug.locals.put("itemsList", _itemslist);
 };
 BA.debugLineNum = 221;BA.debugLine="itemsList = $\"${itemsList}${ID}\"$";
Debug.ShouldStop(268435456);
_itemslist = (RemoteObject.concat(RemoteObject.createImmutable(""),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemslist))),RemoteObject.createImmutable(""),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable("")));Debug.locals.put("itemsList", _itemslist);
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 225;BA.debugLine="If Utils.NNE(itemsList) Then";
Debug.ShouldStop(1);
if (updateservice.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,updateservice.processBA,(Object)(_itemslist)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="itemsList = $\"(${itemsList})\"$";
Debug.ShouldStop(2);
_itemslist = (RemoteObject.concat(RemoteObject.createImmutable("("),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemslist))),RemoteObject.createImmutable(")")));Debug.locals.put("itemsList", _itemslist);
 };
 BA.debugLineNum = 229;BA.debugLine="Return itemsList 'retList";
Debug.ShouldStop(16);
if (true) return _itemslist;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _innerupdate_evc_ori() throws Exception{
try {
		Debug.PushSubsStack("innerUpdate_EVC_ORI (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,320);
if (RapidSub.canDelegate("innerupdate_evc_ori")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","innerupdate_evc_ori");}
 BA.debugLineNum = 320;BA.debugLine="Sub innerUpdate_EVC_ORI";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertupdatetable(RemoteObject _datares) throws Exception{
try {
		Debug.PushSubsStack("InsertUpdateTable (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,146);
if (RapidSub.canDelegate("insertupdatetable")) { xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","insertupdatetable", _datares); return;}
ResumableSub_InsertUpdateTable rsub = new ResumableSub_InsertUpdateTable(null,_datares);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InsertUpdateTable extends BA.ResumableSub {
public ResumableSub_InsertUpdateTable(xevolution.vrcg.devdemov2400.updateservice parent,RemoteObject _datares) {
this.parent = parent;
this._datares = _datares;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.updateservice parent;
RemoteObject _datares;
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _status = RemoteObject.createImmutable(0);
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coldata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _table = RemoteObject.createImmutable("");
RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _stridlist = RemoteObject.createImmutable("");
RemoteObject _idlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i1 = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group7;
int index7;
int groupLen7;
int step16;
int limit16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InsertUpdateTable (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,146);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("datares", _datares);
 BA.debugLineNum = 147;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(262144);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 148;BA.debugLine="parser.Initialize(datares)";
Debug.ShouldStop(524288);
_parser.runVoidMethod ("Initialize",(Object)(_datares));
 BA.debugLineNum = 149;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(1048576);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 151;BA.debugLine="Dim status As Int = root.Get(\"status\")";
Debug.ShouldStop(4194304);
_status = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 152;BA.debugLine="If (status = 1) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 24;
if ((RemoteObject.solveBoolean("=",_status,BA.numberCast(double.class, 1)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 153;BA.debugLine="Dim data As List = root.Get(\"data\")";
Debug.ShouldStop(16777216);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data")))));Debug.locals.put("data", _data);
 BA.debugLineNum = 154;BA.debugLine="For Each coldata As Map In data";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//for
this.state = 23;
_coldata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group7 = _data;
index7 = 0;
groupLen7 = group7.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coldata", _coldata);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 23;
if (index7 < groupLen7) {
this.state = 6;
_coldata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group7.runMethod(false,"Get",index7));}
if (true) break;

case 26:
//C
this.state = 25;
index7++;
Debug.locals.put("coldata", _coldata);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 155;BA.debugLine="Dim table As String = coldata.Get(\"table\")";
Debug.ShouldStop(67108864);
_table = BA.ObjectToString(_coldata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 156;BA.debugLine="Dim rows As List = coldata.Get(\"rows\")";
Debug.ShouldStop(134217728);
_rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rows = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _coldata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("rows")))));Debug.locals.put("rows", _rows);
 BA.debugLineNum = 158;BA.debugLine="If (rows.IsInitialized) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//if
this.state = 22;
if ((_rows.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 161;BA.debugLine="Dim strIDList As String = GetListMapsID(rows)";
Debug.ShouldStop(1);
_stridlist = _getlistmapsid(_rows);Debug.locals.put("strIDList", _stridlist);Debug.locals.put("strIDList", _stridlist);
 BA.debugLineNum = 162;BA.debugLine="Dim IDList As List = GetAllExistingRecords(tab";
Debug.ShouldStop(2);
_idlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_idlist = _getallexistingrecords(_table,_stridlist);Debug.locals.put("IDList", _idlist);Debug.locals.put("IDList", _idlist);
 BA.debugLineNum = 165;BA.debugLine="DBUtils.InsertMaps2(Starter.LocalSQLEVC, table";
Debug.ShouldStop(16);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps2" /*RemoteObject*/ ,updateservice.processBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_rows),(Object)(_idlist));
 BA.debugLineNum = 166;BA.debugLine="Sleep(100)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",updateservice.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "insertupdatetable"),BA.numberCast(int.class, 100));
this.state = 27;
return;
case 27:
//C
this.state = 10;
;
 BA.debugLineNum = 170;BA.debugLine="If (IDList.Size >=1) Then";
Debug.ShouldStop(512);
if (true) break;

case 10:
//if
this.state = 21;
if ((RemoteObject.solveBoolean("g",_idlist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 171;BA.debugLine="For i1 = 0 To rows.Size - 1";
Debug.ShouldStop(1024);
if (true) break;

case 13:
//for
this.state = 20;
step16 = 1;
limit16 = RemoteObject.solve(new RemoteObject[] {_rows.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i1 = 0 ;
Debug.locals.put("i1", _i1);
this.state = 28;
if (true) break;

case 28:
//C
this.state = 20;
if ((step16 > 0 && _i1 <= limit16) || (step16 < 0 && _i1 >= limit16)) this.state = 15;
if (true) break;

case 29:
//C
this.state = 28;
_i1 = ((int)(0 + _i1 + step16)) ;
Debug.locals.put("i1", _i1);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 172;BA.debugLine="Dim m As Map = rows.Get(i1)";
Debug.ShouldStop(2048);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _rows.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i1))));Debug.locals.put("m", _m);
 BA.debugLineNum = 173;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
Debug.ShouldStop(4096);
_mid = BA.numberCast(int.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 174;BA.debugLine="If (IDList.IndexOf(mID) >=0) Then";
Debug.ShouldStop(8192);
if (true) break;

case 16:
//if
this.state = 19;
if ((RemoteObject.solveBoolean("g",_idlist.runMethod(true,"IndexOf",(Object)((_mid))),BA.numberCast(double.class, 0)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 175;BA.debugLine="Dim Mapping As Map";
Debug.ShouldStop(16384);
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Mapping", _mapping);
 BA.debugLineNum = 176;BA.debugLine="Mapping.Initialize";
Debug.ShouldStop(32768);
_mapping.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="Mapping.Put(\"id\", mID)";
Debug.ShouldStop(65536);
_mapping.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_mid)));
 BA.debugLineNum = 178;BA.debugLine="DBUtils.UpdateRecord2(Starter.LocalSQLEVC,";
Debug.ShouldStop(131072);
parent.mostCurrent._dbutils.runVoidMethod ("_updaterecord2" /*RemoteObject*/ ,updateservice.processBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_m),(Object)(_mapping));
 BA.debugLineNum = 179;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQL";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_updaterecord2withlog" /*RemoteObject*/ ,updateservice.processBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(_table),(Object)(_m),(Object)(_mapping),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 if (true) break;

case 19:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("i1", _i1);
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
Debug.locals.put("coldata", _coldata);
;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 187;BA.debugLine="End Sub";
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
public static RemoteObject  _maketablemaps(RemoteObject _groupname,RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("MakeTableMaps (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,66);
if (RapidSub.canDelegate("maketablemaps")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","maketablemaps", _groupname, _tablename);}
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
Debug.locals.put("groupName", _groupname);
Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 66;BA.debugLine="Sub MakeTableMaps(groupName As String, tablename A";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 68;BA.debugLine="params.Initialize";
Debug.ShouldStop(8);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="params.Clear";
Debug.ShouldStop(16);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 70;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((updateservice.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((updateservice.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((updateservice.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="params.Put(\"_team\", ShareCode.SESS_User)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_team"))),(Object)((updateservice.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 74;BA.debugLine="params.Put(\"groupname\", groupName)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("groupname"))),(Object)((_groupname)));
 BA.debugLineNum = 75;BA.debugLine="params.Put(\"tablename\", tablename)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tablename"))),(Object)((_tablename)));
 BA.debugLineNum = 76;BA.debugLine="params.Put(\"data\", mapAllExistingRecords(tablenam";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_mapallexistingrecords(_tablename).getObject())));
 BA.debugLineNum = 77;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((updateservice.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((updateservice.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 79;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((updateservice.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((updateservice.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((updateservice.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 82;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((updateservice.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 84;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(524288);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 85;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1048576);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 87;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(4194304);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 88;BA.debugLine="Log(data)";
Debug.ShouldStop(8388608);
updateservice.mostCurrent.__c.runVoidMethod ("LogImpl","6192479254",_data,0);
 BA.debugLineNum = 89;BA.debugLine="Return data";
Debug.ShouldStop(16777216);
if (true) return _data;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapallexistingrecords(RemoteObject _tablename) throws Exception{
try {
		Debug.PushSubsStack("mapAllExistingRecords (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,92);
if (RapidSub.canDelegate("mapallexistingrecords")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","mapallexistingrecords", _tablename);}
RemoteObject _retlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _par2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("tablename", _tablename);
 BA.debugLineNum = 92;BA.debugLine="Sub mapAllExistingRecords(tablename As String) As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim retList As List";
Debug.ShouldStop(268435456);
_retlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("retList", _retlist);
 BA.debugLineNum = 94;BA.debugLine="retList.Initialize";
Debug.ShouldStop(536870912);
_retlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 95;BA.debugLine="If (Utils.NNE(tablename)) Then";
Debug.ShouldStop(1073741824);
if ((updateservice.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,updateservice.processBA,(Object)(_tablename))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 96;BA.debugLine="Dim sSQL As String = $\"Select tagcode, updated_a";
Debug.ShouldStop(-2147483648);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("Select tagcode, updated_at from "),updateservice.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tablename))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 97;BA.debugLine="Private Row As Int = 0";
Debug.ShouldStop(1);
_row = BA.numberCast(int.class, 0);Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 98;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(2);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 99;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(4);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), updateservice.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 100;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 101;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(16);
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _row.<Integer>get().intValue() <= limit9) || (step9 < 0 && _row.<Integer>get().intValue() >= limit9) ;_row = RemoteObject.createImmutable((int)(0 + _row.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("Row", _row);
 BA.debugLineNum = 102;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(32);
_record.runMethod(true,"setPosition",_row);
 BA.debugLineNum = 103;BA.debugLine="Dim Par2 As Map";
Debug.ShouldStop(64);
_par2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Par2", _par2);
 BA.debugLineNum = 104;BA.debugLine="Par2.Initialize";
Debug.ShouldStop(128);
_par2.runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="Par2.Put(\"tagcode\", Record.GetString(\"tagcode\"";
Debug.ShouldStop(256);
_par2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode"))))));
 BA.debugLineNum = 106;BA.debugLine="Par2.Put(\"updated_at\", Record.GetString(\"updat";
Debug.ShouldStop(512);
_par2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated_at"))),(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("updated_at"))))));
 BA.debugLineNum = 107;BA.debugLine="retList.Add(Par2)";
Debug.ShouldStop(1024);
_retlist.runVoidMethod ("Add",(Object)((_par2.getObject())));
 }
}Debug.locals.put("Row", _row);
;
 };
 BA.debugLineNum = 110;BA.debugLine="Record.Close";
Debug.ShouldStop(8192);
_record.runVoidMethod ("Close");
 };
 BA.debugLineNum = 112;BA.debugLine="Return retList";
Debug.ShouldStop(32768);
if (true) return _retlist;
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,12);
if (RapidSub.canDelegate("service_create")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","service_create");}
 BA.debugLineNum = 12;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,24);
if (RapidSub.canDelegate("service_destroy")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","service_destroy");}
 BA.debugLineNum = 24;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,16);
if (RapidSub.canDelegate("service_start")) { return xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 16;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(".",updateservice.mostCurrent.__c.runMethod(true,"Not",(Object)(updateservice.mostCurrent._starter._app_reset_install /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",updateservice.mostCurrent.__c.runMethod(true,"Not",(Object)(updateservice.mostCurrent._starter._app_in_execution /*RemoteObject*/ )))) { 
 BA.debugLineNum = 18;BA.debugLine="StartServiceAt(Me, DateTime.Now + 600 * 1000, Tr";
Debug.ShouldStop(131072);
updateservice.mostCurrent.__c.runVoidMethod ("StartServiceAt",updateservice.processBA,(Object)(updateservice.getObject()),(Object)(RemoteObject.solve(new RemoteObject[] {updateservice.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.createImmutable(600),RemoteObject.createImmutable(1000)}, "+*",1, 2)),(Object)(updateservice.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 19;BA.debugLine="Track";
Debug.ShouldStop(262144);
_track();
 BA.debugLineNum = 20;BA.debugLine="Service.StopAutomaticForeground";
Debug.ShouldStop(524288);
updateservice.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 };
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _track() throws Exception{
try {
		Debug.PushSubsStack("Track (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,28);
if (RapidSub.canDelegate("track")) { xevolution.vrcg.devdemov2400.updateservice.remoteMe.runUserSub(false, "updateservice","track"); return;}
ResumableSub_Track rsub = new ResumableSub_Track(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Track extends BA.ResumableSub {
public ResumableSub_Track(xevolution.vrcg.devdemov2400.updateservice parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.updateservice parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Track (updateservice) ","updateservice",62,updateservice.processBA,updateservice.mostCurrent,28);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 29;BA.debugLine="If Not(Starter.FirstInstall) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 10;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._firstinstall /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 30;BA.debugLine="DownloadTable(\"CHECKLISTS\", \"dta_tasks\")";
Debug.ShouldStop(536870912);
_downloadtable(BA.ObjectToString("CHECKLISTS"),RemoteObject.createImmutable("dta_tasks"));
 BA.debugLineNum = 31;BA.debugLine="Sleep(500)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",updateservice.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "track"),BA.numberCast(int.class, 500));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 32;BA.debugLine="DownloadTable(\"REQUESTS\", \"dta_requests\")";
Debug.ShouldStop(-2147483648);
_downloadtable(BA.ObjectToString("REQUESTS"),RemoteObject.createImmutable("dta_requests"));
 BA.debugLineNum = 33;BA.debugLine="Sleep(500)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",updateservice.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "track"),BA.numberCast(int.class, 500));
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
 BA.debugLineNum = 34;BA.debugLine="DownloadTable(\"TYPEREQUESTS\", \"dta_typerequests\"";
Debug.ShouldStop(2);
_downloadtable(BA.ObjectToString("TYPEREQUESTS"),RemoteObject.createImmutable("dta_typerequests"));
 BA.debugLineNum = 35;BA.debugLine="Sleep(500)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("Sleep",updateservice.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "track"),BA.numberCast(int.class, 500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 36;BA.debugLine="DownloadTable(\"EQUIPMENTS\", \"dta_equipments\")";
Debug.ShouldStop(8);
_downloadtable(BA.ObjectToString("EQUIPMENTS"),RemoteObject.createImmutable("dta_equipments"));
 BA.debugLineNum = 37;BA.debugLine="Sleep(500)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",updateservice.processBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "updateservice", "track"),BA.numberCast(int.class, 500));
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
 BA.debugLineNum = 53;BA.debugLine="Try";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 54;BA.debugLine="DownloadFilesWithFTP(Starter.FirstInstall, \"\")";
Debug.ShouldStop(2097152);
_downloadfileswithftp(parent.mostCurrent._starter._firstinstall /*RemoteObject*/ ,RemoteObject.createImmutable(""));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 56;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6192413724",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",updateservice.processBA)),0);
 BA.debugLineNum = 57;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,updateservice.processBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",updateservice.processBA))));
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
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",updateservice.processBA, e0.toString());}
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
}