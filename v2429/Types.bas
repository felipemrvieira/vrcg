B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	Type RowPanelInfo(Pan As Panel, Height As Int)
	Type ChapterRow(ID As Int, ItemTagcode As String, RootPanel As Panel, PanelExpanded As Panel, ReadOnly As Boolean, CanExpand As Boolean, ItemsLoaded As Boolean, ReloadItems As Boolean)
	Type ReturnFieldData(item_tagcode As String, field_value As String)
	Type FileDownloadInformation(Downloaded As Boolean, DownloadFilename As String, Status As Int)
	Type CreateRequestReturn(RequestTagcode As String, Status As Int, Stage As Int)
	Type OtherReturnValues(RetValue As String, RetSave As Boolean, RetTag As String)
	Type MandatoryRecords(item_tagcode As String, mandatory As Int, bullet_master As Int, bullet_child As Int, Enabled As Boolean, value_in As Boolean)
	Type ComponentRecords(component As B4XView, idgroup As Int, item_tagcode As String, Height As Int, RepeatItemCounter As Int, RepeatFieldCounter As Int, Enabled As Boolean)
	Type B4XSRecords(component As B4XStateButton, idgroup As Int, iditem As Int, item_tagcode As String, Enabled As Boolean, answer_tagcode As String)
	Type FieldReference(tagname As String, tagobject As B4XView, FieldCounter As Int)
	Type ExternalDocsInfo(status As Int, refdoc As String, refnumber As String, typeDoc As String, externalID As String)
	Type RunTypeAction(tagcode As String, title As String)
	Type NewObjectTags(ObjectTag As String, AddressTag As String, ContactTag As String, FieldsTag As List)
	Type MNOWTU( MAKE_New_Object As Int, UPD_Existing_Object As Int, WHERE_To_Update As Int, cl_is_father As Int, _
						RequestTypeGroup As Int,  objectTagValue As String, object_type As String, objectTagRelValue As String, _
						object_type_rel As String, RealObjectRelationToChange As String, RealObjectToChange As String, _
						ResInsert As NewObjectTags)
	
	Type ShotFoto(FileName As String, DateNTime As String, Latitude As String, Longitude As String, Title As String)
	Type StatusFilterTask(active As Boolean, inactive As Boolean, singular As Boolean, plural As Boolean)
	Type TripleValues(value1 As String, value2 As String, value3 As String)
	Type MarkerInfo(Latitude As String, Longitude As String, MarkerPoint As Marker)
	Type PieValuesType(Name As String, Value As Int, Color As Int)
	Type CLAIEvent(event_tagcode As String,position As Int,type_item As Int,active As Int,value As String,formula As String,have_formula As Int,have_condition As Int, _
		have_status As Int,is_jump As Int,is_status As Int,is_alert As Int,is_email As Int,is_more As Int,is_foto As Int,is_action As Int,inc_object_contacts As Int, _
		team_tagcode As String,email_to As String,email_cc As String,use_internal_image As Int,default_typerequest As String,resobsgrp_tagcode As String, _
		add_entity_email As Int, add_object_email As Int,request_signature As Int)
		
	Type Intent(name As String)
	Type PointApi(X As Float, Y As Float)
#if B4i
	Type Activity(name As String)
#end if
	Type PageA4(A4Size As Double, A4Margins As Double, PageHeight As Double, PageHeaderHeight As Double, PageFooterHeight As Double, _
			PageFirstHeight As Double, PageLabelHeight As Double, PageLabelSpaceHeight As Double, PageLabelBoxHeight As Double, _
			PageTextMargins As Double, PageTextHeight As Double, PageImgRowHeight As Double, ImgRowHeight As Double, PageRowHeight As Double, _
			PageTextRowHeight As Double, PageHeader As String, PageFooter As String, PageContent As String, PageSignature As String, _
			PageObservations As String, PageImages As String, PageNonConformities As String, PageTemplate As String, _
			PageFirst As String, PageNext As String, PageLast As String)
			
	Type PageData(PagesOut As List, PageNumber As Int, PageTotal As Double, BuildPage As String, PointCounter As Int, LineCounter As Int, _
			CurrTotal As Double, ImageCounter As Int, Draft As String, Out As String, request_obs As String, Technical As String)
		
#if B4i
	Type ActivityParams(activ As String, activObj As Object, Posis As Int, innerObject As String, Obs As String)
#else
	Type ActivityParams(activ As Activity, activObj As Object, Posis As Int, innerObject As String, Obs As String)
#end if	
	Type TagListType(tagcode As String, tagname As String, taggroup As String)
	Type TableCounters(tablename As String, counter As Int)
	Type DownUpFile(Filename As String, FileType As String, FileDateTime As Long)
	Type FileShot(Folder As String, Filename As String)
	Type DB_ITC(ID As Int, Title As String, Color As String, TagCode As String)
	Type DeviceInformation(Description As String, Size As Int, HavePhone As Boolean)
	Type CodeNameList(TagCode As String, Name As String)
	Type ResultOptions(ValInt As Int, ValStr As String, ValTitle As String)
	Type ExtraInfo(titleinfo As String, textoInfo As String, item_tagcode As String, rc As Int, ric As Int, rfc As Int)
	
	Type CLATaskItem(task_tagcode As String,item_tagcode As String,unique_key As String,position As Int,level As Int, _
			parent_tagcode As String,item_type As Int,points As Int,risk As Int,data_type As Int, _
			bullet_master As Int,bullet_child As Int,type_answer As String,typified_answers As Int,mandatory As Int,critical As Int, _
			repeated As Int,multiple As Int,on_report As Int,has_signature As Int,has_articles As Int,type_nonconformity As String, _
			ta_tagcode As String,ta_override_result As Int,ta_jump_tagcode As String,defobj_tagcode As String,info_notes As String, _
			asw_notes As String,validate_execution As Int,cla_obs As String,force_signature As Int,force_picture As Int,force_time As Int, _
			type_time_control As Int,time_run_anyway As Int,dependent_key As String,time_duration As String,force_control As Int, _
			type_control As Int,control_run_anyway As Int,control_condition As String,do_tagcode As String,do_associate_type As Int, _
			do_object_image As String,reference As String,do_subgroup As String,do_subsubgroup As String,do_affected_table As String, _
			do_affected_tagcode As String,do_affected_field As String,change_title_totime As Int,answer_change_title As Int)
	
	Type CLA_Items(Task As String, Item As String, UniqueKey As String, Answer As String, Title As String)
	
	Type RequestCLAItem(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, _
						Tagcode As String, RepeatCounter As Int, RepeatItemCounter As Int, repeatfieldcounter As Int, _
						Title As String, Answer As String, Value As String, _
						Origin As Int, BaseImage As Int, OnReport As Int, TagObject As String, TaskInfo As CLATaskItem, _
						SelectScript As String)
						
	'Request		tagcode		Intervenção
	'Action			tagcode		Item da intervenção
	'Task			tagcode		Tarefa - CheckList/Acção
	'Item			tagcode		Capítulo/SubCapitulo/Pergunta
	'UniqueKey		tagcode		Identificação individual na CheckList/acção do Capítulo/SubCapitulo/Pergunta
	'Tagcode		tagcode		Item especifico de Resposta
	'Title			TEXT		Descritivo do Capítulo/SubCapitulo/Pergunta
	'Answer			TEXT		Resposta do Capítulo/SubCapitulo/Pergunta
	'Value			TEXT		Valor do Capítulo/SubCapitulo/Pergunta (Status/Lógico)
	'Origin			INT			Ponto de Origem
	
	Type TestRequestItem(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, _
				Value As String, Obs As String, ActionSub As String, Image As String)
	'Request		tagcode		Intervenção
	'Action			tagcode		Item da intervenção  (inner_request_tagcode)
	'Task			tagcode		Tarefa - CheckList/Acção
	'Item			tagcode		Capítulo/SubCapitulo/Pergunta
	'UniqueKey		tagcode		Identificação individual na CheckList/acção do Capítulo/SubCapitulo/Pergunta
	'Tagcode		tagcode		Item especifico de Resposta
	'Value
	'Title			TEXT		Descritivo do Capítulo/SubCapitulo/Pergunta
	'Answer			TEXT		Resposta do Capítulo/SubCapitulo/Pergunta
	'Value			TEXT		Valor do Capítulo/SubCapitulo/Pergunta (Status/Lógico)
	'Origin			INT			Ponto de Origem
	
	Type OtherCLA(Filter As String, Filter2 As String, Filter3 As String)
	
	Type RequestTaskInfo(RequestType As Int, CloseType As Int, RequestResult As Int, RequestResOptions As String, _
					InPause As Boolean, Duration As Int, Points As Float, Risk As Int, Map1 As Map, Map2 As Map, ReqIndex As Int)
	Type RequestCLA(Request As String, Action As String, Task As String, RepeatCounter As Int, TaskType As Int, Status As Intervention, Info As RequestTaskInfo, Other As OtherCLA)
	Type RequestCLAOBS(child As Boolean, cla As RequestCLA, Obs As String)
	Type RequestInfo(Request As String, RIEntity As String, RIObject As String, RITypeRequest As String, RITechnical As String, _
			RITeam As String, RIVehicle As String, RINotes As String, RIRoute As String, RIReference As String, RIDetails As String)
	
	
	Type RequestData(Tagcode As String, Entity As String, Latitude As String, Longitude As String, RequestType As Int, Favorite As Int, _
			ClientReport As Int, RequestCanAdd As Int, RequestCanDelete As Int)
