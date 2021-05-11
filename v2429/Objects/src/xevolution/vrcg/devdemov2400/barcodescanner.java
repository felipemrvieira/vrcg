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

public class barcodescanner extends Activity implements B4AActivity{
	public static barcodescanner mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.barcodescanner");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (barcodescanner).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.barcodescanner");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.barcodescanner", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (barcodescanner) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (barcodescanner) Resume **");
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
		return barcodescanner.class;
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
            BA.LogInfo("** Activity (barcodescanner) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (barcodescanner) Pause event (activity is not paused). **");
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
            barcodescanner mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (barcodescanner) Resume **");
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
public static boolean _frontcamera = false;
public static anywheresoftware.b4j.object.JavaObject _detector = null;
public static boolean _searchforbarcodes = false;
public static long _lastpreview = 0L;
public static int _intervalbetweenpreviewsms = 0;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public xevolution.vrcg.devdemov2400.cameraexclass _camex = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnldrawing = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public static boolean _scanonlyone = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btncancel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclear = null;
public anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _txt2set = null;
public static String _passedact = "";
public b4a.example3.customlistview _listacodigoslidos = null;
public anywheresoftware.b4a.objects.LabelWrapper _barcodestring = null;
public anywheresoftware.b4a.objects.LabelWrapper _barcodestate = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _barcodecheck = null;
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
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=119078912;
 //BA.debugLineNum = 119078912;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=119078913;
 //BA.debugLineNum = 119078913;BA.debugLine="Activity.LoadLayout(\"scanner\")";
mostCurrent._activity.LoadLayout("scanner",mostCurrent.activityBA);
RDebugUtils.currentLine=119078915;
 //BA.debugLineNum = 119078915;BA.debugLine="If ShareCode.ClearBarcodeList = True Then";
if (mostCurrent._sharecode._clearbarcodelist /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=119078916;
 //BA.debugLineNum = 119078916;BA.debugLine="ShareCode.ScanList.Clear";
mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=119078917;
 //BA.debugLineNum = 119078917;BA.debugLine="ListaCodigosLidos.Clear";
mostCurrent._listacodigoslidos._clear();
 };
RDebugUtils.currentLine=119078920;
 //BA.debugLineNum = 119078920;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=119078921;
 //BA.debugLineNum = 119078921;BA.debugLine="CreateDetector (Array(\"ALL_FORMATS\"))";
_createdetector(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("ALL_FORMATS")}));
 };
RDebugUtils.currentLine=119078923;
 //BA.debugLineNum = 119078923;BA.debugLine="cvs.Initialize(pnlDrawing)";
mostCurrent._cvs.Initialize((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(mostCurrent._pnldrawing.getObject())));
RDebugUtils.currentLine=119078924;
 //BA.debugLineNum = 119078924;BA.debugLine="ShareCode.ScanList.Initialize";
mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=119078925;
 //BA.debugLineNum = 119078925;BA.debugLine="End Sub";
return "";
}
public static String  _createdetector(anywheresoftware.b4a.objects.collections.List _codes) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createdetector", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "createdetector", new Object[] {_codes}));}
anywheresoftware.b4j.object.JavaObject _ctxt = null;
anywheresoftware.b4j.object.JavaObject _builder = null;
String _barcodeclass = "";
anywheresoftware.b4j.object.JavaObject _barcodestatic = null;
int _format = 0;
String _formatname = "";
boolean _operational = false;
RDebugUtils.currentLine=119472128;
 //BA.debugLineNum = 119472128;BA.debugLine="Private Sub CreateDetector (Codes As List)";
RDebugUtils.currentLine=119472129;
 //BA.debugLineNum = 119472129;BA.debugLine="Dim ctxt As JavaObject";
_ctxt = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=119472130;
 //BA.debugLineNum = 119472130;BA.debugLine="ctxt.InitializeContext";
_ctxt.InitializeContext(processBA);
RDebugUtils.currentLine=119472131;
 //BA.debugLineNum = 119472131;BA.debugLine="Dim builder As JavaObject";
_builder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=119472132;
 //BA.debugLineNum = 119472132;BA.debugLine="builder.InitializeNewInstance(\"com/google/android";
_builder.InitializeNewInstance("com/google/android/gms/vision/barcode/BarcodeDetector.Builder".replace("/","."),new Object[]{(Object)(_ctxt.getObject())});
RDebugUtils.currentLine=119472133;
 //BA.debugLineNum = 119472133;BA.debugLine="Dim barcodeClass As String = \"com/google/android/";
_barcodeclass = "com/google/android/gms/vision/barcode/Barcode".replace("/",".");
RDebugUtils.currentLine=119472134;
 //BA.debugLineNum = 119472134;BA.debugLine="Dim barcodeStatic As JavaObject";
_barcodestatic = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=119472135;
 //BA.debugLineNum = 119472135;BA.debugLine="barcodeStatic.InitializeStatic(barcodeClass)";
_barcodestatic.InitializeStatic(_barcodeclass);
RDebugUtils.currentLine=119472136;
 //BA.debugLineNum = 119472136;BA.debugLine="Dim format As Int";
_format = 0;
RDebugUtils.currentLine=119472137;
 //BA.debugLineNum = 119472137;BA.debugLine="For Each formatName As String In Codes";
{
final anywheresoftware.b4a.BA.IterableList group9 = _codes;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_formatname = BA.ObjectToString(group9.Get(index9));
RDebugUtils.currentLine=119472138;
 //BA.debugLineNum = 119472138;BA.debugLine="format = Bit.Or(format, barcodeStatic.GetField(f";
_format = anywheresoftware.b4a.keywords.Common.Bit.Or(_format,(int)(BA.ObjectToNumber(_barcodestatic.GetField(_formatname))));
 }
};
RDebugUtils.currentLine=119472140;
 //BA.debugLineNum = 119472140;BA.debugLine="builder.RunMethod(\"setBarcodeFormats\", Array(form";
_builder.RunMethod("setBarcodeFormats",new Object[]{(Object)(_format)});
RDebugUtils.currentLine=119472141;
 //BA.debugLineNum = 119472141;BA.debugLine="detector = builder.RunMethod(\"build\", Null)";
