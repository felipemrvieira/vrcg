package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dialogitemactions extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.dialogitemactions");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.dialogitemactions.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.TabStripViewPager _dlgtabpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public anywheresoftware.b4a.objects.ActivityWrapper _parentwindow = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _ownerpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _imgbuttonbox = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgimage = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlimageboxoptions = null;
public b4a.example3.customlistview _mngimagesarea = null;
public anywheresoftware.b4a.objects.EditTextWrapper _mngnotesfield = null;
public anywheresoftware.b4a.objects.PanelWrapper _mngobsbasepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _textpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _keyhidbtn = null;
public anywheresoftware.b4a.objects.PanelWrapper _dlgbasepanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public anywheresoftware.b4a.objects.ButtonWrapper _imgbuttonedit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _imgbuttonduplicate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _imgbuttondelete = null;
public anywheresoftware.b4a.objects.ButtonWrapper _imgaddbuttonbox = null;
public int _imagerow = 0;
public int _imagecol = 0;
public int _imagetotalcols = 0;
public int _imagestotal = 0;
public String _imagestagcode = "";
public String _imagesuniqueid = "";
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
public String  _camerareturn(xevolution.vrcg.devdemov2400.dialogitemactions __ref,anywheresoftware.b4a.objects.collections.List _shots) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "camerareturn", false))
	 {return ((String) Debug.delegate(ba, "camerareturn", new Object[] {_shots}));}
int _cols = 0;
int _rows = 0;
int _colstart = 0;
boolean _isfirst = false;
int _index = 0;
boolean _out = false;
anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _colindex = 0;
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=138412032;
 //BA.debugLineNum = 138412032;BA.debugLine="Public Sub CameraReturn(shots As List)";
RDebugUtils.currentLine=138412042;
 //BA.debugLineNum = 138412042;BA.debugLine="imagesTotal = imagesTotal + shots.Size";
__ref._imagestotal /*int*/  = (int) (__ref._imagestotal /*int*/ +_shots.getSize());
RDebugUtils.currentLine=138412043;
 //BA.debugLineNum = 138412043;BA.debugLine="Dim Cols As Int = imageTotalCols 'Floor(OwnerPane";
_cols = __ref._imagetotalcols /*int*/ ;
RDebugUtils.currentLine=138412044;
 //BA.debugLineNum = 138412044;BA.debugLine="Dim Rows As Int = Round2((imagesTotal + 1) / Cols";
_rows = (int) (__c.Round2((__ref._imagestotal /*int*/ +1)/(double)_cols,(int) (0)));
RDebugUtils.currentLine=138412045;
 //BA.debugLineNum = 138412045;BA.debugLine="Dim colStart As Int = imageCol";
_colstart = __ref._imagecol /*int*/ ;
RDebugUtils.currentLine=138412047;
 //BA.debugLineNum = 138412047;BA.debugLine="Dim isFirst As Boolean = False";
_isfirst = __c.False;
RDebugUtils.currentLine=138412048;
 //BA.debugLineNum = 138412048;BA.debugLine="Dim index As Int = 0";
_index = (int) (0);
RDebugUtils.currentLine=138412049;
 //BA.debugLineNum = 138412049;BA.debugLine="Dim Out As Boolean = False";
_out = __c.False;
RDebugUtils.currentLine=138412050;
 //BA.debugLineNum = 138412050;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=138412052;
 //BA.debugLineNum = 138412052;BA.debugLine="For i = imageRow To Rows";
{
final int step9 = 1;
final int limit9 = _rows;
_i = __ref._imagerow /*int*/  ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=138412053;
 //BA.debugLineNum = 138412053;BA.debugLine="If (colStart = Cols) Then";
if ((_colstart==_cols)) { 
RDebugUtils.currentLine=138412054;
 //BA.debugLineNum = 138412054;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=138412055;
 //BA.debugLineNum = 138412055;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=138412056;
 //BA.debugLineNum = 138412056;BA.debugLine="ParentWindow.AddView(p, 0, 0, 100%x, 165dip)";
__ref._parentwindow /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (165)));
RDebugUtils.currentLine=138412057;
 //BA.debugLineNum = 138412057;BA.debugLine="Dim colindex As Int = 0";