#if B4A
	Type Authorization(Instance As String, Authorization As String, Version As String, SubDomain As String)
#else
	Type AuthorizationType(Instance As String, Authorization As String, Version As String, SubDomain As String)
#end if
	Type ComposedButtonDefs(PanelColor As Int, IconColor As Int, IconBKColor As Int, TextColor As Int, TextSBKColor As Int, TextEBKColor As Int, _
			BorderColor As Int, BorderWidth As Int, BorderRadius As Int)
	Type Point(X As Int, Y As Int)
	Type RRefer( Left As Int, Top As Int, Right As Int, Bottom As Int)
	Type PinPoint(fileName As String, bmrIndex As Int, ppNumber As Int)
	Type BMR(btm As B4XBitmap, rct As RRefer)
	Type GeoData(lat As String, lon As String, date As String)
	
	Type Intervention(id As Int, code As String, status As Int, color As Int)
	
	'Type RequestFilter(SDate As String, EDate As String, State As Int, CheckLst As Int, Entity As Int)
	Type RequestFilter(SDate As String, EDate As String, State As Int, Task As Int, _
			Entity As Int, Route As Int, TPRequest As Int)
	
	Type EntityFilter(TypeEntity As Int, Status As Int, Region As Int, Local As Int, Name As String, Address As String, request As Int)
	Type KPIFilter(period As Int, SDate As String, EDate As String)
	Type ObjectFilter(TypeObject As Int, ZoneObject As Int, Status As Int, Region As Int, Local As Int, Name As String, Address As String, Request As Int)
	Type TaskFilter(TypeTask As Int, Status As Int, Updated As Int, WithRequests As Int, Group As Int)
	
	Type Unavailable(StartDate As String, EndDate As String, Reason As String)
	Type Unavailable2(StartDate As String, EndDate As String, Reason As String, Cause As String)
	Type AutoIdentification(Tag As String, objTagcode As String, Plate As String, Model As String, Name As String)
	'vehicle, model, vehicleplate, tagcode
	
#if B4A
	Type Address(AddressType As Int, AddressName As String, AddressName2 As String, AddressCity As String, AddressPostalCode As String, AddressLatitude As String, AddressLongitude As String, asNew As Boolean)
#else
		Type AddressType(AddressType As Int, AddressName As String, AddressName2 As String, _
					AddressCity As String, AddressPostalCode As String, AddressLatitude As String, _
					AddressLongitude As String, asNew As Boolean)
#end if	
	
	Type GeoReference(Latitude As String, Longitude As String, asNew As Boolean)
	Type ContactRecord(contactType As Int, contactName As String, contactPhone As String, contactEmail As String, contactTitle As String, tagcode As String, asNew As Boolean)
	'$"select a.type, a.ascbus, a.tagcode, a.name, a.title, a.phone, a.email, b.title as typedesc from contacts as a left join type_contacts as b on (b.id=a.type)"$
	
	Type EntityInformation(tagcode As String, entType As Int, entName As String, entAddress As String, entAddress2 As String, entCpostal As String, _
		entCity As String, entCtnPhone As String, entCtnName As String, entLatitude As String, entLongitude As String, asNew As Boolean)
		
	Type ObjectInformation(tagcode As String, iType As Int, Name As String, Address As String, Address2 As String, Cpostal As String, _
		City As String, CtnPhone As String, CtnName As String, Latitude As String, Longitude As String, asNew As Boolean)
		
	Type ObjectType(tagcode As String, title As String, color As String, have_contracts As Int, have_warehouse As Int, _
    		have_documents As Int, isgroup As Int, doctemplate_id As Int, doctemplate As String)
			
	Type CLAStatus(Status As Int, StartDate As String, Starttime As String, Endtime As String, Duration As String, Points As Double, Risk As Int, _
			Result As Int, ResultDesc As String, HasImages As Boolean, HasActions As Boolean, HasSignatures As Boolean, _
			ReportGenerated As Boolean, CanChange As Boolean)
	Type CLAData(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, RepeatCounter As Int, _
			ReadOnly As Boolean, Composed As Boolean, StatusMaster As CLAStatus, StatusChild As CLAStatus)
	
	Type RunDateFilters(DateStart As String, DateEnd As String)
		
	Public Const ZONEOBJECTSFILTER As List = Array As String("Todos", "Intervenções do dia", "Intervenções agendadas", "Localização periférica")
	
	Public Const COLLAPSE_ICON As String = Chr(0xF106)
	Public Const EXPAND_ICON As String = Chr(0xF107)
	
	
	Type ObjectTypes(id As Int, tagcode As String, title As String)
	Type CarObject(obj As String, brand As String, model As String, plate As String, km As Long)
	Type ImageViewData(b64 As String, filename As String)
	Type WorkerNewData(up_typeoper As Int, up_tagcode As String, up_task As String, up_itemtagcode As String)
	Type SingleCLAItem(request_tc As String, task_tc As String, item_tc As String, uk As String, tc As String,rc As Int, ric As Int, rfc As Int)
	Type ReturnFromCantrolSub(TypeOfControl As Int, SubResult As Boolean)
