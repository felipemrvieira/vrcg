package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class structobjects extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "xevolution.vrcg.devdemov2400.structobjects");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", xevolution.vrcg.devdemov2400.structobjects.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _listitemreference = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemobject = null;
public anywheresoftware.b4a.objects.PanelWrapper _listitemstatuspanel = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemdescription = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutmap = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitementity = null;
public b4a.example3.customlistview _listobjects = null;
public int _itemscounter = 0;
public anywheresoftware.b4a.objects.collections.List _objectslist = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutdocuments = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutplanning = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemstatus = null;
public anywheresoftware.b4a.objects.ButtonWrapper _listbutproperties = null;
public anywheresoftware.b4a.objects.LabelWrapper _listitemtitle = null;
public b4a.example3.customlistview _planobjectslist = null;
public anywheresoftware.b4a.objects.ActivityWrapper _activityreference = null;
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
public String  _class_globals(xevolution.vrcg.devdemov2400.structobjects __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
RDebugUtils.currentLine=179109888;
 //BA.debugLineNum = 179109888;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=179109889;
 //BA.debugLineNum = 179109889;BA.debugLine="Private ListItemReference As Label";
_listitemreference = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=179109890;
 //BA.debugLineNum = 179109890;BA.debugLine="Private ListItemObject As Label";
_listitemobject = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=179109891;
 //BA.debugLineNum = 179109891;BA.debugLine="Private ListItemStatusPanel As Panel";
_listitemstatuspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=179109892;
 //BA.debugLineNum = 179109892;BA.debugLine="Private ListItemDescription As Label";
_listitemdescription = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=179109893;
 //BA.debugLineNum = 179109893;BA.debugLine="Private listButMap As Button";
_listbutmap = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=179109894;
 //BA.debugLineNum = 179109894;BA.debugLine="Private ListItemEntity As Label";
_listitementity = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=179109895;
 //BA.debugLineNum = 179109895;BA.debugLine="Private listObjects As CustomListView";
_listobjects = new b4a.example3.customlistview();
RDebugUtils.currentLine=179109897;
 //BA.debugLineNum = 179109897;BA.debugLine="Private ItemsCounter As Int = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=179109898;
 //BA.debugLineNum = 179109898;BA.debugLine="Public ObjectsList As List";
_objectslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=179109901;
 //BA.debugLineNum = 179109901;BA.debugLine="Private listButDocuments As Button";
_listbutdocuments = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=179109902;
 //BA.debugLineNum = 179109902;BA.debugLine="Private listButPlanning As Button";
_listbutplanning = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=179109903;
 //BA.debugLineNum = 179109903;BA.debugLine="Private ListItemStatus As Label";
_listitemstatus = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=179109904;
 //BA.debugLineNum = 179109904;BA.debugLine="Private listButProperties As Button";
_listbutproperties = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=179109905;
 //BA.debugLineNum = 179109905;BA.debugLine="Private ListItemTitle As Label";
_listitemtitle = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=179109906;
 //BA.debugLineNum = 179109906;BA.debugLine="Private planObjectsList As CustomListView";
_planobjectslist = new b4a.example3.customlistview();
RDebugUtils.currentLine=179109908;
 //BA.debugLineNum = 179109908;BA.debugLine="Private ItemsCounter As Int = 0";
_itemscounter = (int) (0);
RDebugUtils.currentLine=179109909;
 //BA.debugLineNum = 179109909;BA.debugLine="Public ObjectsList As List";
_objectslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=179109911;
 //BA.debugLineNum = 179109911;BA.debugLine="Private ActivityReference As Activity";
_activityreference = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=179109912;
 //BA.debugLineNum = 179109912;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createlistcontractitem(xevolution.vrcg.devdemov2400.structobjects __ref,int _cnt,anywheresoftware.b4a.objects.collections.Map _colitems,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "createlistcontractitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createlistcontractitem", new Object[] {_cnt,_colitems,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _tagcode = "";
String _name = "";
String _details = "";
anywheresoftware.b4a.objects.collections.Map _entity = null;
String _enttagcode = "";
String _entity_name = "";
String _contrat_tagcode = "";
RDebugUtils.currentLine=179372032;
 //BA.debugLineNum = 179372032;BA.debugLine="Sub CreateListContractItem(cnt As Int, colitems As";
RDebugUtils.currentLine=179372033;
 //BA.debugLineNum = 179372033;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=179372034;
 //BA.debugLineNum = 179372034;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=179372035;
 //BA.debugLineNum = 179372035;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=179372036;
 //BA.debugLineNum = 179372036;BA.debugLine="p.LoadLayout(\"objects_planItemView\")";
_p.LoadLayout("objects_planItemView",ba);
RDebugUtils.currentLine=179372037;
 //BA.debugLineNum = 179372037;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=179372039;
 //BA.debugLineNum = 179372039;BA.debugLine="Dim tagcode As String = colitems.Get(\"tagcode\")";
_tagcode = BA.ObjectToString(_colitems.Get((Object)("tagcode")));
RDebugUtils.currentLine=179372040;
 //BA.debugLineNum = 179372040;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=179372041;
 //BA.debugLineNum = 179372041;BA.debugLine="Dim details As String = colitems.Get(\"details\")";
_details = BA.ObjectToString(_colitems.Get((Object)("details")));
RDebugUtils.currentLine=179372043;
 //BA.debugLineNum = 179372043;BA.debugLine="Dim entity As Map = colitems.Get(\"entity\")";
_entity = new anywheresoftware.b4a.objects.collections.Map();
_entity = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_colitems.Get((Object)("entity"))));
RDebugUtils.currentLine=179372044;
 //BA.debugLineNum = 179372044;BA.debugLine="Dim enttagcode As String = entity.Get(\"tagcode\")";