_colindex = (int) (0);
RDebugUtils.currentLine=138412058;
 //BA.debugLineNum = 138412058;BA.debugLine="If isFirst Then";
if (_isfirst) { 
RDebugUtils.currentLine=138412059;
 //BA.debugLineNum = 138412059;BA.debugLine="p.LoadLayout(\"imgView\")";
_p.LoadLayout("imgView",ba);
 }else {
RDebugUtils.currentLine=138412061;
 //BA.debugLineNum = 138412061;BA.debugLine="p.LoadLayout(\"imgViewNextRow\")";
_p.LoadLayout("imgViewNextRow",ba);
 };
 }else {
RDebugUtils.currentLine=138412065;
 //BA.debugLineNum = 138412065;BA.debugLine="Dim p As Panel = mngImagesArea.GetPanel(i-1)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._mngimagesarea /*b4a.example3.customlistview*/ ._getpanel((int) (_i-1)).getObject()));
 };
RDebugUtils.currentLine=138412067;
 //BA.debugLineNum = 138412067;BA.debugLine="p.Height = 175dip";
_p.setHeight(__c.DipToCurrent((int) (175)));
RDebugUtils.currentLine=138412068;
 //BA.debugLineNum = 138412068;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=138412070;
 //BA.debugLineNum = 138412070;BA.debugLine="For n = colStart To Cols";
{
final int step25 = 1;
final int limit25 = _cols;
_n = _colstart ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=138412071;
 //BA.debugLineNum = 138412071;BA.debugLine="If isFirst Then";
if (_isfirst) { 
RDebugUtils.currentLine=138412072;
 //BA.debugLineNum = 138412072;BA.debugLine="isFirst = False";
_isfirst = __c.False;
RDebugUtils.currentLine=138412073;
 //BA.debugLineNum = 138412073;BA.debugLine="imgAddButtonBox.Tag = imagesTagcode";
__ref._imgaddbuttonbox /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(__ref._imagestagcode /*String*/ ));
 }else {
RDebugUtils.currentLine=138412075;
 //BA.debugLineNum = 138412075;BA.debugLine="Dim pnl As B4XView = p.GetView(colindex)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.GetView(_colindex).getObject()));
RDebugUtils.currentLine=138412076;
 //BA.debugLineNum = 138412076;BA.debugLine="pnl.Visible = True";
_pnl.setVisible(__c.True);
RDebugUtils.currentLine=138412078;
 //BA.debugLineNum = 138412078;BA.debugLine="pnl.SetBitmap(xui.LoadBitmapResize(Starter.Saf";
_pnl.SetBitmap((android.graphics.Bitmap)(_xui.LoadBitmapResize(_starter._safedefaultexternal /*String*/ ,BA.ObjectToString(_shots.Get(_index)),_pnl.getWidth(),_pnl.getHeight(),__c.False).getObject()));
RDebugUtils.currentLine=138412080;
 //BA.debugLineNum = 138412080;BA.debugLine="index = index + 1";
_index = (int) (_index+1);
 };
RDebugUtils.currentLine=138412082;
 //BA.debugLineNum = 138412082;BA.debugLine="colindex = n";
_colindex = _n;
RDebugUtils.currentLine=138412083;
 //BA.debugLineNum = 138412083;BA.debugLine="Out = ((index+1)=imagesTotal)";
_out = ((_index+1)==__ref._imagestotal /*int*/ );
RDebugUtils.currentLine=138412084;
 //BA.debugLineNum = 138412084;BA.debugLine="If Out Then";