End Sub

Sub MakeReturnFromCantrolSub(TOC As Int, SubRes As Boolean) As ReturnFromCantrolSub
	Dim res As ReturnFromCantrolSub
	res.Initialize
	res.TypeOfControl = TOC
	res.SubResult = SubRes
	Return res
End Sub

Sub MakeSingleCLAItem(request_tc As String, task_tc As String, item_tc As String, uk As String, tc As String,rc As Int, ric As Int, rfc As Int) As SingleCLAItem
	Dim res As SingleCLAItem
	res.Initialize
	res.request_tc = request_tc
	res.task_tc = task_tc
	res.item_tc = item_tc
	res.uk = uk
	res.tc = tc
	res.rc = rc
	res.ric = ric
	res.rfc = rfc
	Return res
End Sub

Sub MakeRowPanelInfo(Pan As Panel, Height As Int) As RowPanelInfo
	Dim res As RowPanelInfo
	res.initialize
	res.Pan = Pan
	res.Height = Height
	Return res
End Sub

Sub MakeChapterRow(ID As Int, ItemTagcode As String, RootPanel As Panel, PanelExpanded As Panel, ReadOnly As Boolean, CanExpand As Boolean, ItemsLoaded As Boolean, ReloadItems As Boolean) As ChapterRow
	Dim res As ChapterRow
	res.initialize
	res.ID = ID
	res.ItemTagcode = ItemTagcode
	res.RootPanel = RootPanel
	res.PanelExpanded = PanelExpanded
	res.ReadOnly = ReadOnly
	res.CanExpand = CanExpand
	res.ItemsLoaded = ItemsLoaded
	res.ReloadItems = ReloadItems
	Return res
End Sub
Sub MakeReturnFieldData(item_tagcode As String, field_value As String) As ReturnFieldData
	Dim res As ReturnFieldData
	res.initialize
	res.item_tagcode = item_tagcode
	res.field_value = field_value
	Return res
End Sub

Sub MakeFileDownloadInformation(Downloaded As Boolean, DownloadFilename As String, Status As Int) As FileDownloadInformation
	Dim res As FileDownloadInformation
	res.initialize
	res.Downloaded = Downloaded
	res.DownloadFilename = DownloadFilename
	res.Status = Status
	Return res
End Sub

Sub MakeFileDownloadInformationClear As FileDownloadInformation
	Dim res As FileDownloadInformation
	res.initialize
	res.Downloaded = False
	res.DownloadFilename = ""
	res.Status = 0
	Return res
End Sub

Sub MakeCreateRequestReturn(RequestTagcode As String, Status As Int, Stage As Int) As CreateRequestReturn
	Dim res As CreateRequestReturn
	res.initialize
	res.RequestTagcode = RequestTagcode
	res.Status = Status
	res.Stage = Stage
	Return res
End Sub

Sub MakeCreateRequestReturnClear As CreateRequestReturn
	Dim res As CreateRequestReturn
	res.initialize
	res.RequestTagcode = ""
	res.Status = 0
	res.Stage = 0
	Return res
End Sub

Sub MakeOtherReturnValues(RetValue As String, RetSave As Boolean, RetTag As String) As OtherReturnValues
	Dim res As OtherReturnValues
	res.initialize
	res.RetValue = RetValue
	res.RetSave = RetSave
	res.RetTag = RetTag
	Return res
End Sub

Sub MakeMNOWTU( MAKE_New_Object As Int, UPD_Existing_Object As Int, WHERE_To_Update As Int, cl_is_father As Int, _
						RequestTypeGroup As Int,  objectTagValue As String, object_type As String, objectTagRelValue As String, _
						object_type_rel As String, RealObjectRelationToChange As String, RealObjectToChange As String, _
						ResInsert As NewObjectTags) As MNOWTU
	Dim ret As MNOWTU
	ret.Initialize
	ret.MAKE_New_Object = MAKE_New_Object
	ret.UPD_Existing_Object = UPD_Existing_Object
	ret.WHERE_To_Update = WHERE_To_Update
	ret.cl_is_father = cl_is_father
	ret.RequestTypeGroup = RequestTypeGroup
	ret.objectTagValue = objectTagValue
	ret.object_type = object_type
	ret.objectTagRelValue = objectTagRelValue
	ret.object_type_rel = object_type_rel
	ret.RealObjectRelationToChange = RealObjectRelationToChange
	ret.RealObjectToChange = RealObjectToChange
	ret.ResInsert = ResInsert
	Return ret
End Sub

Sub MakeB4XSRecords(component As B4XStateButton, idgroup As Int, iditem As Int, item_tagcode As String, Enabled As Boolean, answer_tagcode As String) As B4XSRecords
	Dim ret As B4XSRecords
	ret.Initialize
	ret.component = component
	ret.idgroup = idgroup
	ret.iditem = iditem
	ret.item_tagcode = item_tagcode
	ret.Enabled = Enabled
	ret.answer_tagcode = answer_tagcode
	Return ret
End Sub

Sub MakeComponentRecords(component As B4XView, idgroup As Int,item_tagcode As String, Height As Int, RepeatItemCounter As Int,RepeatFieldCounter As Int ,Enabled As Boolean) As ComponentRecords
	Dim ret As ComponentRecords
	ret.Initialize
	ret.component = component
	ret.idgroup = idgroup
	ret.item_tagcode = item_tagcode
	ret.Height = Height
	ret.RepeatItemCounter = RepeatItemCounter
	ret.RepeatFieldCounter = RepeatFieldCounter
	ret.Enabled = Enabled
	Return ret
End Sub

Sub MakeMandatoryRecords(item_tagcode As String, mandatory As Int, bullet_master As Int, bullet_child As Int, Enabled As Boolean, value_in As Boolean) As MandatoryRecords
	Dim ret As MandatoryRecords
	ret.Initialize
	ret.item_tagcode = item_tagcode
	ret.mandatory = mandatory
	ret.bullet_master = bullet_master
	ret.bullet_child = bullet_child
	ret.Enabled = Enabled
	ret.value_in = value_in
	Return ret
End Sub

Sub MakeFieldReference(tagname As String, tagobject As B4XView, FieldCounter As Int) As FieldReference
	Dim ret As FieldReference
	ret.Initialize
	ret.tagname = tagname
	ret.tagobject = tagobject
	ret.FieldCounter = FieldCounter
	Return ret
End Sub

Sub MakeExternalDocsInfo(status As Int, refdoc As String, refnumber As String, typeDoc As String, externalID As String) As ExternalDocsInfo
	Dim ret As ExternalDocsInfo
	ret.Initialize
	ret.status = status
	ret.refdoc = refdoc
	ret.refnumber = refnumber
	ret.typeDoc = typeDoc
	ret.externalID = externalID
	Return ret