_detector = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_builder.RunMethod("build",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=119472142;
 //BA.debugLineNum = 119472142;BA.debugLine="Dim operational As Boolean = detector.RunMethod(\"";
_operational = BA.ObjectToBoolean(_detector.RunMethod("isOperational",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=119472143;
 //BA.debugLineNum = 119472143;BA.debugLine="Log(\"Is detector operational: \" & operational)";
anywheresoftware.b4a.keywords.Common.LogImpl("6119472143","Is detector operational: "+BA.ObjectToString(_operational),0);
RDebugUtils.currentLine=119472144;
 //BA.debugLineNum = 119472144;BA.debugLine="SearchForBarcodes = operational";
_searchforbarcodes = _operational;
RDebugUtils.currentLine=119472146;
 //BA.debugLineNum = 119472146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="barcodescanner";
RDebugUtils.currentLine=119734272;
 //BA.debugLineNum = 119734272;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=119734273;
 //BA.debugLineNum = 119734273;BA.debugLine="If camEx.IsInitialized Then";
if (mostCurrent._camex.IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=119734274;
 //BA.debugLineNum = 119734274;BA.debugLine="camEx.Release";
mostCurrent._camex._release /*String*/ (null);
 };
RDebugUtils.currentLine=119734276;
 //BA.debugLineNum = 119734276;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=119603200;
 //BA.debugLineNum = 119603200;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=119603201;
 //BA.debugLineNum = 119603201;BA.debugLine="InitializeCamera";
_initializecamera();
RDebugUtils.currentLine=119603202;
 //BA.debugLineNum = 119603202;BA.debugLine="End Sub";
return "";
}
public static void  _initializecamera() throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "initializecamera", false))
	 {Debug.delegate(mostCurrent.activityBA, "initializecamera", null); return;}
