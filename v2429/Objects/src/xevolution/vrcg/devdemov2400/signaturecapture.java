package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class signaturecapture {
private static signaturecapture mostCurrent = new signaturecapture();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _signaturedata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper Canvas;
public anywheresoftware.b4a.objects.PanelWrapper Panel;
public int SignatureColor;
public int SignatureWidth;
public void Initialize() {
IsInitialized = true;
Canvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
Panel = new anywheresoftware.b4a.objects.PanelWrapper();
SignatureColor = 0;
SignatureWidth = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _px = 0;
public static int _py = 0;
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
public xevolution.vrcg.devdemov2400.structures _structures = null;
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static String  _clear(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.signaturecapture._signaturedata _sd) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "clear", false))
	 {return ((String) Debug.delegate(null, "clear", new Object[] {_ba,_sd}));}
RDebugUtils.currentLine=174850048;
 //BA.debugLineNum = 174850048;BA.debugLine="Sub Clear(SD As SignatureData)";
RDebugUtils.currentLine=174850049;
 //BA.debugLineNum = 174850049;BA.debugLine="If SD.IsInitialized Then";
if (_sd.IsInitialized /*boolean*/ ) { 
RDebugUtils.currentLine=174850050;
 //BA.debugLineNum = 174850050;BA.debugLine="SD.Canvas.DrawColor(Colors.White)";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=174850051;
 //BA.debugLineNum = 174850051;BA.debugLine="SD.Panel.Invalidate";
_sd.Panel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
 };
RDebugUtils.currentLine=174850053;
 //BA.debugLineNum = 174850053;BA.debugLine="End Sub";
return "";
}
public static String  _save(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.signaturecapture._signaturedata _sd,String _dir,String _name) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "save", false))
	 {return ((String) Debug.delegate(null, "save", new Object[] {_ba,_sd,_dir,_name}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=174915584;
 //BA.debugLineNum = 174915584;BA.debugLine="Sub Save(SD As SignatureData, Dir As String, Name";
RDebugUtils.currentLine=174915585;
 //BA.debugLineNum = 174915585;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=174915586;
 //BA.debugLineNum = 174915586;BA.debugLine="out = File.OpenOutput(Dir, Name, False)";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_name,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=174915587;
 //BA.debugLineNum = 174915587;BA.debugLine="SD.Canvas.Bitmap.WriteToStream(out, ShareCode.DEV";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=174915588;
 //BA.debugLineNum = 174915588;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=174915589;
 //BA.debugLineNum = 174915589;BA.debugLine="End Sub";
return "";
}
public static String  _panel_touch(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.signaturecapture._signaturedata _sd,int _x,int _y,int _action) throws Exception{
RDebugUtils.currentModule="signaturecapture";
if (Debug.shouldDelegate(null, "panel_touch", false))
	 {return ((String) Debug.delegate(null, "panel_touch", new Object[] {_ba,_sd,_x,_y,_action}));}
RDebugUtils.currentLine=174784512;
 //BA.debugLineNum = 174784512;BA.debugLine="Sub Panel_Touch(SD As SignatureData, x As Int,y As";
RDebugUtils.currentLine=174784513;
 //BA.debugLineNum = 174784513;BA.debugLine="If Action = 0 Then 'mouse down constant";
if (_action==0) { 
RDebugUtils.currentLine=174784514;
 //BA.debugLineNum = 174784514;BA.debugLine="px = x";
_px = _x;
RDebugUtils.currentLine=174784515;
 //BA.debugLineNum = 174784515;BA.debugLine="py = y";
_py = _y;
 }else {
RDebugUtils.currentLine=174784517;
 //BA.debugLineNum = 174784517;BA.debugLine="SD.Canvas.DrawLine(px, py, x, y, SD.SignatureCol";
_sd.Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawLine((float) (_px),(float) (_py),(float) (_x),(float) (_y),_sd.SignatureColor /*int*/ ,(float) (_sd.SignatureWidth /*int*/ ));
RDebugUtils.currentLine=174784518;
 //BA.debugLineNum = 174784518;BA.debugLine="SD.Panel.Invalidate";
_sd.Panel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=174784519;
 //BA.debugLineNum = 174784519;BA.debugLine="px = x";
_px = _x;
RDebugUtils.currentLine=174784520;
 //BA.debugLineNum = 174784520;BA.debugLine="py = y";
_py = _y;
 };
RDebugUtils.currentLine=174784522;
 //BA.debugLineNum = 174784522;BA.debugLine="End Sub";
return "";
}
}