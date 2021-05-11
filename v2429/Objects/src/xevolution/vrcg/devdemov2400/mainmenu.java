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

public class mainmenu extends Activity implements B4AActivity{
	public static mainmenu mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.mainmenu");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (mainmenu).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.mainmenu");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.mainmenu", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (mainmenu) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (mainmenu) Resume **");
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
		return mainmenu.class;
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
            BA.LogInfo("** Activity (mainmenu) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (mainmenu) Pause event (activity is not paused). **");
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
            mainmenu mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (mainmenu) Resume **");
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
public static anywheresoftware.b4a.objects.Timer _timestart = null;
public static boolean _appstarted = false;
public static int _mainshowdialogresult = 0;
public static boolean _started = false;
public static boolean _waittoconfirm = false;
public static String _currentloginuser = "";
public static boolean _islogindone = false;
public static boolean _ismainscreen = false;
public static anywheresoftware.b4a.phone.Phone _device = null;
public static boolean _isfirsttime = false;
public static boolean _requestauth = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public xevolution.vrcg.devdemov2400.badger _badgeritems = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainbasepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainbottompanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mainbuttonmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _maintopbar = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainbottomline = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public anywheresoftware.b4a.objects.PanelWrapper _maintopline = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabelinfo = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneloptions = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butquickaction = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcallcamera = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcallactions = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelappinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public xevolution.vrcg.devdemov2400.appdialogs _dialoglogin = null;
public xevolution.vrcg.devdemov2400.appdialogs _dialogauthorization = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.objects.collections.List _authversionslist = null;
public anywheresoftware.b4a.objects.PanelWrapper _cpbuttontasks = null;
public anywheresoftware.b4a.objects.PanelWrapper _cpbuttonrequests = null;
public anywheresoftware.b4a.objects.PanelWrapper _cpbuttonobjects = null;
public anywheresoftware.b4a.objects.PanelWrapper _cpbuttonuser = null;
public anywheresoftware.b4a.objects.PanelWrapper _cpbuttonkpi = null;
public anywheresoftware.b4a.objects.PanelWrapper _cpbuttonalerts = null;
public com.jakes.menuonviews.menuonanyview _mainpopmenu = null;
public anywheresoftware.b4a.objects.ListViewWrapper _mainpopmenulist = null;
public static boolean _lgo_passwordmode = false;
public static int _neterrortrycount = 0;
public b4a.example3.customlistview _customlistview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonactionpause = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonapplatency = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public static String _mainlayout = "";
public anywheresoftware.b4a.objects.PanelWrapper _lockpanel = null;
public anywheresoftware.b4a.objects.TabStripViewPager _mainmenutabstrip = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcallshort3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcallshort2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcallshort1 = null;
public b4a.example.bt_printer _printer = null;
public anywheresoftware.b4a.objects.Timer _updateservicetimer = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelavisoprocessamento = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfirstinstallconfig = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressoinicial2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltarefa = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressoinicial = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldownloadinicialfases = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldownloadinicialtitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldownloadinicial = null;
public xevolution.vrcg.devdemov2400.anotherdatepicker _datasyncmanual = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _currentcld = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonassociated = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonscanprinter = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewbluetoothdevices = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonprint = null;
public static String _printermessage = "";
public Object _currentprinterconnected = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsearch = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editsearch = null;
public anywheresoftware.b4a.objects.PanelWrapper _searchpanel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editsearchsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsearchsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsearchserver = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveusersearch = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogosearch = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progresssearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butactionsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butclosesearchpanel = null;
public b4a.example3.customlistview _expandlistsearch = null;
public anywheresoftware.b4a.objects.PanelWrapper _recordlinepanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlinetitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinemoreoptions = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlinetitlesecond = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsearchclear = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
public xevolution.vrcg.devdemov2400.main _main = null;
public xevolution.vrcg.devdemov2400.starter _starter = null;
public xevolution.vrcg.devdemov2400.comms _comms = null;
public xevolution.vrcg.devdemov2400.utils _utils = null;
public xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
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
public static String  _badgecheckupdate() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "badgecheckupdate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "badgecheckupdate", null));}
int _ori = 0;
int _userbadge = 0;
int _alertbadge = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _ssql = "";
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub BadgeCheckUpdate";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Dim Ori As Int = 0";
_ori = (int) (0);
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="Ori = 1";
_ori = (int) (1);
 };
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="If Not(BadgerItems.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._badgeritems.IsInitialized /*boolean*/ ())) { 
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="BadgerItems.Initialize";
mostCurrent._badgeritems._initialize /*String*/ (null,mostCurrent.activityBA);
 };
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="Try";
try {RDebugUtils.currentLine=24117260;
 //BA.debugLineNum = 24117260;BA.debugLine="Dim userBadge As Int = 0";
_userbadge = (int) (0);
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="If (ShareCode.UWDUKEY_DETAILS = 0) Then userBadg";
if ((mostCurrent._sharecode._uwdukey_details /*int*/ ==0)) { 
_userbadge = (int) (_userbadge+1);};
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="If (ShareCode.UWDUKEY_PRODUCTS = 0) Then userBad";
if ((mostCurrent._sharecode._uwdukey_products /*int*/ ==0)) { 
_userbadge = (int) (_userbadge+1);};
RDebugUtils.currentLine=24117263;
 //BA.debugLineNum = 24117263;BA.debugLine="If (CPButtonUser.IsInitialized) Then";
if ((mostCurrent._cpbuttonuser.IsInitialized())) { 
RDebugUtils.currentLine=24117264;
 //BA.debugLineNum = 24117264;BA.debugLine="If (userBadge >= 1) Then";
if ((_userbadge>=1)) { 
RDebugUtils.currentLine=24117265;
 //BA.debugLineNum = 24117265;BA.debugLine="BadgerItems.SetBadge(CPButtonUser, userBadge,";
mostCurrent._badgeritems._setbadge /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._cpbuttonuser.getObject())),_userbadge,_ori);
 }else {
RDebugUtils.currentLine=24117270;
 //BA.debugLineNum = 24117270;BA.debugLine="BadgerItems.SetBadge(CPButtonUser, 0, Ori)";
mostCurrent._badgeritems._setbadge /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._cpbuttonuser.getObject())),(int) (0),_ori);
 };
RDebugUtils.currentLine=24117275;
 //BA.debugLineNum = 24117275;BA.debugLine="BadgerItems.SetBadge(CPButtonUser, 0, Ori)";
mostCurrent._badgeritems._setbadge /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._cpbuttonuser.getObject())),(int) (0),_ori);
 };
 } 
       catch (Exception e21) {
			processBA.setLastException(e21);RDebugUtils.currentLine=24117278;
 //BA.debugLineNum = 24117278;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624117278",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=24117285;
 //BA.debugLineNum = 24117285;BA.debugLine="Try";
try {RDebugUtils.currentLine=24117286;
 //BA.debugLineNum = 24117286;BA.debugLine="Dim alertBadge As Int = 0";
_alertbadge = (int) (0);
RDebugUtils.currentLine=24117287;
 //BA.debugLineNum = 24117287;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=24117289;
 //BA.debugLineNum = 24117289;BA.debugLine="Dim sSQL As String = $\"select count(0) as total";
_ssql = ("select count(0) as total from dta_alerts where alert_visible=1 \n"+"								and user_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ))+"' \n"+"								and active=1 and date_alert>='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getlastweekdate /*String*/ (mostCurrent.activityBA)))+"'");
RDebugUtils.currentLine=24117292;
 //BA.debugLineNum = 24117292;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=24117293;
 //BA.debugLineNum = 24117293;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=24117294;
 //BA.debugLineNum = 24117294;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=24117295;
 //BA.debugLineNum = 24117295;BA.debugLine="alertBadge = Record.GetInt(\"total\")";
_alertbadge = _record.GetInt("total");
 };
RDebugUtils.currentLine=24117297;
 //BA.debugLineNum = 24117297;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=24117298;
 //BA.debugLineNum = 24117298;BA.debugLine="If (CPButtonAlerts.IsInitialized) Then";
if ((mostCurrent._cpbuttonalerts.IsInitialized())) { 
RDebugUtils.currentLine=24117299;
 //BA.debugLineNum = 24117299;BA.debugLine="If (alertBadge >= 1) Then";
if ((_alertbadge>=1)) { 
RDebugUtils.currentLine=24117300;
 //BA.debugLineNum = 24117300;BA.debugLine="BadgerItems.SetBadge(CPButtonAlerts, alertBadg";
mostCurrent._badgeritems._setbadge /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._cpbuttonalerts.getObject())),_alertbadge,_ori);
 }else {
RDebugUtils.currentLine=24117303;
 //BA.debugLineNum = 24117303;BA.debugLine="BadgerItems.SetBadge(CPButtonAlerts, 0, Ori)";
mostCurrent._badgeritems._setbadge /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._cpbuttonalerts.getObject())),(int) (0),_ori);
 };
 };
 } 
       catch (Exception e41) {
			processBA.setLastException(e41);RDebugUtils.currentLine=24117307;
 //BA.debugLineNum = 24117307;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624117307",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=24117309;
 //BA.debugLineNum = 24117309;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="mainLayout = \"MainMenuLayout\"";
mostCurrent._mainlayout = "MainMenuLayout";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="mainLayout = \"phone_mainmenulayout\"";
mostCurrent._mainlayout = "phone_mainmenulayout";
 }else {
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="If (FirstTime = True) Then";
if ((_firsttime==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="IsFirsttime = FirstTime";
_isfirsttime = _firsttime;
 };
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="Activity.LoadLayout(mainLayout)";
mostCurrent._activity.LoadLayout(mostCurrent._mainlayout,mostCurrent.activityBA);
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="butSearch.Visible = Utils.Int2Bool(ShareCode.DEVI";
mostCurrent._butsearch.setVisible(mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_show_global_search /*int*/ ));
RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="EditSearch.Visible = Utils.Int2Bool(ShareCode.DEV";
mostCurrent._editsearch.setVisible(mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_show_global_search /*int*/ ));
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="LabelAvisoProcessamento.Text = ShareCode.mainmenu";
mostCurrent._labelavisoprocessamento.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainmenulabelavisoprocessamento /*String*/ ));
RDebugUtils.currentLine=23330836;
 //BA.debugLineNum = 23330836;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="MainMenuTabStrip.LoadLayout(\"main_menu_first_tab";
mostCurrent._mainmenutabstrip.LoadLayout("main_menu_first_tab",BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=23330838;
 //BA.debugLineNum = 23330838;BA.debugLine="MainMenuTabStrip.LoadLayout(\"main_menu_second_ta";
mostCurrent._mainmenutabstrip.LoadLayout("main_menu_second_tab",BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="If Not(Comms.AlreadyStarted) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._comms._alreadystarted /*boolean*/ )) { 
RDebugUtils.currentLine=23330842;
 //BA.debugLineNum = 23330842;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._comms.getObject()));
 };
RDebugUtils.currentLine=23330845;
 //BA.debugLineNum = 23330845;BA.debugLine="Utils.SetButtonBackgroundColorToMainColorWithRadi";
mostCurrent._utils._setbuttonbackgroundcolortomaincolorwithradius /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._butquickaction.getObject())),(int) (100));
RDebugUtils.currentLine=23330847;
 //BA.debugLineNum = 23330847;BA.debugLine="AfterCreateOrPause(IsFirsttime)";
_aftercreateorpause(_isfirsttime);
RDebugUtils.currentLine=23330848;
 //BA.debugLineNum = 23330848;BA.debugLine="Starter.CurrentWorkActivity = Me";
mostCurrent._starter._currentworkactivity /*Object*/  = mainmenu.getObject();
RDebugUtils.currentLine=23330867;
 //BA.debugLineNum = 23330867;BA.debugLine="ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNul";
mostCurrent._sharecode._device_only_techoruser /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_ONLY_TECHORUSER")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNul";
mostCurrent._sharecode._device_show_request_id /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_SHOW_REQUEST_ID")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330869;
 //BA.debugLineNum = 23330869;BA.debugLine="ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfN";
mostCurrent._sharecode._device_param_data_confirm /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_DATA_CONFIRM")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330870;
 //BA.debugLineNum = 23330870;BA.debugLine="ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfN";
mostCurrent._sharecode._device_param_availability /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_AVAILABILITY")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330871;
 //BA.debugLineNum = 23330871;BA.debugLine="ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNul";
mostCurrent._sharecode._device_param_favorites /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_FAVORITES")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330872;
 //BA.debugLineNum = 23330872;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.If";
mostCurrent._sharecode._device_param_pause_request /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PAUSE_REQUEST")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330873;
 //BA.debugLineNum = 23330873;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNu";
mostCurrent._sharecode._device_param_pause_tech /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PAUSE_TECH")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330874;
 //BA.debugLineNum = 23330874;BA.debugLine="ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Uti";
mostCurrent._sharecode._device_request_upload_onexecution /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_UPLOAD_ONEXECUTION")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330875;
 //BA.debugLineNum = 23330875;BA.debugLine="ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Util";
mostCurrent._sharecode._device_request_autoupdt_onalert /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_AUTOUPDT_ONALERT")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330876;
 //BA.debugLineNum = 23330876;BA.debugLine="ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfN";
mostCurrent._sharecode._device_as_send_immediatly /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AS_SEND_IMMEDIATLY")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330877;
 //BA.debugLineNum = 23330877;BA.debugLine="ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.I";
mostCurrent._sharecode._device_request_hidecanceled /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_HIDECANCELED")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330878;
 //BA.debugLineNum = 23330878;BA.debugLine="ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfN";
mostCurrent._sharecode._device_autoupdate_onlogin /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AUTOUPDATE_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330879;
 //BA.debugLineNum = 23330879;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfN";
mostCurrent._sharecode._device_auto_expand_first /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AUTO_EXPAND_FIRST")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330880;
 //BA.debugLineNum = 23330880;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.";
mostCurrent._sharecode._device_auto_expand_checklist /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AUTO_EXPAND_CHECKLIST")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330881;
 //BA.debugLineNum = 23330881;BA.debugLine="ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNull";
mostCurrent._sharecode._device_default_route /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_DEFAULT_ROUTE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330882;
 //BA.debugLineNum = 23330882;BA.debugLine="ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.I";
mostCurrent._sharecode._device_as_include_obs_first /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AS_INCLUDE_OBS_FIRST")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330883;
 //BA.debugLineNum = 23330883;BA.debugLine="ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfN";
mostCurrent._sharecode._device_param_print_draft /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PRINT_DRAFT")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330884;
 //BA.debugLineNum = 23330884;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfN";
mostCurrent._sharecode._device_show_request_route /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_SHOW_REQUEST_ROUTE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330885;
 //BA.debugLineNum = 23330885;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfN";
mostCurrent._sharecode._device_request_push_other /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_PUSH_OTHER")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330886;
 //BA.debugLineNum = 23330886;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.If";
mostCurrent._sharecode._device_param_photo_quality /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_QUALITY")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330888;
 //BA.debugLineNum = 23330888;BA.debugLine="ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfN";
mostCurrent._sharecode._device_reopen_checklists /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REOPEN_CHECKLISTS")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330891;
 //BA.debugLineNum = 23330891;BA.debugLine="ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.";
mostCurrent._sharecode._device_request_signature_trg /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_SIGNATURE_TRG")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330892;
 //BA.debugLineNum = 23330892;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils";
mostCurrent._sharecode._device_request_push_other_auth /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_PUSH_OTHER_AUTH")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330893;
 //BA.debugLineNum = 23330893;BA.debugLine="ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfN";
mostCurrent._sharecode._device_param_orientation /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ORIENTATION")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330894;
 //BA.debugLineNum = 23330894;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.I";
mostCurrent._sharecode._device_param_photo_fontsize /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_FONTSIZE","value"),BA.NumberToString(12))));
RDebugUtils.currentLine=23330895;
 //BA.debugLineNum = 23330895;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfN";
mostCurrent._sharecode._device_param_photo_height /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_HEIGHT","value"),BA.NumberToString(615))));
RDebugUtils.currentLine=23330896;
 //BA.debugLineNum = 23330896;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfN";
mostCurrent._sharecode._device_param_photo_width /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_WIDTH","value"),BA.NumberToString(820))));
RDebugUtils.currentLine=23330897;
 //BA.debugLineNum = 23330897;BA.debugLine="ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Util";
mostCurrent._sharecode._device_request_can_delete_owned /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_CAN_DELETE_OWNED")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330898;
 //BA.debugLineNum = 23330898;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.I";
mostCurrent._sharecode._device_param_photo_filetype /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_FILETYPE","value"),"PNG");
RDebugUtils.currentLine=23330899;
 //BA.debugLineNum = 23330899;BA.debugLine="ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrE";
mostCurrent._sharecode._device_param_pull /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PULL")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330900;
 //BA.debugLineNum = 23330900;BA.debugLine="ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullO";
mostCurrent._sharecode._device_param_routes /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ROUTES")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330902;
 //BA.debugLineNum = 23330902;BA.debugLine="ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.I";
mostCurrent._sharecode._device_param_generatereport /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_GENERATEREPORT")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330903;
 //BA.debugLineNum = 23330903;BA.debugLine="ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.";
mostCurrent._sharecode._device_param_resync_requests /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_RESYNC_REQUESTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330904;
 //BA.debugLineNum = 23330904;BA.debugLine="ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Uti";
mostCurrent._sharecode._device_param_runcl_notyperequest /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_RUNCL_NOTYPEREQUEST")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330905;
 //BA.debugLineNum = 23330905;BA.debugLine="ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.If";
mostCurrent._sharecode._device_param_foto_evidence /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_FOTO_EVIDENCE")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330906;
 //BA.debugLineNum = 23330906;BA.debugLine="ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.If";
mostCurrent._sharecode._device_param_draw_evidence /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_DRAW_EVIDENCE")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330908;
 //BA.debugLineNum = 23330908;BA.debugLine="ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.if";
mostCurrent._sharecode._device_param_sendreport /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_SENDREPORT")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330909;
 //BA.debugLineNum = 23330909;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Util";
mostCurrent._sharecode._device_param_canchange_object /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_CANCHANGE_OBJECT")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330910;
 //BA.debugLineNum = 23330910;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Util";
mostCurrent._sharecode._device_param_canchange_entity /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_CANCHANGE_ENTITY")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330911;
 //BA.debugLineNum = 23330911;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= U";
mostCurrent._sharecode._device_param_request_canduplicate /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_CANDUPLICATE")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330912;
 //BA.debugLineNum = 23330912;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Util";
mostCurrent._sharecode._device_param_request_assignto /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ASSIGNTO")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330913;
 //BA.debugLineNum = 23330913;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT";
mostCurrent._sharecode._device_param_request_assto_mustaccept /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330914;
 //BA.debugLineNum = 23330914;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANG";
mostCurrent._sharecode._device_param_request_infotitle_canchange /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330915;
 //BA.debugLineNum = 23330915;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE";
mostCurrent._sharecode._device_param_request_cltitle_canchange /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330916;
 //BA.debugLineNum = 23330916;BA.debugLine="ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER";
mostCurrent._sharecode._device_param_additional_users_register /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ADDITIONAL_USERS_REGISTER")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330917;
 //BA.debugLineNum = 23330917;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY";
mostCurrent._sharecode._device_param_login_mustselect_comapny /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330918;
 //BA.debugLineNum = 23330918;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONME";
mostCurrent._sharecode._device_param_login_mustselect_environment /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330919;
 //BA.debugLineNum = 23330919;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRST";
mostCurrent._sharecode._device_param_login_passwordchange_firsttime /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330920;
 //BA.debugLineNum = 23330920;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL";
mostCurrent._sharecode._device_param_login_allow_qrcode_control /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330921;
 //BA.debugLineNum = 23330921;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL";
mostCurrent._sharecode._device_param_login_allow_facial_control /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330922;
 //BA.debugLineNum = 23330922;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL";
mostCurrent._sharecode._device_param_request_enddate_control /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ENDDATE_CONTROL")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330923;
 //BA.debugLineNum = 23330923;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW";
mostCurrent._sharecode._device_param_request_enddate_inday_show /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330925;
 //BA.debugLineNum = 23330925;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		=";
mostCurrent._sharecode._device_request_shownewicon_onalert /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_SHOWNEWICON_ONALERT")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330926;
 //BA.debugLineNum = 23330926;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST";
mostCurrent._sharecode._device_param_object_allow_new_request /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330927;
 //BA.debugLineNum = 23330927;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		=";
mostCurrent._sharecode._device_param_object_allow_view_all /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330928;
 //BA.debugLineNum = 23330928;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSO";
mostCurrent._sharecode._device_param_object_allow_evidence_associate /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330929;
 //BA.debugLineNum = 23330929;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB";
mostCurrent._sharecode._device_param_object_allow_requests_tab /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330930;
 //BA.debugLineNum = 23330930;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUM";
mostCurrent._sharecode._device_param_object_allow_relations_jump /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330931;
 //BA.debugLineNum = 23330931;BA.debugLine="ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE";
mostCurrent._sharecode._device_request_update_server_onclose /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330932;
 //BA.debugLineNum = 23330932;BA.debugLine="ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		=";
mostCurrent._sharecode._device_checklist_alldocs_in_object /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330933;
 //BA.debugLineNum = 23330933;BA.debugLine="ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= U";
mostCurrent._sharecode._device_param_default_date_period /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_DEFAULT_DATE_PERIOD")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330934;
 //BA.debugLineNum = 23330934;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= U";
mostCurrent._sharecode._device_request_show_date_divider /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_SHOW_DATE_DIVIDER")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330936;
 //BA.debugLineNum = 23330936;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		=";
mostCurrent._sharecode._device_checklist_svrimgudp_onclose /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330937;
 //BA.debugLineNum = 23330937;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGE";
mostCurrent._sharecode._device_checklist_svrimgudp_width_trigger /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330938;
 //BA.debugLineNum = 23330938;BA.debugLine="ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.";
mostCurrent._sharecode._device_asktoupdate_onlogin /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_ASKTOUPDATE_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330939;
 //BA.debugLineNum = 23330939;BA.debugLine="ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY";
mostCurrent._sharecode._device_checklist_include_public_gallery /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330940;
 //BA.debugLineNum = 23330940;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Util";
mostCurrent._sharecode._device_param_access_requests /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_REQUESTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330941;
 //BA.debugLineNum = 23330941;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils";
mostCurrent._sharecode._device_param_access_reports /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_REPORTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330942;
 //BA.debugLineNum = 23330942;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.";
mostCurrent._sharecode._device_param_access_alerts /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_ALERTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330943;
 //BA.debugLineNum = 23330943;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils";
mostCurrent._sharecode._device_param_access_objects /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_OBJECTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330944;
 //BA.debugLineNum = 23330944;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.i";
mostCurrent._sharecode._device_param_access_tasks /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_TASKS")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330945;
 //BA.debugLineNum = 23330945;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.";
mostCurrent._sharecode._device_param_access_mydata /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_MYDATA")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330946;
 //BA.debugLineNum = 23330946;BA.debugLine="ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.";
mostCurrent._sharecode._device_request_customorder /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_CUSTOMORDER")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330948;
 //BA.debugLineNum = 23330948;BA.debugLine="ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Ut";
mostCurrent._sharecode._device_checklist_starton_mydata /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_STARTON_MYDATA")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330949;
 //BA.debugLineNum = 23330949;BA.debugLine="ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		=";
mostCurrent._sharecode._device_checklist_mydata_docs_ontop /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330951;
 //BA.debugLineNum = 23330951;BA.debugLine="ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND";
mostCurrent._sharecode._device_checklist_objectmandatory_onend /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330952;
 //BA.debugLineNum = 23330952;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONE";
mostCurrent._sharecode._device_checklist_siganturemandatory_onend /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330953;
 //BA.debugLineNum = 23330953;BA.debugLine="ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= U";
mostCurrent._sharecode._device_param_activate_printmodule /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACTIVATE_PRINTMODULE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330954;
 //BA.debugLineNum = 23330954;BA.debugLine="ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGI";
mostCurrent._sharecode._device_param_testconnected_print_onlogin /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330955;
 //BA.debugLineNum = 23330955;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOS";
mostCurrent._sharecode._device_checklist_autoreturn_after_fotoshot /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330956;
 //BA.debugLineNum = 23330956;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSA";
mostCurrent._sharecode._device_checklist_autoreturn_after_subsaction /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330957;
 //BA.debugLineNum = 23330957;BA.debugLine="ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS";
mostCurrent._sharecode._device_checklist_copy_asdetails_to_obs /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330958;
 //BA.debugLineNum = 23330958;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNA";
mostCurrent._sharecode._device_checklist_autoreturn_after_signature /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330960;
 //BA.debugLineNum = 23330960;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Uti";
mostCurrent._sharecode._device_param_inverted_foto_device /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_INVERTED_FOTO_DEVICE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330961;
 //BA.debugLineNum = 23330961;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE";
mostCurrent._sharecode._device_param_inverted_horiz_foto_device /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330963;
 //BA.debugLineNum = 23330963;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Uti";
mostCurrent._sharecode._device_report_date_from_checklist /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REPORT_DATE_FROM_CHECKLIST")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330965;
 //BA.debugLineNum = 23330965;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils";
mostCurrent._sharecode._device_typerequest_start_newway /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_TYPEREQUEST_START_NEWWAY")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330966;
 //BA.debugLineNum = 23330966;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY";
mostCurrent._sharecode._device_typerequest_define_start_newway /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330968;
 //BA.debugLineNum = 23330968;BA.debugLine="ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullor";
mostCurrent._sharecode._device_email_old_model /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_EMAIL_OLD_MODEL")),BA.NumberToString(1))));
RDebugUtils.currentLine=23330969;
 //BA.debugLineNum = 23330969;BA.debugLine="ShareCode.EmailOldModel = Utils.Int2Bool(ShareCod";
mostCurrent._sharecode._emailoldmodel /*boolean*/  = mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_email_old_model /*int*/ );
RDebugUtils.currentLine=23330970;
 //BA.debugLineNum = 23330970;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnul";
mostCurrent._sharecode._device_show_global_search /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_SHOW_GLOBAL_SEARCH")),BA.NumberToString(0))));
RDebugUtils.currentLine=23330974;
 //BA.debugLineNum = 23330974;BA.debugLine="ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVIC";
mostCurrent._sharecode._sts005 /*boolean*/  = mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_request_hidecanceled /*int*/ );
RDebugUtils.currentLine=23330977;
 //BA.debugLineNum = 23330977;BA.debugLine="ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE";
mostCurrent._sharecode._device_def_font_size /*int*/  = mostCurrent._sharecode._device_param_photo_fontsize /*int*/ ;
RDebugUtils.currentLine=23330978;
 //BA.debugLineNum = 23330978;BA.debugLine="ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_P";
mostCurrent._sharecode._device_def_quality /*int*/  = mostCurrent._sharecode._device_param_photo_quality /*int*/ ;
RDebugUtils.currentLine=23330979;
 //BA.debugLineNum = 23330979;BA.debugLine="ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEV";
mostCurrent._sharecode._device_def_img_filetype /*String*/  = mostCurrent._sharecode._device_param_photo_filetype /*String*/ ;
RDebugUtils.currentLine=23330980;
 //BA.debugLineNum = 23330980;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE";
mostCurrent._sharecode._device_def_img_width /*int*/  = mostCurrent._sharecode._device_param_photo_width /*int*/ ;
RDebugUtils.currentLine=23330981;
 //BA.debugLineNum = 23330981;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVIC";
mostCurrent._sharecode._device_def_img_height /*int*/  = mostCurrent._sharecode._device_param_photo_height /*int*/ ;
RDebugUtils.currentLine=23330983;
 //BA.debugLineNum = 23330983;BA.debugLine="If (Not(ShareCode.APP_DOMAIN.ToLowerCase = \"demo\"";
if ((anywheresoftware.b4a.keywords.Common.Not((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("demo")) && anywheresoftware.b4a.keywords.Common.Not((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("brasfone")) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._app_domain /*String*/ .toLowerCase().contains("grandative")))) { 
RDebugUtils.currentLine=23330984;
 //BA.debugLineNum = 23330984;BA.debugLine="butCallActions.Visible = False";
mostCurrent._butcallactions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23330985;
 //BA.debugLineNum = 23330985;BA.debugLine="butCallActions.Enabled = False";
mostCurrent._butcallactions.setEnabled(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=23330991;
 //BA.debugLineNum = 23330991;BA.debugLine="Printer.Initialize(Me,\"Printer\",Encoding.Windows1";
mostCurrent._printer._initialize(mostCurrent.activityBA,mainmenu.getObject(),"Printer",mostCurrent._encoding._v5);
RDebugUtils.currentLine=23330995;
 //BA.debugLineNum = 23330995;BA.debugLine="StartService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=23330996;
 //BA.debugLineNum = 23330996;BA.debugLine="End Sub";
return "";
}
public static String  _aftercreateorpause(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "aftercreateorpause", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "aftercreateorpause", new Object[] {_firsttime}));}
xevolution.vrcg.devdemov2400.types._composedbuttondefs _thisbutton = null;
anywheresoftware.b4a.objects.LabelWrapper _lbllistnomemenu = null;
anywheresoftware.b4a.objects.LabelWrapper _lbllistopcaomenu = null;
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Sub AfterCreateOrPause(FirstTime As Boolean)";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Log($\"Starter.MakingLogin = ${Starter.MakingLogin";
anywheresoftware.b4a.keywords.Common.LogImpl("623855105",("Starter.MakingLogin = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._starter._makinglogin /*boolean*/ ))+""),0);
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="If (Starter.MakingLogin = True) Then";
if ((mostCurrent._starter._makinglogin /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Starter.MakingLogin = False";
mostCurrent._starter._makinglogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
 }else {
RDebugUtils.currentLine=23855111;
 //BA.debugLineNum = 23855111;BA.debugLine="LockPanel.Visible = False";
mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="ShareCode.MainLockPanel = LockPanel.Visible";
mostCurrent._sharecode._mainlockpanel /*boolean*/  = mostCurrent._lockpanel.getVisible();
 };
 };
RDebugUtils.currentLine=23855122;
 //BA.debugLineNum = 23855122;BA.debugLine="If Not(Requestauth) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_requestauth)) { 
RDebugUtils.currentLine=23855123;
 //BA.debugLineNum = 23855123;BA.debugLine="Consts.ColorMain = Starter.KeepColorMain";
mostCurrent._consts._colormain /*int*/  = mostCurrent._starter._keepcolormain /*int*/ ;
RDebugUtils.currentLine=23855124;
 //BA.debugLineNum = 23855124;BA.debugLine="Consts.ColorSub = Starter.KeepColorSub";
mostCurrent._consts._colorsub /*int*/  = mostCurrent._starter._keepcolorsub /*int*/ ;
RDebugUtils.currentLine=23855126;
 //BA.debugLineNum = 23855126;BA.debugLine="If Not(ShareCode.APP_ComboValues.IsInitialized)";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._app_combovalues /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized())) { 
mostCurrent._sharecode._app_combovalues /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=23855127;
 //BA.debugLineNum = 23855127;BA.debugLine="If Not(BadgerItems.IsInitialized) Then BadgerIte";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._badgeritems.IsInitialized /*boolean*/ ())) { 
mostCurrent._badgeritems._initialize /*String*/ (null,mostCurrent.activityBA);};
RDebugUtils.currentLine=23855129;
 //BA.debugLineNum = 23855129;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=23855130;
 //BA.debugLineNum = 23855130;BA.debugLine="WaitToConfirm = False";
_waittoconfirm = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=23855131;
 //BA.debugLineNum = 23855131;BA.debugLine="DBStructures.getCurrentConfigValues";
mostCurrent._dbstructures._getcurrentconfigvalues /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=23855132;
 //BA.debugLineNum = 23855132;BA.debugLine="Started = True";
_started = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=23855133;
 //BA.debugLineNum = 23855133;BA.debugLine="Starter.FirstInstall = False";
mostCurrent._starter._firstinstall /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=23855136;
 //BA.debugLineNum = 23855136;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
_thisbutton = mostCurrent._starter._cpbuttons /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ ;
RDebugUtils.currentLine=23855138;
 //BA.debugLineNum = 23855138;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonRequests, Ch";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttonrequests,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))),mostCurrent._sharecode._mainoption_request /*String*/ ,_thisbutton);
RDebugUtils.currentLine=23855140;
 //BA.debugLineNum = 23855140;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
_thisbutton = mostCurrent._starter._cpbuttons /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ ;
RDebugUtils.currentLine=23855142;
 //BA.debugLineNum = 23855142;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonAlerts, Chr(";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttonalerts,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf16c))),mostCurrent._sharecode._mainoption_alerts /*String*/ ,_thisbutton);
RDebugUtils.currentLine=23855144;
 //BA.debugLineNum = 23855144;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
_thisbutton = mostCurrent._starter._cpbuttons /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ ;
RDebugUtils.currentLine=23855146;
 //BA.debugLineNum = 23855146;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonKPI, Chr(0xF";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttonkpi,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf080))),mostCurrent._sharecode._mainoption_kpi /*String*/ ,_thisbutton);
RDebugUtils.currentLine=23855148;
 //BA.debugLineNum = 23855148;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
_thisbutton = mostCurrent._starter._cpbuttons /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ ;
RDebugUtils.currentLine=23855150;
 //BA.debugLineNum = 23855150;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonTasks, Chr(0";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttontasks,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf0b1))),mostCurrent._sharecode._mainoption_tasks /*String*/ ,_thisbutton);
RDebugUtils.currentLine=23855152;
 //BA.debugLineNum = 23855152;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
_thisbutton = mostCurrent._starter._cpbuttons /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ ;
RDebugUtils.currentLine=23855154;
 //BA.debugLineNum = 23855154;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=23855155;
 //BA.debugLineNum = 23855155;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonObjects, Ch";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttonobjects,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1b3))),mostCurrent._sharecode._mainoption_planning /*String*/ ,_thisbutton);
 }else {
RDebugUtils.currentLine=23855157;
 //BA.debugLineNum = 23855157;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonObjects, Ch";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttonobjects,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1b3))),mostCurrent._sharecode._mainoption_objects /*String*/ ,_thisbutton);
 };
