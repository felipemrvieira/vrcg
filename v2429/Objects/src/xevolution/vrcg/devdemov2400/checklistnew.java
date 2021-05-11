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

public class checklistnew extends Activity implements B4AActivity{
	public static checklistnew mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.checklistnew");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (checklistnew).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.checklistnew");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.checklistnew", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (checklistnew) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (checklistnew) Resume **");
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
		return checklistnew.class;
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
            BA.LogInfo("** Activity (checklistnew) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (checklistnew) Pause event (activity is not paused). **");
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
            checklistnew mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (checklistnew) Resume **");
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
public anywheresoftware.b4a.objects.PanelWrapper _panelheader = null;
public b4a.example3.customlistview _contentlist = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlinemandatory = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlinecritical = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlineinformation = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlinetitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinemoreoptions = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _recordlineb4xsbuttonc = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _recordlineb4xsbuttonnc = null;
public xevolution.vrcg.devdemov2400.b4xstatebutton _recordlineb4xsbuttonna = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinebutleft = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinebutadd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinebutless = null;
public anywheresoftware.b4a.objects.LabelWrapper _recordlinetextrepeat = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinebutright = null;
public anywheresoftware.b4a.objects.ButtonWrapper _recordlinecollpseexpand = null;
public xevolution.vrcg.devdemov2400.b4xlistpanel _recordlinerow = null;
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
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=129957888;
 //BA.debugLineNum = 129957888;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=129957890;
 //BA.debugLineNum = 129957890;BA.debugLine="Activity.LoadLayout(\"ChecklistNewLayout\")";
mostCurrent._activity.LoadLayout("ChecklistNewLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=129957894;
 //BA.debugLineNum = 129957894;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="checklistnew";
RDebugUtils.currentLine=130416640;
 //BA.debugLineNum = 130416640;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=130416642;
 //BA.debugLineNum = 130416642;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=130351104;
 //BA.debugLineNum = 130351104;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=130351106;
 //BA.debugLineNum = 130351106;BA.debugLine="End Sub";
return "";
}
public static String  _contentlist_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "contentlist_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "contentlist_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=130482176;
 //BA.debugLineNum = 130482176;BA.debugLine="Sub ContentList_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=130482178;
 //BA.debugLineNum = 130482178;BA.debugLine="End Sub";
return "";
}
public static String  _contentlist_itemlongclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "contentlist_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "contentlist_itemlongclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=130547712;
 //BA.debugLineNum = 130547712;BA.debugLine="Sub ContentList_ItemLongClick (Index As Int, Value";
RDebugUtils.currentLine=130547714;
 //BA.debugLineNum = 130547714;BA.debugLine="End Sub";
return "";
}
public static String  _contentlist_reachend() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "contentlist_reachend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "contentlist_reachend", null));}
RDebugUtils.currentLine=130613248;
 //BA.debugLineNum = 130613248;BA.debugLine="Sub ContentList_ReachEnd";
RDebugUtils.currentLine=130613250;
 //BA.debugLineNum = 130613250;BA.debugLine="End Sub";
return "";
}
public static String  _contentlist_scrollchanged(int _offset) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "contentlist_scrollchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "contentlist_scrollchanged", new Object[] {_offset}));}
RDebugUtils.currentLine=130744320;
 //BA.debugLineNum = 130744320;BA.debugLine="Sub ContentList_ScrollChanged (Offset As Int)";
RDebugUtils.currentLine=130744322;
 //BA.debugLineNum = 130744322;BA.debugLine="End Sub";
return "";
}
public static String  _contentlist_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "contentlist_visiblerangechanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "contentlist_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
RDebugUtils.currentLine=130678784;
 //BA.debugLineNum = 130678784;BA.debugLine="Sub ContentList_VisibleRangeChanged (FirstIndex As";
RDebugUtils.currentLine=130678786;
 //BA.debugLineNum = 130678786;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createrowrecord(int _idx,String _title) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrowrecord", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createrowrecord", new Object[] {_idx,_title}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=130154496;
 //BA.debugLineNum = 130154496;BA.debugLine="Sub CreateRowRecord(idx As Int, Title As String )";
