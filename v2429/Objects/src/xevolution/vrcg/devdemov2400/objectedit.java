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

public class objectedit extends Activity implements B4AActivity{
	public static objectedit mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.objectedit");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (objectedit).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.objectedit");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.objectedit", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (objectedit) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (objectedit) Resume **");
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
		return objectedit.class;
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
            BA.LogInfo("** Activity (objectedit) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (objectedit) Pause event (activity is not paused). **");
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
            objectedit mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (objectedit) Resume **");
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelappinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonadd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _listslabelinfo = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public xevolution.vrcg.devdemov2400.customlistviewcollapse _objectlistview = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectnotes = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _objecttype = null;
public anywheresoftware.b4a.objects.LabelWrapper _objecttagcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontactname = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcontactedit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltypecontact = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontactemail = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontactphone = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdresstype = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdressname = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdressname2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdresspostalcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdresslatitude = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdresslongitude = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbladdresscity = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butaddressmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butaddressedit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpropertyvalue = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butpropertyedit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpropertyname = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroupexpanded = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouptitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcurrent = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupcollpseexpand = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrouptitle = null;
public static int _currentgroupitem = 0;
public static int _currentgroupitemprop = 0;
public static int _pnlgroupcurrenindex = 0;
public static int _pnlgroupcurrenpropindex = 0;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractname = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractstart = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractend = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractdaysperiod = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractduration = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractdaysnotice = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w0 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w6 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _w7 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d3 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d5 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d6 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d7 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d8 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d9 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d10 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d11 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d12 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d13 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d14 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d15 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d16 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d17 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d18 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d19 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d20 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d30 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d29 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d28 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d27 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d26 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d25 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d24 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d23 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d22 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d21 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d31 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d32 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _d33 = null;
public anywheresoftware.b4a.objects.PanelWrapper _contractpanel = null;
public anywheresoftware.b4a.objects.collections.List _typeperiodicity = null;
public anywheresoftware.b4a.objects.collections.List _typedayperiod = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcontracttask = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcontracttask = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontracthourperiod = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontracthours = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectcontractperiod = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectwhname = null;
public xevolution.vrcg.devdemov2400.customlistviewcollapse _objectwhitemscheck = null;
public xevolution.vrcg.devdemov2400.customlistviewcollapse _objectwhitemstaken = null;
public static String _currentaddresstagcode = "";
public static String _currentobjecttagcode = "";
public anywheresoftware.b4a.objects.collections.List _typeaddresslist = null;
public static String _currentcontacttagcode = "";
public anywheresoftware.b4a.objects.collections.List _typecontactslist = null;
public b4a.example3.customlistview _listobjects = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemreference = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemlocation = null;
public anywheresoftware.b4a.objects.PanelWrapper _norecordspanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _norecordslabel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutrefresh = null;
public b4a.example3.customlistview _listdocuments = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdocbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemcategory = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemsdate = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemedate = null;
public anywheresoftware.b4a.objects.PanelWrapper _warehousepanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemfullname = null;
public xevolution.vrcg.devdemov2400.customlistviewcollapse _objectpropertylistview = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrouptitle2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouptitle2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupcollpseexpand2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroupexpanded2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupcollpseexpandprop = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouptitleprop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlcurrentprop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroupexpandedprop = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrouptitleprop = null;
public xevolution.vrcg.devdemov2400.types._objecttype _thisobjecttype = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtype = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtodayrequests = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutmap = null;
public anywheresoftware.b4a.objects.collections.List _objrequests = null;
public anywheresoftware.b4a.objects.collections.List _objrequestsnottoday = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public anywheresoftware.b4a.objects.PanelWrapper _objectslistviewpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _objectsdocumentsviewpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _objectdocumentsviewpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupanelbuttonone = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupanelbuttomtwo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupanelbuttonthree = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupanelbuttonfour = null;
public anywheresoftware.b4a.objects.collections.List _menupanelbuttonlist = null;
public anywheresoftware.b4a.objects.collections.List _menupanelpagestitle = null;
public static int _buttononelayoutindex = 0;
public static int _buttononelayouttwo = 0;
public static int _buttononelayoutthree = 0;
public static int _buttononelayoutfour = 0;
public static String _objecteditselectedname = "";
public static String _objectparent = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _menupanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showimage = null;
public anywheresoftware.b4a.objects.LabelWrapper _imagefilename = null;
public anywheresoftware.b4a.objects.LabelWrapper _imagestatename = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjdocsdescritivo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjdocsvalidade = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltypeobjectfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjvvdescritivo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjvvvalidade = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjvvaccao = null;
public anywheresoftware.b4a.objects.LabelWrapper _objgv2labeltipoobj = null;
public anywheresoftware.b4a.objects.LabelWrapper _objgv2labelcodinterno = null;
public anywheresoftware.b4a.objects.LabelWrapper _objgv2labelobs = null;
public anywheresoftware.b4a.objects.LabelWrapper _objgv2labelref = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_tipomorada = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_endereco = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_continua = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_cpostal = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_latitude = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_longitude = null;
public anywheresoftware.b4a.objects.LabelWrapper _itemaddress_localidade = null;
public anywheresoftware.b4a.objects.LabelWrapper _objgv2labelrelacao = null;
public anywheresoftware.b4a.objects.LabelWrapper _objparent = null;
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
public static String  _settheaddress(xevolution.vrcg.devdemov2400.types._address _theaddress) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "settheaddress", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "settheaddress", new Object[] {_theaddress}));}
RDebugUtils.currentLine=149553152;
 //BA.debugLineNum = 149553152;BA.debugLine="Sub SetTheAddress(theAddress As Address)";
RDebugUtils.currentLine=149553155;
 //BA.debugLineNum = 149553155;BA.debugLine="If (theAddress.asNew = False) Then";
if ((_theaddress.asNew /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=149553156;
 //BA.debugLineNum = 149553156;BA.debugLine="DBStructures.UpdateAddress(CurrentobjectTagcode,";
mostCurrent._dbstructures._updateaddress /*String*/ (mostCurrent.activityBA,mostCurrent._currentobjecttagcode,mostCurrent._currentaddresstagcode,_theaddress);
 }else {
RDebugUtils.currentLine=149553159;
 //BA.debugLineNum = 149553159;BA.debugLine="CurrentAddressTagcode = \"ADRSS_\" & Utils.GetCurr";
mostCurrent._currentaddresstagcode = "ADRSS_"+mostCurrent._utils._getcurrdatetimeformat /*String*/ (mostCurrent.activityBA,"MMdd","HHmmss",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=149553160;
 //BA.debugLineNum = 149553160;BA.debugLine="DBStructures.InsertAddress(CurrentobjectTagcode,";
mostCurrent._dbstructures._insertaddress /*String*/ (mostCurrent.activityBA,mostCurrent._currentobjecttagcode,mostCurrent._currentaddresstagcode,_theaddress);
 };
RDebugUtils.currentLine=149553162;
 //BA.debugLineNum = 149553162;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
_updateobjectform(mostCurrent._currentobjecttagcode);
RDebugUtils.currentLine=149553163;
 //BA.debugLineNum = 149553163;BA.debugLine="End Sub";
return "";
}
public static String  _setthecontact(xevolution.vrcg.devdemov2400.types._contactrecord _thecontact) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setthecontact", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setthecontact", new Object[] {_thecontact}));}
RDebugUtils.currentLine=149684224;
 //BA.debugLineNum = 149684224;BA.debugLine="Sub SetTheContact(theContact As ContactRecord)";
RDebugUtils.currentLine=149684225;
 //BA.debugLineNum = 149684225;BA.debugLine="If (theContact.asNew = False) Then";
if ((_thecontact.asNew /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=149684226;
 //BA.debugLineNum = 149684226;BA.debugLine="DBStructures.UpdateContact(theContact)";
mostCurrent._dbstructures._updatecontact /*String*/ (mostCurrent.activityBA,_thecontact);
 };
RDebugUtils.currentLine=149684232;
 //BA.debugLineNum = 149684232;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
_updateobjectform(mostCurrent._currentobjecttagcode);
RDebugUtils.currentLine=149684233;
 //BA.debugLineNum = 149684233;BA.debugLine="End Sub";
return "";
}
public static String  _setthegeoreference(xevolution.vrcg.devdemov2400.types._georeference _thegeo) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setthegeoreference", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setthegeoreference", new Object[] {_thegeo}));}
RDebugUtils.currentLine=149618688;
 //BA.debugLineNum = 149618688;BA.debugLine="Sub SetTheGeoReference(theGeo As GeoReference)";
RDebugUtils.currentLine=149618689;
 //BA.debugLineNum = 149618689;BA.debugLine="If (theGeo.asNew = False) Then";
if ((_thegeo.asNew /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=149618690;
 //BA.debugLineNum = 149618690;BA.debugLine="DBStructures.UpdateAddressGeoReference(Currentob";
mostCurrent._dbstructures._updateaddressgeoreference /*String*/ (mostCurrent.activityBA,mostCurrent._currentobjecttagcode,mostCurrent._currentaddresstagcode,_thegeo);
 };
RDebugUtils.currentLine=149618696;
 //BA.debugLineNum = 149618696;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
_updateobjectform(mostCurrent._currentobjecttagcode);
RDebugUtils.currentLine=149618697;
 //BA.debugLineNum = 149618697;BA.debugLine="End Sub";
return "";
}
public static String  _setthepropertyinsert(String _property,String _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setthepropertyinsert", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setthepropertyinsert", new Object[] {_property,_value}));}
RDebugUtils.currentLine=149749760;
 //BA.debugLineNum = 149749760;BA.debugLine="Sub SetThePropertyInsert(property As String, value";
RDebugUtils.currentLine=149749761;
 //BA.debugLineNum = 149749761;BA.debugLine="DBStructures.InsertobjectProperty(CurrentobjectTa";
mostCurrent._dbstructures._insertobjectproperty /*String*/ (mostCurrent.activityBA,mostCurrent._currentobjecttagcode,_property,_value);
RDebugUtils.currentLine=149749762;
 //BA.debugLineNum = 149749762;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
_updateobjectform(mostCurrent._currentobjecttagcode);
RDebugUtils.currentLine=149749763;
 //BA.debugLineNum = 149749763;BA.debugLine="End Sub";
return "";
}
public static String  _setthepropertyupdate(String _property,String _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setthepropertyupdate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setthepropertyupdate", new Object[] {_property,_value}));}
RDebugUtils.currentLine=149815296;
 //BA.debugLineNum = 149815296;BA.debugLine="Sub SetThePropertyUpdate(property As String, value";
RDebugUtils.currentLine=149815297;
 //BA.debugLineNum = 149815297;BA.debugLine="DBStructures.UpdateobjectProperty(CurrentobjectTa";
mostCurrent._dbstructures._updateobjectproperty /*String*/ (mostCurrent.activityBA,mostCurrent._currentobjecttagcode,_property,_value);
RDebugUtils.currentLine=149815298;
 //BA.debugLineNum = 149815298;BA.debugLine="UpdateobjectForm(CurrentobjectTagcode)";
_updateobjectform(mostCurrent._currentobjecttagcode);
RDebugUtils.currentLine=149815299;
 //BA.debugLineNum = 149815299;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _where = "";
String _s = "";
RDebugUtils.currentLine=146866176;
 //BA.debugLineNum = 146866176;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=146866178;
 //BA.debugLineNum = 146866178;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=146866179;
 //BA.debugLineNum = 146866179;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
RDebugUtils.currentLine=146866180;
 //BA.debugLineNum = 146866180;BA.debugLine="Activity.LoadLayout(\"phone_object_editlayout\")";
mostCurrent._activity.LoadLayout("phone_object_editlayout",mostCurrent.activityBA);
RDebugUtils.currentLine=146866181;
 //BA.debugLineNum = 146866181;BA.debugLine="MenuPanelButtonList.Initialize";
mostCurrent._menupanelbuttonlist.Initialize();
RDebugUtils.currentLine=146866182;
 //BA.debugLineNum = 146866182;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtonOne)";
mostCurrent._menupanelbuttonlist.Add((Object)(mostCurrent._menupanelbuttonone.getObject()));
RDebugUtils.currentLine=146866183;
 //BA.debugLineNum = 146866183;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtomTwo)";
mostCurrent._menupanelbuttonlist.Add((Object)(mostCurrent._menupanelbuttomtwo.getObject()));
RDebugUtils.currentLine=146866184;
 //BA.debugLineNum = 146866184;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtonThree)";
mostCurrent._menupanelbuttonlist.Add((Object)(mostCurrent._menupanelbuttonthree.getObject()));
RDebugUtils.currentLine=146866185;
 //BA.debugLineNum = 146866185;BA.debugLine="MenuPanelButtonList.Add(MenuPanelButtonFour)";
mostCurrent._menupanelbuttonlist.Add((Object)(mostCurrent._menupanelbuttonfour.getObject()));
 }else {
RDebugUtils.currentLine=146866187;
 //BA.debugLineNum = 146866187;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
RDebugUtils.currentLine=146866188;
 //BA.debugLineNum = 146866188;BA.debugLine="Activity.LoadLayout(\"object_editLayout\")";
mostCurrent._activity.LoadLayout("object_editLayout",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=146866191;
 //BA.debugLineNum = 146866191;BA.debugLine="MenuPanelPagesTitle.Initialize";
mostCurrent._menupanelpagestitle.Initialize();
RDebugUtils.currentLine=146866194;
 //BA.debugLineNum = 146866194;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=146866196;
 //BA.debugLineNum = 146866196;BA.debugLine="Starter.CurrentWorkActivity = Me";
mostCurrent._starter._currentworkactivity /*Object*/  = objectedit.getObject();
RDebugUtils.currentLine=146866197;
 //BA.debugLineNum = 146866197;BA.debugLine="TypeAddressList.Initialize";
mostCurrent._typeaddresslist.Initialize();
RDebugUtils.currentLine=146866198;
 //BA.debugLineNum = 146866198;BA.debugLine="TypeAddressList = DBStructures.GetListOfAddresseT";
mostCurrent._typeaddresslist = mostCurrent._dbstructures._getlistofaddressetypesevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=146866199;
 //BA.debugLineNum = 146866199;BA.debugLine="TypeContactsList.Initialize";
mostCurrent._typecontactslist.Initialize();
RDebugUtils.currentLine=146866200;
 //BA.debugLineNum = 146866200;BA.debugLine="TypeContactsList = DBStructures.GetListOfContactT";
mostCurrent._typecontactslist = mostCurrent._dbstructures._getlistofcontacttypesevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=146866201;
 //BA.debugLineNum = 146866201;BA.debugLine="TypePeriodicity.Initialize";
mostCurrent._typeperiodicity.Initialize();
RDebugUtils.currentLine=146866202;
 //BA.debugLineNum = 146866202;BA.debugLine="TypePeriodicity = DBStructures.GetListOfPeriodici";
mostCurrent._typeperiodicity = mostCurrent._dbstructures._getlistofperiodicitytypesevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=146866203;
 //BA.debugLineNum = 146866203;BA.debugLine="TypeDayPeriod.Initialize";
mostCurrent._typedayperiod.Initialize();
RDebugUtils.currentLine=146866204;
 //BA.debugLineNum = 146866204;BA.debugLine="TypeDayPeriod = DBStructures.GetListOfDayPeriodTy";
mostCurrent._typedayperiod = mostCurrent._dbstructures._getlistofdayperiodtypesevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=146866206;
 //BA.debugLineNum = 146866206;BA.debugLine="Dim where As String = $\"select distinct b.object";
_where = ("select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where a.request_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._current_appdate /*String*/ ))+"'");
RDebugUtils.currentLine=146866207;
 //BA.debugLineNum = 146866207;BA.debugLine="ObjRequests = DBStructures.GetListOfFromScript(\"o";
mostCurrent._objrequests = mostCurrent._dbstructures._getlistoffromscript /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"object",_where);
RDebugUtils.currentLine=146866209;
 //BA.debugLineNum = 146866209;BA.debugLine="Dim s As String = Utils.StrList2SQLArray(ObjReque";
_s = mostCurrent._utils._strlist2sqlarray /*String*/ (mostCurrent.activityBA,mostCurrent._objrequests);
RDebugUtils.currentLine=146866210;
 //BA.debugLineNum = 146866210;BA.debugLine="Dim where As String = $\"Select distinct b.object";
_where = ("Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)\n"+"							where a.request_date<>'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._current_appdate /*String*/ ))+"' and b.object not in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_s))+"");
RDebugUtils.currentLine=146866212;
 //BA.debugLineNum = 146866212;BA.debugLine="ObjRequestsNotToday = DBStructures.GetListOfFromS";
mostCurrent._objrequestsnottoday = mostCurrent._dbstructures._getlistoffromscript /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"object",_where);
RDebugUtils.currentLine=146866214;
 //BA.debugLineNum = 146866214;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=146866215;
 //BA.debugLineNum = 146866215;BA.debugLine="End Sub";
return "";
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=146931712;
 //BA.debugLineNum = 146931712;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=146931713;
 //BA.debugLineNum = 146931713;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
mostCurrent._mainlabeloptlists.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=146931714;
 //BA.debugLineNum = 146931714;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=146931715;
 //BA.debugLineNum = 146931715;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=146931716;
 //BA.debugLineNum = 146931716;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
 };
RDebugUtils.currentLine=146931718;
 //BA.debugLineNum = 146931718;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
anywheresoftware.b4a.keywords.Common.LogImpl("6146931718",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=146931720;
 //BA.debugLineNum = 146931720;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=146931721;
 //BA.debugLineNum = 146931721;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
RDebugUtils.currentLine=146931728;
 //BA.debugLineNum = 146931728;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=146931729;
 //BA.debugLineNum = 146931729;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._liststabpanel));
RDebugUtils.currentLine=146931730;
 //BA.debugLineNum = 146931730;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.GetField("tabStrip")));
RDebugUtils.currentLine=146931732;
 //BA.debugLineNum = 146931732;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
_jo.RunMethod("setIndicatorColor",new Object[]{(Object)(mostCurrent._consts._colormain /*int*/ )});
RDebugUtils.currentLine=146931733;
 //BA.debugLineNum = 146931733;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=147128320;
 //BA.debugLineNum = 147128320;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=147128321;
 //BA.debugLineNum = 147128321;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=147128322;
 //BA.debugLineNum = 147128322;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=147128323;
 //BA.debugLineNum = 147128323;BA.debugLine="Return PhoneBackButtonTab";
if (true) return _phonebackbuttontab();
 };
RDebugUtils.currentLine=147128325;
 //BA.debugLineNum = 147128325;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=147128327;
 //BA.debugLineNum = 147128327;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=147128328;
 //BA.debugLineNum = 147128328;BA.debugLine="End Sub";
return false;
}
public static boolean  _phonebackbuttontab() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "phonebackbuttontab", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "phonebackbuttontab", null));}
RDebugUtils.currentLine=147193856;
 //BA.debugLineNum = 147193856;BA.debugLine="Sub PhoneBackButtonTab As Boolean";
