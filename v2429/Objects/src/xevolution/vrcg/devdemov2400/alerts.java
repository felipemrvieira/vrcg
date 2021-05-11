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

public class alerts extends Activity implements B4AActivity{
	public static alerts mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.alerts");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (alerts).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.alerts");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.alerts", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (alerts) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (alerts) Resume **");
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
		return alerts.class;
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
            BA.LogInfo("** Activity (alerts) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (alerts) Pause event (activity is not paused). **");
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
            alerts mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (alerts) Resume **");
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
public static anywheresoftware.b4a.phone.Phone _device = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public xevolution.vrcg.devdemov2400.structalerts _recalerts = null;
public b4a.example3.customlistview _listalerts = null;
public b4a.example3.customlistview _listtasks = null;
public b4a.example3.customlistview _listactions = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelrequestoptions = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butrequestinfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butrequestrun = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butrequestaction = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butrequestclosepanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _googlemaps = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapa_alertas_fragment = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmap = null;
public static int _currentlineitemal = 0;
public static int _totallineitemsal = 0;
public static int _currentlineitemac = 0;
public static int _totallineitemsac = 0;
public static int _currentlineitemcl = 0;
public static int _totallineitemscl = 0;
public static int _currenttab = 0;
public anywheresoftware.b4a.objects.LabelWrapper _listslabelinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonactionpause = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public anywheresoftware.b4a.objects.PanelWrapper _alertsalertsviewpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _alertstasksviewpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _alertsactionsviewpanel = null;
public xevolution.vrcg.devdemov2400.b4xcombobox _actionsviewtype = null;
public anywheresoftware.b4a.objects.EditTextWrapper _actionsstartdate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _actionsenddate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butactionsstartdate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butactionsenddate = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeln = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldescricaoalerta = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltaskviewstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltaskviewdescricao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltaskviewlabeln = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelactionviewstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelactionviewdescricao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelactionviewn = null;
public anywheresoftware.b4a.objects.LabelWrapper _taskviewtypeobjectfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _alertviewtypeobjectfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _actionviewtypeobjectfilter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _alertmapbuttondismiss = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltitlealertmap = null;
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
public static String  _actionsenddate_enterpressed() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actionsenddate_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "actionsenddate_enterpressed", null));}
RDebugUtils.currentLine=64225280;
 //BA.debugLineNum = 64225280;BA.debugLine="Sub actionsEndDate_EnterPressed";
RDebugUtils.currentLine=64225282;
 //BA.debugLineNum = 64225282;BA.debugLine="End Sub";
return "";
}
public static String  _actionsstartdate_enterpressed() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actionsstartdate_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "actionsstartdate_enterpressed", null));}
RDebugUtils.currentLine=64290816;
 //BA.debugLineNum = 64290816;BA.debugLine="Sub actionsStartDate_EnterPressed";
RDebugUtils.currentLine=64290818;
 //BA.debugLineNum = 64290818;BA.debugLine="End Sub";
return "";
}
public static String  _actionsviewtype_selectedindexchanged(int _index) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actionsviewtype_selectedindexchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "actionsviewtype_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=64356352;
 //BA.debugLineNum = 64356352;BA.debugLine="Sub actionsViewType_SelectedIndexChanged (Index As";
RDebugUtils.currentLine=64356354;
 //BA.debugLineNum = 64356354;BA.debugLine="End Sub";
return "";
}
public static void  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(xevolution.vrcg.devdemov2400.alerts parent,boolean _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
xevolution.vrcg.devdemov2400.alerts parent;
boolean _firsttime;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _totrecs = null;
boolean _finished = false;
String _numrecssystem = "";
String _numrecstasks = "";
String _numrecsrequests = "";
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.BA.IterableList group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="If (ShareCode.ISPHONE) Then";
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
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="Device.SetScreenOrientation(1)";
parent._device.SetScreenOrientation(processBA,(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=62717957;
 //BA.debugLineNum = 62717957;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
parent._device.SetScreenOrientation(processBA,parent.mostCurrent._sharecode._device_orientation /*int*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=62717959;
 //BA.debugLineNum = 62717959;BA.debugLine="Starter.CurrentWorkActivity = Me";
parent.mostCurrent._starter._currentworkactivity /*Object*/  = alerts.getObject();
RDebugUtils.currentLine=62717962;
 //BA.debugLineNum = 62717962;BA.debugLine="Dim TotRecs As ResumableSub = GetAlertsTotalRecs";
_totrecs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_totrecs = _getalertstotalrecs();
RDebugUtils.currentLine=62717963;
 //BA.debugLineNum = 62717963;BA.debugLine="Wait for (TotRecs) complete (Finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "activity_create"), _totrecs);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=62717965;
 //BA.debugLineNum = 62717965;BA.debugLine="Activity.LoadLayout(\"alertsLayout\")";
parent.mostCurrent._activity.LoadLayout("alertsLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=62717967;
 //BA.debugLineNum = 62717967;BA.debugLine="Dim NumRecsSystem As String = $\" (${ShareCode.Sys";
_numrecssystem = (" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._systemalertscount /*int*/ ))+")");
RDebugUtils.currentLine=62717968;
 //BA.debugLineNum = 62717968;BA.debugLine="Dim NumRecsTasks As String = $\" (${ShareCode.Task";
_numrecstasks = (" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._tasksalertscount /*int*/ ))+")");
RDebugUtils.currentLine=62717969;
 //BA.debugLineNum = 62717969;BA.debugLine="Dim NumRecsRequests As String = $\" (${ShareCode.R";
_numrecsrequests = (" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._requestsalertscount /*int*/ ))+")");
RDebugUtils.currentLine=62717971;
 //BA.debugLineNum = 62717971;BA.debugLine="listsTabPanel.LoadLayout(\"alerts_alertsview\", Sha";
parent.mostCurrent._liststabpanel.LoadLayout("alerts_alertsview",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertschaptersistema /*String*/ +(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numrecssystem))+"")));
RDebugUtils.currentLine=62717972;
 //BA.debugLineNum = 62717972;BA.debugLine="listsTabPanel.LoadLayout(\"alerts_tasksview\", Shar";
parent.mostCurrent._liststabpanel.LoadLayout("alerts_tasksview",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertschaptertarefas /*String*/ +(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numrecstasks))+"")));
RDebugUtils.currentLine=62717973;
 //BA.debugLineNum = 62717973;BA.debugLine="listsTabPanel.LoadLayout(\"alerts_actionsview\", Sh";