RDebugUtils.currentLine=23855160;
 //BA.debugLineNum = 23855160;BA.debugLine="Dim ThisButton As ComposedButtonDefs = Starter.C";
_thisbutton = mostCurrent._starter._cpbuttons /*xevolution.vrcg.devdemov2400.types._composedbuttondefs*/ ;
RDebugUtils.currentLine=23855162;
 //BA.debugLineNum = 23855162;BA.debugLine="Utils.MakeComposedButtonExt(CPButtonUser, Chr(0x";
mostCurrent._utils._makecomposedbuttonext /*String*/ (mostCurrent.activityBA,mostCurrent._cpbuttonuser,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf2bc))),mostCurrent._sharecode._mainoption_user /*String*/ ,_thisbutton);
RDebugUtils.currentLine=23855164;
 //BA.debugLineNum = 23855164;BA.debugLine="MainPopMenu.Initialize(Activity, Me, mainButtonM";
mostCurrent._mainpopmenu._initialize(mostCurrent.activityBA,mostCurrent._activity,mainmenu.getObject(),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._mainbuttonmenu.getObject())),mostCurrent._consts._colormain /*int*/ ,anywheresoftware.b4a.keywords.Common.Colors.White,mostCurrent._consts._colorsub /*int*/ ,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23855166;
 //BA.debugLineNum = 23855166;BA.debugLine="Dim LblListNomeMenu As Label";
_lbllistnomemenu = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23855167;
 //BA.debugLineNum = 23855167;BA.debugLine="Dim LblListOpcaoMenu As Label";
_lbllistopcaomenu = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23855168;
 //BA.debugLineNum = 23855168;BA.debugLine="MainPopMenuList.Color = Consts.ColorMain";
mostCurrent._mainpopmenulist.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=23855169;
 //BA.debugLineNum = 23855169;BA.debugLine="MainPopMenuList.Height = Activity.Height / 2 + 5";
mostCurrent._mainpopmenulist.setHeight((int) (mostCurrent._activity.getHeight()/(double)2+50));
RDebugUtils.currentLine=23855170;
 //BA.debugLineNum = 23855170;BA.debugLine="MainPopMenuList.SingleLineLayout.Label.TextSize";
mostCurrent._mainpopmenulist.getSingleLineLayout().Label.setTextSize((float) (16));
RDebugUtils.currentLine=23855171;
 //BA.debugLineNum = 23855171;BA.debugLine="MainPopMenuList.SingleLineLayout.Label.TextColor";
mostCurrent._mainpopmenulist.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=23855173;
 //BA.debugLineNum = 23855173;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_mainpopmenusync /*String*/ ,"MainPopMenuSync");
RDebugUtils.currentLine=23855174;
 //BA.debugLineNum = 23855174;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_mainpopmenusync /*String*/ ),(Object)("MainPopMenuSync"));
RDebugUtils.currentLine=23855176;
 //BA.debugLineNum = 23855176;BA.debugLine="If (ShareCode.SESS_UserProfile = \"PRF_ADMIN\") Or";
if (((mostCurrent._sharecode._sess_userprofile /*String*/ ).equals("PRF_ADMIN")) || ((mostCurrent._sharecode._sess_userprofile /*String*/ ).equals("PRF_SUPER"))) { 
RDebugUtils.currentLine=23855177;
 //BA.debugLineNum = 23855177;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_maindatavalidation /*String*/ ,"MainDataValidation");
RDebugUtils.currentLine=23855178;
 //BA.debugLineNum = 23855178;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_mainpopmenucompany /*String*/ ,"MainPopMenuCompany");
RDebugUtils.currentLine=23855179;
 //BA.debugLineNum = 23855179;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_maindatavalidation /*String*/ ),(Object)("MainDataValidation"));
RDebugUtils.currentLine=23855180;
 //BA.debugLineNum = 23855180;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_mainpopmenucompany /*String*/ ),(Object)("MainPopMenuCompany"));
 };
RDebugUtils.currentLine=23855183;
 //BA.debugLineNum = 23855183;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"scms\")";
if (((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("scms"))) { 
RDebugUtils.currentLine=23855184;
 //BA.debugLineNum = 23855184;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_mainpopmenupushrequest /*String*/ ,"MainPopMenuPushRequest");
RDebugUtils.currentLine=23855185;
 //BA.debugLineNum = 23855185;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_mainpopmenupushrequest /*String*/ ),(Object)("MainPopMenuPushRequest"));
 };
RDebugUtils.currentLine=23855192;
 //BA.debugLineNum = 23855192;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_mainpopmenuloginchange /*String*/ ,"MainPopMenuLoginChange");
RDebugUtils.currentLine=23855193;
 //BA.debugLineNum = 23855193;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_mainpopmenuloginchange /*String*/ ),(Object)("MainPopMenuLoginChange"));
RDebugUtils.currentLine=23855195;
 //BA.debugLineNum = 23855195;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_maindeviceinfopopmenu /*String*/ ,"MainDeviceInfoPopMenu");
RDebugUtils.currentLine=23855196;
 //BA.debugLineNum = 23855196;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_maindeviceinfopopmenu /*String*/ ),(Object)("MainDeviceInfoPopMenu"));
RDebugUtils.currentLine=23855198;
 //BA.debugLineNum = 23855198;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_maininstallapk /*String*/ ,"MainUpdateAPK");
RDebugUtils.currentLine=23855199;
 //BA.debugLineNum = 23855199;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_maininstallapk /*String*/ ),(Object)("MainUpdateAPK"));
RDebugUtils.currentLine=23855204;
 //BA.debugLineNum = 23855204;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_PARAM_ACTIVA";
if ((mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_param_activate_printmodule /*int*/ )) || (((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("demo")) || ((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("erguelop")) || (mostCurrent._sharecode._app_domain /*String*/ .toLowerCase().contains("transgrua")))) { 
RDebugUtils.currentLine=23855206;
 //BA.debugLineNum = 23855206;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Mai";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_maindeviceprint /*String*/ ,"MainDevicePrint");
RDebugUtils.currentLine=23855207;
 //BA.debugLineNum = 23855207;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPM";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_maindeviceprint /*String*/ ),(Object)("MainDevicePrint"));
 };
RDebugUtils.currentLine=23855210;
 //BA.debugLineNum = 23855210;BA.debugLine="If ((ShareCode.APP_DOMAIN.ToLowerCase = \"devdemo";
if ((((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("devdemo")) || ((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("demo")))) { 
RDebugUtils.currentLine=23855211;
 //BA.debugLineNum = 23855211;BA.debugLine="MainPopMenu.AddMenuItem(\"Codigo Barras\", \"BCQR\"";
mostCurrent._mainpopmenu._addmenuitem("Codigo Barras","BCQR");
 };
RDebugUtils.currentLine=23855214;
 //BA.debugLineNum = 23855214;BA.debugLine="MainPopMenu.AddMenuItem(ShareCode.POPUPMENU_Main";
mostCurrent._mainpopmenu._addmenuitem(mostCurrent._sharecode._popupmenu_mainpopmenuexit /*String*/ ,"MainPopMenuExit");
RDebugUtils.currentLine=23855215;
 //BA.debugLineNum = 23855215;BA.debugLine="MainPopMenuList.AddSingleLine2(ShareCode.POPUPME";
mostCurrent._mainpopmenulist.AddSingleLine2(BA.ObjectToCharSequence(mostCurrent._sharecode._popupmenu_mainpopmenuexit /*String*/ ),(Object)("MainPopMenuExit"));
RDebugUtils.currentLine=23855216;
 //BA.debugLineNum = 23855216;BA.debugLine="AppStart";
_appstart();
 };
RDebugUtils.currentLine=23855219;
 //BA.debugLineNum = 23855219;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _result = 0;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Dim Result As Int";
_result = 0;
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="Result = Msgbox2(ShareCode.ApplicationExit, Shar";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._applicationexit /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="CallSubDelayed(Main, \"ActivityFinish\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"ActivityFinish");
RDebugUtils.currentLine=23789574;
 //BA.debugLineNum = 23789574;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 };
RDebugUtils.currentLine=23789577;
 //BA.debugLineNum = 23789577;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="mainmenu";
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="LockPanel.Visible = False";
mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="mainLabelInfo.Text = \"\"";
mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="If (Starter.APP_FINE_LOCATION_ACCESS) Then";
if ((mostCurrent._starter._app_fine_location_access /*boolean*/ )) { 
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="If Not(LocationService.FusedLocationProvider1.Is";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .IsInitialized())) { 
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._locationservice.getObject()));
 };
 };
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="UpdateServiceTimer.Initialize(\"UpdateServiceTimer";
mostCurrent._updateservicetimer.Initialize(processBA,"UpdateServiceTimer",(long) (1000));
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="End Sub";
return "";
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="mainLogoSearch.Gravity = Gravity.FILL";
mostCurrent._mainlogosearch.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=23920645;
 //BA.debugLineNum = 23920645;BA.debugLine="mainLogoSearch.Width = Consts.LogoWidth";
mostCurrent._mainlogosearch.setWidth(mostCurrent._consts._logowidth /*int*/ );
 };
RDebugUtils.currentLine=23920647;
 //BA.debugLineNum = 23920647;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
anywheresoftware.b4a.keywords.Common.LogImpl("623920647",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=23920648;
 //BA.debugLineNum = 23920648;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=23920649;
 //BA.debugLineNum = 23920649;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
RDebugUtils.currentLine=23920650;
 //BA.debugLineNum = 23920650;BA.debugLine="mainLogoSearch.SetBackgroundImage(Utils.B64ToBit";
mostCurrent._mainlogosearch.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
RDebugUtils.currentLine=23920652;
 //BA.debugLineNum = 23920652;BA.debugLine="End Sub";
return "";
}
public static String  _appstart() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "appstart", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "appstart", null));}
anywheresoftware.b4a.objects.collections.List _mlist = null;
int _n = 0;
String _ffile = "";
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Sub AppStart";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="If (ShareCode.DEVICE_ORIENTATION = 1) Then";
if ((mostCurrent._sharecode._device_orientation /*int*/ ==1)) { 
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = 615";
mostCurrent._sharecode._device_def_img_width /*int*/  = (int) (615);
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT  = 820";
mostCurrent._sharecode._device_def_img_height /*int*/  = (int) (820);
 };
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
if (mostCurrent._sharecode._app_working_local /*boolean*/ ) { 
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="If (ShareCode.APPL_CONFIRMED = 0) Then";
if ((mostCurrent._sharecode._appl_confirmed /*int*/ ==0)) { 
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoConne";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._authorizationdata_noconnection_validate /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="CallSubDelayed(Main, \"ActivityFinish\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._main.getObject()),"ActivityFinish");
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
 };
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="mainBasePanel.Visible = True";
mostCurrent._mainbasepanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=23986190;
 //BA.debugLineNum = 23986190;BA.debugLine="LabelDateTime.Text =  $\"${Main.AppBuildVersionDat";
mostCurrent._labeldatetime.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._main._appbuildversiondate /*String*/ ))+"")));
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=23986193;
 //BA.debugLineNum = 23986193;BA.debugLine="BadgeCheckUpdate";
_badgecheckupdate();
RDebugUtils.currentLine=23986194;
 //BA.debugLineNum = 23986194;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=23986196;
 //BA.debugLineNum = 23986196;BA.debugLine="Dim mList As List = File.ListFiles(Starter.Intern";
_mlist = new anywheresoftware.b4a.objects.collections.List();
_mlist = anywheresoftware.b4a.keywords.Common.File.ListFiles(mostCurrent._starter._internalfolder /*String*/ );
RDebugUtils.currentLine=23986197;
 //BA.debugLineNum = 23986197;BA.debugLine="For n = 0 To mList.Size-1";
{
final int step18 = 1;
final int limit18 = (int) (_mlist.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit18 ;_n = _n + step18 ) {
RDebugUtils.currentLine=23986198;
 //BA.debugLineNum = 23986198;BA.debugLine="Dim ffile As String =  mList.Get(n)";
_ffile = BA.ObjectToString(_mlist.Get(_n));
RDebugUtils.currentLine=23986199;
 //BA.debugLineNum = 23986199;BA.debugLine="If (ffile.EndsWith(\"html\")) Then";
if ((_ffile.endsWith("html"))) { 
RDebugUtils.currentLine=23986200;
 //BA.debugLineNum = 23986200;BA.debugLine="Log(\"Ficheiro: \" & ffile & \": \" & File.Size(Sta";
anywheresoftware.b4a.keywords.Common.LogImpl("623986200","Ficheiro: "+_ffile+": "+BA.NumberToString(anywheresoftware.b4a.keywords.Common.File.Size(mostCurrent._starter._internalfolder /*String*/ ,_ffile)),0);
 };
 }
};
RDebugUtils.currentLine=23986204;
 //BA.debugLineNum = 23986204;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils._ne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_oper_username /*String*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=24182791;
 //BA.debugLineNum = 24182791;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "windowstatusupdate"),(int) (500));
this.state = 38;
return;
case 38:
//C
this.state = 4;
;
RDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=24182795;
 //BA.debugLineNum = 24182795;BA.debugLine="LockPanel.Visible = False   'ShareCode.MainLockPa";
parent.mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24182796;
 //BA.debugLineNum = 24182796;BA.debugLine="Try";
if (true) break;

case 5:
//try
this.state = 10;
this.catchState = 9;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 10;
this.catchState = 9;
RDebugUtils.currentLine=24182797;
 //BA.debugLineNum = 24182797;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeN";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=24182798;
 //BA.debugLineNum = 24182798;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=24182799;
 //BA.debugLineNum = 24182799;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNa";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=24182801;
 //BA.debugLineNum = 24182801;BA.debugLine="mainActiveUserSearch.Text = ShareCode.SESS_OPER_";
parent.mostCurrent._mainactiveusersearch.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=24182803;
 //BA.debugLineNum = 24182803;BA.debugLine="Log(\"Labels\")";
anywheresoftware.b4a.keywords.Common.LogImpl("624182803","Labels",0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=24182806;
 //BA.debugLineNum = 24182806;BA.debugLine="Try";

case 10:
//try
this.state = 19;
this.catchState = 0;
this.catchState = 18;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 18;
RDebugUtils.currentLine=24182807;
 //BA.debugLineNum = 24182807;BA.debugLine="ButtonAppNetwork.Enabled = False";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24182808;
 //BA.debugLineNum = 24182808;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSi";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=24182809;
 //BA.debugLineNum = 24182809;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=24182810;
 //BA.debugLineNum = 24182810;BA.debugLine="ButtonAppNetwork.Enabled = True";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24182811;
 //BA.debugLineNum = 24182811;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOra";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
RDebugUtils.currentLine=24182814;
 //BA.debugLineNum = 24182814;BA.debugLine="Log(\"ButtonAppNetwork\")";
anywheresoftware.b4a.keywords.Common.LogImpl("624182814","ButtonAppNetwork",0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=24182817;
 //BA.debugLineNum = 24182817;BA.debugLine="Try";

case 19:
//try
this.state = 28;
this.catchState = 0;
this.catchState = 27;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 27;
RDebugUtils.currentLine=24182818;
 //BA.debugLineNum = 24182818;BA.debugLine="ButtonUserUnavailable.Enabled = False";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24182819;
 //BA.debugLineNum = 24182819;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLi";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=24182820;
 //BA.debugLineNum = 24182820;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
if (true) break;

case 22:
//if
this.state = 25;
if ((parent.mostCurrent._sharecode._usr_state /*int*/ ==0)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=24182821;
 //BA.debugLineNum = 24182821;BA.debugLine="ButtonUserUnavailable.Enabled = True";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24182822;
 //BA.debugLineNum = 24182822;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorO";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colororange /*int*/ );
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
RDebugUtils.currentLine=24182825;
 //BA.debugLineNum = 24182825;BA.debugLine="Log(\"ButtonUserUnavailable\")";
anywheresoftware.b4a.keywords.Common.LogImpl("624182825","ButtonUserUnavailable",0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=24182828;
 //BA.debugLineNum = 24182828;BA.debugLine="Try";

case 28:
//try
this.state = 37;
this.catchState = 0;
this.catchState = 36;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 36;
RDebugUtils.currentLine=24182830;
 //BA.debugLineNum = 24182830;BA.debugLine="ButtonActionPause.Enabled = False";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24182831;
 //BA.debugLineNum = 24182831;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightS";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=24182833;
 //BA.debugLineNum = 24182833;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=24182834;
 //BA.debugLineNum = 24182834;BA.debugLine="ButtonActionPause.Enabled = True";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=24182835;
 //BA.debugLineNum = 24182835;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorOrang";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colororange /*int*/ );
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
RDebugUtils.currentLine=24182838;
 //BA.debugLineNum = 24182838;BA.debugLine="Log(\"ButtonActionPause\")";
anywheresoftware.b4a.keywords.Common.LogImpl("624182838","ButtonActionPause",0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24182840;
 //BA.debugLineNum = 24182840;BA.debugLine="End Sub";
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
public static String  _bcqr_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bcqr_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bcqr_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Sub BCQR_Click(MenuName As String)";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="ShareCode.SingleScan = False";
mostCurrent._sharecode._singlescan /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="CallSubDelayed2(BarcodeScanner,\"StarScanningMulti";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._barcodescanner.getObject()),"StarScanningMulti",(Object)("MainMenu"));
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="End Sub";
return "";
}
public static String  _butactionsearch_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butactionsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butactionsearch_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _bbut = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Sub butActionSearch_Click";
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="Dim bbut As Button = Sender";
_bbut = new anywheresoftware.b4a.objects.ButtonWrapper();
_bbut = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="If Utils.NNE(bbut.Tag) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,BA.ObjectToString(_bbut.getTag()))) { 
RDebugUtils.currentLine=29687812;
 //BA.debugLineNum = 29687812;BA.debugLine="Dim lst As List = Regex.Split(\"\\|\", bbut.tag )";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",BA.ObjectToString(_bbut.getTag())));
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="If (lst.Size > 1) Then";
if ((_lst.getSize()>1)) { 
RDebugUtils.currentLine=29687814;
 //BA.debugLineNum = 29687814;BA.debugLine="If (lst.Get(0)=\"1\") Then";
if (((_lst.Get((int) (0))).equals((Object)("1")))) { 
RDebugUtils.currentLine=29687816;
 //BA.debugLineNum = 29687816;BA.debugLine="Log(lst.Get(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("629687816",BA.ObjectToString(_lst.Get((int) (1))),0);
 }else 
{RDebugUtils.currentLine=29687817;
 //BA.debugLineNum = 29687817;BA.debugLine="else if (lst.Get(0)=\"2\") Then";
if (((_lst.Get((int) (0))).equals((Object)("2")))) { 
RDebugUtils.currentLine=29687819;
 //BA.debugLineNum = 29687819;BA.debugLine="Log(lst.Get(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("629687819",BA.ObjectToString(_lst.Get((int) (1))),0);
 }else 
{RDebugUtils.currentLine=29687820;
 //BA.debugLineNum = 29687820;BA.debugLine="else if (lst.Get(0)=\"3\") Then";
if (((_lst.Get((int) (0))).equals((Object)("3")))) { 
RDebugUtils.currentLine=29687822;
 //BA.debugLineNum = 29687822;BA.debugLine="Log(lst.Get(1))";
anywheresoftware.b4a.keywords.Common.LogImpl("629687822",BA.ObjectToString(_lst.Get((int) (1))),0);
 }}}
;
 };
 };
RDebugUtils.currentLine=29687826;
 //BA.debugLineNum = 29687826;BA.debugLine="End Sub";
return "";
}
public static void  _butcallactions_bf() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallactions_bf", false))
	 {Debug.delegate(mostCurrent.activityBA, "butcallactions_bf", null); return;}
ResumableSub_butCallActions_BF rsub = new ResumableSub_butCallActions_BF(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butCallActions_BF extends BA.ResumableSub {
public ResumableSub_butCallActions_BF(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _tagcode = "";
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
String _newrequesttype = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _newrequest = "";
String _newdate = "";
String _newtime = "";
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
int _reqcounter = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _incolitems = null;
int _id = 0;
int _tasktype = 0;
int _status_id = 0;
String _actionkey = "";
String _task = "";
String _name = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _sdate = "";
String _stime = "";
int _close_type = 0;
int _result_type = 0;
String _result_values = "";
xevolution.vrcg.devdemov2400.types._requesttaskinfo _clainfo = null;
xevolution.vrcg.devdemov2400.types._requestcla _cla = null;
anywheresoftware.b4a.objects.collections.Map _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="Dim tagcode As String = \"TSKS_20190911_135559\"";
_tagcode = "TSKS_20190911_135559";
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*String*/ ));
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 31;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 31;
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24641543;
 //BA.debugLineNum = 24641543;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="Dim newRequestType As String = \"\"";
_newrequesttype = "";
RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
_ssql = ("select distinct tagcode, title\n"+"				from dta_typerequests \n"+"				where tagcode in (select distinct typerequest_tagcode \n"+"					from dta_typerequests_tasks where task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"') limit 1");
RDebugUtils.currentLine=24641550;
 //BA.debugLineNum = 24641550;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=24641551;
 //BA.debugLineNum = 24641551;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=24641552;
 //BA.debugLineNum = 24641552;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_record.getRowCount()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=24641553;
 //BA.debugLineNum = 24641553;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=24641554;
 //BA.debugLineNum = 24641554;BA.debugLine="newRequestType = Record.GetString(\"tagcode\")";
_newrequesttype = _record.GetString("tagcode");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=24641556;
 //BA.debugLineNum = 24641556;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=24641557;
 //BA.debugLineNum = 24641557;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagc";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24641558;
 //BA.debugLineNum = 24641558;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24641559;
 //BA.debugLineNum = 24641559;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24641561;
 //BA.debugLineNum = 24641561;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24641562;
 //BA.debugLineNum = 24641562;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24641563;
 //BA.debugLineNum = 24641563;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24641564;
 //BA.debugLineNum = 24641564;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=24641565;
 //BA.debugLineNum = 24641565;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=24641566;
 //BA.debugLineNum = 24641566;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=24641567;
 //BA.debugLineNum = 24641567;BA.debugLine="newExecution.Put(\"status_id\", 2)";
_newexecution.Put((Object)("status_id"),(Object)(2));
RDebugUtils.currentLine=24641568;
 //BA.debugLineNum = 24641568;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=24641569;
 //BA.debugLineNum = 24641569;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=24641570;
 //BA.debugLineNum = 24641570;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=24641571;
 //BA.debugLineNum = 24641571;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=24641572;
 //BA.debugLineNum = 24641572;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=24641573;
 //BA.debugLineNum = 24641573;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24641574;
 //BA.debugLineNum = 24641574;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24641575;
 //BA.debugLineNum = 24641575;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24641576;
 //BA.debugLineNum = 24641576;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNA";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=24641577;
 //BA.debugLineNum = 24641577;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"OBJECT_20190";
_newexecution.Put((Object)("entity_tagcode"),(Object)("OBJECT_20190911_122437"));
RDebugUtils.currentLine=24641578;
 //BA.debugLineNum = 24641578;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20190";
_newexecution.Put((Object)("object_tagcode"),(Object)("OBJECT_20190911_122437"));
RDebugUtils.currentLine=24641579;
 //BA.debugLineNum = 24641579;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=24641580;
 //BA.debugLineNum = 24641580;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=24641581;
 //BA.debugLineNum = 24641581;BA.debugLine="newExecution.Put(\"local_tagcode\", \"ADRSS_2019091";
_newexecution.Put((Object)("local_tagcode"),(Object)("ADRSS_20190911_122437"));
RDebugUtils.currentLine=24641582;
 //BA.debugLineNum = 24641582;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReque";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_newrequesttype));
RDebugUtils.currentLine=24641583;
 //BA.debugLineNum = 24641583;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SE";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=24641584;
 //BA.debugLineNum = 24641584;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=24641585;
 //BA.debugLineNum = 24641585;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24641586;
 //BA.debugLineNum = 24641586;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24641587;
 //BA.debugLineNum = 24641587;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24641588;
 //BA.debugLineNum = 24641588;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24641589;
 //BA.debugLineNum = 24641589;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24641591;
 //BA.debugLineNum = 24641591;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24641594;
 //BA.debugLineNum = 24641594;BA.debugLine="Dim ReqCounter As Int = DBStructures.GetCountOfE";
_reqcounter = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'"));
RDebugUtils.currentLine=24641596;
 //BA.debugLineNum = 24641596;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24641597;
 //BA.debugLineNum = 24641597;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24641598;
 //BA.debugLineNum = 24641598;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24641599;
 //BA.debugLineNum = 24641599;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode)";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=24641600;
 //BA.debugLineNum = 24641600;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=24641601;
 //BA.debugLineNum = 24641601;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=24641602;
 //BA.debugLineNum = 24641602;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=24641603;
 //BA.debugLineNum = 24641603;BA.debugLine="newExecution.Put(\"status_id\", 2)";
_newexecution.Put((Object)("status_id"),(Object)(2));
RDebugUtils.currentLine=24641604;
 //BA.debugLineNum = 24641604;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=24641605;
 //BA.debugLineNum = 24641605;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=24641606;
 //BA.debugLineNum = 24641606;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=24641607;
 //BA.debugLineNum = 24641607;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20190";
_newexecution.Put((Object)("object_tagcode"),(Object)("OBJECT_20190911_122437"));
RDebugUtils.currentLine=24641608;
 //BA.debugLineNum = 24641608;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24641609;
 //BA.debugLineNum = 24641609;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24641610;
 //BA.debugLineNum = 24641610;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24641611;
 //BA.debugLineNum = 24641611;BA.debugLine="newExecution.Put(\"repeatcounter\", ReqCounter)";
_newexecution.Put((Object)("repeatcounter"),(Object)(_reqcounter));
RDebugUtils.currentLine=24641612;
 //BA.debugLineNum = 24641612;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24641613;
 //BA.debugLineNum = 24641613;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24641614;
 //BA.debugLineNum = 24641614;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24641615;
 //BA.debugLineNum = 24641615;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24641616;
 //BA.debugLineNum = 24641616;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24641618;
 //BA.debugLineNum = 24641618;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24641645;
 //BA.debugLineNum = 24641645;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"+"				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"				x.execute_value, x.execute_format_title,x.confirmed, x.changed_value, x.repeatcounter\n"+"				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, \n"+"				'' as execute_value, \n"+"				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value, a.repeatcounter\n"+"				from dta_requests_relations as a\n"+"				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and a.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcounter))+"\n"+"				) as x\n"+"				order by  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=24641662;
 //BA.debugLineNum = 24641662;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641662",_ssql,0);
RDebugUtils.currentLine=24641663;
 //BA.debugLineNum = 24641663;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL, n";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_DEMO",_ssql,_newrequest);
RDebugUtils.currentLine=24641666;
 //BA.debugLineNum = 24641666;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIt";
_uploadnewrequest2server(_newrequest,_newrequestitem,"0");
RDebugUtils.currentLine=24641667;
 //BA.debugLineNum = 24641667;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "butcallactions_bf"),(int) (1000));
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=24641669;
 //BA.debugLineNum = 24641669;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQ";
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*String*/ ;
RDebugUtils.currentLine=24641670;
 //BA.debugLineNum = 24641670;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newReq";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and z.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and z.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcounter))+"");
RDebugUtils.currentLine=24641671;
 //BA.debugLineNum = 24641671;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641671",_ssql,0);
RDebugUtils.currentLine=24641672;
 //BA.debugLineNum = 24641672;BA.debugLine="Log(newRequest)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641672",_newrequest,0);
RDebugUtils.currentLine=24641673;
 //BA.debugLineNum = 24641673;BA.debugLine="Private incolitems As Cursor";
_incolitems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=24641674;
 //BA.debugLineNum = 24641674;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_incolitems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=24641675;
 //BA.debugLineNum = 24641675;BA.debugLine="If (incolitems.RowCount >= 1) Then";
if (true) break;

case 8:
//if
this.state = 29;
if ((_incolitems.getRowCount()>=1)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=24641676;
 //BA.debugLineNum = 24641676;BA.debugLine="incolitems.Position = 0";
_incolitems.setPosition((int) (0));
RDebugUtils.currentLine=24641678;
 //BA.debugLineNum = 24641678;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
_id = _incolitems.GetInt("id");
RDebugUtils.currentLine=24641679;
 //BA.debugLineNum = 24641679;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\")";
_tasktype = _incolitems.GetInt("type");
RDebugUtils.currentLine=24641680;
 //BA.debugLineNum = 24641680;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"statu";
_status_id = _incolitems.GetInt("status_id");
RDebugUtils.currentLine=24641681;
 //BA.debugLineNum = 24641681;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"t";
_tagcode = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=24641682;
 //BA.debugLineNum = 24641682;BA.debugLine="Dim actionkey As String = incolitems.GetString(";
_actionkey = _incolitems.GetString("action_tagcode");
RDebugUtils.currentLine=24641683;
 //BA.debugLineNum = 24641683;BA.debugLine="Dim task As String = incolitems.GetString(\"task";
_task = _incolitems.GetString("task_tagcode");
RDebugUtils.currentLine=24641684;
 //BA.debugLineNum = 24641684;BA.debugLine="Dim name As String = incolitems.GetString(\"name";
_name = _incolitems.GetString("name");
RDebugUtils.currentLine=24641687;
 //BA.debugLineNum = 24641687;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDate";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24641688;
 //BA.debugLineNum = 24641688;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=24641689;
 //BA.debugLineNum = 24641689;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=24641691;
 //BA.debugLineNum = 24641691;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
_sdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24641692;
 //BA.debugLineNum = 24641692;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
_stime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24641694;
 //BA.debugLineNum = 24641694;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clos";
_close_type = _incolitems.GetInt("close_type");
RDebugUtils.currentLine=24641695;
 //BA.debugLineNum = 24641695;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"res";
_result_type = _incolitems.GetInt("result_type");
RDebugUtils.currentLine=24641696;
 //BA.debugLineNum = 24641696;BA.debugLine="Dim result_values As String = incolitems.GetStr";
_result_values = _incolitems.GetString("result_values");
RDebugUtils.currentLine=24641698;
 //BA.debugLineNum = 24641698;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeRequ";
_clainfo = parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),_close_type,_result_type,_result_values,anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1));
RDebugUtils.currentLine=24641699;
 //BA.debugLineNum = 24641699;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(ta";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,_tagcode,_actionkey,_task,_reqcounter,_tasktype,parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,_id,_tagcode,_status_id,parent.mostCurrent._utils._colorint /*int*/ (mostCurrent.activityBA,_status_id)),_clainfo,parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=24641703;
 //BA.debugLineNum = 24641703;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
