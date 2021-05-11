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

public class taskscl2 extends Activity implements B4AActivity{
	public static taskscl2 mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.taskscl2");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (taskscl2).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.taskscl2");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.taskscl2", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (taskscl2) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (taskscl2) Resume **");
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
		return taskscl2.class;
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
            BA.LogInfo("** Activity (taskscl2) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (taskscl2) Pause event (activity is not paused). **");
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
            taskscl2 mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (taskscl2) Resume **");
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
public static anywheresoftware.b4a.phone.Phone _device = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbasepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottomline = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottompanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _listslabelinfo = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _liststopbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemfullname = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelappinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemstatus = null;
public static int _itemscounter = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _butsearch = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editsearch = null;
public static boolean _isfiltered = false;
public static int _idialogreqtype = 0;
public static int _idialogreqstatus = 0;
public static int _idialogrequpdtated = 0;
public static int _idialogreqwithrequests = 0;
public static String _searchfilter = "";
public anywheresoftware.b4a.objects.ButtonWrapper _listbutactions = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemupdate = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemstate = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _listitemprogress = null;
public b4a.example3.customlistview _listchecklists = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdateversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemversion = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public b4a.example3.customlistview _listactions = null;
public static int _currentlineitemcl = 0;
public static int _totallineitemscl = 0;
public static int _currentlineitemac = 0;
public static int _totallineitemsac = 0;
public static int _currenttab = 0;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonactionpause = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemgroup = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtype = null;
public b4a.example3.customlistview _listitemslist = null;
public b4a.example3.customlistview _listtyperequests = null;
public static String _tprcurrentstatus = "";
public static String _clcurrentstatus = "";
public anywheresoftware.b4a.objects.LabelWrapper _taskslabelstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskslabeltitulo = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskslabelultimoupd = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskslabelgrupo = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskslabeltresultado = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskslabeltypeobjectfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _tasklvlabelstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _tasklvlabelstatustitulo = null;
public anywheresoftware.b4a.objects.LabelWrapper _tasklvlabelultimoudp = null;
public anywheresoftware.b4a.objects.LabelWrapper _tasklvlabelgrupo = null;
public anywheresoftware.b4a.objects.LabelWrapper _tasklvlabeltresultado = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskslvlabeltypeobjectfilter = null;
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
public xevolution.vrcg.devdemov2400.report _report = null;
public xevolution.vrcg.devdemov2400.reportview _reportview = null;
public xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public xevolution.vrcg.devdemov2400.structures _structures = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static String  _setthefilters(xevolution.vrcg.devdemov2400.types._taskfilter _flt) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setthefilters", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setthefilters", new Object[] {_flt}));}
String _filter = "";
String _itemactive = "";
String _itemgroup = "";
RDebugUtils.currentLine=182648832;
 //BA.debugLineNum = 182648832;BA.debugLine="Sub SetTheFilters(flt As TaskFilter)";
RDebugUtils.currentLine=182648833;
 //BA.debugLineNum = 182648833;BA.debugLine="IsFiltered  = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182648834;
 //BA.debugLineNum = 182648834;BA.debugLine="Dim Filter As String = \"\"";
_filter = "";
RDebugUtils.currentLine=182648836;
 //BA.debugLineNum = 182648836;BA.debugLine="Dim ItemActive As String = \"\"";
_itemactive = "";
RDebugUtils.currentLine=182648837;
 //BA.debugLineNum = 182648837;BA.debugLine="If (ShareCode.TaskTPRInactive) Then";
if ((mostCurrent._sharecode._tasktprinactive /*boolean*/ )) { 
RDebugUtils.currentLine=182648838;
 //BA.debugLineNum = 182648838;BA.debugLine="ItemActive = \"0\"";
_itemactive = "0";
 };
RDebugUtils.currentLine=182648841;
 //BA.debugLineNum = 182648841;BA.debugLine="If (ShareCode.TaskTPRActive) Then";
if ((mostCurrent._sharecode._tasktpractive /*boolean*/ )) { 
RDebugUtils.currentLine=182648842;
 //BA.debugLineNum = 182648842;BA.debugLine="If Utils.NNE(ItemActive) Then ItemActive = $\"${I";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_itemactive)) { 
_itemactive = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemactive))+",");};
RDebugUtils.currentLine=182648843;
 //BA.debugLineNum = 182648843;BA.debugLine="ItemActive = $\"${ItemActive}1\"$";
_itemactive = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemactive))+"1");
 };
RDebugUtils.currentLine=182648846;
 //BA.debugLineNum = 182648846;BA.debugLine="If Utils.NNE(ItemActive) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_itemactive)) { 
RDebugUtils.currentLine=182648847;
 //BA.debugLineNum = 182648847;BA.debugLine="ItemActive = $\" and (a.active in (${ItemActive})";
_itemactive = (" and (a.active in ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemactive))+"))");
 };
RDebugUtils.currentLine=182648851;
 //BA.debugLineNum = 182648851;BA.debugLine="Dim ItemGroup As String = \"\"";
_itemgroup = "";
RDebugUtils.currentLine=182648852;
 //BA.debugLineNum = 182648852;BA.debugLine="If CurrentTab = 0 Then";
if (_currenttab==0) { 
RDebugUtils.currentLine=182648853;
 //BA.debugLineNum = 182648853;BA.debugLine="If (ShareCode.TaskTPRSingular) Then";
if ((mostCurrent._sharecode._tasktprsingular /*boolean*/ )) { 
RDebugUtils.currentLine=182648854;
 //BA.debugLineNum = 182648854;BA.debugLine="ItemGroup = \"0\"";
_itemgroup = "0";
 };
RDebugUtils.currentLine=182648856;
 //BA.debugLineNum = 182648856;BA.debugLine="If (ShareCode.TaskTPRPlural) Then";
if ((mostCurrent._sharecode._tasktprplural /*boolean*/ )) { 
RDebugUtils.currentLine=182648857;
 //BA.debugLineNum = 182648857;BA.debugLine="If Utils.NNE(ItemGroup) Then ItemGroup = $\"${It";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_itemgroup)) { 
_itemgroup = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemgroup))+",");};
RDebugUtils.currentLine=182648858;
 //BA.debugLineNum = 182648858;BA.debugLine="ItemGroup = $\"${ItemGroup}1\"$";
_itemgroup = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemgroup))+"1");
 };
RDebugUtils.currentLine=182648860;
 //BA.debugLineNum = 182648860;BA.debugLine="If Utils.NNE(ItemGroup) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_itemgroup)) { 
RDebugUtils.currentLine=182648861;
 //BA.debugLineNum = 182648861;BA.debugLine="ItemGroup = $\" and (a.tr_is_model in (${ItemGro";
_itemgroup = (" and (a.tr_is_model in ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemgroup))+"))");
 };
 };
RDebugUtils.currentLine=182648865;
 //BA.debugLineNum = 182648865;BA.debugLine="Filter = $\"${ItemActive}${ItemGroup}\"$";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemactive))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemgroup))+"");
RDebugUtils.currentLine=182648894;
 //BA.debugLineNum = 182648894;BA.debugLine="StartTasksActivity(True, Filter, CurrentTab)";
_starttasksactivity(anywheresoftware.b4a.keywords.Common.True,_filter,_currenttab);
RDebugUtils.currentLine=182648895;
 //BA.debugLineNum = 182648895;BA.debugLine="End Sub";
return "";
}
public static String  _cancelallfilters(boolean _run) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cancelallfilters", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cancelallfilters", new Object[] {_run}));}
RDebugUtils.currentLine=182583296;
 //BA.debugLineNum = 182583296;BA.debugLine="Sub CancelAllFilters(run As Boolean)";
RDebugUtils.currentLine=182583297;
 //BA.debugLineNum = 182583297;BA.debugLine="IsFiltered  = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=182583298;
 //BA.debugLineNum = 182583298;BA.debugLine="iDialogReqType = 0";
_idialogreqtype = (int) (0);
RDebugUtils.currentLine=182583299;
 //BA.debugLineNum = 182583299;BA.debugLine="iDialogReqStatus = 0";
_idialogreqstatus = (int) (0);
RDebugUtils.currentLine=182583300;
 //BA.debugLineNum = 182583300;BA.debugLine="iDialogReqUpdtated = 0";
_idialogrequpdtated = (int) (0);
RDebugUtils.currentLine=182583301;
 //BA.debugLineNum = 182583301;BA.debugLine="iDialogReqWithRequests = 0";
_idialogreqwithrequests = (int) (0);
RDebugUtils.currentLine=182583303;
 //BA.debugLineNum = 182583303;BA.debugLine="ShareCode.TaskTPRActive = True";
mostCurrent._sharecode._tasktpractive /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182583304;
 //BA.debugLineNum = 182583304;BA.debugLine="ShareCode.TaskTPRInactive = True";
mostCurrent._sharecode._tasktprinactive /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182583305;
 //BA.debugLineNum = 182583305;BA.debugLine="ShareCode.TaskTPRSingular = True";
mostCurrent._sharecode._tasktprsingular /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182583306;
 //BA.debugLineNum = 182583306;BA.debugLine="ShareCode.TaskTPRPlural = True";
mostCurrent._sharecode._tasktprplural /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182583308;
 //BA.debugLineNum = 182583308;BA.debugLine="StartTasksActivity(True, \"\", CurrentTab)";
_starttasksactivity(anywheresoftware.b4a.keywords.Common.True,"",_currenttab);
RDebugUtils.currentLine=182583309;
 //BA.debugLineNum = 182583309;BA.debugLine="End Sub";
return "";
}
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(xevolution.vrcg.devdemov2400.taskscl2 parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
boolean _firsttime;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=182124545;
 //BA.debugLineNum = 182124545;BA.debugLine="If (ShareCode.ISPHONE) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=182124546;
 //BA.debugLineNum = 182124546;BA.debugLine="Device.SetScreenOrientation(1)";
parent._device.SetScreenOrientation(processBA,(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=182124548;
 //BA.debugLineNum = 182124548;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
parent._device.SetScreenOrientation(processBA,parent.mostCurrent._sharecode._device_orientation /*int*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=182124551;
 //BA.debugLineNum = 182124551;BA.debugLine="Starter.CurrentWorkActivity = Me";
parent.mostCurrent._starter._currentworkactivity /*Object*/  = taskscl2.getObject();
RDebugUtils.currentLine=182124552;
 //BA.debugLineNum = 182124552;BA.debugLine="Activity.LoadLayout(\"tasksLayout\")";
parent.mostCurrent._activity.LoadLayout("tasksLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=182124553;
 //BA.debugLineNum = 182124553;BA.debugLine="listsTabPanel.LoadLayout(\"tasks_typerequests\", Sh";
parent.mostCurrent._liststabpanel.LoadLayout("tasks_typerequests",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tabgeneral_typerequeststitle /*String*/ ));
RDebugUtils.currentLine=182124554;
 //BA.debugLineNum = 182124554;BA.debugLine="listsTabPanel.LoadLayout(\"tasks_listview\", ShareC";
parent.mostCurrent._liststabpanel.LoadLayout("tasks_listview",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tab_tasks_procedures /*String*/ ));
RDebugUtils.currentLine=182124558;
 //BA.debugLineNum = 182124558;BA.debugLine="tasksLabelStatus.text = ShareCode.objectObjLabelS";
parent.mostCurrent._taskslabelstatus.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectobjlabelstatus /*String*/ ));
RDebugUtils.currentLine=182124559;
 //BA.debugLineNum = 182124559;BA.debugLine="tasksLabelTitulo.text = ShareCode.tarefasLabelTit";
parent.mostCurrent._taskslabeltitulo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltitulos /*String*/ ));
RDebugUtils.currentLine=182124560;
 //BA.debugLineNum = 182124560;BA.debugLine="tasksLabelUltimoUpd.text = ShareCode.tarefasLabel";
parent.mostCurrent._taskslabelultimoupd.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabelultimoupd /*String*/ ));
RDebugUtils.currentLine=182124561;
 //BA.debugLineNum = 182124561;BA.debugLine="tasksLabelGrupo.text = ShareCode.checklistLabelGr";
parent.mostCurrent._taskslabelgrupo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistlabelgrupo /*String*/ ));
RDebugUtils.currentLine=182124562;
 //BA.debugLineNum = 182124562;BA.debugLine="tasksLabelTResultado.text = ShareCode.tarefasLabe";
parent.mostCurrent._taskslabeltresultado.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltresultado /*String*/ ));
RDebugUtils.currentLine=182124563;
 //BA.debugLineNum = 182124563;BA.debugLine="taskslabelTypeObjectFilter.text = ShareCode.alert";
parent.mostCurrent._taskslabeltypeobjectfilter.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*String*/ ));
RDebugUtils.currentLine=182124566;
 //BA.debugLineNum = 182124566;BA.debugLine="taskLVLabelStatus.Text = ShareCode.objectObjLabel";
parent.mostCurrent._tasklvlabelstatus.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectobjlabelstatus /*String*/ ));
RDebugUtils.currentLine=182124567;
 //BA.debugLineNum = 182124567;BA.debugLine="taskLVLabelStatusTitulo.Text = ShareCode.tarefasL";
parent.mostCurrent._tasklvlabelstatustitulo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltitulos /*String*/ ));
RDebugUtils.currentLine=182124568;
 //BA.debugLineNum = 182124568;BA.debugLine="taskLVLabelUltimoUdp.Text = ShareCode.tarefasLabe";
parent.mostCurrent._tasklvlabelultimoudp.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabelultimoupd /*String*/ ));
RDebugUtils.currentLine=182124569;
 //BA.debugLineNum = 182124569;BA.debugLine="taskLVLabelGrupo.Text = ShareCode.checklistLabelG";
parent.mostCurrent._tasklvlabelgrupo.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistlabelgrupo /*String*/ ));
RDebugUtils.currentLine=182124570;
 //BA.debugLineNum = 182124570;BA.debugLine="taskLVLabelTResultado.Text = ShareCode.tarefasLab";
parent.mostCurrent._tasklvlabeltresultado.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._tarefaslabeltresultado /*String*/ ));
RDebugUtils.currentLine=182124571;
 //BA.debugLineNum = 182124571;BA.debugLine="tasksLVlabelTypeObjectFilter.Text = ShareCode.ale";
parent.mostCurrent._taskslvlabeltypeobjectfilter.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*String*/ ));
RDebugUtils.currentLine=182124574;
 //BA.debugLineNum = 182124574;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
if (true) break;

case 7:
//for
this.state = 10;
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
group22 = parent.mostCurrent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,parent.mostCurrent._liststabpanel);
index22 = 0;
groupLen22 = group22.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if (index22 < groupLen22) {
this.state = 9;
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group22.Get(index22)));}
if (true) break;

case 16:
//C
this.state = 15;
index22++;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=182124575;
 //BA.debugLineNum = 182124575;BA.debugLine="lbl.Width = 50%x  '33.33%x";
_lbl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (50),mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=182124577;
 //BA.debugLineNum = 182124577;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
parent.mostCurrent._utils._maketabpaneleffect /*String*/ (mostCurrent.activityBA,parent.mostCurrent._colortabpanel,parent.mostCurrent._consts._colormaindarker /*int*/ ,parent.mostCurrent._consts._colorsub /*int*/ );
RDebugUtils.currentLine=182124578;
 //BA.debugLineNum = 182124578;BA.debugLine="If FirstTime Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_firsttime) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=182124582;
 //BA.debugLineNum = 182124582;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=182124583;
 //BA.debugLineNum = 182124583;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "activity_create"),(int) (100));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=182124584;
 //BA.debugLineNum = 182124584;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=182124585;
 //BA.debugLineNum = 182124585;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _gc = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=182452224;
 //BA.debugLineNum = 182452224;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=182452225;
 //BA.debugLineNum = 182452225;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
mostCurrent._mainlabeloptlists.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=182452226;
 //BA.debugLineNum = 182452226;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=182452227;
 //BA.debugLineNum = 182452227;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=182452228;
 //BA.debugLineNum = 182452228;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
RDebugUtils.currentLine=182452229;
 //BA.debugLineNum = 182452229;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN";
anywheresoftware.b4a.keywords.Common.LogImpl("6182452229",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=182452230;
 //BA.debugLineNum = 182452230;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) The";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=182452231;
 //BA.debugLineNum = 182452231;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(S";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
 };
RDebugUtils.currentLine=182452235;
 //BA.debugLineNum = 182452235;BA.debugLine="Dim gc As GradientDrawable";
_gc = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=182452236;
 //BA.debugLineNum = 182452236;BA.debugLine="gc.Initialize(\"TOP_BOTTOM\", Array As Int(Consts.C";
_gc.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),new int[]{mostCurrent._consts._colormain /*int*/ ,mostCurrent._consts._colorsub /*int*/ });
RDebugUtils.currentLine=182452237;
 //BA.debugLineNum = 182452237;BA.debugLine="ColorTabPanel.Background = gc";
mostCurrent._colortabpanel.setBackground((android.graphics.drawable.Drawable)(_gc.getObject()));
RDebugUtils.currentLine=182452238;
 //BA.debugLineNum = 182452238;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._liststabpanel));
RDebugUtils.currentLine=182452239;
 //BA.debugLineNum = 182452239;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.GetField("tabStrip")));
RDebugUtils.currentLine=182452241;
 //BA.debugLineNum = 182452241;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
_jo.RunMethod("setIndicatorColor",new Object[]{(Object)(mostCurrent._consts._colormain /*int*/ )});
RDebugUtils.currentLine=182452242;
 //BA.debugLineNum = 182452242;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=182321152;
 //BA.debugLineNum = 182321152;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=182321153;
 //BA.debugLineNum = 182321153;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=182321154;
 //BA.debugLineNum = 182321154;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=182321156;
 //BA.debugLineNum = 182321156;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182321157;
 //BA.debugLineNum = 182321157;BA.debugLine="End Sub";
return false;
}
public static String  _listsbuttonclose_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=183173120;
 //BA.debugLineNum = 183173120;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=183173121;
 //BA.debugLineNum = 183173121;BA.debugLine="Log(\"Back TASKS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6183173121","Back TASKS",0);
RDebugUtils.currentLine=183173122;
 //BA.debugLineNum = 183173122;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturn",(Object)(""));
RDebugUtils.currentLine=183173123;
 //BA.debugLineNum = 183173123;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=183173124;
 //BA.debugLineNum = 183173124;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=183173125;
 //BA.debugLineNum = 183173125;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="taskscl2";
RDebugUtils.currentLine=182255616;
 //BA.debugLineNum = 182255616;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=182255617;
 //BA.debugLineNum = 182255617;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=182190080;
 //BA.debugLineNum = 182190080;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=182190081;
 //BA.debugLineNum = 182190081;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizasvr_clai_update(String _request,String _task,String _itemtc,String _uk,String _val2fill,String _title,String _objtc,int _rc,int _ric,int _rfc) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actualizasvr_clai_update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "actualizasvr_clai_update", new Object[] {_request,_task,_itemtc,_uk,_val2fill,_title,_objtc,_rc,_ric,_rfc}));}
ResumableSub_ActualizaSvr_CLAI_Update rsub = new ResumableSub_ActualizaSvr_CLAI_Update(null,_request,_task,_itemtc,_uk,_val2fill,_title,_objtc,_rc,_ric,_rfc);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizaSvr_CLAI_Update extends BA.ResumableSub {
public ResumableSub_ActualizaSvr_CLAI_Update(xevolution.vrcg.devdemov2400.taskscl2 parent,String _request,String _task,String _itemtc,String _uk,String _val2fill,String _title,String _objtc,int _rc,int _ric,int _rfc) {
this.parent = parent;
this._request = _request;
this._task = _task;
this._itemtc = _itemtc;
this._uk = _uk;
this._val2fill = _val2fill;
this._title = _title;
this._objtc = _objtc;
this._rc = _rc;
this._ric = _ric;
this._rfc = _rfc;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _request;
String _task;
String _itemtc;
String _uk;
String _val2fill;
String _title;
String _objtc;
int _rc;
int _ric;
int _rfc;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _aclsessuser = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185532417;
 //BA.debugLineNum = 185532417;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185532418;
 //BA.debugLineNum = 185532418;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=185532419;
 //BA.debugLineNum = 185532419;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=185532420;
 //BA.debugLineNum = 185532420;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=185532421;
 //BA.debugLineNum = 185532421;BA.debugLine="params.Put(\"ACLARequest\", request.trim)";
_params.Put((Object)("ACLARequest"),(Object)(_request.trim()));
RDebugUtils.currentLine=185532422;
 //BA.debugLineNum = 185532422;BA.debugLine="params.Put(\"ACLAAction\", task.Trim)";
_params.Put((Object)("ACLAAction"),(Object)(_task.trim()));
RDebugUtils.currentLine=185532423;
 //BA.debugLineNum = 185532423;BA.debugLine="params.Put(\"ACLATask\", task.trim)";
_params.Put((Object)("ACLATask"),(Object)(_task.trim()));
RDebugUtils.currentLine=185532424;
 //BA.debugLineNum = 185532424;BA.debugLine="params.Put(\"ACLAItem\",itemTC)";
_params.Put((Object)("ACLAItem"),(Object)(_itemtc));
RDebugUtils.currentLine=185532425;
 //BA.debugLineNum = 185532425;BA.debugLine="params.Put(\"ACLAUniqueKey\", UK)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_uk));
RDebugUtils.currentLine=185532427;
 //BA.debugLineNum = 185532427;BA.debugLine="params.Put(\"ACLAObjectTag\", ObjTC)";
_params.Put((Object)("ACLAObjectTag"),(Object)(_objtc));
RDebugUtils.currentLine=185532428;
 //BA.debugLineNum = 185532428;BA.debugLine="params.Put(\"ACLAValue\", val2fill)";
_params.Put((Object)("ACLAValue"),(Object)(_val2fill));
RDebugUtils.currentLine=185532429;
 //BA.debugLineNum = 185532429;BA.debugLine="params.Put(\"ACLATitle\",title)";
_params.Put((Object)("ACLATitle"),(Object)(_title));
RDebugUtils.currentLine=185532430;
 //BA.debugLineNum = 185532430;BA.debugLine="params.Put(\"ACLAReqCounter\", rc)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_rc));
RDebugUtils.currentLine=185532431;
 //BA.debugLineNum = 185532431;BA.debugLine="params.Put(\"ACLARepeatItem\", ric)";
_params.Put((Object)("ACLARepeatItem"),(Object)(_ric));
RDebugUtils.currentLine=185532432;
 //BA.debugLineNum = 185532432;BA.debugLine="params.Put(\"ACLARepeatField\", rfc)";
_params.Put((Object)("ACLARepeatField"),(Object)(_rfc));
RDebugUtils.currentLine=185532433;
 //BA.debugLineNum = 185532433;BA.debugLine="params.Put(\"ACLAInner\", 0)";
_params.Put((Object)("ACLAInner"),(Object)(0));
RDebugUtils.currentLine=185532435;
 //BA.debugLineNum = 185532435;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=185532436;
 //BA.debugLineNum = 185532436;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=185532437;
 //BA.debugLineNum = 185532437;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=185532438;
 //BA.debugLineNum = 185532438;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=185532439;
 //BA.debugLineNum = 185532439;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=185532440;
 //BA.debugLineNum = 185532440;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=185532441;
 //BA.debugLineNum = 185532441;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=185532442;
 //BA.debugLineNum = 185532442;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDateti";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=185532443;
 //BA.debugLineNum = 185532443;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=185532444;
 //BA.debugLineNum = 185532444;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=185532446;
 //BA.debugLineNum = 185532446;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=185532447;
 //BA.debugLineNum = 185532447;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=185532448;
 //BA.debugLineNum = 185532448;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=185532449;
 //BA.debugLineNum = 185532449;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_OPER_U";
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*String*/ ;
RDebugUtils.currentLine=185532451;
 //BA.debugLineNum = 185532451;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
_params.Put((Object)("ACLSessUser"),(Object)(_aclsessuser));
RDebugUtils.currentLine=185532452;
 //BA.debugLineNum = 185532452;BA.debugLine="params.Put(\"ACLClear\", 0)";
_params.Put((Object)("ACLClear"),(Object)(0));
RDebugUtils.currentLine=185532454;
 //BA.debugLineNum = 185532454;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/update");
RDebugUtils.currentLine=185532455;
 //BA.debugLineNum = 185532455;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
if (true) break;

case 1:
//if
this.state = 12;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=185532456;
 //BA.debugLineNum = 185532456;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=185532457;
 //BA.debugLineNum = 185532457;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", request.t";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,taskscl2.getObject(),_url,"",_request.trim());
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=185532459;
 //BA.debugLineNum = 185532459;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_request.trim(),_task.trim(),_itemtc.trim());
RDebugUtils.currentLine=185532460;
 //BA.debugLineNum = 185532460;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=185532462;
 //BA.debugLineNum = 185532462;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "actualizasvr_clai_update"),(int) (250));
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
RDebugUtils.currentLine=185532464;
 //BA.debugLineNum = 185532464;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_request.trim(),_task.trim(),_itemtc.trim());
RDebugUtils.currentLine=185532465;
 //BA.debugLineNum = 185532465;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=185532468;
 //BA.debugLineNum = 185532468;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=185532470;
 //BA.debugLineNum = 185532470;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butsearch_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butsearch_click", null));}
RDebugUtils.currentLine=183828480;
 //BA.debugLineNum = 183828480;BA.debugLine="Sub butSearch_Click";
RDebugUtils.currentLine=183828481;
 //BA.debugLineNum = 183828481;BA.debugLine="MakeListSearch(EditSearch.Text)";
_makelistsearch(mostCurrent._editsearch.getText());
RDebugUtils.currentLine=183828482;
 //BA.debugLineNum = 183828482;BA.debugLine="End Sub";
return "";
}
public static String  _makelistsearch(String _search) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makelistsearch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makelistsearch", new Object[] {_search}));}
String _filter = "";
RDebugUtils.currentLine=183894016;
 //BA.debugLineNum = 183894016;BA.debugLine="Sub MakeListSearch(search As String)";
RDebugUtils.currentLine=183894017;
 //BA.debugLineNum = 183894017;BA.debugLine="If (CurrentTab=0) Then";
if ((_currenttab==0)) { 
RDebugUtils.currentLine=183894018;
 //BA.debugLineNum = 183894018;BA.debugLine="Dim Filter As String = $\" and a.tagcode||a.title";
_filter = (" and a.tagcode||a.title||ifnull(b.tagdesc,'')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%'");
 }else {
RDebugUtils.currentLine=183894020;
 //BA.debugLineNum = 183894020;BA.debugLine="Dim Filter As String = $\" and a.tagcode||a.title";
_filter = (" and a.tagcode||a.title||a.version||ifnull(b.tagdesc,'')||ifnull(c.title, '')||ifnull(e.tagdesc, '')||ifnull(a.updated_at,'')||ifnull(a.details, '')||ifnull(a.group_tags, '') like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%'");
 };
RDebugUtils.currentLine=183894022;
 //BA.debugLineNum = 183894022;BA.debugLine="SearchFilter = Filter";
mostCurrent._searchfilter = _filter;
RDebugUtils.currentLine=183894023;
 //BA.debugLineNum = 183894023;BA.debugLine="IsFiltered = (Filter <> \"\")";
_isfiltered = ((_filter).equals("") == false);
RDebugUtils.currentLine=183894024;
 //BA.debugLineNum = 183894024;BA.debugLine="StartTasksActivity(True, Filter, CurrentTab)";
_starttasksactivity(anywheresoftware.b4a.keywords.Common.True,_filter,_currenttab);
RDebugUtils.currentLine=183894025;
 //BA.debugLineNum = 183894025;BA.debugLine="End Sub";
return "";
}
public static String  _buttonactionpause_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonactionpause_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonactionpause_click", null));}
int _i = 0;
RDebugUtils.currentLine=185204736;
 //BA.debugLineNum = 185204736;BA.debugLine="Sub ButtonActionPause_Click";
RDebugUtils.currentLine=185204737;
 //BA.debugLineNum = 185204737;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if ((mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
RDebugUtils.currentLine=185204739;
 //BA.debugLineNum = 185204739;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=185204740;
 //BA.debugLineNum = 185204740;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=185204741;
 //BA.debugLineNum = 185204741;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=185204742;
 //BA.debugLineNum = 185204742;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=185204743;
 //BA.debugLineNum = 185204743;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 };
 };
RDebugUtils.currentLine=185204746;
 //BA.debugLineNum = 185204746;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=185204747;
 //BA.debugLineNum = 185204747;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.taskscl2 parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=182517761;
 //BA.debugLineNum = 182517761;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
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
RDebugUtils.currentLine=182517762;
 //BA.debugLineNum = 182517762;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=182517763;
 //BA.debugLineNum = 182517763;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=182517765;
 //BA.debugLineNum = 182517765;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=182517766;
 //BA.debugLineNum = 182517766;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=182517767;
 //BA.debugLineNum = 182517767;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "windowstatusupdate"),(int) (500));
this.state = 22;
return;
case 22:
//C
this.state = 4;
;
RDebugUtils.currentLine=182517768;
 //BA.debugLineNum = 182517768;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=182517770;
 //BA.debugLineNum = 182517770;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=182517771;
 //BA.debugLineNum = 182517771;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=182517772;
 //BA.debugLineNum = 182517772;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=182517773;
 //BA.debugLineNum = 182517773;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_Tas";
parent.mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_tasks /*String*/ .toUpperCase()));
RDebugUtils.currentLine=182517776;
 //BA.debugLineNum = 182517776;BA.debugLine="ButtonAppNetwork.Enabled = False";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=182517777;
 //BA.debugLineNum = 182517777;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=182517778;
 //BA.debugLineNum = 182517778;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=182517779;
 //BA.debugLineNum = 182517779;BA.debugLine="ButtonAppNetwork.Enabled = True";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=182517780;
 //BA.debugLineNum = 182517780;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=182517782;
 //BA.debugLineNum = 182517782;BA.debugLine="ButtonUserUnavailable.Enabled = False";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=182517783;
 //BA.debugLineNum = 182517783;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=182517784;
 //BA.debugLineNum = 182517784;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
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
RDebugUtils.currentLine=182517785;
 //BA.debugLineNum = 182517785;BA.debugLine="ButtonUserUnavailable.Enabled = True";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=182517786;
 //BA.debugLineNum = 182517786;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=182517789;
 //BA.debugLineNum = 182517789;BA.debugLine="ButtonActionPause.Enabled = False";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=182517790;
 //BA.debugLineNum = 182517790;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=182517792;
 //BA.debugLineNum = 182517792;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
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
RDebugUtils.currentLine=182517793;
 //BA.debugLineNum = 182517793;BA.debugLine="ButtonActionPause.Enabled = True";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=182517794;
 //BA.debugLineNum = 182517794;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=182517796;
 //BA.debugLineNum = 182517796;BA.debugLine="If (CurrentTab = 0) Then";

case 16:
//if
this.state = 21;
if ((parent._currenttab==0)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=182517797;
 //BA.debugLineNum = 182517797;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemCL} / $";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentlineitemcl))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitemscl))+"")));
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=182517799;
 //BA.debugLineNum = 182517799;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemAC} / $";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentlineitemac))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitemsac))+"")));
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=182517802;
 //BA.debugLineNum = 182517802;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
RDebugUtils.currentLine=183697408;
 //BA.debugLineNum = 183697408;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=183697410;
 //BA.debugLineNum = 183697410;BA.debugLine="End Sub";
return "";
}
public static String  _starttasksactivity(boolean _clear,String _filter,int _tabposis) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttasksactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starttasksactivity", new Object[] {_clear,_filter,_tabposis}));}
String _sfilter = "";
xevolution.vrcg.devdemov2400.types._taskfilter _tfilter = null;
int _height = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _default_department = "";
String _sqlevc = "";
int _row = 0;
String _paramters = "";
int _only_related_type_technicals = 0;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
String _execute_location = "";
String _authorized_technicals = "";
String _can_fo = "";
boolean _executa = false;
RDebugUtils.currentLine=182845440;
 //BA.debugLineNum = 182845440;BA.debugLine="Sub StartTasksActivity(Clear As Boolean, Filter As";
RDebugUtils.currentLine=182845443;
 //BA.debugLineNum = 182845443;BA.debugLine="Starter.TaskSearchFilter = Filter";
mostCurrent._starter._tasksearchfilter /*String*/  = _filter;
RDebugUtils.currentLine=182845445;
 //BA.debugLineNum = 182845445;BA.debugLine="If Utils.NE(Filter) Then";
