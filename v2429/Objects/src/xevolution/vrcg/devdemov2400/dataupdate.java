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

public class dataupdate extends Activity implements B4AActivity{
	public static dataupdate mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.dataupdate");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (dataupdate).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.dataupdate");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.dataupdate", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (dataupdate) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (dataupdate) Resume **");
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
		return dataupdate.class;
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
            BA.LogInfo("** Activity (dataupdate) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (dataupdate) Pause event (activity is not paused). **");
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
            dataupdate mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (dataupdate) Resume **");
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
public anywheresoftware.b4a.objects.LabelWrapper _lbldataupdatetitle = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcopydata = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelcopydata = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldataupdatecopy = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldataupdateload = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldataupdatedownload = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _progressbar1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldataupdateprocess = null;
public static String _datalayout = "";
public anywheresoftware.b4a.objects.ButtonWrapper _buttonwelcomenext = null;
public static int _sqlfilestotal = 0;
public anywheresoftware.b4a.objects.collections.List _ftpfilelist = null;
public anywheresoftware.b4a.objects.collections.List _ftpfilelist2 = null;
public static String _requestfilename = "";
public static String _requestfilenameheaders = "";
public static String _requestfilenameonday = "";
public anywheresoftware.b4a.objects.collections.List _tagcodes = null;
public static String _tagcodesstring = "";
public static String _tagcodestasksstring = "";
public static String _tagcodestprequestsstring = "";
public static String _tagcodesobjectsstring = "";
public static String _tagcodeslocationsstring = "";
public static String _tagcodescontactsstring = "";
public static String _tagcodeswarehousesstring = "";
public static String _tagcodesarticlesstring = "";
public static int _flagfirstprocessstep = 0;
public anywheresoftware.b4a.objects.LabelWrapper _labelupdateprocess = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imagedownload = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageupload = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelloaddata = null;
public anywheresoftware.b4a.objects.LabelWrapper _labeldownloaddata = null;
public static int _currentcounter = 0;
public static boolean _isloginupdate = false;
public static String _firstinstallupdatedate = "";
public anywheresoftware.b4a.objects.ProgressBarWrapper _dataupdateprogressbar = null;
public anywheresoftware.b4a.objects.LabelWrapper _dataupdatelabeltarefa = null;
public anywheresoftware.b4a.objects.ProgressBarWrapper _dataupdateprogressbar2 = null;
public b4a.example3.customlistview _listaintervencoesoffline = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkreqoffline = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtreqoffline = null;
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
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="If (ShareCode.ISPHONE) Then";
if ((mostCurrent._sharecode._isphone /*boolean*/ )) { 
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="Device.SetScreenOrientation(1)";
_device.SetScreenOrientation(processBA,(int) (1));
 }else {
RDebugUtils.currentLine=59244548;
 //BA.debugLineNum = 59244548;BA.debugLine="Device.SetScreenOrientation(ShareCode.DEVICE_ORI";
_device.SetScreenOrientation(processBA,mostCurrent._sharecode._device_orientation /*int*/ );
 };
RDebugUtils.currentLine=59244550;
 //BA.debugLineNum = 59244550;BA.debugLine="dataLayout = \"dataupdate_layout\"";
mostCurrent._datalayout = "dataupdate_layout";
RDebugUtils.currentLine=59244551;
 //BA.debugLineNum = 59244551;BA.debugLine="Activity.LoadLayout(dataLayout)";
mostCurrent._activity.LoadLayout(mostCurrent._datalayout,mostCurrent.activityBA);
RDebugUtils.currentLine=59244557;
 //BA.debugLineNum = 59244557;BA.debugLine="ButtonWelcomeNext.Text = ShareCode.DataUpdateButt";
mostCurrent._buttonwelcomenext.setText(BA.ObjectToCharSequence(mostCurrent._sharecode._dataupdatebuttonwelcomenext /*String*/ ));
RDebugUtils.currentLine=59244560;
 //BA.debugLineNum = 59244560;BA.debugLine="ButtonWelcomeNext.Enabled = False";
mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=59244561;
 //BA.debugLineNum = 59244561;BA.debugLine="CurrentCounter = 0";
_currentcounter = (int) (0);
RDebugUtils.currentLine=59244563;
 //BA.debugLineNum = 59244563;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="dataupdate";
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=60227584;
 //BA.debugLineNum = 60227584;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _backupanddeletetypes() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "backupanddeletetypes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "backupanddeletetypes", null));}
ResumableSub_BackUpAndDeleteTypes rsub = new ResumableSub_BackUpAndDeleteTypes(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BackUpAndDeleteTypes extends BA.ResumableSub {
public ResumableSub_BackUpAndDeleteTypes(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
boolean _res = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61341698;
 //BA.debugLineNum = 61341698;BA.debugLine="Dim Res As Boolean = True";
_res = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61341700;
 //BA.debugLineNum = 61341700;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_accessmod";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_accessmodetypes",_res);
RDebugUtils.currentLine=61341701;
 //BA.debugLineNum = 61341701;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_actionreq";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_actionrequesttypes",_res);
RDebugUtils.currentLine=61341702;
 //BA.debugLineNum = 61341702;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_actiontyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_actiontypes",_res);
RDebugUtils.currentLine=61341703;
 //BA.debugLineNum = 61341703;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_alertrela";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_alertrelationtypes",_res);
RDebugUtils.currentLine=61341704;
 //BA.debugLineNum = 61341704;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_alertstyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_alertstypes",_res);
RDebugUtils.currentLine=61341705;
 //BA.debugLineNum = 61341705;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_answertyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_answertypes",_res);
RDebugUtils.currentLine=61341706;
 //BA.debugLineNum = 61341706;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_articlest";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_articlestypes",_res);
RDebugUtils.currentLine=61341707;
 //BA.debugLineNum = 61341707;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_asmodetyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_asmodetypes",_res);
RDebugUtils.currentLine=61341708;
 //BA.debugLineNum = 61341708;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_assignedt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_assignedtypes",_res);
RDebugUtils.currentLine=61341709;
 //BA.debugLineNum = 61341709;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_available";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_availabletypes",_res);
RDebugUtils.currentLine=61341710;
 //BA.debugLineNum = 61341710;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_cla_itemt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_cla_itemtypes",_res);
RDebugUtils.currentLine=61341711;
 //BA.debugLineNum = 61341711;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_communica";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_communicationtypes",_res);
RDebugUtils.currentLine=61341712;
 //BA.debugLineNum = 61341712;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_component";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_componenttypes",_res);
RDebugUtils.currentLine=61341713;
 //BA.debugLineNum = 61341713;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_condition";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_conditionstype",_res);
RDebugUtils.currentLine=61341714;
 //BA.debugLineNum = 61341714;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_conformit";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_conformitytypes",_res);
RDebugUtils.currentLine=61341715;
 //BA.debugLineNum = 61341715;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_connmodet";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_connmodetypes",_res);
RDebugUtils.currentLine=61341716;
 //BA.debugLineNum = 61341716;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_contactty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_contacttypes",_res);
RDebugUtils.currentLine=61341717;
 //BA.debugLineNum = 61341717;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_contractt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_contracttypes",_res);
RDebugUtils.currentLine=61341718;
 //BA.debugLineNum = 61341718;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_dataentry";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_dataentrytypes",_res);
RDebugUtils.currentLine=61341719;
 //BA.debugLineNum = 61341719;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_datanatur";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_datanaturetypes",_res);
RDebugUtils.currentLine=61341720;
 //BA.debugLineNum = 61341720;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_datatypes";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_datatypes",_res);
RDebugUtils.currentLine=61341721;
 //BA.debugLineNum = 61341721;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_docnature";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_docnaturetypes",_res);
RDebugUtils.currentLine=61341722;
 //BA.debugLineNum = 61341722;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_documentt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_documenttypes",_res);
RDebugUtils.currentLine=61341723;
 //BA.debugLineNum = 61341723;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_emailacti";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_emailactiontypes",_res);
RDebugUtils.currentLine=61341724;
 //BA.debugLineNum = 61341724;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_emaildriv";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_emaildriverstypes",_res);
RDebugUtils.currentLine=61341725;
 //BA.debugLineNum = 61341725;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_emailencr";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_emailencripttypes",_res);
RDebugUtils.currentLine=61341726;
 //BA.debugLineNum = 61341726;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entitypar";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_entityparams",_res);
RDebugUtils.currentLine=61341727;
 //BA.debugLineNum = 61341727;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entitypro";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_entityproperties",_res);
RDebugUtils.currentLine=61341728;
 //BA.debugLineNum = 61341728;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entitytyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_entitytypes",_res);
RDebugUtils.currentLine=61341729;
 //BA.debugLineNum = 61341729;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_entrytype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_entrytypes",_res);
RDebugUtils.currentLine=61341730;
 //BA.debugLineNum = 61341730;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_equipment";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_equipmentstypes",_res);
RDebugUtils.currentLine=61341731;
 //BA.debugLineNum = 61341731;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_equipstat";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_equipstatetypes",_res);
RDebugUtils.currentLine=61341732;
 //BA.debugLineNum = 61341732;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_eventgrou";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_eventgrouptypes",_res);
RDebugUtils.currentLine=61341733;
 //BA.debugLineNum = 61341733;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_eventkind";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_eventkindtypes",_res);
RDebugUtils.currentLine=61341734;
 //BA.debugLineNum = 61341734;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_eventtype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_eventtypes",_res);
RDebugUtils.currentLine=61341735;
 //BA.debugLineNum = 61341735;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_execmodes";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_execmodestypes",_res);
RDebugUtils.currentLine=61341736;
 //BA.debugLineNum = 61341736;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_filetypes";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_filetypes",_res);
RDebugUtils.currentLine=61341737;
 //BA.debugLineNum = 61341737;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_formfield";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_formfields",_res);
RDebugUtils.currentLine=61341738;
 //BA.debugLineNum = 61341738;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_formfield";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_formfieldstypes",_res);
RDebugUtils.currentLine=61341739;
 //BA.debugLineNum = 61341739;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_formfield";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_formfieldtypes",_res);
RDebugUtils.currentLine=61341740;
 //BA.debugLineNum = 61341740;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_genders\",";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_genders",_res);
RDebugUtils.currentLine=61341741;
 //BA.debugLineNum = 61341741;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_generalst";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_generalstatetypes",_res);
RDebugUtils.currentLine=61341742;
 //BA.debugLineNum = 61341742;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_gravityty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_gravitytypes",_res);
RDebugUtils.currentLine=61341743;
 //BA.debugLineNum = 61341743;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_icontypes";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_icontypes",_res);
RDebugUtils.currentLine=61341744;
 //BA.debugLineNum = 61341744;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_idcards\",";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_idcards",_res);
RDebugUtils.currentLine=61341745;
 //BA.debugLineNum = 61341745;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_inouttype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_inouttypes",_res);
RDebugUtils.currentLine=61341746;
 //BA.debugLineNum = 61341746;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_level3chi";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_level3childtypes",_res);
RDebugUtils.currentLine=61341747;
 //BA.debugLineNum = 61341747;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_level3mas";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_level3mastertypes",_res);
RDebugUtils.currentLine=61341748;
 //BA.debugLineNum = 61341748;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_level3typ";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_level3types",_res);
RDebugUtils.currentLine=61341749;
 //BA.debugLineNum = 61341749;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_links\", R";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_links",_res);
RDebugUtils.currentLine=61341750;
 //BA.debugLineNum = 61341750;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_locationt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_locationtypes",_res);
RDebugUtils.currentLine=61341751;
 //BA.debugLineNum = 61341751;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_mapconten";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_mapcontenttypes",_res);
RDebugUtils.currentLine=61341752;
 //BA.debugLineNum = 61341752;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_menulocat";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_menulocations",_res);
RDebugUtils.currentLine=61341753;
 //BA.debugLineNum = 61341753;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_modules\",";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_modules",_res);
RDebugUtils.currentLine=61341754;
 //BA.debugLineNum = 61341754;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_moneytype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_moneytypes",_res);
RDebugUtils.currentLine=61341755;
 //BA.debugLineNum = 61341755;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_nonccateg";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_nonccategories",_res);
RDebugUtils.currentLine=61341756;
 //BA.debugLineNum = 61341756;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_nonconfor";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_nonconformitytypes",_res);
RDebugUtils.currentLine=61341757;
 //BA.debugLineNum = 61341757;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_notetypes";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_notetypes",_res);
RDebugUtils.currentLine=61341758;
 //BA.debugLineNum = 61341758;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_notifacti";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_notifactionstypes",_res);
RDebugUtils.currentLine=61341759;
 //BA.debugLineNum = 61341759;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_notifiori";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_notifioriginstypes",_res);
RDebugUtils.currentLine=61341760;
 //BA.debugLineNum = 61341760;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_objectnat";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_objectnaturetypes",_res);
RDebugUtils.currentLine=61341761;
 //BA.debugLineNum = 61341761;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_objectrel";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_objectrelationtypes",_res);
RDebugUtils.currentLine=61341762;
 //BA.debugLineNum = 61341762;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_operation";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_operationtypes",_res);
RDebugUtils.currentLine=61341763;
 //BA.debugLineNum = 61341763;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_orientati";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_orientationtypes",_res);
RDebugUtils.currentLine=61341764;
 //BA.debugLineNum = 61341764;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_originsty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_originstypes",_res);
RDebugUtils.currentLine=61341765;
 //BA.debugLineNum = 61341765;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_originval";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_originvaluetypes",_res);
RDebugUtils.currentLine=61341766;
 //BA.debugLineNum = 61341766;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_oscilatio";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_oscilationtypes",_res);
RDebugUtils.currentLine=61341767;
 //BA.debugLineNum = 61341767;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_papersize";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_papersizetypes",_res);
RDebugUtils.currentLine=61341768;
 //BA.debugLineNum = 61341768;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_paramtype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_paramtypes",_res);
RDebugUtils.currentLine=61341769;
 //BA.debugLineNum = 61341769;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_paymentme";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_paymentmethods",_res);
RDebugUtils.currentLine=61341770;
 //BA.debugLineNum = 61341770;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_paymentty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_paymenttypes",_res);
RDebugUtils.currentLine=61341771;
 //BA.debugLineNum = 61341771;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodday";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_perioddaytypes",_res);
RDebugUtils.currentLine=61341772;
 //BA.debugLineNum = 61341772;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodici";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_periodicitytypes",_res);
RDebugUtils.currentLine=61341773;
 //BA.debugLineNum = 61341773;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodsty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_periodstypes",_res);
RDebugUtils.currentLine=61341774;
 //BA.debugLineNum = 61341774;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_periodsvi";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_periodsviewtypes",_res);
RDebugUtils.currentLine=61341775;
 //BA.debugLineNum = 61341775;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_priceaffe";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_priceaffecttype",_res);
RDebugUtils.currentLine=61341776;
 //BA.debugLineNum = 61341776;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_pricefrom";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_pricefromtype",_res);
RDebugUtils.currentLine=61341777;
 //BA.debugLineNum = 61341777;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_printoutt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_printouttypes",_res);
RDebugUtils.currentLine=61341778;
 //BA.debugLineNum = 61341778;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_priorityt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_prioritytypes",_res);
RDebugUtils.currentLine=61341779;
 //BA.debugLineNum = 61341779;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_propertyt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_propertytypes",_res);
RDebugUtils.currentLine=61341780;
 //BA.debugLineNum = 61341780;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_reasontyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_reasontypes",_res);
RDebugUtils.currentLine=61341781;
 //BA.debugLineNum = 61341781;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_recipient";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_recipienttypes",_res);
RDebugUtils.currentLine=61341782;
 //BA.debugLineNum = 61341782;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_relationt";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_relationtypes",_res);
RDebugUtils.currentLine=61341783;
 //BA.debugLineNum = 61341783;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_repitemst";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_repitemstypes",_res);
RDebugUtils.currentLine=61341784;
 //BA.debugLineNum = 61341784;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_repreltyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_repreltypes",_res);
RDebugUtils.currentLine=61341785;
 //BA.debugLineNum = 61341785;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_requestst";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_requeststypes",_res);
RDebugUtils.currentLine=61341786;
 //BA.debugLineNum = 61341786;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_resobsgro";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_resobsgroupstypes",_res);
RDebugUtils.currentLine=61341787;
 //BA.debugLineNum = 61341787;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_resobstyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_resobstypes",_res);
RDebugUtils.currentLine=61341788;
 //BA.debugLineNum = 61341788;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_resulttyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_resulttypes",_res);
RDebugUtils.currentLine=61341789;
 //BA.debugLineNum = 61341789;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_sendtotyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_sendtotypes",_res);
RDebugUtils.currentLine=61341790;
 //BA.debugLineNum = 61341790;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_skilltype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_skilltypes",_res);
RDebugUtils.currentLine=61341791;
 //BA.debugLineNum = 61341791;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_stagetype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_stagetype",_res);
RDebugUtils.currentLine=61341792;
 //BA.debugLineNum = 61341792;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_statetype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_statetypes",_res);
RDebugUtils.currentLine=61341793;
 //BA.debugLineNum = 61341793;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_statusobj";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_statusobjtypes",_res);
RDebugUtils.currentLine=61341794;
 //BA.debugLineNum = 61341794;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_statustyp";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_statustypes",_res);
RDebugUtils.currentLine=61341796;
 //BA.debugLineNum = 61341796;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_tasksmode";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_tasksmodetypes",_res);
RDebugUtils.currentLine=61341797;
 //BA.debugLineNum = 61341797;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_taskstype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_taskstypes",_res);
RDebugUtils.currentLine=61341798;
 //BA.debugLineNum = 61341798;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_tpgroupst";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_tpgroupstypes",_res);
RDebugUtils.currentLine=61341799;
 //BA.debugLineNum = 61341799;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_trclmodet";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_trclmodetypes",_res);
RDebugUtils.currentLine=61341800;
 //BA.debugLineNum = 61341800;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_tritemsty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_tritemstypes",_res);
RDebugUtils.currentLine=61341801;
 //BA.debugLineNum = 61341801;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_unavailab";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_unavailabletypes",_res);
RDebugUtils.currentLine=61341802;
 //BA.debugLineNum = 61341802;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_unittype\"";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_unittype",_res);
RDebugUtils.currentLine=61341803;
 //BA.debugLineNum = 61341803;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_userlogty";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_userlogtypes",_res);
RDebugUtils.currentLine=61341804;
 //BA.debugLineNum = 61341804;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_validatio";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_validationexectypes",_res);
RDebugUtils.currentLine=61341805;
 //BA.debugLineNum = 61341805;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_valuetype";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_valuetypes",_res);
RDebugUtils.currentLine=61341806;
 //BA.debugLineNum = 61341806;BA.debugLine="Res = Utils.SaveSQL2FileAndDelete(\"type_zonesaffe";
_res = parent.mostCurrent._utils._savesql2fileanddelete /*boolean*/ (mostCurrent.activityBA,"type_zonesaffecttypes",_res);
RDebugUtils.currentLine=61341808;
 //BA.debugLineNum = 61341808;BA.debugLine="ShareCode.Types_AlreadyDeleted = True";
parent.mostCurrent._sharecode._types_alreadydeleted /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61341810;
 //BA.debugLineNum = 61341810;BA.debugLine="If Not(Res) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(_res)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61341811;
 //BA.debugLineNum = 61341811;BA.debugLine="Log(\"ERRO AO APAGAR OS TYPE_\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661341811","ERRO AO APAGAR OS TYPE_",0);
RDebugUtils.currentLine=61341812;
 //BA.debugLineNum = 61341812;BA.debugLine="Utils.ReverSQLFromFilesAndDelete";
parent.mostCurrent._utils._reversqlfromfilesanddelete /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=61341814;
 //BA.debugLineNum = 61341814;BA.debugLine="Return Res";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=61341815;
 //BA.debugLineNum = 61341815;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _buttonwelcomenext_click() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buttonwelcomenext_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buttonwelcomenext_click", null));}
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Sub ButtonWelcomeNext_Click";
RDebugUtils.currentLine=59572227;
 //BA.debugLineNum = 59572227;BA.debugLine="CallSubDelayed2(MainMenu, \"StartTheActivity\", Tru";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(processBA,(Object)(mostCurrent._mainmenu.getObject()),"StartTheActivity",(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=59572228;
 //BA.debugLineNum = 59572228;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=59572239;
 //BA.debugLineNum = 59572239;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createlistaofflinereq(String _req,boolean _checkedreq,int _height) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "createlistaofflinereq", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(mostCurrent.activityBA, "createlistaofflinereq", new Object[] {_req,_checkedreq,_height}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=62521344;
 //BA.debugLineNum = 62521344;BA.debugLine="Sub createListaOfflineReq(Req As String, checkedRe";
RDebugUtils.currentLine=62521345;
 //BA.debugLineNum = 62521345;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=62521346;
 //BA.debugLineNum = 62521346;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=62521347;
 //BA.debugLineNum = 62521347;BA.debugLine="Activity.AddView(p, 0, 0, 100%x, height)";
mostCurrent._activity.AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=62521348;
 //BA.debugLineNum = 62521348;BA.debugLine="p.LoadLayout(\"ListaOfflineReq\" )";
_p.LoadLayout("ListaOfflineReq",mostCurrent.activityBA);
RDebugUtils.currentLine=62521349;
 //BA.debugLineNum = 62521349;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=62521350;
 //BA.debugLineNum = 62521350;BA.debugLine="ChkReqOffline.Checked = checkedReq";
mostCurrent._chkreqoffline.setChecked(_checkedreq);
RDebugUtils.currentLine=62521351;
 //BA.debugLineNum = 62521351;BA.debugLine="txtReqOffline.text = Req";
mostCurrent._txtreqoffline.setText(BA.ObjectToCharSequence(_req));
RDebugUtils.currentLine=62521352;
 //BA.debugLineNum = 62521352;BA.debugLine="p.Tag = $\"${Req}|${Utils.Bool2Int(checkedReq)}\"$";
_p.setTag((Object)((""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_req))+"|"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._bool2int /*int*/ (mostCurrent.activityBA,_checkedreq)))+"")));
RDebugUtils.currentLine=62521353;
 //BA.debugLineNum = 62521353;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=62521354;
 //BA.debugLineNum = 62521354;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletesqlfiles(String _filename) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deletesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "deletesqlfiles", new Object[] {_filename}));}
ResumableSub_DeleteSqlFiles rsub = new ResumableSub_DeleteSqlFiles(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteSqlFiles extends BA.ResumableSub {
public ResumableSub_DeleteSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename;
int _i = 0;
String _filen = "";
int step2;
int limit2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61472769;
 //BA.debugLineNum = 61472769;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61472770;
 //BA.debugLineNum = 61472770;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 4:
//for
this.state = 11;
step2 = 1;
limit2 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 11;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 6;
if (true) break;

case 14:
//C
this.state = 13;
_i = ((int)(0 + _i + step2)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61472771;
 //BA.debugLineNum = 61472771;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=61472772;
 //BA.debugLineNum = 61472772;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder, f";
if (true) break;

case 7:
//if
this.state = 10;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=61472773;
 //BA.debugLineNum = 61472773;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fil";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 10:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=61472776;
 //BA.debugLineNum = 61472776;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=61472778;
 //BA.debugLineNum = 61472778;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61472779;
 //BA.debugLineNum = 61472779;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deletesqlfilesfromserver(String _filename2delete) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deletesqlfilesfromserver", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "deletesqlfilesfromserver", new Object[] {_filename2delete}));}
ResumableSub_DeleteSqlFilesFromServer rsub = new ResumableSub_DeleteSqlFilesFromServer(null,_filename2delete);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DeleteSqlFilesFromServer extends BA.ResumableSub {
public ResumableSub_DeleteSqlFilesFromServer(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename2delete) {
this.parent = parent;
this._filename2delete = _filename2delete;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename2delete;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.objects.collections.List _lstdocs2delete = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname2 = "";
int _f = 0;
Object _sf = null;
int step13;
int limit13;
int step28;
int limit28;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60751874;
 //BA.debugLineNum = 60751874;BA.debugLine="If Utils.NNE(filename2delete) Then";
if (true) break;

case 1:
//if
this.state = 34;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_filename2delete)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60751875;
 //BA.debugLineNum = 60751875;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60751876;
 //BA.debugLineNum = 60751876;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60751877;
 //BA.debugLineNum = 60751877;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60751878;
 //BA.debugLineNum = 60751878;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60751879;
 //BA.debugLineNum = 60751879;BA.debugLine="Log(filename2delete)";
anywheresoftware.b4a.keywords.Common.LogImpl("660751879",_filename2delete,0);
RDebugUtils.currentLine=60751880;
 //BA.debugLineNum = 60751880;BA.debugLine="Dim LstDocs2Delete As List";
_lstdocs2delete = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60751882;
 //BA.debugLineNum = 60751882;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/");
RDebugUtils.currentLine=60751883;
 //BA.debugLineNum = 60751883;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "deletesqlfilesfromserver"), _sfl);
this.state = 35;
return;
case 35:
//C
this.state = 4;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60751884;
 //BA.debugLineNum = 60751884;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 21;
if (_success) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60751886;
 //BA.debugLineNum = 60751886;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_files.length>=1)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=60751887;
 //BA.debugLineNum = 60751887;BA.debugLine="LstDocs2Delete.Initialize";
_lstdocs2delete.Initialize();
RDebugUtils.currentLine=60751888;
 //BA.debugLineNum = 60751888;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 10:
//for
this.state = 17;
step13 = 1;
limit13 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 36;
if (true) break;

case 36:
//C
this.state = 17;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 12;
if (true) break;

case 37:
//C
this.state = 36;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=60751889;
 //BA.debugLineNum = 60751889;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista d";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(("Criando Lista de ficheiros para remocao no servidor")));
RDebugUtils.currentLine=60751890;
 //BA.debugLineNum = 60751890;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=60751891;
 //BA.debugLineNum = 60751891;BA.debugLine="If fName2.Contains(filename2delete) Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_fname2.contains(_filename2delete)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60751892;
 //BA.debugLineNum = 60751892;BA.debugLine="LstDocs2Delete.Add(files(i).Name)";
_lstdocs2delete.Add((Object)(_files[_i].getName()));
 if (true) break;

case 16:
//C
this.state = 37;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=60751897;
 //BA.debugLineNum = 60751897;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DeleteSQLFile";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","DeleteSQLFilesFromServer","error getting files list from /db/");
RDebugUtils.currentLine=60751898;
 //BA.debugLineNum = 60751898;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=60751901;
 //BA.debugLineNum = 60751901;BA.debugLine="If LstDocs2Delete.Size = 0 Then";

case 21:
//if
this.state = 24;
if (_lstdocs2delete.getSize()==0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=60751902;
 //BA.debugLineNum = 60751902;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=60751905;
 //BA.debugLineNum = 60751905;BA.debugLine="For f = 0 To LstDocs2Delete.Size -1";

case 24:
//for
this.state = 33;
step28 = 1;
limit28 = (int) (_lstdocs2delete.getSize()-1);
_f = (int) (0) ;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 33;
if ((step28 > 0 && _f <= limit28) || (step28 < 0 && _f >= limit28)) this.state = 26;
if (true) break;

case 39:
//C
this.state = 38;
_f = ((int)(0 + _f + step28)) ;
if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=60751906;
 //BA.debugLineNum = 60751906;BA.debugLine="filename2delete = LstDocs2Delete.Get(f)";
_filename2delete = BA.ObjectToString(_lstdocs2delete.Get(_f));
RDebugUtils.currentLine=60751907;
 //BA.debugLineNum = 60751907;BA.debugLine="Dim sf As Object = GlobalFTP.DeleteFile(\"/\" & S";
_sf = _globalftp.DeleteFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename2delete);
RDebugUtils.currentLine=60751908;
 //BA.debugLineNum = 60751908;BA.debugLine="Wait For (sf) FTP_DeleteCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_deletecompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "deletesqlfilesfromserver"), _sf);
this.state = 40;
return;
case 40:
//C
this.state = 27;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60751910;
 //BA.debugLineNum = 60751910;BA.debugLine="If Success Then";
if (true) break;

case 27:
//if
this.state = 32;
if (_success) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=60751911;
 //BA.debugLineNum = 60751911;BA.debugLine="Log(filename2delete & \" file was deleted succe";
anywheresoftware.b4a.keywords.Common.LogImpl("660751911",_filename2delete+" file was deleted successfully",0);
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=60751913;
 //BA.debugLineNum = 60751913;BA.debugLine="Log(\"Error deleting file \" & filename2delete)";
anywheresoftware.b4a.keywords.Common.LogImpl("660751913","Error deleting file "+_filename2delete,0);
 if (true) break;

case 32:
//C
this.state = 39;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=60751917;
 //BA.debugLineNum = 60751917;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=60751918;
 //BA.debugLineNum = 60751918;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=60751921;
 //BA.debugLineNum = 60751921;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=60751923;
 //BA.debugLineNum = 60751923;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _deletetypesfromtable(String _script) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "deletetypesfromtable", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "deletetypesfromtable", new Object[] {_script}));}
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="Sub DeleteTypesFromTable(script As String)";
RDebugUtils.currentLine=61407234;
 //BA.debugLineNum = 61407234;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloaddocsonly(String _date2watch,boolean _syncdates) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloaddocsonly", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloaddocsonly", new Object[] {_date2watch,_syncdates}));}
ResumableSub_DownloadDocsOnly rsub = new ResumableSub_DownloadDocsOnly(null,_date2watch,_syncdates);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadDocsOnly extends BA.ResumableSub {
public ResumableSub_DownloadDocsOnly(xevolution.vrcg.devdemov2400.dataupdate parent,String _date2watch,boolean _syncdates) {
this.parent = parent;
this._date2watch = _date2watch;
this._syncdates = _syncdates;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _date2watch;
boolean _syncdates;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.objects.collections.List _ftpdocslist = null;
int _totaldocs = 0;
anywheresoftware.b4a.objects.collections.List _dates2sync = null;
long _idatel = 0L;
long _edatel = 0L;
long _lmdate = 0L;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname = "";
Object _sf = null;
anywheresoftware.b4a.objects.collections.List _ftptemplateslist = null;
int _totaltemplates = 0;
String _fname2 = "";
int step31;
int limit31;
int step68;
int limit68;
int step100;
int limit100;
int step115;
int limit115;
int step147;
int limit147;
int step162;
int limit162;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60882946;
 //BA.debugLineNum = 60882946;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60882950;
 //BA.debugLineNum = 60882950;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=60882951;
 //BA.debugLineNum = 60882951;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660882951","************************************************************",0);
RDebugUtils.currentLine=60882952;
 //BA.debugLineNum = 60882952;BA.debugLine="Log($\" INITIAL : ${ShareCode.APPL_HOST}/${ShareCo";
anywheresoftware.b4a.keywords.Common.LogImpl("660882952",(" INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=60882953;
 //BA.debugLineNum = 60882953;BA.debugLine="Log(\"/docs/\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660882953","/docs/",0);
RDebugUtils.currentLine=60882954;
 //BA.debugLineNum = 60882954;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660882954","************************************************************",0);
RDebugUtils.currentLine=60882955;
 //BA.debugLineNum = 60882955;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60882956;
 //BA.debugLineNum = 60882956;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60882957;
 //BA.debugLineNum = 60882957;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60882958;
 //BA.debugLineNum = 60882958;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60882959;
 //BA.debugLineNum = 60882959;BA.debugLine="Dim FTPDOCSLIST As List";
_ftpdocslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60882960;
 //BA.debugLineNum = 60882960;BA.debugLine="Dim TotalDocs As Int = 0";
_totaldocs = (int) (0);
RDebugUtils.currentLine=60882963;
 //BA.debugLineNum = 60882963;BA.debugLine="If SyncDates Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_syncdates) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=60882964;
 //BA.debugLineNum = 60882964;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=60882965;
 //BA.debugLineNum = 60882965;BA.debugLine="Dim Dates2Sync As List = Regex.Split(\"\\|\", date2";
_dates2sync = new anywheresoftware.b4a.objects.collections.List();
_dates2sync = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_date2watch));
RDebugUtils.currentLine=60882966;
 //BA.debugLineNum = 60882966;BA.debugLine="Dim iDateL As Long = DateTime.DateParse(Dates2Sy";
_idatel = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_dates2sync.Get((int) (0))));
RDebugUtils.currentLine=60882967;
 //BA.debugLineNum = 60882967;BA.debugLine="Dim eDateL As Long = DateTime.DateParse(Dates2Sy";
_edatel = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_dates2sync.Get((int) (1))));
RDebugUtils.currentLine=60882968;
 //BA.debugLineNum = 60882968;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60882970;
 //BA.debugLineNum = 60882970;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=60882973;
 //BA.debugLineNum = 60882973;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=60882974;
 //BA.debugLineNum = 60882974;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"), _sfl);
this.state = 146;
return;
case 146:
//C
this.state = 7;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60882975;
 //BA.debugLineNum = 60882975;BA.debugLine="If Success Then";
if (true) break;

case 7:
//if
this.state = 48;
if (_success) { 
this.state = 9;
}else {
this.state = 47;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=60882976;
 //BA.debugLineNum = 60882976;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60882977;
 //BA.debugLineNum = 60882977;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 10:
//if
this.state = 45;
if ((_files.length>=1)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=60882978;
 //BA.debugLineNum = 60882978;BA.debugLine="FTPDOCSLIST.Initialize";
_ftpdocslist.Initialize();
RDebugUtils.currentLine=60882979;
 //BA.debugLineNum = 60882979;BA.debugLine="TotalDocs = files.Length -1";
_totaldocs = (int) (_files.length-1);
RDebugUtils.currentLine=60882980;
 //BA.debugLineNum = 60882980;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista de";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(("Criando Lista de ficheiros para download em :/docs/")));
RDebugUtils.currentLine=60882981;
 //BA.debugLineNum = 60882981;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"),(int) (500));
this.state = 147;
return;
case 147:
//C
this.state = 13;
;
RDebugUtils.currentLine=60882982;
 //BA.debugLineNum = 60882982;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 13:
//for
this.state = 44;
step31 = 1;
limit31 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 148;
if (true) break;

case 148:
//C
this.state = 44;
if ((step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31)) this.state = 15;
if (true) break;

case 149:
//C
this.state = 148;
_i = ((int)(0 + _i + step31)) ;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60882983;
 //BA.debugLineNum = 60882983;BA.debugLine="Dim fName As String = files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=60882984;
 //BA.debugLineNum = 60882984;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
if (true) break;

case 16:
//if
this.state = 43;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx")) || anywheresoftware.b4a.keywords.Common.Not((_fname.startsWith("REPORT")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=60882990;
 //BA.debugLineNum = 60882990;BA.debugLine="If SyncDates Then";
if (true) break;

case 19:
//if
this.state = 42;
if (_syncdates) { 
this.state = 21;
}else {
this.state = 37;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=60882991;
 //BA.debugLineNum = 60882991;BA.debugLine="If ShareCode.DownloadDocsFromFTP = True Then";
if (true) break;

case 22:
//if
this.state = 35;
if (parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 24;
}else {
this.state = 30;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=60882992;
 //BA.debugLineNum = 60882992;BA.debugLine="If (files(i).Timestamp >= iDateL) And (file";
if (true) break;

case 25:
//if
this.state = 28;
if ((_files[_i].getTimestamp()>=_idatel) && (_files[_i].getTimestamp()<=_edatel)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=60882993;
 //BA.debugLineNum = 60882993;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=60882994;
 //BA.debugLineNum = 60882994;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("660882994",_files[_i].getName(),0);
 if (true) break;

case 28:
//C
this.state = 35;
;
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=60882997;
 //BA.debugLineNum = 60882997;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=60882998;
 //BA.debugLineNum = 60882998;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=60882999;
 //BA.debugLineNum = 60882999;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("660882999",_files[_i].getName(),0);
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = 42;
;
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=60883003;
 //BA.debugLineNum = 60883003;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
if (true) break;

case 38:
//if
this.state = 41;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=60883004;
 //BA.debugLineNum = 60883004;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=60883005;
 //BA.debugLineNum = 60883005;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883005",_files[_i].getName(),0);
 if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 149;
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=60883011;
 //BA.debugLineNum = 60883011;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=60883012;
 //BA.debugLineNum = 60883012;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883012","*************************",0);
RDebugUtils.currentLine=60883013;
 //BA.debugLineNum = 60883013;BA.debugLine="Log($\"Total Files Added to /DOCS List = ${FTPDO";
anywheresoftware.b4a.keywords.Common.LogImpl("660883013",("Total Files Added to /DOCS List = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ftpdocslist.getSize()))+" out of a Total of "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+""),0);
RDebugUtils.currentLine=60883014;
 //BA.debugLineNum = 60883014;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883014","*************************",0);
 if (true) break;

case 45:
//C
this.state = 48;
;
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=60883017;
 //BA.debugLineNum = 60883017;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error gett";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","RunSync","error getting files list from /docs/");
 if (true) break;
;
RDebugUtils.currentLine=60883019;
 //BA.debugLineNum = 60883019;BA.debugLine="If (FTPDOCSLIST.IsInitialized) Then";

case 48:
//if
this.state = 71;
if ((_ftpdocslist.IsInitialized())) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=60883020;
 //BA.debugLineNum = 60883020;BA.debugLine="If (FTPDOCSLIST.Size>=1) Then";
if (true) break;

case 51:
//if
this.state = 70;
if ((_ftpdocslist.getSize()>=1)) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=60883021;
 //BA.debugLineNum = 60883021;BA.debugLine="TotalDocs = FTPDOCSLIST.Size-1";
_totaldocs = (int) (_ftpdocslist.getSize()-1);
RDebugUtils.currentLine=60883022;
 //BA.debugLineNum = 60883022;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883022","*************************",0);
RDebugUtils.currentLine=60883023;
 //BA.debugLineNum = 60883023;BA.debugLine="Log(\"Total DOCS : \" & TotalDocs)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883023","Total DOCS : "+BA.NumberToString(_totaldocs),0);
RDebugUtils.currentLine=60883024;
 //BA.debugLineNum = 60883024;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883024","*************************",0);
RDebugUtils.currentLine=60883025;
 //BA.debugLineNum = 60883025;BA.debugLine="For i=0 To FTPDOCSLIST.Size-1";
if (true) break;

case 54:
//for
this.state = 69;
step68 = 1;
limit68 = (int) (_ftpdocslist.getSize()-1);
_i = (int) (0) ;
this.state = 150;
if (true) break;

case 150:
//C
this.state = 69;
if ((step68 > 0 && _i <= limit68) || (step68 < 0 && _i >= limit68)) this.state = 56;
if (true) break;

case 151:
//C
this.state = 150;
_i = ((int)(0 + _i + step68)) ;
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=60883026;
 //BA.debugLineNum = 60883026;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/docs/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+"")));
RDebugUtils.currentLine=60883027;
 //BA.debugLineNum = 60883027;BA.debugLine="Dim fName As String = FTPDOCSLIST.Get(i)";
_fname = BA.ObjectToString(_ftpdocslist.Get(_i));
RDebugUtils.currentLine=60883028;
 //BA.debugLineNum = 60883028;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883028",_fname,0);
RDebugUtils.currentLine=60883029;
 //BA.debugLineNum = 60883029;BA.debugLine="Try";
if (true) break;

case 57:
//try
this.state = 68;
this.catchState = 67;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 60;
this.catchState = 67;
RDebugUtils.currentLine=60883030;
 //BA.debugLineNum = 60883030;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=60883031;
 //BA.debugLineNum = 60883031;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"), _sf);
this.state = 152;
return;
case 152:
//C
this.state = 60;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60883033;
 //BA.debugLineNum = 60883033;BA.debugLine="If Success Then";
if (true) break;

case 60:
//if
this.state = 65;
if (_success) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
RDebugUtils.currentLine=60883034;
 //BA.debugLineNum = 60883034;BA.debugLine="Log(\"/docs/ : file was download successfully";
anywheresoftware.b4a.keywords.Common.LogImpl("660883034","/docs/ : file was download successfully",0);
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=60883036;
 //BA.debugLineNum = 60883036;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883036","/docs/ : Error downloading file",0);
 if (true) break;

case 65:
//C
this.state = 68;
;
 if (true) break;

case 67:
//C
this.state = 68;
this.catchState = 0;
RDebugUtils.currentLine=60883039;
 //BA.debugLineNum = 60883039;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883039",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 68:
//C
this.state = 151;
this.catchState = 0;
;
RDebugUtils.currentLine=60883041;
 //BA.debugLineNum = 60883041;BA.debugLine="DUProgressBar(TotalDocs,i)";
_duprogressbar(_totaldocs,_i);
 if (true) break;
if (true) break;

case 69:
//C
this.state = 70;
;
 if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = 72;
;
RDebugUtils.currentLine=60883049;
 //BA.debugLineNum = 60883049;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660883049","************************************************************",0);
RDebugUtils.currentLine=60883050;
 //BA.debugLineNum = 60883050;BA.debugLine="Log(\"/docs/templates\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883050","/docs/templates",0);
RDebugUtils.currentLine=60883051;
 //BA.debugLineNum = 60883051;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660883051","************************************************************",0);
RDebugUtils.currentLine=60883052;
 //BA.debugLineNum = 60883052;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60883053;
 //BA.debugLineNum = 60883053;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=60883054;
 //BA.debugLineNum = 60883054;BA.debugLine="Dim FTPTEMPLATESLIST As List";
_ftptemplateslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60883055;
 //BA.debugLineNum = 60883055;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=60883057;
 //BA.debugLineNum = 60883057;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/");
RDebugUtils.currentLine=60883058;
 //BA.debugLineNum = 60883058;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"), _sfl);
this.state = 153;
return;
case 153:
//C
this.state = 72;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60883059;
 //BA.debugLineNum = 60883059;BA.debugLine="If Success Then";
if (true) break;

case 72:
//if
this.state = 85;
if (_success) { 
this.state = 74;
}else {
this.state = 84;
}if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=60883061;
 //BA.debugLineNum = 60883061;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 75:
//if
this.state = 82;
if ((_files.length>=1)) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=60883062;
 //BA.debugLineNum = 60883062;BA.debugLine="TotalDocs = files.Length -1";
_totaldocs = (int) (_files.length-1);
RDebugUtils.currentLine=60883063;
 //BA.debugLineNum = 60883063;BA.debugLine="FTPTEMPLATESLIST.Initialize";
_ftptemplateslist.Initialize();
RDebugUtils.currentLine=60883064;
 //BA.debugLineNum = 60883064;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 78:
//for
this.state = 81;
step100 = 1;
limit100 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 154;
if (true) break;

case 154:
//C
this.state = 81;
if ((step100 > 0 && _i <= limit100) || (step100 < 0 && _i >= limit100)) this.state = 80;
if (true) break;

case 155:
//C
this.state = 154;
_i = ((int)(0 + _i + step100)) ;
if (true) break;

case 80:
//C
this.state = 155;
RDebugUtils.currentLine=60883065;
 //BA.debugLineNum = 60883065;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista de";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(("Criando Lista de ficheiros para download em :/docs/templates/ "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+"")));
RDebugUtils.currentLine=60883066;
 //BA.debugLineNum = 60883066;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=60883067;
 //BA.debugLineNum = 60883067;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
_ftptemplateslist.Add((Object)(_files[_i].getName()));
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = 85;
;
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=60883071;
 //BA.debugLineNum = 60883071;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error gett";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","RunSync","error getting files list from /docs/templates/");
 if (true) break;
;
RDebugUtils.currentLine=60883074;
 //BA.debugLineNum = 60883074;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";

case 85:
//if
this.state = 108;
if ((_ftptemplateslist.IsInitialized())) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=60883075;
 //BA.debugLineNum = 60883075;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
if (true) break;

case 88:
//if
this.state = 107;
if ((_ftptemplateslist.getSize()>=1)) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=60883076;
 //BA.debugLineNum = 60883076;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
_totaltemplates = (int) (_ftptemplateslist.getSize()-1);
RDebugUtils.currentLine=60883077;
 //BA.debugLineNum = 60883077;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883077","*************************",0);
RDebugUtils.currentLine=60883078;
 //BA.debugLineNum = 60883078;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883078","Total TEMPLATES : "+BA.NumberToString(_totaltemplates),0);
RDebugUtils.currentLine=60883079;
 //BA.debugLineNum = 60883079;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883079","*************************",0);
RDebugUtils.currentLine=60883080;
 //BA.debugLineNum = 60883080;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
if (true) break;

case 91:
//for
this.state = 106;
step115 = 1;
limit115 = (int) (_ftptemplateslist.getSize()-1);
_i = (int) (0) ;
this.state = 156;
if (true) break;

case 156:
//C
this.state = 106;
if ((step115 > 0 && _i <= limit115) || (step115 < 0 && _i >= limit115)) this.state = 93;
if (true) break;

case 157:
//C
this.state = 156;
_i = ((int)(0 + _i + step115)) ;
if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=60883081;
 //BA.debugLineNum = 60883081;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/docs/templates/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=60883082;
 //BA.debugLineNum = 60883082;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i)";
_fname2 = BA.ObjectToString(_ftptemplateslist.Get(_i));
RDebugUtils.currentLine=60883083;
 //BA.debugLineNum = 60883083;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883083",_fname2,0);
RDebugUtils.currentLine=60883084;
 //BA.debugLineNum = 60883084;BA.debugLine="Try";
if (true) break;

case 94:
//try
this.state = 105;
this.catchState = 104;
this.state = 96;
if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 104;
RDebugUtils.currentLine=60883085;
 //BA.debugLineNum = 60883085;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=60883086;
 //BA.debugLineNum = 60883086;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"), _sf);
this.state = 158;
return;
case 158:
//C
this.state = 97;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60883088;
 //BA.debugLineNum = 60883088;BA.debugLine="If Success Then";
if (true) break;

case 97:
//if
this.state = 102;
if (_success) { 
this.state = 99;
}else {
this.state = 101;
}if (true) break;

case 99:
//C
this.state = 102;
RDebugUtils.currentLine=60883089;
 //BA.debugLineNum = 60883089;BA.debugLine="Log(\"/docs/templates/ : file was download su";
anywheresoftware.b4a.keywords.Common.LogImpl("660883089","/docs/templates/ : file was download successfully",0);
 if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=60883092;
 //BA.debugLineNum = 60883092;BA.debugLine="Log(\"/docs/templates/ : Error downloading fi";
anywheresoftware.b4a.keywords.Common.LogImpl("660883092","/docs/templates/ : Error downloading file",0);
 if (true) break;

case 102:
//C
this.state = 105;
;
 if (true) break;

case 104:
//C
this.state = 105;
this.catchState = 0;
RDebugUtils.currentLine=60883096;
 //BA.debugLineNum = 60883096;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883096",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 105:
//C
this.state = 157;
this.catchState = 0;
;
RDebugUtils.currentLine=60883098;
 //BA.debugLineNum = 60883098;BA.debugLine="DUProgressBar(TotalTemplates,i)";
_duprogressbar(_totaltemplates,_i);
 if (true) break;
if (true) break;

case 106:
//C
this.state = 107;
;
 if (true) break;

case 107:
//C
this.state = 108;
;
 if (true) break;

case 108:
//C
this.state = 109;
;
RDebugUtils.currentLine=60883106;
 //BA.debugLineNum = 60883106;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660883106","************************************************************",0);
RDebugUtils.currentLine=60883107;
 //BA.debugLineNum = 60883107;BA.debugLine="Log(\"/interno\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883107","/interno",0);
RDebugUtils.currentLine=60883108;
 //BA.debugLineNum = 60883108;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660883108","************************************************************",0);
RDebugUtils.currentLine=60883109;
 //BA.debugLineNum = 60883109;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60883110;
 //BA.debugLineNum = 60883110;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=60883111;
 //BA.debugLineNum = 60883111;BA.debugLine="Dim FTPTEMPLATESLIST As List";
_ftptemplateslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60883112;
 //BA.debugLineNum = 60883112;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=60883114;
 //BA.debugLineNum = 60883114;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
_sfl = _globalftp.List(processBA,"/interno/");
RDebugUtils.currentLine=60883115;
 //BA.debugLineNum = 60883115;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"), _sfl);
this.state = 159;
return;
case 159:
//C
this.state = 109;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60883116;
 //BA.debugLineNum = 60883116;BA.debugLine="If Success Then";
if (true) break;

case 109:
//if
this.state = 122;
if (_success) { 
this.state = 111;
}else {
this.state = 121;
}if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=60883118;
 //BA.debugLineNum = 60883118;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 112:
//if
this.state = 119;
if ((_files.length>=1)) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
RDebugUtils.currentLine=60883119;
 //BA.debugLineNum = 60883119;BA.debugLine="TotalDocs = files.Length -1";
_totaldocs = (int) (_files.length-1);
RDebugUtils.currentLine=60883120;
 //BA.debugLineNum = 60883120;BA.debugLine="FTPTEMPLATESLIST.Initialize";
_ftptemplateslist.Initialize();
RDebugUtils.currentLine=60883121;
 //BA.debugLineNum = 60883121;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 115:
//for
this.state = 118;
step147 = 1;
limit147 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 160;
if (true) break;

case 160:
//C
this.state = 118;
if ((step147 > 0 && _i <= limit147) || (step147 < 0 && _i >= limit147)) this.state = 117;
if (true) break;

case 161:
//C
this.state = 160;
_i = ((int)(0 + _i + step147)) ;
if (true) break;

case 117:
//C
this.state = 161;
RDebugUtils.currentLine=60883122;
 //BA.debugLineNum = 60883122;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista de";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(("Criando Lista de ficheiros para download em :/interno/ "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+"")));
RDebugUtils.currentLine=60883123;
 //BA.debugLineNum = 60883123;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=60883124;
 //BA.debugLineNum = 60883124;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
_ftptemplateslist.Add((Object)(_files[_i].getName()));
 if (true) break;
if (true) break;

case 118:
//C
this.state = 119;
;
 if (true) break;

case 119:
//C
this.state = 122;
;
 if (true) break;

case 121:
//C
this.state = 122;
RDebugUtils.currentLine=60883128;
 //BA.debugLineNum = 60883128;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error gett";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","RunSync","error getting files list from /interno/");
 if (true) break;
;
RDebugUtils.currentLine=60883131;
 //BA.debugLineNum = 60883131;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";

case 122:
//if
this.state = 145;
if ((_ftptemplateslist.IsInitialized())) { 
this.state = 124;
}if (true) break;

case 124:
//C
this.state = 125;
RDebugUtils.currentLine=60883132;
 //BA.debugLineNum = 60883132;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
if (true) break;

case 125:
//if
this.state = 144;
if ((_ftptemplateslist.getSize()>=1)) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=60883133;
 //BA.debugLineNum = 60883133;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
_totaltemplates = (int) (_ftptemplateslist.getSize()-1);
RDebugUtils.currentLine=60883134;
 //BA.debugLineNum = 60883134;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883134","*************************",0);
RDebugUtils.currentLine=60883135;
 //BA.debugLineNum = 60883135;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883135","Total TEMPLATES : "+BA.NumberToString(_totaltemplates),0);
RDebugUtils.currentLine=60883136;
 //BA.debugLineNum = 60883136;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883136","*************************",0);
RDebugUtils.currentLine=60883137;
 //BA.debugLineNum = 60883137;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
if (true) break;

case 128:
//for
this.state = 143;
step162 = 1;
limit162 = (int) (_ftptemplateslist.getSize()-1);
_i = (int) (0) ;
this.state = 162;
if (true) break;

case 162:
//C
this.state = 143;
if ((step162 > 0 && _i <= limit162) || (step162 < 0 && _i >= limit162)) this.state = 130;
if (true) break;

case 163:
//C
this.state = 162;
_i = ((int)(0 + _i + step162)) ;
if (true) break;

case 130:
//C
this.state = 131;
RDebugUtils.currentLine=60883138;
 //BA.debugLineNum = 60883138;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/interno/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=60883139;
 //BA.debugLineNum = 60883139;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i)";
_fname2 = BA.ObjectToString(_ftptemplateslist.Get(_i));
RDebugUtils.currentLine=60883140;
 //BA.debugLineNum = 60883140;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883140",_fname2,0);
RDebugUtils.currentLine=60883141;
 //BA.debugLineNum = 60883141;BA.debugLine="Try";
if (true) break;

case 131:
//try
this.state = 142;
this.catchState = 141;
this.state = 133;
if (true) break;

case 133:
//C
this.state = 134;
this.catchState = 141;
RDebugUtils.currentLine=60883142;
 //BA.debugLineNum = 60883142;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/i";
_sf = _globalftp.DownloadFile(processBA,"/interno/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=60883143;
 //BA.debugLineNum = 60883143;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloaddocsonly"), _sf);
this.state = 164;
return;
case 164:
//C
this.state = 134;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60883145;
 //BA.debugLineNum = 60883145;BA.debugLine="If Success Then";
if (true) break;

case 134:
//if
this.state = 139;
if (_success) { 
this.state = 136;
}else {
this.state = 138;
}if (true) break;

case 136:
//C
this.state = 139;
RDebugUtils.currentLine=60883146;
 //BA.debugLineNum = 60883146;BA.debugLine="Log(\"/interno/ : file was download successfu";
anywheresoftware.b4a.keywords.Common.LogImpl("660883146","/interno/ : file was download successfully",0);
 if (true) break;

case 138:
//C
this.state = 139;
RDebugUtils.currentLine=60883149;
 //BA.debugLineNum = 60883149;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660883149","/interno/ : Error downloading file",0);
 if (true) break;

case 139:
//C
this.state = 142;
;
 if (true) break;

case 141:
//C
this.state = 142;
this.catchState = 0;
RDebugUtils.currentLine=60883153;
 //BA.debugLineNum = 60883153;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660883153",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 142:
//C
this.state = 163;
this.catchState = 0;
;
RDebugUtils.currentLine=60883155;
 //BA.debugLineNum = 60883155;BA.debugLine="DUProgressBar(TotalTemplates,i)";
_duprogressbar(_totaltemplates,_i);
 if (true) break;
if (true) break;

case 143:
//C
this.state = 144;
;
 if (true) break;

case 144:
//C
this.state = 145;
;
 if (true) break;

case 145:
//C
this.state = -1;
;
RDebugUtils.currentLine=60883159;
 //BA.debugLineNum = 60883159;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=60883165;
 //BA.debugLineNum = 60883165;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60883166;
 //BA.debugLineNum = 60883166;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60883167;
 //BA.debugLineNum = 60883167;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=60883168;
 //BA.debugLineNum = 60883168;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60883169;
 //BA.debugLineNum = 60883169;BA.debugLine="ProgressBar1.Visible = False";
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60883172;
 //BA.debugLineNum = 60883172;BA.debugLine="ShareCode.AwakeDevice(False)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60883173;
 //BA.debugLineNum = 60883173;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=60883174;
 //BA.debugLineNum = 60883174;BA.debugLine="End Sub";
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
public static String  _duprogressbar(int _maxval,int _currentval) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "duprogressbar", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "duprogressbar", new Object[] {_maxval,_currentval}));}
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Sub DUProgressBar(MaxVal As Int, CurrentVal As Int";
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
_currentval = (int) ((100*_currentval/(double)_maxval));
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="DataUpdateProgressBar.Progress = CurrentVal";
mostCurrent._dataupdateprogressbar.setProgress(_currentval);
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadfileswithftp(anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadfileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadfileswithftp", new Object[] {_dlg}));}
ResumableSub_DownloadFilesWithFTP rsub = new ResumableSub_DownloadFilesWithFTP(null,_dlg);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadFilesWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadFilesWithFTP(xevolution.vrcg.devdemov2400.dataupdate parent,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this._dlg = _dlg;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
int _current_counter = 0;
int _end_counter = 0;
int _current_counter2 = 0;
int _end_counter2 = 0;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _l1 = 0;
long _lmdate = 0L;
int _i = 0;
String _fname = "";
Object _sf = null;
Object _sf2 = null;
int _l2 = 0;
long _lmdate2 = 0L;
String _fname2 = "";
int step17;
int limit17;
int step23;
int limit23;
int step39;
int limit39;
int step64;
int limit64;
int step70;
int limit70;
int step84;
int limit84;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61734913;
 //BA.debugLineNum = 61734913;BA.debugLine="Dim CURRENT_COUNTER As Int = 0";
_current_counter = (int) (0);
RDebugUtils.currentLine=61734914;
 //BA.debugLineNum = 61734914;BA.debugLine="Dim END_COUNTER As Int = 0";
_end_counter = (int) (0);
RDebugUtils.currentLine=61734916;
 //BA.debugLineNum = 61734916;BA.debugLine="Dim CURRENT_COUNTER2 As Int = 0";
_current_counter2 = (int) (0);
RDebugUtils.currentLine=61734917;
 //BA.debugLineNum = 61734917;BA.debugLine="Dim END_COUNTER2 As Int = 0";
_end_counter2 = (int) (0);
RDebugUtils.currentLine=61734919;
 //BA.debugLineNum = 61734919;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("661734919","************************************************************",0);
RDebugUtils.currentLine=61734920;
 //BA.debugLineNum = 61734920;BA.debugLine="Log($\" 		INITIAL : ${ShareCode.APPL_HOST}/${Share";
anywheresoftware.b4a.keywords.Common.LogImpl("661734920",(" 		INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=61734921;
 //BA.debugLineNum = 61734921;BA.debugLine="Log(\"********************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("661734921","************************************************************",0);
RDebugUtils.currentLine=61734922;
 //BA.debugLineNum = 61734922;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=61734923;
 //BA.debugLineNum = 61734923;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=61734924;
 //BA.debugLineNum = 61734924;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61734928;
 //BA.debugLineNum = 61734928;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=61734933;
 //BA.debugLineNum = 61734933;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesWi";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","DownloadFilesWithFTP","Start FTP with /docs/");
RDebugUtils.currentLine=61734934;
 //BA.debugLineNum = 61734934;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=61734935;
 //BA.debugLineNum = 61734935;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCod";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=61734938;
 //BA.debugLineNum = 61734938;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadfileswithftp"), _sfl);
this.state = 107;
return;
case 107:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=61734939;
 //BA.debugLineNum = 61734939;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 26;
if (_success) { 
this.state = 3;
}else {
this.state = 25;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61734941;
 //BA.debugLineNum = 61734941;BA.debugLine="For l1 = 0 To Files.Length - 1";
if (true) break;

case 4:
//for
this.state = 7;
step17 = 1;
limit17 = (int) (_files.length-1);
_l1 = (int) (0) ;
this.state = 108;
if (true) break;

case 108:
//C
this.state = 7;
if ((step17 > 0 && _l1 <= limit17) || (step17 < 0 && _l1 >= limit17)) this.state = 6;
if (true) break;

case 109:
//C
this.state = 108;
_l1 = ((int)(0 + _l1 + step17)) ;
if (true) break;

case 6:
//C
this.state = 109;
RDebugUtils.currentLine=61734942;
 //BA.debugLineNum = 61734942;BA.debugLine="Log($\"/docs/ : ${Files(l1).Name}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("661734942",("/docs/ : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_files[_l1].getName()))+""),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=61734945;
 //BA.debugLineNum = 61734945;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1) '";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
RDebugUtils.currentLine=61734947;
 //BA.debugLineNum = 61734947;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 8:
//if
this.state = 23;
if ((_files.length>=1)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=61734948;
 //BA.debugLineNum = 61734948;BA.debugLine="FTPFileList.Initialize";
parent.mostCurrent._ftpfilelist.Initialize();
RDebugUtils.currentLine=61734949;
 //BA.debugLineNum = 61734949;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 11:
//for
this.state = 22;
step23 = 1;
limit23 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 110;
if (true) break;

case 110:
//C
this.state = 22;
if ((step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23)) this.state = 13;
if (true) break;

case 111:
//C
this.state = 110;
_i = ((int)(0 + _i + step23)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=61734950;
 //BA.debugLineNum = 61734950;BA.debugLine="Dim fName As String = Files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=61734951;
 //BA.debugLineNum = 61734951;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWith";
if (true) break;

case 14:
//if
this.state = 21;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx")) || (_fname.startsWith("REPORT"))==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=61734955;
 //BA.debugLineNum = 61734955;BA.debugLine="If (Files(i).Timestamp >= LMDate) Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=61734956;
 //BA.debugLineNum = 61734956;BA.debugLine="FTPFileList.Add(Files(i).Name)";
parent.mostCurrent._ftpfilelist.Add((Object)(_files[_i].getName()));
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 111;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=61734962;
 //BA.debugLineNum = 61734962;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesW";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","DownloadFilesWithFTP","error getting files list from /docs/");
RDebugUtils.currentLine=61734963;
 //BA.debugLineNum = 61734963;BA.debugLine="CURRENT_COUNTER = END_COUNTER";
_current_counter = _end_counter;
 if (true) break;
;
RDebugUtils.currentLine=61734967;
 //BA.debugLineNum = 61734967;BA.debugLine="If (FTPFileList.IsInitialized) Then";

case 26:
//if
this.state = 52;
if ((parent.mostCurrent._ftpfilelist.IsInitialized())) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=61734968;
 //BA.debugLineNum = 61734968;BA.debugLine="If (FTPFileList.Size>=1) Then";
if (true) break;

case 29:
//if
this.state = 51;
if ((parent.mostCurrent._ftpfilelist.getSize()>=1)) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=61734969;
 //BA.debugLineNum = 61734969;BA.debugLine="END_COUNTER = FTPFileList.Size-1";
_end_counter = (int) (parent.mostCurrent._ftpfilelist.getSize()-1);
RDebugUtils.currentLine=61734970;
 //BA.debugLineNum = 61734970;BA.debugLine="For i=0 To FTPFileList.Size-1";
if (true) break;

case 32:
//for
this.state = 50;
step39 = 1;
limit39 = (int) (parent.mostCurrent._ftpfilelist.getSize()-1);
_i = (int) (0) ;
this.state = 112;
if (true) break;

case 112:
//C
this.state = 50;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 34;
if (true) break;

case 113:
//C
this.state = 112;
_i = ((int)(0 + _i + step39)) ;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=61734971;
 //BA.debugLineNum = 61734971;BA.debugLine="Dim fName As String = FTPFileList.Get(i)";
_fname = BA.ObjectToString(parent.mostCurrent._ftpfilelist.Get(_i));
RDebugUtils.currentLine=61734973;
 //BA.debugLineNum = 61734973;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("661734973",_fname,0);
RDebugUtils.currentLine=61734974;
 //BA.debugLineNum = 61734974;BA.debugLine="Try";
if (true) break;

case 35:
//try
this.state = 46;
this.catchState = 45;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 45;
RDebugUtils.currentLine=61734975;
 //BA.debugLineNum = 61734975;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=61734976;
 //BA.debugLineNum = 61734976;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPa";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadfileswithftp"), _sf);
this.state = 114;
return;
case 114:
//C
this.state = 38;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61734978;
 //BA.debugLineNum = 61734978;BA.debugLine="If Success Then";
if (true) break;

case 38:
//if
this.state = 43;
if (_success) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=61734979;
 //BA.debugLineNum = 61734979;BA.debugLine="Log(\"/docs/ : file was download successfully";
anywheresoftware.b4a.keywords.Common.LogImpl("661734979","/docs/ : file was download successfully",0);
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=61734982;
 //BA.debugLineNum = 61734982;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661734982","/docs/ : Error downloading file",0);
 if (true) break;

case 43:
//C
this.state = 46;
;
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
RDebugUtils.currentLine=61734986;
 //BA.debugLineNum = 61734986;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661734986",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=61734989;
 //BA.debugLineNum = 61734989;BA.debugLine="If (FTPFileList.Size-1 > CURRENT_COUNTER) Then";

case 46:
//if
this.state = 49;
this.catchState = 0;
if ((parent.mostCurrent._ftpfilelist.getSize()-1>_current_counter)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=61734990;
 //BA.debugLineNum = 61734990;BA.debugLine="CURRENT_COUNTER = CURRENT_COUNTER+1";
_current_counter = (int) (_current_counter+1);
 if (true) break;

case 49:
//C
this.state = 113;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=61735002;
 //BA.debugLineNum = 61735002;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesWi";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","DownloadFilesWithFTP","Start FTP with /docs/templates");
RDebugUtils.currentLine=61735003;
 //BA.debugLineNum = 61735003;BA.debugLine="lbldataupdateprocess.Text = \"A descarregar fichei";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence("A descarregar ficheiros complementares (templates) do servidor ..."));
RDebugUtils.currentLine=61735004;
 //BA.debugLineNum = 61735004;BA.debugLine="Dim sf2 As Object = GlobalFTP.List(\"/\" & ShareCod";
_sf2 = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/");
RDebugUtils.currentLine=61735007;
 //BA.debugLineNum = 61735007;BA.debugLine="Wait For (sf2) FTP_ListCompleted (ServerPath As S";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadfileswithftp"), _sf2);
this.state = 115;
return;
case 115:
//C
this.state = 53;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=61735008;
 //BA.debugLineNum = 61735008;BA.debugLine="If Success Then";
if (true) break;

case 53:
//if
this.state = 74;
if (_success) { 
this.state = 55;
}else {
this.state = 73;
}if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=61735010;
 //BA.debugLineNum = 61735010;BA.debugLine="For l2 = 0 To Files.Length - 1";
if (true) break;

case 56:
//for
this.state = 59;
step64 = 1;
limit64 = (int) (_files.length-1);
_l2 = (int) (0) ;
this.state = 116;
if (true) break;

case 116:
//C
this.state = 59;
if ((step64 > 0 && _l2 <= limit64) || (step64 < 0 && _l2 >= limit64)) this.state = 58;
if (true) break;

case 117:
//C
this.state = 116;
_l2 = ((int)(0 + _l2 + step64)) ;
if (true) break;

case 58:
//C
this.state = 117;
RDebugUtils.currentLine=61735011;
 //BA.debugLineNum = 61735011;BA.debugLine="Log($\"/docs/templates/ : ${Files(l2).Name}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("661735011",("/docs/templates/ : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_files[_l2].getName()))+""),0);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=61735014;
 //BA.debugLineNum = 61735014;BA.debugLine="Dim LMDate2 As Long = Utils.GetLastNDaysLong(1)";
_lmdate2 = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
RDebugUtils.currentLine=61735019;
 //BA.debugLineNum = 61735019;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 60:
//if
this.state = 71;
if ((_files.length>=1)) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=61735020;
 //BA.debugLineNum = 61735020;BA.debugLine="FTPFileList2.Initialize";
parent.mostCurrent._ftpfilelist2.Initialize();
RDebugUtils.currentLine=61735021;
 //BA.debugLineNum = 61735021;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 63:
//for
this.state = 70;
step70 = 1;
limit70 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 118;
if (true) break;

case 118:
//C
this.state = 70;
if ((step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70)) this.state = 65;
if (true) break;

case 119:
//C
this.state = 118;
_i = ((int)(0 + _i + step70)) ;
if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=61735022;
 //BA.debugLineNum = 61735022;BA.debugLine="Dim fName2 As String = Files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=61735023;
 //BA.debugLineNum = 61735023;BA.debugLine="If (fName2.EndsWith(\".png\")) Or (fName2.EndsWi";
if (true) break;

case 66:
//if
this.state = 69;
if ((_fname2.endsWith(".png")) || (_fname2.endsWith(".jpg")) || (_fname2.endsWith(".jpeg")) || (_fname2.endsWith(".pdf")) || (_fname2.endsWith(".doc")) || (_fname2.endsWith(".docx")) || (_fname2.endsWith(".xls")) || (_fname2.endsWith(".xlsx")) || (_fname2.endsWith(".ppt")) || (_fname2.endsWith(".pptx")) || (_fname2.startsWith("REPORT"))==anywheresoftware.b4a.keywords.Common.False || (_fname2.startsWith("dictionary")) || (_fname2.endsWith(".html"))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=61735028;
 //BA.debugLineNum = 61735028;BA.debugLine="FTPFileList2.Add(Files(i).Name)";
parent.mostCurrent._ftpfilelist2.Add((Object)(_files[_i].getName()));
 if (true) break;

case 69:
//C
this.state = 119;
;
 if (true) break;
if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = 74;
;
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=61735033;
 //BA.debugLineNum = 61735033;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"DownloadFilesW";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","DownloadFilesWithFTP","error getting files list from /docs/templates/");
RDebugUtils.currentLine=61735034;
 //BA.debugLineNum = 61735034;BA.debugLine="CURRENT_COUNTER2 = END_COUNTER2";
_current_counter2 = _end_counter2;
 if (true) break;
;
RDebugUtils.currentLine=61735038;
 //BA.debugLineNum = 61735038;BA.debugLine="If (FTPFileList2.IsInitialized) Then";

case 74:
//if
this.state = 100;
if ((parent.mostCurrent._ftpfilelist2.IsInitialized())) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=61735039;
 //BA.debugLineNum = 61735039;BA.debugLine="If (FTPFileList2.Size>=1) Then";
if (true) break;

case 77:
//if
this.state = 99;
if ((parent.mostCurrent._ftpfilelist2.getSize()>=1)) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=61735040;
 //BA.debugLineNum = 61735040;BA.debugLine="END_COUNTER2 = FTPFileList2.Size-1";
_end_counter2 = (int) (parent.mostCurrent._ftpfilelist2.getSize()-1);
RDebugUtils.currentLine=61735041;
 //BA.debugLineNum = 61735041;BA.debugLine="For i=0 To FTPFileList2.Size-1";
if (true) break;

case 80:
//for
this.state = 98;
step84 = 1;
limit84 = (int) (parent.mostCurrent._ftpfilelist2.getSize()-1);
_i = (int) (0) ;
this.state = 120;
if (true) break;

case 120:
//C
this.state = 98;
if ((step84 > 0 && _i <= limit84) || (step84 < 0 && _i >= limit84)) this.state = 82;
if (true) break;

case 121:
//C
this.state = 120;
_i = ((int)(0 + _i + step84)) ;
if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=61735042;
 //BA.debugLineNum = 61735042;BA.debugLine="Dim fName2 As String = FTPFileList2.Get(i)";
_fname2 = BA.ObjectToString(parent.mostCurrent._ftpfilelist2.Get(_i));
RDebugUtils.currentLine=61735044;
 //BA.debugLineNum = 61735044;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("661735044",_fname2,0);
RDebugUtils.currentLine=61735045;
 //BA.debugLineNum = 61735045;BA.debugLine="Try";
if (true) break;

case 83:
//try
this.state = 94;
this.catchState = 93;
this.state = 85;
if (true) break;

case 85:
//C
this.state = 86;
this.catchState = 93;
RDebugUtils.currentLine=61735046;
 //BA.debugLineNum = 61735046;BA.debugLine="Dim sf2 As Object = GlobalFTP.DownloadFile(\"/";
_sf2 = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=61735047;
 //BA.debugLineNum = 61735047;BA.debugLine="Wait For (sf2) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadfileswithftp"), _sf2);
this.state = 122;
return;
case 122:
//C
this.state = 86;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61735049;
 //BA.debugLineNum = 61735049;BA.debugLine="If Success Then";
if (true) break;

case 86:
//if
this.state = 91;
if (_success) { 
this.state = 88;
}else {
this.state = 90;
}if (true) break;

case 88:
//C
this.state = 91;
RDebugUtils.currentLine=61735050;
 //BA.debugLineNum = 61735050;BA.debugLine="Log(\"/docs/templates/ : file was download su";
anywheresoftware.b4a.keywords.Common.LogImpl("661735050","/docs/templates/ : file was download successfully",0);
 if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=61735052;
 //BA.debugLineNum = 61735052;BA.debugLine="Log(\"/docs/templates/ : Error downloading fi";
anywheresoftware.b4a.keywords.Common.LogImpl("661735052","/docs/templates/ : Error downloading file",0);
 if (true) break;

case 91:
//C
this.state = 94;
;
 if (true) break;

case 93:
//C
this.state = 94;
this.catchState = 0;
RDebugUtils.currentLine=61735056;
 //BA.debugLineNum = 61735056;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661735056",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=61735059;
 //BA.debugLineNum = 61735059;BA.debugLine="If (FTPFileList2.Size-1 > CURRENT_COUNTER2) Th";

case 94:
//if
this.state = 97;
this.catchState = 0;
if ((parent.mostCurrent._ftpfilelist2.getSize()-1>_current_counter2)) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=61735060;
 //BA.debugLineNum = 61735060;BA.debugLine="CURRENT_COUNTER2 = CURRENT_COUNTER2+1";
_current_counter2 = (int) (_current_counter2+1);
 if (true) break;

case 97:
//C
this.state = 121;
;
 if (true) break;
if (true) break;

case 98:
//C
this.state = 99;
;
 if (true) break;

case 99:
//C
this.state = 100;
;
 if (true) break;

case 100:
//C
this.state = 101;
;
RDebugUtils.currentLine=61735072;
 //BA.debugLineNum = 61735072;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61735077;
 //BA.debugLineNum = 61735077;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
if (true) break;

case 101:
//if
this.state = 106;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ )) { 
this.state = 103;
}else {
this.state = 105;
}if (true) break;

case 103:
//C
this.state = 106;
RDebugUtils.currentLine=61735078;
 //BA.debugLineNum = 61735078;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ );
 if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=61735080;
 //BA.debugLineNum = 61735080;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 if (true) break;

case 106:
//C
this.state = -1;
;
RDebugUtils.currentLine=61735083;
 //BA.debugLineNum = 61735083;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=61735084;
 //BA.debugLineNum = 61735084;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfiles(String _fileinfo,String _filename,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadsqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadsqlfiles", new Object[] {_fileinfo,_filename,_isupdate}));}
ResumableSub_DownloadSqlFiles rsub = new ResumableSub_DownloadSqlFiles(null,_fileinfo,_filename,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSqlFiles extends BA.ResumableSub {
public ResumableSub_DownloadSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,String _fileinfo,String _filename,boolean _isupdate) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _fileinfo;
String _filename;
boolean _isupdate;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
int _result = 0;
int _i = 0;
String _filen = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _finish = false;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61014018;
 //BA.debugLineNum = 61014018;BA.debugLine="SqlFilesTotal = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=61014019;
 //BA.debugLineNum = 61014019;BA.debugLine="Dim res As ResumableSub = GetFirstInstalSqlFilesT";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _getfirstinstalsqlfilestotal(_fileinfo,_isupdate);
RDebugUtils.currentLine=61014020;
 //BA.debugLineNum = 61014020;BA.debugLine="Wait For(res) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfiles"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=61014021;
 //BA.debugLineNum = 61014021;BA.debugLine="SqlFilesTotal = result";
parent._sqlfilestotal = _result;
RDebugUtils.currentLine=61014023;
 //BA.debugLineNum = 61014023;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61014024;
 //BA.debugLineNum = 61014024;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=61014025;
 //BA.debugLineNum = 61014025;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=61014026;
 //BA.debugLineNum = 61014026;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=61014027;
 //BA.debugLineNum = 61014027;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFTP";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadsqlfilewithftp(_filen);
RDebugUtils.currentLine=61014028;
 //BA.debugLineNum = 61014028;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfiles"), _rs);
this.state = 12;
return;
case 12:
//C
this.state = 11;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=61014029;
 //BA.debugLineNum = 61014029;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
RDebugUtils.currentLine=61014030;
 //BA.debugLineNum = 61014030;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfiles"),(int) (1));
this.state = 13;
return;
case 13:
//C
this.state = 11;
;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=61014032;
 //BA.debugLineNum = 61014032;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=61014035;
 //BA.debugLineNum = 61014035;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61014036;
 //BA.debugLineNum = 61014036;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getfirstinstalsqlfilestotal(String _filename,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getfirstinstalsqlfilestotal", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getfirstinstalsqlfilestotal", new Object[] {_filename,_isupdate}));}
ResumableSub_GetFirstInstalSqlFilesTotal rsub = new ResumableSub_GetFirstInstalSqlFilesTotal(null,_filename,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetFirstInstalSqlFilesTotal extends BA.ResumableSub {
public ResumableSub_GetFirstInstalSqlFilesTotal(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename,boolean _isupdate) {
this.parent = parent;
this._filename = _filename;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename;
boolean _isupdate;
int _trycount = 0;
boolean _dotry = false;
int _total = 0;
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;
String _date = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
int step42;
int limit42;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61603842;
 //BA.debugLineNum = 61603842;BA.debugLine="TagCodesString = \"\"";
parent.mostCurrent._tagcodesstring = "";
RDebugUtils.currentLine=61603843;
 //BA.debugLineNum = 61603843;BA.debugLine="TagCodesTasksString = \"\"";
parent.mostCurrent._tagcodestasksstring = "";
RDebugUtils.currentLine=61603844;
 //BA.debugLineNum = 61603844;BA.debugLine="TagCodesContactsString = \"\"";
parent.mostCurrent._tagcodescontactsstring = "";
RDebugUtils.currentLine=61603845;
 //BA.debugLineNum = 61603845;BA.debugLine="TagCodesLocationsString = \"\"";
parent.mostCurrent._tagcodeslocationsstring = "";
RDebugUtils.currentLine=61603846;
 //BA.debugLineNum = 61603846;BA.debugLine="TagCodesTPRequestsString = \"\"";
parent.mostCurrent._tagcodestprequestsstring = "";
RDebugUtils.currentLine=61603847;
 //BA.debugLineNum = 61603847;BA.debugLine="TagCodesObjectsString = \"\"";
parent.mostCurrent._tagcodesobjectsstring = "";
RDebugUtils.currentLine=61603848;
 //BA.debugLineNum = 61603848;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=61603849;
 //BA.debugLineNum = 61603849;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61603850;
 //BA.debugLineNum = 61603850;BA.debugLine="Dim total As Int = -1";
_total = (int) (-1);
RDebugUtils.currentLine=61603851;
 //BA.debugLineNum = 61603851;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=61603852;
 //BA.debugLineNum = 61603852;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=61603853;
 //BA.debugLineNum = 61603853;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61603854;
 //BA.debugLineNum = 61603854;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=61603855;
 //BA.debugLineNum = 61603855;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=61603856;
 //BA.debugLineNum = 61603856;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=61603857;
 //BA.debugLineNum = 61603857;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=61603858;
 //BA.debugLineNum = 61603858;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 1:
//do while
this.state = 63;
while ((_dotry && (_trycount<3))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61603860;
 //BA.debugLineNum = 61603860;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61603861;
 //BA.debugLineNum = 61603861;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "getfirstinstalsqlfilestotal"), _sf);
this.state = 64;
return;
case 64:
//C
this.state = 4;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61603863;
 //BA.debugLineNum = 61603863;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 62;
if (_success) { 
this.state = 6;
}else {
this.state = 61;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61603865;
 //BA.debugLineNum = 61603865;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 59;
this.catchState = 58;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 58;
RDebugUtils.currentLine=61603866;
 //BA.debugLineNum = 61603866;BA.debugLine="Log(fileName & \" file was download successfull";
anywheresoftware.b4a.keywords.Common.LogImpl("661603866",_filename+" file was download successfully",0);
RDebugUtils.currentLine=61603868;
 //BA.debugLineNum = 61603868;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 10:
//if
this.state = 56;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 12;
}else {
this.state = 28;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=61603869;
 //BA.debugLineNum = 61603869;BA.debugLine="Dim JsonStruct As String = File.readstring(St";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61603870;
 //BA.debugLineNum = 61603870;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=61603871;
 //BA.debugLineNum = 61603871;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=61603872;
 //BA.debugLineNum = 61603872;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=61603873;
 //BA.debugLineNum = 61603873;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=61603874;
 //BA.debugLineNum = 61603874;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=61603875;
 //BA.debugLineNum = 61603875;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=61603880;
 //BA.debugLineNum = 61603880;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 13:
//for
this.state = 26;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group31 = _inserts;
index31 = 0;
groupLen31 = group31.getSize();
this.state = 65;
if (true) break;

case 65:
//C
this.state = 26;
if (index31 < groupLen31) {
this.state = 15;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group31.Get(index31)));}
if (true) break;

case 66:
//C
this.state = 65;
index31++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=61603881;
 //BA.debugLineNum = 61603881;BA.debugLine="Dim mastertagcode As String = colinserts.Get";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=61603882;
 //BA.debugLineNum = 61603882;BA.debugLine="Try";
if (true) break;

case 16:
//try
this.state = 21;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
RDebugUtils.currentLine=61603883;
 //BA.debugLineNum = 61603883;BA.debugLine="Dim childfield As String = colinserts.Get(\"";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 58;
RDebugUtils.currentLine=61603885;
 //BA.debugLineNum = 61603885;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=61603886;
 //BA.debugLineNum = 61603886;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603886",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 58;
;
RDebugUtils.currentLine=61603888;
 //BA.debugLineNum = 61603888;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=61603889;
 //BA.debugLineNum = 61603889;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=61603890;
 //BA.debugLineNum = 61603890;BA.debugLine="Dim table As String = colinserts.Get(\"table\"";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=61603892;
 //BA.debugLineNum = 61603892;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 22:
//for
this.state = 25;
step42 = 1;
limit42 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 25;
if ((step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42)) this.state = 24;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step42)) ;
if (true) break;

case 24:
//C
this.state = 68;
RDebugUtils.currentLine=61603893;
 //BA.debugLineNum = 61603893;BA.debugLine="Dim res As ResumableSub = DBStructures.Remo";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=61603894;
 //BA.debugLineNum = 61603894;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "getfirstinstalsqlfilestotal"), _res);
this.state = 69;
return;
case 69:
//C
this.state = 68;
_result = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 66;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 56;
;
RDebugUtils.currentLine=61603899;
 //BA.debugLineNum = 61603899;BA.debugLine="total = Totalfiles";
_total = _totalfiles;
RDebugUtils.currentLine=61603900;
 //BA.debugLineNum = 61603900;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=61603901;
 //BA.debugLineNum = 61603901;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61603902;
 //BA.debugLineNum = 61603902;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61603903;
 //BA.debugLineNum = 61603903;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61603904;
 //BA.debugLineNum = 61603904;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=61603905;
 //BA.debugLineNum = 61603905;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=61603909;
 //BA.debugLineNum = 61603909;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61603910;
 //BA.debugLineNum = 61603910;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61603911;
 //BA.debugLineNum = 61603911;BA.debugLine="total = List1.Get(0) ' Numero de ficheiros pa";
_total = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=61603912;
 //BA.debugLineNum = 61603912;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=61603913;
 //BA.debugLineNum = 61603913;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61603914;
 //BA.debugLineNum = 61603914;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61603915;
 //BA.debugLineNum = 61603915;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61603916;
 //BA.debugLineNum = 61603916;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=61603917;
 //BA.debugLineNum = 61603917;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61603919;
 //BA.debugLineNum = 61603919;BA.debugLine="If (isupdate) Then";
if (true) break;

case 29:
//if
this.state = 55;
if ((_isupdate)) { 
this.state = 31;
}else {
this.state = 54;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=61603920;
 //BA.debugLineNum = 61603920;BA.debugLine="TagCodesString = List1.Get(1)";
parent.mostCurrent._tagcodesstring = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=61603921;
 //BA.debugLineNum = 61603921;BA.debugLine="TagCodesTasksString = List1.Get(2)";
parent.mostCurrent._tagcodestasksstring = BA.ObjectToString(_list1.Get((int) (2)));
RDebugUtils.currentLine=61603922;
 //BA.debugLineNum = 61603922;BA.debugLine="TagCodesObjectsString = List1.Get(3)";
parent.mostCurrent._tagcodesobjectsstring = BA.ObjectToString(_list1.Get((int) (3)));
RDebugUtils.currentLine=61603923;
 //BA.debugLineNum = 61603923;BA.debugLine="Dim date As String = List1.Get(4)";
_date = BA.ObjectToString(_list1.Get((int) (4)));
RDebugUtils.currentLine=61603924;
 //BA.debugLineNum = 61603924;BA.debugLine="TagCodesTPRequestsString = List1.Get(5)";
parent.mostCurrent._tagcodestprequestsstring = BA.ObjectToString(_list1.Get((int) (5)));
RDebugUtils.currentLine=61603928;
 //BA.debugLineNum = 61603928;BA.debugLine="Try";
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
RDebugUtils.currentLine=61603929;
 //BA.debugLineNum = 61603929;BA.debugLine="TagCodesLocationsString = List1.Get(6)";
parent.mostCurrent._tagcodeslocationsstring = BA.ObjectToString(_list1.Get((int) (6)));
 if (true) break;

case 36:
//C
this.state = 37;
this.catchState = 58;
RDebugUtils.currentLine=61603931;
 //BA.debugLineNum = 61603931;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603931",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=61603934;
 //BA.debugLineNum = 61603934;BA.debugLine="Try";

case 37:
//try
this.state = 42;
this.catchState = 58;
this.catchState = 41;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 42;
this.catchState = 41;
RDebugUtils.currentLine=61603935;
 //BA.debugLineNum = 61603935;BA.debugLine="TagCodesContactsString = List1.Get(7)";
parent.mostCurrent._tagcodescontactsstring = BA.ObjectToString(_list1.Get((int) (7)));
 if (true) break;

case 41:
//C
this.state = 42;
this.catchState = 58;
RDebugUtils.currentLine=61603937;
 //BA.debugLineNum = 61603937;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603937",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=61603940;
 //BA.debugLineNum = 61603940;BA.debugLine="Try";

case 42:
//try
this.state = 47;
this.catchState = 58;
this.catchState = 46;
this.state = 44;
if (true) break;

case 44:
//C
this.state = 47;
this.catchState = 46;
RDebugUtils.currentLine=61603941;
 //BA.debugLineNum = 61603941;BA.debugLine="TagCodesWarehousesString = List1.Get(8)";
parent.mostCurrent._tagcodeswarehousesstring = BA.ObjectToString(_list1.Get((int) (8)));
 if (true) break;

case 46:
//C
this.state = 47;
this.catchState = 58;
RDebugUtils.currentLine=61603943;
 //BA.debugLineNum = 61603943;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603943",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=61603946;
 //BA.debugLineNum = 61603946;BA.debugLine="Try";

case 47:
//try
this.state = 52;
this.catchState = 58;
this.catchState = 51;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 52;
this.catchState = 51;
RDebugUtils.currentLine=61603947;
 //BA.debugLineNum = 61603947;BA.debugLine="TagCodesArticlesString = List1.Get(9)";
parent.mostCurrent._tagcodesarticlesstring = BA.ObjectToString(_list1.Get((int) (9)));
 if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 58;
RDebugUtils.currentLine=61603949;
 //BA.debugLineNum = 61603949;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603949",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 55;
this.catchState = 58;
;
RDebugUtils.currentLine=61603953;
 //BA.debugLineNum = 61603953;BA.debugLine="TagCodes.Initialize";
parent.mostCurrent._tagcodes.Initialize();
RDebugUtils.currentLine=61603954;
 //BA.debugLineNum = 61603954;BA.debugLine="TagCodes = Regex.Split(\"\\,\", TagCodesString)";
parent.mostCurrent._tagcodes = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\,",parent.mostCurrent._tagcodesstring));
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=61603956;
 //BA.debugLineNum = 61603956;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=61603957;
 //BA.debugLineNum = 61603957;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
 if (true) break;

case 55:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 59;
;
RDebugUtils.currentLine=61603962;
 //BA.debugLineNum = 61603962;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
 if (true) break;

case 58:
//C
this.state = 59;
this.catchState = 0;
RDebugUtils.currentLine=61603964;
 //BA.debugLineNum = 61603964;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603964",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=61603965;
 //BA.debugLineNum = 61603965;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
RDebugUtils.currentLine=61603966;
 //BA.debugLineNum = 61603966;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdateerroactualizar /*String*/ ));
 if (true) break;
if (true) break;

case 59:
//C
this.state = 62;
this.catchState = 0;
;
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=61603970;
 //BA.debugLineNum = 61603970;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603970",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=61603971;
 //BA.debugLineNum = 61603971;BA.debugLine="Log(\"Error downloading file \" & fileName)";
anywheresoftware.b4a.keywords.Common.LogImpl("661603971","Error downloading file "+_filename,0);
RDebugUtils.currentLine=61603972;
 //BA.debugLineNum = 61603972;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 62:
//C
this.state = 1;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
RDebugUtils.currentLine=61603976;
 //BA.debugLineNum = 61603976;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61603977;
 //BA.debugLineNum = 61603977;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
RDebugUtils.currentLine=61603978;
 //BA.debugLineNum = 61603978;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfilewithftp(String _filename) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadsqlfilewithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadsqlfilewithftp", new Object[] {_filename}));}
ResumableSub_DownloadSqlFileWithFTP rsub = new ResumableSub_DownloadSqlFileWithFTP(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSqlFileWithFTP extends BA.ResumableSub {
public ResumableSub_DownloadSqlFileWithFTP(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61669378;
 //BA.debugLineNum = 61669378;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=61669379;
 //BA.debugLineNum = 61669379;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=61669380;
 //BA.debugLineNum = 61669380;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61669381;
 //BA.debugLineNum = 61669381;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=61669382;
 //BA.debugLineNum = 61669382;BA.debugLine="Log(filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("661669382",_filename,0);
RDebugUtils.currentLine=61669383;
 //BA.debugLineNum = 61669383;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" & S";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61669384;
 //BA.debugLineNum = 61669384;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath A";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfilewithftp"), _sf);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61669386;
 //BA.debugLineNum = 61669386;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=61669387;
 //BA.debugLineNum = 61669387;BA.debugLine="Log(filename & \" file was download successfully\"";
anywheresoftware.b4a.keywords.Common.LogImpl("661669387",_filename+" file was download successfully",0);
RDebugUtils.currentLine=61669388;
 //BA.debugLineNum = 61669388;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61669389;
 //BA.debugLineNum = 61669389;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=61669391;
 //BA.debugLineNum = 61669391;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61669392;
 //BA.debugLineNum = 61669392;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61669393;
 //BA.debugLineNum = 61669393;BA.debugLine="Log(\"Error downloading file \" & filename)";
anywheresoftware.b4a.keywords.Common.LogImpl("661669393","Error downloading file "+_filename,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=61669395;
 //BA.debugLineNum = 61669395;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfilesfirstinstall(String _fileinfo,String _filename,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadsqlfilesfirstinstall", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadsqlfilesfirstinstall", new Object[] {_fileinfo,_filename,_isupdate}));}
ResumableSub_DownloadSqlFilesFirstInstall rsub = new ResumableSub_DownloadSqlFilesFirstInstall(null,_fileinfo,_filename,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSqlFilesFirstInstall extends BA.ResumableSub {
public ResumableSub_DownloadSqlFilesFirstInstall(xevolution.vrcg.devdemov2400.dataupdate parent,String _fileinfo,String _filename,boolean _isupdate) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _fileinfo;
String _filename;
boolean _isupdate;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
int _result = 0;
boolean _isfilesdeleted = false;
int _i = 0;
String _filen = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _finish = false;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61079554;
 //BA.debugLineNum = 61079554;BA.debugLine="SqlFilesTotal = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=61079555;
 //BA.debugLineNum = 61079555;BA.debugLine="Dim res As ResumableSub = GetFirstInstalSqlFilesT";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _getfirstinstalsqlfilestotal(_fileinfo,_isupdate);
RDebugUtils.currentLine=61079556;
 //BA.debugLineNum = 61079556;BA.debugLine="Wait For(res) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfilesfirstinstall"), _res);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=61079557;
 //BA.debugLineNum = 61079557;BA.debugLine="SqlFilesTotal = result";
parent._sqlfilestotal = _result;
RDebugUtils.currentLine=61079559;
 //BA.debugLineNum = 61079559;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(fileName";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _deletesqlfiles(_filename);
RDebugUtils.currentLine=61079560;
 //BA.debugLineNum = 61079560;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfilesfirstinstall"), _res);
this.state = 14;
return;
case 14:
//C
this.state = 1;
_isfilesdeleted = (Boolean) result[0];
;
RDebugUtils.currentLine=61079562;
 //BA.debugLineNum = 61079562;BA.debugLine="If(IsFilesDeleted) Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_isfilesdeleted)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61079564;
 //BA.debugLineNum = 61079564;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((parent._sqlfilestotal>0)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61079565;
 //BA.debugLineNum = 61079565;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 7:
//for
this.state = 10;
step9 = 1;
limit9 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 10;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 9;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 9:
//C
this.state = 16;
RDebugUtils.currentLine=61079566;
 //BA.debugLineNum = 61079566;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=61079567;
 //BA.debugLineNum = 61079567;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFT";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadsqlfilewithftp(_filen);
RDebugUtils.currentLine=61079568;
 //BA.debugLineNum = 61079568;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfilesfirstinstall"), _rs);
this.state = 17;
return;
case 17:
//C
this.state = 16;
_finish = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=61079571;
 //BA.debugLineNum = 61079571;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
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
RDebugUtils.currentLine=61079574;
 //BA.debugLineNum = 61079574;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61079575;
 //BA.debugLineNum = 61079575;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _downloadsqlfilesliteupdate(String _fileinfo,String _filename) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "downloadsqlfilesliteupdate", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "downloadsqlfilesliteupdate", new Object[] {_fileinfo,_filename}));}
ResumableSub_DownloadSqlFilesLiteUpdate rsub = new ResumableSub_DownloadSqlFilesLiteUpdate(null,_fileinfo,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DownloadSqlFilesLiteUpdate extends BA.ResumableSub {
public ResumableSub_DownloadSqlFilesLiteUpdate(xevolution.vrcg.devdemov2400.dataupdate parent,String _fileinfo,String _filename) {
this.parent = parent;
this._fileinfo = _fileinfo;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _fileinfo;
String _filename;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
int _result = 0;
int _i = 0;
String _filen = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _finish = false;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61997058;
 //BA.debugLineNum = 61997058;BA.debugLine="SqlFilesTotal = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=61997059;
 //BA.debugLineNum = 61997059;BA.debugLine="Dim res As ResumableSub = GetLiteUpdateInstalSqlF";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _getliteupdateinstalsqlfilestotal(_fileinfo);
RDebugUtils.currentLine=61997060;
 //BA.debugLineNum = 61997060;BA.debugLine="Wait For(res) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfilesliteupdate"), _res);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=61997061;
 //BA.debugLineNum = 61997061;BA.debugLine="SqlFilesTotal = result";
parent._sqlfilestotal = _result;
RDebugUtils.currentLine=61997063;
 //BA.debugLineNum = 61997063;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 8;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61997064;
 //BA.debugLineNum = 61997064;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=61997065;
 //BA.debugLineNum = 61997065;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=61997066;
 //BA.debugLineNum = 61997066;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithFTP";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadsqlfilewithftp(_filen);
RDebugUtils.currentLine=61997067;
 //BA.debugLineNum = 61997067;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "downloadsqlfilesliteupdate"), _rs);
this.state = 12;
return;
case 12:
//C
this.state = 11;
_finish = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=61997070;
 //BA.debugLineNum = 61997070;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=61997073;
 //BA.debugLineNum = 61997073;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61997074;
 //BA.debugLineNum = 61997074;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getliteupdateinstalsqlfilestotal(String _filename) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getliteupdateinstalsqlfilestotal", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getliteupdateinstalsqlfilestotal", new Object[] {_filename}));}
ResumableSub_GetLiteUpdateInstalSqlFilesTotal rsub = new ResumableSub_GetLiteUpdateInstalSqlFilesTotal(null,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetLiteUpdateInstalSqlFilesTotal extends BA.ResumableSub {
public ResumableSub_GetLiteUpdateInstalSqlFilesTotal(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename) {
this.parent = parent;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename;
int _trycount = 0;
boolean _dotry = false;
int _total = 0;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager _ctm = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _list1 = null;
String _lineone = "";
String _linetwo = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62062594;
 //BA.debugLineNum = 62062594;BA.debugLine="TagCodesString = \"\"";
parent.mostCurrent._tagcodesstring = "";
RDebugUtils.currentLine=62062595;
 //BA.debugLineNum = 62062595;BA.debugLine="TagCodesTasksString = \"\"";
parent.mostCurrent._tagcodestasksstring = "";
RDebugUtils.currentLine=62062596;
 //BA.debugLineNum = 62062596;BA.debugLine="TagCodesTPRequestsString = \"\"";
parent.mostCurrent._tagcodestprequestsstring = "";
RDebugUtils.currentLine=62062597;
 //BA.debugLineNum = 62062597;BA.debugLine="TagCodesObjectsString = \"\"";
parent.mostCurrent._tagcodesobjectsstring = "";
RDebugUtils.currentLine=62062598;
 //BA.debugLineNum = 62062598;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=62062599;
 //BA.debugLineNum = 62062599;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=62062600;
 //BA.debugLineNum = 62062600;BA.debugLine="Dim total As Int = -1";
_total = (int) (-1);
RDebugUtils.currentLine=62062601;
 //BA.debugLineNum = 62062601;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=62062602;
 //BA.debugLineNum = 62062602;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=62062603;
 //BA.debugLineNum = 62062603;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=62062604;
 //BA.debugLineNum = 62062604;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=62062605;
 //BA.debugLineNum = 62062605;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=62062606;
 //BA.debugLineNum = 62062606;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=62062607;
 //BA.debugLineNum = 62062607;BA.debugLine="GlobalFTP.TimeoutMs =240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=62062608;
 //BA.debugLineNum = 62062608;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 1:
//do while
this.state = 16;
while ((_dotry && (_trycount<3))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=62062609;
 //BA.debugLineNum = 62062609;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=62062610;
 //BA.debugLineNum = 62062610;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "getliteupdateinstalsqlfilestotal"), _sf);
this.state = 17;
return;
case 17:
//C
this.state = 4;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=62062612;
 //BA.debugLineNum = 62062612;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_success) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=62062614;
 //BA.debugLineNum = 62062614;BA.debugLine="Try";
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
RDebugUtils.currentLine=62062615;
 //BA.debugLineNum = 62062615;BA.debugLine="Log(fileName & \" file was download successfull";
anywheresoftware.b4a.keywords.Common.LogImpl("662062615",_filename+" file was download successfully",0);
RDebugUtils.currentLine=62062616;
 //BA.debugLineNum = 62062616;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62062617;
 //BA.debugLineNum = 62062617;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedF";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=62062618;
 //BA.debugLineNum = 62062618;BA.debugLine="total = List1.Get(0)";
_total = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=62062619;
 //BA.debugLineNum = 62062619;BA.debugLine="Dim LineOne As String = List1.Get(1)";
_lineone = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=62062620;
 //BA.debugLineNum = 62062620;BA.debugLine="Dim LineTwo As String = List1.Get(2)";
_linetwo = BA.ObjectToString(_list1.Get((int) (2)));
RDebugUtils.currentLine=62062622;
 //BA.debugLineNum = 62062622;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=62062624;
 //BA.debugLineNum = 62062624;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=62062626;
 //BA.debugLineNum = 62062626;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662062626",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=62062627;
 //BA.debugLineNum = 62062627;BA.debugLine="trycount = trycount +1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 0;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=62062631;
 //BA.debugLineNum = 62062631;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662062631",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=62062632;
 //BA.debugLineNum = 62062632;BA.debugLine="Log(\"Error downloading file \" & fileName)";
anywheresoftware.b4a.keywords.Common.LogImpl("662062632","Error downloading file "+_filename,0);
RDebugUtils.currentLine=62062633;
 //BA.debugLineNum = 62062633;BA.debugLine="trycount = trycount +1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 15:
//C
this.state = 1;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=62062638;
 //BA.debugLineNum = 62062638;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=62062639;
 //BA.debugLineNum = 62062639;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
RDebugUtils.currentLine=62062640;
 //BA.debugLineNum = 62062640;BA.debugLine="End Sub";
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
public static String  _duprogressbar2(int _maxval,int _currentval) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "duprogressbar2", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "duprogressbar2", new Object[] {_maxval,_currentval}));}
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Sub DUProgressBar2(MaxVal As Int, CurrentVal As In";
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="Dim CurrentVal As Int = (100 * CurrentVal / MaxVa";
_currentval = (int) ((100*_currentval/(double)_maxval));
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="DataUpdateProgressBar2.Progress = CurrentVal";
mostCurrent._dataupdateprogressbar2.setProgress(_currentval);
RDebugUtils.currentLine=60162051;
 //BA.debugLineNum = 60162051;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _duremovealllocalinfoandsqlfiles() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "duremovealllocalinfoandsqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "duremovealllocalinfoandsqlfiles", null));}
ResumableSub_DURemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_DURemoveAllLocalInfoAndSqlFiles(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DURemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_DURemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
boolean _locares = false;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _files = null;
String _f = "";
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60948482;
 //BA.debugLineNum = 60948482;BA.debugLine="Dim LocaRes As Boolean = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60948483;
 //BA.debugLineNum = 60948483;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "duremovealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=60948484;
 //BA.debugLineNum = 60948484;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=60948485;
 //BA.debugLineNum = 60948485;BA.debugLine="For Each F As String In Files";
if (true) break;

case 4:
//for
this.state = 15;
group4 = _files;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 38;
if (true) break;

case 38:
//C
this.state = 15;
if (index4 < groupLen4) {
this.state = 6;
_f = BA.ObjectToString(group4.Get(index4));}
if (true) break;

case 39:
//C
this.state = 38;
index4++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60948486;
 //BA.debugLineNum = 60948486;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") Then";
if (true) break;

case 7:
//if
this.state = 14;
if (_f.toLowerCase().endsWith(".info")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=60948487;
 //BA.debugLineNum = 60948487;BA.debugLine="If Not(F.ToLowerCase.StartsWith(\"firstinstall\"";
if (true) break;

case 10:
//if
this.state = 13;
if (anywheresoftware.b4a.keywords.Common.Not(_f.toLowerCase().startsWith("firstinstall"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=60948488;
 //BA.debugLineNum = 60948488;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_f);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 39;
;
 if (true) break;
if (true) break;

case 15:
//C
this.state = 18;
;
RDebugUtils.currentLine=60948492;
 //BA.debugLineNum = 60948492;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=60948494;
 //BA.debugLineNum = 60948494;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=60948497;
 //BA.debugLineNum = 60948497;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "duremovealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 40;
return;
case 40:
//C
this.state = 19;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=60948498;
 //BA.debugLineNum = 60948498;BA.debugLine="If Success Then";
if (true) break;

case 19:
//if
this.state = 36;
if (_success) { 
this.state = 21;
}else {
this.state = 35;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=60948499;
 //BA.debugLineNum = 60948499;BA.debugLine="For Each F As String In Files";
if (true) break;

case 22:
//for
this.state = 33;
group17 = _files;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 33;
if (index17 < groupLen17) {
this.state = 24;
_f = BA.ObjectToString(group17.Get(index17));}
if (true) break;

case 42:
//C
this.state = 41;
index17++;
if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=60948500;
 //BA.debugLineNum = 60948500;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") Then";
if (true) break;

case 25:
//if
this.state = 32;
if (_f.toLowerCase().endsWith(".sql")) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=60948501;
 //BA.debugLineNum = 60948501;BA.debugLine="If Not(F.ToLowerCase.StartsWith(\"firstinstall\"";
if (true) break;

case 28:
//if
this.state = 31;
if (anywheresoftware.b4a.keywords.Common.Not(_f.toLowerCase().startsWith("firstinstall"))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=60948502;
 //BA.debugLineNum = 60948502;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_f);
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 42;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 36;
;
RDebugUtils.currentLine=60948506;
 //BA.debugLineNum = 60948506;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=60948508;
 //BA.debugLineNum = 60948508;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=60948511;
 //BA.debugLineNum = 60948511;BA.debugLine="Return LocaRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_locares));return;};
RDebugUtils.currentLine=60948513;
 //BA.debugLineNum = 60948513;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _executesqlfiles(String _filename,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "executesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "executesqlfiles", new Object[] {_filename,_isupdate}));}
ResumableSub_ExecuteSqlFiles rsub = new ResumableSub_ExecuteSqlFiles(null,_filename,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_ExecuteSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename,boolean _isupdate) {
this.parent = parent;
this._filename = _filename;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename;
boolean _isupdate;
int _i = 0;
String _filen = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
int _totallinesofscripts = 0;
int _n = 0;
String _sval = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _finish = false;
int step2;
int limit2;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61145089;
 //BA.debugLineNum = 61145089;BA.debugLine="If(SqlFilesTotal > 0)Then";
if (true) break;

case 1:
//if
this.state = 24;
if ((parent._sqlfilestotal>0)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 4:
//for
this.state = 23;
step2 = 1;
limit2 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 23;
if ((step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2)) this.state = 6;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step2)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61145091;
 //BA.debugLineNum = 61145091;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=61145092;
 //BA.debugLineNum = 61145092;BA.debugLine="Dim fileN As String = $\"${fileName}${i}.sql\"$";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=61145093;
 //BA.debugLineNum = 61145093;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61145095;
 //BA.debugLineNum = 61145095;BA.debugLine="Try";
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
RDebugUtils.currentLine=61145096;
 //BA.debugLineNum = 61145096;BA.debugLine="List1 = File.ReadList(Starter.Provider.SharedF";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=61145098;
 //BA.debugLineNum = 61145098;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661145098",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=61145101;
 //BA.debugLineNum = 61145101;BA.debugLine="DataUpdateLabelTarefa.Visible = True";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61145102;
 //BA.debugLineNum = 61145102;BA.debugLine="DataUpdateProgressBar2.Visible = True";
parent.mostCurrent._dataupdateprogressbar2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61145104;
 //BA.debugLineNum = 61145104;BA.debugLine="If (List1.IsInitialized) Then";
if (true) break;

case 13:
//if
this.state = 22;
if ((_list1.IsInitialized())) { 
this.state = 15;
}else {
this.state = 21;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=61145105;
 //BA.debugLineNum = 61145105;BA.debugLine="Dim TotalLinesOfScripts As Int = List1.Size";
_totallinesofscripts = _list1.getSize();
RDebugUtils.currentLine=61145106;
 //BA.debugLineNum = 61145106;BA.debugLine="For n = 0 To List1.Size - 1";
if (true) break;

case 16:
//for
this.state = 19;
step15 = 1;
limit15 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 27;
if (true) break;

case 27:
//C
this.state = 19;
if ((step15 > 0 && _n <= limit15) || (step15 < 0 && _n >= limit15)) this.state = 18;
if (true) break;

case 28:
//C
this.state = 27;
_n = ((int)(0 + _n + step15)) ;
if (true) break;

case 18:
//C
this.state = 28;
RDebugUtils.currentLine=61145107;
 //BA.debugLineNum = 61145107;BA.debugLine="DataUpdateLabelTarefa.Text = ShareCode.MsgExe";
parent.mostCurrent._dataupdatelabeltarefa.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totallinesofscripts))+"")));
RDebugUtils.currentLine=61145108;
 //BA.debugLineNum = 61145108;BA.debugLine="Dim sval As String = List1.Get(n)";
_sval = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=61145109;
 //BA.debugLineNum = 61145109;BA.debugLine="Dim rs As ResumableSub = MakeExecuteSqlFiles(";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _makeexecutesqlfiles(_sval,_isupdate);
RDebugUtils.currentLine=61145110;
 //BA.debugLineNum = 61145110;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "executesqlfiles"), _rs);
this.state = 29;
return;
case 29:
//C
this.state = 28;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=61145111;
 //BA.debugLineNum = 61145111;BA.debugLine="DUProgressBar2(TotalLinesOfScripts,n)";
_duprogressbar2(_totallinesofscripts,_n);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=61145114;
 //BA.debugLineNum = 61145114;BA.debugLine="Utils.logError(\"Update SQL\", ShareCode.SESS_OP";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Update SQL",parent.mostCurrent._sharecode._sess_oper_user /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql"));
 if (true) break;

case 22:
//C
this.state = 26;
;
RDebugUtils.currentLine=61145116;
 //BA.debugLineNum = 61145116;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
RDebugUtils.currentLine=61145117;
 //BA.debugLineNum = 61145117;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "executesqlfiles"),(int) (1));
this.state = 30;
return;
case 30:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=61145119;
 //BA.debugLineNum = 61145119;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=61145120;
 //BA.debugLineNum = 61145120;BA.debugLine="DataUpdateProgressBar2.Visible = False";
parent.mostCurrent._dataupdateprogressbar2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=61145121;
 //BA.debugLineNum = 61145121;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=61145123;
 //BA.debugLineNum = 61145123;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61145124;
 //BA.debugLineNum = 61145124;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _makeexecutesqlfiles(String _script,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makeexecutesqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "makeexecutesqlfiles", new Object[] {_script,_isupdate}));}
ResumableSub_MakeExecuteSqlFiles rsub = new ResumableSub_MakeExecuteSqlFiles(null,_script,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MakeExecuteSqlFiles extends BA.ResumableSub {
public ResumableSub_MakeExecuteSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent,String _script,boolean _isupdate) {
this.parent = parent;
this._script = _script;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _script;
boolean _isupdate;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rbackupanddeletetypes = null;
boolean _deletedtables = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61210631;
 //BA.debugLineNum = 61210631;BA.debugLine="If (Utils.NNE(script)) Then";
if (true) break;

case 1:
//if
this.state = 144;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_script))) { 
this.state = 3;
}else {
this.state = 143;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61210632;
 //BA.debugLineNum = 61210632;BA.debugLine="If ((isupdate) And (script.ToLowerCase.StartsWit";
if (true) break;

case 4:
//if
this.state = 135;
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_requests")))) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=61210641;
 //BA.debugLineNum = 61210641;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_tasks")))) { 
this.state = 22;
}else 
{RDebugUtils.currentLine=61210650;
 //BA.debugLineNum = 61210650;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_typerequests")))) { 
this.state = 38;
}else 
{RDebugUtils.currentLine=61210659;
 //BA.debugLineNum = 61210659;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_objects")))) { 
this.state = 54;
}else 
{RDebugUtils.currentLine=61210668;
 //BA.debugLineNum = 61210668;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_locations")))) { 
this.state = 70;
}else 
{RDebugUtils.currentLine=61210677;
 //BA.debugLineNum = 61210677;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_contacts")))) { 
this.state = 86;
}else 
{RDebugUtils.currentLine=61210686;
 //BA.debugLineNum = 61210686;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_warehouses")))) { 
this.state = 102;
}else 
{RDebugUtils.currentLine=61210695;
 //BA.debugLineNum = 61210695;BA.debugLine="Else If ((isupdate) And (script.ToLowerCase.Star";
if (((_isupdate) && (_script.toLowerCase().startsWith("insert into `dta_articles")))) { 
this.state = 118;
}else 
{RDebugUtils.currentLine=61210704;
 //BA.debugLineNum = 61210704;BA.debugLine="Else If ((isupdate) And script.ToLowerCase.Start";
if (((_isupdate) && _script.toLowerCase().startsWith("insert into `type_")) && (parent.mostCurrent._sharecode._types_alreadydeleted /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False)) { 
this.state = 134;
}}}}}}}}}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61210633;
 //BA.debugLineNum = 61210633;BA.debugLine="If TagCodesString = \"_\" Then TagCodesString = \"";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent.mostCurrent._tagcodesstring).equals("_")) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
parent.mostCurrent._tagcodesstring = "";
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=61210634;
 //BA.debugLineNum = 61210634;BA.debugLine="If (Utils.NNE(TagCodesString)) Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodesstring))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=61210635;
 //BA.debugLineNum = 61210635;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteF";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletefromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodesstring);
RDebugUtils.currentLine=61210636;
 //BA.debugLineNum = 61210636;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 145;
return;
case 145:
//C
this.state = 16;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210637;
 //BA.debugLineNum = 61210637;BA.debugLine="If(result)Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((_result)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=61210638;
 //BA.debugLineNum = 61210638;BA.debugLine="TagCodesString = \"\"";
parent.mostCurrent._tagcodesstring = "";
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = 135;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=61210642;
 //BA.debugLineNum = 61210642;BA.debugLine="If TagCodesTasksString =\"_\" Then TagCodesTasksS";
if (true) break;

case 23:
//if
this.state = 28;
if ((parent.mostCurrent._tagcodestasksstring).equals("_")) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
parent.mostCurrent._tagcodestasksstring = "";
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=61210643;
 //BA.debugLineNum = 61210643;BA.debugLine="If (Utils.NNE(TagCodesTasksString)) Then";
if (true) break;

case 29:
//if
this.state = 36;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodestasksstring))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=61210644;
 //BA.debugLineNum = 61210644;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteT";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletetasksfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodestasksstring);
RDebugUtils.currentLine=61210645;
 //BA.debugLineNum = 61210645;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 146;
return;
case 146:
//C
this.state = 32;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210646;
 //BA.debugLineNum = 61210646;BA.debugLine="If(result)Then";
if (true) break;

case 32:
//if
this.state = 35;
if ((_result)) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=61210647;
 //BA.debugLineNum = 61210647;BA.debugLine="TagCodesTasksString = \"\"";
parent.mostCurrent._tagcodestasksstring = "";
 if (true) break;

case 35:
//C
this.state = 36;
;
 if (true) break;

case 36:
//C
this.state = 135;
;
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=61210651;
 //BA.debugLineNum = 61210651;BA.debugLine="If TagCodesTPRequestsString = \"_\" Then TagCodes";
if (true) break;

case 39:
//if
this.state = 44;
if ((parent.mostCurrent._tagcodestprequestsstring).equals("_")) { 
this.state = 41;
;}if (true) break;

case 41:
//C
this.state = 44;
parent.mostCurrent._tagcodestprequestsstring = "";
if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=61210652;
 //BA.debugLineNum = 61210652;BA.debugLine="If (Utils.NNE(TagCodesTPRequestsString)) Then";
if (true) break;

case 45:
//if
this.state = 52;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodestprequestsstring))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=61210653;
 //BA.debugLineNum = 61210653;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteT";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletetprequestsfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodestprequestsstring);
RDebugUtils.currentLine=61210654;
 //BA.debugLineNum = 61210654;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 147;
return;
case 147:
//C
this.state = 48;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210655;
 //BA.debugLineNum = 61210655;BA.debugLine="If(result)Then";
if (true) break;

case 48:
//if
this.state = 51;
if ((_result)) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=61210656;
 //BA.debugLineNum = 61210656;BA.debugLine="TagCodesTPRequestsString = \"\"";
parent.mostCurrent._tagcodestprequestsstring = "";
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 135;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=61210660;
 //BA.debugLineNum = 61210660;BA.debugLine="If TagCodesObjectsString = \"_\" Then TagCodesObj";
if (true) break;

case 55:
//if
this.state = 60;
if ((parent.mostCurrent._tagcodesobjectsstring).equals("_")) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
parent.mostCurrent._tagcodesobjectsstring = "";
if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=61210661;
 //BA.debugLineNum = 61210661;BA.debugLine="If (Utils.NNE(TagCodesObjectsString)) Then";
if (true) break;

case 61:
//if
this.state = 68;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodesobjectsstring))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=61210662;
 //BA.debugLineNum = 61210662;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteO";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deleteobjectsfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodesobjectsstring);
RDebugUtils.currentLine=61210663;
 //BA.debugLineNum = 61210663;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 148;
return;
case 148:
//C
this.state = 64;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210664;
 //BA.debugLineNum = 61210664;BA.debugLine="If(result)Then";
if (true) break;

case 64:
//if
this.state = 67;
if ((_result)) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=61210665;
 //BA.debugLineNum = 61210665;BA.debugLine="TagCodesObjectsString = \"\"";
parent.mostCurrent._tagcodesobjectsstring = "";
 if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 135;
;
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=61210669;
 //BA.debugLineNum = 61210669;BA.debugLine="If TagCodesLocationsString = \"_\" Then TagCodesL";
if (true) break;

case 71:
//if
this.state = 76;
if ((parent.mostCurrent._tagcodeslocationsstring).equals("_")) { 
this.state = 73;
;}if (true) break;

case 73:
//C
this.state = 76;
parent.mostCurrent._tagcodeslocationsstring = "";
if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=61210670;
 //BA.debugLineNum = 61210670;BA.debugLine="If (Utils.NNE(TagCodesLocationsString)) Then";
if (true) break;

case 77:
//if
this.state = 84;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodeslocationsstring))) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=61210671;
 //BA.debugLineNum = 61210671;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteL";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletelocationsfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodeslocationsstring);
RDebugUtils.currentLine=61210672;
 //BA.debugLineNum = 61210672;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 149;
return;
case 149:
//C
this.state = 80;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210673;
 //BA.debugLineNum = 61210673;BA.debugLine="If(result)Then";
if (true) break;

case 80:
//if
this.state = 83;
if ((_result)) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=61210674;
 //BA.debugLineNum = 61210674;BA.debugLine="TagCodesLocationsString = \"\"";
parent.mostCurrent._tagcodeslocationsstring = "";
 if (true) break;

case 83:
//C
this.state = 84;
;
 if (true) break;

case 84:
//C
this.state = 135;
;
 if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=61210678;
 //BA.debugLineNum = 61210678;BA.debugLine="If TagCodesContactsString = \"_\" Then TagCodesCo";
if (true) break;

case 87:
//if
this.state = 92;
if ((parent.mostCurrent._tagcodescontactsstring).equals("_")) { 
this.state = 89;
;}if (true) break;

case 89:
//C
this.state = 92;
parent.mostCurrent._tagcodescontactsstring = "";
if (true) break;

case 92:
//C
this.state = 93;
;
RDebugUtils.currentLine=61210679;
 //BA.debugLineNum = 61210679;BA.debugLine="If (Utils.NNE(TagCodesContactsString)) Then";
if (true) break;

case 93:
//if
this.state = 100;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodescontactsstring))) { 
this.state = 95;
}if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=61210680;
 //BA.debugLineNum = 61210680;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteC";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletecontactsfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodescontactsstring);
RDebugUtils.currentLine=61210681;
 //BA.debugLineNum = 61210681;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 150;
return;
case 150:
//C
this.state = 96;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210682;
 //BA.debugLineNum = 61210682;BA.debugLine="If(result)Then";
if (true) break;

case 96:
//if
this.state = 99;
if ((_result)) { 
this.state = 98;
}if (true) break;

case 98:
//C
this.state = 99;
RDebugUtils.currentLine=61210683;
 //BA.debugLineNum = 61210683;BA.debugLine="TagCodesContactsString = \"\"";
parent.mostCurrent._tagcodescontactsstring = "";
 if (true) break;

case 99:
//C
this.state = 100;
;
 if (true) break;

case 100:
//C
this.state = 135;
;
 if (true) break;

case 102:
//C
this.state = 103;
RDebugUtils.currentLine=61210687;
 //BA.debugLineNum = 61210687;BA.debugLine="If TagCodesWarehousesString = \"_\" Then TagCodes";
if (true) break;

case 103:
//if
this.state = 108;
if ((parent.mostCurrent._tagcodeswarehousesstring).equals("_")) { 
this.state = 105;
;}if (true) break;

case 105:
//C
this.state = 108;
parent.mostCurrent._tagcodeswarehousesstring = "";
if (true) break;

case 108:
//C
this.state = 109;
;
RDebugUtils.currentLine=61210688;
 //BA.debugLineNum = 61210688;BA.debugLine="If (Utils.NNE(TagCodesWarehousesString)) Then";
if (true) break;

case 109:
//if
this.state = 116;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodeswarehousesstring))) { 
this.state = 111;
}if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=61210689;
 //BA.debugLineNum = 61210689;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteW";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletewarehousesfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodeswarehousesstring);
RDebugUtils.currentLine=61210690;
 //BA.debugLineNum = 61210690;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 151;
return;
case 151:
//C
this.state = 112;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210691;
 //BA.debugLineNum = 61210691;BA.debugLine="If(result)Then";
if (true) break;

case 112:
//if
this.state = 115;
if ((_result)) { 
this.state = 114;
}if (true) break;

case 114:
//C
this.state = 115;
RDebugUtils.currentLine=61210692;
 //BA.debugLineNum = 61210692;BA.debugLine="TagCodesWarehousesString = \"\"";
parent.mostCurrent._tagcodeswarehousesstring = "";
 if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = 135;
;
 if (true) break;

case 118:
//C
this.state = 119;
RDebugUtils.currentLine=61210696;
 //BA.debugLineNum = 61210696;BA.debugLine="If TagCodesArticlesString = \"_\" Then TagCodesAr";
if (true) break;

case 119:
//if
this.state = 124;
if ((parent.mostCurrent._tagcodesarticlesstring).equals("_")) { 
this.state = 121;
;}if (true) break;

case 121:
//C
this.state = 124;
parent.mostCurrent._tagcodesarticlesstring = "";
if (true) break;

case 124:
//C
this.state = 125;
;
RDebugUtils.currentLine=61210697;
 //BA.debugLineNum = 61210697;BA.debugLine="If (Utils.NNE(TagCodesArticlesString)) Then";
if (true) break;

case 125:
//if
this.state = 132;
if ((parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodesarticlesstring))) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=61210698;
 //BA.debugLineNum = 61210698;BA.debugLine="Dim res As ResumableSub = DBStructures.DeleteA";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._deletearticlesfromlocaldatabasefromstring /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,parent.mostCurrent._tagcodesarticlesstring);
RDebugUtils.currentLine=61210699;
 //BA.debugLineNum = 61210699;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _res);
this.state = 152;
return;
case 152:
//C
this.state = 128;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61210700;
 //BA.debugLineNum = 61210700;BA.debugLine="If(result)Then";
if (true) break;

case 128:
//if
this.state = 131;
if ((_result)) { 
this.state = 130;
}if (true) break;

case 130:
//C
this.state = 131;
RDebugUtils.currentLine=61210701;
 //BA.debugLineNum = 61210701;BA.debugLine="TagCodesArticlesString = \"\"";
parent.mostCurrent._tagcodesarticlesstring = "";
 if (true) break;

case 131:
//C
this.state = 132;
;
 if (true) break;

case 132:
//C
this.state = 135;
;
 if (true) break;

case 134:
//C
this.state = 135;
RDebugUtils.currentLine=61210705;
 //BA.debugLineNum = 61210705;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDelete";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdeletetypetabelas /*String*/ ));
RDebugUtils.currentLine=61210706;
 //BA.debugLineNum = 61210706;BA.debugLine="Log(\"Deleting type_ tables\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661210706","Deleting type_ tables",0);
RDebugUtils.currentLine=61210707;
 //BA.debugLineNum = 61210707;BA.debugLine="Dim RBackUpAndDeleteTypes As ResumableSub = Bac";
_rbackupanddeletetypes = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rbackupanddeletetypes = _backupanddeletetypes();
RDebugUtils.currentLine=61210708;
 //BA.debugLineNum = 61210708;BA.debugLine="Wait For(RBackUpAndDeleteTypes) Complete (Delet";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "makeexecutesqlfiles"), _rbackupanddeletetypes);
this.state = 153;
return;
case 153:
//C
this.state = 135;
_deletedtables = (Boolean) result[0];
;
 if (true) break;

case 135:
//C
this.state = 136;
;
RDebugUtils.currentLine=61210712;
 //BA.debugLineNum = 61210712;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ ));
RDebugUtils.currentLine=61210713;
 //BA.debugLineNum = 61210713;BA.debugLine="Try";
if (true) break;

case 136:
//try
this.state = 141;
this.catchState = 140;
this.state = 138;
if (true) break;

case 138:
//C
this.state = 141;
this.catchState = 140;
RDebugUtils.currentLine=61210714;
 //BA.debugLineNum = 61210714;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",script, \"\")";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"DataUpdate",_script,"");
RDebugUtils.currentLine=61210715;
 //BA.debugLineNum = 61210715;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 140:
//C
this.state = 141;
this.catchState = 0;
RDebugUtils.currentLine=61210717;
 //BA.debugLineNum = 61210717;BA.debugLine="Log($\"ERROR: ${script} - EXCEPTION = ${LastExce";
anywheresoftware.b4a.keywords.Common.LogImpl("661210717",("ERROR: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_script))+" - EXCEPTION = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=61210718;
 //BA.debugLineNum = 61210718;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 141:
//C
this.state = 144;
this.catchState = 0;
;
 if (true) break;

case 143:
//C
this.state = 144;
RDebugUtils.currentLine=61210721;
 //BA.debugLineNum = 61210721;BA.debugLine="Log($\"Empty script\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("661210721",("Empty script"),0);
 if (true) break;

case 144:
//C
this.state = -1;
;
RDebugUtils.currentLine=61210723;
 //BA.debugLineNum = 61210723;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=61210724;
 //BA.debugLineNum = 61210724;BA.debugLine="End Sub";
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
public static boolean  _fieldexists(anywheresoftware.b4a.sql.SQL _sql,String _tablename,String _tablefield) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "fieldexists", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "fieldexists", new Object[] {_sql,_tablename,_tablefield}));}
boolean _result = false;
anywheresoftware.b4a.objects.collections.List _t = null;
int _i = 0;
String[] _values = null;
RDebugUtils.currentLine=62455808;
 //BA.debugLineNum = 62455808;BA.debugLine="Sub FieldExists(SQL As SQL, TableName As String, T";
RDebugUtils.currentLine=62455809;
 //BA.debugLineNum = 62455809;BA.debugLine="Dim result As Boolean";
_result = false;
RDebugUtils.currentLine=62455810;
 //BA.debugLineNum = 62455810;BA.debugLine="result = False";
_result = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62455812;
 //BA.debugLineNum = 62455812;BA.debugLine="Dim t As List";
_t = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62455813;
 //BA.debugLineNum = 62455813;BA.debugLine="t = DBUtils.ExecuteMemoryTable(SQL, \"PRAGMA table";
_t = mostCurrent._dbutils._executememorytable /*anywheresoftware.b4a.objects.collections.List*/ (mostCurrent.activityBA,_sql,"PRAGMA table_info ('"+_tablename+"')",(String[])(anywheresoftware.b4a.keywords.Common.Null),(int) (0));
RDebugUtils.currentLine=62455815;
 //BA.debugLineNum = 62455815;BA.debugLine="For i = 0 To t.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_t.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=62455816;
 //BA.debugLineNum = 62455816;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=62455817;
 //BA.debugLineNum = 62455817;BA.debugLine="values = t.Get(i)";
_values = (String[])(_t.Get(_i));
RDebugUtils.currentLine=62455819;
 //BA.debugLineNum = 62455819;BA.debugLine="If values(1).ToLowerCase = TableField.ToLowerCas";
if ((_values[(int) (1)].toLowerCase()).equals(_tablefield.toLowerCase())) { 
RDebugUtils.currentLine=62455820;
 //BA.debugLineNum = 62455820;BA.debugLine="result = True";
_result = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=62455821;
 //BA.debugLineNum = 62455821;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=62455825;
 //BA.debugLineNum = 62455825;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=62455826;
 //BA.debugLineNum = 62455826;BA.debugLine="End Sub";
return false;
}
public static void  _firstsubfromlogin() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "firstsubfromlogin", false))
	 {Debug.delegate(mostCurrent.activityBA, "firstsubfromlogin", null); return;}
ResumableSub_FirstSubFromLogin rsub = new ResumableSub_FirstSubFromLogin(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_FirstSubFromLogin extends BA.ResumableSub {
public ResumableSub_FirstSubFromLogin(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _dbu = null;
boolean _finished = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _chklocdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res2 = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res3 = null;
String _lastdoneupdatestr = "";
long _lastdoneupdate = 0L;
long _lastdueupdate = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59375624;
 //BA.debugLineNum = 59375624;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=59375625;
 //BA.debugLineNum = 59375625;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375626;
 //BA.debugLineNum = 59375626;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=59375633;
 //BA.debugLineNum = 59375633;BA.debugLine="Dim DBU As ResumableSub = insert_dta_auth";
_dbu = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_dbu = _insert_dta_auth();
RDebugUtils.currentLine=59375634;
 //BA.debugLineNum = 59375634;BA.debugLine="Wait For (DBU) Complete (Finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "firstsubfromlogin"), _dbu);
this.state = 37;
return;
case 37:
//C
this.state = 1;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=59375637;
 //BA.debugLineNum = 59375637;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=59375638;
 //BA.debugLineNum = 59375638;BA.debugLine="Dim ChkLocData As ResumableSub = UpdateData2Serv";
_chklocdata = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_chklocdata = _updatedata2server();
RDebugUtils.currentLine=59375639;
 //BA.debugLineNum = 59375639;BA.debugLine="Wait For (ChkLocData) Complete (Finished As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "firstsubfromlogin"), _chklocdata);
this.state = 38;
return;
case 38:
//C
this.state = 4;
_finished = (Boolean) result[0];
;
 if (true) break;
;
RDebugUtils.currentLine=59375651;
 //BA.debugLineNum = 59375651;BA.debugLine="If (ShareCode.FIRSTLOGININDEVICE) Then ' Primeiro";

case 4:
//if
this.state = 11;
if ((parent.mostCurrent._sharecode._firstloginindevice /*boolean*/ )) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=59375660;
 //BA.debugLineNum = 59375660;BA.debugLine="Dim res As ResumableSub = RunUpdate60Last7Next";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _runupdate60last7next();
RDebugUtils.currentLine=59375661;
 //BA.debugLineNum = 59375661;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "firstsubfromlogin"), _res);
this.state = 39;
return;
case 39:
//C
this.state = 7;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=59375662;
 //BA.debugLineNum = 59375662;BA.debugLine="Log(\"RunUpdate60Last7Next\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659375662","RunUpdate60Last7Next",0);
RDebugUtils.currentLine=59375664;
 //BA.debugLineNum = 59375664;BA.debugLine="If (SqlFilesTotal <= 0) Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((parent._sqlfilestotal<=0)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=59375665;
 //BA.debugLineNum = 59375665;BA.debugLine="ToastMessageShow(ShareCode.MsgNaoExistemActuali";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgnaoexistemactualizacoes /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=59375667;
 //BA.debugLineNum = 59375667;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59375668;
 //BA.debugLineNum = 59375668;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375669;
 //BA.debugLineNum = 59375669;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=59375670;
 //BA.debugLineNum = 59375670;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=59375674;
 //BA.debugLineNum = 59375674;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=59375676;
 //BA.debugLineNum = 59375676;BA.debugLine="If ShareCode.FIRSTDAILYLOGIN Then";
if (true) break;

case 12:
//if
this.state = 17;
if (parent.mostCurrent._sharecode._firstdailylogin /*boolean*/ ) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=59375677;
 //BA.debugLineNum = 59375677;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=59375678;
 //BA.debugLineNum = 59375678;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375679;
 //BA.debugLineNum = 59375679;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=59375681;
 //BA.debugLineNum = 59375681;BA.debugLine="Dim res2 As ResumableSub = RunUpdateOnDay";
_res2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res2 = _runupdateonday();
RDebugUtils.currentLine=59375682;
 //BA.debugLineNum = 59375682;BA.debugLine="Wait For(res2) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "firstsubfromlogin"), _res2);
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=59375683;
 //BA.debugLineNum = 59375683;BA.debugLine="Log(\"RunUpdateOnDay\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659375683","RunUpdateOnDay",0);
RDebugUtils.currentLine=59375685;
 //BA.debugLineNum = 59375685;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59375686;
 //BA.debugLineNum = 59375686;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375687;
 //BA.debugLineNum = 59375687;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=59375688;
 //BA.debugLineNum = 59375688;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=59375690;
 //BA.debugLineNum = 59375690;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=59375691;
 //BA.debugLineNum = 59375691;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375692;
 //BA.debugLineNum = 59375692;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=59375694;
 //BA.debugLineNum = 59375694;BA.debugLine="ShareCode.SyncManualComponents.Initialize";
parent.mostCurrent._sharecode._syncmanualcomponents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=59375695;
 //BA.debugLineNum = 59375695;BA.debugLine="ShareCode.SYNC_COMPONENTS = \"\"";
parent.mostCurrent._sharecode._sync_components /*String*/  = "";
RDebugUtils.currentLine=59375696;
 //BA.debugLineNum = 59375696;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59375697;
 //BA.debugLineNum = 59375697;BA.debugLine="ShareCode.AutoSyncFromLogin = True";
parent.mostCurrent._sharecode._autosyncfromlogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=59375698;
 //BA.debugLineNum = 59375698;BA.debugLine="Dim res3 As ResumableSub = RunSync(\"\",False)";
_res3 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res3 = _runsync("",anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=59375699;
 //BA.debugLineNum = 59375699;BA.debugLine="Wait For(res3) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "firstsubfromlogin"), _res3);
this.state = 41;
return;
case 41:
//C
this.state = 17;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=59375700;
 //BA.debugLineNum = 59375700;BA.debugLine="Log(\"First RunSync Auto\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659375700","First RunSync Auto",0);
RDebugUtils.currentLine=59375701;
 //BA.debugLineNum = 59375701;BA.debugLine="ShareCode.AutoSyncFromLogin = False";
parent.mostCurrent._sharecode._autosyncfromlogin /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59375702;
 //BA.debugLineNum = 59375702;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59375703;
 //BA.debugLineNum = 59375703;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375704;
 //BA.debugLineNum = 59375704;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=59375705;
 //BA.debugLineNum = 59375705;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=59375708;
 //BA.debugLineNum = 59375708;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareC";

case 17:
//if
this.state = 20;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_ON"))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=59375709;
 //BA.debugLineNum = 59375709;BA.debugLine="File.Delete(Starter.InternalFolder,$\"${ShareCod";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_ON"));
 if (true) break;
;
RDebugUtils.currentLine=59375712;
 //BA.debugLineNum = 59375712;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareC";

case 20:
//if
this.state = 27;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=59375713;
 //BA.debugLineNum = 59375713;BA.debugLine="Dim LastDoneUpdateStr As String = File.ReadStrin";
_lastdoneupdatestr = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"));
RDebugUtils.currentLine=59375714;
 //BA.debugLineNum = 59375714;BA.debugLine="Dim LastDoneUpdate As Long = DateTime.DateParse";
_lastdoneupdate = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_lastdoneupdatestr);
RDebugUtils.currentLine=59375715;
 //BA.debugLineNum = 59375715;BA.debugLine="Dim LastDueUpdate As Long = Utils.getlastndaysl";
_lastdueupdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (2));
RDebugUtils.currentLine=59375716;
 //BA.debugLineNum = 59375716;BA.debugLine="If (LastDoneUpdate < = LastDueUpdate) Then";
if (true) break;

case 23:
//if
this.state = 26;
if ((_lastdoneupdate<=_lastdueupdate)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=59375717;
 //BA.debugLineNum = 59375717;BA.debugLine="InsertAlertSistema(0, LastDoneUpdateStr)";
_insertalertsistema((int) (0),_lastdoneupdatestr);
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;
;
RDebugUtils.currentLine=59375721;
 //BA.debugLineNum = 59375721;BA.debugLine="If (SqlFilesTotal = 0) Then ToastMessageShow(Sha";

case 27:
//if
this.state = 32;
if ((parent._sqlfilestotal==0)) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgnaoexistemactualizacoes /*String*/ ),anywheresoftware.b4a.keywords.Common.True);
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=59375723;
 //BA.debugLineNum = 59375723;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=59375724;
 //BA.debugLineNum = 59375724;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59375725;
 //BA.debugLineNum = 59375725;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=59375726;
 //BA.debugLineNum = 59375726;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=59375731;
 //BA.debugLineNum = 59375731;BA.debugLine="If Not(ShareCode.FIRSTLOGININDEVICE) And Not(Shar";
if (true) break;

case 33:
//if
this.state = 36;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._firstloginindevice /*boolean*/ ) && anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._firstdailylogin /*boolean*/ )) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=59375732;
 //BA.debugLineNum = 59375732;BA.debugLine="ButtonWelcomeNext_Click";
_buttonwelcomenext_click();
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=59375735;
 //BA.debugLineNum = 59375735;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _insert_dta_auth() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "insert_dta_auth", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "insert_dta_auth", null));}
ResumableSub_insert_dta_auth rsub = new ResumableSub_insert_dta_auth(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_insert_dta_auth extends BA.ResumableSub {
public ResumableSub_insert_dta_auth(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _cleartableauth = "";
String _instableauth = "";
String _instabledataauth = "";
boolean _resultado = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62390274;
 //BA.debugLineNum = 62390274;BA.debugLine="Dim CLearTableAuth As String = $\"drop table dta_a";
_cleartableauth = ("drop table dta_auths;");
RDebugUtils.currentLine=62390276;
 //BA.debugLineNum = 62390276;BA.debugLine="Dim InsTableAuth As String = $\"CREATE TABLE dta_a";
_instableauth = ("CREATE TABLE dta_auths (id bigint(20) NOT NULL ,\n"+"							tagcode varchar(50) NOT NULL DEFAULT 'AUTHS_', \n"+"							component_type varchar(50) NOT NULL , \n"+"							accessmode_type varchar(50) NOT NULL , \n"+"							inout_tagcode varchar(50) NOT NULL , \n"+"							group_tagcode varchar(50) NOT NULL , \n"+"							is_data tinyint(4) NULL DEFAULT '0', \n"+"							title varchar(100) NOT NULL , \n"+"							authtagcodes varchar(500) NULL , \n"+"							authtabs varchar(500) NULL , \n"+"							authfields varchar(500) NULL , \n"+"							authfieldsadds varchar(500) NULL , \n"+"							departments varchar(500) NULL , \n"+"							teams varchar(500) NULL , \n"+"							users varchar(500) NULL , \n"+"							created_at timestamp NULL , \n"+"							updated_at timestamp NULL , \n"+"							sid_id int(11) NOT NULL DEFAULT '0', \n"+"							cbr_id int(11) NOT NULL DEFAULT '0', \n"+"							active tinyint(4) NOT NULL DEFAULT '1', \n"+"							action_view tinyint(4) NULL DEFAULT '1', \n"+"							action_change tinyint(4) NULL DEFAULT '1', \n"+"							action_add tinyint(4) NULL DEFAULT '1', \n"+"							action_delete tinyint(4) NULL DEFAULT '1', \n"+"							action_use tinyint(4) NULL DEFAULT '1', \n"+"							action_print tinyint(4) NULL DEFAULT '1', \n"+"							action_import tinyint(4) NULL DEFAULT '1', \n"+"							action_export tinyint(4) NULL DEFAULT '1', \n"+"							action_edit tinyint(4) NULL DEFAULT '1', \n"+"							PRIMARY KEY (id, tagcode));");
RDebugUtils.currentLine=62390308;
 //BA.debugLineNum = 62390308;BA.debugLine="Dim InsTableDataAuth As String = $\"INSERT INTO `d";
_instabledataauth = ("INSERT INTO `dta_auths` (`id`, `tagcode`, `component_type`, `accessmode_type`, `inout_tagcode`, `group_tagcode`, `is_data`, `title`, `authtagcodes`, `authtabs`, `authfields`, `authfieldsadds`, `departments`, `teams`, `users`, `created_at`, `updated_at`, `sid_id`, `cbr_id`, `active`, `action_view`, `action_change`, `action_add`, `action_delete`, `action_use`, `action_print`, `action_import`, `action_export`, `action_edit`) VALUES\n"+"	(1, 'AUTHS_20201115_135100', 'TCMPT_ANY', 'TACCMT_001', '', '', 0, 'Tipos de Intervenção para Produção', NULL, NULL, NULL, NULL, 'TDEPT_20201109_191112|TDEPT_20201109_191732', NULL, NULL, '2020-11-15 13:55:06', NULL, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1),\n"+"	(2, 'AUTHS_20201115_135500', 'TCMPT_ANY', 'TACCMT_001', '', '', 0, 'Tipos de Intervenção para Equipamentos', NULL, NULL, NULL, NULL, 'TDEPT_20201109_191052', NULL, NULL, '2020-11-15 13:55:49', NULL, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);");
RDebugUtils.currentLine=62390312;
 //BA.debugLineNum = 62390312;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
RDebugUtils.currentLine=62390313;
 //BA.debugLineNum = 62390313;BA.debugLine="Dim Resultado As Boolean = False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62390314;
 //BA.debugLineNum = 62390314;BA.debugLine="If Not(FieldExists(Starter.LocalSQLEVC,\"dta_auth";
if (true) break;

case 4:
//if
this.state = 11;
if (anywheresoftware.b4a.keywords.Common.Not(_fieldexists(parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ ,"dta_auths","action_edit"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=62390315;
 //BA.debugLineNum = 62390315;BA.debugLine="ProgressDialogShow2(\"Actualizando a base de dad";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando a base de dados, Aguarde por favor !"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62390317;
 //BA.debugLineNum = 62390317;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(CLearTableAuth";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_cleartableauth);
RDebugUtils.currentLine=62390318;
 //BA.debugLineNum = 62390318;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "insert_dta_auth"),(int) (250));
this.state = 15;
return;
case 15:
//C
this.state = 7;
;
RDebugUtils.currentLine=62390321;
 //BA.debugLineNum = 62390321;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(InsTableAuth)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_instableauth);
RDebugUtils.currentLine=62390322;
 //BA.debugLineNum = 62390322;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "insert_dta_auth"),(int) (250));
this.state = 16;
return;
case 16:
//C
this.state = 7;
;
RDebugUtils.currentLine=62390325;
 //BA.debugLineNum = 62390325;BA.debugLine="If  (ShareCode.APP_DOMAIN.ToLowerCase = \"somafe";
if (true) break;

case 7:
//if
this.state = 10;
if (((parent.mostCurrent._sharecode._app_domain /*String*/ .toLowerCase()).equals("somafel"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=62390326;
 //BA.debugLineNum = 62390326;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(InsTableDataA";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_instabledataauth);
RDebugUtils.currentLine=62390327;
 //BA.debugLineNum = 62390327;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "insert_dta_auth"),(int) (250));
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=62390330;
 //BA.debugLineNum = 62390330;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62390331;
 //BA.debugLineNum = 62390331;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=62390334;
 //BA.debugLineNum = 62390334;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662390334",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=62390337;
 //BA.debugLineNum = 62390337;BA.debugLine="Return Resultado";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_resultado));return;};
RDebugUtils.currentLine=62390339;
 //BA.debugLineNum = 62390339;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatedata2server() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatedata2server", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "updatedata2server", null));}
ResumableSub_UpdateData2Server rsub = new ResumableSub_UpdateData2Server(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateData2Server extends BA.ResumableSub {
public ResumableSub_UpdateData2Server(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
boolean _withfiles = false;
int _reccounter = 0;
int _resposta = 0;
int _result = 0;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordlocaldatatoupdate = null;
String _ssqlemails = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordlocalemaildatatoupdate = null;
boolean _emailcheck = false;
int _ut0 = 0;
int _ut1 = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r1 = null;
boolean _finished = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r2 = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordlocaldatatoupdate2 = null;
anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog _appldialog = null;
Object _sf = null;
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _reclocaloffline = null;
String _requesttc = "";
int _res = 0;
int _p = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chk = null;
anywheresoftware.b4a.objects.EditTextWrapper _tc = null;
String _currtc = "";
String _tcf = "";
int step93;
int limit93;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62324738;
 //BA.debugLineNum = 62324738;BA.debugLine="If lbldataupdatetitle.Visible Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._lbldataupdatetitle.getVisible()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=62324739;
 //BA.debugLineNum = 62324739;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgSendDataS";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgsenddataserver /*String*/ ));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=62324742;
 //BA.debugLineNum = 62324742;BA.debugLine="ProgressDialogShow2(ShareCode.checklistenviardado";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistenviardados2bo /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62324743;
 //BA.debugLineNum = 62324743;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=62324744;
 //BA.debugLineNum = 62324744;BA.debugLine="Log(\"**************************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("662324744","**************************************",0);
RDebugUtils.currentLine=62324745;
 //BA.debugLineNum = 62324745;BA.debugLine="Log(\" SENDING LOCAL DATA TO SERVER \")";
anywheresoftware.b4a.keywords.Common.LogImpl("662324745"," SENDING LOCAL DATA TO SERVER ",0);
RDebugUtils.currentLine=62324746;
 //BA.debugLineNum = 62324746;BA.debugLine="Log(\"**************************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("662324746","**************************************",0);
RDebugUtils.currentLine=62324748;
 //BA.debugLineNum = 62324748;BA.debugLine="Dim WITHFILES As Boolean = True";
_withfiles = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=62324749;
 //BA.debugLineNum = 62324749;BA.debugLine="Dim RecCounter As Int = LocalDataToUpdate";
_reccounter = _localdatatoupdate();
RDebugUtils.currentLine=62324750;
 //BA.debugLineNum = 62324750;BA.debugLine="Dim Resposta As Int = 0";
_resposta = (int) (0);
RDebugUtils.currentLine=62324752;
 //BA.debugLineNum = 62324752;BA.debugLine="If RecCounter > 0 Then";
if (true) break;

case 5:
//if
this.state = 148;
if (_reccounter>0) { 
this.state = 7;
}else {
this.state = 147;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=62324754;
 //BA.debugLineNum = 62324754;BA.debugLine="Msgbox2Async($\"Existe informação OFFLINE por env";
anywheresoftware.b4a.keywords.Common.Msgbox2Async(BA.ObjectToCharSequence(("Existe informação OFFLINE por enviar ao Servidor."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"NOTA : Uma grande quantidade de dados por enviar pode causar erros de transmissão em redes com pouco sinal."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"Por favor seleccione uma das seguintes opções.")),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalinfotitle /*String*/ ),"ENVIAR TUDO","ENVIAR MAIS TARDE","",(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null)),processBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62324755;
 //BA.debugLineNum = 62324755;BA.debugLine="Wait For Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), null);
this.state = 149;
return;
case 149:
//C
this.state = 8;
_result = (Integer) result[0];
;
RDebugUtils.currentLine=62324756;
 //BA.debugLineNum = 62324756;BA.debugLine="If Result = DialogResponse.POSITIVE Then ' ENVIA";
if (true) break;

case 8:
//if
this.state = 145;
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 10;
}else 
{RDebugUtils.currentLine=62324829;
 //BA.debugLineNum = 62324829;BA.debugLine="Else If Result = DialogResponse.NEGATIVE Then '";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.NEGATIVE) { 
this.state = 63;
}else {
this.state = 144;
}}
if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=62324758;
 //BA.debugLineNum = 62324758;BA.debugLine="Try";
if (true) break;

case 11:
//try
this.state = 16;
this.catchState = 15;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 16;
this.catchState = 15;
RDebugUtils.currentLine=62324759;
 //BA.debugLineNum = 62324759;BA.debugLine="Dim sSQL As String = $\"select distinct up_date";
_ssql = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0");
RDebugUtils.currentLine=62324760;
 //BA.debugLineNum = 62324760;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Sta";
_recordlocaldatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=62324762;
 //BA.debugLineNum = 62324762;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324762",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=62324763;
 //BA.debugLineNum = 62324763;BA.debugLine="Dim sSQL As String = $\"select distinct up_date";
_ssql = ("select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0");
RDebugUtils.currentLine=62324764;
 //BA.debugLineNum = 62324764;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Sta";
_recordlocaldatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=62324765;
 //BA.debugLineNum = 62324765;BA.debugLine="WITHFILES = False";
_withfiles = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=62324768;
 //BA.debugLineNum = 62324768;BA.debugLine="Try";

case 16:
//try
this.state = 21;
this.catchState = 0;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
RDebugUtils.currentLine=62324769;
 //BA.debugLineNum = 62324769;BA.debugLine="Dim sSQLEmails As String = $\"select distinct u";
_ssqlemails = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0");
RDebugUtils.currentLine=62324770;
 //BA.debugLineNum = 62324770;BA.debugLine="Dim RecordLocalEmailDataToUpdate As ResultSet";
_recordlocalemaildatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocalemaildatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssqlemails)));
RDebugUtils.currentLine=62324771;
 //BA.debugLineNum = 62324771;BA.debugLine="Dim EmailCheck As Boolean = True";
_emailcheck = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
RDebugUtils.currentLine=62324773;
 //BA.debugLineNum = 62324773;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324773",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=62324774;
 //BA.debugLineNum = 62324774;BA.debugLine="Dim EmailCheck As Boolean = False";
_emailcheck = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
RDebugUtils.currentLine=62324777;
 //BA.debugLineNum = 62324777;BA.debugLine="Dim ut0 As Int = RecordLocalDataToUpdate.RowCou";
_ut0 = _recordlocaldatatoupdate.getRowCount();
RDebugUtils.currentLine=62324778;
 //BA.debugLineNum = 62324778;BA.debugLine="Dim ut1 As Int = RecCounter - ut0";
_ut1 = (int) (_reccounter-_ut0);
RDebugUtils.currentLine=62324781;
 //BA.debugLineNum = 62324781;BA.debugLine="If(RecordLocalDataToUpdate.RowCount >= 1) Then";
if (true) break;

case 22:
//if
this.state = 43;
if ((_recordlocaldatatoupdate.getRowCount()>=1)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=62324784;
 //BA.debugLineNum = 62324784;BA.debugLine="Do While RecordLocalDataToUpdate.NextRow";
if (true) break;

case 25:
//do while
this.state = 42;
while (_recordlocaldatatoupdate.NextRow()) {
this.state = 27;
if (true) break;
}
if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=62324786;
 //BA.debugLineNum = 62324786;BA.debugLine="Try";
if (true) break;

case 28:
//try
this.state = 41;
this.catchState = 40;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 31;
this.catchState = 40;
RDebugUtils.currentLine=62324788;
 //BA.debugLineNum = 62324788;BA.debugLine="Dim r1 As ResumableSub = SetUpdateHTTPRecord";
_r1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r1 = _setupdatehttprecord(_recordlocaldatatoupdate,_withfiles,(int) (0),"");
RDebugUtils.currentLine=62324789;
 //BA.debugLineNum = 62324789;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), _r1);
this.state = 150;
return;
case 150:
//C
this.state = 31;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=62324792;
 //BA.debugLineNum = 62324792;BA.debugLine="If EmailCheck Then";
if (true) break;

case 31:
//if
this.state = 38;
if (_emailcheck) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=62324793;
 //BA.debugLineNum = 62324793;BA.debugLine="If RecordLocalEmailDataToUpdate.RowCount >";
if (true) break;

case 34:
//if
this.state = 37;
if (_recordlocalemaildatatoupdate.getRowCount()>0) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=62324794;
 //BA.debugLineNum = 62324794;BA.debugLine="Dim r2 As ResumableSub = SetUpdateHTTPEmai";
_r2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r2 = _setupdatehttpemailrecord(_recordlocalemaildatatoupdate,"");
RDebugUtils.currentLine=62324795;
 //BA.debugLineNum = 62324795;BA.debugLine="Wait For(r2) complete (finished As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), _r2);
this.state = 151;
return;
case 151:
//C
this.state = 37;
_finished = (Boolean) result[0];
;
 if (true) break;

case 37:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = 41;
;
 if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
RDebugUtils.currentLine=62324800;
 //BA.debugLineNum = 62324800;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324800",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 25;
this.catchState = 0;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=62324804;
 //BA.debugLineNum = 62324804;BA.debugLine="RecordLocalDataToUpdate.Close";
_recordlocaldatatoupdate.Close();
RDebugUtils.currentLine=62324805;
 //BA.debugLineNum = 62324805;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"),(int) (250));
this.state = 152;
return;
case 152:
//C
this.state = 44;
;
RDebugUtils.currentLine=62324808;
 //BA.debugLineNum = 62324808;BA.debugLine="If (ut1 >= 1) And (WITHFILES) Then";
if (true) break;

case 44:
//if
this.state = 61;
if ((_ut1>=1) && (_withfiles)) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=62324809;
 //BA.debugLineNum = 62324809;BA.debugLine="Dim sSQL As String = $\"select distinct up_date";
_ssql = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1");
RDebugUtils.currentLine=62324810;
 //BA.debugLineNum = 62324810;BA.debugLine="Dim RecordLocalDataToUpdate2 As ResultSet = St";
_recordlocaldatatoupdate2 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate2 = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=62324812;
 //BA.debugLineNum = 62324812;BA.debugLine="If RecordLocalDataToUpdate2.RowCount > 0 Then";
if (true) break;

case 47:
//if
this.state = 60;
if (_recordlocaldatatoupdate2.getRowCount()>0) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=62324813;
 //BA.debugLineNum = 62324813;BA.debugLine="Do While RecordLocalDataToUpdate2.NextRow";
if (true) break;

case 50:
//do while
this.state = 59;
while (_recordlocaldatatoupdate2.NextRow()) {
this.state = 52;
if (true) break;
}
if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=62324815;
 //BA.debugLineNum = 62324815;BA.debugLine="Try";
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
RDebugUtils.currentLine=62324816;
 //BA.debugLineNum = 62324816;BA.debugLine="SetUpdateFTPRecord(RecordLocalDataToUpdate2";
_setupdateftprecord(_recordlocaldatatoupdate2,_withfiles,(int) (1),"");
 if (true) break;

case 57:
//C
this.state = 58;
this.catchState = 0;
RDebugUtils.currentLine=62324818;
 //BA.debugLineNum = 62324818;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324818",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 58:
//C
this.state = 50;
this.catchState = 0;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=62324822;
 //BA.debugLineNum = 62324822;BA.debugLine="RecordLocalDataToUpdate2.Close";
_recordlocaldatatoupdate2.Close();
 if (true) break;

case 61:
//C
this.state = 145;
;
RDebugUtils.currentLine=62324825;
 //BA.debugLineNum = 62324825;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62324826;
 //BA.debugLineNum = 62324826;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62324827;
 //BA.debugLineNum = 62324827;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=62324830;
 //BA.debugLineNum = 62324830;BA.debugLine="Dim appldialog As CustomLayoutDialog";
_appldialog = new anywheresoftware.b4a.agraham.dialogs.InputDialog.CustomLayoutDialog();
RDebugUtils.currentLine=62324831;
 //BA.debugLineNum = 62324831;BA.debugLine="Dim sf As Object = appldialog.ShowAsync(\"Interv";
_sf = _appldialog.ShowAsync("Intervenções por enviar ao Servidor","Enviar Selecção","Cancelar","",mostCurrent.activityBA,(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62324833;
 //BA.debugLineNum = 62324833;BA.debugLine="Utils.SetDialogColors(sf, Consts.ColorWhite, Co";
parent.mostCurrent._utils._setdialogcolors /*String*/ (mostCurrent.activityBA,_sf,parent.mostCurrent._consts._colorwhite /*int*/ ,parent.mostCurrent._consts._colorgray /*int*/ ,(int) (3),(int) (5));
RDebugUtils.currentLine=62324834;
 //BA.debugLineNum = 62324834;BA.debugLine="If Not(ShareCode.ISPHONE) Then";
if (true) break;

case 64:
//if
this.state = 69;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._isphone /*boolean*/ )) { 
this.state = 66;
}else {
this.state = 68;
}if (true) break;

case 66:
//C
this.state = 69;
RDebugUtils.currentLine=62324835;
 //BA.debugLineNum = 62324835;BA.debugLine="appldialog.SetSize(60%x, 60%y)";
_appldialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (60),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (60),mostCurrent.activityBA));
 if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=62324837;
 //BA.debugLineNum = 62324837;BA.debugLine="appldialog.SetSize(60%x, 40%y)";
_appldialog.SetSize(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (60),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (40),mostCurrent.activityBA));
 if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=62324839;
 //BA.debugLineNum = 62324839;BA.debugLine="Wait For (sf) Dialog_Ready(pnl As Panel)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_ready", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), _sf);
this.state = 153;
return;
case 153:
//C
this.state = 70;
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) result[0];
;
RDebugUtils.currentLine=62324840;
 //BA.debugLineNum = 62324840;BA.debugLine="pnl.LoadLayout(\"dialogoOfflineReqs\")";
_pnl.LoadLayout("dialogoOfflineReqs",mostCurrent.activityBA);
RDebugUtils.currentLine=62324842;
 //BA.debugLineNum = 62324842;BA.debugLine="ListaIntervencoesOffline.Clear";
parent.mostCurrent._listaintervencoesoffline._clear();
RDebugUtils.currentLine=62324844;
 //BA.debugLineNum = 62324844;BA.debugLine="Dim sSQL As String = $\"select distinct up_tagco";
_ssql = ("select distinct up_tagcode from loc_updatesrever where up_state=0");
RDebugUtils.currentLine=62324845;
 //BA.debugLineNum = 62324845;BA.debugLine="Dim RecLocalOffline As ResultSet = Starter.Loca";
_reclocaloffline = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_reclocaloffline = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=62324846;
 //BA.debugLineNum = 62324846;BA.debugLine="Do While RecLocalOffline.NextRow";
if (true) break;

case 70:
//do while
this.state = 77;
while (_reclocaloffline.NextRow()) {
this.state = 72;
if (true) break;
}
if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=62324847;
 //BA.debugLineNum = 62324847;BA.debugLine="Dim RequestTC As String = RecLocalOffline.GetS";
_requesttc = _reclocaloffline.GetString("up_tagcode").trim();
RDebugUtils.currentLine=62324848;
 //BA.debugLineNum = 62324848;BA.debugLine="If Utils.NNE(RequestTC) Then";
if (true) break;

case 73:
//if
this.state = 76;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_requesttc)) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=62324849;
 //BA.debugLineNum = 62324849;BA.debugLine="ListaIntervencoesOffline.Add(createListaOffli";
parent.mostCurrent._listaintervencoesoffline._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createlistaofflinereq(_requesttc,anywheresoftware.b4a.keywords.Common.True,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50))).getObject())),(Object)(_requesttc));
 if (true) break;

case 76:
//C
this.state = 70;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=62324854;
 //BA.debugLineNum = 62324854;BA.debugLine="Wait For (sf) Dialog_Result(Res As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("dialog_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), _sf);
this.state = 154;
return;
case 154:
//C
this.state = 78;
_res = (Integer) result[0];
;
RDebugUtils.currentLine=62324856;
 //BA.debugLineNum = 62324856;BA.debugLine="If Res = DialogResponse.POSITIVE Then";
if (true) break;

case 78:
//if
this.state = 142;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 80;
}else {
this.state = 141;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=62324858;
 //BA.debugLineNum = 62324858;BA.debugLine="ProgressDialogShow2(ShareCode.checklistenviard";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow2(mostCurrent.activityBA,BA.ObjectToCharSequence(parent.mostCurrent._sharecode._checklistenviardados2bo /*String*/ ),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=62324859;
 //BA.debugLineNum = 62324859;BA.debugLine="For p=0 To ListaIntervencoesOffline.Size -1";
if (true) break;

case 81:
//for
this.state = 139;
step93 = 1;
limit93 = (int) (parent.mostCurrent._listaintervencoesoffline._getsize()-1);
_p = (int) (0) ;
this.state = 155;
if (true) break;

case 155:
//C
this.state = 139;
if ((step93 > 0 && _p <= limit93) || (step93 < 0 && _p >= limit93)) this.state = 83;
if (true) break;

case 156:
//C
this.state = 155;
_p = ((int)(0 + _p + step93)) ;
if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=62324860;
 //BA.debugLineNum = 62324860;BA.debugLine="Dim pnl As Panel = ListaIntervencoesOffline.G";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(parent.mostCurrent._listaintervencoesoffline._getpanel(_p).getObject()));
RDebugUtils.currentLine=62324861;
 //BA.debugLineNum = 62324861;BA.debugLine="Dim Chk As CheckBox = pnl.GetView(0)";
_chk = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_chk = (anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper(), (android.widget.CheckBox)(_pnl.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=62324862;
 //BA.debugLineNum = 62324862;BA.debugLine="Dim TC As EditText = pnl.GetView(1)";
_tc = new anywheresoftware.b4a.objects.EditTextWrapper();
_tc = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(_pnl.GetView((int) (1)).getObject()));
RDebugUtils.currentLine=62324863;
 //BA.debugLineNum = 62324863;BA.debugLine="If Chk.Checked Then";
if (true) break;

case 84:
//if
this.state = 138;
if (_chk.getChecked()) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=62324865;
 //BA.debugLineNum = 62324865;BA.debugLine="Try";
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
RDebugUtils.currentLine=62324866;
 //BA.debugLineNum = 62324866;BA.debugLine="Dim sSQL As String = $\"select distinct up_d";
_ssql = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1\n"+"													and up_state=0\n"+"													and up_type=0\n"+"													and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc.getText()))+"'");
RDebugUtils.currentLine=62324870;
 //BA.debugLineNum = 62324870;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet =";
_recordlocaldatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=62324871;
 //BA.debugLineNum = 62324871;BA.debugLine="WITHFILES = False";
_withfiles = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
RDebugUtils.currentLine=62324873;
 //BA.debugLineNum = 62324873;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324873",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=62324874;
 //BA.debugLineNum = 62324874;BA.debugLine="Dim sSQL As String = $\"select distinct up_d";
_ssql = ("select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1\n"+"													and up_state=0\n"+"													and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc.getText()))+"'");
RDebugUtils.currentLine=62324877;
 //BA.debugLineNum = 62324877;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet =";
_recordlocaldatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=62324878;
 //BA.debugLineNum = 62324878;BA.debugLine="WITHFILES = False";
_withfiles = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=62324881;
 //BA.debugLineNum = 62324881;BA.debugLine="Try";

case 92:
//try
this.state = 97;
this.catchState = 0;
this.catchState = 96;
this.state = 94;
if (true) break;

case 94:
//C
this.state = 97;
this.catchState = 96;
RDebugUtils.currentLine=62324882;
 //BA.debugLineNum = 62324882;BA.debugLine="Dim sSQLEmails As String = $\"select distinc";
_ssqlemails = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where 1=1\n"+"															and up_state=0\n"+"															and up_type=0\n"+"															and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc.getText()))+"'");
RDebugUtils.currentLine=62324886;
 //BA.debugLineNum = 62324886;BA.debugLine="Dim RecordLocalEmailDataToUpdate As ResultS";
_recordlocalemaildatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocalemaildatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssqlemails)));
RDebugUtils.currentLine=62324887;
 //BA.debugLineNum = 62324887;BA.debugLine="Dim EmailCheck As Boolean = True";
_emailcheck = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 96:
//C
this.state = 97;
this.catchState = 0;
RDebugUtils.currentLine=62324889;
 //BA.debugLineNum = 62324889;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324889",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=62324890;
 //BA.debugLineNum = 62324890;BA.debugLine="Dim EmailCheck As Boolean = False";
_emailcheck = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 97:
//C
this.state = 98;
this.catchState = 0;
;
RDebugUtils.currentLine=62324893;
 //BA.debugLineNum = 62324893;BA.debugLine="Dim ut0 As Int = RecordLocalDataToUpdate.Row";
_ut0 = _recordlocaldatatoupdate.getRowCount();
RDebugUtils.currentLine=62324894;
 //BA.debugLineNum = 62324894;BA.debugLine="Dim ut1 As Int = RecCounter - ut0";
_ut1 = (int) (_reccounter-_ut0);
RDebugUtils.currentLine=62324896;
 //BA.debugLineNum = 62324896;BA.debugLine="If(RecordLocalDataToUpdate.RowCount >= 1) Th";
if (true) break;

case 98:
//if
this.state = 137;
if ((_recordlocaldatatoupdate.getRowCount()>=1)) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=62324899;
 //BA.debugLineNum = 62324899;BA.debugLine="Do While RecordLocalDataToUpdate.NextRow";
if (true) break;

case 101:
//do while
this.state = 118;
while (_recordlocaldatatoupdate.NextRow()) {
this.state = 103;
if (true) break;
}
if (true) break;

case 103:
//C
this.state = 104;
RDebugUtils.currentLine=62324901;
 //BA.debugLineNum = 62324901;BA.debugLine="Try";
if (true) break;

case 104:
//try
this.state = 117;
this.catchState = 116;
this.state = 106;
if (true) break;

case 106:
//C
this.state = 107;
this.catchState = 116;
RDebugUtils.currentLine=62324903;
 //BA.debugLineNum = 62324903;BA.debugLine="Dim CurrTC As String = RecordLocalDataToU";
_currtc = _recordlocaldatatoupdate.GetString("up_tagcode");
RDebugUtils.currentLine=62324904;
 //BA.debugLineNum = 62324904;BA.debugLine="Dim TCF As String =$\"and up_tagcode = '${";
_tcf = ("and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currtc))+"'");
RDebugUtils.currentLine=62324905;
 //BA.debugLineNum = 62324905;BA.debugLine="Dim r1 As ResumableSub = SetUpdateHTTPRec";
_r1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r1 = _setupdatehttprecord(_recordlocaldatatoupdate,_withfiles,(int) (0),_tcf);
RDebugUtils.currentLine=62324906;
 //BA.debugLineNum = 62324906;BA.debugLine="Wait For(r1) complete (finished As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), _r1);
this.state = 157;
return;
case 157:
//C
this.state = 107;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=62324909;
 //BA.debugLineNum = 62324909;BA.debugLine="If EmailCheck Then";
if (true) break;

case 107:
//if
this.state = 114;
if (_emailcheck) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
RDebugUtils.currentLine=62324910;
 //BA.debugLineNum = 62324910;BA.debugLine="If RecordLocalEmailDataToUpdate.RowCount";
if (true) break;

case 110:
//if
this.state = 113;
if (_recordlocalemaildatatoupdate.getRowCount()>0) { 
this.state = 112;
}if (true) break;

case 112:
//C
this.state = 113;
RDebugUtils.currentLine=62324911;
 //BA.debugLineNum = 62324911;BA.debugLine="Dim CurrTC As String = RecordLocalEmail";
_currtc = _recordlocalemaildatatoupdate.GetString("up_tagcode");
RDebugUtils.currentLine=62324912;
 //BA.debugLineNum = 62324912;BA.debugLine="Dim TCF As String =$\"and up_tagcode = '";
_tcf = ("and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currtc))+"'");
RDebugUtils.currentLine=62324913;
 //BA.debugLineNum = 62324913;BA.debugLine="Dim r2 As ResumableSub = SetUpdateHTTPE";
_r2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r2 = _setupdatehttpemailrecord(_recordlocalemaildatatoupdate,_tcf);
RDebugUtils.currentLine=62324914;
 //BA.debugLineNum = 62324914;BA.debugLine="Wait For(r2) complete (finished As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"), _r2);
this.state = 158;
return;
case 158:
//C
this.state = 113;
_finished = (Boolean) result[0];
;
 if (true) break;

case 113:
//C
this.state = 114;
;
 if (true) break;

case 114:
//C
this.state = 117;
;
 if (true) break;

case 116:
//C
this.state = 117;
this.catchState = 0;
RDebugUtils.currentLine=62324919;
 //BA.debugLineNum = 62324919;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324919",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 117:
//C
this.state = 101;
this.catchState = 0;
;
 if (true) break;

case 118:
//C
this.state = 119;
;
RDebugUtils.currentLine=62324923;
 //BA.debugLineNum = 62324923;BA.debugLine="RecordLocalDataToUpdate.Close";
_recordlocaldatatoupdate.Close();
RDebugUtils.currentLine=62324924;
 //BA.debugLineNum = 62324924;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatedata2server"),(int) (250));
this.state = 159;
return;
case 159:
//C
this.state = 119;
;
RDebugUtils.currentLine=62324927;
 //BA.debugLineNum = 62324927;BA.debugLine="If (ut1 >= 1) And (WITHFILES) Then";
if (true) break;

case 119:
//if
this.state = 136;
if ((_ut1>=1) && (_withfiles)) { 
this.state = 121;
}if (true) break;

case 121:
//C
this.state = 122;
RDebugUtils.currentLine=62324928;
 //BA.debugLineNum = 62324928;BA.debugLine="Dim sSQL As String = $\"select distinct up_";
_ssql = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where 1=1\n"+"														and up_state=0\n"+"														and up_type=1\n"+"														and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc.getText()))+"'");
RDebugUtils.currentLine=62324932;
 //BA.debugLineNum = 62324932;BA.debugLine="Dim RecordLocalDataToUpdate2 As ResultSet";
_recordlocaldatatoupdate2 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate2 = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=62324934;
 //BA.debugLineNum = 62324934;BA.debugLine="If(RecordLocalDataToUpdate2.RowCount >= 1)";
if (true) break;

case 122:
//if
this.state = 135;
if ((_recordlocaldatatoupdate2.getRowCount()>=1)) { 
this.state = 124;
}if (true) break;

case 124:
//C
this.state = 125;
RDebugUtils.currentLine=62324935;
 //BA.debugLineNum = 62324935;BA.debugLine="Do While RecordLocalDataToUpdate2.NextRow";
if (true) break;

case 125:
//do while
this.state = 134;
while (_recordlocaldatatoupdate2.NextRow()) {
this.state = 127;
if (true) break;
}
if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=62324937;
 //BA.debugLineNum = 62324937;BA.debugLine="Try";
if (true) break;

case 128:
//try
this.state = 133;
this.catchState = 132;
this.state = 130;
if (true) break;

case 130:
//C
this.state = 133;
this.catchState = 132;
RDebugUtils.currentLine=62324938;
 //BA.debugLineNum = 62324938;BA.debugLine="Dim CurrTC As String = RecordLocalDataT";
_currtc = _recordlocaldatatoupdate2.GetString("up_tagcode");
RDebugUtils.currentLine=62324939;
 //BA.debugLineNum = 62324939;BA.debugLine="Dim TCF As String =$\"and up_tagcode = '";
_tcf = ("and up_tagcode = '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_currtc))+"'");
RDebugUtils.currentLine=62324940;
 //BA.debugLineNum = 62324940;BA.debugLine="SetUpdateFTPRecord(RecordLocalDataToUpd";
_setupdateftprecord(_recordlocaldatatoupdate2,_withfiles,(int) (1),_tcf);
 if (true) break;

case 132:
//C
this.state = 133;
this.catchState = 0;
RDebugUtils.currentLine=62324942;
 //BA.debugLineNum = 62324942;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("662324942",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 133:
//C
this.state = 125;
this.catchState = 0;
;
 if (true) break;

case 134:
//C
this.state = 135;
;
 if (true) break;

case 135:
//C
this.state = 136;
;
RDebugUtils.currentLine=62324946;
 //BA.debugLineNum = 62324946;BA.debugLine="RecordLocalDataToUpdate2.Close";
_recordlocaldatatoupdate2.Close();
 if (true) break;

case 136:
//C
this.state = 137;
;
 if (true) break;

case 137:
//C
this.state = 138;
;
 if (true) break;

case 138:
//C
this.state = 156;
;
 if (true) break;
if (true) break;

case 139:
//C
this.state = 142;
;
RDebugUtils.currentLine=62324953;
 //BA.debugLineNum = 62324953;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62324954;
 //BA.debugLineNum = 62324954;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62324955;
 //BA.debugLineNum = 62324955;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 141:
//C
this.state = 142;
RDebugUtils.currentLine=62324957;
 //BA.debugLineNum = 62324957;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62324958;
 //BA.debugLineNum = 62324958;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62324959;
 //BA.debugLineNum = 62324959;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 142:
//C
this.state = 145;
;
 if (true) break;

case 144:
//C
this.state = 145;
RDebugUtils.currentLine=62324964;
 //BA.debugLineNum = 62324964;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62324965;
 //BA.debugLineNum = 62324965;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62324966;
 //BA.debugLineNum = 62324966;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 145:
//C
this.state = 148;
;
 if (true) break;

case 147:
//C
this.state = 148;
RDebugUtils.currentLine=62324969;
 //BA.debugLineNum = 62324969;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=62324970;
 //BA.debugLineNum = 62324970;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=62324971;
 //BA.debugLineNum = 62324971;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 148:
//C
this.state = -1;
;
RDebugUtils.currentLine=62324974;
 //BA.debugLineNum = 62324974;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runupdate60last7next() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runupdate60last7next", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "runupdate60last7next", null));}
ResumableSub_RunUpdate60Last7Next rsub = new ResumableSub_RunUpdate60Last7Next(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunUpdate60Last7Next extends BA.ResumableSub {
public ResumableSub_RunUpdate60Last7Next(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
int _totallinesofscripts = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _removesuccessful = false;
boolean _requestsuccessful = false;
String _update_install_info = "";
String _updateinstallfilesname = "";
String _deletefilename = "";
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
boolean _deletesispresent = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resdel = null;
boolean _finish = false;
anywheresoftware.b4a.objects.collections.Map _colinserts = null;
String _mastertagcode = "";
String _childfield = "";
String _tagcodelist = "";
anywheresoftware.b4a.objects.collections.List _newinfolist = null;
String _table = "";
int _i = 0;
boolean _result = false;
String _date = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
String _filen = "";
int _n = 0;
String _script2execute = "";
boolean _completed = false;
anywheresoftware.b4a.BA.IterableList group64;
int index64;
int groupLen64;
int step75;
int limit75;
int step117;
int limit117;
int step137;
int limit137;
int step156;
int limit156;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60489730;
 //BA.debugLineNum = 60489730;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=60489731;
 //BA.debugLineNum = 60489731;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60489732;
 //BA.debugLineNum = 60489732;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60489733;
 //BA.debugLineNum = 60489733;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=60489734;
 //BA.debugLineNum = 60489734;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60489735;
 //BA.debugLineNum = 60489735;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60489736;
 //BA.debugLineNum = 60489736;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60489737;
 //BA.debugLineNum = 60489737;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60489738;
 //BA.debugLineNum = 60489738;BA.debugLine="DUProgressBar2(0,0)";
_duprogressbar2((int) (0),(int) (0));
RDebugUtils.currentLine=60489739;
 //BA.debugLineNum = 60489739;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=60489740;
 //BA.debugLineNum = 60489740;BA.debugLine="lbldataupdateprocess.Text = \"\"";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=60489741;
 //BA.debugLineNum = 60489741;BA.debugLine="ProgressBar1.Visible = True";
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60489748;
 //BA.debugLineNum = 60489748;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso2primeirainstalacao /*String*/ ));
RDebugUtils.currentLine=60489750;
 //BA.debugLineNum = 60489750;BA.debugLine="Dim res As ResumableSub = RemoveAllLocalInfoAndSq";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _removealllocalinfoandsqlfiles();
RDebugUtils.currentLine=60489751;
 //BA.debugLineNum = 60489751;BA.debugLine="Wait For(res) Complete (RemoveSuccessful As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 112;
return;
case 112:
//C
this.state = 1;
_removesuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60489753;
 //BA.debugLineNum = 60489753;BA.debugLine="Dim res As ResumableSub = RequestUpdate60Last7Nex";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _requestupdate60last7next();
RDebugUtils.currentLine=60489754;
 //BA.debugLineNum = 60489754;BA.debugLine="Wait For(res) Complete (RequestSuccessful As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 113;
return;
case 113:
//C
this.state = 1;
_requestsuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60489755;
 //BA.debugLineNum = 60489755;BA.debugLine="If(RequestSuccessful) Then";
if (true) break;

case 1:
//if
this.state = 106;
if ((_requestsuccessful)) { 
this.state = 3;
}else {
this.state = 99;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60489757;
 //BA.debugLineNum = 60489757;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${RequestF";
_update_install_info = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._requestfilenameheaders))+".INFO");
RDebugUtils.currentLine=60489758;
 //BA.debugLineNum = 60489758;BA.debugLine="Dim updateInstallFilesName As String = RequestFi";
_updateinstallfilesname = parent.mostCurrent._requestfilenameheaders;
RDebugUtils.currentLine=60489759;
 //BA.debugLineNum = 60489759;BA.debugLine="Dim deleteFileName As String = $\"${RequestFileNa";
_deletefilename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._requestfilenameheaders))+"-DELETE.sql");
RDebugUtils.currentLine=60489766;
 //BA.debugLineNum = 60489766;BA.debugLine="Dim SqlFilesTotal As Int = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=60489767;
 //BA.debugLineNum = 60489767;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=60489768;
 //BA.debugLineNum = 60489768;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60489769;
 //BA.debugLineNum = 60489769;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60489771;
 //BA.debugLineNum = 60489771;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60489772;
 //BA.debugLineNum = 60489772;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60489773;
 //BA.debugLineNum = 60489773;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=60489774;
 //BA.debugLineNum = 60489774;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=60489775;
 //BA.debugLineNum = 60489775;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=60489776;
 //BA.debugLineNum = 60489776;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60489777;
 //BA.debugLineNum = 60489777;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 4:
//do while
this.state = 56;
while ((_dotry && (_trycount<3))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60489779;
 //BA.debugLineNum = 60489779;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_update_install_info,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_install_info);
RDebugUtils.currentLine=60489780;
 //BA.debugLineNum = 60489780;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _sf);
this.state = 114;
return;
case 114:
//C
this.state = 7;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60489782;
 //BA.debugLineNum = 60489782;BA.debugLine="If Success Then";
if (true) break;

case 7:
//if
this.state = 55;
if (_success) { 
this.state = 9;
}else {
this.state = 54;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=60489783;
 //BA.debugLineNum = 60489783;BA.debugLine="Log(UPDATE_INSTALL_INFO & \" file was download";
anywheresoftware.b4a.keywords.Common.LogImpl("660489783",_update_install_info+" file was download successfully",0);
RDebugUtils.currentLine=60489789;
 //BA.debugLineNum = 60489789;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 52;
this.catchState = 51;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 51;
RDebugUtils.currentLine=60489790;
 //BA.debugLineNum = 60489790;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=60489792;
 //BA.debugLineNum = 60489792;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 13:
//if
this.state = 49;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 15;
}else {
this.state = 48;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60489793;
 //BA.debugLineNum = 60489793;BA.debugLine="Dim JsonStruct As String = File.readstring(S";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_install_info);
RDebugUtils.currentLine=60489794;
 //BA.debugLineNum = 60489794;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=60489795;
 //BA.debugLineNum = 60489795;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=60489796;
 //BA.debugLineNum = 60489796;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=60489797;
 //BA.debugLineNum = 60489797;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\"";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=60489798;
 //BA.debugLineNum = 60489798;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=60489799;
 //BA.debugLineNum = 60489799;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=60489804;
 //BA.debugLineNum = 60489804;BA.debugLine="Dim DeletesIsPresent As Boolean = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60489805;
 //BA.debugLineNum = 60489805;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_deletefilename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deletefilename);
RDebugUtils.currentLine=60489806;
 //BA.debugLineNum = 60489806;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _sf);
this.state = 115;
return;
case 115:
//C
this.state = 16;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60489808;
 //BA.debugLineNum = 60489808;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO DE D";
if (true) break;

case 16:
//if
this.state = 27;
if (_success) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=60489809;
 //BA.debugLineNum = 60489809;BA.debugLine="Log(deleteFileName & \" file was download su";
anywheresoftware.b4a.keywords.Common.LogImpl("660489809",_deletefilename+" file was download successfully",0);
RDebugUtils.currentLine=60489811;
 //BA.debugLineNum = 60489811;BA.debugLine="If File.Exists(Starter.Provider.SharedFolde";
if (true) break;

case 19:
//if
this.state = 24;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deletefilename)) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=60489812;
 //BA.debugLineNum = 60489812;BA.debugLine="DeletesIsPresent = True";
_deletesispresent = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=60489814;
 //BA.debugLineNum = 60489814;BA.debugLine="DeletesIsPresent = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=60489817;
 //BA.debugLineNum = 60489817;BA.debugLine="DeletesIsPresent = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
RDebugUtils.currentLine=60489829;
 //BA.debugLineNum = 60489829;BA.debugLine="If DeletesIsPresent Then";

case 27:
//if
this.state = 46;
if (_deletesispresent) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 46;
RDebugUtils.currentLine=60489830;
 //BA.debugLineNum = 60489830;BA.debugLine="Dim resDel As ResumableSub = MakeDeleteSqlF";
_resdel = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resdel = _makedeletesqlfile(_deletefilename);
RDebugUtils.currentLine=60489831;
 //BA.debugLineNum = 60489831;BA.debugLine="Wait For(resDel) Complete (finish As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _resdel);
this.state = 116;
return;
case 116:
//C
this.state = 46;
_finish = (Boolean) result[0];
;
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=60489833;
 //BA.debugLineNum = 60489833;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 32:
//for
this.state = 45;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group64 = _inserts;
index64 = 0;
groupLen64 = group64.getSize();
this.state = 117;
if (true) break;

case 117:
//C
this.state = 45;
if (index64 < groupLen64) {
this.state = 34;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group64.Get(index64)));}
if (true) break;

case 118:
//C
this.state = 117;
index64++;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=60489834;
 //BA.debugLineNum = 60489834;BA.debugLine="Dim mastertagcode As String = colinserts.G";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=60489835;
 //BA.debugLineNum = 60489835;BA.debugLine="Try";
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
RDebugUtils.currentLine=60489836;
 //BA.debugLineNum = 60489836;BA.debugLine="Dim childfield As String = colinserts.Get";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 51;
RDebugUtils.currentLine=60489838;
 //BA.debugLineNum = 60489838;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=60489839;
 //BA.debugLineNum = 60489839;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660489839",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 51;
;
RDebugUtils.currentLine=60489841;
 //BA.debugLineNum = 60489841;BA.debugLine="Dim tagcodelist As String = colinserts.Get";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=60489842;
 //BA.debugLineNum = 60489842;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\"";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=60489843;
 //BA.debugLineNum = 60489843;BA.debugLine="Dim table As String = colinserts.Get(\"tabl";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=60489845;
 //BA.debugLineNum = 60489845;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 41:
//for
this.state = 44;
step75 = 1;
limit75 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 119;
if (true) break;

case 119:
//C
this.state = 44;
if ((step75 > 0 && _i <= limit75) || (step75 < 0 && _i >= limit75)) this.state = 43;
if (true) break;

case 120:
//C
this.state = 119;
_i = ((int)(0 + _i + step75)) ;
if (true) break;

case 43:
//C
this.state = 120;
RDebugUtils.currentLine=60489846;
 //BA.debugLineNum = 60489846;BA.debugLine="Dim res As ResumableSub = DBStructures.Re";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=60489847;
 //BA.debugLineNum = 60489847;BA.debugLine="Wait For(res) Complete (result As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 121;
return;
case 121:
//C
this.state = 120;
_result = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 118;
;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 49;
;
RDebugUtils.currentLine=60489853;
 //BA.debugLineNum = 60489853;BA.debugLine="SqlFilesTotal = Totalfiles";
parent._sqlfilestotal = _totalfiles;
RDebugUtils.currentLine=60489854;
 //BA.debugLineNum = 60489854;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=60489855;
 //BA.debugLineNum = 60489855;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60489856;
 //BA.debugLineNum = 60489856;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60489857;
 //BA.debugLineNum = 60489857;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60489858;
 //BA.debugLineNum = 60489858;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=60489859;
 //BA.debugLineNum = 60489859;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=60489863;
 //BA.debugLineNum = 60489863;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60489864;
 //BA.debugLineNum = 60489864;BA.debugLine="List1 = File.ReadList(Starter.Provider.Share";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_install_info);
RDebugUtils.currentLine=60489865;
 //BA.debugLineNum = 60489865;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de fic";
parent._sqlfilestotal = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=60489866;
 //BA.debugLineNum = 60489866;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=60489867;
 //BA.debugLineNum = 60489867;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60489868;
 //BA.debugLineNum = 60489868;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60489869;
 //BA.debugLineNum = 60489869;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60489870;
 //BA.debugLineNum = 60489870;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=60489871;
 //BA.debugLineNum = 60489871;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 49:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
RDebugUtils.currentLine=60489874;
 //BA.debugLineNum = 60489874;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660489874",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60489875;
 //BA.debugLineNum = 60489875;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 55;
this.catchState = 0;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=60489878;
 //BA.debugLineNum = 60489878;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660489878",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60489879;
 //BA.debugLineNum = 60489879;BA.debugLine="Log(\"Error downloading file \" & UPDATE_INSTALL";
anywheresoftware.b4a.keywords.Common.LogImpl("660489879","Error downloading file "+_update_install_info,0);
RDebugUtils.currentLine=60489880;
 //BA.debugLineNum = 60489880;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o fich";
_insertalerterrors(("Erro ao Descarregar o ficheiro"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_update_install_info))+""));
RDebugUtils.currentLine=60489881;
 //BA.debugLineNum = 60489881;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 55:
//C
this.state = 4;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=60489884;
 //BA.debugLineNum = 60489884;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=60489891;
 //BA.debugLineNum = 60489891;BA.debugLine="If(SqlFilesTotal > 0) Then";
if (true) break;

case 57:
//if
this.state = 74;
if ((parent._sqlfilestotal>0)) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=60489892;
 //BA.debugLineNum = 60489892;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ ));
RDebugUtils.currentLine=60489894;
 //BA.debugLineNum = 60489894;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60489895;
 //BA.debugLineNum = 60489895;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60489896;
 //BA.debugLineNum = 60489896;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60489898;
 //BA.debugLineNum = 60489898;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60489900;
 //BA.debugLineNum = 60489900;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 60:
//for
this.state = 73;
step117 = 1;
limit117 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 122;
if (true) break;

case 122:
//C
this.state = 73;
if ((step117 > 0 && _i <= limit117) || (step117 < 0 && _i >= limit117)) this.state = 62;
if (true) break;

case 123:
//C
this.state = 122;
_i = ((int)(0 + _i + step117)) ;
if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=60489901;
 //BA.debugLineNum = 60489901;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=60489902;
 //BA.debugLineNum = 60489902;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updateinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=60489904;
 //BA.debugLineNum = 60489904;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
if (true) break;

case 63:
//if
this.state = 66;
if ((anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen))) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=60489905;
 //BA.debugLineNum = 60489905;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fi";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=60489910;
 //BA.debugLineNum = 60489910;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filen,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=60489911;
 //BA.debugLineNum = 60489911;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _sf);
this.state = 124;
return;
case 124:
//C
this.state = 67;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60489913;
 //BA.debugLineNum = 60489913;BA.debugLine="If Success Then";
if (true) break;

case 67:
//if
this.state = 72;
if (_success) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
RDebugUtils.currentLine=60489914;
 //BA.debugLineNum = 60489914;BA.debugLine="Log(fileN & \" file was download successfully\"";
anywheresoftware.b4a.keywords.Common.LogImpl("660489914",_filen+" file was download successfully",0);
 if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=60489916;
 //BA.debugLineNum = 60489916;BA.debugLine="Log(\"Error downloading file \" & fileN)";
anywheresoftware.b4a.keywords.Common.LogImpl("660489916","Error downloading file "+_filen,0);
 if (true) break;

case 72:
//C
this.state = 123;
;
RDebugUtils.currentLine=60489919;
 //BA.debugLineNum = 60489919;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=60489922;
 //BA.debugLineNum = 60489922;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 74:
//C
this.state = 75;
;
RDebugUtils.currentLine=60489927;
 //BA.debugLineNum = 60489927;BA.debugLine="DUProgressBar2(0,0)";
_duprogressbar2((int) (0),(int) (0));
RDebugUtils.currentLine=60489928;
 //BA.debugLineNum = 60489928;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"),(int) (500));
this.state = 125;
return;
case 125:
//C
this.state = 75;
;
RDebugUtils.currentLine=60489935;
 //BA.debugLineNum = 60489935;BA.debugLine="If(SqlFilesTotal > 0) Then";
if (true) break;

case 75:
//if
this.state = 97;
if ((parent._sqlfilestotal>0)) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=60489937;
 //BA.debugLineNum = 60489937;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 78:
//for
this.state = 96;
step137 = 1;
limit137 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 126;
if (true) break;

case 126:
//C
this.state = 96;
if ((step137 > 0 && _i <= limit137) || (step137 < 0 && _i >= limit137)) this.state = 80;
if (true) break;

case 127:
//C
this.state = 126;
_i = ((int)(0 + _i + step137)) ;
if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=60489938;
 //BA.debugLineNum = 60489938;BA.debugLine="TotalLinesOfScripts = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=60489939;
 //BA.debugLineNum = 60489939;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=60489940;
 //BA.debugLineNum = 60489940;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updateinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=60489942;
 //BA.debugLineNum = 60489942;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60489944;
 //BA.debugLineNum = 60489944;BA.debugLine="If (List1.IsInitialized) Then";
if (true) break;

case 81:
//if
this.state = 86;
if ((_list1.IsInitialized())) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
RDebugUtils.currentLine=60489945;
 //BA.debugLineNum = 60489945;BA.debugLine="List1.Clear";
_list1.Clear();
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=60489947;
 //BA.debugLineNum = 60489947;BA.debugLine="List1.Initialize";
_list1.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=60489950;
 //BA.debugLineNum = 60489950;BA.debugLine="Try";

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
RDebugUtils.currentLine=60489951;
 //BA.debugLineNum = 60489951;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=60489952;
 //BA.debugLineNum = 60489952;BA.debugLine="TotalLinesOfScripts = List1.Size";
_totallinesofscripts = _list1.getSize();
 if (true) break;

case 90:
//C
this.state = 91;
this.catchState = 0;
RDebugUtils.currentLine=60489954;
 //BA.debugLineNum = 60489954;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660489954",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 91:
//C
this.state = 92;
this.catchState = 0;
;
RDebugUtils.currentLine=60489957;
 //BA.debugLineNum = 60489957;BA.debugLine="DUProgressBar2(0,0)";
_duprogressbar2((int) (0),(int) (0));
RDebugUtils.currentLine=60489958;
 //BA.debugLineNum = 60489958;BA.debugLine="DataUpdateProgressBar2.visible = True";
parent.mostCurrent._dataupdateprogressbar2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60489959;
 //BA.debugLineNum = 60489959;BA.debugLine="DataUpdateLabelTarefa.Visible = True";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60489960;
 //BA.debugLineNum = 60489960;BA.debugLine="For n = 0 To List1.Size -1";
if (true) break;

case 92:
//for
this.state = 95;
step156 = 1;
limit156 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 128;
if (true) break;

case 128:
//C
this.state = 95;
if ((step156 > 0 && _n <= limit156) || (step156 < 0 && _n >= limit156)) this.state = 94;
if (true) break;

case 129:
//C
this.state = 128;
_n = ((int)(0 + _n + step156)) ;
if (true) break;

case 94:
//C
this.state = 129;
RDebugUtils.currentLine=60489961;
 //BA.debugLineNum = 60489961;BA.debugLine="DataUpdateLabelTarefa.Text = ShareCode.MsgExe";
parent.mostCurrent._dataupdatelabeltarefa.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totallinesofscripts))+"")));
RDebugUtils.currentLine=60489962;
 //BA.debugLineNum = 60489962;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
_script2execute = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=60489963;
 //BA.debugLineNum = 60489963;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"Main",_script2execute,"");
RDebugUtils.currentLine=60489964;
 //BA.debugLineNum = 60489964;BA.debugLine="DUProgressBar2(TotalLinesOfScripts,n)";
_duprogressbar2(_totallinesofscripts,_n);
RDebugUtils.currentLine=60489965;
 //BA.debugLineNum = 60489965;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"),(int) (1));
this.state = 130;
return;
case 130:
//C
this.state = 129;
;
 if (true) break;
if (true) break;

case 95:
//C
this.state = 127;
;
RDebugUtils.currentLine=60489970;
 //BA.debugLineNum = 60489970;BA.debugLine="DataUpdateProgressBar2.visible = False";
parent.mostCurrent._dataupdateprogressbar2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60489971;
 //BA.debugLineNum = 60489971;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60489972;
 //BA.debugLineNum = 60489972;BA.debugLine="DUProgressBar(SqlFilesTotal,n)";
_duprogressbar(parent._sqlfilestotal,_n);
RDebugUtils.currentLine=60489973;
 //BA.debugLineNum = 60489973;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"),(int) (1));
this.state = 131;
return;
case 131:
//C
this.state = 127;
;
 if (true) break;
if (true) break;

case 96:
//C
this.state = 97;
;
RDebugUtils.currentLine=60489980;
 //BA.debugLineNum = 60489980;BA.debugLine="Dim res As ResumableSub = SendServerProcessComp";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _sendserverprocesscomplete(anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._requestfilenameheaders,dataupdate.getObject());
RDebugUtils.currentLine=60489981;
 //BA.debugLineNum = 60489981;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdate60last7next"), _res);
this.state = 132;
return;
case 132:
//C
this.state = 97;
_completed = (Boolean) result[0];
;
 if (true) break;

case 97:
//C
this.state = 106;
;
 if (true) break;

case 99:
//C
this.state = 100;
RDebugUtils.currentLine=60489986;
 //BA.debugLineNum = 60489986;BA.debugLine="MsgboxAsync(ShareCode.MsgErroProc60last7new,Shar";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgerroproc60last7new /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=60489987;
 //BA.debugLineNum = 60489987;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1";
if (true) break;

case 100:
//if
this.state = 105;
if (parent.mostCurrent._progressbar1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 102;
;}if (true) break;

case 102:
//C
this.state = 105;
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
if (true) break;

case 105:
//C
this.state = 106;
;
RDebugUtils.currentLine=60489988;
 //BA.debugLineNum = 60489988;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=60489990;
 //BA.debugLineNum = 60489990;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1.";

case 106:
//if
this.state = 111;
if (parent.mostCurrent._progressbar1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 108;
;}if (true) break;

case 108:
//C
this.state = 111;
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
if (true) break;

case 111:
//C
this.state = -1;
;
RDebugUtils.currentLine=60489991;
 //BA.debugLineNum = 60489991;BA.debugLine="StartService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60489992;
 //BA.debugLineNum = 60489992;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60489993;
 //BA.debugLineNum = 60489993;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=60489994;
 //BA.debugLineNum = 60489994;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runupdateonday() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runupdateonday", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "runupdateonday", null));}
ResumableSub_RunUpdateOnDay rsub = new ResumableSub_RunUpdateOnDay(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunUpdateOnDay extends BA.ResumableSub {
public ResumableSub_RunUpdateOnDay(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
int _totallinesofscripts = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _removesuccessful = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resreq = null;
boolean _requestsuccessful = false;
String _update_install_info = "";
String _updateinstallfilesname = "";
String _deletefilename = "";
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
boolean _deletesispresent = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resdel = null;
boolean _finish = false;
anywheresoftware.b4a.objects.collections.Map _colinserts = null;
String _mastertagcode = "";
String _childfield = "";
String _tagcodelist = "";
anywheresoftware.b4a.objects.collections.List _newinfolist = null;
String _table = "";
int _i = 0;
boolean _result = false;
String _date = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
String _filen = "";
boolean _alreadydeleted = false;
int _n = 0;
String _script2execute = "";
String _sql2del = "";
boolean _completed = false;
anywheresoftware.b4a.BA.IterableList group65;
int index65;
int groupLen65;
int step76;
int limit76;
int step123;
int limit123;
int step143;
int limit143;
int step163;
int limit163;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60620801;
 //BA.debugLineNum = 60620801;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=60620802;
 //BA.debugLineNum = 60620802;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60620803;
 //BA.debugLineNum = 60620803;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60620804;
 //BA.debugLineNum = 60620804;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=60620805;
 //BA.debugLineNum = 60620805;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60620806;
 //BA.debugLineNum = 60620806;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60620807;
 //BA.debugLineNum = 60620807;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60620808;
 //BA.debugLineNum = 60620808;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60620809;
 //BA.debugLineNum = 60620809;BA.debugLine="DUProgressBar2(0,0)";
_duprogressbar2((int) (0),(int) (0));
RDebugUtils.currentLine=60620810;
 //BA.debugLineNum = 60620810;BA.debugLine="Dim TotalLinesOfScripts As Int = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=60620811;
 //BA.debugLineNum = 60620811;BA.debugLine="lbldataupdateprocess.Text = \"\"";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=60620812;
 //BA.debugLineNum = 60620812;BA.debugLine="ProgressBar1.Visible = True";
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60620816;
 //BA.debugLineNum = 60620816;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlepasso3primeirainstalacao /*String*/ ));
RDebugUtils.currentLine=60620818;
 //BA.debugLineNum = 60620818;BA.debugLine="Dim res As ResumableSub = RemoveAllLocalInfoAndSq";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _removealllocalinfoandsqlfiles();
RDebugUtils.currentLine=60620819;
 //BA.debugLineNum = 60620819;BA.debugLine="Wait For(res) Complete (RemoveSuccessful As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _res);
this.state = 131;
return;
case 131:
//C
this.state = 1;
_removesuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60620821;
 //BA.debugLineNum = 60620821;BA.debugLine="Dim resReq As ResumableSub = RequestUpdateOnDay '";
_resreq = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resreq = _requestupdateonday();
RDebugUtils.currentLine=60620822;
 //BA.debugLineNum = 60620822;BA.debugLine="Wait For(resReq) Complete (RequestSuccessful As B";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _resreq);
this.state = 132;
return;
case 132:
//C
this.state = 1;
_requestsuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60620823;
 //BA.debugLineNum = 60620823;BA.debugLine="If(RequestSuccessful) Then";
if (true) break;

case 1:
//if
this.state = 124;
if ((_requestsuccessful)) { 
this.state = 3;
}else {
this.state = 117;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60620825;
 //BA.debugLineNum = 60620825;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${RequestF";
_update_install_info = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._requestfilenameonday))+".INFO");
RDebugUtils.currentLine=60620826;
 //BA.debugLineNum = 60620826;BA.debugLine="Dim updateInstallFilesName As String = RequestFi";
_updateinstallfilesname = parent.mostCurrent._requestfilenameonday;
RDebugUtils.currentLine=60620827;
 //BA.debugLineNum = 60620827;BA.debugLine="Dim deleteFileName As String = $\"${RequestFileNa";
_deletefilename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._requestfilenameonday))+"-DELETE.sql");
RDebugUtils.currentLine=60620834;
 //BA.debugLineNum = 60620834;BA.debugLine="Dim SqlFilesTotal As Int = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=60620835;
 //BA.debugLineNum = 60620835;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=60620836;
 //BA.debugLineNum = 60620836;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60620837;
 //BA.debugLineNum = 60620837;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60620839;
 //BA.debugLineNum = 60620839;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60620840;
 //BA.debugLineNum = 60620840;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60620841;
 //BA.debugLineNum = 60620841;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=60620842;
 //BA.debugLineNum = 60620842;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=60620843;
 //BA.debugLineNum = 60620843;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=60620844;
 //BA.debugLineNum = 60620844;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60620845;
 //BA.debugLineNum = 60620845;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 4:
//do while
this.state = 56;
while ((_dotry && (_trycount<3))) {
this.state = 6;
if (true) break;
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60620847;
 //BA.debugLineNum = 60620847;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_update_install_info,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_install_info);
RDebugUtils.currentLine=60620848;
 //BA.debugLineNum = 60620848;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _sf);
this.state = 133;
return;
case 133:
//C
this.state = 7;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60620850;
 //BA.debugLineNum = 60620850;BA.debugLine="If Success Then";
if (true) break;

case 7:
//if
this.state = 55;
if (_success) { 
this.state = 9;
}else {
this.state = 54;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=60620851;
 //BA.debugLineNum = 60620851;BA.debugLine="Log(UPDATE_INSTALL_INFO & \" file was download";
anywheresoftware.b4a.keywords.Common.LogImpl("660620851",_update_install_info+" file was download successfully",0);
RDebugUtils.currentLine=60620857;
 //BA.debugLineNum = 60620857;BA.debugLine="Try";
if (true) break;

case 10:
//try
this.state = 52;
this.catchState = 51;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 51;
RDebugUtils.currentLine=60620858;
 //BA.debugLineNum = 60620858;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=60620860;
 //BA.debugLineNum = 60620860;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 13:
//if
this.state = 49;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 15;
}else {
this.state = 48;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60620861;
 //BA.debugLineNum = 60620861;BA.debugLine="Dim JsonStruct As String = File.readstring(S";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_install_info);
RDebugUtils.currentLine=60620863;
 //BA.debugLineNum = 60620863;BA.debugLine="Log(JsonStruct)";
anywheresoftware.b4a.keywords.Common.LogImpl("660620863",_jsonstruct,0);
RDebugUtils.currentLine=60620865;
 //BA.debugLineNum = 60620865;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=60620866;
 //BA.debugLineNum = 60620866;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=60620867;
 //BA.debugLineNum = 60620867;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=60620868;
 //BA.debugLineNum = 60620868;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\"";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=60620869;
 //BA.debugLineNum = 60620869;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=60620870;
 //BA.debugLineNum = 60620870;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=60620875;
 //BA.debugLineNum = 60620875;BA.debugLine="Dim DeletesIsPresent As Boolean = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60620876;
 //BA.debugLineNum = 60620876;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_deletefilename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deletefilename);
RDebugUtils.currentLine=60620877;
 //BA.debugLineNum = 60620877;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _sf);
this.state = 134;
return;
case 134:
//C
this.state = 16;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60620879;
 //BA.debugLineNum = 60620879;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO DE D";
if (true) break;

case 16:
//if
this.state = 27;
if (_success) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=60620880;
 //BA.debugLineNum = 60620880;BA.debugLine="Log(deleteFileName & \" file was download su";
anywheresoftware.b4a.keywords.Common.LogImpl("660620880",_deletefilename+" file was download successfully",0);
RDebugUtils.currentLine=60620882;
 //BA.debugLineNum = 60620882;BA.debugLine="If File.Exists(Starter.Provider.SharedFolde";
if (true) break;

case 19:
//if
this.state = 24;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deletefilename)) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=60620883;
 //BA.debugLineNum = 60620883;BA.debugLine="DeletesIsPresent = True";
_deletesispresent = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=60620885;
 //BA.debugLineNum = 60620885;BA.debugLine="DeletesIsPresent = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=60620888;
 //BA.debugLineNum = 60620888;BA.debugLine="DeletesIsPresent = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
RDebugUtils.currentLine=60620901;
 //BA.debugLineNum = 60620901;BA.debugLine="If DeletesIsPresent Then";

case 27:
//if
this.state = 46;
if (_deletesispresent) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 46;
RDebugUtils.currentLine=60620902;
 //BA.debugLineNum = 60620902;BA.debugLine="Dim resDel As ResumableSub = MakeDeleteSqlF";
_resdel = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resdel = _makedeletesqlfile(_deletefilename);
RDebugUtils.currentLine=60620903;
 //BA.debugLineNum = 60620903;BA.debugLine="Wait For(resDel) Complete (finish As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _resdel);
this.state = 135;
return;
case 135:
//C
this.state = 46;
_finish = (Boolean) result[0];
;
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=60620905;
 //BA.debugLineNum = 60620905;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 32:
//for
this.state = 45;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group65 = _inserts;
index65 = 0;
groupLen65 = group65.getSize();
this.state = 136;
if (true) break;

case 136:
//C
this.state = 45;
if (index65 < groupLen65) {
this.state = 34;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group65.Get(index65)));}
if (true) break;

case 137:
//C
this.state = 136;
index65++;
if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=60620906;
 //BA.debugLineNum = 60620906;BA.debugLine="Dim mastertagcode As String = colinserts.G";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=60620907;
 //BA.debugLineNum = 60620907;BA.debugLine="Try";
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
RDebugUtils.currentLine=60620908;
 //BA.debugLineNum = 60620908;BA.debugLine="Dim childfield As String = colinserts.Get";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 51;
RDebugUtils.currentLine=60620910;
 //BA.debugLineNum = 60620910;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=60620911;
 //BA.debugLineNum = 60620911;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660620911",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 51;
;
RDebugUtils.currentLine=60620913;
 //BA.debugLineNum = 60620913;BA.debugLine="Dim tagcodelist As String = colinserts.Get";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=60620914;
 //BA.debugLineNum = 60620914;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\"";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=60620915;
 //BA.debugLineNum = 60620915;BA.debugLine="Dim table As String = colinserts.Get(\"tabl";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=60620917;
 //BA.debugLineNum = 60620917;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 41:
//for
this.state = 44;
step76 = 1;
limit76 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 138;
if (true) break;

case 138:
//C
this.state = 44;
if ((step76 > 0 && _i <= limit76) || (step76 < 0 && _i >= limit76)) this.state = 43;
if (true) break;

case 139:
//C
this.state = 138;
_i = ((int)(0 + _i + step76)) ;
if (true) break;

case 43:
//C
this.state = 139;
RDebugUtils.currentLine=60620918;
 //BA.debugLineNum = 60620918;BA.debugLine="Dim res As ResumableSub = DBStructures.Re";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=60620919;
 //BA.debugLineNum = 60620919;BA.debugLine="Wait For(res) Complete (result As Boolean";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _res);
this.state = 140;
return;
case 140:
//C
this.state = 139;
_result = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 137;
;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 49;
;
RDebugUtils.currentLine=60620925;
 //BA.debugLineNum = 60620925;BA.debugLine="SqlFilesTotal = Totalfiles";
parent._sqlfilestotal = _totalfiles;
RDebugUtils.currentLine=60620926;
 //BA.debugLineNum = 60620926;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=60620927;
 //BA.debugLineNum = 60620927;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60620928;
 //BA.debugLineNum = 60620928;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60620929;
 //BA.debugLineNum = 60620929;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60620930;
 //BA.debugLineNum = 60620930;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=60620931;
 //BA.debugLineNum = 60620931;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=60620935;
 //BA.debugLineNum = 60620935;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60620936;
 //BA.debugLineNum = 60620936;BA.debugLine="List1 = File.ReadList(Starter.Provider.Share";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_install_info);
RDebugUtils.currentLine=60620937;
 //BA.debugLineNum = 60620937;BA.debugLine="SqlFilesTotal = List1.Get(0) ' Numero de fic";
parent._sqlfilestotal = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=60620938;
 //BA.debugLineNum = 60620938;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=60620939;
 //BA.debugLineNum = 60620939;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60620940;
 //BA.debugLineNum = 60620940;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60620941;
 //BA.debugLineNum = 60620941;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60620942;
 //BA.debugLineNum = 60620942;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=60620943;
 //BA.debugLineNum = 60620943;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 49:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
this.catchState = 0;
RDebugUtils.currentLine=60620946;
 //BA.debugLineNum = 60620946;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660620946",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60620947;
 //BA.debugLineNum = 60620947;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 52:
//C
this.state = 55;
this.catchState = 0;
;
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=60620950;
 //BA.debugLineNum = 60620950;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660620950",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60620951;
 //BA.debugLineNum = 60620951;BA.debugLine="Log(\"Error downloading file \" & UPDATE_INSTALL";
anywheresoftware.b4a.keywords.Common.LogImpl("660620951","Error downloading file "+_update_install_info,0);
RDebugUtils.currentLine=60620952;
 //BA.debugLineNum = 60620952;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o fich";
_insertalerterrors(("Erro ao Descarregar o ficheiro"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_update_install_info))+""));
RDebugUtils.currentLine=60620953;
 //BA.debugLineNum = 60620953;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 55:
//C
this.state = 4;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=60620956;
 //BA.debugLineNum = 60620956;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=60620960;
 //BA.debugLineNum = 60620960;BA.debugLine="If (SqlFilesTotal <= 0) Then";
if (true) break;

case 57:
//if
this.state = 60;
if ((parent._sqlfilestotal<=0)) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=60620961;
 //BA.debugLineNum = 60620961;BA.debugLine="lbldataupdateprocess.TextColor = Colors.Red";
parent.mostCurrent._lbldataupdateprocess.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Red);
RDebugUtils.currentLine=60620962;
 //BA.debugLineNum = 60620962;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgNaoExi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgnaoexistemactualizacoes /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=60620971;
 //BA.debugLineNum = 60620971;BA.debugLine="If(SqlFilesTotal > 0) Then";

case 60:
//if
this.state = 77;
if ((parent._sqlfilestotal>0)) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=60620972;
 //BA.debugLineNum = 60620972;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ ));
RDebugUtils.currentLine=60620974;
 //BA.debugLineNum = 60620974;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60620975;
 //BA.debugLineNum = 60620975;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60620976;
 //BA.debugLineNum = 60620976;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60620978;
 //BA.debugLineNum = 60620978;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60620979;
 //BA.debugLineNum = 60620979;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60620981;
 //BA.debugLineNum = 60620981;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 63:
//for
this.state = 76;
step123 = 1;
limit123 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 141;
if (true) break;

case 141:
//C
this.state = 76;
if ((step123 > 0 && _i <= limit123) || (step123 < 0 && _i >= limit123)) this.state = 65;
if (true) break;

case 142:
//C
this.state = 141;
_i = ((int)(0 + _i + step123)) ;
if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=60620982;
 //BA.debugLineNum = 60620982;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=60620983;
 //BA.debugLineNum = 60620983;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updateinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=60620985;
 //BA.debugLineNum = 60620985;BA.debugLine="If(File.Exists(Starter.Provider.SharedFolder,";
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
RDebugUtils.currentLine=60620986;
 //BA.debugLineNum = 60620986;BA.debugLine="File.Delete(Starter.Provider.SharedFolder, fi";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
 if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=60620991;
 //BA.debugLineNum = 60620991;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filen,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=60620992;
 //BA.debugLineNum = 60620992;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPat";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _sf);
this.state = 143;
return;
case 143:
//C
this.state = 70;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60620994;
 //BA.debugLineNum = 60620994;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=60620995;
 //BA.debugLineNum = 60620995;BA.debugLine="Log(fileN & \" file was download successfully\"";
anywheresoftware.b4a.keywords.Common.LogImpl("660620995",_filen+" file was download successfully",0);
 if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=60620997;
 //BA.debugLineNum = 60620997;BA.debugLine="Log(\"Error downloading file \" & fileN)";
anywheresoftware.b4a.keywords.Common.LogImpl("660620997","Error downloading file "+_filen,0);
 if (true) break;

case 75:
//C
this.state = 142;
;
RDebugUtils.currentLine=60621000;
 //BA.debugLineNum = 60621000;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=60621003;
 //BA.debugLineNum = 60621003;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=60621008;
 //BA.debugLineNum = 60621008;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60621009;
 //BA.debugLineNum = 60621009;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"),(int) (500));
this.state = 144;
return;
case 144:
//C
this.state = 78;
;
RDebugUtils.currentLine=60621015;
 //BA.debugLineNum = 60621015;BA.debugLine="If(SqlFilesTotal > 0) Then";
if (true) break;

case 78:
//if
this.state = 115;
if ((parent._sqlfilestotal>0)) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=60621017;
 //BA.debugLineNum = 60621017;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 81:
//for
this.state = 114;
step143 = 1;
limit143 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 145;
if (true) break;

case 145:
//C
this.state = 114;
if ((step143 > 0 && _i <= limit143) || (step143 < 0 && _i >= limit143)) this.state = 83;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step143)) ;
if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=60621018;
 //BA.debugLineNum = 60621018;BA.debugLine="TotalLinesOfScripts = 0";
_totallinesofscripts = (int) (0);
RDebugUtils.currentLine=60621019;
 //BA.debugLineNum = 60621019;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=60621020;
 //BA.debugLineNum = 60621020;BA.debugLine="Dim fileN As String = $\"${updateInstallFilesNa";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updateinstallfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=60621022;
 //BA.debugLineNum = 60621022;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60621024;
 //BA.debugLineNum = 60621024;BA.debugLine="If (List1.IsInitialized) Then";
if (true) break;

case 84:
//if
this.state = 89;
if ((_list1.IsInitialized())) { 
this.state = 86;
}else {
this.state = 88;
}if (true) break;

case 86:
//C
this.state = 89;
RDebugUtils.currentLine=60621025;
 //BA.debugLineNum = 60621025;BA.debugLine="List1.Clear";
_list1.Clear();
 if (true) break;

case 88:
//C
this.state = 89;
RDebugUtils.currentLine=60621027;
 //BA.debugLineNum = 60621027;BA.debugLine="List1.Initialize";
_list1.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=60621030;
 //BA.debugLineNum = 60621030;BA.debugLine="Try";

case 89:
//try
this.state = 94;
this.catchState = 93;
this.state = 91;
if (true) break;

case 91:
//C
this.state = 94;
this.catchState = 93;
RDebugUtils.currentLine=60621031;
 //BA.debugLineNum = 60621031;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filen);
RDebugUtils.currentLine=60621032;
 //BA.debugLineNum = 60621032;BA.debugLine="TotalLinesOfScripts = List1.Size";
_totallinesofscripts = _list1.getSize();
 if (true) break;

case 93:
//C
this.state = 94;
this.catchState = 0;
RDebugUtils.currentLine=60621034;
 //BA.debugLineNum = 60621034;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660621034",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 94:
//C
this.state = 95;
this.catchState = 0;
;
RDebugUtils.currentLine=60621037;
 //BA.debugLineNum = 60621037;BA.debugLine="DUProgressBar2(0,0)";
_duprogressbar2((int) (0),(int) (0));
RDebugUtils.currentLine=60621038;
 //BA.debugLineNum = 60621038;BA.debugLine="DataUpdateProgressBar2.visible = True";
parent.mostCurrent._dataupdateprogressbar2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60621039;
 //BA.debugLineNum = 60621039;BA.debugLine="DataUpdateLabelTarefa.Visible = True";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60621040;
 //BA.debugLineNum = 60621040;BA.debugLine="Dim AlreadyDeleted As Boolean = False";
_alreadydeleted = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60621042;
 //BA.debugLineNum = 60621042;BA.debugLine="For n = 0 To List1.Size -1";
if (true) break;

case 95:
//for
this.state = 113;
step163 = 1;
limit163 = (int) (_list1.getSize()-1);
_n = (int) (0) ;
this.state = 147;
if (true) break;

case 147:
//C
this.state = 113;
if ((step163 > 0 && _n <= limit163) || (step163 < 0 && _n >= limit163)) this.state = 97;
if (true) break;

case 148:
//C
this.state = 147;
_n = ((int)(0 + _n + step163)) ;
if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=60621043;
 //BA.debugLineNum = 60621043;BA.debugLine="DataUpdateLabelTarefa.Text = ShareCode.MsgExe";
parent.mostCurrent._dataupdatelabeltarefa.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_n))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totallinesofscripts))+"")));
RDebugUtils.currentLine=60621044;
 //BA.debugLineNum = 60621044;BA.debugLine="Dim Script2Execute As String = List1.Get(n)";
_script2execute = BA.ObjectToString(_list1.Get(_n));
RDebugUtils.currentLine=60621049;
 //BA.debugLineNum = 60621049;BA.debugLine="If Script2Execute.Contains(\"INSERT INTO\") And";
if (true) break;

case 98:
//if
this.state = 112;
if (_script2execute.contains("INSERT INTO") && _script2execute.contains("dta_tablecontrol") && anywheresoftware.b4a.keywords.Common.Not(_alreadydeleted)) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=60621051;
 //BA.debugLineNum = 60621051;BA.debugLine="Try";
if (true) break;

case 101:
//try
this.state = 106;
this.catchState = 105;
this.state = 103;
if (true) break;

case 103:
//C
this.state = 106;
this.catchState = 105;
RDebugUtils.currentLine=60621052;
 //BA.debugLineNum = 60621052;BA.debugLine="Dim Sql2Del As String = \"delete from dta_ta";
_sql2del = "delete from dta_tablecontrol";
RDebugUtils.currentLine=60621053;
 //BA.debugLineNum = 60621053;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(Sql2Del)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sql2del);
RDebugUtils.currentLine=60621054;
 //BA.debugLineNum = 60621054;BA.debugLine="Log(Sql2Del)";
anywheresoftware.b4a.keywords.Common.LogImpl("660621054",_sql2del,0);
 if (true) break;

case 105:
//C
this.state = 106;
this.catchState = 0;
RDebugUtils.currentLine=60621056;
 //BA.debugLineNum = 60621056;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660621056",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=60621059;
 //BA.debugLineNum = 60621059;BA.debugLine="Try";

case 106:
//try
this.state = 111;
this.catchState = 0;
this.catchState = 110;
this.state = 108;
if (true) break;

case 108:
//C
this.state = 111;
this.catchState = 110;
RDebugUtils.currentLine=60621060;
 //BA.debugLineNum = 60621060;BA.debugLine="Dim Sql2Del As String = \"delete from dta_ta";
_sql2del = "delete from dta_tablecontrol_items";
RDebugUtils.currentLine=60621061;
 //BA.debugLineNum = 60621061;BA.debugLine="Starter.LocalSQLEVC.ExecNonQuery(Sql2Del)";
parent.mostCurrent._starter._localsqlevc /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sql2del);
RDebugUtils.currentLine=60621062;
 //BA.debugLineNum = 60621062;BA.debugLine="Log(Sql2Del)";
anywheresoftware.b4a.keywords.Common.LogImpl("660621062",_sql2del,0);
 if (true) break;

case 110:
//C
this.state = 111;
this.catchState = 0;
RDebugUtils.currentLine=60621064;
 //BA.debugLineNum = 60621064;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660621064",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 111:
//C
this.state = 112;
this.catchState = 0;
;
RDebugUtils.currentLine=60621066;
 //BA.debugLineNum = 60621066;BA.debugLine="AlreadyDeleted = True";
_alreadydeleted = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 112:
//C
this.state = 148;
;
RDebugUtils.currentLine=60621069;
 //BA.debugLineNum = 60621069;BA.debugLine="Utils.SaveSQLToLog(\"Main\",Script2Execute, \"\")";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"Main",_script2execute,"");
RDebugUtils.currentLine=60621070;
 //BA.debugLineNum = 60621070;BA.debugLine="DUProgressBar2(TotalLinesOfScripts,n)";
_duprogressbar2(_totallinesofscripts,_n);
RDebugUtils.currentLine=60621071;
 //BA.debugLineNum = 60621071;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"),(int) (1));
this.state = 149;
return;
case 149:
//C
this.state = 148;
;
 if (true) break;
if (true) break;

case 113:
//C
this.state = 146;
;
RDebugUtils.currentLine=60621076;
 //BA.debugLineNum = 60621076;BA.debugLine="DataUpdateProgressBar2.visible = False";
parent.mostCurrent._dataupdateprogressbar2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60621077;
 //BA.debugLineNum = 60621077;BA.debugLine="DataUpdateLabelTarefa.Visible = False";
parent.mostCurrent._dataupdatelabeltarefa.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60621078;
 //BA.debugLineNum = 60621078;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
RDebugUtils.currentLine=60621079;
 //BA.debugLineNum = 60621079;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"),(int) (1));
this.state = 150;
return;
case 150:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 114:
//C
this.state = 115;
;
RDebugUtils.currentLine=60621086;
 //BA.debugLineNum = 60621086;BA.debugLine="Dim res As ResumableSub = SendServerProcessComp";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _sendserverprocesscomplete(anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._requestfilenameonday,dataupdate.getObject());
RDebugUtils.currentLine=60621087;
 //BA.debugLineNum = 60621087;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runupdateonday"), _res);
this.state = 151;
return;
case 151:
//C
this.state = 115;
_completed = (Boolean) result[0];
;
 if (true) break;

case 115:
//C
this.state = 124;
;
 if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=60621090;
 //BA.debugLineNum = 60621090;BA.debugLine="MsgboxAsync(ShareCode.MsgErroProc60last7new,Shar";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgerroproc60last7new /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
RDebugUtils.currentLine=60621091;
 //BA.debugLineNum = 60621091;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1";
if (true) break;

case 118:
//if
this.state = 123;
if (parent.mostCurrent._progressbar1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 120;
;}if (true) break;

case 120:
//C
this.state = 123;
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
if (true) break;

case 123:
//C
this.state = 124;
;
RDebugUtils.currentLine=60621092;
 //BA.debugLineNum = 60621092;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 124:
//C
this.state = 125;
;
RDebugUtils.currentLine=60621095;
 //BA.debugLineNum = 60621095;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDataUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*String*/ ));
RDebugUtils.currentLine=60621096;
 //BA.debugLineNum = 60621096;BA.debugLine="If ProgressBar1.Visible = True Then ProgressBar1.";
if (true) break;

case 125:
//if
this.state = 130;
if (parent.mostCurrent._progressbar1.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 127;
;}if (true) break;

case 127:
//C
this.state = 130;
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
if (true) break;

case 130:
//C
this.state = -1;
;
RDebugUtils.currentLine=60621098;
 //BA.debugLineNum = 60621098;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Share";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_upd.log"),parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=60621099;
 //BA.debugLineNum = 60621099;BA.debugLine="StartService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60621100;
 //BA.debugLineNum = 60621100;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60621101;
 //BA.debugLineNum = 60621101;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=60621102;
 //BA.debugLineNum = 60621102;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _runsync(String _date2watch,boolean _syncdates) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runsync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "runsync", new Object[] {_date2watch,_syncdates}));}
ResumableSub_RunSync rsub = new ResumableSub_RunSync(null,_date2watch,_syncdates);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RunSync extends BA.ResumableSub {
public ResumableSub_RunSync(xevolution.vrcg.devdemov2400.dataupdate parent,String _date2watch,boolean _syncdates) {
this.parent = parent;
this._date2watch = _date2watch;
this._syncdates = _syncdates;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _date2watch;
boolean _syncdates;
String _filteroftc = "";
int _reccounter = 0;
boolean _withfiles = false;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordlocaldatatoupdate = null;
String _ssqlemails = "";
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordlocalemaildatatoupdate = null;
boolean _emailcheck = false;
int _ut0 = 0;
int _ut1 = 0;
int _n = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r1 = null;
boolean _finished = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _r2 = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _recordlocaldatatoupdate2 = null;
int _n1 = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _requestsuccessful = false;
String _update_file_info = "";
String _updatesqlfilesname = "";
String _deletefilename = "";
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
boolean _deletesispresent = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _resdel = null;
boolean _finish = false;
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _completed = false;
boolean _isfilesdeleted = false;
anywheresoftware.b4a.objects.collections.List _ftpdocslist = null;
int _totaldocs = 0;
anywheresoftware.b4a.objects.collections.List _dates2sync = null;
long _idatel = 0L;
long _edatel = 0L;
long _lmdate = 0L;
Object _sfl = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
String _fname = "";
anywheresoftware.b4a.objects.collections.List _ftptemplateslist = null;
int _totaltemplates = 0;
String _fname2 = "";
String _ofname = "";
anywheresoftware.b4a.objects.collections.List _ftpinternolist = null;
boolean _removesuccessful = false;
anywheresoftware.b4a.BA.IterableList group166;
int index166;
int groupLen166;
int step177;
int limit177;
int step190;
int limit190;
int step249;
int limit249;
int step286;
int limit286;
int step319;
int limit319;
int step334;
int limit334;
int step375;
int limit375;
int step389;
int limit389;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60817409;
 //BA.debugLineNum = 60817409;BA.debugLine="ShareCode.GlobalEventsTimer = 0";
parent.mostCurrent._sharecode._globaleventstimer /*int*/  = (int) (0);
RDebugUtils.currentLine=60817410;
 //BA.debugLineNum = 60817410;BA.debugLine="Dim FilterOfTC As String = \"\"";
_filteroftc = "";
RDebugUtils.currentLine=60817414;
 //BA.debugLineNum = 60817414;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60817415;
 //BA.debugLineNum = 60817415;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60817416;
 //BA.debugLineNum = 60817416;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=60817417;
 //BA.debugLineNum = 60817417;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60817418;
 //BA.debugLineNum = 60817418;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60817419;
 //BA.debugLineNum = 60817419;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60817420;
 //BA.debugLineNum = 60817420;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleactualizacao /*String*/ ));
RDebugUtils.currentLine=60817421;
 //BA.debugLineNum = 60817421;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=60817423;
 //BA.debugLineNum = 60817423;BA.debugLine="Dim RecCounter As Int = LocalDataToUpdate";
_reccounter = _localdatatoupdate();
RDebugUtils.currentLine=60817424;
 //BA.debugLineNum = 60817424;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (250));
this.state = 314;
return;
case 314:
//C
this.state = 1;
;
RDebugUtils.currentLine=60817429;
 //BA.debugLineNum = 60817429;BA.debugLine="ShareCode.AwakeDevice(True)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60817431;
 //BA.debugLineNum = 60817431;BA.debugLine="If ShareCode.AutoSyncFromLogin Then ' Se veio do";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._sharecode._autosyncfromlogin /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60817432;
 //BA.debugLineNum = 60817432;BA.debugLine="RecCounter = 0";
_reccounter = (int) (0);
 if (true) break;
;
RDebugUtils.currentLine=60817435;
 //BA.debugLineNum = 60817435;BA.debugLine="If (RecCounter > 0) Then";

case 4:
//if
this.state = 73;
if ((_reccounter>0)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=60817439;
 //BA.debugLineNum = 60817439;BA.debugLine="Log(\"»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817439","»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»",0);
RDebugUtils.currentLine=60817440;
 //BA.debugLineNum = 60817440;BA.debugLine="Log(\"SENDING OFFLINE DATA TO SERVER\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817440","SENDING OFFLINE DATA TO SERVER",0);
RDebugUtils.currentLine=60817441;
 //BA.debugLineNum = 60817441;BA.debugLine="Log(\"»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817441","»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»",0);
RDebugUtils.currentLine=60817443;
 //BA.debugLineNum = 60817443;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgSendDataS";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgsenddataserver /*String*/ ));
RDebugUtils.currentLine=60817444;
 //BA.debugLineNum = 60817444;BA.debugLine="Dim WITHFILES As Boolean = True";
_withfiles = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60817446;
 //BA.debugLineNum = 60817446;BA.debugLine="If Utils.NNE(ShareCode.TCF) Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._tcf /*String*/ )) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=60817447;
 //BA.debugLineNum = 60817447;BA.debugLine="Dim FilterOfTC As String = $\"and up_tagcode in";
_filteroftc = ("and up_tagcode in ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._tcf /*String*/ ))+")");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=60817449;
 //BA.debugLineNum = 60817449;BA.debugLine="Dim FilterOfTC As String = \"\"";
_filteroftc = "";
 if (true) break;
;
RDebugUtils.currentLine=60817452;
 //BA.debugLineNum = 60817452;BA.debugLine="Try";

case 12:
//try
this.state = 17;
this.catchState = 16;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 17;
this.catchState = 16;
RDebugUtils.currentLine=60817453;
 //BA.debugLineNum = 60817453;BA.debugLine="Dim sSQL As String = $\"select distinct up_date,";
_ssql = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=0 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filteroftc))+"");
RDebugUtils.currentLine=60817454;
 //BA.debugLineNum = 60817454;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Star";
_recordlocaldatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
 if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
RDebugUtils.currentLine=60817456;
 //BA.debugLineNum = 60817456;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817456",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60817457;
 //BA.debugLineNum = 60817457;BA.debugLine="Dim sSQL As String = $\"select distinct up_date,";
_ssql = ("select distinct up_date, 0 as up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filteroftc))+"");
RDebugUtils.currentLine=60817458;
 //BA.debugLineNum = 60817458;BA.debugLine="Dim RecordLocalDataToUpdate As ResultSet = Star";
_recordlocaldatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=60817459;
 //BA.debugLineNum = 60817459;BA.debugLine="WITHFILES = False";
_withfiles = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=60817462;
 //BA.debugLineNum = 60817462;BA.debugLine="Try";

case 17:
//try
this.state = 22;
this.catchState = 0;
this.catchState = 21;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 22;
this.catchState = 21;
RDebugUtils.currentLine=60817463;
 //BA.debugLineNum = 60817463;BA.debugLine="Dim sSQLEmails As String = $\"select distinct up";
_ssqlemails = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updateemails where up_state=0 and up_type=0 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filteroftc))+"");
RDebugUtils.currentLine=60817464;
 //BA.debugLineNum = 60817464;BA.debugLine="Dim RecordLocalEmailDataToUpdate As ResultSet =";
_recordlocalemaildatatoupdate = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocalemaildatatoupdate = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssqlemails)));
RDebugUtils.currentLine=60817465;
 //BA.debugLineNum = 60817465;BA.debugLine="Dim EmailCheck As Boolean = True";
_emailcheck = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=60817467;
 //BA.debugLineNum = 60817467;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817467",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60817468;
 //BA.debugLineNum = 60817468;BA.debugLine="Dim EmailCheck As Boolean = False";
_emailcheck = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
RDebugUtils.currentLine=60817471;
 //BA.debugLineNum = 60817471;BA.debugLine="Dim ut0 As Int = RecordLocalDataToUpdate.RowCoun";
_ut0 = _recordlocaldatatoupdate.getRowCount();
RDebugUtils.currentLine=60817472;
 //BA.debugLineNum = 60817472;BA.debugLine="Dim ut1 As Int = RecCounter - ut0";
_ut1 = (int) (_reccounter-_ut0);
RDebugUtils.currentLine=60817474;
 //BA.debugLineNum = 60817474;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgExecPro";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgexecprocact /*String*/ ));
RDebugUtils.currentLine=60817476;
 //BA.debugLineNum = 60817476;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60817477;
 //BA.debugLineNum = 60817477;BA.debugLine="DUProgressBar2(0,0)";
_duprogressbar2((int) (0),(int) (0));
RDebugUtils.currentLine=60817478;
 //BA.debugLineNum = 60817478;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (100));
this.state = 315;
return;
case 315:
//C
this.state = 23;
;
RDebugUtils.currentLine=60817480;
 //BA.debugLineNum = 60817480;BA.debugLine="If(RecordLocalDataToUpdate.RowCount >= 1) Then";
if (true) break;

case 23:
//if
this.state = 47;
if ((_recordlocaldatatoupdate.getRowCount()>=1)) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=60817481;
 //BA.debugLineNum = 60817481;BA.debugLine="Dim n As Int = 0";
_n = (int) (0);
RDebugUtils.currentLine=60817482;
 //BA.debugLineNum = 60817482;BA.debugLine="Do While RecordLocalDataToUpdate.NextRow";
if (true) break;

case 26:
//do while
this.state = 46;
while (_recordlocaldatatoupdate.NextRow()) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=60817484;
 //BA.debugLineNum = 60817484;BA.debugLine="Try";
if (true) break;

case 29:
//try
this.state = 42;
this.catchState = 41;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 41;
RDebugUtils.currentLine=60817485;
 //BA.debugLineNum = 60817485;BA.debugLine="Dim r1  As ResumableSub = SetUpdateHTTPRecord";
_r1 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r1 = _setupdatehttprecord(_recordlocaldatatoupdate,_withfiles,(int) (0),_filteroftc);
RDebugUtils.currentLine=60817486;
 //BA.debugLineNum = 60817486;BA.debugLine="Wait For(r1) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _r1);
this.state = 316;
return;
case 316:
//C
this.state = 32;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=60817489;
 //BA.debugLineNum = 60817489;BA.debugLine="If EmailCheck Then";
if (true) break;

case 32:
//if
this.state = 39;
if (_emailcheck) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=60817490;
 //BA.debugLineNum = 60817490;BA.debugLine="If RecordLocalEmailDataToUpdate.RowCount > 0";
if (true) break;

case 35:
//if
this.state = 38;
if (_recordlocalemaildatatoupdate.getRowCount()>0) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=60817491;
 //BA.debugLineNum = 60817491;BA.debugLine="Dim r2 As ResumableSub = SetUpdateHTTPEmail";
_r2 = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_r2 = _setupdatehttpemailrecord(_recordlocalemaildatatoupdate,_filteroftc);
RDebugUtils.currentLine=60817492;
 //BA.debugLineNum = 60817492;BA.debugLine="Wait For(r2) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _r2);
this.state = 317;
return;
case 317:
//C
this.state = 38;
_finished = (Boolean) result[0];
;
 if (true) break;

case 38:
//C
this.state = 39;
;
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
RDebugUtils.currentLine=60817496;
 //BA.debugLineNum = 60817496;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817496",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=60817498;
 //BA.debugLineNum = 60817498;BA.debugLine="If n <= ut0 Then";

case 42:
//if
this.state = 45;
this.catchState = 0;
if (_n<=_ut0) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=60817499;
 //BA.debugLineNum = 60817499;BA.debugLine="DUProgressBar(ut0,n)";
_duprogressbar(_ut0,_n);
RDebugUtils.currentLine=60817500;
 //BA.debugLineNum = 60817500;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (1));
this.state = 318;
return;
case 318:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 26;
;
RDebugUtils.currentLine=60817503;
 //BA.debugLineNum = 60817503;BA.debugLine="n=n + 1";
_n = (int) (_n+1);
 if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=60817507;
 //BA.debugLineNum = 60817507;BA.debugLine="RecordLocalDataToUpdate.Close";
_recordlocaldatatoupdate.Close();
RDebugUtils.currentLine=60817508;
 //BA.debugLineNum = 60817508;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (250));
this.state = 319;
return;
case 319:
//C
this.state = 48;
;
RDebugUtils.currentLine=60817510;
 //BA.debugLineNum = 60817510;BA.debugLine="If ut1 >= 1 Then";
if (true) break;

case 48:
//if
this.state = 68;
if (_ut1>=1) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=60817511;
 //BA.debugLineNum = 60817511;BA.debugLine="Dim sSQL As String = $\"select distinct up_date,";
_ssql = ("select distinct up_date, up_type, up_state, up_tableurl, up_values from loc_updatesrever where up_state=0 and up_type=1 "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filteroftc))+"");
RDebugUtils.currentLine=60817512;
 //BA.debugLineNum = 60817512;BA.debugLine="Dim RecordLocalDataToUpdate2 As ResultSet = Sta";
_recordlocaldatatoupdate2 = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_recordlocaldatatoupdate2 = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=60817513;
 //BA.debugLineNum = 60817513;BA.debugLine="Dim n1 As Int = 0";
_n1 = (int) (0);
RDebugUtils.currentLine=60817514;
 //BA.debugLineNum = 60817514;BA.debugLine="If RecordLocalDataToUpdate2.RowCount >= 1 Then";
if (true) break;

case 51:
//if
this.state = 67;
if (_recordlocaldatatoupdate2.getRowCount()>=1) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=60817515;
 //BA.debugLineNum = 60817515;BA.debugLine="Do While RecordLocalDataToUpdate2.NextRow";
if (true) break;

case 54:
//do while
this.state = 66;
while (_recordlocaldatatoupdate2.NextRow()) {
this.state = 56;
if (true) break;
}
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=60817517;
 //BA.debugLineNum = 60817517;BA.debugLine="Try";
if (true) break;

case 57:
//try
this.state = 62;
this.catchState = 61;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 62;
this.catchState = 61;
RDebugUtils.currentLine=60817518;
 //BA.debugLineNum = 60817518;BA.debugLine="SetUpdateFTPRecord(RecordLocalDataToUpdate2,";
_setupdateftprecord(_recordlocaldatatoupdate2,_withfiles,(int) (1),_filteroftc);
 if (true) break;

case 61:
//C
this.state = 62;
this.catchState = 0;
RDebugUtils.currentLine=60817520;
 //BA.debugLineNum = 60817520;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817520",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=60817522;
 //BA.debugLineNum = 60817522;BA.debugLine="If n1 <= RecordLocalDataToUpdate2.RowCount Th";

case 62:
//if
this.state = 65;
this.catchState = 0;
if (_n1<=_recordlocaldatatoupdate2.getRowCount()) { 
this.state = 64;
}if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=60817523;
 //BA.debugLineNum = 60817523;BA.debugLine="DUProgressBar(RecordLocalDataToUpdate2.RowCo";
_duprogressbar(_recordlocaldatatoupdate2.getRowCount(),_n1);
RDebugUtils.currentLine=60817524;
 //BA.debugLineNum = 60817524;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (1));
this.state = 320;
return;
case 320:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 54;
;
RDebugUtils.currentLine=60817526;
 //BA.debugLineNum = 60817526;BA.debugLine="n1=n1 + 1";
_n1 = (int) (_n1+1);
 if (true) break;

case 66:
//C
this.state = 67;
;
 if (true) break;

case 67:
//C
this.state = 68;
;
RDebugUtils.currentLine=60817529;
 //BA.debugLineNum = 60817529;BA.debugLine="RecordLocalDataToUpdate2.Close";
_recordlocaldatatoupdate2.Close();
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=60817532;
 //BA.debugLineNum = 60817532;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgDataUpdat";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*String*/ ));
RDebugUtils.currentLine=60817533;
 //BA.debugLineNum = 60817533;BA.debugLine="CurrentCounter = CurrentCounter + 1";
parent._currentcounter = (int) (parent._currentcounter+1);
RDebugUtils.currentLine=60817534;
 //BA.debugLineNum = 60817534;BA.debugLine="If (CurrentCounter > 3) Then";
if (true) break;

case 69:
//if
this.state = 72;
if ((parent._currentcounter>3)) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=60817535;
 //BA.debugLineNum = 60817535;BA.debugLine="CurrentCounter = 0";
parent._currentcounter = (int) (0);
RDebugUtils.currentLine=60817536;
 //BA.debugLineNum = 60817536;BA.debugLine="MsgboxAsync(ShareCode.AvisoDadospersistemNaoUpd";
anywheresoftware.b4a.keywords.Common.MsgboxAsync(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._avisodadospersistemnaoupd /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._sharecode._generalalerttitle /*String*/ ),processBA);
 if (true) break;

case 72:
//C
this.state = 73;
;
RDebugUtils.currentLine=60817541;
 //BA.debugLineNum = 60817541;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (250));
this.state = 321;
return;
case 321:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=60817545;
 //BA.debugLineNum = 60817545;BA.debugLine="Starter.RunUpdate = True";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60817546;
 //BA.debugLineNum = 60817546;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=60817547;
 //BA.debugLineNum = 60817547;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=60817548;
 //BA.debugLineNum = 60817548;BA.debugLine="StopService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60817549;
 //BA.debugLineNum = 60817549;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60817550;
 //BA.debugLineNum = 60817550;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=60817551;
 //BA.debugLineNum = 60817551;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleactualizacao /*String*/ ));
RDebugUtils.currentLine=60817552;
 //BA.debugLineNum = 60817552;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=60817554;
 //BA.debugLineNum = 60817554;BA.debugLine="If (SyncDates) Then";
if (true) break;

case 74:
//if
this.state = 83;
if ((_syncdates)) { 
this.state = 76;
}else {
this.state = 82;
}if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=60817555;
 //BA.debugLineNum = 60817555;BA.debugLine="If (ShareCode.SYNC_COMPONENTS = \"\") And (ShareCo";
if (true) break;

case 77:
//if
this.state = 80;
if (((parent.mostCurrent._sharecode._sync_components /*String*/ ).equals("")) && (parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/ )) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=60817556;
 //BA.debugLineNum = 60817556;BA.debugLine="Dim res As ResumableSub = DownloadDocsOnly(date";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _downloaddocsonly(_date2watch,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60817557;
 //BA.debugLineNum = 60817557;BA.debugLine="Wait For(res) Complete (RequestSuccessful As Bo";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 322;
return;
case 322:
//C
this.state = 80;
_requestsuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60817558;
 //BA.debugLineNum = 60817558;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 80:
//C
this.state = 83;
;
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=60817561;
 //BA.debugLineNum = 60817561;BA.debugLine="ShareCode.DownloadDocsFromFTP = False";
parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 83:
//C
this.state = 84;
;
RDebugUtils.currentLine=60817564;
 //BA.debugLineNum = 60817564;BA.debugLine="Dim res As ResumableSub = RequestSync(date2watch,";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _requestsync(_date2watch,_syncdates);
RDebugUtils.currentLine=60817565;
 //BA.debugLineNum = 60817565;BA.debugLine="Wait For(res) Complete (RequestSuccessful As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 323;
return;
case 323:
//C
this.state = 84;
_requestsuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60817567;
 //BA.debugLineNum = 60817567;BA.debugLine="If(RequestSuccessful) Then";
if (true) break;

case 84:
//if
this.state = 140;
if ((_requestsuccessful)) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=60817568;
 //BA.debugLineNum = 60817568;BA.debugLine="File.writeString(Starter.InternalFolder,$\"${Shar";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"),parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=60817569;
 //BA.debugLineNum = 60817569;BA.debugLine="Dim UPDATE_FILE_INFO As String = $\"${RequestFile";
_update_file_info = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._requestfilename))+".INFO");
RDebugUtils.currentLine=60817570;
 //BA.debugLineNum = 60817570;BA.debugLine="Dim updateSQLFilesName As String = RequestFileNa";
_updatesqlfilesname = parent.mostCurrent._requestfilename;
RDebugUtils.currentLine=60817571;
 //BA.debugLineNum = 60817571;BA.debugLine="Dim deleteFileName As String = $\"${RequestFileNa";
_deletefilename = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._requestfilename))+"-DELETE.sql");
RDebugUtils.currentLine=60817572;
 //BA.debugLineNum = 60817572;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ ));
RDebugUtils.currentLine=60817573;
 //BA.debugLineNum = 60817573;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunSync\",lblda";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RunSync",parent.mostCurrent._lbldataupdateprocess.getText());
RDebugUtils.currentLine=60817577;
 //BA.debugLineNum = 60817577;BA.debugLine="SqlFilesTotal = 0";
parent._sqlfilestotal = (int) (0);
RDebugUtils.currentLine=60817578;
 //BA.debugLineNum = 60817578;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60817579;
 //BA.debugLineNum = 60817579;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60817580;
 //BA.debugLineNum = 60817580;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60817581;
 //BA.debugLineNum = 60817581;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=60817582;
 //BA.debugLineNum = 60817582;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=60817583;
 //BA.debugLineNum = 60817583;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=60817584;
 //BA.debugLineNum = 60817584;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60817586;
 //BA.debugLineNum = 60817586;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_update_file_info,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_file_info);
RDebugUtils.currentLine=60817587;
 //BA.debugLineNum = 60817587;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sf);
this.state = 324;
return;
case 324:
//C
this.state = 87;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60817589;
 //BA.debugLineNum = 60817589;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO .INFO";
if (true) break;

case 87:
//if
this.state = 139;
if (_success) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=60817591;
 //BA.debugLineNum = 60817591;BA.debugLine="Log(UPDATE_FILE_INFO & \" file was download succ";
anywheresoftware.b4a.keywords.Common.LogImpl("660817591",_update_file_info+" file was download successfully",0);
RDebugUtils.currentLine=60817593;
 //BA.debugLineNum = 60817593;BA.debugLine="Dim JsonStruct As String = File.readstring(Star";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_update_file_info);
RDebugUtils.currentLine=60817594;
 //BA.debugLineNum = 60817594;BA.debugLine="Log(\"JSON:\" & JsonStruct)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817594","JSON:"+_jsonstruct,0);
RDebugUtils.currentLine=60817595;
 //BA.debugLineNum = 60817595;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=60817596;
 //BA.debugLineNum = 60817596;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=60817597;
 //BA.debugLineNum = 60817597;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=60817598;
 //BA.debugLineNum = 60817598;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=60817599;
 //BA.debugLineNum = 60817599;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=60817600;
 //BA.debugLineNum = 60817600;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=60817606;
 //BA.debugLineNum = 60817606;BA.debugLine="Dim DeletesIsPresent As Boolean = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60817607;
 //BA.debugLineNum = 60817607;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_deletefilename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deletefilename);
RDebugUtils.currentLine=60817608;
 //BA.debugLineNum = 60817608;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sf);
this.state = 325;
return;
case 325:
//C
this.state = 90;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60817610;
 //BA.debugLineNum = 60817610;BA.debugLine="If Success Then 'DESCARREGOU O FICHEIRO DE DELE";
if (true) break;

case 90:
//if
this.state = 101;
if (_success) { 
this.state = 92;
}else {
this.state = 100;
}if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=60817611;
 //BA.debugLineNum = 60817611;BA.debugLine="Log(deleteFileName & \" file was download succe";
anywheresoftware.b4a.keywords.Common.LogImpl("660817611",_deletefilename+" file was download successfully",0);
RDebugUtils.currentLine=60817613;
 //BA.debugLineNum = 60817613;BA.debugLine="If File.Exists(Starter.Provider.SharedFolder,";
if (true) break;

case 93:
//if
this.state = 98;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_deletefilename)) { 
this.state = 95;
}else {
this.state = 97;
}if (true) break;

case 95:
//C
this.state = 98;
RDebugUtils.currentLine=60817614;
 //BA.debugLineNum = 60817614;BA.debugLine="DeletesIsPresent = True";
_deletesispresent = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=60817616;
 //BA.debugLineNum = 60817616;BA.debugLine="DeletesIsPresent = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 98:
//C
this.state = 101;
;
 if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=60817619;
 //BA.debugLineNum = 60817619;BA.debugLine="DeletesIsPresent = False";
_deletesispresent = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
;
RDebugUtils.currentLine=60817633;
 //BA.debugLineNum = 60817633;BA.debugLine="If DeletesIsPresent Then";

case 101:
//if
this.state = 120;
if (_deletesispresent) { 
this.state = 103;
}else {
this.state = 105;
}if (true) break;

case 103:
//C
this.state = 120;
RDebugUtils.currentLine=60817634;
 //BA.debugLineNum = 60817634;BA.debugLine="Dim resDel As ResumableSub = MakeDeleteSqlFile";
_resdel = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_resdel = _makedeletesqlfile(_deletefilename);
RDebugUtils.currentLine=60817635;
 //BA.debugLineNum = 60817635;BA.debugLine="Wait For(resDel) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _resdel);
this.state = 326;
return;
case 326:
//C
this.state = 120;
_finish = (Boolean) result[0];
;
 if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=60817637;
 //BA.debugLineNum = 60817637;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 106:
//for
this.state = 119;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group166 = _inserts;
index166 = 0;
groupLen166 = group166.getSize();
this.state = 327;
if (true) break;

case 327:
//C
this.state = 119;
if (index166 < groupLen166) {
this.state = 108;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group166.Get(index166)));}
if (true) break;

case 328:
//C
this.state = 327;
index166++;
if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=60817638;
 //BA.debugLineNum = 60817638;BA.debugLine="Dim mastertagcode As String = colinserts.Get(";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=60817639;
 //BA.debugLineNum = 60817639;BA.debugLine="Try";
if (true) break;

case 109:
//try
this.state = 114;
this.catchState = 113;
this.state = 111;
if (true) break;

case 111:
//C
this.state = 114;
this.catchState = 113;
RDebugUtils.currentLine=60817640;
 //BA.debugLineNum = 60817640;BA.debugLine="Dim childfield As String = colinserts.Get(\"c";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 113:
//C
this.state = 114;
this.catchState = 0;
RDebugUtils.currentLine=60817642;
 //BA.debugLineNum = 60817642;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=60817643;
 //BA.debugLineNum = 60817643;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817643",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 114:
//C
this.state = 115;
this.catchState = 0;
;
RDebugUtils.currentLine=60817645;
 //BA.debugLineNum = 60817645;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"t";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=60817646;
 //BA.debugLineNum = 60817646;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\", t";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=60817647;
 //BA.debugLineNum = 60817647;BA.debugLine="Dim table As String = colinserts.Get(\"table\")";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=60817649;
 //BA.debugLineNum = 60817649;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 115:
//for
this.state = 118;
step177 = 1;
limit177 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 329;
if (true) break;

case 329:
//C
this.state = 118;
if ((step177 > 0 && _i <= limit177) || (step177 < 0 && _i >= limit177)) this.state = 117;
if (true) break;

case 330:
//C
this.state = 329;
_i = ((int)(0 + _i + step177)) ;
if (true) break;

case 117:
//C
this.state = 330;
RDebugUtils.currentLine=60817650;
 //BA.debugLineNum = 60817650;BA.debugLine="Dim res As ResumableSub = DBStructures.Remov";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=60817651;
 //BA.debugLineNum = 60817651;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 331;
return;
case 331:
//C
this.state = 330;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=60817652;
 //BA.debugLineNum = 60817652;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (100));
this.state = 332;
return;
case 332:
//C
this.state = 330;
;
 if (true) break;
if (true) break;

case 118:
//C
this.state = 328;
;
 if (true) break;
if (true) break;

case 119:
//C
this.state = 120;
;
 if (true) break;

case 120:
//C
this.state = 121;
;
RDebugUtils.currentLine=60817662;
 //BA.debugLineNum = 60817662;BA.debugLine="SqlFilesTotal = Totalfiles";
parent._sqlfilestotal = _totalfiles;
RDebugUtils.currentLine=60817663;
 //BA.debugLineNum = 60817663;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=60817664;
 //BA.debugLineNum = 60817664;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60817665;
 //BA.debugLineNum = 60817665;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=60817666;
 //BA.debugLineNum = 60817666;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=60817669;
 //BA.debugLineNum = 60817669;BA.debugLine="If(SqlFilesTotal > 0) Then";
if (true) break;

case 121:
//if
this.state = 128;
if ((parent._sqlfilestotal>0)) { 
this.state = 123;
}if (true) break;

case 123:
//C
this.state = 124;
RDebugUtils.currentLine=60817670;
 //BA.debugLineNum = 60817670;BA.debugLine="For i = 1 To SqlFilesTotal";
if (true) break;

case 124:
//for
this.state = 127;
step190 = 1;
limit190 = parent._sqlfilestotal;
_i = (int) (1) ;
this.state = 333;
if (true) break;

case 333:
//C
this.state = 127;
if ((step190 > 0 && _i <= limit190) || (step190 < 0 && _i >= limit190)) this.state = 126;
if (true) break;

case 334:
//C
this.state = 333;
_i = ((int)(0 + _i + step190)) ;
if (true) break;

case 126:
//C
this.state = 334;
RDebugUtils.currentLine=60817671;
 //BA.debugLineNum = 60817671;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ +(" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._sqlfilestotal))+"")));
RDebugUtils.currentLine=60817672;
 //BA.debugLineNum = 60817672;BA.debugLine="Dim fileN As String = $\"${updateSQLFilesName}";
_filen = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updatesqlfilesname))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+".sql");
RDebugUtils.currentLine=60817673;
 //BA.debugLineNum = 60817673;BA.debugLine="Dim rs As ResumableSub = DownloadSqlFileWithF";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = _downloadsqlfilewithftp(_filen);
RDebugUtils.currentLine=60817674;
 //BA.debugLineNum = 60817674;BA.debugLine="Wait For(rs) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _rs);
this.state = 335;
return;
case 335:
//C
this.state = 334;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=60817675;
 //BA.debugLineNum = 60817675;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
RDebugUtils.currentLine=60817676;
 //BA.debugLineNum = 60817676;BA.debugLine="Sleep(1)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (1));
this.state = 336;
return;
case 336:
//C
this.state = 334;
;
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
RDebugUtils.currentLine=60817680;
 //BA.debugLineNum = 60817680;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ ));
RDebugUtils.currentLine=60817681;
 //BA.debugLineNum = 60817681;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunSync\",lbld";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RunSync",parent.mostCurrent._lbldataupdateprocess.getText());
RDebugUtils.currentLine=60817685;
 //BA.debugLineNum = 60817685;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60817686;
 //BA.debugLineNum = 60817686;BA.debugLine="Log($\"LISTA DE FICHEIROS: ${updateSQLFilesName}";
anywheresoftware.b4a.keywords.Common.LogImpl("660817686",("LISTA DE FICHEIROS: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_updatesqlfilesname))+""),0);
RDebugUtils.currentLine=60817691;
 //BA.debugLineNum = 60817691;BA.debugLine="If SyncDates Then";
if (true) break;

case 129:
//if
this.state = 134;
if (_syncdates) { 
this.state = 131;
}else {
this.state = 133;
}if (true) break;

case 131:
//C
this.state = 134;
RDebugUtils.currentLine=60817692;
 //BA.debugLineNum = 60817692;BA.debugLine="ShareCode.AlreadyDeleted = False";
parent.mostCurrent._sharecode._alreadydeleted /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 133:
//C
this.state = 134;
RDebugUtils.currentLine=60817694;
 //BA.debugLineNum = 60817694;BA.debugLine="ShareCode.AlreadyDeleted = True";
parent.mostCurrent._sharecode._alreadydeleted /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 134:
//C
this.state = 135;
;
RDebugUtils.currentLine=60817697;
 //BA.debugLineNum = 60817697;BA.debugLine="Dim res As ResumableSub = ExecuteSqlFiles(updat";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _executesqlfiles(_updatesqlfilesname,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60817698;
 //BA.debugLineNum = 60817698;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 337;
return;
case 337:
//C
this.state = 135;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=60817700;
 //BA.debugLineNum = 60817700;BA.debugLine="If(finish)Then";
if (true) break;

case 135:
//if
this.state = 138;
if ((_finish)) { 
this.state = 137;
}if (true) break;

case 137:
//C
this.state = 138;
RDebugUtils.currentLine=60817701;
 //BA.debugLineNum = 60817701;BA.debugLine="Dim res As ResumableSub = SendServerProcessCom";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _sendserverprocesscomplete(anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._requestfilename,dataupdate.getObject());
RDebugUtils.currentLine=60817702;
 //BA.debugLineNum = 60817702;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 338;
return;
case 338:
//C
this.state = 138;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=60817704;
 //BA.debugLineNum = 60817704;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(updat";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _deletesqlfiles(_updatesqlfilesname);
RDebugUtils.currentLine=60817705;
 //BA.debugLineNum = 60817705;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 339;
return;
case 339:
//C
this.state = 138;
_isfilesdeleted = (Boolean) result[0];
;
 if (true) break;

case 138:
//C
this.state = 139;
;
 if (true) break;

case 139:
//C
this.state = 140;
;
 if (true) break;

case 140:
//C
this.state = 141;
;
RDebugUtils.currentLine=60817726;
 //BA.debugLineNum = 60817726;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=60817727;
 //BA.debugLineNum = 60817727;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=60817728;
 //BA.debugLineNum = 60817728;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60817729;
 //BA.debugLineNum = 60817729;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=60817731;
 //BA.debugLineNum = 60817731;BA.debugLine="If ShareCode.FIRSTDAILYLOGIN Or SyncDates Then";
if (true) break;

case 141:
//if
this.state = 307;
if (parent.mostCurrent._sharecode._firstdailylogin /*boolean*/  || _syncdates) { 
this.state = 143;
}if (true) break;

case 143:
//C
this.state = 144;
RDebugUtils.currentLine=60817732;
 //BA.debugLineNum = 60817732;BA.debugLine="If ShareCode.DownloadDocsFromFTP Then";
if (true) break;

case 144:
//if
this.state = 218;
if (parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/ ) { 
this.state = 146;
}if (true) break;

case 146:
//C
this.state = 147;
RDebugUtils.currentLine=60817733;
 //BA.debugLineNum = 60817733;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=60817734;
 //BA.debugLineNum = 60817734;BA.debugLine="Log(\"******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660817734","************************************************************",0);
RDebugUtils.currentLine=60817735;
 //BA.debugLineNum = 60817735;BA.debugLine="Log($\" INITIAL : ${ShareCode.APPL_HOST}/${Share";
anywheresoftware.b4a.keywords.Common.LogImpl("660817735",(" INITIAL : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+" "),0);
RDebugUtils.currentLine=60817736;
 //BA.debugLineNum = 60817736;BA.debugLine="Log(\"/docs/\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817736","/docs/",0);
RDebugUtils.currentLine=60817737;
 //BA.debugLineNum = 60817737;BA.debugLine="Log(\"******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660817737","************************************************************",0);
RDebugUtils.currentLine=60817739;
 //BA.debugLineNum = 60817739;BA.debugLine="Dim FTPDOCSLIST As List";
_ftpdocslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60817740;
 //BA.debugLineNum = 60817740;BA.debugLine="Dim TotalDocs As Int = 0";
_totaldocs = (int) (0);
RDebugUtils.currentLine=60817742;
 //BA.debugLineNum = 60817742;BA.debugLine="If SyncDates Then";
if (true) break;

case 147:
//if
this.state = 152;
if (_syncdates) { 
this.state = 149;
}else {
this.state = 151;
}if (true) break;

case 149:
//C
this.state = 152;
RDebugUtils.currentLine=60817743;
 //BA.debugLineNum = 60817743;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=60817744;
 //BA.debugLineNum = 60817744;BA.debugLine="Dim Dates2Sync As List = Regex.Split(\"\\|\", dat";
_dates2sync = new anywheresoftware.b4a.objects.collections.List();
_dates2sync = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_date2watch));
RDebugUtils.currentLine=60817745;
 //BA.debugLineNum = 60817745;BA.debugLine="Dim iDateL As Long = DateTime.DateParse(Dates2";
_idatel = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_dates2sync.Get((int) (0))));
RDebugUtils.currentLine=60817746;
 //BA.debugLineNum = 60817746;BA.debugLine="Dim eDateL As Long = DateTime.DateParse(Dates2";
_edatel = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(BA.ObjectToString(_dates2sync.Get((int) (1))));
RDebugUtils.currentLine=60817747;
 //BA.debugLineNum = 60817747;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
 if (true) break;

case 151:
//C
this.state = 152;
RDebugUtils.currentLine=60817749;
 //BA.debugLineNum = 60817749;BA.debugLine="Dim LMDate As Long = Utils.GetLastNDaysLong(1)";
_lmdate = parent.mostCurrent._utils._getlastndayslong /*long*/ (mostCurrent.activityBA,(int) (1));
 if (true) break;

case 152:
//C
this.state = 153;
;
RDebugUtils.currentLine=60817753;
 //BA.debugLineNum = 60817753;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareC";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=60817754;
 //BA.debugLineNum = 60817754;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sfl);
this.state = 340;
return;
case 340:
//C
this.state = 153;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60817755;
 //BA.debugLineNum = 60817755;BA.debugLine="If Success Then";
if (true) break;

case 153:
//if
this.state = 194;
if (_success) { 
this.state = 155;
}else {
this.state = 193;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=60817756;
 //BA.debugLineNum = 60817756;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60817757;
 //BA.debugLineNum = 60817757;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 156:
//if
this.state = 191;
if ((_files.length>=1)) { 
this.state = 158;
}if (true) break;

case 158:
//C
this.state = 159;
RDebugUtils.currentLine=60817758;
 //BA.debugLineNum = 60817758;BA.debugLine="FTPDOCSLIST.Initialize";
_ftpdocslist.Initialize();
RDebugUtils.currentLine=60817759;
 //BA.debugLineNum = 60817759;BA.debugLine="TotalDocs = files.Length -1";
_totaldocs = (int) (_files.length-1);
RDebugUtils.currentLine=60817760;
 //BA.debugLineNum = 60817760;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista d";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(("Criando Lista de ficheiros para download em /docs/")));
RDebugUtils.currentLine=60817761;
 //BA.debugLineNum = 60817761;BA.debugLine="Sleep(500)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"),(int) (500));
this.state = 341;
return;
case 341:
//C
this.state = 159;
;
RDebugUtils.currentLine=60817762;
 //BA.debugLineNum = 60817762;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 159:
//for
this.state = 190;
step249 = 1;
limit249 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 342;
if (true) break;

case 342:
//C
this.state = 190;
if ((step249 > 0 && _i <= limit249) || (step249 < 0 && _i >= limit249)) this.state = 161;
if (true) break;

case 343:
//C
this.state = 342;
_i = ((int)(0 + _i + step249)) ;
if (true) break;

case 161:
//C
this.state = 162;
RDebugUtils.currentLine=60817763;
 //BA.debugLineNum = 60817763;BA.debugLine="Dim fName As String = files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=60817764;
 //BA.debugLineNum = 60817764;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWi";
if (true) break;

case 162:
//if
this.state = 189;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx")) || anywheresoftware.b4a.keywords.Common.Not((_fname.startsWith("REPORT")))) { 
this.state = 164;
}if (true) break;

case 164:
//C
this.state = 165;
RDebugUtils.currentLine=60817770;
 //BA.debugLineNum = 60817770;BA.debugLine="If SyncDates Then";
if (true) break;

case 165:
//if
this.state = 188;
if (_syncdates) { 
this.state = 167;
}else {
this.state = 183;
}if (true) break;

case 167:
//C
this.state = 168;
RDebugUtils.currentLine=60817771;
 //BA.debugLineNum = 60817771;BA.debugLine="If ShareCode.DownloadDocsFromFTP = True Th";
if (true) break;

case 168:
//if
this.state = 181;
if (parent.mostCurrent._sharecode._downloaddocsfromftp /*boolean*/ ==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 170;
}else {
this.state = 176;
}if (true) break;

case 170:
//C
this.state = 171;
RDebugUtils.currentLine=60817772;
 //BA.debugLineNum = 60817772;BA.debugLine="If (files(i).Timestamp >= iDateL) And (fi";
if (true) break;

case 171:
//if
this.state = 174;
if ((_files[_i].getTimestamp()>=_idatel) && (_files[_i].getTimestamp()<=_edatel)) { 
this.state = 173;
}if (true) break;

case 173:
//C
this.state = 174;
RDebugUtils.currentLine=60817773;
 //BA.debugLineNum = 60817773;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=60817774;
 //BA.debugLineNum = 60817774;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817774",_files[_i].getName(),0);
 if (true) break;

case 174:
//C
this.state = 181;
;
 if (true) break;

case 176:
//C
this.state = 177;
RDebugUtils.currentLine=60817777;
 //BA.debugLineNum = 60817777;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
if (true) break;

case 177:
//if
this.state = 180;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 179;
}if (true) break;

case 179:
//C
this.state = 180;
RDebugUtils.currentLine=60817778;
 //BA.debugLineNum = 60817778;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=60817779;
 //BA.debugLineNum = 60817779;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817779",_files[_i].getName(),0);
 if (true) break;

case 180:
//C
this.state = 181;
;
 if (true) break;

case 181:
//C
this.state = 188;
;
 if (true) break;

case 183:
//C
this.state = 184;
RDebugUtils.currentLine=60817783;
 //BA.debugLineNum = 60817783;BA.debugLine="If (files(i).Timestamp >= LMDate) Then";
if (true) break;

case 184:
//if
this.state = 187;
if ((_files[_i].getTimestamp()>=_lmdate)) { 
this.state = 186;
}if (true) break;

case 186:
//C
this.state = 187;
RDebugUtils.currentLine=60817784;
 //BA.debugLineNum = 60817784;BA.debugLine="FTPDOCSLIST.Add(files(i).Name)";
_ftpdocslist.Add((Object)(_files[_i].getName()));
RDebugUtils.currentLine=60817785;
 //BA.debugLineNum = 60817785;BA.debugLine="Log(files(i).Name)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817785",_files[_i].getName(),0);
 if (true) break;

case 187:
//C
this.state = 188;
;
 if (true) break;

case 188:
//C
this.state = 189;
;
 if (true) break;

case 189:
//C
this.state = 343;
;
 if (true) break;
if (true) break;

case 190:
//C
this.state = 191;
;
RDebugUtils.currentLine=60817791;
 //BA.debugLineNum = 60817791;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
RDebugUtils.currentLine=60817792;
 //BA.debugLineNum = 60817792;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817792","*************************",0);
RDebugUtils.currentLine=60817793;
 //BA.debugLineNum = 60817793;BA.debugLine="Log($\"Total Files Added to /DOCS List = ${FTP";
anywheresoftware.b4a.keywords.Common.LogImpl("660817793",("Total Files Added to /DOCS List = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ftpdocslist.getSize()))+" out of a Total of "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+""),0);
RDebugUtils.currentLine=60817794;
 //BA.debugLineNum = 60817794;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817794","*************************",0);
 if (true) break;

case 191:
//C
this.state = 194;
;
 if (true) break;

case 193:
//C
this.state = 194;
RDebugUtils.currentLine=60817797;
 //BA.debugLineNum = 60817797;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error ge";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","RunSync","error getting files list from /docs/");
 if (true) break;
;
RDebugUtils.currentLine=60817800;
 //BA.debugLineNum = 60817800;BA.debugLine="If (FTPDOCSLIST.IsInitialized) Then";

case 194:
//if
this.state = 217;
if ((_ftpdocslist.IsInitialized())) { 
this.state = 196;
}if (true) break;

case 196:
//C
this.state = 197;
RDebugUtils.currentLine=60817801;
 //BA.debugLineNum = 60817801;BA.debugLine="If (FTPDOCSLIST.Size>=1) Then";
if (true) break;

case 197:
//if
this.state = 216;
if ((_ftpdocslist.getSize()>=1)) { 
this.state = 199;
}if (true) break;

case 199:
//C
this.state = 200;
RDebugUtils.currentLine=60817802;
 //BA.debugLineNum = 60817802;BA.debugLine="TotalDocs = FTPDOCSLIST.Size-1";
_totaldocs = (int) (_ftpdocslist.getSize()-1);
RDebugUtils.currentLine=60817803;
 //BA.debugLineNum = 60817803;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817803","*************************",0);
RDebugUtils.currentLine=60817804;
 //BA.debugLineNum = 60817804;BA.debugLine="Log(\"Total DOCS : \" & TotalDocs)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817804","Total DOCS : "+BA.NumberToString(_totaldocs),0);
RDebugUtils.currentLine=60817805;
 //BA.debugLineNum = 60817805;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817805","*************************",0);
RDebugUtils.currentLine=60817806;
 //BA.debugLineNum = 60817806;BA.debugLine="For i=0 To FTPDOCSLIST.Size-1";
if (true) break;

case 200:
//for
this.state = 215;
step286 = 1;
limit286 = (int) (_ftpdocslist.getSize()-1);
_i = (int) (0) ;
this.state = 344;
if (true) break;

case 344:
//C
this.state = 215;
if ((step286 > 0 && _i <= limit286) || (step286 < 0 && _i >= limit286)) this.state = 202;
if (true) break;

case 345:
//C
this.state = 344;
_i = ((int)(0 + _i + step286)) ;
if (true) break;

case 202:
//C
this.state = 203;
RDebugUtils.currentLine=60817807;
 //BA.debugLineNum = 60817807;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpd";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/docs/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+"")));
RDebugUtils.currentLine=60817808;
 //BA.debugLineNum = 60817808;BA.debugLine="Dim fName As String = FTPDOCSLIST.Get(i)";
_fname = BA.ObjectToString(_ftpdocslist.Get(_i));
RDebugUtils.currentLine=60817809;
 //BA.debugLineNum = 60817809;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817809",_fname,0);
RDebugUtils.currentLine=60817810;
 //BA.debugLineNum = 60817810;BA.debugLine="Try";
if (true) break;

case 203:
//try
this.state = 214;
this.catchState = 213;
this.state = 205;
if (true) break;

case 205:
//C
this.state = 206;
this.catchState = 213;
RDebugUtils.currentLine=60817811;
 //BA.debugLineNum = 60817811;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=60817812;
 //BA.debugLineNum = 60817812;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (Server";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sf);
this.state = 346;
return;
case 346:
//C
this.state = 206;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60817814;
 //BA.debugLineNum = 60817814;BA.debugLine="If Success Then";
if (true) break;

case 206:
//if
this.state = 211;
if (_success) { 
this.state = 208;
}else {
this.state = 210;
}if (true) break;

case 208:
//C
this.state = 211;
RDebugUtils.currentLine=60817815;
 //BA.debugLineNum = 60817815;BA.debugLine="Log(\"/docs/ : file was download successful";
anywheresoftware.b4a.keywords.Common.LogImpl("660817815","/docs/ : file was download successfully",0);
 if (true) break;

case 210:
//C
this.state = 211;
RDebugUtils.currentLine=60817817;
 //BA.debugLineNum = 60817817;BA.debugLine="Log(\"/docs/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817817","/docs/ : Error downloading file",0);
 if (true) break;

case 211:
//C
this.state = 214;
;
 if (true) break;

case 213:
//C
this.state = 214;
this.catchState = 0;
RDebugUtils.currentLine=60817820;
 //BA.debugLineNum = 60817820;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817820",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 214:
//C
this.state = 345;
this.catchState = 0;
;
RDebugUtils.currentLine=60817822;
 //BA.debugLineNum = 60817822;BA.debugLine="DUProgressBar(TotalDocs,i)";
_duprogressbar(_totaldocs,_i);
 if (true) break;
if (true) break;

case 215:
//C
this.state = 216;
;
 if (true) break;

case 216:
//C
this.state = 217;
;
 if (true) break;

case 217:
//C
this.state = 218;
;
 if (true) break;

case 218:
//C
this.state = 219;
;
RDebugUtils.currentLine=60817833;
 //BA.debugLineNum = 60817833;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660817833","************************************************************",0);
RDebugUtils.currentLine=60817834;
 //BA.debugLineNum = 60817834;BA.debugLine="Log(\"/docs/templates\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817834","/docs/templates",0);
RDebugUtils.currentLine=60817835;
 //BA.debugLineNum = 60817835;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660817835","************************************************************",0);
RDebugUtils.currentLine=60817836;
 //BA.debugLineNum = 60817836;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60817837;
 //BA.debugLineNum = 60817837;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=60817838;
 //BA.debugLineNum = 60817838;BA.debugLine="Dim FTPTEMPLATESLIST As List";
_ftptemplateslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60817839;
 //BA.debugLineNum = 60817839;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=60817841;
 //BA.debugLineNum = 60817841;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/");
RDebugUtils.currentLine=60817842;
 //BA.debugLineNum = 60817842;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sfl);
this.state = 347;
return;
case 347:
//C
this.state = 219;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60817843;
 //BA.debugLineNum = 60817843;BA.debugLine="If Success Then";
if (true) break;

case 219:
//if
this.state = 232;
if (_success) { 
this.state = 221;
}else {
this.state = 231;
}if (true) break;

case 221:
//C
this.state = 222;
RDebugUtils.currentLine=60817845;
 //BA.debugLineNum = 60817845;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 222:
//if
this.state = 229;
if ((_files.length>=1)) { 
this.state = 224;
}if (true) break;

case 224:
//C
this.state = 225;
RDebugUtils.currentLine=60817846;
 //BA.debugLineNum = 60817846;BA.debugLine="TotalDocs = files.Length -1";
_totaldocs = (int) (_files.length-1);
RDebugUtils.currentLine=60817847;
 //BA.debugLineNum = 60817847;BA.debugLine="FTPTEMPLATESLIST.Initialize";
_ftptemplateslist.Initialize();
RDebugUtils.currentLine=60817848;
 //BA.debugLineNum = 60817848;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 225:
//for
this.state = 228;
step319 = 1;
limit319 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 348;
if (true) break;

case 348:
//C
this.state = 228;
if ((step319 > 0 && _i <= limit319) || (step319 < 0 && _i >= limit319)) this.state = 227;
if (true) break;

case 349:
//C
this.state = 348;
_i = ((int)(0 + _i + step319)) ;
if (true) break;

case 227:
//C
this.state = 349;
RDebugUtils.currentLine=60817849;
 //BA.debugLineNum = 60817849;BA.debugLine="lbldataupdateprocess.Text = $\"Criando Lista d";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(("Criando Lista de ficheiros para download em :/docs/templates/ "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaldocs))+"")));
RDebugUtils.currentLine=60817850;
 //BA.debugLineNum = 60817850;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=60817851;
 //BA.debugLineNum = 60817851;BA.debugLine="FTPTEMPLATESLIST.Add(files(i).Name)";
_ftptemplateslist.Add((Object)(_files[_i].getName()));
 if (true) break;
if (true) break;

case 228:
//C
this.state = 229;
;
 if (true) break;

case 229:
//C
this.state = 232;
;
 if (true) break;

case 231:
//C
this.state = 232;
RDebugUtils.currentLine=60817855;
 //BA.debugLineNum = 60817855;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"RunSync\",\"error get";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","RunSync","error getting files list from /docs/templates/");
 if (true) break;
;
RDebugUtils.currentLine=60817858;
 //BA.debugLineNum = 60817858;BA.debugLine="If (FTPTEMPLATESLIST.IsInitialized) Then";

case 232:
//if
this.state = 262;
if ((_ftptemplateslist.IsInitialized())) { 
this.state = 234;
}if (true) break;

case 234:
//C
this.state = 235;
RDebugUtils.currentLine=60817859;
 //BA.debugLineNum = 60817859;BA.debugLine="If (FTPTEMPLATESLIST.Size>=1) Then";
if (true) break;

case 235:
//if
this.state = 261;
if ((_ftptemplateslist.getSize()>=1)) { 
this.state = 237;
}if (true) break;

case 237:
//C
this.state = 238;
RDebugUtils.currentLine=60817860;
 //BA.debugLineNum = 60817860;BA.debugLine="TotalTemplates = FTPTEMPLATESLIST.Size-1";
_totaltemplates = (int) (_ftptemplateslist.getSize()-1);
RDebugUtils.currentLine=60817861;
 //BA.debugLineNum = 60817861;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817861","*************************",0);
RDebugUtils.currentLine=60817862;
 //BA.debugLineNum = 60817862;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817862","Total TEMPLATES : "+BA.NumberToString(_totaltemplates),0);
RDebugUtils.currentLine=60817863;
 //BA.debugLineNum = 60817863;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817863","*************************",0);
RDebugUtils.currentLine=60817864;
 //BA.debugLineNum = 60817864;BA.debugLine="For i=0 To FTPTEMPLATESLIST.Size-1";
if (true) break;

case 238:
//for
this.state = 260;
step334 = 1;
limit334 = (int) (_ftptemplateslist.getSize()-1);
_i = (int) (0) ;
this.state = 350;
if (true) break;

case 350:
//C
this.state = 260;
if ((step334 > 0 && _i <= limit334) || (step334 < 0 && _i >= limit334)) this.state = 240;
if (true) break;

case 351:
//C
this.state = 350;
_i = ((int)(0 + _i + step334)) ;
if (true) break;

case 240:
//C
this.state = 241;
RDebugUtils.currentLine=60817865;
 //BA.debugLineNum = 60817865;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/docs/templates/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=60817866;
 //BA.debugLineNum = 60817866;BA.debugLine="Dim fName2 As String = FTPTEMPLATESLIST.Get(i";
_fname2 = BA.ObjectToString(_ftptemplateslist.Get(_i));
RDebugUtils.currentLine=60817867;
 //BA.debugLineNum = 60817867;BA.debugLine="Dim oFName As String = $\"REMOVE_${fName2}\"$";
_ofname = ("REMOVE_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fname2))+"");
RDebugUtils.currentLine=60817868;
 //BA.debugLineNum = 60817868;BA.debugLine="If File.Exists(Starter.InternalFolder, fName2";
if (true) break;

case 241:
//if
this.state = 244;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2)) { 
this.state = 243;
}if (true) break;

case 243:
//C
this.state = 244;
RDebugUtils.currentLine=60817869;
 //BA.debugLineNum = 60817869;BA.debugLine="File.Copy(Starter.InternalFolder, fName2, St";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2,parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname);
RDebugUtils.currentLine=60817870;
 //BA.debugLineNum = 60817870;BA.debugLine="File.Delete(Starter.InternalFolder, fName2)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
 if (true) break;

case 244:
//C
this.state = 245;
;
RDebugUtils.currentLine=60817872;
 //BA.debugLineNum = 60817872;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817872",_fname2,0);
RDebugUtils.currentLine=60817873;
 //BA.debugLineNum = 60817873;BA.debugLine="Try";
if (true) break;

case 245:
//try
this.state = 259;
this.catchState = 258;
this.state = 247;
if (true) break;

case 247:
//C
this.state = 248;
this.catchState = 258;
RDebugUtils.currentLine=60817874;
 //BA.debugLineNum = 60817874;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=60817875;
 //BA.debugLineNum = 60817875;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sf);
this.state = 352;
return;
case 352:
//C
this.state = 248;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60817877;
 //BA.debugLineNum = 60817877;BA.debugLine="If Success Then";
if (true) break;

case 248:
//if
this.state = 253;
if (_success) { 
this.state = 250;
}else {
this.state = 252;
}if (true) break;

case 250:
//C
this.state = 253;
RDebugUtils.currentLine=60817878;
 //BA.debugLineNum = 60817878;BA.debugLine="Log(\"/docs/templates/ : file was download s";
anywheresoftware.b4a.keywords.Common.LogImpl("660817878","/docs/templates/ : file was download successfully",0);
 if (true) break;

case 252:
//C
this.state = 253;
RDebugUtils.currentLine=60817880;
 //BA.debugLineNum = 60817880;BA.debugLine="Log(\"/docs/templates/ : Error downloading f";
anywheresoftware.b4a.keywords.Common.LogImpl("660817880","/docs/templates/ : Error downloading file",0);
RDebugUtils.currentLine=60817881;
 //BA.debugLineNum = 60817881;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o f";
_insertalerterrors(("Erro ao Descarregar o ficheiro"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fname2))+""));
RDebugUtils.currentLine=60817882;
 //BA.debugLineNum = 60817882;BA.debugLine="File.Copy(Starter.InternalFolder, oFName, S";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
 if (true) break;
;
RDebugUtils.currentLine=60817884;
 //BA.debugLineNum = 60817884;BA.debugLine="If File.Exists(Starter.InternalFolder, oFNam";

case 253:
//if
this.state = 256;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname)) { 
this.state = 255;
}if (true) break;

case 255:
//C
this.state = 256;
RDebugUtils.currentLine=60817885;
 //BA.debugLineNum = 60817885;BA.debugLine="File.Delete(Starter.InternalFolder, oFName)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname);
 if (true) break;

case 256:
//C
this.state = 259;
;
 if (true) break;

case 258:
//C
this.state = 259;
this.catchState = 0;
RDebugUtils.currentLine=60817888;
 //BA.debugLineNum = 60817888;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817888",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 259:
//C
this.state = 351;
this.catchState = 0;
;
RDebugUtils.currentLine=60817890;
 //BA.debugLineNum = 60817890;BA.debugLine="DUProgressBar(TotalTemplates,i)";
_duprogressbar(_totaltemplates,_i);
 if (true) break;
if (true) break;

case 260:
//C
this.state = 261;
;
 if (true) break;

case 261:
//C
this.state = 262;
;
 if (true) break;

case 262:
//C
this.state = 263;
;
RDebugUtils.currentLine=60817898;
 //BA.debugLineNum = 60817898;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660817898","************************************************************",0);
RDebugUtils.currentLine=60817899;
 //BA.debugLineNum = 60817899;BA.debugLine="Log(\"/interno\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817899","/interno",0);
RDebugUtils.currentLine=60817900;
 //BA.debugLineNum = 60817900;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("660817900","************************************************************",0);
RDebugUtils.currentLine=60817901;
 //BA.debugLineNum = 60817901;BA.debugLine="DUProgressBar(100,0)";
_duprogressbar((int) (100),(int) (0));
RDebugUtils.currentLine=60817902;
 //BA.debugLineNum = 60817902;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=60817903;
 //BA.debugLineNum = 60817903;BA.debugLine="Dim FTPINTERNOLIST As List";
_ftpinternolist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60817904;
 //BA.debugLineNum = 60817904;BA.debugLine="Dim TotalTemplates As Int = 0";
_totaltemplates = (int) (0);
RDebugUtils.currentLine=60817906;
 //BA.debugLineNum = 60817906;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/interno/\")";
_sfl = _globalftp.List(processBA,"/interno/");
RDebugUtils.currentLine=60817907;
 //BA.debugLineNum = 60817907;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sfl);
this.state = 353;
return;
case 353:
//C
this.state = 263;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=60817908;
 //BA.debugLineNum = 60817908;BA.debugLine="If Success Then";
if (true) break;

case 263:
//if
this.state = 276;
if (_success) { 
this.state = 265;
}else {
this.state = 275;
}if (true) break;

case 265:
//C
this.state = 266;
RDebugUtils.currentLine=60817910;
 //BA.debugLineNum = 60817910;BA.debugLine="If (files.Length >= 1) Then";
if (true) break;

case 266:
//if
this.state = 273;
if ((_files.length>=1)) { 
this.state = 268;
}if (true) break;

case 268:
//C
this.state = 269;
RDebugUtils.currentLine=60817911;
 //BA.debugLineNum = 60817911;BA.debugLine="FTPINTERNOLIST.Initialize";
_ftpinternolist.Initialize();
RDebugUtils.currentLine=60817912;
 //BA.debugLineNum = 60817912;BA.debugLine="For i = 0 To files.Length - 1";
if (true) break;

case 269:
//for
this.state = 272;
step375 = 1;
limit375 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 354;
if (true) break;

case 354:
//C
this.state = 272;
if ((step375 > 0 && _i <= limit375) || (step375 < 0 && _i >= limit375)) this.state = 271;
if (true) break;

case 355:
//C
this.state = 354;
_i = ((int)(0 + _i + step375)) ;
if (true) break;

case 271:
//C
this.state = 355;
RDebugUtils.currentLine=60817913;
 //BA.debugLineNum = 60817913;BA.debugLine="Dim fName2 As String = files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=60817914;
 //BA.debugLineNum = 60817914;BA.debugLine="FTPINTERNOLIST.Add(files(i).Name)";
_ftpinternolist.Add((Object)(_files[_i].getName()));
 if (true) break;
if (true) break;

case 272:
//C
this.state = 273;
;
 if (true) break;

case 273:
//C
this.state = 276;
;
 if (true) break;

case 275:
//C
this.state = 276;
RDebugUtils.currentLine=60817918;
 //BA.debugLineNum = 60817918;BA.debugLine="Utils.ShowProcinLog(\"Main\",\"FirstIntallComplete";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"Main","FirstIntallCompleteProcedure","error getting files list from /interno/");
 if (true) break;
;
RDebugUtils.currentLine=60817921;
 //BA.debugLineNum = 60817921;BA.debugLine="If (FTPINTERNOLIST.IsInitialized) Then";

case 276:
//if
this.state = 306;
if ((_ftpinternolist.IsInitialized())) { 
this.state = 278;
}if (true) break;

case 278:
//C
this.state = 279;
RDebugUtils.currentLine=60817922;
 //BA.debugLineNum = 60817922;BA.debugLine="If (FTPINTERNOLIST.Size>=1) Then";
if (true) break;

case 279:
//if
this.state = 305;
if ((_ftpinternolist.getSize()>=1)) { 
this.state = 281;
}if (true) break;

case 281:
//C
this.state = 282;
RDebugUtils.currentLine=60817923;
 //BA.debugLineNum = 60817923;BA.debugLine="TotalTemplates = FTPINTERNOLIST.Size-1";
_totaltemplates = (int) (_ftpinternolist.getSize()-1);
RDebugUtils.currentLine=60817924;
 //BA.debugLineNum = 60817924;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817924","*************************",0);
RDebugUtils.currentLine=60817925;
 //BA.debugLineNum = 60817925;BA.debugLine="Log(\"Total TEMPLATES : \" & TotalTemplates)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817925","Total TEMPLATES : "+BA.NumberToString(_totaltemplates),0);
RDebugUtils.currentLine=60817926;
 //BA.debugLineNum = 60817926;BA.debugLine="Log(\"*************************\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817926","*************************",0);
RDebugUtils.currentLine=60817927;
 //BA.debugLineNum = 60817927;BA.debugLine="For i=0 To FTPINTERNOLIST.Size-1";
if (true) break;

case 282:
//for
this.state = 304;
step389 = 1;
limit389 = (int) (_ftpinternolist.getSize()-1);
_i = (int) (0) ;
this.state = 356;
if (true) break;

case 356:
//C
this.state = 304;
if ((step389 > 0 && _i <= limit389) || (step389 < 0 && _i >= limit389)) this.state = 284;
if (true) break;

case 357:
//C
this.state = 356;
_i = ((int)(0 + _i + step389)) ;
if (true) break;

case 284:
//C
this.state = 285;
RDebugUtils.currentLine=60817928;
 //BA.debugLineNum = 60817928;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ +("(/interno/) "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_i))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_totaltemplates))+"")));
RDebugUtils.currentLine=60817929;
 //BA.debugLineNum = 60817929;BA.debugLine="Dim fName2 As String = FTPINTERNOLIST.Get(i)";
_fname2 = BA.ObjectToString(_ftpinternolist.Get(_i));
RDebugUtils.currentLine=60817930;
 //BA.debugLineNum = 60817930;BA.debugLine="Dim oFName As String = $\"REMOVE_${fName2}\"$";
_ofname = ("REMOVE_"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fname2))+"");
RDebugUtils.currentLine=60817931;
 //BA.debugLineNum = 60817931;BA.debugLine="If File.Exists(Starter.InternalFolder, fName2";
if (true) break;

case 285:
//if
this.state = 288;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2)) { 
this.state = 287;
}if (true) break;

case 287:
//C
this.state = 288;
RDebugUtils.currentLine=60817932;
 //BA.debugLineNum = 60817932;BA.debugLine="File.Copy(Starter.InternalFolder, fName2, St";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2,parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname);
RDebugUtils.currentLine=60817933;
 //BA.debugLineNum = 60817933;BA.debugLine="File.Delete(Starter.InternalFolder, fName2)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
 if (true) break;

case 288:
//C
this.state = 289;
;
RDebugUtils.currentLine=60817935;
 //BA.debugLineNum = 60817935;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817935",_fname2,0);
RDebugUtils.currentLine=60817936;
 //BA.debugLineNum = 60817936;BA.debugLine="Try";
if (true) break;

case 289:
//try
this.state = 303;
this.catchState = 302;
this.state = 291;
if (true) break;

case 291:
//C
this.state = 292;
this.catchState = 302;
RDebugUtils.currentLine=60817937;
 //BA.debugLineNum = 60817937;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/interno/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=60817938;
 //BA.debugLineNum = 60817938;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _sf);
this.state = 358;
return;
case 358:
//C
this.state = 292;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=60817940;
 //BA.debugLineNum = 60817940;BA.debugLine="If Success Then";
if (true) break;

case 292:
//if
this.state = 297;
if (_success) { 
this.state = 294;
}else {
this.state = 296;
}if (true) break;

case 294:
//C
this.state = 297;
RDebugUtils.currentLine=60817941;
 //BA.debugLineNum = 60817941;BA.debugLine="Log(\"/interno/ : file was download successf";
anywheresoftware.b4a.keywords.Common.LogImpl("660817941","/interno/ : file was download successfully",0);
 if (true) break;

case 296:
//C
this.state = 297;
RDebugUtils.currentLine=60817943;
 //BA.debugLineNum = 60817943;BA.debugLine="Log(\"/interno/ : Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660817943","/interno/ : Error downloading file",0);
RDebugUtils.currentLine=60817944;
 //BA.debugLineNum = 60817944;BA.debugLine="InsertAlertErrors($\"Erro ao Descarregar o f";
_insertalerterrors(("Erro ao Descarregar o ficheiro"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fname2))+""));
RDebugUtils.currentLine=60817945;
 //BA.debugLineNum = 60817945;BA.debugLine="File.Copy(Starter.InternalFolder, oFName, S";
anywheresoftware.b4a.keywords.Common.File.Copy(parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
 if (true) break;
;
RDebugUtils.currentLine=60817947;
 //BA.debugLineNum = 60817947;BA.debugLine="If File.Exists(Starter.InternalFolder, oFNam";

case 297:
//if
this.state = 300;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname)) { 
this.state = 299;
}if (true) break;

case 299:
//C
this.state = 300;
RDebugUtils.currentLine=60817948;
 //BA.debugLineNum = 60817948;BA.debugLine="File.Delete(Starter.InternalFolder, oFName)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._internalfolder /*String*/ ,_ofname);
 if (true) break;

case 300:
//C
this.state = 303;
;
 if (true) break;

case 302:
//C
this.state = 303;
this.catchState = 0;
RDebugUtils.currentLine=60817951;
 //BA.debugLineNum = 60817951;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660817951",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 303:
//C
this.state = 357;
this.catchState = 0;
;
RDebugUtils.currentLine=60817953;
 //BA.debugLineNum = 60817953;BA.debugLine="DUProgressBar(TotalTemplates,i)";
_duprogressbar(_totaltemplates,_i);
 if (true) break;
if (true) break;

case 304:
//C
this.state = 305;
;
 if (true) break;

case 305:
//C
this.state = 306;
;
 if (true) break;

case 306:
//C
this.state = 307;
;
RDebugUtils.currentLine=60817957;
 //BA.debugLineNum = 60817957;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 307:
//C
this.state = 308;
;
RDebugUtils.currentLine=60817961;
 //BA.debugLineNum = 60817961;BA.debugLine="Dim res As ResumableSub = DURemoveAllLocalInfoAnd";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _duremovealllocalinfoandsqlfiles();
RDebugUtils.currentLine=60817962;
 //BA.debugLineNum = 60817962;BA.debugLine="Wait For(res) Complete (RemoveSuccessful As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runsync"), _res);
this.state = 359;
return;
case 359:
//C
this.state = 308;
_removesuccessful = (Boolean) result[0];
;
RDebugUtils.currentLine=60817963;
 //BA.debugLineNum = 60817963;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDataUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*String*/ ));
RDebugUtils.currentLine=60817967;
 //BA.debugLineNum = 60817967;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
if (true) break;

case 308:
//if
this.state = 313;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ )) { 
this.state = 310;
}else {
this.state = 312;
}if (true) break;

case 310:
//C
this.state = 313;
RDebugUtils.currentLine=60817968;
 //BA.debugLineNum = 60817968;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ );
 if (true) break;

case 312:
//C
this.state = 313;
RDebugUtils.currentLine=60817970;
 //BA.debugLineNum = 60817970;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 if (true) break;

case 313:
//C
this.state = -1;
;
RDebugUtils.currentLine=60817972;
 //BA.debugLineNum = 60817972;BA.debugLine="Starter.FirstInstall = False";
parent.mostCurrent._starter._firstinstall /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60817978;
 //BA.debugLineNum = 60817978;BA.debugLine="ShareCode.Types_AlreadyDeleted = False";
parent.mostCurrent._sharecode._types_alreadydeleted /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60817979;
 //BA.debugLineNum = 60817979;BA.debugLine="Starter.RunUpdate = False";
parent.mostCurrent._starter._runupdate /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60817980;
 //BA.debugLineNum = 60817980;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60817981;
 //BA.debugLineNum = 60817981;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=60817982;
 //BA.debugLineNum = 60817982;BA.debugLine="StartService(BackgroundUpdateService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._backgroundupdateservice.getObject()));
RDebugUtils.currentLine=60817983;
 //BA.debugLineNum = 60817983;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=60817984;
 //BA.debugLineNum = 60817984;BA.debugLine="ProgressBar1.Visible = False";
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60817987;
 //BA.debugLineNum = 60817987;BA.debugLine="ShareCode.AwakeDevice(False)";
parent.mostCurrent._sharecode._awakedevice /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=60817988;
 //BA.debugLineNum = 60817988;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=60817989;
 //BA.debugLineNum = 60817989;BA.debugLine="End Sub";
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
public static String  _insertalertsistema(int _typeofalert,String _lastsyncday) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "insertalertsistema", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "insertalertsistema", new Object[] {_typeofalert,_lastsyncday}));}
String _alert_text = "";
int _mid = 0;
String _alerttagcode = "";
String _ssql = "";
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Sub InsertAlertSistema(TypeOfAlert As Int, LastSyn";
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="If TypeOfAlert = 0 Then";
if (_typeofalert==0) { 
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="Log(\"INSERT ALERTA LONG TIME NO UPDATE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659506691","INSERT ALERTA LONG TIME NO UPDATE",0);
RDebugUtils.currentLine=59506692;
 //BA.debugLineNum = 59506692;BA.debugLine="Dim Alert_text As String = $\"A Ultima sincroniza";
_alert_text = ("A Ultima sincronização efectuada foi no dia : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_lastsyncday))+"");
 }else 
{RDebugUtils.currentLine=59506693;
 //BA.debugLineNum = 59506693;BA.debugLine="Else If TypeOfAlert = 1 Then";
if (_typeofalert==1) { 
RDebugUtils.currentLine=59506694;
 //BA.debugLineNum = 59506694;BA.debugLine="Log(\"INSERT ALERTA ERRO UPDATE OFFLINE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659506694","INSERT ALERTA ERRO UPDATE OFFLINE",0);
RDebugUtils.currentLine=59506695;
 //BA.debugLineNum = 59506695;BA.debugLine="Dim Alert_text As String = $\"Alguns dados não fo";
_alert_text = ("Alguns dados não foram enviados para o Servidor");
 }}
;
RDebugUtils.currentLine=59506699;
 //BA.debugLineNum = 59506699;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_al";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=59506700;
 //BA.debugLineNum = 59506700;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateTa";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._generatetagcode /*String*/ (mostCurrent.activityBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=59506701;
 //BA.debugLineNum = 59506701;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (id";
_ssql = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"+"							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"							values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_REQUESTS', 'ALRTTYP_ALERT', 1, 1, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alert_text))+"', \n"+"	'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=59506705;
 //BA.debugLineNum = 59506705;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL, \"";
mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=59506706;
 //BA.debugLineNum = 59506706;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=59506707;
 //BA.debugLineNum = 59506707;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _generateliteupdatefiles(String _tagcodeslist,Object _jobobject) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "generateliteupdatefiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "generateliteupdatefiles", new Object[] {_tagcodeslist,_jobobject}));}
ResumableSub_GenerateLiteUpdateFiles rsub = new ResumableSub_GenerateLiteUpdateFiles(null,_tagcodeslist,_jobobject);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GenerateLiteUpdateFiles extends BA.ResumableSub {
public ResumableSub_GenerateLiteUpdateFiles(xevolution.vrcg.devdemov2400.dataupdate parent,String _tagcodeslist,Object _jobobject) {
this.parent = parent;
this._tagcodeslist = _tagcodeslist;
this._jobobject = _jobobject;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _tagcodeslist;
Object _jobobject;
xevolution.vrcg.devdemov2400.types._filedownloadinformation _returndata = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62193665;
 //BA.debugLineNum = 62193665;BA.debugLine="Dim ReturnData As FileDownloadInformation = Types";
_returndata = parent.mostCurrent._types._makefiledownloadinformationclear /*xevolution.vrcg.devdemov2400.types._filedownloadinformation*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=62193666;
 //BA.debugLineNum = 62193666;BA.debugLine="If Starter.FirstInstall Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._starter._firstinstall /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=62193667;
 //BA.debugLineNum = 62193667;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Utils.";
parent.mostCurrent._sharecode._app_last_lite_update_datetime /*String*/  = parent.mostCurrent._utils._getlast60days /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=62193668;
 //BA.debugLineNum = 62193668;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"GenerateLiteUp";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","GenerateLiteUpdateFiles",("Set APP_LAST_LITE_UPDATE_DATETIME to Date - 60 Days : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_last_lite_update_datetime /*String*/ ))+""));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=62193671;
 //BA.debugLineNum = 62193671;BA.debugLine="ReturnData.DownloadFilename = Utils.RandomString";
_returndata.DownloadFilename /*String*/  = parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=62193672;
 //BA.debugLineNum = 62193672;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62193673;
 //BA.debugLineNum = 62193673;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=62193674;
 //BA.debugLineNum = 62193674;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=62193675;
 //BA.debugLineNum = 62193675;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=62193676;
 //BA.debugLineNum = 62193676;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=62193677;
 //BA.debugLineNum = 62193677;BA.debugLine="params.Put(\"name\", ReturnData.DownloadFilename)";
_params.Put((Object)("name"),(Object)(_returndata.DownloadFilename /*String*/ ));
RDebugUtils.currentLine=62193678;
 //BA.debugLineNum = 62193678;BA.debugLine="params.Put(\"datetime\", ShareCode.APP_LAST_LITE_UP";
_params.Put((Object)("datetime"),(Object)(parent.mostCurrent._sharecode._app_last_lite_update_datetime /*String*/ ));
RDebugUtils.currentLine=62193679;
 //BA.debugLineNum = 62193679;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=62193680;
 //BA.debugLineNum = 62193680;BA.debugLine="params.Put(\"requestTagcodes\", tagCodesList)";
_params.Put((Object)("requestTagcodes"),(Object)(_tagcodeslist));
RDebugUtils.currentLine=62193681;
 //BA.debugLineNum = 62193681;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=62193682;
 //BA.debugLineNum = 62193682;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=62193683;
 //BA.debugLineNum = 62193683;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=62193684;
 //BA.debugLineNum = 62193684;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=62193685;
 //BA.debugLineNum = 62193685;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=62193686;
 //BA.debugLineNum = 62193686;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=62193688;
 //BA.debugLineNum = 62193688;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=62193689;
 //BA.debugLineNum = 62193689;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=62193690;
 //BA.debugLineNum = 62193690;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=62193692;
 //BA.debugLineNum = 62193692;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"GenerateLiteUpd";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","GenerateLiteUpdateFiles",_data);
RDebugUtils.currentLine=62193693;
 //BA.debugLineNum = 62193693;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/requests-pending");
RDebugUtils.currentLine=62193694;
 //BA.debugLineNum = 62193694;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 5:
//if
this.state = 10;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=62193695;
 //BA.debugLineNum = 62193695;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=62193696;
 //BA.debugLineNum = 62193696;BA.debugLine="Job.Initialize(\"\",jobObject)";
_job._initialize /*String*/ (null,processBA,"",_jobobject);
RDebugUtils.currentLine=62193697;
 //BA.debugLineNum = 62193697;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=62193698;
 //BA.debugLineNum = 62193698;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=62193699;
 //BA.debugLineNum = 62193699;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "generateliteupdatefiles"), (Object)(_job));
this.state = 11;
return;
case 11:
//C
this.state = 10;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=62193700;
 //BA.debugLineNum = 62193700;BA.debugLine="ReturnData.Downloaded = Job.Success";
_returndata.Downloaded /*boolean*/  = _job._success /*boolean*/ ;
RDebugUtils.currentLine=62193701;
 //BA.debugLineNum = 62193701;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=62193703;
 //BA.debugLineNum = 62193703;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
anywheresoftware.b4a.keywords.Common.LogImpl("662193703","Error APP_WORKING_LOCAL",0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=62193705;
 //BA.debugLineNum = 62193705;BA.debugLine="Return ReturnData";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_returndata));return;};
RDebugUtils.currentLine=62193706;
 //BA.debugLineNum = 62193706;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getfirstinstalsqlfilestotal22(String _filename,boolean _isupdate) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getfirstinstalsqlfilestotal22", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getfirstinstalsqlfilestotal22", new Object[] {_filename,_isupdate}));}
ResumableSub_GetFirstInstalSqlFilesTotal22 rsub = new ResumableSub_GetFirstInstalSqlFilesTotal22(null,_filename,_isupdate);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetFirstInstalSqlFilesTotal22 extends BA.ResumableSub {
public ResumableSub_GetFirstInstalSqlFilesTotal22(xevolution.vrcg.devdemov2400.dataupdate parent,String _filename,boolean _isupdate) {
this.parent = parent;
this._filename = _filename;
this._isupdate = _isupdate;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _filename;
boolean _isupdate;
int _trycount = 0;
boolean _dotry = false;
int _total = 0;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager _ctm = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
String _jsonstruct = "";
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
boolean _result = false;
String _date = "";
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
int step42;
int limit42;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61538306;
 //BA.debugLineNum = 61538306;BA.debugLine="TagCodesString = \"\"";
parent.mostCurrent._tagcodesstring = "";
RDebugUtils.currentLine=61538307;
 //BA.debugLineNum = 61538307;BA.debugLine="TagCodesTasksString = \"\"";
parent.mostCurrent._tagcodestasksstring = "";
RDebugUtils.currentLine=61538308;
 //BA.debugLineNum = 61538308;BA.debugLine="TagCodesContactsString = \"\"";
parent.mostCurrent._tagcodescontactsstring = "";
RDebugUtils.currentLine=61538309;
 //BA.debugLineNum = 61538309;BA.debugLine="TagCodesLocationsString = \"\"";
parent.mostCurrent._tagcodeslocationsstring = "";
RDebugUtils.currentLine=61538310;
 //BA.debugLineNum = 61538310;BA.debugLine="TagCodesTPRequestsString = \"\"";
parent.mostCurrent._tagcodestprequestsstring = "";
RDebugUtils.currentLine=61538311;
 //BA.debugLineNum = 61538311;BA.debugLine="TagCodesObjectsString = \"\"";
parent.mostCurrent._tagcodesobjectsstring = "";
RDebugUtils.currentLine=61538312;
 //BA.debugLineNum = 61538312;BA.debugLine="Dim trycount As Int = 0";
_trycount = (int) (0);
RDebugUtils.currentLine=61538313;
 //BA.debugLineNum = 61538313;BA.debugLine="Dim dotry As Boolean = True";
_dotry = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61538314;
 //BA.debugLineNum = 61538314;BA.debugLine="Dim total As Int = -1";
_total = (int) (-1);
RDebugUtils.currentLine=61538315;
 //BA.debugLineNum = 61538315;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=61538316;
 //BA.debugLineNum = 61538316;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_AC";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=61538317;
 //BA.debugLineNum = 61538317;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61538318;
 //BA.debugLineNum = 61538318;BA.debugLine="Dim ctm As CustomTrustManager";
_ctm = new anywheresoftware.b4a.net.FTPWrapper.CustomTrustManager();
RDebugUtils.currentLine=61538319;
 //BA.debugLineNum = 61538319;BA.debugLine="ctm.InitializeAcceptAll";
_ctm.InitializeAcceptAll();
RDebugUtils.currentLine=61538320;
 //BA.debugLineNum = 61538320;BA.debugLine="GlobalFTP.SetCustomSSLTrustManager(ctm)";
_globalftp.SetCustomSSLTrustManager((Object)(_ctm.getObject()));
RDebugUtils.currentLine=61538321;
 //BA.debugLineNum = 61538321;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=61538322;
 //BA.debugLineNum = 61538322;BA.debugLine="Do While (dotry And (trycount <3))";
if (true) break;

case 1:
//do while
this.state = 36;
while ((_dotry && (_trycount<3))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61538324;
 //BA.debugLineNum = 61538324;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/\" &";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/db/"+_filename,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61538325;
 //BA.debugLineNum = 61538325;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "getfirstinstalsqlfilestotal22"), _sf);
this.state = 37;
return;
case 37:
//C
this.state = 4;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61538327;
 //BA.debugLineNum = 61538327;BA.debugLine="If Success Then";
if (true) break;

case 4:
//if
this.state = 35;
if (_success) { 
this.state = 6;
}else {
this.state = 34;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61538329;
 //BA.debugLineNum = 61538329;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 32;
this.catchState = 31;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 31;
RDebugUtils.currentLine=61538330;
 //BA.debugLineNum = 61538330;BA.debugLine="Log(fileName & \" file was download successfull";
anywheresoftware.b4a.keywords.Common.LogImpl("661538330",_filename+" file was download successfully",0);
RDebugUtils.currentLine=61538332;
 //BA.debugLineNum = 61538332;BA.debugLine="If ShareCode.newReturn = 1 Then";
if (true) break;

case 10:
//if
this.state = 29;
if (parent.mostCurrent._sharecode._newreturn /*int*/ ==1) { 
this.state = 12;
}else {
this.state = 28;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=61538334;
 //BA.debugLineNum = 61538334;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=61538335;
 //BA.debugLineNum = 61538335;BA.debugLine="Dim JsonStruct As String = File.readstring(St";
_jsonstruct = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61538336;
 //BA.debugLineNum = 61538336;BA.debugLine="parser.Initialize(JsonStruct)";
_parser.Initialize(_jsonstruct);
RDebugUtils.currentLine=61538337;
 //BA.debugLineNum = 61538337;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=61538338;
 //BA.debugLineNum = 61538338;BA.debugLine="Dim DataHora As String = root.Get(\"datetime\")";
_datahora = BA.ObjectToString(_root.Get((Object)("datetime")));
RDebugUtils.currentLine=61538339;
 //BA.debugLineNum = 61538339;BA.debugLine="Dim Totalfiles As Int = root.Get(\"files\")";
_totalfiles = (int)(BA.ObjectToNumber(_root.Get((Object)("files"))));
RDebugUtils.currentLine=61538340;
 //BA.debugLineNum = 61538340;BA.debugLine="Dim inserts As List = root.Get(\"inserts\")";
_inserts = new anywheresoftware.b4a.objects.collections.List();
_inserts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("inserts"))));
RDebugUtils.currentLine=61538345;
 //BA.debugLineNum = 61538345;BA.debugLine="For Each colinserts As Map In inserts";
if (true) break;

case 13:
//for
this.state = 26;
_colinserts = new anywheresoftware.b4a.objects.collections.Map();
group31 = _inserts;
index31 = 0;
groupLen31 = group31.getSize();
this.state = 38;
if (true) break;

case 38:
//C
this.state = 26;
if (index31 < groupLen31) {
this.state = 15;
_colinserts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group31.Get(index31)));}
if (true) break;

case 39:
//C
this.state = 38;
index31++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=61538346;
 //BA.debugLineNum = 61538346;BA.debugLine="Dim mastertagcode As String = colinserts.Get";
_mastertagcode = BA.ObjectToString(_colinserts.Get((Object)("mastertagcode")));
RDebugUtils.currentLine=61538347;
 //BA.debugLineNum = 61538347;BA.debugLine="Try";
if (true) break;

case 16:
//try
this.state = 21;
this.catchState = 20;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 21;
this.catchState = 20;
RDebugUtils.currentLine=61538348;
 //BA.debugLineNum = 61538348;BA.debugLine="Dim childfield As String = colinserts.Get(\"";
_childfield = BA.ObjectToString(_colinserts.Get((Object)("childfield")));
 if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 31;
RDebugUtils.currentLine=61538350;
 //BA.debugLineNum = 61538350;BA.debugLine="Dim childfield As String = \"\"";
_childfield = "";
RDebugUtils.currentLine=61538351;
 //BA.debugLineNum = 61538351;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661538351",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 31;
;
RDebugUtils.currentLine=61538353;
 //BA.debugLineNum = 61538353;BA.debugLine="Dim tagcodelist As String = colinserts.Get(\"";
_tagcodelist = BA.ObjectToString(_colinserts.Get((Object)("tagcodelist")));
RDebugUtils.currentLine=61538354;
 //BA.debugLineNum = 61538354;BA.debugLine="Dim NewInfoList As List = Regex.Split(\"\\|\",";
_newinfolist = new anywheresoftware.b4a.objects.collections.List();
_newinfolist = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_tagcodelist));
RDebugUtils.currentLine=61538355;
 //BA.debugLineNum = 61538355;BA.debugLine="Dim table As String = colinserts.Get(\"table\"";
_table = BA.ObjectToString(_colinserts.Get((Object)("table")));
RDebugUtils.currentLine=61538357;
 //BA.debugLineNum = 61538357;BA.debugLine="For i=0 To NewInfoList.Size -1";
if (true) break;

case 22:
//for
this.state = 25;
step42 = 1;
limit42 = (int) (_newinfolist.getSize()-1);
_i = (int) (0) ;
this.state = 40;
if (true) break;

case 40:
//C
this.state = 25;
if ((step42 > 0 && _i <= limit42) || (step42 < 0 && _i >= limit42)) this.state = 24;
if (true) break;

case 41:
//C
this.state = 40;
_i = ((int)(0 + _i + step42)) ;
if (true) break;

case 24:
//C
this.state = 41;
RDebugUtils.currentLine=61538358;
 //BA.debugLineNum = 61538358;BA.debugLine="Dim res As ResumableSub = DBStructures.Remo";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = parent.mostCurrent._dbstructures._removerecsfromtable /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (mostCurrent.activityBA,_table,_mastertagcode,_childfield,"",BA.ObjectToString(_newinfolist.Get(_i)));
RDebugUtils.currentLine=61538359;
 //BA.debugLineNum = 61538359;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "getfirstinstalsqlfilestotal22"), _res);
this.state = 42;
return;
case 42:
//C
this.state = 41;
_result = (Boolean) result[0];
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 39;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
;
RDebugUtils.currentLine=61538364;
 //BA.debugLineNum = 61538364;BA.debugLine="total = Totalfiles";
_total = _totalfiles;
RDebugUtils.currentLine=61538365;
 //BA.debugLineNum = 61538365;BA.debugLine="Dim date As String = DataHora";
_date = _datahora;
RDebugUtils.currentLine=61538366;
 //BA.debugLineNum = 61538366;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61538367;
 //BA.debugLineNum = 61538367;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61538368;
 //BA.debugLineNum = 61538368;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61538369;
 //BA.debugLineNum = 61538369;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=61538370;
 //BA.debugLineNum = 61538370;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=61538374;
 //BA.debugLineNum = 61538374;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61538375;
 //BA.debugLineNum = 61538375;BA.debugLine="List1 = File.ReadList(Starter.Provider.Shared";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_filename);
RDebugUtils.currentLine=61538376;
 //BA.debugLineNum = 61538376;BA.debugLine="total = List1.Get(0) ' Numero de ficheiros pa";
_total = (int)(BA.ObjectToNumber(_list1.Get((int) (0))));
RDebugUtils.currentLine=61538377;
 //BA.debugLineNum = 61538377;BA.debugLine="Dim date As String = List1.Get(1)";
_date = BA.ObjectToString(_list1.Get((int) (1)));
RDebugUtils.currentLine=61538378;
 //BA.debugLineNum = 61538378;BA.debugLine="Utils.UpdateLiteUpdateDateTime(date)";
parent.mostCurrent._utils._updateliteupdatedatetime /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61538379;
 //BA.debugLineNum = 61538379;BA.debugLine="DBStructures.UpdateWorkerDbLastUpdate(date)";
parent.mostCurrent._dbstructures._updateworkerdblastupdate /*String*/ (mostCurrent.activityBA,_date);
RDebugUtils.currentLine=61538380;
 //BA.debugLineNum = 61538380;BA.debugLine="dotry = False";
_dotry = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61538381;
 //BA.debugLineNum = 61538381;BA.debugLine="trycount = 3";
_trycount = (int) (3);
RDebugUtils.currentLine=61538382;
 //BA.debugLineNum = 61538382;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
 if (true) break;

case 29:
//C
this.state = 32;
;
RDebugUtils.currentLine=61538385;
 //BA.debugLineNum = 61538385;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
 if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 0;
RDebugUtils.currentLine=61538387;
 //BA.debugLineNum = 61538387;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661538387",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=61538388;
 //BA.debugLineNum = 61538388;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 35;
this.catchState = 0;
;
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=61538392;
 //BA.debugLineNum = 61538392;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661538392",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=61538393;
 //BA.debugLineNum = 61538393;BA.debugLine="Log(\"Error downloading file \" & fileName)";
anywheresoftware.b4a.keywords.Common.LogImpl("661538393","Error downloading file "+_filename,0);
RDebugUtils.currentLine=61538394;
 //BA.debugLineNum = 61538394;BA.debugLine="trycount = trycount + 1";
_trycount = (int) (_trycount+1);
 if (true) break;

case 35:
//C
this.state = 1;
;
 if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=61538398;
 //BA.debugLineNum = 61538398;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61538399;
 //BA.debugLineNum = 61538399;BA.debugLine="Return total";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_total));return;};
RDebugUtils.currentLine=61538400;
 //BA.debugLineNum = 61538400;BA.debugLine="End Sub";
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
public static String  _insertalerterrors(String _errormsg) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "insertalerterrors", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "insertalerterrors", new Object[] {_errormsg}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _nrecord = null;
int _mid = 0;
String _alerttagcode = "";
String _ssql = "";
RDebugUtils.currentLine=62128128;
 //BA.debugLineNum = 62128128;BA.debugLine="Sub InsertAlertErrors(ErrorMsg As String)";
RDebugUtils.currentLine=62128130;
 //BA.debugLineNum = 62128130;BA.debugLine="Log(\"INSERT ALERTA BACKGROUNDUPDATESERVICE\")";
anywheresoftware.b4a.keywords.Common.LogImpl("662128130","INSERT ALERTA BACKGROUNDUPDATESERVICE",0);
RDebugUtils.currentLine=62128131;
 //BA.debugLineNum = 62128131;BA.debugLine="Private nRecord As Cursor";
_nrecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=62128132;
 //BA.debugLineNum = 62128132;BA.debugLine="Dim mID As Int = DBStructures.GetMaxOfEVC(\"dta_al";
_mid = (int) (mostCurrent._dbstructures._getmaxofevc /*int*/ (mostCurrent.activityBA,"dta_alerts","id","")+1+1000000);
RDebugUtils.currentLine=62128133;
 //BA.debugLineNum = 62128133;BA.debugLine="Dim alerttagcode As String = $\"${Utils.GenerateT";
_alerttagcode = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._generatetagcode /*String*/ (mostCurrent.activityBA,"ALERTINF_")))+"");
RDebugUtils.currentLine=62128134;
 //BA.debugLineNum = 62128134;BA.debugLine="Dim sSQL As String = $\"insert into dta_alerts (i";
_ssql = ("insert into dta_alerts (id, tagcode, relation_tagcode, relation_type, alert_type, internal,\n"+"							origin, title, user_tagcode, date_alert, date_verification, active,alert_visible, status_id, kind_data)\n"+"							values ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_mid))+", '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_alerttagcode))+"', '', 'ALRTREL_REQUESTS', 'ALRTTYP_NOTIFY', 1, 1, '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_errormsg))+"', \n"+"		'"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._sharecode._sess_user /*String*/ ))+"', '"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)))+"', '', 1, 1, 0, 0)");
RDebugUtils.currentLine=62128138;
 //BA.debugLineNum = 62128138;BA.debugLine="Utils.SaveSQLToLog(\"butSavePicture_Click\",sSQL,";
mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"butSavePicture_Click",_ssql,"");
RDebugUtils.currentLine=62128140;
 //BA.debugLineNum = 62128140;BA.debugLine="CallSub(MainMenu,\"BadgeCheckUpdate\")";
anywheresoftware.b4a.keywords.Common.CallSubDebug(processBA,(Object)(mostCurrent._mainmenu.getObject()),"BadgeCheckUpdate");
RDebugUtils.currentLine=62128142;
 //BA.debugLineNum = 62128142;BA.debugLine="End Sub";
return "";
}
public static int  _localdatatoupdate() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "localdatatoupdate", false))
	 {return ((Integer) Debug.delegate(mostCurrent.activityBA, "localdatatoupdate", null));}
int _ret = 0;
String _ssql = "";
anywheresoftware.b4a.sql.SQL.CursorWrapper _irecord = null;
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Sub LocalDataToUpdate As Int";
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Dim ret As Int = 0";
_ret = (int) (0);
RDebugUtils.currentLine=60030979;
 //BA.debugLineNum = 60030979;BA.debugLine="Dim sSQL As String = $\"select distinct count(0) a";
_ssql = ("select distinct count(0) as total from loc_updatesrever where up_state=0");
RDebugUtils.currentLine=60030980;
 //BA.debugLineNum = 60030980;BA.debugLine="Dim iRecord As Cursor";
_irecord = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=60030981;
 //BA.debugLineNum = 60030981;BA.debugLine="Try";
try {RDebugUtils.currentLine=60030982;
 //BA.debugLineNum = 60030982;BA.debugLine="iRecord = Starter.LocalSQLWRK.ExecQuery(sSQL)";
_irecord = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery(_ssql)));
RDebugUtils.currentLine=60030983;
 //BA.debugLineNum = 60030983;BA.debugLine="If (iRecord.RowCount>0) Then";
if ((_irecord.getRowCount()>0)) { 
RDebugUtils.currentLine=60030984;
 //BA.debugLineNum = 60030984;BA.debugLine="iRecord.Position = 0";
_irecord.setPosition((int) (0));
RDebugUtils.currentLine=60030985;
 //BA.debugLineNum = 60030985;BA.debugLine="ret = iRecord.GetInt(\"total\")";
_ret = _irecord.GetInt("total");
RDebugUtils.currentLine=60030986;
 //BA.debugLineNum = 60030986;BA.debugLine="Log(\"««««««««««««««««««««««««««««««««««««\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660030986","««««««««««««««««««««««««««««««««««««",0);
RDebugUtils.currentLine=60030987;
 //BA.debugLineNum = 60030987;BA.debugLine="Log($\"Total local data to upload:${ret}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("660030987",("Total local data to upload:"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ret))+""),0);
RDebugUtils.currentLine=60030988;
 //BA.debugLineNum = 60030988;BA.debugLine="Log(\"««««««««««««««««««««««««««««««««««««\")";
anywheresoftware.b4a.keywords.Common.LogImpl("660030988","««««««««««««««««««««««««««««««««««««",0);
 };
 } 
       catch (Exception e14) {
			processBA.setLastException(e14);RDebugUtils.currentLine=60030993;
 //BA.debugLineNum = 60030993;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("660030993",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=60030994;
 //BA.debugLineNum = 60030994;BA.debugLine="InsertAlertErrors($\"Erro ao enviar os dados loca";
_insertalerterrors(("Erro ao enviar os dados locais para o Servidor "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""));
RDebugUtils.currentLine=60030995;
 //BA.debugLineNum = 60030995;BA.debugLine="ret = 0";
_ret = (int) (0);
 };
RDebugUtils.currentLine=60030997;
 //BA.debugLineNum = 60030997;BA.debugLine="iRecord.Close";
_irecord.Close();
RDebugUtils.currentLine=60030998;
 //BA.debugLineNum = 60030998;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=60030999;
 //BA.debugLineNum = 60030999;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _makedeletesqlfile(String _scriptsfilename) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "makedeletesqlfile", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "makedeletesqlfile", new Object[] {_scriptsfilename}));}
ResumableSub_MakeDeleteSqlFile rsub = new ResumableSub_MakeDeleteSqlFile(null,_scriptsfilename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MakeDeleteSqlFile extends BA.ResumableSub {
public ResumableSub_MakeDeleteSqlFile(xevolution.vrcg.devdemov2400.dataupdate parent,String _scriptsfilename) {
this.parent = parent;
this._scriptsfilename = _scriptsfilename;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _scriptsfilename;
anywheresoftware.b4a.objects.collections.List _listadeletes = null;
int _l = 0;
String _script = "";
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="If Utils.NNE(scriptsFilename) Then";
if (true) break;

case 1:
//if
this.state = 14;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_scriptsfilename)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61276164;
 //BA.debugLineNum = 61276164;BA.debugLine="Dim ListaDeletes As List = File.ReadList(Starter";
_listadeletes = new anywheresoftware.b4a.objects.collections.List();
_listadeletes = anywheresoftware.b4a.keywords.Common.File.ReadList(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_scriptsfilename);
RDebugUtils.currentLine=61276165;
 //BA.debugLineNum = 61276165;BA.debugLine="For l=0 To ListaDeletes.Size -1";
if (true) break;

case 4:
//for
this.state = 13;
step3 = 1;
limit3 = (int) (_listadeletes.getSize()-1);
_l = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 13;
if ((step3 > 0 && _l <= limit3) || (step3 < 0 && _l >= limit3)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_l = ((int)(0 + _l + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61276166;
 //BA.debugLineNum = 61276166;BA.debugLine="Dim script As String = ListaDeletes.Get(l)";
_script = BA.ObjectToString(_listadeletes.Get(_l));
RDebugUtils.currentLine=61276167;
 //BA.debugLineNum = 61276167;BA.debugLine="Try";
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
RDebugUtils.currentLine=61276168;
 //BA.debugLineNum = 61276168;BA.debugLine="Utils.SaveSQLToLog(\"DataUpdate\",script, \"\")";
parent.mostCurrent._utils._savesqltolog /*boolean*/ (mostCurrent.activityBA,"DataUpdate",_script,"");
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=61276170;
 //BA.debugLineNum = 61276170;BA.debugLine="Log($\"ERROR: ${script} - EXCEPTION = ${LastExc";
anywheresoftware.b4a.keywords.Common.LogImpl("661276170",("ERROR: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_script))+" - EXCEPTION = "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA).getObject()))+""),0);
RDebugUtils.currentLine=61276171;
 //BA.debugLineNum = 61276171;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = 16;
this.catchState = 0;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=61276174;
 //BA.debugLineNum = 61276174;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=61276177;
 //BA.debugLineNum = 61276177;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=61276179;
 //BA.debugLineNum = 61276179;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removealllocalinfoandsqlfiles() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "removealllocalinfoandsqlfiles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "removealllocalinfoandsqlfiles", null));}
ResumableSub_RemoveAllLocalInfoAndSqlFiles rsub = new ResumableSub_RemoveAllLocalInfoAndSqlFiles(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveAllLocalInfoAndSqlFiles extends BA.ResumableSub {
public ResumableSub_RemoveAllLocalInfoAndSqlFiles(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
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
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="Dim LocaRes As Boolean = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=60424195;
 //BA.debugLineNum = 60424195;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "removealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=60424196;
 //BA.debugLineNum = 60424196;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=60424197;
 //BA.debugLineNum = 60424197;BA.debugLine="For Each F As String In Files";
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
RDebugUtils.currentLine=60424198;
 //BA.debugLineNum = 60424198;BA.debugLine="If F.ToLowerCase.EndsWith(\".info\") And Not(F.To";
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
RDebugUtils.currentLine=60424199;
 //BA.debugLineNum = 60424199;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_f);
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
RDebugUtils.currentLine=60424202;
 //BA.debugLineNum = 60424202;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=60424204;
 //BA.debugLineNum = 60424204;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=60424207;
 //BA.debugLineNum = 60424207;BA.debugLine="Wait For (File.ListFilesAsync(Starter.Provider.Sh";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "removealllocalinfoandsqlfiles"), anywheresoftware.b4a.keywords.Common.File.ListFilesAsync(processBA,parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ));
this.state = 32;
return;
case 32:
//C
this.state = 15;
_success = (Boolean) result[0];
_files = (anywheresoftware.b4a.objects.collections.List) result[1];
;
RDebugUtils.currentLine=60424208;
 //BA.debugLineNum = 60424208;BA.debugLine="If Success Then";
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
RDebugUtils.currentLine=60424209;
 //BA.debugLineNum = 60424209;BA.debugLine="For Each F As String In Files";
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
RDebugUtils.currentLine=60424210;
 //BA.debugLineNum = 60424210;BA.debugLine="If F.ToLowerCase.EndsWith(\".sql\") And Not(F.ToL";
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
RDebugUtils.currentLine=60424211;
 //BA.debugLineNum = 60424211;BA.debugLine="File.Delete(Starter.Provider.SharedFolder,F)";
anywheresoftware.b4a.keywords.Common.File.Delete(parent.mostCurrent._starter._provider /*xevolution.vrcg.devdemov2400.fileprovider*/ ._sharedfolder /*String*/ ,_f);
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
RDebugUtils.currentLine=60424214;
 //BA.debugLineNum = 60424214;BA.debugLine="LocaRes = True";
_locares = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=60424216;
 //BA.debugLineNum = 60424216;BA.debugLine="LocaRes = False";
_locares = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=60424219;
 //BA.debugLineNum = 60424219;BA.debugLine="Return LocaRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_locares));return;};
RDebugUtils.currentLine=60424221;
 //BA.debugLineNum = 60424221;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _requestsync(String _date2watch,boolean _syncdates) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "requestsync", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "requestsync", new Object[] {_date2watch,_syncdates}));}
ResumableSub_RequestSync rsub = new ResumableSub_RequestSync(null,_date2watch,_syncdates);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RequestSync extends BA.ResumableSub {
public ResumableSub_RequestSync(xevolution.vrcg.devdemov2400.dataupdate parent,String _date2watch,boolean _syncdates) {
this.parent = parent;
this._date2watch = _date2watch;
this._syncdates = _syncdates;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _date2watch;
boolean _syncdates;
String _lastupd = "";
anywheresoftware.b4a.objects.collections.List _dates2sync = null;
String _idate = "";
String _edate = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60686338;
 //BA.debugLineNum = 60686338;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=60686339;
 //BA.debugLineNum = 60686339;BA.debugLine="Dim LastUpd As String = File.ReadString(Starter.";
_lastupd = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_autosync.log"));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60686341;
 //BA.debugLineNum = 60686341;BA.debugLine="Dim LastUpd As String = $\"${Utils.GetCurrentDate";
_lastupd = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA)))+" 00:00:00");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=60686344;
 //BA.debugLineNum = 60686344;BA.debugLine="RequestFileName = Utils.RandomString";
parent.mostCurrent._requestfilename = parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=60686346;
 //BA.debugLineNum = 60686346;BA.debugLine="If SyncDates Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_syncdates) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=60686347;
 //BA.debugLineNum = 60686347;BA.debugLine="Dim Dates2Sync As List = Regex.Split(\"\\|\", date2";
_dates2sync = new anywheresoftware.b4a.objects.collections.List();
_dates2sync = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split("\\|",_date2watch));
RDebugUtils.currentLine=60686348;
 //BA.debugLineNum = 60686348;BA.debugLine="Dim iDate As String = Utils.IfNullOrEmpty(Dates2";
_idate = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_dates2sync.Get((int) (0))),parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=60686349;
 //BA.debugLineNum = 60686349;BA.debugLine="Dim eDate As String = Utils.IfNullOrEmpty(Dates2";
_edate = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_dates2sync.Get((int) (1))),parent.mostCurrent._utils._getcurrentdate /*String*/ (mostCurrent.activityBA));
RDebugUtils.currentLine=60686350;
 //BA.debugLineNum = 60686350;BA.debugLine="iDate = $\"${iDate} 00:00:00\"$";
_idate = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_idate))+" 00:00:00");
RDebugUtils.currentLine=60686351;
 //BA.debugLineNum = 60686351;BA.debugLine="eDate = $\"${eDate} 23:59:59\"$";
_edate = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_edate))+" 23:59:59");
RDebugUtils.currentLine=60686361;
 //BA.debugLineNum = 60686361;BA.debugLine="Dim ServerAddress As String = $\"https://${Share";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/updateSqliteDatesNew");
RDebugUtils.currentLine=60686368;
 //BA.debugLineNum = 60686368;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=60686369;
 //BA.debugLineNum = 60686369;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",dataupdate.getObject());
RDebugUtils.currentLine=60686370;
 //BA.debugLineNum = 60686370;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60686371;
 //BA.debugLineNum = 60686371;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=60686372;
 //BA.debugLineNum = 60686372;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=60686373;
 //BA.debugLineNum = 60686373;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Author";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=60686374;
 //BA.debugLineNum = 60686374;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=60686375;
 //BA.debugLineNum = 60686375;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=60686376;
 //BA.debugLineNum = 60686376;BA.debugLine="params.Put(\"name\", RequestFileName)";
_params.Put((Object)("name"),(Object)(parent.mostCurrent._requestfilename));
RDebugUtils.currentLine=60686377;
 //BA.debugLineNum = 60686377;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=60686378;
 //BA.debugLineNum = 60686378;BA.debugLine="params.Put(\"idate\", iDate)";
_params.Put((Object)("idate"),(Object)(_idate));
RDebugUtils.currentLine=60686379;
 //BA.debugLineNum = 60686379;BA.debugLine="params.Put(\"edate\", eDate)";
_params.Put((Object)("edate"),(Object)(_edate));
RDebugUtils.currentLine=60686380;
 //BA.debugLineNum = 60686380;BA.debugLine="params.Put(\"components\", ShareCode.SYNC_COMPONEN";
_params.Put((Object)("components"),(Object)(parent.mostCurrent._sharecode._sync_components /*String*/ ));
RDebugUtils.currentLine=60686381;
 //BA.debugLineNum = 60686381;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
_params.Put((Object)("smart"),(Object)(parent.mostCurrent._sharecode._isphone /*boolean*/ ));
RDebugUtils.currentLine=60686382;
 //BA.debugLineNum = 60686382;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=60686383;
 //BA.debugLineNum = 60686383;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=60686384;
 //BA.debugLineNum = 60686384;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=60686385;
 //BA.debugLineNum = 60686385;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=60686386;
 //BA.debugLineNum = 60686386;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=60686387;
 //BA.debugLineNum = 60686387;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=60686389;
 //BA.debugLineNum = 60686389;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareC";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/updateSqliteNew");
RDebugUtils.currentLine=60686390;
 //BA.debugLineNum = 60686390;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=60686391;
 //BA.debugLineNum = 60686391;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",dataupdate.getObject());
RDebugUtils.currentLine=60686392;
 //BA.debugLineNum = 60686392;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60686393;
 //BA.debugLineNum = 60686393;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=60686394;
 //BA.debugLineNum = 60686394;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=60686395;
 //BA.debugLineNum = 60686395;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Author";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=60686396;
 //BA.debugLineNum = 60686396;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=60686397;
 //BA.debugLineNum = 60686397;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=60686398;
 //BA.debugLineNum = 60686398;BA.debugLine="params.Put(\"name\", RequestFileName)";
_params.Put((Object)("name"),(Object)(parent.mostCurrent._requestfilename));
RDebugUtils.currentLine=60686399;
 //BA.debugLineNum = 60686399;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=60686400;
 //BA.debugLineNum = 60686400;BA.debugLine="params.Put(\"date\", LastUpd)";
_params.Put((Object)("date"),(Object)(_lastupd));
RDebugUtils.currentLine=60686401;
 //BA.debugLineNum = 60686401;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
_params.Put((Object)("smart"),(Object)(parent.mostCurrent._sharecode._isphone /*boolean*/ ));
RDebugUtils.currentLine=60686402;
 //BA.debugLineNum = 60686402;BA.debugLine="params.Put(\"debug\", 1)";
_params.Put((Object)("debug"),(Object)(1));
RDebugUtils.currentLine=60686403;
 //BA.debugLineNum = 60686403;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=60686404;
 //BA.debugLineNum = 60686404;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriz";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=60686405;
 //BA.debugLineNum = 60686405;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=60686406;
 //BA.debugLineNum = 60686406;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=60686407;
 //BA.debugLineNum = 60686407;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=60686408;
 //BA.debugLineNum = 60686408;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=60686411;
 //BA.debugLineNum = 60686411;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=60686412;
 //BA.debugLineNum = 60686412;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=60686414;
 //BA.debugLineNum = 60686414;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=60686416;
 //BA.debugLineNum = 60686416;BA.debugLine="If SyncDates Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_syncdates) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=60686417;
 //BA.debugLineNum = 60686417;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestSyncMan";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestSyncManual",_data);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=60686419;
 //BA.debugLineNum = 60686419;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestSyncAut";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestSyncAuto",_data);
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=60686422;
 //BA.debugLineNum = 60686422;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=60686423;
 //BA.debugLineNum = 60686423;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=60686424;
 //BA.debugLineNum = 60686424;BA.debugLine="Job.GetRequest.Timeout = 120000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (120000));
RDebugUtils.currentLine=60686426;
 //BA.debugLineNum = 60686426;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "requestsync"), (Object)(_job));
this.state = 23;
return;
case 23:
//C
this.state = 19;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=60686428;
 //BA.debugLineNum = 60686428;BA.debugLine="If Not(Job.Success) Then";
if (true) break;

case 19:
//if
this.state = 22;
if (anywheresoftware.b4a.keywords.Common.Not(_job._success /*boolean*/ )) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=60686429;
 //BA.debugLineNum = 60686429;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=60686430;
 //BA.debugLineNum = 60686430;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=60686433;
 //BA.debugLineNum = 60686433;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=60686434;
 //BA.debugLineNum = 60686434;BA.debugLine="Sleep(1000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "requestsync"),(int) (1000));
this.state = 24;
return;
case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=60686435;
 //BA.debugLineNum = 60686435;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=60686437;
 //BA.debugLineNum = 60686437;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _requestupdate60last7next() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "requestupdate60last7next", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "requestupdate60last7next", null));}
ResumableSub_RequestUpdate60Last7Next rsub = new ResumableSub_RequestUpdate60Last7Next(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RequestUpdate60Last7Next extends BA.ResumableSub {
public ResumableSub_RequestUpdate60Last7Next(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="RequestFileNameHeaders = Utils.RandomString";
parent.mostCurrent._requestfilenameheaders = parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=60358660;
 //BA.debugLineNum = 60358660;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/requests/headers");
RDebugUtils.currentLine=60358662;
 //BA.debugLineNum = 60358662;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=60358663;
 //BA.debugLineNum = 60358663;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",dataupdate.getObject());
RDebugUtils.currentLine=60358664;
 //BA.debugLineNum = 60358664;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60358665;
 //BA.debugLineNum = 60358665;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=60358666;
 //BA.debugLineNum = 60358666;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=60358667;
 //BA.debugLineNum = 60358667;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=60358668;
 //BA.debugLineNum = 60358668;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=60358669;
 //BA.debugLineNum = 60358669;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=60358670;
 //BA.debugLineNum = 60358670;BA.debugLine="params.Put(\"name\", RequestFileNameHeaders)";
_params.Put((Object)("name"),(Object)(parent.mostCurrent._requestfilenameheaders));
RDebugUtils.currentLine=60358671;
 //BA.debugLineNum = 60358671;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=60358672;
 //BA.debugLineNum = 60358672;BA.debugLine="params.Put(\"date\", Utils.GetCurrDatetime)";
_params.Put((Object)("date"),(Object)(parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=60358673;
 //BA.debugLineNum = 60358673;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
_params.Put((Object)("smart"),(Object)(parent.mostCurrent._sharecode._isphone /*boolean*/ ));
RDebugUtils.currentLine=60358674;
 //BA.debugLineNum = 60358674;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=60358675;
 //BA.debugLineNum = 60358675;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=60358676;
 //BA.debugLineNum = 60358676;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=60358677;
 //BA.debugLineNum = 60358677;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=60358678;
 //BA.debugLineNum = 60358678;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=60358679;
 //BA.debugLineNum = 60358679;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=60358683;
 //BA.debugLineNum = 60358683;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=60358684;
 //BA.debugLineNum = 60358684;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=60358686;
 //BA.debugLineNum = 60358686;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=60358688;
 //BA.debugLineNum = 60358688;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdate60";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestUpdate60Last7Next",_data);
RDebugUtils.currentLine=60358690;
 //BA.debugLineNum = 60358690;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=60358691;
 //BA.debugLineNum = 60358691;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=60358692;
 //BA.debugLineNum = 60358692;BA.debugLine="Job.GetRequest.Timeout = 90000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (90000));
RDebugUtils.currentLine=60358694;
 //BA.debugLineNum = 60358694;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "requestupdate60last7next"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=60358696;
 //BA.debugLineNum = 60358696;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=60358697;
 //BA.debugLineNum = 60358697;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("660358697",_serveraddress,0);
RDebugUtils.currentLine=60358698;
 //BA.debugLineNum = 60358698;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdate6";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestUpdate60Last7Next","/api/orion/generate/requests/headers : CONCLUIDA");
RDebugUtils.currentLine=60358699;
 //BA.debugLineNum = 60358699;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=60358700;
 //BA.debugLineNum = 60358700;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60358702;
 //BA.debugLineNum = 60358702;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
RDebugUtils.currentLine=60358703;
 //BA.debugLineNum = 60358703;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("660358703",_serveraddress,0);
RDebugUtils.currentLine=60358704;
 //BA.debugLineNum = 60358704;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdate6";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestUpdate60Last7Next","ERRO NA TAREFA /api/orion/generate/requests/headers");
RDebugUtils.currentLine=60358705;
 //BA.debugLineNum = 60358705;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=60358706;
 //BA.debugLineNum = 60358706;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=60358709;
 //BA.debugLineNum = 60358709;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _requestupdateonday() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "requestupdateonday", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "requestupdateonday", null));}
ResumableSub_RequestUpdateOnDay rsub = new ResumableSub_RequestUpdateOnDay(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RequestUpdateOnDay extends BA.ResumableSub {
public ResumableSub_RequestUpdateOnDay(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _lastondaysyncdate = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60555266;
 //BA.debugLineNum = 60555266;BA.debugLine="RequestFileNameOnDay = Utils.RandomString";
parent.mostCurrent._requestfilenameonday = parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA);
RDebugUtils.currentLine=60555267;
 //BA.debugLineNum = 60555267;BA.debugLine="If File.Exists(Starter.InternalFolder,$\"${ShareCo";
if (true) break;

case 1:
//if
this.state = 6;
if (anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_upd.log"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=60555268;
 //BA.debugLineNum = 60555268;BA.debugLine="Dim LastOnDaySyncDate As String = File.ReadStrin";
_lastondaysyncdate = anywheresoftware.b4a.keywords.Common.File.ReadString(parent.mostCurrent._starter._internalfolder /*String*/ ,(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._sess_oper_user /*String*/ ))+"_upd.log"));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60555270;
 //BA.debugLineNum = 60555270;BA.debugLine="Dim LastOnDaySyncDate As String = Utils.GetCurrD";
_lastondaysyncdate = parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA);
 if (true) break;
;
RDebugUtils.currentLine=60555273;
 //BA.debugLineNum = 60555273;BA.debugLine="If (ShareCode.FIRSTDAILYLOGIN) Then";

case 6:
//if
this.state = 9;
if ((parent.mostCurrent._sharecode._firstdailylogin /*boolean*/ )) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=60555274;
 //BA.debugLineNum = 60555274;BA.debugLine="LastOnDaySyncDate = $\"${Utils.GetCurrDatetimeExt";
_lastondaysyncdate = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._getcurrdatetimeext /*String*/ (mostCurrent.activityBA)))+"");
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=60555277;
 //BA.debugLineNum = 60555277;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/requests/onday");
RDebugUtils.currentLine=60555278;
 //BA.debugLineNum = 60555278;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=60555279;
 //BA.debugLineNum = 60555279;BA.debugLine="Job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,processBA,"",dataupdate.getObject());
RDebugUtils.currentLine=60555280;
 //BA.debugLineNum = 60555280;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60555281;
 //BA.debugLineNum = 60555281;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=60555282;
 //BA.debugLineNum = 60555282;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=60555283;
 //BA.debugLineNum = 60555283;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=60555284;
 //BA.debugLineNum = 60555284;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=60555285;
 //BA.debugLineNum = 60555285;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=60555286;
 //BA.debugLineNum = 60555286;BA.debugLine="params.Put(\"name\", RequestFileNameOnDay)";
_params.Put((Object)("name"),(Object)(parent.mostCurrent._requestfilenameonday));
RDebugUtils.currentLine=60555287;
 //BA.debugLineNum = 60555287;BA.debugLine="params.Put(\"newReturn\", ShareCode.newreturn)";
_params.Put((Object)("newReturn"),(Object)(parent.mostCurrent._sharecode._newreturn /*int*/ ));
RDebugUtils.currentLine=60555288;
 //BA.debugLineNum = 60555288;BA.debugLine="params.Put(\"date\",LastOnDaySyncDate )";
_params.Put((Object)("date"),(Object)(_lastondaysyncdate));
RDebugUtils.currentLine=60555289;
 //BA.debugLineNum = 60555289;BA.debugLine="params.Put(\"smart\", ShareCode.ISPHONE)";
_params.Put((Object)("smart"),(Object)(parent.mostCurrent._sharecode._isphone /*boolean*/ ));
RDebugUtils.currentLine=60555290;
 //BA.debugLineNum = 60555290;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=60555291;
 //BA.debugLineNum = 60555291;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=60555292;
 //BA.debugLineNum = 60555292;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=60555293;
 //BA.debugLineNum = 60555293;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=60555294;
 //BA.debugLineNum = 60555294;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=60555295;
 //BA.debugLineNum = 60555295;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=60555297;
 //BA.debugLineNum = 60555297;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=60555298;
 //BA.debugLineNum = 60555298;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=60555300;
 //BA.debugLineNum = 60555300;BA.debugLine="Dim data As String = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=60555302;
 //BA.debugLineNum = 60555302;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdateOn";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestUpdateOnDay",_data);
RDebugUtils.currentLine=60555304;
 //BA.debugLineNum = 60555304;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=60555305;
 //BA.debugLineNum = 60555305;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=60555306;
 //BA.debugLineNum = 60555306;BA.debugLine="Job.GetRequest.Timeout = 90000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (90000));
RDebugUtils.currentLine=60555308;
 //BA.debugLineNum = 60555308;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "requestupdateonday"), (Object)(_job));
this.state = 16;
return;
case 16:
//C
this.state = 10;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=60555310;
 //BA.debugLineNum = 60555310;BA.debugLine="If Job.Success Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_job._success /*boolean*/ ) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=60555311;
 //BA.debugLineNum = 60555311;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("660555311",_serveraddress,0);
RDebugUtils.currentLine=60555312;
 //BA.debugLineNum = 60555312;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdateO";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestUpdateOnDay","Completed");
RDebugUtils.currentLine=60555313;
 //BA.debugLineNum = 60555313;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=60555314;
 //BA.debugLineNum = 60555314;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=60555316;
 //BA.debugLineNum = 60555316;BA.debugLine="Log(ServerAddress)";
anywheresoftware.b4a.keywords.Common.LogImpl("660555316",_serveraddress,0);
RDebugUtils.currentLine=60555317;
 //BA.debugLineNum = 60555317;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RequestUpdateO";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RequestUpdateOnDay","ERROR");
RDebugUtils.currentLine=60555318;
 //BA.debugLineNum = 60555318;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=60555320;
 //BA.debugLineNum = 60555320;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=60555321;
 //BA.debugLineNum = 60555321;BA.debugLine="Sleep(5000)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "requestupdateonday"),(int) (5000));
this.state = 17;
return;
case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=60555322;
 //BA.debugLineNum = 60555322;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=60555324;
 //BA.debugLineNum = 60555324;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _runliteupdate(String _tagcodeslist) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "runliteupdate", false))
	 {Debug.delegate(mostCurrent.activityBA, "runliteupdate", new Object[] {_tagcodeslist}); return;}
ResumableSub_RunLiteUpdate rsub = new ResumableSub_RunLiteUpdate(null,_tagcodeslist);
rsub.resume(processBA, null);
}
public static class ResumableSub_RunLiteUpdate extends BA.ResumableSub {
public ResumableSub_RunLiteUpdate(xevolution.vrcg.devdemov2400.dataupdate parent,String _tagcodeslist) {
this.parent = parent;
this._tagcodeslist = _tagcodeslist;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _tagcodeslist;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _res = null;
xevolution.vrcg.devdemov2400.types._filedownloadinformation _returndata = null;
String _update_install_info = "";
String _updateinstallfilesname = "";
boolean _result = false;
boolean _finish = false;
boolean _completed = false;
boolean _isfilesdeleted = false;
boolean _isdownloadfilesfinish = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61931525;
 //BA.debugLineNum = 61931525;BA.debugLine="Starter.StopLocationCheck = True";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61931526;
 //BA.debugLineNum = 61931526;BA.debugLine="StopService(LocationService)";
anywheresoftware.b4a.keywords.Common.StopService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=61931527;
 //BA.debugLineNum = 61931527;BA.debugLine="ButtonWelcomeNext.Enabled = False";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=61931529;
 //BA.debugLineNum = 61931529;BA.debugLine="SetUpDownArrows(\"Download\")";
_setupdownarrows("Download");
RDebugUtils.currentLine=61931530;
 //BA.debugLineNum = 61931530;BA.debugLine="lbldataupdatetitle.Text = ShareCode.MsgUpdateTitl";
parent.mostCurrent._lbldataupdatetitle.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleactualizacao /*String*/ ));
RDebugUtils.currentLine=61931531;
 //BA.debugLineNum = 61931531;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateTi";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitleobterinfo /*String*/ ));
RDebugUtils.currentLine=61931532;
 //BA.debugLineNum = 61931532;BA.debugLine="lbldataupdateprocess.Text = \"\"";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=61931534;
 //BA.debugLineNum = 61931534;BA.debugLine="Dim res As ResumableSub = GenerateLiteUpdateFiles";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _generateliteupdatefiles(_tagcodeslist,dataupdate.getObject());
RDebugUtils.currentLine=61931535;
 //BA.debugLineNum = 61931535;BA.debugLine="Wait For(res) Complete (ReturnData As FileDownloa";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_returndata = (xevolution.vrcg.devdemov2400.types._filedownloadinformation) result[0];
;
RDebugUtils.currentLine=61931537;
 //BA.debugLineNum = 61931537;BA.debugLine="If (ReturnData.Downloaded) Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_returndata.Downloaded /*boolean*/ )) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61931539;
 //BA.debugLineNum = 61931539;BA.debugLine="Dim UPDATE_INSTALL_INFO As String = $\"${ReturnDa";
_update_install_info = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_returndata.DownloadFilename /*String*/ ))+".INFO");
RDebugUtils.currentLine=61931540;
 //BA.debugLineNum = 61931540;BA.debugLine="Dim updateInstallFilesName As String = ReturnDat";
_updateinstallfilesname = _returndata.DownloadFilename /*String*/ ;
RDebugUtils.currentLine=61931542;
 //BA.debugLineNum = 61931542;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdateT";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddados /*String*/ ));
RDebugUtils.currentLine=61931543;
 //BA.debugLineNum = 61931543;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpdate\"";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RunLiteUpdate",parent.mostCurrent._lbldataupdateprocess.getText());
RDebugUtils.currentLine=61931544;
 //BA.debugLineNum = 61931544;BA.debugLine="Dim res As ResumableSub = DownloadSqlFilesLiteUp";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _downloadsqlfilesliteupdate(_update_install_info,_updateinstallfilesname);
RDebugUtils.currentLine=61931545;
 //BA.debugLineNum = 61931545;BA.debugLine="Wait For(res) Complete (result As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 22;
return;
case 22:
//C
this.state = 4;
_result = (Boolean) result[0];
;
RDebugUtils.currentLine=61931547;
 //BA.debugLineNum = 61931547;BA.debugLine="If(result)Then";
if (true) break;

case 4:
//if
this.state = 19;
if ((_result)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61931549;
 //BA.debugLineNum = 61931549;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpdate";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitlecarregardados /*String*/ ));
RDebugUtils.currentLine=61931550;
 //BA.debugLineNum = 61931550;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpdate";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RunLiteUpdate",parent.mostCurrent._lbldataupdateprocess.getText());
RDebugUtils.currentLine=61931551;
 //BA.debugLineNum = 61931551;BA.debugLine="ShareCode.AlreadyDeleted = True";
parent.mostCurrent._sharecode._alreadydeleted /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61931552;
 //BA.debugLineNum = 61931552;BA.debugLine="Dim res As ResumableSub = ExecuteSqlFiles(updat";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _executesqlfiles(_updateinstallfilesname,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61931553;
 //BA.debugLineNum = 61931553;BA.debugLine="Wait For(res) Complete (finish As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 23;
return;
case 23:
//C
this.state = 7;
_finish = (Boolean) result[0];
;
RDebugUtils.currentLine=61931555;
 //BA.debugLineNum = 61931555;BA.debugLine="If(finish)Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_finish)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=61931556;
 //BA.debugLineNum = 61931556;BA.debugLine="Dim res As ResumableSub = SendServerProcessCom";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _sendserverprocesscomplete(anywheresoftware.b4a.keywords.Common.False,_returndata.DownloadFilename /*String*/ ,dataupdate.getObject());
RDebugUtils.currentLine=61931557;
 //BA.debugLineNum = 61931557;BA.debugLine="Wait For(res) Complete (Completed As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_completed = (Boolean) result[0];
;
RDebugUtils.currentLine=61931559;
 //BA.debugLineNum = 61931559;BA.debugLine="Dim res As ResumableSub = DeleteSqlFiles(updat";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _deletesqlfiles(_updateinstallfilesname);
RDebugUtils.currentLine=61931560;
 //BA.debugLineNum = 61931560;BA.debugLine="Wait For(res) Complete (IsFilesDeleted As Bool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 25;
return;
case 25:
//C
this.state = 10;
_isfilesdeleted = (Boolean) result[0];
;
RDebugUtils.currentLine=61931562;
 //BA.debugLineNum = 61931562;BA.debugLine="If(IsFilesDeleted) Then";
if (true) break;

case 10:
//if
this.state = 17;
if ((_isfilesdeleted)) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=61931563;
 //BA.debugLineNum = 61931563;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgUpda";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgupdatetitledownloaddadosextra /*String*/ ));
RDebugUtils.currentLine=61931564;
 //BA.debugLineNum = 61931564;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpda";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RunLiteUpdate",parent.mostCurrent._lbldataupdateprocess.getText());
RDebugUtils.currentLine=61931565;
 //BA.debugLineNum = 61931565;BA.debugLine="Dim res As ResumableSub = UpdateFilesWithFTP(";
_res = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_res = _updatefileswithftp("",parent.mostCurrent._lbldataupdatedownload);
RDebugUtils.currentLine=61931566;
 //BA.debugLineNum = 61931566;BA.debugLine="Wait For(res) Complete (IsDownloadFilesFinish";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "runliteupdate"), _res);
this.state = 26;
return;
case 26:
//C
this.state = 13;
_isdownloadfilesfinish = (Boolean) result[0];
;
RDebugUtils.currentLine=61931568;
 //BA.debugLineNum = 61931568;BA.debugLine="If (IsDownloadFilesFinish) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_isdownloadfilesfinish)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=61931569;
 //BA.debugLineNum = 61931569;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61931570;
 //BA.debugLineNum = 61931570;BA.debugLine="ProgressBar1.Visible = False";
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=61931571;
 //BA.debugLineNum = 61931571;BA.debugLine="lbldataupdateprocess.Text = ShareCode.MsgDat";
parent.mostCurrent._lbldataupdateprocess.setText(BA.ObjectToCharSequence(parent.mostCurrent._sharecode._msgdataupdateprocessconcluido /*String*/ ));
RDebugUtils.currentLine=61931572;
 //BA.debugLineNum = 61931572;BA.debugLine="Utils.ShowProcinLog(\"DataUpdate\",\"RunLiteUpd";
parent.mostCurrent._utils._showprocinlog /*String*/ (mostCurrent.activityBA,"DataUpdate","RunLiteUpdate",parent.mostCurrent._lbldataupdateprocess.getText());
RDebugUtils.currentLine=61931573;
 //BA.debugLineNum = 61931573;BA.debugLine="lbldataupdateprocess.TextColor =  Consts.Col";
parent.mostCurrent._lbldataupdateprocess.setTextColor(parent.mostCurrent._consts._colormain /*int*/ );
RDebugUtils.currentLine=61931574;
 //BA.debugLineNum = 61931574;BA.debugLine="ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Ut";
parent.mostCurrent._sharecode._app_last_lite_update_datetime /*String*/  = parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA);
 if (true) break;

case 16:
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
this.state = 19;
;
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
RDebugUtils.currentLine=61931582;
 //BA.debugLineNum = 61931582;BA.debugLine="ProgressBar1.Visible = False";
parent.mostCurrent._progressbar1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=61931586;
 //BA.debugLineNum = 61931586;BA.debugLine="Starter.StopLocationCheck = False";
parent.mostCurrent._starter._stoplocationcheck /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61931587;
 //BA.debugLineNum = 61931587;BA.debugLine="StartService(LocationService)";
anywheresoftware.b4a.keywords.Common.StartService(processBA,(Object)(parent.mostCurrent._locationservice.getObject()));
RDebugUtils.currentLine=61931588;
 //BA.debugLineNum = 61931588;BA.debugLine="ButtonWelcomeNext.Enabled = True";
parent.mostCurrent._buttonwelcomenext.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61931589;
 //BA.debugLineNum = 61931589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setupdownarrows(String _mode) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupdownarrows", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "setupdownarrows", new Object[] {_mode}));}
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Sub SetUpDownArrows(Mode As String)";
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="If Mode.ToUpperCase =\"DOWNLOAD\" Then";
if ((_mode.toUpperCase()).equals("DOWNLOAD")) { 
RDebugUtils.currentLine=59637763;
 //BA.debugLineNum = 59637763;BA.debugLine="ImageDownload.Visible = True";
mostCurrent._imagedownload.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=59637764;
 //BA.debugLineNum = 59637764;BA.debugLine="ImageUpload.Visible = False";
mostCurrent._imageupload.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=59637766;
 //BA.debugLineNum = 59637766;BA.debugLine="ImageUpload.Visible = True";
mostCurrent._imageupload.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=59637767;
 //BA.debugLineNum = 59637767;BA.debugLine="ImageDownload.Visible = False";
mostCurrent._imagedownload.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=59637770;
 //BA.debugLineNum = 59637770;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendserverprocesscomplete(boolean _debug,String _filename,Object _jobobject) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendserverprocesscomplete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sendserverprocesscomplete", new Object[] {_debug,_filename,_jobobject}));}
ResumableSub_SendServerProcessComplete rsub = new ResumableSub_SendServerProcessComplete(null,_debug,_filename,_jobobject);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendServerProcessComplete extends BA.ResumableSub {
public ResumableSub_SendServerProcessComplete(xevolution.vrcg.devdemov2400.dataupdate parent,boolean _debug,String _filename,Object _jobobject) {
this.parent = parent;
this._debug = _debug;
this._filename = _filename;
this._jobobject = _jobobject;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
boolean _debug;
String _filename;
Object _jobobject;
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62259201;
 //BA.debugLineNum = 62259201;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/removeFilesSqlite");
RDebugUtils.currentLine=62259202;
 //BA.debugLineNum = 62259202;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=62259203;
 //BA.debugLineNum = 62259203;BA.debugLine="Job.Initialize(\"\",jobObject)";
_job._initialize /*String*/ (null,processBA,"",_jobobject);
RDebugUtils.currentLine=62259204;
 //BA.debugLineNum = 62259204;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62259205;
 //BA.debugLineNum = 62259205;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=62259206;
 //BA.debugLineNum = 62259206;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=62259207;
 //BA.debugLineNum = 62259207;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=62259208;
 //BA.debugLineNum = 62259208;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=62259209;
 //BA.debugLineNum = 62259209;BA.debugLine="params.Put(\"debug\", Utils.Bool2Int(debug))";
_params.Put((Object)("debug"),(Object)(parent.mostCurrent._utils._bool2int /*int*/ (mostCurrent.activityBA,_debug)));
RDebugUtils.currentLine=62259210;
 //BA.debugLineNum = 62259210;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=62259211;
 //BA.debugLineNum = 62259211;BA.debugLine="params.Put(\"name\", filename)";
_params.Put((Object)("name"),(Object)(_filename));
RDebugUtils.currentLine=62259212;
 //BA.debugLineNum = 62259212;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=62259213;
 //BA.debugLineNum = 62259213;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=62259214;
 //BA.debugLineNum = 62259214;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=62259215;
 //BA.debugLineNum = 62259215;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=62259216;
 //BA.debugLineNum = 62259216;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=62259217;
 //BA.debugLineNum = 62259217;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=62259218;
 //BA.debugLineNum = 62259218;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=62259219;
 //BA.debugLineNum = 62259219;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=62259221;
 //BA.debugLineNum = 62259221;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=62259223;
 //BA.debugLineNum = 62259223;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=62259224;
 //BA.debugLineNum = 62259224;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=62259226;
 //BA.debugLineNum = 62259226;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "sendserverprocesscomplete"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=62259227;
 //BA.debugLineNum = 62259227;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=62259228;
 //BA.debugLineNum = 62259228;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=62259229;
 //BA.debugLineNum = 62259229;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=62259231;
 //BA.debugLineNum = 62259231;BA.debugLine="Utils.logError(\"Download\", ShareCode.SESS_User,";
parent.mostCurrent._utils._logerror /*String*/ (mostCurrent.activityBA,"Download",parent.mostCurrent._sharecode._sess_user /*String*/ ,_job._errormessage /*String*/ );
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=62259233;
 //BA.debugLineNum = 62259233;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=62259234;
 //BA.debugLineNum = 62259234;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=62259235;
 //BA.debugLineNum = 62259235;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _updatefileswithftp(String _datacontrol,anywheresoftware.b4a.objects.LabelWrapper _dlg) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updatefileswithftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "updatefileswithftp", new Object[] {_datacontrol,_dlg}));}
ResumableSub_UpdateFilesWithFTP rsub = new ResumableSub_UpdateFilesWithFTP(null,_datacontrol,_dlg);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UpdateFilesWithFTP extends BA.ResumableSub {
public ResumableSub_UpdateFilesWithFTP(xevolution.vrcg.devdemov2400.dataupdate parent,String _datacontrol,anywheresoftware.b4a.objects.LabelWrapper _dlg) {
this.parent = parent;
this._datacontrol = _datacontrol;
this._dlg = _dlg;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _datacontrol;
anywheresoftware.b4a.objects.LabelWrapper _dlg;
long _datacontrolparse = 0L;
anywheresoftware.b4a.objects.collections.List _flist = null;
anywheresoftware.b4a.objects.collections.List _flisthtml = null;
anywheresoftware.b4a.net.FTPWrapper _globalftp = null;
Object _sfl = null;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
int _i = 0;
String _fname = "";
String _ext = "";
anywheresoftware.b4a.objects.collections.List _flistlast = null;
xevolution.vrcg.devdemov2400.types._downupfile _fname1 = null;
boolean _makecopy = false;
Object _sf = null;
Object _sf1 = null;
String _fname2 = "";
int step29;
int limit29;
int step61;
int limit61;
int step71;
int limit71;
int step93;
int limit93;
int step106;
int limit106;
int step148;
int limit148;
int step168;
int limit168;
int step178;
int limit178;
int step202;
int limit202;
int step215;
int limit215;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=61800450;
 //BA.debugLineNum = 61800450;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800452;
 //BA.debugLineNum = 61800452;BA.debugLine="If (Not(Starter.FirstInstall)) Then";
if (true) break;

case 1:
//if
this.state = 225;
if ((anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._starter._firstinstall /*boolean*/ ))) { 
this.state = 3;
}else {
this.state = 224;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=61800453;
 //BA.debugLineNum = 61800453;BA.debugLine="If (Utils.isNullOrEmpty(datacontrol)) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent.mostCurrent._utils._isnullorempty /*boolean*/ (mostCurrent.activityBA,_datacontrol))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=61800454;
 //BA.debugLineNum = 61800454;BA.debugLine="datacontrol = Utils.GetCurrDatetimeFixed 'Utils";
_datacontrol = parent.mostCurrent._utils._getcurrdatetimefixed /*String*/ (mostCurrent.activityBA);
 if (true) break;
;
RDebugUtils.currentLine=61800457;
 //BA.debugLineNum = 61800457;BA.debugLine="Try";

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
RDebugUtils.currentLine=61800458;
 //BA.debugLineNum = 61800458;BA.debugLine="Dim datacontrolParse As Long = DateTime.DatePar";
_datacontrolparse = anywheresoftware.b4a.keywords.Common.DateTime.DateParse(_datacontrol);
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=61800460;
 //BA.debugLineNum = 61800460;BA.debugLine="Dim datacontrolParse As Long = DateTime.Now   '";
_datacontrolparse = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=61800467;
 //BA.debugLineNum = 61800467;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("661800467","************************************************************",0);
RDebugUtils.currentLine=61800468;
 //BA.debugLineNum = 61800468;BA.debugLine="Log($\" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${Sh";
anywheresoftware.b4a.keywords.Common.LogImpl("661800468",(" 		DOWNLOAD : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+" "),0);
RDebugUtils.currentLine=61800469;
 //BA.debugLineNum = 61800469;BA.debugLine="Log( $\"${ShareCode.APP_FTP_USER}@${ShareCode.APP";
anywheresoftware.b4a.keywords.Common.LogImpl("661800469",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),0);
RDebugUtils.currentLine=61800470;
 //BA.debugLineNum = 61800470;BA.debugLine="Log(\"/docs/\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800470","/docs/",0);
RDebugUtils.currentLine=61800471;
 //BA.debugLineNum = 61800471;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("661800471","************************************************************",0);
RDebugUtils.currentLine=61800472;
 //BA.debugLineNum = 61800472;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800472;
 //BA.debugLineNum = 61800472;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
_flist.Initialize();
RDebugUtils.currentLine=61800473;
 //BA.debugLineNum = 61800473;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
_flisthtml = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800473;
 //BA.debugLineNum = 61800473;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
_flisthtml.Initialize();
RDebugUtils.currentLine=61800475;
 //BA.debugLineNum = 61800475;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=61800476;
 //BA.debugLineNum = 61800476;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=61800477;
 //BA.debugLineNum = 61800477;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61800478;
 //BA.debugLineNum = 61800478;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=61800480;
 //BA.debugLineNum = 61800480;BA.debugLine="Dim sfl As Object = GlobalFTP.List(\"/\" & ShareCo";
_sfl = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/");
RDebugUtils.currentLine=61800483;
 //BA.debugLineNum = 61800483;BA.debugLine="Wait For (sfl) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatefileswithftp"), _sfl);
this.state = 231;
return;
case 231:
//C
this.state = 13;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=61800485;
 //BA.debugLineNum = 61800485;BA.debugLine="If Success Then";
if (true) break;

case 13:
//if
this.state = 124;
if (_success) { 
this.state = 15;
}else {
this.state = 123;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=61800490;
 //BA.debugLineNum = 61800490;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 16:
//if
this.state = 51;
if ((_files.length>=1)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=61800491;
 //BA.debugLineNum = 61800491;BA.debugLine="flist.Initialize";
_flist.Initialize();
RDebugUtils.currentLine=61800492;
 //BA.debugLineNum = 61800492;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 19:
//for
this.state = 50;
step29 = 1;
limit29 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 232;
if (true) break;

case 232:
//C
this.state = 50;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 21;
if (true) break;

case 233:
//C
this.state = 232;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=61800493;
 //BA.debugLineNum = 61800493;BA.debugLine="Dim fName As String = Files(i).Name";
_fname = _files[_i].getName();
RDebugUtils.currentLine=61800494;
 //BA.debugLineNum = 61800494;BA.debugLine="If (fName.EndsWith(\".png\")) Or (fName.EndsWit";
if (true) break;

case 22:
//if
this.state = 49;
if ((_fname.endsWith(".png")) || (_fname.endsWith(".jpg")) || (_fname.endsWith(".jpeg")) || (_fname.endsWith(".pdf")) || (_fname.endsWith(".doc")) || (_fname.endsWith(".docx")) || (_fname.endsWith(".xls")) || (_fname.endsWith(".xlsx")) || (_fname.endsWith(".ppt")) || (_fname.endsWith(".pptx"))) { 
this.state = 24;
}else 
{RDebugUtils.currentLine=61800507;
 //BA.debugLineNum = 61800507;BA.debugLine="Else If (fName.EndsWith(\".html\")) Then";
if ((_fname.endsWith(".html"))) { 
this.state = 36;
}else {
this.state = 48;
}}
if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=61800498;
 //BA.debugLineNum = 61800498;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
_ext = _fname.substring((int) (_fname.lastIndexOf(".")+1));
RDebugUtils.currentLine=61800499;
 //BA.debugLineNum = 61800499;BA.debugLine="If (Files(i).Timestamp >= datacontrolParse)";
if (true) break;

case 25:
//if
this.state = 34;
if ((_files[_i].getTimestamp()>=_datacontrolparse)) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=61800500;
 //BA.debugLineNum = 61800500;BA.debugLine="Try";
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
RDebugUtils.currentLine=61800501;
 //BA.debugLineNum = 61800501;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800501",_fname,0);
RDebugUtils.currentLine=61800502;
 //BA.debugLineNum = 61800502;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Na";
_flist.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (mostCurrent.activityBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
 if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 0;
RDebugUtils.currentLine=61800504;
 //BA.debugLineNum = 61800504;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800504",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
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
this.state = 49;
;
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=61800508;
 //BA.debugLineNum = 61800508;BA.debugLine="Dim ext As String = \"html\"";
_ext = "html";
RDebugUtils.currentLine=61800509;
 //BA.debugLineNum = 61800509;BA.debugLine="If ((Files(i).Timestamp >= datacontrolParse)";
if (true) break;

case 37:
//if
this.state = 46;
if (((_files[_i].getTimestamp()>=_datacontrolparse) || anywheresoftware.b4a.keywords.Common.Not(_files[_i].getName().startsWith("REPORT_")))) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=61800510;
 //BA.debugLineNum = 61800510;BA.debugLine="Try";
if (true) break;

case 40:
//try
this.state = 45;
this.catchState = 44;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 45;
this.catchState = 44;
RDebugUtils.currentLine=61800511;
 //BA.debugLineNum = 61800511;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800511",_fname,0);
RDebugUtils.currentLine=61800512;
 //BA.debugLineNum = 61800512;BA.debugLine="flisthtml.Add(Types.MakeDownUpFile(Files(i";
_flisthtml.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (mostCurrent.activityBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
 if (true) break;

case 44:
//C
this.state = 45;
this.catchState = 0;
RDebugUtils.currentLine=61800514;
 //BA.debugLineNum = 61800514;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800514",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
;
 if (true) break;

case 46:
//C
this.state = 49;
;
 if (true) break;

case 48:
//C
this.state = 49;
 if (true) break;

case 49:
//C
this.state = 233;
;
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;
;
RDebugUtils.currentLine=61800523;
 //BA.debugLineNum = 61800523;BA.debugLine="If (flist.Size >=1) Then '.IsInitialized) Then";

case 51:
//if
this.state = 86;
if ((_flist.getSize()>=1)) { 
this.state = 53;
}else {
this.state = 85;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=61800524;
 //BA.debugLineNum = 61800524;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800525;
 //BA.debugLineNum = 61800525;BA.debugLine="If Not(flistLast.IsInitialized) Then";
if (true) break;

case 54:
//if
this.state = 57;
if (anywheresoftware.b4a.keywords.Common.Not(_flistlast.IsInitialized())) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=61800526;
 //BA.debugLineNum = 61800526;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=61800532;
 //BA.debugLineNum = 61800532;BA.debugLine="If (flist.Size>=1) Then";

case 57:
//if
this.state = 68;
if ((_flist.getSize()>=1)) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=61800533;
 //BA.debugLineNum = 61800533;BA.debugLine="For i=0 To flist.Size-1";
if (true) break;

case 60:
//for
this.state = 67;
step61 = 1;
limit61 = (int) (_flist.getSize()-1);
_i = (int) (0) ;
this.state = 234;
if (true) break;

case 234:
//C
this.state = 67;
if ((step61 > 0 && _i <= limit61) || (step61 < 0 && _i >= limit61)) this.state = 62;
if (true) break;

case 235:
//C
this.state = 234;
_i = ((int)(0 + _i + step61)) ;
if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=61800534;
 //BA.debugLineNum = 61800534;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flist.Get(_i));
RDebugUtils.currentLine=61800535;
 //BA.debugLineNum = 61800535;BA.debugLine="Dim makeCopy As Boolean = True 'False";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61800541;
 //BA.debugLineNum = 61800541;BA.debugLine="If (makeCopy) Then";
if (true) break;

case 63:
//if
this.state = 66;
if ((_makecopy)) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=61800542;
 //BA.debugLineNum = 61800542;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
 if (true) break;

case 66:
//C
this.state = 235;
;
 if (true) break;
if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;
;
RDebugUtils.currentLine=61800550;
 //BA.debugLineNum = 61800550;BA.debugLine="If (flistLast.Size>=1) Then";

case 68:
//if
this.state = 83;
if ((_flistlast.getSize()>=1)) { 
this.state = 70;
}else {
this.state = 82;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=61800551;
 //BA.debugLineNum = 61800551;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
parent._sqlfilestotal = (int) (_flistlast.getSize()-1);
RDebugUtils.currentLine=61800552;
 //BA.debugLineNum = 61800552;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 71:
//for
this.state = 80;
step71 = 1;
limit71 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
this.state = 236;
if (true) break;

case 236:
//C
this.state = 80;
if ((step71 > 0 && _i <= limit71) || (step71 < 0 && _i >= limit71)) this.state = 73;
if (true) break;

case 237:
//C
this.state = 236;
_i = ((int)(0 + _i + step71)) ;
if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=61800553;
 //BA.debugLineNum = 61800553;BA.debugLine="Dim fName As String = flistLast.Get(i)";
_fname = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=61800555;
 //BA.debugLineNum = 61800555;BA.debugLine="Log(fName)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800555",_fname,0);
RDebugUtils.currentLine=61800557;
 //BA.debugLineNum = 61800557;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=61800558;
 //BA.debugLineNum = 61800558;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 238;
return;
case 238:
//C
this.state = 74;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61800559;
 //BA.debugLineNum = 61800559;BA.debugLine="If Success Then";
if (true) break;

case 74:
//if
this.state = 79;
if (_success) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=61800560;
 //BA.debugLineNum = 61800560;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800560","file was download successfully",0);
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=61800562;
 //BA.debugLineNum = 61800562;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800562","Error downloading file",0);
 if (true) break;

case 79:
//C
this.state = 237;
;
RDebugUtils.currentLine=61800565;
 //BA.debugLineNum = 61800565;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 80:
//C
this.state = 83;
;
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=61800569;
 //BA.debugLineNum = 61800569;BA.debugLine="Log(\"vazio 0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800569","vazio 0",0);
 if (true) break;

case 83:
//C
this.state = 86;
;
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=61800572;
 //BA.debugLineNum = 61800572;BA.debugLine="Log(\"vazio 1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800572","vazio 1",0);
 if (true) break;
;
RDebugUtils.currentLine=61800575;
 //BA.debugLineNum = 61800575;BA.debugLine="If (flisthtml.Size >=1) Then '.IsInitialized) T";

case 86:
//if
this.state = 121;
if ((_flisthtml.getSize()>=1)) { 
this.state = 88;
}else {
this.state = 120;
}if (true) break;

case 88:
//C
this.state = 89;
RDebugUtils.currentLine=61800576;
 //BA.debugLineNum = 61800576;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800577;
 //BA.debugLineNum = 61800577;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
RDebugUtils.currentLine=61800581;
 //BA.debugLineNum = 61800581;BA.debugLine="If (flisthtml.Size>=1) Then";
if (true) break;

case 89:
//if
this.state = 103;
if ((_flisthtml.getSize()>=1)) { 
this.state = 91;
}if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=61800582;
 //BA.debugLineNum = 61800582;BA.debugLine="For i=0 To flisthtml.Size-1";
if (true) break;

case 92:
//for
this.state = 102;
step93 = 1;
limit93 = (int) (_flisthtml.getSize()-1);
_i = (int) (0) ;
this.state = 239;
if (true) break;

case 239:
//C
this.state = 102;
if ((step93 > 0 && _i <= limit93) || (step93 < 0 && _i >= limit93)) this.state = 94;
if (true) break;

case 240:
//C
this.state = 239;
_i = ((int)(0 + _i + step93)) ;
if (true) break;

case 94:
//C
this.state = 95;
RDebugUtils.currentLine=61800583;
 //BA.debugLineNum = 61800583;BA.debugLine="Dim fName1 As DownUpFile = flisthtml.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flisthtml.Get(_i));
RDebugUtils.currentLine=61800584;
 //BA.debugLineNum = 61800584;BA.debugLine="Dim makeCopy As Boolean = False";
_makecopy = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61800585;
 //BA.debugLineNum = 61800585;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
if (true) break;

case 95:
//if
this.state = 98;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname1.Filename /*String*/ ))) { 
this.state = 97;
}if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=61800586;
 //BA.debugLineNum = 61800586;BA.debugLine="makeCopy = True";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=61800589;
 //BA.debugLineNum = 61800589;BA.debugLine="If (makeCopy) Then";

case 98:
//if
this.state = 101;
if ((_makecopy)) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=61800590;
 //BA.debugLineNum = 61800590;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
 if (true) break;

case 101:
//C
this.state = 240;
;
 if (true) break;
if (true) break;

case 102:
//C
this.state = 103;
;
 if (true) break;
;
RDebugUtils.currentLine=61800598;
 //BA.debugLineNum = 61800598;BA.debugLine="If (flistLast.Size>=1) Then";

case 103:
//if
this.state = 118;
if ((_flistlast.getSize()>=1)) { 
this.state = 105;
}else {
this.state = 117;
}if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=61800599;
 //BA.debugLineNum = 61800599;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
parent._sqlfilestotal = (int) (_flistlast.getSize()-1);
RDebugUtils.currentLine=61800600;
 //BA.debugLineNum = 61800600;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 106:
//for
this.state = 115;
step106 = 1;
limit106 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
this.state = 241;
if (true) break;

case 241:
//C
this.state = 115;
if ((step106 > 0 && _i <= limit106) || (step106 < 0 && _i >= limit106)) this.state = 108;
if (true) break;

case 242:
//C
this.state = 241;
_i = ((int)(0 + _i + step106)) ;
if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=61800601;
 //BA.debugLineNum = 61800601;BA.debugLine="Dim fName As String = flistLast.Get(i)";
_fname = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=61800604;
 //BA.debugLineNum = 61800604;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/"+_fname,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname);
RDebugUtils.currentLine=61800605;
 //BA.debugLineNum = 61800605;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 243;
return;
case 243:
//C
this.state = 109;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61800606;
 //BA.debugLineNum = 61800606;BA.debugLine="If Success Then";
if (true) break;

case 109:
//if
this.state = 114;
if (_success) { 
this.state = 111;
}else {
this.state = 113;
}if (true) break;

case 111:
//C
this.state = 114;
RDebugUtils.currentLine=61800607;
 //BA.debugLineNum = 61800607;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800607","file was download successfully",0);
 if (true) break;

case 113:
//C
this.state = 114;
RDebugUtils.currentLine=61800609;
 //BA.debugLineNum = 61800609;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800609","Error downloading file",0);
 if (true) break;

case 114:
//C
this.state = 242;
;
RDebugUtils.currentLine=61800612;
 //BA.debugLineNum = 61800612;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 115:
//C
this.state = 118;
;
 if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=61800615;
 //BA.debugLineNum = 61800615;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800616;
 //BA.debugLineNum = 61800616;BA.debugLine="Log(\"vazio 0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800616","vazio 0",0);
 if (true) break;

case 118:
//C
this.state = 121;
;
 if (true) break;

case 120:
//C
this.state = 121;
RDebugUtils.currentLine=61800619;
 //BA.debugLineNum = 61800619;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800620;
 //BA.debugLineNum = 61800620;BA.debugLine="Log(\"vazio 1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800620","vazio 1",0);
 if (true) break;

case 121:
//C
this.state = 124;
;
 if (true) break;

case 123:
//C
this.state = 124;
RDebugUtils.currentLine=61800624;
 //BA.debugLineNum = 61800624;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800625;
 //BA.debugLineNum = 61800625;BA.debugLine="Log(\"Sem sucesso!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800625","Sem sucesso!",0);
 if (true) break;

case 124:
//C
this.state = 125;
;
RDebugUtils.currentLine=61800628;
 //BA.debugLineNum = 61800628;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61800634;
 //BA.debugLineNum = 61800634;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("661800634","************************************************************",0);
RDebugUtils.currentLine=61800635;
 //BA.debugLineNum = 61800635;BA.debugLine="Log($\" 		DOWNLOAD : ${ShareCode.APP_DOMAIN}.${Sh";
anywheresoftware.b4a.keywords.Common.LogImpl("661800635",(" 		DOWNLOAD : "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+" "),0);
RDebugUtils.currentLine=61800636;
 //BA.debugLineNum = 61800636;BA.debugLine="Log($\"${ShareCode.APP_FTP_USER}@${ShareCode.APPL";
anywheresoftware.b4a.keywords.Common.LogImpl("661800636",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),0);
RDebugUtils.currentLine=61800637;
 //BA.debugLineNum = 61800637;BA.debugLine="Log(\"/docs/templates/\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800637","/docs/templates/",0);
RDebugUtils.currentLine=61800638;
 //BA.debugLineNum = 61800638;BA.debugLine="Log(\"*******************************************";
anywheresoftware.b4a.keywords.Common.LogImpl("661800638","************************************************************",0);
RDebugUtils.currentLine=61800639;
 //BA.debugLineNum = 61800639;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
_flist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800639;
 //BA.debugLineNum = 61800639;BA.debugLine="Dim flist As List : flist.Initialize  ' = File.L";
_flist.Initialize();
RDebugUtils.currentLine=61800640;
 //BA.debugLineNum = 61800640;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
_flisthtml = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800640;
 //BA.debugLineNum = 61800640;BA.debugLine="Dim flisthtml As List : flisthtml.Initialize";
_flisthtml.Initialize();
RDebugUtils.currentLine=61800642;
 //BA.debugLineNum = 61800642;BA.debugLine="Dim GlobalFTP As FTP";
_globalftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=61800643;
 //BA.debugLineNum = 61800643;BA.debugLine="GlobalFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_A";
_globalftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=61800644;
 //BA.debugLineNum = 61800644;BA.debugLine="GlobalFTP.PassiveMode = True";
_globalftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=61800645;
 //BA.debugLineNum = 61800645;BA.debugLine="GlobalFTP.TimeoutMs = 240000";
_globalftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=61800647;
 //BA.debugLineNum = 61800647;BA.debugLine="Dim sf1 As Object = GlobalFTP.List(\"/\" & ShareCo";
_sf1 = _globalftp.List(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/");
RDebugUtils.currentLine=61800648;
 //BA.debugLineNum = 61800648;BA.debugLine="Wait For (sf1) FTP_ListCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_listcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatefileswithftp"), _sf1);
this.state = 244;
return;
case 244:
//C
this.state = 125;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[2];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
;
RDebugUtils.currentLine=61800650;
 //BA.debugLineNum = 61800650;BA.debugLine="If Success Then";
if (true) break;

case 125:
//if
this.state = 216;
if (_success) { 
this.state = 127;
}else {
this.state = 215;
}if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=61800655;
 //BA.debugLineNum = 61800655;BA.debugLine="If (Files.Length >= 1) Then";
if (true) break;

case 128:
//if
this.state = 143;
if ((_files.length>=1)) { 
this.state = 130;
}if (true) break;

case 130:
//C
this.state = 131;
RDebugUtils.currentLine=61800656;
 //BA.debugLineNum = 61800656;BA.debugLine="flist.Initialize";
_flist.Initialize();
RDebugUtils.currentLine=61800657;
 //BA.debugLineNum = 61800657;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 131:
//for
this.state = 142;
step148 = 1;
limit148 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 245;
if (true) break;

case 245:
//C
this.state = 142;
if ((step148 > 0 && _i <= limit148) || (step148 < 0 && _i >= limit148)) this.state = 133;
if (true) break;

case 246:
//C
this.state = 245;
_i = ((int)(0 + _i + step148)) ;
if (true) break;

case 133:
//C
this.state = 134;
RDebugUtils.currentLine=61800658;
 //BA.debugLineNum = 61800658;BA.debugLine="Dim fName2 As String = Files(i).Name";
_fname2 = _files[_i].getName();
RDebugUtils.currentLine=61800660;
 //BA.debugLineNum = 61800660;BA.debugLine="If (fName2.EndsWith(\".png\")) Or (fName2.EndsW";
if (true) break;

case 134:
//if
this.state = 141;
if ((_fname2.endsWith(".png")) || (_fname2.endsWith(".jpg")) || (_fname2.endsWith(".jpeg")) || (_fname2.endsWith(".pdf")) || (_fname2.endsWith(".doc")) || (_fname2.endsWith(".docx")) || (_fname2.endsWith(".xls")) || (_fname2.endsWith(".xlsx")) || (_fname2.endsWith(".ppt")) || (_fname2.endsWith(".pptx")) || (_fname2.startsWith("REPORT"))==anywheresoftware.b4a.keywords.Common.False || (_fname2.startsWith("dictionary"))) { 
this.state = 136;
}else 
{RDebugUtils.currentLine=61800667;
 //BA.debugLineNum = 61800667;BA.debugLine="Else If (fName2.EndsWith(\".html\")) Then";
if ((_fname2.endsWith(".html"))) { 
this.state = 138;
}else {
this.state = 140;
}}
if (true) break;

case 136:
//C
this.state = 141;
RDebugUtils.currentLine=61800664;
 //BA.debugLineNum = 61800664;BA.debugLine="Dim ext As String = fName.SubString( fName.L";
_ext = _fname.substring((int) (_fname.lastIndexOf(".")+1));
RDebugUtils.currentLine=61800665;
 //BA.debugLineNum = 61800665;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800665",_fname2,0);
RDebugUtils.currentLine=61800666;
 //BA.debugLineNum = 61800666;BA.debugLine="flist.Add(Types.MakeDownUpFile(Files(i).Name";
_flist.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (mostCurrent.activityBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
 if (true) break;

case 138:
//C
this.state = 141;
RDebugUtils.currentLine=61800668;
 //BA.debugLineNum = 61800668;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800668",_fname2,0);
RDebugUtils.currentLine=61800669;
 //BA.debugLineNum = 61800669;BA.debugLine="Dim ext As String = \"html\"";
_ext = "html";
RDebugUtils.currentLine=61800670;
 //BA.debugLineNum = 61800670;BA.debugLine="flisthtml.Add(Types.MakeDownUpFile(Files(i).";
_flisthtml.Add((Object)(parent.mostCurrent._types._makedownupfile /*xevolution.vrcg.devdemov2400.types._downupfile*/ (mostCurrent.activityBA,_files[_i].getName(),_ext,_files[_i].getTimestamp())));
 if (true) break;

case 140:
//C
this.state = 141;
 if (true) break;

case 141:
//C
this.state = 246;
;
 if (true) break;
if (true) break;

case 142:
//C
this.state = 143;
;
 if (true) break;
;
RDebugUtils.currentLine=61800677;
 //BA.debugLineNum = 61800677;BA.debugLine="If (flist.Size >=1) Then '.IsInitialized) Then";

case 143:
//if
this.state = 178;
if ((_flist.getSize()>=1)) { 
this.state = 145;
}else {
this.state = 177;
}if (true) break;

case 145:
//C
this.state = 146;
RDebugUtils.currentLine=61800678;
 //BA.debugLineNum = 61800678;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800679;
 //BA.debugLineNum = 61800679;BA.debugLine="If Not(flistLast.IsInitialized) Then";
if (true) break;

case 146:
//if
this.state = 149;
if (anywheresoftware.b4a.keywords.Common.Not(_flistlast.IsInitialized())) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
RDebugUtils.currentLine=61800680;
 //BA.debugLineNum = 61800680;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
 if (true) break;
;
RDebugUtils.currentLine=61800686;
 //BA.debugLineNum = 61800686;BA.debugLine="If (flist.Size>=1) Then";

case 149:
//if
this.state = 160;
if ((_flist.getSize()>=1)) { 
this.state = 151;
}if (true) break;

case 151:
//C
this.state = 152;
RDebugUtils.currentLine=61800687;
 //BA.debugLineNum = 61800687;BA.debugLine="For i=0 To flist.Size-1";
if (true) break;

case 152:
//for
this.state = 159;
step168 = 1;
limit168 = (int) (_flist.getSize()-1);
_i = (int) (0) ;
this.state = 247;
if (true) break;

case 247:
//C
this.state = 159;
if ((step168 > 0 && _i <= limit168) || (step168 < 0 && _i >= limit168)) this.state = 154;
if (true) break;

case 248:
//C
this.state = 247;
_i = ((int)(0 + _i + step168)) ;
if (true) break;

case 154:
//C
this.state = 155;
RDebugUtils.currentLine=61800688;
 //BA.debugLineNum = 61800688;BA.debugLine="Dim fName1 As DownUpFile = flist.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flist.Get(_i));
RDebugUtils.currentLine=61800689;
 //BA.debugLineNum = 61800689;BA.debugLine="Dim makeCopy As Boolean = True 'False";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61800691;
 //BA.debugLineNum = 61800691;BA.debugLine="If (makeCopy) Then";
if (true) break;

case 155:
//if
this.state = 158;
if ((_makecopy)) { 
this.state = 157;
}if (true) break;

case 157:
//C
this.state = 158;
RDebugUtils.currentLine=61800692;
 //BA.debugLineNum = 61800692;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
 if (true) break;

case 158:
//C
this.state = 248;
;
 if (true) break;
if (true) break;

case 159:
//C
this.state = 160;
;
 if (true) break;
;
RDebugUtils.currentLine=61800700;
 //BA.debugLineNum = 61800700;BA.debugLine="If (flistLast.Size>=1) Then";

case 160:
//if
this.state = 175;
if ((_flistlast.getSize()>=1)) { 
this.state = 162;
}else {
this.state = 174;
}if (true) break;

case 162:
//C
this.state = 163;
RDebugUtils.currentLine=61800701;
 //BA.debugLineNum = 61800701;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
parent._sqlfilestotal = (int) (_flistlast.getSize()-1);
RDebugUtils.currentLine=61800702;
 //BA.debugLineNum = 61800702;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 163:
//for
this.state = 172;
step178 = 1;
limit178 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
this.state = 249;
if (true) break;

case 249:
//C
this.state = 172;
if ((step178 > 0 && _i <= limit178) || (step178 < 0 && _i >= limit178)) this.state = 165;
if (true) break;

case 250:
//C
this.state = 249;
_i = ((int)(0 + _i + step178)) ;
if (true) break;

case 165:
//C
this.state = 166;
RDebugUtils.currentLine=61800703;
 //BA.debugLineNum = 61800703;BA.debugLine="Dim fName2 As String = flistLast.Get(i)";
_fname2 = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=61800704;
 //BA.debugLineNum = 61800704;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800704",_fname2,0);
RDebugUtils.currentLine=61800705;
 //BA.debugLineNum = 61800705;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=61800706;
 //BA.debugLineNum = 61800706;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 251;
return;
case 251:
//C
this.state = 166;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61800707;
 //BA.debugLineNum = 61800707;BA.debugLine="If Success Then";
if (true) break;

case 166:
//if
this.state = 171;
if (_success) { 
this.state = 168;
}else {
this.state = 170;
}if (true) break;

case 168:
//C
this.state = 171;
RDebugUtils.currentLine=61800708;
 //BA.debugLineNum = 61800708;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800708","file was download successfully",0);
 if (true) break;

case 170:
//C
this.state = 171;
RDebugUtils.currentLine=61800710;
 //BA.debugLineNum = 61800710;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800710","Error downloading file",0);
 if (true) break;

case 171:
//C
this.state = 250;
;
RDebugUtils.currentLine=61800714;
 //BA.debugLineNum = 61800714;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 172:
//C
this.state = 175;
;
 if (true) break;

case 174:
//C
this.state = 175;
RDebugUtils.currentLine=61800717;
 //BA.debugLineNum = 61800717;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800718;
 //BA.debugLineNum = 61800718;BA.debugLine="Log(\"vazio 0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800718","vazio 0",0);
 if (true) break;

case 175:
//C
this.state = 178;
;
 if (true) break;

case 177:
//C
this.state = 178;
RDebugUtils.currentLine=61800721;
 //BA.debugLineNum = 61800721;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800722;
 //BA.debugLineNum = 61800722;BA.debugLine="Log(\"vazio 1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800722","vazio 1",0);
 if (true) break;
;
RDebugUtils.currentLine=61800725;
 //BA.debugLineNum = 61800725;BA.debugLine="If (flisthtml.Size >=1) Then '.IsInitialized) T";

case 178:
//if
this.state = 213;
if ((_flisthtml.getSize()>=1)) { 
this.state = 180;
}else {
this.state = 212;
}if (true) break;

case 180:
//C
this.state = 181;
RDebugUtils.currentLine=61800726;
 //BA.debugLineNum = 61800726;BA.debugLine="Dim flistLast As List";
_flistlast = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61800727;
 //BA.debugLineNum = 61800727;BA.debugLine="flistLast.Initialize";
_flistlast.Initialize();
RDebugUtils.currentLine=61800731;
 //BA.debugLineNum = 61800731;BA.debugLine="If (flisthtml.Size>=1) Then";
if (true) break;

case 181:
//if
this.state = 195;
if ((_flisthtml.getSize()>=1)) { 
this.state = 183;
}if (true) break;

case 183:
//C
this.state = 184;
RDebugUtils.currentLine=61800732;
 //BA.debugLineNum = 61800732;BA.debugLine="For i=0 To flisthtml.Size-1";
if (true) break;

case 184:
//for
this.state = 194;
step202 = 1;
limit202 = (int) (_flisthtml.getSize()-1);
_i = (int) (0) ;
this.state = 252;
if (true) break;

case 252:
//C
this.state = 194;
if ((step202 > 0 && _i <= limit202) || (step202 < 0 && _i >= limit202)) this.state = 186;
if (true) break;

case 253:
//C
this.state = 252;
_i = ((int)(0 + _i + step202)) ;
if (true) break;

case 186:
//C
this.state = 187;
RDebugUtils.currentLine=61800733;
 //BA.debugLineNum = 61800733;BA.debugLine="Dim fName1 As DownUpFile = flisthtml.Get(i)";
_fname1 = (xevolution.vrcg.devdemov2400.types._downupfile)(_flisthtml.Get(_i));
RDebugUtils.currentLine=61800734;
 //BA.debugLineNum = 61800734;BA.debugLine="Dim makeCopy As Boolean = False";
_makecopy = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=61800735;
 //BA.debugLineNum = 61800735;BA.debugLine="If Not(File.Exists(Starter.InternalFolder, f";
if (true) break;

case 187:
//if
this.state = 190;
if (anywheresoftware.b4a.keywords.Common.Not(anywheresoftware.b4a.keywords.Common.File.Exists(parent.mostCurrent._starter._internalfolder /*String*/ ,_fname1.Filename /*String*/ ))) { 
this.state = 189;
}if (true) break;

case 189:
//C
this.state = 190;
RDebugUtils.currentLine=61800736;
 //BA.debugLineNum = 61800736;BA.debugLine="makeCopy = True";
_makecopy = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;
;
RDebugUtils.currentLine=61800739;
 //BA.debugLineNum = 61800739;BA.debugLine="If (makeCopy) Then";

case 190:
//if
this.state = 193;
if ((_makecopy)) { 
this.state = 192;
}if (true) break;

case 192:
//C
this.state = 193;
RDebugUtils.currentLine=61800740;
 //BA.debugLineNum = 61800740;BA.debugLine="flistLast.Add(fName1.Filename)";
_flistlast.Add((Object)(_fname1.Filename /*String*/ ));
 if (true) break;

case 193:
//C
this.state = 253;
;
 if (true) break;
if (true) break;

case 194:
//C
this.state = 195;
;
 if (true) break;
;
RDebugUtils.currentLine=61800748;
 //BA.debugLineNum = 61800748;BA.debugLine="If (flistLast.Size>=1) Then";

case 195:
//if
this.state = 210;
if ((_flistlast.getSize()>=1)) { 
this.state = 197;
}else {
this.state = 209;
}if (true) break;

case 197:
//C
this.state = 198;
RDebugUtils.currentLine=61800749;
 //BA.debugLineNum = 61800749;BA.debugLine="SqlFilesTotal = flistLast.Size-1";
parent._sqlfilestotal = (int) (_flistlast.getSize()-1);
RDebugUtils.currentLine=61800750;
 //BA.debugLineNum = 61800750;BA.debugLine="For i=0 To flistLast.Size-1";
if (true) break;

case 198:
//for
this.state = 207;
step215 = 1;
limit215 = (int) (_flistlast.getSize()-1);
_i = (int) (0) ;
this.state = 254;
if (true) break;

case 254:
//C
this.state = 207;
if ((step215 > 0 && _i <= limit215) || (step215 < 0 && _i >= limit215)) this.state = 200;
if (true) break;

case 255:
//C
this.state = 254;
_i = ((int)(0 + _i + step215)) ;
if (true) break;

case 200:
//C
this.state = 201;
RDebugUtils.currentLine=61800751;
 //BA.debugLineNum = 61800751;BA.debugLine="Dim fName2 As String = flistLast.Get(i)";
_fname2 = BA.ObjectToString(_flistlast.Get(_i));
RDebugUtils.currentLine=61800752;
 //BA.debugLineNum = 61800752;BA.debugLine="Log(fName2)";
anywheresoftware.b4a.keywords.Common.LogImpl("661800752",_fname2,0);
RDebugUtils.currentLine=61800753;
 //BA.debugLineNum = 61800753;BA.debugLine="Dim sf As Object = GlobalFTP.DownloadFile(\"/";
_sf = _globalftp.DownloadFile(processBA,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/docs/templates/"+_fname2,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._starter._internalfolder /*String*/ ,_fname2);
RDebugUtils.currentLine=61800754;
 //BA.debugLineNum = 61800754;BA.debugLine="Wait For (sf) FTP_DownloadCompleted (ServerP";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_downloadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "updatefileswithftp"), _sf);
this.state = 256;
return;
case 256:
//C
this.state = 201;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=61800755;
 //BA.debugLineNum = 61800755;BA.debugLine="If Success Then";
if (true) break;

case 201:
//if
this.state = 206;
if (_success) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
RDebugUtils.currentLine=61800756;
 //BA.debugLineNum = 61800756;BA.debugLine="Log(\"file was download successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800756","file was download successfully",0);
 if (true) break;

case 205:
//C
this.state = 206;
RDebugUtils.currentLine=61800758;
 //BA.debugLineNum = 61800758;BA.debugLine="Log(\"Error downloading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800758","Error downloading file",0);
 if (true) break;

case 206:
//C
this.state = 255;
;
RDebugUtils.currentLine=61800761;
 //BA.debugLineNum = 61800761;BA.debugLine="DUProgressBar(SqlFilesTotal,i)";
_duprogressbar(parent._sqlfilestotal,_i);
 if (true) break;
if (true) break;

case 207:
//C
this.state = 210;
;
 if (true) break;

case 209:
//C
this.state = 210;
RDebugUtils.currentLine=61800764;
 //BA.debugLineNum = 61800764;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800765;
 //BA.debugLineNum = 61800765;BA.debugLine="Log(\"vazio 0\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800765","vazio 0",0);
 if (true) break;

case 210:
//C
this.state = 213;
;
 if (true) break;

case 212:
//C
this.state = 213;
RDebugUtils.currentLine=61800768;
 //BA.debugLineNum = 61800768;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800769;
 //BA.debugLineNum = 61800769;BA.debugLine="Log(\"vazio 1\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800769","vazio 1",0);
 if (true) break;

case 213:
//C
this.state = 216;
;
 if (true) break;

case 215:
//C
this.state = 216;
RDebugUtils.currentLine=61800773;
 //BA.debugLineNum = 61800773;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800774;
 //BA.debugLineNum = 61800774;BA.debugLine="Log(\"Sem sucesso!\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800774","Sem sucesso!",0);
 if (true) break;

case 216:
//C
this.state = 217;
;
RDebugUtils.currentLine=61800777;
 //BA.debugLineNum = 61800777;BA.debugLine="GlobalFTP.Close";
_globalftp.Close();
RDebugUtils.currentLine=61800782;
 //BA.debugLineNum = 61800782;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";
if (true) break;

case 217:
//if
this.state = 222;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ )) { 
this.state = 219;
}else {
this.state = 221;
}if (true) break;

case 219:
//C
this.state = 222;
RDebugUtils.currentLine=61800783;
 //BA.debugLineNum = 61800783;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangu";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ );
 if (true) break;

case 221:
//C
this.state = 222;
RDebugUtils.currentLine=61800785;
 //BA.debugLineNum = 61800785;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 if (true) break;

case 222:
//C
this.state = 225;
;
RDebugUtils.currentLine=61800788;
 //BA.debugLineNum = 61800788;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 224:
//C
this.state = 225;
RDebugUtils.currentLine=61800790;
 //BA.debugLineNum = 61800790;BA.debugLine="DUProgressBar(0,0)";
_duprogressbar((int) (0),(int) (0));
RDebugUtils.currentLine=61800791;
 //BA.debugLineNum = 61800791;BA.debugLine="Log(\"vazio 2\")";
anywheresoftware.b4a.keywords.Common.LogImpl("661800791","vazio 2",0);
 if (true) break;
;
RDebugUtils.currentLine=61800797;
 //BA.debugLineNum = 61800797;BA.debugLine="If Utils.NNE(ShareCode.UserLanguage) Then";

case 225:
//if
this.state = 230;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ )) { 
this.state = 227;
}else {
this.state = 229;
}if (true) break;

case 227:
//C
this.state = 230;
RDebugUtils.currentLine=61800798;
 //BA.debugLineNum = 61800798;BA.debugLine="ShareCode.CheckTranslations(ShareCode.UserLangua";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,parent.mostCurrent._sharecode._userlanguage /*String*/ );
 if (true) break;

case 229:
//C
this.state = 230;
RDebugUtils.currentLine=61800800;
 //BA.debugLineNum = 61800800;BA.debugLine="ShareCode.CheckTranslations(\"PT\")";
parent.mostCurrent._sharecode._checktranslations /*String*/ (mostCurrent.activityBA,"PT");
 if (true) break;

case 230:
//C
this.state = -1;
;
RDebugUtils.currentLine=61800803;
 //BA.debugLineNum = 61800803;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=61800804;
 //BA.debugLineNum = 61800804;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setupdatehttprecord(anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec,boolean _withimg,int _def,String _tc_filter) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupdatehttprecord", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "setupdatehttprecord", new Object[] {_inrec,_withimg,_def,_tc_filter}));}
ResumableSub_SetUpdateHTTPRecord rsub = new ResumableSub_SetUpdateHTTPRecord(null,_inrec,_withimg,_def,_tc_filter);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetUpdateHTTPRecord extends BA.ResumableSub {
public ResumableSub_SetUpdateHTTPRecord(xevolution.vrcg.devdemov2400.dataupdate parent,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec,boolean _withimg,int _def,String _tc_filter) {
this.parent = parent;
this._inrec = _inrec;
this._withimg = _withimg;
this._def = _def;
this._tc_filter = _tc_filter;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec;
boolean _withimg;
int _def;
String _tc_filter;
int _up_type = 0;
String _up_date = "";
String _up_values = "";
String _up_tableurl = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rr = null;
boolean _finished = false;
String _upd = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="If withImg Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_withimg) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="Dim up_type As Int = Utils.IfNullOrEmpty(inRec.G";
_up_type = (int)(Double.parseDouble(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(_inrec.GetInt("up_type")),BA.NumberToString(_def))));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=59703300;
 //BA.debugLineNum = 59703300;BA.debugLine="Dim up_date As String = Utils.IfNullOrEmpty(inRec";
_up_date = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_date"),"");
RDebugUtils.currentLine=59703301;
 //BA.debugLineNum = 59703301;BA.debugLine="Dim up_values As String = Utils.IfNullOrEmpty(inR";
_up_values = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_values"),"");
RDebugUtils.currentLine=59703302;
 //BA.debugLineNum = 59703302;BA.debugLine="Dim up_tableurl As String = Utils.IfNullOrEmpty(i";
_up_tableurl = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_tableurl"),"");
RDebugUtils.currentLine=59703303;
 //BA.debugLineNum = 59703303;BA.debugLine="If Utils.NNE(up_tableurl) And Utils.NNE(up_values";
if (true) break;

case 5:
//if
this.state = 25;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_up_tableurl) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_up_values)) { 
this.state = 7;
}else {
this.state = 24;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=59703304;
 //BA.debugLineNum = 59703304;BA.debugLine="Dim rr As ResumableSub = UtilAPIUpdate(up_values";
_rr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rr = _utilapiupdate(_up_values,dataupdate.getObject(),_up_tableurl);
RDebugUtils.currentLine=59703305;
 //BA.debugLineNum = 59703305;BA.debugLine="Wait For(rr) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "setupdatehttprecord"), _rr);
this.state = 26;
return;
case 26:
//C
this.state = 8;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=59703307;
 //BA.debugLineNum = 59703307;BA.debugLine="If (finished = False) Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_finished==anywheresoftware.b4a.keywords.Common.False)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=59703309;
 //BA.debugLineNum = 59703309;BA.debugLine="InsertAlertSistema (1,\"\")";
_insertalertsistema((int) (1),"");
RDebugUtils.currentLine=59703310;
 //BA.debugLineNum = 59703310;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=59703313;
 //BA.debugLineNum = 59703313;BA.debugLine="Try";

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
RDebugUtils.currentLine=59703314;
 //BA.debugLineNum = 59703314;BA.debugLine="If withImg Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_withimg) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=59703315;
 //BA.debugLineNum = 59703315;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
_upd = ("update loc_updatesrever set up_state= 1 where up_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_date))+"' and up_type="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_type))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc_filter))+"");
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=59703317;
 //BA.debugLineNum = 59703317;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
_upd = ("update loc_updatesrever set up_state= 1 where up_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_date))+"' "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc_filter))+"");
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=59703320;
 //BA.debugLineNum = 59703320;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(upd)";
parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_upd);
RDebugUtils.currentLine=59703321;
 //BA.debugLineNum = 59703321;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=59703323;
 //BA.debugLineNum = 59703323;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("659703323",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=59703324;
 //BA.debugLineNum = 59703324;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 22:
//C
this.state = 25;
this.catchState = 0;
;
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=59703327;
 //BA.debugLineNum = 59703327;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=59703330;
 //BA.debugLineNum = 59703330;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setupdatehttpemailrecord(anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec,String _tc_filter) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupdatehttpemailrecord", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "setupdatehttpemailrecord", new Object[] {_inrec,_tc_filter}));}
ResumableSub_SetUpdateHTTPEmailRecord rsub = new ResumableSub_SetUpdateHTTPEmailRecord(null,_inrec,_tc_filter);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetUpdateHTTPEmailRecord extends BA.ResumableSub {
public ResumableSub_SetUpdateHTTPEmailRecord(xevolution.vrcg.devdemov2400.dataupdate parent,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec,String _tc_filter) {
this.parent = parent;
this._inrec = _inrec;
this._tc_filter = _tc_filter;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec;
String _tc_filter;
String _up_date = "";
String _up_values = "";
String _up_tableurl = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rr = null;
boolean _finished = false;
String _upd = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="Dim up_date As String = Utils.IfNullOrEmpty(inRec";
_up_date = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_date"),"");
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="Dim up_values As String = Utils.IfNullOrEmpty(inR";
_up_values = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_values"),"");
RDebugUtils.currentLine=59768836;
 //BA.debugLineNum = 59768836;BA.debugLine="Dim up_tableurl As String = Utils.IfNullOrEmpty(i";
_up_tableurl = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_tableurl"),"");
RDebugUtils.currentLine=59768837;
 //BA.debugLineNum = 59768837;BA.debugLine="If Utils.NNE(up_tableurl) And Utils.NNE(up_values";
if (true) break;

case 1:
//if
this.state = 15;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_up_tableurl) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_up_values)) { 
this.state = 3;
}else {
this.state = 14;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=59768838;
 //BA.debugLineNum = 59768838;BA.debugLine="Dim rr As ResumableSub = UtilAPIUpdate(up_values";
_rr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rr = _utilapiupdate(_up_values,dataupdate.getObject(),_up_tableurl);
RDebugUtils.currentLine=59768839;
 //BA.debugLineNum = 59768839;BA.debugLine="Wait For(rr) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "setupdatehttpemailrecord"), _rr);
this.state = 16;
return;
case 16:
//C
this.state = 4;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=59768840;
 //BA.debugLineNum = 59768840;BA.debugLine="If (finished = False) Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_finished==anywheresoftware.b4a.keywords.Common.False)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=59768842;
 //BA.debugLineNum = 59768842;BA.debugLine="InsertAlertSistema (1,\"\")";
_insertalertsistema((int) (1),"");
RDebugUtils.currentLine=59768843;
 //BA.debugLineNum = 59768843;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=59768846;
 //BA.debugLineNum = 59768846;BA.debugLine="Try";

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
RDebugUtils.currentLine=59768847;
 //BA.debugLineNum = 59768847;BA.debugLine="Dim upd As String = $\"update loc_updateemails s";
_upd = ("update loc_updateemails set up_state= 1 where up_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_date))+"' "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc_filter))+"");
RDebugUtils.currentLine=59768848;
 //BA.debugLineNum = 59768848;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(upd)";
parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_upd);
RDebugUtils.currentLine=59768849;
 //BA.debugLineNum = 59768849;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=59768851;
 //BA.debugLineNum = 59768851;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("659768851",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=59768852;
 //BA.debugLineNum = 59768852;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 12:
//C
this.state = 15;
this.catchState = 0;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=59768855;
 //BA.debugLineNum = 59768855;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=59768858;
 //BA.debugLineNum = 59768858;BA.debugLine="End Sub";
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
public static void  _setupdateftprecord(anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec,boolean _withimg,int _def,String _tc_filter) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setupdateftprecord", false))
	 {Debug.delegate(mostCurrent.activityBA, "setupdateftprecord", new Object[] {_inrec,_withimg,_def,_tc_filter}); return;}
ResumableSub_SetUpdateFTPRecord rsub = new ResumableSub_SetUpdateFTPRecord(null,_inrec,_withimg,_def,_tc_filter);
rsub.resume(processBA, null);
}
public static class ResumableSub_SetUpdateFTPRecord extends BA.ResumableSub {
public ResumableSub_SetUpdateFTPRecord(xevolution.vrcg.devdemov2400.dataupdate parent,anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec,boolean _withimg,int _def,String _tc_filter) {
this.parent = parent;
this._inrec = _inrec;
this._withimg = _withimg;
this._def = _def;
this._tc_filter = _tc_filter;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _inrec;
boolean _withimg;
int _def;
String _tc_filter;
int _up_type = 0;
String _up_date = "";
String _up_values = "";
String _up_tableurl = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rr = null;
boolean _finished = false;
String _upd = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59834369;
 //BA.debugLineNum = 59834369;BA.debugLine="If withImg Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_withimg) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="Dim up_type As Int = Utils.IfNullOrEmpty(inRec.G";
_up_type = (int)(Double.parseDouble(parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,BA.NumberToString(_inrec.GetInt("up_type")),BA.NumberToString(_def))));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=59834372;
 //BA.debugLineNum = 59834372;BA.debugLine="Dim up_date As String = Utils.IfNullOrEmpty(inRec";
_up_date = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_date"),"");
RDebugUtils.currentLine=59834373;
 //BA.debugLineNum = 59834373;BA.debugLine="Dim up_values As String = Utils.IfNullOrEmpty(inR";
_up_values = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_values"),"");
RDebugUtils.currentLine=59834374;
 //BA.debugLineNum = 59834374;BA.debugLine="Dim up_tableurl As String = Utils.IfNullOrEmpty(i";
_up_tableurl = parent.mostCurrent._utils._ifnullorempty /*String*/ (mostCurrent.activityBA,_inrec.GetString("up_tableurl"),"");
RDebugUtils.currentLine=59834375;
 //BA.debugLineNum = 59834375;BA.debugLine="If Utils.NNE(up_tableurl) And Utils.NNE(up_values";
if (true) break;

case 5:
//if
this.state = 24;
if (parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_up_tableurl) && parent.mostCurrent._utils._nne /*boolean*/ (mostCurrent.activityBA,_up_values)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=59834376;
 //BA.debugLineNum = 59834376;BA.debugLine="Dim rr As ResumableSub = UtilAPIUploadFile(up_ta";
_rr = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rr = _utilapiuploadfile(_up_tableurl,_up_values);
RDebugUtils.currentLine=59834377;
 //BA.debugLineNum = 59834377;BA.debugLine="Wait For(rr) complete (finished As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "setupdateftprecord"), _rr);
this.state = 25;
return;
case 25:
//C
this.state = 8;
_finished = (Boolean) result[0];
;
RDebugUtils.currentLine=59834378;
 //BA.debugLineNum = 59834378;BA.debugLine="If (finished = True) Then";
if (true) break;

case 8:
//if
this.state = 23;
if ((_finished==anywheresoftware.b4a.keywords.Common.True)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=59834379;
 //BA.debugLineNum = 59834379;BA.debugLine="Try";
if (true) break;

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
RDebugUtils.currentLine=59834380;
 //BA.debugLineNum = 59834380;BA.debugLine="If withImg Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_withimg) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=59834381;
 //BA.debugLineNum = 59834381;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
_upd = ("update loc_updatesrever set up_state= 1 where up_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_date))+"' and up_type="+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_type))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc_filter))+"");
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=59834383;
 //BA.debugLineNum = 59834383;BA.debugLine="Dim upd As String = $\"update loc_updatesrever";
_upd = ("update loc_updatesrever set up_state= 1 where up_date='"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_up_date))+"' "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tc_filter))+"");
 if (true) break;

case 19:
//C
this.state = 22;
;
RDebugUtils.currentLine=59834385;
 //BA.debugLineNum = 59834385;BA.debugLine="Starter.LocalSQLWRK.ExecNonQuery(upd)";
parent.mostCurrent._starter._localsqlwrk /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_upd);
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=59834387;
 //BA.debugLineNum = 59834387;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("659834387",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=59834391;
 //BA.debugLineNum = 59834391;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _sendlogs2ftp() throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "sendlogs2ftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "sendlogs2ftp", null));}
ResumableSub_SendLogs2Ftp rsub = new ResumableSub_SendLogs2Ftp(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SendLogs2Ftp extends BA.ResumableSub {
public ResumableSub_SendLogs2Ftp(xevolution.vrcg.devdemov2400.dataupdate parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
boolean _ret = false;
String _dtf = "";
String _date2name = "";
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
anywheresoftware.b4a.objects.collections.List _listafiles = null;
Object _sf = null;
String _command = "";
boolean _success = false;
int _replycode = 0;
String _replystring = "";
int _f = 0;
String _file2check = "";
String _serverpath = "";
int step14;
int limit14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59441155;
 //BA.debugLineNum = 59441155;BA.debugLine="Dim dtf As String = DateTime.DateFormat";
_dtf = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=59441156;
 //BA.debugLineNum = 59441156;BA.debugLine="DateTime.DateFormat = \"yyyyMMdd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=59441157;
 //BA.debugLineNum = 59441157;BA.debugLine="Dim date2name As String = DateTime.Date(DateTime.";
_date2name = anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=59441158;
 //BA.debugLineNum = 59441158;BA.debugLine="DateTime.DateFormat = dtf";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_dtf);
RDebugUtils.currentLine=59441159;
 //BA.debugLineNum = 59441159;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=59441160;
 //BA.debugLineNum = 59441160;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=59441161;
 //BA.debugLineNum = 59441161;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=59441162;
 //BA.debugLineNum = 59441162;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=59441163;
 //BA.debugLineNum = 59441163;BA.debugLine="Dim ListaFiles As List = File.ListFiles(Starter.S";
_listafiles = new anywheresoftware.b4a.objects.collections.List();
_listafiles = anywheresoftware.b4a.keywords.Common.File.ListFiles(parent.mostCurrent._starter._sharedfolder /*String*/ );
RDebugUtils.currentLine=59441164;
 //BA.debugLineNum = 59441164;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 20;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
RDebugUtils.currentLine=59441165;
 //BA.debugLineNum = 59441165;BA.debugLine="Dim sf As Object = myFTP.SendCommand(\"MKD\",$\"${S";
_sf = _myftp.SendCommand(processBA,"MKD",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"/errorlogs"));
RDebugUtils.currentLine=59441166;
 //BA.debugLineNum = 59441166;BA.debugLine="Wait For (sf) myFTP_CommandCompleted (Command As";
anywheresoftware.b4a.keywords.Common.WaitFor("myftp_commandcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "sendlogs2ftp"), _sf);
this.state = 21;
return;
case 21:
//C
this.state = 4;
_command = (String) result[0];
_success = (Boolean) result[1];
_replycode = (Integer) result[2];
_replystring = (String) result[3];
;
RDebugUtils.currentLine=59441168;
 //BA.debugLineNum = 59441168;BA.debugLine="For f=0 To ListaFiles.Size -1";
if (true) break;

case 4:
//for
this.state = 17;
step14 = 1;
limit14 = (int) (_listafiles.getSize()-1);
_f = (int) (0) ;
this.state = 22;
if (true) break;

case 22:
//C
this.state = 17;
if ((step14 > 0 && _f <= limit14) || (step14 < 0 && _f >= limit14)) this.state = 6;
if (true) break;

case 23:
//C
this.state = 22;
_f = ((int)(0 + _f + step14)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=59441169;
 //BA.debugLineNum = 59441169;BA.debugLine="Dim File2check As String = ListaFiles.Get(f)";
_file2check = BA.ObjectToString(_listafiles.Get(_f));
RDebugUtils.currentLine=59441170;
 //BA.debugLineNum = 59441170;BA.debugLine="If File2check.Contains(\"-ErrorsLog.txt\") And No";
if (true) break;

case 7:
//if
this.state = 16;
if (_file2check.contains("-ErrorsLog.txt") && anywheresoftware.b4a.keywords.Common.Not(_file2check.contains(_date2name))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=59441171;
 //BA.debugLineNum = 59441171;BA.debugLine="Log(File2check)";
anywheresoftware.b4a.keywords.Common.LogImpl("659441171",_file2check,0);
RDebugUtils.currentLine=59441172;
 //BA.debugLineNum = 59441172;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Sh";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._sharedfolder /*String*/ ,_file2check,anywheresoftware.b4a.keywords.Common.False,"/"+parent.mostCurrent._sharecode._app_domain /*String*/ +"/"+_file2check);
RDebugUtils.currentLine=59441173;
 //BA.debugLineNum = 59441173;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "sendlogs2ftp"), _sf);
this.state = 24;
return;
case 24:
//C
this.state = 10;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=59441175;
 //BA.debugLineNum = 59441175;BA.debugLine="If Success Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_success) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=59441176;
 //BA.debugLineNum = 59441176;BA.debugLine="Log(\"file was uploaded successfully\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659441176","file was uploaded successfully",0);
RDebugUtils.currentLine=59441177;
 //BA.debugLineNum = 59441177;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=59441179;
 //BA.debugLineNum = 59441179;BA.debugLine="Log(\"Error uploading file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("659441179","Error uploading file",0);
RDebugUtils.currentLine=59441180;
 //BA.debugLineNum = 59441180;BA.debugLine="ret = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 23;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=59441184;
 //BA.debugLineNum = 59441184;BA.debugLine="ret = True";
_ret = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=59441185;
 //BA.debugLineNum = 59441185;BA.debugLine="myFTP.Close";
_myftp.Close();
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=59441187;
 //BA.debugLineNum = 59441187;BA.debugLine="ret = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59441188;
 //BA.debugLineNum = 59441188;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("659441188",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
 if (true) break;
if (true) break;

case 20:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=59441191;
 //BA.debugLineNum = 59441191;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "sendlogs2ftp"),(int) (250));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=59441192;
 //BA.debugLineNum = 59441192;BA.debugLine="Return ret";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_ret));return;};
RDebugUtils.currentLine=59441194;
 //BA.debugLineNum = 59441194;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _utilapiuploadfile(String _url,String _filename) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "utilapiuploadfile", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "utilapiuploadfile", new Object[] {_url,_filename}));}
ResumableSub_UtilAPIUploadFile rsub = new ResumableSub_UtilAPIUploadFile(null,_url,_filename);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UtilAPIUploadFile extends BA.ResumableSub {
public ResumableSub_UtilAPIUploadFile(xevolution.vrcg.devdemov2400.dataupdate parent,String _url,String _filename) {
this.parent = parent;
this._url = _url;
this._filename = _filename;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _url;
String _filename;
boolean _ret = false;
anywheresoftware.b4a.net.FTPWrapper _myftp = null;
Object _sf = null;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="Dim ret As Boolean = False";
_ret = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="Dim myFTP As FTP";
_myftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="myFTP.Initialize(\"ftp\", $\"${ShareCode.APPL_ACCOUN";
_myftp.Initialize(processBA,"ftp",(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_account /*String*/ .toLowerCase()))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),(int) (21),(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_ftp_user /*String*/ ))+"@"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+""),"..VRCG@EvolutionCheck20!9");
RDebugUtils.currentLine=59965444;
 //BA.debugLineNum = 59965444;BA.debugLine="myFTP.PassiveMode = True";
_myftp.setPassiveMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="myFTP.TimeoutMs =240000";
_myftp.TimeoutMs = (int) (240000);
RDebugUtils.currentLine=59965447;
 //BA.debugLineNum = 59965447;BA.debugLine="Dim sf As Object = myFTP.UploadFile(Starter.Inter";
_sf = _myftp.UploadFile(processBA,parent.mostCurrent._starter._internalfolder /*String*/ ,_filename,anywheresoftware.b4a.keywords.Common.False,_url+_filename);
RDebugUtils.currentLine=59965448;
 //BA.debugLineNum = 59965448;BA.debugLine="Wait For (sf) ftp_UploadCompleted (ServerPath As";
anywheresoftware.b4a.keywords.Common.WaitFor("ftp_uploadcompleted", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "utilapiuploadfile"), _sf);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_serverpath = (String) result[0];
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=59965449;
 //BA.debugLineNum = 59965449;BA.debugLine="Log($\"Ficheiro: ${filename}, URL: ${url}, Status:";
anywheresoftware.b4a.keywords.Common.LogImpl("659965449",("Ficheiro: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_filename))+", URL: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_url))+", Status: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._utils._bool2string /*String*/ (mostCurrent.activityBA,_success)))+""),0);
RDebugUtils.currentLine=59965450;
 //BA.debugLineNum = 59965450;BA.debugLine="ret = Success";
_ret = _success;
RDebugUtils.currentLine=59965451;
 //BA.debugLineNum = 59965451;BA.debugLine="myFTP.Close";
_myftp.Close();
RDebugUtils.currentLine=59965452;
 //BA.debugLineNum = 59965452;BA.debugLine="Return ret";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_ret));return;};
RDebugUtils.currentLine=59965453;
 //BA.debugLineNum = 59965453;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _utilapiupdate(String _params,Object _target,String _url) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "utilapiupdate", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "utilapiupdate", new Object[] {_params,_target,_url}));}
ResumableSub_UtilAPIUpdate rsub = new ResumableSub_UtilAPIUpdate(null,_params,_target,_url);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_UtilAPIUpdate extends BA.ResumableSub {
public ResumableSub_UtilAPIUpdate(xevolution.vrcg.devdemov2400.dataupdate parent,String _params,Object _target,String _url) {
this.parent = parent;
this._params = _params;
this._target = _target;
this._url = _url;
}
xevolution.vrcg.devdemov2400.dataupdate parent;
String _params;
Object _target;
String _url;
xevolution.vrcg.devdemov2400.httpjob _job = null;
String _addr = "";
int _status = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="dataupdate";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="Job.Initialize(\"\",target)";
_job._initialize /*String*/ (null,processBA,"",_target);
RDebugUtils.currentLine=59899907;
 //BA.debugLineNum = 59899907;BA.debugLine="Dim addr As String = url";
_addr = _url;
RDebugUtils.currentLine=59899909;
 //BA.debugLineNum = 59899909;BA.debugLine="Job.PostString(addr, params )";
_job._poststring /*String*/ (null,_addr,_params);
RDebugUtils.currentLine=59899910;
 //BA.debugLineNum = 59899910;BA.debugLine="Log(params)";
anywheresoftware.b4a.keywords.Common.LogImpl("659899910",_params,0);
RDebugUtils.currentLine=59899911;
 //BA.debugLineNum = 59899911;BA.debugLine="Log(addr)";
anywheresoftware.b4a.keywords.Common.LogImpl("659899911",_addr,0);
RDebugUtils.currentLine=59899912;
 //BA.debugLineNum = 59899912;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=59899914;
 //BA.debugLineNum = 59899914;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "utilapiupdate"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=59899915;
 //BA.debugLineNum = 59899915;BA.debugLine="If Job.Success Then";
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
RDebugUtils.currentLine=59899916;
 //BA.debugLineNum = 59899916;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
_status = parent.mostCurrent._utils._jobapistatus /*int*/ (mostCurrent.activityBA,_job);
RDebugUtils.currentLine=59899917;
 //BA.debugLineNum = 59899917;BA.debugLine="Log($\"Status: ${Status}\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("659899917",("Status: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_status))+""),0);
RDebugUtils.currentLine=59899918;
 //BA.debugLineNum = 59899918;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=59899919;
 //BA.debugLineNum = 59899919;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=59899921;
 //BA.debugLineNum = 59899921;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
RDebugUtils.currentLine=59899922;
 //BA.debugLineNum = 59899922;BA.debugLine="Sleep(250)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "dataupdate", "utilapiupdate"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=59899923;
 //BA.debugLineNum = 59899923;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=59899926;
 //BA.debugLineNum = 59899926;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _starttheactivity(boolean _islogin) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttheactivity", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starttheactivity", new Object[] {_islogin}));}
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Sub StartTheActivity(IsLogin As Boolean)";
RDebugUtils.currentLine=59310105;
 //BA.debugLineNum = 59310105;BA.debugLine="End Sub";
return "";
}
public static String  _starttheactivityliteupdate(String _tagcodeslist) throws Exception{
RDebugUtils.currentModule="dataupdate";
if (Debug.shouldDelegate(mostCurrent.activityBA, "starttheactivityliteupdate", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "starttheactivityliteupdate", new Object[] {_tagcodeslist}));}
RDebugUtils.currentLine=61865984;
 //BA.debugLineNum = 61865984;BA.debugLine="Sub StartTheActivityLiteUpdate(tagCodesList As Str";
RDebugUtils.currentLine=61865985;
 //BA.debugLineNum = 61865985;BA.debugLine="IsLoginUpdate = True";
_isloginupdate = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=61865986;
 //BA.debugLineNum = 61865986;BA.debugLine="Try";
try {RDebugUtils.currentLine=61865987;
 //BA.debugLineNum = 61865987;BA.debugLine="RunLiteUpdate(tagCodesList)";
_runliteupdate(_tagcodeslist);
 } 
       catch (Exception e5) {
			processBA.setLastException(e5);RDebugUtils.currentLine=61865989;
 //BA.debugLineNum = 61865989;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("661865989",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(mostCurrent.activityBA)),0);
RDebugUtils.currentLine=61865990;
 //BA.debugLineNum = 61865990;BA.debugLine="ButtonWelcomeNext_Click";
_buttonwelcomenext_click();
 };
RDebugUtils.currentLine=61865995;
 //BA.debugLineNum = 61865995;BA.debugLine="End Sub";
return "";
}
}