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

public class cameraactivity_innershot extends Activity implements B4AActivity{
	public static cameraactivity_innershot mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.cameraactivity_innershot");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (cameraactivity_innershot).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.cameraactivity_innershot");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.cameraactivity_innershot", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (cameraactivity_innershot) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (cameraactivity_innershot) Resume **");
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
		return cameraactivity_innershot.class;
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
            BA.LogInfo("** Activity (cameraactivity_innershot) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (cameraactivity_innershot) Pause event (activity is not paused). **");
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
            cameraactivity_innershot mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (cameraactivity_innershot) Resume **");
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
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static boolean _stayoncamera = false;
public static String _shotfilelocation = "";
public static String _shotfilename = "";
public static boolean _frontcamera = false;
public static int _counter = 0;
public static String _lastfilename = "";
public static anywheresoftware.b4a.objects.collections.List _camshots = null;
public static Object _returnto = null;
public static anywheresoftware.b4a.phone.Phone _device = null;
public anywheresoftware.b4a.objects.PanelWrapper _campanelinner = null;
public xevolution.vrcg.devdemov2400.cameraexclass _camexinner = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butclosecamera = null;
public anywheresoftware.b4a.objects.PanelWrapper _showpicturepanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showpictureimage = null;
public anywheresoftware.b4a.objects.ButtonWrapper _showpictureclose = null;
public xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
public static boolean _exittodialog = false;
public static String _currentfilename = "";
public static int _intcounter = 0;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _dir = "";
RDebugUtils.currentLine=122486784;
 //BA.debugLineNum = 122486784;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=122486786;
 //BA.debugLineNum = 122486786;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=122486787;
 //BA.debugLineNum = 122486787;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=122486789;
 //BA.debugLineNum = 122486789;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=122486791;
 //BA.debugLineNum = 122486791;BA.debugLine="Activity.LoadLayout(\"camerawindow_inner_shot\")";
mostCurrent._activity.LoadLayout("camerawindow_inner_shot",mostCurrent.activityBA);
RDebugUtils.currentLine=122486792;
 //BA.debugLineNum = 122486792;BA.debugLine="CamShots.Initialize";
_camshots.Initialize();
RDebugUtils.currentLine=122486793;
 //BA.debugLineNum = 122486793;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
_dir = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=122486794;
 //BA.debugLineNum = 122486794;BA.debugLine="ShotFileLocation = dir";
_shotfilelocation = _dir;
RDebugUtils.currentLine=122486795;
 //BA.debugLineNum = 122486795;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=122748928;
 //BA.debugLineNum = 122748928;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=122748929;
 //BA.debugLineNum = 122748929;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=122748930;
 //BA.debugLineNum = 122748930;BA.debugLine="CloseActivity";
_closeactivity();
 };
RDebugUtils.currentLine=122748932;
 //BA.debugLineNum = 122748932;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=122748933;
 //BA.debugLineNum = 122748933;BA.debugLine="End Sub";
return false;
}
public static String  _closeactivity() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closeactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "closeactivity", null));}
RDebugUtils.currentLine=123797504;
 //BA.debugLineNum = 123797504;BA.debugLine="Public Sub CloseActivity";
RDebugUtils.currentLine=123797505;
 //BA.debugLineNum = 123797505;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=123797506;
 //BA.debugLineNum = 123797506;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
RDebugUtils.currentLine=122880000;
 //BA.debugLineNum = 122880000;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=122880001;
 //BA.debugLineNum = 122880001;BA.debugLine="If camExInner.IsInitialized Then";
if (mostCurrent._camexinner.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=122880002;
 //BA.debugLineNum = 122880002;BA.debugLine="camExInner.Release";
mostCurrent._camexinner._release /*String*/ (null);
 };
RDebugUtils.currentLine=122880004;
 //BA.debugLineNum = 122880004;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=122683392;
 //BA.debugLineNum = 122683392;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=122683394;
 //BA.debugLineNum = 122683394;BA.debugLine="End Sub";
