package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xeval extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.b4xeval");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.b4xeval.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _parsednode{
public boolean IsInitialized;
public String Operator;
public xevolution.vrcg.devdemov2400.b4xeval._parsednode Left;
public xevolution.vrcg.devdemov2400.b4xeval._parsednode Right;
public int NodeType;
public double Value;
public void Initialize() {
IsInitialized = true;
Operator = "";
Left = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
Right = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
NodeType = 0;
Value = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _orderdata{
public boolean IsInitialized;
public int Index;
public int Level;
public int Added;
public void Initialize() {
IsInitialized = true;
Index = 0;
Level = 0;
Added = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public int _number_type = 0;
public int _operator_type = 0;
public xevolution.vrcg.devdemov2400.b4xeval._parsednode _root = null;
public int _parseindex = 0;
public anywheresoftware.b4a.objects.collections.List _nodes = null;
public anywheresoftware.b4a.objects.collections.Map _operatorlevel = null;
public boolean _error = false;
public Object _mcallback = null;
public String _meventname = "";
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
public String  _initialize(xevolution.vrcg.devdemov2400.b4xeval __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=83361792;
 //BA.debugLineNum = 83361792;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=83361793;
 //BA.debugLineNum = 83361793;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=83361794;
 //BA.debugLineNum = 83361794;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=83361795;
 //BA.debugLineNum = 83361795;BA.debugLine="OperatorLevel = CreateMap(\"+\": 1, \"-\": 1, \"*\":2,";
__ref._operatorlevel /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("+"),(Object)(1),(Object)("-"),(Object)(1),(Object)("*"),(Object)(2),(Object)("/"),(Object)(2)});
RDebugUtils.currentLine=83361796;
 //BA.debugLineNum = 83361796;BA.debugLine="End Sub";
return "";
}
public double  _eval(xevolution.vrcg.devdemov2400.b4xeval __ref,String _expression) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "eval", false))
	 {return ((Double) Debug.delegate(ba, "eval", new Object[] {_expression}));}
RDebugUtils.currentLine=83427328;
 //BA.debugLineNum = 83427328;BA.debugLine="Public Sub Eval(Expression As String) As Double";
RDebugUtils.currentLine=83427329;
 //BA.debugLineNum = 83427329;BA.debugLine="Error = False";
__ref._error /*boolean*/  = __c.False;
RDebugUtils.currentLine=83427330;
 //BA.debugLineNum = 83427330;BA.debugLine="Expression = Expression.Replace(\" \", \"\").ToLowerC";
_expression = _expression.replace(" ","").toLowerCase().replace("-(","-1*(");
RDebugUtils.currentLine=83427331;
 //BA.debugLineNum = 83427331;BA.debugLine="Return EvalHelper(Expression)";
if (true) return __ref._evalhelper /*double*/ (null,_expression);
RDebugUtils.currentLine=83427332;
 //BA.debugLineNum = 83427332;BA.debugLine="End Sub";
return 0;
}
public xevolution.vrcg.devdemov2400.b4xeval._parsednode  _buildtree(xevolution.vrcg.devdemov2400.b4xeval __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "buildtree", false))
	 {return ((xevolution.vrcg.devdemov2400.b4xeval._parsednode) Debug.delegate(ba, "buildtree", null));}
xevolution.vrcg.devdemov2400.b4xeval._parsednode _rt = null;
xevolution.vrcg.devdemov2400.b4xeval._parsednode _pn = null;
boolean _built = false;
RDebugUtils.currentLine=83689472;
 //BA.debugLineNum = 83689472;BA.debugLine="private Sub BuildTree As ParsedNode";
RDebugUtils.currentLine=83689473;
 //BA.debugLineNum = 83689473;BA.debugLine="Dim rt As ParsedNode";
_rt = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
RDebugUtils.currentLine=83689474;
 //BA.debugLineNum = 83689474;BA.debugLine="Do While ParseIndex < Nodes.Size";
while (__ref._parseindex /*int*/ <__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=83689475;
 //BA.debugLineNum = 83689475;BA.debugLine="Dim pn As ParsedNode = TakeNextNode";
_pn = __ref._takenextnode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null);
RDebugUtils.currentLine=83689476;
 //BA.debugLineNum = 83689476;BA.debugLine="Dim built As Boolean";
