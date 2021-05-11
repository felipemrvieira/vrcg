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

public class imageedit extends Activity implements B4AActivity{
	public static imageedit mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.imageedit");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (imageedit).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.imageedit");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.imageedit", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (imageedit) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (imageedit) Resume **");
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
		return imageedit.class;
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
            BA.LogInfo("** Activity (imageedit) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (imageedit) Pause event (activity is not paused). **");
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
            imageedit mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (imageedit) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _saverects = null;
public static int _pinpointnumber = 0;
public static String _shotfilelocation = "";
public static String _shotfilename = "";
public static anywheresoftware.b4a.phone.Phone _device = null;
public anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _intputtextfield = null;
public xevolution.vrcg.devdemov2400.types._point _startmetric = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _smiley = null;
public static double _deg = 0;
public static double _vx = 0;
public static double _vy = 0;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _smileyrect = null;
public static double _size = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _imagepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _drawpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltemp = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public static boolean _isb64image = false;
public static boolean _rettocamera = false;
public xevolution.vrcg.devdemov2400.types._bmr _undobmr = null;
public anywheresoftware.b4a.objects.B4XCanvas _drawingcanvas = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _undorect = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drawingrect = null;
public anywheresoftware.b4a.objects.B4XCanvas.B4XRect _cvsrect = null;
public static int _sx = 0;
public static int _sy = 0;
public static int _currindex = 0;
public static int _xposis = 0;
public static int _yposis = 0;
public static String _markercolorname = "";
public static int _linecolor = 0;
public static int _linewidth = 0;
public static int _fontsize = 0;
public static int _x0 = 0;
public static int _y0 = 0;
public static int _r0 = 0;
public static int _x1 = 0;
public static int _y1 = 0;
public static int _circlestroke = 0;
public static int _circlecolor = 0;
public static boolean _makeundo = false;
public anywheresoftware.b4a.objects.collections.List _pointsmap = null;
public static boolean _bcamera = false;
public static boolean _bpencil = false;
public static boolean _brect = false;
public static boolean _bcircle = false;
public static boolean _bmarker = false;
public static boolean _btext = false;
public static boolean _bshot = false;
public static boolean _bocr = false;
public static boolean _bbarcode = false;
public static boolean _bb_bcbarcode = false;
public static boolean _bb_bcqrcode = false;
public static boolean _bb_bcstamp = false;
public static boolean _bb_pinfoto = false;
public static boolean _bb_pinmarker = false;
public static boolean _bb_pintext = false;
public static boolean _bb_pencildistance = false;
public static boolean _bb_pencilfree = false;
public static boolean _bb_pencilline = false;
public static boolean _bb_barcode = false;
public static boolean _bb_ocrfindall = false;
public static boolean _bb_ocrfindselect = false;
public anywheresoftware.b4a.objects.ButtonWrapper _hideme = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _showimage = null;
public anywheresoftware.b4a.objects.PanelWrapper _showpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcircle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butmarker = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butrect = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butshot = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttext = null;
public anywheresoftware.b4a.objects.LabelWrapper _memorylabel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorblack = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorblue = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorgrey = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colororange = null;
public anywheresoftware.b4a.objects.PanelWrapper _colorpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorpurple = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorred = null;
public anywheresoftware.b4a.objects.ButtonWrapper _coloryellow = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorgreen = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcamera = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butocr = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butbarcode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butocrfindall = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butocrfindselect = null;
public anywheresoftware.b4a.objects.PanelWrapper _ocroptpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _colorwhite = null;
public anywheresoftware.b4a.objects.EditTextWrapper _textfield = null;
public anywheresoftware.b4a.objects.PanelWrapper _textpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _hidetext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfont16 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfont20 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfont24 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfont28 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfont32 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfont36 = null;
public anywheresoftware.b4a.objects.PanelWrapper _fontpanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _colorpanelindicator = null;
public anywheresoftware.b4a.objects.PanelWrapper _barcodepanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bcbarcode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bcqrcode = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bcstamp = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butactions = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butclose = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butcolors = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butpencil = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butsave = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butundo = null;
public anywheresoftware.b4a.objects.PanelWrapper _pinpanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _pinfoto = null;
public anywheresoftware.b4a.objects.ButtonWrapper _pinmarker = null;
public anywheresoftware.b4a.objects.ButtonWrapper _pintext = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butfonts = null;
public anywheresoftware.b4a.objects.PanelWrapper _actionspanel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butpencildistance = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butpencilfree = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butpencilline = null;
public anywheresoftware.b4a.objects.PanelWrapper _pencilpanel = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butreset = null;
public anywheresoftware.b4a.objects.ButtonWrapper _butacceptcrop = null;
public anywheresoftware.b4a.objects.PanelWrapper _lockpanel = null;
public static boolean _isgrid = false;
public xevolution.vrcg.devdemov2400.types._requestclaitem _currentclaitem = null;
public static boolean _exittodialog = false;
public static int _innercounter = 0;
public static int _touch_x = 0;
public static int _touch_y = 0;
public anywheresoftware.b4a.objects.collections.List _innercamshots = null;
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
public static String  _forceclose() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "forceclose", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "forceclose", null));}
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Sub ForceClose";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="InnerCamShots.Initialize '.Add(ShotFileName)";
mostCurrent._innercamshots.Initialize();
RDebugUtils.currentLine=30343176;
 //BA.debugLineNum = 30343176;BA.debugLine="CurrentCLAItem = Types.MakeRequestCLAItem(\"__REPO";
mostCurrent._currentclaitem = mostCurrent._types._makerequestclaitem /*xevolution.vrcg.devdemov2400.types._requestclaitem*/ (mostCurrent.activityBA,"__REPO__","__REPO__","__REPO__","__REPO__","__REPO__","__REPO__",(int) (0),(int) (0),(int) (0),"","","",(int) (2),(int) (0),(int) (0),"",mostCurrent._dbstructures._db2clataskitem /*xevolution.vrcg.devdemov2400.types._clataskitem*/ (mostCurrent.activityBA,"",""),"");
RDebugUtils.currentLine=30343178;
 //BA.debugLineNum = 30343178;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="butClose_Click";
_butclose_click();
 };
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="End Sub";
return false;
}
public static String  _butclose_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butclose_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butclose_click", null));}
int _i = 0;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Sub butClose_Click";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="i = Msgbox2(ShareCode.ExitEditNotSaved, ShareCode";
_i = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence(mostCurrent._sharecode._exiteditnotsaved /*String*/ ),BA.ObjectToCharSequence(mostCurrent._sharecode._generalalerttitle /*String*/ ),mostCurrent._sharecode._option_yes /*String*/ ,mostCurrent._sharecode._option_cancel /*String*/ ,"",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="If (i=DialogResponse.POSITIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE)) { 
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="If (ExitToDialog) Then";
if ((_exittodialog)) { 
RDebugUtils.currentLine=35848200;
 //BA.debugLineNum = 35848200;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==1)) { 
RDebugUtils.currentLine=35848201;
 //BA.debugLineNum = 35848201;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\",";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._user.getObject()),"CallMOREActionsAgain",(Object)(mostCurrent._currentclaitem));
 }else 
{RDebugUtils.currentLine=35848202;
 //BA.debugLineNum = 35848202;BA.debugLine="Else If (CurrentCLAItem.Origin = 2) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
RDebugUtils.currentLine=35848203;
 //BA.debugLineNum = 35848203;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", Current";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._requests3.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }else 
{RDebugUtils.currentLine=35848204;
 //BA.debugLineNum = 35848204;BA.debugLine="Else If (CurrentCLAItem.Origin = 3) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
RDebugUtils.currentLine=35848205;
 //BA.debugLineNum = 35848205;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Curre";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._checklist3.getObject()),"CamImage2",(Object)(mostCurrent._currentclaitem));
 }else 
{RDebugUtils.currentLine=35848206;
 //BA.debugLineNum = 35848206;BA.debugLine="Else If (CurrentCLAItem.Origin = 4) Then";
if ((mostCurrent._currentclaitem.Origin /*int*/ ==4)) { 
RDebugUtils.currentLine=35848207;
 //BA.debugLineNum = 35848207;BA.debugLine="CallSubDelayed2(CameraActivity2, \"CamImage\", C";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._cameraactivity2.getObject()),"CamImage",(Object)(mostCurrent._currentclaitem));
 }}}}
;
 };
RDebugUtils.currentLine=35848210;
 //BA.debugLineNum = 35848210;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=35848211;
 //BA.debugLineNum = 35848211;BA.debugLine="Else If (i=DialogResponse.NEGATIVE) Then";
if ((_i==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE)) { 
 }else {
 }}
;
RDebugUtils.currentLine=35848216;
 //BA.debugLineNum = 35848216;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="imageedit";
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="End Sub";
return "";
}
public static String  _bcbarcode_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bcbarcode_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bcbarcode_click", null));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Sub BCBarcode_Click";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="ButtonBCStates";
_buttonbcstates();
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="BCBarcode.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._bcbarcode.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35127299;
 //BA.debugLineNum = 35127299;BA.debugLine="bb_Barcode = True";
_bb_barcode = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35127300;
 //BA.debugLineNum = 35127300;BA.debugLine="End Sub";
return "";
}
public static String  _buttonbcstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonbcstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonbcstates", null));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Sub ButtonBCStates";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="BCBarcode.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._bcbarcode.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="BCQRCode.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._bcqrcode.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="BCStamp.Color = Colors.ARGB( 150, 119, 218, 255 )";
mostCurrent._bcstamp.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32636933;
 //BA.debugLineNum = 32636933;BA.debugLine="bb_BCBarcode = False";
_bb_bcbarcode = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32636934;
 //BA.debugLineNum = 32636934;BA.debugLine="bb_BCQRCode = False";
_bb_bcqrcode = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32636935;
 //BA.debugLineNum = 32636935;BA.debugLine="bb_BCStamp = False";
_bb_bcstamp = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="End Sub";
return "";
}
public static String  _bcqrcode_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bcqrcode_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bcqrcode_click", null));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Sub BCQRCode_Click";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="ButtonBCStates";
_buttonbcstates();
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="BCQRCode.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._bcqrcode.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="bb_BCQRCode = True";
_bb_bcqrcode = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="End Sub";
return "";
}
public static String  _bcstamp_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bcstamp_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "bcstamp_click", null));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Sub BCStamp_Click";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="ButtonBCStates";
_buttonbcstates();
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="BCStamp.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._bcstamp.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="bb_BCStamp = True";
_bb_bcstamp = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.types._bmr  _bmrcreate(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bmrcreate", false))
	 {return ((xevolution.vrcg.devdemov2400.types._bmr) Debug.delegate(mostCurrent.activityBA, "bmrcreate", new Object[] {_bmp,_r}));}
xevolution.vrcg.devdemov2400.types._bmr _b = null;
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Sub BMRCreate(bmp As B4XBitmap, r As B4XRect) As B";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Dim b As BMR";
_b = new xevolution.vrcg.devdemov2400.types._bmr();
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="b.Initialize";
_b.Initialize();
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="b.btm = bmp";
_b.btm /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="b.rct = RReferCreate( r )";
_b.rct /*xevolution.vrcg.devdemov2400.types._rrefer*/  = _rrefercreate(_r);
RDebugUtils.currentLine=30801925;
 //BA.debugLineNum = 30801925;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._rrefer  _rrefercreate(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rrefercreate", false))
	 {return ((xevolution.vrcg.devdemov2400.types._rrefer) Debug.delegate(mostCurrent.activityBA, "rrefercreate", new Object[] {_r}));}
xevolution.vrcg.devdemov2400.types._rrefer _f = null;
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Sub RReferCreate(r As B4XRect) As RRefer";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Dim f As RRefer";
_f = new xevolution.vrcg.devdemov2400.types._rrefer();
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="f.Initialize";
_f.Initialize();
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="f.Top = r.Top";
_f.Top /*int*/  = (int) (_r.getTop());
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="f.Left = r.Left";
_f.Left /*int*/  = (int) (_r.getLeft());
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="f.Right = r.Right";
_f.Right /*int*/  = (int) (_r.getRight());
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="f.Bottom = r.Bottom";
_f.Bottom /*int*/  = (int) (_r.getBottom());
RDebugUtils.currentLine=30670855;
 //BA.debugLineNum = 30670855;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=30670856;
 //BA.debugLineNum = 30670856;BA.debugLine="End Sub";
return null;
}
public static String  _butacceptcrop_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butacceptcrop_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butacceptcrop_click", null));}
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Sub butAcceptCrop_Click";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="Try";
try {RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="TryToCrop";
_trytocrop();
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="MsgboxAsync(\"Não foi possível efectuar o CROP! T";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence("Não foi possível efectuar o CROP! Tente novamente sff."),BA.ObjectToCharSequence("Alerta!"),processBA);
 };
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="End Sub";
return "";
}
public static String  _trytocrop() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "trytocrop", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "trytocrop", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
String _la = "";
String _lo = "";
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Sub TryToCrop";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="Dim bm As B4XBitmap = ShowImage.Bitmap";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(mostCurrent._showimage.getBitmap()));
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="RectChange(cvsRect, 0,0,ImagePanel.Width, ImagePa";
_rectchange(mostCurrent._cvsrect,(int) (0),(int) (0),mostCurrent._imagepanel.getWidth(),mostCurrent._imagepanel.getHeight());
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="cvs.DrawBitmap(bm, cvsRect)";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(_bm.getObject()),mostCurrent._cvsrect);
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="Dim la As String = Utils.IfNullOrEmpty(LocationSe";
_la = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="Dim lo As String = Utils.IfNullOrEmpty(LocationSe";
_lo = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="cvs = Utils.DTGEOSave2Canvas(cvs, la, lo)";
mostCurrent._cvs = mostCurrent._utils._dtgeosave2canvas /*anywheresoftware.b4a.objects.B4XCanvas*/ (mostCurrent.activityBA,mostCurrent._cvs,_la,_lo);
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="SaveRects.Clear";
_saverects.Clear();
RDebugUtils.currentLine=36044811;
 //BA.debugLineNum = 36044811;BA.debugLine="SaveRects.Add(BMRCreate(bm, cvsRect))";
_saverects.Add((Object)(_bmrcreate(_bm,mostCurrent._cvsrect)));
RDebugUtils.currentLine=36044812;
 //BA.debugLineNum = 36044812;BA.debugLine="ShowPanel.Visible= False";
mostCurrent._showpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=36044813;
 //BA.debugLineNum = 36044813;BA.debugLine="LockPanel.Visible = False";
mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=36044814;
 //BA.debugLineNum = 36044814;BA.debugLine="ShowImage.Bitmap = Null";
mostCurrent._showimage.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=36044816;
 //BA.debugLineNum = 36044816;BA.debugLine="End Sub";
return "";
}
public static String  _butactions_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butactions_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butactions_click", null));}
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Sub butActions_Click";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="If ActionsPanel.Visible = True Then";
if (mostCurrent._actionspanel.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="ActionsPanel.Visible = False";
mostCurrent._actionspanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="ActionsPanel.Visible = True";
mostCurrent._actionspanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=34865158;
 //BA.debugLineNum = 34865158;BA.debugLine="End Sub";
return "";
}
public static String  _butbarcode_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butbarcode_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butbarcode_click", null));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Sub butBarcode_Click";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="bBarcode = setButtonState(butBarcode)";
_bbarcode = _setbuttonstate(mostCurrent._butbarcode);
RDebugUtils.currentLine=33292292;
 //BA.debugLineNum = 33292292;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=33292293;
 //BA.debugLineNum = 33292293;BA.debugLine="BarCodePanel.Visible = True";
mostCurrent._barcodepanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="BCBarcode_Click";
_bcbarcode_click();
RDebugUtils.currentLine=33292295;
 //BA.debugLineNum = 33292295;BA.debugLine="End Sub";
return "";
}
public static String  _buttonstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonstates", null));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Sub ButtonStates";
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="butShot.Color = Colors.ARGB( 155, 78, 151, 255 )";
mostCurrent._butshot.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309253;
 //BA.debugLineNum = 32309253;BA.debugLine="bShot = False";
_bshot = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309254;
 //BA.debugLineNum = 32309254;BA.debugLine="butRect.Color = Colors.ARGB( 155, 78, 151, 255 )";