End Sub

Sub MakeNewObjectTags(ObjectTag As String, AddressTag As String, ContactTag As String, FieldsTag As List) As NewObjectTags
	Dim ret As NewObjectTags
	ret.Initialize
	ret.ObjectTag = ObjectTag
	ret.AddressTag = AddressTag
	ret.ContactTag = ContactTag
	If Not(FieldsTag.IsInitialized) Then
		FieldsTag.Initialize
	End If
	ret.FieldsTag = FieldsTag
	Return ret
End Sub

Sub MakeNewObjectTagsClear As NewObjectTags
	Dim ret As NewObjectTags
	ret.Initialize
	ret.ObjectTag = ""
	ret.AddressTag = ""
	ret.ContactTag = ""
	ret.FieldsTag.Initialize
	Return ret
End Sub

Sub MAkeMarkerInfo(Latitude As String, Longitude As String, MarkerPoint As Marker) As MarkerInfo
	Dim ret As MarkerInfo
	ret.Initialize
	ret.Latitude = Latitude
	ret.Longitude = Longitude
	ret.MarkerPoint = MarkerPoint
	Return ret
End Sub

Sub FindMarkerInfoIndex(ml As List, sLat As String, sLong As String) As Int
	Dim ret As Int = -1
	For n = 0 To ml.Size-1
		Dim mi As MarkerInfo = ml.Get(n)
		If (mi.Latitude=sLat) And (mi.Longitude=sLong) Then
			ret = n
			Exit
		End If
	Next
	Return ret
End Sub

'Type PieValuesType(Name As String, Value As Int, Color As Int)
Sub MakePieValuesType(Name As String, Value As Int, Color As Int) As PieValuesType
	Dim ret As PieValuesType
	ret.Initialize
	ret.Name = Name
	ret.Value = Value
	ret.Color = Color
	Return ret
End Sub

Sub MakeShotFoto(FileName As String, DateNTime As String, Latitude As String, Longitude As String, Title As String) As ShotFoto
	Dim ret As ShotFoto
	ret.Initialize
	ret.FileName = FileName
	ret.DateNTime = DateNTime
	ret.Latitude = Latitude
	ret.Longitude = Longitude
	ret.Title = Title
	Return ret
End Sub

Sub MakeRequestInfo(Request As String, RIEntity As String, RIObject As String, RITypeRequest As String, RITechnical As String, _
			RITeam As String, RIVehicle As String, RINotes As String, RIRoute As String, RIReference As String, RIDetails As String) As RequestInfo
	Dim ret As RequestInfo
	ret.Initialize
	ret.Request = Request
	ret.RIEntity = RIEntity
	ret.RIObject = RIObject
	ret.RITypeRequest = RITypeRequest
	ret.RITechnical = RITechnical
	ret.RITeam = RITeam
	ret.RIVehicle = RIVehicle
	ret.RINotes = RINotes
	ret.RITeam = RIRoute
	ret.RIVehicle = RIReference
	ret.RINotes = RIDetails
	Return ret
End Sub


Sub MakeRequestInfoClear As RequestInfo
	Dim ret As RequestInfo
	ret.Initialize
	ret.Request = ""
	ret.RIEntity = ""
	ret.RIObject = ""
	ret.RITypeRequest = ""
	ret.RITechnical = ""
	ret.RITeam = ""
	ret.RIVehicle = ""
	ret.RINotes = ""
	ret.RITeam = ""
	ret.RIVehicle = ""
	ret.RINotes = ""
	Return ret
End Sub

Sub MakeStatusFilterTask(active As Boolean, inactive As Boolean, singular As Boolean, plural As Boolean) As StatusFilterTask
	Dim ret As StatusFilterTask
	ret.Initialize
	ret.active = active
	ret.inactive = inactive
	ret.singular = singular
	ret.plural = plural
	Return ret
End Sub

Sub MakeCLATaskItem(task_tagcode As String,item_tagcode As String,unique_key As String,position As Int,level As Int, _
			parent_tagcode As String,item_type As Int,points As Int,risk As Int,data_type As Int, _
			bullet_master As Int,bullet_child As Int,type_answer As String,typified_answers As Int,mandatory As Int,critical As Int, _
			repeated As Int,multiple As Int,on_report As Int,has_signature As Int,has_articles As Int,type_nonconformity As String, _
			ta_tagcode As String,ta_override_result As Int,ta_jump_tagcode As String,defobj_tagcode As String,info_notes As String, _
			asw_notes As String,validate_execution As Int,cla_obs As String,force_signature As Int,force_picture As Int,force_time As Int, _
			type_time_control As Int,time_run_anyway As Int,dependent_key As String,time_duration As String,force_control As Int, _
			type_control As Int,control_run_anyway As Int,control_condition As String,do_tagcode As String,do_associate_type As Int, _
			do_object_image As String,reference As String,do_subgroup As String,do_subsubgroup As String,do_affected_table As String, _
			do_affected_tagcode As String,do_affected_field As String,change_title_totime As Int,answer_change_title As Int) As CLATaskItem
	Dim ret As CLATaskItem
	ret.Initialize
	ret.task_tagcode = task_tagcode
	ret.item_tagcode = item_tagcode
	ret.unique_key = unique_key
	ret.position = position
	ret.level = level
	ret.parent_tagcode = parent_tagcode
	ret.item_type = item_type
	ret.points = points
	ret.risk = risk
	ret.data_type = data_type
	ret.bullet_master = bullet_master
	ret.bullet_child = bullet_child
	ret.type_answer = type_answer
	ret.typified_answers = typified_answers
	ret.mandatory = mandatory
	ret.critical = critical
	ret.repeated = repeated
	ret.multiple = multiple
	ret.on_report = on_report
	ret.has_signature = has_signature
	ret.has_articles = has_articles
	ret.type_nonconformity = type_nonconformity
	ret.ta_tagcode = ta_tagcode
	ret.ta_override_result = ta_override_result
	ret.ta_jump_tagcode = ta_jump_tagcode
	ret.defobj_tagcode = defobj_tagcode
	ret.info_notes = info_notes
	ret.asw_notes = asw_notes
	ret.validate_execution = validate_execution
	ret.cla_obs = cla_obs
	ret.force_signature = force_signature
	ret.force_picture = force_picture
	ret.force_time = force_time
	ret.type_time_control = type_time_control
	ret.time_run_anyway = time_run_anyway
	ret.dependent_key = dependent_key
	ret.time_duration = time_duration
	ret.force_control = force_control
	ret.type_control = type_control
	ret.control_run_anyway = control_run_anyway
	ret.control_condition = control_condition
	ret.do_tagcode = do_tagcode
	ret.do_associate_type = do_associate_type
	ret.do_object_image = do_object_image
	ret.reference = reference
	ret.do_subgroup = do_subgroup
	ret.do_subsubgroup = do_subsubgroup
	ret.do_affected_table = do_affected_table
	ret.do_affected_tagcode = do_affected_tagcode
	ret.do_affected_field = do_affected_field
	ret.change_title_totime = change_title_totime
	ret.answer_change_title = answer_change_title
	Return ret
End Sub