_built = false;
RDebugUtils.currentLine=83689477;
 //BA.debugLineNum = 83689477;BA.debugLine="If pn.Operator = \")\" Then";
if ((_pn.Operator /*String*/ ).equals(")")) { 
RDebugUtils.currentLine=83689478;
 //BA.debugLineNum = 83689478;BA.debugLine="Exit";
if (true) break;
 }else 
{RDebugUtils.currentLine=83689479;
 //BA.debugLineNum = 83689479;BA.debugLine="Else If pn.Operator = \"(\" Then";
if ((_pn.Operator /*String*/ ).equals("(")) { 
RDebugUtils.currentLine=83689480;
 //BA.debugLineNum = 83689480;BA.debugLine="pn = BuildTree";
_pn = __ref._buildtree /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null);
RDebugUtils.currentLine=83689481;
 //BA.debugLineNum = 83689481;BA.debugLine="built = True";
_built = __c.True;
 }}
;
RDebugUtils.currentLine=83689483;
 //BA.debugLineNum = 83689483;BA.debugLine="If pn.NodeType = NUMBER_TYPE Or built Then";
if (_pn.NodeType /*int*/ ==__ref._number_type /*int*/  || _built) { 
RDebugUtils.currentLine=83689484;
 //BA.debugLineNum = 83689484;BA.debugLine="If rt.IsInitialized Then";
if (_rt.IsInitialized /*boolean*/ ) { 
RDebugUtils.currentLine=83689485;
 //BA.debugLineNum = 83689485;BA.debugLine="rt.Right = pn";
_rt.Right /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/  = _pn;
 }else {
RDebugUtils.currentLine=83689487;
 //BA.debugLineNum = 83689487;BA.debugLine="rt = pn";
_rt = _pn;
 };
 }else 
{RDebugUtils.currentLine=83689489;
 //BA.debugLineNum = 83689489;BA.debugLine="Else if pn.NodeType = OPERATOR_TYPE Then";
if (_pn.NodeType /*int*/ ==__ref._operator_type /*int*/ ) { 
RDebugUtils.currentLine=83689490;
 //BA.debugLineNum = 83689490;BA.debugLine="pn.Left = rt";
_pn.Left /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/  = _rt;
RDebugUtils.currentLine=83689491;
 //BA.debugLineNum = 83689491;BA.debugLine="rt = pn";
_rt = _pn;
 }}
;
 }
;
RDebugUtils.currentLine=83689494;
 //BA.debugLineNum = 83689494;BA.debugLine="If rt.IsInitialized = False Then rt = pn";
if (_rt.IsInitialized /*boolean*/ ==__c.False) { 
_rt = _pn;};
RDebugUtils.currentLine=83689495;
 //BA.debugLineNum = 83689495;BA.debugLine="Return rt";
if (true) return _rt;
RDebugUtils.currentLine=83689496;
 //BA.debugLineNum = 83689496;BA.debugLine="End Sub";
return null;
}
public xevolution.vrcg.devdemov2400.b4xeval._parsednode  _takenextnode(xevolution.vrcg.devdemov2400.b4xeval __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "takenextnode", false))
	 {return ((xevolution.vrcg.devdemov2400.b4xeval._parsednode) Debug.delegate(ba, "takenextnode", null));}
xevolution.vrcg.devdemov2400.b4xeval._parsednode _pn = null;
RDebugUtils.currentLine=83820544;
 //BA.debugLineNum = 83820544;BA.debugLine="private Sub TakeNextNode As ParsedNode";
RDebugUtils.currentLine=83820545;
 //BA.debugLineNum = 83820545;BA.debugLine="Dim pn As ParsedNode = Nodes.Get(ParseIndex)";
_pn = (xevolution.vrcg.devdemov2400.b4xeval._parsednode)(__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._parseindex /*int*/ ));
RDebugUtils.currentLine=83820546;
 //BA.debugLineNum = 83820546;BA.debugLine="ParseIndex = ParseIndex + 1";
__ref._parseindex /*int*/  = (int) (__ref._parseindex /*int*/ +1);
RDebugUtils.currentLine=83820547;
 //BA.debugLineNum = 83820547;BA.debugLine="Return pn";
if (true) return _pn;
RDebugUtils.currentLine=83820548;
 //BA.debugLineNum = 83820548;BA.debugLine="End Sub";
