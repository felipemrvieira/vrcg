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

public class objects extends Activity implements B4AActivity{
	public static objects mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.objects");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (objects).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.objects");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.objects", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (objects) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (objects) Resume **");
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
		return objects.class;
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
            BA.LogInfo("** Activity (objects) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (objects) Pause event (activity is not paused). **");
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
            objects mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (objects) Resume **");
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
public static anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper _focusedmarker = null;
public static anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper _marker1 = null;
public static anywheresoftware.b4a.phone.Phone _device = null;
public static String _tilesource = "";
public static int _zoomlevel = 0;
public static anywheresoftware.b4a.objects.collections.List _markers = null;
public static boolean _mapfirsttime = false;
public static String _mypositionlat = "";
public static String _mypositionlon = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static int _startingrow = 0;
public static int _readrows = 0;
public static int _nextstartingrow = 0;
public anywheresoftware.b4a.objects.drawable.BitmapDrawable _icon = null;
public static String _currentfilter = "";
public anywheresoftware.b4a.objects.SpinnerWrapper _tilesourcespinner = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonuserunavailable = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _thisdialog = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbasepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottomline = null;
public anywheresoftware.b4a.objects.PanelWrapper _listsbottompanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonclose = null;
public anywheresoftware.b4a.objects.LabelWrapper _listslabelinfo = null;
public anywheresoftware.b4a.objects.TabStripViewPager _liststabpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _liststopbar = null;
public b4a.example3.customlistview _listobjects = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemlocation = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemfullname = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonfilter = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelversion = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelappinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopyright = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemreference = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemcontact = null;
public b4a.example3.customlistview _listpedidosmap = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listpedidosbuttonmap = null;
public static boolean _showlistpedidosmap = false;
public static int _bloco30 = 0;
public anywheresoftware.b4a.objects.PanelWrapper _mapbaselist = null;
public anywheresoftware.b4a.objects.PanelWrapper _mapbasepanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mapzoomdown = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mapzoomup = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtype = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemstatus = null;
public static int _itemscounter = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _butsearch = null;
public anywheresoftware.b4a.objects.EditTextWrapper _editsearch = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtodayrequests = null;
public static boolean _isfiltered = false;
public static int _idialogreqtypeobject = 0;
public static int _idialogreqzone = 0;
public static int _idialogreqstatus = 0;
public static int _idialogreqregion = 0;
public static int _idialogreqlocal = 0;
public static int _idialogreqwithrequests = 0;
public static String _sdialogreqname = "";
public static String _sdialogreqaddress = "";
public static String _searchfilter = "";
public anywheresoftware.b4a.objects.collections.List _regionslist = null;
public anywheresoftware.b4a.objects.collections.List _typeobjectslist = null;
public anywheresoftware.b4a.objects.collections.List _localslist = null;
public anywheresoftware.b4a.objects.collections.List _objrequests = null;
public anywheresoftware.b4a.objects.collections.List _objrequestsnottoday = null;
public anywheresoftware.b4a.objects.ButtonWrapper _mapuserposition = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttontype = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listsbuttonzone = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutselect = null;
public com.jakes.menuonviews.menuonanyview _objecttypepopmenu = null;
public com.jakes.menuonviews.menuonanyview _objectzonepopmenu = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeltypeobjectfilter = null;
public anywheresoftware.b4a.objects.PanelWrapper _colortabpanel = null;
public static int _currentlineitem = 0;
public static int _totallineitems = 0;
public anywheresoftware.b4a.objects.LabelWrapper _mainlabeloptlists = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _mainlogo = null;
public b4a.example3.customlistview _listtasks = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonactionpause = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonappnetwork = null;
public anywheresoftware.b4a.objects.LabelWrapper _mainactiveuser = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.GoogleMapWrapper _gmap = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper _mapdata = null;
public anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper _mapmarker = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemnumber = null;
public anywheresoftware.b4a.objects.PanelWrapper _objectslistviewpanel = null;
public static boolean _firsttimebool = false;
public anywheresoftware.b4a.objects.SpinnerWrapper _claprerequesttypespinner = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _claprerequestspinner = null;
public anywheresoftware.b4a.objects.collections.List _grouplist = null;
public anywheresoftware.b4a.objects.collections.List _reqlist = null;
public anywheresoftware.b4a.objects.collections.List _districtslist = null;
public anywheresoftware.b4a.objects.collections.List _countylist = null;
public b4a.example3.customlistview _listrequests = null;
public anywheresoftware.b4a.objects.PanelWrapper _noprerequestpanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _objectsrequeststitlelabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemrequestdesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemrequestobject = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutprerequestdownload = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutprerequestview = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutpreselect = null;
public anywheresoftware.b4a.objects.PanelWrapper _norequestpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutrequest = null;
public static String _selobject = "";
public static String _selchecklist = "";
public static int _selectedobjectscount = 0;
public static int _frombulkoption = 0;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemstate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butbulkcreaterequest = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butbulkprerequest = null;
public b4a.example3.customlistview _clarequestlist = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _clarequesttypespinner = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcreaterequestcancel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcreaterequest = null;
public anywheresoftware.b4a.objects.LabelWrapper _norequestpaneltitlelabel = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _claprerequestpickerlabel = null;
public anywheresoftware.b4a.objects.EditTextWrapper _claprerequesteditsearch = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _claprerequestdistrictepickerlabel = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _claprerequestcountypickerlabel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutpreselectall = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestnumber = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequesttype = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestentity = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestobject = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestdatetime = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestdetails = null;
public b4a.example3.customlistview _listoffields = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestfieldvalue = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelprerequestfieldname = null;
public static String _qry_typerequest = "";
public static String _qry_district = "";
public static String _qry_county = "";
public static String _qry_datein = "";
public static String _qry_dateout = "";
public static String _qry_filter = "";
public static int _cumulativetyperequest = 0;
public static int _cumulativedistrict = 0;
public static int _cumulativecounty = 0;
public static String _cumulativedatein = "";
public static String _cumulativedateout = "";
public static String _cumulativefilter = "";
public anywheresoftware.b4a.objects.LabelWrapper _dialogreqstartdatelabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _dialogreqenddatelabel = null;
public anywheresoftware.b4a.objects.LabelWrapper _objlabelobjectos = null;
public anywheresoftware.b4a.objects.LabelWrapper _objlabelmorada = null;
public anywheresoftware.b4a.objects.LabelWrapper _objlabelstatus = null;
public anywheresoftware.b4a.objects.LabelWrapper _objlabellocal = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequesttipointer = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequestdatainicio = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequestdatafim = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequestconcelho = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequestdistrito = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequestplivre = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequesttipointer2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelobjrequesttipogrupointer = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemrequestheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemactionheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _dummymenuplacehlder = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clabuttonrequestfilter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _clabuttonrequestdownload = null;
public anywheresoftware.b4a.objects.collections.List _lstprereqs2download = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemparent = null;
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
public static String  _setthefilters(xevolution.vrcg.devdemov2400.types._objectfilter _flt) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setthefilters", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setthefilters", new Object[] {_flt}));}
String _filter = "";
String _currdate = "";
String _slist = "";
int _i = 0;
RDebugUtils.currentLine=151322624;
 //BA.debugLineNum = 151322624;BA.debugLine="Sub SetTheFilters(flt As ObjectFilter)";
RDebugUtils.currentLine=151322629;
 //BA.debugLineNum = 151322629;BA.debugLine="StartingRow = 0";
_startingrow = (int) (0);
RDebugUtils.currentLine=151322630;
 //BA.debugLineNum = 151322630;BA.debugLine="NextStartingRow = 0";
_nextstartingrow = (int) (0);
RDebugUtils.currentLine=151322631;
 //BA.debugLineNum = 151322631;BA.debugLine="ReadRows = 20";
_readrows = (int) (20);
RDebugUtils.currentLine=151322632;
 //BA.debugLineNum = 151322632;BA.debugLine="IsFiltered  = True";
_isfiltered = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=151322633;
 //BA.debugLineNum = 151322633;BA.debugLine="Dim Filter As String = \"\"";
_filter = "";
RDebugUtils.currentLine=151322634;
 //BA.debugLineNum = 151322634;BA.debugLine="iDialogReqTypeObject = flt.TypeObject";
_idialogreqtypeobject = _flt.TypeObject /*int*/ ;
RDebugUtils.currentLine=151322635;
 //BA.debugLineNum = 151322635;BA.debugLine="iDialogReqZone = flt.ZoneObject";
_idialogreqzone = _flt.ZoneObject /*int*/ ;
RDebugUtils.currentLine=151322636;
 //BA.debugLineNum = 151322636;BA.debugLine="iDialogReqStatus = flt.Status";
_idialogreqstatus = _flt.Status /*int*/ ;
RDebugUtils.currentLine=151322637;
 //BA.debugLineNum = 151322637;BA.debugLine="iDialogReqRegion = flt.Region";
_idialogreqregion = _flt.Region /*int*/ ;
RDebugUtils.currentLine=151322638;
 //BA.debugLineNum = 151322638;BA.debugLine="iDialogReqLocal = flt.Local";
_idialogreqlocal = _flt.Local /*int*/ ;
RDebugUtils.currentLine=151322639;
 //BA.debugLineNum = 151322639;BA.debugLine="iDialogReqWithRequests = flt.Request";
_idialogreqwithrequests = _flt.Request /*int*/ ;
RDebugUtils.currentLine=151322640;
 //BA.debugLineNum = 151322640;BA.debugLine="sDialogReqName = flt.Name";
mostCurrent._sdialogreqname = _flt.Name /*String*/ ;
RDebugUtils.currentLine=151322641;
 //BA.debugLineNum = 151322641;BA.debugLine="sDialogReqAddress = flt.Address";
mostCurrent._sdialogreqaddress = _flt.Address /*String*/ ;
RDebugUtils.currentLine=151322642;
 //BA.debugLineNum = 151322642;BA.debugLine="UpdateGlobalObjectFilter";
_updateglobalobjectfilter();
RDebugUtils.currentLine=151322644;
 //BA.debugLineNum = 151322644;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=151322645;
 //BA.debugLineNum = 151322645;BA.debugLine="Dim CurrDate As String = $\"$date{DateTime.Now}\"$";
_currdate = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=151322648;
 //BA.debugLineNum = 151322648;BA.debugLine="If (sDialogReqName <> \"\") Then";
if (((mostCurrent._sdialogreqname).equals("") == false)) { 
RDebugUtils.currentLine=151322649;
 //BA.debugLineNum = 151322649;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
if (((_filter).equals("") == false)) { 
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ");};
RDebugUtils.currentLine=151322650;
 //BA.debugLineNum = 151322650;BA.debugLine="Filter = $\"${Filter}(a.title_import like '%${sDi";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(a.title_import like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sdialogreqname))+"%')");
 };
RDebugUtils.currentLine=151322653;
 //BA.debugLineNum = 151322653;BA.debugLine="If (iDialogReqZone > 0) Then";
if ((_idialogreqzone>0)) { 
 };
RDebugUtils.currentLine=151322670;
 //BA.debugLineNum = 151322670;BA.debugLine="If (sDialogReqAddress <> \"\") Then";
if (((mostCurrent._sdialogreqaddress).equals("") == false)) { 
RDebugUtils.currentLine=151322671;
 //BA.debugLineNum = 151322671;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
if (((_filter).equals("") == false)) { 
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ");};
RDebugUtils.currentLine=151322672;
 //BA.debugLineNum = 151322672;BA.debugLine="Filter = $\"${Filter}(c.address like '%${sDialogR";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(c.address like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sdialogreqaddress))+"%')");
 };
RDebugUtils.currentLine=151322675;
 //BA.debugLineNum = 151322675;BA.debugLine="If (iDialogReqStatus > 0) Then";
if ((_idialogreqstatus>0)) { 
RDebugUtils.currentLine=151322676;
 //BA.debugLineNum = 151322676;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
if (((_filter).equals("") == false)) { 
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ");};
RDebugUtils.currentLine=151322677;
 //BA.debugLineNum = 151322677;BA.debugLine="If (iDialogReqStatus = 1) Then";
if ((_idialogreqstatus==1)) { 
RDebugUtils.currentLine=151322678;
 //BA.debugLineNum = 151322678;BA.debugLine="Filter = $\"${Filter}(a.active=1)\"$";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(a.active=1)");
 }else {
RDebugUtils.currentLine=151322680;
 //BA.debugLineNum = 151322680;BA.debugLine="Filter = $\"${Filter}(a.active=0)\"$";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(a.active=0)");
 };
 };
RDebugUtils.currentLine=151322684;
 //BA.debugLineNum = 151322684;BA.debugLine="If (iDialogReqTypeObject > 0) Then";
if ((_idialogreqtypeobject>0)) { 
RDebugUtils.currentLine=151322685;
 //BA.debugLineNum = 151322685;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
if (((_filter).equals("") == false)) { 
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ");};
RDebugUtils.currentLine=151322686;
 //BA.debugLineNum = 151322686;BA.debugLine="Filter = $\"${Filter}(b.id=${iDialogReqTypeObject";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(b.id="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_idialogreqtypeobject))+")");
 };
RDebugUtils.currentLine=151322689;
 //BA.debugLineNum = 151322689;BA.debugLine="If (iDialogReqLocal > 0) Then";
if ((_idialogreqlocal>0)) { 
RDebugUtils.currentLine=151322690;
 //BA.debugLineNum = 151322690;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
if (((_filter).equals("") == false)) { 
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ");};
RDebugUtils.currentLine=151322691;
 //BA.debugLineNum = 151322691;BA.debugLine="Filter = $\"${Filter}(c.local='${LocalsList.Get(i";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(c.local='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",mostCurrent._localslist.Get((int) (_idialogreqlocal-1)))+"')");
 };
RDebugUtils.currentLine=151322694;
 //BA.debugLineNum = 151322694;BA.debugLine="If (iDialogReqWithRequests = 1) Then";
if ((_idialogreqwithrequests==1)) { 
RDebugUtils.currentLine=151322695;
 //BA.debugLineNum = 151322695;BA.debugLine="Dim sList As String = \"\"";
_slist = "";
RDebugUtils.currentLine=151322696;
 //BA.debugLineNum = 151322696;BA.debugLine="For i=0 To ObjRequests.Size-1";
{
final int step45 = 1;
final int limit45 = (int) (mostCurrent._objrequests.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit45 ;_i = _i + step45 ) {
RDebugUtils.currentLine=151322697;
 //BA.debugLineNum = 151322697;BA.debugLine="If (sList <> \"\") Then sList = $\"${sList},\"$";
if (((_slist).equals("") == false)) { 
_slist = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_slist))+",");};
RDebugUtils.currentLine=151322698;
 //BA.debugLineNum = 151322698;BA.debugLine="sList = $\"${sList}'${ObjRequests.Get(i)}'\"$";
_slist = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_slist))+"'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",mostCurrent._objrequests.Get(_i))+"'");
 }
};
RDebugUtils.currentLine=151322700;
 //BA.debugLineNum = 151322700;BA.debugLine="If (sList <> \"\") Then";
if (((_slist).equals("") == false)) { 
RDebugUtils.currentLine=151322701;
 //BA.debugLineNum = 151322701;BA.debugLine="If (Filter <> \"\") Then Filter = $\"${Filter} and";
if (((_filter).equals("") == false)) { 
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ");};
RDebugUtils.currentLine=151322702;
 //BA.debugLineNum = 151322702;BA.debugLine="Filter = $\"${Filter}(a.tagcode in (${sList}))\"$";
_filter = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+"(a.tagcode in ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_slist))+"))");
 };
 };
RDebugUtils.currentLine=151322705;
 //BA.debugLineNum = 151322705;BA.debugLine="Log(Filter)";
anywheresoftware.b4a.keywords.Common.LogImpl("6151322705",_filter,0);
RDebugUtils.currentLine=151322719;
 //BA.debugLineNum = 151322719;BA.debugLine="CurrentFilter = Filter";
mostCurrent._currentfilter = _filter;
RDebugUtils.currentLine=151322720;
 //BA.debugLineNum = 151322720;BA.debugLine="StartObjectsActivity(True, Filter)";
_startobjectsactivity(anywheresoftware.b4a.keywords.Common.True,_filter);
RDebugUtils.currentLine=151322721;
 //BA.debugLineNum = 151322721;BA.debugLine="End Sub";
return "";
}
public static String  _cancelallfilters(boolean _run) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cancelallfilters", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cancelallfilters", new Object[] {_run}));}
RDebugUtils.currentLine=151191552;
 //BA.debugLineNum = 151191552;BA.debugLine="Sub CancelAllFilters(run As Boolean)";
RDebugUtils.currentLine=151191553;
 //BA.debugLineNum = 151191553;BA.debugLine="IsFiltered  = False";
_isfiltered = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=151191554;
 //BA.debugLineNum = 151191554;BA.debugLine="iDialogReqTypeObject = ShareCode.OBJ_DefaultType";
_idialogreqtypeobject = mostCurrent._sharecode._obj_defaulttype /*int*/ ;
RDebugUtils.currentLine=151191555;
 //BA.debugLineNum = 151191555;BA.debugLine="iDialogReqZone = ShareCode.OBJ_DefaultZone";
_idialogreqzone = mostCurrent._sharecode._obj_defaultzone /*int*/ ;
RDebugUtils.currentLine=151191556;
 //BA.debugLineNum = 151191556;BA.debugLine="iDialogReqStatus = 0";
_idialogreqstatus = (int) (0);
RDebugUtils.currentLine=151191557;
 //BA.debugLineNum = 151191557;BA.debugLine="sDialogReqName = \"\"";
mostCurrent._sdialogreqname = "";
RDebugUtils.currentLine=151191558;
 //BA.debugLineNum = 151191558;BA.debugLine="iDialogReqRegion = 0";
_idialogreqregion = (int) (0);
RDebugUtils.currentLine=151191559;
 //BA.debugLineNum = 151191559;BA.debugLine="iDialogReqLocal = 0";
_idialogreqlocal = (int) (0);
RDebugUtils.currentLine=151191560;
 //BA.debugLineNum = 151191560;BA.debugLine="sDialogReqAddress = \"\"";
mostCurrent._sdialogreqaddress = "";
RDebugUtils.currentLine=151191561;
 //BA.debugLineNum = 151191561;BA.debugLine="iDialogReqWithRequests = 0";
_idialogreqwithrequests = (int) (0);
RDebugUtils.currentLine=151191562;
 //BA.debugLineNum = 151191562;BA.debugLine="UpdateGlobalObjectFilter";
_updateglobalobjectfilter();
RDebugUtils.currentLine=151191563;
 //BA.debugLineNum = 151191563;BA.debugLine="StartObjectsActivity(True, \"\")";
_startobjectsactivity(anywheresoftware.b4a.keywords.Common.True,"");
RDebugUtils.currentLine=151191564;
 //BA.debugLineNum = 151191564;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _i = 0;
xevolution.vrcg.devdemov2400.types._objecttypes _bt = null;
String _where = "";
String _s = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.List _flist = null;
xevolution.vrcg.devdemov2400.types._db_itc _itc = null;
xevolution.vrcg.devdemov2400.types._codenamelist _r = null;
RDebugUtils.currentLine=150863872;
 //BA.debugLineNum = 150863872;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=150863876;
 //BA.debugLineNum = 150863876;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=150863877;
 //BA.debugLineNum = 150863877;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=150863879;
 //BA.debugLineNum = 150863879;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=150863882;
 //BA.debugLineNum = 150863882;BA.debugLine="Starter.CurrentWorkActivity = Me";
mostCurrent._starter._currentworkactivity /*Object*/  = objects.getObject();
RDebugUtils.currentLine=150863884;
 //BA.debugLineNum = 150863884;BA.debugLine="Activity.LoadLayout(\"ObjectsLayout\")";
mostCurrent._activity.LoadLayout("ObjectsLayout",mostCurrent.activityBA);
RDebugUtils.currentLine=150863885;
 //BA.debugLineNum = 150863885;BA.debugLine="listsTabPanel.LoadLayout(\"Objects_listview\", Shar";
mostCurrent._liststabpanel.LoadLayout("Objects_listview",BA.ObjectToCharSequence(mostCurrent._sharecode._tabgeneral_listingtitle /*String*/ ));
RDebugUtils.currentLine=150863886;
 //BA.debugLineNum = 150863886;BA.debugLine="listsTabPanel.LoadLayout(\"Objects_requests_new\",";
mostCurrent._liststabpanel.LoadLayout("Objects_requests_new",BA.ObjectToCharSequence(mostCurrent._sharecode._tabgeneral_requests /*String*/ ));
RDebugUtils.currentLine=150863887;
 //BA.debugLineNum = 150863887;BA.debugLine="listsTabPanel.LoadLayout(\"objects_mapview_goolge\"";
mostCurrent._liststabpanel.LoadLayout("objects_mapview_goolge",BA.ObjectToCharSequence(mostCurrent._sharecode._tabgeneral_maptitle /*String*/ ));
RDebugUtils.currentLine=150863889;
 //BA.debugLineNum = 150863889;BA.debugLine="LstPreReqs2Download.Initialize";
mostCurrent._lstprereqs2download.Initialize();
RDebugUtils.currentLine=150863891;
 //BA.debugLineNum = 150863891;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=150863892;
 //BA.debugLineNum = 150863892;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(objectsLi";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._objectslistviewpanel.getObject())));
RDebugUtils.currentLine=150863893;
 //BA.debugLineNum = 150863893;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(ObjectsRe";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._objectsrequeststitlelabel.getObject())));
RDebugUtils.currentLine=150863894;
 //BA.debugLineNum = 150863894;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=150863896;
 //BA.debugLineNum = 150863896;BA.debugLine="ObjLabelObjectos.Text = ShareCode.objectObjLabelO";
mostCurrent._objlabelobjectos.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objectobjlabelobjectos /*String*/ ));
RDebugUtils.currentLine=150863897;
 //BA.debugLineNum = 150863897;BA.debugLine="ObjLabelMorada.Text = ShareCode.objectObjLabelMor";
mostCurrent._objlabelmorada.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objectobjlabelmorada /*String*/ ));
RDebugUtils.currentLine=150863898;
 //BA.debugLineNum = 150863898;BA.debugLine="ObjLabelStatus.Text = ShareCode.objectObjLabelSta";
mostCurrent._objlabelstatus.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objectobjlabelstatus /*String*/ ));
RDebugUtils.currentLine=150863899;
 //BA.debugLineNum = 150863899;BA.debugLine="ObjLabelLocal.text = ShareCode.objectObjLabelLoca";
mostCurrent._objlabellocal.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objectobjlabellocal /*String*/ ));
RDebugUtils.currentLine=150863901;
 //BA.debugLineNum = 150863901;BA.debugLine="LabelObjRequestTipoInter.Text = ShareCode.ObjLabe";
mostCurrent._labelobjrequesttipointer.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlabelobjrequesttipointer /*String*/ ));
RDebugUtils.currentLine=150863902;
 //BA.debugLineNum = 150863902;BA.debugLine="LabelObjRequestDataInicio.Text = ShareCode.AppDia";
mostCurrent._labelobjrequestdatainicio.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._appdialogsfilterlabeldatainicio /*String*/ ));
RDebugUtils.currentLine=150863903;
 //BA.debugLineNum = 150863903;BA.debugLine="LabelObjRequestDataFim.Text = ShareCode.AppDialog";
mostCurrent._labelobjrequestdatafim.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._appdialogsfilterlabeldatafim /*String*/ ));
RDebugUtils.currentLine=150863904;
 //BA.debugLineNum = 150863904;BA.debugLine="LabelObjRequestConcelho.Text = ShareCode.ObjLabel";
mostCurrent._labelobjrequestconcelho.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlabelobjrequestconcelho /*String*/ ));
RDebugUtils.currentLine=150863905;
 //BA.debugLineNum = 150863905;BA.debugLine="LabelObjRequestDistrito.Text = ShareCode.ObjLabel";
mostCurrent._labelobjrequestdistrito.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlabelobjrequestdistrito /*String*/ ));
RDebugUtils.currentLine=150863906;
 //BA.debugLineNum = 150863906;BA.debugLine="LabelObjRequestPLivre.Text = ShareCode.ObjLabelOb";
mostCurrent._labelobjrequestplivre.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlabelobjrequestplivre /*String*/ ));
RDebugUtils.currentLine=150863907;
 //BA.debugLineNum = 150863907;BA.debugLine="LabelObjRequestTipoInter2.Text = ShareCode.ObjLab";
mostCurrent._labelobjrequesttipointer2.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlabelobjrequesttipointer /*String*/ ));
RDebugUtils.currentLine=150863908;
 //BA.debugLineNum = 150863908;BA.debugLine="LabelObjRequestTipoGrupoInter.Text = ShareCode.Ob";
mostCurrent._labelobjrequesttipogrupointer.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlabelobjrequesttipogrupointer /*String*/ ));
RDebugUtils.currentLine=150863909;
 //BA.debugLineNum = 150863909;BA.debugLine="ListItemRequestHeader.Text = ShareCode.ObjListIte";
mostCurrent._listitemrequestheader.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlistitemrequestheader /*String*/ ));
RDebugUtils.currentLine=150863910;
 //BA.debugLineNum = 150863910;BA.debugLine="ListItemActionHeader.Text = ShareCode.ObjListItem";
mostCurrent._listitemactionheader.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._objlistitemactionheader /*String*/ ));
RDebugUtils.currentLine=150863912;
 //BA.debugLineNum = 150863912;BA.debugLine="DialogReqStartDateLabel.Text = Utils.GetCurrentDa";
mostCurrent._dialogreqstartdatelabel.setText(BA.ObjectToCharSequence(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=150863913;
 //BA.debugLineNum = 150863913;BA.debugLine="DialogReqEndDateLabel.Text = Utils.GetCurrentDate";
mostCurrent._dialogreqenddatelabel.setText(BA.ObjectToCharSequence(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=150863916;
 //BA.debugLineNum = 150863916;BA.debugLine="For Each lbl As Label In Utils.GetAllTabLabels(li";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group32 = mostCurrent._utils._getalltablabels /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,mostCurrent._liststabpanel);
final int groupLen32 = group32.getSize()
;int index32 = 0;
;
for (; index32 < groupLen32;index32++){
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(group32.Get(index32)));
RDebugUtils.currentLine=150863917;
 //BA.debugLineNum = 150863917;BA.debugLine="lbl.Width = 33.33%x";
_lbl.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33.33),mostCurrent.activityBA));
 }
};
RDebugUtils.currentLine=150863920;
 //BA.debugLineNum = 150863920;BA.debugLine="Utils.MakeTabPanelEffect(ColorTabPanel, Consts.Co";
mostCurrent._utils._maketabpaneleffect /*String*/ (mostCurrent.activityBA,mostCurrent._colortabpanel,mostCurrent._consts._colormaindarker /*int*/ ,mostCurrent._consts._colorsub /*int*/ );
RDebugUtils.currentLine=150863922;
 //BA.debugLineNum = 150863922;BA.debugLine="Markers.Initialize";
_markers.Initialize();
RDebugUtils.currentLine=150863923;
 //BA.debugLineNum = 150863923;BA.debugLine="SelectedObjectsCount = 0";
_selectedobjectscount = (int) (0);
RDebugUtils.currentLine=150863924;
 //BA.debugLineNum = 150863924;BA.debugLine="FromBulkOption = 0";
_frombulkoption = (int) (0);
RDebugUtils.currentLine=150863925;
 //BA.debugLineNum = 150863925;BA.debugLine="Bloco30 = Activity.Width / 3";
_bloco30 = (int) (mostCurrent._activity.getWidth()/(double)3);
RDebugUtils.currentLine=150863926;
 //BA.debugLineNum = 150863926;BA.debugLine="If Not(ShareCode.ISPHONE Or ShareCode.DEVICE_ORIE";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/  || mostCurrent._sharecode._device_orientation /*int*/ ==1)) { 
RDebugUtils.currentLine=150863927;
 //BA.debugLineNum = 150863927;BA.debugLine="Dim p As Panel = listPedidosMap.AsView";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listpedidosmap._asview().getObject()));
RDebugUtils.currentLine=150863928;
 //BA.debugLineNum = 150863928;BA.debugLine="p.Width = Bloco30";
_p.setWidth(_bloco30);
 };
RDebugUtils.currentLine=150863932;
 //BA.debugLineNum = 150863932;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
 };
RDebugUtils.currentLine=150863936;
 //BA.debugLineNum = 150863936;BA.debugLine="CumulativeTypeRequest = 0";
_cumulativetyperequest = (int) (0);
RDebugUtils.currentLine=150863937;
 //BA.debugLineNum = 150863937;BA.debugLine="CumulativeDistrict = 0";
_cumulativedistrict = (int) (0);
RDebugUtils.currentLine=150863938;
 //BA.debugLineNum = 150863938;BA.debugLine="CumulativeCounty = 0";
_cumulativecounty = (int) (0);
RDebugUtils.currentLine=150863939;
 //BA.debugLineNum = 150863939;BA.debugLine="CumulativeFilter = \"\"";
mostCurrent._cumulativefilter = "";
RDebugUtils.currentLine=150863940;
 //BA.debugLineNum = 150863940;BA.debugLine="CumulativeDateIn = \"\"";
mostCurrent._cumulativedatein = "";
RDebugUtils.currentLine=150863941;
 //BA.debugLineNum = 150863941;BA.debugLine="CumulativeDateOut = \"\"";
mostCurrent._cumulativedateout = "";
RDebugUtils.currentLine=150863943;
 //BA.debugLineNum = 150863943;BA.debugLine="RegionsList.Initialize";
mostCurrent._regionslist.Initialize();
RDebugUtils.currentLine=150863944;
 //BA.debugLineNum = 150863944;BA.debugLine="TypeObjectsList.Initialize";
mostCurrent._typeobjectslist.Initialize();
RDebugUtils.currentLine=150863945;
 //BA.debugLineNum = 150863945;BA.debugLine="TypeObjectsList = DBStructures.GetListOfObjectsTy";
mostCurrent._typeobjectslist = mostCurrent._dbstructures._getlistofobjectstypesevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=150863946;
 //BA.debugLineNum = 150863946;BA.debugLine="LocalsList.Initialize";
mostCurrent._localslist.Initialize();
RDebugUtils.currentLine=150863947;
 //BA.debugLineNum = 150863947;BA.debugLine="LocalsList = DBStructures.GetListOfLocalEVC 'GetL";
mostCurrent._localslist = mostCurrent._dbstructures._getlistoflocalevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=150863949;
 //BA.debugLineNum = 150863949;BA.debugLine="butCreateRequestCancel.Color = Consts.ColorMain";
mostCurrent._butcreaterequestcancel.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=150863950;
 //BA.debugLineNum = 150863950;BA.debugLine="butCreateRequest.Color = Consts.ColorMain";
mostCurrent._butcreaterequest.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=150863951;
 //BA.debugLineNum = 150863951;BA.debugLine="butBulkCreateRequest.Color  = Consts.ColorMain";
mostCurrent._butbulkcreaterequest.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=150863952;
 //BA.debugLineNum = 150863952;BA.debugLine="butBulkPreRequest.Color  = Consts.ColorMain";
mostCurrent._butbulkprerequest.setColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=150863953;
 //BA.debugLineNum = 150863953;BA.debugLine="Utils.SetViewBackgroundColorToMainColor(NoRequest";
mostCurrent._utils._setviewbackgroundcolortomaincolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._norequestpaneltitlelabel.getObject())));
RDebugUtils.currentLine=150863955;
 //BA.debugLineNum = 150863955;BA.debugLine="DummyMenuPlaceHlder.Top = 0 + DummyMenuPlaceHlder";
mostCurrent._dummymenuplacehlder.setTop((int) (0+mostCurrent._dummymenuplacehlder.getHeight()+(mostCurrent._dummymenuplacehlder.getHeight()*mostCurrent._typeobjectslist.getSize()/(double)2)));
RDebugUtils.currentLine=150863956;
 //BA.debugLineNum = 150863956;BA.debugLine="ObjectTypePopMenu.Initialize(Activity, Me, DummyM";
mostCurrent._objecttypepopmenu._initialize(mostCurrent.activityBA,mostCurrent._activity,objects.getObject(),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._dummymenuplacehlder.getObject())),mostCurrent._consts._colormain /*int*/ ,anywheresoftware.b4a.keywords.Common.Colors.White,mostCurrent._consts._colorsub /*int*/ ,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150863958;
 //BA.debugLineNum = 150863958;BA.debugLine="For i=0 To TypeObjectsList.Size-1";
{
final int step64 = 1;
final int limit64 = (int) (mostCurrent._typeobjectslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit64 ;_i = _i + step64 ) {
RDebugUtils.currentLine=150863959;
 //BA.debugLineNum = 150863959;BA.debugLine="Dim bt As ObjectTypes = TypeObjectsList.Get(i)";
_bt = (xevolution.vrcg.devdemov2400.types._objecttypes)(mostCurrent._typeobjectslist.Get(_i));
RDebugUtils.currentLine=150863960;
 //BA.debugLineNum = 150863960;BA.debugLine="ObjectTypePopMenu.AddMenuItem(bt.title, \"ObjectT";
mostCurrent._objecttypepopmenu._addmenuitem(_bt.title /*String*/ ,"ObjectTypePopMenu");
 }
};
RDebugUtils.currentLine=150863964;
 //BA.debugLineNum = 150863964;BA.debugLine="ObjectZonePopMenu.Initialize(Activity, Me, listsB";
mostCurrent._objectzonepopmenu._initialize(mostCurrent.activityBA,mostCurrent._activity,objects.getObject(),(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._listsbuttonzone.getObject())),mostCurrent._consts._colormain /*int*/ ,anywheresoftware.b4a.keywords.Common.Colors.White,mostCurrent._consts._colorsub /*int*/ ,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150863965;
 //BA.debugLineNum = 150863965;BA.debugLine="For i=0 To Types.ZONEOBJECTSFILTER.Size-1";
{
final int step69 = 1;
final int limit69 = (int) (mostCurrent._types._zoneobjectsfilter /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit69 ;_i = _i + step69 ) {
RDebugUtils.currentLine=150863966;
 //BA.debugLineNum = 150863966;BA.debugLine="ObjectZonePopMenu.AddMenuItem(Types.ZONEOBJECTSF";
mostCurrent._objectzonepopmenu._addmenuitem(BA.ObjectToString(mostCurrent._types._zoneobjectsfilter /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),"ObjectZonePopMenu");
 }
};
RDebugUtils.currentLine=150863969;
 //BA.debugLineNum = 150863969;BA.debugLine="SearchFilter = \"\"";
mostCurrent._searchfilter = "";
RDebugUtils.currentLine=150863971;
 //BA.debugLineNum = 150863971;BA.debugLine="Dim where As String = $\"select distinct b.object";
_where = ("select distinct b.object from requests as a inner join requests_objects as b on (b.tagcode=a.tagcode) where request_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._current_appdate /*String*/ ))+"'");
RDebugUtils.currentLine=150863972;
 //BA.debugLineNum = 150863972;BA.debugLine="ObjRequests = DBStructures.GetListOfFromScript(\"o";
mostCurrent._objrequests = mostCurrent._dbstructures._getlistoffromscript /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"object",_where);
RDebugUtils.currentLine=150863974;
 //BA.debugLineNum = 150863974;BA.debugLine="Dim s As String = Utils.StrList2SQLArray(ObjReque";
_s = mostCurrent._utils._strlist2sqlarray /*String*/ (mostCurrent.activityBA,mostCurrent._objrequests);
RDebugUtils.currentLine=150863975;
 //BA.debugLineNum = 150863975;BA.debugLine="Dim where As String = $\"Select distinct b.object";
_where = ("Select distinct b.object from requests As a inner join requests_objects As b on (b.tagcode=a.tagcode)\n"+"							where a.request_date<>'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._current_appdate /*String*/ ))+"' and b.object not in "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_s))+"");
RDebugUtils.currentLine=150863977;
 //BA.debugLineNum = 150863977;BA.debugLine="ObjRequestsNotToday = DBStructures.GetListOfFromS";
mostCurrent._objrequestsnottoday = mostCurrent._dbstructures._getlistoffromscript /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"object",_where);
RDebugUtils.currentLine=150863979;
 //BA.debugLineNum = 150863979;BA.debugLine="GroupList = DBStructures.getTASKGroups";
mostCurrent._grouplist = mostCurrent._dbstructures._gettaskgroups /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=150863982;
 //BA.debugLineNum = 150863982;BA.debugLine="Dim sSQL As String = $\"SELECT tagcode, title FROM";
_ssql = ("SELECT tagcode, title FROM dta_typerequests WHERE active=1");
RDebugUtils.currentLine=150863983;
 //BA.debugLineNum = 150863983;BA.debugLine="ReqList.Initialize";
mostCurrent._reqlist.Initialize();
RDebugUtils.currentLine=150863984;
 //BA.debugLineNum = 150863984;BA.debugLine="ReqList = DBStructures.GetListOfFromScriptCNLEVC(";
mostCurrent._reqlist = mostCurrent._dbstructures._getlistoffromscriptcnlevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"tagcode","title",_ssql);
RDebugUtils.currentLine=150863987;
 //BA.debugLineNum = 150863987;BA.debugLine="DistrictsList.Initialize";
mostCurrent._districtslist.Initialize();
RDebugUtils.currentLine=150863988;
 //BA.debugLineNum = 150863988;BA.debugLine="DistrictsList = DBStructures.GetListOfFromScriptC";
mostCurrent._districtslist = mostCurrent._dbstructures._getlistoffromscriptcnlevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"tagcode","title",mostCurrent._dbstructures._evc_sql_getdistricts /*String*/ );
RDebugUtils.currentLine=150863991;
 //BA.debugLineNum = 150863991;BA.debugLine="CountyList.Initialize";
mostCurrent._countylist.Initialize();
RDebugUtils.currentLine=150863992;
 //BA.debugLineNum = 150863992;BA.debugLine="CountyList = DBStructures.GetListOfFromScriptCNLE";
mostCurrent._countylist = mostCurrent._dbstructures._getlistoffromscriptcnlevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"tagcode","title",mostCurrent._dbstructures._evc_sql_getcounties /*String*/ );
RDebugUtils.currentLine=150863994;
 //BA.debugLineNum = 150863994;BA.debugLine="Dim flist As List : flist.initialize";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150863994;
 //BA.debugLineNum = 150863994;BA.debugLine="Dim flist As List : flist.initialize";
_flist.Initialize();
RDebugUtils.currentLine=150863995;
 //BA.debugLineNum = 150863995;BA.debugLine="flist.Add(\"(Todos)\")";
_flist.Add((Object)("(Todos)"));
RDebugUtils.currentLine=150863996;
 //BA.debugLineNum = 150863996;BA.debugLine="For i = 0 To GroupList.Size-1";
{
final int step89 = 1;
final int limit89 = (int) (mostCurrent._grouplist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit89 ;_i = _i + step89 ) {
RDebugUtils.currentLine=150863997;
 //BA.debugLineNum = 150863997;BA.debugLine="Dim itc As DB_ITC = GroupList.Get(i)";
_itc = (xevolution.vrcg.devdemov2400.types._db_itc)(mostCurrent._grouplist.Get(_i));
RDebugUtils.currentLine=150863998;
 //BA.debugLineNum = 150863998;BA.debugLine="flist.Add(itc.Title)";
_flist.Add((Object)(_itc.Title /*String*/ ));
 }
};
RDebugUtils.currentLine=150864000;
 //BA.debugLineNum = 150864000;BA.debugLine="CLARequestTypeSpinner.AddAll(flist)";
mostCurrent._clarequesttypespinner.AddAll(_flist);
RDebugUtils.currentLine=150864003;
 //BA.debugLineNum = 150864003;BA.debugLine="Dim flist As List : flist.initialize";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150864003;
 //BA.debugLineNum = 150864003;BA.debugLine="Dim flist As List : flist.initialize";
_flist.Initialize();
RDebugUtils.currentLine=150864004;
 //BA.debugLineNum = 150864004;BA.debugLine="flist.Add(\"(Todos)\")";
_flist.Add((Object)("(Todos)"));
RDebugUtils.currentLine=150864005;
 //BA.debugLineNum = 150864005;BA.debugLine="For i = 0 To ReqList.Size-1";
{
final int step97 = 1;
final int limit97 = (int) (mostCurrent._reqlist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=150864006;
 //BA.debugLineNum = 150864006;BA.debugLine="Dim r As CodeNameList = ReqList.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(mostCurrent._reqlist.Get(_i));
RDebugUtils.currentLine=150864007;
 //BA.debugLineNum = 150864007;BA.debugLine="flist.Add( r.Name )";
_flist.Add((Object)(_r.Name /*String*/ ));
 }
};
RDebugUtils.currentLine=150864010;
 //BA.debugLineNum = 150864010;BA.debugLine="CLAPreRequestPickerLabel.AddAll(flist)";
mostCurrent._claprerequestpickerlabel.AddAll(_flist);
RDebugUtils.currentLine=150864012;
 //BA.debugLineNum = 150864012;BA.debugLine="Dim flist As List : flist.initialize";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150864012;
 //BA.debugLineNum = 150864012;BA.debugLine="Dim flist As List : flist.initialize";
_flist.Initialize();
RDebugUtils.currentLine=150864013;
 //BA.debugLineNum = 150864013;BA.debugLine="flist.Add(\"(Todos)\")";
_flist.Add((Object)("(Todos)"));
RDebugUtils.currentLine=150864014;
 //BA.debugLineNum = 150864014;BA.debugLine="For i = 0 To DistrictsList.Size-1";
{
final int step105 = 1;
final int limit105 = (int) (mostCurrent._districtslist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit105 ;_i = _i + step105 ) {
RDebugUtils.currentLine=150864015;
 //BA.debugLineNum = 150864015;BA.debugLine="Dim r As CodeNameList = DistrictsList.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(mostCurrent._districtslist.Get(_i));
RDebugUtils.currentLine=150864016;
 //BA.debugLineNum = 150864016;BA.debugLine="flist.Add(r.Name)";
_flist.Add((Object)(_r.Name /*String*/ ));
 }
};
RDebugUtils.currentLine=150864018;
 //BA.debugLineNum = 150864018;BA.debugLine="CLAPreRequestDistrictePickerLabel.AddAll(flist)";
mostCurrent._claprerequestdistrictepickerlabel.AddAll(_flist);
RDebugUtils.currentLine=150864020;
 //BA.debugLineNum = 150864020;BA.debugLine="Dim flist As List : flist.initialize";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=150864020;
 //BA.debugLineNum = 150864020;BA.debugLine="Dim flist As List : flist.initialize";
_flist.Initialize();
RDebugUtils.currentLine=150864021;
 //BA.debugLineNum = 150864021;BA.debugLine="flist.Add(\"(Todos)\")";
_flist.Add((Object)("(Todos)"));
RDebugUtils.currentLine=150864022;
 //BA.debugLineNum = 150864022;BA.debugLine="For i = 0 To CountyList.Size-1";
{
final int step113 = 1;
final int limit113 = (int) (mostCurrent._countylist.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit113 ;_i = _i + step113 ) {
RDebugUtils.currentLine=150864023;
 //BA.debugLineNum = 150864023;BA.debugLine="Dim r As CodeNameList = CountyList.Get(i)";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(mostCurrent._countylist.Get(_i));
RDebugUtils.currentLine=150864024;
 //BA.debugLineNum = 150864024;BA.debugLine="flist.Add(r.Name)";
_flist.Add((Object)(_r.Name /*String*/ ));
 }
};
RDebugUtils.currentLine=150864026;
 //BA.debugLineNum = 150864026;BA.debugLine="CLAPreRequestCountyPickerLabel.AddAll(flist)";
mostCurrent._claprerequestcountypickerlabel.AddAll(_flist);
RDebugUtils.currentLine=150864027;
 //BA.debugLineNum = 150864027;BA.debugLine="noRequestPanel.Visible = False";
mostCurrent._norequestpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=150864028;
 //BA.debugLineNum = 150864028;BA.debugLine="UpdateMainLayout";
_updatemainlayout();
RDebugUtils.currentLine=150864030;
 //BA.debugLineNum = 150864030;BA.debugLine="End Sub";
return "";
}
public static String  _updatemainlayout() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemainlayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemainlayout", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=150929408;
 //BA.debugLineNum = 150929408;BA.debugLine="Sub UpdateMainLayout";
RDebugUtils.currentLine=150929409;
 //BA.debugLineNum = 150929409;BA.debugLine="mainLabelOptLists.TextColor = Consts.ColorMain";
mostCurrent._mainlabeloptlists.setTextColor(mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=150929410;
 //BA.debugLineNum = 150929410;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=150929411;
 //BA.debugLineNum = 150929411;BA.debugLine="mainLogo.Gravity = Gravity.FILL";
mostCurrent._mainlogo.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=150929412;
 //BA.debugLineNum = 150929412;BA.debugLine="mainLogo.Width = Consts.LogoWidth";
mostCurrent._mainlogo.setWidth(mostCurrent._consts._logowidth /*int*/ );
RDebugUtils.currentLine=150929413;
 //BA.debugLineNum = 150929413;BA.debugLine="Log($\"Inicialização de BMP: ${ShareCode.APP_MAIN";
anywheresoftware.b4a.keywords.Common.LogImpl("6150929413",("Inicialização de BMP: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._app_main_logo_mini /*String*/ ))+""),0);
RDebugUtils.currentLine=150929414;
 //BA.debugLineNum = 150929414;BA.debugLine="If (Utils.NNE(ShareCode.APP_MAIN_LOGO_MINI)) The";
if ((mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ))) { 
RDebugUtils.currentLine=150929415;
 //BA.debugLineNum = 150929415;BA.debugLine="mainLogo.SetBackgroundImage(Utils.B64ToBitmap(S";
mostCurrent._mainlogo.SetBackgroundImageNew((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,mostCurrent._sharecode._app_main_logo_mini /*String*/ ).getObject()));
 };
 };
RDebugUtils.currentLine=150929421;
 //BA.debugLineNum = 150929421;BA.debugLine="Utils.SetViewBackgroundColorToMainGradientColor(C";
mostCurrent._utils._setviewbackgroundcolortomaingradientcolor /*String*/ (mostCurrent.activityBA,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(mostCurrent._colortabpanel.getObject())));
RDebugUtils.currentLine=150929422;
 //BA.debugLineNum = 150929422;BA.debugLine="Dim jo As JavaObject = listsTabPanel";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(mostCurrent._liststabpanel));
RDebugUtils.currentLine=150929423;
 //BA.debugLineNum = 150929423;BA.debugLine="jo = jo.GetField(\"tabStrip\")";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.GetField("tabStrip")));
RDebugUtils.currentLine=150929425;
 //BA.debugLineNum = 150929425;BA.debugLine="jo.RunMethod(\"setIndicatorColor\", Array(Consts.Co";
_jo.RunMethod("setIndicatorColor",new Object[]{(Object)(mostCurrent._consts._colormain /*int*/ )});
RDebugUtils.currentLine=150929426;
 //BA.debugLineNum = 150929426;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=151126016;
 //BA.debugLineNum = 151126016;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=151126017;
 //BA.debugLineNum = 151126017;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=151126018;
 //BA.debugLineNum = 151126018;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
 };
RDebugUtils.currentLine=151126020;
 //BA.debugLineNum = 151126020;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=151126021;
 //BA.debugLineNum = 151126021;BA.debugLine="End Sub";
return false;
}
public static String  _listsbuttonclose_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonclose_click", null));}
RDebugUtils.currentLine=152043520;
 //BA.debugLineNum = 152043520;BA.debugLine="Sub listsButtonClose_Click";
RDebugUtils.currentLine=152043521;
 //BA.debugLineNum = 152043521;BA.debugLine="Log(\"Back OBJECTS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6152043521","Back OBJECTS",0);
RDebugUtils.currentLine=152043522;
 //BA.debugLineNum = 152043522;BA.debugLine="Starter.ObjectKeepFilter  = True";
mostCurrent._starter._objectkeepfilter /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=152043523;
 //BA.debugLineNum = 152043523;BA.debugLine="Starter.ObjectSearchFilter = SearchFilter";
mostCurrent._starter._objectsearchfilter /*String*/  = mostCurrent._searchfilter;
RDebugUtils.currentLine=152043524;
 //BA.debugLineNum = 152043524;BA.debugLine="Starter.ObjectFilter = Types.MakeObjectFilter(iDi";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/  = mostCurrent._types._makeobjectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ (mostCurrent.activityBA,_idialogreqtypeobject,_idialogreqzone,_idialogreqstatus,_idialogreqregion,_idialogreqlocal,mostCurrent._sdialogreqname,mostCurrent._sdialogreqaddress,_idialogreqwithrequests);
RDebugUtils.currentLine=152043527;
 //BA.debugLineNum = 152043527;BA.debugLine="CallSubDelayed2(MainMenu, \"ListsReturn\", \"\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"ListsReturn",(Object)(""));
RDebugUtils.currentLine=152043528;
 //BA.debugLineNum = 152043528;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=152043529;
 //BA.debugLineNum = 152043529;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=152043530;
 //BA.debugLineNum = 152043530;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="objects";
RDebugUtils.currentLine=151060480;
 //BA.debugLineNum = 151060480;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=151060481;
 //BA.debugLineNum = 151060481;BA.debugLine="End Sub";
return "";
}
public static void  _activity_resume() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {Debug.delegate(mostCurrent.activityBA, "activity_resume", null); return;}
ResumableSub_Activity_Resume rsub = new ResumableSub_Activity_Resume(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_Activity_Resume extends BA.ResumableSub {
public ResumableSub_Activity_Resume(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=150994945;
 //BA.debugLineNum = 150994945;BA.debugLine="If(FirstTimeBool) Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._firsttimebool)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=150994946;
 //BA.debugLineNum = 150994946;BA.debugLine="Sleep(2000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "activity_resume"),(int) (2000));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=150994947;
 //BA.debugLineNum = 150994947;BA.debugLine="StartObjectsActivity(False, \"\")";
_startobjectsactivity(anywheresoftware.b4a.keywords.Common.False,"");
RDebugUtils.currentLine=150994948;
 //BA.debugLineNum = 150994948;BA.debugLine="FirstTimeBool = False";
parent._firsttimebool = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=150994950;
 //BA.debugLineNum = 150994950;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _startobjectsactivity(boolean _clear,String _filter) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startobjectsactivity", false))
	 {Debug.delegate(mostCurrent.activityBA, "startobjectsactivity", new Object[] {_clear,_filter}); return;}
ResumableSub_StartObjectsActivity rsub = new ResumableSub_StartObjectsActivity(null,_clear,_filter);
rsub.resume(processBA, null);
}
public static class ResumableSub_StartObjectsActivity extends BA.ResumableSub {
public ResumableSub_StartObjectsActivity(xevolution.vrcg.devdemov2400.objects parent,boolean _clear,String _filter) {
this.parent = parent;
this._clear = _clear;
this._filter = _filter;
}
xevolution.vrcg.devdemov2400.objects parent;
boolean _clear;
String _filter;
String _sfilter = "";
xevolution.vrcg.devdemov2400.types._objectfilter _tfilter = null;
int _height = 0;
int _mapheight = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
int _thislinescount = 0;
int _row = 0;
String _icstring = "";
String _status_color = "";
String _tagcode = "";
String _latitude = "";
String _longitude = "";
int step55;
int limit55;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=151584770;
 //BA.debugLineNum = 151584770;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralLoadingMessa";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalloadingmessage /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=151584771;
 //BA.debugLineNum = 151584771;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "startobjectsactivity"),(int) (100));
this.state = 55;
return;
case 55:
//C
this.state = 1;
;
RDebugUtils.currentLine=151584773;
 //BA.debugLineNum = 151584773;BA.debugLine="If (Starter.ObjectKeepFilter = True) Then";
if (true) break;

case 1:
//if
this.state = 54;
if ((parent.mostCurrent._starter._objectkeepfilter /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True)) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=151584774;
 //BA.debugLineNum = 151584774;BA.debugLine="Starter.ObjectKeepFilter = False";
parent.mostCurrent._starter._objectkeepfilter /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=151584775;
 //BA.debugLineNum = 151584775;BA.debugLine="If (Starter.ObjectSearchFilter <> \"\") Then";
if (true) break;

case 4:
//if
this.state = 9;
if (((parent.mostCurrent._starter._objectsearchfilter /*String*/ ).equals("") == false)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=151584776;
 //BA.debugLineNum = 151584776;BA.debugLine="Dim sFilter As String = Starter.ObjectSearchFil";
_sfilter = parent.mostCurrent._starter._objectsearchfilter /*String*/ ;
RDebugUtils.currentLine=151584777;
 //BA.debugLineNum = 151584777;BA.debugLine="Starter.ObjectSearchFilter = \"\"";
parent.mostCurrent._starter._objectsearchfilter /*String*/  = "";
RDebugUtils.currentLine=151584778;
 //BA.debugLineNum = 151584778;BA.debugLine="Starter.ObjectFilter = Types.MakeObjectFilter(S";
parent.mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/  = parent.mostCurrent._types._makeobjectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._obj_defaulttype /*int*/ ,parent.mostCurrent._sharecode._obj_defaultzone /*int*/ ,(int) (0),(int) (0),(int) (0),"","",(int) (0));
RDebugUtils.currentLine=151584779;
 //BA.debugLineNum = 151584779;BA.debugLine="StartObjectsActivity(True, sFilter)";
_startobjectsactivity(anywheresoftware.b4a.keywords.Common.True,_sfilter);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=151584781;
 //BA.debugLineNum = 151584781;BA.debugLine="Dim tFilter As ObjectFilter = Starter.ObjectFil";
_tfilter = parent.mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ ;
RDebugUtils.currentLine=151584783;
 //BA.debugLineNum = 151584783;BA.debugLine="Starter.ObjectSearchFilter = \"\"";
parent.mostCurrent._starter._objectsearchfilter /*String*/  = "";
RDebugUtils.currentLine=151584784;
 //BA.debugLineNum = 151584784;BA.debugLine="SetTheFilters(tFilter)";
_setthefilters(_tfilter);
 if (true) break;

case 9:
//C
this.state = 54;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=151584788;
 //BA.debugLineNum = 151584788;BA.debugLine="If Clear Then";
if (true) break;

case 12:
//if
this.state = 21;
if (_clear) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=151584789;
 //BA.debugLineNum = 151584789;BA.debugLine="Try";
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
RDebugUtils.currentLine=151584790;
 //BA.debugLineNum = 151584790;BA.debugLine="listObjects.Clear";
parent.mostCurrent._listobjects._clear();
RDebugUtils.currentLine=151584791;
 //BA.debugLineNum = 151584791;BA.debugLine="Markers.Clear";
parent._markers.Clear();
RDebugUtils.currentLine=151584792;
 //BA.debugLineNum = 151584792;BA.debugLine="StartingRow = 0";
parent._startingrow = (int) (0);
RDebugUtils.currentLine=151584793;
 //BA.debugLineNum = 151584793;BA.debugLine="NextStartingRow = 0";
parent._nextstartingrow = (int) (0);
RDebugUtils.currentLine=151584794;
 //BA.debugLineNum = 151584794;BA.debugLine="ReadRows = 20";
parent._readrows = (int) (20);
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=151584796;
 //BA.debugLineNum = 151584796;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6151584796",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=151584797;
 //BA.debugLineNum = 151584797;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=151584801;
 //BA.debugLineNum = 151584801;BA.debugLine="Dim height As Int = 95dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (95));
RDebugUtils.currentLine=151584802;
 //BA.debugLineNum = 151584802;BA.debugLine="Dim mapHeight As Int = 95dip";
_mapheight = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (95));
RDebugUtils.currentLine=151584803;
 //BA.debugLineNum = 151584803;BA.debugLine="If(ShareCode.ISPHONE) Then";
if (true) break;

case 22:
//if
this.state = 25;
if ((parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=151584804;
 //BA.debugLineNum = 151584804;BA.debugLine="height =  245dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (245));
RDebugUtils.currentLine=151584805;
 //BA.debugLineNum = 151584805;BA.debugLine="mapHeight = 85dip";
_mapheight = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85));
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=151584807;
 //BA.debugLineNum = 151584807;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=151584808;
 //BA.debugLineNum = 151584808;BA.debugLine="ItemsCounter = 0";
parent._itemscounter = (int) (0);
RDebugUtils.currentLine=151584815;
 //BA.debugLineNum = 151584815;BA.debugLine="Dim SQL As String = DBStructures.EVC_SQL_CURRENT";
_sql = parent.mostCurrent._dbstructures._evc_sql_current_objects /*String*/ ;
RDebugUtils.currentLine=151584819;
 //BA.debugLineNum = 151584819;BA.debugLine="If (Filter <> \"\") Then";
if (true) break;

case 26:
//if
this.state = 31;
if (((_filter).equals("") == false)) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=151584820;
 //BA.debugLineNum = 151584820;BA.debugLine="SQL = $\"${SQL} where ${Filter} and ((a.title_im";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" where "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filter))+" and ((a.title_import is not null) and ((a.title_import <>'') and (a.tagcode <>'__NONE__'))) ");
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=151584822;
 //BA.debugLineNum = 151584822;BA.debugLine="SQL = $\"${SQL} where ((a.title_import is not nu";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" where ((a.title_import is not null) and ((a.title_import <>'') and (a.tagcode <>'__NONE__'))) ");
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=151584825;
 //BA.debugLineNum = 151584825;BA.debugLine="Log(SQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6151584825",_sql,0);
RDebugUtils.currentLine=151584827;
 //BA.debugLineNum = 151584827;BA.debugLine="SQL = $\"${SQL} order by a.title_import limit ${S";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sql))+" order by a.title_import limit "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._startingrow))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._readrows))+"");
RDebugUtils.currentLine=151584829;
 //BA.debugLineNum = 151584829;BA.debugLine="Log(SQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6151584829",_sql,0);
RDebugUtils.currentLine=151584831;
 //BA.debugLineNum = 151584831;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=151584834;
 //BA.debugLineNum = 151584834;BA.debugLine="Dim thisLinesCount As Int = Record.RowCount";
_thislinescount = _record.getRowCount();
RDebugUtils.currentLine=151584836;
 //BA.debugLineNum = 151584836;BA.debugLine="If (thisLinesCount < ReadRows) Then";
if (true) break;

case 32:
//if
this.state = 37;
if ((_thislinescount<parent._readrows)) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
RDebugUtils.currentLine=151584837;
 //BA.debugLineNum = 151584837;BA.debugLine="NextStartingRow = StartingRow";
parent._nextstartingrow = parent._startingrow;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=151584839;
 //BA.debugLineNum = 151584839;BA.debugLine="NextStartingRow = StartingRow + ReadRows";
parent._nextstartingrow = (int) (parent._startingrow+parent._readrows);
RDebugUtils.currentLine=151584840;
 //BA.debugLineNum = 151584840;BA.debugLine="ItemsCounter = StartingRow";
parent._itemscounter = parent._startingrow;
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=151584843;
 //BA.debugLineNum = 151584843;BA.debugLine="TotalLineItems = NextStartingRow";
parent._totallineitems = parent._nextstartingrow;
RDebugUtils.currentLine=151584845;
 //BA.debugLineNum = 151584845;BA.debugLine="If Record.RowCount > 0 Then";
if (true) break;

case 38:
//if
this.state = 53;
if (_record.getRowCount()>0) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=151584856;
 //BA.debugLineNum = 151584856;BA.debugLine="For Row = 0 To Record.RowCount-1";
if (true) break;

case 41:
//for
this.state = 52;
step55 = 1;
limit55 = (int) (_record.getRowCount()-1);
_row = (int) (0) ;
this.state = 56;
if (true) break;

case 56:
//C
this.state = 52;
if ((step55 > 0 && _row <= limit55) || (step55 < 0 && _row >= limit55)) this.state = 43;
if (true) break;

case 57:
//C
this.state = 56;
_row = ((int)(0 + _row + step55)) ;
if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=151584857;
 //BA.debugLineNum = 151584857;BA.debugLine="Record.Position = Row";
_record.setPosition(_row);
RDebugUtils.currentLine=151584858;
 //BA.debugLineNum = 151584858;BA.debugLine="Dim icString As String = \"\"";
_icstring = "";
RDebugUtils.currentLine=151584860;
 //BA.debugLineNum = 151584860;BA.debugLine="Dim status_color As String = Record.GetString(";
_status_color = _record.GetString("status_color");
RDebugUtils.currentLine=151584861;
 //BA.debugLineNum = 151584861;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagc";
_tagcode = _record.GetString("tagcode");
RDebugUtils.currentLine=151584862;
 //BA.debugLineNum = 151584862;BA.debugLine="Dim latitude As String = Record.GetString(\"lat";
_latitude = _record.GetString("latitude");
RDebugUtils.currentLine=151584863;
 //BA.debugLineNum = 151584863;BA.debugLine="Dim longitude As String = Record.GetString(\"lo";
_longitude = _record.GetString("longitude");
RDebugUtils.currentLine=151584865;
 //BA.debugLineNum = 151584865;BA.debugLine="ItemsCounter = ItemsCounter + 1";
parent._itemscounter = (int) (parent._itemscounter+1);
RDebugUtils.currentLine=151584866;
 //BA.debugLineNum = 151584866;BA.debugLine="icString = ItemsCounter";
_icstring = BA.NumberToString(parent._itemscounter);
RDebugUtils.currentLine=151584869;
 //BA.debugLineNum = 151584869;BA.debugLine="If (ObjRequests.IndexOf(tagcode) >= 0) Then";
if (true) break;

case 44:
//if
this.state = 47;
if ((parent.mostCurrent._objrequests.IndexOf((Object)(_tagcode))>=0)) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=151584870;
 //BA.debugLineNum = 151584870;BA.debugLine="status_color = \"BLUE\"";
_status_color = "BLUE";
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=151584873;
 //BA.debugLineNum = 151584873;BA.debugLine="listObjects.Add( CreateListItem(icString, Reco";
parent.mostCurrent._listobjects._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitem(_icstring,_record,parent.mostCurrent._listobjects._asview().getWidth(),_height,parent.mostCurrent._objrequests,parent.mostCurrent._objrequestsnottoday).getObject())),(Object)(""));
RDebugUtils.currentLine=151584875;
 //BA.debugLineNum = 151584875;BA.debugLine="If Not(Utils.isNullOrEmpty(latitude)) And Not(";
if (true) break;

case 48:
//if
this.state = 51;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_latitude)) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_longitude))) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=151584879;
 //BA.debugLineNum = 151584879;BA.debugLine="listPedidosMap.Add( CreateListItemMap(icStrin";
parent.mostCurrent._listpedidosmap._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistitemmap(_icstring,_record,parent.mostCurrent._listpedidosmap._asview().getWidth(),_mapheight,parent.mostCurrent._objrequests,parent.mostCurrent._objrequestsnottoday).getObject())),(Object)(""));
 if (true) break;

case 51:
//C
this.state = 57;
;
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=151584885;
 //BA.debugLineNum = 151584885;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=151584886;
 //BA.debugLineNum = 151584886;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=151584890;
 //BA.debugLineNum = 151584890;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=151584892;
 //BA.debugLineNum = 151584892;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizasvr_clai_update(xevolution.vrcg.devdemov2400.types._requestcla _cla,String _itemtc,String _uk,String _val2fill,String _objval,int _repcnt) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actualizasvr_clai_update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "actualizasvr_clai_update", new Object[] {_cla,_itemtc,_uk,_val2fill,_objval,_repcnt}));}
ResumableSub_ActualizaSvr_CLAI_Update rsub = new ResumableSub_ActualizaSvr_CLAI_Update(null,_cla,_itemtc,_uk,_val2fill,_objval,_repcnt);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizaSvr_CLAI_Update extends BA.ResumableSub {
public ResumableSub_ActualizaSvr_CLAI_Update(xevolution.vrcg.devdemov2400.objects parent,xevolution.vrcg.devdemov2400.types._requestcla _cla,String _itemtc,String _uk,String _val2fill,String _objval,int _repcnt) {
this.parent = parent;
this._cla = _cla;
this._itemtc = _itemtc;
this._uk = _uk;
this._val2fill = _val2fill;
this._objval = _objval;
this._repcnt = _repcnt;
}
xevolution.vrcg.devdemov2400.objects parent;
xevolution.vrcg.devdemov2400.types._requestcla _cla;
String _itemtc;
String _uk;
String _val2fill;
String _objval;
int _repcnt;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _aclsessuser = "";
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156303361;
 //BA.debugLineNum = 156303361;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=156303362;
 //BA.debugLineNum = 156303362;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=156303363;
 //BA.debugLineNum = 156303363;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=156303364;
 //BA.debugLineNum = 156303364;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=156303365;
 //BA.debugLineNum = 156303365;BA.debugLine="params.Put(\"ACLARequest\", CLA.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_cla.Request /*String*/ ));
RDebugUtils.currentLine=156303366;
 //BA.debugLineNum = 156303366;BA.debugLine="params.Put(\"ACLAAction\", CLA.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_cla.Action /*String*/ ));
RDebugUtils.currentLine=156303367;
 //BA.debugLineNum = 156303367;BA.debugLine="params.Put(\"ACLATask\", CLA.Task)";
_params.Put((Object)("ACLATask"),(Object)(_cla.Task /*String*/ ));
RDebugUtils.currentLine=156303368;
 //BA.debugLineNum = 156303368;BA.debugLine="params.Put(\"ACLAItem\",itemTC)";
_params.Put((Object)("ACLAItem"),(Object)(_itemtc));
RDebugUtils.currentLine=156303369;
 //BA.debugLineNum = 156303369;BA.debugLine="params.Put(\"ACLAUniqueKey\", UK)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_uk));
RDebugUtils.currentLine=156303371;
 //BA.debugLineNum = 156303371;BA.debugLine="params.Put(\"ACLAObjectTag\", ObjVal)";
_params.Put((Object)("ACLAObjectTag"),(Object)(_objval));
RDebugUtils.currentLine=156303372;
 //BA.debugLineNum = 156303372;BA.debugLine="params.Put(\"ACLAValue\", val2fill)";
_params.Put((Object)("ACLAValue"),(Object)(_val2fill));
RDebugUtils.currentLine=156303373;
 //BA.debugLineNum = 156303373;BA.debugLine="params.Put(\"ACLAReqCounter\", repcnt)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_repcnt));
RDebugUtils.currentLine=156303374;
 //BA.debugLineNum = 156303374;BA.debugLine="params.Put(\"ACLARepeatItem\", 0)";
_params.Put((Object)("ACLARepeatItem"),(Object)(0));
RDebugUtils.currentLine=156303375;
 //BA.debugLineNum = 156303375;BA.debugLine="params.Put(\"ACLARepeatField\", 0)";
_params.Put((Object)("ACLARepeatField"),(Object)(0));
RDebugUtils.currentLine=156303376;
 //BA.debugLineNum = 156303376;BA.debugLine="params.Put(\"ACLAInner\", 0)";
_params.Put((Object)("ACLAInner"),(Object)(0));
RDebugUtils.currentLine=156303378;
 //BA.debugLineNum = 156303378;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=156303379;
 //BA.debugLineNum = 156303379;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=156303380;
 //BA.debugLineNum = 156303380;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=156303381;
 //BA.debugLineNum = 156303381;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=156303382;
 //BA.debugLineNum = 156303382;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=156303383;
 //BA.debugLineNum = 156303383;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=156303384;
 //BA.debugLineNum = 156303384;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156303385;
 //BA.debugLineNum = 156303385;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDateti";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=156303386;
 //BA.debugLineNum = 156303386;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=156303387;
 //BA.debugLineNum = 156303387;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=156303389;
 //BA.debugLineNum = 156303389;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=156303390;
 //BA.debugLineNum = 156303390;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=156303391;
 //BA.debugLineNum = 156303391;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=156303392;
 //BA.debugLineNum = 156303392;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_OPER_U";
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*String*/ ;
RDebugUtils.currentLine=156303394;
 //BA.debugLineNum = 156303394;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
_params.Put((Object)("ACLSessUser"),(Object)(_aclsessuser));
RDebugUtils.currentLine=156303395;
 //BA.debugLineNum = 156303395;BA.debugLine="params.Put(\"ACLClear\", 0)";
_params.Put((Object)("ACLClear"),(Object)(0));
RDebugUtils.currentLine=156303397;
 //BA.debugLineNum = 156303397;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_DOM";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/update");
RDebugUtils.currentLine=156303398;
 //BA.debugLineNum = 156303398;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST_UPLOA";
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
RDebugUtils.currentLine=156303399;
 //BA.debugLineNum = 156303399;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=156303400;
 //BA.debugLineNum = 156303400;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLA.Reque";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,objects.getObject(),_url,"",_cla.Request /*String*/ );
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=156303402;
 //BA.debugLineNum = 156303402;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_cla.Request /*String*/ .trim(),"","");
RDebugUtils.currentLine=156303403;
 //BA.debugLineNum = 156303403;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=156303405;
 //BA.debugLineNum = 156303405;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "actualizasvr_clai_update"),(int) (250));
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
RDebugUtils.currentLine=156303407;
 //BA.debugLineNum = 156303407;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_cla.Request /*String*/ .trim(),"","");
RDebugUtils.currentLine=156303408;
 //BA.debugLineNum = 156303408;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params),";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=156303411;
 //BA.debugLineNum = 156303411;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=156303413;
 //BA.debugLineNum = 156303413;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _addfavoritelabel_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "addfavoritelabel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "addfavoritelabel_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String _requestadded = "";
RDebugUtils.currentLine=156696576;
 //BA.debugLineNum = 156696576;BA.debugLine="Sub AddFavoriteLabel_Click";
RDebugUtils.currentLine=156696577;
 //BA.debugLineNum = 156696577;BA.debugLine="Dim lbl As Label =  Sender";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=156696578;
 //BA.debugLineNum = 156696578;BA.debugLine="Dim requestAdded As String = 0xFFD3D3D3";
_requestadded = BA.NumberToString(0xffd3d3d3);
RDebugUtils.currentLine=156696580;
 //BA.debugLineNum = 156696580;BA.debugLine="If(lbl.TextColor <> requestAdded)Then";
if ((_lbl.getTextColor()!=(double)(Double.parseDouble(_requestadded)))) { 
RDebugUtils.currentLine=156696581;
 //BA.debugLineNum = 156696581;BA.debugLine="lbl.Text  = Chr(0xf006)";
_lbl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf006))));
RDebugUtils.currentLine=156696582;
 //BA.debugLineNum = 156696582;BA.debugLine="lbl.TextColor = 0xFFD3D3D3";
_lbl.setTextColor((int) (0xffd3d3d3));
 }else {
RDebugUtils.currentLine=156696585;
 //BA.debugLineNum = 156696585;BA.debugLine="lbl.Text  = Chr(0xf005)";
_lbl.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf005))));
RDebugUtils.currentLine=156696586;
 //BA.debugLineNum = 156696586;BA.debugLine="lbl.TextColor = 0xFFFFCC00";
_lbl.setTextColor((int) (0xffffcc00));
 };
RDebugUtils.currentLine=156696589;
 //BA.debugLineNum = 156696589;BA.debugLine="End Sub";
return "";
}
public static String  _butbulkcreaterequest_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butbulkcreaterequest_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butbulkcreaterequest_click", null));}
RDebugUtils.currentLine=155385856;
 //BA.debugLineNum = 155385856;BA.debugLine="Sub butBulkCreateRequest_Click";
RDebugUtils.currentLine=155385857;
 //BA.debugLineNum = 155385857;BA.debugLine="FromBulkOption = 1";
_frombulkoption = (int) (1);
RDebugUtils.currentLine=155385858;
 //BA.debugLineNum = 155385858;BA.debugLine="listButRequest_Click";
_listbutrequest_click();
RDebugUtils.currentLine=155385859;
 //BA.debugLineNum = 155385859;BA.debugLine="UpdateExtraButtons";
_updateextrabuttons();
RDebugUtils.currentLine=155385860;
 //BA.debugLineNum = 155385860;BA.debugLine="End Sub";
return "";
}
public static String  _listbutrequest_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutrequest_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutrequest_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _bb = null;
RDebugUtils.currentLine=155058176;
 //BA.debugLineNum = 155058176;BA.debugLine="Sub listButRequest_Click";
RDebugUtils.currentLine=155058177;
 //BA.debugLineNum = 155058177;BA.debugLine="Dim bb As Button = Sender";
_bb = new anywheresoftware.b4a.objects.ButtonWrapper();
_bb = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=155058178;
 //BA.debugLineNum = 155058178;BA.debugLine="SelObject = bb.Tag";
mostCurrent._selobject = BA.ObjectToString(_bb.getTag());
RDebugUtils.currentLine=155058179;
 //BA.debugLineNum = 155058179;BA.debugLine="noRequestPanel.Visible = True";
mostCurrent._norequestpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=155058180;
 //BA.debugLineNum = 155058180;BA.debugLine="CLARequestList.Clear";
mostCurrent._clarequestlist._clear();
RDebugUtils.currentLine=155058181;
 //BA.debugLineNum = 155058181;BA.debugLine="MakeTaskList(0, SelObject)";
_maketasklist((int) (0),mostCurrent._selobject);
RDebugUtils.currentLine=155058182;
 //BA.debugLineNum = 155058182;BA.debugLine="End Sub";
return "";
}
public static String  _updateextrabuttons() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateextrabuttons", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateextrabuttons", null));}
boolean _v = false;
RDebugUtils.currentLine=155254784;
 //BA.debugLineNum = 155254784;BA.debugLine="Sub UpdateExtraButtons";
RDebugUtils.currentLine=155254785;
 //BA.debugLineNum = 155254785;BA.debugLine="Dim v As Boolean = (SelectedObjectsCount > 0) And";
_v = (_selectedobjectscount>0) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._norequestpanel.getVisible()) && (mostCurrent._liststabpanel.getCurrentPage()==0);
RDebugUtils.currentLine=155254786;
 //BA.debugLineNum = 155254786;BA.debugLine="butBulkCreateRequest.Visible = v";
mostCurrent._butbulkcreaterequest.setVisible(_v);
RDebugUtils.currentLine=155254787;
 //BA.debugLineNum = 155254787;BA.debugLine="butBulkPreRequest.Visible = v";
mostCurrent._butbulkprerequest.setVisible(_v);
RDebugUtils.currentLine=155254788;
 //BA.debugLineNum = 155254788;BA.debugLine="End Sub";
return "";
}
public static String  _butbulkprerequest_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butbulkprerequest_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butbulkprerequest_click", null));}
RDebugUtils.currentLine=155451392;
 //BA.debugLineNum = 155451392;BA.debugLine="Sub butBulkPreRequest_Click";
RDebugUtils.currentLine=155451393;
 //BA.debugLineNum = 155451393;BA.debugLine="FromBulkOption = 1";
_frombulkoption = (int) (1);
RDebugUtils.currentLine=155451394;
 //BA.debugLineNum = 155451394;BA.debugLine="UpdateExtraButtons";
_updateextrabuttons();
RDebugUtils.currentLine=155451395;
 //BA.debugLineNum = 155451395;BA.debugLine="End Sub";
return "";
}
public static String  _butcreaterequest_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcreaterequest_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcreaterequest_click", null));}
boolean _verdade = false;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
anywheresoftware.b4a.objects.collections.List _selchecklistlist = null;
RDebugUtils.currentLine=155648000;
 //BA.debugLineNum = 155648000;BA.debugLine="Sub butCreateRequest_Click";
RDebugUtils.currentLine=155648002;
 //BA.debugLineNum = 155648002;BA.debugLine="Dim Verdade As Boolean = Utils.NNE(SelCheckList)";
_verdade = mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._selchecklist) && mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,mostCurrent._selobject);
RDebugUtils.currentLine=155648003;
 //BA.debugLineNum = 155648003;BA.debugLine="If Verdade Then";
if (_verdade) { 
RDebugUtils.currentLine=155648005;
 //BA.debugLineNum = 155648005;BA.debugLine="Dim sSQL As String = $\"select distinct a.task_ta";
_ssql = ("select distinct a.task_tagcode\n"+"							from dta_typerequests_tasks as a\n"+"							left join dta_typerequests_tasks_adds as b on\n"+"								(b.typerequest_tagcode=a.typerequest_tagcode\n"+"								and b.task_tagcode=a.task_tagcode)\n"+"							where 1=1\n"+"							and a.typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._selchecklist))+"'\n"+"							and b.paramters not like '%create_cl_only_ondemand\":1%';");
RDebugUtils.currentLine=155648014;
 //BA.debugLineNum = 155648014;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEV";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=155648015;
 //BA.debugLineNum = 155648015;BA.debugLine="Dim SelCheckListList As List : SelCheckListList.";
_selchecklistlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155648015;
 //BA.debugLineNum = 155648015;BA.debugLine="Dim SelCheckListList As List : SelCheckListList.";
_selchecklistlist.Initialize();
RDebugUtils.currentLine=155648016;
 //BA.debugLineNum = 155648016;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=155648017;
 //BA.debugLineNum = 155648017;BA.debugLine="SelCheckListList.Add(Record.GetString(\"task_tag";
_selchecklistlist.Add((Object)(_record.GetString("task_tagcode")));
 }
;
RDebugUtils.currentLine=155648019;
 //BA.debugLineNum = 155648019;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=155648020;
 //BA.debugLineNum = 155648020;BA.debugLine="If (SelCheckListList.Size>=1) Then";
if ((_selchecklistlist.getSize()>=1)) { 
RDebugUtils.currentLine=155648021;
 //BA.debugLineNum = 155648021;BA.debugLine="CreateRequestsToObjects2(SelCheckList, SelCheck";
_createrequeststoobjects2(mostCurrent._selchecklist,_selchecklistlist,mostCurrent._selobject,anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=155648023;
 //BA.debugLineNum = 155648023;BA.debugLine="MsgboxAsync(ShareCode.NoChecklistInTypeRequest,";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._nochecklistintyperequest /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 };
 };
RDebugUtils.currentLine=155648121;
 //BA.debugLineNum = 155648121;BA.debugLine="End Sub";
return "";
}
public static void  _createrequeststoobjects2(String _newrequesttype,anywheresoftware.b4a.objects.collections.List _strselchecklistlist,String _strselobject,boolean _runcl) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequeststoobjects2", false))
	 {Debug.delegate(mostCurrent.activityBA, "createrequeststoobjects2", new Object[] {_newrequesttype,_strselchecklistlist,_strselobject,_runcl}); return;}
ResumableSub_CreateRequestsToObjects2 rsub = new ResumableSub_CreateRequestsToObjects2(null,_newrequesttype,_strselchecklistlist,_strselobject,_runcl);
rsub.resume(processBA, null);
}
public static class ResumableSub_CreateRequestsToObjects2 extends BA.ResumableSub {
public ResumableSub_CreateRequestsToObjects2(xevolution.vrcg.devdemov2400.objects parent,String _newrequesttype,anywheresoftware.b4a.objects.collections.List _strselchecklistlist,String _strselobject,boolean _runcl) {
this.parent = parent;
this._newrequesttype = _newrequesttype;
this._strselchecklistlist = _strselchecklistlist;
this._strselobject = _strselobject;
this._runcl = _runcl;
}
xevolution.vrcg.devdemov2400.objects parent;
String _newrequesttype;
anywheresoftware.b4a.objects.collections.List _strselchecklistlist;
String _strselobject;
boolean _runcl;
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
String _newrequest = "";
String _newdate = "";
String _newtime = "";
int _maxid = 0;
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
int _nn = 0;
String _strselchecklist = "";
int _repeatcounter = 0;
String _ssql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resfields = null;
boolean _resfieldsok = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa1 = null;
boolean _resfieldsok1 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa2 = null;
boolean _resfieldsok2 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
String _newrequestcode = "";
int step64;
int limit64;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=155779073;
 //BA.debugLineNum = 155779073;BA.debugLine="ProgressDialogShow(ShareCode.objectMsgPrepararInt";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*String*/ ));
RDebugUtils.currentLine=155779074;
 //BA.debugLineNum = 155779074;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155779075;
 //BA.debugLineNum = 155779075;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=155779077;
 //BA.debugLineNum = 155779077;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagco";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=155779078;
 //BA.debugLineNum = 155779078;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=155779079;
 //BA.debugLineNum = 155779079;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=155779081;
 //BA.debugLineNum = 155779081;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests","id","")+1);
RDebugUtils.currentLine=155779083;
 //BA.debugLineNum = 155779083;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155779084;
 //BA.debugLineNum = 155779084;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=155779085;
 //BA.debugLineNum = 155779085;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=155779086;
 //BA.debugLineNum = 155779086;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=155779087;
 //BA.debugLineNum = 155779087;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__\"";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=155779088;
 //BA.debugLineNum = 155779088;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=155779089;
 //BA.debugLineNum = 155779089;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=155779090;
 //BA.debugLineNum = 155779090;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=155779091;
 //BA.debugLineNum = 155779091;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=155779092;
 //BA.debugLineNum = 155779092;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=155779093;
 //BA.debugLineNum = 155779093;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=155779094;
 //BA.debugLineNum = 155779094;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=155779095;
 //BA.debugLineNum = 155779095;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=155779096;
 //BA.debugLineNum = 155779096;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=155779097;
 //BA.debugLineNum = 155779097;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=155779098;
 //BA.debugLineNum = 155779098;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=155779099;
 //BA.debugLineNum = 155779099;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNAL";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=155779100;
 //BA.debugLineNum = 155779100;BA.debugLine="newExecution.Put(\"entity_tagcode\", strSelObject)";
_newexecution.Put((Object)("entity_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155779101;
 //BA.debugLineNum = 155779101;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
_newexecution.Put((Object)("object_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155779102;
 //BA.debugLineNum = 155779102;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.S";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=155779103;
 //BA.debugLineNum = 155779103;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=155779104;
 //BA.debugLineNum = 155779104;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
_newexecution.Put((Object)("local_tagcode"),(Object)(""));
RDebugUtils.currentLine=155779105;
 //BA.debugLineNum = 155779105;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReques";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_newrequesttype));
RDebugUtils.currentLine=155779106;
 //BA.debugLineNum = 155779106;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SES";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=155779107;
 //BA.debugLineNum = 155779107;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=155779108;
 //BA.debugLineNum = 155779108;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=155779109;
 //BA.debugLineNum = 155779109;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155779110;
 //BA.debugLineNum = 155779110;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155779111;
 //BA.debugLineNum = 155779111;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=155779112;
 //BA.debugLineNum = 155779112;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=155779114;
 //BA.debugLineNum = 155779114;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, \"";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=155779116;
 //BA.debugLineNum = 155779116;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_objects","id","")+1);
RDebugUtils.currentLine=155779117;
 //BA.debugLineNum = 155779117;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155779118;
 //BA.debugLineNum = 155779118;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=155779119;
 //BA.debugLineNum = 155779119;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=155779120;
 //BA.debugLineNum = 155779120;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=155779121;
 //BA.debugLineNum = 155779121;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
_newexecution.Put((Object)("object_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155779122;
 //BA.debugLineNum = 155779122;BA.debugLine="newExecution.Put(\"ismaster\", 0)";
_newexecution.Put((Object)("ismaster"),(Object)(0));
RDebugUtils.currentLine=155779123;
 //BA.debugLineNum = 155779123;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=155779124;
 //BA.debugLineNum = 155779124;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155779125;
 //BA.debugLineNum = 155779125;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155779126;
 //BA.debugLineNum = 155779126;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=155779127;
 //BA.debugLineNum = 155779127;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"dta_requ";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_requests_objects",_listofmaps);
RDebugUtils.currentLine=155779129;
 //BA.debugLineNum = 155779129;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_entities","id","")+1);
RDebugUtils.currentLine=155779130;
 //BA.debugLineNum = 155779130;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155779131;
 //BA.debugLineNum = 155779131;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=155779132;
 //BA.debugLineNum = 155779132;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=155779133;
 //BA.debugLineNum = 155779133;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=155779134;
 //BA.debugLineNum = 155779134;BA.debugLine="newExecution.Put(\"entity_tagcode\", strSelObject)";
_newexecution.Put((Object)("entity_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155779135;
 //BA.debugLineNum = 155779135;BA.debugLine="newExecution.Put(\"entity_type\", \"\")";
_newexecution.Put((Object)("entity_type"),(Object)(""));
RDebugUtils.currentLine=155779136;
 //BA.debugLineNum = 155779136;BA.debugLine="newExecution.Put(\"ismaster\", 0)";
_newexecution.Put((Object)("ismaster"),(Object)(0));
RDebugUtils.currentLine=155779137;
 //BA.debugLineNum = 155779137;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=155779138;
 //BA.debugLineNum = 155779138;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155779139;
 //BA.debugLineNum = 155779139;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155779140;
 //BA.debugLineNum = 155779140;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=155779141;
 //BA.debugLineNum = 155779141;BA.debugLine="DBUtils.InsertMaps(Starter.LocalSQLEVC, \"dta_requ";
parent.mostCurrent._dbutils._insertmaps /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_requests_entities",_listofmaps);
RDebugUtils.currentLine=155779143;
 //BA.debugLineNum = 155779143;BA.debugLine="For nn=0 To strSelCheckListList.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step64 = 1;
limit64 = (int) (_strselchecklistlist.getSize()-1);
_nn = (int) (0) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 4;
if ((step64 > 0 && _nn <= limit64) || (step64 < 0 && _nn >= limit64)) this.state = 3;
if (true) break;

case 18:
//C
this.state = 17;
_nn = ((int)(0 + _nn + step64)) ;
if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=155779144;
 //BA.debugLineNum = 155779144;BA.debugLine="Dim strSelCheckList As String = strSelCheckListL";
_strselchecklist = BA.ObjectToString(_strselchecklistlist.Get(_nn));
RDebugUtils.currentLine=155779145;
 //BA.debugLineNum = 155779145;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCount";
_repeatcounter = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strselchecklist))+"'"));
RDebugUtils.currentLine=155779146;
 //BA.debugLineNum = 155779146;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations","id","")+1);
RDebugUtils.currentLine=155779148;
 //BA.debugLineNum = 155779148;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155779149;
 //BA.debugLineNum = 155779149;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=155779150;
 //BA.debugLineNum = 155779150;BA.debugLine="newExecution.Put(\"id\", maxID)";
_newexecution.Put((Object)("id"),(Object)(_maxid));
RDebugUtils.currentLine=155779151;
 //BA.debugLineNum = 155779151;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=155779152;
 //BA.debugLineNum = 155779152;BA.debugLine="newExecution.Put(\"relation_tagcode\", strSelCheck";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_strselchecklist));
RDebugUtils.currentLine=155779153;
 //BA.debugLineNum = 155779153;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=155779154;
 //BA.debugLineNum = 155779154;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=155779155;
 //BA.debugLineNum = 155779155;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=155779156;
 //BA.debugLineNum = 155779156;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=155779157;
 //BA.debugLineNum = 155779157;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=155779158;
 //BA.debugLineNum = 155779158;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=155779159;
 //BA.debugLineNum = 155779159;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=155779160;
 //BA.debugLineNum = 155779160;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
_newexecution.Put((Object)("object_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155779161;
 //BA.debugLineNum = 155779161;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=155779162;
 //BA.debugLineNum = 155779162;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=155779163;
 //BA.debugLineNum = 155779163;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=155779164;
 //BA.debugLineNum = 155779164;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounter)";
_newexecution.Put((Object)("repeatcounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=155779165;
 //BA.debugLineNum = 155779165;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=155779166;
 //BA.debugLineNum = 155779166;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155779167;
 //BA.debugLineNum = 155779167;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155779168;
 //BA.debugLineNum = 155779168;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=155779169;
 //BA.debugLineNum = 155779169;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=155779171;
 //BA.debugLineNum = 155779171;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0,";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=155779173;
 //BA.debugLineNum = 155779173;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1);
RDebugUtils.currentLine=155779174;
 //BA.debugLineNum = 155779174;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"					tagcode,position,execute_value,confirmed,changed_value, repeatcounter)\n"+"					select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+" as id, x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"					x.execute_value, x.confirmed, x.changed_value, x.repeatcounter\n"+"					from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, \n"+"					a.relation_tagcode As task_tagcode, \n"+"					c.item_tagcode, c.unique_key, d.tagcode As tagcode, \n"+"					ifnull(d.position, c.position) As position, '' as execute_value, 0 as confirmed, '' as changed_value, a.repeatcounter\n"+"					from dta_requests_relations As a\n"+"					inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"+"					inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)\n"+"					left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)\n"+"					where a.type_relation=0 And a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strselchecklist))+"' and a.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"					) As x\n"+"					order by  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=155779190;
 //BA.debugLineNum = 155779190;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6155779190",_ssql,0);
RDebugUtils.currentLine=155779192;
 //BA.debugLineNum = 155779192;BA.debugLine="Utils.SaveSQLToLog(\"CriaDtaRequestValues\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CriaDtaRequestValues",_ssql,_newrequest);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=155779196;
 //BA.debugLineNum = 155779196;BA.debugLine="Dim resfields As ResumableSub = createRequestFiel";
_resfields = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resfields = _createrequestfields(_newrequest,_newrequesttype);
RDebugUtils.currentLine=155779197;
 //BA.debugLineNum = 155779197;BA.debugLine="Wait For(resfields) Complete (resfieldsOk As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects2"), _resfields);
this.state = 19;
return;
case 19:
//C
this.state = 5;
_resfieldsok = (Boolean) result[0];
;
RDebugUtils.currentLine=155779199;
 //BA.debugLineNum = 155779199;BA.debugLine="Dim resa1 As ResumableSub = createRequestEntityRe";
_resa1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa1 = _createrequestentityrelation(_newrequest,_strselobject);
RDebugUtils.currentLine=155779200;
 //BA.debugLineNum = 155779200;BA.debugLine="Wait For(resa1) Complete (resfieldsOk1 As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects2"), _resa1);
this.state = 20;
return;
case 20:
//C
this.state = 5;
_resfieldsok1 = (Boolean) result[0];
;
RDebugUtils.currentLine=155779202;
 //BA.debugLineNum = 155779202;BA.debugLine="Dim resa2 As ResumableSub = createRequestObjectRe";
_resa2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa2 = _createrequestobjectrelation(_newrequest,_strselobject);
RDebugUtils.currentLine=155779203;
 //BA.debugLineNum = 155779203;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects2"), _resa2);
this.state = 21;
return;
case 21:
//C
this.state = 5;
_resfieldsok2 = (Boolean) result[0];
;
RDebugUtils.currentLine=155779214;
 //BA.debugLineNum = 155779214;BA.debugLine="Dim res As ResumableSub = UploadNewRequest2Server";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _uploadnewrequest2server2(_newrequest,_newrequestitem,"0",_newrequesttype);
RDebugUtils.currentLine=155779215;
 //BA.debugLineNum = 155779215;BA.debugLine="Wait For(res) Complete (NewRequestCode As String)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects2"), _res);
this.state = 22;
return;
case 22:
//C
this.state = 5;
_newrequestcode = (String) result[0];
;
RDebugUtils.currentLine=155779216;
 //BA.debugLineNum = 155779216;BA.debugLine="If(Utils.NNE(NewRequestCode)) Then";
if (true) break;

case 5:
//if
this.state = 12;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_newrequestcode))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=155779217;
 //BA.debugLineNum = 155779217;BA.debugLine="If Not(newRequest = NewRequestCode) Then";
if (true) break;

case 8:
//if
this.state = 11;
if (anywheresoftware.b4a.keywords.Common.Not((_newrequest).equals(_newrequestcode))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=155779218;
 //BA.debugLineNum = 155779218;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
_ssql = ("update dta_requests set tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779219;
 //BA.debugLineNum = 155779219;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779220;
 //BA.debugLineNum = 155779220;BA.debugLine="Dim sSQL As String = $\"update dta_requests_adds";
_ssql = ("update dta_requests_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779221;
 //BA.debugLineNum = 155779221;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779223;
 //BA.debugLineNum = 155779223;BA.debugLine="Dim sSQL As String = $\"update dta_requests_enti";
_ssql = ("update dta_requests_entities set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779224;
 //BA.debugLineNum = 155779224;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779226;
 //BA.debugLineNum = 155779226;BA.debugLine="Dim sSQL As String = $\"update dta_requests_obje";
_ssql = ("update dta_requests_objects set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779227;
 //BA.debugLineNum = 155779227;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779229;
 //BA.debugLineNum = 155779229;BA.debugLine="Dim sSQL As String = $\"update dta_requests_cont";
_ssql = ("update dta_requests_contacts set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779230;
 //BA.debugLineNum = 155779230;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779232;
 //BA.debugLineNum = 155779232;BA.debugLine="Dim sSQL As String = $\"update dta_requests_fiel";
_ssql = ("update dta_requests_fields set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779233;
 //BA.debugLineNum = 155779233;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779235;
 //BA.debugLineNum = 155779235;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
_ssql = ("update dta_requests_relations set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779236;
 //BA.debugLineNum = 155779236;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779237;
 //BA.debugLineNum = 155779237;BA.debugLine="Dim sSQL As String = $\"update dta_requests_rela";
_ssql = ("update dta_requests_relations_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779238;
 //BA.debugLineNum = 155779238;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779240;
 //BA.debugLineNum = 155779240;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779241;
 //BA.debugLineNum = 155779241;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779242;
 //BA.debugLineNum = 155779242;BA.debugLine="Dim sSQL As String = $\"update dta_requests_valu";
_ssql = ("update dta_requests_values_adds set request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequestcode))+"' where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"';");
RDebugUtils.currentLine=155779243;
 //BA.debugLineNum = 155779243;BA.debugLine="Utils.SaveSQLToLog(\"getTaskDetailsDialogChange\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"getTaskDetailsDialogChange",_ssql,_newrequestcode);
RDebugUtils.currentLine=155779244;
 //BA.debugLineNum = 155779244;BA.debugLine="newRequest = NewRequestCode";
_newrequest = _newrequestcode;
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=155779248;
 //BA.debugLineNum = 155779248;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects2"),(int) (1000));
this.state = 23;
return;
case 23:
//C
this.state = 13;
;
RDebugUtils.currentLine=155779249;
 //BA.debugLineNum = 155779249;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=155779251;
 //BA.debugLineNum = 155779251;BA.debugLine="If (RunCL) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_runcl)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=155779252;
 //BA.debugLineNum = 155779252;BA.debugLine="RunThisChecklist(newRequest)";
_runthischecklist(_newrequest);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=155779255;
 //BA.debugLineNum = 155779255;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _butcreaterequestcancel_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcreaterequestcancel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcreaterequestcancel_click", null));}
RDebugUtils.currentLine=155582464;
 //BA.debugLineNum = 155582464;BA.debugLine="Sub butCreateRequestCancel_Click";
RDebugUtils.currentLine=155582465;
 //BA.debugLineNum = 155582465;BA.debugLine="noRequestPanel.Visible = False";
mostCurrent._norequestpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=155582466;
 //BA.debugLineNum = 155582466;BA.debugLine="CLARequestTypeSpinner.SelectedIndex = 0";
mostCurrent._clarequesttypespinner.setSelectedIndex((int) (0));
RDebugUtils.currentLine=155582467;
 //BA.debugLineNum = 155582467;BA.debugLine="CLARequestList.Clear";
mostCurrent._clarequestlist._clear();
RDebugUtils.currentLine=155582468;
 //BA.debugLineNum = 155582468;BA.debugLine="SelCheckList = \"\"";
mostCurrent._selchecklist = "";
RDebugUtils.currentLine=155582469;
 //BA.debugLineNum = 155582469;BA.debugLine="SelObject = \"\"";
mostCurrent._selobject = "";
RDebugUtils.currentLine=155582470;
 //BA.debugLineNum = 155582470;BA.debugLine="FromBulkOption = 0";
_frombulkoption = (int) (0);
RDebugUtils.currentLine=155582471;
 //BA.debugLineNum = 155582471;BA.debugLine="UpdateExtraButtons";
_updateextrabuttons();
RDebugUtils.currentLine=155582472;
 //BA.debugLineNum = 155582472;BA.debugLine="End Sub";
return "";
}
public static String  _butsearch_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsearch_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butsearch_click", null));}
RDebugUtils.currentLine=153550848;
 //BA.debugLineNum = 153550848;BA.debugLine="Sub butSearch_Click";
RDebugUtils.currentLine=153550849;
 //BA.debugLineNum = 153550849;BA.debugLine="MakeListSearch(EditSearch.Text)";
_makelistsearch(mostCurrent._editsearch.getText());
RDebugUtils.currentLine=153550850;
 //BA.debugLineNum = 153550850;BA.debugLine="End Sub";
return "";
}
public static String  _makelistsearch(String _search) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makelistsearch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makelistsearch", new Object[] {_search}));}
String _filter = "";
RDebugUtils.currentLine=153616384;
 //BA.debugLineNum = 153616384;BA.debugLine="Sub MakeListSearch(search As String)";
RDebugUtils.currentLine=153616386;
 //BA.debugLineNum = 153616386;BA.debugLine="Dim Filter As String = $\"b.title||a.tagcode||a.ti";
_filter = ("b.title||a.tagcode||a.title_import||c.address||c.postalcode||c.local||ifnull(d.title_import,'')||ifnull(a.reference,'')||ifnull(d.reference,'') like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%'");
RDebugUtils.currentLine=153616388;
 //BA.debugLineNum = 153616388;BA.debugLine="SearchFilter = Filter";
mostCurrent._searchfilter = _filter;
RDebugUtils.currentLine=153616389;
 //BA.debugLineNum = 153616389;BA.debugLine="IsFiltered = (Filter <> \"\")";
_isfiltered = ((_filter).equals("") == false);
RDebugUtils.currentLine=153616390;
 //BA.debugLineNum = 153616390;BA.debugLine="StartObjectsActivity(True, Filter)";
_startobjectsactivity(anywheresoftware.b4a.keywords.Common.True,_filter);
RDebugUtils.currentLine=153616391;
 //BA.debugLineNum = 153616391;BA.debugLine="End Sub";
return "";
}
public static String  _buttonactionpause_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonactionpause_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonactionpause_click", null));}
int _i = 0;
RDebugUtils.currentLine=154075136;
 //BA.debugLineNum = 154075136;BA.debugLine="Sub ButtonActionPause_Click";
RDebugUtils.currentLine=154075137;
 //BA.debugLineNum = 154075137;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
if ((mostCurrent._sharecode._sess_in_pause /*int*/ ==1)) { 
RDebugUtils.currentLine=154075139;
 //BA.debugLineNum = 154075139;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.AvisoPararPausa";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._avisopararpausa /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=154075140;
 //BA.debugLineNum = 154075140;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=154075141;
 //BA.debugLineNum = 154075141;BA.debugLine="ShareCode.SESS_IN_PAUSE = 0";
mostCurrent._sharecode._sess_in_pause /*int*/  = (int) (0);
RDebugUtils.currentLine=154075142;
 //BA.debugLineNum = 154075142;BA.debugLine="Starter.AppState.WriteInteger(\"APP_START\", \"SES";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._writeinteger /*boolean*/ (null,"APP_START","SESS_IN_PAUSE",mostCurrent._sharecode._sess_in_pause /*int*/ );
RDebugUtils.currentLine=154075143;
 //BA.debugLineNum = 154075143;BA.debugLine="Starter.AppState.Flush";
mostCurrent._starter._appstate /*xevolution.vrcg.devdemov2400.tinifile*/ ._flush /*String*/ (null);
 };
 };
RDebugUtils.currentLine=154075146;
 //BA.debugLineNum = 154075146;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=154075147;
 //BA.debugLineNum = 154075147;BA.debugLine="End Sub";
return "";
}
public static void  _windowstatusupdate() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "windowstatusupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "windowstatusupdate", null); return;}
ResumableSub_WindowStatusUpdate rsub = new ResumableSub_WindowStatusUpdate(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_WindowStatusUpdate extends BA.ResumableSub {
public ResumableSub_WindowStatusUpdate(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=153419777;
 //BA.debugLineNum = 153419777;BA.debugLine="If Utils.NE(ShareCode.SESS_OPER_UserName) Then";
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
RDebugUtils.currentLine=153419778;
 //BA.debugLineNum = 153419778;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=153419779;
 //BA.debugLineNum = 153419779;BA.debugLine="StopService(Comms)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._comms.getObject()));
RDebugUtils.currentLine=153419780;
 //BA.debugLineNum = 153419780;BA.debugLine="StopService(UserService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._userservice.getObject()));
RDebugUtils.currentLine=153419781;
 //BA.debugLineNum = 153419781;BA.debugLine="StopService(Logs)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._logs.getObject()));
RDebugUtils.currentLine=153419782;
 //BA.debugLineNum = 153419782;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
RDebugUtils.currentLine=153419783;
 //BA.debugLineNum = 153419783;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "windowstatusupdate"),(int) (500));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=153419784;
 //BA.debugLineNum = 153419784;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=153419786;
 //BA.debugLineNum = 153419786;BA.debugLine="LabelVersion.Text = ShareCode.APP_VersionNocodeNa";
parent.mostCurrent._labelversion.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_versionnocodename /*String*/ ));
RDebugUtils.currentLine=153419787;
 //BA.debugLineNum = 153419787;BA.debugLine="LabelCopyright.Text = ShareCode.APP_EntityBrand";
parent.mostCurrent._labelcopyright.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._app_entitybrand /*String*/ ));
RDebugUtils.currentLine=153419788;
 //BA.debugLineNum = 153419788;BA.debugLine="mainActiveUser.Text = ShareCode.SESS_OPER_UserNam";
parent.mostCurrent._mainactiveuser.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._sess_oper_username /*String*/ ));
RDebugUtils.currentLine=153419790;
 //BA.debugLineNum = 153419790;BA.debugLine="ButtonAppNetwork.Enabled = False";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=153419791;
 //BA.debugLineNum = 153419791;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorLightSil";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=153419792;
 //BA.debugLineNum = 153419792;BA.debugLine="If (ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=153419793;
 //BA.debugLineNum = 153419793;BA.debugLine="ButtonAppNetwork.Enabled = True";
parent.mostCurrent._buttonappnetwork.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=153419794;
 //BA.debugLineNum = 153419794;BA.debugLine="ButtonAppNetwork.TextColor = Consts.ColorRedOran";
parent.mostCurrent._buttonappnetwork.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=153419797;
 //BA.debugLineNum = 153419797;BA.debugLine="ButtonUserUnavailable.Enabled = False";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=153419798;
 //BA.debugLineNum = 153419798;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorLig";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=153419799;
 //BA.debugLineNum = 153419799;BA.debugLine="If (ShareCode.USR_STATE = 0) Then";
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
RDebugUtils.currentLine=153419800;
 //BA.debugLineNum = 153419800;BA.debugLine="ButtonUserUnavailable.Enabled = True";
parent.mostCurrent._buttonuserunavailable.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=153419801;
 //BA.debugLineNum = 153419801;BA.debugLine="ButtonUserUnavailable.TextColor = Consts.ColorRe";
parent.mostCurrent._buttonuserunavailable.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=153419804;
 //BA.debugLineNum = 153419804;BA.debugLine="ButtonActionPause.Enabled = False";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=153419805;
 //BA.debugLineNum = 153419805;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorLightSi";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorlightsilver /*int*/ );
RDebugUtils.currentLine=153419807;
 //BA.debugLineNum = 153419807;BA.debugLine="If (ShareCode.SESS_IN_PAUSE = 1) Then";
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
RDebugUtils.currentLine=153419808;
 //BA.debugLineNum = 153419808;BA.debugLine="ButtonActionPause.Enabled = True";
parent.mostCurrent._buttonactionpause.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=153419809;
 //BA.debugLineNum = 153419809;BA.debugLine="ButtonActionPause.TextColor = Consts.ColorRedOra";
parent.mostCurrent._buttonactionpause.setTextColor(parent.mostCurrent._consts._colorredorange /*int*/ );
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=153419811;
 //BA.debugLineNum = 153419811;BA.debugLine="listsLabelInfo.Text = $\"${CurrentLineItem} / ${To";
parent.mostCurrent._listslabelinfo.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._currentlineitem))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._totallineitems))+"")));
RDebugUtils.currentLine=153419812;
 //BA.debugLineNum = 153419812;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=153419813;
 //BA.debugLineNum = 153419813;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonuserunavailable_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonuserunavailable_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonuserunavailable_click", null));}
int _i = 0;
xevolution.vrcg.devdemov2400.appdialogs _cli = null;
RDebugUtils.currentLine=153354240;
 //BA.debugLineNum = 153354240;BA.debugLine="Sub ButtonUserUnavailable_Click";
RDebugUtils.currentLine=153354241;
 //BA.debugLineNum = 153354241;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=153354242;
 //BA.debugLineNum = 153354242;BA.debugLine="i = Msgbox2(ShareCode.UserGoAvailableMessage, Sha";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._usergoavailablemessage /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_no /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=153354243;
 //BA.debugLineNum = 153354243;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=153354244;
 //BA.debugLineNum = 153354244;BA.debugLine="Dim cli As AppDialogs";
_cli = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=153354245;
 //BA.debugLineNum = 153354245;BA.debugLine="cli.Initialize";
_cli._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=153354246;
 //BA.debugLineNum = 153354246;BA.debugLine="cli.MakeUserAvailable(\"Objects\")";
_cli._makeuseravailable /*void*/ (null,(Object)("Objects"));
 };
RDebugUtils.currentLine=153354248;
 //BA.debugLineNum = 153354248;BA.debugLine="End Sub";
return "";
}
public static String  _calendargetenddate_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calendargetenddate_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calendargetenddate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=157810688;
 //BA.debugLineNum = 157810688;BA.debugLine="Sub CalendarGetEndDate_onDateSet(year As Int, mont";
RDebugUtils.currentLine=157810689;
 //BA.debugLineNum = 157810689;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=157810690;
 //BA.debugLineNum = 157810690;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=157810691;
 //BA.debugLineNum = 157810691;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=157810692;
 //BA.debugLineNum = 157810692;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=157810693;
 //BA.debugLineNum = 157810693;BA.debugLine="DialogReqEndDateLabel.Text = $\"${year}-${moy}-${d";
mostCurrent._dialogreqenddatelabel.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_year))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_moy))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=157810695;
 //BA.debugLineNum = 157810695;BA.debugLine="CumulativeDateIn = DialogReqStartDateLabel.Text";
mostCurrent._cumulativedatein = mostCurrent._dialogreqstartdatelabel.getText();
RDebugUtils.currentLine=157810696;
 //BA.debugLineNum = 157810696;BA.debugLine="CumulativeDateOut = DialogReqEndDateLabel.Text";
mostCurrent._cumulativedateout = mostCurrent._dialogreqenddatelabel.getText();
RDebugUtils.currentLine=157810697;
 //BA.debugLineNum = 157810697;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
_makeprerequesttasklist(_cumulativetyperequest,_cumulativedistrict,_cumulativecounty,mostCurrent._cumulativedatein,mostCurrent._cumulativedateout,mostCurrent._cumulativefilter);
RDebugUtils.currentLine=157810698;
 //BA.debugLineNum = 157810698;BA.debugLine="End Sub";
return "";
}
public static String  _makeprerequesttasklist(int _index,int _district,int _county,String _datein,String _dateout,String _filter) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeprerequesttasklist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makeprerequesttasklist", new Object[] {_index,_district,_county,_datein,_dateout,_filter}));}
RDebugUtils.currentLine=154402816;
 //BA.debugLineNum = 154402816;BA.debugLine="Sub MakePreRequestTaskList(Index As Int, district";
RDebugUtils.currentLine=154402868;
 //BA.debugLineNum = 154402868;BA.debugLine="End Sub";
return "";
}
public static String  _calendargetstartdate_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "calendargetstartdate_ondateset", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "calendargetstartdate_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
String _moy = "";
String _dom = "";
RDebugUtils.currentLine=157745152;
 //BA.debugLineNum = 157745152;BA.debugLine="Sub CalendarGetStartDate_onDateSet(year As Int, mo";
RDebugUtils.currentLine=157745153;
 //BA.debugLineNum = 157745153;BA.debugLine="Dim moy As String = monthOfYear+1";
_moy = BA.NumberToString(_monthofyear+1);
RDebugUtils.currentLine=157745154;
 //BA.debugLineNum = 157745154;BA.debugLine="If (moy.Length = 1) Then moy = \"0\" & moy";
if ((_moy.length()==1)) { 
_moy = "0"+_moy;};
RDebugUtils.currentLine=157745155;
 //BA.debugLineNum = 157745155;BA.debugLine="Dim dom As String = dayOfMonth";
_dom = BA.NumberToString(_dayofmonth);
RDebugUtils.currentLine=157745156;
 //BA.debugLineNum = 157745156;BA.debugLine="If (dom.Length = 1) Then dom = \"0\" & dom";
if ((_dom.length()==1)) { 
_dom = "0"+_dom;};
RDebugUtils.currentLine=157745157;
 //BA.debugLineNum = 157745157;BA.debugLine="DialogReqStartDateLabel.Text = $\"${year}-${moy}-$";
mostCurrent._dialogreqstartdatelabel.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_year))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_moy))+"-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_dom))+"")));
RDebugUtils.currentLine=157745159;
 //BA.debugLineNum = 157745159;BA.debugLine="CumulativeDateIn = DialogReqStartDateLabel.Text";
mostCurrent._cumulativedatein = mostCurrent._dialogreqstartdatelabel.getText();
RDebugUtils.currentLine=157745160;
 //BA.debugLineNum = 157745160;BA.debugLine="CumulativeDateOut = DialogReqEndDateLabel.Text";
mostCurrent._cumulativedateout = mostCurrent._dialogreqenddatelabel.getText();
RDebugUtils.currentLine=157745161;
 //BA.debugLineNum = 157745161;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
_makeprerequesttasklist(_cumulativetyperequest,_cumulativedistrict,_cumulativecounty,mostCurrent._cumulativedatein,mostCurrent._cumulativedateout,mostCurrent._cumulativefilter);
RDebugUtils.currentLine=157745162;
 //BA.debugLineNum = 157745162;BA.debugLine="End Sub";
return "";
}
public static String  _updateglobalobjectfilter() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateglobalobjectfilter", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateglobalobjectfilter", null));}
RDebugUtils.currentLine=151257088;
 //BA.debugLineNum = 151257088;BA.debugLine="Sub UpdateGlobalObjectFilter";
RDebugUtils.currentLine=151257089;
 //BA.debugLineNum = 151257089;BA.debugLine="Starter.ObjectFilter.TypeObject = iDialogReqTypeO";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .TypeObject /*int*/  = _idialogreqtypeobject;
RDebugUtils.currentLine=151257090;
 //BA.debugLineNum = 151257090;BA.debugLine="Starter.ObjectFilter.ZoneObject = iDialogReqZone";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .ZoneObject /*int*/  = _idialogreqzone;
RDebugUtils.currentLine=151257091;
 //BA.debugLineNum = 151257091;BA.debugLine="Starter.ObjectFilter.Status = iDialogReqStatus";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .Status /*int*/  = _idialogreqstatus;
RDebugUtils.currentLine=151257092;
 //BA.debugLineNum = 151257092;BA.debugLine="Starter.ObjectFilter.Name = sDialogReqName";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .Name /*String*/  = mostCurrent._sdialogreqname;
RDebugUtils.currentLine=151257093;
 //BA.debugLineNum = 151257093;BA.debugLine="Starter.ObjectFilter.Region = iDialogReqRegion";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .Region /*int*/  = _idialogreqregion;
RDebugUtils.currentLine=151257094;
 //BA.debugLineNum = 151257094;BA.debugLine="Starter.ObjectFilter.Local = iDialogReqLocal";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .Local /*int*/  = _idialogreqlocal;
RDebugUtils.currentLine=151257095;
 //BA.debugLineNum = 151257095;BA.debugLine="Starter.ObjectFilter.Address = sDialogReqAddress";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .Address /*String*/  = mostCurrent._sdialogreqaddress;
RDebugUtils.currentLine=151257096;
 //BA.debugLineNum = 151257096;BA.debugLine="Starter.ObjectFilter.Request = iDialogReqWithRequ";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .Request /*int*/  = _idialogreqwithrequests;
RDebugUtils.currentLine=151257097;
 //BA.debugLineNum = 151257097;BA.debugLine="End Sub";
return "";
}
public static String  _changemyposition() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "changemyposition", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "changemyposition", null));}
RDebugUtils.currentLine=151912448;
 //BA.debugLineNum = 151912448;BA.debugLine="Public Sub ChangeMyPosition";
RDebugUtils.currentLine=151912451;
 //BA.debugLineNum = 151912451;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkdattoupdateinchecklist(String _request_type,String _tagcode,String _actionkey,int _repeatcounter) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkdattoupdateinchecklist", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "checkdattoupdateinchecklist", new Object[] {_request_type,_tagcode,_actionkey,_repeatcounter}));}
ResumableSub_CheckDatToUpdateInChecklist rsub = new ResumableSub_CheckDatToUpdateInChecklist(null,_request_type,_tagcode,_actionkey,_repeatcounter);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckDatToUpdateInChecklist extends BA.ResumableSub {
public ResumableSub_CheckDatToUpdateInChecklist(xevolution.vrcg.devdemov2400.objects parent,String _request_type,String _tagcode,String _actionkey,int _repeatcounter) {
this.parent = parent;
this._request_type = _request_type;
this._tagcode = _tagcode;
this._actionkey = _actionkey;
this._repeatcounter = _repeatcounter;
}
xevolution.vrcg.devdemov2400.objects parent;
String _request_type;
String _tagcode;
String _actionkey;
int _repeatcounter;
anywheresoftware.b4a.objects.collections.Map _questparams = null;
int _upload_data = 0;
anywheresoftware.b4a.objects.collections.Map _up_settings = null;
int _upload_data_start = 0;
anywheresoftware.b4a.objects.collections.Map _ud_settings_start = null;
String _data_tagcode = "";
String _data_group = "";
String _data_subgroup = "";
String _data_origin = "";
anywheresoftware.b4a.objects.collections.List _chapters = null;
anywheresoftware.b4a.objects.collections.Map _colchapters = null;
String _chapter_in = "";
String _chapter_out = "";
int _chapter_repeat = 0;
String _sqlrepeateditems = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _repeateditems = null;
int _reqrows = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _rpos = 0;
int _maxid = 0;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _upcolitems = null;
String _val_field_in = "";
String _val_field_out = "";
String _item_tagcode_in = "";
String _item_tagcode_out = "";
int _set_object_field = 0;
int _set_title_field = 0;
int _set_subobject_field = 0;
int _set_status = 0;
String _colsin = "";
String _r110sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _r110 = null;
int _rr1 = 0;
String _colsout = "";
String _updsqlrec = "";
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
int step32;
int limit32;
int step41;
int limit41;
anywheresoftware.b4a.BA.IterableList group43;
int index43;
int groupLen43;
int step68;
int limit68;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156172289;
 //BA.debugLineNum = 156172289;BA.debugLine="Dim QuestParams As Map = DBStructures.GetScriptCo";
_questparams = new anywheresoftware.b4a.objects.collections.Map();
_questparams = parent.mostCurrent._dbstructures._getscriptcolumnstrevcjsonmap /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,("select distinct paramters \n"+"												from dta_typerequests_tasks_adds where 1=1\n"+"												And typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type.trim()))+"'\n"+"												And task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey.trim()))+"'"),"paramters");
RDebugUtils.currentLine=156172295;
 //BA.debugLineNum = 156172295;BA.debugLine="Try";
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
RDebugUtils.currentLine=156172296;
 //BA.debugLineNum = 156172296;BA.debugLine="Dim upload_data As Int = QuestParams.Get(\"upload";
_upload_data = (int)(BA.ObjectToNumber(_questparams.Get((Object)("upload_data"))));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=156172298;
 //BA.debugLineNum = 156172298;BA.debugLine="Dim upload_data As Int = 0";
_upload_data = (int) (0);
RDebugUtils.currentLine=156172299;
 //BA.debugLineNum = 156172299;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156172299",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=156172300;
 //BA.debugLineNum = 156172300;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=156172303;
 //BA.debugLineNum = 156172303;BA.debugLine="If Utils.Int2Bool(upload_data) Then";

case 6:
//if
this.state = 83;
this.catchState = 0;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_upload_data)) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=156172305;
 //BA.debugLineNum = 156172305;BA.debugLine="Dim up_settings As Map = QuestParams.Get(\"up_set";
_up_settings = new anywheresoftware.b4a.objects.collections.Map();
_up_settings = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_questparams.Get((Object)("up_settings"))));
RDebugUtils.currentLine=156172306;
 //BA.debugLineNum = 156172306;BA.debugLine="Dim upload_data_start As Int = up_settings.Get(\"";
_upload_data_start = (int)(BA.ObjectToNumber(_up_settings.Get((Object)("upload_data_start"))));
RDebugUtils.currentLine=156172308;
 //BA.debugLineNum = 156172308;BA.debugLine="If Utils.Int2Bool(upload_data_start) Then";
if (true) break;

case 9:
//if
this.state = 82;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_upload_data_start)) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=156172309;
 //BA.debugLineNum = 156172309;BA.debugLine="Dim ud_settings_start As Map = up_settings.Get(";
_ud_settings_start = new anywheresoftware.b4a.objects.collections.Map();
_ud_settings_start = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_up_settings.Get((Object)("ud_settings_start"))));
RDebugUtils.currentLine=156172310;
 //BA.debugLineNum = 156172310;BA.debugLine="Dim data_tagcode As String = ud_settings_start.";
_data_tagcode = BA.ObjectToString(_ud_settings_start.Get((Object)("data_tagcode")));
RDebugUtils.currentLine=156172311;
 //BA.debugLineNum = 156172311;BA.debugLine="Dim data_group As String = ud_settings_start.Ge";
_data_group = BA.ObjectToString(_ud_settings_start.Get((Object)("data_group")));
RDebugUtils.currentLine=156172312;
 //BA.debugLineNum = 156172312;BA.debugLine="Dim data_subgroup As String = ud_settings_start";
_data_subgroup = BA.ObjectToString(_ud_settings_start.Get((Object)("data_subgroup")));
RDebugUtils.currentLine=156172313;
 //BA.debugLineNum = 156172313;BA.debugLine="Dim data_origin As String = ud_settings_start.G";
_data_origin = BA.ObjectToString(_ud_settings_start.Get((Object)("data_origin")));
RDebugUtils.currentLine=156172315;
 //BA.debugLineNum = 156172315;BA.debugLine="If (data_origin.ToUpperCase = \"TINOUT_CHECKLIST";
if (true) break;

case 12:
//if
this.state = 81;
if (((_data_origin.toUpperCase()).equals("TINOUT_CHECKLISTS"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=156172316;
 //BA.debugLineNum = 156172316;BA.debugLine="Dim chapters As List = ud_settings_start.Get(\"";
_chapters = new anywheresoftware.b4a.objects.collections.List();
_chapters = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ud_settings_start.Get((Object)("chapters"))));
RDebugUtils.currentLine=156172317;
 //BA.debugLineNum = 156172317;BA.debugLine="For Each colchapters As Map In chapters";
if (true) break;

case 15:
//for
this.state = 80;
_colchapters = new anywheresoftware.b4a.objects.collections.Map();
group20 = _chapters;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 84;
if (true) break;

case 84:
//C
this.state = 80;
if (index20 < groupLen20) {
this.state = 17;
_colchapters = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group20.Get(index20)));}
if (true) break;

case 85:
//C
this.state = 84;
index20++;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=156172319;
 //BA.debugLineNum = 156172319;BA.debugLine="Dim chapter_in As String = colchapters.Get(\"c";
_chapter_in = BA.ObjectToString(_colchapters.Get((Object)("chapter_in")));
RDebugUtils.currentLine=156172320;
 //BA.debugLineNum = 156172320;BA.debugLine="Dim chapter_out As String = colchapters.Get(\"";
_chapter_out = BA.ObjectToString(_colchapters.Get((Object)("chapter_out")));
RDebugUtils.currentLine=156172321;
 //BA.debugLineNum = 156172321;BA.debugLine="Dim chapter_repeat As Int = colchapters.Get(\"";
_chapter_repeat = (int)(BA.ObjectToNumber(_colchapters.Get((Object)("chapter_repeat"))));
RDebugUtils.currentLine=156172326;
 //BA.debugLineNum = 156172326;BA.debugLine="Dim SQLRepeatedItems As String = $\"select dis";
_sqlrepeateditems = ("select distinct repeatitemcounter from dta_requests_values\n"+"																		where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"' \n"+"																		and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_data_tagcode))+"' \n"+"																		And item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chapter_in))+"'");
RDebugUtils.currentLine=156172330;
 //BA.debugLineNum = 156172330;BA.debugLine="Dim RepeatedItems As Cursor = Starter.LocalSQ";
_repeateditems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_repeateditems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlrepeateditems)));
RDebugUtils.currentLine=156172331;
 //BA.debugLineNum = 156172331;BA.debugLine="Dim ReqRows As Int = RepeatedItems.RowCount";
_reqrows = _repeateditems.getRowCount();
RDebugUtils.currentLine=156172332;
 //BA.debugLineNum = 156172332;BA.debugLine="If (ReqRows >= 1) Then";
if (true) break;

case 18:
//if
this.state = 79;
if ((_reqrows>=1)) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=156172334;
 //BA.debugLineNum = 156172334;BA.debugLine="Dim items As List = colchapters.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colchapters.Get((Object)("items"))));
RDebugUtils.currentLine=156172335;
 //BA.debugLineNum = 156172335;BA.debugLine="If Not(Utils.Int2Bool(chapter_repeat)) Then";
if (true) break;

case 21:
//if
this.state = 24;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_chapter_repeat))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=156172336;
 //BA.debugLineNum = 156172336;BA.debugLine="ReqRows = 1";
_reqrows = (int) (1);
 if (true) break;
;
RDebugUtils.currentLine=156172339;
 //BA.debugLineNum = 156172339;BA.debugLine="For rpos=0 To ReqRows-1";

case 24:
//for
this.state = 31;
step32 = 1;
limit32 = (int) (_reqrows-1);
_rpos = (int) (0) ;
this.state = 86;
if (true) break;

case 86:
//C
this.state = 31;
if ((step32 > 0 && _rpos <= limit32) || (step32 < 0 && _rpos >= limit32)) this.state = 26;
if (true) break;

case 87:
//C
this.state = 86;
_rpos = ((int)(0 + _rpos + step32)) ;
if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=156172340;
 //BA.debugLineNum = 156172340;BA.debugLine="RepeatedItems.Position = rpos";
_repeateditems.setPosition(_rpos);
RDebugUtils.currentLine=156172341;
 //BA.debugLineNum = 156172341;BA.debugLine="If (rpos = 0) Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((_rpos==0)) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=156172342;
 //BA.debugLineNum = 156172342;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEV";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=156172343;
 //BA.debugLineNum = 156172343;BA.debugLine="Dim sSQL As String = $\"insert into dta_req";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"																	tagcode,position,\n"+"																	execute_status, execute_value, execute_value_title, title, execute_format_title,\n"+"																	confirmed,changed_value, repeatcounter, repeatitemcounter, repeatfieldcounter,val_min, val_max)\n"+"																	select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"																	tagcode,position, 0, '', '', '', execute_format_title, confirmed,changed_value, \n"+"																	repeatcounter, "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rpos))+"  AS repeatitemcounter, \n"+"																	repeatfieldcounter,val_min, val_max\n"+"																	from dta_requests_values As a where\n"+"																	a.item_tagcode||a.unique_key in (Select item_tagcode||unique_key\n"+"																		from dta_tasks_items where (parent_tagcode in (Select unique_key from dta_tasks_items \n"+"																		where item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chapter_out.trim()))+"' and repeated=1)) or \n"+"																			(item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_chapter_out.trim()))+"' and repeated=1)) \n"+"																	And a.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+" \n"+"																	and repeatitemcounter=0\n"+"																	and a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'\n"+"																	and a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey.trim()))+"'  order by a.position");
RDebugUtils.currentLine=156172362;
 //BA.debugLineNum = 156172362;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156172362",_ssql,0);
RDebugUtils.currentLine=156172363;
 //BA.debugLineNum = 156172363;BA.debugLine="Utils.SaveSQLToLog(\"butAddMore_Click\",sSQL";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butAddMore_Click",_ssql,_tagcode);
 if (true) break;

case 30:
//C
this.state = 87;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=156172367;
 //BA.debugLineNum = 156172367;BA.debugLine="For rpos=0 To ReqRows-1";

case 31:
//for
this.state = 78;
step41 = 1;
limit41 = (int) (_reqrows-1);
_rpos = (int) (0) ;
this.state = 88;
if (true) break;

case 88:
//C
this.state = 78;
if ((step41 > 0 && _rpos <= limit41) || (step41 < 0 && _rpos >= limit41)) this.state = 33;
if (true) break;

case 89:
//C
this.state = 88;
_rpos = ((int)(0 + _rpos + step41)) ;
if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=156172368;
 //BA.debugLineNum = 156172368;BA.debugLine="RepeatedItems.Position = rpos";
_repeateditems.setPosition(_rpos);
RDebugUtils.currentLine=156172370;
 //BA.debugLineNum = 156172370;BA.debugLine="For Each upcolitems As Map In items";
if (true) break;

case 34:
//for
this.state = 77;
_upcolitems = new anywheresoftware.b4a.objects.collections.Map();
group43 = _items;
index43 = 0;
groupLen43 = group43.getSize();
this.state = 90;
if (true) break;

case 90:
//C
this.state = 77;
if (index43 < groupLen43) {
this.state = 36;
_upcolitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group43.Get(index43)));}
if (true) break;

case 91:
//C
this.state = 90;
index43++;
if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=156172371;
 //BA.debugLineNum = 156172371;BA.debugLine="Dim val_field_in As String = upcolitems.Ge";
_val_field_in = BA.ObjectToString(_upcolitems.Get((Object)("val_field_in")));
RDebugUtils.currentLine=156172372;
 //BA.debugLineNum = 156172372;BA.debugLine="Dim val_field_out As String = upcolitems.G";
_val_field_out = BA.ObjectToString(_upcolitems.Get((Object)("val_field_out")));
RDebugUtils.currentLine=156172373;
 //BA.debugLineNum = 156172373;BA.debugLine="Dim item_tagcode_in As String = upcolitems";
_item_tagcode_in = BA.ObjectToString(_upcolitems.Get((Object)("item_tagcode_in")));
RDebugUtils.currentLine=156172374;
 //BA.debugLineNum = 156172374;BA.debugLine="Dim item_tagcode_out As String = upcolitem";
_item_tagcode_out = BA.ObjectToString(_upcolitems.Get((Object)("item_tagcode_out")));
RDebugUtils.currentLine=156172376;
 //BA.debugLineNum = 156172376;BA.debugLine="Dim set_object_field As Int = upcolitems.G";
_set_object_field = (int)(BA.ObjectToNumber(_upcolitems.Get((Object)("set_object_field"))));
RDebugUtils.currentLine=156172377;
 //BA.debugLineNum = 156172377;BA.debugLine="Dim set_title_field As Int = upcolitems.Ge";
_set_title_field = (int)(BA.ObjectToNumber(_upcolitems.Get((Object)("set_title_field"))));
RDebugUtils.currentLine=156172378;
 //BA.debugLineNum = 156172378;BA.debugLine="Dim set_subobject_field As Int = upcolitem";
_set_subobject_field = (int)(BA.ObjectToNumber(_upcolitems.Get((Object)("set_subobject_field"))));
RDebugUtils.currentLine=156172379;
 //BA.debugLineNum = 156172379;BA.debugLine="Dim set_status As Int = upcolitems.Get(\"se";
_set_status = (int)(BA.ObjectToNumber(_upcolitems.Get((Object)("set_status"))));
RDebugUtils.currentLine=156172381;
 //BA.debugLineNum = 156172381;BA.debugLine="Dim colsin As String = val_field_in";
_colsin = _val_field_in;
RDebugUtils.currentLine=156172382;
 //BA.debugLineNum = 156172382;BA.debugLine="If Utils.Int2Bool(set_object_field) Then";
if (true) break;

case 37:
//if
this.state = 40;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_object_field)) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=156172383;
 //BA.debugLineNum = 156172383;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
_colsin = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsin,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsin))+", object_tagcode"))))+"");
 if (true) break;
;
RDebugUtils.currentLine=156172385;
 //BA.debugLineNum = 156172385;BA.debugLine="If Utils.Int2Bool(set_title_field) Then";

case 40:
//if
this.state = 43;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_title_field)) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=156172386;
 //BA.debugLineNum = 156172386;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
_colsin = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsin,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsin))+", title"))))+"");
 if (true) break;
;
RDebugUtils.currentLine=156172388;
 //BA.debugLineNum = 156172388;BA.debugLine="If Utils.Int2Bool(set_subobject_field) The";

case 43:
//if
this.state = 46;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_subobject_field)) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=156172389;
 //BA.debugLineNum = 156172389;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
_colsin = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsin,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsin))+", subobject_tagcode"))))+"");
 if (true) break;
;
RDebugUtils.currentLine=156172391;
 //BA.debugLineNum = 156172391;BA.debugLine="If Utils.Int2Bool(set_status) Then";

case 46:
//if
this.state = 49;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_status)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=156172392;
 //BA.debugLineNum = 156172392;BA.debugLine="colsin = $\"${Utils.IfNotNullOrEmpty(colsi";
_colsin = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsin,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsin))+", execute_status"))))+"");
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=156172395;
 //BA.debugLineNum = 156172395;BA.debugLine="Dim r110SQL As String = $\"select ${colsin}";
_r110sql = ("select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsin))+" from dta_requests_values where 1=1\n"+"																				and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'\n"+"																				and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_data_tagcode.trim()))+"'\n"+"																				and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode_in.trim()))+"'\n"+"																				And repeatcounter='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"'\n"+"																				And repeatitemcounter='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rpos))+"'");
RDebugUtils.currentLine=156172403;
 //BA.debugLineNum = 156172403;BA.debugLine="Dim r110 As Cursor = Starter.LocalSQLEVC.E";
_r110 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_r110 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_r110sql)));
RDebugUtils.currentLine=156172404;
 //BA.debugLineNum = 156172404;BA.debugLine="If (r110.RowCount >= 1) Then";
if (true) break;

case 50:
//if
this.state = 76;
if ((_r110.getRowCount()>=1)) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=156172405;
 //BA.debugLineNum = 156172405;BA.debugLine="For rr1=0 To r110.RowCount-1";
if (true) break;

case 53:
//for
this.state = 75;
step68 = 1;
limit68 = (int) (_r110.getRowCount()-1);
_rr1 = (int) (0) ;
this.state = 92;
if (true) break;

case 92:
//C
this.state = 75;
if ((step68 > 0 && _rr1 <= limit68) || (step68 < 0 && _rr1 >= limit68)) this.state = 55;
if (true) break;

case 93:
//C
this.state = 92;
_rr1 = ((int)(0 + _rr1 + step68)) ;
if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=156172406;
 //BA.debugLineNum = 156172406;BA.debugLine="r110.Position = rr1";
_r110.setPosition(_rr1);
RDebugUtils.currentLine=156172408;
 //BA.debugLineNum = 156172408;BA.debugLine="Dim colsout As String = $\"${val_field_ou";
_colsout = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_val_field_out))+"='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_r110.GetString(_val_field_in)))+"'");
RDebugUtils.currentLine=156172409;
 //BA.debugLineNum = 156172409;BA.debugLine="If Utils.Int2Bool(set_object_field) Then";
if (true) break;

case 56:
//if
this.state = 59;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_object_field)) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=156172410;
 //BA.debugLineNum = 156172410;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
_colsout = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsout,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsout))+", object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_r110.GetString("object_tagcode")))+"'"))))+"");
 if (true) break;
;
RDebugUtils.currentLine=156172412;
 //BA.debugLineNum = 156172412;BA.debugLine="If Utils.Int2Bool(set_title_field) Then";

case 59:
//if
this.state = 62;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_title_field)) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=156172413;
 //BA.debugLineNum = 156172413;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
_colsout = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsout,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsout))+", title='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_r110.GetString("title")))+"'"))))+"");
 if (true) break;
;
RDebugUtils.currentLine=156172415;
 //BA.debugLineNum = 156172415;BA.debugLine="If Utils.Int2Bool(set_subobject_field) T";

case 62:
//if
this.state = 65;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_subobject_field)) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=156172416;
 //BA.debugLineNum = 156172416;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
_colsout = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsout,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsout))+", subobject_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_r110.GetString("subobject_tagcode")))+"'"))))+"");
 if (true) break;
;
RDebugUtils.currentLine=156172418;
 //BA.debugLineNum = 156172418;BA.debugLine="If Utils.Int2Bool(set_status) Then";

case 65:
//if
this.state = 68;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_set_status)) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=156172419;
 //BA.debugLineNum = 156172419;BA.debugLine="colsout = $\"${Utils.IfNotNullOrEmpty(co";
_colsout = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._ifnotnullorempty /*String*/ (mostCurrent.activityBA,_colsout,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsout))+", execute_status='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_r110.GetString("execute_status")))+"'"))))+"");
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=156172422;
 //BA.debugLineNum = 156172422;BA.debugLine="Dim updSQLRec As String = $\"update dta_r";
_updsqlrec = ("update dta_requests_values set "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_colsout))+"\n"+"																			where 1=1\n"+"																			and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'\n"+"																			and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey.trim()))+"'\n"+"																			and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode_out.trim()))+"'\n"+"																			And repeatcounter='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"' \n"+"																			And repeatitemcounter='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_rpos))+"'");
RDebugUtils.currentLine=156172430;
 //BA.debugLineNum = 156172430;BA.debugLine="Log(updSQLRec)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156172430",_updsqlrec,0);
RDebugUtils.currentLine=156172431;
 //BA.debugLineNum = 156172431;BA.debugLine="Try";
if (true) break;

case 69:
//try
this.state = 74;
this.catchState = 73;
this.state = 71;
if (true) break;

case 71:
//C
this.state = 74;
this.catchState = 73;
RDebugUtils.currentLine=156172432;
 //BA.debugLineNum = 156172432;BA.debugLine="Utils.SaveSQLToLog(\"ListaPrincipal_Item";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"ListaPrincipal_ItemClick",_updsqlrec,_tagcode);
 if (true) break;

case 73:
//C
this.state = 74;
this.catchState = 0;
RDebugUtils.currentLine=156172434;
 //BA.debugLineNum = 156172434;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$";
anywheresoftware.b4a.keywords.Common.LogImpl("6156172434",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 74:
//C
this.state = 93;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
;
 if (true) break;

case 76:
//C
this.state = 91;
;
RDebugUtils.currentLine=156172439;
 //BA.debugLineNum = 156172439;BA.debugLine="r110.Close";
_r110.Close();
 if (true) break;
if (true) break;

case 77:
//C
this.state = 89;
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
this.state = 85;
;
RDebugUtils.currentLine=156172444;
 //BA.debugLineNum = 156172444;BA.debugLine="RepeatedItems.Close";
_repeateditems.Close();
 if (true) break;
if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = 83;
;
 if (true) break;

case 83:
//C
this.state = -1;
;
RDebugUtils.currentLine=156172453;
 //BA.debugLineNum = 156172453;BA.debugLine="Log(\"CheckDatToUpdateInChecklist\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6156172453","CheckDatToUpdateInChecklist",0);
RDebugUtils.currentLine=156172454;
 //BA.debugLineNum = 156172454;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=156172455;
 //BA.debugLineNum = 156172455;BA.debugLine="End Sub";
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
public static String  _clabuttonrequestdownload_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clabuttonrequestdownload_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clabuttonrequestdownload_click", null));}
RDebugUtils.currentLine=154730496;
 //BA.debugLineNum = 154730496;BA.debugLine="Sub CLAButtonRequestDownload_Click";
RDebugUtils.currentLine=154730498;
 //BA.debugLineNum = 154730498;BA.debugLine="GetPreReqAssign";
_getprereqassign();
RDebugUtils.currentLine=154730500;
 //BA.debugLineNum = 154730500;BA.debugLine="End Sub";
return "";
}
public static void  _getprereqassign() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getprereqassign", false))
	 {Debug.delegate(mostCurrent.activityBA, "getprereqassign", null); return;}
ResumableSub_GetPreReqAssign rsub = new ResumableSub_GetPreReqAssign(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_GetPreReqAssign extends BA.ResumableSub {
public ResumableSub_GetPreReqAssign(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;
String _requestfilenameprerequests = "";
anywheresoftware.b4a.objects.collections.List _listofrequests = null;
String _selectedoption = "";
String _msg2show = "";
int _result = 0;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
boolean _continua = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=154599426;
 //BA.debugLineNum = 154599426;BA.debugLine="Dim RequestFileNamePreRequests As String = Utils.";
_requestfilenameprerequests = parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=154599427;
 //BA.debugLineNum = 154599427;BA.debugLine="Dim ListOfRequests As List ' Lista de tagcodes se";
_listofrequests = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=154599428;
 //BA.debugLineNum = 154599428;BA.debugLine="ListOfRequests.Initialize";
_listofrequests.Initialize();
RDebugUtils.currentLine=154599429;
 //BA.debugLineNum = 154599429;BA.debugLine="Dim SelectedOption As String = \"1\" ' 0 = Do dia,";
_selectedoption = "1";
RDebugUtils.currentLine=154599430;
 //BA.debugLineNum = 154599430;BA.debugLine="Dim Msg2Show As String = $\"A opção “DO DIA” vai a";
_msg2show = ("A opção “DO DIA” vai atribuir a Si apenas os Pedidos/Necessidades com o agendamento do dia de hoje, \n"+"	sendo que TODOS serão os que estão selecionados.Poderá efetuar a sincronização para os descarregar.\n"+"	Identifique a opção pretendida.");
RDebugUtils.currentLine=154599434;
 //BA.debugLineNum = 154599434;BA.debugLine="Msgbox2Async(Msg2Show, \"Selecção de Pedidos\", \"TO";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(_msg2show),BA.ObjectToCharSequence("Selecção de Pedidos"),"TODOS","CANCELAR","DO DIA",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=154599435;
 //BA.debugLineNum = 154599435;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "getprereqassign"), null);
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=154599436;
 //BA.debugLineNum = 154599436;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=154599438;
 //BA.debugLineNum = 154599438;BA.debugLine="else if Result = DialogResponse.NEGATIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 5;
}else {
this.state = 7;
}}
if (true) break;

case 3:
//C
this.state = 8;
RDebugUtils.currentLine=154599437;
 //BA.debugLineNum = 154599437;BA.debugLine="SelectedOption = \"1\"";
_selectedoption = "1";
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=154599439;
 //BA.debugLineNum = 154599439;BA.debugLine="SelectedOption = \"0\"";
_selectedoption = "0";
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=154599441;
 //BA.debugLineNum = 154599441;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=154599444;
 //BA.debugLineNum = 154599444;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=154599447;
 //BA.debugLineNum = 154599447;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/cla/prerequest/assign");
RDebugUtils.currentLine=154599448;
 //BA.debugLineNum = 154599448;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=154599449;
 //BA.debugLineNum = 154599449;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",objects.getObject());
RDebugUtils.currentLine=154599450;
 //BA.debugLineNum = 154599450;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=154599451;
 //BA.debugLineNum = 154599451;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=154599452;
 //BA.debugLineNum = 154599452;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=154599453;
 //BA.debugLineNum = 154599453;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=154599454;
 //BA.debugLineNum = 154599454;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=154599455;
 //BA.debugLineNum = 154599455;BA.debugLine="params.Put(\"user\", ShareCode.SESS_User)";
_params.Put((Object)("user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=154599456;
 //BA.debugLineNum = 154599456;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=154599457;
 //BA.debugLineNum = 154599457;BA.debugLine="params.Put(\"name\", RequestFileNamePreRequests)";
_params.Put((Object)("name"),(Object)(_requestfilenameprerequests));
RDebugUtils.currentLine=154599458;
 //BA.debugLineNum = 154599458;BA.debugLine="params.Put(\"option\", SelectedOption)";
_params.Put((Object)("option"),(Object)(_selectedoption));
RDebugUtils.currentLine=154599459;
 //BA.debugLineNum = 154599459;BA.debugLine="params.Put(\"date\", Utils.GetCurrDatetimeExt)";
_params.Put((Object)("date"),(Object)(parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=154599460;
 //BA.debugLineNum = 154599460;BA.debugLine="params.Put(\"requests\",Utils.List2Str(LstPreReqs2D";
_params.Put((Object)("requests"),(Object)(parent.mostCurrent._utils._list2str /*String*/ (mostCurrent.activityBA,parent.mostCurrent._lstprereqs2download,"|")));
RDebugUtils.currentLine=154599461;
 //BA.debugLineNum = 154599461;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=154599462;
 //BA.debugLineNum = 154599462;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=154599463;
 //BA.debugLineNum = 154599463;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=154599464;
 //BA.debugLineNum = 154599464;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=154599465;
 //BA.debugLineNum = 154599465;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=154599466;
 //BA.debugLineNum = 154599466;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=154599467;
 //BA.debugLineNum = 154599467;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=154599468;
 //BA.debugLineNum = 154599468;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=154599469;
 //BA.debugLineNum = 154599469;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=154599471;
 //BA.debugLineNum = 154599471;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=154599475;
 //BA.debugLineNum = 154599475;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"GetPreReqAssign\",d";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Objects","GetPreReqAssign",_data);
RDebugUtils.currentLine=154599477;
 //BA.debugLineNum = 154599477;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=154599478;
 //BA.debugLineNum = 154599478;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=154599479;
 //BA.debugLineNum = 154599479;BA.debugLine="Job.GetRequest.Timeout = 90000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (90000));
RDebugUtils.currentLine=154599481;
 //BA.debugLineNum = 154599481;BA.debugLine="Dim continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=154599483;
 //BA.debugLineNum = 154599483;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "getprereqassign"), (Object)(_job));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=154599485;
 //BA.debugLineNum = 154599485;BA.debugLine="If Job.Success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_job._success /*boolean*/ ) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=154599486;
 //BA.debugLineNum = 154599486;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154599486",_serveraddress,0);
RDebugUtils.currentLine=154599487;
 //BA.debugLineNum = 154599487;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"GetPreReqAssign\",";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Objects","GetPreReqAssign","Completed");
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=154599489;
 //BA.debugLineNum = 154599489;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154599489",_serveraddress,0);
RDebugUtils.currentLine=154599490;
 //BA.debugLineNum = 154599490;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"GetPreReqAssign\",";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Objects","GetPreReqAssign","ERROR");
RDebugUtils.currentLine=154599491;
 //BA.debugLineNum = 154599491;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=154599492;
 //BA.debugLineNum = 154599492;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=154599493;
 //BA.debugLineNum = 154599493;BA.debugLine="continua = False";
_continua = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=154599495;
 //BA.debugLineNum = 154599495;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=154599497;
 //BA.debugLineNum = 154599497;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=154599498;
 //BA.debugLineNum = 154599498;BA.debugLine="MsgboxAsync(\"Intervenções atribuidas\", ShareCode.";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Intervenções atribuidas"),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),processBA);
RDebugUtils.currentLine=154599500;
 //BA.debugLineNum = 154599500;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _clabuttonrequestfilter_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clabuttonrequestfilter_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "clabuttonrequestfilter_click", null); return;}
ResumableSub_CLAButtonRequestFilter_Click rsub = new ResumableSub_CLAButtonRequestFilter_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_CLAButtonRequestFilter_Click extends BA.ResumableSub {
public ResumableSub_CLAButtonRequestFilter_Click(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _completed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=154664963;
 //BA.debugLineNum = 154664963;BA.debugLine="Dim res As ResumableSub = CreatePreReqHeaders";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _createprereqheaders();
RDebugUtils.currentLine=154664964;
 //BA.debugLineNum = 154664964;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "clabuttonrequestfilter_click"), _res);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=154664966;
 //BA.debugLineNum = 154664966;BA.debugLine="CLAButtonRequestDownload.Enabled = True";
parent.mostCurrent._clabuttonrequestdownload.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=154664968;
 //BA.debugLineNum = 154664968;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createprereqheaders() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createprereqheaders", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createprereqheaders", null));}
ResumableSub_CreatePreReqHeaders rsub = new ResumableSub_CreatePreReqHeaders(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreatePreReqHeaders extends BA.ResumableSub {
public ResumableSub_CreatePreReqHeaders(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _completed = false;
xevolution.vrcg.devdemov2400.types._codenamelist _r = null;
String _requestfilenameprerequests = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
boolean _continua = false;
String _prereq_info = "";
String _prereq_filename = "";
int _sqlfilestotal = 0;
int _trycount = 0;
boolean _dotry = false;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager _ctm = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;
String _jsonstruct = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _datahora = "";
int _totalfiles = 0;
anywheresoftware.b4a.objects.collections.List _inserts = null;
anywheresoftware.b4a.objects.collections.Map _colinserts = null;
String _mastertagcode = "";
String _childfield = "";
String _tagcodelist = "";
anywheresoftware.b4a.objects.collections.List _newinfolist = null;
String _table = "";
int _i = 0;
boolean _result = false;
String _date = "";
String _filen = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _n = 0;
String _script2execute = "";
String _sqlevc = "";
int _height = 0;
int _totallineitemscl = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
boolean _canadd = false;
anywheresoftware.b4a.objects.PanelWrapper _pp = null;
anywheresoftware.b4a.BA.IterableList group112;
int index112;
int groupLen112;
int step124;
int limit124;
int step155;
int limit155;
int step169;
int limit169;
int step183;
int limit183;
int step198;
int limit198;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=154468354;
 //BA.debugLineNum = 154468354;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,F";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=154468356;
 //BA.debugLineNum = 154468356;BA.debugLine="Qry_TypeRequest = \"\"";
parent.mostCurrent._qry_typerequest = "";
RDebugUtils.currentLine=154468357;
 //BA.debugLineNum = 154468357;BA.debugLine="Qry_District = \"\"";
parent.mostCurrent._qry_district = "";
RDebugUtils.currentLine=154468358;
 //BA.debugLineNum = 154468358;BA.debugLine="Qry_County = \"\"";
parent.mostCurrent._qry_county = "";
RDebugUtils.currentLine=154468359;
 //BA.debugLineNum = 154468359;BA.debugLine="Qry_Filter = \"\"";
parent.mostCurrent._qry_filter = "";
RDebugUtils.currentLine=154468360;
 //BA.debugLineNum = 154468360;BA.debugLine="Qry_DateIn = \"\"";
parent.mostCurrent._qry_datein = "";
RDebugUtils.currentLine=154468361;
 //BA.debugLineNum = 154468361;BA.debugLine="Qry_DateOut = \"\"";
parent.mostCurrent._qry_dateout = "";
RDebugUtils.currentLine=154468367;
 //BA.debugLineNum = 154468367;BA.debugLine="listRequests.Clear";
parent.mostCurrent._listrequests._clear();
RDebugUtils.currentLine=154468368;
 //BA.debugLineNum = 154468368;BA.debugLine="Dim res As ResumableSub = DeletePreRequestsFromLo";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _deleteprerequestsfromlocaldb();
RDebugUtils.currentLine=154468369;
 //BA.debugLineNum = 154468369;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"), _res);
this.state = 124;
return;
case 124:
//C
this.state = 1;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=154468371;
 //BA.debugLineNum = 154468371;BA.debugLine="If (CLAPreRequestPickerLabel.SelectedIndex > 0) T";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent.mostCurrent._claprerequestpickerlabel.getSelectedIndex()>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=154468372;
 //BA.debugLineNum = 154468372;BA.debugLine="Dim r As CodeNameList = ReqList.Get(CLAPreReques";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(parent.mostCurrent._reqlist.Get((int) (parent.mostCurrent._claprerequestpickerlabel.getSelectedIndex()-1)));
RDebugUtils.currentLine=154468373;
 //BA.debugLineNum = 154468373;BA.debugLine="Qry_TypeRequest = r.TagCode";
parent.mostCurrent._qry_typerequest = _r.TagCode /*String*/ ;
 if (true) break;
;
RDebugUtils.currentLine=154468377;
 //BA.debugLineNum = 154468377;BA.debugLine="If (CLAPreRequestDistrictePickerLabel.SelectedInd";

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._claprerequestdistrictepickerlabel.getSelectedIndex()>0)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=154468378;
 //BA.debugLineNum = 154468378;BA.debugLine="Dim r As CodeNameList = DistrictsList.Get(CLAPre";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(parent.mostCurrent._districtslist.Get((int) (parent.mostCurrent._claprerequestdistrictepickerlabel.getSelectedIndex()-1)));
RDebugUtils.currentLine=154468379;
 //BA.debugLineNum = 154468379;BA.debugLine="Qry_District =  r.TagCode";
parent.mostCurrent._qry_district = _r.TagCode /*String*/ ;
 if (true) break;
;
RDebugUtils.currentLine=154468382;
 //BA.debugLineNum = 154468382;BA.debugLine="If (CLAPreRequestCountyPickerLabel.SelectedIndex";

case 7:
//if
this.state = 10;
if ((parent.mostCurrent._claprerequestcountypickerlabel.getSelectedIndex()>0)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=154468383;
 //BA.debugLineNum = 154468383;BA.debugLine="Dim r As CodeNameList = CountyList.Get(CLAPreReq";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(parent.mostCurrent._countylist.Get((int) (parent.mostCurrent._claprerequestcountypickerlabel.getSelectedIndex()-1)));
RDebugUtils.currentLine=154468384;
 //BA.debugLineNum = 154468384;BA.debugLine="Qry_County = r.TagCode";
parent.mostCurrent._qry_county = _r.TagCode /*String*/ ;
 if (true) break;
;
RDebugUtils.currentLine=154468387;
 //BA.debugLineNum = 154468387;BA.debugLine="If Utils.NNE(DialogReqStartDateLabel.Text) Then";

case 10:
//if
this.state = 13;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._dialogreqstartdatelabel.getText())) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=154468388;
 //BA.debugLineNum = 154468388;BA.debugLine="Qry_DateIn = DialogReqStartDateLabel.Text";
parent.mostCurrent._qry_datein = parent.mostCurrent._dialogreqstartdatelabel.getText();
 if (true) break;
;
RDebugUtils.currentLine=154468391;
 //BA.debugLineNum = 154468391;BA.debugLine="If Utils.NNE(DialogReqEndDateLabel.Text) Then";

case 13:
//if
this.state = 16;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._dialogreqenddatelabel.getText())) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=154468392;
 //BA.debugLineNum = 154468392;BA.debugLine="Qry_DateOut = DialogReqEndDateLabel.Text";
parent.mostCurrent._qry_dateout = parent.mostCurrent._dialogreqenddatelabel.getText();
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=154468395;
 //BA.debugLineNum = 154468395;BA.debugLine="Qry_Filter = CLAPreRequestEditSearch.Text";
parent.mostCurrent._qry_filter = parent.mostCurrent._claprerequesteditsearch.getText();
RDebugUtils.currentLine=154468397;
 //BA.debugLineNum = 154468397;BA.debugLine="Log(\"Qry_TypeRequest:\" & Qry_TypeRequest)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468397","Qry_TypeRequest:"+parent.mostCurrent._qry_typerequest,0);
RDebugUtils.currentLine=154468398;
 //BA.debugLineNum = 154468398;BA.debugLine="Log(\"Qry_District:\" & Qry_District)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468398","Qry_District:"+parent.mostCurrent._qry_district,0);
RDebugUtils.currentLine=154468399;
 //BA.debugLineNum = 154468399;BA.debugLine="Log(\"Qry_County:\" & Qry_County)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468399","Qry_County:"+parent.mostCurrent._qry_county,0);
RDebugUtils.currentLine=154468400;
 //BA.debugLineNum = 154468400;BA.debugLine="Log(\"Qry_Filter\" & Qry_Filter)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468400","Qry_Filter"+parent.mostCurrent._qry_filter,0);
RDebugUtils.currentLine=154468401;
 //BA.debugLineNum = 154468401;BA.debugLine="Log(\"Qry_DateIn:\" & Qry_DateIn)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468401","Qry_DateIn:"+parent.mostCurrent._qry_datein,0);
RDebugUtils.currentLine=154468402;
 //BA.debugLineNum = 154468402;BA.debugLine="Log(\"Qry_DateOut:\" & Qry_DateOut)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468402","Qry_DateOut:"+parent.mostCurrent._qry_dateout,0);
RDebugUtils.currentLine=154468404;
 //BA.debugLineNum = 154468404;BA.debugLine="Dim RequestFileNamePreRequests As String = Utils.";
_requestfilenameprerequests = parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=154468407;
 //BA.debugLineNum = 154468407;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/prerequests/headers");
RDebugUtils.currentLine=154468408;
 //BA.debugLineNum = 154468408;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=154468409;
 //BA.debugLineNum = 154468409;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",objects.getObject());
RDebugUtils.currentLine=154468410;
 //BA.debugLineNum = 154468410;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=154468411;
 //BA.debugLineNum = 154468411;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=154468412;
 //BA.debugLineNum = 154468412;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=154468413;
 //BA.debugLineNum = 154468413;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=154468414;
 //BA.debugLineNum = 154468414;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=154468415;
 //BA.debugLineNum = 154468415;BA.debugLine="params.Put(\"typeRequest\",Qry_TypeRequest)";
_params.Put((Object)("typeRequest"),(Object)(parent.mostCurrent._qry_typerequest));
RDebugUtils.currentLine=154468416;
 //BA.debugLineNum = 154468416;BA.debugLine="params.Put(\"district\",Qry_District)";
_params.Put((Object)("district"),(Object)(parent.mostCurrent._qry_district));
RDebugUtils.currentLine=154468417;
 //BA.debugLineNum = 154468417;BA.debugLine="params.Put(\"county\",Qry_County)";
_params.Put((Object)("county"),(Object)(parent.mostCurrent._qry_county));
RDebugUtils.currentLine=154468418;
 //BA.debugLineNum = 154468418;BA.debugLine="params.Put(\"filter\",Qry_Filter)";
_params.Put((Object)("filter"),(Object)(parent.mostCurrent._qry_filter));
RDebugUtils.currentLine=154468419;
 //BA.debugLineNum = 154468419;BA.debugLine="params.Put(\"dateIn\",Utils.IfNullOrEmpty(Qry_DateI";
_params.Put((Object)("dateIn"),(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._qry_datein,parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA))));
RDebugUtils.currentLine=154468420;
 //BA.debugLineNum = 154468420;BA.debugLine="params.Put(\"dateOut\",Utils.IfNullOrEmpty(Qry_Date";
_params.Put((Object)("dateOut"),(Object)(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._qry_dateout,parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA))));
RDebugUtils.currentLine=154468421;
 //BA.debugLineNum = 154468421;BA.debugLine="params.Put(\"user\", ShareCode.SESS_User)";
_params.Put((Object)("user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=154468422;
 //BA.debugLineNum = 154468422;BA.debugLine="params.Put(\"name\", RequestFileNamePreRequests)";
_params.Put((Object)("name"),(Object)(_requestfilenameprerequests));
RDebugUtils.currentLine=154468423;
 //BA.debugLineNum = 154468423;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=154468424;
 //BA.debugLineNum = 154468424;BA.debugLine="params.Put(\"date\", Utils.GetCurrDatetimeExt)";
_params.Put((Object)("date"),(Object)(parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=154468425;
 //BA.debugLineNum = 154468425;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
_params.Put((Object)("smart"),(Object)(parent.mostCurrent._sharecode._isphone /*boolean*/ ));
RDebugUtils.currentLine=154468426;
 //BA.debugLineNum = 154468426;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=154468427;
 //BA.debugLineNum = 154468427;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=154468428;
 //BA.debugLineNum = 154468428;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=154468429;
 //BA.debugLineNum = 154468429;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=154468430;
 //BA.debugLineNum = 154468430;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=154468431;
 //BA.debugLineNum = 154468431;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=154468432;
 //BA.debugLineNum = 154468432;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=154468433;
 //BA.debugLineNum = 154468433;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=154468434;
 //BA.debugLineNum = 154468434;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=154468436;
 //BA.debugLineNum = 154468436;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=154468438;
 //BA.debugLineNum = 154468438;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"CLAButton\",data)";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Objects","CLAButton",_data);
RDebugUtils.currentLine=154468440;
 //BA.debugLineNum = 154468440;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=154468441;
 //BA.debugLineNum = 154468441;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=154468442;
 //BA.debugLineNum = 154468442;BA.debugLine="Job.GetRequest.Timeout = 90000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (90000));
RDebugUtils.currentLine=154468444;
 //BA.debugLineNum = 154468444;BA.debugLine="Dim continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=154468446;
 //BA.debugLineNum = 154468446;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"), (Object)(_job));
this.state = 125;
return;
case 125:
//C
this.state = 17;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=154468448;
 //BA.debugLineNum = 154468448;BA.debugLine="If Job.Success Then";
if (true) break;

case 17:
//if
this.state = 22;
if (_job._success /*boolean*/ ) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=154468449;
 //BA.debugLineNum = 154468449;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468449",_serveraddress,0);
RDebugUtils.currentLine=154468450;
 //BA.debugLineNum = 154468450;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"CLAButtonRequestF";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Objects","CLAButtonRequestFilter","Completed");
RDebugUtils.currentLine=154468451;
 //BA.debugLineNum = 154468451;BA.debugLine="Log (Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468451",_job._getstring /*String*/ (null),0);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=154468453;
 //BA.debugLineNum = 154468453;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468453",_serveraddress,0);
RDebugUtils.currentLine=154468454;
 //BA.debugLineNum = 154468454;BA.debugLine="Utils.ShowProcinLog(\"Objects\",\"CLAButtonRequestF";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Objects","CLAButtonRequestFilter","ERROR");
RDebugUtils.currentLine=154468455;
 //BA.debugLineNum = 154468455;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=154468456;
 //BA.debugLineNum = 154468456;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=154468457;
 //BA.debugLineNum = 154468457;BA.debugLine="continua = False";
_continua = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=154468458;
 //BA.debugLineNum = 154468458;BA.debugLine="Log (Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468458",_job._getstring /*String*/ (null),0);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=154468460;
 //BA.debugLineNum = 154468460;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=154468462;
 //BA.debugLineNum = 154468462;BA.debugLine="If continua Then";
if (true) break;

case 23:
//if
this.state = 123;
if (_continua) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=154468464;
 //BA.debugLineNum = 154468464;BA.debugLine="Dim PREREQ_INFO As String = $\"${RequestFileNameP";
_prereq_info = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_requestfilenameprerequests))+".INFO");
RDebugUtils.currentLine=154468465;
 //BA.debugLineNum = 154468465;BA.debugLine="Dim prereq_fileName As String = RequestFileNameP";
_prereq_filename = _requestfilenameprerequests;
RDebugUtils.currentLine=154468467;
 //BA.debugLineNum = 154468467;BA.debugLine="Dim SqlFilesTotal As Int = 0";
_sqlfilestotal = (int) (0);
RDebugUtils.currentLine=154468468;
 //BA.debugLineNum = 154468468;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=154468469;
 //BA.debugLineNum = 154468469;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=154468470;
 //BA.debugLineNum = 154468470;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=154468473;
 //BA.debugLineNum = 154468473;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=154468474;
 //BA.debugLineNum = 154468474;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=154468475;
 //BA.debugLineNum = 154468475;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=154468476;
 //BA.debugLineNum = 154468476;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=154468477;
 //BA.debugLineNum = 154468477;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=154468478;
 //BA.debugLineNum = 154468478;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=154468479;
 //BA.debugLineNum = 154468479;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 26:
//do while
this.state = 59;
while ((_dotry && (_trycount<3))) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=154468481;
 //BA.debugLineNum = 154468481;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_prereq_info,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_prereq_info);
RDebugUtils.currentLine=154468482;
 //BA.debugLineNum = 154468482;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"), _sf);
this.state = 126;
return;
case 126:
//C
this.state = 29;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=154468484;
 //BA.debugLineNum = 154468484;BA.debugLine="If Success Then";
if (true) break;

case 29:
//if
this.state = 58;
if (_success) { 
this.state = 31;
}else {
this.state = 57;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=154468485;
 //BA.debugLineNum = 154468485;BA.debugLine="Log(PREREQ_INFO & \" file was download successf";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468485",_prereq_info+" file was download successfully",0);
RDebugUtils.currentLine=154468487;
 //BA.debugLineNum = 154468487;BA.debugLine="Try";
if (true) break;

case 32:
//try
this.state = 55;
this.catchState = 54;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 54;
RDebugUtils.currentLine=154468489;
 //BA.debugLineNum = 154468489;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 35:
//if
this.state = 52;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=154468490;
 //BA.debugLineNum = 154468490;BA.debugLine="Dim JsonStruct As String = File.readstring(S";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_prereq_info);
RDebugUtils.currentLine=154468491;
 //BA.debugLineNum = 154468491;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=154468492;
 //BA.debugLineNum = 154468492;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=154468493;
 //BA.debugLineNum = 154468493;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=154468494;
 //BA.debugLineNum = 154468494;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\"";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=154468495;
 //BA.debugLineNum = 154468495;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=154468496;
 //BA.debugLineNum = 154468496;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=154468501;
 //BA.debugLineNum = 154468501;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 38:
//for
this.state = 51;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group112 = _inserts;
index112 = 0;
groupLen112 = group112.getSize();
this.state = 127;
if (true) break;

case 127:
//C
this.state = 51;
if (index112 < groupLen112) {
this.state = 40;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group112.Get(index112)));}
if (true) break;

case 128:
//C
this.state = 127;
index112++;
if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=154468502;
 //BA.debugLineNum = 154468502;BA.debugLine="Dim mastertagcode As String = colinserts.Ge";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=154468503;
 //BA.debugLineNum = 154468503;BA.debugLine="Try";
if (true) break;

case 41:
//try
this.state = 46;
this.catchState = 45;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 46;
this.catchState = 45;
RDebugUtils.currentLine=154468504;
 //BA.debugLineNum = 154468504;BA.debugLine="Dim childfield As String = colinserts.Get(";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 54;
RDebugUtils.currentLine=154468506;
 //BA.debugLineNum = 154468506;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=154468507;
 //BA.debugLineNum = 154468507;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468507",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154468508;
 //BA.debugLineNum = 154468508;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 54;
;
RDebugUtils.currentLine=154468510;
 //BA.debugLineNum = 154468510;BA.debugLine="Dim tagcodelist As String = colinserts.Get(";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=154468511;
 //BA.debugLineNum = 154468511;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=154468512;
 //BA.debugLineNum = 154468512;BA.debugLine="Dim table As String = colinserts.Get(\"table";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=154468514;
 //BA.debugLineNum = 154468514;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 47:
//for
this.state = 50;
step124 = 1;
limit124 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 129;
if (true) break;

case 129:
//C
this.state = 50;
if ((step124 > 0 && _i <= limit124) || (step124 < 0 && _i >= limit124)) this.state = 49;
if (true) break;

case 130:
//C
this.state = 129;
_i = ((int)(0 + _i + step124)) ;
if (true) break;

case 49:
//C
this.state = 130;
RDebugUtils.currentLine=154468515;
 //BA.debugLineNum = 154468515;BA.debugLine="Dim res As ResumableSub = DBStructures.Rem";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=154468516;
 //BA.debugLineNum = 154468516;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"), _res);
this.state = 131;
return;
case 131:
//C
this.state = 130;
_result = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 128;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=154468521;
 //BA.debugLineNum = 154468521;BA.debugLine="SqlFilesTotal = Totalfiles";
_sqlfilestotal = _totalfiles;
RDebugUtils.currentLine=154468522;
 //BA.debugLineNum = 154468522;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=154468523;
 //BA.debugLineNum = 154468523;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=154468524;
 //BA.debugLineNum = 154468524;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=154468525;
 //BA.debugLineNum = 154468525;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=154468526;
 //BA.debugLineNum = 154468526;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=154468527;
 //BA.debugLineNum = 154468527;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 52:
//C
this.state = 55;
;
 if (true) break;

case 54:
//C
this.state = 55;
this.catchState = 0;
RDebugUtils.currentLine=154468531;
 //BA.debugLineNum = 154468531;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468531",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154468532;
 //BA.debugLineNum = 154468532;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=154468533;
 //BA.debugLineNum = 154468533;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 55:
//C
this.state = 58;
this.catchState = 0;
;
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=154468536;
 //BA.debugLineNum = 154468536;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468536",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154468537;
 //BA.debugLineNum = 154468537;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=154468538;
 //BA.debugLineNum = 154468538;BA.debugLine="Log(\"Error downloading file \" & PREREQ_INFO)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468538","Error downloading file "+_prereq_info,0);
RDebugUtils.currentLine=154468539;
 //BA.debugLineNum = 154468539;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 58:
//C
this.state = 26;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=154468542;
 //BA.debugLineNum = 154468542;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=154468544;
 //BA.debugLineNum = 154468544;BA.debugLine="If(SqlFilesTotal > 0) Then";
if (true) break;

case 60:
//if
this.state = 95;
if ((_sqlfilestotal>0)) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=154468546;
 //BA.debugLineNum = 154468546;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=154468547;
 //BA.debugLineNum = 154468547;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=154468548;
 //BA.debugLineNum = 154468548;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=154468550;
 //BA.debugLineNum = 154468550;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=154468552;
 //BA.debugLineNum = 154468552;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 63:
//for
this.state = 76;
step155 = 1;
limit155 = _sqlfilestotal;
_i = (int) (1) ;
this.state = 132;
if (true) break;

case 132:
//C
this.state = 76;
if ((step155 > 0 && _i <= limit155) || (step155 < 0 && _i >= limit155)) this.state = 65;
if (true) break;

case 133:
//C
this.state = 132;
_i = ((int)(0 + _i + step155)) ;
if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=154468553;
 //BA.debugLineNum = 154468553;BA.debugLine="Dim fileN As String = $\"${RequestFileNamePreRe";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_requestfilenameprerequests))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=154468555;
 //BA.debugLineNum = 154468555;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
if (true) break;

case 66:
//if
this.state = 69;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=154468556;
 //BA.debugLineNum = 154468556;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fi";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=154468561;
 //BA.debugLineNum = 154468561;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filen,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=154468562;
 //BA.debugLineNum = 154468562;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"), _sf);
this.state = 134;
return;
case 134:
//C
this.state = 70;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=154468564;
 //BA.debugLineNum = 154468564;BA.debugLine="If Success Then";
if (true) break;

case 70:
//if
this.state = 75;
if (_success) { 
this.state = 72;
}else {
this.state = 74;
}if (true) break;

case 72:
//C
this.state = 75;
RDebugUtils.currentLine=154468565;
 //BA.debugLineNum = 154468565;BA.debugLine="Log(fileN & \" file was download successfully\"";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468565",_filen+" file was download successfully",0);
 if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=154468567;
 //BA.debugLineNum = 154468567;BA.debugLine="Log(\"Error downloading file \" & fileN)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468567","Error downloading file "+_filen,0);
 if (true) break;

case 75:
//C
this.state = 133;
;
 if (true) break;
if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=154468572;
 //BA.debugLineNum = 154468572;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=154468579;
 //BA.debugLineNum = 154468579;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 77:
//for
this.state = 94;
step169 = 1;
limit169 = _sqlfilestotal;
_i = (int) (1) ;
this.state = 135;
if (true) break;

case 135:
//C
this.state = 94;
if ((step169 > 0 && _i <= limit169) || (step169 < 0 && _i >= limit169)) this.state = 79;
if (true) break;

case 136:
//C
this.state = 135;
_i = ((int)(0 + _i + step169)) ;
if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=154468580;
 //BA.debugLineNum = 154468580;BA.debugLine="Dim fileN As String = $\"${RequestFileNamePreRe";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_requestfilenameprerequests))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=154468582;
 //BA.debugLineNum = 154468582;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=154468584;
 //BA.debugLineNum = 154468584;BA.debugLine="If (List1.IsInitialized) Then";
if (true) break;

case 80:
//if
this.state = 85;
if ((_list1.IsInitialized())) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 85;
RDebugUtils.currentLine=154468585;
 //BA.debugLineNum = 154468585;BA.debugLine="List1.Clear";
_list1.Clear();
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=154468587;
 //BA.debugLineNum = 154468587;BA.debugLine="List1.Initialize";
_list1.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=154468590;
 //BA.debugLineNum = 154468590;BA.debugLine="Try";

case 85:
//try
this.state = 90;
this.catchState = 89;
this.state = 87;
if (true) break;

case 87:
//C
this.state = 90;
this.catchState = 89;
RDebugUtils.currentLine=154468591;
 //BA.debugLineNum = 154468591;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 89:
//C
this.state = 90;
this.catchState = 0;
RDebugUtils.currentLine=154468594;
 //BA.debugLineNum = 154468594;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468594",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154468595;
 //BA.debugLineNum = 154468595;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=154468598;
 //BA.debugLineNum = 154468598;BA.debugLine="For n = 0 To List1.Size -1";

case 90:
//for
this.state = 93;
this.catchState = 0;
step183 = 1;
limit183 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 137;
if (true) break;

case 137:
//C
this.state = 93;
if ((step183 > 0 && _n <= limit183) || (step183 < 0 && _n >= limit183)) this.state = 92;
if (true) break;

case 138:
//C
this.state = 137;
_n = ((int)(0 + _n + step183)) ;
if (true) break;

case 92:
//C
this.state = 138;
RDebugUtils.currentLine=154468599;
 //BA.debugLineNum = 154468599;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
_script2execute = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=154468600;
 //BA.debugLineNum = 154468600;BA.debugLine="Utils.SaveSQLToLog(\"Objects\",Script2Execute,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"Objects",_script2execute,"");
 if (true) break;
if (true) break;

case 93:
//C
this.state = 136;
;
 if (true) break;
if (true) break;

case 94:
//C
this.state = 95;
;
RDebugUtils.currentLine=154468606;
 //BA.debugLineNum = 154468606;BA.debugLine="Dim res As ResumableSub = SendServerProcessComp";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _sendserverprocesscomplete(anywheresoftware.b4a.keywords.Common.False,_requestfilenameprerequests);
RDebugUtils.currentLine=154468607;
 //BA.debugLineNum = 154468607;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"), _res);
this.state = 139;
return;
case 139:
//C
this.state = 95;
_completed = (Boolean) result[0];
;
 if (true) break;

case 95:
//C
this.state = 96;
;
RDebugUtils.currentLine=154468611;
 //BA.debugLineNum = 154468611;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createprereqheaders"),(int) (100));
this.state = 140;
return;
case 140:
//C
this.state = 96;
;
RDebugUtils.currentLine=154468612;
 //BA.debugLineNum = 154468612;BA.debugLine="Dim SQLEVC As String = $\"${DBStructures.EVC_SQL_";
_sqlevc = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._dbstructures._evc_sql_getprerequests_data_new /*String*/ ))+" and a.status_id < 5");
RDebugUtils.currentLine=154468614;
 //BA.debugLineNum = 154468614;BA.debugLine="Log(SQLEVC)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468614",_sqlevc,0);
RDebugUtils.currentLine=154468616;
 //BA.debugLineNum = 154468616;BA.debugLine="Dim height As Int = 80dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80));
RDebugUtils.currentLine=154468617;
 //BA.debugLineNum = 154468617;BA.debugLine="Dim TotalLineItemsCL As Int = 0";
_totallineitemscl = (int) (0);
RDebugUtils.currentLine=154468618;
 //BA.debugLineNum = 154468618;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.E";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlevc)));
RDebugUtils.currentLine=154468619;
 //BA.debugLineNum = 154468619;BA.debugLine="If (Record.RowCount>=1) Then";
if (true) break;

case 96:
//if
this.state = 116;
if ((_record.getRowCount()>=1)) { 
this.state = 98;
}if (true) break;

case 98:
//C
this.state = 99;
RDebugUtils.currentLine=154468620;
 //BA.debugLineNum = 154468620;BA.debugLine="For n=0 To Record.RowCount-1";
if (true) break;

case 99:
//for
this.state = 115;
step198 = 1;
limit198 = (int) (_record.getRowCount()-1);
_n = (int) (0) ;
this.state = 141;
if (true) break;

case 141:
//C
this.state = 115;
if ((step198 > 0 && _n <= limit198) || (step198 < 0 && _n >= limit198)) this.state = 101;
if (true) break;

case 142:
//C
this.state = 141;
_n = ((int)(0 + _n + step198)) ;
if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=154468621;
 //BA.debugLineNum = 154468621;BA.debugLine="Record.Position = n";
_record.setPosition(_n);
RDebugUtils.currentLine=154468622;
 //BA.debugLineNum = 154468622;BA.debugLine="If Utils.NNE(Record.GetString(\"tagcode\")) Then";
if (true) break;

case 102:
//if
this.state = 114;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_record.GetString("tagcode"))) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=154468624;
 //BA.debugLineNum = 154468624;BA.debugLine="Dim CanAdd As Boolean = True";
_canadd = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=154468625;
 //BA.debugLineNum = 154468625;BA.debugLine="Try";
if (true) break;

case 105:
//try
this.state = 110;
this.catchState = 109;
this.state = 107;
if (true) break;

case 107:
//C
this.state = 110;
this.catchState = 109;
RDebugUtils.currentLine=154468626;
 //BA.debugLineNum = 154468626;BA.debugLine="Dim pp As Panel =  CreatePreRequestListItem(";
_pp = new anywheresoftware.b4a.objects.PanelWrapper();
_pp = _createprerequestlistitem(parent._itemscounter,_record,parent.mostCurrent._listrequests._asview().getWidth(),_height);
 if (true) break;

case 109:
//C
this.state = 110;
this.catchState = 0;
RDebugUtils.currentLine=154468628;
 //BA.debugLineNum = 154468628;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468628",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154468629;
 //BA.debugLineNum = 154468629;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=154468630;
 //BA.debugLineNum = 154468630;BA.debugLine="CanAdd = False";
_canadd = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=154468632;
 //BA.debugLineNum = 154468632;BA.debugLine="If (CanAdd) Then";

case 110:
//if
this.state = 113;
this.catchState = 0;
if ((_canadd)) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
RDebugUtils.currentLine=154468633;
 //BA.debugLineNum = 154468633;BA.debugLine="TotalLineItemsCL = TotalLineItemsCL +1";
_totallineitemscl = (int) (_totallineitemscl+1);
RDebugUtils.currentLine=154468634;
 //BA.debugLineNum = 154468634;BA.debugLine="ItemsCounter = ItemsCounter + 1";
parent._itemscounter = (int) (parent._itemscounter+1);
RDebugUtils.currentLine=154468635;
 //BA.debugLineNum = 154468635;BA.debugLine="listRequests.Add(pp, \"\")";
parent.mostCurrent._listrequests._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pp.getObject())),(Object)(""));
 if (true) break;

case 113:
//C
this.state = 114;
;
 if (true) break;

case 114:
//C
this.state = 142;
;
 if (true) break;
if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = 117;
;
RDebugUtils.currentLine=154468640;
 //BA.debugLineNum = 154468640;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=154468641;
 //BA.debugLineNum = 154468641;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=154468642;
 //BA.debugLineNum = 154468642;BA.debugLine="If TotalLineItemsCL = 0 Then";
if (true) break;

case 117:
//if
this.state = 122;
if (_totallineitemscl==0) { 
this.state = 119;
}else {
this.state = 121;
}if (true) break;

case 119:
//C
this.state = 122;
RDebugUtils.currentLine=154468643;
 //BA.debugLineNum = 154468643;BA.debugLine="MsgboxAsync($\"Não existem dados de acordo com o";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(("Não existem dados de acordo com os parametros selecionados. "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Por favor altere a sua seleccção e tente de novo.")),BA.ObjectToCharSequence("Pedidos"),processBA);
 if (true) break;

case 121:
//C
this.state = 122;
RDebugUtils.currentLine=154468645;
 //BA.debugLineNum = 154468645;BA.debugLine="Log(\"Total Pedidos : \" & TotalLineItemsCL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154468645","Total Pedidos : "+BA.NumberToString(_totallineitemscl),0);
RDebugUtils.currentLine=154468646;
 //BA.debugLineNum = 154468646;BA.debugLine="SetAllPreReqSelect(False)";
_setallprereqselect(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 122:
//C
this.state = 123;
;
 if (true) break;

case 123:
//C
this.state = -1;
;
RDebugUtils.currentLine=154468651;
 //BA.debugLineNum = 154468651;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=154468653;
 //BA.debugLineNum = 154468653;BA.debugLine="End Sub";
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
public static String  _claprerequestcountypickerlabel_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claprerequestcountypickerlabel_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claprerequestcountypickerlabel_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=156762112;
 //BA.debugLineNum = 156762112;BA.debugLine="Sub CLAPreRequestCountyPickerLabel_ItemClick (Posi";
RDebugUtils.currentLine=156762114;
 //BA.debugLineNum = 156762114;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
_makeprerequesttasklist(_cumulativetyperequest,_cumulativedistrict,_position,mostCurrent._cumulativedatein,mostCurrent._cumulativedateout,mostCurrent._cumulativefilter);
RDebugUtils.currentLine=156762115;
 //BA.debugLineNum = 156762115;BA.debugLine="End Sub";
return "";
}
public static String  _claprerequestdistrictepickerlabel_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claprerequestdistrictepickerlabel_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claprerequestdistrictepickerlabel_itemclick", new Object[] {_position,_value}));}
String _where = "";
xevolution.vrcg.devdemov2400.types._codenamelist _r = null;
int _c = 0;
xevolution.vrcg.devdemov2400.types._codenamelist _c2g = null;
RDebugUtils.currentLine=156827648;
 //BA.debugLineNum = 156827648;BA.debugLine="Sub CLAPreRequestDistrictePickerLabel_ItemClick (P";
RDebugUtils.currentLine=156827650;
 //BA.debugLineNum = 156827650;BA.debugLine="Dim where As String = \"\"";
_where = "";
RDebugUtils.currentLine=156827651;
 //BA.debugLineNum = 156827651;BA.debugLine="If (Position > 0) Then";
if ((_position>0)) { 
RDebugUtils.currentLine=156827652;
 //BA.debugLineNum = 156827652;BA.debugLine="Dim r As CodeNameList = DistrictsList.Get(Positi";
_r = (xevolution.vrcg.devdemov2400.types._codenamelist)(mostCurrent._districtslist.Get((int) (_position-1)));
RDebugUtils.currentLine=156827653;
 //BA.debugLineNum = 156827653;BA.debugLine="where = $\"where district_tagcode='${r.TagCode}'\"";
_where = ("where district_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_r.TagCode /*String*/ ))+"'");
 };
RDebugUtils.currentLine=156827655;
 //BA.debugLineNum = 156827655;BA.debugLine="CumulativeCounty = 0";
_cumulativecounty = (int) (0);
RDebugUtils.currentLine=156827657;
 //BA.debugLineNum = 156827657;BA.debugLine="CountyList.Clear";
mostCurrent._countylist.Clear();
RDebugUtils.currentLine=156827658;
 //BA.debugLineNum = 156827658;BA.debugLine="CountyList = DBStructures.GetListOfFromScriptCNLE";
mostCurrent._countylist = mostCurrent._dbstructures._getlistoffromscriptcnlevc /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,"tagcode","title",("select tagcode, title, country_id, district_tagcode from dta_counties "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_where))+" order by title"));
RDebugUtils.currentLine=156827659;
 //BA.debugLineNum = 156827659;BA.debugLine="CLAPreRequestCountyPickerLabel.Clear";
mostCurrent._claprerequestcountypickerlabel.Clear();
RDebugUtils.currentLine=156827660;
 //BA.debugLineNum = 156827660;BA.debugLine="CLAPreRequestCountyPickerLabel.Add(\"(Todos)\")";
mostCurrent._claprerequestcountypickerlabel.Add("(Todos)");
RDebugUtils.currentLine=156827661;
 //BA.debugLineNum = 156827661;BA.debugLine="For c=0 To CountyList.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (mostCurrent._countylist.getSize()-1);
_c = (int) (0) ;
for (;_c <= limit11 ;_c = _c + step11 ) {
RDebugUtils.currentLine=156827662;
 //BA.debugLineNum = 156827662;BA.debugLine="Dim c2g As CodeNameList = CountyList.Get(c)";
_c2g = (xevolution.vrcg.devdemov2400.types._codenamelist)(mostCurrent._countylist.Get(_c));
RDebugUtils.currentLine=156827663;
 //BA.debugLineNum = 156827663;BA.debugLine="CLAPreRequestCountyPickerLabel.Add(c2g.Name)";
mostCurrent._claprerequestcountypickerlabel.Add(_c2g.Name /*String*/ );
 }
};
RDebugUtils.currentLine=156827666;
 //BA.debugLineNum = 156827666;BA.debugLine="End Sub";
return "";
}
public static String  _claprerequesteditsearch_enterpressed() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claprerequesteditsearch_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claprerequesteditsearch_enterpressed", null));}
RDebugUtils.currentLine=156893184;
 //BA.debugLineNum = 156893184;BA.debugLine="Sub CLAPreRequestEditSearch_EnterPressed";
RDebugUtils.currentLine=156893185;
 //BA.debugLineNum = 156893185;BA.debugLine="MakeListSearchPreRequest(CLAPreRequestEditSearch.";
_makelistsearchprerequest(mostCurrent._claprerequesteditsearch.getText());
RDebugUtils.currentLine=156893186;
 //BA.debugLineNum = 156893186;BA.debugLine="End Sub";
return "";
}
public static String  _makelistsearchprerequest(String _search) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makelistsearchprerequest", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "makelistsearchprerequest", new Object[] {_search}));}
String _filter = "";
RDebugUtils.currentLine=156958720;
 //BA.debugLineNum = 156958720;BA.debugLine="Sub MakeListSearchPreRequest(search As String)";
RDebugUtils.currentLine=156958721;
 //BA.debugLineNum = 156958721;BA.debugLine="Dim Filter As String = $\" and (ifnull(e.title, ''";
_filter = (" and (ifnull(e.title, '')||ifnull(a.execute_date, '')||ifnull(b.title_import,'')||ifnull(b.details,'')||ifnull(b.reference,'')||ifnull(a.local_tagcode, '')||ifnull(cc.address, '')||ifnull(cc.address2, '')||ifnull(cc.postalcode, '')||ifnull(cc.`local`, '')||ifnull(cc.latitude, '')||ifnull(cc.longitude, '')||ifnull(b2.title_import,'') like '%"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_search))+"%') ");
RDebugUtils.currentLine=156958722;
 //BA.debugLineNum = 156958722;BA.debugLine="MakePreRequestTaskList(CumulativeTypeRequest, Cum";
_makeprerequesttasklist(_cumulativetyperequest,_cumulativedistrict,_cumulativecounty,mostCurrent._cumulativedatein,mostCurrent._cumulativedateout,_filter);
RDebugUtils.currentLine=156958723;
 //BA.debugLineNum = 156958723;BA.debugLine="End Sub";
return "";
}
public static String  _claprerequestpickerlabel_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claprerequestpickerlabel_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claprerequestpickerlabel_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=157024256;
 //BA.debugLineNum = 157024256;BA.debugLine="Sub CLAPreRequestPickerLabel_ItemClick (Position A";
RDebugUtils.currentLine=157024258;
 //BA.debugLineNum = 157024258;BA.debugLine="MakePreRequestTaskList(Position, CumulativeDistri";
_makeprerequesttasklist(_position,_cumulativedistrict,_cumulativecounty,mostCurrent._cumulativedatein,mostCurrent._cumulativedateout,mostCurrent._cumulativefilter);
RDebugUtils.currentLine=157024259;
 //BA.debugLineNum = 157024259;BA.debugLine="End Sub";
return "";
}
public static String  _claprerequestspinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claprerequestspinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claprerequestspinner_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=154992640;
 //BA.debugLineNum = 154992640;BA.debugLine="Sub CLAPreRequestSpinner_ItemClick (Position As In";
RDebugUtils.currentLine=154992641;
 //BA.debugLineNum = 154992641;BA.debugLine="listRequests.Clear";
mostCurrent._listrequests._clear();
RDebugUtils.currentLine=154992642;
 //BA.debugLineNum = 154992642;BA.debugLine="MakePreRequestTaskList(Position-1, 0, 0, \"\", \"\",";
_makeprerequesttasklist((int) (_position-1),(int) (0),(int) (0),"","","");
RDebugUtils.currentLine=154992643;
 //BA.debugLineNum = 154992643;BA.debugLine="End Sub";
return "";
}
public static String  _claprerequesttypespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "claprerequesttypespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "claprerequesttypespinner_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=154927104;
 //BA.debugLineNum = 154927104;BA.debugLine="Sub CLAPreRequestTypeSpinner_ItemClick (Position A";
RDebugUtils.currentLine=154927106;
 //BA.debugLineNum = 154927106;BA.debugLine="End Sub";
return "";
}
public static String  _clarequestlist_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clarequestlist_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clarequestlist_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pan = null;
RDebugUtils.currentLine=156499968;
 //BA.debugLineNum = 156499968;BA.debugLine="Sub CLARequestList_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=156499969;
 //BA.debugLineNum = 156499969;BA.debugLine="ListItemsListClearSelection";
_listitemslistclearselection();
RDebugUtils.currentLine=156499970;
 //BA.debugLineNum = 156499970;BA.debugLine="Dim pan As Panel = CLARequestList.GetPanel(Index)";
_pan = new anywheresoftware.b4a.objects.PanelWrapper();
_pan = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._clarequestlist._getpanel(_index).getObject()));
RDebugUtils.currentLine=156499971;
 //BA.debugLineNum = 156499971;BA.debugLine="pan.Color = 0x9637FF4B";
_pan.setColor((int) (0x9637ff4b));
RDebugUtils.currentLine=156499972;
 //BA.debugLineNum = 156499972;BA.debugLine="SelCheckList = pan.Tag";
mostCurrent._selchecklist = BA.ObjectToString(_pan.getTag());
RDebugUtils.currentLine=156499973;
 //BA.debugLineNum = 156499973;BA.debugLine="End Sub";
return "";
}
public static String  _listitemslistclearselection() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemslistclearselection", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemslistclearselection", null));}
int _n = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pan = null;
RDebugUtils.currentLine=156565504;
 //BA.debugLineNum = 156565504;BA.debugLine="Sub ListItemsListClearSelection";
RDebugUtils.currentLine=156565505;
 //BA.debugLineNum = 156565505;BA.debugLine="For n=0 To CLARequestList.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._clarequestlist._getsize()-1);
_n = (int) (0) ;
for (;_n <= limit1 ;_n = _n + step1 ) {
RDebugUtils.currentLine=156565506;
 //BA.debugLineNum = 156565506;BA.debugLine="Dim pan As B4XView = CLARequestList.GetPanel(n)";
_pan = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pan = mostCurrent._clarequestlist._getpanel(_n);
RDebugUtils.currentLine=156565507;
 //BA.debugLineNum = 156565507;BA.debugLine="If Utils.NNE(pan.tag) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,BA.ObjectToString(_pan.getTag()))) { 
RDebugUtils.currentLine=156565509;
 //BA.debugLineNum = 156565509;BA.debugLine="pan.Color = 0xFFFFFFFF";
_pan.setColor((int) (0xffffffff));
 };
 }
};
RDebugUtils.currentLine=156565512;
 //BA.debugLineNum = 156565512;BA.debugLine="End Sub";
return "";
}
public static String  _clarequesttypespinner_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clarequesttypespinner_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clarequesttypespinner_itemclick", new Object[] {_position,_value}));}
int _index = 0;
RDebugUtils.currentLine=155516928;
 //BA.debugLineNum = 155516928;BA.debugLine="Sub CLARequestTypeSpinner_ItemClick (Position As I";
RDebugUtils.currentLine=155516929;
 //BA.debugLineNum = 155516929;BA.debugLine="CLARequestList.Clear";
mostCurrent._clarequestlist._clear();
RDebugUtils.currentLine=155516930;
 //BA.debugLineNum = 155516930;BA.debugLine="Dim index As Int = Position-1";
_index = (int) (_position-1);
RDebugUtils.currentLine=155516931;
 //BA.debugLineNum = 155516931;BA.debugLine="MakeTaskList(index, \"\")";
_maketasklist(_index,"");
RDebugUtils.currentLine=155516932;
 //BA.debugLineNum = 155516932;BA.debugLine="End Sub";
return "";
}
public static String  _maketasklist(int _index,String _theobject) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "maketasklist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "maketasklist", new Object[] {_index,_theobject}));}
String _sqlevc = "";
int _height = 0;
int _totallineitemscl = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
boolean _canadd = false;
anywheresoftware.b4a.objects.PanelWrapper _pp = null;
RDebugUtils.currentLine=155189248;
 //BA.debugLineNum = 155189248;BA.debugLine="Sub MakeTaskList(Index As Int, theObject As String";
RDebugUtils.currentLine=155189250;
 //BA.debugLineNum = 155189250;BA.debugLine="Dim SQLEVC As String = $\"SELECT a.tagcode, a.grou";
_sqlevc = ("SELECT a.tagcode, a.group_type, ifnull(b.tagdesc, '(Sem grupo)') AS taskgroup_desc, '' as typeresults_desc,\n"+"								a.title, a.details, 0 as dayslastupdate, a.group_tags, a.details,a.paramters,c.only_related_type_technicals,\n"+"								a.updated_at, a.active, a.published, a.tr_is_model, a.tr_model_modes,a.tagcode \n"+"								FROM dta_typerequests AS a\n"+"								LEFT JOIN type_tpgroupstypes AS b ON (b.tagcode=a.group_type) \n"+"								LEFT JOIN dta_typerequests_adds as c ON (c.typerequest_tagcode=a.tagcode)\n"+"								WHERE  1=1 \n"+"								and a.active=1\n"+"								and a.published=1 and a.is_internal=0 \n"+"								order by a.title");
RDebugUtils.currentLine=155189283;
 //BA.debugLineNum = 155189283;BA.debugLine="Dim height As Int = 45dip";
_height = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45));
RDebugUtils.currentLine=155189284;
 //BA.debugLineNum = 155189284;BA.debugLine="Dim TotalLineItemsCL As Int = 0";
_totallineitemscl = (int) (0);
RDebugUtils.currentLine=155189285;
 //BA.debugLineNum = 155189285;BA.debugLine="Private Record As ResultSet = Starter.LocalSQLEVC";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlevc)));
RDebugUtils.currentLine=155189286;
 //BA.debugLineNum = 155189286;BA.debugLine="Do While Record.NextRow";
while (_record.NextRow()) {
RDebugUtils.currentLine=155189287;
 //BA.debugLineNum = 155189287;BA.debugLine="If Utils.NNE(Record.GetString(\"tagcode\")) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_record.GetString("tagcode"))) { 
RDebugUtils.currentLine=155189288;
 //BA.debugLineNum = 155189288;BA.debugLine="Log(ItemsCounter)";
anywheresoftware.b4a.keywords.Common.LogImpl("6155189288",BA.NumberToString(_itemscounter),0);
RDebugUtils.currentLine=155189289;
 //BA.debugLineNum = 155189289;BA.debugLine="Dim CanAdd As Boolean = True";
_canadd = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=155189290;
 //BA.debugLineNum = 155189290;BA.debugLine="Try";
try {RDebugUtils.currentLine=155189291;
 //BA.debugLineNum = 155189291;BA.debugLine="Dim pp As Panel =  CreateRequestListItem(Items";
_pp = new anywheresoftware.b4a.objects.PanelWrapper();
_pp = _createrequestlistitem(_itemscounter,_record,mostCurrent._clarequestlist._asview().getWidth(),_height,_theobject);
 } 
       catch (Exception e12) {
			processBA.setLastException(e12);RDebugUtils.currentLine=155189293;
 //BA.debugLineNum = 155189293;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6155189293",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=155189294;
 //BA.debugLineNum = 155189294;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=155189295;
 //BA.debugLineNum = 155189295;BA.debugLine="CanAdd = False";
_canadd = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=155189297;
 //BA.debugLineNum = 155189297;BA.debugLine="If (CanAdd) Then";
if ((_canadd)) { 
RDebugUtils.currentLine=155189298;
 //BA.debugLineNum = 155189298;BA.debugLine="TotalLineItemsCL = TotalLineItemsCL +1";
_totallineitemscl = (int) (_totallineitemscl+1);
RDebugUtils.currentLine=155189299;
 //BA.debugLineNum = 155189299;BA.debugLine="ItemsCounter = ItemsCounter + 1";
_itemscounter = (int) (_itemscounter+1);
RDebugUtils.currentLine=155189300;
 //BA.debugLineNum = 155189300;BA.debugLine="CLARequestList.Add(pp, \"\")";
mostCurrent._clarequestlist._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pp.getObject())),(Object)(""));
 };
 };
 }
;
RDebugUtils.currentLine=155189304;
 //BA.debugLineNum = 155189304;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=155189305;
 //BA.debugLineNum = 155189305;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(String _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height,anywheresoftware.b4a.objects.collections.List _req,anywheresoftware.b4a.objects.collections.List _nreq) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitem", new Object[] {_cnt,_colitems,_width,_height,_req,_nreq}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _name = "";
String _status_desc = "";
int _status_id = 0;
String _tagcode = "";
String _typedesc = "";
String _address = "";
String _address2 = "";
String _postal_code = "";
String _city = "";
String _latitude = "";
String _longitude = "";
String _objref = "";
String _objectparent = "";
String _parentname = "";
String _thisaddress = "";
RDebugUtils.currentLine=151650304;
 //BA.debugLineNum = 151650304;BA.debugLine="Sub CreateListItem(cnt As String, colitems As Curs";
RDebugUtils.currentLine=151650305;
 //BA.debugLineNum = 151650305;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=151650306;
 //BA.debugLineNum = 151650306;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=151650307;
 //BA.debugLineNum = 151650307;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=151650308;
 //BA.debugLineNum = 151650308;BA.debugLine="If(ShareCode.ISPHONE)Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=151650309;
 //BA.debugLineNum = 151650309;BA.debugLine="p.LoadLayout(\"objects_itemview_phone\")";
_p.LoadLayout("objects_itemview_phone",mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=151650311;
 //BA.debugLineNum = 151650311;BA.debugLine="p.LoadLayout(\"Objects_itemview\")";
_p.LoadLayout("Objects_itemview",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=151650313;
 //BA.debugLineNum = 151650313;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=151650315;
 //BA.debugLineNum = 151650315;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
_name = _colitems.GetString("name");
RDebugUtils.currentLine=151650317;
 //BA.debugLineNum = 151650317;BA.debugLine="Dim status_desc As String = colitems.GetString(\"s";
_status_desc = _colitems.GetString("status_desc");
RDebugUtils.currentLine=151650321;
 //BA.debugLineNum = 151650321;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
_status_id = _colitems.GetInt("status_id");
RDebugUtils.currentLine=151650322;
 //BA.debugLineNum = 151650322;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=151650323;
 //BA.debugLineNum = 151650323;BA.debugLine="Dim typedesc As String = colitems.GetString(\"type";
_typedesc = _colitems.GetString("typedesc");
RDebugUtils.currentLine=151650324;
 //BA.debugLineNum = 151650324;BA.debugLine="Dim address As String = colitems.GetString(\"addre";
_address = _colitems.GetString("address");
RDebugUtils.currentLine=151650325;
 //BA.debugLineNum = 151650325;BA.debugLine="Dim address2 As String = colitems.GetString(\"addr";
_address2 = _colitems.GetString("address2");
RDebugUtils.currentLine=151650326;
 //BA.debugLineNum = 151650326;BA.debugLine="Dim postal_code As String = colitems.GetString(\"p";
_postal_code = _colitems.GetString("postal_code");
RDebugUtils.currentLine=151650327;
 //BA.debugLineNum = 151650327;BA.debugLine="Dim city As String = colitems.GetString(\"city\")";
_city = _colitems.GetString("city");
RDebugUtils.currentLine=151650328;
 //BA.debugLineNum = 151650328;BA.debugLine="Dim latitude As String = colitems.GetString(\"lati";
_latitude = _colitems.GetString("latitude");
RDebugUtils.currentLine=151650329;
 //BA.debugLineNum = 151650329;BA.debugLine="Dim longitude As String = colitems.GetString(\"lon";
_longitude = _colitems.GetString("longitude");
RDebugUtils.currentLine=151650330;
 //BA.debugLineNum = 151650330;BA.debugLine="Dim ObjRef As String = colitems.GetString(\"refere";
_objref = _colitems.GetString("reference");
RDebugUtils.currentLine=151650331;
 //BA.debugLineNum = 151650331;BA.debugLine="Dim ObjectParent As String = colitems.GetString(\"";
_objectparent = _colitems.GetString("parent");
RDebugUtils.currentLine=151650337;
 //BA.debugLineNum = 151650337;BA.debugLine="If Utils.NNE(ObjRef) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_objref)) { 
RDebugUtils.currentLine=151650338;
 //BA.debugLineNum = 151650338;BA.debugLine="ObjRef = $\"(${ObjRef})\"$";
_objref = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objref))+")");
 }else {
RDebugUtils.currentLine=151650340;
 //BA.debugLineNum = 151650340;BA.debugLine="ObjRef = \"\"";
_objref = "";
 };
RDebugUtils.currentLine=151650343;
 //BA.debugLineNum = 151650343;BA.debugLine="ListItemFullName.text = $\"${name} ${ObjRef}\"$";
mostCurrent._listitemfullname.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_name))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objref))+"")));
RDebugUtils.currentLine=151650344;
 //BA.debugLineNum = 151650344;BA.debugLine="If Utils.NNE(cnt) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_cnt)) { 
RDebugUtils.currentLine=151650345;
 //BA.debugLineNum = 151650345;BA.debugLine="ListItemNumber.Text = $\"${cnt}\"$";
mostCurrent._listitemnumber.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt))+"")));
RDebugUtils.currentLine=151650346;
 //BA.debugLineNum = 151650346;BA.debugLine="ListItemNumber.Color =Consts.ColorYellow";
mostCurrent._listitemnumber.setColor(mostCurrent._consts._coloryellow /*int*/ );
 };
RDebugUtils.currentLine=151650350;
 //BA.debugLineNum = 151650350;BA.debugLine="Dim ParentName As String = DBStructures.GetScript";
_parentname = mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select title_import from dta_objects where 1=1\n"+"																	and tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objectparent))+"'"),"title_import");
RDebugUtils.currentLine=151650353;
 //BA.debugLineNum = 151650353;BA.debugLine="If Utils.NNE(ParentName) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_parentname)) { 
RDebugUtils.currentLine=151650354;
 //BA.debugLineNum = 151650354;BA.debugLine="ListItemParent.Text = ParentName";
mostCurrent._listitemparent.setText(BA.ObjectToCharSequence(_parentname));
 }else {
RDebugUtils.currentLine=151650356;
 //BA.debugLineNum = 151650356;BA.debugLine="ListItemParent.Text = \"\"";
mostCurrent._listitemparent.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=151650362;
 //BA.debugLineNum = 151650362;BA.debugLine="ListItemStatus.Text = status_desc";
mostCurrent._listitemstatus.setText(BA.ObjectToCharSequence(_status_desc));
RDebugUtils.currentLine=151650363;
 //BA.debugLineNum = 151650363;BA.debugLine="If (address2 <> \"\") Then address2 = $\"${CRLF}${ad";
if (((_address2).equals("") == false)) { 
_address2 = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_address2))+",");};
RDebugUtils.currentLine=151650364;
 //BA.debugLineNum = 151650364;BA.debugLine="Dim ThisAddress As String = $\"${address},${addres";
_thisaddress = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_address))+","+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_address2))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_postal_code))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_city))+"");
RDebugUtils.currentLine=151650365;
 //BA.debugLineNum = 151650365;BA.debugLine="ListItemLocation.text = ThisAddress";
mostCurrent._listitemlocation.setText(BA.ObjectToCharSequence(_thisaddress));
RDebugUtils.currentLine=151650367;
 //BA.debugLineNum = 151650367;BA.debugLine="ListItemType.Text = typedesc";
mostCurrent._listitemtype.setText(BA.ObjectToCharSequence(_typedesc));
RDebugUtils.currentLine=151650369;
 //BA.debugLineNum = 151650369;BA.debugLine="ListItemReference.text = tagcode";
mostCurrent._listitemreference.setText(BA.ObjectToCharSequence(_tagcode));
RDebugUtils.currentLine=151650370;
 //BA.debugLineNum = 151650370;BA.debugLine="ListItemReference.tag = tagcode";
mostCurrent._listitemreference.setTag((Object)(_tagcode));
RDebugUtils.currentLine=151650374;
 //BA.debugLineNum = 151650374;BA.debugLine="If (status_id = 0) Then";
if ((_status_id==0)) { 
RDebugUtils.currentLine=151650375;
 //BA.debugLineNum = 151650375;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorGr";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorgray /*int*/ );
RDebugUtils.currentLine=151650376;
 //BA.debugLineNum = 151650376;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF088)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf088))));
 }else {
RDebugUtils.currentLine=151650378;
 //BA.debugLineNum = 151650378;BA.debugLine="If (req.IndexOf(tagcode) >= 0) Then";
if ((_req.IndexOf((Object)(_tagcode))>=0)) { 
RDebugUtils.currentLine=151650379;
 //BA.debugLineNum = 151650379;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorG";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=151650380;
 //BA.debugLineNum = 151650380;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF017)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf017))));
 }else {
RDebugUtils.currentLine=151650382;
 //BA.debugLineNum = 151650382;BA.debugLine="If (nreq.IndexOf(tagcode) >= 0) Then";
if ((_nreq.IndexOf((Object)(_tagcode))>=0)) { 
RDebugUtils.currentLine=151650383;
 //BA.debugLineNum = 151650383;BA.debugLine="ListItemTodayRequests.TextColor = Consts.Color";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorblue /*int*/ );
RDebugUtils.currentLine=151650384;
 //BA.debugLineNum = 151650384;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF073)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf073))));
 }else {
RDebugUtils.currentLine=151650386;
 //BA.debugLineNum = 151650386;BA.debugLine="ListItemTodayRequests.Visible = False";
mostCurrent._listitemtodayrequests.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
 };
RDebugUtils.currentLine=151650391;
 //BA.debugLineNum = 151650391;BA.debugLine="If Not(Utils.isNullOrEmpty(latitude)) And Not(Uti";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_latitude)) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_longitude))) { 
RDebugUtils.currentLine=151650392;
 //BA.debugLineNum = 151650392;BA.debugLine="listButMap.Tag = $\"${latitude}|${longitude}\"$";
mostCurrent._listbutmap.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_latitude))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_longitude))+"")));
 }else {
RDebugUtils.currentLine=151650394;
 //BA.debugLineNum = 151650394;BA.debugLine="listButMap.TextColor = Consts.ColorLightSilver";
mostCurrent._listbutmap.setTextColor(mostCurrent._consts._colorlightsilver /*int*/ );
 };
RDebugUtils.currentLine=151650396;
 //BA.debugLineNum = 151650396;BA.debugLine="listButRequest.Tag = tagcode";
mostCurrent._listbutrequest.setTag((Object)(_tagcode));
RDebugUtils.currentLine=151650397;
 //BA.debugLineNum = 151650397;BA.debugLine="listButSelect.Tag = $\"${tagcode}|0\"$";
mostCurrent._listbutselect.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"|0")));
RDebugUtils.currentLine=151650398;
 //BA.debugLineNum = 151650398;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=151650399;
 //BA.debugLineNum = 151650399;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=151650400;
 //BA.debugLineNum = 151650400;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistitemmap(String _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height,anywheresoftware.b4a.objects.collections.List _req,anywheresoftware.b4a.objects.collections.List _nreq) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistitemmap", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistitemmap", new Object[] {_cnt,_colitems,_width,_height,_req,_nreq}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _status_id = 0;
String _tagcode = "";
String _name = "";
String _typedesc = "";
String _latitude = "";
String _longitude = "";
RDebugUtils.currentLine=151715840;
 //BA.debugLineNum = 151715840;BA.debugLine="Sub CreateListItemMap(cnt As String, colitems As C";
RDebugUtils.currentLine=151715841;
 //BA.debugLineNum = 151715841;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=151715842;
 //BA.debugLineNum = 151715842;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=151715843;
 //BA.debugLineNum = 151715843;BA.debugLine="Activity.AddView(p, 0, 0, Width, Height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=151715844;
 //BA.debugLineNum = 151715844;BA.debugLine="p.LoadLayout(\"Objects_itemMapView\")";
_p.LoadLayout("Objects_itemMapView",mostCurrent.activityBA);
RDebugUtils.currentLine=151715845;
 //BA.debugLineNum = 151715845;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=151715846;
 //BA.debugLineNum = 151715846;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"status_id";
_status_id = _colitems.GetInt("status_id");
RDebugUtils.currentLine=151715847;
 //BA.debugLineNum = 151715847;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=151715848;
 //BA.debugLineNum = 151715848;BA.debugLine="Dim name As String = colitems.GetString(\"name\")";
_name = _colitems.GetString("name");
RDebugUtils.currentLine=151715849;
 //BA.debugLineNum = 151715849;BA.debugLine="Dim typedesc As String = colitems.GetString(\"type";
_typedesc = _colitems.GetString("typedesc");
RDebugUtils.currentLine=151715850;
 //BA.debugLineNum = 151715850;BA.debugLine="Dim latitude As String = colitems.GetString(\"lati";
_latitude = _colitems.GetString("latitude");
RDebugUtils.currentLine=151715851;
 //BA.debugLineNum = 151715851;BA.debugLine="Dim longitude As String = colitems.GetString(\"lon";
_longitude = _colitems.GetString("longitude");
RDebugUtils.currentLine=151715852;
 //BA.debugLineNum = 151715852;BA.debugLine="ListItemFullName.text = $\"${cnt} - ${name}\"$";
mostCurrent._listitemfullname.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_name))+"")));
RDebugUtils.currentLine=151715853;
 //BA.debugLineNum = 151715853;BA.debugLine="ListItemFullName.Tag = $\"${latitude}|${longitude}";
mostCurrent._listitemfullname.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_latitude))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_longitude))+"")));
RDebugUtils.currentLine=151715854;
 //BA.debugLineNum = 151715854;BA.debugLine="ListItemType.Text = typedesc";
mostCurrent._listitemtype.setText(BA.ObjectToCharSequence(_typedesc));
RDebugUtils.currentLine=151715855;
 //BA.debugLineNum = 151715855;BA.debugLine="ListItemTodayRequests.Tag = status_id";
mostCurrent._listitemtodayrequests.setTag((Object)(_status_id));
RDebugUtils.currentLine=151715857;
 //BA.debugLineNum = 151715857;BA.debugLine="If (status_id = 0) Then";
if ((_status_id==0)) { 
RDebugUtils.currentLine=151715858;
 //BA.debugLineNum = 151715858;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorGr";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorgray /*int*/ );
RDebugUtils.currentLine=151715859;
 //BA.debugLineNum = 151715859;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF088)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf088))));
 }else {
RDebugUtils.currentLine=151715861;
 //BA.debugLineNum = 151715861;BA.debugLine="If (req.IndexOf(tagcode) >= 0) Then";
if ((_req.IndexOf((Object)(_tagcode))>=0)) { 
RDebugUtils.currentLine=151715862;
 //BA.debugLineNum = 151715862;BA.debugLine="ListItemTodayRequests.TextColor = Consts.ColorG";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
RDebugUtils.currentLine=151715863;
 //BA.debugLineNum = 151715863;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF017)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf017))));
 }else {
RDebugUtils.currentLine=151715865;
 //BA.debugLineNum = 151715865;BA.debugLine="If (nreq.IndexOf(tagcode) >= 0) Then";
if ((_nreq.IndexOf((Object)(_tagcode))>=0)) { 
RDebugUtils.currentLine=151715866;
 //BA.debugLineNum = 151715866;BA.debugLine="ListItemTodayRequests.TextColor = Consts.Color";
mostCurrent._listitemtodayrequests.setTextColor(mostCurrent._consts._colorblue /*int*/ );
RDebugUtils.currentLine=151715867;
 //BA.debugLineNum = 151715867;BA.debugLine="ListItemTodayRequests.Text = Chr(0xF073)";
mostCurrent._listitemtodayrequests.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf073))));
 }else {
RDebugUtils.currentLine=151715869;
 //BA.debugLineNum = 151715869;BA.debugLine="ListItemTodayRequests.Visible = False";
mostCurrent._listitemtodayrequests.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 };
 };
RDebugUtils.currentLine=151715874;
 //BA.debugLineNum = 151715874;BA.debugLine="If Not(Utils.isNullOrEmpty(latitude)) And Not(Uti";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_latitude)) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_longitude))) { 
RDebugUtils.currentLine=151715875;
 //BA.debugLineNum = 151715875;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=151715876;
 //BA.debugLineNum = 151715876;BA.debugLine="Try";
try {RDebugUtils.currentLine=151715877;
 //BA.debugLineNum = 151715877;BA.debugLine="mapMarker = gmap.AddMarker(latitude, longitude";
mostCurrent._mapmarker = mostCurrent._gmap.AddMarker((double)(Double.parseDouble(_latitude)),(double)(Double.parseDouble(_longitude)),_name);
RDebugUtils.currentLine=151715878;
 //BA.debugLineNum = 151715878;BA.debugLine="Markers.Add( mapMarker )";
_markers.Add((Object)(mostCurrent._mapmarker.getObject()));
 } 
       catch (Exception e38) {
			processBA.setLastException(e38);RDebugUtils.currentLine=151715880;
 //BA.debugLineNum = 151715880;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6151715880",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=151715881;
 //BA.debugLineNum = 151715881;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
 };
 };
RDebugUtils.currentLine=151715886;
 //BA.debugLineNum = 151715886;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=151715887;
 //BA.debugLineNum = 151715887;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=151715888;
 //BA.debugLineNum = 151715888;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deleteprerequestsfromlocaldb() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deleteprerequestsfromlocaldb", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "deleteprerequestsfromlocaldb", null));}
ResumableSub_DeletePreRequestsFromLocalDB rsub = new ResumableSub_DeletePreRequestsFromLocalDB(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeletePreRequestsFromLocalDB extends BA.ResumableSub {
public ResumableSub_DeletePreRequestsFromLocalDB(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;
boolean _continuar = false;
String _sqlremove = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _record = null;
boolean _continuarloc = false;
String _sqllocremove = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordloc = null;
String _tgcode = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _completed = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=154533889;
 //BA.debugLineNum = 154533889;BA.debugLine="Dim Continuar As Boolean = True";
_continuar = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=154533890;
 //BA.debugLineNum = 154533890;BA.debugLine="Dim SqlRemove As String = \"SELECT * FROM dta_requ";
_sqlremove = "SELECT * FROM dta_requests AS a where a.state_id>=1 and a.state_id < 4";
RDebugUtils.currentLine=154533891;
 //BA.debugLineNum = 154533891;BA.debugLine="Try";
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
RDebugUtils.currentLine=154533892;
 //BA.debugLineNum = 154533892;BA.debugLine="Dim Record As ResultSet = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_record = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqlremove)));
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=154533895;
 //BA.debugLineNum = 154533895;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154533895",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154533896;
 //BA.debugLineNum = 154533896;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=154533897;
 //BA.debugLineNum = 154533897;BA.debugLine="Continuar = False";
_continuar = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=154533900;
 //BA.debugLineNum = 154533900;BA.debugLine="If (Continuar) Then";

case 6:
//if
this.state = 26;
this.catchState = 0;
if ((_continuar)) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=154533902;
 //BA.debugLineNum = 154533902;BA.debugLine="Dim ContinuarLoc As Boolean = True";
_continuarloc = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=154533903;
 //BA.debugLineNum = 154533903;BA.debugLine="Dim SqlLocRemove As String = \"SELECT * FROM dta_";
_sqllocremove = "SELECT * FROM dta_locations AS a where a.tagcode in (SELECT local_tagcode FROM dta_requests AS a where a.state_id>=1 and a.state_id < 4)";
RDebugUtils.currentLine=154533904;
 //BA.debugLineNum = 154533904;BA.debugLine="Try";
if (true) break;

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
RDebugUtils.currentLine=154533905;
 //BA.debugLineNum = 154533905;BA.debugLine="Dim RecordLOC As ResultSet = Starter.LocalSQLEV";
_recordloc = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordloc = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sqllocremove)));
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=154533907;
 //BA.debugLineNum = 154533907;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6154533907",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=154533908;
 //BA.debugLineNum = 154533908;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=154533909;
 //BA.debugLineNum = 154533909;BA.debugLine="ContinuarLoc = False";
_continuarloc = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=154533911;
 //BA.debugLineNum = 154533911;BA.debugLine="If (ContinuarLoc) Then";

case 14:
//if
this.state = 21;
this.catchState = 0;
if ((_continuarloc)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=154533912;
 //BA.debugLineNum = 154533912;BA.debugLine="Dim TgCode As String = \"\"";
_tgcode = "";
RDebugUtils.currentLine=154533913;
 //BA.debugLineNum = 154533913;BA.debugLine="Do While RecordLOC.NextRow";
if (true) break;

case 17:
//do while
this.state = 20;
while (_recordloc.NextRow()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 17;
RDebugUtils.currentLine=154533914;
 //BA.debugLineNum = 154533914;BA.debugLine="Dim TgCode As String = Utils.FieldResultSet2SQ";
_tgcode = parent.mostCurrent._utils._fieldresultset2sqlarray /*String*/ (mostCurrent.activityBA,_recordloc,"tagcode");
RDebugUtils.currentLine=154533915;
 //BA.debugLineNum = 154533915;BA.debugLine="Exit";
this.state = 20;
if (true) break;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=154533917;
 //BA.debugLineNum = 154533917;BA.debugLine="RecordLOC.Close";
_recordloc.Close();
RDebugUtils.currentLine=154533919;
 //BA.debugLineNum = 154533919;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRe";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtablebulk /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,"dta_locations","tagcode",_tgcode);
RDebugUtils.currentLine=154533920;
 //BA.debugLineNum = 154533920;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 27;
return;
case 27:
//C
this.state = 21;
_completed = (Boolean) result[0];
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=154533923;
 //BA.debugLineNum = 154533923;BA.debugLine="Dim TgCode As String = \"\"";
_tgcode = "";
RDebugUtils.currentLine=154533924;
 //BA.debugLineNum = 154533924;BA.debugLine="Do While Record.NextRow";
if (true) break;

case 22:
//do while
this.state = 25;
while (_record.NextRow()) {
this.state = 24;
if (true) break;
}
if (true) break;

case 24:
//C
this.state = 22;
RDebugUtils.currentLine=154533925;
 //BA.debugLineNum = 154533925;BA.debugLine="Dim TgCode As String = Utils.FieldResultSet2SQL";
_tgcode = parent.mostCurrent._utils._fieldresultset2sqlarray /*String*/ (mostCurrent.activityBA,_record,"tagcode");
RDebugUtils.currentLine=154533926;
 //BA.debugLineNum = 154533926;BA.debugLine="Exit";
this.state = 25;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=154533928;
 //BA.debugLineNum = 154533928;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=154533930;
 //BA.debugLineNum = 154533930;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtablebulk /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,"dta_requests","tagcode",_tgcode);
RDebugUtils.currentLine=154533931;
 //BA.debugLineNum = 154533931;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 28;
return;
case 28:
//C
this.state = 26;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=154533933;
 //BA.debugLineNum = 154533933;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtablebulk /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,"dta_requests_adds","request_tagcode",_tgcode);
RDebugUtils.currentLine=154533934;
 //BA.debugLineNum = 154533934;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 29;
return;
case 29:
//C
this.state = 26;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=154533936;
 //BA.debugLineNum = 154533936;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtablebulk /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,"dta_requests_fields","request_tagcode",_tgcode);
RDebugUtils.currentLine=154533937;
 //BA.debugLineNum = 154533937;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 30;
return;
case 30:
//C
this.state = 26;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=154533939;
 //BA.debugLineNum = 154533939;BA.debugLine="Dim res As ResumableSub = DBStructures.RemoveRec";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtablebulk /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,"dta_requests_relations","request_tagcode",_tgcode);
RDebugUtils.currentLine=154533940;
 //BA.debugLineNum = 154533940;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "deleteprerequestsfromlocaldb"), _res);
this.state = 31;
return;
case 31:
//C
this.state = 26;
_completed = (Boolean) result[0];
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=154533943;
 //BA.debugLineNum = 154533943;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=154533945;
 //BA.debugLineNum = 154533945;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendserverprocesscomplete(boolean _debug,String _filename) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendserverprocesscomplete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sendserverprocesscomplete", new Object[] {_debug,_filename}));}
ResumableSub_SendServerProcessComplete rsub = new ResumableSub_SendServerProcessComplete(null,_debug,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendServerProcessComplete extends BA.ResumableSub {
public ResumableSub_SendServerProcessComplete(xevolution.vrcg.devdemov2400.objects parent,boolean _debug,String _filename) {
this.parent = parent;
this._debug = _debug;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.objects parent;
boolean _debug;
String _filename;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=154796033;
 //BA.debugLineNum = 154796033;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/removeFilesSqlite");
RDebugUtils.currentLine=154796034;
 //BA.debugLineNum = 154796034;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=154796035;
 //BA.debugLineNum = 154796035;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",objects.getObject());
RDebugUtils.currentLine=154796036;
 //BA.debugLineNum = 154796036;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=154796037;
 //BA.debugLineNum = 154796037;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=154796038;
 //BA.debugLineNum = 154796038;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=154796039;
 //BA.debugLineNum = 154796039;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=154796040;
 //BA.debugLineNum = 154796040;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=154796041;
 //BA.debugLineNum = 154796041;BA.debugLine="params.Put(\"debug\", Utils.Bool2Int(debug))";
_params.Put((Object)("debug"),(Object)(parent.mostCurrent._utils._bool2int /*int*/ (mostCurrent.activityBA,_debug)));
RDebugUtils.currentLine=154796042;
 //BA.debugLineNum = 154796042;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=154796043;
 //BA.debugLineNum = 154796043;BA.debugLine="params.Put(\"name\", filename)";
_params.Put((Object)("name"),(Object)(_filename));
RDebugUtils.currentLine=154796044;
 //BA.debugLineNum = 154796044;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=154796045;
 //BA.debugLineNum = 154796045;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=154796046;
 //BA.debugLineNum = 154796046;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=154796047;
 //BA.debugLineNum = 154796047;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=154796048;
 //BA.debugLineNum = 154796048;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=154796049;
 //BA.debugLineNum = 154796049;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=154796051;
 //BA.debugLineNum = 154796051;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=154796052;
 //BA.debugLineNum = 154796052;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=154796054;
 //BA.debugLineNum = 154796054;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=154796056;
 //BA.debugLineNum = 154796056;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=154796057;
 //BA.debugLineNum = 154796057;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=154796059;
 //BA.debugLineNum = 154796059;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "sendserverprocesscomplete"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=154796060;
 //BA.debugLineNum = 154796060;BA.debugLine="If Job.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_job._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=154796061;
 //BA.debugLineNum = 154796061;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=154796062;
 //BA.debugLineNum = 154796062;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=154796064;
 //BA.debugLineNum = 154796064;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=154796066;
 //BA.debugLineNum = 154796066;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=154796067;
 //BA.debugLineNum = 154796067;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=154796068;
 //BA.debugLineNum = 154796068;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createprerequestlistitem(int _cnt,anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,int _width,int _height) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createprerequestlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createprerequestlistitem", new Object[] {_cnt,_colitems,_width,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _request_desc = "";
String _nameobject = "";
String _tagcode = "";
String _reqaddress = "";
String _reqpostal_code = "";
String _reqcity = "";
String _request_date = "";
String _request_stime = "";
String _inforeq = "";
String _infotext = "";
RDebugUtils.currentLine=154861568;
 //BA.debugLineNum = 154861568;BA.debugLine="Sub CreatePreRequestListItem(cnt As Int, colitems";
RDebugUtils.currentLine=154861570;
 //BA.debugLineNum = 154861570;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=154861571;
 //BA.debugLineNum = 154861571;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=154861573;
 //BA.debugLineNum = 154861573;BA.debugLine="If ShareCode.ISPHONE Then";
if (mostCurrent._sharecode._isphone /*boolean*/ ) { 
RDebugUtils.currentLine=154861574;
 //BA.debugLineNum = 154861574;BA.debugLine="p.Height =  100%y";
_p.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=154861575;
 //BA.debugLineNum = 154861575;BA.debugLine="p.Width =  100%x";
_p.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=154861577;
 //BA.debugLineNum = 154861577;BA.debugLine="p.Height = Height";
_p.setHeight(_height);
RDebugUtils.currentLine=154861578;
 //BA.debugLineNum = 154861578;BA.debugLine="p.Width = Width";
_p.setWidth(_width);
 };
RDebugUtils.currentLine=154861581;
 //BA.debugLineNum = 154861581;BA.debugLine="p.LoadLayout(\"taskListPreRequest\")";
_p.LoadLayout("taskListPreRequest",mostCurrent.activityBA);
RDebugUtils.currentLine=154861582;
 //BA.debugLineNum = 154861582;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=154861596;
 //BA.debugLineNum = 154861596;BA.debugLine="Dim request_desc As String = colitems.GetString(\"";
_request_desc = _colitems.GetString("request_desc");
RDebugUtils.currentLine=154861597;
 //BA.debugLineNum = 154861597;BA.debugLine="Dim nameobject As String = colitems.GetString(\"na";
_nameobject = _colitems.GetString("nameobject");
RDebugUtils.currentLine=154861598;
 //BA.debugLineNum = 154861598;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=154861600;
 //BA.debugLineNum = 154861600;BA.debugLine="Dim reqaddress As String = colitems.GetString(\"re";
_reqaddress = _colitems.GetString("reqaddress");
RDebugUtils.currentLine=154861601;
 //BA.debugLineNum = 154861601;BA.debugLine="Dim reqpostal_code As String = colitems.GetString";
_reqpostal_code = _colitems.GetString("reqpostal_code");
RDebugUtils.currentLine=154861602;
 //BA.debugLineNum = 154861602;BA.debugLine="Dim reqcity As String = colitems.GetString(\"reqci";
_reqcity = _colitems.GetString("reqcity");
RDebugUtils.currentLine=154861603;
 //BA.debugLineNum = 154861603;BA.debugLine="Dim request_date As String = colitems.GetString(\"";
_request_date = _colitems.GetString("request_date");
RDebugUtils.currentLine=154861604;
 //BA.debugLineNum = 154861604;BA.debugLine="Dim request_stime As String = colitems.GetString(";
_request_stime = _colitems.GetString("request_stime");
RDebugUtils.currentLine=154861607;
 //BA.debugLineNum = 154861607;BA.debugLine="Dim InfoReq As String = $\"${request_desc}\"$";
_inforeq = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_desc))+"");
RDebugUtils.currentLine=154861608;
 //BA.debugLineNum = 154861608;BA.debugLine="If Utils.NNE(request_date) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_request_date)) { 
RDebugUtils.currentLine=154861609;
 //BA.debugLineNum = 154861609;BA.debugLine="If Utils.NNE(InfoReq) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_inforeq)) { 
RDebugUtils.currentLine=154861610;
 //BA.debugLineNum = 154861610;BA.debugLine="InfoReq = $\"${InfoReq}  (${request_date})\"$";
_inforeq = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_inforeq))+"  ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_date))+")");
 }else {
RDebugUtils.currentLine=154861612;
 //BA.debugLineNum = 154861612;BA.debugLine="InfoReq = $\"(${request_date})\"$";
_inforeq = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_date))+")");
 };
 };
RDebugUtils.currentLine=154861615;
 //BA.debugLineNum = 154861615;BA.debugLine="If Utils.NNE(request_stime) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_request_stime)) { 
RDebugUtils.currentLine=154861616;
 //BA.debugLineNum = 154861616;BA.debugLine="If Utils.NNE(InfoReq) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_inforeq)) { 
RDebugUtils.currentLine=154861617;
 //BA.debugLineNum = 154861617;BA.debugLine="InfoReq = $\"${InfoReq}  (${request_stime})\"$";
_inforeq = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_inforeq))+"  ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_stime))+")");
 }else {
RDebugUtils.currentLine=154861619;
 //BA.debugLineNum = 154861619;BA.debugLine="InfoReq = $\"(${request_stime})\"$";
_inforeq = ("("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_stime))+")");
 };
 };
RDebugUtils.currentLine=154861624;
 //BA.debugLineNum = 154861624;BA.debugLine="Dim InfoText As String = $\"${nameobject}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nameobject))+"");
RDebugUtils.currentLine=154861626;
 //BA.debugLineNum = 154861626;BA.debugLine="If Utils.NNE(reqaddress) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_reqaddress)) { 
RDebugUtils.currentLine=154861627;
 //BA.debugLineNum = 154861627;BA.debugLine="If Utils.NNE(InfoText) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_infotext)) { 
RDebugUtils.currentLine=154861628;
 //BA.debugLineNum = 154861628;BA.debugLine="InfoText = $\"${InfoText}, ${reqaddress}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_infotext))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqaddress))+"");
 }else {
RDebugUtils.currentLine=154861630;
 //BA.debugLineNum = 154861630;BA.debugLine="InfoText = $\"${reqaddress}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqaddress))+"");
 };
 };
RDebugUtils.currentLine=154861634;
 //BA.debugLineNum = 154861634;BA.debugLine="If Utils.NNE(reqpostal_code) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_reqpostal_code)) { 
RDebugUtils.currentLine=154861635;
 //BA.debugLineNum = 154861635;BA.debugLine="If Utils.NNE(InfoText) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_infotext)) { 
RDebugUtils.currentLine=154861636;
 //BA.debugLineNum = 154861636;BA.debugLine="InfoText = $\"${InfoText}, ${reqpostal_code}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_infotext))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqpostal_code))+"");
 }else {
RDebugUtils.currentLine=154861638;
 //BA.debugLineNum = 154861638;BA.debugLine="InfoText = $\"${reqpostal_code}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqpostal_code))+"");
 };
 };
RDebugUtils.currentLine=154861642;
 //BA.debugLineNum = 154861642;BA.debugLine="If Utils.NNE(reqcity) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_reqcity)) { 
RDebugUtils.currentLine=154861643;
 //BA.debugLineNum = 154861643;BA.debugLine="If Utils.NNE(InfoText) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_infotext)) { 
RDebugUtils.currentLine=154861644;
 //BA.debugLineNum = 154861644;BA.debugLine="InfoText = $\"${InfoText}, ${reqcity}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_infotext))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcity))+"");
 }else {
RDebugUtils.currentLine=154861646;
 //BA.debugLineNum = 154861646;BA.debugLine="InfoText = $\"${reqcity}\"$";
_infotext = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqcity))+"");
 };
 };
RDebugUtils.currentLine=154861650;
 //BA.debugLineNum = 154861650;BA.debugLine="ListItemRequestDesc.text = $\"${InfoReq}\"$";
mostCurrent._listitemrequestdesc.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_inforeq))+"")));
RDebugUtils.currentLine=154861651;
 //BA.debugLineNum = 154861651;BA.debugLine="ListItemRequestDesc.Tag = tagcode";
mostCurrent._listitemrequestdesc.setTag((Object)(_tagcode));
RDebugUtils.currentLine=154861652;
 //BA.debugLineNum = 154861652;BA.debugLine="ListItemRequestObject.text = $\"${InfoText}\"$";
mostCurrent._listitemrequestobject.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_infotext))+"")));
RDebugUtils.currentLine=154861653;
 //BA.debugLineNum = 154861653;BA.debugLine="ListItemRequestObject.Tag = tagcode";
mostCurrent._listitemrequestobject.setTag((Object)(_tagcode));
RDebugUtils.currentLine=154861654;
 //BA.debugLineNum = 154861654;BA.debugLine="listButPreRequestDownload.Tag = tagcode";
mostCurrent._listbutprerequestdownload.setTag((Object)(_tagcode));
RDebugUtils.currentLine=154861655;
 //BA.debugLineNum = 154861655;BA.debugLine="listButPreRequestView.Tag = tagcode";
mostCurrent._listbutprerequestview.setTag((Object)(_tagcode));
RDebugUtils.currentLine=154861656;
 //BA.debugLineNum = 154861656;BA.debugLine="listButPreSelect.Tag = tagcode";
mostCurrent._listbutpreselect.setTag((Object)(_tagcode));
RDebugUtils.currentLine=154861659;
 //BA.debugLineNum = 154861659;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=154861660;
 //BA.debugLineNum = 154861660;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=154861661;
 //BA.debugLineNum = 154861661;BA.debugLine="End Sub";
return null;
}
public static String  _setallprereqselect(boolean _selectstate) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setallprereqselect", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setallprereqselect", new Object[] {_selectstate}));}
int _inx = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=157155328;
 //BA.debugLineNum = 157155328;BA.debugLine="Sub SetAllPreReqSelect(SelectState As Boolean)";
RDebugUtils.currentLine=157155329;
 //BA.debugLineNum = 157155329;BA.debugLine="If SelectState = True Then";
if (_selectstate==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=157155330;
 //BA.debugLineNum = 157155330;BA.debugLine="For inx=0 To listRequests.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._listrequests._getsize()-1);
_inx = (int) (0) ;
for (;_inx <= limit2 ;_inx = _inx + step2 ) {
RDebugUtils.currentLine=157155331;
 //BA.debugLineNum = 157155331;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=157155332;
 //BA.debugLineNum = 157155332;BA.debugLine="p = listRequests.GetPanel(inx)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listrequests._getpanel(_inx).getObject()));
RDebugUtils.currentLine=157155333;
 //BA.debugLineNum = 157155333;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=157155334;
 //BA.debugLineNum = 157155334;BA.debugLine="b = p.GetView(0)";
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=157155335;
 //BA.debugLineNum = 157155335;BA.debugLine="b.Text = Chr(0xF046)";
_b.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))));
 }
};
 }else {
RDebugUtils.currentLine=157155338;
 //BA.debugLineNum = 157155338;BA.debugLine="For inx=0 To listRequests.Size -1";
{
final int step10 = 1;
final int limit10 = (int) (mostCurrent._listrequests._getsize()-1);
_inx = (int) (0) ;
for (;_inx <= limit10 ;_inx = _inx + step10 ) {
RDebugUtils.currentLine=157155339;
 //BA.debugLineNum = 157155339;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=157155340;
 //BA.debugLineNum = 157155340;BA.debugLine="p = listRequests.GetPanel(inx)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listrequests._getpanel(_inx).getObject()));
RDebugUtils.currentLine=157155341;
 //BA.debugLineNum = 157155341;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=157155342;
 //BA.debugLineNum = 157155342;BA.debugLine="b = p.GetView(0)";
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=157155343;
 //BA.debugLineNum = 157155343;BA.debugLine="b.Text = Chr(0xF096)";
_b.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf096))));
 }
};
 };
RDebugUtils.currentLine=157155348;
 //BA.debugLineNum = 157155348;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createrequestentityrelation(String _newrequest,String _newobject) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestentityrelation", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestentityrelation", new Object[] {_newrequest,_newobject}));}
ResumableSub_createRequestEntityRelation rsub = new ResumableSub_createRequestEntityRelation(null,_newrequest,_newobject);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_createRequestEntityRelation extends BA.ResumableSub {
public ResumableSub_createRequestEntityRelation(xevolution.vrcg.devdemov2400.objects parent,String _newrequest,String _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
xevolution.vrcg.devdemov2400.objects parent;
String _newrequest;
String _newobject;
int _maxid = 0;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156041217;
 //BA.debugLineNum = 156041217;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
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
RDebugUtils.currentLine=156041218;
 //BA.debugLineNum = 156041218;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_entities","id","")+1+1000000);
RDebugUtils.currentLine=156041219;
 //BA.debugLineNum = 156041219;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_entities (id, request_tagcode, entity_tagcode, ismaster)\n"+"								values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newobject))+"', 1);");
RDebugUtils.currentLine=156041221;
 //BA.debugLineNum = 156041221;BA.debugLine="Utils.SaveSQLToLog(\"createRequestEntityRelation\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"createRequestEntityRelation",_ssql,_newrequest);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=156041223;
 //BA.debugLineNum = 156041223;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=156041224;
 //BA.debugLineNum = 156041224;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createrequestfields(String _newrequest,String _newrequesttype) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestfields", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestfields", new Object[] {_newrequest,_newrequesttype}));}
ResumableSub_createRequestFields rsub = new ResumableSub_createRequestFields(null,_newrequest,_newrequesttype);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_createRequestFields extends BA.ResumableSub {
public ResumableSub_createRequestFields(xevolution.vrcg.devdemov2400.objects parent,String _newrequest,String _newrequesttype) {
this.parent = parent;
this._newrequest = _newrequest;
this._newrequesttype = _newrequesttype;
}
xevolution.vrcg.devdemov2400.objects parent;
String _newrequest;
String _newrequesttype;
String _sql1 = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _resdata = null;
String _sfield = "";
int _maxid = 0;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=155910145;
 //BA.debugLineNum = 155910145;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newReques";
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
RDebugUtils.currentLine=155910146;
 //BA.debugLineNum = 155910146;BA.debugLine="Dim SQL1 As String = $\"select distinct field_tag";
_sql1 = ("select distinct field_tagcode from dta_typerequests_fields\n"+"								where typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequesttype))+"'");
RDebugUtils.currentLine=155910149;
 //BA.debugLineNum = 155910149;BA.debugLine="Dim ResData As ResultSet = Starter.LocalSQLEVC.E";
_resdata = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_resdata = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql1)));
RDebugUtils.currentLine=155910150;
 //BA.debugLineNum = 155910150;BA.debugLine="Do While ResData.NextRow";
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
RDebugUtils.currentLine=155910151;
 //BA.debugLineNum = 155910151;BA.debugLine="Dim sfield As String = ResData.GetString(\"field";
_sfield = _resdata.GetString("field_tagcode");
RDebugUtils.currentLine=155910152;
 //BA.debugLineNum = 155910152;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dt";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_fields","id","")+1+1000000);
RDebugUtils.currentLine=155910153;
 //BA.debugLineNum = 155910153;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests";
_ssql = ("insert into dta_requests_fields (id, request_tagcode, field_tagcode)\n"+"								values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sfield))+"');");
RDebugUtils.currentLine=155910155;
 //BA.debugLineNum = 155910155;BA.debugLine="Utils.SaveSQLToLog(\"createRequestFields\",sSQL,";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"createRequestFields",_ssql,_newrequest);
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=155910157;
 //BA.debugLineNum = 155910157;BA.debugLine="ResData.Close";
_resdata.Close();
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=155910160;
 //BA.debugLineNum = 155910160;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=155910161;
 //BA.debugLineNum = 155910161;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createrequestlistitem(int _cnt,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _colitems,int _width,int _height,String _theobject) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestlistitem", new Object[] {_cnt,_colitems,_width,_height,_theobject}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _title = "";
int _status_id = 0;
String _dayslastupdate = "";
RDebugUtils.currentLine=155320320;
 //BA.debugLineNum = 155320320;BA.debugLine="Sub CreateRequestListItem(cnt As Int, colitems As";
RDebugUtils.currentLine=155320322;
 //BA.debugLineNum = 155320322;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=155320323;
 //BA.debugLineNum = 155320323;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=155320325;
 //BA.debugLineNum = 155320325;BA.debugLine="p.Height = Height";
_p.setHeight(_height);
RDebugUtils.currentLine=155320326;
 //BA.debugLineNum = 155320326;BA.debugLine="p.Width = Width";
_p.setWidth(_width);
RDebugUtils.currentLine=155320327;
 //BA.debugLineNum = 155320327;BA.debugLine="p.LoadLayout(\"taskListRequest\")";
_p.LoadLayout("taskListRequest",mostCurrent.activityBA);
RDebugUtils.currentLine=155320328;
 //BA.debugLineNum = 155320328;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=155320330;
 //BA.debugLineNum = 155320330;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=155320331;
 //BA.debugLineNum = 155320331;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
_title = _colitems.GetString("title");
RDebugUtils.currentLine=155320332;
 //BA.debugLineNum = 155320332;BA.debugLine="Dim status_id As Int = colitems.GetInt(\"active\")";
_status_id = _colitems.GetInt("active");
RDebugUtils.currentLine=155320333;
 //BA.debugLineNum = 155320333;BA.debugLine="Dim dayslastupdate As String = colitems.GetInt(\"d";
_dayslastupdate = BA.NumberToString(_colitems.GetInt("dayslastupdate"));
RDebugUtils.currentLine=155320335;
 //BA.debugLineNum = 155320335;BA.debugLine="ListItemDesc.text = $\"#${cnt} - ${title}\"$";
mostCurrent._listitemdesc.setText(BA.ObjectToCharSequence(("#"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cnt))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_title))+"")));
RDebugUtils.currentLine=155320336;
 //BA.debugLineNum = 155320336;BA.debugLine="ListItemDesc.Tag = tagcode";
mostCurrent._listitemdesc.setTag((Object)(_tagcode));
RDebugUtils.currentLine=155320338;
 //BA.debugLineNum = 155320338;BA.debugLine="If (status_id = 0) Then";
if ((_status_id==0)) { 
RDebugUtils.currentLine=155320339;
 //BA.debugLineNum = 155320339;BA.debugLine="ListItemState.TextColor = Consts.ColorGray";
mostCurrent._listitemstate.setTextColor(mostCurrent._consts._colorgray /*int*/ );
RDebugUtils.currentLine=155320340;
 //BA.debugLineNum = 155320340;BA.debugLine="ListItemState.Text = Chr(0xF088)";
mostCurrent._listitemstate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf088))));
 }else {
RDebugUtils.currentLine=155320342;
 //BA.debugLineNum = 155320342;BA.debugLine="ListItemState.Text = Chr(0xF087)";
mostCurrent._listitemstate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf087))));
RDebugUtils.currentLine=155320343;
 //BA.debugLineNum = 155320343;BA.debugLine="If (dayslastupdate >5) Then";
if (((double)(Double.parseDouble(_dayslastupdate))>5)) { 
RDebugUtils.currentLine=155320344;
 //BA.debugLineNum = 155320344;BA.debugLine="ListItemState.TextColor = Consts.ColorYellow";
mostCurrent._listitemstate.setTextColor(mostCurrent._consts._coloryellow /*int*/ );
 }else {
RDebugUtils.currentLine=155320346;
 //BA.debugLineNum = 155320346;BA.debugLine="ListItemState.TextColor = Consts.ColorGreen";
mostCurrent._listitemstate.setTextColor(mostCurrent._consts._colorgreen /*int*/ );
 };
 };
RDebugUtils.currentLine=155320350;
 //BA.debugLineNum = 155320350;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=155320351;
 //BA.debugLineNum = 155320351;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=155320352;
 //BA.debugLineNum = 155320352;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createrequestobjectrelation(String _newrequest,String _newobject) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequestobjectrelation", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "createrequestobjectrelation", new Object[] {_newrequest,_newobject}));}
ResumableSub_createRequestObjectRelation rsub = new ResumableSub_createRequestObjectRelation(null,_newrequest,_newobject);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_createRequestObjectRelation extends BA.ResumableSub {
public ResumableSub_createRequestObjectRelation(xevolution.vrcg.devdemov2400.objects parent,String _newrequest,String _newobject) {
this.parent = parent;
this._newrequest = _newrequest;
this._newobject = _newobject;
}
xevolution.vrcg.devdemov2400.objects parent;
String _newrequest;
String _newobject;
int _maxid = 0;
String _ssql = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=155975681;
 //BA.debugLineNum = 155975681;BA.debugLine="If (Utils.NNE(newRequest) And Utils.NNE(newObject";
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
RDebugUtils.currentLine=155975682;
 //BA.debugLineNum = 155975682;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_objects","id","")+1+1000000);
RDebugUtils.currentLine=155975683;
 //BA.debugLineNum = 155975683;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_objects (id, request_tagcode, object_tagcode, ismaster)\n"+"								values ('"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newobject))+"', 1);");
RDebugUtils.currentLine=155975685;
 //BA.debugLineNum = 155975685;BA.debugLine="Utils.SaveSQLToLog(\"createRequestObjectRelation\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"createRequestObjectRelation",_ssql,_newrequest);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=155975687;
 //BA.debugLineNum = 155975687;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=155975688;
 //BA.debugLineNum = 155975688;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _createrequeststoobjects(String _newrequesttype,String _strselchecklist,String _strselobject,boolean _runcl) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createrequeststoobjects", false))
	 {Debug.delegate(mostCurrent.activityBA, "createrequeststoobjects", new Object[] {_newrequesttype,_strselchecklist,_strselobject,_runcl}); return;}
ResumableSub_CreateRequestsToObjects rsub = new ResumableSub_CreateRequestsToObjects(null,_newrequesttype,_strselchecklist,_strselobject,_runcl);
rsub.resume(processBA, null);
}
public static class ResumableSub_CreateRequestsToObjects extends BA.ResumableSub {
public ResumableSub_CreateRequestsToObjects(xevolution.vrcg.devdemov2400.objects parent,String _newrequesttype,String _strselchecklist,String _strselobject,boolean _runcl) {
this.parent = parent;
this._newrequesttype = _newrequesttype;
this._strselchecklist = _strselchecklist;
this._strselobject = _strselobject;
this._runcl = _runcl;
}
xevolution.vrcg.devdemov2400.objects parent;
String _newrequesttype;
String _strselchecklist;
String _strselobject;
boolean _runcl;
anywheresoftware.b4a.objects.collections.Map _newrequestitem = null;
String _entity_tagcode = "";
String _newrequest = "";
String _newdate = "";
String _newtime = "";
anywheresoftware.b4a.objects.collections.Map _newexecution = null;
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
int _repeatcounter = 0;
int _maxid = 0;
String _ssql = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resfields = null;
boolean _resfieldsok = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa1 = null;
boolean _resfieldsok1 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa2 = null;
boolean _resfieldsok2 = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=155713537;
 //BA.debugLineNum = 155713537;BA.debugLine="ProgressDialogShow(ShareCode.objectMsgPrepararInt";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*String*/ ));
RDebugUtils.currentLine=155713538;
 //BA.debugLineNum = 155713538;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects"),(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=155713539;
 //BA.debugLineNum = 155713539;BA.debugLine="Dim newRequestItem As Map";
_newrequestitem = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155713540;
 //BA.debugLineNum = 155713540;BA.debugLine="newRequestItem.Initialize";
_newrequestitem.Initialize();
RDebugUtils.currentLine=155713542;
 //BA.debugLineNum = 155713542;BA.debugLine="Dim entity_tagcode As String = DBStructures.GetSc";
_entity_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select case when (parent_tagcode is null) or (parent_tagcode='') then tagcode else parent_tagcode end as valor\n"+"						from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strselobject.trim()))+"'"),"valor");
RDebugUtils.currentLine=155713544;
 //BA.debugLineNum = 155713544;BA.debugLine="If Utils.NE(entity_tagcode) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._utils._ne /*boolean*/ (mostCurrent.activityBA,_entity_tagcode)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=155713545;
 //BA.debugLineNum = 155713545;BA.debugLine="entity_tagcode = strSelObject.trim";
_entity_tagcode = _strselobject.trim();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=155713548;
 //BA.debugLineNum = 155713548;BA.debugLine="Dim newRequest As String = Utils.MakeRequestTagco";
_newrequest = parent.mostCurrent._utils._makerequesttagcode /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=155713549;
 //BA.debugLineNum = 155713549;BA.debugLine="Dim newDate As String = Utils.GetCurrentDate";
_newdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=155713550;
 //BA.debugLineNum = 155713550;BA.debugLine="Dim newTime As String = Utils.GetCurrentTimeExt";
_newtime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=155713552;
 //BA.debugLineNum = 155713552;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155713553;
 //BA.debugLineNum = 155713553;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=155713554;
 //BA.debugLineNum = 155713554;BA.debugLine="newExecution.Put(\"id\",0)";
_newexecution.Put((Object)("id"),(Object)(0));
RDebugUtils.currentLine=155713555;
 //BA.debugLineNum = 155713555;BA.debugLine="newExecution.Put(\"tagcode\", newRequest)";
_newexecution.Put((Object)("tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=155713556;
 //BA.debugLineNum = 155713556;BA.debugLine="newExecution.Put(\"route_tagcode\", \"ROUTE__NONE__\"";
_newexecution.Put((Object)("route_tagcode"),(Object)("ROUTE__NONE__"));
RDebugUtils.currentLine=155713557;
 //BA.debugLineNum = 155713557;BA.debugLine="newExecution.Put(\"is_child\", 0)";
_newexecution.Put((Object)("is_child"),(Object)(0));
RDebugUtils.currentLine=155713558;
 //BA.debugLineNum = 155713558;BA.debugLine="newExecution.Put(\"prerequest\", \"\")";
_newexecution.Put((Object)("prerequest"),(Object)(""));
RDebugUtils.currentLine=155713559;
 //BA.debugLineNum = 155713559;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=155713560;
 //BA.debugLineNum = 155713560;BA.debugLine="newExecution.Put(\"state_id\", 4)";
_newexecution.Put((Object)("state_id"),(Object)(4));
RDebugUtils.currentLine=155713561;
 //BA.debugLineNum = 155713561;BA.debugLine="newExecution.Put(\"req_date\", newDate)";
_newexecution.Put((Object)("req_date"),(Object)(_newdate));
RDebugUtils.currentLine=155713562;
 //BA.debugLineNum = 155713562;BA.debugLine="newExecution.Put(\"req_time\", newTime)";
_newexecution.Put((Object)("req_time"),(Object)(_newtime));
RDebugUtils.currentLine=155713563;
 //BA.debugLineNum = 155713563;BA.debugLine="newExecution.Put(\"execdate_type\", 0)";
_newexecution.Put((Object)("execdate_type"),(Object)(0));
RDebugUtils.currentLine=155713564;
 //BA.debugLineNum = 155713564;BA.debugLine="newExecution.Put(\"dayweekmonth\", 0)";
_newexecution.Put((Object)("dayweekmonth"),(Object)(0));
RDebugUtils.currentLine=155713565;
 //BA.debugLineNum = 155713565;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=155713566;
 //BA.debugLineNum = 155713566;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=155713567;
 //BA.debugLineNum = 155713567;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=155713568;
 //BA.debugLineNum = 155713568;BA.debugLine="newExecution.Put(\"origin_tagcode\", \"TORI_INTERNAL";
_newexecution.Put((Object)("origin_tagcode"),(Object)("TORI_INTERNAL"));
RDebugUtils.currentLine=155713569;
 //BA.debugLineNum = 155713569;BA.debugLine="newExecution.Put(\"entity_tagcode\", entity_tagcode";
_newexecution.Put((Object)("entity_tagcode"),(Object)(_entity_tagcode));
RDebugUtils.currentLine=155713570;
 //BA.debugLineNum = 155713570;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
_newexecution.Put((Object)("object_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155713571;
 //BA.debugLineNum = 155713571;BA.debugLine="newExecution.Put(\"technical_tagcode\", ShareCode.S";
_newexecution.Put((Object)("technical_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=155713572;
 //BA.debugLineNum = 155713572;BA.debugLine="newExecution.Put(\"team_tagcode\", \"\")";
_newexecution.Put((Object)("team_tagcode"),(Object)(""));
RDebugUtils.currentLine=155713573;
 //BA.debugLineNum = 155713573;BA.debugLine="newExecution.Put(\"local_tagcode\", \"\")";
_newexecution.Put((Object)("local_tagcode"),(Object)(""));
RDebugUtils.currentLine=155713574;
 //BA.debugLineNum = 155713574;BA.debugLine="newExecution.Put(\"typerequest_tagcode\", newReques";
_newexecution.Put((Object)("typerequest_tagcode"),(Object)(_newrequesttype));
RDebugUtils.currentLine=155713575;
 //BA.debugLineNum = 155713575;BA.debugLine="newExecution.Put(\"vehicle_tagcode\", ShareCode.SES";
_newexecution.Put((Object)("vehicle_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_vehicle_object /*String*/ ));
RDebugUtils.currentLine=155713576;
 //BA.debugLineNum = 155713576;BA.debugLine="newExecution.Put(\"confirmed\", 1)";
_newexecution.Put((Object)("confirmed"),(Object)(1));
RDebugUtils.currentLine=155713577;
 //BA.debugLineNum = 155713577;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=155713578;
 //BA.debugLineNum = 155713578;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155713579;
 //BA.debugLineNum = 155713579;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155713580;
 //BA.debugLineNum = 155713580;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=155713581;
 //BA.debugLineNum = 155713581;BA.debugLine="newRequestItem.Put(\"request\", ListOfMaps)";
_newrequestitem.Put((Object)("request"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=155713583;
 //BA.debugLineNum = 155713583;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, \"";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=155713585;
 //BA.debugLineNum = 155713585;BA.debugLine="Dim repeatcounter As Int = DBStructures.GetCountO";
_repeatcounter = parent.mostCurrent._dbstructures._getcountofevc /*int*/ (mostCurrent.activityBA,"dta_requests_relations",(" and request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strselchecklist))+"'"));
RDebugUtils.currentLine=155713587;
 //BA.debugLineNum = 155713587;BA.debugLine="Dim newExecution As Map";
_newexecution = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155713588;
 //BA.debugLineNum = 155713588;BA.debugLine="newExecution.Initialize";
_newexecution.Initialize();
RDebugUtils.currentLine=155713589;
 //BA.debugLineNum = 155713589;BA.debugLine="newExecution.Put(\"id\",0)";
_newexecution.Put((Object)("id"),(Object)(0));
RDebugUtils.currentLine=155713590;
 //BA.debugLineNum = 155713590;BA.debugLine="newExecution.Put(\"request_tagcode\", newRequest)";
_newexecution.Put((Object)("request_tagcode"),(Object)(_newrequest));
RDebugUtils.currentLine=155713591;
 //BA.debugLineNum = 155713591;BA.debugLine="newExecution.Put(\"relation_tagcode\", strSelCheckL";
_newexecution.Put((Object)("relation_tagcode"),(Object)(_strselchecklist));
RDebugUtils.currentLine=155713592;
 //BA.debugLineNum = 155713592;BA.debugLine="newExecution.Put(\"inner_title\", \"\")";
_newexecution.Put((Object)("inner_title"),(Object)(""));
RDebugUtils.currentLine=155713593;
 //BA.debugLineNum = 155713593;BA.debugLine="newExecution.Put(\"position\", 0)";
_newexecution.Put((Object)("position"),(Object)(0));
RDebugUtils.currentLine=155713594;
 //BA.debugLineNum = 155713594;BA.debugLine="newExecution.Put(\"type_relation\", 0)";
_newexecution.Put((Object)("type_relation"),(Object)(0));
RDebugUtils.currentLine=155713595;
 //BA.debugLineNum = 155713595;BA.debugLine="newExecution.Put(\"status_id\", 1)";
_newexecution.Put((Object)("status_id"),(Object)(1));
RDebugUtils.currentLine=155713596;
 //BA.debugLineNum = 155713596;BA.debugLine="newExecution.Put(\"excel_import\", 0)";
_newexecution.Put((Object)("excel_import"),(Object)(0));
RDebugUtils.currentLine=155713597;
 //BA.debugLineNum = 155713597;BA.debugLine="newExecution.Put(\"imported\", 0)";
_newexecution.Put((Object)("imported"),(Object)(0));
RDebugUtils.currentLine=155713598;
 //BA.debugLineNum = 155713598;BA.debugLine="newExecution.Put(\"import_tagcode\", \"\")";
_newexecution.Put((Object)("import_tagcode"),(Object)(""));
RDebugUtils.currentLine=155713599;
 //BA.debugLineNum = 155713599;BA.debugLine="newExecution.Put(\"object_tagcode\", strSelObject)";
_newexecution.Put((Object)("object_tagcode"),(Object)(_strselobject));
RDebugUtils.currentLine=155713600;
 //BA.debugLineNum = 155713600;BA.debugLine="newExecution.Put(\"execute_date\", newDate)";
_newexecution.Put((Object)("execute_date"),(Object)(_newdate));
RDebugUtils.currentLine=155713601;
 //BA.debugLineNum = 155713601;BA.debugLine="newExecution.Put(\"execute_start\", newTime)";
_newexecution.Put((Object)("execute_start"),(Object)(_newtime));
RDebugUtils.currentLine=155713602;
 //BA.debugLineNum = 155713602;BA.debugLine="newExecution.Put(\"execute_end\", newTime)";
_newexecution.Put((Object)("execute_end"),(Object)(_newtime));
RDebugUtils.currentLine=155713603;
 //BA.debugLineNum = 155713603;BA.debugLine="newExecution.Put(\"repeatcounter\", repeatcounter)";
_newexecution.Put((Object)("repeatcounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=155713604;
 //BA.debugLineNum = 155713604;BA.debugLine="newExecution.Put(\"active\", 1)";
_newexecution.Put((Object)("active"),(Object)(1));
RDebugUtils.currentLine=155713605;
 //BA.debugLineNum = 155713605;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155713606;
 //BA.debugLineNum = 155713606;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155713607;
 //BA.debugLineNum = 155713607;BA.debugLine="ListOfMaps.Add(newExecution)";
_listofmaps.Add((Object)(_newexecution.getObject()));
RDebugUtils.currentLine=155713608;
 //BA.debugLineNum = 155713608;BA.debugLine="newRequestItem.Put(\"relation\", ListOfMaps)";
_newrequestitem.Put((Object)("relation"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=155713610;
 //BA.debugLineNum = 155713610;BA.debugLine="Utils.InsertMapsWithLog(Starter.LocalSQLEVC, 0, \"";
parent.mostCurrent._utils._insertmapswithlog /*String*/ (mostCurrent.activityBA,parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,(int) (0),"dta_requests_relations",_listofmaps,_newrequest,"");
RDebugUtils.currentLine=155713611;
 //BA.debugLineNum = 155713611;BA.debugLine="Dim maxID As Int = DBStructures.GetMaxOfEVC(\"dta_";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values","id","")+1+1000000);
RDebugUtils.currentLine=155713613;
 //BA.debugLineNum = 155713613;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_v";
_ssql = ("insert into dta_requests_values (id, request_tagcode,inner_request_tagcode, task_tagcode,item_tagcode,unique_key,\n"+"					tagcode,position,execute_value,execute_format_title, confirmed,changed_value, repeatcounter)\n"+"					select "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", x.request_tagcode, x.inner_request_tagcode, x.task_tagcode, \n"+"					x.item_tagcode, x.unique_key, x.tagcode, x.position, \n"+"					x.execute_value, x.execute_format_title, x.confirmed, x.changed_value, x.repeatcounter\n"+"					from (Select d.id, a.request_tagcode, b.tagcode As inner_request_tagcode, \n"+"					a.relation_tagcode As task_tagcode, \n"+"					c.item_tagcode, c.unique_key, d.tagcode As tagcode, \n"+"					ifnull(d.position, c.position) As position, '' as execute_value, \n"+"					Case when d.data_type=16 Then d.title Else '' end as execute_format_title,\n"+"					 0 as confirmed, '' as changed_value, a.repeatcounter\n"+"					from dta_requests_relations As a\n"+"					inner join dta_tasks As b on (b.tagcode=a.relation_tagcode)\n"+"					inner join dta_tasks_items As c on (c.task_tagcode=a.relation_tagcode)\n"+"					left join dta_tasks_items_answers As d on (d.parent_tagcode=c.unique_key)\n"+"					where a.type_relation=0 And a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"' and a.relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_strselchecklist))+"' and a.repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"\n"+"					) As x\n"+"					order by  x.position, x.request_tagcode, x.task_tagcode, x.id");
RDebugUtils.currentLine=155713632;
 //BA.debugLineNum = 155713632;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6155713632",_ssql,0);
RDebugUtils.currentLine=155713633;
 //BA.debugLineNum = 155713633;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=155713635;
 //BA.debugLineNum = 155713635;BA.debugLine="Dim resfields As ResumableSub = createRequestFiel";
_resfields = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resfields = _createrequestfields(_newrequest,_newrequesttype);
RDebugUtils.currentLine=155713636;
 //BA.debugLineNum = 155713636;BA.debugLine="Wait For(resfields) Complete (resfieldsOk As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects"), _resfields);
this.state = 10;
return;
case 10:
//C
this.state = 5;
_resfieldsok = (Boolean) result[0];
;
RDebugUtils.currentLine=155713638;
 //BA.debugLineNum = 155713638;BA.debugLine="Dim resa1 As ResumableSub = createRequestEntityRe";
_resa1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa1 = _createrequestentityrelation(_newrequest,_strselobject);
RDebugUtils.currentLine=155713639;
 //BA.debugLineNum = 155713639;BA.debugLine="Wait For(resa1) Complete (resfieldsOk1 As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects"), _resa1);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_resfieldsok1 = (Boolean) result[0];
;
RDebugUtils.currentLine=155713641;
 //BA.debugLineNum = 155713641;BA.debugLine="Dim resa2 As ResumableSub = createRequestObjectRe";
_resa2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa2 = _createrequestobjectrelation(_newrequest,_strselobject);
RDebugUtils.currentLine=155713642;
 //BA.debugLineNum = 155713642;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects"), _resa2);
this.state = 12;
return;
case 12:
//C
this.state = 5;
_resfieldsok2 = (Boolean) result[0];
;
RDebugUtils.currentLine=155713644;
 //BA.debugLineNum = 155713644;BA.debugLine="UploadNewRequest2Server(newRequest, newRequestIte";
_uploadnewrequest2server(_newrequest,_newrequestitem,"0");
RDebugUtils.currentLine=155713645;
 //BA.debugLineNum = 155713645;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "createrequeststoobjects"),(int) (1000));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=155713647;
 //BA.debugLineNum = 155713647;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=155713649;
 //BA.debugLineNum = 155713649;BA.debugLine="If (RunCL) Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_runcl)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=155713650;
 //BA.debugLineNum = 155713650;BA.debugLine="butCreateRequestCancel_Click";
_butcreaterequestcancel_click();
RDebugUtils.currentLine=155713651;
 //BA.debugLineNum = 155713651;BA.debugLine="RunThisChecklist(newRequest)";
_runthischecklist(_newrequest);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=155713654;
 //BA.debugLineNum = 155713654;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _uploadnewrequest2server(String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequest2server", false))
	 {Debug.delegate(mostCurrent.activityBA, "uploadnewrequest2server", new Object[] {_tagcode,_items,_origin}); return;}
ResumableSub_UploadNewRequest2Server rsub = new ResumableSub_UploadNewRequest2Server(null,_tagcode,_items,_origin);
rsub.resume(processBA, null);
}
public static class ResumableSub_UploadNewRequest2Server extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server(xevolution.vrcg.devdemov2400.objects parent,String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
}
xevolution.vrcg.devdemov2400.objects parent;
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
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156434433;
 //BA.debugLineNum = 156434433;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=156434434;
 //BA.debugLineNum = 156434434;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=156434435;
 //BA.debugLineNum = 156434435;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=156434437;
 //BA.debugLineNum = 156434437;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=156434438;
 //BA.debugLineNum = 156434438;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=156434439;
 //BA.debugLineNum = 156434439;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=156434440;
 //BA.debugLineNum = 156434440;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=156434441;
 //BA.debugLineNum = 156434441;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=156434442;
 //BA.debugLineNum = 156434442;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156434443;
 //BA.debugLineNum = 156434443;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=156434444;
 //BA.debugLineNum = 156434444;BA.debugLine="params.Put(\"origin\", origin)";
_params.Put((Object)("origin"),(Object)(_origin));
RDebugUtils.currentLine=156434445;
 //BA.debugLineNum = 156434445;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=156434446;
 //BA.debugLineNum = 156434446;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=156434447;
 //BA.debugLineNum = 156434447;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=156434448;
 //BA.debugLineNum = 156434448;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=156434449;
 //BA.debugLineNum = 156434449;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=156434450;
 //BA.debugLineNum = 156434450;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=156434451;
 //BA.debugLineNum = 156434451;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=156434452;
 //BA.debugLineNum = 156434452;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156434453;
 //BA.debugLineNum = 156434453;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=156434454;
 //BA.debugLineNum = 156434454;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=156434455;
 //BA.debugLineNum = 156434455;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=156434457;
 //BA.debugLineNum = 156434457;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156434457",_data,0);
RDebugUtils.currentLine=156434459;
 //BA.debugLineNum = 156434459;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/new");
RDebugUtils.currentLine=156434460;
 //BA.debugLineNum = 156434460;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=156434461;
 //BA.debugLineNum = 156434461;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=156434462;
 //BA.debugLineNum = 156434462;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",objects.getObject());
RDebugUtils.currentLine=156434463;
 //BA.debugLineNum = 156434463;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=156434464;
 //BA.debugLineNum = 156434464;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=156434465;
 //BA.debugLineNum = 156434465;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "uploadnewrequest2server"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=156434466;
 //BA.debugLineNum = 156434466;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=156434467;
 //BA.debugLineNum = 156434467;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156434467",_job._getstring /*String*/ (null),0);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=156434469;
 //BA.debugLineNum = 156434469;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=156434470;
 //BA.debugLineNum = 156434470;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=156434472;
 //BA.debugLineNum = 156434472;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=156434474;
 //BA.debugLineNum = 156434474;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (4),"","","");
RDebugUtils.currentLine=156434475;
 //BA.debugLineNum = 156434475;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=156434477;
 //BA.debugLineNum = 156434477;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _runthischecklist(String _newrequest) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runthischecklist", false))
	 {Debug.delegate(mostCurrent.activityBA, "runthischecklist", new Object[] {_newrequest}); return;}
ResumableSub_RunThisChecklist rsub = new ResumableSub_RunThisChecklist(null,_newrequest);
rsub.resume(processBA, null);
}
public static class ResumableSub_RunThisChecklist extends BA.ResumableSub {
public ResumableSub_RunThisChecklist(xevolution.vrcg.devdemov2400.objects parent,String _newrequest) {
this.parent = parent;
this._newrequest = _newrequest;
}
xevolution.vrcg.devdemov2400.objects parent;
String _newrequest;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _incolitems = null;
int _id = 0;
int _tasktype = 0;
int _status_id = 0;
String _tagcode = "";
String _actionkey = "";
String _task = "";
String _name = "";
String _object_tagcode = "";
String _request_type = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _sdate = "";
String _stime = "";
int _close_type = 0;
int _result_type = 0;
String _result_values = "";
int _repeatcounter = 0;
xevolution.vrcg.devdemov2400.types._requesttaskinfo _clainfo = null;
xevolution.vrcg.devdemov2400.types._requestcla _cla = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
String _object_type = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resa2 = null;
boolean _resfieldsok2 = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _finished = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res1 = null;
boolean _finished1 = false;
int _tr_is_model = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156106754;
 //BA.debugLineNum = 156106754;BA.debugLine="ProgressDialogShow(ShareCode.objectMsgPrepararInt";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*String*/ ));
RDebugUtils.currentLine=156106755;
 //BA.debugLineNum = 156106755;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"),(int) (100));
this.state = 31;
return;
case 31:
//C
this.state = 1;
;
RDebugUtils.currentLine=156106757;
 //BA.debugLineNum = 156106757;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETREQU";
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*String*/ ;
RDebugUtils.currentLine=156106758;
 //BA.debugLineNum = 156106758;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${newR";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and z.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_newrequest))+"'");
RDebugUtils.currentLine=156106759;
 //BA.debugLineNum = 156106759;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106759",_ssql,0);
RDebugUtils.currentLine=156106760;
 //BA.debugLineNum = 156106760;BA.debugLine="Log(newRequest)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106760",_newrequest,0);
RDebugUtils.currentLine=156106764;
 //BA.debugLineNum = 156106764;BA.debugLine="Private incolitems As Cursor";
_incolitems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=156106765;
 //BA.debugLineNum = 156106765;BA.debugLine="incolitems = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_incolitems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=156106766;
 //BA.debugLineNum = 156106766;BA.debugLine="If (incolitems.RowCount >= 1) Then";
if (true) break;

case 1:
//if
this.state = 30;
if ((_incolitems.getRowCount()>=1)) { 
this.state = 3;
}else {
this.state = 29;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=156106767;
 //BA.debugLineNum = 156106767;BA.debugLine="incolitems.Position = 0";
_incolitems.setPosition((int) (0));
RDebugUtils.currentLine=156106768;
 //BA.debugLineNum = 156106768;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
_id = _incolitems.GetInt("id");
RDebugUtils.currentLine=156106769;
 //BA.debugLineNum = 156106769;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type\")";
_tasktype = _incolitems.GetInt("type");
RDebugUtils.currentLine=156106770;
 //BA.debugLineNum = 156106770;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"status";
_status_id = _incolitems.GetInt("status_id");
RDebugUtils.currentLine=156106771;
 //BA.debugLineNum = 156106771;BA.debugLine="Dim tagcode As String = incolitems.GetString(\"ta";
_tagcode = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=156106772;
 //BA.debugLineNum = 156106772;BA.debugLine="Dim actionkey As String = incolitems.GetString(\"";
_actionkey = _incolitems.GetString("action_tagcode");
RDebugUtils.currentLine=156106773;
 //BA.debugLineNum = 156106773;BA.debugLine="Dim task As String = incolitems.GetString(\"task_";
_task = _incolitems.GetString("task_tagcode");
RDebugUtils.currentLine=156106774;
 //BA.debugLineNum = 156106774;BA.debugLine="Dim name As String = incolitems.GetString(\"name\"";
_name = _incolitems.GetString("name");
RDebugUtils.currentLine=156106775;
 //BA.debugLineNum = 156106775;BA.debugLine="Dim object_tagcode As String = incolitems.GetInt";
_object_tagcode = BA.NumberToString(_incolitems.GetInt("object_tagcode"));
RDebugUtils.currentLine=156106776;
 //BA.debugLineNum = 156106776;BA.debugLine="Dim request_type As String = incolitems.GetInt(\"";
_request_type = BA.NumberToString(_incolitems.GetInt("request_type"));
RDebugUtils.currentLine=156106779;
 //BA.debugLineNum = 156106779;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDatet";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=156106780;
 //BA.debugLineNum = 156106780;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOr";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=156106781;
 //BA.debugLineNum = 156106781;BA.debugLine="Private sACLALongitude As String = Utils.IfNullO";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=156106783;
 //BA.debugLineNum = 156106783;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
_sdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=156106784;
 //BA.debugLineNum = 156106784;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
_stime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=156106786;
 //BA.debugLineNum = 156106786;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"close";
_close_type = _incolitems.GetInt("close_type");
RDebugUtils.currentLine=156106787;
 //BA.debugLineNum = 156106787;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"resu";
_result_type = _incolitems.GetInt("result_type");
RDebugUtils.currentLine=156106788;
 //BA.debugLineNum = 156106788;BA.debugLine="Dim result_values As String = incolitems.GetStri";
_result_values = _incolitems.GetString("result_values");
RDebugUtils.currentLine=156106789;
 //BA.debugLineNum = 156106789;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(\"re";
_repeatcounter = _incolitems.GetInt("repeatcounter");
RDebugUtils.currentLine=156106791;
 //BA.debugLineNum = 156106791;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeReque";
_clainfo = parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),_close_type,_result_type,_result_values,anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1));
RDebugUtils.currentLine=156106792;
 //BA.debugLineNum = 156106792;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(tag";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,_tagcode,_actionkey,_task,_repeatcounter,_tasktype,parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,_id,_tagcode,_status_id,parent.mostCurrent._utils._colorint /*int*/ (mostCurrent.activityBA,_status_id)),_clainfo,parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=156106796;
 //BA.debugLineNum = 156106796;BA.debugLine="Dim sSQL As String = $\"update dta_requests set s";
_ssql = ("update dta_requests set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=156106798;
 //BA.debugLineNum = 156106798;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=156106799;
 //BA.debugLineNum = 156106799;BA.debugLine="Dim sSQL As String = $\"update dta_requests_relat";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'");
RDebugUtils.currentLine=156106801;
 //BA.debugLineNum = 156106801;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=156106802;
 //BA.debugLineNum = 156106802;BA.debugLine="Log(\"Grava Status na BD local Request\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106802","Grava Status na BD local Request",0);
RDebugUtils.currentLine=156106803;
 //BA.debugLineNum = 156106803;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=156106804;
 //BA.debugLineNum = 156106804;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=156106805;
 //BA.debugLineNum = 156106805;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=156106806;
 //BA.debugLineNum = 156106806;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=156106807;
 //BA.debugLineNum = 156106807;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=156106808;
 //BA.debugLineNum = 156106808;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=156106809;
 //BA.debugLineNum = 156106809;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156106810;
 //BA.debugLineNum = 156106810;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=156106811;
 //BA.debugLineNum = 156106811;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=156106812;
 //BA.debugLineNum = 156106812;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=156106813;
 //BA.debugLineNum = 156106813;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=156106814;
 //BA.debugLineNum = 156106814;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=156106815;
 //BA.debugLineNum = 156106815;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=156106816;
 //BA.debugLineNum = 156106816;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=156106817;
 //BA.debugLineNum = 156106817;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=156106818;
 //BA.debugLineNum = 156106818;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=156106819;
 //BA.debugLineNum = 156106819;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=156106820;
 //BA.debugLineNum = 156106820;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156106821;
 //BA.debugLineNum = 156106821;BA.debugLine="Try";
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
RDebugUtils.currentLine=156106822;
 //BA.debugLineNum = 156106822;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=156106823;
 //BA.debugLineNum = 156106823;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
RDebugUtils.currentLine=156106825;
 //BA.debugLineNum = 156106825;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106825",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=156106826;
 //BA.debugLineNum = 156106826;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=156106827;
 //BA.debugLineNum = 156106827;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=156106828;
 //BA.debugLineNum = 156106828;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=156106829;
 //BA.debugLineNum = 156106829;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
;
RDebugUtils.currentLine=156106831;
 //BA.debugLineNum = 156106831;BA.debugLine="CLA.Info.Map1 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=156106833;
 //BA.debugLineNum = 156106833;BA.debugLine="Dim sSQL As String = $\"update dta_requests_relat";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"								where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"");
RDebugUtils.currentLine=156106835;
 //BA.debugLineNum = 156106835;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=156106836;
 //BA.debugLineNum = 156106836;BA.debugLine="Log(\"Grava Status na BD local Request-Relation\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106836","Grava Status na BD local Request-Relation",0);
RDebugUtils.currentLine=156106838;
 //BA.debugLineNum = 156106838;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=156106839;
 //BA.debugLineNum = 156106839;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=156106840;
 //BA.debugLineNum = 156106840;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=156106841;
 //BA.debugLineNum = 156106841;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=156106842;
 //BA.debugLineNum = 156106842;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=156106843;
 //BA.debugLineNum = 156106843;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
_params.Put((Object)("ACLAAction"),(Object)(_actionkey));
RDebugUtils.currentLine=156106844;
 //BA.debugLineNum = 156106844;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=156106845;
 //BA.debugLineNum = 156106845;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156106846;
 //BA.debugLineNum = 156106846;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=156106847;
 //BA.debugLineNum = 156106847;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=156106848;
 //BA.debugLineNum = 156106848;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=156106849;
 //BA.debugLineNum = 156106849;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=156106851;
 //BA.debugLineNum = 156106851;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=156106852;
 //BA.debugLineNum = 156106852;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=156106853;
 //BA.debugLineNum = 156106853;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=156106854;
 //BA.debugLineNum = 156106854;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=156106855;
 //BA.debugLineNum = 156106855;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=156106856;
 //BA.debugLineNum = 156106856;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=156106857;
 //BA.debugLineNum = 156106857;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=156106858;
 //BA.debugLineNum = 156106858;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156106859;
 //BA.debugLineNum = 156106859;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 15;
this.catchState = 14;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 14;
RDebugUtils.currentLine=156106860;
 //BA.debugLineNum = 156106860;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=156106861;
 //BA.debugLineNum = 156106861;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=156106862;
 //BA.debugLineNum = 156106862;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude\",";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
RDebugUtils.currentLine=156106864;
 //BA.debugLineNum = 156106864;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106864",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=156106865;
 //BA.debugLineNum = 156106865;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=156106866;
 //BA.debugLineNum = 156106866;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=156106867;
 //BA.debugLineNum = 156106867;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
 if (true) break;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
;
RDebugUtils.currentLine=156106869;
 //BA.debugLineNum = 156106869;BA.debugLine="CLA.Info.Map2 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=156106870;
 //BA.debugLineNum = 156106870;BA.debugLine="CLA.Status.status = 2";
_cla.Status /*xevolution.vrcg.devdemov2400.types._intervention*/ .status /*int*/  = (int) (2);
RDebugUtils.currentLine=156106875;
 //BA.debugLineNum = 156106875;BA.debugLine="Dim object_type As String = DBStructures.GetScri";
_object_type = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select ifnull(object_type, '') as valor\n"+"						from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_object_tagcode.trim()))+"'"),"valor");
RDebugUtils.currentLine=156106878;
 //BA.debugLineNum = 156106878;BA.debugLine="Dim resa2 As ResumableSub = UpdateTyperequestFie";
_resa2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resa2 = _updatetyperequestfields(_object_type,_object_tagcode,_request_type,_tagcode,_actionkey,_repeatcounter,_cla);
RDebugUtils.currentLine=156106880;
 //BA.debugLineNum = 156106880;BA.debugLine="Wait For(resa2) Complete (resfieldsOk2 As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"), _resa2);
this.state = 32;
return;
case 32:
//C
this.state = 16;
_resfieldsok2 = (Boolean) result[0];
;
RDebugUtils.currentLine=156106881;
 //BA.debugLineNum = 156106881;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"),(int) (100));
this.state = 33;
return;
case 33:
//C
this.state = 16;
;
RDebugUtils.currentLine=156106886;
 //BA.debugLineNum = 156106886;BA.debugLine="Dim res As ResumableSub = FillAdditionalFields(C";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _filladditionalfields(_cla,_tagcode,_actionkey);
RDebugUtils.currentLine=156106887;
 //BA.debugLineNum = 156106887;BA.debugLine="Wait For (res) Complete (Finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"), _res);
this.state = 34;
return;
case 34:
//C
this.state = 16;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=156106888;
 //BA.debugLineNum = 156106888;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"),(int) (100));
this.state = 35;
return;
case 35:
//C
this.state = 16;
;
RDebugUtils.currentLine=156106894;
 //BA.debugLineNum = 156106894;BA.debugLine="Dim res1 As ResumableSub = CheckDatToUpdateInChe";
_res1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res1 = _checkdattoupdateinchecklist(_request_type,_tagcode,_actionkey,_repeatcounter);
RDebugUtils.currentLine=156106895;
 //BA.debugLineNum = 156106895;BA.debugLine="Wait For (res1) Complete (Finished1 As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"), _res1);
this.state = 36;
return;
case 36:
//C
this.state = 16;
_finished1 = (Boolean) result[0];
;
RDebugUtils.currentLine=156106896;
 //BA.debugLineNum = 156106896;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "runthischecklist"),(int) (100));
this.state = 37;
return;
case 37:
//C
this.state = 16;
;
RDebugUtils.currentLine=156106898;
 //BA.debugLineNum = 156106898;BA.debugLine="Try";
if (true) break;

case 16:
//try
this.state = 27;
this.catchState = 26;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 26;
RDebugUtils.currentLine=156106901;
 //BA.debugLineNum = 156106901;BA.debugLine="Dim tr_is_model As Int = DBStructures.GetScript";
_tr_is_model = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select tr_is_model from dta_typerequests\n"+"					where tagcode in (select typerequest_tagcode from dta_requests where tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')"),"tr_is_model");
RDebugUtils.currentLine=156106904;
 //BA.debugLineNum = 156106904;BA.debugLine="If Utils.Int2Bool(tr_is_model) Then";
if (true) break;

case 19:
//if
this.state = 24;
if (parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,_tr_is_model)) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=156106905;
 //BA.debugLineNum = 156106905;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_Activity_Child",(Object)(_cla),(Object)(_name));
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=156106907;
 //BA.debugLineNum = 156106907;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activity";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_Activity",(Object)(_cla),(Object)(_name));
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
RDebugUtils.currentLine=156106911;
 //BA.debugLineNum = 156106911;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=156106912;
 //BA.debugLineNum = 156106912;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156106912",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=156106913;
 //BA.debugLineNum = 156106913;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=156106914;
 //BA.debugLineNum = 156106914;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", ShareC";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Call StartCLA_Activity",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
this.catchState = 0;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=156106917;
 //BA.debugLineNum = 156106917;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=156106919;
 //BA.debugLineNum = 156106919;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _uploadnewrequest2server2(String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin,String _reqtype) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "uploadnewrequest2server2", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "uploadnewrequest2server2", new Object[] {_tagcode,_items,_origin,_reqtype}));}
ResumableSub_UploadNewRequest2Server2 rsub = new ResumableSub_UploadNewRequest2Server2(null,_tagcode,_items,_origin,_reqtype);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UploadNewRequest2Server2 extends BA.ResumableSub {
public ResumableSub_UploadNewRequest2Server2(xevolution.vrcg.devdemov2400.objects parent,String _tagcode,anywheresoftware.b4a.objects.collections.Map _items,String _origin,String _reqtype) {
this.parent = parent;
this._tagcode = _tagcode;
this._items = _items;
this._origin = _origin;
this._reqtype = _reqtype;
}
xevolution.vrcg.devdemov2400.objects parent;
String _tagcode;
anywheresoftware.b4a.objects.collections.Map _items;
String _origin;
String _reqtype;
String _retvalue = "";
anywheresoftware.b4a.objects.collections.List _listofmaps = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=155844609;
 //BA.debugLineNum = 155844609;BA.debugLine="Dim RetValue As String = \"\"";
_retvalue = "";
RDebugUtils.currentLine=155844610;
 //BA.debugLineNum = 155844610;BA.debugLine="Dim ListOfMaps As List";
_listofmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=155844611;
 //BA.debugLineNum = 155844611;BA.debugLine="ListOfMaps.Initialize";
_listofmaps.Initialize();
RDebugUtils.currentLine=155844612;
 //BA.debugLineNum = 155844612;BA.debugLine="ListOfMaps.Add(items)";
_listofmaps.Add((Object)(_items.getObject()));
RDebugUtils.currentLine=155844614;
 //BA.debugLineNum = 155844614;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155844615;
 //BA.debugLineNum = 155844615;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=155844616;
 //BA.debugLineNum = 155844616;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=155844617;
 //BA.debugLineNum = 155844617;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=155844618;
 //BA.debugLineNum = 155844618;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=155844619;
 //BA.debugLineNum = 155844619;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=155844620;
 //BA.debugLineNum = 155844620;BA.debugLine="params.Put(\"_tagcode\", tagcode)";
_params.Put((Object)("_tagcode"),(Object)(_tagcode));
RDebugUtils.currentLine=155844621;
 //BA.debugLineNum = 155844621;BA.debugLine="params.Put(\"origin\", origin)";
_params.Put((Object)("origin"),(Object)(_origin));
RDebugUtils.currentLine=155844622;
 //BA.debugLineNum = 155844622;BA.debugLine="params.Put(\"data\", ListOfMaps)";
_params.Put((Object)("data"),(Object)(_listofmaps.getObject()));
RDebugUtils.currentLine=155844624;
 //BA.debugLineNum = 155844624;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=155844625;
 //BA.debugLineNum = 155844625;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=155844626;
 //BA.debugLineNum = 155844626;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=155844628;
 //BA.debugLineNum = 155844628;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/upload/request/new");
RDebugUtils.currentLine=155844629;
 //BA.debugLineNum = 155844629;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
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
RDebugUtils.currentLine=155844630;
 //BA.debugLineNum = 155844630;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=155844631;
 //BA.debugLineNum = 155844631;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",objects.getObject());
RDebugUtils.currentLine=155844632;
 //BA.debugLineNum = 155844632;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=155844633;
 //BA.debugLineNum = 155844633;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=155844634;
 //BA.debugLineNum = 155844634;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "uploadnewrequest2server2"), (Object)(_job));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=155844635;
 //BA.debugLineNum = 155844635;BA.debugLine="If Job.Success Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=155844636;
 //BA.debugLineNum = 155844636;BA.debugLine="Log(Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6155844636",_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=155844638;
 //BA.debugLineNum = 155844638;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=155844639;
 //BA.debugLineNum = 155844639;BA.debugLine="JSON1.Initialize(Job.GetString)";
_json1.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=155844640;
 //BA.debugLineNum = 155844640;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=155844641;
 //BA.debugLineNum = 155844641;BA.debugLine="RetValue = Utils.IfNullOrEmpty(MapJSON.Get(\"new";
_retvalue = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_mapjson.Get((Object)("newrequest"))),"");
RDebugUtils.currentLine=155844644;
 //BA.debugLineNum = 155844644;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=155844645;
 //BA.debugLineNum = 155844645;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=155844646;
 //BA.debugLineNum = 155844646;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=155844647;
 //BA.debugLineNum = 155844647;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=155844648;
 //BA.debugLineNum = 155844648;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=155844649;
 //BA.debugLineNum = 155844649;BA.debugLine="params.Put(\"ACLARequestType\", reqtype)";
_params.Put((Object)("ACLARequestType"),(Object)(_reqtype));
RDebugUtils.currentLine=155844651;
 //BA.debugLineNum = 155844651;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/cla-fields/create");
RDebugUtils.currentLine=155844652;
 //BA.debugLineNum = 155844652;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 7:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=155844653;
 //BA.debugLineNum = 155844653;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", tagcode)";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,objects.getObject(),_url,"",_tagcode);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=155844655;
 //BA.debugLineNum = 155844655;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=155844656;
 //BA.debugLineNum = 155844656;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = 15;
;
RDebugUtils.currentLine=155844658;
 //BA.debugLineNum = 155844658;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "uploadnewrequest2server2"),(int) (500));
this.state = 20;
return;
case 20:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=155844660;
 //BA.debugLineNum = 155844660;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=155844661;
 //BA.debugLineNum = 155844661;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worke";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 15:
//C
this.state = 18;
;
RDebugUtils.currentLine=155844663;
 //BA.debugLineNum = 155844663;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=155844665;
 //BA.debugLineNum = 155844665;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorker";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=155844666;
 //BA.debugLineNum = 155844666;BA.debugLine="Utils.save2update(ServerAddress, data, 0, Worker";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_serveraddress,_data,(int) (0),_workernd);
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=155844668;
 //BA.debugLineNum = 155844668;BA.debugLine="Return RetValue";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_retvalue));return;};
RDebugUtils.currentLine=155844669;
 //BA.debugLineNum = 155844669;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createshowrequestinfofield(anywheresoftware.b4a.sql.SQL.CursorWrapper _colitems,anywheresoftware.b4a.objects.B4XViewWrapper _parentdialog) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createshowrequestinfofield", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createshowrequestinfofield", new Object[] {_colitems,_parentdialog}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _title = "";
String _value = "";
RDebugUtils.currentLine=157548544;
 //BA.debugLineNum = 157548544;BA.debugLine="Sub CreateShowRequestInfoField(colitems As Cursor,";
RDebugUtils.currentLine=157548545;
 //BA.debugLineNum = 157548545;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=157548546;
 //BA.debugLineNum = 157548546;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=157548547;
 //BA.debugLineNum = 157548547;BA.debugLine="Activity.AddView(p, 0, 0, parentDialog.Width, 45d";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_parentdialog.getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (45)));
RDebugUtils.currentLine=157548548;
 //BA.debugLineNum = 157548548;BA.debugLine="If(ShareCode.ISPHONE)Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=157548549;
 //BA.debugLineNum = 157548549;BA.debugLine="p.LoadLayout(\"Request_Information_Fields_View\")";
_p.LoadLayout("Request_Information_Fields_View",mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=157548551;
 //BA.debugLineNum = 157548551;BA.debugLine="p.LoadLayout(\"Request_Information_Fields_View\")";
_p.LoadLayout("Request_Information_Fields_View",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=157548553;
 //BA.debugLineNum = 157548553;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=157548555;
 //BA.debugLineNum = 157548555;BA.debugLine="Dim tagcode As String = colitems.GetString(\"tagco";
_tagcode = _colitems.GetString("tagcode");
RDebugUtils.currentLine=157548556;
 //BA.debugLineNum = 157548556;BA.debugLine="Dim title As String = colitems.GetString(\"title\")";
_title = _colitems.GetString("title");
RDebugUtils.currentLine=157548557;
 //BA.debugLineNum = 157548557;BA.debugLine="Dim value As String = colitems.GetString(\"value\")";
_value = _colitems.GetString("value");
RDebugUtils.currentLine=157548558;
 //BA.debugLineNum = 157548558;BA.debugLine="LabelPreRequestFieldName.text = title";
mostCurrent._labelprerequestfieldname.setText(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=157548559;
 //BA.debugLineNum = 157548559;BA.debugLine="LabelPreRequestFieldValue.Text = value";
mostCurrent._labelprerequestfieldvalue.setText(BA.ObjectToCharSequence(_value));
RDebugUtils.currentLine=157548561;
 //BA.debugLineNum = 157548561;BA.debugLine="p.Tag = tagcode";
_p.setTag((Object)(_tagcode));
RDebugUtils.currentLine=157548562;
 //BA.debugLineNum = 157548562;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=157548563;
 //BA.debugLineNum = 157548563;BA.debugLine="End Sub";
return null;
}
public static String  _dialogreqenddatelabel_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialogreqenddatelabel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialogreqenddatelabel_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=157614080;
 //BA.debugLineNum = 157614080;BA.debugLine="Sub DialogReqEndDateLabel_Click";
RDebugUtils.currentLine=157614081;
 //BA.debugLineNum = 157614081;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=157614082;
 //BA.debugLineNum = 157614082;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(mostCurrent._consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=157614083;
 //BA.debugLineNum = 157614083;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=157614084;
 //BA.debugLineNum = 157614084;BA.debugLine="If (DialogReqEndDateLabel.Text  <> \"\") Then";
if (((mostCurrent._dialogreqenddatelabel.getText()).equals("") == false)) { 
RDebugUtils.currentLine=157614085;
 //BA.debugLineNum = 157614085;BA.debugLine="dnow = DateTime.DateParse(DialogReqEndDateLabel.";
_dnow = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(mostCurrent._dialogreqenddatelabel.getText());
 };
RDebugUtils.currentLine=157614087;
 //BA.debugLineNum = 157614087;BA.debugLine="dd.Initialize(\"CalendarGetEndDate\", DateTime.GetY";
_dd.Initialize(mostCurrent.activityBA,"CalendarGetEndDate",anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_dnow),(int) (anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_dnow)-1),anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=157614088;
 //BA.debugLineNum = 157614088;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
anywheresoftware.b4a.keywords.Common.LogImpl("6157614088",BA.NumberToString(_dd.getAccentColor()),0);
RDebugUtils.currentLine=157614089;
 //BA.debugLineNum = 157614089;BA.debugLine="dd.show(\"DialogReqEndDateLabel\")";
_dd.show("DialogReqEndDateLabel");
RDebugUtils.currentLine=157614090;
 //BA.debugLineNum = 157614090;BA.debugLine="End Sub";
return "";
}
public static String  _dialogreqstartdatelabel_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "dialogreqstartdatelabel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "dialogreqstartdatelabel_click", null));}
de.donmanfred.DatePickerDialogWrapper _dd = null;
long _dnow = 0L;
RDebugUtils.currentLine=157679616;
 //BA.debugLineNum = 157679616;BA.debugLine="Sub DialogReqStartDateLabel_Click";
RDebugUtils.currentLine=157679617;
 //BA.debugLineNum = 157679617;BA.debugLine="Dim dd As DatePickerDialog";
_dd = new de.donmanfred.DatePickerDialogWrapper();
RDebugUtils.currentLine=157679618;
 //BA.debugLineNum = 157679618;BA.debugLine="DateTime.DateFormat = Consts.DateTimeFormat";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(mostCurrent._consts._datetimeformat /*String*/ );
RDebugUtils.currentLine=157679619;
 //BA.debugLineNum = 157679619;BA.debugLine="Dim dnow As Long = DateTime.Now";
_dnow = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=157679620;
 //BA.debugLineNum = 157679620;BA.debugLine="If (DialogReqStartDateLabel.Text  <> \"\") Then";
if (((mostCurrent._dialogreqstartdatelabel.getText()).equals("") == false)) { 
RDebugUtils.currentLine=157679621;
 //BA.debugLineNum = 157679621;BA.debugLine="dnow = DateTime.DateParse(DialogReqStartDateLabe";
_dnow = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(mostCurrent._dialogreqstartdatelabel.getText());
 };
RDebugUtils.currentLine=157679623;
 //BA.debugLineNum = 157679623;BA.debugLine="dd.Initialize(\"CalendarGetStartDate\", DateTime.Ge";
_dd.Initialize(mostCurrent.activityBA,"CalendarGetStartDate",anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_dnow),(int) (anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_dnow)-1),anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_dnow));
RDebugUtils.currentLine=157679624;
 //BA.debugLineNum = 157679624;BA.debugLine="Log(dd.AccentColor) ' AccentColor2 = Colors.Blue";
anywheresoftware.b4a.keywords.Common.LogImpl("6157679624",BA.NumberToString(_dd.getAccentColor()),0);
RDebugUtils.currentLine=157679625;
 //BA.debugLineNum = 157679625;BA.debugLine="dd.show(\"DialogReqStartDateLabel\")";
_dd.show("DialogReqStartDateLabel");
RDebugUtils.currentLine=157679626;
 //BA.debugLineNum = 157679626;BA.debugLine="End Sub";
return "";
}
public static String  _editreturn(String _arg) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editreturn", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editreturn", new Object[] {_arg}));}
RDebugUtils.currentLine=151388160;
 //BA.debugLineNum = 151388160;BA.debugLine="Sub EditReturn(arg As String)";
RDebugUtils.currentLine=151388161;
 //BA.debugLineNum = 151388161;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=151388162;
 //BA.debugLineNum = 151388162;BA.debugLine="End Sub";
return "";
}
public static String  _editsearch_enterpressed() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "editsearch_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "editsearch_enterpressed", null));}
RDebugUtils.currentLine=153485312;
 //BA.debugLineNum = 153485312;BA.debugLine="Sub EditSearch_EnterPressed";
RDebugUtils.currentLine=153485313;
 //BA.debugLineNum = 153485313;BA.debugLine="MakeListSearch(EditSearch.Text)";
_makelistsearch(mostCurrent._editsearch.getText());
RDebugUtils.currentLine=153485314;
 //BA.debugLineNum = 153485314;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _filladditionalfields(xevolution.vrcg.devdemov2400.types._requestcla _cla,String _req_tagcode,String _task_tagcode) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "filladditionalfields", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "filladditionalfields", new Object[] {_cla,_req_tagcode,_task_tagcode}));}
ResumableSub_FillAdditionalFields rsub = new ResumableSub_FillAdditionalFields(null,_cla,_req_tagcode,_task_tagcode);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FillAdditionalFields extends BA.ResumableSub {
public ResumableSub_FillAdditionalFields(xevolution.vrcg.devdemov2400.objects parent,xevolution.vrcg.devdemov2400.types._requestcla _cla,String _req_tagcode,String _task_tagcode) {
this.parent = parent;
this._cla = _cla;
this._req_tagcode = _req_tagcode;
this._task_tagcode = _task_tagcode;
}
xevolution.vrcg.devdemov2400.objects parent;
xevolution.vrcg.devdemov2400.types._requestcla _cla;
String _req_tagcode;
String _task_tagcode;
String _obj_tagcode = "";
String _field_client_pse = "";
String _authusr = "";
String _field_edpc_contract_manager = "";
String _field_technical_name = "";
String _field_technical = "";
boolean _data_sysorexec = false;
String _field_reportdate = "";
String _field_reporttime = "";
String _updrv = "";
String _uk = "";
int _repeatcounter = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rupdsvr = null;
boolean _endupdate = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156237825;
 //BA.debugLineNum = 156237825;BA.debugLine="Dim obj_tagcode As String = DBStructures.GetScrip";
_obj_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select object_tagcode from dta_requests where 1=1\n"+"																	and tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'"),"object_tagcode");
RDebugUtils.currentLine=156237828;
 //BA.debugLineNum = 156237828;BA.debugLine="If Utils.NNE(obj_tagcode) Then";
if (true) break;

case 1:
//if
this.state = 16;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_obj_tagcode)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=156237829;
 //BA.debugLineNum = 156237829;BA.debugLine="Dim FIELD_CLIENT_PSE As String = DBStructures.Ge";
_field_client_pse = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select title_import from dta_objects where tagcode\n"+"										in (select parent_tagcode from dta_objects where tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_obj_tagcode))+"')"),"title_import");
RDebugUtils.currentLine=156237832;
 //BA.debugLineNum = 156237832;BA.debugLine="Dim AUTHUSR As String = DBStructures.GetScriptCo";
_authusr = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select value from dta_objects_fields where\n"+"																	object_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_obj_tagcode))+"' and field_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"),"value");
RDebugUtils.currentLine=156237835;
 //BA.debugLineNum = 156237835;BA.debugLine="If Utils.NNE(AUTHUSR) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_authusr)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=156237836;
 //BA.debugLineNum = 156237836;BA.debugLine="Dim FIELD_EDPC_CONTRACT_MANAGER As String = DBS";
_field_edpc_contract_manager = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select name from aut_users where tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_authusr))+"'"),"name");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=156237838;
 //BA.debugLineNum = 156237838;BA.debugLine="Dim FIELD_EDPC_CONTRACT_MANAGER As String = \"\"";
_field_edpc_contract_manager = "";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=156237841;
 //BA.debugLineNum = 156237841;BA.debugLine="Dim FIELD_TECHNICAL_NAME As String = ShareCode.S";
_field_technical_name = parent.mostCurrent._sharecode._sess_oper_username /*String*/ ;
RDebugUtils.currentLine=156237842;
 //BA.debugLineNum = 156237842;BA.debugLine="Dim FIELD_TECHNICAL As String = ShareCode.SESS_O";
_field_technical = parent.mostCurrent._sharecode._sess_oper_user /*String*/ ;
RDebugUtils.currentLine=156237845;
 //BA.debugLineNum = 156237845;BA.debugLine="ShareCode.DEVICE_FIELDREPORTDATETIME_SYSOREXEC =";
parent.mostCurrent._sharecode._device_fieldreportdatetime_sysorexec /*int*/  = (int)(Double.parseDouble(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(parent.mostCurrent._dbstructures._getparamstate /*int*/ (mostCurrent.activityBA,"DEVICE_FIELDREPORTDATETIME_SYSOREXEC")),BA.NumberToString(0))));
RDebugUtils.currentLine=156237846;
 //BA.debugLineNum = 156237846;BA.debugLine="Dim DATA_SYSOREXEC As Boolean = Utils.Int2Bool(S";
_data_sysorexec = parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_fieldreportdatetime_sysorexec /*int*/ );
RDebugUtils.currentLine=156237848;
 //BA.debugLineNum = 156237848;BA.debugLine="If DATA_SYSOREXEC Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_data_sysorexec) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=156237849;
 //BA.debugLineNum = 156237849;BA.debugLine="Dim FIELD_REPORTDATE As String = DBStructures.G";
_field_reportdate = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select execute_date from dta_requests where tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"')"),"execute_date");
RDebugUtils.currentLine=156237850;
 //BA.debugLineNum = 156237850;BA.debugLine="Dim FIELD_REPORTTIME As String = DBStructures.G";
_field_reporttime = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select execute_start from dta_requests where tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"')"),"execute_start");
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=156237852;
 //BA.debugLineNum = 156237852;BA.debugLine="Dim FIELD_REPORTDATE As String = Utils.GetCurre";
_field_reportdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=156237853;
 //BA.debugLineNum = 156237853;BA.debugLine="Dim FIELD_REPORTTIME As String = Utils.GetCurre";
_field_reporttime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=156237857;
 //BA.debugLineNum = 156237857;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
_updrv = ("update dta_requests_values set execute_value = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_client_pse))+"' where 1=1\n"+"								And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"								And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"								And item_tagcode = 'FIELD_CLIENT_PSE'");
RDebugUtils.currentLine=156237861;
 //BA.debugLineNum = 156237861;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_updrv);
RDebugUtils.currentLine=156237862;
 //BA.debugLineNum = 156237862;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"),(int) (100));
this.state = 17;
return;
case 17:
//C
this.state = 16;
;
RDebugUtils.currentLine=156237864;
 //BA.debugLineNum = 156237864;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
_uk = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select unique_key from dta_requests_values where 1=1\n"+"															And	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															And item_tagcode = 'FIELD_CLIENT_PSE'"),"unique_key");
RDebugUtils.currentLine=156237869;
 //BA.debugLineNum = 156237869;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
_repeatcounter = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select repeatcounter from dta_requests_values where 1=1\n"+"															and	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode = 'FIELD_CLIENT_PSE'"),"repeatcounter");
RDebugUtils.currentLine=156237874;
 //BA.debugLineNum = 156237874;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
_rupdsvr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rupdsvr = _actualizasvr_clai_update(_cla,"FIELD_CLIENT_PSE",_uk,_field_client_pse,"",_repeatcounter);
RDebugUtils.currentLine=156237875;
 //BA.debugLineNum = 156237875;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 18;
return;
case 18:
//C
this.state = 16;
_endupdate = (Boolean) result[0];
;
RDebugUtils.currentLine=156237877;
 //BA.debugLineNum = 156237877;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
_updrv = ("update dta_requests_values set execute_value = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_edpc_contract_manager))+"',\n"+"								execute_value_title = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_edpc_contract_manager))+"',\n"+"								object_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_authusr))+"'\n"+"								where 1=1\n"+"								And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"								And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"								And item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'");
RDebugUtils.currentLine=156237884;
 //BA.debugLineNum = 156237884;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_updrv);
RDebugUtils.currentLine=156237885;
 //BA.debugLineNum = 156237885;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"),(int) (100));
this.state = 19;
return;
case 19:
//C
this.state = 16;
;
RDebugUtils.currentLine=156237887;
 //BA.debugLineNum = 156237887;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
_uk = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select unique_key from dta_requests_values where 1=1\n"+"															And	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															And item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"),"unique_key");
RDebugUtils.currentLine=156237892;
 //BA.debugLineNum = 156237892;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
_repeatcounter = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select repeatcounter from dta_requests_values where 1=1\n"+"															and	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode = 'FIELD_EDPC_CONTRACT_MANAGER'"),"repeatcounter");
RDebugUtils.currentLine=156237897;
 //BA.debugLineNum = 156237897;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
_rupdsvr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rupdsvr = _actualizasvr_clai_update(_cla,"FIELD_EDPC_CONTRACT_MANAGER",_uk,_field_edpc_contract_manager,_authusr,_repeatcounter);
RDebugUtils.currentLine=156237898;
 //BA.debugLineNum = 156237898;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 20;
return;
case 20:
//C
this.state = 16;
_endupdate = (Boolean) result[0];
;
RDebugUtils.currentLine=156237901;
 //BA.debugLineNum = 156237901;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
_updrv = ("update dta_requests_values set execute_value = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_reportdate))+"' where 1=1\n"+"								And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"								And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"								And item_tagcode = 'FIELD_REPORTDATE'");
RDebugUtils.currentLine=156237905;
 //BA.debugLineNum = 156237905;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_updrv);
RDebugUtils.currentLine=156237906;
 //BA.debugLineNum = 156237906;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"),(int) (100));
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=156237908;
 //BA.debugLineNum = 156237908;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
_uk = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select unique_key from dta_requests_values where 1=1\n"+"															And	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															And item_tagcode = 'FIELD_REPORTDATE'"),"unique_key");
RDebugUtils.currentLine=156237913;
 //BA.debugLineNum = 156237913;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
_repeatcounter = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select repeatcounter from dta_requests_values where 1=1\n"+"															and	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode = 'FIELD_REPORTDATE'"),"repeatcounter");
RDebugUtils.currentLine=156237918;
 //BA.debugLineNum = 156237918;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
_rupdsvr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rupdsvr = _actualizasvr_clai_update(_cla,"FIELD_REPORTDATE",_uk,_field_reportdate,"",_repeatcounter);
RDebugUtils.currentLine=156237919;
 //BA.debugLineNum = 156237919;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 22;
return;
case 22:
//C
this.state = 16;
_endupdate = (Boolean) result[0];
;
RDebugUtils.currentLine=156237921;
 //BA.debugLineNum = 156237921;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
_updrv = ("update dta_requests_values set execute_value = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_reporttime))+"' where 1=1\n"+"								And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"								And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"								And item_tagcode = 'FIELD_REPORTTIME'");
RDebugUtils.currentLine=156237925;
 //BA.debugLineNum = 156237925;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_updrv);
RDebugUtils.currentLine=156237926;
 //BA.debugLineNum = 156237926;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"),(int) (100));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=156237928;
 //BA.debugLineNum = 156237928;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
_uk = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select unique_key from dta_requests_values where 1=1\n"+"															And	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															And item_tagcode = 'FIELD_REPORTTIME'"),"unique_key");
RDebugUtils.currentLine=156237933;
 //BA.debugLineNum = 156237933;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
_repeatcounter = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select repeatcounter from dta_requests_values where 1=1\n"+"															and	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode = 'FIELD_REPORTTIME'"),"repeatcounter");
RDebugUtils.currentLine=156237938;
 //BA.debugLineNum = 156237938;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
_rupdsvr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rupdsvr = _actualizasvr_clai_update(_cla,"FIELD_REPORTTIME",_uk,_field_reporttime,"",_repeatcounter);
RDebugUtils.currentLine=156237939;
 //BA.debugLineNum = 156237939;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 24;
return;
case 24:
//C
this.state = 16;
_endupdate = (Boolean) result[0];
;
RDebugUtils.currentLine=156237941;
 //BA.debugLineNum = 156237941;BA.debugLine="Dim UpdRV As String = $\"update dta_requests_valu";
_updrv = ("update dta_requests_values set execute_value = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_field_technical_name))+"' where 1=1\n"+"								And request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"								And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"								And item_tagcode = 'FIELD_TECHNICAL'");
RDebugUtils.currentLine=156237945;
 //BA.debugLineNum = 156237945;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(UpdRV)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_updrv);
RDebugUtils.currentLine=156237946;
 //BA.debugLineNum = 156237946;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"),(int) (100));
this.state = 25;
return;
case 25:
//C
this.state = 16;
;
RDebugUtils.currentLine=156237948;
 //BA.debugLineNum = 156237948;BA.debugLine="Dim UK As String = DBStructures.GetScriptColumnS";
_uk = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select unique_key from dta_requests_values where 1=1\n"+"															And	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															And task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															And item_tagcode = 'FIELD_TECHNICAL'"),"unique_key");
RDebugUtils.currentLine=156237953;
 //BA.debugLineNum = 156237953;BA.debugLine="Dim repeatCounter As Int = DBStructures.GetScrip";
_repeatcounter = parent.mostCurrent._dbstructures._getscriptcolumnintevc /*int*/ (mostCurrent.activityBA,("select repeatcounter from dta_requests_values where 1=1\n"+"															and	request_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req_tagcode))+"'\n"+"															and task_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode = 'FIELD_TECHNICAL'"),"repeatcounter");
RDebugUtils.currentLine=156237958;
 //BA.debugLineNum = 156237958;BA.debugLine="Dim RUpdSvr As ResumableSub = ActualizaSvr_CLAI_";
_rupdsvr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rupdsvr = _actualizasvr_clai_update(_cla,"FIELD_TECHNICAL",_uk,_field_technical_name,_field_technical,_repeatcounter);
RDebugUtils.currentLine=156237959;
 //BA.debugLineNum = 156237959;BA.debugLine="Wait For (RUpdSvr) Complete (EndUpdate As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "filladditionalfields"), _rupdsvr);
this.state = 26;
return;
case 26:
//C
this.state = 16;
_endupdate = (Boolean) result[0];
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=156237963;
 //BA.debugLineNum = 156237963;BA.debugLine="Log(\"FillAdditionalFields\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6156237963","FillAdditionalFields",0);
RDebugUtils.currentLine=156237964;
 //BA.debugLineNum = 156237964;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=156237966;
 //BA.debugLineNum = 156237966;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _fitmap_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fitmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "fitmap_click", null));}
RDebugUtils.currentLine=151453696;
 //BA.debugLineNum = 151453696;BA.debugLine="Sub FitMap_Click";
RDebugUtils.currentLine=151453697;
 //BA.debugLineNum = 151453697;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.types._objectinformation  _getobjectmapinfo(String _tagcode) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getobjectmapinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objectinformation) Debug.delegate(mostCurrent.activityBA, "getobjectmapinfo", new Object[] {_tagcode}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _sql = "";
xevolution.vrcg.devdemov2400.types._objectinformation _ret = null;
RDebugUtils.currentLine=152240128;
 //BA.debugLineNum = 152240128;BA.debugLine="Sub GetObjectMapInfo(tagcode As String) As ObjectI";
RDebugUtils.currentLine=152240130;
 //BA.debugLineNum = 152240130;BA.debugLine="Private Record As Cursor";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=152240131;
 //BA.debugLineNum = 152240131;BA.debugLine="ItemsCounter = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=152240132;
 //BA.debugLineNum = 152240132;BA.debugLine="Dim SQL As String = $\"${DBStructures.EVC_SQL_CURR";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._dbstructures._evc_sql_current_objects /*String*/ ))+" where a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=152240133;
 //BA.debugLineNum = 152240133;BA.debugLine="Record = Starter.LocalSQLEVC.ExecQuery(SQL)";
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=152240134;
 //BA.debugLineNum = 152240134;BA.debugLine="If Record.RowCount > 0 Then";
if (_record.getRowCount()>0) { 
RDebugUtils.currentLine=152240135;
 //BA.debugLineNum = 152240135;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=152240136;
 //BA.debugLineNum = 152240136;BA.debugLine="Dim ret As ObjectInformation = Types.MakeObjectI";
_ret = mostCurrent._types._makeobjectinformation /*xevolution.vrcg.devdemov2400.types._objectinformation*/ (mostCurrent.activityBA,_tagcode,_record.GetInt("type"),_record.GetString("name"),_record.GetString("address"),_record.GetString("address2"),_record.GetString("postal_code"),_record.GetString("city"),_record.GetString("contact_phone"),_record.GetString("contact_name"),_record.GetString("latitude"),_record.GetString("longitude"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=152240149;
 //BA.debugLineNum = 152240149;BA.debugLine="Dim ret As ObjectInformation = Types.MakeObjectI";
_ret = mostCurrent._types._makeobjectinformation /*xevolution.vrcg.devdemov2400.types._objectinformation*/ (mostCurrent.activityBA,_tagcode,(int) (0),"","","","","","","","","",anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=152240151;
 //BA.debugLineNum = 152240151;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=152240152;
 //BA.debugLineNum = 152240152;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=152240153;
 //BA.debugLineNum = 152240153;BA.debugLine="End Sub";
return null;
}
public static String  _labeltypeobjectfilter_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "labeltypeobjectfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "labeltypeobjectfilter_click", null));}
RDebugUtils.currentLine=154009600;
 //BA.debugLineNum = 154009600;BA.debugLine="Sub labelTypeObjectFilter_Click";
RDebugUtils.currentLine=154009602;
 //BA.debugLineNum = 154009602;BA.debugLine="If ObjectTypePopMenu.MenuIsOpen Then";
if (mostCurrent._objecttypepopmenu._menuisopen) { 
RDebugUtils.currentLine=154009603;
 //BA.debugLineNum = 154009603;BA.debugLine="ObjectTypePopMenu.CloseMenu";
mostCurrent._objecttypepopmenu._closemenu();
 }else {
RDebugUtils.currentLine=154009605;
 //BA.debugLineNum = 154009605;BA.debugLine="ObjectTypePopMenu.OpenMenu";
mostCurrent._objecttypepopmenu._openmenu();
 };
RDebugUtils.currentLine=154009608;
 //BA.debugLineNum = 154009608;BA.debugLine="End Sub";
return "";
}
public static String  _listbutattachmap_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutattachmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutattachmap_click", null));}
RDebugUtils.currentLine=152829952;
 //BA.debugLineNum = 152829952;BA.debugLine="Sub listButAttachMap_Click";
RDebugUtils.currentLine=152829954;
 //BA.debugLineNum = 152829954;BA.debugLine="End Sub";
return "";
}
public static String  _listbutcontract_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutcontract_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutcontract_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb = null;
String _filename = "";
boolean _continua = false;
xevolution.vrcg.devdemov2400.fileprovider _provider = null;
String _thefile = "";
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
anywheresoftware.b4a.objects.collections.List _pdfappslist = null;
RDebugUtils.currentLine=153157632;
 //BA.debugLineNum = 153157632;BA.debugLine="Sub listButContract_Click";
RDebugUtils.currentLine=153157634;
 //BA.debugLineNum = 153157634;BA.debugLine="Dim l As Label = Sender";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=153157636;
 //BA.debugLineNum = 153157636;BA.debugLine="Log(l.Tag)";
anywheresoftware.b4a.keywords.Common.LogImpl("6153157636",BA.ObjectToString(_l.getTag()),0);
RDebugUtils.currentLine=153157637;
 //BA.debugLineNum = 153157637;BA.debugLine="Dim p As Panel  = l.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_l.getParent()));
RDebugUtils.currentLine=153157639;
 //BA.debugLineNum = 153157639;BA.debugLine="Dim lidb As Label = p.GetView(8)";
_lidb = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (8)).getObject()));
RDebugUtils.currentLine=153157641;
 //BA.debugLineNum = 153157641;BA.debugLine="Dim Filename As String = lidb.Tag";
_filename = BA.ObjectToString(_lidb.getTag());
RDebugUtils.currentLine=153157642;
 //BA.debugLineNum = 153157642;BA.debugLine="Dim Continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=153157643;
 //BA.debugLineNum = 153157643;BA.debugLine="If Continua Then";
if (_continua) { 
RDebugUtils.currentLine=153157644;
 //BA.debugLineNum = 153157644;BA.debugLine="Private Provider As FileProvider";
_provider = new xevolution.vrcg.devdemov2400.fileprovider();
RDebugUtils.currentLine=153157645;
 //BA.debugLineNum = 153157645;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=153157646;
 //BA.debugLineNum = 153157646;BA.debugLine="Provider.InitializeSafeDir";
_provider._initializesafedir /*String*/ (null);
RDebugUtils.currentLine=153157647;
 //BA.debugLineNum = 153157647;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
_thefile = BA.ObjectToString(_provider._getfileuri /*Object*/ (null,_filename));
RDebugUtils.currentLine=153157649;
 //BA.debugLineNum = 153157649;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6153157649",_thefile,0);
RDebugUtils.currentLine=153157650;
 //BA.debugLineNum = 153157650;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=153157651;
 //BA.debugLineNum = 153157651;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
_intent1.Initialize(_intent1.ACTION_VIEW,"file://"+_thefile);
RDebugUtils.currentLine=153157652;
 //BA.debugLineNum = 153157652;BA.debugLine="Intent1.SetType(\"application/pdf\")";
_intent1.SetType("application/pdf");
RDebugUtils.currentLine=153157653;
 //BA.debugLineNum = 153157653;BA.debugLine="Dim pdfAppsList As List";
_pdfappslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=153157654;
 //BA.debugLineNum = 153157654;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
_pdfappslist = mostCurrent._utils._queryintent /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_intent1);
RDebugUtils.currentLine=153157655;
 //BA.debugLineNum = 153157655;BA.debugLine="If pdfAppsList.size>0 Then";
if (_pdfappslist.getSize()>0) { 
RDebugUtils.currentLine=153157657;
 //BA.debugLineNum = 153157657;BA.debugLine="Log(\"pdf viewer(s) exists\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6153157657","pdf viewer(s) exists",0);
RDebugUtils.currentLine=153157658;
 //BA.debugLineNum = 153157658;BA.debugLine="StartActivity(Intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
 };
 };
RDebugUtils.currentLine=153157662;
 //BA.debugLineNum = 153157662;BA.debugLine="End Sub";
return "";
}
public static String  _listbutcontract2_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutcontract2_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutcontract2_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lidb = null;
String _filename = "";
boolean _continua = false;
xevolution.vrcg.devdemov2400.fileprovider _provider = null;
String _thefile = "";
anywheresoftware.b4a.objects.IntentWrapper _intent1 = null;
anywheresoftware.b4a.objects.collections.List _pdfappslist = null;
RDebugUtils.currentLine=153288704;
 //BA.debugLineNum = 153288704;BA.debugLine="Sub listButContract2_Click";
RDebugUtils.currentLine=153288705;
 //BA.debugLineNum = 153288705;BA.debugLine="Dim l As Label = Sender";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=153288707;
 //BA.debugLineNum = 153288707;BA.debugLine="Log(l.Tag)";
anywheresoftware.b4a.keywords.Common.LogImpl("6153288707",BA.ObjectToString(_l.getTag()),0);
RDebugUtils.currentLine=153288708;
 //BA.debugLineNum = 153288708;BA.debugLine="Dim p As Panel  = l.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_l.getParent()));
RDebugUtils.currentLine=153288710;
 //BA.debugLineNum = 153288710;BA.debugLine="Dim lidb As Label = p.GetView(3)";
_lidb = new anywheresoftware.b4a.objects.LabelWrapper();
_lidb = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (3)).getObject()));
RDebugUtils.currentLine=153288712;
 //BA.debugLineNum = 153288712;BA.debugLine="Dim Filename As String = lidb.Tag";
_filename = BA.ObjectToString(_lidb.getTag());
RDebugUtils.currentLine=153288713;
 //BA.debugLineNum = 153288713;BA.debugLine="Dim Continua As Boolean = True";
_continua = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=153288714;
 //BA.debugLineNum = 153288714;BA.debugLine="If Continua Then";
if (_continua) { 
RDebugUtils.currentLine=153288715;
 //BA.debugLineNum = 153288715;BA.debugLine="Private Provider As FileProvider";
_provider = new xevolution.vrcg.devdemov2400.fileprovider();
RDebugUtils.currentLine=153288716;
 //BA.debugLineNum = 153288716;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (null,processBA);
RDebugUtils.currentLine=153288717;
 //BA.debugLineNum = 153288717;BA.debugLine="Provider.InitializeSafeDir";
_provider._initializesafedir /*String*/ (null);
RDebugUtils.currentLine=153288718;
 //BA.debugLineNum = 153288718;BA.debugLine="Dim theFile As String = Provider.GetFileUri(File";
_thefile = BA.ObjectToString(_provider._getfileuri /*Object*/ (null,_filename));
RDebugUtils.currentLine=153288720;
 //BA.debugLineNum = 153288720;BA.debugLine="Log(theFile)";
anywheresoftware.b4a.keywords.Common.LogImpl("6153288720",_thefile,0);
RDebugUtils.currentLine=153288721;
 //BA.debugLineNum = 153288721;BA.debugLine="Dim Intent1 As Intent";
_intent1 = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=153288722;
 //BA.debugLineNum = 153288722;BA.debugLine="Intent1.Initialize(Intent1.ACTION_VIEW, \"file://";
_intent1.Initialize(_intent1.ACTION_VIEW,"file://"+_thefile);
RDebugUtils.currentLine=153288723;
 //BA.debugLineNum = 153288723;BA.debugLine="Intent1.SetType(\"application/pdf\")";
_intent1.SetType("application/pdf");
RDebugUtils.currentLine=153288724;
 //BA.debugLineNum = 153288724;BA.debugLine="Dim pdfAppsList As List";
_pdfappslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=153288725;
 //BA.debugLineNum = 153288725;BA.debugLine="pdfAppsList = Utils.QueryIntent(Intent1)";
_pdfappslist = mostCurrent._utils._queryintent /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_intent1);
RDebugUtils.currentLine=153288726;
 //BA.debugLineNum = 153288726;BA.debugLine="If pdfAppsList.size>0 Then";
if (_pdfappslist.getSize()>0) { 
RDebugUtils.currentLine=153288728;
 //BA.debugLineNum = 153288728;BA.debugLine="Log(\"pdf viewer(s) exists\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6153288728","pdf viewer(s) exists",0);
RDebugUtils.currentLine=153288729;
 //BA.debugLineNum = 153288729;BA.debugLine="StartActivity(Intent1)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(_intent1.getObject()));
 };
 };
RDebugUtils.currentLine=153288732;
 //BA.debugLineNum = 153288732;BA.debugLine="End Sub";
return "";
}
public static String  _listbutdocuments_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutdocuments_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutdocuments_click", null));}
RDebugUtils.currentLine=153092096;
 //BA.debugLineNum = 153092096;BA.debugLine="Sub listButDocuments_Click";
RDebugUtils.currentLine=153092098;
 //BA.debugLineNum = 153092098;BA.debugLine="End Sub";
return "";
}
public static String  _listbutinfo_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutinfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutinfo_click", null));}
RDebugUtils.currentLine=152371200;
 //BA.debugLineNum = 152371200;BA.debugLine="Sub listButInfo_Click";
RDebugUtils.currentLine=152371202;
 //BA.debugLineNum = 152371202;BA.debugLine="End Sub";
return "";
}
public static String  _listbutinfomap_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutinfomap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutinfomap_click", null));}
RDebugUtils.currentLine=152895488;
 //BA.debugLineNum = 152895488;BA.debugLine="Sub listButInfoMap_Click";
RDebugUtils.currentLine=152895490;
 //BA.debugLineNum = 152895490;BA.debugLine="End Sub";
return "";
}
public static String  _listbutmap_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutmap_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
xevolution.vrcg.devdemov2400.types._objectinformation _ret = null;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cp = null;
RDebugUtils.currentLine=152305664;
 //BA.debugLineNum = 152305664;BA.debugLine="Sub listButMap_Click";
RDebugUtils.currentLine=152305665;
 //BA.debugLineNum = 152305665;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=152305666;
 //BA.debugLineNum = 152305666;BA.debugLine="Dim p As Panel  = b.Parent";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_b.getParent()));
RDebugUtils.currentLine=152305667;
 //BA.debugLineNum = 152305667;BA.debugLine="Dim ret As ObjectInformation = GetObjectMapInfo(p";
_ret = _getobjectmapinfo(BA.ObjectToString(_p.getTag()));
RDebugUtils.currentLine=152305669;
 //BA.debugLineNum = 152305669;BA.debugLine="If Not(Utils.isNullOrEmpty(ret.Latitude)) And Not";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_ret.Latitude /*String*/ )) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_ret.Longitude /*String*/ ))) { 
RDebugUtils.currentLine=152305670;
 //BA.debugLineNum = 152305670;BA.debugLine="listsTabPanel.ScrollTo(2, True)";
mostCurrent._liststabpanel.ScrollTo((int) (2),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=152305672;
 //BA.debugLineNum = 152305672;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=152305673;
 //BA.debugLineNum = 152305673;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=152305674;
 //BA.debugLineNum = 152305674;BA.debugLine="cp.Initialize(ret.Latitude, ret.Longitude, 17)";
_cp.Initialize((double)(Double.parseDouble(_ret.Latitude /*String*/ )),(double)(Double.parseDouble(_ret.Longitude /*String*/ )),(float) (17));
RDebugUtils.currentLine=152305675;
 //BA.debugLineNum = 152305675;BA.debugLine="gmap.MoveCamera(cp)";
mostCurrent._gmap.MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
 };
 };
RDebugUtils.currentLine=152305679;
 //BA.debugLineNum = 152305679;BA.debugLine="End Sub";
return "";
}
public static void  _listbutprerequestdownload_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutprerequestdownload_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "listbutprerequestdownload_click", null); return;}
ResumableSub_listButPreRequestDownload_Click rsub = new ResumableSub_listButPreRequestDownload_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_listButPreRequestDownload_Click extends BA.ResumableSub {
public ResumableSub_listButPreRequestDownload_Click(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;
anywheresoftware.b4a.objects.ButtonWrapper _bb = null;
String _reqtagcode = "";
int _i = 0;
String _currdate = "";
String _currtime = "";
String _entitytag = "";
String _objecttag = "";
String _typerequest_tagcode = "";
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
xevolution.vrcg.devdemov2400.types._requestcla _cla = null;
boolean _continuarexec = false;
int _registos = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _incolitems = null;
int _id = 0;
int _tasktype = 0;
int _status_id = 0;
String _tagcode = "";
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
int _repeatcounter = 0;
xevolution.vrcg.devdemov2400.types._requesttaskinfo _clainfo = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record9 = null;
int _ni = 0;
String _do_name = "";
String _do_field = "";
int _do_is_additional = 0;
String _task_tagcode = "";
String _item_tagcode = "";
String _unique_key = "";
String _inssql = "";
String _objsql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record99 = null;
int _nii = 0;
String _val = "";
String _newsql = "";
int step148;
int limit148;
int step183;
int limit183;
int step208;
int limit208;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=157286401;
 //BA.debugLineNum = 157286401;BA.debugLine="Dim bb As Button = Sender";
_bb = new anywheresoftware.b4a.objects.ButtonWrapper();
_bb = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=157286402;
 //BA.debugLineNum = 157286402;BA.debugLine="If Utils.NNE(bb.Tag) Then";
if (true) break;

case 1:
//if
this.state = 112;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,BA.ObjectToString(_bb.getTag()))) { 
this.state = 3;
}else {
this.state = 111;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=157286403;
 //BA.debugLineNum = 157286403;BA.debugLine="Dim ReqTagcode As String = bb.Tag";
_reqtagcode = BA.ObjectToString(_bb.getTag());
RDebugUtils.currentLine=157286404;
 //BA.debugLineNum = 157286404;BA.debugLine="Dim i As Int = Msgbox2(ShareCode.objectsMsgConfi";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectsmsgconfirmaatribuicaoasi /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),parent.mostCurrent._sharecode._option_yes /*String*/ ,parent.mostCurrent._sharecode._option_no /*String*/ ,parent.mostCurrent._sharecode._option_yesexec /*String*/ ,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=157286405;
 //BA.debugLineNum = 157286405;BA.debugLine="If (i=DialogResponse.POSITIVE) Or (i=DialogRespo";
if (true) break;

case 4:
//if
this.state = 109;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) || (_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=157286407;
 //BA.debugLineNum = 157286407;BA.debugLine="ProgressDialogShow2(ShareCode.objectMsgPreparar";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectmsgprepararinter /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=157286408;
 //BA.debugLineNum = 157286408;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "listbutprerequestdownload_click"),(int) (250));
this.state = 113;
return;
case 113:
//C
this.state = 7;
;
RDebugUtils.currentLine=157286409;
 //BA.debugLineNum = 157286409;BA.debugLine="Dim CurrDate As String = Utils.GetDate(DateTime";
_currdate = parent.mostCurrent._utils._getdate /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=157286410;
 //BA.debugLineNum = 157286410;BA.debugLine="Dim CurrTime As String = Utils.GetCurrentTime";
_currtime = parent.mostCurrent._utils._getcurrenttime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=157286411;
 //BA.debugLineNum = 157286411;BA.debugLine="Dim EntityTag As String = DBStructures.GetScrip";
_entitytag = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select\n"+"										Case WHEN (entity_tagcode <> '') and (entity_tagcode is not null) THEN entity_tagcode \n"+"										ELSE '__NONE__' End  as entity_tagcode\n"+"										from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqtagcode))+"'"),"entity_tagcode");
RDebugUtils.currentLine=157286416;
 //BA.debugLineNum = 157286416;BA.debugLine="Dim ObjectTag As String = DBStructures.GetScrip";
_objecttag = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select\n"+"										Case WHEN (object_tagcode <> '') and (object_tagcode is not null) THEN object_tagcode \n"+"										ELSE '__NONE__' End  as object_tagcode\n"+"										from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqtagcode))+"'"),"object_tagcode");
RDebugUtils.currentLine=157286421;
 //BA.debugLineNum = 157286421;BA.debugLine="Dim typerequest_tagcode As String = DBStructure";
_typerequest_tagcode = parent.mostCurrent._dbstructures._getscriptcolumnstrevc /*String*/ (mostCurrent.activityBA,("select typerequest_tagcode\n"+"										from dta_requests where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqtagcode))+"'"),"typerequest_tagcode");
RDebugUtils.currentLine=157286424;
 //BA.debugLineNum = 157286424;BA.debugLine="Dim sSQL As String = $\"update dta_requests set";
_ssql = ("update dta_requests set state_id=4, technical_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"',\n"+"							entity_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_entitytag))+"', \n"+"							object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttag))+"', \n"+"							execute_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currdate))+"', \n"+"							execute_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currtime))+"' \n"+"							where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqtagcode))+"'");
RDebugUtils.currentLine=157286431;
 //BA.debugLineNum = 157286431;BA.debugLine="Utils.SaveSQLToLog(\"CLAItemButton_StateClick\",s";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CLAItemButton_StateClick",_ssql,_reqtagcode.trim());
RDebugUtils.currentLine=157286433;
 //BA.debugLineNum = 157286433;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157286434;
 //BA.debugLineNum = 157286434;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=157286435;
 //BA.debugLineNum = 157286435;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=157286436;
 //BA.debugLineNum = 157286436;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=157286437;
 //BA.debugLineNum = 157286437;BA.debugLine="params.Put(\"ACLARequest\", ReqTagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_reqtagcode));
RDebugUtils.currentLine=157286438;
 //BA.debugLineNum = 157286438;BA.debugLine="params.Put(\"ACLAExecDate\", CurrDate)";
_params.Put((Object)("ACLAExecDate"),(Object)(_currdate));
RDebugUtils.currentLine=157286439;
 //BA.debugLineNum = 157286439;BA.debugLine="params.Put(\"ACLAExecHour\", CurrTime)";
_params.Put((Object)("ACLAExecHour"),(Object)(_currtime));
RDebugUtils.currentLine=157286440;
 //BA.debugLineNum = 157286440;BA.debugLine="params.Put(\"ACLAEntity\", EntityTag)";
_params.Put((Object)("ACLAEntity"),(Object)(_entitytag));
RDebugUtils.currentLine=157286441;
 //BA.debugLineNum = 157286441;BA.debugLine="params.Put(\"ACLAObject\", ObjectTag)";
_params.Put((Object)("ACLAObject"),(Object)(_objecttag));
RDebugUtils.currentLine=157286442;
 //BA.debugLineNum = 157286442;BA.debugLine="params.Put(\"ACLSessUser\", ShareCode.SESS_OPER_U";
_params.Put((Object)("ACLSessUser"),(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ));
RDebugUtils.currentLine=157286443;
 //BA.debugLineNum = 157286443;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcod";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=157286444;
 //BA.debugLineNum = 157286444;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthori";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=157286445;
 //BA.debugLineNum = 157286445;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=157286446;
 //BA.debugLineNum = 157286446;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=157286447;
 //BA.debugLineNum = 157286447;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=157286448;
 //BA.debugLineNum = 157286448;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacA";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=157286449;
 //BA.debugLineNum = 157286449;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=157286450;
 //BA.debugLineNum = 157286450;BA.debugLine="Dim Url As String = $\"https://${ShareCode.APP_D";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/assign");
RDebugUtils.currentLine=157286451;
 //BA.debugLineNum = 157286451;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 7:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=157286452;
 //BA.debugLineNum = 157286452;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", ReqTagco";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,objects.getObject(),_url,"",_reqtagcode);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=157286454;
 //BA.debugLineNum = 157286454;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_reqtagcode.trim(),"","");
RDebugUtils.currentLine=157286455;
 //BA.debugLineNum = 157286455;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(params)";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=157286457;
 //BA.debugLineNum = 157286457;BA.debugLine="Sleep(1500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "listbutprerequestdownload_click"),(int) (1500));
this.state = 114;
return;
case 114:
//C
this.state = 13;
;
RDebugUtils.currentLine=157286458;
 //BA.debugLineNum = 157286458;BA.debugLine="If (i=DialogResponse.NEGATIVE) Then";
if (true) break;

case 13:
//if
this.state = 108;
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
this.state = 15;
}else {
this.state = 107;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=157286459;
 //BA.debugLineNum = 157286459;BA.debugLine="Dim sSQL As String = DBStructures.EVC_SQL_GETR";
_ssql = parent.mostCurrent._dbstructures._evc_sql_getrequests_data_tasks /*String*/ ;
RDebugUtils.currentLine=157286460;
 //BA.debugLineNum = 157286460;BA.debugLine="sSQL = $\"${sSQL} and z.request_tagcode='${ReqT";
_ssql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+" and z.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reqtagcode))+"'");
RDebugUtils.currentLine=157286461;
 //BA.debugLineNum = 157286461;BA.debugLine="Log(sSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286461",_ssql,0);
RDebugUtils.currentLine=157286462;
 //BA.debugLineNum = 157286462;BA.debugLine="Log(ReqTagcode)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286462",_reqtagcode,0);
RDebugUtils.currentLine=157286463;
 //BA.debugLineNum = 157286463;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(\"";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,"_NOACTION_","_NOACTION_","_NOACTION_",(int) (0),(int) (0),parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,(int) (0),"",(int) (0),parent.mostCurrent._consts._colorwhite /*int*/ ),parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),(int) (0),(int) (0),BA.NumberToString(0),anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1)),parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=157286468;
 //BA.debugLineNum = 157286468;BA.debugLine="Dim ContinuarExec As Boolean = True";
_continuarexec = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=157286469;
 //BA.debugLineNum = 157286469;BA.debugLine="Dim Registos As Int = 0";
_registos = (int) (0);
RDebugUtils.currentLine=157286471;
 //BA.debugLineNum = 157286471;BA.debugLine="Private incolitems As Cursor = Starter.LocalSQ";
_incolitems = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_incolitems = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=157286472;
 //BA.debugLineNum = 157286472;BA.debugLine="If (incolitems.RowCount>0) Then";
if (true) break;

case 16:
//if
this.state = 31;
if ((_incolitems.getRowCount()>0)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=157286473;
 //BA.debugLineNum = 157286473;BA.debugLine="incolitems.Position = 0";
_incolitems.setPosition((int) (0));
RDebugUtils.currentLine=157286474;
 //BA.debugLineNum = 157286474;BA.debugLine="Dim ID As Int = incolitems.GetInt(\"id\")";
_id = _incolitems.GetInt("id");
RDebugUtils.currentLine=157286475;
 //BA.debugLineNum = 157286475;BA.debugLine="Dim tasktype As Int = incolitems.GetInt(\"type";
_tasktype = _incolitems.GetInt("type");
RDebugUtils.currentLine=157286476;
 //BA.debugLineNum = 157286476;BA.debugLine="Dim status_id As Int = incolitems.GetInt(\"sta";
_status_id = _incolitems.GetInt("status_id");
RDebugUtils.currentLine=157286477;
 //BA.debugLineNum = 157286477;BA.debugLine="Dim tagcode As String = incolitems.GetString(";
_tagcode = _incolitems.GetString("tagcode");
RDebugUtils.currentLine=157286478;
 //BA.debugLineNum = 157286478;BA.debugLine="Dim actionkey As String = incolitems.GetStrin";
_actionkey = _incolitems.GetString("action_tagcode");
RDebugUtils.currentLine=157286479;
 //BA.debugLineNum = 157286479;BA.debugLine="Dim task As String = incolitems.GetString(\"ta";
_task = _incolitems.GetString("task_tagcode");
RDebugUtils.currentLine=157286480;
 //BA.debugLineNum = 157286480;BA.debugLine="Dim name As String = incolitems.GetString(\"na";
_name = _incolitems.GetString("name");
RDebugUtils.currentLine=157286483;
 //BA.debugLineNum = 157286483;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurrDa";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=157286484;
 //BA.debugLineNum = 157286484;BA.debugLine="Private sACLALatitude As String = Utils.IfNul";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=157286485;
 //BA.debugLineNum = 157286485;BA.debugLine="Private sACLALongitude As String = Utils.IfNu";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=157286487;
 //BA.debugLineNum = 157286487;BA.debugLine="Dim sDate As String = Utils.GetCurrentDate";
_sdate = parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=157286488;
 //BA.debugLineNum = 157286488;BA.debugLine="Dim sTime As String = Utils.GetCurrentTimeExt";
_stime = parent.mostCurrent._utils._getcurrenttimeext /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=157286490;
 //BA.debugLineNum = 157286490;BA.debugLine="Dim close_type As Int = incolitems.GetInt(\"cl";
_close_type = _incolitems.GetInt("close_type");
RDebugUtils.currentLine=157286491;
 //BA.debugLineNum = 157286491;BA.debugLine="Dim result_type As Int = incolitems.GetInt(\"r";
_result_type = _incolitems.GetInt("result_type");
RDebugUtils.currentLine=157286492;
 //BA.debugLineNum = 157286492;BA.debugLine="Dim result_values As String = incolitems.GetS";
_result_values = _incolitems.GetString("result_values");
RDebugUtils.currentLine=157286493;
 //BA.debugLineNum = 157286493;BA.debugLine="Dim repeatcounter As Int = incolitems.GetInt(";
_repeatcounter = _incolitems.GetInt("repeatcounter");
RDebugUtils.currentLine=157286495;
 //BA.debugLineNum = 157286495;BA.debugLine="Dim CLAInfo As RequestTaskInfo = Types.MakeRe";
_clainfo = parent.mostCurrent._types._makerequesttaskinfo /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ (mostCurrent.activityBA,(int) (2),_close_type,_result_type,_result_values,anywheresoftware.b4a.keywords.Common.False,(int) (0),(float) (0),(int) (0),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(anywheresoftware.b4a.keywords.Common.Null)),(int) (-1));
RDebugUtils.currentLine=157286496;
 //BA.debugLineNum = 157286496;BA.debugLine="Dim CLA As RequestCLA = Types.MakeRequestCLA(";
_cla = parent.mostCurrent._types._makerequestcla /*xevolution.vrcg.devdemov2400.types._requestcla*/ (mostCurrent.activityBA,_tagcode,_actionkey,_task,_repeatcounter,_tasktype,parent.mostCurrent._types._makeinterv /*xevolution.vrcg.devdemov2400.types._intervention*/ (mostCurrent.activityBA,_id,_tagcode,_status_id,parent.mostCurrent._utils._colorint /*int*/ (mostCurrent.activityBA,_status_id)),_clainfo,parent.mostCurrent._types._makeothercla /*xevolution.vrcg.devdemov2400.types._othercla*/ (mostCurrent.activityBA,"","",""));
RDebugUtils.currentLine=157286500;
 //BA.debugLineNum = 157286500;BA.debugLine="Dim sSQL As String = $\"update dta_requests se";
_ssql = ("update dta_requests set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'");
RDebugUtils.currentLine=157286502;
 //BA.debugLineNum = 157286502;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=157286503;
 //BA.debugLineNum = 157286503;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"										where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'");
RDebugUtils.currentLine=157286505;
 //BA.debugLineNum = 157286505;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=157286506;
 //BA.debugLineNum = 157286506;BA.debugLine="Log(\"Grava Status na BD local Request\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286506","Grava Status na BD local Request",0);
RDebugUtils.currentLine=157286507;
 //BA.debugLineNum = 157286507;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157286508;
 //BA.debugLineNum = 157286508;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=157286509;
 //BA.debugLineNum = 157286509;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=157286510;
 //BA.debugLineNum = 157286510;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=157286511;
 //BA.debugLineNum = 157286511;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=157286512;
 //BA.debugLineNum = 157286512;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=157286513;
 //BA.debugLineNum = 157286513;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=157286514;
 //BA.debugLineNum = 157286514;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=157286515;
 //BA.debugLineNum = 157286515;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=157286516;
 //BA.debugLineNum = 157286516;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=157286517;
 //BA.debugLineNum = 157286517;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=157286518;
 //BA.debugLineNum = 157286518;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagc";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=157286519;
 //BA.debugLineNum = 157286519;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAutho";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=157286520;
 //BA.debugLineNum = 157286520;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=157286521;
 //BA.debugLineNum = 157286521;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=157286522;
 //BA.debugLineNum = 157286522;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=157286523;
 //BA.debugLineNum = 157286523;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMa";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=157286524;
 //BA.debugLineNum = 157286524;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=157286525;
 //BA.debugLineNum = 157286525;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 24;
this.catchState = 23;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 24;
this.catchState = 23;
RDebugUtils.currentLine=157286526;
 //BA.debugLineNum = 157286526;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=157286527;
 //BA.debugLineNum = 157286527;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=157286529;
 //BA.debugLineNum = 157286529;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286529",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=157286530;
 //BA.debugLineNum = 157286530;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=157286531;
 //BA.debugLineNum = 157286531;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=157286532;
 //BA.debugLineNum = 157286532;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
RDebugUtils.currentLine=157286533;
 //BA.debugLineNum = 157286533;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
RDebugUtils.currentLine=157286535;
 //BA.debugLineNum = 157286535;BA.debugLine="CLA.Info.Map1 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=157286537;
 //BA.debugLineNum = 157286537;BA.debugLine="Dim sSQL As String = $\"update dta_requests_re";
_ssql = ("update dta_requests_relations set status_id=2, run_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_sdate))+"', run_start='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_stime))+"'\n"+"								where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and relation_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"' and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"");
RDebugUtils.currentLine=157286539;
 //BA.debugLineNum = 157286539;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(sSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_ssql);
RDebugUtils.currentLine=157286540;
 //BA.debugLineNum = 157286540;BA.debugLine="Log(\"Grava Status na BD local Request-Relatio";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286540","Grava Status na BD local Request-Relation",0);
RDebugUtils.currentLine=157286542;
 //BA.debugLineNum = 157286542;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157286543;
 //BA.debugLineNum = 157286543;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=157286544;
 //BA.debugLineNum = 157286544;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=157286545;
 //BA.debugLineNum = 157286545;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=157286546;
 //BA.debugLineNum = 157286546;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=157286547;
 //BA.debugLineNum = 157286547;BA.debugLine="params.Put(\"ACLAAction\", actionkey)";
_params.Put((Object)("ACLAAction"),(Object)(_actionkey));
RDebugUtils.currentLine=157286548;
 //BA.debugLineNum = 157286548;BA.debugLine="params.Put(\"ACLAState\", 2)";
_params.Put((Object)("ACLAState"),(Object)(2));
RDebugUtils.currentLine=157286549;
 //BA.debugLineNum = 157286549;BA.debugLine="params.Put(\"ACLAUser\", ShareCode.SESS_User)";
_params.Put((Object)("ACLAUser"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=157286550;
 //BA.debugLineNum = 157286550;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=157286551;
 //BA.debugLineNum = 157286551;BA.debugLine="params.Put(\"ACLADate\", sDate)";
_params.Put((Object)("ACLADate"),(Object)(_sdate));
RDebugUtils.currentLine=157286552;
 //BA.debugLineNum = 157286552;BA.debugLine="params.Put(\"ACLATime\", sTime)";
_params.Put((Object)("ACLATime"),(Object)(_stime));
RDebugUtils.currentLine=157286553;
 //BA.debugLineNum = 157286553;BA.debugLine="params.Put(\"ACLAFirst\", 1)";
_params.Put((Object)("ACLAFirst"),(Object)(1));
RDebugUtils.currentLine=157286554;
 //BA.debugLineNum = 157286554;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagc";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=157286555;
 //BA.debugLineNum = 157286555;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAutho";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=157286556;
 //BA.debugLineNum = 157286556;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=157286557;
 //BA.debugLineNum = 157286557;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=157286558;
 //BA.debugLineNum = 157286558;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=157286559;
 //BA.debugLineNum = 157286559;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMa";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=157286560;
 //BA.debugLineNum = 157286560;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=157286561;
 //BA.debugLineNum = 157286561;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=157286562;
 //BA.debugLineNum = 157286562;BA.debugLine="Try";
if (true) break;

case 25:
//try
this.state = 30;
this.catchState = 29;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 30;
this.catchState = 29;
RDebugUtils.currentLine=157286563;
 //BA.debugLineNum = 157286563;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=157286564;
 //BA.debugLineNum = 157286564;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=157286565;
 //BA.debugLineNum = 157286565;BA.debugLine="Utils.logError(\"ACLALatitude - ACLALongitude";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"ACLALatitude - ACLALongitude",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
RDebugUtils.currentLine=157286567;
 //BA.debugLineNum = 157286567;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286567",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=157286568;
 //BA.debugLineNum = 157286568;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=157286569;
 //BA.debugLineNum = 157286569;BA.debugLine="params.Put(\"ACLALatitude\", \"\")";
_params.Put((Object)("ACLALatitude"),(Object)(""));
RDebugUtils.currentLine=157286570;
 //BA.debugLineNum = 157286570;BA.debugLine="params.Put(\"ACLALongitude\", \"\")";
_params.Put((Object)("ACLALongitude"),(Object)(""));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 0;
;
RDebugUtils.currentLine=157286572;
 //BA.debugLineNum = 157286572;BA.debugLine="CLA.Info.Map2 = params";
_cla.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/ .Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=157286573;
 //BA.debugLineNum = 157286573;BA.debugLine="CLA.Status.status = 2";
_cla.Status /*xevolution.vrcg.devdemov2400.types._intervention*/ .status /*int*/  = (int) (2);
RDebugUtils.currentLine=157286574;
 //BA.debugLineNum = 157286574;BA.debugLine="Registos = Registos + 1";
_registos = (int) (_registos+1);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=157286576;
 //BA.debugLineNum = 157286576;BA.debugLine="incolitems.Close";
_incolitems.Close();
RDebugUtils.currentLine=157286577;
 //BA.debugLineNum = 157286577;BA.debugLine="ContinuarExec = Registos > 0";
_continuarexec = _registos>0;
RDebugUtils.currentLine=157286579;
 //BA.debugLineNum = 157286579;BA.debugLine="If ContinuarExec Then";
if (true) break;

case 32:
//if
this.state = 105;
if (_continuarexec) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=157286581;
 //BA.debugLineNum = 157286581;BA.debugLine="If Utils.NNE(ObjectTag) And Not(ObjectTag = \"";
if (true) break;

case 35:
//if
this.state = 98;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_objecttag) && anywheresoftware.b4a.keywords.Common.Not((_objecttag).equals("__NONE__"))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=157286582;
 //BA.debugLineNum = 157286582;BA.debugLine="Private Record9 As Cursor";
_record9 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=157286583;
 //BA.debugLineNum = 157286583;BA.debugLine="Dim sSQL As String = $\"SELECT b.connectmode,";
_ssql = ("SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,\n"+"										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title\n"+"										FROM dta_tasks_items AS a\n"+"										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)\n"+"										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or\n"+"										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'");
RDebugUtils.currentLine=157286589;
 //BA.debugLineNum = 157286589;BA.debugLine="Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL";
_record9 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=157286590;
 //BA.debugLineNum = 157286590;BA.debugLine="If Record9.RowCount > 0 Then";
if (true) break;

case 38:
//if
this.state = 97;
if (_record9.getRowCount()>0) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=157286591;
 //BA.debugLineNum = 157286591;BA.debugLine="For ni = 0 To Record9.RowCount-1";
if (true) break;

case 41:
//for
this.state = 96;
step148 = 1;
limit148 = (int) (_record9.getRowCount()-1);
_ni = (int) (0) ;
this.state = 115;
if (true) break;

case 115:
//C
this.state = 96;
if ((step148 > 0 && _ni <= limit148) || (step148 < 0 && _ni >= limit148)) this.state = 43;
if (true) break;

case 116:
//C
this.state = 115;
_ni = ((int)(0 + _ni + step148)) ;
if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=157286592;
 //BA.debugLineNum = 157286592;BA.debugLine="Record9.Position = ni";
_record9.setPosition(_ni);
RDebugUtils.currentLine=157286593;
 //BA.debugLineNum = 157286593;BA.debugLine="Dim do_name As String = Record9.GetString(";
_do_name = _record9.GetString("do_name");
RDebugUtils.currentLine=157286594;
 //BA.debugLineNum = 157286594;BA.debugLine="Dim do_field As String = Record9.GetString";
_do_field = _record9.GetString("do_field");
RDebugUtils.currentLine=157286595;
 //BA.debugLineNum = 157286595;BA.debugLine="Dim do_is_additional As Int = Record9.GetI";
_do_is_additional = _record9.GetInt("do_is_additional");
RDebugUtils.currentLine=157286596;
 //BA.debugLineNum = 157286596;BA.debugLine="Dim task_tagcode As String = Record9.GetSt";
_task_tagcode = _record9.GetString("task_tagcode");
RDebugUtils.currentLine=157286597;
 //BA.debugLineNum = 157286597;BA.debugLine="Dim item_tagcode As String = Record9.GetSt";
_item_tagcode = _record9.GetString("item_tagcode");
RDebugUtils.currentLine=157286598;
 //BA.debugLineNum = 157286598;BA.debugLine="Dim unique_key As String = Record9.GetStri";
_unique_key = _record9.GetString("unique_key");
RDebugUtils.currentLine=157286600;
 //BA.debugLineNum = 157286600;BA.debugLine="If (do_name.ToUpperCase = \"__TYPEREQUEST__";
if (true) break;

case 44:
//if
this.state = 95;
if (((_do_name.toUpperCase()).equals("__TYPEREQUEST__"))) { 
this.state = 46;
}else {
this.state = 68;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=157286602;
 //BA.debugLineNum = 157286602;BA.debugLine="Dim insSQL As String = $\"insert into dta_";
_inssql = ("insert into dta_requests_fields (id, request_tagcode, field_tagcode)\n"+"														Select id, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' as request_tagcode, field_tagcode \n"+"														from dta_typerequests_fields where typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_typerequest_tagcode))+"' \n"+"														And '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'||field_tagcode not in \n"+"															(Select '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'||field_tagcode as campo \n"+"															from dta_requests_fields\n"+"															where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')");
RDebugUtils.currentLine=157286610;
 //BA.debugLineNum = 157286610;BA.debugLine="Utils.SaveSQLToLog(\"CriaCamposAdicionais\"";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CriaCamposAdicionais",_inssql,_tagcode);
RDebugUtils.currentLine=157286611;
 //BA.debugLineNum = 157286611;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=157286612;
 //BA.debugLineNum = 157286612;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=157286613;
 //BA.debugLineNum = 157286613;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=157286614;
 //BA.debugLineNum = 157286614;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=157286615;
 //BA.debugLineNum = 157286615;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=157286616;
 //BA.debugLineNum = 157286616;BA.debugLine="params.Put(\"ACLARequestType\", typerequest";
_params.Put((Object)("ACLARequestType"),(Object)(_typerequest_tagcode));
RDebugUtils.currentLine=157286617;
 //BA.debugLineNum = 157286617;BA.debugLine="params.Put(\"versionTagcode\", Main.Version";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=157286618;
 //BA.debugLineNum = 157286618;BA.debugLine="params.Put(\"_authorization\", Main.DeviceA";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=157286619;
 //BA.debugLineNum = 157286619;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstan";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=157286620;
 //BA.debugLineNum = 157286620;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBra";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=157286621;
 //BA.debugLineNum = 157286621;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceMod";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=157286622;
 //BA.debugLineNum = 157286622;BA.debugLine="params.put(\"_deviceMacAddress\", Main.Devi";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=157286623;
 //BA.debugLineNum = 157286623;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=157286624;
 //BA.debugLineNum = 157286624;BA.debugLine="Dim Url As String = $\"https://${ShareCode";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/cla-fields/create");
RDebugUtils.currentLine=157286625;
 //BA.debugLineNum = 157286625;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 47:
//if
this.state = 52;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=157286626;
 //BA.debugLineNum = 157286626;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", ta";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,objects.getObject(),_url,"",_tagcode);
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=157286628;
 //BA.debugLineNum = 157286628;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Ma";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=157286629;
 //BA.debugLineNum = 157286629;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(p";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=157286631;
 //BA.debugLineNum = 157286631;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "listbutprerequestdownload_click"),(int) (500));
this.state = 117;
return;
case 117:
//C
this.state = 53;
;
RDebugUtils.currentLine=157286633;
 //BA.debugLineNum = 157286633;BA.debugLine="Dim ObjSQL As String = $\"select distinct";
_objsql = ("select distinct value from dta_requests_fields where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_typerequest_tagcode))+"' and field_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+"'");
RDebugUtils.currentLine=157286634;
 //BA.debugLineNum = 157286634;BA.debugLine="Private Record99 As Cursor = Starter.Loca";
_record99 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record99 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_objsql)));
RDebugUtils.currentLine=157286635;
 //BA.debugLineNum = 157286635;BA.debugLine="If Record99.RowCount > 0 Then";
if (true) break;

case 53:
//if
this.state = 66;
if (_record99.getRowCount()>0) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=157286636;
 //BA.debugLineNum = 157286636;BA.debugLine="For nii = 0 To Record99.RowCount-1";
if (true) break;

case 56:
//for
this.state = 65;
step183 = 1;
limit183 = (int) (_record99.getRowCount()-1);
_nii = (int) (0) ;
this.state = 118;
if (true) break;

case 118:
//C
this.state = 65;
if ((step183 > 0 && _nii <= limit183) || (step183 < 0 && _nii >= limit183)) this.state = 58;
if (true) break;

case 119:
//C
this.state = 118;
_nii = ((int)(0 + _nii + step183)) ;
if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=157286637;
 //BA.debugLineNum = 157286637;BA.debugLine="Record99.Position = nii";
_record99.setPosition(_nii);
RDebugUtils.currentLine=157286638;
 //BA.debugLineNum = 157286638;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty";
_val = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record99.GetString("value"),"");
RDebugUtils.currentLine=157286639;
 //BA.debugLineNum = 157286639;BA.debugLine="Dim NewSQL As String = $\"update dta_req";
_newsql = ("update dta_requests_values set execute_status=1, execute_value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_val))+"'\n"+"															where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' \n"+"															and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'\n"+"															and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode))+"'\n"+"															and unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_unique_key))+"'\n"+"															and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+" ");
RDebugUtils.currentLine=157286646;
 //BA.debugLineNum = 157286646;BA.debugLine="Try";
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
RDebugUtils.currentLine=157286647;
 //BA.debugLineNum = 157286647;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(NewSQ";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_newsql);
 if (true) break;

case 63:
//C
this.state = 64;
this.catchState = 0;
RDebugUtils.currentLine=157286649;
 //BA.debugLineNum = 157286649;BA.debugLine="Log($\"Erro de campo: ${LastException}\"";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286649",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 64:
//C
this.state = 119;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 65:
//C
this.state = 66;
;
 if (true) break;

case 66:
//C
this.state = 95;
;
RDebugUtils.currentLine=157286653;
 //BA.debugLineNum = 157286653;BA.debugLine="Record99.Close";
_record99.Close();
 if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=157286655;
 //BA.debugLineNum = 157286655;BA.debugLine="If (do_is_additional = 1) Then";
if (true) break;

case 69:
//if
this.state = 80;
if ((_do_is_additional==1)) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 80;
RDebugUtils.currentLine=157286656;
 //BA.debugLineNum = 157286656;BA.debugLine="Dim ObjSQL As String = $\"select distinct";
_objsql = ("select distinct `value` from dta_objects_fields where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttag))+"' and field_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+"'");
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=157286658;
 //BA.debugLineNum = 157286658;BA.debugLine="If Utils.FieldInList(do_field, \"address|";
if (true) break;

case 74:
//if
this.state = 79;
if (parent.mostCurrent._utils._fieldinlist /*boolean*/ (mostCurrent.activityBA,_do_field,"address|address2|postalcode|phone|local|latitude|longitude|block|floor|door")) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=157286660;
 //BA.debugLineNum = 157286660;BA.debugLine="Dim ObjSQL As String = $\"select distinc";
_objsql = ("select distinct "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+" as `value` from dta_locations where tagcode in\n"+"																	(select local_tagcode from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttag))+"')");
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=157286663;
 //BA.debugLineNum = 157286663;BA.debugLine="Dim ObjSQL As String = $\"select distinc";
_objsql = ("select distinct "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+" as `value` from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttag))+"'");
 if (true) break;

case 79:
//C
this.state = 80;
;
RDebugUtils.currentLine=157286665;
 //BA.debugLineNum = 157286665;BA.debugLine="Log(ObjSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286665",_objsql,0);
 if (true) break;

case 80:
//C
this.state = 81;
;
RDebugUtils.currentLine=157286668;
 //BA.debugLineNum = 157286668;BA.debugLine="Private Record99 As Cursor = Starter.Loca";
_record99 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record99 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_objsql)));
RDebugUtils.currentLine=157286669;
 //BA.debugLineNum = 157286669;BA.debugLine="If Record99.RowCount > 0 Then";
if (true) break;

case 81:
//if
this.state = 94;
if (_record99.getRowCount()>0) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=157286670;
 //BA.debugLineNum = 157286670;BA.debugLine="For nii = 0 To Record99.RowCount-1";
if (true) break;

case 84:
//for
this.state = 93;
step208 = 1;
limit208 = (int) (_record99.getRowCount()-1);
_nii = (int) (0) ;
this.state = 120;
if (true) break;

case 120:
//C
this.state = 93;
if ((step208 > 0 && _nii <= limit208) || (step208 < 0 && _nii >= limit208)) this.state = 86;
if (true) break;

case 121:
//C
this.state = 120;
_nii = ((int)(0 + _nii + step208)) ;
if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=157286671;
 //BA.debugLineNum = 157286671;BA.debugLine="Record99.Position = nii";
_record99.setPosition(_nii);
RDebugUtils.currentLine=157286672;
 //BA.debugLineNum = 157286672;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty";
_val = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record99.GetString("value"),"");
RDebugUtils.currentLine=157286673;
 //BA.debugLineNum = 157286673;BA.debugLine="Dim NewSQL As String = $\"update dta_req";
_newsql = ("update dta_requests_values set execute_status=1, execute_value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_val))+"', object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttag))+"'\n"+"															where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' \n"+"															and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'\n"+"															and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode))+"'\n"+"															and unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_unique_key))+"'\n"+"															and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+" ");
RDebugUtils.currentLine=157286680;
 //BA.debugLineNum = 157286680;BA.debugLine="Log(NewSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286680",_newsql,0);
RDebugUtils.currentLine=157286681;
 //BA.debugLineNum = 157286681;BA.debugLine="Try";
if (true) break;

case 87:
//try
this.state = 92;
this.catchState = 91;
this.state = 89;
if (true) break;

case 89:
//C
this.state = 92;
this.catchState = 91;
RDebugUtils.currentLine=157286682;
 //BA.debugLineNum = 157286682;BA.debugLine="Utils.SaveSQLToLog(\"ListaPrincipal_Ite";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"ListaPrincipal_ItemClick",_newsql,_tagcode);
 if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
RDebugUtils.currentLine=157286685;
 //BA.debugLineNum = 157286685;BA.debugLine="Log($\"Erro de campo: ${LastException}\"";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286685",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 92:
//C
this.state = 121;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;

case 94:
//C
this.state = 95;
;
RDebugUtils.currentLine=157286689;
 //BA.debugLineNum = 157286689;BA.debugLine="Record99.Close";
_record99.Close();
 if (true) break;

case 95:
//C
this.state = 116;
;
 if (true) break;
if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
RDebugUtils.currentLine=157286694;
 //BA.debugLineNum = 157286694;BA.debugLine="Record9.Close";
_record9.Close();
 if (true) break;

case 98:
//C
this.state = 99;
;
RDebugUtils.currentLine=157286697;
 //BA.debugLineNum = 157286697;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=157286698;
 //BA.debugLineNum = 157286698;BA.debugLine="Try";
if (true) break;

case 99:
//try
this.state = 104;
this.catchState = 103;
this.state = 101;
if (true) break;

case 101:
//C
this.state = 104;
this.catchState = 103;
RDebugUtils.currentLine=157286699;
 //BA.debugLineNum = 157286699;BA.debugLine="CallSubDelayed3(CheckList3, \"StartCLA_Activi";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"StartCLA_Activity",(Object)(_cla),(Object)(_name));
 if (true) break;

case 103:
//C
this.state = 104;
this.catchState = 0;
RDebugUtils.currentLine=157286701;
 //BA.debugLineNum = 157286701;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6157286701",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=157286702;
 //BA.debugLineNum = 157286702;BA.debugLine="Utils.WriteErrors2Log(LastException)";
parent.mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
RDebugUtils.currentLine=157286703;
 //BA.debugLineNum = 157286703;BA.debugLine="Utils.logError(\"Call StartCLA_Activity\", Sha";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Call StartCLA_Activity",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 if (true) break;
if (true) break;

case 104:
//C
this.state = 105;
this.catchState = 0;
;
 if (true) break;

case 105:
//C
this.state = 108;
;
 if (true) break;

case 107:
//C
this.state = 108;
RDebugUtils.currentLine=157286707;
 //BA.debugLineNum = 157286707;BA.debugLine="MakePreRequestTaskList(0, 0, 0, \"\", \"\", \"\")";
_makeprerequesttasklist((int) (0),(int) (0),(int) (0),"","","");
 if (true) break;

case 108:
//C
this.state = 109;
;
RDebugUtils.currentLine=157286709;
 //BA.debugLineNum = 157286709;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 109:
//C
this.state = 112;
;
 if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=157286712;
 //BA.debugLineNum = 157286712;BA.debugLine="MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo,";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._objectsavisopedidoseminfo /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 112:
//C
this.state = -1;
;
RDebugUtils.currentLine=157286714;
 //BA.debugLineNum = 157286714;BA.debugLine="End Sub";
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
public static String  _listbutprerequestview_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutprerequestview_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutprerequestview_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _bb = null;
RDebugUtils.currentLine=157220864;
 //BA.debugLineNum = 157220864;BA.debugLine="Sub listButPreRequestView_Click";
RDebugUtils.currentLine=157220865;
 //BA.debugLineNum = 157220865;BA.debugLine="Dim bb As Button = Sender";
_bb = new anywheresoftware.b4a.objects.ButtonWrapper();
_bb = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=157220866;
 //BA.debugLineNum = 157220866;BA.debugLine="If Utils.NNE(bb.Tag) Then";
if (mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,BA.ObjectToString(_bb.getTag()))) { 
RDebugUtils.currentLine=157220867;
 //BA.debugLineNum = 157220867;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPlease,";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(mostCurrent._sharecode._generalwaitplease /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=157220868;
 //BA.debugLineNum = 157220868;BA.debugLine="ShowRequestInfoDialog(bb.Tag, \"Informação do Ped";
_showrequestinfodialog(BA.ObjectToString(_bb.getTag()),"Informação do Pedido",(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._listsbasepanel.getObject())));
RDebugUtils.currentLine=157220869;
 //BA.debugLineNum = 157220869;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 }else {
RDebugUtils.currentLine=157220871;
 //BA.debugLineNum = 157220871;BA.debugLine="MsgboxAsync(ShareCode.objectsAvisoPedidoSemInfo,";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(mostCurrent._sharecode._objectsavisopedidoseminfo /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 };
RDebugUtils.currentLine=157220873;
 //BA.debugLineNum = 157220873;BA.debugLine="End Sub";
return "";
}
public static void  _showrequestinfodialog(String _tagcode,String _title,anywheresoftware.b4a.objects.B4XViewWrapper _parentdialog) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showrequestinfodialog", false))
	 {Debug.delegate(mostCurrent.activityBA, "showrequestinfodialog", new Object[] {_tagcode,_title,_parentdialog}); return;}
ResumableSub_ShowRequestInfoDialog rsub = new ResumableSub_ShowRequestInfoDialog(null,_tagcode,_title,_parentdialog);
rsub.resume(processBA, null);
}
public static class ResumableSub_ShowRequestInfoDialog extends BA.ResumableSub {
public ResumableSub_ShowRequestInfoDialog(xevolution.vrcg.devdemov2400.objects parent,String _tagcode,String _title,anywheresoftware.b4a.objects.B4XViewWrapper _parentdialog) {
this.parent = parent;
this._tagcode = _tagcode;
this._title = _title;
this._parentdialog = _parentdialog;
}
xevolution.vrcg.devdemov2400.objects parent;
String _tagcode;
String _title;
anywheresoftware.b4a.objects.B4XViewWrapper _parentdialog;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _dialogpanel = null;
String _sql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record = null;
String _request_desc = "";
String _name = "";
String _nameobject = "";
String _request_date = "";
String _request_stime = "";
String _details = "";
String _sql2 = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record2 = null;
int _n = 0;
int _res = 0;
int step26;
int limit26;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=157483011;
 //BA.debugLineNum = 157483011;BA.debugLine="Dim sf As Object = ThisDialog.ShowAsync(title, Sh";
_sf = parent.mostCurrent._thisdialog.ShowAsync(_title,parent.mostCurrent._sharecode._option_confirm /*String*/ ,parent.mostCurrent._sharecode._option_cancel /*String*/ ,"",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=157483012;
 //BA.debugLineNum = 157483012;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Cons";
parent.mostCurrent._utils._setdialogcolors /*String*/ (mostCurrent.activityBA,_sf,parent.mostCurrent._consts._colorwhite /*int*/ ,parent.mostCurrent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=157483013;
 //BA.debugLineNum = 157483013;BA.debugLine="ThisDialog.SetSize(70%x, 80%y)";
parent.mostCurrent._thisdialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (80),mostCurrent.activityBA));
RDebugUtils.currentLine=157483014;
 //BA.debugLineNum = 157483014;BA.debugLine="Wait For Dialog_Ready (DialogPanel As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "showrequestinfodialog"), null);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_dialogpanel = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=157483015;
 //BA.debugLineNum = 157483015;BA.debugLine="DialogPanel.LoadLayout(\"Request_Information_View\"";
_dialogpanel.LoadLayout("Request_Information_View",mostCurrent.activityBA);
RDebugUtils.currentLine=157483017;
 //BA.debugLineNum = 157483017;BA.debugLine="Dim SQL As String = $\"${DBStructures.EVC_SQL_GETP";
_sql = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._dbstructures._evc_sql_getprerequests_data_new /*String*/ ))+" and a.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' ");
RDebugUtils.currentLine=157483018;
 //BA.debugLineNum = 157483018;BA.debugLine="Private Record As Cursor = Starter.LocalSQLEVC.Ex";
_record = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql)));
RDebugUtils.currentLine=157483019;
 //BA.debugLineNum = 157483019;BA.debugLine="If (Record.RowCount>=1) Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_record.getRowCount()>=1)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=157483020;
 //BA.debugLineNum = 157483020;BA.debugLine="Record.Position = 0";
_record.setPosition((int) (0));
RDebugUtils.currentLine=157483021;
 //BA.debugLineNum = 157483021;BA.debugLine="Dim tagcode As String = Record.GetString(\"tagcod";
_tagcode = _record.GetString("tagcode");
RDebugUtils.currentLine=157483022;
 //BA.debugLineNum = 157483022;BA.debugLine="Dim request_desc As String = Record.GetString(\"r";
_request_desc = _record.GetString("request_desc");
RDebugUtils.currentLine=157483023;
 //BA.debugLineNum = 157483023;BA.debugLine="Dim name As String = Record.GetString(\"name\")";
_name = _record.GetString("name");
RDebugUtils.currentLine=157483024;
 //BA.debugLineNum = 157483024;BA.debugLine="Dim nameobject As String = Record.GetString(\"nam";
_nameobject = _record.GetString("nameobject");
RDebugUtils.currentLine=157483025;
 //BA.debugLineNum = 157483025;BA.debugLine="Dim request_date As String = Record.GetString(\"r";
_request_date = _record.GetString("request_date");
RDebugUtils.currentLine=157483026;
 //BA.debugLineNum = 157483026;BA.debugLine="Dim request_stime As String = Record.GetString(\"";
_request_stime = _record.GetString("request_stime");
RDebugUtils.currentLine=157483027;
 //BA.debugLineNum = 157483027;BA.debugLine="Dim details As String = Record.GetString(\"detail";
_details = _record.GetString("details");
RDebugUtils.currentLine=157483029;
 //BA.debugLineNum = 157483029;BA.debugLine="LabelPreRequestNumber.Text = tagcode";
parent.mostCurrent._labelprerequestnumber.setText(BA.ObjectToCharSequence(_tagcode));
RDebugUtils.currentLine=157483030;
 //BA.debugLineNum = 157483030;BA.debugLine="LabelPreRequestType.Text = request_desc";
parent.mostCurrent._labelprerequesttype.setText(BA.ObjectToCharSequence(_request_desc));
RDebugUtils.currentLine=157483031;
 //BA.debugLineNum = 157483031;BA.debugLine="LabelPreRequestEntity.Text = name";
parent.mostCurrent._labelprerequestentity.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=157483032;
 //BA.debugLineNum = 157483032;BA.debugLine="LabelPreRequestObject.Text = nameobject";
parent.mostCurrent._labelprerequestobject.setText(BA.ObjectToCharSequence(_nameobject));
RDebugUtils.currentLine=157483033;
 //BA.debugLineNum = 157483033;BA.debugLine="LabelPreRequestDateTime.Text = $\"${request_date}";
parent.mostCurrent._labelprerequestdatetime.setText(BA.ObjectToCharSequence((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_date))+" / "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_stime))+"")));
RDebugUtils.currentLine=157483034;
 //BA.debugLineNum = 157483034;BA.debugLine="LabelPreRequestDetails.Text = details";
parent.mostCurrent._labelprerequestdetails.setText(BA.ObjectToCharSequence(_details));
RDebugUtils.currentLine=157483037;
 //BA.debugLineNum = 157483037;BA.debugLine="Dim SQL2 As String = $\"${DBStructures.EVC_QL_CUR";
_sql2 = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._dbstructures._evc_ql_current_request_properties /*String*/ ))+" and b.tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' ");
RDebugUtils.currentLine=157483038;
 //BA.debugLineNum = 157483038;BA.debugLine="Private Record2 As Cursor = Starter.LocalSQLEVC.";
_record2 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record2 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_sql2)));
RDebugUtils.currentLine=157483039;
 //BA.debugLineNum = 157483039;BA.debugLine="If (Record2.RowCount>=1) Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_record2.getRowCount()>=1)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=157483040;
 //BA.debugLineNum = 157483040;BA.debugLine="For n=0 To Record2.RowCount-1";
if (true) break;

case 7:
//for
this.state = 10;
step26 = 1;
limit26 = (int) (_record2.getRowCount()-1);
_n = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if ((step26 > 0 && _n <= limit26) || (step26 < 0 && _n >= limit26)) this.state = 9;
if (true) break;

case 19:
//C
this.state = 18;
_n = ((int)(0 + _n + step26)) ;
if (true) break;

case 9:
//C
this.state = 19;
RDebugUtils.currentLine=157483041;
 //BA.debugLineNum = 157483041;BA.debugLine="Record2.Position = n";
_record2.setPosition(_n);
RDebugUtils.currentLine=157483042;
 //BA.debugLineNum = 157483042;BA.debugLine="listOfFields.Add( CreateShowRequestInfoField(R";
parent.mostCurrent._listoffields._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createshowrequestinfofield(_record2,parent.mostCurrent._listoffields._asview()).getObject())),(Object)(""));
 if (true) break;
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
RDebugUtils.currentLine=157483045;
 //BA.debugLineNum = 157483045;BA.debugLine="Record2.Close";
_record2.Close();
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=157483047;
 //BA.debugLineNum = 157483047;BA.debugLine="Record.Close";
_record.Close();
RDebugUtils.currentLine=157483048;
 //BA.debugLineNum = 157483048;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "showrequestinfodialog"), _sf);
this.state = 20;
return;
case 20:
//C
this.state = 13;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=157483049;
 //BA.debugLineNum = 157483049;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=157483052;
 //BA.debugLineNum = 157483052;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _listbutpreselect_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutpreselect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutpreselect_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
RDebugUtils.currentLine=157351936;
 //BA.debugLineNum = 157351936;BA.debugLine="Sub listButPreSelect_Click";
RDebugUtils.currentLine=157351937;
 //BA.debugLineNum = 157351937;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=157351938;
 //BA.debugLineNum = 157351938;BA.debugLine="btn = Sender";
_btn = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=157351940;
 //BA.debugLineNum = 157351940;BA.debugLine="If btn.Text = Chr(0xF046) Then";
if ((_btn.getText()).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))))) { 
RDebugUtils.currentLine=157351941;
 //BA.debugLineNum = 157351941;BA.debugLine="btn.Text = Chr(0xF096)";
_btn.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf096))));
 }else {
RDebugUtils.currentLine=157351943;
 //BA.debugLineNum = 157351943;BA.debugLine="btn.Text = Chr(0xF046)";
_btn.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))));
 };
RDebugUtils.currentLine=157351946;
 //BA.debugLineNum = 157351946;BA.debugLine="SetPreReqList";
_setprereqlist();
RDebugUtils.currentLine=157351948;
 //BA.debugLineNum = 157351948;BA.debugLine="End Sub";
return "";
}
public static String  _setprereqlist() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setprereqlist", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setprereqlist", null));}
int _inx = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
int _i = 0;
RDebugUtils.currentLine=157417472;
 //BA.debugLineNum = 157417472;BA.debugLine="Sub SetPreReqList";
RDebugUtils.currentLine=157417474;
 //BA.debugLineNum = 157417474;BA.debugLine="LstPreReqs2Download.Clear";
mostCurrent._lstprereqs2download.Clear();
RDebugUtils.currentLine=157417475;
 //BA.debugLineNum = 157417475;BA.debugLine="For inx=0 To listRequests.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (mostCurrent._listrequests._getsize()-1);
_inx = (int) (0) ;
for (;_inx <= limit2 ;_inx = _inx + step2 ) {
RDebugUtils.currentLine=157417476;
 //BA.debugLineNum = 157417476;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=157417477;
 //BA.debugLineNum = 157417477;BA.debugLine="p = listRequests.GetPanel(inx)";
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listrequests._getpanel(_inx).getObject()));
RDebugUtils.currentLine=157417478;
 //BA.debugLineNum = 157417478;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=157417479;
 //BA.debugLineNum = 157417479;BA.debugLine="b = p.GetView(0)";
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=157417480;
 //BA.debugLineNum = 157417480;BA.debugLine="If b.Text = Chr(0xF046) Then ' Selected";
if ((_b.getText()).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))))) { 
RDebugUtils.currentLine=157417481;
 //BA.debugLineNum = 157417481;BA.debugLine="LstPreReqs2Download.Add(b.Tag)";
mostCurrent._lstprereqs2download.Add(_b.getTag());
 };
 }
};
RDebugUtils.currentLine=157417485;
 //BA.debugLineNum = 157417485;BA.debugLine="For i=0 To LstPreReqs2Download.Size -1";
{
final int step11 = 1;
final int limit11 = (int) (mostCurrent._lstprereqs2download.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=157417486;
 //BA.debugLineNum = 157417486;BA.debugLine="Log(LstPreReqs2Download.Get(i))";
anywheresoftware.b4a.keywords.Common.LogImpl("6157417486",BA.ObjectToString(mostCurrent._lstprereqs2download.Get(_i)),0);
 }
};
RDebugUtils.currentLine=157417489;
 //BA.debugLineNum = 157417489;BA.debugLine="If LstPreReqs2Download.Size >= 1 Then";
if (mostCurrent._lstprereqs2download.getSize()>=1) { 
RDebugUtils.currentLine=157417490;
 //BA.debugLineNum = 157417490;BA.debugLine="CLAButtonRequestDownload.Enabled = True";
mostCurrent._clabuttonrequestdownload.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=157417491;
 //BA.debugLineNum = 157417491;BA.debugLine="CLAButtonRequestDownload.Visible = True";
mostCurrent._clabuttonrequestdownload.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=157417493;
 //BA.debugLineNum = 157417493;BA.debugLine="CLAButtonRequestDownload.Enabled = False";
mostCurrent._clabuttonrequestdownload.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=157417494;
 //BA.debugLineNum = 157417494;BA.debugLine="CLAButtonRequestDownload.Visible = False";
mostCurrent._clabuttonrequestdownload.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=157417497;
 //BA.debugLineNum = 157417497;BA.debugLine="End Sub";
return "";
}
public static String  _listbutpreselectall_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutpreselectall_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutpreselectall_click", null));}
RDebugUtils.currentLine=157089792;
 //BA.debugLineNum = 157089792;BA.debugLine="Sub listButPreSelectAll_Click";
RDebugUtils.currentLine=157089793;
 //BA.debugLineNum = 157089793;BA.debugLine="If listButPreSelectAll.Text = Chr(0xF046) Then";
if ((mostCurrent._listbutpreselectall.getText()).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))))) { 
RDebugUtils.currentLine=157089794;
 //BA.debugLineNum = 157089794;BA.debugLine="listButPreSelectAll.Text = Chr(0xF096)";
mostCurrent._listbutpreselectall.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf096))));
RDebugUtils.currentLine=157089795;
 //BA.debugLineNum = 157089795;BA.debugLine="SetAllPreReqSelect(False)";
_setallprereqselect(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=157089797;
 //BA.debugLineNum = 157089797;BA.debugLine="listButPreSelectAll.Text = Chr(0xF046)";
mostCurrent._listbutpreselectall.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf046))));
RDebugUtils.currentLine=157089798;
 //BA.debugLineNum = 157089798;BA.debugLine="SetAllPreReqSelect(True)";
_setallprereqselect(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=157089800;
 //BA.debugLineNum = 157089800;BA.debugLine="SetPreReqList";
_setprereqlist();
RDebugUtils.currentLine=157089801;
 //BA.debugLineNum = 157089801;BA.debugLine="End Sub";
return "";
}
public static String  _listbutselect_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listbutselect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listbutselect_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _thsibut = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _ival = 0;
RDebugUtils.currentLine=155123712;
 //BA.debugLineNum = 155123712;BA.debugLine="Sub listButSelect_Click";
RDebugUtils.currentLine=155123713;
 //BA.debugLineNum = 155123713;BA.debugLine="Dim thsibut As Button = Sender";
_thsibut = new anywheresoftware.b4a.objects.ButtonWrapper();
_thsibut = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=155123714;
 //BA.debugLineNum = 155123714;BA.debugLine="Dim lst As List = Regex.Split(\"\\|\", thsibut.Tag)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",BA.ObjectToString(_thsibut.getTag())));
RDebugUtils.currentLine=155123715;
 //BA.debugLineNum = 155123715;BA.debugLine="If (lst.Size > 0) Then";
if ((_lst.getSize()>0)) { 
RDebugUtils.currentLine=155123716;
 //BA.debugLineNum = 155123716;BA.debugLine="Dim ival As Int = lst.Get(1)";
_ival = (int)(BA.ObjectToNumber(_lst.Get((int) (1))));
RDebugUtils.currentLine=155123717;
 //BA.debugLineNum = 155123717;BA.debugLine="If (ival = 0) Then";
if ((_ival==0)) { 
RDebugUtils.currentLine=155123718;
 //BA.debugLineNum = 155123718;BA.debugLine="thsibut.Tag = $\"${lst.Get(0)}|1\"$";
_thsibut.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lst.Get((int) (0)))+"|1")));
RDebugUtils.currentLine=155123720;
 //BA.debugLineNum = 155123720;BA.debugLine="thsibut.TextColor = Consts.ColorRed";
_thsibut.setTextColor(mostCurrent._consts._colorred /*int*/ );
RDebugUtils.currentLine=155123721;
 //BA.debugLineNum = 155123721;BA.debugLine="SelectedObjectsCount = SelectedObjectsCount + 1";
_selectedobjectscount = (int) (_selectedobjectscount+1);
 }else {
RDebugUtils.currentLine=155123723;
 //BA.debugLineNum = 155123723;BA.debugLine="thsibut.Tag = $\"${lst.Get(0)}|0\"$";
_thsibut.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",_lst.Get((int) (0)))+"|0")));
RDebugUtils.currentLine=155123726;
 //BA.debugLineNum = 155123726;BA.debugLine="thsibut.TextColor = 0xFFBEBEBE";
_thsibut.setTextColor((int) (0xffbebebe));
RDebugUtils.currentLine=155123727;
 //BA.debugLineNum = 155123727;BA.debugLine="SelectedObjectsCount = SelectedObjectsCount - 1";
_selectedobjectscount = (int) (_selectedobjectscount-1);
 };
RDebugUtils.currentLine=155123729;
 //BA.debugLineNum = 155123729;BA.debugLine="Log(thsibut.Tag)";
anywheresoftware.b4a.keywords.Common.LogImpl("6155123729",BA.ObjectToString(_thsibut.getTag()),0);
 };
RDebugUtils.currentLine=155123731;
 //BA.debugLineNum = 155123731;BA.debugLine="UpdateExtraButtons";
_updateextrabuttons();
RDebugUtils.currentLine=155123732;
 //BA.debugLineNum = 155123732;BA.debugLine="End Sub";
return "";
}
public static String  _listcontracts_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listcontracts_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listcontracts_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=153223168;
 //BA.debugLineNum = 153223168;BA.debugLine="Sub listContracts_ItemClick (Index As Int, Value A";
RDebugUtils.currentLine=153223170;
 //BA.debugLineNum = 153223170;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_click", null));}
RDebugUtils.currentLine=152174592;
 //BA.debugLineNum = 152174592;BA.debugLine="Sub ListItemPanel_Click";
RDebugUtils.currentLine=152174594;
 //BA.debugLineNum = 152174594;BA.debugLine="End Sub";
return "";
}
public static String  _listitempanel_longclick() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitempanel_longclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitempanel_longclick", null));}
RDebugUtils.currentLine=152436736;
 //BA.debugLineNum = 152436736;BA.debugLine="Sub ListItemPanel_LongClick";
RDebugUtils.currentLine=152436738;
 //BA.debugLineNum = 152436738;BA.debugLine="End Sub";
return "";
}
public static String  _listitemselected(anywheresoftware.b4a.objects.PanelWrapper _pan) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listitemselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listitemselected", new Object[] {_pan}));}
int _index = 0;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=152961024;
 //BA.debugLineNum = 152961024;BA.debugLine="Sub ListItemSelected(pan As Panel)";
RDebugUtils.currentLine=152961025;
 //BA.debugLineNum = 152961025;BA.debugLine="For index= 0 To listObjects.GetSize-1";
{
final int step1 = 1;
final int limit1 = (int) (mostCurrent._listobjects._getsize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
RDebugUtils.currentLine=152961026;
 //BA.debugLineNum = 152961026;BA.debugLine="Dim p As Panel = listObjects.GetPanel(index)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listobjects._getpanel(_index).getObject()));
RDebugUtils.currentLine=152961027;
 //BA.debugLineNum = 152961027;BA.debugLine="p.Color = Consts.ColorWhite";
_p.setColor(mostCurrent._consts._colorwhite /*int*/ );
 }
};
RDebugUtils.currentLine=152961029;
 //BA.debugLineNum = 152961029;BA.debugLine="pan.Color = Consts.ColorCianSoftLight";
_pan.setColor(mostCurrent._consts._colorciansoftlight /*int*/ );
RDebugUtils.currentLine=152961030;
 //BA.debugLineNum = 152961030;BA.debugLine="WindowStatusUpdate";
_windowstatusupdate();
RDebugUtils.currentLine=152961031;
 //BA.debugLineNum = 152961031;BA.debugLine="End Sub";
return "";
}
public static String  _listobjects_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listobjects_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listobjects_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=153026560;
 //BA.debugLineNum = 153026560;BA.debugLine="Sub listObjects_ItemClick (Index As Int, Value As";
RDebugUtils.currentLine=153026561;
 //BA.debugLineNum = 153026561;BA.debugLine="CurrentLineItem = Index + 1";
_currentlineitem = (int) (_index+1);
RDebugUtils.currentLine=153026562;
 //BA.debugLineNum = 153026562;BA.debugLine="Dim pnl As Panel = listObjects.GetPanel(Index)";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listobjects._getpanel(_index).getObject()));
RDebugUtils.currentLine=153026563;
 //BA.debugLineNum = 153026563;BA.debugLine="CallSubDelayed2(ObjectEdit, \"StartObjectActivity\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._objectedit.getObject()),"StartObjectActivity",_pnl.getTag());
RDebugUtils.currentLine=153026564;
 //BA.debugLineNum = 153026564;BA.debugLine="ShareCode.SetAnimation(\"zoom_enter\", \"zoom_exit\")";
mostCurrent._sharecode._setanimation /*String*/ (mostCurrent.activityBA,"zoom_enter","zoom_exit");
RDebugUtils.currentLine=153026565;
 //BA.debugLineNum = 153026565;BA.debugLine="ListItemSelected(pnl)";
_listitemselected(_pnl);
RDebugUtils.currentLine=153026566;
 //BA.debugLineNum = 153026566;BA.debugLine="End Sub";
return "";
}
public static String  _listobjects_reachend() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listobjects_reachend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listobjects_reachend", null));}
RDebugUtils.currentLine=154337280;
 //BA.debugLineNum = 154337280;BA.debugLine="Sub listObjects_ReachEnd";
RDebugUtils.currentLine=154337281;
 //BA.debugLineNum = 154337281;BA.debugLine="If Not(NextStartingRow = StartingRow) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_nextstartingrow==_startingrow)) { 
RDebugUtils.currentLine=154337282;
 //BA.debugLineNum = 154337282;BA.debugLine="StartingRow = NextStartingRow";
_startingrow = _nextstartingrow;
RDebugUtils.currentLine=154337283;
 //BA.debugLineNum = 154337283;BA.debugLine="StartObjectsActivity(False, CurrentFilter)";
_startobjectsactivity(anywheresoftware.b4a.keywords.Common.False,mostCurrent._currentfilter);
 };
RDebugUtils.currentLine=154337285;
 //BA.debugLineNum = 154337285;BA.debugLine="End Sub";
return "";
}
public static String  _listpedidosbuttonmap_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listpedidosbuttonmap_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listpedidosbuttonmap_click", null));}
RDebugUtils.currentLine=152567808;
 //BA.debugLineNum = 152567808;BA.debugLine="Sub listPedidosButtonMap_Click";
RDebugUtils.currentLine=152567809;
 //BA.debugLineNum = 152567809;BA.debugLine="Try";
try {RDebugUtils.currentLine=152567810;
 //BA.debugLineNum = 152567810;BA.debugLine="If ShowListPedidosMap Then";
if (_showlistpedidosmap) { 
RDebugUtils.currentLine=152567811;
 //BA.debugLineNum = 152567811;BA.debugLine="ShowListPedidosMap = False";
_showlistpedidosmap = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=152567812;
 //BA.debugLineNum = 152567812;BA.debugLine="mapBaseList.Visible = False";
mostCurrent._mapbaselist.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=152567813;
 //BA.debugLineNum = 152567813;BA.debugLine="listPedidosButtonMap.Color = Colors.ARGB(150, 7";
mostCurrent._listpedidosbuttonmap.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (7),(int) (167),(int) (247)));
RDebugUtils.currentLine=152567814;
 //BA.debugLineNum = 152567814;BA.debugLine="listPedidosButtonMap.Left = 10dip";
mostCurrent._listpedidosbuttonmap.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
 }else {
RDebugUtils.currentLine=152567816;
 //BA.debugLineNum = 152567816;BA.debugLine="ShowListPedidosMap = True";
_showlistpedidosmap = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=152567817;
 //BA.debugLineNum = 152567817;BA.debugLine="mapBaseList.Visible = True";
mostCurrent._mapbaselist.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=152567818;
 //BA.debugLineNum = 152567818;BA.debugLine="listPedidosButtonMap.Color = Colors.ARGB(150, 7";
mostCurrent._listpedidosbuttonmap.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (7),(int) (119),(int) (167)));
RDebugUtils.currentLine=152567819;
 //BA.debugLineNum = 152567819;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=152567820;
 //BA.debugLineNum = 152567820;BA.debugLine="listPedidosButtonMap.Left = 33.33%x";
mostCurrent._listpedidosbuttonmap.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (33.33),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=152567822;
 //BA.debugLineNum = 152567822;BA.debugLine="listPedidosButtonMap.Left = 310dip";
mostCurrent._listpedidosbuttonmap.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (310)));
 };
 };
 } 
       catch (Exception e18) {
			processBA.setLastException(e18);RDebugUtils.currentLine=152567827;
 //BA.debugLineNum = 152567827;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6152567827",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=152567828;
 //BA.debugLineNum = 152567828;BA.debugLine="Utils.WriteErrors2Log(LastException)";
mostCurrent._utils._writeerrors2log /*String*/ (mostCurrent.activityBA,BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)));
 };
RDebugUtils.currentLine=152567831;
 //BA.debugLineNum = 152567831;BA.debugLine="End Sub";
return "";
}
public static String  _listpedidosmap_itemclick(int _index,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listpedidosmap_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listpedidosmap_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _name = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
String _lat = "";
String _lon = "";
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cp = null;
RDebugUtils.currentLine=152633344;
 //BA.debugLineNum = 152633344;BA.debugLine="Sub listPedidosMap_ItemClick (Index As Int, Value";
RDebugUtils.currentLine=152633345;
 //BA.debugLineNum = 152633345;BA.debugLine="Log(Value)";
anywheresoftware.b4a.keywords.Common.LogImpl("6152633345",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=152633347;
 //BA.debugLineNum = 152633347;BA.debugLine="Dim p As Panel  = listPedidosMap.GetPanel(Index)";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
_p = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._listpedidosmap._getpanel(_index).getObject()));
RDebugUtils.currentLine=152633348;
 //BA.debugLineNum = 152633348;BA.debugLine="Dim name As Label = p.GetView(0)";
_name = new anywheresoftware.b4a.objects.LabelWrapper();
_name = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_p.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=152633349;
 //BA.debugLineNum = 152633349;BA.debugLine="Dim lst As List = Regex.Split(\"\\|\", name.Tag)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",BA.ObjectToString(_name.getTag())));
RDebugUtils.currentLine=152633351;
 //BA.debugLineNum = 152633351;BA.debugLine="If (lst.Size >= 1) Then";
if ((_lst.getSize()>=1)) { 
RDebugUtils.currentLine=152633352;
 //BA.debugLineNum = 152633352;BA.debugLine="Dim lat As String = lst.Get(0)";
_lat = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=152633353;
 //BA.debugLineNum = 152633353;BA.debugLine="Dim lon As String = lst.Get(1)";
_lon = BA.ObjectToString(_lst.Get((int) (1)));
RDebugUtils.currentLine=152633355;
 //BA.debugLineNum = 152633355;BA.debugLine="If Not(Utils.isNullOrEmpty(lat)) And Not(Utils.i";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_lat)) && anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_lon))) { 
RDebugUtils.currentLine=152633356;
 //BA.debugLineNum = 152633356;BA.debugLine="If gmap.IsInitialized Then";
if (mostCurrent._gmap.IsInitialized()) { 
RDebugUtils.currentLine=152633357;
 //BA.debugLineNum = 152633357;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=152633359;
 //BA.debugLineNum = 152633359;BA.debugLine="cp.Initialize(lst.Get(0), lst.Get(1), 17)";
_cp.Initialize((double)(BA.ObjectToNumber(_lst.Get((int) (0)))),(double)(BA.ObjectToNumber(_lst.Get((int) (1)))),(float) (17));
RDebugUtils.currentLine=152633360;
 //BA.debugLineNum = 152633360;BA.debugLine="gmap.MoveCamera(cp)";
mostCurrent._gmap.MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
 };
 };
 };
RDebugUtils.currentLine=152633364;
 //BA.debugLineNum = 152633364;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonadd_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonadd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonadd_click", null));}
RDebugUtils.currentLine=152109056;
 //BA.debugLineNum = 152109056;BA.debugLine="Sub listsButtonAdd_Click";
RDebugUtils.currentLine=152109058;
 //BA.debugLineNum = 152109058;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonfilter_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonfilter_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonfilter_click", null));}
xevolution.vrcg.devdemov2400.appdialogs _filter = null;
xevolution.vrcg.devdemov2400.types._objectfilter _curr = null;
RDebugUtils.currentLine=152502272;
 //BA.debugLineNum = 152502272;BA.debugLine="Sub listsButtonFilter_Click";
RDebugUtils.currentLine=152502273;
 //BA.debugLineNum = 152502273;BA.debugLine="Dim Filter As AppDialogs";
_filter = new xevolution.vrcg.devdemov2400.appdialogs();
RDebugUtils.currentLine=152502274;
 //BA.debugLineNum = 152502274;BA.debugLine="Filter.Initialize";
_filter._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=152502275;
 //BA.debugLineNum = 152502275;BA.debugLine="Dim Curr As ObjectFilter = Types.MakeObjectFilter";
_curr = mostCurrent._types._makeobjectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ (mostCurrent.activityBA,_idialogreqtypeobject,_idialogreqzone,_idialogreqstatus,_idialogreqregion,_idialogreqlocal,mostCurrent._sdialogreqname,mostCurrent._sdialogreqaddress,_idialogreqwithrequests);
RDebugUtils.currentLine=152502277;
 //BA.debugLineNum = 152502277;BA.debugLine="Filter.GetObjectFilterDialog(\"objects\", Curr, Typ";
_filter._getobjectfilterdialog /*void*/ (null,(Object)("objects"),_curr,mostCurrent._typeobjectslist,mostCurrent._regionslist,mostCurrent._localslist);
RDebugUtils.currentLine=152502278;
 //BA.debugLineNum = 152502278;BA.debugLine="End Sub";
return "";
}
public static String  _listsbuttonzone_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listsbuttonzone_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listsbuttonzone_click", null));}
RDebugUtils.currentLine=153812992;
 //BA.debugLineNum = 153812992;BA.debugLine="Sub listsButtonZone_Click";
RDebugUtils.currentLine=153812993;
 //BA.debugLineNum = 153812993;BA.debugLine="ObjectZonePopMenu.OpenMenu";
mostCurrent._objectzonepopmenu._openmenu();
RDebugUtils.currentLine=153812994;
 //BA.debugLineNum = 153812994;BA.debugLine="End Sub";
return "";
}
public static String  _liststabpanel_pageselected(int _position) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "liststabpanel_pageselected", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "liststabpanel_pageselected", new Object[] {_position}));}
RDebugUtils.currentLine=151977984;
 //BA.debugLineNum = 151977984;BA.debugLine="Sub listsTabPanel_PageSelected (Position As Int)";
RDebugUtils.currentLine=151977986;
 //BA.debugLineNum = 151977986;BA.debugLine="End Sub";
return "";
}
public static String  _mainlogo_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mainlogo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mainlogo_click", null));}
RDebugUtils.currentLine=153681920;
 //BA.debugLineNum = 153681920;BA.debugLine="Sub mainLogo_Click";
RDebugUtils.currentLine=153681921;
 //BA.debugLineNum = 153681921;BA.debugLine="listsButtonClose_Click";
_listsbuttonclose_click();
RDebugUtils.currentLine=153681922;
 //BA.debugLineNum = 153681922;BA.debugLine="End Sub";
return "";
}
public static String  _mapdata_click(anywheresoftware.b4a.objects.MapFragmentWrapper.LatLngWrapper _point) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapdata_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mapdata_click", new Object[] {_point}));}
RDebugUtils.currentLine=154206208;
 //BA.debugLineNum = 154206208;BA.debugLine="Sub mapData_Click (Point As LatLng)";
RDebugUtils.currentLine=154206210;
 //BA.debugLineNum = 154206210;BA.debugLine="End Sub";
return "";
}
public static boolean  _mapdata_markerclick(anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper _selectedmarker) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapdata_markerclick", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "mapdata_markerclick", new Object[] {_selectedmarker}));}
RDebugUtils.currentLine=154271744;
 //BA.debugLineNum = 154271744;BA.debugLine="Sub mapData_MarkerClick (SelectedMarker As Marker)";
RDebugUtils.currentLine=154271746;
 //BA.debugLineNum = 154271746;BA.debugLine="End Sub";
return false;
}
public static void  _mapdata_ready() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapdata_ready", false))
	 {Debug.delegate(mostCurrent.activityBA, "mapdata_ready", null); return;}
ResumableSub_mapData_Ready rsub = new ResumableSub_mapData_Ready(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_mapData_Ready extends BA.ResumableSub {
public ResumableSub_mapData_Ready(xevolution.vrcg.devdemov2400.objects parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.objects parent;
anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper _cp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=154140673;
 //BA.debugLineNum = 154140673;BA.debugLine="gmap = mapData.GetMap";
parent.mostCurrent._gmap = parent.mostCurrent._mapdata.GetMap();
RDebugUtils.currentLine=154140675;
 //BA.debugLineNum = 154140675;BA.debugLine="If gmap.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 8;
if (parent.mostCurrent._gmap.IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=154140676;
 //BA.debugLineNum = 154140676;BA.debugLine="Do While gmap.MyLocation.IsInitialized = False";
if (true) break;

case 4:
//do while
this.state = 7;
while (parent.mostCurrent._gmap.getMyLocation().IsInitialized()==anywheresoftware.b4a.keywords.Common.False) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 4;
RDebugUtils.currentLine=154140677;
 //BA.debugLineNum = 154140677;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "mapdata_ready"),(int) (100));
this.state = 9;
return;
case 9:
//C
this.state = 4;
;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=154140680;
 //BA.debugLineNum = 154140680;BA.debugLine="Dim cp As CameraPosition";
_cp = new anywheresoftware.b4a.objects.MapFragmentWrapper.CameraPositionWrapper();
RDebugUtils.currentLine=154140681;
 //BA.debugLineNum = 154140681;BA.debugLine="cp.Initialize(gmap.MyLocation.Latitude, gmap.MyL";
_cp.Initialize(parent.mostCurrent._gmap.getMyLocation().getLatitude(),parent.mostCurrent._gmap.getMyLocation().getLongitude(),(float) (17));
RDebugUtils.currentLine=154140682;
 //BA.debugLineNum = 154140682;BA.debugLine="gmap.MoveCamera(cp)";
parent.mostCurrent._gmap.MoveCamera((com.google.android.gms.maps.model.CameraPosition)(_cp.getObject()));
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=154140684;
 //BA.debugLineNum = 154140684;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mapuserposition_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapuserposition_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mapuserposition_click", null));}
RDebugUtils.currentLine=153747456;
 //BA.debugLineNum = 153747456;BA.debugLine="Sub mapUserPosition_Click";
RDebugUtils.currentLine=153747458;
 //BA.debugLineNum = 153747458;BA.debugLine="End Sub";
return "";
}
public static String  _mapzoomdown_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapzoomdown_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mapzoomdown_click", null));}
RDebugUtils.currentLine=152764416;
 //BA.debugLineNum = 152764416;BA.debugLine="Sub mapZoomDown_Click";
RDebugUtils.currentLine=152764418;
 //BA.debugLineNum = 152764418;BA.debugLine="End Sub";
return "";
}
public static String  _mapzoomup_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mapzoomup_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mapzoomup_click", null));}
RDebugUtils.currentLine=152698880;
 //BA.debugLineNum = 152698880;BA.debugLine="Sub mapZoomUp_Click";
RDebugUtils.currentLine=152698882;
 //BA.debugLineNum = 152698882;BA.debugLine="End Sub";
return "";
}
public static String  _norequestpanel_click() throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "norequestpanel_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "norequestpanel_click", null));}
RDebugUtils.currentLine=156631040;
 //BA.debugLineNum = 156631040;BA.debugLine="Sub noRequestPanel_Click";
RDebugUtils.currentLine=156631042;
 //BA.debugLineNum = 156631042;BA.debugLine="End Sub";
return "";
}
public static String  _objecttypepopmenu_click(String _menuname) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objecttypepopmenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objecttypepopmenu_click", new Object[] {_menuname}));}
xevolution.vrcg.devdemov2400.types._objecttypes _bt = null;
RDebugUtils.currentLine=153878528;
 //BA.debugLineNum = 153878528;BA.debugLine="Sub ObjectTypePopMenu_Click(MenuName As String)";
RDebugUtils.currentLine=153878529;
 //BA.debugLineNum = 153878529;BA.debugLine="Dim bt As ObjectTypes = Types.ObjectTypesInList(T";
_bt = mostCurrent._types._objecttypesinlist /*xevolution.vrcg.devdemov2400.types._objecttypes*/ (mostCurrent.activityBA,mostCurrent._typeobjectslist,_menuname);
RDebugUtils.currentLine=153878530;
 //BA.debugLineNum = 153878530;BA.debugLine="Starter.ObjectFilter.TypeObject = bt.id 'TypeObje";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .TypeObject /*int*/  = _bt.id /*int*/ ;
RDebugUtils.currentLine=153878531;
 //BA.debugLineNum = 153878531;BA.debugLine="SetTheFilters(Starter.ObjectFilter)";
_setthefilters(mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ );
RDebugUtils.currentLine=153878532;
 //BA.debugLineNum = 153878532;BA.debugLine="End Sub";
return "";
}
public static String  _objectzonepopmenu_click(String _menuname) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "objectzonepopmenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "objectzonepopmenu_click", new Object[] {_menuname}));}
RDebugUtils.currentLine=153944064;
 //BA.debugLineNum = 153944064;BA.debugLine="Sub ObjectZonePopMenu_Click(MenuName As String)";
RDebugUtils.currentLine=153944065;
 //BA.debugLineNum = 153944065;BA.debugLine="Starter.ObjectFilter.ZoneObject = Types.ZONEOBJEC";
mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ .ZoneObject /*int*/  = mostCurrent._types._zoneobjectsfilter /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_menuname));
RDebugUtils.currentLine=153944066;
 //BA.debugLineNum = 153944066;BA.debugLine="SetTheFilters(Starter.ObjectFilter)";
_setthefilters(mostCurrent._starter._objectfilter /*xevolution.vrcg.devdemov2400.types._objectfilter*/ );
RDebugUtils.currentLine=153944067;
 //BA.debugLineNum = 153944067;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatetyperequestfields(String _object_type,String _objecttagcode,String _request_type,String _tagcode,String _actionkey,int _repeatcounter,xevolution.vrcg.devdemov2400.types._requestcla _cla) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatetyperequestfields", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "updatetyperequestfields", new Object[] {_object_type,_objecttagcode,_request_type,_tagcode,_actionkey,_repeatcounter,_cla}));}
ResumableSub_UpdateTyperequestFields rsub = new ResumableSub_UpdateTyperequestFields(null,_object_type,_objecttagcode,_request_type,_tagcode,_actionkey,_repeatcounter,_cla);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateTyperequestFields extends BA.ResumableSub {
public ResumableSub_UpdateTyperequestFields(xevolution.vrcg.devdemov2400.objects parent,String _object_type,String _objecttagcode,String _request_type,String _tagcode,String _actionkey,int _repeatcounter,xevolution.vrcg.devdemov2400.types._requestcla _cla) {
this.parent = parent;
this._object_type = _object_type;
this._objecttagcode = _objecttagcode;
this._request_type = _request_type;
this._tagcode = _tagcode;
this._actionkey = _actionkey;
this._repeatcounter = _repeatcounter;
this._cla = _cla;
}
xevolution.vrcg.devdemov2400.objects parent;
String _object_type;
String _objecttagcode;
String _request_type;
String _tagcode;
String _actionkey;
int _repeatcounter;
xevolution.vrcg.devdemov2400.types._requestcla _cla;
anywheresoftware.b4a.sql.SQL.CursorWrapper _record9 = null;
String _ssql = "";
int _ni = 0;
String _connect2data = "";
String _do_name = "";
String _do_field = "";
int _do_is_additional = 0;
String _task_tagcode = "";
String _item_tagcode = "";
String _unique_key = "";
String _inssql = "";
anywheresoftware.b4a.objects.collections.Map _params = null;
String _url = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
String _objsql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _record99 = null;
int _nii = 0;
String _val = "";
String _newsql = "";
String _sacladatetime = "";
String _saclalatitude = "";
String _saclalongitude = "";
String _aclsessuser = "";
int step10;
int limit10;
int step48;
int limit48;
int step120;
int limit120;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="objects";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=156368902;
 //BA.debugLineNum = 156368902;BA.debugLine="If Utils.NNE(objecttagcode) And Not(objecttagcode";
if (true) break;

case 1:
//if
this.state = 92;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_objecttagcode) && anywheresoftware.b4a.keywords.Common.Not((_objecttagcode).equals("__NONE__"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=156368903;
 //BA.debugLineNum = 156368903;BA.debugLine="Private Record9 As Cursor";
_record9 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=156368908;
 //BA.debugLineNum = 156368908;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"gruposo";
if (true) break;

case 4:
//if
this.state = 9;
if (((parent.mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("gruposores"))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=156368909;
 //BA.debugLineNum = 156368909;BA.debugLine="Dim sSQL As String = $\"SELECT c.connectmode, c.";
_ssql = ("SELECT c.connectmode, c.connect2data, b.do_name, b.do_field, b.do_is_additional,\n"+"										b.task_tagcode, b.item_tagcode, b.unique_key, b.data_type, b.title\n"+"										FROM dta_requests_values AS a\n"+"										INNER JOIN dta_tasks_items AS b ON (b.task_tagcode=a.task_tagcode AND b.item_tagcode=a.item_tagcode AND b.unique_key=a.unique_key)\n"+"										INNER JOIN dta_tasks AS c ON (c.tagcode=b.task_tagcode)\n"+"										WHERE a.execute_status>=1\n"+"										AND a.request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode.trim()))+"'\n"+"										AND a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey.trim()))+"'\n"+"										AND a.repeatcounter='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+"'\n"+"										AND ((b.do_name <> '' AND b.do_field <> '' AND c.connect2data <> '') or\n"+"										 (b.do_name = '__TYPEREQUEST__' AND b.do_field <> '' )) and b.task_tagcode=a.task_tagcode");
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=156368921;
 //BA.debugLineNum = 156368921;BA.debugLine="Dim sSQL As String = $\"SELECT b.connectmode, b.";
_ssql = ("SELECT b.connectmode, b.connect2data, a.do_name, a.do_field, a.do_is_additional,\n"+"										a.task_tagcode, a.item_tagcode, a.unique_key, a.data_type, a.title\n"+"										FROM dta_tasks_items AS a\n"+"										INNER JOIN dta_tasks AS b ON (b.tagcode=a.task_tagcode)\n"+"										WHERE  ((a.do_name <> '' AND a.do_field <> '' AND b.connect2data <> '') or\n"+"										 (a.do_name = '__TYPEREQUEST__' AND a.do_field <> '' )) and a.task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey.trim()))+"'");
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=156368929;
 //BA.debugLineNum = 156368929;BA.debugLine="Record9 = Starter.LocalSQLEVC.ExecQuery(sSQL)";
_record9 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=156368930;
 //BA.debugLineNum = 156368930;BA.debugLine="If Record9.RowCount > 0 Then";
if (true) break;

case 10:
//if
this.state = 91;
if (_record9.getRowCount()>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=156368931;
 //BA.debugLineNum = 156368931;BA.debugLine="For ni = 0 To Record9.RowCount-1";
if (true) break;

case 13:
//for
this.state = 90;
step10 = 1;
limit10 = (int) (_record9.getRowCount()-1);
_ni = (int) (0) ;
this.state = 93;
if (true) break;

case 93:
//C
this.state = 90;
if ((step10 > 0 && _ni <= limit10) || (step10 < 0 && _ni >= limit10)) this.state = 15;
if (true) break;

case 94:
//C
this.state = 93;
_ni = ((int)(0 + _ni + step10)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=156368932;
 //BA.debugLineNum = 156368932;BA.debugLine="Record9.Position = ni";
_record9.setPosition(_ni);
RDebugUtils.currentLine=156368933;
 //BA.debugLineNum = 156368933;BA.debugLine="Dim connect2data As String = Record9.GetString";
_connect2data = _record9.GetString("connect2data");
RDebugUtils.currentLine=156368934;
 //BA.debugLineNum = 156368934;BA.debugLine="Dim do_name As String = Record9.GetString(\"do_";
_do_name = _record9.GetString("do_name");
RDebugUtils.currentLine=156368935;
 //BA.debugLineNum = 156368935;BA.debugLine="Dim do_field As String = Record9.GetString(\"do";
_do_field = _record9.GetString("do_field");
RDebugUtils.currentLine=156368936;
 //BA.debugLineNum = 156368936;BA.debugLine="Dim do_is_additional As Int = Record9.GetInt(\"";
_do_is_additional = _record9.GetInt("do_is_additional");
RDebugUtils.currentLine=156368937;
 //BA.debugLineNum = 156368937;BA.debugLine="Dim task_tagcode As String = Record9.GetString";
_task_tagcode = _record9.GetString("task_tagcode");
RDebugUtils.currentLine=156368938;
 //BA.debugLineNum = 156368938;BA.debugLine="Dim item_tagcode As String = Record9.GetString";
_item_tagcode = _record9.GetString("item_tagcode");
RDebugUtils.currentLine=156368939;
 //BA.debugLineNum = 156368939;BA.debugLine="Dim unique_key As String = Record9.GetString(\"";
_unique_key = _record9.GetString("unique_key");
RDebugUtils.currentLine=156368941;
 //BA.debugLineNum = 156368941;BA.debugLine="If (do_name.ToUpperCase = \"__TYPEREQUEST__\") T";
if (true) break;

case 16:
//if
this.state = 89;
if (((_do_name.toUpperCase()).equals("__TYPEREQUEST__"))) { 
this.state = 18;
}else {
this.state = 56;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=156368943;
 //BA.debugLineNum = 156368943;BA.debugLine="If (tagcode.StartsWith(\"IE_\")) Then";
if (true) break;

case 19:
//if
this.state = 28;
if ((_tagcode.startsWith("IE_"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=156368944;
 //BA.debugLineNum = 156368944;BA.debugLine="Dim insSQL As String = $\"insert into dta_req";
_inssql = ("insert into dta_requests_fields (id, request_tagcode, field_tagcode)\n"+"														Select id, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' as request_tagcode, field_tagcode \n"+"														from dta_typerequests_fields where typerequest_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_request_type))+"' \n"+"														And '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'||field_tagcode not in \n"+"															(Select '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"'||field_tagcode as campo \n"+"															from dta_requests_fields\n"+"															where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"')");
RDebugUtils.currentLine=156368952;
 //BA.debugLineNum = 156368952;BA.debugLine="Utils.SaveSQLToLog(\"CriaCamposAdicionais\",in";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"CriaCamposAdicionais",_inssql,_tagcode);
RDebugUtils.currentLine=156368953;
 //BA.debugLineNum = 156368953;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=156368954;
 //BA.debugLineNum = 156368954;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=156368955;
 //BA.debugLineNum = 156368955;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=156368956;
 //BA.debugLineNum = 156368956;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=156368957;
 //BA.debugLineNum = 156368957;BA.debugLine="params.Put(\"ACLARequest\", tagcode)";
_params.Put((Object)("ACLARequest"),(Object)(_tagcode));
RDebugUtils.currentLine=156368958;
 //BA.debugLineNum = 156368958;BA.debugLine="params.Put(\"ACLARequestType\", request_type)";
_params.Put((Object)("ACLARequestType"),(Object)(_request_type));
RDebugUtils.currentLine=156368959;
 //BA.debugLineNum = 156368959;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTag";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=156368960;
 //BA.debugLineNum = 156368960;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuth";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=156368961;
 //BA.debugLineNum = 156368961;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=156368962;
 //BA.debugLineNum = 156368962;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=156368963;
 //BA.debugLineNum = 156368963;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=156368964;
 //BA.debugLineNum = 156368964;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceM";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=156368965;
 //BA.debugLineNum = 156368965;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156368966;
 //BA.debugLineNum = 156368966;BA.debugLine="Dim Url As String = $\"https://${ShareCode.AP";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/cla-fields/create");
RDebugUtils.currentLine=156368967;
 //BA.debugLineNum = 156368967;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 22:
//if
this.state = 27;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=156368968;
 //BA.debugLineNum = 156368968;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", tagco";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,objects.getObject(),_url,"",_tagcode);
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=156368970;
 //BA.debugLineNum = 156368970;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeW";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_tagcode.trim(),"","");
RDebugUtils.currentLine=156368971;
 //BA.debugLineNum = 156368971;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(para";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=156368973;
 //BA.debugLineNum = 156368973;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "updatetyperequestfields"),(int) (500));
this.state = 95;
return;
case 95:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=156368977;
 //BA.debugLineNum = 156368977;BA.debugLine="Dim ObjSQL As String = $\"select distinct valu";
_objsql = ("select distinct value from dta_requests_fields where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' and field_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+"'");
RDebugUtils.currentLine=156368978;
 //BA.debugLineNum = 156368978;BA.debugLine="Private Record99 As Cursor = Starter.LocalSQL";
_record99 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record99 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_objsql)));
RDebugUtils.currentLine=156368979;
 //BA.debugLineNum = 156368979;BA.debugLine="If Record99.RowCount > 0 Then";
if (true) break;

case 29:
//if
this.state = 54;
if (_record99.getRowCount()>0) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=156368980;
 //BA.debugLineNum = 156368980;BA.debugLine="For nii = 0 To Record99.RowCount-1";
if (true) break;

case 32:
//for
this.state = 53;
step48 = 1;
limit48 = (int) (_record99.getRowCount()-1);
_nii = (int) (0) ;
this.state = 96;
if (true) break;

case 96:
//C
this.state = 53;
if ((step48 > 0 && _nii <= limit48) || (step48 < 0 && _nii >= limit48)) this.state = 34;
if (true) break;

case 97:
//C
this.state = 96;
_nii = ((int)(0 + _nii + step48)) ;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=156368981;
 //BA.debugLineNum = 156368981;BA.debugLine="Record99.Position = nii";
_record99.setPosition(_nii);
RDebugUtils.currentLine=156368982;
 //BA.debugLineNum = 156368982;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty(Rec";
_val = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record99.GetString("value"),"");
RDebugUtils.currentLine=156368983;
 //BA.debugLineNum = 156368983;BA.debugLine="Dim NewSQL As String = $\"update dta_request";
_newsql = ("update dta_requests_values set execute_status=1, execute_value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_val))+"'\n"+"															where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' \n"+"															and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'\n"+"															and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode))+"'\n"+"															and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+" ");
RDebugUtils.currentLine=156368990;
 //BA.debugLineNum = 156368990;BA.debugLine="Try";
if (true) break;

case 35:
//try
this.state = 40;
this.catchState = 39;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 40;
this.catchState = 39;
RDebugUtils.currentLine=156368991;
 //BA.debugLineNum = 156368991;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(NewSQL)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_newsql);
 if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
RDebugUtils.currentLine=156368993;
 //BA.debugLineNum = 156368993;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156368993",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
;
RDebugUtils.currentLine=156368996;
 //BA.debugLineNum = 156368996;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=156368997;
 //BA.debugLineNum = 156368997;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=156368998;
 //BA.debugLineNum = 156368998;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=156368999;
 //BA.debugLineNum = 156368999;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=156369000;
 //BA.debugLineNum = 156369000;BA.debugLine="params.Put(\"ACLARequest\", CLA.Request)";
_params.Put((Object)("ACLARequest"),(Object)(_cla.Request /*String*/ ));
RDebugUtils.currentLine=156369001;
 //BA.debugLineNum = 156369001;BA.debugLine="params.Put(\"ACLAAction\", CLA.Action)";
_params.Put((Object)("ACLAAction"),(Object)(_cla.Action /*String*/ ));
RDebugUtils.currentLine=156369002;
 //BA.debugLineNum = 156369002;BA.debugLine="params.Put(\"ACLATask\", CLA.Task)";
_params.Put((Object)("ACLATask"),(Object)(_cla.Task /*String*/ ));
RDebugUtils.currentLine=156369003;
 //BA.debugLineNum = 156369003;BA.debugLine="params.Put(\"ACLAItem\",item_tagcode)";
_params.Put((Object)("ACLAItem"),(Object)(_item_tagcode));
RDebugUtils.currentLine=156369004;
 //BA.debugLineNum = 156369004;BA.debugLine="params.Put(\"ACLAUniqueKey\", unique_key)";
_params.Put((Object)("ACLAUniqueKey"),(Object)(_unique_key));
RDebugUtils.currentLine=156369006;
 //BA.debugLineNum = 156369006;BA.debugLine="params.Put(\"ACLAValue\", val)";
_params.Put((Object)("ACLAValue"),(Object)(_val));
RDebugUtils.currentLine=156369007;
 //BA.debugLineNum = 156369007;BA.debugLine="params.Put(\"ACLAReqCounter\", repeatcounter)";
_params.Put((Object)("ACLAReqCounter"),(Object)(_repeatcounter));
RDebugUtils.currentLine=156369008;
 //BA.debugLineNum = 156369008;BA.debugLine="params.Put(\"ACLARepeatItem\", 0)";
_params.Put((Object)("ACLARepeatItem"),(Object)(0));
RDebugUtils.currentLine=156369009;
 //BA.debugLineNum = 156369009;BA.debugLine="params.Put(\"ACLARepeatField\", 0)";
_params.Put((Object)("ACLARepeatField"),(Object)(0));
RDebugUtils.currentLine=156369010;
 //BA.debugLineNum = 156369010;BA.debugLine="params.Put(\"ACLAInner\", 0)";
_params.Put((Object)("ACLAInner"),(Object)(0));
RDebugUtils.currentLine=156369012;
 //BA.debugLineNum = 156369012;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTa";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=156369013;
 //BA.debugLineNum = 156369013;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAut";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=156369014;
 //BA.debugLineNum = 156369014;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=156369015;
 //BA.debugLineNum = 156369015;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=156369016;
 //BA.debugLineNum = 156369016;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=156369017;
 //BA.debugLineNum = 156369017;BA.debugLine="params.put(\"_deviceMacAddress\", Main.Device";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=156369018;
 //BA.debugLineNum = 156369018;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=156369019;
 //BA.debugLineNum = 156369019;BA.debugLine="Dim sACLADatetime As String = Utils.GetCurr";
_sacladatetime = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=156369020;
 //BA.debugLineNum = 156369020;BA.debugLine="Private sACLALatitude As String = Utils.IfN";
_saclalatitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=156369021;
 //BA.debugLineNum = 156369021;BA.debugLine="Private sACLALongitude As String = Utils.If";
_saclalongitude = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,parent.mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=156369023;
 //BA.debugLineNum = 156369023;BA.debugLine="params.Put(\"ACLADatetime\", sACLADatetime)";
_params.Put((Object)("ACLADatetime"),(Object)(_sacladatetime));
RDebugUtils.currentLine=156369024;
 //BA.debugLineNum = 156369024;BA.debugLine="params.Put(\"ACLALatitude\", sACLALatitude)";
_params.Put((Object)("ACLALatitude"),(Object)(_saclalatitude));
RDebugUtils.currentLine=156369025;
 //BA.debugLineNum = 156369025;BA.debugLine="params.Put(\"ACLALongitude\", sACLALongitude)";
_params.Put((Object)("ACLALongitude"),(Object)(_saclalongitude));
RDebugUtils.currentLine=156369026;
 //BA.debugLineNum = 156369026;BA.debugLine="Dim ACLSessUser As String = ShareCode.SESS_";
_aclsessuser = parent.mostCurrent._sharecode._sess_oper_user /*String*/ ;
RDebugUtils.currentLine=156369028;
 //BA.debugLineNum = 156369028;BA.debugLine="params.Put(\"ACLSessUser\", ACLSessUser)";
_params.Put((Object)("ACLSessUser"),(Object)(_aclsessuser));
RDebugUtils.currentLine=156369029;
 //BA.debugLineNum = 156369029;BA.debugLine="params.Put(\"ACLClear\", 0)";
_params.Put((Object)("ACLClear"),(Object)(0));
RDebugUtils.currentLine=156369031;
 //BA.debugLineNum = 156369031;BA.debugLine="Dim Url As String = $\"https://${ShareCode.A";
_url = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/clai/update");
RDebugUtils.currentLine=156369032;
 //BA.debugLineNum = 156369032;BA.debugLine="If (Utils.Int2Bool(ShareCode.DEVICE_REQUEST";
if (true) break;

case 41:
//if
this.state = 52;
if ((parent.mostCurrent._utils._int2bool /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._device_request_upload_onexecution /*int*/ ))) { 
this.state = 43;
}else {
this.state = 51;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=156369033;
 //BA.debugLineNum = 156369033;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 44:
//if
this.state = 49;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=156369034;
 //BA.debugLineNum = 156369034;BA.debugLine="Utils.CallApi(0, params, Me, Url, \"\", CLA";
parent.mostCurrent._utils._callapi /*String*/ (mostCurrent.activityBA,(int) (0),_params,objects.getObject(),_url,"",_cla.Request /*String*/ );
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=156369036;
 //BA.debugLineNum = 156369036;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Mak";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_cla.Request /*String*/ .trim(),_cla.Task /*String*/ .trim(),"");
RDebugUtils.currentLine=156369037;
 //BA.debugLineNum = 156369037;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(pa";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 49:
//C
this.state = 52;
;
RDebugUtils.currentLine=156369039;
 //BA.debugLineNum = 156369039;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "updatetyperequestfields"),(int) (250));
this.state = 98;
return;
case 98:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=156369041;
 //BA.debugLineNum = 156369041;BA.debugLine="Dim WorkerND As WorkerNewData = Types.Make";
_workernd = parent.mostCurrent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (mostCurrent.activityBA,(int) (0),_cla.Request /*String*/ .trim(),_cla.Task /*String*/ .trim(),"");
RDebugUtils.currentLine=156369042;
 //BA.debugLineNum = 156369042;BA.debugLine="Utils.save2update(Url, Utils.MapToJson(par";
parent.mostCurrent._utils._save2update /*String*/ (mostCurrent.activityBA,_url,parent.mostCurrent._utils._maptojson /*String*/ (mostCurrent.activityBA,_params),(int) (0),_workernd);
 if (true) break;

case 52:
//C
this.state = 97;
;
RDebugUtils.currentLine=156369044;
 //BA.debugLineNum = 156369044;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "updatetyperequestfields"),(int) (100));
this.state = 99;
return;
case 99:
//C
this.state = 97;
;
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 89;
;
RDebugUtils.currentLine=156369047;
 //BA.debugLineNum = 156369047;BA.debugLine="Record99.Close";
_record99.Close();
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=156369055;
 //BA.debugLineNum = 156369055;BA.debugLine="If (do_name = object_type) Then";
if (true) break;

case 57:
//if
this.state = 88;
if (((_do_name).equals(_object_type))) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=156369056;
 //BA.debugLineNum = 156369056;BA.debugLine="If (do_is_additional = 1) Then";
if (true) break;

case 60:
//if
this.state = 73;
if ((_do_is_additional==1)) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 73;
RDebugUtils.currentLine=156369057;
 //BA.debugLineNum = 156369057;BA.debugLine="Dim ObjSQL As String = $\"select distinct `v";
_objsql = ("select distinct `value` from dta_objects_fields where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttagcode))+"'\n"+"																		and field_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+"'");
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=156369060;
 //BA.debugLineNum = 156369060;BA.debugLine="If Utils.FieldInList(do_field, \"address|add";
if (true) break;

case 65:
//if
this.state = 72;
if (parent.mostCurrent._utils._fieldinlist /*boolean*/ (mostCurrent.activityBA,_do_field,"address|address2|postalcode|phone|local|latitude|longitude|block|floor|door")) { 
this.state = 67;
}else 
{RDebugUtils.currentLine=156369063;
 //BA.debugLineNum = 156369063;BA.debugLine="Else If Utils.FieldInList(do_field, \"name|p";
if (parent.mostCurrent._utils._fieldinlist /*boolean*/ (mostCurrent.activityBA,_do_field,"name|phone|email|mobile")) { 
this.state = 69;
}else {
this.state = 71;
}}
if (true) break;

case 67:
//C
this.state = 72;
RDebugUtils.currentLine=156369061;
 //BA.debugLineNum = 156369061;BA.debugLine="Dim ObjSQL As String = $\"select distinct $";
_objsql = ("select distinct "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+" as `value` from dta_locations where tagcode in\n"+"																	(select local_tagcode from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttagcode))+"')");
 if (true) break;

case 69:
//C
this.state = 72;
RDebugUtils.currentLine=156369064;
 //BA.debugLineNum = 156369064;BA.debugLine="Dim ObjSQL As String = $\"select distinct $";
_objsql = ("select distinct "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+" as `value` from dta_contacts where tagcode in\n"+"															(select contact_tagcode from dta_objects_contacts where object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttagcode))+"' limit 1)");
 if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=156369067;
 //BA.debugLineNum = 156369067;BA.debugLine="Dim ObjSQL As String = $\"select distinct $";
_objsql = ("select distinct "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_do_field))+" as `value` from dta_objects where tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttagcode))+"'");
 if (true) break;

case 72:
//C
this.state = 73;
;
RDebugUtils.currentLine=156369070;
 //BA.debugLineNum = 156369070;BA.debugLine="Log(ObjSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156369070",_objsql,0);
 if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=156369072;
 //BA.debugLineNum = 156369072;BA.debugLine="Private Record99 As Cursor = Starter.LocalSQ";
_record99 = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_record99 = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_objsql)));
RDebugUtils.currentLine=156369073;
 //BA.debugLineNum = 156369073;BA.debugLine="If Record99.RowCount > 0 Then";
if (true) break;

case 74:
//if
this.state = 87;
if (_record99.getRowCount()>0) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=156369074;
 //BA.debugLineNum = 156369074;BA.debugLine="For nii = 0 To Record99.RowCount-1";
if (true) break;

case 77:
//for
this.state = 86;
step120 = 1;
limit120 = (int) (_record99.getRowCount()-1);
_nii = (int) (0) ;
this.state = 100;
if (true) break;

case 100:
//C
this.state = 86;
if ((step120 > 0 && _nii <= limit120) || (step120 < 0 && _nii >= limit120)) this.state = 79;
if (true) break;

case 101:
//C
this.state = 100;
_nii = ((int)(0 + _nii + step120)) ;
if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=156369075;
 //BA.debugLineNum = 156369075;BA.debugLine="Record99.Position = nii";
_record99.setPosition(_nii);
RDebugUtils.currentLine=156369076;
 //BA.debugLineNum = 156369076;BA.debugLine="Dim val As String = Utils.IfNullOrEmpty(Re";
_val = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_record99.GetString("value"),"");
RDebugUtils.currentLine=156369077;
 //BA.debugLineNum = 156369077;BA.debugLine="Dim NewSQL As String = $\"update dta_reques";
_newsql = ("update dta_requests_values set execute_status=1, execute_value='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_val))+"',\n"+"															object_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objecttagcode))+"'\n"+"															where request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tagcode))+"' \n"+"															and inner_request_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_actionkey))+"'\n"+"															and task_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_task_tagcode))+"'\n"+"															and item_tagcode='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_item_tagcode))+"'\n"+"															and unique_key='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_unique_key))+"'\n"+"															and repeatcounter="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_repeatcounter))+" ");
RDebugUtils.currentLine=156369085;
 //BA.debugLineNum = 156369085;BA.debugLine="Log(NewSQL)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156369085",_newsql,0);
RDebugUtils.currentLine=156369086;
 //BA.debugLineNum = 156369086;BA.debugLine="Try";
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
RDebugUtils.currentLine=156369087;
 //BA.debugLineNum = 156369087;BA.debugLine="Utils.SaveSQLToLog(\"ListaPrincipal_ItemCl";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"ListaPrincipal_ItemClick",_newsql,_tagcode);
 if (true) break;

case 84:
//C
this.state = 85;
this.catchState = 0;
RDebugUtils.currentLine=156369090;
 //BA.debugLineNum = 156369090;BA.debugLine="Log($\"Erro de campo: ${LastException}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6156369090",("Erro de campo: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
 if (true) break;
if (true) break;

case 85:
//C
this.state = 101;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;

case 87:
//C
this.state = 88;
;
RDebugUtils.currentLine=156369094;
 //BA.debugLineNum = 156369094;BA.debugLine="Record99.Close";
_record99.Close();
 if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;

case 89:
//C
this.state = 94;
;
 if (true) break;
if (true) break;

case 90:
//C
this.state = 91;
;
 if (true) break;

case 91:
//C
this.state = 92;
;
RDebugUtils.currentLine=156369101;
 //BA.debugLineNum = 156369101;BA.debugLine="Record9.Close";
_record9.Close();
 if (true) break;

case 92:
//C
this.state = -1;
;
RDebugUtils.currentLine=156369103;
 //BA.debugLineNum = 156369103;BA.debugLine="Log(\"UpdateTyperequestFields\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6156369103","UpdateTyperequestFields",0);
RDebugUtils.currentLine=156369104;
 //BA.debugLineNum = 156369104;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "objects", "updatetyperequestfields"),(int) (100));
this.state = 102;
return;
case 102:
//C
this.state = -1;
;
RDebugUtils.currentLine=156369105;
 //BA.debugLineNum = 156369105;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=156369106;
 //BA.debugLineNum = 156369106;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _textlabel(String _text) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "textlabel", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(mostCurrent.activityBA, "textlabel", new Object[] {_text}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _tpf = null;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bm = null;
RDebugUtils.currentLine=151781376;
 //BA.debugLineNum = 151781376;BA.debugLine="Sub TextLabel(Text As String) As Bitmap";
RDebugUtils.currentLine=151781377;
 //BA.debugLineNum = 151781377;BA.debugLine="Dim tpf As B4XFont = xui.CreateDefaultFont(10)";
_tpf = mostCurrent._xui.CreateDefaultFont((float) (10));
RDebugUtils.currentLine=151781378;
 //BA.debugLineNum = 151781378;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=151781379;
 //BA.debugLineNum = 151781379;BA.debugLine="c.Initialize(gmap)";
_c.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._gmap.getObject())));
RDebugUtils.currentLine=151781381;
 //BA.debugLineNum = 151781381;BA.debugLine="Dim r As B4XRect = c.MeasureText(Text, tpf)";
_r = _c.MeasureText(_text,_tpf);
RDebugUtils.currentLine=151781382;
 //BA.debugLineNum = 151781382;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=151781383;
 //BA.debugLineNum = 151781383;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=151781385;
 //BA.debugLineNum = 151781385;BA.debugLine="c.DrawRect(r, Consts.ColorWhite, True, 0)";
_c.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=151781386;
 //BA.debugLineNum = 151781386;BA.debugLine="c.DrawText(Text, r.CenterX, r.CenterY, tpf, Color";
_c.DrawText(processBA,_text,_r.getCenterX(),_r.getCenterY(),_tpf,anywheresoftware.b4a.keywords.Common.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=151781388;
 //BA.debugLineNum = 151781388;BA.debugLine="Dim bm As Bitmap = c.CreateBitmap";
_bm = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bm = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_c.CreateBitmap().getObject()));
RDebugUtils.currentLine=151781389;
 //BA.debugLineNum = 151781389;BA.debugLine="Return bm.Crop(0,0,r.Width,r.Height)";
if (true) return _bm.Crop((int) (0),(int) (0),(int) (_r.getWidth()),(int) (_r.getHeight()));
RDebugUtils.currentLine=151781390;
 //BA.debugLineNum = 151781390;BA.debugLine="End Sub";
return null;
}
public static String  _tilesourceselect_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "tilesourceselect_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "tilesourceselect_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=151519232;
 //BA.debugLineNum = 151519232;BA.debugLine="Sub TileSourceSelect_ItemClick (Position As Int, V";
RDebugUtils.currentLine=151519234;
 //BA.debugLineNum = 151519234;BA.debugLine="End Sub";
return "";
}
public static String  _updatemyposition(String _lat,String _lon) throws Exception{
RDebugUtils.currentModule="objects";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatemyposition", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updatemyposition", new Object[] {_lat,_lon}));}
RDebugUtils.currentLine=151846912;
 //BA.debugLineNum = 151846912;BA.debugLine="Public Sub UpdateMyPosition(Lat As String, Lon As";
RDebugUtils.currentLine=151846913;
 //BA.debugLineNum = 151846913;BA.debugLine="If (LabelAppInfo.IsInitialized) Then";
if ((mostCurrent._labelappinfo.IsInitialized())) { 
RDebugUtils.currentLine=151846914;
 //BA.debugLineNum = 151846914;BA.debugLine="MyPositionLat = Lat";
_mypositionlat = _lat;
RDebugUtils.currentLine=151846915;
 //BA.debugLineNum = 151846915;BA.debugLine="MyPositionLon = Lon";
_mypositionlon = _lon;
RDebugUtils.currentLine=151846916;
 //BA.debugLineNum = 151846916;BA.debugLine="LabelAppInfo.Text =  $\"Latitude: ${MyPositionLat";
mostCurrent._labelappinfo.setText(BA.ObjectToCharSequence(("Latitude: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mypositionlat))+", Longitude: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mypositionlon))+"")));
 };
RDebugUtils.currentLine=151846919;
 //BA.debugLineNum = 151846919;BA.debugLine="If (Markers.IsInitialized) Then";
if ((_markers.IsInitialized())) { 
RDebugUtils.currentLine=151846920;
 //BA.debugLineNum = 151846920;BA.debugLine="ChangeMyPosition";
_changemyposition();
 };
RDebugUtils.currentLine=151846922;
 //BA.debugLineNum = 151846922;BA.debugLine="End Sub";
return "";
}
}