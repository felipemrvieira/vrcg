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

public class report extends Activity implements B4AActivity{
	public static report mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.report");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (report).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.report");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.report", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (report) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (report) Resume **");
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
		return report.class;
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
            BA.LogInfo("** Activity (report) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (report) Pause event (activity is not paused). **");
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
            report mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (report) Resume **");
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
public static String _mypositionlat = "";
public static String _mypositionlon = "";
public static anywheresoftware.b4a.objects.Timer _timestart = null;
public static anywheresoftware.b4a.phone.Phone _device = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbasepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottomline = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottompanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _listslabelinfo = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _liststopbar = null;
public com.simplysoftware.base64convert.base64convert _base64con = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butwarehouses = null;
public com.jakes.menuonviews.menuonanyview _mpopmenu = null;
public com.jakes.menuonviews.menuonanyview _mdocpopmenu = null;
public com.jakes.menuonviews.menuonanyview _meqippopmenu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butdocfilter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butequipfilter = null;
public anywheresoftware.b4a.objects.collections.List _userdocuments = null;
public anywheresoftware.b4a.objects.collections.List _userequipments = null;
public androidchartswrapper.pieChartWrapper _pc1 = null;
public xevolution.vrcg.devdemov2400.b4xcombobox2 _listperiods = null;
public anywheresoftware.b4a.objects.LabelWrapper _startdateselect = null;
public anywheresoftware.b4a.objects.LabelWrapper _enddateselect = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butdatefilter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcancelfilter = null;
public anywheresoftware.b4a.objects.collections.List _adps = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpidescription = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpivalue = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpivaluecompare = null;
public b4a.example3.customlistview _kpilist = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _kpiupdateprogress = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeluserlate = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeluseravarage = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelusernotmade = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelusermade = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelusermade = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneluserlate = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneluseravarage = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelusernotmade = null;
public androidchartswrapper.pieChartWrapper _pc0 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _dialogreqperiodtype = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqstartdate = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _dialogreqenddate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqstartdate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreqenddate = null;
public static String _sdatefiltervalue = "";
public static String _edatefiltervalue = "";
public static int _periodfiltervalue = 0;
public b4a.example3.customlistview _kpilistall = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonactionpause = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelestadopedidos = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelperiodo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatainicio = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatafim = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpidescricao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelvalor = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpiestadopedidos = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpioutrosindicadores = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpivalor = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelkpicomparacao = null;
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
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=158007296;
 //BA.debugLineNum = 158007296;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=158007297;
 //BA.debugLineNum = 158007297;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=158007298;
 //BA.debugLineNum = 158007298;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=158007300;
 //BA.debugLineNum = 158007300;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=158007302;
 //BA.debugLineNum = 158007302;BA.debugLine="Activity.LoadLayout(\"reportsLayout\")";
mostCurrent._activity.LoadLayout("reportsLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=158007304;
 //BA.debugLineNum = 158007304;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_KPI";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainoption_kpi /*String*/ .toUpperCase()));
RDebugUtils.currentLine=158007306;
 //BA.debugLineNum = 158007306;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=158007307;
 //BA.debugLineNum = 158007307;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiview\", Shar";
mostCurrent._liststabpanel.LoadLayout("reports_kpiview",BA.ObjectToCharSequence(mostCurrent._sharecode._reportsindicadoresdia /*String*/ ));
RDebugUtils.currentLine=158007308;
 //BA.debugLineNum = 158007308;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiviewAll\", S";
mostCurrent._liststabpanel.LoadLayout("reports_kpiviewAll",BA.ObjectToCharSequence(mostCurrent._sharecode._reportsindicadorescomparacao /*String*/ ));
 }else {
RDebugUtils.currentLine=158007310;
 //BA.debugLineNum = 158007310;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiview\", Shar";
mostCurrent._liststabpanel.LoadLayout("reports_kpiview",BA.ObjectToCharSequence(mostCurrent._sharecode._reportsindicadoresdia /*String*/ ));
RDebugUtils.currentLine=158007311;
 //BA.debugLineNum = 158007311;BA.debugLine="listsTabPanel.LoadLayout(\"reports_kpiviewAll\", S";
mostCurrent._liststabpanel.LoadLayout("reports_kpiviewAll",BA.ObjectToCharSequence(mostCurrent._sharecode._reportsindicadorescomparacao /*String*/ ));
 };
RDebugUtils.currentLine=158007317;
 //BA.debugLineNum = 158007317;BA.debugLine="LabelDataInicio.Text = ShareCode.AppDialogsFilter";
mostCurrent._labeldatainicio.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._appdialogsfilterlabeldatainicio /*String*/ ));
RDebugUtils.currentLine=158007318;
 //BA.debugLineNum = 158007318;BA.debugLine="LabelDataFim.Text = ShareCode.AppDialogsFilterLab";
mostCurrent._labeldatafim.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._appdialogsfilterlabeldatafim /*String*/ ));
RDebugUtils.currentLine=158007319;
 //BA.debugLineNum = 158007319;BA.debugLine="LabelEstadoPedidos.Text = ShareCode.reportsLabelE";
mostCurrent._labelestadopedidos.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelestadopedidos /*String*/ ));
RDebugUtils.currentLine=158007320;
 //BA.debugLineNum = 158007320;BA.debugLine="LabelPeriodo.Text = ShareCode.reportsLabelPeriodo";