ResumableSub_InitializeCamera rsub = new ResumableSub_InitializeCamera(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_InitializeCamera extends BA.ResumableSub {
public ResumableSub_InitializeCamera(xevolution.vrcg.devdemov2400.barcodescanner parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.barcodescanner parent;
String _permission = "";
boolean _result = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="barcodescanner";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=119668737;
 //BA.debugLineNum = 119668737;BA.debugLine="Starter.rp.CheckAndRequest(Starter.rp.PERMISSION_";
parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .CheckAndRequest(processBA,parent.mostCurrent._starter._rp /*anywheresoftware.b4a.objects.RuntimePermissions*/ .PERMISSION_CAMERA);
RDebugUtils.currentLine=119668738;
 //BA.debugLineNum = 119668738;BA.debugLine="Wait For Activity_PermissionResult (Permission As";
anywheresoftware.b4a.keywords.Common.WaitFor("activity_permissionresult", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "barcodescanner", "initializecamera"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_permission = (String) result[0];
_result = (Boolean) result[1];
;
RDebugUtils.currentLine=119668739;
 //BA.debugLineNum = 119668739;BA.debugLine="If Result Then";
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
RDebugUtils.currentLine=119668740;
 //BA.debugLineNum = 119668740;BA.debugLine="camEx.Initialize(Panel1, frontCamera, Me, \"ScanC";
parent.mostCurrent._camex._initialize /*String*/ (null,mostCurrent.activityBA,parent.mostCurrent._panel1,parent._frontcamera,barcodescanner.getObject(),"ScanCamera");
RDebugUtils.currentLine=119668741;
 //BA.debugLineNum = 119668741;BA.debugLine="frontCamera = camEx.Front";
parent._frontcamera = parent.mostCurrent._camex._front /*boolean*/ ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=119668743;
 //BA.debugLineNum = 119668743;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btncancel_click() throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncancel_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btncancel_click", null); return;}
ResumableSub_btnCancel_Click rsub = new ResumableSub_btnCancel_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnCancel_Click extends BA.ResumableSub {
public ResumableSub_btnCancel_Click(xevolution.vrcg.devdemov2400.barcodescanner parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.barcodescanner parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="barcodescanner";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=119930881;
 //BA.debugLineNum = 119930881;BA.debugLine="Log(\"BTNCANCEL\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6119930881","BTNCANCEL",0);
RDebugUtils.currentLine=119930882;
 //BA.debugLineNum = 119930882;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "barcodescanner", "btncancel_click"),(int) (100));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=119930883;
 //BA.debugLineNum = 119930883;BA.debugLine="Return2Activity";
_return2activity();
RDebugUtils.currentLine=119930884;
 //BA.debugLineNum = 119930884;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _return2activity() throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "return2activity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "return2activity", null));}
RDebugUtils.currentLine=119406592;
 //BA.debugLineNum = 119406592;BA.debugLine="Sub Return2Activity";
RDebugUtils.currentLine=119406593;
 //BA.debugLineNum = 119406593;BA.debugLine="If PassedAct = \"CheckList3\" Then";
if ((mostCurrent._passedact).equals("CheckList3")) { 
RDebugUtils.currentLine=119406594;
 //BA.debugLineNum = 119406594;BA.debugLine="CallSubDelayed2(CheckList3,\"returnedFromScanner\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._checklist3.getObject()),"returnedFromScanner",(Object)(mostCurrent._txt2set));
RDebugUtils.currentLine=119406595;
 //BA.debugLineNum = 119406595;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=119406596;
 //BA.debugLineNum = 119406596;BA.debugLine="Else If PassedAct = \"requests3\" Then";
if ((mostCurrent._passedact).equals("requests3")) { 
RDebugUtils.currentLine=119406597;
 //BA.debugLineNum = 119406597;BA.debugLine="CallSubDelayed(requests3, \"returnedFromScanner\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._requests3.getObject()),"returnedFromScanner");
RDebugUtils.currentLine=119406598;
 //BA.debugLineNum = 119406598;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=119406599;
 //BA.debugLineNum = 119406599;BA.debugLine="Else If PassedAct = \"MainMenu\" Then";
if ((mostCurrent._passedact).equals("MainMenu")) { 
RDebugUtils.currentLine=119406600;
 //BA.debugLineNum = 119406600;BA.debugLine="CallSubDelayed(MainMenu, \"returnedFromScanner\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._mainmenu.getObject()),"returnedFromScanner");
RDebugUtils.currentLine=119406601;
 //BA.debugLineNum = 119406601;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }else 
{RDebugUtils.currentLine=119406602;
 //BA.debugLineNum = 119406602;BA.debugLine="else if PassedAct = \"CalledFromChapter\" Then";
if ((mostCurrent._passedact).equals("CalledFromChapter")) { 
RDebugUtils.currentLine=119406603;
 //BA.debugLineNum = 119406603;BA.debugLine="CallSubDelayed(CheckList3,\"returnedFromScanner2\"";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(processBA,(Object)(mostCurrent._checklist3.getObject()),"returnedFromScanner2");
RDebugUtils.currentLine=119406604;
 //BA.debugLineNum = 119406604;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
 }}}}
;
RDebugUtils.currentLine=119406606;
 //BA.debugLineNum = 119406606;BA.debugLine="End Sub";
return "";
}
public static void  _btnclear_click() throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnclear_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnclear_click", null); return;}
ResumableSub_btnClear_Click rsub = new ResumableSub_btnClear_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnClear_Click extends BA.ResumableSub {
public ResumableSub_btnClear_Click(xevolution.vrcg.devdemov2400.barcodescanner parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.barcodescanner parent;
int _result = 0;
anywheresoftware.b4a.objects.collections.List _lst2delete = null;
int _t = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _check_box = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_state = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_barcode = null;
int _l = 0;
anywheresoftware.b4a.objects.collections.List _linha2recover = null;
String _sta = "";
String _cbqr = "";
int _stacod = 0;
int step9;
int limit9;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="barcodescanner";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=119996417;
 //BA.debugLineNum = 119996417;BA.debugLine="Msgbox2Async(\"Limpar todos os códigos lidos ?\", \"";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence("Limpar todos os códigos lidos ?"),BA.ObjectToCharSequence("Reinicializar lista de códigos"),"Todos","Seleccionados","Não",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119996418;
 //BA.debugLineNum = 119996418;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "barcodescanner", "btnclear_click"), null);
this.state = 27;
return;
case 27:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=119996419;
 //BA.debugLineNum = 119996419;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
if (true) break;

case 1:
//if
this.state = 26;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 3;
}else 
{RDebugUtils.currentLine=119996422;
 //BA.debugLineNum = 119996422;BA.debugLine="else if Result = DialogResponse.CANCEL Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.CANCEL) { 
this.state = 5;
}}
if (true) break;

case 3:
//C
this.state = 26;
RDebugUtils.currentLine=119996420;
 //BA.debugLineNum = 119996420;BA.debugLine="ListaCodigosLidos.Clear";
parent.mostCurrent._listacodigoslidos._clear();
RDebugUtils.currentLine=119996421;
 //BA.debugLineNum = 119996421;BA.debugLine="ShareCode.ScanList.Clear";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=119996423;
 //BA.debugLineNum = 119996423;BA.debugLine="Dim lst2delete As List";
_lst2delete = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=119996424;
 //BA.debugLineNum = 119996424;BA.debugLine="lst2delete.Initialize";
_lst2delete.Initialize();
RDebugUtils.currentLine=119996425;
 //BA.debugLineNum = 119996425;BA.debugLine="For t=0 To ListaCodigosLidos.Size -1";
if (true) break;

case 6:
//for
this.state = 13;
step9 = 1;
limit9 = (int) (parent.mostCurrent._listacodigoslidos._getsize()-1);
_t = (int) (0) ;
this.state = 28;
if (true) break;

case 28:
//C
this.state = 13;
if ((step9 > 0 && _t <= limit9) || (step9 < 0 && _t >= limit9)) this.state = 8;
if (true) break;

case 29:
//C
this.state = 28;
_t = ((int)(0 + _t + step9)) ;
if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=119996426;
 //BA.debugLineNum = 119996426;BA.debugLine="Dim pnl As Panel = ListaCodigosLidos.GetPanel(t";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._listacodigoslidos._getpanel(_t).getObject()));
RDebugUtils.currentLine=119996427;
 //BA.debugLineNum = 119996427;BA.debugLine="Dim check_box As CheckBox = pnl.GetView(0)";
_check_box = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_check_box = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=119996428;
 //BA.debugLineNum = 119996428;BA.debugLine="Dim lbl_state As Label = pnl.GetView(1)";
_lbl_state = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_state = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=119996429;
 //BA.debugLineNum = 119996429;BA.debugLine="Dim lbl_barcode As Label  = pnl.GetView(2)";
_lbl_barcode = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_barcode = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=119996430;
 //BA.debugLineNum = 119996430;BA.debugLine="If Not(check_box.Checked) Then";
if (true) break;

case 9:
//if
this.state = 12;
if (anywheresoftware.b4a.keywords.Common.Not(_check_box.getChecked())) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=119996431;
 //BA.debugLineNum = 119996431;BA.debugLine="lst2delete.Add($\"0;${lbl_state.text};${lbl_bar";
_lst2delete.Add((Object)(("0;"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl_state.getText()))+";"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lbl_barcode.getText()))+"")));
 if (true) break;

case 12:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=119996435;
 //BA.debugLineNum = 119996435;BA.debugLine="ListaCodigosLidos.Clear";
parent.mostCurrent._listacodigoslidos._clear();
RDebugUtils.currentLine=119996436;
 //BA.debugLineNum = 119996436;BA.debugLine="ShareCode.ScanList.Clear";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=119996438;
 //BA.debugLineNum = 119996438;BA.debugLine="For l=0 To lst2delete.Size -1";
if (true) break;

case 14:
//for
this.state = 25;
step20 = 1;
limit20 = (int) (_lst2delete.getSize()-1);
_l = (int) (0) ;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 25;
if ((step20 > 0 && _l <= limit20) || (step20 < 0 && _l >= limit20)) this.state = 16;
if (true) break;

case 31:
//C
this.state = 30;
_l = ((int)(0 + _l + step20)) ;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=119996439;
 //BA.debugLineNum = 119996439;BA.debugLine="Dim linha2recover As List =  Regex.Split(\";\",ls";
_linha2recover = new anywheresoftware.b4a.objects.collections.List();
_linha2recover = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(";",BA.ObjectToString(_lst2delete.Get(_l))));
RDebugUtils.currentLine=119996440;
 //BA.debugLineNum = 119996440;BA.debugLine="Dim Sta As String = linha2recover.Get(1)";
_sta = BA.ObjectToString(_linha2recover.Get((int) (1)));
RDebugUtils.currentLine=119996441;
 //BA.debugLineNum = 119996441;BA.debugLine="Dim CBQR As String = linha2recover.Get(2)";
_cbqr = BA.ObjectToString(_linha2recover.Get((int) (2)));
RDebugUtils.currentLine=119996442;
 //BA.debugLineNum = 119996442;BA.debugLine="ShareCode.ScanList.Add(CBQR)";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cbqr));
RDebugUtils.currentLine=119996443;
 //BA.debugLineNum = 119996443;BA.debugLine="If Sta = Chr(0xF00D) Then";
if (true) break;

case 17:
//if
this.state = 24;
if ((_sta).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf00d))))) { 
this.state = 19;
}else 
{RDebugUtils.currentLine=119996445;
 //BA.debugLineNum = 119996445;BA.debugLine="Else If Sta = Chr(0xF00C) Then";
if ((_sta).equals(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf00c))))) { 
this.state = 21;
}else {
this.state = 23;
}}
if (true) break;

case 19:
//C
this.state = 24;
RDebugUtils.currentLine=119996444;
 //BA.debugLineNum = 119996444;BA.debugLine="Dim StaCod As Int = 0";
_stacod = (int) (0);
 if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=119996446;
 //BA.debugLineNum = 119996446;BA.debugLine="Dim StaCod As Int = 1";
_stacod = (int) (1);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=119996448;
 //BA.debugLineNum = 119996448;BA.debugLine="Dim StaCod As Int = 2";
_stacod = (int) (2);
 if (true) break;

