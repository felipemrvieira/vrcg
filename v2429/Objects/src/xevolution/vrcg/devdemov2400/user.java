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

public class user extends Activity implements B4AActivity{
	public static user mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.user");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (user).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.user");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.user", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (user) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (user) Resume **");
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
		return user.class;
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
            BA.LogInfo("** Activity (user) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (user) Pause event (activity is not paused). **");
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
            user mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (user) Resume **");
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
public anywheresoftware.b4a.objects.drawable.BitmapDrawable _icon = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static boolean _gobackmoreactions = false;
public anywheresoftware.b4a.objects.ImageViewWrapper _listsbackground = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbasepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottomline = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottompanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonadd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _listslabelinfo = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _liststopbar = null;
public static int _itemscounter = 0;
public anywheresoftware.b4a.objects.LabelWrapper _usercategory = null;
public anywheresoftware.b4a.objects.LabelWrapper _usercertdate = null;
public anywheresoftware.b4a.objects.LabelWrapper _usercertificate = null;
public anywheresoftware.b4a.objects.LabelWrapper _username = null;
public anywheresoftware.b4a.objects.LabelWrapper _usernotes = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _userphoto = null;
public anywheresoftware.b4a.objects.PanelWrapper _userspanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _usertagcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _uservehicle = null;
public anywheresoftware.b4a.objects.LabelWrapper _uservehicleplate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _usershowcertificate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlistnotconfirm = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlistconfirm = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butequipsearch = null;
public b4a.example3.customlistview _listdocuments = null;
public b4a.example3.customlistview _listequipments = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butwarehouses = null;
public com.jakes.menuonviews.menuonanyview _mpopmenu = null;
public com.jakes.menuonviews.menuonanyview _mdocpopmenu = null;
public com.jakes.menuonviews.menuonanyview _meqippopmenu = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butdocfilter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butequipfilter = null;
public anywheresoftware.b4a.objects.collections.List _userdocuments = null;
public anywheresoftware.b4a.objects.collections.List _userequipments = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcarrunning = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public static int _currentequipitem = 0;
public static int _totallineitems = 0;
public static int _currentdocitem = 0;
public static int _currentgroupitem = 0;
public static int _pnlgroupcurrenindex = 0;
public anywheresoftware.b4a.objects.LabelWrapper _usercompany = null;
public xevolution.vrcg.devdemov2400.expandedlistview _userlistview = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouptitle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupcollpseexpand = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgrouptitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroupexpanded = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgrplinechange = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplinevalidate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplinedesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplinemodel = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplineserial = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplineplate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butuserunavailable = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editequipsearch = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgrplineremove = null;
public static boolean _confirmproducts = false;
public static int _productstoconfirm = 0;
public static boolean _firstdataload = false;
public anywheresoftware.b4a.objects.ButtonWrapper _butuserconfirmdata = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _secondpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupceadd = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdocview = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdates = null;
public anywheresoftware.b4a.objects.LabelWrapper _listiteminformation = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemrefresh = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemcategory = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdocbutton = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemnotes = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemreference = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtitle = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemqtd = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemminqtd = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemprice = null;
public static String _view_itemuserauto = "";
public static String _view_itemuserautoline = "";
public static String _view_itemuserequipment = "";
public static String _view_listcollapsegroup_userequip = "";
public static String _view_listcollapsegroup_userregister = "";
public static String _view_itemuserregister = "";
public xevolution.vrcg.devdemov2400.appdialogs _dialoglogin = null;
public anywheresoftware.b4a.objects.LabelWrapper _usercode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonactionpause = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupuregisteradd = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplinecode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblgrouplinename = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlgroupexpanded4 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butgroupcarchange = null;
public xevolution.vrcg.devdemov2400.types._autoidentification _currentcarid = null;
public xevolution.vrcg.devdemov2400.types._carobject _currentcarobject = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showimageview = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butuserpauseaction = null;
public anywheresoftware.b4a.objects.PanelWrapper _userdocumentsviewlayoutpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _userequipmentsviewlayoutpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _menupanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupaneluserbutton = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupaneldocsbuttom = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupanelconsumablesbutton = null;
public anywheresoftware.b4a.objects.ButtonWrapper _menupaneloperatorsbutton = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public static boolean _isfirsttime = false;
public anywheresoftware.b4a.objects.LabelWrapper _userlabelfoto = null;
public anywheresoftware.b4a.objects.LabelWrapper _userlabelnome = null;
public anywheresoftware.b4a.objects.LabelWrapper _userlabelorganizacao = null;
public anywheresoftware.b4a.objects.LabelWrapper _userlabelcategoria = null;
public anywheresoftware.b4a.objects.LabelWrapper _userlabelcodigouser = null;
public static String _userwarehouse = "";
public anywheresoftware.b4a.objects.ButtonWrapper _buttonlistaddaccion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butuserestadoaction = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butuserstopwork = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butuserstartwork = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblestadouserjornada = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextjustificacaormj = null;
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
public xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public xevolution.vrcg.devdemov2400.types _types = null;
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static String  _returnfromclai() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "returnfromclai", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "returnfromclai", null));}
RDebugUtils.currentLine=198443008;
 //BA.debugLineNum = 198443008;BA.debugLine="Sub ReturnFromCLAI";
RDebugUtils.currentLine=198443009;
 //BA.debugLineNum = 198443009;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=198443010;
 //BA.debugLineNum = 198443010;BA.debugLine="End Sub";
return "";
}
public static String  _changeuserequipment(String _oldtagcode,String _newtagcode) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changeuserequipment", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changeuserequipment", new Object[] {_oldtagcode,_newtagcode}));}
RDebugUtils.currentLine=196280320;
 //BA.debugLineNum = 196280320;BA.debugLine="Sub ChangeUserEquipment(oldtagcode As String, newt";
RDebugUtils.currentLine=196280321;
 //BA.debugLineNum = 196280321;BA.debugLine="If oldtagcode = \"\" Then";
if ((_oldtagcode).equals("")) { 
RDebugUtils.currentLine=196280322;
 //BA.debugLineNum = 196280322;BA.debugLine="DBStructures.insertUserEquipment(ShareCode.SESS_";
mostCurrent._dbstructures._insertuserequipment /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_user /*String*/ ,_newtagcode);
 }else {
RDebugUtils.currentLine=196280324;
 //BA.debugLineNum = 196280324;BA.debugLine="DBStructures.updateUserEquipment(ShareCode.SESS_";
mostCurrent._dbstructures._updateuserequipment /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_user /*String*/ ,_newtagcode,_oldtagcode);
 };
RDebugUtils.currentLine=196280327;
 //BA.debugLineNum = 196280327;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
_createuserdetailsdata(anywheresoftware.b4a.keywords.Common.True,mostCurrent._currentcarid);
RDebugUtils.currentLine=196280329;
 //BA.debugLineNum = 196280329;BA.debugLine="End Sub";
return "";
}
public static void  _setloginregister(String _uname,String _upass) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setloginregister", false))
	 {Debug.delegate(mostCurrent.activityBA, "setloginregister", new Object[] {_uname,_upass}); return;}
ResumableSub_SetLoginRegister rsub = new ResumableSub_SetLoginRegister(null,_uname,_upass);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetLoginRegister extends BA.ResumableSub {
public ResumableSub_SetLoginRegister(xevolution.vrcg.devdemov2400.user parent,String _uname,String _upass) {
this.parent = parent;
this._uname = _uname;
this._upass = _upass;
}
xevolution.vrcg.devdemov2400.user parent;
String _uname;
String _upass;
boolean _ok = false;
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sqlscript = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.List _insertlist = null;
int _i = 0;
boolean _callagain = false;
String _sccommand = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _confuser = "";
String _resultstr = "";
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _active = 0;
anywheresoftware.b4a.objects.collections.Map _userin = null;
String _name = "";
String _tagcode = "";
String _warehouse = "";
String _update_at = "";
int _available = 0;
int _pwdrequest = 0;
anywheresoftware.b4a.objects.collections.Map _tech = null;
anywheresoftware.b4a.objects.collections.Map _utech = null;
anywheresoftware.b4a.objects.collections.Map _udtech = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _recordtech = null;
String _datacheck = "";
int _gravalocal = 0;
anywheresoftware.b4a.objects.collections.Map _insertlistm = null;
String _tgcode = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=198180866;
 //BA.debugLineNum = 198180866;BA.debugLine="Dim OK As Boolean = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=198180867;
 //BA.debugLineNum = 198180867;BA.debugLine="ShareCode.APP_URL  = $\"https://${ShareCode.APP_DO";
parent.mostCurrent._sharecode._app_url /*String*/  = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/");
RDebugUtils.currentLine=198180872;
 //BA.debugLineNum = 198180872;BA.debugLine="If ((uname <> \"\") And (upass <> \"\")) Then";
if (true) break;

case 1:
//if
this.state = 128;
if ((((_uname).equals("") == false) && ((_upass).equals("") == false))) { 
this.state = 3;
}else {
this.state = 127;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=198180873;
 //BA.debugLineNum = 198180873;BA.debugLine="If (uname <> ShareCode.SESS_UWDUKEY) Then";
if (true) break;

case 4:
//if
this.state = 125;
if (((_uname).equals(parent.mostCurrent._sharecode._sess_uwdukey /*String*/ ) == false)) { 
this.state = 6;
}else {
this.state = 124;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=198180874;
 //BA.debugLineNum = 198180874;BA.debugLine="If ShareCode.APP_WORKING_LOCAL Then";
if (true) break;

case 7:
//if
this.state = 122;
if (parent.mostCurrent._sharecode._app_working_local /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 33;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=198180876;
 //BA.debugLineNum = 198180876;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=198180877;
 //BA.debugLineNum = 198180877;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=198180878;
 //BA.debugLineNum = 198180878;BA.debugLine="Dim SQLScript As String = $\"Select name, tagco";
_sqlscript = ("Select name, tagcode, warehouse, available from User where username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"' and password='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_upass))+"'");
RDebugUtils.currentLine=198180879;
 //BA.debugLineNum = 198180879;BA.debugLine="Record = Starter.LocalSQL.ExecQuery(SQLScript)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlscript)));
RDebugUtils.currentLine=198180880;
 //BA.debugLineNum = 198180880;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 10:
//if
this.state = 31;
if (_record.getRowCount()>0) { 
this.state = 12;
}else {
this.state = 26;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=198180881;
 //BA.debugLineNum = 198180881;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=198180882;
 //BA.debugLineNum = 198180882;BA.debugLine="If (Record.GetString(\"name\") <> \"\") Then";
if (true) break;

case 13:
//if
this.state = 24;
if (((_record.GetString("name")).equals("") == false)) { 
this.state = 15;
}else {
this.state = 23;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=198180885;
 //BA.debugLineNum = 198180885;BA.debugLine="If Not(Utils.DBDataExists(Starter.LocalSQLWR";
if (true) break;

case 16:
//if
this.state = 21;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._dbdataexists /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,("select * from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._starter._localsessioncode /*String*/ ))+"' and username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"'")))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=198180886;
 //BA.debugLineNum = 198180886;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=198180887;
 //BA.debugLineNum = 198180887;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=198180888;
 //BA.debugLineNum = 198180888;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=198180889;
 //BA.debugLineNum = 198180889;BA.debugLine="params.Put(\"session\", Starter.LocalSessionC";
_params.Put((Object)("session"),(Object)(parent.mostCurrent._starter._localsessioncode /*String*/ ));
RDebugUtils.currentLine=198180890;
 //BA.debugLineNum = 198180890;BA.debugLine="params.Put(\"username\", uname)";
_params.Put((Object)("username"),(Object)(_uname));
RDebugUtils.currentLine=198180891;
 //BA.debugLineNum = 198180891;BA.debugLine="params.Put(\"tagcode\", Record.GetString(\"tag";
_params.Put((Object)("tagcode"),(Object)(_record.GetString("tagcode")));
RDebugUtils.currentLine=198180892;
 //BA.debugLineNum = 198180892;BA.debugLine="params.Put(\"name\", Record.GetString(\"name\")";
_params.Put((Object)("name"),(Object)(_record.GetString("name")));
RDebugUtils.currentLine=198180893;
 //BA.debugLineNum = 198180893;BA.debugLine="params.Put(\"active\", 1)";
_params.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=198180894;
 //BA.debugLineNum = 198180894;BA.debugLine="params.Put(\"login\", 0)";
_params.Put((Object)("login"),(Object)(0));
RDebugUtils.currentLine=198180895;
 //BA.debugLineNum = 198180895;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198180896;
 //BA.debugLineNum = 198180896;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=198180897;
 //BA.debugLineNum = 198180897;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=198180898;
 //BA.debugLineNum = 198180898;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"lo";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_userssession",_insertlist);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=198180900;
 //BA.debugLineNum = 198180900;BA.debugLine="MsgboxAsync(ShareCode.userAlreadyRegistered";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useralreadyregistered /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=198180903;
 //BA.debugLineNum = 198180903;BA.debugLine="MsgboxAsync(ShareCode.userIncorrectInfo, Sha";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userincorrectinfo /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
 if (true) break;

case 24:
//C
this.state = 31;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=198180906;
 //BA.debugLineNum = 198180906;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.userInvalidL";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userinvalidlogin /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=198180907;
 //BA.debugLineNum = 198180907;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=198180908;
 //BA.debugLineNum = 198180908;BA.debugLine="DialogLogin.getLoginDialog2(\"User\")";
parent.mostCurrent._dialoglogin._getlogindialog2 /*void*/ (null,(Object)("User"));
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 122;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=198180912;
 //BA.debugLineNum = 198180912;BA.debugLine="If Not(Utils.DBDataExists(Starter.LocalSQLWRK,";
if (true) break;

case 34:
//if
this.state = 121;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._dbdataexists /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,("select * from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._starter._localsessioncode /*String*/ ))+"' and username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"'")))) { 
this.state = 36;
}else {
this.state = 120;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=198180915;
 //BA.debugLineNum = 198180915;BA.debugLine="Dim CallAgain As Boolean = False";
_callagain = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=198180917;
 //BA.debugLineNum = 198180917;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=198180918;
 //BA.debugLineNum = 198180918;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=198180919;
 //BA.debugLineNum = 198180919;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=198180920;
 //BA.debugLineNum = 198180920;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=198180921;
 //BA.debugLineNum = 198180921;BA.debugLine="params.Put(\"_user\", uname)";
_params.Put((Object)("_user"),(Object)(_uname));
RDebugUtils.currentLine=198180922;
 //BA.debugLineNum = 198180922;BA.debugLine="params.Put(\"_key\", upass)";
_params.Put((Object)("_key"),(Object)(_upass));
RDebugUtils.currentLine=198180923;
 //BA.debugLineNum = 198180923;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagc";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=198180924;
 //BA.debugLineNum = 198180924;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAutho";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=198180925;
 //BA.debugLineNum = 198180925;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=198180926;
 //BA.debugLineNum = 198180926;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=198180927;
 //BA.debugLineNum = 198180927;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=198180928;
 //BA.debugLineNum = 198180928;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMa";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=198180929;
 //BA.debugLineNum = 198180929;BA.debugLine="Dim sccommand As String = $\"username='${uname";
_sccommand = ("username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"', password='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_upass))+"'");
RDebugUtils.currentLine=198180930;
 //BA.debugLineNum = 198180930;BA.debugLine="Log(sccommand)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180930",_sccommand,0);
RDebugUtils.currentLine=198180932;
 //BA.debugLineNum = 198180932;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=198180933;
 //BA.debugLineNum = 198180933;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=198180934;
 //BA.debugLineNum = 198180934;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=198180935;
 //BA.debugLineNum = 198180935;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180935",_data,0);
RDebugUtils.currentLine=198180936;
 //BA.debugLineNum = 198180936;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=198180937;
 //BA.debugLineNum = 198180937;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",user.getObject());
RDebugUtils.currentLine=198180940;
 //BA.debugLineNum = 198180940;BA.debugLine="Dim ConfUser As String = ShareCode.APP_URL &";
_confuser = parent.mostCurrent._sharecode._app_url /*String*/ +parent.mostCurrent._sharecode._app_confirmuser /*String*/ ;
RDebugUtils.currentLine=198180941;
 //BA.debugLineNum = 198180941;BA.debugLine="Log(ConfUser)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180941",_confuser,0);
RDebugUtils.currentLine=198180942;
 //BA.debugLineNum = 198180942;BA.debugLine="Job.PostString(ConfUser, data )";
_job._poststring /*String*/ (null,_confuser,_data);
RDebugUtils.currentLine=198180943;
 //BA.debugLineNum = 198180943;BA.debugLine="Job.GetRequest.SetContentType(\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=198180945;
 //BA.debugLineNum = 198180945;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"), (Object)(_job));
this.state = 132;
return;
case 132:
//C
this.state = 37;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=198180946;
 //BA.debugLineNum = 198180946;BA.debugLine="If Job.Success Then";
if (true) break;

case 37:
//if
this.state = 114;
if (_job._success /*boolean*/ ) { 
this.state = 39;
}else {
this.state = 105;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=198180948;
 //BA.debugLineNum = 198180948;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180948",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=198180949;
 //BA.debugLineNum = 198180949;BA.debugLine="Dim ResultStr As String = Job.GetString";
_resultstr = _job._getstring /*String*/ (null);
RDebugUtils.currentLine=198180950;
 //BA.debugLineNum = 198180950;BA.debugLine="Log(\"=======================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180950","================================================================",0);
RDebugUtils.currentLine=198180951;
 //BA.debugLineNum = 198180951;BA.debugLine="Log(\"                          AUTENTICAÇÃO";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180951","                          AUTENTICAÇÃO                          ",0);
RDebugUtils.currentLine=198180952;
 //BA.debugLineNum = 198180952;BA.debugLine="Log(\"=======================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180952","================================================================",0);
RDebugUtils.currentLine=198180953;
 //BA.debugLineNum = 198180953;BA.debugLine="Log(ResultStr)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180953",_resultstr,0);
RDebugUtils.currentLine=198180954;
 //BA.debugLineNum = 198180954;BA.debugLine="Log(\"=======================================";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180954","================================================================",0);
RDebugUtils.currentLine=198180956;
 //BA.debugLineNum = 198180956;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=198180957;
 //BA.debugLineNum = 198180957;BA.debugLine="If (Starter.StrFunc.Left(ResultStr, 1) = \"[\"";
if (true) break;

case 40:
//if
this.state = 43;
if (((parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv6(_resultstr,(long) (1))).equals("["))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=198180958;
 //BA.debugLineNum = 198180958;BA.debugLine="ResultStr = Starter.StrFunc.Trim(Starter.St";
_resultstr = parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvvvvv4(parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvvv5(_resultstr,(int) (2),(int) (parent.mostCurrent._starter._strfunc /*adr.stringfunctions.stringfunctions*/ ._vvv7(_resultstr)-1)));
 if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=198180960;
 //BA.debugLineNum = 198180960;BA.debugLine="JSON1.Initialize(ResultStr)";
_json1.Initialize(_resultstr);
RDebugUtils.currentLine=198180961;
 //BA.debugLineNum = 198180961;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=198180962;
 //BA.debugLineNum = 198180962;BA.debugLine="Dim Active As Int = MapJSON.Get(\"status\")";
_active = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("status"))));
RDebugUtils.currentLine=198180964;
 //BA.debugLineNum = 198180964;BA.debugLine="If (Active = 1) Then";
if (true) break;

case 44:
//if
this.state = 103;
if ((_active==1)) { 
this.state = 46;
}else {
this.state = 94;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=198180970;
 //BA.debugLineNum = 198180970;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=198180971;
 //BA.debugLineNum = 198180971;BA.debugLine="Dim UserIn As Map = MapJSON.Get(\"user\")";
_userin = new anywheresoftware.b4a.objects.collections.Map();
_userin = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("user"))));
RDebugUtils.currentLine=198180972;
 //BA.debugLineNum = 198180972;BA.debugLine="Dim Name As String = UserIn.Get(\"title\")";
_name = BA.ObjectToString(_userin.Get((Object)("title")));
RDebugUtils.currentLine=198180973;
 //BA.debugLineNum = 198180973;BA.debugLine="Dim Tagcode As String = UserIn.Get(\"tagcode";
_tagcode = BA.ObjectToString(_userin.Get((Object)("tagcode")));
RDebugUtils.currentLine=198180974;
 //BA.debugLineNum = 198180974;BA.debugLine="Dim WareHouse As String = Utils.IfNullOrEmp";
_warehouse = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_userin.Get((Object)("warehouse"))),"");
RDebugUtils.currentLine=198180975;
 //BA.debugLineNum = 198180975;BA.debugLine="Dim update_at As String = Utils.IfNullOrEmp";
_update_at = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_userin.Get((Object)("update_at"))),"");
RDebugUtils.currentLine=198180976;
 //BA.debugLineNum = 198180976;BA.debugLine="Dim Available As Int = UserIn.Get(\"availabl";
_available = (int)(BA.ObjectToNumber(_userin.Get((Object)("available"))));
RDebugUtils.currentLine=198180977;
 //BA.debugLineNum = 198180977;BA.debugLine="Dim pwdrequest As Int = UserIn.Get(\"pwdrequ";
_pwdrequest = (int)(BA.ObjectToNumber(_userin.Get((Object)("pwdrequest"))));
RDebugUtils.currentLine=198180979;
 //BA.debugLineNum = 198180979;BA.debugLine="Dim tech As Map = MapJSON.Get(\"tech\")";
_tech = new anywheresoftware.b4a.objects.collections.Map();
_tech = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("tech"))));
RDebugUtils.currentLine=198180980;
 //BA.debugLineNum = 198180980;BA.debugLine="Dim utech As Map = MapJSON.Get(\"utech\")";
_utech = new anywheresoftware.b4a.objects.collections.Map();
_utech = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("utech"))));
RDebugUtils.currentLine=198180981;
 //BA.debugLineNum = 198180981;BA.debugLine="Dim udtech As Map = MapJSON.Get(\"udtech\")";
_udtech = new anywheresoftware.b4a.objects.collections.Map();
_udtech = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mapjson.Get((Object)("udtech"))));
RDebugUtils.currentLine=198180982;
 //BA.debugLineNum = 198180982;BA.debugLine="Private RecordTech As Cursor";
_recordtech = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=198180983;
 //BA.debugLineNum = 198180983;BA.debugLine="RecordTech = Starter.LocalSQLEVC.ExecQuery(";
_recordtech = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("Select * from dta_technicals where username='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_uname))+"'"))));
RDebugUtils.currentLine=198180984;
 //BA.debugLineNum = 198180984;BA.debugLine="If RecordTech.RowCount > 0 Then";
if (true) break;

case 47:
//if
this.state = 92;
if (_recordtech.getRowCount()>0) { 
this.state = 49;
}else {
this.state = 73;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=198180985;
 //BA.debugLineNum = 198180985;BA.debugLine="RecordTech.Position = 0";
_recordtech.setPosition((int) (0));
RDebugUtils.currentLine=198180986;
 //BA.debugLineNum = 198180986;BA.debugLine="Log(\"... Updating\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180986","... Updating",0);
RDebugUtils.currentLine=198180987;
 //BA.debugLineNum = 198180987;BA.debugLine="Dim datacheck As String = RecordTech.GetSt";
_datacheck = _recordtech.GetString("updated_at");
RDebugUtils.currentLine=198180988;
 //BA.debugLineNum = 198180988;BA.debugLine="Dim GravaLocal As Int = 0";
_gravalocal = (int) (0);
RDebugUtils.currentLine=198180989;
 //BA.debugLineNum = 198180989;BA.debugLine="If (Utils.IfNullOrEmpty(datacheck, \"\") <>";
if (true) break;

case 50:
//if
this.state = 71;
if (((parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_datacheck,"")).equals(_update_at) == false)) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=198180990;
 //BA.debugLineNum = 198180990;BA.debugLine="Log(\"... Make update\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6198180990","... Make update",0);
RDebugUtils.currentLine=198180991;
 //BA.debugLineNum = 198180991;BA.debugLine="Dim InsertListm As Map";
_insertlistm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=198180992;
 //BA.debugLineNum = 198180992;BA.debugLine="InsertListm.Initialize";
_insertlistm.Initialize();
RDebugUtils.currentLine=198180993;
 //BA.debugLineNum = 198180993;BA.debugLine="InsertListm.Put(\"username\", uname)";
_insertlistm.Put((Object)("username"),(Object)(_uname));
RDebugUtils.currentLine=198180994;
 //BA.debugLineNum = 198180994;BA.debugLine="Try";
if (true) break;

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
RDebugUtils.currentLine=198180996;
 //BA.debugLineNum = 198180996;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.Local";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_technicals",_tech,_insertlistm,_uname,"");
RDebugUtils.currentLine=198180997;
 //BA.debugLineNum = 198180997;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"),(int) (100));
this.state = 133;
return;
case 133:
//C
this.state = 58;
;
RDebugUtils.currentLine=198180998;
 //BA.debugLineNum = 198180998;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
RDebugUtils.currentLine=198181000;
 //BA.debugLineNum = 198181000;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181000",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=198181001;
 //BA.debugLineNum = 198181001;BA.debugLine="Utils.logError(\"Actualizar Técnicos\", Sh";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Actualizar Técnicos",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 58:
//C
this.state = 59;
this.catchState = 0;
;
RDebugUtils.currentLine=198181004;
 //BA.debugLineNum = 198181004;BA.debugLine="Dim tgcode As String = tech.Get(\"user_tag";
_tgcode = BA.ObjectToString(_tech.Get((Object)("user_tagcode")));
RDebugUtils.currentLine=198181006;
 //BA.debugLineNum = 198181006;BA.debugLine="Dim InsertListm As Map";
_insertlistm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=198181007;
 //BA.debugLineNum = 198181007;BA.debugLine="InsertListm.Initialize";
_insertlistm.Initialize();
RDebugUtils.currentLine=198181008;
 //BA.debugLineNum = 198181008;BA.debugLine="InsertListm.Put(\"tagcode\", tgcode)";
_insertlistm.Put((Object)("tagcode"),(Object)(_tgcode));
RDebugUtils.currentLine=198181009;
 //BA.debugLineNum = 198181009;BA.debugLine="Try";
if (true) break;

case 59:
//try
this.state = 64;
this.catchState = 63;
this.state = 61;
if (true) break;

case 61:
//C
this.state = 64;
this.catchState = 63;
RDebugUtils.currentLine=198181011;
 //BA.debugLineNum = 198181011;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.Local";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"aut_users",_utech,_insertlistm,_uname,"");
RDebugUtils.currentLine=198181012;
 //BA.debugLineNum = 198181012;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"),(int) (100));
this.state = 134;
return;
case 134:
//C
this.state = 64;
;
RDebugUtils.currentLine=198181013;
 //BA.debugLineNum = 198181013;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 63:
//C
this.state = 64;
this.catchState = 0;
RDebugUtils.currentLine=198181015;
 //BA.debugLineNum = 198181015;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181015",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=198181016;
 //BA.debugLineNum = 198181016;BA.debugLine="Utils.logError(\"Actualizar Utilizadores\"";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Actualizar Utilizadores",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 64:
//C
this.state = 65;
this.catchState = 0;
;
RDebugUtils.currentLine=198181019;
 //BA.debugLineNum = 198181019;BA.debugLine="Dim InsertListm As Map";
_insertlistm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=198181020;
 //BA.debugLineNum = 198181020;BA.debugLine="InsertListm.Initialize";
_insertlistm.Initialize();
RDebugUtils.currentLine=198181021;
 //BA.debugLineNum = 198181021;BA.debugLine="InsertListm.Put(\"user_tagcode\", tgcode)";
_insertlistm.Put((Object)("user_tagcode"),(Object)(_tgcode));
RDebugUtils.currentLine=198181022;
 //BA.debugLineNum = 198181022;BA.debugLine="Try";
if (true) break;

case 65:
//try
this.state = 70;
this.catchState = 69;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 70;
this.catchState = 69;
RDebugUtils.currentLine=198181024;
 //BA.debugLineNum = 198181024;BA.debugLine="Utils.UpdateRecord2WithLog(Starter.Local";
parent.mostCurrent._utils._updaterecord2withlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"aut_users_details",_udtech,_insertlistm,_uname,"");
RDebugUtils.currentLine=198181025;
 //BA.debugLineNum = 198181025;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"),(int) (100));
this.state = 135;
return;
case 135:
//C
this.state = 70;
;
RDebugUtils.currentLine=198181026;
 //BA.debugLineNum = 198181026;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 69:
//C
this.state = 70;
this.catchState = 0;
RDebugUtils.currentLine=198181028;
 //BA.debugLineNum = 198181028;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181028",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=198181029;
 //BA.debugLineNum = 198181029;BA.debugLine="Utils.logError(\"Actualizar Detalhes Util";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Actualizar Detalhes Utilizador",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 70:
//C
this.state = 71;
this.catchState = 0;
;
 if (true) break;

case 71:
//C
this.state = 92;
;
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=198181034;
 //BA.debugLineNum = 198181034;BA.debugLine="Log(\"... Inserting\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181034","... Inserting",0);
RDebugUtils.currentLine=198181035;
 //BA.debugLineNum = 198181035;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198181036;
 //BA.debugLineNum = 198181036;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=198181037;
 //BA.debugLineNum = 198181037;BA.debugLine="InsertList.Add(tech)";
_insertlist.Add((Object)(_tech.getObject()));
RDebugUtils.currentLine=198181038;
 //BA.debugLineNum = 198181038;BA.debugLine="Try";
if (true) break;

case 74:
//try
this.state = 79;
this.catchState = 78;
this.state = 76;
if (true) break;

case 76:
//C
this.state = 79;
this.catchState = 78;
RDebugUtils.currentLine=198181039;
 //BA.debugLineNum = 198181039;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_technicals",_insertlist);
RDebugUtils.currentLine=198181040;
 //BA.debugLineNum = 198181040;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"),(int) (100));
this.state = 136;
return;
case 136:
//C
this.state = 79;
;
RDebugUtils.currentLine=198181041;
 //BA.debugLineNum = 198181041;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 78:
//C
this.state = 79;
this.catchState = 0;
RDebugUtils.currentLine=198181043;
 //BA.debugLineNum = 198181043;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181043",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=198181044;
 //BA.debugLineNum = 198181044;BA.debugLine="Utils.logError(\"Inserir Técnicos\", ShareC";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Técnicos",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
this.catchState = 0;
;
RDebugUtils.currentLine=198181048;
 //BA.debugLineNum = 198181048;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198181049;
 //BA.debugLineNum = 198181049;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=198181050;
 //BA.debugLineNum = 198181050;BA.debugLine="InsertList.Add(utech)";
_insertlist.Add((Object)(_utech.getObject()));
RDebugUtils.currentLine=198181051;
 //BA.debugLineNum = 198181051;BA.debugLine="Try";
if (true) break;

case 80:
//try
this.state = 85;
this.catchState = 84;
this.state = 82;
if (true) break;

case 82:
//C
this.state = 85;
this.catchState = 84;
RDebugUtils.currentLine=198181052;
 //BA.debugLineNum = 198181052;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"aut_users",_insertlist);
RDebugUtils.currentLine=198181053;
 //BA.debugLineNum = 198181053;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"),(int) (100));
this.state = 137;
return;
case 137:
//C
this.state = 85;
;
RDebugUtils.currentLine=198181054;
 //BA.debugLineNum = 198181054;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 84:
//C
this.state = 85;
this.catchState = 0;
RDebugUtils.currentLine=198181056;
 //BA.debugLineNum = 198181056;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181056",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=198181057;
 //BA.debugLineNum = 198181057;BA.debugLine="Utils.logError(\"Inserir Utilizadores\", Sh";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Utilizadores",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 85:
//C
this.state = 86;
this.catchState = 0;
;
RDebugUtils.currentLine=198181060;
 //BA.debugLineNum = 198181060;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198181061;
 //BA.debugLineNum = 198181061;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=198181062;
 //BA.debugLineNum = 198181062;BA.debugLine="InsertList.Add(udtech)";
_insertlist.Add((Object)(_udtech.getObject()));
RDebugUtils.currentLine=198181063;
 //BA.debugLineNum = 198181063;BA.debugLine="Try";
if (true) break;

case 86:
//try
this.state = 91;
this.catchState = 90;
this.state = 88;
if (true) break;

case 88:
//C
this.state = 91;
this.catchState = 90;
RDebugUtils.currentLine=198181064;
 //BA.debugLineNum = 198181064;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"aut_users_details",_insertlist);
RDebugUtils.currentLine=198181065;
 //BA.debugLineNum = 198181065;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "setloginregister"),(int) (100));
this.state = 138;
return;
case 138:
//C
this.state = 91;
;
RDebugUtils.currentLine=198181066;
 //BA.debugLineNum = 198181066;BA.debugLine="GravaLocal = GravaLocal +1";
_gravalocal = (int) (_gravalocal+1);
 if (true) break;

case 90:
//C
this.state = 91;
this.catchState = 0;
RDebugUtils.currentLine=198181068;
 //BA.debugLineNum = 198181068;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198181068",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=198181069;
 //BA.debugLineNum = 198181069;BA.debugLine="Utils.logError(\"Inserir Detalhes Utilizad";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Inserir Detalhes Utilizador",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
;
 if (true) break;

case 92:
//C
this.state = 103;
;
RDebugUtils.currentLine=198181072;
 //BA.debugLineNum = 198181072;BA.debugLine="RecordTech.Close";
_recordtech.Close();
RDebugUtils.currentLine=198181074;
 //BA.debugLineNum = 198181074;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=198181075;
 //BA.debugLineNum = 198181075;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=198181076;
 //BA.debugLineNum = 198181076;BA.debugLine="params.Put(\"session\", Starter.LocalSessionC";
_params.Put((Object)("session"),(Object)(parent.mostCurrent._starter._localsessioncode /*String*/ ));
RDebugUtils.currentLine=198181077;
 //BA.debugLineNum = 198181077;BA.debugLine="params.Put(\"username\", uname)";
_params.Put((Object)("username"),(Object)(_uname));
RDebugUtils.currentLine=198181078;
 //BA.debugLineNum = 198181078;BA.debugLine="params.Put(\"tagcode\", Tagcode)";
_params.Put((Object)("tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=198181079;
 //BA.debugLineNum = 198181079;BA.debugLine="params.Put(\"name\", Name)";
_params.Put((Object)("name"),(Object)(_name));
RDebugUtils.currentLine=198181080;
 //BA.debugLineNum = 198181080;BA.debugLine="params.Put(\"active\", 1)";
_params.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=198181081;
 //BA.debugLineNum = 198181081;BA.debugLine="Dim InsertList As List";
_insertlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198181082;
 //BA.debugLineNum = 198181082;BA.debugLine="InsertList.Initialize";
_insertlist.Initialize();
RDebugUtils.currentLine=198181083;
 //BA.debugLineNum = 198181083;BA.debugLine="InsertList.Add(params)";
_insertlist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=198181084;
 //BA.debugLineNum = 198181084;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLWRK, \"lo";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,"loc_userssession",_insertlist);
RDebugUtils.currentLine=198181086;
 //BA.debugLineNum = 198181086;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=198181088;
 //BA.debugLineNum = 198181088;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=198181089;
 //BA.debugLineNum = 198181089;BA.debugLine="i = Msgbox2(ShareCode.LoginMessage_NOTOK, S";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginmessage_notok /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=198181090;
 //BA.debugLineNum = 198181090;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 95:
//if
this.state = 102;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 97;
}else 
{RDebugUtils.currentLine=198181092;
 //BA.debugLineNum = 198181092;BA.debugLine="Else If (i=DialogResponse.CANCEL) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) { 
this.state = 99;
}else {
this.state = 101;
}}
if (true) break;

case 97:
//C
this.state = 102;
RDebugUtils.currentLine=198181091;
 //BA.debugLineNum = 198181091;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 99:
//C
this.state = 102;
RDebugUtils.currentLine=198181093;
 //BA.debugLineNum = 198181093;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=198181096;
 //BA.debugLineNum = 198181096;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 102:
//C
this.state = 103;
;
 if (true) break;

case 103:
//C
this.state = 114;
;
 if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=198181101;
 //BA.debugLineNum = 198181101;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=198181102;
 //BA.debugLineNum = 198181102;BA.debugLine="i = Msgbox2(ShareCode.LoginServerError, Shar";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._loginservererror /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),parent.mostCurrent._sharecode._option_try /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=198181103;
 //BA.debugLineNum = 198181103;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 106:
//if
this.state = 113;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 108;
}else 
{RDebugUtils.currentLine=198181106;
 //BA.debugLineNum = 198181106;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
this.state = 110;
}else 
{RDebugUtils.currentLine=198181108;
 //BA.debugLineNum = 198181108;BA.debugLine="Else If (i=DialogResponse.CANCEL) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL)) { 
this.state = 112;
}}}
if (true) break;

case 108:
//C
this.state = 113;
RDebugUtils.currentLine=198181104;
 //BA.debugLineNum = 198181104;BA.debugLine="OK = True";
_ok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=198181105;
 //BA.debugLineNum = 198181105;BA.debugLine="CallAgain = True";
_callagain = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 110:
//C
this.state = 113;
RDebugUtils.currentLine=198181107;
 //BA.debugLineNum = 198181107;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 112:
//C
this.state = 113;
RDebugUtils.currentLine=198181109;
 //BA.debugLineNum = 198181109;BA.debugLine="OK = False";
_ok = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 113:
//C
this.state = 114;
;
 if (true) break;

case 114:
//C
this.state = 115;
;
RDebugUtils.currentLine=198181112;
 //BA.debugLineNum = 198181112;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=198181114;
 //BA.debugLineNum = 198181114;BA.debugLine="If (CallAgain) Then";
if (true) break;

case 115:
//if
this.state = 118;
if ((_callagain)) { 
this.state = 117;
}if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=198181115;
 //BA.debugLineNum = 198181115;BA.debugLine="DialogLogin.getLoginDialog2(\"User\")";
parent.mostCurrent._dialoglogin._getlogindialog2 /*void*/ (null,(Object)("User"));
 if (true) break;

case 118:
//C
this.state = 121;
;
 if (true) break;

case 120:
//C
this.state = 121;
RDebugUtils.currentLine=198181119;
 //BA.debugLineNum = 198181119;BA.debugLine="MsgboxAsync(ShareCode.userAlreadyRegistered,";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useralreadyregistered /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
 if (true) break;

case 121:
//C
this.state = 122;
;
 if (true) break;

case 122:
//C
this.state = 125;
;
 if (true) break;

case 124:
//C
this.state = 125;
RDebugUtils.currentLine=198181124;
 //BA.debugLineNum = 198181124;BA.debugLine="MsgboxAsync(ShareCode.userAlreadyRegistered, Sh";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useralreadyregistered /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
 if (true) break;

case 125:
//C
this.state = 128;
;
 if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=198181127;
 //BA.debugLineNum = 198181127;BA.debugLine="MsgboxAsync(ShareCode.userCodeandPasswordMandato";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usercodeandpasswordmandatory /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalatentiontitle /*String*/ ),processBA);
 if (true) break;
;
RDebugUtils.currentLine=198181130;
 //BA.debugLineNum = 198181130;BA.debugLine="If (OK) Then";

case 128:
//if
this.state = 131;
if ((_ok)) { 
this.state = 130;
}if (true) break;

case 130:
//C
this.state = 131;
RDebugUtils.currentLine=198181142;
 //BA.debugLineNum = 198181142;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
_createuserdetailsdata(anywheresoftware.b4a.keywords.Common.True,parent.mostCurrent._currentcarid);
 if (true) break;

case 131:
//C
this.state = -1;
;
RDebugUtils.currentLine=198181144;
 //BA.debugLineNum = 198181144;BA.debugLine="End Sub";
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
public static String  _setloginregistercancel() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setloginregistercancel", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setloginregistercancel", null));}
RDebugUtils.currentLine=198246400;
 //BA.debugLineNum = 198246400;BA.debugLine="Sub SetLoginRegisterCancel";
RDebugUtils.currentLine=198246402;
 //BA.debugLineNum = 198246402;BA.debugLine="End Sub";
return "";
}
public static String  _quantitydialogreturn(String _code,int _qtd) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "quantitydialogreturn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "quantitydialogreturn", new Object[] {_code,_qtd}));}
String _warehouse = "";
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _qtdlbl = null;
RDebugUtils.currentLine=195493888;
 //BA.debugLineNum = 195493888;BA.debugLine="Sub QuantityDialogReturn(code As String, qtd As In";
RDebugUtils.currentLine=195493889;
 //BA.debugLineNum = 195493889;BA.debugLine="Dim warehouse As String = USERWAREHOUSE";
_warehouse = mostCurrent._userwarehouse;
RDebugUtils.currentLine=195493890;
 //BA.debugLineNum = 195493890;BA.debugLine="DBStructures.updateNotifyUserStock(code, qtd, war";
mostCurrent._dbstructures._updatenotifyuserstock /*String*/ (mostCurrent.activityBA,_code,_qtd,_warehouse);
RDebugUtils.currentLine=195493891;
 //BA.debugLineNum = 195493891;BA.debugLine="Dim pnl As Panel = listEquipments.GetPanel(Curren";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listequipments._getpanel((int) (_currentequipitem-1)).getObject()));
RDebugUtils.currentLine=195493892;
 //BA.debugLineNum = 195493892;BA.debugLine="Dim qtdlbl As Label = pnl.GetView(3)";
_qtdlbl = new anywheresoftware.b4a.objects.LabelWrapper();
_qtdlbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=195493893;
 //BA.debugLineNum = 195493893;BA.debugLine="qtdlbl.Text = qtd";
_qtdlbl.setText(BA.ObjectToCharSequence(_qtd));
RDebugUtils.currentLine=195493895;
 //BA.debugLineNum = 195493895;BA.debugLine="End Sub";
return "";
}
public static void  _makeunavailable2(xevolution.vrcg.devdemov2400.types._unavailable2 _unv) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeunavailable2", false))
	 {Debug.delegate(mostCurrent.activityBA, "makeunavailable2", new Object[] {_unv}); return;}
ResumableSub_MakeUnavailable2 rsub = new ResumableSub_MakeUnavailable2(null,_unv);
rsub.resume(processBA, null);
}
public static class ResumableSub_MakeUnavailable2 extends BA.ResumableSub {
public ResumableSub_MakeUnavailable2(xevolution.vrcg.devdemov2400.user parent,xevolution.vrcg.devdemov2400.types._unavailable2 _unv) {
this.parent = parent;
this._unv = _unv;
}
xevolution.vrcg.devdemov2400.user parent;
xevolution.vrcg.devdemov2400.types._unavailable2 _unv;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=196673537;
 //BA.debugLineNum = 196673537;BA.debugLine="ProgressDialogShow(ShareCode.userAguardeumMomento";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useraguardeummomento /*String*/ ));
RDebugUtils.currentLine=196673539;
 //BA.debugLineNum = 196673539;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196673539","**********************************",0);
RDebugUtils.currentLine=196673540;
 //BA.debugLineNum = 196673540;BA.debugLine="Log(\"	GRAVA INDISPONIBILIDADE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196673540","	GRAVA INDISPONIBILIDADE",0);
RDebugUtils.currentLine=196673541;
 //BA.debugLineNum = 196673541;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196673541","**********************************",0);
RDebugUtils.currentLine=196673542;
 //BA.debugLineNum = 196673542;BA.debugLine="ShareCode.USR_STATE = 0";
parent.mostCurrent._sharecode._usr_state /*int*/  = (int) (0);
RDebugUtils.currentLine=196673543;
 //BA.debugLineNum = 196673543;BA.debugLine="DBStructures.updateUserAvailableState(ShareCode.S";
parent.mostCurrent._dbstructures._updateuseravailablestate /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,parent.mostCurrent._sharecode._usr_state /*int*/ );
RDebugUtils.currentLine=196673544;
 //BA.debugLineNum = 196673544;BA.debugLine="DBStructures.insertUserUnavailable(ShareCode.SESS";
parent.mostCurrent._dbstructures._insertuserunavailable /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,_unv.StartDate /*String*/ ,_unv.EndDate /*String*/ ,_unv.Reason /*String*/ );
RDebugUtils.currentLine=196673546;
 //BA.debugLineNum = 196673546;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196673547;
 //BA.debugLineNum = 196673547;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=196673548;
 //BA.debugLineNum = 196673548;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=196673549;
 //BA.debugLineNum = 196673549;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=196673550;
 //BA.debugLineNum = 196673550;BA.debugLine="params.Put(\"_tagcode\", ShareCode.SESS_OPER_User)";
_params.Put((Object)("_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=196673551;
 //BA.debugLineNum = 196673551;BA.debugLine="params.Put(\"_state\", 0)";
_params.Put((Object)("_state"),(Object)(0));
RDebugUtils.currentLine=196673552;
 //BA.debugLineNum = 196673552;BA.debugLine="params.Put(\"start_date\", unv.StartDate)";
_params.Put((Object)("start_date"),(Object)(_unv.StartDate /*String*/ ));
RDebugUtils.currentLine=196673553;
 //BA.debugLineNum = 196673553;BA.debugLine="params.Put(\"end_date\", unv.EndDate)";
_params.Put((Object)("end_date"),(Object)(_unv.EndDate /*String*/ ));
RDebugUtils.currentLine=196673554;
 //BA.debugLineNum = 196673554;BA.debugLine="params.Put(\"reason\", unv.Reason)";
_params.Put((Object)("reason"),(Object)(_unv.Reason /*String*/ ));
RDebugUtils.currentLine=196673555;
 //BA.debugLineNum = 196673555;BA.debugLine="params.Put(\"cause\", unv.Cause)";
_params.Put((Object)("cause"),(Object)(_unv.Cause /*String*/ ));
RDebugUtils.currentLine=196673556;
 //BA.debugLineNum = 196673556;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=196673557;
 //BA.debugLineNum = 196673557;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=196673558;
 //BA.debugLineNum = 196673558;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=196673559;
 //BA.debugLineNum = 196673559;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=196673560;
 //BA.debugLineNum = 196673560;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=196673561;
 //BA.debugLineNum = 196673561;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=196673562;
 //BA.debugLineNum = 196673562;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=196673563;
 //BA.debugLineNum = 196673563;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196673563","**********************************",0);
RDebugUtils.currentLine=196673564;
 //BA.debugLineNum = 196673564;BA.debugLine="Log(\"	CHAMA API\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196673564","	CHAMA API",0);
RDebugUtils.currentLine=196673565;
 //BA.debugLineNum = 196673565;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196673565","**********************************",0);
RDebugUtils.currentLine=196673568;
 //BA.debugLineNum = 196673568;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/user/available");
RDebugUtils.currentLine=196673569;
 //BA.debugLineNum = 196673569;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=196673570;
 //BA.debugLineNum = 196673570;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"UnavReturn\",";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,user.getObject(),_url,"UnavReturn","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=196673572;
 //BA.debugLineNum = 196673572;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=196673573;
 //BA.debugLineNum = 196673573;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=196673575;
 //BA.debugLineNum = 196673575;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "makeunavailable2"),(int) (250));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=196673577;
 //BA.debugLineNum = 196673577;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_5\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_5",user.getObject());
RDebugUtils.currentLine=196673578;
 //BA.debugLineNum = 196673578;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "makeunavailable2"),(int) (500));
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=196673579;
 //BA.debugLineNum = 196673579;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=196673580;
 //BA.debugLineNum = 196673580;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=196673581;
 //BA.debugLineNum = 196673581;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _cancelunavailable() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cancelunavailable", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cancelunavailable", null));}
RDebugUtils.currentLine=196870144;
 //BA.debugLineNum = 196870144;BA.debugLine="Sub CancelUnavailable";
RDebugUtils.currentLine=196870145;
 //BA.debugLineNum = 196870145;BA.debugLine="Log(\"Canceled\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196870145","Canceled",0);
RDebugUtils.currentLine=196870146;
 //BA.debugLineNum = 196870146;BA.debugLine="End Sub";
return "";
}
public static void  _makeunavailable(xevolution.vrcg.devdemov2400.types._unavailable _unv) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeunavailable", false))
	 {Debug.delegate(mostCurrent.activityBA, "makeunavailable", new Object[] {_unv}); return;}
ResumableSub_MakeUnavailable rsub = new ResumableSub_MakeUnavailable(null,_unv);
rsub.resume(processBA, null);
}
public static class ResumableSub_MakeUnavailable extends BA.ResumableSub {
public ResumableSub_MakeUnavailable(xevolution.vrcg.devdemov2400.user parent,xevolution.vrcg.devdemov2400.types._unavailable _unv) {
this.parent = parent;
this._unv = _unv;
}
xevolution.vrcg.devdemov2400.user parent;
xevolution.vrcg.devdemov2400.types._unavailable _unv;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=196608001;
 //BA.debugLineNum = 196608001;BA.debugLine="ProgressDialogShow(ShareCode.userAguardeumMomento";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useraguardeummomento /*String*/ ));
RDebugUtils.currentLine=196608003;
 //BA.debugLineNum = 196608003;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196608003","**********************************",0);
RDebugUtils.currentLine=196608004;
 //BA.debugLineNum = 196608004;BA.debugLine="Log(\"	GRAVA INDISPONIBILIDADE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196608004","	GRAVA INDISPONIBILIDADE",0);
RDebugUtils.currentLine=196608005;
 //BA.debugLineNum = 196608005;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196608005","**********************************",0);
RDebugUtils.currentLine=196608006;
 //BA.debugLineNum = 196608006;BA.debugLine="ShareCode.USR_STATE = 0";
parent.mostCurrent._sharecode._usr_state /*int*/  = (int) (0);
RDebugUtils.currentLine=196608007;
 //BA.debugLineNum = 196608007;BA.debugLine="DBStructures.updateUserAvailableState(ShareCode.S";
parent.mostCurrent._dbstructures._updateuseravailablestate /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,parent.mostCurrent._sharecode._usr_state /*int*/ );
RDebugUtils.currentLine=196608008;
 //BA.debugLineNum = 196608008;BA.debugLine="DBStructures.insertUserUnavailable(ShareCode.SESS";
parent.mostCurrent._dbstructures._insertuserunavailable /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,_unv.StartDate /*String*/ ,_unv.EndDate /*String*/ ,_unv.Reason /*String*/ );
RDebugUtils.currentLine=196608010;
 //BA.debugLineNum = 196608010;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196608011;
 //BA.debugLineNum = 196608011;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=196608012;
 //BA.debugLineNum = 196608012;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=196608013;
 //BA.debugLineNum = 196608013;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=196608014;
 //BA.debugLineNum = 196608014;BA.debugLine="params.Put(\"_tagcode\", ShareCode.SESS_OPER_User)";
_params.Put((Object)("_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=196608015;
 //BA.debugLineNum = 196608015;BA.debugLine="params.Put(\"_state\", 0)";
_params.Put((Object)("_state"),(Object)(0));
RDebugUtils.currentLine=196608016;
 //BA.debugLineNum = 196608016;BA.debugLine="params.Put(\"start_date\", unv.StartDate)";
_params.Put((Object)("start_date"),(Object)(_unv.StartDate /*String*/ ));
RDebugUtils.currentLine=196608017;
 //BA.debugLineNum = 196608017;BA.debugLine="params.Put(\"end_date\", unv.EndDate)";
_params.Put((Object)("end_date"),(Object)(_unv.EndDate /*String*/ ));
RDebugUtils.currentLine=196608018;
 //BA.debugLineNum = 196608018;BA.debugLine="params.Put(\"reason\", unv.Reason)";
_params.Put((Object)("reason"),(Object)(_unv.Reason /*String*/ ));
RDebugUtils.currentLine=196608019;
 //BA.debugLineNum = 196608019;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=196608020;
 //BA.debugLineNum = 196608020;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=196608021;
 //BA.debugLineNum = 196608021;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=196608022;
 //BA.debugLineNum = 196608022;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=196608023;
 //BA.debugLineNum = 196608023;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=196608024;
 //BA.debugLineNum = 196608024;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=196608025;
 //BA.debugLineNum = 196608025;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=196608026;
 //BA.debugLineNum = 196608026;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196608026","**********************************",0);
RDebugUtils.currentLine=196608027;
 //BA.debugLineNum = 196608027;BA.debugLine="Log(\"	CHAMA API\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196608027","	CHAMA API",0);
RDebugUtils.currentLine=196608028;
 //BA.debugLineNum = 196608028;BA.debugLine="Log(\"**********************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6196608028","**********************************",0);
RDebugUtils.currentLine=196608031;
 //BA.debugLineNum = 196608031;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/user/available");
RDebugUtils.currentLine=196608032;
 //BA.debugLineNum = 196608032;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=196608033;
 //BA.debugLineNum = 196608033;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"UnavReturn\",";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,user.getObject(),_url,"UnavReturn","");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=196608035;
 //BA.debugLineNum = 196608035;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=196608036;
 //BA.debugLineNum = 196608036;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=196608038;
 //BA.debugLineNum = 196608038;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "makeunavailable"),(int) (250));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=196608040;
 //BA.debugLineNum = 196608040;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_5\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_5",user.getObject());
RDebugUtils.currentLine=196608067;
 //BA.debugLineNum = 196608067;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=196608068;
 //BA.debugLineNum = 196608068;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=196608069;
 //BA.debugLineNum = 196608069;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _changeuservehicle(String _oldtagcode,String _newtagcode) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changeuservehicle", false))
	 {Debug.delegate(mostCurrent.activityBA, "changeuservehicle", new Object[] {_oldtagcode,_newtagcode}); return;}
ResumableSub_ChangeUserVehicle rsub = new ResumableSub_ChangeUserVehicle(null,_oldtagcode,_newtagcode);
rsub.resume(processBA, null);
}
public static class ResumableSub_ChangeUserVehicle extends BA.ResumableSub {
public ResumableSub_ChangeUserVehicle(xevolution.vrcg.devdemov2400.user parent,String _oldtagcode,String _newtagcode) {
this.parent = parent;
this._oldtagcode = _oldtagcode;
this._newtagcode = _newtagcode;
}
xevolution.vrcg.devdemov2400.user parent;
String _oldtagcode;
String _newtagcode;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _confuser = "";
String _nsql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _tagcode = "";
String _vehicleplate = "";
String _vehicle = "";
String _vmodel = "";
String _vehicle_tagcode = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=196345858;
 //BA.debugLineNum = 196345858;BA.debugLine="DBStructures.updateUserVehicle(ShareCode.SESS_Use";
parent.mostCurrent._dbstructures._updateuservehicle /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_user /*String*/ ,_newtagcode);
RDebugUtils.currentLine=196345859;
 //BA.debugLineNum = 196345859;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "changeuservehicle"),(int) (200));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=196345861;
 //BA.debugLineNum = 196345861;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=196345862;
 //BA.debugLineNum = 196345862;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=196345863;
 //BA.debugLineNum = 196345863;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=196345864;
 //BA.debugLineNum = 196345864;BA.debugLine="params.Put(\"_token\",ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=196345865;
 //BA.debugLineNum = 196345865;BA.debugLine="params.Put(\"_user\",ShareCode.SESS_OPER_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=196345866;
 //BA.debugLineNum = 196345866;BA.debugLine="params.Put(\"_keyCar\",newtagcode)";
_params.Put((Object)("_keyCar"),(Object)(_newtagcode));
RDebugUtils.currentLine=196345867;
 //BA.debugLineNum = 196345867;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=196345868;
 //BA.debugLineNum = 196345868;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=196345869;
 //BA.debugLineNum = 196345869;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=196345870;
 //BA.debugLineNum = 196345870;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=196345871;
 //BA.debugLineNum = 196345871;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=196345872;
 //BA.debugLineNum = 196345872;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=196345874;
 //BA.debugLineNum = 196345874;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=196345875;
 //BA.debugLineNum = 196345875;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=196345876;
 //BA.debugLineNum = 196345876;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=196345877;
 //BA.debugLineNum = 196345877;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6196345877",_data,0);
RDebugUtils.currentLine=196345878;
 //BA.debugLineNum = 196345878;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=196345879;
 //BA.debugLineNum = 196345879;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",user.getObject());
RDebugUtils.currentLine=196345882;
 //BA.debugLineNum = 196345882;BA.debugLine="Dim ConfUser As String = $\"https://${ShareCode.AP";
_confuser = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/mobile/user/carchange");
RDebugUtils.currentLine=196345883;
 //BA.debugLineNum = 196345883;BA.debugLine="Log(ConfUser)";
anywheresoftware.b4a.keywords.Common.LogImpl("6196345883",_confuser,0);
RDebugUtils.currentLine=196345884;
 //BA.debugLineNum = 196345884;BA.debugLine="Job.PostString(ConfUser, data )";
_job._poststring /*String*/ (null,_confuser,_data);
RDebugUtils.currentLine=196345885;
 //BA.debugLineNum = 196345885;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=196345887;
 //BA.debugLineNum = 196345887;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "changeuservehicle"), (Object)(_job));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=196345888;
 //BA.debugLineNum = 196345888;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=196345889;
 //BA.debugLineNum = 196345889;BA.debugLine="Log($\"Carro alterado: ${newtagcode}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6196345889",("Carro alterado: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newtagcode))+""),0);
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=196345891;
 //BA.debugLineNum = 196345891;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=196345893;
 //BA.debugLineNum = 196345893;BA.debugLine="Dim nSQL As String = $\"Select ifnull(e1.value, ''";
_nsql = ("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,\n"+"			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*\n"+"			from dta_technicals as a\n"+"			left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)\n"+"			left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')\n"+"			left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')\n"+"			left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')\n"+"			left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')\n"+"			where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ))+"'");
RDebugUtils.currentLine=196345902;
 //BA.debugLineNum = 196345902;BA.debugLine="Log(nSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6196345902",_nsql,0);
RDebugUtils.currentLine=196345903;
 //BA.debugLineNum = 196345903;BA.debugLine="Dim Record As Cursor = Starter.LocalSQLEVC.ExecQu";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_nsql)));
RDebugUtils.currentLine=196345904;
 //BA.debugLineNum = 196345904;BA.debugLine="Dim tagcode As String = \"\"";
_tagcode = "";
RDebugUtils.currentLine=196345905;
 //BA.debugLineNum = 196345905;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_record.getRowCount()>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=196345906;
 //BA.debugLineNum = 196345906;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=196345907;
 //BA.debugLineNum = 196345907;BA.debugLine="Dim vehicleplate As String = Utils.IfNullOrEmpty";
_vehicleplate = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vmatricula"),"");
RDebugUtils.currentLine=196345908;
 //BA.debugLineNum = 196345908;BA.debugLine="Dim vehicle As String = Utils.IfNullOrEmpty(Reco";
_vehicle = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vmarca"),"");
RDebugUtils.currentLine=196345909;
 //BA.debugLineNum = 196345909;BA.debugLine="Dim vmodel As String = Utils.IfNullOrEmpty(Recor";
_vmodel = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vmodelo"),"");
RDebugUtils.currentLine=196345910;
 //BA.debugLineNum = 196345910;BA.debugLine="Dim tagcode As String = Utils.IfNullOrEmpty(Reco";
_tagcode = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("tagcode"),"");
RDebugUtils.currentLine=196345911;
 //BA.debugLineNum = 196345911;BA.debugLine="Dim vehicle_tagcode As String = Utils.IfNullOrEm";
_vehicle_tagcode = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vehicle_tagcode"),"");
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=196345914;
 //BA.debugLineNum = 196345914;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=196345916;
 //BA.debugLineNum = 196345916;BA.debugLine="If (Utils.NNE(tagcode)) Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_tagcode))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=196345917;
 //BA.debugLineNum = 196345917;BA.debugLine="CurrentCarID = Types.NewAutoIdentification(tagco";
parent.mostCurrent._currentcarid = parent.mostCurrent._types._newautoidentification /*xevolution.vrcg.devdemov2400.types._autoidentification*/ (mostCurrent.activityBA,_tagcode,_vehicle_tagcode,_vehicleplate,_vehicle,_vmodel);
RDebugUtils.currentLine=196345918;
 //BA.debugLineNum = 196345918;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
_createuserdetailsdata(anywheresoftware.b4a.keywords.Common.True,parent.mostCurrent._currentcarid);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=196345922;
 //BA.debugLineNum = 196345922;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _layoutview = "";
String _userpage = "";
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=193134592;
 //BA.debugLineNum = 193134592;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=193134593;
 //BA.debugLineNum = 193134593;BA.debugLine="Starter.CurrentWorkActivity = Me";
mostCurrent._starter._currentworkactivity /*Object*/  = user.getObject();
RDebugUtils.currentLine=193134594;
 //BA.debugLineNum = 193134594;BA.debugLine="IsFirstTime	 = FirstTime";
_isfirsttime = _firsttime;
RDebugUtils.currentLine=193134595;
 //BA.debugLineNum = 193134595;BA.debugLine="Dim LayOutView As String = \"userLayout\"";
_layoutview = "userLayout";
RDebugUtils.currentLine=193134596;
 //BA.debugLineNum = 193134596;BA.debugLine="Dim userPage As String = \"UserViewLayout\"";
_userpage = "UserViewLayout";
RDebugUtils.currentLine=193134598;
 //BA.debugLineNum = 193134598;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=193134599;
 //BA.debugLineNum = 193134599;BA.debugLine="LayOutView = \"mobile_user_layout\"";
_layoutview = "mobile_user_layout";
RDebugUtils.currentLine=193134606;
 //BA.debugLineNum = 193134606;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=193134608;
 //BA.debugLineNum = 193134608;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=193134611;
 //BA.debugLineNum = 193134611;BA.debugLine="Activity.LoadLayout(LayOutView)";
mostCurrent._activity.LoadLayout(_layoutview,mostCurrent.activityBA);
RDebugUtils.currentLine=193134613;
 //BA.debugLineNum = 193134613;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=193134615;
 //BA.debugLineNum = 193134615;BA.debugLine="listsTabPanel.LoadLayout(\"phone_user_layout\", \"\"";
mostCurrent._liststabpanel.LoadLayout("phone_user_layout",BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=193134616;
 //BA.debugLineNum = 193134616;BA.debugLine="listsTabPanel.LoadLayout(\"UserDocumentsViewLayou";
mostCurrent._liststabpanel.LoadLayout("UserDocumentsViewLayout",BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=193134617;
 //BA.debugLineNum = 193134617;BA.debugLine="listsTabPanel.LoadLayout(\"UserEquipmentsViewLayo";
mostCurrent._liststabpanel.LoadLayout("UserEquipmentsViewLayout",BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=193134618;
 //BA.debugLineNum = 193134618;BA.debugLine="listsTabPanel.LoadLayout(\"phone_user_operators_l";
mostCurrent._liststabpanel.LoadLayout("phone_user_operators_layout",BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=193134620;
 //BA.debugLineNum = 193134620;BA.debugLine="MenuPanelUserButton.Color = Consts.ColorMain";
mostCurrent._menupaneluserbutton.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=193134621;
 //BA.debugLineNum = 193134621;BA.debugLine="MenuPanelDocsButtom.Color = Consts.ColorMain";
mostCurrent._menupaneldocsbuttom.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=193134622;
 //BA.debugLineNum = 193134622;BA.debugLine="MenuPanelConsumablesButton.Color  = Consts.Color";
mostCurrent._menupanelconsumablesbutton.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=193134623;
 //BA.debugLineNum = 193134623;BA.debugLine="MenuPanelOperatorsButton.Color  = Consts.ColorMa";
mostCurrent._menupaneloperatorsbutton.setColor(mostCurrent._consts._colormain /*int*/ );
 }else {
RDebugUtils.currentLine=193134626;
 //BA.debugLineNum = 193134626;BA.debugLine="listsTabPanel.LoadLayout(userPage, ShareCode.use";
mostCurrent._liststabpanel.LoadLayout(_userpage,BA.ObjectToCharSequence(mostCurrent._sharecode._userlayoutpaneloper /*String*/ ));
RDebugUtils.currentLine=193134627;
 //BA.debugLineNum = 193134627;BA.debugLine="listsTabPanel.LoadLayout(\"UserDocumentsViewLayou";
mostCurrent._liststabpanel.LoadLayout("UserDocumentsViewLayout",BA.ObjectToCharSequence(mostCurrent._sharecode._userlayoutpaneldocsorg /*String*/ ));
RDebugUtils.currentLine=193134628;
 //BA.debugLineNum = 193134628;BA.debugLine="listsTabPanel.LoadLayout(\"UserEquipmentsViewLayo";
mostCurrent._liststabpanel.LoadLayout("UserEquipmentsViewLayout",BA.ObjectToCharSequence(mostCurrent._sharecode._userlayoutpanelconsum /*String*/ ));
 };
RDebugUtils.currentLine=193134633;
 //BA.debugLineNum = 193134633;BA.debugLine="If userPage = \"UserViewLayout\" Then";
if ((_userpage).equals("UserViewLayout")) { 
RDebugUtils.currentLine=193134634;
 //BA.debugLineNum = 193134634;BA.debugLine="userLabelFoto.Text = ShareCode.useruserLabelFoto";
mostCurrent._userlabelfoto.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._useruserlabelfoto /*String*/ ));
RDebugUtils.currentLine=193134635;
 //BA.debugLineNum = 193134635;BA.debugLine="userLabelNome.Text = ShareCode.useruserLabelNome";
mostCurrent._userlabelnome.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._useruserlabelnome /*String*/ ));
RDebugUtils.currentLine=193134636;
 //BA.debugLineNum = 193134636;BA.debugLine="userLabelOrganizacao.Text = ShareCode.useruserLa";
mostCurrent._userlabelorganizacao.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._useruserlabelorganizacao /*String*/ ));
RDebugUtils.currentLine=193134637;
 //BA.debugLineNum = 193134637;BA.debugLine="userLabelCategoria.Text = ShareCode.useruserLabe";
