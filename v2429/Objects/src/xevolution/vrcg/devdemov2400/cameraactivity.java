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

public class cameraactivity extends Activity implements B4AActivity{
	public static cameraactivity mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.cameraactivity");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (cameraactivity).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.cameraactivity");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.cameraactivity", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (cameraactivity) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (cameraactivity) Resume **");
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
		return cameraactivity.class;
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
            BA.LogInfo("** Activity (cameraactivity) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (cameraactivity) Pause event (activity is not paused). **");
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
            cameraactivity mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (cameraactivity) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _campanel = null;
public xevolution.vrcg.devdemov2400.cameraexclass _camex = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butclosecamera = null;
public anywheresoftware.b4a.objects.PanelWrapper _showpicturepanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showpictureimage = null;
public anywheresoftware.b4a.objects.ButtonWrapper _showpictureclose = null;
public xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
public static String _currentfilename = "";
public static String _returntoname = "";
public static int _lastorigin = 0;
public static boolean _exittodialog = false;
public anywheresoftware.b4a.objects.ButtonWrapper _butcancelpicture = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsavepicture = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntakepicture = null;
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
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _dir = "";
RDebugUtils.currentLine=120258560;
 //BA.debugLineNum = 120258560;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=120258561;
 //BA.debugLineNum = 120258561;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=120258562;
 //BA.debugLineNum = 120258562;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=120258564;
 //BA.debugLineNum = 120258564;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=120258566;
 //BA.debugLineNum = 120258566;BA.debugLine="Activity.LoadLayout(\"CameraWindow\")";
mostCurrent._activity.LoadLayout("CameraWindow",mostCurrent.activityBA);
RDebugUtils.currentLine=120258567;
 //BA.debugLineNum = 120258567;BA.debugLine="CamShots.Initialize";
_camshots.Initialize();
RDebugUtils.currentLine=120258568;
 //BA.debugLineNum = 120258568;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
_dir = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=120258569;
 //BA.debugLineNum = 120258569;BA.debugLine="ShotFileLocation = dir";
_shotfilelocation = _dir;
RDebugUtils.currentLine=120258570;
 //BA.debugLineNum = 120258570;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=120586240;
 //BA.debugLineNum = 120586240;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=120586241;
 //BA.debugLineNum = 120586241;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=120586242;
 //BA.debugLineNum = 120586242;BA.debugLine="CloseActivity";
_closeactivity();
 };
RDebugUtils.currentLine=120586244;
 //BA.debugLineNum = 120586244;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=120586245;
 //BA.debugLineNum = 120586245;BA.debugLine="End Sub";
return false;
}
public static String  _closeactivity() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closeactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "closeactivity", null));}
RDebugUtils.currentLine=121896960;
 //BA.debugLineNum = 121896960;BA.debugLine="Public Sub CloseActivity";
RDebugUtils.currentLine=121896961;
 //BA.debugLineNum = 121896961;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=121896962;
 //BA.debugLineNum = 121896962;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="cameraactivity";
RDebugUtils.currentLine=120520704;
 //BA.debugLineNum = 120520704;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=120520705;
 //BA.debugLineNum = 120520705;BA.debugLine="If camEx.IsInitialized Then";
if (mostCurrent._camex.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=120520706;
 //BA.debugLineNum = 120520706;BA.debugLine="camEx.Release";
mostCurrent._camex._release /*String*/ (null);
 };
RDebugUtils.currentLine=120520708;
 //BA.debugLineNum = 120520708;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=120455168;
 //BA.debugLineNum = 120455168;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=120455170;
 //BA.debugLineNum = 120455170;BA.debugLine="End Sub";
return "";
}
public static String  _btneffect_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btneffect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btneffect_click", null));}
anywheresoftware.b4a.objects.collections.List _effects = null;
String _effect = "";
RDebugUtils.currentLine=121569280;
 //BA.debugLineNum = 121569280;BA.debugLine="Sub btnEffect_Click";
RDebugUtils.currentLine=121569281;
 //BA.debugLineNum = 121569281;BA.debugLine="Dim effects As List = camEx.GetSupportedColorEffe";
_effects = new anywheresoftware.b4a.objects.collections.List();
_effects = mostCurrent._camex._getsupportedcoloreffects /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=121569282;
 //BA.debugLineNum = 121569282;BA.debugLine="If effects.IsInitialized = False Then";
if (_effects.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=121569283;
 //BA.debugLineNum = 121569283;BA.debugLine="ToastMessageShow(\"Efeitos não suportados.\", Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Efeitos não suportados."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121569284;
 //BA.debugLineNum = 121569284;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=121569286;
 //BA.debugLineNum = 121569286;BA.debugLine="Dim effect As String = effects.Get((effects.Index";
_effect = BA.ObjectToString(_effects.Get((int) ((_effects.IndexOf((Object)(mostCurrent._camex._getcoloreffect /*String*/ (null)))+1)%_effects.getSize())));
RDebugUtils.currentLine=121569287;
 //BA.debugLineNum = 121569287;BA.debugLine="camEx.SetColorEffect(effect)";
mostCurrent._camex._setcoloreffect /*String*/ (null,_effect);
RDebugUtils.currentLine=121569288;
 //BA.debugLineNum = 121569288;BA.debugLine="ToastMessageShow(effect, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_effect),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121569289;
 //BA.debugLineNum = 121569289;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=121569290;
 //BA.debugLineNum = 121569290;BA.debugLine="End Sub";
return "";
}
public static String  _btnflash_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnflash_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnflash_click", null));}
float[] _f = null;
anywheresoftware.b4a.objects.collections.List _flashmodes = null;
String _flash = "";
RDebugUtils.currentLine=121634816;
 //BA.debugLineNum = 121634816;BA.debugLine="Sub btnFlash_Click";
RDebugUtils.currentLine=121634817;
 //BA.debugLineNum = 121634817;BA.debugLine="Dim f() As Float = camEx.GetFocusDistances";
_f = mostCurrent._camex._getfocusdistances /*float[]*/ (null);
RDebugUtils.currentLine=121634818;
 //BA.debugLineNum = 121634818;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("6121634818",BA.NumberToString(_f[(int) (0)])+", "+BA.NumberToString(_f[(int) (1)])+", "+BA.NumberToString(_f[(int) (2)]),0);
RDebugUtils.currentLine=121634819;
 //BA.debugLineNum = 121634819;BA.debugLine="Dim flashModes As List = camEx.GetSupportedFlashM";
_flashmodes = new anywheresoftware.b4a.objects.collections.List();
_flashmodes = mostCurrent._camex._getsupportedflashmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=121634820;
 //BA.debugLineNum = 121634820;BA.debugLine="If flashModes.IsInitialized = False Then";
if (_flashmodes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=121634821;
 //BA.debugLineNum = 121634821;BA.debugLine="ToastMessageShow(\"Flash não suportado.\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Flash não suportado."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121634822;
 //BA.debugLineNum = 121634822;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=121634824;
 //BA.debugLineNum = 121634824;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
_flash = BA.ObjectToString(_flashmodes.Get((int) ((_flashmodes.IndexOf((Object)(mostCurrent._camex._getflashmode /*String*/ (null)))+1)%_flashmodes.getSize())));
RDebugUtils.currentLine=121634825;
 //BA.debugLineNum = 121634825;BA.debugLine="camEx.SetFlashMode(flash)";
mostCurrent._camex._setflashmode /*String*/ (null,_flash);
RDebugUtils.currentLine=121634826;
 //BA.debugLineNum = 121634826;BA.debugLine="ToastMessageShow(flash, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_flash),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121634827;
 //BA.debugLineNum = 121634827;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=121634828;
 //BA.debugLineNum = 121634828;BA.debugLine="End Sub";
return "";
}
public static String  _btnfocus_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfocus_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfocus_click", null));}
RDebugUtils.currentLine=120913920;
 //BA.debugLineNum = 120913920;BA.debugLine="Sub btnFocus_Click";