case 24:
//C
this.state = 31;
;
RDebugUtils.currentLine=119996451;
 //BA.debugLineNum = 119996451;BA.debugLine="ListaCodigosLidos.Add(createListaItem(CBQR,Fals";
parent.mostCurrent._listacodigoslidos._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistaitem(_cbqr,anywheresoftware.b4a.keywords.Common.False,_stacod,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))).getObject())),(Object)(""));
 if (true) break;
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
RDebugUtils.currentLine=119996456;
 //BA.debugLineNum = 119996456;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistaitem(String _barcode,boolean _selectedrec,int _staterec,int _height) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistaitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistaitem", new Object[] {_barcode,_selectedrec,_staterec,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=120061952;
 //BA.debugLineNum = 120061952;BA.debugLine="Sub createListaItem(Barcode As String, SelectedRec";
RDebugUtils.currentLine=120061953;
 //BA.debugLineNum = 120061953;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=120061954;
 //BA.debugLineNum = 120061954;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=120061955;
 //BA.debugLineNum = 120061955;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=120061956;
 //BA.debugLineNum = 120061956;BA.debugLine="p.LoadLayout(\"ListaBarcodes\" )";
_p.LoadLayout("ListaBarcodes",mostCurrent.activityBA);
RDebugUtils.currentLine=120061957;
 //BA.debugLineNum = 120061957;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=120061958;
 //BA.debugLineNum = 120061958;BA.debugLine="BarcodeString.TextSize = 12";
mostCurrent._barcodestring.setTextSize((float) (12));
RDebugUtils.currentLine=120061959;
 //BA.debugLineNum = 120061959;BA.debugLine="BarcodeString.text = Barcode";
mostCurrent._barcodestring.setText(BA.ObjectToCharSequence(_barcode));
RDebugUtils.currentLine=120061960;
 //BA.debugLineNum = 120061960;BA.debugLine="BarCodeCheck.Checked = SelectedRec";
mostCurrent._barcodecheck.setChecked(_selectedrec);
RDebugUtils.currentLine=120061962;
 //BA.debugLineNum = 120061962;BA.debugLine="If StateRec = 1 Then";
if (_staterec==1) { 
RDebugUtils.currentLine=120061963;
 //BA.debugLineNum = 120061963;BA.debugLine="BarCodeState.Text = Chr(0xF00C)";
mostCurrent._barcodestate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf00c))));
RDebugUtils.currentLine=120061964;
 //BA.debugLineNum = 120061964;BA.debugLine="BarCodeState.TextColor = Colors.Green";
mostCurrent._barcodestate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
 }else 
{RDebugUtils.currentLine=120061965;
 //BA.debugLineNum = 120061965;BA.debugLine="Else if StateRec = 0 Then";
if (_staterec==0) { 
RDebugUtils.currentLine=120061966;
 //BA.debugLineNum = 120061966;BA.debugLine="BarCodeState.Text = Chr(0xF00D)";
mostCurrent._barcodestate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf00d))));
RDebugUtils.currentLine=120061967;
 //BA.debugLineNum = 120061967;BA.debugLine="BarCodeState.TextColor = Colors.red";
mostCurrent._barcodestate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 }else {
RDebugUtils.currentLine=120061969;
 //BA.debugLineNum = 120061969;BA.debugLine="BarCodeState.Text = Chr(0xF068)";
mostCurrent._barcodestate.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf068))));
RDebugUtils.currentLine=120061970;
 //BA.debugLineNum = 120061970;BA.debugLine="BarCodeState.TextColor = Colors.LightGray";
mostCurrent._barcodestate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
 }}
;
RDebugUtils.currentLine=120061973;
 //BA.debugLineNum = 120061973;BA.debugLine="p.Tag = $\"${Barcode}|${Utils.Bool2Int(SelectedRec";
_p.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_barcode))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._bool2int /*int*/ (mostCurrent.activityBA,_selectedrec)))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_staterec))+"")));
RDebugUtils.currentLine=120061974;
 //BA.debugLineNum = 120061974;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=120061975;
 //BA.debugLineNum = 120061975;BA.debugLine="End Sub";
return null;
}
public static String  _scancamera_picturetaken(byte[] _data) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "scancamera_picturetaken", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "scancamera_picturetaken", new Object[] {_data}));}
RDebugUtils.currentLine=119865344;
 //BA.debugLineNum = 119865344;BA.debugLine="Sub ScanCamera_PictureTaken (Data() As Byte)";
RDebugUtils.currentLine=119865346;
 //BA.debugLineNum = 119865346;BA.debugLine="End Sub";
return "";
}
public static void  _scancamera_preview(byte[] _data) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "scancamera_preview", false))
	 {Debug.delegate(mostCurrent.activityBA, "scancamera_preview", new Object[] {_data}); return;}
ResumableSub_ScanCamera_Preview rsub = new ResumableSub_ScanCamera_Preview(null,_data);
rsub.resume(processBA, null);
}
public static class ResumableSub_ScanCamera_Preview extends BA.ResumableSub {
public ResumableSub_ScanCamera_Preview(xevolution.vrcg.devdemov2400.barcodescanner parent,byte[] _data) {
this.parent = parent;
this._data = _data;
}
xevolution.vrcg.devdemov2400.barcodescanner parent;
byte[] _data;
anywheresoftware.b4j.object.JavaObject _framebuilder = null;
anywheresoftware.b4j.object.JavaObject _bb = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _cs = null;
anywheresoftware.b4j.object.JavaObject _frame = null;
anywheresoftware.b4j.object.JavaObject _sparsearray = null;
int _matches = 0;
int _i = 0;
anywheresoftware.b4j.object.JavaObject _barcode = null;
String _raw = "";
boolean _found = false;
int _x = 0;
String _codeinlist = "";
int _a = 0;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _check_box = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_state = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl_barcode = null;
Object[] _points = null;
anywheresoftware.b4j.object.JavaObject _tl = null;
anywheresoftware.b4j.object.JavaObject _br = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
xevolution.vrcg.devdemov2400.cameraexclass._camerasize _size = null;
float _xscale = 0f;
float _yscale = 0f;
int step14;
int limit14;
int step28;
int limit28;
int step43;
int limit43;
int step45;
int limit45;
int step56;
int limit56;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="barcodescanner";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=119537665;
 //BA.debugLineNum = 119537665;BA.debugLine="If SearchForBarcodes Then";
if (true) break;

case 1:
//if
this.state = 82;
if (parent._searchforbarcodes) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=119537666;
 //BA.debugLineNum = 119537666;BA.debugLine="If DateTime.Now > LastPreview + IntervalBetweenP";
if (true) break;

case 4:
//if
this.state = 81;
if (anywheresoftware.b4a.keywords.Common.DateTime.getNow()>parent._lastpreview+parent._intervalbetweenpreviewsms) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=119537668;
 //BA.debugLineNum = 119537668;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
parent.mostCurrent._cvs.ClearRect(parent.mostCurrent._cvs.getTargetRect());
RDebugUtils.currentLine=119537669;
 //BA.debugLineNum = 119537669;BA.debugLine="Dim frameBuilder As JavaObject";
_framebuilder = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=119537670;
 //BA.debugLineNum = 119537670;BA.debugLine="Dim bb As JavaObject";
_bb = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=119537671;
 //BA.debugLineNum = 119537671;BA.debugLine="bb = bb.InitializeStatic(\"java.nio.ByteBuffer\")";
_bb = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_bb.InitializeStatic("java.nio.ByteBuffer").RunMethod("wrap",new Object[]{(Object)(_data)})));
RDebugUtils.currentLine=119537672;
 //BA.debugLineNum = 119537672;BA.debugLine="frameBuilder.InitializeNewInstance(\"com/google/";