mostCurrent._butrect.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309255;
 //BA.debugLineNum = 32309255;BA.debugLine="bRect = False";
_brect = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309256;
 //BA.debugLineNum = 32309256;BA.debugLine="butCircle.Color = Colors.ARGB( 155, 78, 151, 255";
mostCurrent._butcircle.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309257;
 //BA.debugLineNum = 32309257;BA.debugLine="bCircle = False";
_bcircle = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309258;
 //BA.debugLineNum = 32309258;BA.debugLine="butMarker.Color = Colors.ARGB( 155, 78, 151, 255";
mostCurrent._butmarker.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309259;
 //BA.debugLineNum = 32309259;BA.debugLine="bMarker = False";
_bmarker = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309260;
 //BA.debugLineNum = 32309260;BA.debugLine="butText.Color = Colors.ARGB( 155, 78, 151, 255 )";
mostCurrent._buttext.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309261;
 //BA.debugLineNum = 32309261;BA.debugLine="bText = False";
_btext = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309262;
 //BA.debugLineNum = 32309262;BA.debugLine="butOCR.Color = Colors.ARGB( 155, 78, 151, 255 )";
mostCurrent._butocr.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309263;
 //BA.debugLineNum = 32309263;BA.debugLine="bOCR = False";
_bocr = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309264;
 //BA.debugLineNum = 32309264;BA.debugLine="butBarcode.Color = Colors.ARGB( 155, 78, 151, 255";
mostCurrent._butbarcode.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309265;
 //BA.debugLineNum = 32309265;BA.debugLine="bBarcode = False";
_bbarcode = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309266;
 //BA.debugLineNum = 32309266;BA.debugLine="butPencil.Color = Colors.ARGB( 155, 78, 151, 255";
mostCurrent._butpencil.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (78),(int) (151),(int) (255)));
RDebugUtils.currentLine=32309267;
 //BA.debugLineNum = 32309267;BA.debugLine="bPencil = False";
_bpencil = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309269;
 //BA.debugLineNum = 32309269;BA.debugLine="butCamera.Color = Colors.ARGB( 155, 0, 155, 255 )";
mostCurrent._butcamera.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (0),(int) (155),(int) (255)));
RDebugUtils.currentLine=32309270;
 //BA.debugLineNum = 32309270;BA.debugLine="bCamera = False";
_bcamera = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32309272;
 //BA.debugLineNum = 32309272;BA.debugLine="PencilPanel.Visible = False";
mostCurrent._pencilpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309273;
 //BA.debugLineNum = 32309273;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309274;
 //BA.debugLineNum = 32309274;BA.debugLine="OCROptPanel.Visible = False";
mostCurrent._ocroptpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309275;
 //BA.debugLineNum = 32309275;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309276;
 //BA.debugLineNum = 32309276;BA.debugLine="PinPanel.Visible = False";
mostCurrent._pinpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309277;
 //BA.debugLineNum = 32309277;BA.debugLine="BarCodePanel.Visible = False";
mostCurrent._barcodepanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309278;
 //BA.debugLineNum = 32309278;BA.debugLine="ActionsPanel.Visible = False";
mostCurrent._actionspanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32309279;
 //BA.debugLineNum = 32309279;BA.debugLine="End Sub";
return "";
}
public static boolean  _setbuttonstate(anywheresoftware.b4a.objects.ButtonWrapper _but) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbuttonstate", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "setbuttonstate", new Object[] {_but}));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Sub setButtonState(but As Button) As Boolean";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="but.Color = Colors.ARGB( 155, 36, 88, 163 )";
_but.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (155),(int) (36),(int) (88),(int) (163)));
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="ActionsPanel.Visible = False";
mostCurrent._actionspanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32702467;
 //BA.debugLineNum = 32702467;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="End Sub";
return false;
}
public static String  _butcamera_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcamera_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcamera_click", null));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Sub butCamera_Click";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="bCamera = setButtonState(butCamera)";
_bcamera = _setbuttonstate(mostCurrent._butcamera);
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=32768014;
 //BA.debugLineNum = 32768014;BA.debugLine="End Sub";
return "";
}
public static String  _butcircle_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcircle_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcircle_click", null));}
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Sub butCircle_Click";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="bCircle = setButtonState(butCircle)";
_bcircle = _setbuttonstate(mostCurrent._butcircle);
RDebugUtils.currentLine=33161221;
 //BA.debugLineNum = 33161221;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=33161222;
 //BA.debugLineNum = 33161222;BA.debugLine="End Sub";
return "";
}
public static String  _butcolors_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butcolors_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butcolors_click", null));}
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Sub butColors_Click";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="If ColorPanel.Visible = True Then";
if (mostCurrent._colorpanel.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=34799620;
 //BA.debugLineNum = 34799620;BA.debugLine="ColorPanel.Visible = True";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=34799622;
 //BA.debugLineNum = 34799622;BA.debugLine="End Sub";
return "";
}
public static String  _butfont16_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfont16_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfont16_click", null));}
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Sub butFont16_Click";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="butFont16.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._butfont16.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="FontSize = 16";
_fontsize = (int) (16);
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="End Sub";
return "";
}
public static String  _buttonfontstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonfontstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonfontstates", null));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Sub ButtonFontStates";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="butFont16.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._butfont16.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="butFont20.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._butfont20.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="butFont24.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._butfont24.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="butFont28.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._butfont28.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32374789;
 //BA.debugLineNum = 32374789;BA.debugLine="butFont32.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._butfont32.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="butFont36.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._butfont36.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32374794;
 //BA.debugLineNum = 32374794;BA.debugLine="End Sub";
return "";
}
public static String  _butfont20_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfont20_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfont20_click", null));}
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Sub butFont20_Click";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="butFont20.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._butfont20.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="FontSize = 20";
_fontsize = (int) (20);
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="End Sub";
return "";
}
public static String  _butfont24_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfont24_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfont24_click", null));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Sub butFont24_Click";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="butFont24.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._butfont24.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="FontSize = 24";
_fontsize = (int) (24);
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34603013;
 //BA.debugLineNum = 34603013;BA.debugLine="End Sub";
return "";
}
public static String  _butfont28_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfont28_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfont28_click", null));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Sub butFont28_Click";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="butFont28.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._butfont28.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34537475;
 //BA.debugLineNum = 34537475;BA.debugLine="FontSize = 28";
_fontsize = (int) (28);
RDebugUtils.currentLine=34537476;
 //BA.debugLineNum = 34537476;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34537477;
 //BA.debugLineNum = 34537477;BA.debugLine="End Sub";
return "";
}
public static String  _butfont32_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfont32_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfont32_click", null));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Sub butFont32_Click";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="butFont32.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._butfont32.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34471939;
 //BA.debugLineNum = 34471939;BA.debugLine="FontSize = 32";
_fontsize = (int) (32);
RDebugUtils.currentLine=34471940;
 //BA.debugLineNum = 34471940;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34471941;
 //BA.debugLineNum = 34471941;BA.debugLine="End Sub";
return "";
}
public static String  _butfont36_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfont36_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfont36_click", null));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Sub butFont36_Click";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="butFont36.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._butfont36.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="FontSize = 36";
_fontsize = (int) (36);
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34406405;
 //BA.debugLineNum = 34406405;BA.debugLine="End Sub";
return "";
}
public static String  _butfonts_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butfonts_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butfonts_click", null));}
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Sub butFonts_Click";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="If FontPanel.Visible = True Then";
if (mostCurrent._fontpanel.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="FontPanel.Visible = False";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=34930692;
 //BA.debugLineNum = 34930692;BA.debugLine="FontPanel.Visible = True";
mostCurrent._fontpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=34930694;
 //BA.debugLineNum = 34930694;BA.debugLine="End Sub";
return "";
}
public static String  _butmarker_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butmarker_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butmarker_click", null));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Sub butMarker_Click";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="bMarker = setButtonState(butMarker)";
_bmarker = _setbuttonstate(mostCurrent._butmarker);
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="PinPanel.Visible = True";
mostCurrent._pinpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33095685;
 //BA.debugLineNum = 33095685;BA.debugLine="End Sub";
return "";
}
public static String  _butocr_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butocr_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butocr_click", null));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Sub butOCR_Click";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=33226755;
 //BA.debugLineNum = 33226755;BA.debugLine="bOCR = setButtonState(butOCR)";
_bocr = _setbuttonstate(mostCurrent._butocr);
RDebugUtils.currentLine=33226756;
 //BA.debugLineNum = 33226756;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=33226757;
 //BA.debugLineNum = 33226757;BA.debugLine="OCROptPanel.Visible = True";
mostCurrent._ocroptpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=33226758;
 //BA.debugLineNum = 33226758;BA.debugLine="butOCRFindSelect_Click";
_butocrfindselect_click();
RDebugUtils.currentLine=33226759;
 //BA.debugLineNum = 33226759;BA.debugLine="End Sub";
return "";
}
public static String  _butocrfindselect_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butocrfindselect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butocrfindselect_click", null));}
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Sub butOCRFindSelect_Click";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="ButtonOCRStates";
_buttonocrstates();
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="butOCRFindSelect.Color = Colors.ARGB( 150, 2, 102";
mostCurrent._butocrfindselect.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="bb_OCRFindSelect = True";
_bb_ocrfindselect = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="End Sub";
return "";
}
public static String  _butocrfindall_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butocrfindall_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butocrfindall_click", null));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Sub butOCRFindAll_Click";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="ButtonOCRStates";
_buttonocrstates();
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="butOCRFindAll.Color = Colors.ARGB( 150, 2, 102, 1";
mostCurrent._butocrfindall.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="bb_OCRFindAll = True";
_bb_ocrfindall = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="End Sub";
return "";
}
public static String  _buttonocrstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonocrstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonocrstates", null));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Sub ButtonOCRStates";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="butOCRFindAll.Color = Colors.ARGB( 150, 119, 218,";
mostCurrent._butocrfindall.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="butOCRFindSelect.Color = Colors.ARGB( 150, 119, 2";
mostCurrent._butocrfindselect.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="bb_OCRFindAll = False";
_bb_ocrfindall = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="bb_OCRFindSelect = False";
_bb_ocrfindselect = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="End Sub";
return "";
}
public static String  _butpencil_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butpencil_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butpencil_click", null));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Sub butPencil_Click";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="bPencil = setButtonState(butPencil)";
_bpencil = _setbuttonstate(mostCurrent._butpencil);
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="PencilPanel.Visible = True";
mostCurrent._pencilpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="butPencilFree_Click";
_butpencilfree_click();
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="End Sub";
return "";
}
public static String  _butpencilfree_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butpencilfree_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butpencilfree_click", null));}
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Sub butPencilFree_Click";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="ButtonPencilStates";
_buttonpencilstates();
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="butPencilFree.Color = Colors.ARGB( 150, 2, 102, 1";
mostCurrent._butpencilfree.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="bb_PencilFree = True";
_bb_pencilfree = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="End Sub";
return "";
}
public static String  _butpencildistance_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butpencildistance_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butpencildistance_click", null));}
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Sub butPencilDistance_Click";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="ButtonPencilStates";
_buttonpencilstates();
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="butPencilDistance.Color = Colors.ARGB( 150, 2, 10";
mostCurrent._butpencildistance.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="bb_PencilDistance = True";
_bb_pencildistance = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpencilstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpencilstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpencilstates", null));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Sub ButtonPencilStates";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="butPencilFree.Color = Colors.ARGB( 150, 119, 218,";
mostCurrent._butpencilfree.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="butPencilDistance.Color = Colors.ARGB( 150, 119,";
mostCurrent._butpencildistance.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="butPencilLine.Color = Colors.ARGB( 150, 119, 218,";
mostCurrent._butpencilline.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="bb_PencilDistance = False";
_bb_pencildistance = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32440326;
 //BA.debugLineNum = 32440326;BA.debugLine="bb_PencilFree = False";
_bb_pencilfree = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="bb_PencilLine = False";
_bb_pencilline = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32440328;
 //BA.debugLineNum = 32440328;BA.debugLine="End Sub";
return "";
}
public static String  _butpencilline_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butpencilline_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butpencilline_click", null));}
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Sub butPencilLine_Click";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="ButtonPencilStates";
_buttonpencilstates();
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="butPencilLine.Color = Colors.ARGB( 150, 2, 102, 1";
mostCurrent._butpencilline.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="bb_PencilLine = True";
_bb_pencilline = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="End Sub";
return "";
}
public static String  _butrect_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butrect_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butrect_click", null));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Sub butRect_Click";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="bRect = setButtonState(butRect)";
_brect = _setbuttonstate(mostCurrent._butrect);
RDebugUtils.currentLine=32964612;
 //BA.debugLineNum = 32964612;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=32964613;
 //BA.debugLineNum = 32964613;BA.debugLine="End Sub";
return "";
}
public static String  _butreset_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butreset_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butreset_click", null));}
b4a.example.bitmapcreator _img = null;
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Sub butReset_Click";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="UndoBMR = SaveRects.Get( 0 )";
mostCurrent._undobmr = (xevolution.vrcg.devdemov2400.types._bmr)(_saverects.Get((int) (0)));
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBMR";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(mostCurrent._undobmr.btm /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_rrefer2b4xrect(mostCurrent._undobmr.rct /*xevolution.vrcg.devdemov2400.types._rrefer*/ ));
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="SaveRects.Clear";
_saverects.Clear();
RDebugUtils.currentLine=35913734;
 //BA.debugLineNum = 35913734;BA.debugLine="Dim img As BitmapCreator";
_img = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
_img._initialize(processBA,(int) (mostCurrent._cvsrect.getWidth()),(int) (mostCurrent._cvsrect.getHeight()));
RDebugUtils.currentLine=35913736;
 //BA.debugLineNum = 35913736;BA.debugLine="img.DrawBitmap(cvs.CreateBitmap, cvsRect, True)";
_img._drawbitmap(mostCurrent._cvs.CreateBitmap(),mostCurrent._cvsrect,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=35913737;
 //BA.debugLineNum = 35913737;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
_saverects.Add((Object)(_bmrcreate(_img._getbitmap(),mostCurrent._cvsrect)));
RDebugUtils.currentLine=35913738;
 //BA.debugLineNum = 35913738;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XCanvas.B4XRect  _rrefer2b4xrect(xevolution.vrcg.devdemov2400.types._rrefer _r) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rrefer2b4xrect", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XRect) Debug.delegate(mostCurrent.activityBA, "rrefer2b4xrect", new Object[] {_r}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _f = null;
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Sub RRefer2B4XRect(r As RRefer) As B4XRect";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Dim f As B4XRect";
_f = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="f.Initialize(r.Left,r.Top,r.Right,r.Bottom)";
_f.Initialize((float) (_r.Left /*int*/ ),(float) (_r.Top /*int*/ ),(float) (_r.Right /*int*/ ),(float) (_r.Bottom /*int*/ ));
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="Return f";
if (true) return _f;
RDebugUtils.currentLine=30736388;
 //BA.debugLineNum = 30736388;BA.debugLine="End Sub";
return null;
}
public static void  _butsave_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butsave_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "butsave_click", null); return;}
ResumableSub_butSave_Click rsub = new ResumableSub_butSave_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_butSave_Click extends BA.ResumableSub {
public ResumableSub_butSave_Click(xevolution.vrcg.devdemov2400.imageedit parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.imageedit parent;
String _thefile = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
xevolution.vrcg.devdemov2400.appactiondialogs _ma = null;
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
int _mid = 0;
String _alerttagcode = "";
anywheresoftware.b4a.objects.collections.List _apilist = null;
anywheresoftware.b4a.objects.collections.Map _params = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="imageedit";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Dim theFile As String = ShotFileName";
_thefile = parent._shotfilename;
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="If (ShotFileLocation = File.DirAssets) Then ShotF";
if (true) break;

case 1:
//if
this.state = 6;
if (((parent._shotfilelocation).equals(anywheresoftware.b4a.keywords.Common.File.getDirAssets()))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._shotfilelocation = parent.mostCurrent._starter._internalfolder /*String*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="If (isB64Image) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._isb64image)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="theFile = $\"IMG-${Utils.MakeFileName}-000.png\"$";
_thefile = ("IMG-"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._makefilename /*String*/ (mostCurrent.activityBA)))+"-000.png");
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="CurrentCLAItem.Value = \"IMG_B64_EDIT\"";
parent.mostCurrent._currentclaitem.Value /*String*/  = "IMG_B64_EDIT";
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="Dim Out As OutputStream = File.OpenOutput(ShotFil";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(parent._shotfilelocation,_thefile,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="cvs.CreateBitmap.WriteToStream(Out, ShareCode.DEV";
parent.mostCurrent._cvs.CreateBitmap().WriteToStream((java.io.OutputStream)(_out.getObject()),parent.mostCurrent._sharecode._device_def_quality /*int*/ ,BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,parent.mostCurrent._sharecode._device_def_img_filetype /*String*/ ));
RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="cvs.Release";
parent.mostCurrent._cvs.Release();
RDebugUtils.currentLine=35651595;
 //BA.debugLineNum = 35651595;BA.debugLine="Out.Close";