Sub MakeCLATaskItemClear As CLATaskItem
	Dim ret As CLATaskItem
	ret.Initialize
	Return ret
End Sub


Sub MakeTripleValues(value1 As String, value2 As String, value3 As String) As TripleValues
	Dim ret As TripleValues
	ret.Initialize
	ret.value1 = value1
	ret.value2 = value2
	ret.value3 = value3
	Return ret
End Sub


Sub MakeCLAIEvent(event_tagcode As String, position As Int,type_item As Int,active As Int,value As String,formula As String,have_formula As Int,have_condition As Int, _
		have_status As Int,is_jump As Int,is_status As Int,is_alert As Int,is_email As Int,is_more As Int,is_foto As Int,is_action As Int,inc_object_contacts As Int, _
		team_tagcode As String,email_to As String,email_cc As String,use_internal_image As Int,default_typerequest As String,resobsgrp_tagcode As String, _
		add_entity_email As Int, add_object_email As Int,request_signature As Int) As CLAIEvent
	Dim ret As CLAIEvent
	ret.Initialize
	
	ret.event_tagcode = event_tagcode
	ret.position = position
	ret.type_item = type_item
	ret.active = active
	ret.value = value
	ret.formula = formula
	ret.have_formula = have_formula
	ret.have_condition = have_condition
	ret.have_status = have_status
	ret.is_jump = is_jump
	ret.is_status = is_status
	ret.is_alert = is_alert
	ret.is_email = is_email
	ret.is_more = is_more
	ret.is_foto = is_foto
	ret.is_action = is_action
	ret.inc_object_contacts = inc_object_contacts
	ret.team_tagcode = team_tagcode
	ret.email_to = email_to
	ret.email_cc = email_cc
	ret.use_internal_image = use_internal_image
	ret.default_typerequest = default_typerequest
	ret.resobsgrp_tagcode = resobsgrp_tagcode
	ret.add_entity_email = add_entity_email
	ret.add_object_email = add_object_email
	ret.request_signature = request_signature
	Return ret
End Sub


Sub MakePageA4(A4Size As Double, A4Margins As Double, PageHeight As Double, PageHeaderHeight As Double, PageFooterHeight As Double, _
			PageFirstHeight As Double, PageLabelHeight As Double, PageLabelSpaceHeight As Double, PageLabelBoxHeight As Double, _
			PageTextMargins As Double, PageTextHeight As Double, PageImgRowHeight As Double, ImgRowHeight As Double, PageRowHeight As Double, _
			PageTextRowHeight As Double, PageHeader As String, PageFooter As String, PageContent As String, PageSignature As String, _
			PageObservations As String, PageImages As String, PageNonConformities As String, PageTemplate As String, _
			PageFirst As String, PageNext As String, PageLast As String) As PageA4
	Dim ret As PageA4
	ret.Initialize
	ret.A4Size = A4Size
	ret.A4Margins = A4Margins
	ret.PageHeight = PageHeight
	ret.PageHeaderHeight = PageHeaderHeight
	ret.PageFooterHeight = PageFooterHeight
	ret.PageFirstHeight = PageFirstHeight
	ret.PageLabelHeight = PageLabelHeight
	ret.PageLabelSpaceHeight = PageLabelSpaceHeight
	ret.PageLabelBoxHeight = PageLabelBoxHeight
	ret.PageTextMargins = PageTextMargins
	ret.PageTextHeight = PageTextHeight
	ret.PageImgRowHeight = PageImgRowHeight
	ret.ImgRowHeight = ImgRowHeight
	ret.PageRowHeight = PageRowHeight
	ret.PageTextRowHeight = PageTextRowHeight
	ret.PageHeader = PageHeader
	ret.PageFooter = PageFooter
	ret.PageContent = PageContent
	ret.PageSignature = PageSignature
	ret.PageObservations = PageObservations
	ret.PageImages = PageImages
	ret.PageNonConformities = PageNonConformities
	ret.PageTemplate = PageTemplate
	ret.PageFirst = PageFirst
	ret.PageNext = PageNext
	ret.PageLast = PageLast
	Return ret
End Sub

Sub MakePageData(PagesOut As List, PageNumber As Int, PageTotal As Double, BuildPage As String, PointCounter As Int, LineCounter As Int, _
			CurrTotal As Double, ImageCounter As Int, Draft As String, Out As String, request_obs As String, Technical As String) As PageData
	Dim ret As PageData
	ret.Initialize
	ret.PagesOut = PagesOut
	ret.PageNumber = PageNumber
	ret.PageTotal = PageTotal
	ret.BuildPage = BuildPage
	ret.PointCounter = PointCounter
	ret.LineCounter = LineCounter
	ret.CurrTotal = CurrTotal
	ret.ImageCounter = ImageCounter
	ret.Draft = Draft
	ret.Out = Out
	ret.request_obs = request_obs
	ret.Technical = Technical
	Return ret
End Sub

#if B4i
	Sub MakeActivityParams(activ As String, activObj As String, Posis As Int, innerObject As String, Obs As String) As ActivityParameters
	Dim ret As ActivityParams
#else
	Sub MakeActivityParams(activ As Activity, activObj As Object, Posis As Int, innerObject As String, Obs As String) As ActivityParams
	Dim ret As ActivityParams
#end if	
	ret.Initialize
	ret.activ = activ
	ret.activObj = activObj
	ret.Posis = Posis
	ret.innerObject = innerObject
	ret.Obs = Obs
	Return ret
End Sub

Sub MakeTagListType(tagcode As String, tagname As String, taggroup As String) As TagListType
	Dim ret As TagListType
	ret.Initialize
	ret.tagcode = tagcode
	ret.tagname = tagname
	ret.taggroup = taggroup
	Return ret
	
End Sub

Sub MakeTableCounters(tablename As String, counter As Int) As TableCounters
	Dim ret As TableCounters
	ret.Initialize
	ret.tablename = tablename
	ret.counter = counter
	Return ret
End Sub

Sub MakeDownUpFile(Filename As String, FileType As String, FileDateTime As Long)  As DownUpFile
	Dim ret As DownUpFile
	ret.Initialize
	ret.Filename = Filename
	ret.FileType = FileType
	ret.FileDateTime = FileDateTime
	Return ret
End Sub

Sub MakeImageViewData(b64 As String, filename As String) As ImageViewData
	Dim ret As ImageViewData
	ret.Initialize
	ret.b64 = b64
	ret.filename = filename
	Return ret
End Sub

Sub MakeImageViewDataClear As ImageViewData
	Dim ret As ImageViewData
	ret.Initialize
	ret.b64 = ""
	ret.filename = ""
	Return ret
End Sub

Sub ClearedCarObject As CarObject
	Dim obt As CarObject
	obt.Initialize
	obt.obj = ""
	obt.brand = ""
	obt.model = ""
	obt.plate = ""
	obt.km = 0
	Return obt
End Sub

Sub MakeCarObject(obj As String, brand As String, model As String, plate As String, km As Long) As CarObject
	Dim obt As CarObject
	obt.Initialize
	obt.obj = obj
	obt.brand = brand
	obt.model = model
	obt.plate = plate
	obt.km = km
	Return obt