RDebugUtils.currentLine=147193857;
 //BA.debugLineNum = 147193857;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=147193858;
 //BA.debugLineNum = 147193858;BA.debugLine="If (MenuPanel.Visible = False) Then";
if ((mostCurrent._menupanel.getVisible()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=147193859;
 //BA.debugLineNum = 147193859;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=147193860;
 //BA.debugLineNum = 147193860;BA.debugLine="MenuPanel.Visible = True";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=147193861;
 //BA.debugLineNum = 147193861;BA.debugLine="mainLabelOptLists.Text = ObjectEditSelectedName";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._objecteditselectedname));
RDebugUtils.currentLine=147193862;
 //BA.debugLineNum = 147193862;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=147193865;
 //BA.debugLineNum = 147193865;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=147193866;
 //BA.debugLineNum = 147193866;BA.debugLine="End Sub";
return false;
}
public static String  _listsbuttonclose_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=148439040;
 //BA.debugLineNum = 148439040;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=148439041;
 //BA.debugLineNum = 148439041;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=148439042;
 //BA.debugLineNum = 148439042;BA.debugLine="If(PhoneBackButtonTab) Then";
if ((_phonebackbuttontab())) { 
RDebugUtils.currentLine=148439043;
 //BA.debugLineNum = 148439043;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=148439047;
 //BA.debugLineNum = 148439047;BA.debugLine="CallSubDelayed2(Objects, \"EditReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._objects.getObject()),"EditReturn",(Object)(""));
RDebugUtils.currentLine=148439048;
 //BA.debugLineNum = 148439048;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=148439049;
 //BA.debugLineNum = 148439049;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=148439050;
 //BA.debugLineNum = 148439050;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="objectedit";
RDebugUtils.currentLine=147062784;
 //BA.debugLineNum = 147062784;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=147062786;
 //BA.debugLineNum = 147062786;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=146997248;
 //BA.debugLineNum = 146997248;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=146997253;
 //BA.debugLineNum = 146997253;BA.debugLine="End Sub";
return "";
}
public static String  _buttonaddobjectcontact_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonaddobjectcontact_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonaddobjectcontact_click", null));}
RDebugUtils.currentLine=148635648;
 //BA.debugLineNum = 148635648;BA.debugLine="Sub ButtonAddobjectContact_Click";
RDebugUtils.currentLine=148635650;
 //BA.debugLineNum = 148635650;BA.debugLine="End Sub";
return "";
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
RDebugUtils.currentLine=148570112;
 //BA.debugLineNum = 148570112;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=148570114;
 //BA.debugLineNum = 148570114;BA.debugLine="End Sub";
return "";
}
public static String  _collapseitem(int _index) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "collapseitem", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "collapseitem", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
RDebugUtils.currentLine=149028864;
 //BA.debugLineNum = 149028864;BA.debugLine="Sub CollapseItem(index As Int)";
RDebugUtils.currentLine=149028865;
 //BA.debugLineNum = 149028865;BA.debugLine="Dim id As ItemData = objectListView.GetValue(inde";
_id = (xevolution.vrcg.devdemov2400.checklist3._itemdata)(mostCurrent._objectlistview._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=149028866;
 //BA.debugLineNum = 149028866;BA.debugLine="objectListView.ResizeItem(index, id.CollapsedHeig";
mostCurrent._objectlistview._resizeitem /*String*/ (null,_index,_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=149028867;
 //BA.debugLineNum = 149028867;BA.debugLine="objectListView.GetPanel(index).Tag = False";
mostCurrent._objectlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=149028870;
 //BA.debugLineNum = 149028870;BA.debugLine="If (pnlGroupCurrenIndex <> index) Then";
if ((_pnlgroupcurrenindex!=_index)) { 
RDebugUtils.currentLine=149028873;
 //BA.debugLineNum = 149028873;BA.debugLine="objectListView.GetPanel(index).GetView(0).GetVie";
mostCurrent._objectlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (1)).setText(BA.ObjectToCharSequence(mostCurrent._types._expand_icon /*String*/ ));
RDebugUtils.currentLine=149028874;
 //BA.debugLineNum = 149028874;BA.debugLine="pnlGroupCurrenIndex = index";
_pnlgroupcurrenindex = _index;
 };
RDebugUtils.currentLine=149028879;
 //BA.debugLineNum = 149028879;BA.debugLine="End Sub";
return "";
}
public static String  _collapseitemprop(int _index) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "collapseitemprop", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "collapseitemprop", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
RDebugUtils.currentLine=149159936;
 //BA.debugLineNum = 149159936;BA.debugLine="Sub CollapseItemProp(index As Int)";
RDebugUtils.currentLine=149159937;
 //BA.debugLineNum = 149159937;BA.debugLine="Dim id As ItemData = objectPropertyListView.GetVa";
_id = (xevolution.vrcg.devdemov2400.checklist3._itemdata)(mostCurrent._objectpropertylistview._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=149159938;
 //BA.debugLineNum = 149159938;BA.debugLine="objectPropertyListView.ResizeItem(index, id.Colla";
mostCurrent._objectpropertylistview._resizeitem /*String*/ (null,_index,_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=149159939;
 //BA.debugLineNum = 149159939;BA.debugLine="objectPropertyListView.GetPanel(index).Tag = Fals";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=149159942;
 //BA.debugLineNum = 149159942;BA.debugLine="If (pnlGroupCurrenPropIndex <> index) Then";
if ((_pnlgroupcurrenpropindex!=_index)) { 
RDebugUtils.currentLine=149159943;
 //BA.debugLineNum = 149159943;BA.debugLine="objectPropertyListView.GetPanel(pnlGroupCurrenPr";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pnlgroupcurrenpropindex).GetView((int) (0)).GetView((int) (2)).setColor(mostCurrent._consts._nocolor /*int*/ );
RDebugUtils.currentLine=149159944;
 //BA.debugLineNum = 149159944;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (2)).setColor(mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=149159946;
 //BA.debugLineNum = 149159946;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (1)).setText(BA.ObjectToCharSequence(mostCurrent._types._expand_icon /*String*/ ));
RDebugUtils.currentLine=149159947;
 //BA.debugLineNum = 149159947;BA.debugLine="pnlGroupCurrenPropIndex = index";
_pnlgroupcurrenpropindex = _index;
 }else {
RDebugUtils.currentLine=149159950;
 //BA.debugLineNum = 149159950;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (1)).setText(BA.ObjectToCharSequence(mostCurrent._types._expand_icon /*String*/ ));
 };
RDebugUtils.currentLine=149159953;
 //BA.debugLineNum = 149159953;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createchapter(int _clr,String _title,xevolution.vrcg.devdemov2400.checklist3._itemdata _id,int _idx,int _width,boolean _expanded) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createchapter", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createchapter", new Object[] {_clr,_title,_id,_idx,_width,_expanded}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=148307968;
 //BA.debugLineNum = 148307968;BA.debugLine="Sub CreateChapter(clr As Int, Title As String, id";
RDebugUtils.currentLine=148307969;
 //BA.debugLineNum = 148307969;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=148307970;
 //BA.debugLineNum = 148307970;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHe";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=148307971;
 //BA.debugLineNum = 148307971;BA.debugLine="p.LoadLayout(\"ListCollapseGroup\")";
_p.LoadLayout("ListCollapseGroup",mostCurrent.activityBA);
RDebugUtils.currentLine=148307972;
 //BA.debugLineNum = 148307972;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, p.Width,id.Collapsed";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_p.getWidth(),_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=148307973;
 //BA.debugLineNum = 148307973;BA.debugLine="lblGroupTitle.Text = Title";
mostCurrent._lblgrouptitle.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=148307974;
 //BA.debugLineNum = 148307974;BA.debugLine="lblGroupTitle.Tag = idx";
mostCurrent._lblgrouptitle.setTag((Object)(_idx));
RDebugUtils.currentLine=148307975;
 //BA.debugLineNum = 148307975;BA.debugLine="pnlGroupTitle.Tag = idx";
mostCurrent._pnlgrouptitle.setTag((Object)(_idx));
RDebugUtils.currentLine=148307976;
 //BA.debugLineNum = 148307976;BA.debugLine="butGroupCollpseExpand.Tag = idx";
mostCurrent._butgroupcollpseexpand.setTag((Object)(_idx));
RDebugUtils.currentLine=148307977;
 //BA.debugLineNum = 148307977;BA.debugLine="p.Tag = Expanded 'collapsed";
_p.setTag((Object)(_expanded));
RDebugUtils.currentLine=148307978;
 //BA.debugLineNum = 148307978;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=148307979;
 //BA.debugLineNum = 148307979;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createchapterprop(int _clr,String _title,xevolution.vrcg.devdemov2400.checklist3._itemdata _id,int _idx,int _width,boolean _expanded) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createchapterprop", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createchapterprop", new Object[] {_clr,_title,_id,_idx,_width,_expanded}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=148373504;
 //BA.debugLineNum = 148373504;BA.debugLine="Sub CreateChapterProp(clr As Int, Title As String,";
RDebugUtils.currentLine=148373505;
 //BA.debugLineNum = 148373505;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=148373506;
 //BA.debugLineNum = 148373506;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, width, id.ExpandedHe";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_width,_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=148373508;
 //BA.debugLineNum = 148373508;BA.debugLine="p.LoadLayout(\"ListCollapseGroupProp\")";
_p.LoadLayout("ListCollapseGroupProp",mostCurrent.activityBA);
RDebugUtils.currentLine=148373509;
 //BA.debugLineNum = 148373509;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, p.Width,id.Collapsed";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_p.getWidth(),_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=148373510;
 //BA.debugLineNum = 148373510;BA.debugLine="lblGroupTitleProp.Text = Title";
mostCurrent._lblgrouptitleprop.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=148373511;
 //BA.debugLineNum = 148373511;BA.debugLine="lblGroupTitleProp.Tag = idx";
mostCurrent._lblgrouptitleprop.setTag((Object)(_idx));
RDebugUtils.currentLine=148373512;
 //BA.debugLineNum = 148373512;BA.debugLine="pnlGroupTitleProp.Tag = idx";
mostCurrent._pnlgrouptitleprop.setTag((Object)(_idx));
RDebugUtils.currentLine=148373513;
 //BA.debugLineNum = 148373513;BA.debugLine="butGroupCollpseExpandProp.Tag = idx";
mostCurrent._butgroupcollpseexpandprop.setTag((Object)(_idx));
RDebugUtils.currentLine=148373514;
 //BA.debugLineNum = 148373514;BA.debugLine="p.Tag = Expanded 'collapsed";
_p.setTag((Object)(_expanded));
RDebugUtils.currentLine=148373515;
 //BA.debugLineNum = 148373515;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=148373516;
 //BA.debugLineNum = 148373516;BA.debugLine="End Sub";
return null;
}
public static String  _createcontractfromobject(boolean _clear,String _filter) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createcontractfromobject", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createcontractfromobject", new Object[] {_clear,_filter}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
String _currentcontract = "";
String _dwv = "";
anywheresoftware.b4a.objects.ButtonWrapper[] _bbw = null;
anywheresoftware.b4a.objects.collections.List _weeklist = null;
int _n = 0;
anywheresoftware.b4a.objects.collections.List _dayslist = null;
anywheresoftware.b4a.objects.ButtonWrapper[] _bbd = null;
RDebugUtils.currentLine=147849216;
 //BA.debugLineNum = 147849216;BA.debugLine="Sub CreateContractFromobject(Clear As Boolean, Fil";
RDebugUtils.currentLine=147849217;
 //BA.debugLineNum = 147849217;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=147849218;
 //BA.debugLineNum = 147849218;BA.debugLine="Dim SQL As String = DBStructures.SQL_ALL_OBJECT_C";
_sql = mostCurrent._dbstructures._sql_all_object_contracts /*String*/ ;
RDebugUtils.currentLine=147849219;
 //BA.debugLineNum = 147849219;BA.debugLine="If (Filter <> \"\") Then";
if (((_filter).equals("") == false)) { 
RDebugUtils.currentLine=147849220;
 //BA.debugLineNum = 147849220;BA.debugLine="SQL = $\"${SQL} where ${Filter}\"$";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" where "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"");
 };
RDebugUtils.currentLine=147849222;
 //BA.debugLineNum = 147849222;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=147849223;
 //BA.debugLineNum = 147849223;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=147849224;
 //BA.debugLineNum = 147849224;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=147849225;
 //BA.debugLineNum = 147849225;BA.debugLine="Dim CurrentContract As String = Record.GetString";
_currentcontract = _record.GetString("tagcode");
RDebugUtils.currentLine=147849231;
 //BA.debugLineNum = 147849231;BA.debugLine="objectContractName.Text = Record.GetString(\"titl";
mostCurrent._objectcontractname.setText(BA.ObjectToCharSequence(_record.GetString("title")));
RDebugUtils.currentLine=147849232;
 //BA.debugLineNum = 147849232;BA.debugLine="objectContractStart.text = Record.GetString(\"val";
mostCurrent._objectcontractstart.setText(BA.ObjectToCharSequence(_record.GetString("valid_from")));
RDebugUtils.currentLine=147849233;
 //BA.debugLineNum = 147849233;BA.debugLine="objectContractEnd.text = Record.GetString(\"valid";
mostCurrent._objectcontractend.setText(BA.ObjectToCharSequence(_record.GetString("valid_to")));
RDebugUtils.currentLine=147849235;
 //BA.debugLineNum = 147849235;BA.debugLine="objectContractDaysPeriod.text = Record.GetInt(\"p";
mostCurrent._objectcontractdaysperiod.setText(BA.ObjectToCharSequence(_record.GetInt("periodvisits")));
RDebugUtils.currentLine=147849236;
 //BA.debugLineNum = 147849236;BA.debugLine="objectContractDuration.text = Record.GetInt(\"dur";
mostCurrent._objectcontractduration.setText(BA.ObjectToCharSequence(_record.GetInt("duration")));
RDebugUtils.currentLine=147849237;
 //BA.debugLineNum = 147849237;BA.debugLine="objectContractDaysNotice.text = Record.GetInt(\"c";
mostCurrent._objectcontractdaysnotice.setText(BA.ObjectToCharSequence(_record.GetInt("confirmdays")));
RDebugUtils.currentLine=147849239;
 //BA.debugLineNum = 147849239;BA.debugLine="objectContractPeriod.text = TypePeriodicity.Get(";
mostCurrent._objectcontractperiod.setText(BA.ObjectToCharSequence(mostCurrent._typeperiodicity.Get(_record.GetInt("periodicity"))));
RDebugUtils.currentLine=147849240;
 //BA.debugLineNum = 147849240;BA.debugLine="objectContractHours.text = Record.GetInt(\"hoursp";
mostCurrent._objectcontracthours.setText(BA.ObjectToCharSequence(_record.GetInt("hourspervisit")));
RDebugUtils.currentLine=147849241;
 //BA.debugLineNum = 147849241;BA.debugLine="objectContractHourPeriod.text = TypeDayPeriod.Ge";
mostCurrent._objectcontracthourperiod.setText(BA.ObjectToCharSequence(mostCurrent._typedayperiod.Get(_record.GetInt("dayperiod"))));
RDebugUtils.currentLine=147849243;
 //BA.debugLineNum = 147849243;BA.debugLine="Dim dwv As String = Record.GetString(\"daysweekvi";
_dwv = _record.GetString("daysweekvisit");
RDebugUtils.currentLine=147849244;
 //BA.debugLineNum = 147849244;BA.debugLine="If Not( Utils.isNullOrEmpty(dwv)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_dwv))) { 
RDebugUtils.currentLine=147849245;
 //BA.debugLineNum = 147849245;BA.debugLine="Dim bbw(8) As Button = Array As Button(w0,w1,w2";
_bbw = new anywheresoftware.b4a.objects.ButtonWrapper[]{mostCurrent._w0,mostCurrent._w1,mostCurrent._w2,mostCurrent._w3,mostCurrent._w4,mostCurrent._w5,mostCurrent._w6,mostCurrent._w7};
RDebugUtils.currentLine=147849246;
 //BA.debugLineNum = 147849246;BA.debugLine="Dim weekList As List = Regex.Split(\"\\|\", Record";
_weeklist = new anywheresoftware.b4a.objects.collections.List();
_weeklist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_record.GetString("daysweekvisit")));
RDebugUtils.currentLine=147849247;
 //BA.debugLineNum = 147849247;BA.debugLine="For n=0 To weekList.Size-1";
{
final int step23 = 1;
final int limit23 = (int) (_weeklist.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit23 ;_n = _n + step23 ) {
RDebugUtils.currentLine=147849248;
 //BA.debugLineNum = 147849248;BA.debugLine="bbw(weekList.Get(n)-1).Color = Colors.ARGB(255";
_bbw[(int) ((double)(BA.ObjectToNumber(_weeklist.Get(_n)))-1)].setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (115),(int) (200),(int) (155)));
 }
};
 };
RDebugUtils.currentLine=147849252;
 //BA.debugLineNum = 147849252;BA.debugLine="Dim dwv As String = Record.GetString(\"daismonthv";
_dwv = _record.GetString("daismonthvisit");
RDebugUtils.currentLine=147849253;
 //BA.debugLineNum = 147849253;BA.debugLine="If Not( Utils.isNullOrEmpty(dwv)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_dwv))) { 
RDebugUtils.currentLine=147849254;
 //BA.debugLineNum = 147849254;BA.debugLine="Dim daysList As List = Regex.Split(\"\\|\", Record";
_dayslist = new anywheresoftware.b4a.objects.collections.List();
_dayslist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_record.GetString("daismonthvisit")));
RDebugUtils.currentLine=147849255;
 //BA.debugLineNum = 147849255;BA.debugLine="Dim bbd(33) As Button = Array As Button(d1,d2,d";