if (mostCurrent._utils._ne /*boolean*/ (mostCurrent.activityBA,_filter)) { 
RDebugUtils.currentLine=182845446;
 //BA.debugLineNum = 182845446;BA.debugLine="Filter = $\" and (a.active in (1))\"$";
_filter = (" and (a.active in (1))");
RDebugUtils.currentLine=182845447;
 //BA.debugLineNum = 182845447;BA.debugLine="ShareCode.TaskTPRInactive = False";
mostCurrent._sharecode._tasktprinactive /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=182845450;
 //BA.debugLineNum = 182845450;BA.debugLine="If (Starter.EntityKeepFilter = True) Then";
if ((mostCurrent._starter._entitykeepfilter /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True)) { 
RDebugUtils.currentLine=182845451;
 //BA.debugLineNum = 182845451;BA.debugLine="Starter.EntityKeepFilter = False";
mostCurrent._starter._entitykeepfilter /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=182845452;
 //BA.debugLineNum = 182845452;BA.debugLine="If (Starter.TaskSearchFilter <> \"\") Then";
if (((mostCurrent._starter._tasksearchfilter /*String*/ ).equals("") == false)) { 
RDebugUtils.currentLine=182845453;
 //BA.debugLineNum = 182845453;BA.debugLine="Dim sFilter As String = Starter.TaskSearchFilte";
_sfilter = mostCurrent._starter._tasksearchfilter /*String*/ ;
RDebugUtils.currentLine=182845454;
 //BA.debugLineNum = 182845454;BA.debugLine="Starter.TaskSearchFilter = \"\"";
mostCurrent._starter._tasksearchfilter /*String*/  = "";
RDebugUtils.currentLine=182845455;
 //BA.debugLineNum = 182845455;BA.debugLine="Starter.TaskFilters = Types.MakeTaskFilter(0, 0";
mostCurrent._starter._taskfilters /*xevolution.vrcg.devdemov2400.types._taskfilter*/  = mostCurrent._types._maketaskfilter /*xevolution.vrcg.devdemov2400.types._taskfilter*/ (mostCurrent.activityBA,(int) (0),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=182845456;
 //BA.debugLineNum = 182845456;BA.debugLine="StartTasksActivity(True, sFilter, tabposis)";
_starttasksactivity(anywheresoftware.b4a.keywords.Common.True,_sfilter,_tabposis);
 }else {
RDebugUtils.currentLine=182845458;
 //BA.debugLineNum = 182845458;BA.debugLine="Dim tFilter As TaskFilter = Starter.TaskFilters";
_tfilter = mostCurrent._starter._taskfilters /*xevolution.vrcg.devdemov2400.types._taskfilter*/ ;
RDebugUtils.currentLine=182845459;
 //BA.debugLineNum = 182845459;BA.debugLine="Starter.TaskFilters = Types.MakeTaskFilter(0, 0";
mostCurrent._starter._taskfilters /*xevolution.vrcg.devdemov2400.types._taskfilter*/  = mostCurrent._types._maketaskfilter /*xevolution.vrcg.devdemov2400.types._taskfilter*/ (mostCurrent.activityBA,(int) (0),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=182845460;
 //BA.debugLineNum = 182845460;BA.debugLine="Starter.TaskSearchFilter = \"\"";
mostCurrent._starter._tasksearchfilter /*String*/  = "";
RDebugUtils.currentLine=182845461;
 //BA.debugLineNum = 182845461;BA.debugLine="SetTheFilters(tFilter)";
_setthefilters(_tfilter);
 };
 }else {
RDebugUtils.currentLine=182845465;
 //BA.debugLineNum = 182845465;BA.debugLine="If Clear Then";
if (_clear) { 
RDebugUtils.currentLine=182845466;
 //BA.debugLineNum = 182845466;BA.debugLine="If (CurrentTab = 0) Then";
if ((_currenttab==0)) { 
RDebugUtils.currentLine=182845467;
 //BA.debugLineNum = 182845467;BA.debugLine="listTypeRequests.Clear";
mostCurrent._listtyperequests._clear();
 }else {
RDebugUtils.currentLine=182845469;
 //BA.debugLineNum = 182845469;BA.debugLine="listChecklists.Clear";
mostCurrent._listchecklists._clear();
 };
 };
RDebugUtils.currentLine=182845477;
 //BA.debugLineNum = 182845477;BA.debugLine="Dim height As Int = 85dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85));
RDebugUtils.currentLine=182845479;
 //BA.debugLineNum = 182845479;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=182845480;
 //BA.debugLineNum = 182845480;BA.debugLine="height = 145dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (145));
 };
RDebugUtils.currentLine=182845483;
 //BA.debugLineNum = 182845483;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=182845484;
 //BA.debugLineNum = 182845484;BA.debugLine="ItemsCounter = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=182845486;
 //BA.debugLineNum = 182845486;BA.debugLine="If ShareCode.TaskTPRInactive = False And Not(Fil";
if (mostCurrent._sharecode._tasktprinactive /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False && anywheresoftware.b4a.keywords.Common.Not(_filter.contains("and (a.active in (1))"))) { 
RDebugUtils.currentLine=182845487;
 //BA.debugLineNum = 182845487;BA.debugLine="Filter = \" and (a.active in (1)) \" & Filter";
_filter = " and (a.active in (1)) "+_filter;
 };
RDebugUtils.currentLine=182845494;
 //BA.debugLineNum = 182845494;BA.debugLine="Dim default_department As String = DBStructures.";
_default_department = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("Select default_department as value \n"+"								from dta_technicals_adds \n"+"								where technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ .trim()))+"'"),"value");
RDebugUtils.currentLine=182845497;
 //BA.debugLineNum = 182845497;BA.debugLine="If Utils.NNE(default_department) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_default_department)) { 
RDebugUtils.currentLine=182845498;
 //BA.debugLineNum = 182845498;BA.debugLine="Filter = $\" and (e.departments like '%${default";
_filter = (" and (e.departments like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_default_department.trim()))+"%') "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"");
 };
RDebugUtils.currentLine=182845501;
 //BA.debugLineNum = 182845501;BA.debugLine="Dim SQLEVC As String = $\"SELECT a.tagcode, a.gro";
_sqlevc = ("SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc, \n"+"								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,\n"+"								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode FROM dta_typerequests AS a\n"+"								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) \n"+"								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)\n"+"								left join dta_typerequests_auths as d on (d.typerequest_tagcode=c.typerequest_tagcode)\n"+"								left join dta_auths as e on (e.tagcode=d.auths_tagcode)\n"+"								WHERE  1=1 \n"+"									and a.published=1 \n"+"									and a.is_internal=0 \n"+"									and published=1 \n"+"									"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" \n"+"									order by a.title");
RDebugUtils.currentLine=182845527;
 //BA.debugLineNum = 182845527;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlevc)));
RDebugUtils.currentLine=182845530;
 //BA.debugLineNum = 182845530;BA.debugLine="CurrentLineItemCL = 0";
_currentlineitemcl = (int) (0);
RDebugUtils.currentLine=182845531;
 //BA.debugLineNum = 182845531;BA.debugLine="Log(SQLEVC)";
anywheresoftware.b4a.keywords.Common.LogImpl("6182845531",_sqlevc,0);
RDebugUtils.currentLine=182845532;
 //BA.debugLineNum = 182845532;BA.debugLine="TotalLineItemsCL = Record.RowCount";
_totallineitemscl = _record.getRowCount();
RDebugUtils.currentLine=182845533;
 //BA.debugLineNum = 182845533;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=182845534;
 //BA.debugLineNum = 182845534;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step46 = 1;
final int limit46 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
RDebugUtils.currentLine=182845535;
 //BA.debugLineNum = 182845535;BA.debugLine="ItemsCounter = ItemsCounter + 1";
_itemscounter = (int) (_itemscounter+1);
RDebugUtils.currentLine=182845536;
 //BA.debugLineNum = 182845536;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=182845537;
 //BA.debugLineNum = 182845537;BA.debugLine="Dim paramters As String = Record.GetString(\"pa";
_paramters = _record.GetString("paramters");
RDebugUtils.currentLine=182845538;
 //BA.debugLineNum = 182845538;BA.debugLine="Dim only_related_type_technicals As Int = Reco";
_only_related_type_technicals = _record.GetInt("only_related_type_technicals");
RDebugUtils.currentLine=182845540;
 //BA.debugLineNum = 182845540;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=182845541;
 //BA.debugLineNum = 182845541;BA.debugLine="Dim MapJson As Map";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=182845542;
 //BA.debugLineNum = 182845542;BA.debugLine="JSON.Initialize(paramters)";
_json.Initialize(_paramters);
RDebugUtils.currentLine=182845543;
 //BA.debugLineNum = 182845543;BA.debugLine="MapJson = JSON.NextObject";
_mapjson = _json.NextObject();
RDebugUtils.currentLine=182845544;
 //BA.debugLineNum = 182845544;BA.debugLine="Dim execute_location As String = MapJson.Get(\"";
_execute_location = BA.ObjectToString(_mapjson.Get((Object)("execute_location")));
RDebugUtils.currentLine=182845545;
 //BA.debugLineNum = 182845545;BA.debugLine="Dim authorized_technicals As String = MapJson.";
_authorized_technicals = BA.ObjectToString(_mapjson.Get((Object)("authorized_technicals")));
RDebugUtils.currentLine=182845546;
 //BA.debugLineNum = 182845546;BA.debugLine="JSON.Initialize(execute_location)";
_json.Initialize(_execute_location);
RDebugUtils.currentLine=182845547;
 //BA.debugLineNum = 182845547;BA.debugLine="MapJson = JSON.NextObject";
_mapjson = _json.NextObject();
RDebugUtils.currentLine=182845548;
 //BA.debugLineNum = 182845548;BA.debugLine="Dim can_fo As String = MapJson.Get(\"can_fo\")";
_can_fo = BA.ObjectToString(_mapjson.Get((Object)("can_fo")));
RDebugUtils.currentLine=182845549;
 //BA.debugLineNum = 182845549;BA.debugLine="If (can_fo = \"1\") Then";
if (((_can_fo).equals("1"))) { 
RDebugUtils.currentLine=182845551;
 //BA.debugLineNum = 182845551;BA.debugLine="Dim executa As Boolean = True";
_executa = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=182845552;
 //BA.debugLineNum = 182845552;BA.debugLine="If Utils.NNE(authorized_technicals) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_authorized_technicals)) { 
RDebugUtils.currentLine=182845554;
 //BA.debugLineNum = 182845554;BA.debugLine="executa=authorized_technicals.Contains(Share";
_executa = _authorized_technicals.contains(mostCurrent._sharecode._sess_user /*String*/ );
 };
RDebugUtils.currentLine=182845557;
 //BA.debugLineNum = 182845557;BA.debugLine="If (executa) Then";
if ((_executa)) { 
RDebugUtils.currentLine=182845558;
 //BA.debugLineNum = 182845558;BA.debugLine="listTypeRequests.Add( CreateListItem(ItemsCo";
mostCurrent._listtyperequests._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(_itemscounter,_record,mostCurrent._listtyperequests._asview().getWidth(),_height,anywheresoftware.b4a.keywords.Common.True).getObject())),(Object)(""));
 };
 };
 }
};
 };
RDebugUtils.currentLine=182845566;
 //BA.debugLineNum = 182845566;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=182845652;
 //BA.debugLineNum = 182845652;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
 };
RDebugUtils.currentLine=182845654;
 //BA.debugLineNum = 182845654;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=182845655;
 //BA.debugLineNum = 182845655;BA.debugLine="End Sub";
return "";
}
public static String  _changemyposition() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changemyposition", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changemyposition", null));}
RDebugUtils.currentLine=183042048;
 //BA.debugLineNum = 183042048;BA.debugLine="Public Sub ChangeMyPosition";
RDebugUtils.currentLine=183042050;
 //BA.debugLineNum = 183042050;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checktyperequestnewtask(String _request,String _action) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checktyperequestnewtask", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checktyperequestnewtask", new Object[] {_request,_action}));}
ResumableSub_CheckTypeRequestNewTask rsub = new ResumableSub_CheckTypeRequestNewTask(null,_request,_action);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckTypeRequestNewTask extends BA.ResumableSub {
public ResumableSub_CheckTypeRequestNewTask(xevolution.vrcg.devdemov2400.taskscl2 parent,String _request,String _action) {
this.parent = parent;
this._request = _request;
this._action = _action;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _request;
String _action;
String _request_type = "";
int _tr_is_model = 0;
String _object_tagcode = "";
String _object_group = "";
String _tasktagcode = "";
int _existchecklist = 0;
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
int _newcounter = 0;
String _newdate = "";
String _newtime = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
String _ssql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r1 = null;
boolean _finished = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185335813;
 //BA.debugLineNum = 185335813;BA.debugLine="Dim request_type As String = DBStructures.GetScri";
_request_type = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(typerequest_tagcode, '') as valor\n"+"													from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'"),"valor");
RDebugUtils.currentLine=185335815;
 //BA.debugLineNum = 185335815;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScriptCo";
_tr_is_model = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select ifnull(tr_is_model, '0') as valor\n"+"													from dta_typerequests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type.trim()))+"'"),"valor");
RDebugUtils.currentLine=185335818;
 //BA.debugLineNum = 185335818;BA.debugLine="Dim object_tagcode As String = DBStructures.GetSc";
_object_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(object_tagcode, '') as valor\n"+"													from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'"),"valor");
RDebugUtils.currentLine=185335821;
 //BA.debugLineNum = 185335821;BA.debugLine="Dim object_group As String = DBStructures.GetScri";
_object_group = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(object_group, '') as valor\n"+"													from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'"),"valor");
RDebugUtils.currentLine=185335824;
 //BA.debugLineNum = 185335824;BA.debugLine="If Utils.NNE(request_type) And Utils.NNE(object_t";
if (true) break;

case 1:
//if
this.state = 12;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_request_type) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_object_tagcode) && (_tr_is_model==1) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_object_group)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=185335826;
 //BA.debugLineNum = 185335826;BA.debugLine="Dim taskTagcode As String = DBStructures.GetScri";
_tasktagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("Select ifnull(tagcode, '') as valor\n"+"											from dta_tasks\n"+"											where task_type_mode='TTMT_03'\n"+"												And connect2data like '%'||(Select distinct i.object_type from dta_objects As i\n"+"													where i.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'\n"+"													And i.object_group in (\n"+"														Select tagcode from dta_objecttypes_groups \n"+"														where objtyp_tagcode=i.object_type\n"+"														And tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_group.trim()))+"'\n"+"													))||'%'\n"+"												And parent_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_group.trim()))+"'\n"+"												limit 1"),"valor");
RDebugUtils.currentLine=185335839;
 //BA.debugLineNum = 185335839;BA.debugLine="Dim ExistChecklist As Int = DBStructures.GetScri";
_existchecklist = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("Select count(relation_tagcode) As valor\n"+"						from dta_requests_relations where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type.trim()))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tasktagcode.trim()))+"'"),"valor");
RDebugUtils.currentLine=185335842;
 //BA.debugLineNum = 185335842;BA.debugLine="If (ExistChecklist = 0) Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_existchecklist==0)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=185335843;
 //BA.debugLineNum = 185335843;BA.debugLine="If Utils.NNE(taskTagcode) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_tasktagcode)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=185335844;
 //BA.debugLineNum = 185335844;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185335845;
 //BA.debugLineNum = 185335845;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=185335846;
 //BA.debugLineNum = 185335846;BA.debugLine="Dim NewCounter As Int = 0";
_newcounter = (int) (0);
RDebugUtils.currentLine=185335848;
 //BA.debugLineNum = 185335848;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=185335849;
 //BA.debugLineNum = 185335849;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeEx";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=185335851;
 //BA.debugLineNum = 185335851;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations","id","")+1+1000000);
RDebugUtils.currentLine=185335852;
 //BA.debugLineNum = 185335852;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185335853;
 //BA.debugLineNum = 185335853;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=185335854;
 //BA.debugLineNum = 185335854;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=185335855;
 //BA.debugLineNum = 185335855;BA.debugLine="newExecution.Put(\"request_tagcode\", Request.tr";
_newexecution.Put((Object)("request_tagcode"),(Object)(_request.trim()));
RDebugUtils.currentLine=185335856;
 //BA.debugLineNum = 185335856;BA.debugLine="newExecution.Put(\"relation_tagcode\", taskTagco";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tasktagcode));
RDebugUtils.currentLine=185335857;
 //BA.debugLineNum = 185335857;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=185335858;
 //BA.debugLineNum = 185335858;BA.debugLine="newExecution.Put(\"position\", NewCounter+2)";
_newexecution.Put((Object)("position"),(Object)(_newcounter+2));
RDebugUtils.currentLine=185335859;
 //BA.debugLineNum = 185335859;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=185335860;
 //BA.debugLineNum = 185335860;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=185335861;
 //BA.debugLineNum = 185335861;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=185335862;
 //BA.debugLineNum = 185335862;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=185335863;
 //BA.debugLineNum = 185335863;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=185335865;
 //BA.debugLineNum = 185335865;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=185335866;
 //BA.debugLineNum = 185335866;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=185335867;
 //BA.debugLineNum = 185335867;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=185335868;
 //BA.debugLineNum = 185335868;BA.debugLine="newExecution.Put(\"repeatcounter\", NewCounter)";
_newexecution.Put((Object)("repeatcounter"),(Object)(_newcounter));
RDebugUtils.currentLine=185335869;
 //BA.debugLineNum = 185335869;BA.debugLine="newExecution.Put(\"sess_user\", ShareCode.SESS_O";
_newexecution.Put((Object)("sess_user"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=185335870;
 //BA.debugLineNum = 185335870;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=185335871;
 //BA.debugLineNum = 185335871;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185335872;
 //BA.debugLineNum = 185335872;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=185335873;
 //BA.debugLineNum = 185335873;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=185335874;
 //BA.debugLineNum = 185335874;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=185335876;
 //BA.debugLineNum = 185335876;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_request.trim(),"");
RDebugUtils.currentLine=185335878;
 //BA.debugLineNum = 185335878;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=185335879;
 //BA.debugLineNum = 185335879;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, \n"+"				task_tagcode,item_tagcode,unique_key,\n"+"				tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"+"				select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"				x.execute_value, x.execute_format_title,x.confirmed, x.changed_value, x.repeatcounter\n"+"				from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, a.position As relposition,\n"+"				'' as execute_value, Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newcounter))+" AS repeatcounter\n"+"				from dta_requests_relations as a\n"+"				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tasktagcode))+"' and a.repeatcounter= "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newcounter))+" \n"+"				) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=185335896;
 //BA.debugLineNum = 185335896;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185335896",_ssql,0);
RDebugUtils.currentLine=185335897;
 //BA.debugLineNum = 185335897;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions\",sSQL, Requ";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions",_ssql,_request.trim());
RDebugUtils.currentLine=185335901;
 //BA.debugLineNum = 185335901;BA.debugLine="Dim r1  As ResumableSub = UploadNewRequestRel2";
_r1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r1 = _uploadnewrequestrel2server(_request.trim(),_tasktagcode,BA.NumberToString(_newcounter),_newrequestitem);
RDebugUtils.currentLine=185335902;
 //BA.debugLineNum = 185335902;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "checktyperequestnewtask"), _r1);
this.state = 13;
return;
case 13:
//C
this.state = 10;
_finished = (Boolean) result[0];
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=185335908;
 //BA.debugLineNum = 185335908;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "checktyperequestnewtask"),(int) (250));
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=185335910;
 //BA.debugLineNum = 185335910;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=185335911;
 //BA.debugLineNum = 185335911;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadnewrequestrel2server(String _tagcode,String _relation,String _counter,anywheresoftware.b4a.objects.collections.Map _items) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequestrel2server", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "uploadnewrequestrel2server", new Object[] {_tagcode,_relation,_counter,_items}));}
ResumableSub_UploadNewRequestRel2Server rsub = new ResumableSub_UploadNewRequestRel2Server(null,_tagcode,_relation,_counter,_items);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadNewRequestRel2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequestRel2Server(xevolution.vrcg.devdemov2400.taskscl2 parent,String _tagcode,String _relation,String _counter,anywheresoftware.b4a.objects.collections.Map _items) {
this.parent = parent;
this._tagcode = _tagcode;
this._relation = _relation;
this._counter = _counter;
this._items = _items;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _tagcode;
String _relation;
String _counter;
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
RDebugUtils.currentModule="taskscl2";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185466881;
 //BA.debugLineNum = 185466881;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185466882;
 //BA.debugLineNum = 185466882;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=185466883;
 //BA.debugLineNum = 185466883;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=185466884;
 //BA.debugLineNum = 185466884;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185466885;
 //BA.debugLineNum = 185466885;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=185466886;
 //BA.debugLineNum = 185466886;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=185466887;
 //BA.debugLineNum = 185466887;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=185466888;
 //BA.debugLineNum = 185466888;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=185466889;
 //BA.debugLineNum = 185466889;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=185466890;
 //BA.debugLineNum = 185466890;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=185466891;
 //BA.debugLineNum = 185466891;BA.debugLine="params.Put(\"_relation\", relation)";
_params.Put((Object)("_relation"),(Object)(_relation));
RDebugUtils.currentLine=185466892;
 //BA.debugLineNum = 185466892;BA.debugLine="params.Put(\"_repeatcounter\", counter)";
_params.Put((Object)("_repeatcounter"),(Object)(_counter));
RDebugUtils.currentLine=185466893;
 //BA.debugLineNum = 185466893;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=185466894;
 //BA.debugLineNum = 185466894;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=185466895;
 //BA.debugLineNum = 185466895;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=185466896;
 //BA.debugLineNum = 185466896;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=185466897;
 //BA.debugLineNum = 185466897;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=185466898;
 //BA.debugLineNum = 185466898;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=185466899;
 //BA.debugLineNum = 185466899;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=185466901;
 //BA.debugLineNum = 185466901;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=185466902;
 //BA.debugLineNum = 185466902;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=185466903;
 //BA.debugLineNum = 185466903;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=185466905;
 //BA.debugLineNum = 185466905;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/rel-new");
RDebugUtils.currentLine=185466907;
 //BA.debugLineNum = 185466907;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 18;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=185466908;
 //BA.debugLineNum = 185466908;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=185466909;
 //BA.debugLineNum = 185466909;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",taskscl2.getObject());
RDebugUtils.currentLine=185466910;
 //BA.debugLineNum = 185466910;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=185466911;
 //BA.debugLineNum = 185466911;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=185466912;
 //BA.debugLineNum = 185466912;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "uploadnewrequestrel2server"), (Object)(_job));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=185466913;
 //BA.debugLineNum = 185466913;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 15;
this.catchState = 14;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 14;
RDebugUtils.currentLine=185466914;
 //BA.debugLineNum = 185466914;BA.debugLine="If Job.Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_job._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=185466915;
 //BA.debugLineNum = 185466915;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185466915",_job._getstring /*String*/ (null),0);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=185466917;
 //BA.debugLineNum = 185466917;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185466918;
 //BA.debugLineNum = 185466918;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Work";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=185466921;
 //BA.debugLineNum = 185466921;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185466921",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=185466922;
 //BA.debugLineNum = 185466922;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185466923;
 //BA.debugLineNum = 185466923;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 0;
;
RDebugUtils.currentLine=185466926;
 //BA.debugLineNum = 185466926;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=185466928;
 //BA.debugLineNum = 185466928;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185466929;
 //BA.debugLineNum = 185466929;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=185466931;
 //BA.debugLineNum = 185466931;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=185466932;
 //BA.debugLineNum = 185466932;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checktyperequestnewtask2(String _request,String _action) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checktyperequestnewtask2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checktyperequestnewtask2", new Object[] {_request,_action}));}
ResumableSub_CheckTypeRequestNewTask2 rsub = new ResumableSub_CheckTypeRequestNewTask2(null,_request,_action);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckTypeRequestNewTask2 extends BA.ResumableSub {
public ResumableSub_CheckTypeRequestNewTask2(xevolution.vrcg.devdemov2400.taskscl2 parent,String _request,String _action) {
this.parent = parent;
this._request = _request;
this._action = _action;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _request;
String _action;
String _request_type = "";
int _tr_is_model = 0;
String _object_tagcode = "";
String _object_group = "";
String _objectdatevalue = "";
long _dtval = 0L;
long _dtnow = 0L;
boolean _cancreatenewcl = false;
String _tasktagcode = "";
int _existchecklist = 0;
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
int _newcounter = 0;
String _newdate = "";
String _newtime = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
String _ssql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r1 = null;
boolean _finished = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185401349;
 //BA.debugLineNum = 185401349;BA.debugLine="Dim request_type As String = DBStructures.GetScri";
_request_type = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(typerequest_tagcode, '') as valor\n"+"													from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'"),"valor");
RDebugUtils.currentLine=185401351;
 //BA.debugLineNum = 185401351;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScriptCo";
_tr_is_model = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select ifnull(tr_is_model, '0') as valor\n"+"													from dta_typerequests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type.trim()))+"'"),"valor");
RDebugUtils.currentLine=185401354;
 //BA.debugLineNum = 185401354;BA.debugLine="Dim object_tagcode As String = DBStructures.GetSc";
_object_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(object_tagcode, '') as valor\n"+"													from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'"),"valor");
RDebugUtils.currentLine=185401357;
 //BA.debugLineNum = 185401357;BA.debugLine="Dim object_group As String = DBStructures.GetScri";
_object_group = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(object_group, '') as valor\n"+"													from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'"),"valor");
RDebugUtils.currentLine=185401360;
 //BA.debugLineNum = 185401360;BA.debugLine="Dim ObjectDateValue As String = DBStructures.GetS";
_objectdatevalue = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(value, '') as valor\n"+"													from dta_objects_fields where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"' \n"+"													and field_tagcode='FIELD_PROXIMA_VERIF'"),"valor");
RDebugUtils.currentLine=185401365;
 //BA.debugLineNum = 185401365;BA.debugLine="Try";
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
RDebugUtils.currentLine=185401366;
 //BA.debugLineNum = 185401366;BA.debugLine="Dim DtVal As Long = DateTime.DateParse(ObjectDat";
_dtval = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_objectdatevalue);
RDebugUtils.currentLine=185401367;
 //BA.debugLineNum = 185401367;BA.debugLine="Dim DtNow As Long = DateTime.DateParse(Utils.Get";
_dtnow = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=185401368;
 //BA.debugLineNum = 185401368;BA.debugLine="Dim CanCreateNewCL As Boolean = Utils.NNE(Object";
_cancreatenewcl = parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_objectdatevalue) && (_dtnow>=_dtval);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=185401370;
 //BA.debugLineNum = 185401370;BA.debugLine="Dim CanCreateNewCL As Boolean = False";
_cancreatenewcl = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=185401371;
 //BA.debugLineNum = 185401371;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185401371",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
RDebugUtils.currentLine=185401374;
 //BA.debugLineNum = 185401374;BA.debugLine="Dim CanCreateNewCL As Boolean = Utils.NNE(ObjectD";
_cancreatenewcl = parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_objectdatevalue) && (_dtnow>=_dtval);
RDebugUtils.currentLine=185401376;
 //BA.debugLineNum = 185401376;BA.debugLine="If Utils.NNE(request_type) And Utils.NNE(object_t";
if (true) break;

case 7:
//if
this.state = 18;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_request_type) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_object_tagcode) && (_tr_is_model==1) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_object_group) && (_cancreatenewcl)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=185401378;
 //BA.debugLineNum = 185401378;BA.debugLine="Dim taskTagcode As String = DBStructures.GetScri";
_tasktagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("Select ifnull(tagcode, '') as valor\n"+"											from dta_tasks\n"+"											where task_type_mode='TTMT_04'\n"+"												And connect2data like '%'||(Select distinct i.object_type from dta_objects As i\n"+"													where i.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'\n"+"													And i.object_group in (\n"+"														Select tagcode from dta_objecttypes_groups \n"+"														where objtyp_tagcode=i.object_type\n"+"														And tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_group.trim()))+"'\n"+"													))||'%'\n"+"												And parent_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_group.trim()))+"'\n"+"												limit 1"),"valor");
RDebugUtils.currentLine=185401391;
 //BA.debugLineNum = 185401391;BA.debugLine="Dim ExistChecklist As Int = DBStructures.GetScri";
_existchecklist = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("Select count(relation_tagcode) As valor\n"+"						from dta_requests_relations where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type.trim()))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tasktagcode.trim()))+"'"),"valor");
RDebugUtils.currentLine=185401394;
 //BA.debugLineNum = 185401394;BA.debugLine="If (ExistChecklist = 0) Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_existchecklist==0)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=185401395;
 //BA.debugLineNum = 185401395;BA.debugLine="If Utils.NNE(taskTagcode) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_tasktagcode)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=185401396;
 //BA.debugLineNum = 185401396;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185401397;
 //BA.debugLineNum = 185401397;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=185401398;
 //BA.debugLineNum = 185401398;BA.debugLine="Dim NewCounter As Int = 0";
_newcounter = (int) (0);
RDebugUtils.currentLine=185401400;
 //BA.debugLineNum = 185401400;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=185401401;
 //BA.debugLineNum = 185401401;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeEx";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=185401403;
 //BA.debugLineNum = 185401403;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations","id","")+1+1000000);
RDebugUtils.currentLine=185401404;
 //BA.debugLineNum = 185401404;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185401405;
 //BA.debugLineNum = 185401405;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=185401406;
 //BA.debugLineNum = 185401406;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=185401407;
 //BA.debugLineNum = 185401407;BA.debugLine="newExecution.Put(\"request_tagcode\", Request.tr";
_newexecution.Put((Object)("request_tagcode"),(Object)(_request.trim()));
RDebugUtils.currentLine=185401408;
 //BA.debugLineNum = 185401408;BA.debugLine="newExecution.Put(\"relation_tagcode\", taskTagco";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tasktagcode));
RDebugUtils.currentLine=185401409;
 //BA.debugLineNum = 185401409;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=185401410;
 //BA.debugLineNum = 185401410;BA.debugLine="newExecution.Put(\"position\", NewCounter+2)";
_newexecution.Put((Object)("position"),(Object)(_newcounter+2));
RDebugUtils.currentLine=185401411;
 //BA.debugLineNum = 185401411;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=185401412;
 //BA.debugLineNum = 185401412;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=185401413;
 //BA.debugLineNum = 185401413;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=185401414;
 //BA.debugLineNum = 185401414;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=185401415;
 //BA.debugLineNum = 185401415;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=185401417;
 //BA.debugLineNum = 185401417;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=185401418;
 //BA.debugLineNum = 185401418;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=185401419;
 //BA.debugLineNum = 185401419;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=185401420;
 //BA.debugLineNum = 185401420;BA.debugLine="newExecution.Put(\"repeatcounter\", NewCounter)";
_newexecution.Put((Object)("repeatcounter"),(Object)(_newcounter));
RDebugUtils.currentLine=185401421;
 //BA.debugLineNum = 185401421;BA.debugLine="newExecution.Put(\"sess_user\", ShareCode.SESS_O";
_newexecution.Put((Object)("sess_user"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=185401422;
 //BA.debugLineNum = 185401422;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=185401423;
 //BA.debugLineNum = 185401423;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185401424;
 //BA.debugLineNum = 185401424;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=185401425;
 //BA.debugLineNum = 185401425;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=185401426;
 //BA.debugLineNum = 185401426;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=185401428;
 //BA.debugLineNum = 185401428;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_request.trim(),"");
RDebugUtils.currentLine=185401430;
 //BA.debugLineNum = 185401430;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=185401431;
 //BA.debugLineNum = 185401431;BA.debugLine="Dim sSQL As String = $\"insert into dta_request";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"+"					select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"+"					from (select d.id, a.request_tagcode, b.tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"+"					c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) AS position, \n"+"					a.position As relposition, '' as execute_value, \n"+"					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"					0 as confirmed, '' as changed_value, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newcounter))+" AS repeatcounter\n"+"					from dta_requests_relations as a\n"+"					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"					where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tasktagcode))+"' and a.repeatcounter= "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newcounter))+" \n"+"					) as x order by x.relposition,  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=185401448;
 //BA.debugLineNum = 185401448;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185401448",_ssql,0);
RDebugUtils.currentLine=185401449;
 //BA.debugLineNum = 185401449;BA.debugLine="Utils.SaveSQLToLog(\"butCallActions\",sSQL, Requ";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butCallActions",_ssql,_request.trim());
RDebugUtils.currentLine=185401453;
 //BA.debugLineNum = 185401453;BA.debugLine="Dim r1  As ResumableSub = UploadNewRequestRel2";
_r1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r1 = _uploadnewrequestrel2server(_request.trim(),_tasktagcode,BA.NumberToString(_newcounter),_newrequestitem);
RDebugUtils.currentLine=185401454;
 //BA.debugLineNum = 185401454;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "checktyperequestnewtask2"), _r1);
this.state = 19;
return;
case 19:
//C
this.state = 16;
_finished = (Boolean) result[0];
;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=185401459;
 //BA.debugLineNum = 185401459;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "checktyperequestnewtask2"),(int) (250));
this.state = 20;
return;
case 20:
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
this.state = -1;
;
RDebugUtils.currentLine=185401462;
 //BA.debugLineNum = 185401462;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=185401463;
 //BA.debugLineNum = 185401463;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checktyperequesttaskadds(String _request,String _action) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checktyperequesttaskadds", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checktyperequesttaskadds", new Object[] {_request,_action}));}
ResumableSub_CheckTypeRequestTaskAdds rsub = new ResumableSub_CheckTypeRequestTaskAdds(null,_request,_action);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckTypeRequestTaskAdds extends BA.ResumableSub {
public ResumableSub_CheckTypeRequestTaskAdds(xevolution.vrcg.devdemov2400.taskscl2 parent,String _request,String _action) {
this.parent = parent;
this._request = _request;
this._action = _action;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _request;
String _action;
String _request_type = "";
String _object_tagcode = "";
anywheresoftware.b4a.objects.collections.Map _questparams = null;
int _update_object_fields = 0;
anywheresoftware.b4a.objects.collections.List _updobjfls_settings = null;
anywheresoftware.b4a.objects.collections.Map _colupdobjfls_settings = null;
String _field_name = "";
int _is_additional = 0;
int _is_address = 0;
String _updcndvalue = "";
int _update_value_type = 0;
String _script = "";
String _external_tagcode = "";
int _is_contact = 0;
boolean _continuarupdt = false;
String _updtvalue = "";
String _tempvalue = "";
int _itempvalue = 0;
String _updsqlrec = "";
boolean _updateserver = false;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185270277;
 //BA.debugLineNum = 185270277;BA.debugLine="Dim request_type As String = DBStructures.GetScri";
_request_type = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(typerequest_tagcode, '') as valor\n"+"													from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'"),"valor");
RDebugUtils.currentLine=185270279;
 //BA.debugLineNum = 185270279;BA.debugLine="Dim object_tagcode As String = DBStructures.GetSc";
_object_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(object_tagcode, '') as valor\n"+"													from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request.trim()))+"'"),"valor");
RDebugUtils.currentLine=185270281;
 //BA.debugLineNum = 185270281;BA.debugLine="If Utils.NNE(request_type) And Utils.NNE(object_t";
if (true) break;

case 1:
//if
this.state = 80;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_request_type) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_object_tagcode)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=185270282;
 //BA.debugLineNum = 185270282;BA.debugLine="Dim QuestParams As Map = DBStructures.GetScriptC";
