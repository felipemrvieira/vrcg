package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class mapsactivity extends Activity implements B4AActivity{
	public static mapsactivity mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.mapsactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mapsactivity).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.mapsactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.mapsactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mapsactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mapsactivity) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return mapsactivity.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (mapsactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mapsactivity) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            mapsactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mapsactivity) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _mainmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mainmapfragment = null;
public anywheresoftware.b4a.objects.PanelWrapper _blockpanel = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar = null;
public xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
public static String _latitude = "";
public static String _longitude = "";
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellat = null;
public anywheresoftware.b4a.objects.LabelWrapper _labellng = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=143785984;
 //BA.debugLineNum = 143785984;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=143785986;
 //BA.debugLineNum = 143785986;BA.debugLine="Activity.LoadLayout(\"maps_layout\")";
mostCurrent._activity.LoadLayout("maps_layout",mostCurrent.activityBA);
RDebugUtils.currentLine=143785987;
 //BA.debugLineNum = 143785987;BA.debugLine="If MainMapFragment.IsGooglePlayServicesAvailable";
if (mostCurrent._mainmapfragment.IsGooglePlayServicesAvailable(mostCurrent.activityBA)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=143785988;
 //BA.debugLineNum = 143785988;BA.debugLine="ToastMessageShow(\"Please install Google Play Ser";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Please install Google Play Services."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=143785990;
 //BA.debugLineNum = 143785990;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=143785993;
 //BA.debugLineNum = 143785993;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=144244736;
 //BA.debugLineNum = 144244736;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=144244737;
 //BA.debugLineNum = 144244737;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=144244739;
 //BA.debugLineNum = 144244739;BA.debugLine="mapBack_Click";
_mapback_click();
 };
RDebugUtils.currentLine=144244741;
 //BA.debugLineNum = 144244741;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=144244742;
 //BA.debugLineNum = 144244742;BA.debugLine="End Sub";
return false;
}
public static String  _mapback_click() throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mapback_click", null));}
RDebugUtils.currentLine=144179200;
 //BA.debugLineNum = 144179200;BA.debugLine="Sub mapBack_Click";
RDebugUtils.currentLine=144179201;
 //BA.debugLineNum = 144179201;BA.debugLine="If ShareCode.CalledFromAlerts Then";
if (mostCurrent._sharecode._calledfromalerts /*boolean*/ ) { 
RDebugUtils.currentLine=144179202;
 //BA.debugLineNum = 144179202;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else {
RDebugUtils.currentLine=144179204;
 //BA.debugLineNum = 144179204;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._checklist3.getObject()),"CamImage2",(Object)(mostCurrent._currentclaitem));
RDebugUtils.currentLine=144179205;
 //BA.debugLineNum = 144179205;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=144179206;
 //BA.debugLineNum = 144179206;BA.debugLine="ShareCode.FadeInFadeOutAnimation";
mostCurrent._sharecode._fadeinfadeoutanimation /*String*/ (mostCurrent.activityBA);
 };
RDebugUtils.currentLine=144179210;
 //BA.debugLineNum = 144179210;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mapsactivity";
RDebugUtils.currentLine=143917056;
 //BA.debugLineNum = 143917056;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=143917058;
 //BA.debugLineNum = 143917058;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(xevolution.vrcg.devdemov2400.mapsactivity parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mapsactivity parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mapsactivity";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=143851521;
 //BA.debugLineNum = 143851521;BA.debugLine="Sleep(4000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mapsactivity", "activity_resume"),(int) (4000));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=143851522;
 //BA.debugLineNum = 143851522;BA.debugLine="InitMaps";
_initmaps();
RDebugUtils.currentLine=143851523;
 //BA.debugLineNum = 143851523;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _initmaps() throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "initmaps", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "initmaps", null));}
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cp = null;
String _location = "";
RDebugUtils.currentLine=144048128;
 //BA.debugLineNum = 144048128;BA.debugLine="Sub InitMaps";
RDebugUtils.currentLine=144048130;
 //BA.debugLineNum = 144048130;BA.debugLine="Try";
