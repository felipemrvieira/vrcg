package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class updateservice extends  android.app.Service{
	public static class updateservice_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (updateservice) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, updateservice.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, false, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static updateservice mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return updateservice.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.updateservice");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.updateservice", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!false && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (updateservice) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (false) {
			ServiceHelper.StarterHelper.runWaitForLayouts();
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (updateservice) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (false)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (updateservice) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }
	
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (false) {
            BA.LogInfo("** Service (updateservice) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (updateservice) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
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
public xevolution.vrcg.devdemov2400.structures _structures = null;
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static void  _downloadfileswithftp(boolean _isfirsttime,String _datacontrol) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "downloadfileswithftp", false))
	 {Debug.delegate(processBA, "downloadfileswithftp", new Object[] {_isfirsttime,_datacontrol}); return;}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_isfirsttime,_datacontrol);
rsub.resume(processBA, null);
}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.updateservice parent,boolean _isfirsttime,String _datacontrol) {
this.parent = parent;
this._isfirsttime = _isfirsttime;
this._datacontrol = _datacontrol;
}
xevolution.vrcg.devdemov2400.updateservice parent;
boolean _isfirsttime;
String _datacontrol;
anywheresoftware.b4a.objects.collections.List _flist = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname = "";
String _ext = "";
anywheresoftware.b4a.objects.collections.List _flistlast = null;
xevolution.vrcg.devdemov2400.types._downupfile _fname1 = null;
boolean _makecopy = false;
Object _sf = null;
int step14;
int limit14;
int step30;
int limit30;
int step46;
int limit46;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="updateservice";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=192872449;
 //BA.debugLineNum = 192872449;BA.debugLine="If (Not(isfirsttime)) Then";
if (true) break;

case 1:
//if
this.state = 67;
if ((anywheresoftware.b4a.keywords.Common.Not(_isfirsttime))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=192872450;
 //BA.debugLineNum = 192872450;BA.debugLine="If (Utils.isNullOrEmpty(datacontrol)) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils._isnullorempty /*boolean*/ (processBA,_datacontrol))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=192872451;
 //BA.debugLineNum = 192872451;BA.debugLine="datacontrol = Utils.GetCurrentDate 'Utils.GetLa";
_datacontrol = parent.mostCurrent._utils._getcurrentdate /*String*/ (processBA);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=192872458;
 //BA.debugLineNum = 192872458;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6192872458","************************************************************",0);
RDebugUtils.currentLine=192872459;
 //BA.debugLineNum = 192872459;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APP_DOMAIN} \"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6192872459",(" 		INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=192872460;
 //BA.debugLineNum = 192872460;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6192872460","************************************************************",0);
RDebugUtils.currentLine=192872461;
 //BA.debugLineNum = 192872461;BA.debugLine="Dim flist As List  ' = File.ListFiles(Starter.In";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=192872463;
 //BA.debugLineNum = 192872463;BA.debugLine="Dim sfl As Object = Starter.GlobalFTP.List(\"/\" &";
_sfl = parent.mostCurrent._starter._globalftp /*anywheresoftware.b4a.net.FTPWrapper*/ .List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=192872464;
 //BA.debugLineNum = 192872464;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "downloadfileswithftp"), _sfl);
this.state = 68;
return;
case 68:
//C
this.state = 8;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=192872465;
 //BA.debugLineNum = 192872465;BA.debugLine="If Success Then";
if (true) break;

case 8:
//if
this.state = 29;
if (_success) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=192872472;
 //BA.debugLineNum = 192872472;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 11:
//if
this.state = 28;
if ((_files.length>=1)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=192872473;
 //BA.debugLineNum = 192872473;BA.debugLine="flist.Initialize";
_flist.Initialize();
RDebugUtils.currentLine=192872474;
 //BA.debugLineNum = 192872474;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 14:
//for
this.state = 27;
step14 = 1;
limit14 = (int) (_files.length-1);
_i = (int) (0) ;
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
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=192872475;
 //BA.debugLineNum = 192872475;BA.debugLine="Dim fName As String = Files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=192872476;
 //BA.debugLineNum = 192872476;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWit";
if (true) break;

case 17:
//if
this.state = 26;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".html"))) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=192872477;
 //BA.debugLineNum = 192872477;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