End Sub

Sub MakeObjectTypes(id As Int, tagcode As String, title As String) As ObjectTypes
	Dim obt As ObjectTypes
	obt.Initialize
	obt.id = id
	obt.tagcode = tagcode
	obt.title = title
	Return obt
End Sub

Sub ObjectTypesInList(otList As List, title As String) As ObjectTypes
	Dim ret As ObjectTypes = MakeObjectTypes(0, "", "(Todos)")
	For n = 0 To otList.Size-1
		Dim this As ObjectTypes = otList.Get(n)
		If this.title = title Then
			ret = this
			Exit
		End If
	Next
	Return ret
End Sub


Sub MakeFileShot(Folder As String, Filename As String) As FileShot
	Dim ret As FileShot
	ret.Initialize
	ret.Folder = Folder
	ret.Filename = Filename
	Return ret
End Sub

Sub MakeResultOptions(ValInt As Int, ValStr As String, ValTitle As String) As ResultOptions
	Dim ret As ResultOptions
	ret.Initialize
	ret.ValInt = ValInt
	ret.ValStr = ValStr
	ret.ValTitle = ValTitle
	Return ret
End Sub

'Sub MakeDB_ITC(ID As Int, TagCode As String ,Title As String, Color As String) As DB_ITC
'	Dim ret As DB_ITC
'	ret.Initialize
'	ret.ID = ID
'	ret.Title = Title
'	ret.Color = Color
'	ret.TagCode = TagCode
'	Return ret
'End Sub

Sub MakeDB_ITC(ID As Int, Tagcode As String, Title As String, Color As String) As DB_ITC
	Dim ret As DB_ITC
	ret.Initialize
	ret.ID = ID
	ret.TagCode = Tagcode
	ret.Title = Title
	ret.Color = Color
	Return ret
End Sub

Sub MakeDeviceInformation(Description As String, Size As Int, HavePhone As Boolean) As DeviceInformation
	Dim ret As DeviceInformation
	ret.Initialize
	ret.Description = Description
	ret.Size = Size
	ret.HavePhone = HavePhone
	Return ret
End Sub


Sub MakeCodeNameList(TagCode As String, Name As String) As CodeNameList
	Dim ret As CodeNameList
	ret.Initialize
	ret.Tagcode = TagCode
	ret.Name = Name
	Return ret
End Sub


'Sub MakeRequestData(Tagcode As String, Entity As String, Latitude As String, Longitude As String, RequestType As Int, Favorite As Int) As RequestData
'	Dim ret As RequestData
'	ret.Initialize
'	ret.Tagcode = Tagcode
'	ret.Entity = Entity
'	ret.Latitude = Latitude
'	ret.Longitude = Longitude
'	ret.RequestType = RequestType
'	ret.Favorite = Favorite
'	Return ret
'End Sub

Sub MakeRequestData(Tagcode As String, Entity As String, Latitude As String, Longitude As String, RequestType As Int, Favorite As Int, _
	ClientReport As Int, RequestCanAdd As Int, RequestCanDelete As Int) As RequestData
	Dim ret As RequestData
	ret.Initialize
	ret.Tagcode = Tagcode
	ret.Entity = Entity
	ret.Latitude = Latitude
	ret.Longitude = Longitude
	ret.RequestType = RequestType
	ret.Favorite = Favorite
	ret.ClientReport = ClientReport
	ret.RequestCanAdd = RequestCanAdd
	ret.RequestCanDelete = RequestCanDelete
	Return ret
End Sub

Sub MakeCLA_Items(Task As String, Item As String, UniqueKey As String, Answer As String, Title As String) As CLA_Items
	Dim ret As CLA_Items
	ret.Initialize
	ret.Task = Task
	ret.Item = Item
	ret.UniqueKey = UniqueKey
	ret.Answer = Answer
	ret.Title = Title
	Return ret
End Sub

Sub MakeTestRequestItem(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, _
				Value As String, Obs As String, ActionSub As String, Image As String) As TestRequestItem
	Dim ret As TestRequestItem
	ret.Initialize
	ret.Request = Request
	ret.Action = Action
	ret.Task = Task
	ret.Item = Item
	ret.UniqueKey = UniqueKey
	ret.Tagcode = Tagcode
	ret.Value = Value
	ret.Obs = Obs
	ret.ActionSub = ActionSub
	ret.Image = Image
	Return ret
End Sub

Sub MakeRequestTaskInfo(RequestType As Int, CloseType As Int, RequestResult As Int, RequestResOptions As String, _
		InPause As Boolean, Duration As Int, Points As Float, Risk As Int, Map1 As Map, Map2 As Map, ReqIndex As Int) As RequestTaskInfo
	Dim ret As RequestTaskInfo
	ret.Initialize
	ret.RequestType = RequestType
	ret.CloseType = CloseType
	ret.RequestResult = RequestResult
	ret.RequestResOptions = RequestResOptions
	ret.InPause = InPause
	ret.Duration = Duration
	ret.Points = Points
	ret.Risk = Risk
	If Map1.IsInitialized Then
		ret.Map1 = Map1
	Else
		ret.Map1.Initialize
	End If
	
	If Map2.IsInitialized Then
		ret.Map2 = Map2
	Else
		ret.Map2.Initialize
	End If
	ret.ReqIndex = ReqIndex
	Return ret
End Sub

Sub MakeRequestTaskInfoClear As RequestTaskInfo
	Dim ret As RequestTaskInfo
	ret.Initialize
	Return ret
End Sub
	
Sub MakeRequestCLAItem(Request As String, Action As String, Task As String, Item As String, _
	UniqueKey As String, Tagcode As String, RepeatCounter As Int, RepeatItemCounter As Int, repeatfieldcounter As Int, _
	Title As String, Answer As String, Value As String, _
	Origin As Int, BaseImage As Int, OnReport As Int, TagObject As String, TaskInfo As CLATaskItem, SelectScript As String) As RequestCLAItem
	Dim ret As RequestCLAItem
	ret.Initialize
	ret.Request = Request
	ret.Action = Action
	ret.Task = Task
	ret.Item = Item
	ret.UniqueKey = UniqueKey
	ret.Tagcode = Tagcode
	ret.RepeatCounter = RepeatCounter
	ret.RepeatItemCounter = RepeatItemCounter
	ret.repeatfieldcounter = repeatfieldcounter
	ret.Title = Title
	ret.Answer = Answer
	ret.Value = Value
	ret.Origin = Origin
	ret.BaseImage = BaseImage
	ret.OnReport = OnReport
	ret.TagObject = TagObject
	ret.TaskInfo = TaskInfo
	ret.SelectScript = SelectScript
	Return ret
End Sub

Sub MakeRequestCLA(Request As String, Action As String, Task As String, RepeatCounter As Int, TaskType As Int, _
	Status As Intervention, Info As RequestTaskInfo, Other As OtherCLA) As RequestCLA
	Dim ret As RequestCLA
	ret.Initialize
	ret.Request = Request
	ret.Action = Action
	ret.Task = Task
	ret.RepeatCounter = RepeatCounter
	ret.TaskType = TaskType
	ret.Status = Status
	ret.Info = Info
	ret.Other = Other
	Return ret
