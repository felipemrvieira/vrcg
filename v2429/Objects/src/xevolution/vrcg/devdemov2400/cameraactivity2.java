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

public class cameraactivity2 extends Activity implements B4AActivity{
	public static cameraactivity2 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.cameraactivity2");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (cameraactivity2).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.cameraactivity2");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.cameraactivity2", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (cameraactivity2) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (cameraactivity2) Resume **");
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
		return cameraactivity2.class;
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
            BA.LogInfo("** Activity (cameraactivity2) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (cameraactivity2) Pause event (activity is not paused). **");
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
            cameraactivity2 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (cameraactivity2) Resume **");
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
public static anywheresoftware.b4a.phone.Phone.PhoneOrientation _orientation = null;
public static boolean _hasfocus = false;
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnfocus = null;
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
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _dir = "";
RDebugUtils.currentLine=124059648;
 //BA.debugLineNum = 124059648;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=124059649;
 //BA.debugLineNum = 124059649;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=124059650;
 //BA.debugLineNum = 124059650;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=124059652;
 //BA.debugLineNum = 124059652;BA.debugLine="Device.SetScreenOrientation(0)";
_device.SetScreenOrientation(processBA,(int) (0));
 };
RDebugUtils.currentLine=124059654;
 //BA.debugLineNum = 124059654;BA.debugLine="Activity.LoadLayout(\"camerawindowmultiple\")";
mostCurrent._activity.LoadLayout("camerawindowmultiple",mostCurrent.activityBA);
RDebugUtils.currentLine=124059655;
 //BA.debugLineNum = 124059655;BA.debugLine="CamShots.Initialize";
_camshots.Initialize();
RDebugUtils.currentLine=124059656;
 //BA.debugLineNum = 124059656;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
_dir = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=124059657;
 //BA.debugLineNum = 124059657;BA.debugLine="ShotFileLocation = dir";
_shotfilelocation = _dir;
RDebugUtils.currentLine=124059658;
 //BA.debugLineNum = 124059658;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=124452864;
 //BA.debugLineNum = 124452864;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=124452865;
 //BA.debugLineNum = 124452865;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=124452867;
 //BA.debugLineNum = 124452867;BA.debugLine="butCloseCamera_Click";
_butclosecamera_click();
 };
RDebugUtils.currentLine=124452869;
 //BA.debugLineNum = 124452869;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=124452870;
 //BA.debugLineNum = 124452870;BA.debugLine="End Sub";
return false;
}
public static String  _butclosecamera_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butclosecamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butclosecamera_click", null));}
boolean _docontinue = false;
int _i = 0;
RDebugUtils.currentLine=126287872;
 //BA.debugLineNum = 126287872;BA.debugLine="Sub butCloseCamera_Click";
RDebugUtils.currentLine=126287874;
 //BA.debugLineNum = 126287874;BA.debugLine="Dim DoContinue As Boolean = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=126287877;
 //BA.debugLineNum = 126287877;BA.debugLine="If (CamShots.Size >= 1) Then";
if ((_camshots.getSize()>=1)) { 
RDebugUtils.currentLine=126287878;
 //BA.debugLineNum = 126287878;BA.debugLine="Dim i As Int = Msgbox2(\"Existem fotos tiradas po";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Existem fotos tiradas por gravar! Deseja sair do módulo na mesma sem gravar?"),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=126287879;
 //BA.debugLineNum = 126287879;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=126287880;
 //BA.debugLineNum = 126287880;BA.debugLine="DoContinue = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=126287882;
 //BA.debugLineNum = 126287882;BA.debugLine="DoContinue = False";
_docontinue = anywheresoftware.b4a.keywords.Common.False;
 };
 };
RDebugUtils.currentLine=126287886;
 //BA.debugLineNum = 126287886;BA.debugLine="If (DoContinue) Then";
if ((_docontinue)) { 
RDebugUtils.currentLine=126287887;
 //BA.debugLineNum = 126287887;BA.debugLine="If (ExitToDialog) Then";
if ((_exittodialog)) { 
RDebugUtils.currentLine=126287888;
 //BA.debugLineNum = 126287888;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
if ((_returnto instanceof xevolution.vrcg.devdemov2400.appactiondialogs)) { 
RDebugUtils.currentLine=126287889;
 //BA.debugLineNum = 126287889;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
RDebugUtils.currentLine=126287890;
 //BA.debugLineNum = 126287890;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._requests3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }else 
{RDebugUtils.currentLine=126287891;
 //BA.debugLineNum = 126287891;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
RDebugUtils.currentLine=126287892;
 //BA.debugLineNum = 126287892;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Curr";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._checklist3.getObject()),"CamImage2",(Object)(mostCurrent._currentclaitem));
 }}
;
 };
 }else {
RDebugUtils.currentLine=126287896;
 //BA.debugLineNum = 126287896;BA.debugLine="CallSubDelayed(MainMenu, \"ListsReturnNoAction\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturnNoAction");
 };
 };
RDebugUtils.currentLine=126287900;
 //BA.debugLineNum = 126287900;BA.debugLine="If DoContinue Then Activity.Finish";
if (_docontinue) { 
mostCurrent._activity.Finish();};
RDebugUtils.currentLine=126287901;
 //BA.debugLineNum = 126287901;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
RDebugUtils.currentLine=124387328;
 //BA.debugLineNum = 124387328;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=124387329;
 //BA.debugLineNum = 124387329;BA.debugLine="If camEx.IsInitialized Then";
if (mostCurrent._camex.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=124387330;
 //BA.debugLineNum = 124387330;BA.debugLine="camEx.Release";
mostCurrent._camex._release /*String*/ (null);
 };
RDebugUtils.currentLine=124387332;
 //BA.debugLineNum = 124387332;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
String _dir = "";
RDebugUtils.currentLine=124321792;
 //BA.debugLineNum = 124321792;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=124321793;
 //BA.debugLineNum = 124321793;BA.debugLine="CamShots.Initialize";
_camshots.Initialize();
RDebugUtils.currentLine=124321794;
 //BA.debugLineNum = 124321794;BA.debugLine="Dim dir As String = Starter.InternalFolder  '.Saf";
_dir = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=124321795;
 //BA.debugLineNum = 124321795;BA.debugLine="ShotFileLocation = dir";
_shotfilelocation = _dir;
RDebugUtils.currentLine=124321796;
 //BA.debugLineNum = 124321796;BA.debugLine="End Sub";
return "";
}
public static String  _btneffect_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btneffect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btneffect_click", null));}
RDebugUtils.currentLine=125566976;
 //BA.debugLineNum = 125566976;BA.debugLine="Sub btnEffect_Click";
RDebugUtils.currentLine=125566984;
 //BA.debugLineNum = 125566984;BA.debugLine="End Sub";
return "";
}
public static String  _btnflash_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnflash_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnflash_click", null));}
float[] _f = null;
anywheresoftware.b4a.objects.collections.List _flashmodes = null;
String _flash = "";
RDebugUtils.currentLine=125632512;
 //BA.debugLineNum = 125632512;BA.debugLine="Sub btnFlash_Click";
RDebugUtils.currentLine=125632513;
 //BA.debugLineNum = 125632513;BA.debugLine="Dim f() As Float = camEx.GetFocusDistances";
_f = mostCurrent._camex._getfocusdistances /*float[]*/ (null);
RDebugUtils.currentLine=125632514;
 //BA.debugLineNum = 125632514;BA.debugLine="Log(f(0) & \", \" & f(1) & \", \" & f(2))";
anywheresoftware.b4a.keywords.Common.LogImpl("6125632514",BA.NumberToString(_f[(int) (0)])+", "+BA.NumberToString(_f[(int) (1)])+", "+BA.NumberToString(_f[(int) (2)]),0);
RDebugUtils.currentLine=125632515;
 //BA.debugLineNum = 125632515;BA.debugLine="Dim flashModes As List = camEx.GetSupportedFlashM";
_flashmodes = new anywheresoftware.b4a.objects.collections.List();
_flashmodes = mostCurrent._camex._getsupportedflashmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=125632516;
 //BA.debugLineNum = 125632516;BA.debugLine="If flashModes.IsInitialized = False Then";
if (_flashmodes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=125632517;
 //BA.debugLineNum = 125632517;BA.debugLine="ToastMessageShow(\"Flash não suportado.\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Flash não suportado."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=125632518;
 //BA.debugLineNum = 125632518;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=125632520;
 //BA.debugLineNum = 125632520;BA.debugLine="Dim flash As String = flashModes.Get((flashModes.";
_flash = BA.ObjectToString(_flashmodes.Get((int) ((_flashmodes.IndexOf((Object)(mostCurrent._camex._getflashmode /*String*/ (null)))+1)%_flashmodes.getSize())));
RDebugUtils.currentLine=125632521;
 //BA.debugLineNum = 125632521;BA.debugLine="Try";
try {RDebugUtils.currentLine=125632522;
 //BA.debugLineNum = 125632522;BA.debugLine="camEx.SetFlashMode(flash)";
mostCurrent._camex._setflashmode /*String*/ (null,_flash);
RDebugUtils.currentLine=125632523;
 //BA.debugLineNum = 125632523;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
 } 
       catch (Exception e13) {
			processBA.setLastException(e13);RDebugUtils.currentLine=125632525;
 //BA.debugLineNum = 125632525;BA.debugLine="ToastMessageShow(flash, False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(_flash),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=125632527;
 //BA.debugLineNum = 125632527;BA.debugLine="End Sub";
return "";
}
public static String  _btnfocus_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnfocus_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnfocus_click", null));}
RDebugUtils.currentLine=124780544;
 //BA.debugLineNum = 124780544;BA.debugLine="Sub btnFocus_Click";
RDebugUtils.currentLine=124780546;
 //BA.debugLineNum = 124780546;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=124780547;
 //BA.debugLineNum = 124780547;BA.debugLine="HasFocus = False";
_hasfocus = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=124780548;
 //BA.debugLineNum = 124780548;BA.debugLine="btnFocus.Text = Chr(0xF1BE)";
mostCurrent._btnfocus.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1be))));
 }else {
RDebugUtils.currentLine=124780550;
 //BA.debugLineNum = 124780550;BA.debugLine="HasFocus = True";
_hasfocus = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=124780551;
 //BA.debugLineNum = 124780551;BA.debugLine="btnFocus.Text = \"AF\"";
mostCurrent._btnfocus.setText(BA.ObjectToCharSequence("AF"));
 };
RDebugUtils.currentLine=124780554;
 //BA.debugLineNum = 124780554;BA.debugLine="End Sub";
return "";
}
public static String  _btnpicturesize_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnpicturesize_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnpicturesize_click", null));}
RDebugUtils.currentLine=125698048;
 //BA.debugLineNum = 125698048;BA.debugLine="Sub btnPictureSize_Click";
RDebugUtils.currentLine=125698050;
 //BA.debugLineNum = 125698050;BA.debugLine="End Sub";
return "";
}
public static String  _btntakepicture_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btntakepicture_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btntakepicture_click", null));}
RDebugUtils.currentLine=124715008;
 //BA.debugLineNum = 124715008;BA.debugLine="Sub btnTakePicture_Click";
RDebugUtils.currentLine=124715009;
 //BA.debugLineNum = 124715009;BA.debugLine="Try";