RDebugUtils.currentLine=120913921;
 //BA.debugLineNum = 120913921;BA.debugLine="camEx.FocusAndTakePicture";
mostCurrent._camex._focusandtakepicture /*String*/ (null);
RDebugUtils.currentLine=120913922;
 //BA.debugLineNum = 120913922;BA.debugLine="End Sub";
return "";
}
public static String  _btnpicturesize_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpicturesize_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpicturesize_click", null));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize[] _picturesizes = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _current = null;
int _i = 0;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _ps = null;
RDebugUtils.currentLine=121700352;
 //BA.debugLineNum = 121700352;BA.debugLine="Sub btnPictureSize_Click";
RDebugUtils.currentLine=121700353;
 //BA.debugLineNum = 121700353;BA.debugLine="Dim pictureSizes() As CameraSize = camEx.GetSuppo";
_picturesizes = mostCurrent._camex._getsupportedpicturessizes /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]*/ (null);
RDebugUtils.currentLine=121700354;
 //BA.debugLineNum = 121700354;BA.debugLine="Dim current As CameraSize = camEx.GetPictureSize";
_current = mostCurrent._camex._getpicturesize /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=121700355;
 //BA.debugLineNum = 121700355;BA.debugLine="For i = 0 To pictureSizes.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_picturesizes.length /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=121700356;
 //BA.debugLineNum = 121700356;BA.debugLine="If pictureSizes(i).Width = current.Width And pic";
if (_picturesizes[_i].Width /*int*/ ==_current.Width /*int*/  && _picturesizes[_i].Height /*int*/ ==_current.Height /*int*/ ) { 
if (true) break;};
 }
};
RDebugUtils.currentLine=121700358;
 //BA.debugLineNum = 121700358;BA.debugLine="Dim ps As CameraSize = pictureSizes((i + 1) Mod p";
_ps = _picturesizes[(int) ((_i+1)%_picturesizes.length /*int*/ )];
RDebugUtils.currentLine=121700359;
 //BA.debugLineNum = 121700359;BA.debugLine="camEx.SetPictureSize(ps.Width, ps.Height)";
mostCurrent._camex._setpicturesize /*String*/ (null,_ps.Width /*int*/ ,_ps.Height /*int*/ );
RDebugUtils.currentLine=121700360;
 //BA.debugLineNum = 121700360;BA.debugLine="ToastMessageShow(ps.Width & \"x\" & ps.Height, Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(BA.NumberToString(_ps.Width /*int*/ )+"x"+BA.NumberToString(_ps.Height /*int*/ )),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121700361;
 //BA.debugLineNum = 121700361;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=121700362;
 //BA.debugLineNum = 121700362;BA.debugLine="End Sub";
return "";
}
public static String  _btntakepicture_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btntakepicture_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btntakepicture_click", null));}
RDebugUtils.currentLine=120848384;
 //BA.debugLineNum = 120848384;BA.debugLine="Sub btnTakePicture_Click";
RDebugUtils.currentLine=120848385;
 //BA.debugLineNum = 120848385;BA.debugLine="Try";
try {RDebugUtils.currentLine=120848386;
 //BA.debugLineNum = 120848386;BA.debugLine="camEx.TakePicture";
mostCurrent._camex._takepicture /*String*/ (null);
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=120848388;
 //BA.debugLineNum = 120848388;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6120848388",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=120848391;
 //BA.debugLineNum = 120848391;BA.debugLine="End Sub";
return "";
}
public static String  _butcancelpicture_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcancelpicture_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcancelpicture_click", null));}
RDebugUtils.currentLine=122159104;
 //BA.debugLineNum = 122159104;BA.debugLine="Sub butCancelPicture_Click";
RDebugUtils.currentLine=122159105;
 //BA.debugLineNum = 122159105;BA.debugLine="showPictureImage.SetBackgroundImage(Null)";
mostCurrent._showpictureimage.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=122159106;
 //BA.debugLineNum = 122159106;BA.debugLine="showPicturePanel.Visible = False";
mostCurrent._showpicturepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=122159107;
 //BA.debugLineNum = 122159107;BA.debugLine="butCloseCamera.Enabled = Not(showPicturePanel.Vis";
mostCurrent._butclosecamera.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=122159108;
 //BA.debugLineNum = 122159108;BA.debugLine="btnTakePicture.Enabled = Not(showPicturePanel.Vis";
mostCurrent._btntakepicture.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=122159109;
 //BA.debugLineNum = 122159109;BA.debugLine="End Sub";
return "";
}
public static String  _butclosecamera_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butclosecamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butclosecamera_click", null));}
boolean _docontinue = false;
RDebugUtils.currentLine=122224640;
 //BA.debugLineNum = 122224640;BA.debugLine="Sub butCloseCamera_Click";
RDebugUtils.currentLine=122224641;
 //BA.debugLineNum = 122224641;BA.debugLine="Dim DoContinue As Boolean = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=122224642;
 //BA.debugLineNum = 122224642;BA.debugLine="If (ExitToDialog) Then";
if ((_exittodialog)) { 
RDebugUtils.currentLine=122224647;
 //BA.debugLineNum = 122224647;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
if ((_returnto instanceof xevolution.vrcg.devdemov2400.appactiondialogs)) { 
RDebugUtils.currentLine=122224648;
 //BA.debugLineNum = 122224648;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
RDebugUtils.currentLine=122224649;
 //BA.debugLineNum = 122224649;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._requests3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }else 
{RDebugUtils.currentLine=122224650;
 //BA.debugLineNum = 122224650;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
RDebugUtils.currentLine=122224651;
 //BA.debugLineNum = 122224651;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._checklist3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }}
;
 };
 }else {
RDebugUtils.currentLine=122224655;
 //BA.debugLineNum = 122224655;BA.debugLine="CallSubDelayed(MainMenu, \"ListsReturnNoAction\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturnNoAction");
 };
RDebugUtils.currentLine=122224657;
 //BA.debugLineNum = 122224657;BA.debugLine="If DoContinue Then Activity.Finish";
if (_docontinue) { 
mostCurrent._activity.Finish();};
RDebugUtils.currentLine=122224658;
 //BA.debugLineNum = 122224658;BA.debugLine="End Sub";
return "";
}
public static String  _butsavepicture_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsavepicture_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butsavepicture_click", null));}
boolean _docontinue = false;
xevolution.vrcg.devdemov2400.appactiondialogs _ma = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
anywheresoftware.b4a.objects.collections.List _apilist = null;
int _i = 0;
String _thefile = "";
String _imgb64 = "";
int _mid = 0;
String _alerttagcode = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=122093568;
 //BA.debugLineNum = 122093568;BA.debugLine="Sub butSavePicture_Click";
RDebugUtils.currentLine=122093569;
 //BA.debugLineNum = 122093569;BA.debugLine="Dim DoContinue As Boolean = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=122093570;
 //BA.debugLineNum = 122093570;BA.debugLine="If (ExitToDialog) Then";
