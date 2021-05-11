package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dialogitemactions_subs_0 {


public static RemoteObject  _camerareturn(RemoteObject __ref,RemoteObject _shots) throws Exception{
try {
		Debug.PushSubsStack("CameraReturn (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("camerareturn")) { return __ref.runUserSub(false, "dialogitemactions","camerareturn", __ref, _shots);}
RemoteObject _cols = RemoteObject.createImmutable(0);
RemoteObject _rows = RemoteObject.createImmutable(0);
RemoteObject _colstart = RemoteObject.createImmutable(0);
RemoteObject _isfirst = RemoteObject.createImmutable(false);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(false);
RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _colindex = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("shots", _shots);
 BA.debugLineNum = 159;BA.debugLine="Public Sub CameraReturn(shots As List)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 169;BA.debugLine="imagesTotal = imagesTotal + shots.Size";
Debug.ShouldStop(256);
__ref.setField ("_imagestotal" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_imagestotal" /*RemoteObject*/ ),_shots.runMethod(true,"getSize")}, "+",1, 1));
 BA.debugLineNum = 170;BA.debugLine="Dim Cols As Int = imageTotalCols 'Floor(OwnerPane";
Debug.ShouldStop(512);
_cols = __ref.getField(true,"_imagetotalcols" /*RemoteObject*/ );Debug.locals.put("Cols", _cols);Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 171;BA.debugLine="Dim Rows As Int = Round2((imagesTotal + 1) / Cols";
Debug.ShouldStop(1024);
_rows = BA.numberCast(int.class, dialogitemactions.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_imagestotal" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1)),_cols}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Rows", _rows);Debug.locals.put("Rows", _rows);
 BA.debugLineNum = 172;BA.debugLine="Dim colStart As Int = imageCol";
Debug.ShouldStop(2048);
_colstart = __ref.getField(true,"_imagecol" /*RemoteObject*/ );Debug.locals.put("colStart", _colstart);Debug.locals.put("colStart", _colstart);
 BA.debugLineNum = 174;BA.debugLine="Dim isFirst As Boolean = False";
Debug.ShouldStop(8192);
_isfirst = dialogitemactions.__c.getField(true,"False");Debug.locals.put("isFirst", _isfirst);Debug.locals.put("isFirst", _isfirst);
 BA.debugLineNum = 175;BA.debugLine="Dim index As Int = 0";
Debug.ShouldStop(16384);
_index = BA.numberCast(int.class, 0);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 176;BA.debugLine="Dim Out As Boolean = False";
Debug.ShouldStop(32768);
_out = dialogitemactions.__c.getField(true,"False");Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 177;BA.debugLine="Dim xui As XUI";
Debug.ShouldStop(65536);
_xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");Debug.locals.put("xui", _xui);
 BA.debugLineNum = 179;BA.debugLine="For i = imageRow To Rows";
Debug.ShouldStop(262144);
{
final int step9 = 1;
final int limit9 = _rows.<Integer>get().intValue();
_i = __ref.getField(true,"_imagerow" /*RemoteObject*/ ).<Integer>get().intValue() ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 180;BA.debugLine="If (colStart = Cols) Then";
Debug.ShouldStop(524288);
if ((RemoteObject.solveBoolean("=",_colstart,BA.numberCast(double.class, _cols)))) { 
 BA.debugLineNum = 181;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 182;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2097152);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 183;BA.debugLine="ParentWindow.AddView(p, 0, 0, 100%x, 165dip)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_parentwindow" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(dialogitemactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(dialogitemactions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 165)))));
 BA.debugLineNum = 184;BA.debugLine="Dim colindex As Int = 0";
Debug.ShouldStop(8388608);
_colindex = BA.numberCast(int.class, 0);Debug.locals.put("colindex", _colindex);Debug.locals.put("colindex", _colindex);
 BA.debugLineNum = 185;BA.debugLine="If isFirst Then";
Debug.ShouldStop(16777216);
if (_isfirst.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 186;BA.debugLine="p.LoadLayout(\"imgView\")";
Debug.ShouldStop(33554432);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("imgView")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 188;BA.debugLine="p.LoadLayout(\"imgViewNextRow\")";
Debug.ShouldStop(134217728);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("imgViewNextRow")),__ref.getField(false, "ba"));
 };
 }else {
 BA.debugLineNum = 192;BA.debugLine="Dim p As Panel = mngImagesArea.GetPanel(i-1)";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), __ref.getField(false,"_mngimagesarea" /*RemoteObject*/ ).runMethod(false,"_getpanel",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))).getObject());Debug.locals.put("p", _p);
 };
 BA.debugLineNum = 194;BA.debugLine="p.Height = 175dip";
