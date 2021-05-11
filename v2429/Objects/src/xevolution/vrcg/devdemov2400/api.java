package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class api extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.api");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.api.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public boolean _api_result_state = false;
public String _job_url = "";
public String _job_funcreturn = "";
public boolean _job_savelocal = false;
public Object _job_target = null;
public anywheresoftware.b4a.objects.collections.Map _job_params = null;
public String _job_data = "";
public int _job_done_result = 0;
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
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(xevolution.vrcg.devdemov2400.api __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="api";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=66322432;
 //BA.debugLineNum = 66322432;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=66322434;
 //BA.debugLineNum = 66322434;BA.debugLine="End Sub";
return "";
}
public void  _updatedata2server(xevolution.vrcg.devdemov2400.api __ref,anywheresoftware.b4a.objects.collections.Map _params,Object _target,String _url,String _funcreturn,boolean _savelocal) throws Exception{
RDebugUtils.currentModule="api";
if (Debug.shouldDelegate(ba, "updatedata2server", false))
	 {Debug.delegate(ba, "updatedata2server", new Object[] {_params,_target,_url,_funcreturn,_savelocal}); return;}
ResumableSub_UpdateData2Server rsub = new ResumableSub_UpdateData2Server(this,__ref,_params,_target,_url,_funcreturn,_savelocal);
rsub.resume(ba, null);
}
public static class ResumableSub_UpdateData2Server extends BA.ResumableSub {
public ResumableSub_UpdateData2Server(xevolution.vrcg.devdemov2400.api parent,xevolution.vrcg.devdemov2400.api __ref,anywheresoftware.b4a.objects.collections.Map _params,Object _target,String _url,String _funcreturn,boolean _savelocal) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
this._target = _target;
this._url = _url;
this._funcreturn = _funcreturn;
this._savelocal = _savelocal;
this.__ref = parent;
}
xevolution.vrcg.devdemov2400.api __ref;
xevolution.vrcg.devdemov2400.api parent;
anywheresoftware.b4a.objects.collections.Map _params;
Object _target;
String _url;
String _funcreturn;
boolean _savelocal;
String _data = "";
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
xevolution.vrcg.devdemov2400.httpjob _jobd2s = null;
String _addr = "";
int _status = 0;
String _thisdata = "";
String _thedata = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="api";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=66387969;
 //BA.debugLineNum = 66387969;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=66387970;
 //BA.debugLineNum = 66387970;BA.debugLine="job_url = url";
__ref._job_url /*String*/  = _url;
RDebugUtils.currentLine=66387971;
 //BA.debugLineNum = 66387971;BA.debugLine="job_funcReturn = funcReturn";
__ref._job_funcreturn /*String*/  = _funcreturn;
RDebugUtils.currentLine=66387972;
 //BA.debugLineNum = 66387972;BA.debugLine="job_savelocal = savelocal";
__ref._job_savelocal /*boolean*/  = _savelocal;
RDebugUtils.currentLine=66387973;
 //BA.debugLineNum = 66387973;BA.debugLine="job_target = target";
__ref._job_target /*Object*/  = _target;
RDebugUtils.currentLine=66387974;
 //BA.debugLineNum = 66387974;BA.debugLine="job_params = params";
__ref._job_params /*anywheresoftware.b4a.objects.collections.Map*/  = _params;
RDebugUtils.currentLine=66387976;
 //BA.debugLineNum = 66387976;BA.debugLine="API_RESULT_STATE = False";
__ref._api_result_state /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=66387977;
 //BA.debugLineNum = 66387977;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 24;
this.catchState = 19;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 19;
RDebugUtils.currentLine=66387978;
 //BA.debugLineNum = 66387978;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=66387979;
 //BA.debugLineNum = 66387979;BA.debugLine="JSON.Initialize(params)";
_json.Initialize(_params);
RDebugUtils.currentLine=66387981;
 //BA.debugLineNum = 66387981;BA.debugLine="data = JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