try {RDebugUtils.currentLine=144048131;
 //BA.debugLineNum = 144048131;BA.debugLine="If(MainMap.MyLocation.IsInitialized) Then";
if ((mostCurrent._mainmap.getMyLocation().IsInitialized())) { 
RDebugUtils.currentLine=144048132;
 //BA.debugLineNum = 144048132;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=144048133;
 //BA.debugLineNum = 144048133;BA.debugLine="cp.Initialize(Latitude, Longitude,15)";
_cp.Initialize((double)(Double.parseDouble(mostCurrent._latitude)),(double)(Double.parseDouble(mostCurrent._longitude)),(float) (15));
RDebugUtils.currentLine=144048134;
 //BA.debugLineNum = 144048134;BA.debugLine="MainMap.AddMarker(Latitude, Longitude, \"Localiz";
mostCurrent._mainmap.AddMarker((double)(Double.parseDouble(mostCurrent._latitude)),(double)(Double.parseDouble(mostCurrent._longitude)),"Localizaçâo do registo");
RDebugUtils.currentLine=144048135;
 //BA.debugLineNum = 144048135;BA.debugLine="LabelLat.Text = Latitude";
mostCurrent._labellat.setText(BA.ObjectToCharSequence(mostCurrent._latitude));
RDebugUtils.currentLine=144048136;
 //BA.debugLineNum = 144048136;BA.debugLine="LabelLng.Text = Longitude";
mostCurrent._labellng.setText(BA.ObjectToCharSequence(mostCurrent._longitude));
RDebugUtils.currentLine=144048137;
 //BA.debugLineNum = 144048137;BA.debugLine="MainMap.MoveCamera(cp)";
mostCurrent._mainmap.MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
RDebugUtils.currentLine=144048138;
 //BA.debugLineNum = 144048138;BA.debugLine="Dim location As String = $\"${MainMap.MyLocation";
_location = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mainmap.getMyLocation().getLatitude()))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._mainmap.getMyLocation().getLongitude()))+"");
RDebugUtils.currentLine=144048139;
 //BA.debugLineNum = 144048139;BA.debugLine="BlockPanel.Visible = False";
mostCurrent._blockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=144048140;
 //BA.debugLineNum = 144048140;BA.debugLine="ProgressBar.Visible = False";
mostCurrent._progressbar.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
 };
 } 
       catch (Exception e15) {
			processBA.setLastException(e15);RDebugUtils.currentLine=144048147;
 //BA.debugLineNum = 144048147;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6144048147",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=144048149;
 //BA.debugLineNum = 144048149;BA.debugLine="End Sub";
return "";
}
public static String  _mainmapfragment_ready() throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainmapfragment_ready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainmapfragment_ready", null));}
RDebugUtils.currentLine=143982592;
 //BA.debugLineNum = 143982592;BA.debugLine="Sub MainMapFragment_Ready";
RDebugUtils.currentLine=143982593;
 //BA.debugLineNum = 143982593;BA.debugLine="MainMap = MainMapFragment.GetMap";
mostCurrent._mainmap = mostCurrent._mainmapfragment.GetMap();
RDebugUtils.currentLine=143982594;
 //BA.debugLineNum = 143982594;BA.debugLine="End Sub";
return "";
}
public static String  _startmapsactivity(xevolution.vrcg.devdemov2400.types._requestclaitem _claitem,anywheresoftware.b4a.objects.collections.Map _location) throws Exception{
RDebugUtils.currentModule="mapsactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startmapsactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startmapsactivity", new Object[] {_claitem,_location}));}
RDebugUtils.currentLine=144113664;
 //BA.debugLineNum = 144113664;BA.debugLine="Public Sub StartMapsActivity(CLAItem As RequestCLA";
RDebugUtils.currentLine=144113665;
 //BA.debugLineNum = 144113665;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=144113666;
 //BA.debugLineNum = 144113666;BA.debugLine="Latitude = Location.Get(\"latitude\")";
mostCurrent._latitude = BA.ObjectToString(_location.Get((Object)("latitude")));
RDebugUtils.currentLine=144113667;
 //BA.debugLineNum = 144113667;BA.debugLine="Longitude = Location.Get(\"longitude\")";
mostCurrent._longitude = BA.ObjectToString(_location.Get((Object)("longitude")));
RDebugUtils.currentLine=144113669;
 //BA.debugLineNum = 144113669;BA.debugLine="End Sub";
return "";
}
}