_questparams = new anywheresoftware.b4a.objects.collections.Map();
_questparams = parent.mostCurrent._dbstructures._getscriptcolumnstrevcjsonmap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,("select distinct paramters \n"+"												from dta_typerequests_tasks_adds where 1=1\n"+"												And typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type.trim()))+"'\n"+"												And task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_action.trim()))+"'"),"paramters");
RDebugUtils.currentLine=185270287;
 //BA.debugLineNum = 185270287;BA.debugLine="Try";
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
RDebugUtils.currentLine=185270288;
 //BA.debugLineNum = 185270288;BA.debugLine="Dim update_object_fields As Int = QuestParams.G";
_update_object_fields = (int)(BA.ObjectToNumber(_questparams.Get((Object)("update_object_fields"))));
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=185270290;
 //BA.debugLineNum = 185270290;BA.debugLine="Dim update_object_fields As Int = 0";
_update_object_fields = (int) (0);
RDebugUtils.currentLine=185270291;
 //BA.debugLineNum = 185270291;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185270291",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=185270294;
 //BA.debugLineNum = 185270294;BA.debugLine="If Utils.Int2Bool(update_object_fields) Then";

case 9:
//if
this.state = 79;
this.catchState = 0;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_update_object_fields)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=185270295;
 //BA.debugLineNum = 185270295;BA.debugLine="Dim updobjfls_settings As List = QuestParams.Ge";
_updobjfls_settings = new anywheresoftware.b4a.objects.collections.List();
_updobjfls_settings = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_questparams.Get((Object)("updobjfls_settings"))));
RDebugUtils.currentLine=185270296;
 //BA.debugLineNum = 185270296;BA.debugLine="For Each colupdobjfls_settings As Map In updobj";
if (true) break;

case 12:
//for
this.state = 78;
_colupdobjfls_settings = new anywheresoftware.b4a.objects.collections.Map();
group13 = _updobjfls_settings;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 81;
if (true) break;

case 81:
//C
this.state = 78;
if (index13 < groupLen13) {
this.state = 14;
_colupdobjfls_settings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group13.Get(index13)));}
if (true) break;

case 82:
//C
this.state = 81;
index13++;
if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=185270298;
 //BA.debugLineNum = 185270298;BA.debugLine="Dim field_name As String = colupdobjfls_settin";
_field_name = BA.ObjectToString(_colupdobjfls_settings.Get((Object)("field_name")));
RDebugUtils.currentLine=185270299;
 //BA.debugLineNum = 185270299;BA.debugLine="Dim is_additional As Int = colupdobjfls_settin";
_is_additional = (int)(BA.ObjectToNumber(_colupdobjfls_settings.Get((Object)("is_additional"))));
RDebugUtils.currentLine=185270300;
 //BA.debugLineNum = 185270300;BA.debugLine="Dim is_address As Int = colupdobjfls_settings.";
_is_address = (int)(BA.ObjectToNumber(_colupdobjfls_settings.Get((Object)("is_address"))));
RDebugUtils.currentLine=185270301;
 //BA.debugLineNum = 185270301;BA.debugLine="Dim UPDCNDValue As String = colupdobjfls_setti";
_updcndvalue = BA.ObjectToString(_colupdobjfls_settings.Get((Object)("value")));
RDebugUtils.currentLine=185270303;
 //BA.debugLineNum = 185270303;BA.debugLine="Dim update_value_type As Int = colupdobjfls_se";
_update_value_type = (int)(BA.ObjectToNumber(_colupdobjfls_settings.Get((Object)("update_value_type"))));
RDebugUtils.currentLine=185270304;
 //BA.debugLineNum = 185270304;BA.debugLine="Dim script As String = colupdobjfls_settings.G";
_script = BA.ObjectToString(_colupdobjfls_settings.Get((Object)("script")));
RDebugUtils.currentLine=185270305;
 //BA.debugLineNum = 185270305;BA.debugLine="Dim external_tagcode As String = colupdobjfls_";
_external_tagcode = BA.ObjectToString(_colupdobjfls_settings.Get((Object)("external_tagcode")));
RDebugUtils.currentLine=185270306;
 //BA.debugLineNum = 185270306;BA.debugLine="Dim is_contact As Int = colupdobjfls_settings.";
_is_contact = (int)(BA.ObjectToNumber(_colupdobjfls_settings.Get((Object)("is_contact"))));
RDebugUtils.currentLine=185270321;
 //BA.debugLineNum = 185270321;BA.debugLine="Dim ContinuarUPDT As Boolean = (update_value_t";
_continuarupdt = (_update_value_type>=1);
RDebugUtils.currentLine=185270322;
 //BA.debugLineNum = 185270322;BA.debugLine="Dim UPDTValue As String = \"\"";
_updtvalue = "";
RDebugUtils.currentLine=185270324;
 //BA.debugLineNum = 185270324;BA.debugLine="If (update_value_type = 1) Then 'Data";
if (true) break;

case 15:
//if
this.state = 47;
if ((_update_value_type==1)) { 
this.state = 17;
}else 
{RDebugUtils.currentLine=185270326;
 //BA.debugLineNum = 185270326;BA.debugLine="Else If (update_value_type = 2) Then 'Hora";
if ((_update_value_type==2)) { 
this.state = 19;
}else 
{RDebugUtils.currentLine=185270328;
 //BA.debugLineNum = 185270328;BA.debugLine="Else If (update_value_type = 3) Then 'Datahora";
if ((_update_value_type==3)) { 
this.state = 21;
}else 
{RDebugUtils.currentLine=185270330;
 //BA.debugLineNum = 185270330;BA.debugLine="Else If (update_value_type = 4) Then 'Incremen";
if ((_update_value_type==4)) { 
this.state = 23;
}else 
{RDebugUtils.currentLine=185270349;
 //BA.debugLineNum = 185270349;BA.debugLine="Else If (update_value_type = 5) Then 'Identifi";
if ((_update_value_type==5)) { 
this.state = 40;
}else 
{RDebugUtils.currentLine=185270350;
 //BA.debugLineNum = 185270350;BA.debugLine="Else If (update_value_type = 6) Then 'Valor de";
if ((_update_value_type==6)) { 
this.state = 42;
}else 
{RDebugUtils.currentLine=185270351;
 //BA.debugLineNum = 185270351;BA.debugLine="Else If (update_value_type = 7) Then 'Valor es";
if ((_update_value_type==7)) { 
this.state = 44;
}else 
{RDebugUtils.currentLine=185270353;
 //BA.debugLineNum = 185270353;BA.debugLine="Else If (update_value_type = 8) Then 'script (";
if ((_update_value_type==8)) { 
this.state = 46;
}}}}}}}}
if (true) break;

case 17:
//C
this.state = 47;
RDebugUtils.currentLine=185270325;
 //BA.debugLineNum = 185270325;BA.debugLine="UPDTValue = Utils.GetCurrentDate";
_updtvalue = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 19:
//C
this.state = 47;
RDebugUtils.currentLine=185270327;
 //BA.debugLineNum = 185270327;BA.debugLine="UPDTValue = Utils.GetCurrentTimeExt";
_updtvalue = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 21:
//C
this.state = 47;
RDebugUtils.currentLine=185270329;
 //BA.debugLineNum = 185270329;BA.debugLine="UPDTValue = Utils.GetCurrDatetimeExt";
_updtvalue = parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=185270331;
 //BA.debugLineNum = 185270331;BA.debugLine="Dim TempValue As String = \"\"";
_tempvalue = "";
RDebugUtils.currentLine=185270332;
 //BA.debugLineNum = 185270332;BA.debugLine="If Utils.Int2Bool(is_additional) Then";
if (true) break;

case 24:
//if
this.state = 29;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_is_additional)) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=185270333;
 //BA.debugLineNum = 185270333;BA.debugLine="Dim TempValue As String = DBStructures.GetSc";
_tempvalue = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(value, '0') as valor\n"+"													from dta_objects_fields where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"' \n"+"													and field_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_name.trim()))+"'"),"valor");
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=185270337;
 //BA.debugLineNum = 185270337;BA.debugLine="Dim TempValue As String = DBStructures.GetSc";
_tempvalue = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_name.trim()))+", '0') as valor\n"+"													from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'"),"valor");
 if (true) break;
;
RDebugUtils.currentLine=185270341;
 //BA.debugLineNum = 185270341;BA.debugLine="If Utils.NNE(TempValue) Then";

case 29:
//if
this.state = 38;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_tempvalue)) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=185270342;
 //BA.debugLineNum = 185270342;BA.debugLine="Try";
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
RDebugUtils.currentLine=185270343;
 //BA.debugLineNum = 185270343;BA.debugLine="Dim iTempValue As Int = TempValue + 1";
_itempvalue = (int) ((double)(Double.parseDouble(_tempvalue))+1);
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 0;
RDebugUtils.currentLine=185270345;
 //BA.debugLineNum = 185270345;BA.debugLine="Dim iTempValue As Int = 1";
_itempvalue = (int) (1);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
;
RDebugUtils.currentLine=185270347;
 //BA.debugLineNum = 185270347;BA.debugLine="UPDTValue = iTempValue";
_updtvalue = BA.NumberToString(_itempvalue);
 if (true) break;

case 38:
//C
this.state = 47;
;
 if (true) break;

case 40:
//C
this.state = 47;
 if (true) break;

case 42:
//C
this.state = 47;
 if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=185270352;
 //BA.debugLineNum = 185270352;BA.debugLine="UPDTValue = UPDCNDValue";
_updtvalue = _updcndvalue;
 if (true) break;

case 46:
//C
this.state = 47;
 if (true) break;
;
RDebugUtils.currentLine=185270356;
 //BA.debugLineNum = 185270356;BA.debugLine="If (ContinuarUPDT) Then";

case 47:
//if
this.state = 77;
if ((_continuarupdt)) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=185270358;
 //BA.debugLineNum = 185270358;BA.debugLine="If Utils.Int2Bool(is_additional) Then";
if (true) break;

case 50:
//if
this.state = 55;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_is_additional)) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
RDebugUtils.currentLine=185270359;
 //BA.debugLineNum = 185270359;BA.debugLine="Dim updSQLRec As String = $\"update dta_objec";
_updsqlrec = ("update dta_objects_fields set value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updtvalue))+"'\n"+"																			where 1=1\n"+"																			and object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"' \n"+"																			and field_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_name.trim()))+"'");
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=185270364;
 //BA.debugLineNum = 185270364;BA.debugLine="Dim updSQLRec As String = $\"update dta_objec";
_updsqlrec = ("update dta_objects set "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_name.trim()))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updtvalue))+"'\n"+"																			where 1=1\n"+"																			and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'");
 if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=185270369;
 //BA.debugLineNum = 185270369;BA.debugLine="Log(updSQLRec)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185270369",_updsqlrec,0);
RDebugUtils.currentLine=185270370;
 //BA.debugLineNum = 185270370;BA.debugLine="Dim UpdateServer As Boolean = True";
_updateserver = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=185270371;
 //BA.debugLineNum = 185270371;BA.debugLine="Try";
if (true) break;

case 56:
//try
this.state = 61;
this.catchState = 60;
this.state = 58;
if (true) break;

case 58:
//C
this.state = 61;
this.catchState = 60;
RDebugUtils.currentLine=185270372;
 //BA.debugLineNum = 185270372;BA.debugLine="Utils.SaveSQLToLog(\"ListReturn3\",updSQLRec,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"ListReturn3",_updsqlrec,_object_tagcode);
 if (true) break;

case 60:
//C
this.state = 61;
this.catchState = 0;
RDebugUtils.currentLine=185270374;
 //BA.debugLineNum = 185270374;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185270374",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=185270375;
 //BA.debugLineNum = 185270375;BA.debugLine="Dim UpdateServer As Boolean = False";
_updateserver = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=185270378;
 //BA.debugLineNum = 185270378;BA.debugLine="If (UpdateServer) Then";

case 61:
//if
this.state = 76;
this.catchState = 0;
if ((_updateserver)) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=185270379;
 //BA.debugLineNum = 185270379;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185270380;
 //BA.debugLineNum = 185270380;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=185270381;
 //BA.debugLineNum = 185270381;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=185270382;
 //BA.debugLineNum = 185270382;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=185270383;
 //BA.debugLineNum = 185270383;BA.debugLine="params.Put(\"ACLAObject\", object_tagcode.trim";
_params.Put((Object)("ACLAObject"),(Object)(_object_tagcode.trim()));
RDebugUtils.currentLine=185270384;
 //BA.debugLineNum = 185270384;BA.debugLine="params.Put(\"ACLAField\", field_name.trim)";
_params.Put((Object)("ACLAField"),(Object)(_field_name.trim()));
RDebugUtils.currentLine=185270385;
 //BA.debugLineNum = 185270385;BA.debugLine="params.Put(\"ACLAValue\", UPDTValue)";
_params.Put((Object)("ACLAValue"),(Object)(_updtvalue));
RDebugUtils.currentLine=185270386;
 //BA.debugLineNum = 185270386;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTag";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=185270387;
 //BA.debugLineNum = 185270387;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuth";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=185270388;
 //BA.debugLineNum = 185270388;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=185270389;
 //BA.debugLineNum = 185270389;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=185270390;
 //BA.debugLineNum = 185270390;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=185270391;
 //BA.debugLineNum = 185270391;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceM";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=185270392;
 //BA.debugLineNum = 185270392;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=185270393;
 //BA.debugLineNum = 185270393;BA.debugLine="Dim Url As String = $\"https://${ShareCode.AP";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/cla/object/field/update");
RDebugUtils.currentLine=185270394;
 //BA.debugLineNum = 185270394;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_";
if (true) break;

case 64:
//if
this.state = 75;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 66;
}else {
this.state = 74;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=185270395;
 //BA.debugLineNum = 185270395;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 67:
//if
this.state = 72;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
RDebugUtils.currentLine=185270396;
 //BA.debugLineNum = 185270396;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", \"\")";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,taskscl2.getObject(),_url,"","");
 if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=185270398;
 //BA.debugLineNum = 185270398;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Make";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (3),_object_tagcode.trim(),"","");
RDebugUtils.currentLine=185270399;
 //BA.debugLineNum = 185270399;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(par";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 72:
//C
this.state = 75;
;
RDebugUtils.currentLine=185270401;
 //BA.debugLineNum = 185270401;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "checktyperequesttaskadds"),(int) (500));
this.state = 83;
return;
case 83:
//C
this.state = 75;
;
 if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=185270403;
 //BA.debugLineNum = 185270403;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeW";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (3),_object_tagcode.trim(),"","");
RDebugUtils.currentLine=185270404;
 //BA.debugLineNum = 185270404;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(para";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 75:
//C
this.state = 76;
;
 if (true) break;

case 76:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 82;
;
 if (true) break;
if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = 80;
;
RDebugUtils.currentLine=185270412;
 //BA.debugLineNum = 185270412;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "checktyperequesttaskadds"),(int) (250));
this.state = 84;
return;
case 84:
//C
this.state = 80;
;
 if (true) break;

case 80:
//C
this.state = -1;
;
RDebugUtils.currentLine=185270414;
 //BA.debugLineNum = 185270414;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=185270415;
 //BA.debugLineNum = 185270415;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _clainewsvrvarvalue(String _request_tagcode,String _task_tagcode,String _chapter_uk,int _rc,int _ric) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clainewsvrvarvalue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "clainewsvrvarvalue", new Object[] {_request_tagcode,_task_tagcode,_chapter_uk,_rc,_ric}));}
ResumableSub_ClaiNewSvrVarValue rsub = new ResumableSub_ClaiNewSvrVarValue(null,_request_tagcode,_task_tagcode,_chapter_uk,_rc,_ric);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ClaiNewSvrVarValue extends BA.ResumableSub {
public ResumableSub_ClaiNewSvrVarValue(xevolution.vrcg.devdemov2400.taskscl2 parent,String _request_tagcode,String _task_tagcode,String _chapter_uk,int _rc,int _ric) {
this.parent = parent;
this._request_tagcode = _request_tagcode;
this._task_tagcode = _task_tagcode;
this._chapter_uk = _chapter_uk;
this._rc = _rc;
this._ric = _ric;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _request_tagcode;
String _task_tagcode;
String _chapter_uk;
int _rc;
int _ric;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184352770;
 //BA.debugLineNum = 184352770;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184352771;
 //BA.debugLineNum = 184352771;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=184352772;
 //BA.debugLineNum = 184352772;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=184352773;
 //BA.debugLineNum = 184352773;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184352774;
 //BA.debugLineNum = 184352774;BA.debugLine="params.Put(\"ACLARequest\", request_tagcode.trim)";
_params.Put((Object)("ACLARequest"),(Object)(_request_tagcode.trim()));
RDebugUtils.currentLine=184352775;
 //BA.debugLineNum = 184352775;BA.debugLine="params.Put(\"ACLATask\", task_tagcode.Trim)";
_params.Put((Object)("ACLATask"),(Object)(_task_tagcode.trim()));
RDebugUtils.currentLine=184352776;
 //BA.debugLineNum = 184352776;BA.debugLine="params.Put(\"ACLAUniqueKey\", Chapter_Uk.Trim) ' ch";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_chapter_uk.trim()));
RDebugUtils.currentLine=184352777;
 //BA.debugLineNum = 184352777;BA.debugLine="params.Put(\"ACLAReqCounter\", rc)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_rc));
RDebugUtils.currentLine=184352778;
 //BA.debugLineNum = 184352778;BA.debugLine="params.Put(\"ACLARepeatItem\", ric)";
_params.Put((Object)("ACLARepeatItem"),(Object)(_ric));
RDebugUtils.currentLine=184352780;
 //BA.debugLineNum = 184352780;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=184352781;
 //BA.debugLineNum = 184352781;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=184352782;
 //BA.debugLineNum = 184352782;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=184352783;
 //BA.debugLineNum = 184352783;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=184352784;
 //BA.debugLineNum = 184352784;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=184352785;
 //BA.debugLineNum = 184352785;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=184352786;
 //BA.debugLineNum = 184352786;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184352787;
 //BA.debugLineNum = 184352787;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/new");
RDebugUtils.currentLine=184352788;
 //BA.debugLineNum = 184352788;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
if (true) break;

case 1:
//if
this.state = 12;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=184352789;
 //BA.debugLineNum = 184352789;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=184352790;
 //BA.debugLineNum = 184352790;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", request_t";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,taskscl2.getObject(),_url,"",_request_tagcode.trim());
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=184352792;
 //BA.debugLineNum = 184352792;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_request_tagcode.trim(),_task_tagcode.trim(),"");
RDebugUtils.currentLine=184352793;
 //BA.debugLineNum = 184352793;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=184352795;
 //BA.debugLineNum = 184352795;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "clainewsvrvarvalue"),(int) (250));
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
RDebugUtils.currentLine=184352797;
 //BA.debugLineNum = 184352797;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_request_tagcode.trim(),_task_tagcode.trim(),"");
RDebugUtils.currentLine=184352798;
 //BA.debugLineNum = 184352798;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=184352801;
 //BA.debugLineNum = 184352801;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=184352803;
 //BA.debugLineNum = 184352803;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _claiupdatesvrvarvalue(String _request_tagcode,String _task_tagcode,String _item_tagcode,String _uk,String _tagcode,String _field2set,String _value2set,int _rc,int _ric,int _rfc) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claiupdatesvrvarvalue", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "claiupdatesvrvarvalue", new Object[] {_request_tagcode,_task_tagcode,_item_tagcode,_uk,_tagcode,_field2set,_value2set,_rc,_ric,_rfc}));}
ResumableSub_ClaiUpdateSvrVarValue rsub = new ResumableSub_ClaiUpdateSvrVarValue(null,_request_tagcode,_task_tagcode,_item_tagcode,_uk,_tagcode,_field2set,_value2set,_rc,_ric,_rfc);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ClaiUpdateSvrVarValue extends BA.ResumableSub {
public ResumableSub_ClaiUpdateSvrVarValue(xevolution.vrcg.devdemov2400.taskscl2 parent,String _request_tagcode,String _task_tagcode,String _item_tagcode,String _uk,String _tagcode,String _field2set,String _value2set,int _rc,int _ric,int _rfc) {
this.parent = parent;
this._request_tagcode = _request_tagcode;
this._task_tagcode = _task_tagcode;
this._item_tagcode = _item_tagcode;
this._uk = _uk;
this._tagcode = _tagcode;
this._field2set = _field2set;
this._value2set = _value2set;
this._rc = _rc;
this._ric = _ric;
this._rfc = _rfc;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _request_tagcode;
String _task_tagcode;
String _item_tagcode;
String _uk;
String _tagcode;
String _field2set;
String _value2set;
int _rc;
int _ric;
int _rfc;
String _v2set = "";
String _vt2set = "";
String _t2set = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _aclsessuser = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184418306;
 //BA.debugLineNum = 184418306;BA.debugLine="Log($\"ESCREVE NO BO : ${request_tagcode} ${task_t";
anywheresoftware.b4a.keywords.Common.LogImpl("6184418306",("ESCREVE NO BO : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_tagcode))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field2set))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_value2set))+""),0);
RDebugUtils.currentLine=184418308;
 //BA.debugLineNum = 184418308;BA.debugLine="Dim v2Set As String = \"\"";
_v2set = "";
RDebugUtils.currentLine=184418309;
 //BA.debugLineNum = 184418309;BA.debugLine="Dim vt2Set As String = \"\"";
_vt2set = "";
RDebugUtils.currentLine=184418310;
 //BA.debugLineNum = 184418310;BA.debugLine="Dim t2Set As String = \"\"";
_t2set = "";
RDebugUtils.currentLine=184418312;
 //BA.debugLineNum = 184418312;BA.debugLine="If field2set = \"execute_value\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_field2set).equals("execute_value")) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=184418314;
 //BA.debugLineNum = 184418314;BA.debugLine="Else If field2set = \"execute_value_title\" Then";
if ((_field2set).equals("execute_value_title")) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=184418316;
 //BA.debugLineNum = 184418316;BA.debugLine="Else  If field2set = \"title\" Then";
if ((_field2set).equals("title")) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=184418313;
 //BA.debugLineNum = 184418313;BA.debugLine="v2Set = value2set";
_v2set = _value2set;
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=184418315;
 //BA.debugLineNum = 184418315;BA.debugLine="vt2Set = value2set";
_vt2set = _value2set;
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=184418317;
 //BA.debugLineNum = 184418317;BA.debugLine="t2Set = value2set";
_t2set = _value2set;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=184418319;
 //BA.debugLineNum = 184418319;BA.debugLine="v2Set = value2set";
_v2set = _value2set;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=184418322;
 //BA.debugLineNum = 184418322;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184418323;
 //BA.debugLineNum = 184418323;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=184418324;
 //BA.debugLineNum = 184418324;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=184418325;
 //BA.debugLineNum = 184418325;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184418326;
 //BA.debugLineNum = 184418326;BA.debugLine="params.Put(\"ACLARequest\", request_tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_request_tagcode));
RDebugUtils.currentLine=184418327;
 //BA.debugLineNum = 184418327;BA.debugLine="params.Put(\"ACLAAction\", task_tagcode)";
_params.Put((Object)("ACLAAction"),(Object)(_task_tagcode));
RDebugUtils.currentLine=184418328;
 //BA.debugLineNum = 184418328;BA.debugLine="params.Put(\"ACLATask\", task_tagcode)";
_params.Put((Object)("ACLATask"),(Object)(_task_tagcode));
RDebugUtils.currentLine=184418329;
 //BA.debugLineNum = 184418329;BA.debugLine="params.Put(\"ACLAItem\", item_tagcode)";
_params.Put((Object)("ACLAItem"),(Object)(_item_tagcode));
RDebugUtils.currentLine=184418330;
 //BA.debugLineNum = 184418330;BA.debugLine="params.Put(\"ACLAUniqueKey\", Uk)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_uk));
RDebugUtils.currentLine=184418331;
 //BA.debugLineNum = 184418331;BA.debugLine="params.Put(\"ACLATagcode\", tagcode)";
_params.Put((Object)("ACLATagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=184418332;
 //BA.debugLineNum = 184418332;BA.debugLine="params.Put(\"ACLAValue\", v2Set)";
_params.Put((Object)("ACLAValue"),(Object)(_v2set));
RDebugUtils.currentLine=184418333;
 //BA.debugLineNum = 184418333;BA.debugLine="params.Put(\"ACLAValueTitle\", vt2Set)";
_params.Put((Object)("ACLAValueTitle"),(Object)(_vt2set));
RDebugUtils.currentLine=184418334;
 //BA.debugLineNum = 184418334;BA.debugLine="params.Put(\"ACLATitle\", t2Set)";
_params.Put((Object)("ACLATitle"),(Object)(_t2set));
RDebugUtils.currentLine=184418335;
 //BA.debugLineNum = 184418335;BA.debugLine="params.Put(\"ACLAReqCounter\", rc)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_rc));
RDebugUtils.currentLine=184418336;
 //BA.debugLineNum = 184418336;BA.debugLine="params.Put(\"ACLARepeatItem\", ric)";
_params.Put((Object)("ACLARepeatItem"),(Object)(_ric));
RDebugUtils.currentLine=184418337;
 //BA.debugLineNum = 184418337;BA.debugLine="params.Put(\"ACLARepeatField\", rfc)";
_params.Put((Object)("ACLARepeatField"),(Object)(_rfc));
RDebugUtils.currentLine=184418338;
 //BA.debugLineNum = 184418338;BA.debugLine="params.Put(\"ACLAInner\", 0)";
_params.Put((Object)("ACLAInner"),(Object)(0));
RDebugUtils.currentLine=184418339;
 //BA.debugLineNum = 184418339;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=184418340;
 //BA.debugLineNum = 184418340;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=184418341;
 //BA.debugLineNum = 184418341;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=184418342;
 //BA.debugLineNum = 184418342;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=184418343;
 //BA.debugLineNum = 184418343;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=184418344;
 //BA.debugLineNum = 184418344;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=184418345;
 //BA.debugLineNum = 184418345;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184418346;
 //BA.debugLineNum = 184418346;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDateti";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184418347;
 //BA.debugLineNum = 184418347;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=184418348;
 //BA.debugLineNum = 184418348;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=184418350;
 //BA.debugLineNum = 184418350;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=184418351;
 //BA.debugLineNum = 184418351;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=184418352;
 //BA.debugLineNum = 184418352;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=184418353;
 //BA.debugLineNum = 184418353;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_OPER_U";
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*String*/ ;
RDebugUtils.currentLine=184418355;
 //BA.debugLineNum = 184418355;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
_params.Put((Object)("ACLSessUser"),(Object)(_aclsessuser));
RDebugUtils.currentLine=184418356;
 //BA.debugLineNum = 184418356;BA.debugLine="params.Put(\"ACLClear\", 0)";
_params.Put((Object)("ACLClear"),(Object)(0));
RDebugUtils.currentLine=184418358;
 //BA.debugLineNum = 184418358;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/update");
RDebugUtils.currentLine=184418359;
 //BA.debugLineNum = 184418359;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
if (true) break;

case 11:
//if
this.state = 22;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 13;
}else {
this.state = 21;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=184418360;
 //BA.debugLineNum = 184418360;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 14:
//if
this.state = 19;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=184418361;
 //BA.debugLineNum = 184418361;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", request_t";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,taskscl2.getObject(),_url,"",_request_tagcode);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=184418363;
 //BA.debugLineNum = 184418363;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_request_tagcode.trim(),_task_tagcode.trim(),_item_tagcode.trim());
RDebugUtils.currentLine=184418364;
 //BA.debugLineNum = 184418364;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=184418366;
 //BA.debugLineNum = 184418366;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "claiupdatesvrvarvalue"),(int) (250));
this.state = 23;
return;
case 23:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=184418368;
 //BA.debugLineNum = 184418368;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_request_tagcode.trim(),_task_tagcode.trim(),_item_tagcode.trim());
RDebugUtils.currentLine=184418369;
 //BA.debugLineNum = 184418369;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=184418372;
 //BA.debugLineNum = 184418372;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=184418374;
 //BA.debugLineNum = 184418374;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height,boolean _istrequest) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_cnt,_colitems,_width,_height,_istrequest}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _typeresults_desc = "";
String _taskgroup_desc = "";
String _tagcode = "";
String _title = "";
int _status_id = 0;
String _updated_at = "";
String _dayslastupdate = "";
String _details = "";
String _sttext = "";
RDebugUtils.currentLine=182910976;
 //BA.debugLineNum = 182910976;BA.debugLine="Sub CreateListItem(cnt As Int, colitems As Cursor,";
RDebugUtils.currentLine=182910977;
 //BA.debugLineNum = 182910977;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=182910978;
 //BA.debugLineNum = 182910978;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=182910979;
 //BA.debugLineNum = 182910979;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=182910980;
 //BA.debugLineNum = 182910980;BA.debugLine="If (isTRequest) Then";
if ((_istrequest)) { 
RDebugUtils.currentLine=182910981;
 //BA.debugLineNum = 182910981;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=182910982;
 //BA.debugLineNum = 182910982;BA.debugLine="p.LoadLayout(\"task_itemviewtyperequest\")";
_p.LoadLayout("task_itemviewtyperequest",mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=182910984;
 //BA.debugLineNum = 182910984;BA.debugLine="p.LoadLayout(\"task_itemviewtyperequest\")";
_p.LoadLayout("task_itemviewtyperequest",mostCurrent.activityBA);
 };
 }else {
RDebugUtils.currentLine=182910987;
 //BA.debugLineNum = 182910987;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=182910988;
 //BA.debugLineNum = 182910988;BA.debugLine="p.LoadLayout(\"tasks_itemviewchecklist_2_phone\")";
_p.LoadLayout("tasks_itemviewchecklist_2_phone",mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=182910990;
 //BA.debugLineNum = 182910990;BA.debugLine="p.LoadLayout(\"tasks_itemviewchecklist_2\")";
_p.LoadLayout("tasks_itemviewchecklist_2",mostCurrent.activityBA);
 };
 };
RDebugUtils.currentLine=182910993;
 //BA.debugLineNum = 182910993;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=182910997;
 //BA.debugLineNum = 182910997;BA.debugLine="Dim typeresults_desc As String = colitems.GetStri";
_typeresults_desc = _colitems.GetString("typeresults_desc");
RDebugUtils.currentLine=182910998;
 //BA.debugLineNum = 182910998;BA.debugLine="Dim taskgroup_desc As String = colitems.GetString";
_taskgroup_desc = _colitems.GetString("taskgroup_desc");
RDebugUtils.currentLine=182910999;
 //BA.debugLineNum = 182910999;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=182911000;
 //BA.debugLineNum = 182911000;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
_title = _colitems.GetString("title");
RDebugUtils.currentLine=182911001;
 //BA.debugLineNum = 182911001;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"active\")";
_status_id = _colitems.GetInt("active");
RDebugUtils.currentLine=182911002;
 //BA.debugLineNum = 182911002;BA.debugLine="Dim updated_at As String = colitems.GetString(\"up";
_updated_at = _colitems.GetString("updated_at");
RDebugUtils.currentLine=182911003;
 //BA.debugLineNum = 182911003;BA.debugLine="Dim dayslastupdate As String = colitems.GetInt(\"d";
_dayslastupdate = BA.NumberToString(_colitems.GetInt("dayslastupdate"));
RDebugUtils.currentLine=182911004;
 //BA.debugLineNum = 182911004;BA.debugLine="Dim details As String = colitems.GetString(\"detai";
_details = _colitems.GetString("details");
RDebugUtils.currentLine=182911006;
 //BA.debugLineNum = 182911006;BA.debugLine="ListItemDesc.text = $\"#${cnt} - ${title}\"$";
mostCurrent._listitemdesc.setText(BA.ObjectToCharSequence(("#"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_title))+"")));
RDebugUtils.currentLine=182911007;
 //BA.debugLineNum = 182911007;BA.debugLine="ListItemUpdate.text = $\"${updated_at}\"$";
mostCurrent._listitemupdate.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updated_at))+"")));
RDebugUtils.currentLine=182911008;
 //BA.debugLineNum = 182911008;BA.debugLine="ListItemGroup.text = $\"${taskgroup_desc}\"$";
mostCurrent._listitemgroup.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_taskgroup_desc))+"")));
RDebugUtils.currentLine=182911009;
 //BA.debugLineNum = 182911009;BA.debugLine="ListItemType.text = $\"${typeresults_desc}\"$";
mostCurrent._listitemtype.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_typeresults_desc))+"")));
RDebugUtils.currentLine=182911010;
 //BA.debugLineNum = 182911010;BA.debugLine="listButActions.Tag = tagcode";
mostCurrent._listbutactions.setTag((Object)(_tagcode));
RDebugUtils.currentLine=182911012;
 //BA.debugLineNum = 182911012;BA.debugLine="Dim sttext As String = \"Inactivo\"";
_sttext = "Inactivo";
RDebugUtils.currentLine=182911013;
 //BA.debugLineNum = 182911013;BA.debugLine="If (status_id = 1) Then sttext = \"Activo\"";
if ((_status_id==1)) { 
_sttext = "Activo";};
RDebugUtils.currentLine=182911014;
 //BA.debugLineNum = 182911014;BA.debugLine="ListItemStatus.Text = sttext";
mostCurrent._listitemstatus.setText(BA.ObjectToCharSequence(_sttext));
RDebugUtils.currentLine=182911016;
 //BA.debugLineNum = 182911016;BA.debugLine="If (isTRequest) And Utils.NNE(details) Then";