RDebugUtils.currentLine=66387982;
 //BA.debugLineNum = 66387982;BA.debugLine="job_data = data";
__ref._job_data /*String*/  = _data;
RDebugUtils.currentLine=66387984;
 //BA.debugLineNum = 66387984;BA.debugLine="Dim JobD2S As HttpJob";
_jobd2s = new xevolution.vrcg.devdemov2400.httpjob();
RDebugUtils.currentLine=66387985;
 //BA.debugLineNum = 66387985;BA.debugLine="JobD2S.Initialize(\"JobD2S\",target)";
_jobd2s._initialize /*String*/ (null,ba,"JobD2S",_target);
RDebugUtils.currentLine=66387987;
 //BA.debugLineNum = 66387987;BA.debugLine="Dim addr As String = url";
_addr = _url;
RDebugUtils.currentLine=66387988;
 //BA.debugLineNum = 66387988;BA.debugLine="Log(data)";
parent.__c.LogImpl("666387988",_data,0);
RDebugUtils.currentLine=66387989;
 //BA.debugLineNum = 66387989;BA.debugLine="JobD2S.PostString(addr, data )";
_jobd2s._poststring /*String*/ (null,_addr,_data);
RDebugUtils.currentLine=66387990;
 //BA.debugLineNum = 66387990;BA.debugLine="JobD2S.GetRequest.SetContentType(\"application/js";
_jobd2s._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=66387992;
 //BA.debugLineNum = 66387992;BA.debugLine="Wait For (JobD2S) JobDone(JobD2S As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "api", "updatedata2server"), (Object)(_jobd2s));
this.state = 25;
return;
case 25:
//C
this.state = 4;
_jobd2s = (xevolution.vrcg.devdemov2400.httpjob) result[1];
;
RDebugUtils.currentLine=66387993;
 //BA.debugLineNum = 66387993;BA.debugLine="Log(\"API REPLY : \" & JobD2S.GetString)";
parent.__c.LogImpl("666387993","API REPLY : "+_jobd2s._getstring /*String*/ (null),0);
RDebugUtils.currentLine=66387994;
 //BA.debugLineNum = 66387994;BA.debugLine="If JobD2S.Success Then";
if (true) break;