return "";
}
public static String  _btnflash_click() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnflash_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnflash_click", null));}
float[] _f = null;
anywheresoftware.b4a.objects.collections.List _flashmodes = null;
String _flash = "";
RDebugUtils.currentLine=123600896;
 //BA.debugLineNum = 123600896;BA.debugLine="Sub btnFlash_Click";
RDebugUtils.currentLine=123600897;
 //BA.debugLineNum = 123600897;BA.debugLine="Dim f() As Float = camExInner.GetFocusDistances";
_f = mostCurrent._camexinner._getfocusdistances /*float[]*/ (null);
RDebugUtils.currentLine=123600898;
 //BA.debugLineNum = 123600898;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("6123600898",BA.NumberToString(_f[(int) (0)])+", "+BA.NumberToString(_f[(int) (1)])+", "+BA.NumberToString(_f[(int) (2)]),0);
RDebugUtils.currentLine=123600899;
 //BA.debugLineNum = 123600899;BA.debugLine="Dim flashModes As List = camExInner.GetSupportedF";
_flashmodes = new anywheresoftware.b4a.objects.collections.List();
_flashmodes = mostCurrent._camexinner._getsupportedflashmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=123600900;
 //BA.debugLineNum = 123600900;BA.debugLine="If flashModes.IsInitialized = False Then";
if (_flashmodes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=123600901;
 //BA.debugLineNum = 123600901;BA.debugLine="ToastMessageShow(\"Flash não suportado.\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Flash não suportado."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=123600902;
 //BA.debugLineNum = 123600902;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=123600904;
 //BA.debugLineNum = 123600904;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
_flash = BA.ObjectToString(_flashmodes.Get((int) ((_flashmodes.IndexOf((Object)(mostCurrent._camexinner._getflashmode /*String*/ (null)))+1)%_flashmodes.getSize())));
RDebugUtils.currentLine=123600905;
 //BA.debugLineNum = 123600905;BA.debugLine="camExInner.SetFlashMode(flash)";
mostCurrent._camexinner._setflashmode /*String*/ (null,_flash);
RDebugUtils.currentLine=123600906;
 //BA.debugLineNum = 123600906;BA.debugLine="ToastMessageShow(flash, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_flash),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=123600907;
 //BA.debugLineNum = 123600907;BA.debugLine="camExInner.CommitParameters";
mostCurrent._camexinner._commitparameters /*String*/ (null);
RDebugUtils.currentLine=123600908;
 //BA.debugLineNum = 123600908;BA.debugLine="End Sub";
return "";
}
public static String  _btnfocus_click() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfocus_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfocus_click", null));}
RDebugUtils.currentLine=123142144;
 //BA.debugLineNum = 123142144;BA.debugLine="Sub btnFocus_Click";
RDebugUtils.currentLine=123142145;
 //BA.debugLineNum = 123142145;BA.debugLine="camExInner.FocusAndTakePicture";
mostCurrent._camexinner._focusandtakepicture /*String*/ (null);
RDebugUtils.currentLine=123142146;
 //BA.debugLineNum = 123142146;BA.debugLine="End Sub";
return "";
}
public static String  _btntakepicture_click() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btntakepicture_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btntakepicture_click", null));}
RDebugUtils.currentLine=123076608;
 //BA.debugLineNum = 123076608;BA.debugLine="Sub btnTakePicture_Click";
RDebugUtils.currentLine=123076609;
 //BA.debugLineNum = 123076609;BA.debugLine="camExInner.TakePicture";
mostCurrent._camexinner._takepicture /*String*/ (null);
RDebugUtils.currentLine=123076610;
 //BA.debugLineNum = 123076610;BA.debugLine="End Sub";
return "";
}
public static String  _butclosecamera_click() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butclosecamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butclosecamera_click", null));}
boolean _docontinue = false;
xevolution.vrcg.devdemov2400.appactiondialogs _ma = null;
int _i = 0;
String _saclalatitude = "";
String _saclalongitude = "";
RDebugUtils.currentLine=123863040;
 //BA.debugLineNum = 123863040;BA.debugLine="Sub butCloseCamera_Click";