mostCurrent._labelperiodo.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelperiodo /*String*/ ));
RDebugUtils.currentLine=158007321;
 //BA.debugLineNum = 158007321;BA.debugLine="LabelKPIDescricao.Text = ShareCode.reportsLabelKP";
mostCurrent._labelkpidescricao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelkpidescricao /*String*/ ));
RDebugUtils.currentLine=158007322;
 //BA.debugLineNum = 158007322;BA.debugLine="LabelValor.Text = ShareCode.reportsLabelValor";
mostCurrent._labelvalor.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelvalor /*String*/ ));
RDebugUtils.currentLine=158007324;
 //BA.debugLineNum = 158007324;BA.debugLine="LabelKPIEstadoPedidos.text = ShareCode.reportsLab";
mostCurrent._labelkpiestadopedidos.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelestadopedidos /*String*/ ));
RDebugUtils.currentLine=158007325;
 //BA.debugLineNum = 158007325;BA.debugLine="LabelKPIOutrosIndicadores.Text = ShareCode.report";
mostCurrent._labelkpioutrosindicadores.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelkpioutrosindicadores /*String*/ ));
RDebugUtils.currentLine=158007326;
 //BA.debugLineNum = 158007326;BA.debugLine="LabelKPIValor.Text = ShareCode.reportsLabelValor";
mostCurrent._labelkpivalor.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelvalor /*String*/ ));
RDebugUtils.currentLine=158007327;
 //BA.debugLineNum = 158007327;BA.debugLine="LabelKPIComparacao.Text = ShareCode.reportsLabelK";
mostCurrent._labelkpicomparacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._reportslabelkpicomparacao /*String*/ ));
RDebugUtils.currentLine=158007336;
 //BA.debugLineNum = 158007336;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group25 = mostCurrent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,mostCurrent._liststabpanel);
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group25.Get(index25)));
RDebugUtils.currentLine=158007339;
 //BA.debugLineNum = 158007339;BA.debugLine="lbl.Width = 50%x";
_lbl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA));
 }
};
RDebugUtils.currentLine=158007341;
 //BA.debugLineNum = 158007341;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
mostCurrent._utils._maketabpaneleffect /*String*/ (mostCurrent.activityBA,mostCurrent._colortabpanel,mostCurrent._consts._colormaindarker /*int*/ ,mostCurrent._consts._colorsub /*int*/ );
RDebugUtils.currentLine=158007347;
 //BA.debugLineNum = 158007347;BA.debugLine="adps = Array(StartDateSelect, EndDateSelect)";
mostCurrent._adps = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._startdateselect.getObject()),(Object)(mostCurrent._enddateselect.getObject())});
RDebugUtils.currentLine=158007349;
 //BA.debugLineNum = 158007349;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 };
RDebugUtils.currentLine=158007352;
 //BA.debugLineNum = 158007352;BA.debugLine="Base64Con.Initialize";
mostCurrent._base64con._initialize(processBA);
RDebugUtils.currentLine=158007353;
 //BA.debugLineNum = 158007353;BA.debugLine="Utils.SetProgressDrawableExt(KPIUpdateProgress,\"T";
mostCurrent._utils._setprogressdrawableext /*String*/ (mostCurrent.activityBA,mostCurrent._kpiupdateprogress,"TOP_BOTTOM",new int[]{mostCurrent._consts._colorblue /*int*/ ,mostCurrent._consts._colorblue /*int*/ },(int) (0));
RDebugUtils.currentLine=158007354;
 //BA.debugLineNum = 158007354;BA.debugLine="KPIUpdateProgress.Progress = 0";
mostCurrent._kpiupdateprogress.setProgress((int) (0));
RDebugUtils.currentLine=158007355;
 //BA.debugLineNum = 158007355;BA.debugLine="TimeStart.Initialize(\"TimeStart\",10)";
_timestart.Initialize(processBA,"TimeStart",(long) (10));
RDebugUtils.currentLine=158007356;
 //BA.debugLineNum = 158007356;BA.debugLine="TimeStart.Enabled = False";
_timestart.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=158007358;
 //BA.debugLineNum = 158007358;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
mostCurrent._labelversion.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=158007359;
 //BA.debugLineNum = 158007359;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=158007360;
 //BA.debugLineNum = 158007360;BA.debugLine="If ShareCode.USR_STATE = 0 Then";
if (mostCurrent._sharecode._usr_state /*int*/ ==0) { 
RDebugUtils.currentLine=158007361;
 //BA.debugLineNum = 158007361;BA.debugLine="ButtonUserUnavailable.Visible = True";
mostCurrent._buttonuserunavailable.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=158007362;
 //BA.debugLineNum = 158007362;BA.debugLine="ButtonUserUnavailable.Enabled = True";
mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=158007364;
 //BA.debugLineNum = 158007364;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=158007365;
 //BA.debugLineNum = 158007365;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=158007366;
 //BA.debugLineNum = 158007366;BA.debugLine="End Sub";
return "";
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=158072832;
 //BA.debugLineNum = 158072832;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=158072833;
 //BA.debugLineNum = 158072833;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
mostCurrent._mainlabeloptlists.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=158072834;
 //BA.debugLineNum = 158072834;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=158072835;
 //BA.debugLineNum = 158072835;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=158072836;
 //BA.debugLineNum = 158072836;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
 };
RDebugUtils.currentLine=158072838;
 //BA.debugLineNum = 158072838;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