case 4:
//if
this.state = 17;
if (_jobd2s._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=66387995;
 //BA.debugLineNum = 66387995;BA.debugLine="job_done_result = 1";
__ref._job_done_result /*int*/  = (int) (1);
RDebugUtils.currentLine=66387996;
 //BA.debugLineNum = 66387996;BA.debugLine="Log(\"API Reply:\" & JobD2S.GetString)";
parent.__c.LogImpl("666387996","API Reply:"+_jobd2s._getstring /*String*/ (null),0);
RDebugUtils.currentLine=66387997;
 //BA.debugLineNum = 66387997;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(JobD2S)";
_status = parent._utils._jobapistatus /*int*/ (parent.getActivityBA(),_jobd2s);
RDebugUtils.currentLine=66388000;
 //BA.debugLineNum = 66388000;BA.debugLine="Log(\"**********************************\")";
parent.__c.LogImpl("666388000","**********************************",0);
RDebugUtils.currentLine=66388001;
 //BA.debugLineNum = 66388001;BA.debugLine="Log(\"	SUCESSO \" & funcReturn )";
parent.__c.LogImpl("666388001","	SUCESSO "+_funcreturn,0);
RDebugUtils.currentLine=66388002;
 //BA.debugLineNum = 66388002;BA.debugLine="Log(\"**********************************\")";
parent.__c.LogImpl("666388002","**********************************",0);
RDebugUtils.currentLine=66388003;
 //BA.debugLineNum = 66388003;BA.debugLine="If Utils.NNE(funcReturn) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._utils._nne /*boolean*/ (parent.getActivityBA(),_funcreturn)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=66388004;
 //BA.debugLineNum = 66388004;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
parent.__c.LogImpl("666388004","RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR",0);
RDebugUtils.currentLine=66388005;
 //BA.debugLineNum = 66388005;BA.debugLine="Log(target)";
parent.__c.LogImpl("666388005",BA.ObjectToString(_target),0);
RDebugUtils.currentLine=66388006;
 //BA.debugLineNum = 66388006;BA.debugLine="Log(funcReturn)";
parent.__c.LogImpl("666388006",_funcreturn,0);
RDebugUtils.currentLine=66388007;
 //BA.debugLineNum = 66388007;BA.debugLine="Log(Status)";
parent.__c.LogImpl("666388007",BA.NumberToString(_status),0);
RDebugUtils.currentLine=66388008;
 //BA.debugLineNum = 66388008;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
parent.__c.LogImpl("666388008","RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR",0);
RDebugUtils.currentLine=66388009;
 //BA.debugLineNum = 66388009;BA.debugLine="CallSub2(target, funcReturn, Status)";
parent.__c.CallSubNew2(ba,_target,_funcreturn,(Object)(_status));
 if (true) break;

case 10:
//C
this.state = 17;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=66388012;
 //BA.debugLineNum = 66388012;BA.debugLine="job_done_result = 1";
__ref._job_done_result /*int*/  = (int) (1);
RDebugUtils.currentLine=66388013;
 //BA.debugLineNum = 66388013;BA.debugLine="Log(\"API ERROR Reply:\" & JobD2S.GetString)";
parent.__c.LogImpl("666388013","API ERROR Reply:"+_jobd2s._getstring /*String*/ (null),0);
RDebugUtils.currentLine=66388014;
 //BA.debugLineNum = 66388014;BA.debugLine="If (savelocal = True) Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_savelocal==parent.__c.True)) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=66388015;
 //BA.debugLineNum = 66388015;BA.debugLine="Dim thisData As String = Utils.MapToJson(param";
_thisdata = parent._utils._maptojson /*String*/ (parent.getActivityBA(),_params);
RDebugUtils.currentLine=66388016;
 //BA.debugLineNum = 66388016;BA.debugLine="Dim theData As String = $\"${data}, ${thisData}";
_thedata = (""+parent.__c.SmartStringFormatter("",(Object)(_data))+", "+parent.__c.SmartStringFormatter("",(Object)(_thisdata))+"");
RDebugUtils.currentLine=66388017;
 //BA.debugLineNum = 66388017;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (parent.getActivityBA(),(int) (4),"","","");
RDebugUtils.currentLine=66388018;
 //BA.debugLineNum = 66388018;BA.debugLine="Utils.save2update(url, thisData, 0, WorkerND)";
parent._utils._save2update /*String*/ (parent.getActivityBA(),_url,_thisdata,(int) (0),_workernd);
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 24;
;
RDebugUtils.currentLine=66388021;
 //BA.debugLineNum = 66388021;BA.debugLine="JobD2S.Release";
_jobd2s._release /*String*/ (null);
 if (true) break;

case 19:
//C
this.state = 20;
this.catchState = 0;
RDebugUtils.currentLine=66388023;
 //BA.debugLineNum = 66388023;BA.debugLine="Dim theData As String = $\"${LastException}, ${da";
_thedata = (""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(parent.getActivityBA()).getObject()))+", "+parent.__c.SmartStringFormatter("",(Object)(_data))+"");
RDebugUtils.currentLine=66388024;
 //BA.debugLineNum = 66388024;BA.debugLine="Log(theData)";
parent.__c.LogImpl("666388024",_thedata,0);
RDebugUtils.currentLine=66388025;
 //BA.debugLineNum = 66388025;BA.debugLine="Utils.logError(\"JobD2S\", ShareCode.SESS_OPER_Use";
parent._utils._logerror /*String*/ (parent.getActivityBA(),"JobD2S",parent._sharecode._sess_oper_user /*String*/ ,_thedata);
RDebugUtils.currentLine=66388026;
 //BA.debugLineNum = 66388026;BA.debugLine="If (savelocal = True) Then";