RDebugUtils.currentLine=123863042;
 //BA.debugLineNum = 123863042;BA.debugLine="Dim DoContinue As Boolean = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=123863047;
 //BA.debugLineNum = 123863047;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
if ((_returnto instanceof xevolution.vrcg.devdemov2400.appactiondialogs)) { 
RDebugUtils.currentLine=123863049;
 //BA.debugLineNum = 123863049;BA.debugLine="Dim ma As AppActionDialogs = ReturnTo";
_ma = (xevolution.vrcg.devdemov2400.appactiondialogs)(_returnto);
RDebugUtils.currentLine=123863050;
 //BA.debugLineNum = 123863050;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=123863051;
 //BA.debugLineNum = 123863051;BA.debugLine="i = Msgbox2(ShareCode.SavePictureToCLAItem, Shar";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._savepicturetoclaitem /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalnotetitle /*String*/ ),mostCurrent._sharecode._option_exitsave /*String*/ ,mostCurrent._sharecode._option_cancel /*String*/ ,mostCurrent._sharecode._option_exitnosave /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=123863052;
 //BA.debugLineNum = 123863052;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=123863053;
 //BA.debugLineNum = 123863053;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
RDebugUtils.currentLine=123863054;
 //BA.debugLineNum = 123863054;BA.debugLine="ma.CameraReturn(CurrentFileName, CurrentCLAIte";
_ma._camerareturn /*void*/ (null,mostCurrent._currentfilename,mostCurrent._currentclaitem);
RDebugUtils.currentLine=123863055;
 //BA.debugLineNum = 123863055;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._requests3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 };
 }else 
{RDebugUtils.currentLine=123863057;
 //BA.debugLineNum = 123863057;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
RDebugUtils.currentLine=123863058;
 //BA.debugLineNum = 123863058;BA.debugLine="ma.CameraReturnNothing";
_ma._camerareturnnothing /*String*/ (null);
 }else {
RDebugUtils.currentLine=123863060;
 //BA.debugLineNum = 123863060;BA.debugLine="DoContinue = False";
_docontinue = anywheresoftware.b4a.keywords.Common.False;
 }}
;
 }else {
RDebugUtils.currentLine=123863064;
 //BA.debugLineNum = 123863064;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=123863065;
 //BA.debugLineNum = 123863065;BA.debugLine="i = Msgbox2(ShareCode.SavePictureToResoucesFolde";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._savepicturetoresoucesfolder /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_action /*String*/ ,mostCurrent._sharecode._option_resource /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=123863066;
 //BA.debugLineNum = 123863066;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
 }else 
{RDebugUtils.currentLine=123863070;
 //BA.debugLineNum = 123863070;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
RDebugUtils.currentLine=123863076;
 //BA.debugLineNum = 123863076;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
_saclalatitude = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=123863077;
 //BA.debugLineNum = 123863077;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
_saclalongitude = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=123863079;
 //BA.debugLineNum = 123863079;BA.debugLine="For i=0 To CamShots.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (_camshots.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=123863080;
 //BA.debugLineNum = 123863080;BA.debugLine="DBStructures.InsertWorkingFiles( ShareCode.SES";
mostCurrent._dbstructures._insertworkingfiles /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_user /*String*/ ,mostCurrent._utils._generatetagcode /*String*/ (mostCurrent.activityBA,"WFF_"),BA.ObjectToString(_camshots.Get(_i)),_shotfilelocation,mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA),_saclalatitude,_saclalongitude);
 }
};
 }else {
 }}
;
 };
RDebugUtils.currentLine=123863091;
 //BA.debugLineNum = 123863091;BA.debugLine="If DoContinue Then Activity.Finish";
if (_docontinue) { 
mostCurrent._activity.Finish();};
RDebugUtils.currentLine=123863092;
 //BA.debugLineNum = 123863092;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _bytestoimage(byte[] _bytes) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bytestoimage", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(mostCurrent.activityBA, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=123404288;
 //BA.debugLineNum = 123404288;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
