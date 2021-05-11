package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tinifile extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.tinifile");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.tinifile.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _fmap = null;
public String _fdirname = "";
public String _ffilename = "";
public boolean _fautoflush = false;
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
public boolean  _writestring(xevolution.vrcg.devdemov2400.tinifile __ref,String _prmsectionname,String _prmkeyname,String _prmvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "writestring", false))
	 {return ((Boolean) Debug.delegate(ba, "writestring", new Object[] {_prmsectionname,_prmkeyname,_prmvalue}));}
boolean _result = false;
anywheresoftware.b4a.objects.collections.Map _values = null;
RDebugUtils.currentLine=186449920;
 //BA.debugLineNum = 186449920;BA.debugLine="Public Sub WriteString(prmSectionName As String, p";
RDebugUtils.currentLine=186449921;
 //BA.debugLineNum = 186449921;BA.debugLine="Dim Result As Boolean";
_result = false;
RDebugUtils.currentLine=186449922;
 //BA.debugLineNum = 186449922;BA.debugLine="Dim Values As Map";
_values = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=186449925;
 //BA.debugLineNum = 186449925;BA.debugLine="Result = Not(prmSectionName.Contains(CRLF) Or prm";
_result = __c.Not(_prmsectionname.contains(__c.CRLF) || _prmkeyname.contains(__c.CRLF) || _prmvalue.contains(__c.CRLF));
RDebugUtils.currentLine=186449927;
 //BA.debugLineNum = 186449927;BA.debugLine="If (Result) Then";
if ((_result)) { 
RDebugUtils.currentLine=186449928;
 //BA.debugLineNum = 186449928;BA.debugLine="If (FMap.ContainsKey(prmSectionName)) Then";
if ((__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_prmsectionname)))) { 
RDebugUtils.currentLine=186449929;
 //BA.debugLineNum = 186449929;BA.debugLine="Values = FMap.Get(prmSectionName)";
_values = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_prmsectionname))));
 }else {
RDebugUtils.currentLine=186449931;
 //BA.debugLineNum = 186449931;BA.debugLine="Values.Initialize";
_values.Initialize();
 };
RDebugUtils.currentLine=186449934;
 //BA.debugLineNum = 186449934;BA.debugLine="Values.Put(prmKeyName, prmValue)";
_values.Put((Object)(_prmkeyname),(Object)(_prmvalue));
RDebugUtils.currentLine=186449935;
 //BA.debugLineNum = 186449935;BA.debugLine="FMap.Put(prmSectionName, Values)";
__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_prmsectionname),(Object)(_values.getObject()));
RDebugUtils.currentLine=186449937;
 //BA.debugLineNum = 186449937;BA.debugLine="If (FAutoFlush) Then";
if ((__ref._fautoflush /*boolean*/ )) { 
RDebugUtils.currentLine=186449938;
 //BA.debugLineNum = 186449938;BA.debugLine="DoFlush";
__ref._doflush /*String*/ (null);
 };
 };
RDebugUtils.currentLine=186449942;
 //BA.debugLineNum = 186449942;BA.debugLine="Return Result";
if (true) return _result;
RDebugUtils.currentLine=186449943;
 //BA.debugLineNum = 186449943;BA.debugLine="End Sub";
return false;
}
public boolean  _writeinteger(xevolution.vrcg.devdemov2400.tinifile __ref,String _prmsectionname,String _prmkeyname,int _prmvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "writeinteger", false))
	 {return ((Boolean) Debug.delegate(ba, "writeinteger", new Object[] {_prmsectionname,_prmkeyname,_prmvalue}));}
RDebugUtils.currentLine=186515456;
 //BA.debugLineNum = 186515456;BA.debugLine="Public Sub WriteInteger(prmSectionName As String,";
RDebugUtils.currentLine=186515457;
 //BA.debugLineNum = 186515457;BA.debugLine="Return WriteString(prmSectionName, prmKeyName, pr";