_framebuilder.InitializeNewInstance("com/google/android/gms/vision/Frame.Builder".replace("/","."),(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=119537673;
 //BA.debugLineNum = 119537673;BA.debugLine="Dim cs As CameraSize = camEx.GetPreviewSize";
_cs = parent.mostCurrent._camex._getpreviewsize /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=119537674;
 //BA.debugLineNum = 119537674;BA.debugLine="frameBuilder.RunMethod(\"setImageData\", Array(bb";
_framebuilder.RunMethod("setImageData",new Object[]{(Object)(_bb.getObject()),(Object)(_cs.Width /*int*/ ),(Object)(_cs.Height /*int*/ ),(Object)(842094169)});
RDebugUtils.currentLine=119537675;
 //BA.debugLineNum = 119537675;BA.debugLine="Dim frame As JavaObject = frameBuilder.RunMetho";
_frame = new anywheresoftware.b4j.object.JavaObject();
_frame = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_framebuilder.RunMethod("build",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=119537676;
 //BA.debugLineNum = 119537676;BA.debugLine="Dim SparseArray As JavaObject = detector.RunMet";
_sparsearray = new anywheresoftware.b4j.object.JavaObject();
_sparsearray = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent._detector.RunMethod("detect",new Object[]{(Object)(_frame.getObject())})));
RDebugUtils.currentLine=119537677;
 //BA.debugLineNum = 119537677;BA.debugLine="LastPreview = DateTime.Now";
parent._lastpreview = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
RDebugUtils.currentLine=119537678;
 //BA.debugLineNum = 119537678;BA.debugLine="Dim Matches As Int = SparseArray.RunMethod(\"siz";
_matches = (int)(BA.ObjectToNumber(_sparsearray.RunMethod("size",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=119537679;
 //BA.debugLineNum = 119537679;BA.debugLine="For i = 0 To Matches - 1";
if (true) break;

case 7:
//for
this.state = 77;
step14 = 1;
limit14 = (int) (_matches-1);
_i = (int) (0) ;
this.state = 83;
if (true) break;

case 83:
//C
this.state = 77;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 84:
//C
this.state = 83;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=119537680;
 //BA.debugLineNum = 119537680;BA.debugLine="Dim barcode As JavaObject = SparseArray.RunMet";
_barcode = new anywheresoftware.b4j.object.JavaObject();
_barcode = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_sparsearray.RunMethod("valueAt",new Object[]{(Object)(_i)})));
RDebugUtils.currentLine=119537681;
 //BA.debugLineNum = 119537681;BA.debugLine="Dim raw As String = barcode.GetField(\"rawValue";
_raw = BA.ObjectToString(_barcode.GetField("rawValue"));
RDebugUtils.currentLine=119537685;
 //BA.debugLineNum = 119537685;BA.debugLine="If ShareCode.SingleScan Then";
if (true) break;

case 10:
//if
this.state = 65;
if (parent.mostCurrent._sharecode._singlescan /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 65;
RDebugUtils.currentLine=119537686;
 //BA.debugLineNum = 119537686;BA.debugLine="ShareCode.ScanList.Clear";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=119537687;
 //BA.debugLineNum = 119537687;BA.debugLine="ShareCode.ScanList.Add(raw)";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_raw));
RDebugUtils.currentLine=119537688;
 //BA.debugLineNum = 119537688;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "barcodescanner", "scancamera_preview"),(int) (500));
this.state = 85;
return;
case 85:
//C
this.state = 65;
;
RDebugUtils.currentLine=119537690;
 //BA.debugLineNum = 119537690;BA.debugLine="Return2Activity";
_return2activity();
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=119537692;
 //BA.debugLineNum = 119537692;BA.debugLine="If ShareCode.AllowScanDuplicates Then";
if (true) break;

case 15:
//if
this.state = 31;
if (parent.mostCurrent._sharecode._allowscanduplicates /*boolean*/ ) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 31;
RDebugUtils.currentLine=119537693;
 //BA.debugLineNum = 119537693;BA.debugLine="ShareCode.ScanList.Add(raw)";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_raw));
RDebugUtils.currentLine=119537694;
 //BA.debugLineNum = 119537694;BA.debugLine="ListaCodigosLidos.Add(createListaItem(raw,Fa";
parent.mostCurrent._listacodigoslidos._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistaitem(_raw,anywheresoftware.b4a.keywords.Common.False,(int) (2),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))).getObject())),(Object)(""));
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=119537696;
 //BA.debugLineNum = 119537696;BA.debugLine="Dim found As Boolean = False";
_found = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=119537697;
 //BA.debugLineNum = 119537697;BA.debugLine="For x=0 To ShareCode.ScanList.Size -1";
if (true) break;

case 20:
//for
this.state = 27;
step28 = 1;
limit28 = (int) (parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_x = (int) (0) ;
this.state = 86;
if (true) break;

case 86:
//C
this.state = 27;
if ((step28 > 0 && _x <= limit28) || (step28 < 0 && _x >= limit28)) this.state = 22;
if (true) break;

case 87:
//C
this.state = 86;
_x = ((int)(0 + _x + step28)) ;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=119537698;
 //BA.debugLineNum = 119537698;BA.debugLine="Dim codeinlist As String = ShareCode.ScanLi";
_codeinlist = BA.ObjectToString(parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Get(_x));
RDebugUtils.currentLine=119537699;
 //BA.debugLineNum = 119537699;BA.debugLine="If codeinlist = raw Then";
if (true) break;

case 23:
//if
this.state = 26;
if ((_codeinlist).equals(_raw)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=119537700;
 //BA.debugLineNum = 119537700;BA.debugLine="found = True";
_found = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 26:
//C
this.state = 87;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=119537703;
 //BA.debugLineNum = 119537703;BA.debugLine="If Not(found) Then";

case 27:
//if
this.state = 30;
if (anywheresoftware.b4a.keywords.Common.Not(_found)) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=119537704;
 //BA.debugLineNum = 119537704;BA.debugLine="ShareCode.ScanList.Add(raw)";
parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_raw));
RDebugUtils.currentLine=119537705;
 //BA.debugLineNum = 119537705;BA.debugLine="ListaCodigosLidos.Add(createListaItem(raw,F";