RDebugUtils.currentLine=123404289;
 //BA.debugLineNum = 123404289;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=123404290;
 //BA.debugLineNum = 123404290;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=123404292;
 //BA.debugLineNum = 123404292;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=123404293;
 //BA.debugLineNum = 123404293;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=123404298;
 //BA.debugLineNum = 123404298;BA.debugLine="Return bmp";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=123404299;
 //BA.debugLineNum = 123404299;BA.debugLine="End Sub";
return null;
}
public static String  _campanelinner_picturetaken(byte[] _data) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "campanelinner_picturetaken", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "campanelinner_picturetaken", new Object[] {_data}));}
String _datename = "";
String _datetimename = "";
String _filename = "";
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cmes = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _cvsrect = null;
String _saclalatitude = "";
String _saclalongitude = "";
String _scounter = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=123469824;
 //BA.debugLineNum = 123469824;BA.debugLine="Sub camPanelInner_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=123469825;
 //BA.debugLineNum = 123469825;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
_datename = mostCurrent._utils._makefilename /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=123469826;
 //BA.debugLineNum = 123469826;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
_datetimename = mostCurrent._utils._makedatetimeslash /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=123469828;
 //BA.debugLineNum = 123469828;BA.debugLine="CurrentFileName = $\"IMG-${DateName}-${Counter}-IN";
mostCurrent._currentfilename = ("IMG-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datename))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_counter))+"-INNER-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_intcounter))+"");
RDebugUtils.currentLine=123469829;
 //BA.debugLineNum = 123469829;BA.debugLine="Dim filename As String = $\"${CurrentFileName}.png";
_filename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._currentfilename))+".png");
RDebugUtils.currentLine=123469830;
 //BA.debugLineNum = 123469830;BA.debugLine="If LastFileName = \"\" Then";
if ((_lastfilename).equals("")) { 
RDebugUtils.currentLine=123469831;
 //BA.debugLineNum = 123469831;BA.debugLine="LastFileName = filename";
_lastfilename = _filename;
 };
RDebugUtils.currentLine=123469834;
 //BA.debugLineNum = 123469834;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
_shotfilelocation = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=123469835;
 //BA.debugLineNum = 123469835;BA.debugLine="If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW";
if (mostCurrent._starter._params /*xevolution.vrcg.devdemov2400.configparameters*/ ._cfg_take_picture_always_as_new /*int*/ ==0) { 
RDebugUtils.currentLine=123469836;
 //BA.debugLineNum = 123469836;BA.debugLine="filename = LastFileName";
_filename = _lastfilename;
 };
RDebugUtils.currentLine=123469840;
 //BA.debugLineNum = 123469840;BA.debugLine="ShotFileName = filename";
_shotfilename = _filename;
RDebugUtils.currentLine=123469841;
 //BA.debugLineNum = 123469841;BA.debugLine="Dim cmes As CameraSize = camExInner.GetPictureSiz";
_cmes = mostCurrent._camexinner._getpicturesize /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=123469842;
 //BA.debugLineNum = 123469842;BA.debugLine="camExInner.SavePictureToFile(Data, ShotFileLocati";
mostCurrent._camexinner._savepicturetofile /*String*/ (null,_data,_shotfilelocation,_shotfilename);
RDebugUtils.currentLine=123469848;
 //BA.debugLineNum = 123469848;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, c";
_cvs = _createcanvas(_cmes.Width /*int*/ ,_cmes.Height /*int*/ );
RDebugUtils.currentLine=123469850;
 //BA.debugLineNum = 123469850;BA.debugLine="Dim cvsRect As B4XRect";
_cvsrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=123469851;
 //BA.debugLineNum = 123469851;BA.debugLine="cvsRect.Initialize(0,0,cmes.Width, cmes.Height)";
_cvsrect.Initialize((float) (0),(float) (0),(float) (_cmes.Width /*int*/ ),(float) (_cmes.Height /*int*/ ));
RDebugUtils.currentLine=123469853;
 //BA.debugLineNum = 123469853;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, S";