parent.mostCurrent._liststabpanel.LoadLayout("alerts_actionsview",BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertschapterinter /*String*/ +(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numrecsrequests))+"")));
RDebugUtils.currentLine=62717976;
 //BA.debugLineNum = 62717976;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(alertsAle";
parent.mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(parent.mostCurrent._alertsalertsviewpanel.getObject())));
RDebugUtils.currentLine=62717977;
 //BA.debugLineNum = 62717977;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(alertsTas";
parent.mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(parent.mostCurrent._alertstasksviewpanel.getObject())));
RDebugUtils.currentLine=62717978;
 //BA.debugLineNum = 62717978;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(alertsAct";
parent.mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(parent.mostCurrent._alertsactionsviewpanel.getObject())));
RDebugUtils.currentLine=62717980;
 //BA.debugLineNum = 62717980;BA.debugLine="labeln.text = ShareCode.alertslabeln";
parent.mostCurrent._labeln.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeln /*String*/ ));
RDebugUtils.currentLine=62717981;
 //BA.debugLineNum = 62717981;BA.debugLine="LabelStatus.Text = ShareCode.alertsLabelStatus";
parent.mostCurrent._labelstatus.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabelstatus /*String*/ ));
RDebugUtils.currentLine=62717982;
 //BA.debugLineNum = 62717982;BA.debugLine="LabelDescricaoAlerta.Text = ShareCode.alertsLabel";
parent.mostCurrent._labeldescricaoalerta.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeldescricaoalerta /*String*/ ));
RDebugUtils.currentLine=62717983;
 //BA.debugLineNum = 62717983;BA.debugLine="TaskViewTypeObjectFilter.Text = ShareCode.alertsl";
parent.mostCurrent._taskviewtypeobjectfilter.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*String*/ ));
RDebugUtils.currentLine=62717984;
 //BA.debugLineNum = 62717984;BA.debugLine="AlertViewTypeObjectFilter.Text = ShareCode.alerts";
parent.mostCurrent._alertviewtypeobjectfilter.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*String*/ ));
RDebugUtils.currentLine=62717985;
 //BA.debugLineNum = 62717985;BA.debugLine="ActionViewTypeObjectFilter.Text = ShareCode.alert";
parent.mostCurrent._actionviewtypeobjectfilter.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeltypeobjectfilter /*String*/ ));
RDebugUtils.currentLine=62717986;
 //BA.debugLineNum = 62717986;BA.debugLine="LabelTaskViewStatus.Text = ShareCode.alertsLabelS";
parent.mostCurrent._labeltaskviewstatus.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabelstatus /*String*/ ));
RDebugUtils.currentLine=62717987;
 //BA.debugLineNum = 62717987;BA.debugLine="LabelTaskViewDescricao.Text = ShareCode.alertsLab";
parent.mostCurrent._labeltaskviewdescricao.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeldescricaoalerta /*String*/ ));
RDebugUtils.currentLine=62717988;
 //BA.debugLineNum = 62717988;BA.debugLine="LabelTaskViewlabeln.Text = ShareCode.alertslabeln";
parent.mostCurrent._labeltaskviewlabeln.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeln /*String*/ ));
RDebugUtils.currentLine=62717989;
 //BA.debugLineNum = 62717989;BA.debugLine="LabelActionViewStatus.Text = ShareCode.alertsLabe";
parent.mostCurrent._labelactionviewstatus.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabelstatus /*String*/ ));
RDebugUtils.currentLine=62717990;
 //BA.debugLineNum = 62717990;BA.debugLine="LabelActionViewDescricao.Text = ShareCode.alertsL";
parent.mostCurrent._labelactionviewdescricao.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeldescricaoalerta /*String*/ ));
RDebugUtils.currentLine=62717991;
 //BA.debugLineNum = 62717991;BA.debugLine="labelActionViewn.text = ShareCode.alertslabeln";
parent.mostCurrent._labelactionviewn.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._alertslabeln /*String*/ ));
RDebugUtils.currentLine=62717993;
 //BA.debugLineNum = 62717993;BA.debugLine="recAlerts.Initialize(Activity, Array As CustomLis";
parent.mostCurrent._recalerts._initialize /*String*/ (null,mostCurrent.activityBA,parent.mostCurrent._activity,new b4a.example3.customlistview[]{parent.mostCurrent._listalerts,parent.mostCurrent._listtasks,parent.mostCurrent._listactions});
RDebugUtils.currentLine=62717994;
 //BA.debugLineNum = 62717994;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
if (true) break;

case 7:
//for
this.state = 14;
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
group32 = parent.mostCurrent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,parent.mostCurrent._liststabpanel);
index32 = 0;
groupLen32 = group32.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 14;
if (index32 < groupLen32) {
this.state = 9;
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group32.Get(index32)));}
if (true) break;

case 17:
//C
this.state = 16;
index32++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=62717995;
 //BA.debugLineNum = 62717995;BA.debugLine="lbl.Width = 33.33%x";
_lbl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33.33),mostCurrent.activityBA));
RDebugUtils.currentLine=62717996;
 //BA.debugLineNum = 62717996;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=62717997;
 //BA.debugLineNum = 62717997;BA.debugLine="lbl.TextSize = 10.0";
_lbl.setTextSize((float) (10.0));
 if (true) break;