_out.Close();
RDebugUtils.currentLine=35651602;
 //BA.debugLineNum = 35651602;BA.debugLine="If (ExitToDialog) Then";
if (true) break;

case 11:
//if
this.state = 34;
if ((parent._exittodialog)) { 
this.state = 13;
}else {
this.state = 33;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=35651604;
 //BA.debugLineNum = 35651604;BA.debugLine="Dim ma As AppActionDialogs";
_ma = new xevolution.vrcg.devdemov2400.appactiondialogs();
RDebugUtils.currentLine=35651605;
 //BA.debugLineNum = 35651605;BA.debugLine="ma.Initialize";
_ma._initialize /*String*/ (null,mostCurrent.activityBA);
RDebugUtils.currentLine=35651606;
 //BA.debugLineNum = 35651606;BA.debugLine="Try";
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
RDebugUtils.currentLine=35651607;
 //BA.debugLineNum = 35651607;BA.debugLine="ma.CameraReturn(theFile, CurrentCLAItem)";
_ma._camerareturn /*void*/ (null,_thefile,parent.mostCurrent._currentclaitem);
 if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
RDebugUtils.currentLine=35651609;
 //BA.debugLineNum = 35651609;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("635651609",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
;
RDebugUtils.currentLine=35651611;
 //BA.debugLineNum = 35651611;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "imageedit", "butsave_click"),(int) (1000));
this.state = 35;
return;
case 35:
//C
this.state = 20;
;
RDebugUtils.currentLine=35651612;
 //BA.debugLineNum = 35651612;BA.debugLine="If (CurrentCLAItem.Origin = 1) Then";
if (true) break;

case 20:
//if
this.state = 31;
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==1)) { 
this.state = 22;
}else 
{RDebugUtils.currentLine=35651614;
 //BA.debugLineNum = 35651614;BA.debugLine="else If (CurrentCLAItem.Origin = 2) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==2)) { 
this.state = 24;
}else 
{RDebugUtils.currentLine=35651616;
 //BA.debugLineNum = 35651616;BA.debugLine="else If (CurrentCLAItem.Origin = 3) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==3)) { 
this.state = 26;
}else 
{RDebugUtils.currentLine=35651618;
 //BA.debugLineNum = 35651618;BA.debugLine="else If (CurrentCLAItem.Origin = 4) Then";
if ((parent.mostCurrent._currentclaitem.Origin /*int*/ ==4)) { 
this.state = 28;
}else {
this.state = 30;
}}}}
if (true) break;

case 22:
//C
this.state = 31;
RDebugUtils.currentLine=35651613;
 //BA.debugLineNum = 35651613;BA.debugLine="CallSubDelayed2(User, \"CallMOREActionsAgain\", C";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._user.getObject()),"CallMOREActionsAgain",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 24:
//C
this.state = 31;
RDebugUtils.currentLine=35651615;
 //BA.debugLineNum = 35651615;BA.debugLine="CallSubDelayed2(requests3, \"CamImage\", CurrentC";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._requests3.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 26:
//C
this.state = 31;
RDebugUtils.currentLine=35651617;
 //BA.debugLineNum = 35651617;BA.debugLine="CallSubDelayed2(CheckList3, \"CamImage2\", Curren";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._checklist3.getObject()),"CamImage2",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=35651619;
 //BA.debugLineNum = 35651619;BA.debugLine="CallSubDelayed2(CameraActivity2, \"CamImage\", Cu";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._cameraactivity2.getObject()),"CamImage",(Object)(parent.mostCurrent._currentclaitem));
 if (true) break;

case 30:
//C
this.state = 31;
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=35651623;
 //BA.debugLineNum = 35651623;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
_this = parent.mostCurrent._currentclaitem;
RDebugUtils.currentLine=35651624;
 //BA.debugLineNum = 35651624;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=35651625;
 //BA.debugLineNum = 35651625;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=35651626;
 //BA.debugLineNum = 35651626;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage";
_imgb64 = _base64con._v6(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+""));
RDebugUtils.currentLine=35651628;
 //BA.debugLineNum = 35651628;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=35651629;
 //BA.debugLineNum = 35651629;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values_images \n"+"					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report,\n"+"					repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"					values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"',\n"+"					'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+"', 1,\n"+"					"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+")");
RDebugUtils.currentLine=35651635;
 //BA.debugLineNum = 35651635;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+""));
RDebugUtils.currentLine=35651637;
 //BA.debugLineNum = 35651637;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
_mid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=35651638;
 //BA.debugLineNum = 35651638;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateT";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._generatetagcode /*String*/ (mostCurrent.activityBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=35651639;
 //BA.debugLineNum = 35651639;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (i";
_ssql = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal, \n"+"				origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"				values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_TASKS', 'ALRTTYP_TASKS', 1, 1, 'Imagens adicionadas ao repositório por utilizar.', \n"+"				'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=35651643;
 //BA.debugLineNum = 35651643;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+""));
RDebugUtils.currentLine=35651645;
 //BA.debugLineNum = 35651645;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_a";
_mid = (int) (parent.mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts_images","id","")+1+1000000);
RDebugUtils.currentLine=35651646;
 //BA.debugLineNum = 35651646;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts_im";
_ssql = ("insert into dta_alerts_images\n"+"					(id, tagcode, imageb64, imagename, assigned)\n"+"					values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_thefile))+"', 0)");
RDebugUtils.currentLine=35651649;
 //BA.debugLineNum = 35651649;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+""));
RDebugUtils.currentLine=35651651;
 //BA.debugLineNum = 35651651;BA.debugLine="Dim ApiList As List";
_apilist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35651652;
 //BA.debugLineNum = 35651652;BA.debugLine="ApiList.Initialize";
_apilist.Initialize();
RDebugUtils.currentLine=35651653;
 //BA.debugLineNum = 35651653;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35651654;
 //BA.debugLineNum = 35651654;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=35651655;
 //BA.debugLineNum = 35651655;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=35651656;
 //BA.debugLineNum = 35651656;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=35651657;
 //BA.debugLineNum = 35651657;BA.debugLine="params.Put(\"tagcode\", alerttagcode)";
_params.Put((Object)("tagcode"),(Object)(_alerttagcode));
RDebugUtils.currentLine=35651658;
 //BA.debugLineNum = 35651658;BA.debugLine="params.Put(\"relation_type\", \"ALRTREL_TASKS\")";
_params.Put((Object)("relation_type"),(Object)("ALRTREL_TASKS"));
RDebugUtils.currentLine=35651659;
 //BA.debugLineNum = 35651659;BA.debugLine="params.Put(\"alert_type\", \"ALRTTYP_TASKS\")";
_params.Put((Object)("alert_type"),(Object)("ALRTTYP_TASKS"));
RDebugUtils.currentLine=35651660;
 //BA.debugLineNum = 35651660;BA.debugLine="params.Put(\"internal\", 1)";
_params.Put((Object)("internal"),(Object)(1));
RDebugUtils.currentLine=35651661;
 //BA.debugLineNum = 35651661;BA.debugLine="params.Put(\"origin\", 1)";
_params.Put((Object)("origin"),(Object)(1));
RDebugUtils.currentLine=35651662;
 //BA.debugLineNum = 35651662;BA.debugLine="params.Put(\"title\", \"Imagens adicionadas ao repo";
_params.Put((Object)("title"),(Object)("Imagens adicionadas ao repositório por utilizar."));
RDebugUtils.currentLine=35651663;
 //BA.debugLineNum = 35651663;BA.debugLine="params.Put(\"user_tagcode\", ShareCode.SESS_User)";
_params.Put((Object)("user_tagcode"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=35651664;
 //BA.debugLineNum = 35651664;BA.debugLine="params.Put(\"date_alert\", Utils.GetCurrentDate)";
_params.Put((Object)("date_alert"),(Object)(parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=35651665;
 //BA.debugLineNum = 35651665;BA.debugLine="params.Put(\"date_verification\", \"\")";
_params.Put((Object)("date_verification"),(Object)(""));
RDebugUtils.currentLine=35651666;
 //BA.debugLineNum = 35651666;BA.debugLine="params.Put(\"alert_visible\", 1)";
_params.Put((Object)("alert_visible"),(Object)(1));
RDebugUtils.currentLine=35651667;
 //BA.debugLineNum = 35651667;BA.debugLine="params.Put(\"imageb64\", ImgB64)";
_params.Put((Object)("imageb64"),(Object)(_imgb64));
RDebugUtils.currentLine=35651668;
 //BA.debugLineNum = 35651668;BA.debugLine="params.Put(\"imagename\", theFile)";
_params.Put((Object)("imagename"),(Object)(_thefile));
RDebugUtils.currentLine=35651669;
 //BA.debugLineNum = 35651669;BA.debugLine="params.Put(\"status_id\", 0)";
_params.Put((Object)("status_id"),(Object)(0));
RDebugUtils.currentLine=35651670;
 //BA.debugLineNum = 35651670;BA.debugLine="params.Put(\"kind_data\", 0)";
_params.Put((Object)("kind_data"),(Object)(0));
RDebugUtils.currentLine=35651671;
 //BA.debugLineNum = 35651671;BA.debugLine="params.Put(\"request_tagcode\", this.Request)";
_params.Put((Object)("request_tagcode"),(Object)(_this.Request /*String*/ ));
RDebugUtils.currentLine=35651672;
 //BA.debugLineNum = 35651672;BA.debugLine="params.Put(\"action_tagcode\", this.Action)";
_params.Put((Object)("action_tagcode"),(Object)(_this.Action /*String*/ ));
RDebugUtils.currentLine=35651673;
 //BA.debugLineNum = 35651673;BA.debugLine="params.Put(\"task_tagcode\", this.Task)";
_params.Put((Object)("task_tagcode"),(Object)(_this.Task /*String*/ ));
RDebugUtils.currentLine=35651674;
 //BA.debugLineNum = 35651674;BA.debugLine="params.Put(\"item_tagcode\", this.Item)";
_params.Put((Object)("item_tagcode"),(Object)(_this.Item /*String*/ ));
RDebugUtils.currentLine=35651675;
 //BA.debugLineNum = 35651675;BA.debugLine="params.Put(\"uniquekey\", this.UniqueKey)";
_params.Put((Object)("uniquekey"),(Object)(_this.UniqueKey /*String*/ ));
RDebugUtils.currentLine=35651676;
 //BA.debugLineNum = 35651676;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=35651677;
 //BA.debugLineNum = 35651677;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=35651678;
 //BA.debugLineNum = 35651678;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=35651679;
 //BA.debugLineNum = 35651679;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=35651680;
 //BA.debugLineNum = 35651680;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=35651681;
 //BA.debugLineNum = 35651681;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=35651682;
 //BA.debugLineNum = 35651682;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=35651683;
 //BA.debugLineNum = 35651683;BA.debugLine="ApiList.Add(params)";
_apilist.Add((Object)(_params.getObject()));
RDebugUtils.currentLine=35651689;
 //BA.debugLineNum = 35651689;BA.debugLine="CallSubDelayed3(MainMenu, \"ListsReturnUpdateServ";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(processBA,(Object)(parent.mostCurrent._mainmenu.getObject()),"ListsReturnUpdateServer",(Object)(("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/alert/new")),(Object)(_apilist));
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=35651695;
 //BA.debugLineNum = 35651695;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=35651697;
 //BA.debugLineNum = 35651697;BA.debugLine="End Sub";
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
public static String  _butshot_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butshot_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butshot_click", null));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Sub butShot_Click 'crop";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="bShot = setButtonState(butShot)";
_bshot = _setbuttonstate(mostCurrent._butshot);
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="End Sub";
return "";
}
public static String  _buttext_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttext_click", null));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Sub butText_Click";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="ButtonStates";
_buttonstates();
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="bText = setButtonState(butText)";
_btext = _setbuttonstate(mostCurrent._buttext);
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="End Sub";
return "";
}
public static String  _button1_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button1_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "button1_click", null));}
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Sub Button1_Click";
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="End Sub";
return "";
}
public static String  _buttonpinstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonpinstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonpinstates", null));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Sub ButtonPINStates";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="PINFoto.Color = Colors.ARGB( 150, 119, 218, 255 )";
mostCurrent._pinfoto.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="PINText.Color = Colors.ARGB( 150, 119, 218, 255 )";
mostCurrent._pintext.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="PINMarker.Color = Colors.ARGB( 150, 119, 218, 255";
mostCurrent._pinmarker.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (119),(int) (218),(int) (255)));
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="bb_PINFoto = False";
_bb_pinfoto = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32571398;
 //BA.debugLineNum = 32571398;BA.debugLine="bb_PINMarker = False";
_bb_pinmarker = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32571399;
 //BA.debugLineNum = 32571399;BA.debugLine="bb_PINText = False";
_bb_pintext = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=32571400;
 //BA.debugLineNum = 32571400;BA.debugLine="End Sub";
return "";
}
public static String  _butundo_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "butundo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "butundo_click", null));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Sub butUndo_Click";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="If SaveRects.Size >1 Then";
if (_saverects.getSize()>1) { 
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="UndoBMR = SaveRects.Get( SaveRects.Size-1 )";
mostCurrent._undobmr = (xevolution.vrcg.devdemov2400.types._bmr)(_saverects.Get((int) (_saverects.getSize()-1)));
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="cvs.DrawBitmap(UndoBMR.btm,RRefer2B4XRect(UndoBM";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(mostCurrent._undobmr.btm /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()),_rrefer2b4xrect(mostCurrent._undobmr.rct /*xevolution.vrcg.devdemov2400.types._rrefer*/ ));
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="SaveRects.RemoveAt( SaveRects.Size-1 )";
_saverects.RemoveAt((int) (_saverects.getSize()-1));
 };
RDebugUtils.currentLine=35586056;
 //BA.debugLineNum = 35586056;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
mostCurrent._memorylabel.setText(BA.ObjectToCharSequence(mostCurrent._utils._getfreemem /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=35586057;
 //BA.debugLineNum = 35586057;BA.debugLine="CheckStates";
_checkstates();
RDebugUtils.currentLine=35586058;
 //BA.debugLineNum = 35586058;BA.debugLine="End Sub";
return "";
}
public static String  _checkstates() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "checkstates", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "checkstates", null));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Sub CheckStates";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="MakeUndo = SaveRects.Size > 1";
_makeundo = _saverects.getSize()>1;
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="butUndo.Enabled = MakeUndo";
mostCurrent._butundo.setEnabled(_makeundo);
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="End Sub";
return "";
}
public static String  _clearundorect() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clearundorect", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clearundorect", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Sub ClearUndoRect";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="UndoRect.Left = 0";
mostCurrent._undorect.setLeft((float) (0));
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="UndoRect.Top = 0";
mostCurrent._undorect.setTop((float) (0));
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="UndoRect.Right = 0";
mostCurrent._undorect.setRight((float) (0));
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="UndoRect.Bottom = 0";
mostCurrent._undorect.setBottom((float) (0));
RDebugUtils.currentLine=31653893;
 //BA.debugLineNum = 31653893;BA.debugLine="UndoRect.Width = 0";
mostCurrent._undorect.setWidth((int) (0));
RDebugUtils.currentLine=31653894;
 //BA.debugLineNum = 31653894;BA.debugLine="UndoRect.Height = 0";
mostCurrent._undorect.setHeight((float) (0));
RDebugUtils.currentLine=31653895;
 //BA.debugLineNum = 31653895;BA.debugLine="End Sub";