return null;
}
public double  _calcsubexpression(xevolution.vrcg.devdemov2400.b4xeval __ref,String _expr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "calcsubexpression", false))
	 {return ((Double) Debug.delegate(ba, "calcsubexpression", new Object[] {_expr}));}
xevolution.vrcg.devdemov2400.b4xeval _be = null;
double _d = 0;
RDebugUtils.currentLine=83558400;
 //BA.debugLineNum = 83558400;BA.debugLine="Private Sub CalcSubExpression (expr As String) As";
RDebugUtils.currentLine=83558401;
 //BA.debugLineNum = 83558401;BA.debugLine="Dim be As B4XEval";
_be = new xevolution.vrcg.devdemov2400.b4xeval();
RDebugUtils.currentLine=83558402;
 //BA.debugLineNum = 83558402;BA.debugLine="be.Initialize (mCallback, mEventName)";
_be._initialize /*String*/ (null,ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ );
RDebugUtils.currentLine=83558403;
 //BA.debugLineNum = 83558403;BA.debugLine="Dim d As Double = be.EvalHelper(expr)";
_d = _be._evalhelper /*double*/ (null,_expr);
RDebugUtils.currentLine=83558404;
 //BA.debugLineNum = 83558404;BA.debugLine="If be.Error Then";
if (_be._error /*boolean*/ ) { 
RDebugUtils.currentLine=83558405;
 //BA.debugLineNum = 83558405;BA.debugLine="Error = True";
__ref._error /*boolean*/  = __c.True;
RDebugUtils.currentLine=83558406;
 //BA.debugLineNum = 83558406;BA.debugLine="Return 0";
if (true) return 0;
 };
RDebugUtils.currentLine=83558408;
 //BA.debugLineNum = 83558408;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=83558409;
 //BA.debugLineNum = 83558409;BA.debugLine="End Sub";