anywheresoftware.b4a.keywords.Common.LogImpl("6158072838",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=158072839;
 //BA.debugLineNum = 158072839;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=158072840;
 //BA.debugLineNum = 158072840;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
RDebugUtils.currentLine=158072845;
 //BA.debugLineNum = 158072845;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=158072846;
 //BA.debugLineNum = 158072846;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._liststabpanel));
RDebugUtils.currentLine=158072847;
 //BA.debugLineNum = 158072847;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.GetField("tabStrip")));
RDebugUtils.currentLine=158072849;
 //BA.debugLineNum = 158072849;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
_jo.RunMethod("setIndicatorColor",new Object[]{(Object)(mostCurrent._consts._colormain /*int*/ )});
RDebugUtils.currentLine=158072850;
 //BA.debugLineNum = 158072850;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.report parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.report parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="report";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=158138369;
 //BA.debugLineNum = 158138369;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
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
RDebugUtils.currentLine=158138370;
 //BA.debugLineNum = 158138370;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=158138371;
 //BA.debugLineNum = 158138371;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=158138372;
 //BA.debugLineNum = 158138372;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=158138373;
 //BA.debugLineNum = 158138373;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=158138374;
 //BA.debugLineNum = 158138374;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=158138375;
 //BA.debugLineNum = 158138375;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "report", "windowstatusupdate"),(int) (500));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=158138376;
 //BA.debugLineNum = 158138376;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=158138378;
 //BA.debugLineNum = 158138378;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=158138379;
 //BA.debugLineNum = 158138379;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=158138380;
 //BA.debugLineNum = 158138380;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=158138382;
 //BA.debugLineNum = 158138382;BA.debugLine="ButtonAppNetwork.Enabled = False";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=158138383;
 //BA.debugLineNum = 158138383;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=158138384;
 //BA.debugLineNum = 158138384;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=158138385;
 //BA.debugLineNum = 158138385;BA.debugLine="ButtonAppNetwork.Enabled = True";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=158138386;
 //BA.debugLineNum = 158138386;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=158138388;
 //BA.debugLineNum = 158138388;BA.debugLine="ButtonUserUnavailable.Enabled = False";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=158138389;
 //BA.debugLineNum = 158138389;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=158138390;
 //BA.debugLineNum = 158138390;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((parent.mostCurrent._sharecode._usr_state /*int*/ ==0)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=158138391;
 //BA.debugLineNum = 158138391;BA.debugLine="ButtonUserUnavailable.Enabled = True";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=158138392;
 //BA.debugLineNum = 158138392;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=158138395;
 //BA.debugLineNum = 158138395;BA.debugLine="ButtonActionPause.Enabled = False";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=158138396;
 //BA.debugLineNum = 158138396;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=158138398;
 //BA.debugLineNum = 158138398;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=158138399;
 //BA.debugLineNum = 158138399;BA.debugLine="ButtonActionPause.Enabled = True";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=158138400;
 //BA.debugLineNum = 158138400;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=158138403;
 //BA.debugLineNum = 158138403;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=158203904;
 //BA.debugLineNum = 158203904;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=158203905;
 //BA.debugLineNum = 158203905;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=158203906;
 //BA.debugLineNum = 158203906;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=158203908;
 //BA.debugLineNum = 158203908;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=158203909;
 //BA.debugLineNum = 158203909;BA.debugLine="End Sub";
return false;
}
public static String  _listsbuttonclose_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=158859264;
 //BA.debugLineNum = 158859264;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=158859265;
 //BA.debugLineNum = 158859265;BA.debugLine="Log(\"Back REPORTS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6158859265","Back REPORTS",0);
RDebugUtils.currentLine=158859266;
 //BA.debugLineNum = 158859266;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturn",(Object)(""));
RDebugUtils.currentLine=158859267;
 //BA.debugLineNum = 158859267;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=158859268;
 //BA.debugLineNum = 158859268;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=158859269;
 //BA.debugLineNum = 158859269;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="report";
RDebugUtils.currentLine=158334976;
 //BA.debugLineNum = 158334976;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=158334978;
 //BA.debugLineNum = 158334978;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=158269440;
 //BA.debugLineNum = 158269440;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=158269442;
 //BA.debugLineNum = 158269442;BA.debugLine="End Sub";
return "";
}
public static String  _butcancelfilter_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcancelfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcancelfilter_click", null));}
RDebugUtils.currentLine=159318016;
 //BA.debugLineNum = 159318016;BA.debugLine="Sub butCancelFilter_Click";
RDebugUtils.currentLine=159318017;
 //BA.debugLineNum = 159318017;BA.debugLine="TimeStart.Enabled = True";
_timestart.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=159318018;
 //BA.debugLineNum = 159318018;BA.debugLine="End Sub";
return "";
}
public static String  _butdatefilter_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butdatefilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butdatefilter_click", null));}
xevolution.vrcg.devdemov2400.types._kpifilter _curr = null;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=159383552;
 //BA.debugLineNum = 159383552;BA.debugLine="Sub butDateFilter_Click";
RDebugUtils.currentLine=159383553;
 //BA.debugLineNum = 159383553;BA.debugLine="If (SDateFilterValue = \"\") Then SDateFilterValue";