if (_out) { 
RDebugUtils.currentLine=138412085;
 //BA.debugLineNum = 138412085;BA.debugLine="imageCol = colindex";
__ref._imagecol /*int*/  = _colindex;
RDebugUtils.currentLine=138412086;
 //BA.debugLineNum = 138412086;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=138412089;
 //BA.debugLineNum = 138412089;BA.debugLine="mngImagesArea.Add(p, \"\") ', 165dip, \"\")";
__ref._mngimagesarea /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
RDebugUtils.currentLine=138412090;
 //BA.debugLineNum = 138412090;BA.debugLine="If Out Then";
if (_out) { 
RDebugUtils.currentLine=138412091;
 //BA.debugLineNum = 138412091;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=138412094;
 //BA.debugLineNum = 138412094;BA.debugLine="imageRow = Rows";
__ref._imagerow /*int*/  = _rows;
RDebugUtils.currentLine=138412096;
 //BA.debugLineNum = 138412096;BA.debugLine="End Sub";
return "";
}
public String  _camerareturnnoaction(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "camerareturnnoaction", false))
	 {return ((String) Debug.delegate(ba, "camerareturnnoaction", null));}
RDebugUtils.currentLine=138477568;
 //BA.debugLineNum = 138477568;BA.debugLine="Public Sub CameraReturnNoAction";
RDebugUtils.currentLine=138477570;
 //BA.debugLineNum = 138477570;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
RDebugUtils.currentLine=137363456;
 //BA.debugLineNum = 137363456;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=137363457;
 //BA.debugLineNum = 137363457;BA.debugLine="Dim IME As IME";
_ime = new anywheresoftware.b4a.objects.IME();
RDebugUtils.currentLine=137363458;
 //BA.debugLineNum = 137363458;BA.debugLine="Private dlgTabPanel As TabStrip";
_dlgtabpanel = new anywheresoftware.b4a.objects.TabStripViewPager();
RDebugUtils.currentLine=137363459;
 //BA.debugLineNum = 137363459;BA.debugLine="Private listsButtonClose As Button";
_listsbuttonclose = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363460;
 //BA.debugLineNum = 137363460;BA.debugLine="Private ParentWindow As Activity";
_parentwindow = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=137363461;
 //BA.debugLineNum = 137363461;BA.debugLine="Private OwnerPanel As B4XView";
_ownerpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=137363462;
 //BA.debugLineNum = 137363462;BA.debugLine="Private imgButtonBox As Button";
_imgbuttonbox = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363463;
 //BA.debugLineNum = 137363463;BA.debugLine="Private imgImage As ImageView";
_imgimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=137363464;
 //BA.debugLineNum = 137363464;BA.debugLine="Private pnlImageBoxOptions As Panel";
_pnlimageboxoptions = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=137363465;
 //BA.debugLineNum = 137363465;BA.debugLine="Private mngImagesArea As CustomListView";
_mngimagesarea = new b4a.example3.customlistview();
RDebugUtils.currentLine=137363466;
 //BA.debugLineNum = 137363466;BA.debugLine="Private mngNotesField As EditText";
_mngnotesfield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=137363467;
 //BA.debugLineNum = 137363467;BA.debugLine="Private mngObsBasePanel As Panel";
_mngobsbasepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=137363468;
 //BA.debugLineNum = 137363468;BA.debugLine="Private textPanel As Panel";
_textpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=137363469;
 //BA.debugLineNum = 137363469;BA.debugLine="Private KeyHidBtn As Button";
_keyhidbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363470;
 //BA.debugLineNum = 137363470;BA.debugLine="Private dlgBasePanel As Panel";
_dlgbasepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=137363471;
 //BA.debugLineNum = 137363471;BA.debugLine="Private mainLabelOptLists As Label";
_mainlabeloptlists = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=137363472;
 //BA.debugLineNum = 137363472;BA.debugLine="Private imgButtonEdit As Button";