return 0;
}
public double  _evalhelper(xevolution.vrcg.devdemov2400.b4xeval __ref,String _expr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "evalhelper", false))
	 {return ((Double) Debug.delegate(ba, "evalhelper", new Object[] {_expr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _lastindex = 0;
xevolution.vrcg.devdemov2400.b4xeval._orderdata _currentorderdata = null;
String _operator = "";
String _rawnumber = "";
xevolution.vrcg.devdemov2400.b4xeval._parsednode _lastnode = null;
int _level = 0;
double _d = 0;
int _i = 0;
RDebugUtils.currentLine=83623936;
 //BA.debugLineNum = 83623936;BA.debugLine="Private Sub EvalHelper (expr As String) As Double";
RDebugUtils.currentLine=83623938;
 //BA.debugLineNum = 83623938;BA.debugLine="ParseIndex = 0";
__ref._parseindex /*int*/  = (int) (0);
RDebugUtils.currentLine=83623939;
 //BA.debugLineNum = 83623939;BA.debugLine="Dim root As ParsedNode";
_root = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
RDebugUtils.currentLine=83623940;
 //BA.debugLineNum = 83623940;BA.debugLine="root.Initialize";
__ref._root /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ .Initialize();
RDebugUtils.currentLine=83623941;
 //BA.debugLineNum = 83623941;BA.debugLine="expr = PrepareExpression(expr)";
_expr = __ref._prepareexpression /*String*/ (null,_expr);
RDebugUtils.currentLine=83623942;
 //BA.debugLineNum = 83623942;BA.debugLine="If Error Then Return 0";
if (__ref._error /*boolean*/ ) { 
if (true) return 0;};
RDebugUtils.currentLine=83623943;
 //BA.debugLineNum = 83623943;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"[\\.\\d]+\", expr)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("[\\.\\d]+",_expr);
RDebugUtils.currentLine=83623944;
 //BA.debugLineNum = 83623944;BA.debugLine="Nodes.Initialize";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=83623945;
 //BA.debugLineNum = 83623945;BA.debugLine="Dim lastIndex As Int = 0";
_lastindex = (int) (0);
RDebugUtils.currentLine=83623946;
 //BA.debugLineNum = 83623946;BA.debugLine="Dim currentOrderData As OrderData";
_currentorderdata = new xevolution.vrcg.devdemov2400.b4xeval._orderdata();
RDebugUtils.currentLine=83623947;
 //BA.debugLineNum = 83623947;BA.debugLine="currentOrderData.Initialize";
_currentorderdata.Initialize();
RDebugUtils.currentLine=83623948;
 //BA.debugLineNum = 83623948;BA.debugLine="Nodes.Add(CreateOperatorNode(\"(\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,"(")));
RDebugUtils.currentLine=83623949;
 //BA.debugLineNum = 83623949;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=83623950;
 //BA.debugLineNum = 83623950;BA.debugLine="Dim Operator As String = expr.SubString2(lastInd";
_operator = _expr.substring(_lastindex,_m.GetStart((int) (0)));
RDebugUtils.currentLine=83623951;
 //BA.debugLineNum = 83623951;BA.debugLine="Dim rawNumber As String = m.Match";
_rawnumber = _m.getMatch();
RDebugUtils.currentLine=83623952;
 //BA.debugLineNum = 83623952;BA.debugLine="If Operator.EndsWith(\"-\") Then";
if (_operator.endsWith("-")) { 
RDebugUtils.currentLine=83623953;
 //BA.debugLineNum = 83623953;BA.debugLine="Dim lastNode As ParsedNode = Nodes.Get(Nodes.Si";
_lastnode = (xevolution.vrcg.devdemov2400.b4xeval._parsednode)(__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=83623954;
 //BA.debugLineNum = 83623954;BA.debugLine="If lastNode.Operator = \"(\" Or Operator.Length >";
if ((_lastnode.Operator /*String*/ ).equals("(") || _operator.length()>1) { 
RDebugUtils.currentLine=83623956;
 //BA.debugLineNum = 83623956;BA.debugLine="Operator = Operator.SubString2(0, Operator.Len";
_operator = _operator.substring((int) (0),(int) (_operator.length()-1));
RDebugUtils.currentLine=83623957;
 //BA.debugLineNum = 83623957;BA.debugLine="rawNumber = \"-\" & rawNumber";
_rawnumber = "-"+_rawnumber;
 };
 };
RDebugUtils.currentLine=83623960;
 //BA.debugLineNum = 83623960;BA.debugLine="lastIndex = m.GetEnd(0)";
_lastindex = _m.GetEnd((int) (0));
RDebugUtils.currentLine=83623961;
 //BA.debugLineNum = 83623961;BA.debugLine="If Operator.Length > 0 Then";
if (_operator.length()>0) { 
RDebugUtils.currentLine=83623962;
 //BA.debugLineNum = 83623962;BA.debugLine="Dim level As Int = OperatorLevel.Get(Operator)";
_level = (int)(BA.ObjectToNumber(__ref._operatorlevel /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_operator))));
RDebugUtils.currentLine=83623963;
 //BA.debugLineNum = 83623963;BA.debugLine="If currentOrderData.Level > 0 Then";
if (_currentorderdata.Level /*int*/ >0) { 
RDebugUtils.currentLine=83623964;
 //BA.debugLineNum = 83623964;BA.debugLine="If currentOrderData.Level < level Then";
if (_currentorderdata.Level /*int*/ <_level) { 
RDebugUtils.currentLine=83623965;
 //BA.debugLineNum = 83623965;BA.debugLine="Nodes.InsertAt(currentOrderData.Index, Create";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_currentorderdata.Index /*int*/ ,(Object)(__ref._createoperatornode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,"(")));
RDebugUtils.currentLine=83623966;
 //BA.debugLineNum = 83623966;BA.debugLine="currentOrderData.Added = currentOrderData.Add";
_currentorderdata.Added /*int*/  = (int) (_currentorderdata.Added /*int*/ +1);
 }else 
{RDebugUtils.currentLine=83623967;
 //BA.debugLineNum = 83623967;BA.debugLine="Else if currentOrderData.Level > level Then";
if (_currentorderdata.Level /*int*/ >_level) { 
RDebugUtils.currentLine=83623968;
 //BA.debugLineNum = 83623968;BA.debugLine="If currentOrderData.Added > 0 Then";
if (_currentorderdata.Added /*int*/ >0) { 
RDebugUtils.currentLine=83623969;
 //BA.debugLineNum = 83623969;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,")")));
RDebugUtils.currentLine=83623970;
 //BA.debugLineNum = 83623970;BA.debugLine="currentOrderData.Added = currentOrderData.Ad";
_currentorderdata.Added /*int*/  = (int) (_currentorderdata.Added /*int*/ -1);
 };
 }}
;
 };
RDebugUtils.currentLine=83623974;
 //BA.debugLineNum = 83623974;BA.debugLine="currentOrderData.Level = level";
_currentorderdata.Level /*int*/  = _level;
RDebugUtils.currentLine=83623975;
 //BA.debugLineNum = 83623975;BA.debugLine="currentOrderData.Index = Nodes.Size + 1";
_currentorderdata.Index /*int*/  = (int) (__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1);
RDebugUtils.currentLine=83623976;
 //BA.debugLineNum = 83623976;BA.debugLine="Nodes.Add(CreateOperatorNode(Operator))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,_operator)));
 };
RDebugUtils.currentLine=83623978;
 //BA.debugLineNum = 83623978;BA.debugLine="Dim d As Double = rawNumber";
_d = (double)(Double.parseDouble(_rawnumber));
RDebugUtils.currentLine=83623979;
 //BA.debugLineNum = 83623979;BA.debugLine="Nodes.Add(CreateNumberNode(d))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnumbernode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,_d)));
 }
;
RDebugUtils.currentLine=83623981;
 //BA.debugLineNum = 83623981;BA.debugLine="For i = 1 To currentOrderData.Added";
{
final int step43 = 1;
final int limit43 = _currentorderdata.Added /*int*/ ;
_i = (int) (1) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=83623982;
 //BA.debugLineNum = 83623982;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,")")));
 }
};
RDebugUtils.currentLine=83623984;
 //BA.debugLineNum = 83623984;BA.debugLine="Nodes.Add(CreateOperatorNode(\")\"))";
__ref._nodes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createoperatornode /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null,")")));
RDebugUtils.currentLine=83623985;
 //BA.debugLineNum = 83623985;BA.debugLine="root = BuildTree";
