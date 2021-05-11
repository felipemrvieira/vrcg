package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class colorwheeldialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.colorwheeldialog");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.colorwheeldialog.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _dialog = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvscolors = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsoverlay = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcolors = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnloverlay = null;
public int _colorresult = 0;
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
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(xevolution.vrcg.devdemov2400.colorwheeldialog __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="colorwheeldialog";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=131923968;
 //BA.debugLineNum = 131923968;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=131923970;
 //BA.debugLineNum = 131923970;BA.debugLine="End Sub";
return "";
}
public void  _showasync(xevolution.vrcg.devdemov2400.colorwheeldialog __ref,Object _callback,String _title) throws Exception{
RDebugUtils.currentModule="colorwheeldialog";
if (Debug.shouldDelegate(ba, "showasync", false))
	 {Debug.delegate(ba, "showasync", new Object[] {_callback,_title}); return;}
ResumableSub_ShowAsync rsub = new ResumableSub_ShowAsync(this,__ref,_callback,_title);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowAsync extends BA.ResumableSub {
public ResumableSub_ShowAsync(xevolution.vrcg.devdemov2400.colorwheeldialog parent,xevolution.vrcg.devdemov2400.colorwheeldialog __ref,Object _callback,String _title) {
this.parent = parent;
this.__ref = __ref;
this._callback = _callback;
this._title = _title;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.colorwheeldialog __ref;
xevolution.vrcg.devdemov2400.colorwheeldialog parent;
Object _callback;
String _title;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="colorwheeldialog";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=131989505;
 //BA.debugLineNum = 131989505;BA.debugLine="Dim sf As Object = dialog.ShowAsync(Title, \"Selec";
_sf = __ref._dialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,"Seleccionar","Cancelar","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.True);
RDebugUtils.currentLine=131989506;
 //BA.debugLineNum = 131989506;BA.debugLine="dialog.SetSize(300dip, 450dip)";
__ref._dialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.DipToCurrent((int) (300)),parent.__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=131989507;
 //BA.debugLineNum = 131989507;BA.debugLine="Wait For (sf) Dialog_Ready (DialogPanel As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "colorwheeldialog", "showasync"), _sf);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=131989508;
 //BA.debugLineNum = 131989508;BA.debugLine="DialogPanel.LoadLayout(\"WheelPicker\")";
_dialogpanel.LoadLayout("WheelPicker",ba);
RDebugUtils.currentLine=131989509;
 //BA.debugLineNum = 131989509;BA.debugLine="cvsColors.Initialize(pnlColors)";
__ref._cvscolors /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlcolors /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=131989510;
 //BA.debugLineNum = 131989510;BA.debugLine="cvsOverlay.Initialize(pnlOverlay)";
__ref._cvsoverlay /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnloverlay /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=131989511;
 //BA.debugLineNum = 131989511;BA.debugLine="Wait For (sf) Dialog_Result (Result As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "colorwheeldialog", "showasync"), _sf);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=131989512;
 //BA.debugLineNum = 131989512;BA.debugLine="CallSubDelayed2(CallBack, \"Color_Result\", Result";
parent.__c.CallSubDelayed2(ba,_callback,"Color_Result",(Object)(_result==parent.__c.DialogResponse.POSITIVE));
RDebugUtils.currentLine=131989513;
 //BA.debugLineNum = 131989513;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(xevolution.vrcg.devdemov2400.colorwheeldialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="colorwheeldialog";
RDebugUtils.currentLine=131858432;
 //BA.debugLineNum = 131858432;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=131858433;
 //BA.debugLineNum = 131858433;BA.debugLine="Private dialog As CustomLayoutDialog";
_dialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=131858434;
 //BA.debugLineNum = 131858434;BA.debugLine="Private cvsColors As Canvas";
_cvscolors = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=131858435;
 //BA.debugLineNum = 131858435;BA.debugLine="Private cvsOverlay As Canvas";
_cvsoverlay = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=131858436;
 //BA.debugLineNum = 131858436;BA.debugLine="Private pnlColors As Panel";
_pnlcolors = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=131858437;
 //BA.debugLineNum = 131858437;BA.debugLine="Private pnlOverlay As Panel";
_pnloverlay = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=131858438;
 //BA.debugLineNum = 131858438;BA.debugLine="Public ColorResult As Int";
_colorresult = 0;
RDebugUtils.currentLine=131858439;
 //BA.debugLineNum = 131858439;BA.debugLine="End Sub";
return "";
}
public String  _pnlcolors_touch(xevolution.vrcg.devdemov2400.colorwheeldialog __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="colorwheeldialog";
if (Debug.shouldDelegate(ba, "pnlcolors_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlcolors_touch", new Object[] {_action,_x,_y}));}
float _cx = 0f;
float _cy = 0f;
RDebugUtils.currentLine=132055040;
 //BA.debugLineNum = 132055040;BA.debugLine="Sub pnlColors_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=132055041;
 //BA.debugLineNum = 132055041;BA.debugLine="Dim cx = pnlColors.Width / 2, cy = pnlColors.Heig";
_cx = (float) (__ref._pnlcolors /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()/(double)2);
_cy = (float) (__ref._pnlcolors /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=132055042;
 //BA.debugLineNum = 132055042;BA.debugLine="If Sqrt(Power(x - cx, 2) + Power(y - cy, 2)) > pn";
if (__c.Sqrt(__c.Power(_x-_cx,2)+__c.Power(_y-_cy,2))>__ref._pnlcolors /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()/(double)2) { 
if (true) return "";};
RDebugUtils.currentLine=132055043;
 //BA.debugLineNum = 132055043;BA.debugLine="ColorResult = cvsColors.Bitmap.GetPixel(X, Y)";
__ref._colorresult /*int*/  = __ref._cvscolors /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().GetPixel((int) (_x),(int) (_y));
RDebugUtils.currentLine=132055044;
 //BA.debugLineNum = 132055044;BA.debugLine="cvsOverlay.DrawColor(Colors.Transparent)";
__ref._cvsoverlay /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=132055045;
 //BA.debugLineNum = 132055045;BA.debugLine="cvsOverlay.DrawCircle(X, Y, 20dip, Colors.Black,";
__ref._cvsoverlay /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawCircle(_x,_y,(float) (__c.DipToCurrent((int) (20))),__c.Colors.Black,__c.False,(float) (__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=132055046;
 //BA.debugLineNum = 132055046;BA.debugLine="pnlOverlay.Invalidate";
__ref._pnloverlay /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=132055047;
 //BA.debugLineNum = 132055047;BA.debugLine="End Sub";
return "";
}
}