if ((_istrequest) && mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_details)) { 
RDebugUtils.currentLine=182911017;
 //BA.debugLineNum = 182911017;BA.debugLine="sttext = $\"${details} (${sttext})\"$";
_sttext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_details))+" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sttext))+")");
 };
RDebugUtils.currentLine=182911020;
 //BA.debugLineNum = 182911020;BA.debugLine="If (status_id = 0) Then";
if ((_status_id==0)) { 
RDebugUtils.currentLine=182911021;
 //BA.debugLineNum = 182911021;BA.debugLine="ListItemState.TextColor = Consts.ColorGray";
mostCurrent._listitemstate.setTextColor(mostCurrent._consts._colorgray /*int*/ );
RDebugUtils.currentLine=182911022;
 //BA.debugLineNum = 182911022;BA.debugLine="ListItemState.Text = Chr(0xF088)";
mostCurrent._listitemstate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf088))));
 }else {
RDebugUtils.currentLine=182911024;
 //BA.debugLineNum = 182911024;BA.debugLine="ListItemState.Text = Chr(0xF087)";
mostCurrent._listitemstate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf087))));
RDebugUtils.currentLine=182911025;
 //BA.debugLineNum = 182911025;BA.debugLine="If (dayslastupdate >5) Then";
if (((double)(Double.parseDouble(_dayslastupdate))>5)) { 
RDebugUtils.currentLine=182911026;
 //BA.debugLineNum = 182911026;BA.debugLine="ListItemState.TextColor = Consts.ColorYellow";
mostCurrent._listitemstate.setTextColor(mostCurrent._consts._coloryellow /*int*/ );
 }else {
RDebugUtils.currentLine=182911028;
 //BA.debugLineNum = 182911028;BA.debugLine="ListItemState.TextColor = Consts.ColorGreen";
mostCurrent._listitemstate.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
 };
 };
RDebugUtils.currentLine=182911032;
 //BA.debugLineNum = 182911032;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=182911033;
 //BA.debugLineNum = 182911033;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=182911034;
 //BA.debugLineNum = 182911034;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createrequestentityrelation(String _newrequest,String _newobject) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestentityrelation", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestentityrelation", new Object[] {_newrequest,_newobject}));}
ResumableSub_createRequestEntityRelation rsub = new ResumableSub_createRequestEntityRelation(null,_newrequest,_newobject);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_createRequestEntityRelation extends BA.ResumableSub {
public ResumableSub_createRequestEntityRelation(xevolution.vrcg.devdemov2400.taskscl2 parent,String _newrequest,String _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _newrequest;
String _newobject;
int _maxid = 0;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184614913;
 //BA.debugLineNum = 184614913;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequest) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newobject))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=184614914;
 //BA.debugLineNum = 184614914;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_entities","id","")+1+1000000);
RDebugUtils.currentLine=184614915;
 //BA.debugLineNum = 184614915;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_entities (id, request_tagcode, entity_tagcode, ismaster)\n"+"								values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newobject))+"', 1);");
RDebugUtils.currentLine=184614917;
 //BA.debugLineNum = 184614917;BA.debugLine="Utils.SaveSQLToLog(\"createRequestEntityRelation\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"createRequestEntityRelation",_ssql,_newrequest);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=184614919;
 //BA.debugLineNum = 184614919;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=184614920;
 //BA.debugLineNum = 184614920;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createrequestfields(String _newrequest,String _newrequesttype) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestfields", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestfields", new Object[] {_newrequest,_newrequesttype}));}
ResumableSub_createRequestFields rsub = new ResumableSub_createRequestFields(null,_newrequest,_newrequesttype);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_createRequestFields extends BA.ResumableSub {
public ResumableSub_createRequestFields(xevolution.vrcg.devdemov2400.taskscl2 parent,String _newrequest,String _newrequesttype) {
this.parent = parent;
this._newrequest = _newrequest;
this._newrequesttype = _newrequesttype;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _newrequest;
String _newrequesttype;
String _sql1 = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _resdata = null;
String _sfield = "";
int _maxid = 0;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184483841;
 //BA.debugLineNum = 184483841;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newReques";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequest) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequesttype))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=184483842;
 //BA.debugLineNum = 184483842;BA.debugLine="Dim SQL1 As String = $\"select distinct field_tag";
_sql1 = ("select distinct field_tagcode from dta_typerequests_fields\n"+"								where typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequesttype))+"'");
RDebugUtils.currentLine=184483845;
 //BA.debugLineNum = 184483845;BA.debugLine="Dim ResData As ResultSet = Starter.LocalSQLEVC.E";
_resdata = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_resdata = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql1)));
RDebugUtils.currentLine=184483846;
 //BA.debugLineNum = 184483846;BA.debugLine="Do While ResData.NextRow";
if (true) break;

case 4:
//do while
this.state = 7;
while (_resdata.NextRow()) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
RDebugUtils.currentLine=184483847;
 //BA.debugLineNum = 184483847;BA.debugLine="Dim sfield As String = ResData.GetString(\"field";
_sfield = _resdata.GetString("field_tagcode");
RDebugUtils.currentLine=184483848;
 //BA.debugLineNum = 184483848;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_fields","id","")+1+1000000);
RDebugUtils.currentLine=184483849;
 //BA.debugLineNum = 184483849;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
_ssql = ("insert into dta_requests_fields (id, request_tagcode, field_tagcode) \n"+"								values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sfield))+"');");
RDebugUtils.currentLine=184483851;
 //BA.debugLineNum = 184483851;BA.debugLine="Utils.SaveSQLToLog(\"createRequestFields\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"createRequestFields",_ssql,_newrequest);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=184483853;
 //BA.debugLineNum = 184483853;BA.debugLine="ResData.Close";
_resdata.Close();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=184483856;
 //BA.debugLineNum = 184483856;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=184483857;
 //BA.debugLineNum = 184483857;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createrequestobjectrelation(String _newrequest,String _newobject) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestobjectrelation", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestobjectrelation", new Object[] {_newrequest,_newobject}));}
ResumableSub_createRequestObjectRelation rsub = new ResumableSub_createRequestObjectRelation(null,_newrequest,_newobject);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_createRequestObjectRelation extends BA.ResumableSub {
public ResumableSub_createRequestObjectRelation(xevolution.vrcg.devdemov2400.taskscl2 parent,String _newrequest,String _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _newrequest;
String _newobject;
int _maxid = 0;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184549377;
 //BA.debugLineNum = 184549377;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequest) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newobject))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=184549378;
 //BA.debugLineNum = 184549378;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_objects","id","")+1+1000000);
RDebugUtils.currentLine=184549379;
 //BA.debugLineNum = 184549379;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_objects (id, request_tagcode, object_tagcode, ismaster)\n"+"								values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newobject))+"', 1);");
RDebugUtils.currentLine=184549381;
 //BA.debugLineNum = 184549381;BA.debugLine="Utils.SaveSQLToLog(\"createRequestObjectRelation\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"createRequestObjectRelation",_ssql,_newrequest);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=184549383;
 //BA.debugLineNum = 184549383;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=184549384;
 //BA.debugLineNum = 184549384;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _editreturn(String _arg) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editreturn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editreturn", new Object[] {_arg}));}
RDebugUtils.currentLine=182714368;
 //BA.debugLineNum = 182714368;BA.debugLine="Sub EditReturn(arg As String)";
RDebugUtils.currentLine=182714370;
 //BA.debugLineNum = 182714370;BA.debugLine="End Sub";
return "";
}
public static String  _editsearch_enterpressed() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editsearch_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editsearch_enterpressed", null));}
RDebugUtils.currentLine=183762944;
 //BA.debugLineNum = 183762944;BA.debugLine="Sub EditSearch_EnterPressed";
RDebugUtils.currentLine=183762945;
 //BA.debugLineNum = 183762945;BA.debugLine="MakeListSearch(EditSearch.Text)";
_makelistsearch(mostCurrent._editsearch.getText());
RDebugUtils.currentLine=183762946;
 //BA.debugLineNum = 183762946;BA.debugLine="End Sub";
return "";
}
public static String  _listactions_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listactions_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listactions_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=184811520;
 //BA.debugLineNum = 184811520;BA.debugLine="Sub listActions_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=184811521;
 //BA.debugLineNum = 184811521;BA.debugLine="CurrentLineItemAC = Index+1";
_currentlineitemac = (int) (_index+1);
RDebugUtils.currentLine=184811522;
 //BA.debugLineNum = 184811522;BA.debugLine="Dim Pnl As Panel = listActions.GetPanel(Index)";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listactions._getpanel(_index).getObject()));
RDebugUtils.currentLine=184811523;
 //BA.debugLineNum = 184811523;BA.debugLine="ListItemSelected( Pnl, listActions )";
_listitemselected(_pnl,mostCurrent._listactions);
RDebugUtils.currentLine=184811524;
 //BA.debugLineNum = 184811524;BA.debugLine="ShowTaskDetails(Pnl.Tag)";
_showtaskdetails(BA.ObjectToString(_pnl.getTag()));
RDebugUtils.currentLine=184811525;
 //BA.debugLineNum = 184811525;BA.debugLine="End Sub";
return "";
}
public static String  _listitemselected(anywheresoftware.b4a.objects.PanelWrapper _pan,b4a.example3.customlistview _listview) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemselected", new Object[] {_pan,_listview}));}
int _index = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=184680448;
 //BA.debugLineNum = 184680448;BA.debugLine="Sub ListItemSelected(pan As Panel, listview As Cus";
RDebugUtils.currentLine=184680449;
 //BA.debugLineNum = 184680449;BA.debugLine="For index= 0 To listview.GetSize-1";
{
final int step1 = 1;
final int limit1 = (int) (_listview._getsize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=184680450;
 //BA.debugLineNum = 184680450;BA.debugLine="Dim p As Panel = listview.GetPanel(index)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_listview._getpanel(_index).getObject()));
RDebugUtils.currentLine=184680451;
 //BA.debugLineNum = 184680451;BA.debugLine="p.Color = Consts.ColorWhite";
_p.setColor(mostCurrent._consts._colorwhite /*int*/ );
 }
};
RDebugUtils.currentLine=184680453;
 //BA.debugLineNum = 184680453;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
_pan.setColor(mostCurrent._consts._colorciansoftlight /*int*/ );
RDebugUtils.currentLine=184680454;
 //BA.debugLineNum = 184680454;BA.debugLine="ShowTaskDetails(pan.Tag)";
_showtaskdetails(BA.ObjectToString(_pan.getTag()));
RDebugUtils.currentLine=184680455;
 //BA.debugLineNum = 184680455;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=184680456;
 //BA.debugLineNum = 184680456;BA.debugLine="End Sub";
return "";
}
public static String  _showtaskdetails(String _tagcode) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showtaskdetails", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showtaskdetails", new Object[] {_tagcode}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sqlevc = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=184877056;
 //BA.debugLineNum = 184877056;BA.debugLine="Sub ShowTaskDetails(tagcode As String)";
RDebugUtils.currentLine=184877057;
 //BA.debugLineNum = 184877057;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=184877058;
 //BA.debugLineNum = 184877058;BA.debugLine="Dim SQLEVC As String = $\"select a.item_type, a.ta";
_sqlevc = ("select a.item_type, a.task_tagcode, a.title from dta_tasks_items as a where a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' order by position");
RDebugUtils.currentLine=184877059;
 //BA.debugLineNum = 184877059;BA.debugLine="Log(SQLEVC)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184877059",_sqlevc,0);
RDebugUtils.currentLine=184877060;
 //BA.debugLineNum = 184877060;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlevc)));
RDebugUtils.currentLine=184877061;
 //BA.debugLineNum = 184877061;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=184877062;
 //BA.debugLineNum = 184877062;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=184877063;
 //BA.debugLineNum = 184877063;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=184877064;
 //BA.debugLineNum = 184877064;BA.debugLine="Filter.getTaskDetailsDialog(Activity, \"TasksCL2\"";
_filter._gettaskdetailsdialog /*void*/ (null,mostCurrent._activity,(Object)("TasksCL2"),mostCurrent._sharecode._tarefasavisoinfodescritiva /*String*/ ,_record,_tagcode);
 }else {
RDebugUtils.currentLine=184877066;
 //BA.debugLineNum = 184877066;BA.debugLine="MsgboxAsync(ShareCode.checklistErroacesso, Share";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._checklisterroacesso /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=184877067;
 //BA.debugLineNum = 184877067;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=184877069;
 //BA.debugLineNum = 184877069;BA.debugLine="End Sub";
return "";
}
public static String  _listbutactions_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutactions_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutactions_click", null));}
RDebugUtils.currentLine=184025088;
 //BA.debugLineNum = 184025088;BA.debugLine="Sub listButActions_Click";
RDebugUtils.currentLine=184025090;
 //BA.debugLineNum = 184025090;BA.debugLine="End Sub";
return "";
}
public static String  _listbutattach_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutattach_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutattach_click", null));}
RDebugUtils.currentLine=183435264;
 //BA.debugLineNum = 183435264;BA.debugLine="Sub listButAttach_Click";
RDebugUtils.currentLine=183435265;
 //BA.debugLineNum = 183435265;BA.debugLine="listsLabelInfo.Text = $\"${Utils.GetFreeMem}\"$";
mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getfreemem /*String*/ (mostCurrent.activityBA)))+"")));
RDebugUtils.currentLine=183435266;
 //BA.debugLineNum = 183435266;BA.debugLine="End Sub";
return "";
}
public static String  _listbutinfo_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutinfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutinfo_click", null));}
RDebugUtils.currentLine=183369728;
 //BA.debugLineNum = 183369728;BA.debugLine="Sub listButInfo_Click";
RDebugUtils.currentLine=183369730;
 //BA.debugLineNum = 183369730;BA.debugLine="End Sub";
return "";
}
public static String  _listchecklists_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listchecklists_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listchecklists_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=184745984;
 //BA.debugLineNum = 184745984;BA.debugLine="Sub listChecklists_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=184745985;
 //BA.debugLineNum = 184745985;BA.debugLine="CurrentLineItemAC = Index+1";
_currentlineitemac = (int) (_index+1);
RDebugUtils.currentLine=184745986;
 //BA.debugLineNum = 184745986;BA.debugLine="ListItemSelected( listChecklists.GetPanel(Index),";
_listitemselected((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listchecklists._getpanel(_index).getObject())),mostCurrent._listchecklists);
RDebugUtils.currentLine=184745987;
 //BA.debugLineNum = 184745987;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_click", null));}
RDebugUtils.currentLine=183304192;
 //BA.debugLineNum = 183304192;BA.debugLine="Sub ListItemPanel_Click";
RDebugUtils.currentLine=183304194;
 //BA.debugLineNum = 183304194;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_longclick() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_longclick", null));}
RDebugUtils.currentLine=183566336;
 //BA.debugLineNum = 183566336;BA.debugLine="Sub ListItemPanel_LongClick";
RDebugUtils.currentLine=183566338;
 //BA.debugLineNum = 183566338;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=183500800;
 //BA.debugLineNum = 183500800;BA.debugLine="Sub ListItemPanel_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=183500801;
 //BA.debugLineNum = 183500801;BA.debugLine="listsLabelInfo.Text = \"Touch Click\"";
mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence("Touch Click"));
RDebugUtils.currentLine=183500802;
 //BA.debugLineNum = 183500802;BA.debugLine="End Sub";
return "";
}
public static String  _listitemselectedrequest(anywheresoftware.b4a.objects.PanelWrapper _pan,b4a.example3.customlistview _listview) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemselectedrequest", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemselectedrequest", new Object[] {_pan,_listview}));}
int _index = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=184156160;
 //BA.debugLineNum = 184156160;BA.debugLine="Sub ListItemSelectedRequest(pan As Panel, listview";
RDebugUtils.currentLine=184156161;
 //BA.debugLineNum = 184156161;BA.debugLine="For index= 0 To listview.GetSize-1";
{
final int step1 = 1;
final int limit1 = (int) (_listview._getsize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=184156162;
 //BA.debugLineNum = 184156162;BA.debugLine="Dim p As Panel = listview.GetPanel(index)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_listview._getpanel(_index).getObject()));
RDebugUtils.currentLine=184156163;
 //BA.debugLineNum = 184156163;BA.debugLine="p.Color = Consts.ColorWhite";
_p.setColor(mostCurrent._consts._colorwhite /*int*/ );
 }
};
RDebugUtils.currentLine=184156165;
 //BA.debugLineNum = 184156165;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
_pan.setColor(mostCurrent._consts._colorciansoftlight /*int*/ );
RDebugUtils.currentLine=184156166;
 //BA.debugLineNum = 184156166;BA.debugLine="ShowRequestDetails(pan.Tag)";
_showrequestdetails(BA.ObjectToString(_pan.getTag()));
RDebugUtils.currentLine=184156167;
 //BA.debugLineNum = 184156167;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=184156168;
 //BA.debugLineNum = 184156168;BA.debugLine="End Sub";
return "";
}
public static String  _showrequestdetails(String _tagcode) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showrequestdetails", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showrequestdetails", new Object[] {_tagcode}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sqlevc = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=184221696;
 //BA.debugLineNum = 184221696;BA.debugLine="Sub ShowRequestDetails(tagcode As String)";
RDebugUtils.currentLine=184221697;
 //BA.debugLineNum = 184221697;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=184221698;
 //BA.debugLineNum = 184221698;BA.debugLine="Dim SQLEVC As String = $\"select a.item_type, a.ta";
_sqlevc = ("select a.item_type, a.task_tagcode, a.title \n"+"					from dta_tasks_items as a \n"+"					inner join dta_typerequests_tasks as b on (b.task_tagcode=a.task_tagcode)\n"+"					where b.typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' order by b.position, a.position");
RDebugUtils.currentLine=184221702;
 //BA.debugLineNum = 184221702;BA.debugLine="Log(SQLEVC)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184221702",_sqlevc,0);
RDebugUtils.currentLine=184221703;
 //BA.debugLineNum = 184221703;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLEVC)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlevc)));
RDebugUtils.currentLine=184221704;
 //BA.debugLineNum = 184221704;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=184221705;
 //BA.debugLineNum = 184221705;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=184221706;
 //BA.debugLineNum = 184221706;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=184221707;
 //BA.debugLineNum = 184221707;BA.debugLine="Filter.getRequestTaskDetailsDialog(Activity, \"Ta";
_filter._getrequesttaskdetailsdialog /*void*/ (null,mostCurrent._activity,(Object)("TasksCL2"),mostCurrent._sharecode._tarefasavisoinfodescritiva /*String*/ ,_record,_tagcode);
 }else {
RDebugUtils.currentLine=184221709;
 //BA.debugLineNum = 184221709;BA.debugLine="MsgboxAsync(ShareCode.checklistErroacesso, Share";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._checklisterroacesso /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=184221710;
 //BA.debugLineNum = 184221710;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=184221712;
 //BA.debugLineNum = 184221712;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonadd_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonadd_click", null));}
RDebugUtils.currentLine=183238656;
 //BA.debugLineNum = 183238656;BA.debugLine="Sub listsButtonAdd_Click";
RDebugUtils.currentLine=183238658;
 //BA.debugLineNum = 183238658;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonfilter_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonfilter_click", null));}
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
xevolution.vrcg.devdemov2400.types._taskfilter _curr = null;
xevolution.vrcg.devdemov2400.types._statusfiltertask _sft = null;
RDebugUtils.currentLine=183631872;
 //BA.debugLineNum = 183631872;BA.debugLine="Sub listsButtonFilter_Click";
RDebugUtils.currentLine=183631873;
 //BA.debugLineNum = 183631873;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=183631874;
 //BA.debugLineNum = 183631874;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=183631875;
 //BA.debugLineNum = 183631875;BA.debugLine="Dim Curr As TaskFilter = Types.MakeTaskFilter(iDi";
_curr = mostCurrent._types._maketaskfilter /*xevolution.vrcg.devdemov2400.types._taskfilter*/ (mostCurrent.activityBA,_idialogreqtype,_idialogreqstatus,_idialogrequpdtated,_idialogreqwithrequests,(int) (0));
RDebugUtils.currentLine=183631876;
 //BA.debugLineNum = 183631876;BA.debugLine="Dim sft As StatusFilterTask = Types.MakeStatusFil";
_sft = mostCurrent._types._makestatusfiltertask /*xevolution.vrcg.devdemov2400.types._statusfiltertask*/ (mostCurrent.activityBA,mostCurrent._sharecode._tasktpractive /*boolean*/ ,mostCurrent._sharecode._tasktprinactive /*boolean*/ ,mostCurrent._sharecode._tasktprsingular /*boolean*/ ,mostCurrent._sharecode._tasktprplural /*boolean*/ );
RDebugUtils.currentLine=183631877;
 //BA.debugLineNum = 183631877;BA.debugLine="Filter.GetTaskFiltersDialog(\"TasksCL2\", Curr, Cur";
_filter._gettaskfiltersdialog /*void*/ (null,(Object)("TasksCL2"),_curr,_currenttab,_sft);
RDebugUtils.currentLine=183631878;
 //BA.debugLineNum = 183631878;BA.debugLine="End Sub";
return "";
}
public static void  _listsreturn(String _res,xevolution.vrcg.devdemov2400.types._requestcla _currentcla) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsreturn", false))
	 {Debug.delegate(mostCurrent.activityBA, "listsreturn", new Object[] {_res,_currentcla}); return;}
ResumableSub_ListsReturn rsub = new ResumableSub_ListsReturn(null,_res,_currentcla);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListsReturn extends BA.ResumableSub {
public ResumableSub_ListsReturn(xevolution.vrcg.devdemov2400.taskscl2 parent,String _res,xevolution.vrcg.devdemov2400.types._requestcla _currentcla) {
this.parent = parent;
this._res = _res;
this._currentcla = _currentcla;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _res;
xevolution.vrcg.devdemov2400.types._requestcla _currentcla;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r1 = null;
boolean _finished = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r2 = null;
boolean _finished2 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r3 = null;
boolean _finished3 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=185139202;
 //BA.debugLineNum = 185139202;BA.debugLine="Log(res)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185139202",_res,0);
RDebugUtils.currentLine=185139207;
 //BA.debugLineNum = 185139207;BA.debugLine="ProgressDialogShow2(ShareCode.Pg2MsgProcessar, Fa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._pg2msgprocessar /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=185139208;
 //BA.debugLineNum = 185139208;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "listsreturn"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=185139210;
 //BA.debugLineNum = 185139210;BA.debugLine="Dim r1  As ResumableSub = CheckTypeRequestTaskAdd";
_r1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r1 = _checktyperequesttaskadds(_currentcla.Request /*String*/ ,_currentcla.Action /*String*/ );
RDebugUtils.currentLine=185139211;
 //BA.debugLineNum = 185139211;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "listsreturn"), _r1);
this.state = 2;
return;
case 2:
//C
this.state = -1;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=185139213;
 //BA.debugLineNum = 185139213;BA.debugLine="Dim r2  As ResumableSub = CheckTypeRequestNewTask";
_r2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r2 = _checktyperequestnewtask(_currentcla.Request /*String*/ ,_currentcla.Action /*String*/ );
RDebugUtils.currentLine=185139214;
 //BA.debugLineNum = 185139214;BA.debugLine="Wait For(r2) complete (finished2 As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "listsreturn"), _r2);
this.state = 3;
return;
case 3:
//C
this.state = -1;
_finished2 = (Boolean) result[0];
;
RDebugUtils.currentLine=185139216;
 //BA.debugLineNum = 185139216;BA.debugLine="Dim r3  As ResumableSub = CheckTypeRequestNewTask";
_r3 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r3 = _checktyperequestnewtask2(_currentcla.Request /*String*/ ,_currentcla.Action /*String*/ );
RDebugUtils.currentLine=185139217;
 //BA.debugLineNum = 185139217;BA.debugLine="Wait For(r3) complete (finished3 As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "listsreturn"), _r3);
this.state = 4;
return;
case 4:
//C
this.state = -1;
_finished3 = (Boolean) result[0];
;
RDebugUtils.currentLine=185139219;
 //BA.debugLineNum = 185139219;BA.debugLine="StartTasksActivity(True, Starter.TaskSearchFilter";
_starttasksactivity(anywheresoftware.b4a.keywords.Common.True,parent.mostCurrent._starter._tasksearchfilter /*String*/ ,parent._currenttab);
RDebugUtils.currentLine=185139221;
 //BA.debugLineNum = 185139221;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=185139223;
 //BA.debugLineNum = 185139223;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _liststabpanel_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=183107584;
 //BA.debugLineNum = 183107584;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=183107586;
 //BA.debugLineNum = 183107586;BA.debugLine="End Sub";
return "";
}
public static String  _listtyperequests_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listtyperequests_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listtyperequests_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=184090624;
 //BA.debugLineNum = 184090624;BA.debugLine="Sub listTypeRequests_ItemClick (Index As Int, Valu";
RDebugUtils.currentLine=184090625;
 //BA.debugLineNum = 184090625;BA.debugLine="CurrentLineItemCL = Index+1";
_currentlineitemcl = (int) (_index+1);
RDebugUtils.currentLine=184090626;
 //BA.debugLineNum = 184090626;BA.debugLine="ListItemSelectedRequest( listTypeRequests.GetPane";
_listitemselectedrequest((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listtyperequests._getpanel(_index).getObject())),mostCurrent._listtyperequests);
RDebugUtils.currentLine=184090627;
 //BA.debugLineNum = 184090627;BA.debugLine="End Sub";
return "";
}
public static String  _mainlogo_click() throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainlogo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainlogo_click", null));}
RDebugUtils.currentLine=183959552;
 //BA.debugLineNum = 183959552;BA.debugLine="Sub mainLogo_Click";
RDebugUtils.currentLine=183959553;
 //BA.debugLineNum = 183959553;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
RDebugUtils.currentLine=183959554;
 //BA.debugLineNum = 183959554;BA.debugLine="End Sub";
return "";
}
public static Object  _pagechangelistener_event(String _methodname,Object[] _args) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pagechangelistener_event", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "pagechangelistener_event", new Object[] {_methodname,_args}));}
RDebugUtils.currentLine=182386688;
 //BA.debugLineNum = 182386688;BA.debugLine="Sub PageChangeListener_Event (MethodName As String";
RDebugUtils.currentLine=182386689;
 //BA.debugLineNum = 182386689;BA.debugLine="If (MethodName = \"onPageScrolled\") Then";
if (((_methodname).equals("onPageScrolled"))) { 
RDebugUtils.currentLine=182386690;
 //BA.debugLineNum = 182386690;BA.debugLine="CurrentTab = Args(0)";
_currenttab = (int)(BA.ObjectToNumber(_args[(int) (0)]));
 };
RDebugUtils.currentLine=182386692;
 //BA.debugLineNum = 182386692;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=182386693;
 //BA.debugLineNum = 182386693;BA.debugLine="Return Null";
if (true) return anywheresoftware.b4a.keywords.Common.Null;
RDebugUtils.currentLine=182386694;
 //BA.debugLineNum = 182386694;BA.debugLine="End Sub";
return null;
}
public static void  _returnshowrequesttaskdetails(String _newrequesttype,anywheresoftware.b4a.objects.collections.List _tvals) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "returnshowrequesttaskdetails", false))
	 {Debug.delegate(mostCurrent.activityBA, "returnshowrequesttaskdetails", new Object[] {_newrequesttype,_tvals}); return;}
ResumableSub_ReturnShowRequestTaskDetails rsub = new ResumableSub_ReturnShowRequestTaskDetails(null,_newrequesttype,_tvals);
rsub.resume(processBA, null);
}
public static class ResumableSub_ReturnShowRequestTaskDetails extends BA.ResumableSub {
public ResumableSub_ReturnShowRequestTaskDetails(xevolution.vrcg.devdemov2400.taskscl2 parent,String _newrequesttype,anywheresoftware.b4a.objects.collections.List _tvals) {
this.parent = parent;
this._newrequesttype = _newrequesttype;
this._tvals = _tvals;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _newrequesttype;
anywheresoftware.b4a.objects.collections.List _tvals;
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
String _newrequest = "";
String _newdate = "";
String _newtime = "";
String _taskname = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
String _firstchecklist = "";
String _firstchecklisttemp = "";
anywheresoftware.b4a.objects.collections.Map _newrequestitem2 = null;
int _n = 0;
String _tagcode = "";
int _cl_is_father = 0;
int _repeatcounter = 0;
String _typerequest_tagcode = "";
int _cl_position = 0;
String _ssql = "";
int _stage = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resfields = null;
boolean _resfieldsok = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa1 = null;
boolean _resfieldsok1 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa2 = null;
boolean _resfieldsok2 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
xevolution.vrcg.devdemov2400.types._createrequestreturn _newrequestcode = null;
anywheresoftware.b4a.objects.collections.Map _questparams = null;
int _data_bulk_upload = 0;
anywheresoftware.b4a.objects.collections.Map _data_bulk_info = null;
String _affected_from = "";
String _related_to = "";
String _origin_master = "";
String _origin_master_condition = "";
String _origin_details = "";
String _origin_details_condition = "";
String _field_group_checklist = "";
String _field_group_chapter = "";
int _is_object_relation = 0;
int _ifield = 0;
String _gfield = "";
String _warehousecode = "";
String _obj_tc = "";
String _snewsql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _rrecord = null;
String _firstitem = "";
String _firstuk = "";
String _chapter = "";
int _cntfieldval04 = 0;
int _cntrepeatfieldcounter = 0;
int _posicao = 0;
int _row = 0;
String _group = "";
int _qtd = 0;
int _rrepeatcounter = 0;
String _robject = "";
String _rtitle = "";
String _ritem = "";
String _runiquekey = "";
int _exec_status = 0;
boolean _operinsert = false;
String _ss1 = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs1 = null;
boolean _finished = false;
String _ssql1 = "";
anywheresoftware.b4a.objects.collections.List _listitems = null;
anywheresoftware.b4a.objects.collections.List _datafields = null;
anywheresoftware.b4a.objects.collections.Map _mapitems = null;
String _finalsql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rsartigos = null;
anywheresoftware.b4a.objects.collections.Map _mapfields = null;
int _nfields = 0;
String _colname = "";
String _colvalue = "";
anywheresoftware.b4a.objects.collections.Map _aclajson = null;
anywheresoftware.b4a.objects.collections.Map _newparams = null;
String _url = "";
String _data = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
xevolution.vrcg.devdemov2400.httpjob _jobd2s = null;
String _addr = "";
String _thedata = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
int _cntposicao = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _incolitems = null;
int _posis = 0;
int _a1 = 0;
String _tag = "";
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
int _tr_is_model = 0;
int step46;
int limit46;
int step195;
int limit195;
int step283;
int limit283;
int step349;
int limit349;
int step398;
int limit398;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184287241;
 //BA.debugLineNum = 184287241;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*String*/ ));
RDebugUtils.currentLine=184287242;
 //BA.debugLineNum = 184287242;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 242;
this.catchState = 241;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 241;
RDebugUtils.currentLine=184287243;
 //BA.debugLineNum = 184287243;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287244;
 //BA.debugLineNum = 184287244;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=184287246;
 //BA.debugLineNum = 184287246;BA.debugLine="If Utils.NNE(newRequestType) Then";
if (true) break;

case 4:
//if
this.state = 239;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequesttype)) { 
this.state = 6;
}else {
this.state = 238;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=184287248;
 //BA.debugLineNum = 184287248;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTag";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184287249;
 //BA.debugLineNum = 184287249;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184287250;
 //BA.debugLineNum = 184287250;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184287251;
 //BA.debugLineNum = 184287251;BA.debugLine="Dim TaskName As String = TVals.Get(0)";
_taskname = BA.ObjectToString(_tvals.Get((int) (0)));
RDebugUtils.currentLine=184287253;
 //BA.debugLineNum = 184287253;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests","id","")+1+1000000);
RDebugUtils.currentLine=184287255;
 //BA.debugLineNum = 184287255;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287256;
 //BA.debugLineNum = 184287256;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=184287257;
 //BA.debugLineNum = 184287257;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=184287258;
 //BA.debugLineNum = 184287258;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=184287259;
 //BA.debugLineNum = 184287259;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE_";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=184287260;
 //BA.debugLineNum = 184287260;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=184287261;
 //BA.debugLineNum = 184287261;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=184287262;
 //BA.debugLineNum = 184287262;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=184287263;
 //BA.debugLineNum = 184287263;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=184287264;
 //BA.debugLineNum = 184287264;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=184287265;
 //BA.debugLineNum = 184287265;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=184287266;
 //BA.debugLineNum = 184287266;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=184287267;
 //BA.debugLineNum = 184287267;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=184287268;
 //BA.debugLineNum = 184287268;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=184287269;
 //BA.debugLineNum = 184287269;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=184287270;
 //BA.debugLineNum = 184287270;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=184287271;
 //BA.debugLineNum = 184287271;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERN";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=184287272;
 //BA.debugLineNum = 184287272;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("entity_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=184287273;
 //BA.debugLineNum = 184287273;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=184287274;
 //BA.debugLineNum = 184287274;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=184287275;
 //BA.debugLineNum = 184287275;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=184287276;
 //BA.debugLineNum = 184287276;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
_newexecution.Put((Object)("local_tagcode"),(Object)(""));
RDebugUtils.currentLine=184287277;
 //BA.debugLineNum = 184287277;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newRequ";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_newrequesttype));
RDebugUtils.currentLine=184287278;
 //BA.debugLineNum = 184287278;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.S";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=184287279;
 //BA.debugLineNum = 184287279;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=184287280;
 //BA.debugLineNum = 184287280;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=184287281;
 //BA.debugLineNum = 184287281;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184287282;
 //BA.debugLineNum = 184287282;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=184287283;
 //BA.debugLineNum = 184287283;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=184287284;
 //BA.debugLineNum = 184287284;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=184287286;
 //BA.debugLineNum = 184287286;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 1,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (1),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=184287288;
 //BA.debugLineNum = 184287288;BA.debugLine="Dim FirstCheckList As String = \"\"";
_firstchecklist = "";
RDebugUtils.currentLine=184287289;
 //BA.debugLineNum = 184287289;BA.debugLine="Dim FirstCheckListTemp As String = \"\"";
_firstchecklisttemp = "";
RDebugUtils.currentLine=184287291;
 //BA.debugLineNum = 184287291;BA.debugLine="Dim newRequestItem2 As Map";
_newrequestitem2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287292;
 //BA.debugLineNum = 184287292;BA.debugLine="newRequestItem2.Initialize";
_newrequestitem2.Initialize();
RDebugUtils.currentLine=184287293;
 //BA.debugLineNum = 184287293;BA.debugLine="For n=0 To TVals.Size-1";
if (true) break;

case 7:
//for
this.state = 30;
step46 = 1;
limit46 = (int) (_tvals.getSize()-1);
_n = (int) (0) ;
this.state = 243;
if (true) break;

case 243:
//C
this.state = 30;
if ((step46 > 0 && _n <= limit46) || (step46 < 0 && _n >= limit46)) this.state = 9;
if (true) break;

case 244:
//C
this.state = 243;
_n = ((int)(0 + _n + step46)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=184287294;
 //BA.debugLineNum = 184287294;BA.debugLine="Dim tagcode As String = TVals.Get(n)";
_tagcode = BA.ObjectToString(_tvals.Get(_n));
RDebugUtils.currentLine=184287295;
 //BA.debugLineNum = 184287295;BA.debugLine="If (n = 0) Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((_n==0)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=184287296;
 //BA.debugLineNum = 184287296;BA.debugLine="FirstCheckListTemp = tagcode.trim";
_firstchecklisttemp = _tagcode.trim();
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=184287299;
 //BA.debugLineNum = 184287299;BA.debugLine="Dim cl_is_father As Int = DBStructures.GetScri";
_cl_is_father = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select cl_is_father from dta_typerequests_tasks_adds\n"+"											where typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequesttype.trim()))+"'\n"+"											And task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'"),"cl_is_father");
RDebugUtils.currentLine=184287302;
 //BA.debugLineNum = 184287302;BA.debugLine="If (cl_is_father = 1) Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_cl_is_father==1)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=184287303;
 //BA.debugLineNum = 184287303;BA.debugLine="FirstCheckList = tagcode.trim";