_ssql = ("update dta_requests set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=24641704;
 //BA.debugLineNum = 24641704;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_DEMO",_ssql,_tagcode);
RDebugUtils.currentLine=24641706;
 //BA.debugLineNum = 24641706;BA.debugLine="Log(\"Grava Status na BD local Request\")";
anywheresoftware.b4a.keywords.Common.LogImpl("624641706","Grava Status na BD local Request",0);
RDebugUtils.currentLine=24641707;
 //BA.debugLineNum = 24641707;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24641708;
 //BA.debugLineNum = 24641708;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=24641709;
 //BA.debugLineNum = 24641709;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=24641710;
 //BA.debugLineNum = 24641710;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=24641711;
 //BA.debugLineNum = 24641711;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=24641712;
 //BA.debugLineNum = 24641712;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=24641713;
 //BA.debugLineNum = 24641713;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24641714;
 //BA.debugLineNum = 24641714;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=24641715;
 //BA.debugLineNum = 24641715;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=24641716;
 //BA.debugLineNum = 24641716;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=24641717;
 //BA.debugLineNum = 24641717;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=24641718;
 //BA.debugLineNum = 24641718;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=24641719;
 //BA.debugLineNum = 24641719;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=24641720;
 //BA.debugLineNum = 24641720;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=24641721;
 //BA.debugLineNum = 24641721;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=24641722;
 //BA.debugLineNum = 24641722;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=24641723;
 //BA.debugLineNum = 24641723;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24641724;
 //BA.debugLineNum = 24641724;BA.debugLine="Try";
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
RDebugUtils.currentLine=24641725;
 //BA.debugLineNum = 24641725;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=24641726;
 //BA.debugLineNum = 24641726;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 31;
RDebugUtils.currentLine=24641728;
 //BA.debugLineNum = 24641728;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641728",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24641729;
 //BA.debugLineNum = 24641729;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=24641730;
 //BA.debugLineNum = 24641730;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=24641731;
 //BA.debugLineNum = 24641731;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 31;
;
RDebugUtils.currentLine=24641733;
 //BA.debugLineNum = 24641733;BA.debugLine="CLA.Info.Map1 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=24641735;
 //BA.debugLineNum = 24641735;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'  \n"+"						where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcounter))+"");
RDebugUtils.currentLine=24641737;
 //BA.debugLineNum = 24641737;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_DEMO",_ssql,_tagcode);
RDebugUtils.currentLine=24641739;
 //BA.debugLineNum = 24641739;BA.debugLine="Log(\"Grava Status na BD local Request-Relation\"";
anywheresoftware.b4a.keywords.Common.LogImpl("624641739","Grava Status na BD local Request-Relation",0);
RDebugUtils.currentLine=24641741;
 //BA.debugLineNum = 24641741;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24641742;
 //BA.debugLineNum = 24641742;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=24641743;
 //BA.debugLineNum = 24641743;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=24641744;
 //BA.debugLineNum = 24641744;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=24641745;
 //BA.debugLineNum = 24641745;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=24641746;
 //BA.debugLineNum = 24641746;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
_params.Put((Object)("ACLAAction"),(Object)(_actionkey));
RDebugUtils.currentLine=24641747;
 //BA.debugLineNum = 24641747;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=24641748;
 //BA.debugLineNum = 24641748;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24641749;
 //BA.debugLineNum = 24641749;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=24641750;
 //BA.debugLineNum = 24641750;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=24641751;
 //BA.debugLineNum = 24641751;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=24641752;
 //BA.debugLineNum = 24641752;BA.debugLine="params.Put(\"ACLAReqCounter\", ReqCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_reqcounter));
RDebugUtils.currentLine=24641753;
 //BA.debugLineNum = 24641753;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=24641754;
 //BA.debugLineNum = 24641754;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=24641755;
 //BA.debugLineNum = 24641755;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=24641756;
 //BA.debugLineNum = 24641756;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=24641757;
 //BA.debugLineNum = 24641757;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=24641758;
 //BA.debugLineNum = 24641758;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=24641759;
 //BA.debugLineNum = 24641759;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24641760;
 //BA.debugLineNum = 24641760;BA.debugLine="Try";
if (true) break;

case 17:
//try
this.state = 22;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
RDebugUtils.currentLine=24641761;
 //BA.debugLineNum = 24641761;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=24641762;
 //BA.debugLineNum = 24641762;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=24641763;
 //BA.debugLineNum = 24641763;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
RDebugUtils.currentLine=24641765;
 //BA.debugLineNum = 24641765;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641765",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24641766;
 //BA.debugLineNum = 24641766;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=24641767;
 //BA.debugLineNum = 24641767;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 31;
;
RDebugUtils.currentLine=24641769;
 //BA.debugLineNum = 24641769;BA.debugLine="CLA.Info.Map2 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=24641770;
 //BA.debugLineNum = 24641770;BA.debugLine="CLA.Status.status = 2";
_cla.Status /*xevolution.vrcg.devdemov2400.types._intervention*/ .status /*int*/  = (int) (2);
RDebugUtils.currentLine=24641771;
 //BA.debugLineNum = 24641771;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
RDebugUtils.currentLine=24641772;
 //BA.debugLineNum = 24641772;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_ActivityMain",(Object)(_cla),(Object)(_name));
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 31;
RDebugUtils.currentLine=24641774;
 //BA.debugLineNum = 24641774;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641774",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24641775;
 //BA.debugLineNum = 24641775;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Share";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Call StartCLA_Activity",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 31;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=24641779;
 //BA.debugLineNum = 24641779;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624641779",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24641803;
 //BA.debugLineNum = 24641803;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24641805;
 //BA.debugLineNum = 24641805;BA.debugLine="panelOptions.Visible = False";
parent.mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24641806;
 //BA.debugLineNum = 24641806;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24641807;
 //BA.debugLineNum = 24641807;BA.debugLine="End Sub";
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
public static void  _uploadnewrequest2server(String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequest2server", false))
	 {Debug.delegate(mostCurrent.activityBA, "uploadnewrequest2server", new Object[] {_tagcode,_items,_origin}); return;}
ResumableSub_UploadNewRequest2Server rsub = new ResumableSub_UploadNewRequest2Server(null,_tagcode,_items,_origin);
rsub.resume(processBA, null);
}
public static class ResumableSub_UploadNewRequest2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server(xevolution.vrcg.devdemov2400.mainmenu parent,String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _tagcode;
anywheresoftware.b4a.objects.collections.Map _items;
String _origin;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=24707082;
 //BA.debugLineNum = 24707082;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=24707084;
 //BA.debugLineNum = 24707084;BA.debugLine="params.Put(\"origin\", origin)";
_params.Put((Object)("origin"),(Object)(_origin));
RDebugUtils.currentLine=24707085;
 //BA.debugLineNum = 24707085;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24707086;
 //BA.debugLineNum = 24707086;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=24707087;
 //BA.debugLineNum = 24707087;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=24707088;
 //BA.debugLineNum = 24707088;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=24707089;
 //BA.debugLineNum = 24707089;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=24707090;
 //BA.debugLineNum = 24707090;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=24707091;
 //BA.debugLineNum = 24707091;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=24707092;
 //BA.debugLineNum = 24707092;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24707094;
 //BA.debugLineNum = 24707094;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=24707095;
 //BA.debugLineNum = 24707095;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=24707096;
 //BA.debugLineNum = 24707096;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=24707098;
 //BA.debugLineNum = 24707098;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("624707098",_data,0);
RDebugUtils.currentLine=24707100;
 //BA.debugLineNum = 24707100;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/new");
RDebugUtils.currentLine=24707101;
 //BA.debugLineNum = 24707101;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=24707102;
 //BA.debugLineNum = 24707102;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=24707103;
 //BA.debugLineNum = 24707103;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",mainmenu.getObject());
RDebugUtils.currentLine=24707104;
 //BA.debugLineNum = 24707104;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=24707105;
 //BA.debugLineNum = 24707105;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=24707106;
 //BA.debugLineNum = 24707106;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadnewrequest2server"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=24707107;
 //BA.debugLineNum = 24707107;BA.debugLine="If Job.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=24707108;
 //BA.debugLineNum = 24707108;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("624707108",_job._getstring /*String*/ (null),0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=24707110;
 //BA.debugLineNum = 24707110;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=24707111;
 //BA.debugLineNum = 24707111;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=24707113;
 //BA.debugLineNum = 24707113;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=24707115;
 //BA.debugLineNum = 24707115;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=24707116;
 //BA.debugLineNum = 24707116;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=24707119;
 //BA.debugLineNum = 24707119;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butcallactions_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallactions_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcallactions_click", null));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Sub butCallActions_Click";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="If (ShareCode.APP_DOMAIN.ToLowerCase = \"demo\") Th";
if (((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("demo"))) { 
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="butCallActions_DEMO";
_butcallactions_demo();
 }else 
{RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="else if  (ShareCode.APP_DOMAIN.ToLowerCase.Contai";
if ((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase().contains("grandative"))) { 
RDebugUtils.currentLine=24444933;
 //BA.debugLineNum = 24444933;BA.debugLine="butCallActions_GA";
_butcallactions_ga();
 }else 
{RDebugUtils.currentLine=24444934;
 //BA.debugLineNum = 24444934;BA.debugLine="else if  (ShareCode.APP_DOMAIN.ToLowerCase = \"bra";
if (((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("brasfone"))) { 
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="butCallActions_BF";
_butcallactions_bf();
 }}}
;
RDebugUtils.currentLine=24444937;
 //BA.debugLineNum = 24444937;BA.debugLine="End Sub";
return "";
}
public static void  _butcallactions_demo() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallactions_demo", false))
	 {Debug.delegate(mostCurrent.activityBA, "butcallactions_demo", null); return;}
ResumableSub_butCallActions_DEMO rsub = new ResumableSub_butCallActions_DEMO(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butCallActions_DEMO extends BA.ResumableSub {
public ResumableSub_butCallActions_DEMO(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _tagcode = "";
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
String _newrequesttype = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _newrequest = "";
String _newdate = "";
String _newtime = "";
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
int _reqcounter = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _incolitems = null;
int _id = 0;
int _tasktype = 0;
int _status_id = 0;
String _actionkey = "";
String _task = "";
String _name = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _sdate = "";
String _stime = "";
int _close_type = 0;
int _result_type = 0;
String _result_values = "";
xevolution.vrcg.devdemov2400.types._requesttaskinfo _clainfo = null;
xevolution.vrcg.devdemov2400.types._requestcla _cla = null;
anywheresoftware.b4a.objects.collections.Map _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24576008;
 //BA.debugLineNum = 24576008;BA.debugLine="Dim tagcode As String = \"TSKS_20191002_193834\" '\"";
_tagcode = "TSKS_20191002_193834";
RDebugUtils.currentLine=24576009;
 //BA.debugLineNum = 24576009;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*String*/ ));
RDebugUtils.currentLine=24576010;
 //BA.debugLineNum = 24576010;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 32;
this.catchState = 31;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 31;
RDebugUtils.currentLine=24576011;
 //BA.debugLineNum = 24576011;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24576012;
 //BA.debugLineNum = 24576012;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=24576013;
 //BA.debugLineNum = 24576013;BA.debugLine="Dim newRequestType As String = \"\"";
_newrequesttype = "";
RDebugUtils.currentLine=24576014;
 //BA.debugLineNum = 24576014;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
_ssql = ("select distinct tagcode, title\n"+"				from dta_typerequests \n"+"				where tagcode in (select distinct typerequest_tagcode \n"+"					from dta_typerequests_tasks where task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"') and tr_is_model=0 limit 1");
RDebugUtils.currentLine=24576019;
 //BA.debugLineNum = 24576019;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=24576020;
 //BA.debugLineNum = 24576020;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=24576021;
 //BA.debugLineNum = 24576021;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_record.getRowCount()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=24576022;
 //BA.debugLineNum = 24576022;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=24576023;
 //BA.debugLineNum = 24576023;BA.debugLine="newRequestType = Utils.IfNullOrEmpty(Record.Get";
_newrequesttype = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("tagcode"),"TSKS_20191002_232135");
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=24576025;
 //BA.debugLineNum = 24576025;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=24576026;
 //BA.debugLineNum = 24576026;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagc";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24576027;
 //BA.debugLineNum = 24576027;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24576028;
 //BA.debugLineNum = 24576028;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24576030;
 //BA.debugLineNum = 24576030;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24576031;
 //BA.debugLineNum = 24576031;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24576032;
 //BA.debugLineNum = 24576032;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24576033;
 //BA.debugLineNum = 24576033;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=24576034;
 //BA.debugLineNum = 24576034;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=24576035;
 //BA.debugLineNum = 24576035;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=24576036;
 //BA.debugLineNum = 24576036;BA.debugLine="newExecution.Put(\"status_id\", 2)";
_newexecution.Put((Object)("status_id"),(Object)(2));
RDebugUtils.currentLine=24576037;
 //BA.debugLineNum = 24576037;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=24576038;
 //BA.debugLineNum = 24576038;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=24576039;
 //BA.debugLineNum = 24576039;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=24576040;
 //BA.debugLineNum = 24576040;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=24576041;
 //BA.debugLineNum = 24576041;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=24576042;
 //BA.debugLineNum = 24576042;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24576043;
 //BA.debugLineNum = 24576043;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24576044;
 //BA.debugLineNum = 24576044;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24576045;
 //BA.debugLineNum = 24576045;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNA";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=24576046;
 //BA.debugLineNum = 24576046;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"OBJECT_2019_";
_newexecution.Put((Object)("entity_tagcode"),(Object)("OBJECT_2019_091642"));
RDebugUtils.currentLine=24576047;
 //BA.debugLineNum = 24576047;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20191";
_newexecution.Put((Object)("object_tagcode"),(Object)("OBJECT_20191002_193449"));
RDebugUtils.currentLine=24576048;
 //BA.debugLineNum = 24576048;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=24576049;
 //BA.debugLineNum = 24576049;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=24576050;
 //BA.debugLineNum = 24576050;BA.debugLine="newExecution.Put(\"local_tagcode\", \"ADRSS_2019100";
_newexecution.Put((Object)("local_tagcode"),(Object)("ADRSS_20191002_193449"));
RDebugUtils.currentLine=24576051;
 //BA.debugLineNum = 24576051;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReque";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_newrequesttype));
RDebugUtils.currentLine=24576052;
 //BA.debugLineNum = 24576052;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SE";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=24576053;
 //BA.debugLineNum = 24576053;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=24576054;
 //BA.debugLineNum = 24576054;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24576055;
 //BA.debugLineNum = 24576055;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24576056;
 //BA.debugLineNum = 24576056;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24576057;
 //BA.debugLineNum = 24576057;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24576058;
 //BA.debugLineNum = 24576058;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24576060;
 //BA.debugLineNum = 24576060;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24576063;
 //BA.debugLineNum = 24576063;BA.debugLine="Dim ReqCounter As Int = DBStructures.GetCountOfE";
_reqcounter = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'"));
RDebugUtils.currentLine=24576065;
 //BA.debugLineNum = 24576065;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24576066;
 //BA.debugLineNum = 24576066;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24576067;
 //BA.debugLineNum = 24576067;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24576068;
 //BA.debugLineNum = 24576068;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode)";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=24576069;
 //BA.debugLineNum = 24576069;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=24576070;
 //BA.debugLineNum = 24576070;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=24576071;
 //BA.debugLineNum = 24576071;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=24576072;
 //BA.debugLineNum = 24576072;BA.debugLine="newExecution.Put(\"status_id\", 2)";
_newexecution.Put((Object)("status_id"),(Object)(2));
RDebugUtils.currentLine=24576073;
 //BA.debugLineNum = 24576073;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=24576074;
 //BA.debugLineNum = 24576074;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=24576075;
 //BA.debugLineNum = 24576075;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=24576076;
 //BA.debugLineNum = 24576076;BA.debugLine="newExecution.Put(\"object_tagcode\", \"OBJECT_20191";
_newexecution.Put((Object)("object_tagcode"),(Object)("OBJECT_20191002_193449"));
RDebugUtils.currentLine=24576077;
 //BA.debugLineNum = 24576077;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24576078;
 //BA.debugLineNum = 24576078;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24576079;
 //BA.debugLineNum = 24576079;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24576080;
 //BA.debugLineNum = 24576080;BA.debugLine="newExecution.Put(\"repeatcounter\", ReqCounter)";
_newexecution.Put((Object)("repeatcounter"),(Object)(_reqcounter));
RDebugUtils.currentLine=24576081;
 //BA.debugLineNum = 24576081;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24576082;
 //BA.debugLineNum = 24576082;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24576083;
 //BA.debugLineNum = 24576083;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24576084;
 //BA.debugLineNum = 24576084;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24576085;
 //BA.debugLineNum = 24576085;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24576087;
 //BA.debugLineNum = 24576087;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24576114;
 //BA.debugLineNum = 24576114;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"+"				select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode,\n"+"				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"				x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"+"				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, \n"+"				'' as execute_value, \n"+"				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value, a.repeatcounter\n"+"				from dta_requests_relations as a\n"+"				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and a.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcounter))+"\n"+"				) as x\n"+"				order by  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=24576131;
 //BA.debugLineNum = 24576131;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576131",_ssql,0);
RDebugUtils.currentLine=24576132;
 //BA.debugLineNum = 24576132;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL, n";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_DEMO",_ssql,_newrequest);
RDebugUtils.currentLine=24576135;
 //BA.debugLineNum = 24576135;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIt";
_uploadnewrequest2server(_newrequest,_newrequestitem,"0");
RDebugUtils.currentLine=24576136;
 //BA.debugLineNum = 24576136;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "butcallactions_demo"),(int) (1000));
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=24576138;
 //BA.debugLineNum = 24576138;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQ";
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*String*/ ;
RDebugUtils.currentLine=24576139;
 //BA.debugLineNum = 24576139;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newReq";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and z.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and z.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcounter))+"");
RDebugUtils.currentLine=24576140;
 //BA.debugLineNum = 24576140;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576140",_ssql,0);
RDebugUtils.currentLine=24576141;
 //BA.debugLineNum = 24576141;BA.debugLine="Log(newRequest)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576141",_newrequest,0);
RDebugUtils.currentLine=24576142;
 //BA.debugLineNum = 24576142;BA.debugLine="Private incolitems As Cursor";
_incolitems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=24576143;
 //BA.debugLineNum = 24576143;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_incolitems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=24576144;
 //BA.debugLineNum = 24576144;BA.debugLine="If (incolitems.RowCount >= 1) Then";
if (true) break;

case 8:
//if
this.state = 29;
if ((_incolitems.getRowCount()>=1)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=24576145;
 //BA.debugLineNum = 24576145;BA.debugLine="incolitems.Position = 0";
_incolitems.setPosition((int) (0));
RDebugUtils.currentLine=24576147;
 //BA.debugLineNum = 24576147;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
_id = _incolitems.GetInt("id");
RDebugUtils.currentLine=24576148;
 //BA.debugLineNum = 24576148;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\")";
_tasktype = _incolitems.GetInt("type");
RDebugUtils.currentLine=24576149;
 //BA.debugLineNum = 24576149;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"statu";
_status_id = _incolitems.GetInt("status_id");
RDebugUtils.currentLine=24576150;
 //BA.debugLineNum = 24576150;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"t";
_tagcode = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=24576151;
 //BA.debugLineNum = 24576151;BA.debugLine="Dim actionkey As String = incolitems.GetString(";
_actionkey = _incolitems.GetString("action_tagcode");
RDebugUtils.currentLine=24576152;
 //BA.debugLineNum = 24576152;BA.debugLine="Dim task As String = incolitems.GetString(\"task";
_task = _incolitems.GetString("task_tagcode");
RDebugUtils.currentLine=24576153;
 //BA.debugLineNum = 24576153;BA.debugLine="Dim name As String = incolitems.GetString(\"name";
_name = _incolitems.GetString("name");
RDebugUtils.currentLine=24576156;
 //BA.debugLineNum = 24576156;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDate";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24576157;
 //BA.debugLineNum = 24576157;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=24576158;
 //BA.debugLineNum = 24576158;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=24576160;
 //BA.debugLineNum = 24576160;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
_sdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24576161;
 //BA.debugLineNum = 24576161;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
_stime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24576163;
 //BA.debugLineNum = 24576163;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clos";
_close_type = _incolitems.GetInt("close_type");
RDebugUtils.currentLine=24576164;
 //BA.debugLineNum = 24576164;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"res";
_result_type = _incolitems.GetInt("result_type");
RDebugUtils.currentLine=24576165;
 //BA.debugLineNum = 24576165;BA.debugLine="Dim result_values As String = incolitems.GetStr";
_result_values = _incolitems.GetString("result_values");
RDebugUtils.currentLine=24576167;
 //BA.debugLineNum = 24576167;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeRequ";
_clainfo = parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),_close_type,_result_type,_result_values,anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1));
RDebugUtils.currentLine=24576168;
 //BA.debugLineNum = 24576168;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(ta";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,_tagcode,_actionkey,_task,_reqcounter,_tasktype,parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,_id,_tagcode,_status_id,parent.mostCurrent._utils._colorint /*int*/ (mostCurrent.activityBA,_status_id)),_clainfo,parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=24576172;
 //BA.debugLineNum = 24576172;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
_ssql = ("update dta_requests set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=24576173;
 //BA.debugLineNum = 24576173;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_DEMO",_ssql,_tagcode);
RDebugUtils.currentLine=24576175;
 //BA.debugLineNum = 24576175;BA.debugLine="Log(\"Grava Status na BD local Request\")";
anywheresoftware.b4a.keywords.Common.LogImpl("624576175","Grava Status na BD local Request",0);
RDebugUtils.currentLine=24576176;
 //BA.debugLineNum = 24576176;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24576177;
 //BA.debugLineNum = 24576177;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=24576178;
 //BA.debugLineNum = 24576178;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=24576179;
 //BA.debugLineNum = 24576179;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=24576180;
 //BA.debugLineNum = 24576180;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=24576181;
 //BA.debugLineNum = 24576181;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=24576182;
 //BA.debugLineNum = 24576182;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24576183;
 //BA.debugLineNum = 24576183;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=24576184;
 //BA.debugLineNum = 24576184;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=24576185;
 //BA.debugLineNum = 24576185;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=24576186;
 //BA.debugLineNum = 24576186;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=24576187;
 //BA.debugLineNum = 24576187;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=24576188;
 //BA.debugLineNum = 24576188;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=24576189;
 //BA.debugLineNum = 24576189;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=24576190;
 //BA.debugLineNum = 24576190;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=24576191;
 //BA.debugLineNum = 24576191;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=24576192;
 //BA.debugLineNum = 24576192;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=24576193;
 //BA.debugLineNum = 24576193;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24576194;
 //BA.debugLineNum = 24576194;BA.debugLine="Try";
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
RDebugUtils.currentLine=24576195;
 //BA.debugLineNum = 24576195;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=24576196;
 //BA.debugLineNum = 24576196;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 31;
RDebugUtils.currentLine=24576198;
 //BA.debugLineNum = 24576198;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576198",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24576199;
 //BA.debugLineNum = 24576199;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=24576200;
 //BA.debugLineNum = 24576200;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=24576201;
 //BA.debugLineNum = 24576201;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 31;
;
RDebugUtils.currentLine=24576203;
 //BA.debugLineNum = 24576203;BA.debugLine="CLA.Info.Map1 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=24576205;
 //BA.debugLineNum = 24576205;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'  \n"+"						where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcounter))+"");
RDebugUtils.currentLine=24576207;
 //BA.debugLineNum = 24576207;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_DEMO\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_DEMO",_ssql,_tagcode);
RDebugUtils.currentLine=24576209;
 //BA.debugLineNum = 24576209;BA.debugLine="Log(\"Grava Status na BD local Request-Relation\"";
anywheresoftware.b4a.keywords.Common.LogImpl("624576209","Grava Status na BD local Request-Relation",0);
RDebugUtils.currentLine=24576211;
 //BA.debugLineNum = 24576211;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24576212;
 //BA.debugLineNum = 24576212;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=24576213;
 //BA.debugLineNum = 24576213;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=24576214;
 //BA.debugLineNum = 24576214;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=24576215;
 //BA.debugLineNum = 24576215;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=24576216;
 //BA.debugLineNum = 24576216;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
_params.Put((Object)("ACLAAction"),(Object)(_actionkey));
RDebugUtils.currentLine=24576217;
 //BA.debugLineNum = 24576217;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=24576218;
 //BA.debugLineNum = 24576218;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24576219;
 //BA.debugLineNum = 24576219;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=24576220;
 //BA.debugLineNum = 24576220;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=24576221;
 //BA.debugLineNum = 24576221;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=24576222;
 //BA.debugLineNum = 24576222;BA.debugLine="params.Put(\"ACLAReqCounter\", ReqCounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_reqcounter));
RDebugUtils.currentLine=24576223;
 //BA.debugLineNum = 24576223;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=24576224;
 //BA.debugLineNum = 24576224;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=24576225;
 //BA.debugLineNum = 24576225;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=24576226;
 //BA.debugLineNum = 24576226;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=24576227;
 //BA.debugLineNum = 24576227;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=24576228;
 //BA.debugLineNum = 24576228;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=24576229;
 //BA.debugLineNum = 24576229;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=24576230;
 //BA.debugLineNum = 24576230;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24576231;
 //BA.debugLineNum = 24576231;BA.debugLine="Try";
if (true) break;

case 17:
//try
this.state = 22;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
RDebugUtils.currentLine=24576232;
 //BA.debugLineNum = 24576232;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=24576233;
 //BA.debugLineNum = 24576233;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=24576234;
 //BA.debugLineNum = 24576234;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
RDebugUtils.currentLine=24576236;
 //BA.debugLineNum = 24576236;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576236",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24576237;
 //BA.debugLineNum = 24576237;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=24576238;
 //BA.debugLineNum = 24576238;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 31;
;
RDebugUtils.currentLine=24576240;
 //BA.debugLineNum = 24576240;BA.debugLine="CLA.Info.Map2 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=24576241;
 //BA.debugLineNum = 24576241;BA.debugLine="CLA.Status.status = 2";
_cla.Status /*xevolution.vrcg.devdemov2400.types._intervention*/ .status /*int*/  = (int) (2);
RDebugUtils.currentLine=24576242;
 //BA.debugLineNum = 24576242;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
RDebugUtils.currentLine=24576243;
 //BA.debugLineNum = 24576243;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_ActivityMain",(Object)(_cla),(Object)(_name));
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 31;
RDebugUtils.currentLine=24576245;
 //BA.debugLineNum = 24576245;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576245",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=24576246;
 //BA.debugLineNum = 24576246;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Share";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Call StartCLA_Activity",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 31;
;
 if (true) break;

case 29:
//C
this.state = 32;
;
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=24576250;
 //BA.debugLineNum = 24576250;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624576250",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24576274;
 //BA.debugLineNum = 24576274;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24576276;
 //BA.debugLineNum = 24576276;BA.debugLine="panelOptions.Visible = False";
parent.mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24576277;
 //BA.debugLineNum = 24576277;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24576278;
 //BA.debugLineNum = 24576278;BA.debugLine="End Sub";
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
public static void  _butcallactions_ga() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallactions_ga", false))
	 {Debug.delegate(mostCurrent.activityBA, "butcallactions_ga", null); return;}
ResumableSub_butCallActions_GA rsub = new ResumableSub_butCallActions_GA(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butCallActions_GA extends BA.ResumableSub {
public ResumableSub_butCallActions_GA(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _tagcode0 = "";
String _tagcode1 = "";
String _tagcode2 = "";
String _tagcode3 = "";
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
anywheresoftware.b4a.objects.collections.Map _newrequestitem2 = null;
anywheresoftware.b4a.objects.collections.Map _newrequestitem3 = null;
String _newrequesttype = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _newrequest = "";
String _newdate = "";
String _newtime = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="Dim tagcode0 As String = \"TSKS_EJRFO\"";
_tagcode0 = "TSKS_EJRFO";
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="Dim tagcode1 As String = \"TSKS_PROSPECT\"";
_tagcode1 = "TSKS_PROSPECT";
RDebugUtils.currentLine=24510471;
 //BA.debugLineNum = 24510471;BA.debugLine="Dim tagcode2 As String = \"TSKS_EJREGERAL\"";
_tagcode2 = "TSKS_EJREGERAL";
RDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="Dim tagcode3 As String = \"TSKS_EJREQUIPMENT\"";
_tagcode3 = "TSKS_EJREQUIPMENT";
RDebugUtils.currentLine=24510474;
 //BA.debugLineNum = 24510474;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*String*/ ));
RDebugUtils.currentLine=24510475;
 //BA.debugLineNum = 24510475;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=24510476;
 //BA.debugLineNum = 24510476;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510477;
 //BA.debugLineNum = 24510477;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=24510479;
 //BA.debugLineNum = 24510479;BA.debugLine="Dim newRequestItem2 As Map";
_newrequestitem2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510480;
 //BA.debugLineNum = 24510480;BA.debugLine="newRequestItem2.Initialize";
_newrequestitem2.Initialize();
RDebugUtils.currentLine=24510482;
 //BA.debugLineNum = 24510482;BA.debugLine="Dim newRequestItem3 As Map";
_newrequestitem3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510483;
 //BA.debugLineNum = 24510483;BA.debugLine="newRequestItem3.Initialize";
_newrequestitem3.Initialize();
RDebugUtils.currentLine=24510485;
 //BA.debugLineNum = 24510485;BA.debugLine="Dim newRequestType As String = \"\"";
_newrequesttype = "";
RDebugUtils.currentLine=24510486;
 //BA.debugLineNum = 24510486;BA.debugLine="Dim sSQL As String = $\"select distinct tagcode,";
_ssql = ("select distinct tagcode, title\n"+"				from dta_typerequests  where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode0))+"'");
RDebugUtils.currentLine=24510491;
 //BA.debugLineNum = 24510491;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=24510492;
 //BA.debugLineNum = 24510492;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=24510493;
 //BA.debugLineNum = 24510493;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_record.getRowCount()>0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=24510494;
 //BA.debugLineNum = 24510494;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=24510495;
 //BA.debugLineNum = 24510495;BA.debugLine="newRequestType = Record.GetString(\"tagcode\")";
_newrequesttype = _record.GetString("tagcode");
 if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=24510497;
 //BA.debugLineNum = 24510497;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=24510498;
 //BA.debugLineNum = 24510498;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagc";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24510499;
 //BA.debugLineNum = 24510499;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24510500;
 //BA.debugLineNum = 24510500;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=24510502;
 //BA.debugLineNum = 24510502;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests","id","")+1+1000000);
RDebugUtils.currentLine=24510505;
 //BA.debugLineNum = 24510505;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510506;
 //BA.debugLineNum = 24510506;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24510507;
 //BA.debugLineNum = 24510507;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=24510508;
 //BA.debugLineNum = 24510508;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24510509;
 //BA.debugLineNum = 24510509;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=24510510;
 //BA.debugLineNum = 24510510;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=24510511;
 //BA.debugLineNum = 24510511;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=24510512;
 //BA.debugLineNum = 24510512;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=24510513;
 //BA.debugLineNum = 24510513;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=24510514;
 //BA.debugLineNum = 24510514;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=24510515;
 //BA.debugLineNum = 24510515;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=24510516;
 //BA.debugLineNum = 24510516;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=24510517;
 //BA.debugLineNum = 24510517;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=24510518;
 //BA.debugLineNum = 24510518;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24510519;
 //BA.debugLineNum = 24510519;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24510520;
 //BA.debugLineNum = 24510520;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24510521;
 //BA.debugLineNum = 24510521;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNA";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=24510522;
 //BA.debugLineNum = 24510522;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"OBJECT_DESIG";
_newexecution.Put((Object)("entity_tagcode"),(Object)("OBJECT_DESIGNATE"));
RDebugUtils.currentLine=24510523;
 //BA.debugLineNum = 24510523;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=24510524;
 //BA.debugLineNum = 24510524;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=24510525;
 //BA.debugLineNum = 24510525;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=24510526;
 //BA.debugLineNum = 24510526;BA.debugLine="newExecution.Put(\"local_tagcode\", \"ADRSS_2019052";
_newexecution.Put((Object)("local_tagcode"),(Object)("ADRSS_20190522105322"));
RDebugUtils.currentLine=24510527;
 //BA.debugLineNum = 24510527;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", tagcode0";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_tagcode0));
RDebugUtils.currentLine=24510528;
 //BA.debugLineNum = 24510528;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SE";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=24510529;
 //BA.debugLineNum = 24510529;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=24510530;
 //BA.debugLineNum = 24510530;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24510531;
 //BA.debugLineNum = 24510531;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
_newexecution.Put((Object)("cbr_id"),(Object)(0));
RDebugUtils.currentLine=24510532;
 //BA.debugLineNum = 24510532;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24510533;
 //BA.debugLineNum = 24510533;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24510534;
 //BA.debugLineNum = 24510534;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24510535;
 //BA.debugLineNum = 24510535;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24510537;
 //BA.debugLineNum = 24510537;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24510540;
 //BA.debugLineNum = 24510540;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations","id","")+1+1000000);
RDebugUtils.currentLine=24510541;
 //BA.debugLineNum = 24510541;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510542;
 //BA.debugLineNum = 24510542;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24510543;
 //BA.debugLineNum = 24510543;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=24510544;
 //BA.debugLineNum = 24510544;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24510545;
 //BA.debugLineNum = 24510545;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode1)";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode1));
RDebugUtils.currentLine=24510546;
 //BA.debugLineNum = 24510546;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=24510547;
 //BA.debugLineNum = 24510547;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=24510548;
 //BA.debugLineNum = 24510548;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=24510549;
 //BA.debugLineNum = 24510549;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=24510550;
 //BA.debugLineNum = 24510550;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=24510551;
 //BA.debugLineNum = 24510551;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=24510552;
 //BA.debugLineNum = 24510552;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=24510553;
 //BA.debugLineNum = 24510553;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=24510554;
 //BA.debugLineNum = 24510554;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24510555;
 //BA.debugLineNum = 24510555;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24510556;
 //BA.debugLineNum = 24510556;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24510557;
 //BA.debugLineNum = 24510557;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24510558;
 //BA.debugLineNum = 24510558;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
_newexecution.Put((Object)("cbr_id"),(Object)(0));
RDebugUtils.currentLine=24510559;
 //BA.debugLineNum = 24510559;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24510560;
 //BA.debugLineNum = 24510560;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24510561;
 //BA.debugLineNum = 24510561;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24510562;
 //BA.debugLineNum = 24510562;BA.debugLine="newRequestItem2.Put(\"0\", ListOfMaps)";
_newrequestitem2.Put((Object)("0"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24510564;
 //BA.debugLineNum = 24510564;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24510566;
 //BA.debugLineNum = 24510566;BA.debugLine="maxID = maxID + 1 + 100000";
_maxid = (int) (_maxid+1+100000);
RDebugUtils.currentLine=24510567;
 //BA.debugLineNum = 24510567;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510568;
 //BA.debugLineNum = 24510568;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24510569;
 //BA.debugLineNum = 24510569;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=24510570;
 //BA.debugLineNum = 24510570;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24510571;
 //BA.debugLineNum = 24510571;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode2)";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode2));
RDebugUtils.currentLine=24510572;
 //BA.debugLineNum = 24510572;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=24510573;
 //BA.debugLineNum = 24510573;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=24510574;
 //BA.debugLineNum = 24510574;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=24510575;
 //BA.debugLineNum = 24510575;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=24510576;
 //BA.debugLineNum = 24510576;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=24510577;
 //BA.debugLineNum = 24510577;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=24510578;
 //BA.debugLineNum = 24510578;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=24510579;
 //BA.debugLineNum = 24510579;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=24510580;
 //BA.debugLineNum = 24510580;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24510581;
 //BA.debugLineNum = 24510581;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24510582;
 //BA.debugLineNum = 24510582;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24510583;
 //BA.debugLineNum = 24510583;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24510584;
 //BA.debugLineNum = 24510584;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
_newexecution.Put((Object)("cbr_id"),(Object)(0));
RDebugUtils.currentLine=24510585;
 //BA.debugLineNum = 24510585;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24510586;
 //BA.debugLineNum = 24510586;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24510587;
 //BA.debugLineNum = 24510587;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24510588;
 //BA.debugLineNum = 24510588;BA.debugLine="newRequestItem2.Put(\"1\", ListOfMaps)";
_newrequestitem2.Put((Object)("1"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24510590;
 //BA.debugLineNum = 24510590;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24510592;
 //BA.debugLineNum = 24510592;BA.debugLine="maxID = maxID + 1 + 100000";
_maxid = (int) (_maxid+1+100000);
RDebugUtils.currentLine=24510593;
 //BA.debugLineNum = 24510593;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24510594;
 //BA.debugLineNum = 24510594;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=24510595;
 //BA.debugLineNum = 24510595;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=24510596;
 //BA.debugLineNum = 24510596;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=24510597;
 //BA.debugLineNum = 24510597;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode3)";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode3));
RDebugUtils.currentLine=24510598;
 //BA.debugLineNum = 24510598;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=24510599;
 //BA.debugLineNum = 24510599;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=24510600;
 //BA.debugLineNum = 24510600;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=24510601;
 //BA.debugLineNum = 24510601;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=24510602;
 //BA.debugLineNum = 24510602;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=24510603;
 //BA.debugLineNum = 24510603;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=24510604;
 //BA.debugLineNum = 24510604;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=24510605;
 //BA.debugLineNum = 24510605;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=24510606;
 //BA.debugLineNum = 24510606;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=24510607;
 //BA.debugLineNum = 24510607;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=24510608;
 //BA.debugLineNum = 24510608;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=24510609;
 //BA.debugLineNum = 24510609;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=24510610;
 //BA.debugLineNum = 24510610;BA.debugLine="newExecution.Put(\"cbr_id\", 0)";
_newexecution.Put((Object)("cbr_id"),(Object)(0));
RDebugUtils.currentLine=24510611;
 //BA.debugLineNum = 24510611;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24510612;
 //BA.debugLineNum = 24510612;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24510613;
 //BA.debugLineNum = 24510613;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=24510614;
 //BA.debugLineNum = 24510614;BA.debugLine="newRequestItem2.Put(\"2\", ListOfMaps)";
_newrequestitem2.Put((Object)("2"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24510615;
 //BA.debugLineNum = 24510615;BA.debugLine="newRequestItem.Put(\"relation\", newRequestItem2)";
_newrequestitem.Put((Object)("relation"),(Object)(_newrequestitem2.getObject()));
RDebugUtils.currentLine=24510617;
 //BA.debugLineNum = 24510617;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=24510619;
 //BA.debugLineNum = 24510619;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1000000);
RDebugUtils.currentLine=24510621;
 //BA.debugLineNum = 24510621;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"				tagcode,position,execute_value,execute_format_title,confirmed,changed_value,cbr_id)\n"+"				select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"				x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, 0 As cbr_id\n"+"				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, \n"+"				a.position As relposition, '' as execute_value, \n"+"				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value\n"+"				from dta_requests_relations As a\n"+"				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"				union\n"+"				select d.id, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,\n"+"				a.position as relposition, '' as execute_value, \n"+"				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value\n"+"				from dta_requests_relations as a\n"+"				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode \n"+"				from dta_requests_relations where request_tagcode ='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"')) as x\n"+"				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=24510650;
 //BA.debugLineNum = 24510650;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("624510650",_ssql,0);
RDebugUtils.currentLine=24510651;
 //BA.debugLineNum = 24510651;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions_GA\",sSQL, new";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions_GA",_ssql,_newrequest);
RDebugUtils.currentLine=24510655;
 //BA.debugLineNum = 24510655;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIt";
_uploadnewrequest2server(_newrequest,_newrequestitem,"1");
RDebugUtils.currentLine=24510657;
 //BA.debugLineNum = 24510657;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "butcallactions_ga"),(int) (1000));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
RDebugUtils.currentLine=24510659;
 //BA.debugLineNum = 24510659;BA.debugLine="CallRequests";
_callrequests();
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=24510662;
 //BA.debugLineNum = 24510662;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("624510662",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=24510665;
 //BA.debugLineNum = 24510665;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24510667;
 //BA.debugLineNum = 24510667;BA.debugLine="panelOptions.Visible = False";
parent.mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24510668;
 //BA.debugLineNum = 24510668;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=24510669;
 //BA.debugLineNum = 24510669;BA.debugLine="End Sub";
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
public static String  _callrequests() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callrequests", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callrequests", null));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Sub CallRequests";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="If ShareCode.APP_DOMAIN.ToLowerCase.Contains(\"gra";
if (mostCurrent._sharecode._app_domain /*String*/ .toLowerCase().contains("grandative") && (mostCurrent._sharecode._currentrequestfilter /*String*/ ).equals("0")) { 
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="ShareCode.CurrentRequestFilter = \" and  a.status";
mostCurrent._sharecode._currentrequestfilter /*String*/  = " and  a.status_id in (1,2,3,4)";
RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="ShareCode.STS005 = False";
mostCurrent._sharecode._sts005 /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=25624585;
 //BA.debugLineNum = 25624585;BA.debugLine="CallSubDelayed3(requests3, \"StartRequestActivity\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._requests3.getObject()),"StartRequestActivity",(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)(mostCurrent._sharecode._currentrequestfilter /*String*/ ));
RDebugUtils.currentLine=25624586;
 //BA.debugLineNum = 25624586;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=25624587;
 //BA.debugLineNum = 25624587;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=25624588;
 //BA.debugLineNum = 25624588;BA.debugLine="End Sub";
return "";
}
public static String  _butcallcamera_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallcamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcallcamera_click", null));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Sub butCallCamera_Click";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="If Utils.Int2Bool(ShareCode.DEVICE_PARAM_FOTO_EVI";
if (mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_param_foto_evidence /*int*/ )) { 
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="CallSubDelayed2(CameraActivity2, \"StartCamera\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._cameraactivity2.getObject()),"StartCamera",(Object)("MainMenu"));
RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
RDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="panelOptions.Visible = False";
mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="End Sub";
return "";
}
public static String  _butcallimage_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallimage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcallimage_click", null));}
xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Sub butCallImage_Click";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="If Utils.Int2Bool(ShareCode.DEVICE_PARAM_DRAW_EVI";
if (mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_param_draw_evidence /*int*/ )) { 
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Dim CurrentCLAItem As RequestCLAItem = Types.Mak";
_currentclaitem = mostCurrent._types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (mostCurrent.activityBA,"","","","","","",(int) (0),(int) (0),(int) (0),"","","",(int) (3),(int) (0),(int) (0),"",mostCurrent._dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (mostCurrent.activityBA,"",""),"");
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="CallSubDelayed3(ImageEdit, \"StartDraw\", Me, Curr";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._imageedit.getObject()),"StartDraw",mainmenu.getObject(),(Object)(_currentclaitem));
RDebugUtils.currentLine=24379399;
 //BA.debugLineNum = 24379399;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 };
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="panelOptions.Visible = False";
mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="End Sub";
return "";
}
public static String  _butcallshort1_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallshort1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcallshort1_click", null));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Sub butCallShort1_Click";
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="End Sub";
return "";
}
public static String  _butcallshort2_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallshort2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcallshort2_click", null));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Sub butCallShort2_Click";
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return "";
}
public static String  _butcallshort3_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcallshort3_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcallshort3_click", null));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Sub butCallShort3_Click";
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return "";
}
public static String  _butclosesearchpanel_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butclosesearchpanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butclosesearchpanel_click", null));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Sub butCloseSearchPanel_Click";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="SearchPanel.Visible = False";
mostCurrent._searchpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="butActionSearch.Tag = \"\"";
mostCurrent._butactionsearch.setTag((Object)(""));
RDebugUtils.currentLine=29884419;
 //BA.debugLineNum = 29884419;BA.debugLine="EditSearch.Text=\"\"";
mostCurrent._editsearch.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=29884420;
 //BA.debugLineNum = 29884420;BA.debugLine="End Sub";
return "";
}
public static String  _butquickaction_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butquickaction_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butquickaction_click", null));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Sub butQuickAction_Click";
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="Try";
try {RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="If panelOptions.Visible Then";
if (mostCurrent._paneloptions.getVisible()) { 
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="panelOptions.Visible = False";
mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="panelOptions.Visible = True";
mostCurrent._paneloptions.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=24248330;
 //BA.debugLineNum = 24248330;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("624248330",anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage(),0);
 };
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="End Sub";
return "";
}
public static void  _butsearch_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsearch_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butsearch_click", null); return;}
ResumableSub_butSearch_Click rsub = new ResumableSub_butSearch_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butSearch_Click extends BA.ResumableSub {
public ResumableSub_butSearch_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _upl = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29425679;
 //BA.debugLineNum = 29425679;BA.debugLine="If Utils.NNE(EditSearch.Text) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._editsearch.getText())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=29425680;
 //BA.debugLineNum = 29425680;BA.debugLine="SearchPanel.visible = True";
parent.mostCurrent._searchpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29425681;
 //BA.debugLineNum = 29425681;BA.debugLine="ExpandListSearch.Clear";
parent.mostCurrent._expandlistsearch._clear();
RDebugUtils.currentLine=29425682;
 //BA.debugLineNum = 29425682;BA.debugLine="EditSearchSearch.Text = EditSearch.Text";
parent.mostCurrent._editsearchsearch.setText(BA.ObjectToCharSequence(parent.mostCurrent._editsearch.getText()));
RDebugUtils.currentLine=29425684;
 //BA.debugLineNum = 29425684;BA.debugLine="Dim upl  As ResumableSub = MakeGlobalSearchData(";
_upl = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_upl = _makeglobalsearchdata(parent.mostCurrent._editsearch.getText());
RDebugUtils.currentLine=29425685;
 //BA.debugLineNum = 29425685;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "butsearch_click"), _upl);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_finish = (Boolean) result[0];
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=29425697;
 //BA.debugLineNum = 29425697;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _makeglobalsearchdata(String _textdata) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeglobalsearchdata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "makeglobalsearchdata", new Object[] {_textdata}));}
ResumableSub_MakeGlobalSearchData rsub = new ResumableSub_MakeGlobalSearchData(null,_textdata);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MakeGlobalSearchData extends BA.ResumableSub {
public ResumableSub_MakeGlobalSearchData(xevolution.vrcg.devdemov2400.mainmenu parent,String _textdata) {
this.parent = parent;
this._textdata = _textdata;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _textdata;
int _daischeck = 0;
String _clientdb = "";
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _result = null;
int _lastgrupo = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _chapter = null;
int _grupo = 0;
String _otitle = "";
anywheresoftware.b4a.objects.B4XViewWrapper _item = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="ProgressDialogShow2(\"A pesquisar! Aguarde por fav";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("A pesquisar! Aguarde por favor ..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "makeglobalsearchdata"),(int) (50));
this.state = 17;
return;
case 17:
//C
this.state = 1;
;
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="Dim DaisCheck As Int = 15";
_daischeck = (int) (15);
RDebugUtils.currentLine=29491205;
 //BA.debugLineNum = 29491205;BA.debugLine="Dim ClientDB As String = \"\"";
_clientdb = "";
RDebugUtils.currentLine=29491206;
 //BA.debugLineNum = 29491206;BA.debugLine="ProgressSearch.Visible= True";
parent.mostCurrent._progresssearch.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=29491208;
 //BA.debugLineNum = 29491208;BA.debugLine="Dim SSQL As String = DBStructures.EVC_SQL_GLOBAL_";
_ssql = parent.mostCurrent._dbstructures._evc_sql_global_search /*String*/ ;
RDebugUtils.currentLine=29491209;
 //BA.debugLineNum = 29491209;BA.debugLine="SSQL = SSQL.Replace(\":CLIENTDB.\", ClientDB).Repla";
_ssql = _ssql.replace(":CLIENTDB.",_clientdb).replace(":DAYSCHECK",BA.NumberToString(_daischeck)).replace(":FINDTEXT",_textdata);
RDebugUtils.currentLine=29491210;
 //BA.debugLineNum = 29491210;BA.debugLine="Dim Result As ResultSet = Starter.LocalSQLEVC.Exe";
_result = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_result = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=29491211;
 //BA.debugLineNum = 29491211;BA.debugLine="Dim LastGrupo As Int = 0";
_lastgrupo = (int) (0);
RDebugUtils.currentLine=29491212;
 //BA.debugLineNum = 29491212;BA.debugLine="Dim chapter As B4XView";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=29491213;
 //BA.debugLineNum = 29491213;BA.debugLine="Do While Result.NextRow";
if (true) break;

case 1:
//do while
this.state = 16;
while (_result.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=29491214;
 //BA.debugLineNum = 29491214;BA.debugLine="Dim grupo As Int = Result.GetInt(\"grupo\")";
_grupo = _result.GetInt("grupo");
RDebugUtils.currentLine=29491215;
 //BA.debugLineNum = 29491215;BA.debugLine="If (Not(LastGrupo = grupo)) Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((anywheresoftware.b4a.keywords.Common.Not(_lastgrupo==_grupo))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=29491216;
 //BA.debugLineNum = 29491216;BA.debugLine="LastGrupo = grupo";
_lastgrupo = _grupo;
RDebugUtils.currentLine=29491217;
 //BA.debugLineNum = 29491217;BA.debugLine="Dim oTitle As String = $\"Registos\"$";
_otitle = ("Registos");
RDebugUtils.currentLine=29491219;
 //BA.debugLineNum = 29491219;BA.debugLine="If (grupo =1) Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_grupo==1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=29491221;
 //BA.debugLineNum = 29491221;BA.debugLine="else if (grupo=2) Then";
if ((_grupo==2)) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=29491220;
 //BA.debugLineNum = 29491220;BA.debugLine="Dim oTitle As String = $\"Intervenções\"$";
_otitle = ("Intervenções");
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=29491222;
 //BA.debugLineNum = 29491222;BA.debugLine="Dim oTitle As String = $\"Objectos\"$";
_otitle = ("Objectos");
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=29491224;
 //BA.debugLineNum = 29491224;BA.debugLine="Dim oTitle As String = $\"Tarefas\"$";
_otitle = ("Tarefas");
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=29491227;
 //BA.debugLineNum = 29491227;BA.debugLine="Dim chapter As B4XView = CreateChapter(grupo, o";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(_grupo,_otitle);
RDebugUtils.currentLine=29491228;
 //BA.debugLineNum = 29491228;BA.debugLine="ExpandListSearch.Add(chapter, grupo)";
parent.mostCurrent._expandlistsearch._add(_chapter,(Object)(_grupo));
 if (true) break;

case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=29491231;
 //BA.debugLineNum = 29491231;BA.debugLine="Dim Item As B4XView = CreateChapterItem(grupo, R";
_item = new anywheresoftware.b4a.objects.B4XViewWrapper();
_item = _createchapteritem(_grupo,_result);
RDebugUtils.currentLine=29491232;
 //BA.debugLineNum = 29491232;BA.debugLine="ExpandListSearch.Add(Item, grupo)";
parent.mostCurrent._expandlistsearch._add(_item,(Object)(_grupo));
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=29491235;
 //BA.debugLineNum = 29491235;BA.debugLine="Result.Close";
_result.Close();
RDebugUtils.currentLine=29491236;
 //BA.debugLineNum = 29491236;BA.debugLine="ProgressSearch.Visible= False";
parent.mostCurrent._progresssearch.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29491237;
 //BA.debugLineNum = 29491237;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=29491238;
 //BA.debugLineNum = 29491238;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=29491240;
 //BA.debugLineNum = 29491240;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butsearchclear_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsearchclear_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butsearchclear_click", null));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Sub butSearchClear_Click";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="ExpandListSearch.Clear";
mostCurrent._expandlistsearch._clear();
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="EditSearchSearch.Text = \"\"";
mostCurrent._editsearchsearch.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=30081027;
 //BA.debugLineNum = 30081027;BA.debugLine="EditSearch.Text = \"\"";
mostCurrent._editsearch.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=30081028;
 //BA.debugLineNum = 30081028;BA.debugLine="butActionSearch.Tag = \"\"";
mostCurrent._butactionsearch.setTag((Object)(""));
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="End Sub";
return "";
}
public static void  _butsearchsearch_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsearchsearch_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butsearchsearch_click", null); return;}
ResumableSub_butSearchSearch_Click rsub = new ResumableSub_butSearchSearch_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butSearchSearch_Click extends BA.ResumableSub {
public ResumableSub_butSearchSearch_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _upl = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="If Utils.NNE(EditSearchSearch.Text) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._editsearchsearch.getText())) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="ExpandListSearch.Clear";
parent.mostCurrent._expandlistsearch._clear();
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="Dim upl  As ResumableSub = MakeGlobalSearchData(";
_upl = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_upl = _makeglobalsearchdata(parent.mostCurrent._editsearchsearch.getText());
RDebugUtils.currentLine=29818884;
 //BA.debugLineNum = 29818884;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "butsearchsearch_click"), _upl);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_finish = (Boolean) result[0];
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=29818886;
 //BA.debugLineNum = 29818886;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butsearchserver_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsearchserver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butsearchserver_click", null));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Sub butSearchServer_Click";
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return "";
}
public static String  _buttonactionpause_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonactionpause_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonactionpause_click", null));}
int _i = 0;
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Sub ButtonActionPause_Click";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if ((mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=27590660;
 //BA.debugLineNum = 27590660;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=27590663;
 //BA.debugLineNum = 27590663;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 };
 };
RDebugUtils.currentLine=27590666;
 //BA.debugLineNum = 27590666;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=27590667;
 //BA.debugLineNum = 27590667;BA.debugLine="End Sub";
return "";
}
public static String  _buttonappnetwork_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonappnetwork_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonappnetwork_click", null));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Sub ButtonAppNetwork_Click";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="MsgboxAsync(ShareCode.ConnectionBreak, ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._connectionbreak /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalnotetitle /*String*/ ),processBA);
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return "";
}
public static String  _buttonassociated_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonassociated_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonassociated_click", null));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Sub ButtonAssociated_Click";
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="Try";
try {RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="ListViewBluetoothDevices.Clear";
mostCurrent._listviewbluetoothdevices.Clear();
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="Printer.SelectFromAssociatedPrinter";
mostCurrent._printer._vvvv6();
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("629032454",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="End Sub";
return "";
}
public static void  _buttonprint_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonprint_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "buttonprint_click", null); return;}
ResumableSub_ButtonPrint_Click rsub = new ResumableSub_ButtonPrint_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonPrint_Click extends BA.ResumableSub {
public ResumableSub_ButtonPrint_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="If Not(Printer.Connected) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._printer._vvv5())) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=29229060;
 //BA.debugLineNum = 29229060;BA.debugLine="PrinterMessage = \"A Processar.....\"";
parent.mostCurrent._printermessage = "A Processar.....";
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="Printer.ClearBuffer";
parent.mostCurrent._printer._vvv3();
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"X";
parent.mostCurrent._printer._addbuffer_writeline(parent.mostCurrent._esc_pos._vv1+"X-Evolution"+parent.mostCurrent._esc_pos._vv4);
RDebugUtils.currentLine=29229064;
 //BA.debugLineNum = 29229064;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
parent.mostCurrent._printer._addbuffer_writeline("VRCG");
RDebugUtils.currentLine=29229065;
 //BA.debugLineNum = 29229065;BA.debugLine="Printer.AddBuffer_Writeline(\"VRCG\")";
parent.mostCurrent._printer._addbuffer_writeline("VRCG");
RDebugUtils.currentLine=29229069;
 //BA.debugLineNum = 29229069;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
parent.mostCurrent._printer._addbuffer_writeline("");
RDebugUtils.currentLine=29229070;
 //BA.debugLineNum = 29229070;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
parent.mostCurrent._printer._addbuffer_writeline("");
RDebugUtils.currentLine=29229071;
 //BA.debugLineNum = 29229071;BA.debugLine="Printer.SelectFromMac(CurrentPrinterConnected)";
parent.mostCurrent._printer._vvvv7(BA.ObjectToString(parent.mostCurrent._currentprinterconnected));
RDebugUtils.currentLine=29229072;
 //BA.debugLineNum = 29229072;BA.debugLine="Sleep(2500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "buttonprint_click"),(int) (2500));
this.state = 11;
return;
case 11:
//C
this.state = 7;
;
 if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=29229075;
 //BA.debugLineNum = 29229075;BA.debugLine="Printer.flushAllAndClose";
parent.mostCurrent._printer._vvv7();
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=29229077;
 //BA.debugLineNum = 29229077;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("629229077",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=29229080;
 //BA.debugLineNum = 29229080;BA.debugLine="End Sub";
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
public static void  _buttonscanprinter_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonscanprinter_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "buttonscanprinter_click", null); return;}
ResumableSub_ButtonScanPrinter_Click rsub = new ResumableSub_ButtonScanPrinter_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonScanPrinter_Click extends BA.ResumableSub {
public ResumableSub_ButtonScanPrinter_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="ListViewBluetoothDevices.Clear";
parent.mostCurrent._listviewbluetoothdevices.Clear();
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_ACCESS_COARSE_L";
_rp.CheckAndRequest(processBA,_rp.PERMISSION_ACCESS_COARSE_LOCATION);
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "buttonscanprinter_click"), null);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=29097991;
 //BA.debugLineNum = 29097991;BA.debugLine="If Result = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=29097992;
 //BA.debugLineNum = 29097992;BA.debugLine="ToastMessageShow(\"No permission...\", False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("No permission..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=29097993;
 //BA.debugLineNum = 29097993;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=29097997;
 //BA.debugLineNum = 29097997;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("629097997",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=29098000;
 //BA.debugLineNum = 29098000;BA.debugLine="Try";

case 10:
//try
this.state = 15;
this.catchState = 0;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
RDebugUtils.currentLine=29098001;
 //BA.debugLineNum = 29098001;BA.debugLine="FindPrintersBT";
_findprintersbt();
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=29098003;
 //BA.debugLineNum = 29098003;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("629098003",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 15:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=29098006;
 //BA.debugLineNum = 29098006;BA.debugLine="End Sub";
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
public static String  _findprintersbt() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "findprintersbt", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "findprintersbt", null));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Sub FindPrintersBT";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Printer.SearchNewPrinter";
mostCurrent._printer._vvvv5();
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return "";
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
int _i = 0;
xevolution.vrcg.devdemov2400.appdialogs _cli = null;
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="i = Msgbox2(ShareCode.UserGoAvailableMessage, Sha";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._usergoavailablemessage /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="Dim cli As AppDialogs";
_cli = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="cli.Initialize";
_cli._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="cli.MakeUserAvailable(\"MainMenu\")";
_cli._makeuseravailable /*void*/ (null,(Object)("MainMenu"));
 };
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="End Sub";
return "";
}
public static String  _callalerts() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callalerts", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callalerts", null));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Sub CallAlerts";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="CallSubDelayed2(Alerts, \"StartTasksActivity\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._alerts.getObject()),"StartTasksActivity",(Object)(""));
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=25362438;
 //BA.debugLineNum = 25362438;BA.debugLine="End Sub";
return "";
}
public static String  _callchecklisttest() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callchecklisttest", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callchecklisttest", null));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Sub CallChecklistTest";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="CallSubDelayed(CheckListNew, \"CreateRowsToList\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._checklistnew.getObject()),"CreateRowsToList");
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="End Sub";
return "";
}
public static String  _callobjects() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callobjects", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callobjects", null));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Sub CallObjects";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="CallSubDelayed3(Objects, \"StartObjectsActivity\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._objects.getObject()),"StartObjectsActivity",(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)(""));
RDebugUtils.currentLine=25493509;
 //BA.debugLineNum = 25493509;BA.debugLine="ShareCode.FadeInFadeOutAnimation";
mostCurrent._sharecode._fadeinfadeoutanimation /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=25493512;
 //BA.debugLineNum = 25493512;BA.debugLine="End Sub";
return "";
}
public static String  _callreports() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callreports", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callreports", null));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Sub CallReports";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="CallSubDelayed2(Report, \"StartReportActivity\", 0)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._report.getObject()),"StartReportActivity",(Object)(0));
RDebugUtils.currentLine=25427974;
 //BA.debugLineNum = 25427974;BA.debugLine="End Sub";
return "";
}
public static String  _calltasks() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calltasks", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calltasks", null));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Sub CallTasks";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="CallSubDelayed3(TasksCL2, \"StartTasksActivityFirs";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._taskscl2.getObject()),"StartTasksActivityFirst",(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("CalledFromMenu"));
RDebugUtils.currentLine=25559047;
 //BA.debugLineNum = 25559047;BA.debugLine="End Sub";
