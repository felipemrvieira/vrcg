package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class appactiondialogs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.appactiondialogs");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.appactiondialogs.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _applactiondialog = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _currentcld = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _actdlg_one_button = null;
public b4a.example3.customlistview _viewsimplelist = null;
public anywheresoftware.b4a.objects.LabelWrapper _viewsimplelisttitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _viewsimplelistinfo = null;
public Object _thisactivityname_tasklistdialog = null;
public anywheresoftware.b4a.objects.LabelWrapper _viewsimplelistnumber = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbasepanel = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _obsoptions = null;
public anywheresoftware.b4a.objects.EditTextWrapper _itemnotes = null;
public b4a.example3.customlistview _itemimages = null;
public anywheresoftware.b4a.objects.ButtonWrapper _takephoto = null;
public String _actioncode = "";
public com.simplysoftware.base64convert.base64convert _base64con = null;
public anywheresoftware.b4a.objects.ActivityWrapper _currentactivity = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _imagefilename = null;
public anywheresoftware.b4a.objects.LabelWrapper _imagestate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _takeobsoption = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dlgastype = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dlgasemails = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dlgaspriority = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dlgasurgency = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dlgasassign = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _dlgassendemail = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasdetails = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasassign = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasemails = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasrelated = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasviewrelated = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasdatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaspriority = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasstate = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemasurgency = null;
public anywheresoftware.b4a.objects.ButtonWrapper _takeas = null;
public xevolution.vrcg.devdemov2400.expandedlistview _ashistorylist = null;
public anywheresoftware.b4a.objects.PanelWrapper _aspanel = null;
public anywheresoftware.b4a.objects.collections.List _as_status = null;
public anywheresoftware.b4a.objects.collections.List _as_types = null;
public anywheresoftware.b4a.objects.collections.List _as_priority = null;
public anywheresoftware.b4a.objects.collections.List _as_urgency = null;
public anywheresoftware.b4a.objects.collections.List _as_modes = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrouptitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouptitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupexpand = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroupexpanded = null;
public int _currentindex = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _dlgasstatus = null;
public anywheresoftware.b4a.objects.collections.List _currentimagelist = null;
public boolean _emailsentonnewas = false;
public xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
public String _currenttagcode = "";
public anywheresoftware.b4a.objects.ButtonWrapper _sendemailimages = null;
public anywheresoftware.b4a.objects.ButtonWrapper _sendemail = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dlgasemailscc = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dlgasemailssubject = null;
public anywheresoftware.b4a.objects.LabelWrapper _imageselected = null;
public anywheresoftware.b4a.objects.LabelWrapper _claitem_g1 = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claitembutton_1 = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _claitembutton_2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clabuttonoptions = null;
public String _master_obs = "";
public String _master_image = "";
public anywheresoftware.b4a.objects.ButtonWrapper _changeas = null;
public int _panelontop = 0;
public anywheresoftware.b4a.objects.PanelWrapper _ashistory = null;
public boolean _isfastoptioncheck = false;
public int _fastoptioncheck = 0;
public anywheresoftware.b4a.objects.LabelWrapper _imageselectedonreport = null;
public b4a.example3.customlistview _claitemslist = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _claitemeditvalue = null;
public anywheresoftware.b4a.objects.LabelWrapper _claitemlabel = null;
public String _objecttagcode = "";
public anywheresoftware.b4a.objects.ImageViewWrapper _showimageview = null;
public xevolution.vrcg.devdemov2400.types._requestclaitem _currentrequestclaitem = null;
public anywheresoftware.b4a.objects.EditTextWrapper _currentitemnotes = null;
public anywheresoftware.b4a.objects.EditTextWrapper _dlgassubject = null;
public anywheresoftware.b4a.objects.EditTextWrapper _dlgasdetails = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butasduedate = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dlgasduedate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _associateobject = null;
public anywheresoftware.b4a.objects.LabelWrapper _imagestatename = null;
public String _currentitemnotestext = "";
public anywheresoftware.b4a.objects.ButtonWrapper _takesignature = null;
public b4a.example3.customlistview _itemsignatures = null;
public anywheresoftware.b4a.objects.PanelWrapper _signaturepanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _innersignatureview = null;
public anywheresoftware.b4a.objects.LabelWrapper _innersignatureonreport = null;
public anywheresoftware.b4a.objects.LabelWrapper _innersignatureremove = null;
public anywheresoftware.b4a.objects.LabelWrapper _innersignaturename = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelsignature = null;
public anywheresoftware.b4a.objects.PanelWrapper _signpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclearsign = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsavesign = null;
public anywheresoftware.b4a.objects.LabelWrapper _signperson = null;
public xevolution.vrcg.devdemov2400.signaturecapture._signaturedata _signature = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _signcanvas = null;
public anywheresoftware.b4a.objects.LabelWrapper _innersignatureinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _moreactionquest = null;
public anywheresoftware.b4a.objects.LabelWrapper _moreactionquest2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _moreactionquest3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _takenewdesign = null;
public String _itemtitle = "";
public String _pressedanswertagcode = "";
public anywheresoftware.b4a.objects.EditTextWrapper _itemhistnotes = null;
public b4a.example3.customlistview _itemhistsignatures = null;
public b4a.example3.customlistview _itemhistimages = null;
public anywheresoftware.b4a.objects.PanelWrapper _signpanelview = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncancelsign = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dlgasccemails = null;
public anywheresoftware.b4a.objects.LabelWrapper _imageselectedtrash = null;
public b4a.example3.customlistview _objectsimages = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _itemimageview = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _btnassociateimage = null;
public anywheresoftware.b4a.objects.collections.List _associateimageslist = null;
public anywheresoftware.b4a.objects.collections.List _associateimagescompletelist = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblobjectimagetitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _editas = null;
public String _currentastagcode = "";
public anywheresoftware.b4a.objects.LabelWrapper _avisonoimages = null;
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
public String  _initialize(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=66584576;
 //BA.debugLineNum = 66584576;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=66584577;
 //BA.debugLineNum = 66584577;BA.debugLine="AS_Status = DBStructures.getASStatus";
__ref._as_status /*anywheresoftware.b4a.objects.collections.List*/  = _dbstructures._getasstatus /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=66584578;
 //BA.debugLineNum = 66584578;BA.debugLine="AS_Types = DBStructures.getASTypes";
__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/  = _dbstructures._getastypes /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=66584579;
 //BA.debugLineNum = 66584579;BA.debugLine="AS_Priority = DBStructures.getPriority";
__ref._as_priority /*anywheresoftware.b4a.objects.collections.List*/  = _dbstructures._getpriority /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=66584580;
 //BA.debugLineNum = 66584580;BA.debugLine="AS_Urgency = DBStructures.getUrgency";
__ref._as_urgency /*anywheresoftware.b4a.objects.collections.List*/  = _dbstructures._geturgency /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=66584581;
 //BA.debugLineNum = 66584581;BA.debugLine="AS_Modes = DBStructures.getASModes";
__ref._as_modes /*anywheresoftware.b4a.objects.collections.List*/  = _dbstructures._getasmodes /*anywheresoftware.b4a.objects.collections.List*/ (ba);
RDebugUtils.currentLine=66584582;
 //BA.debugLineNum = 66584582;BA.debugLine="CurrentImageList.Initialize";
__ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66584583;
 //BA.debugLineNum = 66584583;BA.debugLine="AssociateImagesList.Initialize";
__ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66584585;
 //BA.debugLineNum = 66584585;BA.debugLine="ObjectTagcode = \"\" 'innerObject";
__ref._objecttagcode /*String*/  = "";
RDebugUtils.currentLine=66584586;
 //BA.debugLineNum = 66584586;BA.debugLine="End Sub";
return "";
}
public void  _camerareturn(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename,xevolution.vrcg.devdemov2400.types._requestclaitem _this) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "camerareturn", false))
	 {Debug.delegate(ba, "camerareturn", new Object[] {_filename,_this}); return;}
ResumableSub_CameraReturn rsub = new ResumableSub_CameraReturn(this,__ref,_filename,_this);
rsub.resume(ba, null);
}
public static class ResumableSub_CameraReturn extends BA.ResumableSub {
public ResumableSub_CameraReturn(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename,xevolution.vrcg.devdemov2400.types._requestclaitem _this) {
this.parent = parent;
this.__ref = __ref;
this._filename = _filename;
this._this = _this;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _filename;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _obj = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.Map _params33 = null;
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
int _v = 0;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
int _n = 0;
String _image = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _serverlocation = "";
int step71;
int limit71;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69140483;
 //BA.debugLineNum = 69140483;BA.debugLine="Dim obj As String = ObjectTagcode";
_obj = __ref._objecttagcode /*String*/ ;
RDebugUtils.currentLine=69140484;
 //BA.debugLineNum = 69140484;BA.debugLine="If (Utils.isNullOrEmpty(obj)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._utils._isnullorempty /*boolean*/ (ba,_obj))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=69140485;
 //BA.debugLineNum = 69140485;BA.debugLine="obj = this.TagObject";
_obj = _this.TagObject /*String*/ ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=69140487;
 //BA.debugLineNum = 69140487;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69140488;
 //BA.debugLineNum = 69140488;BA.debugLine="Dim params33 As Map";
_params33 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69140490;
 //BA.debugLineNum = 69140490;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
if (true) break;

case 5:
//if
this.state = 22;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_filename))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=69140491;
 //BA.debugLineNum = 69140491;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
if (true) break;

case 8:
//if
this.state = 11;
if (parent.__c.Not(_filename.indexOf(".png")>=0)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=69140492;
 //BA.debugLineNum = 69140492;BA.debugLine="FileName = $\"${FileName}.png\"$";
_filename = (""+parent.__c.SmartStringFormatter("",(Object)(_filename))+".png");
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=69140494;
 //BA.debugLineNum = 69140494;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=69140495;
 //BA.debugLineNum = 69140495;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=69140496;
 //BA.debugLineNum = 69140496;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+""));
RDebugUtils.currentLine=69140499;
 //BA.debugLineNum = 69140499;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent._dbstructures._getmaxofevc /*int*/ (ba,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=69140500;
 //BA.debugLineNum = 69140500;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values_images \n"+"						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"+"						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"						values ("+parent.__c.SmartStringFormatter("",(Object)(_maxid))+", '"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"',\n"+"		'"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_filename))+"', 1, "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+")");
RDebugUtils.currentLine=69140506;
 //BA.debugLineNum = 69140506;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.Req";
parent._utils._savesqltolog /*boolean*/ (ba,"CameraReturn",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=69140509;
 //BA.debugLineNum = 69140509;BA.debugLine="If (Utils.NNE(obj)) Then";
if (true) break;

case 12:
//if
this.state = 15;
if ((parent._utils._nne /*boolean*/ (ba,_obj))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=69140510;
 //BA.debugLineNum = 69140510;BA.debugLine="Dim v As Int = Utils.DBDataCount(Starter.LocalS";
_v = (int) (parent._utils._dbdatacount /*int*/ (ba,parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,("select count(0) as COUNTER from dta_objects_images "))+1);
RDebugUtils.currentLine=69140511;
 //BA.debugLineNum = 69140511;BA.debugLine="Dim sSQL As String = $\"insert into dta_objects_";
_ssql = ("insert into dta_objects_images (id, object_tagcode, image, filename)\n"+"					values ("+parent.__c.SmartStringFormatter("",(Object)(_v))+", '"+parent.__c.SmartStringFormatter("",(Object)(_obj))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_filename))+"')");
RDebugUtils.currentLine=69140513;
 //BA.debugLineNum = 69140513;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.Re";
parent._utils._savesqltolog /*boolean*/ (ba,"CameraReturn",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=69140516;
 //BA.debugLineNum = 69140516;BA.debugLine="params33.Initialize";
_params33.Initialize();
RDebugUtils.currentLine=69140517;
 //BA.debugLineNum = 69140517;BA.debugLine="params33.Clear";
_params33.Clear();
RDebugUtils.currentLine=69140518;
 //BA.debugLineNum = 69140518;BA.debugLine="params33.Put(\"_token\", ShareCode.APP_TOKEN)";
_params33.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69140519;
 //BA.debugLineNum = 69140519;BA.debugLine="params33.Put(\"ACLATagcode\", obj)";
_params33.Put((Object)("ACLATagcode"),(Object)(_obj));
RDebugUtils.currentLine=69140520;
 //BA.debugLineNum = 69140520;BA.debugLine="params33.Put(\"ACLAValueImage\", ImgB64)";
_params33.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=69140521;
 //BA.debugLineNum = 69140521;BA.debugLine="params33.Put(\"ACLAValueFileImage\", FileName)";
_params33.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=69140525;
 //BA.debugLineNum = 69140525;BA.debugLine="Private sACLADatetime As String = Utils.GetCurrD";
_sacladatetime = parent._utils._getcurrdatetime /*String*/ (ba);
RDebugUtils.currentLine=69140526;
 //BA.debugLineNum = 69140526;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOr";
_saclalatitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=69140527;
 //BA.debugLineNum = 69140527;BA.debugLine="Private sACLALongitude As String = Utils.IfNullO";
_saclalongitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=69140529;
 //BA.debugLineNum = 69140529;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69140530;
 //BA.debugLineNum = 69140530;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=69140531;
 //BA.debugLineNum = 69140531;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69140532;
 //BA.debugLineNum = 69140532;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=69140533;
 //BA.debugLineNum = 69140533;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=69140534;
 //BA.debugLineNum = 69140534;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=69140535;
 //BA.debugLineNum = 69140535;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=69140536;
 //BA.debugLineNum = 69140536;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=69140537;
 //BA.debugLineNum = 69140537;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=69140540;
 //BA.debugLineNum = 69140540;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=69140541;
 //BA.debugLineNum = 69140541;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
RDebugUtils.currentLine=69140542;
 //BA.debugLineNum = 69140542;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=69140543;
 //BA.debugLineNum = 69140543;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69140544;
 //BA.debugLineNum = 69140544;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69140545;
 //BA.debugLineNum = 69140545;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69140546;
 //BA.debugLineNum = 69140546;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69140547;
 //BA.debugLineNum = 69140547;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69140548;
 //BA.debugLineNum = 69140548;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69140549;
 //BA.debugLineNum = 69140549;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69140550;
 //BA.debugLineNum = 69140550;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69140551;
 //BA.debugLineNum = 69140551;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69140552;
 //BA.debugLineNum = 69140552;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=69140553;
 //BA.debugLineNum = 69140553;BA.debugLine="Try";
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
RDebugUtils.currentLine=69140554;
 //BA.debugLineNum = 69140554;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=69140555;
 //BA.debugLineNum = 69140555;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
RDebugUtils.currentLine=69140557;
 //BA.debugLineNum = 69140557;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=69140558;
 //BA.debugLineNum = 69140558;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=69140559;
 //BA.debugLineNum = 69140559;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669140559",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
 if (true) break;
;
RDebugUtils.currentLine=69140564;
 //BA.debugLineNum = 69140564;BA.debugLine="If Not(this.Value = \"IMG_B64_EDIT\") Then";

case 22:
//if
this.state = 51;
if (parent.__c.Not((_this.Value /*String*/ ).equals("IMG_B64_EDIT"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=69140565;
 //BA.debugLineNum = 69140565;BA.debugLine="If (ItemImages.IsInitialized) Then";
if (true) break;

case 25:
//if
this.state = 28;
if ((__ref._itemimages /*b4a.example3.customlistview*/ .IsInitialized())) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=69140566;
 //BA.debugLineNum = 69140566;BA.debugLine="ItemImages.Clear";
__ref._itemimages /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=69140567;
 //BA.debugLineNum = 69140567;BA.debugLine="AssociateImagesCompleteList.Clear";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=69140569;
 //BA.debugLineNum = 69140569;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=69140572;
 //BA.debugLineNum = 69140572;BA.debugLine="Dim sSQL As String = $\"select ifnull(imageb64,''";
_ssql = ("select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report\n"+"		from dta_requests_values_images where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and\n"+"		task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' and \n"+"		tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"'\n"+"		And repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"		And repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
RDebugUtils.currentLine=69140578;
 //BA.debugLineNum = 69140578;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=69140580;
 //BA.debugLineNum = 69140580;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 29:
//if
this.state = 50;
if (_record2.getRowCount()>0) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=69140581;
 //BA.debugLineNum = 69140581;BA.debugLine="For n=0 To Record2.RowCount-1";
if (true) break;

case 32:
//for
this.state = 49;
step71 = 1;
limit71 = (int) (_record2.getRowCount()-1);
_n = (int) (0) ;
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
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=69140582;
 //BA.debugLineNum = 69140582;BA.debugLine="Record2.Position = n";
_record2.setPosition(_n);
RDebugUtils.currentLine=69140583;
 //BA.debugLineNum = 69140583;BA.debugLine="Dim image As String = Record2.GetString(\"image";
_image = _record2.GetString("imageb64");
RDebugUtils.currentLine=69140584;
 //BA.debugLineNum = 69140584;BA.debugLine="Dim FileName As String = Record2.GetString(\"im";
_filename = _record2.GetString("imagename");
RDebugUtils.currentLine=69140585;
 //BA.debugLineNum = 69140585;BA.debugLine="If Not(Utils.isNullOrEmpty(image)) Then";
if (true) break;

case 35:
//if
this.state = 48;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_image))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=69140587;
 //BA.debugLineNum = 69140587;BA.debugLine="If (ItemImages.IsInitialized) Then";
if (true) break;

case 38:
//if
this.state = 47;
if ((__ref._itemimages /*b4a.example3.customlistview*/ .IsInitialized())) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=69140588;
 //BA.debugLineNum = 69140588;BA.debugLine="Try";
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
RDebugUtils.currentLine=69140589;
 //BA.debugLineNum = 69140589;BA.debugLine="ItemImages.Add(CreateImagePanel(this, FileN";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,_filename,_image,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=69140590;
 //BA.debugLineNum = 69140590;BA.debugLine="AssociateImagesCompleteList.Add(FileName)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
RDebugUtils.currentLine=69140592;
 //BA.debugLineNum = 69140592;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669140592",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
;
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=69140598;
 //BA.debugLineNum = 69140598;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;
;
RDebugUtils.currentLine=69140602;
 //BA.debugLineNum = 69140602;BA.debugLine="If (params.IsInitialized) Then";

case 51:
//if
this.state = 72;
if ((_params.IsInitialized())) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=69140603;
 //BA.debugLineNum = 69140603;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=69140604;
 //BA.debugLineNum = 69140604;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 54:
//if
this.state = 59;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
RDebugUtils.currentLine=69140605;
 //BA.debugLineNum = 69140605;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=69140607;
 //BA.debugLineNum = 69140607;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69140608;
 //BA.debugLineNum = 69140608;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=69140610;
 //BA.debugLineNum = 69140610;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturn"),(int) (1000));
this.state = 84;
return;
case 84:
//C
this.state = 60;
;
RDebugUtils.currentLine=69140614;
 //BA.debugLineNum = 69140614;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 60:
//if
this.state = 71;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 62;
}else {
this.state = 70;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=69140615;
 //BA.debugLineNum = 69140615;BA.debugLine="Try";
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
RDebugUtils.currentLine=69140616;
 //BA.debugLineNum = 69140616;BA.debugLine="UploadFilesWithFTP(FileName)";
__ref._uploadfileswithftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename);
 if (true) break;

case 67:
//C
this.state = 68;
this.catchState = 0;
RDebugUtils.currentLine=69140618;
 //BA.debugLineNum = 69140618;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669140618",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=69140619;
 //BA.debugLineNum = 69140619;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=69140620;
 //BA.debugLineNum = 69140620;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69140621;
 //BA.debugLineNum = 69140621;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1,";
parent._utils._save2update /*String*/ (ba,_serverlocation,_filename,(int) (1),_workernd);
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
RDebugUtils.currentLine=69140624;
 //BA.debugLineNum = 69140624;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.A";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=69140625;
 //BA.debugLineNum = 69140625;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69140626;
 //BA.debugLineNum = 69140626;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1,";
parent._utils._save2update /*String*/ (ba,_serverlocation,_filename,(int) (1),_workernd);
 if (true) break;

case 71:
//C
this.state = 72;
;
RDebugUtils.currentLine=69140628;
 //BA.debugLineNum = 69140628;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturn"),(int) (1000));
this.state = 85;
return;
case 85:
//C
this.state = 72;
;
 if (true) break;
;
RDebugUtils.currentLine=69140631;
 //BA.debugLineNum = 69140631;BA.debugLine="If (params33.IsInitialized) Then";

case 72:
//if
this.state = 81;
if ((_params33.IsInitialized())) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=69140632;
 //BA.debugLineNum = 69140632;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more2/img/update");
RDebugUtils.currentLine=69140633;
 //BA.debugLineNum = 69140633;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 75:
//if
this.state = 80;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 77;
}else {
this.state = 79;
}if (true) break;

case 77:
//C
this.state = 80;
RDebugUtils.currentLine=69140634;
 //BA.debugLineNum = 69140634;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.Re";
parent._utils._callapi /*String*/ (ba,(int) (0),_params33,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=69140636;
 //BA.debugLineNum = 69140636;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69140637;
 //BA.debugLineNum = 69140637;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params33";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params33),(int) (0),_workernd);
 if (true) break;

case 80:
//C
this.state = 81;
;
RDebugUtils.currentLine=69140639;
 //BA.debugLineNum = 69140639;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturn"),(int) (1000));
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
RDebugUtils.currentLine=69140642;
 //BA.debugLineNum = 69140642;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _getmoreactionsdialog(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activobj,xevolution.vrcg.devdemov2400.types._requestclaitem _this,int _tabpos,String _innerobject,String _tobs,int _action,String _pressedtag,String _tagcodetpa,String _grouptpa,int _actionforce) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "getmoreactionsdialog", false))
	 {Debug.delegate(ba, "getmoreactionsdialog", new Object[] {_activ,_activobj,_this,_tabpos,_innerobject,_tobs,_action,_pressedtag,_tagcodetpa,_grouptpa,_actionforce}); return;}
ResumableSub_GetMoreActionsDialog rsub = new ResumableSub_GetMoreActionsDialog(this,__ref,_activ,_activobj,_this,_tabpos,_innerobject,_tobs,_action,_pressedtag,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(ba, null);
}
public static class ResumableSub_GetMoreActionsDialog extends BA.ResumableSub {
public ResumableSub_GetMoreActionsDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activobj,xevolution.vrcg.devdemov2400.types._requestclaitem _this,int _tabpos,String _innerobject,String _tobs,int _action,String _pressedtag,String _tagcodetpa,String _grouptpa,int _actionforce) {
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
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activobj;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
int _tabpos;
String _innerobject;
String _tobs;
int _action;
String _pressedtag;
String _tagcodetpa;
String _grouptpa;
int _actionforce;
int _widthperc = 0;
int _lbwidth = 0;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _countimages = 0;
boolean _first = false;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.collections.List _item = null;
int _n = 0;
int _status = 0;
String _thetagcode = "";
boolean _havetagcode = false;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record1 = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
String _image = "";
String _filename = "";
xevolution.vrcg.devdemov2400.types._requestclaitem _ithis = null;
boolean _loaded = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _btm = null;
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record33 = null;
int _idd = 0;
int _conf_sid_id = 0;
String _imginfo = "";
boolean _showtheimage = false;
int _email_sent = 0;
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
String _scriptdata = "";
String _textoobs = "";
int _result = 0;
int _res = 0;
String _evento = "";
String _tipoevento = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _reccount = null;
String _sqlcheck = "";
String _astagcode = "";
String _dataoper = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
anywheresoftware.b4a.objects.LabelWrapper _fln = null;
String _imgb64 = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
anywheresoftware.b4a.BA.IterableList group43;
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
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=66715650;
 //BA.debugLineNum = 66715650;BA.debugLine="ProgressDialogShow2(ShareCode.AvisoAguarde, True)";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._avisoaguarde /*String*/ ),parent.__c.True);
RDebugUtils.currentLine=66715652;
 //BA.debugLineNum = 66715652;BA.debugLine="CurrentRequestCLAItem = this";
__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/  = _this;
RDebugUtils.currentLine=66715653;
 //BA.debugLineNum = 66715653;BA.debugLine="Dim WidthPerc As Int = 100%x";
_widthperc = parent.__c.PerXToCurrent((float) (100),ba);
RDebugUtils.currentLine=66715654;
 //BA.debugLineNum = 66715654;BA.debugLine="Dim lbWidth As Int = WidthPerc /3";
_lbwidth = (int) (_widthperc/(double)3);
RDebugUtils.currentLine=66715655;
 //BA.debugLineNum = 66715655;BA.debugLine="PressedAnswerTagCode = pressedtag";
__ref._pressedanswertagcode /*String*/  = _pressedtag;
RDebugUtils.currentLine=66715658;
 //BA.debugLineNum = 66715658;BA.debugLine="Dim sf As Object = ApplActionDialog.ShowAsync(thi";
_sf = __ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_this.Title /*String*/ ,parent._sharecode._option_back /*String*/ ,"",parent._sharecode._option_makealert /*String*/ ,ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=66715661;
 //BA.debugLineNum = 66715661;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=66715668;
 //BA.debugLineNum = 66715668;BA.debugLine="ApplActionDialog.SetSize(100%x, 100%y)";
__ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=66715674;
 //BA.debugLineNum = 66715674;BA.debugLine="ApplActionDialog.GetButton(DialogResponse.negativ";
__ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.NEGATIVE).setVisible(parent.__c.False);
RDebugUtils.currentLine=66715675;
 //BA.debugLineNum = 66715675;BA.debugLine="ApplActionDialog.GetButton(DialogResponse.negativ";
__ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.NEGATIVE).setEnabled(parent.__c.False);
RDebugUtils.currentLine=66715676;
 //BA.debugLineNum = 66715676;BA.debugLine="ThisActivityName_TaskListDialog = activObj";
__ref._thisactivityname_tasklistdialog /*Object*/  = _activobj;
RDebugUtils.currentLine=66715677;
 //BA.debugLineNum = 66715677;BA.debugLine="CurrentCLD = ApplActionDialog";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=66715678;
 //BA.debugLineNum = 66715678;BA.debugLine="CurrentActivity = activ";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=66715679;
 //BA.debugLineNum = 66715679;BA.debugLine="CurrentCLAItem = this";
__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/  = _this;
RDebugUtils.currentLine=66715680;
 //BA.debugLineNum = 66715680;BA.debugLine="ObjectTagcode = innerObject";
__ref._objecttagcode /*String*/  = _innerobject;
RDebugUtils.currentLine=66715681;
 //BA.debugLineNum = 66715681;BA.debugLine="ActionCode = \"\"";
__ref._actioncode /*String*/  = "";
RDebugUtils.currentLine=66715683;
 //BA.debugLineNum = 66715683;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreactionsdialog"), _sf);
this.state = 339;
return;
case 339:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=66715684;
 //BA.debugLineNum = 66715684;BA.debugLine="pnl.LoadLayout(\"Dialog_MoreActions\")";
_pnl.LoadLayout("Dialog_MoreActions",ba);
RDebugUtils.currentLine=66715685;
 //BA.debugLineNum = 66715685;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
parent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._colortabpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject())));
RDebugUtils.currentLine=66715686;
 //BA.debugLineNum = 66715686;BA.debugLine="AssociateImagesCompleteList.Initialize";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=66715689;
 //BA.debugLineNum = 66715689;BA.debugLine="If (this.Origin = 7) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_this.Origin /*int*/ ==7)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=66715690;
 //BA.debugLineNum = 66715690;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Evidence_Aler";
__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("CLA_MORE_Evidence_Alerts",BA.ObjectToCharSequence("Detalhes"));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=66715692;
 //BA.debugLineNum = 66715692;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Evidence\", \"D";
__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("CLA_MORE_Evidence",BA.ObjectToCharSequence("Detalhes"));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=66715694;
 //BA.debugLineNum = 66715694;BA.debugLine="moreActionQuest.Text = this.Title";
__ref._moreactionquest /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_this.Title /*String*/ ));
RDebugUtils.currentLine=66715696;
 //BA.debugLineNum = 66715696;BA.debugLine="If Not(this.Origin = 7) Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=66715697;
 //BA.debugLineNum = 66715697;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=66715698;
 //BA.debugLineNum = 66715698;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Action\", \"Ac";
__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("CLA_MORE_Action",BA.ObjectToCharSequence("Acções"));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=66715700;
 //BA.debugLineNum = 66715700;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_Action\", \"Ac";
__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("CLA_MORE_Action",BA.ObjectToCharSequence("Acções subsequentes"));
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=66715702;
 //BA.debugLineNum = 66715702;BA.debugLine="moreActionQuest2.Text = this.Title";
__ref._moreactionquest2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_this.Title /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=66715704;
 //BA.debugLineNum = 66715704;BA.debugLine="If (Not(IsFastOptionCheck) And Not(this.Origin =";

case 16:
//if
this.state = 19;
if ((parent.__c.Not(__ref._isfastoptioncheck /*boolean*/ ) && parent.__c.Not(_this.Origin /*int*/ ==7))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=66715705;
 //BA.debugLineNum = 66715705;BA.debugLine="listsTabPanel.LoadLayout(\"CLA_MORE_History\", \"Hi";
__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .LoadLayout("CLA_MORE_History",BA.ObjectToCharSequence("Histórico"));
RDebugUtils.currentLine=66715706;
 //BA.debugLineNum = 66715706;BA.debugLine="moreActionQuest3.Text = this.Title";
__ref._moreactionquest3 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_this.Title /*String*/ ));
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=66715709;
 //BA.debugLineNum = 66715709;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(sendEmail";
parent._utils._setviewbackgroundcolortomaincolor /*String*/ (ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._sendemailimages /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getObject())));
RDebugUtils.currentLine=66715710;
 //BA.debugLineNum = 66715710;BA.debugLine="Dim CountImages As Int = 0";
_countimages = (int) (0);
RDebugUtils.currentLine=66715712;
 //BA.debugLineNum = 66715712;BA.debugLine="ItemTitle = this.Title";
__ref._itemtitle /*String*/  = _this.Title /*String*/ ;
RDebugUtils.currentLine=66715713;
 //BA.debugLineNum = 66715713;BA.debugLine="Dim First As Boolean = True";
_first = parent.__c.True;
RDebugUtils.currentLine=66715714;
 //BA.debugLineNum = 66715714;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
if (true) break;

case 20:
//for
this.state = 31;
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
group43 = parent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (ba,__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ );
index43 = 0;
groupLen43 = group43.getSize();
this.state = 340;
if (true) break;

case 340:
//C
this.state = 31;
if (index43 < groupLen43) {
this.state = 22;
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group43.Get(index43)));}
if (true) break;

case 341:
//C
this.state = 340;
index43++;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=66715715;
 //BA.debugLineNum = 66715715;BA.debugLine="If First Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_first) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=66715716;
 //BA.debugLineNum = 66715716;BA.debugLine="First = False";
_first = parent.__c.False;
RDebugUtils.currentLine=66715717;
 //BA.debugLineNum = 66715717;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(parent.__c.Colors.Black);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=66715719;
 //BA.debugLineNum = 66715719;BA.debugLine="lbl.Width = lbWidth";
_lbl.setWidth(_lbwidth);
RDebugUtils.currentLine=66715721;
 //BA.debugLineNum = 66715721;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=66715722;
 //BA.debugLineNum = 66715722;BA.debugLine="lbl.TextSize = 12.0";
_lbl.setTextSize((float) (12.0));
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
;
RDebugUtils.currentLine=66715726;
 //BA.debugLineNum = 66715726;BA.debugLine="obsOptions.Add(\"\")";
__ref._obsoptions /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("");
RDebugUtils.currentLine=66715727;
 //BA.debugLineNum = 66715727;BA.debugLine="If (Utils.NNE(tobs)) Then";
if (true) break;

case 32:
//if
this.state = 45;
if ((parent._utils._nne /*boolean*/ (ba,_tobs))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=66715728;
 //BA.debugLineNum = 66715728;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715729;
 //BA.debugLineNum = 66715729;BA.debugLine="Dim item As List = Regex.Split(\"\\,\", tobs )";
_item = new anywheresoftware.b4a.objects.collections.List();
_item = anywheresoftware.b4a.keywords.Common.ArrayToList(parent.__c.Regex.Split("\\,",_tobs));
RDebugUtils.currentLine=66715730;
 //BA.debugLineNum = 66715730;BA.debugLine="For n= 0 To item.Size-1";
if (true) break;

case 38:
//for
this.state = 41;
step57 = 1;
limit57 = (int) (_item.getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 40:
//C
this.state = 343;
RDebugUtils.currentLine=66715731;
 //BA.debugLineNum = 66715731;BA.debugLine="obsOptions.Add(item.Get(n))";
__ref._obsoptions /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.ObjectToString(_item.Get(_n)));
 if (true) break;
if (true) break;

case 41:
//C
this.state = 44;
;
 if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 0;
RDebugUtils.currentLine=66715734;
 //BA.debugLineNum = 66715734;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715734",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=66715738;
 //BA.debugLineNum = 66715738;BA.debugLine="obsOptions.DropdownBackgroundColor = Consts.Color";
__ref._obsoptions /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=66715739;
 //BA.debugLineNum = 66715739;BA.debugLine="obsOptions.DropdownTextColor = Consts.ColorDarkGr";
__ref._obsoptions /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownTextColor(parent._consts._colordarkgray /*int*/ );
RDebugUtils.currentLine=66715746;
 //BA.debugLineNum = 66715746;BA.debugLine="If Not(this.Origin = 7) Then";
if (true) break;

case 46:
//if
this.state = 61;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 48;
}else {
this.state = 60;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=66715748;
 //BA.debugLineNum = 66715748;BA.debugLine="Dim Status As Int = 0";
_status = (int) (0);
RDebugUtils.currentLine=66715749;
 //BA.debugLineNum = 66715749;BA.debugLine="Dim theTagcode As String = Utils.IfNullOrEmpty(P";
_thetagcode = parent._utils._ifnullorempty /*String*/ (ba,__ref._pressedanswertagcode /*String*/ ,_this.Tagcode /*String*/ .trim());
RDebugUtils.currentLine=66715750;
 //BA.debugLineNum = 66715750;BA.debugLine="Dim HaveTagcode As Boolean = (Utils.NNE(theTagco";
_havetagcode = (parent._utils._nne /*boolean*/ (ba,_thetagcode));
RDebugUtils.currentLine=66715751;
 //BA.debugLineNum = 66715751;BA.debugLine="If (HaveTagcode) Then";
if (true) break;

case 49:
//if
this.state = 54;
if ((_havetagcode)) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 54;
RDebugUtils.currentLine=66715755;
 //BA.debugLineNum = 66715755;BA.debugLine="Dim sSQL As String = $\"select ifnull(execute_st";
_ssql = ("select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,\n"+"				ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' and\n"+"				task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=66715763;
 //BA.debugLineNum = 66715763;BA.debugLine="Dim sSQL As String = $\"select ifnull(execute_st";
_ssql = ("select ifnull(execute_status,0) as status, ifnull(execute_action,'') as action, ifnull(execute_notes,'') as notes,\n"+"				ifnull(execute_value,'') as value from dta_requests_values where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' and\n"+"				task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=66715770;
 //BA.debugLineNum = 66715770;BA.debugLine="Private Record1 As Cursor = Starter.LocalSQLEVC.";
_record1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+parent.__c.SmartStringFormatter("",(Object)(_ssql))+""))));
RDebugUtils.currentLine=66715772;
 //BA.debugLineNum = 66715772;BA.debugLine="If Record1.RowCount > 0 Then";
if (true) break;

case 55:
//if
this.state = 58;
if (_record1.getRowCount()>0) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=66715773;
 //BA.debugLineNum = 66715773;BA.debugLine="Record1.Position = 0";
_record1.setPosition((int) (0));
RDebugUtils.currentLine=66715774;
 //BA.debugLineNum = 66715774;BA.debugLine="ItemNotes.Text = Record1.GetString(\"notes\")";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_record1.GetString("notes")));
RDebugUtils.currentLine=66715775;
 //BA.debugLineNum = 66715775;BA.debugLine="ItemNotes.Tag = this 'As RequestCLAItem";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=66715776;
 //BA.debugLineNum = 66715776;BA.debugLine="ActionCode = Record1.GetString(\"action\")";
__ref._actioncode /*String*/  = _record1.GetString("action");
 if (true) break;

case 58:
//C
this.state = 61;
;
RDebugUtils.currentLine=66715778;
 //BA.debugLineNum = 66715778;BA.debugLine="Record1.Close";
_record1.Close();
 if (true) break;

case 60:
//C
this.state = 61;
 if (true) break;
;
RDebugUtils.currentLine=66715793;
 //BA.debugLineNum = 66715793;BA.debugLine="If ItemNotes.Text <> \"\" And CurrentItemNotesText";

case 61:
//if
this.state = 64;
if ((__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("") == false && (__ref._currentitemnotestext /*String*/ ).equals("")) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=66715794;
 //BA.debugLineNum = 66715794;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
__ref._currentitemnotestext /*String*/  = __ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=66715797;
 //BA.debugLineNum = 66715797;BA.debugLine="associateObject.Enabled = False";
__ref._associateobject /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=66715798;
 //BA.debugLineNum = 66715798;BA.debugLine="associateObject.tag = this";
__ref._associateobject /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=66715800;
 //BA.debugLineNum = 66715800;BA.debugLine="If Not(this.Origin = 7) Then";
if (true) break;

case 65:
//if
this.state = 106;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=66715801;
 //BA.debugLineNum = 66715801;BA.debugLine="Dim Status As Int = 0";
_status = (int) (0);
RDebugUtils.currentLine=66715802;
 //BA.debugLineNum = 66715802;BA.debugLine="Dim sSQL As String = $\"select distinct a.id, ifn";
_ssql = ("select distinct a.id, ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 0 as base_image, 0 as on_report\n"+"		from dta_tasks_items as a \n"+"		inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode \n"+"				and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)\n"+"		where b.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"			and b.inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"' \n"+"			and b.task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"			and b.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"			and b.unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"			and b.repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"			and b.repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"			and b.repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=66715814;
 //BA.debugLineNum = 66715814;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEVC.";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=66715816;
 //BA.debugLineNum = 66715816;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 68:
//if
this.state = 105;
if (_record2.getRowCount()>0) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=66715817;
 //BA.debugLineNum = 66715817;BA.debugLine="CountImages = CountImages + 1";
_countimages = (int) (_countimages+1);
RDebugUtils.currentLine=66715819;
 //BA.debugLineNum = 66715819;BA.debugLine="Record2.Position = 0";
_record2.setPosition((int) (0));
RDebugUtils.currentLine=66715820;
 //BA.debugLineNum = 66715820;BA.debugLine="Dim image As String = Record2.GetString(\"imageb";
_image = _record2.GetString("imageb64");
RDebugUtils.currentLine=66715821;
 //BA.debugLineNum = 66715821;BA.debugLine="Dim filename As String = Record2.GetString(\"ima";
_filename = _record2.GetString("imagename");
RDebugUtils.currentLine=66715823;
 //BA.debugLineNum = 66715823;BA.debugLine="Dim ithis As RequestCLAItem = this";
_ithis = _this;
RDebugUtils.currentLine=66715824;
 //BA.debugLineNum = 66715824;BA.debugLine="ithis.OnReport = Record2.GetInt(\"on_report\")";
_ithis.OnReport /*int*/  = _record2.GetInt("on_report");
RDebugUtils.currentLine=66715825;
 //BA.debugLineNum = 66715825;BA.debugLine="ithis.BaseImage = Record2.GetInt(\"base_image\")";
_ithis.BaseImage /*int*/  = _record2.GetInt("base_image");
RDebugUtils.currentLine=66715828;
 //BA.debugLineNum = 66715828;BA.debugLine="If Utils.NNE(image) Then";
if (true) break;

case 71:
//if
this.state = 104;
if (parent._utils._nne /*boolean*/ (ba,_image)) { 
this.state = 73;
}else 
{RDebugUtils.currentLine=66715852;
 //BA.debugLineNum = 66715852;BA.debugLine="else if Utils.NNE(filename) Then";
if (parent._utils._nne /*boolean*/ (ba,_filename)) { 
this.state = 93;
}}
if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=66715829;
 //BA.debugLineNum = 66715829;BA.debugLine="Dim loaded As Boolean = True";
_loaded = parent.__c.True;
RDebugUtils.currentLine=66715830;
 //BA.debugLineNum = 66715830;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715831;
 //BA.debugLineNum = 66715831;BA.debugLine="ItemImages.Add(CreateImagePanel(ithis, filena";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_image,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=66715832;
 //BA.debugLineNum = 66715832;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 78:
//C
this.state = 79;
this.catchState = 0;
RDebugUtils.currentLine=66715834;
 //BA.debugLineNum = 66715834;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715834",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=66715835;
 //BA.debugLineNum = 66715835;BA.debugLine="loaded= False";
_loaded = parent.__c.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=66715838;
 //BA.debugLineNum = 66715838;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,$\"${";

case 79:
//if
this.state = 82;
this.catchState = 0;
if (parent.__c.Not(parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")))) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=66715839;
 //BA.debugLineNum = 66715839;BA.debugLine="Utils.SaveImageFromB64ToFile(image, $\"${filen";
parent._utils._saveimagefromb64tofile /*String*/ (ba,_image,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+""),parent._sharecode._device_def_img_filetype /*String*/ );
 if (true) break;
;
RDebugUtils.currentLine=66715841;
 //BA.debugLineNum = 66715841;BA.debugLine="If Not(loaded) Then";

case 82:
//if
this.state = 91;
if (parent.__c.Not(_loaded)) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=66715842;
 //BA.debugLineNum = 66715842;BA.debugLine="Dim btm As B4XBitmap = LoadBitmap(Starter.Int";
_btm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_btm = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(parent.__c.LoadBitmap(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")).getObject()));
RDebugUtils.currentLine=66715843;
 //BA.debugLineNum = 66715843;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715844;
 //BA.debugLineNum = 66715844;BA.debugLine="ItemImages.Add(CreateImagePanelBMP(ithis, fi";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanelbmp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_btm,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=66715845;
 //BA.debugLineNum = 66715845;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 89:
//C
this.state = 90;
this.catchState = 0;
RDebugUtils.currentLine=66715847;
 //BA.debugLineNum = 66715847;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715847",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=66715848;
 //BA.debugLineNum = 66715848;BA.debugLine="loaded= False";
_loaded = parent.__c.False;
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
RDebugUtils.currentLine=66715853;
 //BA.debugLineNum = 66715853;BA.debugLine="If (File.Exists(Starter.InternalFolder,$\"${fil";
if (true) break;

case 94:
//if
this.state = 103;
if ((parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=66715854;
 //BA.debugLineNum = 66715854;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715860;
 //BA.debugLineNum = 66715860;BA.debugLine="ItemImages.Add(CreateImagePanelBMP(ithis, fi";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanelbmp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_btm,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=66715861;
 //BA.debugLineNum = 66715861;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 101:
//C
this.state = 102;
this.catchState = 0;
RDebugUtils.currentLine=66715863;
 //BA.debugLineNum = 66715863;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715863",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=66715869;
 //BA.debugLineNum = 66715869;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;
;
RDebugUtils.currentLine=66715873;
 //BA.debugLineNum = 66715873;BA.debugLine="If Not(this.Origin = 7) Then";

case 106:
//if
this.state = 145;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 108;
}if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=66715874;
 //BA.debugLineNum = 66715874;BA.debugLine="If (Utils.NNE(innerObject)) Then";
if (true) break;

case 109:
//if
this.state = 144;
if ((parent._utils._nne /*boolean*/ (ba,_innerobject))) { 
this.state = 111;
}if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=66715875;
 //BA.debugLineNum = 66715875;BA.debugLine="Dim SQL As String = $\"Select a.id, ifnull(a.ima";
_sql = ("Select a.id, ifnull(a.image, '') as image, ifnull(a.filename, '') as filename from  dta_objects as a where a.tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_innerobject))+"'");
RDebugUtils.currentLine=66715876;
 //BA.debugLineNum = 66715876;BA.debugLine="Private Record33 As Cursor = Starter.LocalSQLEV";
_record33 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record33 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=66715877;
 //BA.debugLineNum = 66715877;BA.debugLine="If Record33.RowCount > 0 Then";
if (true) break;

case 112:
//if
this.state = 143;
if (_record33.getRowCount()>0) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
RDebugUtils.currentLine=66715878;
 //BA.debugLineNum = 66715878;BA.debugLine="Record33.Position = 0";
_record33.setPosition((int) (0));
RDebugUtils.currentLine=66715879;
 //BA.debugLineNum = 66715879;BA.debugLine="CountImages = CountImages + 1";
_countimages = (int) (_countimages+1);
RDebugUtils.currentLine=66715880;
 //BA.debugLineNum = 66715880;BA.debugLine="Dim image As String = Record33.GetString(\"imag";
_image = _record33.GetString("image");
RDebugUtils.currentLine=66715881;
 //BA.debugLineNum = 66715881;BA.debugLine="Dim ithis As RequestCLAItem = this";
_ithis = _this;
RDebugUtils.currentLine=66715883;
 //BA.debugLineNum = 66715883;BA.debugLine="Dim filename As String =  Record33.GetString(\"";
_filename = _record33.GetString("filename");
RDebugUtils.currentLine=66715884;
 //BA.debugLineNum = 66715884;BA.debugLine="Dim idd As Int = Record33.GetInt(\"id\")";
_idd = _record33.GetInt("id");
RDebugUtils.currentLine=66715886;
 //BA.debugLineNum = 66715886;BA.debugLine="If Utils.isNullOrEmpty(filename) Then";
if (true) break;

case 115:
//if
this.state = 118;
if (parent._utils._isnullorempty /*boolean*/ (ba,_filename)) { 
this.state = 117;
}if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=66715887;
 //BA.debugLineNum = 66715887;BA.debugLine="Dim filename As String =  $\"Base_${innerObjec";
_filename = ("Base_"+parent.__c.SmartStringFormatter("",(Object)(_innerobject))+".png");
 if (true) break;
;
RDebugUtils.currentLine=66715890;
 //BA.debugLineNum = 66715890;BA.debugLine="If Not(Utils.isNullOrEmpty(image)) Then";

case 118:
//if
this.state = 142;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_image))) { 
this.state = 120;
}else 
{RDebugUtils.currentLine=66715902;
 //BA.debugLineNum = 66715902;BA.debugLine="else if Not(Utils.isNullOrEmpty(filename)) The";
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_filename))) { 
this.state = 131;
}}
if (true) break;

case 120:
//C
this.state = 121;
RDebugUtils.currentLine=66715891;
 //BA.debugLineNum = 66715891;BA.debugLine="image = image.Replace(\"data:image/png;base64,";
_image = _image.replace("data:image/png;base64,","");
RDebugUtils.currentLine=66715892;
 //BA.debugLineNum = 66715892;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715893;
 //BA.debugLineNum = 66715893;BA.debugLine="ItemImages.Add(CreateImagePanel(ithis, filen";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_image,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=66715894;
 //BA.debugLineNum = 66715894;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 0;
RDebugUtils.currentLine=66715896;
 //BA.debugLineNum = 66715896;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715896",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=66715898;
 //BA.debugLineNum = 66715898;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,$\"$";

case 126:
//if
this.state = 129;
this.catchState = 0;
if (parent.__c.Not(parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")))) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
RDebugUtils.currentLine=66715899;
 //BA.debugLineNum = 66715899;BA.debugLine="Utils.SaveImageFromB64ToFile(image, $\"${file";
parent._utils._saveimagefromb64tofile /*String*/ (ba,_image,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+""),parent._sharecode._device_def_img_filetype /*String*/ );
RDebugUtils.currentLine=66715900;
 //BA.debugLineNum = 66715900;BA.debugLine="updateThisImageFile2DB(filename, idd)";
__ref._updatethisimagefile2db /*String*/ (null,_filename,_idd);
 if (true) break;

case 129:
//C
this.state = 142;
;
 if (true) break;

case 131:
//C
this.state = 132;
RDebugUtils.currentLine=66715903;
 //BA.debugLineNum = 66715903;BA.debugLine="If (File.Exists(Starter.InternalFolder,$\"${fi";
if (true) break;

case 132:
//if
this.state = 141;
if ((parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")))) { 
this.state = 134;
}if (true) break;

case 134:
//C
this.state = 135;
RDebugUtils.currentLine=66715904;
 //BA.debugLineNum = 66715904;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715905;
 //BA.debugLineNum = 66715905;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=66715906;
 //BA.debugLineNum = 66715906;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=66715907;
 //BA.debugLineNum = 66715907;BA.debugLine="Dim image As String = Base64Con.EncodeFromI";
_image = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,_filename);
RDebugUtils.currentLine=66715908;
 //BA.debugLineNum = 66715908;BA.debugLine="ItemImages.Add(CreateImagePanel(ithis, file";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_image,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=66715909;
 //BA.debugLineNum = 66715909;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 139:
//C
this.state = 140;
this.catchState = 0;
RDebugUtils.currentLine=66715911;
 //BA.debugLineNum = 66715911;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715911",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=66715917;
 //BA.debugLineNum = 66715917;BA.debugLine="Record33.Close";
_record33.Close();
 if (true) break;

case 144:
//C
this.state = 145;
;
 if (true) break;
;
RDebugUtils.currentLine=66715921;
 //BA.debugLineNum = 66715921;BA.debugLine="If Not(this.Origin = 7) Then";

case 145:
//if
this.state = 189;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 147;
}if (true) break;

case 147:
//C
this.state = 148;
RDebugUtils.currentLine=66715922;
 //BA.debugLineNum = 66715922;BA.debugLine="Dim Status As Int = 0";
_status = (int) (0);
RDebugUtils.currentLine=66715923;
 //BA.debugLineNum = 66715923;BA.debugLine="Dim sSQL As String = $\"select ifnull(imageb64,''";
_ssql = ("select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report, conf_sid_id,\n"+"		ifnull(execute_longitude, '') as execute_longitude, ifnull(execute_latitude, '') as execute_latitude, ifnull(execute_datetime, '') as execute_datetime\n"+"		from dta_requests_values_images where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and\n"+"		task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' \n"+"		and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"' \n"+"		and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"		and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"		and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=66715931;
 //BA.debugLineNum = 66715931;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEVC.";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=66715933;
 //BA.debugLineNum = 66715933;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 148:
//if
this.state = 188;
if (_record2.getRowCount()>0) { 
this.state = 150;
}if (true) break;

case 150:
//C
this.state = 151;
RDebugUtils.currentLine=66715934;
 //BA.debugLineNum = 66715934;BA.debugLine="For n=0 To Record2.RowCount-1";
if (true) break;

case 151:
//for
this.state = 187;
step185 = 1;
limit185 = (int) (_record2.getRowCount()-1);
_n = (int) (0) ;
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
if (true) break;

case 153:
//C
this.state = 154;
RDebugUtils.currentLine=66715935;
 //BA.debugLineNum = 66715935;BA.debugLine="Record2.Position = n";
_record2.setPosition(_n);
RDebugUtils.currentLine=66715936;
 //BA.debugLineNum = 66715936;BA.debugLine="Dim image As String = Record2.GetString(\"image";
_image = _record2.GetString("imageb64");
RDebugUtils.currentLine=66715937;
 //BA.debugLineNum = 66715937;BA.debugLine="Dim filename As String = Record2.GetString(\"im";
_filename = _record2.GetString("imagename");
RDebugUtils.currentLine=66715938;
 //BA.debugLineNum = 66715938;BA.debugLine="Dim conf_sid_id As Int = Record2.GetInt(\"conf_";
_conf_sid_id = _record2.GetInt("conf_sid_id");
RDebugUtils.currentLine=66715939;
 //BA.debugLineNum = 66715939;BA.debugLine="Dim imgInfo As String = $\"${Record2.GetString(";
_imginfo = (""+parent.__c.SmartStringFormatter("",(Object)(_record2.GetString("execute_datetime")))+" - "+parent.__c.SmartStringFormatter("",(Object)(_record2.GetString("execute_latitude")))+", "+parent.__c.SmartStringFormatter("",(Object)(_record2.GetString("execute_longitude")))+"");
RDebugUtils.currentLine=66715940;
 //BA.debugLineNum = 66715940;BA.debugLine="If Utils.isNullOrEmpty(filename) Then";
if (true) break;

case 154:
//if
this.state = 157;
if (parent._utils._isnullorempty /*boolean*/ (ba,_filename)) { 
this.state = 156;
}if (true) break;

case 156:
//C
this.state = 157;
RDebugUtils.currentLine=66715941;
 //BA.debugLineNum = 66715941;BA.debugLine="Dim filename As String =  $\"IMGNEW_${Utils.Ma";
_filename = ("IMGNEW_"+parent.__c.SmartStringFormatter("",(Object)(parent._utils._makefilename /*String*/ (ba)))+".png");
 if (true) break;

case 157:
//C
this.state = 158;
;
RDebugUtils.currentLine=66715944;
 //BA.debugLineNum = 66715944;BA.debugLine="Dim ithis As RequestCLAItem = this";
_ithis = _this;
RDebugUtils.currentLine=66715945;
 //BA.debugLineNum = 66715945;BA.debugLine="ithis.OnReport = Record2.GetInt(\"on_report\")";
_ithis.OnReport /*int*/  = _record2.GetInt("on_report");
RDebugUtils.currentLine=66715946;
 //BA.debugLineNum = 66715946;BA.debugLine="ithis.BaseImage = Record2.GetInt(\"base_image\")";
_ithis.BaseImage /*int*/  = _record2.GetInt("base_image");
RDebugUtils.currentLine=66715948;
 //BA.debugLineNum = 66715948;BA.debugLine="Dim ShowTheImage As Boolean = False";
_showtheimage = parent.__c.False;
RDebugUtils.currentLine=66715949;
 //BA.debugLineNum = 66715949;BA.debugLine="If Utils.NNE(image) Then";
if (true) break;

case 158:
//if
this.state = 171;
if (parent._utils._nne /*boolean*/ (ba,_image)) { 
this.state = 160;
}else 
{RDebugUtils.currentLine=66715955;
 //BA.debugLineNum = 66715955;BA.debugLine="else if Utils.NNE(filename) Then";
if (parent._utils._nne /*boolean*/ (ba,_filename)) { 
this.state = 166;
}}
if (true) break;

case 160:
//C
this.state = 161;
RDebugUtils.currentLine=66715950;
 //BA.debugLineNum = 66715950;BA.debugLine="image = image.Replace(\"data:image/png;base64,";
_image = _image.replace("data:image/png;base64,","");
RDebugUtils.currentLine=66715951;
 //BA.debugLineNum = 66715951;BA.debugLine="ShowTheImage = True";
_showtheimage = parent.__c.True;
RDebugUtils.currentLine=66715952;
 //BA.debugLineNum = 66715952;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,$\"$";
if (true) break;

case 161:
//if
this.state = 164;
if (parent.__c.Not(parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")))) { 
this.state = 163;
}if (true) break;

case 163:
//C
this.state = 164;
RDebugUtils.currentLine=66715953;
 //BA.debugLineNum = 66715953;BA.debugLine="Utils.SaveImageFromB64ToFile(image, $\"${file";
parent._utils._saveimagefromb64tofile /*String*/ (ba,_image,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+""),parent._sharecode._device_def_img_filetype /*String*/ );
 if (true) break;

case 164:
//C
this.state = 171;
;
 if (true) break;

case 166:
//C
this.state = 167;
RDebugUtils.currentLine=66715956;
 //BA.debugLineNum = 66715956;BA.debugLine="If (File.Exists(Starter.InternalFolder,$\"${fi";
if (true) break;

case 167:
//if
this.state = 170;
if ((parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")))) { 
this.state = 169;
}if (true) break;

case 169:
//C
this.state = 170;
RDebugUtils.currentLine=66715957;
 //BA.debugLineNum = 66715957;BA.debugLine="ShowTheImage = True";
_showtheimage = parent.__c.True;
 if (true) break;

case 170:
//C
this.state = 171;
;
 if (true) break;
;
RDebugUtils.currentLine=66715971;
 //BA.debugLineNum = 66715971;BA.debugLine="If ShowTheImage Then";

case 171:
//if
this.state = 186;
if (_showtheimage) { 
this.state = 173;
}if (true) break;

case 173:
//C
this.state = 174;
RDebugUtils.currentLine=66715972;
 //BA.debugLineNum = 66715972;BA.debugLine="Dim btm As B4XBitmap = LoadBitmap(Starter.Int";
_btm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_btm = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(parent.__c.LoadBitmap(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+"")).getObject()));
RDebugUtils.currentLine=66715973;
 //BA.debugLineNum = 66715973;BA.debugLine="If (conf_sid_id = 4) Then";
if (true) break;

case 174:
//if
this.state = 185;
if ((_conf_sid_id==4)) { 
this.state = 176;
}else {
this.state = 178;
}if (true) break;

case 176:
//C
this.state = 185;
RDebugUtils.currentLine=66715975;
 //BA.debugLineNum = 66715975;BA.debugLine="itemSignatures.Add(CreateSignaturePanelBMP(i";
__ref._itemsignatures /*b4a.example3.customlistview*/ ._add(__ref._createsignaturepanelbmp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_btm,(int) (0),_imginfo),(Object)(""));
 if (true) break;

case 178:
//C
this.state = 179;
RDebugUtils.currentLine=66715977;
 //BA.debugLineNum = 66715977;BA.debugLine="Try";
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
RDebugUtils.currentLine=66715979;
 //BA.debugLineNum = 66715979;BA.debugLine="ItemImages.Add(CreateImagePanelBMP(ithis, f";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanelbmp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_ithis,_filename,_btm,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=66715980;
 //BA.debugLineNum = 66715980;BA.debugLine="AssociateImagesCompleteList.Add(filename)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 183:
//C
this.state = 184;
this.catchState = 0;
RDebugUtils.currentLine=66715982;
 //BA.debugLineNum = 66715982;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("666715982",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
;
 if (true) break;

case 188:
//C
this.state = 189;
;
RDebugUtils.currentLine=66715988;
 //BA.debugLineNum = 66715988;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;
;
RDebugUtils.currentLine=66715995;
 //BA.debugLineNum = 66715995;BA.debugLine="If Not(this.Origin = 7) Then";

case 189:
//if
this.state = 266;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 191;
}if (true) break;

case 191:
//C
this.state = 192;
RDebugUtils.currentLine=66715996;
 //BA.debugLineNum = 66715996;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=66715997;
 //BA.debugLineNum = 66715997;BA.debugLine="Dim sSQL As String = $\"${DBStructures.EVC_SQL_GE";
_ssql = (""+parent.__c.SmartStringFormatter("",(Object)(parent._dbstructures._evc_sql_get_task_more_as /*String*/ ))+" and\n"+"			request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' and\n"+"			action_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"' and \n"+"			task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' and \n"+"			item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' and \n"+"			uniquekey='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' and \n"+"			iu_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'  \n"+"			and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"			and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+" \n"+"			and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"\n"+"			order by id desc limit 1");
RDebugUtils.currentLine=66716009;
 //BA.debugLineNum = 66716009;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery($\"${sSQL";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+parent.__c.SmartStringFormatter("",(Object)(_ssql))+""))));
RDebugUtils.currentLine=66716010;
 //BA.debugLineNum = 66716010;BA.debugLine="Log(\"$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$";
parent.__c.LogImpl("666716010","$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$",0);
RDebugUtils.currentLine=66716011;
 //BA.debugLineNum = 66716011;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("666716011",_ssql,0);
RDebugUtils.currentLine=66716012;
 //BA.debugLineNum = 66716012;BA.debugLine="editAS.Enabled = False";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=66716013;
 //BA.debugLineNum = 66716013;BA.debugLine="editAS.Visible = False";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=66716014;
 //BA.debugLineNum = 66716014;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 192:
//if
this.state = 211;
if (_record2.getRowCount()>0) { 
this.state = 194;
}else {
this.state = 210;
}if (true) break;

case 194:
//C
this.state = 195;
RDebugUtils.currentLine=66716015;
 //BA.debugLineNum = 66716015;BA.debugLine="For n=0 To Record2.RowCount-1";
if (true) break;

case 195:
//for
this.state = 208;
step235 = 1;
limit235 = (int) (_record2.getRowCount()-1);
_n = (int) (0) ;
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
if (true) break;

case 197:
//C
this.state = 198;
RDebugUtils.currentLine=66716016;
 //BA.debugLineNum = 66716016;BA.debugLine="Record2.Position = n";
_record2.setPosition(_n);
RDebugUtils.currentLine=66716017;
 //BA.debugLineNum = 66716017;BA.debugLine="If (n=0) Then";
if (true) break;

case 198:
//if
this.state = 207;
if ((_n==0)) { 
this.state = 200;
}if (true) break;

case 200:
//C
this.state = 201;
RDebugUtils.currentLine=66716018;
 //BA.debugLineNum = 66716018;BA.debugLine="asPanel.AddView(CreateASPanel(this, True, Rec";
__ref._aspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._createaspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,parent.__c.True,_record2).getObject()),(int) (0),parent.__c.DipToCurrent((int) (1)),parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=66716019;
 //BA.debugLineNum = 66716019;BA.debugLine="CurrentTagcode = Record2.GetString(\"tagcode\")";
__ref._currenttagcode /*String*/  = _record2.GetString("tagcode");
RDebugUtils.currentLine=66716020;
 //BA.debugLineNum = 66716020;BA.debugLine="CurrentASTagcode = CurrentTagcode";
__ref._currentastagcode /*String*/  = __ref._currenttagcode /*String*/ ;
RDebugUtils.currentLine=66716021;
 //BA.debugLineNum = 66716021;BA.debugLine="Dim email_sent As Int = Record2.GetInt(\"email";
_email_sent = _record2.GetInt("email_sent");
RDebugUtils.currentLine=66716022;
 //BA.debugLineNum = 66716022;BA.debugLine="If Utils.Int2Bool(email_sent) Then";
if (true) break;

case 201:
//if
this.state = 206;
if (parent._utils._int2bool /*boolean*/ (ba,_email_sent)) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
RDebugUtils.currentLine=66716023;
 //BA.debugLineNum = 66716023;BA.debugLine="editAS.Enabled = False";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=66716024;
 //BA.debugLineNum = 66716024;BA.debugLine="editAS.Visible = False";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 205:
//C
this.state = 206;
RDebugUtils.currentLine=66716026;
 //BA.debugLineNum = 66716026;BA.debugLine="editAS.Enabled = True";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=66716027;
 //BA.debugLineNum = 66716027;BA.debugLine="editAS.Visible = True";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=66716028;
 //BA.debugLineNum = 66716028;BA.debugLine="editAS.Tag = CurrentASTagcode";
__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(__ref._currentastagcode /*String*/ ));
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
RDebugUtils.currentLine=66716031;
 //BA.debugLineNum = 66716031;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=66716032;
 //BA.debugLineNum = 66716032;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=66716033;
 //BA.debugLineNum = 66716033;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=66716034;
 //BA.debugLineNum = 66716034;BA.debugLine="id.ExpandedHeight = 240dip";
_id.ExpandedHeight /*int*/  = parent.__c.DipToCurrent((int) (240));
RDebugUtils.currentLine=66716035;
 //BA.debugLineNum = 66716035;BA.debugLine="asHistoryList.Add( CreateASItemPanel(this, id,";
__ref._ashistorylist /*xevolution.vrcg.devdemov2400.expandedlistview*/ ._add /*String*/ (null,__ref._createasitempanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,_id,_record2,_n),(Object)(_id));
 if (true) break;
if (true) break;

case 208:
//C
this.state = 211;
;
RDebugUtils.currentLine=66716037;
 //BA.debugLineNum = 66716037;BA.debugLine="takeAS.Enabled = False";
__ref._takeas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=66716038;
 //BA.debugLineNum = 66716038;BA.debugLine="takeAS.Visible = False";
__ref._takeas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.False);
 if (true) break;

case 210:
//C
this.state = 211;
RDebugUtils.currentLine=66716041;
 //BA.debugLineNum = 66716041;BA.debugLine="asPanel.AddView(CreateASPanel(this, False, Reco";
__ref._aspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._createaspanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,parent.__c.False,_record2).getObject()),(int) (0),parent.__c.DipToCurrent((int) (1)),parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
 if (true) break;

case 211:
//C
this.state = 212;
;
RDebugUtils.currentLine=66716043;
 //BA.debugLineNum = 66716043;BA.debugLine="Record2.Close";
_record2.Close();
RDebugUtils.currentLine=66716045;
 //BA.debugLineNum = 66716045;BA.debugLine="listsTabPanel.ScrollTo(TabPos, True)";
__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ .ScrollTo(_tabpos,parent.__c.True);
RDebugUtils.currentLine=66716047;
 //BA.debugLineNum = 66716047;BA.debugLine="If (action >= 1) Then";
if (true) break;

case 212:
//if
this.state = 265;
if ((_action>=1)) { 
this.state = 214;
}if (true) break;

case 214:
//C
this.state = 215;
RDebugUtils.currentLine=66716048;
 //BA.debugLineNum = 66716048;BA.debugLine="If (action = 1) Then";
if (true) break;

case 215:
//if
this.state = 264;
if ((_action==1)) { 
this.state = 217;
}else 
{RDebugUtils.currentLine=66716050;
 //BA.debugLineNum = 66716050;BA.debugLine="Else If (action = 2) Then";
if ((_action==2)) { 
this.state = 219;
}else 
{RDebugUtils.currentLine=66716085;
 //BA.debugLineNum = 66716085;BA.debugLine="Else If (action = 3) Then";
if ((_action==3)) { 
this.state = 239;
}else 
{RDebugUtils.currentLine=66716105;
 //BA.debugLineNum = 66716105;BA.debugLine="Else If (action = 4) Then";
if ((_action==4)) { 
this.state = 263;
}}}}
if (true) break;

case 217:
//C
this.state = 264;
RDebugUtils.currentLine=66716049;
 //BA.debugLineNum = 66716049;BA.debugLine="takePhoto_Click";
__ref._takephoto_click /*void*/ (null);
 if (true) break;

case 219:
//C
this.state = 220;
RDebugUtils.currentLine=66716055;
 //BA.debugLineNum = 66716055;BA.debugLine="If (this.UniqueKey.Trim = \"b444a024-a05d-5187-";
if (true) break;

case 220:
//if
this.state = 237;
if (((_this.UniqueKey /*String*/ .trim()).equals("b444a024-a05d-5187-8f45-190a32728e6a")) || ((_this.UniqueKey /*String*/ .trim()).equals("802a6ecf-3786-5bf1-b85e-76a70cad6b0e"))) { 
this.state = 222;
}else {
this.state = 228;
}if (true) break;

case 222:
//C
this.state = 223;
RDebugUtils.currentLine=66716056;
 //BA.debugLineNum = 66716056;BA.debugLine="If ItemNotes.Text = \"\" Then";
if (true) break;

case 223:
//if
this.state = 226;
if ((__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 225;
}if (true) break;

case 225:
//C
this.state = 226;
RDebugUtils.currentLine=66716057;
 //BA.debugLineNum = 66716057;BA.debugLine="ItemNotes.Text = \"Lote: \"";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence("Lote: "));
 if (true) break;

case 226:
//C
this.state = 237;
;
 if (true) break;

case 228:
//C
this.state = 229;
RDebugUtils.currentLine=66716060;
 //BA.debugLineNum = 66716060;BA.debugLine="If ItemNotes.Text = \"\" Then";
if (true) break;

case 229:
//if
this.state = 236;
if ((__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 231;
}if (true) break;

case 231:
//C
this.state = 232;
RDebugUtils.currentLine=66716061;
 //BA.debugLineNum = 66716061;BA.debugLine="Dim scriptData As String = $\"select ifnull(a";
_scriptdata = ("select ifnull(a.do_origin_titlefield, '') as valor\n"+"						from dta_tasks_items_answers as a\n"+"						inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode\n"+"							and b.item_tagcode=a.item_tagcode\n"+"							and b.unique_key=a.unique_key\n"+"							and b.tagcode=a.tagcode)\n"+"						where 1=1\n"+"						and a.force_more=1 \n"+"						and b.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"						and b.task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"'\n"+"						and b.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"						and b.unique_key = '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"'\n"+"						and b.tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"						and b.repeatcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"						and b.repeatitemcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"						and b.repeatfieldcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=66716077;
 //BA.debugLineNum = 66716077;BA.debugLine="Dim textoObs As String = DBStructures.GetScr";
_textoobs = parent._dbstructures._getscriptcolumnstrevc /*String*/ (ba,_scriptdata,"valor");
RDebugUtils.currentLine=66716079;
 //BA.debugLineNum = 66716079;BA.debugLine="If Utils.NE(textoObs) Then";
if (true) break;

case 232:
//if
this.state = 235;
if (parent._utils._ne /*boolean*/ (ba,_textoobs)) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
RDebugUtils.currentLine=66716080;
 //BA.debugLineNum = 66716080;BA.debugLine="ItemNotes.Text = textoObs";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_textoobs));
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
RDebugUtils.currentLine=66716084;
 //BA.debugLineNum = 66716084;BA.debugLine="ItemNotes.RequestFocus";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 if (true) break;

case 239:
//C
this.state = 240;
RDebugUtils.currentLine=66716086;
 //BA.debugLineNum = 66716086;BA.debugLine="If Utils.NNE(CurrentASTagcode) Then";
if (true) break;

case 240:
//if
this.state = 261;
if (parent._utils._nne /*boolean*/ (ba,__ref._currentastagcode /*String*/ )) { 
this.state = 242;
}else {
this.state = 254;
}if (true) break;

case 242:
//C
this.state = 243;
RDebugUtils.currentLine=66716088;
 //BA.debugLineNum = 66716088;BA.debugLine="If (editAS.Enabled) Then";
if (true) break;

case 243:
//if
this.state = 252;
if ((__ref._editas /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getEnabled())) { 
this.state = 245;
}else {
this.state = 251;
}if (true) break;

case 245:
//C
this.state = 246;
RDebugUtils.currentLine=66716089;
 //BA.debugLineNum = 66716089;BA.debugLine="Msgbox2Async(ShareCode.GeneralAtentionTitle,";
parent.__c.Msgbox2Async(BA.ObjectToCharSequence(parent._sharecode._generalatentiontitle /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._asexistsedititquestion /*String*/ ),parent._sharecode._option_yes /*String*/ ,"",parent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent.__c.Null)),ba,parent.__c.False);
RDebugUtils.currentLine=66716090;
 //BA.debugLineNum = 66716090;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreactionsdialog"), null);
this.state = 348;
return;
case 348:
//C
this.state = 246;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=66716091;
 //BA.debugLineNum = 66716091;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 246:
//if
this.state = 249;
if (_result==parent.__c.DialogResponse.POSITIVE) { 
this.state = 248;
}if (true) break;

case 248:
//C
this.state = 249;
RDebugUtils.currentLine=66716092;
 //BA.debugLineNum = 66716092;BA.debugLine="editAS_Click";
__ref._editas_click /*String*/ (null);
 if (true) break;

case 249:
//C
this.state = 252;
;
 if (true) break;

case 251:
//C
this.state = 252;
RDebugUtils.currentLine=66716095;
 //BA.debugLineNum = 66716095;BA.debugLine="MsgboxAsync(ShareCode.GeneralAtentionTitle,";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence(parent._sharecode._generalatentiontitle /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._asexistsnoeditinformation /*String*/ ),ba);
 if (true) break;

case 252:
//C
this.state = 261;
;
 if (true) break;

case 254:
//C
this.state = 255;
RDebugUtils.currentLine=66716098;
 //BA.debugLineNum = 66716098;BA.debugLine="If Utils.NNE(tagcodeTPA) Then";
if (true) break;

case 255:
//if
this.state = 260;
if (parent._utils._nne /*boolean*/ (ba,_tagcodetpa)) { 
this.state = 257;
}else {
this.state = 259;
}if (true) break;

case 257:
//C
this.state = 260;
RDebugUtils.currentLine=66716099;
 //BA.debugLineNum = 66716099;BA.debugLine="takeASClick(tagcodeTPA, groupTPA, actionforc";
__ref._takeasclick /*void*/ (null,_tagcodetpa,_grouptpa,_actionforce);
 if (true) break;

case 259:
//C
this.state = 260;
RDebugUtils.currentLine=66716101;
 //BA.debugLineNum = 66716101;BA.debugLine="takeAS_Click";
__ref._takeas_click /*String*/ (null);
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
RDebugUtils.currentLine=66716108;
 //BA.debugLineNum = 66716108;BA.debugLine="takeSignature_Click";
__ref._takesignature_click /*String*/ (null);
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
RDebugUtils.currentLine=66716113;
 //BA.debugLineNum = 66716113;BA.debugLine="If ItemNotes.Text = \"\" Then";

case 266:
//if
this.state = 273;
if ((__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 268;
}if (true) break;

case 268:
//C
this.state = 269;
RDebugUtils.currentLine=66716114;
 //BA.debugLineNum = 66716114;BA.debugLine="Dim scriptData As String = $\"select ifnull(a.do_";
_scriptdata = ("select ifnull(a.do_origin_titlefield, '') as valor\n"+"						from dta_tasks_items_answers as a\n"+"						inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode\n"+"							and b.item_tagcode=a.item_tagcode\n"+"							and b.unique_key=a.unique_key\n"+"							and b.tagcode=a.tagcode)\n"+"						where 1=1\n"+"						and a.force_more=1 \n"+"						and b.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"						and b.task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"'\n"+"						and b.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"						and b.unique_key = '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"'\n"+"						and b.tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"						and b.repeatcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"						and b.repeatitemcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"						and b.repeatfieldcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=66716130;
 //BA.debugLineNum = 66716130;BA.debugLine="Dim textoObs As String = DBStructures.GetScriptC";
_textoobs = parent._dbstructures._getscriptcolumnstrevc /*String*/ (ba,_scriptdata,"valor");
RDebugUtils.currentLine=66716132;
 //BA.debugLineNum = 66716132;BA.debugLine="If Utils.NE(textoObs) Then";
if (true) break;

case 269:
//if
this.state = 272;
if (parent._utils._ne /*boolean*/ (ba,_textoobs)) { 
this.state = 271;
}if (true) break;

case 271:
//C
this.state = 272;
RDebugUtils.currentLine=66716133;
 //BA.debugLineNum = 66716133;BA.debugLine="ItemNotes.Text = textoObs";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_textoobs));
 if (true) break;

case 272:
//C
this.state = 273;
;
 if (true) break;
;
RDebugUtils.currentLine=66716137;
 //BA.debugLineNum = 66716137;BA.debugLine="If Not(this.Origin = 7) Then";

case 273:
//if
this.state = 284;
if (parent.__c.Not(_this.Origin /*int*/ ==7)) { 
this.state = 275;
}if (true) break;

case 275:
//C
this.state = 276;
RDebugUtils.currentLine=66716142;
 //BA.debugLineNum = 66716142;BA.debugLine="If ItemNotes.Text = \"\" Then";
if (true) break;

case 276:
//if
this.state = 283;
if ((__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()).equals("")) { 
this.state = 278;
}if (true) break;

case 278:
//C
this.state = 279;
RDebugUtils.currentLine=66716143;
 //BA.debugLineNum = 66716143;BA.debugLine="Dim scriptData As String = $\"select ifnull(a.do";
_scriptdata = ("select ifnull(a.do_origin_titlefield, '') as valor\n"+"					from dta_tasks_items_answers as a\n"+"					inner join dta_requests_values as b on (b.task_tagcode=a.task_tagcode\n"+"						and b.item_tagcode=a.item_tagcode\n"+"						and b.unique_key=a.unique_key\n"+"						and b.tagcode=a.tagcode)\n"+"					where 1=1\n"+"					and a.force_more=1 \n"+"					and b.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"					and b.task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"'\n"+"					and b.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"					and b.unique_key = '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"'\n"+"					and b.tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"					and b.repeatcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"					and b.repeatitemcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"					and b.repeatfieldcounter = "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=66716159;
 //BA.debugLineNum = 66716159;BA.debugLine="Dim textoObs As String = DBStructures.GetScript";
_textoobs = parent._dbstructures._getscriptcolumnstrevc /*String*/ (ba,_scriptdata,"valor");
RDebugUtils.currentLine=66716161;
 //BA.debugLineNum = 66716161;BA.debugLine="If Utils.NE(textoObs) Then";
if (true) break;

case 279:
//if
this.state = 282;
if (parent._utils._ne /*boolean*/ (ba,_textoobs)) { 
this.state = 281;
}if (true) break;

case 281:
//C
this.state = 282;
RDebugUtils.currentLine=66716162;
 //BA.debugLineNum = 66716162;BA.debugLine="ItemNotes.Text = textoObs";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_textoobs));
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
RDebugUtils.currentLine=66716165;
 //BA.debugLineNum = 66716165;BA.debugLine="ItemNotes.RequestFocus";
__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .RequestFocus();
 if (true) break;

case 284:
//C
this.state = 285;
;
RDebugUtils.currentLine=66716168;
 //BA.debugLineNum = 66716168;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=66716169;
 //BA.debugLineNum = 66716169;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreactionsdialog"), _sf);
this.state = 349;
return;
case 349:
//C
this.state = 285;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=66716172;
 //BA.debugLineNum = 66716172;BA.debugLine="If res = DialogResponse.POSITIVE Then ' BOTAO VOL";
if (true) break;

case 285:
//if
this.state = 338;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 287;
}else 
{RDebugUtils.currentLine=66716368;
 //BA.debugLineNum = 66716368;BA.debugLine="Else If res = DialogResponse.NEGATIVE Then";
if (_res==parent.__c.DialogResponse.NEGATIVE) { 
this.state = 337;
}}
if (true) break;

case 287:
//C
this.state = 288;
RDebugUtils.currentLine=66716173;
 //BA.debugLineNum = 66716173;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
__ref._currentitemnotestext /*String*/  = __ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=66716175;
 //BA.debugLineNum = 66716175;BA.debugLine="If (HaveTagcode) Then";
if (true) break;

case 288:
//if
this.state = 293;
if ((_havetagcode)) { 
this.state = 290;
}else {
this.state = 292;
}if (true) break;

case 290:
//C
this.state = 293;
RDebugUtils.currentLine=66716176;
 //BA.debugLineNum = 66716176;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"			where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"			and inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"' \n"+"			and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"			and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"			and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"			and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"			and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"			and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"			and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 292:
//C
this.state = 293;
RDebugUtils.currentLine=66716187;
 //BA.debugLineNum = 66716187;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"			where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' and inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"' \n"+"			and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"			and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"			and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"			and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"			and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"			and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 293:
//C
this.state = 294;
;
RDebugUtils.currentLine=66716200;
 //BA.debugLineNum = 66716200;BA.debugLine="Dim evento As String = \"\"";
_evento = "";
RDebugUtils.currentLine=66716201;
 //BA.debugLineNum = 66716201;BA.debugLine="Dim TipoEvento As String = \"\"";
_tipoevento = "";
RDebugUtils.currentLine=66716203;
 //BA.debugLineNum = 66716203;BA.debugLine="If (HaveTagcode) Then";
if (true) break;

case 294:
//if
this.state = 297;
if ((_havetagcode)) { 
this.state = 296;
}if (true) break;

case 296:
//C
this.state = 297;
RDebugUtils.currentLine=66716204;
 //BA.debugLineNum = 66716204;BA.debugLine="evento  = DBStructures.GetScriptColumnStrEVC($\"";
_evento = parent._dbstructures._getscriptcolumnstrevc /*String*/ (ba,("select ifnull(event_tagcode,'') as evento from dta_tasks_items_answers_events where\n"+"								task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"'\n"+"								 AND unique_key = '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"'\n"+"								 and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"								 AND item_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.TaskInfo /*xevolution.vrcg.devdemov2400.types._clataskitem*/ .item_tagcode /*String*/ ))+"'"),"evento");
 if (true) break;

case 297:
//C
this.state = 298;
;
RDebugUtils.currentLine=66716211;
 //BA.debugLineNum = 66716211;BA.debugLine="Log(evento)";
parent.__c.LogImpl("666716211",_evento,0);
RDebugUtils.currentLine=66716213;
 //BA.debugLineNum = 66716213;BA.debugLine="If evento = \"EVENTTASK_NOTESACTION\" Then";
if (true) break;

case 298:
//if
this.state = 315;
if ((_evento).equals("EVENTTASK_NOTESACTION")) { 
this.state = 300;
}if (true) break;

case 300:
//C
this.state = 301;
RDebugUtils.currentLine=66716226;
 //BA.debugLineNum = 66716226;BA.debugLine="TipoEvento  = DBStructures.GetScriptColumnStrEV";
_tipoevento = parent._dbstructures._getscriptcolumnstrevc /*String*/ (ba,("select ifnull(value,'') as tipoevento from dta_tasks_items_answers_events where\n"+"								task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"'\n"+"								 AND unique_key = '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"'\n"+"								 and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"								 AND item_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.TaskInfo /*xevolution.vrcg.devdemov2400.types._clataskitem*/ .item_tagcode /*String*/ ))+"'"),"tipoevento");
RDebugUtils.currentLine=66716231;
 //BA.debugLineNum = 66716231;BA.debugLine="If Utils.NNE(TipoEvento) Then";
if (true) break;

case 301:
//if
this.state = 304;
if (parent._utils._nne /*boolean*/ (ba,_tipoevento)) { 
this.state = 303;
}if (true) break;

case 303:
//C
this.state = 304;
RDebugUtils.currentLine=66716232;
 //BA.debugLineNum = 66716232;BA.debugLine="tagcodeTPA = TipoEvento";
_tagcodetpa = _tipoevento;
 if (true) break;

case 304:
//C
this.state = 305;
;
RDebugUtils.currentLine=66716236;
 //BA.debugLineNum = 66716236;BA.debugLine="Dim RecCount As Cursor";
_reccount = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=66716237;
 //BA.debugLineNum = 66716237;BA.debugLine="Dim SqlCheck As String = $\"SELECT * from dta_ac";
_sqlcheck = ("SELECT * from dta_actions where request_Tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"'\n"+"			and action_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"'\n"+"			and task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"'\n"+"			and item_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"'\n"+"			and uniquekey = '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"'");
RDebugUtils.currentLine=66716242;
 //BA.debugLineNum = 66716242;BA.debugLine="RecCount = Starter.LocalSQLEVC.ExecQuery($\"${Sq";
_reccount = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+parent.__c.SmartStringFormatter("",(Object)(_sqlcheck))+""))));
RDebugUtils.currentLine=66716243;
 //BA.debugLineNum = 66716243;BA.debugLine="If RecCount.RowCount = 0 Then";
if (true) break;

case 305:
//if
this.state = 314;
if (_reccount.getRowCount()==0) { 
this.state = 307;
}if (true) break;

case 307:
//C
this.state = 308;
RDebugUtils.currentLine=66716245;
 //BA.debugLineNum = 66716245;BA.debugLine="Dim asTagcode As String = Utils.GenerateTagcod";
_astagcode = parent._utils._generatetagcode /*String*/ (ba,"AS0");
RDebugUtils.currentLine=66716246;
 //BA.debugLineNum = 66716246;BA.debugLine="Dim dataoper As String = Utils.GetCurrDatetime";
_dataoper = parent._utils._getcurrdatetimeext /*String*/ (ba);
RDebugUtils.currentLine=66716248;
 //BA.debugLineNum = 66716248;BA.debugLine="asTagcode = DBStructures.InsertRequestASEVC(as";
_astagcode = parent._dbstructures._insertrequestasevc /*String*/ (ba,_astagcode,_this.Request /*String*/ ,_this.Action /*String*/ ,_this.Task /*String*/ ,_this.Item /*String*/ ,_this.UniqueKey /*String*/ ,_thetagcode,_this.Title /*String*/ ,__ref._currentitemnotestext /*String*/ ,"TPRIOT_01","TGRVT_02",parent._sharecode._sess_oper_user /*String*/ ,"TOPERT_01",_dataoper,BA.NumberToString(0),"","",_this.RepeatCounter /*int*/ ,_this.RepeatItemCounter /*int*/ ,_this.repeatfieldcounter /*int*/ ,_dataoper,_tagcodetpa,_grouptpa,__ref._currentitemnotestext /*String*/ ,(int) (0));
RDebugUtils.currentLine=66716253;
 //BA.debugLineNum = 66716253;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=66716254;
 //BA.debugLineNum = 66716254;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=66716255;
 //BA.debugLineNum = 66716255;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=66716256;
 //BA.debugLineNum = 66716256;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=66716257;
 //BA.debugLineNum = 66716257;BA.debugLine="params.Put(\"ACLRequest\", this.Request.Trim)";
_params.Put((Object)("ACLRequest"),(Object)(_this.Request /*String*/ .trim()));
RDebugUtils.currentLine=66716258;
 //BA.debugLineNum = 66716258;BA.debugLine="params.Put(\"ACLAction\", this.Action.Trim)";
_params.Put((Object)("ACLAction"),(Object)(_this.Action /*String*/ .trim()));
RDebugUtils.currentLine=66716259;
 //BA.debugLineNum = 66716259;BA.debugLine="params.Put(\"ACLTask\", this.Task.Trim)";
_params.Put((Object)("ACLTask"),(Object)(_this.Task /*String*/ .trim()));
RDebugUtils.currentLine=66716260;
 //BA.debugLineNum = 66716260;BA.debugLine="params.Put(\"ACLItem\", this.Item.Trim)";
_params.Put((Object)("ACLItem"),(Object)(_this.Item /*String*/ .trim()));
RDebugUtils.currentLine=66716261;
 //BA.debugLineNum = 66716261;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey.Trim";
_params.Put((Object)("ACLUniqueKey"),(Object)(_this.UniqueKey /*String*/ .trim()));
RDebugUtils.currentLine=66716262;
 //BA.debugLineNum = 66716262;BA.debugLine="params.Put(\"ACLTagcode\", theTagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(_thetagcode));
RDebugUtils.currentLine=66716263;
 //BA.debugLineNum = 66716263;BA.debugLine="params.Put(\"ACLATitle\", this.Title)";
_params.Put((Object)("ACLATitle"),(Object)(_this.Title /*String*/ ));
RDebugUtils.currentLine=66716264;
 //BA.debugLineNum = 66716264;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=66716265;
 //BA.debugLineNum = 66716265;BA.debugLine="params.Put(\"ACLAASNC\", asTagcode)";
_params.Put((Object)("ACLAASNC"),(Object)(_astagcode));
RDebugUtils.currentLine=66716266;
 //BA.debugLineNum = 66716266;BA.debugLine="params.Put(\"ACLAType\", tagcodeTPA)";
_params.Put((Object)("ACLAType"),(Object)(_tagcodetpa));
RDebugUtils.currentLine=66716267;
 //BA.debugLineNum = 66716267;BA.debugLine="params.Put(\"ACLADatetime\", dataoper)";
_params.Put((Object)("ACLADatetime"),(Object)(_dataoper));
RDebugUtils.currentLine=66716268;
 //BA.debugLineNum = 66716268;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_OPER_";
_params.Put((Object)("ACLSessUser"),(Object)(parent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=66716269;
 //BA.debugLineNum = 66716269;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=66716270;
 //BA.debugLineNum = 66716270;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=66716271;
 //BA.debugLineNum = 66716271;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfield";
_params.Put((Object)("ACLARepeatField"),(Object)(_this.repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=66716272;
 //BA.debugLineNum = 66716272;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=66716273;
 //BA.debugLineNum = 66716273;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=66716274;
 //BA.debugLineNum = 66716274;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=66716275;
 //BA.debugLineNum = 66716275;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=66716276;
 //BA.debugLineNum = 66716276;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=66716277;
 //BA.debugLineNum = 66716277;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=66716278;
 //BA.debugLineNum = 66716278;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=66716280;
 //BA.debugLineNum = 66716280;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/event/new/asnc");
RDebugUtils.currentLine=66716281;
 //BA.debugLineNum = 66716281;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 308:
//if
this.state = 313;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 310;
}else {
this.state = 312;
}if (true) break;

case 310:
//C
this.state = 313;
RDebugUtils.currentLine=66716282;
 //BA.debugLineNum = 66716282;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ .trim());
 if (true) break;

case 312:
//C
this.state = 313;
RDebugUtils.currentLine=66716284;
 //BA.debugLineNum = 66716284;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=66716285;
 //BA.debugLineNum = 66716285;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 313:
//C
this.state = 314;
;
RDebugUtils.currentLine=66716287;
 //BA.debugLineNum = 66716287;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreactionsdialog"),(int) (550));
this.state = 350;
return;
case 350:
//C
this.state = 314;
;
RDebugUtils.currentLine=66716288;
 //BA.debugLineNum = 66716288;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("666716288",_ssql,0);
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
RDebugUtils.currentLine=66716293;
 //BA.debugLineNum = 66716293;BA.debugLine="Utils.SaveSQLToLog(\"GetMoreActionsDialog\",sSQL,";
parent._utils._savesqltolog /*boolean*/ (ba,"GetMoreActionsDialog",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=66716296;
 //BA.debugLineNum = 66716296;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=66716297;
 //BA.debugLineNum = 66716297;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=66716298;
 //BA.debugLineNum = 66716298;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=66716299;
 //BA.debugLineNum = 66716299;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=66716300;
 //BA.debugLineNum = 66716300;BA.debugLine="params.Put(\"ACLRequest\", this.Request.Trim)";
_params.Put((Object)("ACLRequest"),(Object)(_this.Request /*String*/ .trim()));
RDebugUtils.currentLine=66716301;
 //BA.debugLineNum = 66716301;BA.debugLine="params.Put(\"ACLAction\", this.Action.Trim)";
_params.Put((Object)("ACLAction"),(Object)(_this.Action /*String*/ .trim()));
RDebugUtils.currentLine=66716302;
 //BA.debugLineNum = 66716302;BA.debugLine="params.Put(\"ACLTask\", this.Task.Trim)";
_params.Put((Object)("ACLTask"),(Object)(_this.Task /*String*/ .trim()));
RDebugUtils.currentLine=66716303;
 //BA.debugLineNum = 66716303;BA.debugLine="params.Put(\"ACLItem\", this.Item.Trim)";
_params.Put((Object)("ACLItem"),(Object)(_this.Item /*String*/ .trim()));
RDebugUtils.currentLine=66716304;
 //BA.debugLineNum = 66716304;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey.Trim)";
_params.Put((Object)("ACLUniqueKey"),(Object)(_this.UniqueKey /*String*/ .trim()));
RDebugUtils.currentLine=66716305;
 //BA.debugLineNum = 66716305;BA.debugLine="params.Put(\"ACLTagcode\", theTagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(_thetagcode));
RDebugUtils.currentLine=66716306;
 //BA.debugLineNum = 66716306;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=66716307;
 //BA.debugLineNum = 66716307;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=66716308;
 //BA.debugLineNum = 66716308;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=66716309;
 //BA.debugLineNum = 66716309;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
_params.Put((Object)("ACLARepeatField"),(Object)(_this.repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=66716310;
 //BA.debugLineNum = 66716310;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=66716311;
 //BA.debugLineNum = 66716311;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=66716312;
 //BA.debugLineNum = 66716312;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=66716313;
 //BA.debugLineNum = 66716313;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=66716314;
 //BA.debugLineNum = 66716314;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=66716315;
 //BA.debugLineNum = 66716315;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=66716316;
 //BA.debugLineNum = 66716316;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=66716318;
 //BA.debugLineNum = 66716318;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=66716319;
 //BA.debugLineNum = 66716319;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 316:
//if
this.state = 321;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 318;
}else {
this.state = 320;
}if (true) break;

case 318:
//C
this.state = 321;
RDebugUtils.currentLine=66716320;
 //BA.debugLineNum = 66716320;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ .trim());
 if (true) break;

case 320:
//C
this.state = 321;
RDebugUtils.currentLine=66716322;
 //BA.debugLineNum = 66716322;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=66716323;
 //BA.debugLineNum = 66716323;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 321:
//C
this.state = 322;
;
RDebugUtils.currentLine=66716325;
 //BA.debugLineNum = 66716325;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreactionsdialog"),(int) (550));
this.state = 351;
return;
case 351:
//C
this.state = 322;
;
RDebugUtils.currentLine=66716327;
 //BA.debugLineNum = 66716327;BA.debugLine="For n=0 To ItemImages.Size-1";
if (true) break;

case 322:
//for
this.state = 335;
step416 = 1;
limit416 = (int) (__ref._itemimages /*b4a.example3.customlistview*/ ._getsize()-1);
_n = (int) (0) ;
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
if (true) break;

case 324:
//C
this.state = 325;
RDebugUtils.currentLine=66716328;
 //BA.debugLineNum = 66716328;BA.debugLine="Dim pnl As Panel =ItemImages.GetPanel(n)";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._itemimages /*b4a.example3.customlistview*/ ._getpanel(_n).getObject()));
RDebugUtils.currentLine=66716329;
 //BA.debugLineNum = 66716329;BA.debugLine="Dim img As ImageView = pnl.GetView(0)";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
_img = (anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=66716330;
 //BA.debugLineNum = 66716330;BA.debugLine="Dim fln As Label = pnl.GetView(1)";
_fln = new anywheresoftware.b4a.objects.LabelWrapper();
_fln = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=66716331;
 //BA.debugLineNum = 66716331;BA.debugLine="Dim lbl As Label = pnl.GetView(2)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=66716332;
 //BA.debugLineNum = 66716332;BA.debugLine="If (lbl.Tag=1) Or (lbl.Tag=2) Then";
if (true) break;

case 325:
//if
this.state = 334;
if (((_lbl.getTag()).equals((Object)(1))) || ((_lbl.getTag()).equals((Object)(2)))) { 
this.state = 327;
}if (true) break;

case 327:
//C
this.state = 328;
RDebugUtils.currentLine=66716334;
 //BA.debugLineNum = 66716334;BA.debugLine="Utils.SaveImageviewToFile(img.Bitmap, $\"${fln.";
parent._utils._saveimageviewtofile /*String*/ (ba,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_img.getBitmap())),(""+parent.__c.SmartStringFormatter("",(Object)(_fln.getText()))+".png"),parent._sharecode._device_def_img_filetype /*String*/ );
RDebugUtils.currentLine=66716335;
 //BA.debugLineNum = 66716335;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=66716336;
 //BA.debugLineNum = 66716336;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=66716337;
 //BA.debugLineNum = 66716337;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_fln.getText()))+".png"));
RDebugUtils.currentLine=66716338;
 //BA.debugLineNum = 66716338;BA.debugLine="If (lbl.Tag=1) Then";
if (true) break;

case 328:
//if
this.state = 333;
if (((_lbl.getTag()).equals((Object)(1)))) { 
this.state = 330;
}else {
this.state = 332;
}if (true) break;

case 330:
//C
this.state = 333;
RDebugUtils.currentLine=66716340;
 //BA.debugLineNum = 66716340;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
_ssql = ("update dta_requests_values_images set imageb64='"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"'\n"+"							where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' and inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"' \n"+"							and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' and \n"+"							item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' and \n"+"							tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"' and imagename='"+parent.__c.SmartStringFormatter("",(Object)(_fln.getText().trim()))+"' \n"+"							and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"							and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"							and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 332:
//C
this.state = 333;
RDebugUtils.currentLine=66716349;
 //BA.debugLineNum = 66716349;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"";
_maxid = (int) (parent._dbstructures._getmaxofevc /*int*/ (ba,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=66716350;
 //BA.debugLineNum = 66716350;BA.debugLine="Dim sSQL As String = $\"insert into dta_reques";
_ssql = ("insert into dta_requests_values_images \n"+"							(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"+"							imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"							values ("+parent.__c.SmartStringFormatter("",(Object)(_maxid))+", '"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"',\n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_fln.getText().trim()))+"', 1, "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+")");
 if (true) break;

case 333:
//C
this.state = 334;
;
RDebugUtils.currentLine=66716357;
 //BA.debugLineNum = 66716357;BA.debugLine="Utils.SaveSQLToLog(\"GetMoreActionsDialog\",sSQL";
parent._utils._savesqltolog /*boolean*/ (ba,"GetMoreActionsDialog",_ssql,_this.Request /*String*/ );
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
;
RDebugUtils.currentLine=66716362;
 //BA.debugLineNum = 66716362;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreactionsdialog"),(int) (550));
this.state = 354;
return;
case 354:
//C
this.state = 338;
;
RDebugUtils.currentLine=66716363;
 //BA.debugLineNum = 66716363;BA.debugLine="CallSub(activObj, \"ReturnFromCLAI\")";
parent.__c.CallSubDebug(ba,_activobj,"ReturnFromCLAI");
RDebugUtils.currentLine=66716366;
 //BA.debugLineNum = 66716366;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,parent.__c.DialogResponse.POSITIVE);
 if (true) break;

case 337:
//C
this.state = 338;
RDebugUtils.currentLine=66716369;
 //BA.debugLineNum = 66716369;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
__ref._currentitemnotestext /*String*/  = __ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=66716370;
 //BA.debugLineNum = 66716370;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66716371;
 //BA.debugLineNum = 66716371;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=66716372;
 //BA.debugLineNum = 66716372;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=66716373;
 //BA.debugLineNum = 66716373;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=66716374;
 //BA.debugLineNum = 66716374;BA.debugLine="Filter.GetMoreSendEmailDialog(CurrentCLAItem, Cu";
_filter._getmoresendemaildialog /*void*/ (null,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,__ref._currenttagcode /*String*/ ,__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ,__ref._currentitemnotestext /*String*/ ,_lst);
 if (true) break;

case 338:
//C
this.state = -1;
;
RDebugUtils.currentLine=66716376;
 //BA.debugLineNum = 66716376;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _addmoreimagestoobject(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "addmoreimagestoobject", false))
	 {Debug.delegate(ba, "addmoreimagestoobject", new Object[] {_act,_this,_list}); return;}
ResumableSub_AddMoreImagesToObject rsub = new ResumableSub_AddMoreImagesToObject(this,__ref,_act,_this,_list);
rsub.resume(ba, null);
}
public static class ResumableSub_AddMoreImagesToObject extends BA.ResumableSub {
public ResumableSub_AddMoreImagesToObject(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.objects.collections.List _list) {
this.parent = parent;
this.__ref = __ref;
this._act = _act;
this._this = _this;
this._list = _list;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _act;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
anywheresoftware.b4a.objects.collections.List _list;
Object _sf = null;
int _photonums0 = 0;
int _photonums1 = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordrow = null;
String _tagcode = "";
String _ssqll = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
String _sql = "";
int _row = 0;
int _i = 0;
String _filename = "";
String _image = "";
String _cdate = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _nrows = 0;
String _imagename = "";
int _res = 0;
int step31;
int limit31;
int step61;
int limit61;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70975489;
 //BA.debugLineNum = 70975489;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Associar";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Associar Imagens","Adicionar",parent._sharecode._option_cancel /*String*/ ,"",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="CurrentActivity = act";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _act;
RDebugUtils.currentLine=70975491;
 //BA.debugLineNum = 70975491;BA.debugLine="AssociateImagesCompleteList = list";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/  = _list;
RDebugUtils.currentLine=70975492;
 //BA.debugLineNum = 70975492;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=70975493;
 //BA.debugLineNum = 70975493;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=70975494;
 //BA.debugLineNum = 70975494;BA.debugLine="ApplDialog.SetSize(100%x, 100%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=70975496;
 //BA.debugLineNum = 70975496;BA.debugLine="ApplDialog.SetSize(100%x, 100%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=70975499;
 //BA.debugLineNum = 70975499;BA.debugLine="Dim PhotoNums0 As Int = 0";
_photonums0 = (int) (0);
RDebugUtils.currentLine=70975500;
 //BA.debugLineNum = 70975500;BA.debugLine="Dim PhotoNums1 As Int = 1";
_photonums1 = (int) (1);
RDebugUtils.currentLine=70975502;
 //BA.debugLineNum = 70975502;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "addmoreimagestoobject"), _sf);
this.state = 75;
return;
case 75:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=70975503;
 //BA.debugLineNum = 70975503;BA.debugLine="pnl.LoadLayout(\"dialog_object_image\")";
_pnl.LoadLayout("dialog_object_image",ba);
RDebugUtils.currentLine=70975506;
 //BA.debugLineNum = 70975506;BA.debugLine="Dim RecordRow As Cursor";
_recordrow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=70975507;
 //BA.debugLineNum = 70975507;BA.debugLine="Dim tagcode As String = \"\"";
_tagcode = "";
RDebugUtils.currentLine=70975508;
 //BA.debugLineNum = 70975508;BA.debugLine="Dim sSQLL As String = $\"select object_tagcode fro";
_ssqll = ("select object_tagcode from dta_requests\n"+"				where tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"'");
RDebugUtils.currentLine=70975511;
 //BA.debugLineNum = 70975511;BA.debugLine="AvisoNoImages.Visible = False";
__ref._avisonoimages /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=70975513;
 //BA.debugLineNum = 70975513;BA.debugLine="RecordRow = Starter.LocalSQLEVC.ExecQuery(sSQLL)";
_recordrow = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssqll)));
RDebugUtils.currentLine=70975514;
 //BA.debugLineNum = 70975514;BA.debugLine="Log(sSQLL)";
parent.__c.LogImpl("670975514",_ssqll,0);
RDebugUtils.currentLine=70975515;
 //BA.debugLineNum = 70975515;BA.debugLine="If RecordRow.RowCount > 0 Then";
if (true) break;

case 7:
//if
this.state = 38;
if (_recordrow.getRowCount()>0) { 
this.state = 9;
}else {
this.state = 37;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=70975517;
 //BA.debugLineNum = 70975517;BA.debugLine="RecordRow.Position = 0";
_recordrow.setPosition((int) (0));
RDebugUtils.currentLine=70975518;
 //BA.debugLineNum = 70975518;BA.debugLine="tagcode = RecordRow.GetString(\"object_tagcode\")";
_tagcode = _recordrow.GetString("object_tagcode");
RDebugUtils.currentLine=70975520;
 //BA.debugLineNum = 70975520;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=70975522;
 //BA.debugLineNum = 70975522;BA.debugLine="Dim SQL As String = $\"select 1 as child, object_";
_sql = ("select 1 as child, object_tagcode as tagcode, image, filename, title, sess_user, created_at\n"+"								from dta_objects_images where object_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"' and (filename is not null and filename<>'')\n"+"								union\n"+"								select 0 as child, tagcode, image, filename, title_import as title, '' as sess_user, created_at\n"+"								from dta_objects where tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"' and (filename is not null and filename<>'')\n"+"								order by child");
RDebugUtils.currentLine=70975528;
 //BA.debugLineNum = 70975528;BA.debugLine="Log(SQL)";
parent.__c.LogImpl("670975528",_sql,0);
RDebugUtils.currentLine=70975529;
 //BA.debugLineNum = 70975529;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=70975530;
 //BA.debugLineNum = 70975530;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 10:
//if
this.state = 35;
if (_record2.getRowCount()>0) { 
this.state = 12;
}else {
this.state = 34;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=70975531;
 //BA.debugLineNum = 70975531;BA.debugLine="PhotoNums0 = Record2.RowCount";
_photonums0 = _record2.getRowCount();
RDebugUtils.currentLine=70975532;
 //BA.debugLineNum = 70975532;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFromObje";
__ref._objectsimages /*b4a.example3.customlistview*/ ._add(__ref._createassociateimagesfromobjectpaneltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,"Imagens do Objecto"),(Object)(""));
RDebugUtils.currentLine=70975533;
 //BA.debugLineNum = 70975533;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=70975534;
 //BA.debugLineNum = 70975534;BA.debugLine="For i=0 To Record2.RowCount-1";
if (true) break;

case 13:
//for
this.state = 32;
step31 = 1;
limit31 = (int) (_record2.getRowCount()-1);
_i = (int) (0) ;
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
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=70975535;
 //BA.debugLineNum = 70975535;BA.debugLine="Record2.Position = i";
_record2.setPosition(_i);
RDebugUtils.currentLine=70975537;
 //BA.debugLineNum = 70975537;BA.debugLine="Dim Filename As String = Utils.IfNullOrEmpty(R";
_filename = parent._utils._ifnullorempty /*String*/ (ba,_record2.GetString("filename"),"");
RDebugUtils.currentLine=70975538;
 //BA.debugLineNum = 70975538;BA.debugLine="If Utils.NNE(Filename) Then";
if (true) break;

case 16:
//if
this.state = 31;
if (parent._utils._nne /*boolean*/ (ba,_filename)) { 
this.state = 18;
}else {
this.state = 30;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=70975539;
 //BA.debugLineNum = 70975539;BA.debugLine="If File.Exists(Starter.InternalFolder, Filena";
if (true) break;

case 19:
//if
this.state = 28;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,_filename)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=70975540;
 //BA.debugLineNum = 70975540;BA.debugLine="Try";
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
RDebugUtils.currentLine=70975541;
 //BA.debugLineNum = 70975541;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=70975542;
 //BA.debugLineNum = 70975542;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=70975543;
 //BA.debugLineNum = 70975543;BA.debugLine="Dim image As String = Base64Con.EncodeFromI";
_image = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,_filename);
RDebugUtils.currentLine=70975544;
 //BA.debugLineNum = 70975544;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFrom";
__ref._objectsimages /*b4a.example3.customlistview*/ ._add(__ref._createassociateimagesfromobjectpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,_filename,_image,(int) (0),""),(Object)(""));
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=70975546;
 //BA.debugLineNum = 70975546;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("670975546",parent.__c.LastException(ba).getMessage(),0);
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
RDebugUtils.currentLine=70975554;
 //BA.debugLineNum = 70975554;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=70975556;
 //BA.debugLineNum = 70975556;BA.debugLine="PhotoNums0 = 0";
_photonums0 = (int) (0);
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=70975562;
 //BA.debugLineNum = 70975562;BA.debugLine="Dim cDate As String = Utils.GetLastWeekDate";
_cdate = parent._utils._getlastweekdate /*String*/ (ba);
RDebugUtils.currentLine=70975564;
 //BA.debugLineNum = 70975564;BA.debugLine="Dim SQL As String = $\"select distinct ifnull(a.ta";
_sql = ("select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,\n"+"			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,\n"+"			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,\n"+"			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename\n"+"			from dta_alerts as a\n"+"			where a.alert_visible=1 \n"+"				and a.user_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._sess_oper_user /*String*/ ))+"' \n"+"				and a.active=1 \n"+"				and a.date_alert>='"+parent.__c.SmartStringFormatter("",(Object)(_cdate))+"'");
RDebugUtils.currentLine=70975574;
 //BA.debugLineNum = 70975574;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=70975576;
 //BA.debugLineNum = 70975576;BA.debugLine="Dim nRows As Int = Record.RowCount";
_nrows = _record.getRowCount();
RDebugUtils.currentLine=70975577;
 //BA.debugLineNum = 70975577;BA.debugLine="PhotoNums1 = Record.RowCount";
_photonums1 = _record.getRowCount();
RDebugUtils.currentLine=70975578;
 //BA.debugLineNum = 70975578;BA.debugLine="If nRows > 0 Then";
if (true) break;

case 39:
//if
this.state = 64;
if (_nrows>0) { 
this.state = 41;
}else {
this.state = 63;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=70975579;
 //BA.debugLineNum = 70975579;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFromObjec";
__ref._objectsimages /*b4a.example3.customlistview*/ ._add(__ref._createassociateimagesfromobjectpaneltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,"Imagens das Tarefas"),(Object)(""));
RDebugUtils.currentLine=70975580;
 //BA.debugLineNum = 70975580;BA.debugLine="For row = 0 To Record.RowCount-1";
if (true) break;

case 42:
//for
this.state = 61;
step61 = 1;
limit61 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
this.state = 78;
if (true) break;

case 78:
//C
this.state = 61;
if ((step61 > 0 && _row <= limit61) || (step61 < 0 && _row >= limit61)) this.state = 44;
if (true) break;

case 79:
//C
this.state = 78;
_row = ((int)(0 + _row + step61)) ;
if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=70975581;
 //BA.debugLineNum = 70975581;BA.debugLine="Record.Position = row";
_record.setPosition(_row);
RDebugUtils.currentLine=70975582;
 //BA.debugLineNum = 70975582;BA.debugLine="Dim imagename As String =  Utils.IfNullOrEmpty(";
_imagename = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("imagename"),"");
RDebugUtils.currentLine=70975583;
 //BA.debugLineNum = 70975583;BA.debugLine="If Utils.NNE(imagename) Then";
if (true) break;

case 45:
//if
this.state = 60;
if (parent._utils._nne /*boolean*/ (ba,_imagename)) { 
this.state = 47;
}else {
this.state = 59;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=70975584;
 //BA.debugLineNum = 70975584;BA.debugLine="If File.Exists(Starter.InternalFolder, imagena";
if (true) break;

case 48:
//if
this.state = 57;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,_imagename)) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=70975585;
 //BA.debugLineNum = 70975585;BA.debugLine="Try";
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
RDebugUtils.currentLine=70975586;
 //BA.debugLineNum = 70975586;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=70975587;
 //BA.debugLineNum = 70975587;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=70975588;
 //BA.debugLineNum = 70975588;BA.debugLine="Dim image As String = Base64Con.EncodeFromIm";
_image = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,_imagename);
RDebugUtils.currentLine=70975589;
 //BA.debugLineNum = 70975589;BA.debugLine="ObjectsImages.Add(CreateAssociateImagesFromO";
__ref._objectsimages /*b4a.example3.customlistview*/ ._add(__ref._createassociateimagesfromobjectpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,_imagename,_image,(int) (0),""),(Object)(""));
 if (true) break;

case 55:
//C
this.state = 56;
this.catchState = 0;
RDebugUtils.currentLine=70975591;
 //BA.debugLineNum = 70975591;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("670975591",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
;
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=70975598;
 //BA.debugLineNum = 70975598;BA.debugLine="PhotoNums1 = 0";
_photonums1 = (int) (0);
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=70975600;
 //BA.debugLineNum = 70975600;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=70975602;
 //BA.debugLineNum = 70975602;BA.debugLine="If PhotoNums0 = 0 And PhotoNums1 = 0 Then";
if (true) break;

case 65:
//if
this.state = 68;
if (_photonums0==0 && _photonums1==0) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=70975603;
 //BA.debugLineNum = 70975603;BA.debugLine="AvisoNoImages.Text = \"Não existem imagens para a";
__ref._avisonoimages /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Não existem imagens para associar !"));
RDebugUtils.currentLine=70975604;
 //BA.debugLineNum = 70975604;BA.debugLine="AvisoNoImages.Visible = True";
__ref._avisonoimages /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=70975607;
 //BA.debugLineNum = 70975607;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "addmoreimagestoobject"), _sf);
this.state = 80;
return;
case 80:
//C
this.state = 69;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=70975608;
 //BA.debugLineNum = 70975608;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 69:
//if
this.state = 74;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 71;
}else 
{RDebugUtils.currentLine=70975610;
 //BA.debugLineNum = 70975610;BA.debugLine="Else If res = DialogResponse.CANCEL Then";
if (_res==parent.__c.DialogResponse.CANCEL) { 
this.state = 73;
}}
if (true) break;

case 71:
//C
this.state = 74;
RDebugUtils.currentLine=70975609;
 //BA.debugLineNum = 70975609;BA.debugLine="SaveImages(this)";
__ref._saveimages /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_this);
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=70975611;
 //BA.debugLineNum = 70975611;BA.debugLine="CallSub2(CheckList3, \"CamImage2\", this)";
parent.__c.CallSubDebug2(ba,(Object)(parent._checklist3.getObject()),"CamImage2",(Object)(_this));
 if (true) break;

case 74:
//C
this.state = -1;
;
RDebugUtils.currentLine=70975613;
 //BA.debugLineNum = 70975613;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createassociateimagesfromobjectpaneltitle(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createassociateimagesfromobjectpaneltitle", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createassociateimagesfromobjectpaneltitle", new Object[] {_this,_title}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=70909952;
 //BA.debugLineNum = 70909952;BA.debugLine="Sub CreateAssociateImagesFromObjectPanelTitle(this";
RDebugUtils.currentLine=70909953;
 //BA.debugLineNum = 70909953;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=70909954;
 //BA.debugLineNum = 70909954;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=70909959;
 //BA.debugLineNum = 70909959;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 75dip)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (75)));
RDebugUtils.currentLine=70909960;
 //BA.debugLineNum = 70909960;BA.debugLine="p.LoadLayout(\"object_image_title\")";
_p.LoadLayout("object_image_title",ba);
RDebugUtils.currentLine=70909961;
 //BA.debugLineNum = 70909961;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=70909962;
 //BA.debugLineNum = 70909962;BA.debugLine="lblObjectImageTitle.Text = title";
__ref._lblobjectimagetitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=70909979;
 //BA.debugLineNum = 70909979;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=70909980;
 //BA.debugLineNum = 70909980;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=70909981;
 //BA.debugLineNum = 70909981;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createassociateimagesfromobjectpanel(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _filename,String _btm,int _state,String _innertag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createassociateimagesfromobjectpanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createassociateimagesfromobjectpanel", new Object[] {_this,_filename,_btm,_state,_innertag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=70844416;
 //BA.debugLineNum = 70844416;BA.debugLine="Sub CreateAssociateImagesFromObjectPanel(this As R";
RDebugUtils.currentLine=70844417;
 //BA.debugLineNum = 70844417;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=70844418;
 //BA.debugLineNum = 70844418;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=70844423;
 //BA.debugLineNum = 70844423;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x,130dip)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=70844424;
 //BA.debugLineNum = 70844424;BA.debugLine="p.LoadLayout(\"object_image_item\")";
_p.LoadLayout("object_image_item",ba);
RDebugUtils.currentLine=70844425;
 //BA.debugLineNum = 70844425;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=70844427;
 //BA.debugLineNum = 70844427;BA.debugLine="If (Utils.NNE(btm)) Then";
if ((_utils._nne /*boolean*/ (ba,_btm))) { 
RDebugUtils.currentLine=70844428;
 //BA.debugLineNum = 70844428;BA.debugLine="ItemImageView.SetBackgroundImage(Utils.B64ToBitm";
__ref._itemimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_btm).getObject()));
RDebugUtils.currentLine=70844429;
 //BA.debugLineNum = 70844429;BA.debugLine="btnAssociateImage.Tag = filename";
__ref._btnassociateimage /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(_filename));
 };
RDebugUtils.currentLine=70844442;
 //BA.debugLineNum = 70844442;BA.debugLine="ItemImageView.Tag = this";
__ref._itemimageview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=70844447;
 //BA.debugLineNum = 70844447;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=70844448;
 //BA.debugLineNum = 70844448;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=70844449;
 //BA.debugLineNum = 70844449;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _saveimages(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "saveimages", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "saveimages", new Object[] {_this}));}
ResumableSub_SaveImages rsub = new ResumableSub_SaveImages(this,__ref,_this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SaveImages extends BA.ResumableSub {
public ResumableSub_SaveImages(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this) {
this.parent = parent;
this.__ref = __ref;
this._this = _this;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _obj = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.Map _params33 = null;
int _nfile = 0;
String _filename = "";
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _upl = null;
boolean _finish = false;
String _serverlocation = "";
int step7;
int limit7;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=71237634;
 //BA.debugLineNum = 71237634;BA.debugLine="CurrentCLAItem = this";
__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/  = _this;
RDebugUtils.currentLine=71237635;
 //BA.debugLineNum = 71237635;BA.debugLine="Dim obj As String = this.TagObject";
_obj = _this.TagObject /*String*/ ;
RDebugUtils.currentLine=71237636;
 //BA.debugLineNum = 71237636;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=71237637;
 //BA.debugLineNum = 71237637;BA.debugLine="Dim params33 As Map";
_params33 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=71237638;
 //BA.debugLineNum = 71237638;BA.debugLine="If (AssociateImagesList.Size >0) Then";
if (true) break;

case 1:
//if
this.state = 52;
if ((__ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=71237639;
 //BA.debugLineNum = 71237639;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._pg2msgprocessfotos /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=71237640;
 //BA.debugLineNum = 71237640;BA.debugLine="For nFile=0 To AssociateImagesList.Size-1";
if (true) break;

case 4:
//for
this.state = 51;
step7 = 1;
limit7 = (int) (__ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_nfile = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=71237641;
 //BA.debugLineNum = 71237641;BA.debugLine="Dim FileName As String = AssociateImagesList.Ge";
_filename = BA.ObjectToString(__ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_nfile));
RDebugUtils.currentLine=71237642;
 //BA.debugLineNum = 71237642;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_filename))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=71237646;
 //BA.debugLineNum = 71237646;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=71237647;
 //BA.debugLineNum = 71237647;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=71237648;
 //BA.debugLineNum = 71237648;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+""));
RDebugUtils.currentLine=71237651;
 //BA.debugLineNum = 71237651;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent._dbstructures._getmaxofevc /*int*/ (ba,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=71237652;
 //BA.debugLineNum = 71237652;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values_images\n"+"						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"+"						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, \n"+"						execute_datetime, execute_latitude, execute_longitude)\n"+"						values ("+parent.__c.SmartStringFormatter("",(Object)(_maxid))+", '"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"',\n"+"				'"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_filename))+"', 1, "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+",\n"+"				'',\n"+"				'',\n"+"				'')");
RDebugUtils.currentLine=71237662;
 //BA.debugLineNum = 71237662;BA.debugLine="Utils.SaveSQLToLog(\"SaveImages\",sSQL, this.Req";
parent._utils._savesqltolog /*boolean*/ (ba,"SaveImages",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=71237680;
 //BA.debugLineNum = 71237680;BA.debugLine="Private sACLADatetime As String = Utils.GetCur";
_sacladatetime = parent._utils._getcurrdatetime /*String*/ (ba);
RDebugUtils.currentLine=71237681;
 //BA.debugLineNum = 71237681;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=71237682;
 //BA.debugLineNum = 71237682;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=71237684;
 //BA.debugLineNum = 71237684;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=71237685;
 //BA.debugLineNum = 71237685;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=71237686;
 //BA.debugLineNum = 71237686;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=71237687;
 //BA.debugLineNum = 71237687;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=71237688;
 //BA.debugLineNum = 71237688;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=71237689;
 //BA.debugLineNum = 71237689;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=71237690;
 //BA.debugLineNum = 71237690;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=71237691;
 //BA.debugLineNum = 71237691;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=71237692;
 //BA.debugLineNum = 71237692;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=71237693;
 //BA.debugLineNum = 71237693;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=71237694;
 //BA.debugLineNum = 71237694;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
RDebugUtils.currentLine=71237695;
 //BA.debugLineNum = 71237695;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=71237696;
 //BA.debugLineNum = 71237696;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=71237697;
 //BA.debugLineNum = 71237697;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=71237698;
 //BA.debugLineNum = 71237698;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=71237699;
 //BA.debugLineNum = 71237699;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=71237700;
 //BA.debugLineNum = 71237700;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=71237701;
 //BA.debugLineNum = 71237701;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=71237702;
 //BA.debugLineNum = 71237702;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=71237703;
 //BA.debugLineNum = 71237703;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=71237704;
 //BA.debugLineNum = 71237704;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=71237705;
 //BA.debugLineNum = 71237705;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=71237706;
 //BA.debugLineNum = 71237706;BA.debugLine="Try";
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
RDebugUtils.currentLine=71237707;
 //BA.debugLineNum = 71237707;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=71237708;
 //BA.debugLineNum = 71237708;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=71237710;
 //BA.debugLineNum = 71237710;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=71237711;
 //BA.debugLineNum = 71237711;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=71237712;
 //BA.debugLineNum = 71237712;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("671237712",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 if (true) break;
;
RDebugUtils.currentLine=71237751;
 //BA.debugLineNum = 71237751;BA.debugLine="If (params.IsInitialized) Then";

case 16:
//if
this.state = 41;
if ((_params.IsInitialized())) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=71237752;
 //BA.debugLineNum = 71237752;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=71237753;
 //BA.debugLineNum = 71237753;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 19:
//if
this.state = 24;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=71237754;
 //BA.debugLineNum = 71237754;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=71237756;
 //BA.debugLineNum = 71237756;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=71237757;
 //BA.debugLineNum = 71237757;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=71237759;
 //BA.debugLineNum = 71237759;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "saveimages"),(int) (250));
this.state = 55;
return;
case 55:
//C
this.state = 25;
;
RDebugUtils.currentLine=71237762;
 //BA.debugLineNum = 71237762;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 25:
//if
this.state = 40;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 27;
}else {
this.state = 39;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=71237763;
 //BA.debugLineNum = 71237763;BA.debugLine="Try";
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
RDebugUtils.currentLine=71237764;
 //BA.debugLineNum = 71237764;BA.debugLine="Dim upl As ResumableSub = UploadFilesWithFTP";
_upl = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_upl = __ref._uploadfileswithftpcamimage /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename);
RDebugUtils.currentLine=71237765;
 //BA.debugLineNum = 71237765;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "saveimages"), _upl);
this.state = 56;
return;
case 56:
//C
this.state = 31;
_finish = (Boolean) result[1];
;
RDebugUtils.currentLine=71237766;
 //BA.debugLineNum = 71237766;BA.debugLine="If finish Then";
if (true) break;

case 31:
//if
this.state = 34;
if (_finish) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=71237767;
 //BA.debugLineNum = 71237767;BA.debugLine="Log(\"UploadFilesWithFTP finish \" & finish )";
parent.__c.LogImpl("671237767","UploadFilesWithFTP finish "+BA.ObjectToString(_finish),0);
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
RDebugUtils.currentLine=71237771;
 //BA.debugLineNum = 71237771;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("671237771",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=71237772;
 //BA.debugLineNum = 71237772;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCod";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=71237773;
 //BA.debugLineNum = 71237773;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=71237774;
 //BA.debugLineNum = 71237774;BA.debugLine="Utils.save2update(ServerLocation, FileName,";
parent._utils._save2update /*String*/ (ba,_serverlocation,_filename,(int) (1),_workernd);
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
RDebugUtils.currentLine=71237777;
 //BA.debugLineNum = 71237777;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=71237778;
 //BA.debugLineNum = 71237778;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=71237779;
 //BA.debugLineNum = 71237779;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1";
parent._utils._save2update /*String*/ (ba,_serverlocation,_filename,(int) (1),_workernd);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=71237781;
 //BA.debugLineNum = 71237781;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "saveimages"),(int) (250));
this.state = 57;
return;
case 57:
//C
this.state = 41;
;
 if (true) break;
;
RDebugUtils.currentLine=71237784;
 //BA.debugLineNum = 71237784;BA.debugLine="If (params33.IsInitialized) Then";

case 41:
//if
this.state = 50;
if ((_params33.IsInitialized())) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=71237786;
 //BA.debugLineNum = 71237786;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
parent.__c.LogImpl("671237786","3333333333333333333333333333333333333333333333",0);
RDebugUtils.currentLine=71237787;
 //BA.debugLineNum = 71237787;BA.debugLine="Log(Url)";
parent.__c.LogImpl("671237787",_url,0);
RDebugUtils.currentLine=71237788;
 //BA.debugLineNum = 71237788;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
parent.__c.LogImpl("671237788","3333333333333333333333333333333333333333333333",0);
RDebugUtils.currentLine=71237789;
 //BA.debugLineNum = 71237789;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more2/img/update");
RDebugUtils.currentLine=71237790;
 //BA.debugLineNum = 71237790;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 44:
//if
this.state = 49;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=71237791;
 //BA.debugLineNum = 71237791;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.";
parent._utils._callapi /*String*/ (ba,(int) (0),_params33,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=71237793;
 //BA.debugLineNum = 71237793;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=71237794;
 //BA.debugLineNum = 71237794;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params33),(int) (0),_workernd);
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=71237796;
 //BA.debugLineNum = 71237796;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "saveimages"),(int) (250));
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
;
RDebugUtils.currentLine=71237803;
 //BA.debugLineNum = 71237803;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 52:
//C
this.state = -1;
;
RDebugUtils.currentLine=71237806;
 //BA.debugLineNum = 71237806;BA.debugLine="CallSub2(CheckList3, \"CamImage2\", CurrentCLAItem)";
parent.__c.CallSubDebug2(ba,(Object)(parent._checklist3.getObject()),"CamImage2",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ));
RDebugUtils.currentLine=71237807;
 //BA.debugLineNum = 71237807;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=71237808;
 //BA.debugLineNum = 71237808;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _ashistorylist_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "ashistorylist_itemclick", false))
	 {return ((String) Debug.delegate(ba, "ashistorylist_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=67436544;
 //BA.debugLineNum = 67436544;BA.debugLine="Sub asHistoryList_ItemClick (Index As Int, Value A";
RDebugUtils.currentLine=67436545;
 //BA.debugLineNum = 67436545;BA.debugLine="CurrentIndex = Index";
__ref._currentindex /*int*/  = _index;
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="Log(\"Clicou\")";
__c.LogImpl("667436547","Clicou",0);
RDebugUtils.currentLine=67436548;
 //BA.debugLineNum = 67436548;BA.debugLine="End Sub";
return "";
}
public boolean  _associateimageselected(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _imagename) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "associateimageselected", false))
	 {return ((Boolean) Debug.delegate(ba, "associateimageselected", new Object[] {_imagename}));}
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Sub AssociateImageSelected(imageName As String) As";
RDebugUtils.currentLine=71172097;
 //BA.debugLineNum = 71172097;BA.debugLine="If AssociateImagesCompleteList.IndexOf(imageName)";
if (__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_imagename))>-1) { 
RDebugUtils.currentLine=71172098;
 //BA.debugLineNum = 71172098;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=71172100;
 //BA.debugLineNum = 71172100;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=71172101;
 //BA.debugLineNum = 71172101;BA.debugLine="End Sub";
return false;
}
public String  _associateobject_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "associateobject_click", false))
	 {return ((String) Debug.delegate(ba, "associateobject_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
int _local = 0;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Sub associateObject_Click";
RDebugUtils.currentLine=70713345;
 //BA.debugLineNum = 70713345;BA.debugLine="Dim btn As Button = Sender";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="Dim this As RequestCLAItem = btn.tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_btn.getTag());
RDebugUtils.currentLine=70713348;
 //BA.debugLineNum = 70713348;BA.debugLine="Dim Local As Int = 1 				'RETORNA AOS ALERTAS TAR";
_local = (int) (1);
RDebugUtils.currentLine=70713351;
 //BA.debugLineNum = 70713351;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=70713352;
 //BA.debugLineNum = 70713352;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=70713353;
 //BA.debugLineNum = 70713353;BA.debugLine="Filter.getObjectSelectDialog(CurrentActivity, Thi";
_filter._getobjectselectdialog /*void*/ (null,__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,__ref._thisactivityname_tasklistdialog /*Object*/ ,"Selecção de Objecto",_local);
RDebugUtils.currentLine=70713355;
 //BA.debugLineNum = 70713355;BA.debugLine="End Sub";
return "";
}
public String  _btnassociateimage_stateclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "btnassociateimage_stateclick", false))
	 {return ((String) Debug.delegate(ba, "btnassociateimage_stateclick", new Object[] {_state}));}
xevolution.vrcg.devdemov2400.b4xstatebutton _button = null;
String _imagename = "";
int _listviewindex = 0;
int _index = 0;
RDebugUtils.currentLine=71106560;
 //BA.debugLineNum = 71106560;BA.debugLine="Sub btnAssociateImage_StateClick (State As Int)";
RDebugUtils.currentLine=71106561;
 //BA.debugLineNum = 71106561;BA.debugLine="Dim Button As B4XStateButton = Sender";
_button = (xevolution.vrcg.devdemov2400.b4xstatebutton)(__c.Sender(ba));
RDebugUtils.currentLine=71106562;
 //BA.debugLineNum = 71106562;BA.debugLine="Dim imageName As String = Button.Tag";
_imagename = BA.ObjectToString(_button._gettag /*Object*/ (null));
RDebugUtils.currentLine=71106563;
 //BA.debugLineNum = 71106563;BA.debugLine="If State = Consts.ITEM_SELECTED Then";
if (_state==_consts._item_selected /*int*/ ) { 
RDebugUtils.currentLine=71106564;
 //BA.debugLineNum = 71106564;BA.debugLine="Dim listviewIndex As Int = AssociateImagesComple";
_listviewindex = __ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_imagename));
RDebugUtils.currentLine=71106565;
 //BA.debugLineNum = 71106565;BA.debugLine="If Not(listviewIndex > -1)  Then";
if (__c.Not(_listviewindex>-1)) { 
RDebugUtils.currentLine=71106566;
 //BA.debugLineNum = 71106566;BA.debugLine="AssociateImagesList.Add(imageName)";
__ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_imagename));
 }else {
RDebugUtils.currentLine=71106568;
 //BA.debugLineNum = 71106568;BA.debugLine="ToastMessageShow(\"Esta imagem já foi adicionada";
__c.ToastMessageShow(BA.ObjectToCharSequence("Esta imagem já foi adicionada á lista"),__c.True);
RDebugUtils.currentLine=71106569;
 //BA.debugLineNum = 71106569;BA.debugLine="Button.State = 0";
_button._setstate /*int*/ (null,(int) (0));
 };
 }else {
RDebugUtils.currentLine=71106572;
 //BA.debugLineNum = 71106572;BA.debugLine="Dim index As Int = AssociateImagesList.IndexOf(i";
_index = __ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_imagename));
RDebugUtils.currentLine=71106573;
 //BA.debugLineNum = 71106573;BA.debugLine="AssociateImagesList.RemoveAt(index)";
__ref._associateimageslist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_index);
 };
RDebugUtils.currentLine=71106575;
 //BA.debugLineNum = 71106575;BA.debugLine="End Sub";
return "";
}
public String  _btncancelsign_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "btncancelsign_click", false))
	 {return ((String) Debug.delegate(ba, "btncancelsign_click", null));}
RDebugUtils.currentLine=66977792;
 //BA.debugLineNum = 66977792;BA.debugLine="Sub btnCancelSign_Click";
RDebugUtils.currentLine=66977793;
 //BA.debugLineNum = 66977793;BA.debugLine="SignatureCapture.Clear(Signature)";
_signaturecapture._clear /*String*/ (ba,__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ );
RDebugUtils.currentLine=66977794;
 //BA.debugLineNum = 66977794;BA.debugLine="SignPanelView.Visible = False";
__ref._signpanelview /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=66977795;
 //BA.debugLineNum = 66977795;BA.debugLine="PanelSignature.Visible = False";
__ref._panelsignature /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=66977796;
 //BA.debugLineNum = 66977796;BA.debugLine="takeSignature.Visible = True";
__ref._takesignature /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=66977797;
 //BA.debugLineNum = 66977797;BA.debugLine="End Sub";
return "";
}
public String  _btnclearsign_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "btnclearsign_click", false))
	 {return ((String) Debug.delegate(ba, "btnclearsign_click", null));}
RDebugUtils.currentLine=68419584;
 //BA.debugLineNum = 68419584;BA.debugLine="Sub btnClearSign_Click";
RDebugUtils.currentLine=68419585;
 //BA.debugLineNum = 68419585;BA.debugLine="SignatureCapture.Clear(Signature)";
_signaturecapture._clear /*String*/ (ba,__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ );
RDebugUtils.currentLine=68419586;
 //BA.debugLineNum = 68419586;BA.debugLine="End Sub";
return "";
}
public void  _btnsavesign_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "btnsavesign_click", false))
	 {Debug.delegate(ba, "btnsavesign_click", null); return;}
ResumableSub_btnSaveSign_Click rsub = new ResumableSub_btnSaveSign_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSaveSign_Click extends BA.ResumableSub {
public ResumableSub_btnSaveSign_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _thisfile = "";
String _datetimename = "";
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _cvsrect = null;
String _la = "";
String _lo = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drect = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _serverlocation = "";
String _imginfo = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68288513;
 //BA.debugLineNum = 68288513;BA.debugLine="ProgressDialogShow(\"A processar ...\")";
parent.__c.ProgressDialogShow(ba,BA.ObjectToCharSequence("A processar ..."));
RDebugUtils.currentLine=68288514;
 //BA.debugLineNum = 68288514;BA.debugLine="Dim thisFile As String = $\"IMG_${CurrentRequestCL";
_thisfile = ("IMG_"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+""+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"_"+parent.__c.SmartStringFormatter("",(Object)(parent._utils._getcurrenttimeext2 /*String*/ (ba)))+"_Signature.png");
RDebugUtils.currentLine=68288515;
 //BA.debugLineNum = 68288515;BA.debugLine="SignatureCapture.Save(Signature, Starter.Internal";
parent._signaturecapture._save /*String*/ (ba,__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ ,parent._starter._internalfolder /*String*/ ,_thisfile);
RDebugUtils.currentLine=68288520;
 //BA.debugLineNum = 68288520;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
_datetimename = parent._utils._makedatetimeslash2 /*String*/ (ba);
RDebugUtils.currentLine=68288521;
 //BA.debugLineNum = 68288521;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(720dip, 520di";
_cvs = __ref._createcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ (null,parent.__c.DipToCurrent((int) (720)),parent.__c.DipToCurrent((int) (520)));
RDebugUtils.currentLine=68288522;
 //BA.debugLineNum = 68288522;BA.debugLine="Dim cvsRect As B4XRect";
_cvsrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=68288523;
 //BA.debugLineNum = 68288523;BA.debugLine="cvsRect.Initialize(0,0,720dip, 520dip)";
_cvsrect.Initialize((float) (0),(float) (0),(float) (parent.__c.DipToCurrent((int) (720))),(float) (parent.__c.DipToCurrent((int) (520))));
RDebugUtils.currentLine=68288524;
 //BA.debugLineNum = 68288524;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(Starter.InternalFol";
_cvs.DrawBitmap((android.graphics.Bitmap)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmap(parent._starter._internalfolder /*String*/ ,_thisfile).getObject()),_cvsrect);
RDebugUtils.currentLine=68288525;
 //BA.debugLineNum = 68288525;BA.debugLine="Dim la As String = LocationService.GeoLocal.lat";
_la = parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ;
RDebugUtils.currentLine=68288526;
 //BA.debugLineNum = 68288526;BA.debugLine="Dim lo As String = LocationService.GeoLocal.lon";
_lo = parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ;
RDebugUtils.currentLine=68288527;
 //BA.debugLineNum = 68288527;BA.debugLine="DateTimeName = $\"${DateTimeName}  -  ${la}/${lo}\"";
_datetimename = (""+parent.__c.SmartStringFormatter("",(Object)(_datetimename))+"  -  "+parent.__c.SmartStringFormatter("",(Object)(_la))+"/"+parent.__c.SmartStringFormatter("",(Object)(_lo))+"");
RDebugUtils.currentLine=68288529;
 //BA.debugLineNum = 68288529;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
_f = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (parent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=68288530;
 //BA.debugLineNum = 68288530;BA.debugLine="Dim dRect As B4XRect";
_drect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=68288531;
 //BA.debugLineNum = 68288531;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
_drect.Initialize((float) (_cvs.getTargetRect().getLeft()+parent.__c.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getHeight()-parent.__c.DipToCurrent((int) (18))),(float) (_cvs.getTargetRect().getLeft()+parent.__c.DipToCurrent((int) (350))),_cvs.getTargetRect().getHeight());
RDebugUtils.currentLine=68288532;
 //BA.debugLineNum = 68288532;BA.debugLine="Utils.DrawTextWithBorder2(cvs, DateTimeName, f, C";
parent._utils._drawtextwithborder2 /*String*/ (ba,_cvs,_datetimename,_f,parent._consts._colordarkgray /*int*/ ,(int) ((_drect.getLeft()+_drect.getRight())/(double)2),(int) ((_drect.getTop()+_drect.getBottom())/(double)2),(int) (1),(int) (0));
RDebugUtils.currentLine=68288534;
 //BA.debugLineNum = 68288534;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=68288535;
 //BA.debugLineNum = 68288535;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(Starter";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = parent.__c.File.OpenOutput(parent._starter._internalfolder /*String*/ ,_thisfile,parent.__c.False);
RDebugUtils.currentLine=68288536;
 //BA.debugLineNum = 68288536;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
_cvs.CreateBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),parent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,parent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=68288537;
 //BA.debugLineNum = 68288537;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=68288538;
 //BA.debugLineNum = 68288538;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=68288540;
 //BA.debugLineNum = 68288540;BA.debugLine="Private sACLADatetime As String = Utils.GetCurrDa";
_sacladatetime = parent._utils._getcurrdatetime /*String*/ (ba);
RDebugUtils.currentLine=68288541;
 //BA.debugLineNum = 68288541;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
_saclalatitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=68288542;
 //BA.debugLineNum = 68288542;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
_saclalongitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=68288544;
 //BA.debugLineNum = 68288544;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=68288545;
 //BA.debugLineNum = 68288545;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=68288546;
 //BA.debugLineNum = 68288546;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage(";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,_thisfile);
RDebugUtils.currentLine=68288547;
 //BA.debugLineNum = 68288547;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta_";
_maxid = (int) (parent._dbstructures._getmaxofevc /*int*/ (ba,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=68288548;
 //BA.debugLineNum = 68288548;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_v";
_ssql = ("insert into dta_requests_values_images\n"+"					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"+"					imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, conf_sid_id, execute_datetime, execute_latitude, execute_longitude)\n"+"					values ("+parent.__c.SmartStringFormatter("",(Object)(_maxid))+", '"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"', \n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ))+"', \n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ))+"', \n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ))+"', \n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ))+"', \n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ))+"',\n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_thisfile))+"', 1,\n"+"					"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+", \n"+"					"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+",\n"+"					"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+", 4,\n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(_sacladatetime))+"',\n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(_saclalatitude))+"',\n"+"					'"+parent.__c.SmartStringFormatter("",(Object)(_saclalongitude))+"' )");
RDebugUtils.currentLine=68288566;
 //BA.debugLineNum = 68288566;BA.debugLine="Utils.SaveSQLToLog(\"NewSignature\",sSQL, CurrentCL";
parent._utils._savesqltolog /*boolean*/ (ba,"NewSignature",_ssql,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
RDebugUtils.currentLine=68288568;
 //BA.debugLineNum = 68288568;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68288569;
 //BA.debugLineNum = 68288569;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=68288570;
 //BA.debugLineNum = 68288570;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=68288571;
 //BA.debugLineNum = 68288571;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=68288572;
 //BA.debugLineNum = 68288572;BA.debugLine="params.Put(\"ACLARequest\", CurrentRequestCLAItem.R";
_params.Put((Object)("ACLARequest"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ ));
RDebugUtils.currentLine=68288573;
 //BA.debugLineNum = 68288573;BA.debugLine="params.Put(\"ACLAAction\", CurrentRequestCLAItem.Ac";
_params.Put((Object)("ACLAAction"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ));
RDebugUtils.currentLine=68288574;
 //BA.debugLineNum = 68288574;BA.debugLine="params.Put(\"ACLATask\", CurrentRequestCLAItem.Task";
_params.Put((Object)("ACLATask"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ));
RDebugUtils.currentLine=68288575;
 //BA.debugLineNum = 68288575;BA.debugLine="params.Put(\"ACLAItem\", CurrentRequestCLAItem.Item";
_params.Put((Object)("ACLAItem"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ));
RDebugUtils.currentLine=68288576;
 //BA.debugLineNum = 68288576;BA.debugLine="params.Put(\"ACLAUniqueKey\", CurrentRequestCLAItem";
_params.Put((Object)("ACLAUniqueKey"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ));
RDebugUtils.currentLine=68288577;
 //BA.debugLineNum = 68288577;BA.debugLine="params.Put(\"ACLATagcode\", CurrentRequestCLAItem.T";
_params.Put((Object)("ACLATagcode"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ));
RDebugUtils.currentLine=68288580;
 //BA.debugLineNum = 68288580;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=68288581;
 //BA.debugLineNum = 68288581;BA.debugLine="params.Put(\"ACLAValueFileImage\", thisFile)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_thisfile));
RDebugUtils.currentLine=68288582;
 //BA.debugLineNum = 68288582;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=68288583;
 //BA.debugLineNum = 68288583;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentRequestCLAIte";
_params.Put((Object)("ACLAReqCounter"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ));
RDebugUtils.currentLine=68288584;
 //BA.debugLineNum = 68288584;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentRequestCLAIte";
_params.Put((Object)("ACLARepeatItem"),(Object)(__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=68288585;
 //BA.debugLineNum = 68288585;BA.debugLine="params.Put(\"ACLAConfSidId\", 4)";
_params.Put((Object)("ACLAConfSidId"),(Object)(4));
RDebugUtils.currentLine=68288587;
 //BA.debugLineNum = 68288587;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=68288588;
 //BA.debugLineNum = 68288588;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=68288589;
 //BA.debugLineNum = 68288589;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=68288590;
 //BA.debugLineNum = 68288590;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=68288591;
 //BA.debugLineNum = 68288591;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=68288592;
 //BA.debugLineNum = 68288592;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=68288593;
 //BA.debugLineNum = 68288593;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=68288594;
 //BA.debugLineNum = 68288594;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=68288595;
 //BA.debugLineNum = 68288595;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=68288596;
 //BA.debugLineNum = 68288596;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=68288598;
 //BA.debugLineNum = 68288598;BA.debugLine="If (params.IsInitialized) Then";
if (true) break;

case 1:
//if
this.state = 22;
if ((_params.IsInitialized())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=68288599;
 //BA.debugLineNum = 68288599;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=68288600;
 //BA.debugLineNum = 68288600;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=68288601;
 //BA.debugLineNum = 68288601;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentRe";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=68288603;
 //BA.debugLineNum = 68288603;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=68288604;
 //BA.debugLineNum = 68288604;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=68288606;
 //BA.debugLineNum = 68288606;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "btnsavesign_click"),(int) (250));
this.state = 23;
return;
case 23:
//C
this.state = 10;
;
RDebugUtils.currentLine=68288608;
 //BA.debugLineNum = 68288608;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=68288609;
 //BA.debugLineNum = 68288609;BA.debugLine="Try";
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
RDebugUtils.currentLine=68288610;
 //BA.debugLineNum = 68288610;BA.debugLine="UploadFilesWithFTP(thisFile)";
__ref._uploadfileswithftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_thisfile);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=68288612;
 //BA.debugLineNum = 68288612;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("668288612",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=68288613;
 //BA.debugLineNum = 68288613;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=68288614;
 //BA.debugLineNum = 68288614;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=68288615;
 //BA.debugLineNum = 68288615;BA.debugLine="Utils.save2update(ServerLocation, thisFile, 1,";
parent._utils._save2update /*String*/ (ba,_serverlocation,_thisfile,(int) (1),_workernd);
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
RDebugUtils.currentLine=68288618;
 //BA.debugLineNum = 68288618;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.A";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=68288619;
 //BA.debugLineNum = 68288619;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=68288620;
 //BA.debugLineNum = 68288620;BA.debugLine="Utils.save2update(ServerLocation, thisFile, 1,";
parent._utils._save2update /*String*/ (ba,_serverlocation,_thisfile,(int) (1),_workernd);
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=68288622;
 //BA.debugLineNum = 68288622;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "btnsavesign_click"),(int) (250));
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
RDebugUtils.currentLine=68288625;
 //BA.debugLineNum = 68288625;BA.debugLine="SignPanelView.Visible = False";
__ref._signpanelview /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=68288626;
 //BA.debugLineNum = 68288626;BA.debugLine="PanelSignature.Visible = False";
__ref._panelsignature /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=68288627;
 //BA.debugLineNum = 68288627;BA.debugLine="takeSignature.Visible = True";
__ref._takesignature /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=68288628;
 //BA.debugLineNum = 68288628;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
RDebugUtils.currentLine=68288630;
 //BA.debugLineNum = 68288630;BA.debugLine="Dim imgInfo As String = $\"${sACLADatetime} - ${sA";
_imginfo = (""+parent.__c.SmartStringFormatter("",(Object)(_sacladatetime))+" - "+parent.__c.SmartStringFormatter("",(Object)(_saclalatitude))+", "+parent.__c.SmartStringFormatter("",(Object)(_saclalongitude))+"");
RDebugUtils.currentLine=68288631;
 //BA.debugLineNum = 68288631;BA.debugLine="itemSignatures.Add(CreateSignaturePanel(CurrentRe";
__ref._itemsignatures /*b4a.example3.customlistview*/ ._add(__ref._createsignaturepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._currentrequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,_thisfile,_imgb64,(int) (0),_imginfo),(Object)(""));
RDebugUtils.currentLine=68288632;
 //BA.debugLineNum = 68288632;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XCanvas  _createcanvas(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createcanvas", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(ba, "createcanvas", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
RDebugUtils.currentLine=68354048;
 //BA.debugLineNum = 68354048;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
RDebugUtils.currentLine=68354049;
 //BA.debugLineNum = 68354049;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=68354050;
 //BA.debugLineNum = 68354050;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=68354051;
 //BA.debugLineNum = 68354051;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=68354052;
 //BA.debugLineNum = 68354052;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=68354053;
 //BA.debugLineNum = 68354053;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=68354054;
 //BA.debugLineNum = 68354054;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadfileswithftp(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "uploadfileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "uploadfileswithftp", new Object[] {_filename}));}
ResumableSub_UploadFilesWithFTP rsub = new ResumableSub_UploadFilesWithFTP(this,__ref,_filename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTP(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename) {
this.parent = parent;
this.__ref = __ref;
this._filename = _filename;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _filename;
boolean _ret = false;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69271553;
 //BA.debugLineNum = 69271553;BA.debugLine="Dim ret As Boolean = False";
_ret = parent.__c.False;
RDebugUtils.currentLine=69271554;
 //BA.debugLineNum = 69271554;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=69271555;
 //BA.debugLineNum = 69271555;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(ba,"ftp",(""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_ftp_user /*String*/ ))+"@"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=69271556;
 //BA.debugLineNum = 69271556;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(parent.__c.True);
RDebugUtils.currentLine=69271560;
 //BA.debugLineNum = 69271560;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=69271561;
 //BA.debugLineNum = 69271561;BA.debugLine="Log(filename)";
parent.__c.LogImpl("669271561",_filename,0);
RDebugUtils.currentLine=69271562;
 //BA.debugLineNum = 69271562;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
_sf = _myftp.UploadFile(ba,parent._starter._internalfolder /*String*/ ,_filename,parent.__c.False,"/"+parent._sharecode._app_domain /*String*/ +"/docs/"+_filename);
RDebugUtils.currentLine=69271563;
 //BA.debugLineNum = 69271563;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
parent.__c.WaitFor("ftp_uploadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "uploadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (Boolean) result[2];
;
RDebugUtils.currentLine=69271564;
 //BA.debugLineNum = 69271564;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=69271565;
 //BA.debugLineNum = 69271565;BA.debugLine="Log(\"file was uploaded successfully\")";
parent.__c.LogImpl("669271565","file was uploaded successfully",0);
RDebugUtils.currentLine=69271566;
 //BA.debugLineNum = 69271566;BA.debugLine="ret = True";
_ret = parent.__c.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=69271568;
 //BA.debugLineNum = 69271568;BA.debugLine="Log(\"Error uploading file\")";
parent.__c.LogImpl("669271568","Error uploading file",0);
RDebugUtils.currentLine=69271569;
 //BA.debugLineNum = 69271569;BA.debugLine="ret = False";
_ret = parent.__c.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=69271571;
 //BA.debugLineNum = 69271571;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=69271572;
 //BA.debugLineNum = 69271572;BA.debugLine="Return ret";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ret));return;};
RDebugUtils.currentLine=69271573;
 //BA.debugLineNum = 69271573;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createsignaturepanel(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _filename,String _btm,int _state,String _innertag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createsignaturepanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createsignaturepanel", new Object[] {_this,_filename,_btm,_state,_innertag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _width = 0;
RDebugUtils.currentLine=67960832;
 //BA.debugLineNum = 67960832;BA.debugLine="Sub CreateSignaturePanel(this As RequestCLAItem, f";
RDebugUtils.currentLine=67960833;
 //BA.debugLineNum = 67960833;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67960834;
 //BA.debugLineNum = 67960834;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67960835;
 //BA.debugLineNum = 67960835;BA.debugLine="Dim width As Int = 260dip";
_width = __c.DipToCurrent((int) (260));
RDebugUtils.currentLine=67960836;
 //BA.debugLineNum = 67960836;BA.debugLine="If (ShareCode.DEVICE_ORIENTATION = 1) Then";
if ((_sharecode._device_orientation /*int*/ ==1)) { 
RDebugUtils.currentLine=67960837;
 //BA.debugLineNum = 67960837;BA.debugLine="width = 200dip";
_width = __c.DipToCurrent((int) (200));
 };
RDebugUtils.currentLine=67960839;
 //BA.debugLineNum = 67960839;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=67960840;
 //BA.debugLineNum = 67960840;BA.debugLine="p.LoadLayout(\"CLA_MORE_Signature\")";
_p.LoadLayout("CLA_MORE_Signature",ba);
RDebugUtils.currentLine=67960841;
 //BA.debugLineNum = 67960841;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=67960843;
 //BA.debugLineNum = 67960843;BA.debugLine="If (Utils.NNE(btm)) Then";
if ((_utils._nne /*boolean*/ (ba,_btm))) { 
RDebugUtils.currentLine=67960844;
 //BA.debugLineNum = 67960844;BA.debugLine="InnerSignatureView.SetBackgroundImage(Utils.B64T";
__ref._innersignatureview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_btm).getObject()));
 };
RDebugUtils.currentLine=67960846;
 //BA.debugLineNum = 67960846;BA.debugLine="InnerSignatureName.Text = filename";
__ref._innersignaturename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_filename));
RDebugUtils.currentLine=67960847;
 //BA.debugLineNum = 67960847;BA.debugLine="InnerSignatureInfo.Text = innerTag";
__ref._innersignatureinfo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_innertag));
RDebugUtils.currentLine=67960849;
 //BA.debugLineNum = 67960849;BA.debugLine="If (this.OnReport = 1) Then";
if ((_this.OnReport /*int*/ ==1)) { 
RDebugUtils.currentLine=67960850;
 //BA.debugLineNum = 67960850;BA.debugLine="InnerSignatureOnReport.TextColor = Consts.ColorG";
__ref._innersignatureonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=67960852;
 //BA.debugLineNum = 67960852;BA.debugLine="InnerSignatureView.Tag = this";
__ref._innersignatureview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=67960853;
 //BA.debugLineNum = 67960853;BA.debugLine="InnerSignatureOnReport.Tag = this";
__ref._innersignatureonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=67960854;
 //BA.debugLineNum = 67960854;BA.debugLine="InnerSignatureRemove.Tag = this";
__ref._innersignatureremove /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=67960855;
 //BA.debugLineNum = 67960855;BA.debugLine="InnerSignatureInfo.Tag = this";
__ref._innersignatureinfo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=67960857;
 //BA.debugLineNum = 67960857;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=67960858;
 //BA.debugLineNum = 67960858;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=67960859;
 //BA.debugLineNum = 67960859;BA.debugLine="End Sub  'CreateSignaturePanel";
return null;
}
public String  _butasduedate_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "butasduedate_click", false))
	 {return ((String) Debug.delegate(ba, "butasduedate_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Sub butASDueDate_Click";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
__c.DateTime.setDateFormat(_consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = __c.DateTime.getNow();
RDebugUtils.currentLine=69861380;
 //BA.debugLineNum = 69861380;BA.debugLine="If (dlgASDueDate.Text  <> \"\") Then";
if (((__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()).equals("") == false)) { 
RDebugUtils.currentLine=69861381;
 //BA.debugLineNum = 69861381;BA.debugLine="dnow = DateTime.DateParse(dlgASDueDate.text)";
_dnow = __c.DateTime.DateParse(__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText());
 };
RDebugUtils.currentLine=69861383;
 //BA.debugLineNum = 69861383;BA.debugLine="dd.Initialize(\"CalendarGetStartDate\", DateTime.Ge";
_dd.Initialize(ba,"CalendarGetStartDate",__c.DateTime.GetYear(_dnow),(int) (__c.DateTime.GetMonth(_dnow)-1),__c.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=69861384;
 //BA.debugLineNum = 69861384;BA.debugLine="dd.show(\"dlgASDueDate\")";
_dd.show("dlgASDueDate");
RDebugUtils.currentLine=69861385;
 //BA.debugLineNum = 69861385;BA.debugLine="End Sub";
return "";
}
public String  _butgroupexpand_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "butgroupexpand_click", false))
	 {return ((String) Debug.delegate(ba, "butgroupexpand_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _this = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=67764224;
 //BA.debugLineNum = 67764224;BA.debugLine="Sub butGroupExpand_Click";
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="Dim this As B4XView = Sender";
_this = new anywheresoftware.b4a.objects.B4XViewWrapper();
_this = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=67764226;
 //BA.debugLineNum = 67764226;BA.debugLine="If (CurrentIndex <> this.Tag) Then CurrentIndex =";
if ((__ref._currentindex /*int*/ !=(double)(BA.ObjectToNumber(_this.getTag())))) { 
__ref._currentindex /*int*/  = (int)(BA.ObjectToNumber(_this.getTag()));};
RDebugUtils.currentLine=67764227;
 //BA.debugLineNum = 67764227;BA.debugLine="Dim p As B4XView = asHistoryList.GetPanel(Current";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._ashistorylist /*xevolution.vrcg.devdemov2400.expandedlistview*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._currentindex /*int*/ );
RDebugUtils.currentLine=67764228;
 //BA.debugLineNum = 67764228;BA.debugLine="If p.Tag = True Then";
if ((_p.getTag()).equals((Object)(__c.True))) { 
RDebugUtils.currentLine=67764229;
 //BA.debugLineNum = 67764229;BA.debugLine="asHistoryList.CollapseItem(CurrentIndex)";
__ref._ashistorylist /*xevolution.vrcg.devdemov2400.expandedlistview*/ ._collapseitem /*String*/ (null,__ref._currentindex /*int*/ );
 }else {
RDebugUtils.currentLine=67764231;
 //BA.debugLineNum = 67764231;BA.debugLine="asHistoryList.ExpandItem(CurrentIndex)";
__ref._ashistorylist /*xevolution.vrcg.devdemov2400.expandedlistview*/ ._expanditem /*String*/ (null,__ref._currentindex /*int*/ );
 };
RDebugUtils.currentLine=67764234;
 //BA.debugLineNum = 67764234;BA.debugLine="End Sub";
return "";
}
public String  _butgroupexpanditem_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "butgroupexpanditem_click", false))
	 {return ((String) Debug.delegate(ba, "butgroupexpanditem_click", null));}
RDebugUtils.currentLine=67698688;
 //BA.debugLineNum = 67698688;BA.debugLine="Sub butGroupExpandItem_Click";
RDebugUtils.currentLine=67698690;
 //BA.debugLineNum = 67698690;BA.debugLine="End Sub";
return "";
}
public String  _calendargetstartdate_ondateset(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "calendargetstartdate_ondateset", false))
	 {return ((String) Debug.delegate(ba, "calendargetstartdate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=69926916;
 //BA.debugLineNum = 69926916;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=69926917;
 //BA.debugLineNum = 69926917;BA.debugLine="dlgASDueDate.Text = $\"${year}-${moy}-${dom}\"$";
__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)((""+__c.SmartStringFormatter("",(Object)(_year))+"-"+__c.SmartStringFormatter("",(Object)(_moy))+"-"+__c.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=69926918;
 //BA.debugLineNum = 69926918;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimagepanel(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _filename,String _btm,int _state,String _innertag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createimagepanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimagepanel", new Object[] {_this,_filename,_btm,_state,_innertag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=67829760;
 //BA.debugLineNum = 67829760;BA.debugLine="Sub CreateImagePanel(this As RequestCLAItem, filen";
RDebugUtils.currentLine=67829761;
 //BA.debugLineNum = 67829761;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67829762;
 //BA.debugLineNum = 67829762;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67829763;
 //BA.debugLineNum = 67829763;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=67829764;
 //BA.debugLineNum = 67829764;BA.debugLine="p.LoadLayout(\"CLA_MORE_IMGAGE_Listview\")";
_p.LoadLayout("CLA_MORE_IMGAGE_Listview",ba);
RDebugUtils.currentLine=67829765;
 //BA.debugLineNum = 67829765;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=67829767;
 //BA.debugLineNum = 67829767;BA.debugLine="If (Utils.NNE(btm)) Then";
if ((_utils._nne /*boolean*/ (ba,_btm))) { 
RDebugUtils.currentLine=67829768;
 //BA.debugLineNum = 67829768;BA.debugLine="ShowImage.SetBackgroundImage(Utils.B64ToBitmap(b";
__ref._showimage /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (ba,_btm).getObject()));
RDebugUtils.currentLine=67829769;
 //BA.debugLineNum = 67829769;BA.debugLine="ShowImage.Tag = innerTag";
__ref._showimage /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTag((Object)(_innertag));
 };
RDebugUtils.currentLine=67829773;
 //BA.debugLineNum = 67829773;BA.debugLine="ImageFilename.Text = filename";
__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_filename));
RDebugUtils.currentLine=67829774;
 //BA.debugLineNum = 67829774;BA.debugLine="ImageFilename.Tag = innerTag";
__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_innertag));
RDebugUtils.currentLine=67829775;
 //BA.debugLineNum = 67829775;BA.debugLine="ImageStateName.Text = \"\"";
__ref._imagestatename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=67829776;
 //BA.debugLineNum = 67829776;BA.debugLine="ImageStateName.Tag = state";
__ref._imagestatename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_state));
RDebugUtils.currentLine=67829777;
 //BA.debugLineNum = 67829777;BA.debugLine="imageSelected.Tag = 0";
__ref._imageselected /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(0));
RDebugUtils.currentLine=67829778;
 //BA.debugLineNum = 67829778;BA.debugLine="imageSelected.TextColor = Consts.ColorLightSilver";
__ref._imageselected /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=67829779;
 //BA.debugLineNum = 67829779;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorLig";
__ref._imageselectedonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=67829780;
 //BA.debugLineNum = 67829780;BA.debugLine="imageSelectedOnReport.Tag = this";
__ref._imageselectedonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=67829781;
 //BA.debugLineNum = 67829781;BA.debugLine="If (this.OnReport = 1) Then";
if ((_this.OnReport /*int*/ ==1)) { 
RDebugUtils.currentLine=67829782;
 //BA.debugLineNum = 67829782;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorGr";
__ref._imageselectedonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=67829790;
 //BA.debugLineNum = 67829790;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=67829791;
 //BA.debugLineNum = 67829791;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=67829792;
 //BA.debugLineNum = 67829792;BA.debugLine="End Sub";
return null;
}
public String  _camerareturnnothing(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "camerareturnnothing", false))
	 {return ((String) Debug.delegate(ba, "camerareturnnothing", null));}
RDebugUtils.currentLine=69009408;
 //BA.debugLineNum = 69009408;BA.debugLine="Sub CameraReturnNothing";
RDebugUtils.currentLine=69009410;
 //BA.debugLineNum = 69009410;BA.debugLine="End Sub";
return "";
}
public void  _camerareturnshots(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.collections.List _filelist,xevolution.vrcg.devdemov2400.types._requestclaitem _this) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "camerareturnshots", false))
	 {Debug.delegate(ba, "camerareturnshots", new Object[] {_filelist,_this}); return;}
ResumableSub_CameraReturnShots rsub = new ResumableSub_CameraReturnShots(this,__ref,_filelist,_this);
rsub.resume(ba, null);
}
public static class ResumableSub_CameraReturnShots extends BA.ResumableSub {
public ResumableSub_CameraReturnShots(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.collections.List _filelist,xevolution.vrcg.devdemov2400.types._requestclaitem _this) {
this.parent = parent;
this.__ref = __ref;
this._filelist = _filelist;
this._this = _this;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.collections.List _filelist;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _obj = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.Map _params33 = null;
int _nfile = 0;
xevolution.vrcg.devdemov2400.types._shotfoto _thefoto = null;
String _filename = "";
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
int _v = 0;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
int _n = 0;
String _image = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _upl = null;
boolean _finish = false;
String _serverlocation = "";
int step9;
int limit9;
int step75;
int limit75;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69206019;
 //BA.debugLineNum = 69206019;BA.debugLine="Dim obj As String = ObjectTagcode";
_obj = __ref._objecttagcode /*String*/ ;
RDebugUtils.currentLine=69206020;
 //BA.debugLineNum = 69206020;BA.debugLine="If (Utils.isNullOrEmpty(obj)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._utils._isnullorempty /*boolean*/ (ba,_obj))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=69206021;
 //BA.debugLineNum = 69206021;BA.debugLine="obj = this.TagObject";
_obj = _this.TagObject /*String*/ ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=69206023;
 //BA.debugLineNum = 69206023;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69206024;
 //BA.debugLineNum = 69206024;BA.debugLine="Dim params33 As Map";
_params33 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69206025;
 //BA.debugLineNum = 69206025;BA.debugLine="If (FileList.Size >0) Then";
if (true) break;

case 5:
//if
this.state = 89;
if ((_filelist.getSize()>0)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=69206026;
 //BA.debugLineNum = 69206026;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos";
parent.__c.ProgressDialogShow2(ba,BA.ObjectToCharSequence(parent._sharecode._pg2msgprocessfotos /*String*/ ),parent.__c.False);
RDebugUtils.currentLine=69206027;
 //BA.debugLineNum = 69206027;BA.debugLine="For nFile=0 To FileList.Size-1";
if (true) break;

case 8:
//for
this.state = 88;
step9 = 1;
limit9 = (int) (_filelist.getSize()-1);
_nfile = (int) (0) ;
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
if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=69206028;
 //BA.debugLineNum = 69206028;BA.debugLine="Dim theFoto  As ShotFoto = FileList.Get(nFile)";
_thefoto = (xevolution.vrcg.devdemov2400.types._shotfoto)(_filelist.Get(_nfile));
RDebugUtils.currentLine=69206029;
 //BA.debugLineNum = 69206029;BA.debugLine="Dim FileName As String = theFoto.FileName";
_filename = _thefoto.FileName /*String*/ ;
RDebugUtils.currentLine=69206030;
 //BA.debugLineNum = 69206030;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
if (true) break;

case 11:
//if
this.state = 28;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_filename))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=69206031;
 //BA.debugLineNum = 69206031;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
if (true) break;

case 14:
//if
this.state = 17;
if (parent.__c.Not(_filename.indexOf(".png")>=0)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=69206032;
 //BA.debugLineNum = 69206032;BA.debugLine="FileName = $\"${FileName}.png\"$";
_filename = (""+parent.__c.SmartStringFormatter("",(Object)(_filename))+".png");
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=69206034;
 //BA.debugLineNum = 69206034;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=69206035;
 //BA.debugLineNum = 69206035;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=69206036;
 //BA.debugLineNum = 69206036;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,(""+parent.__c.SmartStringFormatter("",(Object)(_filename))+""));
RDebugUtils.currentLine=69206039;
 //BA.debugLineNum = 69206039;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent._dbstructures._getmaxofevc /*int*/ (ba,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=69206040;
 //BA.debugLineNum = 69206040;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values_images\n"+"						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"+"						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, \n"+"						execute_datetime, execute_latitude, execute_longitude)\n"+"						values ("+parent.__c.SmartStringFormatter("",(Object)(_maxid))+", '"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"',\n"+"						'"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_filename))+"', 1, "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+", \n"+"						'"+parent.__c.SmartStringFormatter("",(Object)(parent._utils._ifnullorempty /*String*/ (ba,_thefoto.DateNTime /*String*/ ,"")))+"', \n"+"						'"+parent.__c.SmartStringFormatter("",(Object)(parent._utils._ifnullorempty /*String*/ (ba,_thefoto.Latitude /*String*/ ,"")))+"', \n"+"						'"+parent.__c.SmartStringFormatter("",(Object)(parent._utils._ifnullorempty /*String*/ (ba,_thefoto.Longitude /*String*/ ,"")))+"')");
RDebugUtils.currentLine=69206050;
 //BA.debugLineNum = 69206050;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.R";
parent._utils._savesqltolog /*boolean*/ (ba,"CameraReturn",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=69206052;
 //BA.debugLineNum = 69206052;BA.debugLine="If (Utils.NNE(obj)) Then";
if (true) break;

case 18:
//if
this.state = 21;
if ((parent._utils._nne /*boolean*/ (ba,_obj))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=69206053;
 //BA.debugLineNum = 69206053;BA.debugLine="Dim v As Int = Utils.DBDataCount(Starter.Loca";
_v = (int) (parent._utils._dbdatacount /*int*/ (ba,parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,("select count(0) as COUNTER from dta_objects_images "))+1);
RDebugUtils.currentLine=69206054;
 //BA.debugLineNum = 69206054;BA.debugLine="Dim sSQL As String = $\"insert into dta_object";
_ssql = ("insert into dta_objects_images (id, object_tagcode, image, filename)\n"+"					values ("+parent.__c.SmartStringFormatter("",(Object)(_v))+", '"+parent.__c.SmartStringFormatter("",(Object)(_obj))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_imgb64))+"', '"+parent.__c.SmartStringFormatter("",(Object)(_filename))+"')");
RDebugUtils.currentLine=69206056;
 //BA.debugLineNum = 69206056;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.";
parent._utils._savesqltolog /*boolean*/ (ba,"CameraReturn",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=69206059;
 //BA.debugLineNum = 69206059;BA.debugLine="params33.Initialize";
_params33.Initialize();
RDebugUtils.currentLine=69206060;
 //BA.debugLineNum = 69206060;BA.debugLine="params33.Clear";
_params33.Clear();
RDebugUtils.currentLine=69206061;
 //BA.debugLineNum = 69206061;BA.debugLine="params33.Put(\"_token\", ShareCode.APP_TOKEN)";
_params33.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69206062;
 //BA.debugLineNum = 69206062;BA.debugLine="params33.Put(\"ACLATagcode\", obj)";
_params33.Put((Object)("ACLATagcode"),(Object)(_obj));
RDebugUtils.currentLine=69206063;
 //BA.debugLineNum = 69206063;BA.debugLine="params33.Put(\"ACLAValueImage\", ImgB64)";
_params33.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=69206064;
 //BA.debugLineNum = 69206064;BA.debugLine="params33.Put(\"ACLAValueFileImage\", FileName)";
_params33.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=69206068;
 //BA.debugLineNum = 69206068;BA.debugLine="Private sACLADatetime As String = Utils.GetCur";
_sacladatetime = parent._utils._getcurrdatetime /*String*/ (ba);
RDebugUtils.currentLine=69206069;
 //BA.debugLineNum = 69206069;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=69206070;
 //BA.debugLineNum = 69206070;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent._utils._ifnullorempty /*String*/ (ba,parent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=69206072;
 //BA.debugLineNum = 69206072;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69206073;
 //BA.debugLineNum = 69206073;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=69206074;
 //BA.debugLineNum = 69206074;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69206075;
 //BA.debugLineNum = 69206075;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=69206076;
 //BA.debugLineNum = 69206076;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=69206077;
 //BA.debugLineNum = 69206077;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=69206078;
 //BA.debugLineNum = 69206078;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=69206079;
 //BA.debugLineNum = 69206079;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=69206080;
 //BA.debugLineNum = 69206080;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=69206081;
 //BA.debugLineNum = 69206081;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=69206082;
 //BA.debugLineNum = 69206082;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
RDebugUtils.currentLine=69206083;
 //BA.debugLineNum = 69206083;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=69206084;
 //BA.debugLineNum = 69206084;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69206085;
 //BA.debugLineNum = 69206085;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69206086;
 //BA.debugLineNum = 69206086;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69206087;
 //BA.debugLineNum = 69206087;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69206088;
 //BA.debugLineNum = 69206088;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69206089;
 //BA.debugLineNum = 69206089;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69206090;
 //BA.debugLineNum = 69206090;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69206091;
 //BA.debugLineNum = 69206091;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69206092;
 //BA.debugLineNum = 69206092;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69206093;
 //BA.debugLineNum = 69206093;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=69206094;
 //BA.debugLineNum = 69206094;BA.debugLine="Try";
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
RDebugUtils.currentLine=69206095;
 //BA.debugLineNum = 69206095;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=69206096;
 //BA.debugLineNum = 69206096;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=69206098;
 //BA.debugLineNum = 69206098;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=69206099;
 //BA.debugLineNum = 69206099;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=69206100;
 //BA.debugLineNum = 69206100;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669206100",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
;
 if (true) break;
;
RDebugUtils.currentLine=69206105;
 //BA.debugLineNum = 69206105;BA.debugLine="If Not(this.Value = \"IMG_B64_EDIT\") Then";

case 28:
//if
this.state = 57;
if (parent.__c.Not((_this.Value /*String*/ ).equals("IMG_B64_EDIT"))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=69206106;
 //BA.debugLineNum = 69206106;BA.debugLine="If (ItemImages.IsInitialized) Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((__ref._itemimages /*b4a.example3.customlistview*/ .IsInitialized())) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=69206107;
 //BA.debugLineNum = 69206107;BA.debugLine="ItemImages.Clear";
__ref._itemimages /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=69206108;
 //BA.debugLineNum = 69206108;BA.debugLine="AssociateImagesCompleteList.Clear";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=69206111;
 //BA.debugLineNum = 69206111;BA.debugLine="Dim sSQL As String = $\"select ifnull(imageb64,";
_ssql = ("select ifnull(imageb64,'') as imageb64, ifnull(imagename,'') as imagename, 0 as base_image, on_report\n"+"								from dta_requests_values_images where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and\n"+"								task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' and \n"+"								tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"'\n"+"								And repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"								And repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
RDebugUtils.currentLine=69206117;
 //BA.debugLineNum = 69206117;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEV";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=69206119;
 //BA.debugLineNum = 69206119;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 35:
//if
this.state = 56;
if (_record2.getRowCount()>0) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=69206120;
 //BA.debugLineNum = 69206120;BA.debugLine="For n=0 To Record2.RowCount-1";
if (true) break;

case 38:
//for
this.state = 55;
step75 = 1;
limit75 = (int) (_record2.getRowCount()-1);
_n = (int) (0) ;
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
if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=69206121;
 //BA.debugLineNum = 69206121;BA.debugLine="Record2.Position = n";
_record2.setPosition(_n);
RDebugUtils.currentLine=69206122;
 //BA.debugLineNum = 69206122;BA.debugLine="Dim image As String = Record2.GetString(\"ima";
_image = _record2.GetString("imageb64");
RDebugUtils.currentLine=69206123;
 //BA.debugLineNum = 69206123;BA.debugLine="Dim FileName As String = Record2.GetString(\"";
_filename = _record2.GetString("imagename");
RDebugUtils.currentLine=69206124;
 //BA.debugLineNum = 69206124;BA.debugLine="If Not(Utils.isNullOrEmpty(image)) Then";
if (true) break;

case 41:
//if
this.state = 54;
if (parent.__c.Not(parent._utils._isnullorempty /*boolean*/ (ba,_image))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=69206126;
 //BA.debugLineNum = 69206126;BA.debugLine="If (ItemImages.IsInitialized) Then";
if (true) break;

case 44:
//if
this.state = 53;
if ((__ref._itemimages /*b4a.example3.customlistview*/ .IsInitialized())) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=69206127;
 //BA.debugLineNum = 69206127;BA.debugLine="Try";
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
RDebugUtils.currentLine=69206128;
 //BA.debugLineNum = 69206128;BA.debugLine="ItemImages.Add(CreateImagePanel(this, Fil";
__ref._itemimages /*b4a.example3.customlistview*/ ._add(__ref._createimagepanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,_filename,_image,(int) (0),""),(Object)(""));
RDebugUtils.currentLine=69206129;
 //BA.debugLineNum = 69206129;BA.debugLine="AssociateImagesCompleteList.Add(FileName)";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_filename));
 if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
RDebugUtils.currentLine=69206131;
 //BA.debugLineNum = 69206131;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669206131",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
;
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=69206137;
 //BA.debugLineNum = 69206137;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;
;
RDebugUtils.currentLine=69206141;
 //BA.debugLineNum = 69206141;BA.debugLine="If (params.IsInitialized) Then";

case 57:
//if
this.state = 78;
if ((_params.IsInitialized())) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=69206142;
 //BA.debugLineNum = 69206142;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=69206143;
 //BA.debugLineNum = 69206143;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 60:
//if
this.state = 65;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
RDebugUtils.currentLine=69206144;
 //BA.debugLineNum = 69206144;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=69206146;
 //BA.debugLineNum = 69206146;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69206147;
 //BA.debugLineNum = 69206147;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=69206149;
 //BA.debugLineNum = 69206149;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturnshots"),(int) (1000));
this.state = 94;
return;
case 94:
//C
this.state = 66;
;
RDebugUtils.currentLine=69206152;
 //BA.debugLineNum = 69206152;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 66:
//if
this.state = 77;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 68;
}else {
this.state = 76;
}if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=69206153;
 //BA.debugLineNum = 69206153;BA.debugLine="Try";
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
RDebugUtils.currentLine=69206154;
 //BA.debugLineNum = 69206154;BA.debugLine="Dim upl As ResumableSub = UploadFilesWithFTP";
_upl = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_upl = __ref._uploadfileswithftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename);
RDebugUtils.currentLine=69206155;
 //BA.debugLineNum = 69206155;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturnshots"), _upl);
this.state = 95;
return;
case 95:
//C
this.state = 74;
_finish = (Boolean) result[1];
;
 if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
RDebugUtils.currentLine=69206157;
 //BA.debugLineNum = 69206157;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669206157",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=69206158;
 //BA.debugLineNum = 69206158;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCod";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=69206159;
 //BA.debugLineNum = 69206159;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69206160;
 //BA.debugLineNum = 69206160;BA.debugLine="Utils.save2update(ServerLocation, FileName,";
parent._utils._save2update /*String*/ (ba,_serverlocation,_filename,(int) (1),_workernd);
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
RDebugUtils.currentLine=69206163;
 //BA.debugLineNum = 69206163;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode";
_serverlocation = ("/"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=69206164;
 //BA.debugLineNum = 69206164;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69206165;
 //BA.debugLineNum = 69206165;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1";
parent._utils._save2update /*String*/ (ba,_serverlocation,_filename,(int) (1),_workernd);
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=69206167;
 //BA.debugLineNum = 69206167;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturnshots"),(int) (1000));
this.state = 96;
return;
case 96:
//C
this.state = 78;
;
 if (true) break;
;
RDebugUtils.currentLine=69206170;
 //BA.debugLineNum = 69206170;BA.debugLine="If (params33.IsInitialized) Then";

case 78:
//if
this.state = 87;
if ((_params33.IsInitialized())) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=69206171;
 //BA.debugLineNum = 69206171;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more2/img/update");
RDebugUtils.currentLine=69206172;
 //BA.debugLineNum = 69206172;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 81:
//if
this.state = 86;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
RDebugUtils.currentLine=69206173;
 //BA.debugLineNum = 69206173;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.";
parent._utils._callapi /*String*/ (ba,(int) (0),_params33,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=69206175;
 //BA.debugLineNum = 69206175;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69206176;
 //BA.debugLineNum = 69206176;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params33),(int) (0),_workernd);
 if (true) break;

case 86:
//C
this.state = 87;
;
RDebugUtils.currentLine=69206178;
 //BA.debugLineNum = 69206178;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "camerareturnshots"),(int) (1000));
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
;
RDebugUtils.currentLine=69206183;
 //BA.debugLineNum = 69206183;BA.debugLine="ProgressDialogHide";
parent.__c.ProgressDialogHide();
 if (true) break;

case 89:
//C
this.state = -1;
;
RDebugUtils.currentLine=69206185;
 //BA.debugLineNum = 69206185;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _changeas_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "changeas_click", false))
	 {return ((String) Debug.delegate(ba, "changeas_click", null));}
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Sub changeAS_Click";
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="If (PanelOnTop = 0) Then";
if ((__ref._panelontop /*int*/ ==0)) { 
RDebugUtils.currentLine=70320131;
 //BA.debugLineNum = 70320131;BA.debugLine="asHistory.BringToFront";
__ref._ashistory /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=70320132;
 //BA.debugLineNum = 70320132;BA.debugLine="PanelOnTop = 1";
__ref._panelontop /*int*/  = (int) (1);
 }else {
RDebugUtils.currentLine=70320134;
 //BA.debugLineNum = 70320134;BA.debugLine="asPanel.BringToFront";
__ref._aspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=70320135;
 //BA.debugLineNum = 70320135;BA.debugLine="PanelOnTop = 0";
__ref._panelontop /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=70320137;
 //BA.debugLineNum = 70320137;BA.debugLine="End Sub";
return "";
}
public String  _claitembutton_stateclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "claitembutton_stateclick", false))
	 {return ((String) Debug.delegate(ba, "claitembutton_stateclick", new Object[] {_state}));}
xevolution.vrcg.devdemov2400.b4xstatebutton _btn = null;
String _ssql = "";
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Sub CLAItemButton_StateClick (State As Int)";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="Dim btn As B4XStateButton = Sender";
_btn = (xevolution.vrcg.devdemov2400.b4xstatebutton)(__c.Sender(ba));
RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="Log(btn.Tag)";
__c.LogImpl("670254594",BA.ObjectToString(_btn._gettag /*Object*/ (null)),0);
RDebugUtils.currentLine=70254595;
 //BA.debugLineNum = 70254595;BA.debugLine="FastOptionCheck = 1";
__ref._fastoptioncheck /*int*/  = (int) (1);
RDebugUtils.currentLine=70254596;
 //BA.debugLineNum = 70254596;BA.debugLine="If ((btn.Tag = \"TSKT-0003\") And (btn.Reference =";
if ((((_btn._gettag /*Object*/ (null)).equals((Object)("TSKT-0003"))) && ((_btn._getreference /*String*/ (null)).equals("2")))) { 
RDebugUtils.currentLine=70254597;
 //BA.debugLineNum = 70254597;BA.debugLine="FastOptionCheck = 2";
__ref._fastoptioncheck /*int*/  = (int) (2);
RDebugUtils.currentLine=70254598;
 //BA.debugLineNum = 70254598;BA.debugLine="Dim sSQL As String = $\"update alerts set status_";
_ssql = ("update alerts set status_id=2, itemstatus="+__c.SmartStringFormatter("",(Object)(__ref._fastoptioncheck /*int*/ ))+" where tagcode='"+__c.SmartStringFormatter("",_btn._gettag /*Object*/ (null))+"'");
RDebugUtils.currentLine=70254599;
 //BA.debugLineNum = 70254599;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sSQL)";
_starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=70254600;
 //BA.debugLineNum = 70254600;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=70254601;
 //BA.debugLineNum = 70254601;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=70254602;
 //BA.debugLineNum = 70254602;BA.debugLine="Filter.GetMoreActionsDialog(CurrentActivity, \"Us";
_filter._getmoreactionsdialog /*void*/ (null,__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,(Object)("User"),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,(int) (0),__ref._objecttagcode /*String*/ ,"",(int) (0),__ref._pressedanswertagcode /*String*/ ,"","",(int) (0));
 }else {
RDebugUtils.currentLine=70254604;
 //BA.debugLineNum = 70254604;BA.debugLine="Dim sSQL As String = $\"update alerts set status_";
_ssql = ("update alerts set status_id=2, itemstatus="+__c.SmartStringFormatter("",(Object)(__ref._fastoptioncheck /*int*/ ))+" where tagcode='"+__c.SmartStringFormatter("",_btn._gettag /*Object*/ (null))+"'");
RDebugUtils.currentLine=70254605;
 //BA.debugLineNum = 70254605;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sSQL)";
_starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
 };
RDebugUtils.currentLine=70254607;
 //BA.debugLineNum = 70254607;BA.debugLine="End Sub";
return "";
}
public String  _claitemslist_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "claitemslist_itemclick", false))
	 {return ((String) Debug.delegate(ba, "claitemslist_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Sub CLAItemsList_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=70516738;
 //BA.debugLineNum = 70516738;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
RDebugUtils.currentLine=66519040;
 //BA.debugLineNum = 66519040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=66519041;
 //BA.debugLineNum = 66519041;BA.debugLine="Private ApplActionDialog As CustomLayoutDialog";
_applactiondialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=66519042;
 //BA.debugLineNum = 66519042;BA.debugLine="Private CurrentCLD As CustomLayoutDialog";
_currentcld = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=66519043;
 //BA.debugLineNum = 66519043;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=66519044;
 //BA.debugLineNum = 66519044;BA.debugLine="Private ApplDialog As CustomLayoutDialog";
_appldialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=66519049;
 //BA.debugLineNum = 66519049;BA.debugLine="Private ACTDLG_ONE_BUTTON As B4XStateButton";
_actdlg_one_button = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=66519050;
 //BA.debugLineNum = 66519050;BA.debugLine="Private ViewSimpleList As CustomListView";
_viewsimplelist = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519051;
 //BA.debugLineNum = 66519051;BA.debugLine="Private ViewSimpleListTitle As Label";
_viewsimplelisttitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519052;
 //BA.debugLineNum = 66519052;BA.debugLine="Private ViewSimpleListInfo As Label";
_viewsimplelistinfo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519054;
 //BA.debugLineNum = 66519054;BA.debugLine="Private ThisActivityName_TaskListDialog As Object";
_thisactivityname_tasklistdialog = new Object();
RDebugUtils.currentLine=66519055;
 //BA.debugLineNum = 66519055;BA.debugLine="Private ViewSimpleListNumber As Label";
_viewsimplelistnumber = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519056;
 //BA.debugLineNum = 66519056;BA.debugLine="Private ColorTabPanel As Panel";
_colortabpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519057;
 //BA.debugLineNum = 66519057;BA.debugLine="Private listsBasePanel As Panel";
_listsbasepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519058;
 //BA.debugLineNum = 66519058;BA.debugLine="Private listsTabPanel As TabStrip";
_liststabpanel = new anywheresoftware.b4a.objects.TabStripViewPager();
RDebugUtils.currentLine=66519059;
 //BA.debugLineNum = 66519059;BA.debugLine="Private obsOptions As Spinner";
_obsoptions = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=66519060;
 //BA.debugLineNum = 66519060;BA.debugLine="Private ItemNotes As EditText";
_itemnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=66519061;
 //BA.debugLineNum = 66519061;BA.debugLine="Private ItemImages As CustomListView";
_itemimages = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519062;
 //BA.debugLineNum = 66519062;BA.debugLine="Private takePhoto As Button";
_takephoto = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519064;
 //BA.debugLineNum = 66519064;BA.debugLine="Private ActionCode As String = \"\"";
_actioncode = "";
RDebugUtils.currentLine=66519065;
 //BA.debugLineNum = 66519065;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=66519066;
 //BA.debugLineNum = 66519066;BA.debugLine="Private CurrentActivity As Activity";
_currentactivity = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=66519067;
 //BA.debugLineNum = 66519067;BA.debugLine="Private ShowImage As ImageView";
_showimage = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=66519068;
 //BA.debugLineNum = 66519068;BA.debugLine="Private ImageFilename As Label";
_imagefilename = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519069;
 //BA.debugLineNum = 66519069;BA.debugLine="Private ImageState As Label";
_imagestate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519070;
 //BA.debugLineNum = 66519070;BA.debugLine="Private takeObsOption As Button";
_takeobsoption = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519072;
 //BA.debugLineNum = 66519072;BA.debugLine="Private dlgASType As Spinner";
_dlgastype = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=66519073;
 //BA.debugLineNum = 66519073;BA.debugLine="Private dlgASEmails As FloatLabeledEditText";
_dlgasemails = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=66519074;
 //BA.debugLineNum = 66519074;BA.debugLine="Private dlgASPriority As Spinner";
_dlgaspriority = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=66519075;
 //BA.debugLineNum = 66519075;BA.debugLine="Private dlgASUrgency As Spinner";
_dlgasurgency = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=66519077;
 //BA.debugLineNum = 66519077;BA.debugLine="Private dlgASAssign As Spinner";
_dlgasassign = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=66519078;
 //BA.debugLineNum = 66519078;BA.debugLine="Private dlgASSendEmail As B4XStateButton";
_dlgassendemail = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=66519079;
 //BA.debugLineNum = 66519079;BA.debugLine="Private ItemASDetails As Label";
_itemasdetails = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519080;
 //BA.debugLineNum = 66519080;BA.debugLine="Private ItemASAssign As Label";
_itemasassign = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519081;
 //BA.debugLineNum = 66519081;BA.debugLine="Private ItemASEmails As Label";
_itemasemails = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519082;
 //BA.debugLineNum = 66519082;BA.debugLine="Private ItemASRelated As Label";
_itemasrelated = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519083;
 //BA.debugLineNum = 66519083;BA.debugLine="Private ItemASViewRelated As Label";
_itemasviewrelated = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519084;
 //BA.debugLineNum = 66519084;BA.debugLine="Private ItemASDatetime As Label";
_itemasdatetime = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519085;
 //BA.debugLineNum = 66519085;BA.debugLine="Private ItemASPriority As Label";
_itemaspriority = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519086;
 //BA.debugLineNum = 66519086;BA.debugLine="Private ItemASState As Label";
_itemasstate = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519087;
 //BA.debugLineNum = 66519087;BA.debugLine="Private ItemASUrgency As Label";
_itemasurgency = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519088;
 //BA.debugLineNum = 66519088;BA.debugLine="Private takeAS As Button";
_takeas = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519089;
 //BA.debugLineNum = 66519089;BA.debugLine="Private asHistoryList As ExpandedListView";
_ashistorylist = new xevolution.vrcg.devdemov2400.expandedlistview();
RDebugUtils.currentLine=66519090;
 //BA.debugLineNum = 66519090;BA.debugLine="Private asPanel As Panel";
_aspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519092;
 //BA.debugLineNum = 66519092;BA.debugLine="Private AS_Status As List, AS_Types As List, AS_P";
_as_status = new anywheresoftware.b4a.objects.collections.List();
_as_types = new anywheresoftware.b4a.objects.collections.List();
_as_priority = new anywheresoftware.b4a.objects.collections.List();
_as_urgency = new anywheresoftware.b4a.objects.collections.List();
_as_modes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66519093;
 //BA.debugLineNum = 66519093;BA.debugLine="Private pnlGroupTitle As Panel";
_pnlgrouptitle = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519094;
 //BA.debugLineNum = 66519094;BA.debugLine="Private lblGroupTitle As Label";
_lblgrouptitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519095;
 //BA.debugLineNum = 66519095;BA.debugLine="Private butGroupExpand As Button";
_butgroupexpand = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519096;
 //BA.debugLineNum = 66519096;BA.debugLine="Private pnlGroupExpanded As Panel";
_pnlgroupexpanded = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519098;
 //BA.debugLineNum = 66519098;BA.debugLine="Private CurrentIndex As Int = 0";
_currentindex = (int) (0);
RDebugUtils.currentLine=66519099;
 //BA.debugLineNum = 66519099;BA.debugLine="Private dlgASStatus As Spinner";
_dlgasstatus = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=66519101;
 //BA.debugLineNum = 66519101;BA.debugLine="Private CurrentImageList As List";
_currentimagelist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66519102;
 //BA.debugLineNum = 66519102;BA.debugLine="Private EmailSentOnNewAS As Boolean = False";
_emailsentonnewas = __c.False;
RDebugUtils.currentLine=66519103;
 //BA.debugLineNum = 66519103;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
_currentclaitem = new xevolution.vrcg.devdemov2400.types._requestclaitem();
RDebugUtils.currentLine=66519104;
 //BA.debugLineNum = 66519104;BA.debugLine="Private CurrentTagcode As String = \"\"";
_currenttagcode = "";
RDebugUtils.currentLine=66519105;
 //BA.debugLineNum = 66519105;BA.debugLine="Private sendEmailImages As Button";
_sendemailimages = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519106;
 //BA.debugLineNum = 66519106;BA.debugLine="Private sendEmail As Button";
_sendemail = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519107;
 //BA.debugLineNum = 66519107;BA.debugLine="Private dlgASEmailsCC As FloatLabeledEditText";
_dlgasemailscc = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=66519108;
 //BA.debugLineNum = 66519108;BA.debugLine="Private dlgASEmailsSubject As FloatLabeledEditTex";
_dlgasemailssubject = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=66519109;
 //BA.debugLineNum = 66519109;BA.debugLine="Private imageSelected As Label";
_imageselected = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519110;
 //BA.debugLineNum = 66519110;BA.debugLine="Private CLAItem_G1 As Label";
_claitem_g1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519111;
 //BA.debugLineNum = 66519111;BA.debugLine="Private CLAItemButton_1 As B4XStateButton";
_claitembutton_1 = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=66519112;
 //BA.debugLineNum = 66519112;BA.debugLine="Private CLAItemButton_2 As B4XStateButton";
_claitembutton_2 = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=66519113;
 //BA.debugLineNum = 66519113;BA.debugLine="Private CLAButtonOptions As Button";
_clabuttonoptions = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519115;
 //BA.debugLineNum = 66519115;BA.debugLine="Private Master_OBS As String = \"\"";
_master_obs = "";
RDebugUtils.currentLine=66519116;
 //BA.debugLineNum = 66519116;BA.debugLine="Private Master_Image As String = \"\"";
_master_image = "";
RDebugUtils.currentLine=66519117;
 //BA.debugLineNum = 66519117;BA.debugLine="Private changeAS As Button";
_changeas = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519118;
 //BA.debugLineNum = 66519118;BA.debugLine="Private PanelOnTop As Int = 0";
_panelontop = (int) (0);
RDebugUtils.currentLine=66519119;
 //BA.debugLineNum = 66519119;BA.debugLine="Private asHistory As Panel";
_ashistory = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519121;
 //BA.debugLineNum = 66519121;BA.debugLine="Private IsFastOptionCheck As Boolean = False";
_isfastoptioncheck = __c.False;
RDebugUtils.currentLine=66519122;
 //BA.debugLineNum = 66519122;BA.debugLine="Private FastOptionCheck As Int = 0";
_fastoptioncheck = (int) (0);
RDebugUtils.currentLine=66519123;
 //BA.debugLineNum = 66519123;BA.debugLine="Private imageSelectedOnReport As Label";
_imageselectedonreport = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519124;
 //BA.debugLineNum = 66519124;BA.debugLine="Private CLAItemsList As CustomListView";
_claitemslist = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519125;
 //BA.debugLineNum = 66519125;BA.debugLine="Private CLAItemEditValue As FloatLabeledEditText";
_claitemeditvalue = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=66519126;
 //BA.debugLineNum = 66519126;BA.debugLine="Private CLAItemLabel As Label";
_claitemlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519128;
 //BA.debugLineNum = 66519128;BA.debugLine="Private ObjectTagcode As String = \"\" 'innerObject";
_objecttagcode = "";
RDebugUtils.currentLine=66519129;
 //BA.debugLineNum = 66519129;BA.debugLine="Private ShowImageView As ImageView";
_showimageview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=66519130;
 //BA.debugLineNum = 66519130;BA.debugLine="Private CurrentRequestCLAItem As RequestCLAItem";
_currentrequestclaitem = new xevolution.vrcg.devdemov2400.types._requestclaitem();
RDebugUtils.currentLine=66519131;
 //BA.debugLineNum = 66519131;BA.debugLine="Private CurrentItemNotes As EditText";
_currentitemnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=66519132;
 //BA.debugLineNum = 66519132;BA.debugLine="Private dlgASSubject As EditText";
_dlgassubject = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=66519133;
 //BA.debugLineNum = 66519133;BA.debugLine="Private dlgASDetails As EditText";
_dlgasdetails = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=66519134;
 //BA.debugLineNum = 66519134;BA.debugLine="Private butASDueDate As Button";
_butasduedate = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519135;
 //BA.debugLineNum = 66519135;BA.debugLine="Private dlgASDueDate As FloatLabeledEditText";
_dlgasduedate = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=66519136;
 //BA.debugLineNum = 66519136;BA.debugLine="Private associateObject As Button";
_associateobject = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519137;
 //BA.debugLineNum = 66519137;BA.debugLine="Private ImageStateName As Label";
_imagestatename = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519138;
 //BA.debugLineNum = 66519138;BA.debugLine="Private CurrentItemNotesText As String";
_currentitemnotestext = "";
RDebugUtils.currentLine=66519139;
 //BA.debugLineNum = 66519139;BA.debugLine="Private takeSignature As Button";
_takesignature = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519140;
 //BA.debugLineNum = 66519140;BA.debugLine="Private itemSignatures As CustomListView";
_itemsignatures = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519141;
 //BA.debugLineNum = 66519141;BA.debugLine="Private signaturePanel As Panel";
_signaturepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519142;
 //BA.debugLineNum = 66519142;BA.debugLine="Private InnerSignatureView As ImageView";
_innersignatureview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=66519143;
 //BA.debugLineNum = 66519143;BA.debugLine="Private InnerSignatureOnReport As Label";
_innersignatureonreport = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519144;
 //BA.debugLineNum = 66519144;BA.debugLine="Private InnerSignatureRemove As Label";
_innersignatureremove = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519145;
 //BA.debugLineNum = 66519145;BA.debugLine="Private InnerSignatureName As Label";
_innersignaturename = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519146;
 //BA.debugLineNum = 66519146;BA.debugLine="Private PanelSignature As Panel";
_panelsignature = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519147;
 //BA.debugLineNum = 66519147;BA.debugLine="Private SignPanel As Panel";
_signpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519148;
 //BA.debugLineNum = 66519148;BA.debugLine="Private btnClearSign As Button";
_btnclearsign = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519149;
 //BA.debugLineNum = 66519149;BA.debugLine="Private btnSaveSign As Button";
_btnsavesign = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519150;
 //BA.debugLineNum = 66519150;BA.debugLine="Private SignPerson As Label";
_signperson = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519151;
 //BA.debugLineNum = 66519151;BA.debugLine="Dim Signature As SignatureData";
_signature = new xevolution.vrcg.devdemov2400.signaturecapture._signaturedata();
RDebugUtils.currentLine=66519152;
 //BA.debugLineNum = 66519152;BA.debugLine="Dim SignCanvas As Canvas";
_signcanvas = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=66519153;
 //BA.debugLineNum = 66519153;BA.debugLine="Private InnerSignatureInfo As Label";
_innersignatureinfo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519154;
 //BA.debugLineNum = 66519154;BA.debugLine="Private moreActionQuest As Label";
_moreactionquest = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519155;
 //BA.debugLineNum = 66519155;BA.debugLine="Private moreActionQuest2 As Label";
_moreactionquest2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519156;
 //BA.debugLineNum = 66519156;BA.debugLine="Private moreActionQuest3 As Label";
_moreactionquest3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519157;
 //BA.debugLineNum = 66519157;BA.debugLine="Private takeNewDesign As Button";
_takenewdesign = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519158;
 //BA.debugLineNum = 66519158;BA.debugLine="Public ItemTitle As String";
_itemtitle = "";
RDebugUtils.currentLine=66519160;
 //BA.debugLineNum = 66519160;BA.debugLine="Private PressedAnswerTagCode As String = \"\"";
_pressedanswertagcode = "";
RDebugUtils.currentLine=66519161;
 //BA.debugLineNum = 66519161;BA.debugLine="Private ItemHISTNotes As EditText";
_itemhistnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=66519162;
 //BA.debugLineNum = 66519162;BA.debugLine="Private itemHISTSignatures As CustomListView";
_itemhistsignatures = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519163;
 //BA.debugLineNum = 66519163;BA.debugLine="Private ItemHISTImages As CustomListView";
_itemhistimages = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519164;
 //BA.debugLineNum = 66519164;BA.debugLine="Private SignPanelView As Panel";
_signpanelview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=66519165;
 //BA.debugLineNum = 66519165;BA.debugLine="Private btnCancelSign As Button";
_btncancelsign = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519166;
 //BA.debugLineNum = 66519166;BA.debugLine="Private dlgASCCEmails As FloatLabeledEditText";
_dlgasccemails = new anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper();
RDebugUtils.currentLine=66519167;
 //BA.debugLineNum = 66519167;BA.debugLine="Private imageSelectedTrash As Label";
_imageselectedtrash = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519168;
 //BA.debugLineNum = 66519168;BA.debugLine="Private ObjectsImages As CustomListView";
_objectsimages = new b4a.example3.customlistview();
RDebugUtils.currentLine=66519170;
 //BA.debugLineNum = 66519170;BA.debugLine="Private ItemImageView As ImageView";
_itemimageview = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=66519171;
 //BA.debugLineNum = 66519171;BA.debugLine="Private btnAssociateImage As B4XStateButton";
_btnassociateimage = new xevolution.vrcg.devdemov2400.b4xstatebutton();
RDebugUtils.currentLine=66519172;
 //BA.debugLineNum = 66519172;BA.debugLine="Private AssociateImagesList As List";
_associateimageslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66519173;
 //BA.debugLineNum = 66519173;BA.debugLine="Private AssociateImagesCompleteList As List";
_associateimagescompletelist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66519174;
 //BA.debugLineNum = 66519174;BA.debugLine="Private lblObjectImageTitle As Label";
_lblobjectimagetitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519175;
 //BA.debugLineNum = 66519175;BA.debugLine="Private editAS As Button";
_editas = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=66519176;
 //BA.debugLineNum = 66519176;BA.debugLine="Private CurrentASTagcode As String = \"\"";
_currentastagcode = "";
RDebugUtils.currentLine=66519177;
 //BA.debugLineNum = 66519177;BA.debugLine="Private AvisoNoImages As Label";
_avisonoimages = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=66519178;
 //BA.debugLineNum = 66519178;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createasinneritempanel(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.sql.SQL.CursorWrapper _datarecord) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createasinneritempanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createasinneritempanel", new Object[] {_this,_datarecord}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=67174400;
 //BA.debugLineNum = 67174400;BA.debugLine="Sub CreateASInnerItemPanel(this As RequestCLAItem,";
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67174402;
 //BA.debugLineNum = 67174402;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67174403;
 //BA.debugLineNum = 67174403;BA.debugLine="CurrentActivity.AddView(p, 0, 0, pnlGroupExpanded";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__ref._pnlgroupexpanded /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__c.DipToCurrent((int) (190)));
RDebugUtils.currentLine=67174404;
 //BA.debugLineNum = 67174404;BA.debugLine="p.LoadLayout(\"ItemList_More_Action\")";
_p.LoadLayout("ItemList_More_Action",ba);
RDebugUtils.currentLine=67174405;
 //BA.debugLineNum = 67174405;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=67174406;
 //BA.debugLineNum = 67174406;BA.debugLine="ItemASDetails.Text = dataRecord.GetString(\"detail";
__ref._itemasdetails /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("details")));
RDebugUtils.currentLine=67174407;
 //BA.debugLineNum = 67174407;BA.debugLine="ItemASAssign.Text = dataRecord.GetString(\"assigne";
__ref._itemasassign /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("assigned_to")));
RDebugUtils.currentLine=67174408;
 //BA.debugLineNum = 67174408;BA.debugLine="ItemASEmails.Text = dataRecord.GetString(\"email_t";
__ref._itemasemails /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("email_to")));
RDebugUtils.currentLine=67174409;
 //BA.debugLineNum = 67174409;BA.debugLine="ItemASRelated.Text = \"\" 'dataRecord.GetString(\"re";
__ref._itemasrelated /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=67174410;
 //BA.debugLineNum = 67174410;BA.debugLine="ItemASPriority.Text = dataRecord.GetString(\"prior";
__ref._itemaspriority /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("priority_desc")));
RDebugUtils.currentLine=67174411;
 //BA.debugLineNum = 67174411;BA.debugLine="ItemASUrgency.Text = dataRecord.GetString(\"urgenc";
__ref._itemasurgency /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("urgency_desc")));
RDebugUtils.currentLine=67174412;
 //BA.debugLineNum = 67174412;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=67174413;
 //BA.debugLineNum = 67174413;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=67174414;
 //BA.debugLineNum = 67174414;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createasitempanel(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,xevolution.vrcg.devdemov2400.checklist3._itemdata _id,anywheresoftware.b4a.sql.SQL.CursorWrapper _datarecord,int _idx) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createasitempanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createasitempanel", new Object[] {_this,_id,_datarecord,_idx}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=67108864;
 //BA.debugLineNum = 67108864;BA.debugLine="Sub CreateASItemPanel(this As RequestCLAItem, id A";
RDebugUtils.currentLine=67108866;
 //BA.debugLineNum = 67108866;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=67108867;
 //BA.debugLineNum = 67108867;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, asHistoryList.sv.Wid";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._ashistorylist /*xevolution.vrcg.devdemov2400.expandedlistview*/ ._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=67108868;
 //BA.debugLineNum = 67108868;BA.debugLine="p.LoadLayout(\"ItemList_More_GroupAction\")";
_p.LoadLayout("ItemList_More_GroupAction",ba);
RDebugUtils.currentLine=67108869;
 //BA.debugLineNum = 67108869;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, asHistoryList.sv.Wid";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._ashistorylist /*xevolution.vrcg.devdemov2400.expandedlistview*/ ._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=67108870;
 //BA.debugLineNum = 67108870;BA.debugLine="lblGroupTitle.Text = $\"${dataRecord.GetString(\"ac";
__ref._lblgrouptitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_datarecord.GetString("actiondatetime")))+" - ("+__c.SmartStringFormatter("",(Object)(_datarecord.GetString("status_desc")))+")")));
RDebugUtils.currentLine=67108871;
 //BA.debugLineNum = 67108871;BA.debugLine="pnlGroupExpanded.AddView(CreateASInnerItemPanel(t";
__ref._pnlgroupexpanded /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._createasinneritempanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_this,_datarecord).getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (190)));
RDebugUtils.currentLine=67108873;
 //BA.debugLineNum = 67108873;BA.debugLine="lblGroupTitle.Tag = idx";
__ref._lblgrouptitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_idx));
RDebugUtils.currentLine=67108874;
 //BA.debugLineNum = 67108874;BA.debugLine="pnlGroupTitle.Tag = idx";
__ref._pnlgrouptitle /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)(_idx));
RDebugUtils.currentLine=67108875;
 //BA.debugLineNum = 67108875;BA.debugLine="butGroupExpand.Tag = idx";
__ref._butgroupexpand /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)(_idx));
RDebugUtils.currentLine=67108877;
 //BA.debugLineNum = 67108877;BA.debugLine="p.Tag = False";
_p.setTag((Object)(__c.False));
RDebugUtils.currentLine=67108878;
 //BA.debugLineNum = 67108878;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=67108879;
 //BA.debugLineNum = 67108879;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createaspanel(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,boolean _havedata,anywheresoftware.b4a.sql.SQL.CursorWrapper _datarecord) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createaspanel", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createaspanel", new Object[] {_this,_havedata,_datarecord}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=67043328;
 //BA.debugLineNum = 67043328;BA.debugLine="Sub CreateASPanel(this As RequestCLAItem, haveData";
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67043330;
 //BA.debugLineNum = 67043330;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67043331;
 //BA.debugLineNum = 67043331;BA.debugLine="CurrentActivity.AddView(p, 0, 1dip, 100%x,100%y)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),__c.DipToCurrent((int) (1)),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=67043332;
 //BA.debugLineNum = 67043332;BA.debugLine="p.LoadLayout(\"ItemList_More_ActionLast\")";
_p.LoadLayout("ItemList_More_ActionLast",ba);
RDebugUtils.currentLine=67043333;
 //BA.debugLineNum = 67043333;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=67043335;
 //BA.debugLineNum = 67043335;BA.debugLine="If (haveData) Then";
if ((_havedata)) { 
RDebugUtils.currentLine=67043336;
 //BA.debugLineNum = 67043336;BA.debugLine="ItemASDetails.Text = dataRecord.GetString(\"detai";
__ref._itemasdetails /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("details")));
RDebugUtils.currentLine=67043337;
 //BA.debugLineNum = 67043337;BA.debugLine="ItemASAssign.Text = dataRecord.GetString(\"assign";
__ref._itemasassign /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("assigned_to")));
RDebugUtils.currentLine=67043338;
 //BA.debugLineNum = 67043338;BA.debugLine="ItemASEmails.Text = dataRecord.GetString(\"email_";
__ref._itemasemails /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("email_to")));
RDebugUtils.currentLine=67043339;
 //BA.debugLineNum = 67043339;BA.debugLine="ItemASRelated.Text = \"\" 'dataRecord.GetString(\"r";
__ref._itemasrelated /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=67043340;
 //BA.debugLineNum = 67043340;BA.debugLine="ItemASDatetime.Text = dataRecord.GetString(\"due_";
__ref._itemasdatetime /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("due_date")));
RDebugUtils.currentLine=67043341;
 //BA.debugLineNum = 67043341;BA.debugLine="ItemASPriority.Text = dataRecord.GetString(\"prio";
__ref._itemaspriority /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("priority_desc")));
RDebugUtils.currentLine=67043342;
 //BA.debugLineNum = 67043342;BA.debugLine="ItemASUrgency.Text = dataRecord.GetString(\"urgen";
__ref._itemasurgency /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("urgency_desc")));
RDebugUtils.currentLine=67043343;
 //BA.debugLineNum = 67043343;BA.debugLine="ItemASState.Text = dataRecord.GetString(\"status_";
__ref._itemasstate /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_datarecord.GetString("status_desc")));
 };
RDebugUtils.currentLine=67043346;
 //BA.debugLineNum = 67043346;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=67043347;
 //BA.debugLineNum = 67043347;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=67043348;
 //BA.debugLineNum = 67043348;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimagepanelbmp(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _filename,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _btm,int _state,String _innertag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createimagepanelbmp", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimagepanelbmp", new Object[] {_this,_filename,_btm,_state,_innertag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=67895296;
 //BA.debugLineNum = 67895296;BA.debugLine="Sub CreateImagePanelBMP(this As RequestCLAItem, fi";
RDebugUtils.currentLine=67895297;
 //BA.debugLineNum = 67895297;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=67895298;
 //BA.debugLineNum = 67895298;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=67895299;
 //BA.debugLineNum = 67895299;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=67895300;
 //BA.debugLineNum = 67895300;BA.debugLine="p.LoadLayout(\"CLA_MORE_IMGAGE_Listview\")";
_p.LoadLayout("CLA_MORE_IMGAGE_Listview",ba);
RDebugUtils.currentLine=67895301;
 //BA.debugLineNum = 67895301;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=67895303;
 //BA.debugLineNum = 67895303;BA.debugLine="ShowImage.SetBackgroundImage(btm)";
__ref._showimage /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_btm.getObject()));
RDebugUtils.currentLine=67895304;
 //BA.debugLineNum = 67895304;BA.debugLine="ShowImage.Tag = innerTag";
__ref._showimage /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTag((Object)(_innertag));
RDebugUtils.currentLine=67895306;
 //BA.debugLineNum = 67895306;BA.debugLine="ImageFilename.Text = filename";
__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_filename));
RDebugUtils.currentLine=67895307;
 //BA.debugLineNum = 67895307;BA.debugLine="ImageFilename.Tag = innerTag";
__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_innertag));
RDebugUtils.currentLine=67895308;
 //BA.debugLineNum = 67895308;BA.debugLine="ImageStateName.Text = \"\"";
__ref._imagestatename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=67895309;
 //BA.debugLineNum = 67895309;BA.debugLine="ImageStateName.Tag = state";
__ref._imagestatename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_state));
RDebugUtils.currentLine=67895310;
 //BA.debugLineNum = 67895310;BA.debugLine="imageSelected.Tag = 0";
__ref._imageselected /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(0));
RDebugUtils.currentLine=67895311;
 //BA.debugLineNum = 67895311;BA.debugLine="imageSelected.TextColor = Consts.ColorLightSilver";
__ref._imageselected /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=67895312;
 //BA.debugLineNum = 67895312;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorLig";
__ref._imageselectedonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=67895313;
 //BA.debugLineNum = 67895313;BA.debugLine="imageSelectedOnReport.Tag = this";
__ref._imageselectedonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=67895314;
 //BA.debugLineNum = 67895314;BA.debugLine="If (this.OnReport = 1) Then";
if ((_this.OnReport /*int*/ ==1)) { 
RDebugUtils.currentLine=67895315;
 //BA.debugLineNum = 67895315;BA.debugLine="imageSelectedOnReport.TextColor = Consts.ColorGr";
__ref._imageselectedonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=67895317;
 //BA.debugLineNum = 67895317;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=67895318;
 //BA.debugLineNum = 67895318;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=67895319;
 //BA.debugLineNum = 67895319;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createsignaturepanelbmp(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _filename,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _btm,int _state,String _innertag) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "createsignaturepanelbmp", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createsignaturepanelbmp", new Object[] {_this,_filename,_btm,_state,_innertag}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _width = 0;
RDebugUtils.currentLine=68026368;
 //BA.debugLineNum = 68026368;BA.debugLine="Sub CreateSignaturePanelBMP(this As RequestCLAItem";
RDebugUtils.currentLine=68026369;
 //BA.debugLineNum = 68026369;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=68026370;
 //BA.debugLineNum = 68026370;BA.debugLine="p.Initialize(\"\") 'ImageViewEdit\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=68026371;
 //BA.debugLineNum = 68026371;BA.debugLine="Dim width As Int = 260dip";
_width = __c.DipToCurrent((int) (260));
RDebugUtils.currentLine=68026372;
 //BA.debugLineNum = 68026372;BA.debugLine="If (ShareCode.DEVICE_ORIENTATION = 1) Then";
if ((_sharecode._device_orientation /*int*/ ==1)) { 
RDebugUtils.currentLine=68026373;
 //BA.debugLineNum = 68026373;BA.debugLine="width = 200dip";
_width = __c.DipToCurrent((int) (200));
 };
RDebugUtils.currentLine=68026375;
 //BA.debugLineNum = 68026375;BA.debugLine="CurrentActivity.AddView(p, 0, 0, 100%x, 130dip)";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=68026376;
 //BA.debugLineNum = 68026376;BA.debugLine="p.LoadLayout(\"CLA_MORE_Signature\")";
_p.LoadLayout("CLA_MORE_Signature",ba);
RDebugUtils.currentLine=68026377;
 //BA.debugLineNum = 68026377;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=68026378;
 //BA.debugLineNum = 68026378;BA.debugLine="InnerSignatureView.SetBackgroundImage(btm)";
__ref._innersignatureview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(_btm.getObject()));
RDebugUtils.currentLine=68026379;
 //BA.debugLineNum = 68026379;BA.debugLine="InnerSignatureName.Text = filename";
__ref._innersignaturename /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_filename));
RDebugUtils.currentLine=68026380;
 //BA.debugLineNum = 68026380;BA.debugLine="InnerSignatureInfo.Text = innerTag";
__ref._innersignatureinfo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_innertag));
RDebugUtils.currentLine=68026382;
 //BA.debugLineNum = 68026382;BA.debugLine="If (this.OnReport = 1) Then";
if ((_this.OnReport /*int*/ ==1)) { 
RDebugUtils.currentLine=68026383;
 //BA.debugLineNum = 68026383;BA.debugLine="InnerSignatureOnReport.TextColor = Consts.ColorG";
__ref._innersignatureonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(_consts._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=68026385;
 //BA.debugLineNum = 68026385;BA.debugLine="InnerSignatureView.Tag = this";
__ref._innersignatureview /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=68026386;
 //BA.debugLineNum = 68026386;BA.debugLine="InnerSignatureOnReport.Tag = this";
__ref._innersignatureonreport /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=68026387;
 //BA.debugLineNum = 68026387;BA.debugLine="InnerSignatureRemove.Tag = this";
__ref._innersignatureremove /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=68026388;
 //BA.debugLineNum = 68026388;BA.debugLine="InnerSignatureInfo.Tag = this";
__ref._innersignatureinfo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_this));
RDebugUtils.currentLine=68026390;
 //BA.debugLineNum = 68026390;BA.debugLine="p.Tag = this";
_p.setTag((Object)(_this));
RDebugUtils.currentLine=68026391;
 //BA.debugLineNum = 68026391;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=68026392;
 //BA.debugLineNum = 68026392;BA.debugLine="End Sub  'CreateSignaturePanel";
return null;
}
public void  _deleteimagefromlist(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.B4XViewWrapper _thispanel,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.objects.LabelWrapper _fname) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "deleteimagefromlist", false))
	 {Debug.delegate(ba, "deleteimagefromlist", new Object[] {_thispanel,_this,_fname}); return;}
ResumableSub_DeleteImageFromList rsub = new ResumableSub_DeleteImageFromList(this,__ref,_thispanel,_this,_fname);
rsub.resume(ba, null);
}
public static class ResumableSub_DeleteImageFromList extends BA.ResumableSub {
public ResumableSub_DeleteImageFromList(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.B4XViewWrapper _thispanel,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.objects.LabelWrapper _fname) {
this.parent = parent;
this.__ref = __ref;
this._thispanel = _thispanel;
this._this = _this;
this._fname = _fname;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.B4XViewWrapper _thispanel;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
anywheresoftware.b4a.objects.LabelWrapper _fname;
int _index = 0;
int _i = 0;
String _ssql = "";
int _listviewindex = 0;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="Dim Index As Int = ItemImages.GetItemFromView(thi";
_index = __ref._itemimages /*b4a.example3.customlistview*/ ._getitemfromview(_thispanel);
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="If (this.BaseImage = 1) Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_this.BaseImage /*int*/ ==1)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=70451204;
 //BA.debugLineNum = 70451204;BA.debugLine="MsgboxAsync(\"A imagem seleccionada é uma imagem";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("A imagem seleccionada é uma imagem BASE e não pode ser apagada!"),BA.ObjectToCharSequence("Alerta!"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=70451207;
 //BA.debugLineNum = 70451207;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.CLAImageRemove,";
_i = parent.__c.Msgbox2(BA.ObjectToCharSequence(parent._sharecode._claimageremove /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*String*/ ),parent._sharecode._option_yes /*String*/ ,parent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(parent.__c.Null),ba);
RDebugUtils.currentLine=70451208;
 //BA.debugLineNum = 70451208;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 6:
//if
this.state = 19;
if ((_i==parent.__c.DialogResponse.POSITIVE)) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=70451210;
 //BA.debugLineNum = 70451210;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_thispanel.getTag());
RDebugUtils.currentLine=70451211;
 //BA.debugLineNum = 70451211;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_thispanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=70451213;
 //BA.debugLineNum = 70451213;BA.debugLine="Dim sSQL As String = $\"delete from dta_requests";
_ssql = ("delete from dta_requests_values_images where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and\n"+"									item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"' and imagename='"+parent.__c.SmartStringFormatter("",(Object)(_fname.getText()))+"'\n"+"									And repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"									And repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"\n"+"									And repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+"");
RDebugUtils.currentLine=70451219;
 //BA.debugLineNum = 70451219;BA.debugLine="Utils.SaveSQLToLog(\"ItemImages_ItemLongClick\",s";
parent._utils._savesqltolog /*boolean*/ (ba,"ItemImages_ItemLongClick",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=70451221;
 //BA.debugLineNum = 70451221;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("670451221",_ssql,0);
RDebugUtils.currentLine=70451222;
 //BA.debugLineNum = 70451222;BA.debugLine="ItemImages.RemoveAt(Index)";
__ref._itemimages /*b4a.example3.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=70451223;
 //BA.debugLineNum = 70451223;BA.debugLine="Dim listviewIndex As Int = AssociateImagesCompl";
_listviewindex = __ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_fname.getText()));
RDebugUtils.currentLine=70451224;
 //BA.debugLineNum = 70451224;BA.debugLine="AssociateImagesCompleteList.RemoveAt(listviewIn";
__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_listviewindex);
RDebugUtils.currentLine=70451227;
 //BA.debugLineNum = 70451227;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=70451228;
 //BA.debugLineNum = 70451228;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=70451229;
 //BA.debugLineNum = 70451229;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=70451230;
 //BA.debugLineNum = 70451230;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=70451231;
 //BA.debugLineNum = 70451231;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=70451232;
 //BA.debugLineNum = 70451232;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=70451233;
 //BA.debugLineNum = 70451233;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=70451234;
 //BA.debugLineNum = 70451234;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=70451235;
 //BA.debugLineNum = 70451235;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=70451236;
 //BA.debugLineNum = 70451236;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=70451237;
 //BA.debugLineNum = 70451237;BA.debugLine="params.Put(\"ACLAValueFileImage\", fname.Text)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_fname.getText()));
RDebugUtils.currentLine=70451239;
 //BA.debugLineNum = 70451239;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=70451240;
 //BA.debugLineNum = 70451240;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCou";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=70451241;
 //BA.debugLineNum = 70451241;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=70451242;
 //BA.debugLineNum = 70451242;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=70451243;
 //BA.debugLineNum = 70451243;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=70451244;
 //BA.debugLineNum = 70451244;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=70451245;
 //BA.debugLineNum = 70451245;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=70451246;
 //BA.debugLineNum = 70451246;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=70451247;
 //BA.debugLineNum = 70451247;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=70451248;
 //BA.debugLineNum = 70451248;BA.debugLine="If (params.IsInitialized) Then";
if (true) break;

case 9:
//if
this.state = 18;
if ((_params.IsInitialized())) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=70451251;
 //BA.debugLineNum = 70451251;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/delete");
RDebugUtils.currentLine=70451252;
 //BA.debugLineNum = 70451252;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=70451253;
 //BA.debugLineNum = 70451253;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=70451255;
 //BA.debugLineNum = 70451255;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=70451256;
 //BA.debugLineNum = 70451256;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=70451258;
 //BA.debugLineNum = 70451258;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "deleteimagefromlist"),(int) (250));
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
RDebugUtils.currentLine=70451263;
 //BA.debugLineNum = 70451263;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _dlgasassign_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "dlgasassign_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dlgasassign_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=67305472;
 //BA.debugLineNum = 67305472;BA.debugLine="Sub dlgASAssign_ItemClick (Position As Int, Value";
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="End Sub";
return "";
}
public String  _dlgassendemail_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "dlgassendemail_click", false))
	 {return ((String) Debug.delegate(ba, "dlgassendemail_click", null));}
RDebugUtils.currentLine=67239936;
 //BA.debugLineNum = 67239936;BA.debugLine="Sub dlgASSendEmail_Click";
RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="End Sub";
return "";
}
public String  _dlgastype_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "dlgastype_itemclick", false))
	 {return ((String) Debug.delegate(ba, "dlgastype_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Sub dlgASType_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=69992461;
 //BA.debugLineNum = 69992461;BA.debugLine="End Sub";
return "";
}
public String  _editas_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "editas_click", false))
	 {return ((String) Debug.delegate(ba, "editas_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _thisbutton = null;
String _mytag = "";
String _thetagcode = "";
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=67502080;
 //BA.debugLineNum = 67502080;BA.debugLine="Sub editAS_Click";
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="Dim thisButton As Button = Sender";
_thisbutton = new anywheresoftware.b4a.objects.ButtonWrapper();
_thisbutton = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=67502082;
 //BA.debugLineNum = 67502082;BA.debugLine="Dim myTag As String = thisButton.Tag";
_mytag = BA.ObjectToString(_thisbutton.getTag());
RDebugUtils.currentLine=67502084;
 //BA.debugLineNum = 67502084;BA.debugLine="Dim theTagcode As String = CurrentCLAItem.Tagcode";
_thetagcode = __ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ .trim();
RDebugUtils.currentLine=67502085;
 //BA.debugLineNum = 67502085;BA.debugLine="If Utils.NNE(PressedAnswerTagCode) Then";
if (_utils._nne /*boolean*/ (ba,__ref._pressedanswertagcode /*String*/ )) { 
RDebugUtils.currentLine=67502086;
 //BA.debugLineNum = 67502086;BA.debugLine="theTagcode = PressedAnswerTagCode";
_thetagcode = __ref._pressedanswertagcode /*String*/ ;
 };
RDebugUtils.currentLine=67502089;
 //BA.debugLineNum = 67502089;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=67502090;
 //BA.debugLineNum = 67502090;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=67502091;
 //BA.debugLineNum = 67502091;BA.debugLine="Filter.GetMoreEditActionsDialog(ThisActivityName_";
_filter._getmoreeditactionsdialog /*void*/ (null,__ref._thisactivityname_tasklistdialog /*Object*/ ,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,_mytag,__ref._currentitemnotestext /*String*/ ,__c.True,_thetagcode,__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ,"","",(int) (0));
RDebugUtils.currentLine=67502093;
 //BA.debugLineNum = 67502093;BA.debugLine="End Sub";
return "";
}
public void  _getmoreeditactionsdialog(xevolution.vrcg.devdemov2400.appactiondialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _astagcode,String _obs,boolean _isnew,String _thetagcode,anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _parentdialog,String _tagcodetpa,String _grouptpa,int _actionforce) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "getmoreeditactionsdialog", false))
	 {Debug.delegate(ba, "getmoreeditactionsdialog", new Object[] {_activ,_this,_astagcode,_obs,_isnew,_thetagcode,_parentdialog,_tagcodetpa,_grouptpa,_actionforce}); return;}
ResumableSub_GetMoreEditActionsDialog rsub = new ResumableSub_GetMoreEditActionsDialog(this,__ref,_activ,_this,_astagcode,_obs,_isnew,_thetagcode,_parentdialog,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(ba, null);
}
public static class ResumableSub_GetMoreEditActionsDialog extends BA.ResumableSub {
public ResumableSub_GetMoreEditActionsDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _astagcode,String _obs,boolean _isnew,String _thetagcode,anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _parentdialog,String _tagcodetpa,String _grouptpa,int _actionforce) {
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
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _astagcode;
String _obs;
boolean _isnew;
String _thetagcode;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _parentdialog;
String _tagcodetpa;
String _grouptpa;
int _actionforce;
String _title = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _gravityvalue = 0;
int _n = 0;
xevolution.vrcg.devdemov2400.types._db_itc _itc = null;
int _npos = 0;
String _detailstext = "";
int _res = 0;
int _sendtheemail = 0;
String _dtupd = "";
String _ssql = "";
String _newhtml = "";
int _recordcount = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _actions_tagcode = "";
String _request_tagcode = "";
String _reference = "";
String _technical_name = "";
String _updated_at = "";
String _details = "";
String _status_name = "";
String _due_date = "";
String _priority_name = "";
String _gravity_name = "";
String _operation_name = "";
long _ddate = 0L;
String _logo = "";
String _logoalt = "";
String _logotitle = "";
String _suporte = "";
anywheresoftware.b4a.objects.collections.List _imglist = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _actiondatetime = "";
String _emailsentdate = "";
int step15;
int limit15;
int step22;
int limit22;
int step40;
int limit40;
int step47;
int limit47;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69795843;
 //BA.debugLineNum = 69795843;BA.debugLine="Dim Title As String = ShareCode.ActionSubEditTitl";
_title = parent._sharecode._actionsubedittitle /*String*/ ;
RDebugUtils.currentLine=69795844;
 //BA.debugLineNum = 69795844;BA.debugLine="If Utils.isNullOrEmpty(asTagcode) Then Title = Sh";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._utils._isnullorempty /*boolean*/ (ba,_astagcode)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_title = parent._sharecode._actionsubnewtitle /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=69795845;
 //BA.debugLineNum = 69795845;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Title, Sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,parent._sharecode._option_sendemail /*String*/ ,ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=69795847;
 //BA.debugLineNum = 69795847;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=69795848;
 //BA.debugLineNum = 69795848;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=69795849;
 //BA.debugLineNum = 69795849;BA.debugLine="ApplDialog.SetSize(100%x,100%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=69795851;
 //BA.debugLineNum = 69795851;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=69795855;
 //BA.debugLineNum = 69795855;BA.debugLine="EmailSentOnNewAS = True";
__ref._emailsentonnewas /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=69795856;
 //BA.debugLineNum = 69795856;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreeditactionsdialog"), _sf);
this.state = 122;
return;
case 122:
//C
this.state = 13;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=69795857;
 //BA.debugLineNum = 69795857;BA.debugLine="pnl.LoadLayout(\"dialog_more_action2\")";
_pnl.LoadLayout("dialog_more_action2",ba);
RDebugUtils.currentLine=69795861;
 //BA.debugLineNum = 69795861;BA.debugLine="Dim GravityValue As Int = DBStructures.GetScriptC";
_gravityvalue = parent._dbstructures._getscriptcolumnintevc /*int*/ (ba,("SELECT a.points FROM dta_tasks_items_answers AS a\n"+"										 INNER JOIN dta_requests_values AS c ON (c.task_tagcode=a.task_tagcode\n"+"										 	AND c.item_tagcode=a.item_tagcode\n"+"										 	AND c.unique_key=a.unique_key\n"+"										 	AND c.tagcode=a.tagcode)\n"+"											WHERE c.task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"'\n"+"											And c.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"'\n"+"											And c.unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"'\n"+"											And c.tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ .trim()))+"'\n"+"											And c.repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"											And c.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"'\n"+"											And c.inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"'"),"points");
RDebugUtils.currentLine=69795874;
 //BA.debugLineNum = 69795874;BA.debugLine="dlgASAssign.Add(\"Cliente\")";
__ref._dlgasassign /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Cliente");
RDebugUtils.currentLine=69795875;
 //BA.debugLineNum = 69795875;BA.debugLine="For n=0 To AS_Status.Size-1";
if (true) break;

case 13:
//for
this.state = 16;
step15 = 1;
limit15 = (int) (__ref._as_status /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 15:
//C
this.state = 124;
RDebugUtils.currentLine=69795876;
 //BA.debugLineNum = 69795876;BA.debugLine="Dim itc As DB_ITC = AS_Status.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_status /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69795877;
 //BA.debugLineNum = 69795877;BA.debugLine="dlgASStatus.Add(itc.Title)";
__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=69795880;
 //BA.debugLineNum = 69795880;BA.debugLine="dlgASType.Color = Consts.ColorWhiteSilverLight";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795881;
 //BA.debugLineNum = 69795881;BA.debugLine="dlgASType.DropdownBackgroundColor = Consts.ColorW";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795882;
 //BA.debugLineNum = 69795882;BA.debugLine="dlgASType.Add(\"\")";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("");
RDebugUtils.currentLine=69795883;
 //BA.debugLineNum = 69795883;BA.debugLine="For n=0 To AS_Types.Size-1";
if (true) break;

case 17:
//for
this.state = 20;
step22 = 1;
limit22 = (int) (__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 19:
//C
this.state = 126;
RDebugUtils.currentLine=69795884;
 //BA.debugLineNum = 69795884;BA.debugLine="Dim itc As DB_ITC = AS_Types.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69795885;
 //BA.debugLineNum = 69795885;BA.debugLine="dlgASType.Add(itc.Title)";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=69795888;
 //BA.debugLineNum = 69795888;BA.debugLine="If (AS_Types.Size > 0) Then";

case 20:
//if
this.state = 35;
if ((__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=69795889;
 //BA.debugLineNum = 69795889;BA.debugLine="If (Utils.NNE(tagcodeTPA)) Then";
if (true) break;

case 23:
//if
this.state = 34;
if ((parent._utils._nne /*boolean*/ (ba,_tagcodetpa))) { 
this.state = 25;
}else {
this.state = 33;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=69795890;
 //BA.debugLineNum = 69795890;BA.debugLine="Dim nPos As Int = DBStructures.getITCTablePos(D";
_npos = parent._dbstructures._getitctablepos /*int*/ (ba,parent._dbstructures._sql_data_type_astypes /*String*/ ,_tagcodetpa);
RDebugUtils.currentLine=69795891;
 //BA.debugLineNum = 69795891;BA.debugLine="If (nPos > 0) Then";
if (true) break;

case 26:
//if
this.state = 31;
if ((_npos>0)) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=69795892;
 //BA.debugLineNum = 69795892;BA.debugLine="dlgASType.SelectedIndex = nPos";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_npos);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=69795894;
 //BA.debugLineNum = 69795894;BA.debugLine="dlgASType.SelectedIndex = 1";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (1));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=69795897;
 //BA.debugLineNum = 69795897;BA.debugLine="dlgASType.SelectedIndex = 1";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (1));
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
RDebugUtils.currentLine=69795901;
 //BA.debugLineNum = 69795901;BA.debugLine="dlgASPriority.Color = Consts.ColorWhiteSilverLigh";
__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795902;
 //BA.debugLineNum = 69795902;BA.debugLine="dlgASPriority.DropdownBackgroundColor = Consts.Co";
__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795903;
 //BA.debugLineNum = 69795903;BA.debugLine="For n=0 To AS_Priority.Size-1";
if (true) break;

case 36:
//for
this.state = 39;
step40 = 1;
limit40 = (int) (__ref._as_priority /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 38:
//C
this.state = 128;
RDebugUtils.currentLine=69795904;
 //BA.debugLineNum = 69795904;BA.debugLine="Dim itc As DB_ITC = AS_Priority.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_priority /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69795905;
 //BA.debugLineNum = 69795905;BA.debugLine="dlgASPriority.Add(itc.Title)";
__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=69795908;
 //BA.debugLineNum = 69795908;BA.debugLine="dlgASUrgency.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795909;
 //BA.debugLineNum = 69795909;BA.debugLine="If (IsNew) Then";
if (true) break;

case 40:
//if
this.state = 49;
if ((_isnew)) { 
this.state = 42;
}else {
this.state = 48;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=69795910;
 //BA.debugLineNum = 69795910;BA.debugLine="dlgASUrgency.DropdownBackgroundColor = Consts.Co";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795911;
 //BA.debugLineNum = 69795911;BA.debugLine="For n=0 To AS_Urgency.Size-1";
if (true) break;

case 43:
//for
this.state = 46;
step47 = 1;
limit47 = (int) (__ref._as_urgency /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 45:
//C
this.state = 130;
RDebugUtils.currentLine=69795912;
 //BA.debugLineNum = 69795912;BA.debugLine="Dim itc As DB_ITC = AS_Urgency.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_urgency /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69795913;
 //BA.debugLineNum = 69795913;BA.debugLine="dlgASUrgency.Add(itc.Title)";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;

case 46:
//C
this.state = 49;
;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=69795916;
 //BA.debugLineNum = 69795916;BA.debugLine="dlgASUrgency.Enabled = False";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(parent.__c.False);
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=69795919;
 //BA.debugLineNum = 69795919;BA.debugLine="dlgASUrgency.SelectedIndex = GravityValue";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_gravityvalue);
RDebugUtils.currentLine=69795921;
 //BA.debugLineNum = 69795921;BA.debugLine="dlgASSubject.Color = Consts.ColorWhiteSilverLight";
__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795922;
 //BA.debugLineNum = 69795922;BA.debugLine="dlgASSubject.Text = this.Title";
__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_this.Title /*String*/ ));
RDebugUtils.currentLine=69795923;
 //BA.debugLineNum = 69795923;BA.debugLine="dlgASEmails.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795924;
 //BA.debugLineNum = 69795924;BA.debugLine="dlgASEmails.Text = $\"\"$";
__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(("")));
RDebugUtils.currentLine=69795925;
 //BA.debugLineNum = 69795925;BA.debugLine="dlgASCCEmails.Color = Consts.ColorWhiteSilverLigh";
__ref._dlgasccemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795926;
 //BA.debugLineNum = 69795926;BA.debugLine="dlgASCCEmails.Text = $\"alertas@${ShareCode.APPL_H";
__ref._dlgasccemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(("alertas@"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"")));
RDebugUtils.currentLine=69795927;
 //BA.debugLineNum = 69795927;BA.debugLine="dlgASDueDate.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795929;
 //BA.debugLineNum = 69795929;BA.debugLine="Dim detailsText As String = DBStructures.GetScrip";
_detailstext = parent._dbstructures._getscriptcolumnstrevc /*String*/ (ba,("SELECT details from dta_actions WHERE 1=1\n"+"																	AND tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_astagcode))+"'\n"+"																	And iu_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"'\n"+"																	And request_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"'\n"+"																	And task_tagcode = '"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"'"),"details");
RDebugUtils.currentLine=69795937;
 //BA.debugLineNum = 69795937;BA.debugLine="dlgASDetails.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69795940;
 //BA.debugLineNum = 69795940;BA.debugLine="dlgASDetails.Text = $\"\"$";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(("")));
RDebugUtils.currentLine=69795942;
 //BA.debugLineNum = 69795942;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\") Th";
if (true) break;

case 50:
//if
this.state = 55;
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("edp"))) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
RDebugUtils.currentLine=69795943;
 //BA.debugLineNum = 69795943;BA.debugLine="dlgASDetails.Text = obs";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_obs));
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=69795945;
 //BA.debugLineNum = 69795945;BA.debugLine="dlgASDetails.Text = detailsText";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_detailstext));
 if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=69795949;
 //BA.debugLineNum = 69795949;BA.debugLine="ApplDialog.GetButton(DialogResponse.NEGATIVE).Ena";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.NEGATIVE).setEnabled(parent.__c.Not(parent._utils._int2bool /*boolean*/ (ba,_actionforce)));
RDebugUtils.currentLine=69795951;
 //BA.debugLineNum = 69795951;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreeditactionsdialog"), _sf);
this.state = 131;
return;
case 131:
//C
this.state = 56;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=69795952;
 //BA.debugLineNum = 69795952;BA.debugLine="If (res = DialogResponse.POSITIVE) Or (res = Dial";
if (true) break;

case 56:
//if
this.state = 121;
if ((_res==parent.__c.DialogResponse.POSITIVE) || (_res==parent.__c.DialogResponse.NEGATIVE)) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=69795953;
 //BA.debugLineNum = 69795953;BA.debugLine="Dim sendTheEmail As Int = Utils.Bool2Int(res = D";
_sendtheemail = parent._utils._bool2int /*int*/ (ba,_res==parent.__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=69795954;
 //BA.debugLineNum = 69795954;BA.debugLine="Dim dtupd As String = Utils.GetCurrDatetimeExt";
_dtupd = parent._utils._getcurrdatetimeext /*String*/ (ba);
RDebugUtils.currentLine=69795955;
 //BA.debugLineNum = 69795955;BA.debugLine="asTagcode = DBStructures.UpdateRequestASEVC(asTa";
_astagcode = parent._dbstructures._updaterequestasevc /*String*/ (ba,_astagcode,_this.Request /*String*/ ,_this.Action /*String*/ ,_this.Task /*String*/ ,_this.Item /*String*/ ,_this.UniqueKey /*String*/ ,_thetagcode,__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),parent._utils._getaspriority /*String*/ (ba,(int) (__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._utils._getasurgency /*String*/ (ba,(int) (__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._sharecode._sess_oper_user /*String*/ ,parent._utils._getasstatus /*String*/ (ba,(int) (__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._utils._getcurrdatetime /*String*/ (ba),BA.NumberToString(parent._utils._bool2int /*int*/ (ba,__ref._emailsentonnewas /*boolean*/ )),__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_this.RepeatCounter /*int*/ ,_this.RepeatItemCounter /*int*/ ,_this.repeatfieldcounter /*int*/ ,_dtupd,_tagcodetpa,_grouptpa,_obs,_sendtheemail);
RDebugUtils.currentLine=69795962;
 //BA.debugLineNum = 69795962;BA.debugLine="Dim sSQL As String = $\"SELECT DISTINCT a.actions";
_ssql = ("SELECT DISTINCT a.actions_tagcode,a.operation_type,a.typerequest_type,a.details,a.priority_tagcode,a.gravity_tagcode,\n"+"						a.team_tagcode, a.technical_tagcode, a.commercial_tagcode, a.close_date, a.due_date, a.send_email, a.email_sent,\n"+"						a.email_to, a.email_cc, a.updated_at, a.active,\n"+"						b.request_tagcode, b.title, b.details,\n"+"						c.status_id, c.entity_tagcode, c.object_tagcode,\n"+"						d.title_import, d.reference, ifnull(e.title,'') as technical_name,\n"+"						IFNULL(t1.tagdesc, '') AS priority_name, \n"+"						IFNULL(t2.tagdesc, '') AS gravity_name, \n"+"						IFNULL(t3.tagdesc, '') AS operation_name,  \n"+"						IFNULL(t4.tagdesc, '') AS status_name\n"+"						FROM dta_actions_items AS a\n"+"						INNER JOIN dta_actions AS b ON (b.tagcode=a.actions_tagcode)\n"+"						INNER JOIN dta_requests AS c ON (c.tagcode=b.request_tagcode)\n"+"						INNER JOIN dta_objects AS d ON (d.tagcode=c.object_tagcode)\n"+"						LEFT JOIN dta_technicals AS e ON (e.tagcode=b.technical_tagcode)\n"+"						LEFT JOIN type_prioritytypes AS t1 ON (t1.tagcode=a.priority_tagcode)\n"+"						LEFT JOIN type_gravitytypes AS t2 ON (t2.tagcode=a.gravity_tagcode)\n"+"						LEFT JOIN type_operationtypes AS t3 ON (t3.tagcode=a.operation_type)\n"+"						LEFT JOIN type_statustypes AS t4 ON (t4.id=c.status_id)\n"+"						WHERE a.actions_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_astagcode))+"'\n"+"						ORDER BY a.id DESC\n"+"						LIMIT 1");
RDebugUtils.currentLine=69795985;
 //BA.debugLineNum = 69795985;BA.debugLine="Dim newHTML As String = \"\"";
_newhtml = "";
RDebugUtils.currentLine=69795986;
 //BA.debugLineNum = 69795986;BA.debugLine="Dim RecordCount As Int = 0";
_recordcount = (int) (0);
RDebugUtils.currentLine=69795987;
 //BA.debugLineNum = 69795987;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.E";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=69795988;
 //BA.debugLineNum = 69795988;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 59:
//if
this.state = 62;
if (_record.getRowCount()>0) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=69795989;
 //BA.debugLineNum = 69795989;BA.debugLine="RecordCount = RecordCount + 1";
_recordcount = (int) (_recordcount+1);
RDebugUtils.currentLine=69795990;
 //BA.debugLineNum = 69795990;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=69795992;
 //BA.debugLineNum = 69795992;BA.debugLine="Dim actions_tagcode As String = Utils.ifnullore";
_actions_tagcode = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("actions_tagcode"),"");
RDebugUtils.currentLine=69795993;
 //BA.debugLineNum = 69795993;BA.debugLine="Dim request_tagcode As String = Utils.ifnullore";
_request_tagcode = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("request_tagcode"),"");
RDebugUtils.currentLine=69795994;
 //BA.debugLineNum = 69795994;BA.debugLine="Dim reference As String = Utils.ifnullorempty(R";
_reference = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("reference"),"");
RDebugUtils.currentLine=69795995;
 //BA.debugLineNum = 69795995;BA.debugLine="Dim technical_name As String = Utils.ifnullorem";
_technical_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("technical_name"),"");
RDebugUtils.currentLine=69795996;
 //BA.debugLineNum = 69795996;BA.debugLine="Dim updated_at As String = Utils.ifnullorempty(";
_updated_at = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("updated_at"),"");
RDebugUtils.currentLine=69795997;
 //BA.debugLineNum = 69795997;BA.debugLine="Dim details As String = Utils.ifnullorempty(Rec";
_details = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("details"),"");
RDebugUtils.currentLine=69795998;
 //BA.debugLineNum = 69795998;BA.debugLine="Dim status_name As String = Utils.ifnullorempty";
_status_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("status_name"),"");
RDebugUtils.currentLine=69795999;
 //BA.debugLineNum = 69795999;BA.debugLine="Dim due_date As String = Utils.ifnullorempty(Re";
_due_date = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("due_date"),"");
RDebugUtils.currentLine=69796000;
 //BA.debugLineNum = 69796000;BA.debugLine="Dim priority_name As String = Utils.ifnulloremp";
_priority_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("priority_name"),"");
RDebugUtils.currentLine=69796001;
 //BA.debugLineNum = 69796001;BA.debugLine="Dim gravity_name As String = Utils.ifnullorempt";
_gravity_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("gravity_name"),"");
RDebugUtils.currentLine=69796002;
 //BA.debugLineNum = 69796002;BA.debugLine="Dim operation_name As String = Utils.ifnullorem";
_operation_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("operation_name"),"");
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=69796005;
 //BA.debugLineNum = 69796005;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=69796007;
 //BA.debugLineNum = 69796007;BA.debugLine="If Utils.NNE(due_date) Then";
if (true) break;

case 63:
//if
this.state = 72;
if (parent._utils._nne /*boolean*/ (ba,_due_date)) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=69796008;
 //BA.debugLineNum = 69796008;BA.debugLine="Try";
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
RDebugUtils.currentLine=69796009;
 //BA.debugLineNum = 69796009;BA.debugLine="Dim ddate As Long = DateTime.DateParse(due_dat";
_ddate = parent.__c.DateTime.DateParse(_due_date);
RDebugUtils.currentLine=69796010;
 //BA.debugLineNum = 69796010;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=69796011;
 //BA.debugLineNum = 69796011;BA.debugLine="due_date = DateTime.Date(ddate)";
_due_date = parent.__c.DateTime.Date(_ddate);
 if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 0;
RDebugUtils.currentLine=69796013;
 //BA.debugLineNum = 69796013;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669796013",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 72;
this.catchState = 0;
;
 if (true) break;
;
RDebugUtils.currentLine=69796017;
 //BA.debugLineNum = 69796017;BA.debugLine="If Utils.NNE(due_date) Then";

case 72:
//if
this.state = 81;
if (parent._utils._nne /*boolean*/ (ba,_due_date)) { 
this.state = 74;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=69796018;
 //BA.debugLineNum = 69796018;BA.debugLine="Try";
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
RDebugUtils.currentLine=69796019;
 //BA.debugLineNum = 69796019;BA.debugLine="due_date = due_date.Replace(\"00:00:00\", \"\").Tr";
_due_date = _due_date.replace("00:00:00","").trim();
 if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 0;
RDebugUtils.currentLine=69796021;
 //BA.debugLineNum = 69796021;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669796021",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=69796026;
 //BA.debugLineNum = 69796026;BA.debugLine="Dim LOGO As String = \"\"";
_logo = "";
RDebugUtils.currentLine=69796027;
 //BA.debugLineNum = 69796027;BA.debugLine="Dim LOGOALT As String = \"\"";
_logoalt = "";
RDebugUtils.currentLine=69796028;
 //BA.debugLineNum = 69796028;BA.debugLine="Dim LOGOTITLE As String = \"\"";
_logotitle = "";
RDebugUtils.currentLine=69796029;
 //BA.debugLineNum = 69796029;BA.debugLine="Dim SUPORTE As String = \"\"";
_suporte = "";
RDebugUtils.currentLine=69796031;
 //BA.debugLineNum = 69796031;BA.debugLine="If (Utils.Int2Bool(sendTheEmail)) Then";
if (true) break;

case 82:
//if
this.state = 104;
if ((parent._utils._int2bool /*boolean*/ (ba,_sendtheemail))) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=69796033;
 //BA.debugLineNum = 69796033;BA.debugLine="LOGO = $\"data:image/jpeg;base64,${ShareCode.APP";
_logo = ("data:image/jpeg;base64,"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_main_logo_mini /*String*/ ))+"");
RDebugUtils.currentLine=69796034;
 //BA.debugLineNum = 69796034;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\")";
if (true) break;

case 85:
//if
this.state = 94;
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("edp"))) { 
this.state = 87;
}else 
{RDebugUtils.currentLine=69796038;
 //BA.debugLineNum = 69796038;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase = \"u";
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("uber"))) { 
this.state = 89;
}else 
{RDebugUtils.currentLine=69796042;
 //BA.debugLineNum = 69796042;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase.Cont";
if ((parent._sharecode._app_domain /*String*/ .toLowerCase().contains("grandative"))) { 
this.state = 91;
}else {
this.state = 93;
}}}
if (true) break;

case 87:
//C
this.state = 94;
RDebugUtils.currentLine=69796035;
 //BA.debugLineNum = 69796035;BA.debugLine="LOGOALT = \"EDP\"";
_logoalt = "EDP";
RDebugUtils.currentLine=69796036;
 //BA.debugLineNum = 69796036;BA.debugLine="LOGOTITLE = \"EDP Comercial \"";
_logotitle = "EDP Comercial ";
RDebugUtils.currentLine=69796037;
 //BA.debugLineNum = 69796037;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>Caso encontre alg";
_suporte = "<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com João Salsa (939395171) ou Pedro Fontoura (936113575).";
 if (true) break;

case 89:
//C
this.state = 94;
RDebugUtils.currentLine=69796039;
 //BA.debugLineNum = 69796039;BA.debugLine="LOGOALT = \"UBER\"";
_logoalt = "UBER";
RDebugUtils.currentLine=69796040;
 //BA.debugLineNum = 69796040;BA.debugLine="LOGOTITLE = \"UBER Desinfestações \"";
_logotitle = "UBER Desinfestações ";
RDebugUtils.currentLine=69796041;
 //BA.debugLineNum = 69796041;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
_suporte = "<b>Suporte</b><br>";
 if (true) break;

case 91:
//C
this.state = 94;
RDebugUtils.currentLine=69796043;
 //BA.debugLineNum = 69796043;BA.debugLine="LOGOALT = \"GrandAtive\"";
_logoalt = "GrandAtive";
RDebugUtils.currentLine=69796044;
 //BA.debugLineNum = 69796044;BA.debugLine="LOGOTITLE = \"GrandAtive \"";
_logotitle = "GrandAtive ";
RDebugUtils.currentLine=69796045;
 //BA.debugLineNum = 69796045;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
_suporte = "<b>Suporte</b><br>";
 if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=69796047;
 //BA.debugLineNum = 69796047;BA.debugLine="LOGOALT = $\"${ShareCode.APP_DOMAIN.ToUpperCase";
_logoalt = (""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ .toUpperCase()))+"");
RDebugUtils.currentLine=69796048;
 //BA.debugLineNum = 69796048;BA.debugLine="LOGOTITLE = $\"${ShareCode.APP_DOMAIN.ToUpperCa";
_logotitle = (""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ .toUpperCase()))+" ");
RDebugUtils.currentLine=69796049;
 //BA.debugLineNum = 69796049;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
_suporte = "<b>Suporte</b><br>";
 if (true) break;
;
RDebugUtils.currentLine=69796052;
 //BA.debugLineNum = 69796052;BA.debugLine="If RecordCount > 0 Then";

case 94:
//if
this.state = 97;
if (_recordcount>0) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=69796053;
 //BA.debugLineNum = 69796053;BA.debugLine="Dim newHTML As String = $\"<!DOCTYPE html>";
_newhtml = ("<!DOCTYPE html>\n"+"				<html xmlns=\"http://www.w3.org/1999/xhtml\"> <head>  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"+"				<title>"+parent.__c.SmartStringFormatter("",(Object)(_logotitle))+"</title>  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/></head><body style=\"margin: 0; padding: 0;\">\n"+"				<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"60%\">    <tr> <td bgcolor=\"f00000\">&nbsp;</td>\n"+"				</tr> <tr><td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				<img src=\""+parent.__c.SmartStringFormatter("",(Object)(_logo))+"\" alt=\""+parent.__c.SmartStringFormatter("",(Object)(_logoalt))+"\">"+parent.__c.SmartStringFormatter("",(Object)(_logotitle))+"</td></tr><tr>\n"+"				<td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				<p><b>ID de ação:</b> "+parent.__c.SmartStringFormatter("",(Object)(_actions_tagcode))+"</p><p><b>Nº Inspecção:</b> "+parent.__c.SmartStringFormatter("",(Object)(_request_tagcode))+" &nbsp&nbsp \n"+"				</p> <p> <b>Contrato:</b> "+parent.__c.SmartStringFormatter("",(Object)(_reference))+" </p> </td></tr>technical_tagcode<tr>\n"+"				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				<table border=\"1\" cellpadding=\"10\" > <tr><td style=\"width: 25%\">Modificado por</td>\n"+"				<td style=\"width: 75%\">"+parent.__c.SmartStringFormatter("",(Object)(_technical_name))+"</td> </tr><tr><td>Data de Modificação</td><td>"+parent.__c.SmartStringFormatter("",(Object)(_updated_at))+"</td>\n"+"				</tr><tr><td>Descrição da Intervenção</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_details))+"</td> </tr><tr><td>Estado da Ação</td><td>"+parent.__c.SmartStringFormatter("",(Object)(_status_name))+"</td>\n"+"				</tr> <tr> <td>Data Vencimento</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_due_date))+"</td> </tr> <tr> <td>Prioridade</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_priority_name))+"</td>\n"+"				</tr>  <tr> <td>Gravidade</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_gravity_name))+"</td>  \n"+"				</tr>gravity_name<tr> <td>Tipo Ação</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_operation_name))+"</td> </tr> </table> </td> </tr> <tr>\n"+"				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				"+parent.__c.SmartStringFormatter("",(Object)(_suporte))+"\n"+"				</td> </tr> <tr> <td bgcolor=\"f00000\">&nbsp;</td> </tr> </table> </body> </html>");
 if (true) break;

case 97:
//C
this.state = 98;
;
RDebugUtils.currentLine=69796074;
 //BA.debugLineNum = 69796074;BA.debugLine="Log(newHTML)";
parent.__c.LogImpl("669796074",_newhtml,0);
RDebugUtils.currentLine=69796075;
 //BA.debugLineNum = 69796075;BA.debugLine="Dim imgList As List";
_imglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69796076;
 //BA.debugLineNum = 69796076;BA.debugLine="imgList.initialize";
_imglist.Initialize();
RDebugUtils.currentLine=69796078;
 //BA.debugLineNum = 69796078;BA.debugLine="Try";
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
RDebugUtils.currentLine=69796079;
 //BA.debugLineNum = 69796079;BA.debugLine="Utils.SendEmailExt(dlgASEmails.Text, \"\", dlgAS";
parent._utils._sendemailext /*String*/ (ba,__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),"",__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_newhtml,_imglist);
 if (true) break;

case 102:
//C
this.state = 103;
this.catchState = 0;
RDebugUtils.currentLine=69796081;
 //BA.debugLineNum = 69796081;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669796081",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 103:
//C
this.state = 104;
this.catchState = 0;
;
RDebugUtils.currentLine=69796083;
 //BA.debugLineNum = 69796083;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreeditactionsdialog"),(int) (250));
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
RDebugUtils.currentLine=69796087;
 //BA.debugLineNum = 69796087;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69796088;
 //BA.debugLineNum = 69796088;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69796089;
 //BA.debugLineNum = 69796089;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69796090;
 //BA.debugLineNum = 69796090;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=69796091;
 //BA.debugLineNum = 69796091;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=69796092;
 //BA.debugLineNum = 69796092;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=69796093;
 //BA.debugLineNum = 69796093;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=69796094;
 //BA.debugLineNum = 69796094;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=69796095;
 //BA.debugLineNum = 69796095;BA.debugLine="params.Put(\"ASUITagcode\", theTagcode)";
_params.Put((Object)("ASUITagcode"),(Object)(_thetagcode));
RDebugUtils.currentLine=69796096;
 //BA.debugLineNum = 69796096;BA.debugLine="params.Put(\"ACLAExecuteAction\", asTagcode)";
_params.Put((Object)("ACLAExecuteAction"),(Object)(_astagcode));
RDebugUtils.currentLine=69796097;
 //BA.debugLineNum = 69796097;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69796098;
 //BA.debugLineNum = 69796098;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69796099;
 //BA.debugLineNum = 69796099;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
_params.Put((Object)("ACLARepeatField"),(Object)(_this.repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=69796100;
 //BA.debugLineNum = 69796100;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69796101;
 //BA.debugLineNum = 69796101;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69796102;
 //BA.debugLineNum = 69796102;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69796103;
 //BA.debugLineNum = 69796103;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69796104;
 //BA.debugLineNum = 69796104;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69796105;
 //BA.debugLineNum = 69796105;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69796106;
 //BA.debugLineNum = 69796106;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69796107;
 //BA.debugLineNum = 69796107;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/as/update");
RDebugUtils.currentLine=69796108;
 //BA.debugLineNum = 69796108;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 105:
//if
this.state = 110;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 107;
}else {
this.state = 109;
}if (true) break;

case 107:
//C
this.state = 110;
RDebugUtils.currentLine=69796109;
 //BA.debugLineNum = 69796109;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,_activ,_url,"",_this.Request /*String*/ );
 if (true) break;

case 109:
//C
this.state = 110;
RDebugUtils.currentLine=69796111;
 //BA.debugLineNum = 69796111;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69796112;
 //BA.debugLineNum = 69796112;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 110:
//C
this.state = 111;
;
RDebugUtils.currentLine=69796114;
 //BA.debugLineNum = 69796114;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreeditactionsdialog"),(int) (550));
this.state = 133;
return;
case 133:
//C
this.state = 111;
;
RDebugUtils.currentLine=69796116;
 //BA.debugLineNum = 69796116;BA.debugLine="Dim actiondatetime As String = Utils.GetCurrDate";
_actiondatetime = parent._utils._getcurrdatetime /*String*/ (ba);
RDebugUtils.currentLine=69796117;
 //BA.debugLineNum = 69796117;BA.debugLine="Dim emailsentdate As String = actiondatetime";
_emailsentdate = _actiondatetime;
RDebugUtils.currentLine=69796118;
 //BA.debugLineNum = 69796118;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69796119;
 //BA.debugLineNum = 69796119;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69796120;
 //BA.debugLineNum = 69796120;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69796127;
 //BA.debugLineNum = 69796127;BA.debugLine="params.Put(\"ASTagcode\", asTagcode)";
_params.Put((Object)("ASTagcode"),(Object)(_astagcode));
RDebugUtils.currentLine=69796128;
 //BA.debugLineNum = 69796128;BA.debugLine="params.Put(\"ASTitle\", dlgASSubject.Text)";
_params.Put((Object)("ASTitle"),(Object)(__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69796129;
 //BA.debugLineNum = 69796129;BA.debugLine="params.Put(\"ASDetails\", dlgASDetails.Text)";
_params.Put((Object)("ASDetails"),(Object)(__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69796130;
 //BA.debugLineNum = 69796130;BA.debugLine="params.Put(\"ASPriority\", Utils.getASPriority(dlg";
_params.Put((Object)("ASPriority"),(Object)(parent._utils._getaspriority /*String*/ (ba,(int) (__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1))));
RDebugUtils.currentLine=69796131;
 //BA.debugLineNum = 69796131;BA.debugLine="params.Put(\"ASUrgency\", Utils.getASUrgency(dlgAS";
_params.Put((Object)("ASUrgency"),(Object)(parent._utils._getasurgency /*String*/ (ba,(int) (__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1))));
RDebugUtils.currentLine=69796132;
 //BA.debugLineNum = 69796132;BA.debugLine="params.Put(\"ASAssigned\", ShareCode.SESS_OPER_Use";
_params.Put((Object)("ASAssigned"),(Object)(parent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=69796133;
 //BA.debugLineNum = 69796133;BA.debugLine="params.Put(\"ASAssignedType\", 0)";
_params.Put((Object)("ASAssignedType"),(Object)(0));
RDebugUtils.currentLine=69796134;
 //BA.debugLineNum = 69796134;BA.debugLine="params.Put(\"ASStatus\", Utils.getASStatus(dlgASSt";
_params.Put((Object)("ASStatus"),(Object)(parent._utils._getasstatus /*String*/ (ba,(int) (__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1))));
RDebugUtils.currentLine=69796135;
 //BA.debugLineNum = 69796135;BA.debugLine="params.Put(\"ASEmailDatetime\", emailsentdate)";
_params.Put((Object)("ASEmailDatetime"),(Object)(_emailsentdate));
RDebugUtils.currentLine=69796136;
 //BA.debugLineNum = 69796136;BA.debugLine="params.Put(\"ASEmailSent\", sendTheEmail) ', Utils";
_params.Put((Object)("ASEmailSent"),(Object)(_sendtheemail));
RDebugUtils.currentLine=69796137;
 //BA.debugLineNum = 69796137;BA.debugLine="params.Put(\"ASEmailTo\", dlgASEmails.Text)";
_params.Put((Object)("ASEmailTo"),(Object)(__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69796138;
 //BA.debugLineNum = 69796138;BA.debugLine="params.Put(\"ASEmailRelatedTask\", \"\")";
_params.Put((Object)("ASEmailRelatedTask"),(Object)(""));
RDebugUtils.currentLine=69796139;
 //BA.debugLineNum = 69796139;BA.debugLine="params.Put(\"ASEmailRelatedAction\", \"\")";
_params.Put((Object)("ASEmailRelatedAction"),(Object)(""));
RDebugUtils.currentLine=69796140;
 //BA.debugLineNum = 69796140;BA.debugLine="params.Put(\"ASDueDate\", dlgASDueDate.Text)";
_params.Put((Object)("ASDueDate"),(Object)(__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69796141;
 //BA.debugLineNum = 69796141;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69796142;
 //BA.debugLineNum = 69796142;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69796143;
 //BA.debugLineNum = 69796143;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
_params.Put((Object)("ACLARepeatField"),(Object)(_this.repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=69796144;
 //BA.debugLineNum = 69796144;BA.debugLine="params.Put(\"ACLACreation\", dtupd)";
_params.Put((Object)("ACLACreation"),(Object)(_dtupd));
RDebugUtils.currentLine=69796145;
 //BA.debugLineNum = 69796145;BA.debugLine="params.Put(\"ACLATagcodeTPA\", tagcodeTPA)";
_params.Put((Object)("ACLATagcodeTPA"),(Object)(_tagcodetpa));
RDebugUtils.currentLine=69796146;
 //BA.debugLineNum = 69796146;BA.debugLine="params.Put(\"ACLAGroupTPA\", groupTPA)";
_params.Put((Object)("ACLAGroupTPA"),(Object)(_grouptpa));
RDebugUtils.currentLine=69796147;
 //BA.debugLineNum = 69796147;BA.debugLine="params.Put(\"ACLANew\", Utils.Bool2Int(IsNew))";
_params.Put((Object)("ACLANew"),(Object)(parent._utils._bool2int /*int*/ (ba,_isnew)));
RDebugUtils.currentLine=69796148;
 //BA.debugLineNum = 69796148;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69796149;
 //BA.debugLineNum = 69796149;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69796150;
 //BA.debugLineNum = 69796150;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69796151;
 //BA.debugLineNum = 69796151;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69796152;
 //BA.debugLineNum = 69796152;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69796153;
 //BA.debugLineNum = 69796153;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69796154;
 //BA.debugLineNum = 69796154;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69796155;
 //BA.debugLineNum = 69796155;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/as/edit");
RDebugUtils.currentLine=69796156;
 //BA.debugLineNum = 69796156;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 111:
//if
this.state = 116;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 113;
}else {
this.state = 115;
}if (true) break;

case 113:
//C
this.state = 116;
RDebugUtils.currentLine=69796157;
 //BA.debugLineNum = 69796157;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,_activ,_url,"",_this.Request /*String*/ );
 if (true) break;

case 115:
//C
this.state = 116;
RDebugUtils.currentLine=69796159;
 //BA.debugLineNum = 69796159;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69796160;
 //BA.debugLineNum = 69796160;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 116:
//C
this.state = 117;
;
RDebugUtils.currentLine=69796162;
 //BA.debugLineNum = 69796162;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoreeditactionsdialog"),(int) (550));
this.state = 134;
return;
case 134:
//C
this.state = 117;
;
RDebugUtils.currentLine=69796165;
 //BA.debugLineNum = 69796165;BA.debugLine="CallSubDelayed3(activ, \"Return2CLAI\", this, 1)";
parent.__c.CallSubDelayed3(ba,_activ,"Return2CLAI",(Object)(_this),(Object)(1));
RDebugUtils.currentLine=69796166;
 //BA.debugLineNum = 69796166;BA.debugLine="If Not(parentDialog = Null) Then";
if (true) break;

case 117:
//if
this.state = 120;
if (parent.__c.Not(_parentdialog== null)) { 
this.state = 119;
}if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=69796167;
 //BA.debugLineNum = 69796167;BA.debugLine="parentDialog.CloseDialog(DialogResponse.POSITIV";
_parentdialog.CloseDialog(ba,parent.__c.DialogResponse.POSITIVE);
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
RDebugUtils.currentLine=69796170;
 //BA.debugLineNum = 69796170;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _getfastactiondialog(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem,String _title,String _quest,String _tagcode,int _actstate,boolean _disableall,xevolution.vrcg.devdemov2400.types._carobject _record) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "getfastactiondialog", false))
	 {Debug.delegate(ba, "getfastactiondialog", new Object[] {_activ,_claitem,_title,_quest,_tagcode,_actstate,_disableall,_record}); return;}
ResumableSub_GetFastActionDialog rsub = new ResumableSub_GetFastActionDialog(this,__ref,_activ,_claitem,_title,_quest,_tagcode,_actstate,_disableall,_record);
rsub.resume(ba, null);
}
public static class ResumableSub_GetFastActionDialog extends BA.ResumableSub {
public ResumableSub_GetFastActionDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem,String _title,String _quest,String _tagcode,int _actstate,boolean _disableall,xevolution.vrcg.devdemov2400.types._carobject _record) {
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
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem;
String _title;
String _quest;
String _tagcode;
int _actstate;
boolean _disableall;
xevolution.vrcg.devdemov2400.types._carobject _record;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _yesno_2_height = 0;
int _yesno_height = 0;
anywheresoftware.b4a.objects.PanelWrapper _p2 = null;
long _rkm = 0L;
anywheresoftware.b4a.objects.PanelWrapper _p1 = null;
int _res = 0;
int _istatus = 0;
String _currdate = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70123523;
 //BA.debugLineNum = 70123523;BA.debugLine="FastOptionCheck = actstate";
__ref._fastoptioncheck /*int*/  = _actstate;
RDebugUtils.currentLine=70123524;
 //BA.debugLineNum = 70123524;BA.debugLine="CurrentActivity = activ";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=70123525;
 //BA.debugLineNum = 70123525;BA.debugLine="CurrentCLAItem = CLAItem";
__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/  = _claitem;
RDebugUtils.currentLine=70123526;
 //BA.debugLineNum = 70123526;BA.debugLine="CurrentCLAItem.Answer = quest";
__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Answer /*String*/  = _quest;
RDebugUtils.currentLine=70123527;
 //BA.debugLineNum = 70123527;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, Sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,"",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=70123529;
 //BA.debugLineNum = 70123529;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=70123530;
 //BA.debugLineNum = 70123530;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=70123531;
 //BA.debugLineNum = 70123531;BA.debugLine="ApplDialog.SetSize(95%x, 80%x)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerXToCurrent((float) (80),ba));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=70123533;
 //BA.debugLineNum = 70123533;BA.debugLine="ApplDialog.SetSize(95%x,40%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (40),ba));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=70123536;
 //BA.debugLineNum = 70123536;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getfastactiondialog"), _sf);
this.state = 45;
return;
case 45:
//C
this.state = 7;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=70123539;
 //BA.debugLineNum = 70123539;BA.debugLine="pnl.LoadLayout(\"CLA_ITEM_TaskSimple\")";
_pnl.LoadLayout("CLA_ITEM_TaskSimple",ba);
RDebugUtils.currentLine=70123540;
 //BA.debugLineNum = 70123540;BA.debugLine="pnl.Tag = tagcode";
_pnl.setTag((Object)(_tagcode));
RDebugUtils.currentLine=70123542;
 //BA.debugLineNum = 70123542;BA.debugLine="IsFastOptionCheck = True";
__ref._isfastoptioncheck /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=70123543;
 //BA.debugLineNum = 70123543;BA.debugLine="ObjectTagcode = Record.obj 'Record.GetString(\"obj";
__ref._objecttagcode /*String*/  = _record.obj /*String*/ ;
RDebugUtils.currentLine=70123546;
 //BA.debugLineNum = 70123546;BA.debugLine="Dim YesNO_2_Height As Int = 80dip";
_yesno_2_height = parent.__c.DipToCurrent((int) (80));
RDebugUtils.currentLine=70123547;
 //BA.debugLineNum = 70123547;BA.debugLine="Dim YesNO_Height As Int = 60dip";
_yesno_height = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=70123548;
 //BA.debugLineNum = 70123548;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=70123549;
 //BA.debugLineNum = 70123549;BA.debugLine="YesNO_2_Height = 90dip";
_yesno_2_height = parent.__c.DipToCurrent((int) (90));
RDebugUtils.currentLine=70123550;
 //BA.debugLineNum = 70123550;BA.debugLine="YesNO_Height = 90dip";
_yesno_height = parent.__c.DipToCurrent((int) (90));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=70123553;
 //BA.debugLineNum = 70123553;BA.debugLine="Dim p2 As Panel";
_p2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=70123554;
 //BA.debugLineNum = 70123554;BA.debugLine="p2.Initialize(\"CLALineClick\")";
_p2.Initialize(ba,"CLALineClick");
RDebugUtils.currentLine=70123556;
 //BA.debugLineNum = 70123556;BA.debugLine="CurrentActivity.AddView(p2, 0, 0, 100%x, YesNO_2_";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p2.getObject()),(int) (0),(int) (0),parent.__c.PerXToCurrent((float) (100),ba),_yesno_2_height);
RDebugUtils.currentLine=70123557;
 //BA.debugLineNum = 70123557;BA.debugLine="p2.LoadLayout(\"CLA_ITEM_TaskSimple_YesNO_2\")";
_p2.LoadLayout("CLA_ITEM_TaskSimple_YesNO_2",ba);
RDebugUtils.currentLine=70123558;
 //BA.debugLineNum = 70123558;BA.debugLine="p2.RemoveView";
_p2.RemoveView();
RDebugUtils.currentLine=70123559;
 //BA.debugLineNum = 70123559;BA.debugLine="p2.Tag = tagcode";
_p2.setTag((Object)(_tagcode));
RDebugUtils.currentLine=70123560;
 //BA.debugLineNum = 70123560;BA.debugLine="CLAItemLabel.Text = \"Introduza/actualize os Kilom";
__ref._claitemlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Introduza/actualize os Kilometros"));
RDebugUtils.currentLine=70123561;
 //BA.debugLineNum = 70123561;BA.debugLine="Dim rKm As Long = Record.km ' Record.GetInt(\"kilo";
_rkm = _record.km /*long*/ ;
RDebugUtils.currentLine=70123562;
 //BA.debugLineNum = 70123562;BA.debugLine="CLAItemEditValue.EditText.InputType = CLAItemEdit";
__ref._claitemeditvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().setInputType(__ref._claitemeditvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getEditText().INPUT_TYPE_NUMBERS);
RDebugUtils.currentLine=70123563;
 //BA.debugLineNum = 70123563;BA.debugLine="CLAItemEditValue.Text = rKm";
__ref._claitemeditvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(_rkm));
RDebugUtils.currentLine=70123564;
 //BA.debugLineNum = 70123564;BA.debugLine="CLAItemsList.Add(p2, \"\")";
__ref._claitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p2.getObject())),(Object)(""));
RDebugUtils.currentLine=70123566;
 //BA.debugLineNum = 70123566;BA.debugLine="Dim p1 As Panel";
_p1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=70123567;
 //BA.debugLineNum = 70123567;BA.debugLine="p1.Initialize(\"CLALineClick\")";
_p1.Initialize(ba,"CLALineClick");
RDebugUtils.currentLine=70123568;
 //BA.debugLineNum = 70123568;BA.debugLine="CurrentActivity.AddView(p1, 0, 0, 100%x, YesNO_He";
__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p1.getObject()),(int) (0),(int) (0),parent.__c.PerXToCurrent((float) (100),ba),_yesno_height);
RDebugUtils.currentLine=70123569;
 //BA.debugLineNum = 70123569;BA.debugLine="p1.LoadLayout(\"CLA_ITEM_TaskSimple_YesNO\")";
_p1.LoadLayout("CLA_ITEM_TaskSimple_YesNO",ba);
RDebugUtils.currentLine=70123570;
 //BA.debugLineNum = 70123570;BA.debugLine="p1.RemoveView";
_p1.RemoveView();
RDebugUtils.currentLine=70123571;
 //BA.debugLineNum = 70123571;BA.debugLine="p1.Tag = tagcode";
_p1.setTag((Object)(_tagcode));
RDebugUtils.currentLine=70123572;
 //BA.debugLineNum = 70123572;BA.debugLine="CLAItem_G1.Text = quest";
__ref._claitem_g1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_quest));
RDebugUtils.currentLine=70123573;
 //BA.debugLineNum = 70123573;BA.debugLine="If (actstate = 1) Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((_actstate==1)) { 
this.state = 13;
}else 
{RDebugUtils.currentLine=70123575;
 //BA.debugLineNum = 70123575;BA.debugLine="Else If (actstate = 2) Then";
if ((_actstate==2)) { 
this.state = 15;
}}
if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=70123574;
 //BA.debugLineNum = 70123574;BA.debugLine="CLAItemButton_1.State = 1";
__ref._claitembutton_1 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setstate /*int*/ (null,(int) (1));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=70123576;
 //BA.debugLineNum = 70123576;BA.debugLine="CLAItemButton_2.State = 1";
__ref._claitembutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setstate /*int*/ (null,(int) (1));
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=70123578;
 //BA.debugLineNum = 70123578;BA.debugLine="CLAItemButton_1.Tag = tagcode";
__ref._claitembutton_1 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(_tagcode));
RDebugUtils.currentLine=70123579;
 //BA.debugLineNum = 70123579;BA.debugLine="CLAItemButton_2.Tag = tagcode";
__ref._claitembutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._settag /*Object*/ (null,(Object)(_tagcode));
RDebugUtils.currentLine=70123580;
 //BA.debugLineNum = 70123580;BA.debugLine="If (disableAll) Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((_disableall)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=70123581;
 //BA.debugLineNum = 70123581;BA.debugLine="CLAItemButton_1.Enabled = False";
__ref._claitembutton_1 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setenabled /*boolean*/ (null,parent.__c.False);
RDebugUtils.currentLine=70123582;
 //BA.debugLineNum = 70123582;BA.debugLine="CLAItemButton_2.Enabled = False";
__ref._claitembutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._setenabled /*boolean*/ (null,parent.__c.False);
 if (true) break;
;
RDebugUtils.currentLine=70123584;
 //BA.debugLineNum = 70123584;BA.debugLine="If (CLAItem.Value = \"GET_MORE_ACTIONS\") Then";

case 20:
//if
this.state = 23;
if (((_claitem.Value /*String*/ ).equals("GET_MORE_ACTIONS"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=70123585;
 //BA.debugLineNum = 70123585;BA.debugLine="listButMoreActionInner_Click";
__ref._listbutmoreactioninner_click /*String*/ (null);
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=70123587;
 //BA.debugLineNum = 70123587;BA.debugLine="CLAItemsList.Add(p1, \"\")";
__ref._claitemslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p1.getObject())),(Object)(""));
RDebugUtils.currentLine=70123590;
 //BA.debugLineNum = 70123590;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getfastactiondialog"), _sf);
this.state = 46;
return;
case 46:
//C
this.state = 24;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=70123591;
 //BA.debugLineNum = 70123591;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 24:
//if
this.state = 44;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=70123593;
 //BA.debugLineNum = 70123593;BA.debugLine="Dim istatus As Int = 0";
_istatus = (int) (0);
RDebugUtils.currentLine=70123594;
 //BA.debugLineNum = 70123594;BA.debugLine="If (CLAItemButton_1.State = 1) Then";
if (true) break;

case 27:
//if
this.state = 32;
if ((__ref._claitembutton_1 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._getstate /*int*/ (null)==1)) { 
this.state = 29;
}else 
{RDebugUtils.currentLine=70123596;
 //BA.debugLineNum = 70123596;BA.debugLine="else if (CLAItemButton_2.State = 1) Then";
if ((__ref._claitembutton_2 /*xevolution.vrcg.devdemov2400.b4xstatebutton*/ ._getstate /*int*/ (null)==1)) { 
this.state = 31;
}}
if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=70123595;
 //BA.debugLineNum = 70123595;BA.debugLine="istatus = 1";
_istatus = (int) (1);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=70123597;
 //BA.debugLineNum = 70123597;BA.debugLine="istatus = 2";
_istatus = (int) (2);
 if (true) break;
;
RDebugUtils.currentLine=70123600;
 //BA.debugLineNum = 70123600;BA.debugLine="Try";

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
RDebugUtils.currentLine=70123601;
 //BA.debugLineNum = 70123601;BA.debugLine="Dim currdate As String = Utils.GetCurrentDate";
_currdate = parent._utils._getcurrentdate /*String*/ (ba);
RDebugUtils.currentLine=70123602;
 //BA.debugLineNum = 70123602;BA.debugLine="Dim sSQL As String = $\"update alerts set kilome";
_ssql = ("update alerts set kilometers="+parent.__c.SmartStringFormatter("",(Object)(__ref._claitemeditvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()))+", verification_date='"+parent.__c.SmartStringFormatter("",(Object)(_currdate))+"', status_id=2, itemstatus="+parent.__c.SmartStringFormatter("",(Object)(_istatus))+", notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._master_obs /*String*/ ))+"', image='"+parent.__c.SmartStringFormatter("",(Object)(__ref._master_image /*String*/ ))+"' where tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=70123603;
 //BA.debugLineNum = 70123603;BA.debugLine="Starter.LocalSQL.ExecNonQuery(sSQL)";
parent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
RDebugUtils.currentLine=70123605;
 //BA.debugLineNum = 70123605;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("670123605",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
;
RDebugUtils.currentLine=70123608;
 //BA.debugLineNum = 70123608;BA.debugLine="Dim currdate As String = Utils.GetCurrentDate";
_currdate = parent._utils._getcurrentdate /*String*/ (ba);
RDebugUtils.currentLine=70123609;
 //BA.debugLineNum = 70123609;BA.debugLine="Dim sSQL As String = $\"update dta_objects_fields";
_ssql = ("update dta_objects_fields set value="+parent.__c.SmartStringFormatter("",(Object)(__ref._claitemeditvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()))+" where object_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_record.obj /*String*/ ))+"' and field_tagcode='FIELD_KM'");
RDebugUtils.currentLine=70123610;
 //BA.debugLineNum = 70123610;BA.debugLine="Utils.SaveSQLToLog(\"GetFastActionDialog\",sSQL, \"";
parent._utils._savesqltolog /*boolean*/ (ba,"GetFastActionDialog",_ssql,"");
RDebugUtils.currentLine=70123612;
 //BA.debugLineNum = 70123612;BA.debugLine="Dim sSQL As String = $\"update dta_objects_fields";
_ssql = ("update dta_objects_fields set value="+parent.__c.SmartStringFormatter("",(Object)(_currdate))+" where object_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_record.obj /*String*/ ))+"' and field_tagcode='FIELD_DATAKM'");
RDebugUtils.currentLine=70123613;
 //BA.debugLineNum = 70123613;BA.debugLine="Utils.SaveSQLToLog(\"GetFastActionDialog\",sSQL, \"";
parent._utils._savesqltolog /*boolean*/ (ba,"GetFastActionDialog",_ssql,"");
RDebugUtils.currentLine=70123617;
 //BA.debugLineNum = 70123617;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=70123618;
 //BA.debugLineNum = 70123618;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=70123619;
 //BA.debugLineNum = 70123619;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=70123620;
 //BA.debugLineNum = 70123620;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=70123621;
 //BA.debugLineNum = 70123621;BA.debugLine="params.Put(\"ACLARequest\", CLAItem.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_claitem.Request /*String*/ ));
RDebugUtils.currentLine=70123622;
 //BA.debugLineNum = 70123622;BA.debugLine="params.Put(\"ACLAAction\", CLAItem.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_claitem.Action /*String*/ ));
RDebugUtils.currentLine=70123623;
 //BA.debugLineNum = 70123623;BA.debugLine="params.Put(\"ACLATask\", CLAItem.Task)";
_params.Put((Object)("ACLATask"),(Object)(_claitem.Task /*String*/ ));
RDebugUtils.currentLine=70123624;
 //BA.debugLineNum = 70123624;BA.debugLine="params.Put(\"ACLAItem\", CLAItem.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_claitem.Item /*String*/ ));
RDebugUtils.currentLine=70123625;
 //BA.debugLineNum = 70123625;BA.debugLine="params.Put(\"ACLAObject\", ObjectTagcode)";
_params.Put((Object)("ACLAObject"),(Object)(__ref._objecttagcode /*String*/ ));
RDebugUtils.currentLine=70123626;
 //BA.debugLineNum = 70123626;BA.debugLine="params.Put(\"ACLAKeyKM\", $\"${CLAItemEditValue.Tex";
_params.Put((Object)("ACLAKeyKM"),(Object)((""+parent.__c.SmartStringFormatter("",(Object)(__ref._claitemeditvalue /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()))+"")));
RDebugUtils.currentLine=70123627;
 //BA.debugLineNum = 70123627;BA.debugLine="params.Put(\"ACLAKeyDate\", currdate)";
_params.Put((Object)("ACLAKeyDate"),(Object)(_currdate));
RDebugUtils.currentLine=70123628;
 //BA.debugLineNum = 70123628;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=70123629;
 //BA.debugLineNum = 70123629;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=70123630;
 //BA.debugLineNum = 70123630;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=70123631;
 //BA.debugLineNum = 70123631;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=70123632;
 //BA.debugLineNum = 70123632;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=70123633;
 //BA.debugLineNum = 70123633;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=70123634;
 //BA.debugLineNum = 70123634;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=70123639;
 //BA.debugLineNum = 70123639;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/cla-md/update");
RDebugUtils.currentLine=70123640;
 //BA.debugLineNum = 70123640;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 38:
//if
this.state = 43;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=70123641;
 //BA.debugLineNum = 70123641;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLAItem.R";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_claitem.Request /*String*/ );
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=70123643;
 //BA.debugLineNum = 70123643;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_claitem.Request /*String*/ .trim(),_claitem.Task /*String*/ .trim(),_claitem.Item /*String*/ .trim());
RDebugUtils.currentLine=70123644;
 //BA.debugLineNum = 70123644;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=70123646;
 //BA.debugLineNum = 70123646;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getfastactiondialog"),(int) (250));
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
RDebugUtils.currentLine=70123664;
 //BA.debugLineNum = 70123664;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _listbutmoreactioninner_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "listbutmoreactioninner_click", false))
	 {return ((String) Debug.delegate(ba, "listbutmoreactioninner_click", null));}
String _filename = "";
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Sub listButMoreActionInner_Click";
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="Dim filename As String = $\"Base_${ObjectTagcode}.";
_filename = ("Base_"+__c.SmartStringFormatter("",(Object)(__ref._objecttagcode /*String*/ ))+".png");
RDebugUtils.currentLine=70189059;
 //BA.debugLineNum = 70189059;BA.debugLine="If File.Exists(Starter.InternalFolder, filename)";
if (__c.File.Exists(_starter._internalfolder /*String*/ ,_filename)) { 
RDebugUtils.currentLine=70189060;
 //BA.debugLineNum = 70189060;BA.debugLine="Try";
try {RDebugUtils.currentLine=70189061;
 //BA.debugLineNum = 70189061;BA.debugLine="File.Delete(Starter.InternalFolder, filename)";
__c.File.Delete(_starter._internalfolder /*String*/ ,_filename);
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=70189063;
 //BA.debugLineNum = 70189063;BA.debugLine="Log(LastException)";
__c.LogImpl("670189063",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
RDebugUtils.currentLine=70189067;
 //BA.debugLineNum = 70189067;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=70189068;
 //BA.debugLineNum = 70189068;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=70189069;
 //BA.debugLineNum = 70189069;BA.debugLine="Filter.GetMoreActionsDialog(CurrentActivity, \"Use";
_filter._getmoreactionsdialog /*void*/ (null,__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,(Object)("User"),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,(int) (0),__ref._objecttagcode /*String*/ ,"",(int) (0),__ref._pressedanswertagcode /*String*/ ,"","",(int) (0));
RDebugUtils.currentLine=70189070;
 //BA.debugLineNum = 70189070;BA.debugLine="End Sub";
return "";
}
public String  _updatethisimagefile2db(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "updatethisimagefile2db", false))
	 {return ((String) Debug.delegate(ba, "updatethisimagefile2db", new Object[] {_filename,_id}));}
String _ssql = "";
RDebugUtils.currentLine=66650112;
 //BA.debugLineNum = 66650112;BA.debugLine="Sub updateThisImageFile2DB(filename As String, id";
RDebugUtils.currentLine=66650113;
 //BA.debugLineNum = 66650113;BA.debugLine="Dim sSQL As String = $\"update dta_requests_values";
_ssql = ("update dta_requests_values_images set imagename='"+__c.SmartStringFormatter("",(Object)(_filename))+"' where id="+__c.SmartStringFormatter("",(Object)(_id))+"");
RDebugUtils.currentLine=66650114;
 //BA.debugLineNum = 66650114;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=66650115;
 //BA.debugLineNum = 66650115;BA.debugLine="End Sub";
return "";
}
public void  _takephoto_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takephoto_click", false))
	 {Debug.delegate(ba, "takephoto_click", null); return;}
ResumableSub_takePhoto_Click rsub = new ResumableSub_takePhoto_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_takePhoto_Click extends BA.ResumableSub {
public ResumableSub_takePhoto_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68943879;
 //BA.debugLineNum = 68943879;BA.debugLine="If (Utils.NNE( CurrentCLAItem.Tagcode)) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils._nne /*boolean*/ (ba,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=68943880;
 //BA.debugLineNum = 68943880;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=68943889;
 //BA.debugLineNum = 68943889;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=68943897;
 //BA.debugLineNum = 68943897;BA.debugLine="Utils.SaveSQLToLog(\"takePhoto_Click\",sSQL, Curren";
parent._utils._savesqltolog /*boolean*/ (ba,"takePhoto_Click",_ssql,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
RDebugUtils.currentLine=68943900;
 //BA.debugLineNum = 68943900;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68943901;
 //BA.debugLineNum = 68943901;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=68943902;
 //BA.debugLineNum = 68943902;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=68943903;
 //BA.debugLineNum = 68943903;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=68943904;
 //BA.debugLineNum = 68943904;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
_params.Put((Object)("ACLRequest"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ ));
RDebugUtils.currentLine=68943905;
 //BA.debugLineNum = 68943905;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
_params.Put((Object)("ACLAction"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ));
RDebugUtils.currentLine=68943906;
 //BA.debugLineNum = 68943906;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
_params.Put((Object)("ACLTask"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ));
RDebugUtils.currentLine=68943907;
 //BA.debugLineNum = 68943907;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
_params.Put((Object)("ACLItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ));
RDebugUtils.currentLine=68943908;
 //BA.debugLineNum = 68943908;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.UniqueK";
_params.Put((Object)("ACLUniqueKey"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ));
RDebugUtils.currentLine=68943909;
 //BA.debugLineNum = 68943909;BA.debugLine="params.Put(\"ACLTagcode\", CurrentCLAItem.Tagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ));
RDebugUtils.currentLine=68943910;
 //BA.debugLineNum = 68943910;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=68943911;
 //BA.debugLineNum = 68943911;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repea";
_params.Put((Object)("ACLAReqCounter"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ));
RDebugUtils.currentLine=68943912;
 //BA.debugLineNum = 68943912;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repea";
_params.Put((Object)("ACLARepeatItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=68943913;
 //BA.debugLineNum = 68943913;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=68943914;
 //BA.debugLineNum = 68943914;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=68943915;
 //BA.debugLineNum = 68943915;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=68943916;
 //BA.debugLineNum = 68943916;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=68943917;
 //BA.debugLineNum = 68943917;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=68943918;
 //BA.debugLineNum = 68943918;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=68943919;
 //BA.debugLineNum = 68943919;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=68943920;
 //BA.debugLineNum = 68943920;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=68943921;
 //BA.debugLineNum = 68943921;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=68943922;
 //BA.debugLineNum = 68943922;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCLA";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=68943924;
 //BA.debugLineNum = 68943924;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=68943925;
 //BA.debugLineNum = 68943925;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=68943927;
 //BA.debugLineNum = 68943927;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "takephoto_click"),(int) (250));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=68943929;
 //BA.debugLineNum = 68943929;BA.debugLine="CallSubDelayed3(CameraActivity2, \"StartCamera2\",";
parent.__c.CallSubDelayed3(ba,(Object)(parent._cameraactivity2.getObject()),"StartCamera2",parent,(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ));
RDebugUtils.currentLine=68943931;
 //BA.debugLineNum = 68943931;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _takeasclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _tagcodetpa,String _grouptpa,int _actionforce) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takeasclick", false))
	 {Debug.delegate(ba, "takeasclick", new Object[] {_tagcodetpa,_grouptpa,_actionforce}); return;}
ResumableSub_takeASClick rsub = new ResumableSub_takeASClick(this,__ref,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(ba, null);
}
public static class ResumableSub_takeASClick extends BA.ResumableSub {
public ResumableSub_takeASClick(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _tagcodetpa,String _grouptpa,int _actionforce) {
this.parent = parent;
this.__ref = __ref;
this._tagcodetpa = _tagcodetpa;
this._grouptpa = _grouptpa;
this._actionforce = _actionforce;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _tagcodetpa;
String _grouptpa;
int _actionforce;
String _thetagcode = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="Dim theTagcode As String = CurrentCLAItem.Tagcode";
_thetagcode = __ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ .trim();
RDebugUtils.currentLine=67633156;
 //BA.debugLineNum = 67633156;BA.debugLine="If Utils.NNE(PressedAnswerTagCode) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._utils._nne /*boolean*/ (ba,__ref._pressedanswertagcode /*String*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=67633157;
 //BA.debugLineNum = 67633157;BA.debugLine="theTagcode = PressedAnswerTagCode";
_thetagcode = __ref._pressedanswertagcode /*String*/ ;
 if (true) break;
;
RDebugUtils.currentLine=67633160;
 //BA.debugLineNum = 67633160;BA.debugLine="If (Utils.NNE(theTagcode)) Then";

case 4:
//if
this.state = 9;
if ((parent._utils._nne /*boolean*/ (ba,_thetagcode))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=67633161;
 //BA.debugLineNum = 67633161;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_thetagcode))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=67633171;
 //BA.debugLineNum = 67633171;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=67633180;
 //BA.debugLineNum = 67633180;BA.debugLine="Utils.SaveSQLToLog(\"takeAS_Click\",sSQL, CurrentCL";
parent._utils._savesqltolog /*boolean*/ (ba,"takeAS_Click",_ssql,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
RDebugUtils.currentLine=67633183;
 //BA.debugLineNum = 67633183;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67633184;
 //BA.debugLineNum = 67633184;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=67633185;
 //BA.debugLineNum = 67633185;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=67633186;
 //BA.debugLineNum = 67633186;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=67633187;
 //BA.debugLineNum = 67633187;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
_params.Put((Object)("ACLRequest"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ ));
RDebugUtils.currentLine=67633188;
 //BA.debugLineNum = 67633188;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
_params.Put((Object)("ACLAction"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ));
RDebugUtils.currentLine=67633189;
 //BA.debugLineNum = 67633189;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
_params.Put((Object)("ACLTask"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ));
RDebugUtils.currentLine=67633190;
 //BA.debugLineNum = 67633190;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
_params.Put((Object)("ACLItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ));
RDebugUtils.currentLine=67633191;
 //BA.debugLineNum = 67633191;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.UniqueK";
_params.Put((Object)("ACLUniqueKey"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ));
RDebugUtils.currentLine=67633192;
 //BA.debugLineNum = 67633192;BA.debugLine="params.Put(\"ACLTagcode\", theTagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(_thetagcode));
RDebugUtils.currentLine=67633193;
 //BA.debugLineNum = 67633193;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=67633194;
 //BA.debugLineNum = 67633194;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repea";
_params.Put((Object)("ACLAReqCounter"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ));
RDebugUtils.currentLine=67633195;
 //BA.debugLineNum = 67633195;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repea";
_params.Put((Object)("ACLARepeatItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=67633196;
 //BA.debugLineNum = 67633196;BA.debugLine="params.Put(\"ACLARepeatField\", CurrentCLAItem.repe";
_params.Put((Object)("ACLARepeatField"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=67633197;
 //BA.debugLineNum = 67633197;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=67633198;
 //BA.debugLineNum = 67633198;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=67633199;
 //BA.debugLineNum = 67633199;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=67633200;
 //BA.debugLineNum = 67633200;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=67633201;
 //BA.debugLineNum = 67633201;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=67633202;
 //BA.debugLineNum = 67633202;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=67633203;
 //BA.debugLineNum = 67633203;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=67633205;
 //BA.debugLineNum = 67633205;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=67633206;
 //BA.debugLineNum = 67633206;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
if (true) break;

case 10:
//if
this.state = 15;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=67633207;
 //BA.debugLineNum = 67633207;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCLA";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=67633209;
 //BA.debugLineNum = 67633209;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=67633210;
 //BA.debugLineNum = 67633210;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=67633212;
 //BA.debugLineNum = 67633212;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "takeasclick"),(int) (250));
this.state = 16;
return;
case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=67633214;
 //BA.debugLineNum = 67633214;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=67633215;
 //BA.debugLineNum = 67633215;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=67633217;
 //BA.debugLineNum = 67633217;BA.debugLine="Filter.GetMoreNewActionsDialog(ThisActivityName_T";
_filter._getmorenewactionsdialog /*void*/ (null,__ref._thisactivityname_tasklistdialog /*Object*/ ,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,__ref._currenttagcode /*String*/ ,__ref._currentitemnotestext /*String*/ ,parent.__c.True,_thetagcode,__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ,_tagcodetpa,_grouptpa,_actionforce);
RDebugUtils.currentLine=67633219;
 //BA.debugLineNum = 67633219;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _takeas_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takeas_click", false))
	 {return ((String) Debug.delegate(ba, "takeas_click", null));}
RDebugUtils.currentLine=67567616;
 //BA.debugLineNum = 67567616;BA.debugLine="Sub takeAS_Click";
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="takeASClick(\"\", \"\",0)";
__ref._takeasclick /*void*/ (null,"","",(int) (0));
RDebugUtils.currentLine=67567618;
 //BA.debugLineNum = 67567618;BA.debugLine="End Sub";
return "";
}
public String  _takesignature_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takesignature_click", false))
	 {return ((String) Debug.delegate(ba, "takesignature_click", null));}
RDebugUtils.currentLine=66912256;
 //BA.debugLineNum = 66912256;BA.debugLine="Sub takeSignature_Click";
RDebugUtils.currentLine=66912257;
 //BA.debugLineNum = 66912257;BA.debugLine="SignPanelView.Visible = True";
__ref._signpanelview /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=66912258;
 //BA.debugLineNum = 66912258;BA.debugLine="PanelSignature.Visible = True";
__ref._panelsignature /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=66912259;
 //BA.debugLineNum = 66912259;BA.debugLine="takeSignature.Visible = False";
__ref._takesignature /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=66912260;
 //BA.debugLineNum = 66912260;BA.debugLine="SignPerson.Text = \"Responsável\"";
__ref._signperson /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Responsável"));
RDebugUtils.currentLine=66912261;
 //BA.debugLineNum = 66912261;BA.debugLine="SignatureCapture.Clear(Signature)";
_signaturecapture._clear /*String*/ (ba,__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ );
RDebugUtils.currentLine=66912263;
 //BA.debugLineNum = 66912263;BA.debugLine="SignCanvas.Initialize(SignPanel)";
__ref._signcanvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._signpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=66912265;
 //BA.debugLineNum = 66912265;BA.debugLine="Signature.Initialize";
__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ .Initialize();
RDebugUtils.currentLine=66912266;
 //BA.debugLineNum = 66912266;BA.debugLine="Signature.Canvas = SignCanvas";
__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ .Canvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/  = __ref._signcanvas /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ;
RDebugUtils.currentLine=66912267;
 //BA.debugLineNum = 66912267;BA.debugLine="Signature.Panel = SignPanel";
__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ .Panel /*anywheresoftware.b4a.objects.PanelWrapper*/  = __ref._signpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=66912268;
 //BA.debugLineNum = 66912268;BA.debugLine="Signature.SignatureColor = Colors.Black";
__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ .SignatureColor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=66912269;
 //BA.debugLineNum = 66912269;BA.debugLine="Signature.SignatureWidth = 3dip";
__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ .SignatureWidth /*int*/  = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=66912270;
 //BA.debugLineNum = 66912270;BA.debugLine="End Sub";
return "";
}
public void  _getmoresendemaildialog(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _astagcode,anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _origin,String _obs,anywheresoftware.b4a.objects.collections.List _imglist) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "getmoresendemaildialog", false))
	 {Debug.delegate(ba, "getmoresendemaildialog", new Object[] {_this,_astagcode,_origin,_obs,_imglist}); return;}
ResumableSub_GetMoreSendEmailDialog rsub = new ResumableSub_GetMoreSendEmailDialog(this,__ref,_this,_astagcode,_origin,_obs,_imglist);
rsub.resume(ba, null);
}
public static class ResumableSub_GetMoreSendEmailDialog extends BA.ResumableSub {
public ResumableSub_GetMoreSendEmailDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _astagcode,anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _origin,String _obs,anywheresoftware.b4a.objects.collections.List _imglist) {
this.parent = parent;
this.__ref = __ref;
this._this = _this;
this._astagcode = _astagcode;
this._origin = _origin;
this._obs = _obs;
this._imglist = _imglist;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _astagcode;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _origin;
String _obs;
anywheresoftware.b4a.objects.collections.List _imglist;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;
String _signaturehtml = "";
String _html = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="If (imgList.Size = 0) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_imglist.getSize()==0)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(ShareCod";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(parent._sharecode._option_makealert /*String*/ ,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,"",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=70057988;
 //BA.debugLineNum = 70057988;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(ShareCod";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(parent._sharecode._option_sendemail /*String*/ ,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,"",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=70057991;
 //BA.debugLineNum = 70057991;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=70057992;
 //BA.debugLineNum = 70057992;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=70057993;
 //BA.debugLineNum = 70057993;BA.debugLine="ApplDialog.SetSize(95%x, 80%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (95),ba),parent.__c.PerYToCurrent((float) (80),ba));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=70057995;
 //BA.debugLineNum = 70057995;BA.debugLine="ApplDialog.SetSize(70%x, 430dip)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (70),ba),parent.__c.DipToCurrent((int) (430)));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=70057999;
 //BA.debugLineNum = 70057999;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoresendemaildialog"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 13;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=70058000;
 //BA.debugLineNum = 70058000;BA.debugLine="pnl.LoadLayout(\"dialog_more_action_sendEmail\")";
_pnl.LoadLayout("dialog_more_action_sendEmail",ba);
RDebugUtils.currentLine=70058002;
 //BA.debugLineNum = 70058002;BA.debugLine="dlgASEmailsCC.Text = $\"alertas@${ShareCode.APPL_H";
__ref._dlgasemailscc /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(("alertas@"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"")));
RDebugUtils.currentLine=70058003;
 //BA.debugLineNum = 70058003;BA.debugLine="dlgASEmailsSubject.Text = $\"Ref: ${this.Request}";
__ref._dlgasemailssubject /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(("Ref: "+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+" - "+parent.__c.SmartStringFormatter("",(Object)(_this.Title /*String*/ ))+"")));
RDebugUtils.currentLine=70058004;
 //BA.debugLineNum = 70058004;BA.debugLine="dlgASDetails.Text = obs";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_obs));
RDebugUtils.currentLine=70058006;
 //BA.debugLineNum = 70058006;BA.debugLine="dlgASEmails.Text = \"\"";
__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(""));
RDebugUtils.currentLine=70058008;
 //BA.debugLineNum = 70058008;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmoresendemaildialog"), _sf);
this.state = 22;
return;
case 22:
//C
this.state = 13;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=70058009;
 //BA.debugLineNum = 70058009;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=70058010;
 //BA.debugLineNum = 70058010;BA.debugLine="origin.CloseDialog(DialogResponse.POSITIVE)";
_origin.CloseDialog(ba,parent.__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=70058012;
 //BA.debugLineNum = 70058012;BA.debugLine="Dim SignatureHtml As String = ShareCode.APP_Comp";
_signaturehtml = parent._sharecode._app_company_name /*String*/ ;
RDebugUtils.currentLine=70058013;
 //BA.debugLineNum = 70058013;BA.debugLine="If (ShareCode.APP_DOMAIN.ToLowerCase = \"brasfone";
if (true) break;

case 16:
//if
this.state = 19;
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("brasfone"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=70058014;
 //BA.debugLineNum = 70058014;BA.debugLine="Dim SignatureHtml As String = \"\"";
_signaturehtml = "";
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=70058017;
 //BA.debugLineNum = 70058017;BA.debugLine="Dim HTML As String = $\"<html><body> 		<p><h4><st";
_html = ("<html><body>\n"+"		<p><h4><strong>Acção/Informação</strong></h4><br><br>\n"+"		<strong>Detalhe</strong><br>\n"+"		"+parent.__c.SmartStringFormatter("",(Object)(__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))+"<br></p>\n"+"		<p>A equipa "+parent.__c.SmartStringFormatter("",(Object)(_signaturehtml))+"</>\n"+"		</body></html>");
RDebugUtils.currentLine=70058023;
 //BA.debugLineNum = 70058023;BA.debugLine="Utils.SendEmailExt(dlgASEmails.Text, dlgASEmails";
parent._utils._sendemailext /*String*/ (ba,__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dlgasemailscc /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dlgasemailssubject /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_html,_imglist);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=70058027;
 //BA.debugLineNum = 70058027;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getmorenewactionsdialog(xevolution.vrcg.devdemov2400.appactiondialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _astagcode,String _obs,boolean _isnew,String _thetagcode,anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _parentdialog,String _tagcodetpa,String _grouptpa,int _actionforce) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "getmorenewactionsdialog", false))
	 {Debug.delegate(ba, "getmorenewactionsdialog", new Object[] {_activ,_this,_astagcode,_obs,_isnew,_thetagcode,_parentdialog,_tagcodetpa,_grouptpa,_actionforce}); return;}
ResumableSub_GetMoreNewActionsDialog rsub = new ResumableSub_GetMoreNewActionsDialog(this,__ref,_activ,_this,_astagcode,_obs,_isnew,_thetagcode,_parentdialog,_tagcodetpa,_grouptpa,_actionforce);
rsub.resume(ba, null);
}
public static class ResumableSub_GetMoreNewActionsDialog extends BA.ResumableSub {
public ResumableSub_GetMoreNewActionsDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,Object _activ,xevolution.vrcg.devdemov2400.types._requestclaitem _this,String _astagcode,String _obs,boolean _isnew,String _thetagcode,anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _parentdialog,String _tagcodetpa,String _grouptpa,int _actionforce) {
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
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
Object _activ;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _astagcode;
String _obs;
boolean _isnew;
String _thetagcode;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _parentdialog;
String _tagcodetpa;
String _grouptpa;
int _actionforce;
String _title = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _gravityvalue = 0;
int _n = 0;
xevolution.vrcg.devdemov2400.types._db_itc _itc = null;
int _npos = 0;
int _res = 0;
int _sendtheemail = 0;
String _dtupd = "";
String _ssql = "";
String _newhtml = "";
int _recordcount = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _actions_tagcode = "";
String _request_tagcode = "";
String _reference = "";
String _technical_name = "";
String _updated_at = "";
String _details = "";
String _status_name = "";
String _due_date = "";
String _priority_name = "";
String _gravity_name = "";
String _operation_name = "";
long _ddate = 0L;
String _logo = "";
String _logoalt = "";
String _logotitle = "";
String _suporte = "";
anywheresoftware.b4a.objects.collections.List _imglist = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _actiondatetime = "";
String _emailsentdate = "";
int step15;
int limit15;
int step22;
int limit22;
int step40;
int limit40;
int step47;
int limit47;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69730307;
 //BA.debugLineNum = 69730307;BA.debugLine="Dim Title As String = ShareCode.ActionSubEditTitl";
_title = parent._sharecode._actionsubedittitle /*String*/ ;
RDebugUtils.currentLine=69730308;
 //BA.debugLineNum = 69730308;BA.debugLine="If Utils.isNullOrEmpty(asTagcode) Then Title = Sh";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._utils._isnullorempty /*boolean*/ (ba,_astagcode)) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_title = parent._sharecode._actionsubnewtitle /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=69730309;
 //BA.debugLineNum = 69730309;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(Title, Sh";
_sf = __ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync(_title,parent._sharecode._option_confirm /*String*/ ,parent._sharecode._option_cancel /*String*/ ,parent._sharecode._option_sendemail /*String*/ ,ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=69730311;
 //BA.debugLineNum = 69730311;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=69730312;
 //BA.debugLineNum = 69730312;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=69730313;
 //BA.debugLineNum = 69730313;BA.debugLine="ApplDialog.SetSize(100%x,100%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerYToCurrent((float) (100),ba));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=69730315;
 //BA.debugLineNum = 69730315;BA.debugLine="ApplDialog.SetSize(90%x, 90%y)";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (90),ba),parent.__c.PerYToCurrent((float) (90),ba));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=69730319;
 //BA.debugLineNum = 69730319;BA.debugLine="EmailSentOnNewAS = True";
__ref._emailsentonnewas /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=69730320;
 //BA.debugLineNum = 69730320;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmorenewactionsdialog"), _sf);
this.state = 130;
return;
case 130:
//C
this.state = 13;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=69730321;
 //BA.debugLineNum = 69730321;BA.debugLine="pnl.LoadLayout(\"dialog_more_action2\")";
_pnl.LoadLayout("dialog_more_action2",ba);
RDebugUtils.currentLine=69730325;
 //BA.debugLineNum = 69730325;BA.debugLine="Dim GravityValue As Int = DBStructures.GetScriptC";
_gravityvalue = parent._dbstructures._getscriptcolumnintevc /*int*/ (ba,("SELECT a.points FROM dta_tasks_items_answers AS a\n"+"										 INNER JOIN dta_requests_values AS c ON (c.task_tagcode=a.task_tagcode\n"+"										 	AND c.item_tagcode=a.item_tagcode\n"+"										 	AND c.unique_key=a.unique_key\n"+"										 	AND c.tagcode=a.tagcode)\n"+"											WHERE c.task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"'\n"+"											And c.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"'\n"+"											And c.unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"'\n"+"											And c.tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ .trim()))+"'\n"+"											And c.repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"											And c.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"'\n"+"											And c.inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ .trim()))+"'"),"points");
RDebugUtils.currentLine=69730338;
 //BA.debugLineNum = 69730338;BA.debugLine="dlgASAssign.Add(\"Cliente\")";
__ref._dlgasassign /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("Cliente");
RDebugUtils.currentLine=69730343;
 //BA.debugLineNum = 69730343;BA.debugLine="For n=0 To AS_Status.Size-1";
if (true) break;

case 13:
//for
this.state = 16;
step15 = 1;
limit15 = (int) (__ref._as_status /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 15:
//C
this.state = 132;
RDebugUtils.currentLine=69730344;
 //BA.debugLineNum = 69730344;BA.debugLine="Dim itc As DB_ITC = AS_Status.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_status /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69730345;
 //BA.debugLineNum = 69730345;BA.debugLine="dlgASStatus.Add(itc.Title)";
__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=69730348;
 //BA.debugLineNum = 69730348;BA.debugLine="dlgASType.Color = Consts.ColorWhiteSilverLight";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730349;
 //BA.debugLineNum = 69730349;BA.debugLine="dlgASType.DropdownBackgroundColor = Consts.ColorW";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730350;
 //BA.debugLineNum = 69730350;BA.debugLine="dlgASType.Add(\"\")";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("");
RDebugUtils.currentLine=69730355;
 //BA.debugLineNum = 69730355;BA.debugLine="For n=0 To AS_Types.Size-1";
if (true) break;

case 17:
//for
this.state = 20;
step22 = 1;
limit22 = (int) (__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 19:
//C
this.state = 134;
RDebugUtils.currentLine=69730356;
 //BA.debugLineNum = 69730356;BA.debugLine="Dim itc As DB_ITC = AS_Types.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69730357;
 //BA.debugLineNum = 69730357;BA.debugLine="dlgASType.Add(itc.Title)";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=69730360;
 //BA.debugLineNum = 69730360;BA.debugLine="If (AS_Types.Size > 0) Then";

case 20:
//if
this.state = 35;
if ((__ref._as_types /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=69730361;
 //BA.debugLineNum = 69730361;BA.debugLine="If (Utils.NNE(tagcodeTPA)) Then";
if (true) break;

case 23:
//if
this.state = 34;
if ((parent._utils._nne /*boolean*/ (ba,_tagcodetpa))) { 
this.state = 25;
}else {
this.state = 33;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=69730362;
 //BA.debugLineNum = 69730362;BA.debugLine="Dim nPos As Int = DBStructures.getITCTablePos(D";
_npos = parent._dbstructures._getitctablepos /*int*/ (ba,parent._dbstructures._sql_data_type_astypes /*String*/ ,_tagcodetpa);
RDebugUtils.currentLine=69730363;
 //BA.debugLineNum = 69730363;BA.debugLine="If (nPos > 0) Then";
if (true) break;

case 26:
//if
this.state = 31;
if ((_npos>0)) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=69730364;
 //BA.debugLineNum = 69730364;BA.debugLine="dlgASType.SelectedIndex = nPos";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_npos);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=69730366;
 //BA.debugLineNum = 69730366;BA.debugLine="dlgASType.SelectedIndex = 1";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (1));
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=69730369;
 //BA.debugLineNum = 69730369;BA.debugLine="dlgASType.SelectedIndex = 1";
__ref._dlgastype /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (1));
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
RDebugUtils.currentLine=69730373;
 //BA.debugLineNum = 69730373;BA.debugLine="dlgASPriority.Color = Consts.ColorWhiteSilverLigh";
__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730374;
 //BA.debugLineNum = 69730374;BA.debugLine="dlgASPriority.DropdownBackgroundColor = Consts.Co";
__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730375;
 //BA.debugLineNum = 69730375;BA.debugLine="For n=0 To AS_Priority.Size-1";
if (true) break;

case 36:
//for
this.state = 39;
step40 = 1;
limit40 = (int) (__ref._as_priority /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 38:
//C
this.state = 136;
RDebugUtils.currentLine=69730376;
 //BA.debugLineNum = 69730376;BA.debugLine="Dim itc As DB_ITC = AS_Priority.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_priority /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69730377;
 //BA.debugLineNum = 69730377;BA.debugLine="dlgASPriority.Add(itc.Title)";
__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=69730380;
 //BA.debugLineNum = 69730380;BA.debugLine="dlgASUrgency.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730381;
 //BA.debugLineNum = 69730381;BA.debugLine="If (IsNew) Then";
if (true) break;

case 40:
//if
this.state = 49;
if ((_isnew)) { 
this.state = 42;
}else {
this.state = 48;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=69730382;
 //BA.debugLineNum = 69730382;BA.debugLine="dlgASUrgency.DropdownBackgroundColor = Consts.Co";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730383;
 //BA.debugLineNum = 69730383;BA.debugLine="For n=0 To AS_Urgency.Size-1";
if (true) break;

case 43:
//for
this.state = 46;
step47 = 1;
limit47 = (int) (__ref._as_urgency /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_n = (int) (0) ;
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
if (true) break;

case 45:
//C
this.state = 138;
RDebugUtils.currentLine=69730384;
 //BA.debugLineNum = 69730384;BA.debugLine="Dim itc As DB_ITC = AS_Urgency.Get(n)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(__ref._as_urgency /*anywheresoftware.b4a.objects.collections.List*/ .Get(_n));
RDebugUtils.currentLine=69730385;
 //BA.debugLineNum = 69730385;BA.debugLine="dlgASUrgency.Add(itc.Title)";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_itc.Title /*String*/ );
 if (true) break;
if (true) break;

case 46:
//C
this.state = 49;
;
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=69730388;
 //BA.debugLineNum = 69730388;BA.debugLine="dlgASUrgency.Enabled = False";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setEnabled(parent.__c.False);
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=69730391;
 //BA.debugLineNum = 69730391;BA.debugLine="dlgASUrgency.SelectedIndex = GravityValue";
__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex(_gravityvalue);
RDebugUtils.currentLine=69730393;
 //BA.debugLineNum = 69730393;BA.debugLine="dlgASSubject.Color = Consts.ColorWhiteSilverLight";
__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730394;
 //BA.debugLineNum = 69730394;BA.debugLine="dlgASSubject.Text = this.Title";
__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_this.Title /*String*/ ));
RDebugUtils.currentLine=69730395;
 //BA.debugLineNum = 69730395;BA.debugLine="dlgASEmails.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730396;
 //BA.debugLineNum = 69730396;BA.debugLine="dlgASEmails.Text = $\"\"$";
__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(("")));
RDebugUtils.currentLine=69730397;
 //BA.debugLineNum = 69730397;BA.debugLine="dlgASCCEmails.Color = Consts.ColorWhiteSilverLigh";
__ref._dlgasccemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730398;
 //BA.debugLineNum = 69730398;BA.debugLine="dlgASCCEmails.Text = $\"alertas@${ShareCode.APPL_H";
__ref._dlgasccemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setText((Object)(("alertas@"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"")));
RDebugUtils.currentLine=69730399;
 //BA.debugLineNum = 69730399;BA.debugLine="dlgASDueDate.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730402;
 //BA.debugLineNum = 69730402;BA.debugLine="dlgASDetails.Color = Consts.ColorWhiteSilverLight";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(parent._consts._colorwhitesilverlight /*int*/ );
RDebugUtils.currentLine=69730403;
 //BA.debugLineNum = 69730403;BA.debugLine="dlgASDetails.Text = $\"\"$";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(("")));
RDebugUtils.currentLine=69730404;
 //BA.debugLineNum = 69730404;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\") Th";
if (true) break;

case 50:
//if
this.state = 53;
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("edp"))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=69730405;
 //BA.debugLineNum = 69730405;BA.debugLine="dlgASDetails.Text = obs";
__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_obs));
 if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=69730411;
 //BA.debugLineNum = 69730411;BA.debugLine="ApplDialog.GetButton(DialogResponse.NEGATIVE).Ena";
__ref._appldialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .GetButton(parent.__c.DialogResponse.NEGATIVE).setEnabled(parent.__c.Not(parent._utils._int2bool /*boolean*/ (ba,_actionforce)));
RDebugUtils.currentLine=69730413;
 //BA.debugLineNum = 69730413;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmorenewactionsdialog"), _sf);
this.state = 139;
return;
case 139:
//C
this.state = 54;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=69730415;
 //BA.debugLineNum = 69730415;BA.debugLine="If (res = DialogResponse.POSITIVE) Or (res = Dial";
if (true) break;

case 54:
//if
this.state = 129;
if ((_res==parent.__c.DialogResponse.POSITIVE) || (_res==parent.__c.DialogResponse.NEGATIVE)) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=69730416;
 //BA.debugLineNum = 69730416;BA.debugLine="Dim sendTheEmail As Int = Utils.Bool2Int(res = D";
_sendtheemail = parent._utils._bool2int /*int*/ (ba,_res==parent.__c.DialogResponse.NEGATIVE);
RDebugUtils.currentLine=69730418;
 //BA.debugLineNum = 69730418;BA.debugLine="If (asTagcode = \"\") Then";
if (true) break;

case 57:
//if
this.state = 60;
if (((_astagcode).equals(""))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=69730419;
 //BA.debugLineNum = 69730419;BA.debugLine="asTagcode = Utils.GenerateTagcode(\"AS0\")";
_astagcode = parent._utils._generatetagcode /*String*/ (ba,"AS0");
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=69730422;
 //BA.debugLineNum = 69730422;BA.debugLine="Dim dtupd As String = Utils.GetCurrDatetimeExt";
_dtupd = parent._utils._getcurrdatetimeext /*String*/ (ba);
RDebugUtils.currentLine=69730425;
 //BA.debugLineNum = 69730425;BA.debugLine="If (IsNew) Then";
if (true) break;

case 61:
//if
this.state = 66;
if ((_isnew)) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
RDebugUtils.currentLine=69730426;
 //BA.debugLineNum = 69730426;BA.debugLine="asTagcode = DBStructures.InsertRequestASEVC(asT";
_astagcode = parent._dbstructures._insertrequestasevc /*String*/ (ba,_astagcode,_this.Request /*String*/ ,_this.Action /*String*/ ,_this.Task /*String*/ ,_this.Item /*String*/ ,_this.UniqueKey /*String*/ ,_thetagcode,__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),parent._utils._getaspriority /*String*/ (ba,(int) (__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._utils._getasurgency /*String*/ (ba,(int) (__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._sharecode._sess_oper_user /*String*/ ,parent._utils._getasstatus /*String*/ (ba,(int) (__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._utils._getcurrdatetime /*String*/ (ba),BA.NumberToString(parent._utils._bool2int /*int*/ (ba,__ref._emailsentonnewas /*boolean*/ )),__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_this.RepeatCounter /*int*/ ,_this.RepeatItemCounter /*int*/ ,_this.repeatfieldcounter /*int*/ ,_dtupd,_tagcodetpa,_grouptpa,_obs,_sendtheemail);
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=69730433;
 //BA.debugLineNum = 69730433;BA.debugLine="asTagcode = DBStructures.InsertRequestASEVCDeta";
_astagcode = parent._dbstructures._insertrequestasevcdetails /*String*/ (ba,_astagcode,_this.Request /*String*/ ,_this.Action /*String*/ ,_this.Task /*String*/ ,_this.Item /*String*/ ,_this.UniqueKey /*String*/ ,_thetagcode,__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),parent._utils._getaspriority /*String*/ (ba,(int) (__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._utils._getasurgency /*String*/ (ba,(int) (__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._sharecode._sess_oper_user /*String*/ ,parent._utils._getasstatus /*String*/ (ba,(int) (__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1)),parent._utils._getcurrdatetime /*String*/ (ba),BA.NumberToString(parent._utils._bool2int /*int*/ (ba,__ref._emailsentonnewas /*boolean*/ )),__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),_this.RepeatCounter /*int*/ ,_this.RepeatItemCounter /*int*/ ,_this.repeatfieldcounter /*int*/ ,_dtupd,_sendtheemail);
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=69730441;
 //BA.debugLineNum = 69730441;BA.debugLine="Dim sSQL As String = $\"SELECT DISTINCT a.actions";
_ssql = ("SELECT DISTINCT a.actions_tagcode,a.operation_type,a.typerequest_type,a.details,a.priority_tagcode,a.gravity_tagcode,\n"+"						a.team_tagcode, a.technical_tagcode, a.commercial_tagcode, a.close_date, a.due_date, a.send_email, a.email_sent,\n"+"						a.email_to, a.email_cc, a.updated_at, a.active,\n"+"						b.request_tagcode, b.title, b.details,\n"+"						c.status_id, c.entity_tagcode, c.object_tagcode,\n"+"						d.title_import, d.reference, ifnull(e.title,'') as technical_name,\n"+"						IFNULL(t1.tagdesc, '') AS priority_name, \n"+"						IFNULL(t2.tagdesc, '') AS gravity_name, \n"+"						IFNULL(t3.tagdesc, '') AS operation_name,  \n"+"						IFNULL(t4.tagdesc, '') AS status_name\n"+"						FROM dta_actions_items AS a\n"+"						INNER JOIN dta_actions AS b ON (b.tagcode=a.actions_tagcode)\n"+"						INNER JOIN dta_requests AS c ON (c.tagcode=b.request_tagcode)\n"+"						INNER JOIN dta_objects AS d ON (d.tagcode=c.object_tagcode)\n"+"						LEFT JOIN dta_technicals AS e ON (e.tagcode=b.technical_tagcode)\n"+"						LEFT JOIN type_prioritytypes AS t1 ON (t1.tagcode=a.priority_tagcode)\n"+"						LEFT JOIN type_gravitytypes AS t2 ON (t2.tagcode=a.gravity_tagcode)\n"+"						LEFT JOIN type_operationtypes AS t3 ON (t3.tagcode=a.operation_type)\n"+"						LEFT JOIN type_statustypes AS t4 ON (t4.id=c.status_id)\n"+"						WHERE a.actions_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_astagcode))+"'\n"+"						ORDER BY a.id DESC\n"+"						LIMIT 1");
RDebugUtils.currentLine=69730464;
 //BA.debugLineNum = 69730464;BA.debugLine="Dim newHTML As String = \"\"";
_newhtml = "";
RDebugUtils.currentLine=69730465;
 //BA.debugLineNum = 69730465;BA.debugLine="Dim RecordCount As Int = 0";
_recordcount = (int) (0);
RDebugUtils.currentLine=69730466;
 //BA.debugLineNum = 69730466;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.E";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=69730467;
 //BA.debugLineNum = 69730467;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 67:
//if
this.state = 70;
if (_record.getRowCount()>0) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=69730468;
 //BA.debugLineNum = 69730468;BA.debugLine="RecordCount = RecordCount + 1";
_recordcount = (int) (_recordcount+1);
RDebugUtils.currentLine=69730469;
 //BA.debugLineNum = 69730469;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=69730471;
 //BA.debugLineNum = 69730471;BA.debugLine="Dim actions_tagcode As String = Utils.ifnullore";
_actions_tagcode = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("actions_tagcode"),"");
RDebugUtils.currentLine=69730472;
 //BA.debugLineNum = 69730472;BA.debugLine="Dim request_tagcode As String = Utils.ifnullore";
_request_tagcode = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("request_tagcode"),"");
RDebugUtils.currentLine=69730473;
 //BA.debugLineNum = 69730473;BA.debugLine="Dim reference As String = Utils.ifnullorempty(R";
_reference = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("reference"),"");
RDebugUtils.currentLine=69730474;
 //BA.debugLineNum = 69730474;BA.debugLine="Dim technical_name As String = Utils.ifnullorem";
_technical_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("technical_name"),"");
RDebugUtils.currentLine=69730475;
 //BA.debugLineNum = 69730475;BA.debugLine="Dim updated_at As String = Utils.ifnullorempty(";
_updated_at = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("updated_at"),"");
RDebugUtils.currentLine=69730476;
 //BA.debugLineNum = 69730476;BA.debugLine="Dim details As String = Utils.ifnullorempty(Rec";
_details = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("details"),"");
RDebugUtils.currentLine=69730477;
 //BA.debugLineNum = 69730477;BA.debugLine="Dim status_name As String = Utils.ifnullorempty";
_status_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("status_name"),"");
RDebugUtils.currentLine=69730478;
 //BA.debugLineNum = 69730478;BA.debugLine="Dim due_date As String = Utils.ifnullorempty(Re";
_due_date = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("due_date"),"");
RDebugUtils.currentLine=69730479;
 //BA.debugLineNum = 69730479;BA.debugLine="Dim priority_name As String = Utils.ifnulloremp";
_priority_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("priority_name"),"");
RDebugUtils.currentLine=69730480;
 //BA.debugLineNum = 69730480;BA.debugLine="Dim gravity_name As String = Utils.ifnullorempt";
_gravity_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("gravity_name"),"");
RDebugUtils.currentLine=69730481;
 //BA.debugLineNum = 69730481;BA.debugLine="Dim operation_name As String = Utils.ifnullorem";
_operation_name = parent._utils._ifnullorempty /*String*/ (ba,_record.GetString("operation_name"),"");
 if (true) break;

case 70:
//C
this.state = 71;
;
RDebugUtils.currentLine=69730484;
 //BA.debugLineNum = 69730484;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=69730486;
 //BA.debugLineNum = 69730486;BA.debugLine="If Utils.NNE(due_date) Then";
if (true) break;

case 71:
//if
this.state = 80;
if (parent._utils._nne /*boolean*/ (ba,_due_date)) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=69730487;
 //BA.debugLineNum = 69730487;BA.debugLine="Try";
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
RDebugUtils.currentLine=69730488;
 //BA.debugLineNum = 69730488;BA.debugLine="Dim ddate As Long = DateTime.DateParse(due_dat";
_ddate = parent.__c.DateTime.DateParse(_due_date);
RDebugUtils.currentLine=69730489;
 //BA.debugLineNum = 69730489;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=69730490;
 //BA.debugLineNum = 69730490;BA.debugLine="due_date = DateTime.Date(ddate)";
_due_date = parent.__c.DateTime.Date(_ddate);
 if (true) break;

case 78:
//C
this.state = 79;
this.catchState = 0;
RDebugUtils.currentLine=69730492;
 //BA.debugLineNum = 69730492;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669730492",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 0;
;
 if (true) break;
;
RDebugUtils.currentLine=69730496;
 //BA.debugLineNum = 69730496;BA.debugLine="If Utils.NNE(due_date) Then";

case 80:
//if
this.state = 89;
if (parent._utils._nne /*boolean*/ (ba,_due_date)) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=69730497;
 //BA.debugLineNum = 69730497;BA.debugLine="Try";
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
RDebugUtils.currentLine=69730498;
 //BA.debugLineNum = 69730498;BA.debugLine="due_date = due_date.Replace(\"00:00:00\", \"\").Tr";
_due_date = _due_date.replace("00:00:00","").trim();
 if (true) break;

case 87:
//C
this.state = 88;
this.catchState = 0;
RDebugUtils.currentLine=69730500;
 //BA.debugLineNum = 69730500;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669730500",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=69730505;
 //BA.debugLineNum = 69730505;BA.debugLine="Dim LOGO As String = \"\"";
_logo = "";
RDebugUtils.currentLine=69730506;
 //BA.debugLineNum = 69730506;BA.debugLine="Dim LOGOALT As String = \"\"";
_logoalt = "";
RDebugUtils.currentLine=69730507;
 //BA.debugLineNum = 69730507;BA.debugLine="Dim LOGOTITLE As String = \"\"";
_logotitle = "";
RDebugUtils.currentLine=69730508;
 //BA.debugLineNum = 69730508;BA.debugLine="Dim SUPORTE As String = \"\"";
_suporte = "";
RDebugUtils.currentLine=69730510;
 //BA.debugLineNum = 69730510;BA.debugLine="If (sendTheEmail = 1) Then";
if (true) break;

case 90:
//if
this.state = 112;
if ((_sendtheemail==1)) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=69730512;
 //BA.debugLineNum = 69730512;BA.debugLine="LOGO = $\"data:image/jpeg;base64,${ShareCode.APP";
_logo = ("data:image/jpeg;base64,"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_main_logo_mini /*String*/ ))+"");
RDebugUtils.currentLine=69730513;
 //BA.debugLineNum = 69730513;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"edp\")";
if (true) break;

case 93:
//if
this.state = 102;
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("edp"))) { 
this.state = 95;
}else 
{RDebugUtils.currentLine=69730517;
 //BA.debugLineNum = 69730517;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase = \"u";
if (((parent._sharecode._app_domain /*String*/ .toLowerCase()).equals("uber"))) { 
this.state = 97;
}else 
{RDebugUtils.currentLine=69730521;
 //BA.debugLineNum = 69730521;BA.debugLine="else If  (ShareCode.APP_DOMAIN.ToLowerCase.cont";
if ((parent._sharecode._app_domain /*String*/ .toLowerCase().contains("grandative"))) { 
this.state = 99;
}else {
this.state = 101;
}}}
if (true) break;

case 95:
//C
this.state = 102;
RDebugUtils.currentLine=69730514;
 //BA.debugLineNum = 69730514;BA.debugLine="LOGOALT = \"EDP\"";
_logoalt = "EDP";
RDebugUtils.currentLine=69730515;
 //BA.debugLineNum = 69730515;BA.debugLine="LOGOTITLE = \"EDP Comercial \"";
_logotitle = "EDP Comercial ";
RDebugUtils.currentLine=69730516;
 //BA.debugLineNum = 69730516;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>Caso encontre alg";
_suporte = "<b>Suporte</b><br>Caso encontre alguma dificuldade, por favor entre em contacto com João Salsa (939395171) ou Pedro Fontoura (936113575).";
 if (true) break;

case 97:
//C
this.state = 102;
RDebugUtils.currentLine=69730518;
 //BA.debugLineNum = 69730518;BA.debugLine="LOGOALT = \"UBER\"";
_logoalt = "UBER";
RDebugUtils.currentLine=69730519;
 //BA.debugLineNum = 69730519;BA.debugLine="LOGOTITLE = \"UBER Desinfestações \"";
_logotitle = "UBER Desinfestações ";
RDebugUtils.currentLine=69730520;
 //BA.debugLineNum = 69730520;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
_suporte = "<b>Suporte</b><br>";
 if (true) break;

case 99:
//C
this.state = 102;
RDebugUtils.currentLine=69730522;
 //BA.debugLineNum = 69730522;BA.debugLine="LOGOALT = \"GrandAtive\"";
_logoalt = "GrandAtive";
RDebugUtils.currentLine=69730523;
 //BA.debugLineNum = 69730523;BA.debugLine="LOGOTITLE = \"GrandAtive \"";
_logotitle = "GrandAtive ";
RDebugUtils.currentLine=69730524;
 //BA.debugLineNum = 69730524;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
_suporte = "<b>Suporte</b><br>";
 if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=69730526;
 //BA.debugLineNum = 69730526;BA.debugLine="LOGOALT = $\"${ShareCode.APP_DOMAIN.ToUpperCase";
_logoalt = (""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ .toUpperCase()))+"");
RDebugUtils.currentLine=69730527;
 //BA.debugLineNum = 69730527;BA.debugLine="LOGOTITLE = $\"${ShareCode.APP_DOMAIN.ToUpperCa";
_logotitle = (""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ .toUpperCase()))+" ");
RDebugUtils.currentLine=69730528;
 //BA.debugLineNum = 69730528;BA.debugLine="SUPORTE = \"<b>Suporte</b><br>\"";
_suporte = "<b>Suporte</b><br>";
 if (true) break;
;
RDebugUtils.currentLine=69730531;
 //BA.debugLineNum = 69730531;BA.debugLine="If RecordCount > 0 Then";

case 102:
//if
this.state = 105;
if (_recordcount>0) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=69730532;
 //BA.debugLineNum = 69730532;BA.debugLine="Dim newHTML As String = $\"<!DOCTYPE html>";
_newhtml = ("<!DOCTYPE html>\n"+"				<html xmlns=\"http://www.w3.org/1999/xhtml\"> <head>  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"+"				<title>"+parent.__c.SmartStringFormatter("",(Object)(_logotitle))+"</title>  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/></head><body style=\"margin: 0; padding: 0;\">\n"+"				<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"60%\">    <tr> <td bgcolor=\"f00000\">&nbsp;</td>\n"+"				</tr> <tr><td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				<img src=\""+parent.__c.SmartStringFormatter("",(Object)(_logo))+"\" alt=\""+parent.__c.SmartStringFormatter("",(Object)(_logoalt))+"\">"+parent.__c.SmartStringFormatter("",(Object)(_logotitle))+"</td></tr><tr>\n"+"				<td bgcolor=\"#fff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				<p><b>ID de ação:</b> "+parent.__c.SmartStringFormatter("",(Object)(_actions_tagcode))+"</p><p><b>Nº Inspecção:</b> "+parent.__c.SmartStringFormatter("",(Object)(_request_tagcode))+" &nbsp&nbsp \n"+"				</p> <p> <b>Contrato:</b> "+parent.__c.SmartStringFormatter("",(Object)(_reference))+" </p> </td></tr>technical_tagcode<tr>\n"+"				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				<table border=\"1\" cellpadding=\"10\" > <tr><td style=\"width: 25%\">Modificado por</td>\n"+"				<td style=\"width: 75%\">"+parent.__c.SmartStringFormatter("",(Object)(_technical_name))+"</td> </tr><tr><td>Data de Modificação</td><td>"+parent.__c.SmartStringFormatter("",(Object)(_updated_at))+"</td>\n"+"				</tr><tr><td>Descrição da Intervenção</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_details))+"</td> </tr><tr><td>Estado da Ação</td><td>"+parent.__c.SmartStringFormatter("",(Object)(_status_name))+"</td>\n"+"				</tr> <tr> <td>Data Vencimento</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_due_date))+"</td> </tr> <tr> <td>Prioridade</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_priority_name))+"</td>\n"+"				</tr>  <tr> <td>Gravidade</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_gravity_name))+"</td>  \n"+"				</tr>gravity_name<tr> <td>Tipo Ação</td> <td>"+parent.__c.SmartStringFormatter("",(Object)(_operation_name))+"</td> </tr> </table> </td> </tr> <tr>\n"+"				<td bgcolor=\"#ffffff\" style=\"padding:10px;color: #153643; font-size: 15px; line-height: 15px; font-weight: normal; text-decoration: none; font-family: helvetica, Arial, sans-serif;\">\n"+"				"+parent.__c.SmartStringFormatter("",(Object)(_suporte))+"\n"+"				</td> </tr> <tr> <td bgcolor=\"f00000\">&nbsp;</td> </tr> </table> </body> </html>");
 if (true) break;

case 105:
//C
this.state = 106;
;
RDebugUtils.currentLine=69730553;
 //BA.debugLineNum = 69730553;BA.debugLine="Log(newHTML)";
parent.__c.LogImpl("669730553",_newhtml,0);
RDebugUtils.currentLine=69730554;
 //BA.debugLineNum = 69730554;BA.debugLine="Dim imgList As List";
_imglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69730555;
 //BA.debugLineNum = 69730555;BA.debugLine="imgList.initialize";
_imglist.Initialize();
RDebugUtils.currentLine=69730557;
 //BA.debugLineNum = 69730557;BA.debugLine="Try";
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
RDebugUtils.currentLine=69730558;
 //BA.debugLineNum = 69730558;BA.debugLine="Utils.SendEmailExt(dlgASEmails.Text, \"\", dlgAS";
parent._utils._sendemailext /*String*/ (ba,__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText(),"",__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_newhtml,_imglist);
 if (true) break;

case 110:
//C
this.state = 111;
this.catchState = 0;
RDebugUtils.currentLine=69730560;
 //BA.debugLineNum = 69730560;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("669730560",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 111:
//C
this.state = 112;
this.catchState = 0;
;
RDebugUtils.currentLine=69730562;
 //BA.debugLineNum = 69730562;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmorenewactionsdialog"),(int) (250));
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
RDebugUtils.currentLine=69730566;
 //BA.debugLineNum = 69730566;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69730567;
 //BA.debugLineNum = 69730567;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69730568;
 //BA.debugLineNum = 69730568;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69730569;
 //BA.debugLineNum = 69730569;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=69730570;
 //BA.debugLineNum = 69730570;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=69730571;
 //BA.debugLineNum = 69730571;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=69730572;
 //BA.debugLineNum = 69730572;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=69730573;
 //BA.debugLineNum = 69730573;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=69730574;
 //BA.debugLineNum = 69730574;BA.debugLine="params.Put(\"ASUITagcode\", theTagcode)";
_params.Put((Object)("ASUITagcode"),(Object)(_thetagcode));
RDebugUtils.currentLine=69730575;
 //BA.debugLineNum = 69730575;BA.debugLine="params.Put(\"ACLAExecuteAction\", asTagcode)";
_params.Put((Object)("ACLAExecuteAction"),(Object)(_astagcode));
RDebugUtils.currentLine=69730576;
 //BA.debugLineNum = 69730576;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69730577;
 //BA.debugLineNum = 69730577;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69730578;
 //BA.debugLineNum = 69730578;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
_params.Put((Object)("ACLARepeatField"),(Object)(_this.repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=69730579;
 //BA.debugLineNum = 69730579;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69730580;
 //BA.debugLineNum = 69730580;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69730581;
 //BA.debugLineNum = 69730581;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69730582;
 //BA.debugLineNum = 69730582;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69730583;
 //BA.debugLineNum = 69730583;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69730584;
 //BA.debugLineNum = 69730584;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69730585;
 //BA.debugLineNum = 69730585;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69730586;
 //BA.debugLineNum = 69730586;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/as/update");
RDebugUtils.currentLine=69730587;
 //BA.debugLineNum = 69730587;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 113:
//if
this.state = 118;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 118;
RDebugUtils.currentLine=69730588;
 //BA.debugLineNum = 69730588;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,_activ,_url,"",_this.Request /*String*/ );
 if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=69730590;
 //BA.debugLineNum = 69730590;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69730591;
 //BA.debugLineNum = 69730591;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 118:
//C
this.state = 119;
;
RDebugUtils.currentLine=69730593;
 //BA.debugLineNum = 69730593;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmorenewactionsdialog"),(int) (550));
this.state = 141;
return;
case 141:
//C
this.state = 119;
;
RDebugUtils.currentLine=69730595;
 //BA.debugLineNum = 69730595;BA.debugLine="Dim actiondatetime As String = Utils.GetCurrDate";
_actiondatetime = parent._utils._getcurrdatetime /*String*/ (ba);
RDebugUtils.currentLine=69730596;
 //BA.debugLineNum = 69730596;BA.debugLine="Dim emailsentdate As String = actiondatetime";
_emailsentdate = _actiondatetime;
RDebugUtils.currentLine=69730597;
 //BA.debugLineNum = 69730597;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69730598;
 //BA.debugLineNum = 69730598;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69730599;
 //BA.debugLineNum = 69730599;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69730600;
 //BA.debugLineNum = 69730600;BA.debugLine="params.Put(\"ASRequest\", this.Request)";
_params.Put((Object)("ASRequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=69730601;
 //BA.debugLineNum = 69730601;BA.debugLine="params.Put(\"ASAction\", this.Action)";
_params.Put((Object)("ASAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=69730602;
 //BA.debugLineNum = 69730602;BA.debugLine="params.Put(\"ASTask\", this.Task)";
_params.Put((Object)("ASTask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=69730603;
 //BA.debugLineNum = 69730603;BA.debugLine="params.Put(\"ASItem\", this.Item)";
_params.Put((Object)("ASItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=69730604;
 //BA.debugLineNum = 69730604;BA.debugLine="params.Put(\"ASUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ASUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=69730605;
 //BA.debugLineNum = 69730605;BA.debugLine="params.Put(\"ASUITagcode\", theTagcode)";
_params.Put((Object)("ASUITagcode"),(Object)(_thetagcode));
RDebugUtils.currentLine=69730606;
 //BA.debugLineNum = 69730606;BA.debugLine="params.Put(\"ASTagcode\", asTagcode)";
_params.Put((Object)("ASTagcode"),(Object)(_astagcode));
RDebugUtils.currentLine=69730607;
 //BA.debugLineNum = 69730607;BA.debugLine="params.Put(\"ASTitle\", dlgASSubject.Text)";
_params.Put((Object)("ASTitle"),(Object)(__ref._dlgassubject /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69730608;
 //BA.debugLineNum = 69730608;BA.debugLine="params.Put(\"ASDetails\", dlgASDetails.Text)";
_params.Put((Object)("ASDetails"),(Object)(__ref._dlgasdetails /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69730609;
 //BA.debugLineNum = 69730609;BA.debugLine="params.Put(\"ASPriority\", Utils.getASPriority(dlg";
_params.Put((Object)("ASPriority"),(Object)(parent._utils._getaspriority /*String*/ (ba,(int) (__ref._dlgaspriority /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1))));
RDebugUtils.currentLine=69730610;
 //BA.debugLineNum = 69730610;BA.debugLine="params.Put(\"ASUrgency\", Utils.getASUrgency(dlgAS";
_params.Put((Object)("ASUrgency"),(Object)(parent._utils._getasurgency /*String*/ (ba,(int) (__ref._dlgasurgency /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1))));
RDebugUtils.currentLine=69730611;
 //BA.debugLineNum = 69730611;BA.debugLine="params.Put(\"ASAssigned\", ShareCode.SESS_OPER_Use";
_params.Put((Object)("ASAssigned"),(Object)(parent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=69730612;
 //BA.debugLineNum = 69730612;BA.debugLine="params.Put(\"ASAssignedType\", 0)";
_params.Put((Object)("ASAssignedType"),(Object)(0));
RDebugUtils.currentLine=69730613;
 //BA.debugLineNum = 69730613;BA.debugLine="params.Put(\"ASStatus\", Utils.getASStatus(dlgASSt";
_params.Put((Object)("ASStatus"),(Object)(parent._utils._getasstatus /*String*/ (ba,(int) (__ref._dlgasstatus /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex()+1))));
RDebugUtils.currentLine=69730614;
 //BA.debugLineNum = 69730614;BA.debugLine="params.Put(\"ASEmailDatetime\", emailsentdate)";
_params.Put((Object)("ASEmailDatetime"),(Object)(_emailsentdate));
RDebugUtils.currentLine=69730615;
 //BA.debugLineNum = 69730615;BA.debugLine="params.Put(\"ASEmailSent\", sendTheEmail) 'Utils.B";
_params.Put((Object)("ASEmailSent"),(Object)(_sendtheemail));
RDebugUtils.currentLine=69730616;
 //BA.debugLineNum = 69730616;BA.debugLine="params.Put(\"ASEmailTo\", dlgASEmails.Text)";
_params.Put((Object)("ASEmailTo"),(Object)(__ref._dlgasemails /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69730617;
 //BA.debugLineNum = 69730617;BA.debugLine="params.Put(\"ASEmailRelatedTask\", \"\")";
_params.Put((Object)("ASEmailRelatedTask"),(Object)(""));
RDebugUtils.currentLine=69730618;
 //BA.debugLineNum = 69730618;BA.debugLine="params.Put(\"ASEmailRelatedAction\", \"\")";
_params.Put((Object)("ASEmailRelatedAction"),(Object)(""));
RDebugUtils.currentLine=69730619;
 //BA.debugLineNum = 69730619;BA.debugLine="params.Put(\"ASDueDate\", dlgASDueDate.Text)";
_params.Put((Object)("ASDueDate"),(Object)(__ref._dlgasduedate /*anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper*/ .getText()));
RDebugUtils.currentLine=69730620;
 //BA.debugLineNum = 69730620;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69730621;
 //BA.debugLineNum = 69730621;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69730622;
 //BA.debugLineNum = 69730622;BA.debugLine="params.Put(\"ACLARepeatField\", this.repeatfieldco";
_params.Put((Object)("ACLARepeatField"),(Object)(_this.repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=69730623;
 //BA.debugLineNum = 69730623;BA.debugLine="params.Put(\"ACLACreation\", dtupd)";
_params.Put((Object)("ACLACreation"),(Object)(_dtupd));
RDebugUtils.currentLine=69730624;
 //BA.debugLineNum = 69730624;BA.debugLine="params.Put(\"ACLATagcodeTPA\", tagcodeTPA)";
_params.Put((Object)("ACLATagcodeTPA"),(Object)(_tagcodetpa));
RDebugUtils.currentLine=69730625;
 //BA.debugLineNum = 69730625;BA.debugLine="params.Put(\"ACLAGroupTPA\", groupTPA)";
_params.Put((Object)("ACLAGroupTPA"),(Object)(_grouptpa));
RDebugUtils.currentLine=69730626;
 //BA.debugLineNum = 69730626;BA.debugLine="params.Put(\"ACLANew\", Utils.Bool2Int(IsNew))";
_params.Put((Object)("ACLANew"),(Object)(parent._utils._bool2int /*int*/ (ba,_isnew)));
RDebugUtils.currentLine=69730627;
 //BA.debugLineNum = 69730627;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69730628;
 //BA.debugLineNum = 69730628;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69730629;
 //BA.debugLineNum = 69730629;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69730630;
 //BA.debugLineNum = 69730630;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69730631;
 //BA.debugLineNum = 69730631;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69730632;
 //BA.debugLineNum = 69730632;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69730633;
 //BA.debugLineNum = 69730633;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69730634;
 //BA.debugLineNum = 69730634;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/as/insert");
RDebugUtils.currentLine=69730635;
 //BA.debugLineNum = 69730635;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 119:
//if
this.state = 124;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 121;
}else {
this.state = 123;
}if (true) break;

case 121:
//C
this.state = 124;
RDebugUtils.currentLine=69730636;
 //BA.debugLineNum = 69730636;BA.debugLine="Utils.CallApi(0, params, activ, Url, \"\", this.R";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,_activ,_url,"",_this.Request /*String*/ );
 if (true) break;

case 123:
//C
this.state = 124;
RDebugUtils.currentLine=69730638;
 //BA.debugLineNum = 69730638;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=69730639;
 //BA.debugLineNum = 69730639;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 124:
//C
this.state = 125;
;
RDebugUtils.currentLine=69730641;
 //BA.debugLineNum = 69730641;BA.debugLine="Sleep(550)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "getmorenewactionsdialog"),(int) (550));
this.state = 142;
return;
case 142:
//C
this.state = 125;
;
RDebugUtils.currentLine=69730644;
 //BA.debugLineNum = 69730644;BA.debugLine="CallSubDelayed3(activ, \"Return2CLAI\", this, 1)";
parent.__c.CallSubDelayed3(ba,_activ,"Return2CLAI",(Object)(_this),(Object)(1));
RDebugUtils.currentLine=69730645;
 //BA.debugLineNum = 69730645;BA.debugLine="If Not(parentDialog = Null) Then";
if (true) break;

case 125:
//if
this.state = 128;
if (parent.__c.Not(_parentdialog== null)) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=69730646;
 //BA.debugLineNum = 69730646;BA.debugLine="parentDialog.CloseDialog(DialogResponse.POSITIV";
_parentdialog.CloseDialog(ba,parent.__c.DialogResponse.POSITIVE);
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
RDebugUtils.currentLine=69730649;
 //BA.debugLineNum = 69730649;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _gettasklistdialog(xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activobj,anywheresoftware.b4a.sql.SQL.CursorWrapper _items) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "gettasklistdialog", false))
	 {Debug.delegate(ba, "gettasklistdialog", new Object[] {_activ,_activobj,_items}); return;}
ResumableSub_GetTaskListDialog rsub = new ResumableSub_GetTaskListDialog(this,__ref,_activ,_activobj,_items);
rsub.resume(ba, null);
}
public static class ResumableSub_GetTaskListDialog extends BA.ResumableSub {
public ResumableSub_GetTaskListDialog(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activobj,anywheresoftware.b4a.sql.SQL.CursorWrapper _items) {
this.parent = parent;
this.__ref = __ref;
this._activ = _activ;
this._activobj = _activobj;
this._items = _items;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.ActivityWrapper _activ;
Object _activobj;
anywheresoftware.b4a.sql.SQL.CursorWrapper _items;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _row = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _res = 0;
int step8;
int limit8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69599233;
 //BA.debugLineNum = 69599233;BA.debugLine="Dim sf As Object = ApplActionDialog.ShowAsync(\"Li";
_sf = __ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .ShowAsync("Lista de Tarefas","Cancelar","","",ba,(android.graphics.Bitmap)(parent.__c.Null),parent.__c.False);
RDebugUtils.currentLine=69599235;
 //BA.debugLineNum = 69599235;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent._utils._setdialogcolors /*String*/ (ba,_sf,parent._consts._colorwhite /*int*/ ,parent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=69599236;
 //BA.debugLineNum = 69599236;BA.debugLine="ApplActionDialog.SetSize(75%x, 75%y)";
__ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .SetSize(parent.__c.PerXToCurrent((float) (75),ba),parent.__c.PerYToCurrent((float) (75),ba));
RDebugUtils.currentLine=69599237;
 //BA.debugLineNum = 69599237;BA.debugLine="ThisActivityName_TaskListDialog = activObj";
__ref._thisactivityname_tasklistdialog /*Object*/  = _activobj;
RDebugUtils.currentLine=69599238;
 //BA.debugLineNum = 69599238;BA.debugLine="CurrentCLD = ApplActionDialog";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/  = __ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ;
RDebugUtils.currentLine=69599240;
 //BA.debugLineNum = 69599240;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
parent.__c.WaitFor("dialog_ready", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "gettasklistdialog"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[1];
;
RDebugUtils.currentLine=69599241;
 //BA.debugLineNum = 69599241;BA.debugLine="pnl.LoadLayout(\"dialog_task_list\")";
_pnl.LoadLayout("dialog_task_list",ba);
RDebugUtils.currentLine=69599243;
 //BA.debugLineNum = 69599243;BA.debugLine="For Row = 0 To items.RowCount-1";
if (true) break;

case 1:
//for
this.state = 8;
step8 = 1;
limit8 = (int) (_items.getRowCount()-1);
_row = (int) (0) ;
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
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=69599244;
 //BA.debugLineNum = 69599244;BA.debugLine="items.Position = Row";
_items.setPosition(_row);
RDebugUtils.currentLine=69599245;
 //BA.debugLineNum = 69599245;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69599246;
 //BA.debugLineNum = 69599246;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=69599247;
 //BA.debugLineNum = 69599247;BA.debugLine="activ.AddView(p, 0, 0, 100%x, 60dip)";
_activ.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),parent.__c.PerXToCurrent((float) (100),ba),parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=69599248;
 //BA.debugLineNum = 69599248;BA.debugLine="p.LoadLayout(\"ListItem_ViewSimpleList\")";
_p.LoadLayout("ListItem_ViewSimpleList",ba);
RDebugUtils.currentLine=69599249;
 //BA.debugLineNum = 69599249;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=69599250;
 //BA.debugLineNum = 69599250;BA.debugLine="ViewSimpleListTitle.text = items.GetString(\"name";
__ref._viewsimplelisttitle /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_items.GetString("name")));
RDebugUtils.currentLine=69599251;
 //BA.debugLineNum = 69599251;BA.debugLine="ViewSimpleListInfo.text = \"\"";
__ref._viewsimplelistinfo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=69599252;
 //BA.debugLineNum = 69599252;BA.debugLine="If (ShareCode.DEVICE_PARAM_AS_OBS2DETAILS = 1) T";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent._sharecode._device_param_as_obs2details /*int*/ ==1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=69599253;
 //BA.debugLineNum = 69599253;BA.debugLine="ViewSimpleListInfo.text = Utils.IfNullOrEmpty(i";
__ref._viewsimplelistinfo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(parent._utils._ifnullorempty /*String*/ (ba,_items.GetString("details"),"")));
 if (true) break;

case 7:
//C
this.state = 15;
;
RDebugUtils.currentLine=69599255;
 //BA.debugLineNum = 69599255;BA.debugLine="ViewSimpleListNumber.Text = $\"#${Row+1}\"$";
__ref._viewsimplelistnumber /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(("#"+parent.__c.SmartStringFormatter("",(Object)(_row+1))+"")));
RDebugUtils.currentLine=69599256;
 //BA.debugLineNum = 69599256;BA.debugLine="p.Tag = items.GetString(\"tagcode\")";
_p.setTag((Object)(_items.GetString("tagcode")));
RDebugUtils.currentLine=69599257;
 //BA.debugLineNum = 69599257;BA.debugLine="ViewSimpleList.Add(p, \"\") ', 60dip, \"\")";
__ref._viewsimplelist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())),(Object)(""));
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=69599259;
 //BA.debugLineNum = 69599259;BA.debugLine="items.close";
_items.Close();
RDebugUtils.currentLine=69599261;
 //BA.debugLineNum = 69599261;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
parent.__c.WaitFor("dialog_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "gettasklistdialog"), _sf);
this.state = 16;
return;
case 16:
//C
this.state = 9;
_res = (Integer) result[1];
;
RDebugUtils.currentLine=69599262;
 //BA.debugLineNum = 69599262;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_res==parent.__c.DialogResponse.POSITIVE) { 
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
RDebugUtils.currentLine=69599265;
 //BA.debugLineNum = 69599265;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _imageselected_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "imageselected_click", false))
	 {return ((String) Debug.delegate(ba, "imageselected_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _fln = null;
int _ncolor = 0;
int _state = 0;
int _val = 0;
RDebugUtils.currentLine=68681728;
 //BA.debugLineNum = 68681728;BA.debugLine="Sub imageSelected_Click";
RDebugUtils.currentLine=68681729;
 //BA.debugLineNum = 68681729;BA.debugLine="Dim lbl As Label = Sender";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=68681730;
 //BA.debugLineNum = 68681730;BA.debugLine="Dim pnl As Panel = lbl.Parent";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_lbl.getParent()));
RDebugUtils.currentLine=68681731;
 //BA.debugLineNum = 68681731;BA.debugLine="Dim fln As Label = pnl.GetView(1)";
_fln = new anywheresoftware.b4a.objects.LabelWrapper();
_fln = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=68681732;
 //BA.debugLineNum = 68681732;BA.debugLine="Dim nColor As Int = Consts.ColorLightSilver";
_ncolor = _consts._colorlightsilver /*int*/ ;
RDebugUtils.currentLine=68681733;
 //BA.debugLineNum = 68681733;BA.debugLine="Dim State As Int = 0";
_state = (int) (0);
RDebugUtils.currentLine=68681734;
 //BA.debugLineNum = 68681734;BA.debugLine="If Not(Utils.isNullOrEmpty(lbl.tag)) Then State =";
if (__c.Not(_utils._isnullorempty /*boolean*/ (ba,BA.ObjectToString(_lbl.getTag())))) { 
_state = (int)(BA.ObjectToNumber(_lbl.getTag()));};
RDebugUtils.currentLine=68681735;
 //BA.debugLineNum = 68681735;BA.debugLine="If (State = 0) Then";
if ((_state==0)) { 
RDebugUtils.currentLine=68681736;
 //BA.debugLineNum = 68681736;BA.debugLine="State = 1";
_state = (int) (1);
RDebugUtils.currentLine=68681737;
 //BA.debugLineNum = 68681737;BA.debugLine="nColor = Consts.ColorGreen";
_ncolor = _consts._colorgreen /*int*/ ;
RDebugUtils.currentLine=68681738;
 //BA.debugLineNum = 68681738;BA.debugLine="CurrentImageList.Add(fln.Text)";
__ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_fln.getText()));
 }else {
RDebugUtils.currentLine=68681740;
 //BA.debugLineNum = 68681740;BA.debugLine="State = 0";
_state = (int) (0);
RDebugUtils.currentLine=68681741;
 //BA.debugLineNum = 68681741;BA.debugLine="Dim val As Int = CurrentImageList.IndexOf(fln.Te";
_val = __ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_fln.getText()));
RDebugUtils.currentLine=68681742;
 //BA.debugLineNum = 68681742;BA.debugLine="If (val >= 0) Then";
if ((_val>=0)) { 
RDebugUtils.currentLine=68681743;
 //BA.debugLineNum = 68681743;BA.debugLine="CurrentImageList.RemoveAt(CurrentImageList.Inde";
__ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(__ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_fln.getText())));
 };
 };
RDebugUtils.currentLine=68681747;
 //BA.debugLineNum = 68681747;BA.debugLine="lbl.Tag = State";
_lbl.setTag((Object)(_state));
RDebugUtils.currentLine=68681748;
 //BA.debugLineNum = 68681748;BA.debugLine="lbl.TextColor = nColor";
_lbl.setTextColor(_ncolor);
RDebugUtils.currentLine=68681749;
 //BA.debugLineNum = 68681749;BA.debugLine="End Sub";
return "";
}
public String  _imageselectedonreport_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "imageselectedonreport_click", false))
	 {return ((String) Debug.delegate(ba, "imageselectedonreport_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _thisbut = null;
anywheresoftware.b4a.objects.PanelWrapper _thispanel = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
anywheresoftware.b4a.objects.LabelWrapper _fname = null;
RDebugUtils.currentLine=68812800;
 //BA.debugLineNum = 68812800;BA.debugLine="Sub imageSelectedOnReport_Click";
RDebugUtils.currentLine=68812801;
 //BA.debugLineNum = 68812801;BA.debugLine="Dim thisBut As Label = Sender";
_thisbut = new anywheresoftware.b4a.objects.LabelWrapper();
_thisbut = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=68812802;
 //BA.debugLineNum = 68812802;BA.debugLine="Dim thisPanel As Panel = thisBut.Parent";
_thispanel = new anywheresoftware.b4a.objects.PanelWrapper();
_thispanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_thisbut.getParent()));
RDebugUtils.currentLine=68812803;
 //BA.debugLineNum = 68812803;BA.debugLine="Dim this As RequestCLAItem = thisBut.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_thisbut.getTag());
RDebugUtils.currentLine=68812804;
 //BA.debugLineNum = 68812804;BA.debugLine="If (this.OnReport = 1) Then";
if ((_this.OnReport /*int*/ ==1)) { 
RDebugUtils.currentLine=68812805;
 //BA.debugLineNum = 68812805;BA.debugLine="this.OnReport = 0";
_this.OnReport /*int*/  = (int) (0);
RDebugUtils.currentLine=68812806;
 //BA.debugLineNum = 68812806;BA.debugLine="thisBut.TextColor = Consts.ColorLightSilver";
_thisbut.setTextColor(_consts._colorlightsilver /*int*/ );
 }else {
RDebugUtils.currentLine=68812808;
 //BA.debugLineNum = 68812808;BA.debugLine="this.OnReport = 1";
_this.OnReport /*int*/  = (int) (1);
RDebugUtils.currentLine=68812809;
 //BA.debugLineNum = 68812809;BA.debugLine="thisBut.TextColor = Consts.ColorGreen";
_thisbut.setTextColor(_consts._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=68812811;
 //BA.debugLineNum = 68812811;BA.debugLine="thisBut.Tag = this";
_thisbut.setTag((Object)(_this));
RDebugUtils.currentLine=68812812;
 //BA.debugLineNum = 68812812;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_thispanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=68812813;
 //BA.debugLineNum = 68812813;BA.debugLine="SetImageSelectedOnReport(this, fname, 0)";
__ref._setimageselectedonreport /*void*/ (null,_this,_fname,(int) (0));
RDebugUtils.currentLine=68812814;
 //BA.debugLineNum = 68812814;BA.debugLine="End Sub";
return "";
}
public void  _setimageselectedonreport(xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.objects.LabelWrapper _fname,int _fsid) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "setimageselectedonreport", false))
	 {Debug.delegate(ba, "setimageselectedonreport", new Object[] {_this,_fname,_fsid}); return;}
ResumableSub_SetImageSelectedOnReport rsub = new ResumableSub_SetImageSelectedOnReport(this,__ref,_this,_fname,_fsid);
rsub.resume(ba, null);
}
public static class ResumableSub_SetImageSelectedOnReport extends BA.ResumableSub {
public ResumableSub_SetImageSelectedOnReport(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,xevolution.vrcg.devdemov2400.types._requestclaitem _this,anywheresoftware.b4a.objects.LabelWrapper _fname,int _fsid) {
this.parent = parent;
this.__ref = __ref;
this._this = _this;
this._fname = _fname;
this._fsid = _fsid;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
anywheresoftware.b4a.objects.LabelWrapper _fname;
int _fsid;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68878337;
 //BA.debugLineNum = 68878337;BA.debugLine="Dim sSQL As String = $\"update dta_requests_values";
_ssql = ("update dta_requests_values_images set on_report="+parent.__c.SmartStringFormatter("",(Object)(_this.OnReport /*int*/ ))+" where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and\n"+"							item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"' and imagename='"+parent.__c.SmartStringFormatter("",(Object)(_fname.getText()))+"' and conf_sid_id="+parent.__c.SmartStringFormatter("",(Object)(_fsid))+"");
RDebugUtils.currentLine=68878339;
 //BA.debugLineNum = 68878339;BA.debugLine="Utils.SaveSQLToLog(\"imageSelectedOnReport_Click\",";
parent._utils._savesqltolog /*boolean*/ (ba,"imageSelectedOnReport_Click",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=68878342;
 //BA.debugLineNum = 68878342;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68878343;
 //BA.debugLineNum = 68878343;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=68878344;
 //BA.debugLineNum = 68878344;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=68878345;
 //BA.debugLineNum = 68878345;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=68878346;
 //BA.debugLineNum = 68878346;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=68878347;
 //BA.debugLineNum = 68878347;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=68878348;
 //BA.debugLineNum = 68878348;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=68878349;
 //BA.debugLineNum = 68878349;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=68878350;
 //BA.debugLineNum = 68878350;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=68878351;
 //BA.debugLineNum = 68878351;BA.debugLine="params.Put(\"ACLAValueFileImage\", fname.Text)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_fname.getText()));
RDebugUtils.currentLine=68878352;
 //BA.debugLineNum = 68878352;BA.debugLine="params.Put(\"ACLAOnReport\", this.OnReport)";
_params.Put((Object)("ACLAOnReport"),(Object)(_this.OnReport /*int*/ ));
RDebugUtils.currentLine=68878353;
 //BA.debugLineNum = 68878353;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=68878354;
 //BA.debugLineNum = 68878354;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCount";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=68878355;
 //BA.debugLineNum = 68878355;BA.debugLine="params.Put(\"ACLAConfSid\", fsid)";
_params.Put((Object)("ACLAConfSid"),(Object)(_fsid));
RDebugUtils.currentLine=68878356;
 //BA.debugLineNum = 68878356;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=68878357;
 //BA.debugLineNum = 68878357;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=68878358;
 //BA.debugLineNum = 68878358;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=68878359;
 //BA.debugLineNum = 68878359;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=68878360;
 //BA.debugLineNum = 68878360;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=68878361;
 //BA.debugLineNum = 68878361;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=68878362;
 //BA.debugLineNum = 68878362;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=68878363;
 //BA.debugLineNum = 68878363;BA.debugLine="If (params.IsInitialized) Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_params.IsInitialized())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=68878365;
 //BA.debugLineNum = 68878365;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update2");
RDebugUtils.currentLine=68878366;
 //BA.debugLineNum = 68878366;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=68878367;
 //BA.debugLineNum = 68878367;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=68878369;
 //BA.debugLineNum = 68878369;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=68878370;
 //BA.debugLineNum = 68878370;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=68878372;
 //BA.debugLineNum = 68878372;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "setimageselectedonreport"),(int) (250));
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
RDebugUtils.currentLine=68878374;
 //BA.debugLineNum = 68878374;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _imageselectedtrash_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "imageselectedtrash_click", false))
	 {return ((String) Debug.delegate(ba, "imageselectedtrash_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _sndr = null;
anywheresoftware.b4a.objects.B4XViewWrapper _thispanel = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
anywheresoftware.b4a.objects.LabelWrapper _fname = null;
RDebugUtils.currentLine=68747264;
 //BA.debugLineNum = 68747264;BA.debugLine="Sub imageSelectedTrash_Click";
RDebugUtils.currentLine=68747265;
 //BA.debugLineNum = 68747265;BA.debugLine="Dim sndr As Label = Sender";
_sndr = new anywheresoftware.b4a.objects.LabelWrapper();
_sndr = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=68747266;
 //BA.debugLineNum = 68747266;BA.debugLine="Dim thisPanel As B4XView = sndr.Parent";
_thispanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_thispanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sndr.getParent()));
RDebugUtils.currentLine=68747267;
 //BA.debugLineNum = 68747267;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_thispanel.getTag());
RDebugUtils.currentLine=68747268;
 //BA.debugLineNum = 68747268;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_thispanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=68747269;
 //BA.debugLineNum = 68747269;BA.debugLine="DeleteImageFromList(thisPanel, this, fname)";
__ref._deleteimagefromlist /*void*/ (null,_thispanel,_this,_fname);
RDebugUtils.currentLine=68747270;
 //BA.debugLineNum = 68747270;BA.debugLine="End Sub";
return "";
}
public String  _innersignatureonreport_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "innersignatureonreport_click", false))
	 {return ((String) Debug.delegate(ba, "innersignatureonreport_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _thisbut = null;
anywheresoftware.b4a.objects.PanelWrapper _thispanel = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
anywheresoftware.b4a.objects.LabelWrapper _fname = null;
RDebugUtils.currentLine=68157440;
 //BA.debugLineNum = 68157440;BA.debugLine="Sub InnerSignatureOnReport_Click";
RDebugUtils.currentLine=68157441;
 //BA.debugLineNum = 68157441;BA.debugLine="Dim thisBut As Label = Sender";
_thisbut = new anywheresoftware.b4a.objects.LabelWrapper();
_thisbut = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=68157442;
 //BA.debugLineNum = 68157442;BA.debugLine="Dim thisPanel As Panel = thisBut.Parent";
_thispanel = new anywheresoftware.b4a.objects.PanelWrapper();
_thispanel = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_thisbut.getParent()));
RDebugUtils.currentLine=68157443;
 //BA.debugLineNum = 68157443;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_thispanel.getTag());
RDebugUtils.currentLine=68157444;
 //BA.debugLineNum = 68157444;BA.debugLine="If (this.OnReport = 1) Then";
if ((_this.OnReport /*int*/ ==1)) { 
RDebugUtils.currentLine=68157445;
 //BA.debugLineNum = 68157445;BA.debugLine="this.OnReport = 0";
_this.OnReport /*int*/  = (int) (0);
RDebugUtils.currentLine=68157446;
 //BA.debugLineNum = 68157446;BA.debugLine="thisBut.TextColor = Consts.ColorLightSilver";
_thisbut.setTextColor(_consts._colorlightsilver /*int*/ );
 }else {
RDebugUtils.currentLine=68157448;
 //BA.debugLineNum = 68157448;BA.debugLine="this.OnReport = 1";
_this.OnReport /*int*/  = (int) (1);
RDebugUtils.currentLine=68157449;
 //BA.debugLineNum = 68157449;BA.debugLine="thisBut.TextColor = Consts.ColorGreen";
_thisbut.setTextColor(_consts._colorgreen /*int*/ );
 };
RDebugUtils.currentLine=68157451;
 //BA.debugLineNum = 68157451;BA.debugLine="thisBut.Tag = this";
_thisbut.setTag((Object)(_this));
RDebugUtils.currentLine=68157452;
 //BA.debugLineNum = 68157452;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_thispanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=68157453;
 //BA.debugLineNum = 68157453;BA.debugLine="SetImageSelectedOnReport(this, fname, 4)";
__ref._setimageselectedonreport /*void*/ (null,_this,_fname,(int) (4));
RDebugUtils.currentLine=68157454;
 //BA.debugLineNum = 68157454;BA.debugLine="End Sub";
return "";
}
public void  _innersignatureremove_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "innersignatureremove_click", false))
	 {Debug.delegate(ba, "innersignatureremove_click", null); return;}
ResumableSub_InnerSignatureRemove_Click rsub = new ResumableSub_InnerSignatureRemove_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_InnerSignatureRemove_Click extends BA.ResumableSub {
public ResumableSub_InnerSignatureRemove_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.objects.LabelWrapper _sndr = null;
anywheresoftware.b4a.objects.B4XViewWrapper _thispanel = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
anywheresoftware.b4a.objects.LabelWrapper _fname = null;
int _index = 0;
int _i = 0;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68091905;
 //BA.debugLineNum = 68091905;BA.debugLine="Dim sndr As Label = Sender";
_sndr = new anywheresoftware.b4a.objects.LabelWrapper();
_sndr = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=68091906;
 //BA.debugLineNum = 68091906;BA.debugLine="Dim thisPanel As B4XView = sndr.Parent";
_thispanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_thispanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_sndr.getParent()));
RDebugUtils.currentLine=68091907;
 //BA.debugLineNum = 68091907;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_thispanel.getTag());
RDebugUtils.currentLine=68091908;
 //BA.debugLineNum = 68091908;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_thispanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=68091909;
 //BA.debugLineNum = 68091909;BA.debugLine="Dim Index As Int = itemSignatures.GetItemFromView";
_index = __ref._itemsignatures /*b4a.example3.customlistview*/ ._getitemfromview(_thispanel);
RDebugUtils.currentLine=68091912;
 //BA.debugLineNum = 68091912;BA.debugLine="If (this.BaseImage = 1) Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_this.BaseImage /*int*/ ==1)) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=68091913;
 //BA.debugLineNum = 68091913;BA.debugLine="MsgboxAsync(\"A imagem seleccionada é uma imagem";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("A imagem seleccionada é uma imagem BASE e não pode ser apagada!"),BA.ObjectToCharSequence("Alerta!"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=68091916;
 //BA.debugLineNum = 68091916;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.CLAImageRemove,";
_i = parent.__c.Msgbox2(BA.ObjectToCharSequence(parent._sharecode._claimageremove /*String*/ ),BA.ObjectToCharSequence(parent._sharecode._generalalerttitle /*String*/ ),parent._sharecode._option_yes /*String*/ ,parent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(parent.__c.Null),ba);
RDebugUtils.currentLine=68091917;
 //BA.debugLineNum = 68091917;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 6:
//if
this.state = 19;
if ((_i==parent.__c.DialogResponse.POSITIVE)) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=68091922;
 //BA.debugLineNum = 68091922;BA.debugLine="Dim sSQL As String = $\"delete from dta_requests";
_ssql = ("delete from dta_requests_values_images where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and\n"+"									item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"' and imagename='"+parent.__c.SmartStringFormatter("",(Object)(_fname.getText()))+"'\n"+"									And repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"									And repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
RDebugUtils.currentLine=68091927;
 //BA.debugLineNum = 68091927;BA.debugLine="Utils.SaveSQLToLog(\"ItemImages_ItemLongClick\",s";
parent._utils._savesqltolog /*boolean*/ (ba,"ItemImages_ItemLongClick",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=68091929;
 //BA.debugLineNum = 68091929;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("668091929",_ssql,0);
RDebugUtils.currentLine=68091930;
 //BA.debugLineNum = 68091930;BA.debugLine="itemSignatures.RemoveAt(Index)";
__ref._itemsignatures /*b4a.example3.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=68091932;
 //BA.debugLineNum = 68091932;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68091933;
 //BA.debugLineNum = 68091933;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=68091934;
 //BA.debugLineNum = 68091934;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=68091935;
 //BA.debugLineNum = 68091935;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=68091936;
 //BA.debugLineNum = 68091936;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=68091937;
 //BA.debugLineNum = 68091937;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=68091938;
 //BA.debugLineNum = 68091938;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=68091939;
 //BA.debugLineNum = 68091939;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=68091940;
 //BA.debugLineNum = 68091940;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=68091941;
 //BA.debugLineNum = 68091941;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=68091942;
 //BA.debugLineNum = 68091942;BA.debugLine="params.Put(\"ACLAValueFileImage\", fname.Text)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_fname.getText()));
RDebugUtils.currentLine=68091944;
 //BA.debugLineNum = 68091944;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=68091945;
 //BA.debugLineNum = 68091945;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCou";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=68091946;
 //BA.debugLineNum = 68091946;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=68091947;
 //BA.debugLineNum = 68091947;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=68091948;
 //BA.debugLineNum = 68091948;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=68091949;
 //BA.debugLineNum = 68091949;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=68091950;
 //BA.debugLineNum = 68091950;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=68091951;
 //BA.debugLineNum = 68091951;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=68091952;
 //BA.debugLineNum = 68091952;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=68091953;
 //BA.debugLineNum = 68091953;BA.debugLine="If (params.IsInitialized) Then";
if (true) break;

case 9:
//if
this.state = 18;
if ((_params.IsInitialized())) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=68091956;
 //BA.debugLineNum = 68091956;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/delete");
RDebugUtils.currentLine=68091957;
 //BA.debugLineNum = 68091957;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=68091958;
 //BA.debugLineNum = 68091958;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=68091960;
 //BA.debugLineNum = 68091960;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=68091961;
 //BA.debugLineNum = 68091961;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=68091963;
 //BA.debugLineNum = 68091963;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "innersignatureremove_click"),(int) (250));
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
RDebugUtils.currentLine=68091968;
 //BA.debugLineNum = 68091968;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _itemasviewrelated_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemasviewrelated_click", false))
	 {return ((String) Debug.delegate(ba, "itemasviewrelated_click", null));}
RDebugUtils.currentLine=67371008;
 //BA.debugLineNum = 67371008;BA.debugLine="Sub ItemASViewRelated_Click";
RDebugUtils.currentLine=67371010;
 //BA.debugLineNum = 67371010;BA.debugLine="End Sub";
return "";
}
public void  _itemimages_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemimages_itemclick", false))
	 {Debug.delegate(ba, "itemimages_itemclick", new Object[] {_index,_value}); return;}
ResumableSub_ItemImages_ItemClick rsub = new ResumableSub_ItemImages_ItemClick(this,__ref,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_ItemImages_ItemClick extends BA.ResumableSub {
public ResumableSub_ItemImages_ItemClick(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
int _index;
Object _value;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
String _imgb64 = "";
String _imgb64name = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
boolean _havebaseimage = false;
String _innertag = "";
boolean _havefileimage = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=68550657;
 //BA.debugLineNum = 68550657;BA.debugLine="Dim pan As Panel = ItemImages.GetPanel(Index)";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._itemimages /*b4a.example3.customlistview*/ ._getpanel(_index).getObject()));
RDebugUtils.currentLine=68550658;
 //BA.debugLineNum = 68550658;BA.debugLine="Dim this As RequestCLAItem = pan.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_pan.getTag());
RDebugUtils.currentLine=68550659;
 //BA.debugLineNum = 68550659;BA.debugLine="Dim ImageFilename As Label = pan.GetView(1)";
parent._imagefilename = new anywheresoftware.b4a.objects.LabelWrapper();
parent._imagefilename = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pan.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=68550660;
 //BA.debugLineNum = 68550660;BA.debugLine="Dim ImgB64 As String = \"\"";
_imgb64 = "";
RDebugUtils.currentLine=68550661;
 //BA.debugLineNum = 68550661;BA.debugLine="Dim ImgB64Name As String = \"\"";
_imgb64name = "";
RDebugUtils.currentLine=68550662;
 //BA.debugLineNum = 68550662;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=68550671;
 //BA.debugLineNum = 68550671;BA.debugLine="If (Utils.NNE( this.Tagcode)) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils._nne /*boolean*/ (ba,_this.Tagcode /*String*/ ))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=68550672;
 //BA.debugLineNum = 68550672;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=68550681;
 //BA.debugLineNum = 68550681;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=68550689;
 //BA.debugLineNum = 68550689;BA.debugLine="Utils.SaveSQLToLog(\"ItemImages_ItemClick\",sSQL, t";
parent._utils._savesqltolog /*boolean*/ (ba,"ItemImages_ItemClick",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=68550693;
 //BA.debugLineNum = 68550693;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=68550694;
 //BA.debugLineNum = 68550694;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=68550695;
 //BA.debugLineNum = 68550695;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=68550696;
 //BA.debugLineNum = 68550696;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=68550697;
 //BA.debugLineNum = 68550697;BA.debugLine="params.Put(\"ACLRequest\", this.Request)";
_params.Put((Object)("ACLRequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=68550698;
 //BA.debugLineNum = 68550698;BA.debugLine="params.Put(\"ACLAction\", this.Action)";
_params.Put((Object)("ACLAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=68550699;
 //BA.debugLineNum = 68550699;BA.debugLine="params.Put(\"ACLTask\", this.Task)";
_params.Put((Object)("ACLTask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=68550700;
 //BA.debugLineNum = 68550700;BA.debugLine="params.Put(\"ACLItem\", this.Item)";
_params.Put((Object)("ACLItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=68550701;
 //BA.debugLineNum = 68550701;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=68550702;
 //BA.debugLineNum = 68550702;BA.debugLine="params.Put(\"ACLTagcode\", this.Tagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=68550703;
 //BA.debugLineNum = 68550703;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=68550704;
 //BA.debugLineNum = 68550704;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=68550705;
 //BA.debugLineNum = 68550705;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCount";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=68550706;
 //BA.debugLineNum = 68550706;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=68550707;
 //BA.debugLineNum = 68550707;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=68550708;
 //BA.debugLineNum = 68550708;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=68550709;
 //BA.debugLineNum = 68550709;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=68550710;
 //BA.debugLineNum = 68550710;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=68550711;
 //BA.debugLineNum = 68550711;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=68550712;
 //BA.debugLineNum = 68550712;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=68550713;
 //BA.debugLineNum = 68550713;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=68550714;
 //BA.debugLineNum = 68550714;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=68550715;
 //BA.debugLineNum = 68550715;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Reque";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=68550717;
 //BA.debugLineNum = 68550717;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=68550718;
 //BA.debugLineNum = 68550718;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=68550720;
 //BA.debugLineNum = 68550720;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "itemimages_itemclick"),(int) (500));
this.state = 86;
return;
case 86:
//C
this.state = 13;
;
RDebugUtils.currentLine=68550722;
 //BA.debugLineNum = 68550722;BA.debugLine="Dim HaveBaseImage As Boolean = False";
_havebaseimage = parent.__c.False;
RDebugUtils.currentLine=68550723;
 //BA.debugLineNum = 68550723;BA.debugLine="If (this.BaseImage = 1) Then";
if (true) break;

case 13:
//if
this.state = 26;
if ((_this.BaseImage /*int*/ ==1)) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=68550724;
 //BA.debugLineNum = 68550724;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=68550725;
 //BA.debugLineNum = 68550725;BA.debugLine="Dim sSQL As String = $\"select distinct ifnull(a.";
_ssql = ("select distinct ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 1 as base_image, 0 as on_report\n"+"			from dta_tasks_items as a \n"+"			inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode \n"+"					and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)\n"+"			where b.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' \n"+"				and b.inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"' \n"+"				and b.task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' \n"+"				and b.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' \n"+"				and b.unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' \n"+"				and b.repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and b.repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
RDebugUtils.currentLine=68550736;
 //BA.debugLineNum = 68550736;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=68550738;
 //BA.debugLineNum = 68550738;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_record2.getRowCount()>0) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=68550739;
 //BA.debugLineNum = 68550739;BA.debugLine="Record2.Position = 0";
_record2.setPosition((int) (0));
RDebugUtils.currentLine=68550741;
 //BA.debugLineNum = 68550741;BA.debugLine="ImgB64 = Record2.GetString(\"imageb64\")";
_imgb64 = _record2.GetString("imageb64");
RDebugUtils.currentLine=68550742;
 //BA.debugLineNum = 68550742;BA.debugLine="ImgB64 = ImgB64.Replace(\"data:image/png;base64,";
_imgb64 = _imgb64.replace("data:image/png;base64,","");
RDebugUtils.currentLine=68550743;
 //BA.debugLineNum = 68550743;BA.debugLine="ImgB64Name = Record2.GetString(\"imagename\")";
_imgb64name = _record2.GetString("imagename");
RDebugUtils.currentLine=68550745;
 //BA.debugLineNum = 68550745;BA.debugLine="HaveBaseImage = Utils.NNE(ImgB64) Or Utils.NNE(";
_havebaseimage = parent._utils._nne /*boolean*/ (ba,_imgb64) || parent._utils._nne /*boolean*/ (ba,_imgb64name);
 if (true) break;

case 19:
//C
this.state = 26;
;
RDebugUtils.currentLine=68550748;
 //BA.debugLineNum = 68550748;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=68550750;
 //BA.debugLineNum = 68550750;BA.debugLine="Dim sSQL As String = $\"select distinct ifnull(a.";
_ssql = ("select distinct ifnull(a.image,'') as imageb64, ifnull(a.filename,'') as imagename, 1 as base_image, 0 as on_report\n"+"			from dta_tasks_items as a \n"+"			inner join dta_requests_values as b on (b.task_tagcode=b.task_tagcode \n"+"					and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key)\n"+"			where b.request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' \n"+"				and b.inner_request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"' \n"+"				and b.task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' \n"+"				and b.item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' \n"+"				and b.unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' \n"+"				and b.repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and b.repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
RDebugUtils.currentLine=68550761;
 //BA.debugLineNum = 68550761;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=68550763;
 //BA.debugLineNum = 68550763;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 22:
//if
this.state = 25;
if (_record2.getRowCount()>0) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=68550764;
 //BA.debugLineNum = 68550764;BA.debugLine="Record2.Position = 0";
_record2.setPosition((int) (0));
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
RDebugUtils.currentLine=68550770;
 //BA.debugLineNum = 68550770;BA.debugLine="Dim innerTag As String = ImageFilename.Tag";
_innertag = BA.ObjectToString(__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag());
RDebugUtils.currentLine=68550771;
 //BA.debugLineNum = 68550771;BA.debugLine="If Not(HaveBaseImage) Then";
if (true) break;

case 27:
//if
this.state = 38;
if (parent.__c.Not(_havebaseimage)) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=68550772;
 //BA.debugLineNum = 68550772;BA.debugLine="If Utils.NNE(innerTag) Then";
if (true) break;

case 30:
//if
this.state = 37;
if (parent._utils._nne /*boolean*/ (ba,_innertag)) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=68550773;
 //BA.debugLineNum = 68550773;BA.debugLine="Dim sSQL As String = $\"Select ifnull(a.image, '";
_ssql = ("Select ifnull(a.image, '') as image from  dta_objects as a where a.tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_innertag))+"'");
RDebugUtils.currentLine=68550774;
 //BA.debugLineNum = 68550774;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=68550775;
 //BA.debugLineNum = 68550775;BA.debugLine="If Record2.RowCount > 0 Then";
if (true) break;

case 33:
//if
this.state = 36;
if (_record2.getRowCount()>0) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=68550776;
 //BA.debugLineNum = 68550776;BA.debugLine="Record2.Position = 0";
_record2.setPosition((int) (0));
RDebugUtils.currentLine=68550777;
 //BA.debugLineNum = 68550777;BA.debugLine="ImgB64 = Record2.GetString(\"image\")";
_imgb64 = _record2.GetString("image");
RDebugUtils.currentLine=68550778;
 //BA.debugLineNum = 68550778;BA.debugLine="ImgB64 = ImgB64.Replace(\"data:image/png;base64";
_imgb64 = _imgb64.replace("data:image/png;base64,","");
RDebugUtils.currentLine=68550779;
 //BA.debugLineNum = 68550779;BA.debugLine="ImgB64Name = \"\"";
_imgb64name = "";
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
RDebugUtils.currentLine=68550785;
 //BA.debugLineNum = 68550785;BA.debugLine="Record2.Close";
_record2.Close();
RDebugUtils.currentLine=68550787;
 //BA.debugLineNum = 68550787;BA.debugLine="If File.Exists(Starter.InternalFolder, ImageFilen";
if (true) break;

case 39:
//if
this.state = 48;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText())) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=68550788;
 //BA.debugLineNum = 68550788;BA.debugLine="Try";
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
RDebugUtils.currentLine=68550789;
 //BA.debugLineNum = 68550789;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=68550790;
 //BA.debugLineNum = 68550790;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=68550791;
 //BA.debugLineNum = 68550791;BA.debugLine="ImgB64 = Base64Con.EncodeFromImage(Starter.Inte";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,__ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText());
RDebugUtils.currentLine=68550792;
 //BA.debugLineNum = 68550792;BA.debugLine="ImgB64Name = ImageFilename.Text";
_imgb64name = __ref._imagefilename /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText();
 if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 0;
RDebugUtils.currentLine=68550794;
 //BA.debugLineNum = 68550794;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("668550794",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=68550795;
 //BA.debugLineNum = 68550795;BA.debugLine="ImgB64 = \"\"";
_imgb64 = "";
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
RDebugUtils.currentLine=68550800;
 //BA.debugLineNum = 68550800;BA.debugLine="Dim HaveFileImage As Boolean = Utils.NNE(ImgB64)";
_havefileimage = parent._utils._nne /*boolean*/ (ba,_imgb64) && parent._utils._nne /*boolean*/ (ba,_imgb64name);
RDebugUtils.currentLine=68550801;
 //BA.debugLineNum = 68550801;BA.debugLine="If Not(HaveFileImage) Then";
if (true) break;

case 49:
//if
this.state = 62;
if (parent.__c.Not(_havefileimage)) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=68550802;
 //BA.debugLineNum = 68550802;BA.debugLine="If File.Exists(Starter.InternalFolder, \"CROQUI.p";
if (true) break;

case 52:
//if
this.state = 61;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,"CROQUI.png")) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=68550803;
 //BA.debugLineNum = 68550803;BA.debugLine="Try";
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
RDebugUtils.currentLine=68550804;
 //BA.debugLineNum = 68550804;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=68550805;
 //BA.debugLineNum = 68550805;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=68550806;
 //BA.debugLineNum = 68550806;BA.debugLine="ImgB64 = Base64Con.EncodeFromImage(Starter.Int";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,"CROQUI.png");
 if (true) break;

case 59:
//C
this.state = 60;
this.catchState = 0;
RDebugUtils.currentLine=68550808;
 //BA.debugLineNum = 68550808;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("668550808",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=68550809;
 //BA.debugLineNum = 68550809;BA.debugLine="ImgB64 = \"\"";
_imgb64 = "";
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
RDebugUtils.currentLine=68550813;
 //BA.debugLineNum = 68550813;BA.debugLine="HaveFileImage = (Utils.NNE(ImgB64))";
_havefileimage = (parent._utils._nne /*boolean*/ (ba,_imgb64));
RDebugUtils.currentLine=68550815;
 //BA.debugLineNum = 68550815;BA.debugLine="If Not(HaveFileImage) Then";
if (true) break;

case 63:
//if
this.state = 80;
if (parent.__c.Not(_havefileimage)) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=68550816;
 //BA.debugLineNum = 68550816;BA.debugLine="If (Utils.NNE(ImgB64Name)) Then";
if (true) break;

case 66:
//if
this.state = 79;
if ((parent._utils._nne /*boolean*/ (ba,_imgb64name))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=68550817;
 //BA.debugLineNum = 68550817;BA.debugLine="If File.Exists(Starter.InternalFolder, ImgB64Na";
if (true) break;

case 69:
//if
this.state = 78;
if (parent.__c.File.Exists(parent._starter._internalfolder /*String*/ ,_imgb64name)) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=68550818;
 //BA.debugLineNum = 68550818;BA.debugLine="Try";
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
RDebugUtils.currentLine=68550819;
 //BA.debugLineNum = 68550819;BA.debugLine="Dim Base64Con As Base64Convert";
parent._base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=68550820;
 //BA.debugLineNum = 68550820;BA.debugLine="Base64Con.Initialize";
__ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._initialize(ba);
RDebugUtils.currentLine=68550822;
 //BA.debugLineNum = 68550822;BA.debugLine="ImgB64 = Base64Con.EncodeFromImage(Starter.In";
_imgb64 = __ref._base64con /*com.simplysoftware.base64convert.base64convert*/ ._v6(parent._starter._internalfolder /*String*/ ,_imgb64name);
 if (true) break;

case 76:
//C
this.state = 77;
this.catchState = 0;
RDebugUtils.currentLine=68550824;
 //BA.debugLineNum = 68550824;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("668550824",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=68550825;
 //BA.debugLineNum = 68550825;BA.debugLine="ImgB64 = \"\"";
_imgb64 = "";
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
RDebugUtils.currentLine=68550832;
 //BA.debugLineNum = 68550832;BA.debugLine="If Utils.NNE(ImgB64) Then";

case 80:
//if
this.state = 85;
if (parent._utils._nne /*boolean*/ (ba,_imgb64)) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 85;
RDebugUtils.currentLine=68550833;
 //BA.debugLineNum = 68550833;BA.debugLine="CallSubDelayed3(ImageEdit, \"StartDrawFrom3\", Img";
parent.__c.CallSubDelayed3(ba,(Object)(parent._imageedit.getObject()),"StartDrawFrom3",(Object)(_imgb64),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ));
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=68550835;
 //BA.debugLineNum = 68550835;BA.debugLine="MsgboxAsync(\"Erro na identificação da imagem sel";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Erro na identificação da imagem seleccionada!"),BA.ObjectToCharSequence("Alerta!"),ba);
 if (true) break;

case 85:
//C
this.state = -1;
;
RDebugUtils.currentLine=68550837;
 //BA.debugLineNum = 68550837;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _itemimages_itemlongclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemimages_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "itemimages_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _thispanel = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
anywheresoftware.b4a.objects.LabelWrapper _fname = null;
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Sub ItemImages_ItemLongClick (Index As Int, Value";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="Log(Value)";
__c.LogImpl("670385665",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="Dim thisPanel As B4XView = ItemImages.GetPanel(In";
_thispanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_thispanel = __ref._itemimages /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=70385667;
 //BA.debugLineNum = 70385667;BA.debugLine="Dim this As RequestCLAItem = thisPanel.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_thispanel.getTag());
RDebugUtils.currentLine=70385668;
 //BA.debugLineNum = 70385668;BA.debugLine="Dim fname As Label = thisPanel.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_thispanel.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=70385669;
 //BA.debugLineNum = 70385669;BA.debugLine="DeleteImageFromList(thisPanel, this, fname)";
__ref._deleteimagefromlist /*void*/ (null,_thispanel,_this,_fname);
RDebugUtils.currentLine=70385670;
 //BA.debugLineNum = 70385670;BA.debugLine="End Sub";
return "";
}
public String  _itemimages_longclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemimages_longclick", false))
	 {return ((String) Debug.delegate(ba, "itemimages_longclick", null));}
RDebugUtils.currentLine=68616192;
 //BA.debugLineNum = 68616192;BA.debugLine="Sub ItemImages_LongClick";
RDebugUtils.currentLine=68616194;
 //BA.debugLineNum = 68616194;BA.debugLine="End Sub";
return "";
}
public void  _itemnotes_focuschanged(xevolution.vrcg.devdemov2400.appactiondialogs __ref,boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemnotes_focuschanged", false))
	 {Debug.delegate(ba, "itemnotes_focuschanged", new Object[] {_hasfocus}); return;}
ResumableSub_ItemNotes_FocusChanged rsub = new ResumableSub_ItemNotes_FocusChanged(this,__ref,_hasfocus);
rsub.resume(ba, null);
}
public static class ResumableSub_ItemNotes_FocusChanged extends BA.ResumableSub {
public ResumableSub_ItemNotes_FocusChanged(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,boolean _hasfocus) {
this.parent = parent;
this.__ref = __ref;
this._hasfocus = _hasfocus;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
boolean _hasfocus;
anywheresoftware.b4a.objects.EditTextWrapper _curr = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70582273;
 //BA.debugLineNum = 70582273;BA.debugLine="Dim curr As EditText = Sender";
_curr = new anywheresoftware.b4a.objects.EditTextWrapper();
_curr = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=70582274;
 //BA.debugLineNum = 70582274;BA.debugLine="If Not(HasFocus) Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent.__c.Not(_hasfocus)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=70582275;
 //BA.debugLineNum = 70582275;BA.debugLine="Dim this As RequestCLAItem = curr.tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_curr.getTag());
RDebugUtils.currentLine=70582277;
 //BA.debugLineNum = 70582277;BA.debugLine="CurrentItemNotesText = Utils.IfNullOrEmpty(Curre";
__ref._currentitemnotestext /*String*/  = parent._utils._ifnullorempty /*String*/ (ba,__ref._currentitemnotestext /*String*/ ,__ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText());
RDebugUtils.currentLine=70582278;
 //BA.debugLineNum = 70582278;BA.debugLine="Log($\"CurrentItemNotesText:${CurrentItemNotesTex";
parent.__c.LogImpl("670582278",("CurrentItemNotesText:"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+""),0);
RDebugUtils.currentLine=70582280;
 //BA.debugLineNum = 70582280;BA.debugLine="If (Utils.NNE( this.Tagcode)) Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._utils._nne /*boolean*/ (ba,_this.Tagcode /*String*/ ))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=70582281;
 //BA.debugLineNum = 70582281;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=70582290;
 //BA.debugLineNum = 70582290;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=70582298;
 //BA.debugLineNum = 70582298;BA.debugLine="Utils.SaveSQLToLog(\"ItemNotes_FocusChanged\",sSQL";
parent._utils._savesqltolog /*boolean*/ (ba,"ItemNotes_FocusChanged",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=70582301;
 //BA.debugLineNum = 70582301;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=70582302;
 //BA.debugLineNum = 70582302;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=70582303;
 //BA.debugLineNum = 70582303;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=70582304;
 //BA.debugLineNum = 70582304;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=70582305;
 //BA.debugLineNum = 70582305;BA.debugLine="params.Put(\"ACLRequest\", this.Request)";
_params.Put((Object)("ACLRequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=70582306;
 //BA.debugLineNum = 70582306;BA.debugLine="params.Put(\"ACLAction\", this.Action)";
_params.Put((Object)("ACLAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=70582307;
 //BA.debugLineNum = 70582307;BA.debugLine="params.Put(\"ACLTask\", this.Task)";
_params.Put((Object)("ACLTask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=70582308;
 //BA.debugLineNum = 70582308;BA.debugLine="params.Put(\"ACLItem\", this.Item)";
_params.Put((Object)("ACLItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=70582309;
 //BA.debugLineNum = 70582309;BA.debugLine="params.Put(\"ACLUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=70582310;
 //BA.debugLineNum = 70582310;BA.debugLine="params.Put(\"ACLTagcode\", this.Tagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=70582311;
 //BA.debugLineNum = 70582311;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=70582312;
 //BA.debugLineNum = 70582312;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=70582313;
 //BA.debugLineNum = 70582313;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCoun";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=70582314;
 //BA.debugLineNum = 70582314;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=70582315;
 //BA.debugLineNum = 70582315;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=70582316;
 //BA.debugLineNum = 70582316;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=70582317;
 //BA.debugLineNum = 70582317;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=70582318;
 //BA.debugLineNum = 70582318;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=70582319;
 //BA.debugLineNum = 70582319;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=70582320;
 //BA.debugLineNum = 70582320;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=70582323;
 //BA.debugLineNum = 70582323;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=70582324;
 //BA.debugLineNum = 70582324;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 10:
//if
this.state = 15;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=70582325;
 //BA.debugLineNum = 70582325;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Requ";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",_this.Request /*String*/ );
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=70582327;
 //BA.debugLineNum = 70582327;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=70582328;
 //BA.debugLineNum = 70582328;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=70582330;
 //BA.debugLineNum = 70582330;BA.debugLine="Sleep(500)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "itemnotes_focuschanged"),(int) (500));
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
RDebugUtils.currentLine=70582333;
 //BA.debugLineNum = 70582333;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _itemnotes_textchanged(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemnotes_textchanged", false))
	 {return ((String) Debug.delegate(ba, "itemnotes_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Sub ItemNotes_TextChanged (Old As String, New As S";
RDebugUtils.currentLine=70647810;
 //BA.debugLineNum = 70647810;BA.debugLine="CurrentItemNotesText = ItemNotes.Text";
__ref._currentitemnotestext /*String*/  = __ref._itemnotes /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=70647867;
 //BA.debugLineNum = 70647867;BA.debugLine="End Sub";
return "";
}
public String  _itemsignatures_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemsignatures_itemclick", false))
	 {return ((String) Debug.delegate(ba, "itemsignatures_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
anywheresoftware.b4a.objects.collections.List _info = null;
anywheresoftware.b4a.objects.LabelWrapper _fname = null;
xevolution.vrcg.devdemov2400.types._imageviewdata _imgdata = null;
anywheresoftware.b4a.objects.collections.List _imglist = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
int _nrows = 0;
int _row = 0;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=66781184;
 //BA.debugLineNum = 66781184;BA.debugLine="Sub itemSignatures_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=66781185;
 //BA.debugLineNum = 66781185;BA.debugLine="Try";
try {RDebugUtils.currentLine=66781188;
 //BA.debugLineNum = 66781188;BA.debugLine="Dim pnl As Panel = itemSignatures.GetPanel(Index";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__ref._itemsignatures /*b4a.example3.customlistview*/ ._getpanel(_index).getObject()));
RDebugUtils.currentLine=66781190;
 //BA.debugLineNum = 66781190;BA.debugLine="Dim this As RequestCLAItem = pnl.Tag";
_this = (xevolution.vrcg.devdemov2400.types._requestclaitem)(_pnl.getTag());
RDebugUtils.currentLine=66781191;
 //BA.debugLineNum = 66781191;BA.debugLine="Dim info As List = Regex.Split(\"\\|\", pnl.tag )";
_info = new anywheresoftware.b4a.objects.collections.List();
_info = anywheresoftware.b4a.keywords.Common.ArrayToList(__c.Regex.Split("\\|",BA.ObjectToString(_pnl.getTag())));
RDebugUtils.currentLine=66781192;
 //BA.debugLineNum = 66781192;BA.debugLine="Dim fname As Label = pnl.GetView(1)";
_fname = new anywheresoftware.b4a.objects.LabelWrapper();
_fname = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=66781197;
 //BA.debugLineNum = 66781197;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImageV";
_imgdata = _types._makeimageviewdataclear /*xevolution.vrcg.devdemov2400.types._imageviewdata*/ (ba);
RDebugUtils.currentLine=66781198;
 //BA.debugLineNum = 66781198;BA.debugLine="Dim imgList As List";
_imglist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66781199;
 //BA.debugLineNum = 66781199;BA.debugLine="imgList.Initialize";
_imglist.Initialize();
RDebugUtils.currentLine=66781200;
 //BA.debugLineNum = 66781200;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=66781203;
 //BA.debugLineNum = 66781203;BA.debugLine="Dim SQL As String = $\"select id,tagcode,imageb64";
_sql = ("select id,tagcode,imageb64,imagename from dta_requests_values_images where request_tagcode='"+__c.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"' and task_tagcode='"+__c.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"' and\n"+"										item_tagcode='"+__c.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"' and unique_key='"+__c.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"' and tagcode='"+__c.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"' and imagename='"+__c.SmartStringFormatter("",(Object)(_fname.getText()))+"'\n"+"										And repeatcounter="+__c.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+"\n"+"										And repeatitemcounter="+__c.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+"");
RDebugUtils.currentLine=66781207;
 //BA.debugLineNum = 66781207;BA.debugLine="Log(SQL)";
__c.LogImpl("666781207",_sql,0);
RDebugUtils.currentLine=66781208;
 //BA.debugLineNum = 66781208;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=66781210;
 //BA.debugLineNum = 66781210;BA.debugLine="Dim nRows As Int = Record.RowCount";
_nrows = _record.getRowCount();
RDebugUtils.currentLine=66781211;
 //BA.debugLineNum = 66781211;BA.debugLine="If nRows > 0 Then";
if (_nrows>0) { 
RDebugUtils.currentLine=66781212;
 //BA.debugLineNum = 66781212;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
RDebugUtils.currentLine=66781214;
 //BA.debugLineNum = 66781214;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=66781215;
 //BA.debugLineNum = 66781215;BA.debugLine="Dim imgdata As ImageViewData = Types.MakeImag";
_imgdata = _types._makeimageviewdata /*xevolution.vrcg.devdemov2400.types._imageviewdata*/ (ba,_record.GetString("imageb64"),_record.GetString("imagename"));
RDebugUtils.currentLine=66781216;
 //BA.debugLineNum = 66781216;BA.debugLine="imgList.Add(imgdata)";
_imglist.Add((Object)(_imgdata));
 }
};
 }else {
RDebugUtils.currentLine=66781219;
 //BA.debugLineNum = 66781219;BA.debugLine="imgList.Add(imgdata)";
_imglist.Add((Object)(_imgdata));
 };
RDebugUtils.currentLine=66781221;
 //BA.debugLineNum = 66781221;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=66781223;
 //BA.debugLineNum = 66781223;BA.debugLine="If Utils.NNE(imgdata.b64) Then";
if (_utils._nne /*boolean*/ (ba,_imgdata.b64 /*String*/ )) { 
RDebugUtils.currentLine=66781224;
 //BA.debugLineNum = 66781224;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=66781225;
 //BA.debugLineNum = 66781225;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=66781226;
 //BA.debugLineNum = 66781226;BA.debugLine="Filter.getShowImageViewListDialog(Me, imgList)";
_filter._getshowimageviewlistdialog /*void*/ (null,this,_imglist);
 };
 } 
       catch (Exception e30) {
			ba.setLastException(e30);RDebugUtils.currentLine=66781231;
 //BA.debugLineNum = 66781231;BA.debugLine="Log(LastException.Message)";
__c.LogImpl("666781231",__c.LastException(ba).getMessage(),0);
 };
RDebugUtils.currentLine=66781233;
 //BA.debugLineNum = 66781233;BA.debugLine="End Sub";
return "";
}
public String  _itemsignatures_itemlongclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "itemsignatures_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "itemsignatures_itemlongclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=66846720;
 //BA.debugLineNum = 66846720;BA.debugLine="Sub itemSignatures_ItemLongClick (Index As Int, Va";
RDebugUtils.currentLine=66846722;
 //BA.debugLineNum = 66846722;BA.debugLine="End Sub";
return "";
}
public String  _liststabpanel_pageselected(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "liststabpanel_pageselected", false))
	 {return ((String) Debug.delegate(ba, "liststabpanel_pageselected", new Object[] {_position}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=68485120;
 //BA.debugLineNum = 68485120;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=68485121;
 //BA.debugLineNum = 68485121;BA.debugLine="Dim lst As List = Utils.GetAllTabLabels(listsTabP";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = _utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (ba,__ref._liststabpanel /*anywheresoftware.b4a.objects.TabStripViewPager*/ );
RDebugUtils.currentLine=68485122;
 //BA.debugLineNum = 68485122;BA.debugLine="For Each lbl As Label In lst";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group2.Get(index2)));
RDebugUtils.currentLine=68485123;
 //BA.debugLineNum = 68485123;BA.debugLine="lbl.TextColor = Colors.White";
_lbl.setTextColor(__c.Colors.White);
 }
};
RDebugUtils.currentLine=68485125;
 //BA.debugLineNum = 68485125;BA.debugLine="Dim lbl As Label = lst.Get(Position)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_lst.Get(_position)));
RDebugUtils.currentLine=68485126;
 //BA.debugLineNum = 68485126;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=68485127;
 //BA.debugLineNum = 68485127;BA.debugLine="End Sub";
return "";
}
public void  _obsoptions_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "obsoptions_itemclick", false))
	 {Debug.delegate(ba, "obsoptions_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_obsOptions_ItemClick rsub = new ResumableSub_obsOptions_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_obsOptions_ItemClick extends BA.ResumableSub {
public ResumableSub_obsOptions_ItemClick(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
int _position;
Object _value;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=69337089;
 //BA.debugLineNum = 69337089;BA.debugLine="If (Position = 0) Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_position==0)) { 
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
RDebugUtils.currentLine=69337100;
 //BA.debugLineNum = 69337100;BA.debugLine="If (Utils.NNE( CurrentCLAItem.Tagcode)) Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((parent._utils._nne /*boolean*/ (ba,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=69337101;
 //BA.debugLineNum = 69337101;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=69337110;
 //BA.debugLineNum = 69337110;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=69337118;
 //BA.debugLineNum = 69337118;BA.debugLine="Utils.SaveSQLToLog(\"obsOptions_ItemClick\",sSQL,";
parent._utils._savesqltolog /*boolean*/ (ba,"obsOptions_ItemClick",_ssql,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
RDebugUtils.currentLine=69337122;
 //BA.debugLineNum = 69337122;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69337123;
 //BA.debugLineNum = 69337123;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=69337124;
 //BA.debugLineNum = 69337124;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=69337125;
 //BA.debugLineNum = 69337125;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=69337126;
 //BA.debugLineNum = 69337126;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
_params.Put((Object)("ACLRequest"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ ));
RDebugUtils.currentLine=69337127;
 //BA.debugLineNum = 69337127;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
_params.Put((Object)("ACLAction"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ));
RDebugUtils.currentLine=69337128;
 //BA.debugLineNum = 69337128;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
_params.Put((Object)("ACLTask"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ));
RDebugUtils.currentLine=69337129;
 //BA.debugLineNum = 69337129;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
_params.Put((Object)("ACLItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ));
RDebugUtils.currentLine=69337130;
 //BA.debugLineNum = 69337130;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.Unique";
_params.Put((Object)("ACLUniqueKey"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ));
RDebugUtils.currentLine=69337131;
 //BA.debugLineNum = 69337131;BA.debugLine="params.Put(\"ACLTagcode\", CurrentCLAItem.Tagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ));
RDebugUtils.currentLine=69337132;
 //BA.debugLineNum = 69337132;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=69337133;
 //BA.debugLineNum = 69337133;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repe";
_params.Put((Object)("ACLAReqCounter"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ));
RDebugUtils.currentLine=69337134;
 //BA.debugLineNum = 69337134;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repe";
_params.Put((Object)("ACLARepeatItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=69337135;
 //BA.debugLineNum = 69337135;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=69337136;
 //BA.debugLineNum = 69337136;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=69337137;
 //BA.debugLineNum = 69337137;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=69337138;
 //BA.debugLineNum = 69337138;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=69337139;
 //BA.debugLineNum = 69337139;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=69337140;
 //BA.debugLineNum = 69337140;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=69337141;
 //BA.debugLineNum = 69337141;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=69337142;
 //BA.debugLineNum = 69337142;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=69337143;
 //BA.debugLineNum = 69337143;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=69337144;
 //BA.debugLineNum = 69337144;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCL";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=69337146;
 //BA.debugLineNum = 69337146;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=69337147;
 //BA.debugLineNum = 69337147;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=69337149;
 //BA.debugLineNum = 69337149;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "obsoptions_itemclick"),(int) (1000));
this.state = 19;
return;
case 19:
//C
this.state = 18;
;
RDebugUtils.currentLine=69337151;
 //BA.debugLineNum = 69337151;BA.debugLine="obsOptions.SelectedIndex = 0";
__ref._obsoptions /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (0));
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=69337153;
 //BA.debugLineNum = 69337153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadfileswithftpcamimage(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "uploadfileswithftpcamimage", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "uploadfileswithftpcamimage", new Object[] {_filename}));}
ResumableSub_UploadFilesWithFTPCamImage rsub = new ResumableSub_UploadFilesWithFTPCamImage(this,__ref,_filename);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadFilesWithFTPCamImage extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTPCamImage(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _filename) {
this.parent = parent;
this.__ref = __ref;
this._filename = _filename;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _filename;
boolean _ret = false;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="Dim ret As Boolean = False";
_ret = parent.__c.False;
RDebugUtils.currentLine=71303170;
 //BA.debugLineNum = 71303170;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=71303171;
 //BA.debugLineNum = 71303171;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(ba,"ftp",(""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_ftp_user /*String*/ ))+"@"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=71303172;
 //BA.debugLineNum = 71303172;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(parent.__c.True);
RDebugUtils.currentLine=71303176;
 //BA.debugLineNum = 71303176;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=71303177;
 //BA.debugLineNum = 71303177;BA.debugLine="Log(filename)";
parent.__c.LogImpl("671303177",_filename,0);
RDebugUtils.currentLine=71303178;
 //BA.debugLineNum = 71303178;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
_sf = _myftp.UploadFile(ba,parent._starter._internalfolder /*String*/ ,_filename,parent.__c.False,"/"+parent._sharecode._app_domain /*String*/ +"/docs/"+_filename);
RDebugUtils.currentLine=71303179;
 //BA.debugLineNum = 71303179;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
parent.__c.WaitFor("ftp_uploadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "uploadfileswithftpcamimage"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (Boolean) result[2];
;
RDebugUtils.currentLine=71303180;
 //BA.debugLineNum = 71303180;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=71303181;
 //BA.debugLineNum = 71303181;BA.debugLine="Log(\"file was uploaded successfully\")";
parent.__c.LogImpl("671303181","file was uploaded successfully",0);
RDebugUtils.currentLine=71303182;
 //BA.debugLineNum = 71303182;BA.debugLine="ret = True";
_ret = parent.__c.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=71303184;
 //BA.debugLineNum = 71303184;BA.debugLine="Log(\"Error uploading file\")";
parent.__c.LogImpl("671303184","Error uploading file",0);
RDebugUtils.currentLine=71303185;
 //BA.debugLineNum = 71303185;BA.debugLine="ret = False";
_ret = parent.__c.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=71303187;
 //BA.debugLineNum = 71303187;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=71303188;
 //BA.debugLineNum = 71303188;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "uploadfileswithftpcamimage"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=71303190;
 //BA.debugLineNum = 71303190;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
parent.__c.LogImpl("671303190","UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU",0);
RDebugUtils.currentLine=71303191;
 //BA.debugLineNum = 71303191;BA.debugLine="Log(\"upload\")";
parent.__c.LogImpl("671303191","upload",0);
RDebugUtils.currentLine=71303192;
 //BA.debugLineNum = 71303192;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
parent.__c.LogImpl("671303192","UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU",0);
RDebugUtils.currentLine=71303193;
 //BA.debugLineNum = 71303193;BA.debugLine="Return ret";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_ret));return;};
RDebugUtils.currentLine=71303194;
 //BA.debugLineNum = 71303194;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sendemail_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "sendemail_click", false))
	 {return ((String) Debug.delegate(ba, "sendemail_click", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Sub sendEmail_Click";
RDebugUtils.currentLine=69468162;
 //BA.debugLineNum = 69468162;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69468163;
 //BA.debugLineNum = 69468163;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=69468164;
 //BA.debugLineNum = 69468164;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=69468165;
 //BA.debugLineNum = 69468165;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=69468166;
 //BA.debugLineNum = 69468166;BA.debugLine="Filter.GetMoreSendEmailDialog(CurrentCLAItem, Cur";
_filter._getmoresendemaildialog /*void*/ (null,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,__ref._currenttagcode /*String*/ ,__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ,__ref._currentitemnotestext /*String*/ ,_lst);
RDebugUtils.currentLine=69468167;
 //BA.debugLineNum = 69468167;BA.debugLine="End Sub";
return "";
}
public String  _sendemailimages_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "sendemailimages_click", false))
	 {return ((String) Debug.delegate(ba, "sendemailimages_click", null));}
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Sub sendEmailImages_Click";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="If (CurrentImageList.Size >= 1) Then";
if ((__ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=1)) { 
RDebugUtils.currentLine=69533698;
 //BA.debugLineNum = 69533698;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=69533699;
 //BA.debugLineNum = 69533699;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=69533700;
 //BA.debugLineNum = 69533700;BA.debugLine="Filter.GetMoreSendEmailDialog(CurrentCLAItem, Cu";
_filter._getmoresendemaildialog /*void*/ (null,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,__ref._currenttagcode /*String*/ ,__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ ,__ref._currentitemnotestext /*String*/ ,__ref._currentimagelist /*anywheresoftware.b4a.objects.collections.List*/ );
 }else {
RDebugUtils.currentLine=69533702;
 //BA.debugLineNum = 69533702;BA.debugLine="MsgboxAsync(\"Tem de seleccionar 1 ou mais imagen";
__c.MsgboxAsync(BA.ObjectToCharSequence("Tem de seleccionar 1 ou mais imagens para poder continuar!"),BA.ObjectToCharSequence("Alerta!"),ba);
 };
RDebugUtils.currentLine=69533704;
 //BA.debugLineNum = 69533704;BA.debugLine="End Sub";
return "";
}
public String  _showobjectgallery_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "showobjectgallery_click", false))
	 {return ((String) Debug.delegate(ba, "showobjectgallery_click", null));}
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=71041024;
 //BA.debugLineNum = 71041024;BA.debugLine="Sub showObjectGallery_Click";
RDebugUtils.currentLine=71041025;
 //BA.debugLineNum = 71041025;BA.debugLine="ApplActionDialog.CloseDialog(DialogResponse.PO";
__ref._applactiondialog /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=71041026;
 //BA.debugLineNum = 71041026;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=71041027;
 //BA.debugLineNum = 71041027;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=71041028;
 //BA.debugLineNum = 71041028;BA.debugLine="Filter.AddMoreImagesToObject(CurrentActivity,Curr";
_filter._addmoreimagestoobject /*void*/ (null,__ref._currentactivity /*anywheresoftware.b4a.objects.ActivityWrapper*/ ,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ,__ref._associateimagescompletelist /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=71041029;
 //BA.debugLineNum = 71041029;BA.debugLine="End Sub";
return "";
}
public String  _signpanel_touch(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "signpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "signpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=68222976;
 //BA.debugLineNum = 68222976;BA.debugLine="Sub SignPanel_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=68222977;
 //BA.debugLineNum = 68222977;BA.debugLine="SignatureCapture.Panel_Touch(Signature, x, y, Act";
_signaturecapture._panel_touch /*String*/ (ba,__ref._signature /*xevolution.vrcg.devdemov2400.signaturecapture._signaturedata*/ ,(int) (_x),(int) (_y),_action);
RDebugUtils.currentLine=68222978;
 //BA.debugLineNum = 68222978;BA.debugLine="End Sub";
return "";
}
public void  _takegeophoto_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takegeophoto_click", false))
	 {Debug.delegate(ba, "takegeophoto_click", null); return;}
ResumableSub_takeGeoPhoto_Click rsub = new ResumableSub_takeGeoPhoto_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_takeGeoPhoto_Click extends BA.ResumableSub {
public ResumableSub_takeGeoPhoto_Click(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordrow = null;
String _latitude = "";
String _longitude = "";
String _ssqll = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.objects.collections.Map _location = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=70778887;
 //BA.debugLineNum = 70778887;BA.debugLine="Dim RecordRow As Cursor";
_recordrow = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=70778888;
 //BA.debugLineNum = 70778888;BA.debugLine="Dim Latitude As String = \"\"";
_latitude = "";
RDebugUtils.currentLine=70778889;
 //BA.debugLineNum = 70778889;BA.debugLine="Dim Longitude As String = \"\"";
_longitude = "";
RDebugUtils.currentLine=70778892;
 //BA.debugLineNum = 70778892;BA.debugLine="If(Utils.NNE( CurrentCLAItem.Tagcode)) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils._nne /*boolean*/ (ba,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=70778893;
 //BA.debugLineNum = 70778893;BA.debugLine="Dim sSQLL As String = $\"select execute_latitude,";
_ssqll = ("select execute_latitude, execute_longitude from dta_requests_values\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=70778903;
 //BA.debugLineNum = 70778903;BA.debugLine="Dim sSQLL As String = $\"select execute_latitude,";
_ssqll = ("select execute_latitude, execute_longitude from dta_requests_values\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=70778916;
 //BA.debugLineNum = 70778916;BA.debugLine="RecordRow = Starter.LocalSQLEVC.ExecQuery(sSQLL)";
_recordrow = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssqll)));
RDebugUtils.currentLine=70778917;
 //BA.debugLineNum = 70778917;BA.debugLine="If RecordRow.RowCount > 0 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_recordrow.getRowCount()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=70778918;
 //BA.debugLineNum = 70778918;BA.debugLine="RecordRow.Position = 0";
_recordrow.setPosition((int) (0));
RDebugUtils.currentLine=70778919;
 //BA.debugLineNum = 70778919;BA.debugLine="Latitude = RecordRow.GetString(\"execute_latitude";
_latitude = _recordrow.GetString("execute_latitude");
RDebugUtils.currentLine=70778920;
 //BA.debugLineNum = 70778920;BA.debugLine="Longitude = RecordRow.GetString(\"execute_longitu";
_longitude = _recordrow.GetString("execute_longitude");
 if (true) break;
;
RDebugUtils.currentLine=70778924;
 //BA.debugLineNum = 70778924;BA.debugLine="If(Utils.NNE(Latitude) And Utils.NNE(Longitude))";

case 10:
//if
this.state = 27;
if ((parent._utils._nne /*boolean*/ (ba,_latitude) && parent._utils._nne /*boolean*/ (ba,_longitude))) { 
this.state = 12;
}else {
this.state = 26;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=70778926;
 //BA.debugLineNum = 70778926;BA.debugLine="If (Utils.NNE( CurrentCLAItem.Tagcode)) Then";
if (true) break;

case 13:
//if
this.state = 18;
if ((parent._utils._nne /*boolean*/ (ba,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ))) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=70778927;
 //BA.debugLineNum = 70778927;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"					where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"					and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"					and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"					and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"					and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ .trim()))+"' \n"+"					and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"					and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=70778936;
 //BA.debugLineNum = 70778936;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentitemnotestext /*String*/ ))+"'\n"+"					where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"					and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"					and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"					and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"					and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"					and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"");
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=70778944;
 //BA.debugLineNum = 70778944;BA.debugLine="Utils.SaveSQLToLog(\"takePhoto_Click\",sSQL, Curre";
parent._utils._savesqltolog /*boolean*/ (ba,"takePhoto_Click",_ssql,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
RDebugUtils.currentLine=70778946;
 //BA.debugLineNum = 70778946;BA.debugLine="Log(sSQL)";
parent.__c.LogImpl("670778946",_ssql,0);
RDebugUtils.currentLine=70778947;
 //BA.debugLineNum = 70778947;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=70778948;
 //BA.debugLineNum = 70778948;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=70778949;
 //BA.debugLineNum = 70778949;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=70778950;
 //BA.debugLineNum = 70778950;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=70778951;
 //BA.debugLineNum = 70778951;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
_params.Put((Object)("ACLRequest"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ ));
RDebugUtils.currentLine=70778952;
 //BA.debugLineNum = 70778952;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
_params.Put((Object)("ACLAction"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ));
RDebugUtils.currentLine=70778953;
 //BA.debugLineNum = 70778953;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
_params.Put((Object)("ACLTask"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ));
RDebugUtils.currentLine=70778954;
 //BA.debugLineNum = 70778954;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
_params.Put((Object)("ACLItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ));
RDebugUtils.currentLine=70778955;
 //BA.debugLineNum = 70778955;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.Unique";
_params.Put((Object)("ACLUniqueKey"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ));
RDebugUtils.currentLine=70778956;
 //BA.debugLineNum = 70778956;BA.debugLine="params.Put(\"ACLTagcode\", CurrentCLAItem.Tagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Tagcode /*String*/ ));
RDebugUtils.currentLine=70778957;
 //BA.debugLineNum = 70778957;BA.debugLine="params.Put(\"ACLAObs\", CurrentItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(__ref._currentitemnotestext /*String*/ ));
RDebugUtils.currentLine=70778958;
 //BA.debugLineNum = 70778958;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repe";
_params.Put((Object)("ACLAReqCounter"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ));
RDebugUtils.currentLine=70778959;
 //BA.debugLineNum = 70778959;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repe";
_params.Put((Object)("ACLARepeatItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=70778960;
 //BA.debugLineNum = 70778960;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=70778961;
 //BA.debugLineNum = 70778961;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=70778962;
 //BA.debugLineNum = 70778962;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=70778963;
 //BA.debugLineNum = 70778963;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=70778964;
 //BA.debugLineNum = 70778964;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=70778965;
 //BA.debugLineNum = 70778965;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=70778966;
 //BA.debugLineNum = 70778966;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=70778967;
 //BA.debugLineNum = 70778967;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=70778968;
 //BA.debugLineNum = 70778968;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And No";
if (true) break;

case 19:
//if
this.state = 24;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=70778969;
 //BA.debugLineNum = 70778969;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCL";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=70778971;
 //BA.debugLineNum = 70778971;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=70778972;
 //BA.debugLineNum = 70778972;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 24:
//C
this.state = 27;
;
RDebugUtils.currentLine=70778974;
 //BA.debugLineNum = 70778974;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "takegeophoto_click"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = 27;
;
RDebugUtils.currentLine=70778976;
 //BA.debugLineNum = 70778976;BA.debugLine="Dim location As Map";
_location = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=70778977;
 //BA.debugLineNum = 70778977;BA.debugLine="location.Initialize";
_location.Initialize();
RDebugUtils.currentLine=70778978;
 //BA.debugLineNum = 70778978;BA.debugLine="location.Put(\"latitude\", Latitude)";
_location.Put((Object)("latitude"),(Object)(_latitude));
RDebugUtils.currentLine=70778979;
 //BA.debugLineNum = 70778979;BA.debugLine="location.Put(\"longitude\", Longitude)";
_location.Put((Object)("longitude"),(Object)(_longitude));
RDebugUtils.currentLine=70778981;
 //BA.debugLineNum = 70778981;BA.debugLine="ShareCode.CalledFromAlerts = False";
parent._sharecode._calledfromalerts /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=70778982;
 //BA.debugLineNum = 70778982;BA.debugLine="CallSubDelayed3(MapsActivity, \"StartMapsActivity";
parent.__c.CallSubDelayed3(ba,(Object)(parent._mapsactivity.getObject()),"StartMapsActivity",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ ),(Object)(_location));
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=70778985;
 //BA.debugLineNum = 70778985;BA.debugLine="ToastMessageShow(\"Esta pergunta não tem localiza";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Esta pergunta não tem localização disponível"),parent.__c.True);
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=70778988;
 //BA.debugLineNum = 70778988;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _takenewdesign_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takenewdesign_click", false))
	 {return ((String) Debug.delegate(ba, "takenewdesign_click", null));}
RDebugUtils.currentLine=69074944;
 //BA.debugLineNum = 69074944;BA.debugLine="Sub takeNewDesign_Click";
RDebugUtils.currentLine=69074991;
 //BA.debugLineNum = 69074991;BA.debugLine="End Sub";
return "";
}
public String  _takeobsoption_click(xevolution.vrcg.devdemov2400.appactiondialogs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "takeobsoption_click", false))
	 {return ((String) Debug.delegate(ba, "takeobsoption_click", null));}
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Sub takeObsOption_Click";
RDebugUtils.currentLine=69402625;
 //BA.debugLineNum = 69402625;BA.debugLine="obsOptions_ItemClick(obsOptions.SelectedIndex, \"\"";
__ref._obsoptions_itemclick /*void*/ (null,__ref._obsoptions /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex(),(Object)(""));
RDebugUtils.currentLine=69402626;
 //BA.debugLineNum = 69402626;BA.debugLine="End Sub";
return "";
}
public void  _updatenotestoserver(xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _tagcode,String _itemnotestext) throws Exception{
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "updatenotestoserver", false))
	 {Debug.delegate(ba, "updatenotestoserver", new Object[] {_tagcode,_itemnotestext}); return;}
ResumableSub_UpdateNotesToServer rsub = new ResumableSub_UpdateNotesToServer(this,__ref,_tagcode,_itemnotestext);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateNotesToServer extends BA.ResumableSub {
public ResumableSub_UpdateNotesToServer(xevolution.vrcg.devdemov2400.appactiondialogs parent,xevolution.vrcg.devdemov2400.appactiondialogs __ref,String _tagcode,String _itemnotestext) {
this.parent = parent;
this.__ref = __ref;
this._tagcode = _tagcode;
this._itemnotestext = _itemnotestext;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.appactiondialogs __ref;
xevolution.vrcg.devdemov2400.appactiondialogs parent;
String _tagcode;
String _itemnotestext;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="appactiondialogs";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=71368706;
 //BA.debugLineNum = 71368706;BA.debugLine="If (Utils.NNE(Tagcode)) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._utils._nne /*boolean*/ (ba,_tagcode))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=71368707;
 //BA.debugLineNum = 71368707;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(_itemnotestext))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and tagcode='"+parent.__c.SmartStringFormatter("",(Object)(_tagcode))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=71368717;
 //BA.debugLineNum = 71368717;BA.debugLine="Dim sSQL As String = $\"update dta_requests_value";
_ssql = ("update dta_requests_values set execute_notes='"+parent.__c.SmartStringFormatter("",(Object)(_itemnotestext))+"'\n"+"				where request_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim()))+"' \n"+"				and task_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim()))+"' \n"+"				and item_tagcode='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim()))+"' \n"+"				and unique_key='"+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ .trim()))+"' \n"+"				and repeatcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ))+"\n"+"				and repeatitemcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ))+"\n"+"				and repeatfieldcounter="+parent.__c.SmartStringFormatter("",(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ))+"");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=71368726;
 //BA.debugLineNum = 71368726;BA.debugLine="Utils.SaveSQLToLog(\"takeAS_Click\",sSQL, CurrentCL";
parent._utils._savesqltolog /*boolean*/ (ba,"takeAS_Click",_ssql,__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
RDebugUtils.currentLine=71368728;
 //BA.debugLineNum = 71368728;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=71368729;
 //BA.debugLineNum = 71368729;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=71368730;
 //BA.debugLineNum = 71368730;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=71368731;
 //BA.debugLineNum = 71368731;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=71368732;
 //BA.debugLineNum = 71368732;BA.debugLine="params.Put(\"ACLRequest\", CurrentCLAItem.Request)";
_params.Put((Object)("ACLRequest"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ ));
RDebugUtils.currentLine=71368733;
 //BA.debugLineNum = 71368733;BA.debugLine="params.Put(\"ACLAction\", CurrentCLAItem.Action)";
_params.Put((Object)("ACLAction"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Action /*String*/ ));
RDebugUtils.currentLine=71368734;
 //BA.debugLineNum = 71368734;BA.debugLine="params.Put(\"ACLTask\", CurrentCLAItem.Task)";
_params.Put((Object)("ACLTask"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ ));
RDebugUtils.currentLine=71368735;
 //BA.debugLineNum = 71368735;BA.debugLine="params.Put(\"ACLItem\", CurrentCLAItem.Item)";
_params.Put((Object)("ACLItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ ));
RDebugUtils.currentLine=71368736;
 //BA.debugLineNum = 71368736;BA.debugLine="params.Put(\"ACLUniqueKey\", CurrentCLAItem.UniqueK";
_params.Put((Object)("ACLUniqueKey"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .UniqueKey /*String*/ ));
RDebugUtils.currentLine=71368737;
 //BA.debugLineNum = 71368737;BA.debugLine="params.Put(\"ACLTagcode\", Tagcode)";
_params.Put((Object)("ACLTagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=71368738;
 //BA.debugLineNum = 71368738;BA.debugLine="params.Put(\"ACLAObs\", ItemNotesText)";
_params.Put((Object)("ACLAObs"),(Object)(_itemnotestext));
RDebugUtils.currentLine=71368739;
 //BA.debugLineNum = 71368739;BA.debugLine="params.Put(\"ACLAReqCounter\", CurrentCLAItem.Repea";
_params.Put((Object)("ACLAReqCounter"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatCounter /*int*/ ));
RDebugUtils.currentLine=71368740;
 //BA.debugLineNum = 71368740;BA.debugLine="params.Put(\"ACLARepeatItem\", CurrentCLAItem.Repea";
_params.Put((Object)("ACLARepeatItem"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=71368741;
 //BA.debugLineNum = 71368741;BA.debugLine="params.Put(\"ACLARepeatField\", CurrentCLAItem.repe";
_params.Put((Object)("ACLARepeatField"),(Object)(__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .repeatfieldcounter /*int*/ ));
RDebugUtils.currentLine=71368742;
 //BA.debugLineNum = 71368742;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=71368743;
 //BA.debugLineNum = 71368743;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=71368744;
 //BA.debugLineNum = 71368744;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=71368745;
 //BA.debugLineNum = 71368745;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=71368746;
 //BA.debugLineNum = 71368746;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=71368747;
 //BA.debugLineNum = 71368747;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=71368748;
 //BA.debugLineNum = 71368748;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=71368749;
 //BA.debugLineNum = 71368749;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._app_domain /*String*/ ))+"."+parent.__c.SmartStringFormatter("",(Object)(parent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/obs/update");
RDebugUtils.currentLine=71368750;
 //BA.debugLineNum = 71368750;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And Not";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.Not(parent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=71368751;
 //BA.debugLineNum = 71368751;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CurrentCLA";
parent._utils._callapi /*String*/ (ba,(int) (0),_params,parent,_url,"",__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ );
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=71368753;
 //BA.debugLineNum = 71368753;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (ba,(int) (1),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Request /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Task /*String*/ .trim(),__ref._currentclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ .Item /*String*/ .trim());
RDebugUtils.currentLine=71368754;
 //BA.debugLineNum = 71368754;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent._utils._save2update /*String*/ (ba,_url,parent._utils._maptojson /*String*/ (ba,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=71368756;
 //BA.debugLineNum = 71368756;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "appactiondialogs", "updatenotestoserver"),(int) (250));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=71368757;
 //BA.debugLineNum = 71368757;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _viewsimplelist_itemclick(xevolution.vrcg.devdemov2400.appactiondialogs __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="appactiondialogs";
if (Debug.shouldDelegate(ba, "viewsimplelist_itemclick", false))
	 {return ((String) Debug.delegate(ba, "viewsimplelist_itemclick", new Object[] {_index,_value}));}
b4a.example3.customlistview _clv = null;
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Sub ViewSimpleList_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=69664769;
 //BA.debugLineNum = 69664769;BA.debugLine="Dim clv As CustomListView = Sender";
_clv = (b4a.example3.customlistview)(__c.Sender(ba));
RDebugUtils.currentLine=69664770;
 //BA.debugLineNum = 69664770;BA.debugLine="Dim pan As Panel = clv.GetPanel(Index)";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_clv._getpanel(_index).getObject()));
RDebugUtils.currentLine=69664771;
 //BA.debugLineNum = 69664771;BA.debugLine="CallSub2(ThisActivityName_TaskListDialog, \"TaskLi";
__c.CallSubDebug2(ba,__ref._thisactivityname_tasklistdialog /*Object*/ ,"TaskListItemSelected",_pan.getTag());
RDebugUtils.currentLine=69664772;
 //BA.debugLineNum = 69664772;BA.debugLine="CurrentCLD.CloseDialog(DialogResponse.POSITIVE)";
__ref._currentcld /*anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog*/ .CloseDialog(ba,__c.DialogResponse.POSITIVE);
RDebugUtils.currentLine=69664773;
 //BA.debugLineNum = 69664773;BA.debugLine="End Sub";
return "";
}
}