if (true) return __ref._writestring /*boolean*/ (null,_prmsectionname,_prmkeyname,BA.NumberToString(_prmvalue));
RDebugUtils.currentLine=186515458;
 //BA.debugLineNum = 186515458;BA.debugLine="End Sub";
return false;
}
public String  _flush(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "flush", false))
	 {return ((String) Debug.delegate(ba, "flush", null));}
RDebugUtils.currentLine=186187776;
 //BA.debugLineNum = 186187776;BA.debugLine="Public Sub Flush";
RDebugUtils.currentLine=186187777;
 //BA.debugLineNum = 186187777;BA.debugLine="DoFlush";
__ref._doflush /*String*/ (null);
RDebugUtils.currentLine=186187778;
 //BA.debugLineNum = 186187778;BA.debugLine="End Sub";
return "";
}
public String  _initialize(xevolution.vrcg.devdemov2400.tinifile __ref,anywheresoftware.b4a.BA _ba,String _prmdirname,String _prmfilename) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_prmdirname,_prmfilename}));}
RDebugUtils.currentLine=185729024;
 //BA.debugLineNum = 185729024;BA.debugLine="Public Sub Initialize(prmDirName As String, prmFil";
RDebugUtils.currentLine=185729025;
 //BA.debugLineNum = 185729025;BA.debugLine="FDirName = prmDirName";
__ref._fdirname /*String*/  = _prmdirname;
RDebugUtils.currentLine=185729026;
 //BA.debugLineNum = 185729026;BA.debugLine="FFileName = prmFileName";
__ref._ffilename /*String*/  = _prmfilename;
RDebugUtils.currentLine=185729028;
 //BA.debugLineNum = 185729028;BA.debugLine="FMap.Initialize";
__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=185729030;
 //BA.debugLineNum = 185729030;BA.debugLine="OpenIniFile";
__ref._openinifile /*String*/ (null);
RDebugUtils.currentLine=185729031;
 //BA.debugLineNum = 185729031;BA.debugLine="End Sub";
return "";
}
public String  _setautoflush(xevolution.vrcg.devdemov2400.tinifile __ref,boolean _prmvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "setautoflush", false))
	 {return ((String) Debug.delegate(ba, "setautoflush", new Object[] {_prmvalue}));}
RDebugUtils.currentLine=186122240;
 //BA.debugLineNum = 186122240;BA.debugLine="Public Sub SetAutoFlush(prmValue As Boolean)";
RDebugUtils.currentLine=186122241;
 //BA.debugLineNum = 186122241;BA.debugLine="FAutoFlush = prmValue";
__ref._fautoflush /*boolean*/  = _prmvalue;
RDebugUtils.currentLine=186122242;
 //BA.debugLineNum = 186122242;BA.debugLine="End Sub";
return "";
}
public String  _readstring(xevolution.vrcg.devdemov2400.tinifile __ref,String _prmsectionname,String _prmkeyname,String _prmdefault) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "readstring", false))
	 {return ((String) Debug.delegate(ba, "readstring", new Object[] {_prmsectionname,_prmkeyname,_prmdefault}));}
String _result = "";
anywheresoftware.b4a.objects.collections.Map _sect = null;
RDebugUtils.currentLine=186253312;
 //BA.debugLineNum = 186253312;BA.debugLine="Public Sub ReadString(prmSectionName As String, pr";
RDebugUtils.currentLine=186253313;
 //BA.debugLineNum = 186253313;BA.debugLine="Dim Result As String = prmDefault";
_result = _prmdefault;
RDebugUtils.currentLine=186253315;
 //BA.debugLineNum = 186253315;BA.debugLine="If (FMap.ContainsKey(prmSectionName.ToUpperCase))";