return "";
}
public static String  _calluser() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calluser", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calluser", null));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Sub CallUser";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="ProgressDialogShow(ShareCode.GeneralLoadingMessag";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalloadingmessage /*String*/ ));
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="CallSubDelayed2(User, \"StartUserActivity\", \"user.";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._user.getObject()),"StartUserActivity",(Object)("user.json"));
RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=25690117;
 //BA.debugLineNum = 25690117;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _closeallservicesfrommenu() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closeallservicesfrommenu", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "closeallservicesfrommenu", null));}
ResumableSub_CloseAllServicesFromMenu rsub = new ResumableSub_CloseAllServicesFromMenu(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CloseAllServicesFromMenu extends BA.ResumableSub {
public ResumableSub_CloseAllServicesFromMenu(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="Try";
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
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="CancelScheduledService(Comms)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="CancelScheduledService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=27000838;
 //BA.debugLineNum = 27000838;BA.debugLine="CancelScheduledService(LocationService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=27000840;
 //BA.debugLineNum = 27000840;BA.debugLine="CancelScheduledService(Logs)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=27000841;
 //BA.debugLineNum = 27000841;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=27000842;
 //BA.debugLineNum = 27000842;BA.debugLine="CancelScheduledService(Starter)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._starter.getObject()));
RDebugUtils.currentLine=27000843;
 //BA.debugLineNum = 27000843;BA.debugLine="StopService(Starter)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._starter.getObject()));
RDebugUtils.currentLine=27000844;
 //BA.debugLineNum = 27000844;BA.debugLine="CancelScheduledService(UpdateService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._updateservice.getObject()));
RDebugUtils.currentLine=27000845;
 //BA.debugLineNum = 27000845;BA.debugLine="StopService(UpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._updateservice.getObject()));
RDebugUtils.currentLine=27000846;
 //BA.debugLineNum = 27000846;BA.debugLine="CancelScheduledService(UserService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=27000847;
 //BA.debugLineNum = 27000847;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=27000849;
 //BA.debugLineNum = 27000849;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627000849",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=27000850;
 //BA.debugLineNum = 27000850;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=27000852;
 //BA.debugLineNum = 27000852;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=27000853;
 //BA.debugLineNum = 27000853;BA.debugLine="End Sub";
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
public static String  _compactdb_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "compactdb_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "compactdb_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Sub CompactDB_Click(MenuName As String)";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(\"vacuum;\")";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("vacuum;");
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="End Sub";
return "";
}
public static void  _cpbuttonalerts_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cpbuttonalerts_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cpbuttonalerts_click", null); return;}
ResumableSub_CPButtonAlerts_Click rsub = new ResumableSub_CPButtonAlerts_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CPButtonAlerts_Click extends BA.ResumableSub {
public ResumableSub_CPButtonAlerts_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=25034757;
 //BA.debugLineNum = 25034757;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "cpbuttonalerts_click"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=25034758;
 //BA.debugLineNum = 25034758;BA.debugLine="If IsPaused(Comms) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(parent.mostCurrent._comms.getObject()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=25034761;
 //BA.debugLineNum = 25034761;BA.debugLine="If (Not(ShareCode.SESS_BLOCK_OPTIONS)) Then";

case 4:
//if
this.state = 7;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_block_options /*boolean*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=25034762;
 //BA.debugLineNum = 25034762;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Alerts";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_alerts /*String*/ ));
RDebugUtils.currentLine=25034766;
 //BA.debugLineNum = 25034766;BA.debugLine="CallAlerts '";
_callalerts();
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=25034770;
 //BA.debugLineNum = 25034770;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cpbuttonkpi_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cpbuttonkpi_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cpbuttonkpi_click", null); return;}
ResumableSub_CPButtonKPI_Click rsub = new ResumableSub_CPButtonKPI_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CPButtonKPI_Click extends BA.ResumableSub {
public ResumableSub_CPButtonKPI_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "cpbuttonkpi_click"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=25100294;
 //BA.debugLineNum = 25100294;BA.debugLine="If IsPaused(Comms) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(parent.mostCurrent._comms.getObject()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25100295;
 //BA.debugLineNum = 25100295;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=25100297;
 //BA.debugLineNum = 25100297;BA.debugLine="If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(Shar";

case 4:
//if
this.state = 7;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_block_options /*boolean*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=25100298;
 //BA.debugLineNum = 25100298;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_KPI";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_kpi /*String*/ ));
RDebugUtils.currentLine=25100302;
 //BA.debugLineNum = 25100302;BA.debugLine="CallReports";
_callreports();
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=25100305;
 //BA.debugLineNum = 25100305;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cpbuttonobjects_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cpbuttonobjects_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cpbuttonobjects_click", null); return;}
ResumableSub_CPButtonObjects_Click rsub = new ResumableSub_CPButtonObjects_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CPButtonObjects_Click extends BA.ResumableSub {
public ResumableSub_CPButtonObjects_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "cpbuttonobjects_click"),(int) (250));
this.state = 14;
return;
case 14:
//C
this.state = 1;
;
RDebugUtils.currentLine=25231366;
 //BA.debugLineNum = 25231366;BA.debugLine="If IsPaused(Comms) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(parent.mostCurrent._comms.getObject()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=25231369;
 //BA.debugLineNum = 25231369;BA.debugLine="If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(Shar";

case 4:
//if
this.state = 13;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_block_options /*boolean*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=25231370;
 //BA.debugLineNum = 25231370;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=25231371;
 //BA.debugLineNum = 25231371;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Plann";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_planning /*String*/ ));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=25231373;
 //BA.debugLineNum = 25231373;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Objec";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_objects /*String*/ ));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=25231377;
 //BA.debugLineNum = 25231377;BA.debugLine="CallObjects";
_callobjects();
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=25231380;
 //BA.debugLineNum = 25231380;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cpbuttonrequests_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cpbuttonrequests_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cpbuttonrequests_click", null); return;}
ResumableSub_CPButtonRequests_Click rsub = new ResumableSub_CPButtonRequests_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CPButtonRequests_Click extends BA.ResumableSub {
public ResumableSub_CPButtonRequests_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper.SuspendedCause _susp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "cpbuttonrequests_click"),(int) (250));
this.state = 20;
return;
case 20:
//C
this.state = 1;
;
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="If IsPaused(Comms) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(parent.mostCurrent._comms.getObject()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=25296903;
 //BA.debugLineNum = 25296903;BA.debugLine="If Not(ShareCode.SESS_IN_PAUSE = 1) Then";