return "";
}
public static String  _colorblack_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorblack_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorblack_click", null));}
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Sub ColorBlack_Click";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="LineColor = Colors.Black";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.Black;
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="MarkerColorName = \"black\"";
mostCurrent._markercolorname = "black";
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="End Sub";
return "";
}
public static String  _colorblue_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorblue_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorblue_click", null));}
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Sub ColorBlue_Click";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="LineColor = Colors.Blue";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.Blue;
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="MarkerColorName = \"blue\"";
mostCurrent._markercolorname = "blue";
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33685509;
 //BA.debugLineNum = 33685509;BA.debugLine="End Sub";
return "";
}
public static String  _colorgreen_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorgreen_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorgreen_click", null));}
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Sub ColorGreen_Click";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="LineColor = Colors.Green";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.Green;
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="MarkerColorName = \"green\"";
mostCurrent._markercolorname = "green";
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="End Sub";
return "";
}
public static String  _colorgrey_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorgrey_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorgrey_click", null));}
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Sub ColorGrey_Click";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="LineColor = Colors.Gray";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.Gray;
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="MarkerColorName = \"grey\"";
mostCurrent._markercolorname = "grey";
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="End Sub";
return "";
}
public static String  _colororange_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colororange_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colororange_click", null));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Sub ColorOrange_Click";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="LineColor = Colors.RGB(239, 127, 26)";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (239),(int) (127),(int) (26));
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="MarkerColorName = \"orange\"";
mostCurrent._markercolorname = "orange";
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33554437;
 //BA.debugLineNum = 33554437;BA.debugLine="End Sub";
return "";
}
public static String  _colorpurple_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorpurple_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorpurple_click", null));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Sub ColorPurple_Click";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="LineColor = Colors.RGB(174, 74, 132)";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (174),(int) (74),(int) (132));
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="MarkerColorName = \"purple\"";
mostCurrent._markercolorname = "purple";
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33488901;
 //BA.debugLineNum = 33488901;BA.debugLine="End Sub";
return "";
}
public static String  _colorred_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorred_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorred_click", null));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Sub ColorRed_Click";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="LineColor = Colors.Red";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.Red;
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="MarkerColorName = \"red\"";
mostCurrent._markercolorname = "red";
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33423365;
 //BA.debugLineNum = 33423365;BA.debugLine="End Sub";
return "";
}
public static String  _colorwhite_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "colorwhite_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "colorwhite_click", null));}
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Sub ColorWhite_Click";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="LineColor = Colors.White";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.White;
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="MarkerColorName = \"white\"";
mostCurrent._markercolorname = "white";
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="End Sub";
return "";
}
public static String  _coloryellow_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "coloryellow_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "coloryellow_click", null));}
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Sub ColorYellow_Click";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="LineColor = Colors.Yellow";
_linecolor = anywheresoftware.b4a.keywords.Common.Colors.Yellow;
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="MarkerColorName = \"yellow\"";
mostCurrent._markercolorname = "yellow";
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="ColorPanelIndicator.Color = LineColor";
mostCurrent._colorpanelindicator.setColor(_linecolor);
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="ColorPanel.Visible = False";
mostCurrent._colorpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XCanvas.B4XPath  _createlinepoints(anywheresoftware.b4a.objects.collections.List _lst,boolean _clear,anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rct) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlinepoints", false))
	 {return ((anywheresoftware.b4a.objects.B4XCanvas.B4XPath) Debug.delegate(mostCurrent.activityBA, "createlinepoints", new Object[] {_lst,_clear,_rct}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rr = null;
int _i = 0;
xevolution.vrcg.devdemov2400.types._point _p = null;
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Sub CreateLinePoints(lst As List, clear As Boolean";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="Dim path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="Dim rr As B4XRect";
_rr = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="rr.Initialize(0,0,0,0)";
_rr.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=31457285;
 //BA.debugLineNum = 31457285;BA.debugLine="For i = 0 To lst.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lst.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=31457286;
 //BA.debugLineNum = 31457286;BA.debugLine="Dim p As Point = lst.Get(i)";
_p = (xevolution.vrcg.devdemov2400.types._point)(_lst.Get(_i));
RDebugUtils.currentLine=31457287;
 //BA.debugLineNum = 31457287;BA.debugLine="If (i=0) Then";
if ((_i==0)) { 
RDebugUtils.currentLine=31457288;
 //BA.debugLineNum = 31457288;BA.debugLine="rr.Left = p.X";
_rr.setLeft((float) (_p.X /*int*/ ));
RDebugUtils.currentLine=31457289;
 //BA.debugLineNum = 31457289;BA.debugLine="rr.Right = p.X";
_rr.setRight((float) (_p.X /*int*/ ));
RDebugUtils.currentLine=31457290;
 //BA.debugLineNum = 31457290;BA.debugLine="rr.Top = p.Y";
_rr.setTop((float) (_p.Y /*int*/ ));
RDebugUtils.currentLine=31457291;
 //BA.debugLineNum = 31457291;BA.debugLine="rr.Bottom = p.Y";
_rr.setBottom((float) (_p.Y /*int*/ ));
RDebugUtils.currentLine=31457292;
 //BA.debugLineNum = 31457292;BA.debugLine="path.Initialize(p.X, p.Y)";
_path.Initialize((float) (_p.X /*int*/ ),(float) (_p.Y /*int*/ ));
 }else {
RDebugUtils.currentLine=31457294;
 //BA.debugLineNum = 31457294;BA.debugLine="path.LineTo(p.X, p.Y)";
_path.LineTo((float) (_p.X /*int*/ ),(float) (_p.Y /*int*/ ));
 };
RDebugUtils.currentLine=31457296;
 //BA.debugLineNum = 31457296;BA.debugLine="If p.X < rr.Left Then rr.Left = p.X";
if (_p.X /*int*/ <_rr.getLeft()) { 
_rr.setLeft((float) (_p.X /*int*/ ));};
RDebugUtils.currentLine=31457297;
 //BA.debugLineNum = 31457297;BA.debugLine="If p.X > rr.Right Then rr.Right = p.X";
if (_p.X /*int*/ >_rr.getRight()) { 
_rr.setRight((float) (_p.X /*int*/ ));};
RDebugUtils.currentLine=31457298;
 //BA.debugLineNum = 31457298;BA.debugLine="If p.Y < rr.Top Then rr.Top = p.Y";
if (_p.Y /*int*/ <_rr.getTop()) { 
_rr.setTop((float) (_p.Y /*int*/ ));};
RDebugUtils.currentLine=31457299;
 //BA.debugLineNum = 31457299;BA.debugLine="If p.Y > rr.Bottom Then rr.Bottom = p.Y";
if (_p.Y /*int*/ >_rr.getBottom()) { 
_rr.setBottom((float) (_p.Y /*int*/ ));};
 }
};
RDebugUtils.currentLine=31457301;
 //BA.debugLineNum = 31457301;BA.debugLine="If clear Then";
if (_clear) { 
RDebugUtils.currentLine=31457302;
 //BA.debugLineNum = 31457302;BA.debugLine="lst.Clear";
_lst.Clear();
 };
RDebugUtils.currentLine=31457304;
 //BA.debugLineNum = 31457304;BA.debugLine="rct = rr";
_rct = _rr;
RDebugUtils.currentLine=31457305;
 //BA.debugLineNum = 31457305;BA.debugLine="Return path";
if (true) return _path;
RDebugUtils.currentLine=31457306;
 //BA.debugLineNum = 31457306;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createpin(int _wsize,int _hsize) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createpin", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(mostCurrent.activityBA, "createpin", new Object[] {_wsize,_hsize}));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Sub CreatePIN(wsize As Int, hsize As Int) As B4XBi";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Return xui.LoadBitmapResize(File.DirAssets, \"pins";
if (true) return mostCurrent._xui.LoadBitmapResize(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pins_"+mostCurrent._markercolorname+".png",_wsize,_hsize,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="End Sub";
return null;
}
public static String  _drawpanel_touch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawpanel_touch", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Sub DrawPanel_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Try";
try {RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="DrawPanelTouch(Action, X, Y)";
_drawpaneltouch(_action,_x,_y);
 } 
       catch (Exception e4) {
			processBA.setLastException(e4);RDebugUtils.currentLine=31784964;
 //BA.debugLineNum = 31784964;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("631784964",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=31784966;
 //BA.debugLineNum = 31784966;BA.debugLine="End Sub";
return "";
}
public static void  _drawpaneltouch(int _action,float _x,float _y) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawpaneltouch", false))
	 {Debug.delegate(mostCurrent.activityBA, "drawpaneltouch", new Object[] {_action,_x,_y}); return;}
ResumableSub_DrawPanelTouch rsub = new ResumableSub_DrawPanelTouch(null,_action,_x,_y);
rsub.resume(processBA, null);
}
public static class ResumableSub_DrawPanelTouch extends BA.ResumableSub {
public ResumableSub_DrawPanelTouch(xevolution.vrcg.devdemov2400.imageedit parent,int _action,float _x,float _y) {
this.parent = parent;
this._action = _action;
this._x = _x;
this._y = _y;
}
xevolution.vrcg.devdemov2400.imageedit parent;
int _action;
float _x;
float _y;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
int _ww = 0;
int _hh = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
String _textomedida = "";
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
int _res = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rrect = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="imageedit";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="If Action = DrawPanel.ACTION_DOWN Then";
if (true) break;

case 1:
//if
this.state = 81;
if (_action==parent.mostCurrent._drawpanel.ACTION_DOWN) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=31850517;
 //BA.debugLineNum = 31850517;BA.debugLine="Else If Action = DrawPanel.ACTION_UP Then";
if (_action==parent.mostCurrent._drawpanel.ACTION_UP) { 
this.state = 17;
}else {
this.state = 62;
}}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=31850502;
 //BA.debugLineNum = 31850502;BA.debugLine="If ((bRect) Or (bShot) Or (bText) Or (bPencil))";
if (true) break;

case 4:
//if
this.state = 15;
if (((parent._brect) || (parent._bshot) || (parent._btext) || (parent._bpencil))) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="else If ((bCircle)) Then";
if (((parent._bcircle))) { 
this.state = 14;
}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=31850503;
 //BA.debugLineNum = 31850503;BA.debugLine="sx = X";
parent._sx = (int) (_x);
RDebugUtils.currentLine=31850504;
 //BA.debugLineNum = 31850504;BA.debugLine="sy = Y";
parent._sy = (int) (_y);
RDebugUtils.currentLine=31850505;
 //BA.debugLineNum = 31850505;BA.debugLine="If (bPencil) And (bb_PencilFree) Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._bpencil) && (parent._bb_pencilfree)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=31850507;
 //BA.debugLineNum = 31850507;BA.debugLine="else if (bPencil) And (bb_PencilDistance) Then";
if ((parent._bpencil) && (parent._bb_pencildistance)) { 
this.state = 11;
}}
if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=31850506;
 //BA.debugLineNum = 31850506;BA.debugLine="PointsMap.Add( PointMakeImg(sx, sy) )";
parent.mostCurrent._pointsmap.Add((Object)(_pointmakeimg(parent._sx,parent._sy)));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=31850508;
 //BA.debugLineNum = 31850508;BA.debugLine="StartMetric = PointMakeImg(sx, sy)";
parent.mostCurrent._startmetric = _pointmakeimg(parent._sx,parent._sy);
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=31850511;
 //BA.debugLineNum = 31850511;BA.debugLine="x1 = X";
parent._x1 = (int) (_x);
RDebugUtils.currentLine=31850512;
 //BA.debugLineNum = 31850512;BA.debugLine="y1 = Y";
parent._y1 = (int) (_y);
 if (true) break;

case 15:
//C
this.state = 81;
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=31850519;
 //BA.debugLineNum = 31850519;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = parent.mostCurrent._cvs.CreateBitmap();
RDebugUtils.currentLine=31850520;
 //BA.debugLineNum = 31850520;BA.debugLine="If isUndoRect Then";
if (true) break;

case 18:
//if
this.state = 28;
if (_isundorect()) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=31850522;
 //BA.debugLineNum = 31850522;BA.debugLine="Dim ww As Int = UndoRect.Width";
_ww = (int) (parent.mostCurrent._undorect.getWidth());
RDebugUtils.currentLine=31850523;
 //BA.debugLineNum = 31850523;BA.debugLine="Dim hh As Int = UndoRect.Height";
_hh = (int) (parent.mostCurrent._undorect.getHeight());
RDebugUtils.currentLine=31850524;
 //BA.debugLineNum = 31850524;BA.debugLine="If ww = 0 Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_ww==0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=31850525;
 //BA.debugLineNum = 31850525;BA.debugLine="ww = 1";
_ww = (int) (1);
RDebugUtils.currentLine=31850526;
 //BA.debugLineNum = 31850526;BA.debugLine="UndoRect.Width = ww";
parent.mostCurrent._undorect.setWidth(_ww);
 if (true) break;
;
RDebugUtils.currentLine=31850528;
 //BA.debugLineNum = 31850528;BA.debugLine="If hh = 0 Then";

case 24:
//if
this.state = 27;
if (_hh==0) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=31850529;
 //BA.debugLineNum = 31850529;BA.debugLine="hh = 1";
_hh = (int) (1);
RDebugUtils.currentLine=31850530;
 //BA.debugLineNum = 31850530;BA.debugLine="UndoRect.Height = hh";
parent.mostCurrent._undorect.setHeight((float) (_hh));
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=31850532;
 //BA.debugLineNum = 31850532;BA.debugLine="SaveRects.Add(BMRCreate(bm.Crop(UndoRect.Left,";
parent._saverects.Add((Object)(_bmrcreate(_bm.Crop((int) (parent.mostCurrent._undorect.getLeft()),(int) (parent.mostCurrent._undorect.getTop()),(int) (parent.mostCurrent._undorect.getWidth()),_hh),parent.mostCurrent._undorect)));
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=31850535;
 //BA.debugLineNum = 31850535;BA.debugLine="CurrIndex = CurrIndex + 1";
parent._currindex = (int) (parent._currindex+1);
RDebugUtils.currentLine=31850537;
 //BA.debugLineNum = 31850537;BA.debugLine="If ((bRect) Or (bShot) Or (bText) Or (bPencil))";
if (true) break;

case 29:
//if
this.state = 60;
if (((parent._brect) || (parent._bshot) || (parent._btext) || (parent._bpencil))) { 
this.state = 31;
}else 
{RDebugUtils.currentLine=31850593;
 //BA.debugLineNum = 31850593;BA.debugLine="Else If ((bCircle)) Then";
if (((parent._bcircle))) { 
this.state = 55;
}else 
{RDebugUtils.currentLine=31850604;
 //BA.debugLineNum = 31850604;BA.debugLine="Else If ((bMarker)) Then";
if (((parent._bmarker))) { 
this.state = 57;
}else 
{RDebugUtils.currentLine=31850621;
 //BA.debugLineNum = 31850621;BA.debugLine="Else If ((bCamera)) Then";
if (((parent._bcamera))) { 
this.state = 59;
}}}}
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=31850538;
 //BA.debugLineNum = 31850538;BA.debugLine="If ((bRect)) Then";
if (true) break;

case 32:
//if
this.state = 53;
if (((parent._brect))) { 
this.state = 34;
}else 
{RDebugUtils.currentLine=31850540;
 //BA.debugLineNum = 31850540;BA.debugLine="else if ((bShot)) Then";
if (((parent._bshot))) { 
this.state = 36;
}else 
{RDebugUtils.currentLine=31850551;
 //BA.debugLineNum = 31850551;BA.debugLine="Else if (bPencil) Then";
if ((parent._bpencil)) { 
this.state = 38;
}else {
this.state = 52;
}}}
if (true) break;

case 34:
//C
this.state = 53;
RDebugUtils.currentLine=31850539;
 //BA.debugLineNum = 31850539;BA.debugLine="cvs.DrawRect(DrawingRect, LineColor, False, Li";