_imgbuttonedit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363473;
 //BA.debugLineNum = 137363473;BA.debugLine="Private imgButtonDuplicate As Button";
_imgbuttonduplicate = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363474;
 //BA.debugLineNum = 137363474;BA.debugLine="Private imgButtonDelete As Button";
_imgbuttondelete = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363475;
 //BA.debugLineNum = 137363475;BA.debugLine="Private imgAddButtonBox As Button";
_imgaddbuttonbox = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=137363477;
 //BA.debugLineNum = 137363477;BA.debugLine="Private imageRow As Int";
_imagerow = 0;
RDebugUtils.currentLine=137363478;
 //BA.debugLineNum = 137363478;BA.debugLine="Private imageCol As Int";
_imagecol = 0;
RDebugUtils.currentLine=137363479;
 //BA.debugLineNum = 137363479;BA.debugLine="Private imageTotalCols As Int";
_imagetotalcols = 0;
RDebugUtils.currentLine=137363481;
 //BA.debugLineNum = 137363481;BA.debugLine="Private imagesTotal As Int = 0";
_imagestotal = (int) (0);
RDebugUtils.currentLine=137363482;
 //BA.debugLineNum = 137363482;BA.debugLine="Private imagesTagcode As String";
_imagestagcode = "";
RDebugUtils.currentLine=137363483;
 //BA.debugLineNum = 137363483;BA.debugLine="Private imagesUniqueID As String";
_imagesuniqueid = "";
RDebugUtils.currentLine=137363484;
 //BA.debugLineNum = 137363484;BA.debugLine="End Sub";
return "";
}
public String  _dlgtabpanel_pageselected(xevolution.vrcg.devdemov2400.dialogitemactions __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "dlgtabpanel_pageselected", false))
	 {return ((String) Debug.delegate(ba, "dlgtabpanel_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=137625600;
 //BA.debugLineNum = 137625600;BA.debugLine="Sub dlgTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=137625601;
 //BA.debugLineNum = 137625601;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
RDebugUtils.currentLine=137625602;
 //BA.debugLineNum = 137625602;BA.debugLine="End Sub";
return "";
}
public String  _imgaddbuttonbox_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgaddbuttonbox_click", false))
	 {return ((String) Debug.delegate(ba, "imgaddbuttonbox_click", null));}
RDebugUtils.currentLine=138346496;
 //BA.debugLineNum = 138346496;BA.debugLine="Sub imgAddButtonBox_Click";
RDebugUtils.currentLine=138346498;
 //BA.debugLineNum = 138346498;BA.debugLine="CallSubDelayed2(CameraActivity2, \"StartCamera\", M";
__c.CallSubDelayed2(ba,(Object)(_cameraactivity2.getObject()),"StartCamera",this);
RDebugUtils.currentLine=138346499;
 //BA.debugLineNum = 138346499;BA.debugLine="End Sub";
return "";
}
public String  _imgbuttonbox_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgbuttonbox_click", false))
	 {return ((String) Debug.delegate(ba, "imgbuttonbox_click", null));}
RDebugUtils.currentLine=137691136;
 //BA.debugLineNum = 137691136;BA.debugLine="Sub imgButtonBox_Click";
RDebugUtils.currentLine=137691138;
 //BA.debugLineNum = 137691138;BA.debugLine="End Sub";
return "";
}
public String  _imgbuttondelete_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgbuttondelete_click", false))
	 {return ((String) Debug.delegate(ba, "imgbuttondelete_click", null));}
RDebugUtils.currentLine=138149888;
 //BA.debugLineNum = 138149888;BA.debugLine="Sub imgButtonDelete_Click";
RDebugUtils.currentLine=138149890;
 //BA.debugLineNum = 138149890;BA.debugLine="End Sub";
return "";
}
public String  _imgbuttonduplicate_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgbuttonduplicate_click", false))
	 {return ((String) Debug.delegate(ba, "imgbuttonduplicate_click", null));}