_bbd = new anywheresoftware.b4a.objects.ButtonWrapper[]{mostCurrent._d1,mostCurrent._d2,mostCurrent._d3,mostCurrent._d4,mostCurrent._d5,mostCurrent._d6,mostCurrent._d7,mostCurrent._d8,mostCurrent._d9,mostCurrent._d10,mostCurrent._d11,mostCurrent._d12,mostCurrent._d13,mostCurrent._d14,mostCurrent._d15,mostCurrent._d16,mostCurrent._d17,mostCurrent._d18,mostCurrent._d19,mostCurrent._d20,mostCurrent._d30,mostCurrent._d29,mostCurrent._d28,mostCurrent._d27,mostCurrent._d26,mostCurrent._d25,mostCurrent._d24,mostCurrent._d23,mostCurrent._d22,mostCurrent._d21,mostCurrent._d31,mostCurrent._d32,mostCurrent._d33};
RDebugUtils.currentLine=147849258;
 //BA.debugLineNum = 147849258;BA.debugLine="For n=0 To daysList.Size-1";
{
final int step31 = 1;
final int limit31 = (int) (_dayslist.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit31 ;_n = _n + step31 ) {
RDebugUtils.currentLine=147849259;
 //BA.debugLineNum = 147849259;BA.debugLine="bbd(daysList.Get(n)-1).Color = Colors.ARGB(255";
_bbd[(int) ((double)(BA.ObjectToNumber(_dayslist.Get(_n)))-1)].setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (255),(int) (115),(int) (200),(int) (155)));
 }
};
 };
RDebugUtils.currentLine=147849263;
 //BA.debugLineNum = 147849263;BA.debugLine="contractPanel.Tag = CurrentContract";
mostCurrent._contractpanel.setTag((Object)(_currentcontract));
 }else {
RDebugUtils.currentLine=147849265;
 //BA.debugLineNum = 147849265;BA.debugLine="If (contractPanel.IsInitialized) Then  contractP";
if ((mostCurrent._contractpanel.IsInitialized())) { 
mostCurrent._contractpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);};
RDebugUtils.currentLine=147849266;
 //BA.debugLineNum = 147849266;BA.debugLine="If (WareHousePanel.IsInitialized) Then  WareHous";
if ((mostCurrent._warehousepanel.IsInitialized())) { 
mostCurrent._warehousepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);};
 };
RDebugUtils.currentLine=147849268;
 //BA.debugLineNum = 147849268;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=147849269;
 //BA.debugLineNum = 147849269;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createdocumentlistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createdocumentlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createdocumentlistitem", new Object[] {_cnt,_colitems,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _file2setext = "";
RDebugUtils.currentLine=147587072;
 //BA.debugLineNum = 147587072;BA.debugLine="Sub CreateDocumentListItem(cnt As Int, colitems As";
RDebugUtils.currentLine=147587073;
 //BA.debugLineNum = 147587073;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=147587074;
 //BA.debugLineNum = 147587074;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=147587075;
 //BA.debugLineNum = 147587075;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=147587076;
 //BA.debugLineNum = 147587076;BA.debugLine="If (Utils.isNullOrEmpty(ThisObjectType.doctemplat";
if ((mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,mostCurrent._thisobjecttype.doctemplate /*String*/ ))) { 
RDebugUtils.currentLine=147587077;
 //BA.debugLineNum = 147587077;BA.debugLine="p.LoadLayout(\"ListItemDocument\")";
_p.LoadLayout("ListItemDocument",mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=147587079;
 //BA.debugLineNum = 147587079;BA.debugLine="p.LoadLayout(\"ListItemDocumentValidate\")";
_p.LoadLayout("ListItemDocumentValidate",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=147587081;
 //BA.debugLineNum = 147587081;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=147587083;
 //BA.debugLineNum = 147587083;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=147587084;
 //BA.debugLineNum = 147587084;BA.debugLine="ListItemTitle.Text = colitems.GetString(\"title\")";
mostCurrent._listitemtitle.setText(BA.ObjectToCharSequence(_colitems.GetString("title")));
RDebugUtils.currentLine=147587085;
 //BA.debugLineNum = 147587085;BA.debugLine="ListItemCategory.Text = \"\"'colitems.GetString(\"ca";
mostCurrent._listitemcategory.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=147587086;
 //BA.debugLineNum = 147587086;BA.debugLine="ListItemSDate.Text = Utils.IfNullOrEmpty(colitems";
mostCurrent._listitemsdate.setText(BA.ObjectToCharSequence(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("valid_from"),"----------")));
RDebugUtils.currentLine=147587087;
 //BA.debugLineNum = 147587087;BA.debugLine="ListItemEDate.Text = Utils.IfNullOrEmpty(colitems";
mostCurrent._listitemedate.setText(BA.ObjectToCharSequence(mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("valid_to"),"----------")));
RDebugUtils.currentLine=147587089;
 //BA.debugLineNum = 147587089;BA.debugLine="ListItemDocButton.Tag = colitems.GetString(\"doc_f";
mostCurrent._listitemdocbutton.setTag((Object)(_colitems.GetString("doc_filename")));
RDebugUtils.currentLine=147587090;
 //BA.debugLineNum = 147587090;BA.debugLine="ListItemTitle.Tag = colitems.GetString(\"doc_filen";
mostCurrent._listitemtitle.setTag((Object)(_colitems.GetString("doc_filename")));
RDebugUtils.currentLine=147587092;
 //BA.debugLineNum = 147587092;BA.debugLine="Dim File2setExt As String = ListItemDocButton.Tag";
_file2setext = BA.ObjectToString(mostCurrent._listitemdocbutton.getTag());
RDebugUtils.currentLine=147587093;
 //BA.debugLineNum = 147587093;BA.debugLine="If File2setExt.EndsWith(\"pdf\") Then";
if (_file2setext.endsWith("pdf")) { 
RDebugUtils.currentLine=147587094;
 //BA.debugLineNum = 147587094;BA.debugLine="ListItemDocButton.text = Chr(0xF1C1)";
mostCurrent._listitemdocbutton.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c1))));
 }else 
{RDebugUtils.currentLine=147587095;
 //BA.debugLineNum = 147587095;BA.debugLine="else if File2setExt.EndsWith (\"xls\") Or File2setE";
if (_file2setext.endsWith("xls") || _file2setext.endsWith("xlsx")) { 
RDebugUtils.currentLine=147587096;
 //BA.debugLineNum = 147587096;BA.debugLine="ListItemDocButton.Text = Chr(0xF1C3)";
mostCurrent._listitemdocbutton.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c3))));
 }else 
{RDebugUtils.currentLine=147587097;
 //BA.debugLineNum = 147587097;BA.debugLine="Else If File2setExt.EndsWith (\"doc\") Or File2setE";
if (_file2setext.endsWith("doc") || _file2setext.endsWith("docx")) { 
RDebugUtils.currentLine=147587098;
 //BA.debugLineNum = 147587098;BA.debugLine="ListItemDocButton.Text = Chr(0xF1C2)";
mostCurrent._listitemdocbutton.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c2))));
 }else 
{RDebugUtils.currentLine=147587099;
 //BA.debugLineNum = 147587099;BA.debugLine="Else If File2setExt.EndsWith (\"jpg\") Or File2setE";
if (_file2setext.endsWith("jpg") || _file2setext.endsWith("png")) { 
RDebugUtils.currentLine=147587100;
 //BA.debugLineNum = 147587100;BA.debugLine="ListItemDocButton.Text = Chr(0xF1C5)";
mostCurrent._listitemdocbutton.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c5))));
 }else {
RDebugUtils.currentLine=147587102;
 //BA.debugLineNum = 147587102;BA.debugLine="ListItemDocButton.Text = Chr(0xF016)";
mostCurrent._listitemdocbutton.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf016))));
 }}}}
;
RDebugUtils.currentLine=147587105;
 //BA.debugLineNum = 147587105;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=147587106;
 //BA.debugLineNum = 147587106;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=147587107;
 //BA.debugLineNum = 147587107;BA.debugLine="End Sub";
return null;
}
public static String  _createdocumentsfromobject(boolean _clear,String _filter) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createdocumentsfromobject", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createdocumentsfromobject", new Object[] {_clear,_filter}));}
int _height = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _itemscounter = 0;
String _sql = "";
int _row = 0;
RDebugUtils.currentLine=147521536;
 //BA.debugLineNum = 147521536;BA.debugLine="Sub CreateDocumentsFromobject(Clear As Boolean, Fi";
RDebugUtils.currentLine=147521537;
 //BA.debugLineNum = 147521537;BA.debugLine="If Clear Then";
if (_clear) { 
RDebugUtils.currentLine=147521538;
 //BA.debugLineNum = 147521538;BA.debugLine="listDocuments.Clear";
mostCurrent._listdocuments._clear();
 };
RDebugUtils.currentLine=147521541;
 //BA.debugLineNum = 147521541;BA.debugLine="Dim height As Int = 70dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (70));
RDebugUtils.currentLine=147521542;
 //BA.debugLineNum = 147521542;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=147521543;
 //BA.debugLineNum = 147521543;BA.debugLine="height = 135dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (135));
 };
RDebugUtils.currentLine=147521545;
 //BA.debugLineNum = 147521545;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=147521546;
 //BA.debugLineNum = 147521546;BA.debugLine="Dim ItemsCounter As Int = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=147521558;
 //BA.debugLineNum = 147521558;BA.debugLine="Dim SQL As String = $\"${ DBStructures.EVC_SQL_OBJ";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dbstructures._evc_sql_obj_documents /*String*/ ))+"  WHERE o.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"'");
RDebugUtils.currentLine=147521560;
 //BA.debugLineNum = 147521560;BA.debugLine="SQL = $\"${SQL} order by a.title\"$";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" order by a.title");
RDebugUtils.currentLine=147521561;
 //BA.debugLineNum = 147521561;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=147521562;
 //BA.debugLineNum = 147521562;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=147521563;
 //BA.debugLineNum = 147521563;BA.debugLine="Log(\"Docs:\" & Record.RowCount)";
anywheresoftware.b4a.keywords.Common.LogImpl("6147521563","Docs:"+BA.NumberToString(_record.getRowCount()),0);
RDebugUtils.currentLine=147521564;
 //BA.debugLineNum = 147521564;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step15 = 1;
final int limit15 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit15 ;_row = _row + step15 ) {
RDebugUtils.currentLine=147521565;
 //BA.debugLineNum = 147521565;BA.debugLine="ItemsCounter = ItemsCounter + 1";
_itemscounter = (int) (_itemscounter+1);
RDebugUtils.currentLine=147521566;
 //BA.debugLineNum = 147521566;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=147521567;
 //BA.debugLineNum = 147521567;BA.debugLine="listDocuments.Add( CreateDocumentListItem(Items";
mostCurrent._listdocuments._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createdocumentlistitem(_itemscounter,_record,mostCurrent._listdocuments._asview().getWidth(),_height).getObject())),(Object)(""));
 }
};
 }else {
RDebugUtils.currentLine=147521570;
 //BA.debugLineNum = 147521570;BA.debugLine="listDocuments.Add( CreateNoRecordListItem(ItemsC";
mostCurrent._listdocuments._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createnorecordlistitem(_itemscounter,(anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(anywheresoftware.b4a.keywords.Common.Null)),mostCurrent._listdocuments._asview().getWidth(),(int) (_height+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)))).getObject())),(Object)(""));
 };
RDebugUtils.currentLine=147521572;
 //BA.debugLineNum = 147521572;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=147521573;
 //BA.debugLineNum = 147521573;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createnorecordlistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createnorecordlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createnorecordlistitem", new Object[] {_cnt,_colitems,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=147652608;
 //BA.debugLineNum = 147652608;BA.debugLine="Sub CreateNoRecordListItem(cnt As Int, colitems As";
RDebugUtils.currentLine=147652609;
 //BA.debugLineNum = 147652609;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=147652610;
 //BA.debugLineNum = 147652610;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=147652611;
 //BA.debugLineNum = 147652611;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=147652612;
 //BA.debugLineNum = 147652612;BA.debugLine="p.LoadLayout(\"ItemNORecords\")";
_p.LoadLayout("ItemNORecords",mostCurrent.activityBA);
RDebugUtils.currentLine=147652613;
 //BA.debugLineNum = 147652613;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=147652614;
 //BA.debugLineNum = 147652614;BA.debugLine="listButRefresh.Tag = CurrentobjectTagcode";
mostCurrent._listbutrefresh.setTag((Object)(mostCurrent._currentobjecttagcode));
RDebugUtils.currentLine=147652615;
 //BA.debugLineNum = 147652615;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=147652616;
 //BA.debugLineNum = 147652616;BA.debugLine="End Sub";
return null;
}
public static int  _createobjectdetailsdata(boolean _clear,anywheresoftware.b4a.sql.SQL.CursorWrapper _record) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createobjectdetailsdata", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "createobjectdetailsdata", new Object[] {_clear,_record}));}
int _idx = 0;
String _ssql = "";
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _rcontact = null;
anywheresoftware.b4a.objects.B4XViewWrapper _chapter1 = null;
int _i = 0;
RDebugUtils.currentLine=147980288;
 //BA.debugLineNum = 147980288;BA.debugLine="Sub CreateobjectDetailsData(clear As Boolean, Reco";
RDebugUtils.currentLine=147980289;
 //BA.debugLineNum = 147980289;BA.debugLine="If clear Then";
if (_clear) { 
RDebugUtils.currentLine=147980290;
 //BA.debugLineNum = 147980290;BA.debugLine="objectListView.Clear";
mostCurrent._objectlistview._clear /*String*/ (null);
 };
RDebugUtils.currentLine=147980292;
 //BA.debugLineNum = 147980292;BA.debugLine="Dim idx As Int = objectListView.Size";
_idx = mostCurrent._objectlistview._getsize /*int*/ (null);
RDebugUtils.currentLine=147980293;
 //BA.debugLineNum = 147980293;BA.debugLine="If idx >0 Then idx = idx-1";
if (_idx>0) { 
_idx = (int) (_idx-1);};
RDebugUtils.currentLine=147980295;
 //BA.debugLineNum = 147980295;BA.debugLine="MakeAddressesFolder(idx, Record, \"Moradas\")";
_makeaddressesfolder(_idx,_record,"Moradas");
RDebugUtils.currentLine=147980296;
 //BA.debugLineNum = 147980296;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
RDebugUtils.currentLine=147980298;
 //BA.debugLineNum = 147980298;BA.debugLine="Dim sSQL As String = $\"${DBStructures.EVC_SQL_CUR";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dbstructures._evc_sql_current_contacts /*String*/ ))+"  where a.tagcode in (select contact_tagcode from dta_objects_contacts where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._currentobjecttagcode))+"')");
RDebugUtils.currentLine=147980299;
 //BA.debugLineNum = 147980299;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6147980299",_ssql,0);
RDebugUtils.currentLine=147980300;
 //BA.debugLineNum = 147980300;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=147980301;
 //BA.debugLineNum = 147980301;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=147980302;
 //BA.debugLineNum = 147980302;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=147980303;
 //BA.debugLineNum = 147980303;BA.debugLine="Private rContact As Cursor";
_rcontact = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=147980304;
 //BA.debugLineNum = 147980304;BA.debugLine="rContact = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_rcontact = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=147980305;
 //BA.debugLineNum = 147980305;BA.debugLine="If rContact.RowCount > 0 Then";
if (_rcontact.getRowCount()>0) { 
RDebugUtils.currentLine=147980306;
 //BA.debugLineNum = 147980306;BA.debugLine="id.ExpandedHeight = 50dip + (rContact.RowCount *";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+(_rcontact.getRowCount()*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200))));
RDebugUtils.currentLine=147980307;
 //BA.debugLineNum = 147980307;BA.debugLine="Dim chapter1 As B4XView = CreateChapter(Colors.G";
_chapter1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter1 = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._checklistdadosobjectocontactos /*String*/ ,_id,_idx,mostCurrent._objectlistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=147980308;
 //BA.debugLineNum = 147980308;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
RDebugUtils.currentLine=147980310;
 //BA.debugLineNum = 147980310;BA.debugLine="For i=0 To rContact.RowCount-1";
{
final int step19 = 1;
final int limit19 = (int) (_rcontact.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=147980311;
 //BA.debugLineNum = 147980311;BA.debugLine="rContact.Position = i";
_rcontact.setPosition(_i);
RDebugUtils.currentLine=147980312;
 //BA.debugLineNum = 147980312;BA.debugLine="MakeContactsFolder(idx, chapter1, rContact, id,";
_makecontactsfolder(_idx,_chapter1,_rcontact,_id,(int) ((_i*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)))));
 }
};
 }else {
RDebugUtils.currentLine=147980315;
 //BA.debugLineNum = 147980315;BA.debugLine="id.ExpandedHeight = 50dip";
_id.ExpandedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=147980316;
 //BA.debugLineNum = 147980316;BA.debugLine="Dim chapter1 As B4XView = CreateChapter(Colors.G";
_chapter1 = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter1 = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._checklistdadosobjectocontactos /*String*/ ,_id,_idx,mostCurrent._objectlistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=147980317;
 //BA.debugLineNum = 147980317;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 };
RDebugUtils.currentLine=147980319;
 //BA.debugLineNum = 147980319;BA.debugLine="rContact.Close";
_rcontact.Close();
RDebugUtils.currentLine=147980320;
 //BA.debugLineNum = 147980320;BA.debugLine="objectListView.Add(chapter1, id)";
mostCurrent._objectlistview._add /*String*/ (null,_chapter1,(Object)(_id));
RDebugUtils.currentLine=147980322;
 //BA.debugLineNum = 147980322;BA.debugLine="ExpandItem(1)";
_expanditem((int) (1));
RDebugUtils.currentLine=147980326;
 //BA.debugLineNum = 147980326;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=147980327;
 //BA.debugLineNum = 147980327;BA.debugLine="Return idx";
if (true) return _idx;
RDebugUtils.currentLine=147980328;
 //BA.debugLineNum = 147980328;BA.debugLine="End Sub";
return 0;
}
public static String  _makeaddressesfolder(int _idx,anywheresoftware.b4a.sql.SQL.CursorWrapper _record,String _title) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeaddressesfolder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makeaddressesfolder", new Object[] {_idx,_record,_title}));}
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
anywheresoftware.b4a.objects.B4XViewWrapper _chapter = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=148176896;
 //BA.debugLineNum = 148176896;BA.debugLine="Sub MakeAddressesFolder(idx As Int, Record As Curs";
RDebugUtils.currentLine=148176897;
 //BA.debugLineNum = 148176897;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=148176898;
 //BA.debugLineNum = 148176898;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=148176899;
 //BA.debugLineNum = 148176899;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=148176900;
 //BA.debugLineNum = 148176900;BA.debugLine="id.ExpandedHeight = 50dip + 225dip";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (225)));