_ext = _fname.substring((int) (_fname.lastIndexOf(".")-1));
RDebugUtils.currentLine=192872478;
 //BA.debugLineNum = 192872478;BA.debugLine="If (Files(i).Timestamp >= DateTime.DateParse";
if (true) break;

case 20:
//if
this.state = 23;
if ((_files[_i].getTimestamp()>=anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_datacontrol))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=192872479;
 //BA.debugLineNum = 192872479;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Nam";
_flist.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (processBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
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
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;
;
RDebugUtils.currentLine=192872488;
 //BA.debugLineNum = 192872488;BA.debugLine="If (flist.IsInitialized) Then";

case 29:
//if
this.state = 66;
if ((_flist.IsInitialized())) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=192872489;
 //BA.debugLineNum = 192872489;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=192872490;
 //BA.debugLineNum = 192872490;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
RDebugUtils.currentLine=192872494;
 //BA.debugLineNum = 192872494;BA.debugLine="If (flist.Size>=1) Then";
if (true) break;

case 32:
//if
this.state = 52;
if ((_flist.getSize()>=1)) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=192872495;
 //BA.debugLineNum = 192872495;BA.debugLine="For i=0 To flist.Size-1";
if (true) break;

case 35:
//for
this.state = 51;
step30 = 1;
limit30 = (int) (_flist.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=192872496;
 //BA.debugLineNum = 192872496;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flist.Get(_i));
RDebugUtils.currentLine=192872497;
 //BA.debugLineNum = 192872497;BA.debugLine="Dim makeCopy As Boolean = False";
_makecopy = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=192872498;
 //BA.debugLineNum = 192872498;BA.debugLine="If (File.Exists(Starter.InternalFolder, fName";
if (true) break;

case 38:
//if
this.state = 47;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname1.Filename /*String*/ ))) { 
this.state = 40;
}else {
this.state = 46;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=192872499;
 //BA.debugLineNum = 192872499;BA.debugLine="If (fName1.FileDateTime > File.LastModified(";
if (true) break;

case 41:
//if
this.state = 44;
if ((_fname1.FileDateTime /*long*/ >anywheresoftware.b4a.keywords.Common.File.LastModified(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname1.Filename /*String*/ ))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=192872500;
 //BA.debugLineNum = 192872500;BA.debugLine="makeCopy = True";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 44:
//C
this.state = 47;
;
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=192872503;
 //BA.debugLineNum = 192872503;BA.debugLine="makeCopy = True";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=192872506;
 //BA.debugLineNum = 192872506;BA.debugLine="If (makeCopy) Then";

case 47:
//if
this.state = 50;
if ((_makecopy)) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=192872507;
 //BA.debugLineNum = 192872507;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
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
;
 if (true) break;
;
RDebugUtils.currentLine=192872515;
 //BA.debugLineNum = 192872515;BA.debugLine="If (flistLast.Size>=1) Then";

case 52:
//if
this.state = 65;
if ((_flistlast.getSize()>=1)) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=192872516;
 //BA.debugLineNum = 192872516;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 55:
//for
this.state = 64;
step46 = 1;
limit46 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=192872517;
 //BA.debugLineNum = 192872517;BA.debugLine="Dim fName As String = flistLast.Get(i)";
_fname = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=192872519;
 //BA.debugLineNum = 192872519;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("6192872519",_fname,0);
RDebugUtils.currentLine=192872520;
 //BA.debugLineNum = 192872520;BA.debugLine="Dim sf As Object = Starter.GlobalFTP.Download";
_sf = parent.mostCurrent._starter._globalftp /*anywheresoftware.b4a.net.FTPWrapper*/ .DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=192872521;
 //BA.debugLineNum = 192872521;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "downloadfileswithftp"), _sf);
this.state = 75;
return;
case 75:
//C
this.state = 58;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=192872522;
 //BA.debugLineNum = 192872522;BA.debugLine="If Success Then";
if (true) break;

case 58:
//if
this.state = 63;
if (_success) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
RDebugUtils.currentLine=192872523;
 //BA.debugLineNum = 192872523;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6192872523","file was download successfully",0);
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=192872525;
 //BA.debugLineNum = 192872525;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6192872525","Error downloading file",0);
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
RDebugUtils.currentLine=192872534;
 //BA.debugLineNum = 192872534;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _downloadtable(String _groupname,String _tablename) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "downloadtable", false))
	 {Debug.delegate(processBA, "downloadtable", new Object[] {_groupname,_tablename}); return;}
ResumableSub_DownloadTable rsub = new ResumableSub_DownloadTable(null,_groupname,_tablename);
rsub.resume(processBA, null);
}
public static class ResumableSub_DownloadTable extends BA.ResumableSub {
public ResumableSub_DownloadTable(xevolution.vrcg.devdemov2400.updateservice parent,String _groupname,String _tablename) {
this.parent = parent;
this._groupname = _groupname;
this._tablename = _tablename;
}
xevolution.vrcg.devdemov2400.updateservice parent;
String _groupname;
String _tablename;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="updateservice";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=192610305;
 //BA.debugLineNum = 192610305;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/download/table/update");
RDebugUtils.currentLine=192610306;
 //BA.debugLineNum = 192610306;BA.debugLine="Log(\"**********  \" & tablename & \"  ***********\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6192610306","**********  "+_tablename+"  ***********",0);
RDebugUtils.currentLine=192610307;
 //BA.debugLineNum = 192610307;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=192610308;
 //BA.debugLineNum = 192610308;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",updateservice.getObject());
RDebugUtils.currentLine=192610309;
 //BA.debugLineNum = 192610309;BA.debugLine="Job.PostString(ServerAddress, MakeTableMaps(group";
_job._poststring /*String*/ (null,_serveraddress,_maketablemaps(_groupname,_tablename));
RDebugUtils.currentLine=192610310;
 //BA.debugLineNum = 192610310;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=192610312;
 //BA.debugLineNum = 192610312;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "downloadtable"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=192610313;
 //BA.debugLineNum = 192610313;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=192610314;
 //BA.debugLineNum = 192610314;BA.debugLine="Try";
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
RDebugUtils.currentLine=192610315;
 //BA.debugLineNum = 192610315;BA.debugLine="InsertUpdateTable(Job.GetString)";
_insertupdatetable(_job._getstring /*String*/ (null));
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=192610317;
 //BA.debugLineNum = 192610317;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6192610317",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=192610318;
 //BA.debugLineNum = 192610318;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
RDebugUtils.currentLine=192610319;
 //BA.debugLineNum = 192610319;BA.debugLine="Utils.logError($\"Download ${groupName}: \"$, Sha";
parent.mostCurrent._utils._logerror /*String*/ (processBA,("Download "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_groupname))+": "),parent.mostCurrent._sharecode._sess_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
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
RDebugUtils.currentLine=192610322;
 //BA.debugLineNum = 192610322;BA.debugLine="Utils.logError($\"Download ${groupName}: \"$, Shar";
parent.mostCurrent._utils._logerror /*String*/ (processBA,("Download "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_groupname))+": "),parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=192610324;
 //BA.debugLineNum = 192610324;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=192610326;
 //BA.debugLineNum = 192610326;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _maketablemaps(String _groupname,String _tablename) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "maketablemaps", false))
	 {return ((String) Debug.delegate(processBA, "maketablemaps", new Object[] {_groupname,_tablename}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
RDebugUtils.currentLine=192479232;
 //BA.debugLineNum = 192479232;BA.debugLine="Sub MakeTableMaps(groupName As String, tablename A";
RDebugUtils.currentLine=192479233;
 //BA.debugLineNum = 192479233;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=192479234;
 //BA.debugLineNum = 192479234;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=192479235;
 //BA.debugLineNum = 192479235;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=192479236;
 //BA.debugLineNum = 192479236;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=192479237;
 //BA.debugLineNum = 192479237;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=192479238;
 //BA.debugLineNum = 192479238;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=192479239;
 //BA.debugLineNum = 192479239;BA.debugLine="params.Put(\"_team\", ShareCode.SESS_User)";
_params.Put((Object)("_team"),(Object)(mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=192479240;
 //BA.debugLineNum = 192479240;BA.debugLine="params.Put(\"groupname\", groupName)";
_params.Put((Object)("groupname"),(Object)(_groupname));
RDebugUtils.currentLine=192479241;
 //BA.debugLineNum = 192479241;BA.debugLine="params.Put(\"tablename\", tablename)";
_params.Put((Object)("tablename"),(Object)(_tablename));
RDebugUtils.currentLine=192479242;
 //BA.debugLineNum = 192479242;BA.debugLine="params.Put(\"data\", mapAllExistingRecords(tablenam";
_params.Put((Object)("data"),(Object)(_mapallexistingrecords(_tablename).getObject()));
RDebugUtils.currentLine=192479243;
 //BA.debugLineNum = 192479243;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=192479244;
 //BA.debugLineNum = 192479244;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=192479245;
 //BA.debugLineNum = 192479245;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=192479246;
 //BA.debugLineNum = 192479246;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=192479247;
 //BA.debugLineNum = 192479247;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=192479248;
 //BA.debugLineNum = 192479248;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=192479250;
 //BA.debugLineNum = 192479250;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=192479251;
 //BA.debugLineNum = 192479251;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=192479253;
 //BA.debugLineNum = 192479253;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=192479254;
 //BA.debugLineNum = 192479254;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6192479254",_data,0);
RDebugUtils.currentLine=192479255;
 //BA.debugLineNum = 192479255;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=192479256;
 //BA.debugLineNum = 192479256;BA.debugLine="End Sub";
return "";
}
public static void  _insertupdatetable(String _datares) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "insertupdatetable", false))
	 {Debug.delegate(processBA, "insertupdatetable", new Object[] {_datares}); return;}
ResumableSub_InsertUpdateTable rsub = new ResumableSub_InsertUpdateTable(null,_datares);
rsub.resume(processBA, null);
}
public static class ResumableSub_InsertUpdateTable extends BA.ResumableSub {
public ResumableSub_InsertUpdateTable(xevolution.vrcg.devdemov2400.updateservice parent,String _datares) {
this.parent = parent;
this._datares = _datares;
}
xevolution.vrcg.devdemov2400.updateservice parent;
String _datares;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _status = 0;
anywheresoftware.b4a.objects.collections.List _data = null;
anywheresoftware.b4a.objects.collections.Map _coldata = null;
String _table = "";
anywheresoftware.b4a.objects.collections.List _rows = null;
String _stridlist = "";
anywheresoftware.b4a.objects.collections.List _idlist = null;
int _i1 = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _mid = 0;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="updateservice";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=192675841;
 //BA.debugLineNum = 192675841;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=192675842;
 //BA.debugLineNum = 192675842;BA.debugLine="parser.Initialize(datares)";
_parser.Initialize(_datares);
RDebugUtils.currentLine=192675843;
 //BA.debugLineNum = 192675843;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=192675845;
 //BA.debugLineNum = 192675845;BA.debugLine="Dim status As Int = root.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_root.Get((Object)("status"))));
RDebugUtils.currentLine=192675846;
 //BA.debugLineNum = 192675846;BA.debugLine="If (status = 1) Then";
if (true) break;

case 1:
//if
this.state = 24;
if ((_status==1)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=192675847;
 //BA.debugLineNum = 192675847;BA.debugLine="Dim data As List = root.Get(\"data\")";
_data = new anywheresoftware.b4a.objects.collections.List();
_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("data"))));
RDebugUtils.currentLine=192675848;
 //BA.debugLineNum = 192675848;BA.debugLine="For Each coldata As Map In data";