if ((_exittodialog)) { 
RDebugUtils.currentLine=122093575;
 //BA.debugLineNum = 122093575;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
if ((_returnto instanceof xevolution.vrcg.devdemov2400.appactiondialogs)) { 
RDebugUtils.currentLine=122093576;
 //BA.debugLineNum = 122093576;BA.debugLine="Try";
try {RDebugUtils.currentLine=122093577;
 //BA.debugLineNum = 122093577;BA.debugLine="Dim ma As AppActionDialogs = ReturnTo";
_ma = (xevolution.vrcg.devdemov2400.appactiondialogs)(_returnto);
RDebugUtils.currentLine=122093578;
 //BA.debugLineNum = 122093578;BA.debugLine="ma.CameraReturn(CurrentFileName, CurrentCLAIte";
_ma._camerareturn /*void*/ (null,mostCurrent._currentfilename,mostCurrent._currentclaitem);
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=122093580;
 //BA.debugLineNum = 122093580;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6122093580",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=122093582;
 //BA.debugLineNum = 122093582;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
RDebugUtils.currentLine=122093583;
 //BA.debugLineNum = 122093583;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._requests3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }else 
{RDebugUtils.currentLine=122093584;
 //BA.debugLineNum = 122093584;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
RDebugUtils.currentLine=122093585;
 //BA.debugLineNum = 122093585;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._checklist3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }}
;
 };
 }else {
RDebugUtils.currentLine=122093589;
 //BA.debugLineNum = 122093589;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
_this = mostCurrent._currentclaitem;
RDebugUtils.currentLine=122093590;
 //BA.debugLineNum = 122093590;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=122093591;
 //BA.debugLineNum = 122093591;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=122093592;
 //BA.debugLineNum = 122093592;BA.debugLine="If (ShotFileLocation = File.DirAssets) Then Shot";
if (((_shotfilelocation).equals(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))) { 
_shotfilelocation = mostCurrent._starter._internalfolder /*String*/ ;};
RDebugUtils.currentLine=122093593;
 //BA.debugLineNum = 122093593;BA.debugLine="Dim ApiList As List";
_apilist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=122093594;
 //BA.debugLineNum = 122093594;BA.debugLine="ApiList.Initialize";
_apilist.Initialize();
RDebugUtils.currentLine=122093596;
 //BA.debugLineNum = 122093596;BA.debugLine="For i=0 To CamShots.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (_camshots.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=122093597;
 //BA.debugLineNum = 122093597;BA.debugLine="Dim theFile As String = CamShots.Get(i)";
_thefile = BA.ObjectToString(_camshots.Get(_i));
RDebugUtils.currentLine=122093598;
 //BA.debugLineNum = 122093598;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImag";
_imgb64 = _base64con._v6(mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+""));
RDebugUtils.currentLine=122093608;
 //BA.debugLineNum = 122093608;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=122093609;
 //BA.debugLineNum = 122093609;BA.debugLine="Dim alerttagcode As String = $\"${Utils.Generate";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._generatetagcode /*String*/ (mostCurrent.activityBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=122093610;
 //BA.debugLineNum = 122093610;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (";
_ssql = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"+"			origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"			values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 1, 1, 'Imagens adicionadas ao repositório por utilizar.', \n"+"			'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=122093614;
 //BA.debugLineNum = 122093614;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL,";
mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=122093618;
 //BA.debugLineNum = 122093618;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts_images","id","")+1+1000000);
RDebugUtils.currentLine=122093619;
 //BA.debugLineNum = 122093619;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts_i";
_ssql = ("insert into dta_alerts_images\n"+"				(id, tagcode, imageb64, imagename, assigned)\n"+"				values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+"', 0)");
RDebugUtils.currentLine=122093623;
 //BA.debugLineNum = 122093623;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL,";
mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=122093626;
 //BA.debugLineNum = 122093626;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=122093627;
 //BA.debugLineNum = 122093627;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=122093628;
 //BA.debugLineNum = 122093628;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=122093629;
 //BA.debugLineNum = 122093629;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=122093630;
 //BA.debugLineNum = 122093630;BA.debugLine="params.Put(\"tagcode\", alerttagcode)";
_params.Put((Object)("tagcode"),(Object)(_alerttagcode));
RDebugUtils.currentLine=122093631;
 //BA.debugLineNum = 122093631;BA.debugLine="params.Put(\"relation_type\", \"ALRTREL_TASKS\")";
_params.Put((Object)("relation_type"),(Object)("ALRTREL_TASKS"));
RDebugUtils.currentLine=122093632;
 //BA.debugLineNum = 122093632;BA.debugLine="params.Put(\"alert_type\", \"ALRTTYP_TASKS\")";
_params.Put((Object)("alert_type"),(Object)("ALRTTYP_TASKS"));
RDebugUtils.currentLine=122093633;
 //BA.debugLineNum = 122093633;BA.debugLine="params.Put(\"internal\", 1)";
_params.Put((Object)("internal"),(Object)(1));
RDebugUtils.currentLine=122093634;
 //BA.debugLineNum = 122093634;BA.debugLine="params.Put(\"origin\", 1)";
_params.Put((Object)("origin"),(Object)(1));
RDebugUtils.currentLine=122093635;
 //BA.debugLineNum = 122093635;BA.debugLine="params.Put(\"title\", \"Imagens adicionadas ao rep";
_params.Put((Object)("title"),(Object)("Imagens adicionadas ao repositório por utilizar."));
RDebugUtils.currentLine=122093636;
 //BA.debugLineNum = 122093636;BA.debugLine="params.Put(\"user_tagcode\", ShareCode.SESS_User)";
_params.Put((Object)("user_tagcode"),(Object)(mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=122093637;
 //BA.debugLineNum = 122093637;BA.debugLine="params.Put(\"date_alert\", Utils.GetCurrentDate)";
_params.Put((Object)("date_alert"),(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=122093638;
 //BA.debugLineNum = 122093638;BA.debugLine="params.Put(\"date_verification\", \"\")";
_params.Put((Object)("date_verification"),(Object)(""));
RDebugUtils.currentLine=122093639;
 //BA.debugLineNum = 122093639;BA.debugLine="params.Put(\"alert_visible\", 1)";
_params.Put((Object)("alert_visible"),(Object)(1));
RDebugUtils.currentLine=122093640;
 //BA.debugLineNum = 122093640;BA.debugLine="params.Put(\"imageb64\", ImgB64)";
_params.Put((Object)("imageb64"),(Object)(_imgb64));
RDebugUtils.currentLine=122093641;
 //BA.debugLineNum = 122093641;BA.debugLine="params.Put(\"imagename\", theFile)";
_params.Put((Object)("imagename"),(Object)(_thefile));
RDebugUtils.currentLine=122093642;
 //BA.debugLineNum = 122093642;BA.debugLine="params.Put(\"status_id\", 0)";
_params.Put((Object)("status_id"),(Object)(0));
RDebugUtils.currentLine=122093643;
 //BA.debugLineNum = 122093643;BA.debugLine="params.Put(\"kind_data\", 0)";
_params.Put((Object)("kind_data"),(Object)(0));
RDebugUtils.currentLine=122093644;
 //BA.debugLineNum = 122093644;BA.debugLine="params.Put(\"request_tagcode\", this.Request)";
_params.Put((Object)("request_tagcode"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=122093645;
 //BA.debugLineNum = 122093645;BA.debugLine="params.Put(\"action_tagcode\", this.Action)";
_params.Put((Object)("action_tagcode"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=122093646;
 //BA.debugLineNum = 122093646;BA.debugLine="params.Put(\"task_tagcode\", this.Task)";
_params.Put((Object)("task_tagcode"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=122093647;
 //BA.debugLineNum = 122093647;BA.debugLine="params.Put(\"item_tagcode\", this.Item)";
_params.Put((Object)("item_tagcode"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=122093648;
 //BA.debugLineNum = 122093648;BA.debugLine="params.Put(\"uniquekey\", this.UniqueKey)";
_params.Put((Object)("uniquekey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=122093649;
 //BA.debugLineNum = 122093649;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=122093650;
 //BA.debugLineNum = 122093650;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=122093651;
 //BA.debugLineNum = 122093651;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=122093652;
 //BA.debugLineNum = 122093652;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=122093653;
 //BA.debugLineNum = 122093653;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=122093654;
 //BA.debugLineNum = 122093654;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=122093655;
 //BA.debugLineNum = 122093655;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=122093656;
 //BA.debugLineNum = 122093656;BA.debugLine="ApiList.Add(params)";
_apilist.Add((Object)(_params.getObject()));
 }
};
RDebugUtils.currentLine=122093659;
 //BA.debugLineNum = 122093659;BA.debugLine="CallSubDelayed3(MainMenu, \"ListsReturnUpdateServ";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturnUpdateServer",(Object)(("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/alert/new")),(Object)(_apilist));
 };
RDebugUtils.currentLine=122093662;
 //BA.debugLineNum = 122093662;BA.debugLine="If DoContinue Then Activity.Finish";
if (_docontinue) { 
mostCurrent._activity.Finish();};
RDebugUtils.currentLine=122093663;
 //BA.debugLineNum = 122093663;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _bytestoimage(byte[] _bytes) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bytestoimage", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(mostCurrent.activityBA, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=121176064;
 //BA.debugLineNum = 121176064;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
RDebugUtils.currentLine=121176065;
 //BA.debugLineNum = 121176065;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=121176066;
 //BA.debugLineNum = 121176066;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=121176068;
 //BA.debugLineNum = 121176068;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=121176069;
 //BA.debugLineNum = 121176069;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=121176074;
 //BA.debugLineNum = 121176074;BA.debugLine="Return bmp";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=121176075;
 //BA.debugLineNum = 121176075;BA.debugLine="End Sub";
return null;
}
public static void  _camimage(xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "camimage", false))
	 {Debug.delegate(mostCurrent.activityBA, "camimage", new Object[] {_claitem}); return;}
ResumableSub_CamImage rsub = new ResumableSub_CamImage(null,_claitem);
rsub.resume(processBA, null);
}
public static class ResumableSub_CamImage extends BA.ResumableSub {
public ResumableSub_CamImage(xevolution.vrcg.devdemov2400.cameraactivity parent,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) {
this.parent = parent;
this._claitem = _claitem;
}
xevolution.vrcg.devdemov2400.cameraactivity parent;
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem;
com.simplysoftware.base64convert.base64convert _base64con = null;
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=121962497;
 //BA.debugLineNum = 121962497;BA.debugLine="If CLAItem.Origin = 4 Then";
if (true) break;

case 1:
//if
this.state = 28;
if (_claitem.Origin /*int*/ ==4) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=121962498;
 //BA.debugLineNum = 121962498;BA.debugLine="CurrentCLAItem.Origin = LastOrigin";
parent.mostCurrent._currentclaitem.Origin /*int*/  = parent._lastorigin;
RDebugUtils.currentLine=121962499;
 //BA.debugLineNum = 121962499;BA.debugLine="If (ExitToDialog) Then";
if (true) break;

case 4:
//if
this.state = 27;
if ((parent._exittodialog)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=121962500;
 //BA.debugLineNum = 121962500;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
if (true) break;

case 7:
//if
this.state = 26;
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=121962502;
 //BA.debugLineNum = 121962502;BA.debugLine="else If (CurrentCLAItem.Origin = 2) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=121962504;
 //BA.debugLineNum = 121962504;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=121962501;
 //BA.debugLineNum = 121962501;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._user.getObject()),"CallMOREActionsAgain",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 11:
//C
this.state = 26;
RDebugUtils.currentLine=121962503;
 //BA.debugLineNum = 121962503;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._requests3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=121962506;
 //BA.debugLineNum = 121962506;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=121962507;
 //BA.debugLineNum = 121962507;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=121962508;
 //BA.debugLineNum = 121962508;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = _base64con._v6(parent._shotfilelocation,parent.mostCurrent._currentfilename);
RDebugUtils.currentLine=121962515;
 //BA.debugLineNum = 121962515;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=121962516;
 //BA.debugLineNum = 121962516;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values_images \n"+"					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report, \n"+"						repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"					values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Tagcode /*String*/ ))+"',\n"+"					'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._currentfilename))+"', 1, \n"+"					"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.RepeatItemCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.repeatfieldcounter /*int*/ ))+")");
RDebugUtils.currentLine=121962522;
 //BA.debugLineNum = 121962522;BA.debugLine="Utils.SaveSQLToLog(\"CamImage\",sSQL, CLAItem.Re";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CamImage",_ssql,_claitem.Request /*String*/ );
RDebugUtils.currentLine=121962526;
 //BA.debugLineNum = 121962526;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=121962527;
 //BA.debugLineNum = 121962527;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=121962528;
 //BA.debugLineNum = 121962528;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=121962530;
 //BA.debugLineNum = 121962530;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=121962531;
 //BA.debugLineNum = 121962531;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=121962532;
 //BA.debugLineNum = 121962532;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=121962533;
 //BA.debugLineNum = 121962533;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=121962534;
 //BA.debugLineNum = 121962534;BA.debugLine="params.Put(\"ACLARequest\", CLAItem.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_claitem.Request /*String*/ ));
RDebugUtils.currentLine=121962535;
 //BA.debugLineNum = 121962535;BA.debugLine="params.Put(\"ACLAAction\", CLAItem.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_claitem.Action /*String*/ ));
RDebugUtils.currentLine=121962536;
 //BA.debugLineNum = 121962536;BA.debugLine="params.Put(\"ACLATask\", CLAItem.Task)";
_params.Put((Object)("ACLATask"),(Object)(_claitem.Task /*String*/ ));
RDebugUtils.currentLine=121962537;
 //BA.debugLineNum = 121962537;BA.debugLine="params.Put(\"ACLAItem\", CLAItem.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_claitem.Item /*String*/ ));
RDebugUtils.currentLine=121962538;
 //BA.debugLineNum = 121962538;BA.debugLine="params.Put(\"ACLAUniqueKey\", CLAItem.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_claitem.UniqueKey /*String*/ ));
RDebugUtils.currentLine=121962539;
 //BA.debugLineNum = 121962539;BA.debugLine="params.Put(\"ACLATagcode\", CLAItem.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_claitem.Tagcode /*String*/ ));
RDebugUtils.currentLine=121962540;
 //BA.debugLineNum = 121962540;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=121962541;
 //BA.debugLineNum = 121962541;BA.debugLine="params.Put(\"ACLAValueFileImage\", CurrentFileNa";
_params.Put((Object)("ACLAValueFileImage"),(Object)(parent.mostCurrent._currentfilename));
RDebugUtils.currentLine=121962542;
 //BA.debugLineNum = 121962542;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=121962543;
 //BA.debugLineNum = 121962543;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=121962544;
 //BA.debugLineNum = 121962544;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=121962545;
 //BA.debugLineNum = 121962545;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=121962546;
 //BA.debugLineNum = 121962546;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=121962547;
 //BA.debugLineNum = 121962547;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=121962548;
 //BA.debugLineNum = 121962548;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=121962549;
 //BA.debugLineNum = 121962549;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=121962550;
 //BA.debugLineNum = 121962550;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=121962551;
 //BA.debugLineNum = 121962551;BA.debugLine="Try";
if (true) break;

case 14:
//try
this.state = 19;
this.catchState = 18;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 19;
this.catchState = 18;
RDebugUtils.currentLine=121962552;
 //BA.debugLineNum = 121962552;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=121962553;
 //BA.debugLineNum = 121962553;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
RDebugUtils.currentLine=121962555;
 //BA.debugLineNum = 121962555;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=121962556;
 //BA.debugLineNum = 121962556;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=121962557;
 //BA.debugLineNum = 121962557;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6121962557",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
RDebugUtils.currentLine=121962561;
 //BA.debugLineNum = 121962561;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=121962562;
 //BA.debugLineNum = 121962562;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 20:
//if
this.state = 25;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=121962563;
 //BA.debugLineNum = 121962563;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLAItem";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,cameraactivity.getObject(),_url,"",_claitem.Request /*String*/ );
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=121962565;
 //BA.debugLineNum = 121962565;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=121962566;
 //BA.debugLineNum = 121962566;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=121962568;
 //BA.debugLineNum = 121962568;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity", "camimage"),(int) (250));
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
RDebugUtils.currentLine=121962570;
 //BA.debugLineNum = 121962570;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=121962572;
 //BA.debugLineNum = 121962572;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=121962575;
 //BA.debugLineNum = 121962575;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
processBA.setLastException(e0);}
            }
        }
    }
}
public static String  _campanel_picturetaken(byte[] _data) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "campanel_picturetaken", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "campanel_picturetaken", new Object[] {_data}));}
String _datename = "";
String _datetimename = "";
String _filename = "";
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cmes = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _cvsrect = null;
String _la = "";
String _lo = "";
String _ssql = "";
String _stamp = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drect = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bc1 = null;
RDebugUtils.currentLine=121241600;
 //BA.debugLineNum = 121241600;BA.debugLine="Sub camPanel_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=121241601;
 //BA.debugLineNum = 121241601;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
_datename = mostCurrent._utils._makefilename /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=121241602;
 //BA.debugLineNum = 121241602;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
_datetimename = mostCurrent._utils._makedatetimeslash2 /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=121241604;
 //BA.debugLineNum = 121241604;BA.debugLine="CurrentFileName = $\"IMG-${DateName}-${Counter}\"$";
mostCurrent._currentfilename = ("IMG-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datename))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_counter))+"");
RDebugUtils.currentLine=121241605;
 //BA.debugLineNum = 121241605;BA.debugLine="Dim filename As String = $\"${CurrentFileName}.png";
_filename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._currentfilename))+".png");
RDebugUtils.currentLine=121241606;
 //BA.debugLineNum = 121241606;BA.debugLine="If LastFileName = \"\" Then";
if ((_lastfilename).equals("")) { 
RDebugUtils.currentLine=121241607;
 //BA.debugLineNum = 121241607;BA.debugLine="LastFileName = filename";
_lastfilename = _filename;
 };
RDebugUtils.currentLine=121241610;
 //BA.debugLineNum = 121241610;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
_shotfilelocation = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=121241612;
 //BA.debugLineNum = 121241612;BA.debugLine="If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW";
if (mostCurrent._starter._params /*xevolution.vrcg.devdemov2400.configparameters*/ ._cfg_take_picture_always_as_new /*int*/ ==0) { 
RDebugUtils.currentLine=121241613;
 //BA.debugLineNum = 121241613;BA.debugLine="filename = LastFileName";
_filename = _lastfilename;
 };
RDebugUtils.currentLine=121241618;
 //BA.debugLineNum = 121241618;BA.debugLine="ShotFileName = filename";
_shotfilename = _filename;
RDebugUtils.currentLine=121241619;
 //BA.debugLineNum = 121241619;BA.debugLine="Dim cmes As CameraSize = camEx.GetPictureSize";
_cmes = mostCurrent._camex._getpicturesize /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=121241620;
 //BA.debugLineNum = 121241620;BA.debugLine="camEx.SavePictureToFile(Data, ShotFileLocation, S";
mostCurrent._camex._savepicturetofile /*String*/ (null,_data,_shotfilelocation,_shotfilename);
RDebugUtils.currentLine=121241625;
 //BA.debugLineNum = 121241625;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultFont(ShareC";
_fnt = _xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=121241626;
 //BA.debugLineNum = 121241626;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, c";
_cvs = _createcanvas(_cmes.Width /*int*/ ,_cmes.Height /*int*/ );
RDebugUtils.currentLine=121241628;
 //BA.debugLineNum = 121241628;BA.debugLine="Dim cvsRect As B4XRect";
_cvsrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=121241629;
 //BA.debugLineNum = 121241629;BA.debugLine="cvsRect.Initialize(0,0,cmes.Width, cmes.Height)";
_cvsrect.Initialize((float) (0),(float) (0),(float) (_cmes.Width /*int*/ ),(float) (_cmes.Height /*int*/ ));
RDebugUtils.currentLine=121241630;
 //BA.debugLineNum = 121241630;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, S";
_cvs.DrawBitmap((android.graphics.Bitmap)(_xui.LoadBitmap(_shotfilelocation,_shotfilename).getObject()),_cvsrect);
RDebugUtils.currentLine=121241631;
 //BA.debugLineNum = 121241631;BA.debugLine="Dim la As String = LocationService.GeoLocal.lat";
_la = mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ;
RDebugUtils.currentLine=121241632;
 //BA.debugLineNum = 121241632;BA.debugLine="Dim lo As String = LocationService.GeoLocal.lon";
_lo = mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ;
RDebugUtils.currentLine=121241633;
 //BA.debugLineNum = 121241633;BA.debugLine="DateTimeName = $\"${DateTimeName}  -  ${la}/${lo}\"";
_datetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimename))+"  -  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_la))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lo))+"");
RDebugUtils.currentLine=121241634;
 //BA.debugLineNum = 121241634;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"printcri";
if (((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("printcriativa"))) { 
RDebugUtils.currentLine=121241635;
 //BA.debugLineNum = 121241635;BA.debugLine="Dim sSQL As String = $\"select ' - '||c.title_imp";
_ssql = ("select ' - '||c.title_import||' - '||d.title_import as stampname\n"+"								from dta_requests as a\n"+"								LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)\n"+"								LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)\n"+"								where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._currentclaitem.Request /*String*/ .trim()))+"'");
RDebugUtils.currentLine=121241640;
 //BA.debugLineNum = 121241640;BA.debugLine="Dim stamp As String = DBStructures.GetScriptColu";
_stamp = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,_ssql,"stampname");
RDebugUtils.currentLine=121241641;
 //BA.debugLineNum = 121241641;BA.debugLine="DateTimeName = $\"${stamp}\"$";
_datetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stamp))+"");
 };