case 4:
//if
this.state = 19;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Reques";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_request /*String*/ ));
RDebugUtils.currentLine=25296905;
 //BA.debugLineNum = 25296905;BA.debugLine="If LocationService.FusedLocationProvider1.IsInit";
if (true) break;

case 7:
//if
this.state = 18;
if (parent.mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="If Not(LocationService.FusedLocationProvider1.I";
if (true) break;

case 10:
//if
this.state = 17;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .IsConnected())) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=25296907;
 //BA.debugLineNum = 25296907;BA.debugLine="LocationService.FusedLocationProvider1.Connect";
parent.mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .Connect();
RDebugUtils.currentLine=25296908;
 //BA.debugLineNum = 25296908;BA.debugLine="If (LocationService.FusedLocationProvider1.IsC";
if (true) break;

case 13:
//if
this.state = 16;
if ((parent.mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .IsConnecting())) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=25296909;
 //BA.debugLineNum = 25296909;BA.debugLine="Dim susp As SuspendedCause = LocationService.";
_susp = parent.mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .SuspendedCause;
RDebugUtils.currentLine=25296910;
 //BA.debugLineNum = 25296910;BA.debugLine="Log( $\"${susp.CAUSE_NETWORK_LOST}:${susp.CAUS";
anywheresoftware.b4a.keywords.Common.LogImpl("625296910",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_susp.CAUSE_NETWORK_LOST))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_susp.CAUSE_NETWORK_LOST))+""),0);
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
RDebugUtils.currentLine=25296913;
 //BA.debugLineNum = 25296913;BA.debugLine="CallRequests";
_callrequests();
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=25296916;
 //BA.debugLineNum = 25296916;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cpbuttontasks_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cpbuttontasks_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cpbuttontasks_click", null); return;}
ResumableSub_CPButtonTasks_Click rsub = new ResumableSub_CPButtonTasks_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CPButtonTasks_Click extends BA.ResumableSub {
public ResumableSub_CPButtonTasks_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "cpbuttontasks_click"),(int) (100));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=24969222;
 //BA.debugLineNum = 24969222;BA.debugLine="If IsPaused(Comms) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.IsPaused(processBA,(Object)(parent.mostCurrent._comms.getObject()))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=24969225;
 //BA.debugLineNum = 24969225;BA.debugLine="If (Not(ShareCode.SESS_IN_PAUSE = 1) And Not(Shar";

case 4:
//if
this.state = 7;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._sess_block_options /*boolean*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=24969226;
 //BA.debugLineNum = 24969226;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_Tasks";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_tasks /*String*/ ));
RDebugUtils.currentLine=24969228;
 //BA.debugLineNum = 24969228;BA.debugLine="CallTasks";
_calltasks();
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=24969231;
 //BA.debugLineNum = 24969231;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cpbuttonuser_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cpbuttonuser_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "cpbuttonuser_click", null); return;}
ResumableSub_CPButtonUser_Click rsub = new ResumableSub_CPButtonUser_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CPButtonUser_Click extends BA.ResumableSub {
public ResumableSub_CPButtonUser_Click(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="CallSub(Starter, \"CheckWebAccess\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(parent.mostCurrent._starter.getObject()),"CheckWebAccess");
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "cpbuttonuser_click"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="mainLabelInfo.Text = ShareCode.MainOption_User";
parent.mostCurrent._mainlabelinfo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_user /*String*/ ));
RDebugUtils.currentLine=25165831;
 //BA.debugLineNum = 25165831;BA.debugLine="CallUser";
_calluser();
RDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createchapter(int _idx,String _title) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createchapter", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createchapter", new Object[] {_idx,_title}));}
int _height = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Sub CreateChapter(idx As Int, Title As String) As";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Dim height As Int = Utils.IntToDIP(70)";
_height = mostCurrent._utils._inttodip /*int*/ (mostCurrent.activityBA,(int) (70));
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=29556739;
 //BA.debugLineNum = 29556739;BA.debugLine="p.Initialize(\"CLALineClick\")";
_p.Initialize(mostCurrent.activityBA,"CLALineClick");
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height) '115dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=29556741;
 //BA.debugLineNum = 29556741;BA.debugLine="p.LoadLayout(\"RecordGroupTitle\")";
_p.LoadLayout("RecordGroupTitle",mostCurrent.activityBA);
RDebugUtils.currentLine=29556742;
 //BA.debugLineNum = 29556742;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=29556743;
 //BA.debugLineNum = 29556743;BA.debugLine="RecordLineTitle.Text = $\"${Title}\"$";
mostCurrent._recordlinetitle.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_title))+"")));
RDebugUtils.currentLine=29556744;
 //BA.debugLineNum = 29556744;BA.debugLine="p.Tag = $\"${idx}\"$";
_p.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_idx))+"")));
RDebugUtils.currentLine=29556745;
 //BA.debugLineNum = 29556745;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=29556746;
 //BA.debugLineNum = 29556746;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createchapteritem(int _idx,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _result) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createchapteritem", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createchapteritem", new Object[] {_idx,_result}));}
int _height = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _execute_date = "";
String _execute_start = "";
String _reference = "";
String _entidade = "";
String _objecto = "";
String _tipointervencao = "";
String _tecnico = "";
String _tipoobjecto = "";
String _morada1 = "";
String _concelhodistrito1 = "";
String _georef1 = "";
String _morada2 = "";
String _concelhodistrito2 = "";
String _georef2 = "";
String _morada3 = "";
String _concelhodistrito3 = "";
String _georef3 = "";
String _title = "";
String _subtitle = "";
String _aaa = "";
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Sub CreateChapterItem(idx As Int, Result As Result";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="Dim height As Int = Utils.IntToDIP(70)";
_height = mostCurrent._utils._inttodip /*int*/ (mostCurrent.activityBA,(int) (70));
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="p.Initialize(\"CLALineClick\")";
_p.Initialize(mostCurrent.activityBA,"CLALineClick");
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height) '115dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=29622277;
 //BA.debugLineNum = 29622277;BA.debugLine="p.LoadLayout(\"RecordGroupItemRequest\")";
_p.LoadLayout("RecordGroupItemRequest",mostCurrent.activityBA);
RDebugUtils.currentLine=29622278;
 //BA.debugLineNum = 29622278;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=29622280;
 //BA.debugLineNum = 29622280;BA.debugLine="Dim tagcode As String = Result.GetString(\"tagcode";
_tagcode = _result.GetString("tagcode");
RDebugUtils.currentLine=29622281;
 //BA.debugLineNum = 29622281;BA.debugLine="Dim execute_date As String = Result.GetString(\"ex";
_execute_date = _result.GetString("execute_date");
RDebugUtils.currentLine=29622282;
 //BA.debugLineNum = 29622282;BA.debugLine="Dim execute_start As String = Result.GetString(\"e";
_execute_start = _result.GetString("execute_start");
RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="Dim reference As String = Result.GetString(\"refer";
_reference = _result.GetString("reference");
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="Dim entidade As String = Result.GetString(\"entida";
_entidade = _result.GetString("entidade");
RDebugUtils.currentLine=29622285;
 //BA.debugLineNum = 29622285;BA.debugLine="Dim objecto As String = Result.GetString(\"objecto";
_objecto = _result.GetString("objecto");
RDebugUtils.currentLine=29622286;
 //BA.debugLineNum = 29622286;BA.debugLine="Dim tipointervencao As String = Result.GetString(";
_tipointervencao = _result.GetString("tipointervencao");
RDebugUtils.currentLine=29622287;
 //BA.debugLineNum = 29622287;BA.debugLine="Dim tecnico As String = Result.GetString(\"tecnico";
_tecnico = _result.GetString("tecnico");
RDebugUtils.currentLine=29622288;
 //BA.debugLineNum = 29622288;BA.debugLine="Dim tipoobjecto As String = Result.GetString(\"tip";
_tipoobjecto = _result.GetString("tipoobjecto");
RDebugUtils.currentLine=29622289;
 //BA.debugLineNum = 29622289;BA.debugLine="Dim morada1 As String = Result.GetString(\"morada1";
_morada1 = _result.GetString("morada1");
RDebugUtils.currentLine=29622290;
 //BA.debugLineNum = 29622290;BA.debugLine="Dim concelhodistrito1 As String = Result.GetStrin";
_concelhodistrito1 = _result.GetString("concelhodistrito1");
RDebugUtils.currentLine=29622291;
 //BA.debugLineNum = 29622291;BA.debugLine="Dim georef1 As String = Result.GetString(\"georef1";
_georef1 = _result.GetString("georef1");
RDebugUtils.currentLine=29622292;
 //BA.debugLineNum = 29622292;BA.debugLine="Dim morada2 As String = Result.GetString(\"morada2";
_morada2 = _result.GetString("morada2");
RDebugUtils.currentLine=29622293;
 //BA.debugLineNum = 29622293;BA.debugLine="Dim concelhodistrito2 As String = Result.GetStrin";
_concelhodistrito2 = _result.GetString("concelhodistrito2");
RDebugUtils.currentLine=29622294;
 //BA.debugLineNum = 29622294;BA.debugLine="Dim georef2 As String = Result.GetString(\"georef2";
_georef2 = _result.GetString("georef2");
RDebugUtils.currentLine=29622295;
 //BA.debugLineNum = 29622295;BA.debugLine="Dim morada3 As String = Result.GetString(\"morada3";
_morada3 = _result.GetString("morada3");
RDebugUtils.currentLine=29622296;
 //BA.debugLineNum = 29622296;BA.debugLine="Dim concelhodistrito3 As String = Result.GetStrin";
_concelhodistrito3 = _result.GetString("concelhodistrito3");
RDebugUtils.currentLine=29622297;
 //BA.debugLineNum = 29622297;BA.debugLine="Dim georef3 As String = Result.GetString(\"georef3";
_georef3 = _result.GetString("georef3");
RDebugUtils.currentLine=29622299;
 //BA.debugLineNum = 29622299;BA.debugLine="Dim Title As String = $\"\"$";
_title = ("");
RDebugUtils.currentLine=29622300;
 //BA.debugLineNum = 29622300;BA.debugLine="Dim SubTitle As String = $\"\"$";
_subtitle = ("");
RDebugUtils.currentLine=29622301;
 //BA.debugLineNum = 29622301;BA.debugLine="If (idx =1) Then";
if ((_idx==1)) { 
RDebugUtils.currentLine=29622302;
 //BA.debugLineNum = 29622302;BA.debugLine="Title = $\"${execute_date} ${execute_start} - ${t";
_title = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_execute_date))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_execute_start))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipointervencao))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecto))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reference))+", ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+") ");
RDebugUtils.currentLine=29622303;
 //BA.debugLineNum = 29622303;BA.debugLine="If Utils.NNE(morada1) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_morada1)) { 
RDebugUtils.currentLine=29622304;
 //BA.debugLineNum = 29622304;BA.debugLine="SubTitle = $\"${morada1} ${concelhodistrito1} -";
_subtitle = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_morada1))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_concelhodistrito1))+" - ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_georef1))+")");
 }else 
{RDebugUtils.currentLine=29622305;
 //BA.debugLineNum = 29622305;BA.debugLine="else If Utils.NNE(morada2) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_morada2)) { 
RDebugUtils.currentLine=29622306;
 //BA.debugLineNum = 29622306;BA.debugLine="SubTitle = $\"${morada2} ${concelhodistrito2} -";
_subtitle = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_morada2))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_concelhodistrito2))+" - ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_georef2))+")");
 }else 
{RDebugUtils.currentLine=29622307;
 //BA.debugLineNum = 29622307;BA.debugLine="else If Utils.NNE(morada3) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_morada3)) { 
RDebugUtils.currentLine=29622308;
 //BA.debugLineNum = 29622308;BA.debugLine="SubTitle = $\"${morada3} ${concelhodistrito3} -";
_subtitle = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_morada3))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_concelhodistrito3))+" - ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_georef3))+")");
 }}}
;
 }else 
{RDebugUtils.currentLine=29622310;
 //BA.debugLineNum = 29622310;BA.debugLine="else if (idx=2) Then";
if ((_idx==2)) { 
RDebugUtils.currentLine=29622311;
 //BA.debugLineNum = 29622311;BA.debugLine="Title = $\"${objecto} - ${tipoobjecto}, ${referen";
_title = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecto))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tipoobjecto))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reference))+", ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+")");
RDebugUtils.currentLine=29622312;
 //BA.debugLineNum = 29622312;BA.debugLine="SubTitle = $\"${morada1} ${concelhodistrito1} - (";
_subtitle = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_morada1))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_concelhodistrito1))+" - ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_georef1))+")");
 }else {
RDebugUtils.currentLine=29622314;
 //BA.debugLineNum = 29622314;BA.debugLine="Title = $\"(${tagcode}) ${objecto}, ${reference}\"";
_title = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+") "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecto))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reference))+"");
 }}
;
RDebugUtils.currentLine=29622316;
 //BA.debugLineNum = 29622316;BA.debugLine="If Utils.NNE(SubTitle) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_subtitle)) { 
RDebugUtils.currentLine=29622317;
 //BA.debugLineNum = 29622317;BA.debugLine="Dim aaa As String = SubTitle.ToLowerCase";
_aaa = _subtitle.toLowerCase();
RDebugUtils.currentLine=29622318;
 //BA.debugLineNum = 29622318;BA.debugLine="If Not(aaa.Contains(\"a\") Or aaa.Contains(\"e\") Or";
if (anywheresoftware.b4a.keywords.Common.Not(_aaa.contains("a") || _aaa.contains("e") || _aaa.contains("i") || _aaa.contains("o") || _aaa.contains("u"))) { 
RDebugUtils.currentLine=29622319;
 //BA.debugLineNum = 29622319;BA.debugLine="SubTitle = \"\"";
_subtitle = "";
 };
 };
RDebugUtils.currentLine=29622323;
 //BA.debugLineNum = 29622323;BA.debugLine="RecordLineMoreOptions.Tag = $\"${tagcode}\"$";
mostCurrent._recordlinemoreoptions.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"")));
RDebugUtils.currentLine=29622325;
 //BA.debugLineNum = 29622325;BA.debugLine="RecordLineTitle.Text = $\"${Title}\"$";
mostCurrent._recordlinetitle.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_title))+"")));
RDebugUtils.currentLine=29622326;
 //BA.debugLineNum = 29622326;BA.debugLine="RecordLineTitle.tag = $\"${tagcode}\"$";
mostCurrent._recordlinetitle.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"")));
RDebugUtils.currentLine=29622327;
 //BA.debugLineNum = 29622327;BA.debugLine="RecordLineTitleSecond.Text = $\"${SubTitle}\"$";
mostCurrent._recordlinetitlesecond.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_subtitle))+"")));
RDebugUtils.currentLine=29622328;
 //BA.debugLineNum = 29622328;BA.debugLine="RecordLineTitleSecond.tag = $\"${tagcode}\"$";
mostCurrent._recordlinetitlesecond.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"")));
RDebugUtils.currentLine=29622329;
 //BA.debugLineNum = 29622329;BA.debugLine="p.Tag = $\"${idx}|${tagcode}\"$";
_p.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_idx))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"")));
RDebugUtils.currentLine=29622330;
 //BA.debugLineNum = 29622330;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=29622331;
 //BA.debugLineNum = 29622331;BA.debugLine="End Sub";
return null;
}
public static String  _deviceinfoorientationchange(int _newori) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deviceinfoorientationchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "deviceinfoorientationchange", new Object[] {_newori}));}
int _i = 0;
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Sub DeviceInfoOrientationChange(newOri As Int)";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.OrientationChang";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._orientationchange /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="CallSubDelayed2(Main, \"RestartApp\", newOri)";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._main.getObject()),"RestartApp",(Object)(_newori));
RDebugUtils.currentLine=27525124;
 //BA.debugLineNum = 27525124;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 };
RDebugUtils.currentLine=27525126;
 //BA.debugLineNum = 27525126;BA.debugLine="End Sub";
return "";
}
public static String  _dialogreqroute_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialogreqroute_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialogreqroute_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Sub DialogReqRoute_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return "";
}
public static String  _editsearch_enterpressed() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editsearch_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editsearch_enterpressed", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Sub EditSearch_EnterPressed";
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return "";
}
public static String  _editsearch_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editsearch_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editsearch_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Sub EditSearch_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="End Sub";
return "";
}
public static String  _expandlistsearch_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "expandlistsearch_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "expandlistsearch_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
String _valstr = "";
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Sub ExpandListSearch_ItemClick (Index As Int, Valu";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Dim panel As B4XView = ExpandListSearch.GetPanel(";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = mostCurrent._expandlistsearch._getpanel(_index);
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="Dim valStr As String = panel.Tag";
_valstr = BA.ObjectToString(_panel.getTag());
RDebugUtils.currentLine=29949955;
 //BA.debugLineNum = 29949955;BA.debugLine="If Utils.NNE(valStr) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_valstr)) { 
RDebugUtils.currentLine=29949956;
 //BA.debugLineNum = 29949956;BA.debugLine="If (Not(valStr = \"1\") And Not(valStr = \"2\") And";
if ((anywheresoftware.b4a.keywords.Common.Not((_valstr).equals("1")) && anywheresoftware.b4a.keywords.Common.Not((_valstr).equals("2")) && anywheresoftware.b4a.keywords.Common.Not((_valstr).equals("3")))) { 
RDebugUtils.currentLine=29949957;
 //BA.debugLineNum = 29949957;BA.debugLine="butActionSearch.Tag = valStr";
mostCurrent._butactionsearch.setTag((Object)(_valstr));
 };
 };
RDebugUtils.currentLine=29949961;
 //BA.debugLineNum = 29949961;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _firstinstallcompleteprocedure(boolean _reinstall) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "firstinstallcompleteprocedure", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "firstinstallcompleteprocedure", new Object[] {_reinstall}));}
ResumableSub_FirstInstallCompleteProcedure rsub = new ResumableSub_FirstInstallCompleteProcedure(null,_reinstall);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FirstInstallCompleteProcedure extends BA.ResumableSub {
public ResumableSub_FirstInstallCompleteProcedure(xevolution.vrcg.devdemov2400.mainmenu parent,boolean _reinstall) {
this.parent = parent;
this._reinstall = _reinstall;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
boolean _reinstall;
int _totallinesofscripts = 0;
String _exceptionerror = "";
String _first_install_info = "";
String _firstinstallfilesname = "";
int _result = 0;
String _jsonstruct = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _datahora = "";
int _sqlfilestotal = 0;
anywheresoftware.b4a.objects.collections.List _inserts = null;
String _date = "";
int _trycount = 0;
boolean _dotry = false;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager _ctm = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;
String _testejson = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _i = 0;
String _filen = "";
String _msgfatal = "";
int _n = 0;
String _script2execute = "";
anywheresoftware.b4a.objects.collections.List _ftpinternolist = null;
int _totaltemplates = 0;
Object _sfl = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
String _fname2 = "";
int step154;
int limit154;
int step185;
int limit185;
int step204;
int limit204;
int step240;
int limit240;
int step251;
int limit251;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28180487;
 //BA.debugLineNum = 28180487;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=28180488;
 //BA.debugLineNum = 28180488;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=28180490;
 //BA.debugLineNum = 28180490;BA.debugLine="LabelTarefa.Visible = False";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180491;
 //BA.debugLineNum = 28180491;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=28180492;
 //BA.debugLineNum = 28180492;BA.debugLine="UpdateProgressBar2(100,0)";
_updateprogressbar2((int) (100),(int) (0));
RDebugUtils.currentLine=28180493;
 //BA.debugLineNum = 28180493;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=28180494;
 //BA.debugLineNum = 28180494;BA.debugLine="Private ExceptionError As String = \"\"";
_exceptionerror = "";
RDebugUtils.currentLine=28180503;
 //BA.debugLineNum = 28180503;BA.debugLine="PanelFirstInstallConfig.Visible = True";
parent.mostCurrent._panelfirstinstallconfig.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180506;
 //BA.debugLineNum = 28180506;BA.debugLine="ShareCode.AwakeDevice(True)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180508;
 //BA.debugLineNum = 28180508;BA.debugLine="If ShareCode.IsDevelopment Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._sharecode._isdevelopment /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=28180509;
 //BA.debugLineNum = 28180509;BA.debugLine="ShareCode.APP_FTP_USER = \"DevEvolutionCheck\"";
parent.mostCurrent._sharecode._app_ftp_user /*String*/  = "DevEvolutionCheck";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=28180511;
 //BA.debugLineNum = 28180511;BA.debugLine="ShareCode.APP_FTP_USER = \"EvolutionCheck\"";
parent.mostCurrent._sharecode._app_ftp_user /*String*/  = "EvolutionCheck";
 if (true) break;
;
RDebugUtils.currentLine=28180515;
 //BA.debugLineNum = 28180515;BA.debugLine="Try";

case 6:
//try
this.state = 185;
this.catchState = 184;
this.state = 8;
if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 184;
RDebugUtils.currentLine=28180516;
 //BA.debugLineNum = 28180516;BA.debugLine="LabelDownloadInicialTitle.Text = ShareCode.MsgUp";
parent.mostCurrent._labeldownloadinicialtitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso1primeirainstalacao /*String*/ ));
RDebugUtils.currentLine=28180518;
 //BA.debugLineNum = 28180518;BA.debugLine="Dim FIRST_INSTALL_INFO As String = \"FIRSTINSTALL";
_first_install_info = "FIRSTINSTALL.INFO";
RDebugUtils.currentLine=28180519;
 //BA.debugLineNum = 28180519;BA.debugLine="Dim firstInstallFilesName As String = \"FIRSTINST";
_firstinstallfilesname = "FIRSTINSTALL";
RDebugUtils.currentLine=28180521;
 //BA.debugLineNum = 28180521;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstInstallComplete";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstInstallCompleteProc",("DOWNLOAD MESTRES"));
RDebugUtils.currentLine=28180528;
 //BA.debugLineNum = 28180528;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTAL";
if (true) break;

case 9:
//if
this.state = 16;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=28180531;
 //BA.debugLineNum = 28180531;BA.debugLine="Msgbox2Async($\"O sistema detectou uma instalaçã";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("O sistema detectou uma instalação anterior incompleta !"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"A instalação vai Reiniciar.")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180532;
 //BA.debugLineNum = 28180532;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 186;
return;
case 186:
//C
this.state = 12;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=28180533;
 //BA.debugLineNum = 28180533;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=28180539;
 //BA.debugLineNum = 28180539;BA.debugLine="File.writestring(Starter.SharedFolder,\"FIRSTINST";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS",parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=28180543;
 //BA.debugLineNum = 28180543;BA.debugLine="If File.Exists(Starter.SharedFolder, FIRST_INSTA";
if (true) break;

case 17:
//if
this.state = 113;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,_first_install_info) && anywheresoftware.b4a.keywords.Common.Not(_reinstall)) { 
this.state = 19;
}else {
this.state = 47;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=28180544;
 //BA.debugLineNum = 28180544;BA.debugLine="Log(\"FIRSTINSTALL JA EXISTE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("628180544","FIRSTINSTALL JA EXISTE",0);
RDebugUtils.currentLine=28180547;
 //BA.debugLineNum = 28180547;BA.debugLine="Starter.LocalSQLEVC.Close";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=28180548;
 //BA.debugLineNum = 28180548;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolution";
if (true) break;

case 20:
//if
this.state = 23;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=28180549;
 //BA.debugLineNum = 28180549;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionch";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=28180551;
 //BA.debugLineNum = 28180551;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"),(int) (250));
this.state = 187;
return;
case 187:
//C
this.state = 24;
;
RDebugUtils.currentLine=28180553;
 //BA.debugLineNum = 28180553;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evolu";
if (true) break;

case 24:
//if
this.state = 27;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3"))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=28180554;
 //BA.debugLineNum = 28180554;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\"";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"evolutioncheck.db3",parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=28180556;
 //BA.debugLineNum = 28180556;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"),(int) (250));
this.state = 188;
return;
case 188:
//C
this.state = 28;
;
RDebugUtils.currentLine=28180558;
 //BA.debugLineNum = 28180558;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then";
if (true) break;

case 28:
//if
this.state = 33;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized())) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Initialize(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3",anywheresoftware.b4a.keywords.Common.True);
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=28180559;
 //BA.debugLineNum = 28180559;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"),(int) (100));
this.state = 189;
return;
case 189:
//C
this.state = 34;
;
RDebugUtils.currentLine=28180562;
 //BA.debugLineNum = 28180562;BA.debugLine="Dim JsonStruct As String = File.readstring(Star";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=28180563;
 //BA.debugLineNum = 28180563;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=28180564;
 //BA.debugLineNum = 28180564;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=28180565;
 //BA.debugLineNum = 28180565;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=28180566;
 //BA.debugLineNum = 28180566;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=28180567;
 //BA.debugLineNum = 28180567;BA.debugLine="File.writeString(Starter.SharedFolder,$\"date_in";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"),_datahora);
RDebugUtils.currentLine=28180568;
 //BA.debugLineNum = 28180568;BA.debugLine="ShareCode.Installed_Date = DataHora";
parent.mostCurrent._sharecode._installed_date /*String*/  = _datahora;
RDebugUtils.currentLine=28180569;
 //BA.debugLineNum = 28180569;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Sha";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"),_datahora);
RDebugUtils.currentLine=28180570;
 //BA.debugLineNum = 28180570;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files\")";
_sqlfilestotal = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=28180571;
 //BA.debugLineNum = 28180571;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=28180572;
 //BA.debugLineNum = 28180572;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=28180573;
 //BA.debugLineNum = 28180573;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180574;
 //BA.debugLineNum = 28180574;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180576;
 //BA.debugLineNum = 28180576;BA.debugLine="If SqlFilesTotal = 0 Then";
if (true) break;

case 34:
//if
this.state = 45;
if (_sqlfilestotal==0) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=28180578;
 //BA.debugLineNum = 28180578;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_ins";
if (true) break;

case 37:
//if
this.state = 40;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=28180579;
 //BA.debugLineNum = 28180579;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_insta";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
RDebugUtils.currentLine=28180580;
 //BA.debugLineNum = 28180580;BA.debugLine="ShareCode.Installed_Date = \"\"";
parent.mostCurrent._sharecode._installed_date /*String*/  = "";
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=28180583;
 //BA.debugLineNum = 28180583;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALA";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180584;
 //BA.debugLineNum = 28180584;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 190;
return;
case 190:
//C
this.state = 41;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=28180585;
 //BA.debugLineNum = 28180585;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 41:
//if
this.state = 44;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=28180586;
 //BA.debugLineNum = 28180586;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 113;
;
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=28180590;
 //BA.debugLineNum = 28180590;BA.debugLine="Log(\"FIRSTINSTALL NAO EXISTE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("628180590","FIRSTINSTALL NAO EXISTE",0);
RDebugUtils.currentLine=28180594;
 //BA.debugLineNum = 28180594;BA.debugLine="Dim SqlFilesTotal As Int = 0";
_sqlfilestotal = (int) (0);
RDebugUtils.currentLine=28180595;
 //BA.debugLineNum = 28180595;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=28180596;
 //BA.debugLineNum = 28180596;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28180597;
 //BA.debugLineNum = 28180597;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=28180599;
 //BA.debugLineNum = 28180599;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=28180600;
 //BA.debugLineNum = 28180600;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180601;
 //BA.debugLineNum = 28180601;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=28180602;
 //BA.debugLineNum = 28180602;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=28180603;
 //BA.debugLineNum = 28180603;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=28180604;
 //BA.debugLineNum = 28180604;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=28180605;
 //BA.debugLineNum = 28180605;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 48:
//do while
this.state = 75;
while ((_dotry && (_trycount<3))) {
this.state = 50;
if (true) break;
}
if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=28180607;
 //BA.debugLineNum = 28180607;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_first_install_info,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=28180608;
 //BA.debugLineNum = 28180608;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sf);
this.state = 191;
return;
case 191:
//C
this.state = 51;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=28180610;
 //BA.debugLineNum = 28180610;BA.debugLine="If Success Then";
if (true) break;

case 51:
//if
this.state = 74;
if (_success) { 
this.state = 53;
}else {
this.state = 73;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=28180612;
 //BA.debugLineNum = 28180612;BA.debugLine="Try";
if (true) break;

case 54:
//try
this.state = 71;
this.catchState = 70;
this.state = 56;
if (true) break;

case 56:
//C
this.state = 57;
this.catchState = 70;
RDebugUtils.currentLine=28180613;
 //BA.debugLineNum = 28180613;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.M";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=28180615;
 //BA.debugLineNum = 28180615;BA.debugLine="Log(FIRST_INSTALL_INFO & \" file was download";
anywheresoftware.b4a.keywords.Common.LogImpl("628180615",_first_install_info+" file was download successfully",0);
RDebugUtils.currentLine=28180622;
 //BA.debugLineNum = 28180622;BA.debugLine="Dim TesteJson As String = File.readstring(St";
_testejson = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=28180624;
 //BA.debugLineNum = 28180624;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 57:
//if
this.state = 68;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 59;
}else {
this.state = 67;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=28180625;
 //BA.debugLineNum = 28180625;BA.debugLine="If TesteJson.Contains(\"{\") Then";
if (true) break;

case 60:
//if
this.state = 65;
if (_testejson.contains("{")) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
RDebugUtils.currentLine=28180626;
 //BA.debugLineNum = 28180626;BA.debugLine="Dim JsonStruct As String = File.readstring";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=28180627;
 //BA.debugLineNum = 28180627;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=28180628;
 //BA.debugLineNum = 28180628;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=28180629;
 //BA.debugLineNum = 28180629;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=28180630;
 //BA.debugLineNum = 28180630;BA.debugLine="Dim DataHora As String = root.Get(\"datetim";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=28180631;
 //BA.debugLineNum = 28180631;BA.debugLine="File.writeString(Starter.SharedFolder,$\"da";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"),_datahora);
RDebugUtils.currentLine=28180632;
 //BA.debugLineNum = 28180632;BA.debugLine="File.writeString(Starter.InternalFolder,$\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"),_datahora);
RDebugUtils.currentLine=28180633;
 //BA.debugLineNum = 28180633;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files";
_sqlfilestotal = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=28180634;
 //BA.debugLineNum = 28180634;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=28180635;
 //BA.debugLineNum = 28180635;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=28180636;
 //BA.debugLineNum = 28180636;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180637;
 //BA.debugLineNum = 28180637;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180638;
 //BA.debugLineNum = 28180638;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=28180639;
 //BA.debugLineNum = 28180639;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=28180640;
 //BA.debugLineNum = 28180640;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=28180642;
 //BA.debugLineNum = 28180642;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28180643;
 //BA.debugLineNum = 28180643;BA.debugLine="List1 = File.ReadList(Starter.Provider.Sha";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=28180644;
 //BA.debugLineNum = 28180644;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de f";
_sqlfilestotal = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=28180645;
 //BA.debugLineNum = 28180645;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=28180646;
 //BA.debugLineNum = 28180646;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180647;
 //BA.debugLineNum = 28180647;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180648;
 //BA.debugLineNum = 28180648;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=28180649;
 //BA.debugLineNum = 28180649;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=28180650;
 //BA.debugLineNum = 28180650;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 65:
//C
this.state = 68;
;
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=28180654;
 //BA.debugLineNum = 28180654;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28180655;
 //BA.debugLineNum = 28180655;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shar";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=28180656;
 //BA.debugLineNum = 28180656;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de fi";
_sqlfilestotal = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=28180657;
 //BA.debugLineNum = 28180657;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=28180658;
 //BA.debugLineNum = 28180658;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180659;
 //BA.debugLineNum = 28180659;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=28180660;
 //BA.debugLineNum = 28180660;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=28180661;
 //BA.debugLineNum = 28180661;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=28180662;
 //BA.debugLineNum = 28180662;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 68:
//C
this.state = 71;
;
 if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 184;
RDebugUtils.currentLine=28180666;
 //BA.debugLineNum = 28180666;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628180666",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=28180667;
 //BA.debugLineNum = 28180667;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 71:
//C
this.state = 74;
this.catchState = 184;
;
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=28180670;
 //BA.debugLineNum = 28180670;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628180670",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=28180671;
 //BA.debugLineNum = 28180671;BA.debugLine="Log(\"Error downloading file \" & FIRST_INSTALL";
anywheresoftware.b4a.keywords.Common.LogImpl("628180671","Error downloading file "+_first_install_info,0);
RDebugUtils.currentLine=28180672;
 //BA.debugLineNum = 28180672;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
RDebugUtils.currentLine=28180673;
 //BA.debugLineNum = 28180673;BA.debugLine="ExceptionError = LastException";
_exceptionerror = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
 if (true) break;

case 74:
//C
this.state = 48;
;
 if (true) break;

case 75:
//C
this.state = 76;
;
RDebugUtils.currentLine=28180676;
 //BA.debugLineNum = 28180676;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=28180678;
 //BA.debugLineNum = 28180678;BA.debugLine="If SqlFilesTotal = 0 Then";
if (true) break;

case 76:
//if
this.state = 87;
if (_sqlfilestotal==0) { 
this.state = 78;
}if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=28180680;
 //BA.debugLineNum = 28180680;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_ins";
if (true) break;

case 79:
//if
this.state = 82;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=28180681;
 //BA.debugLineNum = 28180681;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_insta";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
RDebugUtils.currentLine=28180682;
 //BA.debugLineNum = 28180682;BA.debugLine="ShareCode.Installed_Date = \"\"";
parent.mostCurrent._sharecode._installed_date /*String*/  = "";
 if (true) break;

case 82:
//C
this.state = 83;
;
RDebugUtils.currentLine=28180685;
 //BA.debugLineNum = 28180685;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALA";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180686;
 //BA.debugLineNum = 28180686;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 192;
return;
case 192:
//C
this.state = 83;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=28180687;
 //BA.debugLineNum = 28180687;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 83:
//if
this.state = 86;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=28180688;
 //BA.debugLineNum = 28180688;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;
;
RDebugUtils.currentLine=28180697;
 //BA.debugLineNum = 28180697;BA.debugLine="If(SqlFilesTotal > 0) Then";

case 87:
//if
this.state = 112;
if ((_sqlfilestotal>0)) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=28180698;
 //BA.debugLineNum = 28180698;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ ));
RDebugUtils.currentLine=28180700;
 //BA.debugLineNum = 28180700;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=28180701;
 //BA.debugLineNum = 28180701;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=28180702;
 //BA.debugLineNum = 28180702;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180704;
 //BA.debugLineNum = 28180704;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=28180706;
 //BA.debugLineNum = 28180706;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 90:
//for
this.state = 111;
step154 = 1;
limit154 = _sqlfilestotal;
_i = (int) (1) ;
this.state = 193;
if (true) break;

case 193:
//C
this.state = 111;
if ((step154 > 0 && _i <= limit154) || (step154 < 0 && _i >= limit154)) this.state = 92;
if (true) break;

case 194:
//C
this.state = 193;
_i = ((int)(0 + _i + step154)) ;
if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=28180707;
 //BA.debugLineNum = 28180707;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Ms";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sqlfilestotal))+"")));
RDebugUtils.currentLine=28180708;
 //BA.debugLineNum = 28180708;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesNa";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_firstinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=28180710;
 //BA.debugLineNum = 28180710;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
if (true) break;

case 93:
//if
this.state = 96;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen))) { 
this.state = 95;
}if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=28180711;
 //BA.debugLineNum = 28180711;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, f";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 96:
//C
this.state = 97;
;
RDebugUtils.currentLine=28180716;
 //BA.debugLineNum = 28180716;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filen,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=28180717;
 //BA.debugLineNum = 28180717;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sf);
this.state = 195;
return;
case 195:
//C
this.state = 97;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=28180719;
 //BA.debugLineNum = 28180719;BA.debugLine="If Success Then";
if (true) break;

case 97:
//if
this.state = 110;
if (_success) { 
this.state = 99;
}else {
this.state = 101;
}if (true) break;

case 99:
//C
this.state = 110;
RDebugUtils.currentLine=28180720;
 //BA.debugLineNum = 28180720;BA.debugLine="Log(fileN & \" file was download successfully";
anywheresoftware.b4a.keywords.Common.LogImpl("628180720",_filen+" file was download successfully",0);
 if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=28180722;
 //BA.debugLineNum = 28180722;BA.debugLine="Log(\"Error downloading file \" & fileN)";
anywheresoftware.b4a.keywords.Common.LogImpl("628180722","Error downloading file "+_filen,0);
RDebugUtils.currentLine=28180724;
 //BA.debugLineNum = 28180724;BA.debugLine="Dim MsgFatal As String = $\"Ocorreu um Erro a";
_msgfatal = ("Ocorreu um Erro ao descarregar um dos ficheiros mestres."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Ficheiro FIRSTINTALL"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".SQL"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"A aplicação vai terminar !"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Por favor verifique o acesso à internet e reinstale a aplicação, depois de desinstalar a actual !");
RDebugUtils.currentLine=28180725;
 //BA.debugLineNum = 28180725;BA.debugLine="Msgbox2Async(MsgFatal, ShareCode.GeneralAler";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msgfatal),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180727;
 //BA.debugLineNum = 28180727;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_i";
if (true) break;

case 102:
//if
this.state = 105;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=28180728;
 //BA.debugLineNum = 28180728;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_ins";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
RDebugUtils.currentLine=28180729;
 //BA.debugLineNum = 28180729;BA.debugLine="ShareCode.Installed_Date = \"\"";
parent.mostCurrent._sharecode._installed_date /*String*/  = "";
 if (true) break;

case 105:
//C
this.state = 106;
;
RDebugUtils.currentLine=28180732;
 //BA.debugLineNum = 28180732;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), null);
this.state = 196;
return;
case 196:
//C
this.state = 106;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=28180734;
 //BA.debugLineNum = 28180734;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 106:
//if
this.state = 109;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 108;
}if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=28180735;
 //BA.debugLineNum = 28180735;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 109:
//C
this.state = 110;
;
 if (true) break;

case 110:
//C
this.state = 194;
;
RDebugUtils.currentLine=28180740;
 //BA.debugLineNum = 28180740;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
_updateprogressbar(_sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 111:
//C
this.state = 112;
;
RDebugUtils.currentLine=28180743;
 //BA.debugLineNum = 28180743;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 112:
//C
this.state = 113;
;
RDebugUtils.currentLine=28180748;
 //BA.debugLineNum = 28180748;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=28180749;
 //BA.debugLineNum = 28180749;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"),(int) (500));
this.state = 197;
return;
case 197:
//C
this.state = 113;
;
 if (true) break;
;
RDebugUtils.currentLine=28180756;
 //BA.debugLineNum = 28180756;BA.debugLine="If(SqlFilesTotal > 0) Then";

case 113:
//if
this.state = 135;
if ((_sqlfilestotal>0)) { 
this.state = 115;
}if (true) break;

case 115:
//C
this.state = 116;
RDebugUtils.currentLine=28180758;
 //BA.debugLineNum = 28180758;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 116:
//for
this.state = 134;
step185 = 1;
limit185 = _sqlfilestotal;
_i = (int) (1) ;
this.state = 198;
if (true) break;

case 198:
//C
this.state = 134;
if ((step185 > 0 && _i <= limit185) || (step185 < 0 && _i >= limit185)) this.state = 118;
if (true) break;

case 199:
//C
this.state = 198;
_i = ((int)(0 + _i + step185)) ;
if (true) break;

case 118:
//C
this.state = 119;
RDebugUtils.currentLine=28180759;
 //BA.debugLineNum = 28180759;BA.debugLine="TotalLinesOfScripts = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=28180760;
 //BA.debugLineNum = 28180760;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sqlfilestotal))+"")));
RDebugUtils.currentLine=28180761;
 //BA.debugLineNum = 28180761;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesNam";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_firstinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=28180763;
 //BA.debugLineNum = 28180763;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28180765;
 //BA.debugLineNum = 28180765;BA.debugLine="If (List1.IsInitialized) Then";
if (true) break;

case 119:
//if
this.state = 124;
if ((_list1.IsInitialized())) { 
this.state = 121;
}else {
this.state = 123;
}if (true) break;

case 121:
//C
this.state = 124;
RDebugUtils.currentLine=28180766;
 //BA.debugLineNum = 28180766;BA.debugLine="List1.Clear";
_list1.Clear();
 if (true) break;

case 123:
//C
this.state = 124;
RDebugUtils.currentLine=28180768;
 //BA.debugLineNum = 28180768;BA.debugLine="List1.Initialize";
_list1.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=28180771;
 //BA.debugLineNum = 28180771;BA.debugLine="Try";

case 124:
//try
this.state = 129;
this.catchState = 128;
this.state = 126;
if (true) break;

case 126:
//C
this.state = 129;
this.catchState = 128;
RDebugUtils.currentLine=28180772;
 //BA.debugLineNum = 28180772;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=28180773;
 //BA.debugLineNum = 28180773;BA.debugLine="TotalLinesOfScripts = List1.Size";
_totallinesofscripts = _list1.getSize();
 if (true) break;

case 128:
//C
this.state = 129;
this.catchState = 184;
RDebugUtils.currentLine=28180775;
 //BA.debugLineNum = 28180775;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628180775",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 129:
//C
this.state = 130;
this.catchState = 184;
;
RDebugUtils.currentLine=28180778;
 //BA.debugLineNum = 28180778;BA.debugLine="UpdateProgressBar2(100,0)";
_updateprogressbar2((int) (100),(int) (0));
RDebugUtils.currentLine=28180779;
 //BA.debugLineNum = 28180779;BA.debugLine="ProgressoInicial2.visible = True";
parent.mostCurrent._progressoinicial2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180780;
 //BA.debugLineNum = 28180780;BA.debugLine="LabelTarefa.Visible = True";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180781;
 //BA.debugLineNum = 28180781;BA.debugLine="For n = 0 To List1.Size -1";
if (true) break;

case 130:
//for
this.state = 133;
step204 = 1;
limit204 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 200;
if (true) break;

case 200:
//C
this.state = 133;
if ((step204 > 0 && _n <= limit204) || (step204 < 0 && _n >= limit204)) this.state = 132;
if (true) break;

case 201:
//C
this.state = 200;
_n = ((int)(0 + _n + step204)) ;
if (true) break;

case 132:
//C
this.state = 201;
RDebugUtils.currentLine=28180782;
 //BA.debugLineNum = 28180782;BA.debugLine="LabelTarefa.Text = ShareCode.MsgExecProcAct &";
parent.mostCurrent._labeltarefa.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totallinesofscripts))+"")));
RDebugUtils.currentLine=28180783;
 //BA.debugLineNum = 28180783;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
_script2execute = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=28180784;
 //BA.debugLineNum = 28180784;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"Main",_script2execute,"");
RDebugUtils.currentLine=28180785;
 //BA.debugLineNum = 28180785;BA.debugLine="UpdateProgressBar2(TotalLinesOfScripts,n)";
_updateprogressbar2(_totallinesofscripts,_n);
RDebugUtils.currentLine=28180786;
 //BA.debugLineNum = 28180786;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"),(int) (1));
this.state = 202;
return;
case 202:
//C
this.state = 201;
;
 if (true) break;
if (true) break;

case 133:
//C
this.state = 199;
;
RDebugUtils.currentLine=28180789;
 //BA.debugLineNum = 28180789;BA.debugLine="ProgressoInicial2.visible = False";
parent.mostCurrent._progressoinicial2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180790;
 //BA.debugLineNum = 28180790;BA.debugLine="LabelTarefa.Visible = False";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180791;
 //BA.debugLineNum = 28180791;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
_updateprogressbar(_sqlfilestotal,_i);
RDebugUtils.currentLine=28180792;
 //BA.debugLineNum = 28180792;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"),(int) (1));
this.state = 203;
return;
case 203:
//C
this.state = 199;
;
 if (true) break;
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
RDebugUtils.currentLine=28180797;
 //BA.debugLineNum = 28180797;BA.debugLine="UpdateProgressBar2(100,0)";
_updateprogressbar2((int) (100),(int) (0));
RDebugUtils.currentLine=28180798;
 //BA.debugLineNum = 28180798;BA.debugLine="ProgressoInicial2.visible = False";
parent.mostCurrent._progressoinicial2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180799;
 //BA.debugLineNum = 28180799;BA.debugLine="LabelTarefa.Visible = False";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28180800;
 //BA.debugLineNum = 28180800;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=28180810;
 //BA.debugLineNum = 28180810;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTAL";
if (true) break;

case 136:
//if
this.state = 139;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS")) { 
this.state = 138;
}if (true) break;

case 138:
//C
this.state = 139;
RDebugUtils.currentLine=28180811;
 //BA.debugLineNum = 28180811;BA.debugLine="File.Delete(Starter.SharedFolder,\"FIRSTINSTALL_";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS");
 if (true) break;

case 139:
//C
this.state = 140;
;
RDebugUtils.currentLine=28180956;
 //BA.debugLineNum = 28180956;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("628180956","************************************************************",0);
RDebugUtils.currentLine=28180957;
 //BA.debugLineNum = 28180957;BA.debugLine="Log(\"/interno\")";
anywheresoftware.b4a.keywords.Common.LogImpl("628180957","/interno",0);
RDebugUtils.currentLine=28180958;
 //BA.debugLineNum = 28180958;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("628180958","************************************************************",0);
RDebugUtils.currentLine=28180959;
 //BA.debugLineNum = 28180959;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=28180960;
 //BA.debugLineNum = 28180960;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUp";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=28180961;
 //BA.debugLineNum = 28180961;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=28180962;
 //BA.debugLineNum = 28180962;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=28180963;
 //BA.debugLineNum = 28180963;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28180964;
 //BA.debugLineNum = 28180964;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=28180965;
 //BA.debugLineNum = 28180965;BA.debugLine="Dim FTPINTERNOLIST As List";
_ftpinternolist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=28180966;
 //BA.debugLineNum = 28180966;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=28180968;
 //BA.debugLineNum = 28180968;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
_sfl = _globalftp.List(processBA,"/interno/");
RDebugUtils.currentLine=28180969;
 //BA.debugLineNum = 28180969;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sfl);
this.state = 204;
return;
case 204:
//C
this.state = 140;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=28180970;
 //BA.debugLineNum = 28180970;BA.debugLine="If Success Then";
if (true) break;

case 140:
//if
this.state = 153;
if (_success) { 
this.state = 142;
}else {
this.state = 152;
}if (true) break;

case 142:
//C
this.state = 143;
RDebugUtils.currentLine=28180972;
 //BA.debugLineNum = 28180972;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 143:
//if
this.state = 150;
if ((_files.length>=1)) { 
this.state = 145;
}if (true) break;

case 145:
//C
this.state = 146;
RDebugUtils.currentLine=28180973;
 //BA.debugLineNum = 28180973;BA.debugLine="FTPINTERNOLIST.Initialize";
_ftpinternolist.Initialize();
RDebugUtils.currentLine=28180974;
 //BA.debugLineNum = 28180974;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 146:
//for
this.state = 149;
step240 = 1;
limit240 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 205;
if (true) break;

case 205:
//C
this.state = 149;
if ((step240 > 0 && _i <= limit240) || (step240 < 0 && _i >= limit240)) this.state = 148;
if (true) break;

case 206:
//C
this.state = 205;
_i = ((int)(0 + _i + step240)) ;
if (true) break;

case 148:
//C
this.state = 206;
RDebugUtils.currentLine=28180975;
 //BA.debugLineNum = 28180975;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=28180976;
 //BA.debugLineNum = 28180976;BA.debugLine="FTPINTERNOLIST.Add(files(i).Name)";
_ftpinternolist.Add((Object)(_files[_i].getName()));
 if (true) break;
if (true) break;

case 149:
//C
this.state = 150;
;
 if (true) break;

case 150:
//C
this.state = 153;
;
 if (true) break;

case 152:
//C
this.state = 153;
RDebugUtils.currentLine=28180980;
 //BA.debugLineNum = 28180980;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallComplete";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstIntallCompleteProcedure","error getting files list from /interno/");
 if (true) break;
;
RDebugUtils.currentLine=28180983;
 //BA.debugLineNum = 28180983;BA.debugLine="If (FTPINTERNOLIST.IsInitialized) Then";

case 153:
//if
this.state = 176;
if ((_ftpinternolist.IsInitialized())) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=28180984;
 //BA.debugLineNum = 28180984;BA.debugLine="If (FTPINTERNOLIST.Size>=1) Then";
if (true) break;

case 156:
//if
this.state = 175;
if ((_ftpinternolist.getSize()>=1)) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
RDebugUtils.currentLine=28180985;
 //BA.debugLineNum = 28180985;BA.debugLine="TotalTemplates = FTPINTERNOLIST.Size-1";
_totaltemplates = (int) (_ftpinternolist.getSize()-1);
RDebugUtils.currentLine=28180986;
 //BA.debugLineNum = 28180986;BA.debugLine="For i=0 To FTPINTERNOLIST.Size-1";
if (true) break;

case 159:
//for
this.state = 174;
step251 = 1;
limit251 = (int) (_ftpinternolist.getSize()-1);
_i = (int) (0) ;
this.state = 207;
if (true) break;

case 207:
//C
this.state = 174;
if ((step251 > 0 && _i <= limit251) || (step251 < 0 && _i >= limit251)) this.state = 161;
if (true) break;

case 208:
//C
this.state = 207;
_i = ((int)(0 + _i + step251)) ;
if (true) break;

case 161:
//C
this.state = 162;
RDebugUtils.currentLine=28180987;
 //BA.debugLineNum = 28180987;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Ms";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/interno/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=28180988;
 //BA.debugLineNum = 28180988;BA.debugLine="Dim fName2 As String = FTPINTERNOLIST.Get(i)";
_fname2 = BA.ObjectToString(_ftpinternolist.Get(_i));
RDebugUtils.currentLine=28180989;
 //BA.debugLineNum = 28180989;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("628180989",_fname2,0);
RDebugUtils.currentLine=28180990;
 //BA.debugLineNum = 28180990;BA.debugLine="Try";
if (true) break;

case 162:
//try
this.state = 173;
this.catchState = 172;
this.state = 164;
if (true) break;

case 164:
//C
this.state = 165;
this.catchState = 172;
RDebugUtils.currentLine=28180991;
 //BA.debugLineNum = 28180991;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/interno/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=28180992;
 //BA.debugLineNum = 28180992;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "firstinstallcompleteprocedure"), _sf);
this.state = 209;
return;
case 209:
//C
this.state = 165;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=28180994;
 //BA.debugLineNum = 28180994;BA.debugLine="If Success Then";
if (true) break;

case 165:
//if
this.state = 170;
if (_success) { 
this.state = 167;
}else {
this.state = 169;
}if (true) break;

case 167:
//C
this.state = 170;
RDebugUtils.currentLine=28180995;
 //BA.debugLineNum = 28180995;BA.debugLine="Log(\"/interno/ : file was download successf";
anywheresoftware.b4a.keywords.Common.LogImpl("628180995","/interno/ : file was download successfully",0);
 if (true) break;

case 169:
//C
this.state = 170;
RDebugUtils.currentLine=28180998;
 //BA.debugLineNum = 28180998;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("628180998","/interno/ : Error downloading file",0);
 if (true) break;

case 170:
//C
this.state = 173;
;
 if (true) break;

case 172:
//C
this.state = 173;
this.catchState = 184;
RDebugUtils.currentLine=28181002;
 //BA.debugLineNum = 28181002;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628181002",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 173:
//C
this.state = 208;
this.catchState = 184;
;
RDebugUtils.currentLine=28181004;
 //BA.debugLineNum = 28181004;BA.debugLine="UpdateProgressBar(TotalTemplates,i)";
_updateprogressbar(_totaltemplates,_i);
 if (true) break;
if (true) break;

case 174:
//C
this.state = 175;
;
 if (true) break;

case 175:
//C
this.state = 176;
;
 if (true) break;

case 176:
//C
this.state = 177;
;
RDebugUtils.currentLine=28181008;
 //BA.debugLineNum = 28181008;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=28181016;
 //BA.debugLineNum = 28181016;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
if (true) break;

case 177:
//if
this.state = 182;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ )) { 
this.state = 179;
}else {
this.state = 181;
}if (true) break;

case 179:
//C
this.state = 182;
RDebugUtils.currentLine=28181017;
 //BA.debugLineNum = 28181017;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangu";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ );
 if (true) break;

case 181:
//C
this.state = 182;
RDebugUtils.currentLine=28181019;
 //BA.debugLineNum = 28181019;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 if (true) break;

case 182:
//C
this.state = 185;
;
RDebugUtils.currentLine=28181024;
 //BA.debugLineNum = 28181024;BA.debugLine="ShareCode.AwakeDevice(False)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28181025;
 //BA.debugLineNum = 28181025;BA.debugLine="PanelFirstInstallConfig.Visible = False";
parent.mostCurrent._panelfirstinstallconfig.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28181026;
 //BA.debugLineNum = 28181026;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 184:
//C
this.state = 185;
this.catchState = 0;
RDebugUtils.currentLine=28181032;
 //BA.debugLineNum = 28181032;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=28181033;
 //BA.debugLineNum = 28181033;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=28181034;
 //BA.debugLineNum = 28181034;BA.debugLine="StartService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=28181036;
 //BA.debugLineNum = 28181036;BA.debugLine="Starter.FirstInstall = True";
parent.mostCurrent._starter._firstinstall /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=28181037;
 //BA.debugLineNum = 28181037;BA.debugLine="MsgboxAsync(LastException.Message, ShareCode.Gen";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),processBA);
RDebugUtils.currentLine=28181038;
 //BA.debugLineNum = 28181038;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628181038",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=28181041;
 //BA.debugLineNum = 28181041;BA.debugLine="ShareCode.AwakeDevice(False)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28181042;
 //BA.debugLineNum = 28181042;BA.debugLine="PanelFirstInstallConfig.Visible = False";
parent.mostCurrent._panelfirstinstallconfig.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28181043;
 //BA.debugLineNum = 28181043;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 185:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=28181045;
 //BA.debugLineNum = 28181045;BA.debugLine="End Sub";
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
public static String  _updateprogressbar(int _maxval,int _currentval) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateprogressbar", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateprogressbar", new Object[] {_maxval,_currentval}));}
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub UpdateProgressBar(MaxVal As Int, CurrentVal As";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
_currentval = (int) ((100*_currentval/(double)_maxval));
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="ProgressoInicial.Progress = CurrentVal";
mostCurrent._progressoinicial.setProgress(_currentval);
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="End Sub";
return "";
}
public static String  _updateprogressbar2(int _maxval,int _currentval) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateprogressbar2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateprogressbar2", new Object[] {_maxval,_currentval}));}
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Sub UpdateProgressBar2(MaxVal As Int, CurrentVal A";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
_currentval = (int) ((100*_currentval/(double)_maxval));
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="ProgressoInicial2.Progress = CurrentVal";
mostCurrent._progressoinicial2.setProgress(_currentval);
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="End Sub";
return "";
}
public static void  _getbluetoothdeviceslistdialog(String _title) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getbluetoothdeviceslistdialog", false))
	 {Debug.delegate(mostCurrent.activityBA, "getbluetoothdeviceslistdialog", new Object[] {_title}); return;}
ResumableSub_GetBluetoothDevicesListDialog rsub = new ResumableSub_GetBluetoothDevicesListDialog(null,_title);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetBluetoothDevicesListDialog extends BA.ResumableSub {
public ResumableSub_GetBluetoothDevicesListDialog(xevolution.vrcg.devdemov2400.mainmenu parent,String _title) {
this.parent = parent;
this._title = _title;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _title;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(title, \"\"";
_sf = parent.mostCurrent._appldialog.ShowAsync(_title,"","Cancelar","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28442629;
 //BA.debugLineNum = 28442629;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent.mostCurrent._utils._setdialogcolors /*String*/ (mostCurrent.activityBA,_sf,parent.mostCurrent._consts._colorwhite /*int*/ ,parent.mostCurrent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=28442631;
 //BA.debugLineNum = 28442631;BA.debugLine="ApplDialog.SetSize(80%x, 80%y)";
parent.mostCurrent._appldialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (80),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (80),mostCurrent.activityBA));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=28442634;
 //BA.debugLineNum = 28442634;BA.debugLine="CurrentCLD = ApplDialog 'sf";
parent.mostCurrent._currentcld = parent.mostCurrent._appldialog;
RDebugUtils.currentLine=28442635;
 //BA.debugLineNum = 28442635;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "getbluetoothdeviceslistdialog"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=28442636;
 //BA.debugLineNum = 28442636;BA.debugLine="DialogPanel.LoadLayout(\"dialog_bluetooth_devices\"";
_dialogpanel.LoadLayout("dialog_bluetooth_devices",mostCurrent.activityBA);
RDebugUtils.currentLine=28442637;
 //BA.debugLineNum = 28442637;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
parent.mostCurrent._listviewbluetoothdevices.getSingleLineLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=28442638;
 //BA.debugLineNum = 28442638;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.Label.T";
parent.mostCurrent._listviewbluetoothdevices.getSingleLineLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=28442639;
 //BA.debugLineNum = 28442639;BA.debugLine="ListViewBluetoothDevices.SingleLineLayout.ItemHei";
parent.mostCurrent._listviewbluetoothdevices.getSingleLineLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=28442641;
 //BA.debugLineNum = 28442641;BA.debugLine="ButtonAssociated.Color = Consts.ColorMain";
parent.mostCurrent._buttonassociated.setColor(parent.mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=28442642;
 //BA.debugLineNum = 28442642;BA.debugLine="ButtonScanPrinter.Color = Consts.ColorMain";
parent.mostCurrent._buttonscanprinter.setColor(parent.mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=28442643;
 //BA.debugLineNum = 28442643;BA.debugLine="ButtonPrint.Color = Consts.ColorMain";
parent.mostCurrent._buttonprint.setColor(parent.mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=28442647;
 //BA.debugLineNum = 28442647;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "getbluetoothdeviceslistdialog"), _sf);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=28442648;
 //BA.debugLineNum = 28442648;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=28442655;
 //BA.debugLineNum = 28442655;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _listsreturn(String _arg) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsreturn", false))
	 {Debug.delegate(mostCurrent.activityBA, "listsreturn", new Object[] {_arg}); return;}
ResumableSub_ListsReturn rsub = new ResumableSub_ListsReturn(null,_arg);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListsReturn extends BA.ResumableSub {
public ResumableSub_ListsReturn(xevolution.vrcg.devdemov2400.mainmenu parent,String _arg) {
this.parent = parent;
this._arg = _arg;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _arg;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "listsreturn"),(int) (500));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="Starter.CurrentWorkActivity = Me";
parent.mostCurrent._starter._currentworkactivity /*Object*/  = mainmenu.getObject();
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="BadgeCheckUpdate";
_badgecheckupdate();
RDebugUtils.currentLine=25755654;
 //BA.debugLineNum = 25755654;BA.debugLine="If (Arg = \"ImageEdit\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (((_arg).equals("ImageEdit"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="CallSub(ImageEdit, \"ForceClose\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(parent.mostCurrent._imageedit.getObject()),"ForceClose");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=25755657;
 //BA.debugLineNum = 25755657;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _listsreturnnoaction() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsreturnnoaction", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsreturnnoaction", null));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Sub ListsReturnNoAction";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Starter.CurrentWorkActivity = Me";
mostCurrent._starter._currentworkactivity /*Object*/  = mainmenu.getObject();
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="BadgeCheckUpdate";
_badgecheckupdate();
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="End Sub";
return "";
}
public static void  _listsreturnupdateserver(String _url,anywheresoftware.b4a.objects.collections.List _mappings) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsreturnupdateserver", false))
	 {Debug.delegate(mostCurrent.activityBA, "listsreturnupdateserver", new Object[] {_url,_mappings}); return;}
ResumableSub_ListsReturnUpdateServer rsub = new ResumableSub_ListsReturnUpdateServer(null,_url,_mappings);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListsReturnUpdateServer extends BA.ResumableSub {
public ResumableSub_ListsReturnUpdateServer(xevolution.vrcg.devdemov2400.mainmenu parent,String _url,anywheresoftware.b4a.objects.collections.List _mappings) {
this.parent = parent;
this._url = _url;
this._mappings = _mappings;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _url;
anywheresoftware.b4a.objects.collections.List _mappings;
int _countuploadfiles = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _params = null;
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _filename = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _upl = null;
boolean _finish = false;
String _serverlocation = "";
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="ProgressDialogShow2(ShareCode.AvisoAguarde, False";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoaguarde /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "listsreturnupdateserver"),(int) (100));
this.state = 25;
return;
case 25:
//C
this.state = 1;
;
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="Dim CountUploadFiles As Int = 0";
_countuploadfiles = (int) (0);
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="For i=0 To mappings.Size-1";
if (true) break;

case 1:
//for
this.state = 24;
step4 = 1;
limit4 = (int) (_mappings.getSize()-1);
_i = (int) (0) ;
this.state = 26;
if (true) break;

case 26:
//C
this.state = 24;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 27:
//C
this.state = 26;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="Dim params As Map = mappings.Get(i)";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mappings.Get(_i)));
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,mainmenu.getObject(),_url,"","");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=25821193;
 //BA.debugLineNum = 25821193;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=25821194;
 //BA.debugLineNum = 25821194;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="Dim Filename As String = params.Get(\"imagename\")";
_filename = BA.ObjectToString(_params.Get((Object)("imagename")));
RDebugUtils.currentLine=25821197;
 //BA.debugLineNum = 25821197;BA.debugLine="If Utils.NNE(Filename) Then";
if (true) break;

case 10:
//if
this.state = 23;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_filename)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=25821198;
 //BA.debugLineNum = 25821198;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 13:
//if
this.state = 22;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=25821199;
 //BA.debugLineNum = 25821199;BA.debugLine="Dim upl  As ResumableSub = UploadFilesWithFTP(";
_upl = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_upl = _uploadfileswithftp(_filename);
RDebugUtils.currentLine=25821200;
 //BA.debugLineNum = 25821200;BA.debugLine="Wait For(upl) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "listsreturnupdateserver"), _upl);
this.state = 28;
return;
case 28:
//C
this.state = 16;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=25821201;
 //BA.debugLineNum = 25821201;BA.debugLine="If(finish = False)Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((_finish==anywheresoftware.b4a.keywords.Common.False)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=25821202;
 //BA.debugLineNum = 25821202;BA.debugLine="CountUploadFiles = CountUploadFiles + 1";
_countuploadfiles = (int) (_countuploadfiles+1);
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=25821204;
 //BA.debugLineNum = 25821204;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "listsreturnupdateserver"),(int) (500));
this.state = 29;
return;
case 29:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=25821206;
 //BA.debugLineNum = 25821206;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.";
_serverlocation = ("/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=25821207;
 //BA.debugLineNum = 25821207;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=25821208;
 //BA.debugLineNum = 25821208;BA.debugLine="Utils.save2update(ServerLocation, Filename, 1,";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serverlocation,_filename,(int) (1),_workernd);
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=25821212;
 //BA.debugLineNum = 25821212;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "listsreturnupdateserver"),(int) (500));
this.state = 30;
return;
case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=25821213;
 //BA.debugLineNum = 25821213;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=25821214;
 //BA.debugLineNum = 25821214;BA.debugLine="Starter.CurrentWorkActivity = Me";
parent.mostCurrent._starter._currentworkactivity /*Object*/  = mainmenu.getObject();
RDebugUtils.currentLine=25821215;
 //BA.debugLineNum = 25821215;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=25821216;
 //BA.debugLineNum = 25821216;BA.debugLine="BadgeCheckUpdate";
_badgecheckupdate();
RDebugUtils.currentLine=25821217;
 //BA.debugLineNum = 25821217;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadfileswithftp(String _filename) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadfileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "uploadfileswithftp", new Object[] {_filename}));}
ResumableSub_UploadFilesWithFTP rsub = new ResumableSub_UploadFilesWithFTP(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTP(xevolution.vrcg.devdemov2400.mainmenu parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _filename;
boolean _ret = false;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
String _serverlocation = "";
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=25886728;
 //BA.debugLineNum = 25886728;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=25886729;
 //BA.debugLineNum = 25886729;BA.debugLine="Log(filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("625886729",_filename,0);
RDebugUtils.currentLine=25886730;
 //BA.debugLineNum = 25886730;BA.debugLine="Dim ServerLocation As String = $\"/${ShareCode.APP";
_serverlocation = ("/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/docs/");
RDebugUtils.currentLine=25886731;
 //BA.debugLineNum = 25886731;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,anywheresoftware.b4a.keywords.Common.False,_serverlocation+_filename);
RDebugUtils.currentLine=25886732;
 //BA.debugLineNum = 25886732;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=25886733;
 //BA.debugLineNum = 25886733;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=25886734;
 //BA.debugLineNum = 25886734;BA.debugLine="Log(\"file was uploaded successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("625886734","file was uploaded successfully",0);
RDebugUtils.currentLine=25886735;
 //BA.debugLineNum = 25886735;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=25886737;
 //BA.debugLineNum = 25886737;BA.debugLine="Log(\"Error uploading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("625886737","Error uploading file",0);
RDebugUtils.currentLine=25886738;
 //BA.debugLineNum = 25886738;BA.debugLine="ret = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=25886740;
 //BA.debugLineNum = 25886740;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=25886741;
 //BA.debugLineNum = 25886741;BA.debugLine="Return ret";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_ret));return;};
RDebugUtils.currentLine=25886742;
 //BA.debugLineNum = 25886742;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _listviewbluetoothdevices_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewbluetoothdevices_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewbluetoothdevices_itemclick", new Object[] {_position,_value}));}
int _n = 0;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Sub ListViewBluetoothDevices_ItemClick (Position A";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Try";
try {RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="CurrentPrinterConnected = Value";
mostCurrent._currentprinterconnected = _value;
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="PrinterMessage = \"Impressora Conectada\"";
mostCurrent._printermessage = "Impressora Conectada";
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="Printer.ClearBuffer";
mostCurrent._printer._vvv3();
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,\"xevol";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._internalfolder /*String*/ ,"xevolution_mono_logo.png"))) { 
RDebugUtils.currentLine=28966919;
 //BA.debugLineNum = 28966919;BA.debugLine="If File.Exists(Starter.AssetsFolder,\"xevolution";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._assetsfolder /*String*/ ,"xevolution_mono_logo.png")) { 
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="File.Copy(Starter.AssetsFolder,\"xevolution_mon";
anywheresoftware.b4a.keywords.Common.File.Copy(mostCurrent._starter._assetsfolder /*String*/ ,"xevolution_mono_logo.png",mostCurrent._starter._internalfolder /*String*/ ,"xevolution_mono_logo.png");
 };
 };
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="Try";
try {RDebugUtils.currentLine=28966925;
 //BA.debugLineNum = 28966925;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(Starter.Int";
mostCurrent._printer._addbuffer_bitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(mostCurrent._starter._internalfolder /*String*/ ,"xevolution_mono_logo.png"),(int) (0));
RDebugUtils.currentLine=28966926;
 //BA.debugLineNum = 28966926;BA.debugLine="Printer.SendBufferToPrinter";
mostCurrent._printer._vvvv0();
 } 
       catch (Exception e14) {
			processBA.setLastException(e14); };