if (((mostCurrent._sdatefiltervalue).equals(""))) { 
mostCurrent._sdatefiltervalue = mostCurrent._sharecode._current_appdate /*String*/ ;};
RDebugUtils.currentLine=159383554;
 //BA.debugLineNum = 159383554;BA.debugLine="If (EDateFilterValue = \"\") Then EDateFilterValue";
if (((mostCurrent._edatefiltervalue).equals(""))) { 
mostCurrent._edatefiltervalue = mostCurrent._sharecode._current_appdate /*String*/ ;};
RDebugUtils.currentLine=159383555;
 //BA.debugLineNum = 159383555;BA.debugLine="Dim curr As KPIFilter = Types.MakeKPIFilter(Perio";
_curr = mostCurrent._types._makekpifilter /*xevolution.vrcg.devdemov2400.types._kpifilter*/ (mostCurrent.activityBA,_periodfiltervalue,mostCurrent._sdatefiltervalue,mostCurrent._edatefiltervalue);
RDebugUtils.currentLine=159383556;
 //BA.debugLineNum = 159383556;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=159383557;
 //BA.debugLineNum = 159383557;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=159383558;
 //BA.debugLineNum = 159383558;BA.debugLine="Filter.GetKPIFilterDialog(Activity, curr)";
_filter._getkpifilterdialog /*void*/ (null,(Object)(mostCurrent._activity.getObject()),_curr);
RDebugUtils.currentLine=159383559;
 //BA.debugLineNum = 159383559;BA.debugLine="TimeStart.Enabled = True";
_timestart.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=159383560;
 //BA.debugLineNum = 159383560;BA.debugLine="End Sub";
return "";
}
public static String  _butdocfilter_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butdocfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butdocfilter_click", null));}
RDebugUtils.currentLine=159252480;
 //BA.debugLineNum = 159252480;BA.debugLine="Sub butDocFilter_Click";
RDebugUtils.currentLine=159252481;
 //BA.debugLineNum = 159252481;BA.debugLine="mDocPopMenu.OpenMenu()";
mostCurrent._mdocpopmenu._openmenu();
RDebugUtils.currentLine=159252482;
 //BA.debugLineNum = 159252482;BA.debugLine="End Sub";
return "";
}
public static String  _butequipfilter_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butequipfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butequipfilter_click", null));}
RDebugUtils.currentLine=159186944;
 //BA.debugLineNum = 159186944;BA.debugLine="Sub butEquipFilter_Click";
RDebugUtils.currentLine=159186945;
 //BA.debugLineNum = 159186945;BA.debugLine="mEqipPopMenu.OpenMenu()";
mostCurrent._meqippopmenu._openmenu();
RDebugUtils.currentLine=159186946;
 //BA.debugLineNum = 159186946;BA.debugLine="End Sub";
return "";
}
public static String  _buttonactionpause_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonactionpause_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonactionpause_click", null));}
int _i = 0;
RDebugUtils.currentLine=160038912;
 //BA.debugLineNum = 160038912;BA.debugLine="Sub ButtonActionPause_Click";
RDebugUtils.currentLine=160038913;
 //BA.debugLineNum = 160038913;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if ((mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
RDebugUtils.currentLine=160038915;
 //BA.debugLineNum = 160038915;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=160038916;
 //BA.debugLineNum = 160038916;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=160038917;
 //BA.debugLineNum = 160038917;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=160038918;
 //BA.debugLineNum = 160038918;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=160038919;
 //BA.debugLineNum = 160038919;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 };
 };
RDebugUtils.currentLine=160038922;
 //BA.debugLineNum = 160038922;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=160038923;
 //BA.debugLineNum = 160038923;BA.debugLine="End Sub";
return "";
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
RDebugUtils.currentLine=159842304;
 //BA.debugLineNum = 159842304;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=159842306;
 //BA.debugLineNum = 159842306;BA.debugLine="End Sub";
return "";
}
public static String  _butwarehouses_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butwarehouses_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butwarehouses_click", null));}
RDebugUtils.currentLine=159121408;
 //BA.debugLineNum = 159121408;BA.debugLine="Sub butWareHouses_Click";
RDebugUtils.currentLine=159121409;
 //BA.debugLineNum = 159121409;BA.debugLine="mPopMenu.OpenMenu()";
mostCurrent._mpopmenu._openmenu();
RDebugUtils.currentLine=159121410;
 //BA.debugLineNum = 159121410;BA.debugLine="End Sub";
return "";
}
public static String  _calendargetenddate_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calendargetenddate_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calendargetenddate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=159645696;
 //BA.debugLineNum = 159645696;BA.debugLine="Sub CalendarGetEndDate_onDateSet(year As Int, mont";
RDebugUtils.currentLine=159645702;
 //BA.debugLineNum = 159645702;BA.debugLine="End Sub";
return "";
}
public static String  _calendargetstartdate_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calendargetstartdate_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calendargetstartdate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=159776768;
 //BA.debugLineNum = 159776768;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
RDebugUtils.currentLine=159776774;
 //BA.debugLineNum = 159776774;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createkpirecord(String _title,String _value,String _valcompare,int[] _padd,int _height) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createkpirecord", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createkpirecord", new Object[] {_title,_value,_valcompare,_padd,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=158597120;
 //BA.debugLineNum = 158597120;BA.debugLine="Sub CreateKPIRecord(Title As String, Value As Stri";