__ref._root /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/  = __ref._buildtree /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ (null);
RDebugUtils.currentLine=83623986;
 //BA.debugLineNum = 83623986;BA.debugLine="Return EvalNode(root)";
if (true) return __ref._evalnode /*double*/ (null,__ref._root /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ );
RDebugUtils.currentLine=83623987;
 //BA.debugLineNum = 83623987;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(xevolution.vrcg.devdemov2400.b4xeval __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
RDebugUtils.currentLine=83296256;
 //BA.debugLineNum = 83296256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=83296257;
 //BA.debugLineNum = 83296257;BA.debugLine="Private Const NUMBER_TYPE = 1, OPERATOR_TYPE = 2";
_number_type = (int) (1);
_operator_type = (int) (2);
RDebugUtils.currentLine=83296258;
 //BA.debugLineNum = 83296258;BA.debugLine="Type ParsedNode (Operator As String, Left As Pars";
;
RDebugUtils.currentLine=83296260;
 //BA.debugLineNum = 83296260;BA.debugLine="Type OrderData (Index As Int, Level As Int, Added";
;
RDebugUtils.currentLine=83296261;
 //BA.debugLineNum = 83296261;BA.debugLine="Private root As ParsedNode";
_root = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
RDebugUtils.currentLine=83296262;
 //BA.debugLineNum = 83296262;BA.debugLine="Private ParseIndex As Int";
_parseindex = 0;
RDebugUtils.currentLine=83296263;
 //BA.debugLineNum = 83296263;BA.debugLine="Private Nodes As List";
_nodes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83296264;
 //BA.debugLineNum = 83296264;BA.debugLine="Private OperatorLevel As Map";
_operatorlevel = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=83296265;
 //BA.debugLineNum = 83296265;BA.debugLine="Public Error As Boolean";
_error = false;
RDebugUtils.currentLine=83296266;
 //BA.debugLineNum = 83296266;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=83296267;
 //BA.debugLineNum = 83296267;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=83296268;
 //BA.debugLineNum = 83296268;BA.debugLine="End Sub";
return "";
}
public xevolution.vrcg.devdemov2400.b4xeval._parsednode  _createnumbernode(xevolution.vrcg.devdemov2400.b4xeval __ref,double _d) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "createnumbernode", false))
	 {return ((xevolution.vrcg.devdemov2400.b4xeval._parsednode) Debug.delegate(ba, "createnumbernode", new Object[] {_d}));}