RDebugUtils.currentLine=28966933;
 //BA.debugLineNum = 28966933;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.BoldOn & \"XE";
mostCurrent._printer._addbuffer_writeline(mostCurrent._esc_pos._vv1+"XEVOLUTION LDA"+mostCurrent._esc_pos._vv4);
RDebugUtils.currentLine=28966934;
 //BA.debugLineNum = 28966934;BA.debugLine="Printer.AddBuffer_Writeline(ESC_POS.FontB_Normal";
mostCurrent._printer._addbuffer_writeline(mostCurrent._esc_pos._fontb_normal+"- VRCG -"+mostCurrent._esc_pos._fonta_normal);
RDebugUtils.currentLine=28966935;
 //BA.debugLineNum = 28966935;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
mostCurrent._printer._addbuffer_bitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"barra_cinza.png"),(int) (0));
RDebugUtils.currentLine=28966936;
 //BA.debugLineNum = 28966936;BA.debugLine="For n=0 To 10";
{
final int step18 = 1;
final int limit18 = (int) (10);
_n = (int) (0) ;
for (;_n <= limit18 ;_n = _n + step18 ) {
RDebugUtils.currentLine=28966937;
 //BA.debugLineNum = 28966937;BA.debugLine="Printer.AddBuffer_Writeline($\"Linha de Teste ${";
mostCurrent._printer._addbuffer_writeline(("Linha de Teste "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+""));
 }
};
RDebugUtils.currentLine=28966941;
 //BA.debugLineNum = 28966941;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
mostCurrent._printer._addbuffer_bitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"barra_cinza.png"),(int) (0));
RDebugUtils.currentLine=28966942;
 //BA.debugLineNum = 28966942;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
mostCurrent._printer._addbuffer_writeline("");
RDebugUtils.currentLine=28966943;
 //BA.debugLineNum = 28966943;BA.debugLine="Printer.AddBuffer_Writeline(\"\")";
mostCurrent._printer._addbuffer_writeline("");
RDebugUtils.currentLine=28966944;
 //BA.debugLineNum = 28966944;BA.debugLine="Printer.AddBuffer_Bitmap(LoadBitmap(File.DirAsse";
mostCurrent._printer._addbuffer_bitmap(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"barra_cinza.png"),(int) (0));
RDebugUtils.currentLine=28966945;
 //BA.debugLineNum = 28966945;BA.debugLine="Printer.SelectFromMac(Value)";
mostCurrent._printer._vvvv7(BA.ObjectToString(_value));
RDebugUtils.currentLine=28966946;
 //BA.debugLineNum = 28966946;BA.debugLine="File.WriteString(Starter.InternalFolder,$\"defult";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._internalfolder /*String*/ ,("defultprinter.set"),BA.ObjectToString(_value));
 } 
       catch (Exception e28) {
			processBA.setLastException(e28);RDebugUtils.currentLine=28966948;
 //BA.debugLineNum = 28966948;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628966948",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=28966950;
 //BA.debugLineNum = 28966950;BA.debugLine="End Sub";
return "";
}
public static String  _lockscreen(int _nextsetp,int _counter) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lockscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lockscreen", new Object[] {_nextsetp,_counter}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Sub LockScreen(nextSetp As Int, counter As Int)";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="LockPanel.Visible = False";
mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="ShareCode.MainLockPanel = LockPanel.Visible";
mostCurrent._sharecode._mainlockpanel /*boolean*/  = mostCurrent._lockpanel.getVisible();
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="End Sub";
return "";
}
public static String  _mainbuttonmenu_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainbuttonmenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainbuttonmenu_click", null));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub mainButtonMenu_Click";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Try";
try {RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="If(MainPopMenu.MenuIsOpen) Then";
if ((mostCurrent._mainpopmenu._menuisopen)) { 
RDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="MainPopMenu.CloseMenu";
mostCurrent._mainpopmenu._closemenu();
 }else {
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="MainPopMenu.OpenMenu";
mostCurrent._mainpopmenu._openmenu();
 };
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="MainPopMenuList.Left = mainButtonMenu.Left - Mai";
mostCurrent._mainpopmenulist.setLeft((int) (mostCurrent._mainbuttonmenu.getLeft()-mostCurrent._mainpopmenulist.getWidth()+mostCurrent._mainbuttonmenu.getWidth()));
RDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="MainPopMenuList.top = mainButtonMenu.top + mainB";
mostCurrent._mainpopmenulist.setTop((int) (mostCurrent._mainbuttonmenu.getTop()+mostCurrent._mainbuttonmenu.getHeight()));
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="If MainPopMenuList.Visible = True Then";
if (mostCurrent._mainpopmenulist.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=24051723;
 //BA.debugLineNum = 24051723;BA.debugLine="MainPopMenuList.Visible = False";
mostCurrent._mainpopmenulist.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=24051725;
 //BA.debugLineNum = 24051725;BA.debugLine="MainPopMenuList.Visible = True";
mostCurrent._mainpopmenulist.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 };
RDebugUtils.currentLine=24051728;
 //BA.debugLineNum = 24051728;BA.debugLine="End Sub";
return "";
}
public static String  _maindatavalidation_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "maindatavalidation_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "maindatavalidation_click", new Object[] {_menuname}));}
xevolution.vrcg.devdemov2400.appdialogs _this = null;
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Sub MainDataValidation_Click(MenuName As String)";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="Private this As AppDialogs";
_this = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="this.Initialize";
_this._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="this.GetDataInfoDialog(\"MainMenu\")";
_this._getdatainfodialog /*void*/ (null,(Object)("MainMenu"));
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="End Sub";
return "";
}
public static String  _maindeviceinfopopmenu_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "maindeviceinfopopmenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "maindeviceinfopopmenu_click", new Object[] {_menuname}));}
xevolution.vrcg.devdemov2400.appdialogs _this = null;
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Sub MainDeviceInfoPopMenu_Click(MenuName As String";
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="Private this As AppDialogs";
_this = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="this.Initialize";
_this._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="this.GetDeviceInfoDialog(\"MainMenu\", Starter.DevI";
_this._getdeviceinfodialog /*void*/ (null,(Object)("MainMenu"),mostCurrent._starter._devinfo /*xevolution.vrcg.devdemov2400.types._deviceinformation*/ );
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="End Sub";
return "";
}
public static String  _maindeviceprint_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "maindeviceprint_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "maindeviceprint_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Sub MainDevicePrint_Click(MenuName As String)";
RDebugUtils.currentLine=27197444;
 //BA.debugLineNum = 27197444;BA.debugLine="GetBluetoothDevicesListDialog(\"Escolha o Disposit";
_getbluetoothdeviceslistdialog("Escolha o Dispositívo");
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="End Sub";
return "";
}
public static String  _mainpopmenuchecklisttest_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenuchecklisttest_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainpopmenuchecklisttest_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Sub MainPopMenuChecklistTest_Click(MenuName As Str";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Log(\"MainPopMenuChecklistTest\")";
anywheresoftware.b4a.keywords.Common.LogImpl("626214401","MainPopMenuChecklistTest",0);
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="End Sub";
return "";
}
public static String  _mainpopmenucompany_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenucompany_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainpopmenucompany_click", new Object[] {_menuname}));}
xevolution.vrcg.devdemov2400.appdialogs _filterparams = null;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Sub MainPopMenuCompany_Click(MenuName As String)";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="Dim FilterParams As AppDialogs";
_filterparams = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="FilterParams.Initialize";
_filterparams._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="FilterParams.getDeviceParamsDialog(Activity, \"Mai";
_filterparams._getdeviceparamsdialog /*void*/ (null,mostCurrent._activity,(Object)("MainMenu"),_menuname);
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="End Sub";
return "";
}
public static void  _mainpopmenuexit_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenuexit_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "mainpopmenuexit_click", new Object[] {_menuname}); return;}
ResumableSub_MainPopMenuExit_Click rsub = new ResumableSub_MainPopMenuExit_Click(null,_menuname);
rsub.resume(processBA, null);
}
public static class ResumableSub_MainPopMenuExit_Click extends BA.ResumableSub {
public ResumableSub_MainPopMenuExit_Click(xevolution.vrcg.devdemov2400.mainmenu parent,String _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _menuname;
int _result = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finished = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="Msgbox2Async(ShareCode.mainlayoutAskSair, ShareCo";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainlayoutasksair /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26935299;
 //BA.debugLineNum = 26935299;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenuexit_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=26935301;
 //BA.debugLineNum = 26935301;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_2\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_2",mainmenu.getObject());
RDebugUtils.currentLine=26935302;
 //BA.debugLineNum = 26935302;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenuexit_click"),(int) (250));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=26935304;
 //BA.debugLineNum = 26935304;BA.debugLine="DBUtils.ClearTable(Starter.LocalSQLWRK, \"loc_use";
parent.mostCurrent._dbutils._cleartable /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_userssession");
RDebugUtils.currentLine=26935305;
 //BA.debugLineNum = 26935305;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","LAST_USER",parent.mostCurrent._sharecode._app_last_user /*String*/ );
RDebugUtils.currentLine=26935306;
 //BA.debugLineNum = 26935306;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=26935308;
 //BA.debugLineNum = 26935308;BA.debugLine="Dim res As ResumableSub = CloseAllServicesFromMe";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _closeallservicesfrommenu();
RDebugUtils.currentLine=26935309;
 //BA.debugLineNum = 26935309;BA.debugLine="Wait For(res) Complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenuexit_click"), _res);
this.state = 7;
return;
case 7:
//C
this.state = 4;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=26935311;
 //BA.debugLineNum = 26935311;BA.debugLine="CallSubDelayed(Main, \"ActivityFinish\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(parent.mostCurrent._main.getObject()),"ActivityFinish");
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=26935313;
 //BA.debugLineNum = 26935313;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mainpopmenulist_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenulist_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainpopmenulist_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Sub MainPopMenuList_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="MainPopMenuList.Visible = False";
mostCurrent._mainpopmenulist.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)("MainPopMenuSync"),(Object)("MainDataValidation"),(Object)("MainPopMenuCompany"),(Object)("MainPopMenuPushRequest"),(Object)("MainPopMenuLoginChange"),(Object)("MainDeviceInfoPopMenu"),(Object)("MainUpdateAPK"),(Object)("MainDevicePrint"),(Object)("MainPopMenuExit"))) {
case 0: {
RDebugUtils.currentLine=30146565;
 //BA.debugLineNum = 30146565;BA.debugLine="MainPopMenuSync_Click(Value)";
_mainpopmenusync_click(BA.ObjectToString(_value));
 break; }
case 1: {
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="MainDataValidation_Click(Value)";
_maindatavalidation_click(BA.ObjectToString(_value));
 break; }
case 2: {
RDebugUtils.currentLine=30146569;
 //BA.debugLineNum = 30146569;BA.debugLine="MainPopMenuCompany_Click(Value)";
_mainpopmenucompany_click(BA.ObjectToString(_value));
 break; }
case 3: {
RDebugUtils.currentLine=30146571;
 //BA.debugLineNum = 30146571;BA.debugLine="MainPopMenuPushRequest_Click(Value)";
_mainpopmenupushrequest_click(BA.ObjectToString(_value));
 break; }
case 4: {
RDebugUtils.currentLine=30146573;
 //BA.debugLineNum = 30146573;BA.debugLine="MainPopMenuLoginChange_Click(Value)";
_mainpopmenuloginchange_click(BA.ObjectToString(_value));
 break; }
case 5: {
RDebugUtils.currentLine=30146575;
 //BA.debugLineNum = 30146575;BA.debugLine="MainDeviceInfoPopMenu_Click(Value)";
_maindeviceinfopopmenu_click(BA.ObjectToString(_value));
 break; }
case 6: {
RDebugUtils.currentLine=30146577;
 //BA.debugLineNum = 30146577;BA.debugLine="MainUpdateAPK_Click(Value)";
_mainupdateapk_click(BA.ObjectToString(_value));
 break; }
case 7: {
RDebugUtils.currentLine=30146579;
 //BA.debugLineNum = 30146579;BA.debugLine="MainDevicePrint_Click(Value)";
_maindeviceprint_click(BA.ObjectToString(_value));
 break; }
case 8: {
RDebugUtils.currentLine=30146581;
 //BA.debugLineNum = 30146581;BA.debugLine="MainPopMenuExit_Click(Value)";
_mainpopmenuexit_click(BA.ObjectToString(_value));
 break; }
}
;
RDebugUtils.currentLine=30146584;
 //BA.debugLineNum = 30146584;BA.debugLine="End Sub";
return "";
}
public static void  _mainpopmenusync_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenusync_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "mainpopmenusync_click", new Object[] {_menuname}); return;}
ResumableSub_MainPopMenuSync_Click rsub = new ResumableSub_MainPopMenuSync_Click(null,_menuname);
rsub.resume(processBA, null);
}
public static class ResumableSub_MainPopMenuSync_Click extends BA.ResumableSub {
public ResumableSub_MainPopMenuSync_Click(xevolution.vrcg.devdemov2400.mainmenu parent,String _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _menuname;
int _result = 0;
int _tipodlg = 0;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="Msgbox2Async(ShareCode.POPUPMENU_SyncManual,Sha";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._popupmenu_syncmanual /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._popupmenu_mainpopmenusync /*String*/ ),parent.mostCurrent._sharecode._option_automatico /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,parent.mostCurrent._sharecode._option_manual /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenusync_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=26476551;
 //BA.debugLineNum = 26476551;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=26476556;
 //BA.debugLineNum = 26476556;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
parent.mostCurrent._sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=26476553;
 //BA.debugLineNum = 26476553;BA.debugLine="ShareCode.SYNC_COMPONENTS = \"\"";
parent.mostCurrent._sharecode._sync_components /*String*/  = "";
RDebugUtils.currentLine=26476554;
 //BA.debugLineNum = 26476554;BA.debugLine="ShareCode.DownloadDocsFromFTP = True";
parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="CallSubDelayed3(DataUpdate, \"RunSync\",\"\",False";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._dataupdate.getObject()),"RunSync",(Object)(""),(Object)(anywheresoftware.b4a.keywords.Common.False));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=26476557;
 //BA.debugLineNum = 26476557;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=26476558;
 //BA.debugLineNum = 26476558;BA.debugLine="Dim TipoDlg As Int = 0";
_tipodlg = (int) (0);
RDebugUtils.currentLine=26476559;
 //BA.debugLineNum = 26476559;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=26476560;
 //BA.debugLineNum = 26476560;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=26476561;
 //BA.debugLineNum = 26476561;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
parent.mostCurrent._sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=26476562;
 //BA.debugLineNum = 26476562;BA.debugLine="ShareCode.SYNC_COMPONENTS = \"\"";
parent.mostCurrent._sharecode._sync_components /*String*/  = "";
RDebugUtils.currentLine=26476563;
 //BA.debugLineNum = 26476563;BA.debugLine="Filter.getSyncManual(Me, TipoDlg)";
_filter._getsyncmanual /*void*/ (null,mainmenu.getObject(),_tipodlg);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=26476570;
 //BA.debugLineNum = 26476570;BA.debugLine="MsgboxAsync(ShareCode.AvisoNoSync, ShareCode.Gen";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisonosync /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=26476572;
 //BA.debugLineNum = 26476572;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mainpopmenupushrequest_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenupushrequest_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainpopmenupushrequest_click", new Object[] {_menuname}));}
xevolution.vrcg.devdemov2400.appdialogs _filterparams = null;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Sub MainPopMenuPushRequest_Click(MenuName As Strin";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Log(\"MainPopMenuPushRequest\")";
anywheresoftware.b4a.keywords.Common.LogImpl("626148865","MainPopMenuPushRequest",0);
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="Dim FilterParams As AppDialogs";
_filterparams = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="FilterParams.Initialize";
_filterparams._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="FilterParams.getPushRequestCode(Activity, \"MainMe";
_filterparams._getpushrequestcode /*void*/ (null,(Object)(mostCurrent._activity.getObject()),"MainMenu","Puxar intervenção");
RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="End Sub";
return "";
}
public static void  _mainpopmenuloginchange_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainpopmenuloginchange_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "mainpopmenuloginchange_click", new Object[] {_menuname}); return;}
ResumableSub_MainPopMenuLoginChange_Click rsub = new ResumableSub_MainPopMenuLoginChange_Click(null,_menuname);
rsub.resume(processBA, null);
}
public static class ResumableSub_MainPopMenuLoginChange_Click extends BA.ResumableSub {
public ResumableSub_MainPopMenuLoginChange_Click(xevolution.vrcg.devdemov2400.mainmenu parent,String _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _menuname;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_2\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_2",mainmenu.getObject());
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenuloginchange_click"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="DBUtils.ClearTable(Starter.LocalSQLWRK, \"loc_user";
parent.mostCurrent._dbutils._cleartable /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_userssession");
RDebugUtils.currentLine=27066373;
 //BA.debugLineNum = 27066373;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_U";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","LAST_USER","");
RDebugUtils.currentLine=27066374;
 //BA.debugLineNum = 27066374;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=27066376;
 //BA.debugLineNum = 27066376;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=27066377;
 //BA.debugLineNum = 27066377;BA.debugLine="Log($\"Stop service : LocationService\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("627066377",("Stop service : LocationService"),0);
RDebugUtils.currentLine=27066378;
 //BA.debugLineNum = 27066378;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=27066379;
 //BA.debugLineNum = 27066379;BA.debugLine="Log($\"Stop service : Comms\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("627066379",("Stop service : Comms"),0);
RDebugUtils.currentLine=27066380;
 //BA.debugLineNum = 27066380;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=27066381;
 //BA.debugLineNum = 27066381;BA.debugLine="Log($\"Stop service : UserService\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("627066381",("Stop service : UserService"),0);
RDebugUtils.currentLine=27066382;
 //BA.debugLineNum = 27066382;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=27066383;
 //BA.debugLineNum = 27066383;BA.debugLine="Log($\"Stop service : Logs\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("627066383",("Stop service : Logs"),0);
RDebugUtils.currentLine=27066384;
 //BA.debugLineNum = 27066384;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenuloginchange_click"),(int) (1000));
this.state = 2;
return;
case 2:
//C
this.state = -1;
;
RDebugUtils.currentLine=27066385;
 //BA.debugLineNum = 27066385;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=27066386;
 //BA.debugLineNum = 27066386;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainpopmenuloginchange_click"),(int) (500));
this.state = 3;
return;
case 3:
//C
this.state = -1;
;
RDebugUtils.currentLine=27066387;
 //BA.debugLineNum = 27066387;BA.debugLine="Log(\"Voltou do StartActivity(Main)\")";
anywheresoftware.b4a.keywords.Common.LogImpl("627066387","Voltou do StartActivity(Main)",0);
RDebugUtils.currentLine=27066388;
 //BA.debugLineNum = 27066388;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=27066389;
 //BA.debugLineNum = 27066389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mainupdateapk_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainupdateapk_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainupdateapk_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Sub MainUpdateAPK_Click(Menuname As String)";
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="End Sub";
return "";
}
public static void  _mainrestartconfig_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainrestartconfig_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "mainrestartconfig_click", new Object[] {_menuname}); return;}
ResumableSub_MainRestartConfig_Click rsub = new ResumableSub_MainRestartConfig_Click(null,_menuname);
rsub.resume(processBA, null);
}
public static class ResumableSub_MainRestartConfig_Click extends BA.ResumableSub {
public ResumableSub_MainRestartConfig_Click(xevolution.vrcg.devdemov2400.mainmenu parent,String _menuname) {
this.parent = parent;
this._menuname = _menuname;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _menuname;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Msgbox2Async(\"Confirma o procedimento de re-inici";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Confirma o procedimento de re-inicialização da configuração do equipamento?"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainrestartconfig_click"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_2\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_2",mainmenu.getObject());
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "mainrestartconfig_click"),(int) (250));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="MakeRestartConfig";
_makerestartconfig();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=27983881;
 //BA.debugLineNum = 27983881;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _makerestartconfig() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makerestartconfig", false))
	 {Debug.delegate(mostCurrent.activityBA, "makerestartconfig", null); return;}
ResumableSub_MakeRestartConfig rsub = new ResumableSub_MakeRestartConfig(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_MakeRestartConfig extends BA.ResumableSub {
public ResumableSub_MakeRestartConfig(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Starter.LocalSQLEVC.Close";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolutionch";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionchec";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=28049413;
 //BA.debugLineNum = 28049413;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "makerestartconfig"),(int) (250));
this.state = 19;
return;
case 19:
//C
this.state = 5;
;
RDebugUtils.currentLine=28049415;
 //BA.debugLineNum = 28049415;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evoluti";
if (true) break;

case 5:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=28049416;
 //BA.debugLineNum = 28049416;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\",";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"evolutioncheck.db3",parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=28049418;
 //BA.debugLineNum = 28049418;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "makerestartconfig"),(int) (250));
this.state = 20;
return;
case 20:
//C
this.state = 9;
;
RDebugUtils.currentLine=28049420;
 //BA.debugLineNum = 28049420;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then St";
if (true) break;

case 9:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized())) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Initialize(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3",anywheresoftware.b4a.keywords.Common.True);
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=28049421;
 //BA.debugLineNum = 28049421;BA.debugLine="Dim res As ResumableSub = FirstInstallCompletePro";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _firstinstallcompleteprocedure(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28049422;
 //BA.debugLineNum = 28049422;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "makerestartconfig"), _res);
this.state = 21;
return;
case 21:
//C
this.state = 15;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=28049423;
 //BA.debugLineNum = 28049423;BA.debugLine="If Not(result)Then";
if (true) break;

case 15:
//if
this.state = 18;
if (anywheresoftware.b4a.keywords.Common.Not(_result)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=28049424;
 //BA.debugLineNum = 28049424;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.G";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=28049425;
 //BA.debugLineNum = 28049425;BA.debugLine="Starter.APP_IN_EXECUTION = False";
parent.mostCurrent._starter._app_in_execution /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=28049428;
 //BA.debugLineNum = 28049428;BA.debugLine="MainPopMenuLoginChange_Click(\"\")";
_mainpopmenuloginchange_click("");
RDebugUtils.currentLine=28049429;
 //BA.debugLineNum = 28049429;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _printer_connectedtoprint(boolean _success) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_connectedtoprint", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_connectedtoprint", new Object[] {_success}));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Sub Printer_ConnectedToPrint (Success As Boolean)";
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="ButtonPrint.Visible = True";
mostCurrent._buttonprint.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="ToastMessageShow(PrinterMessage,False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(mostCurrent._printermessage),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28835845;
 //BA.debugLineNum = 28835845;BA.debugLine="ListViewBluetoothDevices.Clear";
mostCurrent._listviewbluetoothdevices.Clear();
 }else {
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="ButtonPrint.Visible = False";
mostCurrent._buttonprint.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="ToastMessageShow(\"Erro ao conectar a Impressora\"";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Erro ao conectar a Impressora"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="End Sub";
return "";
}
public static String  _printer_discoveryfinished() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_discoveryfinished", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_discoveryfinished", null));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Sub Printer_DiscoveryFinished";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Log(\"Search End\")";
anywheresoftware.b4a.keywords.Common.LogImpl("628704769","Search End",0);
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="End Sub";
return "";
}
public static String  _printer_discoverynewprinter(anywheresoftware.b4a.objects.collections.Map _printerfound,int _deviceclass) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_discoverynewprinter", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_discoverynewprinter", new Object[] {_printerfound,_deviceclass}));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Sub Printer_DiscoveryNewPrinter (PrinterFound As M";
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="Try";
try {RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="Log(\"DEVICE Class:\" & DeviceClass)";
anywheresoftware.b4a.keywords.Common.LogImpl("628639235","DEVICE Class:"+BA.NumberToString(_deviceclass),0);
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(PrinterF";
mostCurrent._listviewbluetoothdevices.AddSingleLine2(BA.ObjectToCharSequence(_printerfound.GetKeyAt((int) (0))),_printerfound.GetValueAt((int) (0)));
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628639238",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=28639240;
 //BA.debugLineNum = 28639240;BA.debugLine="End Sub";
return "";
}
public static String  _printer_discoverynodevicefound() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_discoverynodevicefound", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_discoverynodevicefound", null));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Sub Printer_DiscoveryNoDeviceFound";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="ToastMessageShow(\"Device not found\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Device not found"),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="End Sub";
return "";
}
public static String  _printer_listprinterassociated(anywheresoftware.b4a.objects.collections.Map _listnameandmac) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_listprinterassociated", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_listprinterassociated", new Object[] {_listnameandmac}));}
int _i = 0;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Sub Printer_ListPrinterAssociated (ListNameAndMac";
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Try";
try {RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="ListViewBluetoothDevices.Clear";
mostCurrent._listviewbluetoothdevices.Clear();
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="For I=0 To ListNameAndMac.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_listnameandmac.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="ListViewBluetoothDevices.AddSingleLine2(ListNam";
mostCurrent._listviewbluetoothdevices.AddSingleLine2(BA.ObjectToCharSequence(_listnameandmac.GetKeyAt(_i)),_listnameandmac.GetValueAt(_i));
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="Log($\"${ListNameAndMac.GetKeyAt(I)}, ${ListName";
anywheresoftware.b4a.keywords.Common.LogImpl("628508166",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_listnameandmac.GetKeyAt(_i))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_listnameandmac.GetValueAt(_i))+""),0);
 }
};
 } 
       catch (Exception e8) {
			processBA.setLastException(e8);RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("628508169",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=28508171;
 //BA.debugLineNum = 28508171;BA.debugLine="End Sub";
return "";
}
public static String  _printer_sendterminated() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "printer_sendterminated", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "printer_sendterminated", null));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Sub Printer_SendTerminated";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Log(\"Finish!!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("628901377","Finish!!",0);
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinemoreoptions_click() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinemoreoptions_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinemoreoptions_click", null));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Sub RecordLineMoreOptions_Click";
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="End Sub";
return "";
}
public static void  _reinstallation(boolean _download) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "reinstallation", false))
	 {Debug.delegate(mostCurrent.activityBA, "reinstallation", new Object[] {_download}); return;}
ResumableSub_Reinstallation rsub = new ResumableSub_Reinstallation(null,_download);
rsub.resume(processBA, null);
}
public static class ResumableSub_Reinstallation extends BA.ResumableSub {
public ResumableSub_Reinstallation(xevolution.vrcg.devdemov2400.mainmenu parent,boolean _download) {
this.parent = parent;
this._download = _download;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
boolean _download;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="PanelDownloadInicial.Visible = True";
parent.mostCurrent._paneldownloadinicial.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="Dim res As ResumableSub = FirstInstallCompletePro";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _firstinstallcompleteprocedure(_download);
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "reinstallation"), _res);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="If Not(result)Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_result)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=28114949;
 //BA.debugLineNum = 28114949;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.G";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=28114950;
 //BA.debugLineNum = 28114950;BA.debugLine="Starter.APP_IN_EXECUTION = False";
parent.mostCurrent._starter._app_in_execution /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=28114953;
 //BA.debugLineNum = 28114953;BA.debugLine="MainPopMenuLoginChange_Click(\"\")";