if (true) break;

case 4:
//for
this.state = 23;
_coldata = new anywheresoftware.b4a.objects.collections.Map();
group7 = _data;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 25;
if (true) break;

case 25:
//C
this.state = 23;
if (index7 < groupLen7) {
this.state = 6;
_coldata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group7.Get(index7)));}
if (true) break;

case 26:
//C
this.state = 25;
index7++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=192675849;
 //BA.debugLineNum = 192675849;BA.debugLine="Dim table As String = coldata.Get(\"table\")";
_table = BA.ObjectToString(_coldata.Get((Object)("table")));
RDebugUtils.currentLine=192675850;
 //BA.debugLineNum = 192675850;BA.debugLine="Dim rows As List = coldata.Get(\"rows\")";
_rows = new anywheresoftware.b4a.objects.collections.List();
_rows = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_coldata.Get((Object)("rows"))));
RDebugUtils.currentLine=192675852;
 //BA.debugLineNum = 192675852;BA.debugLine="If (rows.IsInitialized) Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((_rows.IsInitialized())) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=192675855;
 //BA.debugLineNum = 192675855;BA.debugLine="Dim strIDList As String = GetListMapsID(rows)";
_stridlist = _getlistmapsid(_rows);
RDebugUtils.currentLine=192675856;
 //BA.debugLineNum = 192675856;BA.debugLine="Dim IDList As List = GetAllExistingRecords(tab";