xevolution.vrcg.devdemov2400.b4xeval._parsednode _pn = null;
RDebugUtils.currentLine=83951616;
 //BA.debugLineNum = 83951616;BA.debugLine="Private Sub CreateNumberNode (d As Double) As Pars";
RDebugUtils.currentLine=83951617;
 //BA.debugLineNum = 83951617;BA.debugLine="Dim pn As ParsedNode";
_pn = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
RDebugUtils.currentLine=83951618;
 //BA.debugLineNum = 83951618;BA.debugLine="pn.Initialize";
_pn.Initialize();
RDebugUtils.currentLine=83951619;
 //BA.debugLineNum = 83951619;BA.debugLine="pn.NodeType = NUMBER_TYPE";
_pn.NodeType /*int*/  = __ref._number_type /*int*/ ;
RDebugUtils.currentLine=83951620;
 //BA.debugLineNum = 83951620;BA.debugLine="pn.Value = d";
_pn.Value /*double*/  = _d;
RDebugUtils.currentLine=83951621;
 //BA.debugLineNum = 83951621;BA.debugLine="Return pn";
if (true) return _pn;
RDebugUtils.currentLine=83951622;
 //BA.debugLineNum = 83951622;BA.debugLine="End Sub";
return null;
}
public xevolution.vrcg.devdemov2400.b4xeval._parsednode  _createoperatornode(xevolution.vrcg.devdemov2400.b4xeval __ref,String _operator) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "createoperatornode", false))
	 {return ((xevolution.vrcg.devdemov2400.b4xeval._parsednode) Debug.delegate(ba, "createoperatornode", new Object[] {_operator}));}
xevolution.vrcg.devdemov2400.b4xeval._parsednode _pn = null;
RDebugUtils.currentLine=83886080;
 //BA.debugLineNum = 83886080;BA.debugLine="Private Sub CreateOperatorNode(operator As String)";
RDebugUtils.currentLine=83886081;
 //BA.debugLineNum = 83886081;BA.debugLine="Dim pn As ParsedNode";
_pn = new xevolution.vrcg.devdemov2400.b4xeval._parsednode();
RDebugUtils.currentLine=83886082;
 //BA.debugLineNum = 83886082;BA.debugLine="pn.Initialize";
_pn.Initialize();
RDebugUtils.currentLine=83886083;
 //BA.debugLineNum = 83886083;BA.debugLine="pn.NodeType = OPERATOR_TYPE";
_pn.NodeType /*int*/  = __ref._operator_type /*int*/ ;
RDebugUtils.currentLine=83886084;
 //BA.debugLineNum = 83886084;BA.debugLine="pn.Operator = operator";
_pn.Operator /*String*/  = _operator;
RDebugUtils.currentLine=83886085;
 //BA.debugLineNum = 83886085;BA.debugLine="Return pn";
if (true) return _pn;
RDebugUtils.currentLine=83886086;
 //BA.debugLineNum = 83886086;BA.debugLine="End Sub";