parent.mostCurrent._listacodigoslidos._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistaitem(_raw,anywheresoftware.b4a.keywords.Common.False,(int) (2),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))).getObject())),(Object)(""));
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
RDebugUtils.currentLine=119537712;
 //BA.debugLineNum = 119537712;BA.debugLine="If ShareCode.Flag2CompareCodes Then";

case 31:
//if
this.state = 64;
if (parent.mostCurrent._sharecode._flag2comparecodes /*boolean*/ ) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=119537713;
 //BA.debugLineNum = 119537713;BA.debugLine="Log($\"code to compare with list = ${raw}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("6119537713",("code to compare with list = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_raw))+""),0);
RDebugUtils.currentLine=119537714;
 //BA.debugLineNum = 119537714;BA.debugLine="If ShareCode.ListOfCodes2Compare.Size > 0 Th";
if (true) break;

case 34:
//if
this.state = 63;
if (parent.mostCurrent._sharecode._listofcodes2compare /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=119537715;
 //BA.debugLineNum = 119537715;BA.debugLine="ProgressDialogShow2(ShareCode.GeneralWaitPl";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalwaitplease /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119537716;
 //BA.debugLineNum = 119537716;BA.debugLine="For a=0 To ShareCode.ListOfCodes2Compare.si";
if (true) break;

case 37:
//for
this.state = 62;
step43 = 1;
limit43 = (int) (parent.mostCurrent._sharecode._listofcodes2compare /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_a = (int) (0) ;
this.state = 88;
if (true) break;

case 88:
//C
this.state = 62;
if ((step43 > 0 && _a <= limit43) || (step43 < 0 && _a >= limit43)) this.state = 39;
if (true) break;

case 89:
//C
this.state = 88;
_a = ((int)(0 + _a + step43)) ;
if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=119537717;
 //BA.debugLineNum = 119537717;BA.debugLine="If ShareCode.ListOfCodes2Compare.Get(a) =";
if (true) break;

case 40:
//if
this.state = 61;
if ((parent.mostCurrent._sharecode._listofcodes2compare /*anywheresoftware.b4a.objects.collections.List*/ .Get(_a)).equals((Object)(_raw))) { 
this.state = 42;
}else {
this.state = 52;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=119537718;
 //BA.debugLineNum = 119537718;BA.debugLine="For i=0 To ListaCodigosLidos.Size -1";
if (true) break;

case 43:
//for
this.state = 50;
step45 = 1;
limit45 = (int) (parent.mostCurrent._listacodigoslidos._getsize()-1);
_i = (int) (0) ;
this.state = 90;
if (true) break;

case 90:
//C
this.state = 50;
if ((step45 > 0 && _i <= limit45) || (step45 < 0 && _i >= limit45)) this.state = 45;
if (true) break;

case 91:
//C
this.state = 90;
_i = ((int)(0 + _i + step45)) ;
if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=119537719;
 //BA.debugLineNum = 119537719;BA.debugLine="Dim pnl As Panel = ListaCodigosLidos.Get";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._listacodigoslidos._getpanel(_i).getObject()));
RDebugUtils.currentLine=119537720;
 //BA.debugLineNum = 119537720;BA.debugLine="Dim check_box As CheckBox = pnl.GetView(";
_check_box = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_check_box = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=119537721;
 //BA.debugLineNum = 119537721;BA.debugLine="Dim lbl_state As Label = pnl.GetView(1)";
_lbl_state = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_state = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=119537722;
 //BA.debugLineNum = 119537722;BA.debugLine="Dim lbl_barcode As Label  = pnl.GetView(";
_lbl_barcode = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_barcode = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=119537724;
 //BA.debugLineNum = 119537724;BA.debugLine="If lbl_barcode.Text.Trim = raw Then";
if (true) break;

case 46:
//if
this.state = 49;
if ((_lbl_barcode.getText().trim()).equals(_raw)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=119537725;
 //BA.debugLineNum = 119537725;BA.debugLine="lbl_state.Text = Chr(0xF00C)";
_lbl_state.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf00c))));
RDebugUtils.currentLine=119537726;
 //BA.debugLineNum = 119537726;BA.debugLine="lbl_state.TextColor = Colors.Green";
_lbl_state.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Green);
 if (true) break;

case 49:
//C
this.state = 91;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 61;
;
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=119537730;
 //BA.debugLineNum = 119537730;BA.debugLine="For i=0 To ListaCodigosLidos.Size -1";
if (true) break;

case 53:
//for
this.state = 60;
step56 = 1;
limit56 = (int) (parent.mostCurrent._listacodigoslidos._getsize()-1);
_i = (int) (0) ;
this.state = 92;
if (true) break;

case 92:
//C
this.state = 60;
if ((step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56)) this.state = 55;
if (true) break;

case 93:
//C
this.state = 92;
_i = ((int)(0 + _i + step56)) ;
if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=119537731;
 //BA.debugLineNum = 119537731;BA.debugLine="Dim pnl As Panel = ListaCodigosLidos.Get";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._listacodigoslidos._getpanel(_i).getObject()));
RDebugUtils.currentLine=119537732;
 //BA.debugLineNum = 119537732;BA.debugLine="Dim check_box As CheckBox = pnl.GetView(";
_check_box = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_check_box = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=119537733;
 //BA.debugLineNum = 119537733;BA.debugLine="Dim lbl_state As Label = pnl.GetView(1)";
_lbl_state = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_state = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=119537734;
 //BA.debugLineNum = 119537734;BA.debugLine="Dim lbl_barcode As Label  = pnl.GetView(";
_lbl_barcode = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl_barcode = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_pnl.GetView((int) (2)).getObject()));
RDebugUtils.currentLine=119537736;
 //BA.debugLineNum = 119537736;BA.debugLine="If lbl_barcode.Text.Trim = raw Then";
if (true) break;

case 56:
//if
this.state = 59;
if ((_lbl_barcode.getText().trim()).equals(_raw)) { 
this.state = 58;
}if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=119537737;
 //BA.debugLineNum = 119537737;BA.debugLine="lbl_state.Text = Chr(0xF00D)";
_lbl_state.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.Chr((int) (0xf00d))));
RDebugUtils.currentLine=119537738;
 //BA.debugLineNum = 119537738;BA.debugLine="lbl_state.TextColor = Colors.red";
_lbl_state.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
 if (true) break;

case 59:
//C
this.state = 93;
;
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 89;
;
 if (true) break;