_idlist = new anywheresoftware.b4a.objects.collections.List();
_idlist = _getallexistingrecords(_table,_stridlist);
RDebugUtils.currentLine=192675859;
 //BA.debugLineNum = 192675859;BA.debugLine="DBUtils.InsertMaps2(Starter.LocalSQLEVC, table";
parent.mostCurrent._dbutils._insertmaps2 /*String*/ (processBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_rows,_idlist);
RDebugUtils.currentLine=192675860;
 //BA.debugLineNum = 192675860;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "insertupdatetable"),(int) (100));
this.state = 27;
return;
case 27:
//C
this.state = 10;
;
RDebugUtils.currentLine=192675864;
 //BA.debugLineNum = 192675864;BA.debugLine="If (IDList.Size >=1) Then";
if (true) break;

case 10:
//if
this.state = 21;
if ((_idlist.getSize()>=1)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=192675865;
 //BA.debugLineNum = 192675865;BA.debugLine="For i1 = 0 To rows.Size - 1";
if (true) break;

case 13:
//for
this.state = 20;
step16 = 1;
limit16 = (int) (_rows.getSize()-1);
_i1 = (int) (0) ;
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
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=192675866;
 //BA.debugLineNum = 192675866;BA.debugLine="Dim m As Map = rows.Get(i1)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_rows.Get(_i1)));
RDebugUtils.currentLine=192675867;
 //BA.debugLineNum = 192675867;BA.debugLine="Dim mID As Int = m.Get(\"id\")";
_mid = (int)(BA.ObjectToNumber(_m.Get((Object)("id"))));
RDebugUtils.currentLine=192675868;
 //BA.debugLineNum = 192675868;BA.debugLine="If (IDList.IndexOf(mID) >=0) Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((_idlist.IndexOf((Object)(_mid))>=0)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=192675869;
 //BA.debugLineNum = 192675869;BA.debugLine="Dim Mapping As Map";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=192675870;
 //BA.debugLineNum = 192675870;BA.debugLine="Mapping.Initialize";
_mapping.Initialize();
RDebugUtils.currentLine=192675871;
 //BA.debugLineNum = 192675871;BA.debugLine="Mapping.Put(\"id\", mID)";
_mapping.Put((Object)("id"),(Object)(_mid));
RDebugUtils.currentLine=192675872;
 //BA.debugLineNum = 192675872;BA.debugLine="DBUtils.UpdateRecord2(Starter.LocalSQLEVC,";
parent.mostCurrent._dbutils._updaterecord2 /*String*/ (processBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_m,_mapping);
RDebugUtils.currentLine=192675873;
 //BA.debugLineNum = 192675873;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQL";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (processBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,_table,_m,_mapping,"","");
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
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=192675881;
 //BA.debugLineNum = 192675881;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _getallexistingrecords(String _tablename,String _idlists) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "getallexistingrecords", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(processBA, "getallexistingrecords", new Object[] {_tablename,_idlists}));}
anywheresoftware.b4a.objects.collections.List _retlist = null;
String _ssql = "";
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _mid = 0;
RDebugUtils.currentLine=192741376;
 //BA.debugLineNum = 192741376;BA.debugLine="Sub GetAllExistingRecords(tablename As String, idL";
RDebugUtils.currentLine=192741377;
 //BA.debugLineNum = 192741377;BA.debugLine="Dim retList As List";
_retlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=192741378;
 //BA.debugLineNum = 192741378;BA.debugLine="retList.Initialize";
_retlist.Initialize();
RDebugUtils.currentLine=192741379;
 //BA.debugLineNum = 192741379;BA.debugLine="If (Utils.NNE(idLists)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (processBA,_idlists))) { 
RDebugUtils.currentLine=192741380;
 //BA.debugLineNum = 192741380;BA.debugLine="Dim sSQL As String = $\"Select id from ${tablenam";
_ssql = ("Select id from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+" where id in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_idlists))+"");
RDebugUtils.currentLine=192741381;
 //BA.debugLineNum = 192741381;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=192741382;
 //BA.debugLineNum = 192741382;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=192741383;
 //BA.debugLineNum = 192741383;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=192741384;
 //BA.debugLineNum = 192741384;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=192741385;
 //BA.debugLineNum = 192741385;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