RDebugUtils.currentLine=158597121;
 //BA.debugLineNum = 158597121;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=158597122;
 //BA.debugLineNum = 158597122;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=158597123;
 //BA.debugLineNum = 158597123;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=158597124;
 //BA.debugLineNum = 158597124;BA.debugLine="height = 60dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=158597125;
 //BA.debugLineNum = 158597125;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
 }else {
RDebugUtils.currentLine=158597127;
 //BA.debugLineNum = 158597127;BA.debugLine="Activity.AddView(p, 0, 0, 560dip, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (560)),_height);
 };
RDebugUtils.currentLine=158597129;
 //BA.debugLineNum = 158597129;BA.debugLine="p.LoadLayout(\"reports_kpiItems\")";
_p.LoadLayout("reports_kpiItems",mostCurrent.activityBA);
RDebugUtils.currentLine=158597130;
 //BA.debugLineNum = 158597130;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=158597131;
 //BA.debugLineNum = 158597131;BA.debugLine="labelKPIDescription.Padding = padd";
mostCurrent._labelkpidescription.setPadding(_padd);
RDebugUtils.currentLine=158597132;
 //BA.debugLineNum = 158597132;BA.debugLine="labelKPIDescription.text = Title";
mostCurrent._labelkpidescription.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=158597133;
 //BA.debugLineNum = 158597133;BA.debugLine="labelKPIValue.text = Value";
mostCurrent._labelkpivalue.setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=158597134;
 //BA.debugLineNum = 158597134;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=158597135;
 //BA.debugLineNum = 158597135;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createkpirecordall(String _title,String _value,String _valcompare,int[] _padd,int _height) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createkpirecordall", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createkpirecordall", new Object[] {_title,_value,_valcompare,_padd,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=158662656;
 //BA.debugLineNum = 158662656;BA.debugLine="Sub CreateKPIRecordAll(Title As String, Value As S";
RDebugUtils.currentLine=158662657;
 //BA.debugLineNum = 158662657;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=158662658;
 //BA.debugLineNum = 158662658;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=158662659;
 //BA.debugLineNum = 158662659;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=158662660;
 //BA.debugLineNum = 158662660;BA.debugLine="height = 60dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=158662661;
 //BA.debugLineNum = 158662661;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
 }else {
RDebugUtils.currentLine=158662663;
 //BA.debugLineNum = 158662663;BA.debugLine="Activity.AddView(p, 0, 0, 560dip, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (560)),_height);
 };
RDebugUtils.currentLine=158662665;
 //BA.debugLineNum = 158662665;BA.debugLine="p.LoadLayout(\"reports_kpiItemsAll\")";
_p.LoadLayout("reports_kpiItemsAll",mostCurrent.activityBA);
RDebugUtils.currentLine=158662666;
 //BA.debugLineNum = 158662666;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=158662667;
 //BA.debugLineNum = 158662667;BA.debugLine="labelKPIDescription.Padding = padd";
mostCurrent._labelkpidescription.setPadding(_padd);
RDebugUtils.currentLine=158662668;
 //BA.debugLineNum = 158662668;BA.debugLine="labelKPIDescription.text = Title";
mostCurrent._labelkpidescription.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=158662669;
 //BA.debugLineNum = 158662669;BA.debugLine="labelKPIValue.text = Value";
mostCurrent._labelkpivalue.setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=158662670;
 //BA.debugLineNum = 158662670;BA.debugLine="labelKPIValueCompare.text = ValCompare";
mostCurrent._labelkpivaluecompare.setText(BA.ObjectToCharSequence(_valcompare));
RDebugUtils.currentLine=158662671;
 //BA.debugLineNum = 158662671;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=158662672;
 //BA.debugLineNum = 158662672;BA.debugLine="End Sub";
return null;
}
public static String  _createpiechart(androidchartswrapper.pieChartWrapper _view,int[] _intstatus,String[] _descstatus,int[] _intcolors) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpiechart", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createpiechart", new Object[] {_view,_intstatus,_descstatus,_intcolors}));}
RDebugUtils.currentLine=158531584;
 //BA.debugLineNum = 158531584;BA.debugLine="Sub createPieChart(view As PieChart, intStatus() A";
RDebugUtils.currentLine=158531585;
 //BA.debugLineNum = 158531585;BA.debugLine="view.BorderColor = Colors.Transparent";
_view.setBorderColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=158531586;
 //BA.debugLineNum = 158531586;BA.debugLine="view.BorderWidth = 7.0";
_view.setBorderWidth((float) (7.0));
RDebugUtils.currentLine=158531587;
 //BA.debugLineNum = 158531587;BA.debugLine="view.CircleBorderColor = Colors.Transparent";
_view.setCircleBorderColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=158531588;
 //BA.debugLineNum = 158531588;BA.debugLine="view.CircleBorderWidth = 15.0";
_view.setCircleBorderWidth((int) (15.0));
RDebugUtils.currentLine=158531589;
 //BA.debugLineNum = 158531589;BA.debugLine="view.DisplayBorder = True";