_enttagcode = BA.ObjectToString(_entity.Get((Object)("tagcode")));
RDebugUtils.currentLine=179372045;
 //BA.debugLineNum = 179372045;BA.debugLine="Dim entity_name As String = entity.Get(\"entity_na";
_entity_name = BA.ObjectToString(_entity.Get((Object)("entity_name")));
RDebugUtils.currentLine=179372047;
 //BA.debugLineNum = 179372047;BA.debugLine="Dim contrat_tagcode As String = colitems.Get(\"con";
_contrat_tagcode = BA.ObjectToString(_colitems.Get((Object)("contrat_tagcode")));
RDebugUtils.currentLine=179372049;
 //BA.debugLineNum = 179372049;BA.debugLine="ListItemObject.text = $\"#${cnt} - ${name}\"$";
__ref._listitemobject /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(("#"+__c.SmartStringFormatter("",(Object)(_cnt))+" - "+__c.SmartStringFormatter("",(Object)(_name))+"")));
RDebugUtils.currentLine=179372050;
 //BA.debugLineNum = 179372050;BA.debugLine="ListItemObject.Tag = tagcode";
__ref._listitemobject /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=179372051;
 //BA.debugLineNum = 179372051;BA.debugLine="ListItemDescription.text = $\"${details}\"$";
__ref._listitemdescription /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_details))+"")));
RDebugUtils.currentLine=179372053;
 //BA.debugLineNum = 179372053;BA.debugLine="ListItemEntity.text = $\"${entity_name}\"$";
__ref._listitementity /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_entity_name))+"")));
RDebugUtils.currentLine=179372054;
 //BA.debugLineNum = 179372054;BA.debugLine="ListItemEntity.Tag = enttagcode";
__ref._listitementity /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_enttagcode));
RDebugUtils.currentLine=179372056;
 //BA.debugLineNum = 179372056;BA.debugLine="p.Tag = contrat_tagcode";
_p.setTag((Object)(_contrat_tagcode));
RDebugUtils.currentLine=179372058;
 //BA.debugLineNum = 179372058;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=179372059;
 //BA.debugLineNum = 179372059;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createlistitem(xevolution.vrcg.devdemov2400.structobjects __ref,int _cnt,anywheresoftware.b4a.objects.collections.Map _colitems,int _width,int _height,anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "createlistitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createlistitem", new Object[] {_cnt,_colitems,_width,_height,_bd}));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
String _status_desc = "";
String _status_color = "";
anywheresoftware.b4a.objects.collections.Map _local = null;
String _tagcode = "";
String _latitude = "";
String _longitude = "";
int _status_id = 0;
String _name = "";
anywheresoftware.b4a.objects.collections.Map _entity = null;
String _enttagcode = "";
String _entity_name = "";
String _stat = "";
RDebugUtils.currentLine=179306496;
 //BA.debugLineNum = 179306496;BA.debugLine="Sub CreateListItem(cnt As Int, colitems As Map, Wi";
