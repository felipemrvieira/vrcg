package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class structobjects_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private ListItemReference As Label";
structobjects._listitemreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemreference",structobjects._listitemreference);
 //BA.debugLineNum = 3;BA.debugLine="Private ListItemObject As Label";
structobjects._listitemobject = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemobject",structobjects._listitemobject);
 //BA.debugLineNum = 4;BA.debugLine="Private ListItemStatusPanel As Panel";
structobjects._listitemstatuspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_listitemstatuspanel",structobjects._listitemstatuspanel);
 //BA.debugLineNum = 5;BA.debugLine="Private ListItemDescription As Label";
structobjects._listitemdescription = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemdescription",structobjects._listitemdescription);
 //BA.debugLineNum = 6;BA.debugLine="Private listButMap As Button";
structobjects._listbutmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listbutmap",structobjects._listbutmap);
 //BA.debugLineNum = 7;BA.debugLine="Private ListItemEntity As Label";
structobjects._listitementity = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitementity",structobjects._listitementity);
 //BA.debugLineNum = 8;BA.debugLine="Private listObjects As CustomListView";
structobjects._listobjects = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_listobjects",structobjects._listobjects);
 //BA.debugLineNum = 10;BA.debugLine="Private ItemsCounter As Int = 0";
structobjects._itemscounter = BA.numberCast(int.class, 0);__ref.setField("_itemscounter",structobjects._itemscounter);
 //BA.debugLineNum = 11;BA.debugLine="Public ObjectsList As List";
structobjects._objectslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_objectslist",structobjects._objectslist);
 //BA.debugLineNum = 14;BA.debugLine="Private listButDocuments As Button";
structobjects._listbutdocuments = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listbutdocuments",structobjects._listbutdocuments);
 //BA.debugLineNum = 15;BA.debugLine="Private listButPlanning As Button";
structobjects._listbutplanning = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listbutplanning",structobjects._listbutplanning);
 //BA.debugLineNum = 16;BA.debugLine="Private ListItemStatus As Label";
structobjects._listitemstatus = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemstatus",structobjects._listitemstatus);
 //BA.debugLineNum = 17;BA.debugLine="Private listButProperties As Button";
structobjects._listbutproperties = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_listbutproperties",structobjects._listbutproperties);
 //BA.debugLineNum = 18;BA.debugLine="Private ListItemTitle As Label";
structobjects._listitemtitle = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_listitemtitle",structobjects._listitemtitle);
 //BA.debugLineNum = 19;BA.debugLine="Private planObjectsList As CustomListView";
structobjects._planobjectslist = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_planobjectslist",structobjects._planobjectslist);
 //BA.debugLineNum = 21;BA.debugLine="Private ItemsCounter As Int = 0";
structobjects._itemscounter = BA.numberCast(int.class, 0);__ref.setField("_itemscounter",structobjects._itemscounter);
 //BA.debugLineNum = 22;BA.debugLine="Public ObjectsList As List";
structobjects._objectslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_objectslist",structobjects._objectslist);
 //BA.debugLineNum = 24;BA.debugLine="Private ActivityReference As Activity";
structobjects._activityreference = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");__ref.setField("_activityreference",structobjects._activityreference);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createlistcontractitem(RemoteObject __ref,RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateListContractItem (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("createlistcontractitem")) { return __ref.runUserSub(false, "structobjects","createlistcontractitem", __ref, _cnt, _colitems, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _details = RemoteObject.createImmutable("");
RemoteObject _entity = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _enttagcode = RemoteObject.createImmutable("");
RemoteObject _entity_name = RemoteObject.createImmutable("");
RemoteObject _contrat_tagcode = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 133;BA.debugLine="Sub CreateListContractItem(cnt As Int, colitems As";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 135;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(64);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 136;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(128);
__ref.getField(false,"_activityreference" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 137;BA.debugLine="p.LoadLayout(\"objects_planItemView\")";
Debug.ShouldStop(256);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("objects_planItemView")),__ref.getField(false, "ba"));
 BA.debugLineNum = 138;BA.debugLine="p.RemoveView";