if (true) break;

case 20:
//if
this.state = 23;
if ((_savelocal==parent.__c.True)) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=66388027;
 //BA.debugLineNum = 66388027;BA.debugLine="Dim thisData As String = Utils.MapToJson(params";
_thisdata = parent._utils._maptojson /*String*/ (parent.getActivityBA(),_params);
RDebugUtils.currentLine=66388028;
 //BA.debugLineNum = 66388028;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWorke";
_workernd = parent._types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (parent.getActivityBA(),(int) (4),"","","");
RDebugUtils.currentLine=66388029;
 //BA.debugLineNum = 66388029;BA.debugLine="Utils.save2update(url, thisData, 0, WorkerND)";
parent._utils._save2update /*String*/ (parent.getActivityBA(),_url,_thisdata,(int) (0),_workernd);
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=66388033;
 //BA.debugLineNum = 66388033;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _class_globals(xevolution.vrcg.devdemov2400.api __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="api";
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="Public API_RESULT_STATE As Boolean = False";
_api_result_state = __c.False;
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="Private job_url As String";
_job_url = "";
RDebugUtils.currentLine=66256899;
 //BA.debugLineNum = 66256899;BA.debugLine="Private job_funcReturn As String";
_job_funcreturn = "";
RDebugUtils.currentLine=66256900;
 //BA.debugLineNum = 66256900;BA.debugLine="Private job_savelocal As Boolean";
_job_savelocal = false;
RDebugUtils.currentLine=66256901;
 //BA.debugLineNum = 66256901;BA.debugLine="Private job_target As Object";
_job_target = new Object();
RDebugUtils.currentLine=66256902;
 //BA.debugLineNum = 66256902;BA.debugLine="Private job_params As Map";
_job_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=66256903;
 //BA.debugLineNum = 66256903;BA.debugLine="Private job_data As String";
_job_data = "";
RDebugUtils.currentLine=66256904;
 //BA.debugLineNum = 66256904;BA.debugLine="Private job_done_result As Int = 0";
_job_done_result = (int) (0);
RDebugUtils.currentLine=66256905;
 //BA.debugLineNum = 66256905;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(xevolution.vrcg.devdemov2400.api __ref,xevolution.vrcg.devdemov2400.httpjob _job) throws Exception{
__ref = this;
RDebugUtils.currentModule="api";
if (Debug.shouldDelegate(ba, "jobdone", false))
	 {return ((String) Debug.delegate(ba, "jobdone", new Object[] {_job}));}
int _status = 0;
String _thisdata = "";
String _thedata = "";
xevolution.vrcg.devdemov2400.types._workernewdata _workernd = null;
RDebugUtils.currentLine=66453504;
 //BA.debugLineNum = 66453504;BA.debugLine="Sub JobDone (Job As HttpJob)";
RDebugUtils.currentLine=66453506;
 //BA.debugLineNum = 66453506;BA.debugLine="If job_done_result = 0 Then";