case 13:
//C
this.state = 17;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=62718002;
 //BA.debugLineNum = 62718002;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=62718003;
 //BA.debugLineNum = 62718003;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=62718004;
 //BA.debugLineNum = 62718004;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62718006;
 //BA.debugLineNum = 62718006;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getalertstotalrecs() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getalertstotalrecs", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getalertstotalrecs", null));}
ResumableSub_GetAlertsTotalRecs rsub = new ResumableSub_GetAlertsTotalRecs(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAlertsTotalRecs extends BA.ResumableSub {
public ResumableSub_GetAlertsTotalRecs(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.alerts parent;
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordreqs = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordsystem = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordtasks = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="Dim SQL As String = $\"select ifnull(b.tagdesc,'')";
_sql = ("select ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,\n"+"								ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode, a.repeatcounter, a.repeatitemcounter,\n"+"								a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,\n"+"								ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,\n"+"								ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,\n"+"								a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, b.tagcode as operation_type,\n"+"								a1.technical_tagcode, a1.sess_user, a2.inner_title, a3.title AS checklist\n"+"								from dta_actions as a \n"+"								INNER JOIN dta_requests AS a1 ON (a1.tagcode=a.request_tagcode)\n"+"								INNER JOIN dta_requests_relations AS a2 ON (a2.request_tagcode=a1.tagcode AND a2.relation_tagcode=a.action_tagcode)\n"+"								left JOIN dta_tasks AS a3 ON (a3.tagcode=a2.relation_tagcode)\n"+"								left join type_operationtypes as b ON (b.tagcode=(SELECT operation_type FROM dta_actions_items \n"+"									WHERE actions_tagcode=a.tagcode \n"+"									ORDER BY updated_at DESC LIMIT 1))\n"+"								left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)\n"+"								left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)\n"+"								where 1=1 and\n"+"								a.operation_type Not in ('TOPERT_04') and\n"+"								b.tagcode Not in ('TOPERT_04') and\n"+"								a.technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"'  \n"+"								order by a.request_tagcode, a.task_tagcode, a.id desc ");
RDebugUtils.currentLine=62783512;
 //BA.debugLineNum = 62783512;BA.debugLine="Private RecordReqs As Cursor = Starter.LocalSQLEV";
_recordreqs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_recordreqs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=62783513;
 //BA.debugLineNum = 62783513;BA.debugLine="ShareCode.RequestsAlertsCount = RecordReqs.RowCou";
parent.mostCurrent._sharecode._requestsalertscount /*int*/  = _recordreqs.getRowCount();
RDebugUtils.currentLine=62783514;
 //BA.debugLineNum = 62783514;BA.debugLine="RecordReqs.Close";
_recordreqs.Close();
RDebugUtils.currentLine=62783517;
 //BA.debugLineNum = 62783517;BA.debugLine="Dim SQL As String = $\"select ifnull(tagcode,'') a";
_sql = ("select ifnull(tagcode,'') as tagcode, ifnull(title,'') as title,\n"+"						ifnull(date_verification,'') as date_verification, status_id, kind_data, id,\n"+"	'' as obs, '' as imagename, alert_type from dta_alerts where 1=1\n"+"						 and alert_type = 'ALRTTYP_NOTIFY' and alert_visible=1 and active = 1\n"+"                         or alert_type = 'ALRTTYP_SMS' and alert_visible=1 and active = 1\n"+"						 or alert_type = 'ALRTTYP_ALERT' and alert_visible=1 and active = 1\n"+"                         or alert_type = 'ALRTTYP_EMAIL' and alert_visible=1 and active = 1");
RDebugUtils.currentLine=62783526;
 //BA.debugLineNum = 62783526;BA.debugLine="Private RecordSystem As Cursor = Starter.LocalSQL";
_recordsystem = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_recordsystem = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=62783527;
 //BA.debugLineNum = 62783527;BA.debugLine="ShareCode.SystemAlertsCount = RecordSystem.RowCou";
parent.mostCurrent._sharecode._systemalertscount /*int*/  = _recordsystem.getRowCount();
RDebugUtils.currentLine=62783528;
 //BA.debugLineNum = 62783528;BA.debugLine="RecordSystem.Close";
_recordsystem.Close();
RDebugUtils.currentLine=62783531;
 //BA.debugLineNum = 62783531;BA.debugLine="Dim SQL As String = $\"select distinct ifnull(a.ta";
_sql = ("select distinct ifnull(a.tagcode,'') as tagcode, ifnull(a.title,'') as title,\n"+"			ifnull(a.date_verification,'') as date_verification, a.status_id, a.kind_data, a.id,\n"+"			(select obs from dta_alerts_images where tagcode=a.tagcode) as obs,\n"+"			(select imagename from dta_alerts_images where tagcode=a.tagcode) as imagename,\n"+"			a.alert_type from dta_alerts as a\n"+"			where a.alert_visible=1 \n"+"				and a.user_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"' \n"+"				and a.alert_type != 'ALRTTYP_NOTIFY'\n"+"				and a.alert_type != 'ALRTTYP_EMAIL'\n"+"				and a.alert_type != 'ALRTTYP_SMS'\n"+"				and a.alert_type != 'ALRTTYP_ALERT'\n"+"				and a.active=1 \n"+"				and a.date_alert>='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._getlastweekdate /*String*/ (mostCurrent.activityBA)))+"'");
RDebugUtils.currentLine=62783545;
 //BA.debugLineNum = 62783545;BA.debugLine="Private RecordTasks As Cursor = Starter.LocalSQLE";
_recordtasks = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_recordtasks = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=62783546;
 //BA.debugLineNum = 62783546;BA.debugLine="ShareCode.TasksAlertsCount = RecordTasks.RowCount";
parent.mostCurrent._sharecode._tasksalertscount /*int*/  = _recordtasks.getRowCount();
RDebugUtils.currentLine=62783547;
 //BA.debugLineNum = 62783547;BA.debugLine="RecordTasks.close";
_recordtasks.Close();
RDebugUtils.currentLine=62783554;
 //BA.debugLineNum = 62783554;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=62783555;
 //BA.debugLineNum = 62783555;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
mostCurrent._mainlabeloptlists.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=62914563;
 //BA.debugLineNum = 62914563;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=62914564;
 //BA.debugLineNum = 62914564;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
 };
RDebugUtils.currentLine=62914566;
 //BA.debugLineNum = 62914566;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
anywheresoftware.b4a.keywords.Common.LogImpl("662914566",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=62914567;
 //BA.debugLineNum = 62914567;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=62914568;
 //BA.debugLineNum = 62914568;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
RDebugUtils.currentLine=62914571;
 //BA.debugLineNum = 62914571;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=62914573;
 //BA.debugLineNum = 62914573;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._liststabpanel));
RDebugUtils.currentLine=62914574;
 //BA.debugLineNum = 62914574;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.GetField("tabStrip")));
RDebugUtils.currentLine=62914575;
 //BA.debugLineNum = 62914575;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
_jo.RunMethod("setIndicatorColor",new Object[]{(Object)(mostCurrent._consts._colormain /*int*/ )});
RDebugUtils.currentLine=62914576;
 //BA.debugLineNum = 62914576;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.alerts parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
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
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=62980099;
 //BA.debugLineNum = 62980099;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=62980100;
 //BA.debugLineNum = 62980100;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=62980101;
 //BA.debugLineNum = 62980101;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=62980102;
 //BA.debugLineNum = 62980102;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=62980103;
 //BA.debugLineNum = 62980103;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "windowstatusupdate"),(int) (500));
this.state = 24;
return;
case 24:
//C
this.state = 4;
;
RDebugUtils.currentLine=62980104;
 //BA.debugLineNum = 62980104;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=62980106;
 //BA.debugLineNum = 62980106;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=62980107;
 //BA.debugLineNum = 62980107;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=62980108;
 //BA.debugLineNum = 62980108;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=62980110;
 //BA.debugLineNum = 62980110;BA.debugLine="ButtonAppNetwork.Enabled = False";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62980111;
 //BA.debugLineNum = 62980111;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=62980112;
 //BA.debugLineNum = 62980112;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=62980113;
 //BA.debugLineNum = 62980113;BA.debugLine="ButtonAppNetwork.Enabled = True";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=62980114;
 //BA.debugLineNum = 62980114;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=62980116;
 //BA.debugLineNum = 62980116;BA.debugLine="ButtonUserUnavailable.Enabled = False";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62980117;
 //BA.debugLineNum = 62980117;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=62980118;
 //BA.debugLineNum = 62980118;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
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
RDebugUtils.currentLine=62980119;
 //BA.debugLineNum = 62980119;BA.debugLine="ButtonUserUnavailable.Enabled = True";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=62980120;
 //BA.debugLineNum = 62980120;BA.debugLine="ButtonUserUnavailable.TextColor = Colors.red";
parent.mostCurrent._buttonuserunavailable.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=62980123;
 //BA.debugLineNum = 62980123;BA.debugLine="ButtonActionPause.Enabled = False";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62980124;
 //BA.debugLineNum = 62980124;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=62980126;
 //BA.debugLineNum = 62980126;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
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
RDebugUtils.currentLine=62980127;
 //BA.debugLineNum = 62980127;BA.debugLine="ButtonActionPause.Enabled = True";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=62980128;
 //BA.debugLineNum = 62980128;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=62980130;
 //BA.debugLineNum = 62980130;BA.debugLine="If (CurrentTab = 0) Then";

case 16:
//if
this.state = 23;
if ((parent._currenttab==0)) { 
this.state = 18;
}else 
{RDebugUtils.currentLine=62980132;
 //BA.debugLineNum = 62980132;BA.debugLine="Else If (CurrentTab = 1) Then";
if ((parent._currenttab==1)) { 
this.state = 20;
}else {
this.state = 22;
}}
if (true) break;

case 18:
//C
this.state = 23;
RDebugUtils.currentLine=62980131;
 //BA.debugLineNum = 62980131;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemAL} / $";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentlineitemal))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitemsal))+"")));
 if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=62980133;
 //BA.debugLineNum = 62980133;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemAC} / $";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentlineitemac))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitemsac))+"")));
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=62980135;
 //BA.debugLineNum = 62980135;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItemCL} / $";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentlineitemcl))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitemscl))+"")));
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=62980138;
 //BA.debugLineNum = 62980138;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=63176708;
 //BA.debugLineNum = 63176708;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=63176709;
 //BA.debugLineNum = 63176709;BA.debugLine="End Sub";
return false;
}
public static String  _listsbuttonclose_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=63307776;
 //BA.debugLineNum = 63307776;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=63307777;
 //BA.debugLineNum = 63307777;BA.debugLine="Log(\"Back ALERTS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("663307777","Back ALERTS",0);
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturn",(Object)(""));
RDebugUtils.currentLine=63307779;
 //BA.debugLineNum = 63307779;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=63307780;
 //BA.debugLineNum = 63307780;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=63307781;
 //BA.debugLineNum = 63307781;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="alerts";
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="End Sub";
return "";
}
public static String  _alertmapbuttondismiss_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "alertmapbuttondismiss_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "alertmapbuttondismiss_click", null));}
RDebugUtils.currentLine=64618496;
 //BA.debugLineNum = 64618496;BA.debugLine="Sub AlertMapButtonDismiss_Click";