_firstchecklist = _tagcode.trim();
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=184287306;
 //BA.debugLineNum = 184287306;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCou";
_repeatcounter = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'"));
RDebugUtils.currentLine=184287312;
 //BA.debugLineNum = 184287312;BA.debugLine="Dim typerequest_tagcode As String = DBStructur";
_typerequest_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select typerequest_tagcode from dta_requests where 1=1\n"+"																						and tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest.trim()))+"'"),"typerequest_tagcode");
RDebugUtils.currentLine=184287315;
 //BA.debugLineNum = 184287315;BA.debugLine="Try";
if (true) break;

case 18:
//try
this.state = 29;
this.catchState = 28;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 28;
RDebugUtils.currentLine=184287316;
 //BA.debugLineNum = 184287316;BA.debugLine="If Utils.NNE(typerequest_tagcode) Then";
if (true) break;

case 21:
//if
this.state = 26;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_typerequest_tagcode)) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=184287317;
 //BA.debugLineNum = 184287317;BA.debugLine="Dim CL_Position As Int = DBStructures.GetScr";
_cl_position = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select position from dta_typerequests_tasks where 1=1\n"+"																				and typerequest_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_typerequest_tagcode))+"'\n"+"																				and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'"),"position");
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=184287321;
 //BA.debugLineNum = 184287321;BA.debugLine="Dim CL_Position As Int = 0";
_cl_position = (int) (0);
 if (true) break;

case 26:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 241;
RDebugUtils.currentLine=184287325;
 //BA.debugLineNum = 184287325;BA.debugLine="Dim CL_Position As Int = 0";
_cl_position = (int) (0);
RDebugUtils.currentLine=184287326;
 //BA.debugLineNum = 184287326;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287326",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 29:
//C
this.state = 244;
this.catchState = 241;
;
RDebugUtils.currentLine=184287330;
 //BA.debugLineNum = 184287330;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"d";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations","id","")+1+1000000);
RDebugUtils.currentLine=184287331;
 //BA.debugLineNum = 184287331;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287332;
 //BA.debugLineNum = 184287332;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=184287333;
 //BA.debugLineNum = 184287333;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=184287334;
 //BA.debugLineNum = 184287334;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=184287335;
 //BA.debugLineNum = 184287335;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode.t";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode.trim()));
RDebugUtils.currentLine=184287336;
 //BA.debugLineNum = 184287336;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=184287337;
 //BA.debugLineNum = 184287337;BA.debugLine="newExecution.Put(\"position\", CL_Position) ' ES";
_newexecution.Put((Object)("position"),(Object)(_cl_position));
RDebugUtils.currentLine=184287338;
 //BA.debugLineNum = 184287338;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=184287339;
 //BA.debugLineNum = 184287339;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=184287340;
 //BA.debugLineNum = 184287340;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=184287341;
 //BA.debugLineNum = 184287341;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=184287342;
 //BA.debugLineNum = 184287342;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=184287343;
 //BA.debugLineNum = 184287343;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=184287344;
 //BA.debugLineNum = 184287344;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=184287345;
 //BA.debugLineNum = 184287345;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=184287346;
 //BA.debugLineNum = 184287346;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=184287347;
 //BA.debugLineNum = 184287347;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounte";
_newexecution.Put((Object)("repeatcounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=184287348;
 //BA.debugLineNum = 184287348;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=184287349;
 //BA.debugLineNum = 184287349;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184287350;
 //BA.debugLineNum = 184287350;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=184287351;
 //BA.debugLineNum = 184287351;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=184287352;
 //BA.debugLineNum = 184287352;BA.debugLine="newRequestItem2.Put($\"${n}\"$, ListOfMaps)";
_newrequestitem2.Put((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"")),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=184287354;
 //BA.debugLineNum = 184287354;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 2";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (2),"dta_requests_relations",_listofmaps,_newrequest,"");
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=184287356;
 //BA.debugLineNum = 184287356;BA.debugLine="newRequestItem.Put(\"relation\", newRequestItem2)";
_newrequestitem.Put((Object)("relation"),(Object)(_newrequestitem2.getObject()));
RDebugUtils.currentLine=184287358;
 //BA.debugLineNum = 184287358;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=184287363;
 //BA.debugLineNum = 184287363;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"				tagcode,position,execute_value,execute_format_title,\n"+"				confirmed,changed_value,cbr_id)\n"+"				select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"				x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"				x.execute_value, x.execute_format_title, \n"+"				x.confirmed, x.changed_value, 0 As cbr_id\n"+"				from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, a.relation_tagcode As task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode As tagcode, ifnull(d.position, c.position) As position, \n"+"				a.position As relposition, '' as execute_value, \n"+"				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value\n"+"				from dta_requests_relations As a\n"+"				inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"				union\n"+"				select d.id, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' as request_tagcode, a.request_tagcode as inner_request_tagcode, a.relation_tagcode as task_tagcode, \n"+"				c.item_tagcode, c.unique_key, d.tagcode as tagcode, ifnull(d.position, c.position) As position,\n"+"				a.position as relposition, '' as execute_value, \n"+"				Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"				0 as confirmed, '' as changed_value\n"+"				from dta_requests_relations as a\n"+"				inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"				inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"				left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"				where a.type_relation=0 and a.request_tagcode in (select relation_tagcode \n"+"				from dta_requests_relations where request_tagcode ='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"')) as x\n"+"				order by  x.relposition, x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=184287394;
 //BA.debugLineNum = 184287394;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_newrequest);
RDebugUtils.currentLine=184287395;
 //BA.debugLineNum = 184287395;BA.debugLine="Dim stage As Int = 0";
_stage = (int) (0);
RDebugUtils.currentLine=184287397;
 //BA.debugLineNum = 184287397;BA.debugLine="Dim resfields As ResumableSub = createRequestFi";
_resfields = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resfields = _createrequestfields(_newrequest,_newrequesttype);
RDebugUtils.currentLine=184287398;
 //BA.debugLineNum = 184287398;BA.debugLine="Wait For(resfields) Complete (resfieldsOk As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), _resfields);
this.state = 245;
return;
case 245:
//C
this.state = 31;
_resfieldsok = (Boolean) result[0];
;
RDebugUtils.currentLine=184287400;
 //BA.debugLineNum = 184287400;BA.debugLine="Dim resa1 As ResumableSub = createRequestEntity";
_resa1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa1 = _createrequestentityrelation(_newrequest,"");
RDebugUtils.currentLine=184287401;
 //BA.debugLineNum = 184287401;BA.debugLine="Wait For(resa1) Complete (resfieldsOk1 As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), _resa1);
this.state = 246;
return;
case 246:
//C
this.state = 31;
_resfieldsok1 = (Boolean) result[0];
;
RDebugUtils.currentLine=184287403;
 //BA.debugLineNum = 184287403;BA.debugLine="Dim resa2 As ResumableSub = createRequestObject";
_resa2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa2 = _createrequestobjectrelation(_newrequest,"");
RDebugUtils.currentLine=184287404;
 //BA.debugLineNum = 184287404;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), _resa2);
this.state = 247;
return;
case 247:
//C
this.state = 31;
_resfieldsok2 = (Boolean) result[0];
;
RDebugUtils.currentLine=184287407;
 //BA.debugLineNum = 184287407;BA.debugLine="Dim res As ResumableSub = UploadNewRequest2Serv";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _uploadnewrequest2server2(_newrequest,_newrequestitem,"1",_stage);
RDebugUtils.currentLine=184287408;
 //BA.debugLineNum = 184287408;BA.debugLine="Wait For(res) Complete (NewRequestCode As Creat";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), _res);
this.state = 248;
return;
case 248:
//C
this.state = 31;
_newrequestcode = (xevolution.vrcg.devdemov2400.types._createrequestreturn) result[0];
;
RDebugUtils.currentLine=184287416;
 //BA.debugLineNum = 184287416;BA.debugLine="If(Utils.NNE(newRequest)) Then";
if (true) break;

case 31:
//if
this.state = 38;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequest))) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=184287417;
 //BA.debugLineNum = 184287417;BA.debugLine="If (Not(newRequest = NewRequestCode.RequestTag";
if (true) break;

case 34:
//if
this.state = 37;
if ((anywheresoftware.b4a.keywords.Common.Not((_newrequest).equals(_newrequestcode.RequestTagcode /*String*/ )) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequestcode.RequestTagcode /*String*/ ))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=184287418;
 //BA.debugLineNum = 184287418;BA.debugLine="Dim sSQL As String = $\"update dta_requests se";
_ssql = ("update dta_requests set tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287419;
 //BA.debugLineNum = 184287419;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287420;
 //BA.debugLineNum = 184287420;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ad";
_ssql = ("update dta_requests_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287421;
 //BA.debugLineNum = 184287421;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287423;
 //BA.debugLineNum = 184287423;BA.debugLine="Dim sSQL As String = $\"update dta_requests_en";
_ssql = ("update dta_requests_entities set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287424;
 //BA.debugLineNum = 184287424;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287426;
 //BA.debugLineNum = 184287426;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ob";
_ssql = ("update dta_requests_objects set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287427;
 //BA.debugLineNum = 184287427;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287429;
 //BA.debugLineNum = 184287429;BA.debugLine="Dim sSQL As String = $\"update dta_requests_co";
_ssql = ("update dta_requests_contacts set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287430;
 //BA.debugLineNum = 184287430;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287432;
 //BA.debugLineNum = 184287432;BA.debugLine="Dim sSQL As String = $\"update dta_requests_fi";
_ssql = ("update dta_requests_fields set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287433;
 //BA.debugLineNum = 184287433;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287435;
 //BA.debugLineNum = 184287435;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
_ssql = ("update dta_requests_relations set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287436;
 //BA.debugLineNum = 184287436;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287437;
 //BA.debugLineNum = 184287437;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
_ssql = ("update dta_requests_relations_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287438;
 //BA.debugLineNum = 184287438;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287440;
 //BA.debugLineNum = 184287440;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
_ssql = ("update dta_requests_values set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287441;
 //BA.debugLineNum = 184287441;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287442;
 //BA.debugLineNum = 184287442;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
_ssql = ("update dta_requests_values_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184287443;
 //BA.debugLineNum = 184287443;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184287444;
 //BA.debugLineNum = 184287444;BA.debugLine="newRequest = NewRequestCode.RequestTagcode";
_newrequest = _newrequestcode.RequestTagcode /*String*/ ;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=184287448;
 //BA.debugLineNum = 184287448;BA.debugLine="Sleep(2000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"),(int) (2000));
this.state = 249;
return;
case 249:
//C
this.state = 39;
;
RDebugUtils.currentLine=184287453;
 //BA.debugLineNum = 184287453;BA.debugLine="Dim QuestParams As Map = DBStructures.GetScript";
_questparams = new anywheresoftware.b4a.objects.collections.Map();
_questparams = parent.mostCurrent._dbstructures._getscriptcolumnstrevcjsonmap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,("select distinct paramters \n"+"												from dta_tasks_adds where 1=1\n"+"												and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'"),"paramters");
RDebugUtils.currentLine=184287457;
 //BA.debugLineNum = 184287457;BA.debugLine="Try";
if (true) break;

case 39:
//try
this.state = 44;
this.catchState = 43;
this.state = 41;
if (true) break;

case 41:
//C
this.state = 44;
this.catchState = 43;
RDebugUtils.currentLine=184287458;
 //BA.debugLineNum = 184287458;BA.debugLine="Dim data_bulk_upload As Int = QuestParams.Get(";
_data_bulk_upload = (int)(BA.ObjectToNumber(_questparams.Get((Object)("data_bulk_upload"))));
 if (true) break;

case 43:
//C
this.state = 44;
this.catchState = 241;
RDebugUtils.currentLine=184287460;
 //BA.debugLineNum = 184287460;BA.debugLine="Dim data_bulk_upload As Int = 0";
_data_bulk_upload = (int) (0);
RDebugUtils.currentLine=184287461;
 //BA.debugLineNum = 184287461;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287461",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=184287464;
 //BA.debugLineNum = 184287464;BA.debugLine="If Utils.Int2Bool(data_bulk_upload) Then";

case 44:
//if
this.state = 170;
this.catchState = 241;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_data_bulk_upload)) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=184287466;
 //BA.debugLineNum = 184287466;BA.debugLine="Dim data_bulk_info As Map = QuestParams.Get(\"d";
_data_bulk_info = new anywheresoftware.b4a.objects.collections.Map();
_data_bulk_info = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_questparams.Get((Object)("data_bulk_info"))));
RDebugUtils.currentLine=184287467;
 //BA.debugLineNum = 184287467;BA.debugLine="Dim affected_from As String = data_bulk_info.G";
_affected_from = BA.ObjectToString(_data_bulk_info.Get((Object)("affected_from")));
RDebugUtils.currentLine=184287468;
 //BA.debugLineNum = 184287468;BA.debugLine="Dim related_to As String = data_bulk_info.Get(";
_related_to = BA.ObjectToString(_data_bulk_info.Get((Object)("related_to")));
RDebugUtils.currentLine=184287469;
 //BA.debugLineNum = 184287469;BA.debugLine="Dim origin_master As String = data_bulk_info.G";
_origin_master = BA.ObjectToString(_data_bulk_info.Get((Object)("origin_master")));
RDebugUtils.currentLine=184287470;
 //BA.debugLineNum = 184287470;BA.debugLine="Dim origin_master_condition As String = data_b";
_origin_master_condition = BA.ObjectToString(_data_bulk_info.Get((Object)("origin_master_condition")));
RDebugUtils.currentLine=184287471;
 //BA.debugLineNum = 184287471;BA.debugLine="Dim origin_details As String = data_bulk_info.";
_origin_details = BA.ObjectToString(_data_bulk_info.Get((Object)("origin_details")));
RDebugUtils.currentLine=184287472;
 //BA.debugLineNum = 184287472;BA.debugLine="Dim origin_details_condition As String = data_";
_origin_details_condition = BA.ObjectToString(_data_bulk_info.Get((Object)("origin_details_condition")));
RDebugUtils.currentLine=184287473;
 //BA.debugLineNum = 184287473;BA.debugLine="Dim field_group_checklist As String = data_bul";
_field_group_checklist = BA.ObjectToString(_data_bulk_info.Get((Object)("field_group_checklist")));
RDebugUtils.currentLine=184287474;
 //BA.debugLineNum = 184287474;BA.debugLine="Dim field_group_chapter As String = data_bulk_";
_field_group_chapter = BA.ObjectToString(_data_bulk_info.Get((Object)("field_group_chapter")));
RDebugUtils.currentLine=184287475;
 //BA.debugLineNum = 184287475;BA.debugLine="Dim is_object_relation As Int = data_bulk_info";
_is_object_relation = (int)(BA.ObjectToNumber(_data_bulk_info.Get((Object)("is_object_relation"))));
RDebugUtils.currentLine=184287476;
 //BA.debugLineNum = 184287476;BA.debugLine="Dim iField As Int = DBStructures.GetScriptColu";
_ifield = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select reference from type_inouttypes where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_origin_master))+"'"),"reference");
RDebugUtils.currentLine=184287477;
 //BA.debugLineNum = 184287477;BA.debugLine="Dim gField As String = \"\"";
_gfield = "";
RDebugUtils.currentLine=184287478;
 //BA.debugLineNum = 184287478;BA.debugLine="Dim WareHouseCode As String = \"\"";
_warehousecode = "";
RDebugUtils.currentLine=184287479;
 //BA.debugLineNum = 184287479;BA.debugLine="Dim Obj_Tc As String = \"\"";
_obj_tc = "";
RDebugUtils.currentLine=184287481;
 //BA.debugLineNum = 184287481;BA.debugLine="If Utils.Int2Bool(is_object_relation) Then";
if (true) break;

case 47:
//if
this.state = 50;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_is_object_relation)) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=184287482;
 //BA.debugLineNum = 184287482;BA.debugLine="Obj_Tc = DBStructures.GetScriptColumnSTrEVC($";
_obj_tc = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select object_tagcode from dta_requests where tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'"),"object_tagcode");
 if (true) break;
;
RDebugUtils.currentLine=184287485;
 //BA.debugLineNum = 184287485;BA.debugLine="If iField = 1 Then";

case 50:
//if
this.state = 79;
if (_ifield==1) { 
this.state = 52;
}else 
{RDebugUtils.currentLine=184287487;
 //BA.debugLineNum = 184287487;BA.debugLine="else If iField = 2 Then";
if (_ifield==2) { 
this.state = 54;
}else 
{RDebugUtils.currentLine=184287489;
 //BA.debugLineNum = 184287489;BA.debugLine="else If iField = 3 Then";
if (_ifield==3) { 
this.state = 56;
}else 
{RDebugUtils.currentLine=184287491;
 //BA.debugLineNum = 184287491;BA.debugLine="else If iField = 4 Then";
if (_ifield==4) { 
this.state = 58;
}else 
{RDebugUtils.currentLine=184287493;
 //BA.debugLineNum = 184287493;BA.debugLine="else If iField = 5 Then";
if (_ifield==5) { 
this.state = 60;
}else 
{RDebugUtils.currentLine=184287495;
 //BA.debugLineNum = 184287495;BA.debugLine="else If iField = 6 Then";
if (_ifield==6) { 
this.state = 62;
}else 
{RDebugUtils.currentLine=184287502;
 //BA.debugLineNum = 184287502;BA.debugLine="else If iField = 8 Then";
if (_ifield==8) { 
this.state = 70;
}else 
{RDebugUtils.currentLine=184287504;
 //BA.debugLineNum = 184287504;BA.debugLine="else If iField = 9 Then";
if (_ifield==9) { 
this.state = 72;
}else 
{RDebugUtils.currentLine=184287506;
 //BA.debugLineNum = 184287506;BA.debugLine="else If iField = 12 Then";
if (_ifield==12) { 
this.state = 74;
}else 
{RDebugUtils.currentLine=184287508;
 //BA.debugLineNum = 184287508;BA.debugLine="else If iField = 14 Then";
if (_ifield==14) { 
this.state = 76;
}else {
this.state = 78;
}}}}}}}}}}
if (true) break;

case 52:
//C
this.state = 79;
RDebugUtils.currentLine=184287486;
 //BA.debugLineNum = 184287486;BA.debugLine="gField = \"dta_technicals\"";
_gfield = "dta_technicals";
 if (true) break;

case 54:
//C
this.state = 79;
RDebugUtils.currentLine=184287488;
 //BA.debugLineNum = 184287488;BA.debugLine="gField = \"dta_departments\"";
_gfield = "dta_departments";
 if (true) break;

case 56:
//C
this.state = 79;
RDebugUtils.currentLine=184287490;
 //BA.debugLineNum = 184287490;BA.debugLine="gField = \"dta_teams\"";
_gfield = "dta_teams";
 if (true) break;

case 58:
//C
this.state = 79;
RDebugUtils.currentLine=184287492;
 //BA.debugLineNum = 184287492;BA.debugLine="gField = \"dta_objects\"";
_gfield = "dta_objects";
 if (true) break;

case 60:
//C
this.state = 79;
RDebugUtils.currentLine=184287494;
 //BA.debugLineNum = 184287494;BA.debugLine="gField = \"\" 'Empresas";
_gfield = "";
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=184287496;
 //BA.debugLineNum = 184287496;BA.debugLine="gField = \"dta_warehouses\"";
_gfield = "dta_warehouses";
RDebugUtils.currentLine=184287497;
 //BA.debugLineNum = 184287497;BA.debugLine="If Utils.Int2Bool(is_object_relation) And Uti";
if (true) break;

case 63:
//if
this.state = 68;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_is_object_relation) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_obj_tc)) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
RDebugUtils.currentLine=184287498;
 //BA.debugLineNum = 184287498;BA.debugLine="WareHouseCode = DBStructures.GetScriptColumn";
_warehousecode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select tagcode from dta_warehouses where object_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_obj_tc))+"'"),"tagcode");
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=184287500;
 //BA.debugLineNum = 184287500;BA.debugLine="WareHouseCode = related_to";
_warehousecode = _related_to;
 if (true) break;

case 68:
//C
this.state = 79;
;
 if (true) break;

case 70:
//C
this.state = 79;
RDebugUtils.currentLine=184287503;
 //BA.debugLineNum = 184287503;BA.debugLine="gField = \"dta_articles\"";
_gfield = "dta_articles";
 if (true) break;

case 72:
//C
this.state = 79;
RDebugUtils.currentLine=184287505;
 //BA.debugLineNum = 184287505;BA.debugLine="gField = \"aut_users\"";
_gfield = "aut_users";
 if (true) break;

case 74:
//C
this.state = 79;
RDebugUtils.currentLine=184287507;
 //BA.debugLineNum = 184287507;BA.debugLine="gField = \"dta_equipments\"";
_gfield = "dta_equipments";
 if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=184287509;
 //BA.debugLineNum = 184287509;BA.debugLine="gField  = \"dta_objects\"";
_gfield = "dta_objects";
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=184287511;
 //BA.debugLineNum = 184287511;BA.debugLine="gField = \"dta_articles\"";
_gfield = "dta_articles";
 if (true) break;
;
RDebugUtils.currentLine=184287515;
 //BA.debugLineNum = 184287515;BA.debugLine="If (gField = \"dta_warehouses\") Then";

case 79:
//if
this.state = 129;
if (((_gfield).equals("dta_warehouses"))) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=184287516;
 //BA.debugLineNum = 184287516;BA.debugLine="Dim sNewSQL As String = $\"select x.title as a";
_snewsql = ("select x.title as article_title, x.tagcode as article_tagcode, x.*, e.* from (\n"+"							select  ifnull(b.title,'') as group_title, ifnull(c.tagdesc,'') as type_title, a.*, d.qtd as qtdw \n"+"							from dta_articles as a\n"+"							left join dta_articles_groups as b on (b.tagcode=a.article_group)\n"+"							left join type_articlestypes as c on (c.tagcode=a.article_type)\n"+"							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and\n"+"								d.warehouse_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_warehousecode))+"'))\n"+"							) As x\n"+"							, dta_requests_values As e\n"+"							inner join dta_tasks_items As f on (f.task_tagcode=e.task_tagcode\n"+"								And f.item_tagcode=e.item_tagcode\n"+"								And f.unique_key=e.unique_key)\n"+"							where 1=1\n"+"							And e.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"							And e.task_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')\n"+"							And f.`level`>0\n"+"							order by x.group_title, x.title");
RDebugUtils.currentLine=184287534;
 //BA.debugLineNum = 184287534;BA.debugLine="Dim rRecord As Cursor = Starter.LocalSQLEVC.E";
_rrecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_rrecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_snewsql)));
RDebugUtils.currentLine=184287538;
 //BA.debugLineNum = 184287538;BA.debugLine="If rRecord.RowCount > 0 Then";
if (true) break;

case 82:
//if
this.state = 128;
if (_rrecord.getRowCount()>0) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=184287539;
 //BA.debugLineNum = 184287539;BA.debugLine="Dim FirstItem As String = \"\"";
_firstitem = "";
RDebugUtils.currentLine=184287540;
 //BA.debugLineNum = 184287540;BA.debugLine="Dim FirstUK As String = \"\"";
_firstuk = "";
RDebugUtils.currentLine=184287541;
 //BA.debugLineNum = 184287541;BA.debugLine="Dim Chapter As String = \"\"";
_chapter = "";
RDebugUtils.currentLine=184287542;
 //BA.debugLineNum = 184287542;BA.debugLine="Dim cntFieldVal04 As Int = -1";
_cntfieldval04 = (int) (-1);
RDebugUtils.currentLine=184287543;
 //BA.debugLineNum = 184287543;BA.debugLine="Dim cntRepeatFieldCounter As Int = 0";
_cntrepeatfieldcounter = (int) (0);
RDebugUtils.currentLine=184287544;
 //BA.debugLineNum = 184287544;BA.debugLine="Dim Posicao As Int = 1";
_posicao = (int) (1);
RDebugUtils.currentLine=184287545;
 //BA.debugLineNum = 184287545;BA.debugLine="Log(rRecord.RowCount)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287545",BA.NumberToString(_rrecord.getRowCount()),0);
RDebugUtils.currentLine=184287546;
 //BA.debugLineNum = 184287546;BA.debugLine="For Row = 0 To rRecord.RowCount-1";
if (true) break;

case 85:
//for
this.state = 127;
step195 = 1;
limit195 = (int) (_rrecord.getRowCount()-1);
_row = (int) (0) ;
this.state = 250;
if (true) break;

case 250:
//C
this.state = 127;
if ((step195 > 0 && _row <= limit195) || (step195 < 0 && _row >= limit195)) this.state = 87;
if (true) break;

case 251:
//C
this.state = 250;
_row = ((int)(0 + _row + step195)) ;
if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=184287547;
 //BA.debugLineNum = 184287547;BA.debugLine="rRecord.Position = Row";
_rrecord.setPosition(_row);
RDebugUtils.currentLine=184287548;
 //BA.debugLineNum = 184287548;BA.debugLine="Dim Group As String = rRecord.GetString(\"gr";
_group = _rrecord.GetString("group_title");
RDebugUtils.currentLine=184287549;
 //BA.debugLineNum = 184287549;BA.debugLine="Dim Qtd As Int = rRecord.GetInt(\"qtdw\")";
_qtd = _rrecord.GetInt("qtdw");
RDebugUtils.currentLine=184287550;
 //BA.debugLineNum = 184287550;BA.debugLine="Dim RRepeatcounter As Int = rRecord.GetInt(";
_rrepeatcounter = _rrecord.GetInt("repeatcounter");
RDebugUtils.currentLine=184287551;
 //BA.debugLineNum = 184287551;BA.debugLine="Dim RObject As String = rRecord.GetString(\"";
_robject = _rrecord.GetString("article_tagcode");
RDebugUtils.currentLine=184287552;
 //BA.debugLineNum = 184287552;BA.debugLine="Dim RTitle As String = rRecord.GetString(\"a";
_rtitle = _rrecord.GetString("article_title");
RDebugUtils.currentLine=184287553;
 //BA.debugLineNum = 184287553;BA.debugLine="Dim RItem As String = rRecord.GetString(\"it";
_ritem = _rrecord.GetString("item_tagcode");
RDebugUtils.currentLine=184287554;
 //BA.debugLineNum = 184287554;BA.debugLine="Dim RUniqueKey As String = rRecord.GetStrin";
_runiquekey = _rrecord.GetString("unique_key");
RDebugUtils.currentLine=184287559;
 //BA.debugLineNum = 184287559;BA.debugLine="If Not(Chapter=Group) Then ' Capitulo e dif";
if (true) break;

case 88:
//if
this.state = 109;
if (anywheresoftware.b4a.keywords.Common.Not((_chapter).equals(_group))) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=184287560;
 //BA.debugLineNum = 184287560;BA.debugLine="If (Row = 0) Then";
if (true) break;

case 91:
//if
this.state = 108;
if ((_row==0)) { 
this.state = 93;
}else {
this.state = 101;
}if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=184287562;
 //BA.debugLineNum = 184287562;BA.debugLine="FirstItem = DBStructures.GetScriptColumnS";
_firstitem = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select item_tagcode from dta_requests_values where 1=1\n"+"																			And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"																			And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'\n"+"																			and position = 1\n"+"																			And repeatcounter=0\n"+"																			And repeatitemcounter=0\n"+"																			And repeatfieldcounter=0"),"item_tagcode");
RDebugUtils.currentLine=184287570;
 //BA.debugLineNum = 184287570;BA.debugLine="FirstUK = DBStructures.GetScriptColumnStr";
_firstuk = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select unique_key from dta_requests_values where 1=1\n"+"																			And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"																			And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'\n"+"																			and position = 1\n"+"																			And repeatcounter=0\n"+"																			And repeatitemcounter=0\n"+"																			And repeatfieldcounter=0"),"unique_key");
RDebugUtils.currentLine=184287578;
 //BA.debugLineNum = 184287578;BA.debugLine="Dim Exec_Status As Int = 0";
_exec_status = (int) (0);
RDebugUtils.currentLine=184287579;
 //BA.debugLineNum = 184287579;BA.debugLine="Dim OperInsert As Boolean = False";
_operinsert = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=184287580;
 //BA.debugLineNum = 184287580;BA.debugLine="Dim ss1 As String = $\"update dta_requests";
_ss1 = ("update dta_requests_values set\n"+"															execute_status="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_exec_status))+",\n"+"															execute_value='',\n"+"															title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_group))+"',\n"+"															object_tagcode='',\n"+"															position=1,\n"+"															repeatfieldcounter=0\n"+"															where 1=1\n"+"															And request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"															And task_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')\n"+"															And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_firstitem))+"'\n"+"															And unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_firstuk))+"'\n"+"															And repeatcounter=0\n"+"															And repeatfieldcounter=0");
RDebugUtils.currentLine=184287594;
 //BA.debugLineNum = 184287594;BA.debugLine="Try";
if (true) break;

case 94:
//try
this.state = 99;
this.catchState = 98;
this.state = 96;
if (true) break;

case 96:
//C
this.state = 99;
this.catchState = 98;
RDebugUtils.currentLine=184287595;
 //BA.debugLineNum = 184287595;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ss1);
 if (true) break;

case 98:
//C
this.state = 99;
this.catchState = 241;
RDebugUtils.currentLine=184287597;
 //BA.debugLineNum = 184287597;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287597",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 99:
//C
this.state = 108;
this.catchState = 241;
;
RDebugUtils.currentLine=184287600;
 //BA.debugLineNum = 184287600;BA.debugLine="Dim Rs1 As ResumableSub = UpdateServerUPD";
_rs1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs1 = _updateserverupdorins("dta_requests_values","update",_newrequest.trim(),_tagcode.trim(),_firstitem.trim(),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=184287601;
 //BA.debugLineNum = 184287601;BA.debugLine="wait for (Rs1) Complete (Finished As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), _rs1);
this.state = 252;
return;
case 252:
//C
this.state = 108;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=184287602;
 //BA.debugLineNum = 184287602;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"),(int) (250));
this.state = 253;
return;
case 253:
//C
this.state = 108;
;
 if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=184287604;
 //BA.debugLineNum = 184287604;BA.debugLine="Dim Exec_Status As Int = 0";
_exec_status = (int) (0);
RDebugUtils.currentLine=184287605;
 //BA.debugLineNum = 184287605;BA.debugLine="Dim OperInsert As Boolean = True";
_operinsert = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=184287606;
 //BA.debugLineNum = 184287606;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfE";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=184287607;
 //BA.debugLineNum = 184287607;BA.debugLine="Dim ss1 As String = $\"insert into dta_req";
_ss1 = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"															tagcode,position,execute_value,\n"+"															execute_format_title, \n"+"															execute_status,\n"+"															title,object_tagcode,repeatfieldcounter)\n"+"															select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"+"															a.item_tagcode, a.unique_key, a.tagcode, \n"+"															1, '' as execute_value, \n"+"															a.execute_format_title,\n"+"															"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_exec_status))+" as execute_status,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_group))+"' as title,'' as object_tagcode,\n"+"															"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_row))+" as repeatfieldcounter\n"+"															from dta_requests_values As a\n"+"															where 1=1\n"+"															and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"															and task_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')\n"+"															And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"'\n"+"															And unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"'\n"+"															And repeatcounter = 0\n"+"															And repeatfieldcounter=0 ");
RDebugUtils.currentLine=184287626;
 //BA.debugLineNum = 184287626;BA.debugLine="Try";
