
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class appfirstinstalldialog {
    public static RemoteObject myClass;
	public appfirstinstalldialog() {
	}
    public static PCBA staticBA = new PCBA(null, appfirstinstalldialog.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _thistimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _thistimercounter = RemoteObject.createImmutable(0);
public static RemoteObject _currentactivityobject = RemoteObject.declareNull("Object");
public static RemoteObject _appldialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _dialogquantityvalue = RemoteObject.declareNull("anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper");
public static RemoteObject _returnquantityvalue = RemoteObject.createImmutable(0);
public static RemoteObject _thisactivity = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
public static RemoteObject _thisactivityname = RemoteObject.declareNull("Object");
public static RemoteObject _currentcld = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
public static RemoteObject _dialogprogress = RemoteObject.declareNull("anywheresoftware.b4a.objects.ProgressBarWrapper");
public static RemoteObject _dialogmaintext = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _current_counter = RemoteObject.createImmutable(0);
public static RemoteObject _end_counter = RemoteObject.createImmutable(0);
public static RemoteObject _files_in_ftp = RemoteObject.createImmutable(0);
public static RemoteObject _ftpfilelist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dialogpositions = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
public static xevolution.vrcg.devdemov2400.main _main = null;
public static xevolution.vrcg.devdemov2400.starter _starter = null;
public static xevolution.vrcg.devdemov2400.comms _comms = null;
public static xevolution.vrcg.devdemov2400.utils _utils = null;
public static xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public static xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
public static xevolution.vrcg.devdemov2400.mainmenu _mainmenu = null;
public static xevolution.vrcg.devdemov2400.imageedit _imageedit = null;
public static xevolution.vrcg.devdemov2400.checklist3 _checklist3 = null;
public static xevolution.vrcg.devdemov2400.locationservice _locationservice = null;
public static xevolution.vrcg.devdemov2400.dataupdate _dataupdate = null;
public static xevolution.vrcg.devdemov2400.alerts _alerts = null;
public static xevolution.vrcg.devdemov2400.backgroundupdateservice _backgroundupdateservice = null;
public static xevolution.vrcg.devdemov2400.barcodescanner _barcodescanner = null;
public static xevolution.vrcg.devdemov2400.cameraactivity _cameraactivity = null;
public static xevolution.vrcg.devdemov2400.cameraactivity_innershot _cameraactivity_innershot = null;
public static xevolution.vrcg.devdemov2400.cameraactivity2 _cameraactivity2 = null;
public static xevolution.vrcg.devdemov2400.checklistnew _checklistnew = null;
public static xevolution.vrcg.devdemov2400.common _common = null;
public static xevolution.vrcg.devdemov2400.consts _consts = null;
public static xevolution.vrcg.devdemov2400.dbutils _dbutils = null;
public static xevolution.vrcg.devdemov2400.helpdescriptors _helpdescriptors = null;
public static xevolution.vrcg.devdemov2400.logs _logs = null;
public static xevolution.vrcg.devdemov2400.mapsactivity _mapsactivity = null;
public static xevolution.vrcg.devdemov2400.newsync _newsync = null;
public static xevolution.vrcg.devdemov2400.notas _notas = null;
public static xevolution.vrcg.devdemov2400.objectedit _objectedit = null;
public static xevolution.vrcg.devdemov2400.objects _objects = null;
public static xevolution.vrcg.devdemov2400.report _report = null;
public static xevolution.vrcg.devdemov2400.reportview _reportview = null;
public static xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public static xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public static xevolution.vrcg.devdemov2400.structures _structures = null;
public static xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ApplDialog",_ref.getField(false, "_appldialog"),"CURRENT_COUNTER",_ref.getField(false, "_current_counter"),"CurrentActivityObject",_ref.getField(false, "_currentactivityobject"),"CurrentCLD",_ref.getField(false, "_currentcld"),"DateUtils",_ref.getField(false, "_dateutils"),"dialogMainText",_ref.getField(false, "_dialogmaintext"),"dialogPositions",_ref.getField(false, "_dialogpositions"),"dialogProgress",_ref.getField(false, "_dialogprogress"),"DialogQuantityValue",_ref.getField(false, "_dialogquantityvalue"),"Encoding",_ref.getField(false, "_encoding"),"END_COUNTER",_ref.getField(false, "_end_counter"),"ESC_POS",_ref.getField(false, "_esc_pos"),"FILES_IN_FTP",_ref.getField(false, "_files_in_ftp"),"FTPFileList",_ref.getField(false, "_ftpfilelist"),"ReturnQuantityValue",_ref.getField(false, "_returnquantityvalue"),"ThisActivity",_ref.getField(false, "_thisactivity"),"ThisActivityName",_ref.getField(false, "_thisactivityname"),"thisTimer",_ref.getField(false, "_thistimer"),"thisTimerCounter",_ref.getField(false, "_thistimercounter")};
}
}