RDebugUtils.currentLine=121241645;
 //BA.debugLineNum = 121241645;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
_f = _xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=121241646;
 //BA.debugLineNum = 121241646;BA.debugLine="Dim dRect As B4XRect";
_drect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=121241647;
 //BA.debugLineNum = 121241647;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
_drect.Initialize((float) (_cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18))),(float) (_cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (350))),_cvs.getTargetRect().getHeight());
RDebugUtils.currentLine=121241648;
 //BA.debugLineNum = 121241648;BA.debugLine="DrawTextWithBorder2(cvs, DateTimeName, f, Consts.";
_drawtextwithborder2(_cvs,_datetimename,_f,mostCurrent._consts._colordarkgray /*int*/ ,(int) ((_drect.getLeft()+_drect.getRight())/(double)2),(int) ((_drect.getTop()+_drect.getBottom())/(double)2),(int) (1),(int) (0));
RDebugUtils.currentLine=121241650;
 //BA.debugLineNum = 121241650;BA.debugLine="Log($\"${ShareCode.DEVICE_DEF_QUALITY}, ${ShareCod";
anywheresoftware.b4a.keywords.Common.LogImpl("6121241650",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._device_def_quality /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._device_def_img_filetype /*String*/ ))+""),0);
RDebugUtils.currentLine=121241652;
 //BA.debugLineNum = 121241652;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=121241655;
 //BA.debugLineNum = 121241655;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_shotfilelocation,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_shotfilename))+""),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=121241656;
 //BA.debugLineNum = 121241656;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