RDebugUtils.currentLine=130154497;
 //BA.debugLineNum = 130154497;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=130154498;
 //BA.debugLineNum = 130154498;BA.debugLine="p.Initialize(\"CLALineClick\")";
_p.Initialize(mostCurrent.activityBA,"CLALineClick");
RDebugUtils.currentLine=130154499;
 //BA.debugLineNum = 130154499;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 85dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=130154500;
 //BA.debugLineNum = 130154500;BA.debugLine="p.LoadLayout(\"ChecklistRecordLineViewButtons\")";
_p.LoadLayout("ChecklistRecordLineViewButtons",mostCurrent.activityBA);
RDebugUtils.currentLine=130154501;
 //BA.debugLineNum = 130154501;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=130154503;
 //BA.debugLineNum = 130154503;BA.debugLine="RecordLineTitle.Text = Title";
mostCurrent._recordlinetitle.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=130154504;
 //BA.debugLineNum = 130154504;BA.debugLine="RecordLineTitle.Tag = idx";
mostCurrent._recordlinetitle.setTag((Object)(_idx));
RDebugUtils.currentLine=130154505;
 //BA.debugLineNum = 130154505;BA.debugLine="RecordLineMandatory.Tag = idx";
mostCurrent._recordlinemandatory.setTag((Object)(_idx));
RDebugUtils.currentLine=130154506;
 //BA.debugLineNum = 130154506;BA.debugLine="RecordLineCritical.Tag = idx";
mostCurrent._recordlinecritical.setTag((Object)(_idx));
RDebugUtils.currentLine=130154507;
 //BA.debugLineNum = 130154507;BA.debugLine="RecordLineInformation.Tag = idx";
mostCurrent._recordlineinformation.setTag((Object)(_idx));
RDebugUtils.currentLine=130154508;
 //BA.debugLineNum = 130154508;BA.debugLine="RecordLineMoreOptions.Tag = idx";
mostCurrent._recordlinemoreoptions.setTag((Object)(_idx));
RDebugUtils.currentLine=130154510;
 //BA.debugLineNum = 130154510;BA.debugLine="RecordLineB4XSButtonC.Text = \"Conforme\"";
mostCurrent._recordlineb4xsbuttonc._settext /*String*/ (null,"Conforme");
RDebugUtils.currentLine=130154511;
 //BA.debugLineNum = 130154511;BA.debugLine="RecordLineB4XSButtonNC.Text = \"Não Conforme\"";
mostCurrent._recordlineb4xsbuttonnc._settext /*String*/ (null,"Não Conforme");
RDebugUtils.currentLine=130154512;
 //BA.debugLineNum = 130154512;BA.debugLine="RecordLineB4XSButtonNA.Text = \"Não Aplicável\"";
mostCurrent._recordlineb4xsbuttonna._settext /*String*/ (null,"Não Aplicável");
RDebugUtils.currentLine=130154514;
 //BA.debugLineNum = 130154514;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=130154515;
 //BA.debugLineNum = 130154515;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=130154516;
 //BA.debugLineNum = 130154516;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createrowrecordchapter(int _idx,String _title) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrowrecordchapter", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createrowrecordchapter", new Object[] {_idx,_title}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=130220032;
 //BA.debugLineNum = 130220032;BA.debugLine="Sub CreateRowRecordChapter(idx As Int, Title As St";
RDebugUtils.currentLine=130220033;
 //BA.debugLineNum = 130220033;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=130220034;
 //BA.debugLineNum = 130220034;BA.debugLine="p.Initialize(\"CLALineClick\")";
_p.Initialize(mostCurrent.activityBA,"CLALineClick");
RDebugUtils.currentLine=130220035;
 //BA.debugLineNum = 130220035;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 85dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=130220036;
 //BA.debugLineNum = 130220036;BA.debugLine="p.LoadLayout(\"ChecklistRecordLineViewChapter\")";