_cvs.DrawBitmap((android.graphics.Bitmap)(_xui.LoadBitmap(_shotfilelocation,_shotfilename).getObject()),_cvsrect);
RDebugUtils.currentLine=123469856;
 //BA.debugLineNum = 123469856;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
_saclalatitude = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=123469857;
 //BA.debugLineNum = 123469857;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
_saclalongitude = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=123469858;
 //BA.debugLineNum = 123469858;BA.debugLine="DateTimeName = $\"${DateTimeName} - ${sACLALatitud";
_datetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimename))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalatitude))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalongitude))+"");
RDebugUtils.currentLine=123469860;
 //BA.debugLineNum = 123469860;BA.debugLine="Dim SCounter As String = $\"Nº${IntCounter}\"$";
_scounter = ("Nº"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_intcounter))+"");
RDebugUtils.currentLine=123469861;
 //BA.debugLineNum = 123469861;BA.debugLine="cvs.DrawText(SCounter, 10dip, cvs.TargetRect.top+";
_cvs.DrawText(processBA,_scounter,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getTop()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (15))),_xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ )),_xui.Color_White,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=123469862;
 //BA.debugLineNum = 123469862;BA.debugLine="cvs.DrawText(DateTimeName, 10dip, cvs.TargetRect.";
_cvs.DrawText(processBA,_datetimename,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),_xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ )),_xui.Color_White,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=123469863;
 //BA.debugLineNum = 123469863;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=123469864;
 //BA.debugLineNum = 123469864;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_shotfilelocation,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_shotfilename))+""),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=123469865;
 //BA.debugLineNum = 123469865;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
_cvs.CreateBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=123469866;
 //BA.debugLineNum = 123469866;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=123469867;
 //BA.debugLineNum = 123469867;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=123469868;
 //BA.debugLineNum = 123469868;BA.debugLine="CamShots.Add(ShotFileName)";
_camshots.Add((Object)(_shotfilename));
RDebugUtils.currentLine=123469894;
 //BA.debugLineNum = 123469894;BA.debugLine="CallSubDelayed2(ImageEdit, \"SaveInnerShot\", ShotF";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._imageedit.getObject()),"SaveInnerShot",(Object)(_shotfilename));
RDebugUtils.currentLine=123469895;
 //BA.debugLineNum = 123469895;BA.debugLine="CloseActivity";
_closeactivity();
RDebugUtils.currentLine=123469896;
 //BA.debugLineNum = 123469896;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XCanvas  _createcanvas(int _width,int _height) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcanvas", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(mostCurrent.activityBA, "createcanvas", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
RDebugUtils.currentLine=123273216;
 //BA.debugLineNum = 123273216;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
RDebugUtils.currentLine=123273217;
 //BA.debugLineNum = 123273217;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=123273218;
 //BA.debugLineNum = 123273218;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=123273219;
 //BA.debugLineNum = 123273219;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=123273220;
 //BA.debugLineNum = 123273220;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=123273221;
 //BA.debugLineNum = 123273221;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=123273222;
 //BA.debugLineNum = 123273222;BA.debugLine="End Sub";
return null;
}
public static String  _campanelinner_ready(boolean _success) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "campanelinner_ready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "campanelinner_ready", new Object[] {_success}));}
RDebugUtils.currentLine=122945536;
 //BA.debugLineNum = 122945536;BA.debugLine="Sub camPanelInner_Ready (Success As Boolean)";
RDebugUtils.currentLine=122945537;
 //BA.debugLineNum = 122945537;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=122945538;
 //BA.debugLineNum = 122945538;BA.debugLine="camExInner.SetJpegQuality(ShareCode.DEVICE_DEF_Q";
mostCurrent._camexinner._setjpegquality /*String*/ (null,mostCurrent._sharecode._device_def_quality /*int*/ );
RDebugUtils.currentLine=122945541;
 //BA.debugLineNum = 122945541;BA.debugLine="camExInner.SetPictureSize(ShareCode.DEVICE_DEF_I";