RDebugUtils.currentLine=64618497;
 //BA.debugLineNum = 64618497;BA.debugLine="PanelMAP.Visible = False";
mostCurrent._panelmap.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=64618498;
 //BA.debugLineNum = 64618498;BA.debugLine="End Sub";
return "";
}
public static String  _alertobjectselected(String _currentselectedcode,anywheresoftware.b4a.objects.PanelWrapper _pnl) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "alertobjectselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "alertobjectselected", new Object[] {_currentselectedcode,_pnl}));}
RDebugUtils.currentLine=64552960;
 //BA.debugLineNum = 64552960;BA.debugLine="Sub AlertObjectSelected(CurrentSelectedCode As Str";
RDebugUtils.currentLine=64552961;
 //BA.debugLineNum = 64552961;BA.debugLine="recAlerts.AlertObjectSelected(CurrentSelectedCode";
mostCurrent._recalerts._alertobjectselected /*String*/ (null,_currentselectedcode,_pnl);
RDebugUtils.currentLine=64552962;
 //BA.debugLineNum = 64552962;BA.debugLine="End Sub";
return "";
}
public static String  _butactionsenddate_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butactionsenddate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butactionsenddate_click", null));}
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="Sub butactionsEndDate_Click";
RDebugUtils.currentLine=64094210;
 //BA.debugLineNum = 64094210;BA.debugLine="End Sub";