if ((__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_prmsectionname.toUpperCase())))) { 
RDebugUtils.currentLine=186253316;
 //BA.debugLineNum = 186253316;BA.debugLine="Dim Sect As Map";
_sect = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=186253317;
 //BA.debugLineNum = 186253317;BA.debugLine="Sect = FMap.Get(prmSectionName.ToUpperCase)";
_sect = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_prmsectionname.toUpperCase()))));
RDebugUtils.currentLine=186253318;
 //BA.debugLineNum = 186253318;BA.debugLine="If (Sect.ContainsKey(prmKeyName.ToUpperCase)) Th";
if ((_sect.ContainsKey((Object)(_prmkeyname.toUpperCase())))) { 
RDebugUtils.currentLine=186253319;
 //BA.debugLineNum = 186253319;BA.debugLine="Result = Sect.GetDefault(prmKeyName.ToUpperCase";
_result = BA.ObjectToString(_sect.GetDefault((Object)(_prmkeyname.toUpperCase()),(Object)(_prmdefault)));
 };
 };
RDebugUtils.currentLine=186253323;
 //BA.debugLineNum = 186253323;BA.debugLine="Return Result";
if (true) return _result;
RDebugUtils.currentLine=186253324;
 //BA.debugLineNum = 186253324;BA.debugLine="End Sub";
return "";
}
public int  _readinteger(xevolution.vrcg.devdemov2400.tinifile __ref,String _prmsectionname,String _prmkeyname,int _prmdefault) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "readinteger", false))
	 {return ((Integer) Debug.delegate(ba, "readinteger", new Object[] {_prmsectionname,_prmkeyname,_prmdefault}));}
int _result = 0;
String _resultstr = "";
RDebugUtils.currentLine=186318848;
 //BA.debugLineNum = 186318848;BA.debugLine="Public Sub ReadInteger(prmSectionName As String, p";
RDebugUtils.currentLine=186318849;
 //BA.debugLineNum = 186318849;BA.debugLine="Dim Result As Int = prmDefault";
_result = _prmdefault;
RDebugUtils.currentLine=186318850;
 //BA.debugLineNum = 186318850;BA.debugLine="Dim ResultStr As String = ReadString(prmSectionNa";
_resultstr = __ref._readstring /*String*/ (null,_prmsectionname,_prmkeyname,BA.NumberToString(_prmdefault));
RDebugUtils.currentLine=186318852;
 //BA.debugLineNum = 186318852;BA.debugLine="If (ResultStr <> prmDefault) Then";
if (((_resultstr).equals(BA.NumberToString(_prmdefault)) == false)) { 
RDebugUtils.currentLine=186318853;
 //BA.debugLineNum = 186318853;BA.debugLine="Result = ResultStr";
_result = (int)(Double.parseDouble(_resultstr));
 };
RDebugUtils.currentLine=186318856;
 //BA.debugLineNum = 186318856;BA.debugLine="Return Result";
if (true) return _result;
RDebugUtils.currentLine=186318857;
 //BA.debugLineNum = 186318857;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
RDebugUtils.currentLine=185663488;
 //BA.debugLineNum = 185663488;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=185663489;
 //BA.debugLineNum = 185663489;BA.debugLine="Private FMap As Map";
_fmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185663490;
 //BA.debugLineNum = 185663490;BA.debugLine="Private FDirName As String";
_fdirname = "";
RDebugUtils.currentLine=185663491;
 //BA.debugLineNum = 185663491;BA.debugLine="Private FFileName As String";
_ffilename = "";
RDebugUtils.currentLine=185663492;
 //BA.debugLineNum = 185663492;BA.debugLine="Private FAutoFlush As Boolean = False";
_fautoflush = __c.False;
RDebugUtils.currentLine=185663493;
 //BA.debugLineNum = 185663493;BA.debugLine="End Sub";
return "";
}
public String  _doflush(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "doflush", false))
	 {return ((String) Debug.delegate(ba, "doflush", null));}