try {RDebugUtils.currentLine=124715014;
 //BA.debugLineNum = 124715014;BA.debugLine="camEx.TakePicture";
mostCurrent._camex._takepicture /*String*/ (null);
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=124715018;
 //BA.debugLineNum = 124715018;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6124715018",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=124715021;
 //BA.debugLineNum = 124715021;BA.debugLine="End Sub";
return "";
}
public static void  _butsavepicture_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsavepicture_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butsavepicture_click", null); return;}
ResumableSub_butSavePicture_Click rsub = new ResumableSub_butSavePicture_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butSavePicture_Click extends BA.ResumableSub {
public ResumableSub_butSavePicture_Click(xevolution.vrcg.devdemov2400.cameraactivity2 parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
boolean _docontinue = false;
boolean _justexit = false;
int _result = 0;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
anywheresoftware.b4a.objects.collections.List _apilist = null;
int _i = 0;
xevolution.vrcg.devdemov2400.types._shotfoto _thefoto = null;
String _thefile = "";
String _imgb64 = "";
String _grp = "";
int _mid = 0;
String _alerttagcode = "";
String _ssql = "";
String _titlefoto = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
int step38;
int limit38;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126025729;
 //BA.debugLineNum = 126025729;BA.debugLine="Dim DoContinue As Boolean = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=126025730;
 //BA.debugLineNum = 126025730;BA.debugLine="Dim JustExit As Boolean = False";
_justexit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=126025732;
 //BA.debugLineNum = 126025732;BA.debugLine="If (CamShots.Size = 0) Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((parent._camshots.getSize()==0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126025734;
 //BA.debugLineNum = 126025734;BA.debugLine="Msgbox2Async(\"Não existem fotos tiradas para gra";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Não existem fotos tiradas para gravar! Deseja sair do módulo?"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=126025735;
 //BA.debugLineNum = 126025735;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "butsavepicture_click"), null);
this.state = 49;
return;
case 49:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=126025736;
 //BA.debugLineNum = 126025736;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=126025737;
 //BA.debugLineNum = 126025737;BA.debugLine="JustExit = True";
_justexit = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=126025739;
 //BA.debugLineNum = 126025739;BA.debugLine="JustExit = False";
_justexit = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=126025740;
 //BA.debugLineNum = 126025740;BA.debugLine="DoContinue = False";
_docontinue = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;
;
RDebugUtils.currentLine=126025744;
 //BA.debugLineNum = 126025744;BA.debugLine="If Not(JustExit) And (DoContinue) Then";

case 10:
//if
this.state = 43;
if (anywheresoftware.b4a.keywords.Common.Not(_justexit) && (_docontinue)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=126025745;
 //BA.debugLineNum = 126025745;BA.debugLine="If (ExitToDialog) Then";
if (true) break;

case 13:
//if
this.state = 42;
if ((parent._exittodialog)) { 
this.state = 15;
}else {
this.state = 33;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=126025746;
 //BA.debugLineNum = 126025746;BA.debugLine="If (ReturnTo Is AppActionDialogs) Then";
if (true) break;

case 16:
//if
this.state = 31;
if ((parent._returnto instanceof xevolution.vrcg.devdemov2400.appactiondialogs)) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=126025747;
 //BA.debugLineNum = 126025747;BA.debugLine="If (CurrentCLAItem.Origin = 2) Then";
if (true) break;

case 19:
//if
this.state = 24;
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
this.state = 21;
}else 
{RDebugUtils.currentLine=126025749;
 //BA.debugLineNum = 126025749;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
this.state = 23;
}}
if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=126025748;
 //BA.debugLineNum = 126025748;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._requests3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=126025750;
 //BA.debugLineNum = 126025750;BA.debugLine="CallSubDelayed3(CheckList3, \"CamImage\", Curre";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem),(Object)(parent._camshots));
 if (true) break;

case 24:
//C
this.state = 31;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=126025753;
 //BA.debugLineNum = 126025753;BA.debugLine="If (ReturnToName = \"checklist3\") Then";
if (true) break;

case 27:
//if
this.state = 30;
if (((parent.mostCurrent._returntoname).equals("checklist3"))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=126025754;
 //BA.debugLineNum = 126025754;BA.debugLine="CallSubDelayed3(CheckList3, \"CamImage\", Curre";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem),(Object)(parent._camshots));
RDebugUtils.currentLine=126025755;
 //BA.debugLineNum = 126025755;BA.debugLine="Dim DoContinue As Boolean = True";
_docontinue = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 42;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=126025759;
 //BA.debugLineNum = 126025759;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
_this = parent.mostCurrent._currentclaitem;
RDebugUtils.currentLine=126025760;
 //BA.debugLineNum = 126025760;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=126025761;
 //BA.debugLineNum = 126025761;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=126025762;
 //BA.debugLineNum = 126025762;BA.debugLine="If (ShotFileLocation = File.DirAssets) Then";
if (true) break;

case 34:
//if
this.state = 37;
if (((parent._shotfilelocation).equals(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=126025763;
 //BA.debugLineNum = 126025763;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
parent._shotfilelocation = parent.mostCurrent._starter._internalfolder /*String*/ ;
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=126025765;
 //BA.debugLineNum = 126025765;BA.debugLine="Dim ApiList As List";
_apilist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126025766;
 //BA.debugLineNum = 126025766;BA.debugLine="ApiList.Initialize";
_apilist.Initialize();
RDebugUtils.currentLine=126025767;
 //BA.debugLineNum = 126025767;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFoto";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgprocessfotos /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=126025768;
 //BA.debugLineNum = 126025768;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=126025769;
 //BA.debugLineNum = 126025769;BA.debugLine="For i=0 To CamShots.Size-1";
if (true) break;

case 38:
//for
this.state = 41;
step38 = 1;
limit38 = (int) (parent._camshots.getSize()-1);
_i = (int) (0) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 41;
if ((step38 > 0 && _i <= limit38) || (step38 < 0 && _i >= limit38)) this.state = 40;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step38)) ;
if (true) break;

case 40:
//C
this.state = 51;
RDebugUtils.currentLine=126025770;
 //BA.debugLineNum = 126025770;BA.debugLine="Dim theFoto  As ShotFoto = CamShots.Get(i) 'Ty";
_thefoto = (xevolution.vrcg.devdemov2400.types._shotfoto)(parent._camshots.Get(_i));
RDebugUtils.currentLine=126025772;
 //BA.debugLineNum = 126025772;BA.debugLine="Dim theFile As String = theFoto.FileName  'Cam";
_thefile = _thefoto.FileName /*String*/ ;
RDebugUtils.currentLine=126025773;
 //BA.debugLineNum = 126025773;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = _base64con._v6(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+""));
RDebugUtils.currentLine=126025775;
 //BA.debugLineNum = 126025775;BA.debugLine="Dim grp As String = $\"${Utils.IfNullOrEmpty(th";
_grp = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.DateNTime /*String*/ ,"")))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.Latitude /*String*/ ,"")))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.Longitude /*String*/ ,"")))+"");
RDebugUtils.currentLine=126025778;
 //BA.debugLineNum = 126025778;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta";
_mid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=126025779;
 //BA.debugLineNum = 126025779;BA.debugLine="Dim alerttagcode As String = $\"${Utils.Generat";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._generatetagcode /*String*/ (mostCurrent.activityBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=126025780;
 //BA.debugLineNum = 126025780;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts";
_ssql = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"+"						origin, title, group_tags, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"						values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', \n"+"						1, 1, 'Imagens adicionadas ao repositório por utilizar.', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_grp))+"',\n"+"						'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=126025785;
 //BA.debugLineNum = 126025785;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=126025787;
 //BA.debugLineNum = 126025787;BA.debugLine="Dim titleFoto As String = $\"${Utils.IfNullOrEm";
_titlefoto = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.Title /*String*/ ,"")))+"");
RDebugUtils.currentLine=126025788;
 //BA.debugLineNum = 126025788;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta";
_mid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts_images","id","")+1);
RDebugUtils.currentLine=126025789;
 //BA.debugLineNum = 126025789;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts_";
_ssql = ("insert into dta_alerts_images\n"+"							(id, tagcode, imageb64, imagename, assigned, obs)\n"+"							values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+"', 0, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_titlefoto))+"')");
RDebugUtils.currentLine=126025793;
 //BA.debugLineNum = 126025793;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=126025795;
 //BA.debugLineNum = 126025795;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=126025796;
 //BA.debugLineNum = 126025796;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=126025797;
 //BA.debugLineNum = 126025797;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=126025798;
 //BA.debugLineNum = 126025798;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=126025799;
 //BA.debugLineNum = 126025799;BA.debugLine="params.Put(\"tagcode\", alerttagcode)";
_params.Put((Object)("tagcode"),(Object)(_alerttagcode));
RDebugUtils.currentLine=126025800;
 //BA.debugLineNum = 126025800;BA.debugLine="params.Put(\"relation_type\", \"ALRTREL_TASKS\")";
_params.Put((Object)("relation_type"),(Object)("ALRTREL_TASKS"));
RDebugUtils.currentLine=126025801;
 //BA.debugLineNum = 126025801;BA.debugLine="params.Put(\"alert_type\", \"ALRTTYP_TASKS\")";
_params.Put((Object)("alert_type"),(Object)("ALRTTYP_TASKS"));
RDebugUtils.currentLine=126025802;
 //BA.debugLineNum = 126025802;BA.debugLine="params.Put(\"internal\", 1)";
_params.Put((Object)("internal"),(Object)(1));
RDebugUtils.currentLine=126025803;
 //BA.debugLineNum = 126025803;BA.debugLine="params.Put(\"origin\", 1)";
_params.Put((Object)("origin"),(Object)(1));
RDebugUtils.currentLine=126025804;
 //BA.debugLineNum = 126025804;BA.debugLine="params.Put(\"title\", \"Imagens adicionadas ao re";
_params.Put((Object)("title"),(Object)("Imagens adicionadas ao repositório por utilizar."));
RDebugUtils.currentLine=126025805;
 //BA.debugLineNum = 126025805;BA.debugLine="params.Put(\"user_tagcode\", ShareCode.SESS_User";