RDebugUtils.currentLine=138215424;
 //BA.debugLineNum = 138215424;BA.debugLine="Sub imgButtonDuplicate_Click";
RDebugUtils.currentLine=138215426;
 //BA.debugLineNum = 138215426;BA.debugLine="End Sub";
return "";
}
public String  _imgbuttonedit_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgbuttonedit_click", false))
	 {return ((String) Debug.delegate(ba, "imgbuttonedit_click", null));}
RDebugUtils.currentLine=138280960;
 //BA.debugLineNum = 138280960;BA.debugLine="Sub imgButtonEdit_Click";
RDebugUtils.currentLine=138280962;
 //BA.debugLineNum = 138280962;BA.debugLine="End Sub";
return "";
}
public String  _imgimage_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgimage_click", false))
	 {return ((String) Debug.delegate(ba, "imgimage_click", null));}
RDebugUtils.currentLine=137756672;
 //BA.debugLineNum = 137756672;BA.debugLine="Sub imgImage_Click";
RDebugUtils.currentLine=137756674;
 //BA.debugLineNum = 137756674;BA.debugLine="End Sub";
return "";
}
public String  _imgimage_longclick(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgimage_longclick", false))
	 {return ((String) Debug.delegate(ba, "imgimage_longclick", null));}
RDebugUtils.currentLine=137822208;
 //BA.debugLineNum = 137822208;BA.debugLine="Sub imgImage_LongClick";
RDebugUtils.currentLine=137822210;
 //BA.debugLineNum = 137822210;BA.debugLine="End Sub";
return "";
}
public String  _imgpictureclick_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "imgpictureclick_click", false))
	 {return ((String) Debug.delegate(ba, "imgpictureclick_click", null));}
RDebugUtils.currentLine=138543104;
 //BA.debugLineNum = 138543104;BA.debugLine="Sub imgPictureClick_Click";
RDebugUtils.currentLine=138543106;
 //BA.debugLineNum = 138543106;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.dialogitemactions __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _act,anywheresoftware.b4a.objects.B4XViewWrapper _owner) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_act,_owner}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=137428992;
 //BA.debugLineNum = 137428992;BA.debugLine="Public Sub Initialize(act As Activity, Owner As B4";
RDebugUtils.currentLine=137428993;
 //BA.debugLineNum = 137428993;BA.debugLine="ParentWindow = act";
__ref._parentwindow /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _act;
RDebugUtils.currentLine=137428994;
 //BA.debugLineNum = 137428994;BA.debugLine="OwnerPanel = Owner";
__ref._ownerpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _owner;
RDebugUtils.currentLine=137428995;
 //BA.debugLineNum = 137428995;BA.debugLine="OwnerPanel.LoadLayout(\"Dialog_ItemsActions\")";
__ref._ownerpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Dialog_ItemsActions",ba);
RDebugUtils.currentLine=137428996;
 //BA.debugLineNum = 137428996;BA.debugLine="dlgTabPanel.LoadLayout(\"ManagementImageList\", \"Ev";
__ref._dlgtabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("ManagementImageList",BA.ObjectToCharSequence("Evidências"));
RDebugUtils.currentLine=137428997;
 //BA.debugLineNum = 137428997;BA.debugLine="dlgTabPanel.LoadLayout(\"ManagementActions\", \"Acçõ";
__ref._dlgtabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("ManagementActions",BA.ObjectToCharSequence("Acções subsequentes"));
RDebugUtils.currentLine=137428998;
 //BA.debugLineNum = 137428998;BA.debugLine="dlgTabPanel.LoadLayout(\"ManagementObservations\",";
__ref._dlgtabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("ManagementObservations",BA.ObjectToCharSequence("Notas/Observações"));
RDebugUtils.currentLine=137428999;
 //BA.debugLineNum = 137428999;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(dl";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = _utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (ba,__ref._dlgtabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ );
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group7.Get(index7)));
RDebugUtils.currentLine=137429000;
 //BA.debugLineNum = 137429000;BA.debugLine="lbl.Width = 33.33%x";