if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=119537743;
 //BA.debugLineNum = 119537743;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=119537749;
 //BA.debugLineNum = 119537749;BA.debugLine="ToastMessageShow(ShareCode.ScanList, True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._scanlist /*anywheresoftware.b4a.objects.collections.List*/ .getObject()),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=119537751;
 //BA.debugLineNum = 119537751;BA.debugLine="Dim points() As Object = barcode.GetField(\"cor";
_points = (Object[])(_barcode.GetField("cornerPoints"));
RDebugUtils.currentLine=119537752;
 //BA.debugLineNum = 119537752;BA.debugLine="Dim tl As JavaObject = points(0)";
_tl = new anywheresoftware.b4j.object.JavaObject();
_tl = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_points[(int) (0)]));
RDebugUtils.currentLine=119537754;
 //BA.debugLineNum = 119537754;BA.debugLine="Dim br As JavaObject = points(2)";
_br = new anywheresoftware.b4j.object.JavaObject();
_br = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_points[(int) (2)]));
RDebugUtils.currentLine=119537756;
 //BA.debugLineNum = 119537756;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=119537758;
 //BA.debugLineNum = 119537758;BA.debugLine="Dim size As CameraSize = camEx.GetPreviewSize";
_size = parent.mostCurrent._camex._getpreviewsize /*xevolution.vrcg.devdemov2400.cameraexclass._camerasize*/ (null);
RDebugUtils.currentLine=119537759;
 //BA.debugLineNum = 119537759;BA.debugLine="Dim xscale, yscale As Float";
_xscale = 0f;
_yscale = 0f;
RDebugUtils.currentLine=119537760;
 //BA.debugLineNum = 119537760;BA.debugLine="If camEx.PreviewOrientation Mod 180 = 0 Then";
if (true) break;

case 66:
//if
this.state = 71;
if (parent.mostCurrent._camex._previeworientation /*int*/ %180==0) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=119537761;
 //BA.debugLineNum = 119537761;BA.debugLine="xscale = Panel1.Width / size.Width";
_xscale = (float) (parent.mostCurrent._panel1.getWidth()/(double)_size.Width /*int*/ );
RDebugUtils.currentLine=119537762;
 //BA.debugLineNum = 119537762;BA.debugLine="yscale = Panel1.Height / size.Height";
_yscale = (float) (parent.mostCurrent._panel1.getHeight()/(double)_size.Height /*int*/ );
RDebugUtils.currentLine=119537763;
 //BA.debugLineNum = 119537763;BA.debugLine="r.Initialize(tl.GetField(\"x\"), tl.GetField(\"y";
_r.Initialize((float)(BA.ObjectToNumber(_tl.GetField("x"))),(float)(BA.ObjectToNumber(_tl.GetField("y"))),(float)(BA.ObjectToNumber(_br.GetField("x"))),(float)(BA.ObjectToNumber(_br.GetField("y"))));
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=119537765;
 //BA.debugLineNum = 119537765;BA.debugLine="xscale = Panel1.Width / size.Height";
_xscale = (float) (parent.mostCurrent._panel1.getWidth()/(double)_size.Height /*int*/ );
RDebugUtils.currentLine=119537766;
 //BA.debugLineNum = 119537766;BA.debugLine="yscale = Panel1.Height / size.Width";
_yscale = (float) (parent.mostCurrent._panel1.getHeight()/(double)_size.Width /*int*/ );
RDebugUtils.currentLine=119537767;
 //BA.debugLineNum = 119537767;BA.debugLine="r.Initialize(br.GetField(\"y\"), br.GetField(\"x";
_r.Initialize((float)(BA.ObjectToNumber(_br.GetField("y"))),(float)(BA.ObjectToNumber(_br.GetField("x"))),(float)(BA.ObjectToNumber(_tl.GetField("y"))),(float)(BA.ObjectToNumber(_tl.GetField("x"))));
 if (true) break;
;
RDebugUtils.currentLine=119537770;
 //BA.debugLineNum = 119537770;BA.debugLine="Select camEx.PreviewOrientation";

case 71:
//select
this.state = 76;
switch (BA.switchObjectToInt(parent.mostCurrent._camex._previeworientation /*int*/ ,(int) (180),(int) (90))) {
case 0: {
this.state = 73;
if (true) break;
}
case 1: {
this.state = 75;
if (true) break;
}
}
if (true) break;

case 73:
//C
this.state = 76;
RDebugUtils.currentLine=119537772;
 //BA.debugLineNum = 119537772;BA.debugLine="r.Initialize(size.Width - r.Right, size.Heig";
_r.Initialize((float) (_size.Width /*int*/ -_r.getRight()),(float) (_size.Height /*int*/ -_r.getBottom()),(float) (_size.Width /*int*/ -_r.getLeft()),(float) (_size.Height /*int*/ -_r.getTop()));
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=119537774;
 //BA.debugLineNum = 119537774;BA.debugLine="r.Initialize(size.Height - r.Right, r.Top, s";
_r.Initialize((float) (_size.Height /*int*/ -_r.getRight()),_r.getTop(),(float) (_size.Height /*int*/ -_r.getLeft()),_r.getBottom());
 if (true) break;

case 76:
//C
this.state = 84;
;
RDebugUtils.currentLine=119537776;
 //BA.debugLineNum = 119537776;BA.debugLine="r.Left = r.Left * xscale";
_r.setLeft((float) (_r.getLeft()*_xscale));
RDebugUtils.currentLine=119537777;
 //BA.debugLineNum = 119537777;BA.debugLine="r.Right = r.Right * xscale";
_r.setRight((float) (_r.getRight()*_xscale));
RDebugUtils.currentLine=119537778;
 //BA.debugLineNum = 119537778;BA.debugLine="r.Top = r.Top * yscale";
_r.setTop((float) (_r.getTop()*_yscale));
RDebugUtils.currentLine=119537779;
 //BA.debugLineNum = 119537779;BA.debugLine="r.Bottom = r.Bottom * yscale";
_r.setBottom((float) (_r.getBottom()*_yscale));
RDebugUtils.currentLine=119537780;
 //BA.debugLineNum = 119537780;BA.debugLine="cvs.DrawRect(r, Colors.Red, False, 5dip)";