_view.setDisplayBorder(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=158531590;
 //BA.debugLineNum = 158531590;BA.debugLine="view.LongitudeColor = Colors.Transparent";
_view.setLongitudeColor(anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=158531592;
 //BA.debugLineNum = 158531592;BA.debugLine="view.PieTextColor = Colors.black";
_view.setPieTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=158531593;
 //BA.debugLineNum = 158531593;BA.debugLine="view.PieTextSize = 15.0";
_view.setPieTextSize((float) (15.0));
RDebugUtils.currentLine=158531594;
 //BA.debugLineNum = 158531594;BA.debugLine="view.setTitlePosition(pc1.Left + 5%x, pc1.Top + 2";
_view.setTitlePosition((int) (mostCurrent._pc1.getLeft()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (5),mostCurrent.activityBA)),(int) (mostCurrent._pc1.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)));
RDebugUtils.currentLine=158531596;
 //BA.debugLineNum = 158531596;BA.debugLine="view.PieSliceColors = intColors 'piecolors";
_view.setPieSliceColors(_intcolors);
RDebugUtils.currentLine=158531597;
 //BA.debugLineNum = 158531597;BA.debugLine="view.PieSliceValues = intStatus 'pievalues";
_view.setPieSliceValues(_intstatus);
RDebugUtils.currentLine=158531598;
 //BA.debugLineNum = 158531598;BA.debugLine="view.PieSliceTitles = descStatus 'pietitles";
_view.setPieSliceTitles(_descstatus);
RDebugUtils.currentLine=158531599;
 //BA.debugLineNum = 158531599;BA.debugLine="view.initPieChart";
_view.initPieChart();
RDebugUtils.currentLine=158531600;
 //BA.debugLineNum = 158531600;BA.debugLine="End Sub";
return "";
}
public static String  _dialogreqperiodtype_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialogreqperiodtype_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialogreqperiodtype_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=159907840;
 //BA.debugLineNum = 159907840;BA.debugLine="Sub DialogReqPeriodType_ItemClick (Position As Int";
RDebugUtils.currentLine=159907842;
 //BA.debugLineNum = 159907842;BA.debugLine="End Sub";
return "";
}
public static String  _enddateselect_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "enddateselect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "enddateselect_click", null));}
RDebugUtils.currentLine=159580160;
 //BA.debugLineNum = 159580160;BA.debugLine="Sub EndDateSelect_Click";
RDebugUtils.currentLine=159580171;
 //BA.debugLineNum = 159580171;BA.debugLine="End Sub";
return "";
}
public static String  _kpilist_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "kpilist_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "kpilist_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=159514624;
 //BA.debugLineNum = 159514624;BA.debugLine="Sub KPIList_ItemClick (Index As Int, Value As Obje";
RDebugUtils.currentLine=159514626;
 //BA.debugLineNum = 159514626;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_click", null));}
RDebugUtils.currentLine=159055872;
 //BA.debugLineNum = 159055872;BA.debugLine="Sub ListItemPanel_Click";
RDebugUtils.currentLine=159055874;
 //BA.debugLineNum = 159055874;BA.debugLine="End Sub";
return "";
}
public static String  _listpedidos_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listpedidos_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listpedidos_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=158990336;
 //BA.debugLineNum = 158990336;BA.debugLine="Sub listPedidos_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=158990338;
 //BA.debugLineNum = 158990338;BA.debugLine="End Sub";
return "";
}
public static String  _listperiods_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listperiods_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listperiods_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=159449088;
 //BA.debugLineNum = 159449088;BA.debugLine="Sub listPeriods_SelectedIndexChanged (Index As Int";
RDebugUtils.currentLine=159449089;
 //BA.debugLineNum = 159449089;BA.debugLine="StartReportActivity(Index)";
_startreportactivity(_index);
RDebugUtils.currentLine=159449090;
 //BA.debugLineNum = 159449090;BA.debugLine="End Sub";
return "";
}
public static String  _startreportactivity(int _index) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startreportactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startreportactivity", new Object[] {_index}));}
String[] _snames = null;
int[] _icount = null;
String _whereclause = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _ssql = "";
int _ret = 0;
int[] _icolors = null;
int _i = 0;
int[] _padd_normal = null;
int[] _padd_inner = null;
int _total = 0;
RDebugUtils.currentLine=158466048;
 //BA.debugLineNum = 158466048;BA.debugLine="Sub StartReportActivity(index As Int)";
RDebugUtils.currentLine=158466053;
 //BA.debugLineNum = 158466053;BA.debugLine="Dim sNames() As String";
_snames = new String[(int) (0)];
java.util.Arrays.fill(_snames,"");
RDebugUtils.currentLine=158466054;
 //BA.debugLineNum = 158466054;BA.debugLine="Dim iCount() As Int";
_icount = new int[(int) (0)];
;
RDebugUtils.currentLine=158466055;
 //BA.debugLineNum = 158466055;BA.debugLine="Dim whereclause As String = \"\"";
_whereclause = "";
RDebugUtils.currentLine=158466056;
 //BA.debugLineNum = 158466056;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=158466057;
 //BA.debugLineNum = 158466057;BA.debugLine="If (index = 0) Then";
if ((_index==0)) { 
RDebugUtils.currentLine=158466058;
 //BA.debugLineNum = 158466058;BA.debugLine="whereclause = \" where a.execute_date >= (date('n";
_whereclause = " where a.execute_date >= (date('now','-1 month')) ";
 }else 
{RDebugUtils.currentLine=158466059;
 //BA.debugLineNum = 158466059;BA.debugLine="Else If (index = 1) Then";
if ((_index==1)) { 
RDebugUtils.currentLine=158466060;
 //BA.debugLineNum = 158466060;BA.debugLine="whereclause = \" \"";
_whereclause = " ";
 }else 
{RDebugUtils.currentLine=158466061;
 //BA.debugLineNum = 158466061;BA.debugLine="Else If (index = 2) Then";
if ((_index==2)) { 
RDebugUtils.currentLine=158466062;
 //BA.debugLineNum = 158466062;BA.debugLine="whereclause = \" where a.execute_date = date('now";
_whereclause = " where a.execute_date = date('now', 'localtime') ";
 }}}