RDebugUtils.currentLine=192741386;
 //BA.debugLineNum = 192741386;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=192741387;
 //BA.debugLineNum = 192741387;BA.debugLine="Dim mID As Int = Record.GetInt(\"id\")";
_mid = _record.GetInt("id");
RDebugUtils.currentLine=192741388;
 //BA.debugLineNum = 192741388;BA.debugLine="retList.Add(mID)";
_retlist.Add((Object)(_mid));
 }
};
 };
RDebugUtils.currentLine=192741391;
 //BA.debugLineNum = 192741391;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=192741393;
 //BA.debugLineNum = 192741393;BA.debugLine="Return retList";
if (true) return _retlist;
RDebugUtils.currentLine=192741394;
 //BA.debugLineNum = 192741394;BA.debugLine="End Sub";
return null;
}
public static String  _getlistmapsid(anywheresoftware.b4a.objects.collections.List _innerlist) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "getlistmapsid", false))
	 {return ((String) Debug.delegate(processBA, "getlistmapsid", new Object[] {_innerlist}));}
String _itemslist = "";
anywheresoftware.b4a.objects.collections.Map _row = null;
int _id = 0;
RDebugUtils.currentLine=192806912;
 //BA.debugLineNum = 192806912;BA.debugLine="Sub GetListMapsID(innerList As List) As String 'Li";