parent.mostCurrent._cvs.DrawRect(parent.mostCurrent._drawingrect,parent._linecolor,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
 if (true) break;

case 36:
//C
this.state = 53;
RDebugUtils.currentLine=31850547;
 //BA.debugLineNum = 31850547;BA.debugLine="ShowImage.SetBackgroundImage(bm.Crop(DrawingRe";
parent.mostCurrent._showimage.SetBackgroundImageNew((android.graphics.Bitmap)(_bm.Crop((int) (parent.mostCurrent._drawingrect.getLeft()),(int) (parent.mostCurrent._drawingrect.getTop()),(int) (parent.mostCurrent._drawingrect.getWidth()),(int) (parent.mostCurrent._drawingrect.getHeight())).getObject()));
RDebugUtils.currentLine=31850548;
 //BA.debugLineNum = 31850548;BA.debugLine="LockPanel.Visible = True";
parent.mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31850549;
 //BA.debugLineNum = 31850549;BA.debugLine="ShowPanel.Visible = True";
parent.mostCurrent._showpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=31850552;
 //BA.debugLineNum = 31850552;BA.debugLine="If (bb_PencilLine) Then";
if (true) break;

case 39:
//if
this.state = 50;
if ((parent._bb_pencilline)) { 
this.state = 41;
}else 
{RDebugUtils.currentLine=31850558;
 //BA.debugLineNum = 31850558;BA.debugLine="Else If (bb_PencilDistance) Then";
if ((parent._bb_pencildistance)) { 
this.state = 43;
}else {
this.state = 49;
}}
if (true) break;

case 41:
//C
this.state = 50;
RDebugUtils.currentLine=31850553;
 //BA.debugLineNum = 31850553;BA.debugLine="Dim P As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=31850554;
 //BA.debugLineNum = 31850554;BA.debugLine="P.Initialize(sx, sy)";
_p.Initialize((float) (parent._sx),(float) (parent._sy));
RDebugUtils.currentLine=31850555;
 //BA.debugLineNum = 31850555;BA.debugLine="P.LineTo(X, Y)";
_p.LineTo(_x,_y);
RDebugUtils.currentLine=31850556;
 //BA.debugLineNum = 31850556;BA.debugLine="cvs.DrawPath(P, LineColor, False, LineWidth)";
parent.mostCurrent._cvs.DrawPath(_p,parent._linecolor,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=31850559;
 //BA.debugLineNum = 31850559;BA.debugLine="Dim P As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=31850560;
 //BA.debugLineNum = 31850560;BA.debugLine="P.Initialize(sx, sy)";
_p.Initialize((float) (parent._sx),(float) (parent._sy));
RDebugUtils.currentLine=31850561;
 //BA.debugLineNum = 31850561;BA.debugLine="P.LineTo(X, Y)";
_p.LineTo(_x,_y);
RDebugUtils.currentLine=31850562;
 //BA.debugLineNum = 31850562;BA.debugLine="cvs.DrawPath(P, LineColor, False, LineWidth)";
parent.mostCurrent._cvs.DrawPath(_p,parent._linecolor,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
RDebugUtils.currentLine=31850564;
 //BA.debugLineNum = 31850564;BA.debugLine="Dim TextoMedida As String = \"\"";
_textomedida = "";
RDebugUtils.currentLine=31850566;
 //BA.debugLineNum = 31850566;BA.debugLine="Dim sf As Object = ApplDialog.ShowAsync(\"Intr";
_sf = parent.mostCurrent._appldialog.ShowAsync("Introduza a medida","Continuar","","Cancelar",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=31850567;
 //BA.debugLineNum = 31850567;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorSub, Co";
parent.mostCurrent._utils._setdialogcolors /*String*/ (mostCurrent.activityBA,_sf,parent.mostCurrent._consts._colorsub /*int*/ ,parent.mostCurrent._consts._colormain /*int*/ ,(int) (2),(int) (5));
RDebugUtils.currentLine=31850568;
 //BA.debugLineNum = 31850568;BA.debugLine="ApplDialog.SetSize(350dip, 250dip)";
parent.mostCurrent._appldialog.SetSize(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (350)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (250)));
RDebugUtils.currentLine=31850569;
 //BA.debugLineNum = 31850569;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "imageedit", "drawpaneltouch"), _sf);
this.state = 82;
return;
case 82:
//C
this.state = 44;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=31850570;
 //BA.debugLineNum = 31850570;BA.debugLine="pnl.LoadLayout(\"Dialog_Item_InputText\")";
_pnl.LoadLayout("Dialog_Item_InputText",mostCurrent.activityBA);
RDebugUtils.currentLine=31850571;
 //BA.debugLineNum = 31850571;BA.debugLine="IntputTextField.Text = \"\"";
parent.mostCurrent._intputtextfield.setText((Object)(""));
RDebugUtils.currentLine=31850572;
 //BA.debugLineNum = 31850572;BA.debugLine="Wait For (sf) Dialog_Result(res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "imageedit", "drawpaneltouch"), _sf);
this.state = 83;
return;
case 83:
//C
this.state = 44;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=31850573;
 //BA.debugLineNum = 31850573;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (true) break;

case 44:
//if
this.state = 47;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=31850574;
 //BA.debugLineNum = 31850574;BA.debugLine="TextoMedida = IntputTextField.Text";
_textomedida = parent.mostCurrent._intputtextfield.getText();
 if (true) break;

case 47:
//C
this.state = 50;
;
RDebugUtils.currentLine=31850576;
 //BA.debugLineNum = 31850576;BA.debugLine="Dim rRect As B4XRect";
_rrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=31850577;
 //BA.debugLineNum = 31850577;BA.debugLine="rRect.Initialize(StartMetric.X, StartMetric.Y";
_rrect.Initialize((float) (parent.mostCurrent._startmetric.X /*int*/ ),(float) (parent.mostCurrent._startmetric.Y /*int*/ ),_x,_y);
RDebugUtils.currentLine=31850578;
 //BA.debugLineNum = 31850578;BA.debugLine="Dim f As B4XFont = xui.CreateFont(TextField.T";
_f = parent.mostCurrent._xui.CreateFont(parent.mostCurrent._textfield.getTypeface(),(float) (parent._fontsize));
RDebugUtils.currentLine=31850580;
 //BA.debugLineNum = 31850580;BA.debugLine="DrawTextWithBorder3(cvs, TextoMedida, f, Line";
_drawtextwithborder3(parent.mostCurrent._cvs,_textomedida,_f,parent._linecolor,(int) ((_rrect.getLeft()+_rrect.getRight())/(double)2),(int) ((_rrect.getTop()+_rrect.getBottom())/(double)2));
RDebugUtils.currentLine=31850581;
 //BA.debugLineNum = 31850581;BA.debugLine="cvs.Invalidate";
parent.mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=31850583;
 //BA.debugLineNum = 31850583;BA.debugLine="StartMetric = PointMakeImg(0, 0)";
parent.mostCurrent._startmetric = _pointmakeimg((int) (0),(int) (0));
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=31850585;
 //BA.debugLineNum = 31850585;BA.debugLine="Dim P As B4XPath = CreateLinePoints(PointsMap";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
_p = _createlinepoints(parent.mostCurrent._pointsmap,anywheresoftware.b4a.keywords.Common.True,parent.mostCurrent._undorect);
RDebugUtils.currentLine=31850586;
 //BA.debugLineNum = 31850586;BA.debugLine="cvs.DrawPath(P, LineColor, False, LineWidth)";
parent.mostCurrent._cvs.DrawPath(_p,parent._linecolor,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
 if (true) break;

case 50:
//C
this.state = 53;
;
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=31850591;
 //BA.debugLineNum = 31850591;BA.debugLine="DrawPanelText";
_drawpaneltext();
 if (true) break;

case 53:
//C
this.state = 60;
;
 if (true) break;

case 55:
//C
this.state = 60;
RDebugUtils.currentLine=31850594;
 //BA.debugLineNum = 31850594;BA.debugLine="x0 = X";
parent._x0 = (int) (_x);
RDebugUtils.currentLine=31850595;
 //BA.debugLineNum = 31850595;BA.debugLine="y0 = Y";
parent._y0 = (int) (_y);
RDebugUtils.currentLine=31850596;
 //BA.debugLineNum = 31850596;BA.debugLine="DrawingRect.Left = x1";
parent.mostCurrent._drawingrect.setLeft((float) (parent._x1));
RDebugUtils.currentLine=31850597;
 //BA.debugLineNum = 31850597;BA.debugLine="DrawingRect.Top = y1";
parent.mostCurrent._drawingrect.setTop((float) (parent._y1));
RDebugUtils.currentLine=31850598;
 //BA.debugLineNum = 31850598;BA.debugLine="DrawingRect.Right = x0";
parent.mostCurrent._drawingrect.setRight((float) (parent._x0));
RDebugUtils.currentLine=31850599;
 //BA.debugLineNum = 31850599;BA.debugLine="DrawingRect.Bottom = y0";
parent.mostCurrent._drawingrect.setBottom((float) (parent._y0));
RDebugUtils.currentLine=31850600;
 //BA.debugLineNum = 31850600;BA.debugLine="r0 = Sqrt(Power(x0 - x1, 2) + Power(y0 - y1, 2)";
parent._r0 = (int) (anywheresoftware.b4a.keywords.Common.Sqrt(anywheresoftware.b4a.keywords.Common.Power(parent._x0-parent._x1,2)+anywheresoftware.b4a.keywords.Common.Power(parent._y0-parent._y1,2)));
RDebugUtils.currentLine=31850601;
 //BA.debugLineNum = 31850601;BA.debugLine="cvs.DrawCircle(x1, y1, r0, LineColor, False, Ci";
parent.mostCurrent._cvs.DrawCircle((float) (parent._x1),(float) (parent._y1),(float) (parent._r0),parent._linecolor,anywheresoftware.b4a.keywords.Common.False,(float) (parent._circlestroke));
RDebugUtils.currentLine=31850602;
 //BA.debugLineNum = 31850602;BA.debugLine="x0 = x1";
parent._x0 = parent._x1;
RDebugUtils.currentLine=31850603;
 //BA.debugLineNum = 31850603;BA.debugLine="y0 = y1";
parent._y0 = parent._y1;
 if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=31850614;
 //BA.debugLineNum = 31850614;BA.debugLine="CurrIndex = CurrIndex + 1";
parent._currindex = (int) (parent._currindex+1);
RDebugUtils.currentLine=31850616;
 //BA.debugLineNum = 31850616;BA.debugLine="DrawPanelClick(X, Y)";
_drawpanelclick((int) (_x),(int) (_y));
RDebugUtils.currentLine=31850618;
 //BA.debugLineNum = 31850618;BA.debugLine="CheckStates";
_checkstates();
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=31850622;
 //BA.debugLineNum = 31850622;BA.debugLine="CurrIndex = CurrIndex + 1";
parent._currindex = (int) (parent._currindex+1);
RDebugUtils.currentLine=31850623;
 //BA.debugLineNum = 31850623;BA.debugLine="InnerCounter = InnerCounter + 1";
parent._innercounter = (int) (parent._innercounter+1);
RDebugUtils.currentLine=31850624;
 //BA.debugLineNum = 31850624;BA.debugLine="Touch_X = X";
parent._touch_x = (int) (_x);
RDebugUtils.currentLine=31850625;
 //BA.debugLineNum = 31850625;BA.debugLine="Touch_Y = Y";
parent._touch_y = (int) (_y);
RDebugUtils.currentLine=31850626;
 //BA.debugLineNum = 31850626;BA.debugLine="CallSubDelayed2(CameraActivity_InnerShot, \"Star";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(parent.mostCurrent._cameraactivity_innershot.getObject()),"StartCameraInner",(Object)(parent._innercounter));
RDebugUtils.currentLine=31850627;
 //BA.debugLineNum = 31850627;BA.debugLine="CheckStates";
_checkstates();
 if (true) break;

case 60:
//C
this.state = 81;
;
RDebugUtils.currentLine=31850630;
 //BA.debugLineNum = 31850630;BA.debugLine="DrawingCanvas.ClearRect(DrawingCanvas.TargetRect";
parent.mostCurrent._drawingcanvas.ClearRect(parent.mostCurrent._drawingcanvas.getTargetRect());
RDebugUtils.currentLine=31850631;
 //BA.debugLineNum = 31850631;BA.debugLine="ClearUndoRect";
_clearundorect();
RDebugUtils.currentLine=31850632;
 //BA.debugLineNum = 31850632;BA.debugLine="CheckStates";
_checkstates();
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=31850637;
 //BA.debugLineNum = 31850637;BA.debugLine="If Action = DrawPanel.ACTION_MOVE Then";
if (true) break;

case 63:
//if
this.state = 80;
if (_action==parent.mostCurrent._drawpanel.ACTION_MOVE) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=31850639;
 //BA.debugLineNum = 31850639;BA.debugLine="DrawingCanvas.ClearRect(DrawingCanvas.TargetRec";
parent.mostCurrent._drawingcanvas.ClearRect(parent.mostCurrent._drawingcanvas.getTargetRect());
RDebugUtils.currentLine=31850642;
 //BA.debugLineNum = 31850642;BA.debugLine="If ((bRect) Or (bShot) Or (bText)) Then";
if (true) break;

case 66:
//if
this.state = 79;
if (((parent._brect) || (parent._bshot) || (parent._btext))) { 
this.state = 68;
}else 
{RDebugUtils.currentLine=31850652;
 //BA.debugLineNum = 31850652;BA.debugLine="Else if (bPencil) Then";
if ((parent._bpencil)) { 
this.state = 70;
}else 
{RDebugUtils.currentLine=31850673;
 //BA.debugLineNum = 31850673;BA.debugLine="else If ((bCircle)) Then";
if (((parent._bcircle))) { 
this.state = 78;
}}}
if (true) break;

case 68:
//C
this.state = 79;
RDebugUtils.currentLine=31850644;
 //BA.debugLineNum = 31850644;BA.debugLine="DrawingRect.Left = Min(sx, X)";
parent.mostCurrent._drawingrect.setLeft((float) (anywheresoftware.b4a.keywords.Common.Min(parent._sx,_x)));
RDebugUtils.currentLine=31850645;
 //BA.debugLineNum = 31850645;BA.debugLine="DrawingRect.Right = Max(sx, X)";
parent.mostCurrent._drawingrect.setRight((float) (anywheresoftware.b4a.keywords.Common.Max(parent._sx,_x)));
RDebugUtils.currentLine=31850646;
 //BA.debugLineNum = 31850646;BA.debugLine="DrawingRect.Top = Min(sy, Y)";
parent.mostCurrent._drawingrect.setTop((float) (anywheresoftware.b4a.keywords.Common.Min(parent._sy,_y)));
RDebugUtils.currentLine=31850647;
 //BA.debugLineNum = 31850647;BA.debugLine="DrawingRect.Bottom = Max(sy, Y)";
parent.mostCurrent._drawingrect.setBottom((float) (anywheresoftware.b4a.keywords.Common.Max(parent._sy,_y)));
RDebugUtils.currentLine=31850648;
 //BA.debugLineNum = 31850648;BA.debugLine="DrawingCanvas.DrawRect(DrawingRect, Colors.Whi";
parent.mostCurrent._drawingcanvas.DrawRect(parent.mostCurrent._drawingrect,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
RDebugUtils.currentLine=31850650;
 //BA.debugLineNum = 31850650;BA.debugLine="SaveRectToUndo(DrawingRect)";
_saverecttoundo(parent.mostCurrent._drawingrect);
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=31850653;
 //BA.debugLineNum = 31850653;BA.debugLine="PointsMap.Add( PointMakeImg(X, Y) )";
parent.mostCurrent._pointsmap.Add((Object)(_pointmakeimg((int) (_x),(int) (_y))));
RDebugUtils.currentLine=31850654;
 //BA.debugLineNum = 31850654;BA.debugLine="Dim R As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=31850655;
 //BA.debugLineNum = 31850655;BA.debugLine="R.Initialize(sx, sy, X, Y)";
_r.Initialize((float) (parent._sx),(float) (parent._sy),_x,_y);
RDebugUtils.currentLine=31850656;
 //BA.debugLineNum = 31850656;BA.debugLine="DrawingCanvas.ClearRect(R)";
parent.mostCurrent._drawingcanvas.ClearRect(_r);
RDebugUtils.currentLine=31850658;
 //BA.debugLineNum = 31850658;BA.debugLine="SaveRectToUndo(R)";
_saverecttoundo(_r);
RDebugUtils.currentLine=31850660;
 //BA.debugLineNum = 31850660;BA.debugLine="If (bb_PencilLine) Or (bb_PencilDistance) Then";
if (true) break;

case 71:
//if
this.state = 76;
if ((parent._bb_pencilline) || (parent._bb_pencildistance)) { 
this.state = 73;
}else {
this.state = 75;
}if (true) break;

case 73:
//C
this.state = 76;
RDebugUtils.currentLine=31850661;
 //BA.debugLineNum = 31850661;BA.debugLine="Dim P As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=31850662;
 //BA.debugLineNum = 31850662;BA.debugLine="P.Initialize(sx, sy)";
_p.Initialize((float) (parent._sx),(float) (parent._sy));
RDebugUtils.currentLine=31850663;
 //BA.debugLineNum = 31850663;BA.debugLine="P.LineTo(X, Y)";
_p.LineTo(_x,_y);
RDebugUtils.currentLine=31850664;
 //BA.debugLineNum = 31850664;BA.debugLine="DrawingCanvas.DrawPath(P, Colors.White, False";
parent.mostCurrent._drawingcanvas.DrawPath(_p,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=31850667;
 //BA.debugLineNum = 31850667;BA.debugLine="Dim P As B4XPath = CreateLinePoints(PointsMap";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
_p = _createlinepoints(parent.mostCurrent._pointsmap,anywheresoftware.b4a.keywords.Common.False,_r);
RDebugUtils.currentLine=31850668;
 //BA.debugLineNum = 31850668;BA.debugLine="SaveRectToUndo(R)";
_saverecttoundo(_r);
RDebugUtils.currentLine=31850669;
 //BA.debugLineNum = 31850669;BA.debugLine="DrawingCanvas.DrawPath(P, Colors.White, False";
parent.mostCurrent._drawingcanvas.DrawPath(_p,anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.False,(float) (parent._linewidth));
 if (true) break;

case 76:
//C
this.state = 79;
;
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=31850674;
 //BA.debugLineNum = 31850674;BA.debugLine="DrawingRect.Left = x1";
parent.mostCurrent._drawingrect.setLeft((float) (parent._x1));
RDebugUtils.currentLine=31850675;
 //BA.debugLineNum = 31850675;BA.debugLine="DrawingRect.Right = X";
parent.mostCurrent._drawingrect.setRight(_x);
RDebugUtils.currentLine=31850676;
 //BA.debugLineNum = 31850676;BA.debugLine="DrawingRect.Top = y1";
parent.mostCurrent._drawingrect.setTop((float) (parent._y1));
RDebugUtils.currentLine=31850677;
 //BA.debugLineNum = 31850677;BA.debugLine="DrawingRect.Bottom = Y";
parent.mostCurrent._drawingrect.setBottom(_y);
RDebugUtils.currentLine=31850678;
 //BA.debugLineNum = 31850678;BA.debugLine="SaveRectToUndo(DrawingRect)";
_saverecttoundo(parent.mostCurrent._drawingrect);
RDebugUtils.currentLine=31850679;
 //BA.debugLineNum = 31850679;BA.debugLine="x0 = X";
parent._x0 = (int) (_x);
RDebugUtils.currentLine=31850680;
 //BA.debugLineNum = 31850680;BA.debugLine="y0 = Y";
parent._y0 = (int) (_y);
RDebugUtils.currentLine=31850681;
 //BA.debugLineNum = 31850681;BA.debugLine="r0 = Sqrt(Power(x0 - x1, 2) + Power(y0 - y1, 2";
parent._r0 = (int) (anywheresoftware.b4a.keywords.Common.Sqrt(anywheresoftware.b4a.keywords.Common.Power(parent._x0-parent._x1,2)+anywheresoftware.b4a.keywords.Common.Power(parent._y0-parent._y1,2)));
RDebugUtils.currentLine=31850683;
 //BA.debugLineNum = 31850683;BA.debugLine="DrawingCanvas.DrawCircle(x1, y1, r0, Colors.Wh";
parent.mostCurrent._drawingcanvas.DrawCircle((float) (parent._x1),(float) (parent._y1),(float) (parent._r0),anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.False,(float) (parent._circlestroke));
 if (true) break;

case 79:
//C
this.state = 80;
;
RDebugUtils.currentLine=31850687;
 //BA.debugLineNum = 31850687;BA.debugLine="DrawPanel.Invalidate";
parent.mostCurrent._drawpanel.Invalidate();
 if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;

case 81:
//C
this.state = -1;
;
RDebugUtils.currentLine=31850690;
 //BA.debugLineNum = 31850690;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
parent.mostCurrent._memorylabel.setText(BA.ObjectToCharSequence(parent.mostCurrent._utils._getfreemem /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=31850691;
 //BA.debugLineNum = 31850691;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _drawpanelclick(int _x,int _y) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawpanelclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawpanelclick", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rr = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmr = null;
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Sub DrawPanelClick(X As Int, Y As Int)";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="If ((bMarker)) Then";
if (((_bmarker))) { 
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="Log(\"Marker: \" & X & \":\" & Y)";
anywheresoftware.b4a.keywords.Common.LogImpl("631981570","Marker: "+BA.NumberToString(_x)+":"+BA.NumberToString(_y),0);
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="Dim bm As B4XBitmap = CreatePIN(30, 60)";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = _createpin((int) (30),(int) (60));
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="Dim rr As B4XRect";
_rr = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=31981573;
 //BA.debugLineNum = 31981573;BA.debugLine="rr.Initialize( X-(bm.Width/2), Y-bm.Height, (X-(";
_rr.Initialize((float) (_x-(_bm.getWidth()/(double)2)),(float) (_y-_bm.getHeight()),(float) ((_x-(_bm.getWidth()/(double)2))+_bm.getWidth()),(float) ((_y-_bm.getHeight())+_bm.getHeight()));
RDebugUtils.currentLine=31981574;
 //BA.debugLineNum = 31981574;BA.debugLine="SaveRectToUndo(rr)";
_saverecttoundo(_rr);
RDebugUtils.currentLine=31981576;
 //BA.debugLineNum = 31981576;BA.debugLine="Dim bmr As B4XBitmap = cvs.CreateBitmap";
_bmr = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmr = mostCurrent._cvs.CreateBitmap();
RDebugUtils.currentLine=31981578;
 //BA.debugLineNum = 31981578;BA.debugLine="SaveRects.Add(BMRCreate(bmr.Crop(UndoRect.Left,";
_saverects.Add((Object)(_bmrcreate(_bmr.Crop((int) (mostCurrent._undorect.getLeft()),(int) (mostCurrent._undorect.getTop()),(int) (mostCurrent._undorect.getWidth()),(int) (mostCurrent._undorect.getHeight())),mostCurrent._undorect)));
RDebugUtils.currentLine=31981580;
 //BA.debugLineNum = 31981580;BA.debugLine="cvs.DrawBitmap(bm, rr)";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(_bm.getObject()),_rr);
RDebugUtils.currentLine=31981581;
 //BA.debugLineNum = 31981581;BA.debugLine="cvs.Invalidate";
mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=31981582;
 //BA.debugLineNum = 31981582;BA.debugLine="ClearUndoRect";
_clearundorect();
 }else {
RDebugUtils.currentLine=31981585;
 //BA.debugLineNum = 31981585;BA.debugLine="Log(\"Others\")";
anywheresoftware.b4a.keywords.Common.LogImpl("631981585","Others",0);
 };
RDebugUtils.currentLine=31981587;
 //BA.debugLineNum = 31981587;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
mostCurrent._memorylabel.setText(BA.ObjectToCharSequence(mostCurrent._utils._getfreemem /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=31981588;
 //BA.debugLineNum = 31981588;BA.debugLine="End Sub";
return "";
}
public static String  _saverecttoundo(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rtc) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "saverecttoundo", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "saverecttoundo", new Object[] {_rtc}));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Sub SaveRectToUndo( rtc As B4XRect)";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="UndoRect.Left = rtc.Left - LineWidth";
mostCurrent._undorect.setLeft((float) (_rtc.getLeft()-_linewidth));
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="UndoRect.Top = rtc.Top - LineWidth";
mostCurrent._undorect.setTop((float) (_rtc.getTop()-_linewidth));
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="UndoRect.Right = rtc.Right + LineWidth";
mostCurrent._undorect.setRight((float) (_rtc.getRight()+_linewidth));
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="UndoRect.Bottom = rtc.Bottom + LineWidth";
mostCurrent._undorect.setBottom((float) (_rtc.getBottom()+_linewidth));
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="RedimRect(UndoRect)";
_redimrect(mostCurrent._undorect);
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="End Sub";
return "";
}
public static String  _drawpaneltext() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawpaneltext", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawpaneltext", null));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Sub DrawPanelText";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="If ((bText)) Then";
if (((_btext))) { 
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="TextPanel.Visible=True";
mostCurrent._textpanel.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="TextField.RequestFocus";
mostCurrent._textfield.RequestFocus();
 };
RDebugUtils.currentLine=32047110;
 //BA.debugLineNum = 32047110;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.types._point  _pointmakeimg(int _x,int _y) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pointmakeimg", false))
	 {return ((xevolution.vrcg.devdemov2400.types._point) Debug.delegate(mostCurrent.activityBA, "pointmakeimg", new Object[] {_x,_y}));}
xevolution.vrcg.devdemov2400.types._point _p = null;
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Sub PointMakeImg(X As Int, Y As Int) As Point";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="Dim p As Point";
_p = new xevolution.vrcg.devdemov2400.types._point();
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="p.X=X";
_p.X /*int*/  = _x;
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="p.Y=Y";
_p.Y /*int*/  = _y;
RDebugUtils.currentLine=31391749;
 //BA.debugLineNum = 31391749;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=31391750;
 //BA.debugLineNum = 31391750;BA.debugLine="End Sub";
return null;
}
public static boolean  _isundorect() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "isundorect", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "isundorect", null));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Sub isUndoRect As Boolean";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="Return (UndoRect.Left < UndoRect.Right) And (Undo";
if (true) return (mostCurrent._undorect.getLeft()<mostCurrent._undorect.getRight()) && (mostCurrent._undorect.getTop()<mostCurrent._undorect.getBottom());
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return false;
}
public static String  _drawtextwithborder3(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder3", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder3", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Sub DrawTextWithBorder3 (cvs1 As B4XCanvas, Text A";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=34275331;
 //BA.debugLineNum = 34275331;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=34275332;
 //BA.debugLineNum = 34275332;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=34275333;
 //BA.debugLineNum = 34275333;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=34275334;
 //BA.debugLineNum = 34275334;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, 0)";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (0));
RDebugUtils.currentLine=34275335;
 //BA.debugLineNum = 34275335;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=34275336;
 //BA.debugLineNum = 34275336;BA.debugLine="End Sub";
return "";
}
public static String  _drawtextwithborder(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Sub DrawTextWithBorder (cvs1 As B4XCanvas, Text As";
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="Dim baseline As Int = CenterY - r.Height / 2 - r.";
_baseline = (int) (_centery-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=34144265;
 //BA.debugLineNum = 34144265;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=34144267;
 //BA.debugLineNum = 34144267;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=34144268;
 //BA.debugLineNum = 34144268;BA.debugLine="cvs1.DrawRect(r, Clr, False, border)";
_cvs1.DrawRect(_r,_clr,anywheresoftware.b4a.keywords.Common.False,(float) (_border));
 };
RDebugUtils.currentLine=34144270;
 //BA.debugLineNum = 34144270;BA.debugLine="End Sub";
return "";
}
public static String  _drawtextwithborder2(anywheresoftware.b4a.objects.B4XCanvas _cvs1,String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt,int _clr,int _centerx,int _centery,int _border,int _bline) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "drawtextwithborder2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "drawtextwithborder2", new Object[] {_cvs1,_text,_fnt,_clr,_centerx,_centery,_border,_bline}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _ro = null;
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text A";
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="r.Height = r.Height + (r.Height /2) + 5dip";
_r.setHeight((float) (_r.getHeight()+(_r.getHeight()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="r.Width = r.Width + (r.Width /2) + 5dip ' * 2";
_r.setWidth((int) (_r.getWidth()+(_r.getWidth()/(double)2)+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="Dim baseline As Int = CenterY - ((r.Height - Fnt.";
_baseline = (int) (_centery-((_r.getHeight()-_fnt.getSize())/(double)2)-_r.getTop());
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="r.Initialize(CenterX - r.Width / 2, CenterY - r.H";
_r.Initialize((float) (_centerx-_r.getWidth()/(double)2),(float) (_centery-_r.getHeight()/(double)2),(float) (_centerx+_r.getWidth()/(double)2),(float) (_centery+_r.getHeight()/(double)2));
RDebugUtils.currentLine=34209801;
 //BA.debugLineNum = 34209801;BA.debugLine="If (bline >=1) Then";
if ((_bline>=1)) { 
RDebugUtils.currentLine=34209802;
 //BA.debugLineNum = 34209802;BA.debugLine="cvs1.DrawLine(r.Left, baseline, r.Right, baselin";
_cvs1.DrawLine(_r.getLeft(),(float) (_baseline),_r.getRight(),(float) (_baseline),_clr,(float) (_bline));
 };
RDebugUtils.currentLine=34209804;
 //BA.debugLineNum = 34209804;BA.debugLine="If (border >=1) Then";
if ((_border>=1)) { 
RDebugUtils.currentLine=34209805;
 //BA.debugLineNum = 34209805;BA.debugLine="Dim ro As B4XRect";
_ro = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=34209806;
 //BA.debugLineNum = 34209806;BA.debugLine="ro.Initialize(r.Left-border, r.Top-border, r.Rig";
_ro.Initialize((float) (_r.getLeft()-_border),(float) (_r.getTop()-_border),(float) (_r.getRight()+_border),(float) (_r.getBottom()+_border));
RDebugUtils.currentLine=34209807;
 //BA.debugLineNum = 34209807;BA.debugLine="cvs1.DrawRect(ro, Clr, True, border)";
_cvs1.DrawRect(_ro,_clr,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
RDebugUtils.currentLine=34209808;
 //BA.debugLineNum = 34209808;BA.debugLine="cvs1.DrawRect(r, Consts.ColorWhite, True, border";
_cvs1.DrawRect(_r,mostCurrent._consts._colorwhite /*int*/ ,anywheresoftware.b4a.keywords.Common.True,(float) (_border));
 };
RDebugUtils.currentLine=34209811;
 //BA.debugLineNum = 34209811;BA.debugLine="cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr,";
_cvs1.DrawText(processBA,_text,(float) (_centerx),(float) (_baseline),_fnt,_clr,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=34209812;
 //BA.debugLineNum = 34209812;BA.debugLine="End Sub";
return "";
}
public static String  _hideme_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hideme_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hideme_click", null));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Sub HideMe_Click";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="ShowPanel.Visible= False";
mostCurrent._showpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="LockPanel.Visible = False";
mostCurrent._lockpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=32178181;
 //BA.debugLineNum = 32178181;BA.debugLine="Try";
try {RDebugUtils.currentLine=32178182;
 //BA.debugLineNum = 32178182;BA.debugLine="ShowImage.Bitmap = Null";
mostCurrent._showimage.setBitmap((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null));
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=32178184;
 //BA.debugLineNum = 32178184;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("632178184",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 };
RDebugUtils.currentLine=32178186;
 //BA.debugLineNum = 32178186;BA.debugLine="End Sub";
return "";
}
public static String  _hidetext_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "hidetext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "hidetext_click", null));}
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Sub HideText_Click";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="ButtonFontStates";
_buttonfontstates();
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="TextPanel.Visible=False";
mostCurrent._textpanel.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=34340869;
 //BA.debugLineNum = 34340869;BA.debugLine="End Sub";
return "";
}
public static String  _paramstartblock() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "paramstartblock", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "paramstartblock", null));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Sub ParamStartBlock";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="DrawingCanvas.Initialize(DrawPanel)";
mostCurrent._drawingcanvas.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._drawpanel.getObject())));
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="DrawingRect.Initialize(0, 0, 0, 0)";
mostCurrent._drawingrect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="butPencil_Click";
_butpencil_click();
RDebugUtils.currentLine=30867460;
 //BA.debugLineNum = 30867460;BA.debugLine="ColorRed_Click 'ColorBlack_Click";
_colorred_click();
RDebugUtils.currentLine=30867461;
 //BA.debugLineNum = 30867461;BA.debugLine="memoryLabel.Text = Utils.GetFreeMem";
mostCurrent._memorylabel.setText(BA.ObjectToCharSequence(mostCurrent._utils._getfreemem /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="End Sub";
return "";
}
public static String  _pinfoto_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pinfoto_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pinfoto_click", null));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Sub PINFoto_Click";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="ButtonPINStates";
_buttonpinstates();
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="PINFoto.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._pinfoto.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="bb_PINFoto = True";
_bb_pinfoto = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35323908;
 //BA.debugLineNum = 35323908;BA.debugLine="End Sub";
return "";
}
public static String  _pinmarker_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pinmarker_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pinmarker_click", null));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Sub PINMarker_Click";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="ButtonPINStates";
_buttonpinstates();
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="PINMarker.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._pinmarker.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="bb_PINMarker = True";
_bb_pinmarker = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="End Sub";
return "";
}
public static String  _pintext_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "pintext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "pintext_click", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Sub PINText_Click";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="ButtonPINStates";
_buttonpinstates();
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="PINText.Color = Colors.ARGB( 150, 2, 102, 143 )";
mostCurrent._pintext.setColor(anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (150),(int) (2),(int) (102),(int) (143)));
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="bb_PINText = True";
_bb_pintext = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="End Sub";
return "";
}
public static String  _rectchange(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rtc,int _left,int _top,int _right,int _bottom) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "rectchange", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "rectchange", new Object[] {_rtc,_left,_top,_right,_bottom}));}
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Sub RectChange(rtc As B4XRect, left As Int, top As";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="rtc.Left = left";
_rtc.setLeft((float) (_left));
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="rtc.Top = top";
_rtc.setTop((float) (_top));
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="rtc.Right = right";
_rtc.setRight((float) (_right));
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="rtc.Bottom = bottom";
_rtc.setBottom((float) (_bottom));
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="End Sub";
return "";
}
public static String  _redimrect(anywheresoftware.b4a.objects.B4XCanvas.B4XRect _rtc) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "redimrect", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "redimrect", new Object[] {_rtc}));}
float _l = 0f;
float _t = 0f;
float _r = 0f;
float _b = 0f;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Sub RedimRect(rtc As B4XRect)";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Dim L, T, R, B As Float";
_l = 0f;
_t = 0f;
_r = 0f;
_b = 0f;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="L = rtc.Left";
_l = _rtc.getLeft();
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="T = rtc.Top";
_t = _rtc.getTop();
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="R = rtc.Right";
_r = _rtc.getRight();
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="B = rtc.Bottom";
_b = _rtc.getBottom();
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="If L > R Then";
if (_l>_r) { 
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="L = R";
_l = _r;
RDebugUtils.currentLine=31588360;
 //BA.debugLineNum = 31588360;BA.debugLine="R = L + (rtc.Left - rtc.Right)";
_r = (float) (_l+(_rtc.getLeft()-_rtc.getRight()));
RDebugUtils.currentLine=31588361;
 //BA.debugLineNum = 31588361;BA.debugLine="rtc.Left = L";
_rtc.setLeft(_l);
RDebugUtils.currentLine=31588362;
 //BA.debugLineNum = 31588362;BA.debugLine="rtc.Right = R";
_rtc.setRight(_r);
 };
RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="If T > B Then";
if (_t>_b) { 
RDebugUtils.currentLine=31588366;
 //BA.debugLineNum = 31588366;BA.debugLine="T = B";
_t = _b;
RDebugUtils.currentLine=31588367;
 //BA.debugLineNum = 31588367;BA.debugLine="B = T + (rtc.Top - rtc.Bottom)";
_b = (float) (_t+(_rtc.getTop()-_rtc.getBottom()));
RDebugUtils.currentLine=31588368;
 //BA.debugLineNum = 31588368;BA.debugLine="rtc.Top = T";
_rtc.setTop(_t);
RDebugUtils.currentLine=31588369;
 //BA.debugLineNum = 31588369;BA.debugLine="rtc.Bottom = B";
_rtc.setBottom(_b);
 };
RDebugUtils.currentLine=31588371;
 //BA.debugLineNum = 31588371;BA.debugLine="End Sub";
return "";
}
public static String  _resize() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "resize", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "resize", null));}
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Sub Resize 'ignore";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="cvs.Resize(DrawPanel.Width, DrawPanel.Height)";
mostCurrent._cvs.Resize((float) (mostCurrent._drawpanel.getWidth()),(float) (mostCurrent._drawpanel.getHeight()));
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
mostCurrent._cvs.ClearRect(mostCurrent._cvs.getTargetRect());
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="cvs.Invalidate";
mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=31195140;
 //BA.debugLineNum = 31195140;BA.debugLine="End Sub";
