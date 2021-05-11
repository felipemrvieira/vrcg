
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xcolortemplate {
    public static RemoteObject myClass;
	public b4xcolortemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xcolortemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _selectedalpha = RemoteObject.createImmutable(0);
public static RemoteObject _bccolors = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _selectedh = RemoteObject.createImmutable(0f);
public static RemoteObject _selecteds = RemoteObject.createImmutable(0f);
public static RemoteObject _selectedv = RemoteObject.createImmutable(0f);
public static RemoteObject _devicescale = RemoteObject.createImmutable(0f);
public static RemoteObject _colorscale = RemoteObject.createImmutable(0f);
public static RemoteObject _tempbc = RemoteObject.declareNull("b4a.example.bitmapcreator");
public static RemoteObject _dont_change = RemoteObject.createImmutable(0);
public static RemoteObject _huebar = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xcolortemplate._colorpickerpart");
public static RemoteObject _colorpicker = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xcolortemplate._colorpickerpart");
public static RemoteObject _alphabar = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xcolortemplate._colorpickerpart");
public static RemoteObject _borderscolor = RemoteObject.createImmutable(0);
public static RemoteObject _xdialog = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.b4xdialog");
public static RemoteObject _initialcolor = null;
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
		return new Object[] {"AlphaBar",_ref.getField(false, "_alphabar"),"bcColors",_ref.getField(false, "_bccolors"),"BordersColor",_ref.getField(false, "_borderscolor"),"ColorPicker",_ref.getField(false, "_colorpicker"),"ColorScale",_ref.getField(false, "_colorscale"),"DateUtils",_ref.getField(false, "_dateutils"),"DeviceScale",_ref.getField(false, "_devicescale"),"DONT_CHANGE",_ref.getField(false, "_dont_change"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"HueBar",_ref.getField(false, "_huebar"),"InitialColor",_ref.getField(false, "_initialcolor"),"mBase",_ref.getField(false, "_mbase"),"SelectedAlpha",_ref.getField(false, "_selectedalpha"),"selectedH",_ref.getField(false, "_selectedh"),"selectedS",_ref.getField(false, "_selecteds"),"selectedV",_ref.getField(false, "_selectedv"),"tempBC",_ref.getField(false, "_tempbc"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}