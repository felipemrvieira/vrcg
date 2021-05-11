package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class objects_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,176);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","activity_create", _firsttime);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _i = 0;
RemoteObject _bt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttypes");
RemoteObject _where = RemoteObject.createImmutable("");
RemoteObject _s = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _flist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itc = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._db_itc");
RemoteObject _r = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 176;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 180;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(524288);
if ((objects.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(1048576);
objects._device.runVoidMethod ("SetScreenOrientation",objects.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 183;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(4194304);
objects._device.runVoidMethod ("SetScreenOrientation",objects.processBA,(Object)(objects.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 186;BA.debugLine="Starter.CurrentWorkActivity = Me";
Debug.ShouldStop(33554432);
objects.mostCurrent._starter._currentworkactivity /*RemoteObject*/  = objects.getObject();
 BA.debugLineNum = 188;BA.debugLine="Activity.LoadLayout(\"ObjectsLayout\")";
Debug.ShouldStop(134217728);
objects.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ObjectsLayout")),objects.mostCurrent.activityBA);
 BA.debugLineNum = 189;BA.debugLine="listsTabPanel.LoadLayout(\"Objects_listview\", Shar";
Debug.ShouldStop(268435456);
objects.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("Objects_listview")),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._tabgeneral_listingtitle /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="listsTabPanel.LoadLayout(\"Objects_requests_new\",";
Debug.ShouldStop(536870912);
objects.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("Objects_requests_new")),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._tabgeneral_requests /*RemoteObject*/ )));
 BA.debugLineNum = 191;BA.debugLine="listsTabPanel.LoadLayout(\"objects_mapview_goolge\"";
Debug.ShouldStop(1073741824);
objects.mostCurrent._liststabpanel.runVoidMethodAndSync ("LoadLayout",(Object)(BA.ObjectToString("objects_mapview_goolge")),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._tabgeneral_maptitle /*RemoteObject*/ )));
 BA.debugLineNum = 193;BA.debugLine="LstPreReqs2Download.Initialize";
Debug.ShouldStop(1);
objects.mostCurrent._lstprereqs2download.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(4);
objects.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,objects.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 196;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objectsLi";
Debug.ShouldStop(8);
objects.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,objects.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._objectslistviewpanel.getObject()));
 BA.debugLineNum = 197;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ObjectsRe";
Debug.ShouldStop(16);
objects.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,objects.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._objectsrequeststitlelabel.getObject()));
 BA.debugLineNum = 198;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(32);
objects.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,objects.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 200;BA.debugLine="ObjLabelObjectos.Text = ShareCode.objectObjLabelO";
Debug.ShouldStop(128);
objects.mostCurrent._objlabelobjectos.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objectobjlabelobjectos /*RemoteObject*/ ));
 BA.debugLineNum = 201;BA.debugLine="ObjLabelMorada.Text = ShareCode.objectObjLabelMor";
Debug.ShouldStop(256);
objects.mostCurrent._objlabelmorada.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objectobjlabelmorada /*RemoteObject*/ ));
 BA.debugLineNum = 202;BA.debugLine="ObjLabelStatus.Text = ShareCode.objectObjLabelSta";
Debug.ShouldStop(512);
objects.mostCurrent._objlabelstatus.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objectobjlabelstatus /*RemoteObject*/ ));
 BA.debugLineNum = 203;BA.debugLine="ObjLabelLocal.text = ShareCode.objectObjLabelLoca";
Debug.ShouldStop(1024);
objects.mostCurrent._objlabellocal.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objectobjlabellocal /*RemoteObject*/ ));
 BA.debugLineNum = 205;BA.debugLine="LabelObjRequestTipoInter.Text = ShareCode.ObjLabe";
Debug.ShouldStop(4096);
objects.mostCurrent._labelobjrequesttipointer.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlabelobjrequesttipointer /*RemoteObject*/ ));
 BA.debugLineNum = 206;BA.debugLine="LabelObjRequestDataInicio.Text = ShareCode.AppDia";
Debug.ShouldStop(8192);
objects.mostCurrent._labelobjrequestdatainicio.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._appdialogsfilterlabeldatainicio /*RemoteObject*/ ));
 BA.debugLineNum = 207;BA.debugLine="LabelObjRequestDataFim.Text = ShareCode.AppDialog";
Debug.ShouldStop(16384);
objects.mostCurrent._labelobjrequestdatafim.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._appdialogsfilterlabeldatafim /*RemoteObject*/ ));
 BA.debugLineNum = 208;BA.debugLine="LabelObjRequestConcelho.Text = ShareCode.ObjLabel";
Debug.ShouldStop(32768);
objects.mostCurrent._labelobjrequestconcelho.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlabelobjrequestconcelho /*RemoteObject*/ ));
 BA.debugLineNum = 209;BA.debugLine="LabelObjRequestDistrito.Text = ShareCode.ObjLabel";
Debug.ShouldStop(65536);
objects.mostCurrent._labelobjrequestdistrito.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlabelobjrequestdistrito /*RemoteObject*/ ));
 BA.debugLineNum = 210;BA.debugLine="LabelObjRequestPLivre.Text = ShareCode.ObjLabelOb";
Debug.ShouldStop(131072);
objects.mostCurrent._labelobjrequestplivre.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlabelobjrequestplivre /*RemoteObject*/ ));
 BA.debugLineNum = 211;BA.debugLine="LabelObjRequestTipoInter2.Text = ShareCode.ObjLab";
Debug.ShouldStop(262144);
objects.mostCurrent._labelobjrequesttipointer2.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlabelobjrequesttipointer /*RemoteObject*/ ));
 BA.debugLineNum = 212;BA.debugLine="LabelObjRequestTipoGrupoInter.Text = ShareCode.Ob";
Debug.ShouldStop(524288);
objects.mostCurrent._labelobjrequesttipogrupointer.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlabelobjrequesttipogrupointer /*RemoteObject*/ ));
 BA.debugLineNum = 213;BA.debugLine="ListItemRequestHeader.Text = ShareCode.ObjListIte";
Debug.ShouldStop(1048576);
objects.mostCurrent._listitemrequestheader.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlistitemrequestheader /*RemoteObject*/ ));
 BA.debugLineNum = 214;BA.debugLine="ListItemActionHeader.Text = ShareCode.ObjListItem";
Debug.ShouldStop(2097152);
objects.mostCurrent._listitemactionheader.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objlistitemactionheader /*RemoteObject*/ ));
 BA.debugLineNum = 216;BA.debugLine="DialogReqStartDateLabel.Text = Utils.GetCurrentDa";
Debug.ShouldStop(8388608);
objects.mostCurrent._dialogreqstartdatelabel.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA)));
 BA.debugLineNum = 217;BA.debugLine="DialogReqEndDateLabel.Text = Utils.GetCurrentDate";
Debug.ShouldStop(16777216);
objects.mostCurrent._dialogreqenddatelabel.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA)));
 BA.debugLineNum = 220;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
Debug.ShouldStop(134217728);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
{
final RemoteObject group32 = objects.mostCurrent._utils.runMethod(false,"_getalltablabels" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._liststabpanel));
final int groupLen32 = group32.runMethod(true,"getSize").<Integer>get()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), group32.runMethod(false,"Get",index32));
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 221;BA.debugLine="lbl.Width = 33.33%x";
Debug.ShouldStop(268435456);
_lbl.runMethod(true,"setWidth",objects.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33.33)),objects.mostCurrent.activityBA));
 }
}Debug.locals.put("lbl", _lbl);
;
 BA.debugLineNum = 224;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._utils.runVoidMethod ("_maketabpaneleffect" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._colortabpanel),(Object)(objects.mostCurrent._consts._colormaindarker /*RemoteObject*/ ),(Object)(objects.mostCurrent._consts._colorsub /*RemoteObject*/ ));
 BA.debugLineNum = 226;BA.debugLine="Markers.Initialize";
Debug.ShouldStop(2);
objects._markers.runVoidMethod ("Initialize");
 BA.debugLineNum = 227;BA.debugLine="SelectedObjectsCount = 0";
Debug.ShouldStop(4);
objects._selectedobjectscount = BA.numberCast(int.class, 0);
 BA.debugLineNum = 228;BA.debugLine="FromBulkOption = 0";
Debug.ShouldStop(8);
objects._frombulkoption = BA.numberCast(int.class, 0);
 BA.debugLineNum = 229;BA.debugLine="Bloco30 = Activity.Width / 3";
Debug.ShouldStop(16);
objects._bloco30 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0));
 BA.debugLineNum = 230;BA.debugLine="If Not(ShareCode.ISPHONE Or ShareCode.DEVICE_ORIE";
Debug.ShouldStop(32);
if (objects.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",objects.mostCurrent._sharecode._isphone /*RemoteObject*/ ) || RemoteObject.solveBoolean("=",objects.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ,BA.numberCast(double.class, 1))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 231;BA.debugLine="Dim p As Panel = listPedidosMap.AsView";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listpedidosmap.runMethod(false,"_asview").getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 232;BA.debugLine="p.Width = Bloco30";
Debug.ShouldStop(128);
_p.runMethod(true,"setWidth",objects._bloco30);
 };
 BA.debugLineNum = 236;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(2048);
if (_firsttime.<Boolean>get().booleanValue()) { 
 };
 BA.debugLineNum = 240;BA.debugLine="CumulativeTypeRequest = 0";
Debug.ShouldStop(32768);
objects._cumulativetyperequest = BA.numberCast(int.class, 0);
 BA.debugLineNum = 241;BA.debugLine="CumulativeDistrict = 0";
Debug.ShouldStop(65536);
objects._cumulativedistrict = BA.numberCast(int.class, 0);
 BA.debugLineNum = 242;BA.debugLine="CumulativeCounty = 0";
Debug.ShouldStop(131072);
objects._cumulativecounty = BA.numberCast(int.class, 0);
 BA.debugLineNum = 243;BA.debugLine="CumulativeFilter = \"\"";
Debug.ShouldStop(262144);
objects.mostCurrent._cumulativefilter = BA.ObjectToString("");
 BA.debugLineNum = 244;BA.debugLine="CumulativeDateIn = \"\"";
Debug.ShouldStop(524288);
objects.mostCurrent._cumulativedatein = BA.ObjectToString("");
 BA.debugLineNum = 245;BA.debugLine="CumulativeDateOut = \"\"";
Debug.ShouldStop(1048576);
objects.mostCurrent._cumulativedateout = BA.ObjectToString("");
 BA.debugLineNum = 247;BA.debugLine="RegionsList.Initialize";
Debug.ShouldStop(4194304);
objects.mostCurrent._regionslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 248;BA.debugLine="TypeObjectsList.Initialize";
Debug.ShouldStop(8388608);
objects.mostCurrent._typeobjectslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 249;BA.debugLine="TypeObjectsList = DBStructures.GetListOfObjectsTy";
Debug.ShouldStop(16777216);
objects.mostCurrent._typeobjectslist = objects.mostCurrent._dbstructures.runMethod(false,"_getlistofobjectstypesevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 250;BA.debugLine="LocalsList.Initialize";
Debug.ShouldStop(33554432);
objects.mostCurrent._localslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 251;BA.debugLine="LocalsList = DBStructures.GetListOfLocalEVC 'GetL";
Debug.ShouldStop(67108864);
objects.mostCurrent._localslist = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoflocalevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA);
 BA.debugLineNum = 253;BA.debugLine="butCreateRequestCancel.Color = Consts.ColorMain";
Debug.ShouldStop(268435456);
objects.mostCurrent._butcreaterequestcancel.runVoidMethod ("setColor",objects.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 254;BA.debugLine="butCreateRequest.Color = Consts.ColorMain";
Debug.ShouldStop(536870912);
objects.mostCurrent._butcreaterequest.runVoidMethod ("setColor",objects.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 255;BA.debugLine="butBulkCreateRequest.Color  = Consts.ColorMain";
Debug.ShouldStop(1073741824);
objects.mostCurrent._butbulkcreaterequest.runVoidMethod ("setColor",objects.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="butBulkPreRequest.Color  = Consts.ColorMain";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._butbulkprerequest.runVoidMethod ("setColor",objects.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 257;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(NoRequest";
Debug.ShouldStop(1);
objects.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaincolor" /*RemoteObject*/ ,objects.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._norequestpaneltitlelabel.getObject()));
 BA.debugLineNum = 259;BA.debugLine="DummyMenuPlaceHlder.Top = 0 + DummyMenuPlaceHlder";
Debug.ShouldStop(4);
objects.mostCurrent._dummymenuplacehlder.runMethod(true,"setTop",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0),objects.mostCurrent._dummymenuplacehlder.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._dummymenuplacehlder.runMethod(true,"getHeight"),objects.mostCurrent._typeobjectslist.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "*/",0, 0))}, "++",2, 0)));
 BA.debugLineNum = 260;BA.debugLine="ObjectTypePopMenu.Initialize(Activity, Me, DummyM";
Debug.ShouldStop(8);
objects.mostCurrent._objecttypepopmenu.runVoidMethod ("_initialize",objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._activity),(Object)(objects.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._dummymenuplacehlder.getObject()),(Object)(objects.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(objects.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(objects.mostCurrent._consts._colorsub /*RemoteObject*/ ),(Object)(objects.mostCurrent.__c.getField(true,"True")),(Object)(objects.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 262;BA.debugLine="For i=0 To TypeObjectsList.Size-1";
Debug.ShouldStop(32);
{
final int step64 = 1;
final int limit64 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._typeobjectslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step64 > 0 && _i <= limit64) || (step64 < 0 && _i >= limit64) ;_i = ((int)(0 + _i + step64))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 263;BA.debugLine="Dim bt As ObjectTypes = TypeObjectsList.Get(i)";
Debug.ShouldStop(64);
_bt = (objects.mostCurrent._typeobjectslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("bt", _bt);Debug.locals.put("bt", _bt);
 BA.debugLineNum = 264;BA.debugLine="ObjectTypePopMenu.AddMenuItem(bt.title, \"ObjectT";
Debug.ShouldStop(128);
objects.mostCurrent._objecttypepopmenu.runVoidMethod ("_addmenuitem",(Object)(_bt.getField(true,"title" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("ObjectTypePopMenu")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 268;BA.debugLine="ObjectZonePopMenu.Initialize(Activity, Me, listsB";
Debug.ShouldStop(2048);
objects.mostCurrent._objectzonepopmenu.runVoidMethod ("_initialize",objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._activity),(Object)(objects.getObject()),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._listsbuttonzone.getObject()),(Object)(objects.mostCurrent._consts._colormain /*RemoteObject*/ ),(Object)(objects.mostCurrent.__c.getField(false,"Colors").getField(true,"White")),(Object)(objects.mostCurrent._consts._colorsub /*RemoteObject*/ ),(Object)(objects.mostCurrent.__c.getField(true,"True")),(Object)(objects.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 269;BA.debugLine="For i=0 To Types.ZONEOBJECTSFILTER.Size-1";
Debug.ShouldStop(4096);
{
final int step69 = 1;
final int limit69 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._types._zoneobjectsfilter /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step69 > 0 && _i <= limit69) || (step69 < 0 && _i >= limit69) ;_i = ((int)(0 + _i + step69))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 270;BA.debugLine="ObjectZonePopMenu.AddMenuItem(Types.ZONEOBJECTSF";
Debug.ShouldStop(8192);
objects.mostCurrent._objectzonepopmenu.runVoidMethod ("_addmenuitem",(Object)(BA.ObjectToString(objects.mostCurrent._types._zoneobjectsfilter /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(RemoteObject.createImmutable("ObjectZonePopMenu")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 273;BA.debugLine="SearchFilter = \"\"";
Debug.ShouldStop(65536);
objects.mostCurrent._searchfilter = BA.ObjectToString("");
 BA.debugLineNum = 275;BA.debugLine="Dim where As String = $\"select distinct b.object";
Debug.ShouldStop(262144);
_where = (RemoteObject.concat(RemoteObject.createImmutable("select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where request_date='"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ))),RemoteObject.createImmutable("'")));Debug.locals.put("where", _where);Debug.locals.put("where", _where);
 BA.debugLineNum = 276;BA.debugLine="ObjRequests = DBStructures.GetListOfFromScript(\"o";
Debug.ShouldStop(524288);
objects.mostCurrent._objrequests = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscript" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("object")),(Object)(_where));
 BA.debugLineNum = 278;BA.debugLine="Dim s As String = Utils.StrList2SQLArray(ObjReque";
Debug.ShouldStop(2097152);
_s = objects.mostCurrent._utils.runMethod(true,"_strlist2sqlarray" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._objrequests));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 279;BA.debugLine="Dim where As String = $\"Select distinct b.object";
Debug.ShouldStop(4194304);
_where = (RemoteObject.concat(RemoteObject.createImmutable("Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)\n"),RemoteObject.createImmutable("							where a.request_date<>'"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._sharecode._current_appdate /*RemoteObject*/ ))),RemoteObject.createImmutable("' and b.object not in "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_s))),RemoteObject.createImmutable("")));Debug.locals.put("where", _where);Debug.locals.put("where", _where);
 BA.debugLineNum = 281;BA.debugLine="ObjRequestsNotToday = DBStructures.GetListOfFromS";
Debug.ShouldStop(16777216);
objects.mostCurrent._objrequestsnottoday = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscript" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("object")),(Object)(_where));
 BA.debugLineNum = 283;BA.debugLine="GroupList = DBStructures.getTASKGroups";
Debug.ShouldStop(67108864);
objects.mostCurrent._grouplist = objects.mostCurrent._dbstructures.runMethod(false,"_gettaskgroups" /*RemoteObject*/ ,objects.mostCurrent.activityBA);
 BA.debugLineNum = 286;BA.debugLine="Dim sSQL As String = $\"SELECT tagcode, title FROM";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.createImmutable("SELECT tagcode, title FROM dta_typerequests WHERE active=1"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 287;BA.debugLine="ReqList.Initialize";
Debug.ShouldStop(1073741824);
objects.mostCurrent._reqlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 288;BA.debugLine="ReqList = DBStructures.GetListOfFromScriptCNLEVC(";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._reqlist = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscriptcnlevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("tagcode")),(Object)(BA.ObjectToString("title")),(Object)(_ssql));
 BA.debugLineNum = 291;BA.debugLine="DistrictsList.Initialize";
Debug.ShouldStop(4);
objects.mostCurrent._districtslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 292;BA.debugLine="DistrictsList = DBStructures.GetListOfFromScriptC";
Debug.ShouldStop(8);
objects.mostCurrent._districtslist = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscriptcnlevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("tagcode")),(Object)(BA.ObjectToString("title")),(Object)(objects.mostCurrent._dbstructures._evc_sql_getdistricts /*RemoteObject*/ ));
 BA.debugLineNum = 295;BA.debugLine="CountyList.Initialize";
Debug.ShouldStop(64);
objects.mostCurrent._countylist.runVoidMethod ("Initialize");
 BA.debugLineNum = 296;BA.debugLine="CountyList = DBStructures.GetListOfFromScriptCNLE";
Debug.ShouldStop(128);
objects.mostCurrent._countylist = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscriptcnlevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("tagcode")),(Object)(BA.ObjectToString("title")),(Object)(objects.mostCurrent._dbstructures._evc_sql_getcounties /*RemoteObject*/ ));
 BA.debugLineNum = 298;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(512);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 298;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(512);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 299;BA.debugLine="flist.Add(\"(Todos)\")";
Debug.ShouldStop(1024);
_flist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("(Todos)"))));
 BA.debugLineNum = 300;BA.debugLine="For i = 0 To GroupList.Size-1";
Debug.ShouldStop(2048);
{
final int step89 = 1;
final int limit89 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._grouplist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step89 > 0 && _i <= limit89) || (step89 < 0 && _i >= limit89) ;_i = ((int)(0 + _i + step89))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 301;BA.debugLine="Dim itc As DB_ITC = GroupList.Get(i)";
Debug.ShouldStop(4096);
_itc = (objects.mostCurrent._grouplist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("itc", _itc);Debug.locals.put("itc", _itc);
 BA.debugLineNum = 302;BA.debugLine="flist.Add(itc.Title)";
Debug.ShouldStop(8192);
_flist.runVoidMethod ("Add",(Object)((_itc.getField(true,"Title" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 304;BA.debugLine="CLARequestTypeSpinner.AddAll(flist)";
Debug.ShouldStop(32768);
objects.mostCurrent._clarequesttypespinner.runVoidMethod ("AddAll",(Object)(_flist));
 BA.debugLineNum = 307;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(262144);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 307;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(262144);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 308;BA.debugLine="flist.Add(\"(Todos)\")";
Debug.ShouldStop(524288);
_flist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("(Todos)"))));
 BA.debugLineNum = 309;BA.debugLine="For i = 0 To ReqList.Size-1";
Debug.ShouldStop(1048576);
{
final int step97 = 1;
final int limit97 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._reqlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step97 > 0 && _i <= limit97) || (step97 < 0 && _i >= limit97) ;_i = ((int)(0 + _i + step97))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 310;BA.debugLine="Dim r As CodeNameList = ReqList.Get(i)";
Debug.ShouldStop(2097152);
_r = (objects.mostCurrent._reqlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 311;BA.debugLine="flist.Add( r.Name )";
Debug.ShouldStop(4194304);
_flist.runVoidMethod ("Add",(Object)((_r.getField(true,"Name" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 314;BA.debugLine="CLAPreRequestPickerLabel.AddAll(flist)";
Debug.ShouldStop(33554432);
objects.mostCurrent._claprerequestpickerlabel.runVoidMethod ("AddAll",(Object)(_flist));
 BA.debugLineNum = 316;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(134217728);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 316;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(134217728);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 317;BA.debugLine="flist.Add(\"(Todos)\")";
Debug.ShouldStop(268435456);
_flist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("(Todos)"))));
 BA.debugLineNum = 318;BA.debugLine="For i = 0 To DistrictsList.Size-1";
Debug.ShouldStop(536870912);
{
final int step105 = 1;
final int limit105 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._districtslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step105 > 0 && _i <= limit105) || (step105 < 0 && _i >= limit105) ;_i = ((int)(0 + _i + step105))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 319;BA.debugLine="Dim r As CodeNameList = DistrictsList.Get(i)";
Debug.ShouldStop(1073741824);
_r = (objects.mostCurrent._districtslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 320;BA.debugLine="flist.Add(r.Name)";
Debug.ShouldStop(-2147483648);
_flist.runVoidMethod ("Add",(Object)((_r.getField(true,"Name" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 322;BA.debugLine="CLAPreRequestDistrictePickerLabel.AddAll(flist)";
Debug.ShouldStop(2);
objects.mostCurrent._claprerequestdistrictepickerlabel.runVoidMethod ("AddAll",(Object)(_flist));
 BA.debugLineNum = 324;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(8);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 324;BA.debugLine="Dim flist As List : flist.initialize";
Debug.ShouldStop(8);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 325;BA.debugLine="flist.Add(\"(Todos)\")";
Debug.ShouldStop(16);
_flist.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("(Todos)"))));
 BA.debugLineNum = 326;BA.debugLine="For i = 0 To CountyList.Size-1";
Debug.ShouldStop(32);
{
final int step113 = 1;
final int limit113 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._countylist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step113 > 0 && _i <= limit113) || (step113 < 0 && _i >= limit113) ;_i = ((int)(0 + _i + step113))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 327;BA.debugLine="Dim r As CodeNameList = CountyList.Get(i)";
Debug.ShouldStop(64);
_r = (objects.mostCurrent._countylist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 328;BA.debugLine="flist.Add(r.Name)";
Debug.ShouldStop(128);
_flist.runVoidMethod ("Add",(Object)((_r.getField(true,"Name" /*RemoteObject*/ ))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 330;BA.debugLine="CLAPreRequestCountyPickerLabel.AddAll(flist)";
Debug.ShouldStop(512);
objects.mostCurrent._claprerequestcountypickerlabel.runVoidMethod ("AddAll",(Object)(_flist));
 BA.debugLineNum = 331;BA.debugLine="noRequestPanel.Visible = False";
Debug.ShouldStop(1024);
objects.mostCurrent._norequestpanel.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 332;BA.debugLine="UpdateMainLayout";
Debug.ShouldStop(2048);
_updatemainlayout();
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,368);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 368;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 369;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, objects.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 370;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(131072);
_listsbuttonclose_click();
 };
 BA.debugLineNum = 372;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return objects.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,365);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 365;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,357);
if (RapidSub.canDelegate("activity_resume")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","activity_resume"); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,357);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 358;BA.debugLine="If(FirstTimeBool) Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._firsttimebool).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 359;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "activity_resume"),BA.numberCast(int.class, 2000));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 BA.debugLineNum = 360;BA.debugLine="StartObjectsActivity(False, \"\")";
Debug.ShouldStop(128);
_startobjectsactivity(parent.mostCurrent.__c.getField(true,"False"),RemoteObject.createImmutable(""));
 BA.debugLineNum = 361;BA.debugLine="FirstTimeBool = False";
Debug.ShouldStop(256);
parent._firsttimebool = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _actualizasvr_clai_update(RemoteObject _cla,RemoteObject _itemtc,RemoteObject _uk,RemoteObject _val2fill,RemoteObject _objval,RemoteObject _repcnt) throws Exception{
try {
		Debug.PushSubsStack("ActualizaSvr_CLAI_Update (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3036);
if (RapidSub.canDelegate("actualizasvr_clai_update")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","actualizasvr_clai_update", _cla, _itemtc, _uk, _val2fill, _objval, _repcnt);}
ResumableSub_ActualizaSvr_CLAI_Update rsub = new ResumableSub_ActualizaSvr_CLAI_Update(null,_cla,_itemtc,_uk,_val2fill,_objval,_repcnt);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizaSvr_CLAI_Update extends BA.ResumableSub {
public ResumableSub_ActualizaSvr_CLAI_Update(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _cla,RemoteObject _itemtc,RemoteObject _uk,RemoteObject _val2fill,RemoteObject _objval,RemoteObject _repcnt) {
this.parent = parent;
this._cla = _cla;
this._itemtc = _itemtc;
this._uk = _uk;
this._val2fill = _val2fill;
this._objval = _objval;
this._repcnt = _repcnt;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _cla;
RemoteObject _itemtc;
RemoteObject _uk;
RemoteObject _val2fill;
RemoteObject _objval;
RemoteObject _repcnt;
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _aclsessuser = RemoteObject.createImmutable("");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizaSvr_CLAI_Update (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3036);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CLA", _cla);
Debug.locals.put("itemTC", _itemtc);
Debug.locals.put("UK", _uk);
Debug.locals.put("val2fill", _val2fill);
Debug.locals.put("ObjVal", _objval);
Debug.locals.put("repcnt", _repcnt);
 BA.debugLineNum = 3037;BA.debugLine="Dim params As Map";
Debug.ShouldStop(268435456);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3038;BA.debugLine="params.Initialize";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3039;BA.debugLine="params.Clear";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3040;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3041;BA.debugLine="params.Put(\"ACLARequest\", CLA.Request)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_cla.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3042;BA.debugLine="params.Put(\"ACLAAction\", CLA.Action)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_cla.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3043;BA.debugLine="params.Put(\"ACLATask\", CLA.Task)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_cla.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3044;BA.debugLine="params.Put(\"ACLAItem\",itemTC)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_itemtc)));
 BA.debugLineNum = 3045;BA.debugLine="params.Put(\"ACLAUniqueKey\", UK)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_uk)));
 BA.debugLineNum = 3047;BA.debugLine="params.Put(\"ACLAObjectTag\", ObjVal)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObjectTag"))),(Object)((_objval)));
 BA.debugLineNum = 3048;BA.debugLine="params.Put(\"ACLAValue\", val2fill)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValue"))),(Object)((_val2fill)));
 BA.debugLineNum = 3049;BA.debugLine="params.Put(\"ACLAReqCounter\", repcnt)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_repcnt)));
 BA.debugLineNum = 3050;BA.debugLine="params.Put(\"ACLARepeatItem\", 0)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3051;BA.debugLine="params.Put(\"ACLARepeatField\", 0)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3052;BA.debugLine="params.Put(\"ACLAInner\", 0)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAInner"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3054;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3055;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3056;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3057;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3058;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3059;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3060;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3061;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDateti";
Debug.ShouldStop(1048576);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 3062;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
Debug.ShouldStop(2097152);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 3063;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
Debug.ShouldStop(4194304);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 3065;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 3066;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 3067;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 3068;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_OPER_U";
Debug.ShouldStop(134217728);
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ;Debug.locals.put("ACLSessUser", _aclsessuser);Debug.locals.put("ACLSessUser", _aclsessuser);
 BA.debugLineNum = 3070;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((_aclsessuser)));
 BA.debugLineNum = 3071;BA.debugLine="params.Put(\"ACLClear\", 0)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLClear"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3073;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
Debug.ShouldStop(1);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3074;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 12;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3075;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 3076;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLA.Reque";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(objects.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_cla.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 3078;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(32);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_cla.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3079;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 3081;BA.debugLine="Sleep(250)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "actualizasvr_clai_update"),BA.numberCast(int.class, 250));
this.state = 13;
return;
case 13:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3083;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(1024);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_cla.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3084;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 3087;BA.debugLine="Return True";
Debug.ShouldStop(16384);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3089;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _addfavoritelabel_click() throws Exception{
try {
		Debug.PushSubsStack("AddFavoriteLabel_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3377);
if (RapidSub.canDelegate("addfavoritelabel_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","addfavoritelabel_click");}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _requestadded = RemoteObject.createImmutable("");
 BA.debugLineNum = 3377;BA.debugLine="Sub AddFavoriteLabel_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 3378;BA.debugLine="Dim lbl As Label =  Sender";
Debug.ShouldStop(131072);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lbl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 3379;BA.debugLine="Dim requestAdded As String = 0xFFD3D3D3";
Debug.ShouldStop(262144);
_requestadded = BA.NumberToString(0xffd3d3d3);Debug.locals.put("requestAdded", _requestadded);Debug.locals.put("requestAdded", _requestadded);
 BA.debugLineNum = 3381;BA.debugLine="If(lbl.TextColor <> requestAdded)Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("!",_lbl.runMethod(true,"getTextColor"),BA.numberCast(double.class, _requestadded)))) { 
 BA.debugLineNum = 3382;BA.debugLine="lbl.Text  = Chr(0xf006)";
Debug.ShouldStop(2097152);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf006)))));
 BA.debugLineNum = 3383;BA.debugLine="lbl.TextColor = 0xFFD3D3D3";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffd3d3d3));
 }else {
 BA.debugLineNum = 3386;BA.debugLine="lbl.Text  = Chr(0xf005)";
Debug.ShouldStop(33554432);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf005)))));
 BA.debugLineNum = 3387;BA.debugLine="lbl.TextColor = 0xFFFFCC00";
Debug.ShouldStop(67108864);
_lbl.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffffcc00));
 };
 BA.debugLineNum = 3390;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butbulkcreaterequest_click() throws Exception{
try {
		Debug.PushSubsStack("butBulkCreateRequest_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1981);
if (RapidSub.canDelegate("butbulkcreaterequest_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","butbulkcreaterequest_click");}
 BA.debugLineNum = 1981;BA.debugLine="Sub butBulkCreateRequest_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1982;BA.debugLine="FromBulkOption = 1";
Debug.ShouldStop(536870912);
objects._frombulkoption = BA.numberCast(int.class, 1);
 BA.debugLineNum = 1983;BA.debugLine="listButRequest_Click";
Debug.ShouldStop(1073741824);
_listbutrequest_click();
 BA.debugLineNum = 1984;BA.debugLine="UpdateExtraButtons";
Debug.ShouldStop(-2147483648);
_updateextrabuttons();
 BA.debugLineNum = 1985;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butbulkprerequest_click() throws Exception{
try {
		Debug.PushSubsStack("butBulkPreRequest_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1987);
if (RapidSub.canDelegate("butbulkprerequest_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","butbulkprerequest_click");}
 BA.debugLineNum = 1987;BA.debugLine="Sub butBulkPreRequest_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1988;BA.debugLine="FromBulkOption = 1";
Debug.ShouldStop(8);
objects._frombulkoption = BA.numberCast(int.class, 1);
 BA.debugLineNum = 1989;BA.debugLine="UpdateExtraButtons";
Debug.ShouldStop(16);
_updateextrabuttons();
 BA.debugLineNum = 1990;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcreaterequest_click() throws Exception{
try {
		Debug.PushSubsStack("butCreateRequest_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2011);
if (RapidSub.canDelegate("butcreaterequest_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","butcreaterequest_click");}
RemoteObject _verdade = RemoteObject.createImmutable(false);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _selchecklistlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 2011;BA.debugLine="Sub butCreateRequest_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 2013;BA.debugLine="Dim Verdade As Boolean = Utils.NNE(SelCheckList)";
Debug.ShouldStop(268435456);
_verdade = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._selchecklist))) && RemoteObject.solveBoolean(".",objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._selobject))));Debug.locals.put("Verdade", _verdade);Debug.locals.put("Verdade", _verdade);
 BA.debugLineNum = 2014;BA.debugLine="If Verdade Then";
Debug.ShouldStop(536870912);
if (_verdade.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2016;BA.debugLine="Dim sSQL As String = $\"select distinct a.task_ta";
Debug.ShouldStop(-2147483648);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct a.task_tagcode\n"),RemoteObject.createImmutable("							from dta_typerequests_tasks as a\n"),RemoteObject.createImmutable("							left join dta_typerequests_tasks_adds as b on\n"),RemoteObject.createImmutable("								(b.typerequest_tagcode=a.typerequest_tagcode\n"),RemoteObject.createImmutable("								and b.task_tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("							where 1=1\n"),RemoteObject.createImmutable("							and a.typerequest_tagcode='"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._selchecklist))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("							and b.paramters not like '%create_cl_only_ondemand\":1%';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2025;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(256);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), objects.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 2026;BA.debugLine="Dim SelCheckListList As List : SelCheckListList.";
Debug.ShouldStop(512);
_selchecklistlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("SelCheckListList", _selchecklistlist);
 BA.debugLineNum = 2026;BA.debugLine="Dim SelCheckListList As List : SelCheckListList.";
Debug.ShouldStop(512);
_selchecklistlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2027;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(1024);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 2028;BA.debugLine="SelCheckListList.Add(Record.GetString(\"task_tag";
Debug.ShouldStop(2048);
_selchecklistlist.runVoidMethod ("Add",(Object)((_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode"))))));
 }
;
 BA.debugLineNum = 2030;BA.debugLine="Record.Close";
Debug.ShouldStop(8192);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 2031;BA.debugLine="If (SelCheckListList.Size>=1) Then";
Debug.ShouldStop(16384);
if ((RemoteObject.solveBoolean("g",_selchecklistlist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 2032;BA.debugLine="CreateRequestsToObjects2(SelCheckList, SelCheck";
Debug.ShouldStop(32768);
_createrequeststoobjects2(objects.mostCurrent._selchecklist,_selchecklistlist,objects.mostCurrent._selobject,objects.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 2034;BA.debugLine="MsgboxAsync(ShareCode.NoChecklistInTypeRequest,";
Debug.ShouldStop(131072);
objects.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._nochecklistintyperequest /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),objects.processBA);
 };
 };
 BA.debugLineNum = 2132;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butcreaterequestcancel_click() throws Exception{
try {
		Debug.PushSubsStack("butCreateRequestCancel_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2001);
if (RapidSub.canDelegate("butcreaterequestcancel_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","butcreaterequestcancel_click");}
 BA.debugLineNum = 2001;BA.debugLine="Sub butCreateRequestCancel_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 2002;BA.debugLine="noRequestPanel.Visible = False";
Debug.ShouldStop(131072);
objects.mostCurrent._norequestpanel.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2003;BA.debugLine="CLARequestTypeSpinner.SelectedIndex = 0";
Debug.ShouldStop(262144);
objects.mostCurrent._clarequesttypespinner.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2004;BA.debugLine="CLARequestList.Clear";
Debug.ShouldStop(524288);
objects.mostCurrent._clarequestlist.runVoidMethod ("_clear");
 BA.debugLineNum = 2005;BA.debugLine="SelCheckList = \"\"";
Debug.ShouldStop(1048576);
objects.mostCurrent._selchecklist = BA.ObjectToString("");
 BA.debugLineNum = 2006;BA.debugLine="SelObject = \"\"";
Debug.ShouldStop(2097152);
objects.mostCurrent._selobject = BA.ObjectToString("");
 BA.debugLineNum = 2007;BA.debugLine="FromBulkOption = 0";
Debug.ShouldStop(4194304);
objects._frombulkoption = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2008;BA.debugLine="UpdateExtraButtons";
Debug.ShouldStop(8388608);
_updateextrabuttons();
 BA.debugLineNum = 2009;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _butsearch_click() throws Exception{
try {
		Debug.PushSubsStack("butSearch_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1106);
if (RapidSub.canDelegate("butsearch_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","butsearch_click");}
 BA.debugLineNum = 1106;BA.debugLine="Sub butSearch_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1107;BA.debugLine="MakeListSearch(EditSearch.Text)";
Debug.ShouldStop(262144);
_makelistsearch(objects.mostCurrent._editsearch.runMethod(true,"getText"));
 BA.debugLineNum = 1108;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonactionpause_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonActionPause_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1152);
if (RapidSub.canDelegate("buttonactionpause_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","buttonactionpause_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1152;BA.debugLine="Sub ButtonActionPause_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1153;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(1);
if ((RemoteObject.solveBoolean("=",objects.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 1155;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
Debug.ShouldStop(4);
_i = objects.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._avisopararpausa /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(objects.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(objects.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent.__c.getField(false,"Null"))),objects.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1156;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, objects.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1157;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
Debug.ShouldStop(16);
objects.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1158;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
Debug.ShouldStop(32);
objects.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(BA.ObjectToString("APP_START")),(Object)(BA.ObjectToString("SESS_IN_PAUSE")),(Object)(objects.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ));
 BA.debugLineNum = 1159;BA.debugLine="Starter.AppState.Flush";
Debug.ShouldStop(64);
objects.mostCurrent._starter._appstate /*RemoteObject*/ .runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_flush" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 1162;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(512);
_windowstatusupdate();
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonuserunavailable_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonUserUnavailable_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1053);
if (RapidSub.canDelegate("buttonuserunavailable_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","buttonuserunavailable_click");}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _cli = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
 BA.debugLineNum = 1053;BA.debugLine="Sub ButtonUserUnavailable_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1054;BA.debugLine="Dim i As Int";
Debug.ShouldStop(536870912);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 1055;BA.debugLine="i = Msgbox2(ShareCode.UserGoAvailableMessage, Sha";
Debug.ShouldStop(1073741824);
_i = objects.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._usergoavailablemessage /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(objects.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(objects.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent.__c.getField(false,"Null"))),objects.mostCurrent.activityBA);Debug.locals.put("i", _i);
 BA.debugLineNum = 1056;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, objects.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE"))))) { 
 BA.debugLineNum = 1057;BA.debugLine="Dim cli As AppDialogs";
Debug.ShouldStop(1);
_cli = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("cli", _cli);
 BA.debugLineNum = 1058;BA.debugLine="cli.Initialize";
Debug.ShouldStop(2);
_cli.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,objects.mostCurrent.activityBA);
 BA.debugLineNum = 1059;BA.debugLine="cli.MakeUserAvailable(\"Objects\")";
Debug.ShouldStop(4);
_cli.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_makeuseravailable" /*void*/ ,(Object)((RemoteObject.createImmutable("Objects"))));
 };
 BA.debugLineNum = 1061;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendargetenddate_ondateset(RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetEndDate_onDateSet (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3940);
if (RapidSub.canDelegate("calendargetenddate_ondateset")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","calendargetenddate_ondateset", _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3940;BA.debugLine="Sub CalendarGetEndDate_onDateSet(year As Int, mont";
Debug.ShouldStop(8);
 BA.debugLineNum = 3941;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(16);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3942;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(32);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3943;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(64);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3944;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3945;BA.debugLine="DialogReqEndDateLabel.Text = $\"${year}-${moy}-${d";
Debug.ShouldStop(256);
objects.mostCurrent._dialogreqenddatelabel.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3947;BA.debugLine="CumulativeDateIn = DialogReqStartDateLabel.Text";
Debug.ShouldStop(1024);
objects.mostCurrent._cumulativedatein = objects.mostCurrent._dialogreqstartdatelabel.runMethod(true,"getText");
 BA.debugLineNum = 3948;BA.debugLine="CumulativeDateOut = DialogReqEndDateLabel.Text";
Debug.ShouldStop(2048);
objects.mostCurrent._cumulativedateout = objects.mostCurrent._dialogreqenddatelabel.runMethod(true,"getText");
 BA.debugLineNum = 3949;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
Debug.ShouldStop(4096);
_makeprerequesttasklist(objects._cumulativetyperequest,objects._cumulativedistrict,objects._cumulativecounty,objects.mostCurrent._cumulativedatein,objects.mostCurrent._cumulativedateout,objects.mostCurrent._cumulativefilter);
 BA.debugLineNum = 3950;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calendargetstartdate_ondateset(RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("CalendarGetStartDate_onDateSet (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3928);
if (RapidSub.canDelegate("calendargetstartdate_ondateset")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","calendargetstartdate_ondateset", _year, _monthofyear, _dayofmonth);}
RemoteObject _moy = RemoteObject.createImmutable("");
RemoteObject _dom = RemoteObject.createImmutable("");
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 3928;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 3929;BA.debugLine="Dim moy As String = monthOfYear+1";
Debug.ShouldStop(16777216);
_moy = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {_monthofyear,RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("moy", _moy);Debug.locals.put("moy", _moy);
 BA.debugLineNum = 3930;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("=",_moy.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_moy = RemoteObject.concat(RemoteObject.createImmutable("0"),_moy);Debug.locals.put("moy", _moy);};
 BA.debugLineNum = 3931;BA.debugLine="Dim dom As String = dayOfMonth";
Debug.ShouldStop(67108864);
_dom = BA.NumberToString(_dayofmonth);Debug.locals.put("dom", _dom);Debug.locals.put("dom", _dom);
 BA.debugLineNum = 3932;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("=",_dom.runMethod(true,"length"),BA.numberCast(double.class, 1)))) { 
_dom = RemoteObject.concat(RemoteObject.createImmutable("0"),_dom);Debug.locals.put("dom", _dom);};
 BA.debugLineNum = 3933;BA.debugLine="DialogReqStartDateLabel.Text = $\"${year}-${moy}-$";
Debug.ShouldStop(268435456);
objects.mostCurrent._dialogreqstartdatelabel.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_year))),RemoteObject.createImmutable("-"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_moy))),RemoteObject.createImmutable("-"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_dom))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3935;BA.debugLine="CumulativeDateIn = DialogReqStartDateLabel.Text";
Debug.ShouldStop(1073741824);
objects.mostCurrent._cumulativedatein = objects.mostCurrent._dialogreqstartdatelabel.runMethod(true,"getText");
 BA.debugLineNum = 3936;BA.debugLine="CumulativeDateOut = DialogReqEndDateLabel.Text";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._cumulativedateout = objects.mostCurrent._dialogreqenddatelabel.runMethod(true,"getText");
 BA.debugLineNum = 3937;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
Debug.ShouldStop(1);
_makeprerequesttasklist(objects._cumulativetyperequest,objects._cumulativedistrict,objects._cumulativecounty,objects.mostCurrent._cumulativedatein,objects.mostCurrent._cumulativedateout,objects.mostCurrent._cumulativefilter);
 BA.debugLineNum = 3938;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancelallfilters(RemoteObject _run) throws Exception{
try {
		Debug.PushSubsStack("CancelAllFilters (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,375);
if (RapidSub.canDelegate("cancelallfilters")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","cancelallfilters", _run);}
Debug.locals.put("run", _run);
 BA.debugLineNum = 375;BA.debugLine="Sub CancelAllFilters(run As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 376;BA.debugLine="IsFiltered  = False";
Debug.ShouldStop(8388608);
objects._isfiltered = objects.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 377;BA.debugLine="iDialogReqTypeObject = ShareCode.OBJ_DefaultType";
Debug.ShouldStop(16777216);
objects._idialogreqtypeobject = objects.mostCurrent._sharecode._obj_defaulttype /*RemoteObject*/ ;
 BA.debugLineNum = 378;BA.debugLine="iDialogReqZone = ShareCode.OBJ_DefaultZone";
Debug.ShouldStop(33554432);
objects._idialogreqzone = objects.mostCurrent._sharecode._obj_defaultzone /*RemoteObject*/ ;
 BA.debugLineNum = 379;BA.debugLine="iDialogReqStatus = 0";
Debug.ShouldStop(67108864);
objects._idialogreqstatus = BA.numberCast(int.class, 0);
 BA.debugLineNum = 380;BA.debugLine="sDialogReqName = \"\"";
Debug.ShouldStop(134217728);
objects.mostCurrent._sdialogreqname = BA.ObjectToString("");
 BA.debugLineNum = 381;BA.debugLine="iDialogReqRegion = 0";
Debug.ShouldStop(268435456);
objects._idialogreqregion = BA.numberCast(int.class, 0);
 BA.debugLineNum = 382;BA.debugLine="iDialogReqLocal = 0";
Debug.ShouldStop(536870912);
objects._idialogreqlocal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 383;BA.debugLine="sDialogReqAddress = \"\"";
Debug.ShouldStop(1073741824);
objects.mostCurrent._sdialogreqaddress = BA.ObjectToString("");
 BA.debugLineNum = 384;BA.debugLine="iDialogReqWithRequests = 0";
Debug.ShouldStop(-2147483648);
objects._idialogreqwithrequests = BA.numberCast(int.class, 0);
 BA.debugLineNum = 385;BA.debugLine="UpdateGlobalObjectFilter";
Debug.ShouldStop(1);
_updateglobalobjectfilter();
 BA.debugLineNum = 386;BA.debugLine="StartObjectsActivity(True, \"\")";
Debug.ShouldStop(2);
_startobjectsactivity(objects.mostCurrent.__c.getField(true,"True"),RemoteObject.createImmutable(""));
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changemyposition() throws Exception{
try {
		Debug.PushSubsStack("ChangeMyPosition (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,814);
if (RapidSub.canDelegate("changemyposition")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","changemyposition");}
 BA.debugLineNum = 814;BA.debugLine="Public Sub ChangeMyPosition";
Debug.ShouldStop(8192);
 BA.debugLineNum = 817;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _checkdattoupdateinchecklist(RemoteObject _request_type,RemoteObject _tagcode,RemoteObject _actionkey,RemoteObject _repeatcounter) throws Exception{
try {
		Debug.PushSubsStack("CheckDatToUpdateInChecklist (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2722);
if (RapidSub.canDelegate("checkdattoupdateinchecklist")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","checkdattoupdateinchecklist", _request_type, _tagcode, _actionkey, _repeatcounter);}
ResumableSub_CheckDatToUpdateInChecklist rsub = new ResumableSub_CheckDatToUpdateInChecklist(null,_request_type,_tagcode,_actionkey,_repeatcounter);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CheckDatToUpdateInChecklist extends BA.ResumableSub {
public ResumableSub_CheckDatToUpdateInChecklist(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _request_type,RemoteObject _tagcode,RemoteObject _actionkey,RemoteObject _repeatcounter) {
this.parent = parent;
this._request_type = _request_type;
this._tagcode = _tagcode;
this._actionkey = _actionkey;
this._repeatcounter = _repeatcounter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _request_type;
RemoteObject _tagcode;
RemoteObject _actionkey;
RemoteObject _repeatcounter;
RemoteObject _questparams = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _upload_data = RemoteObject.createImmutable(0);
RemoteObject _up_settings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _upload_data_start = RemoteObject.createImmutable(0);
RemoteObject _ud_settings_start = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _data_tagcode = RemoteObject.createImmutable("");
RemoteObject _data_group = RemoteObject.createImmutable("");
RemoteObject _data_subgroup = RemoteObject.createImmutable("");
RemoteObject _data_origin = RemoteObject.createImmutable("");
RemoteObject _chapters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colchapters = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _chapter_in = RemoteObject.createImmutable("");
RemoteObject _chapter_out = RemoteObject.createImmutable("");
RemoteObject _chapter_repeat = RemoteObject.createImmutable(0);
RemoteObject _sqlrepeateditems = RemoteObject.createImmutable("");
RemoteObject _repeateditems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _reqrows = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _rpos = 0;
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _upcolitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _val_field_in = RemoteObject.createImmutable("");
RemoteObject _val_field_out = RemoteObject.createImmutable("");
RemoteObject _item_tagcode_in = RemoteObject.createImmutable("");
RemoteObject _item_tagcode_out = RemoteObject.createImmutable("");
RemoteObject _set_object_field = RemoteObject.createImmutable(0);
RemoteObject _set_title_field = RemoteObject.createImmutable(0);
RemoteObject _set_subobject_field = RemoteObject.createImmutable(0);
RemoteObject _set_status = RemoteObject.createImmutable(0);
RemoteObject _colsin = RemoteObject.createImmutable("");
RemoteObject _r110sql = RemoteObject.createImmutable("");
RemoteObject _r110 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _rr1 = 0;
RemoteObject _colsout = RemoteObject.createImmutable("");
RemoteObject _updsqlrec = RemoteObject.createImmutable("");
RemoteObject group20;
int index20;
int groupLen20;
int step32;
int limit32;
int step41;
int limit41;
RemoteObject group43;
int index43;
int groupLen43;
int step68;
int limit68;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CheckDatToUpdateInChecklist (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2722);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("request_type", _request_type);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("actionkey", _actionkey);
Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 2723;BA.debugLine="Dim QuestParams As Map = DBStructures.GetScriptCo";
Debug.ShouldStop(4);
_questparams = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_questparams = parent.mostCurrent._dbstructures.runMethod(false,"_getscriptcolumnstrevcjsonmap" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select distinct paramters \n"),RemoteObject.createImmutable("												from dta_typerequests_tasks_adds where 1=1\n"),RemoteObject.createImmutable("												And typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("												And task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("paramters")));Debug.locals.put("QuestParams", _questparams);Debug.locals.put("QuestParams", _questparams);
 BA.debugLineNum = 2729;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 2730;BA.debugLine="Dim upload_data As Int = QuestParams.Get(\"upload";
Debug.ShouldStop(512);
_upload_data = BA.numberCast(int.class, _questparams.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("upload_data")))));Debug.locals.put("upload_data", _upload_data);Debug.locals.put("upload_data", _upload_data);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 2732;BA.debugLine="Dim upload_data As Int = 0";
Debug.ShouldStop(2048);
_upload_data = BA.numberCast(int.class, 0);Debug.locals.put("upload_data", _upload_data);Debug.locals.put("upload_data", _upload_data);
 BA.debugLineNum = 2733;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156172299",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2734;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2737;BA.debugLine="If Utils.Int2Bool(upload_data) Then";
Debug.ShouldStop(65536);

case 6:
//if
this.state = 83;
this.catchState = 0;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_upload_data)).<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2739;BA.debugLine="Dim up_settings As Map = QuestParams.Get(\"up_set";
Debug.ShouldStop(262144);
_up_settings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_up_settings = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _questparams.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("up_settings")))));Debug.locals.put("up_settings", _up_settings);
 BA.debugLineNum = 2740;BA.debugLine="Dim upload_data_start As Int = up_settings.Get(\"";
Debug.ShouldStop(524288);
_upload_data_start = BA.numberCast(int.class, _up_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("upload_data_start")))));Debug.locals.put("upload_data_start", _upload_data_start);Debug.locals.put("upload_data_start", _upload_data_start);
 BA.debugLineNum = 2742;BA.debugLine="If Utils.Int2Bool(upload_data_start) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 9:
//if
this.state = 82;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_upload_data_start)).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2743;BA.debugLine="Dim ud_settings_start As Map = up_settings.Get(";
Debug.ShouldStop(4194304);
_ud_settings_start = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ud_settings_start = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _up_settings.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ud_settings_start")))));Debug.locals.put("ud_settings_start", _ud_settings_start);
 BA.debugLineNum = 2744;BA.debugLine="Dim data_tagcode As String = ud_settings_start.";
Debug.ShouldStop(8388608);
_data_tagcode = BA.ObjectToString(_ud_settings_start.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_tagcode")))));Debug.locals.put("data_tagcode", _data_tagcode);Debug.locals.put("data_tagcode", _data_tagcode);
 BA.debugLineNum = 2745;BA.debugLine="Dim data_group As String = ud_settings_start.Ge";
Debug.ShouldStop(16777216);
_data_group = BA.ObjectToString(_ud_settings_start.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_group")))));Debug.locals.put("data_group", _data_group);Debug.locals.put("data_group", _data_group);
 BA.debugLineNum = 2746;BA.debugLine="Dim data_subgroup As String = ud_settings_start";
Debug.ShouldStop(33554432);
_data_subgroup = BA.ObjectToString(_ud_settings_start.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_subgroup")))));Debug.locals.put("data_subgroup", _data_subgroup);Debug.locals.put("data_subgroup", _data_subgroup);
 BA.debugLineNum = 2747;BA.debugLine="Dim data_origin As String = ud_settings_start.G";
Debug.ShouldStop(67108864);
_data_origin = BA.ObjectToString(_ud_settings_start.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("data_origin")))));Debug.locals.put("data_origin", _data_origin);Debug.locals.put("data_origin", _data_origin);
 BA.debugLineNum = 2749;BA.debugLine="If (data_origin.ToUpperCase = \"TINOUT_CHECKLIST";
Debug.ShouldStop(268435456);
if (true) break;

case 12:
//if
this.state = 81;
if ((RemoteObject.solveBoolean("=",_data_origin.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("TINOUT_CHECKLISTS")))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2750;BA.debugLine="Dim chapters As List = ud_settings_start.Get(\"";
Debug.ShouldStop(536870912);
_chapters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_chapters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _ud_settings_start.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chapters")))));Debug.locals.put("chapters", _chapters);
 BA.debugLineNum = 2751;BA.debugLine="For Each colchapters As Map In chapters";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//for
this.state = 80;
_colchapters = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group20 = _chapters;
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colchapters", _colchapters);
this.state = 84;
if (true) break;

case 84:
//C
this.state = 80;
if (index20 < groupLen20) {
this.state = 17;
_colchapters = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group20.runMethod(false,"Get",index20));}
if (true) break;

case 85:
//C
this.state = 84;
index20++;
Debug.locals.put("colchapters", _colchapters);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2753;BA.debugLine="Dim chapter_in As String = colchapters.Get(\"c";
Debug.ShouldStop(1);
_chapter_in = BA.ObjectToString(_colchapters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chapter_in")))));Debug.locals.put("chapter_in", _chapter_in);Debug.locals.put("chapter_in", _chapter_in);
 BA.debugLineNum = 2754;BA.debugLine="Dim chapter_out As String = colchapters.Get(\"";
Debug.ShouldStop(2);
_chapter_out = BA.ObjectToString(_colchapters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chapter_out")))));Debug.locals.put("chapter_out", _chapter_out);Debug.locals.put("chapter_out", _chapter_out);
 BA.debugLineNum = 2755;BA.debugLine="Dim chapter_repeat As Int = colchapters.Get(\"";
Debug.ShouldStop(4);
_chapter_repeat = BA.numberCast(int.class, _colchapters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("chapter_repeat")))));Debug.locals.put("chapter_repeat", _chapter_repeat);Debug.locals.put("chapter_repeat", _chapter_repeat);
 BA.debugLineNum = 2760;BA.debugLine="Dim SQLRepeatedItems As String = $\"select dis";
Debug.ShouldStop(128);
_sqlrepeateditems = (RemoteObject.concat(RemoteObject.createImmutable("select distinct repeatitemcounter from dta_requests_values\n"),RemoteObject.createImmutable("																		where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("																		and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("																		And item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_chapter_in))),RemoteObject.createImmutable("'")));Debug.locals.put("SQLRepeatedItems", _sqlrepeateditems);Debug.locals.put("SQLRepeatedItems", _sqlrepeateditems);
 BA.debugLineNum = 2764;BA.debugLine="Dim RepeatedItems As Cursor = Starter.LocalSQ";
Debug.ShouldStop(2048);
_repeateditems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_repeateditems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlrepeateditems)));Debug.locals.put("RepeatedItems", _repeateditems);
 BA.debugLineNum = 2765;BA.debugLine="Dim ReqRows As Int = RepeatedItems.RowCount";
Debug.ShouldStop(4096);
_reqrows = _repeateditems.runMethod(true,"getRowCount");Debug.locals.put("ReqRows", _reqrows);Debug.locals.put("ReqRows", _reqrows);
 BA.debugLineNum = 2766;BA.debugLine="If (ReqRows >= 1) Then";
Debug.ShouldStop(8192);
if (true) break;

case 18:
//if
this.state = 79;
if ((RemoteObject.solveBoolean("g",_reqrows,BA.numberCast(double.class, 1)))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 2768;BA.debugLine="Dim items As List = colchapters.Get(\"items\")";
Debug.ShouldStop(32768);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colchapters.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);
 BA.debugLineNum = 2769;BA.debugLine="If Not(Utils.Int2Bool(chapter_repeat)) Then";
Debug.ShouldStop(65536);
if (true) break;

case 21:
//if
this.state = 24;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_chapter_repeat)))).<Boolean>get().booleanValue()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2770;BA.debugLine="ReqRows = 1";
Debug.ShouldStop(131072);
_reqrows = BA.numberCast(int.class, 1);Debug.locals.put("ReqRows", _reqrows);
 if (true) break;
;
 BA.debugLineNum = 2773;BA.debugLine="For rpos=0 To ReqRows-1";
Debug.ShouldStop(1048576);

case 24:
//for
this.state = 31;
step32 = 1;
limit32 = RemoteObject.solve(new RemoteObject[] {_reqrows,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rpos = 0 ;
Debug.locals.put("rpos", _rpos);
this.state = 86;
if (true) break;

case 86:
//C
this.state = 31;
if ((step32 > 0 && _rpos <= limit32) || (step32 < 0 && _rpos >= limit32)) this.state = 26;
if (true) break;

case 87:
//C
this.state = 86;
_rpos = ((int)(0 + _rpos + step32)) ;
Debug.locals.put("rpos", _rpos);
if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 2774;BA.debugLine="RepeatedItems.Position = rpos";
Debug.ShouldStop(2097152);
_repeateditems.runMethod(true,"setPosition",BA.numberCast(int.class, _rpos));
 BA.debugLineNum = 2775;BA.debugLine="If (rpos = 0) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 27:
//if
this.state = 30;
if ((RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_rpos),BA.numberCast(double.class, 0)))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 2776;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
Debug.ShouldStop(8388608);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2777;BA.debugLine="Dim sSQL As String = $\"insert into dta_req";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("																	tagcode,position,\n"),RemoteObject.createImmutable("																	execute_status, execute_value, execute_value_title, title, execute_format_title,\n"),RemoteObject.createImmutable("																	confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)\n"),RemoteObject.createImmutable("																	select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("																	tagcode,position, 0, '', '', '', execute_format_title, confirmed,changed_value, \n"),RemoteObject.createImmutable("																	repeatcounter, "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_rpos)))),RemoteObject.createImmutable("  AS repeatitemcounter, \n"),RemoteObject.createImmutable("																	repeatfieldcounter,val_min, val_max\n"),RemoteObject.createImmutable("																	from dta_requests_values As a where\n"),RemoteObject.createImmutable("																	a.item_tagcode||a.unique_key in (Select item_tagcode||unique_key\n"),RemoteObject.createImmutable("																		from dta_tasks_items where (parent_tagcode in (Select unique_key from dta_tasks_items \n"),RemoteObject.createImmutable("																		where item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_chapter_out.runMethod(true,"trim")))),RemoteObject.createImmutable("' and repeated=1)) or \n"),RemoteObject.createImmutable("																			(item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_chapter_out.runMethod(true,"trim")))),RemoteObject.createImmutable("' and repeated=1)) \n"),RemoteObject.createImmutable("																	And a.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(" \n"),RemoteObject.createImmutable("																	and repeatitemcounter=0\n"),RemoteObject.createImmutable("																	and a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																	and a.task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey.runMethod(true,"trim")))),RemoteObject.createImmutable("'  order by a.position")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2796;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156172362",_ssql,0);
 BA.debugLineNum = 2797;BA.debugLine="Utils.SaveSQLToLog(\"butAddMore_Click\",sSQL";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("butAddMore_Click")),(Object)(_ssql),(Object)(_tagcode));
 if (true) break;

case 30:
//C
this.state = 87;
;
 if (true) break;
if (true) break;
Debug.locals.put("rpos", _rpos);
;
 BA.debugLineNum = 2801;BA.debugLine="For rpos=0 To ReqRows-1";
Debug.ShouldStop(65536);

case 31:
//for
this.state = 78;
step41 = 1;
limit41 = RemoteObject.solve(new RemoteObject[] {_reqrows,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rpos = 0 ;
Debug.locals.put("rpos", _rpos);
this.state = 88;
if (true) break;

case 88:
//C
this.state = 78;
if ((step41 > 0 && _rpos <= limit41) || (step41 < 0 && _rpos >= limit41)) this.state = 33;
if (true) break;

case 89:
//C
this.state = 88;
_rpos = ((int)(0 + _rpos + step41)) ;
Debug.locals.put("rpos", _rpos);
if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2802;BA.debugLine="RepeatedItems.Position = rpos";
Debug.ShouldStop(131072);
_repeateditems.runMethod(true,"setPosition",BA.numberCast(int.class, _rpos));
 BA.debugLineNum = 2804;BA.debugLine="For Each upcolitems As Map In items";
Debug.ShouldStop(524288);
if (true) break;

case 34:
//for
this.state = 77;
_upcolitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group43 = _items;
index43 = 0;
groupLen43 = group43.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("upcolitems", _upcolitems);
this.state = 90;
if (true) break;

case 90:
//C
this.state = 77;
if (index43 < groupLen43) {
this.state = 36;
_upcolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group43.runMethod(false,"Get",index43));}
if (true) break;

case 91:
//C
this.state = 90;
index43++;
Debug.locals.put("upcolitems", _upcolitems);
if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 2805;BA.debugLine="Dim val_field_in As String = upcolitems.Ge";
Debug.ShouldStop(1048576);
_val_field_in = BA.ObjectToString(_upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val_field_in")))));Debug.locals.put("val_field_in", _val_field_in);Debug.locals.put("val_field_in", _val_field_in);
 BA.debugLineNum = 2806;BA.debugLine="Dim val_field_out As String = upcolitems.G";
Debug.ShouldStop(2097152);
_val_field_out = BA.ObjectToString(_upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("val_field_out")))));Debug.locals.put("val_field_out", _val_field_out);Debug.locals.put("val_field_out", _val_field_out);
 BA.debugLineNum = 2807;BA.debugLine="Dim item_tagcode_in As String = upcolitems";
Debug.ShouldStop(4194304);
_item_tagcode_in = BA.ObjectToString(_upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_tagcode_in")))));Debug.locals.put("item_tagcode_in", _item_tagcode_in);Debug.locals.put("item_tagcode_in", _item_tagcode_in);
 BA.debugLineNum = 2808;BA.debugLine="Dim item_tagcode_out As String = upcolitem";
Debug.ShouldStop(8388608);
_item_tagcode_out = BA.ObjectToString(_upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_tagcode_out")))));Debug.locals.put("item_tagcode_out", _item_tagcode_out);Debug.locals.put("item_tagcode_out", _item_tagcode_out);
 BA.debugLineNum = 2810;BA.debugLine="Dim set_object_field As Int = upcolitems.G";
Debug.ShouldStop(33554432);
_set_object_field = BA.numberCast(int.class, _upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set_object_field")))));Debug.locals.put("set_object_field", _set_object_field);Debug.locals.put("set_object_field", _set_object_field);
 BA.debugLineNum = 2811;BA.debugLine="Dim set_title_field As Int = upcolitems.Ge";
Debug.ShouldStop(67108864);
_set_title_field = BA.numberCast(int.class, _upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set_title_field")))));Debug.locals.put("set_title_field", _set_title_field);Debug.locals.put("set_title_field", _set_title_field);
 BA.debugLineNum = 2812;BA.debugLine="Dim set_subobject_field As Int = upcolitem";
Debug.ShouldStop(134217728);
_set_subobject_field = BA.numberCast(int.class, _upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set_subobject_field")))));Debug.locals.put("set_subobject_field", _set_subobject_field);Debug.locals.put("set_subobject_field", _set_subobject_field);
 BA.debugLineNum = 2813;BA.debugLine="Dim set_status As Int = upcolitems.Get(\"se";
Debug.ShouldStop(268435456);
_set_status = BA.numberCast(int.class, _upcolitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("set_status")))));Debug.locals.put("set_status", _set_status);Debug.locals.put("set_status", _set_status);
 BA.debugLineNum = 2815;BA.debugLine="Dim colsin As String = val_field_in";
Debug.ShouldStop(1073741824);
_colsin = _val_field_in;Debug.locals.put("colsin", _colsin);Debug.locals.put("colsin", _colsin);
 BA.debugLineNum = 2816;BA.debugLine="If Utils.Int2Bool(set_object_field) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 37:
//if
this.state = 40;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_object_field)).<Boolean>get().booleanValue()) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2817;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
Debug.ShouldStop(1);
_colsin = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsin),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsin))),RemoteObject.createImmutable(", object_tagcode")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsin", _colsin);
 if (true) break;
;
 BA.debugLineNum = 2819;BA.debugLine="If Utils.Int2Bool(set_title_field) Then";
Debug.ShouldStop(4);

case 40:
//if
this.state = 43;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_title_field)).<Boolean>get().booleanValue()) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2820;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
Debug.ShouldStop(8);
_colsin = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsin),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsin))),RemoteObject.createImmutable(", title")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsin", _colsin);
 if (true) break;
;
 BA.debugLineNum = 2822;BA.debugLine="If Utils.Int2Bool(set_subobject_field) The";
Debug.ShouldStop(32);

case 43:
//if
this.state = 46;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_subobject_field)).<Boolean>get().booleanValue()) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 2823;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
Debug.ShouldStop(64);
_colsin = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsin),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsin))),RemoteObject.createImmutable(", subobject_tagcode")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsin", _colsin);
 if (true) break;
;
 BA.debugLineNum = 2825;BA.debugLine="If Utils.Int2Bool(set_status) Then";
Debug.ShouldStop(256);

case 46:
//if
this.state = 49;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_status)).<Boolean>get().booleanValue()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 2826;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
Debug.ShouldStop(512);
_colsin = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsin),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsin))),RemoteObject.createImmutable(", execute_status")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsin", _colsin);
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 2829;BA.debugLine="Dim r110SQL As String = $\"select ${colsin}";
Debug.ShouldStop(4096);
_r110sql = (RemoteObject.concat(RemoteObject.createImmutable("select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsin))),RemoteObject.createImmutable(" from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("																				and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																				and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_data_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																				and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode_in.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																				And repeatcounter='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																				And repeatitemcounter='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_rpos)))),RemoteObject.createImmutable("'")));Debug.locals.put("r110SQL", _r110sql);Debug.locals.put("r110SQL", _r110sql);
 BA.debugLineNum = 2837;BA.debugLine="Dim r110 As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(1048576);
_r110 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_r110 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_r110sql)));Debug.locals.put("r110", _r110);
 BA.debugLineNum = 2838;BA.debugLine="If (r110.RowCount >= 1) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 50:
//if
this.state = 76;
if ((RemoteObject.solveBoolean("g",_r110.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 2839;BA.debugLine="For rr1=0 To r110.RowCount-1";
Debug.ShouldStop(4194304);
if (true) break;

case 53:
//for
this.state = 75;
step68 = 1;
limit68 = RemoteObject.solve(new RemoteObject[] {_r110.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_rr1 = 0 ;
Debug.locals.put("rr1", _rr1);
this.state = 92;
if (true) break;

case 92:
//C
this.state = 75;
if ((step68 > 0 && _rr1 <= limit68) || (step68 < 0 && _rr1 >= limit68)) this.state = 55;
if (true) break;

case 93:
//C
this.state = 92;
_rr1 = ((int)(0 + _rr1 + step68)) ;
Debug.locals.put("rr1", _rr1);
if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 2840;BA.debugLine="r110.Position = rr1";
Debug.ShouldStop(8388608);
_r110.runMethod(true,"setPosition",BA.numberCast(int.class, _rr1));
 BA.debugLineNum = 2842;BA.debugLine="Dim colsout As String = $\"${val_field_ou";
Debug.ShouldStop(33554432);
_colsout = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_val_field_out))),RemoteObject.createImmutable("='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_r110.runMethod(true,"GetString",(Object)(_val_field_in))))),RemoteObject.createImmutable("'")));Debug.locals.put("colsout", _colsout);Debug.locals.put("colsout", _colsout);
 BA.debugLineNum = 2843;BA.debugLine="If Utils.Int2Bool(set_object_field) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 56:
//if
this.state = 59;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_object_field)).<Boolean>get().booleanValue()) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2844;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
Debug.ShouldStop(134217728);
_colsout = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsout),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsout))),RemoteObject.createImmutable(", object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_r110.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("object_tagcode")))))),RemoteObject.createImmutable("'")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsout", _colsout);
 if (true) break;
;
 BA.debugLineNum = 2846;BA.debugLine="If Utils.Int2Bool(set_title_field) Then";
Debug.ShouldStop(536870912);

case 59:
//if
this.state = 62;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_title_field)).<Boolean>get().booleanValue()) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2847;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
Debug.ShouldStop(1073741824);
_colsout = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsout),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsout))),RemoteObject.createImmutable(", title='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_r110.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")))))),RemoteObject.createImmutable("'")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsout", _colsout);
 if (true) break;
;
 BA.debugLineNum = 2849;BA.debugLine="If Utils.Int2Bool(set_subobject_field) T";
Debug.ShouldStop(1);

case 62:
//if
this.state = 65;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_subobject_field)).<Boolean>get().booleanValue()) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 2850;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
Debug.ShouldStop(2);
_colsout = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsout),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsout))),RemoteObject.createImmutable(", subobject_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_r110.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("subobject_tagcode")))))),RemoteObject.createImmutable("'")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsout", _colsout);
 if (true) break;
;
 BA.debugLineNum = 2852;BA.debugLine="If Utils.Int2Bool(set_status) Then";
Debug.ShouldStop(8);

case 65:
//if
this.state = 68;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_set_status)).<Boolean>get().booleanValue()) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2853;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
Debug.ShouldStop(16);
_colsout = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnotnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_colsout),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsout))),RemoteObject.createImmutable(", execute_status='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_r110.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("execute_status")))))),RemoteObject.createImmutable("'")))))))),RemoteObject.createImmutable("")));Debug.locals.put("colsout", _colsout);
 if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 2856;BA.debugLine="Dim updSQLRec As String = $\"update dta_r";
Debug.ShouldStop(128);
_updsqlrec = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colsout))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("																			where 1=1\n"),RemoteObject.createImmutable("																			and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode_out.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																			And repeatcounter='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("																			And repeatitemcounter='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_rpos)))),RemoteObject.createImmutable("'")));Debug.locals.put("updSQLRec", _updsqlrec);Debug.locals.put("updSQLRec", _updsqlrec);
 BA.debugLineNum = 2864;BA.debugLine="Log(updSQLRec)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156172430",_updsqlrec,0);
 BA.debugLineNum = 2865;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 2866;BA.debugLine="Utils.SaveSQLToLog(\"ListaPrincipal_Item";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ListaPrincipal_ItemClick")),(Object)(_updsqlrec),(Object)(_tagcode));
 Debug.CheckDeviceExceptions();
if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
 BA.debugLineNum = 2868;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156172434",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 74:
//C
this.state = 93;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
Debug.locals.put("rr1", _rr1);
;
 if (true) break;

case 76:
//C
this.state = 91;
;
 BA.debugLineNum = 2873;BA.debugLine="r110.Close";
Debug.ShouldStop(16777216);
_r110.runVoidMethod ("Close");
 if (true) break;
if (true) break;

case 77:
//C
this.state = 89;
Debug.locals.put("upcolitems", _upcolitems);
;
 if (true) break;
if (true) break;

case 78:
//C
this.state = 79;
Debug.locals.put("rpos", _rpos);
;
 if (true) break;

case 79:
//C
this.state = 85;
;
 BA.debugLineNum = 2878;BA.debugLine="RepeatedItems.Close";
Debug.ShouldStop(536870912);
_repeateditems.runVoidMethod ("Close");
 if (true) break;
if (true) break;

case 80:
//C
this.state = 81;
Debug.locals.put("colchapters", _colchapters);
;
 if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = 83;
;
 if (true) break;

case 83:
//C
this.state = -1;
;
 BA.debugLineNum = 2887;BA.debugLine="Log(\"CheckDatToUpdateInChecklist\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156172453",RemoteObject.createImmutable("CheckDatToUpdateInChecklist"),0);
 BA.debugLineNum = 2888;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2889;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static RemoteObject  _clabuttonrequestdownload_click() throws Exception{
try {
		Debug.PushSubsStack("CLAButtonRequestDownload_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1699);
if (RapidSub.canDelegate("clabuttonrequestdownload_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","clabuttonrequestdownload_click");}
 BA.debugLineNum = 1699;BA.debugLine="Sub CLAButtonRequestDownload_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1701;BA.debugLine="GetPreReqAssign";
Debug.ShouldStop(16);
_getprereqassign();
 BA.debugLineNum = 1703;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _clabuttonrequestfilter_click() throws Exception{
try {
		Debug.PushSubsStack("CLAButtonRequestFilter_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1689);
if (RapidSub.canDelegate("clabuttonrequestfilter_click")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","clabuttonrequestfilter_click"); return;}
ResumableSub_CLAButtonRequestFilter_Click rsub = new ResumableSub_CLAButtonRequestFilter_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CLAButtonRequestFilter_Click extends BA.ResumableSub {
public ResumableSub_CLAButtonRequestFilter_Click(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _completed = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CLAButtonRequestFilter_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1689);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 1692;BA.debugLine="Dim res As ResumableSub = CreatePreReqHeaders";
Debug.ShouldStop(134217728);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _createprereqheaders();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1693;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "clabuttonrequestfilter_click"), _res);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 1695;BA.debugLine="CLAButtonRequestDownload.Enabled = True";
Debug.ShouldStop(1073741824);
parent.mostCurrent._clabuttonrequestdownload.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1697;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static void  _complete(RemoteObject _completed) throws Exception{
}
public static RemoteObject  _claprerequestcountypickerlabel_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAPreRequestCountyPickerLabel_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3392);
if (RapidSub.canDelegate("claprerequestcountypickerlabel_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","claprerequestcountypickerlabel_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3392;BA.debugLine="Sub CLAPreRequestCountyPickerLabel_ItemClick (Posi";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3394;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
Debug.ShouldStop(2);
_makeprerequesttasklist(objects._cumulativetyperequest,objects._cumulativedistrict,_position,objects.mostCurrent._cumulativedatein,objects.mostCurrent._cumulativedateout,objects.mostCurrent._cumulativefilter);
 BA.debugLineNum = 3395;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claprerequestdistrictepickerlabel_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAPreRequestDistrictePickerLabel_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3397);
if (RapidSub.canDelegate("claprerequestdistrictepickerlabel_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","claprerequestdistrictepickerlabel_itemclick", _position, _value);}
RemoteObject _where = RemoteObject.createImmutable("");
RemoteObject _r = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
int _c = 0;
RemoteObject _c2g = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3397;BA.debugLine="Sub CLAPreRequestDistrictePickerLabel_ItemClick (P";
Debug.ShouldStop(16);
 BA.debugLineNum = 3399;BA.debugLine="Dim where As String = \"\"";
Debug.ShouldStop(64);
_where = BA.ObjectToString("");Debug.locals.put("where", _where);Debug.locals.put("where", _where);
 BA.debugLineNum = 3400;BA.debugLine="If (Position > 0) Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean(">",_position,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 3401;BA.debugLine="Dim r As CodeNameList = DistrictsList.Get(Positi";
Debug.ShouldStop(256);
_r = (objects.mostCurrent._districtslist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 3402;BA.debugLine="where = $\"where district_tagcode='${r.TagCode}'\"";
Debug.ShouldStop(512);
_where = (RemoteObject.concat(RemoteObject.createImmutable("where district_tagcode='"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_r.getField(true,"TagCode" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")));Debug.locals.put("where", _where);
 };
 BA.debugLineNum = 3404;BA.debugLine="CumulativeCounty = 0";
Debug.ShouldStop(2048);
objects._cumulativecounty = BA.numberCast(int.class, 0);
 BA.debugLineNum = 3406;BA.debugLine="CountyList.Clear";
Debug.ShouldStop(8192);
objects.mostCurrent._countylist.runVoidMethod ("Clear");
 BA.debugLineNum = 3407;BA.debugLine="CountyList = DBStructures.GetListOfFromScriptCNLE";
Debug.ShouldStop(16384);
objects.mostCurrent._countylist = objects.mostCurrent._dbstructures.runMethod(false,"_getlistoffromscriptcnlevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("tagcode")),(Object)(BA.ObjectToString("title")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("select tagcode, title, country_id, district_tagcode from dta_counties "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_where))),RemoteObject.createImmutable(" order by title")))));
 BA.debugLineNum = 3408;BA.debugLine="CLAPreRequestCountyPickerLabel.Clear";
Debug.ShouldStop(32768);
objects.mostCurrent._claprerequestcountypickerlabel.runVoidMethod ("Clear");
 BA.debugLineNum = 3409;BA.debugLine="CLAPreRequestCountyPickerLabel.Add(\"(Todos)\")";
Debug.ShouldStop(65536);
objects.mostCurrent._claprerequestcountypickerlabel.runVoidMethod ("Add",(Object)(RemoteObject.createImmutable("(Todos)")));
 BA.debugLineNum = 3410;BA.debugLine="For c=0 To CountyList.Size -1";
Debug.ShouldStop(131072);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._countylist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_c = 0 ;
for (;(step11 > 0 && _c <= limit11) || (step11 < 0 && _c >= limit11) ;_c = ((int)(0 + _c + step11))  ) {
Debug.locals.put("c", _c);
 BA.debugLineNum = 3411;BA.debugLine="Dim c2g As CodeNameList = CountyList.Get(c)";
Debug.ShouldStop(262144);
_c2g = (objects.mostCurrent._countylist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _c))));Debug.locals.put("c2g", _c2g);Debug.locals.put("c2g", _c2g);
 BA.debugLineNum = 3412;BA.debugLine="CLAPreRequestCountyPickerLabel.Add(c2g.Name)";
Debug.ShouldStop(524288);
objects.mostCurrent._claprerequestcountypickerlabel.runVoidMethod ("Add",(Object)(_c2g.getField(true,"Name" /*RemoteObject*/ )));
 }
}Debug.locals.put("c", _c);
;
 BA.debugLineNum = 3415;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claprerequesteditsearch_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("CLAPreRequestEditSearch_EnterPressed (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3417);
if (RapidSub.canDelegate("claprerequesteditsearch_enterpressed")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","claprerequesteditsearch_enterpressed");}
 BA.debugLineNum = 3417;BA.debugLine="Sub CLAPreRequestEditSearch_EnterPressed";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 3418;BA.debugLine="MakeListSearchPreRequest(CLAPreRequestEditSearch.";
Debug.ShouldStop(33554432);
_makelistsearchprerequest(objects.mostCurrent._claprerequesteditsearch.runMethod(true,"getText"));
 BA.debugLineNum = 3419;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claprerequestpickerlabel_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAPreRequestPickerLabel_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3426);
if (RapidSub.canDelegate("claprerequestpickerlabel_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","claprerequestpickerlabel_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3426;BA.debugLine="Sub CLAPreRequestPickerLabel_ItemClick (Position A";
Debug.ShouldStop(2);
 BA.debugLineNum = 3428;BA.debugLine="MakePreRequestTaskList(Position, CumulativeDistri";
Debug.ShouldStop(8);
_makeprerequesttasklist(_position,objects._cumulativedistrict,objects._cumulativecounty,objects.mostCurrent._cumulativedatein,objects.mostCurrent._cumulativedateout,objects.mostCurrent._cumulativefilter);
 BA.debugLineNum = 3429;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claprerequestspinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAPreRequestSpinner_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1844);
if (RapidSub.canDelegate("claprerequestspinner_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","claprerequestspinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1844;BA.debugLine="Sub CLAPreRequestSpinner_ItemClick (Position As In";
Debug.ShouldStop(524288);
 BA.debugLineNum = 1845;BA.debugLine="listRequests.Clear";
Debug.ShouldStop(1048576);
objects.mostCurrent._listrequests.runVoidMethod ("_clear");
 BA.debugLineNum = 1846;BA.debugLine="MakePreRequestTaskList(Position-1, 0, 0, \"\", \"\",";
Debug.ShouldStop(2097152);
_makeprerequesttasklist(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.ObjectToString(""),BA.ObjectToString(""),RemoteObject.createImmutable(""));
 BA.debugLineNum = 1847;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _claprerequesttypespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLAPreRequestTypeSpinner_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1840);
if (RapidSub.canDelegate("claprerequesttypespinner_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","claprerequesttypespinner_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1840;BA.debugLine="Sub CLAPreRequestTypeSpinner_ItemClick (Position A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1842;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clarequestlist_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLARequestList_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3355);
if (RapidSub.canDelegate("clarequestlist_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","clarequestlist_itemclick", _index, _value);}
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 3355;BA.debugLine="Sub CLARequestList_ItemClick (Index As Int, Value";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3356;BA.debugLine="ListItemsListClearSelection";
Debug.ShouldStop(134217728);
_listitemslistclearselection();
 BA.debugLineNum = 3357;BA.debugLine="Dim pan As Panel = CLARequestList.GetPanel(Index)";
Debug.ShouldStop(268435456);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pan = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._clarequestlist.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pan", _pan);
 BA.debugLineNum = 3358;BA.debugLine="pan.Color = 0x9637FF4B";
Debug.ShouldStop(536870912);
_pan.runVoidMethod ("setColor",BA.numberCast(int.class, 0x9637ff4b));
 BA.debugLineNum = 3359;BA.debugLine="SelCheckList = pan.Tag";
Debug.ShouldStop(1073741824);
objects.mostCurrent._selchecklist = BA.ObjectToString(_pan.runMethod(false,"getTag"));
 BA.debugLineNum = 3360;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clarequesttypespinner_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLARequestTypeSpinner_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1995);
if (RapidSub.canDelegate("clarequesttypespinner_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","clarequesttypespinner_itemclick", _position, _value);}
RemoteObject _index = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1995;BA.debugLine="Sub CLARequestTypeSpinner_ItemClick (Position As I";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1996;BA.debugLine="CLARequestList.Clear";
Debug.ShouldStop(2048);
objects.mostCurrent._clarequestlist.runVoidMethod ("_clear");
 BA.debugLineNum = 1997;BA.debugLine="Dim index As Int = Position-1";
Debug.ShouldStop(4096);
_index = RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 1998;BA.debugLine="MakeTaskList(index, \"\")";
Debug.ShouldStop(8192);
_maketasklist(_index,RemoteObject.createImmutable(""));
 BA.debugLineNum = 1999;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _req,RemoteObject _nreq) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,637);
if (RapidSub.canDelegate("createlistitem")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createlistitem", _cnt, _colitems, _width, _height, _req, _nreq);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _status_desc = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _typedesc = RemoteObject.createImmutable("");
RemoteObject _address = RemoteObject.createImmutable("");
RemoteObject _address2 = RemoteObject.createImmutable("");
RemoteObject _postal_code = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
RemoteObject _objref = RemoteObject.createImmutable("");
RemoteObject _objectparent = RemoteObject.createImmutable("");
RemoteObject _parentname = RemoteObject.createImmutable("");
RemoteObject _thisaddress = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("req", _req);
Debug.locals.put("nreq", _nreq);
 BA.debugLineNum = 637;BA.debugLine="Sub CreateListItem(cnt As String, colitems As Curs";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 638;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 639;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 640;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 641;BA.debugLine="If(ShareCode.ISPHONE)Then";
Debug.ShouldStop(1);
if ((objects.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 642;BA.debugLine="p.LoadLayout(\"objects_itemview_phone\")";
Debug.ShouldStop(2);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("objects_itemview_phone")),objects.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 644;BA.debugLine="p.LoadLayout(\"Objects_itemview\")";
Debug.ShouldStop(8);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Objects_itemview")),objects.mostCurrent.activityBA);
 };
 BA.debugLineNum = 646;BA.debugLine="p.RemoveView";
Debug.ShouldStop(32);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 648;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
Debug.ShouldStop(128);
_name = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 650;BA.debugLine="Dim status_desc As String = colitems.GetString(\"s";
Debug.ShouldStop(512);
_status_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_desc")));Debug.locals.put("status_desc", _status_desc);Debug.locals.put("status_desc", _status_desc);
 BA.debugLineNum = 654;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
Debug.ShouldStop(8192);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 655;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(16384);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 656;BA.debugLine="Dim typedesc As String = colitems.GetString(\"type";
Debug.ShouldStop(32768);
_typedesc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typedesc")));Debug.locals.put("typedesc", _typedesc);Debug.locals.put("typedesc", _typedesc);
 BA.debugLineNum = 657;BA.debugLine="Dim address As String = colitems.GetString(\"addre";
Debug.ShouldStop(65536);
_address = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address")));Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 658;BA.debugLine="Dim address2 As String = colitems.GetString(\"addr";
Debug.ShouldStop(131072);
_address2 = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address2")));Debug.locals.put("address2", _address2);Debug.locals.put("address2", _address2);
 BA.debugLineNum = 659;BA.debugLine="Dim postal_code As String = colitems.GetString(\"p";
Debug.ShouldStop(262144);
_postal_code = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("postal_code")));Debug.locals.put("postal_code", _postal_code);Debug.locals.put("postal_code", _postal_code);
 BA.debugLineNum = 660;BA.debugLine="Dim city As String = colitems.GetString(\"city\")";
Debug.ShouldStop(524288);
_city = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("city")));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 661;BA.debugLine="Dim latitude As String = colitems.GetString(\"lati";
Debug.ShouldStop(1048576);
_latitude = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")));Debug.locals.put("latitude", _latitude);Debug.locals.put("latitude", _latitude);
 BA.debugLineNum = 662;BA.debugLine="Dim longitude As String = colitems.GetString(\"lon";
Debug.ShouldStop(2097152);
_longitude = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")));Debug.locals.put("longitude", _longitude);Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 663;BA.debugLine="Dim ObjRef As String = colitems.GetString(\"refere";
Debug.ShouldStop(4194304);
_objref = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reference")));Debug.locals.put("ObjRef", _objref);Debug.locals.put("ObjRef", _objref);
 BA.debugLineNum = 664;BA.debugLine="Dim ObjectParent As String = colitems.GetString(\"";
Debug.ShouldStop(8388608);
_objectparent = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("parent")));Debug.locals.put("ObjectParent", _objectparent);Debug.locals.put("ObjectParent", _objectparent);
 BA.debugLineNum = 670;BA.debugLine="If Utils.NNE(ObjRef) Then";
Debug.ShouldStop(536870912);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_objref)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 671;BA.debugLine="ObjRef = $\"(${ObjRef})\"$";
Debug.ShouldStop(1073741824);
_objref = (RemoteObject.concat(RemoteObject.createImmutable("("),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objref))),RemoteObject.createImmutable(")")));Debug.locals.put("ObjRef", _objref);
 }else {
 BA.debugLineNum = 673;BA.debugLine="ObjRef = \"\"";
Debug.ShouldStop(1);
_objref = BA.ObjectToString("");Debug.locals.put("ObjRef", _objref);
 };
 BA.debugLineNum = 676;BA.debugLine="ListItemFullName.text = $\"${name} ${ObjRef}\"$";
Debug.ShouldStop(8);
objects.mostCurrent._listitemfullname.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable(" "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objref))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 677;BA.debugLine="If Utils.NNE(cnt) Then";
Debug.ShouldStop(16);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_cnt)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 678;BA.debugLine="ListItemNumber.Text = $\"${cnt}\"$";
Debug.ShouldStop(32);
objects.mostCurrent._listitemnumber.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 679;BA.debugLine="ListItemNumber.Color =Consts.ColorYellow";
Debug.ShouldStop(64);
objects.mostCurrent._listitemnumber.runVoidMethod ("setColor",objects.mostCurrent._consts._coloryellow /*RemoteObject*/ );
 };
 BA.debugLineNum = 683;BA.debugLine="Dim ParentName As String = DBStructures.GetScript";
Debug.ShouldStop(1024);
_parentname = objects.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select title_import from dta_objects where 1=1\n"),RemoteObject.createImmutable("																	and tagcode = '"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objectparent))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("title_import")));Debug.locals.put("ParentName", _parentname);Debug.locals.put("ParentName", _parentname);
 BA.debugLineNum = 686;BA.debugLine="If Utils.NNE(ParentName) Then";
Debug.ShouldStop(8192);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_parentname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 687;BA.debugLine="ListItemParent.Text = ParentName";
Debug.ShouldStop(16384);
objects.mostCurrent._listitemparent.runMethod(true,"setText",BA.ObjectToCharSequence(_parentname));
 }else {
 BA.debugLineNum = 689;BA.debugLine="ListItemParent.Text = \"\"";
Debug.ShouldStop(65536);
objects.mostCurrent._listitemparent.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 695;BA.debugLine="ListItemStatus.Text = status_desc";
Debug.ShouldStop(4194304);
objects.mostCurrent._listitemstatus.runMethod(true,"setText",BA.ObjectToCharSequence(_status_desc));
 BA.debugLineNum = 696;BA.debugLine="If (address2 <> \"\") Then address2 = $\"${CRLF}${ad";
Debug.ShouldStop(8388608);
if ((RemoteObject.solveBoolean("!",_address2,RemoteObject.createImmutable("")))) { 
_address2 = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_address2))),RemoteObject.createImmutable(",")));Debug.locals.put("address2", _address2);};
 BA.debugLineNum = 697;BA.debugLine="Dim ThisAddress As String = $\"${address},${addres";
Debug.ShouldStop(16777216);
_thisaddress = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_address))),RemoteObject.createImmutable(","),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_address2))),RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_postal_code))),RemoteObject.createImmutable(" "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_city))),RemoteObject.createImmutable("")));Debug.locals.put("ThisAddress", _thisaddress);Debug.locals.put("ThisAddress", _thisaddress);
 BA.debugLineNum = 698;BA.debugLine="ListItemLocation.text = ThisAddress";
Debug.ShouldStop(33554432);
objects.mostCurrent._listitemlocation.runMethod(true,"setText",BA.ObjectToCharSequence(_thisaddress));
 BA.debugLineNum = 700;BA.debugLine="ListItemType.Text = typedesc";
Debug.ShouldStop(134217728);
objects.mostCurrent._listitemtype.runMethod(true,"setText",BA.ObjectToCharSequence(_typedesc));
 BA.debugLineNum = 702;BA.debugLine="ListItemReference.text = tagcode";
Debug.ShouldStop(536870912);
objects.mostCurrent._listitemreference.runMethod(true,"setText",BA.ObjectToCharSequence(_tagcode));
 BA.debugLineNum = 703;BA.debugLine="ListItemReference.tag = tagcode";
Debug.ShouldStop(1073741824);
objects.mostCurrent._listitemreference.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 707;BA.debugLine="If (status_id = 0) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 708;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorGr";
Debug.ShouldStop(8);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorgray /*RemoteObject*/ );
 BA.debugLineNum = 709;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF088)";
Debug.ShouldStop(16);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 }else {
 BA.debugLineNum = 711;BA.debugLine="If (req.IndexOf(tagcode) >= 0) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("g",_req.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 712;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorG";
Debug.ShouldStop(128);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 713;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF017)";
Debug.ShouldStop(256);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf017)))));
 }else {
 BA.debugLineNum = 715;BA.debugLine="If (nreq.IndexOf(tagcode) >= 0) Then";
Debug.ShouldStop(1024);
if ((RemoteObject.solveBoolean("g",_nreq.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 716;BA.debugLine="ListItemTodayRequests.TextColor = Consts.Color";
Debug.ShouldStop(2048);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorblue /*RemoteObject*/ );
 BA.debugLineNum = 717;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF073)";
Debug.ShouldStop(4096);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf073)))));
 }else {
 BA.debugLineNum = 719;BA.debugLine="ListItemTodayRequests.Visible = False";
Debug.ShouldStop(16384);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"False"));
 };
 };
 };
 BA.debugLineNum = 724;BA.debugLine="If Not(Utils.isNullOrEmpty(latitude)) And Not(Uti";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_latitude))))) && RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_longitude)))))) { 
 BA.debugLineNum = 725;BA.debugLine="listButMap.Tag = $\"${latitude}|${longitude}\"$";
Debug.ShouldStop(1048576);
objects.mostCurrent._listbutmap.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable("|"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("")))));
 }else {
 BA.debugLineNum = 727;BA.debugLine="listButMap.TextColor = Consts.ColorLightSilver";
Debug.ShouldStop(4194304);
objects.mostCurrent._listbutmap.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 };
 BA.debugLineNum = 729;BA.debugLine="listButRequest.Tag = tagcode";
Debug.ShouldStop(16777216);
objects.mostCurrent._listbutrequest.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 730;BA.debugLine="listButSelect.Tag = $\"${tagcode}|0\"$";
Debug.ShouldStop(33554432);
objects.mostCurrent._listbutselect.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("|0")))));
 BA.debugLineNum = 731;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(67108864);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 732;BA.debugLine="Return p";
Debug.ShouldStop(134217728);
if (true) return _p;
 BA.debugLineNum = 733;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitemmap(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _req,RemoteObject _nreq) throws Exception{
try {
		Debug.PushSubsStack("CreateListItemMap (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,736);
if (RapidSub.canDelegate("createlistitemmap")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createlistitemmap", _cnt, _colitems, _width, _height, _req, _nreq);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _typedesc = RemoteObject.createImmutable("");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("req", _req);
Debug.locals.put("nreq", _nreq);
 BA.debugLineNum = 736;BA.debugLine="Sub CreateListItemMap(cnt As String, colitems As C";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 737;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 738;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(2);
_p.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 739;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(4);
objects.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 740;BA.debugLine="p.LoadLayout(\"Objects_itemMapView\")";
Debug.ShouldStop(8);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Objects_itemMapView")),objects.mostCurrent.activityBA);
 BA.debugLineNum = 741;BA.debugLine="p.RemoveView";
Debug.ShouldStop(16);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 742;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
Debug.ShouldStop(32);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 743;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(64);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 744;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
Debug.ShouldStop(128);
_name = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 745;BA.debugLine="Dim typedesc As String = colitems.GetString(\"type";
Debug.ShouldStop(256);
_typedesc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("typedesc")));Debug.locals.put("typedesc", _typedesc);Debug.locals.put("typedesc", _typedesc);
 BA.debugLineNum = 746;BA.debugLine="Dim latitude As String = colitems.GetString(\"lati";
Debug.ShouldStop(512);
_latitude = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")));Debug.locals.put("latitude", _latitude);Debug.locals.put("latitude", _latitude);
 BA.debugLineNum = 747;BA.debugLine="Dim longitude As String = colitems.GetString(\"lon";
Debug.ShouldStop(1024);
_longitude = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")));Debug.locals.put("longitude", _longitude);Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 748;BA.debugLine="ListItemFullName.text = $\"${cnt} - ${name}\"$";
Debug.ShouldStop(2048);
objects.mostCurrent._listitemfullname.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 749;BA.debugLine="ListItemFullName.Tag = $\"${latitude}|${longitude}";
Debug.ShouldStop(4096);
objects.mostCurrent._listitemfullname.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable("|"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 750;BA.debugLine="ListItemType.Text = typedesc";
Debug.ShouldStop(8192);
objects.mostCurrent._listitemtype.runMethod(true,"setText",BA.ObjectToCharSequence(_typedesc));
 BA.debugLineNum = 751;BA.debugLine="ListItemTodayRequests.Tag = status_id";
Debug.ShouldStop(16384);
objects.mostCurrent._listitemtodayrequests.runMethod(false,"setTag",(_status_id));
 BA.debugLineNum = 753;BA.debugLine="If (status_id = 0) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 754;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorGr";
Debug.ShouldStop(131072);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorgray /*RemoteObject*/ );
 BA.debugLineNum = 755;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF088)";
Debug.ShouldStop(262144);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 }else {
 BA.debugLineNum = 757;BA.debugLine="If (req.IndexOf(tagcode) >= 0) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean("g",_req.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 758;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorG";
Debug.ShouldStop(2097152);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 BA.debugLineNum = 759;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF017)";
Debug.ShouldStop(4194304);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf017)))));
 }else {
 BA.debugLineNum = 761;BA.debugLine="If (nreq.IndexOf(tagcode) >= 0) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("g",_nreq.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 762;BA.debugLine="ListItemTodayRequests.TextColor = Consts.Color";
Debug.ShouldStop(33554432);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorblue /*RemoteObject*/ );
 BA.debugLineNum = 763;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF073)";
Debug.ShouldStop(67108864);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf073)))));
 }else {
 BA.debugLineNum = 765;BA.debugLine="ListItemTodayRequests.Visible = False";
Debug.ShouldStop(268435456);
objects.mostCurrent._listitemtodayrequests.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"False"));
 };
 };
 };
 BA.debugLineNum = 770;BA.debugLine="If Not(Utils.isNullOrEmpty(latitude)) And Not(Uti";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_latitude))))) && RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_longitude)))))) { 
 BA.debugLineNum = 771;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(4);
if (objects.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 772;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 773;BA.debugLine="mapMarker = gmap.AddMarker(latitude, longitude";
Debug.ShouldStop(16);
objects.mostCurrent._mapmarker = objects.mostCurrent._gmap.runMethod(false,"AddMarker",(Object)(BA.numberCast(double.class, _latitude)),(Object)(BA.numberCast(double.class, _longitude)),(Object)(_name));
 BA.debugLineNum = 774;BA.debugLine="Markers.Add( mapMarker )";
Debug.ShouldStop(32);
objects._markers.runVoidMethod ("Add",(Object)((objects.mostCurrent._mapmarker.getObject())));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e38) {
			BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e38.toString()); BA.debugLineNum = 776;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6151715880",BA.ObjectToString(objects.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 777;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(256);
objects.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(objects.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 };
 };
 };
 BA.debugLineNum = 782;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(8192);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 783;BA.debugLine="Return p";
Debug.ShouldStop(16384);
if (true) return _p;
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createprereqheaders() throws Exception{
try {
		Debug.PushSubsStack("CreatePreReqHeaders (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1249);
if (RapidSub.canDelegate("createprereqheaders")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createprereqheaders");}
ResumableSub_CreatePreReqHeaders rsub = new ResumableSub_CreatePreReqHeaders(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreatePreReqHeaders extends BA.ResumableSub {
public ResumableSub_CreatePreReqHeaders(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _completed = RemoteObject.createImmutable(false);
RemoteObject _r = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._codenamelist");
RemoteObject _requestfilenameprerequests = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _prereq_info = RemoteObject.createImmutable("");
RemoteObject _prereq_filename = RemoteObject.createImmutable("");
RemoteObject _sqlfilestotal = RemoteObject.createImmutable(0);
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ctm = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datahora = RemoteObject.createImmutable("");
RemoteObject _totalfiles = RemoteObject.createImmutable(0);
RemoteObject _inserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colinserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mastertagcode = RemoteObject.createImmutable("");
RemoteObject _childfield = RemoteObject.createImmutable("");
RemoteObject _tagcodelist = RemoteObject.createImmutable("");
RemoteObject _newinfolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _table = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _n = 0;
RemoteObject _script2execute = RemoteObject.createImmutable("");
RemoteObject _sqlevc = RemoteObject.createImmutable("");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _totallineitemscl = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _canadd = RemoteObject.createImmutable(false);
RemoteObject _pp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject group112;
int index112;
int groupLen112;
int step124;
int limit124;
int step155;
int limit155;
int step169;
int limit169;
int step183;
int limit183;
int step198;
int limit198;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreatePreReqHeaders (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1249);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1251;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1253;BA.debugLine="Qry_TypeRequest = \"\"";
Debug.ShouldStop(16);
parent.mostCurrent._qry_typerequest = BA.ObjectToString("");
 BA.debugLineNum = 1254;BA.debugLine="Qry_District = \"\"";
Debug.ShouldStop(32);
parent.mostCurrent._qry_district = BA.ObjectToString("");
 BA.debugLineNum = 1255;BA.debugLine="Qry_County = \"\"";
Debug.ShouldStop(64);
parent.mostCurrent._qry_county = BA.ObjectToString("");
 BA.debugLineNum = 1256;BA.debugLine="Qry_Filter = \"\"";
Debug.ShouldStop(128);
parent.mostCurrent._qry_filter = BA.ObjectToString("");
 BA.debugLineNum = 1257;BA.debugLine="Qry_DateIn = \"\"";
Debug.ShouldStop(256);
parent.mostCurrent._qry_datein = BA.ObjectToString("");
 BA.debugLineNum = 1258;BA.debugLine="Qry_DateOut = \"\"";
Debug.ShouldStop(512);
parent.mostCurrent._qry_dateout = BA.ObjectToString("");
 BA.debugLineNum = 1264;BA.debugLine="listRequests.Clear";
Debug.ShouldStop(32768);
parent.mostCurrent._listrequests.runVoidMethod ("_clear");
 BA.debugLineNum = 1265;BA.debugLine="Dim res As ResumableSub = DeletePreRequestsFromLo";
Debug.ShouldStop(65536);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _deleteprerequestsfromlocaldb();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1266;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"), _res);
this.state = 124;
return;
case 124:
//C
this.state = 1;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 1268;BA.debugLine="If (CLAPreRequestPickerLabel.SelectedIndex > 0) T";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean(">",parent.mostCurrent._claprerequestpickerlabel.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1269;BA.debugLine="Dim r As CodeNameList = ReqList.Get(CLAPreReques";
Debug.ShouldStop(1048576);
_r = (parent.mostCurrent._reqlist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._claprerequestpickerlabel.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1270;BA.debugLine="Qry_TypeRequest = r.TagCode";
Debug.ShouldStop(2097152);
parent.mostCurrent._qry_typerequest = _r.getField(true,"TagCode" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 1274;BA.debugLine="If (CLAPreRequestDistrictePickerLabel.SelectedInd";
Debug.ShouldStop(33554432);

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean(">",parent.mostCurrent._claprerequestdistrictepickerlabel.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1275;BA.debugLine="Dim r As CodeNameList = DistrictsList.Get(CLAPre";
Debug.ShouldStop(67108864);
_r = (parent.mostCurrent._districtslist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._claprerequestdistrictepickerlabel.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1276;BA.debugLine="Qry_District =  r.TagCode";
Debug.ShouldStop(134217728);
parent.mostCurrent._qry_district = _r.getField(true,"TagCode" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 1279;BA.debugLine="If (CLAPreRequestCountyPickerLabel.SelectedIndex";
Debug.ShouldStop(1073741824);

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean(">",parent.mostCurrent._claprerequestcountypickerlabel.runMethod(true,"getSelectedIndex"),BA.numberCast(double.class, 0)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1280;BA.debugLine="Dim r As CodeNameList = CountyList.Get(CLAPreReq";
Debug.ShouldStop(-2147483648);
_r = (parent.mostCurrent._countylist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._claprerequestcountypickerlabel.runMethod(true,"getSelectedIndex"),RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 1281;BA.debugLine="Qry_County = r.TagCode";
Debug.ShouldStop(1);
parent.mostCurrent._qry_county = _r.getField(true,"TagCode" /*RemoteObject*/ );
 if (true) break;
;
 BA.debugLineNum = 1284;BA.debugLine="If Utils.NNE(DialogReqStartDateLabel.Text) Then";
Debug.ShouldStop(8);

case 10:
//if
this.state = 13;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._dialogreqstartdatelabel.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1285;BA.debugLine="Qry_DateIn = DialogReqStartDateLabel.Text";
Debug.ShouldStop(16);
parent.mostCurrent._qry_datein = parent.mostCurrent._dialogreqstartdatelabel.runMethod(true,"getText");
 if (true) break;
;
 BA.debugLineNum = 1288;BA.debugLine="If Utils.NNE(DialogReqEndDateLabel.Text) Then";
Debug.ShouldStop(128);

case 13:
//if
this.state = 16;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._dialogreqenddatelabel.runMethod(true,"getText"))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1289;BA.debugLine="Qry_DateOut = DialogReqEndDateLabel.Text";
Debug.ShouldStop(256);
parent.mostCurrent._qry_dateout = parent.mostCurrent._dialogreqenddatelabel.runMethod(true,"getText");
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1292;BA.debugLine="Qry_Filter = CLAPreRequestEditSearch.Text";
Debug.ShouldStop(2048);
parent.mostCurrent._qry_filter = parent.mostCurrent._claprerequesteditsearch.runMethod(true,"getText");
 BA.debugLineNum = 1294;BA.debugLine="Log(\"Qry_TypeRequest:\" & Qry_TypeRequest)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468397",RemoteObject.concat(RemoteObject.createImmutable("Qry_TypeRequest:"),parent.mostCurrent._qry_typerequest),0);
 BA.debugLineNum = 1295;BA.debugLine="Log(\"Qry_District:\" & Qry_District)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468398",RemoteObject.concat(RemoteObject.createImmutable("Qry_District:"),parent.mostCurrent._qry_district),0);
 BA.debugLineNum = 1296;BA.debugLine="Log(\"Qry_County:\" & Qry_County)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468399",RemoteObject.concat(RemoteObject.createImmutable("Qry_County:"),parent.mostCurrent._qry_county),0);
 BA.debugLineNum = 1297;BA.debugLine="Log(\"Qry_Filter\" & Qry_Filter)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468400",RemoteObject.concat(RemoteObject.createImmutable("Qry_Filter"),parent.mostCurrent._qry_filter),0);
 BA.debugLineNum = 1298;BA.debugLine="Log(\"Qry_DateIn:\" & Qry_DateIn)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468401",RemoteObject.concat(RemoteObject.createImmutable("Qry_DateIn:"),parent.mostCurrent._qry_datein),0);
 BA.debugLineNum = 1299;BA.debugLine="Log(\"Qry_DateOut:\" & Qry_DateOut)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468402",RemoteObject.concat(RemoteObject.createImmutable("Qry_DateOut:"),parent.mostCurrent._qry_dateout),0);
 BA.debugLineNum = 1301;BA.debugLine="Dim RequestFileNamePreRequests As String = Utils.";
Debug.ShouldStop(1048576);
_requestfilenameprerequests = parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("RequestFileNamePreRequests", _requestfilenameprerequests);Debug.locals.put("RequestFileNamePreRequests", _requestfilenameprerequests);
 BA.debugLineNum = 1304;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(8388608);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/prerequests/headers")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1305;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(16777216);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1306;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(33554432);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,objects.processBA,(Object)(BA.ObjectToString("")),(Object)(objects.getObject()));
 BA.debugLineNum = 1307;BA.debugLine="Dim params As Map";
Debug.ShouldStop(67108864);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1308;BA.debugLine="params.Initialize";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1309;BA.debugLine="params.Clear";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1310;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1311;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1312;BA.debugLine="params.Put(\"typeRequest\",Qry_TypeRequest)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typeRequest"))),(Object)((parent.mostCurrent._qry_typerequest)));
 BA.debugLineNum = 1313;BA.debugLine="params.Put(\"district\",Qry_District)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("district"))),(Object)((parent.mostCurrent._qry_district)));
 BA.debugLineNum = 1314;BA.debugLine="params.Put(\"county\",Qry_County)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("county"))),(Object)((parent.mostCurrent._qry_county)));
 BA.debugLineNum = 1315;BA.debugLine="params.Put(\"filter\",Qry_Filter)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filter"))),(Object)((parent.mostCurrent._qry_filter)));
 BA.debugLineNum = 1316;BA.debugLine="params.Put(\"dateIn\",Utils.IfNullOrEmpty(Qry_DateI";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dateIn"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._qry_datein),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA))))));
 BA.debugLineNum = 1317;BA.debugLine="params.Put(\"dateOut\",Utils.IfNullOrEmpty(Qry_Date";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dateOut"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._qry_dateout),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA))))));
 BA.debugLineNum = 1318;BA.debugLine="params.Put(\"user\", ShareCode.SESS_User)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1319;BA.debugLine="params.Put(\"name\", RequestFileNamePreRequests)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_requestfilenameprerequests)));
 BA.debugLineNum = 1320;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 1321;BA.debugLine="params.Put(\"date\", Utils.GetCurrDatetimeExt)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1322;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("smart"))),(Object)((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )));
 BA.debugLineNum = 1323;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1324;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1325;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1326;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1327;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1328;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1329;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1330;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(131072);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1331;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(262144);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1333;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(1048576);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1335;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"CLAButton\",data)";
Debug.ShouldStop(4194304);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(BA.ObjectToString("CLAButton")),(Object)(_data));
 BA.debugLineNum = 1337;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(16777216);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 1338;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(33554432);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1339;BA.debugLine="Job.GetRequest.Timeout = 90000";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 90000));
 BA.debugLineNum = 1341;BA.debugLine="Dim continua As Boolean = True";
Debug.ShouldStop(268435456);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("continua", _continua);Debug.locals.put("continua", _continua);
 BA.debugLineNum = 1343;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"), (_job));
this.state = 125;
return;
case 125:
//C
this.state = 17;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1345;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1);
if (true) break;

case 17:
//if
this.state = 22;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 1346;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468449",_serveraddress,0);
 BA.debugLineNum = 1347;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"CLAButtonRequestF";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(BA.ObjectToString("CLAButtonRequestFilter")),(Object)(RemoteObject.createImmutable("Completed")));
 BA.debugLineNum = 1348;BA.debugLine="Log (Job.GetString)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468451",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1350;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468453",_serveraddress,0);
 BA.debugLineNum = 1351;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"CLAButtonRequestF";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(BA.ObjectToString("CLAButtonRequestFilter")),(Object)(RemoteObject.createImmutable("ERROR")));
 BA.debugLineNum = 1352;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 1353;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1354;BA.debugLine="continua = False";
Debug.ShouldStop(512);
_continua = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("continua", _continua);
 BA.debugLineNum = 1355;BA.debugLine="Log (Job.GetString)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468458",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1357;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1359;BA.debugLine="If continua Then";
Debug.ShouldStop(16384);
if (true) break;

case 23:
//if
this.state = 123;
if (_continua.<Boolean>get().booleanValue()) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1361;BA.debugLine="Dim PREREQ_INFO As String = $\"${RequestFileNameP";
Debug.ShouldStop(65536);
_prereq_info = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_requestfilenameprerequests))),RemoteObject.createImmutable(".INFO")));Debug.locals.put("PREREQ_INFO", _prereq_info);Debug.locals.put("PREREQ_INFO", _prereq_info);
 BA.debugLineNum = 1362;BA.debugLine="Dim prereq_fileName As String = RequestFileNameP";
Debug.ShouldStop(131072);
_prereq_filename = _requestfilenameprerequests;Debug.locals.put("prereq_fileName", _prereq_filename);Debug.locals.put("prereq_fileName", _prereq_filename);
 BA.debugLineNum = 1364;BA.debugLine="Dim SqlFilesTotal As Int = 0";
Debug.ShouldStop(524288);
_sqlfilestotal = BA.numberCast(int.class, 0);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 1365;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(1048576);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 1366;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(2097152);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 1367;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(4194304);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1370;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(33554432);
_globalftp.runVoidMethod ("Initialize",objects.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1371;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(67108864);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1372;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(134217728);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 1373;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(268435456);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 1374;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(536870912);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 1375;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(1073741824);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1376;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(-2147483648);
if (true) break;

case 26:
//do while
this.state = 59;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1378;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(2);
_sf = _globalftp.runMethod(false,"DownloadFile",objects.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_prereq_info)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_prereq_info));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1379;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"), _sf);
this.state = 126;
return;
case 126:
//C
this.state = 29;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1381;BA.debugLine="If Success Then";
Debug.ShouldStop(16);
if (true) break;

case 29:
//if
this.state = 58;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 31;
}else {
this.state = 57;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1382;BA.debugLine="Log(PREREQ_INFO & \" file was download successf";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468485",RemoteObject.concat(_prereq_info,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 1384;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 32:
//try
this.state = 55;
this.catchState = 54;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 54;
 BA.debugLineNum = 1386;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(512);
if (true) break;

case 35:
//if
this.state = 52;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1387;BA.debugLine="Dim JsonStruct As String = File.readstring(S";
Debug.ShouldStop(1024);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_prereq_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 1388;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2048);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1389;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(4096);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 1390;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8192);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1391;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\"";
Debug.ShouldStop(16384);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 1392;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(32768);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 1393;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(65536);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 1398;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(2097152);
if (true) break;

case 38:
//for
this.state = 51;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group112 = _inserts;
index112 = 0;
groupLen112 = group112.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 127;
if (true) break;

case 127:
//C
this.state = 51;
if (index112 < groupLen112) {
this.state = 40;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group112.runMethod(false,"Get",index112));}
if (true) break;

case 128:
//C
this.state = 127;
index112++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 1399;BA.debugLine="Dim mastertagcode As String = colinserts.Ge";
Debug.ShouldStop(4194304);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 1400;BA.debugLine="Try";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 1401;BA.debugLine="Dim childfield As String = colinserts.Get(";
Debug.ShouldStop(16777216);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 54;
 BA.debugLineNum = 1403;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(67108864);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 1404;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468507",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1405;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 54;
;
 BA.debugLineNum = 1407;BA.debugLine="Dim tagcodelist As String = colinserts.Get(";
Debug.ShouldStop(1073741824);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 1408;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
Debug.ShouldStop(-2147483648);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 1409;BA.debugLine="Dim table As String = colinserts.Get(\"table";
Debug.ShouldStop(1);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 1411;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(4);
if (true) break;

case 47:
//for
this.state = 50;
step124 = 1;
limit124 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 129;
if (true) break;

case 129:
//C
this.state = 50;
if ((step124 > 0 && _i <= limit124) || (step124 < 0 && _i >= limit124)) this.state = 49;
if (true) break;

case 130:
//C
this.state = 129;
_i = ((int)(0 + _i + step124)) ;
Debug.locals.put("i", _i);
if (true) break;

case 49:
//C
this.state = 130;
 BA.debugLineNum = 1412;BA.debugLine="Dim res As ResumableSub = DBStructures.Rem";
Debug.ShouldStop(8);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1413;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"), _res);
this.state = 131;
return;
case 131:
//C
this.state = 130;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 128;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
Debug.locals.put("colinserts", _colinserts);
;
 BA.debugLineNum = 1418;BA.debugLine="SqlFilesTotal = Totalfiles";
Debug.ShouldStop(512);
_sqlfilestotal = _totalfiles;Debug.locals.put("SqlFilesTotal", _sqlfilestotal);
 BA.debugLineNum = 1419;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(1024);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 1420;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1421;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(4096);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1422;BA.debugLine="dotry = False";
Debug.ShouldStop(8192);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 1423;BA.debugLine="trycount = 3";
Debug.ShouldStop(16384);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 1424;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32768);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 52:
//C
this.state = 55;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 54:
//C
this.state = 55;
this.catchState = 0;
 BA.debugLineNum = 1428;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468531",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1429;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1430;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(2097152);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 55:
//C
this.state = 58;
this.catchState = 0;
;
 if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 1433;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468536",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1434;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1435;BA.debugLine="Log(\"Error downloading file \" & PREREQ_INFO)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468538",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_prereq_info),0);
 BA.debugLineNum = 1436;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(134217728);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 58:
//C
this.state = 26;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 BA.debugLineNum = 1439;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1073741824);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1441;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(1);
if (true) break;

case 60:
//if
this.state = 95;
if ((RemoteObject.solveBoolean(">",_sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 1443;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(4);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1444;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
Debug.ShouldStop(8);
_globalftp.runVoidMethod ("Initialize",objects.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1445;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(16);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1447;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(64);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1449;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(256);
if (true) break;

case 63:
//for
this.state = 76;
step155 = 1;
limit155 = _sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 132;
if (true) break;

case 132:
//C
this.state = 76;
if ((step155 > 0 && _i <= limit155) || (step155 < 0 && _i >= limit155)) this.state = 65;
if (true) break;

case 133:
//C
this.state = 132;
_i = ((int)(0 + _i + step155)) ;
Debug.locals.put("i", _i);
if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 1450;BA.debugLine="Dim fileN As String = $\"${RequestFileNamePreRe";
Debug.ShouldStop(512);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_requestfilenameprerequests))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 1452;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
Debug.ShouldStop(2048);
if (true) break;

case 66:
//if
this.state = 69;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen))).<Boolean>get().booleanValue()) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 1453;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fi";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 1458;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(131072);
_sf = _globalftp.runMethod(false,"DownloadFile",objects.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filen)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1459;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"), _sf);
this.state = 134;
return;
case 134:
//C
this.state = 70;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1461;BA.debugLine="If Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 70:
//if
this.state = 75;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
 BA.debugLineNum = 1462;BA.debugLine="Log(fileN & \" file was download successfully\"";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468565",RemoteObject.concat(_filen,RemoteObject.createImmutable(" file was download successfully")),0);
 if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 1464;BA.debugLine="Log(\"Error downloading file \" & fileN)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468567",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filen),0);
 if (true) break;

case 75:
//C
this.state = 133;
;
 if (true) break;
if (true) break;

case 76:
//C
this.state = 77;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1469;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(268435456);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1476;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(8);
if (true) break;

case 77:
//for
this.state = 94;
step169 = 1;
limit169 = _sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 135;
if (true) break;

case 135:
//C
this.state = 94;
if ((step169 > 0 && _i <= limit169) || (step169 < 0 && _i >= limit169)) this.state = 79;
if (true) break;

case 136:
//C
this.state = 135;
_i = ((int)(0 + _i + step169)) ;
Debug.locals.put("i", _i);
if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 1477;BA.debugLine="Dim fileN As String = $\"${RequestFileNamePreRe";
Debug.ShouldStop(16);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_requestfilenameprerequests))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 1479;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(64);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1481;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(256);
if (true) break;

case 80:
//if
this.state = 85;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 85;
 BA.debugLineNum = 1482;BA.debugLine="List1.Clear";
Debug.ShouldStop(512);
_list1.runVoidMethod ("Clear");
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 1484;BA.debugLine="List1.Initialize";
Debug.ShouldStop(2048);
_list1.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 1487;BA.debugLine="Try";
Debug.ShouldStop(16384);

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
 BA.debugLineNum = 1488;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(32768);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 Debug.CheckDeviceExceptions();
if (true) break;

case 89:
//C
this.state = 90;
this.catchState = 0;
 BA.debugLineNum = 1491;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468594",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1492;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1495;BA.debugLine="For n = 0 To List1.Size -1";
Debug.ShouldStop(4194304);

case 90:
//for
this.state = 93;
this.catchState = 0;
step183 = 1;
limit183 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 137;
if (true) break;

case 137:
//C
this.state = 93;
if ((step183 > 0 && _n <= limit183) || (step183 < 0 && _n >= limit183)) this.state = 92;
if (true) break;

case 138:
//C
this.state = 137;
_n = ((int)(0 + _n + step183)) ;
Debug.locals.put("n", _n);
if (true) break;

case 92:
//C
this.state = 138;
 BA.debugLineNum = 1496;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
Debug.ShouldStop(8388608);
_script2execute = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("Script2Execute", _script2execute);Debug.locals.put("Script2Execute", _script2execute);
 BA.debugLineNum = 1497;BA.debugLine="Utils.SaveSQLToLog(\"Objects\",Script2Execute,";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(_script2execute),(Object)(RemoteObject.createImmutable("")));
 if (true) break;
if (true) break;

case 93:
//C
this.state = 136;
Debug.locals.put("n", _n);
;
 if (true) break;
if (true) break;

case 94:
//C
this.state = 95;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1503;BA.debugLine="Dim res As ResumableSub = SendServerProcessComp";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _sendserverprocesscomplete(parent.mostCurrent.__c.getField(true,"False"),_requestfilenameprerequests);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1504;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"), _res);
this.state = 139;
return;
case 139:
//C
this.state = 95;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 if (true) break;

case 95:
//C
this.state = 96;
;
 BA.debugLineNum = 1508;BA.debugLine="Sleep(100)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createprereqheaders"),BA.numberCast(int.class, 100));
this.state = 140;
return;
case 140:
//C
this.state = 96;
;
 BA.debugLineNum = 1509;BA.debugLine="Dim SQLEVC As String = $\"${DBStructures.EVC_SQL_";
Debug.ShouldStop(16);
_sqlevc = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._dbstructures._evc_sql_getprerequests_data_new /*RemoteObject*/ ))),RemoteObject.createImmutable(" and a.status_id < 5")));Debug.locals.put("SQLEVC", _sqlevc);Debug.locals.put("SQLEVC", _sqlevc);
 BA.debugLineNum = 1511;BA.debugLine="Log(SQLEVC)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468614",_sqlevc,0);
 BA.debugLineNum = 1513;BA.debugLine="Dim height As Int = 80dip";
Debug.ShouldStop(256);
_height = parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 1514;BA.debugLine="Dim TotalLineItemsCL As Int = 0";
Debug.ShouldStop(512);
_totallineitemscl = BA.numberCast(int.class, 0);Debug.locals.put("TotalLineItemsCL", _totallineitemscl);Debug.locals.put("TotalLineItemsCL", _totallineitemscl);
 BA.debugLineNum = 1515;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.E";
Debug.ShouldStop(1024);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlevc)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1516;BA.debugLine="If (Record.RowCount>=1) Then";
Debug.ShouldStop(2048);
if (true) break;

case 96:
//if
this.state = 116;
if ((RemoteObject.solveBoolean("g",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 98;
}if (true) break;

case 98:
//C
this.state = 99;
 BA.debugLineNum = 1517;BA.debugLine="For n=0 To Record.RowCount-1";
Debug.ShouldStop(4096);
if (true) break;

case 99:
//for
this.state = 115;
step198 = 1;
limit198 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 141;
if (true) break;

case 141:
//C
this.state = 115;
if ((step198 > 0 && _n <= limit198) || (step198 < 0 && _n >= limit198)) this.state = 101;
if (true) break;

case 142:
//C
this.state = 141;
_n = ((int)(0 + _n + step198)) ;
Debug.locals.put("n", _n);
if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 1518;BA.debugLine="Record.Position = n";
Debug.ShouldStop(8192);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 1519;BA.debugLine="If Utils.NNE(Record.GetString(\"tagcode\")) Then";
Debug.ShouldStop(16384);
if (true) break;

case 102:
//if
this.state = 114;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode"))))).<Boolean>get().booleanValue()) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 1521;BA.debugLine="Dim CanAdd As Boolean = True";
Debug.ShouldStop(65536);
_canadd = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("CanAdd", _canadd);Debug.locals.put("CanAdd", _canadd);
 BA.debugLineNum = 1522;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 105:
//try
this.state = 110;
this.catchState = 109;
this.state = 107;
if (true) break;

case 107:
//C
this.state = 110;
this.catchState = 109;
 BA.debugLineNum = 1523;BA.debugLine="Dim pp As Panel =  CreatePreRequestListItem(";
Debug.ShouldStop(262144);
_pp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pp = _createprerequestlistitem(parent._itemscounter,_record,parent.mostCurrent._listrequests.runMethod(false,"_asview").runMethod(true,"getWidth"),_height);Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 Debug.CheckDeviceExceptions();
if (true) break;

case 109:
//C
this.state = 110;
this.catchState = 0;
 BA.debugLineNum = 1525;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468628",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1526;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1527;BA.debugLine="CanAdd = False";
Debug.ShouldStop(4194304);
_canadd = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("CanAdd", _canadd);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1529;BA.debugLine="If (CanAdd) Then";
Debug.ShouldStop(16777216);

case 110:
//if
this.state = 113;
this.catchState = 0;
if ((_canadd).<Boolean>get().booleanValue()) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 1530;BA.debugLine="TotalLineItemsCL = TotalLineItemsCL +1";
Debug.ShouldStop(33554432);
_totallineitemscl = RemoteObject.solve(new RemoteObject[] {_totallineitemscl,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("TotalLineItemsCL", _totallineitemscl);
 BA.debugLineNum = 1531;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(67108864);
parent._itemscounter = RemoteObject.solve(new RemoteObject[] {parent._itemscounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1532;BA.debugLine="listRequests.Add(pp, \"\")";
Debug.ShouldStop(134217728);
parent.mostCurrent._listrequests.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pp.getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 113:
//C
this.state = 114;
;
 if (true) break;

case 114:
//C
this.state = 142;
;
 if (true) break;
if (true) break;

case 115:
//C
this.state = 116;
Debug.locals.put("n", _n);
;
 if (true) break;

case 116:
//C
this.state = 117;
;
 BA.debugLineNum = 1537;BA.debugLine="Record.Close";
Debug.ShouldStop(1);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1538;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1539;BA.debugLine="If TotalLineItemsCL = 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 117:
//if
this.state = 122;
if (RemoteObject.solveBoolean("=",_totallineitemscl,BA.numberCast(double.class, 0))) { 
this.state = 119;
}else {
this.state = 121;
}if (true) break;

case 119:
//C
this.state = 122;
 BA.debugLineNum = 1540;BA.debugLine="MsgboxAsync($\"Não existem dados de acordo com o";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Não existem dados de acordo com os parametros selecionados. "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Por favor altere a sua seleccção e tente de novo."))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Pedidos"))),objects.processBA);
 if (true) break;

case 121:
//C
this.state = 122;
 BA.debugLineNum = 1542;BA.debugLine="Log(\"Total Pedidos : \" & TotalLineItemsCL)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154468645",RemoteObject.concat(RemoteObject.createImmutable("Total Pedidos : "),_totallineitemscl),0);
 BA.debugLineNum = 1543;BA.debugLine="SetAllPreReqSelect(False)";
Debug.ShouldStop(64);
_setallprereqselect(parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 122:
//C
this.state = 123;
;
 if (true) break;

case 123:
//C
this.state = -1;
;
 BA.debugLineNum = 1548;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1550;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static void  _ftp_downloadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _createprerequestlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreatePreRequestListItem (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1745);
if (RapidSub.canDelegate("createprerequestlistitem")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createprerequestlistitem", _cnt, _colitems, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _request_desc = RemoteObject.createImmutable("");
RemoteObject _nameobject = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _reqaddress = RemoteObject.createImmutable("");
RemoteObject _reqpostal_code = RemoteObject.createImmutable("");
RemoteObject _reqcity = RemoteObject.createImmutable("");
RemoteObject _request_date = RemoteObject.createImmutable("");
RemoteObject _request_stime = RemoteObject.createImmutable("");
RemoteObject _inforeq = RemoteObject.createImmutable("");
RemoteObject _infotext = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1745;BA.debugLine="Sub CreatePreRequestListItem(cnt As Int, colitems";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1747;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(262144);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1748;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(524288);
_p.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1750;BA.debugLine="If ShareCode.ISPHONE Then";
Debug.ShouldStop(2097152);
if (objects.mostCurrent._sharecode._isphone /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1751;BA.debugLine="p.Height =  100%y";
Debug.ShouldStop(4194304);
_p.runMethod(true,"setHeight",objects.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),objects.mostCurrent.activityBA));
 BA.debugLineNum = 1752;BA.debugLine="p.Width =  100%x";
Debug.ShouldStop(8388608);
_p.runMethod(true,"setWidth",objects.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),objects.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 1754;BA.debugLine="p.Height = Height";
Debug.ShouldStop(33554432);
_p.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 1755;BA.debugLine="p.Width = Width";
Debug.ShouldStop(67108864);
_p.runMethod(true,"setWidth",_width);
 };
 BA.debugLineNum = 1758;BA.debugLine="p.LoadLayout(\"taskListPreRequest\")";
Debug.ShouldStop(536870912);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("taskListPreRequest")),objects.mostCurrent.activityBA);
 BA.debugLineNum = 1759;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1773;BA.debugLine="Dim request_desc As String = colitems.GetString(\"";
Debug.ShouldStop(4096);
_request_desc = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_desc")));Debug.locals.put("request_desc", _request_desc);Debug.locals.put("request_desc", _request_desc);
 BA.debugLineNum = 1774;BA.debugLine="Dim nameobject As String = colitems.GetString(\"na";
Debug.ShouldStop(8192);
_nameobject = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nameobject")));Debug.locals.put("nameobject", _nameobject);Debug.locals.put("nameobject", _nameobject);
 BA.debugLineNum = 1775;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(16384);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1777;BA.debugLine="Dim reqaddress As String = colitems.GetString(\"re";
Debug.ShouldStop(65536);
_reqaddress = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reqaddress")));Debug.locals.put("reqaddress", _reqaddress);Debug.locals.put("reqaddress", _reqaddress);
 BA.debugLineNum = 1778;BA.debugLine="Dim reqpostal_code As String = colitems.GetString";
Debug.ShouldStop(131072);
_reqpostal_code = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reqpostal_code")));Debug.locals.put("reqpostal_code", _reqpostal_code);Debug.locals.put("reqpostal_code", _reqpostal_code);
 BA.debugLineNum = 1779;BA.debugLine="Dim reqcity As String = colitems.GetString(\"reqci";
Debug.ShouldStop(262144);
_reqcity = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("reqcity")));Debug.locals.put("reqcity", _reqcity);Debug.locals.put("reqcity", _reqcity);
 BA.debugLineNum = 1780;BA.debugLine="Dim request_date As String = colitems.GetString(\"";
Debug.ShouldStop(524288);
_request_date = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_date")));Debug.locals.put("request_date", _request_date);Debug.locals.put("request_date", _request_date);
 BA.debugLineNum = 1781;BA.debugLine="Dim request_stime As String = colitems.GetString(";
Debug.ShouldStop(1048576);
_request_stime = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_stime")));Debug.locals.put("request_stime", _request_stime);Debug.locals.put("request_stime", _request_stime);
 BA.debugLineNum = 1784;BA.debugLine="Dim InfoReq As String = $\"${request_desc}\"$";
Debug.ShouldStop(8388608);
_inforeq = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_desc))),RemoteObject.createImmutable("")));Debug.locals.put("InfoReq", _inforeq);Debug.locals.put("InfoReq", _inforeq);
 BA.debugLineNum = 1785;BA.debugLine="If Utils.NNE(request_date) Then";
Debug.ShouldStop(16777216);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_request_date)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1786;BA.debugLine="If Utils.NNE(InfoReq) Then";
Debug.ShouldStop(33554432);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_inforeq)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1787;BA.debugLine="InfoReq = $\"${InfoReq}  (${request_date})\"$";
Debug.ShouldStop(67108864);
_inforeq = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_inforeq))),RemoteObject.createImmutable("  ("),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_date))),RemoteObject.createImmutable(")")));Debug.locals.put("InfoReq", _inforeq);
 }else {
 BA.debugLineNum = 1789;BA.debugLine="InfoReq = $\"(${request_date})\"$";
Debug.ShouldStop(268435456);
_inforeq = (RemoteObject.concat(RemoteObject.createImmutable("("),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_date))),RemoteObject.createImmutable(")")));Debug.locals.put("InfoReq", _inforeq);
 };
 };
 BA.debugLineNum = 1792;BA.debugLine="If Utils.NNE(request_stime) Then";
Debug.ShouldStop(-2147483648);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_request_stime)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1793;BA.debugLine="If Utils.NNE(InfoReq) Then";
Debug.ShouldStop(1);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_inforeq)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1794;BA.debugLine="InfoReq = $\"${InfoReq}  (${request_stime})\"$";
Debug.ShouldStop(2);
_inforeq = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_inforeq))),RemoteObject.createImmutable("  ("),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_stime))),RemoteObject.createImmutable(")")));Debug.locals.put("InfoReq", _inforeq);
 }else {
 BA.debugLineNum = 1796;BA.debugLine="InfoReq = $\"(${request_stime})\"$";
Debug.ShouldStop(8);
_inforeq = (RemoteObject.concat(RemoteObject.createImmutable("("),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_stime))),RemoteObject.createImmutable(")")));Debug.locals.put("InfoReq", _inforeq);
 };
 };
 BA.debugLineNum = 1801;BA.debugLine="Dim InfoText As String = $\"${nameobject}\"$";
Debug.ShouldStop(256);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nameobject))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);Debug.locals.put("InfoText", _infotext);
 BA.debugLineNum = 1803;BA.debugLine="If Utils.NNE(reqaddress) Then";
Debug.ShouldStop(1024);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_reqaddress)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1804;BA.debugLine="If Utils.NNE(InfoText) Then";
Debug.ShouldStop(2048);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_infotext)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1805;BA.debugLine="InfoText = $\"${InfoText}, ${reqaddress}\"$";
Debug.ShouldStop(4096);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_infotext))),RemoteObject.createImmutable(", "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqaddress))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);
 }else {
 BA.debugLineNum = 1807;BA.debugLine="InfoText = $\"${reqaddress}\"$";
Debug.ShouldStop(16384);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqaddress))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);
 };
 };
 BA.debugLineNum = 1811;BA.debugLine="If Utils.NNE(reqpostal_code) Then";
Debug.ShouldStop(262144);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_reqpostal_code)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1812;BA.debugLine="If Utils.NNE(InfoText) Then";
Debug.ShouldStop(524288);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_infotext)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1813;BA.debugLine="InfoText = $\"${InfoText}, ${reqpostal_code}\"$";
Debug.ShouldStop(1048576);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_infotext))),RemoteObject.createImmutable(", "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqpostal_code))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);
 }else {
 BA.debugLineNum = 1815;BA.debugLine="InfoText = $\"${reqpostal_code}\"$";
Debug.ShouldStop(4194304);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqpostal_code))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);
 };
 };
 BA.debugLineNum = 1819;BA.debugLine="If Utils.NNE(reqcity) Then";
Debug.ShouldStop(67108864);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_reqcity)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1820;BA.debugLine="If Utils.NNE(InfoText) Then";
Debug.ShouldStop(134217728);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_infotext)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1821;BA.debugLine="InfoText = $\"${InfoText}, ${reqcity}\"$";
Debug.ShouldStop(268435456);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_infotext))),RemoteObject.createImmutable(", "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcity))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);
 }else {
 BA.debugLineNum = 1823;BA.debugLine="InfoText = $\"${reqcity}\"$";
Debug.ShouldStop(1073741824);
_infotext = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqcity))),RemoteObject.createImmutable("")));Debug.locals.put("InfoText", _infotext);
 };
 };
 BA.debugLineNum = 1827;BA.debugLine="ListItemRequestDesc.text = $\"${InfoReq}\"$";
Debug.ShouldStop(4);
objects.mostCurrent._listitemrequestdesc.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_inforeq))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1828;BA.debugLine="ListItemRequestDesc.Tag = tagcode";
Debug.ShouldStop(8);
objects.mostCurrent._listitemrequestdesc.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1829;BA.debugLine="ListItemRequestObject.text = $\"${InfoText}\"$";
Debug.ShouldStop(16);
objects.mostCurrent._listitemrequestobject.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_infotext))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1830;BA.debugLine="ListItemRequestObject.Tag = tagcode";
Debug.ShouldStop(32);
objects.mostCurrent._listitemrequestobject.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1831;BA.debugLine="listButPreRequestDownload.Tag = tagcode";
Debug.ShouldStop(64);
objects.mostCurrent._listbutprerequestdownload.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1832;BA.debugLine="listButPreRequestView.Tag = tagcode";
Debug.ShouldStop(128);
objects.mostCurrent._listbutprerequestview.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1833;BA.debugLine="listButPreSelect.Tag = tagcode";
Debug.ShouldStop(256);
objects.mostCurrent._listbutpreselect.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1836;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(2048);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1837;BA.debugLine="Return p";
Debug.ShouldStop(4096);
if (true) return _p;
 BA.debugLineNum = 1838;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequestentityrelation(RemoteObject _newrequest,RemoteObject _newobject) throws Exception{
try {
		Debug.PushSubsStack("createRequestEntityRelation (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2540);
if (RapidSub.canDelegate("createrequestentityrelation")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createrequestentityrelation", _newrequest, _newobject);}
ResumableSub_createRequestEntityRelation rsub = new ResumableSub_createRequestEntityRelation(null,_newrequest,_newobject);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_createRequestEntityRelation extends BA.ResumableSub {
public ResumableSub_createRequestEntityRelation(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _newrequest,RemoteObject _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _newrequest;
RemoteObject _newobject;
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createRequestEntityRelation (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2540);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
Debug.locals.put("newObject", _newobject);
 BA.debugLineNum = 2541;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newrequest))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newobject))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2542;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(8192);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_entities")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2543;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(16384);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_entities (id, request_tagcode, entity_tagcode, ismaster)\n"),RemoteObject.createImmutable("								values ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newobject))),RemoteObject.createImmutable("', 1);")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2545;BA.debugLine="Utils.SaveSQLToLog(\"createRequestEntityRelation\"";
Debug.ShouldStop(65536);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("createRequestEntityRelation")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2547;BA.debugLine="Return True";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2548;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _createrequestfields(RemoteObject _newrequest,RemoteObject _newrequesttype) throws Exception{
try {
		Debug.PushSubsStack("createRequestFields (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2511);
if (RapidSub.canDelegate("createrequestfields")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createrequestfields", _newrequest, _newrequesttype);}
ResumableSub_createRequestFields rsub = new ResumableSub_createRequestFields(null,_newrequest,_newrequesttype);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_createRequestFields extends BA.ResumableSub {
public ResumableSub_createRequestFields(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _newrequest,RemoteObject _newrequesttype) {
this.parent = parent;
this._newrequest = _newrequest;
this._newrequesttype = _newrequesttype;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _newrequest;
RemoteObject _newrequesttype;
RemoteObject _sql1 = RemoteObject.createImmutable("");
RemoteObject _resdata = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _sfield = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createRequestFields (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2511);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
Debug.locals.put("newRequestType", _newrequesttype);
 BA.debugLineNum = 2512;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newReques";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newrequest))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newrequesttype))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2513;BA.debugLine="Dim SQL1 As String = $\"select distinct field_tag";
Debug.ShouldStop(65536);
_sql1 = (RemoteObject.concat(RemoteObject.createImmutable("select distinct field_tagcode from dta_typerequests_fields\n"),RemoteObject.createImmutable("								where typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequesttype))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL1", _sql1);Debug.locals.put("SQL1", _sql1);
 BA.debugLineNum = 2516;BA.debugLine="Dim ResData As ResultSet = Starter.LocalSQLEVC.E";
Debug.ShouldStop(524288);
_resdata = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_resdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql1)));Debug.locals.put("ResData", _resdata);
 BA.debugLineNum = 2517;BA.debugLine="Do While ResData.NextRow";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//do while
this.state = 7;
while (_resdata.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 BA.debugLineNum = 2518;BA.debugLine="Dim sfield As String = ResData.GetString(\"field";
Debug.ShouldStop(2097152);
_sfield = _resdata.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("field_tagcode")));Debug.locals.put("sfield", _sfield);Debug.locals.put("sfield", _sfield);
 BA.debugLineNum = 2519;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
Debug.ShouldStop(4194304);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_fields")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2520;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
Debug.ShouldStop(8388608);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_fields (id, request_tagcode, field_tagcode)\n"),RemoteObject.createImmutable("								values ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sfield))),RemoteObject.createImmutable("');")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2522;BA.debugLine="Utils.SaveSQLToLog(\"createRequestFields\",sSQL,";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("createRequestFields")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 2524;BA.debugLine="ResData.Close";
Debug.ShouldStop(134217728);
_resdata.runVoidMethod ("Close");
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 2527;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2528;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
public static RemoteObject  _createrequestlistitem(RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _theobject) throws Exception{
try {
		Debug.PushSubsStack("CreateRequestListItem (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1947);
if (RapidSub.canDelegate("createrequestlistitem")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createrequestlistitem", _cnt, _colitems, _width, _height, _theobject);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _dayslastupdate = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("theObject", _theobject);
 BA.debugLineNum = 1947;BA.debugLine="Sub CreateRequestListItem(cnt As Int, colitems As";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1949;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1950;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1952;BA.debugLine="p.Height = Height";
Debug.ShouldStop(-2147483648);
_p.runMethod(true,"setHeight",_height);
 BA.debugLineNum = 1953;BA.debugLine="p.Width = Width";
Debug.ShouldStop(1);
_p.runMethod(true,"setWidth",_width);
 BA.debugLineNum = 1954;BA.debugLine="p.LoadLayout(\"taskListRequest\")";
Debug.ShouldStop(2);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("taskListRequest")),objects.mostCurrent.activityBA);
 BA.debugLineNum = 1955;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 1957;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(16);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 1958;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
Debug.ShouldStop(32);
_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 1959;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"active\")";
Debug.ShouldStop(64);
_status_id = _colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("active")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 1960;BA.debugLine="Dim dayslastupdate As String = colitems.GetInt(\"d";
Debug.ShouldStop(128);
_dayslastupdate = BA.NumberToString(_colitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("dayslastupdate"))));Debug.locals.put("dayslastupdate", _dayslastupdate);Debug.locals.put("dayslastupdate", _dayslastupdate);
 BA.debugLineNum = 1962;BA.debugLine="ListItemDesc.text = $\"#${cnt} - ${title}\"$";
Debug.ShouldStop(512);
objects.mostCurrent._listitemdesc.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_title))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1963;BA.debugLine="ListItemDesc.Tag = tagcode";
Debug.ShouldStop(1024);
objects.mostCurrent._listitemdesc.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1965;BA.debugLine="If (status_id = 0) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1966;BA.debugLine="ListItemState.TextColor = Consts.ColorGray";
Debug.ShouldStop(8192);
objects.mostCurrent._listitemstate.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorgray /*RemoteObject*/ );
 BA.debugLineNum = 1967;BA.debugLine="ListItemState.Text = Chr(0xF088)";
Debug.ShouldStop(16384);
objects.mostCurrent._listitemstate.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf088)))));
 }else {
 BA.debugLineNum = 1969;BA.debugLine="ListItemState.Text = Chr(0xF087)";
Debug.ShouldStop(65536);
objects.mostCurrent._listitemstate.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf087)))));
 BA.debugLineNum = 1970;BA.debugLine="If (dayslastupdate >5) Then";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean(">",BA.numberCast(double.class, _dayslastupdate),BA.numberCast(double.class, 5)))) { 
 BA.debugLineNum = 1971;BA.debugLine="ListItemState.TextColor = Consts.ColorYellow";
Debug.ShouldStop(262144);
objects.mostCurrent._listitemstate.runMethod(true,"setTextColor",objects.mostCurrent._consts._coloryellow /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1973;BA.debugLine="ListItemState.TextColor = Consts.ColorGreen";
Debug.ShouldStop(1048576);
objects.mostCurrent._listitemstate.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorgreen /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 1977;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(16777216);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 1978;BA.debugLine="Return p";
Debug.ShouldStop(33554432);
if (true) return _p;
 BA.debugLineNum = 1979;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequestobjectrelation(RemoteObject _newrequest,RemoteObject _newobject) throws Exception{
try {
		Debug.PushSubsStack("createRequestObjectRelation (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2530);
if (RapidSub.canDelegate("createrequestobjectrelation")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createrequestobjectrelation", _newrequest, _newobject);}
ResumableSub_createRequestObjectRelation rsub = new ResumableSub_createRequestObjectRelation(null,_newrequest,_newobject);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_createRequestObjectRelation extends BA.ResumableSub {
public ResumableSub_createRequestObjectRelation(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _newrequest,RemoteObject _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _newrequest;
RemoteObject _newobject;
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("createRequestObjectRelation (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2530);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
Debug.locals.put("newObject", _newobject);
 BA.debugLineNum = 2531;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 4;
if ((RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newrequest))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newobject))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2532;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(8);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_objects")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2533;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(16);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_objects (id, request_tagcode, object_tagcode, ismaster)\n"),RemoteObject.createImmutable("								values ('"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("', '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newobject))),RemoteObject.createImmutable("', 1);")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2535;BA.debugLine="Utils.SaveSQLToLog(\"createRequestObjectRelation\"";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("createRequestObjectRelation")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2537;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2538;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static void  _createrequeststoobjects(RemoteObject _newrequesttype,RemoteObject _strselchecklist,RemoteObject _strselobject,RemoteObject _runcl) throws Exception{
try {
		Debug.PushSubsStack("CreateRequestsToObjects (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2137);
if (RapidSub.canDelegate("createrequeststoobjects")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createrequeststoobjects", _newrequesttype, _strselchecklist, _strselobject, _runcl); return;}
ResumableSub_CreateRequestsToObjects rsub = new ResumableSub_CreateRequestsToObjects(null,_newrequesttype,_strselchecklist,_strselobject,_runcl);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateRequestsToObjects extends BA.ResumableSub {
public ResumableSub_CreateRequestsToObjects(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _newrequesttype,RemoteObject _strselchecklist,RemoteObject _strselobject,RemoteObject _runcl) {
this.parent = parent;
this._newrequesttype = _newrequesttype;
this._strselchecklist = _strselchecklist;
this._strselobject = _strselobject;
this._runcl = _runcl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _newrequesttype;
RemoteObject _strselchecklist;
RemoteObject _strselobject;
RemoteObject _runcl;
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _entity_tagcode = RemoteObject.createImmutable("");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _resfields = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok = RemoteObject.createImmutable(false);
RemoteObject _resa1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok1 = RemoteObject.createImmutable(false);
RemoteObject _resa2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok2 = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateRequestsToObjects (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2137);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("newRequestType", _newrequesttype);
Debug.locals.put("strSelCheckList", _strselchecklist);
Debug.locals.put("strSelObject", _strselobject);
Debug.locals.put("RunCL", _runcl);
 BA.debugLineNum = 2138;BA.debugLine="ProgressDialogShow(ShareCode.objectMsgPrepararInt";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*RemoteObject*/ )));
 BA.debugLineNum = 2139;BA.debugLine="Sleep(100)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects"),BA.numberCast(int.class, 100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 2140;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(134217728);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 2141;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(268435456);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 2143;BA.debugLine="Dim entity_tagcode As String = DBStructures.GetSc";
Debug.ShouldStop(1073741824);
_entity_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select case when (parent_tagcode is null) or (parent_tagcode='') then tagcode else parent_tagcode end as valor\n"),RemoteObject.createImmutable("						from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strselobject.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("entity_tagcode", _entity_tagcode);Debug.locals.put("entity_tagcode", _entity_tagcode);
 BA.debugLineNum = 2145;BA.debugLine="If Utils.NE(entity_tagcode) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_entity_tagcode)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2146;BA.debugLine="entity_tagcode = strSelObject.trim";
Debug.ShouldStop(2);
_entity_tagcode = _strselobject.runMethod(true,"trim");Debug.locals.put("entity_tagcode", _entity_tagcode);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2149;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagco";
Debug.ShouldStop(16);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 2150;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(32);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 2151;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(64);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 2153;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(256);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2154;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2155;BA.debugLine="newExecution.Put(\"id\",0)";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2156;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 2157;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__\"";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 2158;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2159;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2160;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2161;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 2162;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2163;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 2164;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2165;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2166;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2167;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 2168;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 2169;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNAL";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 2170;BA.debugLine="newExecution.Put(\"entity_tagcode\", entity_tagcode";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((_entity_tagcode)));
 BA.debugLineNum = 2171;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2172;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.S";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 2173;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2174;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
Debug.ShouldStop(536870912);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2175;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReques";
Debug.ShouldStop(1073741824);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_newrequesttype)));
 BA.debugLineNum = 2176;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SES";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 2177;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2178;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2179;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(4);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2180;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(8);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2181;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(16);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2182;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(32);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2184;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, \"";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2186;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCountO";
Debug.ShouldStop(512);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strselchecklist))),RemoteObject.createImmutable("'")))));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 2188;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(2048);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2189;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2190;BA.debugLine="newExecution.Put(\"id\",0)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2191;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 2192;BA.debugLine="newExecution.Put(\"relation_tagcode\", strSelCheckL";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_strselchecklist)));
 BA.debugLineNum = 2193;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2194;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2195;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2196;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2197;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2198;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2199;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2200;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2201;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(16777216);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2202;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(33554432);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 2203;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(67108864);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 2204;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounter)";
Debug.ShouldStop(134217728);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 2205;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(268435456);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2206;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(536870912);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2207;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(1073741824);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2208;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(-2147483648);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2209;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(1);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2211;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, \"";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2212;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(8);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2214;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_v";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("					tagcode,position,execute_value,execute_format_title, confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("					select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(", x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("					from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, \n"),RemoteObject.createImmutable("					a.relation_tagcode As task_tagcode, \n"),RemoteObject.createImmutable("					c.item_tagcode, c.unique_key, d.tagcode As tagcode, \n"),RemoteObject.createImmutable("					ifnull(d.position, c.position) As position, '' as execute_value, \n"),RemoteObject.createImmutable("					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"),RemoteObject.createImmutable("					 0 as confirmed, '' as changed_value, a.repeatcounter\n"),RemoteObject.createImmutable("					from dta_requests_relations As a\n"),RemoteObject.createImmutable("					inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("					where a.type_relation=0 And a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strselchecklist))),RemoteObject.createImmutable("' and a.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					) As x\n"),RemoteObject.createImmutable("					order by  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2233;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6155713632",_ssql,0);
 BA.debugLineNum = 2234;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 2236;BA.debugLine="Dim resfields As ResumableSub = createRequestFiel";
Debug.ShouldStop(134217728);
_resfields = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resfields = _createrequestfields(_newrequest,_newrequesttype);Debug.locals.put("resfields", _resfields);Debug.locals.put("resfields", _resfields);
 BA.debugLineNum = 2237;BA.debugLine="Wait For(resfields) Complete (resfieldsOk As Bool";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects"), _resfields);
this.state = 10;
return;
case 10:
//C
this.state = 5;
_resfieldsok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk", _resfieldsok);
;
 BA.debugLineNum = 2239;BA.debugLine="Dim resa1 As ResumableSub = createRequestEntityRe";
Debug.ShouldStop(1073741824);
_resa1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa1 = _createrequestentityrelation(_newrequest,_strselobject);Debug.locals.put("resa1", _resa1);Debug.locals.put("resa1", _resa1);
 BA.debugLineNum = 2240;BA.debugLine="Wait For(resa1) Complete (resfieldsOk1 As Boolean";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects"), _resa1);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_resfieldsok1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk1", _resfieldsok1);
;
 BA.debugLineNum = 2242;BA.debugLine="Dim resa2 As ResumableSub = createRequestObjectRe";
Debug.ShouldStop(2);
_resa2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa2 = _createrequestobjectrelation(_newrequest,_strselobject);Debug.locals.put("resa2", _resa2);Debug.locals.put("resa2", _resa2);
 BA.debugLineNum = 2243;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boolean";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects"), _resa2);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_resfieldsok2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk2", _resfieldsok2);
;
 BA.debugLineNum = 2245;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIte";
Debug.ShouldStop(16);
_uploadnewrequest2server(_newrequest,_newrequestitem,RemoteObject.createImmutable("0"));
 BA.debugLineNum = 2246;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects"),BA.numberCast(int.class, 1000));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
 BA.debugLineNum = 2248;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2250;BA.debugLine="If (RunCL) Then";
Debug.ShouldStop(512);
if (true) break;

case 5:
//if
this.state = 8;
if ((_runcl).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2251;BA.debugLine="butCreateRequestCancel_Click";
Debug.ShouldStop(1024);
_butcreaterequestcancel_click();
 BA.debugLineNum = 2252;BA.debugLine="RunThisChecklist(newRequest)";
Debug.ShouldStop(2048);
_runthischecklist(_newrequest);
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 2255;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static void  _createrequeststoobjects2(RemoteObject _newrequesttype,RemoteObject _strselchecklistlist,RemoteObject _strselobject,RemoteObject _runcl) throws Exception{
try {
		Debug.PushSubsStack("CreateRequestsToObjects2 (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2260);
if (RapidSub.canDelegate("createrequeststoobjects2")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createrequeststoobjects2", _newrequesttype, _strselchecklistlist, _strselobject, _runcl); return;}
ResumableSub_CreateRequestsToObjects2 rsub = new ResumableSub_CreateRequestsToObjects2(null,_newrequesttype,_strselchecklistlist,_strselobject,_runcl);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateRequestsToObjects2 extends BA.ResumableSub {
public ResumableSub_CreateRequestsToObjects2(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _newrequesttype,RemoteObject _strselchecklistlist,RemoteObject _strselobject,RemoteObject _runcl) {
this.parent = parent;
this._newrequesttype = _newrequesttype;
this._strselchecklistlist = _strselchecklistlist;
this._strselobject = _strselobject;
this._runcl = _runcl;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _newrequesttype;
RemoteObject _strselchecklistlist;
RemoteObject _strselobject;
RemoteObject _runcl;
RemoteObject _newrequestitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _newrequest = RemoteObject.createImmutable("");
RemoteObject _newdate = RemoteObject.createImmutable("");
RemoteObject _newtime = RemoteObject.createImmutable("");
RemoteObject _maxid = RemoteObject.createImmutable(0);
RemoteObject _newexecution = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _nn = 0;
RemoteObject _strselchecklist = RemoteObject.createImmutable("");
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _resfields = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok = RemoteObject.createImmutable(false);
RemoteObject _resa1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok1 = RemoteObject.createImmutable(false);
RemoteObject _resa2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok2 = RemoteObject.createImmutable(false);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _newrequestcode = RemoteObject.createImmutable("");
int step64;
int limit64;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateRequestsToObjects2 (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2260);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("newRequestType", _newrequesttype);
Debug.locals.put("strSelCheckListList", _strselchecklistlist);
Debug.locals.put("strSelObject", _strselobject);
Debug.locals.put("RunCL", _runcl);
 BA.debugLineNum = 2261;BA.debugLine="ProgressDialogShow(ShareCode.objectMsgPrepararInt";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*RemoteObject*/ )));
 BA.debugLineNum = 2262;BA.debugLine="Dim newRequestItem As Map";
Debug.ShouldStop(2097152);
_newrequestitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newRequestItem", _newrequestitem);
 BA.debugLineNum = 2263;BA.debugLine="newRequestItem.Initialize";
Debug.ShouldStop(4194304);
_newrequestitem.runVoidMethod ("Initialize");
 BA.debugLineNum = 2265;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagco";
Debug.ShouldStop(16777216);
_newrequest = parent.mostCurrent._utils.runMethod(true,"_makerequesttagcode" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("newRequest", _newrequest);Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 2266;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(33554432);
_newdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("newDate", _newdate);Debug.locals.put("newDate", _newdate);
 BA.debugLineNum = 2267;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(67108864);
_newtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("newTime", _newtime);Debug.locals.put("newTime", _newtime);
 BA.debugLineNum = 2269;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(268435456);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2271;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(1073741824);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2272;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(-2147483648);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2273;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 2274;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 2275;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__\"";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("route_tagcode"))),(Object)((RemoteObject.createImmutable("ROUTE__NONE__"))));
 BA.debugLineNum = 2276;BA.debugLine="newExecution.Put(\"is_child\", 0)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("is_child"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2277;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("prerequest"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2278;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2279;BA.debugLine="newExecution.Put(\"state_id\", 4)";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("state_id"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 2280;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2281;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("req_time"))),(Object)((_newtime)));
 BA.debugLineNum = 2282;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execdate_type"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2283;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dayweekmonth"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2284;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2285;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 2286;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 2287;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNAL";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin_tagcode"))),(Object)((RemoteObject.createImmutable("TORI_INTERNAL"))));
 BA.debugLineNum = 2288;BA.debugLine="newExecution.Put(\"entity_tagcode\", strSelObject)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2289;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2290;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.S";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("technical_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 2291;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("team_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2292;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("local_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2293;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReques";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("typerequest_tagcode"))),(Object)((_newrequesttype)));
 BA.debugLineNum = 2294;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SES";
Debug.ShouldStop(2097152);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vehicle_tagcode"))),(Object)((parent.mostCurrent._sharecode._sess_vehicle_object /*RemoteObject*/ )));
 BA.debugLineNum = 2295;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
Debug.ShouldStop(4194304);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("confirmed"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2296;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(8388608);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2297;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(16777216);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2298;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(33554432);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2299;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(67108864);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2300;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
Debug.ShouldStop(134217728);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2302;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, \"";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2304;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(-2147483648);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_objects")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2305;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(1);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2306;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2307;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 2308;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 2309;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2310;BA.debugLine="newExecution.Put(\"ismaster\", 0)";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ismaster"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2311;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2312;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(128);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2313;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(256);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2314;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(512);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2315;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"dta_requ";
Debug.ShouldStop(1024);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("dta_requests_objects")),(Object)(_listofmaps));
 BA.debugLineNum = 2317;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
Debug.ShouldStop(4096);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_entities")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2318;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(8192);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2319;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2320;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 2321;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 2322;BA.debugLine="newExecution.Put(\"entity_tagcode\", strSelObject)";
Debug.ShouldStop(131072);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2323;BA.debugLine="newExecution.Put(\"entity_type\", \"\")";
Debug.ShouldStop(262144);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("entity_type"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2324;BA.debugLine="newExecution.Put(\"ismaster\", 0)";
Debug.ShouldStop(524288);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ismaster"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2325;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(1048576);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2326;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(2097152);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2327;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(4194304);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2328;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(8388608);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2329;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"dta_requ";
Debug.ShouldStop(16777216);
parent.mostCurrent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.ObjectToString("dta_requests_entities")),(Object)(_listofmaps));
 BA.debugLineNum = 2331;BA.debugLine="For nn=0 To strSelCheckListList.size-1";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//for
this.state = 4;
step64 = 1;
limit64 = RemoteObject.solve(new RemoteObject[] {_strselchecklistlist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nn = 0 ;
Debug.locals.put("nn", _nn);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 4;
if ((step64 > 0 && _nn <= limit64) || (step64 < 0 && _nn >= limit64)) this.state = 3;
if (true) break;

case 18:
//C
this.state = 17;
_nn = ((int)(0 + _nn + step64)) ;
Debug.locals.put("nn", _nn);
if (true) break;

case 3:
//C
this.state = 18;
 BA.debugLineNum = 2332;BA.debugLine="Dim strSelCheckList As String = strSelCheckListL";
Debug.ShouldStop(134217728);
_strselchecklist = BA.ObjectToString(_strselchecklistlist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _nn))));Debug.locals.put("strSelCheckList", _strselchecklist);Debug.locals.put("strSelCheckList", _strselchecklist);
 BA.debugLineNum = 2333;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCount";
Debug.ShouldStop(268435456);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getcountofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(" and request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strselchecklist))),RemoteObject.createImmutable("'")))));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 2334;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(536870912);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2336;BA.debugLine="Dim newExecution As Map";
Debug.ShouldStop(-2147483648);
_newexecution = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("newExecution", _newexecution);
 BA.debugLineNum = 2337;BA.debugLine="newExecution.Initialize";
Debug.ShouldStop(1);
_newexecution.runVoidMethod ("Initialize");
 BA.debugLineNum = 2338;BA.debugLine="newExecution.Put(\"id\", maxID)";
Debug.ShouldStop(2);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_maxid)));
 BA.debugLineNum = 2339;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
Debug.ShouldStop(4);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("request_tagcode"))),(Object)((_newrequest)));
 BA.debugLineNum = 2340;BA.debugLine="newExecution.Put(\"relation_tagcode\", strSelCheck";
Debug.ShouldStop(8);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation_tagcode"))),(Object)((_strselchecklist)));
 BA.debugLineNum = 2341;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
Debug.ShouldStop(16);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inner_title"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2342;BA.debugLine="newExecution.Put(\"position\", 0)";
Debug.ShouldStop(32);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("position"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2343;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
Debug.ShouldStop(64);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type_relation"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2344;BA.debugLine="newExecution.Put(\"status_id\", 1)";
Debug.ShouldStop(128);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("status_id"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2345;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
Debug.ShouldStop(256);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("excel_import"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2346;BA.debugLine="newExecution.Put(\"imported\", 0)";
Debug.ShouldStop(512);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("imported"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 2347;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
Debug.ShouldStop(1024);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("import_tagcode"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2348;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
Debug.ShouldStop(2048);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("object_tagcode"))),(Object)((_strselobject)));
 BA.debugLineNum = 2349;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
Debug.ShouldStop(4096);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_date"))),(Object)((_newdate)));
 BA.debugLineNum = 2350;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
Debug.ShouldStop(8192);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_start"))),(Object)((_newtime)));
 BA.debugLineNum = 2351;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
Debug.ShouldStop(16384);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("execute_end"))),(Object)((_newtime)));
 BA.debugLineNum = 2352;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounter)";
Debug.ShouldStop(32768);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("repeatcounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 2353;BA.debugLine="newExecution.Put(\"active\", 1)";
Debug.ShouldStop(65536);
_newexecution.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("active"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2354;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(131072);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2355;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(262144);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2356;BA.debugLine="ListOfMaps.Add(newExecution)";
Debug.ShouldStop(524288);
_listofmaps.runVoidMethod ("Add",(Object)((_newexecution.getObject())));
 BA.debugLineNum = 2357;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
Debug.ShouldStop(1048576);
_newrequestitem.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relation"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2359;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
Debug.ShouldStop(4194304);
parent.mostCurrent._utils.runVoidMethod ("_insertmapswithlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(_listofmaps),(Object)(_newrequest),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2361;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
Debug.ShouldStop(16777216);
_maxid = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_values")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("maxID", _maxid);Debug.locals.put("maxID", _maxid);
 BA.debugLineNum = 2362;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"),RemoteObject.createImmutable("					tagcode,position,execute_value,confirmed,changed_value, repeatcounter)\n"),RemoteObject.createImmutable("					select "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_maxid))),RemoteObject.createImmutable(" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"),RemoteObject.createImmutable("					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"),RemoteObject.createImmutable("					x.execute_value, x.confirmed, x.changed_value, x.repeatcounter\n"),RemoteObject.createImmutable("					from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, \n"),RemoteObject.createImmutable("					a.relation_tagcode As task_tagcode, \n"),RemoteObject.createImmutable("					c.item_tagcode, c.unique_key, d.tagcode As tagcode, \n"),RemoteObject.createImmutable("					ifnull(d.position, c.position) As position, '' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter\n"),RemoteObject.createImmutable("					from dta_requests_relations As a\n"),RemoteObject.createImmutable("					inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)\n"),RemoteObject.createImmutable("					left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)\n"),RemoteObject.createImmutable("					where a.type_relation=0 And a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("' and a.relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_strselchecklist))),RemoteObject.createImmutable("' and a.repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("					) As x\n"),RemoteObject.createImmutable("					order by  x.position, x.request_tagcode, x.task_tagcode, x.id")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2378;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6155779190",_ssql,0);
 BA.debugLineNum = 2380;BA.debugLine="Utils.SaveSQLToLog(\"CriaDtaRequestValues\",sSQL,";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("CriaDtaRequestValues")),(Object)(_ssql),(Object)(_newrequest));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("nn", _nn);
;
 BA.debugLineNum = 2384;BA.debugLine="Dim resfields As ResumableSub = createRequestFiel";
Debug.ShouldStop(32768);
_resfields = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resfields = _createrequestfields(_newrequest,_newrequesttype);Debug.locals.put("resfields", _resfields);Debug.locals.put("resfields", _resfields);
 BA.debugLineNum = 2385;BA.debugLine="Wait For(resfields) Complete (resfieldsOk As Bool";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects2"), _resfields);
this.state = 19;
return;
case 19:
//C
this.state = 5;
_resfieldsok = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk", _resfieldsok);
;
 BA.debugLineNum = 2387;BA.debugLine="Dim resa1 As ResumableSub = createRequestEntityRe";
Debug.ShouldStop(262144);
_resa1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa1 = _createrequestentityrelation(_newrequest,_strselobject);Debug.locals.put("resa1", _resa1);Debug.locals.put("resa1", _resa1);
 BA.debugLineNum = 2388;BA.debugLine="Wait For(resa1) Complete (resfieldsOk1 As Boolean";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects2"), _resa1);
this.state = 20;
return;
case 20:
//C
this.state = 5;
_resfieldsok1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk1", _resfieldsok1);
;
 BA.debugLineNum = 2390;BA.debugLine="Dim resa2 As ResumableSub = createRequestObjectRe";
Debug.ShouldStop(2097152);
_resa2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa2 = _createrequestobjectrelation(_newrequest,_strselobject);Debug.locals.put("resa2", _resa2);Debug.locals.put("resa2", _resa2);
 BA.debugLineNum = 2391;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boolean";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects2"), _resa2);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_resfieldsok2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk2", _resfieldsok2);
;
 BA.debugLineNum = 2402;BA.debugLine="Dim res As ResumableSub = UploadNewRequest2Server";
Debug.ShouldStop(2);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _uploadnewrequest2server2(_newrequest,_newrequestitem,BA.ObjectToString("0"),_newrequesttype);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2403;BA.debugLine="Wait For(res) Complete (NewRequestCode As String)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects2"), _res);
this.state = 22;
return;
case 22:
//C
this.state = 5;
_newrequestcode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("NewRequestCode", _newrequestcode);
;
 BA.debugLineNum = 2404;BA.debugLine="If(Utils.NNE(NewRequestCode)) Then";
Debug.ShouldStop(8);
if (true) break;

case 5:
//if
this.state = 12;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_newrequestcode))).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2405;BA.debugLine="If Not(newRequest = NewRequestCode) Then";
Debug.ShouldStop(16);
if (true) break;

case 8:
//if
this.state = 11;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_newrequest,_newrequestcode)))).<Boolean>get().booleanValue()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2406;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2407;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2408;BA.debugLine="Dim sSQL As String = $\"update dta_requests_adds";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2409;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2411;BA.debugLine="Dim sSQL As String = $\"update dta_requests_enti";
Debug.ShouldStop(1024);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_entities set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2412;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2414;BA.debugLine="Dim sSQL As String = $\"update dta_requests_obje";
Debug.ShouldStop(8192);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_objects set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2415;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2417;BA.debugLine="Dim sSQL As String = $\"update dta_requests_cont";
Debug.ShouldStop(65536);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_contacts set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2418;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2420;BA.debugLine="Dim sSQL As String = $\"update dta_requests_fiel";
Debug.ShouldStop(524288);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_fields set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2421;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2423;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
Debug.ShouldStop(4194304);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2424;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2425;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
Debug.ShouldStop(16777216);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2426;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2428;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2429;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2430;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values_adds set request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequestcode))),RemoteObject.createImmutable("' where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("';")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2431;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("getTaskDetailsDialogChange")),(Object)(_ssql),(Object)(_newrequestcode));
 BA.debugLineNum = 2432;BA.debugLine="newRequest = NewRequestCode";
Debug.ShouldStop(-2147483648);
_newrequest = _newrequestcode;Debug.locals.put("newRequest", _newrequest);
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2436;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "createrequeststoobjects2"),BA.numberCast(int.class, 1000));
this.state = 23;
return;
case 23:
//C
this.state = 13;
;
 BA.debugLineNum = 2437;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2439;BA.debugLine="If (RunCL) Then";
Debug.ShouldStop(64);
if (true) break;

case 13:
//if
this.state = 16;
if ((_runcl).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2440;BA.debugLine="RunThisChecklist(newRequest)";
Debug.ShouldStop(128);
_runthischecklist(_newrequest);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 2443;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static RemoteObject  _createshowrequestinfofield(RemoteObject _colitems,RemoteObject _parentdialog) throws Exception{
try {
		Debug.PushSubsStack("CreateShowRequestInfoField (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3883);
if (RapidSub.canDelegate("createshowrequestinfofield")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","createshowrequestinfofield", _colitems, _parentdialog);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("colitems", _colitems);
Debug.locals.put("parentDialog", _parentdialog);
 BA.debugLineNum = 3883;BA.debugLine="Sub CreateShowRequestInfoField(colitems As Cursor,";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3884;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3885;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(4096);
_p.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3886;BA.debugLine="Activity.AddView(p, 0, 0, parentDialog.Width, 45d";
Debug.ShouldStop(8192);
objects.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_parentdialog.runMethod(true,"getWidth")),(Object)(objects.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)))));
 BA.debugLineNum = 3887;BA.debugLine="If(ShareCode.ISPHONE)Then";
Debug.ShouldStop(16384);
if ((objects.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3888;BA.debugLine="p.LoadLayout(\"Request_Information_Fields_View\")";
Debug.ShouldStop(32768);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Request_Information_Fields_View")),objects.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 3890;BA.debugLine="p.LoadLayout(\"Request_Information_Fields_View\")";
Debug.ShouldStop(131072);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Request_Information_Fields_View")),objects.mostCurrent.activityBA);
 };
 BA.debugLineNum = 3892;BA.debugLine="p.RemoveView";
Debug.ShouldStop(524288);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3894;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
Debug.ShouldStop(2097152);
_tagcode = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 3895;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
Debug.ShouldStop(4194304);
_title = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("title")));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 3896;BA.debugLine="Dim value As String = colitems.GetString(\"value\")";
Debug.ShouldStop(8388608);
_value = _colitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 3897;BA.debugLine="LabelPreRequestFieldName.text = title";
Debug.ShouldStop(16777216);
objects.mostCurrent._labelprerequestfieldname.runMethod(true,"setText",BA.ObjectToCharSequence(_title));
 BA.debugLineNum = 3898;BA.debugLine="LabelPreRequestFieldValue.Text = value";
Debug.ShouldStop(33554432);
objects.mostCurrent._labelprerequestfieldvalue.runMethod(true,"setText",BA.ObjectToCharSequence(_value));
 BA.debugLineNum = 3900;BA.debugLine="p.Tag = tagcode";
Debug.ShouldStop(134217728);
_p.runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 3901;BA.debugLine="Return p";
Debug.ShouldStop(268435456);
if (true) return _p;
 BA.debugLineNum = 3902;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleteprerequestsfromlocaldb() throws Exception{
try {
		Debug.PushSubsStack("DeletePreRequestsFromLocalDB (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1552);
if (RapidSub.canDelegate("deleteprerequestsfromlocaldb")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","deleteprerequestsfromlocaldb");}
ResumableSub_DeletePreRequestsFromLocalDB rsub = new ResumableSub_DeletePreRequestsFromLocalDB(null);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DeletePreRequestsFromLocalDB extends BA.ResumableSub {
public ResumableSub_DeletePreRequestsFromLocalDB(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _continuar = RemoteObject.createImmutable(false);
RemoteObject _sqlremove = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _continuarloc = RemoteObject.createImmutable(false);
RemoteObject _sqllocremove = RemoteObject.createImmutable("");
RemoteObject _recordloc = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _tgcode = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _completed = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeletePreRequestsFromLocalDB (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1552);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 1553;BA.debugLine="Dim Continuar As Boolean = True";
Debug.ShouldStop(65536);
_continuar = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continuar", _continuar);Debug.locals.put("Continuar", _continuar);
 BA.debugLineNum = 1554;BA.debugLine="Dim SqlRemove As String = \"SELECT * FROM dta_requ";
Debug.ShouldStop(131072);
_sqlremove = BA.ObjectToString("SELECT * FROM dta_requests AS a where a.state_id>=1 and a.state_id < 4");Debug.locals.put("SqlRemove", _sqlremove);Debug.locals.put("SqlRemove", _sqlremove);
 BA.debugLineNum = 1555;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 BA.debugLineNum = 1556;BA.debugLine="Dim Record As ResultSet = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(524288);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlremove)));Debug.locals.put("Record", _record);
 Debug.CheckDeviceExceptions();
if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 BA.debugLineNum = 1559;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154533895",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1560;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1561;BA.debugLine="Continuar = False";
Debug.ShouldStop(16777216);
_continuar = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Continuar", _continuar);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1564;BA.debugLine="If (Continuar) Then";
Debug.ShouldStop(134217728);

case 6:
//if
this.state = 26;
this.catchState = 0;
if ((_continuar).<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1566;BA.debugLine="Dim ContinuarLoc As Boolean = True";
Debug.ShouldStop(536870912);
_continuarloc = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ContinuarLoc", _continuarloc);Debug.locals.put("ContinuarLoc", _continuarloc);
 BA.debugLineNum = 1567;BA.debugLine="Dim SqlLocRemove As String = \"SELECT * FROM dta_";
Debug.ShouldStop(1073741824);
_sqllocremove = BA.ObjectToString("SELECT * FROM dta_locations AS a where a.tagcode in (SELECT local_tagcode FROM dta_requests AS a where a.state_id>=1 and a.state_id < 4)");Debug.locals.put("SqlLocRemove", _sqllocremove);Debug.locals.put("SqlLocRemove", _sqllocremove);
 BA.debugLineNum = 1568;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
if (true) break;

case 9:
//try
this.state = 14;
this.catchState = 13;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 14;
this.catchState = 13;
 BA.debugLineNum = 1569;BA.debugLine="Dim RecordLOC As ResultSet = Starter.LocalSQLEV";
Debug.ShouldStop(1);
_recordloc = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordloc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqllocremove)));Debug.locals.put("RecordLOC", _recordloc);
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 1571;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154533907",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1572;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1573;BA.debugLine="ContinuarLoc = False";
Debug.ShouldStop(16);
_continuarloc = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ContinuarLoc", _continuarloc);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1575;BA.debugLine="If (ContinuarLoc) Then";
Debug.ShouldStop(64);

case 14:
//if
this.state = 21;
this.catchState = 0;
if ((_continuarloc).<Boolean>get().booleanValue()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1576;BA.debugLine="Dim TgCode As String = \"\"";
Debug.ShouldStop(128);
_tgcode = BA.ObjectToString("");Debug.locals.put("TgCode", _tgcode);Debug.locals.put("TgCode", _tgcode);
 BA.debugLineNum = 1577;BA.debugLine="Do While RecordLOC.NextRow";
Debug.ShouldStop(256);
if (true) break;

case 17:
//do while
this.state = 20;
while (_recordloc.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 17;
 BA.debugLineNum = 1578;BA.debugLine="Dim TgCode As String = Utils.FieldResultSet2SQ";
Debug.ShouldStop(512);
_tgcode = parent.mostCurrent._utils.runMethod(true,"_fieldresultset2sqlarray" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_recordloc),(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("TgCode", _tgcode);Debug.locals.put("TgCode", _tgcode);
 BA.debugLineNum = 1579;BA.debugLine="Exit";
Debug.ShouldStop(1024);
this.state = 20;
if (true) break;
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 1581;BA.debugLine="RecordLOC.Close";
Debug.ShouldStop(4096);
_recordloc.runVoidMethod ("Close");
 BA.debugLineNum = 1583;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRe";
Debug.ShouldStop(16384);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtablebulk" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_locations")),(Object)(BA.ObjectToString("tagcode")),(Object)(_tgcode));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1584;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 27;
return;
case 27:
//C
this.state = 21;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 1587;BA.debugLine="Dim TgCode As String = \"\"";
Debug.ShouldStop(262144);
_tgcode = BA.ObjectToString("");Debug.locals.put("TgCode", _tgcode);Debug.locals.put("TgCode", _tgcode);
 BA.debugLineNum = 1588;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(524288);
if (true) break;

case 22:
//do while
this.state = 25;
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 24;
if (true) break;
}
if (true) break;

case 24:
//C
this.state = 22;
 BA.debugLineNum = 1589;BA.debugLine="Dim TgCode As String = Utils.FieldResultSet2SQL";
Debug.ShouldStop(1048576);
_tgcode = parent.mostCurrent._utils.runMethod(true,"_fieldresultset2sqlarray" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record),(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("TgCode", _tgcode);Debug.locals.put("TgCode", _tgcode);
 BA.debugLineNum = 1590;BA.debugLine="Exit";
Debug.ShouldStop(2097152);
this.state = 25;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 1592;BA.debugLine="Record.Close";
Debug.ShouldStop(8388608);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1594;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
Debug.ShouldStop(33554432);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtablebulk" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests")),(Object)(BA.ObjectToString("tagcode")),(Object)(_tgcode));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1595;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 28;
return;
case 28:
//C
this.state = 26;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 1597;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
Debug.ShouldStop(268435456);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtablebulk" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_adds")),(Object)(BA.ObjectToString("request_tagcode")),(Object)(_tgcode));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1598;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 29;
return;
case 29:
//C
this.state = 26;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 1600;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
Debug.ShouldStop(-2147483648);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtablebulk" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_fields")),(Object)(BA.ObjectToString("request_tagcode")),(Object)(_tgcode));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1601;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 30;
return;
case 30:
//C
this.state = 26;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 1603;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
Debug.ShouldStop(4);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtablebulk" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_requests_relations")),(Object)(BA.ObjectToString("request_tagcode")),(Object)(_tgcode));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1604;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 31;
return;
case 31:
//C
this.state = 26;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 1607;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1609;BA.debugLine="End Sub";
Debug.ShouldStop(256);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static RemoteObject  _dialogreqenddatelabel_click() throws Exception{
try {
		Debug.PushSubsStack("DialogReqEndDateLabel_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3904);
if (RapidSub.canDelegate("dialogreqenddatelabel_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","dialogreqenddatelabel_click");}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3904;BA.debugLine="Sub DialogReqEndDateLabel_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 3905;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(1);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3906;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(2);
objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",objects.mostCurrent._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3907;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(4);
_dnow = objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3908;BA.debugLine="If (DialogReqEndDateLabel.Text  <> \"\") Then";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("!",objects.mostCurrent._dialogreqenddatelabel.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3909;BA.debugLine="dnow = DateTime.DateParse(DialogReqEndDateLabel.";
Debug.ShouldStop(16);
_dnow = objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(objects.mostCurrent._dialogreqenddatelabel.runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3911;BA.debugLine="dd.Initialize(\"CalendarGetEndDate\", DateTime.GetY";
Debug.ShouldStop(64);
_dd.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("CalendarGetEndDate")),(Object)(objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3912;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
Debug.ShouldStop(128);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6157614088",BA.NumberToString(_dd.runMethod(true,"getAccentColor")),0);
 BA.debugLineNum = 3913;BA.debugLine="dd.show(\"DialogReqEndDateLabel\")";
Debug.ShouldStop(256);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("DialogReqEndDateLabel")));
 BA.debugLineNum = 3914;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogreqstartdatelabel_click() throws Exception{
try {
		Debug.PushSubsStack("DialogReqStartDateLabel_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3916);
if (RapidSub.canDelegate("dialogreqstartdatelabel_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","dialogreqstartdatelabel_click");}
RemoteObject _dd = RemoteObject.declareNull("de.donmanfred.DatePickerDialogWrapper");
RemoteObject _dnow = RemoteObject.createImmutable(0L);
 BA.debugLineNum = 3916;BA.debugLine="Sub DialogReqStartDateLabel_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 3917;BA.debugLine="Dim dd As DatePickerDialog";
Debug.ShouldStop(4096);
_dd = RemoteObject.createNew ("de.donmanfred.DatePickerDialogWrapper");Debug.locals.put("dd", _dd);
 BA.debugLineNum = 3918;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
Debug.ShouldStop(8192);
objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",objects.mostCurrent._consts._datetimeformat /*RemoteObject*/ );
 BA.debugLineNum = 3919;BA.debugLine="Dim dnow As Long = DateTime.Now";
Debug.ShouldStop(16384);
_dnow = objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("dnow", _dnow);Debug.locals.put("dnow", _dnow);
 BA.debugLineNum = 3920;BA.debugLine="If (DialogReqStartDateLabel.Text  <> \"\") Then";
Debug.ShouldStop(32768);
if ((RemoteObject.solveBoolean("!",objects.mostCurrent._dialogreqstartdatelabel.runMethod(true,"getText"),RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 3921;BA.debugLine="dnow = DateTime.DateParse(DialogReqStartDateLabe";
Debug.ShouldStop(65536);
_dnow = objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(objects.mostCurrent._dialogreqstartdatelabel.runMethod(true,"getText")));Debug.locals.put("dnow", _dnow);
 };
 BA.debugLineNum = 3923;BA.debugLine="dd.Initialize(\"CalendarGetStartDate\", DateTime.Ge";
Debug.ShouldStop(262144);
_dd.runVoidMethod ("Initialize",objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("CalendarGetStartDate")),(Object)(objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_dnow))),(Object)(RemoteObject.solve(new RemoteObject[] {objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_dnow)),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_dnow))));
 BA.debugLineNum = 3924;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
Debug.ShouldStop(524288);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6157679624",BA.NumberToString(_dd.runMethod(true,"getAccentColor")),0);
 BA.debugLineNum = 3925;BA.debugLine="dd.show(\"DialogReqStartDateLabel\")";
Debug.ShouldStop(1048576);
_dd.runVoidMethod ("show",(Object)(RemoteObject.createImmutable("DialogReqStartDateLabel")));
 BA.debugLineNum = 3926;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editreturn(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("EditReturn (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,499);
if (RapidSub.canDelegate("editreturn")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","editreturn", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 499;BA.debugLine="Sub EditReturn(arg As String)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 500;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(524288);
_windowstatusupdate();
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _editsearch_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("EditSearch_EnterPressed (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1102);
if (RapidSub.canDelegate("editsearch_enterpressed")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","editsearch_enterpressed");}
 BA.debugLineNum = 1102;BA.debugLine="Sub EditSearch_EnterPressed";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1103;BA.debugLine="MakeListSearch(EditSearch.Text)";
Debug.ShouldStop(16384);
_makelistsearch(objects.mostCurrent._editsearch.runMethod(true,"getText"));
 BA.debugLineNum = 1104;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filladditionalfields(RemoteObject _cla,RemoteObject _req_tagcode,RemoteObject _task_tagcode) throws Exception{
try {
		Debug.PushSubsStack("FillAdditionalFields (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2892);
if (RapidSub.canDelegate("filladditionalfields")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","filladditionalfields", _cla, _req_tagcode, _task_tagcode);}
ResumableSub_FillAdditionalFields rsub = new ResumableSub_FillAdditionalFields(null,_cla,_req_tagcode,_task_tagcode);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FillAdditionalFields extends BA.ResumableSub {
public ResumableSub_FillAdditionalFields(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _cla,RemoteObject _req_tagcode,RemoteObject _task_tagcode) {
this.parent = parent;
this._cla = _cla;
this._req_tagcode = _req_tagcode;
this._task_tagcode = _task_tagcode;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _cla;
RemoteObject _req_tagcode;
RemoteObject _task_tagcode;
RemoteObject _obj_tagcode = RemoteObject.createImmutable("");
RemoteObject _field_client_pse = RemoteObject.createImmutable("");
RemoteObject _authusr = RemoteObject.createImmutable("");
RemoteObject _field_edpc_contract_manager = RemoteObject.createImmutable("");
RemoteObject _field_technical_name = RemoteObject.createImmutable("");
RemoteObject _field_technical = RemoteObject.createImmutable("");
RemoteObject _data_sysorexec = RemoteObject.createImmutable(false);
RemoteObject _field_reportdate = RemoteObject.createImmutable("");
RemoteObject _field_reporttime = RemoteObject.createImmutable("");
RemoteObject _updrv = RemoteObject.createImmutable("");
RemoteObject _uk = RemoteObject.createImmutable("");
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _rupdsvr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _endupdate = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FillAdditionalFields (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2892);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("CLA", _cla);
Debug.locals.put("req_tagcode", _req_tagcode);
Debug.locals.put("task_tagcode", _task_tagcode);
 BA.debugLineNum = 2893;BA.debugLine="Dim obj_tagcode As String = DBStructures.GetScrip";
Debug.ShouldStop(4096);
_obj_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select object_tagcode from dta_requests where 1=1\n"),RemoteObject.createImmutable("																	and tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("object_tagcode")));Debug.locals.put("obj_tagcode", _obj_tagcode);Debug.locals.put("obj_tagcode", _obj_tagcode);
 BA.debugLineNum = 2896;BA.debugLine="If Utils.NNE(obj_tagcode) Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 16;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_obj_tagcode)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2897;BA.debugLine="Dim FIELD_CLIENT_PSE As String = DBStructures.Ge";
Debug.ShouldStop(65536);
_field_client_pse = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select title_import from dta_objects where tagcode\n"),RemoteObject.createImmutable("										in (select parent_tagcode from dta_objects where tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obj_tagcode))),RemoteObject.createImmutable("')")))),(Object)(RemoteObject.createImmutable("title_import")));Debug.locals.put("FIELD_CLIENT_PSE", _field_client_pse);Debug.locals.put("FIELD_CLIENT_PSE", _field_client_pse);
 BA.debugLineNum = 2900;BA.debugLine="Dim AUTHUSR As String = DBStructures.GetScriptCo";
Debug.ShouldStop(524288);
_authusr = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select value from dta_objects_fields where\n"),RemoteObject.createImmutable("																	object_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_obj_tagcode))),RemoteObject.createImmutable("' and field_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'")))),(Object)(RemoteObject.createImmutable("value")));Debug.locals.put("AUTHUSR", _authusr);Debug.locals.put("AUTHUSR", _authusr);
 BA.debugLineNum = 2903;BA.debugLine="If Utils.NNE(AUTHUSR) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_authusr)).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 2904;BA.debugLine="Dim FIELD_EDPC_CONTRACT_MANAGER As String = DBS";
Debug.ShouldStop(8388608);
_field_edpc_contract_manager = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select name from aut_users where tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_authusr))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("FIELD_EDPC_CONTRACT_MANAGER", _field_edpc_contract_manager);Debug.locals.put("FIELD_EDPC_CONTRACT_MANAGER", _field_edpc_contract_manager);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 2906;BA.debugLine="Dim FIELD_EDPC_CONTRACT_MANAGER As String = \"\"";
Debug.ShouldStop(33554432);
_field_edpc_contract_manager = BA.ObjectToString("");Debug.locals.put("FIELD_EDPC_CONTRACT_MANAGER", _field_edpc_contract_manager);Debug.locals.put("FIELD_EDPC_CONTRACT_MANAGER", _field_edpc_contract_manager);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 2909;BA.debugLine="Dim FIELD_TECHNICAL_NAME As String = ShareCode.S";
Debug.ShouldStop(268435456);
_field_technical_name = parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ;Debug.locals.put("FIELD_TECHNICAL_NAME", _field_technical_name);Debug.locals.put("FIELD_TECHNICAL_NAME", _field_technical_name);
 BA.debugLineNum = 2910;BA.debugLine="Dim FIELD_TECHNICAL As String = ShareCode.SESS_O";
Debug.ShouldStop(536870912);
_field_technical = parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ;Debug.locals.put("FIELD_TECHNICAL", _field_technical);Debug.locals.put("FIELD_TECHNICAL", _field_technical);
 BA.debugLineNum = 2913;BA.debugLine="ShareCode.DEVICE_FIELDREPORTDATETIME_SYSOREXEC =";
Debug.ShouldStop(1);
parent.mostCurrent._sharecode._device_fieldreportdatetime_sysorexec /*RemoteObject*/  = BA.numberCast(int.class, parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.NumberToString(parent.mostCurrent._dbstructures.runMethod(true,"_getparamstate" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("DEVICE_FIELDREPORTDATETIME_SYSOREXEC"))))),(Object)(BA.NumberToString(0))));
 BA.debugLineNum = 2914;BA.debugLine="Dim DATA_SYSOREXEC As Boolean = Utils.Int2Bool(S";
Debug.ShouldStop(2);
_data_sysorexec = parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_fieldreportdatetime_sysorexec /*RemoteObject*/ ));Debug.locals.put("DATA_SYSOREXEC", _data_sysorexec);Debug.locals.put("DATA_SYSOREXEC", _data_sysorexec);
 BA.debugLineNum = 2916;BA.debugLine="If DATA_SYSOREXEC Then";
Debug.ShouldStop(8);
if (true) break;

case 10:
//if
this.state = 15;
if (_data_sysorexec.<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 2917;BA.debugLine="Dim FIELD_REPORTDATE As String = DBStructures.G";
Debug.ShouldStop(16);
_field_reportdate = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_date from dta_requests where tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("')")))),(Object)(RemoteObject.createImmutable("execute_date")));Debug.locals.put("FIELD_REPORTDATE", _field_reportdate);Debug.locals.put("FIELD_REPORTDATE", _field_reportdate);
 BA.debugLineNum = 2918;BA.debugLine="Dim FIELD_REPORTTIME As String = DBStructures.G";
Debug.ShouldStop(32);
_field_reporttime = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select execute_start from dta_requests where tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("')")))),(Object)(RemoteObject.createImmutable("execute_start")));Debug.locals.put("FIELD_REPORTTIME", _field_reporttime);Debug.locals.put("FIELD_REPORTTIME", _field_reporttime);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2920;BA.debugLine="Dim FIELD_REPORTDATE As String = Utils.GetCurre";
Debug.ShouldStop(128);
_field_reportdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("FIELD_REPORTDATE", _field_reportdate);Debug.locals.put("FIELD_REPORTDATE", _field_reportdate);
 BA.debugLineNum = 2921;BA.debugLine="Dim FIELD_REPORTTIME As String = Utils.GetCurre";
Debug.ShouldStop(256);
_field_reporttime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("FIELD_REPORTTIME", _field_reporttime);Debug.locals.put("FIELD_REPORTTIME", _field_reporttime);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 2925;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
Debug.ShouldStop(4096);
_updrv = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_value = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_client_pse))),RemoteObject.createImmutable("' where 1=1\n"),RemoteObject.createImmutable("								And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And item_tagcode = 'FIELD_CLIENT_PSE'")));Debug.locals.put("UpdRV", _updrv);Debug.locals.put("UpdRV", _updrv);
 BA.debugLineNum = 2929;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_updrv));
 BA.debugLineNum = 2930;BA.debugLine="Sleep(100)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"),BA.numberCast(int.class, 100));
this.state = 17;
return;
case 17:
//C
this.state = 16;
;
 BA.debugLineNum = 2932;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
Debug.ShouldStop(524288);
_uk = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select unique_key from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															And	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And item_tagcode = 'FIELD_CLIENT_PSE'")))),(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("UK", _uk);Debug.locals.put("UK", _uk);
 BA.debugLineNum = 2937;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
Debug.ShouldStop(16777216);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select repeatcounter from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															and	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode = 'FIELD_CLIENT_PSE'")))),(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatCounter", _repeatcounter);Debug.locals.put("repeatCounter", _repeatcounter);
 BA.debugLineNum = 2942;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
Debug.ShouldStop(536870912);
_rupdsvr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rupdsvr = _actualizasvr_clai_update(_cla,BA.ObjectToString("FIELD_CLIENT_PSE"),_uk,_field_client_pse,BA.ObjectToString(""),_repeatcounter);Debug.locals.put("RUpdSvr", _rupdsvr);Debug.locals.put("RUpdSvr", _rupdsvr);
 BA.debugLineNum = 2943;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 18;
return;
case 18:
//C
this.state = 16;
_endupdate = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("EndUpdate", _endupdate);
;
 BA.debugLineNum = 2945;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
Debug.ShouldStop(1);
_updrv = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_value = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_edpc_contract_manager))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("								execute_value_title = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_edpc_contract_manager))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("								object_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_authusr))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								where 1=1\n"),RemoteObject.createImmutable("								And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'")));Debug.locals.put("UpdRV", _updrv);Debug.locals.put("UpdRV", _updrv);
 BA.debugLineNum = 2952;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
Debug.ShouldStop(128);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_updrv));
 BA.debugLineNum = 2953;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"),BA.numberCast(int.class, 100));
this.state = 19;
return;
case 19:
//C
this.state = 16;
;
 BA.debugLineNum = 2955;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
Debug.ShouldStop(1024);
_uk = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select unique_key from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															And	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'")))),(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("UK", _uk);Debug.locals.put("UK", _uk);
 BA.debugLineNum = 2960;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
Debug.ShouldStop(32768);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select repeatcounter from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															and	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'")))),(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatCounter", _repeatcounter);Debug.locals.put("repeatCounter", _repeatcounter);
 BA.debugLineNum = 2965;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
Debug.ShouldStop(1048576);
_rupdsvr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rupdsvr = _actualizasvr_clai_update(_cla,BA.ObjectToString("FIELD_EDPC_CONTRACT_MANAGER"),_uk,_field_edpc_contract_manager,_authusr,_repeatcounter);Debug.locals.put("RUpdSvr", _rupdsvr);Debug.locals.put("RUpdSvr", _rupdsvr);
 BA.debugLineNum = 2966;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 20;
return;
case 20:
//C
this.state = 16;
_endupdate = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("EndUpdate", _endupdate);
;
 BA.debugLineNum = 2969;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
Debug.ShouldStop(16777216);
_updrv = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_value = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_reportdate))),RemoteObject.createImmutable("' where 1=1\n"),RemoteObject.createImmutable("								And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And item_tagcode = 'FIELD_REPORTDATE'")));Debug.locals.put("UpdRV", _updrv);Debug.locals.put("UpdRV", _updrv);
 BA.debugLineNum = 2973;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_updrv));
 BA.debugLineNum = 2974;BA.debugLine="Sleep(100)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"),BA.numberCast(int.class, 100));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 2976;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
Debug.ShouldStop(-2147483648);
_uk = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select unique_key from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															And	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And item_tagcode = 'FIELD_REPORTDATE'")))),(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("UK", _uk);Debug.locals.put("UK", _uk);
 BA.debugLineNum = 2981;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
Debug.ShouldStop(16);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select repeatcounter from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															and	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode = 'FIELD_REPORTDATE'")))),(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatCounter", _repeatcounter);Debug.locals.put("repeatCounter", _repeatcounter);
 BA.debugLineNum = 2986;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
Debug.ShouldStop(512);
_rupdsvr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rupdsvr = _actualizasvr_clai_update(_cla,BA.ObjectToString("FIELD_REPORTDATE"),_uk,_field_reportdate,BA.ObjectToString(""),_repeatcounter);Debug.locals.put("RUpdSvr", _rupdsvr);Debug.locals.put("RUpdSvr", _rupdsvr);
 BA.debugLineNum = 2987;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 22;
return;
case 22:
//C
this.state = 16;
_endupdate = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("EndUpdate", _endupdate);
;
 BA.debugLineNum = 2989;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
Debug.ShouldStop(4096);
_updrv = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_value = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_reporttime))),RemoteObject.createImmutable("' where 1=1\n"),RemoteObject.createImmutable("								And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And item_tagcode = 'FIELD_REPORTTIME'")));Debug.locals.put("UpdRV", _updrv);Debug.locals.put("UpdRV", _updrv);
 BA.debugLineNum = 2993;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_updrv));
 BA.debugLineNum = 2994;BA.debugLine="Sleep(100)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"),BA.numberCast(int.class, 100));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 BA.debugLineNum = 2996;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
Debug.ShouldStop(524288);
_uk = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select unique_key from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															And	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And item_tagcode = 'FIELD_REPORTTIME'")))),(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("UK", _uk);Debug.locals.put("UK", _uk);
 BA.debugLineNum = 3001;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
Debug.ShouldStop(16777216);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select repeatcounter from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															and	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode = 'FIELD_REPORTTIME'")))),(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatCounter", _repeatcounter);Debug.locals.put("repeatCounter", _repeatcounter);
 BA.debugLineNum = 3006;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
Debug.ShouldStop(536870912);
_rupdsvr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rupdsvr = _actualizasvr_clai_update(_cla,BA.ObjectToString("FIELD_REPORTTIME"),_uk,_field_reporttime,BA.ObjectToString(""),_repeatcounter);Debug.locals.put("RUpdSvr", _rupdsvr);Debug.locals.put("RUpdSvr", _rupdsvr);
 BA.debugLineNum = 3007;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 24;
return;
case 24:
//C
this.state = 16;
_endupdate = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("EndUpdate", _endupdate);
;
 BA.debugLineNum = 3009;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
Debug.ShouldStop(1);
_updrv = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_value = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_field_technical_name))),RemoteObject.createImmutable("' where 1=1\n"),RemoteObject.createImmutable("								And request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								And item_tagcode = 'FIELD_TECHNICAL'")));Debug.locals.put("UpdRV", _updrv);Debug.locals.put("UpdRV", _updrv);
 BA.debugLineNum = 3013;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
Debug.ShouldStop(16);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_updrv));
 BA.debugLineNum = 3014;BA.debugLine="Sleep(100)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"),BA.numberCast(int.class, 100));
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
 BA.debugLineNum = 3016;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
Debug.ShouldStop(128);
_uk = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select unique_key from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															And	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															And item_tagcode = 'FIELD_TECHNICAL'")))),(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("UK", _uk);Debug.locals.put("UK", _uk);
 BA.debugLineNum = 3021;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
Debug.ShouldStop(4096);
_repeatcounter = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select repeatcounter from dta_requests_values where 1=1\n"),RemoteObject.createImmutable("															and	request_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode = 'FIELD_TECHNICAL'")))),(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatCounter", _repeatcounter);Debug.locals.put("repeatCounter", _repeatcounter);
 BA.debugLineNum = 3026;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
Debug.ShouldStop(131072);
_rupdsvr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rupdsvr = _actualizasvr_clai_update(_cla,BA.ObjectToString("FIELD_TECHNICAL"),_uk,_field_technical_name,_field_technical,_repeatcounter);Debug.locals.put("RUpdSvr", _rupdsvr);Debug.locals.put("RUpdSvr", _rupdsvr);
 BA.debugLineNum = 3027;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 26;
return;
case 26:
//C
this.state = 16;
_endupdate = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("EndUpdate", _endupdate);
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3031;BA.debugLine="Log(\"FillAdditionalFields\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156237963",RemoteObject.createImmutable("FillAdditionalFields"),0);
 BA.debugLineNum = 3032;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3034;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _fitmap_click() throws Exception{
try {
		Debug.PushSubsStack("FitMap_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,503);
if (RapidSub.canDelegate("fitmap_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","fitmap_click");}
 BA.debugLineNum = 503;BA.debugLine="Sub FitMap_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 504;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getobjectmapinfo(RemoteObject _tagcode) throws Exception{
try {
		Debug.PushSubsStack("GetObjectMapInfo (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,843);
if (RapidSub.canDelegate("getobjectmapinfo")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","getobjectmapinfo", _tagcode);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectinformation");
Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 843;BA.debugLine="Sub GetObjectMapInfo(tagcode As String) As ObjectI";
Debug.ShouldStop(1024);
 BA.debugLineNum = 845;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(4096);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 846;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(8192);
objects._itemscounter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 847;BA.debugLine="Dim SQL As String = $\"${DBStructures.EVC_SQL_CURR";
Debug.ShouldStop(16384);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._dbstructures._evc_sql_current_objects /*RemoteObject*/ ))),RemoteObject.createImmutable(" where a.tagcode='"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 848;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(32768);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), objects.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 849;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 850;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(131072);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 851;BA.debugLine="Dim ret As ObjectInformation = Types.MakeObjectI";
Debug.ShouldStop(262144);
_ret = objects.mostCurrent._types.runMethod(false,"_makeobjectinformation" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_record.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("address2")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("postal_code")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("city")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("contact_phone")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("contact_name")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")))),(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")))),(Object)(objects.mostCurrent.__c.getField(true,"False")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 }else {
 BA.debugLineNum = 864;BA.debugLine="Dim ret As ObjectInformation = Types.MakeObjectI";
Debug.ShouldStop(-2147483648);
_ret = objects.mostCurrent._types.runMethod(false,"_makeobjectinformation" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_tagcode),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(objects.mostCurrent.__c.getField(true,"False")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 866;BA.debugLine="Record.Close";
Debug.ShouldStop(2);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 867;BA.debugLine="Return ret";
Debug.ShouldStop(4);
if (true) return _ret;
 BA.debugLineNum = 868;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getprereqassign() throws Exception{
try {
		Debug.PushSubsStack("GetPreReqAssign (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1611);
if (RapidSub.canDelegate("getprereqassign")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","getprereqassign"); return;}
ResumableSub_GetPreReqAssign rsub = new ResumableSub_GetPreReqAssign(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetPreReqAssign extends BA.ResumableSub {
public ResumableSub_GetPreReqAssign(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _requestfilenameprerequests = RemoteObject.createImmutable("");
RemoteObject _listofrequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _selectedoption = RemoteObject.createImmutable("");
RemoteObject _msg2show = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetPreReqAssign (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1611);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1613;BA.debugLine="Dim RequestFileNamePreRequests As String = Utils.";
Debug.ShouldStop(4096);
_requestfilenameprerequests = parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("RequestFileNamePreRequests", _requestfilenameprerequests);Debug.locals.put("RequestFileNamePreRequests", _requestfilenameprerequests);
 BA.debugLineNum = 1614;BA.debugLine="Dim ListOfRequests As List ' Lista de tagcodes se";
Debug.ShouldStop(8192);
_listofrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfRequests", _listofrequests);
 BA.debugLineNum = 1615;BA.debugLine="ListOfRequests.Initialize";
Debug.ShouldStop(16384);
_listofrequests.runVoidMethod ("Initialize");
 BA.debugLineNum = 1616;BA.debugLine="Dim SelectedOption As String = \"1\" ' 0 = Do dia,";
Debug.ShouldStop(32768);
_selectedoption = BA.ObjectToString("1");Debug.locals.put("SelectedOption", _selectedoption);Debug.locals.put("SelectedOption", _selectedoption);
 BA.debugLineNum = 1617;BA.debugLine="Dim Msg2Show As String = $\"A opção “DO DIA” vai a";
Debug.ShouldStop(65536);
_msg2show = (RemoteObject.concat(RemoteObject.createImmutable("A opção “DO DIA” vai atribuir a Si apenas os Pedidos/Necessidades com o agendamento do dia de hoje, \n"),RemoteObject.createImmutable("	sendo que TODOS serão os que estão selecionados.Poderá efetuar a sincronização para os descarregar.\n"),RemoteObject.createImmutable("	Identifique a opção pretendida.")));Debug.locals.put("Msg2Show", _msg2show);Debug.locals.put("Msg2Show", _msg2show);
 BA.debugLineNum = 1621;BA.debugLine="Msgbox2Async(Msg2Show, \"Selecção de Pedidos\", \"TO";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence(_msg2show)),(Object)(BA.ObjectToCharSequence("Selecção de Pedidos")),(Object)(BA.ObjectToString("TODOS")),(Object)(BA.ObjectToString("CANCELAR")),(Object)(BA.ObjectToString("DO DIA")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),objects.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1622;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "getprereqassign"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1623;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 3;
}else 
{ BA.debugLineNum = 1625;BA.debugLine="else if Result = DialogResponse.NEGATIVE Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 8;
 BA.debugLineNum = 1624;BA.debugLine="SelectedOption = \"1\"";
Debug.ShouldStop(8388608);
_selectedoption = BA.ObjectToString("1");Debug.locals.put("SelectedOption", _selectedoption);
 if (true) break;

case 5:
//C
this.state = 8;
 BA.debugLineNum = 1626;BA.debugLine="SelectedOption = \"0\"";
Debug.ShouldStop(33554432);
_selectedoption = BA.ObjectToString("0");Debug.locals.put("SelectedOption", _selectedoption);
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1628;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1631;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1634;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(2);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla/prerequest/assign")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1635;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1636;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(8);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,objects.processBA,(Object)(BA.ObjectToString("")),(Object)(objects.getObject()));
 BA.debugLineNum = 1637;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1638;BA.debugLine="params.Initialize";
Debug.ShouldStop(32);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1639;BA.debugLine="params.Clear";
Debug.ShouldStop(64);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1640;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1641;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1642;BA.debugLine="params.Put(\"user\", ShareCode.SESS_User)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1643;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 1644;BA.debugLine="params.Put(\"name\", RequestFileNamePreRequests)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_requestfilenameprerequests)));
 BA.debugLineNum = 1645;BA.debugLine="params.Put(\"option\", SelectedOption)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("option"))),(Object)((_selectedoption)));
 BA.debugLineNum = 1646;BA.debugLine="params.Put(\"date\", Utils.GetCurrDatetimeExt)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1647;BA.debugLine="params.Put(\"requests\",Utils.List2Str(LstPreReqs2D";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("requests"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_list2str" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._lstprereqs2download),(Object)(RemoteObject.createImmutable("|"))))));
 BA.debugLineNum = 1648;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1649;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1650;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1651;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1652;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1653;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1654;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1655;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(4194304);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1656;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(8388608);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1658;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(33554432);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1662;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"GetPreReqAssign\",d";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(BA.ObjectToString("GetPreReqAssign")),(Object)(_data));
 BA.debugLineNum = 1664;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 1665;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(1);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1666;BA.debugLine="Job.GetRequest.Timeout = 90000";
Debug.ShouldStop(2);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 90000));
 BA.debugLineNum = 1668;BA.debugLine="Dim continua As Boolean = True";
Debug.ShouldStop(8);
_continua = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("continua", _continua);Debug.locals.put("continua", _continua);
 BA.debugLineNum = 1670;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "getprereqassign"), (_job));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1672;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(128);
if (true) break;

case 9:
//if
this.state = 14;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 1673;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154599486",_serveraddress,0);
 BA.debugLineNum = 1674;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"GetPreReqAssign\",";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(BA.ObjectToString("GetPreReqAssign")),(Object)(RemoteObject.createImmutable("Completed")));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1676;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6154599489",_serveraddress,0);
 BA.debugLineNum = 1677;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"GetPreReqAssign\",";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Objects")),(Object)(BA.ObjectToString("GetPreReqAssign")),(Object)(RemoteObject.createImmutable("ERROR")));
 BA.debugLineNum = 1678;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 1679;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1680;BA.debugLine="continua = False";
Debug.ShouldStop(32768);
_continua = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("continua", _continua);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1682;BA.debugLine="Job.Release";
Debug.ShouldStop(131072);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1684;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1685;BA.debugLine="MsgboxAsync(\"Intervenções atribuidas\", ShareCode.";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Intervenções atribuidas")),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),objects.processBA);
 BA.debugLineNum = 1687;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static void  _msgbox_result(RemoteObject _result) throws Exception{
}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI";
objects.mostCurrent._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
 //BA.debugLineNum = 21;BA.debugLine="Private StartingRow As Int = 0";
objects._startingrow = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 22;BA.debugLine="Private ReadRows As Int = 20";
objects._readrows = BA.numberCast(int.class, 20);
 //BA.debugLineNum = 23;BA.debugLine="Private NextStartingRow As Int = 0";
objects._nextstartingrow = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 24;BA.debugLine="Dim Icon As BitmapDrawable";
objects.mostCurrent._icon = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 //BA.debugLineNum = 25;BA.debugLine="Dim CurrentFilter As String = \"\"";
objects.mostCurrent._currentfilter = BA.ObjectToString("");
 //BA.debugLineNum = 26;BA.debugLine="Dim TileSourceSpinner As Spinner";
objects.mostCurrent._tilesourcespinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ButtonUserUnavailable As Button";
objects.mostCurrent._buttonuserunavailable = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private ThisDialog As CustomLayoutDialog";
objects.mostCurrent._thisdialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
 //BA.debugLineNum = 30;BA.debugLine="Private listsBasePanel As Panel";
objects.mostCurrent._listsbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private listsBottomLine As Panel";
objects.mostCurrent._listsbottomline = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private listsBottomPanel As Panel";
objects.mostCurrent._listsbottompanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private listsButtonClose As Button";
objects.mostCurrent._listsbuttonclose = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private listsLabelInfo As Label";
objects.mostCurrent._listslabelinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private listsTabPanel As TabStrip";
objects.mostCurrent._liststabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.TabStripViewPager");
 //BA.debugLineNum = 36;BA.debugLine="Private listsTopBar As Panel";
objects.mostCurrent._liststopbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private listObjects As CustomListView";
objects.mostCurrent._listobjects = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 39;BA.debugLine="Private listButMap As Button";
objects.mostCurrent._listbutmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private ListItemLocation As Label";
objects.mostCurrent._listitemlocation = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ListItemFullName As Label";
objects.mostCurrent._listitemfullname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private listsButtonFilter As Button";
objects.mostCurrent._listsbuttonfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private LabelVersion As Label";
objects.mostCurrent._labelversion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelDateTime As Label";
objects.mostCurrent._labeldatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelAppInfo As Label";
objects.mostCurrent._labelappinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private LabelCopyright As Label";
objects.mostCurrent._labelcopyright = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private ListItemReference As Label";
objects.mostCurrent._listitemreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private ListItemContact As Label";
objects.mostCurrent._listitemcontact = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private listPedidosMap As CustomListView";
objects.mostCurrent._listpedidosmap = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 51;BA.debugLine="Private listPedidosButtonMap As Button";
objects.mostCurrent._listpedidosbuttonmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private ShowListPedidosMap As Boolean = False";
objects._showlistpedidosmap = objects.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 53;BA.debugLine="Private Bloco30 As Int = 0";
objects._bloco30 = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 54;BA.debugLine="Private mapBaseList As Panel";
objects.mostCurrent._mapbaselist = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private mapBasePanel As Panel";
objects.mostCurrent._mapbasepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private mapZoomDown As Button";
objects.mostCurrent._mapzoomdown = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private mapZoomUp As Button";
objects.mostCurrent._mapzoomup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private ListItemType As Label";
objects.mostCurrent._listitemtype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private ListItemStatus As Label";
objects.mostCurrent._listitemstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private ItemsCounter As Int = 0";
objects._itemscounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 61;BA.debugLine="Private butSearch As Button";
objects.mostCurrent._butsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private EditSearch As EditText";
objects.mostCurrent._editsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private ListItemTodayRequests As Label";
objects.mostCurrent._listitemtodayrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private IsFiltered As Boolean = False";
objects._isfiltered = objects.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 66;BA.debugLine="Private iDialogReqTypeObject, iDialogReqZone, iDi";
objects._idialogreqtypeobject = RemoteObject.createImmutable(0);
objects._idialogreqzone = RemoteObject.createImmutable(0);
objects._idialogreqstatus = RemoteObject.createImmutable(0);
objects._idialogreqregion = RemoteObject.createImmutable(0);
objects._idialogreqlocal = RemoteObject.createImmutable(0);
objects._idialogreqwithrequests = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 67;BA.debugLine="Private sDialogReqName, sDialogReqAddress, Search";
objects.mostCurrent._sdialogreqname = RemoteObject.createImmutable("");
objects.mostCurrent._sdialogreqaddress = RemoteObject.createImmutable("");
objects.mostCurrent._searchfilter = RemoteObject.createImmutable("");
 //BA.debugLineNum = 68;BA.debugLine="Private RegionsList, TypeObjectsList, LocalsList,";
objects.mostCurrent._regionslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
objects.mostCurrent._typeobjectslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
objects.mostCurrent._localslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
objects.mostCurrent._objrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
objects.mostCurrent._objrequestsnottoday = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 69;BA.debugLine="Private mapUserPosition As Button";
objects.mostCurrent._mapuserposition = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private listsButtonType As Button";
objects.mostCurrent._listsbuttontype = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private listsButtonZone As Button";
objects.mostCurrent._listsbuttonzone = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private listButSelect As Button";
objects.mostCurrent._listbutselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private ObjectTypePopMenu As MenuOnAnyView";
objects.mostCurrent._objecttypepopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 75;BA.debugLine="Private ObjectZonePopMenu As MenuOnAnyView";
objects.mostCurrent._objectzonepopmenu = RemoteObject.createNew ("com.jakes.menuonviews.menuonanyview");
 //BA.debugLineNum = 77;BA.debugLine="Private labelTypeObjectFilter As Label";
objects.mostCurrent._labeltypeobjectfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private ColorTabPanel As Panel";
objects.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private CurrentLineItem As Int = 0";
objects._currentlineitem = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 81;BA.debugLine="Private TotalLineItems As Int = 0";
objects._totallineitems = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 83;BA.debugLine="Private mainLabelOptLists As Label";
objects.mostCurrent._mainlabeloptlists = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private mainLogo As ImageView";
objects.mostCurrent._mainlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private listTasks As CustomListView";
objects.mostCurrent._listtasks = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 86;BA.debugLine="Private ButtonActionPause As Button";
objects.mostCurrent._buttonactionpause = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private ButtonAppNetwork As Button";
objects.mostCurrent._buttonappnetwork = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private mainActiveUser As Label";
objects.mostCurrent._mainactiveuser = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private gmap As GoogleMap";
objects.mostCurrent._gmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private mapData As MapFragment";
objects.mostCurrent._mapdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private mapMarker As Marker";
objects.mostCurrent._mapmarker = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private ListItemNumber As Label";
objects.mostCurrent._listitemnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private objectsListViewPanel As Panel";
objects.mostCurrent._objectslistviewpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private FirstTimeBool As Boolean = True";
objects._firsttimebool = objects.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 95;BA.debugLine="Private CLAPreRequestTypeSpinner As Spinner";
objects.mostCurrent._claprerequesttypespinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private CLAPreRequestSpinner As Spinner";
objects.mostCurrent._claprerequestspinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private GroupList As List";
objects.mostCurrent._grouplist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 98;BA.debugLine="Private ReqList As List";
objects.mostCurrent._reqlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 99;BA.debugLine="Private DistrictsList As List";
objects.mostCurrent._districtslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 100;BA.debugLine="Private CountyList As List";
objects.mostCurrent._countylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 101;BA.debugLine="Private listRequests As CustomListView";
objects.mostCurrent._listrequests = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 102;BA.debugLine="Private noPreRequestPanel As Panel";
objects.mostCurrent._noprerequestpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private ObjectsRequestsTitleLabel As Label";
objects.mostCurrent._objectsrequeststitlelabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private ListItemRequestDesc As Label";
objects.mostCurrent._listitemrequestdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private ListItemRequestObject As Label";
objects.mostCurrent._listitemrequestobject = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private listButPreRequestDownload As Button";
objects.mostCurrent._listbutprerequestdownload = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private listButPreRequestView As Button";
objects.mostCurrent._listbutprerequestview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private listButPreSelect As Button";
objects.mostCurrent._listbutpreselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private noRequestPanel As Panel";
objects.mostCurrent._norequestpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 110;BA.debugLine="Private listButRequest As Button";
objects.mostCurrent._listbutrequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 111;BA.debugLine="Private SelObject As String = \"\"";
objects.mostCurrent._selobject = BA.ObjectToString("");
 //BA.debugLineNum = 112;BA.debugLine="Private SelCheckList As String = \"\"";
objects.mostCurrent._selchecklist = BA.ObjectToString("");
 //BA.debugLineNum = 113;BA.debugLine="Private SelectedObjectsCount As Int = 0";
objects._selectedobjectscount = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 114;BA.debugLine="Private FromBulkOption As Int = 0";
objects._frombulkoption = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 115;BA.debugLine="Private ListItemDesc As Label";
objects.mostCurrent._listitemdesc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private ListItemState As Label";
objects.mostCurrent._listitemstate = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private butBulkCreateRequest As Button";
objects.mostCurrent._butbulkcreaterequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private butBulkPreRequest As Button";
objects.mostCurrent._butbulkprerequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 119;BA.debugLine="Private CLARequestList As CustomListView";
objects.mostCurrent._clarequestlist = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 120;BA.debugLine="Private CLARequestTypeSpinner As Spinner";
objects.mostCurrent._clarequesttypespinner = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private butCreateRequestCancel As Button";
objects.mostCurrent._butcreaterequestcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 122;BA.debugLine="Private butCreateRequest As Button";
objects.mostCurrent._butcreaterequest = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 123;BA.debugLine="Private NoRequestPanelTitleLabel As Label";
objects.mostCurrent._norequestpaneltitlelabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 124;BA.debugLine="Private CLAPreRequestPickerLabel As Spinner";
objects.mostCurrent._claprerequestpickerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 125;BA.debugLine="Private CLAPreRequestEditSearch As EditText";
objects.mostCurrent._claprerequesteditsearch = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 126;BA.debugLine="Private CLAPreRequestDistrictePickerLabel As Spin";
objects.mostCurrent._claprerequestdistrictepickerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 127;BA.debugLine="Private CLAPreRequestCountyPickerLabel As Spinner";
objects.mostCurrent._claprerequestcountypickerlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 128;BA.debugLine="Private listButPreSelectAll As Button";
objects.mostCurrent._listbutpreselectall = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 129;BA.debugLine="Private LabelPreRequestNumber As Label";
objects.mostCurrent._labelprerequestnumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 130;BA.debugLine="Private LabelPreRequestType As Label";
objects.mostCurrent._labelprerequesttype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 131;BA.debugLine="Private LabelPreRequestEntity As Label";
objects.mostCurrent._labelprerequestentity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 132;BA.debugLine="Private LabelPreRequestObject As Label";
objects.mostCurrent._labelprerequestobject = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 133;BA.debugLine="Private LabelPreRequestDateTime As Label";
objects.mostCurrent._labelprerequestdatetime = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 134;BA.debugLine="Private LabelPreRequestDetails As Label";
objects.mostCurrent._labelprerequestdetails = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 135;BA.debugLine="Private listOfFields As CustomListView";
objects.mostCurrent._listoffields = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 136;BA.debugLine="Private LabelPreRequestFieldValue As Label";
objects.mostCurrent._labelprerequestfieldvalue = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 137;BA.debugLine="Private LabelPreRequestFieldName As Label";
objects.mostCurrent._labelprerequestfieldname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 140;BA.debugLine="Private Qry_TypeRequest As String = \"\"";
objects.mostCurrent._qry_typerequest = BA.ObjectToString("");
 //BA.debugLineNum = 141;BA.debugLine="Private Qry_District As String = \"\"";
objects.mostCurrent._qry_district = BA.ObjectToString("");
 //BA.debugLineNum = 142;BA.debugLine="Private Qry_County As String = \"\"";
objects.mostCurrent._qry_county = BA.ObjectToString("");
 //BA.debugLineNum = 143;BA.debugLine="Private Qry_DateIn As String = \"\"";
objects.mostCurrent._qry_datein = BA.ObjectToString("");
 //BA.debugLineNum = 144;BA.debugLine="Private Qry_DateOut As String = \"\"";
objects.mostCurrent._qry_dateout = BA.ObjectToString("");
 //BA.debugLineNum = 145;BA.debugLine="Private Qry_Filter As String = \"\"";
objects.mostCurrent._qry_filter = BA.ObjectToString("");
 //BA.debugLineNum = 147;BA.debugLine="Private CumulativeTypeRequest As Int = 0";
objects._cumulativetyperequest = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 148;BA.debugLine="Private CumulativeDistrict As Int = 0";
objects._cumulativedistrict = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 149;BA.debugLine="Private CumulativeCounty As Int = 0";
objects._cumulativecounty = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 150;BA.debugLine="Private CumulativeDateIn As String = \"\"";
objects.mostCurrent._cumulativedatein = BA.ObjectToString("");
 //BA.debugLineNum = 151;BA.debugLine="Private CumulativeDateOut As String = \"\"";
objects.mostCurrent._cumulativedateout = BA.ObjectToString("");
 //BA.debugLineNum = 152;BA.debugLine="Private CumulativeFilter As String = \"\"";
objects.mostCurrent._cumulativefilter = BA.ObjectToString("");
 //BA.debugLineNum = 153;BA.debugLine="Private DialogReqStartDateLabel As Label";
objects.mostCurrent._dialogreqstartdatelabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 154;BA.debugLine="Private DialogReqEndDateLabel As Label";
objects.mostCurrent._dialogreqenddatelabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 155;BA.debugLine="Private ObjLabelObjectos As Label";
objects.mostCurrent._objlabelobjectos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 156;BA.debugLine="Private ObjLabelMorada As Label";
objects.mostCurrent._objlabelmorada = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 157;BA.debugLine="Private ObjLabelStatus As Label";
objects.mostCurrent._objlabelstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 158;BA.debugLine="Private ObjLabelLocal As Label";
objects.mostCurrent._objlabellocal = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 159;BA.debugLine="Private LabelObjRequestTipoInter As Label";
objects.mostCurrent._labelobjrequesttipointer = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 160;BA.debugLine="Private LabelObjRequestDataInicio As Label";
objects.mostCurrent._labelobjrequestdatainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 161;BA.debugLine="Private LabelObjRequestDataFim As Label";
objects.mostCurrent._labelobjrequestdatafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 162;BA.debugLine="Private LabelObjRequestConcelho As Label";
objects.mostCurrent._labelobjrequestconcelho = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 163;BA.debugLine="Private LabelObjRequestDistrito As Label";
objects.mostCurrent._labelobjrequestdistrito = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 164;BA.debugLine="Private LabelObjRequestPLivre As Label";
objects.mostCurrent._labelobjrequestplivre = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 165;BA.debugLine="Private LabelObjRequestTipoInter2 As Label";
objects.mostCurrent._labelobjrequesttipointer2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 166;BA.debugLine="Private LabelObjRequestTipoGrupoInter As Label";
objects.mostCurrent._labelobjrequesttipogrupointer = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 167;BA.debugLine="Private ListItemRequestHeader As Label";
objects.mostCurrent._listitemrequestheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 168;BA.debugLine="Private ListItemActionHeader As Label";
objects.mostCurrent._listitemactionheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 169;BA.debugLine="Private DummyMenuPlaceHlder As Label";
objects.mostCurrent._dummymenuplacehlder = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 170;BA.debugLine="Private CLAButtonRequestFilter As Button";
objects.mostCurrent._clabuttonrequestfilter = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 171;BA.debugLine="Private CLAButtonRequestDownload As Button";
objects.mostCurrent._clabuttonrequestdownload = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 172;BA.debugLine="Private LstPreReqs2Download As List";
objects.mostCurrent._lstprereqs2download = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 173;BA.debugLine="Private ListItemParent As Label";
objects.mostCurrent._listitemparent = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _labeltypeobjectfilter_click() throws Exception{
try {
		Debug.PushSubsStack("labelTypeObjectFilter_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1142);
if (RapidSub.canDelegate("labeltypeobjectfilter_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","labeltypeobjectfilter_click");}
 BA.debugLineNum = 1142;BA.debugLine="Sub labelTypeObjectFilter_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1144;BA.debugLine="If ObjectTypePopMenu.MenuIsOpen Then";
Debug.ShouldStop(8388608);
if (objects.mostCurrent._objecttypepopmenu.getField(true,"_menuisopen").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1145;BA.debugLine="ObjectTypePopMenu.CloseMenu";
Debug.ShouldStop(16777216);
objects.mostCurrent._objecttypepopmenu.runVoidMethod ("_closemenu");
 }else {
 BA.debugLineNum = 1147;BA.debugLine="ObjectTypePopMenu.OpenMenu";
Debug.ShouldStop(67108864);
objects.mostCurrent._objecttypepopmenu.runVoidMethod ("_openmenu");
 };
 BA.debugLineNum = 1150;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutattachmap_click() throws Exception{
try {
		Debug.PushSubsStack("listButAttachMap_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,958);
if (RapidSub.canDelegate("listbutattachmap_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutattachmap_click");}
 BA.debugLineNum = 958;BA.debugLine="Sub listButAttachMap_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 960;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutcontract_click() throws Exception{
try {
		Debug.PushSubsStack("listButContract_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,987);
if (RapidSub.canDelegate("listbutcontract_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutcontract_click");}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lidb = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _provider = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.fileprovider");
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pdfappslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 987;BA.debugLine="Sub listButContract_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 989;BA.debugLine="Dim l As Label = Sender";
Debug.ShouldStop(268435456);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("l", _l);
 BA.debugLineNum = 991;BA.debugLine="Log(l.Tag)";
Debug.ShouldStop(1073741824);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6153157636",BA.ObjectToString(_l.runMethod(false,"getTag")),0);
 BA.debugLineNum = 992;BA.debugLine="Dim p As Panel  = l.Parent";
Debug.ShouldStop(-2147483648);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _l.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 994;BA.debugLine="Dim lidb As Label = p.GetView(8)";
Debug.ShouldStop(2);
_lidb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 8))).getObject());Debug.locals.put("lidb", _lidb);
 BA.debugLineNum = 996;BA.debugLine="Dim Filename As String = lidb.Tag";
Debug.ShouldStop(8);
_filename = BA.ObjectToString(_lidb.runMethod(false,"getTag"));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 997;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(16);
_continua = objects.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 998;BA.debugLine="If Continua Then";
Debug.ShouldStop(32);
if (_continua.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 999;BA.debugLine="Private Provider As FileProvider";
Debug.ShouldStop(64);
_provider = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.fileprovider");Debug.locals.put("Provider", _provider);
 BA.debugLineNum = 1000;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(128);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initialize" /*RemoteObject*/ ,objects.processBA);
 BA.debugLineNum = 1001;BA.debugLine="Provider.InitializeSafeDir";
Debug.ShouldStop(256);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initializesafedir" /*RemoteObject*/ );
 BA.debugLineNum = 1002;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
Debug.ShouldStop(512);
_thefile = BA.ObjectToString(_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1004;BA.debugLine="Log(theFile)";
Debug.ShouldStop(2048);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6153157649",_thefile,0);
 BA.debugLineNum = 1005;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(4096);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 1006;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
Debug.ShouldStop(8192);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),_thefile)));
 BA.debugLineNum = 1007;BA.debugLine="Intent1.SetType(\"application/pdf\")";
Debug.ShouldStop(16384);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/pdf")));
 BA.debugLineNum = 1008;BA.debugLine="Dim pdfAppsList As List";
Debug.ShouldStop(32768);
_pdfappslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1009;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
Debug.ShouldStop(65536);
_pdfappslist = objects.mostCurrent._utils.runMethod(false,"_queryintent" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_intent1));Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1010;BA.debugLine="If pdfAppsList.size>0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_pdfappslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1012;BA.debugLine="Log(\"pdf viewer(s) exists\")";
Debug.ShouldStop(524288);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6153157657",RemoteObject.createImmutable("pdf viewer(s) exists"),0);
 BA.debugLineNum = 1013;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(1048576);
objects.mostCurrent.__c.runVoidMethod ("StartActivity",objects.processBA,(Object)((_intent1.getObject())));
 };
 };
 BA.debugLineNum = 1017;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutcontract2_click() throws Exception{
try {
		Debug.PushSubsStack("listButContract2_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1023);
if (RapidSub.canDelegate("listbutcontract2_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutcontract2_click");}
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lidb = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _continua = RemoteObject.createImmutable(false);
RemoteObject _provider = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.fileprovider");
RemoteObject _thefile = RemoteObject.createImmutable("");
RemoteObject _intent1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.IntentWrapper");
RemoteObject _pdfappslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 1023;BA.debugLine="Sub listButContract2_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1024;BA.debugLine="Dim l As Label = Sender";
Debug.ShouldStop(-2147483648);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("l", _l);
 BA.debugLineNum = 1026;BA.debugLine="Log(l.Tag)";
Debug.ShouldStop(2);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6153288707",BA.ObjectToString(_l.runMethod(false,"getTag")),0);
 BA.debugLineNum = 1027;BA.debugLine="Dim p As Panel  = l.Parent";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _l.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 1029;BA.debugLine="Dim lidb As Label = p.GetView(3)";
Debug.ShouldStop(16);
_lidb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_lidb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 3))).getObject());Debug.locals.put("lidb", _lidb);
 BA.debugLineNum = 1031;BA.debugLine="Dim Filename As String = lidb.Tag";
Debug.ShouldStop(64);
_filename = BA.ObjectToString(_lidb.runMethod(false,"getTag"));Debug.locals.put("Filename", _filename);Debug.locals.put("Filename", _filename);
 BA.debugLineNum = 1032;BA.debugLine="Dim Continua As Boolean = True";
Debug.ShouldStop(128);
_continua = objects.mostCurrent.__c.getField(true,"True");Debug.locals.put("Continua", _continua);Debug.locals.put("Continua", _continua);
 BA.debugLineNum = 1033;BA.debugLine="If Continua Then";
Debug.ShouldStop(256);
if (_continua.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1034;BA.debugLine="Private Provider As FileProvider";
Debug.ShouldStop(512);
_provider = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.fileprovider");Debug.locals.put("Provider", _provider);
 BA.debugLineNum = 1035;BA.debugLine="Provider.Initialize";
Debug.ShouldStop(1024);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initialize" /*RemoteObject*/ ,objects.processBA);
 BA.debugLineNum = 1036;BA.debugLine="Provider.InitializeSafeDir";
Debug.ShouldStop(2048);
_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_initializesafedir" /*RemoteObject*/ );
 BA.debugLineNum = 1037;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
Debug.ShouldStop(4096);
_thefile = BA.ObjectToString(_provider.runClassMethod (xevolution.vrcg.devdemov2400.fileprovider.class, "_getfileuri" /*RemoteObject*/ ,(Object)(_filename)));Debug.locals.put("theFile", _thefile);Debug.locals.put("theFile", _thefile);
 BA.debugLineNum = 1039;BA.debugLine="Log(theFile)";
Debug.ShouldStop(16384);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6153288720",_thefile,0);
 BA.debugLineNum = 1040;BA.debugLine="Dim Intent1 As Intent";
Debug.ShouldStop(32768);
_intent1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.IntentWrapper");Debug.locals.put("Intent1", _intent1);
 BA.debugLineNum = 1041;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
Debug.ShouldStop(65536);
_intent1.runVoidMethod ("Initialize",(Object)(_intent1.getField(true,"ACTION_VIEW")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("file://"),_thefile)));
 BA.debugLineNum = 1042;BA.debugLine="Intent1.SetType(\"application/pdf\")";
Debug.ShouldStop(131072);
_intent1.runVoidMethod ("SetType",(Object)(RemoteObject.createImmutable("application/pdf")));
 BA.debugLineNum = 1043;BA.debugLine="Dim pdfAppsList As List";
Debug.ShouldStop(262144);
_pdfappslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1044;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
Debug.ShouldStop(524288);
_pdfappslist = objects.mostCurrent._utils.runMethod(false,"_queryintent" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_intent1));Debug.locals.put("pdfAppsList", _pdfappslist);
 BA.debugLineNum = 1045;BA.debugLine="If pdfAppsList.size>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_pdfappslist.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1047;BA.debugLine="Log(\"pdf viewer(s) exists\")";
Debug.ShouldStop(4194304);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6153288728",RemoteObject.createImmutable("pdf viewer(s) exists"),0);
 BA.debugLineNum = 1048;BA.debugLine="StartActivity(Intent1)";
Debug.ShouldStop(8388608);
objects.mostCurrent.__c.runVoidMethod ("StartActivity",objects.processBA,(Object)((_intent1.getObject())));
 };
 };
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutdocuments_click() throws Exception{
try {
		Debug.PushSubsStack("listButDocuments_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,983);
if (RapidSub.canDelegate("listbutdocuments_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutdocuments_click");}
 BA.debugLineNum = 983;BA.debugLine="Sub listButDocuments_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 985;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutinfo_click() throws Exception{
try {
		Debug.PushSubsStack("listButInfo_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,887);
if (RapidSub.canDelegate("listbutinfo_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutinfo_click");}
 BA.debugLineNum = 887;BA.debugLine="Sub listButInfo_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 889;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutinfomap_click() throws Exception{
try {
		Debug.PushSubsStack("listButInfoMap_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,962);
if (RapidSub.canDelegate("listbutinfomap_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutinfomap_click");}
 BA.debugLineNum = 962;BA.debugLine="Sub listButInfoMap_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 964;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutmap_click() throws Exception{
try {
		Debug.PushSubsStack("listButMap_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,870);
if (RapidSub.canDelegate("listbutmap_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutmap_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _ret = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectinformation");
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
 BA.debugLineNum = 870;BA.debugLine="Sub listButMap_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 871;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(64);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 872;BA.debugLine="Dim p As Panel  = b.Parent";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _b.runMethod(false,"getParent"));Debug.locals.put("p", _p);
 BA.debugLineNum = 873;BA.debugLine="Dim ret As ObjectInformation = GetObjectMapInfo(p";
Debug.ShouldStop(256);
_ret = _getobjectmapinfo(BA.ObjectToString(_p.runMethod(false,"getTag")));Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 875;BA.debugLine="If Not(Utils.isNullOrEmpty(ret.Latitude)) And Not";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_ret.getField(true,"Latitude" /*RemoteObject*/ )))))) && RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_ret.getField(true,"Longitude" /*RemoteObject*/ ))))))) { 
 BA.debugLineNum = 876;BA.debugLine="listsTabPanel.ScrollTo(2, True)";
Debug.ShouldStop(2048);
objects.mostCurrent._liststabpanel.runVoidMethod ("ScrollTo",(Object)(BA.numberCast(int.class, 2)),(Object)(objects.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 878;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(8192);
if (objects.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 879;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(16384);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 880;BA.debugLine="cp.Initialize(ret.Latitude, ret.Longitude, 17)";
Debug.ShouldStop(32768);
_cp.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, _ret.getField(true,"Latitude" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, _ret.getField(true,"Longitude" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 881;BA.debugLine="gmap.MoveCamera(cp)";
Debug.ShouldStop(65536);
objects.mostCurrent._gmap.runVoidMethod ("MoveCamera",(Object)((_cp.getObject())));
 };
 };
 BA.debugLineNum = 885;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listbutprerequestdownload_click() throws Exception{
try {
		Debug.PushSubsStack("listButPreRequestDownload_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3479);
if (RapidSub.canDelegate("listbutprerequestdownload_click")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutprerequestdownload_click"); return;}
ResumableSub_listButPreRequestDownload_Click rsub = new ResumableSub_listButPreRequestDownload_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_listButPreRequestDownload_Click extends BA.ResumableSub {
public ResumableSub_listButPreRequestDownload_Click(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _bb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _reqtagcode = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _currdate = RemoteObject.createImmutable("");
RemoteObject _currtime = RemoteObject.createImmutable("");
RemoteObject _entitytag = RemoteObject.createImmutable("");
RemoteObject _objecttag = RemoteObject.createImmutable("");
RemoteObject _typerequest_tagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _cla = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
RemoteObject _continuarexec = RemoteObject.createImmutable(false);
RemoteObject _registos = RemoteObject.createImmutable(0);
RemoteObject _incolitems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tasktype = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _actionkey = RemoteObject.createImmutable("");
RemoteObject _task = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sdate = RemoteObject.createImmutable("");
RemoteObject _stime = RemoteObject.createImmutable("");
RemoteObject _close_type = RemoteObject.createImmutable(0);
RemoteObject _result_type = RemoteObject.createImmutable(0);
RemoteObject _result_values = RemoteObject.createImmutable("");
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _clainfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
RemoteObject _record9 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _ni = 0;
RemoteObject _do_name = RemoteObject.createImmutable("");
RemoteObject _do_field = RemoteObject.createImmutable("");
RemoteObject _do_is_additional = RemoteObject.createImmutable(0);
RemoteObject _task_tagcode = RemoteObject.createImmutable("");
RemoteObject _item_tagcode = RemoteObject.createImmutable("");
RemoteObject _unique_key = RemoteObject.createImmutable("");
RemoteObject _inssql = RemoteObject.createImmutable("");
RemoteObject _objsql = RemoteObject.createImmutable("");
RemoteObject _record99 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _nii = 0;
RemoteObject _val = RemoteObject.createImmutable("");
RemoteObject _newsql = RemoteObject.createImmutable("");
int step148;
int limit148;
int step183;
int limit183;
int step208;
int limit208;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("listButPreRequestDownload_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3479);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 3480;BA.debugLine="Dim bb As Button = Sender";
Debug.ShouldStop(8388608);
_bb = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_bb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), parent.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("bb", _bb);
 BA.debugLineNum = 3481;BA.debugLine="If Utils.NNE(bb.Tag) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 112;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(_bb.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 111;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3482;BA.debugLine="Dim ReqTagcode As String = bb.Tag";
Debug.ShouldStop(33554432);
_reqtagcode = BA.ObjectToString(_bb.runMethod(false,"getTag"));Debug.locals.put("ReqTagcode", _reqtagcode);Debug.locals.put("ReqTagcode", _reqtagcode);
 BA.debugLineNum = 3483;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.objectsMsgConfi";
Debug.ShouldStop(67108864);
_i = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectsmsgconfirmaatribuicaoasi /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),(Object)(parent.mostCurrent._sharecode._option_yes /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_no /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_yesexec /*RemoteObject*/ ),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),objects.mostCurrent.activityBA);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 3484;BA.debugLine="If (i=DialogResponse.POSITIVE) Or (i=DialogRespo";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 109;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3486;BA.debugLine="ProgressDialogShow2(ShareCode.objectMsgPreparar";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3487;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "listbutprerequestdownload_click"),BA.numberCast(int.class, 250));
this.state = 113;
return;
case 113:
//C
this.state = 7;
;
 BA.debugLineNum = 3488;BA.debugLine="Dim CurrDate As String = Utils.GetDate(DateTime";
Debug.ShouldStop(-2147483648);
_currdate = parent.mostCurrent._utils.runMethod(true,"_getdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("CurrDate", _currdate);Debug.locals.put("CurrDate", _currdate);
 BA.debugLineNum = 3489;BA.debugLine="Dim CurrTime As String = Utils.GetCurrentTime";
Debug.ShouldStop(1);
_currtime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttime" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("CurrTime", _currtime);Debug.locals.put("CurrTime", _currtime);
 BA.debugLineNum = 3490;BA.debugLine="Dim EntityTag As String = DBStructures.GetScrip";
Debug.ShouldStop(2);
_entitytag = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select\n"),RemoteObject.createImmutable("										Case WHEN (entity_tagcode <> '') and (entity_tagcode is not null) THEN entity_tagcode \n"),RemoteObject.createImmutable("										ELSE '__NONE__' End  as entity_tagcode\n"),RemoteObject.createImmutable("										from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqtagcode))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("entity_tagcode")));Debug.locals.put("EntityTag", _entitytag);Debug.locals.put("EntityTag", _entitytag);
 BA.debugLineNum = 3495;BA.debugLine="Dim ObjectTag As String = DBStructures.GetScrip";
Debug.ShouldStop(64);
_objecttag = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select\n"),RemoteObject.createImmutable("										Case WHEN (object_tagcode <> '') and (object_tagcode is not null) THEN object_tagcode \n"),RemoteObject.createImmutable("										ELSE '__NONE__' End  as object_tagcode\n"),RemoteObject.createImmutable("										from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqtagcode))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("object_tagcode")));Debug.locals.put("ObjectTag", _objecttag);Debug.locals.put("ObjectTag", _objecttag);
 BA.debugLineNum = 3500;BA.debugLine="Dim typerequest_tagcode As String = DBStructure";
Debug.ShouldStop(2048);
_typerequest_tagcode = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select typerequest_tagcode\n"),RemoteObject.createImmutable("										from dta_requests where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqtagcode))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("typerequest_tagcode")));Debug.locals.put("typerequest_tagcode", _typerequest_tagcode);Debug.locals.put("typerequest_tagcode", _typerequest_tagcode);
 BA.debugLineNum = 3503;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
Debug.ShouldStop(16384);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set state_id=4, technical_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("							entity_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entitytag))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("							object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttag))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("							execute_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currdate))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("							execute_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currtime))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("							where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqtagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3510;BA.debugLine="Utils.SaveSQLToLog(\"CLAItemButton_StateClick\",s";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("CLAItemButton_StateClick")),(Object)(_ssql),(Object)(_reqtagcode.runMethod(true,"trim")));
 BA.debugLineNum = 3512;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8388608);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3513;BA.debugLine="params.Initialize";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3514;BA.debugLine="params.Clear";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3515;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3516;BA.debugLine="params.Put(\"ACLARequest\", ReqTagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_reqtagcode)));
 BA.debugLineNum = 3517;BA.debugLine="params.Put(\"ACLAExecDate\", CurrDate)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAExecDate"))),(Object)((_currdate)));
 BA.debugLineNum = 3518;BA.debugLine="params.Put(\"ACLAExecHour\", CurrTime)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAExecHour"))),(Object)((_currtime)));
 BA.debugLineNum = 3519;BA.debugLine="params.Put(\"ACLAEntity\", EntityTag)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAEntity"))),(Object)((_entitytag)));
 BA.debugLineNum = 3520;BA.debugLine="params.Put(\"ACLAObject\", ObjectTag)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAObject"))),(Object)((_objecttag)));
 BA.debugLineNum = 3521;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_OPER_U";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ )));
 BA.debugLineNum = 3522;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3523;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3524;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3525;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3526;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3527;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3528;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3529;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
Debug.ShouldStop(256);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/assign")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3530;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 3531;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", ReqTagco";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(objects.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_reqtagcode));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3533;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(4096);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_reqtagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3534;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 3536;BA.debugLine="Sleep(1500)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "listbutprerequestdownload_click"),BA.numberCast(int.class, 1500));
this.state = 114;
return;
case 114:
//C
this.state = 13;
;
 BA.debugLineNum = 3537;BA.debugLine="If (i=DialogResponse.NEGATIVE) Then";
Debug.ShouldStop(65536);
if (true) break;

case 13:
//if
this.state = 108;
if ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE"))))) { 
this.state = 15;
}else {
this.state = 107;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3538;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETR";
Debug.ShouldStop(131072);
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3539;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${ReqT";
Debug.ShouldStop(262144);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and z.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_reqtagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3540;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286461",_ssql,0);
 BA.debugLineNum = 3541;BA.debugLine="Log(ReqTagcode)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286462",_reqtagcode,0);
 BA.debugLineNum = 3542;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(\"";
Debug.ShouldStop(2097152);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("_NOACTION_")),(Object)(BA.ObjectToString("_NOACTION_")),(Object)(BA.ObjectToString("_NOACTION_")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent._consts._colorwhite /*RemoteObject*/ ))),(Object)(parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.NumberToString(0)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))))),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 3547;BA.debugLine="Dim ContinuarExec As Boolean = True";
Debug.ShouldStop(67108864);
_continuarexec = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ContinuarExec", _continuarexec);Debug.locals.put("ContinuarExec", _continuarexec);
 BA.debugLineNum = 3548;BA.debugLine="Dim Registos As Int = 0";
Debug.ShouldStop(134217728);
_registos = BA.numberCast(int.class, 0);Debug.locals.put("Registos", _registos);Debug.locals.put("Registos", _registos);
 BA.debugLineNum = 3550;BA.debugLine="Private incolitems As Cursor = Starter.LocalSQ";
Debug.ShouldStop(536870912);
_incolitems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_incolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("incolitems", _incolitems);
 BA.debugLineNum = 3551;BA.debugLine="If (incolitems.RowCount>0) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 16:
//if
this.state = 31;
if ((RemoteObject.solveBoolean(">",_incolitems.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 3552;BA.debugLine="incolitems.Position = 0";
Debug.ShouldStop(-2147483648);
_incolitems.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3553;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
Debug.ShouldStop(1);
_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 3554;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type";
Debug.ShouldStop(2);
_tasktype = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("tasktype", _tasktype);Debug.locals.put("tasktype", _tasktype);
 BA.debugLineNum = 3555;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"sta";
Debug.ShouldStop(4);
_status_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 3556;BA.debugLine="Dim tagcode As String = incolitems.GetString(";
Debug.ShouldStop(8);
_tagcode = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 3557;BA.debugLine="Dim actionkey As String = incolitems.GetStrin";
Debug.ShouldStop(16);
_actionkey = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")));Debug.locals.put("actionkey", _actionkey);Debug.locals.put("actionkey", _actionkey);
 BA.debugLineNum = 3558;BA.debugLine="Dim task As String = incolitems.GetString(\"ta";
Debug.ShouldStop(32);
_task = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task", _task);Debug.locals.put("task", _task);
 BA.debugLineNum = 3559;BA.debugLine="Dim name As String = incolitems.GetString(\"na";
Debug.ShouldStop(64);
_name = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 3562;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDa";
Debug.ShouldStop(512);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 3563;BA.debugLine="Private sACLALatitude As String = Utils.IfNul";
Debug.ShouldStop(1024);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 3564;BA.debugLine="Private sACLALongitude As String = Utils.IfNu";
Debug.ShouldStop(2048);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 3566;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(8192);
_sdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sDate", _sdate);Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 3567;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(16384);
_stime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sTime", _stime);Debug.locals.put("sTime", _stime);
 BA.debugLineNum = 3569;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"cl";
Debug.ShouldStop(65536);
_close_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("close_type")));Debug.locals.put("close_type", _close_type);Debug.locals.put("close_type", _close_type);
 BA.debugLineNum = 3570;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"r";
Debug.ShouldStop(131072);
_result_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("result_type")));Debug.locals.put("result_type", _result_type);Debug.locals.put("result_type", _result_type);
 BA.debugLineNum = 3571;BA.debugLine="Dim result_values As String = incolitems.GetS";
Debug.ShouldStop(262144);
_result_values = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("result_values")));Debug.locals.put("result_values", _result_values);Debug.locals.put("result_values", _result_values);
 BA.debugLineNum = 3572;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(";
Debug.ShouldStop(524288);
_repeatcounter = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 3574;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeRe";
Debug.ShouldStop(2097152);
_clainfo = parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(_close_type),(Object)(_result_type),(Object)(_result_values),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("CLAInfo", _clainfo);Debug.locals.put("CLAInfo", _clainfo);
 BA.debugLineNum = 3575;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(";
Debug.ShouldStop(4194304);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_actionkey),(Object)(_task),(Object)(_repeatcounter),(Object)(_tasktype),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_id),(Object)(_tagcode),(Object)(_status_id),(Object)(parent.mostCurrent._utils.runMethod(true,"_colorint" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_status_id))))),(Object)(_clainfo),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 3579;BA.debugLine="Dim sSQL As String = $\"update dta_requests se";
Debug.ShouldStop(67108864);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3581;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 3582;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
Debug.ShouldStop(536870912);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3584;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 3585;BA.debugLine="Log(\"Grava Status na BD local Request\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286506",RemoteObject.createImmutable("Grava Status na BD local Request"),0);
 BA.debugLineNum = 3586;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3587;BA.debugLine="params.Initialize";
Debug.ShouldStop(4);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3588;BA.debugLine="params.Clear";
Debug.ShouldStop(8);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3589;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3590;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 3591;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 3592;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3593;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 3594;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 3595;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 3596;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 3597;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagc";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3598;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAutho";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3599;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3600;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3601;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3602;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMa";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3603;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3604;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 19:
//try
this.state = 24;
this.catchState = 23;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 24;
this.catchState = 23;
 BA.debugLineNum = 3605;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 3606;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 3608;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286529",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3609;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 3610;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3611;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3612;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
 BA.debugLineNum = 3614;BA.debugLine="CLA.Info.Map1 = params";
Debug.ShouldStop(536870912);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map1" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 3616;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
Debug.ShouldStop(-2147483648);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("' and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3618;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(2);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 3619;BA.debugLine="Log(\"Grava Status na BD local Request-Relatio";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286540",RemoteObject.createImmutable("Grava Status na BD local Request-Relation"),0);
 BA.debugLineNum = 3621;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3622;BA.debugLine="params.Initialize";
Debug.ShouldStop(32);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3623;BA.debugLine="params.Clear";
Debug.ShouldStop(64);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3624;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3625;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 3626;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_actionkey)));
 BA.debugLineNum = 3627;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 3628;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3629;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 3630;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 3631;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 3632;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 3633;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagc";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3634;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAutho";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3635;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3636;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3637;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3638;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMa";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3639;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3640;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 3641;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 25:
//try
this.state = 30;
this.catchState = 29;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 30;
this.catchState = 29;
 BA.debugLineNum = 3642;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 3643;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 3644;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 3646;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286567",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3647;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 3648;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 3649;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
;
 BA.debugLineNum = 3651;BA.debugLine="CLA.Info.Map2 = params";
Debug.ShouldStop(4);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map2" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 3652;BA.debugLine="CLA.Status.status = 2";
Debug.ShouldStop(8);
_cla.getField(false,"Status" /*RemoteObject*/ ).setField ("status" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 3653;BA.debugLine="Registos = Registos + 1";
Debug.ShouldStop(16);
_registos = RemoteObject.solve(new RemoteObject[] {_registos,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Registos", _registos);
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 3655;BA.debugLine="incolitems.Close";
Debug.ShouldStop(64);
_incolitems.runVoidMethod ("Close");
 BA.debugLineNum = 3656;BA.debugLine="ContinuarExec = Registos > 0";
Debug.ShouldStop(128);
_continuarexec = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_registos,BA.numberCast(double.class, 0)));Debug.locals.put("ContinuarExec", _continuarexec);
 BA.debugLineNum = 3658;BA.debugLine="If ContinuarExec Then";
Debug.ShouldStop(512);
if (true) break;

case 32:
//if
this.state = 105;
if (_continuarexec.<Boolean>get().booleanValue()) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 3660;BA.debugLine="If Utils.NNE(ObjectTag) And Not(ObjectTag = \"";
Debug.ShouldStop(2048);
if (true) break;

case 35:
//if
this.state = 98;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_objecttag))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_objecttag,RemoteObject.createImmutable("__NONE__"))))))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 3661;BA.debugLine="Private Record9 As Cursor";
Debug.ShouldStop(4096);
_record9 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record9", _record9);
 BA.debugLineNum = 3662;BA.debugLine="Dim sSQL As String = $\"SELECT b.connectmode,";
Debug.ShouldStop(8192);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,\n"),RemoteObject.createImmutable("										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title\n"),RemoteObject.createImmutable("										FROM dta_tasks_items AS a\n"),RemoteObject.createImmutable("										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or\n"),RemoteObject.createImmutable("										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3668;BA.debugLine="Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL";
Debug.ShouldStop(524288);
_record9 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 3669;BA.debugLine="If Record9.RowCount > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 38:
//if
this.state = 97;
if (RemoteObject.solveBoolean(">",_record9.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 3670;BA.debugLine="For ni = 0 To Record9.RowCount-1";
Debug.ShouldStop(2097152);
if (true) break;

case 41:
//for
this.state = 96;
step148 = 1;
limit148 = RemoteObject.solve(new RemoteObject[] {_record9.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ni = 0 ;
Debug.locals.put("ni", _ni);
this.state = 115;
if (true) break;

case 115:
//C
this.state = 96;
if ((step148 > 0 && _ni <= limit148) || (step148 < 0 && _ni >= limit148)) this.state = 43;
if (true) break;

case 116:
//C
this.state = 115;
_ni = ((int)(0 + _ni + step148)) ;
Debug.locals.put("ni", _ni);
if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 3671;BA.debugLine="Record9.Position = ni";
Debug.ShouldStop(4194304);
_record9.runMethod(true,"setPosition",BA.numberCast(int.class, _ni));
 BA.debugLineNum = 3672;BA.debugLine="Dim do_name As String = Record9.GetString(";
Debug.ShouldStop(8388608);
_do_name = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_name")));Debug.locals.put("do_name", _do_name);Debug.locals.put("do_name", _do_name);
 BA.debugLineNum = 3673;BA.debugLine="Dim do_field As String = Record9.GetString";
Debug.ShouldStop(16777216);
_do_field = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_field")));Debug.locals.put("do_field", _do_field);Debug.locals.put("do_field", _do_field);
 BA.debugLineNum = 3674;BA.debugLine="Dim do_is_additional As Int = Record9.GetI";
Debug.ShouldStop(33554432);
_do_is_additional = _record9.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("do_is_additional")));Debug.locals.put("do_is_additional", _do_is_additional);Debug.locals.put("do_is_additional", _do_is_additional);
 BA.debugLineNum = 3675;BA.debugLine="Dim task_tagcode As String = Record9.GetSt";
Debug.ShouldStop(67108864);
_task_tagcode = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task_tagcode", _task_tagcode);Debug.locals.put("task_tagcode", _task_tagcode);
 BA.debugLineNum = 3676;BA.debugLine="Dim item_tagcode As String = Record9.GetSt";
Debug.ShouldStop(134217728);
_item_tagcode = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("item_tagcode")));Debug.locals.put("item_tagcode", _item_tagcode);Debug.locals.put("item_tagcode", _item_tagcode);
 BA.debugLineNum = 3677;BA.debugLine="Dim unique_key As String = Record9.GetStri";
Debug.ShouldStop(268435456);
_unique_key = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("unique_key", _unique_key);Debug.locals.put("unique_key", _unique_key);
 BA.debugLineNum = 3679;BA.debugLine="If (do_name.ToUpperCase = \"__TYPEREQUEST__";
Debug.ShouldStop(1073741824);
if (true) break;

case 44:
//if
this.state = 95;
if ((RemoteObject.solveBoolean("=",_do_name.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("__TYPEREQUEST__")))) { 
this.state = 46;
}else {
this.state = 68;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 3681;BA.debugLine="Dim insSQL As String = $\"insert into dta_";
Debug.ShouldStop(1);
_inssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_fields (id, request_tagcode, field_tagcode)\n"),RemoteObject.createImmutable("														Select id, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' as request_tagcode, field_tagcode \n"),RemoteObject.createImmutable("														from dta_typerequests_fields where typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_typerequest_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("														And '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'||field_tagcode not in \n"),RemoteObject.createImmutable("															(Select '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'||field_tagcode as campo \n"),RemoteObject.createImmutable("															from dta_requests_fields\n"),RemoteObject.createImmutable("															where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')")));Debug.locals.put("insSQL", _inssql);Debug.locals.put("insSQL", _inssql);
 BA.debugLineNum = 3689;BA.debugLine="Utils.SaveSQLToLog(\"CriaCamposAdicionais\"";
Debug.ShouldStop(256);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("CriaCamposAdicionais")),(Object)(_inssql),(Object)(_tagcode));
 BA.debugLineNum = 3690;BA.debugLine="Dim params As Map";
Debug.ShouldStop(512);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3691;BA.debugLine="params.Initialize";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3692;BA.debugLine="params.Clear";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3693;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3694;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 3695;BA.debugLine="params.Put(\"ACLARequestType\", typerequest";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequestType"))),(Object)((_typerequest_tagcode)));
 BA.debugLineNum = 3696;BA.debugLine="params.Put(\"versionTagcode\", Main.Version";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3697;BA.debugLine="params.Put(\"_authorization\", Main.DeviceA";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3698;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstan";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3699;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBra";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3700;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceMod";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3701;BA.debugLine="params.put(\"_deviceMacAddress\", Main.Devi";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3702;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3703;BA.debugLine="Dim Url As String = $\"https://${ShareCode";
Debug.ShouldStop(4194304);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla-fields/create")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3704;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 47:
//if
this.state = 52;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
 BA.debugLineNum = 3705;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", ta";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(objects.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_tagcode));
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 3707;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Ma";
Debug.ShouldStop(67108864);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3708;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(p";
Debug.ShouldStop(134217728);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 52:
//C
this.state = 53;
;
 BA.debugLineNum = 3710;BA.debugLine="Sleep(500)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "listbutprerequestdownload_click"),BA.numberCast(int.class, 500));
this.state = 117;
return;
case 117:
//C
this.state = 53;
;
 BA.debugLineNum = 3712;BA.debugLine="Dim ObjSQL As String = $\"select distinct";
Debug.ShouldStop(-2147483648);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct value from dta_requests_fields where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_typerequest_tagcode))),RemoteObject.createImmutable("' and field_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable("'")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 BA.debugLineNum = 3713;BA.debugLine="Private Record99 As Cursor = Starter.Loca";
Debug.ShouldStop(1);
_record99 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record99 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_objsql)));Debug.locals.put("Record99", _record99);
 BA.debugLineNum = 3714;BA.debugLine="If Record99.RowCount > 0 Then";
Debug.ShouldStop(2);
if (true) break;

case 53:
//if
this.state = 66;
if (RemoteObject.solveBoolean(">",_record99.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 3715;BA.debugLine="For nii = 0 To Record99.RowCount-1";
Debug.ShouldStop(4);
if (true) break;

case 56:
//for
this.state = 65;
step183 = 1;
limit183 = RemoteObject.solve(new RemoteObject[] {_record99.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nii = 0 ;
Debug.locals.put("nii", _nii);
this.state = 118;
if (true) break;

case 118:
//C
this.state = 65;
if ((step183 > 0 && _nii <= limit183) || (step183 < 0 && _nii >= limit183)) this.state = 58;
if (true) break;

case 119:
//C
this.state = 118;
_nii = ((int)(0 + _nii + step183)) ;
Debug.locals.put("nii", _nii);
if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 3716;BA.debugLine="Record99.Position = nii";
Debug.ShouldStop(8);
_record99.runMethod(true,"setPosition",BA.numberCast(int.class, _nii));
 BA.debugLineNum = 3717;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty";
Debug.ShouldStop(16);
_val = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record99.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 3718;BA.debugLine="Dim NewSQL As String = $\"update dta_req";
Debug.ShouldStop(32);
_newsql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_status=1, execute_value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_val))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("															and inner_request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_unique_key))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(" ")));Debug.locals.put("NewSQL", _newsql);Debug.locals.put("NewSQL", _newsql);
 BA.debugLineNum = 3725;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 59:
//try
this.state = 64;
this.catchState = 63;
this.state = 61;
if (true) break;

case 61:
//C
this.state = 64;
this.catchState = 63;
 BA.debugLineNum = 3726;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(NewSQ";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_newsql));
 Debug.CheckDeviceExceptions();
if (true) break;

case 63:
//C
this.state = 64;
this.catchState = 0;
 BA.debugLineNum = 3728;BA.debugLine="Log($\"Erro de campo: ${LastException}\"";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286649",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 64:
//C
this.state = 119;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 65:
//C
this.state = 66;
Debug.locals.put("nii", _nii);
;
 if (true) break;

case 66:
//C
this.state = 95;
;
 BA.debugLineNum = 3732;BA.debugLine="Record99.Close";
Debug.ShouldStop(524288);
_record99.runVoidMethod ("Close");
 if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 3734;BA.debugLine="If (do_is_additional = 1) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 69:
//if
this.state = 80;
if ((RemoteObject.solveBoolean("=",_do_is_additional,BA.numberCast(double.class, 1)))) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 80;
 BA.debugLineNum = 3735;BA.debugLine="Dim ObjSQL As String = $\"select distinct";
Debug.ShouldStop(4194304);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct `value` from dta_objects_fields where object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttag))),RemoteObject.createImmutable("' and field_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable("'")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 3737;BA.debugLine="If Utils.FieldInList(do_field, \"address|";
Debug.ShouldStop(16777216);
if (true) break;

case 74:
//if
this.state = 79;
if (parent.mostCurrent._utils.runMethod(true,"_fieldinlist" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_do_field),(Object)(RemoteObject.createImmutable("address|address2|postalcode|phone|local|latitude|longitude|block|floor|door"))).<Boolean>get().booleanValue()) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 3739;BA.debugLine="Dim ObjSQL As String = $\"select distinc";
Debug.ShouldStop(67108864);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable(" as `value` from dta_locations where tagcode in\n"),RemoteObject.createImmutable("																	(select local_tagcode from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttag))),RemoteObject.createImmutable("')")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 3742;BA.debugLine="Dim ObjSQL As String = $\"select distinc";
Debug.ShouldStop(536870912);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable(" as `value` from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttag))),RemoteObject.createImmutable("'")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 79:
//C
this.state = 80;
;
 BA.debugLineNum = 3744;BA.debugLine="Log(ObjSQL)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286665",_objsql,0);
 if (true) break;

case 80:
//C
this.state = 81;
;
 BA.debugLineNum = 3747;BA.debugLine="Private Record99 As Cursor = Starter.Loca";
Debug.ShouldStop(4);
_record99 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record99 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_objsql)));Debug.locals.put("Record99", _record99);
 BA.debugLineNum = 3748;BA.debugLine="If Record99.RowCount > 0 Then";
Debug.ShouldStop(8);
if (true) break;

case 81:
//if
this.state = 94;
if (RemoteObject.solveBoolean(">",_record99.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 3749;BA.debugLine="For nii = 0 To Record99.RowCount-1";
Debug.ShouldStop(16);
if (true) break;

case 84:
//for
this.state = 93;
step208 = 1;
limit208 = RemoteObject.solve(new RemoteObject[] {_record99.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nii = 0 ;
Debug.locals.put("nii", _nii);
this.state = 120;
if (true) break;

case 120:
//C
this.state = 93;
if ((step208 > 0 && _nii <= limit208) || (step208 < 0 && _nii >= limit208)) this.state = 86;
if (true) break;

case 121:
//C
this.state = 120;
_nii = ((int)(0 + _nii + step208)) ;
Debug.locals.put("nii", _nii);
if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 3750;BA.debugLine="Record99.Position = nii";
Debug.ShouldStop(32);
_record99.runMethod(true,"setPosition",BA.numberCast(int.class, _nii));
 BA.debugLineNum = 3751;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty";
Debug.ShouldStop(64);
_val = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record99.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 3752;BA.debugLine="Dim NewSQL As String = $\"update dta_req";
Debug.ShouldStop(128);
_newsql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_status=1, execute_value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_val))),RemoteObject.createImmutable("', object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttag))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("															and inner_request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_unique_key))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(" ")));Debug.locals.put("NewSQL", _newsql);Debug.locals.put("NewSQL", _newsql);
 BA.debugLineNum = 3759;BA.debugLine="Log(NewSQL)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286680",_newsql,0);
 BA.debugLineNum = 3760;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 87:
//try
this.state = 92;
this.catchState = 91;
this.state = 89;
if (true) break;

case 89:
//C
this.state = 92;
this.catchState = 91;
 BA.debugLineNum = 3761;BA.debugLine="Utils.SaveSQLToLog(\"ListaPrincipal_Ite";
Debug.ShouldStop(65536);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ListaPrincipal_ItemClick")),(Object)(_newsql),(Object)(_tagcode));
 Debug.CheckDeviceExceptions();
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
 BA.debugLineNum = 3764;BA.debugLine="Log($\"Erro de campo: ${LastException}\"";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286685",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 92:
//C
this.state = 121;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 93:
//C
this.state = 94;
Debug.locals.put("nii", _nii);
;
 if (true) break;

case 94:
//C
this.state = 95;
;
 BA.debugLineNum = 3768;BA.debugLine="Record99.Close";
Debug.ShouldStop(8388608);
_record99.runVoidMethod ("Close");
 if (true) break;

case 95:
//C
this.state = 116;
;
 if (true) break;
if (true) break;

case 96:
//C
this.state = 97;
Debug.locals.put("ni", _ni);
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 BA.debugLineNum = 3773;BA.debugLine="Record9.Close";
Debug.ShouldStop(268435456);
_record9.runVoidMethod ("Close");
 if (true) break;

case 98:
//C
this.state = 99;
;
 BA.debugLineNum = 3776;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3777;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 99:
//try
this.state = 104;
this.catchState = 103;
this.state = 101;
if (true) break;

case 101:
//C
this.state = 104;
this.catchState = 103;
 BA.debugLineNum = 3778;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activi";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",objects.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_Activity")),(Object)((_cla)),(Object)((_name)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 103:
//C
this.state = 104;
this.catchState = 0;
 BA.debugLineNum = 3780;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6157286701",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3781;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 3782;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Sha";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Call StartCLA_Activity")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 104:
//C
this.state = 105;
this.catchState = 0;
;
 if (true) break;

case 105:
//C
this.state = 108;
;
 if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 3786;BA.debugLine="MakePreRequestTaskList(0, 0, 0, \"\", \"\", \"\")";
Debug.ShouldStop(512);
_makeprerequesttasklist(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.ObjectToString(""),BA.ObjectToString(""),RemoteObject.createImmutable(""));
 if (true) break;

case 108:
//C
this.state = 109;
;
 BA.debugLineNum = 3788;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 109:
//C
this.state = 112;
;
 if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 3791;BA.debugLine="MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo,";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectsavisopedidoseminfo /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),objects.processBA);
 if (true) break;

case 112:
//C
this.state = -1;
;
 BA.debugLineNum = 3793;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static RemoteObject  _listbutprerequestview_click() throws Exception{
try {
		Debug.PushSubsStack("listButPreRequestView_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3465);
if (RapidSub.canDelegate("listbutprerequestview_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutprerequestview_click");}
RemoteObject _bb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 3465;BA.debugLine="Sub listButPreRequestView_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 3466;BA.debugLine="Dim bb As Button = Sender";
Debug.ShouldStop(512);
_bb = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_bb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("bb", _bb);
 BA.debugLineNum = 3467;BA.debugLine="If Utils.NNE(bb.Tag) Then";
Debug.ShouldStop(1024);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(_bb.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3468;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
Debug.ShouldStop(2048);
objects.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._generalwaitplease /*RemoteObject*/ )),(Object)(objects.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3469;BA.debugLine="ShowRequestInfoDialog(bb.Tag, \"Informação do Ped";
Debug.ShouldStop(4096);
_showrequestinfodialog(BA.ObjectToString(_bb.runMethod(false,"getTag")),BA.ObjectToString("Informação do Pedido"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), objects.mostCurrent._listsbasepanel.getObject()));
 BA.debugLineNum = 3470;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8192);
objects.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 }else {
 BA.debugLineNum = 3472;BA.debugLine="MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo,";
Debug.ShouldStop(32768);
objects.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._objectsavisopedidoseminfo /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(objects.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),objects.processBA);
 };
 BA.debugLineNum = 3474;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutpreselect_click() throws Exception{
try {
		Debug.PushSubsStack("listButPreSelect_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3795);
if (RapidSub.canDelegate("listbutpreselect_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutpreselect_click");}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 3795;BA.debugLine="Sub listButPreSelect_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3796;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(524288);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 3797;BA.debugLine="btn = Sender";
Debug.ShouldStop(1048576);
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));
 BA.debugLineNum = 3799;BA.debugLine="If btn.Text = Chr(0xF046) Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_btn.runMethod(true,"getText"),BA.ObjectToString(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046)))))) { 
 BA.debugLineNum = 3800;BA.debugLine="btn.Text = Chr(0xF096)";
Debug.ShouldStop(8388608);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf096)))));
 }else {
 BA.debugLineNum = 3802;BA.debugLine="btn.Text = Chr(0xF046)";
Debug.ShouldStop(33554432);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046)))));
 };
 BA.debugLineNum = 3805;BA.debugLine="SetPreReqList";
Debug.ShouldStop(268435456);
_setprereqlist();
 BA.debugLineNum = 3807;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutpreselectall_click() throws Exception{
try {
		Debug.PushSubsStack("listButPreSelectAll_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3431);
if (RapidSub.canDelegate("listbutpreselectall_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutpreselectall_click");}
 BA.debugLineNum = 3431;BA.debugLine="Sub listButPreSelectAll_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 3432;BA.debugLine="If listButPreSelectAll.Text = Chr(0xF046) Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",objects.mostCurrent._listbutpreselectall.runMethod(true,"getText"),BA.ObjectToString(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046)))))) { 
 BA.debugLineNum = 3433;BA.debugLine="listButPreSelectAll.Text = Chr(0xF096)";
Debug.ShouldStop(256);
objects.mostCurrent._listbutpreselectall.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf096)))));
 BA.debugLineNum = 3434;BA.debugLine="SetAllPreReqSelect(False)";
Debug.ShouldStop(512);
_setallprereqselect(objects.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 3436;BA.debugLine="listButPreSelectAll.Text = Chr(0xF046)";
Debug.ShouldStop(2048);
objects.mostCurrent._listbutpreselectall.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046)))));
 BA.debugLineNum = 3437;BA.debugLine="SetAllPreReqSelect(True)";
Debug.ShouldStop(4096);
_setallprereqselect(objects.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 3439;BA.debugLine="SetPreReqList";
Debug.ShouldStop(16384);
_setprereqlist();
 BA.debugLineNum = 3440;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutrequest_click() throws Exception{
try {
		Debug.PushSubsStack("listButRequest_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1852);
if (RapidSub.canDelegate("listbutrequest_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutrequest_click");}
RemoteObject _bb = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 1852;BA.debugLine="Sub listButRequest_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1853;BA.debugLine="Dim bb As Button = Sender";
Debug.ShouldStop(268435456);
_bb = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_bb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("bb", _bb);
 BA.debugLineNum = 1854;BA.debugLine="SelObject = bb.Tag";
Debug.ShouldStop(536870912);
objects.mostCurrent._selobject = BA.ObjectToString(_bb.runMethod(false,"getTag"));
 BA.debugLineNum = 1855;BA.debugLine="noRequestPanel.Visible = True";
Debug.ShouldStop(1073741824);
objects.mostCurrent._norequestpanel.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1856;BA.debugLine="CLARequestList.Clear";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._clarequestlist.runVoidMethod ("_clear");
 BA.debugLineNum = 1857;BA.debugLine="MakeTaskList(0, SelObject)";
Debug.ShouldStop(1);
_maketasklist(BA.numberCast(int.class, 0),objects.mostCurrent._selobject);
 BA.debugLineNum = 1858;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutselect_click() throws Exception{
try {
		Debug.PushSubsStack("listButSelect_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1860);
if (RapidSub.canDelegate("listbutselect_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listbutselect_click");}
RemoteObject _thsibut = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ival = RemoteObject.createImmutable(0);
 BA.debugLineNum = 1860;BA.debugLine="Sub listButSelect_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 1861;BA.debugLine="Dim thsibut As Button = Sender";
Debug.ShouldStop(16);
_thsibut = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_thsibut = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), objects.mostCurrent.__c.runMethod(false,"Sender",objects.mostCurrent.activityBA));Debug.locals.put("thsibut", _thsibut);
 BA.debugLineNum = 1862;BA.debugLine="Dim lst As List = Regex.Split(\"\\|\", thsibut.Tag)";
Debug.ShouldStop(32);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = objects.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(objects.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_thsibut.runMethod(false,"getTag"))))));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1863;BA.debugLine="If (lst.Size > 0) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean(">",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1864;BA.debugLine="Dim ival As Int = lst.Get(1)";
Debug.ShouldStop(128);
_ival = BA.numberCast(int.class, _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("ival", _ival);Debug.locals.put("ival", _ival);
 BA.debugLineNum = 1865;BA.debugLine="If (ival = 0) Then";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("=",_ival,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 1866;BA.debugLine="thsibut.Tag = $\"${lst.Get(0)}|1\"$";
Debug.ShouldStop(512);
_thsibut.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),RemoteObject.createImmutable("|1")))));
 BA.debugLineNum = 1868;BA.debugLine="thsibut.TextColor = Consts.ColorRed";
Debug.ShouldStop(2048);
_thsibut.runMethod(true,"setTextColor",objects.mostCurrent._consts._colorred /*RemoteObject*/ );
 BA.debugLineNum = 1869;BA.debugLine="SelectedObjectsCount = SelectedObjectsCount + 1";
Debug.ShouldStop(4096);
objects._selectedobjectscount = RemoteObject.solve(new RemoteObject[] {objects._selectedobjectscount,RemoteObject.createImmutable(1)}, "+",1, 1);
 }else {
 BA.debugLineNum = 1871;BA.debugLine="thsibut.Tag = $\"${lst.Get(0)}|0\"$";
Debug.ShouldStop(16384);
_thsibut.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),RemoteObject.createImmutable("|0")))));
 BA.debugLineNum = 1874;BA.debugLine="thsibut.TextColor = 0xFFBEBEBE";
Debug.ShouldStop(131072);
_thsibut.runMethod(true,"setTextColor",BA.numberCast(int.class, 0xffbebebe));
 BA.debugLineNum = 1875;BA.debugLine="SelectedObjectsCount = SelectedObjectsCount - 1";
Debug.ShouldStop(262144);
objects._selectedobjectscount = RemoteObject.solve(new RemoteObject[] {objects._selectedobjectscount,RemoteObject.createImmutable(1)}, "-",1, 1);
 };
 BA.debugLineNum = 1877;BA.debugLine="Log(thsibut.Tag)";
Debug.ShouldStop(1048576);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6155123729",BA.ObjectToString(_thsibut.runMethod(false,"getTag")),0);
 };
 BA.debugLineNum = 1879;BA.debugLine="UpdateExtraButtons";
Debug.ShouldStop(4194304);
_updateextrabuttons();
 BA.debugLineNum = 1880;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listcontracts_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listContracts_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1019);
if (RapidSub.canDelegate("listcontracts_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listcontracts_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1019;BA.debugLine="Sub listContracts_ItemClick (Index As Int, Value A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1021;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitempanel_click() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,839);
if (RapidSub.canDelegate("listitempanel_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listitempanel_click");}
 BA.debugLineNum = 839;BA.debugLine="Sub ListItemPanel_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 841;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitempanel_longclick() throws Exception{
try {
		Debug.PushSubsStack("ListItemPanel_LongClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,891);
if (RapidSub.canDelegate("listitempanel_longclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listitempanel_longclick");}
 BA.debugLineNum = 891;BA.debugLine="Sub ListItemPanel_LongClick";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 893;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemselected(RemoteObject _pan) throws Exception{
try {
		Debug.PushSubsStack("ListItemSelected (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,966);
if (RapidSub.canDelegate("listitemselected")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listitemselected", _pan);}
int _index = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 966;BA.debugLine="Sub ListItemSelected(pan As Panel)";
Debug.ShouldStop(32);
 BA.debugLineNum = 967;BA.debugLine="For index= 0 To listObjects.GetSize-1";
Debug.ShouldStop(64);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._listobjects.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_index = 0 ;
for (;(step1 > 0 && _index <= limit1) || (step1 < 0 && _index >= limit1) ;_index = ((int)(0 + _index + step1))  ) {
Debug.locals.put("index", _index);
 BA.debugLineNum = 968;BA.debugLine="Dim p As Panel = listObjects.GetPanel(index)";
Debug.ShouldStop(128);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listobjects.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _index))).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 969;BA.debugLine="p.Color = Consts.ColorWhite";
Debug.ShouldStop(256);
_p.runVoidMethod ("setColor",objects.mostCurrent._consts._colorwhite /*RemoteObject*/ );
 }
}Debug.locals.put("index", _index);
;
 BA.debugLineNum = 971;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
Debug.ShouldStop(1024);
_pan.runVoidMethod ("setColor",objects.mostCurrent._consts._colorciansoftlight /*RemoteObject*/ );
 BA.debugLineNum = 972;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(2048);
_windowstatusupdate();
 BA.debugLineNum = 973;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listitemslistclearselection() throws Exception{
try {
		Debug.PushSubsStack("ListItemsListClearSelection (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3362);
if (RapidSub.canDelegate("listitemslistclearselection")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listitemslistclearselection");}
int _n = 0;
RemoteObject _pan = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 3362;BA.debugLine="Sub ListItemsListClearSelection";
Debug.ShouldStop(2);
 BA.debugLineNum = 3363;BA.debugLine="For n=0 To CLARequestList.Size-1";
Debug.ShouldStop(4);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._clarequestlist.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
for (;(step1 > 0 && _n <= limit1) || (step1 < 0 && _n >= limit1) ;_n = ((int)(0 + _n + step1))  ) {
Debug.locals.put("n", _n);
 BA.debugLineNum = 3364;BA.debugLine="Dim pan As B4XView = CLARequestList.GetPanel(n)";
Debug.ShouldStop(8);
_pan = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_pan = objects.mostCurrent._clarequestlist.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _n)));Debug.locals.put("pan", _pan);Debug.locals.put("pan", _pan);
 BA.debugLineNum = 3365;BA.debugLine="If Utils.NNE(pan.tag) Then";
Debug.ShouldStop(16);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(_pan.runMethod(false,"getTag")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3367;BA.debugLine="pan.Color = 0xFFFFFFFF";
Debug.ShouldStop(64);
_pan.runMethod(true,"setColor",BA.numberCast(int.class, 0xffffffff));
 };
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 3370;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listobjects_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listObjects_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,975);
if (RapidSub.canDelegate("listobjects_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listobjects_itemclick", _index, _value);}
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 975;BA.debugLine="Sub listObjects_ItemClick (Index As Int, Value As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 976;BA.debugLine="CurrentLineItem = Index + 1";
Debug.ShouldStop(32768);
objects._currentlineitem = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 977;BA.debugLine="Dim pnl As Panel = listObjects.GetPanel(Index)";
Debug.ShouldStop(65536);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listobjects.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 978;BA.debugLine="CallSubDelayed2(ObjectEdit, \"StartObjectActivity\"";
Debug.ShouldStop(131072);
objects.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",objects.processBA,(Object)((objects.mostCurrent._objectedit.getObject())),(Object)(BA.ObjectToString("StartObjectActivity")),(Object)(_pnl.runMethod(false,"getTag")));
 BA.debugLineNum = 979;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(262144);
objects.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 980;BA.debugLine="ListItemSelected(pnl)";
Debug.ShouldStop(524288);
_listitemselected(_pnl);
 BA.debugLineNum = 981;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listobjects_reachend() throws Exception{
try {
		Debug.PushSubsStack("listObjects_ReachEnd (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1188);
if (RapidSub.canDelegate("listobjects_reachend")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listobjects_reachend");}
 BA.debugLineNum = 1188;BA.debugLine="Sub listObjects_ReachEnd";
Debug.ShouldStop(8);
 BA.debugLineNum = 1189;BA.debugLine="If Not(NextStartingRow = StartingRow) Then";
Debug.ShouldStop(16);
if (objects.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",objects._nextstartingrow,BA.numberCast(double.class, objects._startingrow))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1190;BA.debugLine="StartingRow = NextStartingRow";
Debug.ShouldStop(32);
objects._startingrow = objects._nextstartingrow;
 BA.debugLineNum = 1191;BA.debugLine="StartObjectsActivity(False, CurrentFilter)";
Debug.ShouldStop(64);
_startobjectsactivity(objects.mostCurrent.__c.getField(true,"False"),objects.mostCurrent._currentfilter);
 };
 BA.debugLineNum = 1193;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listpedidosbuttonmap_click() throws Exception{
try {
		Debug.PushSubsStack("listPedidosButtonMap_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,903);
if (RapidSub.canDelegate("listpedidosbuttonmap_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listpedidosbuttonmap_click");}
 BA.debugLineNum = 903;BA.debugLine="Sub listPedidosButtonMap_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 904;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 905;BA.debugLine="If ShowListPedidosMap Then";
Debug.ShouldStop(256);
if (objects._showlistpedidosmap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 906;BA.debugLine="ShowListPedidosMap = False";
Debug.ShouldStop(512);
objects._showlistpedidosmap = objects.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 907;BA.debugLine="mapBaseList.Visible = False";
Debug.ShouldStop(1024);
objects.mostCurrent._mapbaselist.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 908;BA.debugLine="listPedidosButtonMap.Color = Colors.ARGB(150, 7";
Debug.ShouldStop(2048);
objects.mostCurrent._listpedidosbuttonmap.runVoidMethod ("setColor",objects.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 167)),(Object)(BA.numberCast(int.class, 247))));
 BA.debugLineNum = 909;BA.debugLine="listPedidosButtonMap.Left = 10dip";
Debug.ShouldStop(4096);
objects.mostCurrent._listpedidosbuttonmap.runMethod(true,"setLeft",objects.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10))));
 }else {
 BA.debugLineNum = 911;BA.debugLine="ShowListPedidosMap = True";
Debug.ShouldStop(16384);
objects._showlistpedidosmap = objects.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 912;BA.debugLine="mapBaseList.Visible = True";
Debug.ShouldStop(32768);
objects.mostCurrent._mapbaselist.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 913;BA.debugLine="listPedidosButtonMap.Color = Colors.ARGB(150, 7";
Debug.ShouldStop(65536);
objects.mostCurrent._listpedidosbuttonmap.runVoidMethod ("setColor",objects.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 7)),(Object)(BA.numberCast(int.class, 119)),(Object)(BA.numberCast(int.class, 167))));
 BA.debugLineNum = 914;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(131072);
if (objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 915;BA.debugLine="listPedidosButtonMap.Left = 33.33%x";
Debug.ShouldStop(262144);
objects.mostCurrent._listpedidosbuttonmap.runMethod(true,"setLeft",objects.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 33.33)),objects.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 917;BA.debugLine="listPedidosButtonMap.Left = 310dip";
Debug.ShouldStop(1048576);
objects.mostCurrent._listpedidosbuttonmap.runMethod(true,"setLeft",objects.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 310))));
 };
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e18) {
			BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e18.toString()); BA.debugLineNum = 922;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6152567827",BA.ObjectToString(objects.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 923;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(67108864);
objects.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(objects.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 };
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listpedidosmap_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listPedidosMap_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,928);
if (RapidSub.canDelegate("listpedidosmap_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listpedidosmap_itemclick", _index, _value);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lat = RemoteObject.createImmutable("");
RemoteObject _lon = RemoteObject.createImmutable("");
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 928;BA.debugLine="Sub listPedidosMap_ItemClick (Index As Int, Value";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 929;BA.debugLine="Log(Value)";
Debug.ShouldStop(1);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6152633345",BA.ObjectToString(_value),0);
 BA.debugLineNum = 931;BA.debugLine="Dim p As Panel  = listPedidosMap.GetPanel(Index)";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listpedidosmap.runMethod(false,"_getpanel",(Object)(_index)).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 932;BA.debugLine="Dim name As Label = p.GetView(0)";
Debug.ShouldStop(8);
_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
_name = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.LabelWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("name", _name);
 BA.debugLineNum = 933;BA.debugLine="Dim lst As List = Regex.Split(\"\\|\", name.Tag)";
Debug.ShouldStop(16);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst = objects.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(objects.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(BA.ObjectToString(_name.runMethod(false,"getTag"))))));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 935;BA.debugLine="If (lst.Size >= 1) Then";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean("g",_lst.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 936;BA.debugLine="Dim lat As String = lst.Get(0)";
Debug.ShouldStop(128);
_lat = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("lat", _lat);Debug.locals.put("lat", _lat);
 BA.debugLineNum = 937;BA.debugLine="Dim lon As String = lst.Get(1)";
Debug.ShouldStop(256);
_lon = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("lon", _lon);Debug.locals.put("lon", _lon);
 BA.debugLineNum = 939;BA.debugLine="If Not(Utils.isNullOrEmpty(lat)) And Not(Utils.i";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_lat))))) && RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_lon)))))) { 
 BA.debugLineNum = 940;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(2048);
if (objects.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 941;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(4096);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 943;BA.debugLine="cp.Initialize(lst.Get(0), lst.Get(1), 17)";
Debug.ShouldStop(16384);
_cp.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(double.class, _lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 944;BA.debugLine="gmap.MoveCamera(cp)";
Debug.ShouldStop(32768);
objects.mostCurrent._gmap.runVoidMethod ("MoveCamera",(Object)((_cp.getObject())));
 };
 };
 };
 BA.debugLineNum = 948;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonadd_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonAdd_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,835);
if (RapidSub.canDelegate("listsbuttonadd_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listsbuttonadd_click");}
 BA.debugLineNum = 835;BA.debugLine="Sub listsButtonAdd_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonclose_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonClose_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,823);
if (RapidSub.canDelegate("listsbuttonclose_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listsbuttonclose_click");}
 BA.debugLineNum = 823;BA.debugLine="Sub listsButtonClose_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 824;BA.debugLine="Log(\"Back OBJECTS\")";
Debug.ShouldStop(8388608);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6152043521",RemoteObject.createImmutable("Back OBJECTS"),0);
 BA.debugLineNum = 825;BA.debugLine="Starter.ObjectKeepFilter  = True";
Debug.ShouldStop(16777216);
objects.mostCurrent._starter._objectkeepfilter /*RemoteObject*/  = objects.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 826;BA.debugLine="Starter.ObjectSearchFilter = SearchFilter";
Debug.ShouldStop(33554432);
objects.mostCurrent._starter._objectsearchfilter /*RemoteObject*/  = objects.mostCurrent._searchfilter;
 BA.debugLineNum = 827;BA.debugLine="Starter.ObjectFilter = Types.MakeObjectFilter(iDi";
Debug.ShouldStop(67108864);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/  = objects.mostCurrent._types.runMethod(false,"_makeobjectfilter" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects._idialogreqtypeobject),(Object)(objects._idialogreqzone),(Object)(objects._idialogreqstatus),(Object)(objects._idialogreqregion),(Object)(objects._idialogreqlocal),(Object)(objects.mostCurrent._sdialogreqname),(Object)(objects.mostCurrent._sdialogreqaddress),(Object)(objects._idialogreqwithrequests));
 BA.debugLineNum = 830;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
Debug.ShouldStop(536870912);
objects.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",objects.processBA,(Object)((objects.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("ListsReturn")),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 831;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1073741824);
objects.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 832;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._sharecode.runVoidMethod ("_setanimation" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("zoom_enter")),(Object)(RemoteObject.createImmutable("zoom_exit")));
 BA.debugLineNum = 833;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonfilter_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonFilter_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,895);
if (RapidSub.canDelegate("listsbuttonfilter_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listsbuttonfilter_click");}
RemoteObject _filter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.appdialogs");
RemoteObject _curr = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectfilter");
 BA.debugLineNum = 895;BA.debugLine="Sub listsButtonFilter_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 896;BA.debugLine="Dim Filter As AppDialogs";
Debug.ShouldStop(-2147483648);
_filter = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.appdialogs");Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 897;BA.debugLine="Filter.Initialize";
Debug.ShouldStop(1);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_initialize" /*RemoteObject*/ ,objects.mostCurrent.activityBA);
 BA.debugLineNum = 898;BA.debugLine="Dim Curr As ObjectFilter = Types.MakeObjectFilter";
Debug.ShouldStop(2);
_curr = objects.mostCurrent._types.runMethod(false,"_makeobjectfilter" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects._idialogreqtypeobject),(Object)(objects._idialogreqzone),(Object)(objects._idialogreqstatus),(Object)(objects._idialogreqregion),(Object)(objects._idialogreqlocal),(Object)(objects.mostCurrent._sdialogreqname),(Object)(objects.mostCurrent._sdialogreqaddress),(Object)(objects._idialogreqwithrequests));Debug.locals.put("Curr", _curr);Debug.locals.put("Curr", _curr);
 BA.debugLineNum = 900;BA.debugLine="Filter.GetObjectFilterDialog(\"objects\", Curr, Typ";
Debug.ShouldStop(8);
_filter.runClassMethod (xevolution.vrcg.devdemov2400.appdialogs.class, "_getobjectfilterdialog" /*void*/ ,(Object)(RemoteObject.createImmutable(("objects"))),(Object)(_curr),(Object)(objects.mostCurrent._typeobjectslist),(Object)(objects.mostCurrent._regionslist),(Object)(objects.mostCurrent._localslist));
 BA.debugLineNum = 901;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listsbuttonzone_click() throws Exception{
try {
		Debug.PushSubsStack("listsButtonZone_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1127);
if (RapidSub.canDelegate("listsbuttonzone_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","listsbuttonzone_click");}
 BA.debugLineNum = 1127;BA.debugLine="Sub listsButtonZone_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 1128;BA.debugLine="ObjectZonePopMenu.OpenMenu";
Debug.ShouldStop(128);
objects.mostCurrent._objectzonepopmenu.runVoidMethod ("_openmenu");
 BA.debugLineNum = 1129;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _liststabpanel_pageselected(RemoteObject _position) throws Exception{
try {
		Debug.PushSubsStack("listsTabPanel_PageSelected (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,819);
if (RapidSub.canDelegate("liststabpanel_pageselected")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","liststabpanel_pageselected", _position);}
Debug.locals.put("Position", _position);
 BA.debugLineNum = 819;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 821;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainlogo_click() throws Exception{
try {
		Debug.PushSubsStack("mainLogo_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1119);
if (RapidSub.canDelegate("mainlogo_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mainlogo_click");}
 BA.debugLineNum = 1119;BA.debugLine="Sub mainLogo_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1120;BA.debugLine="listsButtonClose_Click";
Debug.ShouldStop(-2147483648);
_listsbuttonclose_click();
 BA.debugLineNum = 1121;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makelistsearch(RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("MakeListSearch (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1110);
if (RapidSub.canDelegate("makelistsearch")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","makelistsearch", _search);}
RemoteObject _filter = RemoteObject.createImmutable("");
Debug.locals.put("search", _search);
 BA.debugLineNum = 1110;BA.debugLine="Sub MakeListSearch(search As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1112;BA.debugLine="Dim Filter As String = $\"b.title||a.tagcode||a.ti";
Debug.ShouldStop(8388608);
_filter = (RemoteObject.concat(RemoteObject.createImmutable("b.title||a.tagcode||a.title_import||c.address||c.postalcode||c.local||ifnull(d.title_import,'')||ifnull(a.reference,'')||ifnull(d.reference,'') like '%"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%'")));Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1114;BA.debugLine="SearchFilter = Filter";
Debug.ShouldStop(33554432);
objects.mostCurrent._searchfilter = _filter;
 BA.debugLineNum = 1115;BA.debugLine="IsFiltered = (Filter <> \"\")";
Debug.ShouldStop(67108864);
objects._isfiltered = BA.ObjectToBoolean((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1116;BA.debugLine="StartObjectsActivity(True, Filter)";
Debug.ShouldStop(134217728);
_startobjectsactivity(objects.mostCurrent.__c.getField(true,"True"),_filter);
 BA.debugLineNum = 1117;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makelistsearchprerequest(RemoteObject _search) throws Exception{
try {
		Debug.PushSubsStack("MakeListSearchPreRequest (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3421);
if (RapidSub.canDelegate("makelistsearchprerequest")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","makelistsearchprerequest", _search);}
RemoteObject _filter = RemoteObject.createImmutable("");
Debug.locals.put("search", _search);
 BA.debugLineNum = 3421;BA.debugLine="Sub MakeListSearchPreRequest(search As String)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 3422;BA.debugLine="Dim Filter As String = $\" and (ifnull(e.title, ''";
Debug.ShouldStop(536870912);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(" and (ifnull(e.title, '')||ifnull(a.execute_date, '')||ifnull(b.title_import,'')||ifnull(b.details,'')||ifnull(b.reference,'')||ifnull(a.local_tagcode, '')||ifnull(cc.address, '')||ifnull(cc.address2, '')||ifnull(cc.postalcode, '')||ifnull(cc.`local`, '')||ifnull(cc.latitude, '')||ifnull(cc.longitude, '')||ifnull(b2.title_import,'') like '%"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_search))),RemoteObject.createImmutable("%') ")));Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 3423;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
Debug.ShouldStop(1073741824);
_makeprerequesttasklist(objects._cumulativetyperequest,objects._cumulativedistrict,objects._cumulativecounty,objects.mostCurrent._cumulativedatein,objects.mostCurrent._cumulativedateout,_filter);
 BA.debugLineNum = 3424;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makeprerequesttasklist(RemoteObject _index,RemoteObject _district,RemoteObject _county,RemoteObject _datein,RemoteObject _dateout,RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("MakePreRequestTaskList (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1195);
if (RapidSub.canDelegate("makeprerequesttasklist")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","makeprerequesttasklist", _index, _district, _county, _datein, _dateout, _filter);}
Debug.locals.put("Index", _index);
Debug.locals.put("district", _district);
Debug.locals.put("county", _county);
Debug.locals.put("DateIn", _datein);
Debug.locals.put("DateOut", _dateout);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 1195;BA.debugLine="Sub MakePreRequestTaskList(Index As Int, district";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1247;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _maketasklist(RemoteObject _index,RemoteObject _theobject) throws Exception{
try {
		Debug.PushSubsStack("MakeTaskList (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1882);
if (RapidSub.canDelegate("maketasklist")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","maketasklist", _index, _theobject);}
RemoteObject _sqlevc = RemoteObject.createImmutable("");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _totallineitemscl = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _canadd = RemoteObject.createImmutable(false);
RemoteObject _pp = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("theObject", _theobject);
 BA.debugLineNum = 1882;BA.debugLine="Sub MakeTaskList(Index As Int, theObject As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1884;BA.debugLine="Dim SQLEVC As String = $\"SELECT a.tagcode, a.grou";
Debug.ShouldStop(134217728);
_sqlevc = (RemoteObject.concat(RemoteObject.createImmutable("SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc,\n"),RemoteObject.createImmutable("								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,\n"),RemoteObject.createImmutable("								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode \n"),RemoteObject.createImmutable("								FROM dta_typerequests AS a\n"),RemoteObject.createImmutable("								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) \n"),RemoteObject.createImmutable("								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)\n"),RemoteObject.createImmutable("								WHERE  1=1 \n"),RemoteObject.createImmutable("								and a.active=1\n"),RemoteObject.createImmutable("								and a.published=1 and a.is_internal=0 \n"),RemoteObject.createImmutable("								order by a.title")));Debug.locals.put("SQLEVC", _sqlevc);Debug.locals.put("SQLEVC", _sqlevc);
 BA.debugLineNum = 1917;BA.debugLine="Dim height As Int = 45dip";
Debug.ShouldStop(268435456);
_height = objects.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 45)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 1918;BA.debugLine="Dim TotalLineItemsCL As Int = 0";
Debug.ShouldStop(536870912);
_totallineitemscl = BA.numberCast(int.class, 0);Debug.locals.put("TotalLineItemsCL", _totallineitemscl);Debug.locals.put("TotalLineItemsCL", _totallineitemscl);
 BA.debugLineNum = 1919;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
Debug.ShouldStop(1073741824);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), objects.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sqlevc)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 1920;BA.debugLine="Do While Record.NextRow";
Debug.ShouldStop(-2147483648);
while (_record.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
 BA.debugLineNum = 1921;BA.debugLine="If Utils.NNE(Record.GetString(\"tagcode\")) Then";
Debug.ShouldStop(1);
if (objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1922;BA.debugLine="Log(ItemsCounter)";
Debug.ShouldStop(2);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6155189288",BA.NumberToString(objects._itemscounter),0);
 BA.debugLineNum = 1923;BA.debugLine="Dim CanAdd As Boolean = True";
Debug.ShouldStop(4);
_canadd = objects.mostCurrent.__c.getField(true,"True");Debug.locals.put("CanAdd", _canadd);Debug.locals.put("CanAdd", _canadd);
 BA.debugLineNum = 1924;BA.debugLine="Try";
Debug.ShouldStop(8);
try { BA.debugLineNum = 1925;BA.debugLine="Dim pp As Panel =  CreateRequestListItem(Items";
Debug.ShouldStop(16);
_pp = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pp = _createrequestlistitem(objects._itemscounter,_record,objects.mostCurrent._clarequestlist.runMethod(false,"_asview").runMethod(true,"getWidth"),_height,_theobject);Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e12.toString()); BA.debugLineNum = 1927;BA.debugLine="Log(LastException)";
Debug.ShouldStop(64);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6155189293",BA.ObjectToString(objects.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1928;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(128);
objects.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(objects.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 1929;BA.debugLine="CanAdd = False";
Debug.ShouldStop(256);
_canadd = objects.mostCurrent.__c.getField(true,"False");Debug.locals.put("CanAdd", _canadd);
 };
 BA.debugLineNum = 1931;BA.debugLine="If (CanAdd) Then";
Debug.ShouldStop(1024);
if ((_canadd).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1932;BA.debugLine="TotalLineItemsCL = TotalLineItemsCL +1";
Debug.ShouldStop(2048);
_totallineitemscl = RemoteObject.solve(new RemoteObject[] {_totallineitemscl,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("TotalLineItemsCL", _totallineitemscl);
 BA.debugLineNum = 1933;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(4096);
objects._itemscounter = RemoteObject.solve(new RemoteObject[] {objects._itemscounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1934;BA.debugLine="CLARequestList.Add(pp, \"\")";
Debug.ShouldStop(8192);
objects.mostCurrent._clarequestlist.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _pp.getObject()),(Object)((RemoteObject.createImmutable(""))));
 };
 };
 }
;
 BA.debugLineNum = 1938;BA.debugLine="Record.Close";
Debug.ShouldStop(131072);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 1939;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapdata_click(RemoteObject _point) throws Exception{
try {
		Debug.PushSubsStack("mapData_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1179);
if (RapidSub.canDelegate("mapdata_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mapdata_click", _point);}
Debug.locals.put("Point", _point);
 BA.debugLineNum = 1179;BA.debugLine="Sub mapData_Click (Point As LatLng)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 1181;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapdata_markerclick(RemoteObject _selectedmarker) throws Exception{
try {
		Debug.PushSubsStack("mapData_MarkerClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1184);
if (RapidSub.canDelegate("mapdata_markerclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mapdata_markerclick", _selectedmarker);}
Debug.locals.put("SelectedMarker", _selectedmarker);
 BA.debugLineNum = 1184;BA.debugLine="Sub mapData_MarkerClick (SelectedMarker As Marker)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1186;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _mapdata_ready() throws Exception{
try {
		Debug.PushSubsStack("mapData_Ready (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1165);
if (RapidSub.canDelegate("mapdata_ready")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mapdata_ready"); return;}
ResumableSub_mapData_Ready rsub = new ResumableSub_mapData_Ready(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_mapData_Ready extends BA.ResumableSub {
public ResumableSub_mapData_Ready(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("mapData_Ready (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1165);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1166;BA.debugLine="gmap = mapData.GetMap";
Debug.ShouldStop(8192);
parent.mostCurrent._gmap = parent.mostCurrent._mapdata.runMethod(false,"GetMap");
 BA.debugLineNum = 1168;BA.debugLine="If gmap.IsInitialized Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._gmap.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1169;BA.debugLine="Do While gmap.MyLocation.IsInitialized = False";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//do while
this.state = 7;
while (RemoteObject.solveBoolean("=",parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"IsInitialized"),parent.mostCurrent.__c.getField(true,"False"))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
 BA.debugLineNum = 1170;BA.debugLine="Sleep(100)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "mapdata_ready"),BA.numberCast(int.class, 100));
this.state = 9;
return;
case 9:
//C
this.state = 4;
;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1173;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(1048576);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 1174;BA.debugLine="cp.Initialize(gmap.MyLocation.Latitude, gmap.MyL";
Debug.ShouldStop(2097152);
_cp.runVoidMethod ("Initialize",(Object)(parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude")),(Object)(parent.mostCurrent._gmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude")),(Object)(BA.numberCast(float.class, 17)));
 BA.debugLineNum = 1175;BA.debugLine="gmap.MoveCamera(cp)";
Debug.ShouldStop(4194304);
parent.mostCurrent._gmap.runVoidMethod ("MoveCamera",(Object)((_cp.getObject())));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _mapuserposition_click() throws Exception{
try {
		Debug.PushSubsStack("mapUserPosition_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1123);
if (RapidSub.canDelegate("mapuserposition_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mapuserposition_click");}
 BA.debugLineNum = 1123;BA.debugLine="Sub mapUserPosition_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1125;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapzoomdown_click() throws Exception{
try {
		Debug.PushSubsStack("mapZoomDown_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,954);
if (RapidSub.canDelegate("mapzoomdown_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mapzoomdown_click");}
 BA.debugLineNum = 954;BA.debugLine="Sub mapZoomDown_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 956;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapzoomup_click() throws Exception{
try {
		Debug.PushSubsStack("mapZoomUp_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,950);
if (RapidSub.canDelegate("mapzoomup_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","mapzoomup_click");}
 BA.debugLineNum = 950;BA.debugLine="Sub mapZoomUp_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 952;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _norequestpanel_click() throws Exception{
try {
		Debug.PushSubsStack("noRequestPanel_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3372);
if (RapidSub.canDelegate("norequestpanel_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","norequestpanel_click");}
 BA.debugLineNum = 3372;BA.debugLine="Sub noRequestPanel_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 3374;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objecttypepopmenu_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("ObjectTypePopMenu_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1131);
if (RapidSub.canDelegate("objecttypepopmenu_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","objecttypepopmenu_click", _menuname);}
RemoteObject _bt = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objecttypes");
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1131;BA.debugLine="Sub ObjectTypePopMenu_Click(MenuName As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1132;BA.debugLine="Dim bt As ObjectTypes = Types.ObjectTypesInList(T";
Debug.ShouldStop(2048);
_bt = objects.mostCurrent._types.runMethod(false,"_objecttypesinlist" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._typeobjectslist),(Object)(_menuname));Debug.locals.put("bt", _bt);Debug.locals.put("bt", _bt);
 BA.debugLineNum = 1133;BA.debugLine="Starter.ObjectFilter.TypeObject = bt.id 'TypeObje";
Debug.ShouldStop(4096);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("TypeObject" /*RemoteObject*/ ,_bt.getField(true,"id" /*RemoteObject*/ ));
 BA.debugLineNum = 1134;BA.debugLine="SetTheFilters(Starter.ObjectFilter)";
Debug.ShouldStop(8192);
_setthefilters(objects.mostCurrent._starter._objectfilter /*RemoteObject*/ );
 BA.debugLineNum = 1135;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _objectzonepopmenu_click(RemoteObject _menuname) throws Exception{
try {
		Debug.PushSubsStack("ObjectZonePopMenu_Click (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1137);
if (RapidSub.canDelegate("objectzonepopmenu_click")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","objectzonepopmenu_click", _menuname);}
Debug.locals.put("MenuName", _menuname);
 BA.debugLineNum = 1137;BA.debugLine="Sub ObjectZonePopMenu_Click(MenuName As String)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1138;BA.debugLine="Starter.ObjectFilter.ZoneObject = Types.ZONEOBJEC";
Debug.ShouldStop(131072);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("ZoneObject" /*RemoteObject*/ ,objects.mostCurrent._types._zoneobjectsfilter /*RemoteObject*/ .runMethod(true,"IndexOf",(Object)((_menuname))));
 BA.debugLineNum = 1139;BA.debugLine="SetTheFilters(Starter.ObjectFilter)";
Debug.ShouldStop(262144);
_setthefilters(objects.mostCurrent._starter._objectfilter /*RemoteObject*/ );
 BA.debugLineNum = 1140;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim FocusedMarker, Marker1 As Marker";
objects._focusedmarker = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper");
objects._marker1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Public Device As Phone";
objects._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 12;BA.debugLine="Dim TileSource As String";
objects._tilesource = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim ZoomLevel As Int";
objects._zoomlevel = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 14;BA.debugLine="Dim Markers As List";
objects._markers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 15;BA.debugLine="Dim MapFirstTime As Boolean";
objects._mapfirsttime = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 16;BA.debugLine="Private MyPositionLat, MyPositionLon As String";
objects._mypositionlat = RemoteObject.createImmutable("");
objects._mypositionlon = RemoteObject.createImmutable("");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _runthischecklist(RemoteObject _newrequest) throws Exception{
try {
		Debug.PushSubsStack("RunThisChecklist (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2553);
if (RapidSub.canDelegate("runthischecklist")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","runthischecklist", _newrequest); return;}
ResumableSub_RunThisChecklist rsub = new ResumableSub_RunThisChecklist(null,_newrequest);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RunThisChecklist extends BA.ResumableSub {
public ResumableSub_RunThisChecklist(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _newrequest) {
this.parent = parent;
this._newrequest = _newrequest;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _newrequest;
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _incolitems = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _tasktype = RemoteObject.createImmutable(0);
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _actionkey = RemoteObject.createImmutable("");
RemoteObject _task = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _object_tagcode = RemoteObject.createImmutable("");
RemoteObject _request_type = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _sdate = RemoteObject.createImmutable("");
RemoteObject _stime = RemoteObject.createImmutable("");
RemoteObject _close_type = RemoteObject.createImmutable(0);
RemoteObject _result_type = RemoteObject.createImmutable(0);
RemoteObject _result_values = RemoteObject.createImmutable("");
RemoteObject _repeatcounter = RemoteObject.createImmutable(0);
RemoteObject _clainfo = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requesttaskinfo");
RemoteObject _cla = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._requestcla");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _object_type = RemoteObject.createImmutable("");
RemoteObject _resa2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _resfieldsok2 = RemoteObject.createImmutable(false);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _res1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished1 = RemoteObject.createImmutable(false);
RemoteObject _tr_is_model = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunThisChecklist (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2553);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("newRequest", _newrequest);
 BA.debugLineNum = 2555;BA.debugLine="ProgressDialogShow(ShareCode.objectMsgPrepararInt";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*RemoteObject*/ )));
 BA.debugLineNum = 2556;BA.debugLine="Sleep(100)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"),BA.numberCast(int.class, 100));
this.state = 31;
return;
case 31:
//C
this.state = 1;
;
 BA.debugLineNum = 2558;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQU";
Debug.ShouldStop(536870912);
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*RemoteObject*/ ;Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2559;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newR";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ssql))),RemoteObject.createImmutable(" and z.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_newrequest))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2560;BA.debugLine="Log(sSQL)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106759",_ssql,0);
 BA.debugLineNum = 2561;BA.debugLine="Log(newRequest)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106760",_newrequest,0);
 BA.debugLineNum = 2565;BA.debugLine="Private incolitems As Cursor";
Debug.ShouldStop(16);
_incolitems = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("incolitems", _incolitems);
 BA.debugLineNum = 2566;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(32);
_incolitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 2567;BA.debugLine="If (incolitems.RowCount >= 1) Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 30;
if ((RemoteObject.solveBoolean("g",_incolitems.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 3;
}else {
this.state = 29;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2568;BA.debugLine="incolitems.Position = 0";
Debug.ShouldStop(128);
_incolitems.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 2569;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
Debug.ShouldStop(256);
_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("id")));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 2570;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\")";
Debug.ShouldStop(512);
_tasktype = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("type")));Debug.locals.put("tasktype", _tasktype);Debug.locals.put("tasktype", _tasktype);
 BA.debugLineNum = 2571;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"status";
Debug.ShouldStop(1024);
_status_id = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("status_id")));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 2572;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"ta";
Debug.ShouldStop(2048);
_tagcode = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 2573;BA.debugLine="Dim actionkey As String = incolitems.GetString(\"";
Debug.ShouldStop(4096);
_actionkey = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("action_tagcode")));Debug.locals.put("actionkey", _actionkey);Debug.locals.put("actionkey", _actionkey);
 BA.debugLineNum = 2574;BA.debugLine="Dim task As String = incolitems.GetString(\"task_";
Debug.ShouldStop(8192);
_task = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task", _task);Debug.locals.put("task", _task);
 BA.debugLineNum = 2575;BA.debugLine="Dim name As String = incolitems.GetString(\"name\"";
Debug.ShouldStop(16384);
_name = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 2576;BA.debugLine="Dim object_tagcode As String = incolitems.GetInt";
Debug.ShouldStop(32768);
_object_tagcode = BA.NumberToString(_incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("object_tagcode"))));Debug.locals.put("object_tagcode", _object_tagcode);Debug.locals.put("object_tagcode", _object_tagcode);
 BA.debugLineNum = 2577;BA.debugLine="Dim request_type As String = incolitems.GetInt(\"";
Debug.ShouldStop(65536);
_request_type = BA.NumberToString(_incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("request_type"))));Debug.locals.put("request_type", _request_type);Debug.locals.put("request_type", _request_type);
 BA.debugLineNum = 2580;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDatet";
Debug.ShouldStop(524288);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 2581;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOr";
Debug.ShouldStop(1048576);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 2582;BA.debugLine="Private sACLALongitude As String = Utils.IfNullO";
Debug.ShouldStop(2097152);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 2584;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
Debug.ShouldStop(8388608);
_sdate = parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sDate", _sdate);Debug.locals.put("sDate", _sdate);
 BA.debugLineNum = 2585;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
Debug.ShouldStop(16777216);
_stime = parent.mostCurrent._utils.runMethod(true,"_getcurrenttimeext" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sTime", _stime);Debug.locals.put("sTime", _stime);
 BA.debugLineNum = 2587;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"close";
Debug.ShouldStop(67108864);
_close_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("close_type")));Debug.locals.put("close_type", _close_type);Debug.locals.put("close_type", _close_type);
 BA.debugLineNum = 2588;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"resu";
Debug.ShouldStop(134217728);
_result_type = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("result_type")));Debug.locals.put("result_type", _result_type);Debug.locals.put("result_type", _result_type);
 BA.debugLineNum = 2589;BA.debugLine="Dim result_values As String = incolitems.GetStri";
Debug.ShouldStop(268435456);
_result_values = _incolitems.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("result_values")));Debug.locals.put("result_values", _result_values);Debug.locals.put("result_values", _result_values);
 BA.debugLineNum = 2590;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(\"re";
Debug.ShouldStop(536870912);
_repeatcounter = _incolitems.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("repeatcounter")));Debug.locals.put("repeatcounter", _repeatcounter);Debug.locals.put("repeatcounter", _repeatcounter);
 BA.debugLineNum = 2592;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeReque";
Debug.ShouldStop(-2147483648);
_clainfo = parent.mostCurrent._types.runMethod(false,"_makerequesttaskinfo" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)),(Object)(_close_type),(Object)(_result_type),(Object)(_result_values),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), parent.mostCurrent.__c.getField(false,"Null")),(Object)(BA.numberCast(int.class, -(double) (0 + 1))));Debug.locals.put("CLAInfo", _clainfo);Debug.locals.put("CLAInfo", _clainfo);
 BA.debugLineNum = 2593;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(tag";
Debug.ShouldStop(1);
_cla = parent.mostCurrent._types.runMethod(false,"_makerequestcla" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_tagcode),(Object)(_actionkey),(Object)(_task),(Object)(_repeatcounter),(Object)(_tasktype),(Object)(parent.mostCurrent._types.runMethod(false,"_makeinterv" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_id),(Object)(_tagcode),(Object)(_status_id),(Object)(parent.mostCurrent._utils.runMethod(true,"_colorint" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_status_id))))),(Object)(_clainfo),(Object)(parent.mostCurrent._types.runMethod(false,"_makeothercla" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")))));Debug.locals.put("CLA", _cla);Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 2597;BA.debugLine="Dim sSQL As String = $\"update dta_requests set s";
Debug.ShouldStop(16);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2599;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(64);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 2600;BA.debugLine="Dim sSQL As String = $\"update dta_requests_relat";
Debug.ShouldStop(128);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2602;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(512);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 2603;BA.debugLine="Log(\"Grava Status na BD local Request\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106802",RemoteObject.createImmutable("Grava Status na BD local Request"),0);
 BA.debugLineNum = 2604;BA.debugLine="Dim params As Map";
Debug.ShouldStop(2048);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2605;BA.debugLine="params.Initialize";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2606;BA.debugLine="params.Clear";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2607;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2608;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 2609;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 2610;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2611;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 2612;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 2613;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 2614;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2615;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2616;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2617;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2618;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2619;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2620;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2621;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2622;BA.debugLine="Try";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 2623;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 2624;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 Debug.CheckDeviceExceptions();
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 BA.debugLineNum = 2626;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106825",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2627;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 2628;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2629;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2630;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
 BA.debugLineNum = 2632;BA.debugLine="CLA.Info.Map1 = params";
Debug.ShouldStop(128);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map1" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 2634;BA.debugLine="Dim sSQL As String = $\"update dta_requests_relat";
Debug.ShouldStop(512);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_relations set status_id=2, run_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sdate))),RemoteObject.createImmutable("', run_start='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stime))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("								where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and relation_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("' and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 2636;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
Debug.ShouldStop(2048);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_ssql));
 BA.debugLineNum = 2637;BA.debugLine="Log(\"Grava Status na BD local Request-Relation\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106836",RemoteObject.createImmutable("Grava Status na BD local Request-Relation"),0);
 BA.debugLineNum = 2639;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16384);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2640;BA.debugLine="params.Initialize";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2641;BA.debugLine="params.Clear";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2642;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2643;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 2644;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_actionkey)));
 BA.debugLineNum = 2645;BA.debugLine="params.Put(\"ACLAState\", 2)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAState"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 2646;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUser"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2647;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 2648;BA.debugLine="params.Put(\"ACLADate\", sDate)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADate"))),(Object)((_sdate)));
 BA.debugLineNum = 2649;BA.debugLine="params.Put(\"ACLATime\", sTime)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATime"))),(Object)((_stime)));
 BA.debugLineNum = 2650;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAFirst"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 2652;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 2653;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 2654;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 2655;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 2656;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 2657;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 2658;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 2659;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2660;BA.debugLine="Try";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 2661;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 2662;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 2663;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ACLALatitude - ACLALongitude")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
 BA.debugLineNum = 2665;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106864",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2666;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 2667;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2668;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
 BA.debugLineNum = 2670;BA.debugLine="CLA.Info.Map2 = params";
Debug.ShouldStop(8192);
_cla.getField(false,"Info" /*RemoteObject*/ ).setField ("Map2" /*RemoteObject*/ ,_params);
 BA.debugLineNum = 2671;BA.debugLine="CLA.Status.status = 2";
Debug.ShouldStop(16384);
_cla.getField(false,"Status" /*RemoteObject*/ ).setField ("status" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 BA.debugLineNum = 2676;BA.debugLine="Dim object_type As String = DBStructures.GetScri";
Debug.ShouldStop(524288);
_object_type = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnstrevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select ifnull(object_type, '') as valor\n"),RemoteObject.createImmutable("						from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_object_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'")))),(Object)(RemoteObject.createImmutable("valor")));Debug.locals.put("object_type", _object_type);Debug.locals.put("object_type", _object_type);
 BA.debugLineNum = 2679;BA.debugLine="Dim resa2 As ResumableSub = UpdateTyperequestFie";
Debug.ShouldStop(4194304);
_resa2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resa2 = _updatetyperequestfields(_object_type,_object_tagcode,_request_type,_tagcode,_actionkey,_repeatcounter,_cla);Debug.locals.put("resa2", _resa2);Debug.locals.put("resa2", _resa2);
 BA.debugLineNum = 2681;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boolea";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"), _resa2);
this.state = 32;
return;
case 32:
//C
this.state = 16;
_resfieldsok2 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("resfieldsOk2", _resfieldsok2);
;
 BA.debugLineNum = 2682;BA.debugLine="Sleep(100)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"),BA.numberCast(int.class, 100));
this.state = 33;
return;
case 33:
//C
this.state = 16;
;
 BA.debugLineNum = 2687;BA.debugLine="Dim res As ResumableSub = FillAdditionalFields(C";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _filladditionalfields(_cla,_tagcode,_actionkey);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2688;BA.debugLine="Wait For (res) Complete (Finished As Boolean)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"), _res);
this.state = 34;
return;
case 34:
//C
this.state = 16;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 BA.debugLineNum = 2689;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"),BA.numberCast(int.class, 100));
this.state = 35;
return;
case 35:
//C
this.state = 16;
;
 BA.debugLineNum = 2695;BA.debugLine="Dim res1 As ResumableSub = CheckDatToUpdateInChe";
Debug.ShouldStop(64);
_res1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res1 = _checkdattoupdateinchecklist(_request_type,_tagcode,_actionkey,_repeatcounter);Debug.locals.put("res1", _res1);Debug.locals.put("res1", _res1);
 BA.debugLineNum = 2696;BA.debugLine="Wait For (res1) Complete (Finished1 As Boolean)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"), _res1);
this.state = 36;
return;
case 36:
//C
this.state = 16;
_finished1 = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished1", _finished1);
;
 BA.debugLineNum = 2697;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "runthischecklist"),BA.numberCast(int.class, 100));
this.state = 37;
return;
case 37:
//C
this.state = 16;
;
 BA.debugLineNum = 2699;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 16:
//try
this.state = 27;
this.catchState = 26;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 26;
 BA.debugLineNum = 2702;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScript";
Debug.ShouldStop(8192);
_tr_is_model = parent.mostCurrent._dbstructures.runMethod(true,"_getscriptcolumnintevc" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)((RemoteObject.concat(RemoteObject.createImmutable("select tr_is_model from dta_typerequests\n"),RemoteObject.createImmutable("					where tagcode in (select typerequest_tagcode from dta_requests where tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')")))),(Object)(RemoteObject.createImmutable("tr_is_model")));Debug.locals.put("tr_is_model", _tr_is_model);Debug.locals.put("tr_is_model", _tr_is_model);
 BA.debugLineNum = 2705;BA.debugLine="If Utils.Int2Bool(tr_is_model) Then";
Debug.ShouldStop(65536);
if (true) break;

case 19:
//if
this.state = 24;
if (parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_tr_is_model)).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 2706;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",objects.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_Activity_Child")),(Object)((_cla)),(Object)((_name)));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 2708;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("CallSubDelayed3",objects.processBA,(Object)((parent.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("StartCLA_Activity")),(Object)((_cla)),(Object)((_name)));
 if (true) break;

case 24:
//C
this.state = 27;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
 BA.debugLineNum = 2712;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2713;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156106912",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2714;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 BA.debugLineNum = 2715;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", ShareC";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Call StartCLA_Activity")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
this.catchState = 0;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 2718;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 2720;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static RemoteObject  _sendserverprocesscomplete(RemoteObject _debug,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("SendServerProcessComplete (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1707);
if (RapidSub.canDelegate("sendserverprocesscomplete")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","sendserverprocesscomplete", _debug, _filename);}
ResumableSub_SendServerProcessComplete rsub = new ResumableSub_SendServerProcessComplete(null,_debug,_filename);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SendServerProcessComplete extends BA.ResumableSub {
public ResumableSub_SendServerProcessComplete(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _debug,RemoteObject _filename) {
this.parent = parent;
this._debug = _debug;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _debug;
RemoteObject _filename;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendServerProcessComplete (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1707);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("debug", _debug);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 1708;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(2048);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/removeFilesSqlite")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1709;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1710;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(8192);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,objects.processBA,(Object)(BA.ObjectToString("")),(Object)(objects.getObject()));
 BA.debugLineNum = 1711;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16384);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1712;BA.debugLine="params.Initialize";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1713;BA.debugLine="params.Clear";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1714;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1715;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1716;BA.debugLine="params.Put(\"debug\", Utils.Bool2Int(debug))";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_debug)))));
 BA.debugLineNum = 1717;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1718;BA.debugLine="params.Put(\"name\", filename)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_filename)));
 BA.debugLineNum = 1719;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1720;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1721;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1722;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1723;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1724;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 1726;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1727;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1729;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(1);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1731;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(4);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 1732;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(8);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1734;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "sendserverprocesscomplete"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1735;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 6;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1736;BA.debugLine="Job.Release";
Debug.ShouldStop(128);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1737;BA.debugLine="Return True";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1739;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(1024);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1741;BA.debugLine="Job.Release";
Debug.ShouldStop(4096);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1742;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 1743;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _setallprereqselect(RemoteObject _selectstate) throws Exception{
try {
		Debug.PushSubsStack("SetAllPreReqSelect (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3442);
if (RapidSub.canDelegate("setallprereqselect")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","setallprereqselect", _selectstate);}
int _inx = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
Debug.locals.put("SelectState", _selectstate);
 BA.debugLineNum = 3442;BA.debugLine="Sub SetAllPreReqSelect(SelectState As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 3443;BA.debugLine="If SelectState = True Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_selectstate,objects.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 3444;BA.debugLine="For inx=0 To listRequests.Size -1";
Debug.ShouldStop(524288);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._listrequests.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_inx = 0 ;
for (;(step2 > 0 && _inx <= limit2) || (step2 < 0 && _inx >= limit2) ;_inx = ((int)(0 + _inx + step2))  ) {
Debug.locals.put("inx", _inx);
 BA.debugLineNum = 3445;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1048576);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3446;BA.debugLine="p = listRequests.GetPanel(inx)";
Debug.ShouldStop(2097152);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listrequests.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _inx))).getObject());
 BA.debugLineNum = 3447;BA.debugLine="Dim b As Button";
Debug.ShouldStop(4194304);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 3448;BA.debugLine="b = p.GetView(0)";
Debug.ShouldStop(8388608);
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 3449;BA.debugLine="b.Text = Chr(0xF046)";
Debug.ShouldStop(16777216);
_b.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046)))));
 }
}Debug.locals.put("inx", _inx);
;
 }else {
 BA.debugLineNum = 3452;BA.debugLine="For inx=0 To listRequests.Size -1";
Debug.ShouldStop(134217728);
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._listrequests.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_inx = 0 ;
for (;(step10 > 0 && _inx <= limit10) || (step10 < 0 && _inx >= limit10) ;_inx = ((int)(0 + _inx + step10))  ) {
Debug.locals.put("inx", _inx);
 BA.debugLineNum = 3453;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(268435456);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3454;BA.debugLine="p = listRequests.GetPanel(inx)";
Debug.ShouldStop(536870912);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listrequests.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _inx))).getObject());
 BA.debugLineNum = 3455;BA.debugLine="Dim b As Button";
Debug.ShouldStop(1073741824);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 3456;BA.debugLine="b = p.GetView(0)";
Debug.ShouldStop(-2147483648);
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 3457;BA.debugLine="b.Text = Chr(0xF096)";
Debug.ShouldStop(1);
_b.runMethod(true,"setText",BA.ObjectToCharSequence(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf096)))));
 }
}Debug.locals.put("inx", _inx);
;
 };
 BA.debugLineNum = 3462;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprereqlist() throws Exception{
try {
		Debug.PushSubsStack("SetPreReqList (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3809);
if (RapidSub.canDelegate("setprereqlist")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","setprereqlist");}
int _inx = 0;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
int _i = 0;
 BA.debugLineNum = 3809;BA.debugLine="Sub SetPreReqList";
Debug.ShouldStop(1);
 BA.debugLineNum = 3811;BA.debugLine="LstPreReqs2Download.Clear";
Debug.ShouldStop(4);
objects.mostCurrent._lstprereqs2download.runVoidMethod ("Clear");
 BA.debugLineNum = 3812;BA.debugLine="For inx=0 To listRequests.Size -1";
Debug.ShouldStop(8);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._listrequests.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_inx = 0 ;
for (;(step2 > 0 && _inx <= limit2) || (step2 < 0 && _inx >= limit2) ;_inx = ((int)(0 + _inx + step2))  ) {
Debug.locals.put("inx", _inx);
 BA.debugLineNum = 3813;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3814;BA.debugLine="p = listRequests.GetPanel(inx)";
Debug.ShouldStop(32);
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), objects.mostCurrent._listrequests.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _inx))).getObject());
 BA.debugLineNum = 3815;BA.debugLine="Dim b As Button";
Debug.ShouldStop(64);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 3816;BA.debugLine="b = p.GetView(0)";
Debug.ShouldStop(128);
_b = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), _p.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());
 BA.debugLineNum = 3817;BA.debugLine="If b.Text = Chr(0xF046) Then ' Selected";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_b.runMethod(true,"getText"),BA.ObjectToString(objects.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 0xf046)))))) { 
 BA.debugLineNum = 3818;BA.debugLine="LstPreReqs2Download.Add(b.Tag)";
Debug.ShouldStop(512);
objects.mostCurrent._lstprereqs2download.runVoidMethod ("Add",(Object)(_b.runMethod(false,"getTag")));
 };
 }
}Debug.locals.put("inx", _inx);
;
 BA.debugLineNum = 3822;BA.debugLine="For i=0 To LstPreReqs2Download.Size -1";
Debug.ShouldStop(8192);
{
final int step11 = 1;
final int limit11 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._lstprereqs2download.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11) ;_i = ((int)(0 + _i + step11))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3823;BA.debugLine="Log(LstPreReqs2Download.Get(i))";
Debug.ShouldStop(16384);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6157417486",BA.ObjectToString(objects.mostCurrent._lstprereqs2download.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3826;BA.debugLine="If LstPreReqs2Download.Size >= 1 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("g",objects.mostCurrent._lstprereqs2download.runMethod(true,"getSize"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 3827;BA.debugLine="CLAButtonRequestDownload.Enabled = True";
Debug.ShouldStop(262144);
objects.mostCurrent._clabuttonrequestdownload.runMethod(true,"setEnabled",objects.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3828;BA.debugLine="CLAButtonRequestDownload.Visible = True";
Debug.ShouldStop(524288);
objects.mostCurrent._clabuttonrequestdownload.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 3830;BA.debugLine="CLAButtonRequestDownload.Enabled = False";
Debug.ShouldStop(2097152);
objects.mostCurrent._clabuttonrequestdownload.runMethod(true,"setEnabled",objects.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3831;BA.debugLine="CLAButtonRequestDownload.Visible = False";
Debug.ShouldStop(4194304);
objects.mostCurrent._clabuttonrequestdownload.runMethod(true,"setVisible",objects.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 3834;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthefilters(RemoteObject _flt) throws Exception{
try {
		Debug.PushSubsStack("SetTheFilters (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,400);
if (RapidSub.canDelegate("setthefilters")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","setthefilters", _flt);}
RemoteObject _filter = RemoteObject.createImmutable("");
RemoteObject _currdate = RemoteObject.createImmutable("");
RemoteObject _slist = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("flt", _flt);
 BA.debugLineNum = 400;BA.debugLine="Sub SetTheFilters(flt As ObjectFilter)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 405;BA.debugLine="StartingRow = 0";
Debug.ShouldStop(1048576);
objects._startingrow = BA.numberCast(int.class, 0);
 BA.debugLineNum = 406;BA.debugLine="NextStartingRow = 0";
Debug.ShouldStop(2097152);
objects._nextstartingrow = BA.numberCast(int.class, 0);
 BA.debugLineNum = 407;BA.debugLine="ReadRows = 20";
Debug.ShouldStop(4194304);
objects._readrows = BA.numberCast(int.class, 20);
 BA.debugLineNum = 408;BA.debugLine="IsFiltered  = True";
Debug.ShouldStop(8388608);
objects._isfiltered = objects.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 409;BA.debugLine="Dim Filter As String = \"\"";
Debug.ShouldStop(16777216);
_filter = BA.ObjectToString("");Debug.locals.put("Filter", _filter);Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 410;BA.debugLine="iDialogReqTypeObject = flt.TypeObject";
Debug.ShouldStop(33554432);
objects._idialogreqtypeobject = _flt.getField(true,"TypeObject" /*RemoteObject*/ );
 BA.debugLineNum = 411;BA.debugLine="iDialogReqZone = flt.ZoneObject";
Debug.ShouldStop(67108864);
objects._idialogreqzone = _flt.getField(true,"ZoneObject" /*RemoteObject*/ );
 BA.debugLineNum = 412;BA.debugLine="iDialogReqStatus = flt.Status";
Debug.ShouldStop(134217728);
objects._idialogreqstatus = _flt.getField(true,"Status" /*RemoteObject*/ );
 BA.debugLineNum = 413;BA.debugLine="iDialogReqRegion = flt.Region";
Debug.ShouldStop(268435456);
objects._idialogreqregion = _flt.getField(true,"Region" /*RemoteObject*/ );
 BA.debugLineNum = 414;BA.debugLine="iDialogReqLocal = flt.Local";
Debug.ShouldStop(536870912);
objects._idialogreqlocal = _flt.getField(true,"Local" /*RemoteObject*/ );
 BA.debugLineNum = 415;BA.debugLine="iDialogReqWithRequests = flt.Request";
Debug.ShouldStop(1073741824);
objects._idialogreqwithrequests = _flt.getField(true,"Request" /*RemoteObject*/ );
 BA.debugLineNum = 416;BA.debugLine="sDialogReqName = flt.Name";
Debug.ShouldStop(-2147483648);
objects.mostCurrent._sdialogreqname = _flt.getField(true,"Name" /*RemoteObject*/ );
 BA.debugLineNum = 417;BA.debugLine="sDialogReqAddress = flt.Address";
Debug.ShouldStop(1);
objects.mostCurrent._sdialogreqaddress = _flt.getField(true,"Address" /*RemoteObject*/ );
 BA.debugLineNum = 418;BA.debugLine="UpdateGlobalObjectFilter";
Debug.ShouldStop(2);
_updateglobalobjectfilter();
 BA.debugLineNum = 420;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(8);
objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 421;BA.debugLine="Dim CurrDate As String = $\"$date{DateTime.Now}\"$";
Debug.ShouldStop(16);
_currdate = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)((objects.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable("")));Debug.locals.put("CurrDate", _currdate);Debug.locals.put("CurrDate", _currdate);
 BA.debugLineNum = 424;BA.debugLine="If (sDialogReqName <> \"\") Then";
Debug.ShouldStop(128);
if ((RemoteObject.solveBoolean("!",objects.mostCurrent._sdialogreqname,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 425;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
Debug.ShouldStop(256);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ")));Debug.locals.put("Filter", _filter);};
 BA.debugLineNum = 426;BA.debugLine="Filter = $\"${Filter}(a.title_import like '%${sDi";
Debug.ShouldStop(512);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(a.title_import like '%"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._sdialogreqname))),RemoteObject.createImmutable("%')")));Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 429;BA.debugLine="If (iDialogReqZone > 0) Then";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean(">",objects._idialogreqzone,BA.numberCast(double.class, 0)))) { 
 };
 BA.debugLineNum = 446;BA.debugLine="If (sDialogReqAddress <> \"\") Then";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean("!",objects.mostCurrent._sdialogreqaddress,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 447;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ")));Debug.locals.put("Filter", _filter);};
 BA.debugLineNum = 448;BA.debugLine="Filter = $\"${Filter}(c.address like '%${sDialogR";
Debug.ShouldStop(-2147483648);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(c.address like '%"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._sdialogreqaddress))),RemoteObject.createImmutable("%')")));Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 451;BA.debugLine="If (iDialogReqStatus > 0) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean(">",objects._idialogreqstatus,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 452;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
Debug.ShouldStop(8);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ")));Debug.locals.put("Filter", _filter);};
 BA.debugLineNum = 453;BA.debugLine="If (iDialogReqStatus = 1) Then";
Debug.ShouldStop(16);
if ((RemoteObject.solveBoolean("=",objects._idialogreqstatus,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 454;BA.debugLine="Filter = $\"${Filter}(a.active=1)\"$";
Debug.ShouldStop(32);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(a.active=1)")));Debug.locals.put("Filter", _filter);
 }else {
 BA.debugLineNum = 456;BA.debugLine="Filter = $\"${Filter}(a.active=0)\"$";
Debug.ShouldStop(128);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(a.active=0)")));Debug.locals.put("Filter", _filter);
 };
 };
 BA.debugLineNum = 460;BA.debugLine="If (iDialogReqTypeObject > 0) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean(">",objects._idialogreqtypeobject,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 461;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
Debug.ShouldStop(4096);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ")));Debug.locals.put("Filter", _filter);};
 BA.debugLineNum = 462;BA.debugLine="Filter = $\"${Filter}(b.id=${iDialogReqTypeObject";
Debug.ShouldStop(8192);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(b.id="),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects._idialogreqtypeobject))),RemoteObject.createImmutable(")")));Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 465;BA.debugLine="If (iDialogReqLocal > 0) Then";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(">",objects._idialogreqlocal,BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 466;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
Debug.ShouldStop(131072);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ")));Debug.locals.put("Filter", _filter);};
 BA.debugLineNum = 467;BA.debugLine="Filter = $\"${Filter}(c.local='${LocalsList.Get(i";
Debug.ShouldStop(262144);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(c.local='"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(objects.mostCurrent._localslist.runMethod(false,"Get",(Object)(RemoteObject.solve(new RemoteObject[] {objects._idialogreqlocal,RemoteObject.createImmutable(1)}, "-",1, 1))))),RemoteObject.createImmutable("')")));Debug.locals.put("Filter", _filter);
 };
 BA.debugLineNum = 470;BA.debugLine="If (iDialogReqWithRequests = 1) Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",objects._idialogreqwithrequests,BA.numberCast(double.class, 1)))) { 
 BA.debugLineNum = 471;BA.debugLine="Dim sList As String = \"\"";
Debug.ShouldStop(4194304);
_slist = BA.ObjectToString("");Debug.locals.put("sList", _slist);Debug.locals.put("sList", _slist);
 BA.debugLineNum = 472;BA.debugLine="For i=0 To ObjRequests.Size-1";
Debug.ShouldStop(8388608);
{
final int step45 = 1;
final int limit45 = RemoteObject.solve(new RemoteObject[] {objects.mostCurrent._objrequests.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45) ;_i = ((int)(0 + _i + step45))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 473;BA.debugLine="If (sList <> \"\") Then sList = $\"${sList},\"$";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("!",_slist,RemoteObject.createImmutable("")))) { 
_slist = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_slist))),RemoteObject.createImmutable(",")));Debug.locals.put("sList", _slist);};
 BA.debugLineNum = 474;BA.debugLine="sList = $\"${sList}'${ObjRequests.Get(i)}'\"$";
Debug.ShouldStop(33554432);
_slist = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_slist))),RemoteObject.createImmutable("'"),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(objects.mostCurrent._objrequests.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable("'")));Debug.locals.put("sList", _slist);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 476;BA.debugLine="If (sList <> \"\") Then";
Debug.ShouldStop(134217728);
if ((RemoteObject.solveBoolean("!",_slist,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 477;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
Debug.ShouldStop(268435456);
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ")));Debug.locals.put("Filter", _filter);};
 BA.debugLineNum = 478;BA.debugLine="Filter = $\"${Filter}(a.tagcode in (${sList}))\"$";
Debug.ShouldStop(536870912);
_filter = (RemoteObject.concat(RemoteObject.createImmutable(""),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable("(a.tagcode in ("),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_slist))),RemoteObject.createImmutable("))")));Debug.locals.put("Filter", _filter);
 };
 };
 BA.debugLineNum = 481;BA.debugLine="Log(Filter)";
Debug.ShouldStop(1);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6151322705",_filter,0);
 BA.debugLineNum = 495;BA.debugLine="CurrentFilter = Filter";
Debug.ShouldStop(16384);
objects.mostCurrent._currentfilter = _filter;
 BA.debugLineNum = 496;BA.debugLine="StartObjectsActivity(True, Filter)";
Debug.ShouldStop(32768);
_startobjectsactivity(objects.mostCurrent.__c.getField(true,"True"),_filter);
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _showrequestinfodialog(RemoteObject _tagcode,RemoteObject _title,RemoteObject _parentdialog) throws Exception{
try {
		Debug.PushSubsStack("ShowRequestInfoDialog (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3837);
if (RapidSub.canDelegate("showrequestinfodialog")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","showrequestinfodialog", _tagcode, _title, _parentdialog); return;}
ResumableSub_ShowRequestInfoDialog rsub = new ResumableSub_ShowRequestInfoDialog(null,_tagcode,_title,_parentdialog);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ShowRequestInfoDialog extends BA.ResumableSub {
public ResumableSub_ShowRequestInfoDialog(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _tagcode,RemoteObject _title,RemoteObject _parentdialog) {
this.parent = parent;
this._tagcode = _tagcode;
this._title = _title;
this._parentdialog = _parentdialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _tagcode;
RemoteObject _title;
RemoteObject _parentdialog;
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _dialogpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _request_desc = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _nameobject = RemoteObject.createImmutable("");
RemoteObject _request_date = RemoteObject.createImmutable("");
RemoteObject _request_stime = RemoteObject.createImmutable("");
RemoteObject _details = RemoteObject.createImmutable("");
RemoteObject _sql2 = RemoteObject.createImmutable("");
RemoteObject _record2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _n = 0;
RemoteObject _res = RemoteObject.createImmutable(0);
int step26;
int limit26;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ShowRequestInfoDialog (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3837);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("title", _title);
Debug.locals.put("parentDialog", _parentdialog);
 BA.debugLineNum = 3840;BA.debugLine="Dim sf As Object = ThisDialog.ShowAsync(title, Sh";
Debug.ShouldStop(-2147483648);
_sf = parent.mostCurrent._thisdialog.runMethod(false,"ShowAsync",(Object)(_title),(Object)(parent.mostCurrent._sharecode._option_confirm /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._option_cancel /*RemoteObject*/ ),(Object)(BA.ObjectToString("")),objects.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3841;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
Debug.ShouldStop(1);
parent.mostCurrent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_sf),(Object)(parent.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent.mostCurrent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3842;BA.debugLine="ThisDialog.SetSize(70%x, 80%y)";
Debug.ShouldStop(2);
parent.mostCurrent._thisdialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),objects.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),objects.mostCurrent.activityBA)));
 BA.debugLineNum = 3843;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "showrequestinfodialog"), null);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_dialogpanel = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("DialogPanel", _dialogpanel);
;
 BA.debugLineNum = 3844;BA.debugLine="DialogPanel.LoadLayout(\"Request_Information_View\"";
Debug.ShouldStop(8);
_dialogpanel.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Request_Information_View")),objects.mostCurrent.activityBA);
 BA.debugLineNum = 3846;BA.debugLine="Dim SQL As String = $\"${DBStructures.EVC_SQL_GETP";
Debug.ShouldStop(32);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._dbstructures._evc_sql_getprerequests_data_new /*RemoteObject*/ ))),RemoteObject.createImmutable(" and a.tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' ")));Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 3847;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
Debug.ShouldStop(64);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));Debug.locals.put("Record", _record);
 BA.debugLineNum = 3848;BA.debugLine="If (Record.RowCount>=1) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("g",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3849;BA.debugLine="Record.Position = 0";
Debug.ShouldStop(256);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 3850;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagcod";
Debug.ShouldStop(512);
_tagcode = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 3851;BA.debugLine="Dim request_desc As String = Record.GetString(\"r";
Debug.ShouldStop(1024);
_request_desc = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_desc")));Debug.locals.put("request_desc", _request_desc);Debug.locals.put("request_desc", _request_desc);
 BA.debugLineNum = 3852;BA.debugLine="Dim name As String = Record.GetString(\"name\")";
Debug.ShouldStop(2048);
_name = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("name")));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 3853;BA.debugLine="Dim nameobject As String = Record.GetString(\"nam";
Debug.ShouldStop(4096);
_nameobject = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("nameobject")));Debug.locals.put("nameobject", _nameobject);Debug.locals.put("nameobject", _nameobject);
 BA.debugLineNum = 3854;BA.debugLine="Dim request_date As String = Record.GetString(\"r";
Debug.ShouldStop(8192);
_request_date = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_date")));Debug.locals.put("request_date", _request_date);Debug.locals.put("request_date", _request_date);
 BA.debugLineNum = 3855;BA.debugLine="Dim request_stime As String = Record.GetString(\"";
Debug.ShouldStop(16384);
_request_stime = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("request_stime")));Debug.locals.put("request_stime", _request_stime);Debug.locals.put("request_stime", _request_stime);
 BA.debugLineNum = 3856;BA.debugLine="Dim details As String = Record.GetString(\"detail";
Debug.ShouldStop(32768);
_details = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("details")));Debug.locals.put("details", _details);Debug.locals.put("details", _details);
 BA.debugLineNum = 3858;BA.debugLine="LabelPreRequestNumber.Text = tagcode";
Debug.ShouldStop(131072);
parent.mostCurrent._labelprerequestnumber.runMethod(true,"setText",BA.ObjectToCharSequence(_tagcode));
 BA.debugLineNum = 3859;BA.debugLine="LabelPreRequestType.Text = request_desc";
Debug.ShouldStop(262144);
parent.mostCurrent._labelprerequesttype.runMethod(true,"setText",BA.ObjectToCharSequence(_request_desc));
 BA.debugLineNum = 3860;BA.debugLine="LabelPreRequestEntity.Text = name";
Debug.ShouldStop(524288);
parent.mostCurrent._labelprerequestentity.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 3861;BA.debugLine="LabelPreRequestObject.Text = nameobject";
Debug.ShouldStop(1048576);
parent.mostCurrent._labelprerequestobject.runMethod(true,"setText",BA.ObjectToCharSequence(_nameobject));
 BA.debugLineNum = 3862;BA.debugLine="LabelPreRequestDateTime.Text = $\"${request_date}";
Debug.ShouldStop(2097152);
parent.mostCurrent._labelprerequestdatetime.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_date))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_stime))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3863;BA.debugLine="LabelPreRequestDetails.Text = details";
Debug.ShouldStop(4194304);
parent.mostCurrent._labelprerequestdetails.runMethod(true,"setText",BA.ObjectToCharSequence(_details));
 BA.debugLineNum = 3866;BA.debugLine="Dim SQL2 As String = $\"${DBStructures.EVC_QL_CUR";
Debug.ShouldStop(33554432);
_sql2 = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._dbstructures._evc_ql_current_request_properties /*RemoteObject*/ ))),RemoteObject.createImmutable(" and b.tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' ")));Debug.locals.put("SQL2", _sql2);Debug.locals.put("SQL2", _sql2);
 BA.debugLineNum = 3867;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEVC.";
Debug.ShouldStop(67108864);
_record2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql2)));Debug.locals.put("Record2", _record2);
 BA.debugLineNum = 3868;BA.debugLine="If (Record2.RowCount>=1) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 11;
if ((RemoteObject.solveBoolean("g",_record2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3869;BA.debugLine="For n=0 To Record2.RowCount-1";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//for
this.state = 10;
step26 = 1;
limit26 = RemoteObject.solve(new RemoteObject[] {_record2.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if ((step26 > 0 && _n <= limit26) || (step26 < 0 && _n >= limit26)) this.state = 9;
if (true) break;

case 19:
//C
this.state = 18;
_n = ((int)(0 + _n + step26)) ;
Debug.locals.put("n", _n);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 3870;BA.debugLine="Record2.Position = n";
Debug.ShouldStop(536870912);
_record2.runMethod(true,"setPosition",BA.numberCast(int.class, _n));
 BA.debugLineNum = 3871;BA.debugLine="listOfFields.Add( CreateShowRequestInfoField(R";
Debug.ShouldStop(1073741824);
parent.mostCurrent._listoffields.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createshowrequestinfofield(_record2,parent.mostCurrent._listoffields.runMethod(false,"_asview")).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("n", _n);
;
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 3874;BA.debugLine="Record2.Close";
Debug.ShouldStop(2);
_record2.runVoidMethod ("Close");
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 3876;BA.debugLine="Record.Close";
Debug.ShouldStop(8);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 3877;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "showrequestinfodialog"), _sf);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 3878;BA.debugLine="If res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 16;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3881;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _dialog_ready(RemoteObject _dialogpanel) throws Exception{
}
public static void  _dialog_result(RemoteObject _res) throws Exception{
}
public static void  _startobjectsactivity(RemoteObject _clear,RemoteObject _filter) throws Exception{
try {
		Debug.PushSubsStack("StartObjectsActivity (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,510);
if (RapidSub.canDelegate("startobjectsactivity")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","startobjectsactivity", _clear, _filter); return;}
ResumableSub_StartObjectsActivity rsub = new ResumableSub_StartObjectsActivity(null,_clear,_filter);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_StartObjectsActivity extends BA.ResumableSub {
public ResumableSub_StartObjectsActivity(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _clear,RemoteObject _filter) {
this.parent = parent;
this._clear = _clear;
this._filter = _filter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _clear;
RemoteObject _filter;
RemoteObject _sfilter = RemoteObject.createImmutable("");
RemoteObject _tfilter = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._objectfilter");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _mapheight = RemoteObject.createImmutable(0);
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _sql = RemoteObject.createImmutable("");
RemoteObject _thislinescount = RemoteObject.createImmutable(0);
int _row = 0;
RemoteObject _icstring = RemoteObject.createImmutable("");
RemoteObject _status_color = RemoteObject.createImmutable("");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
int step55;
int limit55;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("StartObjectsActivity (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,510);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Clear", _clear);
Debug.locals.put("Filter", _filter);
 BA.debugLineNum = 512;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",objects.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 513;BA.debugLine="Sleep(100)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "startobjectsactivity"),BA.numberCast(int.class, 100));
this.state = 55;
return;
case 55:
//C
this.state = 1;
;
 BA.debugLineNum = 515;BA.debugLine="If (Starter.ObjectKeepFilter = True) Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 54;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._starter._objectkeepfilter /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True")))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 516;BA.debugLine="Starter.ObjectKeepFilter = False";
Debug.ShouldStop(8);
parent.mostCurrent._starter._objectkeepfilter /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 517;BA.debugLine="If (Starter.ObjectSearchFilter <> \"\") Then";
Debug.ShouldStop(16);
if (true) break;

case 4:
//if
this.state = 9;
if ((RemoteObject.solveBoolean("!",parent.mostCurrent._starter._objectsearchfilter /*RemoteObject*/ ,RemoteObject.createImmutable("")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 518;BA.debugLine="Dim sFilter As String = Starter.ObjectSearchFil";
Debug.ShouldStop(32);
_sfilter = parent.mostCurrent._starter._objectsearchfilter /*RemoteObject*/ ;Debug.locals.put("sFilter", _sfilter);Debug.locals.put("sFilter", _sfilter);
 BA.debugLineNum = 519;BA.debugLine="Starter.ObjectSearchFilter = \"\"";
Debug.ShouldStop(64);
parent.mostCurrent._starter._objectsearchfilter /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 520;BA.debugLine="Starter.ObjectFilter = Types.MakeObjectFilter(S";
Debug.ShouldStop(128);
parent.mostCurrent._starter._objectfilter /*RemoteObject*/  = parent.mostCurrent._types.runMethod(false,"_makeobjectfilter" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._obj_defaulttype /*RemoteObject*/ ),(Object)(parent.mostCurrent._sharecode._obj_defaultzone /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 521;BA.debugLine="StartObjectsActivity(True, sFilter)";
Debug.ShouldStop(256);
_startobjectsactivity(parent.mostCurrent.__c.getField(true,"True"),_sfilter);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 523;BA.debugLine="Dim tFilter As ObjectFilter = Starter.ObjectFil";
Debug.ShouldStop(1024);
_tfilter = parent.mostCurrent._starter._objectfilter /*RemoteObject*/ ;Debug.locals.put("tFilter", _tfilter);Debug.locals.put("tFilter", _tfilter);
 BA.debugLineNum = 525;BA.debugLine="Starter.ObjectSearchFilter = \"\"";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._objectsearchfilter /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 526;BA.debugLine="SetTheFilters(tFilter)";
Debug.ShouldStop(8192);
_setthefilters(_tfilter);
 if (true) break;

case 9:
//C
this.state = 54;
;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 530;BA.debugLine="If Clear Then";
Debug.ShouldStop(131072);
if (true) break;

case 12:
//if
this.state = 21;
if (_clear.<Boolean>get().booleanValue()) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 531;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 15:
//try
this.state = 20;
this.catchState = 19;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 20;
this.catchState = 19;
 BA.debugLineNum = 532;BA.debugLine="listObjects.Clear";
Debug.ShouldStop(524288);
parent.mostCurrent._listobjects.runVoidMethod ("_clear");
 BA.debugLineNum = 533;BA.debugLine="Markers.Clear";
Debug.ShouldStop(1048576);
parent._markers.runVoidMethod ("Clear");
 BA.debugLineNum = 534;BA.debugLine="StartingRow = 0";
Debug.ShouldStop(2097152);
parent._startingrow = BA.numberCast(int.class, 0);
 BA.debugLineNum = 535;BA.debugLine="NextStartingRow = 0";
Debug.ShouldStop(4194304);
parent._nextstartingrow = BA.numberCast(int.class, 0);
 BA.debugLineNum = 536;BA.debugLine="ReadRows = 20";
Debug.ShouldStop(8388608);
parent._readrows = BA.numberCast(int.class, 20);
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 538;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6151584796",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA)),0);
 BA.debugLineNum = 539;BA.debugLine="Utils.WriteErrors2Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_writeerrors2log" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 543;BA.debugLine="Dim height As Int = 95dip";
Debug.ShouldStop(1073741824);
_height = parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95)));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 544;BA.debugLine="Dim mapHeight As Int = 95dip";
Debug.ShouldStop(-2147483648);
_mapheight = parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 95)));Debug.locals.put("mapHeight", _mapheight);Debug.locals.put("mapHeight", _mapheight);
 BA.debugLineNum = 545;BA.debugLine="If(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1);
if (true) break;

case 22:
//if
this.state = 25;
if ((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 546;BA.debugLine="height =  245dip";
Debug.ShouldStop(2);
_height = parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 245)));Debug.locals.put("height", _height);
 BA.debugLineNum = 547;BA.debugLine="mapHeight = 85dip";
Debug.ShouldStop(4);
_mapheight = parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85)));Debug.locals.put("mapHeight", _mapheight);
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 549;BA.debugLine="Private Record As Cursor";
Debug.ShouldStop(16);
_record = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record", _record);
 BA.debugLineNum = 550;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(32);
parent._itemscounter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 557;BA.debugLine="Dim SQL As String = DBStructures.EVC_SQL_CURRENT";
Debug.ShouldStop(4096);
_sql = parent.mostCurrent._dbstructures._evc_sql_current_objects /*RemoteObject*/ ;Debug.locals.put("SQL", _sql);Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 561;BA.debugLine="If (Filter <> \"\") Then";
Debug.ShouldStop(65536);
if (true) break;

case 26:
//if
this.state = 31;
if ((RemoteObject.solveBoolean("!",_filter,RemoteObject.createImmutable("")))) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 562;BA.debugLine="SQL = $\"${SQL} where ${Filter} and ((a.title_im";
Debug.ShouldStop(131072);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" where "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filter))),RemoteObject.createImmutable(" and ((a.title_import is not null) and ((a.title_import <>'') and (a.tagcode <>'__NONE__'))) ")));Debug.locals.put("SQL", _sql);
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 564;BA.debugLine="SQL = $\"${SQL} where ((a.title_import is not nu";
Debug.ShouldStop(524288);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" where ((a.title_import is not null) and ((a.title_import <>'') and (a.tagcode <>'__NONE__'))) ")));Debug.locals.put("SQL", _sql);
 if (true) break;

case 31:
//C
this.state = 32;
;
 BA.debugLineNum = 567;BA.debugLine="Log(SQL)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6151584825",_sql,0);
 BA.debugLineNum = 569;BA.debugLine="SQL = $\"${SQL} order by a.title_import limit ${S";
Debug.ShouldStop(16777216);
_sql = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sql))),RemoteObject.createImmutable(" order by a.title_import limit "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._startingrow))),RemoteObject.createImmutable(", "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._readrows))),RemoteObject.createImmutable("")));Debug.locals.put("SQL", _sql);
 BA.debugLineNum = 571;BA.debugLine="Log(SQL)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6151584829",_sql,0);
 BA.debugLineNum = 573;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
Debug.ShouldStop(268435456);
_record = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_sql)));
 BA.debugLineNum = 576;BA.debugLine="Dim thisLinesCount As Int = Record.RowCount";
Debug.ShouldStop(-2147483648);
_thislinescount = _record.runMethod(true,"getRowCount");Debug.locals.put("thisLinesCount", _thislinescount);Debug.locals.put("thisLinesCount", _thislinescount);
 BA.debugLineNum = 578;BA.debugLine="If (thisLinesCount < ReadRows) Then";
Debug.ShouldStop(2);
if (true) break;

case 32:
//if
this.state = 37;
if ((RemoteObject.solveBoolean("<",_thislinescount,BA.numberCast(double.class, parent._readrows)))) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 BA.debugLineNum = 579;BA.debugLine="NextStartingRow = StartingRow";
Debug.ShouldStop(4);
parent._nextstartingrow = parent._startingrow;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 581;BA.debugLine="NextStartingRow = StartingRow + ReadRows";
Debug.ShouldStop(16);
parent._nextstartingrow = RemoteObject.solve(new RemoteObject[] {parent._startingrow,parent._readrows}, "+",1, 1);
 BA.debugLineNum = 582;BA.debugLine="ItemsCounter = StartingRow";
Debug.ShouldStop(32);
parent._itemscounter = parent._startingrow;
 if (true) break;

case 37:
//C
this.state = 38;
;
 BA.debugLineNum = 585;BA.debugLine="TotalLineItems = NextStartingRow";
Debug.ShouldStop(256);
parent._totallineitems = parent._nextstartingrow;
 BA.debugLineNum = 587;BA.debugLine="If Record.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 38:
//if
this.state = 53;
if (RemoteObject.solveBoolean(">",_record.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 598;BA.debugLine="For Row = 0 To Record.RowCount-1";
Debug.ShouldStop(2097152);
if (true) break;

case 41:
//for
this.state = 52;
step55 = 1;
limit55 = RemoteObject.solve(new RemoteObject[] {_record.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_row = 0 ;
Debug.locals.put("Row", _row);
this.state = 56;
if (true) break;

case 56:
//C
this.state = 52;
if ((step55 > 0 && _row <= limit55) || (step55 < 0 && _row >= limit55)) this.state = 43;
if (true) break;

case 57:
//C
this.state = 56;
_row = ((int)(0 + _row + step55)) ;
Debug.locals.put("Row", _row);
if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 599;BA.debugLine="Record.Position = Row";
Debug.ShouldStop(4194304);
_record.runMethod(true,"setPosition",BA.numberCast(int.class, _row));
 BA.debugLineNum = 600;BA.debugLine="Dim icString As String = \"\"";
Debug.ShouldStop(8388608);
_icstring = BA.ObjectToString("");Debug.locals.put("icString", _icstring);Debug.locals.put("icString", _icstring);
 BA.debugLineNum = 602;BA.debugLine="Dim status_color As String = Record.GetString(";
Debug.ShouldStop(33554432);
_status_color = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("status_color")));Debug.locals.put("status_color", _status_color);Debug.locals.put("status_color", _status_color);
 BA.debugLineNum = 603;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagc";
Debug.ShouldStop(67108864);
_tagcode = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("tagcode")));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 604;BA.debugLine="Dim latitude As String = Record.GetString(\"lat";
Debug.ShouldStop(134217728);
_latitude = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("latitude")));Debug.locals.put("latitude", _latitude);Debug.locals.put("latitude", _latitude);
 BA.debugLineNum = 605;BA.debugLine="Dim longitude As String = Record.GetString(\"lo";
Debug.ShouldStop(268435456);
_longitude = _record.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("longitude")));Debug.locals.put("longitude", _longitude);Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 607;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(1073741824);
parent._itemscounter = RemoteObject.solve(new RemoteObject[] {parent._itemscounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 608;BA.debugLine="icString = ItemsCounter";
Debug.ShouldStop(-2147483648);
_icstring = BA.NumberToString(parent._itemscounter);Debug.locals.put("icString", _icstring);
 BA.debugLineNum = 611;BA.debugLine="If (ObjRequests.IndexOf(tagcode) >= 0) Then";
Debug.ShouldStop(4);
if (true) break;

case 44:
//if
this.state = 47;
if ((RemoteObject.solveBoolean("g",parent.mostCurrent._objrequests.runMethod(true,"IndexOf",(Object)((_tagcode))),BA.numberCast(double.class, 0)))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 612;BA.debugLine="status_color = \"BLUE\"";
Debug.ShouldStop(8);
_status_color = BA.ObjectToString("BLUE");Debug.locals.put("status_color", _status_color);
 if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 615;BA.debugLine="listObjects.Add( CreateListItem(icString, Reco";
Debug.ShouldStop(64);
parent.mostCurrent._listobjects.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitem(_icstring,_record,parent.mostCurrent._listobjects.runMethod(false,"_asview").runMethod(true,"getWidth"),_height,parent.mostCurrent._objrequests,parent.mostCurrent._objrequestsnottoday).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 617;BA.debugLine="If Not(Utils.isNullOrEmpty(latitude)) And Not(";
Debug.ShouldStop(256);
if (true) break;

case 48:
//if
this.state = 51;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_latitude))))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_longitude)))))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 621;BA.debugLine="listPedidosMap.Add( CreateListItemMap(icStrin";
Debug.ShouldStop(4096);
parent.mostCurrent._listpedidosmap.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistitemmap(_icstring,_record,parent.mostCurrent._listpedidosmap.runMethod(false,"_asview").runMethod(true,"getWidth"),_mapheight,parent.mostCurrent._objrequests,parent.mostCurrent._objrequestsnottoday).getObject()),(Object)((RemoteObject.createImmutable(""))));
 if (true) break;

case 51:
//C
this.state = 57;
;
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
Debug.locals.put("Row", _row);
;
 if (true) break;

case 53:
//C
this.state = 54;
;
 BA.debugLineNum = 627;BA.debugLine="Record.Close";
Debug.ShouldStop(262144);
_record.runVoidMethod ("Close");
 BA.debugLineNum = 628;BA.debugLine="WindowStatusUpdate";
Debug.ShouldStop(524288);
_windowstatusupdate();
 if (true) break;

case 54:
//C
this.state = -1;
;
 BA.debugLineNum = 632;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 634;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static RemoteObject  _textlabel(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("TextLabel (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,786);
if (RapidSub.canDelegate("textlabel")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","textlabel", _text);}
RemoteObject _tpf = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas.B4XRect");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
Debug.locals.put("Text", _text);
 BA.debugLineNum = 786;BA.debugLine="Sub TextLabel(Text As String) As Bitmap";
Debug.ShouldStop(131072);
 BA.debugLineNum = 787;BA.debugLine="Dim tpf As B4XFont = xui.CreateDefaultFont(10)";
Debug.ShouldStop(262144);
_tpf = objects.mostCurrent._xui.runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 10)));Debug.locals.put("tpf", _tpf);Debug.locals.put("tpf", _tpf);
 BA.debugLineNum = 788;BA.debugLine="Dim c As B4XCanvas";
Debug.ShouldStop(524288);
_c = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("c", _c);
 BA.debugLineNum = 789;BA.debugLine="c.Initialize(gmap)";
Debug.ShouldStop(1048576);
_c.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), objects.mostCurrent._gmap.getObject()));
 BA.debugLineNum = 791;BA.debugLine="Dim r As B4XRect = c.MeasureText(Text, tpf)";
Debug.ShouldStop(4194304);
_r = _c.runMethod(false,"MeasureText",(Object)(_text),(Object)(_tpf));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 792;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
Debug.ShouldStop(8388608);
_r.runMethod(true,"setHeight",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),objects.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 793;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
Debug.ShouldStop(16777216);
_r.runMethod(true,"setWidth",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),(RemoteObject.solve(new RemoteObject[] {_r.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0)),objects.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "++",2, 0)));
 BA.debugLineNum = 795;BA.debugLine="c.DrawRect(r, Consts.ColorWhite, True, 0)";
Debug.ShouldStop(67108864);
_c.runVoidMethod ("DrawRect",(Object)(_r),(Object)(objects.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(objects.mostCurrent.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 796;BA.debugLine="c.DrawText(Text, r.CenterX, r.CenterY, tpf, Color";
Debug.ShouldStop(134217728);
_c.runVoidMethod ("DrawText",objects.processBA,(Object)(_text),(Object)(_r.runMethod(true,"getCenterX")),(Object)(_r.runMethod(true,"getCenterY")),(Object)(_tpf),(Object)(objects.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 BA.debugLineNum = 798;BA.debugLine="Dim bm As Bitmap = c.CreateBitmap";
Debug.ShouldStop(536870912);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
_bm = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), _c.runMethod(false,"CreateBitmap").getObject());Debug.locals.put("bm", _bm);
 BA.debugLineNum = 799;BA.debugLine="Return bm.Crop(0,0,r.Width,r.Height)";
Debug.ShouldStop(1073741824);
if (true) return _bm.runMethod(false,"Crop",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getWidth"))),(Object)(BA.numberCast(int.class, _r.runMethod(true,"getHeight"))));
 BA.debugLineNum = 800;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tilesourceselect_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("TileSourceSelect_ItemClick (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,506);
if (RapidSub.canDelegate("tilesourceselect_itemclick")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","tilesourceselect_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 506;BA.debugLine="Sub TileSourceSelect_ItemClick (Position As Int, V";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateextrabuttons() throws Exception{
try {
		Debug.PushSubsStack("UpdateExtraButtons (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1941);
if (RapidSub.canDelegate("updateextrabuttons")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","updateextrabuttons");}
RemoteObject _v = RemoteObject.createImmutable(false);
 BA.debugLineNum = 1941;BA.debugLine="Sub UpdateExtraButtons";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1942;BA.debugLine="Dim v As Boolean = (SelectedObjectsCount > 0) And";
Debug.ShouldStop(2097152);
_v = BA.ObjectToBoolean(RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",objects._selectedobjectscount,BA.numberCast(double.class, 0))))) && RemoteObject.solveBoolean(".",objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._norequestpanel.runMethod(true,"getVisible")))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",objects.mostCurrent._liststabpanel.runMethod(true,"getCurrentPage"),BA.numberCast(double.class, 0))))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 1943;BA.debugLine="butBulkCreateRequest.Visible = v";
Debug.ShouldStop(4194304);
objects.mostCurrent._butbulkcreaterequest.runMethod(true,"setVisible",_v);
 BA.debugLineNum = 1944;BA.debugLine="butBulkPreRequest.Visible = v";
Debug.ShouldStop(8388608);
objects.mostCurrent._butbulkprerequest.runMethod(true,"setVisible",_v);
 BA.debugLineNum = 1945;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateglobalobjectfilter() throws Exception{
try {
		Debug.PushSubsStack("UpdateGlobalObjectFilter (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,389);
if (RapidSub.canDelegate("updateglobalobjectfilter")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","updateglobalobjectfilter");}
 BA.debugLineNum = 389;BA.debugLine="Sub UpdateGlobalObjectFilter";
Debug.ShouldStop(16);
 BA.debugLineNum = 390;BA.debugLine="Starter.ObjectFilter.TypeObject = iDialogReqTypeO";
Debug.ShouldStop(32);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("TypeObject" /*RemoteObject*/ ,objects._idialogreqtypeobject);
 BA.debugLineNum = 391;BA.debugLine="Starter.ObjectFilter.ZoneObject = iDialogReqZone";
Debug.ShouldStop(64);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("ZoneObject" /*RemoteObject*/ ,objects._idialogreqzone);
 BA.debugLineNum = 392;BA.debugLine="Starter.ObjectFilter.Status = iDialogReqStatus";
Debug.ShouldStop(128);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("Status" /*RemoteObject*/ ,objects._idialogreqstatus);
 BA.debugLineNum = 393;BA.debugLine="Starter.ObjectFilter.Name = sDialogReqName";
Debug.ShouldStop(256);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("Name" /*RemoteObject*/ ,objects.mostCurrent._sdialogreqname);
 BA.debugLineNum = 394;BA.debugLine="Starter.ObjectFilter.Region = iDialogReqRegion";
Debug.ShouldStop(512);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("Region" /*RemoteObject*/ ,objects._idialogreqregion);
 BA.debugLineNum = 395;BA.debugLine="Starter.ObjectFilter.Local = iDialogReqLocal";
Debug.ShouldStop(1024);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("Local" /*RemoteObject*/ ,objects._idialogreqlocal);
 BA.debugLineNum = 396;BA.debugLine="Starter.ObjectFilter.Address = sDialogReqAddress";
Debug.ShouldStop(2048);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("Address" /*RemoteObject*/ ,objects.mostCurrent._sdialogreqaddress);
 BA.debugLineNum = 397;BA.debugLine="Starter.ObjectFilter.Request = iDialogReqWithRequ";
Debug.ShouldStop(4096);
objects.mostCurrent._starter._objectfilter /*RemoteObject*/ .setField ("Request" /*RemoteObject*/ ,objects._idialogreqwithrequests);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemainlayout() throws Exception{
try {
		Debug.PushSubsStack("UpdateMainLayout (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,337);
if (RapidSub.canDelegate("updatemainlayout")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","updatemainlayout");}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 337;BA.debugLine="Sub UpdateMainLayout";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
Debug.ShouldStop(131072);
objects.mostCurrent._mainlabeloptlists.runMethod(true,"setTextColor",objects.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 339;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(262144);
if (objects.mostCurrent.__c.runMethod(true,"Not",(Object)(objects.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 340;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
Debug.ShouldStop(524288);
objects.mostCurrent._mainlogo.runMethod(true,"setGravity",objects.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 341;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
Debug.ShouldStop(1048576);
objects.mostCurrent._mainlogo.runMethod(true,"setWidth",objects.mostCurrent._consts._logowidth /*RemoteObject*/ );
 BA.debugLineNum = 342;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN";
Debug.ShouldStop(2097152);
objects.mostCurrent.__c.runVoidMethod ("LogImpl","6150929413",(RemoteObject.concat(RemoteObject.createImmutable("Inicialização de BMP: "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 343;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) The";
Debug.ShouldStop(4194304);
if ((objects.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(S";
Debug.ShouldStop(8388608);
objects.mostCurrent._mainlogo.runVoidMethod ("SetBackgroundImageNew",(Object)((objects.mostCurrent._utils.runMethod(false,"_b64tobitmap" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(objects.mostCurrent._sharecode._app_main_logo_mini /*RemoteObject*/ )).getObject())));
 };
 };
 BA.debugLineNum = 350;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(536870912);
objects.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,objects.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), objects.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 351;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
Debug.ShouldStop(1073741824);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), objects.mostCurrent._liststabpanel);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 352;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("tabStrip"))));
 BA.debugLineNum = 354;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
Debug.ShouldStop(2);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setIndicatorColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(objects.mostCurrent._consts._colormain /*RemoteObject*/ )})));
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatemyposition(RemoteObject _lat,RemoteObject _lon) throws Exception{
try {
		Debug.PushSubsStack("UpdateMyPosition (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,802);
if (RapidSub.canDelegate("updatemyposition")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","updatemyposition", _lat, _lon);}
Debug.locals.put("Lat", _lat);
Debug.locals.put("Lon", _lon);
 BA.debugLineNum = 802;BA.debugLine="Public Sub UpdateMyPosition(Lat As String, Lon As";
Debug.ShouldStop(2);
 BA.debugLineNum = 803;BA.debugLine="If (LabelAppInfo.IsInitialized) Then";
Debug.ShouldStop(4);
if ((objects.mostCurrent._labelappinfo.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 804;BA.debugLine="MyPositionLat = Lat";
Debug.ShouldStop(8);
objects._mypositionlat = _lat;
 BA.debugLineNum = 805;BA.debugLine="MyPositionLon = Lon";
Debug.ShouldStop(16);
objects._mypositionlon = _lon;
 BA.debugLineNum = 806;BA.debugLine="LabelAppInfo.Text =  $\"Latitude: ${MyPositionLat";
Debug.ShouldStop(32);
objects.mostCurrent._labelappinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Latitude: "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects._mypositionlat))),RemoteObject.createImmutable(", Longitude: "),objects.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((objects._mypositionlon))),RemoteObject.createImmutable("")))));
 };
 BA.debugLineNum = 809;BA.debugLine="If (Markers.IsInitialized) Then";
Debug.ShouldStop(256);
if ((objects._markers.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 810;BA.debugLine="ChangeMyPosition";
Debug.ShouldStop(512);
_changemyposition();
 };
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetyperequestfields(RemoteObject _object_type,RemoteObject _objecttagcode,RemoteObject _request_type,RemoteObject _tagcode,RemoteObject _actionkey,RemoteObject _repeatcounter,RemoteObject _cla) throws Exception{
try {
		Debug.PushSubsStack("UpdateTyperequestFields (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3093);
if (RapidSub.canDelegate("updatetyperequestfields")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","updatetyperequestfields", _object_type, _objecttagcode, _request_type, _tagcode, _actionkey, _repeatcounter, _cla);}
ResumableSub_UpdateTyperequestFields rsub = new ResumableSub_UpdateTyperequestFields(null,_object_type,_objecttagcode,_request_type,_tagcode,_actionkey,_repeatcounter,_cla);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UpdateTyperequestFields extends BA.ResumableSub {
public ResumableSub_UpdateTyperequestFields(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _object_type,RemoteObject _objecttagcode,RemoteObject _request_type,RemoteObject _tagcode,RemoteObject _actionkey,RemoteObject _repeatcounter,RemoteObject _cla) {
this.parent = parent;
this._object_type = _object_type;
this._objecttagcode = _objecttagcode;
this._request_type = _request_type;
this._tagcode = _tagcode;
this._actionkey = _actionkey;
this._repeatcounter = _repeatcounter;
this._cla = _cla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _object_type;
RemoteObject _objecttagcode;
RemoteObject _request_type;
RemoteObject _tagcode;
RemoteObject _actionkey;
RemoteObject _repeatcounter;
RemoteObject _cla;
RemoteObject _record9 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _ssql = RemoteObject.createImmutable("");
int _ni = 0;
RemoteObject _connect2data = RemoteObject.createImmutable("");
RemoteObject _do_name = RemoteObject.createImmutable("");
RemoteObject _do_field = RemoteObject.createImmutable("");
RemoteObject _do_is_additional = RemoteObject.createImmutable(0);
RemoteObject _task_tagcode = RemoteObject.createImmutable("");
RemoteObject _item_tagcode = RemoteObject.createImmutable("");
RemoteObject _unique_key = RemoteObject.createImmutable("");
RemoteObject _inssql = RemoteObject.createImmutable("");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");
RemoteObject _objsql = RemoteObject.createImmutable("");
RemoteObject _record99 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _nii = 0;
RemoteObject _val = RemoteObject.createImmutable("");
RemoteObject _newsql = RemoteObject.createImmutable("");
RemoteObject _sacladatetime = RemoteObject.createImmutable("");
RemoteObject _saclalatitude = RemoteObject.createImmutable("");
RemoteObject _saclalongitude = RemoteObject.createImmutable("");
RemoteObject _aclsessuser = RemoteObject.createImmutable("");
int step10;
int limit10;
int step48;
int limit48;
int step120;
int limit120;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateTyperequestFields (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3093);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("object_type", _object_type);
Debug.locals.put("objecttagcode", _objecttagcode);
Debug.locals.put("request_type", _request_type);
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("actionkey", _actionkey);
Debug.locals.put("repeatcounter", _repeatcounter);
Debug.locals.put("CLA", _cla);
 BA.debugLineNum = 3099;BA.debugLine="If Utils.NNE(objecttagcode) And Not(objecttagcode";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 92;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_objecttagcode))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_objecttagcode,RemoteObject.createImmutable("__NONE__"))))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3100;BA.debugLine="Private Record9 As Cursor";
Debug.ShouldStop(134217728);
_record9 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("Record9", _record9);
 BA.debugLineNum = 3105;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"gruposo";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 9;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("gruposores")))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 3106;BA.debugLine="Dim sSQL As String = $\"SELECT c.connectmode, c.";
Debug.ShouldStop(2);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT c.connectmode, c.connect2data, b.do_name, b.do_field, b.do_is_additional,\n"),RemoteObject.createImmutable("										b.task_tagcode, b.item_tagcode, b.unique_key, b.data_type, b.title\n"),RemoteObject.createImmutable("										FROM dta_requests_values AS a\n"),RemoteObject.createImmutable("										INNER JOIN dta_tasks_items AS b ON (b.task_tagcode=a.task_tagcode AND b.item_tagcode=a.item_tagcode AND b.unique_key=a.unique_key)\n"),RemoteObject.createImmutable("										INNER JOIN dta_tasks AS c ON (c.tagcode=b.task_tagcode)\n"),RemoteObject.createImmutable("										WHERE a.execute_status>=1\n"),RemoteObject.createImmutable("										AND a.request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										AND a.task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey.runMethod(true,"trim")))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										AND a.repeatcounter='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("										AND ((b.do_name <> '' AND b.do_field <> '' AND c.connect2data <> '') or\n"),RemoteObject.createImmutable("										 (b.do_name = '__TYPEREQUEST__' AND b.do_field <> '' )) and b.task_tagcode=a.task_tagcode")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 3118;BA.debugLine="Dim sSQL As String = $\"SELECT b.connectmode, b.";
Debug.ShouldStop(8192);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,\n"),RemoteObject.createImmutable("										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title\n"),RemoteObject.createImmutable("										FROM dta_tasks_items AS a\n"),RemoteObject.createImmutable("										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)\n"),RemoteObject.createImmutable("										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or\n"),RemoteObject.createImmutable("										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey.runMethod(true,"trim")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 3126;BA.debugLine="Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
Debug.ShouldStop(2097152);
_record9 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 3127;BA.debugLine="If Record9.RowCount > 0 Then";
Debug.ShouldStop(4194304);
if (true) break;

case 10:
//if
this.state = 91;
if (RemoteObject.solveBoolean(">",_record9.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3128;BA.debugLine="For ni = 0 To Record9.RowCount-1";
Debug.ShouldStop(8388608);
if (true) break;

case 13:
//for
this.state = 90;
step10 = 1;
limit10 = RemoteObject.solve(new RemoteObject[] {_record9.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_ni = 0 ;
Debug.locals.put("ni", _ni);
this.state = 93;
if (true) break;

case 93:
//C
this.state = 90;
if ((step10 > 0 && _ni <= limit10) || (step10 < 0 && _ni >= limit10)) this.state = 15;
if (true) break;

case 94:
//C
this.state = 93;
_ni = ((int)(0 + _ni + step10)) ;
Debug.locals.put("ni", _ni);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3129;BA.debugLine="Record9.Position = ni";
Debug.ShouldStop(16777216);
_record9.runMethod(true,"setPosition",BA.numberCast(int.class, _ni));
 BA.debugLineNum = 3130;BA.debugLine="Dim connect2data As String = Record9.GetString";
Debug.ShouldStop(33554432);
_connect2data = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("connect2data")));Debug.locals.put("connect2data", _connect2data);Debug.locals.put("connect2data", _connect2data);
 BA.debugLineNum = 3131;BA.debugLine="Dim do_name As String = Record9.GetString(\"do_";
Debug.ShouldStop(67108864);
_do_name = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_name")));Debug.locals.put("do_name", _do_name);Debug.locals.put("do_name", _do_name);
 BA.debugLineNum = 3132;BA.debugLine="Dim do_field As String = Record9.GetString(\"do";
Debug.ShouldStop(134217728);
_do_field = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("do_field")));Debug.locals.put("do_field", _do_field);Debug.locals.put("do_field", _do_field);
 BA.debugLineNum = 3133;BA.debugLine="Dim do_is_additional As Int = Record9.GetInt(\"";
Debug.ShouldStop(268435456);
_do_is_additional = _record9.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("do_is_additional")));Debug.locals.put("do_is_additional", _do_is_additional);Debug.locals.put("do_is_additional", _do_is_additional);
 BA.debugLineNum = 3134;BA.debugLine="Dim task_tagcode As String = Record9.GetString";
Debug.ShouldStop(536870912);
_task_tagcode = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("task_tagcode")));Debug.locals.put("task_tagcode", _task_tagcode);Debug.locals.put("task_tagcode", _task_tagcode);
 BA.debugLineNum = 3135;BA.debugLine="Dim item_tagcode As String = Record9.GetString";
Debug.ShouldStop(1073741824);
_item_tagcode = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("item_tagcode")));Debug.locals.put("item_tagcode", _item_tagcode);Debug.locals.put("item_tagcode", _item_tagcode);
 BA.debugLineNum = 3136;BA.debugLine="Dim unique_key As String = Record9.GetString(\"";
Debug.ShouldStop(-2147483648);
_unique_key = _record9.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("unique_key")));Debug.locals.put("unique_key", _unique_key);Debug.locals.put("unique_key", _unique_key);
 BA.debugLineNum = 3138;BA.debugLine="If (do_name.ToUpperCase = \"__TYPEREQUEST__\") T";
Debug.ShouldStop(2);
if (true) break;

case 16:
//if
this.state = 89;
if ((RemoteObject.solveBoolean("=",_do_name.runMethod(true,"toUpperCase"),RemoteObject.createImmutable("__TYPEREQUEST__")))) { 
this.state = 18;
}else {
this.state = 56;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 3140;BA.debugLine="If (tagcode.StartsWith(\"IE_\")) Then";
Debug.ShouldStop(8);
if (true) break;

case 19:
//if
this.state = 28;
if ((_tagcode.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("IE_")))).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 3141;BA.debugLine="Dim insSQL As String = $\"insert into dta_req";
Debug.ShouldStop(16);
_inssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_requests_fields (id, request_tagcode, field_tagcode)\n"),RemoteObject.createImmutable("														Select id, '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' as request_tagcode, field_tagcode \n"),RemoteObject.createImmutable("														from dta_typerequests_fields where typerequest_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_request_type))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("														And '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'||field_tagcode not in \n"),RemoteObject.createImmutable("															(Select '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("'||field_tagcode as campo \n"),RemoteObject.createImmutable("															from dta_requests_fields\n"),RemoteObject.createImmutable("															where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("')")));Debug.locals.put("insSQL", _inssql);Debug.locals.put("insSQL", _inssql);
 BA.debugLineNum = 3149;BA.debugLine="Utils.SaveSQLToLog(\"CriaCamposAdicionais\",in";
Debug.ShouldStop(4096);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("CriaCamposAdicionais")),(Object)(_inssql),(Object)(_tagcode));
 BA.debugLineNum = 3150;BA.debugLine="Dim params As Map";
Debug.ShouldStop(8192);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3151;BA.debugLine="params.Initialize";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3152;BA.debugLine="params.Clear";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3153;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3154;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 3155;BA.debugLine="params.Put(\"ACLARequestType\", request_type)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequestType"))),(Object)((_request_type)));
 BA.debugLineNum = 3156;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTag";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3157;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuth";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3158;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3159;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3160;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3161;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceM";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3162;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3163;BA.debugLine="Dim Url As String = $\"https://${ShareCode.AP";
Debug.ShouldStop(67108864);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla-fields/create")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3164;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 22:
//if
this.state = 27;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 3165;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", tagco";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(objects.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_tagcode));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 3167;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeW";
Debug.ShouldStop(1073741824);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3168;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(para";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 27:
//C
this.state = 28;
;
 BA.debugLineNum = 3170;BA.debugLine="Sleep(500)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "updatetyperequestfields"),BA.numberCast(int.class, 500));
this.state = 95;
return;
case 95:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 3174;BA.debugLine="Dim ObjSQL As String = $\"select distinct valu";
Debug.ShouldStop(32);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct value from dta_requests_fields where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' and field_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable("'")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 BA.debugLineNum = 3175;BA.debugLine="Private Record99 As Cursor = Starter.LocalSQL";
Debug.ShouldStop(64);
_record99 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record99 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_objsql)));Debug.locals.put("Record99", _record99);
 BA.debugLineNum = 3176;BA.debugLine="If Record99.RowCount > 0 Then";
Debug.ShouldStop(128);
if (true) break;

case 29:
//if
this.state = 54;
if (RemoteObject.solveBoolean(">",_record99.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 3177;BA.debugLine="For nii = 0 To Record99.RowCount-1";
Debug.ShouldStop(256);
if (true) break;

case 32:
//for
this.state = 53;
step48 = 1;
limit48 = RemoteObject.solve(new RemoteObject[] {_record99.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nii = 0 ;
Debug.locals.put("nii", _nii);
this.state = 96;
if (true) break;

case 96:
//C
this.state = 53;
if ((step48 > 0 && _nii <= limit48) || (step48 < 0 && _nii >= limit48)) this.state = 34;
if (true) break;

case 97:
//C
this.state = 96;
_nii = ((int)(0 + _nii + step48)) ;
Debug.locals.put("nii", _nii);
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 3178;BA.debugLine="Record99.Position = nii";
Debug.ShouldStop(512);
_record99.runMethod(true,"setPosition",BA.numberCast(int.class, _nii));
 BA.debugLineNum = 3179;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty(Rec";
Debug.ShouldStop(1024);
_val = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record99.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 3180;BA.debugLine="Dim NewSQL As String = $\"update dta_request";
Debug.ShouldStop(2048);
_newsql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_status=1, execute_value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_val))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("															and inner_request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(" ")));Debug.locals.put("NewSQL", _newsql);Debug.locals.put("NewSQL", _newsql);
 BA.debugLineNum = 3187;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 35:
//try
this.state = 40;
this.catchState = 39;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 40;
this.catchState = 39;
 BA.debugLineNum = 3188;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(NewSQL)";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_newsql));
 Debug.CheckDeviceExceptions();
if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
 BA.debugLineNum = 3190;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156368993",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
;
 BA.debugLineNum = 3193;BA.debugLine="Dim params As Map";
Debug.ShouldStop(16777216);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3194;BA.debugLine="params.Initialize";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3195;BA.debugLine="params.Clear";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3196;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3197;BA.debugLine="params.Put(\"ACLARequest\", CLA.Request)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_cla.getField(true,"Request" /*RemoteObject*/ ))));
 BA.debugLineNum = 3198;BA.debugLine="params.Put(\"ACLAAction\", CLA.Action)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAAction"))),(Object)((_cla.getField(true,"Action" /*RemoteObject*/ ))));
 BA.debugLineNum = 3199;BA.debugLine="params.Put(\"ACLATask\", CLA.Task)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLATask"))),(Object)((_cla.getField(true,"Task" /*RemoteObject*/ ))));
 BA.debugLineNum = 3200;BA.debugLine="params.Put(\"ACLAItem\",item_tagcode)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAItem"))),(Object)((_item_tagcode)));
 BA.debugLineNum = 3201;BA.debugLine="params.Put(\"ACLAUniqueKey\", unique_key)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAUniqueKey"))),(Object)((_unique_key)));
 BA.debugLineNum = 3203;BA.debugLine="params.Put(\"ACLAValue\", val)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAValue"))),(Object)((_val)));
 BA.debugLineNum = 3204;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAReqCounter"))),(Object)((_repeatcounter)));
 BA.debugLineNum = 3205;BA.debugLine="params.Put(\"ACLARepeatItem\", 0)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatItem"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3206;BA.debugLine="params.Put(\"ACLARepeatField\", 0)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARepeatField"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3207;BA.debugLine="params.Put(\"ACLAInner\", 0)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLAInner"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3209;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTa";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3210;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAut";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3211;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3212;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand";
Debug.ShouldStop(2048);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3213;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel";
Debug.ShouldStop(4096);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3214;BA.debugLine="params.put(\"_deviceMacAddress\", Main.Device";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3215;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3216;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurr";
Debug.ShouldStop(32768);
_sacladatetime = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,objects.mostCurrent.activityBA);Debug.locals.put("sACLADatetime", _sacladatetime);Debug.locals.put("sACLADatetime", _sacladatetime);
 BA.debugLineNum = 3217;BA.debugLine="Private sACLALatitude As String = Utils.IfN";
Debug.ShouldStop(65536);
_saclalatitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lat" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALatitude", _saclalatitude);Debug.locals.put("sACLALatitude", _saclalatitude);
 BA.debugLineNum = 3218;BA.debugLine="Private sACLALongitude As String = Utils.If";
Debug.ShouldStop(131072);
_saclalongitude = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._locationservice._geolocal /*RemoteObject*/ .getField(true,"lon" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sACLALongitude", _saclalongitude);Debug.locals.put("sACLALongitude", _saclalongitude);
 BA.debugLineNum = 3220;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLADatetime"))),(Object)((_sacladatetime)));
 BA.debugLineNum = 3221;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALatitude"))),(Object)((_saclalatitude)));
 BA.debugLineNum = 3222;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLALongitude"))),(Object)((_saclalongitude)));
 BA.debugLineNum = 3223;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_";
Debug.ShouldStop(4194304);
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ;Debug.locals.put("ACLSessUser", _aclsessuser);Debug.locals.put("ACLSessUser", _aclsessuser);
 BA.debugLineNum = 3225;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLSessUser"))),(Object)((_aclsessuser)));
 BA.debugLineNum = 3226;BA.debugLine="params.Put(\"ACLClear\", 0)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLClear"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 3228;BA.debugLine="Dim Url As String = $\"https://${ShareCode.A";
Debug.ShouldStop(134217728);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/clai/update")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 3229;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST";
Debug.ShouldStop(268435456);
if (true) break;

case 41:
//if
this.state = 52;
if ((parent.mostCurrent._utils.runMethod(true,"_int2bool" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._device_request_upload_onexecution /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 43;
}else {
this.state = 51;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 3230;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 44:
//if
this.state = 49;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 BA.debugLineNum = 3231;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLA";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(objects.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_cla.getField(true,"Request" /*RemoteObject*/ )));
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 3233;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Mak";
Debug.ShouldStop(1);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_cla.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_cla.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3234;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(pa";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 49:
//C
this.state = 52;
;
 BA.debugLineNum = 3236;BA.debugLine="Sleep(250)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "updatetyperequestfields"),BA.numberCast(int.class, 250));
this.state = 98;
return;
case 98:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 3238;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Make";
Debug.ShouldStop(32);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_cla.getField(true,"Request" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(_cla.getField(true,"Task" /*RemoteObject*/ ).runMethod(true,"trim")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3239;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(par";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 52:
//C
this.state = 97;
;
 BA.debugLineNum = 3241;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "updatetyperequestfields"),BA.numberCast(int.class, 100));
this.state = 99;
return;
case 99:
//C
this.state = 97;
;
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
Debug.locals.put("nii", _nii);
;
 if (true) break;

case 54:
//C
this.state = 89;
;
 BA.debugLineNum = 3244;BA.debugLine="Record99.Close";
Debug.ShouldStop(2048);
_record99.runVoidMethod ("Close");
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 3252;BA.debugLine="If (do_name = object_type) Then";
Debug.ShouldStop(524288);
if (true) break;

case 57:
//if
this.state = 88;
if ((RemoteObject.solveBoolean("=",_do_name,_object_type))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 3253;BA.debugLine="If (do_is_additional = 1) Then";
Debug.ShouldStop(1048576);
if (true) break;

case 60:
//if
this.state = 73;
if ((RemoteObject.solveBoolean("=",_do_is_additional,BA.numberCast(double.class, 1)))) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 73;
 BA.debugLineNum = 3254;BA.debugLine="Dim ObjSQL As String = $\"select distinct `v";
Debug.ShouldStop(2097152);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct `value` from dta_objects_fields where object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("																		and field_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable("'")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 3257;BA.debugLine="If Utils.FieldInList(do_field, \"address|add";
Debug.ShouldStop(16777216);
if (true) break;

case 65:
//if
this.state = 72;
if (parent.mostCurrent._utils.runMethod(true,"_fieldinlist" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_do_field),(Object)(RemoteObject.createImmutable("address|address2|postalcode|phone|local|latitude|longitude|block|floor|door"))).<Boolean>get().booleanValue()) { 
this.state = 67;
}else 
{ BA.debugLineNum = 3260;BA.debugLine="Else If Utils.FieldInList(do_field, \"name|p";
Debug.ShouldStop(134217728);
if (parent.mostCurrent._utils.runMethod(true,"_fieldinlist" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_do_field),(Object)(RemoteObject.createImmutable("name|phone|email|mobile"))).<Boolean>get().booleanValue()) { 
this.state = 69;
}else {
this.state = 71;
}}
if (true) break;

case 67:
//C
this.state = 72;
 BA.debugLineNum = 3258;BA.debugLine="Dim ObjSQL As String = $\"select distinct $";
Debug.ShouldStop(33554432);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable(" as `value` from dta_locations where tagcode in\n"),RemoteObject.createImmutable("																	(select local_tagcode from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttagcode))),RemoteObject.createImmutable("')")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 69:
//C
this.state = 72;
 BA.debugLineNum = 3261;BA.debugLine="Dim ObjSQL As String = $\"select distinct $";
Debug.ShouldStop(268435456);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable(" as `value` from dta_contacts where tagcode in\n"),RemoteObject.createImmutable("															(select contact_tagcode from dta_objects_contacts where object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttagcode))),RemoteObject.createImmutable("' limit 1)")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 3264;BA.debugLine="Dim ObjSQL As String = $\"select distinct $";
Debug.ShouldStop(-2147483648);
_objsql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_do_field))),RemoteObject.createImmutable(" as `value` from dta_objects where tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttagcode))),RemoteObject.createImmutable("'")));Debug.locals.put("ObjSQL", _objsql);Debug.locals.put("ObjSQL", _objsql);
 if (true) break;

case 72:
//C
this.state = 73;
;
 BA.debugLineNum = 3267;BA.debugLine="Log(ObjSQL)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156369070",_objsql,0);
 if (true) break;

case 73:
//C
this.state = 74;
;
 BA.debugLineNum = 3269;BA.debugLine="Private Record99 As Cursor = Starter.LocalSQ";
Debug.ShouldStop(16);
_record99 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_record99 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_objsql)));Debug.locals.put("Record99", _record99);
 BA.debugLineNum = 3270;BA.debugLine="If Record99.RowCount > 0 Then";
Debug.ShouldStop(32);
if (true) break;

case 74:
//if
this.state = 87;
if (RemoteObject.solveBoolean(">",_record99.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 3271;BA.debugLine="For nii = 0 To Record99.RowCount-1";
Debug.ShouldStop(64);
if (true) break;

case 77:
//for
this.state = 86;
step120 = 1;
limit120 = RemoteObject.solve(new RemoteObject[] {_record99.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_nii = 0 ;
Debug.locals.put("nii", _nii);
this.state = 100;
if (true) break;

case 100:
//C
this.state = 86;
if ((step120 > 0 && _nii <= limit120) || (step120 < 0 && _nii >= limit120)) this.state = 79;
if (true) break;

case 101:
//C
this.state = 100;
_nii = ((int)(0 + _nii + step120)) ;
Debug.locals.put("nii", _nii);
if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 3272;BA.debugLine="Record99.Position = nii";
Debug.ShouldStop(128);
_record99.runMethod(true,"setPosition",BA.numberCast(int.class, _nii));
 BA.debugLineNum = 3273;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty(Re";
Debug.ShouldStop(256);
_val = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_record99.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("value")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("val", _val);Debug.locals.put("val", _val);
 BA.debugLineNum = 3274;BA.debugLine="Dim NewSQL As String = $\"update dta_reques";
Debug.ShouldStop(512);
_newsql = (RemoteObject.concat(RemoteObject.createImmutable("update dta_requests_values set execute_status=1, execute_value='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_val))),RemoteObject.createImmutable("',\n"),RemoteObject.createImmutable("															object_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_objecttagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															where request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable("' \n"),RemoteObject.createImmutable("															and inner_request_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actionkey))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and task_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_task_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and item_tagcode='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item_tagcode))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and unique_key='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_unique_key))),RemoteObject.createImmutable("'\n"),RemoteObject.createImmutable("															and repeatcounter="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_repeatcounter))),RemoteObject.createImmutable(" ")));Debug.locals.put("NewSQL", _newsql);Debug.locals.put("NewSQL", _newsql);
 BA.debugLineNum = 3282;BA.debugLine="Log(NewSQL)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156369085",_newsql,0);
 BA.debugLineNum = 3283;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 80:
//try
this.state = 85;
this.catchState = 84;
this.state = 82;
if (true) break;

case 82:
//C
this.state = 85;
this.catchState = 84;
 BA.debugLineNum = 3284;BA.debugLine="Utils.SaveSQLToLog(\"ListaPrincipal_ItemCl";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString("ListaPrincipal_ItemClick")),(Object)(_newsql),(Object)(_tagcode));
 Debug.CheckDeviceExceptions();
if (true) break;

case 84:
//C
this.state = 85;
this.catchState = 0;
 BA.debugLineNum = 3287;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156369090",(RemoteObject.concat(RemoteObject.createImmutable("Erro de campo: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",objects.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 85:
//C
this.state = 101;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 86:
//C
this.state = 87;
Debug.locals.put("nii", _nii);
;
 if (true) break;

case 87:
//C
this.state = 88;
;
 BA.debugLineNum = 3291;BA.debugLine="Record99.Close";
Debug.ShouldStop(67108864);
_record99.runVoidMethod ("Close");
 if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;

case 89:
//C
this.state = 94;
;
 if (true) break;
if (true) break;

case 90:
//C
this.state = 91;
Debug.locals.put("ni", _ni);
;
 if (true) break;

case 91:
//C
this.state = 92;
;
 BA.debugLineNum = 3298;BA.debugLine="Record9.Close";
Debug.ShouldStop(2);
_record9.runVoidMethod ("Close");
 if (true) break;

case 92:
//C
this.state = -1;
;
 BA.debugLineNum = 3300;BA.debugLine="Log(\"UpdateTyperequestFields\")";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156369103",RemoteObject.createImmutable("UpdateTyperequestFields"),0);
 BA.debugLineNum = 3301;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "updatetyperequestfields"),BA.numberCast(int.class, 100));
this.state = 102;
return;
case 102:
//C
this.state = -1;
;
 BA.debugLineNum = 3302;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3303;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",objects.processBA, e0.toString());}
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
public static void  _uploadnewrequest2server(RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3308);
if (RapidSub.canDelegate("uploadnewrequest2server")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","uploadnewrequest2server", _tagcode, _items, _origin); return;}
ResumableSub_UploadNewRequest2Server rsub = new ResumableSub_UploadNewRequest2Server(null,_tagcode,_items,_origin);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UploadNewRequest2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _tagcode;
RemoteObject _items;
RemoteObject _origin;
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,3308);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("items", _items);
Debug.locals.put("origin", _origin);
 BA.debugLineNum = 3309;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(4096);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 3310;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(8192);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 3311;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(16384);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 3313;BA.debugLine="Dim params As Map";
Debug.ShouldStop(65536);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3314;BA.debugLine="params.Initialize";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3315;BA.debugLine="params.Clear";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3316;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 3317;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3318;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3319;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 3320;BA.debugLine="params.Put(\"origin\", origin)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)((_origin)));
 BA.debugLineNum = 3321;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 3322;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3323;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3324;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3325;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3326;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3327;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3328;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3329;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(1);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 3330;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(2);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 3331;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(4);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 3333;BA.debugLine="Log(data)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156434457",_data,0);
 BA.debugLineNum = 3335;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(64);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 3336;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3337;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 3338;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,objects.processBA,(Object)(BA.ObjectToString("")),(Object)(objects.getObject()));
 BA.debugLineNum = 3339;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(1024);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 3340;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 3341;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "uploadnewrequest2server"), (_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 3342;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//if
this.state = 9;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 3343;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6156434467",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 3345;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(65536);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3346;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 9:
//C
this.state = 12;
;
 BA.debugLineNum = 3348;BA.debugLine="Job.Release";
Debug.ShouldStop(524288);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 3350;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(2097152);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 3351;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(4194304);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 3353;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
public static RemoteObject  _uploadnewrequest2server2(RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin,RemoteObject _reqtype) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server2 (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2446);
if (RapidSub.canDelegate("uploadnewrequest2server2")) { return xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","uploadnewrequest2server2", _tagcode, _items, _origin, _reqtype);}
ResumableSub_UploadNewRequest2Server2 rsub = new ResumableSub_UploadNewRequest2Server2(null,_tagcode,_items,_origin,_reqtype);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_UploadNewRequest2Server2 extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server2(xevolution.vrcg.devdemov2400.objects parent,RemoteObject _tagcode,RemoteObject _items,RemoteObject _origin,RemoteObject _reqtype) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
this._reqtype = _reqtype;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;
RemoteObject _tagcode;
RemoteObject _items;
RemoteObject _origin;
RemoteObject _reqtype;
RemoteObject _retvalue = RemoteObject.createImmutable("");
RemoteObject _listofmaps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _json1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapjson = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _url = RemoteObject.createImmutable("");
RemoteObject _workernd = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._workernewdata");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UploadNewRequest2Server2 (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,2446);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("tagcode", _tagcode);
Debug.locals.put("items", _items);
Debug.locals.put("origin", _origin);
Debug.locals.put("reqtype", _reqtype);
 BA.debugLineNum = 2447;BA.debugLine="Dim RetValue As String = \"\"";
Debug.ShouldStop(16384);
_retvalue = BA.ObjectToString("");Debug.locals.put("RetValue", _retvalue);Debug.locals.put("RetValue", _retvalue);
 BA.debugLineNum = 2448;BA.debugLine="Dim ListOfMaps As List";
Debug.ShouldStop(32768);
_listofmaps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ListOfMaps", _listofmaps);
 BA.debugLineNum = 2449;BA.debugLine="ListOfMaps.Initialize";
Debug.ShouldStop(65536);
_listofmaps.runVoidMethod ("Initialize");
 BA.debugLineNum = 2450;BA.debugLine="ListOfMaps.Add(items)";
Debug.ShouldStop(131072);
_listofmaps.runVoidMethod ("Add",(Object)((_items.getObject())));
 BA.debugLineNum = 2452;BA.debugLine="Dim params As Map";
Debug.ShouldStop(524288);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2453;BA.debugLine="params.Initialize";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2454;BA.debugLine="params.Clear";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2455;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 2456;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2457;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 2458;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_tagcode"))),(Object)((_tagcode)));
 BA.debugLineNum = 2459;BA.debugLine="params.Put(\"origin\", origin)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("origin"))),(Object)((_origin)));
 BA.debugLineNum = 2460;BA.debugLine="params.Put(\"data\", ListOfMaps)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_listofmaps.getObject())));
 BA.debugLineNum = 2462;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 2463;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 2464;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(-2147483648);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 2466;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(2);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/upload/request/new")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 2467;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 18;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2468;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 2469;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,objects.processBA,(Object)(BA.ObjectToString("")),(Object)(objects.getObject()));
 BA.debugLineNum = 2470;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 2471;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(64);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 2472;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", objects.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "uploadnewrequest2server2"), (_job));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 2473;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 4:
//if
this.state = 15;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2474;BA.debugLine="Log(Job.GetString)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","6155844636",_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 2476;BA.debugLine="Dim JSON1 As JSONParser";
Debug.ShouldStop(2048);
_json1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON1", _json1);
 BA.debugLineNum = 2477;BA.debugLine="JSON1.Initialize(Job.GetString)";
Debug.ShouldStop(4096);
_json1.runVoidMethod ("Initialize",(Object)(_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 2478;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
Debug.ShouldStop(8192);
_mapjson = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapjson = _json1.runMethod(false,"NextObject");Debug.locals.put("MapJSON", _mapjson);Debug.locals.put("MapJSON", _mapjson);
 BA.debugLineNum = 2479;BA.debugLine="RetValue = Utils.IfNullOrEmpty(MapJSON.Get(\"new";
Debug.ShouldStop(16384);
_retvalue = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapjson.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("newrequest")))))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("RetValue", _retvalue);
 BA.debugLineNum = 2482;BA.debugLine="Dim params As Map";
Debug.ShouldStop(131072);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 2483;BA.debugLine="params.Initialize";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 2484;BA.debugLine="params.Clear";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 2485;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 2486;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequest"))),(Object)((_tagcode)));
 BA.debugLineNum = 2487;BA.debugLine="params.Put(\"ACLARequestType\", reqtype)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ACLARequestType"))),(Object)((_reqtype)));
 BA.debugLineNum = 2489;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
Debug.ShouldStop(16777216);
_url = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/cla-fields/create")));Debug.locals.put("Url", _url);Debug.locals.put("Url", _url);
 BA.debugLineNum = 2490;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 2491;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", tagcode)";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_callapi" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_params),(Object)(objects.getObject()),(Object)(_url),(Object)(BA.ObjectToString("")),(Object)(_tagcode));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 2493;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
Debug.ShouldStop(268435456);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2494;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_url),(Object)(parent.mostCurrent._utils.runMethod(true,"_maptojson" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_params))),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 12:
//C
this.state = 15;
;
 BA.debugLineNum = 2496;BA.debugLine="Sleep(500)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "uploadnewrequest2server2"),BA.numberCast(int.class, 500));
this.state = 20;
return;
case 20:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 2498;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
Debug.ShouldStop(2);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2499;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 15:
//C
this.state = 18;
;
 BA.debugLineNum = 2501;BA.debugLine="Job.Release";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2503;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
Debug.ShouldStop(64);
_workernd = parent.mostCurrent._types.runMethod(false,"_makeworkernewdata" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 0)),(Object)(_tagcode.runMethod(true,"trim")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("WorkerND", _workernd);Debug.locals.put("WorkerND", _workernd);
 BA.debugLineNum = 2504;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_save2update" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(_serveraddress),(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_workernd));
 if (true) break;

case 18:
//C
this.state = -1;
;
 BA.debugLineNum = 2506;BA.debugLine="Return RetValue";
Debug.ShouldStop(512);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_retvalue));return;};
 BA.debugLineNum = 2507;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
public static void  _windowstatusupdate() throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1063);
if (RapidSub.canDelegate("windowstatusupdate")) { xevolution.vrcg.devdemov2400.objects.remoteMe.runUserSub(false, "objects","windowstatusupdate"); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.objects parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("WindowStatusUpdate (objects) ","objects",48,objects.mostCurrent.activityBA,objects.mostCurrent,1063);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1064;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils.runMethod(true,"_ne" /*RemoteObject*/ ,objects.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1065;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("StopService",objects.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 1066;BA.debugLine="StopService(Comms)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("StopService",objects.processBA,(Object)((parent.mostCurrent._comms.getObject())));
 BA.debugLineNum = 1067;BA.debugLine="StopService(UserService)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StopService",objects.processBA,(Object)((parent.mostCurrent._userservice.getObject())));
 BA.debugLineNum = 1068;BA.debugLine="StopService(Logs)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StopService",objects.processBA,(Object)((parent.mostCurrent._logs.getObject())));
 BA.debugLineNum = 1069;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",objects.processBA,(Object)((parent.mostCurrent._main.getObject())));
 BA.debugLineNum = 1070;BA.debugLine="Sleep(500)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("Sleep",objects.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "objects", "windowstatusupdate"),BA.numberCast(int.class, 500));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
 BA.debugLineNum = 1071;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1073;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
Debug.ShouldStop(65536);
parent.mostCurrent._labelversion.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*RemoteObject*/ ));
 BA.debugLineNum = 1074;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
Debug.ShouldStop(131072);
parent.mostCurrent._labelcopyright.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*RemoteObject*/ ));
 BA.debugLineNum = 1075;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
Debug.ShouldStop(262144);
parent.mostCurrent._mainactiveuser.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*RemoteObject*/ ));
 BA.debugLineNum = 1077;BA.debugLine="ButtonAppNetwork.Enabled = False";
Debug.ShouldStop(1048576);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1078;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
Debug.ShouldStop(2097152);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1079;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//if
this.state = 8;
if ((parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1080;BA.debugLine="ButtonAppNetwork.Enabled = True";
Debug.ShouldStop(8388608);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1081;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
Debug.ShouldStop(16777216);
parent.mostCurrent._buttonappnetwork.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 1084;BA.debugLine="ButtonUserUnavailable.Enabled = False";
Debug.ShouldStop(134217728);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1085;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
Debug.ShouldStop(268435456);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1086;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._usr_state /*RemoteObject*/ ,BA.numberCast(double.class, 0)))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1087;BA.debugLine="ButtonUserUnavailable.Enabled = True";
Debug.ShouldStop(1073741824);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1088;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._buttonuserunavailable.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1091;BA.debugLine="ButtonActionPause.Enabled = False";
Debug.ShouldStop(4);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1092;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
Debug.ShouldStop(8);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorlightsilver /*RemoteObject*/ );
 BA.debugLineNum = 1094;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
Debug.ShouldStop(32);
if (true) break;

case 13:
//if
this.state = 16;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sess_in_pause /*RemoteObject*/ ,BA.numberCast(double.class, 1)))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1095;BA.debugLine="ButtonActionPause.Enabled = True";
Debug.ShouldStop(64);
parent.mostCurrent._buttonactionpause.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1096;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
Debug.ShouldStop(128);
parent.mostCurrent._buttonactionpause.runMethod(true,"setTextColor",parent.mostCurrent._consts._colorredorange /*RemoteObject*/ );
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1098;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItem} / ${To";
Debug.ShouldStop(512);
parent.mostCurrent._listslabelinfo.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._currentlineitem))),RemoteObject.createImmutable(" / "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._totallineitems))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1099;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1100;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
}