_cvs.CreateBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=121241657;
 //BA.debugLineNum = 121241657;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=121241658;
 //BA.debugLineNum = 121241658;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=121241661;
 //BA.debugLineNum = 121241661;BA.debugLine="Dim bc1 As B4XBitmap =  xui.LoadBitmapResize(Shot";
_bc1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bc1 = _xui.LoadBitmapResize(_shotfilelocation,_shotfilename,mostCurrent._showpictureimage.getWidth(),mostCurrent._showpictureimage.getHeight(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=121241662;
 //BA.debugLineNum = 121241662;BA.debugLine="showPictureImage.SetBackgroundImage(bc1)";
mostCurrent._showpictureimage.SetBackgroundImageNew((android.graphics.Bitmap)(_bc1.getObject()));
RDebugUtils.currentLine=121241663;
 //BA.debugLineNum = 121241663;BA.debugLine="showPicturePanel.Visible = True";
mostCurrent._showpicturepanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=121241664;
 //BA.debugLineNum = 121241664;BA.debugLine="butCloseCamera.Enabled = Not(showPicturePanel.Vis";
mostCurrent._butclosecamera.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=121241665;
 //BA.debugLineNum = 121241665;BA.debugLine="btnTakePicture.Enabled = Not(showPicturePanel.Vis";
mostCurrent._btntakepicture.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=121241668;
 //BA.debugLineNum = 121241668;BA.debugLine="CamShots.Add(ShotFileName)";
_camshots.Add((Object)(_shotfilename));
RDebugUtils.currentLine=121241670;
 //BA.debugLineNum = 121241670;BA.debugLine="If StayOnCamera Then";
if (_stayoncamera) { 
RDebugUtils.currentLine=121241671;
 //BA.debugLineNum = 121241671;BA.debugLine="camEx.StartPreview 'restart preview";
mostCurrent._camex._startpreview /*String*/ (null);
RDebugUtils.currentLine=121241672;
 //BA.debugLineNum = 121241672;BA.debugLine="Counter = Counter + 1";
_counter = (int) (_counter+1);
 }else {
 };
RDebugUtils.currentLine=121241675;
 //BA.debugLineNum = 121241675;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XCanvas  _createcanvas(int _width,int _height) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcanvas", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(mostCurrent.activityBA, "createcanvas", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
RDebugUtils.currentLine=121044992;
 //BA.debugLineNum = 121044992;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
RDebugUtils.currentLine=121044993;
 //BA.debugLineNum = 121044993;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=121044994;
 //BA.debugLineNum = 121044994;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=121044995;
 //BA.debugLineNum = 121044995;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=121044996;
 //BA.debugLineNum = 121044996;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=121044997;
 //BA.debugLineNum = 121044997;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=121044998;
 //BA.debugLineNum = 121044998;BA.debugLine="End Sub";
return null;
}
public static String  _drawtextwithborder2(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder2", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _ro = null;
RDebugUtils.currentLine=121372672;
 //BA.debugLineNum = 121372672;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
RDebugUtils.currentLine=121372674;
 //BA.debugLineNum = 121372674;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=121372675;
 //BA.debugLineNum = 121372675;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=121372676;
 //BA.debugLineNum = 121372676;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=121372678;
 //BA.debugLineNum = 121372678;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=121372680;
 //BA.debugLineNum = 121372680;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=121372681;
 //BA.debugLineNum = 121372681;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=121372682;
 //BA.debugLineNum = 121372682;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=121372684;
 //BA.debugLineNum = 121372684;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=121372685;
 //BA.debugLineNum = 121372685;BA.debugLine="Dim ro As B4XRect";
_ro = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=121372686;
 //BA.debugLineNum = 121372686;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
_ro.Initialize((float) (_r.getLeft()-_border),(float) (_r.getTop()-_border),(float) (_r.getRight()+_border),(float) (_r.getBottom()+_border));
RDebugUtils.currentLine=121372687;
 //BA.debugLineNum = 121372687;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
_cvs1.DrawRect(_ro,_clr,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
RDebugUtils.currentLine=121372688;
 //BA.debugLineNum = 121372688;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
 };
RDebugUtils.currentLine=121372691;
 //BA.debugLineNum = 121372691;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=121372692;
 //BA.debugLineNum = 121372692;BA.debugLine="End Sub";
return "";
}
public static String  _campanel_ready(boolean _success) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "campanel_ready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "campanel_ready", new Object[] {_success}));}
RDebugUtils.currentLine=120717312;
 //BA.debugLineNum = 120717312;BA.debugLine="Sub camPanel_Ready (Success As Boolean)";
RDebugUtils.currentLine=120717313;
 //BA.debugLineNum = 120717313;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=120717314;
 //BA.debugLineNum = 120717314;BA.debugLine="camEx.SetJpegQuality(ShareCode.DEVICE_DEF_QUALIT";
mostCurrent._camex._setjpegquality /*String*/ (null,mostCurrent._sharecode._device_def_quality /*int*/ );
RDebugUtils.currentLine=120717316;
 //BA.debugLineNum = 120717316;BA.debugLine="camEx.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WI";
mostCurrent._camex._setpicturesize /*String*/ (null,mostCurrent._sharecode._device_def_img_width /*int*/ ,mostCurrent._sharecode._device_def_img_height /*int*/ );
RDebugUtils.currentLine=120717317;
 //BA.debugLineNum = 120717317;BA.debugLine="camEx.SetContinuousAutoFocus";
mostCurrent._camex._setcontinuousautofocus /*String*/ (null);
RDebugUtils.currentLine=120717318;
 //BA.debugLineNum = 120717318;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=120717319;
 //BA.debugLineNum = 120717319;BA.debugLine="camEx.StartPreview";
mostCurrent._camex._startpreview /*String*/ (null);
 }else {
RDebugUtils.currentLine=120717321;
 //BA.debugLineNum = 120717321;BA.debugLine="ToastMessageShow(\"Não é possível abrir a camera.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Não é possível abrir a camera."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=120717323;
 //BA.debugLineNum = 120717323;BA.debugLine="End Sub";
return "";
}
public static String  _camzoom_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "camzoom_valuechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "camzoom_valuechanged", new Object[] {_value,_userchanged}));}
RDebugUtils.currentLine=121765888;
 //BA.debugLineNum = 121765888;BA.debugLine="Sub camZoom_ValueChanged (Value As Int, UserChange";