if (true) break;

case 102:
//try
this.state = 107;
this.catchState = 106;
this.state = 104;
if (true) break;

case 104:
//C
this.state = 107;
this.catchState = 106;
RDebugUtils.currentLine=184287627;
 //BA.debugLineNum = 184287627;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ss1);
 if (true) break;

case 106:
//C
this.state = 107;
this.catchState = 241;
RDebugUtils.currentLine=184287629;
 //BA.debugLineNum = 184287629;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287629",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 107:
//C
this.state = 108;
this.catchState = 241;
;
 if (true) break;

case 108:
//C
this.state = 109;
;
RDebugUtils.currentLine=184287638;
 //BA.debugLineNum = 184287638;BA.debugLine="cntFieldVal04 = cntFieldVal04 + 1";
_cntfieldval04 = (int) (_cntfieldval04+1);
RDebugUtils.currentLine=184287640;
 //BA.debugLineNum = 184287640;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_adds","id","")+1+1000000);
RDebugUtils.currentLine=184287641;
 //BA.debugLineNum = 184287641;BA.debugLine="Dim sSql1 As String = $\"insert into dta_re";
_ssql1 = ("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"									tagcode,fieldval_04,repeatfieldcounter) values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"', \n"+"								'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"', '',"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntfieldval04))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntrepeatfieldcounter))+")");
RDebugUtils.currentLine=184287645;
 //BA.debugLineNum = 184287645;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql1,_newrequest);
RDebugUtils.currentLine=184287647;
 //BA.debugLineNum = 184287647;BA.debugLine="Chapter=Group";
_chapter = _group;
RDebugUtils.currentLine=184287648;
 //BA.debugLineNum = 184287648;BA.debugLine="Posicao = Posicao + 1";
_posicao = (int) (_posicao+1);
 if (true) break;
;
RDebugUtils.currentLine=184287652;
 //BA.debugLineNum = 184287652;BA.debugLine="If (Row = 0) Then";

case 109:
//if
this.state = 126;
if ((_row==0)) { 
this.state = 111;
}else {
this.state = 119;
}if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=184287653;
 //BA.debugLineNum = 184287653;BA.debugLine="Dim Exec_Status As Int = 0";
_exec_status = (int) (0);
RDebugUtils.currentLine=184287654;
 //BA.debugLineNum = 184287654;BA.debugLine="Dim OperInsert As Boolean = False";
_operinsert = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=184287655;
 //BA.debugLineNum = 184287655;BA.debugLine="Dim ss1 As String = $\"update dta_requests_";
_ss1 = ("update dta_requests_values set\n"+"														execute_status="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_exec_status))+",\n"+"														execute_value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_qtd))+"',\n"+"														title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rtitle))+"',\n"+"														object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_robject))+"',\n"+"														position = 2,\n"+"														repeatfieldcounter=0 \n"+"														where 1=1\n"+"														And request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"														And task_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')\n"+"														And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"'\n"+"														And unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"'\n"+"														And repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rrepeatcounter))+"\n"+"														and repeatfieldcounter=0 ");
RDebugUtils.currentLine=184287670;
 //BA.debugLineNum = 184287670;BA.debugLine="Try";
if (true) break;

case 112:
//try
this.state = 117;
this.catchState = 116;
this.state = 114;
if (true) break;

case 114:
//C
this.state = 117;
this.catchState = 116;
RDebugUtils.currentLine=184287671;
 //BA.debugLineNum = 184287671;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ss1);
 if (true) break;

case 116:
//C
this.state = 117;
this.catchState = 241;
RDebugUtils.currentLine=184287673;
 //BA.debugLineNum = 184287673;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287673",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 117:
//C
this.state = 126;
this.catchState = 241;
;
RDebugUtils.currentLine=184287676;
 //BA.debugLineNum = 184287676;BA.debugLine="Dim Rs1 As ResumableSub = UpdateServerUPDo";
_rs1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs1 = _updateserverupdorins("dta_requests_values","update",_newrequest.trim(),_tagcode.trim(),_ritem.trim(),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=184287677;
 //BA.debugLineNum = 184287677;BA.debugLine="wait for (Rs1) Complete (Finished As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), _rs1);
this.state = 254;
return;
case 254:
//C
this.state = 126;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=184287678;
 //BA.debugLineNum = 184287678;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"),(int) (250));
this.state = 255;
return;
case 255:
//C
this.state = 126;
;
 if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=184287680;
 //BA.debugLineNum = 184287680;BA.debugLine="Dim Exec_Status As Int = 0";
_exec_status = (int) (0);
RDebugUtils.currentLine=184287681;
 //BA.debugLineNum = 184287681;BA.debugLine="Dim OperInsert As Boolean = True";
_operinsert = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=184287682;
 //BA.debugLineNum = 184287682;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=184287683;
 //BA.debugLineNum = 184287683;BA.debugLine="Dim ss1 As String = $\"insert into dta_requ";
_ss1 = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"														tagcode,position,execute_value,execute_format_title,\n"+"														execute_status,title,object_tagcode,repeatfieldcounter)\n"+"														select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"+"														a.item_tagcode, a.unique_key, a.tagcode, \n"+"														2, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_qtd))+"' as execute_value, a.execute_format_title,\n"+"														"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_exec_status))+" As execute_status,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rtitle))+"' as title,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_robject))+"' as object_tagcode,\n"+"														"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_row))+" as repeatfieldcounter\n"+"														from dta_requests_values As a\n"+"														where 1=1\n"+"														and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"														and task_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')\n"+"														And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"'\n"+"														And unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"'\n"+"														And repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rrepeatcounter))+"\n"+"														and repeatfieldcounter=0 ");
RDebugUtils.currentLine=184287700;
 //BA.debugLineNum = 184287700;BA.debugLine="Try";
if (true) break;

case 120:
//try
this.state = 125;
this.catchState = 124;
this.state = 122;
if (true) break;

case 122:
//C
this.state = 125;
this.catchState = 124;
RDebugUtils.currentLine=184287701;
 //BA.debugLineNum = 184287701;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(ss1)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ss1);
 if (true) break;

case 124:
//C
this.state = 125;
this.catchState = 241;
RDebugUtils.currentLine=184287703;
 //BA.debugLineNum = 184287703;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287703",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 241;
;
 if (true) break;

case 126:
//C
this.state = 251;
;
RDebugUtils.currentLine=184287712;
 //BA.debugLineNum = 184287712;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_adds","id","")+1+1000000);
RDebugUtils.currentLine=184287714;
 //BA.debugLineNum = 184287714;BA.debugLine="Dim sSql1 As String = $\"insert into dta_req";
_ssql1 = ("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"									tagcode,fieldval_04,repeatfieldcounter) values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"','"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"', \n"+"							'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"', '',"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntfieldval04))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntrepeatfieldcounter))+")");
RDebugUtils.currentLine=184287717;
 //BA.debugLineNum = 184287717;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",s";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql1,_newrequest);
RDebugUtils.currentLine=184287718;
 //BA.debugLineNum = 184287718;BA.debugLine="cntRepeatFieldCounter = cntRepeatFieldCount";
_cntrepeatfieldcounter = (int) (_cntrepeatfieldcounter+1);
RDebugUtils.currentLine=184287719;
 //BA.debugLineNum = 184287719;BA.debugLine="Posicao = Posicao + 1";
_posicao = (int) (_posicao+1);
 if (true) break;
if (true) break;

case 127:
//C
this.state = 128;
;
 if (true) break;

case 128:
//C
this.state = 129;
;
RDebugUtils.currentLine=184287722;
 //BA.debugLineNum = 184287722;BA.debugLine="rRecord.Close";
_rrecord.Close();
 if (true) break;

case 129:
//C
this.state = 130;
;
RDebugUtils.currentLine=184287729;
 //BA.debugLineNum = 184287729;BA.debugLine="Dim ListItems As List";
_listitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184287730;
 //BA.debugLineNum = 184287730;BA.debugLine="ListItems.Initialize";
_listitems.Initialize();
RDebugUtils.currentLine=184287731;
 //BA.debugLineNum = 184287731;BA.debugLine="Dim DataFields As List";
_datafields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184287732;
 //BA.debugLineNum = 184287732;BA.debugLine="DataFields.Initialize";
_datafields.Initialize();
RDebugUtils.currentLine=184287733;
 //BA.debugLineNum = 184287733;BA.debugLine="Dim MapItems As Map";
_mapitems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287734;
 //BA.debugLineNum = 184287734;BA.debugLine="MapItems.Initialize";
_mapitems.Initialize();
RDebugUtils.currentLine=184287736;
 //BA.debugLineNum = 184287736;BA.debugLine="Dim FinalSql As String =  $\"select * from dta_";
_finalsql = ("select * from dta_requests_values where 1=1\n"+"											and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"											And task_tagcode in ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')\n"+"											and repeatfieldcounter > 0");
RDebugUtils.currentLine=184287741;
 //BA.debugLineNum = 184287741;BA.debugLine="Dim RsArtigos As ResultSet = Starter.LocalSQLE";
_rsartigos = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rsartigos = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_finalsql)));
RDebugUtils.currentLine=184287744;
 //BA.debugLineNum = 184287744;BA.debugLine="MapItems.Put(\"table\",\"dta_requests_values\")";
_mapitems.Put((Object)("table"),(Object)("dta_requests_values"));
RDebugUtils.currentLine=184287745;
 //BA.debugLineNum = 184287745;BA.debugLine="MapItems.Put(\"type\",\"insert\")";
_mapitems.Put((Object)("type"),(Object)("insert"));
RDebugUtils.currentLine=184287747;
 //BA.debugLineNum = 184287747;BA.debugLine="If RsArtigos.RowCount > 0 Then";
if (true) break;

case 130:
//if
this.state = 169;
if (_rsartigos.getRowCount()>0) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
RDebugUtils.currentLine=184287748;
 //BA.debugLineNum = 184287748;BA.debugLine="Do While RsArtigos.NextRow ' ITERA SOBRE TODO";
if (true) break;

case 133:
//do while
this.state = 144;
while (_rsartigos.NextRow()) {
this.state = 135;
if (true) break;
}
if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=184287749;
 //BA.debugLineNum = 184287749;BA.debugLine="Dim MapFields As Map";
_mapfields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287750;
 //BA.debugLineNum = 184287750;BA.debugLine="MapFields.Initialize";
_mapfields.Initialize();
RDebugUtils.currentLine=184287752;
 //BA.debugLineNum = 184287752;BA.debugLine="For NFields = 0 To RsArtigos.ColumnCount -1";
if (true) break;

case 136:
//for
this.state = 143;
step283 = 1;
limit283 = (int) (_rsartigos.getColumnCount()-1);
_nfields = (int) (0) ;
this.state = 256;
if (true) break;

case 256:
//C
this.state = 143;
if ((step283 > 0 && _nfields <= limit283) || (step283 < 0 && _nfields >= limit283)) this.state = 138;
if (true) break;

case 257:
//C
this.state = 256;
_nfields = ((int)(0 + _nfields + step283)) ;
if (true) break;

case 138:
//C
this.state = 139;
RDebugUtils.currentLine=184287753;
 //BA.debugLineNum = 184287753;BA.debugLine="Dim ColName As String = RsArtigos.GetColumn";
_colname = _rsartigos.GetColumnName(_nfields);
RDebugUtils.currentLine=184287754;
 //BA.debugLineNum = 184287754;BA.debugLine="Dim ColValue As String = Utils.IfNullOrEmpt";
_colvalue = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_rsartigos.GetString(_colname),"");
RDebugUtils.currentLine=184287755;
 //BA.debugLineNum = 184287755;BA.debugLine="If ColName.ToLowerCase.trim <> \"id\" And	Col";
if (true) break;

case 139:
//if
this.state = 142;
if ((_colname.toLowerCase().trim()).equals("id") == false && (_colname.toLowerCase().trim()).equals("created_at") == false && (_colname.toLowerCase().trim()).equals("updated_at") == false) { 
this.state = 141;
}if (true) break;

case 141:
//C
this.state = 142;
RDebugUtils.currentLine=184287756;
 //BA.debugLineNum = 184287756;BA.debugLine="MapFields.Put(ColName, ColValue)";
_mapfields.Put((Object)(_colname),(Object)(_colvalue));
 if (true) break;

case 142:
//C
this.state = 257;
;
 if (true) break;
if (true) break;

case 143:
//C
this.state = 133;
;
RDebugUtils.currentLine=184287760;
 //BA.debugLineNum = 184287760;BA.debugLine="DataFields.Add(MapFields)";
_datafields.Add((Object)(_mapfields.getObject()));
RDebugUtils.currentLine=184287761;
 //BA.debugLineNum = 184287761;BA.debugLine="Log(MapFields)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287761",BA.ObjectToString(_mapfields),0);
 if (true) break;

case 144:
//C
this.state = 145;
;
RDebugUtils.currentLine=184287764;
 //BA.debugLineNum = 184287764;BA.debugLine="MapItems.Put(\"fields\",DataFields)";
_mapitems.Put((Object)("fields"),(Object)(_datafields.getObject()));
RDebugUtils.currentLine=184287765;
 //BA.debugLineNum = 184287765;BA.debugLine="Log(DataFields)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287765",BA.ObjectToString(_datafields),0);
RDebugUtils.currentLine=184287766;
 //BA.debugLineNum = 184287766;BA.debugLine="ListItems.Add(MapItems)";
_listitems.Add((Object)(_mapitems.getObject()));
RDebugUtils.currentLine=184287768;
 //BA.debugLineNum = 184287768;BA.debugLine="Dim ACLAJson As Map";
_aclajson = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287769;
 //BA.debugLineNum = 184287769;BA.debugLine="ACLAJson.Initialize";
_aclajson.Initialize();
RDebugUtils.currentLine=184287770;
 //BA.debugLineNum = 184287770;BA.debugLine="ACLAJson.put(\"items\", ListItems)";
_aclajson.Put((Object)("items"),(Object)(_listitems.getObject()));
RDebugUtils.currentLine=184287772;
 //BA.debugLineNum = 184287772;BA.debugLine="Dim NewParams As Map";
_newparams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184287773;
 //BA.debugLineNum = 184287773;BA.debugLine="NewParams.Initialize";
_newparams.Initialize();
RDebugUtils.currentLine=184287774;
 //BA.debugLineNum = 184287774;BA.debugLine="NewParams.Clear";
_newparams.Clear();
RDebugUtils.currentLine=184287775;
 //BA.debugLineNum = 184287775;BA.debugLine="NewParams.Put(\"_token\", ShareCode.APP_TOKEN)";
_newparams.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184287776;
 //BA.debugLineNum = 184287776;BA.debugLine="NewParams.Put(\"debug\", 1)";
_newparams.Put((Object)("debug"),(Object)(1));
RDebugUtils.currentLine=184287777;
 //BA.debugLineNum = 184287777;BA.debugLine="NewParams.Put(\"ACLAJson\", ACLAJson)";
_newparams.Put((Object)("ACLAJson"),(Object)(_aclajson.getObject()));
RDebugUtils.currentLine=184287778;
 //BA.debugLineNum = 184287778;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/insert-update");
RDebugUtils.currentLine=184287780;
 //BA.debugLineNum = 184287780;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_U";
if (true) break;

case 145:
//if
this.state = 168;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 147;
}else {
this.state = 167;
}if (true) break;

case 147:
//C
this.state = 148;
RDebugUtils.currentLine=184287781;
 //BA.debugLineNum = 184287781;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 148:
//if
this.state = 165;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 150;
}else {
this.state = 164;
}if (true) break;

case 150:
//C
this.state = 151;
RDebugUtils.currentLine=184287783;
 //BA.debugLineNum = 184287783;BA.debugLine="Try";
if (true) break;

case 151:
//try
this.state = 162;
this.catchState = 161;
this.state = 153;
if (true) break;

case 153:
//C
this.state = 154;
this.catchState = 161;
RDebugUtils.currentLine=184287784;
 //BA.debugLineNum = 184287784;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=184287785;
 //BA.debugLineNum = 184287785;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=184287786;
 //BA.debugLineNum = 184287786;BA.debugLine="JSON.Initialize(NewParams)";
_json.Initialize(_newparams);
RDebugUtils.currentLine=184287788;
 //BA.debugLineNum = 184287788;BA.debugLine="data = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=184287789;
 //BA.debugLineNum = 184287789;BA.debugLine="Dim JobD2S As HttpJob";
_jobd2s = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=184287790;
 //BA.debugLineNum = 184287790;BA.debugLine="JobD2S.Initialize(\"\",Me)";
_jobd2s._initialize /*String*/ (null,processBA,"",taskscl2.getObject());
RDebugUtils.currentLine=184287791;
 //BA.debugLineNum = 184287791;BA.debugLine="Dim addr As String = Url";
_addr = _url;
RDebugUtils.currentLine=184287793;
 //BA.debugLineNum = 184287793;BA.debugLine="JobD2S.PostString(addr, data )";
_jobd2s._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=184287794;
 //BA.debugLineNum = 184287794;BA.debugLine="JobD2S.GetRequest.SetContentType(\"applicat";
_jobd2s._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=184287796;
 //BA.debugLineNum = 184287796;BA.debugLine="Wait For (JobD2S) JobDone(JobD2S As HttpJo";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"), (Object)(_jobd2s));
this.state = 258;
return;
case 258:
//C
this.state = 154;
_jobd2s = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=184287798;
 //BA.debugLineNum = 184287798;BA.debugLine="If JobD2S.Success Then";
if (true) break;

case 154:
//if
this.state = 159;
if (_jobd2s._success /*boolean*/ ) { 
this.state = 156;
}else {
this.state = 158;
}if (true) break;

case 156:
//C
this.state = 159;
RDebugUtils.currentLine=184287799;
 //BA.debugLineNum = 184287799;BA.debugLine="Log(\"API Reply:\" & JobD2S.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287799","API Reply:"+_jobd2s._getstring /*String*/ (null),0);
 if (true) break;

case 158:
//C
this.state = 159;
RDebugUtils.currentLine=184287801;
 //BA.debugLineNum = 184287801;BA.debugLine="Log(\"API ERROR Reply:\" & JobD2S.GetString";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287801","API ERROR Reply:"+_jobd2s._getstring /*String*/ (null),0);
 if (true) break;

case 159:
//C
this.state = 162;
;
RDebugUtils.currentLine=184287803;
 //BA.debugLineNum = 184287803;BA.debugLine="JobD2S.Release";
_jobd2s._release /*String*/ (null);
 if (true) break;

case 161:
//C
this.state = 162;
this.catchState = 241;
RDebugUtils.currentLine=184287805;
 //BA.debugLineNum = 184287805;BA.debugLine="Dim theData As String = $\"${LastException}";
_thedata = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_data))+"");
RDebugUtils.currentLine=184287806;
 //BA.debugLineNum = 184287806;BA.debugLine="Log(theData)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287806",_thedata,0);
RDebugUtils.currentLine=184287807;
 //BA.debugLineNum = 184287807;BA.debugLine="Utils.logError(\"JobD2S\", ShareCode.SESS_OP";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"JobD2S",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,_thedata);
 if (true) break;
if (true) break;

case 162:
//C
this.state = 165;
this.catchState = 241;
;
 if (true) break;

case 164:
//C
this.state = 165;
RDebugUtils.currentLine=184287811;
 //BA.debugLineNum = 184287811;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeW";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_newrequest.trim(),_tagcode.trim(),"");
RDebugUtils.currentLine=184287812;
 //BA.debugLineNum = 184287812;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewP";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_newparams),(int) (0),_workernd);
 if (true) break;

case 165:
//C
this.state = 168;
;
RDebugUtils.currentLine=184287814;
 //BA.debugLineNum = 184287814;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowrequesttaskdetails"),(int) (250));
this.state = 259;
return;
case 259:
//C
this.state = 168;
;
 if (true) break;

case 167:
//C
this.state = 168;
RDebugUtils.currentLine=184287817;
 //BA.debugLineNum = 184287817;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWo";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_newrequest.trim(),_tagcode.trim(),"");
RDebugUtils.currentLine=184287818;
 //BA.debugLineNum = 184287818;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewPa";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_newparams),(int) (0),_workernd);
 if (true) break;

case 168:
//C
this.state = 169;
;
 if (true) break;

case 169:
//C
this.state = 170;
;
 if (true) break;
;
RDebugUtils.currentLine=184287840;
 //BA.debugLineNum = 184287840;BA.debugLine="If ((newRequestType = \"TSKS_20200513_193055\") A";

case 170:
//if
this.state = 196;
if ((((_newrequesttype).equals("TSKS_20200513_193055")) && ((_firstchecklisttemp).equals("TSKS_20200513_191407"))) || (((_newrequesttype).equals("TSKS_20200514_113923")) && ((_firstchecklisttemp).equals("TSKS_20200513_191407")))) { 
this.state = 172;
}if (true) break;

case 172:
//C
this.state = 173;
RDebugUtils.currentLine=184287842;
 //BA.debugLineNum = 184287842;BA.debugLine="Dim sNewSQL As String = $\"select x.title as ar";
_snewsql = ("select x.title as article_title, x.tagcode as article_tagcode, x.*, e.* from (\n"+"							select  ifnull(b.title,'') as group_title, ifnull(c.tagdesc,'') as type_title, a.*, d.qtd as qtdw \n"+"							from dta_articles as a\n"+"							left join dta_articles_groups as b on (b.tagcode=a.article_group)\n"+"							left join type_articlestypes as c on (c.tagcode=a.article_type)\n"+"							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and\n"+"								d.warehouse_tagcode in (select tagcode from dta_warehouses \n"+"										where object_tagcode in (select tagcode from dta_objects \n"+"											where tagcode in (select vehicle_tagcode from dta_technicals where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ))+"'))))\n"+"							) as x\n"+"							, dta_requests_values as e\n"+"							inner join dta_tasks_items as f on (f.task_tagcode=e.task_tagcode\n"+"								and f.item_tagcode=e.item_tagcode\n"+"								and f.unique_key=e.unique_key)\n"+"							where 1=1\n"+"							and e.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"							and e.task_tagcode in ('TSKS_20200513_191407')\n"+"							and f.`level`>0\n"+"							order by x.group_title, x.title");
RDebugUtils.currentLine=184287862;
 //BA.debugLineNum = 184287862;BA.debugLine="Dim rRecord As Cursor = Starter.LocalSQLEVC.Ex";
_rrecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_rrecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_snewsql)));
RDebugUtils.currentLine=184287863;
 //BA.debugLineNum = 184287863;BA.debugLine="If rRecord.RowCount > 0 Then";
if (true) break;

case 173:
//if
this.state = 195;
if (_rrecord.getRowCount()>0) { 
this.state = 175;
}if (true) break;

case 175:
//C
this.state = 176;
RDebugUtils.currentLine=184287865;
 //BA.debugLineNum = 184287865;BA.debugLine="Dim Chapter As String = \"\"";
_chapter = "";
RDebugUtils.currentLine=184287866;
 //BA.debugLineNum = 184287866;BA.debugLine="Dim cntFieldVal04 As Int = -1";
_cntfieldval04 = (int) (-1);
RDebugUtils.currentLine=184287867;
 //BA.debugLineNum = 184287867;BA.debugLine="Dim cntRepeatFieldCounter As Int = 0";
_cntrepeatfieldcounter = (int) (0);
RDebugUtils.currentLine=184287868;
 //BA.debugLineNum = 184287868;BA.debugLine="Dim cntPosicao As Int = 1";
_cntposicao = (int) (1);
RDebugUtils.currentLine=184287870;
 //BA.debugLineNum = 184287870;BA.debugLine="For Row = 0 To rRecord.RowCount-1";
if (true) break;

case 176:
//for
this.state = 194;
step349 = 1;
limit349 = (int) (_rrecord.getRowCount()-1);
_row = (int) (0) ;
this.state = 260;
if (true) break;

case 260:
//C
this.state = 194;
if ((step349 > 0 && _row <= limit349) || (step349 < 0 && _row >= limit349)) this.state = 178;
if (true) break;

case 261:
//C
this.state = 260;
_row = ((int)(0 + _row + step349)) ;
if (true) break;

case 178:
//C
this.state = 179;
RDebugUtils.currentLine=184287871;
 //BA.debugLineNum = 184287871;BA.debugLine="rRecord.Position = Row";
_rrecord.setPosition(_row);
RDebugUtils.currentLine=184287872;
 //BA.debugLineNum = 184287872;BA.debugLine="Dim Group As String = rRecord.GetString(\"gro";
_group = _rrecord.GetString("group_title");
RDebugUtils.currentLine=184287873;
 //BA.debugLineNum = 184287873;BA.debugLine="Dim Qtd As Int = rRecord.GetInt(\"qtdw\")";
_qtd = _rrecord.GetInt("qtdw");
RDebugUtils.currentLine=184287874;
 //BA.debugLineNum = 184287874;BA.debugLine="Dim RRepeatcounter As Int = rRecord.GetInt(\"";
_rrepeatcounter = _rrecord.GetInt("repeatcounter");
RDebugUtils.currentLine=184287875;
 //BA.debugLineNum = 184287875;BA.debugLine="Dim RObject As String = rRecord.GetString(\"a";
_robject = _rrecord.GetString("article_tagcode");
RDebugUtils.currentLine=184287876;
 //BA.debugLineNum = 184287876;BA.debugLine="Dim RTitle As String = rRecord.GetString(\"ar";
_rtitle = _rrecord.GetString("article_title");
RDebugUtils.currentLine=184287877;
 //BA.debugLineNum = 184287877;BA.debugLine="Dim RItem As String = rRecord.GetString(\"ite";
_ritem = _rrecord.GetString("item_tagcode");
RDebugUtils.currentLine=184287878;
 //BA.debugLineNum = 184287878;BA.debugLine="Dim RUniqueKey As String = rRecord.GetString";
_runiquekey = _rrecord.GetString("unique_key");
RDebugUtils.currentLine=184287880;
 //BA.debugLineNum = 184287880;BA.debugLine="If Not(Chapter=Group) Then ' Capitulo e dife";
if (true) break;

case 179:
//if
this.state = 188;
if (anywheresoftware.b4a.keywords.Common.Not((_chapter).equals(_group))) { 
this.state = 181;
}if (true) break;

case 181:
//C
this.state = 182;
RDebugUtils.currentLine=184287881;
 //BA.debugLineNum = 184287881;BA.debugLine="If (Row = 0) Then";
if (true) break;

case 182:
//if
this.state = 187;
if ((_row==0)) { 
this.state = 184;
}else {
this.state = 186;
}if (true) break;

case 184:
//C
this.state = 187;
RDebugUtils.currentLine=184287882;
 //BA.debugLineNum = 184287882;BA.debugLine="Dim ss1 As String = $\"update dta_requests_";
_ss1 = ("update dta_requests_values set\n"+"									execute_status=0,\n"+"									execute_value='',\n"+"									title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_group))+"',\n"+"									object_tagcode='',\n"+"									position=1,\n"+"									repeatfieldcounter=0\n"+"									where 1=1\n"+"									And request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"									And task_tagcode in ('TSKS_20200513_191407')\n"+"									And item_tagcode='AINV001'\n"+"									And unique_key='39f49fe2-8872-5302-8de6-270901935dfa'\n"+"									And repeatcounter=0\n"+"									And repeatfieldcounter=0");
 if (true) break;

case 186:
//C
this.state = 187;
RDebugUtils.currentLine=184287897;
 //BA.debugLineNum = 184287897;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=184287898;
 //BA.debugLineNum = 184287898;BA.debugLine="Dim ss1 As String = $\"insert into dta_requ";
_ss1 = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode,\n"+"									task_tagcode,item_tagcode,unique_key,\n"+"									tagcode,position,execute_value, execute_format_title,execute_status,title,object_tagcode,repeatfieldcounter)\n"+"									select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"+"									a.item_tagcode, a.unique_key, a.tagcode, \n"+"									1, '' as execute_value, a.execute_format_title,0 as execute_status,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_group))+"' as title,'' as object_tagcode,\n"+"									"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_row))+" as repeatfieldcounter\n"+"									from dta_requests_values As a\n"+"									where 1=1\n"+"									and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"									and task_tagcode in ('TSKS_20200513_191407')\n"+"									and item_tagcode='AINV001'\n"+"									and unique_key='39f49fe2-8872-5302-8de6-270901935dfa'\n"+"									and repeatcounter=0\n"+"									and repeatfieldcounter=0 ");
 if (true) break;

case 187:
//C
this.state = 188;
;
RDebugUtils.currentLine=184287915;
 //BA.debugLineNum = 184287915;BA.debugLine="cntFieldVal04 = cntFieldVal04 + 1";
_cntfieldval04 = (int) (_cntfieldval04+1);
RDebugUtils.currentLine=184287917;
 //BA.debugLineNum = 184287917;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",s";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ss1,_newrequest);
RDebugUtils.currentLine=184287919;
 //BA.debugLineNum = 184287919;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_adds","id","")+1+1000000);
RDebugUtils.currentLine=184287920;
 //BA.debugLineNum = 184287920;BA.debugLine="Dim sSql1 As String = $\"insert into dta_req";
_ssql1 = ("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"									tagcode,fieldval_04,repeatfieldcounter) values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"','TSKS_20200513_191407', 'TSKS_20200513_191407', \n"+"							'AINV001', '39f49fe2-8872-5302-8de6-270901935dfa', '',"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntfieldval04))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntrepeatfieldcounter))+")");
RDebugUtils.currentLine=184287923;
 //BA.debugLineNum = 184287923;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",s";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql1,_newrequest);
RDebugUtils.currentLine=184287925;
 //BA.debugLineNum = 184287925;BA.debugLine="Chapter=Group";
_chapter = _group;
RDebugUtils.currentLine=184287926;
 //BA.debugLineNum = 184287926;BA.debugLine="cntPosicao = cntPosicao + 1";
_cntposicao = (int) (_cntposicao+1);
 if (true) break;
;
RDebugUtils.currentLine=184287930;
 //BA.debugLineNum = 184287930;BA.debugLine="If (Row = 0) Then";

case 188:
//if
this.state = 193;
if ((_row==0)) { 
this.state = 190;
}else {
this.state = 192;
}if (true) break;

case 190:
//C
this.state = 193;
RDebugUtils.currentLine=184287931;
 //BA.debugLineNum = 184287931;BA.debugLine="Dim ss1 As String = $\"update dta_requests_v";
_ss1 = ("update dta_requests_values set\n"+"									execute_status=1,\n"+"									execute_value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_qtd))+"',\n"+"									title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rtitle))+"',\n"+"									object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_robject))+"',\n"+"									position = 2,\n"+"									repeatfieldcounter=0 \n"+"									where 1=1\n"+"									And request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"									And task_tagcode in ('TSKS_20200513_191407')\n"+"									And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"'\n"+"									And unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"'\n"+"									And repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rrepeatcounter))+"\n"+"									and repeatfieldcounter=0 ");
 if (true) break;

case 192:
//C
this.state = 193;
RDebugUtils.currentLine=184287946;
 //BA.debugLineNum = 184287946;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=184287947;
 //BA.debugLineNum = 184287947;BA.debugLine="Dim ss1 As String = $\"insert into dta_reque";
_ss1 = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"									tagcode,position,execute_value,execute_format_title,execute_status,title,object_tagcode,repeatfieldcounter)\n"+"									select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, a.request_tagcode,a.inner_request_tagcode, a.task_tagcode, \n"+"									a.item_tagcode, a.unique_key, a.tagcode, \n"+"									2, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_qtd))+"' as execute_value, a.execute_format_title, 1 as execute_status,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rtitle))+"' as title,'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_robject))+"' as object_tagcode,\n"+"									"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_row))+" as repeatfieldcounter\n"+"									from dta_requests_values As a\n"+"									where 1=1\n"+"									and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'\n"+"									and task_tagcode in ('TSKS_20200513_191407')\n"+"									and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"'\n"+"									and unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"'\n"+"									and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rrepeatcounter))+"\n"+"									and repeatfieldcounter=0 ");
 if (true) break;

case 193:
//C
this.state = 261;
;
RDebugUtils.currentLine=184287962;
 //BA.debugLineNum = 184287962;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",ss";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ss1,_newrequest);
RDebugUtils.currentLine=184287964;
 //BA.debugLineNum = 184287964;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_adds","id","")+1+1000000);
RDebugUtils.currentLine=184287966;
 //BA.debugLineNum = 184287966;BA.debugLine="Dim sSql1 As String = $\"insert into dta_requ";
_ssql1 = ("insert into dta_requests_values_adds (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"									tagcode,fieldval_04,repeatfieldcounter) values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"','TSKS_20200513_191407', 'TSKS_20200513_191407', \n"+"						'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ritem))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_runiquekey))+"', '',"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntfieldval04))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cntrepeatfieldcounter))+")");
RDebugUtils.currentLine=184287969;
 //BA.debugLineNum = 184287969;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sS";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql1,_newrequest);
RDebugUtils.currentLine=184287970;
 //BA.debugLineNum = 184287970;BA.debugLine="cntRepeatFieldCounter = cntRepeatFieldCounte";
_cntrepeatfieldcounter = (int) (_cntrepeatfieldcounter+1);
RDebugUtils.currentLine=184287971;
 //BA.debugLineNum = 184287971;BA.debugLine="cntPosicao = cntPosicao + 1";
_cntposicao = (int) (_cntposicao+1);
 if (true) break;
if (true) break;

case 194:
//C
this.state = 195;
;
 if (true) break;

case 195:
//C
this.state = 196;
;
RDebugUtils.currentLine=184287974;
 //BA.debugLineNum = 184287974;BA.debugLine="rRecord.Close";