anywheresoftware.b4a.objects.streams.File.TextWriterWrapper _writer = null;
int _i = 0;
int _j = 0;
String _sectname = "";
anywheresoftware.b4a.objects.collections.Map _sectvalues = null;
RDebugUtils.currentLine=185860096;
 //BA.debugLineNum = 185860096;BA.debugLine="Private Sub DoFlush";
RDebugUtils.currentLine=185860097;
 //BA.debugLineNum = 185860097;BA.debugLine="Dim Writer As TextWriter";
_writer = new anywheresoftware.b4a.objects.streams.File.TextWriterWrapper();
RDebugUtils.currentLine=185860098;
 //BA.debugLineNum = 185860098;BA.debugLine="Dim i, j As Int";
_i = 0;
_j = 0;
RDebugUtils.currentLine=185860100;
 //BA.debugLineNum = 185860100;BA.debugLine="Writer.Initialize(File.OpenOutput(FDirName, FFile";
_writer.Initialize((java.io.OutputStream)(__c.File.OpenOutput(__ref._fdirname /*String*/ ,__ref._ffilename /*String*/ ,__c.False).getObject()));
RDebugUtils.currentLine=185860102;
 //BA.debugLineNum = 185860102;BA.debugLine="For i = 0 To FMap.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=185860103;
 //BA.debugLineNum = 185860103;BA.debugLine="Dim SectName As String = FMap.GetKeyAt(i)";
_sectname = BA.ObjectToString(__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i));
RDebugUtils.currentLine=185860104;
 //BA.debugLineNum = 185860104;BA.debugLine="Dim SectValues As Map = FMap.GetValueAt(i)";
_sectvalues = new anywheresoftware.b4a.objects.collections.Map();
_sectvalues = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_i)));
RDebugUtils.currentLine=185860106;
 //BA.debugLineNum = 185860106;BA.debugLine="Writer.WriteLine(\"[\" & SectName & \"]\")";
_writer.WriteLine("["+_sectname+"]");
RDebugUtils.currentLine=185860108;
 //BA.debugLineNum = 185860108;BA.debugLine="For j = 0 To SectValues.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_sectvalues.getSize()-1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=185860109;
 //BA.debugLineNum = 185860109;BA.debugLine="Writer.WriteLine(SectValues.GetKeyAt(j) & \"=\" &";
_writer.WriteLine(BA.ObjectToString(_sectvalues.GetKeyAt(_j))+"="+BA.ObjectToString(_sectvalues.GetValueAt(_j)));
 }
};
 }
};
RDebugUtils.currentLine=185860113;
 //BA.debugLineNum = 185860113;BA.debugLine="Writer.Close";
_writer.Close();
RDebugUtils.currentLine=185860114;
 //BA.debugLineNum = 185860114;BA.debugLine="End Sub";
return "";
}
public boolean  _getautoflush(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "getautoflush", false))
	 {return ((Boolean) Debug.delegate(ba, "getautoflush", null));}
RDebugUtils.currentLine=186056704;
 //BA.debugLineNum = 186056704;BA.debugLine="Public Sub GetAutoFlush As Boolean";
RDebugUtils.currentLine=186056705;
 //BA.debugLineNum = 186056705;BA.debugLine="Return FAutoFlush";
if (true) return __ref._fautoflush /*boolean*/ ;
RDebugUtils.currentLine=186056706;
 //BA.debugLineNum = 186056706;BA.debugLine="End Sub";
return false;
}
public String  _getdirname(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "getdirname", false))
	 {return ((String) Debug.delegate(ba, "getdirname", null));}
RDebugUtils.currentLine=185925632;
 //BA.debugLineNum = 185925632;BA.debugLine="Public Sub GetDirName As String";
RDebugUtils.currentLine=185925633;
 //BA.debugLineNum = 185925633;BA.debugLine="Return FDirName";
if (true) return __ref._fdirname /*String*/ ;
RDebugUtils.currentLine=185925634;
 //BA.debugLineNum = 185925634;BA.debugLine="End Sub";