Debug.ShouldStop(512);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 140;BA.debugLine="Dim tagcode As String = colitems.Get(\"tagcode\")";
Debug.ShouldStop(2048);
_tagcode = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 141;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(4096);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 142;BA.debugLine="Dim details As String = colitems.Get(\"details\")";
Debug.ShouldStop(8192);
_details = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("details")))));Debug.locals.put("details", _details);Debug.locals.put("details", _details);
 BA.debugLineNum = 144;BA.debugLine="Dim entity As Map = colitems.Get(\"entity\")";
Debug.ShouldStop(32768);
_entity = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entity = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity")))));Debug.locals.put("entity", _entity);
 BA.debugLineNum = 145;BA.debugLine="Dim enttagcode As String = entity.Get(\"tagcode\")";
Debug.ShouldStop(65536);
_enttagcode = BA.ObjectToString(_entity.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("enttagcode", _enttagcode);Debug.locals.put("enttagcode", _enttagcode);
 BA.debugLineNum = 146;BA.debugLine="Dim entity_name As String = entity.Get(\"entity_na";
Debug.ShouldStop(131072);
_entity_name = BA.ObjectToString(_entity.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_name")))));Debug.locals.put("entity_name", _entity_name);Debug.locals.put("entity_name", _entity_name);
 BA.debugLineNum = 148;BA.debugLine="Dim contrat_tagcode As String = colitems.Get(\"con";
Debug.ShouldStop(524288);
_contrat_tagcode = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contrat_tagcode")))));Debug.locals.put("contrat_tagcode", _contrat_tagcode);Debug.locals.put("contrat_tagcode", _contrat_tagcode);
 BA.debugLineNum = 150;BA.debugLine="ListItemObject.text = $\"#${cnt} - ${name}\"$";
Debug.ShouldStop(2097152);
__ref.getField(false,"_listitemobject" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 151;BA.debugLine="ListItemObject.Tag = tagcode";
Debug.ShouldStop(4194304);
__ref.getField(false,"_listitemobject" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 152;BA.debugLine="ListItemDescription.text = $\"${details}\"$";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listitemdescription" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_details))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 154;BA.debugLine="ListItemEntity.text = $\"${entity_name}\"$";
Debug.ShouldStop(33554432);
__ref.getField(false,"_listitementity" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entity_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 155;BA.debugLine="ListItemEntity.Tag = enttagcode";
Debug.ShouldStop(67108864);
__ref.getField(false,"_listitementity" /*RemoteObject*/ ).runMethod(false,"setTag",(_enttagcode));
 BA.debugLineNum = 157;BA.debugLine="p.Tag = contrat_tagcode";
Debug.ShouldStop(268435456);
_p.runMethod(false,"setTag",(_contrat_tagcode));
 BA.debugLineNum = 159;BA.debugLine="Return p";
Debug.ShouldStop(1073741824);
if (true) return _p;
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject __ref,RemoteObject _cnt,RemoteObject _colitems,RemoteObject _width,RemoteObject _height,RemoteObject _bd) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("createlistitem")) { return __ref.runUserSub(false, "structobjects","createlistitem", __ref, _cnt, _colitems, _width, _height, _bd);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _status_desc = RemoteObject.createImmutable("");
RemoteObject _status_color = RemoteObject.createImmutable("");
RemoteObject _local = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tagcode = RemoteObject.createImmutable("");
RemoteObject _latitude = RemoteObject.createImmutable("");
RemoteObject _longitude = RemoteObject.createImmutable("");
RemoteObject _status_id = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _entity = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _enttagcode = RemoteObject.createImmutable("");
RemoteObject _entity_name = RemoteObject.createImmutable("");
RemoteObject _stat = RemoteObject.createImmutable("");
Debug.locals.put("cnt", _cnt);
Debug.locals.put("colitems", _colitems);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
Debug.locals.put("bd", _bd);
 BA.debugLineNum = 69;BA.debugLine="Sub CreateListItem(cnt As Int, colitems As Map, Wi";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 71;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(64);
_p.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 72;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
Debug.ShouldStop(128);
__ref.getField(false,"_activityreference" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_width),(Object)(_height));
 BA.debugLineNum = 74;BA.debugLine="p.LoadLayout(\"objects_itemView2\")";
Debug.ShouldStop(512);
_p.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("objects_itemView2")),__ref.getField(false, "ba"));
 BA.debugLineNum = 75;BA.debugLine="p.RemoveView";
Debug.ShouldStop(1024);
_p.runVoidMethod ("RemoveView");
 BA.debugLineNum = 77;BA.debugLine="Dim status_desc As String = colitems.Get(\"status_";
Debug.ShouldStop(4096);
_status_desc = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_desc")))));Debug.locals.put("status_desc", _status_desc);Debug.locals.put("status_desc", _status_desc);
 BA.debugLineNum = 79;BA.debugLine="Dim status_color As String = colitems.Get(\"status";
Debug.ShouldStop(16384);
_status_color = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_color")))));Debug.locals.put("status_color", _status_color);Debug.locals.put("status_color", _status_color);
 BA.debugLineNum = 80;BA.debugLine="Dim local As Map = colitems.Get(\"local\")";
Debug.ShouldStop(32768);
_local = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_local = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("local")))));Debug.locals.put("local", _local);
 BA.debugLineNum = 81;BA.debugLine="Dim tagcode As String = local.Get(\"tagcode\")";