Debug.ShouldStop(2);
_p.runMethod(true,"setHeight",dialogitemactions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 175))));
 BA.debugLineNum = 195;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 197;BA.debugLine="For n = colStart To Cols";
Debug.ShouldStop(16);
{
final int step25 = 1;
final int limit25 = _cols.<Integer>get().intValue();
_n = _colstart.<Integer>get().intValue() ;
for (;(step25 > 0 && _n <= limit25) || (step25 < 0 && _n >= limit25) ;_n = ((int)(0 + _n + step25))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 198;BA.debugLine="If isFirst Then";
Debug.ShouldStop(32);
if (_isfirst.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 199;BA.debugLine="isFirst = False";
Debug.ShouldStop(64);
_isfirst = dialogitemactions.__c.getField(true,"False");Debug.locals.put("isFirst", _isfirst);
 BA.debugLineNum = 200;BA.debugLine="imgAddButtonBox.Tag = imagesTagcode";
Debug.ShouldStop(128);
__ref.getField(false,"_imgaddbuttonbox" /*RemoteObject*/ ).runMethod(false,"setTag",(__ref.getField(true,"_imagestagcode" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 202;BA.debugLine="Dim pnl As B4XView = p.GetView(colindex)";
Debug.ShouldStop(512);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.runMethod(false,"GetView",(Object)(_colindex)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 203;BA.debugLine="pnl.Visible = True";
Debug.ShouldStop(1024);
_pnl.runMethod(true,"setVisible",dialogitemactions.__c.getField(true,"True"));
 BA.debugLineNum = 205;BA.debugLine="pnl.SetBitmap(xui.LoadBitmapResize(Starter.Saf";
Debug.ShouldStop(4096);
_pnl.runVoidMethod ("SetBitmap",(Object)((_xui.runMethod(false,"LoadBitmapResize",(Object)(dialogitemactions._starter._safedefaultexternal /*RemoteObject*/ ),(Object)(BA.ObjectToString(_shots.runMethod(false,"Get",(Object)(_index)))),(Object)(_pnl.runMethod(true,"getWidth")),(Object)(_pnl.runMethod(true,"getHeight")),(Object)(dialogitemactions.__c.getField(true,"False"))).getObject())));
 BA.debugLineNum = 207;BA.debugLine="index = index + 1";
Debug.ShouldStop(16384);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 };
 BA.debugLineNum = 209;BA.debugLine="colindex = n";
Debug.ShouldStop(65536);
_colindex = BA.numberCast(int.class, _n);Debug.locals.put("colindex", _colindex);
 BA.debugLineNum = 210;BA.debugLine="Out = ((index+1)=imagesTotal)";
Debug.ShouldStop(131072);
_out = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(double.class, __ref.getField(true,"_imagestotal" /*RemoteObject*/ )))));Debug.locals.put("Out", _out);
 BA.debugLineNum = 211;BA.debugLine="If Out Then";
Debug.ShouldStop(262144);
if (_out.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 212;BA.debugLine="imageCol = colindex";
Debug.ShouldStop(524288);
__ref.setField ("_imagecol" /*RemoteObject*/ ,_colindex);
 BA.debugLineNum = 213;BA.debugLine="Exit";
Debug.ShouldStop(1048576);
if (true) break;
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 216;BA.debugLine="mngImagesArea.Add(p, \"\") ', 165dip, \"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_mngimagesarea" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 217;BA.debugLine="If Out Then";
Debug.ShouldStop(16777216);
if (_out.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 218;BA.debugLine="Exit";
Debug.ShouldStop(33554432);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 221;BA.debugLine="imageRow = Rows";
Debug.ShouldStop(268435456);
__ref.setField ("_imagerow" /*RemoteObject*/ ,_rows);
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _camerareturnnoaction(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CameraReturnNoAction (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("camerareturnnoaction")) { return __ref.runUserSub(false, "dialogitemactions","camerareturnnoaction", __ref);}
 BA.debugLineNum = 226;BA.debugLine="Public Sub CameraReturnNoAction";
Debug.ShouldStop(2);
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Dim IME As IME";
dialogitemactions._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");__ref.setField("_ime",dialogitemactions._ime);
 //BA.debugLineNum = 5;BA.debugLine="Private dlgTabPanel As TabStrip";
dialogitemactions._dlgtabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");__ref.setField("_dlgtabpanel",dialogitemactions._dlgtabpanel);
 //BA.debugLineNum = 6;BA.debugLine="Private listsButtonClose As Button";
dialogitemactions._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listsbuttonclose",dialogitemactions._listsbuttonclose);
 //BA.debugLineNum = 7;BA.debugLine="Private ParentWindow As Activity";
dialogitemactions._parentwindow = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_parentwindow",dialogitemactions._parentwindow);
 //BA.debugLineNum = 8;BA.debugLine="Private OwnerPanel As B4XView";
dialogitemactions._ownerpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_ownerpanel",dialogitemactions._ownerpanel);
 //BA.debugLineNum = 9;BA.debugLine="Private imgButtonBox As Button";
dialogitemactions._imgbuttonbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_imgbuttonbox",dialogitemactions._imgbuttonbox);
 //BA.debugLineNum = 10;BA.debugLine="Private imgImage As ImageView";
dialogitemactions._imgimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_imgimage",dialogitemactions._imgimage);
 //BA.debugLineNum = 11;BA.debugLine="Private pnlImageBoxOptions As Panel";
dialogitemactions._pnlimageboxoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_pnlimageboxoptions",dialogitemactions._pnlimageboxoptions);
 //BA.debugLineNum = 12;BA.debugLine="Private mngImagesArea As CustomListView";
dialogitemactions._mngimagesarea = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_mngimagesarea",dialogitemactions._mngimagesarea);
 //BA.debugLineNum = 13;BA.debugLine="Private mngNotesField As EditText";
dialogitemactions._mngnotesfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_mngnotesfield",dialogitemactions._mngnotesfield);
 //BA.debugLineNum = 14;BA.debugLine="Private mngObsBasePanel As Panel";
dialogitemactions._mngobsbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mngobsbasepanel",dialogitemactions._mngobsbasepanel);
 //BA.debugLineNum = 15;BA.debugLine="Private textPanel As Panel";
dialogitemactions._textpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_textpanel",dialogitemactions._textpanel);
 //BA.debugLineNum = 16;BA.debugLine="Private KeyHidBtn As Button";
dialogitemactions._keyhidbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_keyhidbtn",dialogitemactions._keyhidbtn);
 //BA.debugLineNum = 17;BA.debugLine="Private dlgBasePanel As Panel";
dialogitemactions._dlgbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dlgbasepanel",dialogitemactions._dlgbasepanel);
 //BA.debugLineNum = 18;BA.debugLine="Private mainLabelOptLists As Label";
dialogitemactions._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_mainlabeloptlists",dialogitemactions._mainlabeloptlists);
 //BA.debugLineNum = 19;BA.debugLine="Private imgButtonEdit As Button";
dialogitemactions._imgbuttonedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_imgbuttonedit",dialogitemactions._imgbuttonedit);
 //BA.debugLineNum = 20;BA.debugLine="Private imgButtonDuplicate As Button";
dialogitemactions._imgbuttonduplicate = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_imgbuttonduplicate",dialogitemactions._imgbuttonduplicate);
 //BA.debugLineNum = 21;BA.debugLine="Private imgButtonDelete As Button";
dialogitemactions._imgbuttondelete = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_imgbuttondelete",dialogitemactions._imgbuttondelete);
 //BA.debugLineNum = 22;BA.debugLine="Private imgAddButtonBox As Button";
dialogitemactions._imgaddbuttonbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_imgaddbuttonbox",dialogitemactions._imgaddbuttonbox);
 //BA.debugLineNum = 24;BA.debugLine="Private imageRow As Int";
dialogitemactions._imagerow = RemoteObject.createImmutable(0);__ref.setField("_imagerow",dialogitemactions._imagerow);
 //BA.debugLineNum = 25;BA.debugLine="Private imageCol As Int";
dialogitemactions._imagecol = RemoteObject.createImmutable(0);__ref.setField("_imagecol",dialogitemactions._imagecol);
 //BA.debugLineNum = 26;BA.debugLine="Private imageTotalCols As Int";
dialogitemactions._imagetotalcols = RemoteObject.createImmutable(0);__ref.setField("_imagetotalcols",dialogitemactions._imagetotalcols);
 //BA.debugLineNum = 28;BA.debugLine="Private imagesTotal As Int = 0";
dialogitemactions._imagestotal = BA.numberCast(int.class, 0);__ref.setField("_imagestotal",dialogitemactions._imagestotal);
 //BA.debugLineNum = 29;BA.debugLine="Private imagesTagcode As String";
dialogitemactions._imagestagcode = RemoteObject.createImmutable("");__ref.setField("_imagestagcode",dialogitemactions._imagestagcode);
 //BA.debugLineNum = 30;BA.debugLine="Private imagesUniqueID As String";
dialogitemactions._imagesuniqueid = RemoteObject.createImmutable("");__ref.setField("_imagesuniqueid",dialogitemactions._imagesuniqueid);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dlgtabpanel_pageselected(RemoteObject __ref,RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("dlgTabPanel_PageSelected (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("dlgtabpanel_pageselected")) { return __ref.runUserSub(false, "dialogitemactions","dlgtabpanel_pageselected", __ref, _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 110;BA.debugLine="Sub dlgTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="IME.HideKeyboard";
Debug.ShouldStop(16384);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgaddbuttonbox_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgAddButtonBox_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("imgaddbuttonbox_click")) { return __ref.runUserSub(false, "dialogitemactions","imgaddbuttonbox_click", __ref);}
 BA.debugLineNum = 154;BA.debugLine="Sub imgAddButtonBox_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="CallSubDelayed2(CameraActivity2, \"StartCamera\", M";
Debug.ShouldStop(134217728);
dialogitemactions.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)((dialogitemactions._cameraactivity2.getObject())),(Object)(BA.ObjectToString("StartCamera")),(Object)(__ref));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgbuttonbox_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgButtonBox_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("imgbuttonbox_click")) { return __ref.runUserSub(false, "dialogitemactions","imgbuttonbox_click", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Sub imgButtonBox_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgbuttondelete_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgButtonDelete_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("imgbuttondelete_click")) { return __ref.runUserSub(false, "dialogitemactions","imgbuttondelete_click", __ref);}
 BA.debugLineNum = 142;BA.debugLine="Sub imgButtonDelete_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgbuttonduplicate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgButtonDuplicate_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("imgbuttonduplicate_click")) { return __ref.runUserSub(false, "dialogitemactions","imgbuttonduplicate_click", __ref);}
 BA.debugLineNum = 146;BA.debugLine="Sub imgButtonDuplicate_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgbuttonedit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgButtonEdit_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("imgbuttonedit_click")) { return __ref.runUserSub(false, "dialogitemactions","imgbuttonedit_click", __ref);}
 BA.debugLineNum = 150;BA.debugLine="Sub imgButtonEdit_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgimage_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgImage_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("imgimage_click")) { return __ref.runUserSub(false, "dialogitemactions","imgimage_click", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Sub imgImage_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgimage_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgImage_LongClick (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("imgimage_longclick")) { return __ref.runUserSub(false, "dialogitemactions","imgimage_longclick", __ref);}
 BA.debugLineNum = 122;BA.debugLine="Sub imgImage_LongClick";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgpictureclick_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("imgPictureClick_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("imgpictureclick_click")) { return __ref.runUserSub(false, "dialogitemactions","imgpictureclick_click", __ref);}
 BA.debugLineNum = 230;BA.debugLine="Sub imgPictureClick_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _act,RemoteObject _owner) throws Exception{
try {
		Debug.PushSubsStack("Initialize (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "dialogitemactions","initialize", __ref, _ba, _act, _owner);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("act", _act);
Debug.locals.put("Owner", _owner);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize(act As Activity, Owner As B4";
Debug.ShouldStop(2);
 BA.debugLineNum = 35;BA.debugLine="ParentWindow = act";
Debug.ShouldStop(4);
__ref.setField ("_parentwindow" /*RemoteObject*/ ,_act);
 BA.debugLineNum = 36;BA.debugLine="OwnerPanel = Owner";
Debug.ShouldStop(8);
__ref.setField ("_ownerpanel" /*RemoteObject*/ ,_owner);
 BA.debugLineNum = 37;BA.debugLine="OwnerPanel.LoadLayout(\"Dialog_ItemsActions\")";
Debug.ShouldStop(16);
__ref.getField(false,"_ownerpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Dialog_ItemsActions")),__ref.getField(false, "ba"));
 BA.debugLineNum = 38;BA.debugLine="dlgTabPanel.LoadLayout(\"ManagementImageList\", \"Ev";
Debug.ShouldStop(32);
__ref.getField(false,"_dlgtabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("ManagementImageList")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Evidências"))));
 BA.debugLineNum = 39;BA.debugLine="dlgTabPanel.LoadLayout(\"ManagementActions\", \"Acçõ";
Debug.ShouldStop(64);
__ref.getField(false,"_dlgtabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("ManagementActions")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Acções subsequentes"))));
 BA.debugLineNum = 40;BA.debugLine="dlgTabPanel.LoadLayout(\"ManagementObservations\",";
Debug.ShouldStop(128);
__ref.getField(false,"_dlgtabpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("ManagementObservations")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Notas/Observações"))));
 BA.debugLineNum = 41;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(dl";
Debug.ShouldStop(256);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group7 = dialogitemactions._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_dlgtabpanel" /*RemoteObject*/ )));
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group7.runMethod(false,"Get",index7));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 42;BA.debugLine="lbl.Width = 33.33%x";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setWidth",dialogitemactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33.33)),__ref.getField(false, "ba")));
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 44;BA.debugLine="StartDlgIOActivity(\"ABC1\", \"ABC1\", 1)";
Debug.ShouldStop(2048);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.dialogitemactions.class, "_startdlgioactivity" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ABC1")),(Object)(BA.ObjectToString("ABC1")),(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 47;BA.debugLine="IME.Initialize(\"IME\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(RemoteObject.createImmutable("IME")));
 BA.debugLineNum = 49;BA.debugLine="OwnerPanel.visible = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_ownerpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",dialogitemactions.__c.getField(true,"True"));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonclose_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listsButtonClose_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return __ref.runUserSub(false, "dialogitemactions","listsbuttonclose_click", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Log(\"Back DIALOGS\")";
Debug.ShouldStop(128);
dialogitemactions.__c.runVoidMethod ("LogImpl","6137560065",RemoteObject.createImmutable("Back DIALOGS"),0);
 BA.debugLineNum = 107;BA.debugLine="CallSubDelayed(\"CheckList3\", \"RemoveActionOptions";
Debug.ShouldStop(1024);
dialogitemactions.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(("CheckList3"))),(Object)(RemoteObject.createImmutable("RemoveActionOptionsPanel")));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainlabeloptlists_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mainLabelOptLists_Click (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("mainlabeloptlists_click")) { return __ref.runUserSub(false, "dialogitemactions","mainlabeloptlists_click", __ref);}
 BA.debugLineNum = 138;BA.debugLine="Sub mainLabelOptLists_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="IME.HideKeyboard";