End Sub

Sub MakeOtherCLA(Filter As String, Filter2 As String, Filter3 As String) As OtherCLA
	Dim ret As OtherCLA
	ret.Initialize
	ret.Filter = Filter
	ret.Filter2 = Filter2
	ret.Filter3 = Filter3
	Return ret
End Sub


Sub MakeRequestCLAOBS(child As Boolean, cla As RequestCLA, Obs As String) As RequestCLAOBS
	Dim ret As RequestCLAOBS
	ret.Initialize
	ret.child = child
	ret.cla = cla
	ret.Obs = Obs
	Return ret
End Sub

Sub MakeTaskFilter(TypeTask As Int, Status As Int, Updated As Int, WithRequests As Int, Group As Int) As TaskFilter
	Dim ret As TaskFilter
	ret.Initialize
	ret.TypeTask = TypeTask
	ret.Status = Status
	ret.Updated = Updated
	ret.WithRequests = WithRequests
	ret.Group = Group
	Return ret
End Sub

Sub MakeObjectType(tagcode As String, title As String, color As String, have_contracts As Int, have_warehouse As Int, _
    		have_documents As Int, isgroup As Int, doctemplate_id As Int, doctemplate As String) As ObjectType
	Dim ret As ObjectType
	ret.Initialize
	ret.tagcode = tagcode
	ret.title = title
	ret.color = color
	ret.have_contracts = have_contracts
	ret.have_warehouse = have_warehouse
	ret.have_documents = have_documents
	ret.isgroup = isgroup
	ret.doctemplate_id = doctemplate_id
	ret.doctemplate = doctemplate
	Return ret
End Sub

Sub MakeComposedButtonDefs(PanelColor As Int, IconColor As Int, IconBKColor As Int, TextColor As Int, TextSBKColor As Int, TextEBKColor As Int, _
			BorderColor As Int, BorderWidth As Int, BorderRadius As Int) As ComposedButtonDefs
	Dim ret As ComposedButtonDefs
	ret.Initialize
	ret.PanelColor = PanelColor
	ret.IconColor = IconColor
	ret.IconBKColor = IconBKColor
	ret.TextColor = TextColor
	ret.TextSBKColor = TextSBKColor
	ret.TextEBKColor = TextEBKColor
	ret.BorderColor = BorderColor
	ret.BorderWidth = BorderWidth
	ret.BorderRadius = BorderRadius
	Return ret
End Sub

#if B4A
Sub MakeAuthorization(Instance As String, Authorization As String, Version As String, SubDomain As String) As Authorization
	Dim ret As Authorization
#else
Sub MakeAuthorizationType(Instance As String, Authorization As String, Version As String, SubDomain As String) As AuthorizationType
	Dim ret As AuthorizationType
#end if
	ret.Initialize
	ret.Instance = Instance
	ret.Authorization = Authorization
	ret.Version = Version
	ret.SubDomain = SubDomain
	Return ret
End Sub

Sub MakeObjectInformation(tagcode As String, iType As Int, Name As String, Address As String, Address2 As String, Cpostal As String, _
		City As String, CtnPhone As String, CtnName As String, Latitude As String, Longitude As String, asNew As Boolean) As ObjectInformation
	Dim ret As ObjectInformation
	ret.Initialize
	ret.tagcode = tagcode
	ret.iType = iType
	ret.Name = Name
	ret.Address = Address
	ret.Address2 = Address2
	ret.Cpostal = Cpostal
	ret.City = City
	ret.CtnPhone = CtnPhone
	ret.CtnName = CtnName
	ret.Latitude = Latitude
	ret.Longitude = Longitude
	ret.asNew = asNew
	Return ret
End Sub

Sub MakeEntityInformation(tagcode As String, entType As Int, entName As String, entAddress As String, entAddress2 As String, entCpostal As String, _
	entCity As String, entCtnPhone As String, entCtnName As String, entLatitude As String, entLongitude As String, asNew As Boolean) As EntityInformation
	Dim ret As EntityInformation
	ret.Initialize
	ret.tagcode = tagcode
	ret.entType = entType
	ret.entName = entName
	ret.entAddress = entAddress
	ret.entAddress2 = entAddress2
	ret.entCpostal = entCpostal
	ret.entCity = entCity
	ret.entCtnPhone = entCtnPhone
	ret.entCtnName = entCtnName
	ret.entLatitude = entLatitude
	ret.entLongitude = entLongitude
	ret.asNew = asNew
	Return ret
End Sub

Sub MakeContact(contactType As Int, contactName As String, contactPhone As String, contactEmail As String, contactTitle As String, tagcode As String, asNew As Boolean) As ContactRecord
	Dim ret As ContactRecord
	ret.Initialize
	ret.contactType = contactType
	ret.contactName = contactName
	ret.contactPhone = contactPhone
	ret.contactEmail = contactEmail
	ret.contactTitle = contactTitle
	ret.tagcode = tagcode
	ret.asNew = asNew
	Return ret
End Sub

#if b4a
Sub MakeAddress(AddressType As Int, AddressName As String, AddressName2 As String, AddressCity As String, AddressPostalCode As String, AddressLatitude As String, AddressLongitude As String, asNew As Boolean) As Address
	Dim ret As Address
	ret.Initialize
	ret.AddressType = AddressType
	ret.AddressName = AddressName
	ret.AddressName2 = AddressName2
	ret.AddressCity = AddressCity
	ret.AddressPostalCode = AddressPostalCode
	ret.AddressLatitude = AddressLatitude
	ret.AddressLongitude = AddressLongitude
	ret.asNew = asNew
	Return ret
End Sub
#else
Sub MakeAddress(iAddressType As Int, iAddressName As String, iAddressName2 As String, _
			iAddressCity As String, iAddressPostalCode As String, iAddressLatitude As String, _
			iAddressLongitude As String, asNew As Boolean) As AddressType
	Dim ret As AddressType
	ret.Initialize
	ret.AddressType = iAddressType
	ret.AddressName = iAddressName
	ret.AddressName2 = iAddressName2
	ret.AddressCity = iAddressCity
	ret.AddressPostalCode = iAddressPostalCode
	ret.AddressLatitude = iAddressLatitude
	ret.AddressLongitude = iAddressLongitude
	ret.asNew = asNew
	Return ret
End Sub
#end if

Sub MakeGeoReference(Latitude As String, Longitude As String, asNew As Boolean) As GeoReference
	Dim ret As GeoReference
	ret.Initialize
	ret.Latitude = Latitude
	ret.Longitude = Longitude
	ret.asNew = asNew
	Return ret
End Sub

Sub MakeEntityFilter(TypeEntity As Int, Status As Int, Region As Int, Local As Int, Name As String, Address As String, request As Int) As EntityFilter
	Dim ret As EntityFilter
	ret.Initialize
	ret.TypeEntity = TypeEntity
	ret.Status = Status
	ret.Name = Name
	ret.Region = Region
	ret.Local = Local
	ret.Name = Name
	ret.Address = Address
	ret.Request = request
	Return ret
End Sub