RDebugUtils.currentLine=148176901;
 //BA.debugLineNum = 148176901;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gra";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,_title,_id,_idx,mostCurrent._objectlistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=148176902;
 //BA.debugLineNum = 148176902;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=148176903;
 //BA.debugLineNum = 148176903;BA.debugLine="p.Initialize(\"GroupLineClick\")";
_p.Initialize(mostCurrent.activityBA,"GroupLineClick");
RDebugUtils.currentLine=148176904;
 //BA.debugLineNum = 148176904;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 275dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (275)));
RDebugUtils.currentLine=148176905;
 //BA.debugLineNum = 148176905;BA.debugLine="p.LoadLayout(\"ItemAddress\")'3pontinhos objectos (";
_p.LoadLayout("ItemAddress",mostCurrent.activityBA);
RDebugUtils.currentLine=148176907;
 //BA.debugLineNum = 148176907;BA.debugLine="ItemAddress_TipoMorada.text = ShareCode.ItemAddre";
mostCurrent._itemaddress_tipomorada.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddresstipomorada /*String*/ ));
RDebugUtils.currentLine=148176908;
 //BA.debugLineNum = 148176908;BA.debugLine="ItemAddress_Endereco.text = ShareCode.ItemAddress";
mostCurrent._itemaddress_endereco.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddressendereco /*String*/ ));
RDebugUtils.currentLine=148176909;
 //BA.debugLineNum = 148176909;BA.debugLine="ItemAddress_Continua.text = ShareCode.ItemAddress";
mostCurrent._itemaddress_continua.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddresscontinua /*String*/ ));
RDebugUtils.currentLine=148176910;
 //BA.debugLineNum = 148176910;BA.debugLine="ItemAddress_CPostal.text = ShareCode.ItemAddressC";
mostCurrent._itemaddress_cpostal.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddresscpostal /*String*/ ));
RDebugUtils.currentLine=148176911;
 //BA.debugLineNum = 148176911;BA.debugLine="ItemAddress_Latitude.text = ShareCode.ItemAddress";
mostCurrent._itemaddress_latitude.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddresslatitude /*String*/ ));
RDebugUtils.currentLine=148176912;
 //BA.debugLineNum = 148176912;BA.debugLine="ItemAddress_Longitude.text = ShareCode.ItemAddres";
mostCurrent._itemaddress_longitude.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddresslongitude /*String*/ ));
RDebugUtils.currentLine=148176913;
 //BA.debugLineNum = 148176913;BA.debugLine="ItemAddress_Localidade.text = ShareCode.ItemAddre";
mostCurrent._itemaddress_localidade.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._itemaddresslocalidade /*String*/ ));
RDebugUtils.currentLine=148176915;
 //BA.debugLineNum = 148176915;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=148176916;
 //BA.debugLineNum = 148176916;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=148176917;
 //BA.debugLineNum = 148176917;BA.debugLine="lblAddressName.Text = Record.GetString(\"address\")";
mostCurrent._lbladdressname.setText(BA.ObjectToCharSequence(_record.GetString("address")));
RDebugUtils.currentLine=148176918;
 //BA.debugLineNum = 148176918;BA.debugLine="lblAddressName2.Text = Record.GetString(\"address2";
mostCurrent._lbladdressname2.setText(BA.ObjectToCharSequence(_record.GetString("address2")));
RDebugUtils.currentLine=148176919;
 //BA.debugLineNum = 148176919;BA.debugLine="lblAddressPostalCode.Text = Record.GetString(\"pos";
mostCurrent._lbladdresspostalcode.setText(BA.ObjectToCharSequence(_record.GetString("postal_code")));
RDebugUtils.currentLine=148176920;
 //BA.debugLineNum = 148176920;BA.debugLine="lblAddressCity.Text = Record.GetString(\"city\")";
mostCurrent._lbladdresscity.setText(BA.ObjectToCharSequence(_record.GetString("city")));
RDebugUtils.currentLine=148176921;
 //BA.debugLineNum = 148176921;BA.debugLine="lblAddressLatitude.Text = Record.GetString(\"latit";
mostCurrent._lbladdresslatitude.setText(BA.ObjectToCharSequence(_record.GetString("latitude")));
RDebugUtils.currentLine=148176922;
 //BA.debugLineNum = 148176922;BA.debugLine="lblAddressLongitude.Text = Record.GetString(\"long";
mostCurrent._lbladdresslongitude.setText(BA.ObjectToCharSequence(_record.GetString("longitude")));
RDebugUtils.currentLine=148176923;
 //BA.debugLineNum = 148176923;BA.debugLine="lblAddressType.Text = \"Sede/Facturação\"";
mostCurrent._lbladdresstype.setText(BA.ObjectToCharSequence("Sede/Facturação"));
RDebugUtils.currentLine=148176924;
 //BA.debugLineNum = 148176924;BA.debugLine="butAddressEdit.Tag = Record.GetString(\"local\")";
mostCurrent._butaddressedit.setTag((Object)(_record.GetString("local")));
RDebugUtils.currentLine=148176925;
 //BA.debugLineNum = 148176925;BA.debugLine="butAddressMap.Tag = Record.GetString(\"local\")";
mostCurrent._butaddressmap.setTag((Object)(_record.GetString("local")));
RDebugUtils.currentLine=148176926;
 //BA.debugLineNum = 148176926;BA.debugLine="pnlGroupExpanded.AddView(p, 0, 0, 100%x, 225dip)";
mostCurrent._pnlgroupexpanded.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (225)));
RDebugUtils.currentLine=148176928;
 //BA.debugLineNum = 148176928;BA.debugLine="objectListView.Add(chapter, id)";
mostCurrent._objectlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=148176929;
 //BA.debugLineNum = 148176929;BA.debugLine="ExpandItem(idx)";
_expanditem(_idx);
RDebugUtils.currentLine=148176931;
 //BA.debugLineNum = 148176931;BA.debugLine="End Sub";
return "";
}
public static String  _makecontactsfolder(int _idx,anywheresoftware.b4a.objects.B4XViewWrapper _chapter1,anywheresoftware.b4a.sql.SQL.CursorWrapper _record,xevolution.vrcg.devdemov2400.checklist3._itemdata _id,int _top) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makecontactsfolder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makecontactsfolder", new Object[] {_idx,_chapter1,_record,_id,_top}));}
anywheresoftware.b4a.objects.PanelWrapper _p1 = null;
RDebugUtils.currentLine=148111360;
 //BA.debugLineNum = 148111360;BA.debugLine="Sub MakeContactsFolder(idx As Int, chapter1 As B4X";
RDebugUtils.currentLine=148111362;
 //BA.debugLineNum = 148111362;BA.debugLine="Dim p1 As Panel";
_p1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=148111363;
 //BA.debugLineNum = 148111363;BA.debugLine="p1.Initialize(\"GroupLineClick\")";
_p1.Initialize(mostCurrent.activityBA,"GroupLineClick");
RDebugUtils.currentLine=148111364;
 //BA.debugLineNum = 148111364;BA.debugLine="Activity.AddView(p1, 0, 0, 100%x, 200dip)";
mostCurrent._activity.AddView((android.view.View)(_p1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=148111365;
 //BA.debugLineNum = 148111365;BA.debugLine="p1.LoadLayout(\"ItemContact\")'3pontinhos objectos";
_p1.LoadLayout("ItemContact",mostCurrent.activityBA);
RDebugUtils.currentLine=148111366;
 //BA.debugLineNum = 148111366;BA.debugLine="p1.RemoveView";
_p1.RemoveView();
RDebugUtils.currentLine=148111367;
 //BA.debugLineNum = 148111367;BA.debugLine="p1.Tag = idx";
_p1.setTag((Object)(_idx));
RDebugUtils.currentLine=148111368;
 //BA.debugLineNum = 148111368;BA.debugLine="lblContactName.Text = Record.GetString(\"name\")";
mostCurrent._lblcontactname.setText(BA.ObjectToCharSequence(_record.GetString("name")));
RDebugUtils.currentLine=148111369;
 //BA.debugLineNum = 148111369;BA.debugLine="lblContactPhone.Text = Record.GetString(\"phone\")";
mostCurrent._lblcontactphone.setText(BA.ObjectToCharSequence(_record.GetString("phone")));
RDebugUtils.currentLine=148111370;
 //BA.debugLineNum = 148111370;BA.debugLine="lblContactEmail.Text = Record.GetString(\"email\")";
mostCurrent._lblcontactemail.setText(BA.ObjectToCharSequence(_record.GetString("email")));
RDebugUtils.currentLine=148111371;
 //BA.debugLineNum = 148111371;BA.debugLine="lblTypeContact.Text = Record.GetString(\"typedesc\"";
mostCurrent._lbltypecontact.setText(BA.ObjectToCharSequence(_record.GetString("typedesc")));
RDebugUtils.currentLine=148111373;
 //BA.debugLineNum = 148111373;BA.debugLine="butContactEdit.Tag = Record.GetString(\"tagcode\")";
mostCurrent._butcontactedit.setTag((Object)(_record.GetString("tagcode")));
RDebugUtils.currentLine=148111374;
 //BA.debugLineNum = 148111374;BA.debugLine="pnlGroupExpanded.AddView(p1, 0, top, p1.Width, 20";
mostCurrent._pnlgroupexpanded.AddView((android.view.View)(_p1.getObject()),(int) (0),_top,_p1.getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)));
RDebugUtils.currentLine=148111376;
 //BA.debugLineNum = 148111376;BA.debugLine="End Sub";
return "";
}
public static String  _expanditem(int _index) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "expanditem", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "expanditem", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
RDebugUtils.currentLine=149094400;
 //BA.debugLineNum = 149094400;BA.debugLine="Sub ExpandItem (index As Int)";
RDebugUtils.currentLine=149094401;
 //BA.debugLineNum = 149094401;BA.debugLine="Dim id As ItemData = objectListView.GetValue(inde";
_id = (xevolution.vrcg.devdemov2400.checklist3._itemdata)(mostCurrent._objectlistview._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=149094402;
 //BA.debugLineNum = 149094402;BA.debugLine="objectListView.ResizeItem(index, id.ExpandedHeigh";
mostCurrent._objectlistview._resizeitem /*String*/ (null,_index,_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=149094403;
 //BA.debugLineNum = 149094403;BA.debugLine="objectListView.GetPanel(index).Tag = True";
mostCurrent._objectlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=149094405;
 //BA.debugLineNum = 149094405;BA.debugLine="If (pnlGroupCurrenIndex <> index) Then";
if ((_pnlgroupcurrenindex!=_index)) { 
RDebugUtils.currentLine=149094408;
 //BA.debugLineNum = 149094408;BA.debugLine="objectListView.GetPanel(index).GetView(0).GetVie";
mostCurrent._objectlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (1)).setText(BA.ObjectToCharSequence(mostCurrent._types._collapse_icon /*String*/ ));
RDebugUtils.currentLine=149094409;
 //BA.debugLineNum = 149094409;BA.debugLine="pnlGroupCurrenIndex = index";
_pnlgroupcurrenindex = _index;
 };
RDebugUtils.currentLine=149094413;
 //BA.debugLineNum = 149094413;BA.debugLine="End Sub";
return "";
}
public static String  _createobjectdetailsdataprop(int _idx,boolean _clear,String _tagcode) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createobjectdetailsdataprop", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createobjectdetailsdataprop", new Object[] {_idx,_clear,_tagcode}));}
RDebugUtils.currentLine=148045824;
 //BA.debugLineNum = 148045824;BA.debugLine="Sub CreateobjectDetailsDataProp(idx As Int, clear";
RDebugUtils.currentLine=148045826;
 //BA.debugLineNum = 148045826;BA.debugLine="objectPropertyListView.Clear";
mostCurrent._objectpropertylistview._clear /*String*/ (null);
RDebugUtils.currentLine=148045833;
 //BA.debugLineNum = 148045833;BA.debugLine="MakePropertiesFolder(idx, Tagcode, ShareCode.chec";
_makepropertiesfolder(_idx,_tagcode,mostCurrent._sharecode._checklistdadosobjectocamposobjecto /*String*/ );
RDebugUtils.currentLine=148045837;
 //BA.debugLineNum = 148045837;BA.debugLine="End Sub";
return "";
}
public static String  _makepropertiesfolder(int _idx,String _tagcode,String _title) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makepropertiesfolder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makepropertiesfolder", new Object[] {_idx,_tagcode,_title}));}
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
boolean _expandthis = false;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
String _sql = "";
int _row = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _chapter = null;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _height = 0;
String _filename = "";
String _btm = "";
String _created_at = "";
boolean _fileok = false;
RDebugUtils.currentLine=148242432;
 //BA.debugLineNum = 148242432;BA.debugLine="Sub MakePropertiesFolder(idx As Int, tagcode As St";
RDebugUtils.currentLine=148242433;
 //BA.debugLineNum = 148242433;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=148242434;
 //BA.debugLineNum = 148242434;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=148242435;
 //BA.debugLineNum = 148242435;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=148242436;
 //BA.debugLineNum = 148242436;BA.debugLine="Dim ExpandThis As Boolean = False";
_expandthis = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=148242438;
 //BA.debugLineNum = 148242438;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=148242440;
 //BA.debugLineNum = 148242440;BA.debugLine="Dim SQL As String = $\"${DBStructures.EVC_QL_CURRE";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dbstructures._evc_ql_current_objects_properties /*String*/ ))+" and a.object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=148242441;
 //BA.debugLineNum = 148242441;BA.debugLine="Log(SQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6148242441",_sql,0);
RDebugUtils.currentLine=148242442;
 //BA.debugLineNum = 148242442;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=148242443;
 //BA.debugLineNum = 148242443;BA.debugLine="If Record2.RowCount > 0 Then";