return "";
}
public String  _getfilename(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "getfilename", false))
	 {return ((String) Debug.delegate(ba, "getfilename", null));}
RDebugUtils.currentLine=185991168;
 //BA.debugLineNum = 185991168;BA.debugLine="Public Sub GetFileName As String";
RDebugUtils.currentLine=185991169;
 //BA.debugLineNum = 185991169;BA.debugLine="Return FFileName";
if (true) return __ref._ffilename /*String*/ ;
RDebugUtils.currentLine=185991170;
 //BA.debugLineNum = 185991170;BA.debugLine="End Sub";
return "";
}
public String  _openinifile(xevolution.vrcg.devdemov2400.tinifile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "openinifile", false))
	 {return ((String) Debug.delegate(ba, "openinifile", null));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _reader = null;
String _line = "";
String _prevsectname = "";
String _sectname = "";
String _keyname = "";
String _value = "";
int _equalsignpos = 0;
anywheresoftware.b4a.objects.collections.Map _map2 = null;
RDebugUtils.currentLine=185794560;
 //BA.debugLineNum = 185794560;BA.debugLine="Private Sub OpenIniFile";
RDebugUtils.currentLine=185794561;
 //BA.debugLineNum = 185794561;BA.debugLine="Dim Reader As TextReader";
_reader = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=185794563;
 //BA.debugLineNum = 185794563;BA.debugLine="FMap.Clear";
__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=185794565;
 //BA.debugLineNum = 185794565;BA.debugLine="If (File.Exists(FDirName, FFileName)) Then";
if ((__c.File.Exists(__ref._fdirname /*String*/ ,__ref._ffilename /*String*/ ))) { 
RDebugUtils.currentLine=185794566;
 //BA.debugLineNum = 185794566;BA.debugLine="Reader.Initialize(File.OpenInput(FDirName, FFile";
_reader.Initialize((java.io.InputStream)(__c.File.OpenInput(__ref._fdirname /*String*/ ,__ref._ffilename /*String*/ ).getObject()));
RDebugUtils.currentLine=185794568;
 //BA.debugLineNum = 185794568;BA.debugLine="Dim line As String = \"\"";
_line = "";
RDebugUtils.currentLine=185794569;
 //BA.debugLineNum = 185794569;BA.debugLine="Dim prevSectName As String = \"\"";
_prevsectname = "";
RDebugUtils.currentLine=185794570;
 //BA.debugLineNum = 185794570;BA.debugLine="Dim sectName As String = \"\"";
_sectname = "";
RDebugUtils.currentLine=185794571;
 //BA.debugLineNum = 185794571;BA.debugLine="Dim keyName As String = \"\"";
_keyname = "";
RDebugUtils.currentLine=185794572;
 //BA.debugLineNum = 185794572;BA.debugLine="Dim value As String = \"\"";
_value = "";
RDebugUtils.currentLine=185794573;
 //BA.debugLineNum = 185794573;BA.debugLine="Dim equalSignPos As Int = -1";
_equalsignpos = (int) (-1);
RDebugUtils.currentLine=185794574;
 //BA.debugLineNum = 185794574;BA.debugLine="Dim Map2 As Map";
_map2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=185794576;
 //BA.debugLineNum = 185794576;BA.debugLine="line = Reader.ReadLine";
_line = _reader.ReadLine();
RDebugUtils.currentLine=185794578;
 //BA.debugLineNum = 185794578;BA.debugLine="Do While (line <> Null)";
while ((_line!= null)) {
RDebugUtils.currentLine=185794579;
 //BA.debugLineNum = 185794579;BA.debugLine="line = line.Trim";
_line = _line.trim();
RDebugUtils.currentLine=185794581;
 //BA.debugLineNum = 185794581;BA.debugLine="If (line.Length > 2) Then";
if ((_line.length()>2)) { 
RDebugUtils.currentLine=185794582;
 //BA.debugLineNum = 185794582;BA.debugLine="If (line.SubString2(0, 1) = \"[\") Then";
if (((_line.substring((int) (0),(int) (1))).equals("["))) { 
RDebugUtils.currentLine=185794583;
 //BA.debugLineNum = 185794583;BA.debugLine="If (line.EndsWith(\"]\")) Then";
if ((_line.endsWith("]"))) { 
RDebugUtils.currentLine=185794584;
 //BA.debugLineNum = 185794584;BA.debugLine="sectName = line.SubString2(1, line.Length -";
_sectname = _line.substring((int) (1),(int) (_line.length()-1));
RDebugUtils.currentLine=185794585;
 //BA.debugLineNum = 185794585;BA.debugLine="If (prevSectName <> sectName) Then";
if (((_prevsectname).equals(_sectname) == false)) { 
RDebugUtils.currentLine=185794586;
 //BA.debugLineNum = 185794586;BA.debugLine="If (prevSectName <> \"\") Then";
if (((_prevsectname).equals("") == false)) { 
RDebugUtils.currentLine=185794587;
 //BA.debugLineNum = 185794587;BA.debugLine="FMap.Put(prevSectName.ToUpperCase, Map2)";
__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_prevsectname.toUpperCase()),(Object)(_map2.getObject()));
 };
RDebugUtils.currentLine=185794589;
 //BA.debugLineNum = 185794589;BA.debugLine="Map2.Initialize";
_map2.Initialize();
 };
RDebugUtils.currentLine=185794591;
 //BA.debugLineNum = 185794591;BA.debugLine="prevSectName = sectName";
_prevsectname = _sectname;
 };
 }else {
RDebugUtils.currentLine=185794594;
 //BA.debugLineNum = 185794594;BA.debugLine="equalSignPos = line.IndexOf(\"=\")";
_equalsignpos = _line.indexOf("=");
RDebugUtils.currentLine=185794595;
 //BA.debugLineNum = 185794595;BA.debugLine="If (equalSignPos > -1) Then";
if ((_equalsignpos>-1)) { 
RDebugUtils.currentLine=185794596;
 //BA.debugLineNum = 185794596;BA.debugLine="keyName = line.SubString2(0, equalSignPos)";
_keyname = _line.substring((int) (0),_equalsignpos);
RDebugUtils.currentLine=185794597;
 //BA.debugLineNum = 185794597;BA.debugLine="value = line.SubString(equalSignPos + 1)";
_value = _line.substring((int) (_equalsignpos+1));
RDebugUtils.currentLine=185794598;
 //BA.debugLineNum = 185794598;BA.debugLine="Map2.Put(keyName.ToUpperCase, value)";
_map2.Put((Object)(_keyname.toUpperCase()),(Object)(_value));
 };
 };
 };
RDebugUtils.currentLine=185794603;
 //BA.debugLineNum = 185794603;BA.debugLine="line = Reader.ReadLine";
_line = _reader.ReadLine();
 }