RDebugUtils.currentLine=121765889;
 //BA.debugLineNum = 121765889;BA.debugLine="If UserChanged = False Or camEx.IsZoomSupported =";
if (_userchanged==anywheresoftware.b4a.keywords.Common.False || mostCurrent._camex._iszoomsupported /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=121765890;
 //BA.debugLineNum = 121765890;BA.debugLine="camEx.Zoom = Value / 100 * camEx.GetMaxZoom";
mostCurrent._camex._setzoom /*int*/ (null,(int) (_value/(double)100*mostCurrent._camex._getmaxzoom /*int*/ (null)));
RDebugUtils.currentLine=121765891;
 //BA.debugLineNum = 121765891;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=121765892;
 //BA.debugLineNum = 121765892;BA.debugLine="End Sub";
return "";
}
public static String  _changecamera_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changecamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changecamera_click", null));}
RDebugUtils.currentLine=121503744;
 //BA.debugLineNum = 121503744;BA.debugLine="Sub ChangeCamera_Click";
RDebugUtils.currentLine=121503745;
 //BA.debugLineNum = 121503745;BA.debugLine="If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then";
if (mostCurrent._starter._params /*xevolution.vrcg.devdemov2400.configparameters*/ ._cfg_allow_front_camera /*int*/ ==1) { 
RDebugUtils.currentLine=121503746;
 //BA.debugLineNum = 121503746;BA.debugLine="camEx.Release";
mostCurrent._camex._release /*String*/ (null);
RDebugUtils.currentLine=121503747;
 //BA.debugLineNum = 121503747;BA.debugLine="frontCamera = Not(frontCamera)";
_frontcamera = anywheresoftware.b4a.keywords.Common.Not(_frontcamera);
RDebugUtils.currentLine=121503748;
 //BA.debugLineNum = 121503748;BA.debugLine="InitializeCamera";
_initializecamera();
 }else {
RDebugUtils.currentLine=121503750;
 //BA.debugLineNum = 121503750;BA.debugLine="ToastMessageShow(\"Apenas a camera traseira está";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Apenas a camera traseira está activa."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=121503752;
 //BA.debugLineNum = 121503752;BA.debugLine="End Sub";
return "";
}
public static String  _initializecamera() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "initializecamera", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "initializecamera", null));}
RDebugUtils.currentLine=120651776;
 //BA.debugLineNum = 120651776;BA.debugLine="Private Sub InitializeCamera";