RDebugUtils.currentLine=179306497;
 //BA.debugLineNum = 179306497;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=179306498;
 //BA.debugLineNum = 179306498;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=179306499;
 //BA.debugLineNum = 179306499;BA.debugLine="ActivityReference.AddView(p, 0, 0, Width, Height)";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),_width,_height);
RDebugUtils.currentLine=179306501;
 //BA.debugLineNum = 179306501;BA.debugLine="p.LoadLayout(\"objects_itemView2\")";
_p.LoadLayout("objects_itemView2",ba);
RDebugUtils.currentLine=179306502;
 //BA.debugLineNum = 179306502;BA.debugLine="p.RemoveView";
_p.RemoveView();
RDebugUtils.currentLine=179306504;
 //BA.debugLineNum = 179306504;BA.debugLine="Dim status_desc As String = colitems.Get(\"status_";
_status_desc = BA.ObjectToString(_colitems.Get((Object)("status_desc")));
RDebugUtils.currentLine=179306506;
 //BA.debugLineNum = 179306506;BA.debugLine="Dim status_color As String = colitems.Get(\"status";
_status_color = BA.ObjectToString(_colitems.Get((Object)("status_color")));
RDebugUtils.currentLine=179306507;
 //BA.debugLineNum = 179306507;BA.debugLine="Dim local As Map = colitems.Get(\"local\")";
_local = new anywheresoftware.b4a.objects.collections.Map();
_local = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_colitems.Get((Object)("local"))));
RDebugUtils.currentLine=179306508;
 //BA.debugLineNum = 179306508;BA.debugLine="Dim tagcode As String = local.Get(\"tagcode\")";
_tagcode = BA.ObjectToString(_local.Get((Object)("tagcode")));
RDebugUtils.currentLine=179306509;
 //BA.debugLineNum = 179306509;BA.debugLine="Dim latitude As String = local.Get(\"latitude\")";
_latitude = BA.ObjectToString(_local.Get((Object)("latitude")));
RDebugUtils.currentLine=179306510;
 //BA.debugLineNum = 179306510;BA.debugLine="Dim longitude As String = local.Get(\"longitude\")";
_longitude = BA.ObjectToString(_local.Get((Object)("longitude")));
RDebugUtils.currentLine=179306513;
 //BA.debugLineNum = 179306513;BA.debugLine="Dim status_id As Int = colitems.Get(\"status_id\")";
_status_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("status_id"))));
RDebugUtils.currentLine=179306516;
 //BA.debugLineNum = 179306516;BA.debugLine="Dim tagcode As String = colitems.Get(\"tagcode\")";
_tagcode = BA.ObjectToString(_colitems.Get((Object)("tagcode")));
RDebugUtils.currentLine=179306517;
 //BA.debugLineNum = 179306517;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=179306522;
 //BA.debugLineNum = 179306522;BA.debugLine="Dim entity As Map = colitems.Get(\"entity\")";
_entity = new anywheresoftware.b4a.objects.collections.Map();
_entity = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_colitems.Get((Object)("entity"))));
RDebugUtils.currentLine=179306523;
 //BA.debugLineNum = 179306523;BA.debugLine="Dim enttagcode As String = entity.Get(\"tagcode\")";
_enttagcode = BA.ObjectToString(_entity.Get((Object)("tagcode")));
RDebugUtils.currentLine=179306524;
 //BA.debugLineNum = 179306524;BA.debugLine="Dim entity_name As String = entity.Get(\"entity_na";
_entity_name = BA.ObjectToString(_entity.Get((Object)("entity_name")));
RDebugUtils.currentLine=179306530;
 //BA.debugLineNum = 179306530;BA.debugLine="ListItemObject.text = $\"#${cnt} - ${name}\"$";
__ref._listitemobject /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(("#"+__c.SmartStringFormatter("",(Object)(_cnt))+" - "+__c.SmartStringFormatter("",(Object)(_name))+"")));
RDebugUtils.currentLine=179306531;
 //BA.debugLineNum = 179306531;BA.debugLine="Dim stat As String = $\"${status_desc}\"$";