return "";
}
public static String  _butactionsstartdate_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butactionsstartdate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butactionsstartdate_click", null));}
RDebugUtils.currentLine=64159744;
 //BA.debugLineNum = 64159744;BA.debugLine="Sub butactionsStartDate_Click";
RDebugUtils.currentLine=64159746;
 //BA.debugLineNum = 64159746;BA.debugLine="End Sub";
return "";
}
public static String  _butrequestaction_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butrequestaction_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butrequestaction_click", null));}
RDebugUtils.currentLine=63373312;
 //BA.debugLineNum = 63373312;BA.debugLine="Sub butRequestAction_Click";
RDebugUtils.currentLine=63373316;
 //BA.debugLineNum = 63373316;BA.debugLine="End Sub";
return "";
}
public static String  _butrequestclosepanel_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butrequestclosepanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butrequestclosepanel_click", null));}
RDebugUtils.currentLine=63569920;
 //BA.debugLineNum = 63569920;BA.debugLine="Sub butRequestClosePanel_Click";
RDebugUtils.currentLine=63569926;
 //BA.debugLineNum = 63569926;BA.debugLine="panelRequestOptions.Visible = False";
mostCurrent._panelrequestoptions.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=63569927;
 //BA.debugLineNum = 63569927;BA.debugLine="End Sub";
return "";
}
public static String  _butrequestinfo_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butrequestinfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butrequestinfo_click", null));}
RDebugUtils.currentLine=63504384;
 //BA.debugLineNum = 63504384;BA.debugLine="Sub butRequestInfo_Click";
RDebugUtils.currentLine=63504387;
 //BA.debugLineNum = 63504387;BA.debugLine="End Sub";
return "";
}
public static String  _butrequestrun_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butrequestrun_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butrequestrun_click", null));}
RDebugUtils.currentLine=63438848;
 //BA.debugLineNum = 63438848;BA.debugLine="Sub butRequestRun_Click";
RDebugUtils.currentLine=63438851;
 //BA.debugLineNum = 63438851;BA.debugLine="End Sub";
return "";
}
public static void  _buttonactionpause_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonactionpause_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "buttonactionpause_click", null); return;}
ResumableSub_ButtonActionPause_Click rsub = new ResumableSub_ButtonActionPause_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonActionPause_Click extends BA.ResumableSub {
public ResumableSub_ButtonActionPause_Click(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.alerts parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64028673;
 //BA.debugLineNum = 64028673;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=64028675;
 //BA.debugLineNum = 64028675;BA.debugLine="Msgbox2Async(ShareCode.AvisoPararPausa, ShareCod";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_no /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=64028676;
 //BA.debugLineNum = 64028676;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "buttonactionpause_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=64028677;
 //BA.debugLineNum = 64028677;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=64028678;
 //BA.debugLineNum = 64028678;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
parent.mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=64028679;
 //BA.debugLineNum = 64028679;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",parent.mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=64028680;
 //BA.debugLineNum = 64028680;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=64028683;
 //BA.debugLineNum = 64028683;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=64028684;
 //BA.debugLineNum = 64028684;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="End Sub";
return "";
}
public static String  _listactions_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listactions_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listactions_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=63766528;
 //BA.debugLineNum = 63766528;BA.debugLine="Sub listActions_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=63766529;
 //BA.debugLineNum = 63766529;BA.debugLine="CurrentLineItemAC = Index+1";
_currentlineitemac = (int) (_index+1);
RDebugUtils.currentLine=63766530;
 //BA.debugLineNum = 63766530;BA.debugLine="recAlerts.ActionItemClick(Index, Value)";
mostCurrent._recalerts._actionitemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=63766531;
 //BA.debugLineNum = 63766531;BA.debugLine="ListItemSelected( listActions.GetPanel(Index), li";
_listitemselected((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listactions._getpanel(_index).getObject())),mostCurrent._listactions);
RDebugUtils.currentLine=63766532;
 //BA.debugLineNum = 63766532;BA.debugLine="End Sub";
return "";
}
public static String  _listitemselected(anywheresoftware.b4a.objects.PanelWrapper _pan,b4a.example3.customlistview _listview) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemselected", new Object[] {_pan,_listview}));}
int _index = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Sub ListItemSelected(pan As Panel, listview As Cus";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="For index= 0 To listview.GetSize-1";
{
final int step1 = 1;
final int limit1 = (int) (_listview._getsize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="Dim p As Panel = listview.GetPanel(index)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_listview._getpanel(_index).getObject()));
RDebugUtils.currentLine=63832067;
 //BA.debugLineNum = 63832067;BA.debugLine="p.Color = Consts.ColorWhite";
_p.setColor(mostCurrent._consts._colorwhite /*int*/ );
 }
};
RDebugUtils.currentLine=63832069;
 //BA.debugLineNum = 63832069;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
_pan.setColor(mostCurrent._consts._colorciansoftlight /*int*/ );
RDebugUtils.currentLine=63832070;
 //BA.debugLineNum = 63832070;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=63832071;
 //BA.debugLineNum = 63832071;BA.debugLine="End Sub";
return "";
}
public static String  _listalerts_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listalerts_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listalerts_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=63635456;
 //BA.debugLineNum = 63635456;BA.debugLine="Sub listAlerts_ItemClick (Index As Int, Value As O";