RDebugUtils.currentLine=120651777;
 //BA.debugLineNum = 120651777;BA.debugLine="Try";
try {RDebugUtils.currentLine=120651778;
 //BA.debugLineNum = 120651778;BA.debugLine="If (Starter.APP_CAMERA_ACCESS) Then";
if ((mostCurrent._starter._app_camera_access /*boolean*/ )) { 
RDebugUtils.currentLine=120651779;
 //BA.debugLineNum = 120651779;BA.debugLine="camEx.Initialize(camPanel, frontCamera, Me, \"ca";
mostCurrent._camex._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._campanel,_frontcamera,cameraactivity.getObject(),"camPanel");
RDebugUtils.currentLine=120651780;
 //BA.debugLineNum = 120651780;BA.debugLine="frontCamera = camEx.Front";
_frontcamera = mostCurrent._camex._front /*boolean*/ ;
 }else {
RDebugUtils.currentLine=120651782;
 //BA.debugLineNum = 120651782;BA.debugLine="ToastMessageShow(\"Sem Permissão!!!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sem Permissão!!!"),anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=120651785;
 //BA.debugLineNum = 120651785;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("6120651785",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 };
RDebugUtils.currentLine=120651795;
 //BA.debugLineNum = 120651795;BA.debugLine="End Sub";
return "";
}
public static Object  _createfileprovideruri(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createfileprovideruri", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "createfileprovideruri", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.object.JavaObject _fileprovider1 = null;
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _f = null;
RDebugUtils.currentLine=121831424;
 //BA.debugLineNum = 121831424;BA.debugLine="Sub CreateFileProviderUri (Dir As String, FileName";
RDebugUtils.currentLine=121831425;
 //BA.debugLineNum = 121831425;BA.debugLine="Dim FileProvider1 As JavaObject";
_fileprovider1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121831426;
 //BA.debugLineNum = 121831426;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121831427;
 //BA.debugLineNum = 121831427;BA.debugLine="context.InitializeContext";
_context.InitializeContext(processBA);
RDebugUtils.currentLine=121831428;
 //BA.debugLineNum = 121831428;BA.debugLine="FileProvider1.InitializeStatic(\"android.support.v";
_fileprovider1.InitializeStatic("androidx.core.content.FileProvider");
RDebugUtils.currentLine=121831429;
 //BA.debugLineNum = 121831429;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121831430;
 //BA.debugLineNum = 121831430;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Dir";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(_dir),(Object)(_filename)});
RDebugUtils.currentLine=121831431;
 //BA.debugLineNum = 121831431;BA.debugLine="Return FileProvider1.RunMethod(\"getUriForFile\", A";
if (true) return _fileprovider1.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
RDebugUtils.currentLine=121831432;
 //BA.debugLineNum = 121831432;BA.debugLine="End Sub";
return null;
}
public static String  _drawtextwithborder(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=121307136;
 //BA.debugLineNum = 121307136;BA.debugLine="Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As";
RDebugUtils.currentLine=121307138;
 //BA.debugLineNum = 121307138;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=121307139;
 //BA.debugLineNum = 121307139;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
_baseline = (int) (_centery-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=121307140;
 //BA.debugLineNum = 121307140;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=121307143;
 //BA.debugLineNum = 121307143;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=121307144;
 //BA.debugLineNum = 121307144;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=121307145;
 //BA.debugLineNum = 121307145;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=121307147;
 //BA.debugLineNum = 121307147;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=121307148;
 //BA.debugLineNum = 121307148;BA.debugLine="cvs1.DrawRect(r, Clr, False, border)";
_cvs1.DrawRect(_r,_clr,anywheresoftware.b4a.keywords.Common.False,(float) (_border));
 };
RDebugUtils.currentLine=121307150;
 //BA.debugLineNum = 121307150;BA.debugLine="End Sub";
return "";
}
public static String  _drawtextwithborder2phone(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder2phone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder2phone", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _ro = null;
RDebugUtils.currentLine=121438208;
 //BA.debugLineNum = 121438208;BA.debugLine="Sub DrawTextWithBorder2Phone (cvs1 As B4XCanvas, T";
RDebugUtils.currentLine=121438210;
 //BA.debugLineNum = 121438210;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=121438211;
 //BA.debugLineNum = 121438211;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=121438212;
 //BA.debugLineNum = 121438212;BA.debugLine="r.Width = r.Width + (r.Width /2) + 50dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))));
RDebugUtils.currentLine=121438214;
 //BA.debugLineNum = 121438214;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=121438216;
 //BA.debugLineNum = 121438216;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=121438217;
 //BA.debugLineNum = 121438217;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=121438218;
 //BA.debugLineNum = 121438218;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=121438220;
 //BA.debugLineNum = 121438220;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=121438221;
 //BA.debugLineNum = 121438221;BA.debugLine="Dim ro As B4XRect";
_ro = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=121438222;
 //BA.debugLineNum = 121438222;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
_ro.Initialize((float) (_r.getLeft()-_border),(float) (_r.getTop()-_border),(float) (_r.getRight()+_border),(float) (_r.getBottom()+_border));
RDebugUtils.currentLine=121438223;
 //BA.debugLineNum = 121438223;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
_cvs1.DrawRect(_ro,_clr,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
RDebugUtils.currentLine=121438224;
 //BA.debugLineNum = 121438224;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
 };
RDebugUtils.currentLine=121438227;
 //BA.debugLineNum = 121438227;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=121438228;
 //BA.debugLineNum = 121438228;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.cameraexclass._camerasize  _getcamsize(int _width,int _height) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getcamsize", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize) Debug.delegate(mostCurrent.activityBA, "getcamsize", new Object[] {_width,_height}));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _ret = null;
RDebugUtils.currentLine=120979456;
 //BA.debugLineNum = 120979456;BA.debugLine="Sub getCamsize(Width As Int, Height As Int) As Cam";
RDebugUtils.currentLine=120979457;
 //BA.debugLineNum = 120979457;BA.debugLine="Dim ret As CameraSize";
_ret = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=120979458;
 //BA.debugLineNum = 120979458;BA.debugLine="ret.initialize";
_ret.Initialize();
RDebugUtils.currentLine=120979459;
 //BA.debugLineNum = 120979459;BA.debugLine="ret.Width = Width";
_ret.Width /*int*/  = _width;
RDebugUtils.currentLine=120979460;
 //BA.debugLineNum = 120979460;BA.debugLine="ret.Height = Height";
_ret.Height /*int*/  = _height;
RDebugUtils.currentLine=120979461;
 //BA.debugLineNum = 120979461;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=120979462;
 //BA.debugLineNum = 120979462;BA.debugLine="End Sub";
return null;
}
public static byte[]  _imagetobytes(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _image) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagetobytes", false))
	 {return ((byte[]) Debug.delegate(mostCurrent.activityBA, "imagetobytes", new Object[] {_image}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=121110528;
 //BA.debugLineNum = 121110528;BA.debugLine="Public Sub ImageToBytes(Image As B4XBitmap) As Byt";
RDebugUtils.currentLine=121110529;
 //BA.debugLineNum = 121110529;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=121110530;
 //BA.debugLineNum = 121110530;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=121110531;
 //BA.debugLineNum = 121110531;BA.debugLine="Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUA";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=121110532;
 //BA.debugLineNum = 121110532;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=121110533;
 //BA.debugLineNum = 121110533;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=121110534;
 //BA.debugLineNum = 121110534;BA.debugLine="End Sub";
return null;
}
public static String  _setminimumsize() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setminimumsize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setminimumsize", null));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _mincs = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=120782848;
 //BA.debugLineNum = 120782848;BA.debugLine="Private Sub SetMinimumSize";
RDebugUtils.currentLine=120782849;
 //BA.debugLineNum = 120782849;BA.debugLine="Dim minCS As CameraSize";
_mincs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=120782850;
 //BA.debugLineNum = 120782850;BA.debugLine="For Each cs As CameraSize In camEx.GetSupportedPi";
{
final xevolution.vrcg.devdemov2400.cameraexclass._camerasize[] group2 = mostCurrent._camex._getsupportedpicturessizes /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]*/ (null);
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cs = group2[index2];
RDebugUtils.currentLine=120782851;
 //BA.debugLineNum = 120782851;BA.debugLine="If minCS.Width = 0 Then";
if (_mincs.Width /*int*/ ==0) { 
RDebugUtils.currentLine=120782852;
 //BA.debugLineNum = 120782852;BA.debugLine="minCS = cs";
_mincs = _cs;
 }else {
RDebugUtils.currentLine=120782854;
 //BA.debugLineNum = 120782854;BA.debugLine="If Power(minCS.Width, 2) + Power(minCS.Height,";
if (anywheresoftware.b4a.keywords.Common.Power(_mincs.Width /*int*/ ,2)+anywheresoftware.b4a.keywords.Common.Power(_mincs.Height /*int*/ ,2)>anywheresoftware.b4a.keywords.Common.Power(_cs.Width /*int*/ ,2)+anywheresoftware.b4a.keywords.Common.Power(_cs.Height /*int*/ ,2)) { 
RDebugUtils.currentLine=120782855;
 //BA.debugLineNum = 120782855;BA.debugLine="minCS = cs";
_mincs = _cs;
 };
 };
 }
};
RDebugUtils.currentLine=120782859;
 //BA.debugLineNum = 120782859;BA.debugLine="camEx.SetPictureSize(minCS.Width, minCS.Height)";