RDebugUtils.currentLine=192806915;
 //BA.debugLineNum = 192806915;BA.debugLine="Dim itemsList As String = \"\"";
_itemslist = "";
RDebugUtils.currentLine=192806916;
 //BA.debugLineNum = 192806916;BA.debugLine="For Each row As Map In innerList";
_row = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _innerlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_row = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
RDebugUtils.currentLine=192806917;
 //BA.debugLineNum = 192806917;BA.debugLine="Dim ID As Int = row.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_row.Get((Object)("id"))));
RDebugUtils.currentLine=192806918;
 //BA.debugLineNum = 192806918;BA.debugLine="If Utils.NNE(itemsList) Then";
if (mostCurrent._utils._nne /*boolean*/ (processBA,_itemslist)) { 
RDebugUtils.currentLine=192806919;
 //BA.debugLineNum = 192806919;BA.debugLine="itemsList = $\"${itemsList},\"$";
_itemslist = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemslist))+",");
 };
RDebugUtils.currentLine=192806921;
 //BA.debugLineNum = 192806921;BA.debugLine="itemsList = $\"${itemsList}${ID}\"$";
_itemslist = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemslist))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_id))+"");
 }
};
RDebugUtils.currentLine=192806925;
 //BA.debugLineNum = 192806925;BA.debugLine="If Utils.NNE(itemsList) Then";