Debug.ShouldStop(1024);
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mngimagesarea_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("mngImagesArea_ItemClick (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("mngimagesarea_itemclick")) { return __ref.runUserSub(false, "dialogitemactions","mngimagesarea_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 126;BA.debugLine="Sub mngImagesArea_ItemClick (Index As Int, Value A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mngnotesfield_focuschanged(RemoteObject __ref,RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("mngNotesField_FocusChanged (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("mngnotesfield_focuschanged")) { return __ref.runUserSub(false, "dialogitemactions","mngnotesfield_focuschanged", __ref, _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 134;BA.debugLine="Sub mngNotesField_FocusChanged (HasFocus As Boolea";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="If Not(HasFocus) Then IME.HideKeyboard";
Debug.ShouldStop(64);
if (dialogitemactions.__c.runMethod(true,"Not",(Object)(_hasfocus)).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_ime" /*RemoteObject*/ ).runVoidMethod ("HideKeyboard",__ref.getField(false, "ba"));};
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mngnotesfield_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("mngNotesField_TextChanged (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("mngnotesfield_textchanged")) { return __ref.runUserSub(false, "dialogitemactions","mngnotesfield_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 130;BA.debugLine="Sub mngNotesField_TextChanged (Old As String, New";
Debug.ShouldStop(2);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startdlgioactivity(RemoteObject __ref,RemoteObject _tagcode,RemoteObject _uniqueid,RemoteObject _imgcount) throws Exception{
try {
		Debug.PushSubsStack("StartDlgIOActivity (dialogitemactions) ","dialogitemactions",37,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("startdlgioactivity")) { return __ref.runUserSub(false, "dialogitemactions","startdlgioactivity", __ref, _tagcode, _uniqueid, _imgcount);}
RemoteObject _cols = RemoteObject.createImmutable(0);
RemoteObject _rows = RemoteObject.createImmutable(0);
RemoteObject _isfirst = RemoteObject.createImmutable(false);
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _out = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _colindex = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Tagcode", _tagcode);
Debug.locals.put("UniqueID", _uniqueid);
Debug.locals.put("ImgCount", _imgcount);
 BA.debugLineNum = 52;BA.debugLine="Sub StartDlgIOActivity(Tagcode As String, UniqueID";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="imagesTotal = ImgCount";
Debug.ShouldStop(1048576);
__ref.setField ("_imagestotal" /*RemoteObject*/ ,_imgcount);
 BA.debugLineNum = 54;BA.debugLine="imagesTagcode = Tagcode";
Debug.ShouldStop(2097152);
__ref.setField ("_imagestagcode" /*RemoteObject*/ ,_tagcode);
 BA.debugLineNum = 55;BA.debugLine="imagesUniqueID = UniqueID";
Debug.ShouldStop(4194304);
__ref.setField ("_imagesuniqueid" /*RemoteObject*/ ,_uniqueid);
 BA.debugLineNum = 57;BA.debugLine="Dim Cols As Int = Floor(OwnerPanel.Width/225)";
Debug.ShouldStop(16777216);
_cols = BA.numberCast(int.class, dialogitemactions.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_ownerpanel" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(225)}, "/",0, 0))));Debug.locals.put("Cols", _cols);Debug.locals.put("Cols", _cols);
 BA.debugLineNum = 58;BA.debugLine="Dim Rows As Int = Round2((ImgCount + 1) / Cols, 0";
Debug.ShouldStop(33554432);
_rows = BA.numberCast(int.class, dialogitemactions.__c.runMethod(true,"Round2",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_imgcount,RemoteObject.createImmutable(1)}, "+",1, 1)),_cols}, "/",0, 0)),(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("Rows", _rows);Debug.locals.put("Rows", _rows);
 BA.debugLineNum = 59;BA.debugLine="If (Rows = 0) Then Rows = 1";
Debug.ShouldStop(67108864);
if ((RemoteObject.solveBoolean("=",_rows,BA.numberCast(double.class, 0)))) { 
_rows = BA.numberCast(int.class, 1);Debug.locals.put("Rows", _rows);};
 BA.debugLineNum = 61;BA.debugLine="imageTotalCols = Cols";
Debug.ShouldStop(268435456);
__ref.setField ("_imagetotalcols" /*RemoteObject*/ ,_cols);
 BA.debugLineNum = 63;BA.debugLine="Dim isFirst As Boolean = True";
Debug.ShouldStop(1073741824);
_isfirst = dialogitemactions.__c.getField(true,"True");Debug.locals.put("isFirst", _isfirst);Debug.locals.put("isFirst", _isfirst);
 BA.debugLineNum = 64;BA.debugLine="Dim index As Int = 0";
Debug.ShouldStop(-2147483648);
_index = BA.numberCast(int.class, 0);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 65;BA.debugLine="Dim Out As Boolean = False";
Debug.ShouldStop(1);
_out = dialogitemactions.__c.getField(true,"False");Debug.locals.put("Out", _out);Debug.locals.put("Out", _out);
 BA.debugLineNum = 66;BA.debugLine="For i = 1 To Rows";
Debug.ShouldStop(2);
{
final int step11 = 1;
final int limit11 = _rows.<Integer>get().intValue();
_i = 1 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 67;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 68;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(8);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="ParentWindow.AddView(p, 0, 0, 100%x, 165dip)";
Debug.ShouldStop(16);
__ref.getField(false,"_parentwindow" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(dialogitemactions.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(dialogitemactions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 165)))));
 BA.debugLineNum = 70;BA.debugLine="Dim colindex As Int = 0";
Debug.ShouldStop(32);
_colindex = BA.numberCast(int.class, 0);Debug.locals.put("colindex", _colindex);Debug.locals.put("colindex", _colindex);
 BA.debugLineNum = 71;BA.debugLine="If isFirst Then";
Debug.ShouldStop(64);
if (_isfirst.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="p.LoadLayout(\"imgView\")";
Debug.ShouldStop(128);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("imgView")),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 74;BA.debugLine="p.LoadLayout(\"imgViewNextRow\")";
Debug.ShouldStop(512);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("imgViewNextRow")),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 76;BA.debugLine="p.Height = 165dip";
Debug.ShouldStop(2048);
_p.runMethod(true,"setHeight",dialogitemactions.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 165))));
 BA.debugLineNum = 77;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4096);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 78;BA.debugLine="For n = 1 To Cols";