mostCurrent._userlabelcategoria.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._useruserlabelcategoria /*String*/ ));
RDebugUtils.currentLine=193134638;
 //BA.debugLineNum = 193134638;BA.debugLine="userLabelCodigoUser.text = ShareCode.useruserLab";
mostCurrent._userlabelcodigouser.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._useruserlabelcodigouser /*String*/ ));
 };
RDebugUtils.currentLine=193134641;
 //BA.debugLineNum = 193134641;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(UserDocum";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._userdocumentsviewlayoutpanel.getObject())));
RDebugUtils.currentLine=193134642;
 //BA.debugLineNum = 193134642;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(UserEquip";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._userequipmentsviewlayoutpanel.getObject())));
RDebugUtils.currentLine=193134643;
 //BA.debugLineNum = 193134643;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
 }else {
RDebugUtils.currentLine=193134648;
 //BA.debugLineNum = 193134648;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(l";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group37 = mostCurrent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,mostCurrent._liststabpanel);
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group37.Get(index37)));
RDebugUtils.currentLine=193134649;
 //BA.debugLineNum = 193134649;BA.debugLine="lbl.Width = 33.33%x";
_lbl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33.33),mostCurrent.activityBA));
 }
};
 };
RDebugUtils.currentLine=193134653;
 //BA.debugLineNum = 193134653;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
mostCurrent._utils._maketabpaneleffect /*String*/ (mostCurrent.activityBA,mostCurrent._colortabpanel,mostCurrent._consts._colormaindarker /*int*/ ,mostCurrent._consts._colorsub /*int*/ );
RDebugUtils.currentLine=193134654;
 //BA.debugLineNum = 193134654;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 };
RDebugUtils.currentLine=193134659;
 //BA.debugLineNum = 193134659;BA.debugLine="ConfirmProducts = (ShareCode.UWDUKEY_PRODUCTS = 0";
_confirmproducts = (mostCurrent._sharecode._uwdukey_products /*int*/ ==0);
RDebugUtils.currentLine=193134660;
 //BA.debugLineNum = 193134660;BA.debugLine="FirstDataLoad = True";
_firstdataload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=193134662;
 //BA.debugLineNum = 193134662;BA.debugLine="If Not(DialogLogin.IsInitialized) Then DialogLogi";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._dialoglogin.IsInitialized /*boolean*/ ())) { 
mostCurrent._dialoglogin._initialize /*String*/ (null,mostCurrent.activityBA);};
RDebugUtils.currentLine=193134668;
 //BA.debugLineNum = 193134668;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=193134669;
 //BA.debugLineNum = 193134669;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=193134670;
 //BA.debugLineNum = 193134670;BA.debugLine="End Sub";
return "";
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=193527808;
 //BA.debugLineNum = 193527808;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=193527809;
 //BA.debugLineNum = 193527809;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
mostCurrent._mainlabeloptlists.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=193527810;
 //BA.debugLineNum = 193527810;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=193527811;
 //BA.debugLineNum = 193527811;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=193527812;
 //BA.debugLineNum = 193527812;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
 };
RDebugUtils.currentLine=193527815;
 //BA.debugLineNum = 193527815;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN_";
anywheresoftware.b4a.keywords.Common.LogImpl("6193527815",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=193527817;
 //BA.debugLineNum = 193527817;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) Then";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=193527818;
 //BA.debugLineNum = 193527818;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(Sh";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
RDebugUtils.currentLine=193527824;
 //BA.debugLineNum = 193527824;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=193527825;
 //BA.debugLineNum = 193527825;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._liststabpanel));
RDebugUtils.currentLine=193527826;
 //BA.debugLineNum = 193527826;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.GetField("tabStrip")));
RDebugUtils.currentLine=193527828;
 //BA.debugLineNum = 193527828;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
_jo.RunMethod("setIndicatorColor",new Object[]{(Object)(mostCurrent._consts._colormain /*int*/ )});
RDebugUtils.currentLine=193527829;
 //BA.debugLineNum = 193527829;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.user parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=193593346;
 //BA.debugLineNum = 193593346;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
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
RDebugUtils.currentLine=193593347;
 //BA.debugLineNum = 193593347;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=193593348;
 //BA.debugLineNum = 193593348;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=193593350;
 //BA.debugLineNum = 193593350;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=193593351;
 //BA.debugLineNum = 193593351;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=193593352;
 //BA.debugLineNum = 193593352;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "windowstatusupdate"),(int) (500));
this.state = 19;
return;
case 19:
//C
this.state = 4;
;
RDebugUtils.currentLine=193593353;
 //BA.debugLineNum = 193593353;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=193593356;
 //BA.debugLineNum = 193593356;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=193593357;
 //BA.debugLineNum = 193593357;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=193593358;
 //BA.debugLineNum = 193593358;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=193593359;
 //BA.debugLineNum = 193593359;BA.debugLine="ButtonUserUnavailable.Enabled = False";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=193593360;
 //BA.debugLineNum = 193593360;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=193593361;
 //BA.debugLineNum = 193593361;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=193593362;
 //BA.debugLineNum = 193593362;BA.debugLine="butUserPauseAction.textColor = Colors.black";
parent.mostCurrent._butuserpauseaction.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=193593363;
 //BA.debugLineNum = 193593363;BA.debugLine="butUserUnavailable.TextColor = Colors.black";
parent.mostCurrent._butuserunavailable.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=193593364;
 //BA.debugLineNum = 193593364;BA.debugLine="butUserEstadoAction.TextColor = Colors.black";
parent.mostCurrent._butuserestadoaction.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=193593366;
 //BA.debugLineNum = 193593366;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_Use";
parent.mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._mainoption_user /*String*/ .toUpperCase()));
RDebugUtils.currentLine=193593367;
 //BA.debugLineNum = 193593367;BA.debugLine="MenuPanelUserButton.Text = ShareCode.usermainLabe";
parent.mostCurrent._menupaneluserbutton.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistsuser /*String*/ ));
RDebugUtils.currentLine=193593368;
 //BA.debugLineNum = 193593368;BA.debugLine="MenuPanelDocsButtom.Text = ShareCode.usermainLabe";
parent.mostCurrent._menupaneldocsbuttom.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistsdocs /*String*/ ));
RDebugUtils.currentLine=193593369;
 //BA.debugLineNum = 193593369;BA.debugLine="MenuPanelConsumablesButton.Text = ShareCode.userm";
parent.mostCurrent._menupanelconsumablesbutton.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistscons /*String*/ ));
RDebugUtils.currentLine=193593370;
 //BA.debugLineNum = 193593370;BA.debugLine="MenuPanelOperatorsButton.Text = ShareCode.usermai";
parent.mostCurrent._menupaneloperatorsbutton.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usermainlabeloptlistsoper /*String*/ ));
RDebugUtils.currentLine=193593372;
 //BA.debugLineNum = 193593372;BA.debugLine="ButtonAppNetwork.Enabled = False";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=193593373;
 //BA.debugLineNum = 193593373;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=193593375;
 //BA.debugLineNum = 193593375;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=193593376;
 //BA.debugLineNum = 193593376;BA.debugLine="ButtonAppNetwork.Enabled = True";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=193593377;
 //BA.debugLineNum = 193593377;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=193593380;
 //BA.debugLineNum = 193593380;BA.debugLine="If ShareCode.USR_STATE = 0 Then";

case 8:
//if
this.state = 13;
if (parent.mostCurrent._sharecode._usr_state /*int*/ ==0) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=193593381;
 //BA.debugLineNum = 193593381;BA.debugLine="butUserUnavailable.TextColor = Consts.ColorRed";
parent.mostCurrent._butuserunavailable.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=193593382;
 //BA.debugLineNum = 193593382;BA.debugLine="butUserEstadoAction.TextColor = Consts.ColorRed";
parent.mostCurrent._butuserestadoaction.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=193593383;
 //BA.debugLineNum = 193593383;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=193593384;
 //BA.debugLineNum = 193593384;BA.debugLine="ButtonUserUnavailable.Enabled = True";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=193593386;
 //BA.debugLineNum = 193593386;BA.debugLine="butUserUnavailable.TextColor = Colors.black";
parent.mostCurrent._butuserunavailable.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=193593387;
 //BA.debugLineNum = 193593387;BA.debugLine="butUserEstadoAction.TextColor = Colors.black";
parent.mostCurrent._butuserestadoaction.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=193593388;
 //BA.debugLineNum = 193593388;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLi";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=193593399;
 //BA.debugLineNum = 193593399;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";

case 13:
//if
this.state = 18;
if ((parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=193593400;
 //BA.debugLineNum = 193593400;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_3\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_3",user.getObject());
RDebugUtils.currentLine=193593401;
 //BA.debugLineNum = 193593401;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "windowstatusupdate"),(int) (250));
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=193593402;
 //BA.debugLineNum = 193593402;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorOrange";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colororange /*int*/ );
RDebugUtils.currentLine=193593403;
 //BA.debugLineNum = 193593403;BA.debugLine="butUserPauseAction.TextColor = Consts.ColorOrang";
parent.mostCurrent._butuserpauseaction.setTextColor(parent.mostCurrent._consts._colororange /*int*/ );
RDebugUtils.currentLine=193593405;
 //BA.debugLineNum = 193593405;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
parent.mostCurrent._lblestadouserjornada.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadaindisponivel /*String*/ ));
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=193593407;
 //BA.debugLineNum = 193593407;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_4\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_4",user.getObject());
RDebugUtils.currentLine=193593408;
 //BA.debugLineNum = 193593408;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "windowstatusupdate"),(int) (250));
this.state = 21;
return;
case 21:
//C
this.state = 18;
;
RDebugUtils.currentLine=193593409;
 //BA.debugLineNum = 193593409;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightS";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=193593410;
 //BA.debugLineNum = 193593410;BA.debugLine="butUserPauseAction.TextColor = Colors.Black";
parent.mostCurrent._butuserpauseaction.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=193593412;
 //BA.debugLineNum = 193593412;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
parent.mostCurrent._lblestadouserjornada.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadaactivo /*String*/ ));
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=193593415;
 //BA.debugLineNum = 193593415;BA.debugLine="listsLabelInfo.Text = $\"${CurrentEquipItem} / ${T";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentequipitem))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitems))+"")));
RDebugUtils.currentLine=193593417;
 //BA.debugLineNum = 193593417;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=193331200;
 //BA.debugLineNum = 193331200;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=193331201;
 //BA.debugLineNum = 193331201;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=193331202;
 //BA.debugLineNum = 193331202;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=193331203;
 //BA.debugLineNum = 193331203;BA.debugLine="Return PhoneBackButtonTab";
if (true) return _phonebackbuttontab();
 };
RDebugUtils.currentLine=193331205;
 //BA.debugLineNum = 193331205;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=193331207;
 //BA.debugLineNum = 193331207;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=193331208;
 //BA.debugLineNum = 193331208;BA.debugLine="End Sub";
return false;
}
public static boolean  _phonebackbuttontab() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "phonebackbuttontab", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "phonebackbuttontab", null));}
RDebugUtils.currentLine=193396736;
 //BA.debugLineNum = 193396736;BA.debugLine="Sub PhoneBackButtonTab As Boolean";
RDebugUtils.currentLine=193396737;
 //BA.debugLineNum = 193396737;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=193396738;
 //BA.debugLineNum = 193396738;BA.debugLine="If (MenuPanel.Visible = False) Then";
if ((mostCurrent._menupanel.getVisible()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=193396739;
 //BA.debugLineNum = 193396739;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=193396740;
 //BA.debugLineNum = 193396740;BA.debugLine="MenuPanel.Visible = True";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=193396741;
 //BA.debugLineNum = 193396741;BA.debugLine="mainLabelOptLists.Text = ShareCode.MainOption_U";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._mainoption_user /*String*/ ));
RDebugUtils.currentLine=193396742;
 //BA.debugLineNum = 193396742;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=193396745;
 //BA.debugLineNum = 193396745;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=193396746;
 //BA.debugLineNum = 193396746;BA.debugLine="End Sub";
return false;
}
public static String  _listsbuttonclose_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=194772992;
 //BA.debugLineNum = 194772992;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=194772993;
 //BA.debugLineNum = 194772993;BA.debugLine="Log(\"Back USER\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6194772993","Back USER",0);
RDebugUtils.currentLine=194772994;
 //BA.debugLineNum = 194772994;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=194772995;
 //BA.debugLineNum = 194772995;BA.debugLine="If(PhoneBackButtonTab) Then";
if ((_phonebackbuttontab())) { 
RDebugUtils.currentLine=194772996;
 //BA.debugLineNum = 194772996;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=194772999;
 //BA.debugLineNum = 194772999;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturn",(Object)(""));
RDebugUtils.currentLine=194773000;
 //BA.debugLineNum = 194773000;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=194773001;
 //BA.debugLineNum = 194773001;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=194773002;
 //BA.debugLineNum = 194773002;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="user";
RDebugUtils.currentLine=193265664;
 //BA.debugLineNum = 193265664;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=193265665;
 //BA.debugLineNum = 193265665;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=193200128;
 //BA.debugLineNum = 193200128;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=193200129;
 //BA.debugLineNum = 193200129;BA.debugLine="If (ShareCode.ISPHONE And IsFirstTime) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/  && _isfirsttime)) { 
RDebugUtils.currentLine=193200130;
 //BA.debugLineNum = 193200130;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=193200131;
 //BA.debugLineNum = 193200131;BA.debugLine="MenuPanel.Visible = True";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=193200132;
 //BA.debugLineNum = 193200132;BA.debugLine="IsFirstTime = False";
_isfirsttime = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=193200143;
 //BA.debugLineNum = 193200143;BA.debugLine="End Sub";
return "";
}
public static String  _butcarrunning_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcarrunning_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcarrunning_click", null));}
RDebugUtils.currentLine=195756032;
 //BA.debugLineNum = 195756032;BA.debugLine="Sub butCarRunning_Click";
RDebugUtils.currentLine=195756034;
 //BA.debugLineNum = 195756034;BA.debugLine="End Sub";
return "";
}
public static String  _butdocfilter_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butdocfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butdocfilter_click", null));}
RDebugUtils.currentLine=195690496;
 //BA.debugLineNum = 195690496;BA.debugLine="Sub butDocFilter_Click";
RDebugUtils.currentLine=195690497;
 //BA.debugLineNum = 195690497;BA.debugLine="mDocPopMenu.OpenMenu()";
mostCurrent._mdocpopmenu._openmenu();
RDebugUtils.currentLine=195690498;
 //BA.debugLineNum = 195690498;BA.debugLine="End Sub";
return "";
}
public static String  _butequipfilter_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butequipfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butequipfilter_click", null));}
RDebugUtils.currentLine=195624960;
 //BA.debugLineNum = 195624960;BA.debugLine="Sub butEquipFilter_Click";
RDebugUtils.currentLine=195624961;
 //BA.debugLineNum = 195624961;BA.debugLine="mEqipPopMenu.OpenMenu()";
mostCurrent._meqippopmenu._openmenu();
RDebugUtils.currentLine=195624962;
 //BA.debugLineNum = 195624962;BA.debugLine="End Sub";
return "";
}
public static String  _butequipsearch_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butequipsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butequipsearch_click", null));}
RDebugUtils.currentLine=197394432;
 //BA.debugLineNum = 197394432;BA.debugLine="Sub butEquipSearch_Click";
RDebugUtils.currentLine=197394433;
 //BA.debugLineNum = 197394433;BA.debugLine="MakeEquipmentListSearch(EditEquipSearch.Text)";
_makeequipmentlistsearch(mostCurrent._editequipsearch.getText());
RDebugUtils.currentLine=197394434;
 //BA.debugLineNum = 197394434;BA.debugLine="End Sub";
return "";
}
public static String  _makeequipmentlistsearch(String _search) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeequipmentlistsearch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makeequipmentlistsearch", new Object[] {_search}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _ssql = "";
int _row = 0;
RDebugUtils.currentLine=197459968;
 //BA.debugLineNum = 197459968;BA.debugLine="Sub MakeEquipmentListSearch(search As String)";
RDebugUtils.currentLine=197459969;
 //BA.debugLineNum = 197459969;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=197459970;
 //BA.debugLineNum = 197459970;BA.debugLine="Dim sSQL As String = $\"select a.*, ifnull(b.statu";
_ssql = ("select a.*, ifnull(b.status, 0) as status from warehouses_items as a left join userinnertasksnolines as b on (b.product_tagcode=a.tagcode and b.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"')\n"+" 							where a.warehouse='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_warehouse /*String*/ ))+"' ");
RDebugUtils.currentLine=197459973;
 //BA.debugLineNum = 197459973;BA.debugLine="If (search <> \"\") Then";
if (((_search).equals("") == false)) { 
RDebugUtils.currentLine=197459974;
 //BA.debugLineNum = 197459974;BA.debugLine="sSQL = $\"${sSQL} and a.title||a.value||a.notes l";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and a.title||a.value||a.notes like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%'");
 };
RDebugUtils.currentLine=197459977;
 //BA.debugLineNum = 197459977;BA.debugLine="Record = Starter.LocalSQL.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=197459978;
 //BA.debugLineNum = 197459978;BA.debugLine="listEquipments.Clear";
mostCurrent._listequipments._clear();
RDebugUtils.currentLine=197459979;
 //BA.debugLineNum = 197459979;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=197459980;
 //BA.debugLineNum = 197459980;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit9 ;_row = _row + step9 ) {
RDebugUtils.currentLine=197459981;
 //BA.debugLineNum = 197459981;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=197459982;
 //BA.debugLineNum = 197459982;BA.debugLine="listEquipments.Add( CreateEquipListItem(Row, Re";
mostCurrent._listequipments._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createequiplistitem(_row,_record,mostCurrent._listequipments._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(anywheresoftware.b4a.keywords.Common.Null))).getObject())),(Object)(""));
 }
};
 };
RDebugUtils.currentLine=197459985;
 //BA.debugLineNum = 197459985;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=197459986;
 //BA.debugLineNum = 197459986;BA.debugLine="End Sub";
return "";
}
public static String  _butgroupcarchange_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butgroupcarchange_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butgroupcarchange_click", null));}
RDebugUtils.currentLine=198311936;
 //BA.debugLineNum = 198311936;BA.debugLine="Sub butGroupCarChange_Click";
RDebugUtils.currentLine=198311937;
 //BA.debugLineNum = 198311937;BA.debugLine="ListOfVehicles";
_listofvehicles();
RDebugUtils.currentLine=198311938;
 //BA.debugLineNum = 198311938;BA.debugLine="End Sub";
return "";
}
public static String  _listofvehicles() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listofvehicles", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listofvehicles", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=196149248;
 //BA.debugLineNum = 196149248;BA.debugLine="Sub ListOfVehicles()";
RDebugUtils.currentLine=196149249;
 //BA.debugLineNum = 196149249;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=196149251;
 //BA.debugLineNum = 196149251;BA.debugLine="Dim SQL As String = $\"Select a.tagcode , a.title_";
_sql = ("Select a.tagcode , a.title_import from dta_objects As a\n"+" 														INNER JOIN dta_objecttypes As b on \n"+" 															(b.tagcode = a.object_type And b.inout_tagcode = 'TINOUT_VEHICLES')\n"+"								where a.active=1");
RDebugUtils.currentLine=196149255;
 //BA.debugLineNum = 196149255;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=196149256;
 //BA.debugLineNum = 196149256;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=196149257;
 //BA.debugLineNum = 196149257;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=196149258;
 //BA.debugLineNum = 196149258;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=196149259;
 //BA.debugLineNum = 196149259;BA.debugLine="Filter.getVehiclesListDialog(Activity, \"User\", \"";
_filter._getvehicleslistdialog /*void*/ (null,mostCurrent._activity,(Object)("User"),"Lista de Veículos",_record);
 }else {
RDebugUtils.currentLine=196149261;
 //BA.debugLineNum = 196149261;BA.debugLine="MsgboxAsync(ShareCode.userNoVehicles, ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._usernovehicles /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=196149262;
 //BA.debugLineNum = 196149262;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=196149264;
 //BA.debugLineNum = 196149264;BA.debugLine="End Sub";
return "";
}
public static String  _butgroupceadd_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butgroupceadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butgroupceadd_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=197722112;
 //BA.debugLineNum = 197722112;BA.debugLine="Sub butGroupCEAdd_Click";
RDebugUtils.currentLine=197722113;
 //BA.debugLineNum = 197722113;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=197722114;
 //BA.debugLineNum = 197722114;BA.debugLine="Dim SQL As String = $\"select title, serialnumber,";
_sql = ("select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode not in (select equipment_tagcode from dta_equipments_technicals where technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"')");
RDebugUtils.currentLine=197722116;
 //BA.debugLineNum = 197722116;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=197722117;
 //BA.debugLineNum = 197722117;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=197722118;
 //BA.debugLineNum = 197722118;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=197722119;
 //BA.debugLineNum = 197722119;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=197722120;
 //BA.debugLineNum = 197722120;BA.debugLine="Filter.getDoubleLineEquipmentsDialog(Activity, \"";
_filter._getdoublelineequipmentsdialog /*void*/ (null,mostCurrent._activity,(Object)("User"),"Lista de equipamentos",_record,"");
 }else {
RDebugUtils.currentLine=197722122;
 //BA.debugLineNum = 197722122;BA.debugLine="MsgboxAsync(ShareCode.userNoEquipmentsReplace, S";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._usernoequipmentsreplace /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=197722123;
 //BA.debugLineNum = 197722123;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=197722125;
 //BA.debugLineNum = 197722125;BA.debugLine="End Sub";
return "";
}
public static String  _butgroupuregisteradd_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butgroupuregisteradd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butgroupuregisteradd_click", null));}
RDebugUtils.currentLine=198115328;
 //BA.debugLineNum = 198115328;BA.debugLine="Sub butGroupURegisterAdd_Click";
RDebugUtils.currentLine=198115329;
 //BA.debugLineNum = 198115329;BA.debugLine="DialogLogin.getLoginDialog2(\"User\")";
mostCurrent._dialoglogin._getlogindialog2 /*void*/ (null,(Object)("User"));
RDebugUtils.currentLine=198115330;
 //BA.debugLineNum = 198115330;BA.debugLine="End Sub";
return "";
}
public static String  _buttonactionpause_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonactionpause_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonactionpause_click", null));}
int _i = 0;
RDebugUtils.currentLine=197918720;
 //BA.debugLineNum = 197918720;BA.debugLine="Sub ButtonActionPause_Click";
RDebugUtils.currentLine=197918721;
 //BA.debugLineNum = 197918721;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if ((mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
RDebugUtils.currentLine=197918723;
 //BA.debugLineNum = 197918723;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=197918724;
 //BA.debugLineNum = 197918724;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=197918725;
 //BA.debugLineNum = 197918725;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=197918726;
 //BA.debugLineNum = 197918726;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=197918727;
 //BA.debugLineNum = 197918727;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=197918729;
 //BA.debugLineNum = 197918729;BA.debugLine="butUserPauseAction.TextColor = Consts.ColorOran";
mostCurrent._butuserpauseaction.setTextColor(mostCurrent._consts._colororange /*int*/ );
 };
 };
RDebugUtils.currentLine=197918732;
 //BA.debugLineNum = 197918732;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=197918733;
 //BA.debugLineNum = 197918733;BA.debugLine="End Sub";
return "";
}
public static String  _buttonlistconfirm_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlistconfirm_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonlistconfirm_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=197066752;
 //BA.debugLineNum = 197066752;BA.debugLine="Sub ButtonListConfirm_Click";
RDebugUtils.currentLine=197066753;
 //BA.debugLineNum = 197066753;BA.debugLine="If (ShareCode.UWDUKEY_PRODUCTS =0) Then";
if ((mostCurrent._sharecode._uwdukey_products /*int*/ ==0)) { 
RDebugUtils.currentLine=197066754;
 //BA.debugLineNum = 197066754;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=197066755;
 //BA.debugLineNum = 197066755;BA.debugLine="Dim p As Panel = b.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_b.getParent()));
RDebugUtils.currentLine=197066756;
 //BA.debugLineNum = 197066756;BA.debugLine="If (b.Tag = 0) Then";
if (((_b.getTag()).equals((Object)(0)))) { 
RDebugUtils.currentLine=197066757;
 //BA.debugLineNum = 197066757;BA.debugLine="b.Tag = 1";
_b.setTag((Object)(1));
RDebugUtils.currentLine=197066758;
 //BA.debugLineNum = 197066758;BA.debugLine="b.TextColor = Consts.ColorGreen";
_b.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
 }else {
RDebugUtils.currentLine=197066760;
 //BA.debugLineNum = 197066760;BA.debugLine="b.Tag = 0";
_b.setTag((Object)(0));
RDebugUtils.currentLine=197066761;
 //BA.debugLineNum = 197066761;BA.debugLine="b.TextColor = Consts.ColorLightSilver";
_b.setTextColor(mostCurrent._consts._colorlightsilver /*int*/ );
 };
RDebugUtils.currentLine=197066763;
 //BA.debugLineNum = 197066763;BA.debugLine="DBStructures.UpdateOrCreateWorkDayProduct(ShareC";
mostCurrent._dbstructures._updateorcreateworkdayproduct /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_uwdukey /*String*/ ,BA.ObjectToString(_p.getTag()),(int)(BA.ObjectToNumber(_b.getTag())),"");
 };
RDebugUtils.currentLine=197066765;
 //BA.debugLineNum = 197066765;BA.debugLine="End Sub";
return "";
}
public static void  _buttonlistnotconfirm_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonlistnotconfirm_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "buttonlistnotconfirm_click", null); return;}
ResumableSub_ButtonListNotConfirm_Click rsub = new ResumableSub_ButtonListNotConfirm_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_ButtonListNotConfirm_Click extends BA.ResumableSub {
public ResumableSub_ButtonListNotConfirm_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.user parent;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _n = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=197132289;
 //BA.debugLineNum = 197132289;BA.debugLine="If (ShareCode.UWDUKEY_PRODUCTS =0) Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((parent.mostCurrent._sharecode._uwdukey_products /*int*/ ==0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=197132290;
 //BA.debugLineNum = 197132290;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=197132291;
 //BA.debugLineNum = 197132291;BA.debugLine="Dim p As Panel = b.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_b.getParent()));
RDebugUtils.currentLine=197132292;
 //BA.debugLineNum = 197132292;BA.debugLine="Dim n As String = \"\"";
_n = "";
RDebugUtils.currentLine=197132293;
 //BA.debugLineNum = 197132293;BA.debugLine="If (b.Tag = 0) Then";
if (true) break;

case 4:
//if
this.state = 17;
if (((_b.getTag()).equals((Object)(0)))) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=197132294;
 //BA.debugLineNum = 197132294;BA.debugLine="b.Tag = 2";
_b.setTag((Object)(2));
RDebugUtils.currentLine=197132295;
 //BA.debugLineNum = 197132295;BA.debugLine="b.TextColor = Consts.ColorRed";
_b.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=197132297;
 //BA.debugLineNum = 197132297;BA.debugLine="Msgbox2Async(ShareCode.userAskProductAusente, S";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._useraskproductausente /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._useroptionsimausente /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,parent.mostCurrent._sharecode._useroptionoutrasrazoes /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=197132298;
 //BA.debugLineNum = 197132298;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "buttonlistnotconfirm_click"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=197132299;
 //BA.debugLineNum = 197132299;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 14;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=197132301;
 //BA.debugLineNum = 197132301;BA.debugLine="Else If (DialogResponse.NEGATIVE) Then";
if (BA.ObjectToBoolean((anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE))) { 
this.state = 11;
}else {
this.state = 13;
}}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=197132300;
 //BA.debugLineNum = 197132300;BA.debugLine="n = \"Produto ausente\"";
_n = "Produto ausente";
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=197132302;
 //BA.debugLineNum = 197132302;BA.debugLine="n = \"Outras razões\"";
_n = "Outras razões";
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=197132304;
 //BA.debugLineNum = 197132304;BA.debugLine="n = \"Sem justificação\"";
_n = "Sem justificação";
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=197132307;
 //BA.debugLineNum = 197132307;BA.debugLine="b.Tag = 0";
_b.setTag((Object)(0));
RDebugUtils.currentLine=197132308;
 //BA.debugLineNum = 197132308;BA.debugLine="b.TextColor = Consts.ColorLightSilver";
_b.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=197132310;
 //BA.debugLineNum = 197132310;BA.debugLine="DBStructures.UpdateOrCreateWorkDayProduct(ShareC";