if (mostCurrent._utils._nne /*boolean*/ (processBA,_itemslist)) { 
RDebugUtils.currentLine=192806926;
 //BA.debugLineNum = 192806926;BA.debugLine="itemsList = $\"(${itemsList})\"$";
_itemslist = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemslist))+")");
 };
RDebugUtils.currentLine=192806929;
 //BA.debugLineNum = 192806929;BA.debugLine="Return itemsList 'retList";
if (true) return _itemslist;
RDebugUtils.currentLine=192806930;
 //BA.debugLineNum = 192806930;BA.debugLine="End Sub";
return "";
}
public static String  _innerupdate_evc_ori() throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "innerupdate_evc_ori", false))
	 {return ((String) Debug.delegate(processBA, "innerupdate_evc_ori", null));}
RDebugUtils.currentLine=192937984;
 //BA.debugLineNum = 192937984;BA.debugLine="Sub innerUpdate_EVC_ORI";
RDebugUtils.currentLine=192937988;
 //BA.debugLineNum = 192937988;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _mapallexistingrecords(String _tablename) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "mapallexistingrecords", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(processBA, "mapallexistingrecords", new Object[] {_tablename}));}
anywheresoftware.b4a.objects.collections.List _retlist = null;
String _ssql = "";
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
anywheresoftware.b4a.objects.collections.Map _par2 = null;
RDebugUtils.currentLine=192544768;
 //BA.debugLineNum = 192544768;BA.debugLine="Sub mapAllExistingRecords(tablename As String) As";
RDebugUtils.currentLine=192544769;
 //BA.debugLineNum = 192544769;BA.debugLine="Dim retList As List";
_retlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=192544770;
 //BA.debugLineNum = 192544770;BA.debugLine="retList.Initialize";
_retlist.Initialize();
RDebugUtils.currentLine=192544771;
 //BA.debugLineNum = 192544771;BA.debugLine="If (Utils.NNE(tablename)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (processBA,_tablename))) { 
RDebugUtils.currentLine=192544772;
 //BA.debugLineNum = 192544772;BA.debugLine="Dim sSQL As String = $\"Select tagcode, updated_a";
_ssql = ("Select tagcode, updated_at from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+"");
RDebugUtils.currentLine=192544773;
 //BA.debugLineNum = 192544773;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=192544774;
 //BA.debugLineNum = 192544774;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=192544775;
 //BA.debugLineNum = 192544775;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=192544776;
 //BA.debugLineNum = 192544776;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=192544777;
 //BA.debugLineNum = 192544777;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
RDebugUtils.currentLine=192544778;
 //BA.debugLineNum = 192544778;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=192544779;
 //BA.debugLineNum = 192544779;BA.debugLine="Dim Par2 As Map";
_par2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=192544780;
 //BA.debugLineNum = 192544780;BA.debugLine="Par2.Initialize";
_par2.Initialize();
RDebugUtils.currentLine=192544781;
 //BA.debugLineNum = 192544781;BA.debugLine="Par2.Put(\"tagcode\", Record.GetString(\"tagcode\"";
_par2.Put((Object)("tagcode"),(Object)(_record.GetString("tagcode")));
RDebugUtils.currentLine=192544782;
 //BA.debugLineNum = 192544782;BA.debugLine="Par2.Put(\"updated_at\", Record.GetString(\"updat";
_par2.Put((Object)("updated_at"),(Object)(_record.GetString("updated_at")));
RDebugUtils.currentLine=192544783;
 //BA.debugLineNum = 192544783;BA.debugLine="retList.Add(Par2)";
_retlist.Add((Object)(_par2.getObject()));
 }
};
 };
RDebugUtils.currentLine=192544786;
 //BA.debugLineNum = 192544786;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=192544788;
 //BA.debugLineNum = 192544788;BA.debugLine="Return retList";
if (true) return _retlist;
RDebugUtils.currentLine=192544789;
 //BA.debugLineNum = 192544789;BA.debugLine="End Sub";