_p.LoadLayout("ChecklistRecordLineViewChapter",mostCurrent.activityBA);
RDebugUtils.currentLine=130220037;
 //BA.debugLineNum = 130220037;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=130220039;
 //BA.debugLineNum = 130220039;BA.debugLine="RecordLineTitle.Text = Title";
mostCurrent._recordlinetitle.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=130220040;
 //BA.debugLineNum = 130220040;BA.debugLine="RecordLineTitle.Tag = idx";
mostCurrent._recordlinetitle.setTag((Object)(_idx));
RDebugUtils.currentLine=130220041;
 //BA.debugLineNum = 130220041;BA.debugLine="RecordLineInformation.Tag = idx";
mostCurrent._recordlineinformation.setTag((Object)(_idx));
RDebugUtils.currentLine=130220042;
 //BA.debugLineNum = 130220042;BA.debugLine="RecordLineMoreOptions.Tag = idx";
mostCurrent._recordlinemoreoptions.setTag((Object)(_idx));
RDebugUtils.currentLine=130220044;
 //BA.debugLineNum = 130220044;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=130220045;
 //BA.debugLineNum = 130220045;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=130220046;
 //BA.debugLineNum = 130220046;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createrowrecordsubchapter(int _idx,String _title) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrowrecordsubchapter", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createrowrecordsubchapter", new Object[] {_idx,_title}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=130285568;
 //BA.debugLineNum = 130285568;BA.debugLine="Sub CreateRowRecordSubChapter(idx As Int, Title As";
RDebugUtils.currentLine=130285569;
 //BA.debugLineNum = 130285569;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=130285570;
 //BA.debugLineNum = 130285570;BA.debugLine="p.Initialize(\"CLALineClick\")";
_p.Initialize(mostCurrent.activityBA,"CLALineClick");
RDebugUtils.currentLine=130285571;
 //BA.debugLineNum = 130285571;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 85dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=130285572;
 //BA.debugLineNum = 130285572;BA.debugLine="p.LoadLayout(\"ChecklistRecordLineViewSubChapter\")";
_p.LoadLayout("ChecklistRecordLineViewSubChapter",mostCurrent.activityBA);
RDebugUtils.currentLine=130285573;
 //BA.debugLineNum = 130285573;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=130285575;
 //BA.debugLineNum = 130285575;BA.debugLine="RecordLineTitle.Text = Title";
mostCurrent._recordlinetitle.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=130285576;
 //BA.debugLineNum = 130285576;BA.debugLine="RecordLineTitle.Tag = idx";
mostCurrent._recordlinetitle.setTag((Object)(_idx));
RDebugUtils.currentLine=130285577;
 //BA.debugLineNum = 130285577;BA.debugLine="RecordLineInformation.Tag = idx";
mostCurrent._recordlineinformation.setTag((Object)(_idx));
RDebugUtils.currentLine=130285578;
 //BA.debugLineNum = 130285578;BA.debugLine="RecordLineMoreOptions.Tag = idx";
mostCurrent._recordlinemoreoptions.setTag((Object)(_idx));
RDebugUtils.currentLine=130285580;
 //BA.debugLineNum = 130285580;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=130285581;
 //BA.debugLineNum = 130285581;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=130285582;
 //BA.debugLineNum = 130285582;BA.debugLine="End Sub";
return null;
}
public static String  _createrowstolist() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrowstolist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createrowstolist", null));}
RDebugUtils.currentLine=130023424;
 //BA.debugLineNum = 130023424;BA.debugLine="Sub CreateRowsToList";
RDebugUtils.currentLine=130023425;
 //BA.debugLineNum = 130023425;BA.debugLine="RunThis";
_runthis();
RDebugUtils.currentLine=130023426;
 //BA.debugLineNum = 130023426;BA.debugLine="End Sub";
return "";
}
public static void  _runthis() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runthis", false))
	 {Debug.delegate(mostCurrent.activityBA, "runthis", null); return;}
