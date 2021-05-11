package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mapsactivity_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="Activity.LoadLayout(\"maps_layout\")";
Debug.ShouldStop(1073741824);
mapsactivity.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("maps_layout")),mapsactivity.mostCurrent.activityBA);
 BA.debugLineNum = 32;BA.debugLine="If MainMapFragment.IsGooglePlayServicesAvailable";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",mapsactivity.mostCurrent._mainmapfragment.runMethod(true,"IsGooglePlayServicesAvailable",mapsactivity.mostCurrent.activityBA),mapsactivity.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 33;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
Debug.ShouldStop(1);
mapsactivity.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please install Google Play Services.")),(Object)(mapsactivity.mostCurrent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 35;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
Debug.ShouldStop(4);
mapsactivity.mostCurrent._utils.runVoidMethod ("_setviewbackgroundcolortomaingradientcolor" /*RemoteObject*/ ,mapsactivity.mostCurrent.activityBA,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), mapsactivity.mostCurrent._colortabpanel.getObject()));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_KeyPress (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,96);
if (RapidSub.canDelegate("activity_keypress")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, mapsactivity.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 99;BA.debugLine="mapBack_Click";
Debug.ShouldStop(4);
_mapback_click();
 };
 BA.debugLineNum = 101;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return mapsactivity.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,45);