_mainpopmenuloginchange_click("");
RDebugUtils.currentLine=28114955;
 //BA.debugLineNum = 28114955;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _releasedeviceauthorization() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "releasedeviceauthorization", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "releasedeviceauthorization", null));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Sub ReleaseDeviceAuthorization";
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removealllocalinfoandsqlfiles() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "removealllocalinfoandsqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "removealllocalinfoandsqlfiles", null));}
ResumableSub_RemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_RemoveAllLocalInfoAndSqlFiles(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_RemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
boolean _locares = false;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _files = null;
String _f = "";
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Dim LocaRes As Boolean = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "removealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_success) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="For Each F As String In Files";
if (true) break;

case 4:
//for
this.state = 11;
group4 = _files;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 30;
if (true) break;

case 30:
//C
this.state = 11;
if (index4 < groupLen4) {
this.state = 6;
_f = BA.ObjectToString(group4.Get(index4));}
if (true) break;

case 31:
//C
this.state = 30;
index4++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") And Not(F.To";
if (true) break;

case 7:
//if
this.state = 10;
if (_f.toLowerCase().endsWith(".info") && anywheresoftware.b4a.keywords.Common.Not(_f.toLowerCase().startsWith("firstinstall"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_f);
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
;
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=28377099;
 //BA.debugLineNum = 28377099;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=28377102;
 //BA.debugLineNum = 28377102;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "removealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 32;
return;
case 32:
//C
this.state = 15;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=28377103;
 //BA.debugLineNum = 28377103;BA.debugLine="If Success Then";
if (true) break;

case 15:
//if
this.state = 28;
if (_success) { 
this.state = 17;
}else {
this.state = 27;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=28377104;
 //BA.debugLineNum = 28377104;BA.debugLine="For Each F As String In Files";
if (true) break;

case 18:
//for
this.state = 25;
group15 = _files;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 25;
if (index15 < groupLen15) {
this.state = 20;
_f = BA.ObjectToString(group15.Get(index15));}
if (true) break;

case 34:
//C
this.state = 33;
index15++;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=28377105;
 //BA.debugLineNum = 28377105;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") And Not(F.ToL";
if (true) break;

case 21:
//if
this.state = 24;
if (_f.toLowerCase().endsWith(".sql") && anywheresoftware.b4a.keywords.Common.Not(_f.toLowerCase().startsWith("firstinstall"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=28377106;
 //BA.debugLineNum = 28377106;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_f);
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
;
RDebugUtils.currentLine=28377109;
 //BA.debugLineNum = 28377109;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=28377111;
 //BA.debugLineNum = 28377111;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=28377113;
 //BA.debugLineNum = 28377113;BA.debugLine="Return LocaRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_locares));return;};
RDebugUtils.currentLine=28377115;
 //BA.debugLineNum = 28377115;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _resetapplication() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "resetapplication", false))
	 {Debug.delegate(mostCurrent.activityBA, "resetapplication", null); return;}
ResumableSub_ResetApplication rsub = new ResumableSub_ResetApplication(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ResetApplication extends BA.ResumableSub {
public ResumableSub_ResetApplication(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgEnviarDadosVe";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgenviardadosverificacao /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "resetapplication"),(int) (500));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="Dim res As ResumableSub = UploadFilesWithFTPLocal";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _uploadfileswithftplocaldata();
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "resetapplication"), _res);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="If(finish = False)Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_finish==anywheresoftware.b4a.keywords.Common.False)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=27459592;
 //BA.debugLineNum = 27459592;BA.debugLine="MsgboxAsync(\"Erro ao enviar dados de verificação";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Erro ao enviar dados de verificação Tente Novamente.... "),BA.ObjectToCharSequence("Erro"),processBA);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=27459594;
 //BA.debugLineNum = 27459594;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=27459596;
 //BA.debugLineNum = 27459596;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=27459597;
 //BA.debugLineNum = 27459597;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadfileswithftplocaldata() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadfileswithftplocaldata", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "uploadfileswithftplocaldata", null));}
ResumableSub_UploadFilesWithFTPLocalData rsub = new ResumableSub_UploadFilesWithFTPLocalData(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadFilesWithFTPLocalData extends BA.ResumableSub {
public ResumableSub_UploadFilesWithFTPLocalData(xevolution.vrcg.devdemov2400.mainmenu parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
boolean _continua = false;
String _myfolder = "";
String _command = "";
boolean _success = false;
int _replycode = 0;
String _replystring = "";
Object _sf = null;
String _serverpath = "";
anywheresoftware.b4a.objects.collections.List _floglist = null;
int _n1 = 0;
String _ff = "";
anywheresoftware.b4a.objects.collections.List _flist = null;
int _n = 0;
int step39;
int limit39;
int step53;
int limit53;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=27721732;
 //BA.debugLineNum = 27721732;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=27721734;
 //BA.debugLineNum = 27721734;BA.debugLine="Dim Continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=27721735;
 //BA.debugLineNum = 27721735;BA.debugLine="Try";
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
RDebugUtils.currentLine=27721736;
 //BA.debugLineNum = 27721736;BA.debugLine="Dim myFolder As String = $\"/${ShareCode.APP_DOMA";
_myfolder = ("/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/import/internal/D"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._makefilename /*String*/ (mostCurrent.activityBA)))+"");
RDebugUtils.currentLine=27721737;
 //BA.debugLineNum = 27721737;BA.debugLine="myFTP.SendCommand(\"MKD\", myFolder)";
_myftp.SendCommand(processBA,"MKD",_myfolder);
RDebugUtils.currentLine=27721738;
 //BA.debugLineNum = 27721738;BA.debugLine="Wait For ftp_CommandCompleted (Command As String";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_commandcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), null);
this.state = 67;
return;
case 67:
//C
this.state = 6;
_command = (String) result[0];
_success = (Boolean) result[1];
_replycode = (Integer) result[2];
_replystring = (String) result[3];
;
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=27721740;
 //BA.debugLineNum = 27721740;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721740",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=27721741;
 //BA.debugLineNum = 27721741;BA.debugLine="Continua = False";
_continua = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=27721744;
 //BA.debugLineNum = 27721744;BA.debugLine="If (Continua) Then";

case 6:
//if
this.state = 66;
this.catchState = 0;
if ((_continua)) { 
this.state = 8;
}else {
this.state = 65;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=27721745;
 //BA.debugLineNum = 27721745;BA.debugLine="Log(myFolder)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721745",_myfolder,0);
RDebugUtils.currentLine=27721746;
 //BA.debugLineNum = 27721746;BA.debugLine="Log(Success)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721746",BA.ObjectToString(_success),0);
RDebugUtils.currentLine=27721747;
 //BA.debugLineNum = 27721747;BA.debugLine="Log(Command)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721747",_command,0);
RDebugUtils.currentLine=27721748;
 //BA.debugLineNum = 27721748;BA.debugLine="If Not(Success) Then";
if (true) break;

case 9:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(_success)) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=27721749;
 //BA.debugLineNum = 27721749;BA.debugLine="Dim myFolder As String = $\"/${ShareCode.APP_DOM";
_myfolder = ("/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/import/internal/");
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=27721751;
 //BA.debugLineNum = 27721751;BA.debugLine="myFolder = $\"${myFolder}/\"$";
_myfolder = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_myfolder))+"/");
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=27721753;
 //BA.debugLineNum = 27721753;BA.debugLine="Log(myFolder)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721753",_myfolder,0);
RDebugUtils.currentLine=27721756;
 //BA.debugLineNum = 27721756;BA.debugLine="Try";
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
RDebugUtils.currentLine=27721757;
 //BA.debugLineNum = 27721757;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3",anywheresoftware.b4a.keywords.Common.False,_myfolder+"evolutioncheck.db3");
RDebugUtils.currentLine=27721758;
 //BA.debugLineNum = 27721758;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 68;
return;
case 68:
//C
this.state = 20;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27721759;
 //BA.debugLineNum = 27721759;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721759","ftp_UploadCompleted Success = "+BA.ObjectToString(_success),0);
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=27721761;
 //BA.debugLineNum = 27721761;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721761",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=27721764;
 //BA.debugLineNum = 27721764;BA.debugLine="Try";

case 20:
//try
this.state = 25;
this.catchState = 0;
this.catchState = 24;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 25;
this.catchState = 24;
RDebugUtils.currentLine=27721765;
 //BA.debugLineNum = 27721765;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ,"worker.db",anywheresoftware.b4a.keywords.Common.False,_myfolder+"worker.db");
RDebugUtils.currentLine=27721766;
 //BA.debugLineNum = 27721766;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 69;
return;
case 69:
//C
this.state = 25;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27721767;
 //BA.debugLineNum = 27721767;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success";
anywheresoftware.b4a.keywords.Common.LogImpl("627721767","ftp_UploadCompleted Success = "+BA.ObjectToString(_success),0);
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=27721769;
 //BA.debugLineNum = 27721769;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721769",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
RDebugUtils.currentLine=27721772;
 //BA.debugLineNum = 27721772;BA.debugLine="Dim fLogList As List = File.ListFiles(Starter.Sh";
_floglist = new anywheresoftware.b4a.objects.collections.List();
_floglist = anywheresoftware.b4a.keywords.Common.File.ListFiles(parent.mostCurrent._starter._sharedfolder /*String*/ );
RDebugUtils.currentLine=27721773;
 //BA.debugLineNum = 27721773;BA.debugLine="For n1=0 To fLogList.Size-1";
if (true) break;

case 26:
//for
this.state = 39;
step39 = 1;
limit39 = (int) (_floglist.getSize()-1);
_n1 = (int) (0) ;
this.state = 70;
if (true) break;

case 70:
//C
this.state = 39;
if ((step39 > 0 && _n1 <= limit39) || (step39 < 0 && _n1 >= limit39)) this.state = 28;
if (true) break;

case 71:
//C
this.state = 70;
_n1 = ((int)(0 + _n1 + step39)) ;
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=27721774;
 //BA.debugLineNum = 27721774;BA.debugLine="Dim ff As String = fLogList.Get(n1)";
_ff = BA.ObjectToString(_floglist.Get(_n1));
RDebugUtils.currentLine=27721776;
 //BA.debugLineNum = 27721776;BA.debugLine="If (ff.EndsWith(\".log\")) Then";
if (true) break;

case 29:
//if
this.state = 38;
if ((_ff.endsWith(".log"))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=27721777;
 //BA.debugLineNum = 27721777;BA.debugLine="Try";
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
RDebugUtils.currentLine=27721778;
 //BA.debugLineNum = 27721778;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.S";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ,_ff,anywheresoftware.b4a.keywords.Common.False,_myfolder+_ff);
RDebugUtils.currentLine=27721779;
 //BA.debugLineNum = 27721779;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 72;
return;
case 72:
//C
this.state = 37;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27721780;
 //BA.debugLineNum = 27721780;BA.debugLine="Log($\"ftp_UploadCompleted  FileName = ${ff}$";
anywheresoftware.b4a.keywords.Common.LogImpl("627721780",("ftp_UploadCompleted  FileName = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ff))+"$ \" Success = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_success))+"$ "),0);
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
RDebugUtils.currentLine=27721783;
 //BA.debugLineNum = 27721783;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=27721784;
 //BA.debugLineNum = 27721784;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721784",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
;
 if (true) break;

case 38:
//C
this.state = 71;
;
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=27721789;
 //BA.debugLineNum = 27721789;BA.debugLine="Dim fList As List = File.ListFiles(Starter.Inter";
_flist = new anywheresoftware.b4a.objects.collections.List();
_flist = anywheresoftware.b4a.keywords.Common.File.ListFiles(parent.mostCurrent._starter._internalfolder /*String*/ );
RDebugUtils.currentLine=27721790;
 //BA.debugLineNum = 27721790;BA.debugLine="For n=0 To fList.Size-1";
if (true) break;

case 40:
//for
this.state = 53;
step53 = 1;
limit53 = (int) (_flist.getSize()-1);
_n = (int) (0) ;
this.state = 73;
if (true) break;

case 73:
//C
this.state = 53;
if ((step53 > 0 && _n <= limit53) || (step53 < 0 && _n >= limit53)) this.state = 42;
if (true) break;

case 74:
//C
this.state = 73;
_n = ((int)(0 + _n + step53)) ;
if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=27721791;
 //BA.debugLineNum = 27721791;BA.debugLine="Dim ff As String = fList.Get(n)";
_ff = BA.ObjectToString(_flist.Get(_n));
RDebugUtils.currentLine=27721792;
 //BA.debugLineNum = 27721792;BA.debugLine="If (ff.EndsWith(\".png\")) Then";
if (true) break;

case 43:
//if
this.state = 52;
if ((_ff.endsWith(".png"))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=27721793;
 //BA.debugLineNum = 27721793;BA.debugLine="Try";
if (true) break;

case 46:
//try
this.state = 51;
this.catchState = 50;
this.state = 48;
if (true) break;

case 48:
//C
this.state = 51;
this.catchState = 50;
RDebugUtils.currentLine=27721794;
 //BA.debugLineNum = 27721794;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.I";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._internalfolder /*String*/ ,_ff,anywheresoftware.b4a.keywords.Common.False,_myfolder+_ff);
RDebugUtils.currentLine=27721795;
 //BA.debugLineNum = 27721795;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 75;
return;
case 75:
//C
this.state = 51;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27721796;
 //BA.debugLineNum = 27721796;BA.debugLine="Log($\"ftp_UploadCompleted  FileName = ${ff}$";
anywheresoftware.b4a.keywords.Common.LogImpl("627721796",("ftp_UploadCompleted  FileName = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ff))+"$ \" Success = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_success))+"$ "),0);
 if (true) break;

case 50:
//C
this.state = 51;
this.catchState = 0;
RDebugUtils.currentLine=27721798;
 //BA.debugLineNum = 27721798;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=27721799;
 //BA.debugLineNum = 27721799;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721799",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
;
 if (true) break;

case 52:
//C
this.state = 74;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=27721803;
 //BA.debugLineNum = 27721803;BA.debugLine="Try";

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
RDebugUtils.currentLine=27721804;
 //BA.debugLineNum = 27721804;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3",anywheresoftware.b4a.keywords.Common.False,_myfolder+"evolutioncheck.db3");
RDebugUtils.currentLine=27721805;
 //BA.debugLineNum = 27721805;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 76;
return;
case 76:
//C
this.state = 58;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27721806;
 //BA.debugLineNum = 27721806;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721806","ftp_UploadCompleted Success = "+BA.ObjectToString(_success),0);
 if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
RDebugUtils.currentLine=27721808;
 //BA.debugLineNum = 27721808;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721808",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=27721811;
 //BA.debugLineNum = 27721811;BA.debugLine="Try";

case 58:
//try
this.state = 63;
this.catchState = 0;
this.catchState = 62;
this.state = 60;
if (true) break;

case 60:
//C
this.state = 63;
this.catchState = 62;
RDebugUtils.currentLine=27721812;
 //BA.debugLineNum = 27721812;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sha";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ,"worker.db",anywheresoftware.b4a.keywords.Common.False,_myfolder+"worker.db");
RDebugUtils.currentLine=27721813;
 //BA.debugLineNum = 27721813;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadfileswithftplocaldata"), _sf);
this.state = 77;
return;
case 77:
//C
this.state = 63;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=27721814;
 //BA.debugLineNum = 27721814;BA.debugLine="Log(\"ftp_UploadCompleted Success = \" & Success";
anywheresoftware.b4a.keywords.Common.LogImpl("627721814","ftp_UploadCompleted Success = "+BA.ObjectToString(_success),0);
 if (true) break;

case 62:
//C
this.state = 63;
this.catchState = 0;
RDebugUtils.currentLine=27721816;
 //BA.debugLineNum = 27721816;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("627721816",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 63:
//C
this.state = 66;
this.catchState = 0;
;
RDebugUtils.currentLine=27721818;
 //BA.debugLineNum = 27721818;BA.debugLine="myFTP.Close";
_myftp.Close();
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=27721820;
 //BA.debugLineNum = 27721820;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=27721821;
 //BA.debugLineNum = 27721821;BA.debugLine="MsgboxAsync(\"Erro de comunicação! Operação cance";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Erro de comunicação! Operação cancelada."),BA.ObjectToCharSequence("Alerta"),processBA);
RDebugUtils.currentLine=27721822;
 //BA.debugLineNum = 27721822;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 66:
//C
this.state = -1;
;
RDebugUtils.currentLine=27721825;
 //BA.debugLineNum = 27721825;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=27721826;
 //BA.debugLineNum = 27721826;BA.debugLine="End Sub";
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
public static String  _returnedfromscanner() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "returnedfromscanner", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "returnedfromscanner", null));}
int _i = 0;
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Sub returnedFromScanner";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Log(\"returnedFromScanner\")";
anywheresoftware.b4a.keywords.Common.LogImpl("627394049","returnedFromScanner",0);
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="For i=0 To ShareCode.ScanList.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="If Utils.NNE(ShareCode.ScanList.Get(i)) Then Log";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)))) { 
anywheresoftware.b4a.keywords.Common.LogImpl("627394051",BA.ObjectToString(mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),0);};
 }
};
RDebugUtils.currentLine=27394053;
 //BA.debugLineNum = 27394053;BA.debugLine="End Sub";
return "";
}
public static String  _returnfrompushrequest(int _status,String _thecode) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "returnfrompushrequest", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "returnfrompushrequest", new Object[] {_status,_thecode}));}
xevolution.vrcg.devdemov2400.appdialogs _filterparams1 = null;
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Sub ReturnFromPushRequest(status As Int, theCode A";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Log(\"ReturnFromPushRequest\")";
anywheresoftware.b4a.keywords.Common.LogImpl("626345473","ReturnFromPushRequest",0);
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="If (status = 1) And Utils.NNE(theCode) Then";
if ((_status==1) && mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_thecode)) { 
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="Dim FilterParams1 As AppDialogs";
_filterparams1 = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=26345476;
 //BA.debugLineNum = 26345476;BA.debugLine="FilterParams1.Initialize";
_filterparams1._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=26345477;
 //BA.debugLineNum = 26345477;BA.debugLine="FilterParams1.getRequestSelectDialog(Activity, \"";
_filterparams1._getrequestselectdialog /*void*/ (null,mostCurrent._activity,(Object)("MainMenu"),"Seleccionar intervenção",(int) (0));
 };
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="End Sub";
return "";
}
public static void  _returnfrompushrequestselect(int _status,String _thecode) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "returnfrompushrequestselect", false))
	 {Debug.delegate(mostCurrent.activityBA, "returnfrompushrequestselect", new Object[] {_status,_thecode}); return;}
ResumableSub_ReturnFromPushRequestSelect rsub = new ResumableSub_ReturnFromPushRequestSelect(null,_status,_thecode);
rsub.resume(processBA, null);
}
public static class ResumableSub_ReturnFromPushRequestSelect extends BA.ResumableSub {
public ResumableSub_ReturnFromPushRequestSelect(xevolution.vrcg.devdemov2400.mainmenu parent,int _status,String _thecode) {
this.parent = parent;
this._status = _status;
this._thecode = _thecode;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
int _status;
String _thecode;
String _updsql = "";
int _updtype = 0;
String _updtag = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="If (status = 1) And Utils.NNE(theCode) Then";
if (true) break;

case 1:
//if
this.state = 27;
if ((_status==1) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_thecode)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="Dim updSQL As String = \"\"";
_updsql = "";
RDebugUtils.currentLine=26411013;
 //BA.debugLineNum = 26411013;BA.debugLine="Dim updType As Int = 0";
_updtype = (int) (0);
RDebugUtils.currentLine=26411014;
 //BA.debugLineNum = 26411014;BA.debugLine="Dim updTag As String = Utils.IfNullOrEmpty(Share";
_updtag = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_userteam /*String*/ ,parent.mostCurrent._sharecode._sess_user /*String*/ );
RDebugUtils.currentLine=26411015;
 //BA.debugLineNum = 26411015;BA.debugLine="If (Utils.NNE(ShareCode.SESS_UserTeam)) Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_userteam /*String*/ ))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=26411016;
 //BA.debugLineNum = 26411016;BA.debugLine="Dim updSQL As String = $\"Update dta_requests se";
_updsql = ("Update dta_requests set team_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_userteam /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thecode))+"'");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=26411018;
 //BA.debugLineNum = 26411018;BA.debugLine="Dim updSQL As String = $\"Update dta_requests se";
_updsql = ("Update dta_requests set technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thecode))+"'");
RDebugUtils.currentLine=26411019;
 //BA.debugLineNum = 26411019;BA.debugLine="updType = 1";
_updtype = (int) (1);
 if (true) break;
;
RDebugUtils.currentLine=26411021;
 //BA.debugLineNum = 26411021;BA.debugLine="If Utils.NNE(updSQL) Then";

case 9:
//if
this.state = 26;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_updsql)) { 
this.state = 11;
}else {
this.state = 25;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=26411022;
 //BA.debugLineNum = 26411022;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(updSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_updsql);
RDebugUtils.currentLine=26411025;
 //BA.debugLineNum = 26411025;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDate";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=26411026;
 //BA.debugLineNum = 26411026;BA.debugLine="Private sACLALatitude As String = Utils.IfNullO";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=26411027;
 //BA.debugLineNum = 26411027;BA.debugLine="Private sACLALongitude As String = Utils.IfNull";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=26411029;
 //BA.debugLineNum = 26411029;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26411030;
 //BA.debugLineNum = 26411030;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=26411031;
 //BA.debugLineNum = 26411031;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=26411032;
 //BA.debugLineNum = 26411032;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=26411033;
 //BA.debugLineNum = 26411033;BA.debugLine="params.Put(\"ACLARequest\", theCode)";
_params.Put((Object)("ACLARequest"),(Object)(_thecode));
RDebugUtils.currentLine=26411034;
 //BA.debugLineNum = 26411034;BA.debugLine="params.Put(\"ACLARelation\", updType)";
_params.Put((Object)("ACLARelation"),(Object)(_updtype));
RDebugUtils.currentLine=26411035;
 //BA.debugLineNum = 26411035;BA.debugLine="params.Put(\"ACLATagcode\", updTag)";
_params.Put((Object)("ACLATagcode"),(Object)(_updtag));
RDebugUtils.currentLine=26411037;
 //BA.debugLineNum = 26411037;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=26411038;
 //BA.debugLineNum = 26411038;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=26411039;
 //BA.debugLineNum = 26411039;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=26411040;
 //BA.debugLineNum = 26411040;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLSessUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=26411041;
 //BA.debugLineNum = 26411041;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=26411042;
 //BA.debugLineNum = 26411042;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=26411043;
 //BA.debugLineNum = 26411043;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=26411044;
 //BA.debugLineNum = 26411044;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=26411045;
 //BA.debugLineNum = 26411045;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=26411046;
 //BA.debugLineNum = 26411046;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=26411047;
 //BA.debugLineNum = 26411047;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=26411049;
 //BA.debugLineNum = 26411049;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/request/owner/change");
RDebugUtils.currentLine=26411050;
 //BA.debugLineNum = 26411050;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPL";
if (true) break;

case 12:
//if
this.state = 23;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 14;
}else {
this.state = 22;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=26411051;
 //BA.debugLineNum = 26411051;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 15:
//if
this.state = 20;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=26411052;
 //BA.debugLineNum = 26411052;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", theCode";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,mainmenu.getObject(),_url,"",_thecode);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=26411054;
 //BA.debugLineNum = 26411054;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWor";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=26411055;
 //BA.debugLineNum = 26411055;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 20:
//C
this.state = 23;
;
RDebugUtils.currentLine=26411057;
 //BA.debugLineNum = 26411057;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "returnfrompushrequestselect"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=26411059;
 //BA.debugLineNum = 26411059;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=26411060;
 //BA.debugLineNum = 26411060;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 23:
//C
this.state = 26;
;
RDebugUtils.currentLine=26411063;
 //BA.debugLineNum = 26411063;BA.debugLine="MsgboxAsync(ShareCode.AvisoOperacaoConcluida, S";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisooperacaoconcluida /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalnotetitle /*String*/ ),processBA);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=26411066;
 //BA.debugLineNum = 26411066;BA.debugLine="MsgboxAsync(ShareCode.maimenuproblemaatribuicao";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._maimenuproblemaatribuicao /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=26411071;
 //BA.debugLineNum = 26411071;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _runsyncmanual(String _date2watch,boolean _syncdates) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runsyncmanual", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "runsyncmanual", new Object[] {_date2watch,_syncdates}));}
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub RunSyncManual(date2watch As String, SyncDates";
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="CallSubDelayed3(DataUpdate,\"RunSync\",date2watch,";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._dataupdate.getObject()),"RunSync",(Object)(_date2watch),(Object)(_syncdates));
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="End Sub";
return "";
}
public static String  _sendlargesms(String _destination,String _message) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendlargesms", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sendlargesms", new Object[] {_destination,_message}));}
anywheresoftware.b4j.object.JavaObject _ctxt = null;
String _extra = "";
anywheresoftware.b4j.object.JavaObject _smsmanager = null;
anywheresoftware.b4j.object.JavaObject _parts = null;
int _size = 0;
anywheresoftware.b4a.objects.IntentWrapper _i = null;
anywheresoftware.b4j.object.JavaObject _pi = null;
anywheresoftware.b4a.objects.IntentWrapper _i2 = null;
anywheresoftware.b4j.object.JavaObject _pi2 = null;
anywheresoftware.b4j.object.JavaObject _al = null;
anywheresoftware.b4j.object.JavaObject _al2 = null;
int _ii = 0;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Sub SendLargeSms(Destination As String, Message As";
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="Dim Extra As String = \"extra\"";
_extra = "extra";
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(processBA);
RDebugUtils.currentLine=26869765;
 //BA.debugLineNum = 26869765;BA.debugLine="Dim smsManager As JavaObject";
_smsmanager = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26869766;
 //BA.debugLineNum = 26869766;BA.debugLine="smsManager = smsManager.InitializeStatic(\"android";
_smsmanager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_smsmanager.InitializeStatic("android.telephony.SmsManager").RunMethod("getDefault",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=26869767;
 //BA.debugLineNum = 26869767;BA.debugLine="Dim parts As JavaObject = smsManager.RunMethod(\"d";
_parts = new anywheresoftware.b4j.object.JavaObject();
_parts = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_smsmanager.RunMethod("divideMessage",(Object[])(new String[]{_message}))));
RDebugUtils.currentLine=26869768;
 //BA.debugLineNum = 26869768;BA.debugLine="Dim size As Int = parts.RunMethod(\"size\", Null)";
_size = (int)(BA.ObjectToNumber(_parts.RunMethod("size",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=26869770;
 //BA.debugLineNum = 26869770;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=26869771;
 //BA.debugLineNum = 26869771;BA.debugLine="i.Initialize(\"b4a.smssent\", \"\")";
_i.Initialize("b4a.smssent","");
RDebugUtils.currentLine=26869772;
 //BA.debugLineNum = 26869772;BA.debugLine="i.PutExtra(\"phone\", Destination)";
_i.PutExtra("phone",(Object)(_destination));
RDebugUtils.currentLine=26869773;
 //BA.debugLineNum = 26869773;BA.debugLine="i.PutExtra(\"message_id\", Extra)";
_i.PutExtra("message_id",(Object)(_extra));
RDebugUtils.currentLine=26869774;
 //BA.debugLineNum = 26869774;BA.debugLine="Dim pi As JavaObject";
_pi = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26869775;
 //BA.debugLineNum = 26869775;BA.debugLine="pi = pi.InitializeStatic(\"android.app.PendingInte";
_pi = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pi.InitializeStatic("android.app.PendingIntent").RunMethod("getBroadcast",new Object[]{(Object)(_ctxt.getObject()),(Object)(0),(Object)(_i.getObject()),(Object)(134217728)})));
RDebugUtils.currentLine=26869778;
 //BA.debugLineNum = 26869778;BA.debugLine="Dim i2 As Intent";
_i2 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=26869779;
 //BA.debugLineNum = 26869779;BA.debugLine="i2.Initialize(\"b4a.smsdelivered\", \"\")";
_i2.Initialize("b4a.smsdelivered","");
RDebugUtils.currentLine=26869780;
 //BA.debugLineNum = 26869780;BA.debugLine="i2.PutExtra(\"phone\", Destination)";
_i2.PutExtra("phone",(Object)(_destination));
RDebugUtils.currentLine=26869781;
 //BA.debugLineNum = 26869781;BA.debugLine="i2.PutExtra(\"message_id\", Extra)";
_i2.PutExtra("message_id",(Object)(_extra));
RDebugUtils.currentLine=26869782;
 //BA.debugLineNum = 26869782;BA.debugLine="Dim pi2 As JavaObject";
_pi2 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26869783;
 //BA.debugLineNum = 26869783;BA.debugLine="pi2 = pi2.InitializeStatic(\"android.app.PendingIn";
_pi2 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pi2.InitializeStatic("android.app.PendingIntent").RunMethod("getBroadcast",new Object[]{(Object)(_ctxt.getObject()),(Object)(0),(Object)(_i2.getObject()),(Object)(134217728)})));
RDebugUtils.currentLine=26869786;
 //BA.debugLineNum = 26869786;BA.debugLine="Dim al, al2 As JavaObject";
_al = new anywheresoftware.b4j.object.JavaObject();
_al2 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=26869787;
 //BA.debugLineNum = 26869787;BA.debugLine="al.InitializeNewInstance(\"java.util.ArrayList\", N";
_al.InitializeNewInstance("java.util.ArrayList",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=26869788;
 //BA.debugLineNum = 26869788;BA.debugLine="al2.InitializeNewInstance(\"java.util.ArrayList\",";
_al2.InitializeNewInstance("java.util.ArrayList",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=26869789;
 //BA.debugLineNum = 26869789;BA.debugLine="For ii = 0 To size - 2";
{
final int step23 = 1;
final int limit23 = (int) (_size-2);
_ii = (int) (0) ;
for (;_ii <= limit23 ;_ii = _ii + step23 ) {
RDebugUtils.currentLine=26869790;
 //BA.debugLineNum = 26869790;BA.debugLine="al.RunMethod(\"add\", Array(Null))";
_al.RunMethod("add",new Object[]{anywheresoftware.b4a.keywords.Common.Null});
RDebugUtils.currentLine=26869791;
 //BA.debugLineNum = 26869791;BA.debugLine="al2.RunMethod(\"add\", Array(Null))";
_al2.RunMethod("add",new Object[]{anywheresoftware.b4a.keywords.Common.Null});
 }
};
RDebugUtils.currentLine=26869793;
 //BA.debugLineNum = 26869793;BA.debugLine="al.RunMethod(\"add\", Array(pi))";
_al.RunMethod("add",new Object[]{(Object)(_pi.getObject())});
RDebugUtils.currentLine=26869794;
 //BA.debugLineNum = 26869794;BA.debugLine="al2.RunMethod(\"add\", Array(pi2))";
_al2.RunMethod("add",new Object[]{(Object)(_pi2.getObject())});
RDebugUtils.currentLine=26869795;
 //BA.debugLineNum = 26869795;BA.debugLine="smsManager.RunMethod(\"sendMultipartTextMessage\",";
_smsmanager.RunMethod("sendMultipartTextMessage",new Object[]{(Object)(_destination),anywheresoftware.b4a.keywords.Common.Null,(Object)(_parts.getObject()),(Object)(_al.getObject()),(Object)(_al2.getObject())});
RDebugUtils.currentLine=26869796;
 //BA.debugLineNum = 26869796;BA.debugLine="End Sub";
return "";
}
public static String  _sendsms(String _sms_2number,String _sms_body) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendsms", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sendsms", new Object[] {_sms_2number,_sms_body}));}
anywheresoftware.b4a.objects.IntentWrapper _in = null;
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Sub SendSMS(sms_2number As String,sms_body As Stri";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Dim In As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="In.Initialize(In.ACTION_VIEW, \"sms:\" & sms_2numbe";
_in.Initialize(_in.ACTION_VIEW,"sms:"+_sms_2number);
RDebugUtils.currentLine=26804227;
 //BA.debugLineNum = 26804227;BA.debugLine="In.PutExtra(\"sms_body\", sms_body)";
_in.PutExtra("sms_body",(Object)(_sms_body));
RDebugUtils.currentLine=26804228;
 //BA.debugLineNum = 26804228;BA.debugLine="StartActivity(In)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_in.getObject()));
RDebugUtils.currentLine=26804229;
 //BA.debugLineNum = 26804229;BA.debugLine="End Sub";
return "";
}
public static String  _starttheactivity(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttheactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starttheactivity", new Object[] {_firsttime}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub StartTheActivity(FirstTime As Boolean)";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Log(\"chegou\")";
anywheresoftware.b4a.keywords.Common.LogImpl("623461889","chegou",0);
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="End Sub";
return "";
}
public static String  _testsms_click(String _menuname) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "testsms_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "testsms_click", new Object[] {_menuname}));}
String _extradata2send = "";
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Sub TestSMS_Click(Menuname As String)";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="Dim ExtraData2Send As String = $\"${ShareCode.APPL";
_extradata2send = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_username /*String*/ ))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"");
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="CallSub3(Me, \"SendLargeSms\",\"912193296\",$\"${Extra";
anywheresoftware.b4a.keywords.Common.CallSubDebug3(processBA,mainmenu.getObject(),"SendLargeSms",(Object)("912193296"),(Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_extradata2send))+"Boa tarde."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Hora de chegada aproximada em cerca de 15 minutos."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Obrigado!")));
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="End Sub";
return "";
}
public static String  _unlockscreen(int _nextsetp,int _counter) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unlockscreen", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unlockscreen", new Object[] {_nextsetp,_counter}));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Sub UnlockScreen(nextSetp As Int, counter As Int)";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="LockPanel.Visible = False";
mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="ShareCode.MainLockPanel = LockPanel.Visible";
mostCurrent._sharecode._mainlockpanel /*boolean*/  = mostCurrent._lockpanel.getVisible();
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="End Sub";
return "";
}
public static String  _updatemedata(String _data) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemedata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemedata", new Object[] {_data}));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Sub UpdateMeData(data As String)";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="If (LabelAppInfo.IsInitialized) Then LabelAppInfo";
if ((mostCurrent._labelappinfo.IsInitialized())) { 
mostCurrent._labelappinfo.setText(BA.ObjectToCharSequence(_data));};
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="End Sub";
return "";
}
public static String  _updateservicetimer_tick() throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateservicetimer_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateservicetimer_tick", null));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub UpdateServiceTimer_Tick";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Log(\"UpdateServiceTimer_Tick\")";
anywheresoftware.b4a.keywords.Common.LogImpl("623396353","UpdateServiceTimer_Tick",0);
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="End Sub";
return "";
}
public static void  _uploadnewrequestrel2server(String _tagcode,anywheresoftware.b4a.objects.collections.Map _items) throws Exception{
RDebugUtils.currentModule="mainmenu";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequestrel2server", false))
	 {Debug.delegate(mostCurrent.activityBA, "uploadnewrequestrel2server", new Object[] {_tagcode,_items}); return;}
ResumableSub_UploadNewRequestRel2Server rsub = new ResumableSub_UploadNewRequestRel2Server(null,_tagcode,_items);
rsub.resume(processBA, null);
}
public static class ResumableSub_UploadNewRequestRel2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequestRel2Server(xevolution.vrcg.devdemov2400.mainmenu parent,String _tagcode,anywheresoftware.b4a.objects.collections.Map _items) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
}
xevolution.vrcg.devdemov2400.mainmenu parent;
String _tagcode;
anywheresoftware.b4a.objects.collections.Map _items;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="mainmenu";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=24772620;
 //BA.debugLineNum = 24772620;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=24772621;
 //BA.debugLineNum = 24772621;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=24772622;
 //BA.debugLineNum = 24772622;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=24772623;
 //BA.debugLineNum = 24772623;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=24772624;
 //BA.debugLineNum = 24772624;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=24772625;
 //BA.debugLineNum = 24772625;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=24772626;
 //BA.debugLineNum = 24772626;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=24772627;
 //BA.debugLineNum = 24772627;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=24772629;
 //BA.debugLineNum = 24772629;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=24772630;
 //BA.debugLineNum = 24772630;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=24772631;
 //BA.debugLineNum = 24772631;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=24772633;
 //BA.debugLineNum = 24772633;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/rel-new");
RDebugUtils.currentLine=24772634;
 //BA.debugLineNum = 24772634;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=24772635;
 //BA.debugLineNum = 24772635;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=24772636;
 //BA.debugLineNum = 24772636;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",mainmenu.getObject());
RDebugUtils.currentLine=24772637;
 //BA.debugLineNum = 24772637;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=24772638;
 //BA.debugLineNum = 24772638;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=24772639;
 //BA.debugLineNum = 24772639;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "mainmenu", "uploadnewrequestrel2server"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=24772640;
 //BA.debugLineNum = 24772640;BA.debugLine="If Job.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=24772641;
 //BA.debugLineNum = 24772641;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("624772641",_job._getstring /*String*/ (null),0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=24772643;
 //BA.debugLineNum = 24772643;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=24772644;
 //BA.debugLineNum = 24772644;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=24772646;
 //BA.debugLineNum = 24772646;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=24772648;
 //BA.debugLineNum = 24772648;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=24772649;
 //BA.debugLineNum = 24772649;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=24772651;
 //BA.debugLineNum = 24772651;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}