_stat = (""+__c.SmartStringFormatter("",(Object)(_status_desc))+"");
RDebugUtils.currentLine=179306534;
 //BA.debugLineNum = 179306534;BA.debugLine="ListItemReference.text = $\"${tagcode} - ${stat}\"$";
__ref._listitemreference /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_tagcode))+" - "+__c.SmartStringFormatter("",(Object)(_stat))+"")));
RDebugUtils.currentLine=179306535;
 //BA.debugLineNum = 179306535;BA.debugLine="ListItemReference.Tag = tagcode";
__ref._listitemreference /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_tagcode));
RDebugUtils.currentLine=179306536;
 //BA.debugLineNum = 179306536;BA.debugLine="ListItemDescription.text = $\"${latitude} - ${long";
__ref._listitemdescription /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_latitude))+" - "+__c.SmartStringFormatter("",(Object)(_longitude))+"")));
RDebugUtils.currentLine=179306538;
 //BA.debugLineNum = 179306538;BA.debugLine="ListItemEntity.text = $\"${entity_name}\"$";
__ref._listitementity /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence((""+__c.SmartStringFormatter("",(Object)(_entity_name))+"")));
RDebugUtils.currentLine=179306539;
 //BA.debugLineNum = 179306539;BA.debugLine="ListItemEntity.Tag = enttagcode";
__ref._listitementity /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_enttagcode));
RDebugUtils.currentLine=179306544;
 //BA.debugLineNum = 179306544;BA.debugLine="listButMap.Tag = $\"${latitude}|${longitude}\"$";
__ref._listbutmap /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTag((Object)((""+__c.SmartStringFormatter("",(Object)(_latitude))+"|"+__c.SmartStringFormatter("",(Object)(_longitude))+"")));
RDebugUtils.currentLine=179306546;
 //BA.debugLineNum = 179306546;BA.debugLine="ListItemStatusPanel.Color = Utils.ColorString(sta";
__ref._listitemstatuspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(_utils._colorstring /*int*/ (ba,_status_color));
RDebugUtils.currentLine=179306547;
 //BA.debugLineNum = 179306547;BA.debugLine="ListItemStatusPanel.Tag = status_id";
__ref._listitemstatuspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)(_status_id));
RDebugUtils.currentLine=179306554;
 //BA.debugLineNum = 179306554;BA.debugLine="p.Color = Colors.ARGB(255, 250,250,250)";
_p.setColor(__c.Colors.ARGB((int) (255),(int) (250),(int) (250),(int) (250)));
RDebugUtils.currentLine=179306555;
 //BA.debugLineNum = 179306555;BA.debugLine="If (status_id = 0) Then p.Color = Colors.ARGB(255";
if ((_status_id==0)) { 
_p.setColor(__c.Colors.ARGB((int) (255),(int) (197),(int) (197),(int) (197)));};
RDebugUtils.currentLine=179306557;
 //BA.debugLineNum = 179306557;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=179306558;
 //BA.debugLineNum = 179306558;BA.debugLine="End Sub";
return null;
}
public String  _initialize(xevolution.vrcg.devdemov2400.structobjects __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,b4a.example3.customlistview[] _lstobj) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_lstobj}));}
RDebugUtils.currentLine=179175424;
 //BA.debugLineNum = 179175424;BA.debugLine="Public Sub Initialize(Activity As Activity, lstobj";
RDebugUtils.currentLine=179175425;
 //BA.debugLineNum = 179175425;BA.debugLine="ActivityReference = Activity";
__ref._activityreference /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=179175426;
 //BA.debugLineNum = 179175426;BA.debugLine="If Not(listObjects.IsInitialized) Then listObject";
if (__c.Not(__ref._listobjects /*b4a.example3.customlistview*/ .IsInitialized())) { 
__ref._listobjects /*b4a.example3.customlistview*/ ._initialize(ba,(Object)(_activity.getObject()),"listRecordsView");};
RDebugUtils.currentLine=179175427;
 //BA.debugLineNum = 179175427;BA.debugLine="listObjects = lstobj(0)";
__ref._listobjects /*b4a.example3.customlistview*/  = _lstobj[(int) (0)];
RDebugUtils.currentLine=179175428;
 //BA.debugLineNum = 179175428;BA.debugLine="If Not(planObjectsList.IsInitialized) Then planOb";