parent.mostCurrent._dbstructures._updateorcreateworkdayproduct /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._sess_uwdukey /*String*/ ,BA.ObjectToString(_p.getTag()),(int)(BA.ObjectToNumber(_b.getTag())),_n);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=197132312;
 //BA.debugLineNum = 197132312;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
RDebugUtils.currentLine=196935680;
 //BA.debugLineNum = 196935680;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=196935681;
 //BA.debugLineNum = 196935681;BA.debugLine="CallUnavailableChange";
_callunavailablechange();
RDebugUtils.currentLine=196935682;
 //BA.debugLineNum = 196935682;BA.debugLine="End Sub";
return "";
}
public static void  _callunavailablechange() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callunavailablechange", false))
	 {Debug.delegate(mostCurrent.activityBA, "callunavailablechange", null); return;}
ResumableSub_CallUnavailableChange rsub = new ResumableSub_CallUnavailableChange(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CallUnavailableChange extends BA.ResumableSub {
public ResumableSub_CallUnavailableChange(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.user parent;
int _result = 0;
xevolution.vrcg.devdemov2400.appdialogs _cli = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=197001218;
 //BA.debugLineNum = 197001218;BA.debugLine="Msgbox2Async(ShareCode.UserGoAvailableMessage, Sh";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._usergoavailablemessage /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_no /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=197001219;
 //BA.debugLineNum = 197001219;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "callunavailablechange"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=197001220;
 //BA.debugLineNum = 197001220;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
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
RDebugUtils.currentLine=197001221;
 //BA.debugLineNum = 197001221;BA.debugLine="Dim cli As AppDialogs";
_cli = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=197001222;
 //BA.debugLineNum = 197001222;BA.debugLine="cli.Initialize";
_cli._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=197001223;
 //BA.debugLineNum = 197001223;BA.debugLine="cli.MakeUserAvailable(\"User\")";
_cli._makeuseravailable /*void*/ (null,(Object)("User"));
RDebugUtils.currentLine=197001224;
 //BA.debugLineNum = 197001224;BA.debugLine="butUserUnavailable.TextColor = Colors.Black";
parent.mostCurrent._butuserunavailable.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=197001225;
 //BA.debugLineNum = 197001225;BA.debugLine="butUserEstadoAction.TextColor = Colors.Black";
parent.mostCurrent._butuserestadoaction.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=197001226;
 //BA.debugLineNum = 197001226;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLi";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=197001227;
 //BA.debugLineNum = 197001227;BA.debugLine="lblEstadoUserJornada.Text = \"Disponível\"";
parent.mostCurrent._lblestadouserjornada.setText(BA.ObjectToCharSequence("Disponível"));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=197001229;
 //BA.debugLineNum = 197001229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butuserconfirmdata_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butuserconfirmdata_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butuserconfirmdata_click", null));}
int _remainingitems = 0;
int _i = 0;
RDebugUtils.currentLine=196476928;
 //BA.debugLineNum = 196476928;BA.debugLine="Sub butUserConfirmData_Click";
RDebugUtils.currentLine=196476929;
 //BA.debugLineNum = 196476929;BA.debugLine="Dim remainingItems As Int = ProductsToConfirm-Con";
_remainingitems = (int) (_productstoconfirm-_confirmedproducts());
RDebugUtils.currentLine=196476930;
 //BA.debugLineNum = 196476930;BA.debugLine="If (remainingItems > 0) Then";
if ((_remainingitems>0)) { 
RDebugUtils.currentLine=196476931;
 //BA.debugLineNum = 196476931;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=196476932;
 //BA.debugLineNum = 196476932;BA.debugLine="i = Msgbox2(ShareCode.userAskConfirmProducts, Sh";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._useraskconfirmproducts /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_continue /*String*/ ,mostCurrent._sharecode._option_cancel /*String*/ ,mostCurrent._sharecode._useroptionconfirmproduct /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=196476933;
 //BA.debugLineNum = 196476933;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=196476934;
 //BA.debugLineNum = 196476934;BA.debugLine="DBStructures.UpdateWorkingDayStatus(ShareCode.S";
mostCurrent._dbstructures._updateworkingdaystatus /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_uwdukey /*String*/ ,mostCurrent._sharecode._sess_user /*String*/ ,(int) (1),(int) (0));
 }else 
{RDebugUtils.currentLine=196476935;
 //BA.debugLineNum = 196476935;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
RDebugUtils.currentLine=196476936;
 //BA.debugLineNum = 196476936;BA.debugLine="DBStructures.UpdateWorkingDayStatus(ShareCode.S";
mostCurrent._dbstructures._updateworkingdaystatus /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_uwdukey /*String*/ ,mostCurrent._sharecode._sess_user /*String*/ ,(int) (1),(int) (1));
 }else {
 }}
;
 }else {
RDebugUtils.currentLine=196476940;
 //BA.debugLineNum = 196476940;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=196476941;
 //BA.debugLineNum = 196476941;BA.debugLine="i = Msgbox2(ShareCode.userAskConfirmUserData, Sh";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._useraskconfirmuserdata /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_continue /*String*/ ,mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=196476942;
 //BA.debugLineNum = 196476942;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=196476943;
 //BA.debugLineNum = 196476943;BA.debugLine="DBStructures.UpdateWorkingDayStatus(ShareCode.S";
mostCurrent._dbstructures._updateworkingdaystatus /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_uwdukey /*String*/ ,mostCurrent._sharecode._sess_user /*String*/ ,(int) (1),(int) (1));
 };
 };
RDebugUtils.currentLine=196476946;
 //BA.debugLineNum = 196476946;BA.debugLine="DBStructures.CheckWorkingDayTasks";
mostCurrent._dbstructures._checkworkingdaytasks /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=196476947;
 //BA.debugLineNum = 196476947;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=196476948;
 //BA.debugLineNum = 196476948;BA.debugLine="End Sub";
return "";
}
public static int  _confirmedproducts() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "confirmedproducts", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "confirmedproducts", null));}
int _ret = 0;
int _i = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.ButtonWrapper _b1 = null;
anywheresoftware.b4a.objects.ButtonWrapper _b2 = null;
RDebugUtils.currentLine=197197824;
 //BA.debugLineNum = 197197824;BA.debugLine="Sub ConfirmedProducts As Int";
RDebugUtils.currentLine=197197825;
 //BA.debugLineNum = 197197825;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=197197826;
 //BA.debugLineNum = 197197826;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=197197827;
 //BA.debugLineNum = 197197827;BA.debugLine="For i=0 To listEquipments.GetSize-1";
{
final int step3 = 1;
final int limit3 = (int) (mostCurrent._listequipments._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=197197828;
 //BA.debugLineNum = 197197828;BA.debugLine="Dim p As Panel = listEquipments.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listequipments._getpanel(_i).getObject()));
RDebugUtils.currentLine=197197829;
 //BA.debugLineNum = 197197829;BA.debugLine="Dim b1 As Button = p.GetView(7) 'ButtonListConf";
_b1 = new anywheresoftware.b4a.objects.ButtonWrapper();
_b1 = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_p.GetView((int) (7)).getObject()));
RDebugUtils.currentLine=197197830;
 //BA.debugLineNum = 197197830;BA.debugLine="Dim b2 As Button = p.GetView(8) 'ButtonListNotC";
_b2 = new anywheresoftware.b4a.objects.ButtonWrapper();
_b2 = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_p.GetView((int) (8)).getObject()));
RDebugUtils.currentLine=197197831;
 //BA.debugLineNum = 197197831;BA.debugLine="If (b1.Tag > 0) Or (b2.Tag > 0) Then ret = ret";
if (((double)(BA.ObjectToNumber(_b1.getTag()))>0) || ((double)(BA.ObjectToNumber(_b2.getTag()))>0)) { 
_ret = (int) (_ret+1);};
 }
};
 };
RDebugUtils.currentLine=197197834;
 //BA.debugLineNum = 197197834;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=197197835;
 //BA.debugLineNum = 197197835;BA.debugLine="End Sub";
return 0;
}
public static String  _butuserestadoaction_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butuserestadoaction_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butuserestadoaction_click", null));}
anywheresoftware.b4a.objects.collections.List _reasons = null;
anywheresoftware.b4a.objects.collections.List _causes = null;
int _tipodlg = 0;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=198967296;
 //BA.debugLineNum = 198967296;BA.debugLine="Sub butUserEstadoAction_Click";
RDebugUtils.currentLine=198967298;
 //BA.debugLineNum = 198967298;BA.debugLine="Dim reasons As List";
_reasons = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198967299;
 //BA.debugLineNum = 198967299;BA.debugLine="reasons.Initialize";
_reasons.Initialize();
RDebugUtils.currentLine=198967300;
 //BA.debugLineNum = 198967300;BA.debugLine="reasons.Addall(Array As String(\"Inicio Jornada\",\"";
_reasons.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Inicio Jornada","Fim Jornada","Inicio Pausa","Fim Pausa","Indisponibilidade"}));
RDebugUtils.currentLine=198967302;
 //BA.debugLineNum = 198967302;BA.debugLine="Dim causes As List";
_causes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=198967303;
 //BA.debugLineNum = 198967303;BA.debugLine="causes.Initialize";
_causes.Initialize();
RDebugUtils.currentLine=198967304;
 //BA.debugLineNum = 198967304;BA.debugLine="causes.AddAll(Array As String(\"Avaria/Atraso Tran";
_causes.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Avaria/Atraso Transporte",mostCurrent._sharecode._userreasonsdoente /*String*/ ,mostCurrent._sharecode._userreasonsmedico /*String*/ ,"Tribunal",mostCurrent._sharecode._userreasonsassist /*String*/ ,"Tribunal","Luto","FÉRIAS",mostCurrent._sharecode._userreasonsoutras /*String*/ }));
RDebugUtils.currentLine=198967307;
 //BA.debugLineNum = 198967307;BA.debugLine="Dim TipoDlg As Int = 0";
_tipodlg = (int) (0);
RDebugUtils.currentLine=198967309;
 //BA.debugLineNum = 198967309;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=198967311;
 //BA.debugLineNum = 198967311;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=198967312;
 //BA.debugLineNum = 198967312;BA.debugLine="Filter.getuserRegistoManualJornada(\"User\", reason";
_filter._getuserregistomanualjornada /*void*/ (null,(Object)("User"),_reasons,_causes,_tipodlg);
RDebugUtils.currentLine=198967314;
 //BA.debugLineNum = 198967314;BA.debugLine="End Sub";
return "";
}
public static void  _butuserpauseaction_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butuserpauseaction_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butuserpauseaction_click", null); return;}
ResumableSub_butUserPauseAction_Click rsub = new ResumableSub_butUserPauseAction_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butUserPauseAction_Click extends BA.ResumableSub {
public ResumableSub_butUserPauseAction_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.user parent;
int _i = 0;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=198377473;
 //BA.debugLineNum = 198377473;BA.debugLine="If ShareCode.SESS_IN_PAUSE = 1 Then";
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent._sharecode._sess_in_pause /*int*/ ==1) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=198377474;
 //BA.debugLineNum = 198377474;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=198377475;
 //BA.debugLineNum = 198377475;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=198377476;
 //BA.debugLineNum = 198377476;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
parent.mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=198377477;
 //BA.debugLineNum = 198377477;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",parent.mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=198377478;
 //BA.debugLineNum = 198377478;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
RDebugUtils.currentLine=198377480;
 //BA.debugLineNum = 198377480;BA.debugLine="If ShareCode.PREVIOUS_STATUS = \"ON\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent.mostCurrent._sharecode._previous_status /*String*/ ).equals("ON")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=198377481;
 //BA.debugLineNum = 198377481;BA.debugLine="butUserStartWork.TextColor = Consts.ColorGreen";
parent.mostCurrent._butuserstartwork.setTextColor(parent.mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=198377482;
 //BA.debugLineNum = 198377482;BA.debugLine="ButtonUserUnavailable.Color = Consts.ColorGree";
parent.mostCurrent._buttonuserunavailable.setColor(parent.mostCurrent._consts._colorgreen /*int*/ );
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=198377484;
 //BA.debugLineNum = 198377484;BA.debugLine="butUserStartWork.TextColor = Consts.ColorRed";
parent.mostCurrent._butuserstartwork.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=198377485;
 //BA.debugLineNum = 198377485;BA.debugLine="ButtonUserUnavailable.Color = Consts.ColorRed";
parent.mostCurrent._buttonuserunavailable.setColor(parent.mostCurrent._consts._colorred /*int*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 20;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=198377489;
 //BA.debugLineNum = 198377489;BA.debugLine="Msgbox2Async(ShareCode.AvisoIniciarPausa, ShareC";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisoiniciarpausa /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_no /*String*/ ,"",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198377490;
 //BA.debugLineNum = 198377490;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "butuserpauseaction_click"), null);
this.state = 21;
return;
case 21:
//C
this.state = 16;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=198377491;
 //BA.debugLineNum = 198377491;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=198377492;
 //BA.debugLineNum = 198377492;BA.debugLine="ShareCode.SESS_IN_PAUSE = 1";
parent.mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (1);
RDebugUtils.currentLine=198377493;
 //BA.debugLineNum = 198377493;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",parent.mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=198377494;
 //BA.debugLineNum = 198377494;BA.debugLine="Starter.AppState.Flush";
parent.mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
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
RDebugUtils.currentLine=198377498;
 //BA.debugLineNum = 198377498;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=198377499;
 //BA.debugLineNum = 198377499;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _butuserstartwork_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butuserstartwork_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butuserstartwork_click", null); return;}
ResumableSub_butUserStartWork_Click rsub = new ResumableSub_butUserStartWork_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butUserStartWork_Click extends BA.ResumableSub {
public ResumableSub_butUserStartWork_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.user parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=198836226;
 //BA.debugLineNum = 198836226;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_ON"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=198836227;
 //BA.debugLineNum = 198836227;BA.debugLine="MsgboxAsync(\"A Jornada já foi iniciada\",ShareCod";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("A Jornada já foi iniciada"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),processBA);
RDebugUtils.currentLine=198836228;
 //BA.debugLineNum = 198836228;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=198836231;
 //BA.debugLineNum = 198836231;BA.debugLine="Msgbox2Async(ShareCode.MsgUserStartJornada, \"JORN";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msguserstartjornada /*String*/ ),BA.ObjectToCharSequence("JORNADA"),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198836232;
 //BA.debugLineNum = 198836232;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "butuserstartwork_click"), null);
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=198836233;
 //BA.debugLineNum = 198836233;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=198836234;
 //BA.debugLineNum = 198836234;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_20\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_20",user.getObject());
RDebugUtils.currentLine=198836235;
 //BA.debugLineNum = 198836235;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "butuserstartwork_click"),(int) (250));
this.state = 10;
return;
case 10:
//C
this.state = 8;
;
RDebugUtils.currentLine=198836236;
 //BA.debugLineNum = 198836236;BA.debugLine="butUserStartWork.TextColor = Consts.ColorGreen";
parent.mostCurrent._butuserstartwork.setTextColor(parent.mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=198836237;
 //BA.debugLineNum = 198836237;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorGr";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=198836238;
 //BA.debugLineNum = 198836238;BA.debugLine="butUserStopWork.TextColor = Colors.Black";
parent.mostCurrent._butuserstopwork.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=198836239;
 //BA.debugLineNum = 198836239;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
parent.mostCurrent._lblestadouserjornada.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadaactivo /*String*/ ));
RDebugUtils.currentLine=198836240;
 //BA.debugLineNum = 198836240;BA.debugLine="ShareCode.PREVIOUS_STATUS = \"ON\"";
parent.mostCurrent._sharecode._previous_status /*String*/  = "ON";
RDebugUtils.currentLine=198836241;
 //BA.debugLineNum = 198836241;BA.debugLine="File.WriteString(Starter.InternalFolder,$\"${Shar";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_ON"),parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=198836243;
 //BA.debugLineNum = 198836243;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _butuserstopwork_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butuserstopwork_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butuserstopwork_click", null); return;}
ResumableSub_butUserStopWork_Click rsub = new ResumableSub_butUserStopWork_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butUserStopWork_Click extends BA.ResumableSub {
public ResumableSub_butUserStopWork_Click(xevolution.vrcg.devdemov2400.user parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.user parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=198901761;
 //BA.debugLineNum = 198901761;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_ON"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=198901762;
 //BA.debugLineNum = 198901762;BA.debugLine="File.Delete(Starter.InternalFolder,$\"${ShareCode";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_ON"));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=198901764;
 //BA.debugLineNum = 198901764;BA.debugLine="MsgboxAsync(\"A Jornada ainda nao foi iniciada\",S";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("A Jornada ainda nao foi iniciada"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),processBA);
RDebugUtils.currentLine=198901765;
 //BA.debugLineNum = 198901765;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=198901768;
 //BA.debugLineNum = 198901768;BA.debugLine="Msgbox2Async(ShareCode.MsgUserStopJornada, \"JORNA";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msguserstopjornada /*String*/ ),BA.ObjectToCharSequence("JORNADA"),parent.mostCurrent._sharecode._option_yes /*String*/ ,"",parent.mostCurrent._sharecode._option_no /*String*/ ,(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198901769;
 //BA.debugLineNum = 198901769;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "butuserstopwork_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=198901770;
 //BA.debugLineNum = 198901770;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=198901771;
 //BA.debugLineNum = 198901771;BA.debugLine="Utils.LogUserAction(\"TUSRLGOT_21\", Me)";
parent.mostCurrent._utils._loguseraction /*void*/ (mostCurrent.activityBA,"TUSRLGOT_21",user.getObject());
RDebugUtils.currentLine=198901772;
 //BA.debugLineNum = 198901772;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "butuserstopwork_click"),(int) (250));
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=198901773;
 //BA.debugLineNum = 198901773;BA.debugLine="butUserStartWork.TextColor = Colors.Black";
parent.mostCurrent._butuserstartwork.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=198901774;
 //BA.debugLineNum = 198901774;BA.debugLine="butUserStopWork.TextColor = Consts.ColorRed";
parent.mostCurrent._butuserstopwork.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=198901775;
 //BA.debugLineNum = 198901775;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=198901776;
 //BA.debugLineNum = 198901776;BA.debugLine="lblEstadoUserJornada.Text = ShareCode.MsgUserMes";
parent.mostCurrent._lblestadouserjornada.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgusermessagejornadainactivo /*String*/ ));
RDebugUtils.currentLine=198901777;
 //BA.debugLineNum = 198901777;BA.debugLine="ShareCode.PREVIOUS_STATUS = \"OFF\"";
parent.mostCurrent._sharecode._previous_status /*String*/  = "OFF";
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=198901780;
 //BA.debugLineNum = 198901780;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butuserunavailable_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butuserunavailable_click", null));}
anywheresoftware.b4a.objects.collections.List _durations = null;
anywheresoftware.b4a.objects.collections.List _reasons = null;
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=196542464;
 //BA.debugLineNum = 196542464;BA.debugLine="Sub butUserUnavailable_Click";
RDebugUtils.currentLine=196542466;
 //BA.debugLineNum = 196542466;BA.debugLine="If (ShareCode.USR_STATE = 1) Then";
if ((mostCurrent._sharecode._usr_state /*int*/ ==1)) { 
RDebugUtils.currentLine=196542467;
 //BA.debugLineNum = 196542467;BA.debugLine="Dim durations As List";
_durations = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196542468;
 //BA.debugLineNum = 196542468;BA.debugLine="durations.Initialize";
_durations.Initialize();
RDebugUtils.currentLine=196542469;
 //BA.debugLineNum = 196542469;BA.debugLine="durations.Add(ShareCode.userdurationsHoje)";
_durations.Add((Object)(mostCurrent._sharecode._userdurationshoje /*String*/ ));
RDebugUtils.currentLine=196542470;
 //BA.debugLineNum = 196542470;BA.debugLine="durations.Add(ShareCode.userdurationsVarios)";
_durations.Add((Object)(mostCurrent._sharecode._userdurationsvarios /*String*/ ));
RDebugUtils.currentLine=196542472;
 //BA.debugLineNum = 196542472;BA.debugLine="Dim reasons As List";
_reasons = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=196542473;
 //BA.debugLineNum = 196542473;BA.debugLine="reasons.Initialize";
_reasons.Initialize();
RDebugUtils.currentLine=196542474;
 //BA.debugLineNum = 196542474;BA.debugLine="reasons.Add(ShareCode.userreasonsMedico)";
_reasons.Add((Object)(mostCurrent._sharecode._userreasonsmedico /*String*/ ));
RDebugUtils.currentLine=196542475;
 //BA.debugLineNum = 196542475;BA.debugLine="reasons.Add(ShareCode.userreasonsAssist)";
_reasons.Add((Object)(mostCurrent._sharecode._userreasonsassist /*String*/ ));
RDebugUtils.currentLine=196542476;
 //BA.debugLineNum = 196542476;BA.debugLine="reasons.Add(ShareCode.userreasonsDoente)";
_reasons.Add((Object)(mostCurrent._sharecode._userreasonsdoente /*String*/ ));
RDebugUtils.currentLine=196542477;
 //BA.debugLineNum = 196542477;BA.debugLine="reasons.Add(ShareCode.userreasonsOutras)";
_reasons.Add((Object)(mostCurrent._sharecode._userreasonsoutras /*String*/ ));
RDebugUtils.currentLine=196542479;
 //BA.debugLineNum = 196542479;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=196542480;
 //BA.debugLineNum = 196542480;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=196542481;
 //BA.debugLineNum = 196542481;BA.debugLine="Filter.getUserUnavailableDialog(\"User\", duration";
_filter._getuserunavailabledialog /*void*/ (null,(Object)("User"),_durations,_reasons);
 }else {
RDebugUtils.currentLine=196542488;
 //BA.debugLineNum = 196542488;BA.debugLine="CallUnavailableChange";
_callunavailablechange();
 };
RDebugUtils.currentLine=196542490;
 //BA.debugLineNum = 196542490;BA.debugLine="End Sub";
return "";
}
public static String  _butwarehouses_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butwarehouses_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butwarehouses_click", null));}
RDebugUtils.currentLine=195559424;
 //BA.debugLineNum = 195559424;BA.debugLine="Sub butWareHouses_Click";
RDebugUtils.currentLine=195559425;
 //BA.debugLineNum = 195559425;BA.debugLine="mPopMenu.OpenMenu()";
mostCurrent._mpopmenu._openmenu();
RDebugUtils.currentLine=195559426;
 //BA.debugLineNum = 195559426;BA.debugLine="End Sub";
return "";
}
public static String  _callmoreactionsagain(xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "callmoreactionsagain", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "callmoreactionsagain", new Object[] {_currentclaitem}));}
String _tgo = "";
xevolution.vrcg.devdemov2400.types._carobject _carobj = null;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
int _itemstatus = 0;
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
RDebugUtils.currentLine=197787648;
 //BA.debugLineNum = 197787648;BA.debugLine="Public Sub CallMOREActionsAgain(CurrentCLAItem As";
RDebugUtils.currentLine=197787649;
 //BA.debugLineNum = 197787649;BA.debugLine="GoBackMOREActions = True";
_gobackmoreactions = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=197787651;
 //BA.debugLineNum = 197787651;BA.debugLine="Dim tgo As String = \"TSKT-0003\"";
_tgo = "TSKT-0003";
RDebugUtils.currentLine=197787653;
 //BA.debugLineNum = 197787653;BA.debugLine="If (ShareCode.SESS_CurrentCarObject.IsInitialized";
if ((mostCurrent._sharecode._sess_currentcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ .IsInitialized /*boolean*/ )) { 
RDebugUtils.currentLine=197787654;
 //BA.debugLineNum = 197787654;BA.debugLine="Dim CarObj As CarObject = ShareCode.SESS_Current";
_carobj = mostCurrent._sharecode._sess_currentcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ ;
 }else {
RDebugUtils.currentLine=197787656;
 //BA.debugLineNum = 197787656;BA.debugLine="Dim CarObj As CarObject = Types.ClearedCarObject";
_carobj = mostCurrent._types._clearedcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA);
 };
RDebugUtils.currentLine=197787659;
 //BA.debugLineNum = 197787659;BA.debugLine="Dim sSQL As String = $\"select * from alerts where";
_ssql = ("select * from alerts where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tgo))+"'");
RDebugUtils.currentLine=197787660;
 //BA.debugLineNum = 197787660;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=197787661;
 //BA.debugLineNum = 197787661;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"${sSQL}\"$)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+""))));
RDebugUtils.currentLine=197787662;
 //BA.debugLineNum = 197787662;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=197787663;
 //BA.debugLineNum = 197787663;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=197787664;
 //BA.debugLineNum = 197787664;BA.debugLine="Dim ItemStatus As Int = Record.GetInt(\"itemstatu";
_itemstatus = _record.GetInt("itemstatus");
RDebugUtils.currentLine=197787665;
 //BA.debugLineNum = 197787665;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=197787667;
 //BA.debugLineNum = 197787667;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=197787668;
 //BA.debugLineNum = 197787668;BA.debugLine="Filter.GetFastActionDialog(Activity, CurrentCLAI";
_filter._getfastactiondialog /*void*/ (null,mostCurrent._activity,_currentclaitem,"Verificação de viatura",_currentclaitem.Answer /*String*/ ,_tgo,_itemstatus,anywheresoftware.b4a.keywords.Common.False,_carobj);
 }else {
RDebugUtils.currentLine=197787670;
 //BA.debugLineNum = 197787670;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=197787672;
 //BA.debugLineNum = 197787672;BA.debugLine="End Sub";
return "";
}
public static String  _catitems_click(String _menuname) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "catitems_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "catitems_click", new Object[] {_menuname}));}
String _filtername = "";
int _filterid = 0;
RDebugUtils.currentLine=194576384;
 //BA.debugLineNum = 194576384;BA.debugLine="Sub catitems_Click(MenuName As String)";
RDebugUtils.currentLine=194576385;
 //BA.debugLineNum = 194576385;BA.debugLine="listEquipments.Clear";
mostCurrent._listequipments._clear();
RDebugUtils.currentLine=194576386;
 //BA.debugLineNum = 194576386;BA.debugLine="Dim FilterName As String = MenuName";
_filtername = _menuname;
RDebugUtils.currentLine=194576387;
 //BA.debugLineNum = 194576387;BA.debugLine="Dim FilterID As Int = 0";
_filterid = (int) (0);
RDebugUtils.currentLine=194576388;
 //BA.debugLineNum = 194576388;BA.debugLine="If Not(FilterName.ToUpperCase = \"TODOS\") Then";
if (anywheresoftware.b4a.keywords.Common.Not((_filtername.toUpperCase()).equals("TODOS"))) { 
RDebugUtils.currentLine=194576389;
 //BA.debugLineNum = 194576389;BA.debugLine="FilterID = DBStructures.GetIDFrom(\"warehouses_ca";
_filterid = mostCurrent._dbstructures._getidfrom /*int*/ (mostCurrent.activityBA,"warehouses_categories","title",_filtername);
 };
RDebugUtils.currentLine=194576391;
 //BA.debugLineNum = 194576391;BA.debugLine="MakeEquipmentsList(FilterID)";
_makeequipmentslist(_filterid);
RDebugUtils.currentLine=194576392;
 //BA.debugLineNum = 194576392;BA.debugLine="End Sub";
return "";
}
public static String  _makeequipmentslist(int _filter) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeequipmentslist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makeequipmentslist", new Object[] {_filter}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _ssql = "";
int _height = 0;
int _row = 0;
boolean _continua = false;
RDebugUtils.currentLine=194510848;
 //BA.debugLineNum = 194510848;BA.debugLine="Sub MakeEquipmentsList(Filter As Int)";
RDebugUtils.currentLine=194510849;
 //BA.debugLineNum = 194510849;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=194510850;
 //BA.debugLineNum = 194510850;BA.debugLine="Dim sSQL As String = $\"select ifnull(b.title,'')";
_ssql = ("select ifnull(b.title,'') as group_title, d.qtd AS qtdw, ifnull(c.tagdesc,'') as type_title, a.*, d.warehouse_tagcode \n"+"							from dta_articles as a\n"+"							left join dta_articles_groups as b on (b.tagcode=a.article_group)\n"+"							left join type_articlestypes as c on (c.tagcode=a.article_type)\n"+"							inner join dta_warehouses_articles as d on (d.article_tagcode=a.tagcode and\n"+"								d.warehouse_tagcode in (select tagcode from dta_warehouses \n"+"										where object_tagcode in (select tagcode from dta_objects \n"+"											where tagcode in (select vehicle_tagcode from dta_technicals where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"'))))");
RDebugUtils.currentLine=194510858;
 //BA.debugLineNum = 194510858;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=194510859;
 //BA.debugLineNum = 194510859;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=194510860;
 //BA.debugLineNum = 194510860;BA.debugLine="CurrentEquipItem = 0";
_currentequipitem = (int) (0);
RDebugUtils.currentLine=194510861;
 //BA.debugLineNum = 194510861;BA.debugLine="TotalLineItems = Record.RowCount";
_totallineitems = _record.getRowCount();
RDebugUtils.currentLine=194510862;
 //BA.debugLineNum = 194510862;BA.debugLine="Dim Height As Int = 100dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100));
RDebugUtils.currentLine=194510864;
 //BA.debugLineNum = 194510864;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=194510865;
 //BA.debugLineNum = 194510865;BA.debugLine="Height = 140dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (140));
 };
RDebugUtils.currentLine=194510869;
 //BA.debugLineNum = 194510869;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step11 = 1;
final int limit11 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=194510870;
 //BA.debugLineNum = 194510870;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=194510871;
 //BA.debugLineNum = 194510871;BA.debugLine="If Row = 0 Then";
if (_row==0) { 
RDebugUtils.currentLine=194510872;
 //BA.debugLineNum = 194510872;BA.debugLine="USERWAREHOUSE = Utils.IfNullOrEmpty(Record.get";
mostCurrent._userwarehouse = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("warehouse_tagcode"),"");
 };
RDebugUtils.currentLine=194510874;
 //BA.debugLineNum = 194510874;BA.debugLine="Dim Continua As Boolean = True '((Filter = 0) O";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=194510875;
 //BA.debugLineNum = 194510875;BA.debugLine="If (Continua) Then";
if ((_continua)) { 
RDebugUtils.currentLine=194510876;
 //BA.debugLineNum = 194510876;BA.debugLine="listEquipments.Add(CreateEquipListItem(Row, Re";
mostCurrent._listequipments._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createequiplistitem(_row,_record,mostCurrent._listequipments._asview().getWidth(),_height,(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(anywheresoftware.b4a.keywords.Common.Null))).getObject())),(Object)(""));
RDebugUtils.currentLine=194510877;
 //BA.debugLineNum = 194510877;BA.debugLine="If ConfirmProducts And FirstDataLoad Then";
if (_confirmproducts && _firstdataload) { 
RDebugUtils.currentLine=194510878;
 //BA.debugLineNum = 194510878;BA.debugLine="ProductsToConfirm = ProductsToConfirm + 1";
_productstoconfirm = (int) (_productstoconfirm+1);
 };
 };
 }
};
 };
RDebugUtils.currentLine=194510883;
 //BA.debugLineNum = 194510883;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=194510884;
 //BA.debugLineNum = 194510884;BA.debugLine="End Sub";