mostCurrent._camex._setpicturesize /*String*/ (null,_mincs.Width /*int*/ ,_mincs.Height /*int*/ );
RDebugUtils.currentLine=120782860;
 //BA.debugLineNum = 120782860;BA.debugLine="End Sub";
return "";
}
public static String  _showpictureclose_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showpictureclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showpictureclose_click", null));}
RDebugUtils.currentLine=122028032;
 //BA.debugLineNum = 122028032;BA.debugLine="Sub ShowPictureClose_Click";
RDebugUtils.currentLine=122028033;
 //BA.debugLineNum = 122028033;BA.debugLine="showPicturePanel.Visible = False";
mostCurrent._showpicturepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=122028034;
 //BA.debugLineNum = 122028034;BA.debugLine="End Sub";
return "";
}
public static String  _showpictureimage_click() throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showpictureimage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showpictureimage_click", null));}
RDebugUtils.currentLine=122290176;
 //BA.debugLineNum = 122290176;BA.debugLine="Sub showPictureImage_Click";
RDebugUtils.currentLine=122290179;
 //BA.debugLineNum = 122290179;BA.debugLine="LastOrigin = CurrentCLAItem.Origin";
_lastorigin = mostCurrent._currentclaitem.Origin /*int*/ ;
RDebugUtils.currentLine=122290180;
 //BA.debugLineNum = 122290180;BA.debugLine="CurrentCLAItem.Origin = 4";
mostCurrent._currentclaitem.Origin /*int*/  = (int) (4);
RDebugUtils.currentLine=122290181;
 //BA.debugLineNum = 122290181;BA.debugLine="CurrentFileName = ShotFileName";
mostCurrent._currentfilename = _shotfilename;
RDebugUtils.currentLine=122290183;
 //BA.debugLineNum = 122290183;BA.debugLine="End Sub";
return "";
}
public static String  _startcamera(Object _returntoactivity) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamera", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcamera", new Object[] {_returntoactivity}));}
RDebugUtils.currentLine=120324096;
 //BA.debugLineNum = 120324096;BA.debugLine="Public Sub StartCamera(ReturnToActivity As Object)";
RDebugUtils.currentLine=120324097;
 //BA.debugLineNum = 120324097;BA.debugLine="ReturnTo = ReturnToActivity";
_returnto = _returntoactivity;
RDebugUtils.currentLine=120324098;
 //BA.debugLineNum = 120324098;BA.debugLine="CurrentCLAItem = Types.MakeRequestCLAItem(\"__DUMM";
mostCurrent._currentclaitem = mostCurrent._types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (mostCurrent.activityBA,"__DUMMY__","__DUMMY__","__DUMMY__","__DUMMY__",mostCurrent._utils._udid /*String*/ (mostCurrent.activityBA),"__DUMMY__",(int) (0),(int) (0),(int) (0),"","","",(int) (1),(int) (0),(int) (0),"",mostCurrent._dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (mostCurrent.activityBA,"",""),"");
RDebugUtils.currentLine=120324102;
 //BA.debugLineNum = 120324102;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=120324103;
 //BA.debugLineNum = 120324103;BA.debugLine="End Sub";
return "";
}
public static String  _startcamera2(Object _returntoactivity,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="cameraactivity";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamera2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcamera2", new Object[] {_returntoactivity,_claitem}));}
RDebugUtils.currentLine=120389632;
 //BA.debugLineNum = 120389632;BA.debugLine="Public Sub StartCamera2(ReturnToActivity As Object";
RDebugUtils.currentLine=120389633;
 //BA.debugLineNum = 120389633;BA.debugLine="ReturnTo = ReturnToActivity";
_returnto = _returntoactivity;
RDebugUtils.currentLine=120389634;
 //BA.debugLineNum = 120389634;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=120389635;
 //BA.debugLineNum = 120389635;BA.debugLine="ExitToDialog = True";
_exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=120389637;
 //BA.debugLineNum = 120389637;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=120389638;
 //BA.debugLineNum = 120389638;BA.debugLine="End Sub";
return "";
}
}