return null;
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=192217088;
 //BA.debugLineNum = 192217088;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=192217090;
 //BA.debugLineNum = 192217090;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=192348160;
 //BA.debugLineNum = 192348160;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=192348162;
 //BA.debugLineNum = 192348162;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=192282624;
 //BA.debugLineNum = 192282624;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=192282625;
 //BA.debugLineNum = 192282625;BA.debugLine="If Not(Starter.APP_RESET_INSTALL) And Not(Starter";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_reset_install /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._starter._app_in_execution /*boolean*/ )) { 
RDebugUtils.currentLine=192282626;
 //BA.debugLineNum = 192282626;BA.debugLine="StartServiceAt(Me, DateTime.Now + 600 * 1000, Tr";
anywheresoftware.b4a.keywords.Common.StartServiceAt(processBA,updateservice.getObject(),(long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+600*1000),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=192282627;
 //BA.debugLineNum = 192282627;BA.debugLine="Track";
_track();
RDebugUtils.currentLine=192282628;
 //BA.debugLineNum = 192282628;BA.debugLine="Service.StopAutomaticForeground";
mostCurrent._service.StopAutomaticForeground();
 };
RDebugUtils.currentLine=192282630;
 //BA.debugLineNum = 192282630;BA.debugLine="End Sub";
return "";
}
public static void  _track() throws Exception{
RDebugUtils.currentModule="updateservice";
if (Debug.shouldDelegate(processBA, "track", false))
	 {Debug.delegate(processBA, "track", null); return;}
ResumableSub_Track rsub = new ResumableSub_Track(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Track extends BA.ResumableSub {
public ResumableSub_Track(xevolution.vrcg.devdemov2400.updateservice parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.updateservice parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="updateservice";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=192413697;
 //BA.debugLineNum = 192413697;BA.debugLine="If Not(Starter.FirstInstall) Then";
if (true) break;

case 1:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._firstinstall /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=192413698;
 //BA.debugLineNum = 192413698;BA.debugLine="DownloadTable(\"CHECKLISTS\", \"dta_tasks\")";
_downloadtable("CHECKLISTS","dta_tasks");
RDebugUtils.currentLine=192413699;
 //BA.debugLineNum = 192413699;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "track"),(int) (500));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=192413700;
 //BA.debugLineNum = 192413700;BA.debugLine="DownloadTable(\"REQUESTS\", \"dta_requests\")";
_downloadtable("REQUESTS","dta_requests");
RDebugUtils.currentLine=192413701;
 //BA.debugLineNum = 192413701;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "track"),(int) (500));
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
RDebugUtils.currentLine=192413702;
 //BA.debugLineNum = 192413702;BA.debugLine="DownloadTable(\"TYPEREQUESTS\", \"dta_typerequests\"";
_downloadtable("TYPEREQUESTS","dta_typerequests");
RDebugUtils.currentLine=192413703;
 //BA.debugLineNum = 192413703;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "track"),(int) (500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=192413704;
 //BA.debugLineNum = 192413704;BA.debugLine="DownloadTable(\"EQUIPMENTS\", \"dta_equipments\")";
_downloadtable("EQUIPMENTS","dta_equipments");
RDebugUtils.currentLine=192413705;
 //BA.debugLineNum = 192413705;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(processBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "updateservice", "track"),(int) (500));
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
RDebugUtils.currentLine=192413721;
 //BA.debugLineNum = 192413721;BA.debugLine="Try";
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
RDebugUtils.currentLine=192413722;
 //BA.debugLineNum = 192413722;BA.debugLine="DownloadFilesWithFTP(Starter.FirstInstall, \"\")";
_downloadfileswithftp(parent.mostCurrent._starter._firstinstall /*boolean*/ ,"");
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=192413724;
 //BA.debugLineNum = 192413724;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6192413724",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=192413725;
 //BA.debugLineNum = 192413725;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (processBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)));
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
RDebugUtils.currentLine=192413728;
 //BA.debugLineNum = 192413728;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
}