if (_record2.getRowCount()>0) { 
RDebugUtils.currentLine=148242444;
 //BA.debugLineNum = 148242444;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=148242445;
 //BA.debugLineNum = 148242445;BA.debugLine="id.ExpandedHeight = 50dip + (60dip * Record2.Row";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))*_record2.getRowCount()));
RDebugUtils.currentLine=148242446;
 //BA.debugLineNum = 148242446;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapterprop(anywheresoftware.b4a.keywords.Common.Colors.Gray,_title,_id,_idx,mostCurrent._objectpropertylistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=148242447;
 //BA.debugLineNum = 148242447;BA.debugLine="ExpandThis = True";
_expandthis = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=148242448;
 //BA.debugLineNum = 148242448;BA.debugLine="For i=0 To Record2.RowCount-1";
{
final int step14 = 1;
final int limit14 = (int) (_record2.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=148242449;
 //BA.debugLineNum = 148242449;BA.debugLine="Record2.Position = row";
_record2.setPosition(_row);
RDebugUtils.currentLine=148242451;
 //BA.debugLineNum = 148242451;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=148242452;
 //BA.debugLineNum = 148242452;BA.debugLine="p.Initialize( \"GroupLineClickProp\")";
_p.Initialize(mostCurrent.activityBA,"GroupLineClickProp");
RDebugUtils.currentLine=148242453;
 //BA.debugLineNum = 148242453;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, id.ExpandedHei";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=148242454;
 //BA.debugLineNum = 148242454;BA.debugLine="p.LoadLayout(\"ItemProperty\") '3pontinhos object";
_p.LoadLayout("ItemProperty",mostCurrent.activityBA);
RDebugUtils.currentLine=148242455;
 //BA.debugLineNum = 148242455;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=148242456;
 //BA.debugLineNum = 148242456;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=148242457;
 //BA.debugLineNum = 148242457;BA.debugLine="lblPropertyValue.Text = Record2.GetString(\"valu";
mostCurrent._lblpropertyvalue.setText(BA.ObjectToCharSequence(_record2.GetString("value")));
RDebugUtils.currentLine=148242458;
 //BA.debugLineNum = 148242458;BA.debugLine="lblPropertyName.Text = Record2.GetString(\"title";
mostCurrent._lblpropertyname.setText(BA.ObjectToCharSequence(_record2.GetString("title")));
RDebugUtils.currentLine=148242459;
 //BA.debugLineNum = 148242459;BA.debugLine="lblPropertyName.tag = Record2.GetString(\"object";
mostCurrent._lblpropertyname.setTag((Object)(_record2.GetString("object_tagcode")));
RDebugUtils.currentLine=148242460;
 //BA.debugLineNum = 148242460;BA.debugLine="butPropertyEdit.tag = Record2.GetString(\"field_";
mostCurrent._butpropertyedit.setTag((Object)(_record2.GetString("field_tagcode")));
RDebugUtils.currentLine=148242461;
 //BA.debugLineNum = 148242461;BA.debugLine="Dim Height As Int = ((i+1)*60dip)-60dip";
_height = (int) (((_i+1)*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)))-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=148242462;
 //BA.debugLineNum = 148242462;BA.debugLine="pnlGroupExpandedProp.AddView(p, 0, Height, 100%";
mostCurrent._pnlgroupexpandedprop.AddView((android.view.View)(_p.getObject()),(int) (0),_height,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=148242463;
 //BA.debugLineNum = 148242463;BA.debugLine="row = row +1";
_row = (int) (_row+1);
 }
};
 }else {
RDebugUtils.currentLine=148242466;
 //BA.debugLineNum = 148242466;BA.debugLine="id.ExpandedHeight = 50dip";
_id.ExpandedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=148242467;
 //BA.debugLineNum = 148242467;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapterprop(anywheresoftware.b4a.keywords.Common.Colors.Gray,_title,_id,_idx,mostCurrent._objectpropertylistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=148242469;
 //BA.debugLineNum = 148242469;BA.debugLine="Record2.Close";
_record2.Close();
RDebugUtils.currentLine=148242471;
 //BA.debugLineNum = 148242471;BA.debugLine="objectPropertyListView.Add(chapter, id)";
mostCurrent._objectpropertylistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=148242472;
 //BA.debugLineNum = 148242472;BA.debugLine="If ExpandThis Then ExpandItemProp(idx)";
if (_expandthis) { 
_expanditemprop(_idx);};
RDebugUtils.currentLine=148242477;
 //BA.debugLineNum = 148242477;BA.debugLine="idx = idx+1";
_idx = (int) (_idx+1);
RDebugUtils.currentLine=148242478;
 //BA.debugLineNum = 148242478;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=148242479;
 //BA.debugLineNum = 148242479;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=148242480;
 //BA.debugLineNum = 148242480;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=148242481;
 //BA.debugLineNum = 148242481;BA.debugLine="Dim ExpandThis As Boolean = False";
_expandthis = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=148242483;
 //BA.debugLineNum = 148242483;BA.debugLine="Private Record2 As Cursor";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=148242487;
 //BA.debugLineNum = 148242487;BA.debugLine="Dim SQL As String = $\"select 1 as child, object_t";
_sql = ("select 1 as child, object_tagcode as tagcode, image, filename, title, sess_user, created_at\n"+"						from dta_objects_images where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and (filename is not null and filename<>'')\n"+"						union\n"+"						select 0 as child, tagcode, image, filename, title_import as title, '' as sess_user, created_at\n"+"						from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and (filename is not null and filename<>'')\n"+"						order by child");
RDebugUtils.currentLine=148242493;
 //BA.debugLineNum = 148242493;BA.debugLine="Log(SQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6148242493",_sql,0);
RDebugUtils.currentLine=148242494;
 //BA.debugLineNum = 148242494;BA.debugLine="Record2 = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=148242495;
 //BA.debugLineNum = 148242495;BA.debugLine="If Record2.RowCount > 0 Then";
if (_record2.getRowCount()>0) { 
RDebugUtils.currentLine=148242496;
 //BA.debugLineNum = 148242496;BA.debugLine="Dim row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=148242497;
 //BA.debugLineNum = 148242497;BA.debugLine="id.ExpandedHeight = 50dip + (130dip * Record2.Ro";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130))*_record2.getRowCount()));
RDebugUtils.currentLine=148242498;
 //BA.debugLineNum = 148242498;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapterprop(anywheresoftware.b4a.keywords.Common.Colors.Gray,"Galeria",_id,_idx,mostCurrent._objectpropertylistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=148242499;
 //BA.debugLineNum = 148242499;BA.debugLine="ExpandThis = True";
_expandthis = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=148242500;
 //BA.debugLineNum = 148242500;BA.debugLine="For i=0 To Record2.RowCount-1";
{
final int step51 = 1;
final int limit51 = (int) (_record2.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=148242501;
 //BA.debugLineNum = 148242501;BA.debugLine="Record2.Position = i";
_record2.setPosition(_i);
RDebugUtils.currentLine=148242503;
 //BA.debugLineNum = 148242503;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=148242504;
 //BA.debugLineNum = 148242504;BA.debugLine="p.Initialize( \"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=148242505;
 //BA.debugLineNum = 148242505;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, 130dip)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
RDebugUtils.currentLine=148242506;
 //BA.debugLineNum = 148242506;BA.debugLine="p.LoadLayout(\"ItemImageGallery\")";
_p.LoadLayout("ItemImageGallery",mostCurrent.activityBA);
RDebugUtils.currentLine=148242507;
 //BA.debugLineNum = 148242507;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=148242508;
 //BA.debugLineNum = 148242508;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=148242510;
 //BA.debugLineNum = 148242510;BA.debugLine="Dim Filename As String = Utils.IfNullOrEmpty(Re";
_filename = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record2.GetString("filename"),"");
RDebugUtils.currentLine=148242511;
 //BA.debugLineNum = 148242511;BA.debugLine="Dim btm As String = Utils.IfNullOrEmpty(Record2";
_btm = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record2.GetString("image"),"");
RDebugUtils.currentLine=148242512;
 //BA.debugLineNum = 148242512;BA.debugLine="Dim created_at As String = Utils.IfNullOrEmpty(";
_created_at = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record2.GetString("created_at"),"");
RDebugUtils.currentLine=148242513;
 //BA.debugLineNum = 148242513;BA.debugLine="Dim FileOK As Boolean = True";
_fileok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=148242515;
 //BA.debugLineNum = 148242515;BA.debugLine="If Utils.NNE(Filename) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_filename)) { 
RDebugUtils.currentLine=148242516;
 //BA.debugLineNum = 148242516;BA.debugLine="If File.Exists(Starter.InternalFolder, Filenam";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
RDebugUtils.currentLine=148242517;
 //BA.debugLineNum = 148242517;BA.debugLine="Try";
try {RDebugUtils.currentLine=148242518;
 //BA.debugLineNum = 148242518;BA.debugLine="ShowImage.SetBackgroundImage(LoadBitmapSampl";
mostCurrent._showimage.SetBackgroundImageNew((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmapSample(mostCurrent._starter._internalfolder /*String*/ ,_filename,mostCurrent._showimage.getWidth(),mostCurrent._showimage.getHeight()).getObject()));
RDebugUtils.currentLine=148242519;
 //BA.debugLineNum = 148242519;BA.debugLine="ShowImage.Tag = Types.MakeImageViewData(btm,";
mostCurrent._showimage.setTag((Object)(mostCurrent._types._makeimageviewdata /*xevolution.vrcg.devdemov2400.types._imageviewdata*/ (mostCurrent.activityBA,_btm,_filename)));
 } 
       catch (Exception e69) {
			processBA.setLastException(e69);RDebugUtils.currentLine=148242521;
 //BA.debugLineNum = 148242521;BA.debugLine="FileOK = False";
_fileok = anywheresoftware.b4a.keywords.Common.False;
 };
 };
 }else {
RDebugUtils.currentLine=148242525;
 //BA.debugLineNum = 148242525;BA.debugLine="FileOK = False";
_fileok = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=148242528;
 //BA.debugLineNum = 148242528;BA.debugLine="If Not(FileOK) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_fileok)) { 
RDebugUtils.currentLine=148242529;
 //BA.debugLineNum = 148242529;BA.debugLine="If Utils.NNE(btm) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_btm)) { 
RDebugUtils.currentLine=148242530;
 //BA.debugLineNum = 148242530;BA.debugLine="Try";
try {RDebugUtils.currentLine=148242531;
 //BA.debugLineNum = 148242531;BA.debugLine="ShowImage.SetBackgroundImage(Utils.B64ToBitm";
mostCurrent._showimage.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,_btm).getObject()));
RDebugUtils.currentLine=148242532;
 //BA.debugLineNum = 148242532;BA.debugLine="ShowImage.Tag = Types.MakeImageViewData(btm,";
mostCurrent._showimage.setTag((Object)(mostCurrent._types._makeimageviewdata /*xevolution.vrcg.devdemov2400.types._imageviewdata*/ (mostCurrent.activityBA,_btm,_filename)));
RDebugUtils.currentLine=148242533;
 //BA.debugLineNum = 148242533;BA.debugLine="FileOK = True";
_fileok = anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e82) {
			processBA.setLastException(e82);RDebugUtils.currentLine=148242535;
 //BA.debugLineNum = 148242535;BA.debugLine="FileOK = False";
_fileok = anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=148242538;
 //BA.debugLineNum = 148242538;BA.debugLine="FileOK = False";
_fileok = anywheresoftware.b4a.keywords.Common.False;
 };
 };
RDebugUtils.currentLine=148242542;
 //BA.debugLineNum = 148242542;BA.debugLine="If (FileOK) Then";
if ((_fileok)) { 
RDebugUtils.currentLine=148242543;
 //BA.debugLineNum = 148242543;BA.debugLine="ImageFilename.Text = Filename";
mostCurrent._imagefilename.setText(BA.ObjectToCharSequence(_filename));
RDebugUtils.currentLine=148242544;
 //BA.debugLineNum = 148242544;BA.debugLine="ImageFilename.Tag = Filename";
mostCurrent._imagefilename.setTag((Object)(_filename));
RDebugUtils.currentLine=148242545;
 //BA.debugLineNum = 148242545;BA.debugLine="ImageStateName.Text = created_at";
mostCurrent._imagestatename.setText(BA.ObjectToCharSequence(_created_at));
RDebugUtils.currentLine=148242546;
 //BA.debugLineNum = 148242546;BA.debugLine="ImageStateName.Tag = tagcode";
mostCurrent._imagestatename.setTag((Object)(_tagcode));
RDebugUtils.currentLine=148242547;
 //BA.debugLineNum = 148242547;BA.debugLine="Dim Height As Int = ((i+1)*130dip)-130dip";
_height = (int) (((_i+1)*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)))-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
RDebugUtils.currentLine=148242548;
 //BA.debugLineNum = 148242548;BA.debugLine="pnlGroupExpandedProp.AddView(p, 0, Height, 100";
mostCurrent._pnlgroupexpandedprop.AddView((android.view.View)(_p.getObject()),(int) (0),_height,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (130)));
RDebugUtils.currentLine=148242549;
 //BA.debugLineNum = 148242549;BA.debugLine="row = row +1";
_row = (int) (_row+1);
 };
 }
};
 }else {
RDebugUtils.currentLine=148242553;
 //BA.debugLineNum = 148242553;BA.debugLine="id.ExpandedHeight = 50dip";
_id.ExpandedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=148242554;
 //BA.debugLineNum = 148242554;BA.debugLine="Dim chapter As B4XView = CreateChapterProp(Color";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapterprop(anywheresoftware.b4a.keywords.Common.Colors.Gray,"Galeria",_id,_idx,mostCurrent._objectpropertylistview._asview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getWidth(),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=148242556;
 //BA.debugLineNum = 148242556;BA.debugLine="Record2.Close";
_record2.Close();
RDebugUtils.currentLine=148242558;
 //BA.debugLineNum = 148242558;BA.debugLine="objectPropertyListView.Add(chapter, id)";
mostCurrent._objectpropertylistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=148242559;
 //BA.debugLineNum = 148242559;BA.debugLine="If ExpandThis Then ExpandItemProp(idx)";
if (_expandthis) { 
_expanditemprop(_idx);};
RDebugUtils.currentLine=148242560;
 //BA.debugLineNum = 148242560;BA.debugLine="End Sub";
return "";
}
public static String  _createobjectsfromobject(boolean _clear,String _filter) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createobjectsfromobject", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createobjectsfromobject", new Object[] {_clear,_filter}));}
int _height = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _itemscounter = 0;
String _sql = "";
int _row = 0;
RDebugUtils.currentLine=147718144;
 //BA.debugLineNum = 147718144;BA.debugLine="Sub CreateObjectsFromObject(Clear As Boolean, Filt";
RDebugUtils.currentLine=147718145;
 //BA.debugLineNum = 147718145;BA.debugLine="If Clear Then";
if (_clear) { 
RDebugUtils.currentLine=147718146;
 //BA.debugLineNum = 147718146;BA.debugLine="listObjects.Clear";
mostCurrent._listobjects._clear();
 };
RDebugUtils.currentLine=147718149;
 //BA.debugLineNum = 147718149;BA.debugLine="Log(Filter)";
anywheresoftware.b4a.keywords.Common.LogImpl("6147718149",_filter,0);
RDebugUtils.currentLine=147718151;
 //BA.debugLineNum = 147718151;BA.debugLine="Dim height As Int = 85dip '65dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85));
RDebugUtils.currentLine=147718152;
 //BA.debugLineNum = 147718152;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=147718153;
 //BA.debugLineNum = 147718153;BA.debugLine="height =  135dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (135));
 };
RDebugUtils.currentLine=147718155;
 //BA.debugLineNum = 147718155;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=147718156;
 //BA.debugLineNum = 147718156;BA.debugLine="Dim ItemsCounter As Int = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=147718157;
 //BA.debugLineNum = 147718157;BA.debugLine="Dim SQL As String = DBStructures.EVC_SQL_CURRENT_";
_sql = mostCurrent._dbstructures._evc_sql_current_objects /*String*/ ;
RDebugUtils.currentLine=147718158;
 //BA.debugLineNum = 147718158;BA.debugLine="If (Filter <> \"\") Then";
if (((_filter).equals("") == false)) { 
RDebugUtils.currentLine=147718159;
 //BA.debugLineNum = 147718159;BA.debugLine="SQL = $\"${SQL} where ${Filter}\"$";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" where "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"");
 };
RDebugUtils.currentLine=147718161;
 //BA.debugLineNum = 147718161;BA.debugLine="SQL = $\"${SQL} order by a.title_import\"$";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" order by a.title_import");
RDebugUtils.currentLine=147718162;
 //BA.debugLineNum = 147718162;BA.debugLine="Log(SQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6147718162",_sql,0);
RDebugUtils.currentLine=147718163;
 //BA.debugLineNum = 147718163;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=147718164;
 //BA.debugLineNum = 147718164;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=147718165;
 //BA.debugLineNum = 147718165;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step19 = 1;
final int limit19 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit19 ;_row = _row + step19 ) {
RDebugUtils.currentLine=147718166;
 //BA.debugLineNum = 147718166;BA.debugLine="ItemsCounter = ItemsCounter + 1";
_itemscounter = (int) (_itemscounter+1);
RDebugUtils.currentLine=147718167;
 //BA.debugLineNum = 147718167;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=147718168;
 //BA.debugLineNum = 147718168;BA.debugLine="listObjects.Add( CreateObjListItem(ItemsCounter";
mostCurrent._listobjects._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createobjlistitem(_itemscounter,_record,mostCurrent._listobjects._asview().getWidth(),_height).getObject())),(Object)(""));
 }
};
 }else {
RDebugUtils.currentLine=147718171;
 //BA.debugLineNum = 147718171;BA.debugLine="listObjects.Add( CreateNoRecordListItem(ItemsCou";
mostCurrent._listobjects._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createnorecordlistitem(_itemscounter,_record,mostCurrent._listobjects._asview().getWidth(),(int) (_height+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5)))).getObject())),(Object)(""));
 };
RDebugUtils.currentLine=147718173;
 //BA.debugLineNum = 147718173;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=147718174;
 //BA.debugLineNum = 147718174;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createobjlistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createobjlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createobjlistitem", new Object[] {_cnt,_colitems,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _status_desc = "";
String _tagcode = "";
String _latitude = "";
String _longitude = "";
int _status_id = 0;
String _name = "";
String _parent = "";
String _parent_name = "";
String _address = "";
String _postalcode = "";
String _typedesc = "";
String _city = "";
String _stat = "";
RDebugUtils.currentLine=147783680;
 //BA.debugLineNum = 147783680;BA.debugLine="Sub CreateObjListItem(cnt As Int, colitems As Curs";
RDebugUtils.currentLine=147783681;
 //BA.debugLineNum = 147783681;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=147783682;
 //BA.debugLineNum = 147783682;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=147783683;
 //BA.debugLineNum = 147783683;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=147783684;
 //BA.debugLineNum = 147783684;BA.debugLine="p.LoadLayout(\"objects_itemView\")";
_p.LoadLayout("objects_itemView",mostCurrent.activityBA);
RDebugUtils.currentLine=147783685;
 //BA.debugLineNum = 147783685;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=147783687;
 //BA.debugLineNum = 147783687;BA.debugLine="Dim status_desc As String = colitems.GetString(\"s";
_status_desc = _colitems.GetString("status_desc");
RDebugUtils.currentLine=147783689;
 //BA.debugLineNum = 147783689;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=147783690;
 //BA.debugLineNum = 147783690;BA.debugLine="Dim latitude As String = colitems.GetString(\"lati";
_latitude = _colitems.GetString("latitude");
RDebugUtils.currentLine=147783691;
 //BA.debugLineNum = 147783691;BA.debugLine="Dim longitude As String = colitems.GetString(\"lon";
_longitude = _colitems.GetString("longitude");
RDebugUtils.currentLine=147783692;
 //BA.debugLineNum = 147783692;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
_status_id = _colitems.GetInt("status_id");
RDebugUtils.currentLine=147783693;
 //BA.debugLineNum = 147783693;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
_name = _colitems.GetString("name");
RDebugUtils.currentLine=147783694;
 //BA.debugLineNum = 147783694;BA.debugLine="Dim parent As String = colitems.GetString(\"parent";
_parent = _colitems.GetString("parent");
RDebugUtils.currentLine=147783695;
 //BA.debugLineNum = 147783695;BA.debugLine="Dim parent_name As String = colitems.GetString(\"p";
_parent_name = _colitems.GetString("parent_name");
RDebugUtils.currentLine=147783696;
 //BA.debugLineNum = 147783696;BA.debugLine="Dim address As String = colitems.GetString(\"addre";
_address = _colitems.GetString("address");
RDebugUtils.currentLine=147783697;
 //BA.debugLineNum = 147783697;BA.debugLine="Dim postalcode As String = colitems.GetString(\"po";
_postalcode = _colitems.GetString("postal_code");
RDebugUtils.currentLine=147783698;
 //BA.debugLineNum = 147783698;BA.debugLine="Dim typedesc As String = colitems.GetString(\"type";
_typedesc = _colitems.GetString("typedesc");
RDebugUtils.currentLine=147783699;
 //BA.debugLineNum = 147783699;BA.debugLine="Dim city As String = colitems.GetString(\"city\")";
_city = _colitems.GetString("city");
RDebugUtils.currentLine=147783700;
 //BA.debugLineNum = 147783700;BA.debugLine="ListItemFullName.text = $\"#${cnt} - ${name}\"$";
mostCurrent._listitemfullname.setText(BA.ObjectToCharSequence(("#"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_name))+"")));
RDebugUtils.currentLine=147783701;
 //BA.debugLineNum = 147783701;BA.debugLine="Dim stat As String = $\"${status_desc}\"$";
_stat = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_status_desc))+"");
RDebugUtils.currentLine=147783702;
 //BA.debugLineNum = 147783702;BA.debugLine="ListItemReference.text = $\"${tagcode} - ${stat}\"$";
mostCurrent._listitemreference.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stat))+"")));
RDebugUtils.currentLine=147783703;
 //BA.debugLineNum = 147783703;BA.debugLine="ListItemReference.Tag = tagcode";
mostCurrent._listitemreference.setTag((Object)(_tagcode));
RDebugUtils.currentLine=147783704;
 //BA.debugLineNum = 147783704;BA.debugLine="ListItemLocation.text = $\"${address}, ${postalcod";
mostCurrent._listitemlocation.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_address))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_postalcode))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_city))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_latitude))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_longitude))+"")));
RDebugUtils.currentLine=147783705;
 //BA.debugLineNum = 147783705;BA.debugLine="ListItemType.text = typedesc";
mostCurrent._listitemtype.setText(BA.ObjectToCharSequence(_typedesc));
RDebugUtils.currentLine=147783707;
 //BA.debugLineNum = 147783707;BA.debugLine="listButMap.Enabled = False";
mostCurrent._listbutmap.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=147783708;
 //BA.debugLineNum = 147783708;BA.debugLine="listButMap.TextColor = Consts.ColorLightSilver";