mostCurrent._camexinner._setpicturesize /*String*/ (null,mostCurrent._sharecode._device_def_img_width /*int*/ ,mostCurrent._sharecode._device_def_img_height /*int*/ );
RDebugUtils.currentLine=122945542;
 //BA.debugLineNum = 122945542;BA.debugLine="camExInner.SetContinuousAutoFocus";
mostCurrent._camexinner._setcontinuousautofocus /*String*/ (null);
RDebugUtils.currentLine=122945543;
 //BA.debugLineNum = 122945543;BA.debugLine="camExInner.CommitParameters";
mostCurrent._camexinner._commitparameters /*String*/ (null);
RDebugUtils.currentLine=122945544;
 //BA.debugLineNum = 122945544;BA.debugLine="camExInner.StartPreview";
mostCurrent._camexinner._startpreview /*String*/ (null);
 }else {
RDebugUtils.currentLine=122945546;
 //BA.debugLineNum = 122945546;BA.debugLine="ToastMessageShow(\"Não é possível abrir a camera.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Não é possível abrir a camera."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=122945548;
 //BA.debugLineNum = 122945548;BA.debugLine="End Sub";
return "";
}
public static String  _camzoom_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "camzoom_valuechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "camzoom_valuechanged", new Object[] {_value,_userchanged}));}
RDebugUtils.currentLine=123666432;
 //BA.debugLineNum = 123666432;BA.debugLine="Sub camZoom_ValueChanged (Value As Int, UserChange";
RDebugUtils.currentLine=123666433;
 //BA.debugLineNum = 123666433;BA.debugLine="If UserChanged = False Or camExInner.IsZoomSuppor";
if (_userchanged==anywheresoftware.b4a.keywords.Common.False || mostCurrent._camexinner._iszoomsupported /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=123666434;
 //BA.debugLineNum = 123666434;BA.debugLine="camExInner.Zoom = Value / 100 * camExInner.GetMax";
mostCurrent._camexinner._setzoom /*int*/ (null,(int) (_value/(double)100*mostCurrent._camexinner._getmaxzoom /*int*/ (null)));
RDebugUtils.currentLine=123666435;
 //BA.debugLineNum = 123666435;BA.debugLine="camExInner.CommitParameters";
mostCurrent._camexinner._commitparameters /*String*/ (null);
RDebugUtils.currentLine=123666436;
 //BA.debugLineNum = 123666436;BA.debugLine="End Sub";
return "";
}
public static String  _changecamera_click() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changecamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changecamera_click", null));}
RDebugUtils.currentLine=123535360;
 //BA.debugLineNum = 123535360;BA.debugLine="Sub ChangeCamera_Click";
RDebugUtils.currentLine=123535361;
 //BA.debugLineNum = 123535361;BA.debugLine="If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then";
if (mostCurrent._starter._params /*xevolution.vrcg.devdemov2400.configparameters*/ ._cfg_allow_front_camera /*int*/ ==1) { 
RDebugUtils.currentLine=123535362;
 //BA.debugLineNum = 123535362;BA.debugLine="camExInner.Release";
mostCurrent._camexinner._release /*String*/ (null);
RDebugUtils.currentLine=123535363;
 //BA.debugLineNum = 123535363;BA.debugLine="frontCamera = Not(frontCamera)";
_frontcamera = anywheresoftware.b4a.keywords.Common.Not(_frontcamera);
RDebugUtils.currentLine=123535364;
 //BA.debugLineNum = 123535364;BA.debugLine="InitializeCamera";
_initializecamera();
 }else {
RDebugUtils.currentLine=123535366;
 //BA.debugLineNum = 123535366;BA.debugLine="ToastMessageShow(\"Apenas a camera traseira está";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Apenas a camera traseira está activa."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=123535368;
 //BA.debugLineNum = 123535368;BA.debugLine="End Sub";
return "";
}
public static String  _initializecamera() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "initializecamera", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "initializecamera", null));}
RDebugUtils.currentLine=122814464;
 //BA.debugLineNum = 122814464;BA.debugLine="Private Sub InitializeCamera";
RDebugUtils.currentLine=122814465;
 //BA.debugLineNum = 122814465;BA.debugLine="camExInner.Initialize(camPanelInner, frontCamera,";