_params.Put((Object)("user_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=126025806;
 //BA.debugLineNum = 126025806;BA.debugLine="params.Put(\"date_alert\", Utils.GetCurrentDate)";
_params.Put((Object)("date_alert"),(Object)(parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=126025807;
 //BA.debugLineNum = 126025807;BA.debugLine="params.Put(\"date_verification\", \"\")";
_params.Put((Object)("date_verification"),(Object)(""));
RDebugUtils.currentLine=126025808;
 //BA.debugLineNum = 126025808;BA.debugLine="params.Put(\"alert_visible\", 1)";
_params.Put((Object)("alert_visible"),(Object)(1));
RDebugUtils.currentLine=126025809;
 //BA.debugLineNum = 126025809;BA.debugLine="params.Put(\"imageb64\", ImgB64)";
_params.Put((Object)("imageb64"),(Object)(_imgb64));
RDebugUtils.currentLine=126025810;
 //BA.debugLineNum = 126025810;BA.debugLine="params.Put(\"imagename\", theFile)";
_params.Put((Object)("imagename"),(Object)(_thefile));
RDebugUtils.currentLine=126025811;
 //BA.debugLineNum = 126025811;BA.debugLine="params.Put(\"status_id\", 0)";
_params.Put((Object)("status_id"),(Object)(0));
RDebugUtils.currentLine=126025812;
 //BA.debugLineNum = 126025812;BA.debugLine="params.Put(\"kind_data\", 0)";
_params.Put((Object)("kind_data"),(Object)(0));
RDebugUtils.currentLine=126025813;
 //BA.debugLineNum = 126025813;BA.debugLine="params.Put(\"request_tagcode\", this.Request)";
_params.Put((Object)("request_tagcode"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=126025814;
 //BA.debugLineNum = 126025814;BA.debugLine="params.Put(\"action_tagcode\", this.Action)";
_params.Put((Object)("action_tagcode"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=126025815;
 //BA.debugLineNum = 126025815;BA.debugLine="params.Put(\"task_tagcode\", this.Task)";
_params.Put((Object)("task_tagcode"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=126025816;
 //BA.debugLineNum = 126025816;BA.debugLine="params.Put(\"item_tagcode\", this.Item)";
_params.Put((Object)("item_tagcode"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=126025817;
 //BA.debugLineNum = 126025817;BA.debugLine="params.Put(\"uniquekey\", this.UniqueKey)";
_params.Put((Object)("uniquekey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=126025818;
 //BA.debugLineNum = 126025818;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=126025819;
 //BA.debugLineNum = 126025819;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=126025820;
 //BA.debugLineNum = 126025820;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=126025821;
 //BA.debugLineNum = 126025821;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=126025822;
 //BA.debugLineNum = 126025822;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=126025823;
 //BA.debugLineNum = 126025823;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=126025824;
 //BA.debugLineNum = 126025824;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=126025825;
 //BA.debugLineNum = 126025825;BA.debugLine="ApiList.Add(params)";
_apilist.Add((Object)(_params.getObject()));
 if (true) break;
if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=126025827;
 //BA.debugLineNum = 126025827;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=126025828;
 //BA.debugLineNum = 126025828;BA.debugLine="Sleep(125)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "butsavepicture_click"),(int) (125));
this.state = 52;
return;
case 52:
//C
this.state = 42;
;
RDebugUtils.currentLine=126025829;
 //BA.debugLineNum = 126025829;BA.debugLine="CallSubDelayed3(MainMenu, \"ListsReturnUpdateSer";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._mainmenu.getObject()),"ListsReturnUpdateServer",(Object)(("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/alert/new")),(Object)(_apilist));
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=126025833;
 //BA.debugLineNum = 126025833;BA.debugLine="If DoContinue Then Activity.Finish";

case 43:
//if
this.state = 48;
if (_docontinue) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
parent.mostCurrent._activity.Finish();
if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=126025834;
 //BA.debugLineNum = 126025834;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _bytestoimage(byte[] _bytes) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bytestoimage", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(mostCurrent.activityBA, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
RDebugUtils.currentLine=125042688;
 //BA.debugLineNum = 125042688;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As B4XBit";
RDebugUtils.currentLine=125042689;
 //BA.debugLineNum = 125042689;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=125042690;
 //BA.debugLineNum = 125042690;BA.debugLine="In.InitializeFromBytesArray(bytes, 0, bytes.Lengt";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=125042692;
 //BA.debugLineNum = 125042692;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=125042693;
 //BA.debugLineNum = 125042693;BA.debugLine="bmp.Initialize2(In)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=125042698;
 //BA.debugLineNum = 125042698;BA.debugLine="Return bmp";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=125042699;
 //BA.debugLineNum = 125042699;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _camerareturnshots(anywheresoftware.b4a.objects.collections.List _filelist,xevolution.vrcg.devdemov2400.types._requestclaitem _this) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "camerareturnshots", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "camerareturnshots", new Object[] {_filelist,_this}));}
ResumableSub_CameraReturnShots rsub = new ResumableSub_CameraReturnShots(null,_filelist,_this);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CameraReturnShots extends BA.ResumableSub {
public ResumableSub_CameraReturnShots(xevolution.vrcg.devdemov2400.cameraactivity2 parent,anywheresoftware.b4a.objects.collections.List _filelist,xevolution.vrcg.devdemov2400.types._requestclaitem _this) {
this.parent = parent;
this._filelist = _filelist;
this._this = _this;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
anywheresoftware.b4a.objects.collections.List _filelist;
xevolution.vrcg.devdemov2400.types._requestclaitem _this;
String _obj = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.Map _params33 = null;
int _nfile = 0;
xevolution.vrcg.devdemov2400.types._shotfoto _thefoto = null;
String _filename = "";
com.simplysoftware.base64convert.base64convert _base64con = null;
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
int _v = 0;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _upl = null;
boolean _finish = false;
String _serverlocation = "";
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126091267;
 //BA.debugLineNum = 126091267;BA.debugLine="Dim obj As String = this.TagObject";
_obj = _this.TagObject /*String*/ ;
RDebugUtils.currentLine=126091268;
 //BA.debugLineNum = 126091268;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=126091269;
 //BA.debugLineNum = 126091269;BA.debugLine="Dim params33 As Map";
_params33 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=126091270;
 //BA.debugLineNum = 126091270;BA.debugLine="If (FileList.Size >0) Then";
if (true) break;

case 1:
//if
this.state = 60;
if ((_filelist.getSize()>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126091271;
 //BA.debugLineNum = 126091271;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessFotos";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgprocessfotos /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=126091272;
 //BA.debugLineNum = 126091272;BA.debugLine="For nFile=0 To FileList.Size-1";
if (true) break;

case 4:
//for
this.state = 59;
step6 = 1;
limit6 = (int) (_filelist.getSize()-1);
_nfile = (int) (0) ;
this.state = 61;
if (true) break;

case 61:
//C
this.state = 59;
if ((step6 > 0 && _nfile <= limit6) || (step6 < 0 && _nfile >= limit6)) this.state = 6;
if (true) break;

case 62:
//C
this.state = 61;
_nfile = ((int)(0 + _nfile + step6)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=126091273;
 //BA.debugLineNum = 126091273;BA.debugLine="Dim theFoto  As ShotFoto = FileList.Get(nFile)";
_thefoto = (xevolution.vrcg.devdemov2400.types._shotfoto)(_filelist.Get(_nfile));
RDebugUtils.currentLine=126091274;
 //BA.debugLineNum = 126091274;BA.debugLine="Dim FileName As String = theFoto.FileName";
_filename = _thefoto.FileName /*String*/ ;
RDebugUtils.currentLine=126091275;
 //BA.debugLineNum = 126091275;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
if (true) break;

case 7:
//if
this.state = 24;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_filename))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=126091276;
 //BA.debugLineNum = 126091276;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
if (true) break;

case 10:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.Not(_filename.indexOf(".png")>=0)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=126091277;
 //BA.debugLineNum = 126091277;BA.debugLine="FileName = $\"${FileName}.png\"$";
_filename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+".png");
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=126091279;
 //BA.debugLineNum = 126091279;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=126091280;
 //BA.debugLineNum = 126091280;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=126091281;
 //BA.debugLineNum = 126091281;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = _base64con._v6(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""));
RDebugUtils.currentLine=126091284;
 //BA.debugLineNum = 126091284;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=126091285;
 //BA.debugLineNum = 126091285;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values_images\n"+"						(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, \n"+"						imagename, on_report, repeatcounter, repeatitemcounter, repeatfieldcounter, \n"+"						execute_datetime, execute_latitude, execute_longitude)\n"+"						values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"',\n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"', 1, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+",\n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.DateNTime /*String*/ ,"")))+"',\n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.Latitude /*String*/ ,"")))+"',\n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_thefoto.Longitude /*String*/ ,"")))+"')");
RDebugUtils.currentLine=126091295;
 //BA.debugLineNum = 126091295;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.R";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CameraReturn",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=126091297;
 //BA.debugLineNum = 126091297;BA.debugLine="If (Utils.NNE(obj)) Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_obj))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=126091298;
 //BA.debugLineNum = 126091298;BA.debugLine="Dim v As Int = Utils.DBDataCount(Starter.Loca";
_v = (int) (parent.mostCurrent._utils._dbdatacount /*int*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,("select count(0) as COUNTER from dta_objects_images "))+1);
RDebugUtils.currentLine=126091299;
 //BA.debugLineNum = 126091299;BA.debugLine="Dim sSQL As String = $\"insert into dta_object";
_ssql = ("insert into dta_objects_images (id, object_tagcode, image, filename)\n"+"					values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_v))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_obj))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"')");
RDebugUtils.currentLine=126091301;
 //BA.debugLineNum = 126091301;BA.debugLine="Utils.SaveSQLToLog(\"CameraReturn\",sSQL, this.";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CameraReturn",_ssql,_this.Request /*String*/ );
RDebugUtils.currentLine=126091304;
 //BA.debugLineNum = 126091304;BA.debugLine="params33.Initialize";
_params33.Initialize();
RDebugUtils.currentLine=126091305;
 //BA.debugLineNum = 126091305;BA.debugLine="params33.Clear";
_params33.Clear();
RDebugUtils.currentLine=126091306;
 //BA.debugLineNum = 126091306;BA.debugLine="params33.Put(\"_token\", ShareCode.APP_TOKEN)";
_params33.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=126091307;
 //BA.debugLineNum = 126091307;BA.debugLine="params33.Put(\"ACLATagcode\", obj)";
_params33.Put((Object)("ACLATagcode"),(Object)(_obj));
RDebugUtils.currentLine=126091308;
 //BA.debugLineNum = 126091308;BA.debugLine="params33.Put(\"ACLAValueImage\", ImgB64)";
_params33.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=126091309;
 //BA.debugLineNum = 126091309;BA.debugLine="params33.Put(\"ACLAValueFileImage\", FileName)";
_params33.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=126091313;
 //BA.debugLineNum = 126091313;BA.debugLine="Private sACLADatetime As String = Utils.GetCur";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=126091314;
 //BA.debugLineNum = 126091314;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=126091315;
 //BA.debugLineNum = 126091315;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=126091317;
 //BA.debugLineNum = 126091317;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=126091318;
 //BA.debugLineNum = 126091318;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=126091319;
 //BA.debugLineNum = 126091319;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=126091320;
 //BA.debugLineNum = 126091320;BA.debugLine="params.Put(\"ACLARequest\", this.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=126091321;
 //BA.debugLineNum = 126091321;BA.debugLine="params.Put(\"ACLAAction\", this.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=126091322;
 //BA.debugLineNum = 126091322;BA.debugLine="params.Put(\"ACLATask\", this.Task)";
_params.Put((Object)("ACLATask"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=126091323;
 //BA.debugLineNum = 126091323;BA.debugLine="params.Put(\"ACLAItem\", this.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=126091324;
 //BA.debugLineNum = 126091324;BA.debugLine="params.Put(\"ACLAUniqueKey\", this.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=126091325;
 //BA.debugLineNum = 126091325;BA.debugLine="params.Put(\"ACLATagcode\", this.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_this.Tagcode /*String*/ ));
RDebugUtils.currentLine=126091326;
 //BA.debugLineNum = 126091326;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=126091327;
 //BA.debugLineNum = 126091327;BA.debugLine="params.Put(\"ACLAValueFileImage\", FileName)";
_params.Put((Object)("ACLAValueFileImage"),(Object)(_filename));
RDebugUtils.currentLine=126091328;
 //BA.debugLineNum = 126091328;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=126091329;
 //BA.debugLineNum = 126091329;BA.debugLine="params.Put(\"ACLAReqCounter\", this.RepeatCounte";
_params.Put((Object)("ACLAReqCounter"),(Object)(_this.RepeatCounter /*int*/ ));
RDebugUtils.currentLine=126091330;
 //BA.debugLineNum = 126091330;BA.debugLine="params.Put(\"ACLARepeatItem\", this.RepeatItemCo";
_params.Put((Object)("ACLARepeatItem"),(Object)(_this.RepeatItemCounter /*int*/ ));
RDebugUtils.currentLine=126091331;
 //BA.debugLineNum = 126091331;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=126091332;
 //BA.debugLineNum = 126091332;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=126091333;
 //BA.debugLineNum = 126091333;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=126091334;
 //BA.debugLineNum = 126091334;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=126091335;
 //BA.debugLineNum = 126091335;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=126091336;
 //BA.debugLineNum = 126091336;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=126091337;
 //BA.debugLineNum = 126091337;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=126091338;
 //BA.debugLineNum = 126091338;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=126091339;
 //BA.debugLineNum = 126091339;BA.debugLine="Try";
if (true) break;

case 18:
//try
this.state = 23;
this.catchState = 22;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 23;
this.catchState = 22;
RDebugUtils.currentLine=126091340;
 //BA.debugLineNum = 126091340;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=126091341;
 //BA.debugLineNum = 126091341;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
RDebugUtils.currentLine=126091343;
 //BA.debugLineNum = 126091343;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=126091344;
 //BA.debugLineNum = 126091344;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=126091345;
 //BA.debugLineNum = 126091345;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6126091345",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;
;
RDebugUtils.currentLine=126091384;
 //BA.debugLineNum = 126091384;BA.debugLine="If (params.IsInitialized) Then";

case 24:
//if
this.state = 49;
if ((_params.IsInitialized())) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=126091385;
 //BA.debugLineNum = 126091385;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=126091386;
 //BA.debugLineNum = 126091386;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 27:
//if
this.state = 32;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=126091387;
 //BA.debugLineNum = 126091387;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", this.Re";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,cameraactivity2.getObject(),_url,"",_this.Request /*String*/ );
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=126091389;
 //BA.debugLineNum = 126091389;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=126091390;
 //BA.debugLineNum = 126091390;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=126091392;
 //BA.debugLineNum = 126091392;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "camerareturnshots"),(int) (250));
this.state = 63;
return;
case 63:
//C
this.state = 33;
;
RDebugUtils.currentLine=126091395;
 //BA.debugLineNum = 126091395;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 33:
//if
this.state = 48;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 35;
}else {
this.state = 47;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=126091396;
 //BA.debugLineNum = 126091396;BA.debugLine="Try";
if (true) break;

case 36:
//try
this.state = 45;
this.catchState = 44;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 44;
RDebugUtils.currentLine=126091397;
 //BA.debugLineNum = 126091397;BA.debugLine="Dim upl As ResumableSub = UploadFilesWithFTP";
_upl = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_upl = _uploadfileswithftp(_filename);
RDebugUtils.currentLine=126091398;
 //BA.debugLineNum = 126091398;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "camerareturnshots"), _upl);
this.state = 64;
return;
case 64:
//C
this.state = 39;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=126091399;
 //BA.debugLineNum = 126091399;BA.debugLine="If finish Then";
if (true) break;

case 39:
//if
this.state = 42;
if (_finish) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=126091400;
 //BA.debugLineNum = 126091400;BA.debugLine="Log(\"UploadFilesWithFTP finish \" & finish )";
anywheresoftware.b4a.keywords.Common.LogImpl("6126091400","UploadFilesWithFTP finish "+BA.ObjectToString(_finish),0);
 if (true) break;

case 42:
//C
this.state = 45;
;
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=126091404;
 //BA.debugLineNum = 126091404;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6126091404",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=126091405;
 //BA.debugLineNum = 126091405;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCod";
_serverlocation = ("/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=126091406;
 //BA.debugLineNum = 126091406;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=126091407;
 //BA.debugLineNum = 126091407;BA.debugLine="Utils.save2update(ServerLocation, FileName,";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serverlocation,_filename,(int) (1),_workernd);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=126091410;
 //BA.debugLineNum = 126091410;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode";
_serverlocation = ("/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=126091411;
 //BA.debugLineNum = 126091411;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=126091412;
 //BA.debugLineNum = 126091412;BA.debugLine="Utils.save2update(ServerLocation, FileName, 1";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serverlocation,_filename,(int) (1),_workernd);
 if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=126091414;
 //BA.debugLineNum = 126091414;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "camerareturnshots"),(int) (250));
this.state = 65;
return;
case 65:
//C
this.state = 49;
;
 if (true) break;
;
RDebugUtils.currentLine=126091417;
 //BA.debugLineNum = 126091417;BA.debugLine="If (params33.IsInitialized) Then";

case 49:
//if
this.state = 58;
if ((_params33.IsInitialized())) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=126091419;
 //BA.debugLineNum = 126091419;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
anywheresoftware.b4a.keywords.Common.LogImpl("6126091419","3333333333333333333333333333333333333333333333",0);
RDebugUtils.currentLine=126091420;
 //BA.debugLineNum = 126091420;BA.debugLine="Log(Url)";
anywheresoftware.b4a.keywords.Common.LogImpl("6126091420",_url,0);
RDebugUtils.currentLine=126091421;
 //BA.debugLineNum = 126091421;BA.debugLine="Log(\"33333333333333333333333333333333333333333";
anywheresoftware.b4a.keywords.Common.LogImpl("6126091421","3333333333333333333333333333333333333333333333",0);
RDebugUtils.currentLine=126091422;
 //BA.debugLineNum = 126091422;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more2/img/update");
RDebugUtils.currentLine=126091423;
 //BA.debugLineNum = 126091423;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
if (true) break;

case 52:
//if
this.state = 57;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 57;
RDebugUtils.currentLine=126091424;
 //BA.debugLineNum = 126091424;BA.debugLine="Utils.CallApi(0, params33, Me, Url, \"\", this.";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params33,cameraactivity2.getObject(),_url,"",_this.Request /*String*/ );
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=126091426;
 //BA.debugLineNum = 126091426;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_this.Request /*String*/ .trim(),_this.Task /*String*/ .trim(),_this.Item /*String*/ .trim());
RDebugUtils.currentLine=126091427;
 //BA.debugLineNum = 126091427;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params33),(int) (0),_workernd);
 if (true) break;

case 57:
//C
this.state = 58;
;
RDebugUtils.currentLine=126091429;
 //BA.debugLineNum = 126091429;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "camerareturnshots"),(int) (250));
this.state = 66;
return;
case 66:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 62;
;
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=126091434;
 //BA.debugLineNum = 126091434;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=126091437;
 //BA.debugLineNum = 126091437;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=126091438;
 //BA.debugLineNum = 126091438;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadfileswithftp(String _filename) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadfileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "uploadfileswithftp", new Object[] {_filename}));}
ResumableSub_UploadFilesWithFTP rsub = new ResumableSub_UploadFilesWithFTP(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTP(xevolution.vrcg.devdemov2400.cameraactivity2 parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
String _filename;
boolean _ret = false;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126156801;
 //BA.debugLineNum = 126156801;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=126156802;
 //BA.debugLineNum = 126156802;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=126156803;
 //BA.debugLineNum = 126156803;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=126156804;
 //BA.debugLineNum = 126156804;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=126156808;
 //BA.debugLineNum = 126156808;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=126156809;
 //BA.debugLineNum = 126156809;BA.debugLine="Log(filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("6126156809",_filename,0);
RDebugUtils.currentLine=126156810;
 //BA.debugLineNum = 126156810;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,anywheresoftware.b4a.keywords.Common.False,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_filename);
RDebugUtils.currentLine=126156811;
 //BA.debugLineNum = 126156811;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "uploadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=126156812;
 //BA.debugLineNum = 126156812;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=126156813;
 //BA.debugLineNum = 126156813;BA.debugLine="Log(\"file was uploaded successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6126156813","file was uploaded successfully",0);
RDebugUtils.currentLine=126156814;
 //BA.debugLineNum = 126156814;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=126156816;
 //BA.debugLineNum = 126156816;BA.debugLine="Log(\"Error uploading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6126156816","Error uploading file",0);
RDebugUtils.currentLine=126156817;
 //BA.debugLineNum = 126156817;BA.debugLine="ret = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=126156819;
 //BA.debugLineNum = 126156819;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=126156820;
 //BA.debugLineNum = 126156820;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "uploadfileswithftp"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=126156822;
 //BA.debugLineNum = 126156822;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
anywheresoftware.b4a.keywords.Common.LogImpl("6126156822","UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU",0);
RDebugUtils.currentLine=126156823;
 //BA.debugLineNum = 126156823;BA.debugLine="Log(\"upload\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6126156823","upload",0);
RDebugUtils.currentLine=126156824;
 //BA.debugLineNum = 126156824;BA.debugLine="Log(\"UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU";
anywheresoftware.b4a.keywords.Common.LogImpl("6126156824","UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU",0);
RDebugUtils.currentLine=126156825;
 //BA.debugLineNum = 126156825;BA.debugLine="Return ret";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_ret));return;};
RDebugUtils.currentLine=126156826;
 //BA.debugLineNum = 126156826;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _camimage(xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "camimage", false))
	 {Debug.delegate(mostCurrent.activityBA, "camimage", new Object[] {_claitem}); return;}
ResumableSub_CamImage rsub = new ResumableSub_CamImage(null,_claitem);
rsub.resume(processBA, null);
}
public static class ResumableSub_CamImage extends BA.ResumableSub {
public ResumableSub_CamImage(xevolution.vrcg.devdemov2400.cameraactivity2 parent,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) {
this.parent = parent;
this._claitem = _claitem;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
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
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125960193;
 //BA.debugLineNum = 125960193;BA.debugLine="If CLAItem.Origin = 4 Then";
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
RDebugUtils.currentLine=125960194;
 //BA.debugLineNum = 125960194;BA.debugLine="CurrentCLAItem.Origin = LastOrigin";
parent.mostCurrent._currentclaitem.Origin /*int*/  = parent._lastorigin;
RDebugUtils.currentLine=125960195;
 //BA.debugLineNum = 125960195;BA.debugLine="If (ExitToDialog) Then";
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
RDebugUtils.currentLine=125960196;
 //BA.debugLineNum = 125960196;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
if (true) break;

case 7:
//if
this.state = 26;
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=125960198;
 //BA.debugLineNum = 125960198;BA.debugLine="else If (CurrentCLAItem.Origin = 2) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=125960200;
 //BA.debugLineNum = 125960200;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
this.state = 13;
}}}
if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=125960197;
 //BA.debugLineNum = 125960197;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._user.getObject()),"CallMOREActionsAgain",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 11:
//C
this.state = 26;
RDebugUtils.currentLine=125960199;
 //BA.debugLineNum = 125960199;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._requests3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=125960202;
 //BA.debugLineNum = 125960202;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=125960203;
 //BA.debugLineNum = 125960203;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=125960204;
 //BA.debugLineNum = 125960204;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromIma";
_imgb64 = _base64con._v6(parent._shotfilelocation,parent.mostCurrent._currentfilename);
RDebugUtils.currentLine=125960211;
 //BA.debugLineNum = 125960211;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=125960212;
 //BA.debugLineNum = 125960212;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values_images\n"+"					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report, \n"+"						repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"					values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.Tagcode /*String*/ ))+"',\n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._currentfilename))+"', 1,\n"+"					"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.RepeatItemCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_claitem.repeatfieldcounter /*int*/ ))+")");
RDebugUtils.currentLine=125960218;
 //BA.debugLineNum = 125960218;BA.debugLine="Utils.SaveSQLToLog(\"CamImage\",sSQL, CLAItem.Re";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CamImage",_ssql,_claitem.Request /*String*/ );
RDebugUtils.currentLine=125960222;
 //BA.debugLineNum = 125960222;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=125960223;
 //BA.debugLineNum = 125960223;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=125960224;
 //BA.debugLineNum = 125960224;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=125960226;
 //BA.debugLineNum = 125960226;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=125960227;
 //BA.debugLineNum = 125960227;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=125960228;
 //BA.debugLineNum = 125960228;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=125960229;
 //BA.debugLineNum = 125960229;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=125960230;
 //BA.debugLineNum = 125960230;BA.debugLine="params.Put(\"ACLARequest\", CLAItem.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_claitem.Request /*String*/ ));
RDebugUtils.currentLine=125960231;
 //BA.debugLineNum = 125960231;BA.debugLine="params.Put(\"ACLAAction\", CLAItem.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_claitem.Action /*String*/ ));
RDebugUtils.currentLine=125960232;
 //BA.debugLineNum = 125960232;BA.debugLine="params.Put(\"ACLATask\", CLAItem.Task)";
_params.Put((Object)("ACLATask"),(Object)(_claitem.Task /*String*/ ));
RDebugUtils.currentLine=125960233;
 //BA.debugLineNum = 125960233;BA.debugLine="params.Put(\"ACLAItem\", CLAItem.Item)";
_params.Put((Object)("ACLAItem"),(Object)(_claitem.Item /*String*/ ));
RDebugUtils.currentLine=125960234;
 //BA.debugLineNum = 125960234;BA.debugLine="params.Put(\"ACLAUniqueKey\", CLAItem.UniqueKey)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_claitem.UniqueKey /*String*/ ));
RDebugUtils.currentLine=125960235;
 //BA.debugLineNum = 125960235;BA.debugLine="params.Put(\"ACLATagcode\", CLAItem.Tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_claitem.Tagcode /*String*/ ));
RDebugUtils.currentLine=125960236;
 //BA.debugLineNum = 125960236;BA.debugLine="params.Put(\"ACLAValueImage\", ImgB64)";
_params.Put((Object)("ACLAValueImage"),(Object)(_imgb64));
RDebugUtils.currentLine=125960237;
 //BA.debugLineNum = 125960237;BA.debugLine="params.Put(\"ACLAValueFileImage\", CurrentFileNa";
_params.Put((Object)("ACLAValueFileImage"),(Object)(parent.mostCurrent._currentfilename));
RDebugUtils.currentLine=125960238;
 //BA.debugLineNum = 125960238;BA.debugLine="params.Put(\"ACLAOnReport\", 1)";
_params.Put((Object)("ACLAOnReport"),(Object)(1));
RDebugUtils.currentLine=125960239;
 //BA.debugLineNum = 125960239;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=125960240;
 //BA.debugLineNum = 125960240;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=125960241;
 //BA.debugLineNum = 125960241;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=125960242;
 //BA.debugLineNum = 125960242;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=125960243;
 //BA.debugLineNum = 125960243;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=125960244;
 //BA.debugLineNum = 125960244;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=125960245;
 //BA.debugLineNum = 125960245;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=125960246;
 //BA.debugLineNum = 125960246;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=125960247;
 //BA.debugLineNum = 125960247;BA.debugLine="Try";
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
RDebugUtils.currentLine=125960248;
 //BA.debugLineNum = 125960248;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=125960249;
 //BA.debugLineNum = 125960249;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
RDebugUtils.currentLine=125960251;
 //BA.debugLineNum = 125960251;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=125960252;
 //BA.debugLineNum = 125960252;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=125960253;
 //BA.debugLineNum = 125960253;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6125960253",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
RDebugUtils.currentLine=125960257;
 //BA.debugLineNum = 125960257;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai-more/img/update");
RDebugUtils.currentLine=125960258;
 //BA.debugLineNum = 125960258;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then 'And";
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
RDebugUtils.currentLine=125960259;
 //BA.debugLineNum = 125960259;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLAItem";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,cameraactivity2.getObject(),_url,"",_claitem.Request /*String*/ );
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=125960261;
 //BA.debugLineNum = 125960261;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=125960262;
 //BA.debugLineNum = 125960262;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=125960264;
 //BA.debugLineNum = 125960264;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "camimage"),(int) (250));
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
RDebugUtils.currentLine=125960266;
 //BA.debugLineNum = 125960266;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=125960268;
 //BA.debugLineNum = 125960268;BA.debugLine="Activity.Finish";
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
RDebugUtils.currentLine=125960271;
 //BA.debugLineNum = 125960271;BA.debugLine="End Sub";
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
public static void  _campanel_picturetaken(byte[] _data) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "campanel_picturetaken", false))
	 {Debug.delegate(mostCurrent.activityBA, "campanel_picturetaken", new Object[] {_data}); return;}
ResumableSub_camPanel_PictureTaken rsub = new ResumableSub_camPanel_PictureTaken(null,_data);
rsub.resume(processBA, null);
}
public static class ResumableSub_camPanel_PictureTaken extends BA.ResumableSub {
public ResumableSub_camPanel_PictureTaken(xevolution.vrcg.devdemov2400.cameraactivity2 parent,byte[] _data) {
this.parent = parent;
this._data = _data;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
byte[] _data;
String _datename = "";
String _datetimename = "";
String _datetimedb = "";
String _filename = "";
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cmes = null;
boolean _flipv = false;
boolean _fliph = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _flp = null;
boolean _requestsuccessful = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _cvsrect = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
String _lat = "";
String _lon = "";
String _newdatetimename = "";
String _ssql = "";
String _stamp = "";
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drect = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bc1 = null;
xevolution.vrcg.devdemov2400.types._shotfoto _thefoto = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125173761;
 //BA.debugLineNum = 125173761;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
_datename = parent.mostCurrent._utils._makefilename /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=125173762;
 //BA.debugLineNum = 125173762;BA.debugLine="Dim DateTimeName As String = Utils.MakeDateTimeSl";
_datetimename = parent.mostCurrent._utils._makedatetimeslash2 /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=125173763;
 //BA.debugLineNum = 125173763;BA.debugLine="Dim DatetimeDB As String = Utils.GetCurrDatetimeE";
_datetimedb = parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=125173764;
 //BA.debugLineNum = 125173764;BA.debugLine="CurrentFileName = $\"IMG-${DateName}-${Counter}\"$";
parent.mostCurrent._currentfilename = ("IMG-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datename))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._counter))+"");
RDebugUtils.currentLine=125173765;
 //BA.debugLineNum = 125173765;BA.debugLine="Dim filename As String = $\"${CurrentFileName}.png";
_filename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._currentfilename))+".png");
RDebugUtils.currentLine=125173766;
 //BA.debugLineNum = 125173766;BA.debugLine="If LastFileName = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._lastfilename).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=125173767;
 //BA.debugLineNum = 125173767;BA.debugLine="LastFileName = filename";
parent._lastfilename = _filename;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=125173770;
 //BA.debugLineNum = 125173770;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
parent._shotfilelocation = parent.mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=125173772;
 //BA.debugLineNum = 125173772;BA.debugLine="If Starter.Params.CFG_TAKE_PICTURE_ALWAYS_AS_NEW";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.mostCurrent._starter._params /*xevolution.vrcg.devdemov2400.configparameters*/ ._cfg_take_picture_always_as_new /*int*/ ==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=125173773;
 //BA.debugLineNum = 125173773;BA.debugLine="filename = LastFileName";
_filename = parent._lastfilename;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=125173778;
 //BA.debugLineNum = 125173778;BA.debugLine="ShotFileName = filename";
parent._shotfilename = _filename;
RDebugUtils.currentLine=125173779;
 //BA.debugLineNum = 125173779;BA.debugLine="Dim cmes As CameraSize = camEx.GetPictureSize";
_cmes = parent.mostCurrent._camex._getpicturesize /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=125173781;
 //BA.debugLineNum = 125173781;BA.debugLine="camEx.SavePictureToFile(Data, ShotFileLocation, S";
parent.mostCurrent._camex._savepicturetofile /*String*/ (null,_data,parent._shotfilelocation,parent._shotfilename);
RDebugUtils.currentLine=125173785;
 //BA.debugLineNum = 125173785;BA.debugLine="Dim FlipV As Boolean = Utils.Int2Bool(ShareCode.D";
_flipv = parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_param_inverted_foto_device /*int*/ );
RDebugUtils.currentLine=125173786;
 //BA.debugLineNum = 125173786;BA.debugLine="Dim FlipH As Boolean = Utils.Int2Bool(ShareCode.D";
_fliph = parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_param_inverted_horiz_foto_device /*int*/ );
RDebugUtils.currentLine=125173797;
 //BA.debugLineNum = 125173797;BA.debugLine="If (FlipV) Or (FlipV) Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_flipv) || (_flipv)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=125173798;
 //BA.debugLineNum = 125173798;BA.debugLine="Dim flp As ResumableSub = FlipPicture(ShotFileLo";
_flp = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_flp = _flippicture(parent._shotfilelocation,parent._shotfilename,_flipv,_fliph);
RDebugUtils.currentLine=125173799;
 //BA.debugLineNum = 125173799;BA.debugLine="Wait For(flp) Complete (RequestSuccessful As Boo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "campanel_picturetaken"), _flp);
this.state = 32;
return;
case 32:
//C
this.state = 12;
_requestsuccessful = (Boolean) result[0];
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=125173806;
 //BA.debugLineNum = 125173806;BA.debugLine="Dim fnt As B4XFont = xui.CreateDefaultFont(ShareC";
_fnt = parent._xui.CreateDefaultFont((float) (parent.mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=125173807;
 //BA.debugLineNum = 125173807;BA.debugLine="Dim cvsRect As B4XRect";
_cvsrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=125173808;
 //BA.debugLineNum = 125173808;BA.debugLine="Dim cvs As B4XCanvas = CreateCanvas(cmes.Width, c";
_cvs = _createcanvas(_cmes.Width /*int*/ ,_cmes.Height /*int*/ );
RDebugUtils.currentLine=125173809;
 //BA.debugLineNum = 125173809;BA.debugLine="cvsRect.Initialize(0,0,cmes.Width, cmes.Height)";
_cvsrect.Initialize((float) (0),(float) (0),(float) (_cmes.Width /*int*/ ),(float) (_cmes.Height /*int*/ ));
RDebugUtils.currentLine=125173810;
 //BA.debugLineNum = 125173810;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmap(ShotFileLocation, S";
_cvs.DrawBitmap((android.graphics.Bitmap)(parent._xui.LoadBitmap(parent._shotfilelocation,parent._shotfilename).getObject()),_cvsrect);
RDebugUtils.currentLine=125173811;
 //BA.debugLineNum = 125173811;BA.debugLine="Dim lat As String = LocationService.GeoLocal.lat";
_lat = parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ;
RDebugUtils.currentLine=125173812;
 //BA.debugLineNum = 125173812;BA.debugLine="Dim lon As String = LocationService.GeoLocal.lon";
_lon = parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ;
RDebugUtils.currentLine=125173817;
 //BA.debugLineNum = 125173817;BA.debugLine="If LocationService.GeoLocal.lat=\"Null\" Then";
if (true) break;

case 13:
//if
this.state = 18;
if ((parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ).equals("Null")) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=125173818;
 //BA.debugLineNum = 125173818;BA.debugLine="ToastMessageShow(\"Falha na obtencão de coordenad";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Falha na obtencão de coordenadas GPS"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=125173819;
 //BA.debugLineNum = 125173819;BA.debugLine="Dim NewDateTimeName As String = $\"${DateTimeName";
_newdatetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimename))+"  -  -/-");
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=125173821;
 //BA.debugLineNum = 125173821;BA.debugLine="Dim NewDateTimeName As String = $\"${DateTimeName";
_newdatetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datetimename))+"  -  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lat))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lon))+"");
 if (true) break;
;
RDebugUtils.currentLine=125173826;
 //BA.debugLineNum = 125173826;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"printcri";

case 18:
//if
this.state = 21;
if (((parent.mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("printcriativa"))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=125173827;
 //BA.debugLineNum = 125173827;BA.debugLine="Dim sSQL As String = $\"select ' - '||c.title_imp";
_ssql = ("select ' - '||c.title_import||' - '||d.title_import as stampname\n"+"								from dta_requests as a\n"+"								LEFT JOIN dta_objects AS c ON (c.tagcode=a.entity_tagcode)\n"+"								LEFT JOIN dta_objects AS d ON (d.tagcode=a.object_tagcode)\n"+"								where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._currentclaitem.Request /*String*/ .trim()))+"'");
RDebugUtils.currentLine=125173832;
 //BA.debugLineNum = 125173832;BA.debugLine="Dim stamp As String = DBStructures.GetScriptColu";
_stamp = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,_ssql,"stampname");
RDebugUtils.currentLine=125173833;
 //BA.debugLineNum = 125173833;BA.debugLine="NewDateTimeName = $\"${stamp}\"$";
_newdatetimename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stamp))+"");
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=125173838;
 //BA.debugLineNum = 125173838;BA.debugLine="Dim dRect As B4XRect";
_drect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=125173842;
 //BA.debugLineNum = 125173842;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 22:
//if
this.state = 27;
if ((parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=125173843;
 //BA.debugLineNum = 125173843;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCo";
_f = parent._xui.CreateDefaultFont((float) (parent.mostCurrent._sharecode._device_def_font_size /*int*/ /(double)2));
RDebugUtils.currentLine=125173844;
 //BA.debugLineNum = 125173844;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.";
_drect.Initialize((float) (_cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getWidth()-10),_cvs.getTargetRect().getHeight());
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=125173846;
 //BA.debugLineNum = 125173846;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCo";
_f = parent._xui.CreateDefaultFont((float) (parent.mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=125173847;
 //BA.debugLineNum = 125173847;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.";
_drect.Initialize((float) (_cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (_cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (18))),(float) (_cvs.getTargetRect().getWidth()-10),_cvs.getTargetRect().getHeight());
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=125173852;
 //BA.debugLineNum = 125173852;BA.debugLine="DrawTextWithBorder2(cvs, NewDateTimeName, f, Cons";
_drawtextwithborder2(_cvs,_newdatetimename,_f,parent.mostCurrent._consts._colordarkgray /*int*/ ,(int) ((_drect.getLeft()+_drect.getRight())/(double)2),(int) ((_drect.getTop()+_drect.getBottom())/(double)2),(int) (1),(int) (0));
RDebugUtils.currentLine=125173854;
 //BA.debugLineNum = 125173854;BA.debugLine="Log($\"${ShareCode.DEVICE_DEF_QUALITY}, ${ShareCod";
anywheresoftware.b4a.keywords.Common.LogImpl("6125173854",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._device_def_quality /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._device_def_img_filetype /*String*/ ))+""),0);
RDebugUtils.currentLine=125173856;
 //BA.debugLineNum = 125173856;BA.debugLine="cvs.Invalidate";
_cvs.Invalidate();
RDebugUtils.currentLine=125173859;
 //BA.debugLineNum = 125173859;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(parent._shotfilelocation,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._shotfilename))+""),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=125173860;
 //BA.debugLineNum = 125173860;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
_cvs.CreateBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),parent.mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,parent.mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=125173861;
 //BA.debugLineNum = 125173861;BA.debugLine="cvs.Release";
_cvs.Release();
RDebugUtils.currentLine=125173862;
 //BA.debugLineNum = 125173862;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=125173864;
 //BA.debugLineNum = 125173864;BA.debugLine="Dim bc1 As B4XBitmap =  xui.LoadBitmapResize(Shot";
_bc1 = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bc1 = parent._xui.LoadBitmapResize(parent._shotfilelocation,parent._shotfilename,parent.mostCurrent._showpictureimage.getWidth(),parent.mostCurrent._showpictureimage.getHeight(),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=125173865;
 //BA.debugLineNum = 125173865;BA.debugLine="showPictureImage.SetBackgroundImage(bc1)";
parent.mostCurrent._showpictureimage.SetBackgroundImageNew((android.graphics.Bitmap)(_bc1.getObject()));
RDebugUtils.currentLine=125173866;
 //BA.debugLineNum = 125173866;BA.debugLine="ShowPreviewShot(True)";
_showpreviewshot(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=125173870;
 //BA.debugLineNum = 125173870;BA.debugLine="Dim theFoto As ShotFoto = Types.MakeShotFoto(Shot";
_thefoto = parent.mostCurrent._types._makeshotfoto /*xevolution.vrcg.devdemov2400.types._shotfoto*/ (mostCurrent.activityBA,parent._shotfilename,_datetimedb,_lat,_lon,_newdatetimename);
RDebugUtils.currentLine=125173872;
 //BA.debugLineNum = 125173872;BA.debugLine="CamShots.Add(theFoto)";
parent._camshots.Add((Object)(_thefoto));
RDebugUtils.currentLine=125173873;
 //BA.debugLineNum = 125173873;BA.debugLine="If StayOnCamera Then";
if (true) break;

case 28:
//if
this.state = 31;
if (parent._stayoncamera) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=125173874;
 //BA.debugLineNum = 125173874;BA.debugLine="camEx.StartPreview 'restart preview";
parent.mostCurrent._camex._startpreview /*String*/ (null);
RDebugUtils.currentLine=125173875;
 //BA.debugLineNum = 125173875;BA.debugLine="Counter = Counter + 1";
parent._counter = (int) (parent._counter+1);
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=125173877;
 //BA.debugLineNum = 125173877;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "campanel_picturetaken"),(int) (500));
this.state = 33;
return;
case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=125173878;
 //BA.debugLineNum = 125173878;BA.debugLine="ShowPreviewShot(False)";
_showpreviewshot(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=125173879;
 //BA.debugLineNum = 125173879;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _flippicture(String _imglocation,String _imgfilename,boolean _flipvert,boolean _fliphoriz) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "flippicture", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "flippicture", new Object[] {_imglocation,_imgfilename,_flipvert,_fliphoriz}));}
ResumableSub_FlipPicture rsub = new ResumableSub_FlipPicture(null,_imglocation,_imgfilename,_flipvert,_fliphoriz);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FlipPicture extends BA.ResumableSub {
public ResumableSub_FlipPicture(xevolution.vrcg.devdemov2400.cameraactivity2 parent,String _imglocation,String _imgfilename,boolean _flipvert,boolean _fliphoriz) {
this.parent = parent;
this._imglocation = _imglocation;
this._imgfilename = _imgfilename;
this._flipvert = _flipvert;
this._fliphoriz = _fliphoriz;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
String _imglocation;
String _imgfilename;
boolean _flipvert;
boolean _fliphoriz;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmapin = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _canvasout = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _destrect = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125108226;
 //BA.debugLineNum = 125108226;BA.debugLine="Try";
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
RDebugUtils.currentLine=125108227;
 //BA.debugLineNum = 125108227;BA.debugLine="Dim BitmapIn As Bitmap = LoadBitmap(ImgLocation,";
_bitmapin = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bitmapin = anywheresoftware.b4a.keywords.Common.LoadBitmap(_imglocation,_imgfilename);
RDebugUtils.currentLine=125108228;
 //BA.debugLineNum = 125108228;BA.debugLine="Dim CanvasOut As Canvas";
_canvasout = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=125108229;
 //BA.debugLineNum = 125108229;BA.debugLine="Dim DestRect As Rect";
_destrect = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=125108230;
 //BA.debugLineNum = 125108230;BA.debugLine="DestRect.Initialize(0,0,BitmapIn.Width,BitmapIn.";
_destrect.Initialize((int) (0),(int) (0),_bitmapin.getWidth(),_bitmapin.getHeight());
RDebugUtils.currentLine=125108231;
 //BA.debugLineNum = 125108231;BA.debugLine="CanvasOut.Initialize(Activity)";
_canvasout.Initialize((android.view.View)(parent.mostCurrent._activity.getObject()));
RDebugUtils.currentLine=125108232;
 //BA.debugLineNum = 125108232;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=125108234;
 //BA.debugLineNum = 125108234;BA.debugLine="CanvasOut.DrawBitmapFlipped(BitmapIn, Null, Dest";
_canvasout.DrawBitmapFlipped((android.graphics.Bitmap)(_bitmapin.getObject()),(android.graphics.Rect)(anywheresoftware.b4a.keywords.Common.Null),(android.graphics.Rect)(_destrect.getObject()),_flipvert,_fliphoriz);
RDebugUtils.currentLine=125108236;
 //BA.debugLineNum = 125108236;BA.debugLine="out = File.OpenOutput(ImgLocation, ImgFilename,";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_imglocation,_imgfilename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=125108237;
 //BA.debugLineNum = 125108237;BA.debugLine="CanvasOut.Bitmap.WriteToStream(out, 100, \"PNG\")";
_canvasout.getBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=125108238;
 //BA.debugLineNum = 125108238;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=125108239;
 //BA.debugLineNum = 125108239;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=125108241;
 //BA.debugLineNum = 125108241;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6125108241",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=125108242;
 //BA.debugLineNum = 125108242;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=125108245;
 //BA.debugLineNum = 125108245;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.objects.B4XCanvas  _createcanvas(int _width,int _height) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcanvas", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas) Debug.delegate(mostCurrent.activityBA, "createcanvas", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
RDebugUtils.currentLine=124911616;
 //BA.debugLineNum = 124911616;BA.debugLine="Private Sub CreateCanvas(width As Int, height As I";
RDebugUtils.currentLine=124911617;
 //BA.debugLineNum = 124911617;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=124911618;
 //BA.debugLineNum = 124911618;BA.debugLine="If width <= 0 Then width = 1";
if (_width<=0) { 
_width = (int) (1);};
RDebugUtils.currentLine=124911619;
 //BA.debugLineNum = 124911619;BA.debugLine="If height <=0 Then height = 1";
if (_height<=0) { 
_height = (int) (1);};
RDebugUtils.currentLine=124911620;
 //BA.debugLineNum = 124911620;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, height)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=124911621;
 //BA.debugLineNum = 124911621;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=124911622;
 //BA.debugLineNum = 124911622;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
RDebugUtils.currentLine=124911623;
 //BA.debugLineNum = 124911623;BA.debugLine="Return cvs";
if (true) return _cvs;
RDebugUtils.currentLine=124911624;
 //BA.debugLineNum = 124911624;BA.debugLine="End Sub";
return null;
}
public static String  _drawtextwithborder2(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder2", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _ro = null;
RDebugUtils.currentLine=125370368;
 //BA.debugLineNum = 125370368;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
RDebugUtils.currentLine=125370370;
 //BA.debugLineNum = 125370370;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=125370371;
 //BA.debugLineNum = 125370371;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=125370372;
 //BA.debugLineNum = 125370372;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=125370374;
 //BA.debugLineNum = 125370374;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=125370376;
 //BA.debugLineNum = 125370376;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=125370377;
 //BA.debugLineNum = 125370377;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=125370378;
 //BA.debugLineNum = 125370378;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=125370380;
 //BA.debugLineNum = 125370380;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=125370381;
 //BA.debugLineNum = 125370381;BA.debugLine="Dim ro As B4XRect";
_ro = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=125370382;
 //BA.debugLineNum = 125370382;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
_ro.Initialize((float) (_r.getLeft()-_border),(float) (_r.getTop()-_border),(float) (_r.getRight()+_border),(float) (_r.getBottom()+_border));
RDebugUtils.currentLine=125370383;
 //BA.debugLineNum = 125370383;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
_cvs1.DrawRect(_ro,_clr,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
RDebugUtils.currentLine=125370384;
 //BA.debugLineNum = 125370384;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
 };
RDebugUtils.currentLine=125370387;
 //BA.debugLineNum = 125370387;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=125370388;
 //BA.debugLineNum = 125370388;BA.debugLine="End Sub";
return "";
}
public static String  _showpreviewshot(boolean _state) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showpreviewshot", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showpreviewshot", new Object[] {_state}));}
RDebugUtils.currentLine=125239296;
 //BA.debugLineNum = 125239296;BA.debugLine="Sub ShowPreviewShot(state As Boolean)";
RDebugUtils.currentLine=125239297;
 //BA.debugLineNum = 125239297;BA.debugLine="showPicturePanel.Visible = state";
mostCurrent._showpicturepanel.setVisible(_state);
RDebugUtils.currentLine=125239298;
 //BA.debugLineNum = 125239298;BA.debugLine="butCloseCamera.Enabled = Not(showPicturePanel.Vis";
mostCurrent._butclosecamera.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=125239299;
 //BA.debugLineNum = 125239299;BA.debugLine="btnTakePicture.Enabled = Not(showPicturePanel.Vis";
mostCurrent._btntakepicture.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=125239300;
 //BA.debugLineNum = 125239300;BA.debugLine="butSavePicture.Enabled = Not(showPicturePanel.Vis";
mostCurrent._butsavepicture.setEnabled(anywheresoftware.b4a.keywords.Common.Not(mostCurrent._showpicturepanel.getVisible()));
RDebugUtils.currentLine=125239301;
 //BA.debugLineNum = 125239301;BA.debugLine="End Sub";
return "";
}
public static String  _campanel_ready(boolean _success) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "campanel_ready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "campanel_ready", new Object[] {_success}));}
anywheresoftware.b4a.objects.collections.List _fm = null;
int _n = 0;
RDebugUtils.currentLine=124583936;
 //BA.debugLineNum = 124583936;BA.debugLine="Sub camPanel_Ready (Success As Boolean)";
RDebugUtils.currentLine=124583937;
 //BA.debugLineNum = 124583937;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=124583938;
 //BA.debugLineNum = 124583938;BA.debugLine="camEx.SetJpegQuality(ShareCode.DEVICE_DEF_QUALIT";
mostCurrent._camex._setjpegquality /*String*/ (null,mostCurrent._sharecode._device_def_quality /*int*/ );
RDebugUtils.currentLine=124583939;
 //BA.debugLineNum = 124583939;BA.debugLine="camEx.SetPictureSize(ShareCode.DEVICE_DEF_IMG_WI";
mostCurrent._camex._setpicturesize /*String*/ (null,mostCurrent._sharecode._device_def_img_width /*int*/ ,mostCurrent._sharecode._device_def_img_height /*int*/ );
RDebugUtils.currentLine=124583940;
 //BA.debugLineNum = 124583940;BA.debugLine="camEx.SetContinuousAutoFocus";
mostCurrent._camex._setcontinuousautofocus /*String*/ (null);
RDebugUtils.currentLine=124583941;
 //BA.debugLineNum = 124583941;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=124583942;
 //BA.debugLineNum = 124583942;BA.debugLine="camEx.StartPreview";
mostCurrent._camex._startpreview /*String*/ (null);
RDebugUtils.currentLine=124583944;
 //BA.debugLineNum = 124583944;BA.debugLine="HasFocus = False";
_hasfocus = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=124583945;
 //BA.debugLineNum = 124583945;BA.debugLine="btnFocus.Enabled = False";
mostCurrent._btnfocus.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=124583946;
 //BA.debugLineNum = 124583946;BA.debugLine="Dim fm As List = camEx.GetSupportedFocusModes";
_fm = new anywheresoftware.b4a.objects.collections.List();
_fm = mostCurrent._camex._getsupportedfocusmodes /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=124583947;
 //BA.debugLineNum = 124583947;BA.debugLine="For n=0 To fm.Size -1";
{
final int step10 = 1;
final int limit10 = (int) (_fm.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit10 ;_n = _n + step10 ) {
RDebugUtils.currentLine=124583948;
 //BA.debugLineNum = 124583948;BA.debugLine="If fm.Get(n) = \"auto\" Then";
if ((_fm.Get(_n)).equals((Object)("auto"))) { 
RDebugUtils.currentLine=124583949;
 //BA.debugLineNum = 124583949;BA.debugLine="HasFocus = True";
_hasfocus = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=124583950;
 //BA.debugLineNum = 124583950;BA.debugLine="btnFocus.Enabled = True";
mostCurrent._btnfocus.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 }
};
 }else {
RDebugUtils.currentLine=124583955;
 //BA.debugLineNum = 124583955;BA.debugLine="ToastMessageShow(\"Não é possível abrir a camera.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Não é possível abrir a camera."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=124583957;
 //BA.debugLineNum = 124583957;BA.debugLine="End Sub";
return "";
}
public static String  _camzoom_valuechanged(int _value,boolean _userchanged) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "camzoom_valuechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "camzoom_valuechanged", new Object[] {_value,_userchanged}));}
RDebugUtils.currentLine=125763584;
 //BA.debugLineNum = 125763584;BA.debugLine="Sub camZoom_ValueChanged (Value As Int, UserChange";
RDebugUtils.currentLine=125763585;
 //BA.debugLineNum = 125763585;BA.debugLine="If UserChanged = False Or camEx.IsZoomSupported =";
if (_userchanged==anywheresoftware.b4a.keywords.Common.False || mostCurrent._camex._iszoomsupported /*boolean*/ (null)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=125763586;
 //BA.debugLineNum = 125763586;BA.debugLine="camEx.Zoom = Value / 100 * camEx.GetMaxZoom";
mostCurrent._camex._setzoom /*int*/ (null,(int) (_value/(double)100*mostCurrent._camex._getmaxzoom /*int*/ (null)));
RDebugUtils.currentLine=125763587;
 //BA.debugLineNum = 125763587;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=125763588;
 //BA.debugLineNum = 125763588;BA.debugLine="End Sub";
return "";
}
public static String  _changecamera_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changecamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changecamera_click", null));}
RDebugUtils.currentLine=125501440;
 //BA.debugLineNum = 125501440;BA.debugLine="Sub ChangeCamera_Click";
RDebugUtils.currentLine=125501441;
 //BA.debugLineNum = 125501441;BA.debugLine="If Starter.Params.CFG_ALLOW_FRONT_CAMERA = 1 Then";
if (mostCurrent._starter._params /*xevolution.vrcg.devdemov2400.configparameters*/ ._cfg_allow_front_camera /*int*/ ==1) { 
RDebugUtils.currentLine=125501442;
 //BA.debugLineNum = 125501442;BA.debugLine="camEx.Release";
mostCurrent._camex._release /*String*/ (null);
RDebugUtils.currentLine=125501443;
 //BA.debugLineNum = 125501443;BA.debugLine="frontCamera = Not(frontCamera)";
_frontcamera = anywheresoftware.b4a.keywords.Common.Not(_frontcamera);
RDebugUtils.currentLine=125501444;
 //BA.debugLineNum = 125501444;BA.debugLine="InitializeCamera";
_initializecamera();
 }else {
RDebugUtils.currentLine=125501446;
 //BA.debugLineNum = 125501446;BA.debugLine="ToastMessageShow(\"Apenas a camera traseira está";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Apenas a camera traseira está activa."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=125501448;
 //BA.debugLineNum = 125501448;BA.debugLine="End Sub";
return "";
}
public static String  _initializecamera() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "initializecamera", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "initializecamera", null));}
RDebugUtils.currentLine=124518400;
 //BA.debugLineNum = 124518400;BA.debugLine="Private Sub InitializeCamera";
RDebugUtils.currentLine=124518401;
 //BA.debugLineNum = 124518401;BA.debugLine="Try";
try {RDebugUtils.currentLine=124518402;
 //BA.debugLineNum = 124518402;BA.debugLine="If (Starter.APP_CAMERA_ACCESS) Then";
if ((mostCurrent._starter._app_camera_access /*boolean*/ )) { 
RDebugUtils.currentLine=124518403;
 //BA.debugLineNum = 124518403;BA.debugLine="camEx.Initialize(camPanel, frontCamera, Me, \"ca";
mostCurrent._camex._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._campanel,_frontcamera,cameraactivity2.getObject(),"camPanel");
RDebugUtils.currentLine=124518404;
 //BA.debugLineNum = 124518404;BA.debugLine="frontCamera = camEx.Front";
_frontcamera = mostCurrent._camex._front /*boolean*/ ;
 }else {
RDebugUtils.currentLine=124518406;
 //BA.debugLineNum = 124518406;BA.debugLine="ToastMessageShow(\"Sem Permissão!!!\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Sem Permissão!!!"),anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=124518409;
 //BA.debugLineNum = 124518409;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("6124518409",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 };
RDebugUtils.currentLine=124518419;
 //BA.debugLineNum = 124518419;BA.debugLine="End Sub";
return "";
}
public static String  _closeactivity() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closeactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "closeactivity", null));}
RDebugUtils.currentLine=125894656;
 //BA.debugLineNum = 125894656;BA.debugLine="Public Sub CloseActivity";
RDebugUtils.currentLine=125894657;
 //BA.debugLineNum = 125894657;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=125894658;
 //BA.debugLineNum = 125894658;BA.debugLine="End Sub";
return "";
}
public static Object  _createfileprovideruri(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createfileprovideruri", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "createfileprovideruri", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.object.JavaObject _fileprovider1 = null;
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _f = null;
RDebugUtils.currentLine=125829120;
 //BA.debugLineNum = 125829120;BA.debugLine="Sub CreateFileProviderUri (Dir As String, FileName";
RDebugUtils.currentLine=125829121;
 //BA.debugLineNum = 125829121;BA.debugLine="Dim FileProvider1 As JavaObject";
_fileprovider1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=125829122;
 //BA.debugLineNum = 125829122;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=125829123;
 //BA.debugLineNum = 125829123;BA.debugLine="context.InitializeContext";
_context.InitializeContext(processBA);
RDebugUtils.currentLine=125829124;
 //BA.debugLineNum = 125829124;BA.debugLine="FileProvider1.InitializeStatic(\"android.support.v";
_fileprovider1.InitializeStatic("androidx.core.content.FileProvider");
RDebugUtils.currentLine=125829125;
 //BA.debugLineNum = 125829125;BA.debugLine="Dim f As JavaObject";
_f = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=125829126;
 //BA.debugLineNum = 125829126;BA.debugLine="f.InitializeNewInstance(\"java.io.File\", Array(Dir";
_f.InitializeNewInstance("java.io.File",new Object[]{(Object)(_dir),(Object)(_filename)});
RDebugUtils.currentLine=125829127;
 //BA.debugLineNum = 125829127;BA.debugLine="Return FileProvider1.RunMethod(\"getUriForFile\", A";
if (true) return _fileprovider1.RunMethod("getUriForFile",new Object[]{(Object)(_context.getObject()),(Object)(anywheresoftware.b4a.keywords.Common.Application.getPackageName()+".provider"),(Object)(_f.getObject())});
RDebugUtils.currentLine=125829128;
 //BA.debugLineNum = 125829128;BA.debugLine="End Sub";
return null;
}
public static String  _drawtextwithborder(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=125304832;
 //BA.debugLineNum = 125304832;BA.debugLine="Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As";
RDebugUtils.currentLine=125304834;
 //BA.debugLineNum = 125304834;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=125304835;
 //BA.debugLineNum = 125304835;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
_baseline = (int) (_centery-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=125304836;
 //BA.debugLineNum = 125304836;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=125304839;
 //BA.debugLineNum = 125304839;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=125304840;
 //BA.debugLineNum = 125304840;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=125304841;
 //BA.debugLineNum = 125304841;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=125304843;
 //BA.debugLineNum = 125304843;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=125304844;
 //BA.debugLineNum = 125304844;BA.debugLine="cvs1.DrawRect(r, Clr, False, border)";
_cvs1.DrawRect(_r,_clr,anywheresoftware.b4a.keywords.Common.False,(float) (_border));
 };
RDebugUtils.currentLine=125304846;
 //BA.debugLineNum = 125304846;BA.debugLine="End Sub";
return "";
}
public static String  _drawtextwithborder2phone(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder2phone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder2phone", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _ro = null;
RDebugUtils.currentLine=125435904;
 //BA.debugLineNum = 125435904;BA.debugLine="Sub DrawTextWithBorder2Phone (cvs1 As B4XCanvas, T";
RDebugUtils.currentLine=125435906;
 //BA.debugLineNum = 125435906;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=125435907;
 //BA.debugLineNum = 125435907;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=125435908;
 //BA.debugLineNum = 125435908;BA.debugLine="r.Width = r.Width + (r.Width /2) + 50dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))));
RDebugUtils.currentLine=125435910;
 //BA.debugLineNum = 125435910;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=125435912;
 //BA.debugLineNum = 125435912;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=125435913;
 //BA.debugLineNum = 125435913;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=125435914;
 //BA.debugLineNum = 125435914;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=125435916;
 //BA.debugLineNum = 125435916;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=125435917;
 //BA.debugLineNum = 125435917;BA.debugLine="Dim ro As B4XRect";
_ro = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=125435918;
 //BA.debugLineNum = 125435918;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
_ro.Initialize((float) (_r.getLeft()-_border),(float) (_r.getTop()-_border),(float) (_r.getRight()+_border),(float) (_r.getBottom()+_border));
RDebugUtils.currentLine=125435919;
 //BA.debugLineNum = 125435919;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
_cvs1.DrawRect(_ro,_clr,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
RDebugUtils.currentLine=125435920;
 //BA.debugLineNum = 125435920;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
 };
RDebugUtils.currentLine=125435923;
 //BA.debugLineNum = 125435923;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=125435924;
 //BA.debugLineNum = 125435924;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.cameraexclass._camerasize  _getcamsize(int _width,int _height) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getcamsize", false))
	 {return ((xevolution.vrcg.devdemov2400.cameraexclass._camerasize) Debug.delegate(mostCurrent.activityBA, "getcamsize", new Object[] {_width,_height}));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _ret = null;
RDebugUtils.currentLine=124846080;
 //BA.debugLineNum = 124846080;BA.debugLine="Sub getCamsize(Width As Int, Height As Int) As Cam";
RDebugUtils.currentLine=124846081;
 //BA.debugLineNum = 124846081;BA.debugLine="Dim ret As CameraSize";
_ret = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=124846082;
 //BA.debugLineNum = 124846082;BA.debugLine="ret.initialize";
_ret.Initialize();
RDebugUtils.currentLine=124846083;
 //BA.debugLineNum = 124846083;BA.debugLine="ret.Width = Width";
_ret.Width /*int*/  = _width;
RDebugUtils.currentLine=124846084;
 //BA.debugLineNum = 124846084;BA.debugLine="ret.Height = Height";
_ret.Height /*int*/  = _height;
RDebugUtils.currentLine=124846085;
 //BA.debugLineNum = 124846085;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=124846086;
 //BA.debugLineNum = 124846086;BA.debugLine="End Sub";
return null;
}
public static byte[]  _imagetobytes(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _image) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imagetobytes", false))
	 {return ((byte[]) Debug.delegate(mostCurrent.activityBA, "imagetobytes", new Object[] {_image}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=124977152;
 //BA.debugLineNum = 124977152;BA.debugLine="Public Sub ImageToBytes(Image As B4XBitmap) As Byt";
RDebugUtils.currentLine=124977153;
 //BA.debugLineNum = 124977153;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=124977154;
 //BA.debugLineNum = 124977154;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=124977155;
 //BA.debugLineNum = 124977155;BA.debugLine="Image.WriteToStream(out, ShareCode.DEVICE_DEF_QUA";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=124977156;
 //BA.debugLineNum = 124977156;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=124977157;
 //BA.debugLineNum = 124977157;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
RDebugUtils.currentLine=124977158;
 //BA.debugLineNum = 124977158;BA.debugLine="End Sub";
return null;
}
public static String  _setminimumsize() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setminimumsize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setminimumsize", null));}
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _mincs = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cs = null;
RDebugUtils.currentLine=124649472;
 //BA.debugLineNum = 124649472;BA.debugLine="Private Sub SetMinimumSize";
RDebugUtils.currentLine=124649473;
 //BA.debugLineNum = 124649473;BA.debugLine="Dim minCS As CameraSize";
_mincs = new xevolution.vrcg.devdemov2400.cameraexclass._camerasize();
RDebugUtils.currentLine=124649474;
 //BA.debugLineNum = 124649474;BA.debugLine="For Each cs As CameraSize In camEx.GetSupportedPi";
{
final xevolution.vrcg.devdemov2400.cameraexclass._camerasize[] group2 = mostCurrent._camex._getsupportedpicturessizes /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize[]*/ (null);
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_cs = group2[index2];
RDebugUtils.currentLine=124649475;
 //BA.debugLineNum = 124649475;BA.debugLine="If minCS.Width = 0 Then";
if (_mincs.Width /*int*/ ==0) { 
RDebugUtils.currentLine=124649476;
 //BA.debugLineNum = 124649476;BA.debugLine="minCS = cs";
_mincs = _cs;
 }else {
RDebugUtils.currentLine=124649478;
 //BA.debugLineNum = 124649478;BA.debugLine="If Power(minCS.Width, 2) + Power(minCS.Height,";
if (anywheresoftware.b4a.keywords.Common.Power(_mincs.Width /*int*/ ,2)+anywheresoftware.b4a.keywords.Common.Power(_mincs.Height /*int*/ ,2)>anywheresoftware.b4a.keywords.Common.Power(_cs.Width /*int*/ ,2)+anywheresoftware.b4a.keywords.Common.Power(_cs.Height /*int*/ ,2)) { 
RDebugUtils.currentLine=124649479;
 //BA.debugLineNum = 124649479;BA.debugLine="minCS = cs";
_mincs = _cs;
 };
 };
 }
};
RDebugUtils.currentLine=124649483;
 //BA.debugLineNum = 124649483;BA.debugLine="camEx.SetPictureSize(minCS.Width, minCS.Height)";
mostCurrent._camex._setpicturesize /*String*/ (null,_mincs.Width /*int*/ ,_mincs.Height /*int*/ );
RDebugUtils.currentLine=124649484;
 //BA.debugLineNum = 124649484;BA.debugLine="End Sub";
return "";
}
public static String  _showpictureclose_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showpictureclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showpictureclose_click", null));}
RDebugUtils.currentLine=126222336;
 //BA.debugLineNum = 126222336;BA.debugLine="Sub ShowPictureClose_Click";
RDebugUtils.currentLine=126222337;
 //BA.debugLineNum = 126222337;BA.debugLine="showPicturePanel.Visible = False";
mostCurrent._showpicturepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=126222338;
 //BA.debugLineNum = 126222338;BA.debugLine="End Sub";
return "";
}
public static String  _showpictureimage_click() throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showpictureimage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showpictureimage_click", null));}
RDebugUtils.currentLine=126353408;
 //BA.debugLineNum = 126353408;BA.debugLine="Sub showPictureImage_Click";
RDebugUtils.currentLine=126353411;
 //BA.debugLineNum = 126353411;BA.debugLine="LastOrigin = CurrentCLAItem.Origin";
_lastorigin = mostCurrent._currentclaitem.Origin /*int*/ ;
RDebugUtils.currentLine=126353412;
 //BA.debugLineNum = 126353412;BA.debugLine="CurrentCLAItem.Origin = 4";
mostCurrent._currentclaitem.Origin /*int*/  = (int) (4);
RDebugUtils.currentLine=126353413;
 //BA.debugLineNum = 126353413;BA.debugLine="CurrentFileName = ShotFileName";
mostCurrent._currentfilename = _shotfilename;
RDebugUtils.currentLine=126353415;
 //BA.debugLineNum = 126353415;BA.debugLine="End Sub";
return "";
}
public static String  _startcamera(Object _returntoactivity) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamera", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcamera", new Object[] {_returntoactivity}));}
RDebugUtils.currentLine=124125184;
 //BA.debugLineNum = 124125184;BA.debugLine="Public Sub StartCamera(ReturnToActivity As Object)";