_lbl.setWidth(__c.PerXToCurrent((float) (33.33),ba));
 }
};
RDebugUtils.currentLine=137429002;
 //BA.debugLineNum = 137429002;BA.debugLine="StartDlgIOActivity(\"ABC1\", \"ABC1\", 1)";
__ref._startdlgioactivity /*String*/ (null,"ABC1","ABC1",(int) (1));
RDebugUtils.currentLine=137429005;
 //BA.debugLineNum = 137429005;BA.debugLine="IME.Initialize(\"IME\")";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .Initialize("IME");
RDebugUtils.currentLine=137429007;
 //BA.debugLineNum = 137429007;BA.debugLine="OwnerPanel.visible = True";
__ref._ownerpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=137429008;
 //BA.debugLineNum = 137429008;BA.debugLine="End Sub";
return "";
}
public String  _startdlgioactivity(xevolution.vrcg.devdemov2400.dialogitemactions __ref,String _tagcode,String _uniqueid,int _imgcount) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "startdlgioactivity", false))
	 {return ((String) Debug.delegate(ba, "startdlgioactivity", new Object[] {_tagcode,_uniqueid,_imgcount}));}
int _cols = 0;
int _rows = 0;
boolean _isfirst = false;
int _index = 0;
boolean _out = false;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _colindex = 0;
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=137494528;
 //BA.debugLineNum = 137494528;BA.debugLine="Sub StartDlgIOActivity(Tagcode As String, UniqueID";
RDebugUtils.currentLine=137494529;
 //BA.debugLineNum = 137494529;BA.debugLine="imagesTotal = ImgCount";
__ref._imagestotal /*int*/  = _imgcount;
RDebugUtils.currentLine=137494530;
 //BA.debugLineNum = 137494530;BA.debugLine="imagesTagcode = Tagcode";
__ref._imagestagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=137494531;
 //BA.debugLineNum = 137494531;BA.debugLine="imagesUniqueID = UniqueID";
__ref._imagesuniqueid /*String*/  = _uniqueid;
RDebugUtils.currentLine=137494533;
 //BA.debugLineNum = 137494533;BA.debugLine="Dim Cols As Int = Floor(OwnerPanel.Width/225)";
_cols = (int) (__c.Floor(__ref._ownerpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)225));
RDebugUtils.currentLine=137494534;
 //BA.debugLineNum = 137494534;BA.debugLine="Dim Rows As Int = Round2((ImgCount + 1) / Cols, 0";
_rows = (int) (__c.Round2((_imgcount+1)/(double)_cols,(int) (0)));
RDebugUtils.currentLine=137494535;
 //BA.debugLineNum = 137494535;BA.debugLine="If (Rows = 0) Then Rows = 1";
if ((_rows==0)) { 
_rows = (int) (1);};
RDebugUtils.currentLine=137494537;
 //BA.debugLineNum = 137494537;BA.debugLine="imageTotalCols = Cols";
__ref._imagetotalcols /*int*/  = _cols;
RDebugUtils.currentLine=137494539;
 //BA.debugLineNum = 137494539;BA.debugLine="Dim isFirst As Boolean = True";
_isfirst = __c.True;
RDebugUtils.currentLine=137494540;
 //BA.debugLineNum = 137494540;BA.debugLine="Dim index As Int = 0";
_index = (int) (0);
RDebugUtils.currentLine=137494541;
 //BA.debugLineNum = 137494541;BA.debugLine="Dim Out As Boolean = False";