Debug.ShouldStop(8192);
{
final int step23 = 1;
final int limit23 = _cols.<Integer>get().intValue();
_n = 1 ;
for (;(step23 > 0 && _n <= limit23) || (step23 < 0 && _n >= limit23) ;_n = ((int)(0 + _n + step23))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 79;BA.debugLine="If isFirst Then";
Debug.ShouldStop(16384);
if (_isfirst.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="isFirst = False";
Debug.ShouldStop(32768);
_isfirst = dialogitemactions.__c.getField(true,"False");Debug.locals.put("isFirst", _isfirst);
 BA.debugLineNum = 81;BA.debugLine="imgAddButtonBox.Tag = Tagcode";
Debug.ShouldStop(65536);
__ref.getField(false,"_imgaddbuttonbox" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 }else {
 BA.debugLineNum = 83;BA.debugLine="Dim pnl As B4XView = p.GetView(colindex)";
Debug.ShouldStop(262144);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.runMethod(false,"GetView",(Object)(_colindex)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 84;BA.debugLine="pnl.Visible = True";
Debug.ShouldStop(524288);
_pnl.runMethod(true,"setVisible",dialogitemactions.__c.getField(true,"True"));
 BA.debugLineNum = 85;BA.debugLine="pnl.Color = Rnd(0xFF000000, 0xFFFFFFFF)";
Debug.ShouldStop(1048576);
_pnl.runMethod(true,"setColor",dialogitemactions.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0xff000000)),(Object)(BA.numberCast(int.class, 0xffffffff))));
 BA.debugLineNum = 86;BA.debugLine="index = index + 1";
Debug.ShouldStop(2097152);
_index = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("index", _index);
 };
 BA.debugLineNum = 88;BA.debugLine="colindex = n";
Debug.ShouldStop(8388608);
_colindex = BA.numberCast(int.class, _n);Debug.locals.put("colindex", _colindex);
 BA.debugLineNum = 89;BA.debugLine="Out = ((index+1)=ImgCount)";
Debug.ShouldStop(16777216);
_out = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1)),BA.numberCast(double.class, _imgcount))));Debug.locals.put("Out", _out);
 BA.debugLineNum = 90;BA.debugLine="If Out Then";
Debug.ShouldStop(33554432);
if (_out.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 91;BA.debugLine="imageCol = colindex";
Debug.ShouldStop(67108864);
__ref.setField ("_imagecol" /*RemoteObject*/ ,_colindex);
 BA.debugLineNum = 92;BA.debugLine="Exit";
Debug.ShouldStop(134217728);
if (true) break;
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 95;BA.debugLine="mngImagesArea.Add(p, \"\") ', 165dip, \"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mngimagesarea" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _p.getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 96;BA.debugLine="If Out Then";
Debug.ShouldStop(-2147483648);
if (_out.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 100;BA.debugLine="imageRow = Rows";
Debug.ShouldStop(8);
__ref.setField ("_imagerow" /*RemoteObject*/ ,_rows);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}