parent.mostCurrent._cvs.DrawRect(_r,anywheresoftware.b4a.keywords.Common.Colors.Red,anywheresoftware.b4a.keywords.Common.False,(float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=119537782;
 //BA.debugLineNum = 119537782;BA.debugLine="If Matches = 0 Then";

case 77:
//if
this.state = 80;
if (_matches==0) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=119537783;
 //BA.debugLineNum = 119537783;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
parent.mostCurrent._cvs.ClearRect(parent.mostCurrent._cvs.getTargetRect());
 if (true) break;

case 80:
//C
this.state = 81;
;
RDebugUtils.currentLine=119537785;
 //BA.debugLineNum = 119537785;BA.debugLine="cvs.Invalidate";
parent.mostCurrent._cvs.Invalidate();
 if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = -1;
;
RDebugUtils.currentLine=119537790;
 //BA.debugLineNum = 119537790;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _scancamera_ready(boolean _success) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "scancamera_ready", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "scancamera_ready", new Object[] {_success}));}
RDebugUtils.currentLine=119799808;
 //BA.debugLineNum = 119799808;BA.debugLine="Sub ScanCamera_Ready (Success As Boolean)";
RDebugUtils.currentLine=119799809;
 //BA.debugLineNum = 119799809;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=119799810;
 //BA.debugLineNum = 119799810;BA.debugLine="camEx.SetJpegQuality(90)";
mostCurrent._camex._setjpegquality /*String*/ (null,(int) (90));
RDebugUtils.currentLine=119799811;
 //BA.debugLineNum = 119799811;BA.debugLine="camEx.SetContinuousAutoFocus";
mostCurrent._camex._setcontinuousautofocus /*String*/ (null);
RDebugUtils.currentLine=119799812;
 //BA.debugLineNum = 119799812;BA.debugLine="camEx.CommitParameters";
mostCurrent._camex._commitparameters /*String*/ (null);
RDebugUtils.currentLine=119799813;
 //BA.debugLineNum = 119799813;BA.debugLine="camEx.StartPreview";
mostCurrent._camex._startpreview /*String*/ (null);
 }else {
RDebugUtils.currentLine=119799816;
 //BA.debugLineNum = 119799816;BA.debugLine="ToastMessageShow(\"Cannot open camera.\", True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cannot open camera."),anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=119799818;
 //BA.debugLineNum = 119799818;BA.debugLine="End Sub";
return "";
}
public static String  _starscanningmulti(String _act) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starscanningmulti", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starscanningmulti", new Object[] {_act}));}
RDebugUtils.currentLine=119275520;
 //BA.debugLineNum = 119275520;BA.debugLine="Sub StarScanningMulti(act As String)";
RDebugUtils.currentLine=119275521;
 //BA.debugLineNum = 119275521;BA.debugLine="ListaCodigosLidos.AsView.Visible = True";
mostCurrent._listacodigoslidos._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=119275522;
 //BA.debugLineNum = 119275522;BA.debugLine="ShareCode.Flag2CompareCodes = False";
mostCurrent._sharecode._flag2comparecodes /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=119275523;
 //BA.debugLineNum = 119275523;BA.debugLine="btnClear.Visible = True";
mostCurrent._btnclear.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=119275524;
 //BA.debugLineNum = 119275524;BA.debugLine="ScanOnlyOne = False";
_scanonlyone = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=119275525;
 //BA.debugLineNum = 119275525;BA.debugLine="PassedAct = act";
mostCurrent._passedact = _act;
RDebugUtils.currentLine=119275526;
 //BA.debugLineNum = 119275526;BA.debugLine="End Sub";
return "";
}
public static String  _starscanningmulti2compare(String _act) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starscanningmulti2compare", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starscanningmulti2compare", new Object[] {_act}));}
RDebugUtils.currentLine=119341056;
 //BA.debugLineNum = 119341056;BA.debugLine="Sub StarScanningMulti2Compare(act As String)";
RDebugUtils.currentLine=119341057;
 //BA.debugLineNum = 119341057;BA.debugLine="ListaCodigosLidos.AsView.Visible = True";
mostCurrent._listacodigoslidos._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=119341058;
 //BA.debugLineNum = 119341058;BA.debugLine="ShareCode.Flag2CompareCodes = True";
mostCurrent._sharecode._flag2comparecodes /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=119341059;
 //BA.debugLineNum = 119341059;BA.debugLine="btnClear.Visible = True";
mostCurrent._btnclear.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=119341060;
 //BA.debugLineNum = 119341060;BA.debugLine="ScanOnlyOne = False";
_scanonlyone = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=119341061;
 //BA.debugLineNum = 119341061;BA.debugLine="PassedAct = act";
mostCurrent._passedact = _act;
RDebugUtils.currentLine=119341062;
 //BA.debugLineNum = 119341062;BA.debugLine="End Sub";
return "";
}
public static String  _startscanning(String _act,anywheresoftware.b4a.objects.FloatLabeledEditTextWrapper _view2set) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startscanning", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startscanning", new Object[] {_act,_view2set}));}
RDebugUtils.currentLine=119144448;
 //BA.debugLineNum = 119144448;BA.debugLine="Sub StartScanning(act As String, view2set As Float";
RDebugUtils.currentLine=119144449;
 //BA.debugLineNum = 119144449;BA.debugLine="ScanOnlyOne = ShareCode.SingleScan";
_scanonlyone = mostCurrent._sharecode._singlescan /*boolean*/ ;
RDebugUtils.currentLine=119144450;
 //BA.debugLineNum = 119144450;BA.debugLine="txt2set = view2set";
mostCurrent._txt2set = _view2set;
RDebugUtils.currentLine=119144451;
 //BA.debugLineNum = 119144451;BA.debugLine="PassedAct = act";
mostCurrent._passedact = _act;
RDebugUtils.currentLine=119144452;
 //BA.debugLineNum = 119144452;BA.debugLine="End Sub";
return "";
}
public static String  _startscanningsingle(String _act) throws Exception{
RDebugUtils.currentModule="barcodescanner";
if (Debug.shouldDelegate(mostCurrent.activityBA, "startscanningsingle", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "startscanningsingle", new Object[] {_act}));}
RDebugUtils.currentLine=119209984;
 //BA.debugLineNum = 119209984;BA.debugLine="Sub StartScanningSingle(act As String)";
RDebugUtils.currentLine=119209985;
 //BA.debugLineNum = 119209985;BA.debugLine="ListaCodigosLidos.AsView.Visible = False";
mostCurrent._listacodigoslidos._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119209986;
 //BA.debugLineNum = 119209986;BA.debugLine="ShareCode.Flag2CompareCodes = False";
mostCurrent._sharecode._flag2comparecodes /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=119209987;
 //BA.debugLineNum = 119209987;BA.debugLine="btnClear.Visible = False";
mostCurrent._btnclear.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=119209988;
 //BA.debugLineNum = 119209988;BA.debugLine="ScanOnlyOne = ShareCode.SingleScan";
_scanonlyone = mostCurrent._sharecode._singlescan /*boolean*/ ;
RDebugUtils.currentLine=119209989;
 //BA.debugLineNum = 119209989;BA.debugLine="PassedAct = act";
mostCurrent._passedact = _act;
RDebugUtils.currentLine=119209990;
 //BA.debugLineNum = 119209990;BA.debugLine="End Sub";
return "";
}
}