Debug.ShouldStop(65536);
_tagcode = BA.ObjectToString(_local.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 82;BA.debugLine="Dim latitude As String = local.Get(\"latitude\")";
Debug.ShouldStop(131072);
_latitude = BA.ObjectToString(_local.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("latitude")))));Debug.locals.put("latitude", _latitude);Debug.locals.put("latitude", _latitude);
 BA.debugLineNum = 83;BA.debugLine="Dim longitude As String = local.Get(\"longitude\")";
Debug.ShouldStop(262144);
_longitude = BA.ObjectToString(_local.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("longitude")))));Debug.locals.put("longitude", _longitude);Debug.locals.put("longitude", _longitude);
 BA.debugLineNum = 86;BA.debugLine="Dim status_id As Int = colitems.Get(\"status_id\")";
Debug.ShouldStop(2097152);
_status_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_id")))));Debug.locals.put("status_id", _status_id);Debug.locals.put("status_id", _status_id);
 BA.debugLineNum = 89;BA.debugLine="Dim tagcode As String = colitems.Get(\"tagcode\")";
Debug.ShouldStop(16777216);
_tagcode = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("tagcode", _tagcode);Debug.locals.put("tagcode", _tagcode);
 BA.debugLineNum = 90;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(33554432);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 95;BA.debugLine="Dim entity As Map = colitems.Get(\"entity\")";
Debug.ShouldStop(1073741824);
_entity = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_entity = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity")))));Debug.locals.put("entity", _entity);
 BA.debugLineNum = 96;BA.debugLine="Dim enttagcode As String = entity.Get(\"tagcode\")";
Debug.ShouldStop(-2147483648);
_enttagcode = BA.ObjectToString(_entity.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("tagcode")))));Debug.locals.put("enttagcode", _enttagcode);Debug.locals.put("enttagcode", _enttagcode);
 BA.debugLineNum = 97;BA.debugLine="Dim entity_name As String = entity.Get(\"entity_na";