RDebugUtils.currentLine=63635457;
 //BA.debugLineNum = 63635457;BA.debugLine="CurrentLineItemAL = Index+1";
_currentlineitemal = (int) (_index+1);
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="recAlerts.AlertItemClick(Index, Value)";
mostCurrent._recalerts._alertitemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=63635459;
 //BA.debugLineNum = 63635459;BA.debugLine="ListItemSelected( listAlerts.GetPanel(Index), lis";
_listitemselected((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listalerts._getpanel(_index).getObject())),mostCurrent._listalerts);
RDebugUtils.currentLine=63635460;
 //BA.debugLineNum = 63635460;BA.debugLine="End Sub";
return "";
}
public static void  _liststabpanel_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected", false))
	 {Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected", new Object[] {_position}); return;}
ResumableSub_listsTabPanel_PageSelected rsub = new ResumableSub_listsTabPanel_PageSelected(null,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_listsTabPanel_PageSelected extends BA.ResumableSub {
public ResumableSub_listsTabPanel_PageSelected(xevolution.vrcg.devdemov2400.alerts parent,int _position) {
this.parent = parent;
this._position = _position;
}
xevolution.vrcg.devdemov2400.alerts parent;
int _position;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64421889;
 //BA.debugLineNum = 64421889;BA.debugLine="CurrentTab = Position+1";
parent._currenttab = (int) (_position+1);
RDebugUtils.currentLine=64421890;
 //BA.debugLineNum = 64421890;BA.debugLine="Log(CurrentTab)";
anywheresoftware.b4a.keywords.Common.LogImpl("664421890",BA.NumberToString(parent._currenttab),0);
RDebugUtils.currentLine=64421891;
 //BA.debugLineNum = 64421891;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=64421892;
 //BA.debugLineNum = 64421892;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "liststabpanel_pageselected"),(int) (100));
this.state = 21;
return;
case 21:
//C
this.state = 1;
;
RDebugUtils.currentLine=64421893;
 //BA.debugLineNum = 64421893;BA.debugLine="If (CurrentTab = 1) Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((parent._currenttab==1)) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=64421899;
 //BA.debugLineNum = 64421899;BA.debugLine="else If (CurrentTab = 2) Then";
if ((parent._currenttab==2)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=64421905;
 //BA.debugLineNum = 64421905;BA.debugLine="Else If (CurrentTab = 3) Then";
if ((parent._currenttab==3)) { 
this.state = 15;
}}}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=64421895;
 //BA.debugLineNum = 64421895;BA.debugLine="If (recAlerts.ListAlertsRecords = 0) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._recalerts._listalertsrecords /*int*/ (null)==0)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=64421896;
 //BA.debugLineNum = 64421896;BA.debugLine="TotalLineItemsAL = recAlerts.StartAlerts(True)";
parent._totallineitemsal = parent.mostCurrent._recalerts._startalerts /*int*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=64421897;
 //BA.debugLineNum = 64421897;BA.debugLine="Log( TotalLineItemsAL )";
anywheresoftware.b4a.keywords.Common.LogImpl("664421897",BA.NumberToString(parent._totallineitemsal),0);
 if (true) break;

case 7:
//C
this.state = 20;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=64421901;
 //BA.debugLineNum = 64421901;BA.debugLine="If (recAlerts.ListTaskRecords = 0) Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((parent.mostCurrent._recalerts._listtaskrecords /*int*/ (null)==0)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=64421902;
 //BA.debugLineNum = 64421902;BA.debugLine="TotalLineItemsAC = recAlerts.StartTasks(True)";
parent._totallineitemsac = parent.mostCurrent._recalerts._starttasks /*int*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=64421903;
 //BA.debugLineNum = 64421903;BA.debugLine="Log( TotalLineItemsAC )";
anywheresoftware.b4a.keywords.Common.LogImpl("664421903",BA.NumberToString(parent._totallineitemsac),0);
 if (true) break;

case 13:
//C
this.state = 20;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=64421907;
 //BA.debugLineNum = 64421907;BA.debugLine="If (recAlerts.ListActionRecords = 0) Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((parent.mostCurrent._recalerts._listactionrecords /*int*/ (null)==0)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=64421908;
 //BA.debugLineNum = 64421908;BA.debugLine="TotalLineItemsCL = recAlerts.StartActions(True)";
