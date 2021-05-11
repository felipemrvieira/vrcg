package xevolution.vrcg.devdemov2400;

import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;

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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
b4a.example.encoding._process_globals();
b4a.example.esc_pos._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (mainmenu.mostCurrent != null);
vis = vis | (imageedit.mostCurrent != null);
vis = vis | (checklist3.mostCurrent != null);
vis = vis | (dataupdate.mostCurrent != null);
vis = vis | (alerts.mostCurrent != null);
vis = vis | (barcodescanner.mostCurrent != null);
vis = vis | (cameraactivity.mostCurrent != null);
vis = vis | (cameraactivity_innershot.mostCurrent != null);
vis = vis | (cameraactivity2.mostCurrent != null);
vis = vis | (checklistnew.mostCurrent != null);
vis = vis | (mapsactivity.mostCurrent != null);
vis = vis | (newsync.mostCurrent != null);
vis = vis | (objectedit.mostCurrent != null);
vis = vis | (objects.mostCurrent != null);
vis = vis | (report.mostCurrent != null);
vis = vis | (reportview.mostCurrent != null);
vis = vis | (requests3.mostCurrent != null);
vis = vis | (taskscl2.mostCurrent != null);
vis = vis | (user.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, comms.class));
 {
            Activity __a = null;
            if (mainmenu.previousOne != null) {
				__a = mainmenu.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mainmenu.mostCurrent == null ? null : mainmenu.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (imageedit.previousOne != null) {
				__a = imageedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(imageedit.mostCurrent == null ? null : imageedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (checklist3.previousOne != null) {
				__a = checklist3.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(checklist3.mostCurrent == null ? null : checklist3.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, locationservice.class));
 {
            Activity __a = null;
            if (dataupdate.previousOne != null) {
				__a = dataupdate.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(dataupdate.mostCurrent == null ? null : dataupdate.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (alerts.previousOne != null) {
				__a = alerts.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(alerts.mostCurrent == null ? null : alerts.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, backgroundupdateservice.class));
 {
            Activity __a = null;
            if (barcodescanner.previousOne != null) {
				__a = barcodescanner.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(barcodescanner.mostCurrent == null ? null : barcodescanner.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (cameraactivity.previousOne != null) {
				__a = cameraactivity.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(cameraactivity.mostCurrent == null ? null : cameraactivity.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (cameraactivity_innershot.previousOne != null) {
				__a = cameraactivity_innershot.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(cameraactivity_innershot.mostCurrent == null ? null : cameraactivity_innershot.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (cameraactivity2.previousOne != null) {
				__a = cameraactivity2.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(cameraactivity2.mostCurrent == null ? null : cameraactivity2.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (checklistnew.previousOne != null) {
				__a = checklistnew.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(checklistnew.mostCurrent == null ? null : checklistnew.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, logs.class));
 {
            Activity __a = null;
            if (mapsactivity.previousOne != null) {
				__a = mapsactivity.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(mapsactivity.mostCurrent == null ? null : mapsactivity.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (newsync.previousOne != null) {
				__a = newsync.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(newsync.mostCurrent == null ? null : newsync.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (objectedit.previousOne != null) {
				__a = objectedit.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(objectedit.mostCurrent == null ? null : objectedit.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (objects.previousOne != null) {
				__a = objects.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(objects.mostCurrent == null ? null : objects.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (report.previousOne != null) {
				__a = report.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(report.mostCurrent == null ? null : report.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (reportview.previousOne != null) {
				__a = reportview.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(reportview.mostCurrent == null ? null : reportview.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (requests3.previousOne != null) {
				__a = requests3.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(requests3.mostCurrent == null ? null : requests3.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (taskscl2.previousOne != null) {
				__a = taskscl2.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(taskscl2.mostCurrent == null ? null : taskscl2.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, updateservice.class));
 {
            Activity __a = null;
            if (user.previousOne != null) {
				__a = user.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(user.mostCurrent == null ? null : user.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, userservice.class));
BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, httputils2service.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.Timer _timestart = null;
public static boolean _appstarted = false;
public static int _mainshowdialogresult = 0;
public static boolean _started = false;
public static boolean _waittoconfirm = false;
public static boolean _islogindone = false;
public static boolean _ismainscreen = false;
public static anywheresoftware.b4a.phone.Phone _device = null;
public static String _appbuildversion = "";
public static String _appbuildversiondate = "";
public static String _versiontagcode = "";
public static boolean _keepal = false;
public static long _db_size = 0L;
public static String _currentbuild = "";
public static String _devicebrand = "";
public static String _devicemodel = "";
public static String _devicemacaddress = "";
public static String _deviceauthorization = "";
public static String _deviceinstance = "";
public anywheresoftware.b4a.objects.PanelWrapper _mainpanelsplash = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainpansplashimage = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainpansplashlogo = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _mainsplashprogress = null;
public xevolution.vrcg.devdemov2400.force_gc _gc = null;
public com.jakes.menuonviews.menuonanyview _mainpopmenu = null;
public static boolean _lgo_passwordmode = false;
public static int _neterrortrycount = 0;
public static String _mainlayout = "";
public anywheresoftware.b4a.objects.ButtonWrapper _buttonauthback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonauthnext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonloginenter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonloginexit = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonloginreset = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonwelcomenext = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editauthorization = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editinstance = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editpassword = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editusername = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainsplashimage = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_authorization = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_config = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_login = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_login_validation = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_verification = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel_welcome = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _selectlanguage = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _selectorientation = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainsplashimageeffect = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainfirstinstall = null;
public static boolean _isfirstinstall = false;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainpansplashcustomlogo = null;
public anywheresoftware.b4a.objects.PanelWrapper _mainlayoutpanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _loginpaneliconimageview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _loginvalidationpaneliconimageview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _varificationpaneliconimageview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _authorizationpaneliconimageview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _welcomepaneliconimageview = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _companyimageview = null;
public anywheresoftware.b4a.objects.LabelWrapper _apptitle = null;
public static int _timestartcounter = 0;
public anywheresoftware.b4a.phone.Phone _phone = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsaveqrcode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcancelqrcode = null;
public qrcodereaderviewwrapper.qrCodeReaderViewWrapper _qrcodereader = null;
public anywheresoftware.b4a.objects.PanelWrapper _qrcodepanel = null;
public static String _qrcodekeyreceived = "";
public anywheresoftware.b4a.objects.ButtonWrapper _getqrcode = null;
public static String _liteupdatetagcodes = "";
public static String _loginupdatefilename = "";
public anywheresoftware.b4a.objects.LabelWrapper _labelcontroloacesso = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelnomeutilizador = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelpasswordutilizador = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltitulocredenciais = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelwelcomewarning = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelwelcomeevolutioncheck = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelhelpautorizacao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelautorizacao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcodigoinstancia = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcodigoautorizacao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelvalidacaologin = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelvalidacaoacesso = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcheckvalidacao = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelverificacao = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldownloadinicial = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldownloadinicialtitle = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressoinicial = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressoinicial2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldownloadinicialfases = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltarefa = null;
public anywheresoftware.b4a.objects.EditTextWrapper _newpass1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _newpass2 = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _logobackevc = null;
public static int _currentorientation = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.encoding _encoding = null;
public b4a.example.esc_pos _esc_pos = null;
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
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="Call_CheckWebAccess";
_call_checkwebaccess();
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="SetLanguage";
_setlanguage();
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="SetDeviceInfo";
_setdeviceinfo();
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="SetActivityLayout";
_setactivitylayout();
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="SetFTPUser";
_setftpuser();
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="CheckDeviceOrientation";
_checkdeviceorientation();
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="SetTextLabels";
_settextlabels();
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="LogoBackEVC.Visible = False";
mostCurrent._logobackevc.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="ShareCode.ScanList.Initialize";
mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="ShareCode.ListOfCodes2Compare.Initialize";
mostCurrent._sharecode._listofcodes2compare /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="Delete_srv_Files";
_delete_srv_files();
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="Check_Installed_Date";
_check_installed_date();
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="End Sub";
return "";
}
public static String  _call_checkwebaccess() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "call_checkwebaccess", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "call_checkwebaccess", null));}
RDebugUtils.currentLine=108331008;
 //BA.debugLineNum = 108331008;BA.debugLine="Sub Call_CheckWebAccess";
RDebugUtils.currentLine=108331009;
 //BA.debugLineNum = 108331009;BA.debugLine="Try";
try {RDebugUtils.currentLine=108331010;
 //BA.debugLineNum = 108331010;BA.debugLine="CallSub(Starter, \"CheckWebAccess\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._starter.getObject()),"CheckWebAccess");
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=108331012;
 //BA.debugLineNum = 108331012;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6108331012",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=108331013;
 //BA.debugLineNum = 108331013;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=108331015;
 //BA.debugLineNum = 108331015;BA.debugLine="End Sub";
return "";
}
public static String  _setlanguage() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setlanguage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setlanguage", null));}
RDebugUtils.currentLine=108396544;
 //BA.debugLineNum = 108396544;BA.debugLine="Sub SetLanguage";
RDebugUtils.currentLine=108396552;
 //BA.debugLineNum = 108396552;BA.debugLine="If ShareCode.DEVICE_LANGUAGE_STR = \"\" Then";
if ((mostCurrent._sharecode._device_language_str /*String*/ ).equals("")) { 
RDebugUtils.currentLine=108396553;
 //BA.debugLineNum = 108396553;BA.debugLine="ShareCode.DEVICE_LANGUAGE_STR = GetDefaultLangua";
mostCurrent._sharecode._device_language_str /*String*/  = _getdefaultlanguage().toUpperCase();
 };
RDebugUtils.currentLine=108396556;
 //BA.debugLineNum = 108396556;BA.debugLine="Log(ShareCode.DEVICE_LANGUAGE_STR)";
anywheresoftware.b4a.keywords.Common.LogImpl("6108396556",mostCurrent._sharecode._device_language_str /*String*/ ,0);
RDebugUtils.currentLine=108396558;
 //BA.debugLineNum = 108396558;BA.debugLine="If Utils.NE(ShareCode.DEVICE_LANGUAGE_STR) Then";
if (mostCurrent._utils._ne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_language_str /*String*/ )) { 
RDebugUtils.currentLine=108396559;
 //BA.debugLineNum = 108396559;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 }else {
RDebugUtils.currentLine=108396561;
 //BA.debugLineNum = 108396561;BA.debugLine="ShareCode.CheckTranslations(ShareCode.DEVICE_LAN";
mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_language_str /*String*/ );
 };
RDebugUtils.currentLine=108396564;
 //BA.debugLineNum = 108396564;BA.debugLine="End Sub";
return "";
}
public static String  _setdeviceinfo() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setdeviceinfo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setdeviceinfo", null));}
String _marca = "";
String _modelo = "";
RDebugUtils.currentLine=108462080;
 //BA.debugLineNum = 108462080;BA.debugLine="Sub SetDeviceInfo";
RDebugUtils.currentLine=108462081;
 //BA.debugLineNum = 108462081;BA.debugLine="ShareCode.DEVICE_BRAND = Device.Manufacturer";
mostCurrent._sharecode._device_brand /*String*/  = _device.getManufacturer();
RDebugUtils.currentLine=108462082;
 //BA.debugLineNum = 108462082;BA.debugLine="ShareCode.DEVICE_MODEL = Device.Model";
mostCurrent._sharecode._device_model /*String*/  = _device.getModel();
RDebugUtils.currentLine=108462083;
 //BA.debugLineNum = 108462083;BA.debugLine="ShareCode.DEVICE_TYPE = Device.Product";
mostCurrent._sharecode._device_type /*String*/  = _device.getProduct();
RDebugUtils.currentLine=108462085;
 //BA.debugLineNum = 108462085;BA.debugLine="Dim MARCA As String = ShareCode.DEVICE_BRAND.ToUp";
_marca = mostCurrent._sharecode._device_brand /*String*/ .toUpperCase();
RDebugUtils.currentLine=108462086;
 //BA.debugLineNum = 108462086;BA.debugLine="Dim MODELO As String = ShareCode.DEVICE_MODEL.ToU";
_modelo = mostCurrent._sharecode._device_model /*String*/ .toUpperCase();
RDebugUtils.currentLine=108462087;
 //BA.debugLineNum = 108462087;BA.debugLine="DeviceBrand = MARCA";
_devicebrand = _marca;
RDebugUtils.currentLine=108462088;
 //BA.debugLineNum = 108462088;BA.debugLine="DeviceModel = MODELO";
_devicemodel = _modelo;
RDebugUtils.currentLine=108462090;
 //BA.debugLineNum = 108462090;BA.debugLine="Try";
try {RDebugUtils.currentLine=108462091;
 //BA.debugLineNum = 108462091;BA.debugLine="DeviceMacAddress = newGetMAC.ToUpperCase";
_devicemacaddress = _newgetmac().toUpperCase();
 } 
       catch (Exception e11) {
			processBA.setLastException(e11);RDebugUtils.currentLine=108462093;
 //BA.debugLineNum = 108462093;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6108462093",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=108462094;
 //BA.debugLineNum = 108462094;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=108462095;
 //BA.debugLineNum = 108462095;BA.debugLine="DeviceMacAddress = \"\"";
_devicemacaddress = "";
 };
RDebugUtils.currentLine=108462098;
 //BA.debugLineNum = 108462098;BA.debugLine="ShareCode.GlobalReportviewSleepTimer = 50";
mostCurrent._sharecode._globalreportviewsleeptimer /*int*/  = (int) (50);
RDebugUtils.currentLine=108462102;
 //BA.debugLineNum = 108462102;BA.debugLine="Select Case MARCA";
switch (BA.switchObjectToInt(_marca,"LENOVO","SAMSUNG","HUAWEI","ALCATEL","XIAOMI","TCL")) {
case 0: {
RDebugUtils.currentLine=108462104;
 //BA.debugLineNum = 108462104;BA.debugLine="If MODELO = \"LENOVO TB-7504X\" Then";
if ((_modelo).equals("LENOVO TB-7504X")) { 
RDebugUtils.currentLine=108462105;
 //BA.debugLineNum = 108462105;BA.debugLine="ShareCode.ISPHONE = True";
mostCurrent._sharecode._isphone /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 };
 break; }
case 1: {
RDebugUtils.currentLine=108462108;
 //BA.debugLineNum = 108462108;BA.debugLine="If MODELO = \"SM-A105FN\" Or MODELO = \"SM-A217F\"";
if ((_modelo).equals("SM-A105FN") || (_modelo).equals("SM-A217F")) { 
RDebugUtils.currentLine=108462109;
 //BA.debugLineNum = 108462109;BA.debugLine="ShareCode.ISPHONE = True";
mostCurrent._sharecode._isphone /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 };
 break; }
case 2: {
RDebugUtils.currentLine=108462112;
 //BA.debugLineNum = 108462112;BA.debugLine="ShareCode.GlobalReportviewSleepTimer = 500";
mostCurrent._sharecode._globalreportviewsleeptimer /*int*/  = (int) (500);
 break; }
case 3: {
 break; }
case 4: {
RDebugUtils.currentLine=108462116;
 //BA.debugLineNum = 108462116;BA.debugLine="If MODELO = \"DANDELION\" Or MODELO = \"NOTE 9S\" O";
if ((_modelo).equals("DANDELION") || (_modelo).equals("NOTE 9S") || (_modelo).equals("REDMI NOTE 9S") || (_modelo).equals("REDMI NOTE 7") || (_modelo).equals("MI NOTE 10 LITE")) { 
RDebugUtils.currentLine=108462117;
 //BA.debugLineNum = 108462117;BA.debugLine="ShareCode.ISPHONE = True";
mostCurrent._sharecode._isphone /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 };
 break; }
case 5: {
RDebugUtils.currentLine=108462120;
 //BA.debugLineNum = 108462120;BA.debugLine="If MODELO = \"8068_EEA\" Then";
if ((_modelo).equals("8068_EEA")) { 
RDebugUtils.currentLine=108462121;
 //BA.debugLineNum = 108462121;BA.debugLine="ShareCode.ISPHONE = True";
mostCurrent._sharecode._isphone /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 };
 break; }
}
;
RDebugUtils.currentLine=108462124;
 //BA.debugLineNum = 108462124;BA.debugLine="End Sub";
return "";
}
public static String  _setactivitylayout() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setactivitylayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setactivitylayout", null));}
RDebugUtils.currentLine=108527616;
 //BA.debugLineNum = 108527616;BA.debugLine="Sub SetActivityLayout";
RDebugUtils.currentLine=108527617;
 //BA.debugLineNum = 108527617;BA.debugLine="If ((ShareCode.APPL_ACCOUNT.ToUpperCase = \"DEMO\")";
if ((((mostCurrent._sharecode._appl_account /*String*/ .toUpperCase()).equals("DEMO")) || ((mostCurrent._sharecode._appl_account /*String*/ .toUpperCase()).equals("AGENTES")))) { 
RDebugUtils.currentLine=108527618;
 //BA.debugLineNum = 108527618;BA.debugLine="mainLayout = \"mainlayout_v2_demo\"";
mostCurrent._mainlayout = "mainlayout_v2_demo";
 }else {
RDebugUtils.currentLine=108527620;
 //BA.debugLineNum = 108527620;BA.debugLine="mainLayout = \"mainlayout_v2\"";
mostCurrent._mainlayout = "mainlayout_v2";
 };
RDebugUtils.currentLine=108527623;
 //BA.debugLineNum = 108527623;BA.debugLine="Activity.LoadLayout(mainLayout)";
mostCurrent._activity.LoadLayout(mostCurrent._mainlayout,mostCurrent.activityBA);
RDebugUtils.currentLine=108527624;
 //BA.debugLineNum = 108527624;BA.debugLine="End Sub";
return "";
}
public static String  _setftpuser() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setftpuser", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setftpuser", null));}
RDebugUtils.currentLine=108593152;
 //BA.debugLineNum = 108593152;BA.debugLine="Sub SetFTPUser";
RDebugUtils.currentLine=108593153;
 //BA.debugLineNum = 108593153;BA.debugLine="If ShareCode.IsDevelopment Then";
if (mostCurrent._sharecode._isdevelopment /*boolean*/ ) { 
RDebugUtils.currentLine=108593154;
 //BA.debugLineNum = 108593154;BA.debugLine="ShareCode.APP_FTP_USER = \"DevEvolutionCheck\"";
mostCurrent._sharecode._app_ftp_user /*String*/  = "DevEvolutionCheck";
 }else {
RDebugUtils.currentLine=108593156;
 //BA.debugLineNum = 108593156;BA.debugLine="ShareCode.APP_FTP_USER = \"EvolutionCheck\"";
mostCurrent._sharecode._app_ftp_user /*String*/  = "EvolutionCheck";
 };
RDebugUtils.currentLine=108593158;
 //BA.debugLineNum = 108593158;BA.debugLine="End Sub";
return "";
}
public static void  _checkdeviceorientation() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkdeviceorientation", false))
	 {Debug.delegate(mostCurrent.activityBA, "checkdeviceorientation", null); return;}
ResumableSub_CheckDeviceOrientation rsub = new ResumableSub_CheckDeviceOrientation(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CheckDeviceOrientation extends BA.ResumableSub {
public ResumableSub_CheckDeviceOrientation(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=108658689;
 //BA.debugLineNum = 108658689;BA.debugLine="If mainPanelSplash.Width > mainPanelSplash.Height";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.mostCurrent._mainpanelsplash.getWidth()>parent.mostCurrent._mainpanelsplash.getHeight()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=108658690;
 //BA.debugLineNum = 108658690;BA.debugLine="CurrentOrientation = 0";
parent._currentorientation = (int) (0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=108658692;
 //BA.debugLineNum = 108658692;BA.debugLine="CurrentOrientation = 1";
parent._currentorientation = (int) (1);
 if (true) break;
;
RDebugUtils.currentLine=108658695;
 //BA.debugLineNum = 108658695;BA.debugLine="If ShareCode.ISPHONE And CurrentOrientation = 0 T";

case 6:
//if
this.state = 19;
if (parent.mostCurrent._sharecode._isphone /*boolean*/  && parent._currentorientation==0) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=108658701;
 //BA.debugLineNum = 108658701;BA.debugLine="else if Not(ShareCode.ISPHONE) And CurrentOrienta";
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._isphone /*boolean*/ ) && parent._currentorientation==1) { 
this.state = 14;
}}
if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=108658696;
 //BA.debugLineNum = 108658696;BA.debugLine="Msgbox2Async($\"A orientação do dispositivo está";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("A orientação do dispositivo está definida como landscape (Horizontal)"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Esta definição pode causar erros na aplicação. Continuar a execução ?")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),"Sim","","Não",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=108658697;
 //BA.debugLineNum = 108658697;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkdeviceorientation"), null);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=108658698;
 //BA.debugLineNum = 108658698;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=108658699;
 //BA.debugLineNum = 108658699;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 12:
//C
this.state = 19;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=108658702;
 //BA.debugLineNum = 108658702;BA.debugLine="Msgbox2Async($\"A orientação do dispositivo está";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("A orientação do dispositivo está definida como portrait (Vertical)"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Esta definição pode causar erros na aplicação. Continuar a execução ?")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),"Sim","","Não",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=108658703;
 //BA.debugLineNum = 108658703;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkdeviceorientation"), null);
this.state = 26;
return;
case 26:
//C
this.state = 15;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=108658704;
 //BA.debugLineNum = 108658704;BA.debugLine="If Result = DialogResponse.NEGATIVE Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=108658705;
 //BA.debugLineNum = 108658705;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;
;
RDebugUtils.currentLine=108658709;
 //BA.debugLineNum = 108658709;BA.debugLine="If (ShareCode.ISPHONE) Then";

case 19:
//if
this.state = 24;
if ((parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=108658710;
 //BA.debugLineNum = 108658710;BA.debugLine="ShareCode.DEVICE_ORIENTATION = 1";
parent.mostCurrent._sharecode._device_orientation /*int*/  = (int) (1);
RDebugUtils.currentLine=108658711;
 //BA.debugLineNum = 108658711;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
parent._device.SetScreenOrientation(processBA,parent.mostCurrent._sharecode._device_orientation /*int*/ );
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=108658713;
 //BA.debugLineNum = 108658713;BA.debugLine="ShareCode.DEVICE_ORIENTATION = 0";
parent.mostCurrent._sharecode._device_orientation /*int*/  = (int) (0);
RDebugUtils.currentLine=108658714;
 //BA.debugLineNum = 108658714;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
parent._device.SetScreenOrientation(processBA,parent.mostCurrent._sharecode._device_orientation /*int*/ );
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=108658716;
 //BA.debugLineNum = 108658716;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _settextlabels() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "settextlabels", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "settextlabels", null));}
RDebugUtils.currentLine=108724224;
 //BA.debugLineNum = 108724224;BA.debugLine="Sub SetTextLabels";
RDebugUtils.currentLine=108724227;
 //BA.debugLineNum = 108724227;BA.debugLine="mainFirstInstall.Text = ShareCode.mainlayoutmainF";
mostCurrent._mainfirstinstall.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutmainfirstinstall /*String*/ ));
RDebugUtils.currentLine=108724228;
 //BA.debugLineNum = 108724228;BA.debugLine="ButtonLoginEnter.text = ShareCode.mainlayoutButto";
mostCurrent._buttonloginenter.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonloginenter /*String*/ ));
RDebugUtils.currentLine=108724229;
 //BA.debugLineNum = 108724229;BA.debugLine="ButtonLoginExit.text = ShareCode.mainlayoutButton";
mostCurrent._buttonloginexit.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonloginexit /*String*/ ));
RDebugUtils.currentLine=108724230;
 //BA.debugLineNum = 108724230;BA.debugLine="ButtonLoginReset.text = ShareCode.mainlayoutButto";
mostCurrent._buttonloginreset.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonloginreset /*String*/ ));
RDebugUtils.currentLine=108724231;
 //BA.debugLineNum = 108724231;BA.debugLine="LabelTituloCredenciais.text = ShareCode.mainlayou";
mostCurrent._labeltitulocredenciais.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabeltitulocredenciais /*String*/ ));
RDebugUtils.currentLine=108724232;
 //BA.debugLineNum = 108724232;BA.debugLine="LabelControloAcesso.text = ShareCode.mainlayoutLa";
mostCurrent._labelcontroloacesso.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelcontroloacesso /*String*/ ));
RDebugUtils.currentLine=108724233;
 //BA.debugLineNum = 108724233;BA.debugLine="LabelNomeUtilizador.text = ShareCode.mainlayoutLa";
mostCurrent._labelnomeutilizador.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelnomeutilizador /*String*/ ));
RDebugUtils.currentLine=108724234;
 //BA.debugLineNum = 108724234;BA.debugLine="LabelPasswordUtilizador.text = ShareCode.mainlayo";
mostCurrent._labelpasswordutilizador.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelpasswordutilizador /*String*/ ));
RDebugUtils.currentLine=108724235;
 //BA.debugLineNum = 108724235;BA.debugLine="ButtonAuthNext.Text = ShareCode.mainlayoutButtonA";
mostCurrent._buttonauthnext.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonauthnext /*String*/ ));
RDebugUtils.currentLine=108724236;
 //BA.debugLineNum = 108724236;BA.debugLine="ButtonAuthBack.Text = ShareCode.mainlayoutButtonA";
mostCurrent._buttonauthback.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonauthback /*String*/ ));
RDebugUtils.currentLine=108724237;
 //BA.debugLineNum = 108724237;BA.debugLine="LabelWelcomeWarning.Text = ShareCode.mainlayoutLa";
mostCurrent._labelwelcomewarning.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelwelcomewarning /*String*/ ));
RDebugUtils.currentLine=108724238;
 //BA.debugLineNum = 108724238;BA.debugLine="LabelWelcomeEvolutionCheck.Text=ShareCode.mainlay";
mostCurrent._labelwelcomeevolutioncheck.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelwelcomeevolutioncheck /*String*/ ));
RDebugUtils.currentLine=108724239;
 //BA.debugLineNum = 108724239;BA.debugLine="ButtonAuthBack.Text=ShareCode.mainlayoutButtonAut";
mostCurrent._buttonauthback.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonauthback /*String*/ ));
RDebugUtils.currentLine=108724240;
 //BA.debugLineNum = 108724240;BA.debugLine="ButtonWelcomeNext.Text=ShareCode.mainlayoutButton";
mostCurrent._buttonwelcomenext.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonwelcomenext /*String*/ ));
RDebugUtils.currentLine=108724241;
 //BA.debugLineNum = 108724241;BA.debugLine="ButtonAuthNext.Text=ShareCode.mainlayoutButtonAut";
mostCurrent._buttonauthnext.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutbuttonauthnext /*String*/ ));
RDebugUtils.currentLine=108724242;
 //BA.debugLineNum = 108724242;BA.debugLine="LabelHelpAutorizacao.Text=ShareCode.mainlayoutLab";
mostCurrent._labelhelpautorizacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelhelpautorizacao /*String*/ ));
RDebugUtils.currentLine=108724243;
 //BA.debugLineNum = 108724243;BA.debugLine="LabelAutorizacao.Text=ShareCode.mainlayoutLabelAu";
mostCurrent._labelautorizacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelautorizacao /*String*/ ));
RDebugUtils.currentLine=108724244;
 //BA.debugLineNum = 108724244;BA.debugLine="LabelCodigoInstancia.Text=ShareCode.mainlayoutLab";
mostCurrent._labelcodigoinstancia.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelcodigoinstancia /*String*/ ));
RDebugUtils.currentLine=108724245;
 //BA.debugLineNum = 108724245;BA.debugLine="LabelCodigoAutorizacao.Text=ShareCode.mainlayoutL";
mostCurrent._labelcodigoautorizacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelcodigoautorizacao /*String*/ ));
RDebugUtils.currentLine=108724246;
 //BA.debugLineNum = 108724246;BA.debugLine="LabelValidacaoLogin.Text = ShareCode.mainlayoutLa";
mostCurrent._labelvalidacaologin.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelvalidacaologin /*String*/ ));
RDebugUtils.currentLine=108724247;
 //BA.debugLineNum = 108724247;BA.debugLine="LabelValidacaoAcesso.text = ShareCode.mainlayoutL";
mostCurrent._labelvalidacaoacesso.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelvalidacaoacesso /*String*/ ));
RDebugUtils.currentLine=108724248;
 //BA.debugLineNum = 108724248;BA.debugLine="LabelCheckValidacao.text = ShareCode.mainlayoutLa";
mostCurrent._labelcheckvalidacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelcheckvalidacao /*String*/ ));
RDebugUtils.currentLine=108724249;
 //BA.debugLineNum = 108724249;BA.debugLine="LabelVerificacao.text = ShareCode.mainlayoutLabel";
mostCurrent._labelverificacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainlayoutlabelverificacao /*String*/ ));
RDebugUtils.currentLine=108724251;
 //BA.debugLineNum = 108724251;BA.debugLine="ShareCode.APP_VersionNocodeName = AppBuildVersion";
mostCurrent._sharecode._app_versionnocodename /*String*/  = _appbuildversion;
RDebugUtils.currentLine=108724252;
 //BA.debugLineNum = 108724252;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
mostCurrent._labelversion.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=108724254;
 //BA.debugLineNum = 108724254;BA.debugLine="End Sub";
return "";
}
public static String  _delete_srv_files() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "delete_srv_files", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "delete_srv_files", null));}
String _filename = "";
RDebugUtils.currentLine=108855296;
 //BA.debugLineNum = 108855296;BA.debugLine="Sub Delete_srv_Files";
RDebugUtils.currentLine=108855297;
 //BA.debugLineNum = 108855297;BA.debugLine="For Each FileName As String In File.ListFiles(Sta";
{
final anywheresoftware.b4a.BA.IterableList group1 = anywheresoftware.b4a.keywords.Common.File.ListFiles(mostCurrent._starter._internalfolder /*String*/ );
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_filename = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=108855298;
 //BA.debugLineNum = 108855298;BA.debugLine="If FileName.EndsWith(\".reqsvr\") Or FileName.Ends";
if (_filename.endsWith(".reqsvr") || _filename.endsWith(".objsvr")) { 
RDebugUtils.currentLine=108855299;
 //BA.debugLineNum = 108855299;BA.debugLine="File.Delete(Starter.InternalFolder, FileName)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._internalfolder /*String*/ ,_filename);
 };
 }
};
RDebugUtils.currentLine=108855302;
 //BA.debugLineNum = 108855302;BA.debugLine="End Sub";
return "";
}
public static String  _check_installed_date() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "check_installed_date", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "check_installed_date", null));}
RDebugUtils.currentLine=108789760;
 //BA.debugLineNum = 108789760;BA.debugLine="Sub Check_Installed_Date";
RDebugUtils.currentLine=108789763;
 //BA.debugLineNum = 108789763;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_instal";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
RDebugUtils.currentLine=108789764;
 //BA.debugLineNum = 108789764;BA.debugLine="ShareCode.Installed_Date = File.ReadString(Start";
mostCurrent._sharecode._installed_date /*String*/  = anywheresoftware.b4a.keywords.Common.File.ReadString(mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
 }else {
RDebugUtils.currentLine=108789766;
 //BA.debugLineNum = 108789766;BA.debugLine="ShareCode.Installed_Date = \"\"";
mostCurrent._sharecode._installed_date /*String*/  = "";
 };
RDebugUtils.currentLine=108789768;
 //BA.debugLineNum = 108789768;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
int _result = 0;
RDebugUtils.currentLine=110821376;
 //BA.debugLineNum = 110821376;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=110821377;
 //BA.debugLineNum = 110821377;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=110821378;
 //BA.debugLineNum = 110821378;BA.debugLine="Dim Result As Int";
_result = 0;
RDebugUtils.currentLine=110821379;
 //BA.debugLineNum = 110821379;BA.debugLine="Result = Msgbox2(ShareCode.ApplicationExit, Shar";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._applicationexit /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=110821380;
 //BA.debugLineNum = 110821380;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=110821381;
 //BA.debugLineNum = 110821381;BA.debugLine="ActivityFinish";
_activityfinish();
 };
 };
RDebugUtils.currentLine=110821384;
 //BA.debugLineNum = 110821384;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=110821385;
 //BA.debugLineNum = 110821385;BA.debugLine="End Sub";
return false;
}
public static String  _activityfinish() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activityfinish", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activityfinish", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=110755840;
 //BA.debugLineNum = 110755840;BA.debugLine="Sub ActivityFinish";
RDebugUtils.currentLine=110755841;
 //BA.debugLineNum = 110755841;BA.debugLine="CloseAllServices";
_closeallservices();
RDebugUtils.currentLine=110755842;
 //BA.debugLineNum = 110755842;BA.debugLine="Log(\"closing\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6110755842","closing",0);
RDebugUtils.currentLine=110755843;
 //BA.debugLineNum = 110755843;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=110755844;
 //BA.debugLineNum = 110755844;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(processBA);
RDebugUtils.currentLine=110755845;
 //BA.debugLineNum = 110755845;BA.debugLine="jo.RunMethod(\"finishAffinity\", Null)";
_jo.RunMethod("finishAffinity",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=110755846;
 //BA.debugLineNum = 110755846;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=110755847;
 //BA.debugLineNum = 110755847;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Log(\"Activity_Pause\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6262145","Activity_Pause",0);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="If (Starter.APP_FINE_LOCATION_ACCESS) Then";
if ((mostCurrent._starter._app_fine_location_access /*boolean*/ )) { 
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="If Not(LocationService.FusedLocationProvider1.Is";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._locationservice._fusedlocationprovider1 /*uk.co.martinpearman.b4a.fusedlocationprovider.FusedLocationProviderWrapper*/ .IsInitialized())) { 
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._locationservice.getObject()));
 };
 };
RDebugUtils.currentLine=196618;
 //BA.debugLineNum = 196618;BA.debugLine="GC.Initialize";
mostCurrent._gc._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=196619;
 //BA.debugLineNum = 196619;BA.debugLine="GC.Fire";
mostCurrent._gc._fire /*String*/ (null);
RDebugUtils.currentLine=196621;
 //BA.debugLineNum = 196621;BA.debugLine="GoStartApp";
_gostartapp();
RDebugUtils.currentLine=196623;
 //BA.debugLineNum = 196623;BA.debugLine="End Sub";
return "";
}
public static String  _gostartapp() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "gostartapp", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "gostartapp", null));}
String _ambiente = "";
xevolution.vrcg.devdemov2400.types._authorization _authdata = null;
RDebugUtils.currentLine=109510656;
 //BA.debugLineNum = 109510656;BA.debugLine="Sub GoStartApp";
RDebugUtils.currentLine=109510670;
 //BA.debugLineNum = 109510670;BA.debugLine="TimeStart.Initialize(\"TimeStart\", 40)";
_timestart.Initialize(processBA,"TimeStart",(long) (40));
RDebugUtils.currentLine=109510671;
 //BA.debugLineNum = 109510671;BA.debugLine="TimeStart.Enabled = False";
_timestart.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=109510673;
 //BA.debugLineNum = 109510673;BA.debugLine="Starter.CurrentWorkActivity = Me";
mostCurrent._starter._currentworkactivity /*Object*/  = main.getObject();
RDebugUtils.currentLine=109510675;
 //BA.debugLineNum = 109510675;BA.debugLine="SetWidgetColors";
_setwidgetcolors();
RDebugUtils.currentLine=109510677;
 //BA.debugLineNum = 109510677;BA.debugLine="AppTitle.Text = Consts.AppTitle";
mostCurrent._apptitle.setText(BA.ObjectToCharSequence(mostCurrent._consts._apptitle /*String*/ ));
RDebugUtils.currentLine=109510679;
 //BA.debugLineNum = 109510679;BA.debugLine="SelectLanguage.Add(\"Português\")";
mostCurrent._selectlanguage.Add("Português");
RDebugUtils.currentLine=109510680;
 //BA.debugLineNum = 109510680;BA.debugLine="SelectLanguage.SelectedIndex = 0";
mostCurrent._selectlanguage.setSelectedIndex((int) (0));
RDebugUtils.currentLine=109510682;
 //BA.debugLineNum = 109510682;BA.debugLine="SelectOrientation.Add(\"Orientação Landscape\")";
mostCurrent._selectorientation.Add("Orientação Landscape");
RDebugUtils.currentLine=109510683;
 //BA.debugLineNum = 109510683;BA.debugLine="SelectOrientation.Add(\"Orientação Portrait\")";
mostCurrent._selectorientation.Add("Orientação Portrait");
RDebugUtils.currentLine=109510684;
 //BA.debugLineNum = 109510684;BA.debugLine="SelectOrientation.SelectedIndex = ShareCode.DEVIC";
mostCurrent._selectorientation.setSelectedIndex(mostCurrent._sharecode._device_orientation /*int*/ );
RDebugUtils.currentLine=109510686;
 //BA.debugLineNum = 109510686;BA.debugLine="GetAuthorizationToUseDeviceResources";
_getauthorizationtousedeviceresources();
RDebugUtils.currentLine=109510687;
 //BA.debugLineNum = 109510687;BA.debugLine="Utils.SetProgressDrawableExt(mainSplashProgress,\"";
mostCurrent._utils._setprogressdrawableext /*String*/ (mostCurrent.activityBA,mostCurrent._mainsplashprogress,"TOP_BOTTOM",new int[]{mostCurrent._consts._colorwhite /*int*/ ,mostCurrent._consts._colorwhite /*int*/ },anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=109510689;
 //BA.debugLineNum = 109510689;BA.debugLine="Dim Ambiente As String = SetBuildInfo";
_ambiente = _setbuildinfo();
RDebugUtils.currentLine=109510690;
 //BA.debugLineNum = 109510690;BA.debugLine="SetEnvironment(Ambiente)";
_setenvironment(_ambiente);
RDebugUtils.currentLine=109510692;
 //BA.debugLineNum = 109510692;BA.debugLine="Public DeviceAuthorization As String = EditAuthor";
_deviceauthorization = mostCurrent._editauthorization.getText();
RDebugUtils.currentLine=109510693;
 //BA.debugLineNum = 109510693;BA.debugLine="Public DeviceInstance As String = EditInstance.te";
_deviceinstance = mostCurrent._editinstance.getText();
RDebugUtils.currentLine=109510696;
 //BA.debugLineNum = 109510696;BA.debugLine="Dim authData As Authorization = Types.MakeAuthori";
_authdata = mostCurrent._types._makeauthorization /*xevolution.vrcg.devdemov2400.types._authorization*/ (mostCurrent.activityBA,mostCurrent._editinstance.getText(),mostCurrent._editauthorization.getText(),mostCurrent._sharecode._app_version /*String*/ ,mostCurrent._sharecode._app_domain /*String*/ );
RDebugUtils.currentLine=109510697;
 //BA.debugLineNum = 109510697;BA.debugLine="getMainLogo(authData)";
_getmainlogo(_authdata);
RDebugUtils.currentLine=109510698;
 //BA.debugLineNum = 109510698;BA.debugLine="getMainLogoMini(authData)";
_getmainlogomini(_authdata);
RDebugUtils.currentLine=109510700;
 //BA.debugLineNum = 109510700;BA.debugLine="SetLogos";
_setlogos();
RDebugUtils.currentLine=109510702;
 //BA.debugLineNum = 109510702;BA.debugLine="Starter.FirstInstall = (ShareCode.APPL_CONFIRMED";
mostCurrent._starter._firstinstall /*boolean*/  = (mostCurrent._sharecode._appl_confirmed /*int*/ ==0) || (mostCurrent._sharecode._first_install /*int*/ ==0);
RDebugUtils.currentLine=109510704;
 //BA.debugLineNum = 109510704;BA.debugLine="EditUserName.Text = ShareCode.APP_LAST_USER '\"use";
mostCurrent._editusername.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._app_last_user /*String*/ ));
RDebugUtils.currentLine=109510705;
 //BA.debugLineNum = 109510705;BA.debugLine="EditPassword.Text = \"\" '\"12345678\"";
mostCurrent._editpassword.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=109510707;
 //BA.debugLineNum = 109510707;BA.debugLine="StartComsService";
_startcomsservice();
RDebugUtils.currentLine=109510708;
 //BA.debugLineNum = 109510708;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=109510709;
 //BA.debugLineNum = 109510709;BA.debugLine="SetPanelByInstallationStatus";
_setpanelbyinstallationstatus();
RDebugUtils.currentLine=109510711;
 //BA.debugLineNum = 109510711;BA.debugLine="End Sub";
return "";
}
public static String  _closeallservices() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "closeallservices", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "closeallservices", null));}
RDebugUtils.currentLine=110690304;
 //BA.debugLineNum = 110690304;BA.debugLine="Sub CloseAllServices";
RDebugUtils.currentLine=110690305;
 //BA.debugLineNum = 110690305;BA.debugLine="Try";
try {RDebugUtils.currentLine=110690306;
 //BA.debugLineNum = 110690306;BA.debugLine="CancelScheduledService(Comms)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._comms.getObject()));
RDebugUtils.currentLine=110690307;
 //BA.debugLineNum = 110690307;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._comms.getObject()));
RDebugUtils.currentLine=110690308;
 //BA.debugLineNum = 110690308;BA.debugLine="CancelScheduledService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=110690309;
 //BA.debugLineNum = 110690309;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=110690310;
 //BA.debugLineNum = 110690310;BA.debugLine="CancelScheduledService(LocationService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=110690311;
 //BA.debugLineNum = 110690311;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=110690312;
 //BA.debugLineNum = 110690312;BA.debugLine="CancelScheduledService(Logs)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._logs.getObject()));
RDebugUtils.currentLine=110690313;
 //BA.debugLineNum = 110690313;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._logs.getObject()));
RDebugUtils.currentLine=110690314;
 //BA.debugLineNum = 110690314;BA.debugLine="CancelScheduledService(Starter)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._starter.getObject()));
RDebugUtils.currentLine=110690315;
 //BA.debugLineNum = 110690315;BA.debugLine="StopService(Starter)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._starter.getObject()));
RDebugUtils.currentLine=110690316;
 //BA.debugLineNum = 110690316;BA.debugLine="CancelScheduledService(UpdateService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._updateservice.getObject()));
RDebugUtils.currentLine=110690317;
 //BA.debugLineNum = 110690317;BA.debugLine="StopService(UpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._updateservice.getObject()));
RDebugUtils.currentLine=110690318;
 //BA.debugLineNum = 110690318;BA.debugLine="CancelScheduledService(UserService)";
anywheresoftware.b4a.keywords.Common.CancelScheduledService(processBA,(Object)(mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=110690319;
 //BA.debugLineNum = 110690319;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(mostCurrent._userservice.getObject()));
 } 
       catch (Exception e17) {
			processBA.setLastException(e17);RDebugUtils.currentLine=110690321;
 //BA.debugLineNum = 110690321;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6110690321",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=110690322;
 //BA.debugLineNum = 110690322;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=110690324;
 //BA.debugLineNum = 110690324;BA.debugLine="End Sub";
return "";
}
public static String  _activitynewlogin() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activitynewlogin", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activitynewlogin", null));}
RDebugUtils.currentLine=110886912;
 //BA.debugLineNum = 110886912;BA.debugLine="Sub ActivityNewLogin";
RDebugUtils.currentLine=110886913;
 //BA.debugLineNum = 110886913;BA.debugLine="mainSplashImageEffect.Visible = False";
mostCurrent._mainsplashimageeffect.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110886914;
 //BA.debugLineNum = 110886914;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=110886915;
 //BA.debugLineNum = 110886915;BA.debugLine="Panel_Login.Visible = True";
mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=110886916;
 //BA.debugLineNum = 110886916;BA.debugLine="Starter.CurrentFlowPosition = 3";
mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
RDebugUtils.currentLine=110886917;
 //BA.debugLineNum = 110886917;BA.debugLine="End Sub";
return "";
}
public static String  _resetpanels() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "resetpanels", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "resetpanels", null));}
RDebugUtils.currentLine=110362624;
 //BA.debugLineNum = 110362624;BA.debugLine="Sub ResetPanels";
RDebugUtils.currentLine=110362625;
 //BA.debugLineNum = 110362625;BA.debugLine="Panel_Config.Visible = False";
mostCurrent._panel_config.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110362626;
 //BA.debugLineNum = 110362626;BA.debugLine="Panel_Authorization.Visible = False";
mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110362627;
 //BA.debugLineNum = 110362627;BA.debugLine="Panel_Verification.Visible = False";
mostCurrent._panel_verification.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110362628;
 //BA.debugLineNum = 110362628;BA.debugLine="Panel_Login.Visible = False";
mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110362629;
 //BA.debugLineNum = 110362629;BA.debugLine="Panel_Login_Validation.Visible = False";
mostCurrent._panel_login_validation.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110362630;
 //BA.debugLineNum = 110362630;BA.debugLine="PanelDownloadInicial.Visible = False";
mostCurrent._paneldownloadinicial.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110362631;
 //BA.debugLineNum = 110362631;BA.debugLine="End Sub";
return "";
}
public static void  _butcancelqrcode_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcancelqrcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butcancelqrcode_click", null); return;}
ResumableSub_butCancelQRCode_Click rsub = new ResumableSub_butCancelQRCode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butCancelQRCode_Click extends BA.ResumableSub {
public ResumableSub_butCancelQRCode_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=112525313;
 //BA.debugLineNum = 112525313;BA.debugLine="QRCodeReader.stopScan";
parent.mostCurrent._qrcodereader.stopScan();
RDebugUtils.currentLine=112525314;
 //BA.debugLineNum = 112525314;BA.debugLine="QRCodeReader.Visible = False";
parent.mostCurrent._qrcodereader.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112525315;
 //BA.debugLineNum = 112525315;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "butcancelqrcode_click"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=112525316;
 //BA.debugLineNum = 112525316;BA.debugLine="QRCodePanel.Visible = False";
parent.mostCurrent._qrcodepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112525317;
 //BA.debugLineNum = 112525317;BA.debugLine="QRCodeKeyReceived = \"\"";
parent.mostCurrent._qrcodekeyreceived = "";
RDebugUtils.currentLine=112525318;
 //BA.debugLineNum = 112525318;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _butsaveqrcode_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsaveqrcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butsaveqrcode_click", null); return;}
ResumableSub_butSaveQRCode_Click rsub = new ResumableSub_butSaveQRCode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butSaveQRCode_Click extends BA.ResumableSub {
public ResumableSub_butSaveQRCode_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
String _kui = "";
String _kua = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112590849;
 //BA.debugLineNum = 112590849;BA.debugLine="If (Utils.NNE(QRCodeKeyReceived)) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._qrcodekeyreceived))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=112590850;
 //BA.debugLineNum = 112590850;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=112590851;
 //BA.debugLineNum = 112590851;BA.debugLine="JSON1.Initialize(QRCodeKeyReceived)";
_json1.Initialize(parent.mostCurrent._qrcodekeyreceived);
RDebugUtils.currentLine=112590852;
 //BA.debugLineNum = 112590852;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=112590853;
 //BA.debugLineNum = 112590853;BA.debugLine="Dim kui As String = MapJSON.Get(\"kui\")";
_kui = BA.ObjectToString(_mapjson.Get((Object)("kui")));
RDebugUtils.currentLine=112590854;
 //BA.debugLineNum = 112590854;BA.debugLine="Dim kua As String = MapJSON.Get(\"kua\")";
_kua = BA.ObjectToString(_mapjson.Get((Object)("kua")));
RDebugUtils.currentLine=112590856;
 //BA.debugLineNum = 112590856;BA.debugLine="EditAuthorization.Text = kua";
parent.mostCurrent._editauthorization.setText(BA.ObjectToCharSequence(_kua));
RDebugUtils.currentLine=112590857;
 //BA.debugLineNum = 112590857;BA.debugLine="EditInstance.Text = kui";
parent.mostCurrent._editinstance.setText(BA.ObjectToCharSequence(_kui));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=112590859;
 //BA.debugLineNum = 112590859;BA.debugLine="QRCodeReader.stopScan";
parent.mostCurrent._qrcodereader.stopScan();
RDebugUtils.currentLine=112590860;
 //BA.debugLineNum = 112590860;BA.debugLine="QRCodeReader.Visible = False";
parent.mostCurrent._qrcodereader.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112590861;
 //BA.debugLineNum = 112590861;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "butsaveqrcode_click"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=112590862;
 //BA.debugLineNum = 112590862;BA.debugLine="QRCodePanel.Visible = False";
parent.mostCurrent._qrcodepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112590863;
 //BA.debugLineNum = 112590863;BA.debugLine="butSaveQRCode.Enabled = False";
parent.mostCurrent._butsaveqrcode.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112590864;
 //BA.debugLineNum = 112590864;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonappnetwork_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonappnetwork_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonappnetwork_click", null));}
RDebugUtils.currentLine=111738880;
 //BA.debugLineNum = 111738880;BA.debugLine="Sub ButtonAppNetwork_Click";
RDebugUtils.currentLine=111738882;
 //BA.debugLineNum = 111738882;BA.debugLine="MsgboxAsync(ShareCode.ConnectionBreak, ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._connectionbreak /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalnotetitle /*String*/ ),processBA);
RDebugUtils.currentLine=111738884;
 //BA.debugLineNum = 111738884;BA.debugLine="End Sub";
return "";
}
public static String  _buttonauthback_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonauthback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonauthback_click", null));}
RDebugUtils.currentLine=111083520;
 //BA.debugLineNum = 111083520;BA.debugLine="Sub ButtonAuthBack_Click";
RDebugUtils.currentLine=111083521;
 //BA.debugLineNum = 111083521;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111083522;
 //BA.debugLineNum = 111083522;BA.debugLine="Panel_Config.Visible = True";
mostCurrent._panel_config.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111083523;
 //BA.debugLineNum = 111083523;BA.debugLine="Starter.CurrentFlowPosition = 0";
mostCurrent._starter._currentflowposition /*int*/  = (int) (0);
RDebugUtils.currentLine=111083524;
 //BA.debugLineNum = 111083524;BA.debugLine="End Sub";
return "";
}
public static String  _buttonauthnext_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonauthnext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonauthnext_click", null));}
xevolution.vrcg.devdemov2400.types._authorization _authdata = null;
RDebugUtils.currentLine=111017984;
 //BA.debugLineNum = 111017984;BA.debugLine="Sub ButtonAuthNext_Click";
RDebugUtils.currentLine=111017985;
 //BA.debugLineNum = 111017985;BA.debugLine="Log(\"ButtonAuthNext_Click\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6111017985","ButtonAuthNext_Click",0);
RDebugUtils.currentLine=111017986;
 //BA.debugLineNum = 111017986;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
if (mostCurrent._sharecode._app_working_local /*boolean*/ ) { 
RDebugUtils.currentLine=111017987;
 //BA.debugLineNum = 111017987;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoConnec";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._authorizationdata_noconnection_validate /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 }else {
RDebugUtils.currentLine=111017989;
 //BA.debugLineNum = 111017989;BA.debugLine="If Not(Utils.isNullOrEmpty(EditInstance.text)) A";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,mostCurrent._editinstance.getText())) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,mostCurrent._editauthorization.getText()))) { 
RDebugUtils.currentLine=111017991;
 //BA.debugLineNum = 111017991;BA.debugLine="Dim authData As Authorization = Types.MakeAutho";
_authdata = mostCurrent._types._makeauthorization /*xevolution.vrcg.devdemov2400.types._authorization*/ (mostCurrent.activityBA,mostCurrent._editinstance.getText(),mostCurrent._editauthorization.getText(),mostCurrent._sharecode._app_version /*String*/ ,mostCurrent._sharecode._app_domain /*String*/ );
RDebugUtils.currentLine=111017992;
 //BA.debugLineNum = 111017992;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111017993;
 //BA.debugLineNum = 111017993;BA.debugLine="Panel_Verification.Visible = True";
mostCurrent._panel_verification.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111017994;
 //BA.debugLineNum = 111017994;BA.debugLine="SetAuthorization(authData)";
_setauthorization(_authdata);
 }else {
RDebugUtils.currentLine=111017996;
 //BA.debugLineNum = 111017996;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoData,";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._authorizationdata_nodata /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 };
 };
RDebugUtils.currentLine=111017999;
 //BA.debugLineNum = 111017999;BA.debugLine="End Sub";
return "";
}
public static void  _setauthorization(xevolution.vrcg.devdemov2400.types._authorization _authdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setauthorization", false))
	 {Debug.delegate(mostCurrent.activityBA, "setauthorization", new Object[] {_authdata}); return;}
ResumableSub_SetAuthorization rsub = new ResumableSub_SetAuthorization(null,_authdata);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetAuthorization extends BA.ResumableSub {
public ResumableSub_SetAuthorization(xevolution.vrcg.devdemov2400.main parent,xevolution.vrcg.devdemov2400.types._authorization _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
xevolution.vrcg.devdemov2400.main parent;
xevolution.vrcg.devdemov2400.types._authorization _authdata;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _addr = "";
String _resultstr = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _active = 0;
int _registered = 0;
boolean _activeandnotregistered = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;
int _i = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111607817;
 //BA.debugLineNum = 111607817;BA.debugLine="Dim params As Map = CreateAuthParams(authData.Ins";
_params = new anywheresoftware.b4a.objects.collections.Map();
_params = _createauthparams(_authdata.Instance /*String*/ ,_authdata.Authorization /*String*/ ,_authdata.Version /*String*/ );
RDebugUtils.currentLine=111607819;
 //BA.debugLineNum = 111607819;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111607820;
 //BA.debugLineNum = 111607820;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111607821;
 //BA.debugLineNum = 111607821;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111607823;
 //BA.debugLineNum = 111607823;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=111607824;
 //BA.debugLineNum = 111607824;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=111607826;
 //BA.debugLineNum = 111607826;BA.debugLine="ShareCode.APP_DOMAIN = \"demo\"";
parent.mostCurrent._sharecode._app_domain /*String*/  = "demo";
RDebugUtils.currentLine=111607827;
 //BA.debugLineNum = 111607827;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_D";
parent.mostCurrent._sharecode._app_url /*String*/  = "https://"+parent.mostCurrent._sharecode._app_domain /*String*/ +("."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/");
RDebugUtils.currentLine=111607828;
 //BA.debugLineNum = 111607828;BA.debugLine="Dim addr As String = ShareCode.APP_URL & ShareCod";
_addr = parent.mostCurrent._sharecode._app_url /*String*/ +parent.mostCurrent._sharecode._app_confirmlink /*String*/ ;
RDebugUtils.currentLine=111607830;
 //BA.debugLineNum = 111607830;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607830","************************************************************",0);
RDebugUtils.currentLine=111607831;
 //BA.debugLineNum = 111607831;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APP_DOMAIN} \"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607831",(" 		INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=111607832;
 //BA.debugLineNum = 111607832;BA.debugLine="Log($\" 		URL : ${ShareCode.APP_URL} \"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607832",(" 		URL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_url /*String*/ ))+" "),0);
RDebugUtils.currentLine=111607833;
 //BA.debugLineNum = 111607833;BA.debugLine="Log($\" 		addr : ${addr} \"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607833",(" 		addr : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_addr))+" "),0);
RDebugUtils.currentLine=111607834;
 //BA.debugLineNum = 111607834;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607834","************************************************************",0);
RDebugUtils.currentLine=111607836;
 //BA.debugLineNum = 111607836;BA.debugLine="Job.PostString(addr, data )";
_job._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=111607837;
 //BA.debugLineNum = 111607837;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=111607842;
 //BA.debugLineNum = 111607842;BA.debugLine="ShareCode.FirstInstallBD = 0";
parent.mostCurrent._sharecode._firstinstallbd /*int*/  = (int) (0);
RDebugUtils.currentLine=111607845;
 //BA.debugLineNum = 111607845;BA.debugLine="ShareCode.newreturn = 1";
parent.mostCurrent._sharecode._newreturn /*int*/  = (int) (1);
RDebugUtils.currentLine=111607849;
 //BA.debugLineNum = 111607849;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setauthorization"), (Object)(_job));
this.state = 49;
return;
case 49:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111607851;
 //BA.debugLineNum = 111607851;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 48;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 41;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111607852;
 //BA.debugLineNum = 111607852;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607852",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=111607855;
 //BA.debugLineNum = 111607855;BA.debugLine="Dim ResultStr As String = Job.GetString";
_resultstr = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=111607856;
 //BA.debugLineNum = 111607856;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\") Th";
if (true) break;

case 4:
//if
this.state = 7;
if (((parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_resultstr,(long) (1))).equals("["))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=111607857;
 //BA.debugLineNum = 111607857;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrFun";
_resultstr = parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_resultstr,(int) (2),(int) (parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_resultstr)-1)));
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=111607860;
 //BA.debugLineNum = 111607860;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=111607861;
 //BA.debugLineNum = 111607861;BA.debugLine="JSON1.Initialize(ResultStr)";
_json1.Initialize(_resultstr);
RDebugUtils.currentLine=111607862;
 //BA.debugLineNum = 111607862;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=111607863;
 //BA.debugLineNum = 111607863;BA.debugLine="Dim Active As Int = MapJSON.Get(\"active\")";
_active = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("active"))));
RDebugUtils.currentLine=111607865;
 //BA.debugLineNum = 111607865;BA.debugLine="Try";
if (true) break;

case 8:
//try
this.state = 39;
this.catchState = 38;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 38;
RDebugUtils.currentLine=111607866;
 //BA.debugLineNum = 111607866;BA.debugLine="If (Active = 1) Then";
if (true) break;

case 11:
//if
this.state = 36;
if ((_active==1)) { 
this.state = 13;
}else {
this.state = 35;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=111607867;
 //BA.debugLineNum = 111607867;BA.debugLine="Dim Registered As Int = MapJSON.Get(\"registere";
_registered = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("registered"))));
RDebugUtils.currentLine=111607868;
 //BA.debugLineNum = 111607868;BA.debugLine="ShareCode.APP_TOKEN = MapJSON.Get(\"_token\")";
parent.mostCurrent._sharecode._app_token /*String*/  = BA.ObjectToString(_mapjson.Get((Object)("_token")));
RDebugUtils.currentLine=111607869;
 //BA.debugLineNum = 111607869;BA.debugLine="ShareCode.APP_DOMAIN = MapJSON.Get(\"subdomain\"";
parent.mostCurrent._sharecode._app_domain /*String*/  = BA.ObjectToString(_mapjson.Get((Object)("subdomain")));
RDebugUtils.currentLine=111607871;
 //BA.debugLineNum = 111607871;BA.debugLine="If Not(ShareCode.APP_DOMAIN = authData.SubDoma";
if (true) break;

case 14:
//if
this.state = 17;
if (anywheresoftware.b4a.keywords.Common.Not((parent.mostCurrent._sharecode._app_domain /*String*/ ).equals(_authdata.SubDomain /*String*/ ))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=111607872;
 //BA.debugLineNum = 111607872;BA.debugLine="authData.SubDomain = ShareCode.APP_DOMAIN";
_authdata.SubDomain /*String*/  = parent.mostCurrent._sharecode._app_domain /*String*/ ;
RDebugUtils.currentLine=111607873;
 //BA.debugLineNum = 111607873;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.A";
parent.mostCurrent._sharecode._app_url /*String*/  = "https://"+parent.mostCurrent._sharecode._app_domain /*String*/ +("."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/");
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=111607876;
 //BA.debugLineNum = 111607876;BA.debugLine="Log(\"*****************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607876","************************************************************",0);
RDebugUtils.currentLine=111607877;
 //BA.debugLineNum = 111607877;BA.debugLine="Log($\" 		REGISTER : ${ShareCode.APP_DOMAIN} \"$";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607877",(" 		REGISTER : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=111607878;
 //BA.debugLineNum = 111607878;BA.debugLine="Log(\"*****************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607878","************************************************************",0);
RDebugUtils.currentLine=111607880;
 //BA.debugLineNum = 111607880;BA.debugLine="Log(ShareCode.APP_TOKEN)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607880",parent.mostCurrent._sharecode._app_token /*String*/ ,0);
RDebugUtils.currentLine=111607882;
 //BA.debugLineNum = 111607882;BA.debugLine="Dim ActiveAndNotRegistered As Boolean = (Activ";
_activeandnotregistered = (_active==1) && (_registered==0);
RDebugUtils.currentLine=111607883;
 //BA.debugLineNum = 111607883;BA.debugLine="If ActiveAndNotRegistered Then";
if (true) break;

case 18:
//if
this.state = 33;
if (_activeandnotregistered) { 
this.state = 20;
}else {
this.state = 26;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=111607885;
 //BA.debugLineNum = 111607885;BA.debugLine="WaitToConfirm = False";
parent._waittoconfirm = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=111607887;
 //BA.debugLineNum = 111607887;BA.debugLine="ShareCode.APPL_CONFIRMED = 1";
parent.mostCurrent._sharecode._appl_confirmed /*int*/  = (int) (1);
RDebugUtils.currentLine=111607888;
 //BA.debugLineNum = 111607888;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"A";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","APPL_CONFIRMED",parent.mostCurrent._sharecode._appl_confirmed /*int*/ );
RDebugUtils.currentLine=111607889;
 //BA.debugLineNum = 111607889;BA.debugLine="ShareCode.APPL_ACCOUNT = ShareCode.APP_DOMAIN";
parent.mostCurrent._sharecode._appl_account /*String*/  = parent.mostCurrent._sharecode._app_domain /*String*/ ;
RDebugUtils.currentLine=111607890;
 //BA.debugLineNum = 111607890;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APPL_ACCOUNT",parent.mostCurrent._sharecode._appl_account /*String*/ );
RDebugUtils.currentLine=111607891;
 //BA.debugLineNum = 111607891;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=111607893;
 //BA.debugLineNum = 111607893;BA.debugLine="prc_SaveToJSON(authData)";
_prc_savetojson(_authdata);
RDebugUtils.currentLine=111607894;
 //BA.debugLineNum = 111607894;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setauthorization"),(int) (200));
this.state = 50;
return;
case 50:
//C
this.state = 21;
;
RDebugUtils.currentLine=111607895;
 //BA.debugLineNum = 111607895;BA.debugLine="getMainLogo(authData)";
_getmainlogo(_authdata);
RDebugUtils.currentLine=111607896;
 //BA.debugLineNum = 111607896;BA.debugLine="getMainLogoMini(authData)";
_getmainlogomini(_authdata);
RDebugUtils.currentLine=111607905;
 //BA.debugLineNum = 111607905;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111607907;
 //BA.debugLineNum = 111607907;BA.debugLine="Dim res As ResumableSub = FirstInstallComplet";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _firstinstallcompleteprocedure();
RDebugUtils.currentLine=111607908;
 //BA.debugLineNum = 111607908;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setauthorization"), _res);
this.state = 51;
return;
case 51:
//C
this.state = 21;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=111607910;
 //BA.debugLineNum = 111607910;BA.debugLine="If Not(result)Then";
if (true) break;

case 21:
//if
this.state = 24;
if (anywheresoftware.b4a.keywords.Common.Not(_result)) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=111607911;
 //BA.debugLineNum = 111607911;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCo";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=111607912;
 //BA.debugLineNum = 111607912;BA.debugLine="Starter.APP_IN_EXECUTION = False";
parent.mostCurrent._starter._app_in_execution /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 24:
//C
this.state = 33;
;
RDebugUtils.currentLine=111607915;
 //BA.debugLineNum = 111607915;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111607916;
 //BA.debugLineNum = 111607916;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111607917;
 //BA.debugLineNum = 111607917;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
RDebugUtils.currentLine=111607918;
 //BA.debugLineNum = 111607918;BA.debugLine="DBStructures.getConfigApp(ShareCode.APP_TOKEN";
parent.mostCurrent._dbstructures._getconfigapp /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_token /*String*/ );
RDebugUtils.currentLine=111607919;
 //BA.debugLineNum = 111607919;BA.debugLine="Starter.APP_IN_EXECUTION = True";
parent.mostCurrent._starter._app_in_execution /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=111607921;
 //BA.debugLineNum = 111607921;BA.debugLine="If (Registered = 1) Then";
if (true) break;

case 27:
//if
this.state = 32;
if ((_registered==1)) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=111607922;
 //BA.debugLineNum = 111607922;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_Regi";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_registered /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=111607924;
 //BA.debugLineNum = 111607924;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_Inva";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_invalid /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=111607926;
 //BA.debugLineNum = 111607926;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setauthorization"),(int) (100));
this.state = 52;
return;
case 52:
//C
this.state = 33;
;
RDebugUtils.currentLine=111607927;
 //BA.debugLineNum = 111607927;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111607928;
 //BA.debugLineNum = 111607928;BA.debugLine="Panel_Authorization.Visible = True";
parent.mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111607929;
 //BA.debugLineNum = 111607929;BA.debugLine="Starter.CurrentFlowPosition = 1";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (1);
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=111607932;
 //BA.debugLineNum = 111607932;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_Invali";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_invalid /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=111607933;
 //BA.debugLineNum = 111607933;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setauthorization"),(int) (100));
this.state = 53;
return;
case 53:
//C
this.state = 36;
;
RDebugUtils.currentLine=111607934;
 //BA.debugLineNum = 111607934;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111607935;
 //BA.debugLineNum = 111607935;BA.debugLine="Panel_Authorization.Visible = True";
parent.mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111607936;
 //BA.debugLineNum = 111607936;BA.debugLine="Starter.CurrentFlowPosition = 1";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (1);
 if (true) break;

case 36:
//C
this.state = 39;
;
 if (true) break;

case 38:
//C
this.state = 39;
this.catchState = 0;
RDebugUtils.currentLine=111607939;
 //BA.debugLineNum = 111607939;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111607939",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=111607940;
 //BA.debugLineNum = 111607940;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=111607941;
 //BA.debugLineNum = 111607941;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoServe";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_noserver /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=111607942;
 //BA.debugLineNum = 111607942;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setauthorization"),(int) (100));
this.state = 54;
return;
case 54:
//C
this.state = 39;
;
RDebugUtils.currentLine=111607943;
 //BA.debugLineNum = 111607943;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111607944;
 //BA.debugLineNum = 111607944;BA.debugLine="Panel_Authorization.Visible = True";
parent.mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111607945;
 //BA.debugLineNum = 111607945;BA.debugLine="Starter.CurrentFlowPosition = 1";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (1);
 if (true) break;
if (true) break;

case 39:
//C
this.state = 48;
this.catchState = 0;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=111607950;
 //BA.debugLineNum = 111607950;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AuthorizationDa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_noserver /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=111607951;
 //BA.debugLineNum = 111607951;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 42:
//if
this.state = 47;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=111607952;
 //BA.debugLineNum = 111607952;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111607953;
 //BA.debugLineNum = 111607953;BA.debugLine="Panel_Authorization.Visible = True";
parent.mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111607954;
 //BA.debugLineNum = 111607954;BA.debugLine="Starter.CurrentFlowPosition = 1";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (1);
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=111607956;
 //BA.debugLineNum = 111607956;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=111607960;
 //BA.debugLineNum = 111607960;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=111607962;
 //BA.debugLineNum = 111607962;BA.debugLine="End Sub";
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
public static void  _buttonloginenter_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonloginenter_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "buttonloginenter_click", null); return;}
ResumableSub_ButtonLoginEnter_Click rsub = new ResumableSub_ButtonLoginEnter_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonLoginEnter_Click extends BA.ResumableSub {
public ResumableSub_ButtonLoginEnter_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
int _i = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=110624769;
 //BA.debugLineNum = 110624769;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
if (true) break;

case 1:
//if
this.state = 26;
if (parent.mostCurrent._sharecode._app_working_local /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=110624770;
 //BA.debugLineNum = 110624770;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.OffLineMessage_";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._offlinemessage_confirm /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,parent.mostCurrent._sharecode._option_no /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=110624771;
 //BA.debugLineNum = 110624771;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 4:
//if
this.state = 17;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=110624785;
 //BA.debugLineNum = 110624785;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
this.state = 14;
}else {
this.state = 16;
}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=110624773;
 //BA.debugLineNum = 110624773;BA.debugLine="If Not(Utils.isNullOrEmpty(EditUserName.text))";
if (true) break;

case 7:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._editusername.getText())) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._editpassword.getText()))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=110624774;
 //BA.debugLineNum = 110624774;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=110624775;
 //BA.debugLineNum = 110624775;BA.debugLine="Panel_Login_Validation.Visible = True";
parent.mostCurrent._panel_login_validation.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=110624776;
 //BA.debugLineNum = 110624776;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
RDebugUtils.currentLine=110624777;
 //BA.debugLineNum = 110624777;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "buttonloginenter_click"),(int) (500));
this.state = 27;
return;
case 27:
//C
this.state = 12;
;
RDebugUtils.currentLine=110624779;
 //BA.debugLineNum = 110624779;BA.debugLine="SetLogin(EditUserName.text, EditPassword.text)";
_setlogin(parent.mostCurrent._editusername.getText(),parent.mostCurrent._editpassword.getText());
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=110624783;
 //BA.debugLineNum = 110624783;BA.debugLine="MsgboxAsync(ShareCode.Login_NoData, ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._login_nodata /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 12:
//C
this.state = 17;
;
 if (true) break;

case 14:
//C
this.state = 17;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=110624788;
 //BA.debugLineNum = 110624788;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 17:
//C
this.state = 26;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=110624791;
 //BA.debugLineNum = 110624791;BA.debugLine="If Not(Utils.isNullOrEmpty(EditUserName.text)) A";
if (true) break;

case 20:
//if
this.state = 25;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._editusername.getText())) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._editpassword.getText()))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=110624792;
 //BA.debugLineNum = 110624792;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=110624793;
 //BA.debugLineNum = 110624793;BA.debugLine="Panel_Login_Validation.Visible = True";
parent.mostCurrent._panel_login_validation.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=110624794;
 //BA.debugLineNum = 110624794;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "buttonloginenter_click"),(int) (500));
this.state = 28;
return;
case 28:
//C
this.state = 25;
;
RDebugUtils.currentLine=110624795;
 //BA.debugLineNum = 110624795;BA.debugLine="Starter.CurrentFlowPosition = 3123";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3123);
RDebugUtils.currentLine=110624797;
 //BA.debugLineNum = 110624797;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=110624798;
 //BA.debugLineNum = 110624798;BA.debugLine="Panel_Login_Validation.Visible = True";
parent.mostCurrent._panel_login_validation.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=110624799;
 //BA.debugLineNum = 110624799;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "buttonloginenter_click"),(int) (500));
this.state = 29;
return;
case 29:
//C
this.state = 25;
;
RDebugUtils.currentLine=110624800;
 //BA.debugLineNum = 110624800;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
RDebugUtils.currentLine=110624802;
 //BA.debugLineNum = 110624802;BA.debugLine="SetLogin(EditUserName.text, EditPassword.text)";
_setlogin(parent.mostCurrent._editusername.getText(),parent.mostCurrent._editpassword.getText());
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=110624805;
 //BA.debugLineNum = 110624805;BA.debugLine="MsgboxAsync(ShareCode.Login_NoData, ShareCode.G";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._login_nodata /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=110624808;
 //BA.debugLineNum = 110624808;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _setlogin(String _uname,String _upass) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setlogin", false))
	 {Debug.delegate(mostCurrent.activityBA, "setlogin", new Object[] {_uname,_upass}); return;}
ResumableSub_SetLogin rsub = new ResumableSub_SetLogin(null,_uname,_upass);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetLogin extends BA.ResumableSub {
public ResumableSub_SetLogin(xevolution.vrcg.devdemov2400.main parent,String _uname,String _upass) {
this.parent = parent;
this._uname = _uname;
this._upass = _upass;
}
xevolution.vrcg.devdemov2400.main parent;
String _uname;
String _upass;
boolean _ok = false;
boolean _callagain = false;
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sqlscript = "";
int _result = 0;
String _userauthparams = "";
String _confuser = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _resultstr = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _active = 0;
boolean _forcepassword = false;
anywheresoftware.b4a.objects.collections.Map _userin = null;
int _pwdrequest = 0;
String _tagcode = "";
String _profile_tagcode = "";
String _warehouse = "";
int _available = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rrpac = null;
boolean _finito = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112328715;
 //BA.debugLineNum = 112328715;BA.debugLine="Dim OK As Boolean = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112328716;
 //BA.debugLineNum = 112328716;BA.debugLine="Dim CallAgain As Boolean = False";
_callagain = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112328717;
 //BA.debugLineNum = 112328717;BA.debugLine="DBStructures.getCurrentConfigValues";
parent.mostCurrent._dbstructures._getcurrentconfigvalues /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=112328719;
 //BA.debugLineNum = 112328719;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_D";
parent.mostCurrent._sharecode._app_url /*String*/  = "https://"+parent.mostCurrent._sharecode._app_domain /*String*/ +("."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/");
RDebugUtils.currentLine=112328721;
 //BA.debugLineNum = 112328721;BA.debugLine="If ((uname <> \"\") And (upass <> \"\")) Then";
if (true) break;

case 1:
//if
this.state = 60;
if ((((_uname).equals("") == false) && ((_upass).equals("") == false))) { 
this.state = 3;
}else {
this.state = 59;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=112328723;
 //BA.debugLineNum = 112328723;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
if (true) break;

case 4:
//if
this.state = 57;
if (parent.mostCurrent._sharecode._app_working_local /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=112328725;
 //BA.debugLineNum = 112328725;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=112328726;
 //BA.debugLineNum = 112328726;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=112328730;
 //BA.debugLineNum = 112328730;BA.debugLine="Dim SQLScript As String = $\"SELECT ifnull(b.pro";
_sqlscript = ("SELECT ifnull(b.profile_tagcode, '') AS profile_tagcode, ifnull(b.email,'') AS email, a.*,\n"+"										ifnull(c.warehouse,'') AS warehouse, c.vehicleplate, c.vehicle, c.photo, b.available\n"+"										from dta_technicals AS a \n"+"										LEFT JOIN aut_users AS b ON (b.tagcode=a.user_tagcode)\n"+"										left join aut_users_details as c on (c.user_tagcode=a.user_tagcode)\n"+"										where a.username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"' and a.keypad='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_upass))+"'");
RDebugUtils.currentLine=112328736;
 //BA.debugLineNum = 112328736;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQLScrip";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlscript)));
RDebugUtils.currentLine=112328738;
 //BA.debugLineNum = 112328738;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 7:
//if
this.state = 18;
if (_record.getRowCount()>0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=112328739;
 //BA.debugLineNum = 112328739;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=112328740;
 //BA.debugLineNum = 112328740;BA.debugLine="SetUserInfo(Record, uname)";
_setuserinfo(_record,_uname);
RDebugUtils.currentLine=112328741;
 //BA.debugLineNum = 112328741;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=112328744;
 //BA.debugLineNum = 112328744;BA.debugLine="Msgbox2Async(ShareCode.LoginMessage_NOTOK, Sha";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginmessage_notok /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112328745;
 //BA.debugLineNum = 112328745;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"), null);
this.state = 70;
return;
case 70:
//C
this.state = 12;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=112328746;
 //BA.debugLineNum = 112328746;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=112328747;
 //BA.debugLineNum = 112328747;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328748;
 //BA.debugLineNum = 112328748;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=112328749;
 //BA.debugLineNum = 112328749;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112328750;
 //BA.debugLineNum = 112328750;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=112328752;
 //BA.debugLineNum = 112328752;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 57;
;
RDebugUtils.currentLine=112328755;
 //BA.debugLineNum = 112328755;BA.debugLine="Record.Close";
_record.Close();
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=112328757;
 //BA.debugLineNum = 112328757;BA.debugLine="Private UserAuthParams As String = CreateUserAu";
_userauthparams = _createuserauthparams(_uname,_upass);
RDebugUtils.currentLine=112328758;
 //BA.debugLineNum = 112328758;BA.debugLine="Dim ConfUser As String = ShareCode.APP_URL & Sh";
_confuser = parent.mostCurrent._sharecode._app_url /*String*/ +parent.mostCurrent._sharecode._app_confirmuser /*String*/ ;
RDebugUtils.currentLine=112328760;
 //BA.debugLineNum = 112328760;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=112328761;
 //BA.debugLineNum = 112328761;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=112328762;
 //BA.debugLineNum = 112328762;BA.debugLine="Job.PostString(ConfUser, UserAuthParams )";
_job._poststring /*String*/ (null,_confuser,_userauthparams);
RDebugUtils.currentLine=112328763;
 //BA.debugLineNum = 112328763;BA.debugLine="Job.GetRequest.SetContentType(\"application/json";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=112328765;
 //BA.debugLineNum = 112328765;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"), (Object)(_job));
this.state = 71;
return;
case 71:
//C
this.state = 21;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=112328766;
 //BA.debugLineNum = 112328766;BA.debugLine="If Job.Success Then";
if (true) break;

case 21:
//if
this.state = 56;
if (_job._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 49;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=112328768;
 //BA.debugLineNum = 112328768;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328768",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=112328769;
 //BA.debugLineNum = 112328769;BA.debugLine="Dim ResultStr As String = Job.GetString";
_resultstr = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=112328770;
 //BA.debugLineNum = 112328770;BA.debugLine="Log(\"=========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328770","================================================================",0);
RDebugUtils.currentLine=112328771;
 //BA.debugLineNum = 112328771;BA.debugLine="Log(\"                          AUTENTICAÇÃO";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328771","                          AUTENTICAÇÃO                          ",0);
RDebugUtils.currentLine=112328772;
 //BA.debugLineNum = 112328772;BA.debugLine="Log(\"=========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328772","================================================================",0);
RDebugUtils.currentLine=112328773;
 //BA.debugLineNum = 112328773;BA.debugLine="Log(ResultStr)";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328773",_resultstr,0);
RDebugUtils.currentLine=112328774;
 //BA.debugLineNum = 112328774;BA.debugLine="Log(\"=========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328774","================================================================",0);
RDebugUtils.currentLine=112328776;
 //BA.debugLineNum = 112328776;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=112328778;
 //BA.debugLineNum = 112328778;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\")";
if (true) break;

case 24:
//if
this.state = 27;
if (((parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_resultstr,(long) (1))).equals("["))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=112328779;
 //BA.debugLineNum = 112328779;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.StrF";
_resultstr = parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_resultstr,(int) (2),(int) (parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_resultstr)-1)));
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=112328782;
 //BA.debugLineNum = 112328782;BA.debugLine="JSON1.Initialize(ResultStr)";
_json1.Initialize(_resultstr);
RDebugUtils.currentLine=112328783;
 //BA.debugLineNum = 112328783;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=112328784;
 //BA.debugLineNum = 112328784;BA.debugLine="Dim Active As Int = MapJSON.Get(\"status\")";
_active = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("status"))));
RDebugUtils.currentLine=112328792;
 //BA.debugLineNum = 112328792;BA.debugLine="ShareCode.UserLanguage = MapJSON.Get(\"ulang\")";
parent.mostCurrent._sharecode._userlanguage /*String*/  = BA.ObjectToString(_mapjson.Get((Object)("ulang")));
RDebugUtils.currentLine=112328794;
 //BA.debugLineNum = 112328794;BA.debugLine="Log(\"=========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328794","================================================",0);
RDebugUtils.currentLine=112328795;
 //BA.debugLineNum = 112328795;BA.debugLine="Log(\"LINGUAGEM DEFINIDA NO UTILIZADOR\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328795","LINGUAGEM DEFINIDA NO UTILIZADOR",0);
RDebugUtils.currentLine=112328796;
 //BA.debugLineNum = 112328796;BA.debugLine="Log(\"=========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328796","================================================",0);
RDebugUtils.currentLine=112328797;
 //BA.debugLineNum = 112328797;BA.debugLine="Log($\"${uname}:${ShareCode.UserLanguage}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328797",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._userlanguage /*String*/ ))+""),0);
RDebugUtils.currentLine=112328798;
 //BA.debugLineNum = 112328798;BA.debugLine="Log(\"=========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112328798","================================================",0);
RDebugUtils.currentLine=112328801;
 //BA.debugLineNum = 112328801;BA.debugLine="Dim ForcePassword As Boolean = False";
_forcepassword = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112328802;
 //BA.debugLineNum = 112328802;BA.debugLine="ForcePassword = False";
_forcepassword = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112328804;
 //BA.debugLineNum = 112328804;BA.debugLine="ForceResetPassword(ForcePassword, uname)";
_forceresetpassword(_forcepassword,_uname);
RDebugUtils.currentLine=112328807;
 //BA.debugLineNum = 112328807;BA.debugLine="If (Active = 1) Then";
if (true) break;

case 28:
//if
this.state = 47;
if ((_active==1)) { 
this.state = 30;
}else {
this.state = 40;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=112328809;
 //BA.debugLineNum = 112328809;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_1\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_1",main.getObject());
RDebugUtils.currentLine=112328810;
 //BA.debugLineNum = 112328810;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"),(int) (250));
this.state = 72;
return;
case 72:
//C
this.state = 31;
;
RDebugUtils.currentLine=112328812;
 //BA.debugLineNum = 112328812;BA.debugLine="CreateOrUpdateLocalUser(MapJSON, uname)";
_createorupdatelocaluser(_mapjson,_uname);
RDebugUtils.currentLine=112328814;
 //BA.debugLineNum = 112328814;BA.debugLine="Dim UserIn As Map = MapJSON.Get(\"user\")";
_userin = new anywheresoftware.b4a.objects.collections.Map();
_userin = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("user"))));
RDebugUtils.currentLine=112328815;
 //BA.debugLineNum = 112328815;BA.debugLine="Dim pwdrequest As Int = UserIn.Get(\"pwdreques";
_pwdrequest = (int)(BA.ObjectToNumber(_userin.Get((Object)("pwdrequest"))));
RDebugUtils.currentLine=112328816;
 //BA.debugLineNum = 112328816;BA.debugLine="Dim Tagcode As String = UserIn.Get(\"tagcode\")";
_tagcode = BA.ObjectToString(_userin.Get((Object)("tagcode")));
RDebugUtils.currentLine=112328817;
 //BA.debugLineNum = 112328817;BA.debugLine="Dim profile_tagcode As String = UserIn.Get(\"p";
_profile_tagcode = BA.ObjectToString(_userin.Get((Object)("profile_tagcode")));
RDebugUtils.currentLine=112328818;
 //BA.debugLineNum = 112328818;BA.debugLine="Dim WareHouse As String = Utils.IfNullOrEmpty";
_warehouse = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_userin.Get((Object)("warehouse"))),"");
RDebugUtils.currentLine=112328819;
 //BA.debugLineNum = 112328819;BA.debugLine="Dim Available As Int = UserIn.Get(\"available\"";
_available = (int)(BA.ObjectToNumber(_userin.Get((Object)("available"))));
RDebugUtils.currentLine=112328822;
 //BA.debugLineNum = 112328822;BA.debugLine="If (pwdrequest = 0) Then";
if (true) break;

case 31:
//if
this.state = 38;
if ((_pwdrequest==0)) { 
this.state = 33;
}else 
{RDebugUtils.currentLine=112328863;
 //BA.debugLineNum = 112328863;BA.debugLine="else If (pwdrequest = 1) Then";
if ((_pwdrequest==1)) { 
this.state = 35;
}else 
{RDebugUtils.currentLine=112328869;
 //BA.debugLineNum = 112328869;BA.debugLine="else If (pwdrequest = 2) Then";
if ((_pwdrequest==2)) { 
this.state = 37;
}}}
if (true) break;

case 33:
//C
this.state = 38;
RDebugUtils.currentLine=112328824;
 //BA.debugLineNum = 112328824;BA.debugLine="ShareCode.SESS_User = Tagcode";
parent.mostCurrent._sharecode._sess_user /*String*/  = _tagcode;
RDebugUtils.currentLine=112328825;
 //BA.debugLineNum = 112328825;BA.debugLine="ShareCode.SESS_UserName = UserIn.Get(\"name\")";
parent.mostCurrent._sharecode._sess_username /*String*/  = BA.ObjectToString(_userin.Get((Object)("name")));
RDebugUtils.currentLine=112328826;
 //BA.debugLineNum = 112328826;BA.debugLine="ShareCode.SESS_UWDUKEY = UserIn.Get(\"usernam";
parent.mostCurrent._sharecode._sess_uwdukey /*String*/  = BA.ObjectToString(_userin.Get((Object)("username")));
RDebugUtils.currentLine=112328827;
 //BA.debugLineNum = 112328827;BA.debugLine="ShareCode.SESS_UserProfile = profile_tagcode";
parent.mostCurrent._sharecode._sess_userprofile /*String*/  = _profile_tagcode;
RDebugUtils.currentLine=112328829;
 //BA.debugLineNum = 112328829;BA.debugLine="ShareCode.SESS_BLOCK_OPTIONS = False '(UserI";
parent.mostCurrent._sharecode._sess_block_options /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112328831;
 //BA.debugLineNum = 112328831;BA.debugLine="ShareCode.SESS_OPER_User = ShareCode.SESS_Us";
parent.mostCurrent._sharecode._sess_oper_user /*String*/  = parent.mostCurrent._sharecode._sess_user /*String*/ ;
RDebugUtils.currentLine=112328832;
 //BA.debugLineNum = 112328832;BA.debugLine="ShareCode.SESS_OPER_UserName = ShareCode.SES";
parent.mostCurrent._sharecode._sess_oper_username /*String*/  = parent.mostCurrent._sharecode._sess_username /*String*/ ;
RDebugUtils.currentLine=112328833;
 //BA.debugLineNum = 112328833;BA.debugLine="ShareCode.SESS_OPER_UWDUKEY = ShareCode.SESS";
parent.mostCurrent._sharecode._sess_oper_uwdukey /*String*/  = parent.mostCurrent._sharecode._sess_uwdukey /*String*/ ;
RDebugUtils.currentLine=112328835;
 //BA.debugLineNum = 112328835;BA.debugLine="ShareCode.SESS_WareHouse = WareHouse";
parent.mostCurrent._sharecode._sess_warehouse /*String*/  = _warehouse;
RDebugUtils.currentLine=112328836;
 //BA.debugLineNum = 112328836;BA.debugLine="ShareCode.USR_STATE = Available";
parent.mostCurrent._sharecode._usr_state /*int*/  = _available;
RDebugUtils.currentLine=112328837;
 //BA.debugLineNum = 112328837;BA.debugLine="ShareCode.APP_LAST_USER = ShareCode.SESS_UWD";
parent.mostCurrent._sharecode._app_last_user /*String*/  = parent.mostCurrent._sharecode._sess_uwdukey /*String*/ ;
RDebugUtils.currentLine=112328839;
 //BA.debugLineNum = 112328839;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"L";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","LAST_USER",parent.mostCurrent._sharecode._app_last_user /*String*/ );
RDebugUtils.currentLine=112328840;
 //BA.debugLineNum = 112328840;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=112328847;
 //BA.debugLineNum = 112328847;BA.debugLine="SetUserLanguage";
_setuserlanguage();
RDebugUtils.currentLine=112328853;
 //BA.debugLineNum = 112328853;BA.debugLine="CreateLoginsLog";
_createloginslog();
RDebugUtils.currentLine=112328855;
 //BA.debugLineNum = 112328855;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328857;
 //BA.debugLineNum = 112328857;BA.debugLine="Dim rrpac As ResumableSub = getLoginMainLogo";
_rrpac = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rrpac = _getloginmainlogo();
RDebugUtils.currentLine=112328858;
 //BA.debugLineNum = 112328858;BA.debugLine="Wait For(rrpac) Complete (Finito As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"), _rrpac);
this.state = 73;
return;
case 73:
//C
this.state = 38;
_finito = (Boolean) result[0];
;
RDebugUtils.currentLine=112328860;
 //BA.debugLineNum = 112328860;BA.debugLine="Dim rrpac As ResumableSub = getLoginMainLogo";
_rrpac = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rrpac = _getloginmainlogomini();
RDebugUtils.currentLine=112328861;
 //BA.debugLineNum = 112328861;BA.debugLine="Wait For(rrpac) Complete (Finito As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"), _rrpac);
this.state = 74;
return;
case 74:
//C
this.state = 38;
_finito = (Boolean) result[0];
;
 if (true) break;

case 35:
//C
this.state = 38;
RDebugUtils.currentLine=112328864;
 //BA.debugLineNum = 112328864;BA.debugLine="MsgboxAsync(ShareCode.LoginResetExists, Shar";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginresetexists /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=112328865;
 //BA.debugLineNum = 112328865;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328866;
 //BA.debugLineNum = 112328866;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=112328867;
 //BA.debugLineNum = 112328867;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112328868;
 //BA.debugLineNum = 112328868;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=112328871;
 //BA.debugLineNum = 112328871;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 38:
//C
this.state = 47;
;
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=112328876;
 //BA.debugLineNum = 112328876;BA.debugLine="Msgbox2Async(ShareCode.LoginMessage_NOTOK, Sh";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginmessage_notok /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112328877;
 //BA.debugLineNum = 112328877;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"), null);
this.state = 75;
return;
case 75:
//C
this.state = 41;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=112328878;
 //BA.debugLineNum = 112328878;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 41:
//if
this.state = 46;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
RDebugUtils.currentLine=112328879;
 //BA.debugLineNum = 112328879;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328880;
 //BA.debugLineNum = 112328880;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=112328881;
 //BA.debugLineNum = 112328881;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112328882;
 //BA.debugLineNum = 112328882;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=112328884;
 //BA.debugLineNum = 112328884;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 56;
;
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=112328889;
 //BA.debugLineNum = 112328889;BA.debugLine="Msgbox2Async(ShareCode.LoginServerError, Share";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginservererror /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112328890;
 //BA.debugLineNum = 112328890;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"), null);
this.state = 76;
return;
case 76:
//C
this.state = 50;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=112328891;
 //BA.debugLineNum = 112328891;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 50:
//if
this.state = 55;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 55;
RDebugUtils.currentLine=112328892;
 //BA.debugLineNum = 112328892;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328893;
 //BA.debugLineNum = 112328893;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328894;
 //BA.debugLineNum = 112328894;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=112328895;
 //BA.debugLineNum = 112328895;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112328896;
 //BA.debugLineNum = 112328896;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=112328898;
 //BA.debugLineNum = 112328898;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 55:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=112328901;
 //BA.debugLineNum = 112328901;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=112328904;
 //BA.debugLineNum = 112328904;BA.debugLine="MsgboxAsync(ShareCode.AllFieldsMandatoryMessage,";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._allfieldsmandatorymessage /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=112328905;
 //BA.debugLineNum = 112328905;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112328906;
 //BA.debugLineNum = 112328906;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=112328907;
 //BA.debugLineNum = 112328907;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112328908;
 //BA.debugLineNum = 112328908;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
 if (true) break;
;
RDebugUtils.currentLine=112328912;
 //BA.debugLineNum = 112328912;BA.debugLine="If Not(CallAgain) Then";

case 60:
//if
this.state = 69;
if (anywheresoftware.b4a.keywords.Common.Not(_callagain)) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=112328913;
 //BA.debugLineNum = 112328913;BA.debugLine="If (OK = True) Then";
if (true) break;

case 63:
//if
this.state = 68;
if ((_ok==anywheresoftware.b4a.keywords.Common.True)) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
RDebugUtils.currentLine=112328914;
 //BA.debugLineNum = 112328914;BA.debugLine="prc_LoginClose";
_prc_loginclose();
RDebugUtils.currentLine=112328915;
 //BA.debugLineNum = 112328915;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setlogin"),(int) (500));
this.state = 77;
return;
case 77:
//C
this.state = 68;
;
RDebugUtils.currentLine=112328916;
 //BA.debugLineNum = 112328916;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=112328917;
 //BA.debugLineNum = 112328917;BA.debugLine="TimeStart.Enabled = True";
parent._timestart.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=112328919;
 //BA.debugLineNum = 112328919;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
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
RDebugUtils.currentLine=112328924;
 //BA.debugLineNum = 112328924;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonloginexit_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonloginexit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonloginexit_click", null));}
RDebugUtils.currentLine=110559232;
 //BA.debugLineNum = 110559232;BA.debugLine="Sub ButtonLoginExit_Click";
RDebugUtils.currentLine=110559233;
 //BA.debugLineNum = 110559233;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=110559234;
 //BA.debugLineNum = 110559234;BA.debugLine="End Sub";
return "";
}
public static String  _buttonloginreset_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonloginreset_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonloginreset_click", null));}
RDebugUtils.currentLine=110493696;
 //BA.debugLineNum = 110493696;BA.debugLine="Sub ButtonLoginReset_Click";
RDebugUtils.currentLine=110493698;
 //BA.debugLineNum = 110493698;BA.debugLine="End Sub";
return "";
}
public static String  _buttonwelcomenext_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonwelcomenext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonwelcomenext_click", null));}
RDebugUtils.currentLine=110428160;
 //BA.debugLineNum = 110428160;BA.debugLine="Sub ButtonWelcomeNext_Click";
RDebugUtils.currentLine=110428166;
 //BA.debugLineNum = 110428166;BA.debugLine="If Not(ShareCode.DEVICE_ORIENTATION = SelectOrien";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._device_orientation /*int*/ ==mostCurrent._selectorientation.getSelectedIndex())) { 
RDebugUtils.currentLine=110428167;
 //BA.debugLineNum = 110428167;BA.debugLine="ShareCode.DEVICE_ORIENTATION = SelectOrientation";
mostCurrent._sharecode._device_orientation /*int*/  = mostCurrent._selectorientation.getSelectedIndex();
RDebugUtils.currentLine=110428168;
 //BA.debugLineNum = 110428168;BA.debugLine="Device.SetScreenOrientation(SelectOrientation.Se";
_device.SetScreenOrientation(processBA,mostCurrent._selectorientation.getSelectedIndex());
 }else {
RDebugUtils.currentLine=110428170;
 //BA.debugLineNum = 110428170;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
if (mostCurrent._sharecode._app_working_local /*boolean*/ ) { 
RDebugUtils.currentLine=110428171;
 //BA.debugLineNum = 110428171;BA.debugLine="MsgboxAsync(ShareCode.AuthorizationData_NoConne";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._authorizationdata_noconnection_validate /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 }else {
RDebugUtils.currentLine=110428173;
 //BA.debugLineNum = 110428173;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=110428174;
 //BA.debugLineNum = 110428174;BA.debugLine="Panel_Authorization.Visible = True";
mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=110428175;
 //BA.debugLineNum = 110428175;BA.debugLine="Starter.CurrentFlowPosition = 1";
mostCurrent._starter._currentflowposition /*int*/  = (int) (1);
 };
 };
RDebugUtils.currentLine=110428178;
 //BA.debugLineNum = 110428178;BA.debugLine="End Sub";
return "";
}
public static boolean  _canrequestpackageinstalls() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "canrequestpackageinstalls", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "canrequestpackageinstalls", null));}
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _packagemanager = null;
RDebugUtils.currentLine=109903872;
 //BA.debugLineNum = 109903872;BA.debugLine="Private Sub CanRequestPackageInstalls As Boolean";
RDebugUtils.currentLine=109903873;
 //BA.debugLineNum = 109903873;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=109903874;
 //BA.debugLineNum = 109903874;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(processBA);
RDebugUtils.currentLine=109903875;
 //BA.debugLineNum = 109903875;BA.debugLine="Dim PackageManager As JavaObject = ctxt.RunMethod";
_packagemanager = new anywheresoftware.b4j.object.JavaObject();
_packagemanager = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_ctxt.RunMethod("getPackageManager",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=109903876;
 //BA.debugLineNum = 109903876;BA.debugLine="Return PackageManager.RunMethod(\"canRequestPackag";
if (true) return BA.ObjectToBoolean(_packagemanager.RunMethod("canRequestPackageInstalls",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=109903877;
 //BA.debugLineNum = 109903877;BA.debugLine="End Sub";
return false;
}
public static void  _check_firstinstall_in_progress() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "check_firstinstall_in_progress", false))
	 {Debug.delegate(mostCurrent.activityBA, "check_firstinstall_in_progress", null); return;}
ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS rsub = new ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS extends BA.ResumableSub {
public ResumableSub_Check_FIRSTINSTALL_IN_PROGRESS(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112852997;
 //BA.debugLineNum = 112852997;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTALL";
if (true) break;

case 1:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=112853000;
 //BA.debugLineNum = 112853000;BA.debugLine="Msgbox2Async($\"O sistema detectou uma instalação";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("O sistema detectou uma instalação anterior incompleta !"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"A instalação vai Reiniciar.")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112853001;
 //BA.debugLineNum = 112853001;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "check_firstinstall_in_progress"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=112853002;
 //BA.debugLineNum = 112853002;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=112853008;
 //BA.debugLineNum = 112853008;BA.debugLine="File.writestring(Starter.SharedFolder,\"FIRSTINSTA";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS",parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=112853009;
 //BA.debugLineNum = 112853009;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkappversion() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkappversion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checkappversion", null));}
ResumableSub_CheckAppVersion rsub = new ResumableSub_CheckAppVersion(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckAppVersion extends BA.ResumableSub {
public ResumableSub_CheckAppVersion(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
String _serveraddress = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
anywheresoftware.b4a.objects.collections.JSONParser _json2 = null;
anywheresoftware.b4a.objects.collections.Map _mapjsondata = null;
String _filename = "";
String _version = "";
String _releasedate = "";
String _duedate = "";
int _remove = 0;
String _appl_auth = "";
String _appl_instance = "";
int _res = 0;
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109576194;
 //BA.debugLineNum = 109576194;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"),(int) (100));
this.state = 27;
return;
case 27:
//C
this.state = 1;
;
RDebugUtils.currentLine=109576195;
 //BA.debugLineNum = 109576195;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/device/update");
RDebugUtils.currentLine=109576196;
 //BA.debugLineNum = 109576196;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109576196",_serveraddress,0);
RDebugUtils.currentLine=109576197;
 //BA.debugLineNum = 109576197;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=109576198;
 //BA.debugLineNum = 109576198;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=109576199;
 //BA.debugLineNum = 109576199;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=109576200;
 //BA.debugLineNum = 109576200;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=109576201;
 //BA.debugLineNum = 109576201;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=109576202;
 //BA.debugLineNum = 109576202;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._versiontagcode));
RDebugUtils.currentLine=109576203;
 //BA.debugLineNum = 109576203;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(parent._deviceauthorization));
RDebugUtils.currentLine=109576204;
 //BA.debugLineNum = 109576204;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._deviceinstance));
RDebugUtils.currentLine=109576205;
 //BA.debugLineNum = 109576205;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._devicebrand));
RDebugUtils.currentLine=109576206;
 //BA.debugLineNum = 109576206;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._devicemodel));
RDebugUtils.currentLine=109576207;
 //BA.debugLineNum = 109576207;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._devicemacaddress));
RDebugUtils.currentLine=109576208;
 //BA.debugLineNum = 109576208;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=109576210;
 //BA.debugLineNum = 109576210;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=109576211;
 //BA.debugLineNum = 109576211;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=109576213;
 //BA.debugLineNum = 109576213;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=109576215;
 //BA.debugLineNum = 109576215;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=109576216;
 //BA.debugLineNum = 109576216;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=109576217;
 //BA.debugLineNum = 109576217;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=109576218;
 //BA.debugLineNum = 109576218;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=109576220;
 //BA.debugLineNum = 109576220;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"), (Object)(_job));
this.state = 28;
return;
case 28:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=109576221;
 //BA.debugLineNum = 109576221;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 26;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=109576222;
 //BA.debugLineNum = 109576222;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 25;
this.catchState = 24;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 24;
RDebugUtils.currentLine=109576223;
 //BA.debugLineNum = 109576223;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=109576224;
 //BA.debugLineNum = 109576224;BA.debugLine="JSON1.Initialize(Job.GetString())";
_json1.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=109576225;
 //BA.debugLineNum = 109576225;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=109576230;
 //BA.debugLineNum = 109576230;BA.debugLine="Dim JSON2 As JSONParser";
_json2 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=109576231;
 //BA.debugLineNum = 109576231;BA.debugLine="JSON2.Initialize(MapJSON.Get(\"data\"))";
_json2.Initialize(BA.ObjectToString(_mapjson.Get((Object)("data"))));
RDebugUtils.currentLine=109576232;
 //BA.debugLineNum = 109576232;BA.debugLine="Dim MapJSONData As Map = JSON2.NextObject";
_mapjsondata = new anywheresoftware.b4a.objects.collections.Map();
_mapjsondata = _json2.NextObject();
RDebugUtils.currentLine=109576234;
 //BA.debugLineNum = 109576234;BA.debugLine="Dim filename As String = MapJSONData.Get(\"filen";
_filename = BA.ObjectToString(_mapjsondata.Get((Object)("filename")));
RDebugUtils.currentLine=109576235;
 //BA.debugLineNum = 109576235;BA.debugLine="Dim version As String = MapJSONData.Get(\"versio";
_version = BA.ObjectToString(_mapjsondata.Get((Object)("version")));
RDebugUtils.currentLine=109576236;
 //BA.debugLineNum = 109576236;BA.debugLine="Dim releaseDate As String = MapJSONData.Get(\"re";
_releasedate = BA.ObjectToString(_mapjsondata.Get((Object)("release_date")));
RDebugUtils.currentLine=109576237;
 //BA.debugLineNum = 109576237;BA.debugLine="Dim dueDate As String = MapJSONData.Get(\"due_da";
_duedate = BA.ObjectToString(_mapjsondata.Get((Object)("due_date")));
RDebugUtils.currentLine=109576238;
 //BA.debugLineNum = 109576238;BA.debugLine="Dim remove As Int = MapJSONData.Get(\"remove\")";
_remove = (int)(BA.ObjectToNumber(_mapjsondata.Get((Object)("remove"))));
RDebugUtils.currentLine=109576239;
 //BA.debugLineNum = 109576239;BA.debugLine="Dim  APPL_AUTH As String = Utils.SelectFieldFro";
_appl_auth = parent.mostCurrent._utils._selectfieldfromlocalsqlwrkconfigtable /*String*/ (mostCurrent.activityBA,"authorization");
RDebugUtils.currentLine=109576240;
 //BA.debugLineNum = 109576240;BA.debugLine="Dim  APPL_INSTANCE As String = Utils.SelectFiel";
_appl_instance = parent.mostCurrent._utils._selectfieldfromlocalsqlwrkconfigtable /*String*/ (mostCurrent.activityBA,"instance");
RDebugUtils.currentLine=109576242;
 //BA.debugLineNum = 109576242;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"),(int) (100));
this.state = 29;
return;
case 29:
//C
this.state = 7;
;
RDebugUtils.currentLine=109576244;
 //BA.debugLineNum = 109576244;BA.debugLine="If DateTime.DateParse(DateTime.Date(DateTime.No";
if (true) break;

case 7:
//if
this.state = 22;
if (anywheresoftware.b4a.keywords.Common.DateTime.DateParse(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))<=anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_duedate)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=109576259;
 //BA.debugLineNum = 109576259;BA.debugLine="Else If DateTime.DateParse(DateTime.Date(DateTi";
if (anywheresoftware.b4a.keywords.Common.DateTime.DateParse(anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))>anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_duedate)) { 
this.state = 15;
}}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=109576245;
 //BA.debugLineNum = 109576245;BA.debugLine="Msgbox2Async(\"Existe uma versão mais recente d";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Existe uma versão mais recente da aplicação. Deseja Actualizar?"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=109576246;
 //BA.debugLineNum = 109576246;BA.debugLine="Wait For Msgbox_Result (Res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"), null);
this.state = 30;
return;
case 30:
//C
this.state = 10;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=109576247;
 //BA.debugLineNum = 109576247;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=109576249;
 //BA.debugLineNum = 109576249;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APPL_AUTH",_appl_auth);
RDebugUtils.currentLine=109576250;
 //BA.debugLineNum = 109576250;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APPL_INSTANCE",_appl_instance);
RDebugUtils.currentLine=109576251;
 //BA.debugLineNum = 109576251;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"R";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","RESET_APPLICATION",(int) (1));
RDebugUtils.currentLine=109576253;
 //BA.debugLineNum = 109576253;BA.debugLine="DeleteLocalDatabase(remove)";
_deletelocaldatabase(_remove);
RDebugUtils.currentLine=109576255;
 //BA.debugLineNum = 109576255;BA.debugLine="Wait For (DownloadAPK(filename)) Complete (Re";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"), _downloadapk(_filename));
this.state = 31;
return;
case 31:
//C
this.state = 13;
_result = (Boolean) result[0];
;
 if (true) break;

case 13:
//C
this.state = 22;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=109576261;
 //BA.debugLineNum = 109576261;BA.debugLine="Msgbox2Async(ShareCode.AvisoNovoAPK, ShareCode";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisonovoapk /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=109576262;
 //BA.debugLineNum = 109576262;BA.debugLine="Wait For Msgbox_Result (Res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"), null);
this.state = 32;
return;
case 32:
//C
this.state = 16;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=109576263;
 //BA.debugLineNum = 109576263;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=109576265;
 //BA.debugLineNum = 109576265;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APPL_AUTH",_appl_auth);
RDebugUtils.currentLine=109576266;
 //BA.debugLineNum = 109576266;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"AP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APPL_INSTANCE",_appl_instance);
RDebugUtils.currentLine=109576267;
 //BA.debugLineNum = 109576267;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"R";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","RESET_APPLICATION",(int) (1));
RDebugUtils.currentLine=109576269;
 //BA.debugLineNum = 109576269;BA.debugLine="DeleteLocalDatabase(remove)";
_deletelocaldatabase(_remove);
RDebugUtils.currentLine=109576271;
 //BA.debugLineNum = 109576271;BA.debugLine="Wait For (DownloadAPK(filename)) Complete (Re";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkappversion"), _downloadapk(_filename));
this.state = 33;
return;
case 33:
//C
this.state = 21;
_result = (Boolean) result[0];
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=109576273;
 //BA.debugLineNum = 109576273;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 25;
;
 if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
RDebugUtils.currentLine=109576279;
 //BA.debugLineNum = 109576279;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109576279",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=109576280;
 //BA.debugLineNum = 109576280;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=109576282;
 //BA.debugLineNum = 109576282;BA.debugLine="Log(Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109576282",_job._errormessage /*String*/ ,0);
RDebugUtils.currentLine=109576283;
 //BA.debugLineNum = 109576283;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=109576284;
 //BA.debugLineNum = 109576284;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=109576285;
 //BA.debugLineNum = 109576285;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=109576289;
 //BA.debugLineNum = 109576289;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109576289",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=109576290;
 //BA.debugLineNum = 109576290;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=109576291;
 //BA.debugLineNum = 109576291;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=109576292;
 //BA.debugLineNum = 109576292;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=109576293;
 //BA.debugLineNum = 109576293;BA.debugLine="End Sub";
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
public static String  _deletelocaldatabase(int _remove) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deletelocaldatabase", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "deletelocaldatabase", new Object[] {_remove}));}
RDebugUtils.currentLine=109641728;
 //BA.debugLineNum = 109641728;BA.debugLine="Sub DeleteLocalDatabase(remove As Int)";
RDebugUtils.currentLine=109641730;
 //BA.debugLineNum = 109641730;BA.debugLine="If(remove = 1) Then";
if ((_remove==1)) { 
RDebugUtils.currentLine=109641732;
 //BA.debugLineNum = 109641732;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, \"o";
if ((anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,"orion.db"))) { 
RDebugUtils.currentLine=109641733;
 //BA.debugLineNum = 109641733;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, \"ori";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,"orion.db");
 };
RDebugUtils.currentLine=109641736;
 //BA.debugLineNum = 109641736;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, \"e";
if ((anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,"evolutioncheck.db3"))) { 
RDebugUtils.currentLine=109641737;
 //BA.debugLineNum = 109641737;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, \"evo";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,"evolutioncheck.db3");
 };
RDebugUtils.currentLine=109641740;
 //BA.debugLineNum = 109641740;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, \"w";
if ((anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,"worker.db"))) { 
RDebugUtils.currentLine=109641741;
 //BA.debugLineNum = 109641741;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, \"wor";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,"worker.db");
 };
 };
RDebugUtils.currentLine=109641746;
 //BA.debugLineNum = 109641746;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadapk(String _filename) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadapk", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadapk", new Object[] {_filename}));}
ResumableSub_DownloadAPK rsub = new ResumableSub_DownloadAPK(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadAPK extends BA.ResumableSub {
public ResumableSub_DownloadAPK(xevolution.vrcg.devdemov2400.main parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.main parent;
String _filename;
xevolution.vrcg.devdemov2400.httpjob _job = null;
boolean _result = false;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109772802;
 //BA.debugLineNum = 109772802;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=109772803;
 //BA.debugLineNum = 109772803;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=109772804;
 //BA.debugLineNum = 109772804;BA.debugLine="Wait For (CheckInstallationRequirements) Complete";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadapk"), _checkinstallationrequirements());
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=109772806;
 //BA.debugLineNum = 109772806;BA.debugLine="If Result Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=109772807;
 //BA.debugLineNum = 109772807;BA.debugLine="ProgressDialogShow(ShareCode.AvisoDownloadAPK)";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisodownloadapk /*String*/ ));
RDebugUtils.currentLine=109772808;
 //BA.debugLineNum = 109772808;BA.debugLine="Job.Download($\"${Consts.AppWebSiteLink}/deliver/";
_job._download /*String*/ (null,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._consts._appwebsitelink /*String*/ ))+"/deliver/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""));
RDebugUtils.currentLine=109772810;
 //BA.debugLineNum = 109772810;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadapk"), (Object)(_job));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=109772811;
 //BA.debugLineNum = 109772811;BA.debugLine="If Job.Success = True Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=109772813;
 //BA.debugLineNum = 109772813;BA.debugLine="Dim out As  OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=109772814;
 //BA.debugLineNum = 109772814;BA.debugLine="out = File.OpenOutput(Starter.Provider.SharedFo";
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=109772815;
 //BA.debugLineNum = 109772815;BA.debugLine="File.Copy2(Job.GetInputStream,out)";
anywheresoftware.b4a.keywords.Common.File.Copy2((java.io.InputStream)(_job._getinputstream /*anywheresoftware.b4a.objects.streams.File.InputStreamWrapper*/ (null).getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=109772816;
 //BA.debugLineNum = 109772816;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=109772818;
 //BA.debugLineNum = 109772818;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=109772819;
 //BA.debugLineNum = 109772819;BA.debugLine="SendInstallIntent(Filename)";
_sendinstallintent(_filename);
RDebugUtils.currentLine=109772820;
 //BA.debugLineNum = 109772820;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=109772821;
 //BA.debugLineNum = 109772821;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=109772824;
 //BA.debugLineNum = 109772824;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=109772827;
 //BA.debugLineNum = 109772827;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109772827",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=109772828;
 //BA.debugLineNum = 109772828;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=109772829;
 //BA.debugLineNum = 109772829;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=109772830;
 //BA.debugLineNum = 109772830;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=109772832;
 //BA.debugLineNum = 109772832;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkdevicespecificparameters(boolean _sp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkdevicespecificparameters", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checkdevicespecificparameters", new Object[] {_sp}));}
ResumableSub_checkDeviceSpecificParameters rsub = new ResumableSub_checkDeviceSpecificParameters(null,_sp);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_checkDeviceSpecificParameters extends BA.ResumableSub {
public ResumableSub_checkDeviceSpecificParameters(xevolution.vrcg.devdemov2400.main parent,boolean _sp) {
this.parent = parent;
this._sp = _sp;
}
xevolution.vrcg.devdemov2400.main parent;
boolean _sp;
String _marca = "";
String _modelo = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=108920834;
 //BA.debugLineNum = 108920834;BA.debugLine="ShareCode.DEVICE_BRAND = Device.Manufacturer";
parent.mostCurrent._sharecode._device_brand /*String*/  = parent._device.getManufacturer();
RDebugUtils.currentLine=108920835;
 //BA.debugLineNum = 108920835;BA.debugLine="ShareCode.DEVICE_MODEL = Device.Model";
parent.mostCurrent._sharecode._device_model /*String*/  = parent._device.getModel();
RDebugUtils.currentLine=108920836;
 //BA.debugLineNum = 108920836;BA.debugLine="ShareCode.DEVICE_TYPE = Device.Product";
parent.mostCurrent._sharecode._device_type /*String*/  = parent._device.getProduct();
RDebugUtils.currentLine=108920838;
 //BA.debugLineNum = 108920838;BA.debugLine="Dim MARCA As String = ShareCode.DEVICE_BRAND.ToUp";
_marca = parent.mostCurrent._sharecode._device_brand /*String*/ .toUpperCase();
RDebugUtils.currentLine=108920839;
 //BA.debugLineNum = 108920839;BA.debugLine="Dim MODELO As String = ShareCode.DEVICE_MODEL.ToU";
_modelo = parent.mostCurrent._sharecode._device_model /*String*/ .toUpperCase();
RDebugUtils.currentLine=108920841;
 //BA.debugLineNum = 108920841;BA.debugLine="Select Case MARCA";
if (true) break;

case 1:
//select
this.state = 16;
switch (BA.switchObjectToInt(_marca,"LENOVO","SAMSUNG","HUAWEI","ALCATEL")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
case 3: {
this.state = 13;
if (true) break;
}
default: {
this.state = 15;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=108920843;
 //BA.debugLineNum = 108920843;BA.debugLine="If MODELO = \"TB-7504X\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_modelo).equals("TB-7504X")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=108920844;
 //BA.debugLineNum = 108920844;BA.debugLine="ShareCode.DEVICE_ORIENTATION = 1";
parent.mostCurrent._sharecode._device_orientation /*int*/  = (int) (1);
RDebugUtils.currentLine=108920845;
 //BA.debugLineNum = 108920845;BA.debugLine="Device.SetScreenOrientation(1)";
parent._device.SetScreenOrientation(processBA,(int) (1));
RDebugUtils.currentLine=108920846;
 //BA.debugLineNum = 108920846;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_O";
parent._device.SetScreenOrientation(processBA,parent.mostCurrent._sharecode._device_orientation /*int*/ );
 if (true) break;

case 7:
//C
this.state = 16;
;
 if (true) break;

case 9:
//C
this.state = 16;
 if (true) break;

case 11:
//C
this.state = 16;
 if (true) break;

case 13:
//C
this.state = 16;
 if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=108920858;
 //BA.debugLineNum = 108920858;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=108920859;
 //BA.debugLineNum = 108920859;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _checkif_files_isgreaterthanzero(int _sqlfilestotal) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkif_files_isgreaterthanzero", false))
	 {Debug.delegate(mostCurrent.activityBA, "checkif_files_isgreaterthanzero", new Object[] {_sqlfilestotal}); return;}
ResumableSub_CheckIf_files_IsGreaterThanZero rsub = new ResumableSub_CheckIf_files_IsGreaterThanZero(null,_sqlfilestotal);
rsub.resume(processBA, null);
}
public static class ResumableSub_CheckIf_files_IsGreaterThanZero extends BA.ResumableSub {
public ResumableSub_CheckIf_files_IsGreaterThanZero(xevolution.vrcg.devdemov2400.main parent,int _sqlfilestotal) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
}
xevolution.vrcg.devdemov2400.main parent;
int _sqlfilestotal;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112984065;
 //BA.debugLineNum = 112984065;BA.debugLine="If SqlFilesTotal = 0 Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_sqlfilestotal==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=112984067;
 //BA.debugLineNum = 112984067;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_insta";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=112984068;
 //BA.debugLineNum = 112984068;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_install";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
RDebugUtils.currentLine=112984069;
 //BA.debugLineNum = 112984069;BA.debugLine="ShareCode.Installed_Date = \"\"";
parent.mostCurrent._sharecode._installed_date /*String*/  = "";
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=112984072;
 //BA.debugLineNum = 112984072;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALAÇÃ";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=112984073;
 //BA.debugLineNum = 112984073;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkif_files_isgreaterthanzero"), null);
this.state = 13;
return;
case 13:
//C
this.state = 8;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=112984074;
 //BA.debugLineNum = 112984074;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=112984075;
 //BA.debugLineNum = 112984075;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=112984078;
 //BA.debugLineNum = 112984078;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _checkif_sqlfilestotal_isequaltozero(int _sqlfilestotal) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkif_sqlfilestotal_isequaltozero", false))
	 {Debug.delegate(mostCurrent.activityBA, "checkif_sqlfilestotal_isequaltozero", new Object[] {_sqlfilestotal}); return;}
ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero rsub = new ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero(null,_sqlfilestotal);
rsub.resume(processBA, null);
}
public static class ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero extends BA.ResumableSub {
public ResumableSub_CheckIf_SqlFilesTotal_IsEqualToZero(xevolution.vrcg.devdemov2400.main parent,int _sqlfilestotal) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
}
xevolution.vrcg.devdemov2400.main parent;
int _sqlfilestotal;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113246209;
 //BA.debugLineNum = 113246209;BA.debugLine="If SqlFilesTotal = 0 Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_sqlfilestotal==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=113246211;
 //BA.debugLineNum = 113246211;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_insta";
if (true) break;

case 4:
//if
this.state = 7;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=113246212;
 //BA.debugLineNum = 113246212;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_install";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
RDebugUtils.currentLine=113246213;
 //BA.debugLineNum = 113246213;BA.debugLine="ShareCode.Installed_Date = \"\"";
parent.mostCurrent._sharecode._installed_date /*String*/  = "";
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=113246216;
 //BA.debugLineNum = 113246216;BA.debugLine="Msgbox2Async($\"UM OU MAIS FICHEIROS DE INSTALAÇÃ";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("UM OU MAIS FICHEIROS DE INSTALAÇÃO NÃO FORAM DESCARREGADOS"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"POR FAVOR TENTE DE NOVO, OU CONTACTE O SUPORTE!")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113246217;
 //BA.debugLineNum = 113246217;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkif_sqlfilestotal_isequaltozero"), null);
this.state = 13;
return;
case 13:
//C
this.state = 8;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=113246218;
 //BA.debugLineNum = 113246218;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=113246219;
 //BA.debugLineNum = 113246219;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=113246223;
 //BA.debugLineNum = 113246223;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkinstallationrequirements() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkinstallationrequirements", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checkinstallationrequirements", null));}
ResumableSub_CheckInstallationRequirements rsub = new ResumableSub_CheckInstallationRequirements(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckInstallationRequirements extends BA.ResumableSub {
public ResumableSub_CheckInstallationRequirements(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
int _result = 0;
anywheresoftware.b4a.objects.IntentWrapper _in = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109838337;
 //BA.debugLineNum = 109838337;BA.debugLine="If File.ExternalWritable = False Then";
if (true) break;

case 1:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.File.getExternalWritable()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=109838340;
 //BA.debugLineNum = 109838340;BA.debugLine="Else If phone.SdkVersion >= 26 And CanRequestPack";
if (parent.mostCurrent._phone.getSdkVersion()>=26 && _canrequestpackageinstalls()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 5;
}else 
{RDebugUtils.currentLine=109838350;
 //BA.debugLineNum = 109838350;BA.debugLine="Else If CheckNonMarketAppsEnabled = False Then";
if (_checknonmarketappsenabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 7;
}else {
this.state = 9;
}}}
if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=109838338;
 //BA.debugLineNum = 109838338;BA.debugLine="MsgboxAsync(ShareCode.AvisoNotSDCard, ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisonotsdcard /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=109838339;
 //BA.debugLineNum = 109838339;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=109838342;
 //BA.debugLineNum = 109838342;BA.debugLine="MsgboxAsync(ShareCode.AvisoInstalarApp, ShareCod";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoinstalarapp /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
RDebugUtils.currentLine=109838343;
 //BA.debugLineNum = 109838343;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkinstallationrequirements"), null);
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=109838344;
 //BA.debugLineNum = 109838344;BA.debugLine="Dim in As Intent";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=109838345;
 //BA.debugLineNum = 109838345;BA.debugLine="in.Initialize(\"android.settings.MANAGE_UNKNOWN_A";
_in.Initialize("android.settings.MANAGE_UNKNOWN_APP_SOURCES","package:"+anywheresoftware.b4a.keywords.Common.Application.getPackageName());
RDebugUtils.currentLine=109838346;
 //BA.debugLineNum = 109838346;BA.debugLine="StartActivity(in)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_in.getObject()));
RDebugUtils.currentLine=109838347;
 //BA.debugLineNum = 109838347;BA.debugLine="Wait For Activity_Resume '<-- wait for Activity_";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_resume", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "checkinstallationrequirements"), null);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=109838348;
 //BA.debugLineNum = 109838348;BA.debugLine="Return CanRequestPackageInstalls";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_canrequestpackageinstalls()));return;};
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=109838351;
 //BA.debugLineNum = 109838351;BA.debugLine="MsgboxAsync(ShareCode.AvisoInstalarFontes1 & CRL";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoinstalarfontes1 /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._sharecode._avisoinstalarfontes2 /*String*/ +anywheresoftware.b4a.keywords.Common.CRLF+parent.mostCurrent._sharecode._avisoinstalarfontes3 /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
RDebugUtils.currentLine=109838352;
 //BA.debugLineNum = 109838352;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=109838354;
 //BA.debugLineNum = 109838354;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=109838356;
 //BA.debugLineNum = 109838356;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _checknonmarketappsenabled() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checknonmarketappsenabled", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "checknonmarketappsenabled", null));}
anywheresoftware.b4j.object.JavaObject _context = null;
anywheresoftware.b4j.object.JavaObject _resolver = null;
anywheresoftware.b4j.object.JavaObject _global = null;
RDebugUtils.currentLine=109969408;
 //BA.debugLineNum = 109969408;BA.debugLine="Private Sub CheckNonMarketAppsEnabled As Boolean";
RDebugUtils.currentLine=109969409;
 //BA.debugLineNum = 109969409;BA.debugLine="If phone.SdkVersion >= 26 Then Return True";
if (mostCurrent._phone.getSdkVersion()>=26) { 
if (true) return anywheresoftware.b4a.keywords.Common.True;};
RDebugUtils.currentLine=109969410;
 //BA.debugLineNum = 109969410;BA.debugLine="If phone.SdkVersion < 17 Or phone.SdkVersion >= 2";
if (mostCurrent._phone.getSdkVersion()<17 || mostCurrent._phone.getSdkVersion()>=21) { 
RDebugUtils.currentLine=109969411;
 //BA.debugLineNum = 109969411;BA.debugLine="Return phone.GetSettings(\"install_non_market_app";
if (true) return (mostCurrent._phone.GetSettings("install_non_market_apps")).equals("1");
 }else {
RDebugUtils.currentLine=109969413;
 //BA.debugLineNum = 109969413;BA.debugLine="Dim context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=109969414;
 //BA.debugLineNum = 109969414;BA.debugLine="context.InitializeContext";
_context.InitializeContext(processBA);
RDebugUtils.currentLine=109969415;
 //BA.debugLineNum = 109969415;BA.debugLine="Dim resolver As JavaObject = context.RunMethod(\"";
_resolver = new anywheresoftware.b4j.object.JavaObject();
_resolver = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_context.RunMethod("getContentResolver",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=109969416;
 //BA.debugLineNum = 109969416;BA.debugLine="Dim global As JavaObject";
_global = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=109969417;
 //BA.debugLineNum = 109969417;BA.debugLine="global.InitializeStatic(\"android.provider.Settin";
_global.InitializeStatic("android.provider.Settings.Global");
RDebugUtils.currentLine=109969418;
 //BA.debugLineNum = 109969418;BA.debugLine="Return global.RunMethod(\"getString\", Array(resol";
if (true) return (_global.RunMethod("getString",new Object[]{(Object)(_resolver.getObject()),(Object)("install_non_market_apps")})).equals((Object)("1"));
 };
RDebugUtils.currentLine=109969420;
 //BA.debugLineNum = 109969420;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.Map  _createauthparams(String _instance,String _authorization,String _version) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createauthparams", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(mostCurrent.activityBA, "createauthparams", new Object[] {_instance,_authorization,_version}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
RDebugUtils.currentLine=111542272;
 //BA.debugLineNum = 111542272;BA.debugLine="Sub CreateAuthParams(Instance As String, Authoriza";
RDebugUtils.currentLine=111542273;
 //BA.debugLineNum = 111542273;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111542274;
 //BA.debugLineNum = 111542274;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111542275;
 //BA.debugLineNum = 111542275;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111542277;
 //BA.debugLineNum = 111542277;BA.debugLine="params.Put(\"instance\", Instance)";
_params.Put((Object)("instance"),(Object)(_instance));
RDebugUtils.currentLine=111542278;
 //BA.debugLineNum = 111542278;BA.debugLine="params.Put(\"authorization\", Authorization)";
_params.Put((Object)("authorization"),(Object)(_authorization));
RDebugUtils.currentLine=111542279;
 //BA.debugLineNum = 111542279;BA.debugLine="params.Put(\"version\", Version)";
_params.Put((Object)("version"),(Object)(_version));
RDebugUtils.currentLine=111542280;
 //BA.debugLineNum = 111542280;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(_versiontagcode));
RDebugUtils.currentLine=111542281;
 //BA.debugLineNum = 111542281;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(_deviceauthorization));
RDebugUtils.currentLine=111542282;
 //BA.debugLineNum = 111542282;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(_deviceinstance));
RDebugUtils.currentLine=111542283;
 //BA.debugLineNum = 111542283;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(_devicebrand));
RDebugUtils.currentLine=111542284;
 //BA.debugLineNum = 111542284;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(_devicemodel));
RDebugUtils.currentLine=111542285;
 //BA.debugLineNum = 111542285;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(_devicemacaddress));
RDebugUtils.currentLine=111542286;
 //BA.debugLineNum = 111542286;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=111542288;
 //BA.debugLineNum = 111542288;BA.debugLine="Return params";
if (true) return _params;
RDebugUtils.currentLine=111542289;
 //BA.debugLineNum = 111542289;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.net.FTPWrapper  _createglobalftp() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createglobalftp", false))
	 {return ((anywheresoftware.b4a.net.FTPWrapper) Debug.delegate(mostCurrent.activityBA, "createglobalftp", null));}
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager _ctm = null;
RDebugUtils.currentLine=113639424;
 //BA.debugLineNum = 113639424;BA.debugLine="Sub CreateGlobalFTP As FTP";
RDebugUtils.currentLine=113639425;
 //BA.debugLineNum = 113639425;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=113639427;
 //BA.debugLineNum = 113639427;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=113639428;
 //BA.debugLineNum = 113639428;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113639429;
 //BA.debugLineNum = 113639429;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=113639430;
 //BA.debugLineNum = 113639430;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=113639431;
 //BA.debugLineNum = 113639431;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=113639432;
 //BA.debugLineNum = 113639432;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=113639433;
 //BA.debugLineNum = 113639433;BA.debugLine="Return GlobalFTP";
if (true) return _globalftp;
RDebugUtils.currentLine=113639434;
 //BA.debugLineNum = 113639434;BA.debugLine="End Sub";
return null;
}
public static void  _createlocaluser(anywheresoftware.b4a.objects.collections.Map _tech,anywheresoftware.b4a.objects.collections.Map _utech,anywheresoftware.b4a.objects.collections.Map _udtech) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlocaluser", false))
	 {Debug.delegate(mostCurrent.activityBA, "createlocaluser", new Object[] {_tech,_utech,_udtech}); return;}
ResumableSub_CreateLocalUser rsub = new ResumableSub_CreateLocalUser(null,_tech,_utech,_udtech);
rsub.resume(processBA, null);
}
public static class ResumableSub_CreateLocalUser extends BA.ResumableSub {
public ResumableSub_CreateLocalUser(xevolution.vrcg.devdemov2400.main parent,anywheresoftware.b4a.objects.collections.Map _tech,anywheresoftware.b4a.objects.collections.Map _utech,anywheresoftware.b4a.objects.collections.Map _udtech) {
this.parent = parent;
this._tech = _tech;
this._utech = _utech;
this._udtech = _udtech;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.objects.collections.Map _tech;
anywheresoftware.b4a.objects.collections.Map _utech;
anywheresoftware.b4a.objects.collections.Map _udtech;
anywheresoftware.b4a.objects.collections.List _insertlist = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112066564;
 //BA.debugLineNum = 112066564;BA.debugLine="Log(\"... Inserting\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6112066564","... Inserting",0);
RDebugUtils.currentLine=112066565;
 //BA.debugLineNum = 112066565;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112066566;
 //BA.debugLineNum = 112066566;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=112066567;
 //BA.debugLineNum = 112066567;BA.debugLine="InsertList.Add(tech)";
_insertlist.Add((Object)(_tech.getObject()));
RDebugUtils.currentLine=112066568;
 //BA.debugLineNum = 112066568;BA.debugLine="Try";
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
RDebugUtils.currentLine=112066570;
 //BA.debugLineNum = 112066570;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_technicals",_insertlist,"","");
RDebugUtils.currentLine=112066571;
 //BA.debugLineNum = 112066571;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "createlocaluser"),(int) (100));
this.state = 19;
return;
case 19:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=112066574;
 //BA.debugLineNum = 112066574;BA.debugLine="Log($\"ERRO INSERT dta_technicals :: ${LastExcept";
anywheresoftware.b4a.keywords.Common.LogImpl("6112066574",("ERRO INSERT dta_technicals :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112066575;
 //BA.debugLineNum = 112066575;BA.debugLine="Utils.logError(\"Inserir Técnicos\", ShareCode.SES";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Técnicos",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
RDebugUtils.currentLine=112066579;
 //BA.debugLineNum = 112066579;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112066580;
 //BA.debugLineNum = 112066580;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=112066581;
 //BA.debugLineNum = 112066581;BA.debugLine="InsertList.Add(utech)";
_insertlist.Add((Object)(_utech.getObject()));
RDebugUtils.currentLine=112066582;
 //BA.debugLineNum = 112066582;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 12;
this.catchState = 11;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 11;
RDebugUtils.currentLine=112066584;
 //BA.debugLineNum = 112066584;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"aut_users",_insertlist,"","");
RDebugUtils.currentLine=112066585;
 //BA.debugLineNum = 112066585;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "createlocaluser"),(int) (100));
this.state = 20;
return;
case 20:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=112066588;
 //BA.debugLineNum = 112066588;BA.debugLine="Log($\"ERRO INSERT aut_users :: ${LastException}\"";
anywheresoftware.b4a.keywords.Common.LogImpl("6112066588",("ERRO INSERT aut_users :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112066589;
 //BA.debugLineNum = 112066589;BA.debugLine="Utils.logError(\"Inserir Utilizadores\", ShareCode";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Utilizadores",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=112066592;
 //BA.debugLineNum = 112066592;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112066593;
 //BA.debugLineNum = 112066593;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=112066594;
 //BA.debugLineNum = 112066594;BA.debugLine="InsertList.Add(udtech)";
_insertlist.Add((Object)(_udtech.getObject()));
RDebugUtils.currentLine=112066595;
 //BA.debugLineNum = 112066595;BA.debugLine="Try";
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
RDebugUtils.currentLine=112066597;
 //BA.debugLineNum = 112066597;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"aut_users_details",_insertlist,"","");
RDebugUtils.currentLine=112066598;
 //BA.debugLineNum = 112066598;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "createlocaluser"),(int) (100));
this.state = 21;
return;
case 21:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=112066601;
 //BA.debugLineNum = 112066601;BA.debugLine="Log($\"ERRO INSERT aut_users_details :: ${LastExc";
anywheresoftware.b4a.keywords.Common.LogImpl("6112066601",("ERRO INSERT aut_users_details :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112066602;
 //BA.debugLineNum = 112066602;BA.debugLine="Utils.logError(\"Inserir Detalhes Utilizador\", Sh";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Detalhes Utilizador",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=112066604;
 //BA.debugLineNum = 112066604;BA.debugLine="End Sub";
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
public static String  _createloginslog() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createloginslog", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createloginslog", null));}
anywheresoftware.b4a.objects.collections.Map _maplogins = null;
int _i = 0;
String _currentuserlastlogin = "";
String _updfile = "";
RDebugUtils.currentLine=112263168;
 //BA.debugLineNum = 112263168;BA.debugLine="Sub CreateLoginsLog";
RDebugUtils.currentLine=112263169;
 //BA.debugLineNum = 112263169;BA.debugLine="Dim MapLogins As Map";
_maplogins = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112263171;
 //BA.debugLineNum = 112263171;BA.debugLine="If Not(MapLogins.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_maplogins.IsInitialized())) { 
RDebugUtils.currentLine=112263172;
 //BA.debugLineNum = 112263172;BA.debugLine="MapLogins.Initialize";
_maplogins.Initialize();
 }else {
RDebugUtils.currentLine=112263174;
 //BA.debugLineNum = 112263174;BA.debugLine="MapLogins.Clear";
_maplogins.Clear();
 };
RDebugUtils.currentLine=112263177;
 //BA.debugLineNum = 112263177;BA.debugLine="If File.Exists(Starter.SharedFolder,\"logins.log\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._sharedfolder /*String*/ ,"logins.log")) { 
RDebugUtils.currentLine=112263179;
 //BA.debugLineNum = 112263179;BA.debugLine="MapLogins = File.ReadMap(Starter.SharedFolder,\"l";
_maplogins = anywheresoftware.b4a.keywords.Common.File.ReadMap(mostCurrent._starter._sharedfolder /*String*/ ,"logins.log");
RDebugUtils.currentLine=112263180;
 //BA.debugLineNum = 112263180;BA.debugLine="Log(\"===========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263180","==================================================",0);
RDebugUtils.currentLine=112263181;
 //BA.debugLineNum = 112263181;BA.debugLine="Log(\"logins.log\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263181","logins.log",0);
RDebugUtils.currentLine=112263182;
 //BA.debugLineNum = 112263182;BA.debugLine="For i = 0 To MapLogins.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_maplogins.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=112263183;
 //BA.debugLineNum = 112263183;BA.debugLine="Log(\"Key: \" & MapLogins.GetKeyAt(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263183","Key: "+BA.ObjectToString(_maplogins.GetKeyAt(_i)),0);
RDebugUtils.currentLine=112263184;
 //BA.debugLineNum = 112263184;BA.debugLine="Log(\"Value: \" & MapLogins.GetValueAt(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263184","Value: "+BA.ObjectToString(_maplogins.GetValueAt(_i)),0);
 }
};
RDebugUtils.currentLine=112263186;
 //BA.debugLineNum = 112263186;BA.debugLine="Log(\"===========================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263186","==================================================",0);
RDebugUtils.currentLine=112263187;
 //BA.debugLineNum = 112263187;BA.debugLine="Dim CurrentUserLastLogin As String = MapLogins.G";
_currentuserlastlogin = BA.ObjectToString(_maplogins.Get((Object)(mostCurrent._sharecode._sess_oper_user /*String*/ )));
RDebugUtils.currentLine=112263189;
 //BA.debugLineNum = 112263189;BA.debugLine="If Utils.NNE(CurrentUserLastLogin) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_currentuserlastlogin)) { 
RDebugUtils.currentLine=112263190;
 //BA.debugLineNum = 112263190;BA.debugLine="ShareCode.FIRSTLOGININDEVICE = False";
mostCurrent._sharecode._firstloginindevice /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112263192;
 //BA.debugLineNum = 112263192;BA.debugLine="If Utils.GetCurrentDate = CurrentUserLastLogin";
if ((mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)).equals(_currentuserlastlogin)) { 
RDebugUtils.currentLine=112263193;
 //BA.debugLineNum = 112263193;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = False";
mostCurrent._sharecode._firstdailylogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=112263195;
 //BA.debugLineNum = 112263195;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = True";
mostCurrent._sharecode._firstdailylogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=112263198;
 //BA.debugLineNum = 112263198;BA.debugLine="MapLogins.Put(ShareCode.SESS_OPER_User,Utils.Ge";
_maplogins.Put((Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ),(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=112263199;
 //BA.debugLineNum = 112263199;BA.debugLine="File.WriteMap(Starter.SharedFolder,\"logins.log\"";
anywheresoftware.b4a.keywords.Common.File.WriteMap(mostCurrent._starter._sharedfolder /*String*/ ,"logins.log",_maplogins);
 }else {
RDebugUtils.currentLine=112263201;
 //BA.debugLineNum = 112263201;BA.debugLine="MapLogins.Put(ShareCode.SESS_OPER_User,Utils.Ge";
_maplogins.Put((Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ),(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=112263202;
 //BA.debugLineNum = 112263202;BA.debugLine="File.WriteMap(Starter.SharedFolder,\"logins.log\"";
anywheresoftware.b4a.keywords.Common.File.WriteMap(mostCurrent._starter._sharedfolder /*String*/ ,"logins.log",_maplogins);
RDebugUtils.currentLine=112263203;
 //BA.debugLineNum = 112263203;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = True";
mostCurrent._sharecode._firstdailylogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112263204;
 //BA.debugLineNum = 112263204;BA.debugLine="ShareCode.FIRSTLOGININDEVICE = True";
mostCurrent._sharecode._firstloginindevice /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 };
 }else {
RDebugUtils.currentLine=112263207;
 //BA.debugLineNum = 112263207;BA.debugLine="MapLogins.Put(ShareCode.SESS_OPER_User,Utils.Get";
_maplogins.Put((Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ),(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=112263208;
 //BA.debugLineNum = 112263208;BA.debugLine="File.WriteMap(Starter.SharedFolder,\"logins.log\",";
anywheresoftware.b4a.keywords.Common.File.WriteMap(mostCurrent._starter._sharedfolder /*String*/ ,"logins.log",_maplogins);
RDebugUtils.currentLine=112263209;
 //BA.debugLineNum = 112263209;BA.debugLine="ShareCode.FIRSTDAILYLOGIN = True";
mostCurrent._sharecode._firstdailylogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112263210;
 //BA.debugLineNum = 112263210;BA.debugLine="ShareCode.FIRSTLOGININDEVICE = True";
mostCurrent._sharecode._firstloginindevice /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=112263212;
 //BA.debugLineNum = 112263212;BA.debugLine="Dim updfile As String = $\"${ShareCode.SESS_OPER_";
_updfile = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_upd.log");
RDebugUtils.currentLine=112263213;
 //BA.debugLineNum = 112263213;BA.debugLine="If File.Exists(Starter.InternalFolder,updfile) T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._internalfolder /*String*/ ,_updfile)) { 
RDebugUtils.currentLine=112263214;
 //BA.debugLineNum = 112263214;BA.debugLine="File.Delete(Starter.InternalFolder,updfile)";
anywheresoftware.b4a.keywords.Common.File.Delete(mostCurrent._starter._internalfolder /*String*/ ,_updfile);
 };
 };
RDebugUtils.currentLine=112263218;
 //BA.debugLineNum = 112263218;BA.debugLine="Log(\"============================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263218","==================================================",0);
RDebugUtils.currentLine=112263219;
 //BA.debugLineNum = 112263219;BA.debugLine="Log($\"FIRSTDAILYLOGIN : ${ShareCode.FIRSTDAILYLOG";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263219",("FIRSTDAILYLOGIN : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._firstdailylogin /*boolean*/ ))+""),0);
RDebugUtils.currentLine=112263220;
 //BA.debugLineNum = 112263220;BA.debugLine="Log($\"FIRSTLOGININDEVICE : ${ShareCode.FIRSTLOGIN";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263220",("FIRSTLOGININDEVICE : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._firstloginindevice /*boolean*/ ))+""),0);
RDebugUtils.currentLine=112263221;
 //BA.debugLineNum = 112263221;BA.debugLine="Log(\"============================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6112263221","==================================================",0);
RDebugUtils.currentLine=112263222;
 //BA.debugLineNum = 112263222;BA.debugLine="End Sub";
return "";
}
public static String  _createorupdatelocaluser(anywheresoftware.b4a.objects.collections.Map _mapjson,String _uname) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createorupdatelocaluser", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createorupdatelocaluser", new Object[] {_mapjson,_uname}));}
anywheresoftware.b4a.objects.collections.Map _tech = null;
anywheresoftware.b4a.objects.collections.Map _utech = null;
anywheresoftware.b4a.objects.collections.Map _udtech = null;
anywheresoftware.b4a.objects.collections.Map _userin = null;
String _update_at = "";
String _user_tagcode = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordtech = null;
RDebugUtils.currentLine=112132096;
 //BA.debugLineNum = 112132096;BA.debugLine="Sub CreateOrUpdateLocalUser(MapJSON As Map, uname";
RDebugUtils.currentLine=112132097;
 //BA.debugLineNum = 112132097;BA.debugLine="Dim tech As Map = MapJSON.Get(\"tech\")";
_tech = new anywheresoftware.b4a.objects.collections.Map();
_tech = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("tech"))));
RDebugUtils.currentLine=112132098;
 //BA.debugLineNum = 112132098;BA.debugLine="Dim utech As Map = MapJSON.Get(\"utech\")";
_utech = new anywheresoftware.b4a.objects.collections.Map();
_utech = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("utech"))));
RDebugUtils.currentLine=112132099;
 //BA.debugLineNum = 112132099;BA.debugLine="Dim udtech As Map = MapJSON.Get(\"udtech\")";
_udtech = new anywheresoftware.b4a.objects.collections.Map();
_udtech = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("udtech"))));
RDebugUtils.currentLine=112132100;
 //BA.debugLineNum = 112132100;BA.debugLine="Dim UserIn As Map = MapJSON.Get(\"user\")";
_userin = new anywheresoftware.b4a.objects.collections.Map();
_userin = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("user"))));
RDebugUtils.currentLine=112132101;
 //BA.debugLineNum = 112132101;BA.debugLine="Dim update_at As String = Utils.IfNullOrEmpty(Use";
_update_at = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_userin.Get((Object)("update_at"))),"");
RDebugUtils.currentLine=112132102;
 //BA.debugLineNum = 112132102;BA.debugLine="Dim user_tagcode As String = UserIn.Get(\"user_tag";
_user_tagcode = BA.ObjectToString(_userin.Get((Object)("user_tagcode")));
RDebugUtils.currentLine=112132104;
 //BA.debugLineNum = 112132104;BA.debugLine="Private RecordTech As Cursor";
_recordtech = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=112132105;
 //BA.debugLineNum = 112132105;BA.debugLine="RecordTech = Starter.LocalSQLEVC.ExecQuery($\"Sele";
_recordtech = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select * from dta_technicals where username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"'"))));
RDebugUtils.currentLine=112132109;
 //BA.debugLineNum = 112132109;BA.debugLine="If RecordTech.RowCount > 0 Then";
if (_recordtech.getRowCount()>0) { 
RDebugUtils.currentLine=112132110;
 //BA.debugLineNum = 112132110;BA.debugLine="RecordTech.Position = 0";
_recordtech.setPosition((int) (0));
RDebugUtils.currentLine=112132111;
 //BA.debugLineNum = 112132111;BA.debugLine="UpdateLocalUser(RecordTech, update_at, uname, te";
_updatelocaluser(_recordtech,_update_at,_uname,_tech,_utech,_udtech,_user_tagcode);
 }else {
RDebugUtils.currentLine=112132114;
 //BA.debugLineNum = 112132114;BA.debugLine="CreateLocalUser(tech, utech, udtech)";
_createlocaluser(_tech,_utech,_udtech);
 };
RDebugUtils.currentLine=112132116;
 //BA.debugLineNum = 112132116;BA.debugLine="RecordTech.Close";
_recordtech.Close();
RDebugUtils.currentLine=112132118;
 //BA.debugLineNum = 112132118;BA.debugLine="End Sub";
return "";
}
public static void  _updatelocaluser(anywheresoftware.b4a.sql.SQL.CursorWrapper _recordtech,String _update_at,String _uname,anywheresoftware.b4a.objects.collections.Map _tech,anywheresoftware.b4a.objects.collections.Map _utech,anywheresoftware.b4a.objects.collections.Map _udtech,String _user_tagcode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatelocaluser", false))
	 {Debug.delegate(mostCurrent.activityBA, "updatelocaluser", new Object[] {_recordtech,_update_at,_uname,_tech,_utech,_udtech,_user_tagcode}); return;}
ResumableSub_UpdateLocalUser rsub = new ResumableSub_UpdateLocalUser(null,_recordtech,_update_at,_uname,_tech,_utech,_udtech,_user_tagcode);
rsub.resume(processBA, null);
}
public static class ResumableSub_UpdateLocalUser extends BA.ResumableSub {
public ResumableSub_UpdateLocalUser(xevolution.vrcg.devdemov2400.main parent,anywheresoftware.b4a.sql.SQL.CursorWrapper _recordtech,String _update_at,String _uname,anywheresoftware.b4a.objects.collections.Map _tech,anywheresoftware.b4a.objects.collections.Map _utech,anywheresoftware.b4a.objects.collections.Map _udtech,String _user_tagcode) {
this.parent = parent;
this._recordtech = _recordtech;
this._update_at = _update_at;
this._uname = _uname;
this._tech = _tech;
this._utech = _utech;
this._udtech = _udtech;
this._user_tagcode = _user_tagcode;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordtech;
String _update_at;
String _uname;
anywheresoftware.b4a.objects.collections.Map _tech;
anywheresoftware.b4a.objects.collections.Map _utech;
anywheresoftware.b4a.objects.collections.Map _udtech;
String _user_tagcode;
String _datacheck = "";
int _gravalocal = 0;
anywheresoftware.b4a.objects.collections.Map _insertlistm = null;
String _tgcode = "";
int _nc = 0;
anywheresoftware.b4a.objects.collections.List _insertlist = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112001025;
 //BA.debugLineNum = 112001025;BA.debugLine="Log(\"... Updating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6112001025","... Updating",0);
RDebugUtils.currentLine=112001026;
 //BA.debugLineNum = 112001026;BA.debugLine="Dim datacheck As String = RecordTech.GetString(\"u";
_datacheck = _recordtech.GetString("updated_at");
RDebugUtils.currentLine=112001027;
 //BA.debugLineNum = 112001027;BA.debugLine="Dim GravaLocal As Int = 0";
_gravalocal = (int) (0);
RDebugUtils.currentLine=112001028;
 //BA.debugLineNum = 112001028;BA.debugLine="If (Utils.IfNullOrEmpty(datacheck, \"\") <> update_";
if (true) break;

case 1:
//if
this.state = 34;
if (((parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_datacheck,"")).equals(_update_at) == false)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=112001029;
 //BA.debugLineNum = 112001029;BA.debugLine="Log(\"... Make update\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6112001029","... Make update",0);
RDebugUtils.currentLine=112001030;
 //BA.debugLineNum = 112001030;BA.debugLine="Dim InsertListm As Map";
_insertlistm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112001031;
 //BA.debugLineNum = 112001031;BA.debugLine="InsertListm.Initialize";
_insertlistm.Initialize();
RDebugUtils.currentLine=112001032;
 //BA.debugLineNum = 112001032;BA.debugLine="InsertListm.Put(\"username\", uname)";
_insertlistm.Put((Object)("username"),(Object)(_uname));
RDebugUtils.currentLine=112001033;
 //BA.debugLineNum = 112001033;BA.debugLine="Try";
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
RDebugUtils.currentLine=112001034;
 //BA.debugLineNum = 112001034;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC,";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_technicals",_tech,_insertlistm,_uname,"");
RDebugUtils.currentLine=112001035;
 //BA.debugLineNum = 112001035;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "updatelocaluser"),(int) (100));
this.state = 35;
return;
case 35:
//C
this.state = 9;
;
RDebugUtils.currentLine=112001036;
 //BA.debugLineNum = 112001036;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=112001038;
 //BA.debugLineNum = 112001038;BA.debugLine="Log($\"ERRO UPDATE dta_technicals :: ${LastExcep";
anywheresoftware.b4a.keywords.Common.LogImpl("6112001038",("ERRO UPDATE dta_technicals :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112001039;
 //BA.debugLineNum = 112001039;BA.debugLine="Utils.logError(\"Actualizar Técnicos\", ShareCode";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Actualizar Técnicos",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
RDebugUtils.currentLine=112001042;
 //BA.debugLineNum = 112001042;BA.debugLine="Dim tgcode As String = tech.Get(\"user_tagcode\")";
_tgcode = BA.ObjectToString(_tech.Get((Object)("user_tagcode")));
RDebugUtils.currentLine=112001044;
 //BA.debugLineNum = 112001044;BA.debugLine="Dim InsertListm As Map";
_insertlistm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112001045;
 //BA.debugLineNum = 112001045;BA.debugLine="InsertListm.Initialize";
_insertlistm.Initialize();
RDebugUtils.currentLine=112001046;
 //BA.debugLineNum = 112001046;BA.debugLine="InsertListm.Put(\"tagcode\", tgcode)";
_insertlistm.Put((Object)("tagcode"),(Object)(_tgcode));
RDebugUtils.currentLine=112001047;
 //BA.debugLineNum = 112001047;BA.debugLine="Dim nC As Int = DBStructures.GetCountOfEVC(\"aut_";
_nc = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"aut_users",(" and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_user_tagcode))+"'"));
RDebugUtils.currentLine=112001048;
 //BA.debugLineNum = 112001048;BA.debugLine="If nC = 0 Then";
if (true) break;

case 10:
//if
this.state = 27;
if (_nc==0) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=112001049;
 //BA.debugLineNum = 112001049;BA.debugLine="Try";
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
RDebugUtils.currentLine=112001050;
 //BA.debugLineNum = 112001050;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112001051;
 //BA.debugLineNum = 112001051;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=112001052;
 //BA.debugLineNum = 112001052;BA.debugLine="InsertList.Add(utech)";
_insertlist.Add((Object)(_utech.getObject()));
RDebugUtils.currentLine=112001054;
 //BA.debugLineNum = 112001054;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"aut_users",_insertlist,"","");
RDebugUtils.currentLine=112001055;
 //BA.debugLineNum = 112001055;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "updatelocaluser"),(int) (100));
this.state = 36;
return;
case 36:
//C
this.state = 18;
;
RDebugUtils.currentLine=112001056;
 //BA.debugLineNum = 112001056;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=112001058;
 //BA.debugLineNum = 112001058;BA.debugLine="Log($\"ERRO INSERT aut_users :: ${LastException";
anywheresoftware.b4a.keywords.Common.LogImpl("6112001058",("ERRO INSERT aut_users :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112001059;
 //BA.debugLineNum = 112001059;BA.debugLine="Utils.logError(\"Inserir Utilizadores\", ShareCo";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Utilizadores",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=112001062;
 //BA.debugLineNum = 112001062;BA.debugLine="Try";
if (true) break;

case 21:
//try
this.state = 26;
this.catchState = 25;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 26;
this.catchState = 25;
RDebugUtils.currentLine=112001064;
 //BA.debugLineNum = 112001064;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"aut_users",_utech,_insertlistm,_uname,"");
RDebugUtils.currentLine=112001065;
 //BA.debugLineNum = 112001065;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "updatelocaluser"),(int) (100));
this.state = 37;
return;
case 37:
//C
this.state = 26;
;
RDebugUtils.currentLine=112001066;
 //BA.debugLineNum = 112001066;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
RDebugUtils.currentLine=112001068;
 //BA.debugLineNum = 112001068;BA.debugLine="Log($\"ERRO UPDATE aut_users :: ${LastException";
anywheresoftware.b4a.keywords.Common.LogImpl("6112001068",("ERRO UPDATE aut_users :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112001069;
 //BA.debugLineNum = 112001069;BA.debugLine="Utils.logError(\"Actualizar Utilizadores\", Shar";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Actualizar Utilizadores",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=112001074;
 //BA.debugLineNum = 112001074;BA.debugLine="Dim InsertListm As Map";
_insertlistm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112001075;
 //BA.debugLineNum = 112001075;BA.debugLine="InsertListm.Initialize";
_insertlistm.Initialize();
RDebugUtils.currentLine=112001076;
 //BA.debugLineNum = 112001076;BA.debugLine="InsertListm.Put(\"user_tagcode\", tgcode)";
_insertlistm.Put((Object)("user_tagcode"),(Object)(_tgcode));
RDebugUtils.currentLine=112001077;
 //BA.debugLineNum = 112001077;BA.debugLine="Try";
if (true) break;

case 28:
//try
this.state = 33;
this.catchState = 32;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 32;
RDebugUtils.currentLine=112001079;
 //BA.debugLineNum = 112001079;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLEVC,";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"aut_users_details",_udtech,_insertlistm,_uname,"");
RDebugUtils.currentLine=112001080;
 //BA.debugLineNum = 112001080;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "updatelocaluser"),(int) (100));
this.state = 38;
return;
case 38:
//C
this.state = 33;
;
RDebugUtils.currentLine=112001081;
 //BA.debugLineNum = 112001081;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
RDebugUtils.currentLine=112001083;
 //BA.debugLineNum = 112001083;BA.debugLine="Log($\"ERRO UPDATE aut_users_details :: ${LastEx";
anywheresoftware.b4a.keywords.Common.LogImpl("6112001083",("ERRO UPDATE aut_users_details :: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=112001084;
 //BA.debugLineNum = 112001084;BA.debugLine="Utils.logError(\"Actualizar Detalhes Utilizador\"";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Actualizar Detalhes Utilizador",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=112001088;
 //BA.debugLineNum = 112001088;BA.debugLine="End Sub";
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
public static String  _createuserauthparams(String _uname,String _upass) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createuserauthparams", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createuserauthparams", new Object[] {_uname,_upass}));}
anywheresoftware.b4a.objects.collections.Map _params = null;
String _sccommand = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
RDebugUtils.currentLine=111935488;
 //BA.debugLineNum = 111935488;BA.debugLine="Sub CreateUserAuthParams(uname As String, upass As";
RDebugUtils.currentLine=111935489;
 //BA.debugLineNum = 111935489;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111935490;
 //BA.debugLineNum = 111935490;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111935491;
 //BA.debugLineNum = 111935491;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111935492;
 //BA.debugLineNum = 111935492;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111935493;
 //BA.debugLineNum = 111935493;BA.debugLine="params.Put(\"_user\", uname)";
_params.Put((Object)("_user"),(Object)(_uname));
RDebugUtils.currentLine=111935494;
 //BA.debugLineNum = 111935494;BA.debugLine="params.Put(\"_key\", upass)";
_params.Put((Object)("_key"),(Object)(_upass));
RDebugUtils.currentLine=111935495;
 //BA.debugLineNum = 111935495;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(_versiontagcode));
RDebugUtils.currentLine=111935496;
 //BA.debugLineNum = 111935496;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(_deviceauthorization));
RDebugUtils.currentLine=111935497;
 //BA.debugLineNum = 111935497;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(_deviceinstance));
RDebugUtils.currentLine=111935498;
 //BA.debugLineNum = 111935498;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(_devicebrand));
RDebugUtils.currentLine=111935499;
 //BA.debugLineNum = 111935499;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(_devicemodel));
RDebugUtils.currentLine=111935500;
 //BA.debugLineNum = 111935500;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(_devicemacaddress));
RDebugUtils.currentLine=111935502;
 //BA.debugLineNum = 111935502;BA.debugLine="Dim sccommand As String = $\"username='${uname}',";
_sccommand = ("username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"', password='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_upass))+"'");
RDebugUtils.currentLine=111935503;
 //BA.debugLineNum = 111935503;BA.debugLine="Log(sccommand)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111935503",_sccommand,0);
RDebugUtils.currentLine=111935505;
 //BA.debugLineNum = 111935505;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111935506;
 //BA.debugLineNum = 111935506;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111935507;
 //BA.debugLineNum = 111935507;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111935508;
 //BA.debugLineNum = 111935508;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111935508",_data,0);
RDebugUtils.currentLine=111935510;
 //BA.debugLineNum = 111935510;BA.debugLine="Return data";
if (true) return _data;
RDebugUtils.currentLine=111935511;
 //BA.debugLineNum = 111935511;BA.debugLine="End Sub";
return "";
}
public static void  _deleteandcopydatabase() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deleteandcopydatabase", false))
	 {Debug.delegate(mostCurrent.activityBA, "deleteandcopydatabase", null); return;}
ResumableSub_DeleteAndCopyDatabase rsub = new ResumableSub_DeleteAndCopyDatabase(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_DeleteAndCopyDatabase extends BA.ResumableSub {
public ResumableSub_DeleteAndCopyDatabase(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112918530;
 //BA.debugLineNum = 112918530;BA.debugLine="Starter.LocalSQLEVC.Close";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .Close();
RDebugUtils.currentLine=112918531;
 //BA.debugLineNum = 112918531;BA.debugLine="If File.Exists(Starter.SharedFolder, \"evolutionch";
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
RDebugUtils.currentLine=112918532;
 //BA.debugLineNum = 112918532;BA.debugLine="File.Delete(Starter.SharedFolder, \"evolutionchec";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=112918534;
 //BA.debugLineNum = 112918534;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "deleteandcopydatabase"),(int) (250));
this.state = 15;
return;
case 15:
//C
this.state = 5;
;
RDebugUtils.currentLine=112918536;
 //BA.debugLineNum = 112918536;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"evoluti";
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
RDebugUtils.currentLine=112918537;
 //BA.debugLineNum = 112918537;BA.debugLine="File.Copy(File.DirAssets, \"evolutioncheck.db3\",";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"evolutioncheck.db3",parent.mostCurrent._starter._sharedfolder /*String*/ ,"evolutioncheck.db3");
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=112918539;
 //BA.debugLineNum = 112918539;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "deleteandcopydatabase"),(int) (250));
this.state = 16;
return;
case 16:
//C
this.state = 9;
;
RDebugUtils.currentLine=112918541;
 //BA.debugLineNum = 112918541;BA.debugLine="If Not(Starter.LocalSQLEVC.IsInitialized) Then St";
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
this.state = -1;
;
RDebugUtils.currentLine=112918542;
 //BA.debugLineNum = 112918542;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "deleteandcopydatabase"),(int) (100));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=112918543;
 //BA.debugLineNum = 112918543;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _sendinstallintent(String _filename) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendinstallintent", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "sendinstallintent", new Object[] {_filename}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=110034944;
 //BA.debugLineNum = 110034944;BA.debugLine="Private Sub SendInstallIntent(FileName As String)";
RDebugUtils.currentLine=110034945;
 //BA.debugLineNum = 110034945;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=110034946;
 //BA.debugLineNum = 110034946;BA.debugLine="If phone.SdkVersion >= 24 Then";
if (mostCurrent._phone.getSdkVersion()>=24) { 
RDebugUtils.currentLine=110034947;
 //BA.debugLineNum = 110034947;BA.debugLine="i.Initialize(\"android.intent.action.INSTALL_PACK";
_i.Initialize("android.intent.action.INSTALL_PACKAGE",BA.ObjectToString(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._getfileuri /*Object*/ (null,_filename)));
RDebugUtils.currentLine=110034948;
 //BA.debugLineNum = 110034948;BA.debugLine="i.Flags = Bit.Or(i.Flags, 1) 'FLAG_GRANT_READ_UR";
_i.setFlags(anywheresoftware.b4a.keywords.Common.Bit.Or(_i.getFlags(),(int) (1)));
 }else {
RDebugUtils.currentLine=110034950;
 //BA.debugLineNum = 110034950;BA.debugLine="i.Initialize(i.ACTION_VIEW, \"file://\" & File.Com";
_i.Initialize(_i.ACTION_VIEW,"file://"+anywheresoftware.b4a.keywords.Common.File.Combine(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename));
RDebugUtils.currentLine=110034951;
 //BA.debugLineNum = 110034951;BA.debugLine="i.SetType(\"application/vnd.android.package-archi";
_i.SetType("application/vnd.android.package-archive");
 };
RDebugUtils.currentLine=110034954;
 //BA.debugLineNum = 110034954;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6110034954",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=110034955;
 //BA.debugLineNum = 110034955;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=110034956;
 //BA.debugLineNum = 110034956;BA.debugLine="StartActivity(i)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_i.getObject()));
RDebugUtils.currentLine=110034957;
 //BA.debugLineNum = 110034957;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadevolutioncheckdbwithftp(String _filename) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadevolutioncheckdbwithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadevolutioncheckdbwithftp", new Object[] {_filename}));}
ResumableSub_DownloadEvolutionCheckDbWithFTP rsub = new ResumableSub_DownloadEvolutionCheckDbWithFTP(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadEvolutionCheckDbWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadEvolutionCheckDbWithFTP(xevolution.vrcg.devdemov2400.main parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.main parent;
String _filename;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109707265;
 //BA.debugLineNum = 109707265;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=109707266;
 //BA.debugLineNum = 109707266;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=109707267;
 //BA.debugLineNum = 109707267;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=109707271;
 //BA.debugLineNum = 109707271;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=109707272;
 //BA.debugLineNum = 109707272;BA.debugLine="Log(filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109707272",_filename,0);
RDebugUtils.currentLine=109707273;
 //BA.debugLineNum = 109707273;BA.debugLine="Dim sf As Object = Starter.GlobalFTP.DownloadFile";
_sf = parent.mostCurrent._starter._globalftp /*anywheresoftware.b4a.net.FTPWrapper*/ .DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=109707274;
 //BA.debugLineNum = 109707274;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadevolutioncheckdbwithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=109707276;
 //BA.debugLineNum = 109707276;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=109707277;
 //BA.debugLineNum = 109707277;BA.debugLine="Log(filename & \" file was download successfully\"";
anywheresoftware.b4a.keywords.Common.LogImpl("6109707277",_filename+" file was download successfully",0);
RDebugUtils.currentLine=109707278;
 //BA.debugLineNum = 109707278;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=109707279;
 //BA.debugLineNum = 109707279;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=109707281;
 //BA.debugLineNum = 109707281;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=109707282;
 //BA.debugLineNum = 109707282;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=109707283;
 //BA.debugLineNum = 109707283;BA.debugLine="Log(\"Error downloading file \" & filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109707283","Error downloading file "+_filename,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=109707285;
 //BA.debugLineNum = 109707285;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _downloadfilestodocsfolder(anywheresoftware.b4a.net.FTPWrapper _globalftp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadfilestodocsfolder", false))
	 {Debug.delegate(mostCurrent.activityBA, "downloadfilestodocsfolder", new Object[] {_globalftp}); return;}
ResumableSub_DownloadFilesToDocsFolder rsub = new ResumableSub_DownloadFilesToDocsFolder(null,_globalftp);
rsub.resume(processBA, null);
}
public static class ResumableSub_DownloadFilesToDocsFolder extends BA.ResumableSub {
public ResumableSub_DownloadFilesToDocsFolder(xevolution.vrcg.devdemov2400.main parent,anywheresoftware.b4a.net.FTPWrapper _globalftp) {
this.parent = parent;
this._globalftp = _globalftp;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.net.FTPWrapper _globalftp;
anywheresoftware.b4a.objects.collections.List _ftpdocslist = null;
int _totaldocs = 0;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
long _lmdate = 0L;
int _i = 0;
String _fname = "";
Object _sf = null;
int step14;
int limit14;
int step30;
int limit30;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113508356;
 //BA.debugLineNum = 113508356;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUpd";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=113508357;
 //BA.debugLineNum = 113508357;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508357","************************************************************",0);
RDebugUtils.currentLine=113508358;
 //BA.debugLineNum = 113508358;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508358",(" 		INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=113508359;
 //BA.debugLineNum = 113508359;BA.debugLine="Log(\"/docs/\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508359","/docs/",0);
RDebugUtils.currentLine=113508360;
 //BA.debugLineNum = 113508360;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508360","************************************************************",0);
RDebugUtils.currentLine=113508362;
 //BA.debugLineNum = 113508362;BA.debugLine="Dim FTPDOCSLIST As List";
_ftpdocslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113508363;
 //BA.debugLineNum = 113508363;BA.debugLine="Dim TotalDocs As Int = 0";
_totaldocs = (int) (0);
RDebugUtils.currentLine=113508365;
 //BA.debugLineNum = 113508365;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=113508368;
 //BA.debugLineNum = 113508368;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadfilestodocsfolder"), _sfl);
this.state = 46;
return;
case 46:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=113508369;
 //BA.debugLineNum = 113508369;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 22;
if (_success) { 
this.state = 3;
}else {
this.state = 21;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=113508375;
 //BA.debugLineNum = 113508375;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1) '";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
RDebugUtils.currentLine=113508377;
 //BA.debugLineNum = 113508377;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_files.length>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=113508378;
 //BA.debugLineNum = 113508378;BA.debugLine="FTPDOCSLIST.Initialize";
_ftpdocslist.Initialize();
RDebugUtils.currentLine=113508379;
 //BA.debugLineNum = 113508379;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 7:
//for
this.state = 18;
step14 = 1;
limit14 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 18;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=113508380;
 //BA.debugLineNum = 113508380;BA.debugLine="Dim fName As String = files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=113508381;
 //BA.debugLineNum = 113508381;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
if (true) break;

case 10:
//if
this.state = 17;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx")) || anywheresoftware.b4a.keywords.Common.Not((_fname.startsWith("REPORT")))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=113508385;
 //BA.debugLineNum = 113508385;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=113508386;
 //BA.debugLineNum = 113508386;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=113508387;
 //BA.debugLineNum = 113508387;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508387",_files[_i].getName(),0);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=113508393;
 //BA.debugLineNum = 113508393;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallCompleteP";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstIntallCompleteProcedure","error getting files list from /docs/");
 if (true) break;
;
RDebugUtils.currentLine=113508396;
 //BA.debugLineNum = 113508396;BA.debugLine="If (FTPDOCSLIST.IsInitialized) Then";

case 22:
//if
this.state = 45;
if ((_ftpdocslist.IsInitialized())) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=113508397;
 //BA.debugLineNum = 113508397;BA.debugLine="If (FTPDOCSLIST.Size>=1) Then";
if (true) break;

case 25:
//if
this.state = 44;
if ((_ftpdocslist.getSize()>=1)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=113508398;
 //BA.debugLineNum = 113508398;BA.debugLine="TotalDocs = FTPDOCSLIST.Size-1";
_totaldocs = (int) (_ftpdocslist.getSize()-1);
RDebugUtils.currentLine=113508399;
 //BA.debugLineNum = 113508399;BA.debugLine="For i=0 To FTPDOCSLIST.Size-1";
if (true) break;

case 28:
//for
this.state = 43;
step30 = 1;
limit30 = (int) (_ftpdocslist.getSize()-1);
_i = (int) (0) ;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 43;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 30;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=113508400;
 //BA.debugLineNum = 113508400;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/docs/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+"")));
RDebugUtils.currentLine=113508401;
 //BA.debugLineNum = 113508401;BA.debugLine="Dim fName As String = FTPDOCSLIST.Get(i)";
_fname = BA.ObjectToString(_ftpdocslist.Get(_i));
RDebugUtils.currentLine=113508402;
 //BA.debugLineNum = 113508402;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508402",_fname,0);
RDebugUtils.currentLine=113508403;
 //BA.debugLineNum = 113508403;BA.debugLine="Try";
if (true) break;

case 31:
//try
this.state = 42;
this.catchState = 41;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 41;
RDebugUtils.currentLine=113508404;
 //BA.debugLineNum = 113508404;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=113508405;
 //BA.debugLineNum = 113508405;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadfilestodocsfolder"), _sf);
this.state = 51;
return;
case 51:
//C
this.state = 34;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=113508407;
 //BA.debugLineNum = 113508407;BA.debugLine="If Success Then";
if (true) break;

case 34:
//if
this.state = 39;
if (_success) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
RDebugUtils.currentLine=113508408;
 //BA.debugLineNum = 113508408;BA.debugLine="Log(\"/docs/ : file was download successfully";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508408","/docs/ : file was download successfully",0);
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=113508411;
 //BA.debugLineNum = 113508411;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508411","/docs/ : Error downloading file",0);
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
RDebugUtils.currentLine=113508415;
 //BA.debugLineNum = 113508415;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113508415",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113508416;
 //BA.debugLineNum = 113508416;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 42:
//C
this.state = 50;
this.catchState = 0;
;
RDebugUtils.currentLine=113508418;
 //BA.debugLineNum = 113508418;BA.debugLine="UpdateProgressBar(TotalDocs,i)";
_updateprogressbar((long) (_totaldocs),(long) (_i));
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=113508424;
 //BA.debugLineNum = 113508424;BA.debugLine="End Sub";
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
public static String  _updateprogressbar(long _maxval,long _currentval) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateprogressbar", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateprogressbar", new Object[] {_maxval,_currentval}));}
RDebugUtils.currentLine=113770496;
 //BA.debugLineNum = 113770496;BA.debugLine="Sub UpdateProgressBar(MaxVal As Long, CurrentVal A";
RDebugUtils.currentLine=113770497;
 //BA.debugLineNum = 113770497;BA.debugLine="Dim CurrentVal As Long = (100 * CurrentVal / MaxV";
_currentval = (long) ((100*_currentval/(double)_maxval));
RDebugUtils.currentLine=113770498;
 //BA.debugLineNum = 113770498;BA.debugLine="ProgressoInicial.Progress = CurrentVal";
mostCurrent._progressoinicial.setProgress((int) (_currentval));
RDebugUtils.currentLine=113770499;
 //BA.debugLineNum = 113770499;BA.debugLine="End Sub";
return "";
}
public static void  _downloadfilestointernofolder(anywheresoftware.b4a.net.FTPWrapper _globalftp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadfilestointernofolder", false))
	 {Debug.delegate(mostCurrent.activityBA, "downloadfilestointernofolder", new Object[] {_globalftp}); return;}
ResumableSub_DownloadFilesToInternoFolder rsub = new ResumableSub_DownloadFilesToInternoFolder(null,_globalftp);
rsub.resume(processBA, null);
}
public static class ResumableSub_DownloadFilesToInternoFolder extends BA.ResumableSub {
public ResumableSub_DownloadFilesToInternoFolder(xevolution.vrcg.devdemov2400.main parent,anywheresoftware.b4a.net.FTPWrapper _globalftp) {
this.parent = parent;
this._globalftp = _globalftp;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.net.FTPWrapper _globalftp;
anywheresoftware.b4a.objects.collections.List _ftpinternolist = null;
int _totaltemplates = 0;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname2 = "";
Object _sf = null;
int step13;
int limit13;
int step24;
int limit24;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113573892;
 //BA.debugLineNum = 113573892;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573892","************************************************************",0);
RDebugUtils.currentLine=113573893;
 //BA.debugLineNum = 113573893;BA.debugLine="Log(\"/interno\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573893","/interno",0);
RDebugUtils.currentLine=113573894;
 //BA.debugLineNum = 113573894;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573894","************************************************************",0);
RDebugUtils.currentLine=113573895;
 //BA.debugLineNum = 113573895;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((long) (100),(long) (0));
RDebugUtils.currentLine=113573896;
 //BA.debugLineNum = 113573896;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUpd";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=113573897;
 //BA.debugLineNum = 113573897;BA.debugLine="Dim FTPINTERNOLIST As List";
_ftpinternolist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113573898;
 //BA.debugLineNum = 113573898;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=113573900;
 //BA.debugLineNum = 113573900;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
_sfl = _globalftp.List(processBA,"/interno/");
RDebugUtils.currentLine=113573901;
 //BA.debugLineNum = 113573901;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadfilestointernofolder"), _sfl);
this.state = 38;
return;
case 38:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=113573902;
 //BA.debugLineNum = 113573902;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=113573904;
 //BA.debugLineNum = 113573904;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_files.length>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=113573905;
 //BA.debugLineNum = 113573905;BA.debugLine="FTPINTERNOLIST.Initialize";
_ftpinternolist.Initialize();
RDebugUtils.currentLine=113573906;
 //BA.debugLineNum = 113573906;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 7:
//for
this.state = 10;
step13 = 1;
limit13 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 10;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 9;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 9:
//C
this.state = 40;
RDebugUtils.currentLine=113573907;
 //BA.debugLineNum = 113573907;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=113573908;
 //BA.debugLineNum = 113573908;BA.debugLine="FTPINTERNOLIST.Add(files(i).Name)";
_ftpinternolist.Add((Object)(_files[_i].getName()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=113573912;
 //BA.debugLineNum = 113573912;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallCompleteP";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstIntallCompleteProcedure","error getting files list from /interno/");
 if (true) break;
;
RDebugUtils.currentLine=113573915;
 //BA.debugLineNum = 113573915;BA.debugLine="If (FTPINTERNOLIST.IsInitialized) Then";

case 14:
//if
this.state = 37;
if ((_ftpinternolist.IsInitialized())) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=113573916;
 //BA.debugLineNum = 113573916;BA.debugLine="If (FTPINTERNOLIST.Size>=1) Then";
if (true) break;

case 17:
//if
this.state = 36;
if ((_ftpinternolist.getSize()>=1)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=113573917;
 //BA.debugLineNum = 113573917;BA.debugLine="TotalTemplates = FTPINTERNOLIST.Size-1";
_totaltemplates = (int) (_ftpinternolist.getSize()-1);
RDebugUtils.currentLine=113573918;
 //BA.debugLineNum = 113573918;BA.debugLine="For i=0 To FTPINTERNOLIST.Size-1";
if (true) break;

case 20:
//for
this.state = 35;
step24 = 1;
limit24 = (int) (_ftpinternolist.getSize()-1);
_i = (int) (0) ;
this.state = 41;
if (true) break;

case 41:
//C
this.state = 35;
if ((step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24)) this.state = 22;
if (true) break;

case 42:
//C
this.state = 41;
_i = ((int)(0 + _i + step24)) ;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=113573919;
 //BA.debugLineNum = 113573919;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/interno/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=113573920;
 //BA.debugLineNum = 113573920;BA.debugLine="Dim fName2 As String = FTPINTERNOLIST.Get(i)";
_fname2 = BA.ObjectToString(_ftpinternolist.Get(_i));
RDebugUtils.currentLine=113573921;
 //BA.debugLineNum = 113573921;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573921",_fname2,0);
RDebugUtils.currentLine=113573922;
 //BA.debugLineNum = 113573922;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 34;
this.catchState = 33;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 33;
RDebugUtils.currentLine=113573923;
 //BA.debugLineNum = 113573923;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/i";
_sf = _globalftp.DownloadFile(processBA,"/interno/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=113573924;
 //BA.debugLineNum = 113573924;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadfilestointernofolder"), _sf);
this.state = 43;
return;
case 43:
//C
this.state = 26;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=113573926;
 //BA.debugLineNum = 113573926;BA.debugLine="If Success Then";
if (true) break;

case 26:
//if
this.state = 31;
if (_success) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=113573927;
 //BA.debugLineNum = 113573927;BA.debugLine="Log(\"/interno/ : file was download successfu";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573927","/interno/ : file was download successfully",0);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=113573930;
 //BA.debugLineNum = 113573930;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573930","/interno/ : Error downloading file",0);
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
RDebugUtils.currentLine=113573934;
 //BA.debugLineNum = 113573934;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113573934",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113573935;
 //BA.debugLineNum = 113573935;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 34:
//C
this.state = 42;
this.catchState = 0;
;
RDebugUtils.currentLine=113573937;
 //BA.debugLineNum = 113573937;BA.debugLine="UpdateProgressBar(TotalTemplates,i)";
_updateprogressbar((long) (_totaltemplates),(long) (_i));
 if (true) break;
if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=113573942;
 //BA.debugLineNum = 113573942;BA.debugLine="End Sub";
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
public static void  _downloadfilestotemplatesfolder(anywheresoftware.b4a.net.FTPWrapper _globalftp) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadfilestotemplatesfolder", false))
	 {Debug.delegate(mostCurrent.activityBA, "downloadfilestotemplatesfolder", new Object[] {_globalftp}); return;}
ResumableSub_DownloadFilesToTemplatesFolder rsub = new ResumableSub_DownloadFilesToTemplatesFolder(null,_globalftp);
rsub.resume(processBA, null);
}
public static class ResumableSub_DownloadFilesToTemplatesFolder extends BA.ResumableSub {
public ResumableSub_DownloadFilesToTemplatesFolder(xevolution.vrcg.devdemov2400.main parent,anywheresoftware.b4a.net.FTPWrapper _globalftp) {
this.parent = parent;
this._globalftp = _globalftp;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.net.FTPWrapper _globalftp;
anywheresoftware.b4a.objects.collections.List _ftptemplateslist = null;
int _totaltemplates = 0;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname2 = "";
Object _sf = null;
int step13;
int limit13;
int step26;
int limit26;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113442820;
 //BA.debugLineNum = 113442820;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442820","************************************************************",0);
RDebugUtils.currentLine=113442821;
 //BA.debugLineNum = 113442821;BA.debugLine="Log(\"/docs/templates\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442821","/docs/templates",0);
RDebugUtils.currentLine=113442822;
 //BA.debugLineNum = 113442822;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442822","************************************************************",0);
RDebugUtils.currentLine=113442823;
 //BA.debugLineNum = 113442823;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((long) (100),(long) (0));
RDebugUtils.currentLine=113442824;
 //BA.debugLineNum = 113442824;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUpd";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=113442825;
 //BA.debugLineNum = 113442825;BA.debugLine="Dim FTPTEMPLATESLIST As List";
_ftptemplateslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113442826;
 //BA.debugLineNum = 113442826;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=113442828;
 //BA.debugLineNum = 113442828;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/");
RDebugUtils.currentLine=113442831;
 //BA.debugLineNum = 113442831;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadfilestotemplatesfolder"), _sfl);
this.state = 42;
return;
case 42:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=113442832;
 //BA.debugLineNum = 113442832;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 18;
if (_success) { 
this.state = 3;
}else {
this.state = 17;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=113442839;
 //BA.debugLineNum = 113442839;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((_files.length>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=113442840;
 //BA.debugLineNum = 113442840;BA.debugLine="FTPTEMPLATESLIST.Initialize";
_ftptemplateslist.Initialize();
RDebugUtils.currentLine=113442841;
 //BA.debugLineNum = 113442841;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 7:
//for
this.state = 14;
step13 = 1;
limit13 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 14;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 9;
if (true) break;

case 44:
//C
this.state = 43;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=113442842;
 //BA.debugLineNum = 113442842;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=113442843;
 //BA.debugLineNum = 113442843;BA.debugLine="If (fName2.EndsWith(\".png\")) Or (fName2.EndsWi";
if (true) break;

case 10:
//if
this.state = 13;
if ((_fname2.endsWith(".png")) || (_fname2.endsWith(".jpg")) || (_fname2.endsWith(".jpeg")) || (_fname2.endsWith(".pdf")) || (_fname2.endsWith(".doc")) || (_fname2.endsWith(".docx")) || (_fname2.endsWith(".xls")) || (_fname2.endsWith(".xlsx")) || (_fname2.endsWith(".ppt")) || (_fname2.endsWith(".pptx")) || (_fname2.endsWith(".html")) || anywheresoftware.b4a.keywords.Common.Not((_fname2.startsWith("REPORT"))) || (_fname2.startsWith("dictionary"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=113442848;
 //BA.debugLineNum = 113442848;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
_ftptemplateslist.Add((Object)(_files[_i].getName()));
 if (true) break;

case 13:
//C
this.state = 44;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=113442853;
 //BA.debugLineNum = 113442853;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallCompleteP";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstIntallCompleteProcedure","error getting files list from /docs/templates/");
 if (true) break;
;
RDebugUtils.currentLine=113442856;
 //BA.debugLineNum = 113442856;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";

case 18:
//if
this.state = 41;
if ((_ftptemplateslist.IsInitialized())) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=113442857;
 //BA.debugLineNum = 113442857;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
if (true) break;

case 21:
//if
this.state = 40;
if ((_ftptemplateslist.getSize()>=1)) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=113442858;
 //BA.debugLineNum = 113442858;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
_totaltemplates = (int) (_ftptemplateslist.getSize()-1);
RDebugUtils.currentLine=113442859;
 //BA.debugLineNum = 113442859;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
if (true) break;

case 24:
//for
this.state = 39;
step26 = 1;
limit26 = (int) (_ftptemplateslist.getSize()-1);
_i = (int) (0) ;
this.state = 45;
if (true) break;

case 45:
//C
this.state = 39;
if ((step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26)) this.state = 26;
if (true) break;

case 46:
//C
this.state = 45;
_i = ((int)(0 + _i + step26)) ;
if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=113442860;
 //BA.debugLineNum = 113442860;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/docs/templates/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=113442861;
 //BA.debugLineNum = 113442861;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i)";
_fname2 = BA.ObjectToString(_ftptemplateslist.Get(_i));
RDebugUtils.currentLine=113442862;
 //BA.debugLineNum = 113442862;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442862",_fname2,0);
RDebugUtils.currentLine=113442863;
 //BA.debugLineNum = 113442863;BA.debugLine="Try";
if (true) break;

case 27:
//try
this.state = 38;
this.catchState = 37;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 37;
RDebugUtils.currentLine=113442864;
 //BA.debugLineNum = 113442864;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=113442865;
 //BA.debugLineNum = 113442865;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadfilestotemplatesfolder"), _sf);
this.state = 47;
return;
case 47:
//C
this.state = 30;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=113442867;
 //BA.debugLineNum = 113442867;BA.debugLine="If Success Then";
if (true) break;

case 30:
//if
this.state = 35;
if (_success) { 
this.state = 32;
}else {
this.state = 34;
}if (true) break;

case 32:
//C
this.state = 35;
RDebugUtils.currentLine=113442868;
 //BA.debugLineNum = 113442868;BA.debugLine="Log(\"/docs/templates/ : file was download su";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442868","/docs/templates/ : file was download successfully",0);
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=113442871;
 //BA.debugLineNum = 113442871;BA.debugLine="Log(\"/docs/templates/ : Error downloading fi";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442871","/docs/templates/ : Error downloading file",0);
 if (true) break;

case 35:
//C
this.state = 38;
;
 if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 0;
RDebugUtils.currentLine=113442875;
 //BA.debugLineNum = 113442875;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113442875",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113442876;
 //BA.debugLineNum = 113442876;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 38:
//C
this.state = 46;
this.catchState = 0;
;
RDebugUtils.currentLine=113442878;
 //BA.debugLineNum = 113442878;BA.debugLine="UpdateProgressBar(TotalTemplates,i)";
_updateprogressbar((long) (_totaltemplates),(long) (_i));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
RDebugUtils.currentLine=113442883;
 //BA.debugLineNum = 113442883;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfiles(int _sqlfilestotal,String _firstinstallfilesname) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadsqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadsqlfiles", new Object[] {_sqlfilestotal,_firstinstallfilesname}));}
ResumableSub_DownloadSQLFiles rsub = new ResumableSub_DownloadSQLFiles(null,_sqlfilestotal,_firstinstallfilesname);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSQLFiles extends BA.ResumableSub {
public ResumableSub_DownloadSQLFiles(xevolution.vrcg.devdemov2400.main parent,int _sqlfilestotal,String _firstinstallfilesname) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
this._firstinstallfilesname = _firstinstallfilesname;
}
xevolution.vrcg.devdemov2400.main parent;
int _sqlfilestotal;
String _firstinstallfilesname;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
int _i = 0;
String _filen = "";
Object _sf = null;
String _serverpath = "";
boolean _success = false;
String _msgfatal = "";
int _result = 0;
int step5;
int limit5;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113311745;
 //BA.debugLineNum = 113311745;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=113311746;
 //BA.debugLineNum = 113311746;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=113311747;
 //BA.debugLineNum = 113311747;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113311748;
 //BA.debugLineNum = 113311748;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=113311750;
 //BA.debugLineNum = 113311750;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 1:
//for
this.state = 22;
step5 = 1;
limit5 = _sqlfilestotal;
_i = (int) (1) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 22;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=113311751;
 //BA.debugLineNum = 113311751;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUp";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sqlfilestotal))+"")));
RDebugUtils.currentLine=113311752;
 //BA.debugLineNum = 113311752;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesName}";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_firstinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=113311754;
 //BA.debugLineNum = 113311754;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, fi";
if (true) break;

case 4:
//if
this.state = 7;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=113311755;
 //BA.debugLineNum = 113311755;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, file";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=113311760;
 //BA.debugLineNum = 113311760;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filen,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=113311761;
 //BA.debugLineNum = 113311761;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadsqlfiles"), _sf);
this.state = 25;
return;
case 25:
//C
this.state = 8;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=113311763;
 //BA.debugLineNum = 113311763;BA.debugLine="If Success Then";
if (true) break;

case 8:
//if
this.state = 21;
if (_success) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 21;
RDebugUtils.currentLine=113311764;
 //BA.debugLineNum = 113311764;BA.debugLine="Log(fileN & \" file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113311764",_filen+" file was download successfully",0);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=113311766;
 //BA.debugLineNum = 113311766;BA.debugLine="Log(\"Error downloading file \" & fileN)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113311766","Error downloading file "+_filen,0);
RDebugUtils.currentLine=113311768;
 //BA.debugLineNum = 113311768;BA.debugLine="Dim MsgFatal As String = $\"Ocorreu um Erro ao d";
_msgfatal = ("Ocorreu um Erro ao descarregar um dos ficheiros mestres."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Ficheiro FIRSTINTALL"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".SQL"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"A aplicação vai terminar !"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Por favor verifique o acesso à internet e reinstale a aplicação, depois de desinstalar a actual !");
RDebugUtils.currentLine=113311769;
 //BA.debugLineNum = 113311769;BA.debugLine="Msgbox2Async(MsgFatal, ShareCode.GeneralAlertTi";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msgfatal),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113311771;
 //BA.debugLineNum = 113311771;BA.debugLine="If File.Exists(Starter.SharedFolder,$\"date_inst";
if (true) break;

case 13:
//if
this.state = 16;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=113311772;
 //BA.debugLineNum = 113311772;BA.debugLine="File.Delete(Starter.SharedFolder,$\"date_instal";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"));
RDebugUtils.currentLine=113311773;
 //BA.debugLineNum = 113311773;BA.debugLine="ShareCode.Installed_Date = \"\"";
parent.mostCurrent._sharecode._installed_date /*String*/  = "";
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=113311776;
 //BA.debugLineNum = 113311776;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "downloadsqlfiles"), null);
this.state = 26;
return;
case 26:
//C
this.state = 17;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=113311778;
 //BA.debugLineNum = 113311778;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=113311779;
 //BA.debugLineNum = 113311779;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 24;
;
RDebugUtils.currentLine=113311784;
 //BA.debugLineNum = 113311784;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
_updateprogressbar((long) (_sqlfilestotal),(long) (_i));
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=113311787;
 //BA.debugLineNum = 113311787;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=113311789;
 //BA.debugLineNum = 113311789;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=113311790;
 //BA.debugLineNum = 113311790;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _filefoldertest() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "filefoldertest", false))
	 {Debug.delegate(mostCurrent.activityBA, "filefoldertest", null); return;}
ResumableSub_FileFolderTest rsub = new ResumableSub_FileFolderTest(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_FileFolderTest extends BA.ResumableSub {
public ResumableSub_FileFolderTest(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
boolean _permissionsgoodflag = false;
String _permission = "";
boolean _yaeornay = false;
xevolution.vrcg.devdemov2400.fileprovider _provider = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=110100482;
 //BA.debugLineNum = 110100482;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
RDebugUtils.currentLine=110100483;
 //BA.debugLineNum = 110100483;BA.debugLine="Dim PermissionsGoodFlag As Boolean = True";
_permissionsgoodflag = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=110100485;
 //BA.debugLineNum = 110100485;BA.debugLine="If PermissionsGoodFlag Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_permissionsgoodflag) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=110100486;
 //BA.debugLineNum = 110100486;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_READ_EXTERNAL_S";
_rp.CheckAndRequest(processBA,_rp.PERMISSION_READ_EXTERNAL_STORAGE);
RDebugUtils.currentLine=110100487;
 //BA.debugLineNum = 110100487;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "filefoldertest"), null);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_permission = (String) result[0];
_yaeornay = (Boolean) result[1];
;
RDebugUtils.currentLine=110100488;
 //BA.debugLineNum = 110100488;BA.debugLine="If YaeOrNay = False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_yaeornay==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=110100489;
 //BA.debugLineNum = 110100489;BA.debugLine="PermissionsGoodFlag = False";
_permissionsgoodflag = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;
;
RDebugUtils.currentLine=110100493;
 //BA.debugLineNum = 110100493;BA.debugLine="If PermissionsGoodFlag Then";

case 8:
//if
this.state = 15;
if (_permissionsgoodflag) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=110100494;
 //BA.debugLineNum = 110100494;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_WRITE_EXTERNAL_";
_rp.CheckAndRequest(processBA,_rp.PERMISSION_WRITE_EXTERNAL_STORAGE);
RDebugUtils.currentLine=110100495;
 //BA.debugLineNum = 110100495;BA.debugLine="Wait For Activity_PermissionResult (Permission A";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "filefoldertest"), null);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_permission = (String) result[0];
_yaeornay = (Boolean) result[1];
;
RDebugUtils.currentLine=110100496;
 //BA.debugLineNum = 110100496;BA.debugLine="If YaeOrNay = False Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_yaeornay==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=110100497;
 //BA.debugLineNum = 110100497;BA.debugLine="PermissionsGoodFlag = False";
_permissionsgoodflag = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=110100501;
 //BA.debugLineNum = 110100501;BA.debugLine="Log(\"PermissionsGoodFlag = \" & PermissionsGoodFla";
anywheresoftware.b4a.keywords.Common.LogImpl("6110100501","PermissionsGoodFlag = "+BA.ObjectToString(_permissionsgoodflag),0);
RDebugUtils.currentLine=110100503;
 //BA.debugLineNum = 110100503;BA.debugLine="Private Provider As FileProvider";
_provider = new xevolution.vrcg.devdemov2400.fileprovider();
RDebugUtils.currentLine=110100504;
 //BA.debugLineNum = 110100504;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=110100505;
 //BA.debugLineNum = 110100505;BA.debugLine="Provider.GetApkFileUri()";
_provider._getapkfileuri /*Object*/ (null);
RDebugUtils.currentLine=110100507;
 //BA.debugLineNum = 110100507;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _first_ftp_downloadprogress(String _serverpath,long _totaldownloaded,long _total) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "first_ftp_downloadprogress", false))
	 {Debug.delegate(mostCurrent.activityBA, "first_ftp_downloadprogress", new Object[] {_serverpath,_totaldownloaded,_total}); return;}
ResumableSub_FIRST_FTP_DownloadProgress rsub = new ResumableSub_FIRST_FTP_DownloadProgress(null,_serverpath,_totaldownloaded,_total);
rsub.resume(processBA, null);
}
public static class ResumableSub_FIRST_FTP_DownloadProgress extends BA.ResumableSub {
public ResumableSub_FIRST_FTP_DownloadProgress(xevolution.vrcg.devdemov2400.main parent,String _serverpath,long _totaldownloaded,long _total) {
this.parent = parent;
this._serverpath = _serverpath;
this._totaldownloaded = _totaldownloaded;
this._total = _total;
}
xevolution.vrcg.devdemov2400.main parent;
String _serverpath;
long _totaldownloaded;
long _total;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=112787457;
 //BA.debugLineNum = 112787457;BA.debugLine="UpdateProgressBar(DB_Size,TotalDownloaded)";
_updateprogressbar(parent._db_size,_totaldownloaded);
RDebugUtils.currentLine=112787458;
 //BA.debugLineNum = 112787458;BA.debugLine="Sleep(50)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "first_ftp_downloadprogress"),(int) (50));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=112787459;
 //BA.debugLineNum = 112787459;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _firstinstallcompleteprocedure() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "firstinstallcompleteprocedure", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "firstinstallcompleteprocedure", null));}
ResumableSub_FirstInstallCompleteProcedure rsub = new ResumableSub_FirstInstallCompleteProcedure(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FirstInstallCompleteProcedure extends BA.ResumableSub {
public ResumableSub_FirstInstallCompleteProcedure(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
String _exceptionerror = "";
String _first_install_info = "";
String _firstinstallfilesname = "";
int _sqlfilestotal = 0;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
boolean _dotry = false;
int _trycount = 0;
Object _sf = null;
String _serverpath = "";
boolean _success = false;
String _testejson = "";
int _result = 0;
Object _resultobj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113704966;
 //BA.debugLineNum = 113704966;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=113704967;
 //BA.debugLineNum = 113704967;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=113704968;
 //BA.debugLineNum = 113704968;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=113704969;
 //BA.debugLineNum = 113704969;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=113704971;
 //BA.debugLineNum = 113704971;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113704972;
 //BA.debugLineNum = 113704972;BA.debugLine="LabelTarefa.Visible = False";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113704974;
 //BA.debugLineNum = 113704974;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((long) (100),(long) (0));
RDebugUtils.currentLine=113704975;
 //BA.debugLineNum = 113704975;BA.debugLine="UpdateProgressBar2(100,0)";
_updateprogressbar2((long) (100),(long) (0));
RDebugUtils.currentLine=113704977;
 //BA.debugLineNum = 113704977;BA.debugLine="Private ExceptionError As String = \"\"";
_exceptionerror = "";
RDebugUtils.currentLine=113704986;
 //BA.debugLineNum = 113704986;BA.debugLine="PanelDownloadInicial.Visible = True";
parent.mostCurrent._paneldownloadinicial.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113704989;
 //BA.debugLineNum = 113704989;BA.debugLine="ShareCode.AwakeDevice(True)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113704991;
 //BA.debugLineNum = 113704991;BA.debugLine="SetFTPUser";
_setftpuser();
RDebugUtils.currentLine=113704993;
 //BA.debugLineNum = 113704993;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 45;
this.catchState = 44;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 44;
RDebugUtils.currentLine=113704994;
 //BA.debugLineNum = 113704994;BA.debugLine="LabelDownloadInicialTitle.Text = ShareCode.MsgUp";
parent.mostCurrent._labeldownloadinicialtitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso1primeirainstalacao /*String*/ ));
RDebugUtils.currentLine=113704996;
 //BA.debugLineNum = 113704996;BA.debugLine="Dim FIRST_INSTALL_INFO As String = \"FIRSTINSTALL";
_first_install_info = "FIRSTINSTALL.INFO";
RDebugUtils.currentLine=113704997;
 //BA.debugLineNum = 113704997;BA.debugLine="Dim firstInstallFilesName As String = \"FIRSTINST";
_firstinstallfilesname = "FIRSTINSTALL";
RDebugUtils.currentLine=113704999;
 //BA.debugLineNum = 113704999;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstInstallComplete";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstInstallCompleteProc",("DOWNLOAD MESTRES"));
RDebugUtils.currentLine=113705001;
 //BA.debugLineNum = 113705001;BA.debugLine="Check_FIRSTINSTALL_IN_PROGRESS";
_check_firstinstall_in_progress();
RDebugUtils.currentLine=113705004;
 //BA.debugLineNum = 113705004;BA.debugLine="If File.Exists(Starter.Provider.SharedFolder, FI";
if (true) break;

case 4:
//if
this.state = 35;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 35;
RDebugUtils.currentLine=113705005;
 //BA.debugLineNum = 113705005;BA.debugLine="Log(\"FIRSTINSTALL JA EXISTE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705005","FIRSTINSTALL JA EXISTE",0);
RDebugUtils.currentLine=113705007;
 //BA.debugLineNum = 113705007;BA.debugLine="DeleteAndCopyDatabase";
_deleteandcopydatabase();
RDebugUtils.currentLine=113705008;
 //BA.debugLineNum = 113705008;BA.debugLine="SetInfo(FIRST_INSTALL_INFO)";
_setinfo(_first_install_info);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=113705011;
 //BA.debugLineNum = 113705011;BA.debugLine="Log(\"FIRSTINSTALL NAO EXISTE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705011","FIRSTINSTALL NAO EXISTE",0);
RDebugUtils.currentLine=113705015;
 //BA.debugLineNum = 113705015;BA.debugLine="Dim SqlFilesTotal As Int = 0";
_sqlfilestotal = (int) (0);
RDebugUtils.currentLine=113705016;
 //BA.debugLineNum = 113705016;BA.debugLine="Dim GlobalFTP As FTP = CreateGlobalFTP";
_globalftp = _createglobalftp();
RDebugUtils.currentLine=113705018;
 //BA.debugLineNum = 113705018;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=113705019;
 //BA.debugLineNum = 113705019;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=113705020;
 //BA.debugLineNum = 113705020;BA.debugLine="Do While (dotry And (trycount < 3))";
if (true) break;

case 9:
//do while
this.state = 30;
while ((_dotry && (_trycount<3))) {
this.state = 11;
if (true) break;
}
if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=113705022;
 //BA.debugLineNum = 113705022;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_first_install_info,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=113705023;
 //BA.debugLineNum = 113705023;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "firstinstallcompleteprocedure"), _sf);
this.state = 46;
return;
case 46:
//C
this.state = 12;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=113705025;
 //BA.debugLineNum = 113705025;BA.debugLine="If Success Then";
if (true) break;

case 12:
//if
this.state = 29;
if (_success) { 
this.state = 14;
}else {
this.state = 28;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=113705027;
 //BA.debugLineNum = 113705027;BA.debugLine="Try";
if (true) break;

case 15:
//try
this.state = 26;
this.catchState = 25;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 25;
RDebugUtils.currentLine=113705028;
 //BA.debugLineNum = 113705028;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.M";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=113705029;
 //BA.debugLineNum = 113705029;BA.debugLine="Log(FIRST_INSTALL_INFO & \" file was download";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705029",_first_install_info+" file was download successfully",0);
RDebugUtils.currentLine=113705036;
 //BA.debugLineNum = 113705036;BA.debugLine="Dim TesteJson As String = File.readstring(St";
_testejson = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=113705038;
 //BA.debugLineNum = 113705038;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=113705039;
 //BA.debugLineNum = 113705039;BA.debugLine="SqlFilesTotal = Read_FIRST_INSTALL_INFO(FIR";
_sqlfilestotal = _read_first_install_info(_first_install_info,_testejson);
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=113705041;
 //BA.debugLineNum = 113705041;BA.debugLine="SqlFilesTotal = Read_FIRST_INSTALL_INFO_Lis";
_sqlfilestotal = _read_first_install_info_list(_first_install_info);
 if (true) break;

case 23:
//C
this.state = 26;
;
RDebugUtils.currentLine=113705044;
 //BA.debugLineNum = 113705044;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=113705045;
 //BA.debugLineNum = 113705045;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=113705046;
 //BA.debugLineNum = 113705046;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 44;
RDebugUtils.currentLine=113705049;
 //BA.debugLineNum = 113705049;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705049",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113705050;
 //BA.debugLineNum = 113705050;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=113705051;
 //BA.debugLineNum = 113705051;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
this.catchState = 44;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=113705054;
 //BA.debugLineNum = 113705054;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705054",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113705055;
 //BA.debugLineNum = 113705055;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=113705056;
 //BA.debugLineNum = 113705056;BA.debugLine="Log(\"Error downloading file :\" & FIRST_INSTAL";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705056","Error downloading file :"+_first_install_info,0);
RDebugUtils.currentLine=113705057;
 //BA.debugLineNum = 113705057;BA.debugLine="Msgbox2Async($\"Sem informação de instalação n";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("Sem informação de instalação no servidor."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Por favor desinstale a Aplicação"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"e contacte a assistencia antes de tentar de novo."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Obrigado")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),"OK","","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113705058;
 //BA.debugLineNum = 113705058;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "firstinstallcompleteprocedure"), null);
this.state = 47;
return;
case 47:
//C
this.state = 29;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=113705059;
 //BA.debugLineNum = 113705059;BA.debugLine="ExceptionError = LastException";
_exceptionerror = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA));
RDebugUtils.currentLine=113705060;
 //BA.debugLineNum = 113705060;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=113705061;
 //BA.debugLineNum = 113705061;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 if (true) break;

case 29:
//C
this.state = 9;
;
RDebugUtils.currentLine=113705063;
 //BA.debugLineNum = 113705063;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=113705065;
 //BA.debugLineNum = 113705065;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=113705067;
 //BA.debugLineNum = 113705067;BA.debugLine="CheckIf_SqlFilesTotal_IsEqualToZero(SqlFilesTot";
_checkif_sqlfilestotal_isequaltozero(_sqlfilestotal);
RDebugUtils.currentLine=113705074;
 //BA.debugLineNum = 113705074;BA.debugLine="If(SqlFilesTotal > 0) Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((_sqlfilestotal>0)) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=113705075;
 //BA.debugLineNum = 113705075;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.Msg";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ ));
RDebugUtils.currentLine=113705077;
 //BA.debugLineNum = 113705077;BA.debugLine="Wait For(DownloadSQLFiles(SqlFilesTotal, first";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "firstinstallcompleteprocedure"), _downloadsqlfiles(_sqlfilestotal,_firstinstallfilesname));
this.state = 48;
return;
case 48:
//C
this.state = 34;
_resultobj = (Object) result[0];
;
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=113705081;
 //BA.debugLineNum = 113705081;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((long) (100),(long) (0));
RDebugUtils.currentLine=113705082;
 //BA.debugLineNum = 113705082;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "firstinstallcompleteprocedure"),(int) (500));
this.state = 49;
return;
case 49:
//C
this.state = 35;
;
 if (true) break;
;
RDebugUtils.currentLine=113705089;
 //BA.debugLineNum = 113705089;BA.debugLine="If(SqlFilesTotal > 0) Then";

case 35:
//if
this.state = 38;
if ((_sqlfilestotal>0)) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=113705090;
 //BA.debugLineNum = 113705090;BA.debugLine="Wait For(ReadAndExecuteSQLFiles(SqlFilesTotal,";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "firstinstallcompleteprocedure"), _readandexecutesqlfiles(_sqlfilestotal,_firstinstallfilesname));
this.state = 50;
return;
case 50:
//C
this.state = 38;
_resultobj = (Object) result[0];
;
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=113705093;
 //BA.debugLineNum = 113705093;BA.debugLine="UpdateProgressBar2(100,0)";
_updateprogressbar2((long) (100),(long) (0));
RDebugUtils.currentLine=113705094;
 //BA.debugLineNum = 113705094;BA.debugLine="ProgressoInicial2.visible = False";
parent.mostCurrent._progressoinicial2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113705095;
 //BA.debugLineNum = 113705095;BA.debugLine="LabelTarefa.Visible = False";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113705096;
 //BA.debugLineNum = 113705096;BA.debugLine="UpdateProgressBar(100,0)";
_updateprogressbar((long) (100),(long) (0));
RDebugUtils.currentLine=113705106;
 //BA.debugLineNum = 113705106;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTAL";
if (true) break;

case 39:
//if
this.state = 42;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS")) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=113705107;
 //BA.debugLineNum = 113705107;BA.debugLine="File.Delete(Starter.SharedFolder,\"FIRSTINSTALL_";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS");
 if (true) break;

case 42:
//C
this.state = 45;
;
RDebugUtils.currentLine=113705110;
 //BA.debugLineNum = 113705110;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=113705111;
 //BA.debugLineNum = 113705111;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=113705112;
 //BA.debugLineNum = 113705112;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113705113;
 //BA.debugLineNum = 113705113;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=113705115;
 //BA.debugLineNum = 113705115;BA.debugLine="DownloadFilesToDocsFolder(GlobalFTP)";
_downloadfilestodocsfolder(_globalftp);
RDebugUtils.currentLine=113705116;
 //BA.debugLineNum = 113705116;BA.debugLine="DownloadFilesToTemplatesFolder(GlobalFTP)";
_downloadfilestotemplatesfolder(_globalftp);
RDebugUtils.currentLine=113705117;
 //BA.debugLineNum = 113705117;BA.debugLine="DownloadFilesToInternoFolder(GlobalFTP)";
_downloadfilestointernofolder(_globalftp);
RDebugUtils.currentLine=113705119;
 //BA.debugLineNum = 113705119;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=113705129;
 //BA.debugLineNum = 113705129;BA.debugLine="SetUserLanguage";
_setuserlanguage();
RDebugUtils.currentLine=113705133;
 //BA.debugLineNum = 113705133;BA.debugLine="ShareCode.AwakeDevice(False)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113705135;
 //BA.debugLineNum = 113705135;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=113705141;
 //BA.debugLineNum = 113705141;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=113705142;
 //BA.debugLineNum = 113705142;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=113705143;
 //BA.debugLineNum = 113705143;BA.debugLine="StartService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=113705144;
 //BA.debugLineNum = 113705144;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113705145;
 //BA.debugLineNum = 113705145;BA.debugLine="Starter.FirstInstall = True";
parent.mostCurrent._starter._firstinstall /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=113705146;
 //BA.debugLineNum = 113705146;BA.debugLine="MsgboxAsync(LastException.Message, ShareCode.Gen";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getMessage()),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),processBA);
RDebugUtils.currentLine=113705147;
 //BA.debugLineNum = 113705147;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113705147",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113705148;
 //BA.debugLineNum = 113705148;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=113705151;
 //BA.debugLineNum = 113705151;BA.debugLine="ShareCode.AwakeDevice(False)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113705152;
 //BA.debugLineNum = 113705152;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 45:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=113705154;
 //BA.debugLineNum = 113705154;BA.debugLine="End Sub";
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
public static String  _updateprogressbar2(long _maxval,long _currentval) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateprogressbar2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateprogressbar2", new Object[] {_maxval,_currentval}));}
RDebugUtils.currentLine=113836032;
 //BA.debugLineNum = 113836032;BA.debugLine="Sub UpdateProgressBar2(MaxVal As Long, CurrentVal";
RDebugUtils.currentLine=113836033;
 //BA.debugLineNum = 113836033;BA.debugLine="Dim CurrentVal As Long = (100 * CurrentVal / MaxV";
_currentval = (long) ((100*_currentval/(double)_maxval));
RDebugUtils.currentLine=113836034;
 //BA.debugLineNum = 113836034;BA.debugLine="ProgressoInicial2.Progress = CurrentVal";
mostCurrent._progressoinicial2.setProgress((int) (_currentval));
RDebugUtils.currentLine=113836035;
 //BA.debugLineNum = 113836035;BA.debugLine="End Sub";
return "";
}
public static String  _setinfo(String _first_install_info) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setinfo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setinfo", new Object[] {_first_install_info}));}
String _jsonstruct = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _datahora = "";
int _sqlfilestotal = 0;
String _date = "";
RDebugUtils.currentLine=113049600;
 //BA.debugLineNum = 113049600;BA.debugLine="Sub SetInfo(FIRST_INSTALL_INFO As String)";
RDebugUtils.currentLine=113049602;
 //BA.debugLineNum = 113049602;BA.debugLine="Dim JsonStruct As String = File.readstring(Starte";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=113049603;
 //BA.debugLineNum = 113049603;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=113049604;
 //BA.debugLineNum = 113049604;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=113049605;
 //BA.debugLineNum = 113049605;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=113049607;
 //BA.debugLineNum = 113049607;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=113049608;
 //BA.debugLineNum = 113049608;BA.debugLine="File.writeString(Starter.SharedFolder,$\"date_inst";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"),_datahora);
RDebugUtils.currentLine=113049609;
 //BA.debugLineNum = 113049609;BA.debugLine="ShareCode.Installed_Date = DataHora";
mostCurrent._sharecode._installed_date /*String*/  = _datahora;
RDebugUtils.currentLine=113049610;
 //BA.debugLineNum = 113049610;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Share";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"),_datahora);
RDebugUtils.currentLine=113049612;
 //BA.debugLineNum = 113049612;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files\")";
_sqlfilestotal = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=113049614;
 //BA.debugLineNum = 113049614;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=113049615;
 //BA.debugLineNum = 113049615;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=113049616;
 //BA.debugLineNum = 113049616;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=113049618;
 //BA.debugLineNum = 113049618;BA.debugLine="CheckIf_SqlFilesTotal_IsEqualToZero(SqlFilesTotal";
_checkif_sqlfilestotal_isequaltozero(_sqlfilestotal);
RDebugUtils.currentLine=113049619;
 //BA.debugLineNum = 113049619;BA.debugLine="End Sub";
return "";
}
public static int  _read_first_install_info(String _first_install_info,String _testejson) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "read_first_install_info", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "read_first_install_info", new Object[] {_first_install_info,_testejson}));}
String _jsonstruct = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _datahora = "";
int _sqlfilestotal = 0;
anywheresoftware.b4a.objects.collections.List _inserts = null;
String _date = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
RDebugUtils.currentLine=113115136;
 //BA.debugLineNum = 113115136;BA.debugLine="Sub Read_FIRST_INSTALL_INFO(FIRST_INSTALL_INFO As";
RDebugUtils.currentLine=113115137;
 //BA.debugLineNum = 113115137;BA.debugLine="If TesteJson.Contains(\"{\") Then";
if (_testejson.contains("{")) { 
RDebugUtils.currentLine=113115138;
 //BA.debugLineNum = 113115138;BA.debugLine="Dim JsonStruct As String = File.readstring(Start";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=113115139;
 //BA.debugLineNum = 113115139;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=113115140;
 //BA.debugLineNum = 113115140;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=113115141;
 //BA.debugLineNum = 113115141;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=113115142;
 //BA.debugLineNum = 113115142;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=113115143;
 //BA.debugLineNum = 113115143;BA.debugLine="File.writeString(Starter.SharedFolder,$\"date_ins";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._sharedfolder /*String*/ ,("date_installed.log"),_datahora);
RDebugUtils.currentLine=113115144;
 //BA.debugLineNum = 113115144;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Shar";
anywheresoftware.b4a.keywords.Common.File.WriteString(mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"),_datahora);
RDebugUtils.currentLine=113115145;
 //BA.debugLineNum = 113115145;BA.debugLine="Dim SqlFilesTotal As Int = root.Get(\"files\")";
_sqlfilestotal = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=113115146;
 //BA.debugLineNum = 113115146;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=113115147;
 //BA.debugLineNum = 113115147;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=113115148;
 //BA.debugLineNum = 113115148;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=113115149;
 //BA.debugLineNum = 113115149;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
 }else {
RDebugUtils.currentLine=113115151;
 //BA.debugLineNum = 113115151;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113115152;
 //BA.debugLineNum = 113115152;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedFol";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=113115153;
 //BA.debugLineNum = 113115153;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de ficheir";
_sqlfilestotal = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=113115154;
 //BA.debugLineNum = 113115154;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=113115155;
 //BA.debugLineNum = 113115155;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=113115156;
 //BA.debugLineNum = 113115156;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
 };
RDebugUtils.currentLine=113115158;
 //BA.debugLineNum = 113115158;BA.debugLine="Return SqlFilesTotal";
if (true) return _sqlfilestotal;
RDebugUtils.currentLine=113115159;
 //BA.debugLineNum = 113115159;BA.debugLine="End Sub";
return 0;
}
public static int  _read_first_install_info_list(String _first_install_info) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "read_first_install_info_list", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "read_first_install_info_list", new Object[] {_first_install_info}));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _sqlfilestotal = 0;
String _date = "";
RDebugUtils.currentLine=113180672;
 //BA.debugLineNum = 113180672;BA.debugLine="Sub Read_FIRST_INSTALL_INFO_List(FIRST_INSTALL_INF";
RDebugUtils.currentLine=113180673;
 //BA.debugLineNum = 113180673;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113180674;
 //BA.debugLineNum = 113180674;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedFold";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_first_install_info);
RDebugUtils.currentLine=113180675;
 //BA.debugLineNum = 113180675;BA.debugLine="Dim SqlFilesTotal As Int = List1.Get(0) ' Numero";
_sqlfilestotal = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=113180676;
 //BA.debugLineNum = 113180676;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=113180677;
 //BA.debugLineNum = 113180677;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=113180678;
 //BA.debugLineNum = 113180678;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=113180680;
 //BA.debugLineNum = 113180680;BA.debugLine="Return SqlFilesTotal";
if (true) return _sqlfilestotal;
RDebugUtils.currentLine=113180681;
 //BA.debugLineNum = 113180681;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _readandexecutesqlfiles(int _sqlfilestotal,String _firstinstallfilesname) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "readandexecutesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "readandexecutesqlfiles", new Object[] {_sqlfilestotal,_firstinstallfilesname}));}
ResumableSub_ReadAndExecuteSQLFiles rsub = new ResumableSub_ReadAndExecuteSQLFiles(null,_sqlfilestotal,_firstinstallfilesname);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReadAndExecuteSQLFiles extends BA.ResumableSub {
public ResumableSub_ReadAndExecuteSQLFiles(xevolution.vrcg.devdemov2400.main parent,int _sqlfilestotal,String _firstinstallfilesname) {
this.parent = parent;
this._sqlfilestotal = _sqlfilestotal;
this._firstinstallfilesname = _firstinstallfilesname;
}
xevolution.vrcg.devdemov2400.main parent;
int _sqlfilestotal;
String _firstinstallfilesname;
int _i = 0;
int _totallinesofscripts = 0;
String _filen = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _n = 0;
String _script2execute = "";
int step1;
int limit1;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=113377281;
 //BA.debugLineNum = 113377281;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 1:
//for
this.state = 19;
step1 = 1;
limit1 = _sqlfilestotal;
_i = (int) (1) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 19;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step1)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=113377282;
 //BA.debugLineNum = 113377282;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=113377283;
 //BA.debugLineNum = 113377283;BA.debugLine="LabelDownloadInicialFases.Text = ShareCode.MsgUp";
parent.mostCurrent._labeldownloadinicialfases.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sqlfilestotal))+"")));
RDebugUtils.currentLine=113377284;
 //BA.debugLineNum = 113377284;BA.debugLine="Dim fileN As String = $\"${firstInstallFilesName}";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_firstinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=113377286;
 //BA.debugLineNum = 113377286;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=113377288;
 //BA.debugLineNum = 113377288;BA.debugLine="If (List1.IsInitialized) Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((_list1.IsInitialized())) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=113377289;
 //BA.debugLineNum = 113377289;BA.debugLine="List1.Clear";
_list1.Clear();
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=113377291;
 //BA.debugLineNum = 113377291;BA.debugLine="List1.Initialize";
_list1.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=113377294;
 //BA.debugLineNum = 113377294;BA.debugLine="Try";

case 9:
//try
this.state = 14;
this.catchState = 13;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 14;
this.catchState = 13;
RDebugUtils.currentLine=113377295;
 //BA.debugLineNum = 113377295;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedFo";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=113377296;
 //BA.debugLineNum = 113377296;BA.debugLine="TotalLinesOfScripts = List1.Size";
_totallinesofscripts = _list1.getSize();
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=113377298;
 //BA.debugLineNum = 113377298;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6113377298",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=113377299;
 //BA.debugLineNum = 113377299;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
;
RDebugUtils.currentLine=113377302;
 //BA.debugLineNum = 113377302;BA.debugLine="UpdateProgressBar2(100,0)";
_updateprogressbar2((long) (100),(long) (0));
RDebugUtils.currentLine=113377303;
 //BA.debugLineNum = 113377303;BA.debugLine="ProgressoInicial2.visible = True";
parent.mostCurrent._progressoinicial2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113377304;
 //BA.debugLineNum = 113377304;BA.debugLine="LabelTarefa.Visible = True";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=113377306;
 //BA.debugLineNum = 113377306;BA.debugLine="For n = 0 To List1.Size -1";
if (true) break;

case 15:
//for
this.state = 18;
step21 = 1;
limit21 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 18;
if ((step21 > 0 && _n <= limit21) || (step21 < 0 && _n >= limit21)) this.state = 17;
if (true) break;

case 23:
//C
this.state = 22;
_n = ((int)(0 + _n + step21)) ;
if (true) break;

case 17:
//C
this.state = 23;
RDebugUtils.currentLine=113377307;
 //BA.debugLineNum = 113377307;BA.debugLine="LabelTarefa.Text = ShareCode.MsgExecProcAct & $";
parent.mostCurrent._labeltarefa.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totallinesofscripts))+"")));
RDebugUtils.currentLine=113377308;
 //BA.debugLineNum = 113377308;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
_script2execute = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=113377309;
 //BA.debugLineNum = 113377309;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"Main",_script2execute,"");
RDebugUtils.currentLine=113377310;
 //BA.debugLineNum = 113377310;BA.debugLine="UpdateProgressBar2(TotalLinesOfScripts,n)";
_updateprogressbar2((long) (_totallinesofscripts),(long) (_n));
RDebugUtils.currentLine=113377311;
 //BA.debugLineNum = 113377311;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "readandexecutesqlfiles"),(int) (1));
this.state = 24;
return;
case 24:
//C
this.state = 23;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
;
RDebugUtils.currentLine=113377314;
 //BA.debugLineNum = 113377314;BA.debugLine="ProgressoInicial2.visible = False";
parent.mostCurrent._progressoinicial2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113377315;
 //BA.debugLineNum = 113377315;BA.debugLine="LabelTarefa.Visible = False";
parent.mostCurrent._labeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=113377316;
 //BA.debugLineNum = 113377316;BA.debugLine="UpdateProgressBar(SqlFilesTotal,i)";
_updateprogressbar((long) (_sqlfilestotal),(long) (_i));
RDebugUtils.currentLine=113377317;
 //BA.debugLineNum = 113377317;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "readandexecutesqlfiles"),(int) (1));
this.state = 25;
return;
case 25:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=113377320;
 //BA.debugLineNum = 113377320;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=113377321;
 //BA.debugLineNum = 113377321;BA.debugLine="End Sub";
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
public static String  _setuserlanguage() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setuserlanguage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setuserlanguage", null));}
RDebugUtils.currentLine=112197632;
 //BA.debugLineNum = 112197632;BA.debugLine="Sub SetUserLanguage";
RDebugUtils.currentLine=112197633;
 //BA.debugLineNum = 112197633;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._userlanguage /*String*/ )) { 
RDebugUtils.currentLine=112197634;
 //BA.debugLineNum = 112197634;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._userlanguage /*String*/ );
 }else {
RDebugUtils.currentLine=112197636;
 //BA.debugLineNum = 112197636;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 };
RDebugUtils.currentLine=112197638;
 //BA.debugLineNum = 112197638;BA.debugLine="End Sub";
return "";
}
public static void  _forceresetpassword(boolean _reset,String _uname) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "forceresetpassword", false))
	 {Debug.delegate(mostCurrent.activityBA, "forceresetpassword", new Object[] {_reset,_uname}); return;}
ResumableSub_ForceResetPassword rsub = new ResumableSub_ForceResetPassword(null,_reset,_uname);
rsub.resume(processBA, null);
}
public static class ResumableSub_ForceResetPassword extends BA.ResumableSub {
public ResumableSub_ForceResetPassword(xevolution.vrcg.devdemov2400.main parent,boolean _reset,String _uname) {
this.parent = parent;
this._reset = _reset;
this._uname = _uname;
}
xevolution.vrcg.devdemov2400.main parent;
boolean _reset;
String _uname;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _sccommand = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _confuser = "";
String _resultstr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111804422;
 //BA.debugLineNum = 111804422;BA.debugLine="If Reset Then";
if (true) break;

case 1:
//if
this.state = 31;
if (_reset) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111804423;
 //BA.debugLineNum = 111804423;BA.debugLine="Dim appldialog As CustomLayoutDialog";
_appldialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=111804424;
 //BA.debugLineNum = 111804424;BA.debugLine="Dim sf As Object = appldialog.ShowAsync(\"Alteraç";
_sf = _appldialog.ShowAsync("Alteração palavra passe","Confirmar","Cancelar","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=111804426;
 //BA.debugLineNum = 111804426;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Con";
parent.mostCurrent._utils._setdialogcolors /*String*/ (mostCurrent.activityBA,_sf,parent.mostCurrent._consts._colorwhite /*int*/ ,parent.mostCurrent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=111804427;
 //BA.debugLineNum = 111804427;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=111804428;
 //BA.debugLineNum = 111804428;BA.debugLine="appldialog.SetSize(60%x, 40%y)";
_appldialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (60),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (40),mostCurrent.activityBA));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=111804430;
 //BA.debugLineNum = 111804430;BA.debugLine="appldialog.SetSize(60%x, 40%y)";
_appldialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (60),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (40),mostCurrent.activityBA));
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=111804432;
 //BA.debugLineNum = 111804432;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "forceresetpassword"), _sf);
this.state = 32;
return;
case 32:
//C
this.state = 10;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=111804433;
 //BA.debugLineNum = 111804433;BA.debugLine="pnl.LoadLayout(\"dialogoforcepassword\")";
_pnl.LoadLayout("dialogoforcepassword",mostCurrent.activityBA);
RDebugUtils.currentLine=111804436;
 //BA.debugLineNum = 111804436;BA.debugLine="If newpass1.Text = \"\" Or newpass2.Text = \"\" Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((parent.mostCurrent._newpass1.getText()).equals("") || (parent.mostCurrent._newpass2.getText()).equals("")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=111804437;
 //BA.debugLineNum = 111804437;BA.debugLine="appldialog.GetButton(DialogResponse.POSITIVE).E";
_appldialog.GetButton(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=111804440;
 //BA.debugLineNum = 111804440;BA.debugLine="If newpass2.text <> newpass1.Text Then";

case 13:
//if
this.state = 16;
if ((parent.mostCurrent._newpass2.getText()).equals(parent.mostCurrent._newpass1.getText()) == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=111804441;
 //BA.debugLineNum = 111804441;BA.debugLine="appldialog.GetButton(DialogResponse.POSITIVE).E";
_appldialog.GetButton(anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE).setEnabled(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=111804444;
 //BA.debugLineNum = 111804444;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "forceresetpassword"), _sf);
this.state = 33;
return;
case 33:
//C
this.state = 17;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=111804446;
 //BA.debugLineNum = 111804446;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 17:
//if
this.state = 30;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=111804448;
 //BA.debugLineNum = 111804448;BA.debugLine="ShareCode.newpass = newpass2.Text";
parent.mostCurrent._sharecode._newpass /*String*/  = parent.mostCurrent._newpass2.getText();
RDebugUtils.currentLine=111804450;
 //BA.debugLineNum = 111804450;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111804451;
 //BA.debugLineNum = 111804451;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111804452;
 //BA.debugLineNum = 111804452;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111804453;
 //BA.debugLineNum = 111804453;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111804454;
 //BA.debugLineNum = 111804454;BA.debugLine="params.Put(\"_user\", uname)";
_params.Put((Object)("_user"),(Object)(_uname));
RDebugUtils.currentLine=111804455;
 //BA.debugLineNum = 111804455;BA.debugLine="params.Put(\"_key\", ShareCode.newpass)";
_params.Put((Object)("_key"),(Object)(parent.mostCurrent._sharecode._newpass /*String*/ ));
RDebugUtils.currentLine=111804456;
 //BA.debugLineNum = 111804456;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._versiontagcode));
RDebugUtils.currentLine=111804457;
 //BA.debugLineNum = 111804457;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorizatio";
_params.Put((Object)("_authorization"),(Object)(parent._deviceauthorization));
RDebugUtils.currentLine=111804458;
 //BA.debugLineNum = 111804458;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._deviceinstance));
RDebugUtils.currentLine=111804459;
 //BA.debugLineNum = 111804459;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._devicebrand));
RDebugUtils.currentLine=111804460;
 //BA.debugLineNum = 111804460;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._devicemodel));
RDebugUtils.currentLine=111804461;
 //BA.debugLineNum = 111804461;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddres";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._devicemacaddress));
RDebugUtils.currentLine=111804463;
 //BA.debugLineNum = 111804463;BA.debugLine="Dim sccommand As String = $\"username='${ShareCo";
_sccommand = ("username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ))+"', password='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._newpass /*String*/ ))+"'");
RDebugUtils.currentLine=111804464;
 //BA.debugLineNum = 111804464;BA.debugLine="Log(sccommand)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111804464",_sccommand,0);
RDebugUtils.currentLine=111804466;
 //BA.debugLineNum = 111804466;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111804467;
 //BA.debugLineNum = 111804467;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111804468;
 //BA.debugLineNum = 111804468;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111804469;
 //BA.debugLineNum = 111804469;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111804469",_data,0);
RDebugUtils.currentLine=111804470;
 //BA.debugLineNum = 111804470;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=111804471;
 //BA.debugLineNum = 111804471;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=111804473;
 //BA.debugLineNum = 111804473;BA.debugLine="Dim ConfUser As String = ShareCode.APP_URL & \"o";
_confuser = parent.mostCurrent._sharecode._app_url /*String*/ +"orion/mobile/User/change/password";
RDebugUtils.currentLine=111804474;
 //BA.debugLineNum = 111804474;BA.debugLine="Log(ConfUser)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111804474",_confuser,0);
RDebugUtils.currentLine=111804475;
 //BA.debugLineNum = 111804475;BA.debugLine="Job.PostString(ConfUser, data )";
_job._poststring /*String*/ (null,_confuser,_data);
RDebugUtils.currentLine=111804476;
 //BA.debugLineNum = 111804476;BA.debugLine="Job.GetRequest.SetContentType(\"application/json";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=111804477;
 //BA.debugLineNum = 111804477;BA.debugLine="ShareCode.newpass = \"\"";
parent.mostCurrent._sharecode._newpass /*String*/  = "";
RDebugUtils.currentLine=111804478;
 //BA.debugLineNum = 111804478;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "forceresetpassword"), (Object)(_job));
this.state = 34;
return;
case 34:
//C
this.state = 20;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111804479;
 //BA.debugLineNum = 111804479;BA.debugLine="If Job.Success Then";
if (true) break;

case 20:
//if
this.state = 23;
if (_job._success /*boolean*/ ) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=111804480;
 //BA.debugLineNum = 111804480;BA.debugLine="MsgboxAsync(\"A Password foi alterada\",ShareCod";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("A Password foi alterada"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),processBA);
RDebugUtils.currentLine=111804481;
 //BA.debugLineNum = 111804481;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111804481",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=111804482;
 //BA.debugLineNum = 111804482;BA.debugLine="Dim ResultStr As String = Job.GetString";
_resultstr = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=111804483;
 //BA.debugLineNum = 111804483;BA.debugLine="Log(ResultStr)";
anywheresoftware.b4a.keywords.Common.LogImpl("6111804483",_resultstr,0);
 if (true) break;

case 23:
//C
this.state = 30;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=111804487;
 //BA.debugLineNum = 111804487;BA.debugLine="ShareCode.newpass = \"Null\"";
parent.mostCurrent._sharecode._newpass /*String*/  = "Null";
RDebugUtils.currentLine=111804489;
 //BA.debugLineNum = 111804489;BA.debugLine="If ShareCode.newpass = \"Null\" Then";
if (true) break;

case 26:
//if
this.state = 29;
if ((parent.mostCurrent._sharecode._newpass /*String*/ ).equals("Null")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=111804497;
 //BA.debugLineNum = 111804497;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getappversion(String _date) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getappversion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getappversion", new Object[] {_date}));}
ResumableSub_GetAppVersion rsub = new ResumableSub_GetAppVersion(null,_date);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetAppVersion extends BA.ResumableSub {
public ResumableSub_GetAppVersion(xevolution.vrcg.devdemov2400.main parent,String _date) {
this.parent = parent;
this._date = _date;
}
xevolution.vrcg.devdemov2400.main parent;
String _date;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=110166018;
 //BA.debugLineNum = 110166018;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _getauthorizationtousedeviceresources() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getauthorizationtousedeviceresources", false))
	 {Debug.delegate(mostCurrent.activityBA, "getauthorizationtousedeviceresources", null); return;}
ResumableSub_GetAuthorizationToUseDeviceResources rsub = new ResumableSub_GetAuthorizationToUseDeviceResources(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetAuthorizationToUseDeviceResources extends BA.ResumableSub {
public ResumableSub_GetAuthorizationToUseDeviceResources(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109051905;
 //BA.debugLineNum = 109051905;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_SEND_SMS);
RDebugUtils.currentLine=109051906;
 //BA.debugLineNum = 109051906;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 26;
return;
case 26:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=109051907;
 //BA.debugLineNum = 109051907;BA.debugLine="If Result Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=109051908;
 //BA.debugLineNum = 109051908;BA.debugLine="Starter.APP_SEND_SMS = True";
parent.mostCurrent._starter._app_send_sms /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=109051911;
 //BA.debugLineNum = 109051911;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_ACCESS_FINE_LOCATION);
RDebugUtils.currentLine=109051912;
 //BA.debugLineNum = 109051912;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=109051913;
 //BA.debugLineNum = 109051913;BA.debugLine="If Result Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=109051914;
 //BA.debugLineNum = 109051914;BA.debugLine="Starter.APP_FINE_LOCATION_ACCESS = True";
parent.mostCurrent._starter._app_fine_location_access /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=109051917;
 //BA.debugLineNum = 109051917;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_CAMERA);
RDebugUtils.currentLine=109051918;
 //BA.debugLineNum = 109051918;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 28;
return;
case 28:
//C
this.state = 9;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=109051919;
 //BA.debugLineNum = 109051919;BA.debugLine="If Result Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_result) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=109051920;
 //BA.debugLineNum = 109051920;BA.debugLine="Starter.APP_CAMERA_ACCESS = True";
parent.mostCurrent._starter._app_camera_access /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=109051923;
 //BA.debugLineNum = 109051923;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_WRITE_EXTERNAL_STORAGE);
RDebugUtils.currentLine=109051924;
 //BA.debugLineNum = 109051924;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 29;
return;
case 29:
//C
this.state = 13;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=109051925;
 //BA.debugLineNum = 109051925;BA.debugLine="If Result Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_result) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=109051926;
 //BA.debugLineNum = 109051926;BA.debugLine="Starter.APP_CAMERA_ACCESS = True";
parent.mostCurrent._starter._app_camera_access /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=109051929;
 //BA.debugLineNum = 109051929;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_READ_EXTERNAL_STORAGE);
RDebugUtils.currentLine=109051930;
 //BA.debugLineNum = 109051930;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getauthorizationtousedeviceresources"), null);
this.state = 30;
return;
case 30:
//C
this.state = 17;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=109051931;
 //BA.debugLineNum = 109051931;BA.debugLine="If Result Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_result) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=109051932;
 //BA.debugLineNum = 109051932;BA.debugLine="Starter.APP_CAMERA_ACCESS = True";
parent.mostCurrent._starter._app_camera_access /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=109051935;
 //BA.debugLineNum = 109051935;BA.debugLine="If (Not(Starter.APP_FINE_LOCATION_ACCESS) And Not";

case 20:
//if
this.state = 25;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._app_fine_location_access /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._app_camera_access /*boolean*/ ))) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=109051936;
 //BA.debugLineNum = 109051936;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=109051938;
 //BA.debugLineNum = 109051938;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=109051940;
 //BA.debugLineNum = 109051940;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _getdefaultlanguage() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getdefaultlanguage", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getdefaultlanguage", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=108265472;
 //BA.debugLineNum = 108265472;BA.debugLine="Sub GetDefaultLanguage As String";
RDebugUtils.currentLine=108265474;
 //BA.debugLineNum = 108265474;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=108265475;
 //BA.debugLineNum = 108265475;BA.debugLine="r.Target = r.RunStaticMethod(\"java.util.Locale\",";
_r.Target = _r.RunStaticMethod("java.util.Locale","getDefault",(Object[])(anywheresoftware.b4a.keywords.Common.Null),(String[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=108265476;
 //BA.debugLineNum = 108265476;BA.debugLine="Log(r.RunMethod(\"getDisplayName\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("6108265476",BA.ObjectToString(_r.RunMethod("getDisplayName")),0);
RDebugUtils.currentLine=108265477;
 //BA.debugLineNum = 108265477;BA.debugLine="Log(r.RunMethod(\"getCountry\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("6108265477",BA.ObjectToString(_r.RunMethod("getCountry")),0);
RDebugUtils.currentLine=108265478;
 //BA.debugLineNum = 108265478;BA.debugLine="Log(r.RunMethod(\"getLanguage\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("6108265478",BA.ObjectToString(_r.RunMethod("getLanguage")),0);
RDebugUtils.currentLine=108265479;
 //BA.debugLineNum = 108265479;BA.debugLine="Return r.RunMethod(\"getLanguage\")";
if (true) return BA.ObjectToString(_r.RunMethod("getLanguage"));
RDebugUtils.currentLine=108265481;
 //BA.debugLineNum = 108265481;BA.debugLine="End Sub";
return "";
}
public static String  _getdeviceparamsfromdatabase() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getdeviceparamsfromdatabase", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "getdeviceparamsfromdatabase", null));}
RDebugUtils.currentLine=111149056;
 //BA.debugLineNum = 111149056;BA.debugLine="Sub GetDeviceParamsFromDatabase";
RDebugUtils.currentLine=111149057;
 //BA.debugLineNum = 111149057;BA.debugLine="ShareCode.DEVICE_PARAM_AS_OBS2DETAILS = 0";
mostCurrent._sharecode._device_param_as_obs2details /*int*/  = (int) (0);
RDebugUtils.currentLine=111149059;
 //BA.debugLineNum = 111149059;BA.debugLine="ShareCode.DEVICE_ONLY_TECHORUSER 			= Utils.IfNul";
mostCurrent._sharecode._device_only_techoruser /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_ONLY_TECHORUSER")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149060;
 //BA.debugLineNum = 111149060;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ID 			= Utils.IfNul";
mostCurrent._sharecode._device_show_request_id /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_SHOW_REQUEST_ID")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149061;
 //BA.debugLineNum = 111149061;BA.debugLine="ShareCode.DEVICE_PARAM_DATA_CONFIRM 		= Utils.IfN";
mostCurrent._sharecode._device_param_data_confirm /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_DATA_CONFIRM")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149062;
 //BA.debugLineNum = 111149062;BA.debugLine="ShareCode.DEVICE_PARAM_AVAILABILITY 		= Utils.IfN";
mostCurrent._sharecode._device_param_availability /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_AVAILABILITY")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149063;
 //BA.debugLineNum = 111149063;BA.debugLine="ShareCode.DEVICE_PARAM_FAVORITES 			= Utils.IfNul";
mostCurrent._sharecode._device_param_favorites /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_FAVORITES")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149064;
 //BA.debugLineNum = 111149064;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_REQUEST 		= Utils.If";
mostCurrent._sharecode._device_param_pause_request /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PAUSE_REQUEST")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149065;
 //BA.debugLineNum = 111149065;BA.debugLine="ShareCode.DEVICE_PARAM_PAUSE_TECH 			= Utils.IfNu";
mostCurrent._sharecode._device_param_pause_tech /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PAUSE_TECH")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149066;
 //BA.debugLineNum = 111149066;BA.debugLine="ShareCode.DEVICE_REQUEST_UPLOAD_ONEXECUTION = Uti";
mostCurrent._sharecode._device_request_upload_onexecution /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_UPLOAD_ONEXECUTION")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149067;
 //BA.debugLineNum = 111149067;BA.debugLine="ShareCode.DEVICE_REQUEST_AUTOUPDT_ONALERT 	= Util";
mostCurrent._sharecode._device_request_autoupdt_onalert /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_AUTOUPDT_ONALERT")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149068;
 //BA.debugLineNum = 111149068;BA.debugLine="ShareCode.DEVICE_AS_SEND_IMMEDIATLY 		= Utils.IfN";
mostCurrent._sharecode._device_as_send_immediatly /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AS_SEND_IMMEDIATLY")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149069;
 //BA.debugLineNum = 111149069;BA.debugLine="ShareCode.DEVICE_REQUEST_HIDECANCELED 		= Utils.I";
mostCurrent._sharecode._device_request_hidecanceled /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_HIDECANCELED")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149070;
 //BA.debugLineNum = 111149070;BA.debugLine="ShareCode.DEVICE_AUTOUPDATE_ONLOGIN 		= Utils.IfN";
mostCurrent._sharecode._device_autoupdate_onlogin /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AUTOUPDATE_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149071;
 //BA.debugLineNum = 111149071;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_FIRST 			= Utils.IfN";
mostCurrent._sharecode._device_auto_expand_first /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AUTO_EXPAND_FIRST")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149072;
 //BA.debugLineNum = 111149072;BA.debugLine="ShareCode.DEVICE_AUTO_EXPAND_CHECKLIST 		= Utils.";
mostCurrent._sharecode._device_auto_expand_checklist /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AUTO_EXPAND_CHECKLIST")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149073;
 //BA.debugLineNum = 111149073;BA.debugLine="ShareCode.DEVICE_DEFAULT_ROUTE 				= Utils.IfNull";
mostCurrent._sharecode._device_default_route /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_DEFAULT_ROUTE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149074;
 //BA.debugLineNum = 111149074;BA.debugLine="ShareCode.DEVICE_AS_INCLUDE_OBS_FIRST 		= Utils.I";
mostCurrent._sharecode._device_as_include_obs_first /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_AS_INCLUDE_OBS_FIRST")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149075;
 //BA.debugLineNum = 111149075;BA.debugLine="ShareCode.DEVICE_PARAM_PRINT_DRAFT 			= Utils.IfN";
mostCurrent._sharecode._device_param_print_draft /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PRINT_DRAFT")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149076;
 //BA.debugLineNum = 111149076;BA.debugLine="ShareCode.DEVICE_SHOW_REQUEST_ROUTE 		= Utils.IfN";
mostCurrent._sharecode._device_show_request_route /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_SHOW_REQUEST_ROUTE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149077;
 //BA.debugLineNum = 111149077;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER 		= Utils.IfN";
mostCurrent._sharecode._device_request_push_other /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_PUSH_OTHER")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149078;
 //BA.debugLineNum = 111149078;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_QUALITY 		= Utils.If";
mostCurrent._sharecode._device_param_photo_quality /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_QUALITY")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149080;
 //BA.debugLineNum = 111149080;BA.debugLine="ShareCode.DEVICE_REOPEN_CHECKLISTS 			= Utils.IfN";
mostCurrent._sharecode._device_reopen_checklists /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REOPEN_CHECKLISTS")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149082;
 //BA.debugLineNum = 111149082;BA.debugLine="ShareCode.DEVICE_REQUEST_SIGNATURE_TRG 		= Utils.";
mostCurrent._sharecode._device_request_signature_trg /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_SIGNATURE_TRG")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149083;
 //BA.debugLineNum = 111149083;BA.debugLine="ShareCode.DEVICE_REQUEST_PUSH_OTHER_AUTH 	= Utils";
mostCurrent._sharecode._device_request_push_other_auth /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_PUSH_OTHER_AUTH")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149084;
 //BA.debugLineNum = 111149084;BA.debugLine="ShareCode.DEVICE_PARAM_ORIENTATION 			= Utils.IfN";
mostCurrent._sharecode._device_param_orientation /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ORIENTATION")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149085;
 //BA.debugLineNum = 111149085;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FONTSIZE 		= Utils.I";
mostCurrent._sharecode._device_param_photo_fontsize /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_FONTSIZE","value"),BA.NumberToString(12))));
RDebugUtils.currentLine=111149086;
 //BA.debugLineNum = 111149086;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_HEIGHT 		= Utils.IfN";
mostCurrent._sharecode._device_param_photo_height /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_HEIGHT","value"),BA.NumberToString(615))));
RDebugUtils.currentLine=111149087;
 //BA.debugLineNum = 111149087;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_WIDTH 			= Utils.IfN";
mostCurrent._sharecode._device_param_photo_width /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_WIDTH","value"),BA.NumberToString(820))));
RDebugUtils.currentLine=111149088;
 //BA.debugLineNum = 111149088;BA.debugLine="ShareCode.DEVICE_REQUEST_CAN_DELETE_OWNED 	= Util";
mostCurrent._sharecode._device_request_can_delete_owned /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_CAN_DELETE_OWNED")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149089;
 //BA.debugLineNum = 111149089;BA.debugLine="ShareCode.DEVICE_PARAM_PHOTO_FILETYPE 		= Utils.I";
mostCurrent._sharecode._device_param_photo_filetype /*String*/  = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._dbstructures._getparamstatefield /*String*/ (mostCurrent.activityBA,"DEVICE_PARAM_PHOTO_FILETYPE","value"),"PNG");
RDebugUtils.currentLine=111149090;
 //BA.debugLineNum = 111149090;BA.debugLine="ShareCode.DEVICE_PARAM_PULL 				= Utils.IfNullOrE";
mostCurrent._sharecode._device_param_pull /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_PULL")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149091;
 //BA.debugLineNum = 111149091;BA.debugLine="ShareCode.DEVICE_PARAM_ROUTES 				= Utils.IfNullO";
mostCurrent._sharecode._device_param_routes /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ROUTES")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149093;
 //BA.debugLineNum = 111149093;BA.debugLine="ShareCode.DEVICE_PARAM_GENERATEREPORT 		= Utils.I";
mostCurrent._sharecode._device_param_generatereport /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_GENERATEREPORT")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149095;
 //BA.debugLineNum = 111149095;BA.debugLine="ShareCode.DEVICE_PARAM_RESYNC_REQUESTS 		= Utils.";
mostCurrent._sharecode._device_param_resync_requests /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_RESYNC_REQUESTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149096;
 //BA.debugLineNum = 111149096;BA.debugLine="ShareCode.DEVICE_PARAM_RUNCL_NOTYPEREQUEST 	= Uti";
mostCurrent._sharecode._device_param_runcl_notyperequest /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_RUNCL_NOTYPEREQUEST")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149097;
 //BA.debugLineNum = 111149097;BA.debugLine="ShareCode.DEVICE_PARAM_FOTO_EVIDENCE 		= Utils.If";
mostCurrent._sharecode._device_param_foto_evidence /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_FOTO_EVIDENCE")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149098;
 //BA.debugLineNum = 111149098;BA.debugLine="ShareCode.DEVICE_PARAM_DRAW_EVIDENCE 		= Utils.If";
mostCurrent._sharecode._device_param_draw_evidence /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_DRAW_EVIDENCE")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149100;
 //BA.debugLineNum = 111149100;BA.debugLine="ShareCode.DEVICE_PARAM_SENDREPORT 					= Utils.if";
mostCurrent._sharecode._device_param_sendreport /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_SENDREPORT")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149101;
 //BA.debugLineNum = 111149101;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_OBJECT 			= Util";
mostCurrent._sharecode._device_param_canchange_object /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_CANCHANGE_OBJECT")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149102;
 //BA.debugLineNum = 111149102;BA.debugLine="ShareCode.DEVICE_PARAM_CANCHANGE_ENTITY 			= Util";
mostCurrent._sharecode._device_param_canchange_entity /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_CANCHANGE_ENTITY")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149103;
 //BA.debugLineNum = 111149103;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CANDUPLICATE 		= U";
mostCurrent._sharecode._device_param_request_canduplicate /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_CANDUPLICATE")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149104;
 //BA.debugLineNum = 111149104;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSIGNTO 			= Util";
mostCurrent._sharecode._device_param_request_assignto /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ASSIGNTO")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149105;
 //BA.debugLineNum = 111149105;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT";
mostCurrent._sharecode._device_param_request_assto_mustaccept /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149106;
 //BA.debugLineNum = 111149106;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANG";
mostCurrent._sharecode._device_param_request_infotitle_canchange /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149107;
 //BA.debugLineNum = 111149107;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE";
mostCurrent._sharecode._device_param_request_cltitle_canchange /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149108;
 //BA.debugLineNum = 111149108;BA.debugLine="ShareCode.DEVICE_PARAM_ADDITIONAL_USERS_REGISTER";
mostCurrent._sharecode._device_param_additional_users_register /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ADDITIONAL_USERS_REGISTER")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149109;
 //BA.debugLineNum = 111149109;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY";
mostCurrent._sharecode._device_param_login_mustselect_comapny /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149110;
 //BA.debugLineNum = 111149110;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONME";
mostCurrent._sharecode._device_param_login_mustselect_environment /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149111;
 //BA.debugLineNum = 111149111;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRST";
mostCurrent._sharecode._device_param_login_passwordchange_firsttime /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149112;
 //BA.debugLineNum = 111149112;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL";
mostCurrent._sharecode._device_param_login_allow_qrcode_control /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149113;
 //BA.debugLineNum = 111149113;BA.debugLine="ShareCode.DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL";
mostCurrent._sharecode._device_param_login_allow_facial_control /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149114;
 //BA.debugLineNum = 111149114;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_CONTROL";
mostCurrent._sharecode._device_param_request_enddate_control /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ENDDATE_CONTROL")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149115;
 //BA.debugLineNum = 111149115;BA.debugLine="ShareCode.DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW";
mostCurrent._sharecode._device_param_request_enddate_inday_show /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149117;
 //BA.debugLineNum = 111149117;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOWNEWICON_ONALERT 		=";
mostCurrent._sharecode._device_request_shownewicon_onalert /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_SHOWNEWICON_ONALERT")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149118;
 //BA.debugLineNum = 111149118;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST";
mostCurrent._sharecode._device_param_object_allow_new_request /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149119;
 //BA.debugLineNum = 111149119;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL 		=";
mostCurrent._sharecode._device_param_object_allow_view_all /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149120;
 //BA.debugLineNum = 111149120;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSO";
mostCurrent._sharecode._device_param_object_allow_evidence_associate /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149121;
 //BA.debugLineNum = 111149121;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB";
mostCurrent._sharecode._device_param_object_allow_requests_tab /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149122;
 //BA.debugLineNum = 111149122;BA.debugLine="ShareCode.DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUM";
mostCurrent._sharecode._device_param_object_allow_relations_jump /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149123;
 //BA.debugLineNum = 111149123;BA.debugLine="ShareCode.DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE";
mostCurrent._sharecode._device_request_update_server_onclose /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149124;
 //BA.debugLineNum = 111149124;BA.debugLine="ShareCode.DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT 		=";
mostCurrent._sharecode._device_checklist_alldocs_in_object /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149125;
 //BA.debugLineNum = 111149125;BA.debugLine="ShareCode.DEVICE_PARAM_DEFAULT_DATE_PERIOD 			= U";
mostCurrent._sharecode._device_param_default_date_period /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_DEFAULT_DATE_PERIOD")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149126;
 //BA.debugLineNum = 111149126;BA.debugLine="ShareCode.DEVICE_REQUEST_SHOW_DATE_DIVIDER 			= U";
mostCurrent._sharecode._device_request_show_date_divider /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_SHOW_DATE_DIVIDER")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149128;
 //BA.debugLineNum = 111149128;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE 		=";
mostCurrent._sharecode._device_checklist_svrimgudp_onclose /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149129;
 //BA.debugLineNum = 111149129;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGE";
mostCurrent._sharecode._device_checklist_svrimgudp_width_trigger /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149130;
 //BA.debugLineNum = 111149130;BA.debugLine="ShareCode.DEVICE_ASKTOUPDATE_ONLOGIN 				= Utils.";
mostCurrent._sharecode._device_asktoupdate_onlogin /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_ASKTOUPDATE_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149131;
 //BA.debugLineNum = 111149131;BA.debugLine="ShareCode.DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY";
mostCurrent._sharecode._device_checklist_include_public_gallery /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149132;
 //BA.debugLineNum = 111149132;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REQUESTS 				= Util";
mostCurrent._sharecode._device_param_access_requests /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_REQUESTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149133;
 //BA.debugLineNum = 111149133;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_REPORTS 				= Utils";
mostCurrent._sharecode._device_param_access_reports /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_REPORTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149134;
 //BA.debugLineNum = 111149134;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_ALERTS 				= Utils.";
mostCurrent._sharecode._device_param_access_alerts /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_ALERTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149135;
 //BA.debugLineNum = 111149135;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_OBJECTS 				= Utils";
mostCurrent._sharecode._device_param_access_objects /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_OBJECTS")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149136;
 //BA.debugLineNum = 111149136;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_TASKS 				= Utils.i";
mostCurrent._sharecode._device_param_access_tasks /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_TASKS")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149137;
 //BA.debugLineNum = 111149137;BA.debugLine="ShareCode.DEVICE_PARAM_ACCESS_MYDATA 				= Utils.";
mostCurrent._sharecode._device_param_access_mydata /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACCESS_MYDATA")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149138;
 //BA.debugLineNum = 111149138;BA.debugLine="ShareCode.DEVICE_REQUEST_CUSTOMORDER 				= Utils.";
mostCurrent._sharecode._device_request_customorder /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REQUEST_CUSTOMORDER")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149140;
 //BA.debugLineNum = 111149140;BA.debugLine="ShareCode.DEVICE_CHECKLIST_STARTON_MYDATA 			= Ut";
mostCurrent._sharecode._device_checklist_starton_mydata /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_STARTON_MYDATA")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149141;
 //BA.debugLineNum = 111149141;BA.debugLine="ShareCode.DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP 		=";
mostCurrent._sharecode._device_checklist_mydata_docs_ontop /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149143;
 //BA.debugLineNum = 111149143;BA.debugLine="ShareCode.DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND";
mostCurrent._sharecode._device_checklist_objectmandatory_onend /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149144;
 //BA.debugLineNum = 111149144;BA.debugLine="ShareCode.DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONE";
mostCurrent._sharecode._device_checklist_siganturemandatory_onend /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149145;
 //BA.debugLineNum = 111149145;BA.debugLine="ShareCode.DEVICE_PARAM_ACTIVATE_PRINTMODULE 		= U";
mostCurrent._sharecode._device_param_activate_printmodule /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_ACTIVATE_PRINTMODULE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149146;
 //BA.debugLineNum = 111149146;BA.debugLine="ShareCode.DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGI";
mostCurrent._sharecode._device_param_testconnected_print_onlogin /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149147;
 //BA.debugLineNum = 111149147;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOS";
mostCurrent._sharecode._device_checklist_autoreturn_after_fotoshot /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149148;
 //BA.debugLineNum = 111149148;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSA";
mostCurrent._sharecode._device_checklist_autoreturn_after_subsaction /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149149;
 //BA.debugLineNum = 111149149;BA.debugLine="ShareCode.DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS";
mostCurrent._sharecode._device_checklist_copy_asdetails_to_obs /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149150;
 //BA.debugLineNum = 111149150;BA.debugLine="ShareCode.DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNA";
mostCurrent._sharecode._device_checklist_autoreturn_after_signature /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149152;
 //BA.debugLineNum = 111149152;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_FOTO_DEVICE = Uti";
mostCurrent._sharecode._device_param_inverted_foto_device /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_INVERTED_FOTO_DEVICE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149153;
 //BA.debugLineNum = 111149153;BA.debugLine="ShareCode.DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE";
mostCurrent._sharecode._device_param_inverted_horiz_foto_device /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149155;
 //BA.debugLineNum = 111149155;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST = Uti";
mostCurrent._sharecode._device_report_date_from_checklist /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_REPORT_DATE_FROM_CHECKLIST")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149157;
 //BA.debugLineNum = 111149157;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_START_NEWWAY = Utils";
mostCurrent._sharecode._device_typerequest_start_newway /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_TYPEREQUEST_START_NEWWAY")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149158;
 //BA.debugLineNum = 111149158;BA.debugLine="ShareCode.DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY";
mostCurrent._sharecode._device_typerequest_define_start_newway /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149160;
 //BA.debugLineNum = 111149160;BA.debugLine="ShareCode.DEVICE_EMAIL_OLD_MODEL = Utils.ifnullor";
mostCurrent._sharecode._device_email_old_model /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_EMAIL_OLD_MODEL")),BA.NumberToString(1))));
RDebugUtils.currentLine=111149161;
 //BA.debugLineNum = 111149161;BA.debugLine="ShareCode.EmailOldModel = Utils.Int2Bool(ShareCod";
mostCurrent._sharecode._emailoldmodel /*boolean*/  = mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_email_old_model /*int*/ );
RDebugUtils.currentLine=111149163;
 //BA.debugLineNum = 111149163;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH = Utils.ifnul";
mostCurrent._sharecode._device_show_global_search /*int*/  = (int)(Double.parseDouble(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_SHOW_GLOBAL_SEARCH")),BA.NumberToString(0))));
RDebugUtils.currentLine=111149167;
 //BA.debugLineNum = 111149167;BA.debugLine="If ShareCode.APP_DOMAIN.ToLowerCase = \"demo\" Or S";
if ((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("demo") || (mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("devdemo") || (mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("itg")) { 
RDebugUtils.currentLine=111149168;
 //BA.debugLineNum = 111149168;BA.debugLine="ShareCode.DEVICE_SHOW_GLOBAL_SEARCH=1";
mostCurrent._sharecode._device_show_global_search /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=111149171;
 //BA.debugLineNum = 111149171;BA.debugLine="If ShareCode.APP_DOMAIN.ToLowerCase = \"engitagus\"";
if ((mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("engitagus")) { 
RDebugUtils.currentLine=111149172;
 //BA.debugLineNum = 111149172;BA.debugLine="ShareCode.DEVICE_REPORT_DATE_FROM_CHECKLIST=0";
mostCurrent._sharecode._device_report_date_from_checklist /*int*/  = (int) (0);
 };
RDebugUtils.currentLine=111149175;
 //BA.debugLineNum = 111149175;BA.debugLine="ShareCode.DEVICE_DEF_FONT_SIZE = ShareCode.DEVICE";
mostCurrent._sharecode._device_def_font_size /*int*/  = mostCurrent._sharecode._device_param_photo_fontsize /*int*/ ;
RDebugUtils.currentLine=111149176;
 //BA.debugLineNum = 111149176;BA.debugLine="ShareCode.DEVICE_DEF_QUALITY = ShareCode.DEVICE_P";
mostCurrent._sharecode._device_def_quality /*int*/  = mostCurrent._sharecode._device_param_photo_quality /*int*/ ;
RDebugUtils.currentLine=111149177;
 //BA.debugLineNum = 111149177;BA.debugLine="ShareCode.DEVICE_DEF_IMG_FILETYPE = ShareCode.DEV";
mostCurrent._sharecode._device_def_img_filetype /*String*/  = mostCurrent._sharecode._device_param_photo_filetype /*String*/ ;
RDebugUtils.currentLine=111149178;
 //BA.debugLineNum = 111149178;BA.debugLine="ShareCode.DEVICE_DEF_IMG_WIDTH = ShareCode.DEVICE";
mostCurrent._sharecode._device_def_img_width /*int*/  = mostCurrent._sharecode._device_param_photo_width /*int*/ ;
RDebugUtils.currentLine=111149179;
 //BA.debugLineNum = 111149179;BA.debugLine="ShareCode.DEVICE_DEF_IMG_HEIGHT = ShareCode.DEVIC";
mostCurrent._sharecode._device_def_img_height /*int*/  = mostCurrent._sharecode._device_param_photo_height /*int*/ ;
RDebugUtils.currentLine=111149181;
 //BA.debugLineNum = 111149181;BA.debugLine="ShareCode.STS005 = Utils.Int2Bool(ShareCode.DEVIC";
mostCurrent._sharecode._sts005 /*boolean*/  = mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._device_request_hidecanceled /*int*/ );
RDebugUtils.currentLine=111149183;
 //BA.debugLineNum = 111149183;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getloginmainlogo() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getloginmainlogo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getloginmainlogo", null));}
ResumableSub_getLoginMainLogo rsub = new ResumableSub_getLoginMainLogo(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_getLoginMainLogo extends BA.ResumableSub {
public ResumableSub_getLoginMainLogo(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _addr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111411201;
 //BA.debugLineNum = 111411201;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111411202;
 //BA.debugLineNum = 111411202;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111411203;
 //BA.debugLineNum = 111411203;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111411204;
 //BA.debugLineNum = 111411204;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111411205;
 //BA.debugLineNum = 111411205;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._versiontagcode));
RDebugUtils.currentLine=111411206;
 //BA.debugLineNum = 111411206;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(parent._deviceauthorization));
RDebugUtils.currentLine=111411207;
 //BA.debugLineNum = 111411207;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._deviceinstance));
RDebugUtils.currentLine=111411208;
 //BA.debugLineNum = 111411208;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._devicebrand));
RDebugUtils.currentLine=111411209;
 //BA.debugLineNum = 111411209;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._devicemodel));
RDebugUtils.currentLine=111411210;
 //BA.debugLineNum = 111411210;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._devicemacaddress));
RDebugUtils.currentLine=111411211;
 //BA.debugLineNum = 111411211;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=111411212;
 //BA.debugLineNum = 111411212;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111411213;
 //BA.debugLineNum = 111411213;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111411214;
 //BA.debugLineNum = 111411214;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111411215;
 //BA.debugLineNum = 111411215;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=111411216;
 //BA.debugLineNum = 111411216;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=111411217;
 //BA.debugLineNum = 111411217;BA.debugLine="Dim addr As String = $\"https://${ShareCode.APP_DO";
_addr = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/login/logo");
RDebugUtils.currentLine=111411218;
 //BA.debugLineNum = 111411218;BA.debugLine="Job.PostString(addr, data )";
_job._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=111411219;
 //BA.debugLineNum = 111411219;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=111411220;
 //BA.debugLineNum = 111411220;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getloginmainlogo"), (Object)(_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111411221;
 //BA.debugLineNum = 111411221;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111411222;
 //BA.debugLineNum = 111411222;BA.debugLine="ShareCode.APP_MAIN_LOGO = Job.GetString";
parent.mostCurrent._sharecode._app_main_logo /*String*/  = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=111411223;
 //BA.debugLineNum = 111411223;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APP_MAIN_LOGO",parent.mostCurrent._sharecode._app_main_logo /*String*/ );
RDebugUtils.currentLine=111411224;
 //BA.debugLineNum = 111411224;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=111411225;
 //BA.debugLineNum = 111411225;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO)) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_main_logo /*String*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=111411226;
 //BA.debugLineNum = 111411226;BA.debugLine="mainPanSplashCustomLogo.SetBackgroundImage(Util";
parent.mostCurrent._mainpansplashcustomlogo.SetBackgroundImageNew((android.graphics.Bitmap)(parent.mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_main_logo /*String*/ ).getObject()));
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
RDebugUtils.currentLine=111411229;
 //BA.debugLineNum = 111411229;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=111411230;
 //BA.debugLineNum = 111411230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getloginmainlogomini() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getloginmainlogomini", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getloginmainlogomini", null));}
ResumableSub_getLoginMainLogoMini rsub = new ResumableSub_getLoginMainLogoMini(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_getLoginMainLogoMini extends BA.ResumableSub {
public ResumableSub_getLoginMainLogoMini(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _addr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111476737;
 //BA.debugLineNum = 111476737;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111476738;
 //BA.debugLineNum = 111476738;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111476739;
 //BA.debugLineNum = 111476739;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111476740;
 //BA.debugLineNum = 111476740;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111476741;
 //BA.debugLineNum = 111476741;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._versiontagcode));
RDebugUtils.currentLine=111476742;
 //BA.debugLineNum = 111476742;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(parent._deviceauthorization));
RDebugUtils.currentLine=111476743;
 //BA.debugLineNum = 111476743;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._deviceinstance));
RDebugUtils.currentLine=111476744;
 //BA.debugLineNum = 111476744;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._devicebrand));
RDebugUtils.currentLine=111476745;
 //BA.debugLineNum = 111476745;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._devicemodel));
RDebugUtils.currentLine=111476746;
 //BA.debugLineNum = 111476746;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._devicemacaddress));
RDebugUtils.currentLine=111476747;
 //BA.debugLineNum = 111476747;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=111476748;
 //BA.debugLineNum = 111476748;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111476749;
 //BA.debugLineNum = 111476749;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111476750;
 //BA.debugLineNum = 111476750;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111476751;
 //BA.debugLineNum = 111476751;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=111476752;
 //BA.debugLineNum = 111476752;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=111476753;
 //BA.debugLineNum = 111476753;BA.debugLine="Dim addr As String = $\"https://${ShareCode.APP_DO";
_addr = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/login/logo/mini");
RDebugUtils.currentLine=111476754;
 //BA.debugLineNum = 111476754;BA.debugLine="Job.PostString(addr, data )";
_job._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=111476755;
 //BA.debugLineNum = 111476755;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=111476756;
 //BA.debugLineNum = 111476756;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getloginmainlogomini"), (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111476757;
 //BA.debugLineNum = 111476757;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111476758;
 //BA.debugLineNum = 111476758;BA.debugLine="ShareCode.APP_MAIN_LOGO_MINI = Job.GetString";
parent.mostCurrent._sharecode._app_main_logo_mini /*String*/  = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=111476759;
 //BA.debugLineNum = 111476759;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APP_MAIN_LOGO_MINI",parent.mostCurrent._sharecode._app_main_logo_mini /*String*/ );
RDebugUtils.currentLine=111476760;
 //BA.debugLineNum = 111476760;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=111476762;
 //BA.debugLineNum = 111476762;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=111476763;
 //BA.debugLineNum = 111476763;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _getmainlogo(xevolution.vrcg.devdemov2400.types._authorization _authdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getmainlogo", false))
	 {Debug.delegate(mostCurrent.activityBA, "getmainlogo", new Object[] {_authdata}); return;}
ResumableSub_getMainLogo rsub = new ResumableSub_getMainLogo(null,_authdata);
rsub.resume(processBA, null);
}
public static class ResumableSub_getMainLogo extends BA.ResumableSub {
public ResumableSub_getMainLogo(xevolution.vrcg.devdemov2400.main parent,xevolution.vrcg.devdemov2400.types._authorization _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
xevolution.vrcg.devdemov2400.main parent;
xevolution.vrcg.devdemov2400.types._authorization _authdata;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _addr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111280129;
 //BA.debugLineNum = 111280129;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111280130;
 //BA.debugLineNum = 111280130;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111280131;
 //BA.debugLineNum = 111280131;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111280132;
 //BA.debugLineNum = 111280132;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111280133;
 //BA.debugLineNum = 111280133;BA.debugLine="params.Put(\"instance\",authData.Instance)";
_params.Put((Object)("instance"),(Object)(_authdata.Instance /*String*/ ));
RDebugUtils.currentLine=111280134;
 //BA.debugLineNum = 111280134;BA.debugLine="params.Put(\"authorization\",authData.Authorization";
_params.Put((Object)("authorization"),(Object)(_authdata.Authorization /*String*/ ));
RDebugUtils.currentLine=111280135;
 //BA.debugLineNum = 111280135;BA.debugLine="params.Put(\"version\", authData.Version)";
_params.Put((Object)("version"),(Object)(_authdata.Version /*String*/ ));
RDebugUtils.currentLine=111280136;
 //BA.debugLineNum = 111280136;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._versiontagcode));
RDebugUtils.currentLine=111280137;
 //BA.debugLineNum = 111280137;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(parent._deviceauthorization));
RDebugUtils.currentLine=111280138;
 //BA.debugLineNum = 111280138;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._deviceinstance));
RDebugUtils.currentLine=111280139;
 //BA.debugLineNum = 111280139;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._devicebrand));
RDebugUtils.currentLine=111280140;
 //BA.debugLineNum = 111280140;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._devicemodel));
RDebugUtils.currentLine=111280141;
 //BA.debugLineNum = 111280141;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._devicemacaddress));
RDebugUtils.currentLine=111280142;
 //BA.debugLineNum = 111280142;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=111280143;
 //BA.debugLineNum = 111280143;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111280144;
 //BA.debugLineNum = 111280144;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111280145;
 //BA.debugLineNum = 111280145;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111280146;
 //BA.debugLineNum = 111280146;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=111280147;
 //BA.debugLineNum = 111280147;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=111280148;
 //BA.debugLineNum = 111280148;BA.debugLine="ShareCode.APP_URL  = $\"https://${ShareCode.APP_DO";
parent.mostCurrent._sharecode._app_url /*String*/  = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/");
RDebugUtils.currentLine=111280149;
 //BA.debugLineNum = 111280149;BA.debugLine="Dim addr As String = ShareCode.APP_URL & ShareCod";
_addr = parent.mostCurrent._sharecode._app_url /*String*/ +parent.mostCurrent._sharecode._app_confirmlinkmainlogo /*String*/ ;
RDebugUtils.currentLine=111280150;
 //BA.debugLineNum = 111280150;BA.debugLine="Job.PostString(addr, data )";
_job._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=111280151;
 //BA.debugLineNum = 111280151;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=111280152;
 //BA.debugLineNum = 111280152;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getmainlogo"), (Object)(_job));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111280153;
 //BA.debugLineNum = 111280153;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111280154;
 //BA.debugLineNum = 111280154;BA.debugLine="ShareCode.APP_MAIN_LOGO = Job.GetString";
parent.mostCurrent._sharecode._app_main_logo /*String*/  = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=111280155;
 //BA.debugLineNum = 111280155;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APP_MAIN_LOGO",parent.mostCurrent._sharecode._app_main_logo /*String*/ );
RDebugUtils.currentLine=111280156;
 //BA.debugLineNum = 111280156;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=111280157;
 //BA.debugLineNum = 111280157;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO)) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_main_logo /*String*/ ))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=111280158;
 //BA.debugLineNum = 111280158;BA.debugLine="mainPanSplashCustomLogo.SetBackgroundImage(Util";
parent.mostCurrent._mainpansplashcustomlogo.SetBackgroundImageNew((android.graphics.Bitmap)(parent.mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_main_logo /*String*/ ).getObject()));
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
RDebugUtils.currentLine=111280161;
 //BA.debugLineNum = 111280161;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _getmainlogomini(xevolution.vrcg.devdemov2400.types._authorization _authdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getmainlogomini", false))
	 {Debug.delegate(mostCurrent.activityBA, "getmainlogomini", new Object[] {_authdata}); return;}
ResumableSub_getMainLogoMini rsub = new ResumableSub_getMainLogoMini(null,_authdata);
rsub.resume(processBA, null);
}
public static class ResumableSub_getMainLogoMini extends BA.ResumableSub {
public ResumableSub_getMainLogoMini(xevolution.vrcg.devdemov2400.main parent,xevolution.vrcg.devdemov2400.types._authorization _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
xevolution.vrcg.devdemov2400.main parent;
xevolution.vrcg.devdemov2400.types._authorization _authdata;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _addr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111345665;
 //BA.debugLineNum = 111345665;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111345666;
 //BA.debugLineNum = 111345666;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=111345667;
 //BA.debugLineNum = 111345667;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=111345668;
 //BA.debugLineNum = 111345668;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111345669;
 //BA.debugLineNum = 111345669;BA.debugLine="params.Put(\"instance\",authData.Instance)";
_params.Put((Object)("instance"),(Object)(_authdata.Instance /*String*/ ));
RDebugUtils.currentLine=111345670;
 //BA.debugLineNum = 111345670;BA.debugLine="params.Put(\"authorization\",authData.Authorization";
_params.Put((Object)("authorization"),(Object)(_authdata.Authorization /*String*/ ));
RDebugUtils.currentLine=111345671;
 //BA.debugLineNum = 111345671;BA.debugLine="params.Put(\"version\", authData.Version)";
_params.Put((Object)("version"),(Object)(_authdata.Version /*String*/ ));
RDebugUtils.currentLine=111345672;
 //BA.debugLineNum = 111345672;BA.debugLine="params.Put(\"versionTagcode\", VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent._versiontagcode));
RDebugUtils.currentLine=111345673;
 //BA.debugLineNum = 111345673;BA.debugLine="params.Put(\"_authorization\", DeviceAuthorization)";
_params.Put((Object)("_authorization"),(Object)(parent._deviceauthorization));
RDebugUtils.currentLine=111345674;
 //BA.debugLineNum = 111345674;BA.debugLine="params.Put(\"_instance\", DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent._deviceinstance));
RDebugUtils.currentLine=111345675;
 //BA.debugLineNum = 111345675;BA.debugLine="params.put(\"_deviceBrand\", DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent._devicebrand));
RDebugUtils.currentLine=111345676;
 //BA.debugLineNum = 111345676;BA.debugLine="params.put(\"_deviceModel\", DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent._devicemodel));
RDebugUtils.currentLine=111345677;
 //BA.debugLineNum = 111345677;BA.debugLine="params.put(\"_deviceMacAddress\", DeviceMacAddress)";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent._devicemacaddress));
RDebugUtils.currentLine=111345678;
 //BA.debugLineNum = 111345678;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=111345679;
 //BA.debugLineNum = 111345679;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=111345680;
 //BA.debugLineNum = 111345680;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=111345681;
 //BA.debugLineNum = 111345681;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=111345682;
 //BA.debugLineNum = 111345682;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=111345683;
 //BA.debugLineNum = 111345683;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",main.getObject());
RDebugUtils.currentLine=111345684;
 //BA.debugLineNum = 111345684;BA.debugLine="ShareCode.APP_URL  = \"https://\" & ShareCode.APP_D";
parent.mostCurrent._sharecode._app_url /*String*/  = "https://"+parent.mostCurrent._sharecode._app_domain /*String*/ +("."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/");
RDebugUtils.currentLine=111345685;
 //BA.debugLineNum = 111345685;BA.debugLine="Dim addr As String = ShareCode.APP_URL & ShareCod";
_addr = parent.mostCurrent._sharecode._app_url /*String*/ +parent.mostCurrent._sharecode._app_confirmlinkmainlogomini /*String*/ ;
RDebugUtils.currentLine=111345686;
 //BA.debugLineNum = 111345686;BA.debugLine="Job.PostString(addr, data )";
_job._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=111345687;
 //BA.debugLineNum = 111345687;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=111345688;
 //BA.debugLineNum = 111345688;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getmainlogomini"), (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111345689;
 //BA.debugLineNum = 111345689;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=111345690;
 //BA.debugLineNum = 111345690;BA.debugLine="ShareCode.APP_MAIN_LOGO_MINI = Job.GetString";
parent.mostCurrent._sharecode._app_main_logo_mini /*String*/  = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=111345692;
 //BA.debugLineNum = 111345692;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP_M";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APP_MAIN_LOGO_MINI",parent.mostCurrent._sharecode._app_main_logo_mini /*String*/ );
RDebugUtils.currentLine=111345693;
 //BA.debugLineNum = 111345693;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=111345695;
 //BA.debugLineNum = 111345695;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _getqrcode_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getqrcode_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "getqrcode_click", null); return;}
ResumableSub_getQRCode_Click rsub = new ResumableSub_getQRCode_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_getQRCode_Click extends BA.ResumableSub {
public ResumableSub_getQRCode_Click(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=112656386;
 //BA.debugLineNum = 112656386;BA.debugLine="QRCodePanel.Visible = True";
parent.mostCurrent._qrcodepanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112656387;
 //BA.debugLineNum = 112656387;BA.debugLine="QRCodeReader.Visible = True";
parent.mostCurrent._qrcodereader.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112656388;
 //BA.debugLineNum = 112656388;BA.debugLine="QRCodeReader.startScan";
parent.mostCurrent._qrcodereader.startScan();
RDebugUtils.currentLine=112656389;
 //BA.debugLineNum = 112656389;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "getqrcode_click"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=112656390;
 //BA.debugLineNum = 112656390;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setwidgetcolors() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setwidgetcolors", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setwidgetcolors", null));}
RDebugUtils.currentLine=109182976;
 //BA.debugLineNum = 109182976;BA.debugLine="Sub SetWidgetColors";
RDebugUtils.currentLine=109182978;
 //BA.debugLineNum = 109182978;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(MainLayou";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._mainlayoutpanel.getObject())));
RDebugUtils.currentLine=109182979;
 //BA.debugLineNum = 109182979;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ButtonLog";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buttonloginenter.getObject())));
RDebugUtils.currentLine=109182980;
 //BA.debugLineNum = 109182980;BA.debugLine="ButtonLoginReset.TextColor = Consts.ColorMain";
mostCurrent._buttonloginreset.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=109182981;
 //BA.debugLineNum = 109182981;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ButtonAut";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buttonauthnext.getObject())));
RDebugUtils.currentLine=109182982;
 //BA.debugLineNum = 109182982;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ButtonWel";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._buttonwelcomenext.getObject())));
RDebugUtils.currentLine=109182983;
 //BA.debugLineNum = 109182983;BA.debugLine="End Sub";
return "";
}
public static String  _setbuildinfo() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbuildinfo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setbuildinfo", null));}
String _currentapplabel = "";
String _currentversion = "";
String _ambiente = "";
String _author = "";
String _buildconfig = "";
int _posicaoespaco = 0;
RDebugUtils.currentLine=109445120;
 //BA.debugLineNum = 109445120;BA.debugLine="Sub SetBuildInfo As String";
RDebugUtils.currentLine=109445128;
 //BA.debugLineNum = 109445128;BA.debugLine="Dim CurrentAppLabel As String = Application.Label";
_currentapplabel = anywheresoftware.b4a.keywords.Common.Application.getLabelName().toUpperCase();
RDebugUtils.currentLine=109445129;
 //BA.debugLineNum = 109445129;BA.debugLine="CurrentBuild = \"VRCG\"";
_currentbuild = "VRCG";
RDebugUtils.currentLine=109445130;
 //BA.debugLineNum = 109445130;BA.debugLine="Dim CurrentVersion As String = \"2.4\"";
_currentversion = "2.4";
RDebugUtils.currentLine=109445131;
 //BA.debugLineNum = 109445131;BA.debugLine="Dim Ambiente As String = \"DEMO\"";
_ambiente = "DEMO";
RDebugUtils.currentLine=109445132;
 //BA.debugLineNum = 109445132;BA.debugLine="Dim Author As String = \"xevolution\"";
_author = "xevolution";
RDebugUtils.currentLine=109445133;
 //BA.debugLineNum = 109445133;BA.debugLine="Dim BuildConfig As String = \"\" ' PACKAGENAME NAO";
_buildconfig = "";
RDebugUtils.currentLine=109445135;
 //BA.debugLineNum = 109445135;BA.debugLine="If CurrentAppLabel.Contains(\"VRCG\") Then";
if (_currentapplabel.contains("VRCG")) { 
RDebugUtils.currentLine=109445136;
 //BA.debugLineNum = 109445136;BA.debugLine="CurrentBuild = \"VRCG\"";
_currentbuild = "VRCG";
 }else {
RDebugUtils.currentLine=109445138;
 //BA.debugLineNum = 109445138;BA.debugLine="CurrentBuild = \"EVC\"";
_currentbuild = "EVC";
 };
RDebugUtils.currentLine=109445141;
 //BA.debugLineNum = 109445141;BA.debugLine="Dim PosicaoEspaco As Int = CurrentAppLabel.IndexO";
_posicaoespaco = _currentapplabel.indexOf(" ");
RDebugUtils.currentLine=109445142;
 //BA.debugLineNum = 109445142;BA.debugLine="If PosicaoEspaco > 1 Then";
if (_posicaoespaco>1) { 
RDebugUtils.currentLine=109445143;
 //BA.debugLineNum = 109445143;BA.debugLine="CurrentVersion = CurrentAppLabel.SubString(Posic";
_currentversion = _currentapplabel.substring(_posicaoespaco).trim();
 };
RDebugUtils.currentLine=109445146;
 //BA.debugLineNum = 109445146;BA.debugLine="Ambiente = CurrentAppLabel.Replace($\"${CurrentBui";
_ambiente = _currentapplabel.replace((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currentbuild))+"-"),"").replace((" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currentversion))+""),"").trim();
RDebugUtils.currentLine=109445147;
 //BA.debugLineNum = 109445147;BA.debugLine="BuildConfig = $\"${Author.ToLowerCase}.${CurrentBu";
_buildconfig = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_author.toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currentbuild.toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ambiente.toLowerCase()))+"v"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currentversion.replace(".","")))+"");
RDebugUtils.currentLine=109445148;
 //BA.debugLineNum = 109445148;BA.debugLine="Return Ambiente";
if (true) return _ambiente;
RDebugUtils.currentLine=109445149;
 //BA.debugLineNum = 109445149;BA.debugLine="End Sub";
return "";
}
public static String  _setenvironment(String _ambiente) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setenvironment", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setenvironment", new Object[] {_ambiente}));}
RDebugUtils.currentLine=109117440;
 //BA.debugLineNum = 109117440;BA.debugLine="Sub SetEnvironment(Ambiente As String)";
RDebugUtils.currentLine=109117441;
 //BA.debugLineNum = 109117441;BA.debugLine="Select Case Ambiente";
switch (BA.switchObjectToInt(_ambiente,"DEMO","ACAIL","DEVEL","SCMS","GA","SIMGA","EDP","AGT","BAX","NVE","STR","PRT","JMLX","GRNLNK","ITG","LPS","ERG","FGIL","HMR","RPRE","BRF","ASC","EGTAS","TRTS","GPSRS","ANN","VSEGP","PSIL","JFM","SWBR","SMFEL","TRG","ACL","UBR","SLV","LUX","JRS","VMG","TG","SEV","DEVEDP","DEVSWBR","DEVTRG","DEVPAL","DEVGBM","DEVVTX","DEVVUL","TRIAL01","TRIALFC","DEVDEMO")) {
case 0: {
RDebugUtils.currentLine=109117444;
 //BA.debugLineNum = 109117444;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XD01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-XD01"));
RDebugUtils.currentLine=109117445;
 //BA.debugLineNum = 109117445;BA.debugLine="EditInstance.Text = \"PT20180913-2105-003\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-003"));
 break; }
case 1: {
RDebugUtils.currentLine=109117449;
 //BA.debugLineNum = 109117449;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X801\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-X801"));
RDebugUtils.currentLine=109117450;
 //BA.debugLineNum = 109117450;BA.debugLine="EditInstance.Text = \"PT20180913-2105-008\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-008"));
 break; }
case 2: {
RDebugUtils.currentLine=109117454;
 //BA.debugLineNum = 109117454;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-ASXD\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-ASXD"));
RDebugUtils.currentLine=109117455;
 //BA.debugLineNum = 109117455;BA.debugLine="EditInstance.Text = \"PT20180913-2105-004\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-004"));
 break; }
case 3: {
RDebugUtils.currentLine=109117458;
 //BA.debugLineNum = 109117458;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-ASX1\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-ASX1"));
RDebugUtils.currentLine=109117459;
 //BA.debugLineNum = 109117459;BA.debugLine="EditInstance.Text = \"PT20190913-2105-002\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190913-2105-002"));
 break; }
case 4: {
RDebugUtils.currentLine=109117462;
 //BA.debugLineNum = 109117462;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X601\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-X601"));
RDebugUtils.currentLine=109117463;
 //BA.debugLineNum = 109117463;BA.debugLine="EditInstance.Text = \"PT20180913-2105-006\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-006"));
RDebugUtils.currentLine=109117464;
 //BA.debugLineNum = 109117464;BA.debugLine="ShareCode.EmailOldModel = True";
mostCurrent._sharecode._emailoldmodel /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 5: {
RDebugUtils.currentLine=109117468;
 //BA.debugLineNum = 109117468;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X600\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-X600"));
RDebugUtils.currentLine=109117469;
 //BA.debugLineNum = 109117469;BA.debugLine="EditInstance.Text = \"PT20180913-2106-006\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2106-006"));
RDebugUtils.currentLine=109117470;
 //BA.debugLineNum = 109117470;BA.debugLine="ShareCode.EmailOldModel = True";
mostCurrent._sharecode._emailoldmodel /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 6: {
RDebugUtils.currentLine=109117474;
 //BA.debugLineNum = 109117474;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XE11\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-XE11"));
RDebugUtils.currentLine=109117475;
 //BA.debugLineNum = 109117475;BA.debugLine="EditInstance.Text = \"PT20180913-2105-011\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-011"));
 break; }
case 7: {
RDebugUtils.currentLine=109117478;
 //BA.debugLineNum = 109117478;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X101\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-X101"));
RDebugUtils.currentLine=109117479;
 //BA.debugLineNum = 109117479;BA.debugLine="EditInstance.Text = \"PT20180913-2105-010\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-010"));
 break; }
case 8: {
RDebugUtils.currentLine=109117482;
 //BA.debugLineNum = 109117482;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-BX01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-BX01"));
RDebugUtils.currentLine=109117483;
 //BA.debugLineNum = 109117483;BA.debugLine="EditInstance.Text = \"PT20190909-0000-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190909-0000-001"));
 break; }
case 9: {
RDebugUtils.currentLine=109117487;
 //BA.debugLineNum = 109117487;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-NV01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-NV01"));
RDebugUtils.currentLine=109117488;
 //BA.debugLineNum = 109117488;BA.debugLine="EditInstance.Text = \"PT20190910-0000-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190910-0000-001"));
 break; }
case 10: {
RDebugUtils.currentLine=109117491;
 //BA.debugLineNum = 109117491;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-ST01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-ST01"));
RDebugUtils.currentLine=109117492;
 //BA.debugLineNum = 109117492;BA.debugLine="EditInstance.Text = \"PT20180913-2105-113\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-113"));
 break; }
case 11: {
RDebugUtils.currentLine=109117496;
 //BA.debugLineNum = 109117496;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-PC010\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-PC010"));
RDebugUtils.currentLine=109117497;
 //BA.debugLineNum = 109117497;BA.debugLine="EditInstance.Text = \"PT20190919-1600-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190919-1600-001"));
 break; }
case 12: {
RDebugUtils.currentLine=109117500;
 //BA.debugLineNum = 109117500;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-AJ01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-AJ01"));
RDebugUtils.currentLine=109117501;
 //BA.debugLineNum = 109117501;BA.debugLine="EditInstance.Text = \"PT20180913-2105-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-001"));
 break; }
case 13: {
RDebugUtils.currentLine=109117504;
 //BA.debugLineNum = 109117504;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-GL01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-GL01"));
RDebugUtils.currentLine=109117505;
 //BA.debugLineNum = 109117505;BA.debugLine="EditInstance.Text = \"PT20191018-1500-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20191018-1500-001"));
 break; }
case 14: {
RDebugUtils.currentLine=109117508;
 //BA.debugLineNum = 109117508;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-IT010\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-IT010"));
RDebugUtils.currentLine=109117509;
 //BA.debugLineNum = 109117509;BA.debugLine="EditInstance.Text = \"PT20190919-1600-003\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190919-1600-003"));
 break; }
case 15: {
RDebugUtils.currentLine=109117513;
 //BA.debugLineNum = 109117513;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-LS011\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-LS011"));
RDebugUtils.currentLine=109117514;
 //BA.debugLineNum = 109117514;BA.debugLine="EditInstance.Text = \"PT20190919-1600-002\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190919-1600-002"));
 break; }
case 16: {
RDebugUtils.currentLine=109117517;
 //BA.debugLineNum = 109117517;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-EL011\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-EL011"));
RDebugUtils.currentLine=109117518;
 //BA.debugLineNum = 109117518;BA.debugLine="EditInstance.Text = \"PT20190919-1600-005\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190919-1600-005"));
RDebugUtils.currentLine=109117519;
 //BA.debugLineNum = 109117519;BA.debugLine="ShareCode.EmailOldModel = True";
mostCurrent._sharecode._emailoldmodel /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 17: {
RDebugUtils.currentLine=109117523;
 //BA.debugLineNum = 109117523;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-FG01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-FG01"));
RDebugUtils.currentLine=109117524;
 //BA.debugLineNum = 109117524;BA.debugLine="EditInstance.Text = \"PT20190801-1947-111\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190801-1947-111"));
 break; }
case 18: {
RDebugUtils.currentLine=109117528;
 //BA.debugLineNum = 109117528;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-H001\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-H001"));
RDebugUtils.currentLine=109117529;
 //BA.debugLineNum = 109117529;BA.debugLine="EditInstance.Text = \"PT20190913-2105-012\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190913-2105-012"));
RDebugUtils.currentLine=109117530;
 //BA.debugLineNum = 109117530;BA.debugLine="ShareCode.EmailOldModel = True";
mostCurrent._sharecode._emailoldmodel /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 19: {
RDebugUtils.currentLine=109117534;
 //BA.debugLineNum = 109117534;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-RP01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-RP01"));
RDebugUtils.currentLine=109117535;
 //BA.debugLineNum = 109117535;BA.debugLine="EditInstance.Text = \"PT20191121-1009-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20191121-1009-001"));
 break; }
case 20: {
RDebugUtils.currentLine=109117539;
 //BA.debugLineNum = 109117539;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-BR01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-BR01"));
RDebugUtils.currentLine=109117540;
 //BA.debugLineNum = 109117540;BA.debugLine="EditInstance.Text = \"PT20190807-1933-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20190807-1933-001"));
 break; }
case 21: {
RDebugUtils.currentLine=109117544;
 //BA.debugLineNum = 109117544;BA.debugLine="EditAuthorization.Text = \" RT123-C324D-AS01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence(" RT123-C324D-AS01"));
RDebugUtils.currentLine=109117545;
 //BA.debugLineNum = 109117545;BA.debugLine="EditInstance.Text = \"PT20200907-0907-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200907-0907-001"));
 break; }
case 22: {
RDebugUtils.currentLine=109117548;
 //BA.debugLineNum = 109117548;BA.debugLine="EditAuthorization.Text = \" RT123-C324D-ET01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence(" RT123-C324D-ET01"));
RDebugUtils.currentLine=109117549;
 //BA.debugLineNum = 109117549;BA.debugLine="EditInstance.Text = \"PT20200227-1707-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200227-1707-001"));
 break; }
case 23: {
RDebugUtils.currentLine=109117552;
 //BA.debugLineNum = 109117552;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TR01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-TR01"));
RDebugUtils.currentLine=109117553;
 //BA.debugLineNum = 109117553;BA.debugLine="EditInstance.Text = \"PT20200203-1900-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200203-1900-001"));
 break; }
case 24: {
RDebugUtils.currentLine=109117556;
 //BA.debugLineNum = 109117556;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-GS01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-GS01"));
RDebugUtils.currentLine=109117557;
 //BA.debugLineNum = 109117557;BA.debugLine="EditInstance.Text = \"PT20200127-0900-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200127-0900-001"));
 break; }
case 25: {
RDebugUtils.currentLine=109117560;
 //BA.debugLineNum = 109117560;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-AN01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-AN01"));
RDebugUtils.currentLine=109117561;
 //BA.debugLineNum = 109117561;BA.debugLine="EditInstance.Text = \"PT20200214-1800-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200214-1800-001"));
 break; }
case 26: {
RDebugUtils.currentLine=109117565;
 //BA.debugLineNum = 109117565;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-VF01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-VF01"));
RDebugUtils.currentLine=109117566;
 //BA.debugLineNum = 109117566;BA.debugLine="EditInstance.Text = \"PT20200218-1730-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200218-1730-001"));
 break; }
case 27: {
RDebugUtils.currentLine=109117570;
 //BA.debugLineNum = 109117570;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-PS01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-PS01"));
RDebugUtils.currentLine=109117571;
 //BA.debugLineNum = 109117571;BA.debugLine="EditInstance.Text = \"PT20200306-1611-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200306-1611-001"));
 break; }
case 28: {
RDebugUtils.currentLine=109117575;
 //BA.debugLineNum = 109117575;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-JM01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-JM01"));
RDebugUtils.currentLine=109117576;
 //BA.debugLineNum = 109117576;BA.debugLine="EditInstance.Text = \"PT20200411-1400-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200411-1400-001"));
 break; }
case 29: {
RDebugUtils.currentLine=109117580;
 //BA.debugLineNum = 109117580;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SB01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-SB01"));
RDebugUtils.currentLine=109117581;
 //BA.debugLineNum = 109117581;BA.debugLine="EditInstance.Text = \"PT20200323-1800-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200323-1800-001"));
 break; }
case 30: {
RDebugUtils.currentLine=109117585;
 //BA.debugLineNum = 109117585;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SF01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-SF01"));
RDebugUtils.currentLine=109117586;
 //BA.debugLineNum = 109117586;BA.debugLine="EditInstance.Text = \"PT20200615-1215-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200615-1215-001"));
 break; }
case 31: {
RDebugUtils.currentLine=109117590;
 //BA.debugLineNum = 109117590;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TG01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-TG01"));
RDebugUtils.currentLine=109117591;
 //BA.debugLineNum = 109117591;BA.debugLine="EditInstance.Text = \"PT20200710-1910-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200710-1910-001"));
 break; }
case 32: {
RDebugUtils.currentLine=109117595;
 //BA.debugLineNum = 109117595;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-AC01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-AC01"));
RDebugUtils.currentLine=109117596;
 //BA.debugLineNum = 109117596;BA.debugLine="EditInstance.Text = \"PT20200716-1600-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200716-1600-001"));
 break; }
case 33: {
RDebugUtils.currentLine=109117600;
 //BA.debugLineNum = 109117600;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-X699\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-X699"));
RDebugUtils.currentLine=109117601;
 //BA.debugLineNum = 109117601;BA.debugLine="EditInstance.Text = \"PT20180913-2105-005\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2105-005"));
 break; }
case 34: {
RDebugUtils.currentLine=109117605;
 //BA.debugLineNum = 109117605;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SV01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-SV01"));
RDebugUtils.currentLine=109117606;
 //BA.debugLineNum = 109117606;BA.debugLine="EditInstance.Text = \"PT20200811-1036-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200811-1036-001"));
 break; }
case 35: {
RDebugUtils.currentLine=109117610;
 //BA.debugLineNum = 109117610;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-LC01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-LC01"));
RDebugUtils.currentLine=109117611;
 //BA.debugLineNum = 109117611;BA.debugLine="EditInstance.Text = \"PT20200914-1206-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200914-1206-001"));
 break; }
case 36: {
RDebugUtils.currentLine=109117615;
 //BA.debugLineNum = 109117615;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-JR01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-JR01"));
RDebugUtils.currentLine=109117616;
 //BA.debugLineNum = 109117616;BA.debugLine="EditInstance.Text = \"PT20200914-1139-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200914-1139-001"));
 break; }
case 37: {
RDebugUtils.currentLine=109117620;
 //BA.debugLineNum = 109117620;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XD10\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-XD10"));
RDebugUtils.currentLine=109117621;
 //BA.debugLineNum = 109117621;BA.debugLine="EditInstance.Text = \"PT20200909-1200-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200909-1200-001"));
 break; }
case 38: {
RDebugUtils.currentLine=109117624;
 //BA.debugLineNum = 109117624;BA.debugLine="EditAuthorization.Text = \"\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=109117625;
 //BA.debugLineNum = 109117625;BA.debugLine="EditInstance.Text = \"\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence(""));
 break; }
case 39: {
RDebugUtils.currentLine=109117628;
 //BA.debugLineNum = 109117628;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SFE01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-SFE01"));
RDebugUtils.currentLine=109117629;
 //BA.debugLineNum = 109117629;BA.debugLine="EditInstance.Text = \"PT20210118-1213-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20210118-1213-001"));
 break; }
case 40: {
RDebugUtils.currentLine=109117633;
 //BA.debugLineNum = 109117633;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-XE00\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-XE00"));
RDebugUtils.currentLine=109117634;
 //BA.debugLineNum = 109117634;BA.debugLine="EditInstance.Text = \"PT20180913-2106-011\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20180913-2106-011"));
RDebugUtils.currentLine=109117635;
 //BA.debugLineNum = 109117635;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 41: {
RDebugUtils.currentLine=109117638;
 //BA.debugLineNum = 109117638;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-SB00\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-SB00"));
RDebugUtils.currentLine=109117639;
 //BA.debugLineNum = 109117639;BA.debugLine="EditInstance.Text = \"PT20200323-DEV0-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20200323-DEV0-001"));
RDebugUtils.currentLine=109117640;
 //BA.debugLineNum = 109117640;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 42: {
RDebugUtils.currentLine=109117643;
 //BA.debugLineNum = 109117643;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TG01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-TG01"));
RDebugUtils.currentLine=109117644;
 //BA.debugLineNum = 109117644;BA.debugLine="EditInstance.Text = \"PT20201021-DEV2-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20201021-DEV2-001"));
RDebugUtils.currentLine=109117645;
 //BA.debugLineNum = 109117645;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 43: {
RDebugUtils.currentLine=109117648;
 //BA.debugLineNum = 109117648;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-PA01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-PA01"));
RDebugUtils.currentLine=109117649;
 //BA.debugLineNum = 109117649;BA.debugLine="EditInstance.Text = \"PT20201102-0941-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20201102-0941-001"));
RDebugUtils.currentLine=109117650;
 //BA.debugLineNum = 109117650;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 44: {
RDebugUtils.currentLine=109117653;
 //BA.debugLineNum = 109117653;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-GB01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-GB01"));
RDebugUtils.currentLine=109117654;
 //BA.debugLineNum = 109117654;BA.debugLine="EditInstance.Text = \"PT20201016-DEV1-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20201016-DEV1-001"));
RDebugUtils.currentLine=109117655;
 //BA.debugLineNum = 109117655;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 45: {
RDebugUtils.currentLine=109117658;
 //BA.debugLineNum = 109117658;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-VT01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-VT01"));
RDebugUtils.currentLine=109117659;
 //BA.debugLineNum = 109117659;BA.debugLine="EditInstance.Text = \"PT20201011-DEV0-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20201011-DEV0-001"));
RDebugUtils.currentLine=109117660;
 //BA.debugLineNum = 109117660;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 46: {
RDebugUtils.currentLine=109117663;
 //BA.debugLineNum = 109117663;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-VL01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-VL01"));
RDebugUtils.currentLine=109117664;
 //BA.debugLineNum = 109117664;BA.debugLine="EditInstance.Text = \"PT20210111-DEV5-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20210111-DEV5-001"));
RDebugUtils.currentLine=109117665;
 //BA.debugLineNum = 109117665;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 47: {
RDebugUtils.currentLine=109117668;
 //BA.debugLineNum = 109117668;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TR101\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-TR101"));
RDebugUtils.currentLine=109117669;
 //BA.debugLineNum = 109117669;BA.debugLine="EditInstance.Text = \"PT20210113-1217-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20210113-1217-001"));
RDebugUtils.currentLine=109117670;
 //BA.debugLineNum = 109117670;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
case 48: {
RDebugUtils.currentLine=109117673;
 //BA.debugLineNum = 109117673;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-TFC01\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-TFC01"));
RDebugUtils.currentLine=109117674;
 //BA.debugLineNum = 109117674;BA.debugLine="EditInstance.Text = \"PT20210126-1135-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20210126-1135-001"));
 break; }
case 49: {
RDebugUtils.currentLine=109117677;
 //BA.debugLineNum = 109117677;BA.debugLine="EditAuthorization.Text = \"RT123-C324D-RT00\"";
mostCurrent._editauthorization.setText(BA.ObjectToCharSequence("RT123-C324D-RT00"));
RDebugUtils.currentLine=109117678;
 //BA.debugLineNum = 109117678;BA.debugLine="EditInstance.Text = \"PT20201110-DEV4-001\"";
mostCurrent._editinstance.setText(BA.ObjectToCharSequence("PT20201110-DEV4-001"));
RDebugUtils.currentLine=109117679;
 //BA.debugLineNum = 109117679;BA.debugLine="ShareCode.IsDevelopment = True";
mostCurrent._sharecode._isdevelopment /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 break; }
}
;
RDebugUtils.currentLine=109117681;
 //BA.debugLineNum = 109117681;BA.debugLine="End Sub";
return "";
}
public static String  _setlogos() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setlogos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setlogos", null));}
RDebugUtils.currentLine=109248512;
 //BA.debugLineNum = 109248512;BA.debugLine="Sub SetLogos";
RDebugUtils.currentLine=109248513;
 //BA.debugLineNum = 109248513;BA.debugLine="LoginPanelIconImageView.Bitmap = Consts.AppLogo";
mostCurrent._loginpaneliconimageview.setBitmap((android.graphics.Bitmap)(mostCurrent._consts._applogo /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=109248514;
 //BA.debugLineNum = 109248514;BA.debugLine="LoginPanelIconImageView.Gravity = Gravity.CENTER";
mostCurrent._loginpaneliconimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=109248516;
 //BA.debugLineNum = 109248516;BA.debugLine="CompanyImageView.Bitmap = Consts.CompanyImage";
mostCurrent._companyimageview.setBitmap((android.graphics.Bitmap)(mostCurrent._consts._companyimage /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=109248517;
 //BA.debugLineNum = 109248517;BA.debugLine="CompanyImageView.Gravity = Gravity.FILL";
mostCurrent._companyimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=109248519;
 //BA.debugLineNum = 109248519;BA.debugLine="LoginValidationPanelIconImageView.Bitmap = Consts";
mostCurrent._loginvalidationpaneliconimageview.setBitmap((android.graphics.Bitmap)(mostCurrent._consts._applogo /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=109248520;
 //BA.debugLineNum = 109248520;BA.debugLine="LoginValidationPanelIconImageView.Gravity = Gravi";
mostCurrent._loginvalidationpaneliconimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=109248522;
 //BA.debugLineNum = 109248522;BA.debugLine="VarificationPanelIconImageView.Bitmap = Consts.Ap";
mostCurrent._varificationpaneliconimageview.setBitmap((android.graphics.Bitmap)(mostCurrent._consts._applogo /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=109248523;
 //BA.debugLineNum = 109248523;BA.debugLine="VarificationPanelIconImageView.Gravity = Gravity.";
mostCurrent._varificationpaneliconimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=109248525;
 //BA.debugLineNum = 109248525;BA.debugLine="AuthorizationPanelIconImageView.Bitmap = Consts.A";
mostCurrent._authorizationpaneliconimageview.setBitmap((android.graphics.Bitmap)(mostCurrent._consts._applogo /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=109248526;
 //BA.debugLineNum = 109248526;BA.debugLine="AuthorizationPanelIconImageView.Gravity = Gravity";
mostCurrent._authorizationpaneliconimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=109248528;
 //BA.debugLineNum = 109248528;BA.debugLine="WelcomePanelIconImageView.Bitmap = Consts.AppLogo";
mostCurrent._welcomepaneliconimageview.setBitmap((android.graphics.Bitmap)(mostCurrent._consts._applogo /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=109248529;
 //BA.debugLineNum = 109248529;BA.debugLine="WelcomePanelIconImageView.Gravity = Gravity.CENTE";
mostCurrent._welcomepaneliconimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=109248531;
 //BA.debugLineNum = 109248531;BA.debugLine="mainPanSplashCustomLogo.Gravity = Gravity.CENTER";
mostCurrent._mainpansplashcustomlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=109248535;
 //BA.debugLineNum = 109248535;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo /*String*/ ))) { 
RDebugUtils.currentLine=109248536;
 //BA.debugLineNum = 109248536;BA.debugLine="mainPanSplashCustomLogo.SetBackgroundImage(Utils";
mostCurrent._mainpansplashcustomlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo /*String*/ ).getObject()));
 };
RDebugUtils.currentLine=109248538;
 //BA.debugLineNum = 109248538;BA.debugLine="End Sub";
return "";
}
public static String  _startcomsservice() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startcomsservice", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startcomsservice", null));}
RDebugUtils.currentLine=109379584;
 //BA.debugLineNum = 109379584;BA.debugLine="Sub StartComsService";
RDebugUtils.currentLine=109379585;
 //BA.debugLineNum = 109379585;BA.debugLine="Try";
try {RDebugUtils.currentLine=109379586;
 //BA.debugLineNum = 109379586;BA.debugLine="StartService(Comms)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(mostCurrent._comms.getObject()));
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=109379588;
 //BA.debugLineNum = 109379588;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6109379588",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=109379589;
 //BA.debugLineNum = 109379589;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=109379591;
 //BA.debugLineNum = 109379591;BA.debugLine="End Sub";
return "";
}
public static void  _setpanelbyinstallationstatus() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setpanelbyinstallationstatus", false))
	 {Debug.delegate(mostCurrent.activityBA, "setpanelbyinstallationstatus", null); return;}
ResumableSub_SetPanelByInstallationStatus rsub = new ResumableSub_SetPanelByInstallationStatus(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetPanelByInstallationStatus extends BA.ResumableSub {
public ResumableSub_SetPanelByInstallationStatus(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
boolean _reinstallation = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=109314053;
 //BA.debugLineNum = 109314053;BA.debugLine="Dim Reinstallation As Boolean = False";
_reinstallation = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=109314055;
 //BA.debugLineNum = 109314055;BA.debugLine="If File.Exists(Starter.SharedFolder,\"FIRSTINSTALL";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._sharedfolder /*String*/ ,"FIRSTINSTALL_IN_PROGRESS")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=109314056;
 //BA.debugLineNum = 109314056;BA.debugLine="Reinstallation = True";
_reinstallation = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=109314060;
 //BA.debugLineNum = 109314060;BA.debugLine="If ((ShareCode.APPL_CONFIRMED = 0) And (Starter.C";

case 4:
//if
this.state = 17;
if (((parent.mostCurrent._sharecode._appl_confirmed /*int*/ ==0) && (parent.mostCurrent._starter._currentflowposition /*int*/ ==0))) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=109314064;
 //BA.debugLineNum = 109314064;BA.debugLine="else If ((ShareCode.APPL_CONFIRMED = 0) And (Star";
if (((parent.mostCurrent._sharecode._appl_confirmed /*int*/ ==0) && (parent.mostCurrent._starter._currentflowposition /*int*/ ==1))) { 
this.state = 8;
}else 
{RDebugUtils.currentLine=109314068;
 //BA.debugLineNum = 109314068;BA.debugLine="else if Reinstallation Then";
if (_reinstallation) { 
this.state = 10;
}else {
this.state = 16;
}}}
if (true) break;

case 6:
//C
this.state = 17;
RDebugUtils.currentLine=109314061;
 //BA.debugLineNum = 109314061;BA.debugLine="isFirstInstall = True";
parent._isfirstinstall = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=109314062;
 //BA.debugLineNum = 109314062;BA.debugLine="Starter.FirstInstall = isFirstInstall";
parent.mostCurrent._starter._firstinstall /*boolean*/  = parent._isfirstinstall;
RDebugUtils.currentLine=109314063;
 //BA.debugLineNum = 109314063;BA.debugLine="Panel_Config.Visible = True";
parent.mostCurrent._panel_config.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 8:
//C
this.state = 17;
RDebugUtils.currentLine=109314065;
 //BA.debugLineNum = 109314065;BA.debugLine="isFirstInstall = True";
parent._isfirstinstall = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=109314066;
 //BA.debugLineNum = 109314066;BA.debugLine="Panel_Authorization.Visible = True";
parent.mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=109314067;
 //BA.debugLineNum = 109314067;BA.debugLine="Starter.FirstInstall = isFirstInstall";
parent.mostCurrent._starter._firstinstall /*boolean*/  = parent._isfirstinstall;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=109314069;
 //BA.debugLineNum = 109314069;BA.debugLine="isFirstInstall = True";
parent._isfirstinstall = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=109314070;
 //BA.debugLineNum = 109314070;BA.debugLine="Starter.FirstInstall = isFirstInstall";
parent.mostCurrent._starter._firstinstall /*boolean*/  = parent._isfirstinstall;
RDebugUtils.currentLine=109314071;
 //BA.debugLineNum = 109314071;BA.debugLine="Dim rs As ResumableSub = FirstInstallCompletePro";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _firstinstallcompleteprocedure();
RDebugUtils.currentLine=109314072;
 //BA.debugLineNum = 109314072;BA.debugLine="Wait For(rs) Complete (R As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "setpanelbyinstallationstatus"), _rs);
this.state = 18;
return;
case 18:
//C
this.state = 11;
_r = (Boolean) result[0];
;
RDebugUtils.currentLine=109314074;
 //BA.debugLineNum = 109314074;BA.debugLine="If Not(R)Then";
if (true) break;

case 11:
//if
this.state = 14;
if (anywheresoftware.b4a.keywords.Common.Not(_r)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=109314075;
 //BA.debugLineNum = 109314075;BA.debugLine="MsgboxAsync(ShareCode.AvisoErroComms,ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoerrocomms /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=109314076;
 //BA.debugLineNum = 109314076;BA.debugLine="Starter.APP_IN_EXECUTION = False";
parent.mostCurrent._starter._app_in_execution /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = 17;
;
RDebugUtils.currentLine=109314079;
 //BA.debugLineNum = 109314079;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=109314080;
 //BA.debugLineNum = 109314080;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=109314081;
 //BA.debugLineNum = 109314081;BA.debugLine="Starter.CurrentFlowPosition = 3";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (3);
RDebugUtils.currentLine=109314082;
 //BA.debugLineNum = 109314082;BA.debugLine="DBStructures.getConfigApp(ShareCode.APP_TOKEN)";
parent.mostCurrent._dbstructures._getconfigapp /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_token /*String*/ );
RDebugUtils.currentLine=109314083;
 //BA.debugLineNum = 109314083;BA.debugLine="Starter.APP_IN_EXECUTION = True";
parent.mostCurrent._starter._app_in_execution /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=109314085;
 //BA.debugLineNum = 109314085;BA.debugLine="Panel_Login.Visible = True";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=109314087;
 //BA.debugLineNum = 109314087;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _newgetmac() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "newgetmac", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "newgetmac", null));}
anywheresoftware.b4j.object.JavaObject _nativeme = null;
String _s = "";
RDebugUtils.currentLine=113901568;
 //BA.debugLineNum = 113901568;BA.debugLine="Sub newGetMAC As String";
RDebugUtils.currentLine=113901569;
 //BA.debugLineNum = 113901569;BA.debugLine="Private NativeMe As JavaObject";
_nativeme = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=113901570;
 //BA.debugLineNum = 113901570;BA.debugLine="NativeMe.InitializeContext";
_nativeme.InitializeContext(processBA);
RDebugUtils.currentLine=113901571;
 //BA.debugLineNum = 113901571;BA.debugLine="Dim s As String = NativeMe.RunMethod(\"getMacAddr\"";
_s = BA.ObjectToString(_nativeme.RunMethod("getMacAddr",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=113901572;
 //BA.debugLineNum = 113901572;BA.debugLine="Return s";
if (true) return _s;
RDebugUtils.currentLine=113901573;
 //BA.debugLineNum = 113901573;BA.debugLine="End Sub";
return "";
}
public static String  _prc_loginclose() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prc_loginclose", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "prc_loginclose", null));}
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
RDebugUtils.currentLine=112394240;
 //BA.debugLineNum = 112394240;BA.debugLine="Sub prc_LoginClose";
RDebugUtils.currentLine=112394242;
 //BA.debugLineNum = 112394242;BA.debugLine="If Not(Utils.DBDataExists(Starter.LocalSQLWRK, $\"";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._dbdataexists /*boolean*/ (mostCurrent.activityBA,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,("select * from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._starter._localsessioncode /*String*/ ))+"' and username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_uwdukey /*String*/ ))+"'")))) { 
RDebugUtils.currentLine=112394243;
 //BA.debugLineNum = 112394243;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=112394244;
 //BA.debugLineNum = 112394244;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=112394245;
 //BA.debugLineNum = 112394245;BA.debugLine="params.Put(\"session\", Starter.LocalSessionCode)";
_params.Put((Object)("session"),(Object)(mostCurrent._starter._localsessioncode /*String*/ ));
RDebugUtils.currentLine=112394246;
 //BA.debugLineNum = 112394246;BA.debugLine="params.Put(\"username\", ShareCode.SESS_UWDUKEY)";
_params.Put((Object)("username"),(Object)(mostCurrent._sharecode._sess_uwdukey /*String*/ ));
RDebugUtils.currentLine=112394247;
 //BA.debugLineNum = 112394247;BA.debugLine="params.Put(\"tagcode\", ShareCode.SESS_User)";
_params.Put((Object)("tagcode"),(Object)(mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=112394248;
 //BA.debugLineNum = 112394248;BA.debugLine="params.Put(\"name\", ShareCode.SESS_UserName)";
_params.Put((Object)("name"),(Object)(mostCurrent._sharecode._sess_username /*String*/ ));
RDebugUtils.currentLine=112394249;
 //BA.debugLineNum = 112394249;BA.debugLine="params.Put(\"active\", 1)";
_params.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=112394250;
 //BA.debugLineNum = 112394250;BA.debugLine="params.Put(\"login\", 1)";
_params.Put((Object)("login"),(Object)(1));
RDebugUtils.currentLine=112394251;
 //BA.debugLineNum = 112394251;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=112394252;
 //BA.debugLineNum = 112394252;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=112394253;
 //BA.debugLineNum = 112394253;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=112394254;
 //BA.debugLineNum = 112394254;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"loc_use";
mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_userssession",_insertlist);
 };
RDebugUtils.currentLine=112394256;
 //BA.debugLineNum = 112394256;BA.debugLine="If Not(isFirstInstall) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_isfirstinstall)) { 
RDebugUtils.currentLine=112394257;
 //BA.debugLineNum = 112394257;BA.debugLine="mainFirstInstall.visible = True";
mostCurrent._mainfirstinstall.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112394258;
 //BA.debugLineNum = 112394258;BA.debugLine="mainFirstInstall.Text = \"A iniciar a aplicação.";
mostCurrent._mainfirstinstall.setText(BA.ObjectToCharSequence("A iniciar a aplicação. Aguarde por favor."));
 };
RDebugUtils.currentLine=112394261;
 //BA.debugLineNum = 112394261;BA.debugLine="Log(\"*************************  START UPDATE_SERV";
anywheresoftware.b4a.keywords.Common.LogImpl("6112394261","*************************  START UPDATE_SERVICE  ************************",0);
RDebugUtils.currentLine=112394272;
 //BA.debugLineNum = 112394272;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_U";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","LAST_USER",mostCurrent._sharecode._sess_uwdukey /*String*/ );
RDebugUtils.currentLine=112394273;
 //BA.debugLineNum = 112394273;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"LAST_A";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","LAST_ACCESS",mostCurrent._utils._getcurrdatetimet /*String*/ (mostCurrent.activityBA,"T"));
RDebugUtils.currentLine=112394274;
 //BA.debugLineNum = 112394274;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=112394277;
 //BA.debugLineNum = 112394277;BA.debugLine="If Not(File.Exists(Starter.SharedFolder, \"AppStat";
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._sharedfolder /*String*/ ,"AppState.txt"))) { 
RDebugUtils.currentLine=112394278;
 //BA.debugLineNum = 112394278;BA.debugLine="File.Copy(Starter.InternalFolder, \"AppState.set\"";
anywheresoftware.b4a.keywords.Common.File.Copy(mostCurrent._starter._internalfolder /*String*/ ,"AppState.set",mostCurrent._starter._sharedfolder /*String*/ ,"AppState.txt");
 };
RDebugUtils.currentLine=112394301;
 //BA.debugLineNum = 112394301;BA.debugLine="End Sub";
return "";
}
public static void  _prc_savetojson(xevolution.vrcg.devdemov2400.types._authorization _authdata) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "prc_savetojson", false))
	 {Debug.delegate(mostCurrent.activityBA, "prc_savetojson", new Object[] {_authdata}); return;}
ResumableSub_prc_SaveToJSON rsub = new ResumableSub_prc_SaveToJSON(null,_authdata);
rsub.resume(processBA, null);
}
public static class ResumableSub_prc_SaveToJSON extends BA.ResumableSub {
public ResumableSub_prc_SaveToJSON(xevolution.vrcg.devdemov2400.main parent,xevolution.vrcg.devdemov2400.types._authorization _authdata) {
this.parent = parent;
this._authdata = _authdata;
}
xevolution.vrcg.devdemov2400.main parent;
xevolution.vrcg.devdemov2400.types._authorization _authdata;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.objects.collections.Map _condition = null;
anywheresoftware.b4a.objects.collections.List _lstmap = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _jobmap = null;
int _status = 0;
String _host = "";
int _i = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=111673345;
 //BA.debugLineNum = 111673345;BA.debugLine="Dim Mapping As Map";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111673346;
 //BA.debugLineNum = 111673346;BA.debugLine="Mapping.Initialize";
_mapping.Initialize();
RDebugUtils.currentLine=111673347;
 //BA.debugLineNum = 111673347;BA.debugLine="Mapping.Put(\"instance\", authData.Instance)";
_mapping.Put((Object)("instance"),(Object)(_authdata.Instance /*String*/ ));
RDebugUtils.currentLine=111673348;
 //BA.debugLineNum = 111673348;BA.debugLine="Mapping.Put(\"authorization\", authData.Authorizati";
_mapping.Put((Object)("authorization"),(Object)(_authdata.Authorization /*String*/ ));
RDebugUtils.currentLine=111673349;
 //BA.debugLineNum = 111673349;BA.debugLine="Mapping.Put(\"version\", authData.Version)";
_mapping.Put((Object)("version"),(Object)(_authdata.Version /*String*/ ));
RDebugUtils.currentLine=111673350;
 //BA.debugLineNum = 111673350;BA.debugLine="Mapping.Put(\"versionid\", authData.Version)";
_mapping.Put((Object)("versionid"),(Object)(_authdata.Version /*String*/ ));
RDebugUtils.currentLine=111673351;
 //BA.debugLineNum = 111673351;BA.debugLine="Mapping.Put(\"confirmed\", ShareCode.APPL_CONFIRMED";
_mapping.Put((Object)("confirmed"),(Object)(parent.mostCurrent._sharecode._appl_confirmed /*int*/ ));
RDebugUtils.currentLine=111673352;
 //BA.debugLineNum = 111673352;BA.debugLine="Mapping.Put(\"token\", ShareCode.APP_TOKEN)";
_mapping.Put((Object)("token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=111673353;
 //BA.debugLineNum = 111673353;BA.debugLine="Mapping.Put(\"orientation\", ShareCode.DEVICE_ORIEN";
_mapping.Put((Object)("orientation"),(Object)(parent.mostCurrent._sharecode._device_orientation /*int*/ ));
RDebugUtils.currentLine=111673354;
 //BA.debugLineNum = 111673354;BA.debugLine="Mapping.Put(\"subdomain\", authData.SubDomain)";
_mapping.Put((Object)("subdomain"),(Object)(_authdata.SubDomain /*String*/ ));
RDebugUtils.currentLine=111673356;
 //BA.debugLineNum = 111673356;BA.debugLine="Dim Condition As Map";
_condition = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=111673357;
 //BA.debugLineNum = 111673357;BA.debugLine="Condition.Initialize";
_condition.Initialize();
RDebugUtils.currentLine=111673358;
 //BA.debugLineNum = 111673358;BA.debugLine="Condition.Put(\"id\", 1)";
_condition.Put((Object)("id"),(Object)(1));
RDebugUtils.currentLine=111673360;
 //BA.debugLineNum = 111673360;BA.debugLine="If (DBStructures.getConfigValuesExists) Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent.mostCurrent._dbstructures._getconfigvaluesexists /*boolean*/ (mostCurrent.activityBA))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=111673361;
 //BA.debugLineNum = 111673361;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.LocalSQLWRK,";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"config",_mapping,_condition,"","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=111673363;
 //BA.debugLineNum = 111673363;BA.debugLine="Mapping.Put(\"id\", 1)";
_mapping.Put((Object)("id"),(Object)(1));
RDebugUtils.currentLine=111673364;
 //BA.debugLineNum = 111673364;BA.debugLine="Dim lstMap As List";
_lstmap = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=111673365;
 //BA.debugLineNum = 111673365;BA.debugLine="lstMap.Initialize";
_lstmap.Initialize();
RDebugUtils.currentLine=111673366;
 //BA.debugLineNum = 111673366;BA.debugLine="lstMap.Add(Mapping)";
_lstmap.Add((Object)(_mapping.getObject()));
RDebugUtils.currentLine=111673367;
 //BA.debugLineNum = 111673367;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"config\"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"config",_lstmap);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=111673370;
 //BA.debugLineNum = 111673370;BA.debugLine="ShareCode.APP_Instance = authData.Instance";
parent.mostCurrent._sharecode._app_instance /*String*/  = _authdata.Instance /*String*/ ;
RDebugUtils.currentLine=111673371;
 //BA.debugLineNum = 111673371;BA.debugLine="ShareCode.APP_Authorization = authData.Authorizat";
parent.mostCurrent._sharecode._app_authorization /*String*/  = _authdata.Authorization /*String*/ ;
RDebugUtils.currentLine=111673373;
 //BA.debugLineNum = 111673373;BA.debugLine="Dim lst As List = Utils.ListOfPairs( Array As Str";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = parent.mostCurrent._utils._listofpairs /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,new String[]{("instance=>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_authdata.Instance /*String*/ ))+""),("authorization=>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_authdata.Authorization /*String*/ ))+"")},"");
RDebugUtils.currentLine=111673374;
 //BA.debugLineNum = 111673374;BA.debugLine="Dim Job As HttpJob = Utils.CallJobAPI(ShareCode.A";
_job = parent.mostCurrent._utils._calljobapi /*xevolution.vrcg.devdemov2400.httpjob*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_registerdevice /*String*/ ,_lst,main.getObject(),"AuthRegister");
RDebugUtils.currentLine=111673375;
 //BA.debugLineNum = 111673375;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "prc_savetojson"), (Object)(_job));
this.state = 33;
return;
case 33:
//C
this.state = 7;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=111673376;
 //BA.debugLineNum = 111673376;BA.debugLine="If Job.Success Then";
if (true) break;

case 7:
//if
this.state = 22;
if (_job._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 21;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=111673378;
 //BA.debugLineNum = 111673378;BA.debugLine="Dim JobMap As Map = Utils.JobAPIMAP(Job)";
_jobmap = new anywheresoftware.b4a.objects.collections.Map();
_jobmap = parent.mostCurrent._utils._jobapimap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,_job);
RDebugUtils.currentLine=111673379;
 //BA.debugLineNum = 111673379;BA.debugLine="Dim Status As Int = JobMap.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_jobmap.Get((Object)("status"))));
RDebugUtils.currentLine=111673380;
 //BA.debugLineNum = 111673380;BA.debugLine="If Status = 1 Then";
if (true) break;

case 10:
//if
this.state = 19;
if (_status==1) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=111673381;
 //BA.debugLineNum = 111673381;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"APP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","APPL_CONFIRMED",parent.mostCurrent._sharecode._appl_confirmed /*int*/ );
RDebugUtils.currentLine=111673382;
 //BA.debugLineNum = 111673382;BA.debugLine="Dim Host As String = JobMap.Get(\"host\")";
_host = BA.ObjectToString(_jobmap.Get((Object)("host")));
RDebugUtils.currentLine=111673385;
 //BA.debugLineNum = 111673385;BA.debugLine="If Not(ShareCode.APPL_HOST = Host) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (anywheresoftware.b4a.keywords.Common.Not((parent.mostCurrent._sharecode._appl_host /*String*/ ).equals(_host))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=111673386;
 //BA.debugLineNum = 111673386;BA.debugLine="ShareCode.APPL_HOST = Host";
parent.mostCurrent._sharecode._appl_host /*String*/  = _host;
RDebugUtils.currentLine=111673387;
 //BA.debugLineNum = 111673387;BA.debugLine="Starter.AppState.WriteString(\"APP_START\", \"APP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writestring /*boolean*/ (null,"APP_START","APPL_HOST",_host);
 if (true) break;

case 16:
//C
this.state = 19;
;
RDebugUtils.currentLine=111673390;
 //BA.debugLineNum = 111673390;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=111673392;
 //BA.debugLineNum = 111673392;BA.debugLine="WaitToConfirm = True";
parent._waittoconfirm = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=111673393;
 //BA.debugLineNum = 111673393;BA.debugLine="ShareCode.APPL_CONFIRMED = 0";
parent.mostCurrent._sharecode._appl_confirmed /*int*/  = (int) (0);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=111673396;
 //BA.debugLineNum = 111673396;BA.debugLine="WaitToConfirm = True";
parent._waittoconfirm = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=111673397;
 //BA.debugLineNum = 111673397;BA.debugLine="ShareCode.APPL_CONFIRMED = 0";
parent.mostCurrent._sharecode._appl_confirmed /*int*/  = (int) (0);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=111673399;
 //BA.debugLineNum = 111673399;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=111673401;
 //BA.debugLineNum = 111673401;BA.debugLine="If (WaitToConfirm) And (ShareCode.APPL_CONFIRMED";
if (true) break;

case 23:
//if
this.state = 32;
if ((parent._waittoconfirm) && (parent.mostCurrent._sharecode._appl_confirmed /*int*/ ==0)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=111673402;
 //BA.debugLineNum = 111673402;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AuthorizationDa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._authorizationdata_registerederror /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancelexit /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=111673404;
 //BA.debugLineNum = 111673404;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 26:
//if
this.state = 31;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=111673405;
 //BA.debugLineNum = 111673405;BA.debugLine="ResetPanels";
_resetpanels();
RDebugUtils.currentLine=111673406;
 //BA.debugLineNum = 111673406;BA.debugLine="Panel_Login.Visible = False";
parent.mostCurrent._panel_login.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=111673407;
 //BA.debugLineNum = 111673407;BA.debugLine="Panel_Authorization.Visible = True";
parent.mostCurrent._panel_authorization.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111673408;
 //BA.debugLineNum = 111673408;BA.debugLine="Starter.CurrentFlowPosition = 1";
parent.mostCurrent._starter._currentflowposition /*int*/  = (int) (1);
RDebugUtils.currentLine=111673410;
 //BA.debugLineNum = 111673410;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"APP";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","APPL_CONFIRMED",parent.mostCurrent._sharecode._appl_confirmed /*int*/ );
RDebugUtils.currentLine=111673411;
 //BA.debugLineNum = 111673411;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=111673413;
 //BA.debugLineNum = 111673413;BA.debugLine="ActivityFinish";
_activityfinish();
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=111673416;
 //BA.debugLineNum = 111673416;BA.debugLine="mainFirstInstall.visible = True";
parent.mostCurrent._mainfirstinstall.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111673417;
 //BA.debugLineNum = 111673417;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _qrcodereader_result_found(String _retval) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "qrcodereader_result_found", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "qrcodereader_result_found", new Object[] {_retval}));}
RDebugUtils.currentLine=112459776;
 //BA.debugLineNum = 112459776;BA.debugLine="Sub QRCodeReader_result_found(retval As String)";
RDebugUtils.currentLine=112459777;
 //BA.debugLineNum = 112459777;BA.debugLine="QRCodeKeyReceived = retval";
mostCurrent._qrcodekeyreceived = _retval;
RDebugUtils.currentLine=112459778;
 //BA.debugLineNum = 112459778;BA.debugLine="butSaveQRCode.Enabled = True";
mostCurrent._butsaveqrcode.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=112459779;
 //BA.debugLineNum = 112459779;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removealllocalinfoandsqlfiles() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "removealllocalinfoandsqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "removealllocalinfoandsqlfiles", null));}
ResumableSub_RemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_RemoveAllLocalInfoAndSqlFiles(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_RemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.main parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.main parent;
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
RDebugUtils.currentModule="main";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=112721922;
 //BA.debugLineNum = 112721922;BA.debugLine="Dim LocaRes As Boolean = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=112721923;
 //BA.debugLineNum = 112721923;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "removealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=112721924;
 //BA.debugLineNum = 112721924;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=112721925;
 //BA.debugLineNum = 112721925;BA.debugLine="For Each F As String In Files";
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
RDebugUtils.currentLine=112721926;
 //BA.debugLineNum = 112721926;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") And Not(F.To";
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
RDebugUtils.currentLine=112721927;
 //BA.debugLineNum = 112721927;BA.debugLine="File.Delete(Starter.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,_f);
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
RDebugUtils.currentLine=112721930;
 //BA.debugLineNum = 112721930;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=112721932;
 //BA.debugLineNum = 112721932;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=112721935;
 //BA.debugLineNum = 112721935;BA.debugLine="Wait For (File.ListFilesAsync(Starter.SharedFolde";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "main", "removealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ));
this.state = 32;
return;
case 32:
//C
this.state = 15;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=112721936;
 //BA.debugLineNum = 112721936;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=112721937;
 //BA.debugLineNum = 112721937;BA.debugLine="For Each F As String In Files";
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
RDebugUtils.currentLine=112721938;
 //BA.debugLineNum = 112721938;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") And Not(F.ToL";
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
RDebugUtils.currentLine=112721939;
 //BA.debugLineNum = 112721939;BA.debugLine="File.Delete(Starter.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,_f);
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
RDebugUtils.currentLine=112721942;
 //BA.debugLineNum = 112721942;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=112721944;
 //BA.debugLineNum = 112721944;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=112721947;
 //BA.debugLineNum = 112721947;BA.debugLine="Return LocaRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_locares));return;};
RDebugUtils.currentLine=112721949;
 //BA.debugLineNum = 112721949;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _restartapp(int _newori) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "restartapp", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "restartapp", new Object[] {_newori}));}
RDebugUtils.currentLine=110952448;
 //BA.debugLineNum = 110952448;BA.debugLine="Sub RestartApp(newOri As Int)";
RDebugUtils.currentLine=110952449;
 //BA.debugLineNum = 110952449;BA.debugLine="mainSplashImageEffect.Visible = False";
mostCurrent._mainsplashimageeffect.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110952450;
 //BA.debugLineNum = 110952450;BA.debugLine="ShareCode.DEVICE_ORIENTATION = newOri";
mostCurrent._sharecode._device_orientation /*int*/  = _newori;
RDebugUtils.currentLine=110952451;
 //BA.debugLineNum = 110952451;BA.debugLine="Device.SetScreenOrientation(newOri)";
_device.SetScreenOrientation(processBA,_newori);
RDebugUtils.currentLine=110952452;
 //BA.debugLineNum = 110952452;BA.debugLine="GoStartApp";
_gostartapp();
RDebugUtils.currentLine=110952453;
 //BA.debugLineNum = 110952453;BA.debugLine="End Sub";
return "";
}
public static String  _setcompanyimagegravity() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setcompanyimagegravity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setcompanyimagegravity", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _vrcglogo = null;
RDebugUtils.currentLine=110297088;
 //BA.debugLineNum = 110297088;BA.debugLine="Sub SetCompanyImageGravity";
RDebugUtils.currentLine=110297089;
 //BA.debugLineNum = 110297089;BA.debugLine="Dim VRCGLogo As Bitmap = LoadBitmap(File.DirAsset";
_vrcglogo = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_vrcglogo = anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"icon_100px.png");
RDebugUtils.currentLine=110297090;
 //BA.debugLineNum = 110297090;BA.debugLine="If VRCGLogo = Consts.AppLogo Then";
if ((_vrcglogo).equals(mostCurrent._consts._applogo /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ )) { 
RDebugUtils.currentLine=110297091;
 //BA.debugLineNum = 110297091;BA.debugLine="CompanyImageView.Gravity = Gravity.CENTER";
mostCurrent._companyimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
 }else {
RDebugUtils.currentLine=110297093;
 //BA.debugLineNum = 110297093;BA.debugLine="CompanyImageView.Gravity = Gravity.FILL";
mostCurrent._companyimageview.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
RDebugUtils.currentLine=110297095;
 //BA.debugLineNum = 110297095;BA.debugLine="End Sub";
return "";
}
public static String  _setuserinfo(anywheresoftware.b4a.sql.SQL.CursorWrapper _record,String _uname) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setuserinfo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setuserinfo", new Object[] {_record,_uname}));}
RDebugUtils.currentLine=111869952;
 //BA.debugLineNum = 111869952;BA.debugLine="Sub SetUserInfo(Record As Cursor, uname As String)";
RDebugUtils.currentLine=111869953;
 //BA.debugLineNum = 111869953;BA.debugLine="If (Record.GetString(\"title\") <> \"\") Then";
if (((_record.GetString("title")).equals("") == false)) { 
RDebugUtils.currentLine=111869954;
 //BA.debugLineNum = 111869954;BA.debugLine="ShareCode.SESS_User = Record.GetString(\"tagcode\"";
mostCurrent._sharecode._sess_user /*String*/  = _record.GetString("tagcode");
RDebugUtils.currentLine=111869955;
 //BA.debugLineNum = 111869955;BA.debugLine="ShareCode.SESS_UWDUKEY = uname";
mostCurrent._sharecode._sess_uwdukey /*String*/  = _uname;
RDebugUtils.currentLine=111869956;
 //BA.debugLineNum = 111869956;BA.debugLine="ShareCode.SESS_WareHouse = Record.GetString(\"war";
mostCurrent._sharecode._sess_warehouse /*String*/  = _record.GetString("warehouse");
RDebugUtils.currentLine=111869957;
 //BA.debugLineNum = 111869957;BA.debugLine="ShareCode.USR_STATE = Record.GetInt(\"available\")";
mostCurrent._sharecode._usr_state /*int*/  = _record.GetInt("available");
RDebugUtils.currentLine=111869958;
 //BA.debugLineNum = 111869958;BA.debugLine="ShareCode.SESS_UserName = Record.GetString(\"titl";
mostCurrent._sharecode._sess_username /*String*/  = _record.GetString("title");
RDebugUtils.currentLine=111869959;
 //BA.debugLineNum = 111869959;BA.debugLine="ShareCode.SESS_UserProfile = Record.GetString(\"p";
mostCurrent._sharecode._sess_userprofile /*String*/  = _record.GetString("profile_tagcode");
RDebugUtils.currentLine=111869960;
 //BA.debugLineNum = 111869960;BA.debugLine="ShareCode.SESS_UserTeam = \"\"";
mostCurrent._sharecode._sess_userteam /*String*/  = "";
RDebugUtils.currentLine=111869962;
 //BA.debugLineNum = 111869962;BA.debugLine="ShareCode.SESS_OPER_User = ShareCode.SESS_User";
mostCurrent._sharecode._sess_oper_user /*String*/  = mostCurrent._sharecode._sess_user /*String*/ ;
RDebugUtils.currentLine=111869963;
 //BA.debugLineNum = 111869963;BA.debugLine="ShareCode.SESS_OPER_UserName = ShareCode.SESS_Us";
mostCurrent._sharecode._sess_oper_username /*String*/  = mostCurrent._sharecode._sess_username /*String*/ ;
RDebugUtils.currentLine=111869964;
 //BA.debugLineNum = 111869964;BA.debugLine="ShareCode.SESS_OPER_UWDUKEY = uname";
mostCurrent._sharecode._sess_oper_uwdukey /*String*/  = _uname;
RDebugUtils.currentLine=111869966;
 //BA.debugLineNum = 111869966;BA.debugLine="ShareCode.APP_LAST_USER = ShareCode.SESS_UWDUKEY";
mostCurrent._sharecode._app_last_user /*String*/  = mostCurrent._sharecode._sess_uwdukey /*String*/ ;
 };
RDebugUtils.currentLine=111869968;
 //BA.debugLineNum = 111869968;BA.debugLine="End Sub";
return "";
}
public static String  _setshowwhenlocked() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setshowwhenlocked", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setshowwhenlocked", null));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=108986368;
 //BA.debugLineNum = 108986368;BA.debugLine="Sub SetShowWhenLocked";
RDebugUtils.currentLine=108986369;
 //BA.debugLineNum = 108986369;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=108986370;
 //BA.debugLineNum = 108986370;BA.debugLine="r.Target = r.GetActivity";
_r.Target = (Object)(_r.GetActivity(processBA));
RDebugUtils.currentLine=108986371;
 //BA.debugLineNum = 108986371;BA.debugLine="r.Target = r.RunMethod(\"getWindow\")";
_r.Target = _r.RunMethod("getWindow");
RDebugUtils.currentLine=108986372;
 //BA.debugLineNum = 108986372;BA.debugLine="r.RunMethod2(\"addFlags\", 6815872, \"java.lang.int\"";
_r.RunMethod2("addFlags",BA.NumberToString(6815872),"java.lang.int");
RDebugUtils.currentLine=108986374;
 //BA.debugLineNum = 108986374;BA.debugLine="End Sub";
return "";
}
public static String  _timestart_tick() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timestart_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timestart_tick", null));}
RDebugUtils.currentLine=111214592;
 //BA.debugLineNum = 111214592;BA.debugLine="Sub TimeStart_Tick";
RDebugUtils.currentLine=111214593;
 //BA.debugLineNum = 111214593;BA.debugLine="Log(\"TimeStart_Tick\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6111214593","TimeStart_Tick",0);
RDebugUtils.currentLine=111214594;
 //BA.debugLineNum = 111214594;BA.debugLine="TimeStartCounter = TimeStartCounter + 1";
_timestartcounter = (int) (_timestartcounter+1);
RDebugUtils.currentLine=111214595;
 //BA.debugLineNum = 111214595;BA.debugLine="mainSplashProgress.Progress = TimeStartCounter 'm";
mostCurrent._mainsplashprogress.setProgress(_timestartcounter);
RDebugUtils.currentLine=111214597;
 //BA.debugLineNum = 111214597;BA.debugLine="If (TimeStartCounter >= 10) Then";
if ((_timestartcounter>=10)) { 
RDebugUtils.currentLine=111214599;
 //BA.debugLineNum = 111214599;BA.debugLine="TimeStart.Enabled = False";
_timestart.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=111214600;
 //BA.debugLineNum = 111214600;BA.debugLine="mainSplashProgress.Visible = False";
mostCurrent._mainsplashprogress.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=111214601;
 //BA.debugLineNum = 111214601;BA.debugLine="mainSplashProgress.Progress = 0";
mostCurrent._mainsplashprogress.setProgress((int) (0));
RDebugUtils.currentLine=111214602;
 //BA.debugLineNum = 111214602;BA.debugLine="mainSplashImageEffect.Visible = True";
mostCurrent._mainsplashimageeffect.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=111214604;
 //BA.debugLineNum = 111214604;BA.debugLine="GetDeviceParamsFromDatabase";
_getdeviceparamsfromdatabase();
RDebugUtils.currentLine=111214606;
 //BA.debugLineNum = 111214606;BA.debugLine="Starter.MakingLogin = True";
mostCurrent._starter._makinglogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=111214608;
 //BA.debugLineNum = 111214608;BA.debugLine="SetFTPUser";
_setftpuser();
RDebugUtils.currentLine=111214618;
 //BA.debugLineNum = 111214618;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
RDebugUtils.currentLine=111214619;
 //BA.debugLineNum = 111214619;BA.debugLine="Log(\"-----------  Não é local\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6111214619","-----------  Não é local",0);
RDebugUtils.currentLine=111214627;
 //BA.debugLineNum = 111214627;BA.debugLine="CallSubDelayed(DataUpdate, \"FirstSubFromLogin\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._dataupdate.getObject()),"FirstSubFromLogin");
 }else {
RDebugUtils.currentLine=111214630;
 //BA.debugLineNum = 111214630;BA.debugLine="Log(\"-----------  Aplicação em modo local\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6111214630","-----------  Aplicação em modo local",0);
RDebugUtils.currentLine=111214631;
 //BA.debugLineNum = 111214631;BA.debugLine="CallSubDelayed2(MainMenu, \"StartTheActivity\", T";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"StartTheActivity",(Object)(anywheresoftware.b4a.keywords.Common.True));
 };
RDebugUtils.currentLine=111214634;
 //BA.debugLineNum = 111214634;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\"";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
 };
RDebugUtils.currentLine=111214636;
 //BA.debugLineNum = 111214636;BA.debugLine="Log(\"**  START LOG_SERVICE  : \" & mainSplashProgr";
anywheresoftware.b4a.keywords.Common.LogImpl("6111214636","**  START LOG_SERVICE  : "+BA.NumberToString(mostCurrent._mainsplashprogress.getProgress())+BA.NumberToString(_timestartcounter),0);
RDebugUtils.currentLine=111214638;
 //BA.debugLineNum = 111214638;BA.debugLine="End Sub";
return "";
}
public static String  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null));}
RDebugUtils.currentLine=110231552;
 //BA.debugLineNum = 110231552;BA.debugLine="Sub WindowStatusUpdate";
RDebugUtils.currentLine=110231553;
 //BA.debugLineNum = 110231553;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
mostCurrent._labelversion.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=110231554;
 //BA.debugLineNum = 110231554;BA.debugLine="ButtonAppNetwork.Enabled = False";
mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=110231555;
 //BA.debugLineNum = 110231555;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
mostCurrent._buttonappnetwork.setTextColor(mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=110231556;
 //BA.debugLineNum = 110231556;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
if ((mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
RDebugUtils.currentLine=110231557;
 //BA.debugLineNum = 110231557;BA.debugLine="ButtonAppNetwork.Enabled = True";
mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=110231558;
 //BA.debugLineNum = 110231558;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
mostCurrent._buttonappnetwork.setTextColor(mostCurrent._consts._colorredorange /*int*/ );
 };
RDebugUtils.currentLine=110231560;
 //BA.debugLineNum = 110231560;BA.debugLine="End Sub";
return "";
}


    public static String getMacAddr() {
    try {
        List<NetworkInterface> all = Collections.list(NetworkInterface.getNetworkInterfaces());
        for (NetworkInterface nif : all) {
            if (!nif.getName().equalsIgnoreCase("wlan0"))
            continue;

            byte[] macBytes = nif.getHardwareAddress();
            if (macBytes == null) {
                return "";
            }

            StringBuilder res1 = new StringBuilder();
            for (byte b : macBytes) {
                res1.append(Integer.toHexString(b & 0xFF) + ":");
            }

            if (res1.length() > 0) {
                res1.deleteCharAt(res1.length() - 1);
            }
            return res1.toString();
        }
    } catch (Exception ex) {
    }
    return "02:00:00:00:00:00";
}
}