mostCurrent._listbutmap.setTextColor(mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=147783710;
 //BA.debugLineNum = 147783710;BA.debugLine="ListItemFullName.Tag = parent";
mostCurrent._listitemfullname.setTag((Object)(_parent));
RDebugUtils.currentLine=147783714;
 //BA.debugLineNum = 147783714;BA.debugLine="If (status_id = 0) Then";
if ((_status_id==0)) { 
RDebugUtils.currentLine=147783715;
 //BA.debugLineNum = 147783715;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorGr";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorgray /*int*/ );
RDebugUtils.currentLine=147783716;
 //BA.debugLineNum = 147783716;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF088)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf088))));
 }else {
RDebugUtils.currentLine=147783719;
 //BA.debugLineNum = 147783719;BA.debugLine="If (ObjRequests.IndexOf(tagcode) >= 0) Then";
if ((mostCurrent._objrequests.IndexOf((Object)(_tagcode))>=0)) { 
RDebugUtils.currentLine=147783720;
 //BA.debugLineNum = 147783720;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorG";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=147783721;
 //BA.debugLineNum = 147783721;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF017)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf017))));
 }else {
RDebugUtils.currentLine=147783723;
 //BA.debugLineNum = 147783723;BA.debugLine="If (ObjRequestsNotToday.IndexOf(tagcode) >= 0)";
if ((mostCurrent._objrequestsnottoday.IndexOf((Object)(_tagcode))>=0)) { 
RDebugUtils.currentLine=147783724;
 //BA.debugLineNum = 147783724;BA.debugLine="ListItemTodayRequests.TextColor = Consts.Color";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorblue /*int*/ );
RDebugUtils.currentLine=147783725;
 //BA.debugLineNum = 147783725;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF073)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf073))));
 }else {
RDebugUtils.currentLine=147783727;
 //BA.debugLineNum = 147783727;BA.debugLine="ListItemTodayRequests.Visible = False";
mostCurrent._listitemtodayrequests.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
 };
RDebugUtils.currentLine=147783732;
 //BA.debugLineNum = 147783732;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=147783734;
 //BA.debugLineNum = 147783734;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=147783735;
 //BA.debugLineNum = 147783735;BA.debugLine="End Sub";
return null;
}
public static String  _createobjecttabs(xevolution.vrcg.devdemov2400.types._objecttype _tobj) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createobjecttabs", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createobjecttabs", new Object[] {_tobj}));}
int _counter = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=147324928;
 //BA.debugLineNum = 147324928;BA.debugLine="Sub CreateObjectTABS(tObj As ObjectType)";
RDebugUtils.currentLine=147324930;
 //BA.debugLineNum = 147324930;BA.debugLine="Dim Counter As Int = 2";
_counter = (int) (2);
RDebugUtils.currentLine=147324931;
 //BA.debugLineNum = 147324931;BA.debugLine="listsTabPanel.LoadLayout(\"object_generalView2\", S";
mostCurrent._liststabpanel.LoadLayout("object_generalView2",BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutsgeral /*String*/ ));
RDebugUtils.currentLine=147324932;
 //BA.debugLineNum = 147324932;BA.debugLine="MenuPanelPagesTitle.Add(\"Geral\")";
mostCurrent._menupanelpagestitle.Add((Object)("Geral"));
RDebugUtils.currentLine=147324933;
 //BA.debugLineNum = 147324933;BA.debugLine="If tObj.isgroup = 1 Then";
if (_tobj.isgroup /*int*/ ==1) { 
RDebugUtils.currentLine=147324934;
 //BA.debugLineNum = 147324934;BA.debugLine="Counter = Counter+1";
_counter = (int) (_counter+1);
RDebugUtils.currentLine=147324935;
 //BA.debugLineNum = 147324935;BA.debugLine="listsTabPanel.LoadLayout(\"objects_listview\", Sha";
mostCurrent._liststabpanel.LoadLayout("objects_listview",BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutsrelacoes /*String*/ ));
RDebugUtils.currentLine=147324936;
 //BA.debugLineNum = 147324936;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objectsL";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._objectslistviewpanel.getObject())));
RDebugUtils.currentLine=147324937;
 //BA.debugLineNum = 147324937;BA.debugLine="MenuPanelPagesTitle.Add(\"Relações\")";
mostCurrent._menupanelpagestitle.Add((Object)("Relações"));
 };
RDebugUtils.currentLine=147324940;
 //BA.debugLineNum = 147324940;BA.debugLine="objGV2LabelTipoObj.Text = ShareCode.checklistLabe";
mostCurrent._objgv2labeltipoobj.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._checklistlabeltipoobjecto /*String*/ ));
RDebugUtils.currentLine=147324941;
 //BA.debugLineNum = 147324941;BA.debugLine="objGV2LabelCodInterno.Text = ShareCode.checklistL";
mostCurrent._objgv2labelcodinterno.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._checklistlabelcodigointernobjecto /*String*/ ));
RDebugUtils.currentLine=147324942;
 //BA.debugLineNum = 147324942;BA.debugLine="objGV2LabelObs.Text = ShareCode.checklistlFinalOb";
mostCurrent._objgv2labelobs.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._checklistlfinalobshint /*String*/ ));
RDebugUtils.currentLine=147324943;
 //BA.debugLineNum = 147324943;BA.debugLine="objGV2LabelRef.text = ShareCode.checklistLabelRef";
mostCurrent._objgv2labelref.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._checklistlabelreferenciaobjecto /*String*/ ));
RDebugUtils.currentLine=147324944;
 //BA.debugLineNum = 147324944;BA.debugLine="objGV2LabelRelacao.Text = \"Relacao\"";
mostCurrent._objgv2labelrelacao.setText(BA.ObjectToCharSequence("Relacao"));
RDebugUtils.currentLine=147324959;
 //BA.debugLineNum = 147324959;BA.debugLine="If tObj.have_documents = 1 Then";
if (_tobj.have_documents /*int*/ ==1) { 
RDebugUtils.currentLine=147324960;
 //BA.debugLineNum = 147324960;BA.debugLine="Counter = Counter+1";
_counter = (int) (_counter+1);
RDebugUtils.currentLine=147324961;
 //BA.debugLineNum = 147324961;BA.debugLine="MenuPanelPagesTitle.Add(\"Documentos\")";
mostCurrent._menupanelpagestitle.Add((Object)("Documentos"));
RDebugUtils.currentLine=147324962;
 //BA.debugLineNum = 147324962;BA.debugLine="If (Utils.isNullOrEmpty(tObj.doctemplate)) Then";
if ((mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_tobj.doctemplate /*String*/ ))) { 
RDebugUtils.currentLine=147324963;
 //BA.debugLineNum = 147324963;BA.debugLine="listsTabPanel.LoadLayout(\"object_documentsView\"";
mostCurrent._liststabpanel.LoadLayout("object_documentsView",BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutsdocumentos /*String*/ ));
RDebugUtils.currentLine=147324964;
 //BA.debugLineNum = 147324964;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objects";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._objectsdocumentsviewpanel.getObject())));
RDebugUtils.currentLine=147324965;
 //BA.debugLineNum = 147324965;BA.debugLine="LabelObjDocsDescritivo.Text = ShareCode.ObjLayo";
mostCurrent._labelobjdocsdescritivo.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsdescritivo /*String*/ ));
RDebugUtils.currentLine=147324966;
 //BA.debugLineNum = 147324966;BA.debugLine="LabelObjDocsValidade.text = ShareCode.ObjLayout";
mostCurrent._labelobjdocsvalidade.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsvalidade /*String*/ ));
RDebugUtils.currentLine=147324967;
 //BA.debugLineNum = 147324967;BA.debugLine="labelTypeObjectFilter.Text = ShareCode.ObjLayou";
mostCurrent._labeltypeobjectfilter.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsdataalerta /*String*/ ));
 }else {
RDebugUtils.currentLine=147324970;
 //BA.debugLineNum = 147324970;BA.debugLine="listsTabPanel.LoadLayout(\"object_documentsViewV";
mostCurrent._liststabpanel.LoadLayout("object_documentsViewValidate",BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutsdocumentos /*String*/ ));
RDebugUtils.currentLine=147324971;
 //BA.debugLineNum = 147324971;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objectD";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._objectdocumentsviewpanel.getObject())));
RDebugUtils.currentLine=147324972;
 //BA.debugLineNum = 147324972;BA.debugLine="LabelObjVVDescritivo.Text = ShareCode.ObjLayout";
mostCurrent._labelobjvvdescritivo.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsdescritivo /*String*/ ));
RDebugUtils.currentLine=147324973;
 //BA.debugLineNum = 147324973;BA.debugLine="LabelObjVVValidade.Text = ShareCode.ObjLayoutDo";
mostCurrent._labelobjvvvalidade.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsvalidade /*String*/ ));
RDebugUtils.currentLine=147324974;
 //BA.debugLineNum = 147324974;BA.debugLine="LabelObjVVAccao.Text = ShareCode.ObjLayoutDocsD";
mostCurrent._labelobjvvaccao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsdataalerta /*String*/ ));
RDebugUtils.currentLine=147324975;
 //BA.debugLineNum = 147324975;BA.debugLine="labelTypeObjectFilter.Text = ShareCode.ObjLayou";
mostCurrent._labeltypeobjectfilter.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutdocsdataalerta /*String*/ ));
 };
 };
RDebugUtils.currentLine=147324979;
 //BA.debugLineNum = 147324979;BA.debugLine="listsTabPanel.LoadLayout(\"listviewlayout\", ShareC";
mostCurrent._liststabpanel.LoadLayout("listviewlayout",BA.ObjectToCharSequence(mostCurrent._sharecode._objlayoutsintervencoes /*String*/ ));
RDebugUtils.currentLine=147324980;
 //BA.debugLineNum = 147324980;BA.debugLine="MenuPanelPagesTitle.Add(\"Intervenções\")";
mostCurrent._menupanelpagestitle.Add((Object)("Intervenções"));
RDebugUtils.currentLine=147324983;
 //BA.debugLineNum = 147324983;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=147324984;
 //BA.debugLineNum = 147324984;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(l";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group36 = mostCurrent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,mostCurrent._liststabpanel);
final int groupLen36 = group36.getSize()
;int index36 = 0;
;
for (; index36 < groupLen36;index36++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group36.Get(index36)));
RDebugUtils.currentLine=147324985;
 //BA.debugLineNum = 147324985;BA.debugLine="lbl.Width = 100%x / Counter";
_lbl.setWidth((int) (anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)/(double)_counter));
 }
};
 };
RDebugUtils.currentLine=147324988;
 //BA.debugLineNum = 147324988;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
mostCurrent._utils._maketabpaneleffect /*String*/ (mostCurrent.activityBA,mostCurrent._colortabpanel,mostCurrent._consts._colormaindarker /*int*/ ,mostCurrent._consts._colorsub /*int*/ );
RDebugUtils.currentLine=147324990;
 //BA.debugLineNum = 147324990;BA.debugLine="End Sub";
return "";
}
public static String  _expanditemprop(int _index) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "expanditemprop", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "expanditemprop", new Object[] {_index}));}
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
RDebugUtils.currentLine=149225472;
 //BA.debugLineNum = 149225472;BA.debugLine="Sub ExpandItemProp(index As Int)";
RDebugUtils.currentLine=149225473;
 //BA.debugLineNum = 149225473;BA.debugLine="Dim id As ItemData = objectPropertyListView.GetVa";