if (RapidSub.canDelegate("activity_pause")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,40);
if (RapidSub.canDelegate("activity_resume")) { xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","activity_resume"); return;}
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
public ResumableSub_Activity_Resume(xevolution.vrcg.devdemov2400.mapsactivity parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
xevolution.vrcg.devdemov2400.mapsactivity parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 BA.debugLineNum = 41;BA.debugLine="Sleep(4000)";
Debug.ShouldStop(256);
parent.mostCurrent.__c.runVoidMethod ("Sleep",mapsactivity.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "mapsactivity", "activity_resume"),BA.numberCast(int.class, 4000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 42;BA.debugLine="InitMaps";
Debug.ShouldStop(512);
_initmaps();
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private MainMap As GoogleMap";
mapsactivity.mostCurrent._mainmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private MainMapFragment As MapFragment";
mapsactivity.mostCurrent._mainmapfragment = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private BlockPanel As Panel";
mapsactivity.mostCurrent._blockpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ProgressBar As ProgressBar";
mapsactivity.mostCurrent._progressbar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ProgressBarWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private CurrentCLAItem As RequestCLAItem";
mapsactivity.mostCurrent._currentclaitem = RemoteObject.createNew ("xevolution.vrcg.devdemov2400.types._requestclaitem");
 //BA.debugLineNum = 21;BA.debugLine="Private Latitude As String";
mapsactivity.mostCurrent._latitude = RemoteObject.createImmutable("");
 //BA.debugLineNum = 22;BA.debugLine="Private Longitude As String";
mapsactivity.mostCurrent._longitude = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Private ColorTabPanel As Panel";
mapsactivity.mostCurrent._colortabpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private LabelLat As Label";
mapsactivity.mostCurrent._labellat = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private LabelLng As Label";
mapsactivity.mostCurrent._labellng = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initmaps() throws Exception{
try {
		Debug.PushSubsStack("InitMaps (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,54);
if (RapidSub.canDelegate("initmaps")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","initmaps");}
RemoteObject _cp = RemoteObject.declareNull("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");
RemoteObject _location = RemoteObject.createImmutable("");
 BA.debugLineNum = 54;BA.debugLine="Sub InitMaps";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Try";
Debug.ShouldStop(8388608);
try { BA.debugLineNum = 57;BA.debugLine="If(MainMap.MyLocation.IsInitialized) Then";
Debug.ShouldStop(16777216);
if ((mapsactivity.mostCurrent._mainmap.runMethod(false,"getMyLocation").runMethod(true,"IsInitialized")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="Dim cp As CameraPosition";
Debug.ShouldStop(33554432);
_cp = RemoteObject.createNew ("anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper");Debug.locals.put("cp", _cp);
 BA.debugLineNum = 59;BA.debugLine="cp.Initialize(Latitude, Longitude,15)";
Debug.ShouldStop(67108864);
_cp.runVoidMethod ("Initialize",(Object)(BA.numberCast(double.class, mapsactivity.mostCurrent._latitude)),(Object)(BA.numberCast(double.class, mapsactivity.mostCurrent._longitude)),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 60;BA.debugLine="MainMap.AddMarker(Latitude, Longitude, \"Localiz";
Debug.ShouldStop(134217728);
mapsactivity.mostCurrent._mainmap.runVoidMethod ("AddMarker",(Object)(BA.numberCast(double.class, mapsactivity.mostCurrent._latitude)),(Object)(BA.numberCast(double.class, mapsactivity.mostCurrent._longitude)),(Object)(RemoteObject.createImmutable("Localizaçâo do registo")));
 BA.debugLineNum = 61;BA.debugLine="LabelLat.Text = Latitude";
Debug.ShouldStop(268435456);
mapsactivity.mostCurrent._labellat.runMethod(true,"setText",BA.ObjectToCharSequence(mapsactivity.mostCurrent._latitude));
 BA.debugLineNum = 62;BA.debugLine="LabelLng.Text = Longitude";
Debug.ShouldStop(536870912);
mapsactivity.mostCurrent._labellng.runMethod(true,"setText",BA.ObjectToCharSequence(mapsactivity.mostCurrent._longitude));
 BA.debugLineNum = 63;BA.debugLine="MainMap.MoveCamera(cp)";
Debug.ShouldStop(1073741824);
mapsactivity.mostCurrent._mainmap.runVoidMethod ("MoveCamera",(Object)((_cp.getObject())));
 BA.debugLineNum = 64;BA.debugLine="Dim location As String = $\"${MainMap.MyLocation";
Debug.ShouldStop(-2147483648);
_location = (RemoteObject.concat(RemoteObject.createImmutable(""),mapsactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mapsactivity.mostCurrent._mainmap.runMethod(false,"getMyLocation").runMethod(true,"getLatitude")))),RemoteObject.createImmutable(","),mapsactivity.mostCurrent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((mapsactivity.mostCurrent._mainmap.runMethod(false,"getMyLocation").runMethod(true,"getLongitude")))),RemoteObject.createImmutable("")));Debug.locals.put("location", _location);Debug.locals.put("location", _location);
 BA.debugLineNum = 65;BA.debugLine="BlockPanel.Visible = False";
Debug.ShouldStop(1);
mapsactivity.mostCurrent._blockpanel.runMethod(true,"setVisible",mapsactivity.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 66;BA.debugLine="ProgressBar.Visible = False";
Debug.ShouldStop(2);
mapsactivity.mostCurrent._progressbar.runMethod(true,"setVisible",mapsactivity.mostCurrent.__c.getField(true,"False"));
 }else {
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e15) {
			BA.rdebugUtils.runVoidMethod("setLastException",mapsactivity.processBA, e15.toString()); BA.debugLineNum = 73;BA.debugLine="Log(LastException)";
Debug.ShouldStop(256);
mapsactivity.mostCurrent.__c.runVoidMethod ("LogImpl","6144048147",BA.ObjectToString(mapsactivity.mostCurrent.__c.runMethod(false,"LastException",mapsactivity.mostCurrent.activityBA)),0);
 };
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mainmapfragment_ready() throws Exception{
try {
		Debug.PushSubsStack("MainMapFragment_Ready (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,50);
if (RapidSub.canDelegate("mainmapfragment_ready")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","mainmapfragment_ready");}
 BA.debugLineNum = 50;BA.debugLine="Sub MainMapFragment_Ready";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="MainMap = MainMapFragment.GetMap";
Debug.ShouldStop(262144);
mapsactivity.mostCurrent._mainmap = mapsactivity.mostCurrent._mainmapfragment.runMethod(false,"GetMap");
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapback_click() throws Exception{
try {
		Debug.PushSubsStack("mapBack_Click (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,84);
if (RapidSub.canDelegate("mapback_click")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","mapback_click");}
 BA.debugLineNum = 84;BA.debugLine="Sub mapBack_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="If ShareCode.CalledFromAlerts Then";
Debug.ShouldStop(1048576);
if (mapsactivity.mostCurrent._sharecode._calledfromalerts /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="Activity.Finish";
Debug.ShouldStop(2097152);
mapsactivity.mostCurrent._activity.runVoidMethod ("Finish");
 }else {
 BA.debugLineNum = 88;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Current";
Debug.ShouldStop(8388608);
mapsactivity.mostCurrent.__c.runVoidMethod ("CallSubDelayed2",mapsactivity.processBA,(Object)((mapsactivity.mostCurrent._checklist3.getObject())),(Object)(BA.ObjectToString("CamImage2")),(Object)((mapsactivity.mostCurrent._currentclaitem)));
 BA.debugLineNum = 89;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16777216);
mapsactivity.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 90;BA.debugLine="ShareCode.FadeInFadeOutAnimation";
Debug.ShouldStop(33554432);
mapsactivity.mostCurrent._sharecode.runVoidMethod ("_fadeinfadeoutanimation" /*RemoteObject*/ ,mapsactivity.mostCurrent.activityBA);
 };
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _startmapsactivity(RemoteObject _claitem,RemoteObject _location) throws Exception{
try {
		Debug.PushSubsStack("StartMapsActivity (mapsactivity) ","mapsactivity",43,mapsactivity.mostCurrent.activityBA,mapsactivity.mostCurrent,77);
if (RapidSub.canDelegate("startmapsactivity")) { return xevolution.vrcg.devdemov2400.mapsactivity.remoteMe.runUserSub(false, "mapsactivity","startmapsactivity", _claitem, _location);}
Debug.locals.put("CLAItem", _claitem);
Debug.locals.put("Location", _location);
 BA.debugLineNum = 77;BA.debugLine="Public Sub StartMapsActivity(CLAItem As RequestCLA";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="CurrentCLAItem = CLAItem";
Debug.ShouldStop(8192);
mapsactivity.mostCurrent._currentclaitem = _claitem;
 BA.debugLineNum = 79;BA.debugLine="Latitude = Location.Get(\"latitude\")";
Debug.ShouldStop(16384);
mapsactivity.mostCurrent._latitude = BA.ObjectToString(_location.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));
 BA.debugLineNum = 80;BA.debugLine="Longitude = Location.Get(\"longitude\")";
Debug.ShouldStop(32768);
mapsactivity.mostCurrent._longitude = BA.ObjectToString(_location.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}