if (__c.Not(__ref._planobjectslist /*b4a.example3.customlistview*/ .IsInitialized())) { 
__ref._planobjectslist /*b4a.example3.customlistview*/ ._initialize(ba,(Object)(_activity.getObject()),"planObjectsList");};
RDebugUtils.currentLine=179175429;
 //BA.debugLineNum = 179175429;BA.debugLine="planObjectsList = lstobj(1)";
__ref._planobjectslist /*b4a.example3.customlistview*/  = _lstobj[(int) (1)];
RDebugUtils.currentLine=179175444;
 //BA.debugLineNum = 179175444;BA.debugLine="If Not(ObjectsList.IsInitialized) Then ObjectsLis";
if (__c.Not(__ref._objectslist /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized())) { 
__ref._objectslist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();};
RDebugUtils.currentLine=179175445;
 //BA.debugLineNum = 179175445;BA.debugLine="ItemsCounter = 0";
__ref._itemscounter /*int*/  = (int) (0);
RDebugUtils.currentLine=179175446;
 //BA.debugLineNum = 179175446;BA.debugLine="End Sub";
return "";
}
public String  _itemclick(xevolution.vrcg.devdemov2400.structobjects __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "itemclick", false))
	 {return ((String) Debug.delegate(ba, "itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=179437568;
 //BA.debugLineNum = 179437568;BA.debugLine="Public Sub ItemClick (Index As Int, Value As Objec";
RDebugUtils.currentLine=179437572;
 //BA.debugLineNum = 179437572;BA.debugLine="Log(\"listRecordsView_ItemClick\")";
__c.LogImpl("6179437572","listRecordsView_ItemClick",0);
RDebugUtils.currentLine=179437573;
 //BA.debugLineNum = 179437573;BA.debugLine="End Sub";
return "";
}
public String  _listbutdocuments_click(xevolution.vrcg.devdemov2400.structobjects __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "listbutdocuments_click", false))
	 {return ((String) Debug.delegate(ba, "listbutdocuments_click", null));}
RDebugUtils.currentLine=179699712;
 //BA.debugLineNum = 179699712;BA.debugLine="Sub listButDocuments_Click";
RDebugUtils.currentLine=179699713;
 //BA.debugLineNum = 179699713;BA.debugLine="Log(\"listButDocuments_Click\")";
__c.LogImpl("6179699713","listButDocuments_Click",0);
RDebugUtils.currentLine=179699714;
 //BA.debugLineNum = 179699714;BA.debugLine="End Sub";
return "";
}
public String  _listbutmap_click(xevolution.vrcg.devdemov2400.structobjects __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "listbutmap_click", false))
	 {return ((String) Debug.delegate(ba, "listbutmap_click", null));}
RDebugUtils.currentLine=179634176;
 //BA.debugLineNum = 179634176;BA.debugLine="Sub listButMap_Click";
RDebugUtils.currentLine=179634177;
 //BA.debugLineNum = 179634177;BA.debugLine="Log(\"listButMap_Click\")";
__c.LogImpl("6179634177","listButMap_Click",0);
RDebugUtils.currentLine=179634178;
 //BA.debugLineNum = 179634178;BA.debugLine="End Sub";
return "";
}
public String  _listbutplanning_click(xevolution.vrcg.devdemov2400.structobjects __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "listbutplanning_click", false))
	 {return ((String) Debug.delegate(ba, "listbutplanning_click", null));}
RDebugUtils.currentLine=179568640;
 //BA.debugLineNum = 179568640;BA.debugLine="Sub listButPlanning_Click";
RDebugUtils.currentLine=179568641;
 //BA.debugLineNum = 179568641;BA.debugLine="Log(\"listButPlanning_Click\")";
__c.LogImpl("6179568641","listButPlanning_Click",0);
RDebugUtils.currentLine=179568642;
 //BA.debugLineNum = 179568642;BA.debugLine="End Sub";
return "";
}
public String  _listbutproperties_click(xevolution.vrcg.devdemov2400.structobjects __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "listbutproperties_click", false))
	 {return ((String) Debug.delegate(ba, "listbutproperties_click", null));}