Sub MakeObjectFilter(TypeObject As Int, ZoneObject As Int, Status As Int, Region As Int, Local As Int, Name As String, Address As String, request As Int) As ObjectFilter
	Dim ret As ObjectFilter
	ret.Initialize
	ret.TypeObject = TypeObject
	ret.ZoneObject = ZoneObject
	ret.Status = Status
	ret.Name = Name
	ret.Region = Region
	ret.Local = Local
	ret.Name = Name
	ret.Address = Address
	ret.Request = request
	Return ret
End Sub

Sub NewAutoIdentification(Tag As String, objTagcode As String, Plate As String, Name As String, Model As String) As AutoIdentification
	Dim ret As AutoIdentification
	ret.Initialize
	ret.Tag = Tag
	ret.Plate = Plate
	ret.objTagcode = objTagcode
	ret.Name = Name
	ret.Model = Model
	Return ret
End Sub

Sub MakeUnavailable(startDate As String, endDate As String, reason As String) As Unavailable
	Dim ret As Unavailable
	ret.Initialize
	ret.StartDate = startDate
	ret.EndDate = endDate
	ret.Reason = reason
	Return ret
End Sub

Sub MakeUnavailable2(startDate As String, endDate As String, reason As String, cause As String) As Unavailable2
	Dim ret As Unavailable2
	ret.Initialize
	ret.StartDate = startDate
	ret.EndDate = endDate
	ret.Reason = reason
	ret.cause = cause
	Return ret
End Sub

Sub MakeKPIFilter(period As Int, SDate As String, EDate As String) As KPIFilter
	Dim ret As KPIFilter
	ret.Initialize
	ret.SDate = SDate
	ret.EDate = EDate
	ret.period = period
	Return ret
End Sub

Sub MakeRequestFilter(SDate As String, EDate As String, State As Int, Task As Int, _
		Entity As Int, Route As Int, TPRequest As Int) As RequestFilter
	Dim ret As RequestFilter
	ret.Initialize
	ret.SDate = SDate
	ret.EDate = EDate
	ret.State = State
	ret.Task = Task
	ret.Entity = Entity
	ret.Route = Route
	ret.TPRequest = TPRequest
	Return ret
End Sub

Sub MakeInterv(id As Int, code As String, status As Int, color As Int) As Intervention
	Dim ret As Intervention
	ret.Initialize
	ret.id = id
	ret.code = code
	ret.color = color
	ret.status = status
	Return ret
End Sub

Sub setGeoData(lat As String, lon As String) As GeoData
	Dim g As GeoData
	g.Initialize
	g.lat = lat
	g.lon = lon
	DateTime.TimeFormat = "HH:mm:ss"
	DateTime.DateFormat = "yyyy-MM-dd"
	g.date = $"$date{DateTime.Now} $time{DateTime.Now}"$
	
	Return g
End Sub

Sub setGeoDataDT(lat As String, lon As String, date As String) As GeoData
	Dim g As GeoData
	g.Initialize
	g.lat = lat
	g.lon = lon
	g.date = date
	Return g
End Sub

Sub getGeoData(g  As GeoData, lat As String, lon As String, date As String)
	lat = g.lat
	lon = g.lon
	date = g.date
End Sub

Sub MakeCLAStatus(Status As Int, StartDate As String, Starttime As String, Endtime As String, Duration As String, Points As Double, Risk As Int, _
			Result As Int, ResultDesc As String, HasImages As Boolean, HasActions As Boolean, HasSignatures As Boolean, _
			ReportGenerated As Boolean, CanChange As Boolean) As CLAStatus
	Private this As CLAStatus
	this.Initialize
	this.Status = Status
	this.StartDate = StartDate
	this.Starttime = Starttime
	this.Endtime = Endtime
	this.Duration = Duration
	this.Points = Points
	this.Risk = Risk
	this.Result = Result
	this.ResultDesc = ResultDesc
	this.HasImages = HasImages
	this.HasActions = HasActions
	this.HasSignatures = HasSignatures
	this.ReportGenerated = ReportGenerated
	this.CanChange = CanChange
	Return this
End Sub

Sub ClearCLAStatus() As CLAStatus
	Private this As CLAStatus
	this.Initialize
	this.Status = 0
	this.StartDate = ""
	this.Starttime = ""
	this.Endtime = ""
	this.Duration = ""
	this.Points = 0
	this.Risk = 0
	this.Result = 0
	this.ResultDesc = ""
	this.HasImages = False
	this.HasActions = False
	this.HasSignatures = False
	this.ReportGenerated = False
	this.CanChange = False
	Return this
End Sub

Sub MakeCLAData(Request As String, Action As String, Task As String, Item As String, UniqueKey As String, Tagcode As String, RepeatCounter As Int, _
		ReadOnly As Boolean, Composed As Boolean, StatusMaster As CLAStatus, StatusChild As CLAStatus) As CLAData
	Private this As CLAData
	this.Initialize
	this.Request = Request
	this.Action = Action
	this.Task = Task
	this.Item = Item
	this.UniqueKey = UniqueKey
	this.Tagcode = Tagcode
	this.RepeatCounter = RepeatCounter
	this.ReadOnly = ReadOnly
	this.Composed = Composed
	this.StatusMaster = StatusMaster
	this.StatusChild = StatusChild
	Return this
End Sub

Sub ClearCLAData() As CLAData
	Private this As CLAData
	this.Initialize
	this.Request = ""
	this.Action = ""
	this.Task = ""
	this.Item = ""
	this.UniqueKey = ""
	this.Tagcode = ""
	this.RepeatCounter = 0
	this.ReadOnly = False
	this.Composed = False
	this.StatusMaster = ClearCLAStatus
	this.StatusChild = ClearCLAStatus
	Return this
End Sub

Sub MakeTypeRunDateFilters(DateStart As String, DateEnd As String) As RunDateFilters
	Private this As RunDateFilters
	this.Initialize
	this.DateStart = DateStart
	this.DateEnd = DateEnd
	Return this
End Sub

Sub ClearTypeRunDateFilters() As RunDateFilters
	Private this As RunDateFilters
	this.Initialize
	this.DateStart = ""
	this.DateEnd = ""
	Return this
End Sub

Sub MakeExtraInfo(TitleInfo As String, TxtInfo As String, ITC As String, rc As Int, ric As Int, rfc As Int) As ExtraInfo
	Private eXInfo As ExtraInfo
	eXInfo.Initialize
	eXInfo.titleinfo = TitleInfo
	eXInfo.textoInfo = TxtInfo
	eXInfo.item_tagcode = ITC
	eXInfo.rc = rc
	eXInfo.ric = ric
	eXInfo.rfc = rfc
	Return eXInfo
End Sub

Sub MakeWorkerNewData(up_typeoper As Int, up_tagcode As String, up_task As String, up_itemtagcode As String) As WorkerNewData
	Private WNData As WorkerNewData
	WNData.Initialize
	WNData.up_typeoper = up_typeoper
	WNData.up_tagcode = up_tagcode
	WNData.up_task = up_task
	WNData.up_itemtagcode = up_itemtagcode
	Return WNData
End Sub