return "";
}
public static String  _saveinnershot(String _filename) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "saveinnershot", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "saveinnershot", new Object[] {_filename}));}
xevolution.vrcg.devdemov2400.types._requestclaitem _this = null;
int _thecounter = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
com.simplysoftware.base64convert.base64convert _base64con = null;
String _imgb64 = "";
int _maxid = 0;
String _ssql = "";
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub SaveInnerShot(FileName As String) ', th";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim this As RequestCLAItem = CurrentCLAItem";
_this = mostCurrent._currentclaitem;
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="Dim theCounter As Int = InnerCounter";
_thecounter = _innercounter;
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="Dim f As B4XFont = xui.CreateFont(TextField.Typef";
_f = mostCurrent._xui.CreateFont(mostCurrent._textfield.getTypeface(),(float) (22));
RDebugUtils.currentLine=35782663;
 //BA.debugLineNum = 35782663;BA.debugLine="DrawTextWithBorder2(cvs, theCounter, f, LineColor";
_drawtextwithborder2(mostCurrent._cvs,BA.NumberToString(_thecounter),_f,_linecolor,_touch_x,_touch_y,(int) (2),(int) (0));
RDebugUtils.currentLine=35782666;
 //BA.debugLineNum = 35782666;BA.debugLine="If Not(Utils.isNullOrEmpty(FileName)) Then";
if (anywheresoftware.b4a.keywords.Common.Not(mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_filename))) { 
RDebugUtils.currentLine=35782667;
 //BA.debugLineNum = 35782667;BA.debugLine="If Not(FileName.IndexOf(\".png\") >= 0) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_filename.indexOf(".png")>=0)) { 
RDebugUtils.currentLine=35782668;
 //BA.debugLineNum = 35782668;BA.debugLine="FileName = $\"${FileName}.png\"$";
_filename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+".png");
 };
RDebugUtils.currentLine=35782670;
 //BA.debugLineNum = 35782670;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
RDebugUtils.currentLine=35782671;
 //BA.debugLineNum = 35782671;BA.debugLine="Base64Con.Initialize";
_base64con._initialize(processBA);
RDebugUtils.currentLine=35782672;
 //BA.debugLineNum = 35782672;BA.debugLine="Dim ImgB64 As String = Base64Con.EncodeFromImage";
_imgb64 = _base64con._v6(mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""));
RDebugUtils.currentLine=35782675;
 //BA.debugLineNum = 35782675;BA.debugLine="Dim maxid As Int = DBStructures.GetMaxOfEVC(\"dta";
_maxid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_requests_values_images","id","")+3+1000000);
RDebugUtils.currentLine=35782676;
 //BA.debugLineNum = 35782676;BA.debugLine="Dim sSQL As String = $\"insert into dta_requests_";
_ssql = ("insert into dta_requests_values_images	\n"+"					(id, request_tagcode, inner_request_tagcode, task_tagcode, item_tagcode, unique_key, tagcode, imageb64, imagename, on_report,\n"+"					repeatcounter, repeatitemcounter, repeatfieldcounter)\n"+"					values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_maxid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Request /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Action /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Task /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Item /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.UniqueKey /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.Tagcode /*String*/ ))+"',\n"+"					'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_imgb64))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+"', 1,\n"+"					"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.RepeatCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.RepeatItemCounter /*int*/ ))+", "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_this.repeatfieldcounter /*int*/ ))+")");
RDebugUtils.currentLine=35782683;
 //BA.debugLineNum = 35782683;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery($\"${sSQL}\"$)";
mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ssql))+""));
RDebugUtils.currentLine=35782684;
 //BA.debugLineNum = 35782684;BA.debugLine="InnerCamShots.Add(FileName)";
mostCurrent._innercamshots.Add((Object)(_filename));
 };
RDebugUtils.currentLine=35782686;
 //BA.debugLineNum = 35782686;BA.debugLine="cvs.Invalidate";
mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=35782687;
 //BA.debugLineNum = 35782687;BA.debugLine="End Sub";
return "";
}
public static String  _showimage_click() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "showimage_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "showimage_click", null));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Sub ShowImage_Click";
RDebugUtils.currentLine=32243729;
 //BA.debugLineNum = 32243729;BA.debugLine="End Sub";
return "";
}
public static String  _startdraw(xevolution.vrcg.devdemov2400.types._requestclaitem _claitem,boolean _ex2dlg) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startdraw", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startdraw", new Object[] {_claitem,_ex2dlg}));}
String _datename = "";
String _saclalatitude = "";
String _saclalongitude = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _drect = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
b4a.example.bitmapcreator _img = null;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Public Sub StartDraw(CLAItem As RequestCLAItem, Ex";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="ShotFileLocation = File.DirAssets";
_shotfilelocation = anywheresoftware.b4a.keywords.Common.File.getDirAssets();
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="isGrid = True";
_isgrid = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="ExitToDialog = Ex2Dlg";
_exittodialog = _ex2dlg;
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="ShotFileName = \"grid.png\"";
_shotfilename = "grid.png";
RDebugUtils.currentLine=30932998;
 //BA.debugLineNum = 30932998;BA.debugLine="PinPointNumber = 0";
_pinpointnumber = (int) (0);
RDebugUtils.currentLine=30932999;
 //BA.debugLineNum = 30932999;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
mostCurrent._activity.LoadLayout("ImageWindow",mostCurrent.activityBA);
RDebugUtils.currentLine=30933000;
 //BA.debugLineNum = 30933000;BA.debugLine="XPosis = 0";
_xposis = (int) (0);
RDebugUtils.currentLine=30933001;
 //BA.debugLineNum = 30933001;BA.debugLine="YPosis = 0";
_yposis = (int) (0);
RDebugUtils.currentLine=30933002;
 //BA.debugLineNum = 30933002;BA.debugLine="PointsMap.Initialize";
mostCurrent._pointsmap.Initialize();
RDebugUtils.currentLine=30933003;
 //BA.debugLineNum = 30933003;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
mostCurrent._undorect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=30933004;
 //BA.debugLineNum = 30933004;BA.debugLine="UndoBMR.Initialize";
mostCurrent._undobmr.Initialize();
RDebugUtils.currentLine=30933008;
 //BA.debugLineNum = 30933008;BA.debugLine="PanelTemp.Initialize(\"\")";
mostCurrent._paneltemp.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=30933009;
 //BA.debugLineNum = 30933009;BA.debugLine="SaveRects.Initialize";
_saverects.Initialize();
RDebugUtils.currentLine=30933011;
 //BA.debugLineNum = 30933011;BA.debugLine="cvs.Initialize(ImagePanel)";
mostCurrent._cvs.Initialize(mostCurrent._imagepanel);
RDebugUtils.currentLine=30933012;
 //BA.debugLineNum = 30933012;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
mostCurrent._cvsrect.Initialize((float) (0),(float) (0),(float) (mostCurrent._imagepanel.getWidth()),(float) (mostCurrent._imagepanel.getHeight()));
RDebugUtils.currentLine=30933013;
 //BA.debugLineNum = 30933013;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocat";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(mostCurrent._xui.LoadBitmapResize(_shotfilelocation,_shotfilename,mostCurrent._imagepanel.getWidth(),mostCurrent._imagepanel.getHeight(),anywheresoftware.b4a.keywords.Common.False).getObject()),mostCurrent._cvsrect);
RDebugUtils.currentLine=30933014;
 //BA.debugLineNum = 30933014;BA.debugLine="Dim DateName As String = Utils.MakeFileName";
_datename = mostCurrent._utils._makefilename /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=30933017;
 //BA.debugLineNum = 30933017;BA.debugLine="Private sACLALatitude As String = Utils.IfNullOrE";
_saclalatitude = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lat /*String*/ ,"");
RDebugUtils.currentLine=30933018;
 //BA.debugLineNum = 30933018;BA.debugLine="Private sACLALongitude As String = Utils.IfNullOr";
_saclalongitude = mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,mostCurrent._locationservice._geolocal /*xevolution.vrcg.devdemov2400.types._geodata*/ .lon /*String*/ ,"");
RDebugUtils.currentLine=30933020;
 //BA.debugLineNum = 30933020;BA.debugLine="DateName = $\"${DateName} - ${sACLALatitude}/${sAC";
_datename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_datename))+" - "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalatitude))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_saclalongitude))+"");
RDebugUtils.currentLine=30933021;
 //BA.debugLineNum = 30933021;BA.debugLine="cvs.DrawText(DateName, 10dip, cvs.TargetRect.Heig";
mostCurrent._cvs.DrawText(processBA,_datename,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (mostCurrent._cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),mostCurrent._xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ )),mostCurrent._xui.Color_DarkGray,BA.getEnumFromString(android.graphics.Paint.Align.class,"LEFT"));
RDebugUtils.currentLine=30933024;
 //BA.debugLineNum = 30933024;BA.debugLine="Dim f As B4XFont = xui.CreateDefaultFont(ShareCod";
_f = mostCurrent._xui.CreateDefaultFont((float) (mostCurrent._sharecode._device_def_font_size /*int*/ ));
RDebugUtils.currentLine=30933025;
 //BA.debugLineNum = 30933025;BA.debugLine="Dim dRect As B4XRect";
_drect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=30933026;
 //BA.debugLineNum = 30933026;BA.debugLine="dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.T";
_drect.Initialize((float) (mostCurrent._cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (mostCurrent._cvs.getTargetRect().getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10))),(float) (mostCurrent._cvs.getTargetRect().getLeft()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (210))),mostCurrent._cvs.getTargetRect().getHeight());
RDebugUtils.currentLine=30933027;
 //BA.debugLineNum = 30933027;BA.debugLine="DrawTextWithBorder2(cvs, DateName, f, Consts.Colo";
_drawtextwithborder2(mostCurrent._cvs,_datename,_f,mostCurrent._consts._colordarkgray /*int*/ ,(int) ((_drect.getLeft()+_drect.getRight())/(double)2),(int) ((_drect.getTop()+_drect.getBottom())/(double)2),(int) (0),(int) (0));
RDebugUtils.currentLine=30933029;
 //BA.debugLineNum = 30933029;BA.debugLine="cvs.Invalidate";
mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=30933031;
 //BA.debugLineNum = 30933031;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = mostCurrent._cvs.CreateBitmap();
RDebugUtils.currentLine=30933032;
 //BA.debugLineNum = 30933032;BA.debugLine="Dim img As BitmapCreator";
_img = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=30933033;
 //BA.debugLineNum = 30933033;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
_img._initialize(processBA,(int) (mostCurrent._cvsrect.getWidth()),(int) (mostCurrent._cvsrect.getHeight()));
RDebugUtils.currentLine=30933034;
 //BA.debugLineNum = 30933034;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
