package xevolution.vrcg.devdemov2400;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public static class _rowpanelinfo{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.PanelWrapper Pan;
public int Height;
public void Initialize() {
IsInitialized = true;
Pan = new anywheresoftware.b4a.objects.PanelWrapper();
Height = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _chapterrow{
public boolean IsInitialized;
public int ID;
public String ItemTagcode;
public anywheresoftware.b4a.objects.PanelWrapper RootPanel;
public anywheresoftware.b4a.objects.PanelWrapper PanelExpanded;
public boolean ReadOnly;
public boolean CanExpand;
public boolean ItemsLoaded;
public boolean ReloadItems;
public void Initialize() {
IsInitialized = true;
ID = 0;
ItemTagcode = "";
RootPanel = new anywheresoftware.b4a.objects.PanelWrapper();
PanelExpanded = new anywheresoftware.b4a.objects.PanelWrapper();
ReadOnly = false;
CanExpand = false;
ItemsLoaded = false;
ReloadItems = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _returnfielddata{
public boolean IsInitialized;
public String item_tagcode;
public String field_value;
public void Initialize() {
IsInitialized = true;
item_tagcode = "";
field_value = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _filedownloadinformation{
public boolean IsInitialized;
public boolean Downloaded;
public String DownloadFilename;
public int Status;
public void Initialize() {
IsInitialized = true;
Downloaded = false;
DownloadFilename = "";
Status = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _createrequestreturn{
public boolean IsInitialized;
public String RequestTagcode;
public int Status;
public int Stage;
public void Initialize() {
IsInitialized = true;
RequestTagcode = "";
Status = 0;
Stage = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _otherreturnvalues{
public boolean IsInitialized;
public String RetValue;
public boolean RetSave;
public String RetTag;
public void Initialize() {
IsInitialized = true;
RetValue = "";
RetSave = false;
RetTag = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _mandatoryrecords{
public boolean IsInitialized;
public String item_tagcode;
public int mandatory;
public int bullet_master;
public int bullet_child;
public boolean Enabled;
public boolean value_in;
public void Initialize() {
IsInitialized = true;
item_tagcode = "";
mandatory = 0;
bullet_master = 0;
bullet_child = 0;
Enabled = false;
value_in = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _componentrecords{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper component;
public int idgroup;
public String item_tagcode;
public int Height;
public int RepeatItemCounter;
public int RepeatFieldCounter;
public boolean Enabled;
public void Initialize() {
IsInitialized = true;
component = new anywheresoftware.b4a.objects.B4XViewWrapper();
idgroup = 0;
item_tagcode = "";
Height = 0;
RepeatItemCounter = 0;
RepeatFieldCounter = 0;
Enabled = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xsrecords{
public boolean IsInitialized;
public xevolution.vrcg.devdemov2400.b4xstatebutton component;
public int idgroup;
public int iditem;
public String item_tagcode;
public boolean Enabled;
public String answer_tagcode;
public void Initialize() {
IsInitialized = true;
component = new xevolution.vrcg.devdemov2400.b4xstatebutton();
idgroup = 0;
iditem = 0;
item_tagcode = "";
Enabled = false;
answer_tagcode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _fieldreference{
public boolean IsInitialized;
public String tagname;
public anywheresoftware.b4a.objects.B4XViewWrapper tagobject;
public int FieldCounter;
public void Initialize() {
IsInitialized = true;
tagname = "";
tagobject = new anywheresoftware.b4a.objects.B4XViewWrapper();
FieldCounter = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _externaldocsinfo{
public boolean IsInitialized;
public int status;
public String refdoc;
public String refnumber;
public String typeDoc;
public String externalID;
public void Initialize() {
IsInitialized = true;
status = 0;
refdoc = "";
refnumber = "";
typeDoc = "";
externalID = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _runtypeaction{
public boolean IsInitialized;
public String tagcode;
public String title;
public void Initialize() {
IsInitialized = true;
tagcode = "";
title = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _newobjecttags{
public boolean IsInitialized;
public String ObjectTag;
public String AddressTag;
public String ContactTag;
public anywheresoftware.b4a.objects.collections.List FieldsTag;
public void Initialize() {
IsInitialized = true;
ObjectTag = "";
AddressTag = "";
ContactTag = "";
FieldsTag = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _mnowtu{
public boolean IsInitialized;
public int MAKE_New_Object;
public int UPD_Existing_Object;
public int WHERE_To_Update;
public int cl_is_father;
public int RequestTypeGroup;
public String objectTagValue;
public String object_type;
public String objectTagRelValue;
public String object_type_rel;
public String RealObjectRelationToChange;
public String RealObjectToChange;
public xevolution.vrcg.devdemov2400.types._newobjecttags ResInsert;
public void Initialize() {
IsInitialized = true;
MAKE_New_Object = 0;
UPD_Existing_Object = 0;
WHERE_To_Update = 0;
cl_is_father = 0;
RequestTypeGroup = 0;
objectTagValue = "";
object_type = "";
objectTagRelValue = "";
object_type_rel = "";
RealObjectRelationToChange = "";
RealObjectToChange = "";
ResInsert = new xevolution.vrcg.devdemov2400.types._newobjecttags();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _shotfoto{
public boolean IsInitialized;
public String FileName;
public String DateNTime;
public String Latitude;
public String Longitude;
public String Title;
public void Initialize() {
IsInitialized = true;
FileName = "";
DateNTime = "";
Latitude = "";
Longitude = "";
Title = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _statusfiltertask{
public boolean IsInitialized;
public boolean active;
public boolean inactive;
public boolean singular;
public boolean plural;
public void Initialize() {
IsInitialized = true;
active = false;
inactive = false;
singular = false;
plural = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _triplevalues{
public boolean IsInitialized;
public String value1;
public String value2;
public String value3;
public void Initialize() {
IsInitialized = true;
value1 = "";
value2 = "";
value3 = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _markerinfo{
public boolean IsInitialized;
public String Latitude;
public String Longitude;
public anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper MarkerPoint;
public void Initialize() {
IsInitialized = true;
Latitude = "";
Longitude = "";
MarkerPoint = new anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pievaluestype{
public boolean IsInitialized;
public String Name;
public int Value;
public int Color;
public void Initialize() {
IsInitialized = true;
Name = "";
Value = 0;
Color = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _claievent{
public boolean IsInitialized;
public String event_tagcode;
public int position;
public int type_item;
public int active;
public String value;
public String formula;
public int have_formula;
public int have_condition;
public int have_status;
public int is_jump;
public int is_status;
public int is_alert;
public int is_email;
public int is_more;
public int is_foto;
public int is_action;
public int inc_object_contacts;
public String team_tagcode;
public String email_to;
public String email_cc;
public int use_internal_image;
public String default_typerequest;
public String resobsgrp_tagcode;
public int add_entity_email;
public int add_object_email;
public int request_signature;
public void Initialize() {
IsInitialized = true;
event_tagcode = "";
position = 0;
type_item = 0;
active = 0;
value = "";
formula = "";
have_formula = 0;
have_condition = 0;
have_status = 0;
is_jump = 0;
is_status = 0;
is_alert = 0;
is_email = 0;
is_more = 0;
is_foto = 0;
is_action = 0;
inc_object_contacts = 0;
team_tagcode = "";
email_to = "";
email_cc = "";
use_internal_image = 0;
default_typerequest = "";
resobsgrp_tagcode = "";
add_entity_email = 0;
add_object_email = 0;
request_signature = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _intent{
public boolean IsInitialized;
public String name;
public void Initialize() {
IsInitialized = true;
name = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pointapi{
public boolean IsInitialized;
public float X;
public float Y;
public void Initialize() {
IsInitialized = true;
X = 0f;
Y = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pagea4{
public boolean IsInitialized;
public double A4Size;
public double A4Margins;
public double PageHeight;
public double PageHeaderHeight;
public double PageFooterHeight;
public double PageFirstHeight;
public double PageLabelHeight;
public double PageLabelSpaceHeight;
public double PageLabelBoxHeight;
public double PageTextMargins;
public double PageTextHeight;
public double PageImgRowHeight;
public double ImgRowHeight;
public double PageRowHeight;
public double PageTextRowHeight;
public String PageHeader;
public String PageFooter;
public String PageContent;
public String PageSignature;
public String PageObservations;
public String PageImages;
public String PageNonConformities;
public String PageTemplate;
public String PageFirst;
public String PageNext;
public String PageLast;
public void Initialize() {
IsInitialized = true;
A4Size = 0;
A4Margins = 0;
PageHeight = 0;
PageHeaderHeight = 0;
PageFooterHeight = 0;
PageFirstHeight = 0;
PageLabelHeight = 0;
PageLabelSpaceHeight = 0;
PageLabelBoxHeight = 0;
PageTextMargins = 0;
PageTextHeight = 0;
PageImgRowHeight = 0;
ImgRowHeight = 0;
PageRowHeight = 0;
PageTextRowHeight = 0;
PageHeader = "";
PageFooter = "";
PageContent = "";
PageSignature = "";
PageObservations = "";
PageImages = "";
PageNonConformities = "";
PageTemplate = "";
PageFirst = "";
PageNext = "";
PageLast = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pagedata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List PagesOut;
public int PageNumber;
public double PageTotal;
public String BuildPage;
public int PointCounter;
public int LineCounter;
public double CurrTotal;
public int ImageCounter;
public String Draft;
public String Out;
public String request_obs;
public String Technical;
public void Initialize() {
IsInitialized = true;
PagesOut = new anywheresoftware.b4a.objects.collections.List();
PageNumber = 0;
PageTotal = 0;
BuildPage = "";
PointCounter = 0;
LineCounter = 0;
CurrTotal = 0;
ImageCounter = 0;
Draft = "";
Out = "";
request_obs = "";
Technical = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _activityparams{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.ActivityWrapper activ;
public Object activObj;
public int Posis;
public String innerObject;
public String Obs;
public void Initialize() {
IsInitialized = true;
activ = new anywheresoftware.b4a.objects.ActivityWrapper();
activObj = new Object();
Posis = 0;
innerObject = "";
Obs = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _taglisttype{
public boolean IsInitialized;
public String tagcode;
public String tagname;
public String taggroup;
public void Initialize() {
IsInitialized = true;
tagcode = "";
tagname = "";
taggroup = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tablecounters{
public boolean IsInitialized;
public String tablename;
public int counter;
public void Initialize() {
IsInitialized = true;
tablename = "";
counter = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _downupfile{
public boolean IsInitialized;
public String Filename;
public String FileType;
public long FileDateTime;
public void Initialize() {
IsInitialized = true;
Filename = "";
FileType = "";
FileDateTime = 0L;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _fileshot{
public boolean IsInitialized;
public String Folder;
public String Filename;
public void Initialize() {
IsInitialized = true;
Folder = "";
Filename = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _db_itc{
public boolean IsInitialized;
public int ID;
public String Title;
public String Color;
public String TagCode;
public void Initialize() {
IsInitialized = true;
ID = 0;
Title = "";
Color = "";
TagCode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _deviceinformation{
public boolean IsInitialized;
public String Description;
public int Size;
public boolean HavePhone;
public void Initialize() {
IsInitialized = true;
Description = "";
Size = 0;
HavePhone = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _codenamelist{
public boolean IsInitialized;
public String TagCode;
public String Name;
public void Initialize() {
IsInitialized = true;
TagCode = "";
Name = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _resultoptions{
public boolean IsInitialized;
public int ValInt;
public String ValStr;
public String ValTitle;
public void Initialize() {
IsInitialized = true;
ValInt = 0;
ValStr = "";
ValTitle = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _extrainfo{
public boolean IsInitialized;
public String titleinfo;
public String textoInfo;
public String item_tagcode;
public int rc;
public int ric;
public int rfc;
public void Initialize() {
IsInitialized = true;
titleinfo = "";
textoInfo = "";
item_tagcode = "";
rc = 0;
ric = 0;
rfc = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _clataskitem{
public boolean IsInitialized;
public String task_tagcode;
public String item_tagcode;
public String unique_key;
public int position;
public int level;
public String parent_tagcode;
public int item_type;
public int points;
public int risk;
public int data_type;
public int bullet_master;
public int bullet_child;
public String type_answer;
public int typified_answers;
public int mandatory;
public int critical;
public int repeated;
public int multiple;
public int on_report;
public int has_signature;
public int has_articles;
public String type_nonconformity;
public String ta_tagcode;
public int ta_override_result;
public String ta_jump_tagcode;
public String defobj_tagcode;
public String info_notes;
public String asw_notes;
public int validate_execution;
public String cla_obs;
public int force_signature;
public int force_picture;
public int force_time;
public int type_time_control;
public int time_run_anyway;
public String dependent_key;
public String time_duration;
public int force_control;
public int type_control;
public int control_run_anyway;
public String control_condition;
public String do_tagcode;
public int do_associate_type;
public String do_object_image;
public String reference;
public String do_subgroup;
public String do_subsubgroup;
public String do_affected_table;
public String do_affected_tagcode;
public String do_affected_field;
public int change_title_totime;
public int answer_change_title;
public void Initialize() {
IsInitialized = true;
task_tagcode = "";
item_tagcode = "";
unique_key = "";
position = 0;
level = 0;
parent_tagcode = "";
item_type = 0;
points = 0;
risk = 0;
data_type = 0;
bullet_master = 0;
bullet_child = 0;
type_answer = "";
typified_answers = 0;
mandatory = 0;
critical = 0;
repeated = 0;
multiple = 0;
on_report = 0;
has_signature = 0;
has_articles = 0;
type_nonconformity = "";
ta_tagcode = "";
ta_override_result = 0;
ta_jump_tagcode = "";
defobj_tagcode = "";
info_notes = "";
asw_notes = "";
validate_execution = 0;
cla_obs = "";
force_signature = 0;
force_picture = 0;
force_time = 0;
type_time_control = 0;
time_run_anyway = 0;
dependent_key = "";
time_duration = "";
force_control = 0;
type_control = 0;
control_run_anyway = 0;
control_condition = "";
do_tagcode = "";
do_associate_type = 0;
do_object_image = "";
reference = "";
do_subgroup = "";
do_subsubgroup = "";
do_affected_table = "";
do_affected_tagcode = "";
do_affected_field = "";
change_title_totime = 0;
answer_change_title = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cla_items{
public boolean IsInitialized;
public String Task;
public String Item;
public String UniqueKey;
public String Answer;
public String Title;
public void Initialize() {
IsInitialized = true;
Task = "";
Item = "";
UniqueKey = "";
Answer = "";
Title = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requestclaitem{
public boolean IsInitialized;
public String Request;
public String Action;
public String Task;
public String Item;
public String UniqueKey;
public String Tagcode;
public int RepeatCounter;
public int RepeatItemCounter;
public int repeatfieldcounter;
public String Title;
public String Answer;
public String Value;
public int Origin;
public int BaseImage;
public int OnReport;
public String TagObject;
public xevolution.vrcg.devdemov2400.types._clataskitem TaskInfo;
public String SelectScript;
public void Initialize() {
IsInitialized = true;
Request = "";
Action = "";
Task = "";
Item = "";
UniqueKey = "";
Tagcode = "";
RepeatCounter = 0;
RepeatItemCounter = 0;
repeatfieldcounter = 0;
Title = "";
Answer = "";
Value = "";
Origin = 0;
BaseImage = 0;
OnReport = 0;
TagObject = "";
TaskInfo = new xevolution.vrcg.devdemov2400.types._clataskitem();
SelectScript = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _testrequestitem{
public boolean IsInitialized;
public String Request;
public String Action;
public String Task;
public String Item;
public String UniqueKey;
public String Tagcode;
public String Value;
public String Obs;
public String ActionSub;
public String Image;
public void Initialize() {
IsInitialized = true;
Request = "";
Action = "";
Task = "";
Item = "";
UniqueKey = "";
Tagcode = "";
Value = "";
Obs = "";
ActionSub = "";
Image = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _othercla{
public boolean IsInitialized;
public String Filter;
public String Filter2;
public String Filter3;
public void Initialize() {
IsInitialized = true;
Filter = "";
Filter2 = "";
Filter3 = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requesttaskinfo{
public boolean IsInitialized;
public int RequestType;
public int CloseType;
public int RequestResult;
public String RequestResOptions;
public boolean InPause;
public int Duration;
public float Points;
public int Risk;
public anywheresoftware.b4a.objects.collections.Map Map1;
public anywheresoftware.b4a.objects.collections.Map Map2;
public int ReqIndex;
public void Initialize() {
IsInitialized = true;
RequestType = 0;
CloseType = 0;
RequestResult = 0;
RequestResOptions = "";
InPause = false;
Duration = 0;
Points = 0f;
Risk = 0;
Map1 = new anywheresoftware.b4a.objects.collections.Map();
Map2 = new anywheresoftware.b4a.objects.collections.Map();
ReqIndex = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requestcla{
public boolean IsInitialized;
public String Request;
public String Action;
public String Task;
public int RepeatCounter;
public int TaskType;
public xevolution.vrcg.devdemov2400.types._intervention Status;
public xevolution.vrcg.devdemov2400.types._requesttaskinfo Info;
public xevolution.vrcg.devdemov2400.types._othercla Other;
public void Initialize() {
IsInitialized = true;
Request = "";
Action = "";
Task = "";
RepeatCounter = 0;
TaskType = 0;
Status = new xevolution.vrcg.devdemov2400.types._intervention();
Info = new xevolution.vrcg.devdemov2400.types._requesttaskinfo();
Other = new xevolution.vrcg.devdemov2400.types._othercla();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requestclaobs{
public boolean IsInitialized;
public boolean child;
public xevolution.vrcg.devdemov2400.types._requestcla cla;
public String Obs;
public void Initialize() {
IsInitialized = true;
child = false;
cla = new xevolution.vrcg.devdemov2400.types._requestcla();
Obs = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requestinfo{
public boolean IsInitialized;
public String Request;
public String RIEntity;
public String RIObject;
public String RITypeRequest;
public String RITechnical;
public String RITeam;
public String RIVehicle;
public String RINotes;
public String RIRoute;
public String RIReference;
public String RIDetails;
public void Initialize() {
IsInitialized = true;
Request = "";
RIEntity = "";
RIObject = "";
RITypeRequest = "";
RITechnical = "";
RITeam = "";
RIVehicle = "";
RINotes = "";
RIRoute = "";
RIReference = "";
RIDetails = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requestdata{
public boolean IsInitialized;
public String Tagcode;
public String Entity;
public String Latitude;
public String Longitude;
public int RequestType;
public int Favorite;
public int ClientReport;
public int RequestCanAdd;
public int RequestCanDelete;
public void Initialize() {
IsInitialized = true;
Tagcode = "";
Entity = "";
Latitude = "";
Longitude = "";
RequestType = 0;
Favorite = 0;
ClientReport = 0;
RequestCanAdd = 0;
RequestCanDelete = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _authorization{
public boolean IsInitialized;
public String Instance;
public String Authorization;
public String Version;
public String SubDomain;
public void Initialize() {
IsInitialized = true;
Instance = "";
Authorization = "";
Version = "";
SubDomain = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _composedbuttondefs{
public boolean IsInitialized;
public int PanelColor;
public int IconColor;
public int IconBKColor;
public int TextColor;
public int TextSBKColor;
public int TextEBKColor;
public int BorderColor;
public int BorderWidth;
public int BorderRadius;
public void Initialize() {
IsInitialized = true;
PanelColor = 0;
IconColor = 0;
IconBKColor = 0;
TextColor = 0;
TextSBKColor = 0;
TextEBKColor = 0;
BorderColor = 0;
BorderWidth = 0;
BorderRadius = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _point{
public boolean IsInitialized;
public int X;
public int Y;
public void Initialize() {
IsInitialized = true;
X = 0;
Y = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _rrefer{
public boolean IsInitialized;
public int Left;
public int Top;
public int Right;
public int Bottom;
public void Initialize() {
IsInitialized = true;
Left = 0;
Top = 0;
Right = 0;
Bottom = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pinpoint{
public boolean IsInitialized;
public String fileName;
public int bmrIndex;
public int ppNumber;
public void Initialize() {
IsInitialized = true;
fileName = "";
bmrIndex = 0;
ppNumber = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _bmr{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper btm;
public xevolution.vrcg.devdemov2400.types._rrefer rct;
public void Initialize() {
IsInitialized = true;
btm = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
rct = new xevolution.vrcg.devdemov2400.types._rrefer();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _geodata{
public boolean IsInitialized;
public String lat;
public String lon;
public String date;
public void Initialize() {
IsInitialized = true;
lat = "";
lon = "";
date = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _intervention{
public boolean IsInitialized;
public int id;
public String code;
public int status;
public int color;
public void Initialize() {
IsInitialized = true;
id = 0;
code = "";
status = 0;
color = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _requestfilter{
public boolean IsInitialized;
public String SDate;
public String EDate;
public int State;
public int Task;
public int Entity;
public int Route;
public int TPRequest;
public void Initialize() {
IsInitialized = true;
SDate = "";
EDate = "";
State = 0;
Task = 0;
Entity = 0;
Route = 0;
TPRequest = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _entityfilter{
public boolean IsInitialized;
public int TypeEntity;
public int Status;
public int Region;
public int Local;
public String Name;
public String Address;
public int request;
public void Initialize() {
IsInitialized = true;
TypeEntity = 0;
Status = 0;
Region = 0;
Local = 0;
Name = "";
Address = "";
request = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _kpifilter{
public boolean IsInitialized;
public int period;
public String SDate;
public String EDate;
public void Initialize() {
IsInitialized = true;
period = 0;
SDate = "";
EDate = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _objectfilter{
public boolean IsInitialized;
public int TypeObject;
public int ZoneObject;
public int Status;
public int Region;
public int Local;
public String Name;
public String Address;
public int Request;
public void Initialize() {
IsInitialized = true;
TypeObject = 0;
ZoneObject = 0;
Status = 0;
Region = 0;
Local = 0;
Name = "";
Address = "";
Request = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _taskfilter{
public boolean IsInitialized;
public int TypeTask;
public int Status;
public int Updated;
public int WithRequests;
public int Group;
public void Initialize() {
IsInitialized = true;
TypeTask = 0;
Status = 0;
Updated = 0;
WithRequests = 0;
Group = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _unavailable{
public boolean IsInitialized;
public String StartDate;
public String EndDate;
public String Reason;
public void Initialize() {
IsInitialized = true;
StartDate = "";
EndDate = "";
Reason = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _unavailable2{
public boolean IsInitialized;
public String StartDate;
public String EndDate;
public String Reason;
public String Cause;
public void Initialize() {
IsInitialized = true;
StartDate = "";
EndDate = "";
Reason = "";
Cause = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _autoidentification{
public boolean IsInitialized;
public String Tag;
public String objTagcode;
public String Plate;
public String Model;
public String Name;
public void Initialize() {
IsInitialized = true;
Tag = "";
objTagcode = "";
Plate = "";
Model = "";
Name = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _address{
public boolean IsInitialized;
public int AddressType;
public String AddressName;
public String AddressName2;
public String AddressCity;
public String AddressPostalCode;
public String AddressLatitude;
public String AddressLongitude;
public boolean asNew;
public void Initialize() {
IsInitialized = true;
AddressType = 0;
AddressName = "";
AddressName2 = "";
AddressCity = "";
AddressPostalCode = "";
AddressLatitude = "";
AddressLongitude = "";
asNew = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _georeference{
public boolean IsInitialized;
public String Latitude;
public String Longitude;
public boolean asNew;
public void Initialize() {
IsInitialized = true;
Latitude = "";
Longitude = "";
asNew = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _contactrecord{
public boolean IsInitialized;
public int contactType;
public String contactName;
public String contactPhone;
public String contactEmail;
public String contactTitle;
public String tagcode;
public boolean asNew;
public void Initialize() {
IsInitialized = true;
contactType = 0;
contactName = "";
contactPhone = "";
contactEmail = "";
contactTitle = "";
tagcode = "";
asNew = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _entityinformation{
public boolean IsInitialized;
public String tagcode;
public int entType;
public String entName;
public String entAddress;
public String entAddress2;
public String entCpostal;
public String entCity;
public String entCtnPhone;
public String entCtnName;
public String entLatitude;
public String entLongitude;
public boolean asNew;
public void Initialize() {
IsInitialized = true;
tagcode = "";
entType = 0;
entName = "";
entAddress = "";
entAddress2 = "";
entCpostal = "";
entCity = "";
entCtnPhone = "";
entCtnName = "";
entLatitude = "";
entLongitude = "";
asNew = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _objectinformation{
public boolean IsInitialized;
public String tagcode;
public int iType;
public String Name;
public String Address;
public String Address2;
public String Cpostal;
public String City;
public String CtnPhone;
public String CtnName;
public String Latitude;
public String Longitude;
public boolean asNew;
public void Initialize() {
IsInitialized = true;
tagcode = "";
iType = 0;
Name = "";
Address = "";
Address2 = "";
Cpostal = "";
City = "";
CtnPhone = "";
CtnName = "";
Latitude = "";
Longitude = "";
asNew = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _objecttype{
public boolean IsInitialized;
public String tagcode;
public String title;
public String color;
public int have_contracts;
public int have_warehouse;
public int have_documents;
public int isgroup;
public int doctemplate_id;
public String doctemplate;
public void Initialize() {
IsInitialized = true;
tagcode = "";
title = "";
color = "";
have_contracts = 0;
have_warehouse = 0;
have_documents = 0;
isgroup = 0;
doctemplate_id = 0;
doctemplate = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _clastatus{
public boolean IsInitialized;
public int Status;
public String StartDate;
public String Starttime;
public String Endtime;
public String Duration;
public double Points;
public int Risk;
public int Result;
public String ResultDesc;
public boolean HasImages;
public boolean HasActions;
public boolean HasSignatures;
public boolean ReportGenerated;
public boolean CanChange;
public void Initialize() {
IsInitialized = true;
Status = 0;
StartDate = "";
Starttime = "";
Endtime = "";
Duration = "";
Points = 0;
Risk = 0;
Result = 0;
ResultDesc = "";
HasImages = false;
HasActions = false;
HasSignatures = false;
ReportGenerated = false;
CanChange = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _cladata{
public boolean IsInitialized;
public String Request;
public String Action;
public String Task;
public String Item;
public String UniqueKey;
public String Tagcode;
public int RepeatCounter;
public boolean ReadOnly;
public boolean Composed;
public xevolution.vrcg.devdemov2400.types._clastatus StatusMaster;
public xevolution.vrcg.devdemov2400.types._clastatus StatusChild;
public void Initialize() {
IsInitialized = true;
Request = "";
Action = "";
Task = "";
Item = "";
UniqueKey = "";
Tagcode = "";
RepeatCounter = 0;
ReadOnly = false;
Composed = false;
StatusMaster = new xevolution.vrcg.devdemov2400.types._clastatus();
StatusChild = new xevolution.vrcg.devdemov2400.types._clastatus();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _rundatefilters{
public boolean IsInitialized;
public String DateStart;
public String DateEnd;
public void Initialize() {
IsInitialized = true;
DateStart = "";
DateEnd = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _objecttypes{
public boolean IsInitialized;
public int id;
public String tagcode;
public String title;
public void Initialize() {
IsInitialized = true;
id = 0;
tagcode = "";
title = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _carobject{
public boolean IsInitialized;
public String obj;
public String brand;
public String model;
public String plate;
public long km;
public void Initialize() {
IsInitialized = true;
obj = "";
brand = "";
model = "";
plate = "";
km = 0L;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _imageviewdata{
public boolean IsInitialized;
public String b64;
public String filename;
public void Initialize() {
IsInitialized = true;
b64 = "";
filename = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _workernewdata{
public boolean IsInitialized;
public int up_typeoper;
public String up_tagcode;
public String up_task;
public String up_itemtagcode;
public void Initialize() {
IsInitialized = true;
up_typeoper = 0;
up_tagcode = "";
up_task = "";
up_itemtagcode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _singleclaitem{
public boolean IsInitialized;
public String request_tc;
public String task_tc;
public String item_tc;
public String uk;
public String tc;
public int rc;
public int ric;
public int rfc;
public void Initialize() {
IsInitialized = true;
request_tc = "";
task_tc = "";
item_tc = "";
uk = "";
tc = "";
rc = 0;
ric = 0;
rfc = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _returnfromcantrolsub{
public boolean IsInitialized;
public int TypeOfControl;
public boolean SubResult;
public void Initialize() {
IsInitialized = true;
TypeOfControl = 0;
SubResult = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.collections.List _zoneobjectsfilter = null;
public static String _collapse_icon = "";
public static String _expand_icon = "";
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
public xevolution.vrcg.devdemov2400.updateservice _updateservice = null;
public xevolution.vrcg.devdemov2400.user _user = null;
public xevolution.vrcg.devdemov2400.userservice _userservice = null;
public xevolution.vrcg.devdemov2400.httputils2service _httputils2service = null;
public xevolution.vrcg.devdemov2400.xuiviewsutils _xuiviewsutils = null;
public static xevolution.vrcg.devdemov2400.types._authorization  _makeauthorization(anywheresoftware.b4a.BA _ba,String _instance,String _authorization,String _version,String _subdomain) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeauthorization", false))
	 {return ((xevolution.vrcg.devdemov2400.types._authorization) Debug.delegate(null, "makeauthorization", new Object[] {_ba,_instance,_authorization,_version,_subdomain}));}
xevolution.vrcg.devdemov2400.types._authorization _ret = null;
RDebugUtils.currentLine=190513152;
 //BA.debugLineNum = 190513152;BA.debugLine="Sub MakeAuthorization(Instance As String, Authoriz";
RDebugUtils.currentLine=190513153;
 //BA.debugLineNum = 190513153;BA.debugLine="Dim ret As Authorization";
_ret = new xevolution.vrcg.devdemov2400.types._authorization();
RDebugUtils.currentLine=190513158;
 //BA.debugLineNum = 190513158;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190513159;
 //BA.debugLineNum = 190513159;BA.debugLine="ret.Instance = Instance";
_ret.Instance /*String*/  = _instance;
RDebugUtils.currentLine=190513160;
 //BA.debugLineNum = 190513160;BA.debugLine="ret.Authorization = Authorization";
_ret.Authorization /*String*/  = _authorization;
RDebugUtils.currentLine=190513161;
 //BA.debugLineNum = 190513161;BA.debugLine="ret.Version = Version";
_ret.Version /*String*/  = _version;
RDebugUtils.currentLine=190513162;
 //BA.debugLineNum = 190513162;BA.debugLine="ret.SubDomain = SubDomain";
_ret.SubDomain /*String*/  = _subdomain;
RDebugUtils.currentLine=190513163;
 //BA.debugLineNum = 190513163;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190513164;
 //BA.debugLineNum = 190513164;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._composedbuttondefs  _makecomposedbuttondefs(anywheresoftware.b4a.BA _ba,int _panelcolor,int _iconcolor,int _iconbkcolor,int _textcolor,int _textsbkcolor,int _textebkcolor,int _bordercolor,int _borderwidth,int _borderradius) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecomposedbuttondefs", false))
	 {return ((xevolution.vrcg.devdemov2400.types._composedbuttondefs) Debug.delegate(null, "makecomposedbuttondefs", new Object[] {_ba,_panelcolor,_iconcolor,_iconbkcolor,_textcolor,_textsbkcolor,_textebkcolor,_bordercolor,_borderwidth,_borderradius}));}
xevolution.vrcg.devdemov2400.types._composedbuttondefs _ret = null;
RDebugUtils.currentLine=190447616;
 //BA.debugLineNum = 190447616;BA.debugLine="Sub MakeComposedButtonDefs(PanelColor As Int, Icon";
RDebugUtils.currentLine=190447618;
 //BA.debugLineNum = 190447618;BA.debugLine="Dim ret As ComposedButtonDefs";
_ret = new xevolution.vrcg.devdemov2400.types._composedbuttondefs();
RDebugUtils.currentLine=190447619;
 //BA.debugLineNum = 190447619;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190447620;
 //BA.debugLineNum = 190447620;BA.debugLine="ret.PanelColor = PanelColor";
_ret.PanelColor /*int*/  = _panelcolor;
RDebugUtils.currentLine=190447621;
 //BA.debugLineNum = 190447621;BA.debugLine="ret.IconColor = IconColor";
_ret.IconColor /*int*/  = _iconcolor;
RDebugUtils.currentLine=190447622;
 //BA.debugLineNum = 190447622;BA.debugLine="ret.IconBKColor = IconBKColor";
_ret.IconBKColor /*int*/  = _iconbkcolor;
RDebugUtils.currentLine=190447623;
 //BA.debugLineNum = 190447623;BA.debugLine="ret.TextColor = TextColor";
_ret.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=190447624;
 //BA.debugLineNum = 190447624;BA.debugLine="ret.TextSBKColor = TextSBKColor";
_ret.TextSBKColor /*int*/  = _textsbkcolor;
RDebugUtils.currentLine=190447625;
 //BA.debugLineNum = 190447625;BA.debugLine="ret.TextEBKColor = TextEBKColor";
_ret.TextEBKColor /*int*/  = _textebkcolor;
RDebugUtils.currentLine=190447626;
 //BA.debugLineNum = 190447626;BA.debugLine="ret.BorderColor = BorderColor";
_ret.BorderColor /*int*/  = _bordercolor;
RDebugUtils.currentLine=190447627;
 //BA.debugLineNum = 190447627;BA.debugLine="ret.BorderWidth = BorderWidth";
_ret.BorderWidth /*int*/  = _borderwidth;
RDebugUtils.currentLine=190447628;
 //BA.debugLineNum = 190447628;BA.debugLine="ret.BorderRadius = BorderRadius";
_ret.BorderRadius /*int*/  = _borderradius;
RDebugUtils.currentLine=190447629;
 //BA.debugLineNum = 190447629;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190447630;
 //BA.debugLineNum = 190447630;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._entityfilter  _makeentityfilter(anywheresoftware.b4a.BA _ba,int _typeentity,int _status,int _region,int _local,String _name,String _address,int _request) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeentityfilter", false))
	 {return ((xevolution.vrcg.devdemov2400.types._entityfilter) Debug.delegate(null, "makeentityfilter", new Object[] {_ba,_typeentity,_status,_region,_local,_name,_address,_request}));}
xevolution.vrcg.devdemov2400.types._entityfilter _ret = null;
RDebugUtils.currentLine=190906368;
 //BA.debugLineNum = 190906368;BA.debugLine="Sub MakeEntityFilter(TypeEntity As Int, Status As";
RDebugUtils.currentLine=190906369;
 //BA.debugLineNum = 190906369;BA.debugLine="Dim ret As EntityFilter";
_ret = new xevolution.vrcg.devdemov2400.types._entityfilter();
RDebugUtils.currentLine=190906370;
 //BA.debugLineNum = 190906370;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190906371;
 //BA.debugLineNum = 190906371;BA.debugLine="ret.TypeEntity = TypeEntity";
_ret.TypeEntity /*int*/  = _typeentity;
RDebugUtils.currentLine=190906372;
 //BA.debugLineNum = 190906372;BA.debugLine="ret.Status = Status";
_ret.Status /*int*/  = _status;
RDebugUtils.currentLine=190906373;
 //BA.debugLineNum = 190906373;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=190906374;
 //BA.debugLineNum = 190906374;BA.debugLine="ret.Region = Region";
_ret.Region /*int*/  = _region;
RDebugUtils.currentLine=190906375;
 //BA.debugLineNum = 190906375;BA.debugLine="ret.Local = Local";
_ret.Local /*int*/  = _local;
RDebugUtils.currentLine=190906376;
 //BA.debugLineNum = 190906376;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=190906377;
 //BA.debugLineNum = 190906377;BA.debugLine="ret.Address = Address";
_ret.Address /*String*/  = _address;
RDebugUtils.currentLine=190906378;
 //BA.debugLineNum = 190906378;BA.debugLine="ret.Request = request";
_ret.request /*int*/  = _request;
RDebugUtils.currentLine=190906379;
 //BA.debugLineNum = 190906379;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190906380;
 //BA.debugLineNum = 190906380;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._objectfilter  _makeobjectfilter(anywheresoftware.b4a.BA _ba,int _typeobject,int _zoneobject,int _status,int _region,int _local,String _name,String _address,int _request) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeobjectfilter", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objectfilter) Debug.delegate(null, "makeobjectfilter", new Object[] {_ba,_typeobject,_zoneobject,_status,_region,_local,_name,_address,_request}));}
xevolution.vrcg.devdemov2400.types._objectfilter _ret = null;
RDebugUtils.currentLine=190971904;
 //BA.debugLineNum = 190971904;BA.debugLine="Sub MakeObjectFilter(TypeObject As Int, ZoneObject";
RDebugUtils.currentLine=190971905;
 //BA.debugLineNum = 190971905;BA.debugLine="Dim ret As ObjectFilter";
_ret = new xevolution.vrcg.devdemov2400.types._objectfilter();
RDebugUtils.currentLine=190971906;
 //BA.debugLineNum = 190971906;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190971907;
 //BA.debugLineNum = 190971907;BA.debugLine="ret.TypeObject = TypeObject";
_ret.TypeObject /*int*/  = _typeobject;
RDebugUtils.currentLine=190971908;
 //BA.debugLineNum = 190971908;BA.debugLine="ret.ZoneObject = ZoneObject";
_ret.ZoneObject /*int*/  = _zoneobject;
RDebugUtils.currentLine=190971909;
 //BA.debugLineNum = 190971909;BA.debugLine="ret.Status = Status";
_ret.Status /*int*/  = _status;
RDebugUtils.currentLine=190971910;
 //BA.debugLineNum = 190971910;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=190971911;
 //BA.debugLineNum = 190971911;BA.debugLine="ret.Region = Region";
_ret.Region /*int*/  = _region;
RDebugUtils.currentLine=190971912;
 //BA.debugLineNum = 190971912;BA.debugLine="ret.Local = Local";
_ret.Local /*int*/  = _local;
RDebugUtils.currentLine=190971913;
 //BA.debugLineNum = 190971913;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=190971914;
 //BA.debugLineNum = 190971914;BA.debugLine="ret.Address = Address";
_ret.Address /*String*/  = _address;
RDebugUtils.currentLine=190971915;
 //BA.debugLineNum = 190971915;BA.debugLine="ret.Request = request";
_ret.Request /*int*/  = _request;
RDebugUtils.currentLine=190971916;
 //BA.debugLineNum = 190971916;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190971917;
 //BA.debugLineNum = 190971917;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._workernewdata  _makeworkernewdata(anywheresoftware.b4a.BA _ba,int _up_typeoper,String _up_tagcode,String _up_task,String _up_itemtagcode) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeworkernewdata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._workernewdata) Debug.delegate(null, "makeworkernewdata", new Object[] {_ba,_up_typeoper,_up_tagcode,_up_task,_up_itemtagcode}));}
xevolution.vrcg.devdemov2400.types._workernewdata _wndata = null;
RDebugUtils.currentLine=192086016;
 //BA.debugLineNum = 192086016;BA.debugLine="Sub MakeWorkerNewData(up_typeoper As Int, up_tagco";
RDebugUtils.currentLine=192086017;
 //BA.debugLineNum = 192086017;BA.debugLine="Private WNData As WorkerNewData";
_wndata = new xevolution.vrcg.devdemov2400.types._workernewdata();
RDebugUtils.currentLine=192086018;
 //BA.debugLineNum = 192086018;BA.debugLine="WNData.Initialize";
_wndata.Initialize();
RDebugUtils.currentLine=192086019;
 //BA.debugLineNum = 192086019;BA.debugLine="WNData.up_typeoper = up_typeoper";
_wndata.up_typeoper /*int*/  = _up_typeoper;
RDebugUtils.currentLine=192086020;
 //BA.debugLineNum = 192086020;BA.debugLine="WNData.up_tagcode = up_tagcode";
_wndata.up_tagcode /*String*/  = _up_tagcode;
RDebugUtils.currentLine=192086021;
 //BA.debugLineNum = 192086021;BA.debugLine="WNData.up_task = up_task";
_wndata.up_task /*String*/  = _up_task;
RDebugUtils.currentLine=192086022;
 //BA.debugLineNum = 192086022;BA.debugLine="WNData.up_itemtagcode = up_itemtagcode";
_wndata.up_itemtagcode /*String*/  = _up_itemtagcode;
RDebugUtils.currentLine=192086023;
 //BA.debugLineNum = 192086023;BA.debugLine="Return WNData";
if (true) return _wndata;
RDebugUtils.currentLine=192086024;
 //BA.debugLineNum = 192086024;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._deviceinformation  _makedeviceinformation(anywheresoftware.b4a.BA _ba,String _description,int _size,boolean _havephone) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makedeviceinformation", false))
	 {return ((xevolution.vrcg.devdemov2400.types._deviceinformation) Debug.delegate(null, "makedeviceinformation", new Object[] {_ba,_description,_size,_havephone}));}
xevolution.vrcg.devdemov2400.types._deviceinformation _ret = null;
RDebugUtils.currentLine=189595648;
 //BA.debugLineNum = 189595648;BA.debugLine="Sub MakeDeviceInformation(Description As String, S";
RDebugUtils.currentLine=189595649;
 //BA.debugLineNum = 189595649;BA.debugLine="Dim ret As DeviceInformation";
_ret = new xevolution.vrcg.devdemov2400.types._deviceinformation();
RDebugUtils.currentLine=189595650;
 //BA.debugLineNum = 189595650;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189595651;
 //BA.debugLineNum = 189595651;BA.debugLine="ret.Description = Description";
_ret.Description /*String*/  = _description;
RDebugUtils.currentLine=189595652;
 //BA.debugLineNum = 189595652;BA.debugLine="ret.Size = Size";
_ret.Size /*int*/  = _size;
RDebugUtils.currentLine=189595653;
 //BA.debugLineNum = 189595653;BA.debugLine="ret.HavePhone = HavePhone";
_ret.HavePhone /*boolean*/  = _havephone;
RDebugUtils.currentLine=189595654;
 //BA.debugLineNum = 189595654;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189595655;
 //BA.debugLineNum = 189595655;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._claievent  _makeclaievent(anywheresoftware.b4a.BA _ba,String _event_tagcode,int _position,int _type_item,int _active,String _value,String _formula,int _have_formula,int _have_condition,int _have_status,int _is_jump,int _is_status,int _is_alert,int _is_email,int _is_more,int _is_foto,int _is_action,int _inc_object_contacts,String _team_tagcode,String _email_to,String _email_cc,int _use_internal_image,String _default_typerequest,String _resobsgrp_tagcode,int _add_entity_email,int _add_object_email,int _request_signature) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeclaievent", false))
	 {return ((xevolution.vrcg.devdemov2400.types._claievent) Debug.delegate(null, "makeclaievent", new Object[] {_ba,_event_tagcode,_position,_type_item,_active,_value,_formula,_have_formula,_have_condition,_have_status,_is_jump,_is_status,_is_alert,_is_email,_is_more,_is_foto,_is_action,_inc_object_contacts,_team_tagcode,_email_to,_email_cc,_use_internal_image,_default_typerequest,_resobsgrp_tagcode,_add_entity_email,_add_object_email,_request_signature}));}
xevolution.vrcg.devdemov2400.types._claievent _ret = null;
RDebugUtils.currentLine=188547072;
 //BA.debugLineNum = 188547072;BA.debugLine="Sub MakeCLAIEvent(event_tagcode As String, positio";
RDebugUtils.currentLine=188547076;
 //BA.debugLineNum = 188547076;BA.debugLine="Dim ret As CLAIEvent";
_ret = new xevolution.vrcg.devdemov2400.types._claievent();
RDebugUtils.currentLine=188547077;
 //BA.debugLineNum = 188547077;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188547079;
 //BA.debugLineNum = 188547079;BA.debugLine="ret.event_tagcode = event_tagcode";
_ret.event_tagcode /*String*/  = _event_tagcode;
RDebugUtils.currentLine=188547080;
 //BA.debugLineNum = 188547080;BA.debugLine="ret.position = position";
_ret.position /*int*/  = _position;
RDebugUtils.currentLine=188547081;
 //BA.debugLineNum = 188547081;BA.debugLine="ret.type_item = type_item";
_ret.type_item /*int*/  = _type_item;
RDebugUtils.currentLine=188547082;
 //BA.debugLineNum = 188547082;BA.debugLine="ret.active = active";
_ret.active /*int*/  = _active;
RDebugUtils.currentLine=188547083;
 //BA.debugLineNum = 188547083;BA.debugLine="ret.value = value";
_ret.value /*String*/  = _value;
RDebugUtils.currentLine=188547084;
 //BA.debugLineNum = 188547084;BA.debugLine="ret.formula = formula";
_ret.formula /*String*/  = _formula;
RDebugUtils.currentLine=188547085;
 //BA.debugLineNum = 188547085;BA.debugLine="ret.have_formula = have_formula";
_ret.have_formula /*int*/  = _have_formula;
RDebugUtils.currentLine=188547086;
 //BA.debugLineNum = 188547086;BA.debugLine="ret.have_condition = have_condition";
_ret.have_condition /*int*/  = _have_condition;
RDebugUtils.currentLine=188547087;
 //BA.debugLineNum = 188547087;BA.debugLine="ret.have_status = have_status";
_ret.have_status /*int*/  = _have_status;
RDebugUtils.currentLine=188547088;
 //BA.debugLineNum = 188547088;BA.debugLine="ret.is_jump = is_jump";
_ret.is_jump /*int*/  = _is_jump;
RDebugUtils.currentLine=188547089;
 //BA.debugLineNum = 188547089;BA.debugLine="ret.is_status = is_status";
_ret.is_status /*int*/  = _is_status;
RDebugUtils.currentLine=188547090;
 //BA.debugLineNum = 188547090;BA.debugLine="ret.is_alert = is_alert";
_ret.is_alert /*int*/  = _is_alert;
RDebugUtils.currentLine=188547091;
 //BA.debugLineNum = 188547091;BA.debugLine="ret.is_email = is_email";
_ret.is_email /*int*/  = _is_email;
RDebugUtils.currentLine=188547092;
 //BA.debugLineNum = 188547092;BA.debugLine="ret.is_more = is_more";
_ret.is_more /*int*/  = _is_more;
RDebugUtils.currentLine=188547093;
 //BA.debugLineNum = 188547093;BA.debugLine="ret.is_foto = is_foto";
_ret.is_foto /*int*/  = _is_foto;
RDebugUtils.currentLine=188547094;
 //BA.debugLineNum = 188547094;BA.debugLine="ret.is_action = is_action";
_ret.is_action /*int*/  = _is_action;
RDebugUtils.currentLine=188547095;
 //BA.debugLineNum = 188547095;BA.debugLine="ret.inc_object_contacts = inc_object_contacts";
_ret.inc_object_contacts /*int*/  = _inc_object_contacts;
RDebugUtils.currentLine=188547096;
 //BA.debugLineNum = 188547096;BA.debugLine="ret.team_tagcode = team_tagcode";
_ret.team_tagcode /*String*/  = _team_tagcode;
RDebugUtils.currentLine=188547097;
 //BA.debugLineNum = 188547097;BA.debugLine="ret.email_to = email_to";
_ret.email_to /*String*/  = _email_to;
RDebugUtils.currentLine=188547098;
 //BA.debugLineNum = 188547098;BA.debugLine="ret.email_cc = email_cc";
_ret.email_cc /*String*/  = _email_cc;
RDebugUtils.currentLine=188547099;
 //BA.debugLineNum = 188547099;BA.debugLine="ret.use_internal_image = use_internal_image";
_ret.use_internal_image /*int*/  = _use_internal_image;
RDebugUtils.currentLine=188547100;
 //BA.debugLineNum = 188547100;BA.debugLine="ret.default_typerequest = default_typerequest";
_ret.default_typerequest /*String*/  = _default_typerequest;
RDebugUtils.currentLine=188547101;
 //BA.debugLineNum = 188547101;BA.debugLine="ret.resobsgrp_tagcode = resobsgrp_tagcode";
_ret.resobsgrp_tagcode /*String*/  = _resobsgrp_tagcode;
RDebugUtils.currentLine=188547102;
 //BA.debugLineNum = 188547102;BA.debugLine="ret.add_entity_email = add_entity_email";
_ret.add_entity_email /*int*/  = _add_entity_email;
RDebugUtils.currentLine=188547103;
 //BA.debugLineNum = 188547103;BA.debugLine="ret.add_object_email = add_object_email";
_ret.add_object_email /*int*/  = _add_object_email;
RDebugUtils.currentLine=188547104;
 //BA.debugLineNum = 188547104;BA.debugLine="ret.request_signature = request_signature";
_ret.request_signature /*int*/  = _request_signature;
RDebugUtils.currentLine=188547105;
 //BA.debugLineNum = 188547105;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188547106;
 //BA.debugLineNum = 188547106;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._objecttype  _makeobjecttype(anywheresoftware.b4a.BA _ba,String _tagcode,String _title,String _color,int _have_contracts,int _have_warehouse,int _have_documents,int _isgroup,int _doctemplate_id,String _doctemplate) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeobjecttype", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objecttype) Debug.delegate(null, "makeobjecttype", new Object[] {_ba,_tagcode,_title,_color,_have_contracts,_have_warehouse,_have_documents,_isgroup,_doctemplate_id,_doctemplate}));}
xevolution.vrcg.devdemov2400.types._objecttype _ret = null;
RDebugUtils.currentLine=190382080;
 //BA.debugLineNum = 190382080;BA.debugLine="Sub MakeObjectType(tagcode As String, title As Str";
RDebugUtils.currentLine=190382082;
 //BA.debugLineNum = 190382082;BA.debugLine="Dim ret As ObjectType";
_ret = new xevolution.vrcg.devdemov2400.types._objecttype();
RDebugUtils.currentLine=190382083;
 //BA.debugLineNum = 190382083;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190382084;
 //BA.debugLineNum = 190382084;BA.debugLine="ret.tagcode = tagcode";
_ret.tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=190382085;
 //BA.debugLineNum = 190382085;BA.debugLine="ret.title = title";
_ret.title /*String*/  = _title;
RDebugUtils.currentLine=190382086;
 //BA.debugLineNum = 190382086;BA.debugLine="ret.color = color";
_ret.color /*String*/  = _color;
RDebugUtils.currentLine=190382087;
 //BA.debugLineNum = 190382087;BA.debugLine="ret.have_contracts = have_contracts";
_ret.have_contracts /*int*/  = _have_contracts;
RDebugUtils.currentLine=190382088;
 //BA.debugLineNum = 190382088;BA.debugLine="ret.have_warehouse = have_warehouse";
_ret.have_warehouse /*int*/  = _have_warehouse;
RDebugUtils.currentLine=190382089;
 //BA.debugLineNum = 190382089;BA.debugLine="ret.have_documents = have_documents";
_ret.have_documents /*int*/  = _have_documents;
RDebugUtils.currentLine=190382090;
 //BA.debugLineNum = 190382090;BA.debugLine="ret.isgroup = isgroup";
_ret.isgroup /*int*/  = _isgroup;
RDebugUtils.currentLine=190382091;
 //BA.debugLineNum = 190382091;BA.debugLine="ret.doctemplate_id = doctemplate_id";
_ret.doctemplate_id /*int*/  = _doctemplate_id;
RDebugUtils.currentLine=190382092;
 //BA.debugLineNum = 190382092;BA.debugLine="ret.doctemplate = doctemplate";
_ret.doctemplate /*String*/  = _doctemplate;
RDebugUtils.currentLine=190382093;
 //BA.debugLineNum = 190382093;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190382094;
 //BA.debugLineNum = 190382094;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._db_itc  _makedb_itc(anywheresoftware.b4a.BA _ba,int _id,String _tagcode,String _title,String _color) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makedb_itc", false))
	 {return ((xevolution.vrcg.devdemov2400.types._db_itc) Debug.delegate(null, "makedb_itc", new Object[] {_ba,_id,_tagcode,_title,_color}));}
xevolution.vrcg.devdemov2400.types._db_itc _ret = null;
RDebugUtils.currentLine=189530112;
 //BA.debugLineNum = 189530112;BA.debugLine="Sub MakeDB_ITC(ID As Int, Tagcode As String, Title";
RDebugUtils.currentLine=189530113;
 //BA.debugLineNum = 189530113;BA.debugLine="Dim ret As DB_ITC";
_ret = new xevolution.vrcg.devdemov2400.types._db_itc();
RDebugUtils.currentLine=189530114;
 //BA.debugLineNum = 189530114;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189530115;
 //BA.debugLineNum = 189530115;BA.debugLine="ret.ID = ID";
_ret.ID /*int*/  = _id;
RDebugUtils.currentLine=189530116;
 //BA.debugLineNum = 189530116;BA.debugLine="ret.TagCode = Tagcode";
_ret.TagCode /*String*/  = _tagcode;
RDebugUtils.currentLine=189530117;
 //BA.debugLineNum = 189530117;BA.debugLine="ret.Title = Title";
_ret.Title /*String*/  = _title;
RDebugUtils.currentLine=189530118;
 //BA.debugLineNum = 189530118;BA.debugLine="ret.Color = Color";
_ret.Color /*String*/  = _color;
RDebugUtils.currentLine=189530119;
 //BA.debugLineNum = 189530119;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189530120;
 //BA.debugLineNum = 189530120;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._codenamelist  _makecodenamelist(anywheresoftware.b4a.BA _ba,String _tagcode,String _name) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecodenamelist", false))
	 {return ((xevolution.vrcg.devdemov2400.types._codenamelist) Debug.delegate(null, "makecodenamelist", new Object[] {_ba,_tagcode,_name}));}
xevolution.vrcg.devdemov2400.types._codenamelist _ret = null;
RDebugUtils.currentLine=189661184;
 //BA.debugLineNum = 189661184;BA.debugLine="Sub MakeCodeNameList(TagCode As String, Name As St";
RDebugUtils.currentLine=189661185;
 //BA.debugLineNum = 189661185;BA.debugLine="Dim ret As CodeNameList";
_ret = new xevolution.vrcg.devdemov2400.types._codenamelist();
RDebugUtils.currentLine=189661186;
 //BA.debugLineNum = 189661186;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189661187;
 //BA.debugLineNum = 189661187;BA.debugLine="ret.Tagcode = TagCode";
_ret.TagCode /*String*/  = _tagcode;
RDebugUtils.currentLine=189661188;
 //BA.debugLineNum = 189661188;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=189661189;
 //BA.debugLineNum = 189661189;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189661190;
 //BA.debugLineNum = 189661190;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._objecttypes  _makeobjecttypes(anywheresoftware.b4a.BA _ba,int _id,String _tagcode,String _title) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeobjecttypes", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objecttypes) Debug.delegate(null, "makeobjecttypes", new Object[] {_ba,_id,_tagcode,_title}));}
xevolution.vrcg.devdemov2400.types._objecttypes _obt = null;
RDebugUtils.currentLine=189267968;
 //BA.debugLineNum = 189267968;BA.debugLine="Sub MakeObjectTypes(id As Int, tagcode As String,";
RDebugUtils.currentLine=189267969;
 //BA.debugLineNum = 189267969;BA.debugLine="Dim obt As ObjectTypes";
_obt = new xevolution.vrcg.devdemov2400.types._objecttypes();
RDebugUtils.currentLine=189267970;
 //BA.debugLineNum = 189267970;BA.debugLine="obt.Initialize";
_obt.Initialize();
RDebugUtils.currentLine=189267971;
 //BA.debugLineNum = 189267971;BA.debugLine="obt.id = id";
_obt.id /*int*/  = _id;
RDebugUtils.currentLine=189267972;
 //BA.debugLineNum = 189267972;BA.debugLine="obt.tagcode = tagcode";
_obt.tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=189267973;
 //BA.debugLineNum = 189267973;BA.debugLine="obt.title = title";
_obt.title /*String*/  = _title;
RDebugUtils.currentLine=189267974;
 //BA.debugLineNum = 189267974;BA.debugLine="Return obt";
if (true) return _obt;
RDebugUtils.currentLine=189267975;
 //BA.debugLineNum = 189267975;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestinfo  _makerequestinfo(anywheresoftware.b4a.BA _ba,String _request,String _rientity,String _riobject,String _rityperequest,String _ritechnical,String _riteam,String _rivehicle,String _rinotes,String _riroute,String _rireference,String _ridetails) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestinfo) Debug.delegate(null, "makerequestinfo", new Object[] {_ba,_request,_rientity,_riobject,_rityperequest,_ritechnical,_riteam,_rivehicle,_rinotes,_riroute,_rireference,_ridetails}));}
xevolution.vrcg.devdemov2400.types._requestinfo _ret = null;
RDebugUtils.currentLine=188153856;
 //BA.debugLineNum = 188153856;BA.debugLine="Sub MakeRequestInfo(Request As String, RIEntity As";
RDebugUtils.currentLine=188153858;
 //BA.debugLineNum = 188153858;BA.debugLine="Dim ret As RequestInfo";
_ret = new xevolution.vrcg.devdemov2400.types._requestinfo();
RDebugUtils.currentLine=188153859;
 //BA.debugLineNum = 188153859;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188153860;
 //BA.debugLineNum = 188153860;BA.debugLine="ret.Request = Request";
_ret.Request /*String*/  = _request;
RDebugUtils.currentLine=188153861;
 //BA.debugLineNum = 188153861;BA.debugLine="ret.RIEntity = RIEntity";
_ret.RIEntity /*String*/  = _rientity;
RDebugUtils.currentLine=188153862;
 //BA.debugLineNum = 188153862;BA.debugLine="ret.RIObject = RIObject";
_ret.RIObject /*String*/  = _riobject;
RDebugUtils.currentLine=188153863;
 //BA.debugLineNum = 188153863;BA.debugLine="ret.RITypeRequest = RITypeRequest";
_ret.RITypeRequest /*String*/  = _rityperequest;
RDebugUtils.currentLine=188153864;
 //BA.debugLineNum = 188153864;BA.debugLine="ret.RITechnical = RITechnical";
_ret.RITechnical /*String*/  = _ritechnical;
RDebugUtils.currentLine=188153865;
 //BA.debugLineNum = 188153865;BA.debugLine="ret.RITeam = RITeam";
_ret.RITeam /*String*/  = _riteam;
RDebugUtils.currentLine=188153866;
 //BA.debugLineNum = 188153866;BA.debugLine="ret.RIVehicle = RIVehicle";
_ret.RIVehicle /*String*/  = _rivehicle;
RDebugUtils.currentLine=188153867;
 //BA.debugLineNum = 188153867;BA.debugLine="ret.RINotes = RINotes";
_ret.RINotes /*String*/  = _rinotes;
RDebugUtils.currentLine=188153868;
 //BA.debugLineNum = 188153868;BA.debugLine="ret.RITeam = RIRoute";
_ret.RITeam /*String*/  = _riroute;
RDebugUtils.currentLine=188153869;
 //BA.debugLineNum = 188153869;BA.debugLine="ret.RIVehicle = RIReference";
_ret.RIVehicle /*String*/  = _rireference;
RDebugUtils.currentLine=188153870;
 //BA.debugLineNum = 188153870;BA.debugLine="ret.RINotes = RIDetails";
_ret.RINotes /*String*/  = _ridetails;
RDebugUtils.currentLine=188153871;
 //BA.debugLineNum = 188153871;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188153872;
 //BA.debugLineNum = 188153872;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestinfo  _makerequestinfoclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestinfoclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestinfo) Debug.delegate(null, "makerequestinfoclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._requestinfo _ret = null;
RDebugUtils.currentLine=188219392;
 //BA.debugLineNum = 188219392;BA.debugLine="Sub MakeRequestInfoClear As RequestInfo";
RDebugUtils.currentLine=188219393;
 //BA.debugLineNum = 188219393;BA.debugLine="Dim ret As RequestInfo";
_ret = new xevolution.vrcg.devdemov2400.types._requestinfo();
RDebugUtils.currentLine=188219394;
 //BA.debugLineNum = 188219394;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188219395;
 //BA.debugLineNum = 188219395;BA.debugLine="ret.Request = \"\"";
_ret.Request /*String*/  = "";
RDebugUtils.currentLine=188219396;
 //BA.debugLineNum = 188219396;BA.debugLine="ret.RIEntity = \"\"";
_ret.RIEntity /*String*/  = "";
RDebugUtils.currentLine=188219397;
 //BA.debugLineNum = 188219397;BA.debugLine="ret.RIObject = \"\"";
_ret.RIObject /*String*/  = "";
RDebugUtils.currentLine=188219398;
 //BA.debugLineNum = 188219398;BA.debugLine="ret.RITypeRequest = \"\"";
_ret.RITypeRequest /*String*/  = "";
RDebugUtils.currentLine=188219399;
 //BA.debugLineNum = 188219399;BA.debugLine="ret.RITechnical = \"\"";
_ret.RITechnical /*String*/  = "";
RDebugUtils.currentLine=188219400;
 //BA.debugLineNum = 188219400;BA.debugLine="ret.RITeam = \"\"";
_ret.RITeam /*String*/  = "";
RDebugUtils.currentLine=188219401;
 //BA.debugLineNum = 188219401;BA.debugLine="ret.RIVehicle = \"\"";
_ret.RIVehicle /*String*/  = "";
RDebugUtils.currentLine=188219402;
 //BA.debugLineNum = 188219402;BA.debugLine="ret.RINotes = \"\"";
_ret.RINotes /*String*/  = "";
RDebugUtils.currentLine=188219403;
 //BA.debugLineNum = 188219403;BA.debugLine="ret.RITeam = \"\"";
_ret.RITeam /*String*/  = "";
RDebugUtils.currentLine=188219404;
 //BA.debugLineNum = 188219404;BA.debugLine="ret.RIVehicle = \"\"";
_ret.RIVehicle /*String*/  = "";
RDebugUtils.currentLine=188219405;
 //BA.debugLineNum = 188219405;BA.debugLine="ret.RINotes = \"\"";
_ret.RINotes /*String*/  = "";
RDebugUtils.currentLine=188219406;
 //BA.debugLineNum = 188219406;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188219407;
 //BA.debugLineNum = 188219407;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requesttaskinfo  _makerequesttaskinfo(anywheresoftware.b4a.BA _ba,int _requesttype,int _closetype,int _requestresult,String _requestresoptions,boolean _inpause,int _duration,float _points,int _risk,anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2,int _reqindex) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequesttaskinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requesttaskinfo) Debug.delegate(null, "makerequesttaskinfo", new Object[] {_ba,_requesttype,_closetype,_requestresult,_requestresoptions,_inpause,_duration,_points,_risk,_map1,_map2,_reqindex}));}
xevolution.vrcg.devdemov2400.types._requesttaskinfo _ret = null;
RDebugUtils.currentLine=189923328;
 //BA.debugLineNum = 189923328;BA.debugLine="Sub MakeRequestTaskInfo(RequestType As Int, CloseT";
RDebugUtils.currentLine=189923330;
 //BA.debugLineNum = 189923330;BA.debugLine="Dim ret As RequestTaskInfo";
_ret = new xevolution.vrcg.devdemov2400.types._requesttaskinfo();
RDebugUtils.currentLine=189923331;
 //BA.debugLineNum = 189923331;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189923332;
 //BA.debugLineNum = 189923332;BA.debugLine="ret.RequestType = RequestType";
_ret.RequestType /*int*/  = _requesttype;
RDebugUtils.currentLine=189923333;
 //BA.debugLineNum = 189923333;BA.debugLine="ret.CloseType = CloseType";
_ret.CloseType /*int*/  = _closetype;
RDebugUtils.currentLine=189923334;
 //BA.debugLineNum = 189923334;BA.debugLine="ret.RequestResult = RequestResult";
_ret.RequestResult /*int*/  = _requestresult;
RDebugUtils.currentLine=189923335;
 //BA.debugLineNum = 189923335;BA.debugLine="ret.RequestResOptions = RequestResOptions";
_ret.RequestResOptions /*String*/  = _requestresoptions;
RDebugUtils.currentLine=189923336;
 //BA.debugLineNum = 189923336;BA.debugLine="ret.InPause = InPause";
_ret.InPause /*boolean*/  = _inpause;
RDebugUtils.currentLine=189923337;
 //BA.debugLineNum = 189923337;BA.debugLine="ret.Duration = Duration";
_ret.Duration /*int*/  = _duration;
RDebugUtils.currentLine=189923338;
 //BA.debugLineNum = 189923338;BA.debugLine="ret.Points = Points";
_ret.Points /*float*/  = _points;
RDebugUtils.currentLine=189923339;
 //BA.debugLineNum = 189923339;BA.debugLine="ret.Risk = Risk";
_ret.Risk /*int*/  = _risk;
RDebugUtils.currentLine=189923340;
 //BA.debugLineNum = 189923340;BA.debugLine="If Map1.IsInitialized Then";
if (_map1.IsInitialized()) { 
RDebugUtils.currentLine=189923341;
 //BA.debugLineNum = 189923341;BA.debugLine="ret.Map1 = Map1";
_ret.Map1 /*anywheresoftware.b4a.objects.collections.Map*/  = _map1;
 }else {
RDebugUtils.currentLine=189923343;
 //BA.debugLineNum = 189923343;BA.debugLine="ret.Map1.Initialize";
_ret.Map1 /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=189923346;
 //BA.debugLineNum = 189923346;BA.debugLine="If Map2.IsInitialized Then";
if (_map2.IsInitialized()) { 
RDebugUtils.currentLine=189923347;
 //BA.debugLineNum = 189923347;BA.debugLine="ret.Map2 = Map2";
_ret.Map2 /*anywheresoftware.b4a.objects.collections.Map*/  = _map2;
 }else {
RDebugUtils.currentLine=189923349;
 //BA.debugLineNum = 189923349;BA.debugLine="ret.Map2.Initialize";
_ret.Map2 /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 };
RDebugUtils.currentLine=189923351;
 //BA.debugLineNum = 189923351;BA.debugLine="ret.ReqIndex = ReqIndex";
_ret.ReqIndex /*int*/  = _reqindex;
RDebugUtils.currentLine=189923352;
 //BA.debugLineNum = 189923352;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189923353;
 //BA.debugLineNum = 189923353;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestcla  _makerequestcla(anywheresoftware.b4a.BA _ba,String _request,String _action,String _task,int _repeatcounter,int _tasktype,xevolution.vrcg.devdemov2400.types._intervention _status,xevolution.vrcg.devdemov2400.types._requesttaskinfo _info,xevolution.vrcg.devdemov2400.types._othercla _other) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestcla", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestcla) Debug.delegate(null, "makerequestcla", new Object[] {_ba,_request,_action,_task,_repeatcounter,_tasktype,_status,_info,_other}));}
xevolution.vrcg.devdemov2400.types._requestcla _ret = null;
RDebugUtils.currentLine=190119936;
 //BA.debugLineNum = 190119936;BA.debugLine="Sub MakeRequestCLA(Request As String, Action As St";
RDebugUtils.currentLine=190119938;
 //BA.debugLineNum = 190119938;BA.debugLine="Dim ret As RequestCLA";
_ret = new xevolution.vrcg.devdemov2400.types._requestcla();
RDebugUtils.currentLine=190119939;
 //BA.debugLineNum = 190119939;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190119940;
 //BA.debugLineNum = 190119940;BA.debugLine="ret.Request = Request";
_ret.Request /*String*/  = _request;
RDebugUtils.currentLine=190119941;
 //BA.debugLineNum = 190119941;BA.debugLine="ret.Action = Action";
_ret.Action /*String*/  = _action;
RDebugUtils.currentLine=190119942;
 //BA.debugLineNum = 190119942;BA.debugLine="ret.Task = Task";
_ret.Task /*String*/  = _task;
RDebugUtils.currentLine=190119943;
 //BA.debugLineNum = 190119943;BA.debugLine="ret.RepeatCounter = RepeatCounter";
_ret.RepeatCounter /*int*/  = _repeatcounter;
RDebugUtils.currentLine=190119944;
 //BA.debugLineNum = 190119944;BA.debugLine="ret.TaskType = TaskType";
_ret.TaskType /*int*/  = _tasktype;
RDebugUtils.currentLine=190119945;
 //BA.debugLineNum = 190119945;BA.debugLine="ret.Status = Status";
_ret.Status /*xevolution.vrcg.devdemov2400.types._intervention*/  = _status;
RDebugUtils.currentLine=190119946;
 //BA.debugLineNum = 190119946;BA.debugLine="ret.Info = Info";
_ret.Info /*xevolution.vrcg.devdemov2400.types._requesttaskinfo*/  = _info;
RDebugUtils.currentLine=190119947;
 //BA.debugLineNum = 190119947;BA.debugLine="ret.Other = Other";
_ret.Other /*xevolution.vrcg.devdemov2400.types._othercla*/  = _other;
RDebugUtils.currentLine=190119948;
 //BA.debugLineNum = 190119948;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190119949;
 //BA.debugLineNum = 190119949;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._intervention  _makeinterv(anywheresoftware.b4a.BA _ba,int _id,String _code,int _status,int _color) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeinterv", false))
	 {return ((xevolution.vrcg.devdemov2400.types._intervention) Debug.delegate(null, "makeinterv", new Object[] {_ba,_id,_code,_status,_color}));}
xevolution.vrcg.devdemov2400.types._intervention _ret = null;
RDebugUtils.currentLine=191365120;
 //BA.debugLineNum = 191365120;BA.debugLine="Sub MakeInterv(id As Int, code As String, status A";
RDebugUtils.currentLine=191365121;
 //BA.debugLineNum = 191365121;BA.debugLine="Dim ret As Intervention";
_ret = new xevolution.vrcg.devdemov2400.types._intervention();
RDebugUtils.currentLine=191365122;
 //BA.debugLineNum = 191365122;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=191365123;
 //BA.debugLineNum = 191365123;BA.debugLine="ret.id = id";
_ret.id /*int*/  = _id;
RDebugUtils.currentLine=191365124;
 //BA.debugLineNum = 191365124;BA.debugLine="ret.code = code";
_ret.code /*String*/  = _code;
RDebugUtils.currentLine=191365125;
 //BA.debugLineNum = 191365125;BA.debugLine="ret.color = color";
_ret.color /*int*/  = _color;
RDebugUtils.currentLine=191365126;
 //BA.debugLineNum = 191365126;BA.debugLine="ret.status = status";
_ret.status /*int*/  = _status;
RDebugUtils.currentLine=191365127;
 //BA.debugLineNum = 191365127;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=191365128;
 //BA.debugLineNum = 191365128;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._othercla  _makeothercla(anywheresoftware.b4a.BA _ba,String _filter,String _filter2,String _filter3) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeothercla", false))
	 {return ((xevolution.vrcg.devdemov2400.types._othercla) Debug.delegate(null, "makeothercla", new Object[] {_ba,_filter,_filter2,_filter3}));}
xevolution.vrcg.devdemov2400.types._othercla _ret = null;
RDebugUtils.currentLine=190185472;
 //BA.debugLineNum = 190185472;BA.debugLine="Sub MakeOtherCLA(Filter As String, Filter2 As Stri";
RDebugUtils.currentLine=190185473;
 //BA.debugLineNum = 190185473;BA.debugLine="Dim ret As OtherCLA";
_ret = new xevolution.vrcg.devdemov2400.types._othercla();
RDebugUtils.currentLine=190185474;
 //BA.debugLineNum = 190185474;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190185475;
 //BA.debugLineNum = 190185475;BA.debugLine="ret.Filter = Filter";
_ret.Filter /*String*/  = _filter;
RDebugUtils.currentLine=190185476;
 //BA.debugLineNum = 190185476;BA.debugLine="ret.Filter2 = Filter2";
_ret.Filter2 /*String*/  = _filter2;
RDebugUtils.currentLine=190185477;
 //BA.debugLineNum = 190185477;BA.debugLine="ret.Filter3 = Filter3";
_ret.Filter3 /*String*/  = _filter3;
RDebugUtils.currentLine=190185478;
 //BA.debugLineNum = 190185478;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190185479;
 //BA.debugLineNum = 190185479;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestclaitem  _makerequestclaitem(anywheresoftware.b4a.BA _ba,String _request,String _action,String _task,String _item,String _uniquekey,String _tagcode,int _repeatcounter,int _repeatitemcounter,int _repeatfieldcounter,String _title,String _answer,String _value,int _origin,int _baseimage,int _onreport,String _tagobject,xevolution.vrcg.devdemov2400.types._clataskitem _taskinfo,String _selectscript) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestclaitem", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestclaitem) Debug.delegate(null, "makerequestclaitem", new Object[] {_ba,_request,_action,_task,_item,_uniquekey,_tagcode,_repeatcounter,_repeatitemcounter,_repeatfieldcounter,_title,_answer,_value,_origin,_baseimage,_onreport,_tagobject,_taskinfo,_selectscript}));}
xevolution.vrcg.devdemov2400.types._requestclaitem _ret = null;
RDebugUtils.currentLine=190054400;
 //BA.debugLineNum = 190054400;BA.debugLine="Sub MakeRequestCLAItem(Request As String, Action A";
RDebugUtils.currentLine=190054404;
 //BA.debugLineNum = 190054404;BA.debugLine="Dim ret As RequestCLAItem";
_ret = new xevolution.vrcg.devdemov2400.types._requestclaitem();
RDebugUtils.currentLine=190054405;
 //BA.debugLineNum = 190054405;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190054406;
 //BA.debugLineNum = 190054406;BA.debugLine="ret.Request = Request";
_ret.Request /*String*/  = _request;
RDebugUtils.currentLine=190054407;
 //BA.debugLineNum = 190054407;BA.debugLine="ret.Action = Action";
_ret.Action /*String*/  = _action;
RDebugUtils.currentLine=190054408;
 //BA.debugLineNum = 190054408;BA.debugLine="ret.Task = Task";
_ret.Task /*String*/  = _task;
RDebugUtils.currentLine=190054409;
 //BA.debugLineNum = 190054409;BA.debugLine="ret.Item = Item";
_ret.Item /*String*/  = _item;
RDebugUtils.currentLine=190054410;
 //BA.debugLineNum = 190054410;BA.debugLine="ret.UniqueKey = UniqueKey";
_ret.UniqueKey /*String*/  = _uniquekey;
RDebugUtils.currentLine=190054411;
 //BA.debugLineNum = 190054411;BA.debugLine="ret.Tagcode = Tagcode";
_ret.Tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=190054412;
 //BA.debugLineNum = 190054412;BA.debugLine="ret.RepeatCounter = RepeatCounter";
_ret.RepeatCounter /*int*/  = _repeatcounter;
RDebugUtils.currentLine=190054413;
 //BA.debugLineNum = 190054413;BA.debugLine="ret.RepeatItemCounter = RepeatItemCounter";
_ret.RepeatItemCounter /*int*/  = _repeatitemcounter;
RDebugUtils.currentLine=190054414;
 //BA.debugLineNum = 190054414;BA.debugLine="ret.repeatfieldcounter = repeatfieldcounter";
_ret.repeatfieldcounter /*int*/  = _repeatfieldcounter;
RDebugUtils.currentLine=190054415;
 //BA.debugLineNum = 190054415;BA.debugLine="ret.Title = Title";
_ret.Title /*String*/  = _title;
RDebugUtils.currentLine=190054416;
 //BA.debugLineNum = 190054416;BA.debugLine="ret.Answer = Answer";
_ret.Answer /*String*/  = _answer;
RDebugUtils.currentLine=190054417;
 //BA.debugLineNum = 190054417;BA.debugLine="ret.Value = Value";
_ret.Value /*String*/  = _value;
RDebugUtils.currentLine=190054418;
 //BA.debugLineNum = 190054418;BA.debugLine="ret.Origin = Origin";
_ret.Origin /*int*/  = _origin;
RDebugUtils.currentLine=190054419;
 //BA.debugLineNum = 190054419;BA.debugLine="ret.BaseImage = BaseImage";
_ret.BaseImage /*int*/  = _baseimage;
RDebugUtils.currentLine=190054420;
 //BA.debugLineNum = 190054420;BA.debugLine="ret.OnReport = OnReport";
_ret.OnReport /*int*/  = _onreport;
RDebugUtils.currentLine=190054421;
 //BA.debugLineNum = 190054421;BA.debugLine="ret.TagObject = TagObject";
_ret.TagObject /*String*/  = _tagobject;
RDebugUtils.currentLine=190054422;
 //BA.debugLineNum = 190054422;BA.debugLine="ret.TaskInfo = TaskInfo";
_ret.TaskInfo /*xevolution.vrcg.devdemov2400.types._clataskitem*/  = _taskinfo;
RDebugUtils.currentLine=190054423;
 //BA.debugLineNum = 190054423;BA.debugLine="ret.SelectScript = SelectScript";
_ret.SelectScript /*String*/  = _selectscript;
RDebugUtils.currentLine=190054424;
 //BA.debugLineNum = 190054424;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190054425;
 //BA.debugLineNum = 190054425;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._mandatoryrecords  _makemandatoryrecords(anywheresoftware.b4a.BA _ba,String _item_tagcode,int _mandatory,int _bullet_master,int _bullet_child,boolean _enabled,boolean _value_in) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makemandatoryrecords", false))
	 {return ((xevolution.vrcg.devdemov2400.types._mandatoryrecords) Debug.delegate(null, "makemandatoryrecords", new Object[] {_ba,_item_tagcode,_mandatory,_bullet_master,_bullet_child,_enabled,_value_in}));}
xevolution.vrcg.devdemov2400.types._mandatoryrecords _ret = null;
RDebugUtils.currentLine=187564032;
 //BA.debugLineNum = 187564032;BA.debugLine="Sub MakeMandatoryRecords(item_tagcode As String, m";
RDebugUtils.currentLine=187564033;
 //BA.debugLineNum = 187564033;BA.debugLine="Dim ret As MandatoryRecords";
_ret = new xevolution.vrcg.devdemov2400.types._mandatoryrecords();
RDebugUtils.currentLine=187564034;
 //BA.debugLineNum = 187564034;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187564035;
 //BA.debugLineNum = 187564035;BA.debugLine="ret.item_tagcode = item_tagcode";
_ret.item_tagcode /*String*/  = _item_tagcode;
RDebugUtils.currentLine=187564036;
 //BA.debugLineNum = 187564036;BA.debugLine="ret.mandatory = mandatory";
_ret.mandatory /*int*/  = _mandatory;
RDebugUtils.currentLine=187564037;
 //BA.debugLineNum = 187564037;BA.debugLine="ret.bullet_master = bullet_master";
_ret.bullet_master /*int*/  = _bullet_master;
RDebugUtils.currentLine=187564038;
 //BA.debugLineNum = 187564038;BA.debugLine="ret.bullet_child = bullet_child";
_ret.bullet_child /*int*/  = _bullet_child;
RDebugUtils.currentLine=187564039;
 //BA.debugLineNum = 187564039;BA.debugLine="ret.Enabled = Enabled";
_ret.Enabled /*boolean*/  = _enabled;
RDebugUtils.currentLine=187564040;
 //BA.debugLineNum = 187564040;BA.debugLine="ret.value_in = value_in";
_ret.value_in /*boolean*/  = _value_in;
RDebugUtils.currentLine=187564041;
 //BA.debugLineNum = 187564041;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187564042;
 //BA.debugLineNum = 187564042;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._otherreturnvalues  _makeotherreturnvalues(anywheresoftware.b4a.BA _ba,String _retvalue,boolean _retsave,String _rettag) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeotherreturnvalues", false))
	 {return ((xevolution.vrcg.devdemov2400.types._otherreturnvalues) Debug.delegate(null, "makeotherreturnvalues", new Object[] {_ba,_retvalue,_retsave,_rettag}));}
xevolution.vrcg.devdemov2400.types._otherreturnvalues _res = null;
RDebugUtils.currentLine=187301888;
 //BA.debugLineNum = 187301888;BA.debugLine="Sub MakeOtherReturnValues(RetValue As String, RetS";
RDebugUtils.currentLine=187301889;
 //BA.debugLineNum = 187301889;BA.debugLine="Dim res As OtherReturnValues";
_res = new xevolution.vrcg.devdemov2400.types._otherreturnvalues();
RDebugUtils.currentLine=187301890;
 //BA.debugLineNum = 187301890;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=187301891;
 //BA.debugLineNum = 187301891;BA.debugLine="res.RetValue = RetValue";
_res.RetValue /*String*/  = _retvalue;
RDebugUtils.currentLine=187301892;
 //BA.debugLineNum = 187301892;BA.debugLine="res.RetSave = RetSave";
_res.RetSave /*boolean*/  = _retsave;
RDebugUtils.currentLine=187301893;
 //BA.debugLineNum = 187301893;BA.debugLine="res.RetTag = RetTag";
_res.RetTag /*String*/  = _rettag;
RDebugUtils.currentLine=187301894;
 //BA.debugLineNum = 187301894;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=187301895;
 //BA.debugLineNum = 187301895;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._componentrecords  _makecomponentrecords(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _component,int _idgroup,String _item_tagcode,int _height,int _repeatitemcounter,int _repeatfieldcounter,boolean _enabled) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecomponentrecords", false))
	 {return ((xevolution.vrcg.devdemov2400.types._componentrecords) Debug.delegate(null, "makecomponentrecords", new Object[] {_ba,_component,_idgroup,_item_tagcode,_height,_repeatitemcounter,_repeatfieldcounter,_enabled}));}
xevolution.vrcg.devdemov2400.types._componentrecords _ret = null;
RDebugUtils.currentLine=187498496;
 //BA.debugLineNum = 187498496;BA.debugLine="Sub MakeComponentRecords(component As B4XView, idg";
RDebugUtils.currentLine=187498497;
 //BA.debugLineNum = 187498497;BA.debugLine="Dim ret As ComponentRecords";
_ret = new xevolution.vrcg.devdemov2400.types._componentrecords();
RDebugUtils.currentLine=187498498;
 //BA.debugLineNum = 187498498;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187498499;
 //BA.debugLineNum = 187498499;BA.debugLine="ret.component = component";
_ret.component /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _component;
RDebugUtils.currentLine=187498500;
 //BA.debugLineNum = 187498500;BA.debugLine="ret.idgroup = idgroup";
_ret.idgroup /*int*/  = _idgroup;
RDebugUtils.currentLine=187498501;
 //BA.debugLineNum = 187498501;BA.debugLine="ret.item_tagcode = item_tagcode";
_ret.item_tagcode /*String*/  = _item_tagcode;
RDebugUtils.currentLine=187498502;
 //BA.debugLineNum = 187498502;BA.debugLine="ret.Height = Height";
_ret.Height /*int*/  = _height;
RDebugUtils.currentLine=187498503;
 //BA.debugLineNum = 187498503;BA.debugLine="ret.RepeatItemCounter = RepeatItemCounter";
_ret.RepeatItemCounter /*int*/  = _repeatitemcounter;
RDebugUtils.currentLine=187498504;
 //BA.debugLineNum = 187498504;BA.debugLine="ret.RepeatFieldCounter = RepeatFieldCounter";
_ret.RepeatFieldCounter /*int*/  = _repeatfieldcounter;
RDebugUtils.currentLine=187498505;
 //BA.debugLineNum = 187498505;BA.debugLine="ret.Enabled = Enabled";
_ret.Enabled /*boolean*/  = _enabled;
RDebugUtils.currentLine=187498506;
 //BA.debugLineNum = 187498506;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187498507;
 //BA.debugLineNum = 187498507;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requesttaskinfo  _makerequesttaskinfoclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequesttaskinfoclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requesttaskinfo) Debug.delegate(null, "makerequesttaskinfoclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._requesttaskinfo _ret = null;
RDebugUtils.currentLine=189988864;
 //BA.debugLineNum = 189988864;BA.debugLine="Sub MakeRequestTaskInfoClear As RequestTaskInfo";
RDebugUtils.currentLine=189988865;
 //BA.debugLineNum = 189988865;BA.debugLine="Dim ret As RequestTaskInfo";
_ret = new xevolution.vrcg.devdemov2400.types._requesttaskinfo();
RDebugUtils.currentLine=189988866;
 //BA.debugLineNum = 189988866;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189988867;
 //BA.debugLineNum = 189988867;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189988868;
 //BA.debugLineNum = 189988868;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._singleclaitem  _makesingleclaitem(anywheresoftware.b4a.BA _ba,String _request_tc,String _task_tc,String _item_tc,String _uk,String _tc,int _rc,int _ric,int _rfc) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makesingleclaitem", false))
	 {return ((xevolution.vrcg.devdemov2400.types._singleclaitem) Debug.delegate(null, "makesingleclaitem", new Object[] {_ba,_request_tc,_task_tc,_item_tc,_uk,_tc,_rc,_ric,_rfc}));}
xevolution.vrcg.devdemov2400.types._singleclaitem _res = null;
RDebugUtils.currentLine=186777600;
 //BA.debugLineNum = 186777600;BA.debugLine="Sub MakeSingleCLAItem(request_tc As String, task_t";
RDebugUtils.currentLine=186777601;
 //BA.debugLineNum = 186777601;BA.debugLine="Dim res As SingleCLAItem";
_res = new xevolution.vrcg.devdemov2400.types._singleclaitem();
RDebugUtils.currentLine=186777602;
 //BA.debugLineNum = 186777602;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=186777603;
 //BA.debugLineNum = 186777603;BA.debugLine="res.request_tc = request_tc";
_res.request_tc /*String*/  = _request_tc;
RDebugUtils.currentLine=186777604;
 //BA.debugLineNum = 186777604;BA.debugLine="res.task_tc = task_tc";
_res.task_tc /*String*/  = _task_tc;
RDebugUtils.currentLine=186777605;
 //BA.debugLineNum = 186777605;BA.debugLine="res.item_tc = item_tc";
_res.item_tc /*String*/  = _item_tc;
RDebugUtils.currentLine=186777606;
 //BA.debugLineNum = 186777606;BA.debugLine="res.uk = uk";
_res.uk /*String*/  = _uk;
RDebugUtils.currentLine=186777607;
 //BA.debugLineNum = 186777607;BA.debugLine="res.tc = tc";
_res.tc /*String*/  = _tc;
RDebugUtils.currentLine=186777608;
 //BA.debugLineNum = 186777608;BA.debugLine="res.rc = rc";
_res.rc /*int*/  = _rc;
RDebugUtils.currentLine=186777609;
 //BA.debugLineNum = 186777609;BA.debugLine="res.ric = ric";
_res.ric /*int*/  = _ric;
RDebugUtils.currentLine=186777610;
 //BA.debugLineNum = 186777610;BA.debugLine="res.rfc = rfc";
_res.rfc /*int*/  = _rfc;
RDebugUtils.currentLine=186777611;
 //BA.debugLineNum = 186777611;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=186777612;
 //BA.debugLineNum = 186777612;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._mnowtu  _makemnowtu(anywheresoftware.b4a.BA _ba,int _make_new_object,int _upd_existing_object,int _where_to_update,int _cl_is_father,int _requesttypegroup,String _objecttagvalue,String _object_type,String _objecttagrelvalue,String _object_type_rel,String _realobjectrelationtochange,String _realobjecttochange,xevolution.vrcg.devdemov2400.types._newobjecttags _resinsert) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makemnowtu", false))
	 {return ((xevolution.vrcg.devdemov2400.types._mnowtu) Debug.delegate(null, "makemnowtu", new Object[] {_ba,_make_new_object,_upd_existing_object,_where_to_update,_cl_is_father,_requesttypegroup,_objecttagvalue,_object_type,_objecttagrelvalue,_object_type_rel,_realobjectrelationtochange,_realobjecttochange,_resinsert}));}
xevolution.vrcg.devdemov2400.types._mnowtu _ret = null;
RDebugUtils.currentLine=187367424;
 //BA.debugLineNum = 187367424;BA.debugLine="Sub MakeMNOWTU( MAKE_New_Object As Int, UPD_Existi";
RDebugUtils.currentLine=187367428;
 //BA.debugLineNum = 187367428;BA.debugLine="Dim ret As MNOWTU";
_ret = new xevolution.vrcg.devdemov2400.types._mnowtu();
RDebugUtils.currentLine=187367429;
 //BA.debugLineNum = 187367429;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187367430;
 //BA.debugLineNum = 187367430;BA.debugLine="ret.MAKE_New_Object = MAKE_New_Object";
_ret.MAKE_New_Object /*int*/  = _make_new_object;
RDebugUtils.currentLine=187367431;
 //BA.debugLineNum = 187367431;BA.debugLine="ret.UPD_Existing_Object = UPD_Existing_Object";
_ret.UPD_Existing_Object /*int*/  = _upd_existing_object;
RDebugUtils.currentLine=187367432;
 //BA.debugLineNum = 187367432;BA.debugLine="ret.WHERE_To_Update = WHERE_To_Update";
_ret.WHERE_To_Update /*int*/  = _where_to_update;
RDebugUtils.currentLine=187367433;
 //BA.debugLineNum = 187367433;BA.debugLine="ret.cl_is_father = cl_is_father";
_ret.cl_is_father /*int*/  = _cl_is_father;
RDebugUtils.currentLine=187367434;
 //BA.debugLineNum = 187367434;BA.debugLine="ret.RequestTypeGroup = RequestTypeGroup";
_ret.RequestTypeGroup /*int*/  = _requesttypegroup;
RDebugUtils.currentLine=187367435;
 //BA.debugLineNum = 187367435;BA.debugLine="ret.objectTagValue = objectTagValue";
_ret.objectTagValue /*String*/  = _objecttagvalue;
RDebugUtils.currentLine=187367436;
 //BA.debugLineNum = 187367436;BA.debugLine="ret.object_type = object_type";
_ret.object_type /*String*/  = _object_type;
RDebugUtils.currentLine=187367437;
 //BA.debugLineNum = 187367437;BA.debugLine="ret.objectTagRelValue = objectTagRelValue";
_ret.objectTagRelValue /*String*/  = _objecttagrelvalue;
RDebugUtils.currentLine=187367438;
 //BA.debugLineNum = 187367438;BA.debugLine="ret.object_type_rel = object_type_rel";
_ret.object_type_rel /*String*/  = _object_type_rel;
RDebugUtils.currentLine=187367439;
 //BA.debugLineNum = 187367439;BA.debugLine="ret.RealObjectRelationToChange = RealObjectRelati";
_ret.RealObjectRelationToChange /*String*/  = _realobjectrelationtochange;
RDebugUtils.currentLine=187367440;
 //BA.debugLineNum = 187367440;BA.debugLine="ret.RealObjectToChange = RealObjectToChange";
_ret.RealObjectToChange /*String*/  = _realobjecttochange;
RDebugUtils.currentLine=187367441;
 //BA.debugLineNum = 187367441;BA.debugLine="ret.ResInsert = ResInsert";
_ret.ResInsert /*xevolution.vrcg.devdemov2400.types._newobjecttags*/  = _resinsert;
RDebugUtils.currentLine=187367442;
 //BA.debugLineNum = 187367442;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187367443;
 //BA.debugLineNum = 187367443;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._newobjecttags  _makenewobjecttagsclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makenewobjecttagsclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._newobjecttags) Debug.delegate(null, "makenewobjecttagsclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._newobjecttags _ret = null;
RDebugUtils.currentLine=187826176;
 //BA.debugLineNum = 187826176;BA.debugLine="Sub MakeNewObjectTagsClear As NewObjectTags";
RDebugUtils.currentLine=187826177;
 //BA.debugLineNum = 187826177;BA.debugLine="Dim ret As NewObjectTags";
_ret = new xevolution.vrcg.devdemov2400.types._newobjecttags();
RDebugUtils.currentLine=187826178;
 //BA.debugLineNum = 187826178;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187826179;
 //BA.debugLineNum = 187826179;BA.debugLine="ret.ObjectTag = \"\"";
_ret.ObjectTag /*String*/  = "";
RDebugUtils.currentLine=187826180;
 //BA.debugLineNum = 187826180;BA.debugLine="ret.AddressTag = \"\"";
_ret.AddressTag /*String*/  = "";
RDebugUtils.currentLine=187826181;
 //BA.debugLineNum = 187826181;BA.debugLine="ret.ContactTag = \"\"";
_ret.ContactTag /*String*/  = "";
RDebugUtils.currentLine=187826182;
 //BA.debugLineNum = 187826182;BA.debugLine="ret.FieldsTag.Initialize";
_ret.FieldsTag /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=187826183;
 //BA.debugLineNum = 187826183;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187826184;
 //BA.debugLineNum = 187826184;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._chapterrow  _makechapterrow(anywheresoftware.b4a.BA _ba,int _id,String _itemtagcode,anywheresoftware.b4a.objects.PanelWrapper _rootpanel,anywheresoftware.b4a.objects.PanelWrapper _panelexpanded,boolean _readonly,boolean _canexpand,boolean _itemsloaded,boolean _reloaditems) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makechapterrow", false))
	 {return ((xevolution.vrcg.devdemov2400.types._chapterrow) Debug.delegate(null, "makechapterrow", new Object[] {_ba,_id,_itemtagcode,_rootpanel,_panelexpanded,_readonly,_canexpand,_itemsloaded,_reloaditems}));}
xevolution.vrcg.devdemov2400.types._chapterrow _res = null;
RDebugUtils.currentLine=186908672;
 //BA.debugLineNum = 186908672;BA.debugLine="Sub MakeChapterRow(ID As Int, ItemTagcode As Strin";
RDebugUtils.currentLine=186908673;
 //BA.debugLineNum = 186908673;BA.debugLine="Dim res As ChapterRow";
_res = new xevolution.vrcg.devdemov2400.types._chapterrow();
RDebugUtils.currentLine=186908674;
 //BA.debugLineNum = 186908674;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=186908675;
 //BA.debugLineNum = 186908675;BA.debugLine="res.ID = ID";
_res.ID /*int*/  = _id;
RDebugUtils.currentLine=186908676;
 //BA.debugLineNum = 186908676;BA.debugLine="res.ItemTagcode = ItemTagcode";
_res.ItemTagcode /*String*/  = _itemtagcode;
RDebugUtils.currentLine=186908677;
 //BA.debugLineNum = 186908677;BA.debugLine="res.RootPanel = RootPanel";
_res.RootPanel /*anywheresoftware.b4a.objects.PanelWrapper*/  = _rootpanel;
RDebugUtils.currentLine=186908678;
 //BA.debugLineNum = 186908678;BA.debugLine="res.PanelExpanded = PanelExpanded";
_res.PanelExpanded /*anywheresoftware.b4a.objects.PanelWrapper*/  = _panelexpanded;
RDebugUtils.currentLine=186908679;
 //BA.debugLineNum = 186908679;BA.debugLine="res.ReadOnly = ReadOnly";
_res.ReadOnly /*boolean*/  = _readonly;
RDebugUtils.currentLine=186908680;
 //BA.debugLineNum = 186908680;BA.debugLine="res.CanExpand = CanExpand";
_res.CanExpand /*boolean*/  = _canexpand;
RDebugUtils.currentLine=186908681;
 //BA.debugLineNum = 186908681;BA.debugLine="res.ItemsLoaded = ItemsLoaded";
_res.ItemsLoaded /*boolean*/  = _itemsloaded;
RDebugUtils.currentLine=186908682;
 //BA.debugLineNum = 186908682;BA.debugLine="res.ReloadItems = ReloadItems";
_res.ReloadItems /*boolean*/  = _reloaditems;
RDebugUtils.currentLine=186908683;
 //BA.debugLineNum = 186908683;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=186908684;
 //BA.debugLineNum = 186908684;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._imageviewdata  _makeimageviewdata(anywheresoftware.b4a.BA _ba,String _b64,String _filename) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeimageviewdata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._imageviewdata) Debug.delegate(null, "makeimageviewdata", new Object[] {_ba,_b64,_filename}));}
xevolution.vrcg.devdemov2400.types._imageviewdata _ret = null;
RDebugUtils.currentLine=189005824;
 //BA.debugLineNum = 189005824;BA.debugLine="Sub MakeImageViewData(b64 As String, filename As S";
RDebugUtils.currentLine=189005825;
 //BA.debugLineNum = 189005825;BA.debugLine="Dim ret As ImageViewData";
_ret = new xevolution.vrcg.devdemov2400.types._imageviewdata();
RDebugUtils.currentLine=189005826;
 //BA.debugLineNum = 189005826;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189005827;
 //BA.debugLineNum = 189005827;BA.debugLine="ret.b64 = b64";
_ret.b64 /*String*/  = _b64;
RDebugUtils.currentLine=189005828;
 //BA.debugLineNum = 189005828;BA.debugLine="ret.filename = filename";
_ret.filename /*String*/  = _filename;
RDebugUtils.currentLine=189005829;
 //BA.debugLineNum = 189005829;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189005830;
 //BA.debugLineNum = 189005830;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._extrainfo  _makeextrainfo(anywheresoftware.b4a.BA _ba,String _titleinfo,String _txtinfo,String _itc,int _rc,int _ric,int _rfc) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeextrainfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._extrainfo) Debug.delegate(null, "makeextrainfo", new Object[] {_ba,_titleinfo,_txtinfo,_itc,_rc,_ric,_rfc}));}
xevolution.vrcg.devdemov2400.types._extrainfo _exinfo = null;
RDebugUtils.currentLine=192020480;
 //BA.debugLineNum = 192020480;BA.debugLine="Sub MakeExtraInfo(TitleInfo As String, TxtInfo As";
RDebugUtils.currentLine=192020481;
 //BA.debugLineNum = 192020481;BA.debugLine="Private eXInfo As ExtraInfo";
_exinfo = new xevolution.vrcg.devdemov2400.types._extrainfo();
RDebugUtils.currentLine=192020482;
 //BA.debugLineNum = 192020482;BA.debugLine="eXInfo.Initialize";
_exinfo.Initialize();
RDebugUtils.currentLine=192020483;
 //BA.debugLineNum = 192020483;BA.debugLine="eXInfo.titleinfo = TitleInfo";
_exinfo.titleinfo /*String*/  = _titleinfo;
RDebugUtils.currentLine=192020484;
 //BA.debugLineNum = 192020484;BA.debugLine="eXInfo.textoInfo = TxtInfo";
_exinfo.textoInfo /*String*/  = _txtinfo;
RDebugUtils.currentLine=192020485;
 //BA.debugLineNum = 192020485;BA.debugLine="eXInfo.item_tagcode = ITC";
_exinfo.item_tagcode /*String*/  = _itc;
RDebugUtils.currentLine=192020486;
 //BA.debugLineNum = 192020486;BA.debugLine="eXInfo.rc = rc";
_exinfo.rc /*int*/  = _rc;
RDebugUtils.currentLine=192020487;
 //BA.debugLineNum = 192020487;BA.debugLine="eXInfo.ric = ric";
_exinfo.ric /*int*/  = _ric;
RDebugUtils.currentLine=192020488;
 //BA.debugLineNum = 192020488;BA.debugLine="eXInfo.rfc = rfc";
_exinfo.rfc /*int*/  = _rfc;
RDebugUtils.currentLine=192020489;
 //BA.debugLineNum = 192020489;BA.debugLine="Return eXInfo";
if (true) return _exinfo;
RDebugUtils.currentLine=192020490;
 //BA.debugLineNum = 192020490;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._b4xsrecords  _makeb4xsrecords(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.b4xstatebutton _component,int _idgroup,int _iditem,String _item_tagcode,boolean _enabled,String _answer_tagcode) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeb4xsrecords", false))
	 {return ((xevolution.vrcg.devdemov2400.types._b4xsrecords) Debug.delegate(null, "makeb4xsrecords", new Object[] {_ba,_component,_idgroup,_iditem,_item_tagcode,_enabled,_answer_tagcode}));}
xevolution.vrcg.devdemov2400.types._b4xsrecords _ret = null;
RDebugUtils.currentLine=187432960;
 //BA.debugLineNum = 187432960;BA.debugLine="Sub MakeB4XSRecords(component As B4XStateButton, i";
RDebugUtils.currentLine=187432961;
 //BA.debugLineNum = 187432961;BA.debugLine="Dim ret As B4XSRecords";
_ret = new xevolution.vrcg.devdemov2400.types._b4xsrecords();
RDebugUtils.currentLine=187432962;
 //BA.debugLineNum = 187432962;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187432963;
 //BA.debugLineNum = 187432963;BA.debugLine="ret.component = component";
_ret.component /*xevolution.vrcg.devdemov2400.b4xstatebutton*/  = _component;
RDebugUtils.currentLine=187432964;
 //BA.debugLineNum = 187432964;BA.debugLine="ret.idgroup = idgroup";
_ret.idgroup /*int*/  = _idgroup;
RDebugUtils.currentLine=187432965;
 //BA.debugLineNum = 187432965;BA.debugLine="ret.iditem = iditem";
_ret.iditem /*int*/  = _iditem;
RDebugUtils.currentLine=187432966;
 //BA.debugLineNum = 187432966;BA.debugLine="ret.item_tagcode = item_tagcode";
_ret.item_tagcode /*String*/  = _item_tagcode;
RDebugUtils.currentLine=187432967;
 //BA.debugLineNum = 187432967;BA.debugLine="ret.Enabled = Enabled";
_ret.Enabled /*boolean*/  = _enabled;
RDebugUtils.currentLine=187432968;
 //BA.debugLineNum = 187432968;BA.debugLine="ret.answer_tagcode = answer_tagcode";
_ret.answer_tagcode /*String*/  = _answer_tagcode;
RDebugUtils.currentLine=187432969;
 //BA.debugLineNum = 187432969;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187432970;
 //BA.debugLineNum = 187432970;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._fieldreference  _makefieldreference(anywheresoftware.b4a.BA _ba,String _tagname,anywheresoftware.b4a.objects.B4XViewWrapper _tagobject,int _fieldcounter) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makefieldreference", false))
	 {return ((xevolution.vrcg.devdemov2400.types._fieldreference) Debug.delegate(null, "makefieldreference", new Object[] {_ba,_tagname,_tagobject,_fieldcounter}));}
xevolution.vrcg.devdemov2400.types._fieldreference _ret = null;
RDebugUtils.currentLine=187629568;
 //BA.debugLineNum = 187629568;BA.debugLine="Sub MakeFieldReference(tagname As String, tagobjec";
RDebugUtils.currentLine=187629569;
 //BA.debugLineNum = 187629569;BA.debugLine="Dim ret As FieldReference";
_ret = new xevolution.vrcg.devdemov2400.types._fieldreference();
RDebugUtils.currentLine=187629570;
 //BA.debugLineNum = 187629570;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187629571;
 //BA.debugLineNum = 187629571;BA.debugLine="ret.tagname = tagname";
_ret.tagname /*String*/  = _tagname;
RDebugUtils.currentLine=187629572;
 //BA.debugLineNum = 187629572;BA.debugLine="ret.tagobject = tagobject";
_ret.tagobject /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _tagobject;
RDebugUtils.currentLine=187629573;
 //BA.debugLineNum = 187629573;BA.debugLine="ret.FieldCounter = FieldCounter";
_ret.FieldCounter /*int*/  = _fieldcounter;
RDebugUtils.currentLine=187629574;
 //BA.debugLineNum = 187629574;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187629575;
 //BA.debugLineNum = 187629575;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._imageviewdata  _makeimageviewdataclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeimageviewdataclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._imageviewdata) Debug.delegate(null, "makeimageviewdataclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._imageviewdata _ret = null;
RDebugUtils.currentLine=189071360;
 //BA.debugLineNum = 189071360;BA.debugLine="Sub MakeImageViewDataClear As ImageViewData";
RDebugUtils.currentLine=189071361;
 //BA.debugLineNum = 189071361;BA.debugLine="Dim ret As ImageViewData";
_ret = new xevolution.vrcg.devdemov2400.types._imageviewdata();
RDebugUtils.currentLine=189071362;
 //BA.debugLineNum = 189071362;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189071363;
 //BA.debugLineNum = 189071363;BA.debugLine="ret.b64 = \"\"";
_ret.b64 /*String*/  = "";
RDebugUtils.currentLine=189071364;
 //BA.debugLineNum = 189071364;BA.debugLine="ret.filename = \"\"";
_ret.filename /*String*/  = "";
RDebugUtils.currentLine=189071365;
 //BA.debugLineNum = 189071365;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189071366;
 //BA.debugLineNum = 189071366;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._externaldocsinfo  _makeexternaldocsinfo(anywheresoftware.b4a.BA _ba,int _status,String _refdoc,String _refnumber,String _typedoc,String _externalid) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeexternaldocsinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._externaldocsinfo) Debug.delegate(null, "makeexternaldocsinfo", new Object[] {_ba,_status,_refdoc,_refnumber,_typedoc,_externalid}));}
xevolution.vrcg.devdemov2400.types._externaldocsinfo _ret = null;
RDebugUtils.currentLine=187695104;
 //BA.debugLineNum = 187695104;BA.debugLine="Sub MakeExternalDocsInfo(status As Int, refdoc As";
RDebugUtils.currentLine=187695105;
 //BA.debugLineNum = 187695105;BA.debugLine="Dim ret As ExternalDocsInfo";
_ret = new xevolution.vrcg.devdemov2400.types._externaldocsinfo();
RDebugUtils.currentLine=187695106;
 //BA.debugLineNum = 187695106;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187695107;
 //BA.debugLineNum = 187695107;BA.debugLine="ret.status = status";
_ret.status /*int*/  = _status;
RDebugUtils.currentLine=187695108;
 //BA.debugLineNum = 187695108;BA.debugLine="ret.refdoc = refdoc";
_ret.refdoc /*String*/  = _refdoc;
RDebugUtils.currentLine=187695109;
 //BA.debugLineNum = 187695109;BA.debugLine="ret.refnumber = refnumber";
_ret.refnumber /*String*/  = _refnumber;
RDebugUtils.currentLine=187695110;
 //BA.debugLineNum = 187695110;BA.debugLine="ret.typeDoc = typeDoc";
_ret.typeDoc /*String*/  = _typedoc;
RDebugUtils.currentLine=187695111;
 //BA.debugLineNum = 187695111;BA.debugLine="ret.externalID = externalID";
_ret.externalID /*String*/  = _externalid;
RDebugUtils.currentLine=187695112;
 //BA.debugLineNum = 187695112;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187695113;
 //BA.debugLineNum = 187695113;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestclaobs  _makerequestclaobs(anywheresoftware.b4a.BA _ba,boolean _child,xevolution.vrcg.devdemov2400.types._requestcla _cla,String _obs) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestclaobs", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestclaobs) Debug.delegate(null, "makerequestclaobs", new Object[] {_ba,_child,_cla,_obs}));}
xevolution.vrcg.devdemov2400.types._requestclaobs _ret = null;
RDebugUtils.currentLine=190251008;
 //BA.debugLineNum = 190251008;BA.debugLine="Sub MakeRequestCLAOBS(child As Boolean, cla As Req";
RDebugUtils.currentLine=190251009;
 //BA.debugLineNum = 190251009;BA.debugLine="Dim ret As RequestCLAOBS";
_ret = new xevolution.vrcg.devdemov2400.types._requestclaobs();
RDebugUtils.currentLine=190251010;
 //BA.debugLineNum = 190251010;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190251011;
 //BA.debugLineNum = 190251011;BA.debugLine="ret.child = child";
_ret.child /*boolean*/  = _child;
RDebugUtils.currentLine=190251012;
 //BA.debugLineNum = 190251012;BA.debugLine="ret.cla = cla";
_ret.cla /*xevolution.vrcg.devdemov2400.types._requestcla*/  = _cla;
RDebugUtils.currentLine=190251013;
 //BA.debugLineNum = 190251013;BA.debugLine="ret.Obs = Obs";
_ret.Obs /*String*/  = _obs;
RDebugUtils.currentLine=190251014;
 //BA.debugLineNum = 190251014;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190251015;
 //BA.debugLineNum = 190251015;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._newobjecttags  _makenewobjecttags(anywheresoftware.b4a.BA _ba,String _objecttag,String _addresstag,String _contacttag,anywheresoftware.b4a.objects.collections.List _fieldstag) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makenewobjecttags", false))
	 {return ((xevolution.vrcg.devdemov2400.types._newobjecttags) Debug.delegate(null, "makenewobjecttags", new Object[] {_ba,_objecttag,_addresstag,_contacttag,_fieldstag}));}
xevolution.vrcg.devdemov2400.types._newobjecttags _ret = null;
RDebugUtils.currentLine=187760640;
 //BA.debugLineNum = 187760640;BA.debugLine="Sub MakeNewObjectTags(ObjectTag As String, Address";
RDebugUtils.currentLine=187760641;
 //BA.debugLineNum = 187760641;BA.debugLine="Dim ret As NewObjectTags";
_ret = new xevolution.vrcg.devdemov2400.types._newobjecttags();
RDebugUtils.currentLine=187760642;
 //BA.debugLineNum = 187760642;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187760643;
 //BA.debugLineNum = 187760643;BA.debugLine="ret.ObjectTag = ObjectTag";
_ret.ObjectTag /*String*/  = _objecttag;
RDebugUtils.currentLine=187760644;
 //BA.debugLineNum = 187760644;BA.debugLine="ret.AddressTag = AddressTag";
_ret.AddressTag /*String*/  = _addresstag;
RDebugUtils.currentLine=187760645;
 //BA.debugLineNum = 187760645;BA.debugLine="ret.ContactTag = ContactTag";
_ret.ContactTag /*String*/  = _contacttag;
RDebugUtils.currentLine=187760646;
 //BA.debugLineNum = 187760646;BA.debugLine="If Not(FieldsTag.IsInitialized) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_fieldstag.IsInitialized())) { 
RDebugUtils.currentLine=187760647;
 //BA.debugLineNum = 187760647;BA.debugLine="FieldsTag.Initialize";
_fieldstag.Initialize();
 };
RDebugUtils.currentLine=187760649;
 //BA.debugLineNum = 187760649;BA.debugLine="ret.FieldsTag = FieldsTag";
_ret.FieldsTag /*anywheresoftware.b4a.objects.collections.List*/  = _fieldstag;
RDebugUtils.currentLine=187760650;
 //BA.debugLineNum = 187760650;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187760651;
 //BA.debugLineNum = 187760651;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._resultoptions  _makeresultoptions(anywheresoftware.b4a.BA _ba,int _valint,String _valstr,String _valtitle) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeresultoptions", false))
	 {return ((xevolution.vrcg.devdemov2400.types._resultoptions) Debug.delegate(null, "makeresultoptions", new Object[] {_ba,_valint,_valstr,_valtitle}));}
xevolution.vrcg.devdemov2400.types._resultoptions _ret = null;
RDebugUtils.currentLine=189464576;
 //BA.debugLineNum = 189464576;BA.debugLine="Sub MakeResultOptions(ValInt As Int, ValStr As Str";
RDebugUtils.currentLine=189464577;
 //BA.debugLineNum = 189464577;BA.debugLine="Dim ret As ResultOptions";
_ret = new xevolution.vrcg.devdemov2400.types._resultoptions();
RDebugUtils.currentLine=189464578;
 //BA.debugLineNum = 189464578;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189464579;
 //BA.debugLineNum = 189464579;BA.debugLine="ret.ValInt = ValInt";
_ret.ValInt /*int*/  = _valint;
RDebugUtils.currentLine=189464580;
 //BA.debugLineNum = 189464580;BA.debugLine="ret.ValStr = ValStr";
_ret.ValStr /*String*/  = _valstr;
RDebugUtils.currentLine=189464581;
 //BA.debugLineNum = 189464581;BA.debugLine="ret.ValTitle = ValTitle";
_ret.ValTitle /*String*/  = _valtitle;
RDebugUtils.currentLine=189464582;
 //BA.debugLineNum = 189464582;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189464583;
 //BA.debugLineNum = 189464583;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._clataskitem  _makeclataskitemclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeclataskitemclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._clataskitem) Debug.delegate(null, "makeclataskitemclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._clataskitem _ret = null;
RDebugUtils.currentLine=188416000;
 //BA.debugLineNum = 188416000;BA.debugLine="Sub MakeCLATaskItemClear As CLATaskItem";
RDebugUtils.currentLine=188416001;
 //BA.debugLineNum = 188416001;BA.debugLine="Dim ret As CLATaskItem";
_ret = new xevolution.vrcg.devdemov2400.types._clataskitem();
RDebugUtils.currentLine=188416002;
 //BA.debugLineNum = 188416002;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188416003;
 //BA.debugLineNum = 188416003;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188416004;
 //BA.debugLineNum = 188416004;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._rowpanelinfo  _makerowpanelinfo(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.PanelWrapper _pan,int _height) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerowpanelinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._rowpanelinfo) Debug.delegate(null, "makerowpanelinfo", new Object[] {_ba,_pan,_height}));}
xevolution.vrcg.devdemov2400.types._rowpanelinfo _res = null;
RDebugUtils.currentLine=186843136;
 //BA.debugLineNum = 186843136;BA.debugLine="Sub MakeRowPanelInfo(Pan As Panel, Height As Int)";
RDebugUtils.currentLine=186843137;
 //BA.debugLineNum = 186843137;BA.debugLine="Dim res As RowPanelInfo";
_res = new xevolution.vrcg.devdemov2400.types._rowpanelinfo();
RDebugUtils.currentLine=186843138;
 //BA.debugLineNum = 186843138;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=186843139;
 //BA.debugLineNum = 186843139;BA.debugLine="res.Pan = Pan";
_res.Pan /*anywheresoftware.b4a.objects.PanelWrapper*/  = _pan;
RDebugUtils.currentLine=186843140;
 //BA.debugLineNum = 186843140;BA.debugLine="res.Height = Height";
_res.Height /*int*/  = _height;
RDebugUtils.currentLine=186843141;
 //BA.debugLineNum = 186843141;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=186843142;
 //BA.debugLineNum = 186843142;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._returnfielddata  _makereturnfielddata(anywheresoftware.b4a.BA _ba,String _item_tagcode,String _field_value) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makereturnfielddata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._returnfielddata) Debug.delegate(null, "makereturnfielddata", new Object[] {_ba,_item_tagcode,_field_value}));}
xevolution.vrcg.devdemov2400.types._returnfielddata _res = null;
RDebugUtils.currentLine=186974208;
 //BA.debugLineNum = 186974208;BA.debugLine="Sub MakeReturnFieldData(item_tagcode As String, fi";
RDebugUtils.currentLine=186974209;
 //BA.debugLineNum = 186974209;BA.debugLine="Dim res As ReturnFieldData";
_res = new xevolution.vrcg.devdemov2400.types._returnfielddata();
RDebugUtils.currentLine=186974210;
 //BA.debugLineNum = 186974210;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=186974211;
 //BA.debugLineNum = 186974211;BA.debugLine="res.item_tagcode = item_tagcode";
_res.item_tagcode /*String*/  = _item_tagcode;
RDebugUtils.currentLine=186974212;
 //BA.debugLineNum = 186974212;BA.debugLine="res.field_value = field_value";
_res.field_value /*String*/  = _field_value;
RDebugUtils.currentLine=186974213;
 //BA.debugLineNum = 186974213;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=186974214;
 //BA.debugLineNum = 186974214;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._createrequestreturn  _makecreaterequestreturnclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecreaterequestreturnclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._createrequestreturn) Debug.delegate(null, "makecreaterequestreturnclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._createrequestreturn _res = null;
RDebugUtils.currentLine=187236352;
 //BA.debugLineNum = 187236352;BA.debugLine="Sub MakeCreateRequestReturnClear As CreateRequestR";
RDebugUtils.currentLine=187236353;
 //BA.debugLineNum = 187236353;BA.debugLine="Dim res As CreateRequestReturn";
_res = new xevolution.vrcg.devdemov2400.types._createrequestreturn();
RDebugUtils.currentLine=187236354;
 //BA.debugLineNum = 187236354;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=187236355;
 //BA.debugLineNum = 187236355;BA.debugLine="res.RequestTagcode = \"\"";
_res.RequestTagcode /*String*/  = "";
RDebugUtils.currentLine=187236356;
 //BA.debugLineNum = 187236356;BA.debugLine="res.Status = 0";
_res.Status /*int*/  = (int) (0);
RDebugUtils.currentLine=187236357;
 //BA.debugLineNum = 187236357;BA.debugLine="res.Stage = 0";
_res.Stage /*int*/  = (int) (0);
RDebugUtils.currentLine=187236358;
 //BA.debugLineNum = 187236358;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=187236359;
 //BA.debugLineNum = 187236359;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._geodata  _setgeodatadt(anywheresoftware.b4a.BA _ba,String _lat,String _lon,String _date) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "setgeodatadt", false))
	 {return ((xevolution.vrcg.devdemov2400.types._geodata) Debug.delegate(null, "setgeodatadt", new Object[] {_ba,_lat,_lon,_date}));}
xevolution.vrcg.devdemov2400.types._geodata _g = null;
RDebugUtils.currentLine=191496192;
 //BA.debugLineNum = 191496192;BA.debugLine="Sub setGeoDataDT(lat As String, lon As String, dat";
RDebugUtils.currentLine=191496193;
 //BA.debugLineNum = 191496193;BA.debugLine="Dim g As GeoData";
_g = new xevolution.vrcg.devdemov2400.types._geodata();
RDebugUtils.currentLine=191496194;
 //BA.debugLineNum = 191496194;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=191496195;
 //BA.debugLineNum = 191496195;BA.debugLine="g.lat = lat";
_g.lat /*String*/  = _lat;
RDebugUtils.currentLine=191496196;
 //BA.debugLineNum = 191496196;BA.debugLine="g.lon = lon";
_g.lon /*String*/  = _lon;
RDebugUtils.currentLine=191496197;
 //BA.debugLineNum = 191496197;BA.debugLine="g.date = date";
_g.date /*String*/  = _date;
RDebugUtils.currentLine=191496198;
 //BA.debugLineNum = 191496198;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=191496199;
 //BA.debugLineNum = 191496199;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._filedownloadinformation  _makefiledownloadinformationclear(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makefiledownloadinformationclear", false))
	 {return ((xevolution.vrcg.devdemov2400.types._filedownloadinformation) Debug.delegate(null, "makefiledownloadinformationclear", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._filedownloadinformation _res = null;
RDebugUtils.currentLine=187105280;
 //BA.debugLineNum = 187105280;BA.debugLine="Sub MakeFileDownloadInformationClear As FileDownlo";
RDebugUtils.currentLine=187105281;
 //BA.debugLineNum = 187105281;BA.debugLine="Dim res As FileDownloadInformation";
_res = new xevolution.vrcg.devdemov2400.types._filedownloadinformation();
RDebugUtils.currentLine=187105282;
 //BA.debugLineNum = 187105282;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=187105283;
 //BA.debugLineNum = 187105283;BA.debugLine="res.Downloaded = False";
_res.Downloaded /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=187105284;
 //BA.debugLineNum = 187105284;BA.debugLine="res.DownloadFilename = \"\"";
_res.DownloadFilename /*String*/  = "";
RDebugUtils.currentLine=187105285;
 //BA.debugLineNum = 187105285;BA.debugLine="res.Status = 0";
_res.Status /*int*/  = (int) (0);
RDebugUtils.currentLine=187105286;
 //BA.debugLineNum = 187105286;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=187105287;
 //BA.debugLineNum = 187105287;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._downupfile  _makedownupfile(anywheresoftware.b4a.BA _ba,String _filename,String _filetype,long _filedatetime) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makedownupfile", false))
	 {return ((xevolution.vrcg.devdemov2400.types._downupfile) Debug.delegate(null, "makedownupfile", new Object[] {_ba,_filename,_filetype,_filedatetime}));}
xevolution.vrcg.devdemov2400.types._downupfile _ret = null;
RDebugUtils.currentLine=188940288;
 //BA.debugLineNum = 188940288;BA.debugLine="Sub MakeDownUpFile(Filename As String, FileType As";
RDebugUtils.currentLine=188940289;
 //BA.debugLineNum = 188940289;BA.debugLine="Dim ret As DownUpFile";
_ret = new xevolution.vrcg.devdemov2400.types._downupfile();
RDebugUtils.currentLine=188940290;
 //BA.debugLineNum = 188940290;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188940291;
 //BA.debugLineNum = 188940291;BA.debugLine="ret.Filename = Filename";
_ret.Filename /*String*/  = _filename;
RDebugUtils.currentLine=188940292;
 //BA.debugLineNum = 188940292;BA.debugLine="ret.FileType = FileType";
_ret.FileType /*String*/  = _filetype;
RDebugUtils.currentLine=188940293;
 //BA.debugLineNum = 188940293;BA.debugLine="ret.FileDateTime = FileDateTime";
_ret.FileDateTime /*long*/  = _filedatetime;
RDebugUtils.currentLine=188940294;
 //BA.debugLineNum = 188940294;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188940295;
 //BA.debugLineNum = 188940295;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._address  _makeaddress(anywheresoftware.b4a.BA _ba,int _addresstype,String _addressname,String _addressname2,String _addresscity,String _addresspostalcode,String _addresslatitude,String _addresslongitude,boolean _asnew) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeaddress", false))
	 {return ((xevolution.vrcg.devdemov2400.types._address) Debug.delegate(null, "makeaddress", new Object[] {_ba,_addresstype,_addressname,_addressname2,_addresscity,_addresspostalcode,_addresslatitude,_addresslongitude,_asnew}));}
xevolution.vrcg.devdemov2400.types._address _ret = null;
RDebugUtils.currentLine=190775296;
 //BA.debugLineNum = 190775296;BA.debugLine="Sub MakeAddress(AddressType As Int, AddressName As";
RDebugUtils.currentLine=190775297;
 //BA.debugLineNum = 190775297;BA.debugLine="Dim ret As Address";
_ret = new xevolution.vrcg.devdemov2400.types._address();
RDebugUtils.currentLine=190775298;
 //BA.debugLineNum = 190775298;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190775299;
 //BA.debugLineNum = 190775299;BA.debugLine="ret.AddressType = AddressType";
_ret.AddressType /*int*/  = _addresstype;
RDebugUtils.currentLine=190775300;
 //BA.debugLineNum = 190775300;BA.debugLine="ret.AddressName = AddressName";
_ret.AddressName /*String*/  = _addressname;
RDebugUtils.currentLine=190775301;
 //BA.debugLineNum = 190775301;BA.debugLine="ret.AddressName2 = AddressName2";
_ret.AddressName2 /*String*/  = _addressname2;
RDebugUtils.currentLine=190775302;
 //BA.debugLineNum = 190775302;BA.debugLine="ret.AddressCity = AddressCity";
_ret.AddressCity /*String*/  = _addresscity;
RDebugUtils.currentLine=190775303;
 //BA.debugLineNum = 190775303;BA.debugLine="ret.AddressPostalCode = AddressPostalCode";
_ret.AddressPostalCode /*String*/  = _addresspostalcode;
RDebugUtils.currentLine=190775304;
 //BA.debugLineNum = 190775304;BA.debugLine="ret.AddressLatitude = AddressLatitude";
_ret.AddressLatitude /*String*/  = _addresslatitude;
RDebugUtils.currentLine=190775305;
 //BA.debugLineNum = 190775305;BA.debugLine="ret.AddressLongitude = AddressLongitude";
_ret.AddressLongitude /*String*/  = _addresslongitude;
RDebugUtils.currentLine=190775306;
 //BA.debugLineNum = 190775306;BA.debugLine="ret.asNew = asNew";
_ret.asNew /*boolean*/  = _asnew;
RDebugUtils.currentLine=190775307;
 //BA.debugLineNum = 190775307;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190775308;
 //BA.debugLineNum = 190775308;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._taglisttype  _maketaglisttype(anywheresoftware.b4a.BA _ba,String _tagcode,String _tagname,String _taggroup) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "maketaglisttype", false))
	 {return ((xevolution.vrcg.devdemov2400.types._taglisttype) Debug.delegate(null, "maketaglisttype", new Object[] {_ba,_tagcode,_tagname,_taggroup}));}
xevolution.vrcg.devdemov2400.types._taglisttype _ret = null;
RDebugUtils.currentLine=188809216;
 //BA.debugLineNum = 188809216;BA.debugLine="Sub MakeTagListType(tagcode As String, tagname As";
RDebugUtils.currentLine=188809217;
 //BA.debugLineNum = 188809217;BA.debugLine="Dim ret As TagListType";
_ret = new xevolution.vrcg.devdemov2400.types._taglisttype();
RDebugUtils.currentLine=188809218;
 //BA.debugLineNum = 188809218;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188809219;
 //BA.debugLineNum = 188809219;BA.debugLine="ret.tagcode = tagcode";
_ret.tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=188809220;
 //BA.debugLineNum = 188809220;BA.debugLine="ret.tagname = tagname";
_ret.tagname /*String*/  = _tagname;
RDebugUtils.currentLine=188809221;
 //BA.debugLineNum = 188809221;BA.debugLine="ret.taggroup = taggroup";
_ret.taggroup /*String*/  = _taggroup;
RDebugUtils.currentLine=188809222;
 //BA.debugLineNum = 188809222;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188809224;
 //BA.debugLineNum = 188809224;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._contactrecord  _makecontact(anywheresoftware.b4a.BA _ba,int _contacttype,String _contactname,String _contactphone,String _contactemail,String _contacttitle,String _tagcode,boolean _asnew) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecontact", false))
	 {return ((xevolution.vrcg.devdemov2400.types._contactrecord) Debug.delegate(null, "makecontact", new Object[] {_ba,_contacttype,_contactname,_contactphone,_contactemail,_contacttitle,_tagcode,_asnew}));}
xevolution.vrcg.devdemov2400.types._contactrecord _ret = null;
RDebugUtils.currentLine=190709760;
 //BA.debugLineNum = 190709760;BA.debugLine="Sub MakeContact(contactType As Int, contactName As";
RDebugUtils.currentLine=190709761;
 //BA.debugLineNum = 190709761;BA.debugLine="Dim ret As ContactRecord";
_ret = new xevolution.vrcg.devdemov2400.types._contactrecord();
RDebugUtils.currentLine=190709762;
 //BA.debugLineNum = 190709762;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190709763;
 //BA.debugLineNum = 190709763;BA.debugLine="ret.contactType = contactType";
_ret.contactType /*int*/  = _contacttype;
RDebugUtils.currentLine=190709764;
 //BA.debugLineNum = 190709764;BA.debugLine="ret.contactName = contactName";
_ret.contactName /*String*/  = _contactname;
RDebugUtils.currentLine=190709765;
 //BA.debugLineNum = 190709765;BA.debugLine="ret.contactPhone = contactPhone";
_ret.contactPhone /*String*/  = _contactphone;
RDebugUtils.currentLine=190709766;
 //BA.debugLineNum = 190709766;BA.debugLine="ret.contactEmail = contactEmail";
_ret.contactEmail /*String*/  = _contactemail;
RDebugUtils.currentLine=190709767;
 //BA.debugLineNum = 190709767;BA.debugLine="ret.contactTitle = contactTitle";
_ret.contactTitle /*String*/  = _contacttitle;
RDebugUtils.currentLine=190709768;
 //BA.debugLineNum = 190709768;BA.debugLine="ret.tagcode = tagcode";
_ret.tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=190709769;
 //BA.debugLineNum = 190709769;BA.debugLine="ret.asNew = asNew";
_ret.asNew /*boolean*/  = _asnew;
RDebugUtils.currentLine=190709770;
 //BA.debugLineNum = 190709770;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190709771;
 //BA.debugLineNum = 190709771;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._georeference  _makegeoreference(anywheresoftware.b4a.BA _ba,String _latitude,String _longitude,boolean _asnew) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makegeoreference", false))
	 {return ((xevolution.vrcg.devdemov2400.types._georeference) Debug.delegate(null, "makegeoreference", new Object[] {_ba,_latitude,_longitude,_asnew}));}
xevolution.vrcg.devdemov2400.types._georeference _ret = null;
RDebugUtils.currentLine=190840832;
 //BA.debugLineNum = 190840832;BA.debugLine="Sub MakeGeoReference(Latitude As String, Longitude";
RDebugUtils.currentLine=190840833;
 //BA.debugLineNum = 190840833;BA.debugLine="Dim ret As GeoReference";
_ret = new xevolution.vrcg.devdemov2400.types._georeference();
RDebugUtils.currentLine=190840834;
 //BA.debugLineNum = 190840834;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190840835;
 //BA.debugLineNum = 190840835;BA.debugLine="ret.Latitude = Latitude";
_ret.Latitude /*String*/  = _latitude;
RDebugUtils.currentLine=190840836;
 //BA.debugLineNum = 190840836;BA.debugLine="ret.Longitude = Longitude";
_ret.Longitude /*String*/  = _longitude;
RDebugUtils.currentLine=190840837;
 //BA.debugLineNum = 190840837;BA.debugLine="ret.asNew = asNew";
_ret.asNew /*boolean*/  = _asnew;
RDebugUtils.currentLine=190840838;
 //BA.debugLineNum = 190840838;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190840839;
 //BA.debugLineNum = 190840839;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._kpifilter  _makekpifilter(anywheresoftware.b4a.BA _ba,int _period,String _sdate,String _edate) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makekpifilter", false))
	 {return ((xevolution.vrcg.devdemov2400.types._kpifilter) Debug.delegate(null, "makekpifilter", new Object[] {_ba,_period,_sdate,_edate}));}
xevolution.vrcg.devdemov2400.types._kpifilter _ret = null;
RDebugUtils.currentLine=191234048;
 //BA.debugLineNum = 191234048;BA.debugLine="Sub MakeKPIFilter(period As Int, SDate As String,";
RDebugUtils.currentLine=191234049;
 //BA.debugLineNum = 191234049;BA.debugLine="Dim ret As KPIFilter";
_ret = new xevolution.vrcg.devdemov2400.types._kpifilter();
RDebugUtils.currentLine=191234050;
 //BA.debugLineNum = 191234050;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=191234051;
 //BA.debugLineNum = 191234051;BA.debugLine="ret.SDate = SDate";
_ret.SDate /*String*/  = _sdate;
RDebugUtils.currentLine=191234052;
 //BA.debugLineNum = 191234052;BA.debugLine="ret.EDate = EDate";
_ret.EDate /*String*/  = _edate;
RDebugUtils.currentLine=191234053;
 //BA.debugLineNum = 191234053;BA.debugLine="ret.period = period";
_ret.period /*int*/  = _period;
RDebugUtils.currentLine=191234054;
 //BA.debugLineNum = 191234054;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=191234055;
 //BA.debugLineNum = 191234055;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestfilter  _makerequestfilter(anywheresoftware.b4a.BA _ba,String _sdate,String _edate,int _state,int _task,int _entity,int _route,int _tprequest) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestfilter", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestfilter) Debug.delegate(null, "makerequestfilter", new Object[] {_ba,_sdate,_edate,_state,_task,_entity,_route,_tprequest}));}
xevolution.vrcg.devdemov2400.types._requestfilter _ret = null;
RDebugUtils.currentLine=191299584;
 //BA.debugLineNum = 191299584;BA.debugLine="Sub MakeRequestFilter(SDate As String, EDate As St";
RDebugUtils.currentLine=191299586;
 //BA.debugLineNum = 191299586;BA.debugLine="Dim ret As RequestFilter";
_ret = new xevolution.vrcg.devdemov2400.types._requestfilter();
RDebugUtils.currentLine=191299587;
 //BA.debugLineNum = 191299587;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=191299588;
 //BA.debugLineNum = 191299588;BA.debugLine="ret.SDate = SDate";
_ret.SDate /*String*/  = _sdate;
RDebugUtils.currentLine=191299589;
 //BA.debugLineNum = 191299589;BA.debugLine="ret.EDate = EDate";
_ret.EDate /*String*/  = _edate;
RDebugUtils.currentLine=191299590;
 //BA.debugLineNum = 191299590;BA.debugLine="ret.State = State";
_ret.State /*int*/  = _state;
RDebugUtils.currentLine=191299591;
 //BA.debugLineNum = 191299591;BA.debugLine="ret.Task = Task";
_ret.Task /*int*/  = _task;
RDebugUtils.currentLine=191299592;
 //BA.debugLineNum = 191299592;BA.debugLine="ret.Entity = Entity";
_ret.Entity /*int*/  = _entity;
RDebugUtils.currentLine=191299593;
 //BA.debugLineNum = 191299593;BA.debugLine="ret.Route = Route";
_ret.Route /*int*/  = _route;
RDebugUtils.currentLine=191299594;
 //BA.debugLineNum = 191299594;BA.debugLine="ret.TPRequest = TPRequest";
_ret.TPRequest /*int*/  = _tprequest;
RDebugUtils.currentLine=191299595;
 //BA.debugLineNum = 191299595;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=191299596;
 //BA.debugLineNum = 191299596;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._triplevalues  _maketriplevalues(anywheresoftware.b4a.BA _ba,String _value1,String _value2,String _value3) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "maketriplevalues", false))
	 {return ((xevolution.vrcg.devdemov2400.types._triplevalues) Debug.delegate(null, "maketriplevalues", new Object[] {_ba,_value1,_value2,_value3}));}
xevolution.vrcg.devdemov2400.types._triplevalues _ret = null;
RDebugUtils.currentLine=188481536;
 //BA.debugLineNum = 188481536;BA.debugLine="Sub MakeTripleValues(value1 As String, value2 As S";
RDebugUtils.currentLine=188481537;
 //BA.debugLineNum = 188481537;BA.debugLine="Dim ret As TripleValues";
_ret = new xevolution.vrcg.devdemov2400.types._triplevalues();
RDebugUtils.currentLine=188481538;
 //BA.debugLineNum = 188481538;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188481539;
 //BA.debugLineNum = 188481539;BA.debugLine="ret.value1 = value1";
_ret.value1 /*String*/  = _value1;
RDebugUtils.currentLine=188481540;
 //BA.debugLineNum = 188481540;BA.debugLine="ret.value2 = value2";
_ret.value2 /*String*/  = _value2;
RDebugUtils.currentLine=188481541;
 //BA.debugLineNum = 188481541;BA.debugLine="ret.value3 = value3";
_ret.value3 /*String*/  = _value3;
RDebugUtils.currentLine=188481542;
 //BA.debugLineNum = 188481542;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188481543;
 //BA.debugLineNum = 188481543;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._taskfilter  _maketaskfilter(anywheresoftware.b4a.BA _ba,int _typetask,int _status,int _updated,int _withrequests,int _group) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "maketaskfilter", false))
	 {return ((xevolution.vrcg.devdemov2400.types._taskfilter) Debug.delegate(null, "maketaskfilter", new Object[] {_ba,_typetask,_status,_updated,_withrequests,_group}));}
xevolution.vrcg.devdemov2400.types._taskfilter _ret = null;
RDebugUtils.currentLine=190316544;
 //BA.debugLineNum = 190316544;BA.debugLine="Sub MakeTaskFilter(TypeTask As Int, Status As Int,";
RDebugUtils.currentLine=190316545;
 //BA.debugLineNum = 190316545;BA.debugLine="Dim ret As TaskFilter";
_ret = new xevolution.vrcg.devdemov2400.types._taskfilter();
RDebugUtils.currentLine=190316546;
 //BA.debugLineNum = 190316546;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190316547;
 //BA.debugLineNum = 190316547;BA.debugLine="ret.TypeTask = TypeTask";
_ret.TypeTask /*int*/  = _typetask;
RDebugUtils.currentLine=190316548;
 //BA.debugLineNum = 190316548;BA.debugLine="ret.Status = Status";
_ret.Status /*int*/  = _status;
RDebugUtils.currentLine=190316549;
 //BA.debugLineNum = 190316549;BA.debugLine="ret.Updated = Updated";
_ret.Updated /*int*/  = _updated;
RDebugUtils.currentLine=190316550;
 //BA.debugLineNum = 190316550;BA.debugLine="ret.WithRequests = WithRequests";
_ret.WithRequests /*int*/  = _withrequests;
RDebugUtils.currentLine=190316551;
 //BA.debugLineNum = 190316551;BA.debugLine="ret.Group = Group";
_ret.Group /*int*/  = _group;
RDebugUtils.currentLine=190316552;
 //BA.debugLineNum = 190316552;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190316553;
 //BA.debugLineNum = 190316553;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._unavailable2  _makeunavailable2(anywheresoftware.b4a.BA _ba,String _startdate,String _enddate,String _reason,String _cause) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeunavailable2", false))
	 {return ((xevolution.vrcg.devdemov2400.types._unavailable2) Debug.delegate(null, "makeunavailable2", new Object[] {_ba,_startdate,_enddate,_reason,_cause}));}
xevolution.vrcg.devdemov2400.types._unavailable2 _ret = null;
RDebugUtils.currentLine=191168512;
 //BA.debugLineNum = 191168512;BA.debugLine="Sub MakeUnavailable2(startDate As String, endDate";
RDebugUtils.currentLine=191168513;
 //BA.debugLineNum = 191168513;BA.debugLine="Dim ret As Unavailable2";
_ret = new xevolution.vrcg.devdemov2400.types._unavailable2();
RDebugUtils.currentLine=191168514;
 //BA.debugLineNum = 191168514;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=191168515;
 //BA.debugLineNum = 191168515;BA.debugLine="ret.StartDate = startDate";
_ret.StartDate /*String*/  = _startdate;
RDebugUtils.currentLine=191168516;
 //BA.debugLineNum = 191168516;BA.debugLine="ret.EndDate = endDate";
_ret.EndDate /*String*/  = _enddate;
RDebugUtils.currentLine=191168517;
 //BA.debugLineNum = 191168517;BA.debugLine="ret.Reason = reason";
_ret.Reason /*String*/  = _reason;
RDebugUtils.currentLine=191168518;
 //BA.debugLineNum = 191168518;BA.debugLine="ret.cause = cause";
_ret.Cause /*String*/  = _cause;
RDebugUtils.currentLine=191168519;
 //BA.debugLineNum = 191168519;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=191168520;
 //BA.debugLineNum = 191168520;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._unavailable  _makeunavailable(anywheresoftware.b4a.BA _ba,String _startdate,String _enddate,String _reason) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeunavailable", false))
	 {return ((xevolution.vrcg.devdemov2400.types._unavailable) Debug.delegate(null, "makeunavailable", new Object[] {_ba,_startdate,_enddate,_reason}));}
xevolution.vrcg.devdemov2400.types._unavailable _ret = null;
RDebugUtils.currentLine=191102976;
 //BA.debugLineNum = 191102976;BA.debugLine="Sub MakeUnavailable(startDate As String, endDate A";
RDebugUtils.currentLine=191102977;
 //BA.debugLineNum = 191102977;BA.debugLine="Dim ret As Unavailable";
_ret = new xevolution.vrcg.devdemov2400.types._unavailable();
RDebugUtils.currentLine=191102978;
 //BA.debugLineNum = 191102978;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=191102979;
 //BA.debugLineNum = 191102979;BA.debugLine="ret.StartDate = startDate";
_ret.StartDate /*String*/  = _startdate;
RDebugUtils.currentLine=191102980;
 //BA.debugLineNum = 191102980;BA.debugLine="ret.EndDate = endDate";
_ret.EndDate /*String*/  = _enddate;
RDebugUtils.currentLine=191102981;
 //BA.debugLineNum = 191102981;BA.debugLine="ret.Reason = reason";
_ret.Reason /*String*/  = _reason;
RDebugUtils.currentLine=191102982;
 //BA.debugLineNum = 191102982;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=191102983;
 //BA.debugLineNum = 191102983;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._shotfoto  _makeshotfoto(anywheresoftware.b4a.BA _ba,String _filename,String _datentime,String _latitude,String _longitude,String _title) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeshotfoto", false))
	 {return ((xevolution.vrcg.devdemov2400.types._shotfoto) Debug.delegate(null, "makeshotfoto", new Object[] {_ba,_filename,_datentime,_latitude,_longitude,_title}));}
xevolution.vrcg.devdemov2400.types._shotfoto _ret = null;
RDebugUtils.currentLine=188088320;
 //BA.debugLineNum = 188088320;BA.debugLine="Sub MakeShotFoto(FileName As String, DateNTime As";
RDebugUtils.currentLine=188088321;
 //BA.debugLineNum = 188088321;BA.debugLine="Dim ret As ShotFoto";
_ret = new xevolution.vrcg.devdemov2400.types._shotfoto();
RDebugUtils.currentLine=188088322;
 //BA.debugLineNum = 188088322;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188088323;
 //BA.debugLineNum = 188088323;BA.debugLine="ret.FileName = FileName";
_ret.FileName /*String*/  = _filename;
RDebugUtils.currentLine=188088324;
 //BA.debugLineNum = 188088324;BA.debugLine="ret.DateNTime = DateNTime";
_ret.DateNTime /*String*/  = _datentime;
RDebugUtils.currentLine=188088325;
 //BA.debugLineNum = 188088325;BA.debugLine="ret.Latitude = Latitude";
_ret.Latitude /*String*/  = _latitude;
RDebugUtils.currentLine=188088326;
 //BA.debugLineNum = 188088326;BA.debugLine="ret.Longitude = Longitude";
_ret.Longitude /*String*/  = _longitude;
RDebugUtils.currentLine=188088327;
 //BA.debugLineNum = 188088327;BA.debugLine="ret.Title = Title";
_ret.Title /*String*/  = _title;
RDebugUtils.currentLine=188088328;
 //BA.debugLineNum = 188088328;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188088329;
 //BA.debugLineNum = 188088329;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._objectinformation  _makeobjectinformation(anywheresoftware.b4a.BA _ba,String _tagcode,int _itype,String _name,String _address,String _address2,String _cpostal,String _city,String _ctnphone,String _ctnname,String _latitude,String _longitude,boolean _asnew) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeobjectinformation", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objectinformation) Debug.delegate(null, "makeobjectinformation", new Object[] {_ba,_tagcode,_itype,_name,_address,_address2,_cpostal,_city,_ctnphone,_ctnname,_latitude,_longitude,_asnew}));}
xevolution.vrcg.devdemov2400.types._objectinformation _ret = null;
RDebugUtils.currentLine=190578688;
 //BA.debugLineNum = 190578688;BA.debugLine="Sub MakeObjectInformation(tagcode As String, iType";
RDebugUtils.currentLine=190578690;
 //BA.debugLineNum = 190578690;BA.debugLine="Dim ret As ObjectInformation";
_ret = new xevolution.vrcg.devdemov2400.types._objectinformation();
RDebugUtils.currentLine=190578691;
 //BA.debugLineNum = 190578691;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190578692;
 //BA.debugLineNum = 190578692;BA.debugLine="ret.tagcode = tagcode";
_ret.tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=190578693;
 //BA.debugLineNum = 190578693;BA.debugLine="ret.iType = iType";
_ret.iType /*int*/  = _itype;
RDebugUtils.currentLine=190578694;
 //BA.debugLineNum = 190578694;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=190578695;
 //BA.debugLineNum = 190578695;BA.debugLine="ret.Address = Address";
_ret.Address /*String*/  = _address;
RDebugUtils.currentLine=190578696;
 //BA.debugLineNum = 190578696;BA.debugLine="ret.Address2 = Address2";
_ret.Address2 /*String*/  = _address2;
RDebugUtils.currentLine=190578697;
 //BA.debugLineNum = 190578697;BA.debugLine="ret.Cpostal = Cpostal";
_ret.Cpostal /*String*/  = _cpostal;
RDebugUtils.currentLine=190578698;
 //BA.debugLineNum = 190578698;BA.debugLine="ret.City = City";
_ret.City /*String*/  = _city;
RDebugUtils.currentLine=190578699;
 //BA.debugLineNum = 190578699;BA.debugLine="ret.CtnPhone = CtnPhone";
_ret.CtnPhone /*String*/  = _ctnphone;
RDebugUtils.currentLine=190578700;
 //BA.debugLineNum = 190578700;BA.debugLine="ret.CtnName = CtnName";
_ret.CtnName /*String*/  = _ctnname;
RDebugUtils.currentLine=190578701;
 //BA.debugLineNum = 190578701;BA.debugLine="ret.Latitude = Latitude";
_ret.Latitude /*String*/  = _latitude;
RDebugUtils.currentLine=190578702;
 //BA.debugLineNum = 190578702;BA.debugLine="ret.Longitude = Longitude";
_ret.Longitude /*String*/  = _longitude;
RDebugUtils.currentLine=190578703;
 //BA.debugLineNum = 190578703;BA.debugLine="ret.asNew = asNew";
_ret.asNew /*boolean*/  = _asnew;
RDebugUtils.currentLine=190578704;
 //BA.debugLineNum = 190578704;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190578705;
 //BA.debugLineNum = 190578705;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._objecttypes  _objecttypesinlist(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _otlist,String _title) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "objecttypesinlist", false))
	 {return ((xevolution.vrcg.devdemov2400.types._objecttypes) Debug.delegate(null, "objecttypesinlist", new Object[] {_ba,_otlist,_title}));}
xevolution.vrcg.devdemov2400.types._objecttypes _ret = null;
int _n = 0;
xevolution.vrcg.devdemov2400.types._objecttypes _this = null;
RDebugUtils.currentLine=189333504;
 //BA.debugLineNum = 189333504;BA.debugLine="Sub ObjectTypesInList(otList As List, title As Str";
RDebugUtils.currentLine=189333505;
 //BA.debugLineNum = 189333505;BA.debugLine="Dim ret As ObjectTypes = MakeObjectTypes(0, \"\", \"";
_ret = _makeobjecttypes(_ba,(int) (0),"","(Todos)");
RDebugUtils.currentLine=189333506;
 //BA.debugLineNum = 189333506;BA.debugLine="For n = 0 To otList.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_otlist.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit2 ;_n = _n + step2 ) {
RDebugUtils.currentLine=189333507;
 //BA.debugLineNum = 189333507;BA.debugLine="Dim this As ObjectTypes = otList.Get(n)";
_this = (xevolution.vrcg.devdemov2400.types._objecttypes)(_otlist.Get(_n));
RDebugUtils.currentLine=189333508;
 //BA.debugLineNum = 189333508;BA.debugLine="If this.title = title Then";
if ((_this.title /*String*/ ).equals(_title)) { 
RDebugUtils.currentLine=189333509;
 //BA.debugLineNum = 189333509;BA.debugLine="ret = this";
_ret = _this;
RDebugUtils.currentLine=189333510;
 //BA.debugLineNum = 189333510;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=189333513;
 //BA.debugLineNum = 189333513;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189333514;
 //BA.debugLineNum = 189333514;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._pagea4  _makepagea4(anywheresoftware.b4a.BA _ba,double _a4size,double _a4margins,double _pageheight,double _pageheaderheight,double _pagefooterheight,double _pagefirstheight,double _pagelabelheight,double _pagelabelspaceheight,double _pagelabelboxheight,double _pagetextmargins,double _pagetextheight,double _pageimgrowheight,double _imgrowheight,double _pagerowheight,double _pagetextrowheight,String _pageheader,String _pagefooter,String _pagecontent,String _pagesignature,String _pageobservations,String _pageimages,String _pagenonconformities,String _pagetemplate,String _pagefirst,String _pagenext,String _pagelast) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makepagea4", false))
	 {return ((xevolution.vrcg.devdemov2400.types._pagea4) Debug.delegate(null, "makepagea4", new Object[] {_ba,_a4size,_a4margins,_pageheight,_pageheaderheight,_pagefooterheight,_pagefirstheight,_pagelabelheight,_pagelabelspaceheight,_pagelabelboxheight,_pagetextmargins,_pagetextheight,_pageimgrowheight,_imgrowheight,_pagerowheight,_pagetextrowheight,_pageheader,_pagefooter,_pagecontent,_pagesignature,_pageobservations,_pageimages,_pagenonconformities,_pagetemplate,_pagefirst,_pagenext,_pagelast}));}
xevolution.vrcg.devdemov2400.types._pagea4 _ret = null;
RDebugUtils.currentLine=188612608;
 //BA.debugLineNum = 188612608;BA.debugLine="Sub MakePageA4(A4Size As Double, A4Margins As Doub";
RDebugUtils.currentLine=188612614;
 //BA.debugLineNum = 188612614;BA.debugLine="Dim ret As PageA4";
_ret = new xevolution.vrcg.devdemov2400.types._pagea4();
RDebugUtils.currentLine=188612615;
 //BA.debugLineNum = 188612615;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188612616;
 //BA.debugLineNum = 188612616;BA.debugLine="ret.A4Size = A4Size";
_ret.A4Size /*double*/  = _a4size;
RDebugUtils.currentLine=188612617;
 //BA.debugLineNum = 188612617;BA.debugLine="ret.A4Margins = A4Margins";
_ret.A4Margins /*double*/  = _a4margins;
RDebugUtils.currentLine=188612618;
 //BA.debugLineNum = 188612618;BA.debugLine="ret.PageHeight = PageHeight";
_ret.PageHeight /*double*/  = _pageheight;
RDebugUtils.currentLine=188612619;
 //BA.debugLineNum = 188612619;BA.debugLine="ret.PageHeaderHeight = PageHeaderHeight";
_ret.PageHeaderHeight /*double*/  = _pageheaderheight;
RDebugUtils.currentLine=188612620;
 //BA.debugLineNum = 188612620;BA.debugLine="ret.PageFooterHeight = PageFooterHeight";
_ret.PageFooterHeight /*double*/  = _pagefooterheight;
RDebugUtils.currentLine=188612621;
 //BA.debugLineNum = 188612621;BA.debugLine="ret.PageFirstHeight = PageFirstHeight";
_ret.PageFirstHeight /*double*/  = _pagefirstheight;
RDebugUtils.currentLine=188612622;
 //BA.debugLineNum = 188612622;BA.debugLine="ret.PageLabelHeight = PageLabelHeight";
_ret.PageLabelHeight /*double*/  = _pagelabelheight;
RDebugUtils.currentLine=188612623;
 //BA.debugLineNum = 188612623;BA.debugLine="ret.PageLabelSpaceHeight = PageLabelSpaceHeight";
_ret.PageLabelSpaceHeight /*double*/  = _pagelabelspaceheight;
RDebugUtils.currentLine=188612624;
 //BA.debugLineNum = 188612624;BA.debugLine="ret.PageLabelBoxHeight = PageLabelBoxHeight";
_ret.PageLabelBoxHeight /*double*/  = _pagelabelboxheight;
RDebugUtils.currentLine=188612625;
 //BA.debugLineNum = 188612625;BA.debugLine="ret.PageTextMargins = PageTextMargins";
_ret.PageTextMargins /*double*/  = _pagetextmargins;
RDebugUtils.currentLine=188612626;
 //BA.debugLineNum = 188612626;BA.debugLine="ret.PageTextHeight = PageTextHeight";
_ret.PageTextHeight /*double*/  = _pagetextheight;
RDebugUtils.currentLine=188612627;
 //BA.debugLineNum = 188612627;BA.debugLine="ret.PageImgRowHeight = PageImgRowHeight";
_ret.PageImgRowHeight /*double*/  = _pageimgrowheight;
RDebugUtils.currentLine=188612628;
 //BA.debugLineNum = 188612628;BA.debugLine="ret.ImgRowHeight = ImgRowHeight";
_ret.ImgRowHeight /*double*/  = _imgrowheight;
RDebugUtils.currentLine=188612629;
 //BA.debugLineNum = 188612629;BA.debugLine="ret.PageRowHeight = PageRowHeight";
_ret.PageRowHeight /*double*/  = _pagerowheight;
RDebugUtils.currentLine=188612630;
 //BA.debugLineNum = 188612630;BA.debugLine="ret.PageTextRowHeight = PageTextRowHeight";
_ret.PageTextRowHeight /*double*/  = _pagetextrowheight;
RDebugUtils.currentLine=188612631;
 //BA.debugLineNum = 188612631;BA.debugLine="ret.PageHeader = PageHeader";
_ret.PageHeader /*String*/  = _pageheader;
RDebugUtils.currentLine=188612632;
 //BA.debugLineNum = 188612632;BA.debugLine="ret.PageFooter = PageFooter";
_ret.PageFooter /*String*/  = _pagefooter;
RDebugUtils.currentLine=188612633;
 //BA.debugLineNum = 188612633;BA.debugLine="ret.PageContent = PageContent";
_ret.PageContent /*String*/  = _pagecontent;
RDebugUtils.currentLine=188612634;
 //BA.debugLineNum = 188612634;BA.debugLine="ret.PageSignature = PageSignature";
_ret.PageSignature /*String*/  = _pagesignature;
RDebugUtils.currentLine=188612635;
 //BA.debugLineNum = 188612635;BA.debugLine="ret.PageObservations = PageObservations";
_ret.PageObservations /*String*/  = _pageobservations;
RDebugUtils.currentLine=188612636;
 //BA.debugLineNum = 188612636;BA.debugLine="ret.PageImages = PageImages";
_ret.PageImages /*String*/  = _pageimages;
RDebugUtils.currentLine=188612637;
 //BA.debugLineNum = 188612637;BA.debugLine="ret.PageNonConformities = PageNonConformities";
_ret.PageNonConformities /*String*/  = _pagenonconformities;
RDebugUtils.currentLine=188612638;
 //BA.debugLineNum = 188612638;BA.debugLine="ret.PageTemplate = PageTemplate";
_ret.PageTemplate /*String*/  = _pagetemplate;
RDebugUtils.currentLine=188612639;
 //BA.debugLineNum = 188612639;BA.debugLine="ret.PageFirst = PageFirst";
_ret.PageFirst /*String*/  = _pagefirst;
RDebugUtils.currentLine=188612640;
 //BA.debugLineNum = 188612640;BA.debugLine="ret.PageNext = PageNext";
_ret.PageNext /*String*/  = _pagenext;
RDebugUtils.currentLine=188612641;
 //BA.debugLineNum = 188612641;BA.debugLine="ret.PageLast = PageLast";
_ret.PageLast /*String*/  = _pagelast;
RDebugUtils.currentLine=188612642;
 //BA.debugLineNum = 188612642;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188612643;
 //BA.debugLineNum = 188612643;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._pagedata  _makepagedata(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _pagesout,int _pagenumber,double _pagetotal,String _buildpage,int _pointcounter,int _linecounter,double _currtotal,int _imagecounter,String _draft,String _out,String _request_obs,String _technical) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makepagedata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._pagedata) Debug.delegate(null, "makepagedata", new Object[] {_ba,_pagesout,_pagenumber,_pagetotal,_buildpage,_pointcounter,_linecounter,_currtotal,_imagecounter,_draft,_out,_request_obs,_technical}));}
xevolution.vrcg.devdemov2400.types._pagedata _ret = null;
RDebugUtils.currentLine=188678144;
 //BA.debugLineNum = 188678144;BA.debugLine="Sub MakePageData(PagesOut As List, PageNumber As I";
RDebugUtils.currentLine=188678146;
 //BA.debugLineNum = 188678146;BA.debugLine="Dim ret As PageData";
_ret = new xevolution.vrcg.devdemov2400.types._pagedata();
RDebugUtils.currentLine=188678147;
 //BA.debugLineNum = 188678147;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188678148;
 //BA.debugLineNum = 188678148;BA.debugLine="ret.PagesOut = PagesOut";
_ret.PagesOut /*anywheresoftware.b4a.objects.collections.List*/  = _pagesout;
RDebugUtils.currentLine=188678149;
 //BA.debugLineNum = 188678149;BA.debugLine="ret.PageNumber = PageNumber";
_ret.PageNumber /*int*/  = _pagenumber;
RDebugUtils.currentLine=188678150;
 //BA.debugLineNum = 188678150;BA.debugLine="ret.PageTotal = PageTotal";
_ret.PageTotal /*double*/  = _pagetotal;
RDebugUtils.currentLine=188678151;
 //BA.debugLineNum = 188678151;BA.debugLine="ret.BuildPage = BuildPage";
_ret.BuildPage /*String*/  = _buildpage;
RDebugUtils.currentLine=188678152;
 //BA.debugLineNum = 188678152;BA.debugLine="ret.PointCounter = PointCounter";
_ret.PointCounter /*int*/  = _pointcounter;
RDebugUtils.currentLine=188678153;
 //BA.debugLineNum = 188678153;BA.debugLine="ret.LineCounter = LineCounter";
_ret.LineCounter /*int*/  = _linecounter;
RDebugUtils.currentLine=188678154;
 //BA.debugLineNum = 188678154;BA.debugLine="ret.CurrTotal = CurrTotal";
_ret.CurrTotal /*double*/  = _currtotal;
RDebugUtils.currentLine=188678155;
 //BA.debugLineNum = 188678155;BA.debugLine="ret.ImageCounter = ImageCounter";
_ret.ImageCounter /*int*/  = _imagecounter;
RDebugUtils.currentLine=188678156;
 //BA.debugLineNum = 188678156;BA.debugLine="ret.Draft = Draft";
_ret.Draft /*String*/  = _draft;
RDebugUtils.currentLine=188678157;
 //BA.debugLineNum = 188678157;BA.debugLine="ret.Out = Out";
_ret.Out /*String*/  = _out;
RDebugUtils.currentLine=188678158;
 //BA.debugLineNum = 188678158;BA.debugLine="ret.request_obs = request_obs";
_ret.request_obs /*String*/  = _request_obs;
RDebugUtils.currentLine=188678159;
 //BA.debugLineNum = 188678159;BA.debugLine="ret.Technical = Technical";
_ret.Technical /*String*/  = _technical;
RDebugUtils.currentLine=188678160;
 //BA.debugLineNum = 188678160;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188678161;
 //BA.debugLineNum = 188678161;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._returnfromcantrolsub  _makereturnfromcantrolsub(anywheresoftware.b4a.BA _ba,int _toc,boolean _subres) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makereturnfromcantrolsub", false))
	 {return ((xevolution.vrcg.devdemov2400.types._returnfromcantrolsub) Debug.delegate(null, "makereturnfromcantrolsub", new Object[] {_ba,_toc,_subres}));}
xevolution.vrcg.devdemov2400.types._returnfromcantrolsub _res = null;
RDebugUtils.currentLine=186712064;
 //BA.debugLineNum = 186712064;BA.debugLine="Sub MakeReturnFromCantrolSub(TOC As Int, SubRes As";
RDebugUtils.currentLine=186712065;
 //BA.debugLineNum = 186712065;BA.debugLine="Dim res As ReturnFromCantrolSub";
_res = new xevolution.vrcg.devdemov2400.types._returnfromcantrolsub();
RDebugUtils.currentLine=186712066;
 //BA.debugLineNum = 186712066;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=186712067;
 //BA.debugLineNum = 186712067;BA.debugLine="res.TypeOfControl = TOC";
_res.TypeOfControl /*int*/  = _toc;
RDebugUtils.currentLine=186712068;
 //BA.debugLineNum = 186712068;BA.debugLine="res.SubResult = SubRes";
_res.SubResult /*boolean*/  = _subres;
RDebugUtils.currentLine=186712069;
 //BA.debugLineNum = 186712069;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=186712070;
 //BA.debugLineNum = 186712070;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._requestdata  _makerequestdata(anywheresoftware.b4a.BA _ba,String _tagcode,String _entity,String _latitude,String _longitude,int _requesttype,int _favorite,int _clientreport,int _requestcanadd,int _requestcandelete) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makerequestdata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._requestdata) Debug.delegate(null, "makerequestdata", new Object[] {_ba,_tagcode,_entity,_latitude,_longitude,_requesttype,_favorite,_clientreport,_requestcanadd,_requestcandelete}));}
xevolution.vrcg.devdemov2400.types._requestdata _ret = null;
RDebugUtils.currentLine=189726720;
 //BA.debugLineNum = 189726720;BA.debugLine="Sub MakeRequestData(Tagcode As String, Entity As S";
RDebugUtils.currentLine=189726722;
 //BA.debugLineNum = 189726722;BA.debugLine="Dim ret As RequestData";
_ret = new xevolution.vrcg.devdemov2400.types._requestdata();
RDebugUtils.currentLine=189726723;
 //BA.debugLineNum = 189726723;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189726724;
 //BA.debugLineNum = 189726724;BA.debugLine="ret.Tagcode = Tagcode";
_ret.Tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=189726725;
 //BA.debugLineNum = 189726725;BA.debugLine="ret.Entity = Entity";
_ret.Entity /*String*/  = _entity;
RDebugUtils.currentLine=189726726;
 //BA.debugLineNum = 189726726;BA.debugLine="ret.Latitude = Latitude";
_ret.Latitude /*String*/  = _latitude;
RDebugUtils.currentLine=189726727;
 //BA.debugLineNum = 189726727;BA.debugLine="ret.Longitude = Longitude";
_ret.Longitude /*String*/  = _longitude;
RDebugUtils.currentLine=189726728;
 //BA.debugLineNum = 189726728;BA.debugLine="ret.RequestType = RequestType";
_ret.RequestType /*int*/  = _requesttype;
RDebugUtils.currentLine=189726729;
 //BA.debugLineNum = 189726729;BA.debugLine="ret.Favorite = Favorite";
_ret.Favorite /*int*/  = _favorite;
RDebugUtils.currentLine=189726730;
 //BA.debugLineNum = 189726730;BA.debugLine="ret.ClientReport = ClientReport";
_ret.ClientReport /*int*/  = _clientreport;
RDebugUtils.currentLine=189726731;
 //BA.debugLineNum = 189726731;BA.debugLine="ret.RequestCanAdd = RequestCanAdd";
_ret.RequestCanAdd /*int*/  = _requestcanadd;
RDebugUtils.currentLine=189726732;
 //BA.debugLineNum = 189726732;BA.debugLine="ret.RequestCanDelete = RequestCanDelete";
_ret.RequestCanDelete /*int*/  = _requestcandelete;
RDebugUtils.currentLine=189726733;
 //BA.debugLineNum = 189726733;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189726734;
 //BA.debugLineNum = 189726734;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._statusfiltertask  _makestatusfiltertask(anywheresoftware.b4a.BA _ba,boolean _active,boolean _inactive,boolean _singular,boolean _plural) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makestatusfiltertask", false))
	 {return ((xevolution.vrcg.devdemov2400.types._statusfiltertask) Debug.delegate(null, "makestatusfiltertask", new Object[] {_ba,_active,_inactive,_singular,_plural}));}
xevolution.vrcg.devdemov2400.types._statusfiltertask _ret = null;
RDebugUtils.currentLine=188284928;
 //BA.debugLineNum = 188284928;BA.debugLine="Sub MakeStatusFilterTask(active As Boolean, inacti";
RDebugUtils.currentLine=188284929;
 //BA.debugLineNum = 188284929;BA.debugLine="Dim ret As StatusFilterTask";
_ret = new xevolution.vrcg.devdemov2400.types._statusfiltertask();
RDebugUtils.currentLine=188284930;
 //BA.debugLineNum = 188284930;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188284931;
 //BA.debugLineNum = 188284931;BA.debugLine="ret.active = active";
_ret.active /*boolean*/  = _active;
RDebugUtils.currentLine=188284932;
 //BA.debugLineNum = 188284932;BA.debugLine="ret.inactive = inactive";
_ret.inactive /*boolean*/  = _inactive;
RDebugUtils.currentLine=188284933;
 //BA.debugLineNum = 188284933;BA.debugLine="ret.singular = singular";
_ret.singular /*boolean*/  = _singular;
RDebugUtils.currentLine=188284934;
 //BA.debugLineNum = 188284934;BA.debugLine="ret.plural = plural";
_ret.plural /*boolean*/  = _plural;
RDebugUtils.currentLine=188284935;
 //BA.debugLineNum = 188284935;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188284936;
 //BA.debugLineNum = 188284936;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._cladata  _clearcladata(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "clearcladata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._cladata) Debug.delegate(null, "clearcladata", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._cladata _this = null;
RDebugUtils.currentLine=191823872;
 //BA.debugLineNum = 191823872;BA.debugLine="Sub ClearCLAData() As CLAData";
RDebugUtils.currentLine=191823873;
 //BA.debugLineNum = 191823873;BA.debugLine="Private this As CLAData";
_this = new xevolution.vrcg.devdemov2400.types._cladata();
RDebugUtils.currentLine=191823874;
 //BA.debugLineNum = 191823874;BA.debugLine="this.Initialize";
_this.Initialize();
RDebugUtils.currentLine=191823875;
 //BA.debugLineNum = 191823875;BA.debugLine="this.Request = \"\"";
_this.Request /*String*/  = "";
RDebugUtils.currentLine=191823876;
 //BA.debugLineNum = 191823876;BA.debugLine="this.Action = \"\"";
_this.Action /*String*/  = "";
RDebugUtils.currentLine=191823877;
 //BA.debugLineNum = 191823877;BA.debugLine="this.Task = \"\"";
_this.Task /*String*/  = "";
RDebugUtils.currentLine=191823878;
 //BA.debugLineNum = 191823878;BA.debugLine="this.Item = \"\"";
_this.Item /*String*/  = "";
RDebugUtils.currentLine=191823879;
 //BA.debugLineNum = 191823879;BA.debugLine="this.UniqueKey = \"\"";
_this.UniqueKey /*String*/  = "";
RDebugUtils.currentLine=191823880;
 //BA.debugLineNum = 191823880;BA.debugLine="this.Tagcode = \"\"";
_this.Tagcode /*String*/  = "";
RDebugUtils.currentLine=191823881;
 //BA.debugLineNum = 191823881;BA.debugLine="this.RepeatCounter = 0";
_this.RepeatCounter /*int*/  = (int) (0);
RDebugUtils.currentLine=191823882;
 //BA.debugLineNum = 191823882;BA.debugLine="this.ReadOnly = False";
_this.ReadOnly /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191823883;
 //BA.debugLineNum = 191823883;BA.debugLine="this.Composed = False";
_this.Composed /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191823884;
 //BA.debugLineNum = 191823884;BA.debugLine="this.StatusMaster = ClearCLAStatus";
_this.StatusMaster /*xevolution.vrcg.devdemov2400.types._clastatus*/  = _clearclastatus(_ba);
RDebugUtils.currentLine=191823885;
 //BA.debugLineNum = 191823885;BA.debugLine="this.StatusChild = ClearCLAStatus";
_this.StatusChild /*xevolution.vrcg.devdemov2400.types._clastatus*/  = _clearclastatus(_ba);
RDebugUtils.currentLine=191823886;
 //BA.debugLineNum = 191823886;BA.debugLine="Return this";
if (true) return _this;
RDebugUtils.currentLine=191823887;
 //BA.debugLineNum = 191823887;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._clastatus  _clearclastatus(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "clearclastatus", false))
	 {return ((xevolution.vrcg.devdemov2400.types._clastatus) Debug.delegate(null, "clearclastatus", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._clastatus _this = null;
RDebugUtils.currentLine=191692800;
 //BA.debugLineNum = 191692800;BA.debugLine="Sub ClearCLAStatus() As CLAStatus";
RDebugUtils.currentLine=191692801;
 //BA.debugLineNum = 191692801;BA.debugLine="Private this As CLAStatus";
_this = new xevolution.vrcg.devdemov2400.types._clastatus();
RDebugUtils.currentLine=191692802;
 //BA.debugLineNum = 191692802;BA.debugLine="this.Initialize";
_this.Initialize();
RDebugUtils.currentLine=191692803;
 //BA.debugLineNum = 191692803;BA.debugLine="this.Status = 0";
_this.Status /*int*/  = (int) (0);
RDebugUtils.currentLine=191692804;
 //BA.debugLineNum = 191692804;BA.debugLine="this.StartDate = \"\"";
_this.StartDate /*String*/  = "";
RDebugUtils.currentLine=191692805;
 //BA.debugLineNum = 191692805;BA.debugLine="this.Starttime = \"\"";
_this.Starttime /*String*/  = "";
RDebugUtils.currentLine=191692806;
 //BA.debugLineNum = 191692806;BA.debugLine="this.Endtime = \"\"";
_this.Endtime /*String*/  = "";
RDebugUtils.currentLine=191692807;
 //BA.debugLineNum = 191692807;BA.debugLine="this.Duration = \"\"";
_this.Duration /*String*/  = "";
RDebugUtils.currentLine=191692808;
 //BA.debugLineNum = 191692808;BA.debugLine="this.Points = 0";
_this.Points /*double*/  = 0;
RDebugUtils.currentLine=191692809;
 //BA.debugLineNum = 191692809;BA.debugLine="this.Risk = 0";
_this.Risk /*int*/  = (int) (0);
RDebugUtils.currentLine=191692810;
 //BA.debugLineNum = 191692810;BA.debugLine="this.Result = 0";
_this.Result /*int*/  = (int) (0);
RDebugUtils.currentLine=191692811;
 //BA.debugLineNum = 191692811;BA.debugLine="this.ResultDesc = \"\"";
_this.ResultDesc /*String*/  = "";
RDebugUtils.currentLine=191692812;
 //BA.debugLineNum = 191692812;BA.debugLine="this.HasImages = False";
_this.HasImages /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191692813;
 //BA.debugLineNum = 191692813;BA.debugLine="this.HasActions = False";
_this.HasActions /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191692814;
 //BA.debugLineNum = 191692814;BA.debugLine="this.HasSignatures = False";
_this.HasSignatures /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191692815;
 //BA.debugLineNum = 191692815;BA.debugLine="this.ReportGenerated = False";
_this.ReportGenerated /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191692816;
 //BA.debugLineNum = 191692816;BA.debugLine="this.CanChange = False";
_this.CanChange /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=191692817;
 //BA.debugLineNum = 191692817;BA.debugLine="Return this";
if (true) return _this;
RDebugUtils.currentLine=191692818;
 //BA.debugLineNum = 191692818;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._carobject  _clearedcarobject(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "clearedcarobject", false))
	 {return ((xevolution.vrcg.devdemov2400.types._carobject) Debug.delegate(null, "clearedcarobject", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._carobject _obt = null;
RDebugUtils.currentLine=189136896;
 //BA.debugLineNum = 189136896;BA.debugLine="Sub ClearedCarObject As CarObject";
RDebugUtils.currentLine=189136897;
 //BA.debugLineNum = 189136897;BA.debugLine="Dim obt As CarObject";
_obt = new xevolution.vrcg.devdemov2400.types._carobject();
RDebugUtils.currentLine=189136898;
 //BA.debugLineNum = 189136898;BA.debugLine="obt.Initialize";
_obt.Initialize();
RDebugUtils.currentLine=189136899;
 //BA.debugLineNum = 189136899;BA.debugLine="obt.obj = \"\"";
_obt.obj /*String*/  = "";
RDebugUtils.currentLine=189136900;
 //BA.debugLineNum = 189136900;BA.debugLine="obt.brand = \"\"";
_obt.brand /*String*/  = "";
RDebugUtils.currentLine=189136901;
 //BA.debugLineNum = 189136901;BA.debugLine="obt.model = \"\"";
_obt.model /*String*/  = "";
RDebugUtils.currentLine=189136902;
 //BA.debugLineNum = 189136902;BA.debugLine="obt.plate = \"\"";
_obt.plate /*String*/  = "";
RDebugUtils.currentLine=189136903;
 //BA.debugLineNum = 189136903;BA.debugLine="obt.km = 0";
_obt.km /*long*/  = (long) (0);
RDebugUtils.currentLine=189136904;
 //BA.debugLineNum = 189136904;BA.debugLine="Return obt";
if (true) return _obt;
RDebugUtils.currentLine=189136905;
 //BA.debugLineNum = 189136905;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._rundatefilters  _cleartyperundatefilters(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "cleartyperundatefilters", false))
	 {return ((xevolution.vrcg.devdemov2400.types._rundatefilters) Debug.delegate(null, "cleartyperundatefilters", new Object[] {_ba}));}
xevolution.vrcg.devdemov2400.types._rundatefilters _this = null;
RDebugUtils.currentLine=191954944;
 //BA.debugLineNum = 191954944;BA.debugLine="Sub ClearTypeRunDateFilters() As RunDateFilters";
RDebugUtils.currentLine=191954945;
 //BA.debugLineNum = 191954945;BA.debugLine="Private this As RunDateFilters";
_this = new xevolution.vrcg.devdemov2400.types._rundatefilters();
RDebugUtils.currentLine=191954946;
 //BA.debugLineNum = 191954946;BA.debugLine="this.Initialize";
_this.Initialize();
RDebugUtils.currentLine=191954947;
 //BA.debugLineNum = 191954947;BA.debugLine="this.DateStart = \"\"";
_this.DateStart /*String*/  = "";
RDebugUtils.currentLine=191954948;
 //BA.debugLineNum = 191954948;BA.debugLine="this.DateEnd = \"\"";
_this.DateEnd /*String*/  = "";
RDebugUtils.currentLine=191954949;
 //BA.debugLineNum = 191954949;BA.debugLine="Return this";
if (true) return _this;
RDebugUtils.currentLine=191954950;
 //BA.debugLineNum = 191954950;BA.debugLine="End Sub";
return null;
}
public static int  _findmarkerinfoindex(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _ml,String _slat,String _slong) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "findmarkerinfoindex", false))
	 {return ((Integer) Debug.delegate(null, "findmarkerinfoindex", new Object[] {_ba,_ml,_slat,_slong}));}
int _ret = 0;
int _n = 0;
xevolution.vrcg.devdemov2400.types._markerinfo _mi = null;
RDebugUtils.currentLine=187957248;
 //BA.debugLineNum = 187957248;BA.debugLine="Sub FindMarkerInfoIndex(ml As List, sLat As String";
RDebugUtils.currentLine=187957249;
 //BA.debugLineNum = 187957249;BA.debugLine="Dim ret As Int = -1";
_ret = (int) (-1);
RDebugUtils.currentLine=187957250;
 //BA.debugLineNum = 187957250;BA.debugLine="For n = 0 To ml.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_ml.getSize()-1);
_n = (int) (0) ;
for (;_n <= limit2 ;_n = _n + step2 ) {
RDebugUtils.currentLine=187957251;
 //BA.debugLineNum = 187957251;BA.debugLine="Dim mi As MarkerInfo = ml.Get(n)";
_mi = (xevolution.vrcg.devdemov2400.types._markerinfo)(_ml.Get(_n));
RDebugUtils.currentLine=187957252;
 //BA.debugLineNum = 187957252;BA.debugLine="If (mi.Latitude=sLat) And (mi.Longitude=sLong) T";
if (((_mi.Latitude /*String*/ ).equals(_slat)) && ((_mi.Longitude /*String*/ ).equals(_slong))) { 
RDebugUtils.currentLine=187957253;
 //BA.debugLineNum = 187957253;BA.debugLine="ret = n";
_ret = _n;
RDebugUtils.currentLine=187957254;
 //BA.debugLineNum = 187957254;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=187957257;
 //BA.debugLineNum = 187957257;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187957258;
 //BA.debugLineNum = 187957258;BA.debugLine="End Sub";
return 0;
}
public static String  _getgeodata(anywheresoftware.b4a.BA _ba,xevolution.vrcg.devdemov2400.types._geodata _g,String _lat,String _lon,String _date) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "getgeodata", false))
	 {return ((String) Debug.delegate(null, "getgeodata", new Object[] {_ba,_g,_lat,_lon,_date}));}
RDebugUtils.currentLine=191561728;
 //BA.debugLineNum = 191561728;BA.debugLine="Sub getGeoData(g  As GeoData, lat As String, lon A";
RDebugUtils.currentLine=191561729;
 //BA.debugLineNum = 191561729;BA.debugLine="lat = g.lat";
_lat = _g.lat /*String*/ ;
RDebugUtils.currentLine=191561730;
 //BA.debugLineNum = 191561730;BA.debugLine="lon = g.lon";
_lon = _g.lon /*String*/ ;
RDebugUtils.currentLine=191561731;
 //BA.debugLineNum = 191561731;BA.debugLine="date = g.date";
_date = _g.date /*String*/ ;
RDebugUtils.currentLine=191561732;
 //BA.debugLineNum = 191561732;BA.debugLine="End Sub";
return "";
}
public static xevolution.vrcg.devdemov2400.types._activityparams  _makeactivityparams(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activ,Object _activobj,int _posis,String _innerobject,String _obs) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeactivityparams", false))
	 {return ((xevolution.vrcg.devdemov2400.types._activityparams) Debug.delegate(null, "makeactivityparams", new Object[] {_ba,_activ,_activobj,_posis,_innerobject,_obs}));}
xevolution.vrcg.devdemov2400.types._activityparams _ret = null;
RDebugUtils.currentLine=188743680;
 //BA.debugLineNum = 188743680;BA.debugLine="Sub MakeActivityParams(activ As Activity, activOb";
RDebugUtils.currentLine=188743681;
 //BA.debugLineNum = 188743681;BA.debugLine="Dim ret As ActivityParams";
_ret = new xevolution.vrcg.devdemov2400.types._activityparams();
RDebugUtils.currentLine=188743683;
 //BA.debugLineNum = 188743683;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188743684;
 //BA.debugLineNum = 188743684;BA.debugLine="ret.activ = activ";
_ret.activ /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activ;
RDebugUtils.currentLine=188743685;
 //BA.debugLineNum = 188743685;BA.debugLine="ret.activObj = activObj";
_ret.activObj /*Object*/  = _activobj;
RDebugUtils.currentLine=188743686;
 //BA.debugLineNum = 188743686;BA.debugLine="ret.Posis = Posis";
_ret.Posis /*int*/  = _posis;
RDebugUtils.currentLine=188743687;
 //BA.debugLineNum = 188743687;BA.debugLine="ret.innerObject = innerObject";
_ret.innerObject /*String*/  = _innerobject;
RDebugUtils.currentLine=188743688;
 //BA.debugLineNum = 188743688;BA.debugLine="ret.Obs = Obs";
_ret.Obs /*String*/  = _obs;
RDebugUtils.currentLine=188743689;
 //BA.debugLineNum = 188743689;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188743690;
 //BA.debugLineNum = 188743690;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._carobject  _makecarobject(anywheresoftware.b4a.BA _ba,String _obj,String _brand,String _model,String _plate,long _km) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecarobject", false))
	 {return ((xevolution.vrcg.devdemov2400.types._carobject) Debug.delegate(null, "makecarobject", new Object[] {_ba,_obj,_brand,_model,_plate,_km}));}
xevolution.vrcg.devdemov2400.types._carobject _obt = null;
RDebugUtils.currentLine=189202432;
 //BA.debugLineNum = 189202432;BA.debugLine="Sub MakeCarObject(obj As String, brand As String,";
RDebugUtils.currentLine=189202433;
 //BA.debugLineNum = 189202433;BA.debugLine="Dim obt As CarObject";
_obt = new xevolution.vrcg.devdemov2400.types._carobject();
RDebugUtils.currentLine=189202434;
 //BA.debugLineNum = 189202434;BA.debugLine="obt.Initialize";
_obt.Initialize();
RDebugUtils.currentLine=189202435;
 //BA.debugLineNum = 189202435;BA.debugLine="obt.obj = obj";
_obt.obj /*String*/  = _obj;
RDebugUtils.currentLine=189202436;
 //BA.debugLineNum = 189202436;BA.debugLine="obt.brand = brand";
_obt.brand /*String*/  = _brand;
RDebugUtils.currentLine=189202437;
 //BA.debugLineNum = 189202437;BA.debugLine="obt.model = model";
_obt.model /*String*/  = _model;
RDebugUtils.currentLine=189202438;
 //BA.debugLineNum = 189202438;BA.debugLine="obt.plate = plate";
_obt.plate /*String*/  = _plate;
RDebugUtils.currentLine=189202439;
 //BA.debugLineNum = 189202439;BA.debugLine="obt.km = km";
_obt.km /*long*/  = _km;
RDebugUtils.currentLine=189202440;
 //BA.debugLineNum = 189202440;BA.debugLine="Return obt";
if (true) return _obt;
RDebugUtils.currentLine=189202441;
 //BA.debugLineNum = 189202441;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._cla_items  _makecla_items(anywheresoftware.b4a.BA _ba,String _task,String _item,String _uniquekey,String _answer,String _title) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecla_items", false))
	 {return ((xevolution.vrcg.devdemov2400.types._cla_items) Debug.delegate(null, "makecla_items", new Object[] {_ba,_task,_item,_uniquekey,_answer,_title}));}
xevolution.vrcg.devdemov2400.types._cla_items _ret = null;
RDebugUtils.currentLine=189792256;
 //BA.debugLineNum = 189792256;BA.debugLine="Sub MakeCLA_Items(Task As String, Item As String,";
RDebugUtils.currentLine=189792257;
 //BA.debugLineNum = 189792257;BA.debugLine="Dim ret As CLA_Items";
_ret = new xevolution.vrcg.devdemov2400.types._cla_items();
RDebugUtils.currentLine=189792258;
 //BA.debugLineNum = 189792258;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189792259;
 //BA.debugLineNum = 189792259;BA.debugLine="ret.Task = Task";
_ret.Task /*String*/  = _task;
RDebugUtils.currentLine=189792260;
 //BA.debugLineNum = 189792260;BA.debugLine="ret.Item = Item";
_ret.Item /*String*/  = _item;
RDebugUtils.currentLine=189792261;
 //BA.debugLineNum = 189792261;BA.debugLine="ret.UniqueKey = UniqueKey";
_ret.UniqueKey /*String*/  = _uniquekey;
RDebugUtils.currentLine=189792262;
 //BA.debugLineNum = 189792262;BA.debugLine="ret.Answer = Answer";
_ret.Answer /*String*/  = _answer;
RDebugUtils.currentLine=189792263;
 //BA.debugLineNum = 189792263;BA.debugLine="ret.Title = Title";
_ret.Title /*String*/  = _title;
RDebugUtils.currentLine=189792264;
 //BA.debugLineNum = 189792264;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189792265;
 //BA.debugLineNum = 189792265;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._cladata  _makecladata(anywheresoftware.b4a.BA _ba,String _request,String _action,String _task,String _item,String _uniquekey,String _tagcode,int _repeatcounter,boolean _readonly,boolean _composed,xevolution.vrcg.devdemov2400.types._clastatus _statusmaster,xevolution.vrcg.devdemov2400.types._clastatus _statuschild) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecladata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._cladata) Debug.delegate(null, "makecladata", new Object[] {_ba,_request,_action,_task,_item,_uniquekey,_tagcode,_repeatcounter,_readonly,_composed,_statusmaster,_statuschild}));}
xevolution.vrcg.devdemov2400.types._cladata _this = null;
RDebugUtils.currentLine=191758336;
 //BA.debugLineNum = 191758336;BA.debugLine="Sub MakeCLAData(Request As String, Action As Strin";
RDebugUtils.currentLine=191758338;
 //BA.debugLineNum = 191758338;BA.debugLine="Private this As CLAData";
_this = new xevolution.vrcg.devdemov2400.types._cladata();
RDebugUtils.currentLine=191758339;
 //BA.debugLineNum = 191758339;BA.debugLine="this.Initialize";
_this.Initialize();
RDebugUtils.currentLine=191758340;
 //BA.debugLineNum = 191758340;BA.debugLine="this.Request = Request";
_this.Request /*String*/  = _request;
RDebugUtils.currentLine=191758341;
 //BA.debugLineNum = 191758341;BA.debugLine="this.Action = Action";
_this.Action /*String*/  = _action;
RDebugUtils.currentLine=191758342;
 //BA.debugLineNum = 191758342;BA.debugLine="this.Task = Task";
_this.Task /*String*/  = _task;
RDebugUtils.currentLine=191758343;
 //BA.debugLineNum = 191758343;BA.debugLine="this.Item = Item";
_this.Item /*String*/  = _item;
RDebugUtils.currentLine=191758344;
 //BA.debugLineNum = 191758344;BA.debugLine="this.UniqueKey = UniqueKey";
_this.UniqueKey /*String*/  = _uniquekey;
RDebugUtils.currentLine=191758345;
 //BA.debugLineNum = 191758345;BA.debugLine="this.Tagcode = Tagcode";
_this.Tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=191758346;
 //BA.debugLineNum = 191758346;BA.debugLine="this.RepeatCounter = RepeatCounter";
_this.RepeatCounter /*int*/  = _repeatcounter;
RDebugUtils.currentLine=191758347;
 //BA.debugLineNum = 191758347;BA.debugLine="this.ReadOnly = ReadOnly";
_this.ReadOnly /*boolean*/  = _readonly;
RDebugUtils.currentLine=191758348;
 //BA.debugLineNum = 191758348;BA.debugLine="this.Composed = Composed";
_this.Composed /*boolean*/  = _composed;
RDebugUtils.currentLine=191758349;
 //BA.debugLineNum = 191758349;BA.debugLine="this.StatusMaster = StatusMaster";
_this.StatusMaster /*xevolution.vrcg.devdemov2400.types._clastatus*/  = _statusmaster;
RDebugUtils.currentLine=191758350;
 //BA.debugLineNum = 191758350;BA.debugLine="this.StatusChild = StatusChild";
_this.StatusChild /*xevolution.vrcg.devdemov2400.types._clastatus*/  = _statuschild;
RDebugUtils.currentLine=191758351;
 //BA.debugLineNum = 191758351;BA.debugLine="Return this";
if (true) return _this;
RDebugUtils.currentLine=191758352;
 //BA.debugLineNum = 191758352;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._clastatus  _makeclastatus(anywheresoftware.b4a.BA _ba,int _status,String _startdate,String _starttime,String _endtime,String _duration,double _points,int _risk,int _result,String _resultdesc,boolean _hasimages,boolean _hasactions,boolean _hassignatures,boolean _reportgenerated,boolean _canchange) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeclastatus", false))
	 {return ((xevolution.vrcg.devdemov2400.types._clastatus) Debug.delegate(null, "makeclastatus", new Object[] {_ba,_status,_startdate,_starttime,_endtime,_duration,_points,_risk,_result,_resultdesc,_hasimages,_hasactions,_hassignatures,_reportgenerated,_canchange}));}
xevolution.vrcg.devdemov2400.types._clastatus _this = null;
RDebugUtils.currentLine=191627264;
 //BA.debugLineNum = 191627264;BA.debugLine="Sub MakeCLAStatus(Status As Int, StartDate As Stri";
RDebugUtils.currentLine=191627267;
 //BA.debugLineNum = 191627267;BA.debugLine="Private this As CLAStatus";
_this = new xevolution.vrcg.devdemov2400.types._clastatus();
RDebugUtils.currentLine=191627268;
 //BA.debugLineNum = 191627268;BA.debugLine="this.Initialize";
_this.Initialize();
RDebugUtils.currentLine=191627269;
 //BA.debugLineNum = 191627269;BA.debugLine="this.Status = Status";
_this.Status /*int*/  = _status;
RDebugUtils.currentLine=191627270;
 //BA.debugLineNum = 191627270;BA.debugLine="this.StartDate = StartDate";
_this.StartDate /*String*/  = _startdate;
RDebugUtils.currentLine=191627271;
 //BA.debugLineNum = 191627271;BA.debugLine="this.Starttime = Starttime";
_this.Starttime /*String*/  = _starttime;
RDebugUtils.currentLine=191627272;
 //BA.debugLineNum = 191627272;BA.debugLine="this.Endtime = Endtime";
_this.Endtime /*String*/  = _endtime;
RDebugUtils.currentLine=191627273;
 //BA.debugLineNum = 191627273;BA.debugLine="this.Duration = Duration";
_this.Duration /*String*/  = _duration;
RDebugUtils.currentLine=191627274;
 //BA.debugLineNum = 191627274;BA.debugLine="this.Points = Points";
_this.Points /*double*/  = _points;
RDebugUtils.currentLine=191627275;
 //BA.debugLineNum = 191627275;BA.debugLine="this.Risk = Risk";
_this.Risk /*int*/  = _risk;
RDebugUtils.currentLine=191627276;
 //BA.debugLineNum = 191627276;BA.debugLine="this.Result = Result";
_this.Result /*int*/  = _result;
RDebugUtils.currentLine=191627277;
 //BA.debugLineNum = 191627277;BA.debugLine="this.ResultDesc = ResultDesc";
_this.ResultDesc /*String*/  = _resultdesc;
RDebugUtils.currentLine=191627278;
 //BA.debugLineNum = 191627278;BA.debugLine="this.HasImages = HasImages";
_this.HasImages /*boolean*/  = _hasimages;
RDebugUtils.currentLine=191627279;
 //BA.debugLineNum = 191627279;BA.debugLine="this.HasActions = HasActions";
_this.HasActions /*boolean*/  = _hasactions;
RDebugUtils.currentLine=191627280;
 //BA.debugLineNum = 191627280;BA.debugLine="this.HasSignatures = HasSignatures";
_this.HasSignatures /*boolean*/  = _hassignatures;
RDebugUtils.currentLine=191627281;
 //BA.debugLineNum = 191627281;BA.debugLine="this.ReportGenerated = ReportGenerated";
_this.ReportGenerated /*boolean*/  = _reportgenerated;
RDebugUtils.currentLine=191627282;
 //BA.debugLineNum = 191627282;BA.debugLine="this.CanChange = CanChange";
_this.CanChange /*boolean*/  = _canchange;
RDebugUtils.currentLine=191627283;
 //BA.debugLineNum = 191627283;BA.debugLine="Return this";
if (true) return _this;
RDebugUtils.currentLine=191627284;
 //BA.debugLineNum = 191627284;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._clataskitem  _makeclataskitem(anywheresoftware.b4a.BA _ba,String _task_tagcode,String _item_tagcode,String _unique_key,int _position,int _level,String _parent_tagcode,int _item_type,int _points,int _risk,int _data_type,int _bullet_master,int _bullet_child,String _type_answer,int _typified_answers,int _mandatory,int _critical,int _repeated,int _multiple,int _on_report,int _has_signature,int _has_articles,String _type_nonconformity,String _ta_tagcode,int _ta_override_result,String _ta_jump_tagcode,String _defobj_tagcode,String _info_notes,String _asw_notes,int _validate_execution,String _cla_obs,int _force_signature,int _force_picture,int _force_time,int _type_time_control,int _time_run_anyway,String _dependent_key,String _time_duration,int _force_control,int _type_control,int _control_run_anyway,String _control_condition,String _do_tagcode,int _do_associate_type,String _do_object_image,String _reference,String _do_subgroup,String _do_subsubgroup,String _do_affected_table,String _do_affected_tagcode,String _do_affected_field,int _change_title_totime,int _answer_change_title) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeclataskitem", false))
	 {return ((xevolution.vrcg.devdemov2400.types._clataskitem) Debug.delegate(null, "makeclataskitem", new Object[] {_ba,_task_tagcode,_item_tagcode,_unique_key,_position,_level,_parent_tagcode,_item_type,_points,_risk,_data_type,_bullet_master,_bullet_child,_type_answer,_typified_answers,_mandatory,_critical,_repeated,_multiple,_on_report,_has_signature,_has_articles,_type_nonconformity,_ta_tagcode,_ta_override_result,_ta_jump_tagcode,_defobj_tagcode,_info_notes,_asw_notes,_validate_execution,_cla_obs,_force_signature,_force_picture,_force_time,_type_time_control,_time_run_anyway,_dependent_key,_time_duration,_force_control,_type_control,_control_run_anyway,_control_condition,_do_tagcode,_do_associate_type,_do_object_image,_reference,_do_subgroup,_do_subsubgroup,_do_affected_table,_do_affected_tagcode,_do_affected_field,_change_title_totime,_answer_change_title}));}
xevolution.vrcg.devdemov2400.types._clataskitem _ret = null;
RDebugUtils.currentLine=188350464;
 //BA.debugLineNum = 188350464;BA.debugLine="Sub MakeCLATaskItem(task_tagcode As String,item_ta";
RDebugUtils.currentLine=188350474;
 //BA.debugLineNum = 188350474;BA.debugLine="Dim ret As CLATaskItem";
_ret = new xevolution.vrcg.devdemov2400.types._clataskitem();
RDebugUtils.currentLine=188350475;
 //BA.debugLineNum = 188350475;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188350476;
 //BA.debugLineNum = 188350476;BA.debugLine="ret.task_tagcode = task_tagcode";
_ret.task_tagcode /*String*/  = _task_tagcode;
RDebugUtils.currentLine=188350477;
 //BA.debugLineNum = 188350477;BA.debugLine="ret.item_tagcode = item_tagcode";
_ret.item_tagcode /*String*/  = _item_tagcode;
RDebugUtils.currentLine=188350478;
 //BA.debugLineNum = 188350478;BA.debugLine="ret.unique_key = unique_key";
_ret.unique_key /*String*/  = _unique_key;
RDebugUtils.currentLine=188350479;
 //BA.debugLineNum = 188350479;BA.debugLine="ret.position = position";
_ret.position /*int*/  = _position;
RDebugUtils.currentLine=188350480;
 //BA.debugLineNum = 188350480;BA.debugLine="ret.level = level";
_ret.level /*int*/  = _level;
RDebugUtils.currentLine=188350481;
 //BA.debugLineNum = 188350481;BA.debugLine="ret.parent_tagcode = parent_tagcode";
_ret.parent_tagcode /*String*/  = _parent_tagcode;
RDebugUtils.currentLine=188350482;
 //BA.debugLineNum = 188350482;BA.debugLine="ret.item_type = item_type";
_ret.item_type /*int*/  = _item_type;
RDebugUtils.currentLine=188350483;
 //BA.debugLineNum = 188350483;BA.debugLine="ret.points = points";
_ret.points /*int*/  = _points;
RDebugUtils.currentLine=188350484;
 //BA.debugLineNum = 188350484;BA.debugLine="ret.risk = risk";
_ret.risk /*int*/  = _risk;
RDebugUtils.currentLine=188350485;
 //BA.debugLineNum = 188350485;BA.debugLine="ret.data_type = data_type";
_ret.data_type /*int*/  = _data_type;
RDebugUtils.currentLine=188350486;
 //BA.debugLineNum = 188350486;BA.debugLine="ret.bullet_master = bullet_master";
_ret.bullet_master /*int*/  = _bullet_master;
RDebugUtils.currentLine=188350487;
 //BA.debugLineNum = 188350487;BA.debugLine="ret.bullet_child = bullet_child";
_ret.bullet_child /*int*/  = _bullet_child;
RDebugUtils.currentLine=188350488;
 //BA.debugLineNum = 188350488;BA.debugLine="ret.type_answer = type_answer";
_ret.type_answer /*String*/  = _type_answer;
RDebugUtils.currentLine=188350489;
 //BA.debugLineNum = 188350489;BA.debugLine="ret.typified_answers = typified_answers";
_ret.typified_answers /*int*/  = _typified_answers;
RDebugUtils.currentLine=188350490;
 //BA.debugLineNum = 188350490;BA.debugLine="ret.mandatory = mandatory";
_ret.mandatory /*int*/  = _mandatory;
RDebugUtils.currentLine=188350491;
 //BA.debugLineNum = 188350491;BA.debugLine="ret.critical = critical";
_ret.critical /*int*/  = _critical;
RDebugUtils.currentLine=188350492;
 //BA.debugLineNum = 188350492;BA.debugLine="ret.repeated = repeated";
_ret.repeated /*int*/  = _repeated;
RDebugUtils.currentLine=188350493;
 //BA.debugLineNum = 188350493;BA.debugLine="ret.multiple = multiple";
_ret.multiple /*int*/  = _multiple;
RDebugUtils.currentLine=188350494;
 //BA.debugLineNum = 188350494;BA.debugLine="ret.on_report = on_report";
_ret.on_report /*int*/  = _on_report;
RDebugUtils.currentLine=188350495;
 //BA.debugLineNum = 188350495;BA.debugLine="ret.has_signature = has_signature";
_ret.has_signature /*int*/  = _has_signature;
RDebugUtils.currentLine=188350496;
 //BA.debugLineNum = 188350496;BA.debugLine="ret.has_articles = has_articles";
_ret.has_articles /*int*/  = _has_articles;
RDebugUtils.currentLine=188350497;
 //BA.debugLineNum = 188350497;BA.debugLine="ret.type_nonconformity = type_nonconformity";
_ret.type_nonconformity /*String*/  = _type_nonconformity;
RDebugUtils.currentLine=188350498;
 //BA.debugLineNum = 188350498;BA.debugLine="ret.ta_tagcode = ta_tagcode";
_ret.ta_tagcode /*String*/  = _ta_tagcode;
RDebugUtils.currentLine=188350499;
 //BA.debugLineNum = 188350499;BA.debugLine="ret.ta_override_result = ta_override_result";
_ret.ta_override_result /*int*/  = _ta_override_result;
RDebugUtils.currentLine=188350500;
 //BA.debugLineNum = 188350500;BA.debugLine="ret.ta_jump_tagcode = ta_jump_tagcode";
_ret.ta_jump_tagcode /*String*/  = _ta_jump_tagcode;
RDebugUtils.currentLine=188350501;
 //BA.debugLineNum = 188350501;BA.debugLine="ret.defobj_tagcode = defobj_tagcode";
_ret.defobj_tagcode /*String*/  = _defobj_tagcode;
RDebugUtils.currentLine=188350502;
 //BA.debugLineNum = 188350502;BA.debugLine="ret.info_notes = info_notes";
_ret.info_notes /*String*/  = _info_notes;
RDebugUtils.currentLine=188350503;
 //BA.debugLineNum = 188350503;BA.debugLine="ret.asw_notes = asw_notes";
_ret.asw_notes /*String*/  = _asw_notes;
RDebugUtils.currentLine=188350504;
 //BA.debugLineNum = 188350504;BA.debugLine="ret.validate_execution = validate_execution";
_ret.validate_execution /*int*/  = _validate_execution;
RDebugUtils.currentLine=188350505;
 //BA.debugLineNum = 188350505;BA.debugLine="ret.cla_obs = cla_obs";
_ret.cla_obs /*String*/  = _cla_obs;
RDebugUtils.currentLine=188350506;
 //BA.debugLineNum = 188350506;BA.debugLine="ret.force_signature = force_signature";
_ret.force_signature /*int*/  = _force_signature;
RDebugUtils.currentLine=188350507;
 //BA.debugLineNum = 188350507;BA.debugLine="ret.force_picture = force_picture";
_ret.force_picture /*int*/  = _force_picture;
RDebugUtils.currentLine=188350508;
 //BA.debugLineNum = 188350508;BA.debugLine="ret.force_time = force_time";
_ret.force_time /*int*/  = _force_time;
RDebugUtils.currentLine=188350509;
 //BA.debugLineNum = 188350509;BA.debugLine="ret.type_time_control = type_time_control";
_ret.type_time_control /*int*/  = _type_time_control;
RDebugUtils.currentLine=188350510;
 //BA.debugLineNum = 188350510;BA.debugLine="ret.time_run_anyway = time_run_anyway";
_ret.time_run_anyway /*int*/  = _time_run_anyway;
RDebugUtils.currentLine=188350511;
 //BA.debugLineNum = 188350511;BA.debugLine="ret.dependent_key = dependent_key";
_ret.dependent_key /*String*/  = _dependent_key;
RDebugUtils.currentLine=188350512;
 //BA.debugLineNum = 188350512;BA.debugLine="ret.time_duration = time_duration";
_ret.time_duration /*String*/  = _time_duration;
RDebugUtils.currentLine=188350513;
 //BA.debugLineNum = 188350513;BA.debugLine="ret.force_control = force_control";
_ret.force_control /*int*/  = _force_control;
RDebugUtils.currentLine=188350514;
 //BA.debugLineNum = 188350514;BA.debugLine="ret.type_control = type_control";
_ret.type_control /*int*/  = _type_control;
RDebugUtils.currentLine=188350515;
 //BA.debugLineNum = 188350515;BA.debugLine="ret.control_run_anyway = control_run_anyway";
_ret.control_run_anyway /*int*/  = _control_run_anyway;
RDebugUtils.currentLine=188350516;
 //BA.debugLineNum = 188350516;BA.debugLine="ret.control_condition = control_condition";
_ret.control_condition /*String*/  = _control_condition;
RDebugUtils.currentLine=188350517;
 //BA.debugLineNum = 188350517;BA.debugLine="ret.do_tagcode = do_tagcode";
_ret.do_tagcode /*String*/  = _do_tagcode;
RDebugUtils.currentLine=188350518;
 //BA.debugLineNum = 188350518;BA.debugLine="ret.do_associate_type = do_associate_type";
_ret.do_associate_type /*int*/  = _do_associate_type;
RDebugUtils.currentLine=188350519;
 //BA.debugLineNum = 188350519;BA.debugLine="ret.do_object_image = do_object_image";
_ret.do_object_image /*String*/  = _do_object_image;
RDebugUtils.currentLine=188350520;
 //BA.debugLineNum = 188350520;BA.debugLine="ret.reference = reference";
_ret.reference /*String*/  = _reference;
RDebugUtils.currentLine=188350521;
 //BA.debugLineNum = 188350521;BA.debugLine="ret.do_subgroup = do_subgroup";
_ret.do_subgroup /*String*/  = _do_subgroup;
RDebugUtils.currentLine=188350522;
 //BA.debugLineNum = 188350522;BA.debugLine="ret.do_subsubgroup = do_subsubgroup";
_ret.do_subsubgroup /*String*/  = _do_subsubgroup;
RDebugUtils.currentLine=188350523;
 //BA.debugLineNum = 188350523;BA.debugLine="ret.do_affected_table = do_affected_table";
_ret.do_affected_table /*String*/  = _do_affected_table;
RDebugUtils.currentLine=188350524;
 //BA.debugLineNum = 188350524;BA.debugLine="ret.do_affected_tagcode = do_affected_tagcode";
_ret.do_affected_tagcode /*String*/  = _do_affected_tagcode;
RDebugUtils.currentLine=188350525;
 //BA.debugLineNum = 188350525;BA.debugLine="ret.do_affected_field = do_affected_field";
_ret.do_affected_field /*String*/  = _do_affected_field;
RDebugUtils.currentLine=188350526;
 //BA.debugLineNum = 188350526;BA.debugLine="ret.change_title_totime = change_title_totime";
_ret.change_title_totime /*int*/  = _change_title_totime;
RDebugUtils.currentLine=188350527;
 //BA.debugLineNum = 188350527;BA.debugLine="ret.answer_change_title = answer_change_title";
_ret.answer_change_title /*int*/  = _answer_change_title;
RDebugUtils.currentLine=188350528;
 //BA.debugLineNum = 188350528;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188350529;
 //BA.debugLineNum = 188350529;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._createrequestreturn  _makecreaterequestreturn(anywheresoftware.b4a.BA _ba,String _requesttagcode,int _status,int _stage) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makecreaterequestreturn", false))
	 {return ((xevolution.vrcg.devdemov2400.types._createrequestreturn) Debug.delegate(null, "makecreaterequestreturn", new Object[] {_ba,_requesttagcode,_status,_stage}));}
xevolution.vrcg.devdemov2400.types._createrequestreturn _res = null;
RDebugUtils.currentLine=187170816;
 //BA.debugLineNum = 187170816;BA.debugLine="Sub MakeCreateRequestReturn(RequestTagcode As Stri";
RDebugUtils.currentLine=187170817;
 //BA.debugLineNum = 187170817;BA.debugLine="Dim res As CreateRequestReturn";
_res = new xevolution.vrcg.devdemov2400.types._createrequestreturn();
RDebugUtils.currentLine=187170818;
 //BA.debugLineNum = 187170818;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=187170819;
 //BA.debugLineNum = 187170819;BA.debugLine="res.RequestTagcode = RequestTagcode";
_res.RequestTagcode /*String*/  = _requesttagcode;
RDebugUtils.currentLine=187170820;
 //BA.debugLineNum = 187170820;BA.debugLine="res.Status = Status";
_res.Status /*int*/  = _status;
RDebugUtils.currentLine=187170821;
 //BA.debugLineNum = 187170821;BA.debugLine="res.Stage = Stage";
_res.Stage /*int*/  = _stage;
RDebugUtils.currentLine=187170822;
 //BA.debugLineNum = 187170822;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=187170823;
 //BA.debugLineNum = 187170823;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._entityinformation  _makeentityinformation(anywheresoftware.b4a.BA _ba,String _tagcode,int _enttype,String _entname,String _entaddress,String _entaddress2,String _entcpostal,String _entcity,String _entctnphone,String _entctnname,String _entlatitude,String _entlongitude,boolean _asnew) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makeentityinformation", false))
	 {return ((xevolution.vrcg.devdemov2400.types._entityinformation) Debug.delegate(null, "makeentityinformation", new Object[] {_ba,_tagcode,_enttype,_entname,_entaddress,_entaddress2,_entcpostal,_entcity,_entctnphone,_entctnname,_entlatitude,_entlongitude,_asnew}));}
xevolution.vrcg.devdemov2400.types._entityinformation _ret = null;
RDebugUtils.currentLine=190644224;
 //BA.debugLineNum = 190644224;BA.debugLine="Sub MakeEntityInformation(tagcode As String, entTy";
RDebugUtils.currentLine=190644226;
 //BA.debugLineNum = 190644226;BA.debugLine="Dim ret As EntityInformation";
_ret = new xevolution.vrcg.devdemov2400.types._entityinformation();
RDebugUtils.currentLine=190644227;
 //BA.debugLineNum = 190644227;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=190644228;
 //BA.debugLineNum = 190644228;BA.debugLine="ret.tagcode = tagcode";
_ret.tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=190644229;
 //BA.debugLineNum = 190644229;BA.debugLine="ret.entType = entType";
_ret.entType /*int*/  = _enttype;
RDebugUtils.currentLine=190644230;
 //BA.debugLineNum = 190644230;BA.debugLine="ret.entName = entName";
_ret.entName /*String*/  = _entname;
RDebugUtils.currentLine=190644231;
 //BA.debugLineNum = 190644231;BA.debugLine="ret.entAddress = entAddress";
_ret.entAddress /*String*/  = _entaddress;
RDebugUtils.currentLine=190644232;
 //BA.debugLineNum = 190644232;BA.debugLine="ret.entAddress2 = entAddress2";
_ret.entAddress2 /*String*/  = _entaddress2;
RDebugUtils.currentLine=190644233;
 //BA.debugLineNum = 190644233;BA.debugLine="ret.entCpostal = entCpostal";
_ret.entCpostal /*String*/  = _entcpostal;
RDebugUtils.currentLine=190644234;
 //BA.debugLineNum = 190644234;BA.debugLine="ret.entCity = entCity";
_ret.entCity /*String*/  = _entcity;
RDebugUtils.currentLine=190644235;
 //BA.debugLineNum = 190644235;BA.debugLine="ret.entCtnPhone = entCtnPhone";
_ret.entCtnPhone /*String*/  = _entctnphone;
RDebugUtils.currentLine=190644236;
 //BA.debugLineNum = 190644236;BA.debugLine="ret.entCtnName = entCtnName";
_ret.entCtnName /*String*/  = _entctnname;
RDebugUtils.currentLine=190644237;
 //BA.debugLineNum = 190644237;BA.debugLine="ret.entLatitude = entLatitude";
_ret.entLatitude /*String*/  = _entlatitude;
RDebugUtils.currentLine=190644238;
 //BA.debugLineNum = 190644238;BA.debugLine="ret.entLongitude = entLongitude";
_ret.entLongitude /*String*/  = _entlongitude;
RDebugUtils.currentLine=190644239;
 //BA.debugLineNum = 190644239;BA.debugLine="ret.asNew = asNew";
_ret.asNew /*boolean*/  = _asnew;
RDebugUtils.currentLine=190644240;
 //BA.debugLineNum = 190644240;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=190644241;
 //BA.debugLineNum = 190644241;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._filedownloadinformation  _makefiledownloadinformation(anywheresoftware.b4a.BA _ba,boolean _downloaded,String _downloadfilename,int _status) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makefiledownloadinformation", false))
	 {return ((xevolution.vrcg.devdemov2400.types._filedownloadinformation) Debug.delegate(null, "makefiledownloadinformation", new Object[] {_ba,_downloaded,_downloadfilename,_status}));}
xevolution.vrcg.devdemov2400.types._filedownloadinformation _res = null;
RDebugUtils.currentLine=187039744;
 //BA.debugLineNum = 187039744;BA.debugLine="Sub MakeFileDownloadInformation(Downloaded As Bool";
RDebugUtils.currentLine=187039745;
 //BA.debugLineNum = 187039745;BA.debugLine="Dim res As FileDownloadInformation";
_res = new xevolution.vrcg.devdemov2400.types._filedownloadinformation();
RDebugUtils.currentLine=187039746;
 //BA.debugLineNum = 187039746;BA.debugLine="res.initialize";
_res.Initialize();
RDebugUtils.currentLine=187039747;
 //BA.debugLineNum = 187039747;BA.debugLine="res.Downloaded = Downloaded";
_res.Downloaded /*boolean*/  = _downloaded;
RDebugUtils.currentLine=187039748;
 //BA.debugLineNum = 187039748;BA.debugLine="res.DownloadFilename = DownloadFilename";
_res.DownloadFilename /*String*/  = _downloadfilename;
RDebugUtils.currentLine=187039749;
 //BA.debugLineNum = 187039749;BA.debugLine="res.Status = Status";
_res.Status /*int*/  = _status;
RDebugUtils.currentLine=187039750;
 //BA.debugLineNum = 187039750;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=187039751;
 //BA.debugLineNum = 187039751;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._fileshot  _makefileshot(anywheresoftware.b4a.BA _ba,String _folder,String _filename) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makefileshot", false))
	 {return ((xevolution.vrcg.devdemov2400.types._fileshot) Debug.delegate(null, "makefileshot", new Object[] {_ba,_folder,_filename}));}
xevolution.vrcg.devdemov2400.types._fileshot _ret = null;
RDebugUtils.currentLine=189399040;
 //BA.debugLineNum = 189399040;BA.debugLine="Sub MakeFileShot(Folder As String, Filename As Str";
RDebugUtils.currentLine=189399041;
 //BA.debugLineNum = 189399041;BA.debugLine="Dim ret As FileShot";
_ret = new xevolution.vrcg.devdemov2400.types._fileshot();
RDebugUtils.currentLine=189399042;
 //BA.debugLineNum = 189399042;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189399043;
 //BA.debugLineNum = 189399043;BA.debugLine="ret.Folder = Folder";
_ret.Folder /*String*/  = _folder;
RDebugUtils.currentLine=189399044;
 //BA.debugLineNum = 189399044;BA.debugLine="ret.Filename = Filename";
_ret.Filename /*String*/  = _filename;
RDebugUtils.currentLine=189399045;
 //BA.debugLineNum = 189399045;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189399046;
 //BA.debugLineNum = 189399046;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._markerinfo  _makemarkerinfo(anywheresoftware.b4a.BA _ba,String _latitude,String _longitude,anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper _markerpoint) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makemarkerinfo", false))
	 {return ((xevolution.vrcg.devdemov2400.types._markerinfo) Debug.delegate(null, "makemarkerinfo", new Object[] {_ba,_latitude,_longitude,_markerpoint}));}
xevolution.vrcg.devdemov2400.types._markerinfo _ret = null;
RDebugUtils.currentLine=187891712;
 //BA.debugLineNum = 187891712;BA.debugLine="Sub MAkeMarkerInfo(Latitude As String, Longitude A";
RDebugUtils.currentLine=187891713;
 //BA.debugLineNum = 187891713;BA.debugLine="Dim ret As MarkerInfo";
_ret = new xevolution.vrcg.devdemov2400.types._markerinfo();
RDebugUtils.currentLine=187891714;
 //BA.debugLineNum = 187891714;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=187891715;
 //BA.debugLineNum = 187891715;BA.debugLine="ret.Latitude = Latitude";
_ret.Latitude /*String*/  = _latitude;
RDebugUtils.currentLine=187891716;
 //BA.debugLineNum = 187891716;BA.debugLine="ret.Longitude = Longitude";
_ret.Longitude /*String*/  = _longitude;
RDebugUtils.currentLine=187891717;
 //BA.debugLineNum = 187891717;BA.debugLine="ret.MarkerPoint = MarkerPoint";
_ret.MarkerPoint /*anywheresoftware.b4a.objects.MapFragmentWrapper.MarkerWrapper*/  = _markerpoint;
RDebugUtils.currentLine=187891718;
 //BA.debugLineNum = 187891718;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=187891719;
 //BA.debugLineNum = 187891719;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._pievaluestype  _makepievaluestype(anywheresoftware.b4a.BA _ba,String _name,int _value,int _color) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "makepievaluestype", false))
	 {return ((xevolution.vrcg.devdemov2400.types._pievaluestype) Debug.delegate(null, "makepievaluestype", new Object[] {_ba,_name,_value,_color}));}
xevolution.vrcg.devdemov2400.types._pievaluestype _ret = null;
RDebugUtils.currentLine=188022784;
 //BA.debugLineNum = 188022784;BA.debugLine="Sub MakePieValuesType(Name As String, Value As Int";
RDebugUtils.currentLine=188022785;
 //BA.debugLineNum = 188022785;BA.debugLine="Dim ret As PieValuesType";
_ret = new xevolution.vrcg.devdemov2400.types._pievaluestype();
RDebugUtils.currentLine=188022786;
 //BA.debugLineNum = 188022786;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188022787;
 //BA.debugLineNum = 188022787;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=188022788;
 //BA.debugLineNum = 188022788;BA.debugLine="ret.Value = Value";
_ret.Value /*int*/  = _value;
RDebugUtils.currentLine=188022789;
 //BA.debugLineNum = 188022789;BA.debugLine="ret.Color = Color";
_ret.Color /*int*/  = _color;
RDebugUtils.currentLine=188022790;
 //BA.debugLineNum = 188022790;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188022791;
 //BA.debugLineNum = 188022791;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._tablecounters  _maketablecounters(anywheresoftware.b4a.BA _ba,String _tablename,int _counter) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "maketablecounters", false))
	 {return ((xevolution.vrcg.devdemov2400.types._tablecounters) Debug.delegate(null, "maketablecounters", new Object[] {_ba,_tablename,_counter}));}
xevolution.vrcg.devdemov2400.types._tablecounters _ret = null;
RDebugUtils.currentLine=188874752;
 //BA.debugLineNum = 188874752;BA.debugLine="Sub MakeTableCounters(tablename As String, counter";
RDebugUtils.currentLine=188874753;
 //BA.debugLineNum = 188874753;BA.debugLine="Dim ret As TableCounters";
_ret = new xevolution.vrcg.devdemov2400.types._tablecounters();
RDebugUtils.currentLine=188874754;
 //BA.debugLineNum = 188874754;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=188874755;
 //BA.debugLineNum = 188874755;BA.debugLine="ret.tablename = tablename";
_ret.tablename /*String*/  = _tablename;
RDebugUtils.currentLine=188874756;
 //BA.debugLineNum = 188874756;BA.debugLine="ret.counter = counter";
_ret.counter /*int*/  = _counter;
RDebugUtils.currentLine=188874757;
 //BA.debugLineNum = 188874757;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=188874758;
 //BA.debugLineNum = 188874758;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._testrequestitem  _maketestrequestitem(anywheresoftware.b4a.BA _ba,String _request,String _action,String _task,String _item,String _uniquekey,String _tagcode,String _value,String _obs,String _actionsub,String _image) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "maketestrequestitem", false))
	 {return ((xevolution.vrcg.devdemov2400.types._testrequestitem) Debug.delegate(null, "maketestrequestitem", new Object[] {_ba,_request,_action,_task,_item,_uniquekey,_tagcode,_value,_obs,_actionsub,_image}));}
xevolution.vrcg.devdemov2400.types._testrequestitem _ret = null;
RDebugUtils.currentLine=189857792;
 //BA.debugLineNum = 189857792;BA.debugLine="Sub MakeTestRequestItem(Request As String, Action";
RDebugUtils.currentLine=189857794;
 //BA.debugLineNum = 189857794;BA.debugLine="Dim ret As TestRequestItem";
_ret = new xevolution.vrcg.devdemov2400.types._testrequestitem();
RDebugUtils.currentLine=189857795;
 //BA.debugLineNum = 189857795;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=189857796;
 //BA.debugLineNum = 189857796;BA.debugLine="ret.Request = Request";
_ret.Request /*String*/  = _request;
RDebugUtils.currentLine=189857797;
 //BA.debugLineNum = 189857797;BA.debugLine="ret.Action = Action";
_ret.Action /*String*/  = _action;
RDebugUtils.currentLine=189857798;
 //BA.debugLineNum = 189857798;BA.debugLine="ret.Task = Task";
_ret.Task /*String*/  = _task;
RDebugUtils.currentLine=189857799;
 //BA.debugLineNum = 189857799;BA.debugLine="ret.Item = Item";
_ret.Item /*String*/  = _item;
RDebugUtils.currentLine=189857800;
 //BA.debugLineNum = 189857800;BA.debugLine="ret.UniqueKey = UniqueKey";
_ret.UniqueKey /*String*/  = _uniquekey;
RDebugUtils.currentLine=189857801;
 //BA.debugLineNum = 189857801;BA.debugLine="ret.Tagcode = Tagcode";
_ret.Tagcode /*String*/  = _tagcode;
RDebugUtils.currentLine=189857802;
 //BA.debugLineNum = 189857802;BA.debugLine="ret.Value = Value";
_ret.Value /*String*/  = _value;
RDebugUtils.currentLine=189857803;
 //BA.debugLineNum = 189857803;BA.debugLine="ret.Obs = Obs";
_ret.Obs /*String*/  = _obs;
RDebugUtils.currentLine=189857804;
 //BA.debugLineNum = 189857804;BA.debugLine="ret.ActionSub = ActionSub";
_ret.ActionSub /*String*/  = _actionsub;
RDebugUtils.currentLine=189857805;
 //BA.debugLineNum = 189857805;BA.debugLine="ret.Image = Image";
_ret.Image /*String*/  = _image;
RDebugUtils.currentLine=189857806;
 //BA.debugLineNum = 189857806;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=189857807;
 //BA.debugLineNum = 189857807;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._rundatefilters  _maketyperundatefilters(anywheresoftware.b4a.BA _ba,String _datestart,String _dateend) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "maketyperundatefilters", false))
	 {return ((xevolution.vrcg.devdemov2400.types._rundatefilters) Debug.delegate(null, "maketyperundatefilters", new Object[] {_ba,_datestart,_dateend}));}
xevolution.vrcg.devdemov2400.types._rundatefilters _this = null;
RDebugUtils.currentLine=191889408;
 //BA.debugLineNum = 191889408;BA.debugLine="Sub MakeTypeRunDateFilters(DateStart As String, Da";
RDebugUtils.currentLine=191889409;
 //BA.debugLineNum = 191889409;BA.debugLine="Private this As RunDateFilters";
_this = new xevolution.vrcg.devdemov2400.types._rundatefilters();
RDebugUtils.currentLine=191889410;
 //BA.debugLineNum = 191889410;BA.debugLine="this.Initialize";
_this.Initialize();
RDebugUtils.currentLine=191889411;
 //BA.debugLineNum = 191889411;BA.debugLine="this.DateStart = DateStart";
_this.DateStart /*String*/  = _datestart;
RDebugUtils.currentLine=191889412;
 //BA.debugLineNum = 191889412;BA.debugLine="this.DateEnd = DateEnd";
_this.DateEnd /*String*/  = _dateend;
RDebugUtils.currentLine=191889413;
 //BA.debugLineNum = 191889413;BA.debugLine="Return this";
if (true) return _this;
RDebugUtils.currentLine=191889414;
 //BA.debugLineNum = 191889414;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._autoidentification  _newautoidentification(anywheresoftware.b4a.BA _ba,String _tag,String _objtagcode,String _plate,String _name,String _model) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "newautoidentification", false))
	 {return ((xevolution.vrcg.devdemov2400.types._autoidentification) Debug.delegate(null, "newautoidentification", new Object[] {_ba,_tag,_objtagcode,_plate,_name,_model}));}
xevolution.vrcg.devdemov2400.types._autoidentification _ret = null;
RDebugUtils.currentLine=191037440;
 //BA.debugLineNum = 191037440;BA.debugLine="Sub NewAutoIdentification(Tag As String, objTagcod";
RDebugUtils.currentLine=191037441;
 //BA.debugLineNum = 191037441;BA.debugLine="Dim ret As AutoIdentification";
_ret = new xevolution.vrcg.devdemov2400.types._autoidentification();
RDebugUtils.currentLine=191037442;
 //BA.debugLineNum = 191037442;BA.debugLine="ret.Initialize";
_ret.Initialize();
RDebugUtils.currentLine=191037443;
 //BA.debugLineNum = 191037443;BA.debugLine="ret.Tag = Tag";
_ret.Tag /*String*/  = _tag;
RDebugUtils.currentLine=191037444;
 //BA.debugLineNum = 191037444;BA.debugLine="ret.Plate = Plate";
_ret.Plate /*String*/  = _plate;
RDebugUtils.currentLine=191037445;
 //BA.debugLineNum = 191037445;BA.debugLine="ret.objTagcode = objTagcode";
_ret.objTagcode /*String*/  = _objtagcode;
RDebugUtils.currentLine=191037446;
 //BA.debugLineNum = 191037446;BA.debugLine="ret.Name = Name";
_ret.Name /*String*/  = _name;
RDebugUtils.currentLine=191037447;
 //BA.debugLineNum = 191037447;BA.debugLine="ret.Model = Model";
_ret.Model /*String*/  = _model;
RDebugUtils.currentLine=191037448;
 //BA.debugLineNum = 191037448;BA.debugLine="Return ret";
if (true) return _ret;
RDebugUtils.currentLine=191037449;
 //BA.debugLineNum = 191037449;BA.debugLine="End Sub";
return null;
}
public static xevolution.vrcg.devdemov2400.types._geodata  _setgeodata(anywheresoftware.b4a.BA _ba,String _lat,String _lon) throws Exception{
RDebugUtils.currentModule="types";
if (Debug.shouldDelegate(null, "setgeodata", false))
	 {return ((xevolution.vrcg.devdemov2400.types._geodata) Debug.delegate(null, "setgeodata", new Object[] {_ba,_lat,_lon}));}
xevolution.vrcg.devdemov2400.types._geodata _g = null;
RDebugUtils.currentLine=191430656;
 //BA.debugLineNum = 191430656;BA.debugLine="Sub setGeoData(lat As String, lon As String) As Ge";
RDebugUtils.currentLine=191430657;
 //BA.debugLineNum = 191430657;BA.debugLine="Dim g As GeoData";
_g = new xevolution.vrcg.devdemov2400.types._geodata();
RDebugUtils.currentLine=191430658;
 //BA.debugLineNum = 191430658;BA.debugLine="g.Initialize";
_g.Initialize();
RDebugUtils.currentLine=191430659;
 //BA.debugLineNum = 191430659;BA.debugLine="g.lat = lat";
_g.lat /*String*/  = _lat;
RDebugUtils.currentLine=191430660;
 //BA.debugLineNum = 191430660;BA.debugLine="g.lon = lon";
_g.lon /*String*/  = _lon;
RDebugUtils.currentLine=191430661;
 //BA.debugLineNum = 191430661;BA.debugLine="DateTime.TimeFormat = \"HH:mm:ss\"";
anywheresoftware.b4a.keywords.Common.DateTime.setTimeFormat("HH:mm:ss");
RDebugUtils.currentLine=191430662;
 //BA.debugLineNum = 191430662;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=191430663;
 //BA.debugLineNum = 191430663;BA.debugLine="g.date = $\"$date{DateTime.Now} $time{DateTime.Now";
_g.date /*String*/  = (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("date",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+" "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("time",(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"");
RDebugUtils.currentLine=191430665;
 //BA.debugLineNum = 191430665;BA.debugLine="Return g";
if (true) return _g;
RDebugUtils.currentLine=191430666;
 //BA.debugLineNum = 191430666;BA.debugLine="End Sub";
return null;
}
}