mostCurrent._camexinner._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._campanelinner,_frontcamera,cameraactivity_innershot.getObject(),"camPanelInner");
RDebugUtils.currentLine=122814466;
 //BA.debugLineNum = 122814466;BA.debugLine="frontCamera = camExInner.Front";
_frontcamera = mostCurrent._camexinner._front /*boolean*/ ;
RDebugUtils.currentLine=122814467;
 //BA.debugLineNum = 122814467;BA.debugLine="End Sub";
return "";
}
public static Object  _createfileprovideruri(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createfileprovideruri", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "createfileprovideruri", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.object.JavaObject _fileprovider1 = null;
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _f = null;
RDebugUtils.currentLine=123731968;
 //BA.debugLineNum = 123731968;BA.debugLine="Sub CreateFileProviderUri (Dir As String, FileName";
RDebugUtils.currentLine=123731969;
 //BA.debugLineNum = 123731969;BA.debugLine="Dim FileProvider1 As JavaObject";
_fileprovider1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=123731970;
 //BA.debugLineNum = 123731970;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=123731971;
 //BA.debugLineNum = 123731971;BA.debugLine="context.InitializeContext";
_context.InitializeContext(processBA);
RDebugUtils.currentLine=123731972;
 //BA.debugLineNum = 123731972;BA.debugLine="FileProvider1.InitializeStatic(\"android.support.v";
_fileprovider1.InitializeStatic("androidx.core.content.FileProvider");
RDebugUtils.currentLine=123731973;
 //BA.debugLineNum = 123731973;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=123731974;
 //BA.debugLineNum = 123731974;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Dir";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(_dir),(Object)(_filename)});
RDebugUtils.currentLine=123731975;
 //BA.debugLineNum = 123731975;BA.debugLine="Return FileProvider1.RunMethod(\"getUriForFile\", A";
if (true) return _fileprovider1.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
RDebugUtils.currentLine=123731976;
 //BA.debugLineNum = 123731976;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.cameraexclass._camerasize  _getcamsize(int _width,int _height) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getcamsize", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize) Debug.delegate(mostCurrent.activityBA, "getcamsize", new Object[] {_width,_height}));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _ret = null;
RDebugUtils.currentLine=123207680;
 //BA.debugLineNum = 123207680;BA.debugLine="Sub getCamsize(Width As Int, Height As Int) As Cam";
RDebugUtils.currentLine=123207681;
 //BA.debugLineNum = 123207681;BA.debugLine="Dim ret As CameraSize";
_ret = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=123207682;
 //BA.debugLineNum = 123207682;BA.debugLine="ret.initialize";
_ret.Initialize();
RDebugUtils.currentLine=123207683;
 //BA.debugLineNum = 123207683;BA.debugLine="ret.Width = Width";
_ret.Width /*int*/  = _width;
RDebugUtils.currentLine=123207684;
 //BA.debugLineNum = 123207684;BA.debugLine="ret.Height = Height";
_ret.Height /*int*/  = _height;
RDebugUtils.currentLine=123207685;
 //BA.debugLineNum = 123207685;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=123207686;
 //BA.debugLineNum = 123207686;BA.debugLine="End Sub";
return null;
}
public static byte[]  _imagetobytes(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _image) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagetobytes", false))
	 {return ((byte[]) Debug.delegate(mostCurrent.activityBA, "imagetobytes", new Object[] {_image}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=123338752;
 //BA.debugLineNum = 123338752;BA.debugLine="Public Sub ImageToBytes(Image As B4XBitmap) As Byt";
RDebugUtils.currentLine=123338753;
 //BA.debugLineNum = 123338753;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=123338754;
 //BA.debugLineNum = 123338754;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=123338755;
 //BA.debugLineNum = 123338755;BA.debugLine="Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUA";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=123338756;
 //BA.debugLineNum = 123338756;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=123338757;
 //BA.debugLineNum = 123338757;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=123338758;
 //BA.debugLineNum = 123338758;BA.debugLine="End Sub";
return null;
}
public static String  _setminimumsize() throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setminimumsize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setminimumsize", null));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _mincs = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=123011072;
 //BA.debugLineNum = 123011072;BA.debugLine="Private Sub SetMinimumSize";
RDebugUtils.currentLine=123011073;
 //BA.debugLineNum = 123011073;BA.debugLine="Dim minCS As CameraSize";
_mincs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=123011074;
 //BA.debugLineNum = 123011074;BA.debugLine="For Each cs As CameraSize In camExInner.GetSuppor";
{
final xevolution.vrcg.devdemov2400.cameraexclass._camerasize[] group2 = mostCurrent._camexinner._getsupportedpicturessizes /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]*/ (null);
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cs = group2[index2];
RDebugUtils.currentLine=123011075;
 //BA.debugLineNum = 123011075;BA.debugLine="If minCS.Width = 0 Then";
if (_mincs.Width /*int*/ ==0) { 
RDebugUtils.currentLine=123011076;
 //BA.debugLineNum = 123011076;BA.debugLine="minCS = cs";
_mincs = _cs;
 }else {
RDebugUtils.currentLine=123011078;
 //BA.debugLineNum = 123011078;BA.debugLine="If Power(minCS.Width, 2) + Power(minCS.Height,";
if (anywheresoftware.b4a.keywords.Common.Power(_mincs.Width /*int*/ ,2)+anywheresoftware.b4a.keywords.Common.Power(_mincs.Height /*int*/ ,2)>anywheresoftware.b4a.keywords.Common.Power(_cs.Width /*int*/ ,2)+anywheresoftware.b4a.keywords.Common.Power(_cs.Height /*int*/ ,2)) { 
RDebugUtils.currentLine=123011079;
 //BA.debugLineNum = 123011079;BA.debugLine="minCS = cs";
_mincs = _cs;
 };
 };
 }
};
RDebugUtils.currentLine=123011083;
 //BA.debugLineNum = 123011083;BA.debugLine="camExInner.SetPictureSize(minCS.Width, minCS.Heig";