parent._totallineitemscl = parent.mostCurrent._recalerts._startactions /*int*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=64421909;
 //BA.debugLineNum = 64421909;BA.debugLine="Log( TotalLineItemsCL )";
anywheresoftware.b4a.keywords.Common.LogImpl("664421909",BA.NumberToString(parent._totallineitemscl),0);
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
RDebugUtils.currentLine=64421913;
 //BA.debugLineNum = 64421913;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=64421916;
 //BA.debugLineNum = 64421916;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=64421918;
 //BA.debugLineNum = 64421918;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _liststabpanel_pageselected2(int _position) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected2", false))
	 {Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected2", new Object[] {_position}); return;}
ResumableSub_listsTabPanel_PageSelected2 rsub = new ResumableSub_listsTabPanel_PageSelected2(null,_position);
rsub.resume(processBA, null);
}
public static class ResumableSub_listsTabPanel_PageSelected2 extends BA.ResumableSub {
public ResumableSub_listsTabPanel_PageSelected2(xevolution.vrcg.devdemov2400.alerts parent,int _position) {
this.parent = parent;
this._position = _position;
}
xevolution.vrcg.devdemov2400.alerts parent;
int _position;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64487425;
 //BA.debugLineNum = 64487425;BA.debugLine="CurrentTab = Position+1";
parent._currenttab = (int) (_position+1);
RDebugUtils.currentLine=64487426;
 //BA.debugLineNum = 64487426;BA.debugLine="Log(CurrentTab)";
anywheresoftware.b4a.keywords.Common.LogImpl("664487426",BA.NumberToString(parent._currenttab),0);
RDebugUtils.currentLine=64487427;
 //BA.debugLineNum = 64487427;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=64487428;
 //BA.debugLineNum = 64487428;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "liststabpanel_pageselected2"),(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=64487429;
 //BA.debugLineNum = 64487429;BA.debugLine="If (CurrentTab = 1) Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent._currenttab==1)) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=64487431;
 //BA.debugLineNum = 64487431;BA.debugLine="else If (CurrentTab = 2) Then";
if ((parent._currenttab==2)) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=64487433;
 //BA.debugLineNum = 64487433;BA.debugLine="Else If (CurrentTab = 3) Then";
if ((parent._currenttab==3)) { 
this.state = 7;
}}}
if (true) break;

case 3:
//C
this.state = 8;
RDebugUtils.currentLine=64487430;
 //BA.debugLineNum = 64487430;BA.debugLine="TotalLineItemsAL = recAlerts.Startalerts(True)";
parent._totallineitemsal = parent.mostCurrent._recalerts._startalerts /*int*/ (null,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=64487432;
 //BA.debugLineNum = 64487432;BA.debugLine="TotalLineItemsAC = recAlerts.StartTasks(True)";
parent._totallineitemsac = parent.mostCurrent._recalerts._starttasks /*int*/ (null,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=64487434;
 //BA.debugLineNum = 64487434;BA.debugLine="TotalLineItemsCL = recAlerts.StartActions(True)";
parent._totallineitemscl = parent.mostCurrent._recalerts._startactions /*int*/ (null,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=64487436;
 //BA.debugLineNum = 64487436;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=64487439;
 //BA.debugLineNum = 64487439;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=64487441;
 //BA.debugLineNum = 64487441;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _listtasks_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listtasks_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listtasks_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=63700992;
 //BA.debugLineNum = 63700992;BA.debugLine="Sub listTasks_ItemClick (Index As Int, Value As Ob";
RDebugUtils.currentLine=63700993;
 //BA.debugLineNum = 63700993;BA.debugLine="CurrentLineItemCL = Index+1";
_currentlineitemcl = (int) (_index+1);
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="recAlerts.TaskItemClick(Index, Value)";
mostCurrent._recalerts._taskitemclick /*String*/ (null,_index,_value);
RDebugUtils.currentLine=63700995;
 //BA.debugLineNum = 63700995;BA.debugLine="ListItemSelected( listTasks.GetPanel(Index), list";
_listitemselected((anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listtasks._getpanel(_index).getObject())),mostCurrent._listtasks);
RDebugUtils.currentLine=63700996;
 //BA.debugLineNum = 63700996;BA.debugLine="End Sub";
return "";
}
public static String  _mainlogo_click() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainlogo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainlogo_click", null));}
RDebugUtils.currentLine=63963136;
 //BA.debugLineNum = 63963136;BA.debugLine="Sub mainLogo_Click";
RDebugUtils.currentLine=63963137;
 //BA.debugLineNum = 63963137;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="End Sub";
return "";
}
public static String  _showalertmaps(String _phototitle,String _photocoordinates) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showalertmaps", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showalertmaps", new Object[] {_phototitle,_photocoordinates}));}
anywheresoftware.b4a.objects.collections.List _coordslist = null;
String _photolat = "";
String _photolon = "";
anywheresoftware.b4a.objects.collections.Map _location = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Sub ShowAlertMaps(PhotoTitle As String, PhotoCoord";
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="labelTitleAlertMap.Text = PhotoTitle";
mostCurrent._labeltitlealertmap.setText(BA.ObjectToCharSequence(_phototitle));
RDebugUtils.currentLine=62849028;
 //BA.debugLineNum = 62849028;BA.debugLine="Try";
try {RDebugUtils.currentLine=62849029;
 //BA.debugLineNum = 62849029;BA.debugLine="If Utils.NNE(PhotoCoordinates) Or PhotoCoordinate";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_photocoordinates) || (_photocoordinates.trim()).equals("/") == false) { 
RDebugUtils.currentLine=62849031;
 //BA.debugLineNum = 62849031;BA.debugLine="Dim CoordsList As List = Regex.Split(\"/\", Photo";
_coordslist = new anywheresoftware.b4a.objects.collections.List();
_coordslist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("/",_photocoordinates));
RDebugUtils.currentLine=62849032;
 //BA.debugLineNum = 62849032;BA.debugLine="Dim PhotoLat As String = CoordsList.Get(0)";
_photolat = BA.ObjectToString(_coordslist.Get((int) (0)));
RDebugUtils.currentLine=62849033;
 //BA.debugLineNum = 62849033;BA.debugLine="Dim PhotoLon As String = CoordsList.Get(1)";
_photolon = BA.ObjectToString(_coordslist.Get((int) (1)));
 }else {
RDebugUtils.currentLine=62849035;
 //BA.debugLineNum = 62849035;BA.debugLine="Dim PhotoLat As String = GoogleMaps.MyLocation.";
_photolat = BA.NumberToString(mostCurrent._googlemaps.getMyLocation().getLatitude());
RDebugUtils.currentLine=62849036;
 //BA.debugLineNum = 62849036;BA.debugLine="Dim PhotoLon As String = GoogleMaps.MyLocation.";
_photolon = BA.NumberToString(mostCurrent._googlemaps.getMyLocation().getLongitude());
 };
RDebugUtils.currentLine=62849038;
 //BA.debugLineNum = 62849038;BA.debugLine="Dim location As Map";
_location = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62849039;
 //BA.debugLineNum = 62849039;BA.debugLine="location.Initialize";
_location.Initialize();
RDebugUtils.currentLine=62849040;
 //BA.debugLineNum = 62849040;BA.debugLine="location.Put(\"latitude\", PhotoLat)";
_location.Put((Object)("latitude"),(Object)(_photolat));
RDebugUtils.currentLine=62849041;
 //BA.debugLineNum = 62849041;BA.debugLine="location.Put(\"longitude\", PhotoLon)";