ResumableSub_RunThis rsub = new ResumableSub_RunThis(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_RunThis extends BA.ResumableSub {
public ResumableSub_RunThis(xevolution.vrcg.devdemov2400.checklistnew parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.checklistnew parent;
long _log_starttime = 0L;
int _chaptercount = 0;
int _subchaptercount = 0;
int _chaptercounter = 0;
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _rowrec = null;
long _log_endtime = 0L;
String _descritivo = "";
int step7;
int limit7;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="checklistnew";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130088961;
 //BA.debugLineNum = 130088961;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=130088962;
 //BA.debugLineNum = 130088962;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "checklistnew", "runthis"),(int) (100));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=130088963;
 //BA.debugLineNum = 130088963;BA.debugLine="Dim LOG_StartTime As Long = DateTime.Now";
_log_starttime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=130088964;
 //BA.debugLineNum = 130088964;BA.debugLine="Dim ChapterCount As Int = 0";
_chaptercount = (int) (0);
RDebugUtils.currentLine=130088965;
 //BA.debugLineNum = 130088965;BA.debugLine="Dim SubChapterCount As Int = 0";
_subchaptercount = (int) (0);
RDebugUtils.currentLine=130088966;
 //BA.debugLineNum = 130088966;BA.debugLine="Dim ChapterCounter As Int = 1";
_chaptercounter = (int) (1);
RDebugUtils.currentLine=130088967;
 //BA.debugLineNum = 130088967;BA.debugLine="For n=0 To 600   '1000";
if (true) break;

case 1:
//for
this.state = 18;
step7 = 1;
limit7 = (int) (600);
_n = (int) (0) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 18;
if ((step7 > 0 && _n <= limit7) || (step7 < 0 && _n >= limit7)) this.state = 3;
if (true) break;

case 21:
//C
this.state = 20;
_n = ((int)(0 + _n + step7)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=130088968;
 //BA.debugLineNum = 130088968;BA.debugLine="If (ChapterCount = 0) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_chaptercount==0)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=130088969;
 //BA.debugLineNum = 130088969;BA.debugLine="Dim RowRec As B4XView = CreateRowRecordChapter(";
_rowrec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_rowrec = _createrowrecordchapter(_n,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chaptercounter))+". Capítulo com o número : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+""));
RDebugUtils.currentLine=130088970;
 //BA.debugLineNum = 130088970;BA.debugLine="ContentList.Add(RowRec, n)";
parent.mostCurrent._contentlist._add(_rowrec,(Object)(_n));
 if (true) break;
;
RDebugUtils.currentLine=130088972;
 //BA.debugLineNum = 130088972;BA.debugLine="If (SubChapterCount = 0) Then";

case 7:
//if
this.state = 10;
if ((_subchaptercount==0)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=130088973;
 //BA.debugLineNum = 130088973;BA.debugLine="Dim RowRec As B4XView = CreateRowRecordSubChapt";
_rowrec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_rowrec = _createrowrecordsubchapter(_n,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chaptercounter))+". ´Sub Capítulo com o número : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_subchaptercount))+""));
RDebugUtils.currentLine=130088974;
 //BA.debugLineNum = 130088974;BA.debugLine="ContentList.Add(RowRec, n)";
parent.mostCurrent._contentlist._add(_rowrec,(Object)(_n));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=130088976;
 //BA.debugLineNum = 130088976;BA.debugLine="Dim RowRec As B4XView = CreateRowRecord(n, $\"${C";
_rowrec = new anywheresoftware.b4a.objects.B4XViewWrapper();
_rowrec = _createrowrecord(_n,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chaptercounter))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chaptercount))+". Pergunta com o número : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+""));
RDebugUtils.currentLine=130088977;
 //BA.debugLineNum = 130088977;BA.debugLine="ContentList.Add(RowRec, n)";
parent.mostCurrent._contentlist._add(_rowrec,(Object)(_n));
RDebugUtils.currentLine=130088978;
 //BA.debugLineNum = 130088978;BA.debugLine="ChapterCount = ChapterCount +1";
_chaptercount = (int) (_chaptercount+1);
RDebugUtils.currentLine=130088979;
 //BA.debugLineNum = 130088979;BA.debugLine="SubChapterCount = SubChapterCount +1";