return "";
}
public static String  _createuserdetailsdata(boolean _clear,xevolution.vrcg.devdemov2400.types._autoidentification _car) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createuserdetailsdata", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createuserdetailsdata", new Object[] {_clear,_car}));}
int _idx = 0;
xevolution.vrcg.devdemov2400.checklist3._itemdata _id = null;
int _t = 0;
int _h = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
anywheresoftware.b4a.objects.B4XViewWrapper _chapter = null;
int _row = 0;
xevolution.vrcg.devdemov2400.types._carobject _carobj = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record1 = null;
RDebugUtils.currentLine=193724416;
 //BA.debugLineNum = 193724416;BA.debugLine="Sub CreateUserDetailsData(clear As Boolean, car As";
RDebugUtils.currentLine=193724417;
 //BA.debugLineNum = 193724417;BA.debugLine="If clear Then";
if (_clear) { 
RDebugUtils.currentLine=193724418;
 //BA.debugLineNum = 193724418;BA.debugLine="UserListView.Clear";
mostCurrent._userlistview._clear /*String*/ (null);
 };
RDebugUtils.currentLine=193724420;
 //BA.debugLineNum = 193724420;BA.debugLine="Dim idx As Int = UserListView.Size";
_idx = mostCurrent._userlistview._getsize /*int*/ (null);
RDebugUtils.currentLine=193724421;
 //BA.debugLineNum = 193724421;BA.debugLine="If idx >0 Then idx = idx-1";
if (_idx>0) { 
_idx = (int) (_idx-1);};
RDebugUtils.currentLine=193724424;
 //BA.debugLineNum = 193724424;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=193724425;
 //BA.debugLineNum = 193724425;BA.debugLine="Dim t As Int = 0";
_t = (int) (0);
RDebugUtils.currentLine=193724426;
 //BA.debugLineNum = 193724426;BA.debugLine="Dim h As Int = 60dip";
_h = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=193724427;
 //BA.debugLineNum = 193724427;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=193724428;
 //BA.debugLineNum = 193724428;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=193724429;
 //BA.debugLineNum = 193724429;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193724436;
 //BA.debugLineNum = 193724436;BA.debugLine="Dim SQL As String = $\"select title, serialnumber,";
_sql = ("select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode in (Select equipment_tagcode from dta_equipments_technicals where technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"')");
RDebugUtils.currentLine=193724438;
 //BA.debugLineNum = 193724438;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=193724439;
 //BA.debugLineNum = 193724439;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=193724440;
 //BA.debugLineNum = 193724440;BA.debugLine="id.ExpandedHeight = 50dip + 40dip + (60dip * Rec";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))+(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))*_record.getRowCount()));
RDebugUtils.currentLine=193724441;
 //BA.debugLineNum = 193724441;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._userchapterequip /*String*/ ,mostCurrent._view_listcollapsegroup_userequip,_id,_idx,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,mostCurrent._types._clearedcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=193724442;
 //BA.debugLineNum = 193724442;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step17 = 1;
final int limit17 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit17 ;_row = _row + step17 ) {
RDebugUtils.currentLine=193724443;
 //BA.debugLineNum = 193724443;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=193724445;
 //BA.debugLineNum = 193724445;BA.debugLine="CreateGroupLineItems(Record, t,  h)";
_creategrouplineitems(_record,_t,_h);
RDebugUtils.currentLine=193724446;
 //BA.debugLineNum = 193724446;BA.debugLine="t = t + 60dip";
_t = (int) (_t+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 }
};
RDebugUtils.currentLine=193724448;
 //BA.debugLineNum = 193724448;BA.debugLine="UserListView.Add(chapter, id)";
mostCurrent._userlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=193724449;
 //BA.debugLineNum = 193724449;BA.debugLine="UserListView.ExpandItem(idx)";
mostCurrent._userlistview._expanditem /*String*/ (null,_idx);
RDebugUtils.currentLine=193724450;
 //BA.debugLineNum = 193724450;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 }else {
RDebugUtils.currentLine=193724452;
 //BA.debugLineNum = 193724452;BA.debugLine="id.ExpandedHeight = 50dip";
_id.ExpandedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=193724453;
 //BA.debugLineNum = 193724453;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._userchapterequip /*String*/ ,mostCurrent._view_listcollapsegroup_userequip,_id,_idx,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,mostCurrent._types._clearedcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=193724454;
 //BA.debugLineNum = 193724454;BA.debugLine="UserListView.Add(chapter, id)";
mostCurrent._userlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=193724455;
 //BA.debugLineNum = 193724455;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 };
RDebugUtils.currentLine=193724457;
 //BA.debugLineNum = 193724457;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=193724459;
 //BA.debugLineNum = 193724459;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=193724460;
 //BA.debugLineNum = 193724460;BA.debugLine="Dim t As Int = 0";
_t = (int) (0);
RDebugUtils.currentLine=193724461;
 //BA.debugLineNum = 193724461;BA.debugLine="Dim h As Int = 60dip";
_h = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=193724462;
 //BA.debugLineNum = 193724462;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=193724463;
 //BA.debugLineNum = 193724463;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=193724464;
 //BA.debugLineNum = 193724464;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193724471;
 //BA.debugLineNum = 193724471;BA.debugLine="Dim SQL As String = $\"Select ifnull(e1.value, '')";
_sql = ("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo, \n"+"			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '0') as vkm, a.*\n"+"			from  dta_objects as a \n"+"			left join dta_objects_fields as e1 on (e1.object_tagcode=a.tagcode and e1.field_tagcode='FIELD_MARCA')\n"+"			left join dta_objects_fields as e2 on (e2.object_tagcode=a.tagcode and e2.field_tagcode='FIELD_MODELO')\n"+"			left join dta_objects_fields as e3 on (e3.object_tagcode=a.tagcode and e3.field_tagcode='FIELD_MATRICULA')\n"+"			left join dta_objects_fields as e4 on (e4.object_tagcode=a.tagcode and e4.field_tagcode='FIELD_KM')\n"+"			-- left join dta_fields as f on (f.tagcode=e.field_tagcode)\n"+"			where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_car.objTagcode /*String*/ ))+"'");
RDebugUtils.currentLine=193724480;
 //BA.debugLineNum = 193724480;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=193724484;
 //BA.debugLineNum = 193724484;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=193724485;
 //BA.debugLineNum = 193724485;BA.debugLine="t = t + 150dip";
_t = (int) (_t+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (150)));
RDebugUtils.currentLine=193724487;
 //BA.debugLineNum = 193724487;BA.debugLine="id.ExpandedHeight = 50dip + t + (20dip * Record.";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+_t+(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20))*_record.getRowCount()));
RDebugUtils.currentLine=193724488;
 //BA.debugLineNum = 193724488;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=193724489;
 //BA.debugLineNum = 193724489;BA.debugLine="Dim CarObj As CarObject = Types.MakeCarObject(ca";
_carobj = mostCurrent._types._makecarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA,_car.objTagcode /*String*/ ,_record.GetString("vmarca"),_record.GetString("vmodelo"),_record.GetString("vmatricula"),_record.GetLong("vkm"));
RDebugUtils.currentLine=193724494;
 //BA.debugLineNum = 193724494;BA.debugLine="CurrentCarObject = CarObj";
mostCurrent._currentcarobject = _carobj;
RDebugUtils.currentLine=193724495;
 //BA.debugLineNum = 193724495;BA.debugLine="ShareCode.SESS_CurrentCarObject = CurrentCarObje";
mostCurrent._sharecode._sess_currentcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/  = mostCurrent._currentcarobject;
RDebugUtils.currentLine=193724496;
 //BA.debugLineNum = 193724496;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._userchapterviatura /*String*/ ,"ListCollapseGroup_UserCar",_id,_idx,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,_carobj);
RDebugUtils.currentLine=193724499;
 //BA.debugLineNum = 193724499;BA.debugLine="CreateGroupLineAuto(car.Name, car.model, car.Pla";
_creategrouplineauto(_car.Name /*String*/ ,_car.Model /*String*/ ,_car.Plate /*String*/ ,_car.Tag /*String*/ ,(int) (0),_t,_idx,_carobj);
RDebugUtils.currentLine=193724506;
 //BA.debugLineNum = 193724506;BA.debugLine="UserListView.Add(chapter, id)";
mostCurrent._userlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=193724507;
 //BA.debugLineNum = 193724507;BA.debugLine="UserListView.ExpandItem(idx)";
mostCurrent._userlistview._expanditem /*String*/ (null,_idx);
RDebugUtils.currentLine=193724508;
 //BA.debugLineNum = 193724508;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 }else {
RDebugUtils.currentLine=193724510;
 //BA.debugLineNum = 193724510;BA.debugLine="id.ExpandedHeight = 50dip + t";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+_t);
RDebugUtils.currentLine=193724511;
 //BA.debugLineNum = 193724511;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._userchapterviatura /*String*/ ,"ListCollapseGroup_UserCar",_id,_idx,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.True,mostCurrent._types._clearedcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=193724512;
 //BA.debugLineNum = 193724512;BA.debugLine="UserListView.Add(chapter, id)";
mostCurrent._userlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=193724513;
 //BA.debugLineNum = 193724513;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 };
RDebugUtils.currentLine=193724515;
 //BA.debugLineNum = 193724515;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=193724517;
 //BA.debugLineNum = 193724517;BA.debugLine="Dim id As ItemData";
_id = new xevolution.vrcg.devdemov2400.checklist3._itemdata();
RDebugUtils.currentLine=193724518;
 //BA.debugLineNum = 193724518;BA.debugLine="Dim t As Int = 0";
_t = (int) (0);
RDebugUtils.currentLine=193724519;
 //BA.debugLineNum = 193724519;BA.debugLine="Dim h As Int = 60dip";
_h = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=193724520;
 //BA.debugLineNum = 193724520;BA.debugLine="id.Initialize";
_id.Initialize();
RDebugUtils.currentLine=193724521;
 //BA.debugLineNum = 193724521;BA.debugLine="id.CollapsedHeight = 50dip";
_id.CollapsedHeight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50));
RDebugUtils.currentLine=193724522;
 //BA.debugLineNum = 193724522;BA.debugLine="Private Record1 As Cursor";
_record1 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193724526;
 //BA.debugLineNum = 193724526;BA.debugLine="Dim SQL As String = $\"select * from loc_userssess";
_sql = ("select * from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._starter._localsessioncode /*String*/ ))+"'");
RDebugUtils.currentLine=193724527;
 //BA.debugLineNum = 193724527;BA.debugLine="Record1 = Starter.LocalSQLWRK.ExecQuery(SQL)";
_record1 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=193724528;
 //BA.debugLineNum = 193724528;BA.debugLine="If Record1.RowCount > 0 Then";
if (_record1.getRowCount()>0) { 
RDebugUtils.currentLine=193724530;
 //BA.debugLineNum = 193724530;BA.debugLine="id.ExpandedHeight = 50dip + 40dip + t + (60dip *";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40))+_t+(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60))*_record1.getRowCount()));
RDebugUtils.currentLine=193724531;
 //BA.debugLineNum = 193724531;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._userchapterusers /*String*/ ,mostCurrent._view_listcollapsegroup_userregister,_id,_idx,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,mostCurrent._types._clearedcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=193724532;
 //BA.debugLineNum = 193724532;BA.debugLine="For Row = 0 To Record1.RowCount-1";
{
final int step70 = 1;
final int limit70 = (int) (_record1.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit70 ;_row = _row + step70 ) {
RDebugUtils.currentLine=193724533;
 //BA.debugLineNum = 193724533;BA.debugLine="Record1.Position = Row";
_record1.setPosition(_row);
RDebugUtils.currentLine=193724534;
 //BA.debugLineNum = 193724534;BA.debugLine="CreateGroupLineItemsUserRegister(Record1, t,  h";
_creategrouplineitemsuserregister(_record1,_t,_h,_chapter.getWidth());
RDebugUtils.currentLine=193724535;
 //BA.debugLineNum = 193724535;BA.debugLine="t = t + 60dip";
_t = (int) (_t+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
 }
};
RDebugUtils.currentLine=193724537;
 //BA.debugLineNum = 193724537;BA.debugLine="UserListView.Add(chapter, id)";
mostCurrent._userlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=193724538;
 //BA.debugLineNum = 193724538;BA.debugLine="UserListView.ExpandItem(idx)";
mostCurrent._userlistview._expanditem /*String*/ (null,_idx);
RDebugUtils.currentLine=193724539;
 //BA.debugLineNum = 193724539;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 }else {
RDebugUtils.currentLine=193724541;
 //BA.debugLineNum = 193724541;BA.debugLine="id.ExpandedHeight = 50dip + t";
_id.ExpandedHeight /*int*/  = (int) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))+_t);
RDebugUtils.currentLine=193724542;
 //BA.debugLineNum = 193724542;BA.debugLine="Dim chapter As B4XView = CreateChapter(Colors.Gr";
_chapter = new anywheresoftware.b4a.objects.B4XViewWrapper();
_chapter = _createchapter(anywheresoftware.b4a.keywords.Common.Colors.Gray,mostCurrent._sharecode._userchapterusers /*String*/ ,"VIEW_ListCollapseGroup_UserRegister",_id,_idx,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False,mostCurrent._types._clearedcarobject /*xevolution.vrcg.devdemov2400.types._carobject*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=193724543;
 //BA.debugLineNum = 193724543;BA.debugLine="UserListView.Add(chapter, id)";
mostCurrent._userlistview._add /*String*/ (null,_chapter,(Object)(_id));
RDebugUtils.currentLine=193724544;
 //BA.debugLineNum = 193724544;BA.debugLine="idx = idx + 1";
_idx = (int) (_idx+1);
 };
RDebugUtils.currentLine=193724546;
 //BA.debugLineNum = 193724546;BA.debugLine="Record1.Close";
_record1.Close();
RDebugUtils.currentLine=193724550;
 //BA.debugLineNum = 193724550;BA.debugLine="End Sub";
return "";
}
public static String  _changeuseroperation(String _tagcode) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changeuseroperation", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changeuseroperation", new Object[] {_tagcode}));}
int _i = 0;
String _nsql = "";
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _usercodename = "";
String _photo = "";
String _title = "";
String _name = "";
RDebugUtils.currentLine=198049792;
 //BA.debugLineNum = 198049792;BA.debugLine="Sub ChangeUserOperation(tagcode As String)";
RDebugUtils.currentLine=198049794;
 //BA.debugLineNum = 198049794;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.UserWorkSessionC";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._userworksessionchange /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalnotetitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=198049795;
 //BA.debugLineNum = 198049795;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=198049797;
 //BA.debugLineNum = 198049797;BA.debugLine="userPhoto.Background = Null";
mostCurrent._userphoto.setBackground((android.graphics.drawable.Drawable)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=198049799;
 //BA.debugLineNum = 198049799;BA.debugLine="Dim nSQL As String = $\"select a.*, ifnull(c.phot";
_nsql = ("select a.*, ifnull(c.photo, ifnull(a.foto, '')) as photo \n"+"			from dta_technicals as a\n"+"			inner join aut_users as b on (b.tagcode=a.user_tagcode)\n"+"			inner join aut_users_details as c on (c.user_tagcode=a.user_tagcode)\n"+"			where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=198049804;
 //BA.debugLineNum = 198049804;BA.debugLine="Log(nSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6198049804",_nsql,0);
RDebugUtils.currentLine=198049805;
 //BA.debugLineNum = 198049805;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=198049806;
 //BA.debugLineNum = 198049806;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=198049807;
 //BA.debugLineNum = 198049807;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(nSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_nsql)));
RDebugUtils.currentLine=198049808;
 //BA.debugLineNum = 198049808;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=198049809;
 //BA.debugLineNum = 198049809;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=198049810;
 //BA.debugLineNum = 198049810;BA.debugLine="Dim userCodeName As String = Utils.IfNullOrEmpt";
_usercodename = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("username"),"");
RDebugUtils.currentLine=198049811;
 //BA.debugLineNum = 198049811;BA.debugLine="Dim photo As String = Utils.IfNullOrEmpty(Recor";
_photo = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("photo"),"");
RDebugUtils.currentLine=198049812;
 //BA.debugLineNum = 198049812;BA.debugLine="Dim title As String = Utils.IfNullOrEmpty(Recor";
_title = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("jobtitle"),"");
RDebugUtils.currentLine=198049813;
 //BA.debugLineNum = 198049813;BA.debugLine="Dim tagcode As String = Utils.IfNullOrEmpty(Rec";
_tagcode = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("tagcode"),"");
RDebugUtils.currentLine=198049814;
 //BA.debugLineNum = 198049814;BA.debugLine="Dim name As String = Utils.IfNullOrEmpty(Record";
_name = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("title"),"");
 };
RDebugUtils.currentLine=198049816;
 //BA.debugLineNum = 198049816;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=198049818;
 //BA.debugLineNum = 198049818;BA.debugLine="userCategory.text = title";
mostCurrent._usercategory.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=198049819;
 //BA.debugLineNum = 198049819;BA.debugLine="userCode.Text = userCodeName";
mostCurrent._usercode.setText(BA.ObjectToCharSequence(_usercodename));
RDebugUtils.currentLine=198049821;
 //BA.debugLineNum = 198049821;BA.debugLine="userName.text = name";
mostCurrent._username.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=198049822;
 //BA.debugLineNum = 198049822;BA.debugLine="userTagcode.text = tagcode";
mostCurrent._usertagcode.setText(BA.ObjectToCharSequence(_tagcode));
RDebugUtils.currentLine=198049823;
 //BA.debugLineNum = 198049823;BA.debugLine="If Not(Utils.isNullOrEmpty(photo)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_photo))) { 
RDebugUtils.currentLine=198049824;
 //BA.debugLineNum = 198049824;BA.debugLine="photo = photo.Replace(\"data:image/png;base64,\",";
_photo = _photo.replace("data:image/png;base64,","");
RDebugUtils.currentLine=198049825;
 //BA.debugLineNum = 198049825;BA.debugLine="userPhoto.SetBackgroundImage(Utils.B64ToBitmap(";
mostCurrent._userphoto.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,_photo).getObject()));
 };
RDebugUtils.currentLine=198049855;
 //BA.debugLineNum = 198049855;BA.debugLine="ShareCode.SESS_OPER_User = tagcode";
mostCurrent._sharecode._sess_oper_user /*String*/  = _tagcode;
RDebugUtils.currentLine=198049856;
 //BA.debugLineNum = 198049856;BA.debugLine="ShareCode.SESS_OPER_UserName = name";
mostCurrent._sharecode._sess_oper_username /*String*/  = _name;
RDebugUtils.currentLine=198049857;
 //BA.debugLineNum = 198049857;BA.debugLine="ShareCode.SESS_OPER_UWDUKEY = userCodeName";
mostCurrent._sharecode._sess_oper_uwdukey /*String*/  = _usercodename;
RDebugUtils.currentLine=198049858;
 //BA.debugLineNum = 198049858;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
 };
RDebugUtils.currentLine=198049860;
 //BA.debugLineNum = 198049860;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createchapter(int _clr,String _title,String _layout,xevolution.vrcg.devdemov2400.checklist3._itemdata _id,int _idx,boolean _expanded,boolean _iscar,boolean _showbut,xevolution.vrcg.devdemov2400.types._carobject _carobj) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createchapter", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(mostCurrent.activityBA, "createchapter", new Object[] {_clr,_title,_layout,_id,_idx,_expanded,_iscar,_showbut,_carobj}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=193789952;
 //BA.debugLineNum = 193789952;BA.debugLine="Sub CreateChapter(clr As Int, Title As String, lay";
RDebugUtils.currentLine=193789953;
 //BA.debugLineNum = 193789953;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._xui.CreatePanel(processBA,"");
RDebugUtils.currentLine=193789954;
 //BA.debugLineNum = 193789954;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, UserListView.sv.widt";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),mostCurrent._userlistview._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_id.ExpandedHeight /*int*/ );
RDebugUtils.currentLine=193789955;
 //BA.debugLineNum = 193789955;BA.debugLine="p.LoadLayout(layout)";
_p.LoadLayout(_layout,mostCurrent.activityBA);
RDebugUtils.currentLine=193789956;
 //BA.debugLineNum = 193789956;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, p.Width,id.Collapsed";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_p.getWidth(),_id.CollapsedHeight /*int*/ );
RDebugUtils.currentLine=193789957;
 //BA.debugLineNum = 193789957;BA.debugLine="lblGroupTitle.Text = Title";
mostCurrent._lblgrouptitle.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=193789958;
 //BA.debugLineNum = 193789958;BA.debugLine="lblGroupTitle.Tag = idx";
mostCurrent._lblgrouptitle.setTag((Object)(_idx));
RDebugUtils.currentLine=193789959;
 //BA.debugLineNum = 193789959;BA.debugLine="pnlGroupTitle.Tag = idx";
mostCurrent._pnlgrouptitle.setTag((Object)(_idx));
RDebugUtils.currentLine=193789960;
 //BA.debugLineNum = 193789960;BA.debugLine="butGroupCollpseExpand.Tag = idx";
mostCurrent._butgroupcollpseexpand.setTag((Object)(_idx));
RDebugUtils.currentLine=193789961;
 //BA.debugLineNum = 193789961;BA.debugLine="If (isCar) Then";
if ((_iscar)) { 
RDebugUtils.currentLine=193789962;
 //BA.debugLineNum = 193789962;BA.debugLine="butGroupCarChange.Tag = carObj";
mostCurrent._butgroupcarchange.setTag((Object)(_carobj));
RDebugUtils.currentLine=193789963;
 //BA.debugLineNum = 193789963;BA.debugLine="butGroupCarChange.Visible = showBut";
mostCurrent._butgroupcarchange.setVisible(_showbut);
 };
RDebugUtils.currentLine=193789965;
 //BA.debugLineNum = 193789965;BA.debugLine="p.Tag = Expanded 'collapsed";
_p.setTag((Object)(_expanded));
RDebugUtils.currentLine=193789966;
 //BA.debugLineNum = 193789966;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=193789967;
 //BA.debugLineNum = 193789967;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createdoclistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _recordr,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createdoclistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createdoclistitem", new Object[] {_cnt,_recordr,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _document = "";
String _valid = "";
String _grouptype = "";
String _tagcode = "";
String _filename = "";
RDebugUtils.currentLine=194248704;
 //BA.debugLineNum = 194248704;BA.debugLine="Sub CreateDocListItem(cnt As Int, Recordr As Curso";
RDebugUtils.currentLine=194248705;
 //BA.debugLineNum = 194248705;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=194248706;
 //BA.debugLineNum = 194248706;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=194248707;
 //BA.debugLineNum = 194248707;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=194248708;
 //BA.debugLineNum = 194248708;BA.debugLine="p.LoadLayout(\"user_DocumentItem\")";
_p.LoadLayout("user_DocumentItem",mostCurrent.activityBA);
RDebugUtils.currentLine=194248709;
 //BA.debugLineNum = 194248709;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=194248711;
 //BA.debugLineNum = 194248711;BA.debugLine="Dim Document As String = Utils.IfNullOrEmpty(Reco";
_document = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_recordr.GetString("title"),"");
RDebugUtils.currentLine=194248712;
 //BA.debugLineNum = 194248712;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(Recordr";
_valid = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_recordr.GetString("valid_to"),"");
RDebugUtils.currentLine=194248713;
 //BA.debugLineNum = 194248713;BA.debugLine="Dim GroupType As String = Utils.IfNullOrEmpty(Rec";
_grouptype = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_recordr.GetString("doctype_title"),"");
RDebugUtils.currentLine=194248714;
 //BA.debugLineNum = 194248714;BA.debugLine="Dim tagcode As String = Recordr.GetString(\"tagcod";
_tagcode = _recordr.GetString("tagcode");
RDebugUtils.currentLine=194248715;
 //BA.debugLineNum = 194248715;BA.debugLine="Dim FileName As String = Utils.IfNullOrEmpty(Reco";
_filename = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_recordr.GetString("doc_filename"),"");
RDebugUtils.currentLine=194248716;
 //BA.debugLineNum = 194248716;BA.debugLine="p.Tag = FileName";
_p.setTag((Object)(_filename));
RDebugUtils.currentLine=194248717;
 //BA.debugLineNum = 194248717;BA.debugLine="ListItemTitle.text = Document";
mostCurrent._listitemtitle.setText(BA.ObjectToCharSequence(_document));
RDebugUtils.currentLine=194248718;
 //BA.debugLineNum = 194248718;BA.debugLine="ListItemInformation.text =  $\"${GroupType} - ${Fi";
mostCurrent._listiteminformation.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_grouptype))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"")));
RDebugUtils.currentLine=194248719;
 //BA.debugLineNum = 194248719;BA.debugLine="ListItemDates.text = Valid";
mostCurrent._listitemdates.setText(BA.ObjectToCharSequence(_valid));
RDebugUtils.currentLine=194248720;
 //BA.debugLineNum = 194248720;BA.debugLine="ListItemDocView.Tag = FileName";
mostCurrent._listitemdocview.setTag((Object)(_filename));
RDebugUtils.currentLine=194248721;
 //BA.debugLineNum = 194248721;BA.debugLine="ListItemRefresh.Tag = tagcode";
mostCurrent._listitemrefresh.setTag((Object)(_tagcode));
RDebugUtils.currentLine=194248722;
 //BA.debugLineNum = 194248722;BA.debugLine="If FileName.EndsWith(\"pdf\") Then";
if (_filename.endsWith("pdf")) { 
RDebugUtils.currentLine=194248723;
 //BA.debugLineNum = 194248723;BA.debugLine="ListItemDocView.text = Chr(0xF1C1)";
mostCurrent._listitemdocview.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c1))));
 }else 
{RDebugUtils.currentLine=194248724;
 //BA.debugLineNum = 194248724;BA.debugLine="else if FileName.EndsWith (\"xls\") Or FileName.End";
if (_filename.endsWith("xls") || _filename.endsWith("xlsx")) { 
RDebugUtils.currentLine=194248725;
 //BA.debugLineNum = 194248725;BA.debugLine="ListItemDocView.Text = Chr(0xF1C3)";
mostCurrent._listitemdocview.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c3))));
 }else 
{RDebugUtils.currentLine=194248726;
 //BA.debugLineNum = 194248726;BA.debugLine="Else If FileName.EndsWith (\"doc\") Or FileName.End";
if (_filename.endsWith("doc") || _filename.endsWith("docx")) { 
RDebugUtils.currentLine=194248727;
 //BA.debugLineNum = 194248727;BA.debugLine="ListItemDocView.Text = Chr(0xF1C2)";
mostCurrent._listitemdocview.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c2))));
 }else 
{RDebugUtils.currentLine=194248728;
 //BA.debugLineNum = 194248728;BA.debugLine="Else If FileName.EndsWith (\"jpg\") Or FileName.End";
if (_filename.endsWith("jpg") || _filename.endsWith("png")) { 
RDebugUtils.currentLine=194248729;
 //BA.debugLineNum = 194248729;BA.debugLine="ListItemDocView.Text = Chr(0xF1C5)";
mostCurrent._listitemdocview.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf1c5))));
 }else {
RDebugUtils.currentLine=194248731;
 //BA.debugLineNum = 194248731;BA.debugLine="ListItemDocView.Text = Chr(0xF016)";
mostCurrent._listitemdocview.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf016))));
 }}}}
;
RDebugUtils.currentLine=194248737;
 //BA.debugLineNum = 194248737;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=194248738;
 //BA.debugLineNum = 194248738;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createequiplistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _record,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createequiplistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createequiplistitem", new Object[] {_cnt,_record,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _status = 0;
int _qtd = 0;
String _notes = "";
String _tagcode = "";
String _category = "";
String _title = "";
int _minqtd = 0;
RDebugUtils.currentLine=194707456;
 //BA.debugLineNum = 194707456;BA.debugLine="Sub CreateEquipListItem(cnt As Int, Record As Curs";
RDebugUtils.currentLine=194707457;
 //BA.debugLineNum = 194707457;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=194707458;
 //BA.debugLineNum = 194707458;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=194707459;
 //BA.debugLineNum = 194707459;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=194707460;
 //BA.debugLineNum = 194707460;BA.debugLine="p.LoadLayout(\"user_EquipmentItem\")";
_p.LoadLayout("user_EquipmentItem",mostCurrent.activityBA);
RDebugUtils.currentLine=194707461;
 //BA.debugLineNum = 194707461;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=194707464;
 //BA.debugLineNum = 194707464;BA.debugLine="Dim Status As Int = Record.GetInt(\"active\")";
_status = _record.GetInt("active");
RDebugUtils.currentLine=194707465;
 //BA.debugLineNum = 194707465;BA.debugLine="ButtonListConfirm.Tag = 0";
mostCurrent._buttonlistconfirm.setTag((Object)(0));
RDebugUtils.currentLine=194707466;
 //BA.debugLineNum = 194707466;BA.debugLine="ButtonListNotConfirm.Tag = 0";
mostCurrent._buttonlistnotconfirm.setTag((Object)(0));
RDebugUtils.currentLine=194707467;
 //BA.debugLineNum = 194707467;BA.debugLine="If Status = 1 Then";
if (_status==1) { 
RDebugUtils.currentLine=194707468;
 //BA.debugLineNum = 194707468;BA.debugLine="ButtonListConfirm.TextColor = Consts.ColorGreen";
mostCurrent._buttonlistconfirm.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=194707469;
 //BA.debugLineNum = 194707469;BA.debugLine="ButtonListConfirm.Tag = Status";
mostCurrent._buttonlistconfirm.setTag((Object)(_status));
 }else 
{RDebugUtils.currentLine=194707470;
 //BA.debugLineNum = 194707470;BA.debugLine="else if Status = 2 Then";
if (_status==2) { 
RDebugUtils.currentLine=194707471;
 //BA.debugLineNum = 194707471;BA.debugLine="ButtonListNotConfirm.TextColor = Consts.ColorRed";
mostCurrent._buttonlistnotconfirm.setTextColor(mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=194707472;
 //BA.debugLineNum = 194707472;BA.debugLine="ButtonListNotConfirm.Tag = Status";
mostCurrent._buttonlistnotconfirm.setTag((Object)(_status));
 }}
;
RDebugUtils.currentLine=194707475;
 //BA.debugLineNum = 194707475;BA.debugLine="Dim qtd As Int = Record.GetInt(\"qtdw\")";
_qtd = _record.GetInt("qtdw");
RDebugUtils.currentLine=194707476;
 //BA.debugLineNum = 194707476;BA.debugLine="Dim notes As String = Utils.IfNullOrEmpty(Record.";
_notes = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("details"),"");
RDebugUtils.currentLine=194707477;
 //BA.debugLineNum = 194707477;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagcode";
_tagcode = _record.GetString("tagcode");
RDebugUtils.currentLine=194707478;
 //BA.debugLineNum = 194707478;BA.debugLine="Dim category As String = Utils.IfNullOrEmpty(Reco";
_category = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("group_title"),"");
RDebugUtils.currentLine=194707479;
 //BA.debugLineNum = 194707479;BA.debugLine="Dim title As String = Utils.IfNullOrEmpty(Record.";
_title = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("title"),"");
RDebugUtils.currentLine=194707480;
 //BA.debugLineNum = 194707480;BA.debugLine="Dim MinQtd As Int = Record.GetInt(\"minqtd\")";
_minqtd = _record.GetInt("minqtd");
RDebugUtils.currentLine=194707482;
 //BA.debugLineNum = 194707482;BA.debugLine="ListItemCategory.text = category";