_out = __c.False;
RDebugUtils.currentLine=137494542;
 //BA.debugLineNum = 137494542;BA.debugLine="For i = 1 To Rows";
{
final int step11 = 1;
final int limit11 = _rows;
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=137494543;
 //BA.debugLineNum = 137494543;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=137494544;
 //BA.debugLineNum = 137494544;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=137494545;
 //BA.debugLineNum = 137494545;BA.debugLine="ParentWindow.AddView(p, 0, 0, 100%x, 165dip)";
__ref._parentwindow /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (165)));
RDebugUtils.currentLine=137494546;
 //BA.debugLineNum = 137494546;BA.debugLine="Dim colindex As Int = 0";
_colindex = (int) (0);
RDebugUtils.currentLine=137494547;
 //BA.debugLineNum = 137494547;BA.debugLine="If isFirst Then";
if (_isfirst) { 
RDebugUtils.currentLine=137494548;
 //BA.debugLineNum = 137494548;BA.debugLine="p.LoadLayout(\"imgView\")";
_p.LoadLayout("imgView",ba);
 }else {
RDebugUtils.currentLine=137494550;
 //BA.debugLineNum = 137494550;BA.debugLine="p.LoadLayout(\"imgViewNextRow\")";
_p.LoadLayout("imgViewNextRow",ba);
 };
RDebugUtils.currentLine=137494552;
 //BA.debugLineNum = 137494552;BA.debugLine="p.Height = 165dip";
_p.setHeight(__c.DipToCurrent((int) (165)));
RDebugUtils.currentLine=137494553;
 //BA.debugLineNum = 137494553;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=137494554;
 //BA.debugLineNum = 137494554;BA.debugLine="For n = 1 To Cols";
{
final int step23 = 1;
final int limit23 = _cols;
_n = (int) (1) ;
for (;_n <= limit23 ;_n = _n + step23 ) {
RDebugUtils.currentLine=137494555;
 //BA.debugLineNum = 137494555;BA.debugLine="If isFirst Then";
if (_isfirst) { 
RDebugUtils.currentLine=137494556;
 //BA.debugLineNum = 137494556;BA.debugLine="isFirst = False";
_isfirst = __c.False;
RDebugUtils.currentLine=137494557;
 //BA.debugLineNum = 137494557;BA.debugLine="imgAddButtonBox.Tag = Tagcode";
__ref._imgaddbuttonbox /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_tagcode));
 }else {
RDebugUtils.currentLine=137494559;
 //BA.debugLineNum = 137494559;BA.debugLine="Dim pnl As B4XView = p.GetView(colindex)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.GetView(_colindex).getObject()));
RDebugUtils.currentLine=137494560;
 //BA.debugLineNum = 137494560;BA.debugLine="pnl.Visible = True";
_pnl.setVisible(__c.True);
RDebugUtils.currentLine=137494561;
 //BA.debugLineNum = 137494561;BA.debugLine="pnl.Color = Rnd(0xFF000000, 0xFFFFFFFF)";
_pnl.setColor(__c.Rnd((int) (0xff000000),(int) (0xffffffff)));
RDebugUtils.currentLine=137494562;
 //BA.debugLineNum = 137494562;BA.debugLine="index = index + 1";
_index = (int) (_index+1);
 };
RDebugUtils.currentLine=137494564;
 //BA.debugLineNum = 137494564;BA.debugLine="colindex = n";
_colindex = _n;
RDebugUtils.currentLine=137494565;
 //BA.debugLineNum = 137494565;BA.debugLine="Out = ((index+1)=ImgCount)";
_out = ((_index+1)==_imgcount);
RDebugUtils.currentLine=137494566;
 //BA.debugLineNum = 137494566;BA.debugLine="If Out Then";