_subchaptercount = (int) (_subchaptercount+1);
RDebugUtils.currentLine=130088980;
 //BA.debugLineNum = 130088980;BA.debugLine="If (ChapterCount = 50) Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((_chaptercount==50)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=130088981;
 //BA.debugLineNum = 130088981;BA.debugLine="ChapterCount = 0";
_chaptercount = (int) (0);
RDebugUtils.currentLine=130088982;
 //BA.debugLineNum = 130088982;BA.debugLine="SubChapterCount = 0";
_subchaptercount = (int) (0);
RDebugUtils.currentLine=130088983;
 //BA.debugLineNum = 130088983;BA.debugLine="ChapterCounter = ChapterCounter +1";
_chaptercounter = (int) (_chaptercounter+1);
 if (true) break;
;
RDebugUtils.currentLine=130088986;
 //BA.debugLineNum = 130088986;BA.debugLine="If (SubChapterCount = 20) Then";

case 14:
//if
this.state = 17;
if ((_subchaptercount==20)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=130088987;
 //BA.debugLineNum = 130088987;BA.debugLine="SubChapterCount = 0";
_subchaptercount = (int) (0);
 if (true) break;

case 17:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=130088991;
 //BA.debugLineNum = 130088991;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=130088992;
 //BA.debugLineNum = 130088992;BA.debugLine="Dim LOG_EndTime As Long = DateTime.Now";
_log_endtime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=130088993;
 //BA.debugLineNum = 130088993;BA.debugLine="Dim Descritivo As String = $\"Duração : ${Utils.DT";
_descritivo = ("Duração : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._dtsbtwl /*String*/ (mostCurrent.activityBA,_log_starttime,_log_endtime)))+"");
RDebugUtils.currentLine=130088994;
 //BA.debugLineNum = 130088994;BA.debugLine="Log( Descritivo )";
anywheresoftware.b4a.keywords.Common.LogImpl("6130088994",_descritivo,0);
RDebugUtils.currentLine=130088995;
 //BA.debugLineNum = 130088995;BA.debugLine="MsgboxAsync(Descritivo, \"Informação\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(_descritivo),BA.ObjectToCharSequence("Informação"),processBA);
RDebugUtils.currentLine=130088996;
 //BA.debugLineNum = 130088996;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _panelheader_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelheader_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelheader_click", null));}
RDebugUtils.currentLine=130809856;
 //BA.debugLineNum = 130809856;BA.debugLine="Sub PanelHeader_Click";
RDebugUtils.currentLine=130809858;
 //BA.debugLineNum = 130809858;BA.debugLine="End Sub";
return "";
}
public static String  _panelheader_longclick() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelheader_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelheader_longclick", null));}
RDebugUtils.currentLine=130875392;
 //BA.debugLineNum = 130875392;BA.debugLine="Sub PanelHeader_LongClick";
RDebugUtils.currentLine=130875394;
 //BA.debugLineNum = 130875394;BA.debugLine="End Sub";
return "";
}
public static String  _recordlineb4xsbutton_stateclick(int _state) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlineb4xsbutton_stateclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlineb4xsbutton_stateclick", new Object[] {_state}));}
RDebugUtils.currentLine=131268608;
 //BA.debugLineNum = 131268608;BA.debugLine="Sub RecordLineB4XSButton_StateClick (State As Int)";
RDebugUtils.currentLine=131268609;
 //BA.debugLineNum = 131268609;BA.debugLine="MsgboxAsync(\"Clicou aqui!\", \"Alerta!\")";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Clicou aqui!"),BA.ObjectToCharSequence("Alerta!"),processBA);
RDebugUtils.currentLine=131268610;
 //BA.debugLineNum = 131268610;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinebutadd_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinebutadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinebutadd_click", null));}
RDebugUtils.currentLine=131596288;
 //BA.debugLineNum = 131596288;BA.debugLine="Sub RecordLineButAdd_Click";
RDebugUtils.currentLine=131596290;
 //BA.debugLineNum = 131596290;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinebutleft_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinebutleft_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinebutleft_click", null));}
RDebugUtils.currentLine=131661824;
 //BA.debugLineNum = 131661824;BA.debugLine="Sub RecordLineButLeft_Click";