mostCurrent._listitemcategory.setText(BA.ObjectToCharSequence(_category));
RDebugUtils.currentLine=194707483;
 //BA.debugLineNum = 194707483;BA.debugLine="ListItemNotes.text = notes";
mostCurrent._listitemnotes.setText(BA.ObjectToCharSequence(_notes));
RDebugUtils.currentLine=194707484;
 //BA.debugLineNum = 194707484;BA.debugLine="ListItemReference.text = tagcode";
mostCurrent._listitemreference.setText(BA.ObjectToCharSequence(_tagcode));
RDebugUtils.currentLine=194707485;
 //BA.debugLineNum = 194707485;BA.debugLine="ListItemTitle.text = title";
mostCurrent._listitemtitle.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=194707486;
 //BA.debugLineNum = 194707486;BA.debugLine="ListItemQtd.text = qtd";
mostCurrent._listitemqtd.setText(BA.ObjectToCharSequence(_qtd));
RDebugUtils.currentLine=194707487;
 //BA.debugLineNum = 194707487;BA.debugLine="ListItemMinQtd.Text = MinQtd";
mostCurrent._listitemminqtd.setText(BA.ObjectToCharSequence(_minqtd));
RDebugUtils.currentLine=194707489;
 //BA.debugLineNum = 194707489;BA.debugLine="p.Tag = tagcode 'id";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=194707491;
 //BA.debugLineNum = 194707491;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=194707492;
 //BA.debugLineNum = 194707492;BA.debugLine="End Sub";
return null;
}
public static String  _creategrouplineauto(String _title,String _model,String _plate,String _tagcode,int _top,int _height,int _idx,xevolution.vrcg.devdemov2400.types._carobject _carobj) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrouplineauto", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrouplineauto", new Object[] {_title,_model,_plate,_tagcode,_top,_height,_idx,_carobj}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=193986560;
 //BA.debugLineNum = 193986560;BA.debugLine="Sub CreateGroupLineAuto(Title As String, Model As";
RDebugUtils.currentLine=193986561;
 //BA.debugLineNum = 193986561;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=193986562;
 //BA.debugLineNum = 193986562;BA.debugLine="p.Initialize(\"GroupLineClick\")";
_p.Initialize(mostCurrent.activityBA,"GroupLineClick");
RDebugUtils.currentLine=193986563;
 //BA.debugLineNum = 193986563;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=193986564;
 //BA.debugLineNum = 193986564;BA.debugLine="p.LoadLayout(VIEW_ItemUserAuto)";
_p.LoadLayout(mostCurrent._view_itemuserauto,mostCurrent.activityBA);
RDebugUtils.currentLine=193986565;
 //BA.debugLineNum = 193986565;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=193986568;
 //BA.debugLineNum = 193986568;BA.debugLine="butGrpLineChange.Tag = Tagcode";
mostCurrent._butgrplinechange.setTag((Object)(_tagcode));
RDebugUtils.currentLine=193986569;
 //BA.debugLineNum = 193986569;BA.debugLine="lblGroupLineDesc.Text = Title";
mostCurrent._lblgrouplinedesc.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=193986570;
 //BA.debugLineNum = 193986570;BA.debugLine="lblGroupLineModel.text = Model";
mostCurrent._lblgrouplinemodel.setText(BA.ObjectToCharSequence(_model));
RDebugUtils.currentLine=193986571;
 //BA.debugLineNum = 193986571;BA.debugLine="lblGroupLinePlate.Text = Plate";
mostCurrent._lblgrouplineplate.setText(BA.ObjectToCharSequence(_plate));
RDebugUtils.currentLine=193986574;
 //BA.debugLineNum = 193986574;BA.debugLine="butGrpLineChange.Tag = CarObj '$\"${Tagcode}|${Pla";
mostCurrent._butgrplinechange.setTag((Object)(_carobj));
RDebugUtils.currentLine=193986575;
 //BA.debugLineNum = 193986575;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=193986577;
 //BA.debugLineNum = 193986577;BA.debugLine="pnlGroupExpanded.AddView(p, 0, top, p.Width, heig";
mostCurrent._pnlgroupexpanded.AddView((android.view.View)(_p.getObject()),(int) (0),_top,_p.getWidth(),_height);
RDebugUtils.currentLine=193986578;
 //BA.debugLineNum = 193986578;BA.debugLine="End Sub";
return "";
}
public static String  _creategrouplineitems(anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _top,int _height) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrouplineitems", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrouplineitems", new Object[] {_colitems,_top,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _equipment = "";
String _serial = "";
String _valid = "";
String _tagcode = "";
RDebugUtils.currentLine=193855488;
 //BA.debugLineNum = 193855488;BA.debugLine="Sub CreateGroupLineItems(colitems As Cursor, top A";
RDebugUtils.currentLine=193855489;
 //BA.debugLineNum = 193855489;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=193855490;
 //BA.debugLineNum = 193855490;BA.debugLine="p.Initialize(\"GroupLineClick\")";
_p.Initialize(mostCurrent.activityBA,"GroupLineClick");
RDebugUtils.currentLine=193855491;
 //BA.debugLineNum = 193855491;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=193855492;
 //BA.debugLineNum = 193855492;BA.debugLine="p.LoadLayout(VIEW_ItemUserEquipment)";
_p.LoadLayout(mostCurrent._view_itemuserequipment,mostCurrent.activityBA);
RDebugUtils.currentLine=193855493;
 //BA.debugLineNum = 193855493;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=193855495;
 //BA.debugLineNum = 193855495;BA.debugLine="Dim Equipment As String = colitems.GetString(\"tit";
_equipment = _colitems.GetString("title");
RDebugUtils.currentLine=193855496;
 //BA.debugLineNum = 193855496;BA.debugLine="Dim Serial As String = Utils.IfNullOrEmpty(colite";
_serial = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("serialnumber"),"");
RDebugUtils.currentLine=193855497;
 //BA.debugLineNum = 193855497;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(colitem";
_valid = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("valid_to"),"");
RDebugUtils.currentLine=193855498;
 //BA.debugLineNum = 193855498;BA.debugLine="Dim Tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=193855501;
 //BA.debugLineNum = 193855501;BA.debugLine="butGrpLineChange.Tag = Tagcode";
mostCurrent._butgrplinechange.setTag((Object)(_tagcode));
RDebugUtils.currentLine=193855503;
 //BA.debugLineNum = 193855503;BA.debugLine="lblGroupLineDesc.Text = Equipment";
mostCurrent._lblgrouplinedesc.setText(BA.ObjectToCharSequence(_equipment));
RDebugUtils.currentLine=193855504;
 //BA.debugLineNum = 193855504;BA.debugLine="lblGroupLineValidate.Text = Valid";
mostCurrent._lblgrouplinevalidate.setText(BA.ObjectToCharSequence(_valid));
RDebugUtils.currentLine=193855505;
 //BA.debugLineNum = 193855505;BA.debugLine="lblGroupLineSerial.Text = Serial";
mostCurrent._lblgrouplineserial.setText(BA.ObjectToCharSequence(_serial));
RDebugUtils.currentLine=193855506;
 //BA.debugLineNum = 193855506;BA.debugLine="p.Tag = 0";
_p.setTag((Object)(0));
RDebugUtils.currentLine=193855508;
 //BA.debugLineNum = 193855508;BA.debugLine="pnlGroupExpanded.AddView(p, 0, top, p.Width, heig";
mostCurrent._pnlgroupexpanded.AddView((android.view.View)(_p.getObject()),(int) (0),_top,_p.getWidth(),_height);
RDebugUtils.currentLine=193855509;
 //BA.debugLineNum = 193855509;BA.debugLine="End Sub";
return "";
}
public static String  _creategrouplineitemsauto(anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _top,int _height,int _idx) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrouplineitemsauto", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrouplineitemsauto", new Object[] {_colitems,_top,_height,_idx}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _equipment = "";
String _valid = "";
String _tagcode = "";
String _filename = "";
RDebugUtils.currentLine=194052096;
 //BA.debugLineNum = 194052096;BA.debugLine="Sub CreateGroupLineItemsAuto(colitems As Cursor, t";
RDebugUtils.currentLine=194052097;
 //BA.debugLineNum = 194052097;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=194052098;
 //BA.debugLineNum = 194052098;BA.debugLine="p.Initialize(\"GroupLineClick\")";
_p.Initialize(mostCurrent.activityBA,"GroupLineClick");
RDebugUtils.currentLine=194052099;
 //BA.debugLineNum = 194052099;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=194052100;
 //BA.debugLineNum = 194052100;BA.debugLine="p.LoadLayout(VIEW_ItemUserAutoLine)";
_p.LoadLayout(mostCurrent._view_itemuserautoline,mostCurrent.activityBA);
RDebugUtils.currentLine=194052101;
 //BA.debugLineNum = 194052101;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=194052103;
 //BA.debugLineNum = 194052103;BA.debugLine="Dim Equipment As String = Utils.IfNullOrEmpty(col";
_equipment = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("title"),"");
RDebugUtils.currentLine=194052105;
 //BA.debugLineNum = 194052105;BA.debugLine="Dim Valid As String = Utils.IfNullOrEmpty(colitem";
_valid = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("valid_to"),"");
RDebugUtils.currentLine=194052106;
 //BA.debugLineNum = 194052106;BA.debugLine="If (Utils.isNull(Valid )) Then Valid = \"\"";
if ((mostCurrent._utils._isnull /*boolean*/ (mostCurrent.activityBA,_valid))) { 
_valid = "";};
RDebugUtils.currentLine=194052107;
 //BA.debugLineNum = 194052107;BA.debugLine="Dim Tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=194052108;
 //BA.debugLineNum = 194052108;BA.debugLine="Dim FileName As String = Utils.IfNullOrEmpty(coli";
_filename = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_colitems.GetString("docfilename"),"");
RDebugUtils.currentLine=194052111;
 //BA.debugLineNum = 194052111;BA.debugLine="lblGroupLineDesc.Text = Equipment";
mostCurrent._lblgrouplinedesc.setText(BA.ObjectToCharSequence(_equipment));
RDebugUtils.currentLine=194052112;
 //BA.debugLineNum = 194052112;BA.debugLine="lblGroupLineDesc.Tag = FileName";
mostCurrent._lblgrouplinedesc.setTag((Object)(_filename));
RDebugUtils.currentLine=194052114;
 //BA.debugLineNum = 194052114;BA.debugLine="lblGroupLineValidate.Text = Valid";
mostCurrent._lblgrouplinevalidate.setText(BA.ObjectToCharSequence(_valid));
RDebugUtils.currentLine=194052115;
 //BA.debugLineNum = 194052115;BA.debugLine="lblGroupLineValidate.Tag = Tagcode";
mostCurrent._lblgrouplinevalidate.setTag((Object)(_tagcode));
RDebugUtils.currentLine=194052118;
 //BA.debugLineNum = 194052118;BA.debugLine="p.Tag = idx";
_p.setTag((Object)(_idx));
RDebugUtils.currentLine=194052119;
 //BA.debugLineNum = 194052119;BA.debugLine="pnlGroupExpanded.AddView(p, 0, top, p.Width, heig";
mostCurrent._pnlgroupexpanded.AddView((android.view.View)(_p.getObject()),(int) (0),_top,_p.getWidth(),_height);
RDebugUtils.currentLine=194052120;
 //BA.debugLineNum = 194052120;BA.debugLine="End Sub";
return "";
}
public static String  _creategrouplineitemsuserregister(anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _top,int _height,int _width) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "creategrouplineitemsuserregister", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "creategrouplineitemsuserregister", new Object[] {_colitems,_top,_height,_width}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _code = "";
String _name = "";
String _tagcode = "";
RDebugUtils.currentLine=193921024;
 //BA.debugLineNum = 193921024;BA.debugLine="Sub CreateGroupLineItemsUserRegister(colitems As C";
RDebugUtils.currentLine=193921025;
 //BA.debugLineNum = 193921025;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=193921026;
 //BA.debugLineNum = 193921026;BA.debugLine="p.Initialize(\"GroupLineClickUser\")";
_p.Initialize(mostCurrent.activityBA,"GroupLineClickUser");
RDebugUtils.currentLine=193921027;
 //BA.debugLineNum = 193921027;BA.debugLine="Activity.AddView(p, 0, 0, width, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=193921028;
 //BA.debugLineNum = 193921028;BA.debugLine="p.LoadLayout(VIEW_ItemUserRegister)";
_p.LoadLayout(mostCurrent._view_itemuserregister,mostCurrent.activityBA);
RDebugUtils.currentLine=193921029;
 //BA.debugLineNum = 193921029;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=193921031;
 //BA.debugLineNum = 193921031;BA.debugLine="Dim code As String = colitems.GetString(\"username";
_code = _colitems.GetString("username");
RDebugUtils.currentLine=193921032;
 //BA.debugLineNum = 193921032;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
_name = _colitems.GetString("name");
RDebugUtils.currentLine=193921033;
 //BA.debugLineNum = 193921033;BA.debugLine="Dim Tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=193921035;
 //BA.debugLineNum = 193921035;BA.debugLine="lblGroupLineCode.Text = code";
mostCurrent._lblgrouplinecode.setText(BA.ObjectToCharSequence(_code));
RDebugUtils.currentLine=193921036;
 //BA.debugLineNum = 193921036;BA.debugLine="lblGroupLineName.Text = name";
mostCurrent._lblgrouplinename.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=193921037;
 //BA.debugLineNum = 193921037;BA.debugLine="lblGroupLineCode.tag = Tagcode";
mostCurrent._lblgrouplinecode.setTag((Object)(_tagcode));
RDebugUtils.currentLine=193921038;
 //BA.debugLineNum = 193921038;BA.debugLine="lblGroupLineName.tag = Tagcode";
mostCurrent._lblgrouplinename.setTag((Object)(_tagcode));
RDebugUtils.currentLine=193921039;
 //BA.debugLineNum = 193921039;BA.debugLine="butGrpLineChange.Tag = Tagcode";
mostCurrent._butgrplinechange.setTag((Object)(_tagcode));
RDebugUtils.currentLine=193921040;
 //BA.debugLineNum = 193921040;BA.debugLine="p.Tag = 0";
_p.setTag((Object)(0));
RDebugUtils.currentLine=193921041;
 //BA.debugLineNum = 193921041;BA.debugLine="pnlGroupExpanded4.AddView(p, 0, top, p.Width, hei";
mostCurrent._pnlgroupexpanded4.AddView((android.view.View)(_p.getObject()),(int) (0),_top,_p.getWidth(),_height);
RDebugUtils.currentLine=193921042;
 //BA.debugLineNum = 193921042;BA.debugLine="End Sub";
return "";
}
public static String  _doccategories_click(String _menuname) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "doccategories_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "doccategories_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=194117632;
 //BA.debugLineNum = 194117632;BA.debugLine="Sub doccategories_Click(MenuName As String)";
RDebugUtils.currentLine=194117642;
 //BA.debugLineNum = 194117642;BA.debugLine="End Sub";
return "";
}
public static void  _downloadfileswithftp(String _filename) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadfileswithftp", false))
	 {Debug.delegate(mostCurrent.activityBA, "downloadfileswithftp", new Object[] {_filename}); return;}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_filename);
rsub.resume(processBA, null);
}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.user parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.user parent;
String _filename;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
String _path = "";
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=194445313;
 //BA.debugLineNum = 194445313;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=194445314;
 //BA.debugLineNum = 194445314;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=194445315;
 //BA.debugLineNum = 194445315;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=194445319;
 //BA.debugLineNum = 194445319;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=194445320;
 //BA.debugLineNum = 194445320;BA.debugLine="Dim path As String = \"/\" & ShareCode.APP_DOMAIN &";
_path = "/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_filename;
RDebugUtils.currentLine=194445321;
 //BA.debugLineNum = 194445321;BA.debugLine="Log($\"file ${filename}, caminho:  ${path}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194445321",("file "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+", caminho:  "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_path))+""),0);
RDebugUtils.currentLine=194445322;
 //BA.debugLineNum = 194445322;BA.debugLine="Dim sf As Object = myFTP.DownloadFile(path, False";
_sf = _myftp.DownloadFile(processBA,_path,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_filename);
RDebugUtils.currentLine=194445323;
 //BA.debugLineNum = 194445323;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "downloadfileswithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=194445324;
 //BA.debugLineNum = 194445324;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=194445325;
 //BA.debugLineNum = 194445325;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6194445325","file was download successfully",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=194445327;
 //BA.debugLineNum = 194445327;BA.debugLine="Log($\"Error downloading file ${ServerPath}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194445327",("Error downloading file "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_serverpath))+""),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=194445337;
 //BA.debugLineNum = 194445337;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=194445338;
 //BA.debugLineNum = 194445338;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _editequipsearch_enterpressed() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editequipsearch_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editequipsearch_enterpressed", null));}
RDebugUtils.currentLine=197328896;
 //BA.debugLineNum = 197328896;BA.debugLine="Sub EditEquipSearch_EnterPressed";
RDebugUtils.currentLine=197328897;
 //BA.debugLineNum = 197328897;BA.debugLine="MakeEquipmentListSearch(EditEquipSearch.Text)";
_makeequipmentlistsearch(mostCurrent._editequipsearch.getText());
RDebugUtils.currentLine=197328898;
 //BA.debugLineNum = 197328898;BA.debugLine="End Sub";
return "";
}
public static String  _editequipsearch_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editequipsearch_textchanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editequipsearch_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=197263360;
 //BA.debugLineNum = 197263360;BA.debugLine="Sub EditEquipSearch_TextChanged (Old As String, Ne";
RDebugUtils.currentLine=197263362;
 //BA.debugLineNum = 197263362;BA.debugLine="End Sub";
return "";
}
public static String  _groupcollpseexpand_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "groupcollpseexpand_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "groupcollpseexpand_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _this = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=196411392;
 //BA.debugLineNum = 196411392;BA.debugLine="Sub GroupCollpseExpand_Click";
RDebugUtils.currentLine=196411393;
 //BA.debugLineNum = 196411393;BA.debugLine="Dim this As B4XView = Sender";
_this = new anywheresoftware.b4a.objects.B4XViewWrapper();
_this = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=196411394;
 //BA.debugLineNum = 196411394;BA.debugLine="If (CurrentGroupItem <> this.Tag) Then";
if ((_currentgroupitem!=(double)(BA.ObjectToNumber(_this.getTag())))) { 
RDebugUtils.currentLine=196411395;
 //BA.debugLineNum = 196411395;BA.debugLine="If Not(Utils.isNullOrEmpty(this.tag)) Then Curre";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,BA.ObjectToString(_this.getTag())))) { 
_currentgroupitem = (int)(BA.ObjectToNumber(_this.getTag()));};
 };
RDebugUtils.currentLine=196411397;
 //BA.debugLineNum = 196411397;BA.debugLine="Dim p As B4XView = UserListView.GetPanel(CurrentG";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = mostCurrent._userlistview._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_currentgroupitem);
RDebugUtils.currentLine=196411398;
 //BA.debugLineNum = 196411398;BA.debugLine="If p.Tag = True Then";
if ((_p.getTag()).equals((Object)(anywheresoftware.b4a.keywords.Common.True))) { 
RDebugUtils.currentLine=196411399;
 //BA.debugLineNum = 196411399;BA.debugLine="UserListView.CollapseItem(CurrentGroupItem)";
mostCurrent._userlistview._collapseitem /*String*/ (null,_currentgroupitem);
 }else {
RDebugUtils.currentLine=196411401;
 //BA.debugLineNum = 196411401;BA.debugLine="UserListView.ExpandItem(CurrentGroupItem)";
mostCurrent._userlistview._expanditem /*String*/ (null,_currentgroupitem);
 };
RDebugUtils.currentLine=196411403;
 //BA.debugLineNum = 196411403;BA.debugLine="End Sub";
return "";
}
public static String  _grouplineautochange_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouplineautochange_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouplineautochange_click", null));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
xevolution.vrcg.devdemov2400.types._carobject _carobj = null;
String _tgo = "";
xevolution.vrcg.devdemov2400.types._requestclaitem _claitem = null;
String _ssql = "";
int _status = 0;
xevolution.vrcg.devdemov2400.appactiondialogs _filter = null;
int _itemstatus = 0;
String _itemdesc = "";
int _i = 0;
RDebugUtils.currentLine=197853184;
 //BA.debugLineNum = 197853184;BA.debugLine="Sub GroupLineAutoChange_Click";
RDebugUtils.currentLine=197853187;
 //BA.debugLineNum = 197853187;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=197853188;
 //BA.debugLineNum = 197853188;BA.debugLine="Dim SQL As String = $\"Select ifnull(a.value, '0')";
_sql = ("Select ifnull(a.value, '0') as vkm \n"+"			from dta_objects_fields as a  where a.field_tagcode='FIELD_KM' and object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._currentcarobject.obj /*String*/ ))+"'");
RDebugUtils.currentLine=197853190;
 //BA.debugLineNum = 197853190;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=197853191;
 //BA.debugLineNum = 197853191;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=197853192;
 //BA.debugLineNum = 197853192;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=197853193;
 //BA.debugLineNum = 197853193;BA.debugLine="CurrentCarObject.km = Record.GetLong(\"vkm\")";
mostCurrent._currentcarobject.km /*long*/  = _record.GetLong("vkm");
 };
RDebugUtils.currentLine=197853195;
 //BA.debugLineNum = 197853195;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=197853196;
 //BA.debugLineNum = 197853196;BA.debugLine="Dim CarObj As CarObject = CurrentCarObject 'btn.t";
_carobj = mostCurrent._currentcarobject;
RDebugUtils.currentLine=197853199;
 //BA.debugLineNum = 197853199;BA.debugLine="Dim tgo As String = \"TSKT-0003\"";
_tgo = "TSKT-0003";
RDebugUtils.currentLine=197853200;
 //BA.debugLineNum = 197853200;BA.debugLine="If (GoBackMOREActions) Then";
if ((_gobackmoreactions)) { 
RDebugUtils.currentLine=197853201;
 //BA.debugLineNum = 197853201;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeReques";
_claitem = mostCurrent._types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (mostCurrent.activityBA,_tgo,_tgo,_tgo,_tgo,_tgo,_tgo,(int) (0),(int) (0),(int) (0),"Verificação de viatura","","GET_MORE_ACTIONS",(int) (1),(int) (0),(int) (0),mostCurrent._currentcarobject.obj /*String*/ ,mostCurrent._dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (mostCurrent.activityBA,"",""),"");
 }else {
RDebugUtils.currentLine=197853205;
 //BA.debugLineNum = 197853205;BA.debugLine="Dim CLAItem As RequestCLAItem = Types.MakeReques";
_claitem = mostCurrent._types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (mostCurrent.activityBA,_tgo,_tgo,_tgo,_tgo,_tgo,_tgo,(int) (0),(int) (0),(int) (0),"Verificação de viatura","","",(int) (1),(int) (0),(int) (0),mostCurrent._currentcarobject.obj /*String*/ ,mostCurrent._dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (mostCurrent.activityBA,"",""),"");
 };
RDebugUtils.currentLine=197853210;
 //BA.debugLineNum = 197853210;BA.debugLine="Dim sSQL As String = $\"select * from alerts where";
_ssql = ("select * from alerts where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tgo))+"'");
RDebugUtils.currentLine=197853211;
 //BA.debugLineNum = 197853211;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=197853212;
 //BA.debugLineNum = 197853212;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"${sSQL}\"$)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+""))));
RDebugUtils.currentLine=197853213;
 //BA.debugLineNum = 197853213;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=197853214;
 //BA.debugLineNum = 197853214;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=197853216;
 //BA.debugLineNum = 197853216;BA.debugLine="Dim Status As Int = Record.GetInt(\"status_id\")";
_status = _record.GetInt("status_id");
RDebugUtils.currentLine=197853217;
 //BA.debugLineNum = 197853217;BA.debugLine="If (Status=1) Then";
if ((_status==1)) { 
RDebugUtils.currentLine=197853218;
 //BA.debugLineNum = 197853218;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=197853219;
 //BA.debugLineNum = 197853219;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=197853221;
 //BA.debugLineNum = 197853221;BA.debugLine="Filter.GetFastActionDialog(Activity, CLAItem, \"";
_filter._getfastactiondialog /*void*/ (null,mostCurrent._activity,_claitem,"Verificação de viatura",("Viatura com matricula "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_carobj.plate /*String*/ ))+" sem danos a registar?"),_tgo,(int) (0),anywheresoftware.b4a.keywords.Common.False,_carobj);
 }else {
RDebugUtils.currentLine=197853223;
 //BA.debugLineNum = 197853223;BA.debugLine="Dim ItemStatus As Int = Record.GetInt(\"itemstat";
_itemstatus = _record.GetInt("itemstatus");
RDebugUtils.currentLine=197853224;
 //BA.debugLineNum = 197853224;BA.debugLine="Dim ItemDesc As String = \"A verificação da viat";
_itemdesc = "A verificação da viatura já foi realizada, sem registo de danos!";
RDebugUtils.currentLine=197853225;
 //BA.debugLineNum = 197853225;BA.debugLine="If (ItemStatus = 2) Then";
if ((_itemstatus==2)) { 
RDebugUtils.currentLine=197853226;
 //BA.debugLineNum = 197853226;BA.debugLine="ItemDesc = \"A verificação da viatura já foi re";
_itemdesc = "A verificação da viatura já foi realizada, com registo de danos!";
 };
RDebugUtils.currentLine=197853228;
 //BA.debugLineNum = 197853228;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=197853229;
 //BA.debugLineNum = 197853229;BA.debugLine="i = Msgbox2($\"${ItemDesc} ${ShareCode.userChoic";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemdesc))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._userchoiceoptionavailable /*String*/ ))+"")),BA.ObjectToCharSequence(mostCurrent._sharecode._generalnotetitle /*String*/ ),mostCurrent._sharecode._useroptionveraccao /*String*/ ,mostCurrent._sharecode._option_cancel /*String*/ ,mostCurrent._sharecode._useroptionreexecuteaccao /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=197853230;
 //BA.debugLineNum = 197853230;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=197853231;
 //BA.debugLineNum = 197853231;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=197853232;
 //BA.debugLineNum = 197853232;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=197853233;
 //BA.debugLineNum = 197853233;BA.debugLine="Filter.GetFastActionDialog(Activity, CLAItem,";
_filter._getfastactiondialog /*void*/ (null,mostCurrent._activity,_claitem,"Verificação de viatura",("Viatura com matricula "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_carobj.plate /*String*/ ))+" sem danos a registar?"),_tgo,_itemstatus,anywheresoftware.b4a.keywords.Common.True,_carobj);
 }else 
{RDebugUtils.currentLine=197853234;
 //BA.debugLineNum = 197853234;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
RDebugUtils.currentLine=197853235;
 //BA.debugLineNum = 197853235;BA.debugLine="Dim Filter As AppActionDialogs";
_filter = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=197853236;
 //BA.debugLineNum = 197853236;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=197853237;
 //BA.debugLineNum = 197853237;BA.debugLine="Filter.GetFastActionDialog(Activity, CLAItem,";
_filter._getfastactiondialog /*void*/ (null,mostCurrent._activity,_claitem,"Verificação de viatura",("Viatura com matricula "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_carobj.plate /*String*/ ))+" sem danos a registar?"),_tgo,_itemstatus,anywheresoftware.b4a.keywords.Common.False,_carobj);
 }}
;
 };
 }else {
RDebugUtils.currentLine=197853241;
 //BA.debugLineNum = 197853241;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=197853243;
 //BA.debugLineNum = 197853243;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=197853245;
 //BA.debugLineNum = 197853245;BA.debugLine="End Sub";
return "";
}
public static String  _grouplinechange_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouplinechange_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouplinechange_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _itemtagcode = "";
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _listtype = 0;
RDebugUtils.currentLine=195887104;
 //BA.debugLineNum = 195887104;BA.debugLine="Sub GroupLineChange_Click";
RDebugUtils.currentLine=195887105;
 //BA.debugLineNum = 195887105;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=195887106;
 //BA.debugLineNum = 195887106;BA.debugLine="Dim ItemTagCode As String = b.Tag";
_itemtagcode = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=195887107;
 //BA.debugLineNum = 195887107;BA.debugLine="Dim p As Panel = b.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_b.getParent()));
RDebugUtils.currentLine=195887108;
 //BA.debugLineNum = 195887108;BA.debugLine="Dim ListType As Int = p.Tag";
_listtype = (int)(BA.ObjectToNumber(_p.getTag()));
RDebugUtils.currentLine=195887110;
 //BA.debugLineNum = 195887110;BA.debugLine="If (ListType = 0) Then";
if ((_listtype==0)) { 
RDebugUtils.currentLine=195887111;
 //BA.debugLineNum = 195887111;BA.debugLine="ListOfUserEquipments(ItemTagCode)";
_listofuserequipments(_itemtagcode);
 };
RDebugUtils.currentLine=195887113;
 //BA.debugLineNum = 195887113;BA.debugLine="End Sub";
return "";
}
public static String  _listofuserequipments(String _tagcode) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listofuserequipments", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listofuserequipments", new Object[] {_tagcode}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
RDebugUtils.currentLine=196083712;
 //BA.debugLineNum = 196083712;BA.debugLine="Sub ListOfUserEquipments(tagcode As String)";
RDebugUtils.currentLine=196083713;
 //BA.debugLineNum = 196083713;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=196083715;
 //BA.debugLineNum = 196083715;BA.debugLine="Dim SQL As String = $\"select title, serialnumber,";
_sql = ("select title, serialnumber, valid_to, tagcode from dta_equipments where tagcode not in (select equipment_tagcode from dta_equipments_technicals where technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"')");
RDebugUtils.currentLine=196083717;
 //BA.debugLineNum = 196083717;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=196083718;
 //BA.debugLineNum = 196083718;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=196083719;
 //BA.debugLineNum = 196083719;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=196083720;
 //BA.debugLineNum = 196083720;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=196083721;
 //BA.debugLineNum = 196083721;BA.debugLine="Filter.getDoubleLineEquipmentsDialog(Activity, \"";
_filter._getdoublelineequipmentsdialog /*void*/ (null,mostCurrent._activity,(Object)("User"),"Lista de equipamentos",_record,_tagcode);
 }else {
RDebugUtils.currentLine=196083723;
 //BA.debugLineNum = 196083723;BA.debugLine="MsgboxAsync(ShareCode.userNoEquipments, ShareCod";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._usernoequipments /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=196083724;
 //BA.debugLineNum = 196083724;BA.debugLine="Record.Close";
_record.Close();
 };
RDebugUtils.currentLine=196083726;
 //BA.debugLineNum = 196083726;BA.debugLine="End Sub";
return "";
}
public static String  _grouplineclickuser_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouplineclickuser_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouplineclickuser_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _pnl1 = null;
RDebugUtils.currentLine=197984256;
 //BA.debugLineNum = 197984256;BA.debugLine="Sub GroupLineClickUser_Click";
RDebugUtils.currentLine=197984257;
 //BA.debugLineNum = 197984257;BA.debugLine="Dim pnl As Panel = Sender";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=197984258;
 //BA.debugLineNum = 197984258;BA.debugLine="Dim pnl1 As Label = pnl.GetView(0)";
_pnl1 = new anywheresoftware.b4a.objects.LabelWrapper();
_pnl1 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=197984260;
 //BA.debugLineNum = 197984260;BA.debugLine="If (Utils.DBDataCount(Starter.LocalSQLWRK, $\"sele";
