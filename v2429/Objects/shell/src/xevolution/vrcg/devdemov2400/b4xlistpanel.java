
package xevolution.vrcg.devdemov2400;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xlistpanel {
    public static RemoteObject myClass;
	public b4xlistpanel() {
	}
    public static PCBA staticBA = new PCBA(null, b4xlistpanel.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _mleft = RemoteObject.createImmutable(0);
public static RemoteObject _mtop = RemoteObject.createImmutable(0);
public static RemoteObject _mwidth = RemoteObject.createImmutable(0);
public static RemoteObject _mheight = RemoteObject.createImmutable(0);
public static RemoteObject _mradius = RemoteObject.createImmutable(0);
public static RemoteObject _isgroup = RemoteObject.createImmutable(false);
public static RemoteObject _issubgroup = RemoteObject.createImmutable(false);
public static RemoteObject _isactive = RemoteObject.createImmutable(false);
public static RemoteObject _isvisible = RemoteObject.createImmutable(false);
public static RemoteObject _isexpanded = RemoteObject.createImmutable(false);
public static RemoteObject _isreadonly = RemoteObject.createImmutable(false);
public static RemoteObject _isrepeated = RemoteObject.createImmutable(false);
public static RemoteObject _mid = RemoteObject.createImmutable(0);
public static RemoteObject _mgroup = RemoteObject.createImmutable(0);
public static RemoteObject _msubgroup = RemoteObject.createImmutable(0);
public static RemoteObject _mlevel = RemoteObject.createImmutable(0);
public static RemoteObject _mposition = RemoteObject.createImmutable(0);
public static RemoteObject _mrepeatcount = RemoteObject.createImmutable(0);
public static RemoteObject _mrepeatitemcount = RemoteObject.createImmutable(0);
public static RemoteObject _mrepeatfieldcount = RemoteObject.createImmutable(0);
public static RemoteObject _mbulletmaster = RemoteObject.createImmutable(0);
public static RemoteObject _mbulletchild = RemoteObject.createImmutable(0);
public static RemoteObject _mbulletinner = RemoteObject.createImmutable(0);
public static RemoteObject _mbulletlevel = RemoteObject.createImmutable(0);
public static RemoteObject _mcodeid = RemoteObject.createImmutable(0);
public static RemoteObject _reference = RemoteObject.createImmutable("");
public static RemoteObject _tagcode1 = RemoteObject.createImmutable("");
public static RemoteObject _tagcode2 = RemoteObject.createImmutable("");
public static RemoteObject _tagcode3 = RemoteObject.createImmutable("");
public static RemoteObject _tagcode4 = RemoteObject.createImmutable("");
public static RemoteObject _tagcode5 = RemoteObject.createImmutable("");
public static RemoteObject _tagcode6 = RemoteObject.createImmutable("");
public static RemoteObject _tagcode7 = RemoteObject.createImmutable("");
public static RemoteObject _value = RemoteObject.createImmutable("");
public static RemoteObject _mlastvalue = RemoteObject.createImmutable("");
public static RemoteObject _allowclick = RemoteObject.createImmutable(false);
public static RemoteObject _allowhide = RemoteObject.createImmutable(false);
public static RemoteObject _other = RemoteObject.declareNull("Object");
public static RemoteObject _mstate = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static RemoteObject _encoding = RemoteObject.declareNull("b4a.example.encoding");
public static RemoteObject _esc_pos = RemoteObject.declareNull("b4a.example.esc_pos");
public static xevolution.vrcg.devdemov2400.main _main = null;
public static xevolution.vrcg.devdemov2400.starter _starter = null;
public static xevolution.vrcg.devdemov2400.comms _comms = null;
public static xevolution.vrcg.devdemov2400.utils _utils = null;
public static xevolution.vrcg.devdemov2400.dbstructures _dbstructures = null;
public static xevolution.vrcg.devdemov2400.sharecode _sharecode = null;
public static xevolution.vrcg.devdemov2400.mainmenu _mainmenu = null;
public static xevolution.vrcg.devdemov2400.imageedit _imageedit = null;
public static xevolution.vrcg.devdemov2400.checklist3 _checklist3 = null;
public static xevolution.vrcg.devdemov2400.locationservice _locationservice = null;
public static xevolution.vrcg.devdemov2400.dataupdate _dataupdate = null;
public static xevolution.vrcg.devdemov2400.alerts _alerts = null;
public static xevolution.vrcg.devdemov2400.backgroundupdateservice _backgroundupdateservice = null;
public static xevolution.vrcg.devdemov2400.barcodescanner _barcodescanner = null;
public static xevolution.vrcg.devdemov2400.cameraactivity _cameraactivity = null;
public static xevolution.vrcg.devdemov2400.cameraactivity_innershot _cameraactivity_innershot = null;
public static xevolution.vrcg.devdemov2400.cameraactivity2 _cameraactivity2 = null;
public static xevolution.vrcg.devdemov2400.checklistnew _checklistnew = null;
public static xevolution.vrcg.devdemov2400.common _common = null;
public static xevolution.vrcg.devdemov2400.consts _consts = null;
public static xevolution.vrcg.devdemov2400.dbutils _dbutils = null;
public static xevolution.vrcg.devdemov2400.helpdescriptors _helpdescriptors = null;
public static xevolution.vrcg.devdemov2400.logs _logs = null;
public static xevolution.vrcg.devdemov2400.mapsactivity _mapsactivity = null;
public static xevolution.vrcg.devdemov2400.newsync _newsync = null;
public static xevolution.vrcg.devdemov2400.notas _notas = null;
public static xevolution.vrcg.devdemov2400.objectedit _objectedit = null;
public static xevolution.vrcg.devdemov2400.objects _objects = null;
public static xevolution.vrcg.devdemov2400.report _report = null;
public static xevolution.vrcg.devdemov2400.reportview _reportview = null;
public static xevolution.vrcg.devdemov2400.requests3 _requests3 = null;
public static xevolution.vrcg.devdemov2400.signaturecapture _signaturecapture = null;
public static xevolution.vrcg.devdemov2400.structures _structures = null;
public static xevolution.vrcg.devdemov2400.taskscl2 _taskscl2 = null;
public static xevolution.vrcg.devdemov2400.types _types = null;
public static xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public static xevolution.vrcg.devdemov2400.user _user = null;
public static xevolution.vrcg.devdemov2400.userservice _userservice = null;
public static xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public static xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AllowClick",_ref.getField(false, "_allowclick"),"AllowHide",_ref.getField(false, "_allowhide"),"DateUtils",_ref.getField(false, "_dateutils"),"Encoding",_ref.getField(false, "_encoding"),"ESC_POS",_ref.getField(false, "_esc_pos"),"IsActive",_ref.getField(false, "_isactive"),"IsExpanded",_ref.getField(false, "_isexpanded"),"IsGroup",_ref.getField(false, "_isgroup"),"IsReadOnly",_ref.getField(false, "_isreadonly"),"IsRepeated",_ref.getField(false, "_isrepeated"),"IsSubGroup",_ref.getField(false, "_issubgroup"),"IsVisible",_ref.getField(false, "_isvisible"),"mBase",_ref.getField(false, "_mbase"),"mBulletChild",_ref.getField(false, "_mbulletchild"),"mBulletInner",_ref.getField(false, "_mbulletinner"),"mBulletLevel",_ref.getField(false, "_mbulletlevel"),"mBulletMaster",_ref.getField(false, "_mbulletmaster"),"mCallBack",_ref.getField(false, "_mcallback"),"mCodeId",_ref.getField(false, "_mcodeid"),"mEventName",_ref.getField(false, "_meventname"),"mGroup",_ref.getField(false, "_mgroup"),"mHeight",_ref.getField(false, "_mheight"),"mID",_ref.getField(false, "_mid"),"mLastValue",_ref.getField(false, "_mlastvalue"),"mLeft",_ref.getField(false, "_mleft"),"mLevel",_ref.getField(false, "_mlevel"),"mPosition",_ref.getField(false, "_mposition"),"mRadius",_ref.getField(false, "_mradius"),"mRepeatCount",_ref.getField(false, "_mrepeatcount"),"mRepeatFieldCount",_ref.getField(false, "_mrepeatfieldcount"),"mRepeatItemCount",_ref.getField(false, "_mrepeatitemcount"),"mState",_ref.getField(false, "_mstate"),"mSubGroup",_ref.getField(false, "_msubgroup"),"mTop",_ref.getField(false, "_mtop"),"mWidth",_ref.getField(false, "_mwidth"),"Other",_ref.getField(false, "_other"),"Reference",_ref.getField(false, "_reference"),"Tag",_ref.getField(false, "_tag"),"Tagcode1",_ref.getField(false, "_tagcode1"),"Tagcode2",_ref.getField(false, "_tagcode2"),"Tagcode3",_ref.getField(false, "_tagcode3"),"Tagcode4",_ref.getField(false, "_tagcode4"),"Tagcode5",_ref.getField(false, "_tagcode5"),"Tagcode6",_ref.getField(false, "_tagcode6"),"Tagcode7",_ref.getField(false, "_tagcode7"),"Value",_ref.getField(false, "_value"),"xui",_ref.getField(false, "_xui")};
}
}