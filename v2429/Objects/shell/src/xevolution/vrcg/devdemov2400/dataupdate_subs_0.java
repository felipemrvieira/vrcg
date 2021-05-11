package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class dataupdate_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,60);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 60;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="If (ShareCode.ISPHONE) Then";
Debug.ShouldStop(268435456);
if ((dataupdate.mostCurrent._sharecode._isphone /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="Device.SetScreenOrientation(1)";
Debug.ShouldStop(536870912);
dataupdate._device.runVoidMethod ("SetScreenOrientation",dataupdate.processBA,(Object)(BA.numberCast(int.class, 1)));
 }else {
 BA.debugLineNum = 64;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
Debug.ShouldStop(-2147483648);
dataupdate._device.runVoidMethod ("SetScreenOrientation",dataupdate.processBA,(Object)(dataupdate.mostCurrent._sharecode._device_orientation /*RemoteObject*/ ));
 };
 BA.debugLineNum = 66;BA.debugLine="dataLayout = \"dataupdate_layout\"";
Debug.ShouldStop(2);
dataupdate.mostCurrent._datalayout = BA.ObjectToString("dataupdate_layout");
 BA.debugLineNum = 67;BA.debugLine="Activity.LoadLayout(dataLayout)";
Debug.ShouldStop(4);
dataupdate.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(dataupdate.mostCurrent._datalayout),dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="ButtonWelcomeNext.Text = ShareCode.DataUpdateButt";
Debug.ShouldStop(256);
dataupdate.mostCurrent._buttonwelcomenext.runMethod(true,"setText",BA.ObjectToCharSequence(dataupdate.mostCurrent._sharecode._dataupdatebuttonwelcomenext /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(2048);
dataupdate.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",dataupdate.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="CurrentCounter = 0";
Debug.ShouldStop(4096);
dataupdate._currentcounter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,493);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 493;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,489);
if (RapidSub.canDelegate("activity_resume")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","activity_resume");}
 BA.debugLineNum = 489;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 491;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _backupanddeletetypes() throws Exception{
try {
		Debug.PushSubsStack("BackUpAndDeleteTypes (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2459);
if (RapidSub.canDelegate("backupanddeletetypes")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","backupanddeletetypes");}
ResumableSub_BackUpAndDeleteTypes rsub = new ResumableSub_BackUpAndDeleteTypes(null);
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
public static class ResumableSub_BackUpAndDeleteTypes extends BA.ResumableSub {
public ResumableSub_BackUpAndDeleteTypes(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _res = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("BackUpAndDeleteTypes (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2459);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2461;BA.debugLine="Dim Res As Boolean = True";
Debug.ShouldStop(268435456);
_res = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Res", _res);Debug.locals.put("Res", _res);
 BA.debugLineNum = 2463;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_accessmod";
Debug.ShouldStop(1073741824);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_accessmodetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2464;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_actionreq";
Debug.ShouldStop(-2147483648);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_actionrequesttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2465;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_actiontyp";
Debug.ShouldStop(1);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_actiontypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2466;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_alertrela";
Debug.ShouldStop(2);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_alertrelationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2467;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_alertstyp";
Debug.ShouldStop(4);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_alertstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2468;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_answertyp";
Debug.ShouldStop(8);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_answertypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2469;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_articlest";
Debug.ShouldStop(16);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_articlestypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2470;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_asmodetyp";
Debug.ShouldStop(32);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_asmodetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2471;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_assignedt";
Debug.ShouldStop(64);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_assignedtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2472;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_available";
Debug.ShouldStop(128);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_availabletypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2473;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_cla_itemt";
Debug.ShouldStop(256);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_cla_itemtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2474;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_communica";
Debug.ShouldStop(512);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_communicationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2475;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_component";
Debug.ShouldStop(1024);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_componenttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2476;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_condition";
Debug.ShouldStop(2048);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_conditionstype")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2477;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_conformit";
Debug.ShouldStop(4096);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_conformitytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2478;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_connmodet";
Debug.ShouldStop(8192);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_connmodetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2479;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_contactty";
Debug.ShouldStop(16384);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_contacttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2480;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_contractt";
Debug.ShouldStop(32768);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_contracttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2481;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_dataentry";
Debug.ShouldStop(65536);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_dataentrytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2482;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_datanatur";
Debug.ShouldStop(131072);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_datanaturetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2483;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_datatypes";
Debug.ShouldStop(262144);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_datatypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2484;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_docnature";
Debug.ShouldStop(524288);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_docnaturetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2485;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_documentt";
Debug.ShouldStop(1048576);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_documenttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2486;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_emailacti";
Debug.ShouldStop(2097152);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_emailactiontypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2487;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_emaildriv";
Debug.ShouldStop(4194304);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_emaildriverstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2488;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_emailencr";
Debug.ShouldStop(8388608);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_emailencripttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2489;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entitypar";
Debug.ShouldStop(16777216);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_entityparams")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2490;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entitypro";
Debug.ShouldStop(33554432);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_entityproperties")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2491;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entitytyp";
Debug.ShouldStop(67108864);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_entitytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2492;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entrytype";
Debug.ShouldStop(134217728);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_entrytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2493;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_equipment";
Debug.ShouldStop(268435456);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_equipmentstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2494;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_equipstat";
Debug.ShouldStop(536870912);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_equipstatetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2495;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_eventgrou";
Debug.ShouldStop(1073741824);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_eventgrouptypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2496;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_eventkind";
Debug.ShouldStop(-2147483648);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_eventkindtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2497;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_eventtype";
Debug.ShouldStop(1);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_eventtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2498;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_execmodes";
Debug.ShouldStop(2);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_execmodestypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2499;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_filetypes";
Debug.ShouldStop(4);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_filetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2500;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_formfield";
Debug.ShouldStop(8);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_formfields")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2501;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_formfield";
Debug.ShouldStop(16);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_formfieldstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2502;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_formfield";
Debug.ShouldStop(32);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_formfieldtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2503;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_genders\",";
Debug.ShouldStop(64);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_genders")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2504;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_generalst";
Debug.ShouldStop(128);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_generalstatetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2505;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_gravityty";
Debug.ShouldStop(256);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_gravitytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2506;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_icontypes";
Debug.ShouldStop(512);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_icontypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2507;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_idcards\",";
Debug.ShouldStop(1024);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_idcards")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2508;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_inouttype";
Debug.ShouldStop(2048);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_inouttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2509;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_level3chi";
Debug.ShouldStop(4096);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_level3childtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2510;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_level3mas";
Debug.ShouldStop(8192);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_level3mastertypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2511;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_level3typ";
Debug.ShouldStop(16384);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_level3types")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2512;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_links\", R";
Debug.ShouldStop(32768);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_links")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2513;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_locationt";
Debug.ShouldStop(65536);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_locationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2514;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_mapconten";
Debug.ShouldStop(131072);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_mapcontenttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2515;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_menulocat";
Debug.ShouldStop(262144);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_menulocations")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2516;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_modules\",";
Debug.ShouldStop(524288);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_modules")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2517;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_moneytype";
Debug.ShouldStop(1048576);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_moneytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2518;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_nonccateg";
Debug.ShouldStop(2097152);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_nonccategories")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2519;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_nonconfor";
Debug.ShouldStop(4194304);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_nonconformitytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2520;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_notetypes";
Debug.ShouldStop(8388608);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_notetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2521;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_notifacti";
Debug.ShouldStop(16777216);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_notifactionstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2522;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_notifiori";
Debug.ShouldStop(33554432);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_notifioriginstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2523;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_objectnat";
Debug.ShouldStop(67108864);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_objectnaturetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2524;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_objectrel";
Debug.ShouldStop(134217728);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_objectrelationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2525;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_operation";
Debug.ShouldStop(268435456);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_operationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2526;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_orientati";
Debug.ShouldStop(536870912);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_orientationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2527;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_originsty";
Debug.ShouldStop(1073741824);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_originstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2528;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_originval";
Debug.ShouldStop(-2147483648);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_originvaluetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2529;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_oscilatio";
Debug.ShouldStop(1);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_oscilationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2530;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_papersize";
Debug.ShouldStop(2);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_papersizetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2531;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_paramtype";
Debug.ShouldStop(4);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_paramtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2532;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_paymentme";
Debug.ShouldStop(8);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_paymentmethods")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2533;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_paymentty";
Debug.ShouldStop(16);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_paymenttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2534;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodday";
Debug.ShouldStop(32);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_perioddaytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2535;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodici";
Debug.ShouldStop(64);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_periodicitytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2536;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodsty";
Debug.ShouldStop(128);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_periodstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2537;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodsvi";
Debug.ShouldStop(256);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_periodsviewtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2538;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_priceaffe";
Debug.ShouldStop(512);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_priceaffecttype")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2539;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_pricefrom";
Debug.ShouldStop(1024);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_pricefromtype")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2540;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_printoutt";
Debug.ShouldStop(2048);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_printouttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2541;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_priorityt";
Debug.ShouldStop(4096);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_prioritytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2542;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_propertyt";
Debug.ShouldStop(8192);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_propertytypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2543;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_reasontyp";
Debug.ShouldStop(16384);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_reasontypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2544;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_recipient";
Debug.ShouldStop(32768);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_recipienttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2545;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_relationt";
Debug.ShouldStop(65536);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_relationtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2546;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_repitemst";
Debug.ShouldStop(131072);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_repitemstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2547;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_repreltyp";
Debug.ShouldStop(262144);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_repreltypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2548;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_requestst";
Debug.ShouldStop(524288);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_requeststypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2549;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_resobsgro";
Debug.ShouldStop(1048576);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_resobsgroupstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2550;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_resobstyp";
Debug.ShouldStop(2097152);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_resobstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2551;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_resulttyp";
Debug.ShouldStop(4194304);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_resulttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2552;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_sendtotyp";
Debug.ShouldStop(8388608);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_sendtotypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2553;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_skilltype";
Debug.ShouldStop(16777216);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_skilltypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2554;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_stagetype";
Debug.ShouldStop(33554432);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_stagetype")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2555;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_statetype";
Debug.ShouldStop(67108864);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_statetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2556;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_statusobj";
Debug.ShouldStop(134217728);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_statusobjtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2557;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_statustyp";
Debug.ShouldStop(268435456);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_statustypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2559;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_tasksmode";
Debug.ShouldStop(1073741824);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_tasksmodetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2560;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_taskstype";
Debug.ShouldStop(-2147483648);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_taskstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2561;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_tpgroupst";
Debug.ShouldStop(1);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_tpgroupstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2562;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_trclmodet";
Debug.ShouldStop(2);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_trclmodetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2563;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_tritemsty";
Debug.ShouldStop(4);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_tritemstypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2564;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_unavailab";
Debug.ShouldStop(8);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_unavailabletypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2565;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_unittype\"";
Debug.ShouldStop(16);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_unittype")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2566;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_userlogty";
Debug.ShouldStop(32);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_userlogtypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2567;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_validatio";
Debug.ShouldStop(64);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_validationexectypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2568;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_valuetype";
Debug.ShouldStop(128);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_valuetypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2569;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_zonesaffe";
Debug.ShouldStop(256);
_res = parent.mostCurrent._utils.runMethod(true,"_savesql2fileanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("type_zonesaffecttypes")),(Object)(_res));Debug.locals.put("Res", _res);
 BA.debugLineNum = 2571;BA.debugLine="ShareCode.Types_AlreadyDeleted = True";
Debug.ShouldStop(1024);
parent.mostCurrent._sharecode._types_alreadydeleted /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 2573;BA.debugLine="If Not(Res) Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_res)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2574;BA.debugLine="Log(\"ERRO AO APAGAR OS TYPE_\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661341811",RemoteObject.createImmutable("ERRO AO APAGAR OS TYPE_"),0);
 BA.debugLineNum = 2575;BA.debugLine="Utils.ReverSQLFromFilesAndDelete";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_reversqlfromfilesanddelete" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 2577;BA.debugLine="Return Res";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_res));return;};
 BA.debugLineNum = 2578;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static RemoteObject  _buttonwelcomenext_click() throws Exception{
try {
		Debug.PushSubsStack("ButtonWelcomeNext_Click (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,296);
if (RapidSub.canDelegate("buttonwelcomenext_click")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","buttonwelcomenext_click");}
 BA.debugLineNum = 296;BA.debugLine="Sub ButtonWelcomeNext_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 299;BA.debugLine="CallSubDelayed2(MainMenu, \"StartTheActivity\", Tru";
Debug.ShouldStop(1024);
dataupdate.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",dataupdate.processBA,(Object)((dataupdate.mostCurrent._mainmenu.getObject())),(Object)(BA.ObjectToString("StartTheActivity")),(Object)((dataupdate.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 300;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2048);
dataupdate.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistaofflinereq(RemoteObject _req,RemoteObject _checkedreq,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("createListaOfflineReq (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3976);
if (RapidSub.canDelegate("createlistaofflinereq")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","createlistaofflinereq", _req, _checkedreq, _height);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Req", _req);
Debug.locals.put("checkedReq", _checkedreq);
Debug.locals.put("height", _height);
 BA.debugLineNum = 3976;BA.debugLine="Sub createListaOfflineReq(Req As String, checkedRe";
Debug.ShouldStop(128);
 BA.debugLineNum = 3977;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(256);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 3978;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(512);
_p.runVoidMethod ("Initialize",dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3979;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
Debug.ShouldStop(1024);
dataupdate.mostCurrent._activity.runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(dataupdate.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),dataupdate.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 3980;BA.debugLine="p.LoadLayout(\"ListaOfflineReq\" )";
Debug.ShouldStop(2048);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ListaOfflineReq")),dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 3981;BA.debugLine="p.RemoveView";
Debug.ShouldStop(4096);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 3982;BA.debugLine="ChkReqOffline.Checked = checkedReq";
Debug.ShouldStop(8192);
dataupdate.mostCurrent._chkreqoffline.runMethodAndSync(true,"setChecked",_checkedreq);
 BA.debugLineNum = 3983;BA.debugLine="txtReqOffline.text = Req";
Debug.ShouldStop(16384);
dataupdate.mostCurrent._txtreqoffline.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_req));
 BA.debugLineNum = 3984;BA.debugLine="p.Tag = $\"${Req}|${Utils.Bool2Int(checkedReq)}\"$";
Debug.ShouldStop(32768);
_p.runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_req))),RemoteObject.createImmutable("|"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_checkedreq))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3985;BA.debugLine="Return p";
Debug.ShouldStop(65536);
if (true) return _p;
 BA.debugLineNum = 3986;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deletesqlfiles(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DeleteSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2584);
if (RapidSub.canDelegate("deletesqlfiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","deletesqlfiles", _filename);}
ResumableSub_DeleteSqlFiles rsub = new ResumableSub_DeleteSqlFiles(null,_filename);
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
public static class ResumableSub_DeleteSqlFiles extends BA.ResumableSub {
public ResumableSub_DeleteSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename;
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
int step2;
int limit2;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2584);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 2585;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 12;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2586;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//for
this.state = 11;
step2 = 1;
limit2 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 11;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 6;
if (true) break;

case 14:
//C
this.state = 13;
_i = ((int)(0 + _i + step2)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2587;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(67108864);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2588;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, f";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 10;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2589;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fil";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 10:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2592;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2594;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2595;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static RemoteObject  _deletesqlfilesfromserver(RemoteObject _filename2delete) throws Exception{
try {
		Debug.PushSubsStack("DeleteSqlFilesFromServer (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1343);
if (RapidSub.canDelegate("deletesqlfilesfromserver")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","deletesqlfilesfromserver", _filename2delete);}
ResumableSub_DeleteSqlFilesFromServer rsub = new ResumableSub_DeleteSqlFilesFromServer(null,_filename2delete);
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
public static class ResumableSub_DeleteSqlFilesFromServer extends BA.ResumableSub {
public ResumableSub_DeleteSqlFilesFromServer(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename2delete) {
this.parent = parent;
this._filename2delete = _filename2delete;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename2delete;
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _lstdocs2delete = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname2 = RemoteObject.createImmutable("");
int _f = 0;
RemoteObject _sf = RemoteObject.declareNull("Object");
int step13;
int limit13;
int step28;
int limit28;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DeleteSqlFilesFromServer (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1343);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("filename2delete", _filename2delete);
 BA.debugLineNum = 1345;BA.debugLine="If Utils.NNE(filename2delete) Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 34;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_filename2delete)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1346;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(2);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1347;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(4);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1348;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(8);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1349;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(16);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1350;BA.debugLine="Log(filename2delete)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660751879",_filename2delete,0);
 BA.debugLineNum = 1351;BA.debugLine="Dim LstDocs2Delete As List";
Debug.ShouldStop(64);
_lstdocs2delete = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("LstDocs2Delete", _lstdocs2delete);
 BA.debugLineNum = 1353;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
Debug.ShouldStop(256);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 1354;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "deletesqlfilesfromserver"), _sfl);
this.state = 35;
return;
case 35:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 1355;BA.debugLine="If Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 21;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1357;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 18;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1358;BA.debugLine="LstDocs2Delete.Initialize";
Debug.ShouldStop(8192);
_lstdocs2delete.runVoidMethod ("Initialize");
 BA.debugLineNum = 1359;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(16384);
if (true) break;

case 10:
//for
this.state = 17;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 36;
if (true) break;

case 36:
//C
this.state = 17;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 12;
if (true) break;

case 37:
//C
this.state = 36;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1360;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista d";
Debug.ShouldStop(32768);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.createImmutable("Criando Lista de ficheiros para remocao no servidor"))));
 BA.debugLineNum = 1361;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(65536);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 1362;BA.debugLine="If fName2.Contains(filename2delete) Then";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//if
this.state = 16;
if (_fname2.runMethod(true,"contains",(Object)(_filename2delete)).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1363;BA.debugLine="LstDocs2Delete.Add(files(i).Name)";
Debug.ShouldStop(262144);
_lstdocs2delete.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;

case 16:
//C
this.state = 37;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
Debug.locals.put("i", _i);
;
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1368;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DeleteSQLFile";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("DeleteSQLFilesFromServer")),(Object)(RemoteObject.createImmutable("error getting files list from /db/")));
 BA.debugLineNum = 1369;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1372;BA.debugLine="If LstDocs2Delete.Size = 0 Then";
Debug.ShouldStop(134217728);

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_lstdocs2delete.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1373;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1376;BA.debugLine="For f = 0 To LstDocs2Delete.Size -1";
Debug.ShouldStop(-2147483648);

case 24:
//for
this.state = 33;
step28 = 1;
limit28 = RemoteObject.solve(new RemoteObject[] {_lstdocs2delete.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_f = 0 ;
Debug.locals.put("f", _f);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 33;
if ((step28 > 0 && _f <= limit28) || (step28 < 0 && _f >= limit28)) this.state = 26;
if (true) break;

case 39:
//C
this.state = 38;
_f = ((int)(0 + _f + step28)) ;
Debug.locals.put("f", _f);
if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1377;BA.debugLine="filename2delete = LstDocs2Delete.Get(f)";
Debug.ShouldStop(1);
_filename2delete = BA.ObjectToString(_lstdocs2delete.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f))));Debug.locals.put("filename2delete", _filename2delete);
 BA.debugLineNum = 1378;BA.debugLine="Dim sf As Object = GlobalFTP.DeleteFile(\"/\" & S";
Debug.ShouldStop(2);
_sf = _globalftp.runMethod(false,"DeleteFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename2delete)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1379;BA.debugLine="Wait For (sf) FTP_DeleteCompleted (ServerPath A";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_deletecompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "deletesqlfilesfromserver"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 27;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1381;BA.debugLine="If Success Then";
Debug.ShouldStop(16);
if (true) break;

case 27:
//if
this.state = 32;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 1382;BA.debugLine="Log(filename2delete & \" file was deleted succe";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660751911",RemoteObject.concat(_filename2delete,RemoteObject.createImmutable(" file was deleted successfully")),0);
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1384;BA.debugLine="Log(\"Error deleting file \" & filename2delete)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660751913",RemoteObject.concat(RemoteObject.createImmutable("Error deleting file "),_filename2delete),0);
 if (true) break;

case 32:
//C
this.state = 39;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
Debug.locals.put("f", _f);
;
 BA.debugLineNum = 1388;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2048);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1389;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 1392;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 1394;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _ftp_deletecompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _deletetypesfromtable(RemoteObject _script) throws Exception{
try {
		Debug.PushSubsStack("DeleteTypesFromTable (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2580);
if (RapidSub.canDelegate("deletetypesfromtable")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","deletetypesfromtable", _script);}
Debug.locals.put("script", _script);
 BA.debugLineNum = 2580;BA.debugLine="Sub DeleteTypesFromTable(script As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 2582;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloaddocsonly(RemoteObject _date2watch,RemoteObject _syncdates) throws Exception{
try {
		Debug.PushSubsStack("DownloadDocsOnly (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1980);
if (RapidSub.canDelegate("downloaddocsonly")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","downloaddocsonly", _date2watch, _syncdates);}
ResumableSub_DownloadDocsOnly rsub = new ResumableSub_DownloadDocsOnly(null,_date2watch,_syncdates);
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
public static class ResumableSub_DownloadDocsOnly extends BA.ResumableSub {
public ResumableSub_DownloadDocsOnly(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _date2watch,RemoteObject _syncdates) {
this.parent = parent;
this._date2watch = _date2watch;
this._syncdates = _syncdates;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _date2watch;
RemoteObject _syncdates;
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ftpdocslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaldocs = RemoteObject.createImmutable(0);
RemoteObject _dates2sync = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _idatel = RemoteObject.createImmutable(0L);
RemoteObject _edatel = RemoteObject.createImmutable(0L);
RemoteObject _lmdate = RemoteObject.createImmutable(0L);
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _ftptemplateslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaltemplates = RemoteObject.createImmutable(0);
RemoteObject _fname2 = RemoteObject.createImmutable("");
int step31;
int limit31;
int step68;
int limit68;
int step100;
int limit100;
int step115;
int limit115;
int step147;
int limit147;
int step162;
int limit162;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadDocsOnly (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1980);
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
Debug.locals.put("date2watch", _date2watch);
Debug.locals.put("SyncDates", _syncdates);
 BA.debugLineNum = 1982;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1986;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 1987;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660882951",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1988;BA.debugLine="Log($\" INITIAL : ${ShareCode.APPL_HOST}/${ShareCo";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660882952",(RemoteObject.concat(RemoteObject.createImmutable(" INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 1989;BA.debugLine="Log(\"/docs/\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660882953",RemoteObject.createImmutable("/docs/"),0);
 BA.debugLineNum = 1990;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660882954",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1991;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(64);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1992;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(128);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1993;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(256);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1994;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(512);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1995;BA.debugLine="Dim FTPDOCSLIST As List";
Debug.ShouldStop(1024);
_ftpdocslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPDOCSLIST", _ftpdocslist);
 BA.debugLineNum = 1996;BA.debugLine="Dim TotalDocs As Int = 0";
Debug.ShouldStop(2048);
_totaldocs = BA.numberCast(int.class, 0);Debug.locals.put("TotalDocs", _totaldocs);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 1999;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 6;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2000;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 2001;BA.debugLine="Dim Dates2Sync As List = Regex.Split(\"\\|\", date2";
Debug.ShouldStop(65536);
_dates2sync = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dates2sync = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_date2watch))));Debug.locals.put("Dates2Sync", _dates2sync);Debug.locals.put("Dates2Sync", _dates2sync);
 BA.debugLineNum = 2002;BA.debugLine="Dim iDateL As Long = DateTime.DateParse(Dates2Sy";
Debug.ShouldStop(131072);
_idatel = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_dates2sync.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("iDateL", _idatel);Debug.locals.put("iDateL", _idatel);
 BA.debugLineNum = 2003;BA.debugLine="Dim eDateL As Long = DateTime.DateParse(Dates2Sy";
Debug.ShouldStop(262144);
_edatel = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_dates2sync.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("eDateL", _edatel);Debug.locals.put("eDateL", _edatel);
 BA.debugLineNum = 2004;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
Debug.ShouldStop(524288);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2006;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
Debug.ShouldStop(2097152);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2009;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(16777216);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2010;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"), _sfl);
this.state = 146;
return;
case 146:
//C
this.state = 7;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 2011;BA.debugLine="If Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 48;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 47;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2012;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(134217728);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2013;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 10:
//if
this.state = 45;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2014;BA.debugLine="FTPDOCSLIST.Initialize";
Debug.ShouldStop(536870912);
_ftpdocslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2015;BA.debugLine="TotalDocs = files.Length -1";
Debug.ShouldStop(1073741824);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 2016;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista de";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.createImmutable("Criando Lista de ficheiros para download em :/docs/"))));
 BA.debugLineNum = 2017;BA.debugLine="Sleep(500)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"),BA.numberCast(int.class, 500));
this.state = 147;
return;
case 147:
//C
this.state = 13;
;
 BA.debugLineNum = 2018;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(2);
if (true) break;

case 13:
//for
this.state = 44;
step31 = 1;
limit31 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 148;
if (true) break;

case 148:
//C
this.state = 44;
if ((step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31)) this.state = 15;
if (true) break;

case 149:
//C
this.state = 148;
_i = ((int)(0 + _i + step31)) ;
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2019;BA.debugLine="Dim fName As String = files(i).Name";
Debug.ShouldStop(4);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 2020;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
Debug.ShouldStop(8);
if (true) break;

case 16:
//if
this.state = 43;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)((_fname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT")))))))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2026;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(512);
if (true) break;

case 19:
//if
this.state = 42;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 37;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2027;BA.debugLine="If ShareCode.DownloadDocsFromFTP = True Then";
Debug.ShouldStop(1024);
if (true) break;

case 22:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 24;
}else {
this.state = 30;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2028;BA.debugLine="If (files(i).Timestamp >= iDateL) And (file";
Debug.ShouldStop(2048);
if (true) break;

case 25:
//if
this.state = 28;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_idatel)))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("k",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_edatel))))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2029;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(4096);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 2030;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660882994",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 if (true) break;

case 28:
//C
this.state = 35;
;
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2033;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(65536);
if (true) break;

case 31:
//if
this.state = 34;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_lmdate))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 2034;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(131072);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 2035;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660882999",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 42;
;
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 2039;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 38:
//if
this.state = 41;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_lmdate))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 2040;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(8388608);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 2041;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883005",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 149;
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 45;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2047;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 2048;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883012",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2049;BA.debugLine="Log($\"Total Files Added to /DOCS List = ${FTPDO";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883013",(RemoteObject.concat(RemoteObject.createImmutable("Total Files Added to /DOCS List = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ftpdocslist.runMethod(true,"getSize")))),RemoteObject.createImmutable(" out of a Total of "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2050;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883014",RemoteObject.createImmutable("*************************"),0);
 if (true) break;

case 45:
//C
this.state = 48;
;
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2053;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error gett";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("RunSync")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/")));
 if (true) break;
;
 BA.debugLineNum = 2055;BA.debugLine="If (FTPDOCSLIST.IsInitialized) Then";
Debug.ShouldStop(64);

case 48:
//if
this.state = 71;
if ((_ftpdocslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2056;BA.debugLine="If (FTPDOCSLIST.Size>=1) Then";
Debug.ShouldStop(128);
if (true) break;

case 51:
//if
this.state = 70;
if ((RemoteObject.solveBoolean("g",_ftpdocslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 2057;BA.debugLine="TotalDocs = FTPDOCSLIST.Size-1";
Debug.ShouldStop(256);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_ftpdocslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 2058;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883022",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2059;BA.debugLine="Log(\"Total DOCS : \" & TotalDocs)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883023",RemoteObject.concat(RemoteObject.createImmutable("Total DOCS : "),_totaldocs),0);
 BA.debugLineNum = 2060;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883024",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2061;BA.debugLine="For i=0 To FTPDOCSLIST.Size-1";
Debug.ShouldStop(4096);
if (true) break;

case 54:
//for
this.state = 69;
step68 = 1;
limit68 = RemoteObject.solve(new RemoteObject[] {_ftpdocslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 150;
if (true) break;

case 150:
//C
this.state = 69;
if ((step68 > 0 && _i <= limit68) || (step68 < 0 && _i >= limit68)) this.state = 56;
if (true) break;

case 151:
//C
this.state = 150;
_i = ((int)(0 + _i + step68)) ;
Debug.locals.put("i", _i);
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 2062;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(8192);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/docs/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2063;BA.debugLine="Dim fName As String = FTPDOCSLIST.Get(i)";
Debug.ShouldStop(16384);
_fname = BA.ObjectToString(_ftpdocslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 2064;BA.debugLine="Log(fName)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883028",_fname,0);
 BA.debugLineNum = 2065;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 57:
//try
this.state = 68;
this.catchState = 67;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 60;
this.catchState = 67;
 BA.debugLineNum = 2066;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(131072);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2067;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"), _sf);
this.state = 152;
return;
case 152:
//C
this.state = 60;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2069;BA.debugLine="If Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 60:
//if
this.state = 65;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
 BA.debugLineNum = 2070;BA.debugLine="Log(\"/docs/ : file was download successfully";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883034",RemoteObject.createImmutable("/docs/ : file was download successfully"),0);
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 2072;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883036",RemoteObject.createImmutable("/docs/ : Error downloading file"),0);
 if (true) break;

case 65:
//C
this.state = 68;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 67:
//C
this.state = 68;
this.catchState = 0;
 BA.debugLineNum = 2075;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883039",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 68:
//C
this.state = 151;
this.catchState = 0;
;
 BA.debugLineNum = 2077;BA.debugLine="DUProgressBar(TotalDocs,i)";
Debug.ShouldStop(268435456);
_duprogressbar(_totaldocs,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 69:
//C
this.state = 70;
Debug.locals.put("i", _i);
;
 if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 2085;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883049",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2086;BA.debugLine="Log(\"/docs/templates\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883050",RemoteObject.createImmutable("/docs/templates"),0);
 BA.debugLineNum = 2087;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883051",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2088;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(128);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2089;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(256);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 2090;BA.debugLine="Dim FTPTEMPLATESLIST As List";
Debug.ShouldStop(512);
_ftptemplateslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPTEMPLATESLIST", _ftptemplateslist);
 BA.debugLineNum = 2091;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(1024);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2093;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(4096);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2094;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"), _sfl);
this.state = 153;
return;
case 153:
//C
this.state = 72;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 2095;BA.debugLine="If Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 72:
//if
this.state = 85;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 74;
}else {
this.state = 84;
}if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 2097;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(65536);
if (true) break;

case 75:
//if
this.state = 82;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 2098;BA.debugLine="TotalDocs = files.Length -1";
Debug.ShouldStop(131072);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 2099;BA.debugLine="FTPTEMPLATESLIST.Initialize";
Debug.ShouldStop(262144);
_ftptemplateslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2100;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(524288);
if (true) break;

case 78:
//for
this.state = 81;
step100 = 1;
limit100 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 154;
if (true) break;

case 154:
//C
this.state = 81;
if ((step100 > 0 && _i <= limit100) || (step100 < 0 && _i >= limit100)) this.state = 80;
if (true) break;

case 155:
//C
this.state = 154;
_i = ((int)(0 + _i + step100)) ;
Debug.locals.put("i", _i);
if (true) break;

case 80:
//C
this.state = 155;
 BA.debugLineNum = 2101;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista de";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Criando Lista de ficheiros para download em :/docs/templates/ "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 2102;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(2097152);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2103;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
Debug.ShouldStop(4194304);
_ftptemplateslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
Debug.locals.put("i", _i);
;
 if (true) break;

case 82:
//C
this.state = 85;
;
 if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 2107;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error gett";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("RunSync")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/templates/")));
 if (true) break;
;
 BA.debugLineNum = 2110;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";
Debug.ShouldStop(536870912);

case 85:
//if
this.state = 108;
if ((_ftptemplateslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 2111;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 88:
//if
this.state = 107;
if ((RemoteObject.solveBoolean("g",_ftptemplateslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 2112;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(-2147483648);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2113;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883077",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2114;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883078",RemoteObject.concat(RemoteObject.createImmutable("Total TEMPLATES : "),_totaltemplates),0);
 BA.debugLineNum = 2115;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883079",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2116;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(8);
if (true) break;

case 91:
//for
this.state = 106;
step115 = 1;
limit115 = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 156;
if (true) break;

case 156:
//C
this.state = 106;
if ((step115 > 0 && _i <= limit115) || (step115 < 0 && _i >= limit115)) this.state = 93;
if (true) break;

case 157:
//C
this.state = 156;
_i = ((int)(0 + _i + step115)) ;
Debug.locals.put("i", _i);
if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 2117;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(16);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/docs/templates/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2118;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i)";
Debug.ShouldStop(32);
_fname2 = BA.ObjectToString(_ftptemplateslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2119;BA.debugLine="Log(fName2)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883083",_fname2,0);
 BA.debugLineNum = 2120;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 94:
//try
this.state = 105;
this.catchState = 104;
this.state = 96;
if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 104;
 BA.debugLineNum = 2121;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(256);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2122;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"), _sf);
this.state = 158;
return;
case 158:
//C
this.state = 97;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2124;BA.debugLine="If Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 97:
//if
this.state = 102;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 99;
}else {
this.state = 101;
}if (true) break;

case 99:
//C
this.state = 102;
 BA.debugLineNum = 2125;BA.debugLine="Log(\"/docs/templates/ : file was download su";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883089",RemoteObject.createImmutable("/docs/templates/ : file was download successfully"),0);
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 2128;BA.debugLine="Log(\"/docs/templates/ : Error downloading fi";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883092",RemoteObject.createImmutable("/docs/templates/ : Error downloading file"),0);
 if (true) break;

case 102:
//C
this.state = 105;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 104:
//C
this.state = 105;
this.catchState = 0;
 BA.debugLineNum = 2132;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883096",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 105:
//C
this.state = 157;
this.catchState = 0;
;
 BA.debugLineNum = 2134;BA.debugLine="DUProgressBar(TotalTemplates,i)";
Debug.ShouldStop(2097152);
_duprogressbar(_totaltemplates,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 106:
//C
this.state = 107;
Debug.locals.put("i", _i);
;
 if (true) break;

case 107:
//C
this.state = 108;
;
 if (true) break;

case 108:
//C
this.state = 109;
;
 BA.debugLineNum = 2142;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883106",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2143;BA.debugLine="Log(\"/interno\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883107",RemoteObject.createImmutable("/interno"),0);
 BA.debugLineNum = 2144;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883108",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2145;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(1);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 2146;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 2147;BA.debugLine="Dim FTPTEMPLATESLIST As List";
Debug.ShouldStop(4);
_ftptemplateslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPTEMPLATESLIST", _ftptemplateslist);
 BA.debugLineNum = 2148;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(8);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2150;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
Debug.ShouldStop(32);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.createImmutable("/interno/")));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2151;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"), _sfl);
this.state = 159;
return;
case 159:
//C
this.state = 109;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 2152;BA.debugLine="If Success Then";
Debug.ShouldStop(128);
if (true) break;

case 109:
//if
this.state = 122;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 111;
}else {
this.state = 121;
}if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 2154;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(512);
if (true) break;

case 112:
//if
this.state = 119;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
 BA.debugLineNum = 2155;BA.debugLine="TotalDocs = files.Length -1";
Debug.ShouldStop(1024);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 2156;BA.debugLine="FTPTEMPLATESLIST.Initialize";
Debug.ShouldStop(2048);
_ftptemplateslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2157;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(4096);
if (true) break;

case 115:
//for
this.state = 118;
step147 = 1;
limit147 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 160;
if (true) break;

case 160:
//C
this.state = 118;
if ((step147 > 0 && _i <= limit147) || (step147 < 0 && _i >= limit147)) this.state = 117;
if (true) break;

case 161:
//C
this.state = 160;
_i = ((int)(0 + _i + step147)) ;
Debug.locals.put("i", _i);
if (true) break;

case 117:
//C
this.state = 161;
 BA.debugLineNum = 2158;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista de";
Debug.ShouldStop(8192);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Criando Lista de ficheiros para download em :/interno/ "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 2159;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(16384);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2160;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
Debug.ShouldStop(32768);
_ftptemplateslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;
if (true) break;

case 118:
//C
this.state = 119;
Debug.locals.put("i", _i);
;
 if (true) break;

case 119:
//C
this.state = 122;
;
 if (true) break;

case 121:
//C
this.state = 122;
 BA.debugLineNum = 2164;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error gett";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("RunSync")),(Object)(RemoteObject.createImmutable("error getting files list from /interno/")));
 if (true) break;
;
 BA.debugLineNum = 2167;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";
Debug.ShouldStop(4194304);

case 122:
//if
this.state = 145;
if ((_ftptemplateslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 124;
}if (true) break;

case 124:
//C
this.state = 125;
 BA.debugLineNum = 2168;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 125:
//if
this.state = 144;
if ((RemoteObject.solveBoolean("g",_ftptemplateslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 2169;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(16777216);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 2170;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883134",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2171;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883135",RemoteObject.concat(RemoteObject.createImmutable("Total TEMPLATES : "),_totaltemplates),0);
 BA.debugLineNum = 2172;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883136",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 2173;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(268435456);
if (true) break;

case 128:
//for
this.state = 143;
step162 = 1;
limit162 = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 162;
if (true) break;

case 162:
//C
this.state = 143;
if ((step162 > 0 && _i <= limit162) || (step162 < 0 && _i >= limit162)) this.state = 130;
if (true) break;

case 163:
//C
this.state = 162;
_i = ((int)(0 + _i + step162)) ;
Debug.locals.put("i", _i);
if (true) break;

case 130:
//C
this.state = 131;
 BA.debugLineNum = 2174;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(536870912);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/interno/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2175;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i)";
Debug.ShouldStop(1073741824);
_fname2 = BA.ObjectToString(_ftptemplateslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2176;BA.debugLine="Log(fName2)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883140",_fname2,0);
 BA.debugLineNum = 2177;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 131:
//try
this.state = 142;
this.catchState = 141;
this.state = 133;
if (true) break;

case 133:
//C
this.state = 134;
this.catchState = 141;
 BA.debugLineNum = 2178;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/i";
Debug.ShouldStop(2);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/interno/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2179;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloaddocsonly"), _sf);
this.state = 164;
return;
case 164:
//C
this.state = 134;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2181;BA.debugLine="If Success Then";
Debug.ShouldStop(16);
if (true) break;

case 134:
//if
this.state = 139;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 136;
}else {
this.state = 138;
}if (true) break;

case 136:
//C
this.state = 139;
 BA.debugLineNum = 2182;BA.debugLine="Log(\"/interno/ : file was download successfu";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883146",RemoteObject.createImmutable("/interno/ : file was download successfully"),0);
 if (true) break;

case 138:
//C
this.state = 139;
 BA.debugLineNum = 2185;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883149",RemoteObject.createImmutable("/interno/ : Error downloading file"),0);
 if (true) break;

case 139:
//C
this.state = 142;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 141:
//C
this.state = 142;
this.catchState = 0;
 BA.debugLineNum = 2189;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660883153",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 142:
//C
this.state = 163;
this.catchState = 0;
;
 BA.debugLineNum = 2191;BA.debugLine="DUProgressBar(TotalTemplates,i)";
Debug.ShouldStop(16384);
_duprogressbar(_totaltemplates,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 143:
//C
this.state = 144;
Debug.locals.put("i", _i);
;
 if (true) break;

case 144:
//C
this.state = 145;
;
 if (true) break;

case 145:
//C
this.state = -1;
;
 BA.debugLineNum = 2195;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(262144);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2201;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2202;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 2203;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 2204;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2205;BA.debugLine="ProgressBar1.Visible = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2208;BA.debugLine="ShareCode.AwakeDevice(False)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 2209;BA.debugLine="Return True";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2210;BA.debugLine="End Sub";
Debug.ShouldStop(2);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static void  _ftp_downloadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _downloadfileswithftp(RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2859);
if (RapidSub.canDelegate("downloadfileswithftp")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","downloadfileswithftp", _dlg);}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_dlg);
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
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _dlg) {
this.parent = parent;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _dlg;
RemoteObject _current_counter = RemoteObject.createImmutable(0);
RemoteObject _end_counter = RemoteObject.createImmutable(0);
RemoteObject _current_counter2 = RemoteObject.createImmutable(0);
RemoteObject _end_counter2 = RemoteObject.createImmutable(0);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _folders = null;
RemoteObject _files = null;
int _l1 = 0;
RemoteObject _lmdate = RemoteObject.createImmutable(0L);
int _i = 0;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _sf2 = RemoteObject.declareNull("Object");
int _l2 = 0;
RemoteObject _lmdate2 = RemoteObject.createImmutable(0L);
RemoteObject _fname2 = RemoteObject.createImmutable("");
int step17;
int limit17;
int step23;
int limit23;
int step39;
int limit39;
int step64;
int limit64;
int step70;
int limit70;
int step84;
int limit84;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadFilesWithFTP (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2859);
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
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 2860;BA.debugLine="Dim CURRENT_COUNTER As Int = 0";
Debug.ShouldStop(2048);
_current_counter = BA.numberCast(int.class, 0);Debug.locals.put("CURRENT_COUNTER", _current_counter);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 BA.debugLineNum = 2861;BA.debugLine="Dim END_COUNTER As Int = 0";
Debug.ShouldStop(4096);
_end_counter = BA.numberCast(int.class, 0);Debug.locals.put("END_COUNTER", _end_counter);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 2863;BA.debugLine="Dim CURRENT_COUNTER2 As Int = 0";
Debug.ShouldStop(16384);
_current_counter2 = BA.numberCast(int.class, 0);Debug.locals.put("CURRENT_COUNTER2", _current_counter2);Debug.locals.put("CURRENT_COUNTER2", _current_counter2);
 BA.debugLineNum = 2864;BA.debugLine="Dim END_COUNTER2 As Int = 0";
Debug.ShouldStop(32768);
_end_counter2 = BA.numberCast(int.class, 0);Debug.locals.put("END_COUNTER2", _end_counter2);Debug.locals.put("END_COUNTER2", _end_counter2);
 BA.debugLineNum = 2866;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734919",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2867;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734920",(RemoteObject.concat(RemoteObject.createImmutable(" 		INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 2868;BA.debugLine="Log(\"********************************************";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734921",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 2869;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(1048576);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2870;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(2097152);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2871;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(4194304);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2875;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(67108864);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2880;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesWi";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("DownloadFilesWithFTP")),(Object)(RemoteObject.createImmutable("Start FTP with /docs/")));
 BA.debugLineNum = 2881;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(1);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 2882;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(2);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 2885;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadfileswithftp"), _sfl);
this.state = 107;
return;
case 107:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2886;BA.debugLine="If Success Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 26;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 25;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2888;BA.debugLine="For l1 = 0 To Files.Length - 1";
Debug.ShouldStop(128);
if (true) break;

case 4:
//for
this.state = 7;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_l1 = 0 ;
Debug.locals.put("l1", _l1);
this.state = 108;
if (true) break;

case 108:
//C
this.state = 7;
if ((step17 > 0 && _l1 <= limit17) || (step17 < 0 && _l1 >= limit17)) this.state = 6;
if (true) break;

case 109:
//C
this.state = 108;
_l1 = ((int)(0 + _l1 + step17)) ;
Debug.locals.put("l1", _l1);
if (true) break;

case 6:
//C
this.state = 109;
 BA.debugLineNum = 2889;BA.debugLine="Log($\"/docs/ : ${Files(l1).Name}\"$)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734942",(RemoteObject.concat(RemoteObject.createImmutable("/docs/ : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _l1)).runMethod(true,"getName")))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("l1", _l1);
;
 BA.debugLineNum = 2892;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1) '";
Debug.ShouldStop(2048);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 BA.debugLineNum = 2894;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(8192);
if (true) break;

case 8:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2895;BA.debugLine="FTPFileList.Initialize";
Debug.ShouldStop(16384);
parent.mostCurrent._ftpfilelist.runVoidMethod ("Initialize");
 BA.debugLineNum = 2896;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(32768);
if (true) break;

case 11:
//for
this.state = 22;
step23 = 1;
limit23 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 110;
if (true) break;

case 110:
//C
this.state = 22;
if ((step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23)) this.state = 13;
if (true) break;

case 111:
//C
this.state = 110;
_i = ((int)(0 + _i + step23)) ;
Debug.locals.put("i", _i);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2897;BA.debugLine="Dim fName As String = Files(i).Name";
Debug.ShouldStop(65536);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 2898;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
Debug.ShouldStop(131072);
if (true) break;

case 14:
//if
this.state = 21;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean("=",(_fname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT")))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 2902;BA.debugLine="If (Files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 17:
//if
this.state = 20;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_lmdate))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 2903;BA.debugLine="FTPFileList.Add(Files(i).Name)";
Debug.ShouldStop(4194304);
parent.mostCurrent._ftpfilelist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 111;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("i", _i);
;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2909;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesW";
Debug.ShouldStop(268435456);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("DownloadFilesWithFTP")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/")));
 BA.debugLineNum = 2910;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
Debug.ShouldStop(536870912);
_current_counter = _end_counter;Debug.locals.put("CURRENT_COUNTER", _current_counter);
 if (true) break;
;
 BA.debugLineNum = 2914;BA.debugLine="If (FTPFileList.IsInitialized) Then";
Debug.ShouldStop(2);

case 26:
//if
this.state = 52;
if ((parent.mostCurrent._ftpfilelist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2915;BA.debugLine="If (FTPFileList.Size>=1) Then";
Debug.ShouldStop(4);
if (true) break;

case 29:
//if
this.state = 51;
if ((RemoteObject.solveBoolean("g",parent.mostCurrent._ftpfilelist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2916;BA.debugLine="END_COUNTER = FTPFileList.Size-1";
Debug.ShouldStop(8);
_end_counter = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._ftpfilelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("END_COUNTER", _end_counter);
 BA.debugLineNum = 2917;BA.debugLine="For i=0 To FTPFileList.Size-1";
Debug.ShouldStop(16);
if (true) break;

case 32:
//for
this.state = 50;
step39 = 1;
limit39 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._ftpfilelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 112;
if (true) break;

case 112:
//C
this.state = 50;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 34;
if (true) break;

case 113:
//C
this.state = 112;
_i = ((int)(0 + _i + step39)) ;
Debug.locals.put("i", _i);
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2918;BA.debugLine="Dim fName As String = FTPFileList.Get(i)";
Debug.ShouldStop(32);
_fname = BA.ObjectToString(parent.mostCurrent._ftpfilelist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 2920;BA.debugLine="Log(fName)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734973",_fname,0);
 BA.debugLineNum = 2921;BA.debugLine="Try";
Debug.ShouldStop(256);
if (true) break;

case 35:
//try
this.state = 46;
this.catchState = 45;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 45;
 BA.debugLineNum = 2922;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(512);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2923;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadfileswithftp"), _sf);
this.state = 114;
return;
case 114:
//C
this.state = 38;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2925;BA.debugLine="If Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 38:
//if
this.state = 43;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 BA.debugLineNum = 2926;BA.debugLine="Log(\"/docs/ : file was download successfully";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734979",RemoteObject.createImmutable("/docs/ : file was download successfully"),0);
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2929;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734982",RemoteObject.createImmutable("/docs/ : Error downloading file"),0);
 if (true) break;

case 43:
//C
this.state = 46;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
 BA.debugLineNum = 2933;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661734986",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2936;BA.debugLine="If (FTPFileList.Size-1 > CURRENT_COUNTER) Then";
Debug.ShouldStop(8388608);

case 46:
//if
this.state = 49;
this.catchState = 0;
if ((RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._ftpfilelist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, _current_counter)))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 2937;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
Debug.ShouldStop(16777216);
_current_counter = RemoteObject.solve(new RemoteObject[] {_current_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CURRENT_COUNTER", _current_counter);
 if (true) break;

case 49:
//C
this.state = 113;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
Debug.locals.put("i", _i);
;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 BA.debugLineNum = 2949;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesWi";
Debug.ShouldStop(16);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("DownloadFilesWithFTP")),(Object)(RemoteObject.createImmutable("Start FTP with /docs/templates")));
 BA.debugLineNum = 2950;BA.debugLine="lbldataupdateprocess.Text = \"A descarregar fichei";
Debug.ShouldStop(32);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence("A descarregar ficheiros complementares (templates) do servidor ..."));
 BA.debugLineNum = 2951;BA.debugLine="Dim sf2 As Object = GlobalFTP.List(\"/\" & ShareCod";
Debug.ShouldStop(64);
_sf2 = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"))));Debug.locals.put("sf2", _sf2);Debug.locals.put("sf2", _sf2);
 BA.debugLineNum = 2954;BA.debugLine="Wait For (sf2) FTP_ListCompleted (ServerPath As S";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadfileswithftp"), _sf2);
this.state = 115;
return;
case 115:
//C
this.state = 53;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2955;BA.debugLine="If Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 53:
//if
this.state = 74;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 55;
}else {
this.state = 73;
}if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 2957;BA.debugLine="For l2 = 0 To Files.Length - 1";
Debug.ShouldStop(4096);
if (true) break;

case 56:
//for
this.state = 59;
step64 = 1;
limit64 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_l2 = 0 ;
Debug.locals.put("l2", _l2);
this.state = 116;
if (true) break;

case 116:
//C
this.state = 59;
if ((step64 > 0 && _l2 <= limit64) || (step64 < 0 && _l2 >= limit64)) this.state = 58;
if (true) break;

case 117:
//C
this.state = 116;
_l2 = ((int)(0 + _l2 + step64)) ;
Debug.locals.put("l2", _l2);
if (true) break;

case 58:
//C
this.state = 117;
 BA.debugLineNum = 2958;BA.debugLine="Log($\"/docs/templates/ : ${Files(l2).Name}\"$)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661735011",(RemoteObject.concat(RemoteObject.createImmutable("/docs/templates/ : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _l2)).runMethod(true,"getName")))),RemoteObject.createImmutable(""))),0);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
Debug.locals.put("l2", _l2);
;
 BA.debugLineNum = 2961;BA.debugLine="Dim LMDate2 As Long = Utils.GetLastNDaysLong(1)";
Debug.ShouldStop(65536);
_lmdate2 = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate2", _lmdate2);Debug.locals.put("LMDate2", _lmdate2);
 BA.debugLineNum = 2966;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 60:
//if
this.state = 71;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 2967;BA.debugLine="FTPFileList2.Initialize";
Debug.ShouldStop(4194304);
parent.mostCurrent._ftpfilelist2.runVoidMethod ("Initialize");
 BA.debugLineNum = 2968;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(8388608);
if (true) break;

case 63:
//for
this.state = 70;
step70 = 1;
limit70 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 118;
if (true) break;

case 118:
//C
this.state = 70;
if ((step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70)) this.state = 65;
if (true) break;

case 119:
//C
this.state = 118;
_i = ((int)(0 + _i + step70)) ;
Debug.locals.put("i", _i);
if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 2969;BA.debugLine="Dim fName2 As String = Files(i).Name";
Debug.ShouldStop(16777216);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2970;BA.debugLine="If (fName2.EndsWith(\".png\")) Or (fName2.EndsWi";
Debug.ShouldStop(33554432);
if (true) break;

case 66:
//if
this.state = 69;
if (RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean("=",(_fname2.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT")))),parent.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("dictionary"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 2975;BA.debugLine="FTPFileList2.Add(Files(i).Name)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._ftpfilelist2.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;

case 69:
//C
this.state = 119;
;
 if (true) break;
if (true) break;

case 70:
//C
this.state = 71;
Debug.locals.put("i", _i);
;
 if (true) break;

case 71:
//C
this.state = 74;
;
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 2980;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesW";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("DownloadFilesWithFTP")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/templates/")));
 BA.debugLineNum = 2981;BA.debugLine="CURRENT_COUNTER2 = END_COUNTER2";
Debug.ShouldStop(16);
_current_counter2 = _end_counter2;Debug.locals.put("CURRENT_COUNTER2", _current_counter2);
 if (true) break;
;
 BA.debugLineNum = 2985;BA.debugLine="If (FTPFileList2.IsInitialized) Then";
Debug.ShouldStop(256);

case 74:
//if
this.state = 100;
if ((parent.mostCurrent._ftpfilelist2.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 2986;BA.debugLine="If (FTPFileList2.Size>=1) Then";
Debug.ShouldStop(512);
if (true) break;

case 77:
//if
this.state = 99;
if ((RemoteObject.solveBoolean("g",parent.mostCurrent._ftpfilelist2.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 2987;BA.debugLine="END_COUNTER2 = FTPFileList2.Size-1";
Debug.ShouldStop(1024);
_end_counter2 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._ftpfilelist2.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("END_COUNTER2", _end_counter2);
 BA.debugLineNum = 2988;BA.debugLine="For i=0 To FTPFileList2.Size-1";
Debug.ShouldStop(2048);
if (true) break;

case 80:
//for
this.state = 98;
step84 = 1;
limit84 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._ftpfilelist2.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 120;
if (true) break;

case 120:
//C
this.state = 98;
if ((step84 > 0 && _i <= limit84) || (step84 < 0 && _i >= limit84)) this.state = 82;
if (true) break;

case 121:
//C
this.state = 120;
_i = ((int)(0 + _i + step84)) ;
Debug.locals.put("i", _i);
if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 2989;BA.debugLine="Dim fName2 As String = FTPFileList2.Get(i)";
Debug.ShouldStop(4096);
_fname2 = BA.ObjectToString(parent.mostCurrent._ftpfilelist2.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 2991;BA.debugLine="Log(fName2)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661735044",_fname2,0);
 BA.debugLineNum = 2992;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 83:
//try
this.state = 94;
this.catchState = 93;
this.state = 85;
if (true) break;

case 85:
//C
this.state = 86;
this.catchState = 93;
 BA.debugLineNum = 2993;BA.debugLine="Dim sf2 As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(65536);
_sf2 = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf2", _sf2);Debug.locals.put("sf2", _sf2);
 BA.debugLineNum = 2994;BA.debugLine="Wait For (sf2) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadfileswithftp"), _sf2);
this.state = 122;
return;
case 122:
//C
this.state = 86;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2996;BA.debugLine="If Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 86:
//if
this.state = 91;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 88;
}else {
this.state = 90;
}if (true) break;

case 88:
//C
this.state = 91;
 BA.debugLineNum = 2997;BA.debugLine="Log(\"/docs/templates/ : file was download su";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661735050",RemoteObject.createImmutable("/docs/templates/ : file was download successfully"),0);
 if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 2999;BA.debugLine="Log(\"/docs/templates/ : Error downloading fi";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661735052",RemoteObject.createImmutable("/docs/templates/ : Error downloading file"),0);
 if (true) break;

case 91:
//C
this.state = 94;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 93:
//C
this.state = 94;
this.catchState = 0;
 BA.debugLineNum = 3003;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661735056",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3006;BA.debugLine="If (FTPFileList2.Size-1 > CURRENT_COUNTER2) Th";
Debug.ShouldStop(536870912);

case 94:
//if
this.state = 97;
this.catchState = 0;
if ((RemoteObject.solveBoolean(">",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._ftpfilelist2.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, _current_counter2)))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 3007;BA.debugLine="CURRENT_COUNTER2 = CURRENT_COUNTER2+1";
Debug.ShouldStop(1073741824);
_current_counter2 = RemoteObject.solve(new RemoteObject[] {_current_counter2,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("CURRENT_COUNTER2", _current_counter2);
 if (true) break;

case 97:
//C
this.state = 121;
;
 if (true) break;
if (true) break;

case 98:
//C
this.state = 99;
Debug.locals.put("i", _i);
;
 if (true) break;

case 99:
//C
this.state = 100;
;
 if (true) break;

case 100:
//C
this.state = 101;
;
 BA.debugLineNum = 3019;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1024);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3024;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
Debug.ShouldStop(32768);
if (true) break;

case 101:
//if
this.state = 106;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 103;
}else {
this.state = 105;
}if (true) break;

case 103:
//C
this.state = 106;
 BA.debugLineNum = 3025;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
Debug.ShouldStop(65536);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ));
 if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 3027;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(262144);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 if (true) break;

case 106:
//C
this.state = -1;
;
 BA.debugLineNum = 3030;BA.debugLine="Return True";
Debug.ShouldStop(2097152);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3031;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _downloadsqlfiles(RemoteObject _fileinfo,RemoteObject _filename,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2249);
if (RapidSub.canDelegate("downloadsqlfiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","downloadsqlfiles", _fileinfo, _filename, _isupdate);}
ResumableSub_DownloadSqlFiles rsub = new ResumableSub_DownloadSqlFiles(null,_fileinfo,_filename,_isupdate);
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
public static class ResumableSub_DownloadSqlFiles extends BA.ResumableSub {
public ResumableSub_DownloadSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _fileinfo,RemoteObject _filename,RemoteObject _isupdate) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _fileinfo;
RemoteObject _filename;
RemoteObject _isupdate;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2249);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("fileInfo", _fileinfo);
Debug.locals.put("fileName", _filename);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 2251;BA.debugLine="SqlFilesTotal = 0";
Debug.ShouldStop(1024);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2252;BA.debugLine="Dim res As ResumableSub = GetFirstInstalSqlFilesT";
Debug.ShouldStop(2048);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _getfirstinstalsqlfilestotal(_fileinfo,_isupdate);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2253;BA.debugLine="Wait For(res) complete (result As Int)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfiles"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2254;BA.debugLine="SqlFilesTotal = result";
Debug.ShouldStop(8192);
parent._sqlfilestotal = _result;
 BA.debugLineNum = 2256;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2257;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 2258;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(131072);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2259;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(262144);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2260;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFTP";
Debug.ShouldStop(524288);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadsqlfilewithftp(_filen);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2261;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfiles"), _rs);
this.state = 12;
return;
case 12:
//C
this.state = 11;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 2262;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(2097152);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2263;BA.debugLine="Sleep(1)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfiles"),BA.numberCast(int.class, 1));
this.state = 13;
return;
case 13:
//C
this.state = 11;
;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2265;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 2268;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2269;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _complete(RemoteObject _result) throws Exception{
}
public static RemoteObject  _downloadsqlfilesfirstinstall(RemoteObject _fileinfo,RemoteObject _filename,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFilesFirstInstall (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2271);
if (RapidSub.canDelegate("downloadsqlfilesfirstinstall")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","downloadsqlfilesfirstinstall", _fileinfo, _filename, _isupdate);}
ResumableSub_DownloadSqlFilesFirstInstall rsub = new ResumableSub_DownloadSqlFilesFirstInstall(null,_fileinfo,_filename,_isupdate);
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
public static class ResumableSub_DownloadSqlFilesFirstInstall extends BA.ResumableSub {
public ResumableSub_DownloadSqlFilesFirstInstall(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _fileinfo,RemoteObject _filename,RemoteObject _isupdate) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _fileinfo;
RemoteObject _filename;
RemoteObject _isupdate;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _isfilesdeleted = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
int step9;
int limit9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFilesFirstInstall (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2271);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("fileInfo", _fileinfo);
Debug.locals.put("fileName", _filename);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 2273;BA.debugLine="SqlFilesTotal = 0";
Debug.ShouldStop(1);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 2274;BA.debugLine="Dim res As ResumableSub = GetFirstInstalSqlFilesT";
Debug.ShouldStop(2);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _getfirstinstalsqlfilestotal(_fileinfo,_isupdate);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2275;BA.debugLine="Wait For(res) complete (result As Int)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfilesfirstinstall"), _res);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2276;BA.debugLine="SqlFilesTotal = result";
Debug.ShouldStop(8);
parent._sqlfilestotal = _result;
 BA.debugLineNum = 2278;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(fileName";
Debug.ShouldStop(32);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _deletesqlfiles(_filename);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2279;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Boolean";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfilesfirstinstall"), _res);
this.state = 14;
return;
case 14:
//C
this.state = 1;
_isfilesdeleted = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsFilesDeleted", _isfilesdeleted);
;
 BA.debugLineNum = 2281;BA.debugLine="If(IsFilesDeleted) Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 12;
if ((_isfilesdeleted).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2283;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 11;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2284;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(2048);
if (true) break;

case 7:
//for
this.state = 10;
step9 = 1;
limit9 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step9)) ;
Debug.locals.put("i", _i);
if (true) break;

case 9:
//C
this.state = 16;
 BA.debugLineNum = 2285;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(4096);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2286;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFT";
Debug.ShouldStop(8192);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadsqlfilewithftp(_filen);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2287;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfilesfirstinstall"), _rs);
this.state = 17;
return;
case 17:
//C
this.state = 16;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2290;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 2293;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2294;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _downloadsqlfilesliteupdate(RemoteObject _fileinfo,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFilesLiteUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3476);
if (RapidSub.canDelegate("downloadsqlfilesliteupdate")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","downloadsqlfilesliteupdate", _fileinfo, _filename);}
ResumableSub_DownloadSqlFilesLiteUpdate rsub = new ResumableSub_DownloadSqlFilesLiteUpdate(null,_fileinfo,_filename);
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
public static class ResumableSub_DownloadSqlFilesLiteUpdate extends BA.ResumableSub {
public ResumableSub_DownloadSqlFilesLiteUpdate(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _fileinfo,RemoteObject _filename) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _fileinfo;
RemoteObject _filename;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
int step6;
int limit6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFilesLiteUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3476);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("fileInfo", _fileinfo);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 3478;BA.debugLine="SqlFilesTotal = 0";
Debug.ShouldStop(2097152);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 3479;BA.debugLine="Dim res As ResumableSub = GetLiteUpdateInstalSqlF";
Debug.ShouldStop(4194304);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _getliteupdateinstalsqlfilestotal(_fileinfo);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3480;BA.debugLine="Wait For(res) complete (result As Int)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfilesliteupdate"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 3481;BA.debugLine="SqlFilesTotal = result";
Debug.ShouldStop(16777216);
parent._sqlfilestotal = _result;
 BA.debugLineNum = 3483;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 8;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3484;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step6)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 3485;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(268435456);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 3486;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFTP";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadsqlfilewithftp(_filen);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 3487;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfilesliteupdate"), _rs);
this.state = 12;
return;
case 12:
//C
this.state = 11;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3490;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 3493;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 3494;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _downloadsqlfilewithftp(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFileWithFTP (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2838);
if (RapidSub.canDelegate("downloadsqlfilewithftp")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","downloadsqlfilewithftp", _filename);}
ResumableSub_DownloadSqlFileWithFTP rsub = new ResumableSub_DownloadSqlFileWithFTP(null,_filename);
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
public static class ResumableSub_DownloadSqlFileWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadSqlFileWithFTP(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename;
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DownloadSqlFileWithFTP (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2838);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 2840;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(8388608);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2841;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(16777216);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2842;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(33554432);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2843;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(67108864);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2844;BA.debugLine="Log(filename)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661669382",_filename,0);
 BA.debugLineNum = 2845;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" & S";
Debug.ShouldStop(268435456);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2846;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "downloadsqlfilewithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2848;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 6;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2849;BA.debugLine="Log(filename & \" file was download successfully\"";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661669387",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 2850;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2851;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2853;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(16);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2854;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2855;BA.debugLine="Log(\"Error downloading file \" & filename)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661669393",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 2857;BA.debugLine="End Sub";
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
public static RemoteObject  _duprogressbar(RemoteObject _maxval,RemoteObject _currentval) throws Exception{
try {
		Debug.PushSubsStack("DUProgressBar (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,479);
if (RapidSub.canDelegate("duprogressbar")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","duprogressbar", _maxval, _currentval);}
Debug.locals.put("MaxVal", _maxval);
 BA.debugLineNum = 479;BA.debugLine="Sub DUProgressBar(MaxVal As Int, CurrentVal As Int";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 480;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
Debug.ShouldStop(-2147483648);
_currentval = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_currentval,_maxval}, "*/",0, 0)));Debug.locals.put("CurrentVal", _currentval);Debug.locals.put("CurrentVal", _currentval);
 BA.debugLineNum = 481;BA.debugLine="DataUpdateProgressBar.Progress = CurrentVal";
Debug.ShouldStop(1);
dataupdate.mostCurrent._dataupdateprogressbar.runMethod(true,"setProgress",_currentval);
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _duprogressbar2(RemoteObject _maxval,RemoteObject _currentval) throws Exception{
try {
		Debug.PushSubsStack("DUProgressBar2 (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,484);
if (RapidSub.canDelegate("duprogressbar2")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","duprogressbar2", _maxval, _currentval);}
Debug.locals.put("MaxVal", _maxval);
 BA.debugLineNum = 484;BA.debugLine="Sub DUProgressBar2(MaxVal As Int, CurrentVal As In";
Debug.ShouldStop(8);
 BA.debugLineNum = 485;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
Debug.ShouldStop(16);
_currentval = BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_currentval,_maxval}, "*/",0, 0)));Debug.locals.put("CurrentVal", _currentval);Debug.locals.put("CurrentVal", _currentval);
 BA.debugLineNum = 486;BA.debugLine="DataUpdateProgressBar2.Progress = CurrentVal";
Debug.ShouldStop(32);
dataupdate.mostCurrent._dataupdateprogressbar2.runMethod(true,"setProgress",_currentval);
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _duremovealllocalinfoandsqlfiles() throws Exception{
try {
		Debug.PushSubsStack("DURemoveAllLocalInfoAndSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2212);
if (RapidSub.canDelegate("duremovealllocalinfoandsqlfiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","duremovealllocalinfoandsqlfiles");}
ResumableSub_DURemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_DURemoveAllLocalInfoAndSqlFiles(null);
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
public static class ResumableSub_DURemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_DURemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _locares = RemoteObject.createImmutable(false);
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject group4;
int index4;
int groupLen4;
RemoteObject group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DURemoveAllLocalInfoAndSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2212);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 2214;BA.debugLine="Dim LocaRes As Boolean = False";
Debug.ShouldStop(32);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);Debug.locals.put("LocaRes", _locares);
 BA.debugLineNum = 2215;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "duremovealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",dataupdate.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2216;BA.debugLine="If Success Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 18;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2217;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(256);
if (true) break;

case 4:
//for
this.state = 15;
group4 = _files;
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("F", _f);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 15;
if (index4 < groupLen4) {
this.state = 6;
_f = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("F", _f);}
if (true) break;

case 39:
//C
this.state = 38;
index4++;
Debug.locals.put("F", _f);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2218;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") Then";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 14;
if (_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".info"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2219;BA.debugLine="If Not(F.ToLowerCase.StartsWith(\"firstinstall\"";
Debug.ShouldStop(1024);
if (true) break;

case 10:
//if
this.state = 13;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_f.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("firstinstall"))))).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2220;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_f));
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 39;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
Debug.locals.put("F", _f);
;
 BA.debugLineNum = 2224;BA.debugLine="LocaRes = True";
Debug.ShouldStop(32768);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2226;BA.debugLine="LocaRes = False";
Debug.ShouldStop(131072);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 2229;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "duremovealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",dataupdate.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 40;
return;
case 40:
//C
this.state = 19;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 2230;BA.debugLine="If Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 19:
//if
this.state = 36;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 35;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2231;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(4194304);
if (true) break;

case 22:
//for
this.state = 33;
group17 = _files;
index17 = 0;
groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("F", _f);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 33;
if (index17 < groupLen17) {
this.state = 24;
_f = BA.ObjectToString(group17.runMethod(false,"Get",index17));Debug.locals.put("F", _f);}
if (true) break;

case 42:
//C
this.state = 41;
index17++;
Debug.locals.put("F", _f);
if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 2232;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") Then";
Debug.ShouldStop(8388608);
if (true) break;

case 25:
//if
this.state = 32;
if (_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".sql"))).<Boolean>get().booleanValue()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 2233;BA.debugLine="If Not(F.ToLowerCase.StartsWith(\"firstinstall\"";
Debug.ShouldStop(16777216);
if (true) break;

case 28:
//if
this.state = 31;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_f.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("firstinstall"))))).<Boolean>get().booleanValue()) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 2234;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_f));
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 42;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 36;
Debug.locals.put("F", _f);
;
 BA.debugLineNum = 2238;BA.debugLine="LocaRes = True";
Debug.ShouldStop(536870912);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 2240;BA.debugLine="LocaRes = False";
Debug.ShouldStop(-2147483648);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 2243;BA.debugLine="Return LocaRes";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_locares));return;};
 BA.debugLineNum = 2245;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _executesqlfiles(RemoteObject _filename,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2298);
if (RapidSub.canDelegate("executesqlfiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","executesqlfiles", _filename, _isupdate);}
ResumableSub_ExecuteSqlFiles rsub = new ResumableSub_ExecuteSqlFiles(null,_filename,_isupdate);
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
public static class ResumableSub_ExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_ExecuteSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename,RemoteObject _isupdate) {
this.parent = parent;
this._filename = _filename;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename;
RemoteObject _isupdate;
int _i = 0;
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totallinesofscripts = RemoteObject.createImmutable(0);
int _n = 0;
RemoteObject _sval = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
int step2;
int limit2;
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExecuteSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2298);
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
Debug.locals.put("fileName", _filename);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 2299;BA.debugLine="If(SqlFilesTotal > 0)Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 24;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2300;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//for
this.state = 23;
step2 = 1;
limit2 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 23;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 6;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step2)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2301;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2302;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
Debug.ShouldStop(536870912);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 2303;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(1073741824);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2305;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
 BA.debugLineNum = 2306;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedF";
Debug.ShouldStop(2);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 2308;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661145098",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 2311;BA.debugLine="DataUpdateLabelTarefa.Visible = True";
Debug.ShouldStop(64);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2312;BA.debugLine="DataUpdateProgressBar2.Visible = True";
Debug.ShouldStop(128);
parent.mostCurrent._dataupdateprogressbar2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2314;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(512);
if (true) break;

case 13:
//if
this.state = 22;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2315;BA.debugLine="Dim TotalLinesOfScripts As Int = List1.Size";
Debug.ShouldStop(1024);
_totallinesofscripts = _list1.runMethod(true,"getSize");Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 2316;BA.debugLine="For n = 0 To List1.Size - 1";
Debug.ShouldStop(2048);
if (true) break;

case 16:
//for
this.state = 19;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 19;
if ((step15 > 0 && _n <= limit15) || (step15 < 0 && _n >= limit15)) this.state = 18;
if (true) break;

case 28:
//C
this.state = 27;
_n = ((int)(0 + _n + step15)) ;
Debug.locals.put("n", _n);
if (true) break;

case 18:
//C
this.state = 28;
 BA.debugLineNum = 2317;BA.debugLine="DataUpdateLabelTarefa.Text = ShareCode.MsgExe";
Debug.ShouldStop(4096);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgexecprocact /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totallinesofscripts))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 2318;BA.debugLine="Dim sval As String = List1.Get(n)";
Debug.ShouldStop(8192);
_sval = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("sval", _sval);Debug.locals.put("sval", _sval);
 BA.debugLineNum = 2319;BA.debugLine="Dim rs As ResumableSub = MakeExecuteSqlFiles(";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _makeexecutesqlfiles(_sval,_isupdate);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2320;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "executesqlfiles"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 28;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 2321;BA.debugLine="DUProgressBar2(TotalLinesOfScripts,n)";
Debug.ShouldStop(65536);
_duprogressbar2(_totallinesofscripts,BA.numberCast(int.class, _n));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 22;
Debug.locals.put("n", _n);
;
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2324;BA.debugLine="Utils.logError(\"Update SQL\", ShareCode.SESS_OP";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Update SQL")),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")))));
 if (true) break;

case 22:
//C
this.state = 26;
;
 BA.debugLineNum = 2326;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(2097152);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 BA.debugLineNum = 2327;BA.debugLine="Sleep(1)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "executesqlfiles"),BA.numberCast(int.class, 1));
this.state = 30;
return;
case 30:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2329;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2330;BA.debugLine="DataUpdateProgressBar2.Visible = False";
Debug.ShouldStop(33554432);
parent.mostCurrent._dataupdateprogressbar2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 2331;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 2333;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2334;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _fieldexists(RemoteObject _sql,RemoteObject _tablename,RemoteObject _tablefield) throws Exception{
try {
		Debug.PushSubsStack("FieldExists (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3956);
if (RapidSub.canDelegate("fieldexists")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","fieldexists", _sql, _tablename, _tablefield);}
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _t = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _values = null;
Debug.locals.put("SQL", _sql);
Debug.locals.put("TableName", _tablename);
Debug.locals.put("TableField", _tablefield);
 BA.debugLineNum = 3956;BA.debugLine="Sub FieldExists(SQL As SQL, TableName As String, T";
Debug.ShouldStop(524288);
 BA.debugLineNum = 3957;BA.debugLine="Dim result As Boolean";
Debug.ShouldStop(1048576);
_result = RemoteObject.createImmutable(false);Debug.locals.put("result", _result);
 BA.debugLineNum = 3958;BA.debugLine="result = False";
Debug.ShouldStop(2097152);
_result = dataupdate.mostCurrent.__c.getField(true,"False");Debug.locals.put("result", _result);
 BA.debugLineNum = 3960;BA.debugLine="Dim t As List";
Debug.ShouldStop(8388608);
_t = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("t", _t);
 BA.debugLineNum = 3961;BA.debugLine="t = DBUtils.ExecuteMemoryTable(SQL, \"PRAGMA table";
Debug.ShouldStop(16777216);
_t = dataupdate.mostCurrent._dbutils.runMethod(false,"_executememorytable" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_sql),(Object)(RemoteObject.concat(RemoteObject.createImmutable("PRAGMA table_info ('"),_tablename,RemoteObject.createImmutable("')"))),(Object)((dataupdate.mostCurrent.__c.getField(false,"Null"))),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("t", _t);
 BA.debugLineNum = 3963;BA.debugLine="For i = 0 To t.Size - 1";
Debug.ShouldStop(67108864);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {_t.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3964;BA.debugLine="Dim values() As String";
Debug.ShouldStop(134217728);
_values = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("values", _values);
 BA.debugLineNum = 3965;BA.debugLine="values = t.Get(i)";
Debug.ShouldStop(268435456);
_values = (_t.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("values", _values);
 BA.debugLineNum = 3967;BA.debugLine="If values(1).ToLowerCase = TableField.ToLowerCas";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_values.getArrayElement(true,BA.numberCast(int.class, 1)).runMethod(true,"toLowerCase"),_tablefield.runMethod(true,"toLowerCase"))) { 
 BA.debugLineNum = 3968;BA.debugLine="result = True";
Debug.ShouldStop(-2147483648);
_result = dataupdate.mostCurrent.__c.getField(true,"True");Debug.locals.put("result", _result);
 BA.debugLineNum = 3969;BA.debugLine="Exit";
Debug.ShouldStop(1);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3973;BA.debugLine="Return result";
Debug.ShouldStop(16);
if (true) return _result;
 BA.debugLineNum = 3974;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _firstsubfromlogin() throws Exception{
try {
		Debug.PushSubsStack("FirstSubFromLogin (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,109);
if (RapidSub.canDelegate("firstsubfromlogin")) { xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","firstsubfromlogin"); return;}
ResumableSub_FirstSubFromLogin rsub = new ResumableSub_FirstSubFromLogin(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FirstSubFromLogin extends BA.ResumableSub {
public ResumableSub_FirstSubFromLogin(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _dbu = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _chklocdata = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _res2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _res3 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _lastdoneupdatestr = RemoteObject.createImmutable("");
RemoteObject _lastdoneupdate = RemoteObject.createImmutable(0L);
RemoteObject _lastdueupdate = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FirstSubFromLogin (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,109);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 117;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(1048576);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 118;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 119;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(4194304);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 126;BA.debugLine="Dim DBU As ResumableSub = insert_dta_auth";
Debug.ShouldStop(536870912);
_dbu = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_dbu = _insert_dta_auth();Debug.locals.put("DBU", _dbu);Debug.locals.put("DBU", _dbu);
 BA.debugLineNum = 127;BA.debugLine="Wait For (DBU) Complete (Finished As Boolean)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "firstsubfromlogin"), _dbu);
this.state = 37;
return;
case 37:
//C
this.state = 1;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 BA.debugLineNum = 130;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 131;BA.debugLine="Dim ChkLocData As ResumableSub = UpdateData2Serv";
Debug.ShouldStop(4);
_chklocdata = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_chklocdata = _updatedata2server();Debug.locals.put("ChkLocData", _chklocdata);Debug.locals.put("ChkLocData", _chklocdata);
 BA.debugLineNum = 132;BA.debugLine="Wait For (ChkLocData) Complete (Finished As Bool";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "firstsubfromlogin"), _chklocdata);
this.state = 38;
return;
case 38:
//C
this.state = 4;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Finished", _finished);
;
 if (true) break;
;
 BA.debugLineNum = 144;BA.debugLine="If (ShareCode.FIRSTLOGININDEVICE) Then ' Primeiro";
Debug.ShouldStop(32768);

case 4:
//if
this.state = 11;
if ((parent.mostCurrent._sharecode._firstloginindevice /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 153;BA.debugLine="Dim res As ResumableSub = RunUpdate60Last7Next";
Debug.ShouldStop(16777216);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _runupdate60last7next();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 154;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "firstsubfromlogin"), _res);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 155;BA.debugLine="Log(\"RunUpdate60Last7Next\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659375662",RemoteObject.createImmutable("RunUpdate60Last7Next"),0);
 BA.debugLineNum = 157;BA.debugLine="If (SqlFilesTotal <= 0) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("k",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 158;BA.debugLine="ToastMessageShow(ShareCode.MsgNaoExistemActuali";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgnaoexistemactualizacoes /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 160;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 161;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 162;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 163;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(4);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 167;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(64);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 169;BA.debugLine="If ShareCode.FIRSTDAILYLOGIN Then";
Debug.ShouldStop(256);
if (true) break;

case 12:
//if
this.state = 17;
if (parent.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 170;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(512);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 171;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 172;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(2048);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 174;BA.debugLine="Dim res2 As ResumableSub = RunUpdateOnDay";
Debug.ShouldStop(8192);
_res2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res2 = _runupdateonday();Debug.locals.put("res2", _res2);Debug.locals.put("res2", _res2);
 BA.debugLineNum = 175;BA.debugLine="Wait For(res2) Complete (result As Boolean)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "firstsubfromlogin"), _res2);
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 176;BA.debugLine="Log(\"RunUpdateOnDay\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659375683",RemoteObject.createImmutable("RunUpdateOnDay"),0);
 BA.debugLineNum = 178;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(131072);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 179;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 180;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 181;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(1048576);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 183;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(4194304);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 184;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 185;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
Debug.ShouldStop(67108864);
parent.mostCurrent._sharecode._syncmanualcomponents /*RemoteObject*/ .runVoidMethod ("Initialize");
 BA.debugLineNum = 188;BA.debugLine="ShareCode.SYNC_COMPONENTS = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._sharecode._sync_components /*RemoteObject*/  = BA.ObjectToString("");
 BA.debugLineNum = 189;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 190;BA.debugLine="ShareCode.AutoSyncFromLogin = True";
Debug.ShouldStop(536870912);
parent.mostCurrent._sharecode._autosyncfromlogin /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 191;BA.debugLine="Dim res3 As ResumableSub = RunSync(\"\",False)";
Debug.ShouldStop(1073741824);
_res3 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res3 = _runsync(BA.ObjectToString(""),parent.mostCurrent.__c.getField(true,"False"));Debug.locals.put("res3", _res3);Debug.locals.put("res3", _res3);
 BA.debugLineNum = 192;BA.debugLine="Wait For(res3) Complete (result As Boolean)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "firstsubfromlogin"), _res3);
this.state = 41;
return;
case 41:
//C
this.state = 17;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 193;BA.debugLine="Log(\"First RunSync Auto\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659375700",RemoteObject.createImmutable("First RunSync Auto"),0);
 BA.debugLineNum = 194;BA.debugLine="ShareCode.AutoSyncFromLogin = False";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._autosyncfromlogin /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 195;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(4);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 196;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 197;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 198;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(32);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 201;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareC";
Debug.ShouldStop(256);

case 17:
//if
this.state = 20;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_ON"))))).<Boolean>get().booleanValue()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 202;BA.debugLine="File.Delete(Starter.InternalFolder,$\"${ShareCod";
Debug.ShouldStop(512);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_ON")))));
 if (true) break;
;
 BA.debugLineNum = 205;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareC";
Debug.ShouldStop(4096);

case 20:
//if
this.state = 27;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log"))))).<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 206;BA.debugLine="Dim LastDoneUpdateStr As String = File.ReadStrin";
Debug.ShouldStop(8192);
_lastdoneupdatestr = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))));Debug.locals.put("LastDoneUpdateStr", _lastdoneupdatestr);Debug.locals.put("LastDoneUpdateStr", _lastdoneupdatestr);
 BA.debugLineNum = 207;BA.debugLine="Dim LastDoneUpdate As Long = DateTime.DateParse";
Debug.ShouldStop(16384);
_lastdoneupdate = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_lastdoneupdatestr));Debug.locals.put("LastDoneUpdate", _lastdoneupdate);Debug.locals.put("LastDoneUpdate", _lastdoneupdate);
 BA.debugLineNum = 208;BA.debugLine="Dim LastDueUpdate As Long = Utils.getlastndaysl";
Debug.ShouldStop(32768);
_lastdueupdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("LastDueUpdate", _lastdueupdate);Debug.locals.put("LastDueUpdate", _lastdueupdate);
 BA.debugLineNum = 209;BA.debugLine="If (LastDoneUpdate < = LastDueUpdate) Then";
Debug.ShouldStop(65536);
if (true) break;

case 23:
//if
this.state = 26;
if ((RemoteObject.solveBoolean("k",_lastdoneupdate,_lastdueupdate))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 210;BA.debugLine="InsertAlertSistema(0, LastDoneUpdateStr)";
Debug.ShouldStop(131072);
_insertalertsistema(BA.numberCast(int.class, 0),_lastdoneupdatestr);
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;
;
 BA.debugLineNum = 214;BA.debugLine="If (SqlFilesTotal = 0) Then ToastMessageShow(Sha";
Debug.ShouldStop(2097152);

case 27:
//if
this.state = 32;
if ((RemoteObject.solveBoolean("=",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgnaoexistemactualizacoes /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"True")));
if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 216;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 217;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 218;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 219;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(67108864);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 224;BA.debugLine="If Not(ShareCode.FIRSTLOGININDEVICE) And Not(Shar";
Debug.ShouldStop(-2147483648);
if (true) break;

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._firstloginindevice /*RemoteObject*/ ))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/ )))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 225;BA.debugLine="ButtonWelcomeNext_Click";
Debug.ShouldStop(1);
_buttonwelcomenext_click();
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _generateliteupdatefiles(RemoteObject _tagcodeslist,RemoteObject _jobobject) throws Exception{
try {
		Debug.PushSubsStack("GenerateLiteUpdateFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3563);
if (RapidSub.canDelegate("generateliteupdatefiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","generateliteupdatefiles", _tagcodeslist, _jobobject);}
ResumableSub_GenerateLiteUpdateFiles rsub = new ResumableSub_GenerateLiteUpdateFiles(null,_tagcodeslist,_jobobject);
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
public static class ResumableSub_GenerateLiteUpdateFiles extends BA.ResumableSub {
public ResumableSub_GenerateLiteUpdateFiles(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _tagcodeslist,RemoteObject _jobobject) {
this.parent = parent;
this._tagcodeslist = _tagcodeslist;
this._jobobject = _jobobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _tagcodeslist;
RemoteObject _jobobject;
RemoteObject _returndata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._filedownloadinformation");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GenerateLiteUpdateFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3563);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("tagCodesList", _tagcodeslist);
Debug.locals.put("jobObject", _jobobject);
 BA.debugLineNum = 3564;BA.debugLine="Dim ReturnData As FileDownloadInformation = Types";
Debug.ShouldStop(2048);
_returndata = parent.mostCurrent._types.runMethod(false,"_makefiledownloadinformationclear" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);Debug.locals.put("ReturnData", _returndata);Debug.locals.put("ReturnData", _returndata);
 BA.debugLineNum = 3565;BA.debugLine="If Starter.FirstInstall Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._starter._firstinstall /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3566;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Utils.";
Debug.ShouldStop(8192);
parent.mostCurrent._sharecode._app_last_lite_update_datetime /*RemoteObject*/  = parent.mostCurrent._utils.runMethod(true,"_getlast60days" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 3567;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"GenerateLiteUp";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("GenerateLiteUpdateFiles")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Set APP_LAST_LITE_UPDATE_DATETIME to Date - 60 Days : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_last_lite_update_datetime /*RemoteObject*/ ))),RemoteObject.createImmutable("")))));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3570;BA.debugLine="ReturnData.DownloadFilename = Utils.RandomString";
Debug.ShouldStop(131072);
_returndata.setField ("DownloadFilename" /*RemoteObject*/ ,parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA));
 BA.debugLineNum = 3571;BA.debugLine="Dim params As Map";
Debug.ShouldStop(262144);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3572;BA.debugLine="params.Initialize";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3573;BA.debugLine="params.Clear";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3574;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 3575;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3576;BA.debugLine="params.Put(\"name\", ReturnData.DownloadFilename)";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_returndata.getField(true,"DownloadFilename" /*RemoteObject*/ ))));
 BA.debugLineNum = 3577;BA.debugLine="params.Put(\"datetime\", ShareCode.APP_LAST_LITE_UP";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("datetime"))),(Object)((parent.mostCurrent._sharecode._app_last_lite_update_datetime /*RemoteObject*/ )));
 BA.debugLineNum = 3578;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3579;BA.debugLine="params.Put(\"requestTagcodes\", tagCodesList)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("requestTagcodes"))),(Object)((_tagcodeslist)));
 BA.debugLineNum = 3580;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3581;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3582;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3583;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3584;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3585;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3587;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(4);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 3588;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(8);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 3589;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(16);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 3591;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"GenerateLiteUpd";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("GenerateLiteUpdateFiles")),(Object)(_data));
 BA.debugLineNum = 3592;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(128);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/requests-pending")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 3593;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
Debug.ShouldStop(256);
if (true) break;

case 5:
//if
this.state = 10;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._app_working_local /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 3594;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(512);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 3595;BA.debugLine="Job.Initialize(\"\",jobObject)";
Debug.ShouldStop(1024);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(_jobobject));
 BA.debugLineNum = 3596;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 3597;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
Debug.ShouldStop(4096);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 3598;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "generateliteupdatefiles"), (_job));
this.state = 11;
return;
case 11:
//C
this.state = 10;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 3599;BA.debugLine="ReturnData.Downloaded = Job.Success";
Debug.ShouldStop(16384);
_returndata.setField ("Downloaded" /*RemoteObject*/ ,_job.getField(true,"_success" /*RemoteObject*/ ));
 BA.debugLineNum = 3600;BA.debugLine="Job.Release";
Debug.ShouldStop(32768);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3602;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662193703",RemoteObject.createImmutable("Error APP_WORKING_LOCAL"),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 3604;BA.debugLine="Return ReturnData";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_returndata));return;};
 BA.debugLineNum = 3605;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _getfirstinstalsqlfilestotal(RemoteObject _filename,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("GetFirstInstalSqlFilesTotal (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2698);
if (RapidSub.canDelegate("getfirstinstalsqlfilestotal")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","getfirstinstalsqlfilestotal", _filename, _isupdate);}
ResumableSub_GetFirstInstalSqlFilesTotal rsub = new ResumableSub_GetFirstInstalSqlFilesTotal(null,_filename,_isupdate);
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
public static class ResumableSub_GetFirstInstalSqlFilesTotal extends BA.ResumableSub {
public ResumableSub_GetFirstInstalSqlFilesTotal(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename,RemoteObject _isupdate) {
this.parent = parent;
this._filename = _filename;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename;
RemoteObject _isupdate;
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _total = RemoteObject.createImmutable(0);
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
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group31;
int index31;
int groupLen31;
int step42;
int limit42;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetFirstInstalSqlFilesTotal (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2698);
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
Debug.locals.put("fileName", _filename);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 2700;BA.debugLine="TagCodesString = \"\"";
Debug.ShouldStop(2048);
parent.mostCurrent._tagcodesstring = BA.ObjectToString("");
 BA.debugLineNum = 2701;BA.debugLine="TagCodesTasksString = \"\"";
Debug.ShouldStop(4096);
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString("");
 BA.debugLineNum = 2702;BA.debugLine="TagCodesContactsString = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._tagcodescontactsstring = BA.ObjectToString("");
 BA.debugLineNum = 2703;BA.debugLine="TagCodesLocationsString = \"\"";
Debug.ShouldStop(16384);
parent.mostCurrent._tagcodeslocationsstring = BA.ObjectToString("");
 BA.debugLineNum = 2704;BA.debugLine="TagCodesTPRequestsString = \"\"";
Debug.ShouldStop(32768);
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString("");
 BA.debugLineNum = 2705;BA.debugLine="TagCodesObjectsString = \"\"";
Debug.ShouldStop(65536);
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString("");
 BA.debugLineNum = 2706;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(131072);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2707;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(262144);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2708;BA.debugLine="Dim total As Int = -1";
Debug.ShouldStop(524288);
_total = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 2709;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(1048576);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2710;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(2097152);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2711;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(4194304);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2712;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(8388608);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 2713;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(16777216);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 2714;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(33554432);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 2715;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(67108864);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2716;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//do while
this.state = 63;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2718;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(536870912);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2719;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "getfirstinstalsqlfilestotal"), _sf);
this.state = 64;
return;
case 64:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2721;BA.debugLine="If Success Then";
Debug.ShouldStop(1);
if (true) break;

case 4:
//if
this.state = 62;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 61;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2723;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 7:
//try
this.state = 59;
this.catchState = 58;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 58;
 BA.debugLineNum = 2724;BA.debugLine="Log(fileName & \" file was download successfull";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603866",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 2726;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(32);
if (true) break;

case 10:
//if
this.state = 56;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 12;
}else {
this.state = 28;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2727;BA.debugLine="Dim JsonStruct As String = File.readstring(St";
Debug.ShouldStop(64);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 2728;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(128);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2729;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(256);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 2730;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(512);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2731;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(1024);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 2732;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(2048);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 2733;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(4096);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 2738;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(131072);
if (true) break;

case 13:
//for
this.state = 26;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group31 = _inserts;
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 26;
if (index31 < groupLen31) {
this.state = 15;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group31.runMethod(false,"Get",index31));}
if (true) break;

case 66:
//C
this.state = 65;
index31++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2739;BA.debugLine="Dim mastertagcode As String = colinserts.Get";
Debug.ShouldStop(262144);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 2740;BA.debugLine="Try";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 2741;BA.debugLine="Dim childfield As String = colinserts.Get(\"";
Debug.ShouldStop(1048576);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 58;
 BA.debugLineNum = 2743;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(4194304);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 2744;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603886",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 58;
;
 BA.debugLineNum = 2746;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"";
Debug.ShouldStop(33554432);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 2747;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
Debug.ShouldStop(67108864);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 2748;BA.debugLine="Dim table As String = colinserts.Get(\"table\"";
Debug.ShouldStop(134217728);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 2750;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(536870912);
if (true) break;

case 22:
//for
this.state = 25;
step42 = 1;
limit42 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 25;
if ((step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42)) this.state = 24;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step42)) ;
Debug.locals.put("i", _i);
if (true) break;

case 24:
//C
this.state = 68;
 BA.debugLineNum = 2751;BA.debugLine="Dim res As ResumableSub = DBStructures.Remo";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2752;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "getfirstinstalsqlfilestotal"), _res);
this.state = 69;
return;
case 69:
//C
this.state = 68;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 66;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 56;
Debug.locals.put("colinserts", _colinserts);
;
 BA.debugLineNum = 2757;BA.debugLine="total = Totalfiles";
Debug.ShouldStop(16);
_total = _totalfiles;Debug.locals.put("total", _total);
 BA.debugLineNum = 2758;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(32);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2759;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(64);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2760;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(128);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2761;BA.debugLine="dotry = False";
Debug.ShouldStop(256);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2762;BA.debugLine="trycount = 3";
Debug.ShouldStop(512);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2763;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1024);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2767;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(16384);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2768;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(32768);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2769;BA.debugLine="total = List1.Get(0) ' Numero de ficheiros pa";
Debug.ShouldStop(65536);
_total = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("total", _total);
 BA.debugLineNum = 2770;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(131072);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2771;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2772;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(524288);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2773;BA.debugLine="dotry = False";
Debug.ShouldStop(1048576);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2774;BA.debugLine="trycount = 3";
Debug.ShouldStop(2097152);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2775;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(4194304);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2777;BA.debugLine="If (isupdate) Then";
Debug.ShouldStop(16777216);
if (true) break;

case 29:
//if
this.state = 55;
if ((_isupdate).<Boolean>get().booleanValue()) { 
this.state = 31;
}else {
this.state = 54;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2778;BA.debugLine="TagCodesString = List1.Get(1)";
Debug.ShouldStop(33554432);
parent.mostCurrent._tagcodesstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 2779;BA.debugLine="TagCodesTasksString = List1.Get(2)";
Debug.ShouldStop(67108864);
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 2780;BA.debugLine="TagCodesObjectsString = List1.Get(3)";
Debug.ShouldStop(134217728);
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 2781;BA.debugLine="Dim date As String = List1.Get(4)";
Debug.ShouldStop(268435456);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 4))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2782;BA.debugLine="TagCodesTPRequestsString = List1.Get(5)";
Debug.ShouldStop(536870912);
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 2786;BA.debugLine="Try";
Debug.ShouldStop(2);
if (true) break;

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
 BA.debugLineNum = 2787;BA.debugLine="TagCodesLocationsString = List1.Get(6)";
Debug.ShouldStop(4);
parent.mostCurrent._tagcodeslocationsstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 6))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 58;
 BA.debugLineNum = 2789;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603931",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2792;BA.debugLine="Try";
Debug.ShouldStop(128);

case 37:
//try
this.state = 42;
this.catchState = 58;
this.catchState = 41;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 42;
this.catchState = 41;
 BA.debugLineNum = 2793;BA.debugLine="TagCodesContactsString = List1.Get(7)";
Debug.ShouldStop(256);
parent.mostCurrent._tagcodescontactsstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 7))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 41:
//C
this.state = 42;
this.catchState = 58;
 BA.debugLineNum = 2795;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603937",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2798;BA.debugLine="Try";
Debug.ShouldStop(8192);

case 42:
//try
this.state = 47;
this.catchState = 58;
this.catchState = 46;
this.state = 44;
if (true) break;

case 44:
//C
this.state = 47;
this.catchState = 46;
 BA.debugLineNum = 2799;BA.debugLine="TagCodesWarehousesString = List1.Get(8)";
Debug.ShouldStop(16384);
parent.mostCurrent._tagcodeswarehousesstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 8))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 58;
 BA.debugLineNum = 2801;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603943",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 2804;BA.debugLine="Try";
Debug.ShouldStop(524288);

case 47:
//try
this.state = 52;
this.catchState = 58;
this.catchState = 51;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 52;
this.catchState = 51;
 BA.debugLineNum = 2805;BA.debugLine="TagCodesArticlesString = List1.Get(9)";
Debug.ShouldStop(1048576);
parent.mostCurrent._tagcodesarticlesstring = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 9))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 58;
 BA.debugLineNum = 2807;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603949",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 55;
this.catchState = 58;
;
 BA.debugLineNum = 2811;BA.debugLine="TagCodes.Initialize";
Debug.ShouldStop(67108864);
parent.mostCurrent._tagcodes.runVoidMethod ("Initialize");
 BA.debugLineNum = 2812;BA.debugLine="TagCodes = Regex.Split(\"\\,\", TagCodesString)";
Debug.ShouldStop(134217728);
parent.mostCurrent._tagcodes = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\,")),(Object)(parent.mostCurrent._tagcodesstring))));
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2814;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(536870912);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2815;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(1073741824);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 if (true) break;

case 55:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 59;
;
 BA.debugLineNum = 2820;BA.debugLine="Return total";
Debug.ShouldStop(8);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 58:
//C
this.state = 59;
this.catchState = 0;
 BA.debugLineNum = 2822;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603964",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2823;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(64);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2824;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(128);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdateerroactualizar /*RemoteObject*/ ));
 if (true) break;
if (true) break;

case 59:
//C
this.state = 62;
this.catchState = 0;
;
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2828;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603970",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2829;BA.debugLine="Log(\"Error downloading file \" & fileName)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661603971",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 BA.debugLineNum = 2830;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(8192);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 62:
//C
this.state = 1;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
 BA.debugLineNum = 2834;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(131072);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2835;BA.debugLine="Return total";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 BA.debugLineNum = 2836;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _getfirstinstalsqlfilestotal22(RemoteObject _filename,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("GetFirstInstalSqlFilesTotal22 (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2600);
if (RapidSub.canDelegate("getfirstinstalsqlfilestotal22")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","getfirstinstalsqlfilestotal22", _filename, _isupdate);}
ResumableSub_GetFirstInstalSqlFilesTotal22 rsub = new ResumableSub_GetFirstInstalSqlFilesTotal22(null,_filename,_isupdate);
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
public static class ResumableSub_GetFirstInstalSqlFilesTotal22 extends BA.ResumableSub {
public ResumableSub_GetFirstInstalSqlFilesTotal22(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename,RemoteObject _isupdate) {
this.parent = parent;
this._filename = _filename;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename;
RemoteObject _isupdate;
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ctm = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _jsonstruct = RemoteObject.createImmutable("");
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
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group31;
int index31;
int groupLen31;
int step42;
int limit42;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetFirstInstalSqlFilesTotal22 (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2600);
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
Debug.locals.put("fileName", _filename);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 2602;BA.debugLine="TagCodesString = \"\"";
Debug.ShouldStop(512);
parent.mostCurrent._tagcodesstring = BA.ObjectToString("");
 BA.debugLineNum = 2603;BA.debugLine="TagCodesTasksString = \"\"";
Debug.ShouldStop(1024);
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString("");
 BA.debugLineNum = 2604;BA.debugLine="TagCodesContactsString = \"\"";
Debug.ShouldStop(2048);
parent.mostCurrent._tagcodescontactsstring = BA.ObjectToString("");
 BA.debugLineNum = 2605;BA.debugLine="TagCodesLocationsString = \"\"";
Debug.ShouldStop(4096);
parent.mostCurrent._tagcodeslocationsstring = BA.ObjectToString("");
 BA.debugLineNum = 2606;BA.debugLine="TagCodesTPRequestsString = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString("");
 BA.debugLineNum = 2607;BA.debugLine="TagCodesObjectsString = \"\"";
Debug.ShouldStop(16384);
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString("");
 BA.debugLineNum = 2608;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(32768);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2609;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(65536);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2610;BA.debugLine="Dim total As Int = -1";
Debug.ShouldStop(131072);
_total = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 2611;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(262144);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 2612;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(524288);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 2613;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(1048576);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 2614;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(2097152);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 2615;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(4194304);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 2616;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(8388608);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 2617;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(16777216);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 2618;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//do while
this.state = 36;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2620;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(134217728);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 2621;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "getfirstinstalsqlfilestotal22"), _sf);
this.state = 37;
return;
case 37:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2623;BA.debugLine="If Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 35;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 34;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2625;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 7:
//try
this.state = 32;
this.catchState = 31;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 31;
 BA.debugLineNum = 2626;BA.debugLine="Log(fileName & \" file was download successfull";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661538330",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 2628;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(8);
if (true) break;

case 10:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 12;
}else {
this.state = 28;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 2630;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 2631;BA.debugLine="Dim JsonStruct As String = File.readstring(St";
Debug.ShouldStop(64);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 2632;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 2633;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 2634;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(512);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 2635;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(1024);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 2636;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(2048);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 2641;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(65536);
if (true) break;

case 13:
//for
this.state = 26;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group31 = _inserts;
index31 = 0;
groupLen31 = group31.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 38;
if (true) break;

case 38:
//C
this.state = 26;
if (index31 < groupLen31) {
this.state = 15;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group31.runMethod(false,"Get",index31));}
if (true) break;

case 39:
//C
this.state = 38;
index31++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2642;BA.debugLine="Dim mastertagcode As String = colinserts.Get";
Debug.ShouldStop(131072);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 2643;BA.debugLine="Try";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 2644;BA.debugLine="Dim childfield As String = colinserts.Get(\"";
Debug.ShouldStop(524288);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 31;
 BA.debugLineNum = 2646;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(2097152);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 2647;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661538351",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
;
 BA.debugLineNum = 2649;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"";
Debug.ShouldStop(16777216);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 2650;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
Debug.ShouldStop(33554432);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 2651;BA.debugLine="Dim table As String = colinserts.Get(\"table\"";
Debug.ShouldStop(67108864);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 2653;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(268435456);
if (true) break;

case 22:
//for
this.state = 25;
step42 = 1;
limit42 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 40;
if (true) break;

case 40:
//C
this.state = 25;
if ((step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42)) this.state = 24;
if (true) break;

case 41:
//C
this.state = 40;
_i = ((int)(0 + _i + step42)) ;
Debug.locals.put("i", _i);
if (true) break;

case 24:
//C
this.state = 41;
 BA.debugLineNum = 2654;BA.debugLine="Dim res As ResumableSub = DBStructures.Remo";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2655;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "getfirstinstalsqlfilestotal22"), _res);
this.state = 42;
return;
case 42:
//C
this.state = 41;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 39;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
Debug.locals.put("colinserts", _colinserts);
;
 BA.debugLineNum = 2660;BA.debugLine="total = Totalfiles";
Debug.ShouldStop(8);
_total = _totalfiles;Debug.locals.put("total", _total);
 BA.debugLineNum = 2661;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(16);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2662;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2663;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(64);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2664;BA.debugLine="dotry = False";
Debug.ShouldStop(128);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2665;BA.debugLine="trycount = 3";
Debug.ShouldStop(256);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2666;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(512);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2670;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(8192);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2671;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(16384);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 2672;BA.debugLine="total = List1.Get(0) ' Numero de ficheiros pa";
Debug.ShouldStop(32768);
_total = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("total", _total);
 BA.debugLineNum = 2673;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(65536);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 2674;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2675;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(262144);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 2676;BA.debugLine="dotry = False";
Debug.ShouldStop(524288);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 2677;BA.debugLine="trycount = 3";
Debug.ShouldStop(1048576);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 2678;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2097152);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 29:
//C
this.state = 32;
;
 BA.debugLineNum = 2681;BA.debugLine="Return total";
Debug.ShouldStop(16777216);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
 BA.debugLineNum = 2683;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661538387",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2684;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(134217728);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2688;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661538392",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 2689;BA.debugLine="Log(\"Error downloading file \" & fileName)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661538393",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 BA.debugLineNum = 2690;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(2);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 35:
//C
this.state = 1;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 2694;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 2695;BA.debugLine="Return total";
Debug.ShouldStop(64);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 BA.debugLineNum = 2696;BA.debugLine="End Sub";
Debug.ShouldStop(128);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _getliteupdateinstalsqlfilestotal(RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetLiteUpdateInstalSqlFilesTotal (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3496);
if (RapidSub.canDelegate("getliteupdateinstalsqlfilestotal")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","getliteupdateinstalsqlfilestotal", _filename);}
ResumableSub_GetLiteUpdateInstalSqlFilesTotal rsub = new ResumableSub_GetLiteUpdateInstalSqlFilesTotal(null,_filename);
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
public static class ResumableSub_GetLiteUpdateInstalSqlFilesTotal extends BA.ResumableSub {
public ResumableSub_GetLiteUpdateInstalSqlFilesTotal(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _filename) {
this.parent = parent;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _filename;
RemoteObject _trycount = RemoteObject.createImmutable(0);
RemoteObject _dotry = RemoteObject.createImmutable(false);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _ctm = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lineone = RemoteObject.createImmutable("");
RemoteObject _linetwo = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetLiteUpdateInstalSqlFilesTotal (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3496);
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
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 3498;BA.debugLine="TagCodesString = \"\"";
Debug.ShouldStop(512);
parent.mostCurrent._tagcodesstring = BA.ObjectToString("");
 BA.debugLineNum = 3499;BA.debugLine="TagCodesTasksString = \"\"";
Debug.ShouldStop(1024);
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString("");
 BA.debugLineNum = 3500;BA.debugLine="TagCodesTPRequestsString = \"\"";
Debug.ShouldStop(2048);
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString("");
 BA.debugLineNum = 3501;BA.debugLine="TagCodesObjectsString = \"\"";
Debug.ShouldStop(4096);
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString("");
 BA.debugLineNum = 3502;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(8192);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 3503;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(16384);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 3504;BA.debugLine="Dim total As Int = -1";
Debug.ShouldStop(32768);
_total = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 3505;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(65536);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 3506;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(131072);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 3507;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(262144);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3508;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(524288);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 3509;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(1048576);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 3510;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(2097152);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 3511;BA.debugLine="GlobalFTP.TimeoutMs =240000";
Debug.ShouldStop(4194304);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 3512;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//do while
this.state = 16;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3513;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(16777216);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3514;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "getliteupdateinstalsqlfilestotal"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3516;BA.debugLine="If Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 15;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3518;BA.debugLine="Try";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
 BA.debugLineNum = 3519;BA.debugLine="Log(fileName & \" file was download successfull";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662062615",RemoteObject.concat(_filename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 3520;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(-2147483648);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 3521;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedF";
Debug.ShouldStop(1);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filename));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 3522;BA.debugLine="total = List1.Get(0)";
Debug.ShouldStop(2);
_total = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("total", _total);
 BA.debugLineNum = 3523;BA.debugLine="Dim LineOne As String = List1.Get(1)";
Debug.ShouldStop(4);
_lineone = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("LineOne", _lineone);Debug.locals.put("LineOne", _lineone);
 BA.debugLineNum = 3524;BA.debugLine="Dim LineTwo As String = List1.Get(2)";
Debug.ShouldStop(8);
_linetwo = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("LineTwo", _linetwo);Debug.locals.put("LineTwo", _linetwo);
 BA.debugLineNum = 3526;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3528;BA.debugLine="Return total";
Debug.ShouldStop(128);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 3530;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662062626",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3531;BA.debugLine="trycount = trycount +1";
Debug.ShouldStop(1024);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 0;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 3535;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662062631",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3536;BA.debugLine="Log(\"Error downloading file \" & fileName)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662062632",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filename),0);
 BA.debugLineNum = 3537;BA.debugLine="trycount = trycount +1";
Debug.ShouldStop(65536);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 15:
//C
this.state = 1;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 3542;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2097152);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3543;BA.debugLine="Return total";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_total));return;};
 BA.debugLineNum = 3544;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private lbldataupdatetitle As Label";
dataupdate.mostCurrent._lbldataupdatetitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private PanelCopyData As Panel";
dataupdate.mostCurrent._panelcopydata = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private LabelCopyData As Label";
dataupdate.mostCurrent._labelcopydata = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lbldataupdatecopy As Label";
dataupdate.mostCurrent._lbldataupdatecopy = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private lbldataupdateload As Label";
dataupdate.mostCurrent._lbldataupdateload = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lbldataupdatedownload As Label";
dataupdate.mostCurrent._lbldataupdatedownload = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private ProgressBar1 As ProgressBar";
dataupdate.mostCurrent._progressbar1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lbldataupdateprocess As Label";
dataupdate.mostCurrent._lbldataupdateprocess = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private dataLayout As String";
dataupdate.mostCurrent._datalayout = RemoteObject.createImmutable("");
 //BA.debugLineNum = 25;BA.debugLine="Private ButtonWelcomeNext As Button";
dataupdate.mostCurrent._buttonwelcomenext = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private SqlFilesTotal As Int";
dataupdate._sqlfilestotal = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Private FTPFileList As List";
dataupdate.mostCurrent._ftpfilelist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 28;BA.debugLine="Private FTPFileList2 As List";
dataupdate.mostCurrent._ftpfilelist2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 29;BA.debugLine="Private RequestFileName As String";
dataupdate.mostCurrent._requestfilename = RemoteObject.createImmutable("");
 //BA.debugLineNum = 30;BA.debugLine="Private RequestFileNameHeaders As String";
dataupdate.mostCurrent._requestfilenameheaders = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Private RequestFileNameOnDay As String";
dataupdate.mostCurrent._requestfilenameonday = RemoteObject.createImmutable("");
 //BA.debugLineNum = 32;BA.debugLine="Private TagCodes As List";
dataupdate.mostCurrent._tagcodes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 33;BA.debugLine="Private TagCodesString As String";
dataupdate.mostCurrent._tagcodesstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Private TagCodesTasksString As String";
dataupdate.mostCurrent._tagcodestasksstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Private TagCodesTPRequestsString As String";
dataupdate.mostCurrent._tagcodestprequestsstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Private TagCodesObjectsString As String";
dataupdate.mostCurrent._tagcodesobjectsstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 37;BA.debugLine="Private TagCodesLocationsString As String";
dataupdate.mostCurrent._tagcodeslocationsstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 38;BA.debugLine="Private TagCodesContactsString As String";
dataupdate.mostCurrent._tagcodescontactsstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Private TagCodesWarehousesString As String";
dataupdate.mostCurrent._tagcodeswarehousesstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Private TagCodesArticlesString As String";
dataupdate.mostCurrent._tagcodesarticlesstring = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Private FlagFirstProcessStep As Int = 0";
dataupdate._flagfirstprocessstep = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 42;BA.debugLine="Private LabelUpdateProcess As Label";
dataupdate.mostCurrent._labelupdateprocess = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private ImageDownload As ImageView";
dataupdate.mostCurrent._imagedownload = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private ImageUpload As ImageView";
dataupdate.mostCurrent._imageupload = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private LabelLoadData As Label";
dataupdate.mostCurrent._labelloaddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private LabelDownloadData As Label";
dataupdate.mostCurrent._labeldownloaddata = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private CurrentCounter As Int = 0";
dataupdate._currentcounter = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 48;BA.debugLine="Private IsLoginUpdate As Boolean = False";
dataupdate._isloginupdate = dataupdate.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 49;BA.debugLine="Private FirstInstallUpdateDate As String";
dataupdate.mostCurrent._firstinstallupdatedate = RemoteObject.createImmutable("");
 //BA.debugLineNum = 50;BA.debugLine="Private FirstInstallUpdateDate As String";
dataupdate.mostCurrent._firstinstallupdatedate = RemoteObject.createImmutable("");
 //BA.debugLineNum = 51;BA.debugLine="Private DataUpdateProgressBar As ProgressBar";
dataupdate.mostCurrent._dataupdateprogressbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private DataUpdateLabelTarefa As Label";
dataupdate.mostCurrent._dataupdatelabeltarefa = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private DataUpdateProgressBar2 As ProgressBar";
dataupdate.mostCurrent._dataupdateprogressbar2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private ListaIntervencoesOffline As CustomListVie";
dataupdate.mostCurrent._listaintervencoesoffline = RemoteObject.createNew ("b4a.example3.customlistview");
 //BA.debugLineNum = 55;BA.debugLine="Private ChkReqOffline As CheckBox";
dataupdate.mostCurrent._chkreqoffline = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private txtReqOffline As EditText";
dataupdate.mostCurrent._txtreqoffline = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _insert_dta_auth() throws Exception{
try {
		Debug.PushSubsStack("insert_dta_auth (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3887);
if (RapidSub.canDelegate("insert_dta_auth")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","insert_dta_auth");}
ResumableSub_insert_dta_auth rsub = new ResumableSub_insert_dta_auth(null);
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
public static class ResumableSub_insert_dta_auth extends BA.ResumableSub {
public ResumableSub_insert_dta_auth(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _cleartableauth = RemoteObject.createImmutable("");
RemoteObject _instableauth = RemoteObject.createImmutable("");
RemoteObject _instabledataauth = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("insert_dta_auth (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3887);
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
 BA.debugLineNum = 3889;BA.debugLine="Dim CLearTableAuth As String = $\"drop table dta_a";
Debug.ShouldStop(65536);
_cleartableauth = (RemoteObject.createImmutable("drop table dta_auths;"));Debug.locals.put("CLearTableAuth", _cleartableauth);Debug.locals.put("CLearTableAuth", _cleartableauth);
 BA.debugLineNum = 3891;BA.debugLine="Dim InsTableAuth As String = $\"CREATE TABLE dta_a";
Debug.ShouldStop(262144);
_instableauth = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE dta_auths (id bigint(20) NOT NULL ,\n"),RemoteObject.createImmutable("							tagcode varchar(50) NOT NULL DEFAULT 'AUTHS_', \n"),RemoteObject.createImmutable("							component_type varchar(50) NOT NULL , \n"),RemoteObject.createImmutable("							accessmode_type varchar(50) NOT NULL , \n"),RemoteObject.createImmutable("							inout_tagcode varchar(50) NOT NULL , \n"),RemoteObject.createImmutable("							group_tagcode varchar(50) NOT NULL , \n"),RemoteObject.createImmutable("							is_data tinyint(4) NULL DEFAULT '0', \n"),RemoteObject.createImmutable("							title varchar(100) NOT NULL , \n"),RemoteObject.createImmutable("							authtagcodes varchar(500) NULL , \n"),RemoteObject.createImmutable("							authtabs varchar(500) NULL , \n"),RemoteObject.createImmutable("							authfields varchar(500) NULL , \n"),RemoteObject.createImmutable("							authfieldsadds varchar(500) NULL , \n"),RemoteObject.createImmutable("							departments varchar(500) NULL , \n"),RemoteObject.createImmutable("							teams varchar(500) NULL , \n"),RemoteObject.createImmutable("							users varchar(500) NULL , \n"),RemoteObject.createImmutable("							created_at timestamp NULL , \n"),RemoteObject.createImmutable("							updated_at timestamp NULL , \n"),RemoteObject.createImmutable("							sid_id int(11) NOT NULL DEFAULT '0', \n"),RemoteObject.createImmutable("							cbr_id int(11) NOT NULL DEFAULT '0', \n"),RemoteObject.createImmutable("							active tinyint(4) NOT NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_view tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_change tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_add tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_delete tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_use tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_print tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_import tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_export tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							action_edit tinyint(4) NULL DEFAULT '1', \n"),RemoteObject.createImmutable("							PRIMARY KEY (id, tagcode));")));Debug.locals.put("InsTableAuth", _instableauth);Debug.locals.put("InsTableAuth", _instableauth);
 BA.debugLineNum = 3923;BA.debugLine="Dim InsTableDataAuth As String = $\"INSERT INTO `d";
Debug.ShouldStop(262144);
_instabledataauth = (RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO `dta_auths` (`id`, `tagcode`, `component_type`, `accessmode_type`, `inout_tagcode`, `group_tagcode`, `is_data`, `title`, `authtagcodes`, `authtabs`, `authfields`, `authfieldsadds`, `departments`, `teams`, `users`, `created_at`, `updated_at`, `sid_id`, `cbr_id`, `active`, `action_view`, `action_change`, `action_add`, `action_delete`, `action_use`, `action_print`, `action_import`, `action_export`, `action_edit`) VALUES\n"),RemoteObject.createImmutable("	(1, 'AUTHS_20201115_135100', 'TCMPT_ANY', 'TACCMT_001', '', '', 0, 'Tipos de Intervenção para Produção', NULL, NULL, NULL, NULL, 'TDEPT_20201109_191112|TDEPT_20201109_191732', NULL, NULL, '2020-11-15 13:55:06', NULL, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),\n"),RemoteObject.createImmutable("	(2, 'AUTHS_20201115_135500', 'TCMPT_ANY', 'TACCMT_001', '', '', 0, 'Tipos de Intervenção para Equipamentos', NULL, NULL, NULL, NULL, 'TDEPT_20201109_191052', NULL, NULL, '2020-11-15 13:55:49', NULL, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);")));Debug.locals.put("InsTableDataAuth", _instabledataauth);Debug.locals.put("InsTableDataAuth", _instabledataauth);
 BA.debugLineNum = 3927;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 BA.debugLineNum = 3928;BA.debugLine="Dim Resultado As Boolean = False";
Debug.ShouldStop(8388608);
_resultado = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("Resultado", _resultado);Debug.locals.put("Resultado", _resultado);
 BA.debugLineNum = 3929;BA.debugLine="If Not(FieldExists(Starter.LocalSQLEVC,\"dta_auth";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 11;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_fieldexists(parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ ,BA.ObjectToString("dta_auths"),RemoteObject.createImmutable("action_edit")))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3930;BA.debugLine="ProgressDialogShow2(\"Actualizando a base de dad";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence("Actualizando a base de dados, Aguarde por favor !")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3932;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(CLearTableAuth";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_cleartableauth));
 BA.debugLineNum = 3933;BA.debugLine="Sleep(250)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "insert_dta_auth"),BA.numberCast(int.class, 250));
this.state = 15;
return;
case 15:
//C
this.state = 7;
;
 BA.debugLineNum = 3936;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(InsTableAuth)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_instableauth));
 BA.debugLineNum = 3937;BA.debugLine="Sleep(250)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "insert_dta_auth"),BA.numberCast(int.class, 250));
this.state = 16;
return;
case 16:
//C
this.state = 7;
;
 BA.debugLineNum = 3940;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"somafe";
Debug.ShouldStop(8);
if (true) break;

case 7:
//if
this.state = 10;
if ((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ .runMethod(true,"toLowerCase"),RemoteObject.createImmutable("somafel")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3941;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(InsTableDataA";
Debug.ShouldStop(16);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_instabledataauth));
 BA.debugLineNum = 3942;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "insert_dta_auth"),BA.numberCast(int.class, 250));
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 3945;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3946;BA.debugLine="Resultado = True";
Debug.ShouldStop(512);
_resultado = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("Resultado", _resultado);
 if (true) break;

case 11:
//C
this.state = 14;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 BA.debugLineNum = 3949;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662390334",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 3952;BA.debugLine="Return Resultado";
Debug.ShouldStop(32768);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado));return;};
 BA.debugLineNum = 3954;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _insertalerterrors(RemoteObject _errormsg) throws Exception{
try {
		Debug.PushSubsStack("InsertAlertErrors (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3547);
if (RapidSub.canDelegate("insertalerterrors")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","insertalerterrors", _errormsg);}
RemoteObject _nrecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("ErrorMsg", _errormsg);
 BA.debugLineNum = 3547;BA.debugLine="Sub InsertAlertErrors(ErrorMsg As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 3549;BA.debugLine="Log(\"INSERT ALERTA BACKGROUNDUPDATESERVICE\")";
Debug.ShouldStop(268435456);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","662128130",RemoteObject.createImmutable("INSERT ALERTA BACKGROUNDUPDATESERVICE"),0);
 BA.debugLineNum = 3550;BA.debugLine="Private nRecord As Cursor";
Debug.ShouldStop(536870912);
_nrecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("nRecord", _nrecord);
 BA.debugLineNum = 3551;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_al";
Debug.ShouldStop(1073741824);
_mid = RemoteObject.solve(new RemoteObject[] {dataupdate.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 3552;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateT";
Debug.ShouldStop(-2147483648);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 3553;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (i";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"),RemoteObject.createImmutable("							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("							values ("),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_errormsg))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("		'"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3557;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL,";
Debug.ShouldStop(16);
dataupdate.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 3559;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(64);
dataupdate.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",dataupdate.processBA,(Object)((dataupdate.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 3561;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertalertsistema(RemoteObject _typeofalert,RemoteObject _lastsyncday) throws Exception{
try {
		Debug.PushSubsStack("InsertAlertSistema (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,274);
if (RapidSub.canDelegate("insertalertsistema")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","insertalertsistema", _typeofalert, _lastsyncday);}
RemoteObject _alert_text = RemoteObject.createImmutable("");
RemoteObject _mid = RemoteObject.createImmutable(0);
RemoteObject _alerttagcode = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
Debug.locals.put("TypeOfAlert", _typeofalert);
Debug.locals.put("LastSyncDay", _lastsyncday);
 BA.debugLineNum = 274;BA.debugLine="Sub InsertAlertSistema(TypeOfAlert As Int, LastSyn";
Debug.ShouldStop(131072);
 BA.debugLineNum = 276;BA.debugLine="If TypeOfAlert = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_typeofalert,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 277;BA.debugLine="Log(\"INSERT ALERTA LONG TIME NO UPDATE\")";
Debug.ShouldStop(1048576);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","659506691",RemoteObject.createImmutable("INSERT ALERTA LONG TIME NO UPDATE"),0);
 BA.debugLineNum = 278;BA.debugLine="Dim Alert_text As String = $\"A Ultima sincroniza";
Debug.ShouldStop(2097152);
_alert_text = (RemoteObject.concat(RemoteObject.createImmutable("A Ultima sincronização efectuada foi no dia : "),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lastsyncday))),RemoteObject.createImmutable("")));Debug.locals.put("Alert_text", _alert_text);Debug.locals.put("Alert_text", _alert_text);
 }else 
{ BA.debugLineNum = 279;BA.debugLine="Else If TypeOfAlert = 1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_typeofalert,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 280;BA.debugLine="Log(\"INSERT ALERTA ERRO UPDATE OFFLINE\")";
Debug.ShouldStop(8388608);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","659506694",RemoteObject.createImmutable("INSERT ALERTA ERRO UPDATE OFFLINE"),0);
 BA.debugLineNum = 281;BA.debugLine="Dim Alert_text As String = $\"Alguns dados não fo";
Debug.ShouldStop(16777216);
_alert_text = (RemoteObject.createImmutable("Alguns dados não foram enviados para o Servidor"));Debug.locals.put("Alert_text", _alert_text);Debug.locals.put("Alert_text", _alert_text);
 }}
;
 BA.debugLineNum = 285;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_al";
Debug.ShouldStop(268435456);
_mid = RemoteObject.solve(new RemoteObject[] {dataupdate.mostCurrent._dbstructures.runMethod(true,"_getmaxofevc" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("dta_alerts")),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable(1),RemoteObject.createImmutable(1000000)}, "++",2, 1);Debug.locals.put("mID", _mid);Debug.locals.put("mID", _mid);
 BA.debugLineNum = 286;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateTa";
Debug.ShouldStop(536870912);
_alerttagcode = (RemoteObject.concat(RemoteObject.createImmutable(""),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._utils.runMethod(true,"_generatetagcode" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("ALERTINF_")))))),RemoteObject.createImmutable("")));Debug.locals.put("alerttagcode", _alerttagcode);Debug.locals.put("alerttagcode", _alerttagcode);
 BA.debugLineNum = 287;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (id";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"),RemoteObject.createImmutable("							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"),RemoteObject.createImmutable("							values ("),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mid))),RemoteObject.createImmutable(", '"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alerttagcode))),RemoteObject.createImmutable("', '', 'ALRTREL_REQUESTS', 'ALRTTYP_ALERT', 1, 1, '"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_alert_text))),RemoteObject.createImmutable("', \n"),RemoteObject.createImmutable("	'"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._sharecode._sess_user /*RemoteObject*/ ))),RemoteObject.createImmutable("', '"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)))),RemoteObject.createImmutable("', '', 1, 1, 0, 0)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 291;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL, \"";
Debug.ShouldStop(4);
dataupdate.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("butSavePicture_Click")),(Object)(_ssql),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 292;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
Debug.ShouldStop(8);
dataupdate.mostCurrent.__c.runMethodAndSync(false,"CallSubNew",dataupdate.processBA,(Object)((dataupdate.mostCurrent._mainmenu.getObject())),(Object)(RemoteObject.createImmutable("BadgeCheckUpdate")));
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _localdatatoupdate() throws Exception{
try {
		Debug.PushSubsStack("LocalDataToUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,453);
if (RapidSub.canDelegate("localdatatoupdate")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","localdatatoupdate");}
RemoteObject _ret = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _irecord = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
 BA.debugLineNum = 453;BA.debugLine="Sub LocalDataToUpdate As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 454;BA.debugLine="Dim ret As Int = 0";
Debug.ShouldStop(32);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 456;BA.debugLine="Dim sSQL As String = $\"select distinct count(0) a";
Debug.ShouldStop(128);
_ssql = (RemoteObject.createImmutable("select distinct count(0) as total from loc_updatesrever where up_state=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 457;BA.debugLine="Dim iRecord As Cursor";
Debug.ShouldStop(256);
_irecord = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("iRecord", _irecord);
 BA.debugLineNum = 458;BA.debugLine="Try";
Debug.ShouldStop(512);
try { BA.debugLineNum = 459;BA.debugLine="iRecord = Starter.LocalSQLWRK.ExecQuery(sSQL)";
Debug.ShouldStop(1024);
_irecord = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.CursorWrapper"), dataupdate.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));
 BA.debugLineNum = 460;BA.debugLine="If (iRecord.RowCount>0) Then";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean(">",_irecord.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0)))) { 
 BA.debugLineNum = 461;BA.debugLine="iRecord.Position = 0";
Debug.ShouldStop(4096);
_irecord.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 462;BA.debugLine="ret = iRecord.GetInt(\"total\")";
Debug.ShouldStop(8192);
_ret = _irecord.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("total")));Debug.locals.put("ret", _ret);
 BA.debugLineNum = 463;BA.debugLine="Log(\"««««««««««««««««««««««««««««««««««««\")";
Debug.ShouldStop(16384);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","660030986",RemoteObject.createImmutable("««««««««««««««««««««««««««««««««««««"),0);
 BA.debugLineNum = 464;BA.debugLine="Log($\"Total local data to upload:${ret}\"$)";
Debug.ShouldStop(32768);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","660030987",(RemoteObject.concat(RemoteObject.createImmutable("Total local data to upload:"),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ret))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 465;BA.debugLine="Log(\"««««««««««««««««««««««««««««««««««««\")";
Debug.ShouldStop(65536);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","660030988",RemoteObject.createImmutable("««««««««««««««««««««««««««««««««««««"),0);
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e14.toString()); BA.debugLineNum = 470;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","660030993",BA.ObjectToString(dataupdate.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 471;BA.debugLine="InsertAlertErrors($\"Erro ao enviar os dados loca";
Debug.ShouldStop(4194304);
_insertalerterrors((RemoteObject.concat(RemoteObject.createImmutable("Erro ao enviar os dados locais para o Servidor "),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),dataupdate.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((dataupdate.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 472;BA.debugLine="ret = 0";
Debug.ShouldStop(8388608);
_ret = BA.numberCast(int.class, 0);Debug.locals.put("ret", _ret);
 };
 BA.debugLineNum = 474;BA.debugLine="iRecord.Close";
Debug.ShouldStop(33554432);
_irecord.runVoidMethod ("Close");
 BA.debugLineNum = 475;BA.debugLine="Return ret";
Debug.ShouldStop(67108864);
if (true) return _ret;
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makedeletesqlfile(RemoteObject _scriptsfilename) throws Exception{
try {
		Debug.PushSubsStack("MakeDeleteSqlFile (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2438);
if (RapidSub.canDelegate("makedeletesqlfile")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","makedeletesqlfile", _scriptsfilename);}
ResumableSub_MakeDeleteSqlFile rsub = new ResumableSub_MakeDeleteSqlFile(null,_scriptsfilename);
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
public static class ResumableSub_MakeDeleteSqlFile extends BA.ResumableSub {
public ResumableSub_MakeDeleteSqlFile(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _scriptsfilename) {
this.parent = parent;
this._scriptsfilename = _scriptsfilename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _scriptsfilename;
RemoteObject _listadeletes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _l = 0;
RemoteObject _script = RemoteObject.createImmutable("");
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeDeleteSqlFile (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2438);
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
Debug.locals.put("scriptsFilename", _scriptsfilename);
 BA.debugLineNum = 2440;BA.debugLine="If Utils.NNE(scriptsFilename) Then";
Debug.ShouldStop(128);
if (true) break;

case 1:
//if
this.state = 14;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_scriptsfilename)).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2442;BA.debugLine="Dim ListaDeletes As List = File.ReadList(Starter";
Debug.ShouldStop(512);
_listadeletes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listadeletes = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_scriptsfilename));Debug.locals.put("ListaDeletes", _listadeletes);Debug.locals.put("ListaDeletes", _listadeletes);
 BA.debugLineNum = 2443;BA.debugLine="For l=0 To ListaDeletes.Size -1";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//for
this.state = 13;
step3 = 1;
limit3 = RemoteObject.solve(new RemoteObject[] {_listadeletes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_l = 0 ;
Debug.locals.put("l", _l);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 13;
if ((step3 > 0 && _l <= limit3) || (step3 < 0 && _l >= limit3)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_l = ((int)(0 + _l + step3)) ;
Debug.locals.put("l", _l);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2444;BA.debugLine="Dim script As String = ListaDeletes.Get(l)";
Debug.ShouldStop(2048);
_script = BA.ObjectToString(_listadeletes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _l))));Debug.locals.put("script", _script);Debug.locals.put("script", _script);
 BA.debugLineNum = 2445;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
 BA.debugLineNum = 2446;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",script, \"\")";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(_script),(Object)(RemoteObject.createImmutable("")));
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 2448;BA.debugLine="Log($\"ERROR: ${script} - EXCEPTION = ${LastExc";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661276170",(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_script))),RemoteObject.createImmutable(" - EXCEPTION = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2449;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = 16;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("l", _l);
;
 BA.debugLineNum = 2452;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 2455;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 2457;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _makeexecutesqlfiles(RemoteObject _script,RemoteObject _isupdate) throws Exception{
try {
		Debug.PushSubsStack("MakeExecuteSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2336);
if (RapidSub.canDelegate("makeexecutesqlfiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","makeexecutesqlfiles", _script, _isupdate);}
ResumableSub_MakeExecuteSqlFiles rsub = new ResumableSub_MakeExecuteSqlFiles(null,_script,_isupdate);
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
public static class ResumableSub_MakeExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_MakeExecuteSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _script,RemoteObject _isupdate) {
this.parent = parent;
this._script = _script;
this._isupdate = _isupdate;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _script;
RemoteObject _isupdate;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _rbackupanddeletetypes = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _deletedtables = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("MakeExecuteSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,2336);
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
Debug.locals.put("script", _script);
Debug.locals.put("isupdate", _isupdate);
 BA.debugLineNum = 2343;BA.debugLine="If (Utils.NNE(script)) Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 144;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_script))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 143;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2344;BA.debugLine="If ((isupdate) And (script.ToLowerCase.StartsWit";
Debug.ShouldStop(128);
if (true) break;

case 4:
//if
this.state = 135;
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_requests"))))))) { 
this.state = 6;
}else 
{ BA.debugLineNum = 2353;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(65536);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_tasks"))))))) { 
this.state = 22;
}else 
{ BA.debugLineNum = 2362;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_typerequests"))))))) { 
this.state = 38;
}else 
{ BA.debugLineNum = 2371;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_objects"))))))) { 
this.state = 54;
}else 
{ BA.debugLineNum = 2380;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(2048);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_locations"))))))) { 
this.state = 70;
}else 
{ BA.debugLineNum = 2389;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_contacts"))))))) { 
this.state = 86;
}else 
{ BA.debugLineNum = 2398;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(536870912);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_warehouses"))))))) { 
this.state = 102;
}else 
{ BA.debugLineNum = 2407;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
Debug.ShouldStop(64);
if ((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",(_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `dta_articles"))))))) { 
this.state = 118;
}else 
{ BA.debugLineNum = 2416;BA.debugLine="Else If ((isupdate) And script.ToLowerCase.Start";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",(_isupdate)) && RemoteObject.solveBoolean(".",_script.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("insert into `type_"))))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._types_alreadydeleted /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"False")))))) { 
this.state = 134;
}}}}}}}}}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2345;BA.debugLine="If TagCodesString = \"_\" Then TagCodesString = \"";
Debug.ShouldStop(256);
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodesstring,BA.ObjectToString("_"))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
parent.mostCurrent._tagcodesstring = BA.ObjectToString("");
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 2346;BA.debugLine="If (Utils.NNE(TagCodesString)) Then";
Debug.ShouldStop(512);
if (true) break;

case 13:
//if
this.state = 20;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodesstring))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 2347;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteF";
Debug.ShouldStop(1024);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletefromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodesstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2348;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 145;
return;
case 145:
//C
this.state = 16;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2349;BA.debugLine="If(result)Then";
Debug.ShouldStop(4096);
if (true) break;

case 16:
//if
this.state = 19;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 2350;BA.debugLine="TagCodesString = \"\"";
Debug.ShouldStop(8192);
parent.mostCurrent._tagcodesstring = BA.ObjectToString("");
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 135;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2354;BA.debugLine="If TagCodesTasksString =\"_\" Then TagCodesTasksS";
Debug.ShouldStop(131072);
if (true) break;

case 23:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodestasksstring,BA.ObjectToString("_"))) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString("");
if (true) break;

case 28:
//C
this.state = 29;
;
 BA.debugLineNum = 2355;BA.debugLine="If (Utils.NNE(TagCodesTasksString)) Then";
Debug.ShouldStop(262144);
if (true) break;

case 29:
//if
this.state = 36;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodestasksstring))).<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 2356;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteT";
Debug.ShouldStop(524288);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletetasksfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodestasksstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2357;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 146;
return;
case 146:
//C
this.state = 32;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2358;BA.debugLine="If(result)Then";
Debug.ShouldStop(2097152);
if (true) break;

case 32:
//if
this.state = 35;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 2359;BA.debugLine="TagCodesTasksString = \"\"";
Debug.ShouldStop(4194304);
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString("");
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = 135;
;
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 2363;BA.debugLine="If TagCodesTPRequestsString = \"_\" Then TagCodes";
Debug.ShouldStop(67108864);
if (true) break;

case 39:
//if
this.state = 44;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodestprequestsstring,BA.ObjectToString("_"))) { 
this.state = 41;
;}if (true) break;

case 41:
//C
this.state = 44;
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString("");
if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 2364;BA.debugLine="If (Utils.NNE(TagCodesTPRequestsString)) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 45:
//if
this.state = 52;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodestprequestsstring))).<Boolean>get().booleanValue()) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2365;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteT";
Debug.ShouldStop(268435456);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletetprequestsfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodestprequestsstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2366;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 147;
return;
case 147:
//C
this.state = 48;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2367;BA.debugLine="If(result)Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 48:
//if
this.state = 51;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2368;BA.debugLine="TagCodesTPRequestsString = \"\"";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString("");
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 135;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 2372;BA.debugLine="If TagCodesObjectsString = \"_\" Then TagCodesObj";
Debug.ShouldStop(8);
if (true) break;

case 55:
//if
this.state = 60;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodesobjectsstring,BA.ObjectToString("_"))) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString("");
if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 2373;BA.debugLine="If (Utils.NNE(TagCodesObjectsString)) Then";
Debug.ShouldStop(16);
if (true) break;

case 61:
//if
this.state = 68;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodesobjectsstring))).<Boolean>get().booleanValue()) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 2374;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteO";
Debug.ShouldStop(32);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deleteobjectsfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodesobjectsstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2375;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 148;
return;
case 148:
//C
this.state = 64;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2376;BA.debugLine="If(result)Then";
Debug.ShouldStop(128);
if (true) break;

case 64:
//if
this.state = 67;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 2377;BA.debugLine="TagCodesObjectsString = \"\"";
Debug.ShouldStop(256);
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString("");
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 135;
;
 if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 2381;BA.debugLine="If TagCodesLocationsString = \"_\" Then TagCodesL";
Debug.ShouldStop(4096);
if (true) break;

case 71:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodeslocationsstring,BA.ObjectToString("_"))) { 
this.state = 73;
;}if (true) break;

case 73:
//C
this.state = 76;
parent.mostCurrent._tagcodeslocationsstring = BA.ObjectToString("");
if (true) break;

case 76:
//C
this.state = 77;
;
 BA.debugLineNum = 2382;BA.debugLine="If (Utils.NNE(TagCodesLocationsString)) Then";
Debug.ShouldStop(8192);
if (true) break;

case 77:
//if
this.state = 84;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodeslocationsstring))).<Boolean>get().booleanValue()) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 2383;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteL";
Debug.ShouldStop(16384);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletelocationsfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodeslocationsstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2384;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 149;
return;
case 149:
//C
this.state = 80;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2385;BA.debugLine="If(result)Then";
Debug.ShouldStop(65536);
if (true) break;

case 80:
//if
this.state = 83;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 2386;BA.debugLine="TagCodesLocationsString = \"\"";
Debug.ShouldStop(131072);
parent.mostCurrent._tagcodeslocationsstring = BA.ObjectToString("");
 if (true) break;

case 83:
//C
this.state = 84;
;
 if (true) break;

case 84:
//C
this.state = 135;
;
 if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 2390;BA.debugLine="If TagCodesContactsString = \"_\" Then TagCodesCo";
Debug.ShouldStop(2097152);
if (true) break;

case 87:
//if
this.state = 92;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodescontactsstring,BA.ObjectToString("_"))) { 
this.state = 89;
;}if (true) break;

case 89:
//C
this.state = 92;
parent.mostCurrent._tagcodescontactsstring = BA.ObjectToString("");
if (true) break;

case 92:
//C
this.state = 93;
;
 BA.debugLineNum = 2391;BA.debugLine="If (Utils.NNE(TagCodesContactsString)) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 93:
//if
this.state = 100;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodescontactsstring))).<Boolean>get().booleanValue()) { 
this.state = 95;
}if (true) break;

case 95:
//C
this.state = 96;
 BA.debugLineNum = 2392;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteC";
Debug.ShouldStop(8388608);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletecontactsfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodescontactsstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2393;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 150;
return;
case 150:
//C
this.state = 96;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2394;BA.debugLine="If(result)Then";
Debug.ShouldStop(33554432);
if (true) break;

case 96:
//if
this.state = 99;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 98;
}if (true) break;

case 98:
//C
this.state = 99;
 BA.debugLineNum = 2395;BA.debugLine="TagCodesContactsString = \"\"";
Debug.ShouldStop(67108864);
parent.mostCurrent._tagcodescontactsstring = BA.ObjectToString("");
 if (true) break;

case 99:
//C
this.state = 100;
;
 if (true) break;

case 100:
//C
this.state = 135;
;
 if (true) break;

case 102:
//C
this.state = 103;
 BA.debugLineNum = 2399;BA.debugLine="If TagCodesWarehousesString = \"_\" Then TagCodes";
Debug.ShouldStop(1073741824);
if (true) break;

case 103:
//if
this.state = 108;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodeswarehousesstring,BA.ObjectToString("_"))) { 
this.state = 105;
;}if (true) break;

case 105:
//C
this.state = 108;
parent.mostCurrent._tagcodeswarehousesstring = BA.ObjectToString("");
if (true) break;

case 108:
//C
this.state = 109;
;
 BA.debugLineNum = 2400;BA.debugLine="If (Utils.NNE(TagCodesWarehousesString)) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 109:
//if
this.state = 116;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodeswarehousesstring))).<Boolean>get().booleanValue()) { 
this.state = 111;
}if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 2401;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteW";
Debug.ShouldStop(1);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletewarehousesfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodeswarehousesstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2402;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 151;
return;
case 151:
//C
this.state = 112;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2403;BA.debugLine="If(result)Then";
Debug.ShouldStop(4);
if (true) break;

case 112:
//if
this.state = 115;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
 BA.debugLineNum = 2404;BA.debugLine="TagCodesWarehousesString = \"\"";
Debug.ShouldStop(8);
parent.mostCurrent._tagcodeswarehousesstring = BA.ObjectToString("");
 if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = 135;
;
 if (true) break;

case 118:
//C
this.state = 119;
 BA.debugLineNum = 2408;BA.debugLine="If TagCodesArticlesString = \"_\" Then TagCodesAr";
Debug.ShouldStop(128);
if (true) break;

case 119:
//if
this.state = 124;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._tagcodesarticlesstring,BA.ObjectToString("_"))) { 
this.state = 121;
;}if (true) break;

case 121:
//C
this.state = 124;
parent.mostCurrent._tagcodesarticlesstring = BA.ObjectToString("");
if (true) break;

case 124:
//C
this.state = 125;
;
 BA.debugLineNum = 2409;BA.debugLine="If (Utils.NNE(TagCodesArticlesString)) Then";
Debug.ShouldStop(256);
if (true) break;

case 125:
//if
this.state = 132;
if ((parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodesarticlesstring))).<Boolean>get().booleanValue()) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 2410;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteA";
Debug.ShouldStop(512);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_deletearticlesfromlocaldatabasefromstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._tagcodesarticlesstring));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 2411;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 152;
return;
case 152:
//C
this.state = 128;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 2412;BA.debugLine="If(result)Then";
Debug.ShouldStop(2048);
if (true) break;

case 128:
//if
this.state = 131;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 130;
}if (true) break;

case 130:
//C
this.state = 131;
 BA.debugLineNum = 2413;BA.debugLine="TagCodesArticlesString = \"\"";
Debug.ShouldStop(4096);
parent.mostCurrent._tagcodesarticlesstring = BA.ObjectToString("");
 if (true) break;

case 131:
//C
this.state = 132;
;
 if (true) break;

case 132:
//C
this.state = 135;
;
 if (true) break;

case 134:
//C
this.state = 135;
 BA.debugLineNum = 2417;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDelete";
Debug.ShouldStop(65536);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdeletetypetabelas /*RemoteObject*/ ));
 BA.debugLineNum = 2418;BA.debugLine="Log(\"Deleting type_ tables\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661210706",RemoteObject.createImmutable("Deleting type_ tables"),0);
 BA.debugLineNum = 2419;BA.debugLine="Dim RBackUpAndDeleteTypes As ResumableSub = Bac";
Debug.ShouldStop(262144);
_rbackupanddeletetypes = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rbackupanddeletetypes = _backupanddeletetypes();Debug.locals.put("RBackUpAndDeleteTypes", _rbackupanddeletetypes);Debug.locals.put("RBackUpAndDeleteTypes", _rbackupanddeletetypes);
 BA.debugLineNum = 2420;BA.debugLine="Wait For(RBackUpAndDeleteTypes) Complete (Delet";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "makeexecutesqlfiles"), _rbackupanddeletetypes);
this.state = 153;
return;
case 153:
//C
this.state = 135;
_deletedtables = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("DeletedTables", _deletedtables);
;
 if (true) break;

case 135:
//C
this.state = 136;
;
 BA.debugLineNum = 2424;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ));
 BA.debugLineNum = 2425;BA.debugLine="Try";
Debug.ShouldStop(16777216);
if (true) break;

case 136:
//try
this.state = 141;
this.catchState = 140;
this.state = 138;
if (true) break;

case 138:
//C
this.state = 141;
this.catchState = 140;
 BA.debugLineNum = 2426;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",script, \"\")";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(_script),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 2427;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 140:
//C
this.state = 141;
this.catchState = 0;
 BA.debugLineNum = 2429;BA.debugLine="Log($\"ERROR: ${script} - EXCEPTION = ${LastExce";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661210717",(RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_script))),RemoteObject.createImmutable(" - EXCEPTION = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA).getObject()))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 2430;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 141:
//C
this.state = 144;
this.catchState = 0;
;
 if (true) break;

case 143:
//C
this.state = 144;
 BA.debugLineNum = 2433;BA.debugLine="Log($\"Empty script\"$)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661210721",(RemoteObject.createImmutable("Empty script")),0);
 if (true) break;

case 144:
//C
this.state = -1;
;
 BA.debugLineNum = 2435;BA.debugLine="Return False";
Debug.ShouldStop(4);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 2436;BA.debugLine="End Sub";
Debug.ShouldStop(8);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Public Device As Phone";
dataupdate._device = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _removealllocalinfoandsqlfiles() throws Exception{
try {
		Debug.PushSubsStack("RemoveAllLocalInfoAndSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,558);
if (RapidSub.canDelegate("removealllocalinfoandsqlfiles")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","removealllocalinfoandsqlfiles");}
ResumableSub_RemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_RemoveAllLocalInfoAndSqlFiles(null);
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
public static class ResumableSub_RemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_RemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _locares = RemoteObject.createImmutable(false);
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject group4;
int index4;
int groupLen4;
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RemoveAllLocalInfoAndSqlFiles (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,558);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 560;BA.debugLine="Dim LocaRes As Boolean = False";
Debug.ShouldStop(32768);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);Debug.locals.put("LocaRes", _locares);
 BA.debugLineNum = 561;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "removealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",dataupdate.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 562;BA.debugLine="If Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 14;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 563;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 11;
group4 = _files;
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("F", _f);
this.state = 30;
if (true) break;

case 30:
//C
this.state = 11;
if (index4 < groupLen4) {
this.state = 6;
_f = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("F", _f);}
if (true) break;

case 31:
//C
this.state = 30;
index4++;
Debug.locals.put("F", _f);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 564;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") And Not(F.To";
Debug.ShouldStop(524288);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean(".",_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".info")))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_f.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("firstinstall"))))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 565;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_f));
 if (true) break;

case 10:
//C
this.state = 31;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("F", _f);
;
 BA.debugLineNum = 568;BA.debugLine="LocaRes = True";
Debug.ShouldStop(8388608);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 570;BA.debugLine="LocaRes = False";
Debug.ShouldStop(33554432);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 573;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "removealllocalinfoandsqlfiles"), parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFilesAsync",dataupdate.processBA,(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ ))));
this.state = 32;
return;
case 32:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Success", _success);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 574;BA.debugLine="If Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 15:
//if
this.state = 28;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 27;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 575;BA.debugLine="For Each F As String In Files";
Debug.ShouldStop(1073741824);
if (true) break;

case 18:
//for
this.state = 25;
group15 = _files;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("F", _f);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 25;
if (index15 < groupLen15) {
this.state = 20;
_f = BA.ObjectToString(group15.runMethod(false,"Get",index15));Debug.locals.put("F", _f);}
if (true) break;

case 34:
//C
this.state = 33;
index15++;
Debug.locals.put("F", _f);
if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 576;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") And Not(F.ToL";
Debug.ShouldStop(-2147483648);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean(".",_f.runMethod(true,"toLowerCase").runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".sql")))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_f.runMethod(true,"toLowerCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("firstinstall"))))))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 577;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_f));
 if (true) break;

case 24:
//C
this.state = 34;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 28;
Debug.locals.put("F", _f);
;
 BA.debugLineNum = 580;BA.debugLine="LocaRes = True";
Debug.ShouldStop(8);
_locares = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 582;BA.debugLine="LocaRes = False";
Debug.ShouldStop(32);
_locares = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("LocaRes", _locares);
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 585;BA.debugLine="Return LocaRes";
Debug.ShouldStop(256);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_locares));return;};
 BA.debugLineNum = 587;BA.debugLine="End Sub";
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
public static RemoteObject  _requestsync(RemoteObject _date2watch,RemoteObject _syncdates) throws Exception{
try {
		Debug.PushSubsStack("RequestSync (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1237);
if (RapidSub.canDelegate("requestsync")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","requestsync", _date2watch, _syncdates);}
ResumableSub_RequestSync rsub = new ResumableSub_RequestSync(null,_date2watch,_syncdates);
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
public static class ResumableSub_RequestSync extends BA.ResumableSub {
public ResumableSub_RequestSync(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _date2watch,RemoteObject _syncdates) {
this.parent = parent;
this._date2watch = _date2watch;
this._syncdates = _syncdates;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _date2watch;
RemoteObject _syncdates;
RemoteObject _lastupd = RemoteObject.createImmutable("");
RemoteObject _dates2sync = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _idate = RemoteObject.createImmutable("");
RemoteObject _edate = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestSync (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1237);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("date2watch", _date2watch);
Debug.locals.put("SyncDates", _syncdates);
 BA.debugLineNum = 1239;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1240;BA.debugLine="Dim LastUpd As String = File.ReadString(Starter.";
Debug.ShouldStop(8388608);
_lastupd = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))));Debug.locals.put("LastUpd", _lastupd);Debug.locals.put("LastUpd", _lastupd);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1242;BA.debugLine="Dim LastUpd As String = $\"${Utils.GetCurrentDate";
Debug.ShouldStop(33554432);
_lastupd = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)))),RemoteObject.createImmutable(" 00:00:00")));Debug.locals.put("LastUpd", _lastupd);Debug.locals.put("LastUpd", _lastupd);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1245;BA.debugLine="RequestFileName = Utils.RandomString";
Debug.ShouldStop(268435456);
parent.mostCurrent._requestfilename = parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 1247;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 7:
//if
this.state = 12;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1248;BA.debugLine="Dim Dates2Sync As List = Regex.Split(\"\\|\", date2";
Debug.ShouldStop(-2147483648);
_dates2sync = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dates2sync = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_date2watch))));Debug.locals.put("Dates2Sync", _dates2sync);Debug.locals.put("Dates2Sync", _dates2sync);
 BA.debugLineNum = 1249;BA.debugLine="Dim iDate As String = Utils.IfNullOrEmpty(Dates2";
Debug.ShouldStop(1);
_idate = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString(_dates2sync.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)));Debug.locals.put("iDate", _idate);Debug.locals.put("iDate", _idate);
 BA.debugLineNum = 1250;BA.debugLine="Dim eDate As String = Utils.IfNullOrEmpty(Dates2";
Debug.ShouldStop(2);
_edate = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString(_dates2sync.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrentdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)));Debug.locals.put("eDate", _edate);Debug.locals.put("eDate", _edate);
 BA.debugLineNum = 1251;BA.debugLine="iDate = $\"${iDate} 00:00:00\"$";
Debug.ShouldStop(4);
_idate = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idate))),RemoteObject.createImmutable(" 00:00:00")));Debug.locals.put("iDate", _idate);
 BA.debugLineNum = 1252;BA.debugLine="eDate = $\"${eDate} 23:59:59\"$";
Debug.ShouldStop(8);
_edate = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_edate))),RemoteObject.createImmutable(" 23:59:59")));Debug.locals.put("eDate", _edate);
 BA.debugLineNum = 1262;BA.debugLine="Dim ServerAddress As String = $\"https://${Share";
Debug.ShouldStop(8192);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/updateSqliteDatesNew")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1269;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1048576);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1270;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(dataupdate.getObject()));
 BA.debugLineNum = 1271;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4194304);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1272;BA.debugLine="params.Initialize";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1273;BA.debugLine="params.Clear";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1274;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Author";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1275;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1276;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1277;BA.debugLine="params.Put(\"name\", RequestFileName)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent.mostCurrent._requestfilename)));
 BA.debugLineNum = 1278;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 1279;BA.debugLine="params.Put(\"idate\", iDate)";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("idate"))),(Object)((_idate)));
 BA.debugLineNum = 1280;BA.debugLine="params.Put(\"edate\", eDate)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("edate"))),(Object)((_edate)));
 BA.debugLineNum = 1281;BA.debugLine="params.Put(\"components\", ShareCode.SYNC_COMPONEN";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("components"))),(Object)((parent.mostCurrent._sharecode._sync_components /*RemoteObject*/ )));
 BA.debugLineNum = 1282;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("smart"))),(Object)((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )));
 BA.debugLineNum = 1283;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1284;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1285;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1286;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1287;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1288;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1290;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareC";
Debug.ShouldStop(512);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/updateSqliteNew")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 1291;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1024);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 1292;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(dataupdate.getObject()));
 BA.debugLineNum = 1293;BA.debugLine="Dim params As Map";
Debug.ShouldStop(4096);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 1294;BA.debugLine="params.Initialize";
Debug.ShouldStop(8192);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 1295;BA.debugLine="params.Clear";
Debug.ShouldStop(16384);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 1296;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Author";
Debug.ShouldStop(32768);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 1297;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 1298;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 1299;BA.debugLine="params.Put(\"name\", RequestFileName)";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent.mostCurrent._requestfilename)));
 BA.debugLineNum = 1300;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 1301;BA.debugLine="params.Put(\"date\", LastUpd)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((_lastupd)));
 BA.debugLineNum = 1302;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("smart"))),(Object)((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )));
 BA.debugLineNum = 1303;BA.debugLine="params.Put(\"debug\", 1)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 1304;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 1305;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 1306;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 1307;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 1308;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 1309;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1312;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 1313;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(1);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 1315;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(4);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 1317;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(16);
if (true) break;

case 13:
//if
this.state = 18;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 1318;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestSyncMan";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestSyncManual")),(Object)(_data));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1320;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestSyncAut";
Debug.ShouldStop(128);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestSyncAuto")),(Object)(_data));
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1323;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(1024);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 1324;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1325;BA.debugLine="Job.GetRequest.Timeout = 120000";
Debug.ShouldStop(4096);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 120000));
 BA.debugLineNum = 1327;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "requestsync"), (_job));
this.state = 23;
return;
case 23:
//C
this.state = 19;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 1329;BA.debugLine="If Not(Job.Success) Then";
Debug.ShouldStop(65536);
if (true) break;

case 19:
//if
this.state = 22;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_job.getField(true,"_success" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1330;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(131072);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 1331;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 1334;BA.debugLine="Job.Release";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1335;BA.debugLine="Sleep(1000)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "requestsync"),BA.numberCast(int.class, 1000));
this.state = 24;
return;
case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 1336;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1338;BA.debugLine="End Sub";
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
public static RemoteObject  _requestupdate60last7next() throws Exception{
try {
		Debug.PushSubsStack("RequestUpdate60Last7Next (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,500);
if (RapidSub.canDelegate("requestupdate60last7next")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","requestupdate60last7next");}
ResumableSub_RequestUpdate60Last7Next rsub = new ResumableSub_RequestUpdate60Last7Next(null);
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
public static class ResumableSub_RequestUpdate60Last7Next extends BA.ResumableSub {
public ResumableSub_RequestUpdate60Last7Next(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestUpdate60Last7Next (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,500);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 502;BA.debugLine="RequestFileNameHeaders = Utils.RandomString";
Debug.ShouldStop(2097152);
parent.mostCurrent._requestfilenameheaders = parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 504;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(8388608);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/requests/headers")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 506;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(33554432);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 507;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(dataupdate.getObject()));
 BA.debugLineNum = 508;BA.debugLine="Dim params As Map";
Debug.ShouldStop(134217728);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 509;BA.debugLine="params.Initialize";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 510;BA.debugLine="params.Clear";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 511;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 512;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 513;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 514;BA.debugLine="params.Put(\"name\", RequestFileNameHeaders)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent.mostCurrent._requestfilenameheaders)));
 BA.debugLineNum = 515;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 516;BA.debugLine="params.Put(\"date\", Utils.GetCurrDatetime)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA))));
 BA.debugLineNum = 517;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("smart"))),(Object)((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )));
 BA.debugLineNum = 518;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 519;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 520;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 521;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 522;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 523;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 527;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(16384);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 528;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(32768);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 530;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(131072);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 532;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdate60";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestUpdate60Last7Next")),(Object)(_data));
 BA.debugLineNum = 534;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 535;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(4194304);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 536;BA.debugLine="Job.GetRequest.Timeout = 90000";
Debug.ShouldStop(8388608);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 90000));
 BA.debugLineNum = 538;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "requestupdate60last7next"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 540;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 541;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660358697",_serveraddress,0);
 BA.debugLineNum = 542;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdate6";
Debug.ShouldStop(536870912);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestUpdate60Last7Next")),(Object)(RemoteObject.createImmutable("/api/orion/generate/requests/headers : CONCLUIDA")));
 BA.debugLineNum = 543;BA.debugLine="Job.Release";
Debug.ShouldStop(1073741824);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 544;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 546;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(2);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 BA.debugLineNum = 547;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660358703",_serveraddress,0);
 BA.debugLineNum = 548;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdate6";
Debug.ShouldStop(8);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestUpdate60Last7Next")),(Object)(RemoteObject.createImmutable("ERRO NA TAREFA /api/orion/generate/requests/headers")));
 BA.debugLineNum = 549;BA.debugLine="Job.Release";
Debug.ShouldStop(16);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 550;BA.debugLine="Return False";
Debug.ShouldStop(32);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 553;BA.debugLine="End Sub";
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
public static RemoteObject  _requestupdateonday() throws Exception{
try {
		Debug.PushSubsStack("RequestUpdateOnDay (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,864);
if (RapidSub.canDelegate("requestupdateonday")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","requestupdateonday");}
ResumableSub_RequestUpdateOnDay rsub = new ResumableSub_RequestUpdateOnDay(null);
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
public static class ResumableSub_RequestUpdateOnDay extends BA.ResumableSub {
public ResumableSub_RequestUpdateOnDay(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _lastondaysyncdate = RemoteObject.createImmutable("");
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RequestUpdateOnDay (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,864);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
 BA.debugLineNum = 866;BA.debugLine="RequestFileNameOnDay = Utils.RandomString";
Debug.ShouldStop(2);
parent.mostCurrent._requestfilenameonday = parent.mostCurrent._utils.runMethod(true,"_randomstring" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 867;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_upd.log"))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 868;BA.debugLine="Dim LastOnDaySyncDate As String = File.ReadStrin";
Debug.ShouldStop(8);
_lastondaysyncdate = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_upd.log")))));Debug.locals.put("LastOnDaySyncDate", _lastondaysyncdate);Debug.locals.put("LastOnDaySyncDate", _lastondaysyncdate);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 870;BA.debugLine="Dim LastOnDaySyncDate As String = Utils.GetCurrD";
Debug.ShouldStop(32);
_lastondaysyncdate = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);Debug.locals.put("LastOnDaySyncDate", _lastondaysyncdate);Debug.locals.put("LastOnDaySyncDate", _lastondaysyncdate);
 if (true) break;
;
 BA.debugLineNum = 873;BA.debugLine="If (ShareCode.FIRSTDAILYLOGIN) Then";
Debug.ShouldStop(256);

case 6:
//if
this.state = 9;
if ((parent.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 874;BA.debugLine="LastOnDaySyncDate = $\"${Utils.GetCurrDatetimeExt";
Debug.ShouldStop(512);
_lastondaysyncdate = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)))),RemoteObject.createImmutable("")));Debug.locals.put("LastOnDaySyncDate", _lastondaysyncdate);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 877;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(4096);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/requests/onday")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 878;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(8192);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 879;BA.debugLine="Job.Initialize(\"\",Me)";
Debug.ShouldStop(16384);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(dataupdate.getObject()));
 BA.debugLineNum = 880;BA.debugLine="Dim params As Map";
Debug.ShouldStop(32768);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 881;BA.debugLine="params.Initialize";
Debug.ShouldStop(65536);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 882;BA.debugLine="params.Clear";
Debug.ShouldStop(131072);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 883;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(262144);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 884;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(524288);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 885;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(1048576);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 886;BA.debugLine="params.Put(\"name\", RequestFileNameOnDay)";
Debug.ShouldStop(2097152);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((parent.mostCurrent._requestfilenameonday)));
 BA.debugLineNum = 887;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
Debug.ShouldStop(4194304);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("newReturn"))),(Object)((parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ )));
 BA.debugLineNum = 888;BA.debugLine="params.Put(\"date\",LastOnDaySyncDate )";
Debug.ShouldStop(8388608);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date"))),(Object)((_lastondaysyncdate)));
 BA.debugLineNum = 889;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
Debug.ShouldStop(16777216);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("smart"))),(Object)((parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )));
 BA.debugLineNum = 890;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(33554432);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 891;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(67108864);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 892;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(134217728);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 893;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(268435456);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 894;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(536870912);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 895;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 897;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(1);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 898;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(2);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 900;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
Debug.ShouldStop(8);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 902;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdateOn";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestUpdateOnDay")),(Object)(_data));
 BA.debugLineNum = 904;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(128);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 905;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(256);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 906;BA.debugLine="Job.GetRequest.Timeout = 90000";
Debug.ShouldStop(512);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 90000));
 BA.debugLineNum = 908;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "requestupdateonday"), (_job));
this.state = 16;
return;
case 16:
//C
this.state = 10;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 910;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(8192);
if (true) break;

case 10:
//if
this.state = 15;
if (_job.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 911;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660555311",_serveraddress,0);
 BA.debugLineNum = 912;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdateO";
Debug.ShouldStop(32768);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestUpdateOnDay")),(Object)(RemoteObject.createImmutable("Completed")));
 BA.debugLineNum = 913;BA.debugLine="Job.Release";
Debug.ShouldStop(65536);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 914;BA.debugLine="Return True";
Debug.ShouldStop(131072);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 916;BA.debugLine="Log(ServerAddress)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660555316",_serveraddress,0);
 BA.debugLineNum = 917;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdateO";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RequestUpdateOnDay")),(Object)(RemoteObject.createImmutable("ERROR")));
 BA.debugLineNum = 918;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(2097152);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 920;BA.debugLine="Job.Release";
Debug.ShouldStop(8388608);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 921;BA.debugLine="Sleep(5000)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "requestupdateonday"),BA.numberCast(int.class, 5000));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 922;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 924;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _runliteupdate(RemoteObject _tagcodeslist) throws Exception{
try {
		Debug.PushSubsStack("RunLiteUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3404);
if (RapidSub.canDelegate("runliteupdate")) { xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","runliteupdate", _tagcodeslist); return;}
ResumableSub_RunLiteUpdate rsub = new ResumableSub_RunLiteUpdate(null,_tagcodeslist);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RunLiteUpdate extends BA.ResumableSub {
public ResumableSub_RunLiteUpdate(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _tagcodeslist) {
this.parent = parent;
this._tagcodeslist = _tagcodeslist;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _tagcodeslist;
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _returndata = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.types._filedownloadinformation");
RemoteObject _update_install_info = RemoteObject.createImmutable("");
RemoteObject _updateinstallfilesname = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _completed = RemoteObject.createImmutable(false);
RemoteObject _isfilesdeleted = RemoteObject.createImmutable(false);
RemoteObject _isdownloadfilesfinish = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunLiteUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3404);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("tagCodesList", _tagcodeslist);
 BA.debugLineNum = 3409;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 3410;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 3411;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(262144);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3413;BA.debugLine="SetUpDownArrows(\"Download\")";
Debug.ShouldStop(1048576);
_setupdownarrows(RemoteObject.createImmutable("Download"));
 BA.debugLineNum = 3414;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
Debug.ShouldStop(2097152);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleactualizacao /*RemoteObject*/ ));
 BA.debugLineNum = 3415;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 3416;BA.debugLine="lbldataupdateprocess.Text = \"\"";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 3418;BA.debugLine="Dim res As ResumableSub = GenerateLiteUpdateFiles";
Debug.ShouldStop(33554432);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _generateliteupdatefiles(_tagcodeslist,dataupdate.getObject());Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3419;BA.debugLine="Wait For(res) Complete (ReturnData As FileDownloa";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_returndata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("ReturnData", _returndata);
;
 BA.debugLineNum = 3421;BA.debugLine="If (ReturnData.Downloaded) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 20;
if ((_returndata.getField(true,"Downloaded" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3423;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${ReturnDa";
Debug.ShouldStop(1073741824);
_update_install_info = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_returndata.getField(true,"DownloadFilename" /*RemoteObject*/ )))),RemoteObject.createImmutable(".INFO")));Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);
 BA.debugLineNum = 3424;BA.debugLine="Dim updateInstallFilesName As String = ReturnDat";
Debug.ShouldStop(-2147483648);
_updateinstallfilesname = _returndata.getField(true,"DownloadFilename" /*RemoteObject*/ );Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);
 BA.debugLineNum = 3426;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ));
 BA.debugLineNum = 3427;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpdate\"";
Debug.ShouldStop(4);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RunLiteUpdate")),(Object)(parent.mostCurrent._lbldataupdateprocess.runMethod(true,"getText")));
 BA.debugLineNum = 3428;BA.debugLine="Dim res As ResumableSub = DownloadSqlFilesLiteUp";
Debug.ShouldStop(8);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _downloadsqlfilesliteupdate(_update_install_info,_updateinstallfilesname);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3429;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 3431;BA.debugLine="If(result)Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 19;
if ((_result).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3433;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(256);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ));
 BA.debugLineNum = 3434;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpdate";
Debug.ShouldStop(512);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RunLiteUpdate")),(Object)(parent.mostCurrent._lbldataupdateprocess.runMethod(true,"getText")));
 BA.debugLineNum = 3435;BA.debugLine="ShareCode.AlreadyDeleted = True";
Debug.ShouldStop(1024);
parent.mostCurrent._sharecode._alreadydeleted /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 3436;BA.debugLine="Dim res As ResumableSub = ExecuteSqlFiles(updat";
Debug.ShouldStop(2048);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _executesqlfiles(_updateinstallfilesname,parent.mostCurrent.__c.getField(true,"True"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3437;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 23;
return;
case 23:
//C
this.state = 7;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 3439;BA.debugLine="If(finish)Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 18;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 3440;BA.debugLine="Dim res As ResumableSub = SendServerProcessCom";
Debug.ShouldStop(32768);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _sendserverprocesscomplete(parent.mostCurrent.__c.getField(true,"False"),_returndata.getField(true,"DownloadFilename" /*RemoteObject*/ ),dataupdate.getObject());Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3441;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 3443;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(updat";
Debug.ShouldStop(262144);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _deletesqlfiles(_updateinstallfilesname);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3444;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Bool";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 25;
return;
case 25:
//C
this.state = 10;
_isfilesdeleted = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsFilesDeleted", _isfilesdeleted);
;
 BA.debugLineNum = 3446;BA.debugLine="If(IsFilesDeleted) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 10:
//if
this.state = 17;
if ((_isfilesdeleted).<Boolean>get().booleanValue()) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3447;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 3448;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpda";
Debug.ShouldStop(8388608);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RunLiteUpdate")),(Object)(parent.mostCurrent._lbldataupdateprocess.runMethod(true,"getText")));
 BA.debugLineNum = 3449;BA.debugLine="Dim res As ResumableSub = UpdateFilesWithFTP(";
Debug.ShouldStop(16777216);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _updatefileswithftp(BA.ObjectToString(""),parent.mostCurrent._lbldataupdatedownload);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 3450;BA.debugLine="Wait For(res) Complete (IsDownloadFilesFinish";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_isdownloadfilesfinish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsDownloadFilesFinish", _isdownloadfilesfinish);
;
 BA.debugLineNum = 3452;BA.debugLine="If (IsDownloadFilesFinish) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 13:
//if
this.state = 16;
if ((_isdownloadfilesfinish).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3453;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(268435456);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3454;BA.debugLine="ProgressBar1.Visible = False";
Debug.ShouldStop(536870912);
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3455;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDat";
Debug.ShouldStop(1073741824);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*RemoteObject*/ ));
 BA.debugLineNum = 3456;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpd";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RunLiteUpdate")),(Object)(parent.mostCurrent._lbldataupdateprocess.runMethod(true,"getText")));
 BA.debugLineNum = 3457;BA.debugLine="lbldataupdateprocess.TextColor =  Consts.Col";
Debug.ShouldStop(1);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setTextColor",parent.mostCurrent._consts._colormain /*RemoteObject*/ );
 BA.debugLineNum = 3458;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Ut";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._app_last_lite_update_datetime /*RemoteObject*/  = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
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
 BA.debugLineNum = 3466;BA.debugLine="ProgressBar1.Visible = False";
Debug.ShouldStop(512);
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 3470;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(8192);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3471;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 3472;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(32768);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3473;BA.debugLine="End Sub";
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
public static RemoteObject  _runsync(RemoteObject _date2watch,RemoteObject _syncdates) throws Exception{
try {
		Debug.PushSubsStack("RunSync (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1397);
if (RapidSub.canDelegate("runsync")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","runsync", _date2watch, _syncdates);}
ResumableSub_RunSync rsub = new ResumableSub_RunSync(null,_date2watch,_syncdates);
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
public static class ResumableSub_RunSync extends BA.ResumableSub {
public ResumableSub_RunSync(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _date2watch,RemoteObject _syncdates) {
this.parent = parent;
this._date2watch = _date2watch;
this._syncdates = _syncdates;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _date2watch;
RemoteObject _syncdates;
RemoteObject _filteroftc = RemoteObject.createImmutable("");
RemoteObject _reccounter = RemoteObject.createImmutable(0);
RemoteObject _withfiles = RemoteObject.createImmutable(false);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssqlemails = RemoteObject.createImmutable("");
RemoteObject _recordlocalemaildatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _emailcheck = RemoteObject.createImmutable(false);
RemoteObject _ut0 = RemoteObject.createImmutable(0);
RemoteObject _ut1 = RemoteObject.createImmutable(0);
RemoteObject _n = RemoteObject.createImmutable(0);
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _r2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _recordlocaldatatoupdate2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _n1 = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _requestsuccessful = RemoteObject.createImmutable(false);
RemoteObject _update_file_info = RemoteObject.createImmutable("");
RemoteObject _updatesqlfilesname = RemoteObject.createImmutable("");
RemoteObject _deletefilename = RemoteObject.createImmutable("");
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
RemoteObject _deletesispresent = RemoteObject.createImmutable(false);
RemoteObject _resdel = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
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
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _completed = RemoteObject.createImmutable(false);
RemoteObject _isfilesdeleted = RemoteObject.createImmutable(false);
RemoteObject _ftpdocslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaldocs = RemoteObject.createImmutable(0);
RemoteObject _dates2sync = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _idatel = RemoteObject.createImmutable(0L);
RemoteObject _edatel = RemoteObject.createImmutable(0L);
RemoteObject _lmdate = RemoteObject.createImmutable(0L);
RemoteObject _sfl = RemoteObject.declareNull("Object");
RemoteObject _folders = null;
RemoteObject _files = null;
RemoteObject _fname = RemoteObject.createImmutable("");
RemoteObject _ftptemplateslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _totaltemplates = RemoteObject.createImmutable(0);
RemoteObject _fname2 = RemoteObject.createImmutable("");
RemoteObject _ofname = RemoteObject.createImmutable("");
RemoteObject _ftpinternolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _removesuccessful = RemoteObject.createImmutable(false);
RemoteObject group166;
int index166;
int groupLen166;
int step177;
int limit177;
int step190;
int limit190;
int step249;
int limit249;
int step286;
int limit286;
int step319;
int limit319;
int step334;
int limit334;
int step375;
int limit375;
int step389;
int limit389;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunSync (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,1397);
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
Debug.locals.put("date2watch", _date2watch);
Debug.locals.put("SyncDates", _syncdates);
 BA.debugLineNum = 1398;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(2097152);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1399;BA.debugLine="Dim FilterOfTC As String = \"\"";
Debug.ShouldStop(4194304);
_filteroftc = BA.ObjectToString("");Debug.locals.put("FilterOfTC", _filteroftc);Debug.locals.put("FilterOfTC", _filteroftc);
 BA.debugLineNum = 1403;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(67108864);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1404;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1405;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 1406;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 1407;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(1073741824);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1408;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(-2147483648);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1409;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
Debug.ShouldStop(1);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleactualizacao /*RemoteObject*/ ));
 BA.debugLineNum = 1410;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 1412;BA.debugLine="Dim RecCounter As Int = LocalDataToUpdate";
Debug.ShouldStop(8);
_reccounter = _localdatatoupdate();Debug.locals.put("RecCounter", _reccounter);Debug.locals.put("RecCounter", _reccounter);
 BA.debugLineNum = 1413;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 250));
this.state = 314;
return;
case 314:
//C
this.state = 1;
;
 BA.debugLineNum = 1418;BA.debugLine="ShareCode.AwakeDevice(True)";
Debug.ShouldStop(512);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1420;BA.debugLine="If ShareCode.AutoSyncFromLogin Then ' Se veio do";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._sharecode._autosyncfromlogin /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1421;BA.debugLine="RecCounter = 0";
Debug.ShouldStop(4096);
_reccounter = BA.numberCast(int.class, 0);Debug.locals.put("RecCounter", _reccounter);
 if (true) break;
;
 BA.debugLineNum = 1424;BA.debugLine="If (RecCounter > 0) Then";
Debug.ShouldStop(32768);

case 4:
//if
this.state = 73;
if ((RemoteObject.solveBoolean(">",_reccounter,BA.numberCast(double.class, 0)))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1428;BA.debugLine="Log(\"»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\")";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817439",RemoteObject.createImmutable("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»"),0);
 BA.debugLineNum = 1429;BA.debugLine="Log(\"SENDING OFFLINE DATA TO SERVER\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817440",RemoteObject.createImmutable("SENDING OFFLINE DATA TO SERVER"),0);
 BA.debugLineNum = 1430;BA.debugLine="Log(\"»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817441",RemoteObject.createImmutable("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»"),0);
 BA.debugLineNum = 1432;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgSendDataS";
Debug.ShouldStop(8388608);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgsenddataserver /*RemoteObject*/ ));
 BA.debugLineNum = 1433;BA.debugLine="Dim WITHFILES As Boolean = True";
Debug.ShouldStop(16777216);
_withfiles = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("WITHFILES", _withfiles);Debug.locals.put("WITHFILES", _withfiles);
 BA.debugLineNum = 1435;BA.debugLine="If Utils.NNE(ShareCode.TCF) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._tcf /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1436;BA.debugLine="Dim FilterOfTC As String = $\"and up_tagcode in";
Debug.ShouldStop(134217728);
_filteroftc = (RemoteObject.concat(RemoteObject.createImmutable("and up_tagcode in ("),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._tcf /*RemoteObject*/ ))),RemoteObject.createImmutable(")")));Debug.locals.put("FilterOfTC", _filteroftc);Debug.locals.put("FilterOfTC", _filteroftc);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1438;BA.debugLine="Dim FilterOfTC As String = \"\"";
Debug.ShouldStop(536870912);
_filteroftc = BA.ObjectToString("");Debug.locals.put("FilterOfTC", _filteroftc);Debug.locals.put("FilterOfTC", _filteroftc);
 if (true) break;
;
 BA.debugLineNum = 1441;BA.debugLine="Try";
Debug.ShouldStop(1);

case 12:
//try
this.state = 17;
this.catchState = 16;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 17;
this.catchState = 16;
 BA.debugLineNum = 1442;BA.debugLine="Dim sSQL As String = $\"select distinct up_date,";
Debug.ShouldStop(2);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0 "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filteroftc))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1443;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Star";
Debug.ShouldStop(4);
_recordlocaldatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate", _recordlocaldatatoupdate);
 Debug.CheckDeviceExceptions();
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
 BA.debugLineNum = 1445;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817456",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1446;BA.debugLine="Dim sSQL As String = $\"select distinct up_date,";
Debug.ShouldStop(32);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filteroftc))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1447;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Star";
Debug.ShouldStop(64);
_recordlocaldatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate", _recordlocaldatatoupdate);
 BA.debugLineNum = 1448;BA.debugLine="WITHFILES = False";
Debug.ShouldStop(128);
_withfiles = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("WITHFILES", _withfiles);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1451;BA.debugLine="Try";
Debug.ShouldStop(1024);

case 17:
//try
this.state = 22;
this.catchState = 0;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
 BA.debugLineNum = 1452;BA.debugLine="Dim sSQLEmails As String = $\"select distinct up";
Debug.ShouldStop(2048);
_ssqlemails = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0 "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filteroftc))),RemoteObject.createImmutable("")));Debug.locals.put("sSQLEmails", _ssqlemails);Debug.locals.put("sSQLEmails", _ssqlemails);
 BA.debugLineNum = 1453;BA.debugLine="Dim RecordLocalEmailDataToUpdate As ResultSet =";
Debug.ShouldStop(4096);
_recordlocalemaildatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocalemaildatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssqlemails)));Debug.locals.put("RecordLocalEmailDataToUpdate", _recordlocalemaildatatoupdate);
 BA.debugLineNum = 1454;BA.debugLine="Dim EmailCheck As Boolean = True";
Debug.ShouldStop(8192);
_emailcheck = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("EmailCheck", _emailcheck);Debug.locals.put("EmailCheck", _emailcheck);
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 1456;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817467",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1457;BA.debugLine="Dim EmailCheck As Boolean = False";
Debug.ShouldStop(65536);
_emailcheck = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("EmailCheck", _emailcheck);Debug.locals.put("EmailCheck", _emailcheck);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 BA.debugLineNum = 1460;BA.debugLine="Dim ut0 As Int = RecordLocalDataToUpdate.RowCoun";
Debug.ShouldStop(524288);
_ut0 = _recordlocaldatatoupdate.runMethod(true,"getRowCount");Debug.locals.put("ut0", _ut0);Debug.locals.put("ut0", _ut0);
 BA.debugLineNum = 1461;BA.debugLine="Dim ut1 As Int = RecCounter - ut0";
Debug.ShouldStop(1048576);
_ut1 = RemoteObject.solve(new RemoteObject[] {_reccounter,_ut0}, "-",1, 1);Debug.locals.put("ut1", _ut1);Debug.locals.put("ut1", _ut1);
 BA.debugLineNum = 1463;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgExecPro";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*RemoteObject*/ ));
 BA.debugLineNum = 1465;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(16777216);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1466;BA.debugLine="DUProgressBar2(0,0)";
Debug.ShouldStop(33554432);
_duprogressbar2(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1467;BA.debugLine="Sleep(100)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 100));
this.state = 315;
return;
case 315:
//C
this.state = 23;
;
 BA.debugLineNum = 1469;BA.debugLine="If(RecordLocalDataToUpdate.RowCount >= 1) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 23:
//if
this.state = 47;
if ((RemoteObject.solveBoolean("g",_recordlocaldatatoupdate.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1470;BA.debugLine="Dim n As Int = 0";
Debug.ShouldStop(536870912);
_n = BA.numberCast(int.class, 0);Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 1471;BA.debugLine="Do While RecordLocalDataToUpdate.NextRow";
Debug.ShouldStop(1073741824);
if (true) break;

case 26:
//do while
this.state = 46;
while (_recordlocaldatatoupdate.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1473;BA.debugLine="Try";
Debug.ShouldStop(1);
if (true) break;

case 29:
//try
this.state = 42;
this.catchState = 41;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 41;
 BA.debugLineNum = 1474;BA.debugLine="Dim r1  As ResumableSub = SetUpdateHTTPRecord";
Debug.ShouldStop(2);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r1 = _setupdatehttprecord(_recordlocaldatatoupdate,_withfiles,BA.numberCast(int.class, 0),_filteroftc);Debug.locals.put("r1", _r1);Debug.locals.put("r1", _r1);
 BA.debugLineNum = 1475;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _r1);
this.state = 316;
return;
case 316:
//C
this.state = 32;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 1478;BA.debugLine="If EmailCheck Then";
Debug.ShouldStop(32);
if (true) break;

case 32:
//if
this.state = 39;
if (_emailcheck.<Boolean>get().booleanValue()) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1479;BA.debugLine="If RecordLocalEmailDataToUpdate.RowCount > 0";
Debug.ShouldStop(64);
if (true) break;

case 35:
//if
this.state = 38;
if (RemoteObject.solveBoolean(">",_recordlocalemaildatatoupdate.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1480;BA.debugLine="Dim r2 As ResumableSub = SetUpdateHTTPEmail";
Debug.ShouldStop(128);
_r2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r2 = _setupdatehttpemailrecord(_recordlocalemaildatatoupdate,_filteroftc);Debug.locals.put("r2", _r2);Debug.locals.put("r2", _r2);
 BA.debugLineNum = 1481;BA.debugLine="Wait For(r2) complete (finished As Boolean)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _r2);
this.state = 317;
return;
case 317:
//C
this.state = 38;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 if (true) break;

case 38:
//C
this.state = 39;
;
 if (true) break;

case 39:
//C
this.state = 42;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 41:
//C
this.state = 42;
this.catchState = 0;
 BA.debugLineNum = 1485;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817496",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1487;BA.debugLine="If n <= ut0 Then";
Debug.ShouldStop(16384);

case 42:
//if
this.state = 45;
this.catchState = 0;
if (RemoteObject.solveBoolean("k",_n,BA.numberCast(double.class, _ut0))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 1488;BA.debugLine="DUProgressBar(ut0,n)";
Debug.ShouldStop(32768);
_duprogressbar(_ut0,_n);
 BA.debugLineNum = 1489;BA.debugLine="Sleep(1)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 1));
this.state = 318;
return;
case 318:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 26;
;
 BA.debugLineNum = 1492;BA.debugLine="n=n + 1";
Debug.ShouldStop(524288);
_n = RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("n", _n);
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 BA.debugLineNum = 1496;BA.debugLine="RecordLocalDataToUpdate.Close";
Debug.ShouldStop(8388608);
_recordlocaldatatoupdate.runVoidMethod ("Close");
 BA.debugLineNum = 1497;BA.debugLine="Sleep(250)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 250));
this.state = 319;
return;
case 319:
//C
this.state = 48;
;
 BA.debugLineNum = 1499;BA.debugLine="If ut1 >= 1 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 48:
//if
this.state = 68;
if (RemoteObject.solveBoolean("g",_ut1,BA.numberCast(double.class, 1))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 1500;BA.debugLine="Dim sSQL As String = $\"select distinct up_date,";
Debug.ShouldStop(134217728);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1 "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filteroftc))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1501;BA.debugLine="Dim RecordLocalDataToUpdate2 As ResultSet = Sta";
Debug.ShouldStop(268435456);
_recordlocaldatatoupdate2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate2", _recordlocaldatatoupdate2);
 BA.debugLineNum = 1502;BA.debugLine="Dim n1 As Int = 0";
Debug.ShouldStop(536870912);
_n1 = BA.numberCast(int.class, 0);Debug.locals.put("n1", _n1);Debug.locals.put("n1", _n1);
 BA.debugLineNum = 1503;BA.debugLine="If RecordLocalDataToUpdate2.RowCount >= 1 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 51:
//if
this.state = 67;
if (RemoteObject.solveBoolean("g",_recordlocaldatatoupdate2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 1504;BA.debugLine="Do While RecordLocalDataToUpdate2.NextRow";
Debug.ShouldStop(-2147483648);
if (true) break;

case 54:
//do while
this.state = 66;
while (_recordlocaldatatoupdate2.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 56;
if (true) break;
}
if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 1506;BA.debugLine="Try";
Debug.ShouldStop(2);
if (true) break;

case 57:
//try
this.state = 62;
this.catchState = 61;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 62;
this.catchState = 61;
 BA.debugLineNum = 1507;BA.debugLine="SetUpdateFTPRecord(RecordLocalDataToUpdate2,";
Debug.ShouldStop(4);
_setupdateftprecord(_recordlocaldatatoupdate2,_withfiles,BA.numberCast(int.class, 1),_filteroftc);
 Debug.CheckDeviceExceptions();
if (true) break;

case 61:
//C
this.state = 62;
this.catchState = 0;
 BA.debugLineNum = 1509;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817520",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1511;BA.debugLine="If n1 <= RecordLocalDataToUpdate2.RowCount Th";
Debug.ShouldStop(64);

case 62:
//if
this.state = 65;
this.catchState = 0;
if (RemoteObject.solveBoolean("k",_n1,BA.numberCast(double.class, _recordlocaldatatoupdate2.runMethod(true,"getRowCount")))) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 1512;BA.debugLine="DUProgressBar(RecordLocalDataToUpdate2.RowCo";
Debug.ShouldStop(128);
_duprogressbar(_recordlocaldatatoupdate2.runMethod(true,"getRowCount"),_n1);
 BA.debugLineNum = 1513;BA.debugLine="Sleep(1)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 1));
this.state = 320;
return;
case 320:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 54;
;
 BA.debugLineNum = 1515;BA.debugLine="n1=n1 + 1";
Debug.ShouldStop(1024);
_n1 = RemoteObject.solve(new RemoteObject[] {_n1,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("n1", _n1);
 if (true) break;

case 66:
//C
this.state = 67;
;
 if (true) break;

case 67:
//C
this.state = 68;
;
 BA.debugLineNum = 1518;BA.debugLine="RecordLocalDataToUpdate2.Close";
Debug.ShouldStop(8192);
_recordlocaldatatoupdate2.runVoidMethod ("Close");
 if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 1521;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgDataUpdat";
Debug.ShouldStop(65536);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*RemoteObject*/ ));
 BA.debugLineNum = 1522;BA.debugLine="CurrentCounter = CurrentCounter + 1";
Debug.ShouldStop(131072);
parent._currentcounter = RemoteObject.solve(new RemoteObject[] {parent._currentcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 1523;BA.debugLine="If (CurrentCounter > 3) Then";
Debug.ShouldStop(262144);
if (true) break;

case 69:
//if
this.state = 72;
if ((RemoteObject.solveBoolean(">",parent._currentcounter,BA.numberCast(double.class, 3)))) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 1524;BA.debugLine="CurrentCounter = 0";
Debug.ShouldStop(524288);
parent._currentcounter = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1525;BA.debugLine="MsgboxAsync(ShareCode.AvisoDadospersistemNaoUpd";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisodadospersistemnaoupd /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),dataupdate.processBA);
 if (true) break;

case 72:
//C
this.state = 73;
;
 BA.debugLineNum = 1530;BA.debugLine="Sleep(250)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 250));
this.state = 321;
return;
case 321:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 74;
;
 BA.debugLineNum = 1534;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1535;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(1073741824);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1536;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 1537;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 1538;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(2);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1539;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(4);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1540;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
Debug.ShouldStop(8);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleactualizacao /*RemoteObject*/ ));
 BA.debugLineNum = 1541;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
Debug.ShouldStop(16);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 1543;BA.debugLine="If (SyncDates) Then";
Debug.ShouldStop(64);
if (true) break;

case 74:
//if
this.state = 83;
if ((_syncdates).<Boolean>get().booleanValue()) { 
this.state = 76;
}else {
this.state = 82;
}if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 1544;BA.debugLine="If (ShareCode.SYNC_COMPONENTS = \"\") And (ShareCo";
Debug.ShouldStop(128);
if (true) break;

case 77:
//if
this.state = 80;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._sync_components /*RemoteObject*/ ,RemoteObject.createImmutable(""))))) && RemoteObject.solveBoolean(".",(parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/ ))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 1545;BA.debugLine="Dim res As ResumableSub = DownloadDocsOnly(date";
Debug.ShouldStop(256);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _downloaddocsonly(_date2watch,parent.mostCurrent.__c.getField(true,"True"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1546;BA.debugLine="Wait For(res) Complete (RequestSuccessful As Bo";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 322;
return;
case 322:
//C
this.state = 80;
_requestsuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RequestSuccessful", _requestsuccessful);
;
 BA.debugLineNum = 1547;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 80:
//C
this.state = 83;
;
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 1550;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
Debug.ShouldStop(8192);
parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 83:
//C
this.state = 84;
;
 BA.debugLineNum = 1553;BA.debugLine="Dim res As ResumableSub = RequestSync(date2watch,";
Debug.ShouldStop(65536);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _requestsync(_date2watch,_syncdates);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1554;BA.debugLine="Wait For(res) Complete (RequestSuccessful As Bool";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 323;
return;
case 323:
//C
this.state = 84;
_requestsuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RequestSuccessful", _requestsuccessful);
;
 BA.debugLineNum = 1556;BA.debugLine="If(RequestSuccessful) Then";
Debug.ShouldStop(524288);
if (true) break;

case 84:
//if
this.state = 140;
if ((_requestsuccessful).<Boolean>get().booleanValue()) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 1557;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Shar";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_autosync.log")))),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)));
 BA.debugLineNum = 1558;BA.debugLine="Dim UPDATE_FILE_INFO As String = $\"${RequestFile";
Debug.ShouldStop(2097152);
_update_file_info = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._requestfilename))),RemoteObject.createImmutable(".INFO")));Debug.locals.put("UPDATE_FILE_INFO", _update_file_info);Debug.locals.put("UPDATE_FILE_INFO", _update_file_info);
 BA.debugLineNum = 1559;BA.debugLine="Dim updateSQLFilesName As String = RequestFileNa";
Debug.ShouldStop(4194304);
_updatesqlfilesname = parent.mostCurrent._requestfilename;Debug.locals.put("updateSQLFilesName", _updatesqlfilesname);Debug.locals.put("updateSQLFilesName", _updatesqlfilesname);
 BA.debugLineNum = 1560;BA.debugLine="Dim deleteFileName As String = $\"${RequestFileNa";
Debug.ShouldStop(8388608);
_deletefilename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._requestfilename))),RemoteObject.createImmutable("-DELETE.sql")));Debug.locals.put("deleteFileName", _deletefilename);Debug.locals.put("deleteFileName", _deletefilename);
 BA.debugLineNum = 1561;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
Debug.ShouldStop(16777216);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ));
 BA.debugLineNum = 1562;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunSync\",lblda";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RunSync")),(Object)(parent.mostCurrent._lbldataupdateprocess.runMethod(true,"getText")));
 BA.debugLineNum = 1566;BA.debugLine="SqlFilesTotal = 0";
Debug.ShouldStop(536870912);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 1567;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(1073741824);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1568;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(-2147483648);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1569;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(1);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1570;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(2);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 1571;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(4);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 1572;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(8);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 1573;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(16);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1575;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(64);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_update_file_info)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_file_info));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1576;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sf);
this.state = 324;
return;
case 324:
//C
this.state = 87;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1578;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO .INFO";
Debug.ShouldStop(512);
if (true) break;

case 87:
//if
this.state = 139;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
 BA.debugLineNum = 1580;BA.debugLine="Log(UPDATE_FILE_INFO & \" file was download succ";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817591",RemoteObject.concat(_update_file_info,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 1582;BA.debugLine="Dim JsonStruct As String = File.readstring(Star";
Debug.ShouldStop(8192);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_file_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 1583;BA.debugLine="Log(\"JSON:\" & JsonStruct)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817594",RemoteObject.concat(RemoteObject.createImmutable("JSON:"),_jsonstruct),0);
 BA.debugLineNum = 1584;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1585;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 1586;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1587;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
Debug.ShouldStop(262144);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 1588;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(524288);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 1589;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(1048576);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 1595;BA.debugLine="Dim DeletesIsPresent As Boolean = False";
Debug.ShouldStop(67108864);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);Debug.locals.put("DeletesIsPresent", _deletesispresent);
 BA.debugLineNum = 1596;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(134217728);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_deletefilename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deletefilename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1597;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sf);
this.state = 325;
return;
case 325:
//C
this.state = 90;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1599;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO DE DELE";
Debug.ShouldStop(1073741824);
if (true) break;

case 90:
//if
this.state = 101;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 92;
}else {
this.state = 100;
}if (true) break;

case 92:
//C
this.state = 93;
 BA.debugLineNum = 1600;BA.debugLine="Log(deleteFileName & \" file was download succe";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817611",RemoteObject.concat(_deletefilename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 1602;BA.debugLine="If File.Exists(Starter.Provider.SharedFolder,";
Debug.ShouldStop(2);
if (true) break;

case 93:
//if
this.state = 98;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deletefilename)).<Boolean>get().booleanValue()) { 
this.state = 95;
}else {
this.state = 97;
}if (true) break;

case 95:
//C
this.state = 98;
 BA.debugLineNum = 1603;BA.debugLine="DeletesIsPresent = True";
Debug.ShouldStop(4);
_deletesispresent = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 1605;BA.debugLine="DeletesIsPresent = False";
Debug.ShouldStop(16);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;

case 98:
//C
this.state = 101;
;
 if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 1608;BA.debugLine="DeletesIsPresent = False";
Debug.ShouldStop(128);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;
;
 BA.debugLineNum = 1622;BA.debugLine="If DeletesIsPresent Then";
Debug.ShouldStop(2097152);

case 101:
//if
this.state = 120;
if (_deletesispresent.<Boolean>get().booleanValue()) { 
this.state = 103;
}else {
this.state = 105;
}if (true) break;

case 103:
//C
this.state = 120;
 BA.debugLineNum = 1623;BA.debugLine="Dim resDel As ResumableSub = MakeDeleteSqlFile";
Debug.ShouldStop(4194304);
_resdel = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resdel = _makedeletesqlfile(_deletefilename);Debug.locals.put("resDel", _resdel);Debug.locals.put("resDel", _resdel);
 BA.debugLineNum = 1624;BA.debugLine="Wait For(resDel) Complete (finish As Boolean)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _resdel);
this.state = 326;
return;
case 326:
//C
this.state = 120;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 1626;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(33554432);
if (true) break;

case 106:
//for
this.state = 119;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group166 = _inserts;
index166 = 0;
groupLen166 = group166.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 327;
if (true) break;

case 327:
//C
this.state = 119;
if (index166 < groupLen166) {
this.state = 108;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group166.runMethod(false,"Get",index166));}
if (true) break;

case 328:
//C
this.state = 327;
index166++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 1627;BA.debugLine="Dim mastertagcode As String = colinserts.Get(";
Debug.ShouldStop(67108864);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 1628;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 109:
//try
this.state = 114;
this.catchState = 113;
this.state = 111;
if (true) break;

case 111:
//C
this.state = 114;
this.catchState = 113;
 BA.debugLineNum = 1629;BA.debugLine="Dim childfield As String = colinserts.Get(\"c";
Debug.ShouldStop(268435456);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 113:
//C
this.state = 114;
this.catchState = 0;
 BA.debugLineNum = 1631;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(1073741824);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 1632;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817643",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 114:
//C
this.state = 115;
this.catchState = 0;
;
 BA.debugLineNum = 1634;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"t";
Debug.ShouldStop(2);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 1635;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\", t";
Debug.ShouldStop(4);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 1636;BA.debugLine="Dim table As String = colinserts.Get(\"table\")";
Debug.ShouldStop(8);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 1638;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(32);
if (true) break;

case 115:
//for
this.state = 118;
step177 = 1;
limit177 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 329;
if (true) break;

case 329:
//C
this.state = 118;
if ((step177 > 0 && _i <= limit177) || (step177 < 0 && _i >= limit177)) this.state = 117;
if (true) break;

case 330:
//C
this.state = 329;
_i = ((int)(0 + _i + step177)) ;
Debug.locals.put("i", _i);
if (true) break;

case 117:
//C
this.state = 330;
 BA.debugLineNum = 1639;BA.debugLine="Dim res As ResumableSub = DBStructures.Remov";
Debug.ShouldStop(64);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1640;BA.debugLine="Wait For(res) Complete (result As Boolean)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 331;
return;
case 331:
//C
this.state = 330;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 1641;BA.debugLine="Sleep(100)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 100));
this.state = 332;
return;
case 332:
//C
this.state = 330;
;
 if (true) break;
if (true) break;

case 118:
//C
this.state = 328;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 119:
//C
this.state = 120;
Debug.locals.put("colinserts", _colinserts);
;
 if (true) break;

case 120:
//C
this.state = 121;
;
 BA.debugLineNum = 1651;BA.debugLine="SqlFilesTotal = Totalfiles";
Debug.ShouldStop(262144);
parent._sqlfilestotal = _totalfiles;
 BA.debugLineNum = 1652;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(524288);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 1653;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(1048576);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1654;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(2097152);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1655;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(4194304);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1658;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 121:
//if
this.state = 128;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 123;
}if (true) break;

case 123:
//C
this.state = 124;
 BA.debugLineNum = 1659;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(67108864);
if (true) break;

case 124:
//for
this.state = 127;
step190 = 1;
limit190 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 333;
if (true) break;

case 333:
//C
this.state = 127;
if ((step190 > 0 && _i <= limit190) || (step190 < 0 && _i >= limit190)) this.state = 126;
if (true) break;

case 334:
//C
this.state = 333;
_i = ((int)(0 + _i + step190)) ;
Debug.locals.put("i", _i);
if (true) break;

case 126:
//C
this.state = 334;
 BA.debugLineNum = 1660;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1661;BA.debugLine="Dim fileN As String = $\"${updateSQLFilesName}";
Debug.ShouldStop(268435456);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updatesqlfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 1662;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithF";
Debug.ShouldStop(536870912);
_rs = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rs = _downloadsqlfilewithftp(_filen);Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1663;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _rs);
this.state = 335;
return;
case 335:
//C
this.state = 334;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1664;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(-2147483648);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 BA.debugLineNum = 1665;BA.debugLine="Sleep(1)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 1));
this.state = 336;
return;
case 336:
//C
this.state = 334;
;
 if (true) break;
if (true) break;

case 127:
//C
this.state = 128;
Debug.locals.put("i", _i);
;
 if (true) break;

case 128:
//C
this.state = 129;
;
 BA.debugLineNum = 1669;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(16);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ));
 BA.debugLineNum = 1670;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunSync\",lbld";
Debug.ShouldStop(32);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("DataUpdate")),(Object)(BA.ObjectToString("RunSync")),(Object)(parent.mostCurrent._lbldataupdateprocess.runMethod(true,"getText")));
 BA.debugLineNum = 1674;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(512);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1675;BA.debugLine="Log($\"LISTA DE FICHEIROS: ${updateSQLFilesName}";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817686",(RemoteObject.concat(RemoteObject.createImmutable("LISTA DE FICHEIROS: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updatesqlfilesname))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 1680;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(32768);
if (true) break;

case 129:
//if
this.state = 134;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 131;
}else {
this.state = 133;
}if (true) break;

case 131:
//C
this.state = 134;
 BA.debugLineNum = 1681;BA.debugLine="ShareCode.AlreadyDeleted = False";
Debug.ShouldStop(65536);
parent.mostCurrent._sharecode._alreadydeleted /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 133:
//C
this.state = 134;
 BA.debugLineNum = 1683;BA.debugLine="ShareCode.AlreadyDeleted = True";
Debug.ShouldStop(262144);
parent.mostCurrent._sharecode._alreadydeleted /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 if (true) break;

case 134:
//C
this.state = 135;
;
 BA.debugLineNum = 1686;BA.debugLine="Dim res As ResumableSub = ExecuteSqlFiles(updat";
Debug.ShouldStop(2097152);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _executesqlfiles(_updatesqlfilesname,parent.mostCurrent.__c.getField(true,"True"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1687;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 337;
return;
case 337:
//C
this.state = 135;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 BA.debugLineNum = 1689;BA.debugLine="If(finish)Then";
Debug.ShouldStop(16777216);
if (true) break;

case 135:
//if
this.state = 138;
if ((_finish).<Boolean>get().booleanValue()) { 
this.state = 137;
}if (true) break;

case 137:
//C
this.state = 138;
 BA.debugLineNum = 1690;BA.debugLine="Dim res As ResumableSub = SendServerProcessCom";
Debug.ShouldStop(33554432);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _sendserverprocesscomplete(parent.mostCurrent.__c.getField(true,"False"),parent.mostCurrent._requestfilename,dataupdate.getObject());Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1691;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 338;
return;
case 338:
//C
this.state = 138;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 BA.debugLineNum = 1693;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(updat";
Debug.ShouldStop(268435456);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _deletesqlfiles(_updatesqlfilesname);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1694;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Bool";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 339;
return;
case 339:
//C
this.state = 138;
_isfilesdeleted = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("IsFilesDeleted", _isfilesdeleted);
;
 if (true) break;

case 138:
//C
this.state = 139;
;
 if (true) break;

case 139:
//C
this.state = 140;
;
 if (true) break;

case 140:
//C
this.state = 141;
;
 BA.debugLineNum = 1715;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(262144);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1716;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
Debug.ShouldStop(524288);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1717;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(1048576);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1718;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(2097152);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1720;BA.debugLine="If ShareCode.FIRSTDAILYLOGIN Or SyncDates Then";
Debug.ShouldStop(8388608);
if (true) break;

case 141:
//if
this.state = 307;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._sharecode._firstdailylogin /*RemoteObject*/ ) || RemoteObject.solveBoolean(".",_syncdates)) { 
this.state = 143;
}if (true) break;

case 143:
//C
this.state = 144;
 BA.debugLineNum = 1721;BA.debugLine="If ShareCode.DownloadDocsFromFTP Then";
Debug.ShouldStop(16777216);
if (true) break;

case 144:
//if
this.state = 218;
if (parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 146;
}if (true) break;

case 146:
//C
this.state = 147;
 BA.debugLineNum = 1722;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(33554432);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 1723;BA.debugLine="Log(\"******************************************";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817734",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1724;BA.debugLine="Log($\" INITIAL : ${ShareCode.APPL_HOST}/${Share";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817735",(RemoteObject.concat(RemoteObject.createImmutable(" INITIAL : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 1725;BA.debugLine="Log(\"/docs/\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817736",RemoteObject.createImmutable("/docs/"),0);
 BA.debugLineNum = 1726;BA.debugLine="Log(\"******************************************";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817737",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1728;BA.debugLine="Dim FTPDOCSLIST As List";
Debug.ShouldStop(-2147483648);
_ftpdocslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPDOCSLIST", _ftpdocslist);
 BA.debugLineNum = 1729;BA.debugLine="Dim TotalDocs As Int = 0";
Debug.ShouldStop(1);
_totaldocs = BA.numberCast(int.class, 0);Debug.locals.put("TotalDocs", _totaldocs);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 1731;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(4);
if (true) break;

case 147:
//if
this.state = 152;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 149;
}else {
this.state = 151;
}if (true) break;

case 149:
//C
this.state = 152;
 BA.debugLineNum = 1732;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(8);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 1733;BA.debugLine="Dim Dates2Sync As List = Regex.Split(\"\\|\", dat";
Debug.ShouldStop(16);
_dates2sync = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_dates2sync = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_date2watch))));Debug.locals.put("Dates2Sync", _dates2sync);Debug.locals.put("Dates2Sync", _dates2sync);
 BA.debugLineNum = 1734;BA.debugLine="Dim iDateL As Long = DateTime.DateParse(Dates2";
Debug.ShouldStop(32);
_idatel = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_dates2sync.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))))));Debug.locals.put("iDateL", _idatel);Debug.locals.put("iDateL", _idatel);
 BA.debugLineNum = 1735;BA.debugLine="Dim eDateL As Long = DateTime.DateParse(Dates2";
Debug.ShouldStop(64);
_edatel = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_dates2sync.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))))));Debug.locals.put("eDateL", _edatel);Debug.locals.put("eDateL", _edatel);
 BA.debugLineNum = 1736;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
Debug.ShouldStop(128);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 if (true) break;

case 151:
//C
this.state = 152;
 BA.debugLineNum = 1738;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
Debug.ShouldStop(512);
_lmdate = parent.mostCurrent._utils.runMethod(true,"_getlastndayslong" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("LMDate", _lmdate);Debug.locals.put("LMDate", _lmdate);
 if (true) break;

case 152:
//C
this.state = 153;
;
 BA.debugLineNum = 1742;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareC";
Debug.ShouldStop(8192);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 1743;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sfl);
this.state = 340;
return;
case 340:
//C
this.state = 153;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 1744;BA.debugLine="If Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 153:
//if
this.state = 194;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 155;
}else {
this.state = 193;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 1745;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(65536);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1746;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(131072);
if (true) break;

case 156:
//if
this.state = 191;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
 BA.debugLineNum = 1747;BA.debugLine="FTPDOCSLIST.Initialize";
Debug.ShouldStop(262144);
_ftpdocslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1748;BA.debugLine="TotalDocs = files.Length -1";
Debug.ShouldStop(524288);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 1749;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista d";
Debug.ShouldStop(1048576);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.createImmutable("Criando Lista de ficheiros para download em /docs/"))));
 BA.debugLineNum = 1750;BA.debugLine="Sleep(500)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"),BA.numberCast(int.class, 500));
this.state = 341;
return;
case 341:
//C
this.state = 159;
;
 BA.debugLineNum = 1751;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(4194304);
if (true) break;

case 159:
//for
this.state = 190;
step249 = 1;
limit249 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 342;
if (true) break;

case 342:
//C
this.state = 190;
if ((step249 > 0 && _i <= limit249) || (step249 < 0 && _i >= limit249)) this.state = 161;
if (true) break;

case 343:
//C
this.state = 342;
_i = ((int)(0 + _i + step249)) ;
Debug.locals.put("i", _i);
if (true) break;

case 161:
//C
this.state = 162;
 BA.debugLineNum = 1752;BA.debugLine="Dim fName As String = files(i).Name";
Debug.ShouldStop(8388608);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 1753;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWi";
Debug.ShouldStop(16777216);
if (true) break;

case 162:
//if
this.state = 189;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)((_fname.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT")))))))) { 
this.state = 164;
}if (true) break;

case 164:
//C
this.state = 165;
 BA.debugLineNum = 1759;BA.debugLine="If SyncDates Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 165:
//if
this.state = 188;
if (_syncdates.<Boolean>get().booleanValue()) { 
this.state = 167;
}else {
this.state = 183;
}if (true) break;

case 167:
//C
this.state = 168;
 BA.debugLineNum = 1760;BA.debugLine="If ShareCode.DownloadDocsFromFTP = True Th";
Debug.ShouldStop(-2147483648);
if (true) break;

case 168:
//if
this.state = 181;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._downloaddocsfromftp /*RemoteObject*/ ,parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 170;
}else {
this.state = 176;
}if (true) break;

case 170:
//C
this.state = 171;
 BA.debugLineNum = 1761;BA.debugLine="If (files(i).Timestamp >= iDateL) And (fi";
Debug.ShouldStop(1);
if (true) break;

case 171:
//if
this.state = 174;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_idatel)))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("k",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_edatel))))) { 
this.state = 173;
}if (true) break;

case 173:
//C
this.state = 174;
 BA.debugLineNum = 1762;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(2);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 1763;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817774",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 if (true) break;

case 174:
//C
this.state = 181;
;
 if (true) break;

case 176:
//C
this.state = 177;
 BA.debugLineNum = 1766;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(32);
if (true) break;

case 177:
//if
this.state = 180;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_lmdate))) { 
this.state = 179;
}if (true) break;

case 179:
//C
this.state = 180;
 BA.debugLineNum = 1767;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(64);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 1768;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817779",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
 if (true) break;

case 180:
//C
this.state = 181;
;
 if (true) break;

case 181:
//C
this.state = 188;
;
 if (true) break;

case 183:
//C
this.state = 184;
 BA.debugLineNum = 1772;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
Debug.ShouldStop(2048);
if (true) break;

case 184:
//if
this.state = 187;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_lmdate))) { 
this.state = 186;
}if (true) break;

case 186:
//C
this.state = 187;
 BA.debugLineNum = 1773;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
Debug.ShouldStop(4096);
_ftpdocslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 BA.debugLineNum = 1774;BA.debugLine="Log(files(i).Name)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817785",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"),0);
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
 if (true) break;

case 189:
//C
this.state = 343;
;
 if (true) break;
if (true) break;

case 190:
//C
this.state = 191;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1780;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 1781;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817792",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1782;BA.debugLine="Log($\"Total Files Added to /DOCS List = ${FTP";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817793",(RemoteObject.concat(RemoteObject.createImmutable("Total Files Added to /DOCS List = "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_ftpdocslist.runMethod(true,"getSize")))),RemoteObject.createImmutable(" out of a Total of "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 1783;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817794",RemoteObject.createImmutable("*************************"),0);
 if (true) break;

case 191:
//C
this.state = 194;
;
 if (true) break;

case 193:
//C
this.state = 194;
 BA.debugLineNum = 1786;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error ge";
Debug.ShouldStop(33554432);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("RunSync")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/")));
 if (true) break;
;
 BA.debugLineNum = 1789;BA.debugLine="If (FTPDOCSLIST.IsInitialized) Then";
Debug.ShouldStop(268435456);

case 194:
//if
this.state = 217;
if ((_ftpdocslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 196;
}if (true) break;

case 196:
//C
this.state = 197;
 BA.debugLineNum = 1790;BA.debugLine="If (FTPDOCSLIST.Size>=1) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 197:
//if
this.state = 216;
if ((RemoteObject.solveBoolean("g",_ftpdocslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 199;
}if (true) break;

case 199:
//C
this.state = 200;
 BA.debugLineNum = 1791;BA.debugLine="TotalDocs = FTPDOCSLIST.Size-1";
Debug.ShouldStop(1073741824);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_ftpdocslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 1792;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817803",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1793;BA.debugLine="Log(\"Total DOCS : \" & TotalDocs)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817804",RemoteObject.concat(RemoteObject.createImmutable("Total DOCS : "),_totaldocs),0);
 BA.debugLineNum = 1794;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817805",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1795;BA.debugLine="For i=0 To FTPDOCSLIST.Size-1";
Debug.ShouldStop(4);
if (true) break;

case 200:
//for
this.state = 215;
step286 = 1;
limit286 = RemoteObject.solve(new RemoteObject[] {_ftpdocslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 344;
if (true) break;

case 344:
//C
this.state = 215;
if ((step286 > 0 && _i <= limit286) || (step286 < 0 && _i >= limit286)) this.state = 202;
if (true) break;

case 345:
//C
this.state = 344;
_i = ((int)(0 + _i + step286)) ;
Debug.locals.put("i", _i);
if (true) break;

case 202:
//C
this.state = 203;
 BA.debugLineNum = 1796;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpd";
Debug.ShouldStop(8);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/docs/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1797;BA.debugLine="Dim fName As String = FTPDOCSLIST.Get(i)";
Debug.ShouldStop(16);
_fname = BA.ObjectToString(_ftpdocslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 1798;BA.debugLine="Log(fName)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817809",_fname,0);
 BA.debugLineNum = 1799;BA.debugLine="Try";
Debug.ShouldStop(64);
if (true) break;

case 203:
//try
this.state = 214;
this.catchState = 213;
this.state = 205;
if (true) break;

case 205:
//C
this.state = 206;
this.catchState = 213;
 BA.debugLineNum = 1800;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"";
Debug.ShouldStop(128);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1801;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (Server";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sf);
this.state = 346;
return;
case 346:
//C
this.state = 206;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1803;BA.debugLine="If Success Then";
Debug.ShouldStop(1024);
if (true) break;

case 206:
//if
this.state = 211;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 208;
}else {
this.state = 210;
}if (true) break;

case 208:
//C
this.state = 211;
 BA.debugLineNum = 1804;BA.debugLine="Log(\"/docs/ : file was download successful";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817815",RemoteObject.createImmutable("/docs/ : file was download successfully"),0);
 if (true) break;

case 210:
//C
this.state = 211;
 BA.debugLineNum = 1806;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817817",RemoteObject.createImmutable("/docs/ : Error downloading file"),0);
 if (true) break;

case 211:
//C
this.state = 214;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 213:
//C
this.state = 214;
this.catchState = 0;
 BA.debugLineNum = 1809;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817820",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 214:
//C
this.state = 345;
this.catchState = 0;
;
 BA.debugLineNum = 1811;BA.debugLine="DUProgressBar(TotalDocs,i)";
Debug.ShouldStop(262144);
_duprogressbar(_totaldocs,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 215:
//C
this.state = 216;
Debug.locals.put("i", _i);
;
 if (true) break;

case 216:
//C
this.state = 217;
;
 if (true) break;

case 217:
//C
this.state = 218;
;
 if (true) break;

case 218:
//C
this.state = 219;
;
 BA.debugLineNum = 1822;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817833",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1823;BA.debugLine="Log(\"/docs/templates\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817834",RemoteObject.createImmutable("/docs/templates"),0);
 BA.debugLineNum = 1824;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817835",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1825;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(1);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1826;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 1827;BA.debugLine="Dim FTPTEMPLATESLIST As List";
Debug.ShouldStop(4);
_ftptemplateslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPTEMPLATESLIST", _ftptemplateslist);
 BA.debugLineNum = 1828;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(8);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 1830;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
Debug.ShouldStop(32);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 1831;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sfl);
this.state = 347;
return;
case 347:
//C
this.state = 219;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 1832;BA.debugLine="If Success Then";
Debug.ShouldStop(128);
if (true) break;

case 219:
//if
this.state = 232;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 221;
}else {
this.state = 231;
}if (true) break;

case 221:
//C
this.state = 222;
 BA.debugLineNum = 1834;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(512);
if (true) break;

case 222:
//if
this.state = 229;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 224;
}if (true) break;

case 224:
//C
this.state = 225;
 BA.debugLineNum = 1835;BA.debugLine="TotalDocs = files.Length -1";
Debug.ShouldStop(1024);
_totaldocs = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalDocs", _totaldocs);
 BA.debugLineNum = 1836;BA.debugLine="FTPTEMPLATESLIST.Initialize";
Debug.ShouldStop(2048);
_ftptemplateslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1837;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(4096);
if (true) break;

case 225:
//for
this.state = 228;
step319 = 1;
limit319 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 348;
if (true) break;

case 348:
//C
this.state = 228;
if ((step319 > 0 && _i <= limit319) || (step319 < 0 && _i >= limit319)) this.state = 227;
if (true) break;

case 349:
//C
this.state = 348;
_i = ((int)(0 + _i + step319)) ;
Debug.locals.put("i", _i);
if (true) break;

case 227:
//C
this.state = 349;
 BA.debugLineNum = 1838;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista d";
Debug.ShouldStop(8192);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Criando Lista de ficheiros para download em :/docs/templates/ "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaldocs))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1839;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(16384);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 1840;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
Debug.ShouldStop(32768);
_ftptemplateslist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;
if (true) break;

case 228:
//C
this.state = 229;
Debug.locals.put("i", _i);
;
 if (true) break;

case 229:
//C
this.state = 232;
;
 if (true) break;

case 231:
//C
this.state = 232;
 BA.debugLineNum = 1844;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error get";
Debug.ShouldStop(524288);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("RunSync")),(Object)(RemoteObject.createImmutable("error getting files list from /docs/templates/")));
 if (true) break;
;
 BA.debugLineNum = 1847;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";
Debug.ShouldStop(4194304);

case 232:
//if
this.state = 262;
if ((_ftptemplateslist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
 BA.debugLineNum = 1848;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 235:
//if
this.state = 261;
if ((RemoteObject.solveBoolean("g",_ftptemplateslist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 237;
}if (true) break;

case 237:
//C
this.state = 238;
 BA.debugLineNum = 1849;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(16777216);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 1850;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817861",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1851;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817862",RemoteObject.concat(RemoteObject.createImmutable("Total TEMPLATES : "),_totaltemplates),0);
 BA.debugLineNum = 1852;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817863",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1853;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
Debug.ShouldStop(268435456);
if (true) break;

case 238:
//for
this.state = 260;
step334 = 1;
limit334 = RemoteObject.solve(new RemoteObject[] {_ftptemplateslist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 350;
if (true) break;

case 350:
//C
this.state = 260;
if ((step334 > 0 && _i <= limit334) || (step334 < 0 && _i >= limit334)) this.state = 240;
if (true) break;

case 351:
//C
this.state = 350;
_i = ((int)(0 + _i + step334)) ;
Debug.locals.put("i", _i);
if (true) break;

case 240:
//C
this.state = 241;
 BA.debugLineNum = 1854;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
Debug.ShouldStop(536870912);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/docs/templates/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1855;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i";
Debug.ShouldStop(1073741824);
_fname2 = BA.ObjectToString(_ftptemplateslist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 1856;BA.debugLine="Dim oFName As String = $\"REMOVE_${fName2}\"$";
Debug.ShouldStop(-2147483648);
_ofname = (RemoteObject.concat(RemoteObject.createImmutable("REMOVE_"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname2))),RemoteObject.createImmutable("")));Debug.locals.put("oFName", _ofname);Debug.locals.put("oFName", _ofname);
 BA.debugLineNum = 1857;BA.debugLine="If File.Exists(Starter.InternalFolder, fName2";
Debug.ShouldStop(1);
if (true) break;

case 241:
//if
this.state = 244;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2)).<Boolean>get().booleanValue()) { 
this.state = 243;
}if (true) break;

case 243:
//C
this.state = 244;
 BA.debugLineNum = 1858;BA.debugLine="File.Copy(Starter.InternalFolder, fName2, St";
Debug.ShouldStop(2);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname));
 BA.debugLineNum = 1859;BA.debugLine="File.Delete(Starter.InternalFolder, fName2)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));
 if (true) break;

case 244:
//C
this.state = 245;
;
 BA.debugLineNum = 1861;BA.debugLine="Log(fName2)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817872",_fname2,0);
 BA.debugLineNum = 1862;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 245:
//try
this.state = 259;
this.catchState = 258;
this.state = 247;
if (true) break;

case 247:
//C
this.state = 248;
this.catchState = 258;
 BA.debugLineNum = 1863;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(64);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1864;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sf);
this.state = 352;
return;
case 352:
//C
this.state = 248;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1866;BA.debugLine="If Success Then";
Debug.ShouldStop(512);
if (true) break;

case 248:
//if
this.state = 253;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 250;
}else {
this.state = 252;
}if (true) break;

case 250:
//C
this.state = 253;
 BA.debugLineNum = 1867;BA.debugLine="Log(\"/docs/templates/ : file was download s";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817878",RemoteObject.createImmutable("/docs/templates/ : file was download successfully"),0);
 if (true) break;

case 252:
//C
this.state = 253;
 BA.debugLineNum = 1869;BA.debugLine="Log(\"/docs/templates/ : Error downloading f";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817880",RemoteObject.createImmutable("/docs/templates/ : Error downloading file"),0);
 BA.debugLineNum = 1870;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o f";
Debug.ShouldStop(8192);
_insertalerterrors((RemoteObject.concat(RemoteObject.createImmutable("Erro ao Descarregar o ficheiro"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname2))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1871;BA.debugLine="File.Copy(Starter.InternalFolder, oFName, S";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));
 if (true) break;
;
 BA.debugLineNum = 1873;BA.debugLine="If File.Exists(Starter.InternalFolder, oFNam";
Debug.ShouldStop(65536);

case 253:
//if
this.state = 256;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname)).<Boolean>get().booleanValue()) { 
this.state = 255;
}if (true) break;

case 255:
//C
this.state = 256;
 BA.debugLineNum = 1874;BA.debugLine="File.Delete(Starter.InternalFolder, oFName)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname));
 if (true) break;

case 256:
//C
this.state = 259;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 258:
//C
this.state = 259;
this.catchState = 0;
 BA.debugLineNum = 1877;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817888",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 259:
//C
this.state = 351;
this.catchState = 0;
;
 BA.debugLineNum = 1879;BA.debugLine="DUProgressBar(TotalTemplates,i)";
Debug.ShouldStop(4194304);
_duprogressbar(_totaltemplates,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 260:
//C
this.state = 261;
Debug.locals.put("i", _i);
;
 if (true) break;

case 261:
//C
this.state = 262;
;
 if (true) break;

case 262:
//C
this.state = 263;
;
 BA.debugLineNum = 1887;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817898",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1888;BA.debugLine="Log(\"/interno\")";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817899",RemoteObject.createImmutable("/interno"),0);
 BA.debugLineNum = 1889;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817900",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 1890;BA.debugLine="DUProgressBar(100,0)";
Debug.ShouldStop(2);
_duprogressbar(BA.numberCast(int.class, 100),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1891;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
Debug.ShouldStop(4);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ));
 BA.debugLineNum = 1892;BA.debugLine="Dim FTPINTERNOLIST As List";
Debug.ShouldStop(8);
_ftpinternolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("FTPINTERNOLIST", _ftpinternolist);
 BA.debugLineNum = 1893;BA.debugLine="Dim TotalTemplates As Int = 0";
Debug.ShouldStop(16);
_totaltemplates = BA.numberCast(int.class, 0);Debug.locals.put("TotalTemplates", _totaltemplates);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 1895;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
Debug.ShouldStop(64);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.createImmutable("/interno/")));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 1896;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sfl);
this.state = 353;
return;
case 353:
//C
this.state = 263;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("files", _files);
;
 BA.debugLineNum = 1897;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 263:
//if
this.state = 276;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 265;
}else {
this.state = 275;
}if (true) break;

case 265:
//C
this.state = 266;
 BA.debugLineNum = 1899;BA.debugLine="If (files.Length >= 1) Then";
Debug.ShouldStop(1024);
if (true) break;

case 266:
//if
this.state = 273;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 268;
}if (true) break;

case 268:
//C
this.state = 269;
 BA.debugLineNum = 1900;BA.debugLine="FTPINTERNOLIST.Initialize";
Debug.ShouldStop(2048);
_ftpinternolist.runVoidMethod ("Initialize");
 BA.debugLineNum = 1901;BA.debugLine="For i = 0 To files.Length - 1";
Debug.ShouldStop(4096);
if (true) break;

case 269:
//for
this.state = 272;
step375 = 1;
limit375 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 354;
if (true) break;

case 354:
//C
this.state = 272;
if ((step375 > 0 && _i <= limit375) || (step375 < 0 && _i >= limit375)) this.state = 271;
if (true) break;

case 355:
//C
this.state = 354;
_i = ((int)(0 + _i + step375)) ;
Debug.locals.put("i", _i);
if (true) break;

case 271:
//C
this.state = 355;
 BA.debugLineNum = 1902;BA.debugLine="Dim fName2 As String = files(i).Name";
Debug.ShouldStop(8192);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 1903;BA.debugLine="FTPINTERNOLIST.Add(files(i).Name)";
Debug.ShouldStop(16384);
_ftpinternolist.runVoidMethod ("Add",(Object)((_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName"))));
 if (true) break;
if (true) break;

case 272:
//C
this.state = 273;
Debug.locals.put("i", _i);
;
 if (true) break;

case 273:
//C
this.state = 276;
;
 if (true) break;

case 275:
//C
this.state = 276;
 BA.debugLineNum = 1907;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallComplete";
Debug.ShouldStop(262144);
parent.mostCurrent._utils.runVoidMethod ("_showprocinlog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(BA.ObjectToString("FirstIntallCompleteProcedure")),(Object)(RemoteObject.createImmutable("error getting files list from /interno/")));
 if (true) break;
;
 BA.debugLineNum = 1910;BA.debugLine="If (FTPINTERNOLIST.IsInitialized) Then";
Debug.ShouldStop(2097152);

case 276:
//if
this.state = 306;
if ((_ftpinternolist.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 278;
}if (true) break;

case 278:
//C
this.state = 279;
 BA.debugLineNum = 1911;BA.debugLine="If (FTPINTERNOLIST.Size>=1) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 279:
//if
this.state = 305;
if ((RemoteObject.solveBoolean("g",_ftpinternolist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 281;
}if (true) break;

case 281:
//C
this.state = 282;
 BA.debugLineNum = 1912;BA.debugLine="TotalTemplates = FTPINTERNOLIST.Size-1";
Debug.ShouldStop(8388608);
_totaltemplates = RemoteObject.solve(new RemoteObject[] {_ftpinternolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("TotalTemplates", _totaltemplates);
 BA.debugLineNum = 1913;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817924",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1914;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817925",RemoteObject.concat(RemoteObject.createImmutable("Total TEMPLATES : "),_totaltemplates),0);
 BA.debugLineNum = 1915;BA.debugLine="Log(\"*************************\")";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817926",RemoteObject.createImmutable("*************************"),0);
 BA.debugLineNum = 1916;BA.debugLine="For i=0 To FTPINTERNOLIST.Size-1";
Debug.ShouldStop(134217728);
if (true) break;

case 282:
//for
this.state = 304;
step389 = 1;
limit389 = RemoteObject.solve(new RemoteObject[] {_ftpinternolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 356;
if (true) break;

case 356:
//C
this.state = 304;
if ((step389 > 0 && _i <= limit389) || (step389 < 0 && _i >= limit389)) this.state = 284;
if (true) break;

case 357:
//C
this.state = 356;
_i = ((int)(0 + _i + step389)) ;
Debug.locals.put("i", _i);
if (true) break;

case 284:
//C
this.state = 285;
 BA.debugLineNum = 1917;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("(/interno/) "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totaltemplates))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1918;BA.debugLine="Dim fName2 As String = FTPINTERNOLIST.Get(i)";
Debug.ShouldStop(536870912);
_fname2 = BA.ObjectToString(_ftpinternolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 1919;BA.debugLine="Dim oFName As String = $\"REMOVE_${fName2}\"$";
Debug.ShouldStop(1073741824);
_ofname = (RemoteObject.concat(RemoteObject.createImmutable("REMOVE_"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname2))),RemoteObject.createImmutable("")));Debug.locals.put("oFName", _ofname);Debug.locals.put("oFName", _ofname);
 BA.debugLineNum = 1920;BA.debugLine="If File.Exists(Starter.InternalFolder, fName2";
Debug.ShouldStop(-2147483648);
if (true) break;

case 285:
//if
this.state = 288;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2)).<Boolean>get().booleanValue()) { 
this.state = 287;
}if (true) break;

case 287:
//C
this.state = 288;
 BA.debugLineNum = 1921;BA.debugLine="File.Copy(Starter.InternalFolder, fName2, St";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname));
 BA.debugLineNum = 1922;BA.debugLine="File.Delete(Starter.InternalFolder, fName2)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));
 if (true) break;

case 288:
//C
this.state = 289;
;
 BA.debugLineNum = 1924;BA.debugLine="Log(fName2)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817935",_fname2,0);
 BA.debugLineNum = 1925;BA.debugLine="Try";
Debug.ShouldStop(16);
if (true) break;

case 289:
//try
this.state = 303;
this.catchState = 302;
this.state = 291;
if (true) break;

case 291:
//C
this.state = 292;
this.catchState = 302;
 BA.debugLineNum = 1926;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(32);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/interno/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1927;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _sf);
this.state = 358;
return;
case 358:
//C
this.state = 292;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1929;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 292:
//if
this.state = 297;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 294;
}else {
this.state = 296;
}if (true) break;

case 294:
//C
this.state = 297;
 BA.debugLineNum = 1930;BA.debugLine="Log(\"/interno/ : file was download successf";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817941",RemoteObject.createImmutable("/interno/ : file was download successfully"),0);
 if (true) break;

case 296:
//C
this.state = 297;
 BA.debugLineNum = 1932;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817943",RemoteObject.createImmutable("/interno/ : Error downloading file"),0);
 BA.debugLineNum = 1933;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o f";
Debug.ShouldStop(4096);
_insertalerterrors((RemoteObject.concat(RemoteObject.createImmutable("Erro ao Descarregar o ficheiro"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fname2))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1934;BA.debugLine="File.Copy(Starter.InternalFolder, oFName, S";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));
 if (true) break;
;
 BA.debugLineNum = 1936;BA.debugLine="If File.Exists(Starter.InternalFolder, oFNam";
Debug.ShouldStop(32768);

case 297:
//if
this.state = 300;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname)).<Boolean>get().booleanValue()) { 
this.state = 299;
}if (true) break;

case 299:
//C
this.state = 300;
 BA.debugLineNum = 1937;BA.debugLine="File.Delete(Starter.InternalFolder, oFName)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_ofname));
 if (true) break;

case 300:
//C
this.state = 303;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 302:
//C
this.state = 303;
this.catchState = 0;
 BA.debugLineNum = 1940;BA.debugLine="Log(LastException)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660817951",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 303:
//C
this.state = 357;
this.catchState = 0;
;
 BA.debugLineNum = 1942;BA.debugLine="DUProgressBar(TotalTemplates,i)";
Debug.ShouldStop(2097152);
_duprogressbar(_totaltemplates,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 304:
//C
this.state = 305;
Debug.locals.put("i", _i);
;
 if (true) break;

case 305:
//C
this.state = 306;
;
 if (true) break;

case 306:
//C
this.state = 307;
;
 BA.debugLineNum = 1946;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(33554432);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 307:
//C
this.state = 308;
;
 BA.debugLineNum = 1950;BA.debugLine="Dim res As ResumableSub = DURemoveAllLocalInfoAnd";
Debug.ShouldStop(536870912);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _duremovealllocalinfoandsqlfiles();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1951;BA.debugLine="Wait For(res) Complete (RemoveSuccessful As Boole";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runsync"), _res);
this.state = 359;
return;
case 359:
//C
this.state = 308;
_removesuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RemoveSuccessful", _removesuccessful);
;
 BA.debugLineNum = 1952;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDataUpda";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*RemoteObject*/ ));
 BA.debugLineNum = 1956;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
Debug.ShouldStop(8);
if (true) break;

case 308:
//if
this.state = 313;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 310;
}else {
this.state = 312;
}if (true) break;

case 310:
//C
this.state = 313;
 BA.debugLineNum = 1957;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
Debug.ShouldStop(16);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ));
 if (true) break;

case 312:
//C
this.state = 313;
 BA.debugLineNum = 1959;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(64);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 if (true) break;

case 313:
//C
this.state = -1;
;
 BA.debugLineNum = 1961;BA.debugLine="Starter.FirstInstall = False";
Debug.ShouldStop(256);
parent.mostCurrent._starter._firstinstall /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1967;BA.debugLine="ShareCode.Types_AlreadyDeleted = False";
Debug.ShouldStop(16384);
parent.mostCurrent._sharecode._types_alreadydeleted /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1968;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(32768);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1969;BA.debugLine="Starter.StopLocationCheck = False";
Debug.ShouldStop(65536);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1970;BA.debugLine="StartService(LocationService)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 1971;BA.debugLine="StartService(BackgroundUpdateService)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 1972;BA.debugLine="ButtonWelcomeNext.Enabled = True";
Debug.ShouldStop(524288);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1973;BA.debugLine="ProgressBar1.Visible = False";
Debug.ShouldStop(1048576);
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1976;BA.debugLine="ShareCode.AwakeDevice(False)";
Debug.ShouldStop(8388608);
parent.mostCurrent._sharecode.runVoidMethod ("_awakedevice" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1977;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1978;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _runupdate60last7next() throws Exception{
try {
		Debug.PushSubsStack("RunUpdate60Last7Next (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,592);
if (RapidSub.canDelegate("runupdate60last7next")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","runupdate60last7next");}
ResumableSub_RunUpdate60Last7Next rsub = new ResumableSub_RunUpdate60Last7Next(null);
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
public static class ResumableSub_RunUpdate60Last7Next extends BA.ResumableSub {
public ResumableSub_RunUpdate60Last7Next(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _totallinesofscripts = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _removesuccessful = RemoteObject.createImmutable(false);
RemoteObject _requestsuccessful = RemoteObject.createImmutable(false);
RemoteObject _update_install_info = RemoteObject.createImmutable("");
RemoteObject _updateinstallfilesname = RemoteObject.createImmutable("");
RemoteObject _deletefilename = RemoteObject.createImmutable("");
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
RemoteObject _deletesispresent = RemoteObject.createImmutable(false);
RemoteObject _resdel = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _colinserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mastertagcode = RemoteObject.createImmutable("");
RemoteObject _childfield = RemoteObject.createImmutable("");
RemoteObject _tagcodelist = RemoteObject.createImmutable("");
RemoteObject _newinfolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _table = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filen = RemoteObject.createImmutable("");
int _n = 0;
RemoteObject _script2execute = RemoteObject.createImmutable("");
RemoteObject _completed = RemoteObject.createImmutable(false);
RemoteObject group64;
int index64;
int groupLen64;
int step75;
int limit75;
int step117;
int limit117;
int step137;
int limit137;
int step156;
int limit156;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunUpdate60Last7Next (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,592);
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
 BA.debugLineNum = 594;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(131072);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 595;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(262144);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 596;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(524288);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 597;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 598;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 599;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(4194304);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 600;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 601;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(16777216);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 602;BA.debugLine="DUProgressBar2(0,0)";
Debug.ShouldStop(33554432);
_duprogressbar2(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 603;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
Debug.ShouldStop(67108864);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 604;BA.debugLine="lbldataupdateprocess.Text = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 605;BA.debugLine="ProgressBar1.Visible = True";
Debug.ShouldStop(268435456);
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 612;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
Debug.ShouldStop(8);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso2primeirainstalacao /*RemoteObject*/ ));
 BA.debugLineNum = 614;BA.debugLine="Dim res As ResumableSub = RemoveAllLocalInfoAndSq";
Debug.ShouldStop(32);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _removealllocalinfoandsqlfiles();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 615;BA.debugLine="Wait For(res) Complete (RemoveSuccessful As Boole";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 112;
return;
case 112:
//C
this.state = 1;
_removesuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RemoveSuccessful", _removesuccessful);
;
 BA.debugLineNum = 617;BA.debugLine="Dim res As ResumableSub = RequestUpdate60Last7Nex";
Debug.ShouldStop(256);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _requestupdate60last7next();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 618;BA.debugLine="Wait For(res) Complete (RequestSuccessful As Bool";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 113;
return;
case 113:
//C
this.state = 1;
_requestsuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RequestSuccessful", _requestsuccessful);
;
 BA.debugLineNum = 619;BA.debugLine="If(RequestSuccessful) Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 106;
if ((_requestsuccessful).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 99;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 621;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${RequestF";
Debug.ShouldStop(4096);
_update_install_info = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._requestfilenameheaders))),RemoteObject.createImmutable(".INFO")));Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);
 BA.debugLineNum = 622;BA.debugLine="Dim updateInstallFilesName As String = RequestFi";
Debug.ShouldStop(8192);
_updateinstallfilesname = parent.mostCurrent._requestfilenameheaders;Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);
 BA.debugLineNum = 623;BA.debugLine="Dim deleteFileName As String = $\"${RequestFileNa";
Debug.ShouldStop(16384);
_deletefilename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._requestfilenameheaders))),RemoteObject.createImmutable("-DELETE.sql")));Debug.locals.put("deleteFileName", _deletefilename);Debug.locals.put("deleteFileName", _deletefilename);
 BA.debugLineNum = 630;BA.debugLine="Dim SqlFilesTotal As Int = 0";
Debug.ShouldStop(2097152);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 631;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(4194304);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 632;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(8388608);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 633;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(16777216);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 635;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(67108864);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 636;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(134217728);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 637;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(268435456);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 638;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(536870912);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 639;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(1073741824);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 640;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(-2147483648);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 641;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(1);
if (true) break;

case 4:
//do while
this.state = 56;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 643;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(4);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_update_install_info)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_install_info));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 644;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _sf);
this.state = 114;
return;
case 114:
//C
this.state = 7;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 646;BA.debugLine="If Success Then";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 55;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 54;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 647;BA.debugLine="Log(UPDATE_INSTALL_INFO & \" file was download";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489783",RemoteObject.concat(_update_install_info,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 653;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 10:
//try
this.state = 52;
this.catchState = 51;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 51;
 BA.debugLineNum = 654;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
Debug.ShouldStop(8192);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 656;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 15;
}else {
this.state = 48;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 657;BA.debugLine="Dim JsonStruct As String = File.readstring(S";
Debug.ShouldStop(65536);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_install_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 658;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(131072);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 659;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(262144);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 660;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(524288);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 661;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\"";
Debug.ShouldStop(1048576);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 662;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(2097152);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 663;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(4194304);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 668;BA.debugLine="Dim DeletesIsPresent As Boolean = False";
Debug.ShouldStop(134217728);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);Debug.locals.put("DeletesIsPresent", _deletesispresent);
 BA.debugLineNum = 669;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(268435456);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_deletefilename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deletefilename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 670;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _sf);
this.state = 115;
return;
case 115:
//C
this.state = 16;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 672;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO DE D";
Debug.ShouldStop(-2147483648);
if (true) break;

case 16:
//if
this.state = 27;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 673;BA.debugLine="Log(deleteFileName & \" file was download su";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489809",RemoteObject.concat(_deletefilename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 675;BA.debugLine="If File.Exists(Starter.Provider.SharedFolde";
Debug.ShouldStop(4);
if (true) break;

case 19:
//if
this.state = 24;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deletefilename)).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 676;BA.debugLine="DeletesIsPresent = True";
Debug.ShouldStop(8);
_deletesispresent = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 678;BA.debugLine="DeletesIsPresent = False";
Debug.ShouldStop(32);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 681;BA.debugLine="DeletesIsPresent = False";
Debug.ShouldStop(256);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;
;
 BA.debugLineNum = 693;BA.debugLine="If DeletesIsPresent Then";
Debug.ShouldStop(1048576);

case 27:
//if
this.state = 46;
if (_deletesispresent.<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 46;
 BA.debugLineNum = 694;BA.debugLine="Dim resDel As ResumableSub = MakeDeleteSqlF";
Debug.ShouldStop(2097152);
_resdel = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resdel = _makedeletesqlfile(_deletefilename);Debug.locals.put("resDel", _resdel);Debug.locals.put("resDel", _resdel);
 BA.debugLineNum = 695;BA.debugLine="Wait For(resDel) Complete (finish As Boolea";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _resdel);
this.state = 116;
return;
case 116:
//C
this.state = 46;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 697;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(16777216);
if (true) break;

case 32:
//for
this.state = 45;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group64 = _inserts;
index64 = 0;
groupLen64 = group64.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 117;
if (true) break;

case 117:
//C
this.state = 45;
if (index64 < groupLen64) {
this.state = 34;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group64.runMethod(false,"Get",index64));}
if (true) break;

case 118:
//C
this.state = 117;
index64++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 698;BA.debugLine="Dim mastertagcode As String = colinserts.G";
Debug.ShouldStop(33554432);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 699;BA.debugLine="Try";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 700;BA.debugLine="Dim childfield As String = colinserts.Get";
Debug.ShouldStop(134217728);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 51;
 BA.debugLineNum = 702;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(536870912);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 703;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489839",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 51;
;
 BA.debugLineNum = 705;BA.debugLine="Dim tagcodelist As String = colinserts.Get";
Debug.ShouldStop(1);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 706;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\"";
Debug.ShouldStop(2);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 707;BA.debugLine="Dim table As String = colinserts.Get(\"tabl";
Debug.ShouldStop(4);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 709;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(16);
if (true) break;

case 41:
//for
this.state = 44;
step75 = 1;
limit75 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 119;
if (true) break;

case 119:
//C
this.state = 44;
if ((step75 > 0 && _i <= limit75) || (step75 < 0 && _i >= limit75)) this.state = 43;
if (true) break;

case 120:
//C
this.state = 119;
_i = ((int)(0 + _i + step75)) ;
Debug.locals.put("i", _i);
if (true) break;

case 43:
//C
this.state = 120;
 BA.debugLineNum = 710;BA.debugLine="Dim res As ResumableSub = DBStructures.Re";
Debug.ShouldStop(32);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 711;BA.debugLine="Wait For(res) Complete (result As Boolean";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 121;
return;
case 121:
//C
this.state = 120;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 118;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
Debug.locals.put("colinserts", _colinserts);
;
 if (true) break;

case 46:
//C
this.state = 49;
;
 BA.debugLineNum = 717;BA.debugLine="SqlFilesTotal = Totalfiles";
Debug.ShouldStop(4096);
parent._sqlfilestotal = _totalfiles;
 BA.debugLineNum = 718;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(8192);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 719;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(16384);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 720;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(32768);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 721;BA.debugLine="dotry = False";
Debug.ShouldStop(65536);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 722;BA.debugLine="trycount = 3";
Debug.ShouldStop(131072);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 723;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(262144);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 727;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(4194304);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 728;BA.debugLine="List1 = File.ReadList(Starter.Provider.Share";
Debug.ShouldStop(8388608);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_install_info));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 729;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de fic";
Debug.ShouldStop(16777216);
parent._sqlfilestotal = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 730;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(33554432);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 731;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 732;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(134217728);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 733;BA.debugLine="dotry = False";
Debug.ShouldStop(268435456);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 734;BA.debugLine="trycount = 3";
Debug.ShouldStop(536870912);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 735;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(1073741824);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 49:
//C
this.state = 52;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
 BA.debugLineNum = 738;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489874",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 739;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(4);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 55;
this.catchState = 0;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 742;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489878",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 743;BA.debugLine="Log(\"Error downloading file \" & UPDATE_INSTALL";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489879",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_update_install_info),0);
 BA.debugLineNum = 744;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o fich";
Debug.ShouldStop(128);
_insertalerterrors((RemoteObject.concat(RemoteObject.createImmutable("Erro ao Descarregar o ficheiro"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_update_install_info))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 745;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(256);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 55:
//C
this.state = 4;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 748;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2048);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 755;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(262144);
if (true) break;

case 57:
//if
this.state = 74;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 756;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(524288);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ));
 BA.debugLineNum = 758;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(2097152);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 759;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
Debug.ShouldStop(4194304);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 760;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(8388608);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 762;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(33554432);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 764;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(134217728);
if (true) break;

case 60:
//for
this.state = 73;
step117 = 1;
limit117 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 122;
if (true) break;

case 122:
//C
this.state = 73;
if ((step117 > 0 && _i <= limit117) || (step117 < 0 && _i >= limit117)) this.state = 62;
if (true) break;

case 123:
//C
this.state = 122;
_i = ((int)(0 + _i + step117)) ;
Debug.locals.put("i", _i);
if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 765;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(268435456);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 766;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
Debug.ShouldStop(536870912);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updateinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 768;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
Debug.ShouldStop(-2147483648);
if (true) break;

case 63:
//if
this.state = 66;
if ((parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen))).<Boolean>get().booleanValue()) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 769;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fi";
Debug.ShouldStop(1);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 66:
//C
this.state = 67;
;
 BA.debugLineNum = 774;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(32);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filen)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 775;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _sf);
this.state = 124;
return;
case 124:
//C
this.state = 67;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 777;BA.debugLine="If Success Then";
Debug.ShouldStop(256);
if (true) break;

case 67:
//if
this.state = 72;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
 BA.debugLineNum = 778;BA.debugLine="Log(fileN & \" file was download successfully\"";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489914",RemoteObject.concat(_filen,RemoteObject.createImmutable(" file was download successfully")),0);
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 780;BA.debugLine="Log(\"Error downloading file \" & fileN)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489916",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filen),0);
 if (true) break;

case 72:
//C
this.state = 123;
;
 BA.debugLineNum = 783;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(16384);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 73:
//C
this.state = 74;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 786;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(131072);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 74:
//C
this.state = 75;
;
 BA.debugLineNum = 791;BA.debugLine="DUProgressBar2(0,0)";
Debug.ShouldStop(4194304);
_duprogressbar2(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 792;BA.debugLine="Sleep(500)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"),BA.numberCast(int.class, 500));
this.state = 125;
return;
case 125:
//C
this.state = 75;
;
 BA.debugLineNum = 799;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 75:
//if
this.state = 97;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
 BA.debugLineNum = 801;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(1);
if (true) break;

case 78:
//for
this.state = 96;
step137 = 1;
limit137 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 126;
if (true) break;

case 126:
//C
this.state = 96;
if ((step137 > 0 && _i <= limit137) || (step137 < 0 && _i >= limit137)) this.state = 80;
if (true) break;

case 127:
//C
this.state = 126;
_i = ((int)(0 + _i + step137)) ;
Debug.locals.put("i", _i);
if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 802;BA.debugLine="TotalLinesOfScripts = 0";
Debug.ShouldStop(2);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 803;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(4);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 804;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
Debug.ShouldStop(8);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updateinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 806;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(32);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 808;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(128);
if (true) break;

case 81:
//if
this.state = 86;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
 BA.debugLineNum = 809;BA.debugLine="List1.Clear";
Debug.ShouldStop(256);
_list1.runVoidMethod ("Clear");
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 811;BA.debugLine="List1.Initialize";
Debug.ShouldStop(1024);
_list1.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 814;BA.debugLine="Try";
Debug.ShouldStop(8192);

case 86:
//try
this.state = 91;
this.catchState = 90;
this.state = 88;
if (true) break;

case 88:
//C
this.state = 91;
this.catchState = 90;
 BA.debugLineNum = 815;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(16384);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 816;BA.debugLine="TotalLinesOfScripts = List1.Size";
Debug.ShouldStop(32768);
_totallinesofscripts = _list1.runMethod(true,"getSize");Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 Debug.CheckDeviceExceptions();
if (true) break;

case 90:
//C
this.state = 91;
this.catchState = 0;
 BA.debugLineNum = 818;BA.debugLine="Log(LastException)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660489954",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
;
 BA.debugLineNum = 821;BA.debugLine="DUProgressBar2(0,0)";
Debug.ShouldStop(1048576);
_duprogressbar2(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 822;BA.debugLine="DataUpdateProgressBar2.visible = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._dataupdateprogressbar2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 823;BA.debugLine="DataUpdateLabelTarefa.Visible = True";
Debug.ShouldStop(4194304);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 824;BA.debugLine="For n = 0 To List1.Size -1";
Debug.ShouldStop(8388608);
if (true) break;

case 92:
//for
this.state = 95;
step156 = 1;
limit156 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 128;
if (true) break;

case 128:
//C
this.state = 95;
if ((step156 > 0 && _n <= limit156) || (step156 < 0 && _n >= limit156)) this.state = 94;
if (true) break;

case 129:
//C
this.state = 128;
_n = ((int)(0 + _n + step156)) ;
Debug.locals.put("n", _n);
if (true) break;

case 94:
//C
this.state = 129;
 BA.debugLineNum = 825;BA.debugLine="DataUpdateLabelTarefa.Text = ShareCode.MsgExe";
Debug.ShouldStop(16777216);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgexecprocact /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totallinesofscripts))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 826;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
Debug.ShouldStop(33554432);
_script2execute = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("Script2Execute", _script2execute);Debug.locals.put("Script2Execute", _script2execute);
 BA.debugLineNum = 827;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
Debug.ShouldStop(67108864);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(_script2execute),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 828;BA.debugLine="DUProgressBar2(TotalLinesOfScripts,n)";
Debug.ShouldStop(134217728);
_duprogressbar2(_totallinesofscripts,BA.numberCast(int.class, _n));
 BA.debugLineNum = 829;BA.debugLine="Sleep(1)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"),BA.numberCast(int.class, 1));
this.state = 130;
return;
case 130:
//C
this.state = 129;
;
 if (true) break;
if (true) break;

case 95:
//C
this.state = 127;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 834;BA.debugLine="DataUpdateProgressBar2.visible = False";
Debug.ShouldStop(2);
parent.mostCurrent._dataupdateprogressbar2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 835;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
Debug.ShouldStop(4);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 836;BA.debugLine="DUProgressBar(SqlFilesTotal,n)";
Debug.ShouldStop(8);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _n));
 BA.debugLineNum = 837;BA.debugLine="Sleep(1)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"),BA.numberCast(int.class, 1));
this.state = 131;
return;
case 131:
//C
this.state = 127;
;
 if (true) break;
if (true) break;

case 96:
//C
this.state = 97;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 844;BA.debugLine="Dim res As ResumableSub = SendServerProcessComp";
Debug.ShouldStop(2048);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _sendserverprocesscomplete(parent.mostCurrent.__c.getField(true,"False"),parent.mostCurrent._requestfilenameheaders,dataupdate.getObject());Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 845;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 132;
return;
case 132:
//C
this.state = 97;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 if (true) break;

case 97:
//C
this.state = 106;
;
 if (true) break;

case 99:
//C
this.state = 100;
 BA.debugLineNum = 850;BA.debugLine="MsgboxAsync(ShareCode.MsgErroProc60last7new,Shar";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgerroproc60last7new /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),dataupdate.processBA);
 BA.debugLineNum = 851;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1";
Debug.ShouldStop(262144);
if (true) break;

case 100:
//if
this.state = 105;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._progressbar1.runMethod(true,"getVisible"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 102;
;}if (true) break;

case 102:
//C
this.state = 105;
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
if (true) break;

case 105:
//C
this.state = 106;
;
 BA.debugLineNum = 852;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 854;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1.";
Debug.ShouldStop(2097152);

case 106:
//if
this.state = 111;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._progressbar1.runMethod(true,"getVisible"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 108;
;}if (true) break;

case 108:
//C
this.state = 111;
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
if (true) break;

case 111:
//C
this.state = -1;
;
 BA.debugLineNum = 855;BA.debugLine="StartService(BackgroundUpdateService)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 856;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(8388608);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 857;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 858;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _runupdateonday() throws Exception{
try {
		Debug.PushSubsStack("RunUpdateOnDay (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,929);
if (RapidSub.canDelegate("runupdateonday")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","runupdateonday");}
ResumableSub_RunUpdateOnDay rsub = new ResumableSub_RunUpdateOnDay(null);
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
public static class ResumableSub_RunUpdateOnDay extends BA.ResumableSub {
public ResumableSub_RunUpdateOnDay(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _totallinesofscripts = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _removesuccessful = RemoteObject.createImmutable(false);
RemoteObject _resreq = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _requestsuccessful = RemoteObject.createImmutable(false);
RemoteObject _update_install_info = RemoteObject.createImmutable("");
RemoteObject _updateinstallfilesname = RemoteObject.createImmutable("");
RemoteObject _deletefilename = RemoteObject.createImmutable("");
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
RemoteObject _deletesispresent = RemoteObject.createImmutable(false);
RemoteObject _resdel = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finish = RemoteObject.createImmutable(false);
RemoteObject _colinserts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mastertagcode = RemoteObject.createImmutable("");
RemoteObject _childfield = RemoteObject.createImmutable("");
RemoteObject _tagcodelist = RemoteObject.createImmutable("");
RemoteObject _newinfolist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _table = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _date = RemoteObject.createImmutable("");
RemoteObject _list1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filen = RemoteObject.createImmutable("");
RemoteObject _alreadydeleted = RemoteObject.createImmutable(false);
int _n = 0;
RemoteObject _script2execute = RemoteObject.createImmutable("");
RemoteObject _sql2del = RemoteObject.createImmutable("");
RemoteObject _completed = RemoteObject.createImmutable(false);
RemoteObject group65;
int index65;
int groupLen65;
int step76;
int limit76;
int step123;
int limit123;
int step143;
int limit143;
int step163;
int limit163;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RunUpdateOnDay (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,929);
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
 BA.debugLineNum = 930;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
Debug.ShouldStop(2);
parent.mostCurrent._sharecode._globaleventstimer /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 931;BA.debugLine="Starter.StopLocationCheck = True";
Debug.ShouldStop(4);
parent.mostCurrent._starter._stoplocationcheck /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 932;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(8);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 933;BA.debugLine="StopService(LocationService)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._locationservice.getObject())));
 BA.debugLineNum = 934;BA.debugLine="StopService(BackgroundUpdateService)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("StopService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 935;BA.debugLine="ButtonWelcomeNext.Enabled = False";
Debug.ShouldStop(64);
parent.mostCurrent._buttonwelcomenext.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 936;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
Debug.ShouldStop(128);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 937;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(256);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 938;BA.debugLine="DUProgressBar2(0,0)";
Debug.ShouldStop(512);
_duprogressbar2(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 939;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
Debug.ShouldStop(1024);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 940;BA.debugLine="lbldataupdateprocess.Text = \"\"";
Debug.ShouldStop(2048);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 941;BA.debugLine="ProgressBar1.Visible = True";
Debug.ShouldStop(4096);
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 945;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
Debug.ShouldStop(65536);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso3primeirainstalacao /*RemoteObject*/ ));
 BA.debugLineNum = 947;BA.debugLine="Dim res As ResumableSub = RemoveAllLocalInfoAndSq";
Debug.ShouldStop(262144);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _removealllocalinfoandsqlfiles();Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 948;BA.debugLine="Wait For(res) Complete (RemoveSuccessful As Boole";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _res);
this.state = 131;
return;
case 131:
//C
this.state = 1;
_removesuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RemoveSuccessful", _removesuccessful);
;
 BA.debugLineNum = 950;BA.debugLine="Dim resReq As ResumableSub = RequestUpdateOnDay '";
Debug.ShouldStop(2097152);
_resreq = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resreq = _requestupdateonday();Debug.locals.put("resReq", _resreq);Debug.locals.put("resReq", _resreq);
 BA.debugLineNum = 951;BA.debugLine="Wait For(resReq) Complete (RequestSuccessful As B";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _resreq);
this.state = 132;
return;
case 132:
//C
this.state = 1;
_requestsuccessful = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("RequestSuccessful", _requestsuccessful);
;
 BA.debugLineNum = 952;BA.debugLine="If(RequestSuccessful) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 124;
if ((_requestsuccessful).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 117;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 954;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${RequestF";
Debug.ShouldStop(33554432);
_update_install_info = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._requestfilenameonday))),RemoteObject.createImmutable(".INFO")));Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);Debug.locals.put("UPDATE_INSTALL_INFO", _update_install_info);
 BA.debugLineNum = 955;BA.debugLine="Dim updateInstallFilesName As String = RequestFi";
Debug.ShouldStop(67108864);
_updateinstallfilesname = parent.mostCurrent._requestfilenameonday;Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);Debug.locals.put("updateInstallFilesName", _updateinstallfilesname);
 BA.debugLineNum = 956;BA.debugLine="Dim deleteFileName As String = $\"${RequestFileNa";
Debug.ShouldStop(134217728);
_deletefilename = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._requestfilenameonday))),RemoteObject.createImmutable("-DELETE.sql")));Debug.locals.put("deleteFileName", _deletefilename);Debug.locals.put("deleteFileName", _deletefilename);
 BA.debugLineNum = 963;BA.debugLine="Dim SqlFilesTotal As Int = 0";
Debug.ShouldStop(4);
parent._sqlfilestotal = BA.numberCast(int.class, 0);
 BA.debugLineNum = 964;BA.debugLine="Dim trycount As Int = 0";
Debug.ShouldStop(8);
_trycount = BA.numberCast(int.class, 0);Debug.locals.put("trycount", _trycount);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 965;BA.debugLine="Dim dotry As Boolean = True";
Debug.ShouldStop(16);
_dotry = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("dotry", _dotry);Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 966;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(32);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 968;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(128);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 969;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(256);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 970;BA.debugLine="Dim ctm As CustomTrustManager";
Debug.ShouldStop(512);
_ctm = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager");Debug.locals.put("ctm", _ctm);
 BA.debugLineNum = 971;BA.debugLine="ctm.InitializeAcceptAll";
Debug.ShouldStop(1024);
_ctm.runVoidMethod ("InitializeAcceptAll");
 BA.debugLineNum = 972;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
Debug.ShouldStop(2048);
_globalftp.runVoidMethod ("SetCustomSSLTrustManager",(Object)((_ctm.getObject())));
 BA.debugLineNum = 973;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(4096);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 974;BA.debugLine="Do While (dotry And (trycount <3))";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//do while
this.state = 56;
while ((RemoteObject.solveBoolean(".",_dotry) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",_trycount,BA.numberCast(double.class, 3))))))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 976;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
Debug.ShouldStop(32768);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_update_install_info)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_install_info));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 977;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _sf);
this.state = 133;
return;
case 133:
//C
this.state = 7;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 979;BA.debugLine="If Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 7:
//if
this.state = 55;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 54;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 980;BA.debugLine="Log(UPDATE_INSTALL_INFO & \" file was download";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620851",RemoteObject.concat(_update_install_info,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 986;BA.debugLine="Try";
Debug.ShouldStop(33554432);
if (true) break;

case 10:
//try
this.state = 52;
this.catchState = 51;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 51;
 BA.debugLineNum = 987;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
Debug.ShouldStop(67108864);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*RemoteObject*/ ));
 BA.debugLineNum = 989;BA.debugLine="If ShareCode.newReturn = 1 Then";
Debug.ShouldStop(268435456);
if (true) break;

case 13:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._sharecode._newreturn /*RemoteObject*/ ,BA.numberCast(double.class, 1))) { 
this.state = 15;
}else {
this.state = 48;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 990;BA.debugLine="Dim JsonStruct As String = File.readstring(S";
Debug.ShouldStop(536870912);
_jsonstruct = parent.mostCurrent.__c.getField(false,"File").runMethod(true,"ReadString",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_install_info));Debug.locals.put("JsonStruct", _jsonstruct);Debug.locals.put("JsonStruct", _jsonstruct);
 BA.debugLineNum = 992;BA.debugLine="Log(JsonStruct)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620863",_jsonstruct,0);
 BA.debugLineNum = 994;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(2);
_parser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 995;BA.debugLine="parser.Initialize(JsonStruct)";
Debug.ShouldStop(4);
_parser.runVoidMethod ("Initialize",(Object)(_jsonstruct));
 BA.debugLineNum = 996;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(8);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 997;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\"";
Debug.ShouldStop(16);
_datahora = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("datetime")))));Debug.locals.put("DataHora", _datahora);Debug.locals.put("DataHora", _datahora);
 BA.debugLineNum = 998;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
Debug.ShouldStop(32);
_totalfiles = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("files")))));Debug.locals.put("Totalfiles", _totalfiles);Debug.locals.put("Totalfiles", _totalfiles);
 BA.debugLineNum = 999;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
Debug.ShouldStop(64);
_inserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_inserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("inserts")))));Debug.locals.put("inserts", _inserts);
 BA.debugLineNum = 1004;BA.debugLine="Dim DeletesIsPresent As Boolean = False";
Debug.ShouldStop(2048);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);Debug.locals.put("DeletesIsPresent", _deletesispresent);
 BA.debugLineNum = 1005;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(4096);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_deletefilename)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deletefilename));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1006;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _sf);
this.state = 134;
return;
case 134:
//C
this.state = 16;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1008;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO DE D";
Debug.ShouldStop(32768);
if (true) break;

case 16:
//if
this.state = 27;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1009;BA.debugLine="Log(deleteFileName & \" file was download su";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620880",RemoteObject.concat(_deletefilename,RemoteObject.createImmutable(" file was download successfully")),0);
 BA.debugLineNum = 1011;BA.debugLine="If File.Exists(Starter.Provider.SharedFolde";
Debug.ShouldStop(262144);
if (true) break;

case 19:
//if
this.state = 24;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_deletefilename)).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 1012;BA.debugLine="DeletesIsPresent = True";
Debug.ShouldStop(524288);
_deletesispresent = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 1014;BA.debugLine="DeletesIsPresent = False";
Debug.ShouldStop(2097152);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1017;BA.debugLine="DeletesIsPresent = False";
Debug.ShouldStop(16777216);
_deletesispresent = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("DeletesIsPresent", _deletesispresent);
 if (true) break;
;
 BA.debugLineNum = 1030;BA.debugLine="If DeletesIsPresent Then";
Debug.ShouldStop(32);

case 27:
//if
this.state = 46;
if (_deletesispresent.<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 46;
 BA.debugLineNum = 1031;BA.debugLine="Dim resDel As ResumableSub = MakeDeleteSqlF";
Debug.ShouldStop(64);
_resdel = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_resdel = _makedeletesqlfile(_deletefilename);Debug.locals.put("resDel", _resdel);Debug.locals.put("resDel", _resdel);
 BA.debugLineNum = 1032;BA.debugLine="Wait For(resDel) Complete (finish As Boolea";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _resdel);
this.state = 135;
return;
case 135:
//C
this.state = 46;
_finish = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finish", _finish);
;
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1034;BA.debugLine="For Each colinserts As Map In inserts";
Debug.ShouldStop(512);
if (true) break;

case 32:
//for
this.state = 45;
_colinserts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group65 = _inserts;
index65 = 0;
groupLen65 = group65.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colinserts", _colinserts);
this.state = 136;
if (true) break;

case 136:
//C
this.state = 45;
if (index65 < groupLen65) {
this.state = 34;
_colinserts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group65.runMethod(false,"Get",index65));}
if (true) break;

case 137:
//C
this.state = 136;
index65++;
Debug.locals.put("colinserts", _colinserts);
if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 1035;BA.debugLine="Dim mastertagcode As String = colinserts.G";
Debug.ShouldStop(1024);
_mastertagcode = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mastertagcode")))));Debug.locals.put("mastertagcode", _mastertagcode);Debug.locals.put("mastertagcode", _mastertagcode);
 BA.debugLineNum = 1036;BA.debugLine="Try";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 1037;BA.debugLine="Dim childfield As String = colinserts.Get";
Debug.ShouldStop(4096);
_childfield = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("childfield")))));Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 Debug.CheckDeviceExceptions();
if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 51;
 BA.debugLineNum = 1039;BA.debugLine="Dim childfield As String = \"\"";
Debug.ShouldStop(16384);
_childfield = BA.ObjectToString("");Debug.locals.put("childfield", _childfield);Debug.locals.put("childfield", _childfield);
 BA.debugLineNum = 1040;BA.debugLine="Log(LastException)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620911",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 51;
;
 BA.debugLineNum = 1042;BA.debugLine="Dim tagcodelist As String = colinserts.Get";
Debug.ShouldStop(131072);
_tagcodelist = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcodelist")))));Debug.locals.put("tagcodelist", _tagcodelist);Debug.locals.put("tagcodelist", _tagcodelist);
 BA.debugLineNum = 1043;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\"";
Debug.ShouldStop(262144);
_newinfolist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_newinfolist = parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(parent.mostCurrent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\|")),(Object)(_tagcodelist))));Debug.locals.put("NewInfoList", _newinfolist);Debug.locals.put("NewInfoList", _newinfolist);
 BA.debugLineNum = 1044;BA.debugLine="Dim table As String = colinserts.Get(\"tabl";
Debug.ShouldStop(524288);
_table = BA.ObjectToString(_colinserts.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("table")))));Debug.locals.put("table", _table);Debug.locals.put("table", _table);
 BA.debugLineNum = 1046;BA.debugLine="For i=0 To NewInfoList.Size -1";
Debug.ShouldStop(2097152);
if (true) break;

case 41:
//for
this.state = 44;
step76 = 1;
limit76 = RemoteObject.solve(new RemoteObject[] {_newinfolist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 138;
if (true) break;

case 138:
//C
this.state = 44;
if ((step76 > 0 && _i <= limit76) || (step76 < 0 && _i >= limit76)) this.state = 43;
if (true) break;

case 139:
//C
this.state = 138;
_i = ((int)(0 + _i + step76)) ;
Debug.locals.put("i", _i);
if (true) break;

case 43:
//C
this.state = 139;
 BA.debugLineNum = 1047;BA.debugLine="Dim res As ResumableSub = DBStructures.Re";
Debug.ShouldStop(4194304);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = parent.mostCurrent._dbstructures.runMethod(false,"_removerecsfromtable" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_table),(Object)(_mastertagcode),(Object)(_childfield),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(_newinfolist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1048;BA.debugLine="Wait For(res) Complete (result As Boolean";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _res);
this.state = 140;
return;
case 140:
//C
this.state = 139;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("result", _result);
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 137;
Debug.locals.put("i", _i);
;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
Debug.locals.put("colinserts", _colinserts);
;
 if (true) break;

case 46:
//C
this.state = 49;
;
 BA.debugLineNum = 1054;BA.debugLine="SqlFilesTotal = Totalfiles";
Debug.ShouldStop(536870912);
parent._sqlfilestotal = _totalfiles;
 BA.debugLineNum = 1055;BA.debugLine="Dim date As String = DataHora";
Debug.ShouldStop(1073741824);
_date = _datahora;Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 1056;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1057;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(1);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1058;BA.debugLine="dotry = False";
Debug.ShouldStop(2);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 1059;BA.debugLine="trycount = 3";
Debug.ShouldStop(4);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 1060;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(8);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1064;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(128);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1065;BA.debugLine="List1 = File.ReadList(Starter.Provider.Share";
Debug.ShouldStop(256);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_update_install_info));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1066;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de fic";
Debug.ShouldStop(512);
parent._sqlfilestotal = BA.numberCast(int.class, _list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 1067;BA.debugLine="Dim date As String = List1.Get(1)";
Debug.ShouldStop(1024);
_date = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 1))));Debug.locals.put("date", _date);Debug.locals.put("date", _date);
 BA.debugLineNum = 1068;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
Debug.ShouldStop(2048);
parent.mostCurrent._utils.runVoidMethod ("_updateliteupdatedatetime" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1069;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
Debug.ShouldStop(4096);
parent.mostCurrent._dbstructures.runVoidMethod ("_updateworkerdblastupdate" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_date));
 BA.debugLineNum = 1070;BA.debugLine="dotry = False";
Debug.ShouldStop(8192);
_dotry = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("dotry", _dotry);
 BA.debugLineNum = 1071;BA.debugLine="trycount = 3";
Debug.ShouldStop(16384);
_trycount = BA.numberCast(int.class, 3);Debug.locals.put("trycount", _trycount);
 BA.debugLineNum = 1072;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(32768);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 49:
//C
this.state = 52;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
 BA.debugLineNum = 1075;BA.debugLine="Log(LastException)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620946",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1076;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(524288);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 55;
this.catchState = 0;
;
 if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 1079;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620950",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 1080;BA.debugLine="Log(\"Error downloading file \" & UPDATE_INSTALL";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620951",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_update_install_info),0);
 BA.debugLineNum = 1081;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o fich";
Debug.ShouldStop(16777216);
_insertalerterrors((RemoteObject.concat(RemoteObject.createImmutable("Erro ao Descarregar o ficheiro"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_update_install_info))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 1082;BA.debugLine="trycount = trycount + 1";
Debug.ShouldStop(33554432);
_trycount = RemoteObject.solve(new RemoteObject[] {_trycount,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("trycount", _trycount);
 if (true) break;

case 55:
//C
this.state = 4;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 1085;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(268435456);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 1089;BA.debugLine="If (SqlFilesTotal <= 0) Then";
Debug.ShouldStop(1);
if (true) break;

case 57:
//if
this.state = 60;
if ((RemoteObject.solveBoolean("k",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 1090;BA.debugLine="lbldataupdateprocess.TextColor = Colors.Red";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"));
 BA.debugLineNum = 1091;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgNaoExi";
Debug.ShouldStop(4);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgnaoexistemactualizacoes /*RemoteObject*/ ));
 if (true) break;
;
 BA.debugLineNum = 1100;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(2048);

case 60:
//if
this.state = 77;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 1101;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
Debug.ShouldStop(4096);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ));
 BA.debugLineNum = 1103;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(16384);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 1104;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
Debug.ShouldStop(32768);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 1105;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(65536);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1107;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(262144);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 1108;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(524288);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1110;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(2097152);
if (true) break;

case 63:
//for
this.state = 76;
step123 = 1;
limit123 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 141;
if (true) break;

case 141:
//C
this.state = 76;
if ((step123 > 0 && _i <= limit123) || (step123 < 0 && _i >= limit123)) this.state = 65;
if (true) break;

case 142:
//C
this.state = 141;
_i = ((int)(0 + _i + step123)) ;
Debug.locals.put("i", _i);
if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 1111;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(4194304);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1112;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
Debug.ShouldStop(8388608);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updateinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 1114;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 1115;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fi";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));
 if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 1120;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
Debug.ShouldStop(-2147483648);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/db/"),_filen)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 1121;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _sf);
this.state = 143;
return;
case 143:
//C
this.state = 70;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1123;BA.debugLine="If Success Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 1124;BA.debugLine="Log(fileN & \" file was download successfully\"";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620995",RemoteObject.concat(_filen,RemoteObject.createImmutable(" file was download successfully")),0);
 if (true) break;

case 74:
//C
this.state = 75;
 BA.debugLineNum = 1126;BA.debugLine="Log(\"Error downloading file \" & fileN)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660620997",RemoteObject.concat(RemoteObject.createImmutable("Error downloading file "),_filen),0);
 if (true) break;

case 75:
//C
this.state = 142;
;
 BA.debugLineNum = 1129;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(256);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 76:
//C
this.state = 77;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1132;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2048);
_globalftp.runVoidMethod ("Close");
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 1137;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(65536);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1138;BA.debugLine="Sleep(500)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"),BA.numberCast(int.class, 500));
this.state = 144;
return;
case 144:
//C
this.state = 78;
;
 BA.debugLineNum = 1144;BA.debugLine="If(SqlFilesTotal > 0) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 78:
//if
this.state = 115;
if ((RemoteObject.solveBoolean(">",parent._sqlfilestotal,BA.numberCast(double.class, 0)))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 1146;BA.debugLine="For i = 1 To SqlFilesTotal";
Debug.ShouldStop(33554432);
if (true) break;

case 81:
//for
this.state = 114;
step143 = 1;
limit143 = parent._sqlfilestotal.<Integer>get().intValue();
_i = 1 ;
Debug.locals.put("i", _i);
this.state = 145;
if (true) break;

case 145:
//C
this.state = 114;
if ((step143 > 0 && _i <= limit143) || (step143 < 0 && _i >= limit143)) this.state = 83;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step143)) ;
Debug.locals.put("i", _i);
if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 1147;BA.debugLine="TotalLinesOfScripts = 0";
Debug.ShouldStop(67108864);
_totallinesofscripts = BA.numberCast(int.class, 0);Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 BA.debugLineNum = 1148;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
Debug.ShouldStop(134217728);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent._sqlfilestotal))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1149;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
Debug.ShouldStop(268435456);
_filen = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_updateinstallfilesname))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_i)))),RemoteObject.createImmutable(".sql")));Debug.locals.put("fileN", _filen);Debug.locals.put("fileN", _filen);
 BA.debugLineNum = 1151;BA.debugLine="Dim List1 As List";
Debug.ShouldStop(1073741824);
_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1153;BA.debugLine="If (List1.IsInitialized) Then";
Debug.ShouldStop(1);
if (true) break;

case 84:
//if
this.state = 89;
if ((_list1.runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
this.state = 86;
}else {
this.state = 88;
}if (true) break;

case 86:
//C
this.state = 89;
 BA.debugLineNum = 1154;BA.debugLine="List1.Clear";
Debug.ShouldStop(2);
_list1.runVoidMethod ("Clear");
 if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 1156;BA.debugLine="List1.Initialize";
Debug.ShouldStop(8);
_list1.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 1159;BA.debugLine="Try";
Debug.ShouldStop(64);

case 89:
//try
this.state = 94;
this.catchState = 93;
this.state = 91;
if (true) break;

case 91:
//C
this.state = 94;
this.catchState = 93;
 BA.debugLineNum = 1160;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
Debug.ShouldStop(128);
_list1 = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(parent.mostCurrent._starter._provider /*RemoteObject*/ .getField(true,"_sharedfolder" /*RemoteObject*/ )),(Object)(_filen));Debug.locals.put("List1", _list1);
 BA.debugLineNum = 1161;BA.debugLine="TotalLinesOfScripts = List1.Size";
Debug.ShouldStop(256);
_totallinesofscripts = _list1.runMethod(true,"getSize");Debug.locals.put("TotalLinesOfScripts", _totallinesofscripts);
 Debug.CheckDeviceExceptions();
if (true) break;

case 93:
//C
this.state = 94;
this.catchState = 0;
 BA.debugLineNum = 1163;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660621034",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 94:
//C
this.state = 95;
this.catchState = 0;
;
 BA.debugLineNum = 1166;BA.debugLine="DUProgressBar2(0,0)";
Debug.ShouldStop(8192);
_duprogressbar2(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1167;BA.debugLine="DataUpdateProgressBar2.visible = True";
Debug.ShouldStop(16384);
parent.mostCurrent._dataupdateprogressbar2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1168;BA.debugLine="DataUpdateLabelTarefa.Visible = True";
Debug.ShouldStop(32768);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 1169;BA.debugLine="Dim AlreadyDeleted As Boolean = False";
Debug.ShouldStop(65536);
_alreadydeleted = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("AlreadyDeleted", _alreadydeleted);Debug.locals.put("AlreadyDeleted", _alreadydeleted);
 BA.debugLineNum = 1171;BA.debugLine="For n = 0 To List1.Size -1";
Debug.ShouldStop(262144);
if (true) break;

case 95:
//for
this.state = 113;
step163 = 1;
limit163 = RemoteObject.solve(new RemoteObject[] {_list1.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_n = 0 ;
Debug.locals.put("n", _n);
this.state = 147;
if (true) break;

case 147:
//C
this.state = 113;
if ((step163 > 0 && _n <= limit163) || (step163 < 0 && _n >= limit163)) this.state = 97;
if (true) break;

case 148:
//C
this.state = 147;
_n = ((int)(0 + _n + step163)) ;
Debug.locals.put("n", _n);
if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 1172;BA.debugLine="DataUpdateLabelTarefa.Text = ShareCode.MsgExe";
Debug.ShouldStop(524288);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(parent.mostCurrent._sharecode._msgexecprocact /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable((_n)))),RemoteObject.createImmutable("/"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_totallinesofscripts))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 1173;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
Debug.ShouldStop(1048576);
_script2execute = BA.ObjectToString(_list1.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _n))));Debug.locals.put("Script2Execute", _script2execute);Debug.locals.put("Script2Execute", _script2execute);
 BA.debugLineNum = 1178;BA.debugLine="If Script2Execute.Contains(\"INSERT INTO\") And";
Debug.ShouldStop(33554432);
if (true) break;

case 98:
//if
this.state = 112;
if (RemoteObject.solveBoolean(".",_script2execute.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("INSERT INTO")))) && RemoteObject.solveBoolean(".",_script2execute.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("dta_tablecontrol")))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_alreadydeleted)))) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 1180;BA.debugLine="Try";
Debug.ShouldStop(134217728);
if (true) break;

case 101:
//try
this.state = 106;
this.catchState = 105;
this.state = 103;
if (true) break;

case 103:
//C
this.state = 106;
this.catchState = 105;
 BA.debugLineNum = 1181;BA.debugLine="Dim Sql2Del As String = \"delete from dta_ta";
Debug.ShouldStop(268435456);
_sql2del = BA.ObjectToString("delete from dta_tablecontrol");Debug.locals.put("Sql2Del", _sql2del);Debug.locals.put("Sql2Del", _sql2del);
 BA.debugLineNum = 1182;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(Sql2Del)";
Debug.ShouldStop(536870912);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sql2del));
 BA.debugLineNum = 1183;BA.debugLine="Log(Sql2Del)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660621054",_sql2del,0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 105:
//C
this.state = 106;
this.catchState = 0;
 BA.debugLineNum = 1185;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660621056",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 1188;BA.debugLine="Try";
Debug.ShouldStop(8);

case 106:
//try
this.state = 111;
this.catchState = 0;
this.catchState = 110;
this.state = 108;
if (true) break;

case 108:
//C
this.state = 111;
this.catchState = 110;
 BA.debugLineNum = 1189;BA.debugLine="Dim Sql2Del As String = \"delete from dta_ta";
Debug.ShouldStop(16);
_sql2del = BA.ObjectToString("delete from dta_tablecontrol_items");Debug.locals.put("Sql2Del", _sql2del);Debug.locals.put("Sql2Del", _sql2del);
 BA.debugLineNum = 1190;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(Sql2Del)";
Debug.ShouldStop(32);
parent.mostCurrent._starter._localsqlevc /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_sql2del));
 BA.debugLineNum = 1191;BA.debugLine="Log(Sql2Del)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660621062",_sql2del,0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 110:
//C
this.state = 111;
this.catchState = 0;
 BA.debugLineNum = 1193;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","660621064",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 111:
//C
this.state = 112;
this.catchState = 0;
;
 BA.debugLineNum = 1195;BA.debugLine="AlreadyDeleted = True";
Debug.ShouldStop(1024);
_alreadydeleted = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("AlreadyDeleted", _alreadydeleted);
 if (true) break;

case 112:
//C
this.state = 148;
;
 BA.debugLineNum = 1198;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
Debug.ShouldStop(8192);
parent.mostCurrent._utils.runVoidMethod ("_savesqltolog" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Main")),(Object)(_script2execute),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1199;BA.debugLine="DUProgressBar2(TotalLinesOfScripts,n)";
Debug.ShouldStop(16384);
_duprogressbar2(_totallinesofscripts,BA.numberCast(int.class, _n));
 BA.debugLineNum = 1200;BA.debugLine="Sleep(1)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"),BA.numberCast(int.class, 1));
this.state = 149;
return;
case 149:
//C
this.state = 148;
;
 if (true) break;
if (true) break;

case 113:
//C
this.state = 146;
Debug.locals.put("n", _n);
;
 BA.debugLineNum = 1205;BA.debugLine="DataUpdateProgressBar2.visible = False";
Debug.ShouldStop(1048576);
parent.mostCurrent._dataupdateprogressbar2.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1206;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
Debug.ShouldStop(2097152);
parent.mostCurrent._dataupdatelabeltarefa.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1207;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(4194304);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 BA.debugLineNum = 1208;BA.debugLine="Sleep(1)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"),BA.numberCast(int.class, 1));
this.state = 150;
return;
case 150:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 114:
//C
this.state = 115;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1215;BA.debugLine="Dim res As ResumableSub = SendServerProcessComp";
Debug.ShouldStop(1073741824);
_res = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_res = _sendserverprocesscomplete(parent.mostCurrent.__c.getField(true,"False"),parent.mostCurrent._requestfilenameonday,dataupdate.getObject());Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 1216;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "runupdateonday"), _res);
this.state = 151;
return;
case 151:
//C
this.state = 115;
_completed = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Completed", _completed);
;
 if (true) break;

case 115:
//C
this.state = 124;
;
 if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 1219;BA.debugLine="MsgboxAsync(ShareCode.MsgErroProc60last7new,Shar";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgerroproc60last7new /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*RemoteObject*/ )),dataupdate.processBA);
 BA.debugLineNum = 1220;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1";
Debug.ShouldStop(8);
if (true) break;

case 118:
//if
this.state = 123;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._progressbar1.runMethod(true,"getVisible"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 120;
;}if (true) break;

case 120:
//C
this.state = 123;
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
if (true) break;

case 123:
//C
this.state = 124;
;
 BA.debugLineNum = 1221;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 124:
//C
this.state = 125;
;
 BA.debugLineNum = 1224;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDataUpda";
Debug.ShouldStop(128);
parent.mostCurrent._lbldataupdateprocess.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*RemoteObject*/ ));
 BA.debugLineNum = 1225;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1.";
Debug.ShouldStop(256);
if (true) break;

case 125:
//if
this.state = 130;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._progressbar1.runMethod(true,"getVisible"),parent.mostCurrent.__c.getField(true,"True"))) { 
this.state = 127;
;}if (true) break;

case 127:
//C
this.state = 130;
parent.mostCurrent._progressbar1.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"False"));
if (true) break;

case 130:
//C
this.state = -1;
;
 BA.debugLineNum = 1227;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Share";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._sess_oper_user /*RemoteObject*/ ))),RemoteObject.createImmutable("_upd.log")))),(Object)(parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimeext" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA)));
 BA.debugLineNum = 1228;BA.debugLine="StartService(BackgroundUpdateService)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("StartService",dataupdate.processBA,(Object)((parent.mostCurrent._backgroundupdateservice.getObject())));
 BA.debugLineNum = 1229;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(4096);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1230;BA.debugLine="Return True";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1231;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _sendlogs2ftp() throws Exception{
try {
		Debug.PushSubsStack("SendLogs2Ftp (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,230);
if (RapidSub.canDelegate("sendlogs2ftp")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","sendlogs2ftp");}
ResumableSub_SendLogs2Ftp rsub = new ResumableSub_SendLogs2Ftp(null);
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
public static class ResumableSub_SendLogs2Ftp extends BA.ResumableSub {
public ResumableSub_SendLogs2Ftp(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _dtf = RemoteObject.createImmutable("");
RemoteObject _date2name = RemoteObject.createImmutable("");
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _listafiles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _command = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _replycode = RemoteObject.createImmutable(0);
RemoteObject _replystring = RemoteObject.createImmutable("");
int _f = 0;
RemoteObject _file2check = RemoteObject.createImmutable("");
RemoteObject _serverpath = RemoteObject.createImmutable("");
int step14;
int limit14;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendLogs2Ftp (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,230);
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
 BA.debugLineNum = 232;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(128);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 233;BA.debugLine="Dim dtf As String = DateTime.DateFormat";
Debug.ShouldStop(256);
_dtf = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("dtf", _dtf);Debug.locals.put("dtf", _dtf);
 BA.debugLineNum = 234;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
Debug.ShouldStop(512);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyyMMdd"));
 BA.debugLineNum = 235;BA.debugLine="Dim date2name As String = DateTime.Date(DateTime.";
Debug.ShouldStop(1024);
_date2name = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("date2name", _date2name);Debug.locals.put("date2name", _date2name);
 BA.debugLineNum = 236;BA.debugLine="DateTime.DateFormat = dtf";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dtf);
 BA.debugLineNum = 237;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(4096);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 238;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(8192);
_myftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 239;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(16384);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 240;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(32768);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 241;BA.debugLine="Dim ListaFiles As List = File.ListFiles(Starter.S";
Debug.ShouldStop(65536);
_listafiles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listafiles = parent.mostCurrent.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ));Debug.locals.put("ListaFiles", _listafiles);Debug.locals.put("ListaFiles", _listafiles);
 BA.debugLineNum = 242;BA.debugLine="Try";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//try
this.state = 20;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
 BA.debugLineNum = 243;BA.debugLine="Dim sf As Object = myFTP.SendCommand(\"MKD\",$\"${S";
Debug.ShouldStop(262144);
_sf = _myftp.runMethod(false,"SendCommand",dataupdate.processBA,(Object)(BA.ObjectToString("MKD")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("/errorlogs")))));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 244;BA.debugLine="Wait For (sf) myFTP_CommandCompleted (Command As";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","myftp_commandcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "sendlogs2ftp"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_command = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Command", _command);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_replycode = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(2));Debug.locals.put("ReplyCode", _replycode);
_replystring = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(3));Debug.locals.put("ReplyString", _replystring);
;
 BA.debugLineNum = 246;BA.debugLine="For f=0 To ListaFiles.Size -1";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//for
this.state = 17;
step14 = 1;
limit14 = RemoteObject.solve(new RemoteObject[] {_listafiles.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_f = 0 ;
Debug.locals.put("f", _f);
this.state = 22;
if (true) break;

case 22:
//C
this.state = 17;
if ((step14 > 0 && _f <= limit14) || (step14 < 0 && _f >= limit14)) this.state = 6;
if (true) break;

case 23:
//C
this.state = 22;
_f = ((int)(0 + _f + step14)) ;
Debug.locals.put("f", _f);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 247;BA.debugLine="Dim File2check As String = ListaFiles.Get(f)";
Debug.ShouldStop(4194304);
_file2check = BA.ObjectToString(_listafiles.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _f))));Debug.locals.put("File2check", _file2check);Debug.locals.put("File2check", _file2check);
 BA.debugLineNum = 248;BA.debugLine="If File2check.Contains(\"-ErrorsLog.txt\") And No";
Debug.ShouldStop(8388608);
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean(".",_file2check.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("-ErrorsLog.txt")))) && RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_file2check.runMethod(true,"contains",(Object)(_date2name)))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 249;BA.debugLine="Log(File2check)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659441171",_file2check,0);
 BA.debugLineNum = 250;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sh";
Debug.ShouldStop(33554432);
_sf = _myftp.runMethod(false,"UploadFile",dataupdate.processBA,(Object)(parent.mostCurrent._starter._sharedfolder /*RemoteObject*/ ),(Object)(_file2check),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/"),_file2check)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 251;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "sendlogs2ftp"), _sf);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 253;BA.debugLine="If Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 10:
//if
this.state = 15;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 254;BA.debugLine="Log(\"file was uploaded successfully\")";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659441176",RemoteObject.createImmutable("file was uploaded successfully"),0);
 BA.debugLineNum = 255;BA.debugLine="ret = True";
Debug.ShouldStop(1073741824);
_ret = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 257;BA.debugLine="Log(\"Error uploading file\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659441179",RemoteObject.createImmutable("Error uploading file"),0);
 BA.debugLineNum = 258;BA.debugLine="ret = False";
Debug.ShouldStop(2);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 23;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("f", _f);
;
 BA.debugLineNum = 262;BA.debugLine="ret = True";
Debug.ShouldStop(32);
_ret = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 263;BA.debugLine="myFTP.Close";
Debug.ShouldStop(64);
_myftp.runVoidMethod ("Close");
 Debug.CheckDeviceExceptions();
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
 BA.debugLineNum = 265;BA.debugLine="ret = False";
Debug.ShouldStop(256);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);
 BA.debugLineNum = 266;BA.debugLine="Log(LastException)";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659441188",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 269;BA.debugLine="Sleep(250)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "sendlogs2ftp"),BA.numberCast(int.class, 250));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 270;BA.debugLine="Return ret";
Debug.ShouldStop(8192);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ret));return;};
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static void  _myftp_commandcompleted(RemoteObject _command,RemoteObject _success,RemoteObject _replycode,RemoteObject _replystring) throws Exception{
}
public static void  _ftp_uploadcompleted(RemoteObject _serverpath,RemoteObject _success) throws Exception{
}
public static RemoteObject  _sendserverprocesscomplete(RemoteObject _debug,RemoteObject _filename,RemoteObject _jobobject) throws Exception{
try {
		Debug.PushSubsStack("SendServerProcessComplete (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3610);
if (RapidSub.canDelegate("sendserverprocesscomplete")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","sendserverprocesscomplete", _debug, _filename, _jobobject);}
ResumableSub_SendServerProcessComplete rsub = new ResumableSub_SendServerProcessComplete(null,_debug,_filename,_jobobject);
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
public ResumableSub_SendServerProcessComplete(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _debug,RemoteObject _filename,RemoteObject _jobobject) {
this.parent = parent;
this._debug = _debug;
this._filename = _filename;
this._jobobject = _jobobject;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _debug;
RemoteObject _filename;
RemoteObject _jobobject;
RemoteObject _serveraddress = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _params = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _data = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SendServerProcessComplete (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3610);
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
Debug.locals.put("jobObject", _jobobject);
 BA.debugLineNum = 3611;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
Debug.ShouldStop(67108864);
_serveraddress = (RemoteObject.concat(RemoteObject.createImmutable("https://"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("/api/orion/generate/removeFilesSqlite")));Debug.locals.put("ServerAddress", _serveraddress);Debug.locals.put("ServerAddress", _serveraddress);
 BA.debugLineNum = 3612;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(134217728);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 3613;BA.debugLine="Job.Initialize(\"\",jobObject)";
Debug.ShouldStop(268435456);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(_jobobject));
 BA.debugLineNum = 3614;BA.debugLine="Dim params As Map";
Debug.ShouldStop(536870912);
_params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("params", _params);
 BA.debugLineNum = 3615;BA.debugLine="params.Initialize";
Debug.ShouldStop(1073741824);
_params.runVoidMethod ("Initialize");
 BA.debugLineNum = 3616;BA.debugLine="params.Clear";
Debug.ShouldStop(-2147483648);
_params.runVoidMethod ("Clear");
 BA.debugLineNum = 3617;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
Debug.ShouldStop(1);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("authorization"))),(Object)((parent.mostCurrent._sharecode._app_authorization /*RemoteObject*/ )));
 BA.debugLineNum = 3618;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
Debug.ShouldStop(2);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_token"))),(Object)((parent.mostCurrent._sharecode._app_token /*RemoteObject*/ )));
 BA.debugLineNum = 3619;BA.debugLine="params.Put(\"debug\", Utils.Bool2Int(debug))";
Debug.ShouldStop(4);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("debug"))),(Object)((parent.mostCurrent._utils.runMethod(true,"_bool2int" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_debug)))));
 BA.debugLineNum = 3620;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
Debug.ShouldStop(8);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_user"))),(Object)((parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ )));
 BA.debugLineNum = 3621;BA.debugLine="params.Put(\"name\", filename)";
Debug.ShouldStop(16);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_filename)));
 BA.debugLineNum = 3622;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
Debug.ShouldStop(32);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("versionTagcode"))),(Object)((parent.mostCurrent._main._versiontagcode /*RemoteObject*/ )));
 BA.debugLineNum = 3623;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
Debug.ShouldStop(64);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_authorization"))),(Object)((parent.mostCurrent._main._deviceauthorization /*RemoteObject*/ )));
 BA.debugLineNum = 3624;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
Debug.ShouldStop(128);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_instance"))),(Object)((parent.mostCurrent._main._deviceinstance /*RemoteObject*/ )));
 BA.debugLineNum = 3625;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
Debug.ShouldStop(256);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceBrand"))),(Object)((parent.mostCurrent._main._devicebrand /*RemoteObject*/ )));
 BA.debugLineNum = 3626;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
Debug.ShouldStop(512);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceModel"))),(Object)((parent.mostCurrent._main._devicemodel /*RemoteObject*/ )));
 BA.debugLineNum = 3627;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
Debug.ShouldStop(1024);
_params.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("_deviceMacAddress"))),(Object)((parent.mostCurrent._main._devicemacaddress /*RemoteObject*/ )));
 BA.debugLineNum = 3628;BA.debugLine="Dim JSON As JSONGenerator";
Debug.ShouldStop(2048);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 3629;BA.debugLine="JSON.Initialize(params)";
Debug.ShouldStop(4096);
_json.runVoidMethod ("Initialize",(Object)(_params));
 BA.debugLineNum = 3631;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
Debug.ShouldStop(16384);
_data = _json.runMethod(true,"ToPrettyString",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("data", _data);Debug.locals.put("data", _data);
 BA.debugLineNum = 3633;BA.debugLine="Job.PostString(ServerAddress, data)";
Debug.ShouldStop(65536);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_serveraddress),(Object)(_data));
 BA.debugLineNum = 3634;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(131072);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 3636;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "sendserverprocesscomplete"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 3637;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 3638;BA.debugLine="Job.Release";
Debug.ShouldStop(2097152);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 3639;BA.debugLine="Return True";
Debug.ShouldStop(4194304);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3641;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
Debug.ShouldStop(16777216);
parent.mostCurrent._utils.runVoidMethod ("_logerror" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToString("Download")),(Object)(parent.mostCurrent._sharecode._sess_user /*RemoteObject*/ ),(Object)(_job.getField(true,"_errormessage" /*RemoteObject*/ )));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 3643;BA.debugLine="Job.Release";
Debug.ShouldStop(67108864);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 3644;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 BA.debugLineNum = 3645;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _setupdateftprecord(RemoteObject _inrec,RemoteObject _withimg,RemoteObject _def,RemoteObject _tc_filter) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateFTPRecord (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,389);
if (RapidSub.canDelegate("setupdateftprecord")) { xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","setupdateftprecord", _inrec, _withimg, _def, _tc_filter); return;}
ResumableSub_SetUpdateFTPRecord rsub = new ResumableSub_SetUpdateFTPRecord(null,_inrec,_withimg,_def,_tc_filter);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SetUpdateFTPRecord extends BA.ResumableSub {
public ResumableSub_SetUpdateFTPRecord(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _inrec,RemoteObject _withimg,RemoteObject _def,RemoteObject _tc_filter) {
this.parent = parent;
this._inrec = _inrec;
this._withimg = _withimg;
this._def = _def;
this._tc_filter = _tc_filter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _inrec;
RemoteObject _withimg;
RemoteObject _def;
RemoteObject _tc_filter;
RemoteObject _up_type = RemoteObject.createImmutable(0);
RemoteObject _up_date = RemoteObject.createImmutable("");
RemoteObject _up_values = RemoteObject.createImmutable("");
RemoteObject _up_tableurl = RemoteObject.createImmutable("");
RemoteObject _rr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _upd = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateFTPRecord (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,389);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("inRec", _inrec);
Debug.locals.put("withImg", _withimg);
Debug.locals.put("def", _def);
Debug.locals.put("TC_Filter", _tc_filter);
 BA.debugLineNum = 390;BA.debugLine="If withImg Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (_withimg.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 391;BA.debugLine="Dim up_type As Int = Utils.IfNullOrEmpty(inRec.G";
Debug.ShouldStop(64);
_up_type = BA.numberCast(int.class, parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.NumberToString(_inrec.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("up_type"))))),(Object)(BA.NumberToString(_def))));Debug.locals.put("up_type", _up_type);Debug.locals.put("up_type", _up_type);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 393;BA.debugLine="Dim up_date As String = Utils.IfNullOrEmpty(inRec";
Debug.ShouldStop(256);
_up_date = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_date")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_date", _up_date);Debug.locals.put("up_date", _up_date);
 BA.debugLineNum = 394;BA.debugLine="Dim up_values As String = Utils.IfNullOrEmpty(inR";
Debug.ShouldStop(512);
_up_values = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_values")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_values", _up_values);Debug.locals.put("up_values", _up_values);
 BA.debugLineNum = 395;BA.debugLine="Dim up_tableurl As String = Utils.IfNullOrEmpty(i";
Debug.ShouldStop(1024);
_up_tableurl = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tableurl")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_tableurl", _up_tableurl);Debug.locals.put("up_tableurl", _up_tableurl);
 BA.debugLineNum = 396;BA.debugLine="If Utils.NNE(up_tableurl) And Utils.NNE(up_values";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 24;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_up_tableurl))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_up_values)))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 397;BA.debugLine="Dim rr As ResumableSub = UtilAPIUploadFile(up_ta";
Debug.ShouldStop(4096);
_rr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rr = _utilapiuploadfile(_up_tableurl,_up_values);Debug.locals.put("rr", _rr);Debug.locals.put("rr", _rr);
 BA.debugLineNum = 398;BA.debugLine="Wait For(rr) complete (finished As Boolean)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "setupdateftprecord"), _rr);
this.state = 25;
return;
case 25:
//C
this.state = 8;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 399;BA.debugLine="If (finished = True) Then";
Debug.ShouldStop(16384);
if (true) break;

case 8:
//if
this.state = 23;
if ((RemoteObject.solveBoolean("=",_finished,parent.mostCurrent.__c.getField(true,"True")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 400;BA.debugLine="Try";
Debug.ShouldStop(32768);
if (true) break;

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
 BA.debugLineNum = 401;BA.debugLine="If withImg Then";
Debug.ShouldStop(65536);
if (true) break;

case 14:
//if
this.state = 19;
if (_withimg.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 402;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
Debug.ShouldStop(131072);
_upd = (RemoteObject.concat(RemoteObject.createImmutable("update loc_updatesrever set up_state= 1 where up_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_date))),RemoteObject.createImmutable("' and up_type="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_type))),RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc_filter))),RemoteObject.createImmutable("")));Debug.locals.put("upd", _upd);Debug.locals.put("upd", _upd);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 404;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
Debug.ShouldStop(524288);
_upd = (RemoteObject.concat(RemoteObject.createImmutable("update loc_updatesrever set up_state= 1 where up_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_date))),RemoteObject.createImmutable("' "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc_filter))),RemoteObject.createImmutable("")));Debug.locals.put("upd", _upd);Debug.locals.put("upd", _upd);
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 406;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(upd)";
Debug.ShouldStop(2097152);
parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_upd));
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 408;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659834387",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
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
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _setupdatehttpemailrecord(RemoteObject _inrec,RemoteObject _tc_filter) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateHTTPEmailRecord (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,361);
if (RapidSub.canDelegate("setupdatehttpemailrecord")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","setupdatehttpemailrecord", _inrec, _tc_filter);}
ResumableSub_SetUpdateHTTPEmailRecord rsub = new ResumableSub_SetUpdateHTTPEmailRecord(null,_inrec,_tc_filter);
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
public static class ResumableSub_SetUpdateHTTPEmailRecord extends BA.ResumableSub {
public ResumableSub_SetUpdateHTTPEmailRecord(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _inrec,RemoteObject _tc_filter) {
this.parent = parent;
this._inrec = _inrec;
this._tc_filter = _tc_filter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _inrec;
RemoteObject _tc_filter;
RemoteObject _up_date = RemoteObject.createImmutable("");
RemoteObject _up_values = RemoteObject.createImmutable("");
RemoteObject _up_tableurl = RemoteObject.createImmutable("");
RemoteObject _rr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _upd = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateHTTPEmailRecord (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,361);
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
Debug.locals.put("inRec", _inrec);
Debug.locals.put("TC_Filter", _tc_filter);
 BA.debugLineNum = 363;BA.debugLine="Dim up_date As String = Utils.IfNullOrEmpty(inRec";
Debug.ShouldStop(1024);
_up_date = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_date")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_date", _up_date);Debug.locals.put("up_date", _up_date);
 BA.debugLineNum = 364;BA.debugLine="Dim up_values As String = Utils.IfNullOrEmpty(inR";
Debug.ShouldStop(2048);
_up_values = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_values")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_values", _up_values);Debug.locals.put("up_values", _up_values);
 BA.debugLineNum = 365;BA.debugLine="Dim up_tableurl As String = Utils.IfNullOrEmpty(i";
Debug.ShouldStop(4096);
_up_tableurl = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tableurl")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_tableurl", _up_tableurl);Debug.locals.put("up_tableurl", _up_tableurl);
 BA.debugLineNum = 366;BA.debugLine="If Utils.NNE(up_tableurl) And Utils.NNE(up_values";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 15;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_up_tableurl))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_up_values)))) { 
this.state = 3;
}else {
this.state = 14;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 367;BA.debugLine="Dim rr As ResumableSub = UtilAPIUpdate(up_values";
Debug.ShouldStop(16384);
_rr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rr = _utilapiupdate(_up_values,dataupdate.getObject(),_up_tableurl);Debug.locals.put("rr", _rr);Debug.locals.put("rr", _rr);
 BA.debugLineNum = 368;BA.debugLine="Wait For(rr) complete (finished As Boolean)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "setupdatehttpemailrecord"), _rr);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 369;BA.debugLine="If (finished = False) Then";
Debug.ShouldStop(65536);
if (true) break;

case 4:
//if
this.state = 7;
if ((RemoteObject.solveBoolean("=",_finished,parent.mostCurrent.__c.getField(true,"False")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 371;BA.debugLine="InsertAlertSistema (1,\"\")";
Debug.ShouldStop(262144);
_insertalertsistema(BA.numberCast(int.class, 1),RemoteObject.createImmutable(""));
 BA.debugLineNum = 372;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 375;BA.debugLine="Try";
Debug.ShouldStop(4194304);

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
 BA.debugLineNum = 376;BA.debugLine="Dim upd As String = $\"update loc_updateemails s";
Debug.ShouldStop(8388608);
_upd = (RemoteObject.concat(RemoteObject.createImmutable("update loc_updateemails set up_state= 1 where up_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_date))),RemoteObject.createImmutable("' "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc_filter))),RemoteObject.createImmutable("")));Debug.locals.put("upd", _upd);Debug.locals.put("upd", _upd);
 BA.debugLineNum = 377;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(upd)";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_upd));
 BA.debugLineNum = 378;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 380;BA.debugLine="Log(LastException)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659768851",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 381;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 0;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 384;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 15:
//C
this.state = -1;
;
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _setupdatehttprecord(RemoteObject _inrec,RemoteObject _withimg,RemoteObject _def,RemoteObject _tc_filter) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateHTTPRecord (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,325);
if (RapidSub.canDelegate("setupdatehttprecord")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","setupdatehttprecord", _inrec, _withimg, _def, _tc_filter);}
ResumableSub_SetUpdateHTTPRecord rsub = new ResumableSub_SetUpdateHTTPRecord(null,_inrec,_withimg,_def,_tc_filter);
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
public static class ResumableSub_SetUpdateHTTPRecord extends BA.ResumableSub {
public ResumableSub_SetUpdateHTTPRecord(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _inrec,RemoteObject _withimg,RemoteObject _def,RemoteObject _tc_filter) {
this.parent = parent;
this._inrec = _inrec;
this._withimg = _withimg;
this._def = _def;
this._tc_filter = _tc_filter;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _inrec;
RemoteObject _withimg;
RemoteObject _def;
RemoteObject _tc_filter;
RemoteObject _up_type = RemoteObject.createImmutable(0);
RemoteObject _up_date = RemoteObject.createImmutable("");
RemoteObject _up_values = RemoteObject.createImmutable("");
RemoteObject _up_tableurl = RemoteObject.createImmutable("");
RemoteObject _rr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _upd = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SetUpdateHTTPRecord (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,325);
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
Debug.locals.put("inRec", _inrec);
Debug.locals.put("withImg", _withimg);
Debug.locals.put("def", _def);
Debug.locals.put("TC_Filter", _tc_filter);
 BA.debugLineNum = 326;BA.debugLine="If withImg Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 4;
if (_withimg.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 327;BA.debugLine="Dim up_type As Int = Utils.IfNullOrEmpty(inRec.G";
Debug.ShouldStop(64);
_up_type = BA.numberCast(int.class, parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(BA.NumberToString(_inrec.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("up_type"))))),(Object)(BA.NumberToString(_def))));Debug.locals.put("up_type", _up_type);Debug.locals.put("up_type", _up_type);
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 329;BA.debugLine="Dim up_date As String = Utils.IfNullOrEmpty(inRec";
Debug.ShouldStop(256);
_up_date = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_date")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_date", _up_date);Debug.locals.put("up_date", _up_date);
 BA.debugLineNum = 330;BA.debugLine="Dim up_values As String = Utils.IfNullOrEmpty(inR";
Debug.ShouldStop(512);
_up_values = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_values")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_values", _up_values);Debug.locals.put("up_values", _up_values);
 BA.debugLineNum = 331;BA.debugLine="Dim up_tableurl As String = Utils.IfNullOrEmpty(i";
Debug.ShouldStop(1024);
_up_tableurl = parent.mostCurrent._utils.runMethod(true,"_ifnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_inrec.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tableurl")))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("up_tableurl", _up_tableurl);Debug.locals.put("up_tableurl", _up_tableurl);
 BA.debugLineNum = 332;BA.debugLine="If Utils.NNE(up_tableurl) And Utils.NNE(up_values";
Debug.ShouldStop(2048);
if (true) break;

case 5:
//if
this.state = 25;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_up_tableurl))) && RemoteObject.solveBoolean(".",parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_up_values)))) { 
this.state = 7;
}else {
this.state = 24;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 333;BA.debugLine="Dim rr As ResumableSub = UtilAPIUpdate(up_values";
Debug.ShouldStop(4096);
_rr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rr = _utilapiupdate(_up_values,dataupdate.getObject(),_up_tableurl);Debug.locals.put("rr", _rr);Debug.locals.put("rr", _rr);
 BA.debugLineNum = 334;BA.debugLine="Wait For(rr) complete (finished As Boolean)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "setupdatehttprecord"), _rr);
this.state = 26;
return;
case 26:
//C
this.state = 8;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 336;BA.debugLine="If (finished = False) Then";
Debug.ShouldStop(32768);
if (true) break;

case 8:
//if
this.state = 11;
if ((RemoteObject.solveBoolean("=",_finished,parent.mostCurrent.__c.getField(true,"False")))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 338;BA.debugLine="InsertAlertSistema (1,\"\")";
Debug.ShouldStop(131072);
_insertalertsistema(BA.numberCast(int.class, 1),RemoteObject.createImmutable(""));
 BA.debugLineNum = 339;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 342;BA.debugLine="Try";
Debug.ShouldStop(2097152);

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
 BA.debugLineNum = 343;BA.debugLine="If withImg Then";
Debug.ShouldStop(4194304);
if (true) break;

case 14:
//if
this.state = 19;
if (_withimg.<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 344;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
Debug.ShouldStop(8388608);
_upd = (RemoteObject.concat(RemoteObject.createImmutable("update loc_updatesrever set up_state= 1 where up_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_date))),RemoteObject.createImmutable("' and up_type="),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_type))),RemoteObject.createImmutable(" "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc_filter))),RemoteObject.createImmutable("")));Debug.locals.put("upd", _upd);Debug.locals.put("upd", _upd);
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 346;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
Debug.ShouldStop(33554432);
_upd = (RemoteObject.concat(RemoteObject.createImmutable("update loc_updatesrever set up_state= 1 where up_date='"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_up_date))),RemoteObject.createImmutable("' "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc_filter))),RemoteObject.createImmutable("")));Debug.locals.put("upd", _upd);Debug.locals.put("upd", _upd);
 if (true) break;

case 19:
//C
this.state = 22;
;
 BA.debugLineNum = 349;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(upd)";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runVoidMethod ("ExecNonQuery",(Object)(_upd));
 BA.debugLineNum = 350;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
Debug.CheckDeviceExceptions();if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 352;BA.debugLine="Log(LastException)";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659703323",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 353;BA.debugLine="Return False";
Debug.ShouldStop(1);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
this.catchState = 0;
;
 if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 356;BA.debugLine="Return True";
Debug.ShouldStop(8);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _setupdownarrows(RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetUpDownArrows (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,313);
if (RapidSub.canDelegate("setupdownarrows")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","setupdownarrows", _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 313;BA.debugLine="Sub SetUpDownArrows(Mode As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 315;BA.debugLine="If Mode.ToUpperCase =\"DOWNLOAD\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_mode.runMethod(true,"toUpperCase"),BA.ObjectToString("DOWNLOAD"))) { 
 BA.debugLineNum = 316;BA.debugLine="ImageDownload.Visible = True";
Debug.ShouldStop(134217728);
dataupdate.mostCurrent._imagedownload.runMethod(true,"setVisible",dataupdate.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 317;BA.debugLine="ImageUpload.Visible = False";
Debug.ShouldStop(268435456);
dataupdate.mostCurrent._imageupload.runMethod(true,"setVisible",dataupdate.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 319;BA.debugLine="ImageUpload.Visible = True";
Debug.ShouldStop(1073741824);
dataupdate.mostCurrent._imageupload.runMethod(true,"setVisible",dataupdate.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 320;BA.debugLine="ImageDownload.Visible = False";
Debug.ShouldStop(-2147483648);
dataupdate.mostCurrent._imagedownload.runMethod(true,"setVisible",dataupdate.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttheactivity(RemoteObject _islogin) throws Exception{
try {
		Debug.PushSubsStack("StartTheActivity (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,81);
if (RapidSub.canDelegate("starttheactivity")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","starttheactivity", _islogin);}
Debug.locals.put("IsLogin", _islogin);
 BA.debugLineNum = 81;BA.debugLine="Sub StartTheActivity(IsLogin As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _starttheactivityliteupdate(RemoteObject _tagcodeslist) throws Exception{
try {
		Debug.PushSubsStack("StartTheActivityLiteUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3391);
if (RapidSub.canDelegate("starttheactivityliteupdate")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","starttheactivityliteupdate", _tagcodeslist);}
Debug.locals.put("tagCodesList", _tagcodeslist);
 BA.debugLineNum = 3391;BA.debugLine="Sub StartTheActivityLiteUpdate(tagCodesList As Str";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 3392;BA.debugLine="IsLoginUpdate = True";
Debug.ShouldStop(-2147483648);
dataupdate._isloginupdate = dataupdate.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 3393;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 3394;BA.debugLine="RunLiteUpdate(tagCodesList)";
Debug.ShouldStop(2);
_runliteupdate(_tagcodeslist);
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e5) {
			BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e5.toString()); BA.debugLineNum = 3396;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
dataupdate.mostCurrent.__c.runVoidMethod ("LogImpl","661865989",BA.ObjectToString(dataupdate.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3397;BA.debugLine="ButtonWelcomeNext_Click";
Debug.ShouldStop(16);
_buttonwelcomenext_click();
 };
 BA.debugLineNum = 3402;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatedata2server() throws Exception{
try {
		Debug.PushSubsStack("UpdateData2Server (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3647);
if (RapidSub.canDelegate("updatedata2server")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","updatedata2server");}
ResumableSub_UpdateData2Server rsub = new ResumableSub_UpdateData2Server(null);
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
public static class ResumableSub_UpdateData2Server extends BA.ResumableSub {
public ResumableSub_UpdateData2Server(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _withfiles = RemoteObject.createImmutable(false);
RemoteObject _reccounter = RemoteObject.createImmutable(0);
RemoteObject _resposta = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _ssqlemails = RemoteObject.createImmutable("");
RemoteObject _recordlocalemaildatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _emailcheck = RemoteObject.createImmutable(false);
RemoteObject _ut0 = RemoteObject.createImmutable(0);
RemoteObject _ut1 = RemoteObject.createImmutable(0);
RemoteObject _r1 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _finished = RemoteObject.createImmutable(false);
RemoteObject _r2 = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _recordlocaldatatoupdate2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _appldialog = RemoteObject.declareNull("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _pnl = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _reclocaloffline = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
RemoteObject _requesttc = RemoteObject.createImmutable("");
RemoteObject _res = RemoteObject.createImmutable(0);
int _p = 0;
RemoteObject _chk = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _tc = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _currtc = RemoteObject.createImmutable("");
RemoteObject _tcf = RemoteObject.createImmutable("");
int step93;
int limit93;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateData2Server (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3647);
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
 BA.debugLineNum = 3649;BA.debugLine="If lbldataupdatetitle.Visible Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._lbldataupdatetitle.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3650;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgSendDataS";
Debug.ShouldStop(2);
parent.mostCurrent._lbldataupdatetitle.runMethod(true,"setText",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgsenddataserver /*RemoteObject*/ ));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3653;BA.debugLine="ProgressDialogShow2(ShareCode.checklistenviardado";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistenviardados2bo /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3654;BA.debugLine="Starter.RunUpdate = True";
Debug.ShouldStop(32);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 3655;BA.debugLine="Log(\"**************************************\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324744",RemoteObject.createImmutable("**************************************"),0);
 BA.debugLineNum = 3656;BA.debugLine="Log(\" SENDING LOCAL DATA TO SERVER \")";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324745",RemoteObject.createImmutable(" SENDING LOCAL DATA TO SERVER "),0);
 BA.debugLineNum = 3657;BA.debugLine="Log(\"**************************************\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324746",RemoteObject.createImmutable("**************************************"),0);
 BA.debugLineNum = 3659;BA.debugLine="Dim WITHFILES As Boolean = True";
Debug.ShouldStop(1024);
_withfiles = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("WITHFILES", _withfiles);Debug.locals.put("WITHFILES", _withfiles);
 BA.debugLineNum = 3660;BA.debugLine="Dim RecCounter As Int = LocalDataToUpdate";
Debug.ShouldStop(2048);
_reccounter = _localdatatoupdate();Debug.locals.put("RecCounter", _reccounter);Debug.locals.put("RecCounter", _reccounter);
 BA.debugLineNum = 3661;BA.debugLine="Dim Resposta As Int = 0";
Debug.ShouldStop(4096);
_resposta = BA.numberCast(int.class, 0);Debug.locals.put("Resposta", _resposta);Debug.locals.put("Resposta", _resposta);
 BA.debugLineNum = 3663;BA.debugLine="If RecCounter > 0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 5:
//if
this.state = 148;
if (RemoteObject.solveBoolean(">",_reccounter,BA.numberCast(double.class, 0))) { 
this.state = 7;
}else {
this.state = 147;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3665;BA.debugLine="Msgbox2Async($\"Existe informação OFFLINE por env";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("Existe informação OFFLINE por enviar ao Servidor."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("NOTA : Uma grande quantidade de dados por enviar pode causar erros de transmissão em redes com pouco sinal."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent.__c.getField(true,"CRLF")))),RemoteObject.createImmutable("Por favor seleccione uma das seguintes opções."))))),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*RemoteObject*/ )),(Object)(BA.ObjectToString("ENVIAR TUDO")),(Object)(BA.ObjectToString("ENVIAR MAIS TARDE")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.mostCurrent.__c.getField(false,"Null")),dataupdate.processBA,(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3666;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","msgbox_result", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), null);
this.state = 149;
return;
case 149:
//C
this.state = 8;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 3667;BA.debugLine="If Result = DialogResponse.POSITIVE Then ' ENVIA";
Debug.ShouldStop(262144);
if (true) break;

case 8:
//if
this.state = 145;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 10;
}else 
{ BA.debugLineNum = 3740;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then '";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"NEGATIVE")))) { 
this.state = 63;
}else {
this.state = 144;
}}
if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3669;BA.debugLine="Try";
Debug.ShouldStop(1048576);
if (true) break;

case 11:
//try
this.state = 16;
this.catchState = 15;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 16;
this.catchState = 15;
 BA.debugLineNum = 3670;BA.debugLine="Dim sSQL As String = $\"select distinct up_date";
Debug.ShouldStop(2097152);
_ssql = (RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3671;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Sta";
Debug.ShouldStop(4194304);
_recordlocaldatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate", _recordlocaldatatoupdate);
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 3673;BA.debugLine="Log(LastException)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324762",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3674;BA.debugLine="Dim sSQL As String = $\"select distinct up_date";
Debug.ShouldStop(33554432);
_ssql = (RemoteObject.createImmutable("select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3675;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Sta";
Debug.ShouldStop(67108864);
_recordlocaldatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate", _recordlocaldatatoupdate);
 BA.debugLineNum = 3676;BA.debugLine="WITHFILES = False";
Debug.ShouldStop(134217728);
_withfiles = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("WITHFILES", _withfiles);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3679;BA.debugLine="Try";
Debug.ShouldStop(1073741824);

case 16:
//try
this.state = 21;
this.catchState = 0;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
 BA.debugLineNum = 3680;BA.debugLine="Dim sSQLEmails As String = $\"select distinct u";
Debug.ShouldStop(-2147483648);
_ssqlemails = (RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0"));Debug.locals.put("sSQLEmails", _ssqlemails);Debug.locals.put("sSQLEmails", _ssqlemails);
 BA.debugLineNum = 3681;BA.debugLine="Dim RecordLocalEmailDataToUpdate As ResultSet";
Debug.ShouldStop(1);
_recordlocalemaildatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocalemaildatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssqlemails)));Debug.locals.put("RecordLocalEmailDataToUpdate", _recordlocalemaildatatoupdate);
 BA.debugLineNum = 3682;BA.debugLine="Dim EmailCheck As Boolean = True";
Debug.ShouldStop(2);
_emailcheck = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("EmailCheck", _emailcheck);Debug.locals.put("EmailCheck", _emailcheck);
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
 BA.debugLineNum = 3684;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324773",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3685;BA.debugLine="Dim EmailCheck As Boolean = False";
Debug.ShouldStop(16);
_emailcheck = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("EmailCheck", _emailcheck);Debug.locals.put("EmailCheck", _emailcheck);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
 BA.debugLineNum = 3688;BA.debugLine="Dim ut0 As Int = RecordLocalDataToUpdate.RowCou";
Debug.ShouldStop(128);
_ut0 = _recordlocaldatatoupdate.runMethod(true,"getRowCount");Debug.locals.put("ut0", _ut0);Debug.locals.put("ut0", _ut0);
 BA.debugLineNum = 3689;BA.debugLine="Dim ut1 As Int = RecCounter - ut0";
Debug.ShouldStop(256);
_ut1 = RemoteObject.solve(new RemoteObject[] {_reccounter,_ut0}, "-",1, 1);Debug.locals.put("ut1", _ut1);Debug.locals.put("ut1", _ut1);
 BA.debugLineNum = 3692;BA.debugLine="If(RecordLocalDataToUpdate.RowCount >= 1) Then";
Debug.ShouldStop(2048);
if (true) break;

case 22:
//if
this.state = 43;
if ((RemoteObject.solveBoolean("g",_recordlocaldatatoupdate.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 3695;BA.debugLine="Do While RecordLocalDataToUpdate.NextRow";
Debug.ShouldStop(16384);
if (true) break;

case 25:
//do while
this.state = 42;
while (_recordlocaldatatoupdate.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 27;
if (true) break;
}
if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 3697;BA.debugLine="Try";
Debug.ShouldStop(65536);
if (true) break;

case 28:
//try
this.state = 41;
this.catchState = 40;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 40;
 BA.debugLineNum = 3699;BA.debugLine="Dim r1 As ResumableSub = SetUpdateHTTPRecord";
Debug.ShouldStop(262144);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r1 = _setupdatehttprecord(_recordlocaldatatoupdate,_withfiles,BA.numberCast(int.class, 0),RemoteObject.createImmutable(""));Debug.locals.put("r1", _r1);Debug.locals.put("r1", _r1);
 BA.debugLineNum = 3700;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), _r1);
this.state = 150;
return;
case 150:
//C
this.state = 31;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 3703;BA.debugLine="If EmailCheck Then";
Debug.ShouldStop(4194304);
if (true) break;

case 31:
//if
this.state = 38;
if (_emailcheck.<Boolean>get().booleanValue()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 3704;BA.debugLine="If RecordLocalEmailDataToUpdate.RowCount >";
Debug.ShouldStop(8388608);
if (true) break;

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean(">",_recordlocalemaildatatoupdate.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 3705;BA.debugLine="Dim r2 As ResumableSub = SetUpdateHTTPEmai";
Debug.ShouldStop(16777216);
_r2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r2 = _setupdatehttpemailrecord(_recordlocalemaildatatoupdate,RemoteObject.createImmutable(""));Debug.locals.put("r2", _r2);Debug.locals.put("r2", _r2);
 BA.debugLineNum = 3706;BA.debugLine="Wait For(r2) complete (finished As Boolean";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), _r2);
this.state = 151;
return;
case 151:
//C
this.state = 37;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 41;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
 BA.debugLineNum = 3711;BA.debugLine="Log(LastException)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324800",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 25;
this.catchState = 0;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 44;
;
 BA.debugLineNum = 3715;BA.debugLine="RecordLocalDataToUpdate.Close";
Debug.ShouldStop(4);
_recordlocaldatatoupdate.runVoidMethod ("Close");
 BA.debugLineNum = 3716;BA.debugLine="Sleep(250)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"),BA.numberCast(int.class, 250));
this.state = 152;
return;
case 152:
//C
this.state = 44;
;
 BA.debugLineNum = 3719;BA.debugLine="If (ut1 >= 1) And (WITHFILES) Then";
Debug.ShouldStop(64);
if (true) break;

case 44:
//if
this.state = 61;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_ut1,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",(_withfiles))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
 BA.debugLineNum = 3720;BA.debugLine="Dim sSQL As String = $\"select distinct up_date";
Debug.ShouldStop(128);
_ssql = (RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3721;BA.debugLine="Dim RecordLocalDataToUpdate2 As ResultSet = St";
Debug.ShouldStop(256);
_recordlocaldatatoupdate2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate2", _recordlocaldatatoupdate2);
 BA.debugLineNum = 3723;BA.debugLine="If RecordLocalDataToUpdate2.RowCount > 0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 47:
//if
this.state = 60;
if (RemoteObject.solveBoolean(">",_recordlocaldatatoupdate2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 3724;BA.debugLine="Do While RecordLocalDataToUpdate2.NextRow";
Debug.ShouldStop(2048);
if (true) break;

case 50:
//do while
this.state = 59;
while (_recordlocaldatatoupdate2.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 52;
if (true) break;
}
if (true) break;

case 52:
//C
this.state = 53;
 BA.debugLineNum = 3726;BA.debugLine="Try";
Debug.ShouldStop(8192);
if (true) break;

case 53:
//try
this.state = 58;
this.catchState = 57;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 58;
this.catchState = 57;
 BA.debugLineNum = 3727;BA.debugLine="SetUpdateFTPRecord(RecordLocalDataToUpdate2";
Debug.ShouldStop(16384);
_setupdateftprecord(_recordlocaldatatoupdate2,_withfiles,BA.numberCast(int.class, 1),RemoteObject.createImmutable(""));
 Debug.CheckDeviceExceptions();
if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
 BA.debugLineNum = 3729;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324818",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 58:
//C
this.state = 50;
this.catchState = 0;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 3733;BA.debugLine="RecordLocalDataToUpdate2.Close";
Debug.ShouldStop(1048576);
_recordlocaldatatoupdate2.runVoidMethod ("Close");
 if (true) break;

case 61:
//C
this.state = 145;
;
 BA.debugLineNum = 3736;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3737;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3738;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 3741;BA.debugLine="Dim appldialog As CustomLayoutDialog";
Debug.ShouldStop(268435456);
_appldialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog");Debug.locals.put("appldialog", _appldialog);
 BA.debugLineNum = 3742;BA.debugLine="Dim sf As Object = appldialog.ShowAsync(\"Interv";
Debug.ShouldStop(536870912);
_sf = _appldialog.runMethod(false,"ShowAsync",(Object)(BA.ObjectToString("Intervenções por enviar ao Servidor")),(Object)(BA.ObjectToString("Enviar Selecção")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),dataupdate.mostCurrent.activityBA,(Object)((parent.mostCurrent.__c.getField(false,"Null"))),(Object)(parent.mostCurrent.__c.getField(true,"False")));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3744;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Co";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._utils.runVoidMethod ("_setdialogcolors" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_sf),(Object)(parent.mostCurrent._consts._colorwhite /*RemoteObject*/ ),(Object)(parent.mostCurrent._consts._colorgray /*RemoteObject*/ ),(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(int.class, 5)));
 BA.debugLineNum = 3745;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
Debug.ShouldStop(1);
if (true) break;

case 64:
//if
this.state = 69;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._sharecode._isphone /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 66;
}else {
this.state = 68;
}if (true) break;

case 66:
//C
this.state = 69;
 BA.debugLineNum = 3746;BA.debugLine="appldialog.SetSize(60%x, 60%y)";
Debug.ShouldStop(2);
_appldialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),dataupdate.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),dataupdate.mostCurrent.activityBA)));
 if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 3748;BA.debugLine="appldialog.SetSize(60%x, 40%y)";
Debug.ShouldStop(8);
_appldialog.runVoidMethod ("SetSize",(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),dataupdate.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),dataupdate.mostCurrent.activityBA)));
 if (true) break;

case 69:
//C
this.state = 70;
;
 BA.debugLineNum = 3750;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_ready", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), _sf);
this.state = 153;
return;
case 153:
//C
this.state = 70;
_pnl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("pnl", _pnl);
;
 BA.debugLineNum = 3751;BA.debugLine="pnl.LoadLayout(\"dialogoOfflineReqs\")";
Debug.ShouldStop(64);
_pnl.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("dialogoOfflineReqs")),dataupdate.mostCurrent.activityBA);
 BA.debugLineNum = 3753;BA.debugLine="ListaIntervencoesOffline.Clear";
Debug.ShouldStop(256);
parent.mostCurrent._listaintervencoesoffline.runVoidMethod ("_clear");
 BA.debugLineNum = 3755;BA.debugLine="Dim sSQL As String = $\"select distinct up_tagco";
Debug.ShouldStop(1024);
_ssql = (RemoteObject.createImmutable("select distinct up_tagcode from loc_updatesrever where up_state=0"));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3756;BA.debugLine="Dim RecLocalOffline As ResultSet = Starter.Loca";
Debug.ShouldStop(2048);
_reclocaloffline = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_reclocaloffline = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecLocalOffline", _reclocaloffline);
 BA.debugLineNum = 3757;BA.debugLine="Do While RecLocalOffline.NextRow";
Debug.ShouldStop(4096);
if (true) break;

case 70:
//do while
this.state = 77;
while (_reclocaloffline.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 72;
if (true) break;
}
if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 3758;BA.debugLine="Dim RequestTC As String = RecLocalOffline.GetS";
Debug.ShouldStop(8192);
_requesttc = _reclocaloffline.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tagcode"))).runMethod(true,"trim");Debug.locals.put("RequestTC", _requesttc);Debug.locals.put("RequestTC", _requesttc);
 BA.debugLineNum = 3759;BA.debugLine="If Utils.NNE(RequestTC) Then";
Debug.ShouldStop(16384);
if (true) break;

case 73:
//if
this.state = 76;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_requesttc)).<Boolean>get().booleanValue()) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 3760;BA.debugLine="ListaIntervencoesOffline.Add(createListaOffli";
Debug.ShouldStop(32768);
parent.mostCurrent._listaintervencoesoffline.runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _createlistaofflinereq(_requesttc,parent.mostCurrent.__c.getField(true,"True"),parent.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))).getObject()),(Object)((_requesttc)));
 if (true) break;

case 76:
//C
this.state = 70;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 3765;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","dialog_result", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), _sf);
this.state = 154;
return;
case 154:
//C
this.state = 78;
_res = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("Res", _res);
;
 BA.debugLineNum = 3767;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4194304);
if (true) break;

case 78:
//if
this.state = 142;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 80;
}else {
this.state = 141;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 3769;BA.debugLine="ProgressDialogShow2(ShareCode.checklistenviard";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogShow2",dataupdate.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistenviardados2bo /*RemoteObject*/ )),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 3770;BA.debugLine="For p=0 To ListaIntervencoesOffline.Size -1";
Debug.ShouldStop(33554432);
if (true) break;

case 81:
//for
this.state = 139;
step93 = 1;
limit93 = RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._listaintervencoesoffline.runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_p = 0 ;
Debug.locals.put("p", _p);
this.state = 155;
if (true) break;

case 155:
//C
this.state = 139;
if ((step93 > 0 && _p <= limit93) || (step93 < 0 && _p >= limit93)) this.state = 83;
if (true) break;

case 156:
//C
this.state = 155;
_p = ((int)(0 + _p + step93)) ;
Debug.locals.put("p", _p);
if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 3771;BA.debugLine="Dim pnl As Panel = ListaIntervencoesOffline.G";
Debug.ShouldStop(67108864);
_pnl = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
_pnl = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), parent.mostCurrent._listaintervencoesoffline.runMethod(false,"_getpanel",(Object)(BA.numberCast(int.class, _p))).getObject());Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 3772;BA.debugLine="Dim Chk As CheckBox = pnl.GetView(0)";
Debug.ShouldStop(134217728);
_chk = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_chk = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).getObject());Debug.locals.put("Chk", _chk);
 BA.debugLineNum = 3773;BA.debugLine="Dim TC As EditText = pnl.GetView(1)";
Debug.ShouldStop(268435456);
_tc = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_tc = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.EditTextWrapper"), _pnl.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).getObject());Debug.locals.put("TC", _tc);
 BA.debugLineNum = 3774;BA.debugLine="If Chk.Checked Then";
Debug.ShouldStop(536870912);
if (true) break;

case 84:
//if
this.state = 138;
if (_chk.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 3776;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 3777;BA.debugLine="Dim sSQL As String = $\"select distinct up_d";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1\n"),RemoteObject.createImmutable("													and up_state=0\n"),RemoteObject.createImmutable("													and up_type=0\n"),RemoteObject.createImmutable("													and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc.runMethod(true,"getText")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3781;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet =";
Debug.ShouldStop(16);
_recordlocaldatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate", _recordlocaldatatoupdate);
 BA.debugLineNum = 3782;BA.debugLine="WITHFILES = False";
Debug.ShouldStop(32);
_withfiles = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("WITHFILES", _withfiles);
 Debug.CheckDeviceExceptions();
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
 BA.debugLineNum = 3784;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324873",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3785;BA.debugLine="Dim sSQL As String = $\"select distinct up_d";
Debug.ShouldStop(256);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1\n"),RemoteObject.createImmutable("													and up_state=0\n"),RemoteObject.createImmutable("													and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc.runMethod(true,"getText")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3788;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet =";
Debug.ShouldStop(2048);
_recordlocaldatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate", _recordlocaldatatoupdate);
 BA.debugLineNum = 3789;BA.debugLine="WITHFILES = False";
Debug.ShouldStop(4096);
_withfiles = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("WITHFILES", _withfiles);
 if (true) break;
if (true) break;
;
 BA.debugLineNum = 3792;BA.debugLine="Try";
Debug.ShouldStop(32768);

case 92:
//try
this.state = 97;
this.catchState = 0;
this.catchState = 96;
this.state = 94;
if (true) break;

case 94:
//C
this.state = 97;
this.catchState = 96;
 BA.debugLineNum = 3793;BA.debugLine="Dim sSQLEmails As String = $\"select distinc";
Debug.ShouldStop(65536);
_ssqlemails = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where 1=1\n"),RemoteObject.createImmutable("															and up_state=0\n"),RemoteObject.createImmutable("															and up_type=0\n"),RemoteObject.createImmutable("															and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc.runMethod(true,"getText")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQLEmails", _ssqlemails);Debug.locals.put("sSQLEmails", _ssqlemails);
 BA.debugLineNum = 3797;BA.debugLine="Dim RecordLocalEmailDataToUpdate As ResultS";
Debug.ShouldStop(1048576);
_recordlocalemaildatatoupdate = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocalemaildatatoupdate = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssqlemails)));Debug.locals.put("RecordLocalEmailDataToUpdate", _recordlocalemaildatatoupdate);
 BA.debugLineNum = 3798;BA.debugLine="Dim EmailCheck As Boolean = True";
Debug.ShouldStop(2097152);
_emailcheck = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("EmailCheck", _emailcheck);Debug.locals.put("EmailCheck", _emailcheck);
 Debug.CheckDeviceExceptions();
if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 0;
 BA.debugLineNum = 3800;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324889",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 BA.debugLineNum = 3801;BA.debugLine="Dim EmailCheck As Boolean = False";
Debug.ShouldStop(16777216);
_emailcheck = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("EmailCheck", _emailcheck);Debug.locals.put("EmailCheck", _emailcheck);
 if (true) break;
if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 0;
;
 BA.debugLineNum = 3804;BA.debugLine="Dim ut0 As Int = RecordLocalDataToUpdate.Row";
Debug.ShouldStop(134217728);
_ut0 = _recordlocaldatatoupdate.runMethod(true,"getRowCount");Debug.locals.put("ut0", _ut0);Debug.locals.put("ut0", _ut0);
 BA.debugLineNum = 3805;BA.debugLine="Dim ut1 As Int = RecCounter - ut0";
Debug.ShouldStop(268435456);
_ut1 = RemoteObject.solve(new RemoteObject[] {_reccounter,_ut0}, "-",1, 1);Debug.locals.put("ut1", _ut1);Debug.locals.put("ut1", _ut1);
 BA.debugLineNum = 3807;BA.debugLine="If(RecordLocalDataToUpdate.RowCount >= 1) Th";
Debug.ShouldStop(1073741824);
if (true) break;

case 98:
//if
this.state = 137;
if ((RemoteObject.solveBoolean("g",_recordlocaldatatoupdate.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 3810;BA.debugLine="Do While RecordLocalDataToUpdate.NextRow";
Debug.ShouldStop(2);
if (true) break;

case 101:
//do while
this.state = 118;
while (_recordlocaldatatoupdate.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 103;
if (true) break;
}
if (true) break;

case 103:
//C
this.state = 104;
 BA.debugLineNum = 3812;BA.debugLine="Try";
Debug.ShouldStop(8);
if (true) break;

case 104:
//try
this.state = 117;
this.catchState = 116;
this.state = 106;
if (true) break;

case 106:
//C
this.state = 107;
this.catchState = 116;
 BA.debugLineNum = 3814;BA.debugLine="Dim CurrTC As String = RecordLocalDataToU";
Debug.ShouldStop(32);
_currtc = _recordlocaldatatoupdate.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tagcode")));Debug.locals.put("CurrTC", _currtc);Debug.locals.put("CurrTC", _currtc);
 BA.debugLineNum = 3815;BA.debugLine="Dim TCF As String =$\"and up_tagcode = '${";
Debug.ShouldStop(64);
_tcf = (RemoteObject.concat(RemoteObject.createImmutable("and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currtc))),RemoteObject.createImmutable("'")));Debug.locals.put("TCF", _tcf);Debug.locals.put("TCF", _tcf);
 BA.debugLineNum = 3816;BA.debugLine="Dim r1 As ResumableSub = SetUpdateHTTPRec";
Debug.ShouldStop(128);
_r1 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r1 = _setupdatehttprecord(_recordlocaldatatoupdate,_withfiles,BA.numberCast(int.class, 0),_tcf);Debug.locals.put("r1", _r1);Debug.locals.put("r1", _r1);
 BA.debugLineNum = 3817;BA.debugLine="Wait For(r1) complete (finished As Boolea";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), _r1);
this.state = 157;
return;
case 157:
//C
this.state = 107;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 BA.debugLineNum = 3820;BA.debugLine="If EmailCheck Then";
Debug.ShouldStop(2048);
if (true) break;

case 107:
//if
this.state = 114;
if (_emailcheck.<Boolean>get().booleanValue()) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
 BA.debugLineNum = 3821;BA.debugLine="If RecordLocalEmailDataToUpdate.RowCount";
Debug.ShouldStop(4096);
if (true) break;

case 110:
//if
this.state = 113;
if (RemoteObject.solveBoolean(">",_recordlocalemaildatatoupdate.runMethod(true,"getRowCount"),BA.numberCast(double.class, 0))) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
 BA.debugLineNum = 3822;BA.debugLine="Dim CurrTC As String = RecordLocalEmail";
Debug.ShouldStop(8192);
_currtc = _recordlocalemaildatatoupdate.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tagcode")));Debug.locals.put("CurrTC", _currtc);Debug.locals.put("CurrTC", _currtc);
 BA.debugLineNum = 3823;BA.debugLine="Dim TCF As String =$\"and up_tagcode = '";
Debug.ShouldStop(16384);
_tcf = (RemoteObject.concat(RemoteObject.createImmutable("and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currtc))),RemoteObject.createImmutable("'")));Debug.locals.put("TCF", _tcf);Debug.locals.put("TCF", _tcf);
 BA.debugLineNum = 3824;BA.debugLine="Dim r2 As ResumableSub = SetUpdateHTTPE";
Debug.ShouldStop(32768);
_r2 = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_r2 = _setupdatehttpemailrecord(_recordlocalemaildatatoupdate,_tcf);Debug.locals.put("r2", _r2);Debug.locals.put("r2", _r2);
 BA.debugLineNum = 3825;BA.debugLine="Wait For(r2) complete (finished As Bool";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","complete", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"), _r2);
this.state = 158;
return;
case 158:
//C
this.state = 113;
_finished = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("finished", _finished);
;
 if (true) break;

case 113:
//C
this.state = 114;
;
 if (true) break;

case 114:
//C
this.state = 117;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 116:
//C
this.state = 117;
this.catchState = 0;
 BA.debugLineNum = 3830;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324919",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 117:
//C
this.state = 101;
this.catchState = 0;
;
 if (true) break;

case 118:
//C
this.state = 119;
;
 BA.debugLineNum = 3834;BA.debugLine="RecordLocalDataToUpdate.Close";
Debug.ShouldStop(33554432);
_recordlocaldatatoupdate.runVoidMethod ("Close");
 BA.debugLineNum = 3835;BA.debugLine="Sleep(250)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatedata2server"),BA.numberCast(int.class, 250));
this.state = 159;
return;
case 159:
//C
this.state = 119;
;
 BA.debugLineNum = 3838;BA.debugLine="If (ut1 >= 1) And (WITHFILES) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 119:
//if
this.state = 136;
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_ut1,BA.numberCast(double.class, 1))))) && RemoteObject.solveBoolean(".",(_withfiles))) { 
this.state = 121;
}if (true) break;

case 121:
//C
this.state = 122;
 BA.debugLineNum = 3839;BA.debugLine="Dim sSQL As String = $\"select distinct up_";
Debug.ShouldStop(1073741824);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1\n"),RemoteObject.createImmutable("														and up_state=0\n"),RemoteObject.createImmutable("														and up_type=1\n"),RemoteObject.createImmutable("														and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tc.runMethod(true,"getText")))),RemoteObject.createImmutable("'")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 3843;BA.debugLine="Dim RecordLocalDataToUpdate2 As ResultSet";
Debug.ShouldStop(4);
_recordlocaldatatoupdate2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
_recordlocaldatatoupdate2 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.sql.SQL.ResultSetWrapper"), parent.mostCurrent._starter._localsqlwrk /*RemoteObject*/ .runMethod(false,"ExecQuery",(Object)(_ssql)));Debug.locals.put("RecordLocalDataToUpdate2", _recordlocaldatatoupdate2);
 BA.debugLineNum = 3845;BA.debugLine="If(RecordLocalDataToUpdate2.RowCount >= 1)";
Debug.ShouldStop(16);
if (true) break;

case 122:
//if
this.state = 135;
if ((RemoteObject.solveBoolean("g",_recordlocaldatatoupdate2.runMethod(true,"getRowCount"),BA.numberCast(double.class, 1)))) { 
this.state = 124;
}if (true) break;

case 124:
//C
this.state = 125;
 BA.debugLineNum = 3846;BA.debugLine="Do While RecordLocalDataToUpdate2.NextRow";
Debug.ShouldStop(32);
if (true) break;

case 125:
//do while
this.state = 134;
while (_recordlocaldatatoupdate2.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 127;
if (true) break;
}
if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 3848;BA.debugLine="Try";
Debug.ShouldStop(128);
if (true) break;

case 128:
//try
this.state = 133;
this.catchState = 132;
this.state = 130;
if (true) break;

case 130:
//C
this.state = 133;
this.catchState = 132;
 BA.debugLineNum = 3849;BA.debugLine="Dim CurrTC As String = RecordLocalDataT";
Debug.ShouldStop(256);
_currtc = _recordlocaldatatoupdate2.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("up_tagcode")));Debug.locals.put("CurrTC", _currtc);Debug.locals.put("CurrTC", _currtc);
 BA.debugLineNum = 3850;BA.debugLine="Dim TCF As String =$\"and up_tagcode = '";
Debug.ShouldStop(512);
_tcf = (RemoteObject.concat(RemoteObject.createImmutable("and up_tagcode = '"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_currtc))),RemoteObject.createImmutable("'")));Debug.locals.put("TCF", _tcf);Debug.locals.put("TCF", _tcf);
 BA.debugLineNum = 3851;BA.debugLine="SetUpdateFTPRecord(RecordLocalDataToUpd";
Debug.ShouldStop(1024);
_setupdateftprecord(_recordlocaldatatoupdate2,_withfiles,BA.numberCast(int.class, 1),_tcf);
 Debug.CheckDeviceExceptions();
if (true) break;

case 132:
//C
this.state = 133;
this.catchState = 0;
 BA.debugLineNum = 3853;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","662324942",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 133:
//C
this.state = 125;
this.catchState = 0;
;
 if (true) break;

case 134:
//C
this.state = 135;
;
 if (true) break;

case 135:
//C
this.state = 136;
;
 BA.debugLineNum = 3857;BA.debugLine="RecordLocalDataToUpdate2.Close";
Debug.ShouldStop(65536);
_recordlocaldatatoupdate2.runVoidMethod ("Close");
 if (true) break;

case 136:
//C
this.state = 137;
;
 if (true) break;

case 137:
//C
this.state = 138;
;
 if (true) break;

case 138:
//C
this.state = 156;
;
 if (true) break;
if (true) break;

case 139:
//C
this.state = 142;
Debug.locals.put("p", _p);
;
 BA.debugLineNum = 3864;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3865;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(16777216);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3866;BA.debugLine="Return True";
Debug.ShouldStop(33554432);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 141:
//C
this.state = 142;
 BA.debugLineNum = 3868;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3869;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(268435456);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3870;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 142:
//C
this.state = 145;
;
 if (true) break;

case 144:
//C
this.state = 145;
 BA.debugLineNum = 3875;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3876;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(8);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3877;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 145:
//C
this.state = 148;
;
 if (true) break;

case 147:
//C
this.state = 148;
 BA.debugLineNum = 3880;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 3881;BA.debugLine="Starter.RunUpdate = False";
Debug.ShouldStop(256);
parent.mostCurrent._starter._runupdate /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 3882;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 148:
//C
this.state = -1;
;
 BA.debugLineNum = 3885;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static void  _dialog_ready(RemoteObject _pnl) throws Exception{
}
public static void  _dialog_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _updatefileswithftp(RemoteObject _datacontrol,RemoteObject _dlg) throws Exception{
try {
		Debug.PushSubsStack("UpdateFilesWithFTP (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3033);
if (RapidSub.canDelegate("updatefileswithftp")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","updatefileswithftp", _datacontrol, _dlg);}
ResumableSub_UpdateFilesWithFTP rsub = new ResumableSub_UpdateFilesWithFTP(null,_datacontrol,_dlg);
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
public static class ResumableSub_UpdateFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UpdateFilesWithFTP(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _datacontrol,RemoteObject _dlg) {
this.parent = parent;
this._datacontrol = _datacontrol;
this._dlg = _dlg;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _datacontrol;
RemoteObject _dlg;
RemoteObject _datacontrolparse = RemoteObject.createImmutable(0L);
RemoteObject _flist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _flisthtml = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _globalftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
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
RemoteObject _sf1 = RemoteObject.declareNull("Object");
RemoteObject _fname2 = RemoteObject.createImmutable("");
int step29;
int limit29;
int step61;
int limit61;
int step71;
int limit71;
int step93;
int limit93;
int step106;
int limit106;
int step148;
int limit148;
int step168;
int limit168;
int step178;
int limit178;
int step202;
int limit202;
int step215;
int limit215;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UpdateFilesWithFTP (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,3033);
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
Debug.locals.put("datacontrol", _datacontrol);
Debug.locals.put("dlg", _dlg);
 BA.debugLineNum = 3035;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(67108864);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3037;BA.debugLine="If (Not(Starter.FirstInstall)) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 225;
if ((parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent._starter._firstinstall /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 224;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 3038;BA.debugLine="If (Utils.isNullOrEmpty(datacontrol)) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils.runMethod(true,"_isnullorempty" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_datacontrol))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3039;BA.debugLine="datacontrol = Utils.GetCurrDatetimeFixed 'Utils";
Debug.ShouldStop(1073741824);
_datacontrol = parent.mostCurrent._utils.runMethod(true,"_getcurrdatetimefixed" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA);Debug.locals.put("datacontrol", _datacontrol);
 if (true) break;
;
 BA.debugLineNum = 3042;BA.debugLine="Try";
Debug.ShouldStop(2);

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
 BA.debugLineNum = 3043;BA.debugLine="Dim datacontrolParse As Long = DateTime.DatePar";
Debug.ShouldStop(4);
_datacontrolparse = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_datacontrol));Debug.locals.put("datacontrolParse", _datacontrolparse);Debug.locals.put("datacontrolParse", _datacontrolparse);
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 3045;BA.debugLine="Dim datacontrolParse As Long = DateTime.Now   '";
Debug.ShouldStop(16);
_datacontrolparse = parent.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("datacontrolParse", _datacontrolparse);Debug.locals.put("datacontrolParse", _datacontrolparse);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 3052;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800467",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 3053;BA.debugLine="Log($\" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${Sh";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800468",(RemoteObject.concat(RemoteObject.createImmutable(" 		DOWNLOAD : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 3054;BA.debugLine="Log( $\"${ShareCode.APP_FTP_USER}@${ShareCode.APP";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800469",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3055;BA.debugLine="Log(\"/docs/\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800470",RemoteObject.createImmutable("/docs/"),0);
 BA.debugLineNum = 3056;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800471",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 3057;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
Debug.ShouldStop(65536);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 3057;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
Debug.ShouldStop(65536);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 3058;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
Debug.ShouldStop(131072);
_flisthtml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flisthtml", _flisthtml);
 BA.debugLineNum = 3058;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
Debug.ShouldStop(131072);
_flisthtml.runVoidMethod ("Initialize");
 BA.debugLineNum = 3060;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(524288);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 3061;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(1048576);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 3062;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(2097152);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3063;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(4194304);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 3065;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
Debug.ShouldStop(16777216);
_sfl = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"))));Debug.locals.put("sfl", _sfl);Debug.locals.put("sfl", _sfl);
 BA.debugLineNum = 3068;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatefileswithftp"), _sfl);
this.state = 231;
return;
case 231:
//C
this.state = 13;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 3070;BA.debugLine="If Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 13:
//if
this.state = 124;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 123;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 3075;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(4);
if (true) break;

case 16:
//if
this.state = 51;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 3076;BA.debugLine="flist.Initialize";
Debug.ShouldStop(8);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 3077;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(16);
if (true) break;

case 19:
//for
this.state = 50;
step29 = 1;
limit29 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 232;
if (true) break;

case 232:
//C
this.state = 50;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 21;
if (true) break;

case 233:
//C
this.state = 232;
_i = ((int)(0 + _i + step29)) ;
Debug.locals.put("i", _i);
if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 3078;BA.debugLine="Dim fName As String = Files(i).Name";
Debug.ShouldStop(32);
_fname = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 3079;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWit";
Debug.ShouldStop(64);
if (true) break;

case 22:
//if
this.state = 49;
if (RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx")))))) { 
this.state = 24;
}else 
{ BA.debugLineNum = 3092;BA.debugLine="Else If (fName.EndsWith(\".html\")) Then";
Debug.ShouldStop(524288);
if ((_fname.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))).<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 48;
}}
if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 3083;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
Debug.ShouldStop(1024);
_ext = _fname.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 3084;BA.debugLine="If (Files(i).Timestamp >= datacontrolParse)";
Debug.ShouldStop(2048);
if (true) break;

case 25:
//if
this.state = 34;
if ((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_datacontrolparse))) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 3085;BA.debugLine="Try";
Debug.ShouldStop(4096);
if (true) break;

case 28:
//try
this.state = 33;
this.catchState = 32;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 32;
 BA.debugLineNum = 3086;BA.debugLine="Log(fName)";
Debug.ShouldStop(8192);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800501",_fname,0);
 BA.debugLineNum = 3087;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Na";
Debug.ShouldStop(16384);
_flist.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
 BA.debugLineNum = 3089;BA.debugLine="Log(LastException)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800504",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 49;
;
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 3093;BA.debugLine="Dim ext As String = \"html\"";
Debug.ShouldStop(1048576);
_ext = BA.ObjectToString("html");Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 3094;BA.debugLine="If ((Files(i).Timestamp >= datacontrolParse)";
Debug.ShouldStop(2097152);
if (true) break;

case 37:
//if
this.state = 46;
if ((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"),_datacontrolparse)))) || RemoteObject.solveBoolean(".",parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT_")))))))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 3095;BA.debugLine="Try";
Debug.ShouldStop(4194304);
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
 BA.debugLineNum = 3096;BA.debugLine="Log(fName)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800511",_fname,0);
 BA.debugLineNum = 3097;BA.debugLine="flisthtml.Add(Types.MakeDownUpFile(Files(i";
Debug.ShouldStop(16777216);
_flisthtml.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 Debug.CheckDeviceExceptions();
if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
 BA.debugLineNum = 3099;BA.debugLine="Log(LastException)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800514",BA.ObjectToString(parent.mostCurrent.__c.runMethod(false,"LastException",dataupdate.mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 if (true) break;

case 46:
//C
this.state = 49;
;
 if (true) break;

case 48:
//C
this.state = 49;
 if (true) break;

case 49:
//C
this.state = 233;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 3108;BA.debugLine="If (flist.Size >=1) Then '.IsInitialized) Then";
Debug.ShouldStop(8);

case 51:
//if
this.state = 86;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 53;
}else {
this.state = 85;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 3109;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(16);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 3110;BA.debugLine="If Not(flistLast.IsInitialized) Then";
Debug.ShouldStop(32);
if (true) break;

case 54:
//if
this.state = 57;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_flistlast.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 3111;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(64);
_flistlast.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 3117;BA.debugLine="If (flist.Size>=1) Then";
Debug.ShouldStop(4096);

case 57:
//if
this.state = 68;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 3118;BA.debugLine="For i=0 To flist.Size-1";
Debug.ShouldStop(8192);
if (true) break;

case 60:
//for
this.state = 67;
step61 = 1;
limit61 = RemoteObject.solve(new RemoteObject[] {_flist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 234;
if (true) break;

case 234:
//C
this.state = 67;
if ((step61 > 0 && _i <= limit61) || (step61 < 0 && _i >= limit61)) this.state = 62;
if (true) break;

case 235:
//C
this.state = 234;
_i = ((int)(0 + _i + step61)) ;
Debug.locals.put("i", _i);
if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 3119;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
Debug.ShouldStop(16384);
_fname1 = (_flist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 3120;BA.debugLine="Dim makeCopy As Boolean = True 'False";
Debug.ShouldStop(32768);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 3126;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 63:
//if
this.state = 66;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 3127;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(4194304);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 66:
//C
this.state = 235;
;
 if (true) break;
if (true) break;

case 67:
//C
this.state = 68;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 3135;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(1073741824);

case 68:
//if
this.state = 83;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 70;
}else {
this.state = 82;
}if (true) break;

case 70:
//C
this.state = 71;
 BA.debugLineNum = 3136;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
Debug.ShouldStop(-2147483648);
parent._sqlfilestotal = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 3137;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(1);
if (true) break;

case 71:
//for
this.state = 80;
step71 = 1;
limit71 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 236;
if (true) break;

case 236:
//C
this.state = 80;
if ((step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71)) this.state = 73;
if (true) break;

case 237:
//C
this.state = 236;
_i = ((int)(0 + _i + step71)) ;
Debug.locals.put("i", _i);
if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 3138;BA.debugLine="Dim fName As String = flistLast.Get(i)";
Debug.ShouldStop(2);
_fname = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 3140;BA.debugLine="Log(fName)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800555",_fname,0);
 BA.debugLineNum = 3142;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(32);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3143;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 238;
return;
case 238:
//C
this.state = 74;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3144;BA.debugLine="If Success Then";
Debug.ShouldStop(128);
if (true) break;

case 74:
//if
this.state = 79;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 3145;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800560",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 3147;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800562",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;

case 79:
//C
this.state = 237;
;
 BA.debugLineNum = 3150;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(8192);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 80:
//C
this.state = 83;
Debug.locals.put("i", _i);
;
 if (true) break;

case 82:
//C
this.state = 83;
 BA.debugLineNum = 3154;BA.debugLine="Log(\"vazio 0\")";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800569",RemoteObject.createImmutable("vazio 0"),0);
 if (true) break;

case 83:
//C
this.state = 86;
;
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 3157;BA.debugLine="Log(\"vazio 1\")";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800572",RemoteObject.createImmutable("vazio 1"),0);
 if (true) break;
;
 BA.debugLineNum = 3160;BA.debugLine="If (flisthtml.Size >=1) Then '.IsInitialized) T";
Debug.ShouldStop(8388608);

case 86:
//if
this.state = 121;
if ((RemoteObject.solveBoolean("g",_flisthtml.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 88;
}else {
this.state = 120;
}if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 3161;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(16777216);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 3162;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(33554432);
_flistlast.runVoidMethod ("Initialize");
 BA.debugLineNum = 3166;BA.debugLine="If (flisthtml.Size>=1) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 89:
//if
this.state = 103;
if ((RemoteObject.solveBoolean("g",_flisthtml.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 91;
}if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 3167;BA.debugLine="For i=0 To flisthtml.Size-1";
Debug.ShouldStop(1073741824);
if (true) break;

case 92:
//for
this.state = 102;
step93 = 1;
limit93 = RemoteObject.solve(new RemoteObject[] {_flisthtml.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 239;
if (true) break;

case 239:
//C
this.state = 102;
if ((step93 > 0 && _i <= limit93) || (step93 < 0 && _i >= limit93)) this.state = 94;
if (true) break;

case 240:
//C
this.state = 239;
_i = ((int)(0 + _i + step93)) ;
Debug.locals.put("i", _i);
if (true) break;

case 94:
//C
this.state = 95;
 BA.debugLineNum = 3168;BA.debugLine="Dim fName1 As DownUpFile = flisthtml.Get(i)";
Debug.ShouldStop(-2147483648);
_fname1 = (_flisthtml.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 3169;BA.debugLine="Dim makeCopy As Boolean = False";
Debug.ShouldStop(1);
_makecopy = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 3170;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
Debug.ShouldStop(2);
if (true) break;

case 95:
//if
this.state = 98;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname1.getField(true,"Filename" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 3171;BA.debugLine="makeCopy = True";
Debug.ShouldStop(4);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);
 if (true) break;
;
 BA.debugLineNum = 3174;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(32);

case 98:
//if
this.state = 101;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
 BA.debugLineNum = 3175;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(64);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 101:
//C
this.state = 240;
;
 if (true) break;
if (true) break;

case 102:
//C
this.state = 103;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 3183;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(16384);

case 103:
//if
this.state = 118;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 105;
}else {
this.state = 117;
}if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 3184;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
Debug.ShouldStop(32768);
parent._sqlfilestotal = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 3185;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(65536);
if (true) break;

case 106:
//for
this.state = 115;
step106 = 1;
limit106 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 241;
if (true) break;

case 241:
//C
this.state = 115;
if ((step106 > 0 && _i <= limit106) || (step106 < 0 && _i >= limit106)) this.state = 108;
if (true) break;

case 242:
//C
this.state = 241;
_i = ((int)(0 + _i + step106)) ;
Debug.locals.put("i", _i);
if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 3186;BA.debugLine="Dim fName As String = flistLast.Get(i)";
Debug.ShouldStop(131072);
_fname = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName", _fname);Debug.locals.put("fName", _fname);
 BA.debugLineNum = 3189;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(1048576);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/"),_fname)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3190;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 243;
return;
case 243:
//C
this.state = 109;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3191;BA.debugLine="If Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 109:
//if
this.state = 114;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 111;
}else {
this.state = 113;
}if (true) break;

case 111:
//C
this.state = 114;
 BA.debugLineNum = 3192;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800607",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 113:
//C
this.state = 114;
 BA.debugLineNum = 3194;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800609",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;

case 114:
//C
this.state = 242;
;
 BA.debugLineNum = 3197;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(268435456);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 115:
//C
this.state = 118;
Debug.locals.put("i", _i);
;
 if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 3200;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(-2147483648);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3201;BA.debugLine="Log(\"vazio 0\")";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800616",RemoteObject.createImmutable("vazio 0"),0);
 if (true) break;

case 118:
//C
this.state = 121;
;
 if (true) break;

case 120:
//C
this.state = 121;
 BA.debugLineNum = 3204;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(8);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3205;BA.debugLine="Log(\"vazio 1\")";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800620",RemoteObject.createImmutable("vazio 1"),0);
 if (true) break;

case 121:
//C
this.state = 124;
;
 if (true) break;

case 123:
//C
this.state = 124;
 BA.debugLineNum = 3209;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(256);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3210;BA.debugLine="Log(\"Sem sucesso!\")";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800625",RemoteObject.createImmutable("Sem sucesso!"),0);
 if (true) break;

case 124:
//C
this.state = 125;
;
 BA.debugLineNum = 3213;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(4096);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3219;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800634",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 3220;BA.debugLine="Log($\" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${Sh";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800635",(RemoteObject.concat(RemoteObject.createImmutable(" 		DOWNLOAD : "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(" "))),0);
 BA.debugLineNum = 3221;BA.debugLine="Log($\"${ShareCode.APP_FTP_USER}@${ShareCode.APPL";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800636",(RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 3222;BA.debugLine="Log(\"/docs/templates/\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800637",RemoteObject.createImmutable("/docs/templates/"),0);
 BA.debugLineNum = 3223;BA.debugLine="Log(\"*******************************************";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800638",RemoteObject.createImmutable("************************************************************"),0);
 BA.debugLineNum = 3224;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
Debug.ShouldStop(8388608);
_flist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flist", _flist);
 BA.debugLineNum = 3224;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
Debug.ShouldStop(8388608);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 3225;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
Debug.ShouldStop(16777216);
_flisthtml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flisthtml", _flisthtml);
 BA.debugLineNum = 3225;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
Debug.ShouldStop(16777216);
_flisthtml.runVoidMethod ("Initialize");
 BA.debugLineNum = 3227;BA.debugLine="Dim GlobalFTP As FTP";
Debug.ShouldStop(67108864);
_globalftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("GlobalFTP", _globalftp);
 BA.debugLineNum = 3228;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
Debug.ShouldStop(134217728);
_globalftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 3229;BA.debugLine="GlobalFTP.PassiveMode = True";
Debug.ShouldStop(268435456);
_globalftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 3230;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
Debug.ShouldStop(536870912);
_globalftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 3232;BA.debugLine="Dim sf1 As Object = GlobalFTP.List(\"/\" & ShareCo";
Debug.ShouldStop(-2147483648);
_sf1 = _globalftp.runMethod(false,"List",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"))));Debug.locals.put("sf1", _sf1);Debug.locals.put("sf1", _sf1);
 BA.debugLineNum = 3233;BA.debugLine="Wait For (sf1) FTP_ListCompleted (ServerPath As";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_listcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatefileswithftp"), _sf1);
this.state = 244;
return;
case 244:
//C
this.state = 125;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
_folders = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("Folders", _folders);
_files = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(3));Debug.locals.put("Files", _files);
;
 BA.debugLineNum = 3235;BA.debugLine="If Success Then";
Debug.ShouldStop(4);
if (true) break;

case 125:
//if
this.state = 216;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 127;
}else {
this.state = 215;
}if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 3240;BA.debugLine="If (Files.Length >= 1) Then";
Debug.ShouldStop(128);
if (true) break;

case 128:
//if
this.state = 143;
if ((RemoteObject.solveBoolean("g",_files.getField(true,"length"),BA.numberCast(double.class, 1)))) { 
this.state = 130;
}if (true) break;

case 130:
//C
this.state = 131;
 BA.debugLineNum = 3241;BA.debugLine="flist.Initialize";
Debug.ShouldStop(256);
_flist.runVoidMethod ("Initialize");
 BA.debugLineNum = 3242;BA.debugLine="For i = 0 To Files.Length - 1";
Debug.ShouldStop(512);
if (true) break;

case 131:
//for
this.state = 142;
step148 = 1;
limit148 = RemoteObject.solve(new RemoteObject[] {_files.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 245;
if (true) break;

case 245:
//C
this.state = 142;
if ((step148 > 0 && _i <= limit148) || (step148 < 0 && _i >= limit148)) this.state = 133;
if (true) break;

case 246:
//C
this.state = 245;
_i = ((int)(0 + _i + step148)) ;
Debug.locals.put("i", _i);
if (true) break;

case 133:
//C
this.state = 134;
 BA.debugLineNum = 3243;BA.debugLine="Dim fName2 As String = Files(i).Name";
Debug.ShouldStop(1024);
_fname2 = _files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName");Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 3245;BA.debugLine="If (fName2.EndsWith(\".png\")) Or (fName2.EndsW";
Debug.ShouldStop(4096);
if (true) break;

case 134:
//if
this.state = 141;
if (RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".png"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpg"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".jpeg"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pdf"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".doc"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".docx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xls"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".xlsx"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".ppt"))))) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".pptx"))))) || RemoteObject.solveBoolean("=",(_fname2.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("REPORT")))),parent.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean(".",(_fname2.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("dictionary")))))) { 
this.state = 136;
}else 
{ BA.debugLineNum = 3252;BA.debugLine="Else If (fName2.EndsWith(\".html\")) Then";
Debug.ShouldStop(524288);
if ((_fname2.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(".html")))).<Boolean>get().booleanValue()) { 
this.state = 138;
}else {
this.state = 140;
}}
if (true) break;

case 136:
//C
this.state = 141;
 BA.debugLineNum = 3249;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
Debug.ShouldStop(65536);
_ext = _fname.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_fname.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 3250;BA.debugLine="Log(fName2)";
Debug.ShouldStop(131072);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800665",_fname2,0);
 BA.debugLineNum = 3251;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Name";
Debug.ShouldStop(262144);
_flist.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 if (true) break;

case 138:
//C
this.state = 141;
 BA.debugLineNum = 3253;BA.debugLine="Log(fName2)";
Debug.ShouldStop(1048576);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800668",_fname2,0);
 BA.debugLineNum = 3254;BA.debugLine="Dim ext As String = \"html\"";
Debug.ShouldStop(2097152);
_ext = BA.ObjectToString("html");Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 3255;BA.debugLine="flisthtml.Add(Types.MakeDownUpFile(Files(i).";
Debug.ShouldStop(4194304);
_flisthtml.runVoidMethod ("Add",(Object)((parent.mostCurrent._types.runMethod(false,"_makedownupfile" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getName")),(Object)(_ext),(Object)(_files.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"getTimestamp"))))));
 if (true) break;

case 140:
//C
this.state = 141;
 if (true) break;

case 141:
//C
this.state = 246;
;
 if (true) break;
if (true) break;

case 142:
//C
this.state = 143;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 3262;BA.debugLine="If (flist.Size >=1) Then '.IsInitialized) Then";
Debug.ShouldStop(536870912);

case 143:
//if
this.state = 178;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 145;
}else {
this.state = 177;
}if (true) break;

case 145:
//C
this.state = 146;
 BA.debugLineNum = 3263;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(1073741824);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 3264;BA.debugLine="If Not(flistLast.IsInitialized) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 146:
//if
this.state = 149;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(_flistlast.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
 BA.debugLineNum = 3265;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(1);
_flistlast.runVoidMethod ("Initialize");
 if (true) break;
;
 BA.debugLineNum = 3271;BA.debugLine="If (flist.Size>=1) Then";
Debug.ShouldStop(64);

case 149:
//if
this.state = 160;
if ((RemoteObject.solveBoolean("g",_flist.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 151;
}if (true) break;

case 151:
//C
this.state = 152;
 BA.debugLineNum = 3272;BA.debugLine="For i=0 To flist.Size-1";
Debug.ShouldStop(128);
if (true) break;

case 152:
//for
this.state = 159;
step168 = 1;
limit168 = RemoteObject.solve(new RemoteObject[] {_flist.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 247;
if (true) break;

case 247:
//C
this.state = 159;
if ((step168 > 0 && _i <= limit168) || (step168 < 0 && _i >= limit168)) this.state = 154;
if (true) break;

case 248:
//C
this.state = 247;
_i = ((int)(0 + _i + step168)) ;
Debug.locals.put("i", _i);
if (true) break;

case 154:
//C
this.state = 155;
 BA.debugLineNum = 3273;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
Debug.ShouldStop(256);
_fname1 = (_flist.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 3274;BA.debugLine="Dim makeCopy As Boolean = True 'False";
Debug.ShouldStop(512);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 3276;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(2048);
if (true) break;

case 155:
//if
this.state = 158;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 157;
}if (true) break;

case 157:
//C
this.state = 158;
 BA.debugLineNum = 3277;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(4096);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 158:
//C
this.state = 248;
;
 if (true) break;
if (true) break;

case 159:
//C
this.state = 160;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 3285;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(1048576);

case 160:
//if
this.state = 175;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 162;
}else {
this.state = 174;
}if (true) break;

case 162:
//C
this.state = 163;
 BA.debugLineNum = 3286;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
Debug.ShouldStop(2097152);
parent._sqlfilestotal = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 3287;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(4194304);
if (true) break;

case 163:
//for
this.state = 172;
step178 = 1;
limit178 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 249;
if (true) break;

case 249:
//C
this.state = 172;
if ((step178 > 0 && _i <= limit178) || (step178 < 0 && _i >= limit178)) this.state = 165;
if (true) break;

case 250:
//C
this.state = 249;
_i = ((int)(0 + _i + step178)) ;
Debug.locals.put("i", _i);
if (true) break;

case 165:
//C
this.state = 166;
 BA.debugLineNum = 3288;BA.debugLine="Dim fName2 As String = flistLast.Get(i)";
Debug.ShouldStop(8388608);
_fname2 = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 3289;BA.debugLine="Log(fName2)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800704",_fname2,0);
 BA.debugLineNum = 3290;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(33554432);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3291;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 251;
return;
case 251:
//C
this.state = 166;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3292;BA.debugLine="If Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 166:
//if
this.state = 171;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 168;
}else {
this.state = 170;
}if (true) break;

case 168:
//C
this.state = 171;
 BA.debugLineNum = 3293;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800708",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 170:
//C
this.state = 171;
 BA.debugLineNum = 3295;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800710",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;

case 171:
//C
this.state = 250;
;
 BA.debugLineNum = 3299;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(4);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 172:
//C
this.state = 175;
Debug.locals.put("i", _i);
;
 if (true) break;

case 174:
//C
this.state = 175;
 BA.debugLineNum = 3302;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(32);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3303;BA.debugLine="Log(\"vazio 0\")";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800718",RemoteObject.createImmutable("vazio 0"),0);
 if (true) break;

case 175:
//C
this.state = 178;
;
 if (true) break;

case 177:
//C
this.state = 178;
 BA.debugLineNum = 3306;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(512);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3307;BA.debugLine="Log(\"vazio 1\")";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800722",RemoteObject.createImmutable("vazio 1"),0);
 if (true) break;
;
 BA.debugLineNum = 3310;BA.debugLine="If (flisthtml.Size >=1) Then '.IsInitialized) T";
Debug.ShouldStop(8192);

case 178:
//if
this.state = 213;
if ((RemoteObject.solveBoolean("g",_flisthtml.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 180;
}else {
this.state = 212;
}if (true) break;

case 180:
//C
this.state = 181;
 BA.debugLineNum = 3311;BA.debugLine="Dim flistLast As List";
Debug.ShouldStop(16384);
_flistlast = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("flistLast", _flistlast);
 BA.debugLineNum = 3312;BA.debugLine="flistLast.Initialize";
Debug.ShouldStop(32768);
_flistlast.runVoidMethod ("Initialize");
 BA.debugLineNum = 3316;BA.debugLine="If (flisthtml.Size>=1) Then";
Debug.ShouldStop(524288);
if (true) break;

case 181:
//if
this.state = 195;
if ((RemoteObject.solveBoolean("g",_flisthtml.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 183;
}if (true) break;

case 183:
//C
this.state = 184;
 BA.debugLineNum = 3317;BA.debugLine="For i=0 To flisthtml.Size-1";
Debug.ShouldStop(1048576);
if (true) break;

case 184:
//for
this.state = 194;
step202 = 1;
limit202 = RemoteObject.solve(new RemoteObject[] {_flisthtml.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 252;
if (true) break;

case 252:
//C
this.state = 194;
if ((step202 > 0 && _i <= limit202) || (step202 < 0 && _i >= limit202)) this.state = 186;
if (true) break;

case 253:
//C
this.state = 252;
_i = ((int)(0 + _i + step202)) ;
Debug.locals.put("i", _i);
if (true) break;

case 186:
//C
this.state = 187;
 BA.debugLineNum = 3318;BA.debugLine="Dim fName1 As DownUpFile = flisthtml.Get(i)";
Debug.ShouldStop(2097152);
_fname1 = (_flisthtml.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName1", _fname1);Debug.locals.put("fName1", _fname1);
 BA.debugLineNum = 3319;BA.debugLine="Dim makeCopy As Boolean = False";
Debug.ShouldStop(4194304);
_makecopy = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("makeCopy", _makecopy);Debug.locals.put("makeCopy", _makecopy);
 BA.debugLineNum = 3320;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
Debug.ShouldStop(8388608);
if (true) break;

case 187:
//if
this.state = 190;
if (parent.mostCurrent.__c.runMethod(true,"Not",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname1.getField(true,"Filename" /*RemoteObject*/ ))))).<Boolean>get().booleanValue()) { 
this.state = 189;
}if (true) break;

case 189:
//C
this.state = 190;
 BA.debugLineNum = 3321;BA.debugLine="makeCopy = True";
Debug.ShouldStop(16777216);
_makecopy = parent.mostCurrent.__c.getField(true,"True");Debug.locals.put("makeCopy", _makecopy);
 if (true) break;
;
 BA.debugLineNum = 3324;BA.debugLine="If (makeCopy) Then";
Debug.ShouldStop(134217728);

case 190:
//if
this.state = 193;
if ((_makecopy).<Boolean>get().booleanValue()) { 
this.state = 192;
}if (true) break;

case 192:
//C
this.state = 193;
 BA.debugLineNum = 3325;BA.debugLine="flistLast.Add(fName1.Filename)";
Debug.ShouldStop(268435456);
_flistlast.runVoidMethod ("Add",(Object)((_fname1.getField(true,"Filename" /*RemoteObject*/ ))));
 if (true) break;

case 193:
//C
this.state = 253;
;
 if (true) break;
if (true) break;

case 194:
//C
this.state = 195;
Debug.locals.put("i", _i);
;
 if (true) break;
;
 BA.debugLineNum = 3333;BA.debugLine="If (flistLast.Size>=1) Then";
Debug.ShouldStop(16);

case 195:
//if
this.state = 210;
if ((RemoteObject.solveBoolean("g",_flistlast.runMethod(true,"getSize"),BA.numberCast(double.class, 1)))) { 
this.state = 197;
}else {
this.state = 209;
}if (true) break;

case 197:
//C
this.state = 198;
 BA.debugLineNum = 3334;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
Debug.ShouldStop(32);
parent._sqlfilestotal = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);
 BA.debugLineNum = 3335;BA.debugLine="For i=0 To flistLast.Size-1";
Debug.ShouldStop(64);
if (true) break;

case 198:
//for
this.state = 207;
step215 = 1;
limit215 = RemoteObject.solve(new RemoteObject[] {_flistlast.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 254;
if (true) break;

case 254:
//C
this.state = 207;
if ((step215 > 0 && _i <= limit215) || (step215 < 0 && _i >= limit215)) this.state = 200;
if (true) break;

case 255:
//C
this.state = 254;
_i = ((int)(0 + _i + step215)) ;
Debug.locals.put("i", _i);
if (true) break;

case 200:
//C
this.state = 201;
 BA.debugLineNum = 3336;BA.debugLine="Dim fName2 As String = flistLast.Get(i)";
Debug.ShouldStop(128);
_fname2 = BA.ObjectToString(_flistlast.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("fName2", _fname2);Debug.locals.put("fName2", _fname2);
 BA.debugLineNum = 3337;BA.debugLine="Log(fName2)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800752",_fname2,0);
 BA.debugLineNum = 3338;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
Debug.ShouldStop(512);
_sf = _globalftp.runMethod(false,"DownloadFile",dataupdate.processBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable("/"),parent.mostCurrent._sharecode._app_domain /*RemoteObject*/ ,RemoteObject.createImmutable("/docs/templates/"),_fname2)),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_fname2));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 3339;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_downloadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 256;
return;
case 256:
//C
this.state = 201;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3340;BA.debugLine="If Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 201:
//if
this.state = 206;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
 BA.debugLineNum = 3341;BA.debugLine="Log(\"file was download successfully\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800756",RemoteObject.createImmutable("file was download successfully"),0);
 if (true) break;

case 205:
//C
this.state = 206;
 BA.debugLineNum = 3343;BA.debugLine="Log(\"Error downloading file\")";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800758",RemoteObject.createImmutable("Error downloading file"),0);
 if (true) break;

case 206:
//C
this.state = 255;
;
 BA.debugLineNum = 3346;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
Debug.ShouldStop(131072);
_duprogressbar(parent._sqlfilestotal,BA.numberCast(int.class, _i));
 if (true) break;
if (true) break;

case 207:
//C
this.state = 210;
Debug.locals.put("i", _i);
;
 if (true) break;

case 209:
//C
this.state = 210;
 BA.debugLineNum = 3349;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(1048576);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3350;BA.debugLine="Log(\"vazio 0\")";
Debug.ShouldStop(2097152);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800765",RemoteObject.createImmutable("vazio 0"),0);
 if (true) break;

case 210:
//C
this.state = 213;
;
 if (true) break;

case 212:
//C
this.state = 213;
 BA.debugLineNum = 3353;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(16777216);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3354;BA.debugLine="Log(\"vazio 1\")";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800769",RemoteObject.createImmutable("vazio 1"),0);
 if (true) break;

case 213:
//C
this.state = 216;
;
 if (true) break;

case 215:
//C
this.state = 216;
 BA.debugLineNum = 3358;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(536870912);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3359;BA.debugLine="Log(\"Sem sucesso!\")";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800774",RemoteObject.createImmutable("Sem sucesso!"),0);
 if (true) break;

case 216:
//C
this.state = 217;
;
 BA.debugLineNum = 3362;BA.debugLine="GlobalFTP.Close";
Debug.ShouldStop(2);
_globalftp.runVoidMethod ("Close");
 BA.debugLineNum = 3367;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
Debug.ShouldStop(64);
if (true) break;

case 217:
//if
this.state = 222;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 219;
}else {
this.state = 221;
}if (true) break;

case 219:
//C
this.state = 222;
 BA.debugLineNum = 3368;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangu";
Debug.ShouldStop(128);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ));
 if (true) break;

case 221:
//C
this.state = 222;
 BA.debugLineNum = 3370;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(512);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 if (true) break;

case 222:
//C
this.state = 225;
;
 BA.debugLineNum = 3373;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 224:
//C
this.state = 225;
 BA.debugLineNum = 3375;BA.debugLine="DUProgressBar(0,0)";
Debug.ShouldStop(16384);
_duprogressbar(BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 3376;BA.debugLine="Log(\"vazio 2\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","661800791",RemoteObject.createImmutable("vazio 2"),0);
 if (true) break;
;
 BA.debugLineNum = 3382;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
Debug.ShouldStop(2097152);

case 225:
//if
this.state = 230;
if (parent.mostCurrent._utils.runMethod(true,"_nne" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
this.state = 227;
}else {
this.state = 229;
}if (true) break;

case 227:
//C
this.state = 230;
 BA.debugLineNum = 3383;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
Debug.ShouldStop(4194304);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(parent.mostCurrent._sharecode._userlanguage /*RemoteObject*/ ));
 if (true) break;

case 229:
//C
this.state = 230;
 BA.debugLineNum = 3385;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
Debug.ShouldStop(16777216);
parent.mostCurrent._sharecode.runVoidMethod ("_checktranslations" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("PT")));
 if (true) break;

case 230:
//C
this.state = -1;
;
 BA.debugLineNum = 3388;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3389;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",dataupdate.processBA, e0.toString());}
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
public static RemoteObject  _utilapiupdate(RemoteObject _params,RemoteObject _target,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("UtilAPIUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,414);
if (RapidSub.canDelegate("utilapiupdate")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","utilapiupdate", _params, _target, _url);}
ResumableSub_UtilAPIUpdate rsub = new ResumableSub_UtilAPIUpdate(null,_params,_target,_url);
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
public static class ResumableSub_UtilAPIUpdate extends BA.ResumableSub {
public ResumableSub_UtilAPIUpdate(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _params,RemoteObject _target,RemoteObject _url) {
this.parent = parent;
this._params = _params;
this._target = _target;
this._url = _url;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _params;
RemoteObject _target;
RemoteObject _url;
RemoteObject _job = RemoteObject.declareNull("xevolution.vrcg.devdemov2400.httpjob");
RemoteObject _addr = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UtilAPIUpdate (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,414);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("params", _params);
Debug.locals.put("target", _target);
Debug.locals.put("url", _url);
 BA.debugLineNum = 415;BA.debugLine="Dim Job As HttpJob";
Debug.ShouldStop(1073741824);
_job = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.httpjob");Debug.locals.put("Job", _job);
 BA.debugLineNum = 416;BA.debugLine="Job.Initialize(\"\",target)";
Debug.ShouldStop(-2147483648);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_initialize" /*RemoteObject*/ ,dataupdate.processBA,(Object)(BA.ObjectToString("")),(Object)(_target));
 BA.debugLineNum = 417;BA.debugLine="Dim addr As String = url";
Debug.ShouldStop(1);
_addr = _url;Debug.locals.put("addr", _addr);Debug.locals.put("addr", _addr);
 BA.debugLineNum = 419;BA.debugLine="Job.PostString(addr, params )";
Debug.ShouldStop(4);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_addr),(Object)(_params));
 BA.debugLineNum = 420;BA.debugLine="Log(params)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659899910",_params,0);
 BA.debugLineNum = 421;BA.debugLine="Log(addr)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659899911",_addr,0);
 BA.debugLineNum = 422;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(32);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 424;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "utilapiupdate"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("Job", _job);
;
 BA.debugLineNum = 425;BA.debugLine="If Job.Success Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 426;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
Debug.ShouldStop(512);
_status = parent.mostCurrent._utils.runMethod(true,"_jobapistatus" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_job));Debug.locals.put("Status", _status);Debug.locals.put("Status", _status);
 BA.debugLineNum = 427;BA.debugLine="Log($\"Status: ${Status}\"$)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659899917",(RemoteObject.concat(RemoteObject.createImmutable("Status: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 428;BA.debugLine="Job.Release";
Debug.ShouldStop(2048);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 429;BA.debugLine="Return True";
Debug.ShouldStop(4096);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"True")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 431;BA.debugLine="Job.Release";
Debug.ShouldStop(16384);
_job.runClassMethod (xevolution.vrcg.devdemov2400.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 432;BA.debugLine="Sleep(250)";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("Sleep",dataupdate.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "utilapiupdate"),BA.numberCast(int.class, 250));
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 BA.debugLineNum = 433;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.mostCurrent.__c.getField(true,"False")));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 436;BA.debugLine="End Sub";
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
public static RemoteObject  _utilapiuploadfile(RemoteObject _url,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("UtilAPIUploadFile (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,438);
if (RapidSub.canDelegate("utilapiuploadfile")) { return xevolution.vrcg.devdemov2400.dataupdate.remoteMe.runUserSub(false, "dataupdate","utilapiuploadfile", _url, _filename);}
ResumableSub_UtilAPIUploadFile rsub = new ResumableSub_UtilAPIUploadFile(null,_url,_filename);
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
public static class ResumableSub_UtilAPIUploadFile extends BA.ResumableSub {
public ResumableSub_UtilAPIUploadFile(xevolution.vrcg.devdemov2400.dataupdate parent,RemoteObject _url,RemoteObject _filename) {
this.parent = parent;
this._url = _url;
this._filename = _filename;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.dataupdate parent;
RemoteObject _url;
RemoteObject _filename;
RemoteObject _ret = RemoteObject.createImmutable(false);
RemoteObject _myftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
RemoteObject _sf = RemoteObject.declareNull("Object");
RemoteObject _serverpath = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("UtilAPIUploadFile (dataupdate) ","dataupdate",10,dataupdate.mostCurrent.activityBA,dataupdate.mostCurrent,438);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("url", _url);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 439;BA.debugLine="Dim ret As Boolean = False";
Debug.ShouldStop(4194304);
_ret = parent.mostCurrent.__c.getField(true,"False");Debug.locals.put("ret", _ret);Debug.locals.put("ret", _ret);
 BA.debugLineNum = 440;BA.debugLine="Dim myFTP As FTP";
Debug.ShouldStop(8388608);
_myftp = RemoteObject.createNew ("anywheresoftware.b4a.net.FTPWrapper");Debug.locals.put("myFTP", _myftp);
 BA.debugLineNum = 441;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
Debug.ShouldStop(16777216);
_myftp.runVoidMethod ("Initialize",dataupdate.processBA,(Object)(BA.ObjectToString("ftp")),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_account /*RemoteObject*/ .runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("."),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(BA.numberCast(int.class, 21)),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._app_ftp_user /*RemoteObject*/ ))),RemoteObject.createImmutable("@"),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._sharecode._appl_host /*RemoteObject*/ ))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("..VRCG@EvolutionCheck20!9")));
 BA.debugLineNum = 442;BA.debugLine="myFTP.PassiveMode = True";
Debug.ShouldStop(33554432);
_myftp.runMethod(true,"setPassiveMode",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 443;BA.debugLine="myFTP.TimeoutMs =240000";
Debug.ShouldStop(67108864);
_myftp.setField ("TimeoutMs",BA.numberCast(int.class, 240000));
 BA.debugLineNum = 445;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
Debug.ShouldStop(268435456);
_sf = _myftp.runMethod(false,"UploadFile",dataupdate.processBA,(Object)(parent.mostCurrent._starter._internalfolder /*RemoteObject*/ ),(Object)(_filename),(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(RemoteObject.concat(_url,_filename)));Debug.locals.put("sf", _sf);Debug.locals.put("sf", _sf);
 BA.debugLineNum = 446;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","ftp_uploadcompleted", dataupdate.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "dataupdate", "utilapiuploadfile"), _sf);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_serverpath = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("ServerPath", _serverpath);
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 447;BA.debugLine="Log($\"Ficheiro: ${filename}, URL: ${url}, Status:";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","659965449",(RemoteObject.concat(RemoteObject.createImmutable("Ficheiro: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_filename))),RemoteObject.createImmutable(", URL: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_url))),RemoteObject.createImmutable(", Status: "),parent.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.mostCurrent._utils.runMethod(true,"_bool2string" /*RemoteObject*/ ,dataupdate.mostCurrent.activityBA,(Object)(_success))))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 448;BA.debugLine="ret = Success";
Debug.ShouldStop(-2147483648);
_ret = _success;Debug.locals.put("ret", _ret);
 BA.debugLineNum = 449;BA.debugLine="myFTP.Close";
Debug.ShouldStop(1);
_myftp.runVoidMethod ("Close");
 BA.debugLineNum = 450;BA.debugLine="Return ret";
Debug.ShouldStop(2);
if (true) {
parent.mostCurrent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_ret));return;};
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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