if ((mostCurrent._utils._dbdatacount /*int*/ (mostCurrent.activityBA,mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ ,("select count(0) as COUNTER from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._starter._localsessioncode /*String*/ ))+"'"))>1)) { 
RDebugUtils.currentLine=197984262;
 //BA.debugLineNum = 197984262;BA.debugLine="If (ShareCode.SESS_OPER_User <> pnl1.Tag) Then";
if (((mostCurrent._sharecode._sess_oper_user /*String*/ ).equals(BA.ObjectToString(_pnl1.getTag())) == false)) { 
RDebugUtils.currentLine=197984263;
 //BA.debugLineNum = 197984263;BA.debugLine="ChangeUserOperation(pnl1.tag)";
_changeuseroperation(BA.ObjectToString(_pnl1.getTag()));
 };
 };
RDebugUtils.currentLine=197984266;
 //BA.debugLineNum = 197984266;BA.debugLine="End Sub";
return "";
}
public static String  _grouplinedesc_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouplinedesc_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouplinedesc_click", null));}
RDebugUtils.currentLine=197525504;
 //BA.debugLineNum = 197525504;BA.debugLine="Sub GroupLineDesc_Click";
RDebugUtils.currentLine=197525506;
 //BA.debugLineNum = 197525506;BA.debugLine="End Sub";
return "";
}
public static String  _grouplinedesc_longclick() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouplinedesc_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouplinedesc_longclick", null));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _filename = "";
boolean _continua = false;
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
anywheresoftware.b4a.objects.collections.List _pdfappslist = null;
RDebugUtils.currentLine=197591040;
 //BA.debugLineNum = 197591040;BA.debugLine="Sub GroupLineDesc_LongClick";
RDebugUtils.currentLine=197591041;
 //BA.debugLineNum = 197591041;BA.debugLine="Dim lbl As Label = Sender";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=197591042;
 //BA.debugLineNum = 197591042;BA.debugLine="Dim FileName As String = lbl.Tag";
_filename = BA.ObjectToString(_lbl.getTag());
RDebugUtils.currentLine=197591043;
 //BA.debugLineNum = 197591043;BA.debugLine="Dim Continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=197591044;
 //BA.debugLineNum = 197591044;BA.debugLine="If Continua Then";
if (_continua) { 
RDebugUtils.currentLine=197591050;
 //BA.debugLineNum = 197591050;BA.debugLine="Dim intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=197591051;
 //BA.debugLineNum = 197591051;BA.debugLine="intent1.Initialize(intent1.ACTION_VIEW, Starter.";
_intent1.Initialize(_intent1.ACTION_VIEW,BA.ObjectToString(mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._getfileuri /*Object*/ (null,_filename)));
RDebugUtils.currentLine=197591052;
 //BA.debugLineNum = 197591052;BA.debugLine="intent1.SetType(\"application/pdf\")";
_intent1.SetType("application/pdf");
RDebugUtils.currentLine=197591053;
 //BA.debugLineNum = 197591053;BA.debugLine="intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSIO";
_intent1.setFlags((int) (1));
RDebugUtils.currentLine=197591070;
 //BA.debugLineNum = 197591070;BA.debugLine="Dim pdfAppsList As List";
_pdfappslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=197591071;
 //BA.debugLineNum = 197591071;BA.debugLine="pdfAppsList = Utils.QueryIntent(intent1)";
_pdfappslist = mostCurrent._utils._queryintent /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_intent1);
RDebugUtils.currentLine=197591072;
 //BA.debugLineNum = 197591072;BA.debugLine="If pdfAppsList.size>0 Then";
if (_pdfappslist.getSize()>0) { 
RDebugUtils.currentLine=197591073;
 //BA.debugLineNum = 197591073;BA.debugLine="StartActivity(intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
 };
 };
RDebugUtils.currentLine=197591076;
 //BA.debugLineNum = 197591076;BA.debugLine="End Sub";
return "";
}
public static String  _grouplineremove_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "grouplineremove_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "grouplineremove_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _itemtagcode = "";
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _listtype = 0;
RDebugUtils.currentLine=196018176;
 //BA.debugLineNum = 196018176;BA.debugLine="Sub GroupLineRemove_Click";
RDebugUtils.currentLine=196018177;
 //BA.debugLineNum = 196018177;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=196018178;
 //BA.debugLineNum = 196018178;BA.debugLine="Dim ItemTagCode As String = b.Tag";
_itemtagcode = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=196018179;
 //BA.debugLineNum = 196018179;BA.debugLine="Dim p As Panel = b.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_b.getParent()));
RDebugUtils.currentLine=196018180;
 //BA.debugLineNum = 196018180;BA.debugLine="Dim ListType As Int = p.Tag";
_listtype = (int)(BA.ObjectToNumber(_p.getTag()));
RDebugUtils.currentLine=196018182;
 //BA.debugLineNum = 196018182;BA.debugLine="If (ListType = 0) Then";
if ((_listtype==0)) { 
RDebugUtils.currentLine=196018183;
 //BA.debugLineNum = 196018183;BA.debugLine="RemoveUserEquipments(ItemTagCode)";
_removeuserequipments(_itemtagcode);
 };
RDebugUtils.currentLine=196018185;
 //BA.debugLineNum = 196018185;BA.debugLine="End Sub";
return "";
}
public static String  _removeuserequipments(String _tagcode) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "removeuserequipments", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "removeuserequipments", new Object[] {_tagcode}));}
int _i = 0;
RDebugUtils.currentLine=196214784;
 //BA.debugLineNum = 196214784;BA.debugLine="Sub RemoveUserEquipments(tagcode As String)";
RDebugUtils.currentLine=196214785;
 //BA.debugLineNum = 196214785;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=196214786;
 //BA.debugLineNum = 196214786;BA.debugLine="i = Msgbox2(ShareCode.userAskRemoveEquipment, Sha";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._useraskremoveequipment /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=196214787;
 //BA.debugLineNum = 196214787;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=196214788;
 //BA.debugLineNum = 196214788;BA.debugLine="DBStructures.deleteUserEquipment(ShareCode.SESS_";
mostCurrent._dbstructures._deleteuserequipment /*String*/ (mostCurrent.activityBA,mostCurrent._sharecode._sess_user /*String*/ ,_tagcode);
RDebugUtils.currentLine=196214789;
 //BA.debugLineNum = 196214789;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
_createuserdetailsdata(anywheresoftware.b4a.keywords.Common.True,mostCurrent._currentcarid);
 };
RDebugUtils.currentLine=196214791;
 //BA.debugLineNum = 196214791;BA.debugLine="End Sub";
return "";
}
public static void  _listdocuments_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listdocuments_itemclick", false))
	 {Debug.delegate(mostCurrent.activityBA, "listdocuments_itemclick", new Object[] {_index,_value}); return;}
ResumableSub_listDocuments_ItemClick rsub = new ResumableSub_listDocuments_ItemClick(null,_index,_value);
rsub.resume(processBA, null);
}
public static class ResumableSub_listDocuments_ItemClick extends BA.ResumableSub {
public ResumableSub_listDocuments_ItemClick(xevolution.vrcg.devdemov2400.user parent,int _index,Object _value) {
this.parent = parent;
this._index = _index;
this._value = _value;
}
xevolution.vrcg.devdemov2400.user parent;
int _index;
Object _value;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
String _filename = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="user";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=195297281;
 //BA.debugLineNum = 195297281;BA.debugLine="Dim pnl As Panel = listDocuments.GetPanel(Index)";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._listdocuments._getpanel(_index).getObject()));
RDebugUtils.currentLine=195297282;
 //BA.debugLineNum = 195297282;BA.debugLine="Dim FileName As String = \"\"";
_filename = "";
RDebugUtils.currentLine=195297283;
 //BA.debugLineNum = 195297283;BA.debugLine="FileName = pnl.Tag";
_filename = BA.ObjectToString(_pnl.getTag());
RDebugUtils.currentLine=195297285;
 //BA.debugLineNum = 195297285;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
RDebugUtils.currentLine=195297286;
 //BA.debugLineNum = 195297286;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
if (true) break;

case 4:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=195297287;
 //BA.debugLineNum = 195297287;BA.debugLine="If Not(File.IsDirectory(Starter.SharedFolder, F";
if (true) break;

case 7:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.IsDirectory(parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=195297289;
 //BA.debugLineNum = 195297289;BA.debugLine="File.Copy(Starter.InternalFolder, FileName,Sta";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=195297290;
 //BA.debugLineNum = 195297290;BA.debugLine="Utils.ViewPDFFile(FileName)";
parent.mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
RDebugUtils.currentLine=195297292;
 //BA.debugLineNum = 195297292;BA.debugLine="Sleep(20000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "user", "listdocuments_itemclick"),(int) (20000));
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
RDebugUtils.currentLine=195297293;
 //BA.debugLineNum = 195297293;BA.debugLine="File.Delete(Starter.SharedFolder, FileName)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._sharedfolder /*String*/ ,_filename);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=195297295;
 //BA.debugLineNum = 195297295;BA.debugLine="MsgboxAsync(ShareCode.userfileunavailable, Sha";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._userfileunavailable /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalerrortitle /*String*/ ),processBA);
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=195297299;
 //BA.debugLineNum = 195297299;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6195297299",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=195297306;
 //BA.debugLineNum = 195297306;BA.debugLine="End Sub";
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
public static String  _listequipments_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listequipments_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listequipments_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.LabelWrapper _qtd = null;
xevolution.vrcg.devdemov2400.appdialogs _dlg = null;
RDebugUtils.currentLine=195428352;
 //BA.debugLineNum = 195428352;BA.debugLine="Sub listEquipments_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=195428354;
 //BA.debugLineNum = 195428354;BA.debugLine="CurrentEquipItem = Index +1";
_currentequipitem = (int) (_index+1);
RDebugUtils.currentLine=195428355;
 //BA.debugLineNum = 195428355;BA.debugLine="Dim pnl As Panel = listEquipments.GetPanel(Curren";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listequipments._getpanel((int) (_currentequipitem-1)).getObject()));
RDebugUtils.currentLine=195428356;
 //BA.debugLineNum = 195428356;BA.debugLine="Dim qtd As Label = pnl.GetView(3)";
_qtd = new anywheresoftware.b4a.objects.LabelWrapper();
_qtd = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=195428357;
 //BA.debugLineNum = 195428357;BA.debugLine="Dim dlg As AppDialogs";
_dlg = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=195428358;
 //BA.debugLineNum = 195428358;BA.debugLine="dlg.Initialize";
_dlg._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=195428359;
 //BA.debugLineNum = 195428359;BA.debugLine="dlg.GetUserQuantityDialog(\"User\", pnl.tag, qtd.Te";
_dlg._getuserquantitydialog /*void*/ (null,(Object)("User"),BA.ObjectToString(_pnl.getTag()),(int)(Double.parseDouble(_qtd.getText())));
RDebugUtils.currentLine=195428363;
 //BA.debugLineNum = 195428363;BA.debugLine="CurrentDocItem = 0";
_currentdocitem = (int) (0);
RDebugUtils.currentLine=195428364;
 //BA.debugLineNum = 195428364;BA.debugLine="ListItemSelected(pnl)";
_listitemselected(_pnl);
RDebugUtils.currentLine=195428365;
 //BA.debugLineNum = 195428365;BA.debugLine="End Sub";
return "";
}
public static String  _listitemselected(anywheresoftware.b4a.objects.PanelWrapper _pan) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemselected", new Object[] {_pan}));}
int _index = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=195362816;
 //BA.debugLineNum = 195362816;BA.debugLine="Sub ListItemSelected(pan As Panel)";
RDebugUtils.currentLine=195362817;
 //BA.debugLineNum = 195362817;BA.debugLine="For index= 0 To listEquipments.GetSize-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._listequipments._getsize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=195362818;
 //BA.debugLineNum = 195362818;BA.debugLine="Dim p As Panel = listEquipments.GetPanel(index)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listequipments._getpanel(_index).getObject()));
RDebugUtils.currentLine=195362819;
 //BA.debugLineNum = 195362819;BA.debugLine="p.Color = Consts.ColorWhite";
_p.setColor(mostCurrent._consts._colorwhite /*int*/ );
 }
};
RDebugUtils.currentLine=195362821;
 //BA.debugLineNum = 195362821;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
_pan.setColor(mostCurrent._consts._colorciansoftlight /*int*/ );
RDebugUtils.currentLine=195362822;
 //BA.debugLineNum = 195362822;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=195362823;
 //BA.debugLineNum = 195362823;BA.debugLine="End Sub";
return "";
}
public static String  _listitemdocbutton_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemdocbutton_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemdocbutton_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb1 = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb2 = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb3 = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb4 = null;
String _filename = "";
boolean _continua = false;
xevolution.vrcg.devdemov2400.fileprovider _provider = null;
String _thefile = "";
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
anywheresoftware.b4a.objects.collections.List _pdfappslist = null;
RDebugUtils.currentLine=195231744;
 //BA.debugLineNum = 195231744;BA.debugLine="Sub ListItemDocButton_Click";
RDebugUtils.currentLine=195231746;
 //BA.debugLineNum = 195231746;BA.debugLine="Dim l As Label = Sender";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=195231748;
 //BA.debugLineNum = 195231748;BA.debugLine="Log(l.Tag)";
anywheresoftware.b4a.keywords.Common.LogImpl("6195231748",BA.ObjectToString(_l.getTag()),0);
RDebugUtils.currentLine=195231749;
 //BA.debugLineNum = 195231749;BA.debugLine="Dim p As Panel  = l.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_l.getParent()));
RDebugUtils.currentLine=195231751;
 //BA.debugLineNum = 195231751;BA.debugLine="Dim lidb As Label = p.GetView(0)";
_lidb = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=195231752;
 //BA.debugLineNum = 195231752;BA.debugLine="Dim lidb1 As Label = p.GetView(1)";
_lidb1 = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb1 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=195231753;
 //BA.debugLineNum = 195231753;BA.debugLine="Dim lidb2 As Label = p.GetView(2)";
_lidb2 = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb2 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=195231754;
 //BA.debugLineNum = 195231754;BA.debugLine="Dim lidb3 As Label = p.GetView(3)";
_lidb3 = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb3 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=195231755;
 //BA.debugLineNum = 195231755;BA.debugLine="Dim lidb4 As Label = p.GetView(4)";
_lidb4 = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb4 = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (4)).getObject()));
RDebugUtils.currentLine=195231756;
 //BA.debugLineNum = 195231756;BA.debugLine="Log($\"${lidb.tag}, ${lidb1.tag}, ${lidb2.tag}, ${";
anywheresoftware.b4a.keywords.Common.LogImpl("6195231756",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lidb.getTag())+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lidb1.getTag())+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lidb2.getTag())+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lidb3.getTag())+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lidb4.getTag())+""),0);
RDebugUtils.currentLine=195231759;
 //BA.debugLineNum = 195231759;BA.debugLine="Dim Filename As String = lidb.Tag";
_filename = BA.ObjectToString(_lidb.getTag());
RDebugUtils.currentLine=195231760;
 //BA.debugLineNum = 195231760;BA.debugLine="Dim Continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=195231761;
 //BA.debugLineNum = 195231761;BA.debugLine="If Continua Then";
if (_continua) { 
RDebugUtils.currentLine=195231762;
 //BA.debugLineNum = 195231762;BA.debugLine="Private Provider As FileProvider";
_provider = new xevolution.vrcg.devdemov2400.fileprovider();
RDebugUtils.currentLine=195231763;
 //BA.debugLineNum = 195231763;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=195231764;
 //BA.debugLineNum = 195231764;BA.debugLine="Provider.InitializeSafeDir";
_provider._initializesafedir /*String*/ (null);
RDebugUtils.currentLine=195231765;
 //BA.debugLineNum = 195231765;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
_thefile = BA.ObjectToString(_provider._getfileuri /*Object*/ (null,_filename));
RDebugUtils.currentLine=195231767;
 //BA.debugLineNum = 195231767;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6195231767",_thefile,0);
RDebugUtils.currentLine=195231768;
 //BA.debugLineNum = 195231768;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=195231769;
 //BA.debugLineNum = 195231769;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
_intent1.Initialize(_intent1.ACTION_VIEW,"file://"+_thefile);
RDebugUtils.currentLine=195231770;
 //BA.debugLineNum = 195231770;BA.debugLine="Intent1.SetType(\"application/pdf\")";
_intent1.SetType("application/pdf");
RDebugUtils.currentLine=195231771;
 //BA.debugLineNum = 195231771;BA.debugLine="Dim pdfAppsList As List";
_pdfappslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=195231772;
 //BA.debugLineNum = 195231772;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
_pdfappslist = mostCurrent._utils._queryintent /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_intent1);
RDebugUtils.currentLine=195231773;
 //BA.debugLineNum = 195231773;BA.debugLine="If pdfAppsList.size>0 Then";
if (_pdfappslist.getSize()>0) { 
RDebugUtils.currentLine=195231775;
 //BA.debugLineNum = 195231775;BA.debugLine="Log(\"pdf viewer(s) exists\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6195231775","pdf viewer(s) exists",0);
RDebugUtils.currentLine=195231776;
 //BA.debugLineNum = 195231776;BA.debugLine="StartActivity(Intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
 };
 };
RDebugUtils.currentLine=195231779;
 //BA.debugLineNum = 195231779;BA.debugLine="End Sub";
return "";
}
public static String  _listitemdocview_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemdocview_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemdocview_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _filename = "";
int _i = 0;
RDebugUtils.currentLine=194379776;
 //BA.debugLineNum = 194379776;BA.debugLine="Sub ListItemDocView_Click";
RDebugUtils.currentLine=194379777;
 //BA.debugLineNum = 194379777;BA.debugLine="Dim lbl As Label = Sender";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=194379778;
 //BA.debugLineNum = 194379778;BA.debugLine="Dim FileName As String = lbl.Tag";
_filename = BA.ObjectToString(_lbl.getTag());
RDebugUtils.currentLine=194379779;
 //BA.debugLineNum = 194379779;BA.debugLine="If File.Exists(Starter.InternalFolder, FileName)";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._internalfolder /*String*/ ,_filename)) { 
RDebugUtils.currentLine=194379780;
 //BA.debugLineNum = 194379780;BA.debugLine="Try";
try {RDebugUtils.currentLine=194379781;
 //BA.debugLineNum = 194379781;BA.debugLine="File.Copy(Starter.InternalFolder, FileName, Sta";
anywheresoftware.b4a.keywords.Common.File.Copy(mostCurrent._starter._internalfolder /*String*/ ,_filename,mostCurrent._starter._sharedfolder /*String*/ ,_filename);
 } 
       catch (Exception e7) {
			processBA.setLastException(e7);RDebugUtils.currentLine=194379783;
 //BA.debugLineNum = 194379783;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194379783",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=194379792;
 //BA.debugLineNum = 194379792;BA.debugLine="If File.Exists(Starter.SharedFolder, FileName) T";
if (anywheresoftware.b4a.keywords.Common.File.Exists(mostCurrent._starter._sharedfolder /*String*/ ,_filename)) { 
RDebugUtils.currentLine=194379793;
 //BA.debugLineNum = 194379793;BA.debugLine="Try";
try {RDebugUtils.currentLine=194379794;
 //BA.debugLineNum = 194379794;BA.debugLine="File.Copy(Starter.SharedFolder, FileName, Star";
anywheresoftware.b4a.keywords.Common.File.Copy(mostCurrent._starter._sharedfolder /*String*/ ,_filename,mostCurrent._starter._internalfolder /*String*/ ,_filename);
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=194379796;
 //BA.debugLineNum = 194379796;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194379796",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=194379800;
 //BA.debugLineNum = 194379800;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.userfilenoinde";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._userfilenoindentified /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=194379801;
 //BA.debugLineNum = 194379801;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=194379802;
 //BA.debugLineNum = 194379802;BA.debugLine="Try";
try {RDebugUtils.currentLine=194379803;
 //BA.debugLineNum = 194379803;BA.debugLine="DownloadFilesWithFTP(FileName)";
_downloadfileswithftp(_filename);
 } 
       catch (Exception e22) {
			processBA.setLastException(e22);RDebugUtils.currentLine=194379805;
 //BA.debugLineNum = 194379805;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194379805",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=194379808;
 //BA.debugLineNum = 194379808;BA.debugLine="FileName = \"\"";
_filename = "";
 };
 };
 };
RDebugUtils.currentLine=194379819;
 //BA.debugLineNum = 194379819;BA.debugLine="Try";
try {RDebugUtils.currentLine=194379820;
 //BA.debugLineNum = 194379820;BA.debugLine="If Utils.NNE(FileName) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_filename)) { 
RDebugUtils.currentLine=194379821;
 //BA.debugLineNum = 194379821;BA.debugLine="Utils.ViewPDFFile(FileName)";
mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
 };
 } 
       catch (Exception e34) {
			processBA.setLastException(e34);RDebugUtils.currentLine=194379824;
 //BA.debugLineNum = 194379824;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194379824",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=194379825;
 //BA.debugLineNum = 194379825;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.userfilewithpro";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._userfilewithproblems /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=194379826;
 //BA.debugLineNum = 194379826;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=194379827;
 //BA.debugLineNum = 194379827;BA.debugLine="Try";
try {RDebugUtils.currentLine=194379828;
 //BA.debugLineNum = 194379828;BA.debugLine="DownloadFilesWithFTP(FileName)";
_downloadfileswithftp(_filename);
 } 
       catch (Exception e40) {
			processBA.setLastException(e40);RDebugUtils.currentLine=194379830;
 //BA.debugLineNum = 194379830;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194379830",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 }else {
RDebugUtils.currentLine=194379833;
 //BA.debugLineNum = 194379833;BA.debugLine="FileName = \"\"";
_filename = "";
 };
RDebugUtils.currentLine=194379835;
 //BA.debugLineNum = 194379835;BA.debugLine="Try";
try {RDebugUtils.currentLine=194379836;
 //BA.debugLineNum = 194379836;BA.debugLine="If Utils.NNE(FileName) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_filename)) { 
RDebugUtils.currentLine=194379837;
 //BA.debugLineNum = 194379837;BA.debugLine="Utils.ViewPDFFile(FileName)";
mostCurrent._utils._viewpdffile /*String*/ (mostCurrent.activityBA,_filename);
 };
 } 
       catch (Exception e50) {
			processBA.setLastException(e50);RDebugUtils.currentLine=194379840;
 //BA.debugLineNum = 194379840;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6194379840",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
 };
RDebugUtils.currentLine=194379865;
 //BA.debugLineNum = 194379865;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_click", null));}
RDebugUtils.currentLine=194969600;
 //BA.debugLineNum = 194969600;BA.debugLine="Sub ListItemPanel_Click";
RDebugUtils.currentLine=194969602;
 //BA.debugLineNum = 194969602;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_longclick() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_longclick", null));}
RDebugUtils.currentLine=195035136;
 //BA.debugLineNum = 195035136;BA.debugLine="Sub ListItemPanel_LongClick";
RDebugUtils.currentLine=195035138;
 //BA.debugLineNum = 195035138;BA.debugLine="End Sub";
return "";
}
public static String  _listitemrefresh_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemrefresh_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemrefresh_click", null));}
RDebugUtils.currentLine=194314240;
 //BA.debugLineNum = 194314240;BA.debugLine="Sub ListItemRefresh_Click";
RDebugUtils.currentLine=194314243;
 //BA.debugLineNum = 194314243;BA.debugLine="End Sub";
return "";
}
public static String  _listpedidos_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listpedidos_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listpedidos_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=194904064;
 //BA.debugLineNum = 194904064;BA.debugLine="Sub listPedidos_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=194904068;
 //BA.debugLineNum = 194904068;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonadd_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonadd_click", null));}
RDebugUtils.currentLine=194838528;
 //BA.debugLineNum = 194838528;BA.debugLine="Sub listsButtonAdd_Click";
RDebugUtils.currentLine=194838530;
 //BA.debugLineNum = 194838530;BA.debugLine="End Sub";
return "";
}
public static String  _liststabpanel_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=198770688;
 //BA.debugLineNum = 198770688;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=198770689;
 //BA.debugLineNum = 198770689;BA.debugLine="If(ShareCode.ISPHONE And MenuPanel.Visible = Fals";
if ((mostCurrent._sharecode._isphone /*boolean*/  && mostCurrent._menupanel.getVisible()==anywheresoftware.b4a.keywords.Common.False)) { 
RDebugUtils.currentLine=198770690;
 //BA.debugLineNum = 198770690;BA.debugLine="If(Position = 0) Then";
if ((_position==0)) { 
RDebugUtils.currentLine=198770691;
 //BA.debugLineNum = 198770691;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistsuser /*String*/ ));
 }else 
{RDebugUtils.currentLine=198770692;
 //BA.debugLineNum = 198770692;BA.debugLine="Else If	(Position = 1) Then";
if ((_position==1)) { 
RDebugUtils.currentLine=198770693;
 //BA.debugLineNum = 198770693;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistsdocs /*String*/ ));
 }else 
{RDebugUtils.currentLine=198770694;
 //BA.debugLineNum = 198770694;BA.debugLine="Else If	(Position = 2) Then";
if ((_position==2)) { 
RDebugUtils.currentLine=198770695;
 //BA.debugLineNum = 198770695;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistscons /*String*/ ));
 }else 
{RDebugUtils.currentLine=198770696;
 //BA.debugLineNum = 198770696;BA.debugLine="Else If	(Position = 3) Then";
if ((_position==3)) { 
RDebugUtils.currentLine=198770697;
 //BA.debugLineNum = 198770697;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabe";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistsoper /*String*/ ));
 }}}}
;
 };
RDebugUtils.currentLine=198770701;
 //BA.debugLineNum = 198770701;BA.debugLine="End Sub";
return "";
}
public static String  _mainlogo_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainlogo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainlogo_click", null));}
RDebugUtils.currentLine=197656576;
 //BA.debugLineNum = 197656576;BA.debugLine="Sub mainLogo_Click";
RDebugUtils.currentLine=197656577;
 //BA.debugLineNum = 197656577;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
RDebugUtils.currentLine=197656578;
 //BA.debugLineNum = 197656578;BA.debugLine="End Sub";
return "";
}
public static String  _makedocumentslist(int _filter) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makedocumentslist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makedocumentslist", new Object[] {_filter}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _thisrecord = null;
String _ssql = "";
int _row = 0;
boolean _continua = false;
int _height = 0;
RDebugUtils.currentLine=194183168;
 //BA.debugLineNum = 194183168;BA.debugLine="Sub MakeDocumentsList(Filter As Int)";
RDebugUtils.currentLine=194183169;
 //BA.debugLineNum = 194183169;BA.debugLine="Private ThisRecord As Cursor";
_thisrecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=194183175;
 //BA.debugLineNum = 194183175;BA.debugLine="Dim sSQL As String = $\"Select b.tagdesc As doctyp";
_ssql = ("Select b.tagdesc As doctype_title, a.title, a.valid_to, a.tagcode, a.doc_filename\n"+"						from dta_documents As a\n"+"						left join type_documenttypes As b on (b.tagcode=a.document_type)\n"+"						where a.is_from=0 ");
RDebugUtils.currentLine=194183181;
 //BA.debugLineNum = 194183181;BA.debugLine="ThisRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_thisrecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=194183182;
 //BA.debugLineNum = 194183182;BA.debugLine="If ThisRecord.RowCount > 0 Then";
if (_thisrecord.getRowCount()>0) { 
RDebugUtils.currentLine=194183183;
 //BA.debugLineNum = 194183183;BA.debugLine="CurrentDocItem = 0";
_currentdocitem = (int) (0);
RDebugUtils.currentLine=194183184;
 //BA.debugLineNum = 194183184;BA.debugLine="TotalLineItems = ThisRecord.RowCount";
_totallineitems = _thisrecord.getRowCount();
RDebugUtils.currentLine=194183185;
 //BA.debugLineNum = 194183185;BA.debugLine="For Row = 0 To TotalLineItems-1";
{
final int step7 = 1;
final int limit7 = (int) (_totallineitems-1);
_row = (int) (0) ;
for (;_row <= limit7 ;_row = _row + step7 ) {
RDebugUtils.currentLine=194183186;
 //BA.debugLineNum = 194183186;BA.debugLine="ThisRecord.Position = Row";
_thisrecord.setPosition(_row);
RDebugUtils.currentLine=194183187;
 //BA.debugLineNum = 194183187;BA.debugLine="Dim Continua As Boolean = True ' ((Filter = 0)";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=194183188;
 //BA.debugLineNum = 194183188;BA.debugLine="Dim Height As Int =100dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100));
RDebugUtils.currentLine=194183190;
 //BA.debugLineNum = 194183190;BA.debugLine="If(ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=194183191;
 //BA.debugLineNum = 194183191;BA.debugLine="Height = 135dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (135));
 };
RDebugUtils.currentLine=194183194;
 //BA.debugLineNum = 194183194;BA.debugLine="If (Continua) Then";
if ((_continua)) { 
RDebugUtils.currentLine=194183195;
 //BA.debugLineNum = 194183195;BA.debugLine="listDocuments.Add(CreateDocListItem(Row, ThisR";
mostCurrent._listdocuments._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createdoclistitem(_row,_thisrecord,mostCurrent._listdocuments._asview().getWidth(),_height,(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(anywheresoftware.b4a.keywords.Common.Null))).getObject())),(Object)(""));
 };
 }
};
 }else {
RDebugUtils.currentLine=194183199;
 //BA.debugLineNum = 194183199;BA.debugLine="ThisRecord.Close";
_thisrecord.Close();
 };
RDebugUtils.currentLine=194183201;
 //BA.debugLineNum = 194183201;BA.debugLine="ThisRecord.Close";
_thisrecord.Close();
RDebugUtils.currentLine=194183202;
 //BA.debugLineNum = 194183202;BA.debugLine="End Sub";
return "";
}
public static String  _menupanelconsumablesbutton_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupanelconsumablesbutton_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupanelconsumablesbutton_click", null));}
RDebugUtils.currentLine=198639616;
 //BA.debugLineNum = 198639616;BA.debugLine="Sub MenuPanelConsumablesButton_Click";
RDebugUtils.currentLine=198639617;
 //BA.debugLineNum = 198639617;BA.debugLine="listsTabPanel.ScrollTo(2,False)";
mostCurrent._liststabpanel.ScrollTo((int) (2),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198639618;
 //BA.debugLineNum = 198639618;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198639619;
 //BA.debugLineNum = 198639619;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=198639620;
 //BA.debugLineNum = 198639620;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistscons /*String*/ ));
RDebugUtils.currentLine=198639621;
 //BA.debugLineNum = 198639621;BA.debugLine="End Sub";
return "";
}
public static String  _menupaneldocsbuttom_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupaneldocsbuttom_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupaneldocsbuttom_click", null));}
RDebugUtils.currentLine=198574080;
 //BA.debugLineNum = 198574080;BA.debugLine="Sub MenuPanelDocsButtom_Click";
RDebugUtils.currentLine=198574081;
 //BA.debugLineNum = 198574081;BA.debugLine="listsTabPanel.ScrollTo(1,False)";
mostCurrent._liststabpanel.ScrollTo((int) (1),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198574082;
 //BA.debugLineNum = 198574082;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198574083;
 //BA.debugLineNum = 198574083;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=198574084;
 //BA.debugLineNum = 198574084;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistsdocs /*String*/ ));
RDebugUtils.currentLine=198574085;
 //BA.debugLineNum = 198574085;BA.debugLine="End Sub";
return "";
}
public static String  _menupaneloperatorsbutton_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupaneloperatorsbutton_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupaneloperatorsbutton_click", null));}
RDebugUtils.currentLine=198705152;
 //BA.debugLineNum = 198705152;BA.debugLine="Sub MenuPanelOperatorsButton_Click";