_location.Put((Object)("longitude"),(Object)(_photolon));
RDebugUtils.currentLine=62849042;
 //BA.debugLineNum = 62849042;BA.debugLine="Dim CurrentCLAItem As RequestCLAItem";
_currentclaitem = new xevolution.vrcg.devdemov2400.types._requestclaitem();
RDebugUtils.currentLine=62849043;
 //BA.debugLineNum = 62849043;BA.debugLine="ShareCode.CalledFromAlerts = True";
mostCurrent._sharecode._calledfromalerts /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=62849044;
 //BA.debugLineNum = 62849044;BA.debugLine="CallSubDelayed3(MapsActivity, \"StartMapsActivity";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(mostCurrent._mapsactivity.getObject()),"StartMapsActivity",(Object)(_currentclaitem),(Object)(_location));
 } 
       catch (Exception e19) {
			processBA.setLastException(e19);RDebugUtils.currentLine=62849046;
 //BA.debugLineNum = 62849046;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662849046",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=62849051;
 //BA.debugLineNum = 62849051;BA.debugLine="End Sub";
return "";
}
public static void  _starttasksactivity(String _filearg) throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttasksactivity", false))
	 {Debug.delegate(mostCurrent.activityBA, "starttasksactivity", new Object[] {_filearg}); return;}
ResumableSub_StartTasksActivity rsub = new ResumableSub_StartTasksActivity(null,_filearg);
rsub.resume(processBA, null);
}
public static class ResumableSub_StartTasksActivity extends BA.ResumableSub {
public ResumableSub_StartTasksActivity(xevolution.vrcg.devdemov2400.alerts parent,String _filearg) {
this.parent = parent;
this._filearg = _filearg;
}
xevolution.vrcg.devdemov2400.alerts parent;
String _filearg;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=63242241;
 //BA.debugLineNum = 63242241;BA.debugLine="ProgressDialogShow(ShareCode.GeneralWaitPlease)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ));
RDebugUtils.currentLine=63242242;
 //BA.debugLineNum = 63242242;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "starttasksactivity"),(int) (500));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=63242243;
 //BA.debugLineNum = 63242243;BA.debugLine="recAlerts.StartAlerts(False) 'StartTasks(False)";
parent.mostCurrent._recalerts._startalerts /*int*/ (null,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=63242244;
 //BA.debugLineNum = 63242244;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=63242245;
 //BA.debugLineNum = 63242245;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _updatealertstext() throws Exception{
RDebugUtils.currentModule="alerts";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatealertstext", false))
	 {Debug.delegate(mostCurrent.activityBA, "updatealertstext", null); return;}
ResumableSub_UpdateAlertsText rsub = new ResumableSub_UpdateAlertsText(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_UpdateAlertsText extends BA.ResumableSub {
public ResumableSub_UpdateAlertsText(xevolution.vrcg.devdemov2400.alerts parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.alerts parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _totrecs = null;
boolean _finished = false;
String _numrecssystem = "";
String _numrecstasks = "";
String _numrecsrequests = "";
xevolution.vrcg.devdemov2400.tabstripviewpagerextendet _tse = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="alerts";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=64684034;
 //BA.debugLineNum = 64684034;BA.debugLine="Dim TotRecs As ResumableSub = GetAlertsTotalRecs";
_totrecs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_totrecs = _getalertstotalrecs();
RDebugUtils.currentLine=64684035;
 //BA.debugLineNum = 64684035;BA.debugLine="Wait for (TotRecs) complete (Finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "alerts", "updatealertstext"), _totrecs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=64684037;
 //BA.debugLineNum = 64684037;BA.debugLine="Dim NumRecsSystem As String = $\" (${ShareCode.Sys";
_numrecssystem = (" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._systemalertscount /*int*/ ))+")");
RDebugUtils.currentLine=64684038;
 //BA.debugLineNum = 64684038;BA.debugLine="Dim NumRecsTasks As String = $\" (${ShareCode.Task";
_numrecstasks = (" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._tasksalertscount /*int*/ ))+")");
RDebugUtils.currentLine=64684039;
 //BA.debugLineNum = 64684039;BA.debugLine="Dim NumRecsRequests As String = $\" (${ShareCode.R";
_numrecsrequests = (" ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._requestsalertscount /*int*/ ))+")");
RDebugUtils.currentLine=64684041;
 //BA.debugLineNum = 64684041;BA.debugLine="Dim tse As TabStripViewPagerExtendet";
_tse = new xevolution.vrcg.devdemov2400.tabstripviewpagerextendet();
RDebugUtils.currentLine=64684042;
 //BA.debugLineNum = 64684042;BA.debugLine="tse.Initialize";
_tse._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=64684043;
 //BA.debugLineNum = 64684043;BA.debugLine="tse.ChangeTabText(listsTabPanel,ShareCode.alertsC";
_tse._changetabtext /*String*/ (null,parent.mostCurrent._liststabpanel,parent.mostCurrent._sharecode._alertschaptersistema /*String*/ +(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numrecssystem))+""),(int) (0));
RDebugUtils.currentLine=64684044;
 //BA.debugLineNum = 64684044;BA.debugLine="tse.ChangeTabText(listsTabPanel,ShareCode.alertsC";
_tse._changetabtext /*String*/ (null,parent.mostCurrent._liststabpanel,parent.mostCurrent._sharecode._alertschaptertarefas /*String*/ +(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numrecstasks))+""),(int) (1));
RDebugUtils.currentLine=64684045;
 //BA.debugLineNum = 64684045;BA.debugLine="tse.ChangeTabText(listsTabPanel,ShareCode.alertsC";
_tse._changetabtext /*String*/ (null,parent.mostCurrent._liststabpanel,parent.mostCurrent._sharecode._alertschapterinter /*String*/ +(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_numrecsrequests))+""),(int) (2));
RDebugUtils.currentLine=64684047;
 //BA.debugLineNum = 64684047;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}