_id = (xevolution.vrcg.devdemov2400.checklist3._itemdata)(mostCurrent._objectpropertylistview._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=149225474;
 //BA.debugLineNum = 149225474;BA.debugLine="objectPropertyListView.ResizeItem(index, id.Expan";
mostCurrent._objectpropertylistview._resizeitem /*String*/ (null,_index,_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=149225475;
 //BA.debugLineNum = 149225475;BA.debugLine="objectPropertyListView.GetPanel(index).Tag = True";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=149225477;
 //BA.debugLineNum = 149225477;BA.debugLine="If (pnlGroupCurrenPropIndex <> index) Then";
if ((_pnlgroupcurrenpropindex!=_index)) { 
RDebugUtils.currentLine=149225478;
 //BA.debugLineNum = 149225478;BA.debugLine="objectPropertyListView.GetPanel(pnlGroupCurrenPr";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_pnlgroupcurrenpropindex).GetView((int) (0)).GetView((int) (2)).setColor(mostCurrent._consts._nocolor /*int*/ );
RDebugUtils.currentLine=149225479;
 //BA.debugLineNum = 149225479;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (2)).setColor(mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=149225480;
 //BA.debugLineNum = 149225480;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (1)).setText(BA.ObjectToCharSequence(mostCurrent._types._collapse_icon /*String*/ ));
RDebugUtils.currentLine=149225481;
 //BA.debugLineNum = 149225481;BA.debugLine="pnlGroupCurrenPropIndex = index";
_pnlgroupcurrenpropindex = _index;
 }else {
RDebugUtils.currentLine=149225483;
 //BA.debugLineNum = 149225483;BA.debugLine="objectPropertyListView.GetPanel(index).GetView(0";
mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_index).GetView((int) (0)).GetView((int) (1)).setText(BA.ObjectToCharSequence(mostCurrent._types._collapse_icon /*String*/ ));
 };
RDebugUtils.currentLine=149225485;
 //BA.debugLineNum = 149225485;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getmissingdocument(String _docname) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getmissingdocument", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getmissingdocument", new Object[] {_docname}));}
ResumableSub_GetMissingDocument rsub = new ResumableSub_GetMissingDocument(null,_docname);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetMissingDocument extends BA.ResumableSub {
public ResumableSub_GetMissingDocument(xevolution.vrcg.devdemov2400.objectedit parent,String _docname) {
this.parent = parent;
this._docname = _docname;
}
xevolution.vrcg.devdemov2400.objectedit parent;
String _docname;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objectedit";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=150077442;
 //BA.debugLineNum = 150077442;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=150077443;
 //BA.debugLineNum = 150077443;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=150077444;
 //BA.debugLineNum = 150077444;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=150077445;
 //BA.debugLineNum = 150077445;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=150077446;
 //BA.debugLineNum = 150077446;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=150077447;
 //BA.debugLineNum = 150077447;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_docname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_docname);
RDebugUtils.currentLine=150077448;
 //BA.debugLineNum = 150077448;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objectedit", "getmissingdocument"), _sf);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=150077450;
 //BA.debugLineNum = 150077450;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_success) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=150077451;
 //BA.debugLineNum = 150077451;BA.debugLine="Log($\"/docs/${DocName} : file was download succ";
anywheresoftware.b4a.keywords.Common.LogImpl("6150077451",("/docs/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_docname))+" : file was download successfully"),0);
RDebugUtils.currentLine=150077452;
 //BA.debugLineNum = 150077452;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=150077453;
 //BA.debugLineNum = 150077453;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=150077455;
 //BA.debugLineNum = 150077455;BA.debugLine="Log($\"/docs/${DocName} : Error downloading file";
anywheresoftware.b4a.keywords.Common.LogImpl("6150077455",("/docs/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_docname))+" : Error downloading file"),0);
RDebugUtils.currentLine=150077456;
 //BA.debugLineNum = 150077456;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=150077457;
 //BA.debugLineNum = 150077457;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=150077460;
 //BA.debugLineNum = 150077460;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6150077460",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=150077461;
 //BA.debugLineNum = 150077461;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=150077462;
 //BA.debugLineNum = 150077462;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=150077465;
 //BA.debugLineNum = 150077465;BA.debugLine="End Sub";
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
public static String  _groupcollpseexpand_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "groupcollpseexpand_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "groupcollpseexpand_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _this = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=148963328;
 //BA.debugLineNum = 148963328;BA.debugLine="Sub GroupCollpseExpand_Click";
RDebugUtils.currentLine=148963329;
 //BA.debugLineNum = 148963329;BA.debugLine="Dim this As B4XView = Sender";
_this = new anywheresoftware.b4a.objects.B4XViewWrapper();
_this = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=148963330;
 //BA.debugLineNum = 148963330;BA.debugLine="If (CurrentGroupItem <> this.Tag) Then CurrentGro";
if ((_currentgroupitem!=(double)(BA.ObjectToNumber(_this.getTag())))) { 
_currentgroupitem = (int)(BA.ObjectToNumber(_this.getTag()));};
RDebugUtils.currentLine=148963331;
 //BA.debugLineNum = 148963331;BA.debugLine="Dim p As B4XView = objectListView.GetPanel(Curren";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._objectlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_currentgroupitem);
RDebugUtils.currentLine=148963332;
 //BA.debugLineNum = 148963332;BA.debugLine="If p.Tag = True Then";
if ((_p.getTag()).equals((Object)(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=148963333;
 //BA.debugLineNum = 148963333;BA.debugLine="CollapseItem(CurrentGroupItem)";
_collapseitem(_currentgroupitem);
 }else {
RDebugUtils.currentLine=148963335;
 //BA.debugLineNum = 148963335;BA.debugLine="ExpandItem(CurrentGroupItem)";
_expanditem(_currentgroupitem);
 };
RDebugUtils.currentLine=148963337;
 //BA.debugLineNum = 148963337;BA.debugLine="End Sub";
return "";
}
public static String  _grouppropcollpseexpand_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouppropcollpseexpand_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouppropcollpseexpand_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=150339584;
 //BA.debugLineNum = 150339584;BA.debugLine="Sub GroupPropCollpseExpand_Click";
RDebugUtils.currentLine=150339586;
 //BA.debugLineNum = 150339586;BA.debugLine="Dim p As B4XView = objectPropertyListView.GetPane";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_currentgroupitemprop);
RDebugUtils.currentLine=150339587;
 //BA.debugLineNum = 150339587;BA.debugLine="If p.Tag = True Then";
if ((_p.getTag()).equals((Object)(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=150339588;
 //BA.debugLineNum = 150339588;BA.debugLine="CollapseItemProp(CurrentGroupItemProp)";
_collapseitemprop(_currentgroupitemprop);
 }else {
RDebugUtils.currentLine=150339590;
 //BA.debugLineNum = 150339590;BA.debugLine="ExpandItemProp(CurrentGroupItemProp)";
_expanditemprop(_currentgroupitemprop);
 };
RDebugUtils.currentLine=150339592;
 //BA.debugLineNum = 150339592;BA.debugLine="End Sub";
return "";
}
public static String  _listbutrefresh_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutrefresh_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutrefresh_click", null));}
RDebugUtils.currentLine=149880832;
 //BA.debugLineNum = 149880832;BA.debugLine="Sub listButRefresh_Click";
RDebugUtils.currentLine=149880834;
 //BA.debugLineNum = 149880834;BA.debugLine="End Sub";
return "";
}
public static void  _listitemdocbutton_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemdocbutton_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "listitemdocbutton_click", null); return;}
ResumableSub_ListItemDocButton_Click rsub = new ResumableSub_ListItemDocButton_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListItemDocButton_Click extends BA.ResumableSub {
public ResumableSub_ListItemDocButton_Click(xevolution.vrcg.devdemov2400.objectedit parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objectedit parent;
anywheresoftware.b4a.objects.LabelWrapper _b = null;
String _filename = "";
boolean _continua = false;
String _thefile = "";
int _result = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _downloaded = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objectedit";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=150011905;
 //BA.debugLineNum = 150011905;BA.debugLine="Dim b As Label = Sender";
_b = new anywheresoftware.b4a.objects.LabelWrapper();
_b = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=150011906;
 //BA.debugLineNum = 150011906;BA.debugLine="Dim FileName As String = b.tag";
_filename = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=150011907;
 //BA.debugLineNum = 150011907;BA.debugLine="Dim Continua As Boolean = False";
_continua = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=150011908;
 //BA.debugLineNum = 150011908;BA.debugLine="Dim theFile As String = File.Combine(Starter.Inte";
_thefile = anywheresoftware.b4a.keywords.Common.File.Combine(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename);
RDebugUtils.currentLine=150011915;
 //BA.debugLineNum = 150011915;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,FileNam";
if (true) break;

case 1:
//if
this.state = 30;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename))) { 
this.state = 3;
}else {
this.state = 22;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=150011916;
 //BA.debugLineNum = 150011916;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=150011917;
 //BA.debugLineNum = 150011917;BA.debugLine="result = Msgbox2(ShareCode.userfilenoindentified";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfilenoindentified /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=150011918;
 //BA.debugLineNum = 150011918;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=150011919;
 //BA.debugLineNum = 150011919;BA.debugLine="Dim res As ResumableSub = GetMissingDocument(Fi";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _getmissingdocument(_filename);
RDebugUtils.currentLine=150011920;
 //BA.debugLineNum = 150011920;BA.debugLine="Wait For(res) Complete (Downloaded As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objectedit", "listitemdocbutton_click"), _res);
this.state = 31;
return;
case 31:
//C
this.state = 7;
_downloaded = (Boolean) result[0];
;
RDebugUtils.currentLine=150011921;
 //BA.debugLineNum = 150011921;BA.debugLine="If(Downloaded) Then";
if (true) break;

case 7:
//if
this.state = 19;
if ((_downloaded)) { 
this.state = 9;
}else {
this.state = 18;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=150011922;
 //BA.debugLineNum = 150011922;BA.debugLine="Log($\"Missing File downloaded\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6150011922",("Missing File downloaded"),0);
RDebugUtils.currentLine=150011923;
 //BA.debugLineNum = 150011923;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6150011923",_thefile,0);
RDebugUtils.currentLine=150011924;
 //BA.debugLineNum = 150011924;BA.debugLine="If File.Exists(Starter.InternalFolder, FileNam";
if (true) break;

case 10:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=150011925;
 //BA.debugLineNum = 150011925;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, S";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=150011926;
 //BA.debugLineNum = 150011926;BA.debugLine="Continua = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=150011928;
 //BA.debugLineNum = 150011928;BA.debugLine="If Continua Then";

case 13:
//if
this.state = 16;
if (_continua) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=150011929;
 //BA.debugLineNum = 150011929;BA.debugLine="Utils.ViewPDFFile(FileName)";
parent.mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=150011933;
 //BA.debugLineNum = 150011933;BA.debugLine="MsgboxAsync(ShareCode.userfileunavailable,Shar";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfileunavailable /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 30;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=150011937;
 //BA.debugLineNum = 150011937;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6150011937",_thefile,0);
RDebugUtils.currentLine=150011938;
 //BA.debugLineNum = 150011938;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
if (true) break;

case 23:
//if
this.state = 26;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=150011939;
 //BA.debugLineNum = 150011939;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, Sta";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=150011940;
 //BA.debugLineNum = 150011940;BA.debugLine="Continua = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=150011942;
 //BA.debugLineNum = 150011942;BA.debugLine="If Continua Then";

case 26:
//if
this.state = 29;
if (_continua) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=150011943;
 //BA.debugLineNum = 150011943;BA.debugLine="Utils.ViewPDFFile(FileName)";
parent.mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=150011946;
 //BA.debugLineNum = 150011946;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _listitemtitle_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemtitle_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "listitemtitle_click", null); return;}
ResumableSub_ListItemTitle_Click rsub = new ResumableSub_ListItemTitle_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ListItemTitle_Click extends BA.ResumableSub {
public ResumableSub_ListItemTitle_Click(xevolution.vrcg.devdemov2400.objectedit parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objectedit parent;
anywheresoftware.b4a.objects.LabelWrapper _b = null;
String _filename = "";
boolean _continua = false;
String _thefile = "";
int _result = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _downloaded = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objectedit";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=149946369;
 //BA.debugLineNum = 149946369;BA.debugLine="Dim b As Label = Sender";
_b = new anywheresoftware.b4a.objects.LabelWrapper();
_b = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=149946370;
 //BA.debugLineNum = 149946370;BA.debugLine="Dim FileName As String = b.tag";
_filename = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=149946371;
 //BA.debugLineNum = 149946371;BA.debugLine="Dim Continua As Boolean = False";
_continua = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=149946372;
 //BA.debugLineNum = 149946372;BA.debugLine="Dim theFile As String = File.Combine(Starter.Inte";
_thefile = anywheresoftware.b4a.keywords.Common.File.Combine(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename);
RDebugUtils.currentLine=149946379;
 //BA.debugLineNum = 149946379;BA.debugLine="If Not(File.Exists(Starter.InternalFolder,FileNam";
if (true) break;

case 1:
//if
this.state = 30;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename))) { 
this.state = 3;
}else {
this.state = 22;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=149946380;
 //BA.debugLineNum = 149946380;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=149946381;
 //BA.debugLineNum = 149946381;BA.debugLine="result = Msgbox2(ShareCode.userfilenoindentified";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfilenoindentified /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=149946382;
 //BA.debugLineNum = 149946382;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (true) break;

case 4:
//if
this.state = 20;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=149946383;
 //BA.debugLineNum = 149946383;BA.debugLine="Dim res As ResumableSub = GetMissingDocument(Fi";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _getmissingdocument(_filename);
RDebugUtils.currentLine=149946384;
 //BA.debugLineNum = 149946384;BA.debugLine="Wait For(res) Complete (Downloaded As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objectedit", "listitemtitle_click"), _res);
this.state = 31;
return;
case 31:
//C
this.state = 7;
_downloaded = (Boolean) result[0];
;
RDebugUtils.currentLine=149946385;
 //BA.debugLineNum = 149946385;BA.debugLine="If(Downloaded) Then";
if (true) break;

case 7:
//if
this.state = 19;
if ((_downloaded)) { 
this.state = 9;
}else {
this.state = 18;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=149946386;
 //BA.debugLineNum = 149946386;BA.debugLine="Log($\"Missing File downloaded\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6149946386",("Missing File downloaded"),0);
RDebugUtils.currentLine=149946387;
 //BA.debugLineNum = 149946387;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6149946387",_thefile,0);
RDebugUtils.currentLine=149946388;
 //BA.debugLineNum = 149946388;BA.debugLine="If File.Exists(Starter.InternalFolder, FileNam";
if (true) break;

case 10:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=149946389;
 //BA.debugLineNum = 149946389;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, S";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=149946390;
 //BA.debugLineNum = 149946390;BA.debugLine="Continua = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=149946392;
 //BA.debugLineNum = 149946392;BA.debugLine="If Continua Then";

case 13:
//if
this.state = 16;
if (_continua) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=149946393;
 //BA.debugLineNum = 149946393;BA.debugLine="Utils.ViewPDFFile(FileName)";
parent.mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=149946397;
 //BA.debugLineNum = 149946397;BA.debugLine="MsgboxAsync(ShareCode.userfileunavailable,Shar";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfileunavailable /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 30;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=149946401;
 //BA.debugLineNum = 149946401;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6149946401",_thefile,0);
RDebugUtils.currentLine=149946402;
 //BA.debugLineNum = 149946402;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
if (true) break;

case 23:
//if
this.state = 26;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=149946403;
 //BA.debugLineNum = 149946403;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, Sta";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=149946404;
 //BA.debugLineNum = 149946404;BA.debugLine="Continua = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=149946406;
 //BA.debugLineNum = 149946406;BA.debugLine="If Continua Then";

case 26:
//if
this.state = 29;
if (_continua) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=149946407;
 //BA.debugLineNum = 149946407;BA.debugLine="Utils.ViewPDFFile(FileName)";
parent.mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=149946410;
 //BA.debugLineNum = 149946410;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _listsbuttonadd_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonadd_click", null));}
RDebugUtils.currentLine=148504576;
 //BA.debugLineNum = 148504576;BA.debugLine="Sub listsButtonAdd_Click";
RDebugUtils.currentLine=148504578;
 //BA.debugLineNum = 148504578;BA.debugLine="End Sub";
return "";
}
public static String  _liststabpanel_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected", new Object[] {_position}));}
String _title = "";
RDebugUtils.currentLine=150667264;
 //BA.debugLineNum = 150667264;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=150667265;
 //BA.debugLineNum = 150667265;BA.debugLine="If(ShareCode.ISPHONE And MenuPanel.Visible = Fals";
if ((mostCurrent._sharecode._isphone /*boolean*/  && mostCurrent._menupanel.getVisible()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=150667266;
 //BA.debugLineNum = 150667266;BA.debugLine="Dim title As String";
_title = "";
RDebugUtils.currentLine=150667267;
 //BA.debugLineNum = 150667267;BA.debugLine="title = MenuPanelPagesTitle.Get(Position)";
_title = BA.ObjectToString(mostCurrent._menupanelpagestitle.Get(_position));
RDebugUtils.currentLine=150667268;
 //BA.debugLineNum = 150667268;BA.debugLine="mainLabelOptLists.Text = title";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(_title));
 };
RDebugUtils.currentLine=150667281;
 //BA.debugLineNum = 150667281;BA.debugLine="End Sub";
return "";
}
public static String  _mainlogo_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainlogo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainlogo_click", null));}
int _i = 0;
RDebugUtils.currentLine=150142976;
 //BA.debugLineNum = 150142976;BA.debugLine="Sub mainLogo_Click";
RDebugUtils.currentLine=150142977;
 //BA.debugLineNum = 150142977;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=150142978;
 //BA.debugLineNum = 150142978;BA.debugLine="i = Msgbox2(\"Deseja voltar directamente para o in";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Deseja voltar directamente para o início?"),BA.ObjectToCharSequence("Alerta!"),"Sim","Cancelar","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=150142979;
 //BA.debugLineNum = 150142979;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=150142980;
 //BA.debugLineNum = 150142980;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturn",(Object)(""));
RDebugUtils.currentLine=150142981;
 //BA.debugLineNum = 150142981;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=150142982;
 //BA.debugLineNum = 150142982;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\"";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
 };
RDebugUtils.currentLine=150142984;
 //BA.debugLineNum = 150142984;BA.debugLine="End Sub";
return "";
}
public static String  _menupanelbuttomtwo_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupanelbuttomtwo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupanelbuttomtwo_click", null));}
RDebugUtils.currentLine=150470656;
 //BA.debugLineNum = 150470656;BA.debugLine="Sub MenuPanelButtomTwo_Click";
RDebugUtils.currentLine=150470657;
 //BA.debugLineNum = 150470657;BA.debugLine="listsTabPanel.ScrollTo(1,False)";
mostCurrent._liststabpanel.ScrollTo((int) (1),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150470658;
 //BA.debugLineNum = 150470658;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150470659;
 //BA.debugLineNum = 150470659;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=150470660;
 //BA.debugLineNum = 150470660;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._menupanelpagestitle.Get((int) (1))));
RDebugUtils.currentLine=150470661;
 //BA.debugLineNum = 150470661;BA.debugLine="End Sub";
return "";
}
public static String  _menupanelbuttonfour_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupanelbuttonfour_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupanelbuttonfour_click", null));}
RDebugUtils.currentLine=150601728;
 //BA.debugLineNum = 150601728;BA.debugLine="Sub MenuPanelButtonFour_Click";
RDebugUtils.currentLine=150601729;
 //BA.debugLineNum = 150601729;BA.debugLine="listsTabPanel.ScrollTo(3,False)";
mostCurrent._liststabpanel.ScrollTo((int) (3),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150601730;
 //BA.debugLineNum = 150601730;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150601731;
 //BA.debugLineNum = 150601731;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=150601732;
 //BA.debugLineNum = 150601732;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._menupanelpagestitle.Get((int) (3))));
RDebugUtils.currentLine=150601733;
 //BA.debugLineNum = 150601733;BA.debugLine="End Sub";
return "";
}
public static String  _menupanelbuttonone_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupanelbuttonone_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupanelbuttonone_click", null));}
RDebugUtils.currentLine=150405120;
 //BA.debugLineNum = 150405120;BA.debugLine="Sub MenuPanelButtonOne_Click";
RDebugUtils.currentLine=150405121;
 //BA.debugLineNum = 150405121;BA.debugLine="listsTabPanel.ScrollTo(0,False)";
mostCurrent._liststabpanel.ScrollTo((int) (0),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150405122;
 //BA.debugLineNum = 150405122;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150405123;
 //BA.debugLineNum = 150405123;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=150405124;
 //BA.debugLineNum = 150405124;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._menupanelpagestitle.Get((int) (0))));
RDebugUtils.currentLine=150405126;
 //BA.debugLineNum = 150405126;BA.debugLine="End Sub";
return "";
}
public static String  _menupanelbuttonthree_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupanelbuttonthree_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupanelbuttonthree_click", null));}
RDebugUtils.currentLine=150536192;
 //BA.debugLineNum = 150536192;BA.debugLine="Sub MenuPanelButtonThree_Click";
RDebugUtils.currentLine=150536193;
 //BA.debugLineNum = 150536193;BA.debugLine="listsTabPanel.ScrollTo(2,False)";
mostCurrent._liststabpanel.ScrollTo((int) (2),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150536194;
 //BA.debugLineNum = 150536194;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150536195;
 //BA.debugLineNum = 150536195;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=150536196;
 //BA.debugLineNum = 150536196;BA.debugLine="mainLabelOptLists.Text = MenuPanelPagesTitle.Get(";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._menupanelpagestitle.Get((int) (2))));
RDebugUtils.currentLine=150536197;
 //BA.debugLineNum = 150536197;BA.debugLine="End Sub";
return "";
}
public static String  _objectlistview_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objectlistview_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objectlistview_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=149291008;
 //BA.debugLineNum = 149291008;BA.debugLine="Sub objectListView_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=149291009;
 //BA.debugLineNum = 149291009;BA.debugLine="CurrentGroupItem = Index";
_currentgroupitem = _index;
RDebugUtils.currentLine=149291010;
 //BA.debugLineNum = 149291010;BA.debugLine="Log(CurrentGroupItem)";
anywheresoftware.b4a.keywords.Common.LogImpl("6149291010",BA.NumberToString(_currentgroupitem),0);
RDebugUtils.currentLine=149291012;
 //BA.debugLineNum = 149291012;BA.debugLine="Dim p As B4XView = objectListView.GetPanel(Curren";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._objectlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_currentgroupitem);
RDebugUtils.currentLine=149291013;
 //BA.debugLineNum = 149291013;BA.debugLine="If p.Tag = True Then";
if ((_p.getTag()).equals((Object)(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=149291014;
 //BA.debugLineNum = 149291014;BA.debugLine="CollapseItem(CurrentGroupItem)";
_collapseitem(_currentgroupitem);
 }else {
RDebugUtils.currentLine=149291016;
 //BA.debugLineNum = 149291016;BA.debugLine="ExpandItem(CurrentGroupItem)";
_expanditem(_currentgroupitem);
 };
RDebugUtils.currentLine=149291018;
 //BA.debugLineNum = 149291018;BA.debugLine="End Sub";
return "";
}
public static String  _objectlistviewprop_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objectlistviewprop_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objectlistviewprop_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=149356544;
 //BA.debugLineNum = 149356544;BA.debugLine="Sub objectListViewProp_ItemClick (Index As Int, Va";
RDebugUtils.currentLine=149356545;
 //BA.debugLineNum = 149356545;BA.debugLine="CurrentGroupItemProp = Index";
_currentgroupitemprop = _index;
RDebugUtils.currentLine=149356546;
 //BA.debugLineNum = 149356546;BA.debugLine="Log(CurrentGroupItemProp)";
anywheresoftware.b4a.keywords.Common.LogImpl("6149356546",BA.NumberToString(_currentgroupitemprop),0);
RDebugUtils.currentLine=149356548;
 //BA.debugLineNum = 149356548;BA.debugLine="Dim p As B4XView = objectPropertyListView.GetPane";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._objectpropertylistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_currentgroupitemprop);
RDebugUtils.currentLine=149356549;
 //BA.debugLineNum = 149356549;BA.debugLine="If p.Tag = True Then";
if ((_p.getTag()).equals((Object)(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=149356550;
 //BA.debugLineNum = 149356550;BA.debugLine="CollapseItemProp(CurrentGroupItemProp)";
_collapseitemprop(_currentgroupitemprop);
 }else {
RDebugUtils.currentLine=149356552;
 //BA.debugLineNum = 149356552;BA.debugLine="ExpandItemProp(CurrentGroupItemProp)";
_expanditemprop(_currentgroupitemprop);
 };
RDebugUtils.currentLine=149356554;
 //BA.debugLineNum = 149356554;BA.debugLine="End Sub";
return "";
}
public static String  _objectpropertylistview_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objectpropertylistview_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objectpropertylistview_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=150208512;
 //BA.debugLineNum = 150208512;BA.debugLine="Sub objectPropertyListView_ItemClick (Index As Int";
RDebugUtils.currentLine=150208514;
 //BA.debugLineNum = 150208514;BA.debugLine="End Sub";
return "";
}
public static String  _objectwhitemscheck_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objectwhitemscheck_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objectwhitemscheck_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=149487616;
 //BA.debugLineNum = 149487616;BA.debugLine="Sub objectWHItemsCheck_ItemClick (Index As Int, Va";
RDebugUtils.currentLine=149487618;
 //BA.debugLineNum = 149487618;BA.debugLine="End Sub";
return "";
}
public static String  _objectwhitemstaken_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objectwhitemstaken_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objectwhitemstaken_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=149422080;
 //BA.debugLineNum = 149422080;BA.debugLine="Sub objectWHItemsTaken_ItemClick (Index As Int, Va";
RDebugUtils.currentLine=149422082;
 //BA.debugLineNum = 149422082;BA.debugLine="End Sub";
return "";
}
public static String  _pnlgroupexpandedprop_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pnlgroupexpandedprop_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pnlgroupexpandedprop_click", null));}
RDebugUtils.currentLine=150274048;
 //BA.debugLineNum = 150274048;BA.debugLine="Sub pnlGroupExpandedProp_Click";
RDebugUtils.currentLine=150274050;
 //BA.debugLineNum = 150274050;BA.debugLine="End Sub";
return "";
}
public static String  _updateobjectform(String _tagcode) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateobjectform", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateobjectform", new Object[] {_tagcode}));}
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
RDebugUtils.currentLine=147914752;
 //BA.debugLineNum = 147914752;BA.debugLine="Sub UpdateobjectForm(Tagcode As String)";