return null;
}
public String  _prepareexpression(xevolution.vrcg.devdemov2400.b4xeval __ref,String _expr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "prepareexpression", false))
	 {return ((String) Debug.delegate(ba, "prepareexpression", new Object[] {_expr}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _lastmatchend = 0;
int _currentstart = 0;
boolean _functioncall = false;
anywheresoftware.b4a.objects.collections.List _args = null;
int _level = 0;
int _start = 0;
int _i = 0;
double _d = 0;
RDebugUtils.currentLine=83492864;
 //BA.debugLineNum = 83492864;BA.debugLine="Private Sub PrepareExpression(expr As String) As S";
RDebugUtils.currentLine=83492865;
 //BA.debugLineNum = 83492865;BA.debugLine="Dim m As Matcher = Regex.Matcher(\"(\\w*)\\(\", expr)";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = __c.Regex.Matcher("(\\w*)\\(",_expr);
RDebugUtils.currentLine=83492866;
 //BA.debugLineNum = 83492866;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=83492867;
 //BA.debugLineNum = 83492867;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=83492868;
 //BA.debugLineNum = 83492868;BA.debugLine="Dim lastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
RDebugUtils.currentLine=83492869;
 //BA.debugLineNum = 83492869;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=83492870;
 //BA.debugLineNum = 83492870;BA.debugLine="Dim currentStart As Int = m.GetStart(0)";
_currentstart = _m.GetStart((int) (0));
RDebugUtils.currentLine=83492871;
 //BA.debugLineNum = 83492871;BA.debugLine="If currentStart < lastMatchEnd Then Continue";
if (_currentstart<_lastmatchend) { 
if (true) continue;};
RDebugUtils.currentLine=83492872;
 //BA.debugLineNum = 83492872;BA.debugLine="sb.Append(expr.SubString2(lastMatchEnd, currentS";
_sb.Append(_expr.substring(_lastmatchend,_currentstart));
RDebugUtils.currentLine=83492873;
 //BA.debugLineNum = 83492873;BA.debugLine="Dim functionCall As Boolean";
_functioncall = false;
RDebugUtils.currentLine=83492874;
 //BA.debugLineNum = 83492874;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83492875;
 //BA.debugLineNum = 83492875;BA.debugLine="If m.Match.Length > 1 Then";
if (_m.getMatch().length()>1) { 
RDebugUtils.currentLine=83492876;
 //BA.debugLineNum = 83492876;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=83492877;
 //BA.debugLineNum = 83492877;BA.debugLine="functionCall = True";
_functioncall = __c.True;
 };
RDebugUtils.currentLine=83492879;
 //BA.debugLineNum = 83492879;BA.debugLine="Dim level As Int";
_level = 0;
RDebugUtils.currentLine=83492880;
 //BA.debugLineNum = 83492880;BA.debugLine="Dim start As Int = m.GetEnd(0)";
_start = _m.GetEnd((int) (0));
RDebugUtils.currentLine=83492881;
 //BA.debugLineNum = 83492881;BA.debugLine="For i = start To expr.Length - 1";
{
final int step17 = 1;
final int limit17 = (int) (_expr.length()-1);
_i = _start ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=83492882;
 //BA.debugLineNum = 83492882;BA.debugLine="If expr.CharAt(i) = \"(\" Then";
if (_expr.charAt(_i)==BA.ObjectToChar("(")) { 
RDebugUtils.currentLine=83492883;
 //BA.debugLineNum = 83492883;BA.debugLine="level = level + 1";
_level = (int) (_level+1);
 }else 
{RDebugUtils.currentLine=83492884;
 //BA.debugLineNum = 83492884;BA.debugLine="Else if expr.CharAt(i) = \",\" And level = 0 Then";
if (_expr.charAt(_i)==BA.ObjectToChar(",") && _level==0) { 
RDebugUtils.currentLine=83492885;
 //BA.debugLineNum = 83492885;BA.debugLine="args.Add(CalcSubExpression(expr.SubString2(sta";
_args.Add((Object)(__ref._calcsubexpression /*double*/ (null,_expr.substring(_start,_i))));
RDebugUtils.currentLine=83492886;
 //BA.debugLineNum = 83492886;BA.debugLine="start = i + 1";
_start = (int) (_i+1);
 }else 
{RDebugUtils.currentLine=83492887;
 //BA.debugLineNum = 83492887;BA.debugLine="Else if expr.CharAt(i) = \")\" Then";
if (_expr.charAt(_i)==BA.ObjectToChar(")")) { 
RDebugUtils.currentLine=83492888;
 //BA.debugLineNum = 83492888;BA.debugLine="level = level - 1";
_level = (int) (_level-1);
RDebugUtils.currentLine=83492889;
 //BA.debugLineNum = 83492889;BA.debugLine="If level = -1 Then";
if (_level==-1) { 
RDebugUtils.currentLine=83492890;
 //BA.debugLineNum = 83492890;BA.debugLine="Dim d As Double = CalcSubExpression(expr.SubS";
_d = __ref._calcsubexpression /*double*/ (null,_expr.substring(_start,_i));
RDebugUtils.currentLine=83492891;
 //BA.debugLineNum = 83492891;BA.debugLine="If functionCall Then";
if (_functioncall) { 
RDebugUtils.currentLine=83492892;
 //BA.debugLineNum = 83492892;BA.debugLine="args.Add(d)";
_args.Add((Object)(_d));
RDebugUtils.currentLine=83492893;
 //BA.debugLineNum = 83492893;BA.debugLine="d = CallSub3(mCallback, mEventName & \"_Funct";
_d = (double)(BA.ObjectToNumber(__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Function",(Object)(_m.getMatch().substring((int) (0),(int) (_m.getMatch().length()-1))),(Object)(_args))));
 };
RDebugUtils.currentLine=83492895;
 //BA.debugLineNum = 83492895;BA.debugLine="sb.Append(NumberFormat2(d, 1, 15, 0, False))";
_sb.Append(__c.NumberFormat2(_d,(int) (1),(int) (15),(int) (0),__c.False));
RDebugUtils.currentLine=83492896;
 //BA.debugLineNum = 83492896;BA.debugLine="lastMatchEnd = i + 1";
_lastmatchend = (int) (_i+1);
RDebugUtils.currentLine=83492897;
 //BA.debugLineNum = 83492897;BA.debugLine="Exit";
if (true) break;
 };
 }}}
;
 }
};
 }
;
RDebugUtils.currentLine=83492902;
 //BA.debugLineNum = 83492902;BA.debugLine="If lastMatchEnd < expr.Length Then sb.Append(expr";
if (_lastmatchend<_expr.length()) { 
_sb.Append(_expr.substring(_lastmatchend));};
RDebugUtils.currentLine=83492903;
 //BA.debugLineNum = 83492903;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=83492904;
 //BA.debugLineNum = 83492904;BA.debugLine="End Sub";
return "";
}
public double  _evalnode(xevolution.vrcg.devdemov2400.b4xeval __ref,xevolution.vrcg.devdemov2400.b4xeval._parsednode _pn) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xeval";
if (Debug.shouldDelegate(ba, "evalnode", false))
	 {return ((Double) Debug.delegate(ba, "evalnode", new Object[] {_pn}));}
double _left = 0;
double _right = 0;
RDebugUtils.currentLine=83755008;
 //BA.debugLineNum = 83755008;BA.debugLine="Private Sub EvalNode (pn As ParsedNode) As Double";
RDebugUtils.currentLine=83755009;
 //BA.debugLineNum = 83755009;BA.debugLine="If pn.NodeType = NUMBER_TYPE Then Return pn.Value";
if (_pn.NodeType /*int*/ ==__ref._number_type /*int*/ ) { 
if (true) return _pn.Value /*double*/ ;};
RDebugUtils.currentLine=83755010;
 //BA.debugLineNum = 83755010;BA.debugLine="Dim left As Double = EvalNode(pn.Left)";
_left = __ref._evalnode /*double*/ (null,_pn.Left /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ );
RDebugUtils.currentLine=83755011;
 //BA.debugLineNum = 83755011;BA.debugLine="Dim right As Double = EvalNode(pn.Right)";
_right = __ref._evalnode /*double*/ (null,_pn.Right /*xevolution.vrcg.devdemov2400.b4xeval._parsednode*/ );
RDebugUtils.currentLine=83755012;
 //BA.debugLineNum = 83755012;BA.debugLine="Select pn.Operator";
switch (BA.switchObjectToInt(_pn.Operator /*String*/ ,"+","-","*","/")) {
case 0: {
RDebugUtils.currentLine=83755014;
 //BA.debugLineNum = 83755014;BA.debugLine="Return left + right";
if (true) return _left+_right;
 break; }
case 1: {
RDebugUtils.currentLine=83755016;
 //BA.debugLineNum = 83755016;BA.debugLine="Return left - right";
if (true) return _left-_right;
 break; }
case 2: {
RDebugUtils.currentLine=83755018;
 //BA.debugLineNum = 83755018;BA.debugLine="Return left * right";
if (true) return _left*_right;
 break; }
case 3: {
RDebugUtils.currentLine=83755020;
 //BA.debugLineNum = 83755020;BA.debugLine="Return left / right";
if (true) return _left/(double)_right;
 break; }
default: {
RDebugUtils.currentLine=83755022;
 //BA.debugLineNum = 83755022;BA.debugLine="Log(\"Syntax error: \" & pn.Operator)";
__c.LogImpl("683755022","Syntax error: "+_pn.Operator /*String*/ ,0);
RDebugUtils.currentLine=83755023;
 //BA.debugLineNum = 83755023;BA.debugLine="Return \"error\"";
if (true) return (double)(Double.parseDouble("error"));
 break; }
}
;
RDebugUtils.currentLine=83755025;
 //BA.debugLineNum = 83755025;BA.debugLine="End Sub";
return 0;
}
}