RDebugUtils.currentLine=131661826;
 //BA.debugLineNum = 131661826;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinebutless_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinebutless_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinebutless_click", null));}
RDebugUtils.currentLine=131530752;
 //BA.debugLineNum = 131530752;BA.debugLine="Sub RecordLineButLess_Click";
RDebugUtils.currentLine=131530754;
 //BA.debugLineNum = 131530754;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinebutright_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinebutright_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinebutright_click", null));}
RDebugUtils.currentLine=131399680;
 //BA.debugLineNum = 131399680;BA.debugLine="Sub RecordLineButRight_Click";
RDebugUtils.currentLine=131399682;
 //BA.debugLineNum = 131399682;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinecollpseexpand_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinecollpseexpand_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinecollpseexpand_click", null));}
RDebugUtils.currentLine=131334144;
 //BA.debugLineNum = 131334144;BA.debugLine="Sub RecordLineCollpseExpand_Click";
RDebugUtils.currentLine=131334146;
 //BA.debugLineNum = 131334146;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinecritical_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinecritical_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinecritical_click", null));}
RDebugUtils.currentLine=131137536;
 //BA.debugLineNum = 131137536;BA.debugLine="Sub RecordLineCritical_Click";
RDebugUtils.currentLine=131137538;
 //BA.debugLineNum = 131137538;BA.debugLine="End Sub";
return "";
}
public static String  _recordlineinformation_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlineinformation_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlineinformation_click", null));}
RDebugUtils.currentLine=131072000;
 //BA.debugLineNum = 131072000;BA.debugLine="Sub RecordLineInformation_Click";
RDebugUtils.currentLine=131072002;
 //BA.debugLineNum = 131072002;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinemandatory_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinemandatory_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinemandatory_click", null));}
RDebugUtils.currentLine=131203072;
 //BA.debugLineNum = 131203072;BA.debugLine="Sub RecordLineMandatory_Click";
RDebugUtils.currentLine=131203074;
 //BA.debugLineNum = 131203074;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinemoreoptions_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinemoreoptions_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinemoreoptions_click", null));}
RDebugUtils.currentLine=130940928;
 //BA.debugLineNum = 130940928;BA.debugLine="Sub RecordLineMoreOptions_Click";
RDebugUtils.currentLine=130940930;
 //BA.debugLineNum = 130940930;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinerow_onhide(int _state,int _id) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinerow_onhide", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinerow_onhide", new Object[] {_state,_id}));}
RDebugUtils.currentLine=131792896;
 //BA.debugLineNum = 131792896;BA.debugLine="Sub RecordLineRow_OnHide (State As Int, ID As Int)";
RDebugUtils.currentLine=131792898;
 //BA.debugLineNum = 131792898;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinerow_onvisible(int _state,int _id) throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinerow_onvisible", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinerow_onvisible", new Object[] {_state,_id}));}
RDebugUtils.currentLine=131727360;
 //BA.debugLineNum = 131727360;BA.debugLine="Sub RecordLineRow_OnVisible (State As Int, ID As I";
RDebugUtils.currentLine=131727362;
 //BA.debugLineNum = 131727362;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinetextrepeat_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinetextrepeat_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinetextrepeat_click", null));}
RDebugUtils.currentLine=131465216;
 //BA.debugLineNum = 131465216;BA.debugLine="Sub RecordLineTextRepeat_Click";
RDebugUtils.currentLine=131465218;
 //BA.debugLineNum = 131465218;BA.debugLine="End Sub";
return "";
}
public static String  _recordlinetitle_click() throws Exception{
RDebugUtils.currentModule="checklistnew";
if (Debug.shouldDelegate(mostCurrent.activityBA, "recordlinetitle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "recordlinetitle_click", null));}
RDebugUtils.currentLine=131006464;
 //BA.debugLineNum = 131006464;BA.debugLine="Sub RecordLineTitle_Click";
RDebugUtils.currentLine=131006466;
 //BA.debugLineNum = 131006466;BA.debugLine="End Sub";
return "";
}
}