;
RDebugUtils.currentLine=158466069;
 //BA.debugLineNum = 158466069;BA.debugLine="Dim sSQL As String = $\"${DBStructures.EVC_SQL_KPI";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dbstructures._evc_sql_kpiall_status /*String*/ ))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_whereclause))+" group by a.status_id order by a.status_id");
RDebugUtils.currentLine=158466070;
 //BA.debugLineNum = 158466070;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6158466070",_ssql,0);
RDebugUtils.currentLine=158466071;
 //BA.debugLineNum = 158466071;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=158466072;
 //BA.debugLineNum = 158466072;BA.debugLine="Dim ret As Int = Record.RowCount";
_ret = _record.getRowCount();
RDebugUtils.currentLine=158466073;
 //BA.debugLineNum = 158466073;BA.debugLine="If (ret >= 1) Then";
if ((_ret>=1)) { 
RDebugUtils.currentLine=158466074;
 //BA.debugLineNum = 158466074;BA.debugLine="Dim iColors(ret) As Int ' As List";
_icolors = new int[_ret];
;
RDebugUtils.currentLine=158466075;
 //BA.debugLineNum = 158466075;BA.debugLine="Dim sNames(ret) As String ' As List";
_snames = new String[_ret];
java.util.Arrays.fill(_snames,"");
RDebugUtils.currentLine=158466076;
 //BA.debugLineNum = 158466076;BA.debugLine="Dim iCount(ret) As Int ' As List";
_icount = new int[_ret];
;
RDebugUtils.currentLine=158466077;
 //BA.debugLineNum = 158466077;BA.debugLine="For i=0 To ret-1";
{
final int step20 = 1;
final int limit20 = (int) (_ret-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=158466078;
 //BA.debugLineNum = 158466078;BA.debugLine="Record.Position = i";
_record.setPosition(_i);
RDebugUtils.currentLine=158466083;
 //BA.debugLineNum = 158466083;BA.debugLine="iColors(i) = Utils.ColorString(Record.GetString";
_icolors[_i] = mostCurrent._utils._colorstring /*int*/ (mostCurrent.activityBA,_record.GetString("status_color"));
RDebugUtils.currentLine=158466084;
 //BA.debugLineNum = 158466084;BA.debugLine="sNames(i) = Record.GetString(\"status_desc\")";
_snames[_i] = _record.GetString("status_desc");
RDebugUtils.currentLine=158466085;
 //BA.debugLineNum = 158466085;BA.debugLine="iCount(i) = Record.GetInt(\"counter\")";
_icount[_i] = _record.GetInt("counter");
 }
};
 };
RDebugUtils.currentLine=158466088;
 //BA.debugLineNum = 158466088;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=158466090;
 //BA.debugLineNum = 158466090;BA.debugLine="createPieChart(pc0, iCount, sNames, iColors)";
_createpiechart(mostCurrent._pc0,_icount,_snames,_icolors);
RDebugUtils.currentLine=158466091;
 //BA.debugLineNum = 158466091;BA.debugLine="createPieChart(pc1, iCount, sNames, iColors)";
_createpiechart(mostCurrent._pc1,_icount,_snames,_icolors);
RDebugUtils.currentLine=158466093;
 //BA.debugLineNum = 158466093;BA.debugLine="Dim padd_Normal() As Int = Array As Int (10dip, 0";
_padd_normal = new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)),(int) (0),(int) (0),(int) (0)};
RDebugUtils.currentLine=158466094;
 //BA.debugLineNum = 158466094;BA.debugLine="Dim padd_Inner() As Int = Array As Int (50dip, 0,";
_padd_inner = new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),(int) (0),(int) (0),(int) (0)};
RDebugUtils.currentLine=158466095;
 //BA.debugLineNum = 158466095;BA.debugLine="KPIList.Clear";
mostCurrent._kpilist._clear();
RDebugUtils.currentLine=158466096;
 //BA.debugLineNum = 158466096;BA.debugLine="KPIListAll.Clear";
mostCurrent._kpilistall._clear();
RDebugUtils.currentLine=158466098;
 //BA.debugLineNum = 158466098;BA.debugLine="If (sNames.Length >= 1) Then";
if ((_snames.length>=1)) { 
RDebugUtils.currentLine=158466099;
 //BA.debugLineNum = 158466099;BA.debugLine="Dim total As Int = 0";
_total = (int) (0);
RDebugUtils.currentLine=158466100;
 //BA.debugLineNum = 158466100;BA.debugLine="For i=0 To iCount.Length-1";
{
final int step36 = 1;
final int limit36 = (int) (_icount.length-1);
_i = (int) (0) ;
for (;_i <= limit36 ;_i = _i + step36 ) {
RDebugUtils.currentLine=158466101;
 //BA.debugLineNum = 158466101;BA.debugLine="total = total + iCount(i)";
_total = (int) (_total+_icount[_i]);
 }
};
RDebugUtils.currentLine=158466104;
 //BA.debugLineNum = 158466104;BA.debugLine="KPIList.Add( CreateKPIRecord( \"Total de interven";
mostCurrent._kpilist._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createkpirecord("Total de intervenções",BA.NumberToString(_total),"",_padd_normal,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))).getObject())),(Object)(""));
RDebugUtils.currentLine=158466105;
 //BA.debugLineNum = 158466105;BA.debugLine="KPIListAll.Add( CreateKPIRecordAll( \"Total de in";
