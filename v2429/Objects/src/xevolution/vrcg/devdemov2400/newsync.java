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

public class newsync extends Activity implements B4AActivity{
	public static newsync mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.newsync");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (newsync).");
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
		activityBA = new BA(this, layout, processBA, "xevolution.vrcg.devdemov2400", "xevolution.vrcg.devdemov2400.newsync");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "xevolution.vrcg.devdemov2400.newsync", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (newsync) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (newsync) Resume **");
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
		return newsync.class;
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
            BA.LogInfo("** Activity (newsync) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (newsync) Pause event (activity is not paused). **");
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
            newsync mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (newsync) Resume **");
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
RDebugUtils.currentModule="newsync";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=146276352;
 //BA.debugLineNum = 146276352;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=146276356;
 //BA.debugLineNum = 146276356;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="newsync";
RDebugUtils.currentLine=146407424;
 //BA.debugLineNum = 146407424;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=146407426;
 //BA.debugLineNum = 146407426;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="newsync";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=146341888;
 //BA.debugLineNum = 146341888;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=146341890;
 //BA.debugLineNum = 146341890;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getlistfromserver() throws Exception{
RDebugUtils.currentModule="newsync";
if (Debug.shouldDelegate(mostCurrent.activityBA, "getlistfromserver", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(mostCurrent.activityBA, "getlistfromserver", null));}
ResumableSub_GetListfromServer rsub = new ResumableSub_GetListfromServer(null);
rsub.resume(processBA, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_GetListfromServer extends BA.ResumableSub {
public ResumableSub_GetListfromServer(xevolution.vrcg.devdemov2400.newsync parent) {
this.parent = parent;
}
xevolution.vrcg.devdemov2400.newsync parent;
anywheresoftware.b4a.objects.collections.Map _params = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _serveraddress = "";
xevolution.vrcg.devdemov2400.httpjob _job = null;
anywheresoftware.b4a.objects.collections.JSONParser _json1 = null;
anywheresoftware.b4a.objects.collections.Map _mapjson = null;
int _status = 0;
int _newrecordscount = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="newsync";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=146472963;
 //BA.debugLineNum = 146472963;BA.debugLine="Dim params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=146472964;
 //BA.debugLineNum = 146472964;BA.debugLine="params.Initialize";
_params.Initialize();
RDebugUtils.currentLine=146472965;
 //BA.debugLineNum = 146472965;BA.debugLine="params.Clear";
_params.Clear();
RDebugUtils.currentLine=146472966;
 //BA.debugLineNum = 146472966;BA.debugLine="params.Put(\"authorization\", ShareCode.APP_Authori";
_params.Put((Object)("authorization"),(Object)(parent.mostCurrent._sharecode._app_authorization /*String*/ ));
RDebugUtils.currentLine=146472967;
 //BA.debugLineNum = 146472967;BA.debugLine="params.Put(\"_token\", ShareCode.APP_TOKEN)";
_params.Put((Object)("_token"),(Object)(parent.mostCurrent._sharecode._app_token /*String*/ ));
RDebugUtils.currentLine=146472968;
 //BA.debugLineNum = 146472968;BA.debugLine="params.Put(\"name\", Utils.RandomString)";
_params.Put((Object)("name"),(Object)(parent.mostCurrent._utils._randomstring /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=146472969;
 //BA.debugLineNum = 146472969;BA.debugLine="params.Put(\"datetime\", Utils.GetCurrDatetime) ' d";
_params.Put((Object)("datetime"),(Object)(parent.mostCurrent._utils._getcurrdatetime /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=146472970;
 //BA.debugLineNum = 146472970;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=146472971;
 //BA.debugLineNum = 146472971;BA.debugLine="params.Put(\"versionTagcode\", Main.VersionTagcode)";
_params.Put((Object)("versionTagcode"),(Object)(parent.mostCurrent._main._versiontagcode /*String*/ ));
RDebugUtils.currentLine=146472972;
 //BA.debugLineNum = 146472972;BA.debugLine="params.Put(\"_authorization\", Main.DeviceAuthoriza";
_params.Put((Object)("_authorization"),(Object)(parent.mostCurrent._main._deviceauthorization /*String*/ ));
RDebugUtils.currentLine=146472973;
 //BA.debugLineNum = 146472973;BA.debugLine="params.Put(\"_instance\", Main.DeviceInstance)";
_params.Put((Object)("_instance"),(Object)(parent.mostCurrent._main._deviceinstance /*String*/ ));
RDebugUtils.currentLine=146472974;
 //BA.debugLineNum = 146472974;BA.debugLine="params.put(\"_deviceBrand\", Main.DeviceBrand)";
_params.Put((Object)("_deviceBrand"),(Object)(parent.mostCurrent._main._devicebrand /*String*/ ));
RDebugUtils.currentLine=146472975;
 //BA.debugLineNum = 146472975;BA.debugLine="params.put(\"_deviceModel\", Main.DeviceModel)";
_params.Put((Object)("_deviceModel"),(Object)(parent.mostCurrent._main._devicemodel /*String*/ ));
RDebugUtils.currentLine=146472976;
 //BA.debugLineNum = 146472976;BA.debugLine="params.put(\"_deviceMacAddress\", Main.DeviceMacAdd";
_params.Put((Object)("_deviceMacAddress"),(Object)(parent.mostCurrent._main._devicemacaddress /*String*/ ));
RDebugUtils.currentLine=146472977;
 //BA.debugLineNum = 146472977;BA.debugLine="params.Put(\"_user\", ShareCode.SESS_User)";
_params.Put((Object)("_user"),(Object)(parent.mostCurrent._sharecode._sess_user /*String*/ ));
RDebugUtils.currentLine=146472980;
 //BA.debugLineNum = 146472980;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=146472981;
 //BA.debugLineNum = 146472981;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=146472982;
 //BA.debugLineNum = 146472982;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=146472984;
 //BA.debugLineNum = 146472984;BA.debugLine="Log(data)";
anywheresoftware.b4a.keywords.Common.LogImpl("6146472984",_data,0);
RDebugUtils.currentLine=146472989;
 //BA.debugLineNum = 146472989;BA.debugLine="Dim ServerAddress As String = $\"https://${ShareCo";
_serveraddress = ("https://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._app_domain /*String*/ ))+"."+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent.mostCurrent._sharecode._appl_host /*String*/ ))+"/api/orion/generate/requests-count-pending");
RDebugUtils.currentLine=146472990;
 //BA.debugLineNum = 146472990;BA.debugLine="If Not(ShareCode.APP_WORKING_LOCAL) Then";
if (true) break;

case 1:
//if
this.state = 20;
if (anywheresoftware.b4a.keywords.Common.Not(parent.mostCurrent._sharecode._app_working_local /*boolean*/ )) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=146472991;
 //BA.debugLineNum = 146472991;BA.debugLine="Dim Job As HttpJob";
_job = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=146472992;
 //BA.debugLineNum = 146472992;BA.debugLine="Job.Initialize(\"\",DataUpdate)";
_job._initialize /*String*/ (null,processBA,"",(Object)(parent.mostCurrent._dataupdate.getObject()));
RDebugUtils.currentLine=146472993;
 //BA.debugLineNum = 146472993;BA.debugLine="Job.PostString(ServerAddress, data)";
_job._poststring /*String*/ (null,_serveraddress,_data);
RDebugUtils.currentLine=146472994;
 //BA.debugLineNum = 146472994;BA.debugLine="Job.GetRequest.SetContentType(\"application/json\"";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=146472995;
 //BA.debugLineNum = 146472995;BA.debugLine="Wait For (Job) JobDone(Job As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "newsync", "getlistfromserver"), (Object)(_job));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_job = (xevolution.vrcg.devdemov2400.httpjob) result[0];
;
RDebugUtils.currentLine=146472996;
 //BA.debugLineNum = 146472996;BA.debugLine="If Job.Success Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_job._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=146472997;
 //BA.debugLineNum = 146472997;BA.debugLine="Log(\"Success\" & Job.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("6146472997","Success"+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=146472999;
 //BA.debugLineNum = 146472999;BA.debugLine="Dim JSON1 As JSONParser";
_json1 = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=146473000;
 //BA.debugLineNum = 146473000;BA.debugLine="JSON1.Initialize(Job.GetString)";
_json1.Initialize(_job._getstring /*String*/ (null));
RDebugUtils.currentLine=146473001;
 //BA.debugLineNum = 146473001;BA.debugLine="Dim MapJSON As Map = JSON1.NextObject";
_mapjson = new anywheresoftware.b4a.objects.collections.Map();
_mapjson = _json1.NextObject();
RDebugUtils.currentLine=146473002;
 //BA.debugLineNum = 146473002;BA.debugLine="Dim status As Int = MapJSON.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("status"))));
RDebugUtils.currentLine=146473003;
 //BA.debugLineNum = 146473003;BA.debugLine="If (status = 1) Then";
if (true) break;

case 7:
//if
this.state = 14;
if ((_status==1)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=146473004;
 //BA.debugLineNum = 146473004;BA.debugLine="Dim NewRecordsCount As Int = MapJSON.Get(\"resu";
_newrecordscount = (int)(BA.ObjectToNumber(_mapjson.Get((Object)("results"))));
RDebugUtils.currentLine=146473005;
 //BA.debugLineNum = 146473005;BA.debugLine="If NewRecordsCount > 0 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_newrecordscount>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=146473007;
 //BA.debugLineNum = 146473007;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=146473013;
 //BA.debugLineNum = 146473013;BA.debugLine="Log(\"Success\" & Job.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("6146473013","Success"+_job._errormessage /*String*/ ,0);
 if (true) break;

case 17:
//C
this.state = 20;
;
RDebugUtils.currentLine=146473015;
 //BA.debugLineNum = 146473015;BA.debugLine="Job.Release";
_job._release /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=146473017;
 //BA.debugLineNum = 146473017;BA.debugLine="Log(\"Error APP_WORKING_LOCAL\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6146473017","Error APP_WORKING_LOCAL",0);
RDebugUtils.currentLine=146473018;
 //BA.debugLineNum = 146473018;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=146473020;
 //BA.debugLineNum = 146473020;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}