RDebugUtils.currentLine=179503104;
 //BA.debugLineNum = 179503104;BA.debugLine="Sub listButProperties_Click";
RDebugUtils.currentLine=179503105;
 //BA.debugLineNum = 179503105;BA.debugLine="Log(\"listButProperties_Click\")";
__c.LogImpl("6179503105","listButProperties_Click",0);
RDebugUtils.currentLine=179503106;
 //BA.debugLineNum = 179503106;BA.debugLine="End Sub";
return "";
}
public String  _startobjects(xevolution.vrcg.devdemov2400.structobjects __ref,String _filearg) throws Exception{
__ref = this;
RDebugUtils.currentModule="structobjects";
if (Debug.shouldDelegate(ba, "startobjects", false))
	 {return ((String) Debug.delegate(ba, "startobjects", new Object[] {_filearg}));}
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
String _contrat_tagcode = "";
RDebugUtils.currentLine=179240960;
 //BA.debugLineNum = 179240960;BA.debugLine="Public Sub StartObjects(FileArg As String)";
RDebugUtils.currentLine=179240961;
 //BA.debugLineNum = 179240961;BA.debugLine="Dim JSON As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=179240962;
 //BA.debugLineNum = 179240962;BA.debugLine="JSON.Initialize( Utils.LoadJSONFile(File.DirInter";
_json.Initialize(_utils._loadjsonfile /*String*/ (ba,__c.File.getDirInternal(),_filearg));
RDebugUtils.currentLine=179240963;
 //BA.debugLineNum = 179240963;BA.debugLine="Structures.MapObjects = JSON.NextObject";
_structures._mapobjects /*anywheresoftware.b4a.objects.collections.Map*/  = _json.NextObject();
RDebugUtils.currentLine=179240964;
 //BA.debugLineNum = 179240964;BA.debugLine="Structures.Objects_Types = Structures.MapObjects.";
_structures._objects_types /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_structures._mapobjects /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("types"))));
RDebugUtils.currentLine=179240966;
 //BA.debugLineNum = 179240966;BA.debugLine="ObjectsList = Structures.MapObjects.Get(\"items\")";
__ref._objectslist /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_structures._mapobjects /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("items"))));
RDebugUtils.currentLine=179240967;
 //BA.debugLineNum = 179240967;BA.debugLine="For Each colitems As Map In ObjectsList";
_colitems = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._objectslist /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(group6.Get(index6)));
RDebugUtils.currentLine=179240968;
 //BA.debugLineNum = 179240968;BA.debugLine="ItemsCounter = ItemsCounter + 1";
__ref._itemscounter /*int*/  = (int) (__ref._itemscounter /*int*/ +1);
RDebugUtils.currentLine=179240969;
 //BA.debugLineNum = 179240969;BA.debugLine="Dim contrat_tagcode As String = colitems.Get(\"co";
_contrat_tagcode = BA.ObjectToString(_colitems.Get((Object)("contrat_tagcode")));
RDebugUtils.currentLine=179240970;
 //BA.debugLineNum = 179240970;BA.debugLine="listObjects.Add( CreateListItem(ItemsCounter, co";
__ref._listobjects /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createlistitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._itemscounter /*int*/ ,_colitems,__ref._listobjects /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (65)),(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(__c.Null))).getObject())),(Object)(""));
RDebugUtils.currentLine=179240971;
 //BA.debugLineNum = 179240971;BA.debugLine="If (contrat_tagcode <> \"\") Then";
if (((_contrat_tagcode).equals("") == false)) { 
RDebugUtils.currentLine=179240972;
 //BA.debugLineNum = 179240972;BA.debugLine="planObjectsList.Add( CreateListContractItem(Ite";
__ref._planobjectslist /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createlistcontractitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,__ref._itemscounter /*int*/ ,_colitems,__ref._planobjectslist /*b4a.example3.customlistview*/ ._asview().getWidth(),__c.DipToCurrent((int) (65)),(anywheresoftware.b4a.objects.drawable.BitmapDrawable) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.BitmapDrawable(), (android.graphics.drawable.BitmapDrawable)(__c.Null))).getObject())),(Object)(""));
 };
 }
};
RDebugUtils.currentLine=179240975;
 //BA.debugLineNum = 179240975;BA.debugLine="End Sub";
return "";
}
}