if (__ref._job_done_result /*int*/ ==0) { 
RDebugUtils.currentLine=66453507;
 //BA.debugLineNum = 66453507;BA.debugLine="If Job.Success Then";
if (_job._success /*boolean*/ ) { 
RDebugUtils.currentLine=66453508;
 //BA.debugLineNum = 66453508;BA.debugLine="Log(\"API Reply:\" & Job.GetString)";
__c.LogImpl("666453508","API Reply:"+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=66453509;
 //BA.debugLineNum = 66453509;BA.debugLine="Dim Status As Int = Utils.JobAPIStatus(Job)";
_status = _utils._jobapistatus /*int*/ (getActivityBA(),_job);
RDebugUtils.currentLine=66453512;
 //BA.debugLineNum = 66453512;BA.debugLine="Log(\"**********************************\")";
__c.LogImpl("666453512","**********************************",0);
RDebugUtils.currentLine=66453513;
 //BA.debugLineNum = 66453513;BA.debugLine="Log(\"	SUCESSO \" & job_funcReturn )";
__c.LogImpl("666453513","	SUCESSO "+__ref._job_funcreturn /*String*/ ,0);
RDebugUtils.currentLine=66453514;
 //BA.debugLineNum = 66453514;BA.debugLine="Log(\"**********************************\")";
__c.LogImpl("666453514","**********************************",0);
RDebugUtils.currentLine=66453515;
 //BA.debugLineNum = 66453515;BA.debugLine="If Utils.NNE(job_funcReturn) Then";
if (_utils._nne /*boolean*/ (getActivityBA(),__ref._job_funcreturn /*String*/ )) { 
RDebugUtils.currentLine=66453516;
 //BA.debugLineNum = 66453516;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
__c.LogImpl("666453516","RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR",0);
RDebugUtils.currentLine=66453517;
 //BA.debugLineNum = 66453517;BA.debugLine="Log(job_target)";
__c.LogImpl("666453517",BA.ObjectToString(__ref._job_target /*Object*/ ),0);
RDebugUtils.currentLine=66453518;
 //BA.debugLineNum = 66453518;BA.debugLine="Log(job_funcReturn)";
__c.LogImpl("666453518",__ref._job_funcreturn /*String*/ ,0);
RDebugUtils.currentLine=66453519;
 //BA.debugLineNum = 66453519;BA.debugLine="Log(Status)";
__c.LogImpl("666453519",BA.NumberToString(_status),0);
RDebugUtils.currentLine=66453520;
 //BA.debugLineNum = 66453520;BA.debugLine="Log(\"RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR";
__c.LogImpl("666453520","RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR",0);
RDebugUtils.currentLine=66453521;
 //BA.debugLineNum = 66453521;BA.debugLine="CallSub2(job_target, job_funcReturn, Status)";
__c.CallSubNew2(ba,__ref._job_target /*Object*/ ,__ref._job_funcreturn /*String*/ ,(Object)(_status));
 };
 }else {
RDebugUtils.currentLine=66453524;
 //BA.debugLineNum = 66453524;BA.debugLine="Log(\"API ERROR Reply:\" & Job.GetString)";
__c.LogImpl("666453524","API ERROR Reply:"+_job._getstring /*String*/ (null),0);
RDebugUtils.currentLine=66453525;
 //BA.debugLineNum = 66453525;BA.debugLine="If (job_savelocal = True) Then";
if ((__ref._job_savelocal /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=66453526;
 //BA.debugLineNum = 66453526;BA.debugLine="Dim thisData As String = Utils.MapToJson(job_p";
_thisdata = _utils._maptojson /*String*/ (getActivityBA(),__ref._job_params /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=66453527;
 //BA.debugLineNum = 66453527;BA.debugLine="Dim theData As String = $\"${job_data}, ${thisD";
_thedata = (""+__c.SmartStringFormatter("",(Object)(__ref._job_data /*String*/ ))+", "+__c.SmartStringFormatter("",(Object)(_thisdata))+"");
RDebugUtils.currentLine=66453528;
 //BA.debugLineNum = 66453528;BA.debugLine="Dim WorkerND As WorkerNewData = Types.MakeWork";
_workernd = _types._makeworkernewdata /*xevolution.vrcg.devdemov2400.types._workernewdata*/ (getActivityBA(),(int) (4),"","","");
RDebugUtils.currentLine=66453529;
 //BA.debugLineNum = 66453529;BA.debugLine="Utils.save2update(job_url, thisData, 0, Worker";
_utils._save2update /*String*/ (getActivityBA(),__ref._job_url /*String*/ ,_thisdata,(int) (0),_workernd);
 };
 };
 };
RDebugUtils.currentLine=66453534;
 //BA.debugLineNum = 66453534;BA.debugLine="End Sub";
return "";
}
}