;
RDebugUtils.currentLine=185794606;
 //BA.debugLineNum = 185794606;BA.debugLine="If (prevSectName <> \"\") Then";
if (((_prevsectname).equals("") == false)) { 
RDebugUtils.currentLine=185794607;
 //BA.debugLineNum = 185794607;BA.debugLine="FMap.Put(prevSectName.ToUpperCase, Map2)";
__ref._fmap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_prevsectname.toUpperCase()),(Object)(_map2.getObject()));
 };
RDebugUtils.currentLine=185794610;
 //BA.debugLineNum = 185794610;BA.debugLine="Reader.Close";
_reader.Close();
 };
RDebugUtils.currentLine=185794612;
 //BA.debugLineNum = 185794612;BA.debugLine="End Sub";
return "";
}
public boolean  _readbool(xevolution.vrcg.devdemov2400.tinifile __ref,String _prmsectionname,String _prmkeyname,boolean _prmdefault) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "readbool", false))
	 {return ((Boolean) Debug.delegate(ba, "readbool", new Object[] {_prmsectionname,_prmkeyname,_prmdefault}));}
boolean _result = false;
int _defaultint = 0;
int _resultint = 0;
RDebugUtils.currentLine=186384384;
 //BA.debugLineNum = 186384384;BA.debugLine="Public Sub ReadBool(prmSectionName As String, prmK";