_rrecord.Close();
 if (true) break;

case 196:
//C
this.state = 197;
;
RDebugUtils.currentLine=184287980;
 //BA.debugLineNum = 184287980;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETRE";
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*String*/ ;
RDebugUtils.currentLine=184287981;
 //BA.debugLineNum = 184287981;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newRe";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and z.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'");
RDebugUtils.currentLine=184287982;
 //BA.debugLineNum = 184287982;BA.debugLine="sSQL = $\"${sSQL} order by z.position\"$";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" order by z.position");
RDebugUtils.currentLine=184287983;
 //BA.debugLineNum = 184287983;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287983",_ssql,0);
RDebugUtils.currentLine=184287984;
 //BA.debugLineNum = 184287984;BA.debugLine="Log(newRequest)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184287984",_newrequest,0);
RDebugUtils.currentLine=184287986;
 //BA.debugLineNum = 184287986;BA.debugLine="Private incolitems As Cursor = Starter.LocalSQL";
_incolitems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_incolitems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=184287987;
 //BA.debugLineNum = 184287987;BA.debugLine="If (incolitems.RowCount >= 1) Then";
if (true) break;

case 197:
//if
this.state = 236;
if ((_incolitems.getRowCount()>=1)) { 
this.state = 199;
}if (true) break;

case 199:
//C
this.state = 200;
RDebugUtils.currentLine=184287988;
 //BA.debugLineNum = 184287988;BA.debugLine="Dim Posis As Int = 0";
_posis = (int) (0);
RDebugUtils.currentLine=184287989;
 //BA.debugLineNum = 184287989;BA.debugLine="If (Utils.NNE(FirstCheckList)) Then";
if (true) break;

case 200:
//if
this.state = 211;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_firstchecklist))) { 
this.state = 202;
}if (true) break;

case 202:
//C
this.state = 203;
RDebugUtils.currentLine=184287990;
 //BA.debugLineNum = 184287990;BA.debugLine="For a1=0 To incolitems.RowCount-1";
if (true) break;

case 203:
//for
this.state = 210;
step398 = 1;
limit398 = (int) (_incolitems.getRowCount()-1);
_a1 = (int) (0) ;
this.state = 262;
if (true) break;

case 262:
//C
this.state = 210;
if ((step398 > 0 && _a1 <= limit398) || (step398 < 0 && _a1 >= limit398)) this.state = 205;
if (true) break;

case 263:
//C
this.state = 262;
_a1 = ((int)(0 + _a1 + step398)) ;
if (true) break;

case 205:
//C
this.state = 206;
RDebugUtils.currentLine=184287991;
 //BA.debugLineNum = 184287991;BA.debugLine="incolitems.Position = a1";
_incolitems.setPosition(_a1);
RDebugUtils.currentLine=184287992;
 //BA.debugLineNum = 184287992;BA.debugLine="Dim tag As String = incolitems.GetString(\"ta";
_tag = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=184287993;
 //BA.debugLineNum = 184287993;BA.debugLine="If (tag = FirstCheckList) Then";
if (true) break;

case 206:
//if
this.state = 209;
if (((_tag).equals(_firstchecklist))) { 
this.state = 208;
}if (true) break;

case 208:
//C
this.state = 209;
RDebugUtils.currentLine=184287994;
 //BA.debugLineNum = 184287994;BA.debugLine="Posis = a1";
_posis = _a1;
 if (true) break;

case 209:
//C
this.state = 263;
;
 if (true) break;
if (true) break;

case 210:
//C
this.state = 211;
;
 if (true) break;

case 211:
//C
this.state = 212;
;
RDebugUtils.currentLine=184287998;
 //BA.debugLineNum = 184287998;BA.debugLine="incolitems.Position = Posis";
_incolitems.setPosition(_posis);
RDebugUtils.currentLine=184288000;
 //BA.debugLineNum = 184288000;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
_id = _incolitems.GetInt("id");
RDebugUtils.currentLine=184288001;
 //BA.debugLineNum = 184288001;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\"";
_tasktype = _incolitems.GetInt("type");
RDebugUtils.currentLine=184288002;
 //BA.debugLineNum = 184288002;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"stat";
_status_id = _incolitems.GetInt("status_id");
RDebugUtils.currentLine=184288003;
 //BA.debugLineNum = 184288003;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"";
_tagcode = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=184288004;
 //BA.debugLineNum = 184288004;BA.debugLine="Dim actionkey As String = incolitems.GetString";
_actionkey = _incolitems.GetString("action_tagcode");
RDebugUtils.currentLine=184288005;
 //BA.debugLineNum = 184288005;BA.debugLine="Dim task As String = incolitems.GetString(\"tas";
_task = _incolitems.GetString("task_tagcode");
RDebugUtils.currentLine=184288006;
 //BA.debugLineNum = 184288006;BA.debugLine="Dim name As String = incolitems.GetString(\"nam";
_name = _incolitems.GetString("name");
RDebugUtils.currentLine=184288009;
 //BA.debugLineNum = 184288009;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184288010;
 //BA.debugLineNum = 184288010;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=184288011;
 //BA.debugLineNum = 184288011;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=184288013;
 //BA.debugLineNum = 184288013;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
_sdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184288014;
 //BA.debugLineNum = 184288014;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
_stime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184288016;
 //BA.debugLineNum = 184288016;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clo";
_close_type = _incolitems.GetInt("close_type");
RDebugUtils.currentLine=184288017;
 //BA.debugLineNum = 184288017;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"re";
_result_type = _incolitems.GetInt("result_type");
RDebugUtils.currentLine=184288018;
 //BA.debugLineNum = 184288018;BA.debugLine="Dim result_values As String = incolitems.GetSt";
_result_values = _incolitems.GetString("result_values");
RDebugUtils.currentLine=184288019;
 //BA.debugLineNum = 184288019;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(\"";
_repeatcounter = _incolitems.GetInt("repeatcounter");
RDebugUtils.currentLine=184288021;
 //BA.debugLineNum = 184288021;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeReq";
_clainfo = parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),_close_type,_result_type,_result_values,anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1));
RDebugUtils.currentLine=184288022;
 //BA.debugLineNum = 184288022;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(t";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,_tagcode,_actionkey,_task,_repeatcounter,_tasktype,parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,_id,_tagcode,_status_id,parent.mostCurrent._utils._colorint /*int*/ (mostCurrent.activityBA,_status_id)),_clainfo,parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=184288026;
 //BA.debugLineNum = 184288026;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
_ssql = ("update dta_requests set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=184288028;
 //BA.debugLineNum = 184288028;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_tagcode);
RDebugUtils.currentLine=184288033;
 //BA.debugLineNum = 184288033;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'");
RDebugUtils.currentLine=184288035;
 //BA.debugLineNum = 184288035;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_tagcode);
RDebugUtils.currentLine=184288037;
 //BA.debugLineNum = 184288037;BA.debugLine="Log(\"Grava Status na BD local Request\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6184288037","Grava Status na BD local Request",0);
RDebugUtils.currentLine=184288038;
 //BA.debugLineNum = 184288038;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184288039;
 //BA.debugLineNum = 184288039;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=184288040;
 //BA.debugLineNum = 184288040;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=184288041;
 //BA.debugLineNum = 184288041;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184288042;
 //BA.debugLineNum = 184288042;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=184288043;
 //BA.debugLineNum = 184288043;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=184288044;
 //BA.debugLineNum = 184288044;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184288045;
 //BA.debugLineNum = 184288045;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=184288046;
 //BA.debugLineNum = 184288046;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=184288047;
 //BA.debugLineNum = 184288047;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=184288048;
 //BA.debugLineNum = 184288048;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=184288049;
 //BA.debugLineNum = 184288049;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=184288050;
 //BA.debugLineNum = 184288050;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=184288051;
 //BA.debugLineNum = 184288051;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=184288052;
 //BA.debugLineNum = 184288052;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=184288053;
 //BA.debugLineNum = 184288053;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=184288054;
 //BA.debugLineNum = 184288054;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=184288055;
 //BA.debugLineNum = 184288055;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184288056;
 //BA.debugLineNum = 184288056;BA.debugLine="Try";
if (true) break;

case 212:
//try
this.state = 217;
this.catchState = 216;
this.state = 214;
if (true) break;

case 214:
//C
this.state = 217;
this.catchState = 216;
RDebugUtils.currentLine=184288057;
 //BA.debugLineNum = 184288057;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=184288058;
 //BA.debugLineNum = 184288058;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 216:
//C
this.state = 217;
this.catchState = 241;
RDebugUtils.currentLine=184288060;
 //BA.debugLineNum = 184288060;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184288060",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=184288061;
 //BA.debugLineNum = 184288061;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=184288062;
 //BA.debugLineNum = 184288062;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=184288063;
 //BA.debugLineNum = 184288063;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 217:
//C
this.state = 218;
this.catchState = 241;
;
RDebugUtils.currentLine=184288065;
 //BA.debugLineNum = 184288065;BA.debugLine="CLA.Info.Map1 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=184288067;
 //BA.debugLineNum = 184288067;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"								where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"");
RDebugUtils.currentLine=184288069;
 //BA.debugLineNum = 184288069;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_tagcode);
RDebugUtils.currentLine=184288071;
 //BA.debugLineNum = 184288071;BA.debugLine="Log(\"Grava Status na BD local Request-Relation";
anywheresoftware.b4a.keywords.Common.LogImpl("6184288071","Grava Status na BD local Request-Relation",0);
RDebugUtils.currentLine=184288073;
 //BA.debugLineNum = 184288073;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184288074;
 //BA.debugLineNum = 184288074;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=184288075;
 //BA.debugLineNum = 184288075;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=184288076;
 //BA.debugLineNum = 184288076;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184288077;
 //BA.debugLineNum = 184288077;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=184288078;
 //BA.debugLineNum = 184288078;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
_params.Put((Object)("ACLAAction"),(Object)(_actionkey));
RDebugUtils.currentLine=184288079;
 //BA.debugLineNum = 184288079;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=184288080;
 //BA.debugLineNum = 184288080;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184288081;
 //BA.debugLineNum = 184288081;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=184288082;
 //BA.debugLineNum = 184288082;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=184288083;
 //BA.debugLineNum = 184288083;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=184288084;
 //BA.debugLineNum = 184288084;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=184288085;
 //BA.debugLineNum = 184288085;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=184288086;
 //BA.debugLineNum = 184288086;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=184288087;
 //BA.debugLineNum = 184288087;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=184288088;
 //BA.debugLineNum = 184288088;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=184288089;
 //BA.debugLineNum = 184288089;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=184288090;
 //BA.debugLineNum = 184288090;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=184288091;
 //BA.debugLineNum = 184288091;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184288092;
 //BA.debugLineNum = 184288092;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=184288093;
 //BA.debugLineNum = 184288093;BA.debugLine="Try";
if (true) break;

case 218:
//try
this.state = 223;
this.catchState = 222;
this.state = 220;
if (true) break;

case 220:
//C
this.state = 223;
this.catchState = 222;
RDebugUtils.currentLine=184288094;
 //BA.debugLineNum = 184288094;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=184288095;
 //BA.debugLineNum = 184288095;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=184288096;
 //BA.debugLineNum = 184288096;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;

case 222:
//C
this.state = 223;
this.catchState = 241;
RDebugUtils.currentLine=184288098;
 //BA.debugLineNum = 184288098;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184288098",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=184288099;
 //BA.debugLineNum = 184288099;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=184288100;
 //BA.debugLineNum = 184288100;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
 if (true) break;
if (true) break;

case 223:
//C
this.state = 224;
this.catchState = 241;
;
RDebugUtils.currentLine=184288102;
 //BA.debugLineNum = 184288102;BA.debugLine="CLA.Info.Map2 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=184288106;
 //BA.debugLineNum = 184288106;BA.debugLine="CLA.Status.status = 2";
_cla.Status /*xevolution.vrcg.devdemov2400.types._intervention*/ .status /*int*/  = (int) (2);
RDebugUtils.currentLine=184288108;
 //BA.debugLineNum = 184288108;BA.debugLine="Try";
if (true) break;

case 224:
//try
this.state = 235;
this.catchState = 234;
this.state = 226;
if (true) break;

case 226:
//C
this.state = 227;
this.catchState = 234;
RDebugUtils.currentLine=184288109;
 //BA.debugLineNum = 184288109;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScri";
_tr_is_model = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select tr_is_model from dta_typerequests\n"+"											where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequesttype.trim()))+"'"),"tr_is_model");
RDebugUtils.currentLine=184288111;
 //BA.debugLineNum = 184288111;BA.debugLine="If Utils.Int2Bool(tr_is_model) Then";
if (true) break;

case 227:
//if
this.state = 232;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_tr_is_model)) { 
this.state = 229;
}else {
this.state = 231;
}if (true) break;

case 229:
//C
this.state = 232;
RDebugUtils.currentLine=184288112;
 //BA.debugLineNum = 184288112;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activi";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_Activity_Child",(Object)(_cla),(Object)(_name));
 if (true) break;

case 231:
//C
this.state = 232;
RDebugUtils.currentLine=184288114;
 //BA.debugLineNum = 184288114;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activi";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_ActivityTasks",(Object)(_cla),(Object)(_name));
 if (true) break;

case 232:
//C
this.state = 235;
;
 if (true) break;

case 234:
//C
this.state = 235;
this.catchState = 241;
RDebugUtils.currentLine=184288118;
 //BA.debugLineNum = 184288118;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184288118",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=184288119;
 //BA.debugLineNum = 184288119;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Shar";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Call StartCLA_Activity",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 235:
//C
this.state = 236;
this.catchState = 241;
;
 if (true) break;

case 236:
//C
this.state = 239;
;
RDebugUtils.currentLine=184288122;
 //BA.debugLineNum = 184288122;BA.debugLine="incolitems.Close";
_incolitems.Close();
 if (true) break;

case 238:
//C
this.state = 239;
RDebugUtils.currentLine=184288124;
 //BA.debugLineNum = 184288124;BA.debugLine="MsgboxAsync(ShareCode.AppDialogsNaoVerificadoTi";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._appdialogsnaoverificadotipointervencao /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 239:
//C
this.state = 242;
;
 if (true) break;

case 241:
//C
this.state = 242;
this.catchState = 0;
RDebugUtils.currentLine=184288127;
 //BA.debugLineNum = 184288127;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184288127",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 242:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=184288129;
 //BA.debugLineNum = 184288129;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=184288130;
 //BA.debugLineNum = 184288130;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadnewrequest2server2(String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin,int _stage) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequest2server2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "uploadnewrequest2server2", new Object[] {_tagcode,_items,_origin,_stage}));}
ResumableSub_UploadNewRequest2Server2 rsub = new ResumableSub_UploadNewRequest2Server2(null,_tagcode,_items,_origin,_stage);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadNewRequest2Server2 extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server2(xevolution.vrcg.devdemov2400.taskscl2 parent,String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin,int _stage) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
this._stage = _stage;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _tagcode;
anywheresoftware.b4a.objects.collections.Map _items;
String _origin;
int _stage;
xevolution.vrcg.devdemov2400.types._createrequestreturn _retvalue = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185073665;
 //BA.debugLineNum = 185073665;BA.debugLine="Dim RetValue As CreateRequestReturn = Types.MakeC";
_retvalue = parent.mostCurrent._types._makecreaterequestreturnclear /*xevolution.vrcg.devdemov2400.types._createrequestreturn*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=185073666;
 //BA.debugLineNum = 185073666;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185073667;
 //BA.debugLineNum = 185073667;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=185073668;
 //BA.debugLineNum = 185073668;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=185073670;
 //BA.debugLineNum = 185073670;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185073671;
 //BA.debugLineNum = 185073671;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=185073672;
 //BA.debugLineNum = 185073672;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=185073673;
 //BA.debugLineNum = 185073673;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=185073674;
 //BA.debugLineNum = 185073674;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=185073675;
 //BA.debugLineNum = 185073675;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=185073676;
 //BA.debugLineNum = 185073676;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=185073677;
 //BA.debugLineNum = 185073677;BA.debugLine="params.Put(\"origin\", origin)";
_params.Put((Object)("origin"),(Object)(_origin));
RDebugUtils.currentLine=185073678;
 //BA.debugLineNum = 185073678;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=185073679;
 //BA.debugLineNum = 185073679;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=185073680;
 //BA.debugLineNum = 185073680;BA.debugLine="params.Put(\"stageCheck\", stage)";
_params.Put((Object)("stageCheck"),(Object)(_stage));
RDebugUtils.currentLine=185073681;
 //BA.debugLineNum = 185073681;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=185073682;
 //BA.debugLineNum = 185073682;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=185073683;
 //BA.debugLineNum = 185073683;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=185073684;
 //BA.debugLineNum = 185073684;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=185073685;
 //BA.debugLineNum = 185073685;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=185073687;
 //BA.debugLineNum = 185073687;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=185073688;
 //BA.debugLineNum = 185073688;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=185073689;
 //BA.debugLineNum = 185073689;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=185073690;
 //BA.debugLineNum = 185073690;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185073690",_data,0);
RDebugUtils.currentLine=185073691;
 //BA.debugLineNum = 185073691;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/new");
RDebugUtils.currentLine=185073692;
 //BA.debugLineNum = 185073692;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=185073693;
 //BA.debugLineNum = 185073693;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=185073694;
 //BA.debugLineNum = 185073694;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",taskscl2.getObject());
RDebugUtils.currentLine=185073695;
 //BA.debugLineNum = 185073695;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=185073696;
 //BA.debugLineNum = 185073696;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=185073697;
 //BA.debugLineNum = 185073697;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "uploadnewrequest2server2"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=185073698;
 //BA.debugLineNum = 185073698;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=185073699;
 //BA.debugLineNum = 185073699;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185073699",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=185073701;
 //BA.debugLineNum = 185073701;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=185073702;
 //BA.debugLineNum = 185073702;BA.debugLine="JSON1.Initialize(Job.GetString)";
_json1.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=185073703;
 //BA.debugLineNum = 185073703;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=185073704;
 //BA.debugLineNum = 185073704;BA.debugLine="RetValue.RequestTagcode = Utils.IfNullOrEmpty(M";
_retvalue.RequestTagcode /*String*/  = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_mapjson.Get((Object)("newrequest"))),"");
RDebugUtils.currentLine=185073705;
 //BA.debugLineNum = 185073705;BA.debugLine="RetValue.Status = Utils.IfNullOrEmptyInt(MapJSO";
_retvalue.Status /*int*/  = parent.mostCurrent._utils._ifnulloremptyint /*int*/ (mostCurrent.activityBA,BA.ObjectToString(_mapjson.Get((Object)("status"))),(int) (0));
RDebugUtils.currentLine=185073706;
 //BA.debugLineNum = 185073706;BA.debugLine="RetValue.Stage = Utils.IfNullOrEmptyInt(MapJSON";
_retvalue.Stage /*int*/  = parent.mostCurrent._utils._ifnulloremptyint /*int*/ (mostCurrent.activityBA,BA.ObjectToString(_mapjson.Get((Object)("stage"))),(int) (0));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=185073708;
 //BA.debugLineNum = 185073708;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185073709;
 //BA.debugLineNum = 185073709;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=185073711;
 //BA.debugLineNum = 185073711;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=185073713;
 //BA.debugLineNum = 185073713;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185073714;
 //BA.debugLineNum = 185073714;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=185073717;
 //BA.debugLineNum = 185073717;BA.debugLine="Return RetValue";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_retvalue));return;};
RDebugUtils.currentLine=185073718;
 //BA.debugLineNum = 185073718;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updateserverupdorins(String _tablename,String _operationtype,String _request_tagcode,String _task_tagcode,String _item_tagcode,int _rc,int _rfc,int _ric) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateserverupdorins", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "updateserverupdorins", new Object[] {_tablename,_operationtype,_request_tagcode,_task_tagcode,_item_tagcode,_rc,_rfc,_ric}));}
ResumableSub_UpdateServerUPDorINS rsub = new ResumableSub_UpdateServerUPDorINS(null,_tablename,_operationtype,_request_tagcode,_task_tagcode,_item_tagcode,_rc,_rfc,_ric);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateServerUPDorINS extends BA.ResumableSub {
public ResumableSub_UpdateServerUPDorINS(xevolution.vrcg.devdemov2400.taskscl2 parent,String _tablename,String _operationtype,String _request_tagcode,String _task_tagcode,String _item_tagcode,int _rc,int _rfc,int _ric) {
this.parent = parent;
this._tablename = _tablename;
this._operationtype = _operationtype;
this._request_tagcode = _request_tagcode;
this._task_tagcode = _task_tagcode;
this._item_tagcode = _item_tagcode;
this._rc = _rc;
this._rfc = _rfc;
this._ric = _ric;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
String _tablename;
String _operationtype;
String _request_tagcode;
String _task_tagcode;
String _item_tagcode;
int _rc;
int _rfc;
int _ric;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _tablequery = null;
anywheresoftware.b4a.objects.collections.Map _mapfields = null;
anywheresoftware.b4a.objects.collections.List _datafields = null;
anywheresoftware.b4a.objects.collections.Map _mapitems = null;
anywheresoftware.b4a.objects.collections.List _listitems = null;
anywheresoftware.b4a.objects.collections.Map _mapconditions = null;
int _colnum = 0;
String _colname = "";
String _colvalue = "";
anywheresoftware.b4a.objects.collections.List _listconditions = null;
anywheresoftware.b4a.objects.collections.Map _aclajson = null;
anywheresoftware.b4a.objects.collections.Map _newparams = null;
String _url = "";
String _data = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
xevolution.vrcg.devdemov2400.httpjob _jobd2s = null;
String _addr = "";
String _thedata = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="taskscl2";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185597955;
 //BA.debugLineNum = 185597955;BA.debugLine="If item_tagcode <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_item_tagcode).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=185597957;
 //BA.debugLineNum = 185597957;BA.debugLine="Dim TableQuery As ResultSet = Starter.LocalSQLEV";
_tablequery = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_tablequery = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+" where 1=1\n"+"																	And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_tagcode))+"'\n"+"																	And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"																	and item_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode))+"'\n"+"																	and repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rc))+"\n"+"																	and repeatfieldcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rfc))+"\n"+"																	and repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ric))+""))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=185597965;
 //BA.debugLineNum = 185597965;BA.debugLine="Dim TableQuery As ResultSet = Starter.LocalSQLEV";
_tablequery = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_tablequery = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tablename))+" where 1=1\n"+"																	And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_tagcode))+"'\n"+"																	And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"																	and repeatcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rc))+"\n"+"																	and repeatitemcounter = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ric))+""))));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=185597976;
 //BA.debugLineNum = 185597976;BA.debugLine="Dim MapFields As Map";
_mapfields = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185597977;
 //BA.debugLineNum = 185597977;BA.debugLine="MapFields.Initialize";
_mapfields.Initialize();
RDebugUtils.currentLine=185597978;
 //BA.debugLineNum = 185597978;BA.debugLine="Dim DataFields As List";
_datafields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185597979;
 //BA.debugLineNum = 185597979;BA.debugLine="DataFields.Initialize";
_datafields.Initialize();
RDebugUtils.currentLine=185597980;
 //BA.debugLineNum = 185597980;BA.debugLine="Dim MapItems As Map";
_mapitems = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185597981;
 //BA.debugLineNum = 185597981;BA.debugLine="MapItems.Initialize";
_mapitems.Initialize();
RDebugUtils.currentLine=185597982;
 //BA.debugLineNum = 185597982;BA.debugLine="Dim ListItems As List";
_listitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185597983;
 //BA.debugLineNum = 185597983;BA.debugLine="ListItems.Initialize";
_listitems.Initialize();
RDebugUtils.currentLine=185597984;
 //BA.debugLineNum = 185597984;BA.debugLine="Dim MapConditions As Map";
_mapconditions = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185597985;
 //BA.debugLineNum = 185597985;BA.debugLine="MapConditions.Initialize";
_mapconditions.Initialize();
RDebugUtils.currentLine=185597987;
 //BA.debugLineNum = 185597987;BA.debugLine="MapItems.Put(\"table\",\"dta_requests_values\")";
_mapitems.Put((Object)("table"),(Object)("dta_requests_values"));
RDebugUtils.currentLine=185597988;
 //BA.debugLineNum = 185597988;BA.debugLine="MapItems.Put(\"type\",Operationtype)";
_mapitems.Put((Object)("type"),(Object)(_operationtype));
RDebugUtils.currentLine=185597991;
 //BA.debugLineNum = 185597991;BA.debugLine="If TableQuery.RowCount > 0 Then";
if (true) break;

case 7:
//if
this.state = 69;
if (_tablequery.getRowCount()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=185597992;
 //BA.debugLineNum = 185597992;BA.debugLine="Do While TableQuery.NextRow";
if (true) break;

case 10:
//do while
this.state = 40;
while (_tablequery.NextRow()) {
this.state = 12;
if (true) break;
}
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=185597993;
 //BA.debugLineNum = 185597993;BA.debugLine="For colnum = 0 To TableQuery.ColumnCount -1";
if (true) break;

case 13:
//for
this.state = 39;
step20 = 1;
limit20 = (int) (_tablequery.getColumnCount()-1);
_colnum = (int) (0) ;
this.state = 70;
if (true) break;

case 70:
//C
this.state = 39;
if ((step20 > 0 && _colnum <= limit20) || (step20 < 0 && _colnum >= limit20)) this.state = 15;
if (true) break;

case 71:
//C
this.state = 70;
_colnum = ((int)(0 + _colnum + step20)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=185597994;
 //BA.debugLineNum = 185597994;BA.debugLine="Dim ColName As String = TableQuery.GetColumnNa";
_colname = _tablequery.GetColumnName(_colnum);
RDebugUtils.currentLine=185597995;
 //BA.debugLineNum = 185597995;BA.debugLine="Dim ColValue As String = TableQuery.GetString(";
_colvalue = _tablequery.GetString(_colname);
RDebugUtils.currentLine=185597996;
 //BA.debugLineNum = 185597996;BA.debugLine="If ColName.ToLowerCase.trim <> \"id\" And ColNam";
if (true) break;

case 16:
//if
this.state = 38;
if ((_colname.toLowerCase().trim()).equals("id") == false && (_colname.toLowerCase().trim()).equals("created_at") == false && (_colname.toLowerCase().trim()).equals("updated_at") == false) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=185597997;
 //BA.debugLineNum = 185597997;BA.debugLine="If Utils.isNull(ColValue) Then";
if (true) break;

case 19:
//if
this.state = 22;
if (parent.mostCurrent._utils._isnull /*boolean*/ (mostCurrent.activityBA,_colvalue)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=185597998;
 //BA.debugLineNum = 185597998;BA.debugLine="ColValue = \"\"";
_colvalue = "";
 if (true) break;
;
RDebugUtils.currentLine=185598000;
 //BA.debugLineNum = 185598000;BA.debugLine="If Operationtype = \"update\" Then";

case 22:
//if
this.state = 37;
if ((_operationtype).equals("update")) { 
this.state = 24;
}else {
this.state = 36;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=185598001;
 //BA.debugLineNum = 185598001;BA.debugLine="MapFields.Put(\"execute_status\",\"1\")";
_mapfields.Put((Object)("execute_status"),(Object)("1"));
RDebugUtils.currentLine=185598002;
 //BA.debugLineNum = 185598002;BA.debugLine="If ColName.ToLowerCase.Trim = \"execute_value";
if (true) break;

case 25:
//if
this.state = 34;
if ((_colname.toLowerCase().trim()).equals("execute_value")) { 
this.state = 27;
}else 
{RDebugUtils.currentLine=185598004;
 //BA.debugLineNum = 185598004;BA.debugLine="Else If ColName.ToLowerCase.Trim = \"execute_";
if ((_colname.toLowerCase().trim()).equals("execute_value_title")) { 
this.state = 29;
}else 
{RDebugUtils.currentLine=185598006;
 //BA.debugLineNum = 185598006;BA.debugLine="Else If ColName.ToLowerCase.Trim = \"title\" T";
if ((_colname.toLowerCase().trim()).equals("title")) { 
this.state = 31;
}else 
{RDebugUtils.currentLine=185598008;
 //BA.debugLineNum = 185598008;BA.debugLine="Else If ColName.ToLowerCase.Trim = \"object_t";
if ((_colname.toLowerCase().trim()).equals("object_tagcode")) { 
this.state = 33;
}}}}
if (true) break;

case 27:
//C
this.state = 34;
RDebugUtils.currentLine=185598003;
 //BA.debugLineNum = 185598003;BA.debugLine="MapFields.Put(ColName, ColValue)";
_mapfields.Put((Object)(_colname),(Object)(_colvalue));
 if (true) break;

case 29:
//C
this.state = 34;
RDebugUtils.currentLine=185598005;
 //BA.debugLineNum = 185598005;BA.debugLine="MapFields.Put(ColName, ColValue)";
_mapfields.Put((Object)(_colname),(Object)(_colvalue));
 if (true) break;

case 31:
//C
this.state = 34;
RDebugUtils.currentLine=185598007;
 //BA.debugLineNum = 185598007;BA.debugLine="MapFields.Put(ColName, ColValue)";
_mapfields.Put((Object)(_colname),(Object)(_colvalue));
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=185598009;
 //BA.debugLineNum = 185598009;BA.debugLine="MapFields.Put(ColName, ColValue)";
_mapfields.Put((Object)(_colname),(Object)(_colvalue));
 if (true) break;

case 34:
//C
this.state = 37;
;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=185598012;
 //BA.debugLineNum = 185598012;BA.debugLine="MapFields.Put(ColName, ColValue)";
_mapfields.Put((Object)(_colname),(Object)(_colvalue));
 if (true) break;

case 37:
//C
this.state = 38;
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
this.state = 10;
;
RDebugUtils.currentLine=185598018;
 //BA.debugLineNum = 185598018;BA.debugLine="DataFields.Add(MapFields)";
_datafields.Add((Object)(_mapfields.getObject()));
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=185598022;
 //BA.debugLineNum = 185598022;BA.debugLine="MapItems.Put(\"fields\",DataFields)";
_mapitems.Put((Object)("fields"),(Object)(_datafields.getObject()));
RDebugUtils.currentLine=185598024;
 //BA.debugLineNum = 185598024;BA.debugLine="If Operationtype = \"update\" Then";
if (true) break;

case 41:
//if
this.state = 44;
if ((_operationtype).equals("update")) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=185598026;
 //BA.debugLineNum = 185598026;BA.debugLine="MapConditions.Put(\"request_tagcode\",request_tag";
_mapconditions.Put((Object)("request_tagcode"),(Object)(_request_tagcode.trim()));
RDebugUtils.currentLine=185598027;
 //BA.debugLineNum = 185598027;BA.debugLine="MapConditions.Put(\"task_tagcode\",task_tagcode.t";
_mapconditions.Put((Object)("task_tagcode"),(Object)(_task_tagcode.trim()));
RDebugUtils.currentLine=185598028;
 //BA.debugLineNum = 185598028;BA.debugLine="MapConditions.Put(\"item_tagcode\",item_tagcode.T";
_mapconditions.Put((Object)("item_tagcode"),(Object)(_item_tagcode.trim()));
RDebugUtils.currentLine=185598029;
 //BA.debugLineNum = 185598029;BA.debugLine="MapConditions.Put(\"repeatcounter\",rc)";
_mapconditions.Put((Object)("repeatcounter"),(Object)(_rc));
RDebugUtils.currentLine=185598030;
 //BA.debugLineNum = 185598030;BA.debugLine="MapConditions.Put(\"repeatitemcounter\",ric)";
_mapconditions.Put((Object)("repeatitemcounter"),(Object)(_ric));
RDebugUtils.currentLine=185598031;
 //BA.debugLineNum = 185598031;BA.debugLine="MapConditions.Put(\"repeatfieldcounter\",rfc)";
_mapconditions.Put((Object)("repeatfieldcounter"),(Object)(_rfc));
RDebugUtils.currentLine=185598033;
 //BA.debugLineNum = 185598033;BA.debugLine="Dim ListConditions As List";
_listconditions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185598034;
 //BA.debugLineNum = 185598034;BA.debugLine="ListConditions.Initialize";
_listconditions.Initialize();
RDebugUtils.currentLine=185598035;
 //BA.debugLineNum = 185598035;BA.debugLine="ListConditions.Add(MapConditions)";
_listconditions.Add((Object)(_mapconditions.getObject()));
RDebugUtils.currentLine=185598037;
 //BA.debugLineNum = 185598037;BA.debugLine="MapItems.Put(\"where\", ListConditions)";
_mapitems.Put((Object)("where"),(Object)(_listconditions.getObject()));
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=185598041;
 //BA.debugLineNum = 185598041;BA.debugLine="ListItems.Add(MapItems)";
_listitems.Add((Object)(_mapitems.getObject()));
RDebugUtils.currentLine=185598043;
 //BA.debugLineNum = 185598043;BA.debugLine="Dim ACLAJson As Map";
_aclajson = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185598044;
 //BA.debugLineNum = 185598044;BA.debugLine="ACLAJson.Initialize";
_aclajson.Initialize();
RDebugUtils.currentLine=185598045;
 //BA.debugLineNum = 185598045;BA.debugLine="ACLAJson.put(\"items\",ListItems)";
_aclajson.Put((Object)("items"),(Object)(_listitems.getObject()));
RDebugUtils.currentLine=185598047;
 //BA.debugLineNum = 185598047;BA.debugLine="Dim NewParams As Map";
_newparams = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185598048;
 //BA.debugLineNum = 185598048;BA.debugLine="NewParams.Initialize";
_newparams.Initialize();
RDebugUtils.currentLine=185598049;
 //BA.debugLineNum = 185598049;BA.debugLine="NewParams.Clear";
_newparams.Clear();
RDebugUtils.currentLine=185598050;
 //BA.debugLineNum = 185598050;BA.debugLine="NewParams.Put(\"_token\", ShareCode.APP_TOKEN)";
_newparams.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=185598051;
 //BA.debugLineNum = 185598051;BA.debugLine="NewParams.Put(\"ACLAJson\", ACLAJson)";
_newparams.Put((Object)("ACLAJson"),(Object)(_aclajson.getObject()));
RDebugUtils.currentLine=185598052;
 //BA.debugLineNum = 185598052;BA.debugLine="NewParams.Put(\"debug\", 1)";
_newparams.Put((Object)("debug"),(Object)(1));
RDebugUtils.currentLine=185598053;
 //BA.debugLineNum = 185598053;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DO";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/insert-update");
RDebugUtils.currentLine=185598055;
 //BA.debugLineNum = 185598055;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLO";
if (true) break;

case 45:
//if
this.state = 68;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 47;
}else {
this.state = 67;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=185598056;
 //BA.debugLineNum = 185598056;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 48:
//if
this.state = 65;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 50;
}else {
this.state = 64;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=185598058;
 //BA.debugLineNum = 185598058;BA.debugLine="Try";
if (true) break;

case 51:
//try
this.state = 62;
this.catchState = 61;
this.state = 53;
if (true) break;

case 53:
//C
this.state = 54;
this.catchState = 61;
RDebugUtils.currentLine=185598059;
 //BA.debugLineNum = 185598059;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=185598060;
 //BA.debugLineNum = 185598060;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=185598061;
 //BA.debugLineNum = 185598061;BA.debugLine="JSON.Initialize(NewParams)";
_json.Initialize(_newparams);
RDebugUtils.currentLine=185598063;
 //BA.debugLineNum = 185598063;BA.debugLine="data = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=185598064;
 //BA.debugLineNum = 185598064;BA.debugLine="Dim JobD2S As HttpJob";
_jobd2s = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=185598065;
 //BA.debugLineNum = 185598065;BA.debugLine="JobD2S.Initialize(\"\",Me)";
_jobd2s._initialize /*String*/ (null,processBA,"",taskscl2.getObject());
RDebugUtils.currentLine=185598066;
 //BA.debugLineNum = 185598066;BA.debugLine="Dim addr As String = Url";
_addr = _url;
RDebugUtils.currentLine=185598067;
 //BA.debugLineNum = 185598067;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185598067",_data,0);
RDebugUtils.currentLine=185598068;
 //BA.debugLineNum = 185598068;BA.debugLine="JobD2S.PostString(addr, data )";
_jobd2s._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=185598069;
 //BA.debugLineNum = 185598069;BA.debugLine="JobD2S.GetRequest.SetContentType(\"application";
_jobd2s._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=185598071;
 //BA.debugLineNum = 185598071;BA.debugLine="Wait For (JobD2S) JobDone(JobD2S As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "updateserverupdorins"), (Object)(_jobd2s));
this.state = 72;
return;
case 72:
//C
this.state = 54;
_jobd2s = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=185598073;
 //BA.debugLineNum = 185598073;BA.debugLine="If JobD2S.Success Then";
if (true) break;

case 54:
//if
this.state = 59;
if (_jobd2s._success /*boolean*/ ) { 
this.state = 56;
}else {
this.state = 58;
}if (true) break;

case 56:
//C
this.state = 59;
RDebugUtils.currentLine=185598074;
 //BA.debugLineNum = 185598074;BA.debugLine="Log(\"API Reply:\" & JobD2S.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185598074","API Reply:"+_jobd2s._getstring /*String*/ (null),0);
 if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=185598076;
 //BA.debugLineNum = 185598076;BA.debugLine="Log(\"API ERROR Reply:\" & JobD2S.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185598076","API ERROR Reply:"+_jobd2s._getstring /*String*/ (null),0);
 if (true) break;

case 59:
//C
this.state = 62;
;
RDebugUtils.currentLine=185598078;
 //BA.debugLineNum = 185598078;BA.debugLine="JobD2S.Release";
_jobd2s._release /*String*/ (null);
 if (true) break;

case 61:
//C
this.state = 62;
this.catchState = 0;
RDebugUtils.currentLine=185598080;
 //BA.debugLineNum = 185598080;BA.debugLine="Dim theData As String = $\"${LastException}, $";
_thedata = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_data))+"");
RDebugUtils.currentLine=185598081;
 //BA.debugLineNum = 185598081;BA.debugLine="Log(theData)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185598081",_thedata,0);
RDebugUtils.currentLine=185598082;
 //BA.debugLineNum = 185598082;BA.debugLine="Utils.logError(\"JobD2S\", ShareCode.SESS_OPER_";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"JobD2S",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,_thedata);
 if (true) break;
if (true) break;

case 62:
//C
this.state = 65;
this.catchState = 0;
;
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=185598086;
 //BA.debugLineNum = 185598086;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_request_tagcode.trim(),_task_tagcode.trim(),_item_tagcode.trim());
RDebugUtils.currentLine=185598087;
 //BA.debugLineNum = 185598087;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewPara";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_newparams),(int) (0),_workernd);
 if (true) break;

case 65:
//C
this.state = 68;
;
RDebugUtils.currentLine=185598089;
 //BA.debugLineNum = 185598089;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "updateserverupdorins"),(int) (250));
this.state = 73;
return;
case 73:
//C
this.state = 68;
;
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=185598092;
 //BA.debugLineNum = 185598092;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (1),_request_tagcode.trim(),_task_tagcode.trim(),_item_tagcode.trim());
RDebugUtils.currentLine=185598093;
 //BA.debugLineNum = 185598093;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(NewParam";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_newparams),(int) (0),_workernd);
 if (true) break;

case 68:
//C
this.state = 69;
;
 if (true) break;

case 69:
//C
this.state = -1;
;
RDebugUtils.currentLine=185598097;
 //BA.debugLineNum = 185598097;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=185598098;
 //BA.debugLineNum = 185598098;BA.debugLine="End Sub";
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
public static void  _returnshowtaskdetails(anywheresoftware.b4a.objects.collections.List _items,xevolution.vrcg.devdemov2400.types._triplevalues _tvals) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "returnshowtaskdetails", false))
	 {Debug.delegate(mostCurrent.activityBA, "returnshowtaskdetails", new Object[] {_items,_tvals}); return;}
