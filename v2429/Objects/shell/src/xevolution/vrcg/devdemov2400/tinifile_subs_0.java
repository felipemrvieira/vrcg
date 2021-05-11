package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tinifile_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 13;BA.debugLine="Private FMap As Map";
tinifile._fmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_fmap",tinifile._fmap);
 //BA.debugLineNum = 14;BA.debugLine="Private FDirName As String";
tinifile._fdirname = RemoteObject.createImmutable("");__ref.setField("_fdirname",tinifile._fdirname);
 //BA.debugLineNum = 15;BA.debugLine="Private FFileName As String";
tinifile._ffilename = RemoteObject.createImmutable("");__ref.setField("_ffilename",tinifile._ffilename);
 //BA.debugLineNum = 16;BA.debugLine="Private FAutoFlush As Boolean = False";
tinifile._fautoflush = tinifile.__c.getField(true,"False");__ref.setField("_fautoflush",tinifile._fautoflush);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _doflush(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DoFlush (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("doflush")) { return __ref.runUserSub(false, "tinifile","doflush", __ref);}
RemoteObject _writer = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _j = RemoteObject.createImmutable(0);
RemoteObject _sectname = RemoteObject.createImmutable("");
RemoteObject _sectvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 88;BA.debugLine="Private Sub DoFlush";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim Writer As TextWriter";
Debug.ShouldStop(16777216);
_writer = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextWriterWrapper");Debug.locals.put("Writer", _writer);
 BA.debugLineNum = 90;BA.debugLine="Dim i, j As Int";
Debug.ShouldStop(33554432);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_j = RemoteObject.createImmutable(0);Debug.locals.put("j", _j);
 BA.debugLineNum = 92;BA.debugLine="Writer.Initialize(File.OpenOutput(FDirName, FFile";
Debug.ShouldStop(134217728);
_writer.runVoidMethod ("Initialize",(Object)((tinifile.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(__ref.getField(true,"_fdirname" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_ffilename" /*RemoteObject*/ )),(Object)(tinifile.__c.getField(true,"False"))).getObject())));
 BA.debugLineNum = 94;BA.debugLine="For i = 0 To FMap.Size - 1";
Debug.ShouldStop(536870912);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step4 > 0 && _i.<Integer>get().intValue() <= limit4) || (step4 < 0 && _i.<Integer>get().intValue() >= limit4) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 95;BA.debugLine="Dim SectName As String = FMap.GetKeyAt(i)";
Debug.ShouldStop(1073741824);
_sectname = BA.ObjectToString(__ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("SectName", _sectname);Debug.locals.put("SectName", _sectname);
 BA.debugLineNum = 96;BA.debugLine="Dim SectValues As Map = FMap.GetValueAt(i)";
Debug.ShouldStop(-2147483648);
_sectvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sectvalues = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(false,"GetValueAt",(Object)(_i)));Debug.locals.put("SectValues", _sectvalues);
 BA.debugLineNum = 98;BA.debugLine="Writer.WriteLine(\"[\" & SectName & \"]\")";
Debug.ShouldStop(2);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.concat(RemoteObject.createImmutable("["),_sectname,RemoteObject.createImmutable("]"))));
 BA.debugLineNum = 100;BA.debugLine="For j = 0 To SectValues.Size - 1";
Debug.ShouldStop(8);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_sectvalues.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _j.<Integer>get().intValue() <= limit8) || (step8 < 0 && _j.<Integer>get().intValue() >= limit8) ;_j = RemoteObject.createImmutable((int)(0 + _j.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 101;BA.debugLine="Writer.WriteLine(SectValues.GetKeyAt(j) & \"=\" &";
Debug.ShouldStop(16);
_writer.runVoidMethod ("WriteLine",(Object)(RemoteObject.concat(_sectvalues.runMethod(false,"GetKeyAt",(Object)(_j)),RemoteObject.createImmutable("="),_sectvalues.runMethod(false,"GetValueAt",(Object)(_j)))));
 }
}Debug.locals.put("j", _j);
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 105;BA.debugLine="Writer.Close";
Debug.ShouldStop(256);
_writer.runVoidMethod ("Close");
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _flush(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Flush (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("flush")) { return __ref.runUserSub(false, "tinifile","flush", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Public Sub Flush";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="DoFlush";
Debug.ShouldStop(2);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_doflush" /*RemoteObject*/ );
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getautoflush(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetAutoFlush (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("getautoflush")) { return __ref.runUserSub(false, "tinifile","getautoflush", __ref);}
 BA.debugLineNum = 119;BA.debugLine="Public Sub GetAutoFlush As Boolean";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="Return FAutoFlush";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(true,"_fautoflush" /*RemoteObject*/ );
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdirname(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDirName (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("getdirname")) { return __ref.runUserSub(false, "tinifile","getdirname", __ref);}
 BA.debugLineNum = 109;BA.debugLine="Public Sub GetDirName As String";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Return FDirName";
Debug.ShouldStop(8192);
if (true) return __ref.getField(true,"_fdirname" /*RemoteObject*/ );
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfilename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetFileName (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("getfilename")) { return __ref.runUserSub(false, "tinifile","getfilename", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Public Sub GetFileName As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="Return FFileName";
Debug.ShouldStop(262144);
if (true) return __ref.getField(true,"_ffilename" /*RemoteObject*/ );
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _prmdirname,RemoteObject _prmfilename) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "tinifile","initialize", __ref, _ba, _prmdirname, _prmfilename);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("prmDirName", _prmdirname);
Debug.locals.put("prmFileName", _prmfilename);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(prmDirName As String, prmFil";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="FDirName = prmDirName";
Debug.ShouldStop(2097152);
__ref.setField ("_fdirname" /*RemoteObject*/ ,_prmdirname);
 BA.debugLineNum = 23;BA.debugLine="FFileName = prmFileName";
Debug.ShouldStop(4194304);
__ref.setField ("_ffilename" /*RemoteObject*/ ,_prmfilename);
 BA.debugLineNum = 25;BA.debugLine="FMap.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_fmap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="OpenIniFile";
Debug.ShouldStop(67108864);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_openinifile" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openinifile(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OpenIniFile (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("openinifile")) { return __ref.runUserSub(false, "tinifile","openinifile", __ref);}
RemoteObject _reader = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");
RemoteObject _line = RemoteObject.createImmutable("");
RemoteObject _prevsectname = RemoteObject.createImmutable("");
RemoteObject _sectname = RemoteObject.createImmutable("");
RemoteObject _keyname = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _equalsignpos = RemoteObject.createImmutable(0);
RemoteObject _map2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 32;BA.debugLine="Private Sub OpenIniFile";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 33;BA.debugLine="Dim Reader As TextReader";
Debug.ShouldStop(1);
_reader = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.TextReaderWrapper");Debug.locals.put("Reader", _reader);
 BA.debugLineNum = 35;BA.debugLine="FMap.Clear";
Debug.ShouldStop(4);
__ref.getField(false,"_fmap" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 37;BA.debugLine="If (File.Exists(FDirName, FFileName)) Then";
Debug.ShouldStop(16);
if ((tinifile.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_fdirname" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_ffilename" /*RemoteObject*/ )))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 38;BA.debugLine="Reader.Initialize(File.OpenInput(FDirName, FFile";
Debug.ShouldStop(32);
_reader.runVoidMethod ("Initialize",(Object)((tinifile.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(__ref.getField(true,"_fdirname" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_ffilename" /*RemoteObject*/ ))).getObject())));
 BA.debugLineNum = 40;BA.debugLine="Dim line As String = \"\"";
Debug.ShouldStop(128);
_line = BA.ObjectToString("");Debug.locals.put("line", _line);Debug.locals.put("line", _line);
 BA.debugLineNum = 41;BA.debugLine="Dim prevSectName As String = \"\"";
Debug.ShouldStop(256);
_prevsectname = BA.ObjectToString("");Debug.locals.put("prevSectName", _prevsectname);Debug.locals.put("prevSectName", _prevsectname);
 BA.debugLineNum = 42;BA.debugLine="Dim sectName As String = \"\"";
Debug.ShouldStop(512);
_sectname = BA.ObjectToString("");Debug.locals.put("sectName", _sectname);Debug.locals.put("sectName", _sectname);
 BA.debugLineNum = 43;BA.debugLine="Dim keyName As String = \"\"";
Debug.ShouldStop(1024);
_keyname = BA.ObjectToString("");Debug.locals.put("keyName", _keyname);Debug.locals.put("keyName", _keyname);
 BA.debugLineNum = 44;BA.debugLine="Dim value As String = \"\"";
Debug.ShouldStop(2048);
_value = BA.ObjectToString("");Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 45;BA.debugLine="Dim equalSignPos As Int = -1";
Debug.ShouldStop(4096);
_equalsignpos = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("equalSignPos", _equalsignpos);Debug.locals.put("equalSignPos", _equalsignpos);
 BA.debugLineNum = 46;BA.debugLine="Dim Map2 As Map";
Debug.ShouldStop(8192);
_map2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map2", _map2);
 BA.debugLineNum = 48;BA.debugLine="line = Reader.ReadLine";
Debug.ShouldStop(32768);
_line = _reader.runMethod(true,"ReadLine");Debug.locals.put("line", _line);
 BA.debugLineNum = 50;BA.debugLine="Do While (line <> Null)";
Debug.ShouldStop(131072);
while ((RemoteObject.solveBoolean("N",_line))) {
 BA.debugLineNum = 51;BA.debugLine="line = line.Trim";
Debug.ShouldStop(262144);
_line = _line.runMethod(true,"trim");Debug.locals.put("line", _line);
 BA.debugLineNum = 53;BA.debugLine="If (line.Length > 2) Then";
Debug.ShouldStop(1048576);
if ((RemoteObject.solveBoolean(">",_line.runMethod(true,"length"),BA.numberCast(double.class, 2)))) { 
 BA.debugLineNum = 54;BA.debugLine="If (line.SubString2(0, 1) = \"[\") Then";
Debug.ShouldStop(2097152);
if ((RemoteObject.solveBoolean("=",_line.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable("[")))) { 
 BA.debugLineNum = 55;BA.debugLine="If (line.EndsWith(\"]\")) Then";
Debug.ShouldStop(4194304);
if ((_line.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("]")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 56;BA.debugLine="sectName = line.SubString2(1, line.Length -";
Debug.ShouldStop(8388608);
_sectname = _line.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_line.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("sectName", _sectname);
 BA.debugLineNum = 57;BA.debugLine="If (prevSectName <> sectName) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("!",_prevsectname,_sectname))) { 
 BA.debugLineNum = 58;BA.debugLine="If (prevSectName <> \"\") Then";
Debug.ShouldStop(33554432);
if ((RemoteObject.solveBoolean("!",_prevsectname,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 59;BA.debugLine="FMap.Put(prevSectName.ToUpperCase, Map2)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_fmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_prevsectname.runMethod(true,"toUpperCase"))),(Object)((_map2.getObject())));
 };
 BA.debugLineNum = 61;BA.debugLine="Map2.Initialize";
Debug.ShouldStop(268435456);
_map2.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 63;BA.debugLine="prevSectName = sectName";
Debug.ShouldStop(1073741824);
_prevsectname = _sectname;Debug.locals.put("prevSectName", _prevsectname);
 };
 }else {
 BA.debugLineNum = 66;BA.debugLine="equalSignPos = line.IndexOf(\"=\")";
Debug.ShouldStop(2);
_equalsignpos = _line.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("=")));Debug.locals.put("equalSignPos", _equalsignpos);
 BA.debugLineNum = 67;BA.debugLine="If (equalSignPos > -1) Then";
Debug.ShouldStop(4);
if ((RemoteObject.solveBoolean(">",_equalsignpos,BA.numberCast(double.class, -(double) (0 + 1))))) { 
 BA.debugLineNum = 68;BA.debugLine="keyName = line.SubString2(0, equalSignPos)";
Debug.ShouldStop(8);
_keyname = _line.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_equalsignpos));Debug.locals.put("keyName", _keyname);
 BA.debugLineNum = 69;BA.debugLine="value = line.SubString(equalSignPos + 1)";
Debug.ShouldStop(16);
_value = _line.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_equalsignpos,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("value", _value);
 BA.debugLineNum = 70;BA.debugLine="Map2.Put(keyName.ToUpperCase, value)";
Debug.ShouldStop(32);
_map2.runVoidMethod ("Put",(Object)((_keyname.runMethod(true,"toUpperCase"))),(Object)((_value)));
 };
 };
 };
 BA.debugLineNum = 75;BA.debugLine="line = Reader.ReadLine";
Debug.ShouldStop(1024);
_line = _reader.runMethod(true,"ReadLine");Debug.locals.put("line", _line);
 }
;
 BA.debugLineNum = 78;BA.debugLine="If (prevSectName <> \"\") Then";
Debug.ShouldStop(8192);
if ((RemoteObject.solveBoolean("!",_prevsectname,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 79;BA.debugLine="FMap.Put(prevSectName.ToUpperCase, Map2)";
Debug.ShouldStop(16384);
__ref.getField(false,"_fmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_prevsectname.runMethod(true,"toUpperCase"))),(Object)((_map2.getObject())));
 };
 BA.debugLineNum = 82;BA.debugLine="Reader.Close";
Debug.ShouldStop(131072);
_reader.runVoidMethod ("Close");
 };
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readbool(RemoteObject __ref,RemoteObject _prmsectionname,RemoteObject _prmkeyname,RemoteObject _prmdefault) throws Exception{
try {
		Debug.PushSubsStack("ReadBool (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("readbool")) { return __ref.runUserSub(false, "tinifile","readbool", __ref, _prmsectionname, _prmkeyname, _prmdefault);}
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _defaultint = RemoteObject.createImmutable(0);
RemoteObject _resultint = RemoteObject.createImmutable(0);
Debug.locals.put("prmSectionName", _prmsectionname);
Debug.locals.put("prmKeyName", _prmkeyname);
Debug.locals.put("prmDefault", _prmdefault);
 BA.debugLineNum = 161;BA.debugLine="Public Sub ReadBool(prmSectionName As String, prmK";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim Result As Boolean = prmDefault";
Debug.ShouldStop(2);
_result = _prmdefault;Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 163;BA.debugLine="Dim DefaultInt As Int";
Debug.ShouldStop(4);
_defaultint = RemoteObject.createImmutable(0);Debug.locals.put("DefaultInt", _defaultint);
 BA.debugLineNum = 164;BA.debugLine="Dim ResultInt As Int";
Debug.ShouldStop(8);
_resultint = RemoteObject.createImmutable(0);Debug.locals.put("ResultInt", _resultint);
 BA.debugLineNum = 166;BA.debugLine="If (prmDefault) Then";
Debug.ShouldStop(32);
if ((_prmdefault).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 167;BA.debugLine="DefaultInt = 1";
Debug.ShouldStop(64);
_defaultint = BA.numberCast(int.class, 1);Debug.locals.put("DefaultInt", _defaultint);
 }else {
 BA.debugLineNum = 169;BA.debugLine="DefaultInt = 0";
Debug.ShouldStop(256);
_defaultint = BA.numberCast(int.class, 0);Debug.locals.put("DefaultInt", _defaultint);
 };
 BA.debugLineNum = 172;BA.debugLine="ResultInt = ReadInteger(prmSectionName, prmKeyNam";
Debug.ShouldStop(2048);
_resultint = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readinteger" /*RemoteObject*/ ,(Object)(_prmsectionname),(Object)(_prmkeyname),(Object)(_defaultint));Debug.locals.put("ResultInt", _resultint);
 BA.debugLineNum = 173;BA.debugLine="Result = (ResultInt = 1)";
Debug.ShouldStop(4096);
_result = BA.ObjectToBoolean((RemoteObject.solveBoolean("=",_resultint,BA.numberCast(double.class, 1))));Debug.locals.put("Result", _result);
 BA.debugLineNum = 175;BA.debugLine="Return Result";
Debug.ShouldStop(16384);
if (true) return _result;
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readinteger(RemoteObject __ref,RemoteObject _prmsectionname,RemoteObject _prmkeyname,RemoteObject _prmdefault) throws Exception{
try {
		Debug.PushSubsStack("ReadInteger (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("readinteger")) { return __ref.runUserSub(false, "tinifile","readinteger", __ref, _prmsectionname, _prmkeyname, _prmdefault);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _resultstr = RemoteObject.createImmutable("");
Debug.locals.put("prmSectionName", _prmsectionname);
Debug.locals.put("prmKeyName", _prmkeyname);
Debug.locals.put("prmDefault", _prmdefault);
 BA.debugLineNum = 149;BA.debugLine="Public Sub ReadInteger(prmSectionName As String, p";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim Result As Int = prmDefault";
Debug.ShouldStop(2097152);
_result = _prmdefault;Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 151;BA.debugLine="Dim ResultStr As String = ReadString(prmSectionNa";
Debug.ShouldStop(4194304);
_resultstr = __ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_readstring" /*RemoteObject*/ ,(Object)(_prmsectionname),(Object)(_prmkeyname),(Object)(BA.NumberToString(_prmdefault)));Debug.locals.put("ResultStr", _resultstr);Debug.locals.put("ResultStr", _resultstr);
 BA.debugLineNum = 153;BA.debugLine="If (ResultStr <> prmDefault) Then";
Debug.ShouldStop(16777216);
if ((RemoteObject.solveBoolean("!",_resultstr,BA.NumberToString(_prmdefault)))) { 
 BA.debugLineNum = 154;BA.debugLine="Result = ResultStr";
Debug.ShouldStop(33554432);
_result = BA.numberCast(int.class, _resultstr);Debug.locals.put("Result", _result);
 };
 BA.debugLineNum = 157;BA.debugLine="Return Result";
Debug.ShouldStop(268435456);
if (true) return _result;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _readstring(RemoteObject __ref,RemoteObject _prmsectionname,RemoteObject _prmkeyname,RemoteObject _prmdefault) throws Exception{
try {
		Debug.PushSubsStack("ReadString (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("readstring")) { return __ref.runUserSub(false, "tinifile","readstring", __ref, _prmsectionname, _prmkeyname, _prmdefault);}
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _sect = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prmSectionName", _prmsectionname);
Debug.locals.put("prmKeyName", _prmkeyname);
Debug.locals.put("prmDefault", _prmdefault);
 BA.debugLineNum = 134;BA.debugLine="Public Sub ReadString(prmSectionName As String, pr";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Dim Result As String = prmDefault";
Debug.ShouldStop(64);
_result = _prmdefault;Debug.locals.put("Result", _result);Debug.locals.put("Result", _result);
 BA.debugLineNum = 137;BA.debugLine="If (FMap.ContainsKey(prmSectionName.ToUpperCase))";
Debug.ShouldStop(256);
if ((__ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_prmsectionname.runMethod(true,"toUpperCase"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 138;BA.debugLine="Dim Sect As Map";
Debug.ShouldStop(512);
_sect = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Sect", _sect);
 BA.debugLineNum = 139;BA.debugLine="Sect = FMap.Get(prmSectionName.ToUpperCase)";
Debug.ShouldStop(1024);
_sect = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_prmsectionname.runMethod(true,"toUpperCase")))));
 BA.debugLineNum = 140;BA.debugLine="If (Sect.ContainsKey(prmKeyName.ToUpperCase)) Th";
Debug.ShouldStop(2048);
if ((_sect.runMethod(true,"ContainsKey",(Object)((_prmkeyname.runMethod(true,"toUpperCase"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 141;BA.debugLine="Result = Sect.GetDefault(prmKeyName.ToUpperCase";
Debug.ShouldStop(4096);
_result = BA.ObjectToString(_sect.runMethod(false,"GetDefault",(Object)((_prmkeyname.runMethod(true,"toUpperCase"))),(Object)((_prmdefault))));Debug.locals.put("Result", _result);
 };
 };
 BA.debugLineNum = 145;BA.debugLine="Return Result";
Debug.ShouldStop(65536);
if (true) return _result;
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautoflush(RemoteObject __ref,RemoteObject _prmvalue) throws Exception{
try {
		Debug.PushSubsStack("SetAutoFlush (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setautoflush")) { return __ref.runUserSub(false, "tinifile","setautoflush", __ref, _prmvalue);}
Debug.locals.put("prmValue", _prmvalue);
 BA.debugLineNum = 124;BA.debugLine="Public Sub SetAutoFlush(prmValue As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 125;BA.debugLine="FAutoFlush = prmValue";
Debug.ShouldStop(268435456);
__ref.setField ("_fautoflush" /*RemoteObject*/ ,_prmvalue);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writebool(RemoteObject __ref,RemoteObject _prmsectionname,RemoteObject _prmkeyname,RemoteObject _prmvalue) throws Exception{
try {
		Debug.PushSubsStack("WriteBool (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("writebool")) { return __ref.runUserSub(false, "tinifile","writebool", __ref, _prmsectionname, _prmkeyname, _prmvalue);}
RemoteObject _valueint = RemoteObject.createImmutable(0);
Debug.locals.put("prmSectionName", _prmsectionname);
Debug.locals.put("prmKeyName", _prmkeyname);
Debug.locals.put("prmValue", _prmvalue);
 BA.debugLineNum = 210;BA.debugLine="Public Sub WriteBool(prmSectionName As String, prm";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim ValueInt As Int";
Debug.ShouldStop(262144);
_valueint = RemoteObject.createImmutable(0);Debug.locals.put("ValueInt", _valueint);
 BA.debugLineNum = 213;BA.debugLine="If (prmValue) Then";
Debug.ShouldStop(1048576);
if ((_prmvalue).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 214;BA.debugLine="ValueInt = 1";
Debug.ShouldStop(2097152);
_valueint = BA.numberCast(int.class, 1);Debug.locals.put("ValueInt", _valueint);
 }else {
 BA.debugLineNum = 216;BA.debugLine="ValueInt = 0";
Debug.ShouldStop(8388608);
_valueint = BA.numberCast(int.class, 0);Debug.locals.put("ValueInt", _valueint);
 };
 BA.debugLineNum = 219;BA.debugLine="Return WriteInteger(prmSectionName, prmKeyName, V";
Debug.ShouldStop(67108864);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writeinteger" /*RemoteObject*/ ,(Object)(_prmsectionname),(Object)(_prmkeyname),(Object)(_valueint));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writeinteger(RemoteObject __ref,RemoteObject _prmsectionname,RemoteObject _prmkeyname,RemoteObject _prmvalue) throws Exception{
try {
		Debug.PushSubsStack("WriteInteger (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("writeinteger")) { return __ref.runUserSub(false, "tinifile","writeinteger", __ref, _prmsectionname, _prmkeyname, _prmvalue);}
Debug.locals.put("prmSectionName", _prmsectionname);
Debug.locals.put("prmKeyName", _prmkeyname);
Debug.locals.put("prmValue", _prmvalue);
 BA.debugLineNum = 205;BA.debugLine="Public Sub WriteInteger(prmSectionName As String,";
Debug.ShouldStop(4096);
 BA.debugLineNum = 206;BA.debugLine="Return WriteString(prmSectionName, prmKeyName, pr";
Debug.ShouldStop(8192);
if (true) return __ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_writestring" /*RemoteObject*/ ,(Object)(_prmsectionname),(Object)(_prmkeyname),(Object)(BA.NumberToString(_prmvalue)));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _writestring(RemoteObject __ref,RemoteObject _prmsectionname,RemoteObject _prmkeyname,RemoteObject _prmvalue) throws Exception{
try {
		Debug.PushSubsStack("WriteString (tinifile) ","tinifile",60,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("writestring")) { return __ref.runUserSub(false, "tinifile","writestring", __ref, _prmsectionname, _prmkeyname, _prmvalue);}
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prmSectionName", _prmsectionname);
Debug.locals.put("prmKeyName", _prmkeyname);
Debug.locals.put("prmValue", _prmvalue);
 BA.debugLineNum = 179;BA.debugLine="Public Sub WriteString(prmSectionName As String, p";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Dim Result As Boolean";
Debug.ShouldStop(524288);
_result = RemoteObject.createImmutable(false);Debug.locals.put("Result", _result);
 BA.debugLineNum = 181;BA.debugLine="Dim Values As Map";
Debug.ShouldStop(1048576);
_values = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Values", _values);
 BA.debugLineNum = 184;BA.debugLine="Result = Not(prmSectionName.Contains(CRLF) Or prm";
Debug.ShouldStop(8388608);
_result = tinifile.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_prmsectionname.runMethod(true,"contains",(Object)(tinifile.__c.getField(true,"CRLF")))) || RemoteObject.solveBoolean(".",_prmkeyname.runMethod(true,"contains",(Object)(tinifile.__c.getField(true,"CRLF")))) || RemoteObject.solveBoolean(".",_prmvalue.runMethod(true,"contains",(Object)(tinifile.__c.getField(true,"CRLF")))))));Debug.locals.put("Result", _result);
 BA.debugLineNum = 186;BA.debugLine="If (Result) Then";
Debug.ShouldStop(33554432);
if ((_result).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 187;BA.debugLine="If (FMap.ContainsKey(prmSectionName)) Then";
Debug.ShouldStop(67108864);
if ((__ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_prmsectionname)))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="Values = FMap.Get(prmSectionName)";
Debug.ShouldStop(134217728);
_values = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_fmap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_prmsectionname))));
 }else {
 BA.debugLineNum = 190;BA.debugLine="Values.Initialize";
Debug.ShouldStop(536870912);
_values.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 193;BA.debugLine="Values.Put(prmKeyName, prmValue)";
Debug.ShouldStop(1);
_values.runVoidMethod ("Put",(Object)((_prmkeyname)),(Object)((_prmvalue)));
 BA.debugLineNum = 194;BA.debugLine="FMap.Put(prmSectionName, Values)";
Debug.ShouldStop(2);
__ref.getField(false,"_fmap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_prmsectionname)),(Object)((_values.getObject())));
 BA.debugLineNum = 196;BA.debugLine="If (FAutoFlush) Then";
Debug.ShouldStop(8);
if ((__ref.getField(true,"_fautoflush" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="DoFlush";
Debug.ShouldStop(16);
__ref.runClassMethod (xevolution.vrcg.devdemov2400.tinifile.class, "_doflush" /*RemoteObject*/ );
 };
 };
 BA.debugLineNum = 201;BA.debugLine="Return Result";
Debug.ShouldStop(256);
if (true) return _result;
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}