if (_out) { 
RDebugUtils.currentLine=137494567;
 //BA.debugLineNum = 137494567;BA.debugLine="imageCol = colindex";
__ref._imagecol /*int*/  = _colindex;
RDebugUtils.currentLine=137494568;
 //BA.debugLineNum = 137494568;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=137494571;
 //BA.debugLineNum = 137494571;BA.debugLine="mngImagesArea.Add(p, \"\") ', 165dip, \"\")";
__ref._mngimagesarea /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
RDebugUtils.currentLine=137494572;
 //BA.debugLineNum = 137494572;BA.debugLine="If Out Then";
if (_out) { 
RDebugUtils.currentLine=137494573;
 //BA.debugLineNum = 137494573;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=137494576;
 //BA.debugLineNum = 137494576;BA.debugLine="imageRow = Rows";
__ref._imagerow /*int*/  = _rows;
RDebugUtils.currentLine=137494577;
 //BA.debugLineNum = 137494577;BA.debugLine="End Sub";
return "";
}
public String  _listsbuttonclose_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(ba, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=137560064;
 //BA.debugLineNum = 137560064;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=137560065;
 //BA.debugLineNum = 137560065;BA.debugLine="Log(\"Back DIALOGS\")";
__c.LogImpl("6137560065","Back DIALOGS",0);
RDebugUtils.currentLine=137560068;
 //BA.debugLineNum = 137560068;BA.debugLine="CallSubDelayed(\"CheckList3\", \"RemoveActionOptions";
__c.CallSubDelayed(ba,(Object)("CheckList3"),"RemoveActionOptionsPanel");
RDebugUtils.currentLine=137560069;
 //BA.debugLineNum = 137560069;BA.debugLine="End Sub";
return "";
}
public String  _mainlabeloptlists_click(xevolution.vrcg.devdemov2400.dialogitemactions __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "mainlabeloptlists_click", false))
	 {return ((String) Debug.delegate(ba, "mainlabeloptlists_click", null));}
RDebugUtils.currentLine=138084352;
 //BA.debugLineNum = 138084352;BA.debugLine="Sub mainLabelOptLists_Click";
RDebugUtils.currentLine=138084353;
 //BA.debugLineNum = 138084353;BA.debugLine="IME.HideKeyboard";
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);
RDebugUtils.currentLine=138084354;
 //BA.debugLineNum = 138084354;BA.debugLine="End Sub";
return "";
}
public String  _mngimagesarea_itemclick(xevolution.vrcg.devdemov2400.dialogitemactions __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "mngimagesarea_itemclick", false))
	 {return ((String) Debug.delegate(ba, "mngimagesarea_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=137887744;
 //BA.debugLineNum = 137887744;BA.debugLine="Sub mngImagesArea_ItemClick (Index As Int, Value A";
RDebugUtils.currentLine=137887746;
 //BA.debugLineNum = 137887746;BA.debugLine="End Sub";
return "";
}
public String  _mngnotesfield_focuschanged(xevolution.vrcg.devdemov2400.dialogitemactions __ref,boolean _hasfocus) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "mngnotesfield_focuschanged", false))
	 {return ((String) Debug.delegate(ba, "mngnotesfield_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=138018816;
 //BA.debugLineNum = 138018816;BA.debugLine="Sub mngNotesField_FocusChanged (HasFocus As Boolea";
RDebugUtils.currentLine=138018817;
 //BA.debugLineNum = 138018817;BA.debugLine="If Not(HasFocus) Then IME.HideKeyboard";
if (__c.Not(_hasfocus)) { 
__ref._ime /*anywheresoftware.b4a.objects.IME*/ .HideKeyboard(ba);};
RDebugUtils.currentLine=138018818;
 //BA.debugLineNum = 138018818;BA.debugLine="End Sub";
return "";
}
public String  _mngnotesfield_textchanged(xevolution.vrcg.devdemov2400.dialogitemactions __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="dialogitemactions";
if (Debug.shouldDelegate(ba, "mngnotesfield_textchanged", false))
	 {return ((String) Debug.delegate(ba, "mngnotesfield_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=137953280;
 //BA.debugLineNum = 137953280;BA.debugLine="Sub mngNotesField_TextChanged (Old As String, New";
RDebugUtils.currentLine=137953282;
 //BA.debugLineNum = 137953282;BA.debugLine="End Sub";
return "";
}
}