Debug.ShouldStop(1);
_entity_name = BA.ObjectToString(_entity.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_name")))));Debug.locals.put("entity_name", _entity_name);Debug.locals.put("entity_name", _entity_name);
 BA.debugLineNum = 103;BA.debugLine="ListItemObject.text = $\"#${cnt} - ${name}\"$";
Debug.ShouldStop(64);
__ref.getField(false,"_listitemobject" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable("#"),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_cnt))),RemoteObject.createImmutable(" - "),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 104;BA.debugLine="Dim stat As String = $\"${status_desc}\"$";
Debug.ShouldStop(128);
_stat = (RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_status_desc))),RemoteObject.createImmutable("")));Debug.locals.put("stat", _stat);Debug.locals.put("stat", _stat);
 BA.debugLineNum = 107;BA.debugLine="ListItemReference.text = $\"${tagcode} - ${stat}\"$";
Debug.ShouldStop(1024);
__ref.getField(false,"_listitemreference" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tagcode))),RemoteObject.createImmutable(" - "),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stat))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 108;BA.debugLine="ListItemReference.Tag = tagcode";
Debug.ShouldStop(2048);
__ref.getField(false,"_listitemreference" /*RemoteObject*/ ).runMethod(false,"setTag",(_tagcode));
 BA.debugLineNum = 109;BA.debugLine="ListItemDescription.text = $\"${latitude} - ${long";
Debug.ShouldStop(4096);
__ref.getField(false,"_listitemdescription" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable(" - "),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 111;BA.debugLine="ListItemEntity.text = $\"${entity_name}\"$";
Debug.ShouldStop(16384);
__ref.getField(false,"_listitementity" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_entity_name))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 112;BA.debugLine="ListItemEntity.Tag = enttagcode";
Debug.ShouldStop(32768);
__ref.getField(false,"_listitementity" /*RemoteObject*/ ).runMethod(false,"setTag",(_enttagcode));
 BA.debugLineNum = 117;BA.debugLine="listButMap.Tag = $\"${latitude}|${longitude}\"$";
Debug.ShouldStop(1048576);
__ref.getField(false,"_listbutmap" /*RemoteObject*/ ).runMethod(false,"setTag",((RemoteObject.concat(RemoteObject.createImmutable(""),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_latitude))),RemoteObject.createImmutable("|"),structobjects.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_longitude))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 119;BA.debugLine="ListItemStatusPanel.Color = Utils.ColorString(sta";
Debug.ShouldStop(4194304);
__ref.getField(false,"_listitemstatuspanel" /*RemoteObject*/ ).runVoidMethod ("setColor",structobjects._utils.runMethod(true,"_colorstring" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_status_color)));
 BA.debugLineNum = 120;BA.debugLine="ListItemStatusPanel.Tag = status_id";
Debug.ShouldStop(8388608);
__ref.getField(false,"_listitemstatuspanel" /*RemoteObject*/ ).runMethod(false,"setTag",(_status_id));
 BA.debugLineNum = 127;BA.debugLine="p.Color = Colors.ARGB(255, 250,250,250)";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("setColor",structobjects.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 128;BA.debugLine="If (status_id = 0) Then p.Color = Colors.ARGB(255";
Debug.ShouldStop(-2147483648);
if ((RemoteObject.solveBoolean("=",_status_id,BA.numberCast(double.class, 0)))) { 
_p.runVoidMethod ("setColor",structobjects.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 197)),(Object)(BA.numberCast(int.class, 197)),(Object)(BA.numberCast(int.class, 197))));};
 BA.debugLineNum = 130;BA.debugLine="Return p";