RDebugUtils.currentLine=186384385;
 //BA.debugLineNum = 186384385;BA.debugLine="Dim Result As Boolean = prmDefault";
_result = _prmdefault;
RDebugUtils.currentLine=186384386;
 //BA.debugLineNum = 186384386;BA.debugLine="Dim DefaultInt As Int";
_defaultint = 0;
RDebugUtils.currentLine=186384387;
 //BA.debugLineNum = 186384387;BA.debugLine="Dim ResultInt As Int";
_resultint = 0;
RDebugUtils.currentLine=186384389;
 //BA.debugLineNum = 186384389;BA.debugLine="If (prmDefault) Then";
if ((_prmdefault)) { 
RDebugUtils.currentLine=186384390;
 //BA.debugLineNum = 186384390;BA.debugLine="DefaultInt = 1";
_defaultint = (int) (1);
 }else {
RDebugUtils.currentLine=186384392;
 //BA.debugLineNum = 186384392;BA.debugLine="DefaultInt = 0";
_defaultint = (int) (0);
 };
RDebugUtils.currentLine=186384395;
 //BA.debugLineNum = 186384395;BA.debugLine="ResultInt = ReadInteger(prmSectionName, prmKeyNam";
_resultint = __ref._readinteger /*int*/ (null,_prmsectionname,_prmkeyname,_defaultint);
RDebugUtils.currentLine=186384396;
 //BA.debugLineNum = 186384396;BA.debugLine="Result = (ResultInt = 1)";
_result = (_resultint==1);
RDebugUtils.currentLine=186384398;
 //BA.debugLineNum = 186384398;BA.debugLine="Return Result";
if (true) return _result;
RDebugUtils.currentLine=186384399;
 //BA.debugLineNum = 186384399;BA.debugLine="End Sub";
return false;
}
public boolean  _writebool(xevolution.vrcg.devdemov2400.tinifile __ref,String _prmsectionname,String _prmkeyname,boolean _prmvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="tinifile";
if (Debug.shouldDelegate(ba, "writebool", false))
	 {return ((Boolean) Debug.delegate(ba, "writebool", new Object[] {_prmsectionname,_prmkeyname,_prmvalue}));}
int _valueint = 0;
RDebugUtils.currentLine=186580992;
 //BA.debugLineNum = 186580992;BA.debugLine="Public Sub WriteBool(prmSectionName As String, prm";
RDebugUtils.currentLine=186580993;
 //BA.debugLineNum = 186580993;BA.debugLine="Dim ValueInt As Int";
_valueint = 0;
RDebugUtils.currentLine=186580995;
 //BA.debugLineNum = 186580995;BA.debugLine="If (prmValue) Then";
if ((_prmvalue)) { 
RDebugUtils.currentLine=186580996;
 //BA.debugLineNum = 186580996;BA.debugLine="ValueInt = 1";
_valueint = (int) (1);
 }else {
RDebugUtils.currentLine=186580998;
 //BA.debugLineNum = 186580998;BA.debugLine="ValueInt = 0";
_valueint = (int) (0);
 };
RDebugUtils.currentLine=186581001;
 //BA.debugLineNum = 186581001;BA.debugLine="Return WriteInteger(prmSectionName, prmKeyName, V";
if (true) return __ref._writeinteger /*boolean*/ (null,_prmsectionname,_prmkeyname,_valueint);
RDebugUtils.currentLine=186581002;
 //BA.debugLineNum = 186581002;BA.debugLine="End Sub";
return false;
}
}