RDebugUtils.currentLine=147914753;
 //BA.debugLineNum = 147914753;BA.debugLine="Dim SQL As String = DBStructures.SQL_CURRENT_OBJE";
_sql = mostCurrent._dbstructures._sql_current_objects /*String*/ ;
RDebugUtils.currentLine=147914754;
 //BA.debugLineNum = 147914754;BA.debugLine="If (Tagcode <> \"\") Then";
if (((_tagcode).equals("") == false)) { 
RDebugUtils.currentLine=147914755;
 //BA.debugLineNum = 147914755;BA.debugLine="SQL = $\"${SQL} where a.tagcode='${Tagcode}'\"$";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=147914756;
 //BA.debugLineNum = 147914756;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=147914757;
 //BA.debugLineNum = 147914757;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=147914758;
 //BA.debugLineNum = 147914758;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=147914759;
 //BA.debugLineNum = 147914759;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=147914760;
 //BA.debugLineNum = 147914760;BA.debugLine="CreateobjectDetailsData(True, Record)";
_createobjectdetailsdata(anywheresoftware.b4a.keywords.Common.True,_record);
RDebugUtils.currentLine=147914761;
 //BA.debugLineNum = 147914761;BA.debugLine="CreateobjectDetailsDataProp(0, True, Tagcode) '";
_createobjectdetailsdataprop((int) (0),anywheresoftware.b4a.keywords.Common.True,_tagcode);
 }else {
RDebugUtils.currentLine=147914763;
 //BA.debugLineNum = 147914763;BA.debugLine="Record.Close";
_record.Close();
 };
 };
RDebugUtils.currentLine=147914767;
 //BA.debugLineNum = 147914767;BA.debugLine="End Sub";
return "";
}
public static String  _setupmobilebuttons() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupmobilebuttons", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setupmobilebuttons", null));}
int _i = 0;
anywheresoftware.b4a.objects.ButtonWrapper _button = null;
RDebugUtils.currentLine=147390464;
 //BA.debugLineNum = 147390464;BA.debugLine="Sub SetupMobileButtons";
RDebugUtils.currentLine=147390466;
 //BA.debugLineNum = 147390466;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=147390468;
 //BA.debugLineNum = 147390468;BA.debugLine="For i = 0 To MenuPanelPagesTitle.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._menupanelpagestitle.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=147390469;
 //BA.debugLineNum = 147390469;BA.debugLine="Dim Button As Button = MenuPanelButtonList.Get(i";
_button = new anywheresoftware.b4a.objects.ButtonWrapper();
_button = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(mostCurrent._menupanelbuttonlist.Get(_i)));
RDebugUtils.currentLine=147390470;
 //BA.debugLineNum = 147390470;BA.debugLine="Button.Text = MenuPanelPagesTitle.Get(i)";
_button.setText(BA.ObjectToCharSequence(mostCurrent._menupanelpagestitle.Get(_i)));
 }
};
RDebugUtils.currentLine=147390474;
 //BA.debugLineNum = 147390474;BA.debugLine="If(MenuPanelPagesTitle.Size > 3) Then";
if ((mostCurrent._menupanelpagestitle.getSize()>3)) { 
RDebugUtils.currentLine=147390475;
 //BA.debugLineNum = 147390475;BA.debugLine="MenuPanelButtonThree.Visible = True";
mostCurrent._menupanelbuttonthree.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=147390476;
 //BA.debugLineNum = 147390476;BA.debugLine="MenuPanelButtonFour.Visible = True";
mostCurrent._menupanelbuttonfour.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else 
{RDebugUtils.currentLine=147390477;
 //BA.debugLineNum = 147390477;BA.debugLine="Else If(MenuPanelPagesTitle.Size > 2) Then";
if ((mostCurrent._menupanelpagestitle.getSize()>2)) { 
RDebugUtils.currentLine=147390478;
 //BA.debugLineNum = 147390478;BA.debugLine="MenuPanelButtonThree.Visible = True";
mostCurrent._menupanelbuttonthree.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=147390480;
 //BA.debugLineNum = 147390480;BA.debugLine="MenuPanelButtonThree.Visible = False";
mostCurrent._menupanelbuttonthree.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=147390481;
 //BA.debugLineNum = 147390481;BA.debugLine="MenuPanelButtonFour.Visible = False";
mostCurrent._menupanelbuttonfour.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }}
;
RDebugUtils.currentLine=147390483;
 //BA.debugLineNum = 147390483;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=147390484;
 //BA.debugLineNum = 147390484;BA.debugLine="MenuPanel.Visible = True";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=147390485;
 //BA.debugLineNum = 147390485;BA.debugLine="MenuPanelButtonOne.Color = Consts.ColorMain";
mostCurrent._menupanelbuttonone.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=147390486;
 //BA.debugLineNum = 147390486;BA.debugLine="MenuPanelButtomTwo.Color = Consts.ColorMain";
mostCurrent._menupanelbuttomtwo.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=147390487;
 //BA.debugLineNum = 147390487;BA.debugLine="MenuPanelButtonThree.Color  = Consts.ColorMain";
mostCurrent._menupanelbuttonthree.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=147390488;
 //BA.debugLineNum = 147390488;BA.debugLine="MenuPanelButtonFour.Color  = Consts.ColorMain";
mostCurrent._menupanelbuttonfour.setColor(mostCurrent._consts._colormain /*int*/ );
 };
RDebugUtils.currentLine=147390491;
 //BA.debugLineNum = 147390491;BA.debugLine="End Sub";
return "";
}
public static String  _startobjectactivity(String _tagcode) throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startobjectactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startobjectactivity", new Object[] {_tagcode}));}
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _obtagcode = "";
String _parentname = "";
RDebugUtils.currentLine=147456000;
 //BA.debugLineNum = 147456000;BA.debugLine="Sub StartObjectActivity(Tagcode As String)";
RDebugUtils.currentLine=147456002;
 //BA.debugLineNum = 147456002;BA.debugLine="Dim SQL As String = DBStructures.EVC_SQL_CURRENT_";
_sql = mostCurrent._dbstructures._evc_sql_current_objects /*String*/ ;
RDebugUtils.currentLine=147456003;
 //BA.debugLineNum = 147456003;BA.debugLine="If (Tagcode <> \"\") Then";
if (((_tagcode).equals("") == false)) { 
RDebugUtils.currentLine=147456004;
 //BA.debugLineNum = 147456004;BA.debugLine="SQL = $\"${SQL} where a.tagcode='${Tagcode}'\"$";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=147456005;
 //BA.debugLineNum = 147456005;BA.debugLine="Log(SQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6147456005",_sql,0);
RDebugUtils.currentLine=147456006;
 //BA.debugLineNum = 147456006;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=147456007;
 //BA.debugLineNum = 147456007;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=147456008;
 //BA.debugLineNum = 147456008;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=147456009;
 //BA.debugLineNum = 147456009;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=147456011;
 //BA.debugLineNum = 147456011;BA.debugLine="ThisObjectType = DBStructures.getDBObjectTypeEV";
mostCurrent._thisobjecttype = mostCurrent._dbstructures._getdbobjecttypeevc /*xevolution.vrcg.devdemov2400.types._objecttype*/ (mostCurrent.activityBA,_record.GetString("type_tagcode"));
RDebugUtils.currentLine=147456012;
 //BA.debugLineNum = 147456012;BA.debugLine="CreateObjectTABS(ThisObjectType)";
_createobjecttabs(mostCurrent._thisobjecttype);
RDebugUtils.currentLine=147456013;
 //BA.debugLineNum = 147456013;BA.debugLine="Dim obTagCode As String = Record.GetString(\"tag";
_obtagcode = _record.GetString("tagcode");
RDebugUtils.currentLine=147456014;
 //BA.debugLineNum = 147456014;BA.debugLine="objectType.text = Record.GetString(\"typedesc\")";
mostCurrent._objecttype.setText(BA.ObjectToCharSequence(_record.GetString("typedesc")));
RDebugUtils.currentLine=147456016;
 //BA.debugLineNum = 147456016;BA.debugLine="objectCode.Text = Record.GetString(\"reference\")";
mostCurrent._objectcode.setText(BA.ObjectToCharSequence(_record.GetString("reference")));
RDebugUtils.currentLine=147456017;
 //BA.debugLineNum = 147456017;BA.debugLine="objectNotes.text = Record.GetString(\"notes\")";
mostCurrent._objectnotes.setText(BA.ObjectToCharSequence(_record.GetString("notes")));
RDebugUtils.currentLine=147456018;
 //BA.debugLineNum = 147456018;BA.debugLine="mainLabelOptLists.text = Record.GetString(\"name";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(_record.GetString("name")));
RDebugUtils.currentLine=147456019;
 //BA.debugLineNum = 147456019;BA.debugLine="ObjectEditSelectedName = Record.GetString(\"name";
mostCurrent._objecteditselectedname = _record.GetString("name");
RDebugUtils.currentLine=147456020;
 //BA.debugLineNum = 147456020;BA.debugLine="ObjectParent = Record.GetString(\"parent\")";
mostCurrent._objectparent = _record.GetString("parent");
RDebugUtils.currentLine=147456021;
 //BA.debugLineNum = 147456021;BA.debugLine="objectTagcode.text = ObjectEditSelectedName";
mostCurrent._objecttagcode.setText(BA.ObjectToCharSequence(mostCurrent._objecteditselectedname));
RDebugUtils.currentLine=147456022;
 //BA.debugLineNum = 147456022;BA.debugLine="CurrentobjectTagcode = obTagCode.Trim 'objectTa";
mostCurrent._currentobjecttagcode = _obtagcode.trim();
RDebugUtils.currentLine=147456024;
 //BA.debugLineNum = 147456024;BA.debugLine="Dim ParentName As String = DBStructures.GetScri";
_parentname = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select title_import from dta_objects where 1=1\n"+"																	and tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._objectparent))+"'"),"title_import");
RDebugUtils.currentLine=147456027;
 //BA.debugLineNum = 147456027;BA.debugLine="If Utils.NNE(ParentName) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_parentname)) { 
RDebugUtils.currentLine=147456028;
 //BA.debugLineNum = 147456028;BA.debugLine="ObjParent.Text = ParentName";
mostCurrent._objparent.setText(BA.ObjectToCharSequence(_parentname));
 }else {
RDebugUtils.currentLine=147456030;
 //BA.debugLineNum = 147456030;BA.debugLine="ObjParent.Text = \"\"";
mostCurrent._objparent.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=147456033;
 //BA.debugLineNum = 147456033;BA.debugLine="CreateobjectDetailsData(False, Record)";
_createobjectdetailsdata(anywheresoftware.b4a.keywords.Common.False,_record);
RDebugUtils.currentLine=147456034;
 //BA.debugLineNum = 147456034;BA.debugLine="CreateobjectDetailsDataProp(0, False, Tagcode)";
_createobjectdetailsdataprop((int) (0),anywheresoftware.b4a.keywords.Common.False,_tagcode);
RDebugUtils.currentLine=147456036;
 //BA.debugLineNum = 147456036;BA.debugLine="If ThisObjectType.isgroup = 1 Then";
if (mostCurrent._thisobjecttype.isgroup /*int*/ ==1) { 
RDebugUtils.currentLine=147456037;
 //BA.debugLineNum = 147456037;BA.debugLine="CreateObjectsFromObject(True, $\"a.parent_tagco";
_createobjectsfromobject(anywheresoftware.b4a.keywords.Common.True,("a.parent_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._currentobjecttagcode))+"'"));
 };
RDebugUtils.currentLine=147456048;
 //BA.debugLineNum = 147456048;BA.debugLine="If ThisObjectType.have_documents = 1 Then";
if (mostCurrent._thisobjecttype.have_documents /*int*/ ==1) { 
RDebugUtils.currentLine=147456049;
 //BA.debugLineNum = 147456049;BA.debugLine="CreateDocumentsFromobject(False, Currentobject";
_createdocumentsfromobject(anywheresoftware.b4a.keywords.Common.False,mostCurrent._currentobjecttagcode);
 };
 }else {
RDebugUtils.currentLine=147456053;
 //BA.debugLineNum = 147456053;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=147456054;
 //BA.debugLineNum = 147456054;BA.debugLine="MsgboxAsync( \"Não foi encontrado qualquer regis";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Não foi encontrado qualquer registo em BD com o código interno do objecto seleccionado. Actualize os dados do Tablet e tente novamente."),BA.ObjectToCharSequence("Alerta!"),processBA);
RDebugUtils.currentLine=147456055;
 //BA.debugLineNum = 147456055;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
 }else {
RDebugUtils.currentLine=147456058;
 //BA.debugLineNum = 147456058;BA.debugLine="MsgboxAsync( \"Não foi identificado o código inte";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Não foi identificado o código interno do objecto seleccionado. Actualize os dados do Tablet e tente novamente."),BA.ObjectToCharSequence("Alerta!"),processBA);
RDebugUtils.currentLine=147456059;
 //BA.debugLineNum = 147456059;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=147456061;
 //BA.debugLineNum = 147456061;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=147456062;
 //BA.debugLineNum = 147456062;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.objectedit parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objectedit parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objectedit";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=147259393;
 //BA.debugLineNum = 147259393;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
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
RDebugUtils.currentLine=147259394;
 //BA.debugLineNum = 147259394;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=147259395;
 //BA.debugLineNum = 147259395;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=147259396;
 //BA.debugLineNum = 147259396;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=147259397;
 //BA.debugLineNum = 147259397;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=147259398;
 //BA.debugLineNum = 147259398;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=147259399;
 //BA.debugLineNum = 147259399;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objectedit", "windowstatusupdate"),(int) (500));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=147259400;
 //BA.debugLineNum = 147259400;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=147259402;
 //BA.debugLineNum = 147259402;BA.debugLine="SetupMobileButtons";
_setupmobilebuttons();
RDebugUtils.currentLine=147259403;
 //BA.debugLineNum = 147259403;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=147259404;
 //BA.debugLineNum = 147259404;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=147259405;
 //BA.debugLineNum = 147259405;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=147259406;
 //BA.debugLineNum = 147259406;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=147259407;
 //BA.debugLineNum = 147259407;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
parent.mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=147259408;
 //BA.debugLineNum = 147259408;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
parent.mostCurrent._mainlogo.setWidth(parent.mostCurrent._consts._logowidth /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=147259410;
 //BA.debugLineNum = 147259410;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
anywheresoftware.b4a.keywords.Common.LogImpl("6147259410",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=147259411;
 //BA.debugLineNum = 147259411;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=147259412;
 //BA.debugLineNum = 147259412;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
parent.mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(parent.mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=147259436;
 //BA.debugLineNum = 147259436;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _thisaddressedit_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "thisaddressedit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "thisaddressedit_click", null));}
RDebugUtils.currentLine=148701184;
 //BA.debugLineNum = 148701184;BA.debugLine="Sub thisAddressEdit_Click";
RDebugUtils.currentLine=148701204;
 //BA.debugLineNum = 148701204;BA.debugLine="End Sub";
return "";
}
public static String  _thiscontactedit_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "thiscontactedit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "thiscontactedit_click", null));}
RDebugUtils.currentLine=148832256;
 //BA.debugLineNum = 148832256;BA.debugLine="Sub ThisContactEdit_Click";
RDebugUtils.currentLine=148832276;
 //BA.debugLineNum = 148832276;BA.debugLine="End Sub";
return "";
}
public static String  _thisgeoreferenceedit_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "thisgeoreferenceedit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "thisgeoreferenceedit_click", null));}
RDebugUtils.currentLine=148766720;
 //BA.debugLineNum = 148766720;BA.debugLine="Sub ThisGeoReferenceEdit_Click";
RDebugUtils.currentLine=148766738;
 //BA.debugLineNum = 148766738;BA.debugLine="End Sub";
return "";
}
public static String  _thispropertyedit_click() throws Exception{
RDebugUtils.currentModule="objectedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "thispropertyedit_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "thispropertyedit_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lv = null;
anywheresoftware.b4a.objects.LabelWrapper _lt = null;
xevolution.vrcg.devdemov2400.appdialogs _changeproperty = null;
RDebugUtils.currentLine=148897792;
 //BA.debugLineNum = 148897792;BA.debugLine="Sub ThisPropertyEdit_Click";
RDebugUtils.currentLine=148897793;
 //BA.debugLineNum = 148897793;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=148897794;
 //BA.debugLineNum = 148897794;BA.debugLine="Dim p As Panel = b.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_b.getParent()));
RDebugUtils.currentLine=148897795;
 //BA.debugLineNum = 148897795;BA.debugLine="Dim lv As Label = p.GetView(0)";
_lv = new anywheresoftware.b4a.objects.LabelWrapper();
_lv = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=148897796;
 //BA.debugLineNum = 148897796;BA.debugLine="Dim lt As Label = p.GetView(1)";
_lt = new anywheresoftware.b4a.objects.LabelWrapper();
_lt = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=148897798;
 //BA.debugLineNum = 148897798;BA.debugLine="Dim ChangeProperty As AppDialogs";
_changeproperty = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=148897799;
 //BA.debugLineNum = 148897799;BA.debugLine="ChangeProperty.Initialize";
_changeproperty._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=148897800;
 //BA.debugLineNum = 148897800;BA.debugLine="ChangeProperty.GetPropertyDialog(\"ObjectEdit\", lt";
_changeproperty._getpropertydialog /*void*/ (null,(Object)("ObjectEdit"),_lt.getText(),_lv.getText(),BA.ObjectToString(_b.getTag()),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=148897801;
 //BA.debugLineNum = 148897801;BA.debugLine="End Sub";
return "";
}
}