mostCurrent._camexinner._setpicturesize /*String*/ (null,_mincs.Width /*int*/ ,_mincs.Height /*int*/ );
RDebugUtils.currentLine=123011084;
 //BA.debugLineNum = 123011084;BA.debugLine="End Sub";
return "";
}
public static String  _startcamerainner(int _icounter) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamerainner", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcamerainner", new Object[] {_icounter}));}
RDebugUtils.currentLine=122552320;
 //BA.debugLineNum = 122552320;BA.debugLine="Public Sub StartCameraInner(ICounter As Int)";
RDebugUtils.currentLine=122552321;
 //BA.debugLineNum = 122552321;BA.debugLine="ReturnTo = \"ImageEdit\"";
_returnto = (Object)("ImageEdit");
RDebugUtils.currentLine=122552322;
 //BA.debugLineNum = 122552322;BA.debugLine="IntCounter = ICounter";
_intcounter = _icounter;
RDebugUtils.currentLine=122552323;
 //BA.debugLineNum = 122552323;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=122552324;
 //BA.debugLineNum = 122552324;BA.debugLine="End Sub";
return "";
}
public static String  _startcamerainner2(Object _returntoactivity,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="cameraactivity_innershot";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamerainner2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcamerainner2", new Object[] {_returntoactivity,_claitem}));}
RDebugUtils.currentLine=122617856;
 //BA.debugLineNum = 122617856;BA.debugLine="Public Sub StartCameraInner2(ReturnToActivity As O";
RDebugUtils.currentLine=122617857;
 //BA.debugLineNum = 122617857;BA.debugLine="ReturnTo = ReturnToActivity";
_returnto = _returntoactivity;
RDebugUtils.currentLine=122617858;
 //BA.debugLineNum = 122617858;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=122617859;
 //BA.debugLineNum = 122617859;BA.debugLine="ExitToDialog = True";
_exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=122617860;
 //BA.debugLineNum = 122617860;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=122617861;
 //BA.debugLineNum = 122617861;BA.debugLine="End Sub";
return "";
}
}