mostCurrent._kpilistall._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createkpirecordall("Total de intervenções",BA.NumberToString(_total),"---",_padd_normal,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))).getObject())),(Object)(""));
RDebugUtils.currentLine=158466106;
 //BA.debugLineNum = 158466106;BA.debugLine="For i=0 To sNames.Length-1";
{
final int step41 = 1;
final int limit41 = (int) (_snames.length-1);
_i = (int) (0) ;
for (;_i <= limit41 ;_i = _i + step41 ) {
RDebugUtils.currentLine=158466107;
 //BA.debugLineNum = 158466107;BA.debugLine="KPIList.Add( CreateKPIRecord( sNames(i), iCount";
mostCurrent._kpilist._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createkpirecord(_snames[_i],BA.NumberToString(_icount[_i]),"",_padd_inner,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))).getObject())),(Object)(""));
RDebugUtils.currentLine=158466108;
 //BA.debugLineNum = 158466108;BA.debugLine="KPIListAll.Add( CreateKPIRecordAll( sNames(i),";
mostCurrent._kpilistall._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createkpirecordall(_snames[_i],BA.NumberToString(_icount[_i]),"---",_padd_inner,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))).getObject())),(Object)(""));
 }
};
 };
RDebugUtils.currentLine=158466111;
 //BA.debugLineNum = 158466111;BA.debugLine="listPeriods.SetItems(Utils.GetListStrArrayItems(";
mostCurrent._listperiods._setitems /*String*/ (null,mostCurrent._utils._getliststrarrayitems /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,new String[]{"Últimos 30 dias","Desde o ínicio","Intervenções do dia"}));
RDebugUtils.currentLine=158466112;
 //BA.debugLineNum = 158466112;BA.debugLine="listPeriods.SelectedIndex = index";
mostCurrent._listperiods._setselectedindex /*int*/ (null,_index);
RDebugUtils.currentLine=158466113;
 //BA.debugLineNum = 158466113;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonadd_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonadd_click", null));}
RDebugUtils.currentLine=158924800;
 //BA.debugLineNum = 158924800;BA.debugLine="Sub listsButtonAdd_Click";
RDebugUtils.currentLine=158924802;
 //BA.debugLineNum = 158924802;BA.debugLine="End Sub";
return "";
}
public static String  _liststabpanel_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=158793728;
 //BA.debugLineNum = 158793728;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=158793730;
 //BA.debugLineNum = 158793730;BA.debugLine="End Sub";
return "";
}
public static String  _mainlogo_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainlogo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainlogo_click", null));}
RDebugUtils.currentLine=159973376;
 //BA.debugLineNum = 159973376;BA.debugLine="Sub mainLogo_Click";
RDebugUtils.currentLine=159973377;
 //BA.debugLineNum = 159973377;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
RDebugUtils.currentLine=159973378;
 //BA.debugLineNum = 159973378;BA.debugLine="End Sub";
return "";
}
public static String  _startdateselect_click() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startdateselect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startdateselect_click", null));}
RDebugUtils.currentLine=159711232;
 //BA.debugLineNum = 159711232;BA.debugLine="Sub StartDateSelect_Click";
RDebugUtils.currentLine=159711243;
 //BA.debugLineNum = 159711243;BA.debugLine="End Sub";
return "";
}
public static String  _timestart_tick() throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timestart_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timestart_tick", null));}
RDebugUtils.currentLine=158400512;
 //BA.debugLineNum = 158400512;BA.debugLine="Sub TimeStart_Tick";
RDebugUtils.currentLine=158400513;
 //BA.debugLineNum = 158400513;BA.debugLine="KPIUpdateProgress.Progress = KPIUpdateProgress.Pr";
mostCurrent._kpiupdateprogress.setProgress((int) (mostCurrent._kpiupdateprogress.getProgress()+1));
RDebugUtils.currentLine=158400514;
 //BA.debugLineNum = 158400514;BA.debugLine="If (KPIUpdateProgress.Progress = 100) Then";
if ((mostCurrent._kpiupdateprogress.getProgress()==100)) { 
RDebugUtils.currentLine=158400515;
 //BA.debugLineNum = 158400515;BA.debugLine="TimeStart.Enabled = False";
_timestart.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=158400516;
 //BA.debugLineNum = 158400516;BA.debugLine="KPIUpdateProgress.Progress =0";
mostCurrent._kpiupdateprogress.setProgress((int) (0));
 };
RDebugUtils.currentLine=158400518;
 //BA.debugLineNum = 158400518;BA.debugLine="End Sub";
return "";
}
public static String  _whouses_click(String _menuname) throws Exception{
RDebugUtils.currentModule="report";
if (Debug.shouldDelegate(mostCurrent.activityBA, "whouses_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "whouses_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=158728192;
 //BA.debugLineNum = 158728192;BA.debugLine="Sub whouses_Click(MenuName As String)";
RDebugUtils.currentLine=158728198;
 //BA.debugLineNum = 158728198;BA.debugLine="End Sub";
return "";
}
}