RDebugUtils.currentLine=198705153;
 //BA.debugLineNum = 198705153;BA.debugLine="listsTabPanel.ScrollTo(3,False)";
mostCurrent._liststabpanel.ScrollTo((int) (3),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198705154;
 //BA.debugLineNum = 198705154;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198705155;
 //BA.debugLineNum = 198705155;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=198705156;
 //BA.debugLineNum = 198705156;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistsoper /*String*/ ));
RDebugUtils.currentLine=198705157;
 //BA.debugLineNum = 198705157;BA.debugLine="End Sub";
return "";
}
public static String  _menupaneluserbutton_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "menupaneluserbutton_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "menupaneluserbutton_click", null));}
RDebugUtils.currentLine=198508544;
 //BA.debugLineNum = 198508544;BA.debugLine="Sub MenuPanelUserButton_Click";
RDebugUtils.currentLine=198508545;
 //BA.debugLineNum = 198508545;BA.debugLine="listsTabPanel.ScrollTo(0,False)";
mostCurrent._liststabpanel.ScrollTo((int) (0),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198508546;
 //BA.debugLineNum = 198508546;BA.debugLine="MenuPanel.Visible = False";
mostCurrent._menupanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=198508547;
 //BA.debugLineNum = 198508547;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=198508548;
 //BA.debugLineNum = 198508548;BA.debugLine="mainLabelOptLists.Text = ShareCode.usermainLabelO";
mostCurrent._mainlabeloptlists.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._usermainlabeloptlistsuser /*String*/ ));
RDebugUtils.currentLine=198508550;
 //BA.debugLineNum = 198508550;BA.debugLine="End Sub";
return "";
}
public static Object  _pagechangelistener_event(String _methodname,Object[] _args) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pagechangelistener_event", false))
	 {return ((Object) Debug.delegate(mostCurrent.activityBA, "pagechangelistener_event", new Object[] {_methodname,_args}));}
int _thistab = 0;
RDebugUtils.currentLine=193462272;
 //BA.debugLineNum = 193462272;BA.debugLine="Sub PageChangeListener_Event (MethodName As String";
RDebugUtils.currentLine=193462273;
 //BA.debugLineNum = 193462273;BA.debugLine="If (MethodName = \"onPageScrolled\") Then";
if (((_methodname).equals("onPageScrolled"))) { 
RDebugUtils.currentLine=193462274;
 //BA.debugLineNum = 193462274;BA.debugLine="Dim thisTab As Int = Args(0)";
_thistab = (int)(BA.ObjectToNumber(_args[(int) (0)]));
RDebugUtils.currentLine=193462275;
 //BA.debugLineNum = 193462275;BA.debugLine="SecondPanel.Visible = thisTab > 0";
mostCurrent._secondpanel.setVisible(_thistab>0);
 };
RDebugUtils.currentLine=193462277;
 //BA.debugLineNum = 193462277;BA.debugLine="Return Null";
if (true) return anywheresoftware.b4a.keywords.Common.Null;
RDebugUtils.currentLine=193462278;
 //BA.debugLineNum = 193462278;BA.debugLine="End Sub";
return null;
}
public static String  _pdfreturn(String _info) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pdfreturn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pdfreturn", new Object[] {_info}));}
RDebugUtils.currentLine=195166208;
 //BA.debugLineNum = 195166208;BA.debugLine="Public Sub PDFReturn(info As String)";
RDebugUtils.currentLine=195166209;
 //BA.debugLineNum = 195166209;BA.debugLine="Log( \"Return\" )";
anywheresoftware.b4a.keywords.Common.LogImpl("6195166209","Return",0);
RDebugUtils.currentLine=195166210;
 //BA.debugLineNum = 195166210;BA.debugLine="End Sub";
return "";
}
public static String  _startuseractivity(String _filearg) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startuseractivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startuseractivity", new Object[] {_filearg}));}
String _vehicleplate = "";
String _photo = "";
String _title = "";
String _vehicle = "";
String _tagcode = "";
String _name = "";
String _usercodename = "";
int _row = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _nsql = "";
String _vmodel = "";
String _vehicle_tagcode = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _drecord = null;
String _cptitle = "";
String _ssql1 = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _drecord11 = null;
String _whtitle = "";
String _ctitle = "";
RDebugUtils.currentLine=193658880;
 //BA.debugLineNum = 193658880;BA.debugLine="Sub StartUserActivity(FileArg As String)";
RDebugUtils.currentLine=193658882;
 //BA.debugLineNum = 193658882;BA.debugLine="Dim vehicleplate As String = \"\"";
_vehicleplate = "";
RDebugUtils.currentLine=193658883;
 //BA.debugLineNum = 193658883;BA.debugLine="Dim photo As String = \"\"";
_photo = "";
RDebugUtils.currentLine=193658884;
 //BA.debugLineNum = 193658884;BA.debugLine="Dim title As String = \"\"";
_title = "";
RDebugUtils.currentLine=193658885;
 //BA.debugLineNum = 193658885;BA.debugLine="Dim vehicle As String = \"\"";
_vehicle = "";
RDebugUtils.currentLine=193658886;
 //BA.debugLineNum = 193658886;BA.debugLine="Dim tagcode As String = \"\"";
_tagcode = "";
RDebugUtils.currentLine=193658887;
 //BA.debugLineNum = 193658887;BA.debugLine="Dim name As String = \"\"";
_name = "";
RDebugUtils.currentLine=193658888;
 //BA.debugLineNum = 193658888;BA.debugLine="Dim userCodeName As String = \"\"";
_usercodename = "";
RDebugUtils.currentLine=193658890;
 //BA.debugLineNum = 193658890;BA.debugLine="Private Row As Int = 0";
_row = (int) (0);
RDebugUtils.currentLine=193658891;
 //BA.debugLineNum = 193658891;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193658893;
 //BA.debugLineNum = 193658893;BA.debugLine="Dim nSQL As String = $\"Select ifnull(e1.value, ''";
_nsql = ("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo,  ifnull(a.vehicle_tagcode,'') As vehicle_tagcode,\n"+"			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, a.*, ifnull(c.photo,ifnull(a.foto,'')) as photo\n"+"			from dta_technicals as a\n"+"			inner join aut_users as b on (b.tagcode=a.user_tagcode)\n"+"			inner join aut_users_details as c on (c.user_tagcode=a.user_tagcode)\n"+"			left join dta_objects as d on (d.tagcode=a.vehicle_tagcode)\n"+"			left join dta_objects_fields as e1 on (e1.object_tagcode=d.tagcode and e1.field_tagcode='FIELD_MARCA')\n"+"			left join dta_objects_fields as e2 on (e2.object_tagcode=d.tagcode and e2.field_tagcode='FIELD_MODELO')\n"+"			left join dta_objects_fields as e3 on (e3.object_tagcode=d.tagcode and e3.field_tagcode='FIELD_MATRICULA')\n"+"			left join dta_objects_fields as e4 on (e4.object_tagcode=d.tagcode and e4.field_tagcode='FIELD_KM')\n"+"			where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"'");
RDebugUtils.currentLine=193658904;
 //BA.debugLineNum = 193658904;BA.debugLine="Log(nSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6193658904",_nsql,0);
RDebugUtils.currentLine=193658905;
 //BA.debugLineNum = 193658905;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(nSQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_nsql)));
RDebugUtils.currentLine=193658906;
 //BA.debugLineNum = 193658906;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=193658907;
 //BA.debugLineNum = 193658907;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=193658908;
 //BA.debugLineNum = 193658908;BA.debugLine="Dim vehicleplate As String = Utils.IfNullOrEmpty";
_vehicleplate = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vmatricula"),"");
RDebugUtils.currentLine=193658909;
 //BA.debugLineNum = 193658909;BA.debugLine="Dim userCodeName As String = Utils.IfNullOrEmpty";
_usercodename = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("username"),"");
RDebugUtils.currentLine=193658912;
 //BA.debugLineNum = 193658912;BA.debugLine="Dim photo As String = Utils.IfNullOrEmpty(Record";
_photo = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("photo"),"");
RDebugUtils.currentLine=193658914;
 //BA.debugLineNum = 193658914;BA.debugLine="Dim title As String = Utils.IfNullOrEmpty(Record";
_title = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("jobtitle"),"");
RDebugUtils.currentLine=193658915;
 //BA.debugLineNum = 193658915;BA.debugLine="Dim vehicle As String = Utils.IfNullOrEmpty(Reco";
_vehicle = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vmarca"),"");
RDebugUtils.currentLine=193658916;
 //BA.debugLineNum = 193658916;BA.debugLine="Dim vmodel As String = Utils.IfNullOrEmpty(Recor";
_vmodel = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vmodelo"),"");
RDebugUtils.currentLine=193658917;
 //BA.debugLineNum = 193658917;BA.debugLine="Dim tagcode As String = Utils.IfNullOrEmpty(Reco";
_tagcode = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("tagcode"),"");
RDebugUtils.currentLine=193658918;
 //BA.debugLineNum = 193658918;BA.debugLine="Dim name As String = Utils.IfNullOrEmpty(Record.";
_name = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("title"),"");
RDebugUtils.currentLine=193658919;
 //BA.debugLineNum = 193658919;BA.debugLine="Dim vehicle_tagcode As String = Utils.IfNullOrEm";
_vehicle_tagcode = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record.GetString("vehicle_tagcode"),"");
 };
RDebugUtils.currentLine=193658924;
 //BA.debugLineNum = 193658924;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=193658925;
 //BA.debugLineNum = 193658925;BA.debugLine="Log(name)";
anywheresoftware.b4a.keywords.Common.LogImpl("6193658925",_name,0);
RDebugUtils.currentLine=193658927;
 //BA.debugLineNum = 193658927;BA.debugLine="If (vehicleplate= \"\") Then";
if (((_vehicleplate).equals(""))) { 
RDebugUtils.currentLine=193658928;
 //BA.debugLineNum = 193658928;BA.debugLine="Dim nSQL As String = $\"Select ifnull(e1.value, '";
_nsql = ("Select ifnull(e1.value, '') as vmarca, ifnull(e2.value, '') as vmodelo, d.tagcode,\n"+"			ifnull(e3.value, '') as vmatricula, ifnull(e4.value, '') as vkm, ifnull(d.image,'') as photo, ifnull(d.filename,'') as filename\n"+"			from  dta_objects As d \n"+"			left join dta_objects_fields As e1 on (e1.object_tagcode=d.tagcode And e1.field_tagcode='FIELD_MARCA')\n"+"			left join dta_objects_fields As e2 on (e2.object_tagcode=d.tagcode And e2.field_tagcode='FIELD_MODELO')\n"+"			left join dta_objects_fields As e3 on (e3.object_tagcode=d.tagcode And e3.field_tagcode='FIELD_MATRICULA')\n"+"			left join dta_objects_fields As e4 on (e4.object_tagcode=d.tagcode And e4.field_tagcode='FIELD_KM')\n"+"			where d.tagcode in (Select distinct vehicle_tagcode from dta_teams where tagcode in (\n"+"					Select tagcode from dta_teams_relations where relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"'))");
RDebugUtils.currentLine=193658937;
 //BA.debugLineNum = 193658937;BA.debugLine="Dim dRecord As Cursor";
_drecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193658938;
 //BA.debugLineNum = 193658938;BA.debugLine="dRecord = Starter.LocalSQLEVC.ExecQuery(nSQL)";
_drecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_nsql)));
RDebugUtils.currentLine=193658939;
 //BA.debugLineNum = 193658939;BA.debugLine="If dRecord.RowCount > 0 Then";
if (_drecord.getRowCount()>0) { 
RDebugUtils.currentLine=193658940;
 //BA.debugLineNum = 193658940;BA.debugLine="dRecord.Position = 0";
_drecord.setPosition((int) (0));
RDebugUtils.currentLine=193658941;
 //BA.debugLineNum = 193658941;BA.debugLine="Dim vehicleplate As String = Utils.IfNullOrEmpt";
_vehicleplate = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_drecord.GetString("vmatricula"),"");
RDebugUtils.currentLine=193658942;
 //BA.debugLineNum = 193658942;BA.debugLine="Dim vehicle As String = Utils.IfNullOrEmpty(dRe";
_vehicle = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_drecord.GetString("vmarca"),"");
RDebugUtils.currentLine=193658943;
 //BA.debugLineNum = 193658943;BA.debugLine="Dim vmodel As String = Utils.IfNullOrEmpty(dRec";
_vmodel = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_drecord.GetString("vmodelo"),"");
RDebugUtils.currentLine=193658944;
 //BA.debugLineNum = 193658944;BA.debugLine="Dim vehicle_tagcode As String = Utils.IfNullOrE";
_vehicle_tagcode = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_drecord.GetString("tagcode"),"");
 };
RDebugUtils.currentLine=193658948;
 //BA.debugLineNum = 193658948;BA.debugLine="dRecord.close";
_drecord.Close();
 };
RDebugUtils.currentLine=193658951;
 //BA.debugLineNum = 193658951;BA.debugLine="ShareCode.SESS_VEHICLE_OBJECT = vehicle_tagcode";
mostCurrent._sharecode._sess_vehicle_object /*String*/  = _vehicle_tagcode;
RDebugUtils.currentLine=193658952;
 //BA.debugLineNum = 193658952;BA.debugLine="ShareCode.SESS_VEHICLE_PLATE = vehicleplate";
mostCurrent._sharecode._sess_vehicle_plate /*String*/  = _vehicleplate;
RDebugUtils.currentLine=193658954;
 //BA.debugLineNum = 193658954;BA.debugLine="Dim cptitle As String = \"\"";
_cptitle = "";
RDebugUtils.currentLine=193658956;
 //BA.debugLineNum = 193658956;BA.debugLine="Dim sSQL1 As String = $\"select a.* from dta_compa";
_ssql1 = ("select a.* from dta_companies as a");
RDebugUtils.currentLine=193658957;
 //BA.debugLineNum = 193658957;BA.debugLine="Dim dRecord11 As Cursor";
_drecord11 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193658958;
 //BA.debugLineNum = 193658958;BA.debugLine="dRecord11 = Starter.LocalSQLEVC.ExecQuery(sSQL1)";
_drecord11 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql1)));
RDebugUtils.currentLine=193658959;
 //BA.debugLineNum = 193658959;BA.debugLine="If dRecord11.RowCount > 0 Then";
if (_drecord11.getRowCount()>0) { 
RDebugUtils.currentLine=193658960;
 //BA.debugLineNum = 193658960;BA.debugLine="dRecord11.Position = 0";
_drecord11.setPosition((int) (0));
RDebugUtils.currentLine=193658961;
 //BA.debugLineNum = 193658961;BA.debugLine="Dim cptitle As String = Utils.IfNullOrEmpty(dRec";
_cptitle = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_drecord11.GetString("title"),"");
 };
RDebugUtils.currentLine=193658964;
 //BA.debugLineNum = 193658964;BA.debugLine="dRecord11.close";
_drecord11.Close();
RDebugUtils.currentLine=193658966;
 //BA.debugLineNum = 193658966;BA.debugLine="userCategory.text = title";
mostCurrent._usercategory.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=193658967;
 //BA.debugLineNum = 193658967;BA.debugLine="userCode.Text = userCodeName";
mostCurrent._usercode.setText(BA.ObjectToCharSequence(_usercodename));
RDebugUtils.currentLine=193658968;
 //BA.debugLineNum = 193658968;BA.debugLine="userCompany.text = cptitle";
mostCurrent._usercompany.setText(BA.ObjectToCharSequence(_cptitle));
RDebugUtils.currentLine=193658969;
 //BA.debugLineNum = 193658969;BA.debugLine="userName.text = name";
mostCurrent._username.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=193658971;
 //BA.debugLineNum = 193658971;BA.debugLine="userTagcode.text = tagcode";
mostCurrent._usertagcode.setText(BA.ObjectToCharSequence(_tagcode));
RDebugUtils.currentLine=193658972;
 //BA.debugLineNum = 193658972;BA.debugLine="If Not(Utils.isNullOrEmpty(photo)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_photo))) { 
RDebugUtils.currentLine=193658973;
 //BA.debugLineNum = 193658973;BA.debugLine="photo = photo.Replace(\"data:image/png;base64,\",";
_photo = _photo.replace("data:image/png;base64,","");
RDebugUtils.currentLine=193658974;
 //BA.debugLineNum = 193658974;BA.debugLine="userPhoto.SetBackgroundImage(Utils.B64ToBitmap(p";
mostCurrent._userphoto.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,_photo).getObject()));
 };
RDebugUtils.currentLine=193658978;
 //BA.debugLineNum = 193658978;BA.debugLine="CurrentCarID = Types.NewAutoIdentification(tagcod";
mostCurrent._currentcarid = mostCurrent._types._newautoidentification /*xevolution.vrcg.devdemov2400.types._autoidentification*/ (mostCurrent.activityBA,_tagcode,_vehicle_tagcode,_vehicleplate,_vehicle,_vmodel);
RDebugUtils.currentLine=193658979;
 //BA.debugLineNum = 193658979;BA.debugLine="UserListView.UpDownIconExists = True";
mostCurrent._userlistview._setupdowniconexists /*boolean*/ (null,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=193658980;
 //BA.debugLineNum = 193658980;BA.debugLine="UserListView.UpDownIconIndex = 1";
mostCurrent._userlistview._setupdowniconindex /*int*/ (null,(int) (1));
RDebugUtils.currentLine=193658982;
 //BA.debugLineNum = 193658982;BA.debugLine="CreateUserDetailsData(False, CurrentCarID)";
_createuserdetailsdata(anywheresoftware.b4a.keywords.Common.False,mostCurrent._currentcarid);
RDebugUtils.currentLine=193658985;
 //BA.debugLineNum = 193658985;BA.debugLine="MakeDocumentsList(0)";
_makedocumentslist((int) (0));
RDebugUtils.currentLine=193658986;
 //BA.debugLineNum = 193658986;BA.debugLine="MakeEquipmentsList(0)";
_makeequipmentslist((int) (0));
RDebugUtils.currentLine=193658987;
 //BA.debugLineNum = 193658987;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193658988;
 //BA.debugLineNum = 193658988;BA.debugLine="mPopMenu.Initialize(Activity, Me, butWareHouses,";
mostCurrent._mpopmenu._initialize(mostCurrent.activityBA,mostCurrent._activity,user.getObject(),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._butwarehouses.getObject())),anywheresoftware.b4a.keywords.Common.Colors.DarkGray,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=193658989;
 //BA.debugLineNum = 193658989;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"select * f";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from warehouses"))));
RDebugUtils.currentLine=193658990;
 //BA.debugLineNum = 193658990;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=193658991;
 //BA.debugLineNum = 193658991;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step70 = 1;
final int limit70 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit70 ;_row = _row + step70 ) {
RDebugUtils.currentLine=193658992;
 //BA.debugLineNum = 193658992;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=193658993;
 //BA.debugLineNum = 193658993;BA.debugLine="Dim whtitle As String = Record.GetString(\"titl";
_whtitle = _record.GetString("title");
RDebugUtils.currentLine=193658994;
 //BA.debugLineNum = 193658994;BA.debugLine="mPopMenu.AddMenuItem(whtitle, \"whouses\")";
mostCurrent._mpopmenu._addmenuitem(_whtitle,"whouses");
 }
};
 };
RDebugUtils.currentLine=193658997;
 //BA.debugLineNum = 193658997;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=193658999;
 //BA.debugLineNum = 193658999;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=193659000;
 //BA.debugLineNum = 193659000;BA.debugLine="mEqipPopMenu.Initialize(Activity, Me, butEquipFi";
mostCurrent._meqippopmenu._initialize(mostCurrent.activityBA,mostCurrent._activity,user.getObject(),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._butequipfilter.getObject())),anywheresoftware.b4a.keywords.Common.Colors.DarkGray,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=193659001;
 //BA.debugLineNum = 193659001;BA.debugLine="mEqipPopMenu.AddMenuItem(\"Todos\", \"catitems\")";
mostCurrent._meqippopmenu._addmenuitem("Todos","catitems");
RDebugUtils.currentLine=193659002;
 //BA.debugLineNum = 193659002;BA.debugLine="Record = Starter.LocalSQL.ExecQuery($\"select * f";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsql /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(("select * from warehouses_categories"))));
RDebugUtils.currentLine=193659003;
 //BA.debugLineNum = 193659003;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=193659004;
 //BA.debugLineNum = 193659004;BA.debugLine="For Row = 0 To Record.RowCount-1";
{
final int step82 = 1;
final int limit82 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit82 ;_row = _row + step82 ) {
RDebugUtils.currentLine=193659005;
 //BA.debugLineNum = 193659005;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=193659006;
 //BA.debugLineNum = 193659006;BA.debugLine="Dim ctitle As String = Record.GetString(\"title";
_ctitle = _record.GetString("title");
RDebugUtils.currentLine=193659007;
 //BA.debugLineNum = 193659007;BA.debugLine="mEqipPopMenu.AddMenuItem(ctitle, \"catitems\")";
mostCurrent._meqippopmenu._addmenuitem(_ctitle,"catitems");
 }
};
 };
RDebugUtils.currentLine=193659010;
 //BA.debugLineNum = 193659010;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=193659013;
 //BA.debugLineNum = 193659013;BA.debugLine="FirstDataLoad = False";
_firstdataload = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=193659014;
 //BA.debugLineNum = 193659014;BA.debugLine="End Sub";
return "";
}
public static String  _unavailable(int _status) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unavailable", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unavailable", new Object[] {_status}));}
RDebugUtils.currentLine=196804608;
 //BA.debugLineNum = 196804608;BA.debugLine="Sub Unavailable(status As Int)";
RDebugUtils.currentLine=196804609;
 //BA.debugLineNum = 196804609;BA.debugLine="If status = 1 Then";
if (_status==1) { 
RDebugUtils.currentLine=196804610;
 //BA.debugLineNum = 196804610;BA.debugLine="ShareCode.USR_STATE = 1";
mostCurrent._sharecode._usr_state /*int*/  = (int) (1);
RDebugUtils.currentLine=196804611;
 //BA.debugLineNum = 196804611;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
 }else {
RDebugUtils.currentLine=196804613;
 //BA.debugLineNum = 196804613;BA.debugLine="ToastMessageShow(ShareCode.AvisoToastNoUpdateSer";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(mostCurrent._sharecode._avisotoastnoupdateserver /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=196804615;
 //BA.debugLineNum = 196804615;BA.debugLine="End Sub";
return "";
}
public static String  _unavreturn(int _status) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "unavreturn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "unavreturn", new Object[] {_status}));}
RDebugUtils.currentLine=196739072;
 //BA.debugLineNum = 196739072;BA.debugLine="Sub UnavReturn(status As Int)";
RDebugUtils.currentLine=196739073;
 //BA.debugLineNum = 196739073;BA.debugLine="If status = 1 Then";
if (_status==1) { 
RDebugUtils.currentLine=196739075;
 //BA.debugLineNum = 196739075;BA.debugLine="ShareCode.USR_STATE = 0";
mostCurrent._sharecode._usr_state /*int*/  = (int) (0);
RDebugUtils.currentLine=196739076;
 //BA.debugLineNum = 196739076;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
 }else {
RDebugUtils.currentLine=196739078;
 //BA.debugLineNum = 196739078;BA.debugLine="ToastMessageShow(ShareCode.AvisoToastNoUpdateSer";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(mostCurrent._sharecode._avisotoastnoupdateserver /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=196739080;
 //BA.debugLineNum = 196739080;BA.debugLine="End Sub";
return "";
}
public static String  _userlinechange_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "userlinechange_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "userlinechange_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _itemtagcode = "";
int _i = 0;
String _qq = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
boolean _hasdata = false;
String _sqlscript = "";
RDebugUtils.currentLine=195952640;
 //BA.debugLineNum = 195952640;BA.debugLine="Sub UserLineChange_Click";
RDebugUtils.currentLine=195952641;
 //BA.debugLineNum = 195952641;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=195952642;
 //BA.debugLineNum = 195952642;BA.debugLine="Dim ItemTagCode As String = b.Tag";
_itemtagcode = BA.ObjectToString(_b.getTag());
RDebugUtils.currentLine=195952643;
 //BA.debugLineNum = 195952643;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=195952644;
 //BA.debugLineNum = 195952644;BA.debugLine="Dim QQ As String = $\"select * from loc_userssessi";
_qq = ("select * from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._starter._localsessioncode /*String*/ ))+"' and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemtagcode))+"'");
RDebugUtils.currentLine=195952645;
 //BA.debugLineNum = 195952645;BA.debugLine="Dim Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=195952646;
 //BA.debugLineNum = 195952646;BA.debugLine="Record = Starter.LocalSQLWRK.ExecQuery(QQ)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_qq)));
RDebugUtils.currentLine=195952647;
 //BA.debugLineNum = 195952647;BA.debugLine="Dim hasData As Boolean = Record.RowCount >= 1";
_hasdata = _record.getRowCount()>=1;
RDebugUtils.currentLine=195952648;
 //BA.debugLineNum = 195952648;BA.debugLine="If (hasData) Then";
if ((_hasdata)) { 
RDebugUtils.currentLine=195952649;
 //BA.debugLineNum = 195952649;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=195952650;
 //BA.debugLineNum = 195952650;BA.debugLine="If (Record.GetString(\"username\") = ShareCode.SES";
if (((_record.GetString("username")).equals(mostCurrent._sharecode._sess_oper_uwdukey /*String*/ ))) { 
RDebugUtils.currentLine=195952651;
 //BA.debugLineNum = 195952651;BA.debugLine="MsgboxAsync(ShareCode.userErroRemoveOwnUser, Sh";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._usererroremoveownuser /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 }else {
RDebugUtils.currentLine=195952653;
 //BA.debugLineNum = 195952653;BA.debugLine="If (Record.GetInt(\"login\") = 1) Then";
if ((_record.GetInt("login")==1)) { 
RDebugUtils.currentLine=195952654;
 //BA.debugLineNum = 195952654;BA.debugLine="MsgboxAsync(ShareCode.userSelectedUserNoRemove";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._userselectedusernoremove /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 }else {
RDebugUtils.currentLine=195952656;
 //BA.debugLineNum = 195952656;BA.debugLine="i = Msgbox2(ShareCode.userAskRemoveUser, Share";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._useraskremoveuser /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=195952657;
 //BA.debugLineNum = 195952657;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=195952658;
 //BA.debugLineNum = 195952658;BA.debugLine="Dim sqlScript As String = $\"delete from loc_u";
_sqlscript = ("delete from loc_userssession where session='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._starter._localsessioncode /*String*/ ))+"' and tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_itemtagcode))+"'");
RDebugUtils.currentLine=195952659;
 //BA.debugLineNum = 195952659;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(sqlScript)";
mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sqlscript);
RDebugUtils.currentLine=195952660;
 //BA.debugLineNum = 195952660;BA.debugLine="CreateUserDetailsData(True, CurrentCarID)";
_createuserdetailsdata(anywheresoftware.b4a.keywords.Common.True,mostCurrent._currentcarid);
 };
 };
 };
 };
RDebugUtils.currentLine=195952666;
 //BA.debugLineNum = 195952666;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=195952668;
 //BA.debugLineNum = 195952668;BA.debugLine="End Sub";
return "";
}
public static String  _userlistview_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "userlistview_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "userlistview_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=195821568;
 //BA.debugLineNum = 195821568;BA.debugLine="Sub UserListView_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=195821569;
 //BA.debugLineNum = 195821569;BA.debugLine="CurrentGroupItem = Index";
_currentgroupitem = _index;
RDebugUtils.currentLine=195821570;
 //BA.debugLineNum = 195821570;BA.debugLine="End Sub";
return "";
}
public static String  _usershowcertificate_click() throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "usershowcertificate_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "usershowcertificate_click", null));}
String _filename = "";
boolean _continua = false;
xevolution.vrcg.devdemov2400.fileprovider _provider = null;
String _thefile = "";
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
anywheresoftware.b4a.objects.collections.List _pdfappslist = null;
RDebugUtils.currentLine=195100672;
 //BA.debugLineNum = 195100672;BA.debugLine="Sub userShowCertificate_Click";
RDebugUtils.currentLine=195100673;
 //BA.debugLineNum = 195100673;BA.debugLine="Dim Filename As String = userCertificate.Tag";
_filename = BA.ObjectToString(mostCurrent._usercertificate.getTag());
RDebugUtils.currentLine=195100674;
 //BA.debugLineNum = 195100674;BA.debugLine="Dim Continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=195100675;
 //BA.debugLineNum = 195100675;BA.debugLine="If Continua Then";
if (_continua) { 
RDebugUtils.currentLine=195100676;
 //BA.debugLineNum = 195100676;BA.debugLine="Private Provider As FileProvider";
_provider = new xevolution.vrcg.devdemov2400.fileprovider();
RDebugUtils.currentLine=195100677;
 //BA.debugLineNum = 195100677;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=195100678;
 //BA.debugLineNum = 195100678;BA.debugLine="Provider.InitializeSafeDir";
_provider._initializesafedir /*String*/ (null);
RDebugUtils.currentLine=195100679;
 //BA.debugLineNum = 195100679;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
_thefile = BA.ObjectToString(_provider._getfileuri /*Object*/ (null,_filename));
RDebugUtils.currentLine=195100683;
 //BA.debugLineNum = 195100683;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6195100683",_thefile,0);
RDebugUtils.currentLine=195100684;
 //BA.debugLineNum = 195100684;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=195100685;
 //BA.debugLineNum = 195100685;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
_intent1.Initialize(_intent1.ACTION_VIEW,"file://"+_thefile);
RDebugUtils.currentLine=195100686;
 //BA.debugLineNum = 195100686;BA.debugLine="Intent1.SetType(\"application/pdf\")";
_intent1.SetType("application/pdf");
RDebugUtils.currentLine=195100687;
 //BA.debugLineNum = 195100687;BA.debugLine="Dim pdfAppsList As List";
_pdfappslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=195100688;
 //BA.debugLineNum = 195100688;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
_pdfappslist = mostCurrent._utils._queryintent /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_intent1);
RDebugUtils.currentLine=195100689;
 //BA.debugLineNum = 195100689;BA.debugLine="If pdfAppsList.size>0 Then";
if (_pdfappslist.getSize()>0) { 
RDebugUtils.currentLine=195100691;
 //BA.debugLineNum = 195100691;BA.debugLine="Log(\"pdf viewer(s) exists\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6195100691","pdf viewer(s) exists",0);
RDebugUtils.currentLine=195100692;
 //BA.debugLineNum = 195100692;BA.debugLine="StartActivity(Intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
 };
 };
RDebugUtils.currentLine=195100696;
 //BA.debugLineNum = 195100696;BA.debugLine="End Sub";
return "";
}
public static String  _whouses_click(String _menuname) throws Exception{
RDebugUtils.currentModule="user";
if (Debug.shouldDelegate(mostCurrent.activityBA, "whouses_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "whouses_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=194641920;
 //BA.debugLineNum = 194641920;BA.debugLine="Sub whouses_Click(MenuName As String)";
RDebugUtils.currentLine=194641926;
 //BA.debugLineNum = 194641926;BA.debugLine="End Sub";
return "";
}
}