_img._drawbitmap(_bm,mostCurrent._cvsrect,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=30933035;
 //BA.debugLineNum = 30933035;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
_saverects.Add((Object)(_bmrcreate(_img._getbitmap(),mostCurrent._cvsrect)));
RDebugUtils.currentLine=30933038;
 //BA.debugLineNum = 30933038;BA.debugLine="ParamStartBlock";
_paramstartblock();
RDebugUtils.currentLine=30933039;
 //BA.debugLineNum = 30933039;BA.debugLine="End Sub";
return "";
}
public static String  _startdrawfrom(xevolution.vrcg.devdemov2400.types._fileshot _filefolder,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startdrawfrom", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startdrawfrom", new Object[] {_filefolder,_claitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
b4a.example.bitmapcreator _img = null;
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Public Sub StartDrawFrom(Filefolder As FileShot, C";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="RetToCamera = False";
_rettocamera = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="ShotFileLocation = Filefolder.Folder";
_shotfilelocation = _filefolder.Folder /*String*/ ;
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="ShotFileName = Filefolder.Filename";
_shotfilename = _filefolder.Filename /*String*/ ;
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="ExitToDialog = True";
_exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=30998534;
 //BA.debugLineNum = 30998534;BA.debugLine="PinPointNumber = 0";
_pinpointnumber = (int) (0);
RDebugUtils.currentLine=30998535;
 //BA.debugLineNum = 30998535;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
mostCurrent._activity.LoadLayout("ImageWindow",mostCurrent.activityBA);
RDebugUtils.currentLine=30998536;
 //BA.debugLineNum = 30998536;BA.debugLine="XPosis = 0";
_xposis = (int) (0);
RDebugUtils.currentLine=30998537;
 //BA.debugLineNum = 30998537;BA.debugLine="YPosis = 0";
_yposis = (int) (0);
RDebugUtils.currentLine=30998538;
 //BA.debugLineNum = 30998538;BA.debugLine="PointsMap.Initialize";
mostCurrent._pointsmap.Initialize();
RDebugUtils.currentLine=30998539;
 //BA.debugLineNum = 30998539;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
mostCurrent._undorect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=30998540;
 //BA.debugLineNum = 30998540;BA.debugLine="UndoBMR.Initialize";
mostCurrent._undobmr.Initialize();
RDebugUtils.currentLine=30998542;
 //BA.debugLineNum = 30998542;BA.debugLine="PanelTemp.Initialize(\"\")";
mostCurrent._paneltemp.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=30998544;
 //BA.debugLineNum = 30998544;BA.debugLine="SaveRects.Initialize";
_saverects.Initialize();
RDebugUtils.currentLine=30998545;
 //BA.debugLineNum = 30998545;BA.debugLine="cvs.Initialize(ImagePanel)";
mostCurrent._cvs.Initialize(mostCurrent._imagepanel);
RDebugUtils.currentLine=30998546;
 //BA.debugLineNum = 30998546;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
mostCurrent._cvsrect.Initialize((float) (0),(float) (0),(float) (mostCurrent._imagepanel.getWidth()),(float) (mostCurrent._imagepanel.getHeight()));
RDebugUtils.currentLine=30998547;
 //BA.debugLineNum = 30998547;BA.debugLine="cvs.DrawBitmap(xui.LoadBitmapResize(ShotFileLocat";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(mostCurrent._xui.LoadBitmapResize(_shotfilelocation,_shotfilename,mostCurrent._imagepanel.getWidth(),mostCurrent._imagepanel.getHeight(),anywheresoftware.b4a.keywords.Common.False).getObject()),mostCurrent._cvsrect);
RDebugUtils.currentLine=30998549;
 //BA.debugLineNum = 30998549;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = mostCurrent._cvs.CreateBitmap();
RDebugUtils.currentLine=30998550;
 //BA.debugLineNum = 30998550;BA.debugLine="Dim img As BitmapCreator";
_img = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=30998551;
 //BA.debugLineNum = 30998551;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
_img._initialize(processBA,(int) (mostCurrent._cvsrect.getWidth()),(int) (mostCurrent._cvsrect.getHeight()));
RDebugUtils.currentLine=30998552;
 //BA.debugLineNum = 30998552;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
_img._drawbitmap(_bm,mostCurrent._cvsrect,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=30998553;
 //BA.debugLineNum = 30998553;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
_saverects.Add((Object)(_bmrcreate(_img._getbitmap(),mostCurrent._cvsrect)));
RDebugUtils.currentLine=30998554;
 //BA.debugLineNum = 30998554;BA.debugLine="ParamStartBlock";
_paramstartblock();
RDebugUtils.currentLine=30998556;
 //BA.debugLineNum = 30998556;BA.debugLine="End Sub";
return "";
}
public static String  _startdrawfrom2(String _imgb64,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startdrawfrom2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startdrawfrom2", new Object[] {_imgb64,_claitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
b4a.example.bitmapcreator _img = null;
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Public Sub StartDrawFrom2(ImgB64 As String, CLAIte";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="ExitToDialog = True";
_exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
_shotfilelocation = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="ShotFileName = ImgB64";
_shotfilename = _imgb64;
RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="PinPointNumber = 0";
_pinpointnumber = (int) (0);
RDebugUtils.currentLine=31064070;
 //BA.debugLineNum = 31064070;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
mostCurrent._activity.LoadLayout("ImageWindow",mostCurrent.activityBA);
RDebugUtils.currentLine=31064071;
 //BA.debugLineNum = 31064071;BA.debugLine="XPosis = 0";
_xposis = (int) (0);
RDebugUtils.currentLine=31064072;
 //BA.debugLineNum = 31064072;BA.debugLine="YPosis = 0";
_yposis = (int) (0);
RDebugUtils.currentLine=31064073;
 //BA.debugLineNum = 31064073;BA.debugLine="PointsMap.Initialize";
mostCurrent._pointsmap.Initialize();
RDebugUtils.currentLine=31064074;
 //BA.debugLineNum = 31064074;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
mostCurrent._undorect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=31064075;
 //BA.debugLineNum = 31064075;BA.debugLine="UndoBMR.Initialize";
mostCurrent._undobmr.Initialize();
RDebugUtils.currentLine=31064077;
 //BA.debugLineNum = 31064077;BA.debugLine="PanelTemp.Initialize(\"\")";
mostCurrent._paneltemp.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=31064079;
 //BA.debugLineNum = 31064079;BA.debugLine="SaveRects.Initialize";
_saverects.Initialize();
RDebugUtils.currentLine=31064080;
 //BA.debugLineNum = 31064080;BA.debugLine="cvs.Initialize(ImagePanel)";
mostCurrent._cvs.Initialize(mostCurrent._imagepanel);
RDebugUtils.currentLine=31064081;
 //BA.debugLineNum = 31064081;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
mostCurrent._cvsrect.Initialize((float) (0),(float) (0),(float) (mostCurrent._imagepanel.getWidth()),(float) (mostCurrent._imagepanel.getHeight()));
RDebugUtils.currentLine=31064083;
 //BA.debugLineNum = 31064083;BA.debugLine="cvs.DrawBitmap(Utils.B64ToBitmap(ShotFileName), c";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,_shotfilename).getObject()),mostCurrent._cvsrect);
RDebugUtils.currentLine=31064085;
 //BA.debugLineNum = 31064085;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = mostCurrent._cvs.CreateBitmap();
RDebugUtils.currentLine=31064086;
 //BA.debugLineNum = 31064086;BA.debugLine="Dim img As BitmapCreator";
_img = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=31064087;
 //BA.debugLineNum = 31064087;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
_img._initialize(processBA,(int) (mostCurrent._cvsrect.getWidth()),(int) (mostCurrent._cvsrect.getHeight()));
RDebugUtils.currentLine=31064088;
 //BA.debugLineNum = 31064088;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
_img._drawbitmap(_bm,mostCurrent._cvsrect,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31064089;
 //BA.debugLineNum = 31064089;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
_saverects.Add((Object)(_bmrcreate(_img._getbitmap(),mostCurrent._cvsrect)));
RDebugUtils.currentLine=31064092;
 //BA.debugLineNum = 31064092;BA.debugLine="ParamStartBlock";
_paramstartblock();
RDebugUtils.currentLine=31064093;
 //BA.debugLineNum = 31064093;BA.debugLine="End Sub";
return "";
}
public static String  _startdrawfrom3(String _imgb64,xevolution.vrcg.devdemov2400.types._requestclaitem _claitem) throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startdrawfrom3", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startdrawfrom3", new Object[] {_imgb64,_claitem}));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bm = null;
b4a.example.bitmapcreator _img = null;
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Public Sub StartDrawFrom3(ImgB64 As String, CLAIte";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="RetToCamera = False";
_rettocamera = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="isB64Image = True";
_isb64image = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="CurrentCLAItem = CLAItem";
mostCurrent._currentclaitem = _claitem;
RDebugUtils.currentLine=31129604;
 //BA.debugLineNum = 31129604;BA.debugLine="ExitToDialog = True";
_exittodialog = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="ShotFileLocation = Starter.InternalFolder";
_shotfilelocation = mostCurrent._starter._internalfolder /*String*/ ;
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="ShotFileName = ImgB64";
_shotfilename = _imgb64;
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="PinPointNumber = 0";
_pinpointnumber = (int) (0);
RDebugUtils.currentLine=31129608;
 //BA.debugLineNum = 31129608;BA.debugLine="Activity.LoadLayout(\"ImageWindow\")";
mostCurrent._activity.LoadLayout("ImageWindow",mostCurrent.activityBA);
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="XPosis = 0";
_xposis = (int) (0);
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="YPosis = 0";
_yposis = (int) (0);
RDebugUtils.currentLine=31129611;
 //BA.debugLineNum = 31129611;BA.debugLine="PointsMap.Initialize";
mostCurrent._pointsmap.Initialize();
RDebugUtils.currentLine=31129612;
 //BA.debugLineNum = 31129612;BA.debugLine="UndoRect.Initialize(0, 0, 0, 0)";
mostCurrent._undorect.Initialize((float) (0),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=31129613;
 //BA.debugLineNum = 31129613;BA.debugLine="UndoBMR.Initialize";
mostCurrent._undobmr.Initialize();
RDebugUtils.currentLine=31129615;
 //BA.debugLineNum = 31129615;BA.debugLine="PanelTemp.Initialize(\"\")";
mostCurrent._paneltemp.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=31129617;
 //BA.debugLineNum = 31129617;BA.debugLine="SaveRects.Initialize";
_saverects.Initialize();
RDebugUtils.currentLine=31129618;
 //BA.debugLineNum = 31129618;BA.debugLine="cvs.Initialize(ImagePanel)";
mostCurrent._cvs.Initialize(mostCurrent._imagepanel);
RDebugUtils.currentLine=31129619;
 //BA.debugLineNum = 31129619;BA.debugLine="cvsRect.Initialize(0,0,ImagePanel.Width, ImagePan";
mostCurrent._cvsrect.Initialize((float) (0),(float) (0),(float) (mostCurrent._imagepanel.getWidth()),(float) (mostCurrent._imagepanel.getHeight()));
RDebugUtils.currentLine=31129621;
 //BA.debugLineNum = 31129621;BA.debugLine="cvs.DrawBitmap(Utils.B64ToBitmap(ShotFileName), c";
mostCurrent._cvs.DrawBitmap((android.graphics.Bitmap)(mostCurrent._utils._b64tobitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ (mostCurrent.activityBA,_shotfilename).getObject()),mostCurrent._cvsrect);
RDebugUtils.currentLine=31129623;
 //BA.debugLineNum = 31129623;BA.debugLine="Dim bm As B4XBitmap = cvs.CreateBitmap";
_bm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bm = mostCurrent._cvs.CreateBitmap();
RDebugUtils.currentLine=31129624;
 //BA.debugLineNum = 31129624;BA.debugLine="Dim img As BitmapCreator";
_img = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=31129625;
 //BA.debugLineNum = 31129625;BA.debugLine="img.Initialize(cvsRect.Width, cvsRect.Height)";
_img._initialize(processBA,(int) (mostCurrent._cvsrect.getWidth()),(int) (mostCurrent._cvsrect.getHeight()));
RDebugUtils.currentLine=31129626;
 //BA.debugLineNum = 31129626;BA.debugLine="img.DrawBitmap(bm, cvsRect, True)";
_img._drawbitmap(_bm,mostCurrent._cvsrect,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=31129627;
 //BA.debugLineNum = 31129627;BA.debugLine="SaveRects.Add(BMRCreate(img.Bitmap, cvsRect))";
_saverects.Add((Object)(_bmrcreate(_img._getbitmap(),mostCurrent._cvsrect)));
RDebugUtils.currentLine=31129630;
 //BA.debugLineNum = 31129630;BA.debugLine="ParamStartBlock";
_paramstartblock();
RDebugUtils.currentLine=31129631;
 //BA.debugLineNum = 31129631;BA.debugLine="End Sub";
return "";
}
public static String  _textfield_enterpressed() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "textfield_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "textfield_enterpressed", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _f = null;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Sub TextField_EnterPressed";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="Dim f As B4XFont = xui.CreateFont(TextField.Typef";
_f = mostCurrent._xui.CreateFont(mostCurrent._textfield.getTypeface(),(float) (_fontsize));
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="DrawTextWithBorder(cvs, TextField.Text, f, LineCo";
_drawtextwithborder(mostCurrent._cvs,mostCurrent._textfield.getText(),_f,_linecolor,(int) ((mostCurrent._drawingrect.getLeft()+mostCurrent._drawingrect.getRight())/(double)2),(int) ((mostCurrent._drawingrect.getTop()+mostCurrent._drawingrect.getBottom())/(double)2),(int) (0),(int) (0));
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="cvs.Invalidate";
mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="HideText_Click";
_hidetext_click();
RDebugUtils.currentLine=34078725;
 //BA.debugLineNum = 34078725;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
RDebugUtils.currentModule="imageedit";
if (Debug.shouldDelegate(mostCurrent.activityBA, "timer1_tick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "timer1_tick", null));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Sub Timer1_Tick";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
mostCurrent._cvs.ClearRect(mostCurrent._cvs.getTargetRect());
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="If SmileyRect.Right > cvs.TargetRect.Width Then";
if (mostCurrent._smileyrect.getRight()>mostCurrent._cvs.getTargetRect().getWidth()) { 
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="vx = -Abs(vx)";
_vx = -anywheresoftware.b4a.keywords.Common.Abs(_vx);
 }else 
{RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="Else If SmileyRect.Left < 0 Then";
if (mostCurrent._smileyrect.getLeft()<0) { 
RDebugUtils.currentLine=31326213;
 //BA.debugLineNum = 31326213;BA.debugLine="vx = Abs(vx)";
_vx = anywheresoftware.b4a.keywords.Common.Abs(_vx);
 }}
;
RDebugUtils.currentLine=31326215;
 //BA.debugLineNum = 31326215;BA.debugLine="If SmileyRect.Bottom > cvs.TargetRect.Height Then";
if (mostCurrent._smileyrect.getBottom()>mostCurrent._cvs.getTargetRect().getHeight()) { 
RDebugUtils.currentLine=31326216;
 //BA.debugLineNum = 31326216;BA.debugLine="vy = -Abs(vy)";
_vy = -anywheresoftware.b4a.keywords.Common.Abs(_vy);
 }else 
{RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="Else If SmileyRect.Top < 0 Then";
if (mostCurrent._smileyrect.getTop()<0) { 
RDebugUtils.currentLine=31326218;
 //BA.debugLineNum = 31326218;BA.debugLine="vy = Abs(vy)";
_vy = anywheresoftware.b4a.keywords.Common.Abs(_vy);
 }}
;
RDebugUtils.currentLine=31326220;
 //BA.debugLineNum = 31326220;BA.debugLine="SmileyRect.Left = SmileyRect.Left + vx";
mostCurrent._smileyrect.setLeft((float) (mostCurrent._smileyrect.getLeft()+_vx));
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="SmileyRect.Top = SmileyRect.Top + vy";
mostCurrent._smileyrect.setTop((float) (mostCurrent._smileyrect.getTop()+_vy));
RDebugUtils.currentLine=31326222;
 //BA.debugLineNum = 31326222;BA.debugLine="SmileyRect.Width = size";
mostCurrent._smileyrect.setWidth((int) (_size));
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="SmileyRect.Height = size";
mostCurrent._smileyrect.setHeight((float) (_size));
RDebugUtils.currentLine=31326224;
 //BA.debugLineNum = 31326224;BA.debugLine="deg = deg + 1";
_deg = _deg+1;
RDebugUtils.currentLine=31326225;
 //BA.debugLineNum = 31326225;BA.debugLine="cvs.DrawBitmapRotated(smiley, SmileyRect, deg)";
mostCurrent._cvs.DrawBitmapRotated((android.graphics.Bitmap)(mostCurrent._smiley.getObject()),mostCurrent._smileyrect,(float) (_deg));
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="cvs.Invalidate";
mostCurrent._cvs.Invalidate();
RDebugUtils.currentLine=31326228;
 //BA.debugLineNum = 31326228;BA.debugLine="End Sub";
return "";
}
}