RDebugUtils.currentLine=124125185;
 //BA.debugLineNum = 124125185;BA.debugLine="ReturnTo = ReturnToActivity";
_returnto = _returntoactivity;
RDebugUtils.currentLine=124125186;
 //BA.debugLineNum = 124125186;BA.debugLine="CurrentCLAItem = Types.MakeRequestCLAItem(\"__DUMM";
mostCurrent._currentclaitem = mostCurrent._types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (mostCurrent.activityBA,"__DUMMY__","__DUMMY__","__DUMMY__","__DUMMY__",mostCurrent._utils._udid /*String*/ (mostCurrent.activityBA),"__DUMMY__",(int) (0),(int) (0),(int) (0),"","","",(int) (1),(int) (0),(int) (0),"",mostCurrent._dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (mostCurrent.activityBA,"",""),"");
RDebugUtils.currentLine=124125190;
 //BA.debugLineNum = 124125190;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=124125191;
 //BA.debugLineNum = 124125191;BA.debugLine="End Sub";
return "";
}
public static String  _startcamera2(Object _returntoactivity,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamera2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcamera2", new Object[] {_returntoactivity,_claitem}));}
RDebugUtils.currentLine=124190720;
 //BA.debugLineNum = 124190720;BA.debugLine="Public Sub StartCamera2(ReturnToActivity As Object";
RDebugUtils.currentLine=124190721;
 //BA.debugLineNum = 124190721;BA.debugLine="ReturnTo = ReturnToActivity";
_returnto = _returntoactivity;
RDebugUtils.currentLine=124190722;
 //BA.debugLineNum = 124190722;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=124190723;
 //BA.debugLineNum = 124190723;BA.debugLine="ExitToDialog = True";
_exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=124190724;
 //BA.debugLineNum = 124190724;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=124190725;
 //BA.debugLineNum = 124190725;BA.debugLine="End Sub";
return "";
}
public static void  _startcamera3(xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="cameraactivity2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcamera3", false))
	 {Debug.delegate(mostCurrent.activityBA, "startcamera3", new Object[] {_claitem}); return;}
ResumableSub_StartCamera3 rsub = new ResumableSub_StartCamera3(null,_claitem);
rsub.resume(processBA, null);
}
public static class ResumableSub_StartCamera3 extends BA.ResumableSub {
public ResumableSub_StartCamera3(xevolution.vrcg.devdemov2400.cameraactivity2 parent,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) {
this.parent = parent;
this._claitem = _claitem;
}
xevolution.vrcg.devdemov2400.cameraactivity2 parent;
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cameraactivity2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=124256257;
 //BA.debugLineNum = 124256257;BA.debugLine="CurrentCLAItem = CLAItem";
parent.mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=124256258;
 //BA.debugLineNum = 124256258;BA.debugLine="ExitToDialog = True";
parent._exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=124256259;
 //BA.debugLineNum = 124256259;BA.debugLine="ReturnToName = \"checklist3\"";
parent.mostCurrent._returntoname = "checklist3";
RDebugUtils.currentLine=124256260;
 //BA.debugLineNum = 124256260;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cameraactivity2", "startcamera3"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=124256261;
 //BA.debugLineNum = 124256261;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=124256262;
 //BA.debugLineNum = 124256262;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}