Debug.ShouldStop(2);
if (true) return _p;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _lstobj) throws Exception{
try {
		Debug.PushSubsStack("Initialize (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "structobjects","initialize", __ref, _ba, _activity, _lstobj);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("lstobj", _lstobj);
 BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize(Activity As Activity, lstobj";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="ActivityReference = Activity";
Debug.ShouldStop(268435456);
__ref.setField ("_activityreference" /*RemoteObject*/ ,_activity);
 BA.debugLineNum = 30;BA.debugLine="If Not(listObjects.IsInitialized) Then listObject";
Debug.ShouldStop(536870912);
if (structobjects.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_listobjects" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_listobjects" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)((_activity.getObject())),(Object)(RemoteObject.createImmutable("listRecordsView")));};
 BA.debugLineNum = 31;BA.debugLine="listObjects = lstobj(0)";
Debug.ShouldStop(1073741824);
__ref.setField ("_listobjects" /*RemoteObject*/ ,_lstobj.getArrayElement(false,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 32;BA.debugLine="If Not(planObjectsList.IsInitialized) Then planOb";
Debug.ShouldStop(-2147483648);
if (structobjects.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_planobjectslist" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_planobjectslist" /*RemoteObject*/ ).runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)((_activity.getObject())),(Object)(RemoteObject.createImmutable("planObjectsList")));};
 BA.debugLineNum = 33;BA.debugLine="planObjectsList = lstobj(1)";
Debug.ShouldStop(1);
__ref.setField ("_planobjectslist" /*RemoteObject*/ ,_lstobj.getArrayElement(false,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 48;BA.debugLine="If Not(ObjectsList.IsInitialized) Then ObjectsLis";
Debug.ShouldStop(32768);
if (structobjects.__c.runMethod(true,"Not",(Object)(__ref.getField(false,"_objectslist" /*RemoteObject*/ ).runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_objectslist" /*RemoteObject*/ ).runVoidMethod ("Initialize");};
 BA.debugLineNum = 49;BA.debugLine="ItemsCounter = 0";
Debug.ShouldStop(65536);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ItemClick (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("itemclick")) { return __ref.runUserSub(false, "structobjects","itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 162;BA.debugLine="Public Sub ItemClick (Index As Int, Value As Objec";
Debug.ShouldStop(2);
 BA.debugLineNum = 166;BA.debugLine="Log(\"listRecordsView_ItemClick\")";
Debug.ShouldStop(32);
structobjects.__c.runVoidMethod ("LogImpl","6179437572",RemoteObject.createImmutable("listRecordsView_ItemClick"),0);
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutdocuments_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButDocuments_Click (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("listbutdocuments_click")) { return __ref.runUserSub(false, "structobjects","listbutdocuments_click", __ref);}
 BA.debugLineNum = 181;BA.debugLine="Sub listButDocuments_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Log(\"listButDocuments_Click\")";
Debug.ShouldStop(2097152);
structobjects.__c.runVoidMethod ("LogImpl","6179699713",RemoteObject.createImmutable("listButDocuments_Click"),0);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutmap_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButMap_Click (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("listbutmap_click")) { return __ref.runUserSub(false, "structobjects","listbutmap_click", __ref);}
 BA.debugLineNum = 177;BA.debugLine="Sub listButMap_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 178;BA.debugLine="Log(\"listButMap_Click\")";
Debug.ShouldStop(131072);
structobjects.__c.runVoidMethod ("LogImpl","6179634177",RemoteObject.createImmutable("listButMap_Click"),0);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutplanning_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButPlanning_Click (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("listbutplanning_click")) { return __ref.runUserSub(false, "structobjects","listbutplanning_click", __ref);}
 BA.debugLineNum = 173;BA.debugLine="Sub listButPlanning_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Log(\"listButPlanning_Click\")";
Debug.ShouldStop(8192);
structobjects.__c.runVoidMethod ("LogImpl","6179568641",RemoteObject.createImmutable("listButPlanning_Click"),0);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listbutproperties_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("listButProperties_Click (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("listbutproperties_click")) { return __ref.runUserSub(false, "structobjects","listbutproperties_click", __ref);}
 BA.debugLineNum = 169;BA.debugLine="Sub listButProperties_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 170;BA.debugLine="Log(\"listButProperties_Click\")";
Debug.ShouldStop(512);
structobjects.__c.runVoidMethod ("LogImpl","6179503105",RemoteObject.createImmutable("listButProperties_Click"),0);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _startobjects(RemoteObject __ref,RemoteObject _filearg) throws Exception{
try {
		Debug.PushSubsStack("StartObjects (structobjects) ","structobjects",56,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("startobjects")) { return __ref.runUserSub(false, "structobjects","startobjects", __ref, _filearg);}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _contrat_tagcode = RemoteObject.createImmutable("");
Debug.locals.put("FileArg", _filearg);
 BA.debugLineNum = 52;BA.debugLine="Public Sub StartObjects(FileArg As String)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Dim JSON As JSONParser";
Debug.ShouldStop(1048576);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 54;BA.debugLine="JSON.Initialize( Utils.LoadJSONFile(File.DirInter";
Debug.ShouldStop(2097152);
_json.runVoidMethod ("Initialize",(Object)(structobjects._utils.runMethod(true,"_loadjsonfile" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(structobjects.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(_filearg))));
 BA.debugLineNum = 55;BA.debugLine="Structures.MapObjects = JSON.NextObject";
Debug.ShouldStop(4194304);
structobjects._structures._mapobjects /*RemoteObject*/  = _json.runMethod(false,"NextObject");
 BA.debugLineNum = 56;BA.debugLine="Structures.Objects_Types = Structures.MapObjects.";
Debug.ShouldStop(8388608);
structobjects._structures._objects_types /*RemoteObject*/  = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), structobjects._structures._mapobjects /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("types")))));
 BA.debugLineNum = 58;BA.debugLine="ObjectsList = Structures.MapObjects.Get(\"items\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_objectslist" /*RemoteObject*/ ).setObject (structobjects._structures._mapobjects /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));
 BA.debugLineNum = 59;BA.debugLine="For Each colitems As Map In ObjectsList";
Debug.ShouldStop(67108864);
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group6 = __ref.getField(false,"_objectslist" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group6.runMethod(false,"Get",index6));
Debug.locals.put("colitems", _colitems);
 BA.debugLineNum = 60;BA.debugLine="ItemsCounter = ItemsCounter + 1";
Debug.ShouldStop(134217728);
__ref.setField ("_itemscounter" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_itemscounter" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 61;BA.debugLine="Dim contrat_tagcode As String = colitems.Get(\"co";
Debug.ShouldStop(268435456);
_contrat_tagcode = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contrat_tagcode")))));Debug.locals.put("contrat_tagcode", _contrat_tagcode);Debug.locals.put("contrat_tagcode", _contrat_tagcode);
 BA.debugLineNum = 62;BA.debugLine="listObjects.Add( CreateListItem(ItemsCounter, co";
Debug.ShouldStop(536870912);
__ref.getField(false,"_listobjects" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.structobjects.class, "_createlistitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_itemscounter" /*RemoteObject*/ )),(Object)(_colitems),(Object)(__ref.getField(false,"_listobjects" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(structobjects.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 65)))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), structobjects.__c.getField(false,"Null"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 63;BA.debugLine="If (contrat_tagcode <> \"\") Then";
Debug.ShouldStop(1073741824);
if ((RemoteObject.solveBoolean("!",_contrat_tagcode,RemoteObject.createImmutable("")))) { 
 BA.debugLineNum = 64;BA.debugLine="planObjectsList.Add( CreateListContractItem(Ite";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_planobjectslist" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (xevolution.vrcg.devdemov2400.structobjects.class, "_createlistcontractitem" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_itemscounter" /*RemoteObject*/ )),(Object)(_colitems),(Object)(__ref.getField(false,"_planobjectslist" /*RemoteObject*/ ).runMethod(false,"_asview").runMethod(true,"getWidth")),(Object)(structobjects.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 65)))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.BitmapDrawable"), structobjects.__c.getField(false,"Null"))).getObject()),(Object)((RemoteObject.createImmutable(""))));
 };
 }
}Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}