ResumableSub_ReturnShowTaskDetails rsub = new ResumableSub_ReturnShowTaskDetails(null,_items,_tvals);
rsub.resume(processBA, null);
}
public static class ResumableSub_ReturnShowTaskDetails extends BA.ResumableSub {
public ResumableSub_ReturnShowTaskDetails(xevolution.vrcg.devdemov2400.taskscl2 parent,anywheresoftware.b4a.objects.collections.List _items,xevolution.vrcg.devdemov2400.types._triplevalues _tvals) {
this.parent = parent;
this._items = _items;
this._tvals = _tvals;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
anywheresoftware.b4a.objects.collections.List _items;
xevolution.vrcg.devdemov2400.types._triplevalues _tvals;
String _newrequesttype = "";
String _tagcode = "";
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
String _newrequest = "";
String _newdate = "";
String _newtime = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
int _repeatcounter = 0;
int _maxidi = 0;
String _ssql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
xevolution.vrcg.devdemov2400.types._createrequestreturn _newrequestcode = null;
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
RDebugUtils.currentModule="taskscl2";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=184942596;
 //BA.debugLineNum = 184942596;BA.debugLine="Dim newRequestType As String = items.Get(0)";
_newrequesttype = BA.ObjectToString(_items.Get((int) (0)));
RDebugUtils.currentLine=184942597;
 //BA.debugLineNum = 184942597;BA.debugLine="Dim tagcode As String = TVals.value1";
_tagcode = _tvals.value1 /*String*/ ;
RDebugUtils.currentLine=184942598;
 //BA.debugLineNum = 184942598;BA.debugLine="ProgressDialogShow(ShareCode.AvisoPrepararCheckli";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoprepararchecklist /*String*/ ));
RDebugUtils.currentLine=184942599;
 //BA.debugLineNum = 184942599;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 42;
this.catchState = 41;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 41;
RDebugUtils.currentLine=184942600;
 //BA.debugLineNum = 184942600;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184942601;
 //BA.debugLineNum = 184942601;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=184942603;
 //BA.debugLineNum = 184942603;BA.debugLine="If Utils.NNE(newRequestType) Then";
if (true) break;

case 4:
//if
this.state = 39;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequesttype)) { 
this.state = 6;
}else {
this.state = 38;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=184942604;
 //BA.debugLineNum = 184942604;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTag";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184942605;
 //BA.debugLineNum = 184942605;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184942606;
 //BA.debugLineNum = 184942606;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184942607;
 //BA.debugLineNum = 184942607;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests","id","")+1+1000000);
RDebugUtils.currentLine=184942609;
 //BA.debugLineNum = 184942609;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184942610;
 //BA.debugLineNum = 184942610;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=184942611;
 //BA.debugLineNum = 184942611;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=184942612;
 //BA.debugLineNum = 184942612;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=184942613;
 //BA.debugLineNum = 184942613;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE_";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=184942614;
 //BA.debugLineNum = 184942614;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=184942615;
 //BA.debugLineNum = 184942615;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=184942616;
 //BA.debugLineNum = 184942616;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=184942617;
 //BA.debugLineNum = 184942617;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=184942618;
 //BA.debugLineNum = 184942618;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=184942619;
 //BA.debugLineNum = 184942619;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=184942620;
 //BA.debugLineNum = 184942620;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=184942621;
 //BA.debugLineNum = 184942621;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=184942622;
 //BA.debugLineNum = 184942622;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=184942623;
 //BA.debugLineNum = 184942623;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=184942624;
 //BA.debugLineNum = 184942624;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=184942625;
 //BA.debugLineNum = 184942625;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERN";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=184942626;
 //BA.debugLineNum = 184942626;BA.debugLine="newExecution.Put(\"entity_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("entity_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=184942627;
 //BA.debugLineNum = 184942627;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=184942628;
 //BA.debugLineNum = 184942628;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=184942629;
 //BA.debugLineNum = 184942629;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=184942630;
 //BA.debugLineNum = 184942630;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
_newexecution.Put((Object)("local_tagcode"),(Object)(""));
RDebugUtils.currentLine=184942631;
 //BA.debugLineNum = 184942631;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newRequ";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_newrequesttype));
RDebugUtils.currentLine=184942632;
 //BA.debugLineNum = 184942632;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.S";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=184942633;
 //BA.debugLineNum = 184942633;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=184942634;
 //BA.debugLineNum = 184942634;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=184942635;
 //BA.debugLineNum = 184942635;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184942636;
 //BA.debugLineNum = 184942636;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=184942637;
 //BA.debugLineNum = 184942637;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=184942638;
 //BA.debugLineNum = 184942638;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=184942640;
 //BA.debugLineNum = 184942640;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=184942642;
 //BA.debugLineNum = 184942642;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCoun";
_repeatcounter = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'"));
RDebugUtils.currentLine=184942644;
 //BA.debugLineNum = 184942644;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations","id","")+1+1000000);
RDebugUtils.currentLine=184942645;
 //BA.debugLineNum = 184942645;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184942646;
 //BA.debugLineNum = 184942646;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=184942647;
 //BA.debugLineNum = 184942647;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=184942648;
 //BA.debugLineNum = 184942648;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=184942649;
 //BA.debugLineNum = 184942649;BA.debugLine="newExecution.Put(\"relation_tagcode\", tagcode)";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=184942650;
 //BA.debugLineNum = 184942650;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=184942651;
 //BA.debugLineNum = 184942651;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=184942652;
 //BA.debugLineNum = 184942652;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=184942653;
 //BA.debugLineNum = 184942653;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=184942654;
 //BA.debugLineNum = 184942654;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=184942655;
 //BA.debugLineNum = 184942655;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=184942656;
 //BA.debugLineNum = 184942656;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=184942657;
 //BA.debugLineNum = 184942657;BA.debugLine="newExecution.Put(\"object_tagcode\", \"__NONE__\")";
_newexecution.Put((Object)("object_tagcode"),(Object)("__NONE__"));
RDebugUtils.currentLine=184942658;
 //BA.debugLineNum = 184942658;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=184942659;
 //BA.debugLineNum = 184942659;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=184942660;
 //BA.debugLineNum = 184942660;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=184942661;
 //BA.debugLineNum = 184942661;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounter";
_newexecution.Put((Object)("repeatcounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=184942662;
 //BA.debugLineNum = 184942662;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=184942663;
 //BA.debugLineNum = 184942663;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=184942664;
 //BA.debugLineNum = 184942664;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=184942665;
 //BA.debugLineNum = 184942665;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=184942666;
 //BA.debugLineNum = 184942666;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=184942668;
 //BA.debugLineNum = 184942668;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=184942671;
 //BA.debugLineNum = 184942671;BA.debugLine="Dim maxIDi As Int = DBStructures.GetScriptColum";
_maxidi = (int) (parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,"select max(id) as id from dta_requests_values","id")+1+1000000);
RDebugUtils.currentLine=184942674;
 //BA.debugLineNum = 184942674;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"					tagcode,position,execute_value,execute_format_title,confirmed,changed_value, repeatcounter)\n"+"					select x.id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"+"					from (select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxidi))+" as id, a.request_tagcode, b.tagcode as inner_request_tagcode, \n"+"					a.relation_tagcode as task_tagcode, \n"+"					c.item_tagcode, c.unique_key, d.tagcode as tagcode, \n"+"					ifnull(d.position, c.position) AS position, '' as execute_value, \n"+"					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"					0 as confirmed, '' as changed_value, a.repeatcounter\n"+"					from dta_requests_relations as a\n"+"					inner join dta_tasks as b on (b.tagcode=a.relation_tagcode)\n"+"					inner join dta_tasks_items as c on (c.task_tagcode=a.relation_tagcode)\n"+"					left join dta_tasks_items_answers as d on (d.parent_tagcode=c.unique_key)\n"+"					where a.type_relation=0 and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' \n"+"					and a.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"					) as x\n"+"					order by  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=184942693;
 //BA.debugLineNum = 184942693;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942693",_ssql,0);
RDebugUtils.currentLine=184942694;
 //BA.debugLineNum = 184942694;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_newrequest);
RDebugUtils.currentLine=184942697;
 //BA.debugLineNum = 184942697;BA.debugLine="Dim res As ResumableSub = UploadNewRequest2Serv";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _uploadnewrequest2server2(_newrequest,_newrequestitem,"0",(int) (0));
RDebugUtils.currentLine=184942698;
 //BA.debugLineNum = 184942698;BA.debugLine="Wait For(res) Complete (NewRequestCode As Creat";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowtaskdetails"), _res);
this.state = 43;
return;
case 43:
//C
this.state = 7;
_newrequestcode = (xevolution.vrcg.devdemov2400.types._createrequestreturn) result[0];
;
RDebugUtils.currentLine=184942699;
 //BA.debugLineNum = 184942699;BA.debugLine="If(Utils.NNE(NewRequestCode.RequestTagcode)) Th";
if (true) break;

case 7:
//if
this.state = 14;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequestcode.RequestTagcode /*String*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=184942700;
 //BA.debugLineNum = 184942700;BA.debugLine="If Not(newRequest = NewRequestCode.RequestTagc";
if (true) break;

case 10:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.Not((_newrequest).equals(_newrequestcode.RequestTagcode /*String*/ ))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=184942701;
 //BA.debugLineNum = 184942701;BA.debugLine="Dim sSQL As String = $\"update dta_requests se";
_ssql = ("update dta_requests set tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942702;
 //BA.debugLineNum = 184942702;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942703;
 //BA.debugLineNum = 184942703;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ad";
_ssql = ("update dta_requests_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942704;
 //BA.debugLineNum = 184942704;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942706;
 //BA.debugLineNum = 184942706;BA.debugLine="Dim sSQL As String = $\"update dta_requests_en";
_ssql = ("update dta_requests_entities set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942707;
 //BA.debugLineNum = 184942707;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942709;
 //BA.debugLineNum = 184942709;BA.debugLine="Dim sSQL As String = $\"update dta_requests_ob";
_ssql = ("update dta_requests_objects set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942710;
 //BA.debugLineNum = 184942710;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942712;
 //BA.debugLineNum = 184942712;BA.debugLine="Dim sSQL As String = $\"update dta_requests_co";
_ssql = ("update dta_requests_contacts set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942713;
 //BA.debugLineNum = 184942713;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942715;
 //BA.debugLineNum = 184942715;BA.debugLine="Dim sSQL As String = $\"update dta_requests_fi";
_ssql = ("update dta_requests_fields set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942716;
 //BA.debugLineNum = 184942716;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942718;
 //BA.debugLineNum = 184942718;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
_ssql = ("update dta_requests_relations set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942719;
 //BA.debugLineNum = 184942719;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942720;
 //BA.debugLineNum = 184942720;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
_ssql = ("update dta_requests_relations_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942721;
 //BA.debugLineNum = 184942721;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942723;
 //BA.debugLineNum = 184942723;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
_ssql = ("update dta_requests_values set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942724;
 //BA.debugLineNum = 184942724;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942725;
 //BA.debugLineNum = 184942725;BA.debugLine="Dim sSQL As String = $\"update dta_requests_va";
_ssql = ("update dta_requests_values_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode.RequestTagcode /*String*/ ))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=184942726;
 //BA.debugLineNum = 184942726;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChang";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode.RequestTagcode /*String*/ );
RDebugUtils.currentLine=184942727;
 //BA.debugLineNum = 184942727;BA.debugLine="newRequest = NewRequestCode.RequestTagcode";
_newrequest = _newrequestcode.RequestTagcode /*String*/ ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=184942731;
 //BA.debugLineNum = 184942731;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "returnshowtaskdetails"),(int) (1000));
this.state = 44;
return;
case 44:
//C
this.state = 15;
;
RDebugUtils.currentLine=184942733;
 //BA.debugLineNum = 184942733;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETRE";
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*String*/ ;
RDebugUtils.currentLine=184942734;
 //BA.debugLineNum = 184942734;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newRe";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and z.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'");
RDebugUtils.currentLine=184942735;
 //BA.debugLineNum = 184942735;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942735",_ssql,0);
RDebugUtils.currentLine=184942736;
 //BA.debugLineNum = 184942736;BA.debugLine="Log(newRequest)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942736",_newrequest,0);
RDebugUtils.currentLine=184942737;
 //BA.debugLineNum = 184942737;BA.debugLine="Private incolitems As Cursor";
_incolitems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=184942738;
 //BA.debugLineNum = 184942738;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL";
_incolitems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=184942739;
 //BA.debugLineNum = 184942739;BA.debugLine="If (incolitems.RowCount >= 1) Then";
if (true) break;

case 15:
//if
this.state = 36;
if ((_incolitems.getRowCount()>=1)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=184942740;
 //BA.debugLineNum = 184942740;BA.debugLine="incolitems.Position = 0";
_incolitems.setPosition((int) (0));
RDebugUtils.currentLine=184942742;
 //BA.debugLineNum = 184942742;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
_id = _incolitems.GetInt("id");
RDebugUtils.currentLine=184942743;
 //BA.debugLineNum = 184942743;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\"";
_tasktype = _incolitems.GetInt("type");
RDebugUtils.currentLine=184942744;
 //BA.debugLineNum = 184942744;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"stat";
_status_id = _incolitems.GetInt("status_id");
RDebugUtils.currentLine=184942745;
 //BA.debugLineNum = 184942745;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"";
_tagcode = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=184942746;
 //BA.debugLineNum = 184942746;BA.debugLine="Dim actionkey As String = incolitems.GetString";
_actionkey = _incolitems.GetString("action_tagcode");
RDebugUtils.currentLine=184942747;
 //BA.debugLineNum = 184942747;BA.debugLine="Dim task As String = incolitems.GetString(\"tas";
_task = _incolitems.GetString("task_tagcode");
RDebugUtils.currentLine=184942748;
 //BA.debugLineNum = 184942748;BA.debugLine="Dim name As String = incolitems.GetString(\"nam";
_name = _incolitems.GetString("name");
RDebugUtils.currentLine=184942751;
 //BA.debugLineNum = 184942751;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDat";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184942752;
 //BA.debugLineNum = 184942752;BA.debugLine="Private sACLALatitude As String = Utils.IfNull";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=184942753;
 //BA.debugLineNum = 184942753;BA.debugLine="Private sACLALongitude As String = Utils.IfNul";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=184942755;
 //BA.debugLineNum = 184942755;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
_sdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184942756;
 //BA.debugLineNum = 184942756;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
_stime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=184942758;
 //BA.debugLineNum = 184942758;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"clo";
_close_type = _incolitems.GetInt("close_type");
RDebugUtils.currentLine=184942759;
 //BA.debugLineNum = 184942759;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"re";
_result_type = _incolitems.GetInt("result_type");
RDebugUtils.currentLine=184942760;
 //BA.debugLineNum = 184942760;BA.debugLine="Dim result_values As String = incolitems.GetSt";
_result_values = _incolitems.GetString("result_values");
RDebugUtils.currentLine=184942761;
 //BA.debugLineNum = 184942761;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(\"";
_repeatcounter = _incolitems.GetInt("repeatcounter");
RDebugUtils.currentLine=184942763;
 //BA.debugLineNum = 184942763;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeReq";
_clainfo = parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),_close_type,_result_type,_result_values,anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1));
RDebugUtils.currentLine=184942764;
 //BA.debugLineNum = 184942764;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(t";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,_tagcode,_actionkey,_task,_repeatcounter,_tasktype,parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,_id,_tagcode,_status_id,parent.mostCurrent._utils._colorint /*int*/ (mostCurrent.activityBA,_status_id)),_clainfo,parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=184942768;
 //BA.debugLineNum = 184942768;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
_ssql = ("update dta_requests set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=184942770;
 //BA.debugLineNum = 184942770;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_tagcode);
RDebugUtils.currentLine=184942772;
 //BA.debugLineNum = 184942772;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'");
RDebugUtils.currentLine=184942774;
 //BA.debugLineNum = 184942774;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_tagcode);
RDebugUtils.currentLine=184942776;
 //BA.debugLineNum = 184942776;BA.debugLine="Log(\"Grava Status na BD local Request\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942776","Grava Status na BD local Request",0);
RDebugUtils.currentLine=184942777;
 //BA.debugLineNum = 184942777;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184942778;
 //BA.debugLineNum = 184942778;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=184942779;
 //BA.debugLineNum = 184942779;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=184942780;
 //BA.debugLineNum = 184942780;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184942781;
 //BA.debugLineNum = 184942781;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=184942782;
 //BA.debugLineNum = 184942782;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=184942783;
 //BA.debugLineNum = 184942783;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184942784;
 //BA.debugLineNum = 184942784;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=184942785;
 //BA.debugLineNum = 184942785;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=184942786;
 //BA.debugLineNum = 184942786;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=184942787;
 //BA.debugLineNum = 184942787;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=184942788;
 //BA.debugLineNum = 184942788;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=184942789;
 //BA.debugLineNum = 184942789;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=184942790;
 //BA.debugLineNum = 184942790;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=184942791;
 //BA.debugLineNum = 184942791;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=184942792;
 //BA.debugLineNum = 184942792;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=184942793;
 //BA.debugLineNum = 184942793;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=184942794;
 //BA.debugLineNum = 184942794;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184942795;
 //BA.debugLineNum = 184942795;BA.debugLine="Try";
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
RDebugUtils.currentLine=184942796;
 //BA.debugLineNum = 184942796;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=184942797;
 //BA.debugLineNum = 184942797;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 41;
RDebugUtils.currentLine=184942799;
 //BA.debugLineNum = 184942799;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942799",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=184942800;
 //BA.debugLineNum = 184942800;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=184942801;
 //BA.debugLineNum = 184942801;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=184942802;
 //BA.debugLineNum = 184942802;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 41;
;
RDebugUtils.currentLine=184942804;
 //BA.debugLineNum = 184942804;BA.debugLine="CLA.Info.Map1 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=184942806;
 //BA.debugLineNum = 184942806;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rel";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"								where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"");
RDebugUtils.currentLine=184942808;
 //BA.debugLineNum = 184942808;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialog\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialog",_ssql,_tagcode);
RDebugUtils.currentLine=184942810;
 //BA.debugLineNum = 184942810;BA.debugLine="Log(\"Grava Status na BD local Request-Relation";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942810","Grava Status na BD local Request-Relation",0);
RDebugUtils.currentLine=184942812;
 //BA.debugLineNum = 184942812;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=184942813;
 //BA.debugLineNum = 184942813;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=184942814;
 //BA.debugLineNum = 184942814;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=184942815;
 //BA.debugLineNum = 184942815;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=184942816;
 //BA.debugLineNum = 184942816;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=184942817;
 //BA.debugLineNum = 184942817;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
_params.Put((Object)("ACLAAction"),(Object)(_actionkey));
RDebugUtils.currentLine=184942818;
 //BA.debugLineNum = 184942818;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=184942819;
 //BA.debugLineNum = 184942819;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184942820;
 //BA.debugLineNum = 184942820;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=184942821;
 //BA.debugLineNum = 184942821;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=184942822;
 //BA.debugLineNum = 184942822;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=184942823;
 //BA.debugLineNum = 184942823;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=184942824;
 //BA.debugLineNum = 184942824;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagco";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=184942825;
 //BA.debugLineNum = 184942825;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthor";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=184942826;
 //BA.debugLineNum = 184942826;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=184942827;
 //BA.debugLineNum = 184942827;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=184942828;
 //BA.debugLineNum = 184942828;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=184942829;
 //BA.debugLineNum = 184942829;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMac";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=184942830;
 //BA.debugLineNum = 184942830;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=184942831;
 //BA.debugLineNum = 184942831;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=184942832;
 //BA.debugLineNum = 184942832;BA.debugLine="Try";
if (true) break;

case 24:
//try
this.state = 29;
this.catchState = 28;
this.state = 26;
if (true) break;

case 26:
//C
this.state = 29;
this.catchState = 28;
RDebugUtils.currentLine=184942833;
 //BA.debugLineNum = 184942833;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=184942834;
 //BA.debugLineNum = 184942834;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=184942835;
 //BA.debugLineNum = 184942835;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\"";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 41;
RDebugUtils.currentLine=184942837;
 //BA.debugLineNum = 184942837;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942837",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=184942838;
 //BA.debugLineNum = 184942838;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=184942839;
 //BA.debugLineNum = 184942839;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 41;
;
RDebugUtils.currentLine=184942841;
 //BA.debugLineNum = 184942841;BA.debugLine="CLA.Info.Map2 = params					'Utils.CallApi(0, p";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=184942844;
 //BA.debugLineNum = 184942844;BA.debugLine="CLA.Status.status = 2";
_cla.Status /*xevolution.vrcg.devdemov2400.types._intervention*/ .status /*int*/  = (int) (2);
RDebugUtils.currentLine=184942845;
 //BA.debugLineNum = 184942845;BA.debugLine="Try";
if (true) break;

case 30:
//try
this.state = 35;
this.catchState = 34;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 34;
RDebugUtils.currentLine=184942846;
 //BA.debugLineNum = 184942846;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activit";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_ActivityTasks",(Object)(_cla),(Object)(_name));
 if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 41;
RDebugUtils.currentLine=184942848;
 //BA.debugLineNum = 184942848;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942848",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=184942849;
 //BA.debugLineNum = 184942849;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Shar";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Call StartCLA_Activity",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
this.catchState = 41;
;
 if (true) break;

case 36:
//C
this.state = 39;
;
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=184942853;
 //BA.debugLineNum = 184942853;BA.debugLine="MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectsavisopedidoseminfo /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 39:
//C
this.state = 42;
;
 if (true) break;

case 41:
//C
this.state = 42;
this.catchState = 0;
RDebugUtils.currentLine=184942856;
 //BA.debugLineNum = 184942856;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6184942856",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 42:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=184942858;
 //BA.debugLineNum = 184942858;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=184942859;
 //BA.debugLineNum = 184942859;BA.debugLine="End Sub";
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
public static String  _starttasksactivityfirst(boolean _clear,String _filter) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttasksactivityfirst", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starttasksactivityfirst", new Object[] {_clear,_filter}));}
RDebugUtils.currentLine=182779904;
 //BA.debugLineNum = 182779904;BA.debugLine="Sub StartTasksActivityFirst(Clear As Boolean, Filt";
RDebugUtils.currentLine=182779906;
 //BA.debugLineNum = 182779906;BA.debugLine="If Filter = \"CalledFromMenu\" Then";
if ((_filter).equals("CalledFromMenu")) { 
RDebugUtils.currentLine=182779907;
 //BA.debugLineNum = 182779907;BA.debugLine="Filter = \"\"";
_filter = "";
RDebugUtils.currentLine=182779908;
 //BA.debugLineNum = 182779908;BA.debugLine="EditSearch.Text = \"\"";
mostCurrent._editsearch.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=182779911;
 //BA.debugLineNum = 182779911;BA.debugLine="StartTasksActivity(True, Filter, 0)";
_starttasksactivity(anywheresoftware.b4a.keywords.Common.True,_filter,(int) (0));
RDebugUtils.currentLine=182779913;
 //BA.debugLineNum = 182779913;BA.debugLine="End Sub";
return "";
}
public static String  _updatemyposition(String _lat,String _lon) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemyposition", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemyposition", new Object[] {_lat,_lon}));}
RDebugUtils.currentLine=182976512;
 //BA.debugLineNum = 182976512;BA.debugLine="Public Sub UpdateMyPosition(Lat As String, Lon As";
RDebugUtils.currentLine=182976513;
 //BA.debugLineNum = 182976513;BA.debugLine="If (LabelAppInfo.IsInitialized) Then";
if ((mostCurrent._labelappinfo.IsInitialized())) { 
RDebugUtils.currentLine=182976514;
 //BA.debugLineNum = 182976514;BA.debugLine="MyPositionLat = Lat";
_mypositionlat = _lat;
RDebugUtils.currentLine=182976515;
 //BA.debugLineNum = 182976515;BA.debugLine="MyPositionLon = Lon";
_mypositionlon = _lon;
RDebugUtils.currentLine=182976516;
 //BA.debugLineNum = 182976516;BA.debugLine="LabelAppInfo.Text =  $\"Latitude: ${MyPositionLat";
mostCurrent._labelappinfo.setText(BA.ObjectToCharSequence(("Latitude: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mypositionlat))+", Longitude: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mypositionlon))+"")));
 };
RDebugUtils.currentLine=182976518;
 //BA.debugLineNum = 182976518;BA.debugLine="End Sub";
return "";
}
public static void  _uploadnewrequest2server(String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin) throws Exception{
RDebugUtils.currentModule="taskscl2";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequest2server", false))
	 {Debug.delegate(mostCurrent.activityBA, "uploadnewrequest2server", new Object[] {_tagcode,_items,_origin}); return;}
ResumableSub_UploadNewRequest2Server rsub = new ResumableSub_UploadNewRequest2Server(null,_tagcode,_items,_origin);
rsub.resume(processBA, null);
}
public static class ResumableSub_UploadNewRequest2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server(xevolution.vrcg.devdemov2400.taskscl2 parent,String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
}
xevolution.vrcg.devdemov2400.taskscl2 parent;
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
RDebugUtils.currentModule="taskscl2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=185008129;
 //BA.debugLineNum = 185008129;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=185008130;
 //BA.debugLineNum = 185008130;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=185008131;
 //BA.debugLineNum = 185008131;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=185008133;
 //BA.debugLineNum = 185008133;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185008134;
 //BA.debugLineNum = 185008134;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=185008135;
 //BA.debugLineNum = 185008135;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=185008136;
 //BA.debugLineNum = 185008136;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=185008137;
 //BA.debugLineNum = 185008137;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=185008138;
 //BA.debugLineNum = 185008138;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=185008139;
 //BA.debugLineNum = 185008139;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=185008140;
 //BA.debugLineNum = 185008140;BA.debugLine="params.Put(\"origin\", origin)";
_params.Put((Object)("origin"),(Object)(_origin));
RDebugUtils.currentLine=185008141;
 //BA.debugLineNum = 185008141;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=185008142;
 //BA.debugLineNum = 185008142;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=185008143;
 //BA.debugLineNum = 185008143;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=185008144;
 //BA.debugLineNum = 185008144;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=185008145;
 //BA.debugLineNum = 185008145;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=185008146;
 //BA.debugLineNum = 185008146;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=185008147;
 //BA.debugLineNum = 185008147;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=185008149;
 //BA.debugLineNum = 185008149;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=185008150;
 //BA.debugLineNum = 185008150;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=185008151;
 //BA.debugLineNum = 185008151;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=185008153;
 //BA.debugLineNum = 185008153;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/new");
RDebugUtils.currentLine=185008154;
 //BA.debugLineNum = 185008154;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=185008155;
 //BA.debugLineNum = 185008155;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=185008156;
 //BA.debugLineNum = 185008156;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",taskscl2.getObject());
RDebugUtils.currentLine=185008157;
 //BA.debugLineNum = 185008157;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=185008158;
 //BA.debugLineNum = 185008158;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=185008159;
 //BA.debugLineNum = 185008159;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "taskscl2", "uploadnewrequest2server"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=185008160;
 //BA.debugLineNum = 185008160;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=185008161;
 //BA.debugLineNum = 185008161;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6185008161",_job._getstring /*String*/ (null),0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=185008163;
 //BA.debugLineNum = 185008163;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185008164;
 //BA.debugLineNum = 185008164;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=185008166;
 //BA.debugLineNum = 185008166;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=185008168;
 //BA.debugLineNum = 185008168;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=185008169;
 //BA.debugLineNum = 185008169;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=185008172;
 //BA.debugLineNum = 185008172;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}