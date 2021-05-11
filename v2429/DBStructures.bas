B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'DBstructures
Sub Process_Globals
	
	Public Const EVC_SQL_GLOBAL_SEARCH As String = $"
													select y.grupo, y.tagcode, y.execute_date, y.execute_start, 
													y.reference, y.entidade, y.objecto, y.tipointervencao,
													y.tecnico, y.tipoobjecto, y.morada1,y.concelhodistrito1,
													y.georef1,y.morada2,y.concelhodistrito2,y.georef2,
													y.morada3,y.concelhodistrito3,y.georef3 from (
													
													select 1 as grupo, x.tagcode, x.execute_date, x.execute_start, 
													x.reference, x.entidade, x.objecto, x.tipointervencao,
													x.tecnico, x.tipoobjecto, x.morada1,x.concelhodistrito1,
													x.georef1,x.morada2,x.concelhodistrito2,x.georef2,
													x.morada3,x.concelhodistrito3,x.georef3 from (
													select a.tagcode, a.execute_date, a.execute_start, a.reference,
														b.title_import as entidade, c.title_import as objecto, d.title as tipointervencao,
														e.title as tecnico, f.title as tipoobjecto,
														ifnull(g1.address,'')||ifnull(g1.address2,'')||', '||g1.postalcode||' '||g1.`local` as morada1,
														ifnull(h1.title,'')||','||ifnull(i1.title, '') as concelhodistrito1,
														ifnull(g1.latitude,'')||', '||ifnull(g1.longitude,'') as georef1,
														
														ifnull(g2.address,'')||ifnull(g2.address2,'')||', '||g2.postalcode, ' ', g2.`local` as morada2,
														ifnull(h2.title,'')||','||ifnull(i2.title, '') as concelhodistrito2,
														ifnull(g2.latitude,'')||', '||ifnull(g2.longitude,'') as georef2,
														
														ifnull(g3.address,'')||ifnull(g3.address2,'')||', '||g3.postalcode||' '||g3.`local` as morada3,
														ifnull(h3.title,'')||','||ifnull(i3.title, '') as concelhodistrito3,
														ifnull(g3.latitude,'')||', '||ifnull(g3.longitude,'') as georef3
													from :CLIENTDB.dta_requests as a
													left join :CLIENTDB.dta_objects as b on (b.tagcode=a.entity_tagcode)
													left join :CLIENTDB.dta_objects as c on (c.tagcode=a.object_tagcode)
													inner join :CLIENTDB.dta_typerequests as d on (d.tagcode=a.typerequest_tagcode)
													left join :CLIENTDB.dta_technicals as e on (e.tagcode=a.technical_tagcode)
													left join :CLIENTDB.dta_objecttypes as f on (f.tagcode=c.object_type)
													left join :CLIENTDB.dta_locations as g1 on (g1.tagcode=a.local_tagcode)
													left join :CLIENTDB.dta_counties as h1 on (h1.tagcode=g1.county_tagcode)
													left join :CLIENTDB.dta_districts as i1 on (i1.tagcode=g1.district_tagcode)
													left join :CLIENTDB.dta_locations as g2 on (g2.tagcode=c.local_tagcode)
													left join :CLIENTDB.dta_counties as h2 on (h2.tagcode=g2.county_tagcode)
													left join :CLIENTDB.dta_districts as i2 on (i2.tagcode=g2.district_tagcode)
													left join :CLIENTDB.dta_locations as g3 on (g3.tagcode=b.local_tagcode)
													left join :CLIENTDB.dta_counties as h3 on (h3.tagcode=g3.county_tagcode)
													left join :CLIENTDB.dta_districts as i3 on (i3.tagcode=g3.district_tagcode)
													where 1=1
													and a.execute_date BETWEEN date('now') AND date('now','+:DAYSCHECK days') 
													) as x
													where 1=1
													and ifnull(x.tagcode,'')||ifnull(x.execute_date,'')||ifnull(x.execute_start,'')|| 
													ifnull(x.reference,'')||ifnull(x.entidade,'')||ifnull(x.objecto,'')||ifnull(x.tipointervencao,'')||
													ifnull(x.tecnico,'')||ifnull(x.tipoobjecto,'')||ifnull(x.morada1,'')||ifnull(x.concelhodistrito1,'')||
													ifnull(x.georef1,'')||ifnull(x.morada2,'')||ifnull(x.concelhodistrito2,'')||ifnull(x.georef2,'')||
													ifnull(x.morada3,'')||ifnull(x.concelhodistrito3,'')||ifnull(x.georef3,'') like '%:FINDTEXT%'
													
													union
													
													select 2 as grupo, x.tagcode, x.execute_date, x.execute_start, 
													x.reference, x.entidade, x.objecto, x.tipointervencao,
													x.tecnico, x.tipoobjecto, x.morada1,x.concelhodistrito1,
													x.georef1,x.morada2,x.concelhodistrito2,x.georef2,
													x.morada3,x.concelhodistrito3,x.georef3 from (
													select a.tagcode, '' as execute_date, '' as execute_start, a.reference,
														b.title_import as entidade, a.title_import as objecto, '' as tipointervencao,
													'' as tecnico, f.title as tipoobjecto,
														ifnull(g1.address,'')||ifnull(g1.address2,'')||', '||g1.postalcode||' '||g1.`local` as morada1,
														ifnull(h1.title,'')||','||ifnull(i1.title, '') as concelhodistrito1,
														ifnull(g1.latitude,'')||', '||ifnull(g1.longitude,'') as georef1,
													'' as morada2,
													'' as concelhodistrito2,
													'' as georef2,
													'' as morada3,
													'' as concelhodistrito3,
													'' as georef3
													from :CLIENTDB.dta_objects as a
													left join :CLIENTDB.dta_objects as b on (b.tagcode=a.parent_tagcode)
													inner join :CLIENTDB.dta_objecttypes as f on (f.tagcode=a.object_type)
													left join :CLIENTDB.dta_locations as g1 on (g1.tagcode=a.local_tagcode)
													left join :CLIENTDB.dta_counties as h1 on (h1.tagcode=g1.county_tagcode)
													left join :CLIENTDB.dta_districts as i1 on (i1.tagcode=g1.district_tagcode)
													where 1=1
													and a.active=1
													) as x
													where 1=1
													and ifnull(x.tagcode,'')||  
													ifnull(x.reference,'')||ifnull(x.entidade,'')||ifnull(x.objecto,'')||ifnull(x.tipointervencao,'')||
													ifnull(x.tecnico,'')||ifnull(x.tipoobjecto,'')||ifnull(x.morada1,'')||ifnull(x.concelhodistrito1,'')||
													ifnull(x.georef1,'') like '%:FINDTEXT%'
													
													union
													
													select 3 as grupo, x.tagcode, x.execute_date, x.execute_start, 
													x.reference, x.entidade, x.objecto, x.tipointervencao,
													x.tecnico, x.tipoobjecto, x.morada1,x.concelhodistrito1,
													x.georef1,x.morada2,x.concelhodistrito2,x.georef2,
													x.morada3,x.concelhodistrito3,x.georef3 from (
													select a.tagcode, '' as execute_date, '' as execute_start, '' as reference,
														case when tr_is_model=1 then '(Agrupadora)' else '(Simples)' end as entidade, a.title as objecto, '' as tipointervencao,
													'' as tecnico, '' as tipoobjecto,
													'' as morada1,
													'' as concelhodistrito1,
													'' as georef1,
													'' as morada2,
													'' as concelhodistrito2,
													'' as georef2,
													'' as morada3,
													'' as concelhodistrito3,
													'' as georef3
													from :CLIENTDB.dta_typerequests as a
													where 1=1
													and a.active=1
													) as x
													where 1=1
													and ifnull(x.tagcode,'')||ifnull(x.objecto,'') like '%:FINDTEXT%'
													) as y
													group by y.grupo, y.execute_date, y.execute_start, y.objecto
													"$
	'
	Public Const EVC_SQL_GETDISTRICTS As String = $"select tagcode, title, country_id from dta_districts order by title"$
	Public Const EVC_SQL_GETCOUNTIES As String = $"select tagcode, title, country_id, district_tagcode from dta_counties order by title"$
	Public Const SQL_DATA_TASK_GROUPS As String = $"SELECT id, tagcode, title as tagdesc, '#ffffff' as color FROM dta_tpr_groups WHERE active=1"$
	Public Const SQL_DATA_TASK_REQUESTS As String = $"SELECT id, tagcode, title as tagdesc, '#ffffff' as color FROM dta_typerequests WHERE active=1"$
	
	Public Const SQL_DATA_TYPE_PRIORITY As String = $"SELECT id, tagcode, tagdesc, color from type_prioritytypes"$
	Public Const SQL_DATA_TYPE_URGENCY As String = $"SELECT id, tagcode, tagdesc, color from type_gravitytypes"$
	Public Const SQL_DATA_TYPE_ASMODES As String = $"SELECT id, tagcode, tagdesc, color from type_asmodetypes"$
	Public Const SQL_DATA_TYPE_ASTYPES As String = $"SELECT id, tagcode, title as tagdesc, '#ffffff' as color from dta_actiontypes where active=1"$  'Acções Subsequentes
	Public Const SQL_DATA_TYPE_ASSTATUS As String = $"SELECT id, tagcode, tagdesc, color from type_operationtypes"$
	
	Public Const SQL_DATA_OBJECT_TYPE As String = $"SELECT id, tagcode, title as tagdesc, '#ffffff' as color FROM dta_objecttypes WHERE active=1"$
	Public Const SQL_DATA_OBJECT_GROUP As String = $"SELECT id, objtyp_tagcode, tagcode, title as tagdesc, '#ffffff' as color FROM dta_objecttypes_groups WHERE active=1"$

	Public Const SQL_GETCONFIG_DATA As String = "SELECT instance, authorization, version, versionid, api, confirmed, token, orientation, subdomain from config where id=1"
	Public Const SQL_GETALLVERSIONS_DATA As String = "SELECT id, name from versions"
	
	Public Const SQL_GETREQUESTS_DATA_NEW As String = $"select distinct a.id, a.ascbus, ifnull(a.tagcode, '') as tagcode, a.request_type, ifnull(e.title, '') as request_desc, a.status_id, ifnull(a.status_notes,'') as status_notes,
													ifnull(a.request_date, '') as request_date, ifnull(a.request_stime, '') as request_stime, ifnull(a.request_etime,'') as request_etime,
													ifnull(a.requester_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.usertagcode, '') as usertagcode,
													ifnull(b.type_tagcode,'') as type_tagcode, ifnull(b.name,'') as name, ifnull(b.reference,'') as reference,
													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0020'), '') as nif,
													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0021'), '') as phone,
													ifnull(b.local, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(c.postal_code, '') as postal_code, ifnull(c.city, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,
													ifnull(d.title,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, a.type as RequestType, 
													a.report_generated, a.report_file
													from requests as a
													inner join objects as b on (b.tagcode=a.requester_tagcode)
													left join locals as c on (c.tagcode=b.local)
													inner join type_requestsstatus as d on (d.id=a.status_id)  
													inner join type_requesttype as e on (e.tagcode=a.request_type) where 1=1 and a.type in (1,2)"$
													
	Public Const EVC_SQL_GETCURRENT_REQEST As String = $"select distinct a.id, ifnull(a.tagcode, '') as tagcode, b.title_import as cliname,
													a.typerequest_tagcode as request_type, a.status_id, ifnull(a.notes,'') as status_notes, 
													ifnull(a.execute_date, '') as execute_date, ifnull(a.execute_start, '') as execute_start, ifnull(a.execute_end,'') as execute_end,
													ifnull(a.object_tagcode,'') as object_tagcode, 
													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, 
													ifnull(c.longitude, '') as longitude, ifnull(a.details, '') as details,
													ifnull((select distinct value from dta_objects_fields where object_tagcode=a.object_tagcode and field_tagcode='FIELD_NIF'), '') as clinif
													from dta_requests as a
													left join dta_objects as b on (b.tagcode=a.object_tagcode)
													left join dta_locations as c on (c.tagcode=b.local_tagcode)
													where 1=1"$
													
	
	Public Const EVC_SQL_GETPREREQUESTS_DATA_NEW As String = $"select distinct a.id, ifnull(a.tagcode, '') as tagcode,
													a.typerequest_tagcode as request_type, ifnull(e.title, '') as request_desc, 
													a.status_id, ifnull(a.notes,'') as status_notes, a.paused, a.duration, a.confirmed,
													ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,
													ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,
													ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(b.reference,'') as reference,
													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_NIF'), '') as nif,
													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_PHONE'), '') as phone,
													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,
													ifnull(a.local_tagcode, '') as reqlocal_tagcode, ifnull(cc.address, '') as reqaddress, ifnull(cc.address2, '') as reqaddress2,
													ifnull(cc.postalcode, '') as reqpostal_code, ifnull(cc.`local`, '') as reqcity, ifnull(cc.latitude, '') as reqlatitude, ifnull(cc.longitude, '') as reqlongitude,
													ifnull(cc.district_tagcode, '') as reqdistrict_tagcode, ifnull(cc.region_tagcode, '') as reqregion_tagcode, ifnull(cc.county_tagcode, '') as reqcounty_tagcode,
													ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, 
													ifnull(a.details, '') as details,
													case when e.tr_is_model = 1 then 1 else 2 end as RequestType, 
														ifnull(a.route_tagcode, '') as route_tagcode,
														ifnull(f.title, '') as route_title,
														ifnull(a.team_tagcode, '') as team_tagcode,
														ifnull(g.title, '') as team_title,
														case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, 
														ifnull(a.file_report,'') as report_file,
														a.is_favorite,
														ifnull(b2.title_import,'') as nameobject,
														ifnull(case when e.tr_is_model = 0 then
															 (SELECT title FROM dta_tasks 
																WHERE tagcode IN (SELECT DISTINCT relation_tagcode FROM dta_requests_relations
																WHERE request_tagcode=a.tagcode))
														END, '') AS desctask
													from dta_requests as a
													left join dta_objects as b on (b.tagcode=a.entity_tagcode)
													left join dta_locations as c on (c.tagcode=b.local_tagcode)
													left join dta_locations as cc on (cc.tagcode=a.local_tagcode)
													left join type_statustypes as d on (d.id=a.status_id)  
													left join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode) 
													left join dta_routes as f on (f.tagcode=a.route_tagcode)
													left join dta_teams as g on (g.tagcode=a.team_tagcode)
													left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)
													where 1=1 and (a.state_id>=1 and a.state_id<4) and (a.typerequest_tagcode<>'' and a.typerequest_tagcode is not null)"$

	'************************************************************************************************************
	' acrescentado o ifnull(a1.fieldval_05,0) as fieldval_05 para poder controlar os cabecalhos das intervencoes
	'************************************************************************************************************
	
	Public Const EVC_SQL_GETREQUESTS_DATA_NEW As String = $"select distinct e.tr_is_model, a.id, ifnull(a.tagcode, '') as tagcode,
													a.typerequest_tagcode as request_type, ifnull(e.title, '') as request_desc, 
													a.status_id, ifnull(a.notes,'') as status_notes, a.paused, a.duration, a.confirmed,
													ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,
													ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,
													ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(a.reference,'') as ReqReference,
													ifnull(b.reference,'') as reference,
													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_NIF'), '') as nif,
													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_PHONE'), '') as phone,
													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(x.address, '') as objaddress,
													ifnull(x.address2, '') as objaddress2,
													ifnull(x.postalcode, '') as objpostalcode,
													ifnull(x.local, '') as objlocal,
													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,
													ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, 
													case when e.tr_is_model = 1 then 1 else 2 end as RequestType, 0 as repeatcounter,
													(SELECT onlyinlist FROM type_trclmodetypes WHERE tagcode=e.trcl_mode) AS onlyinlist, 
													ifnull(a.route_tagcode, '') as route_tagcode,
													ifnull(f.title, '') as route_title,
													ifnull(a.team_tagcode, '') as team_tagcode,
													ifnull(g.title, '') as team_title,
													case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, 
													ifnull(a.file_report,'') as report_file,
													a.is_favorite, ifnull(a.execute_enddate, '') as execute_enddate, ifnull(a.execute_date, '') as execute_date, 
													b2.tagcode as nameobject2,
													ifnull(j2.title, '') as techname, ifnull(j2.reference, '') as technumber, ifnull(j2.jobtitle, '') as jobtitle, 
													ifnull(b2.title_import,'') as nameobject,
													ifnull(case when e.tr_is_model = 0 then
														IFNULL(
														(SELECT distinct inner_title FROM dta_requests_relations 
															WHERE request_tagcode=a.tagcode  LIMIT 1)
														, 
														 (SELECT title FROM dta_tasks 
															WHERE tagcode IN (SELECT DISTINCT relation_tagcode FROM dta_requests_relations
															WHERE request_tagcode=a.tagcode)  LIMIT 1))
													END, '') AS desctask, ifnull(a1.fieldval_01,0) as fieldval_01, ifnull(a1.fieldval_05,0) as fieldval_05, ifnull(a1.fieldref_01,'') as fieldref_01,
													a1.repeated as force_group_request
													from dta_requests as a
													left join dta_requests_adds as a1 on (a1.request_tagcode=a.tagcode)
													inner join dta_objects as b on (b.tagcode=a.entity_tagcode)
													left join dta_locations as c on (c.tagcode=b.local_tagcode)
													inner join type_statustypes as d on (d.id=a.status_id)  
													inner join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode) 
													left join dta_routes as f on (f.tagcode=a.route_tagcode)
													left join dta_teams as g on (g.tagcode=a.team_tagcode)
													left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)
													left join dta_technicals As j2 on (j2.tagcode= a.object_tagcode)
													left join dta_locations as x on (x.tagcode=b2.local_tagcode)
													where 1=1 and a.state_id=4 "$
'	left join dta_departments As j3 on (j3.tagcode in (Select distinct tagcode from dta_departments_relations where relation_tagcode=j2.tagcode limit 1))
'	'j3.title as department,
													
	
	Public Const EVC_SQL_GETREQUESTS_DATA_TASKS As String = $"select distinct a.id, ifnull(a.tagcode, '') as tagcode,
													a.typerequest_tagcode as request_type, 
													ifnull(e.title, ifnull(g.title, '')) as request_desc, 
													ifnull(g.title, ifnull(e.title, '')) as task_desc,
													a.status_id, ifnull(a.notes,'') as status_notes, 
													z.paused, z.is_paused, z.duration, z.track,
													ifnull(a.execute_date, '') as request_date, 
													ifnull(a.execute_start, '') as request_stime, 
													ifnull(a.execute_end,'') as request_etime,
													ifnull(a.entity_tagcode,'') as requester_tagcode, 
													ifnull(a.object_tagcode,'') as object_tagcode, 
													ifnull(a.technical_tagcode, '') as usertagcode,
													ifnull(b.object_type,'') as type_tagcode, 
													ifnull(z.object_tagcode,'') as object_tagcode_rel, 
													ifnull(b2.object_type,'') as object_type, 
													ifnull(b3.object_type,'') as object_type_rel,
													case when b.tagcode = '__NONE__' or b.tagcode = 'OBJECT_DESIGNATE'   
													then ifnull(z.inner_title,ifnull(b.title_import, ifnull(b.details,''))) 
													else ifnull(b.title_import,ifnull(z.inner_title, ifnull(b.details,''))) end as name, 
													ifnull(b.reference,'') as reference,
													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_NIF'), '') as nif,
													ifnull((select value from dta_objects_fields where object_tagcode=b.tagcode and field_tagcode='FIELD_PHONE'), '') as phone,
													ifnull(b.local_tagcode, '') as local_tagcode, 
													ifnull(c1.address, ifnull(c.address, '')) as address, 
													ifnull(c1.address2, ifnull(c.address2, '')) as address2,
													ifnull(c1.postalcode, ifnull(c.postalcode, '')) as postal_code, 
													ifnull(c1.`local`, ifnull(c.`local`, '')) as city, 
													ifnull(c1.latitude, ifnull(c.latitude, '')) as latitude, 
													ifnull(c1.longitude, ifnull(c.longitude, '')) as longitude,
													ifnull(d.tagdesc,'') as status_desc, 
													ifnull(d.color, 'GRAY') as status_color, 
													'' as contact_name, 
													'' as contact_phone, 
													case when e.tr_is_model = 1 then 1 else 2 end as RequestType, 
													(SELECT onlyinlist FROM type_trclmodetypes WHERE tagcode=e.trcl_mode) AS onlyinlist,
													case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, ifnull(a.file_report,'') as report_file,
													ifnull(z.inner_title, CASE WHEN z.type_relation = 1 THEN ifnull(e.title,'') ELSE ifnull(g.title,'') END) as task_name,
													case when z.type_relation = 1 then 1 else 2 end as type, 
													'' as parent_action, 
													0 as level, 
													z.repeatcounter,
													ifnull(z.request_tagcode, '') as request_tagcode,
													'' as item_tagcode, 
													'' as uniquekey, 
													'' as inner_tagcode,
													g.task_close_mode as close_type, 
													ifnull(h.id, 0) as result_type, 
													ifnull(g.result_composed, '') as result_values, 
													e.title as tipo_objecto,
													e.title as tipo_intervencao, 
													ifnull(a.notes, '') as notes, 
													ifnull(a.notes, '') as request_obs,
													ifnull(z.relation_tagcode,'') as action_tagcode, 
													ifnull(z.relation_tagcode,'') as task_tagcode,
													z.position, z.status_id as rel_status_id, 
													ifnull(d1.tagdesc,'') as rel_status_desc, 
													ifnull(z.run_start,'') as run_start, 
													ifnull(z.run_end,'') as run_end, z.run_time,
													ifnull(z.inner_title, ifnull(b3.title_import,ifnull(b2.title_import,''))) as nameobject,
													ifnull(b2.title_import,'') as objectname, 
													ifnull(b2.tagcode,'') as objecttagcode
													from dta_requests_relations as z 
													inner join dta_requests as a on (a.tagcode=z.request_tagcode)
													left join dta_objects as b on (b.tagcode=a.entity_tagcode)
													left join dta_locations as c on (c.tagcode=b.local_tagcode)
													left join dta_locations as c1 on (c1.tagcode=a.local_tagcode)
													left join type_statustypes as d on (d.id=a.status_id)  
													left join type_statustypes as d1 on (d1.id=z.status_id)  
													left join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode)  
													left join dta_tasks as g on (g.tagcode= z.relation_tagcode)
													left join type_resulttypes as h on (h.tagcode= g.type_results)
													left join dta_objects as b3 on (b3.tagcode=z.object_tagcode)
													left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)
													where 1=1"$
	'ifnull(b2.details,'')
													
	Public Const EVC_SQL_GETREQUESTS_DATA_TASKS_REP As String = $"Select distinct z1.repeated, a.id, ifnull(a.tagcode, '') as tagcode,
								a.typerequest_tagcode As request_type, ifnull(e.title, '') as request_desc, 
								a.status_id, ifnull(a.notes,'') as status_notes, z.relation_tagcode, 
								ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,
								ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,
								ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(b.reference,ifnull(b2.reference,'')) as reference,
								ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_NIF'), '') as nif,
								ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_PHONE'), '') as phone,
								ifnull(b2.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
								ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,					
								ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, 
								Case when e.tr_is_model = 1 Then 1 Else 2 end as RequestType, 
								Case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, ifnull(a.file_report,'') as report_file,
								ifnull(g.title, e.title) as task_name,
								Case when z.type_relation = 1 Then 1 Else 2 end as Type, 
								'' as parent_action, 0 as level, ifnull(b2.title_import,'') as objectname, z.repeatcounter,
								ifnull(z.request_tagcode, '') as request_tagcode,
								'' as item_tagcode, '' as uniquekey, '' as inner_tagcode,
								g.task_close_mode As close_type, ifnull(h.id, 0) As result_type, ifnull(g.result_composed, '') as result_values, 
								e.title As tipo_objecto, e.title As tipo_intervencao, ifnull(a.notes, '') as notes, 
								ifnull(z.request_obs, ifnull(a.request_obs, '')) as request_obs,
								ifnull(z.relation_tagcode,'') as action_tagcode, ifnull(z.relation_tagcode,'') as task_tagcode,
								z.position, z.status_id as task_status_id, 
								ifnull(z.run_date,ifnull(a.run_date,'')) as run_date, 
								ifnull(z.run_start,ifnull(a.run_start,'')) as run_start, 
								ifnull(z.run_end,ifnull(a.run_end,'')) as run_end, 
								ifnull(z.run_time,ifnull(a.run_time,'')) as run_time,   
								ifnull(a.run_start,'')  as req_run_start, 
								ifnull(a.run_end,'') as req_run_end, 
								j.title As username, a.reference as reqreference,
								ifnull(j1.title, ifnull(j.title, '')) As sessusername, 
								z.sess_user, z.points, j2a.title as sessusername2,
								ifnull((select value from dta_objects_fields where object_tagcode=a.entity_tagcode AND field_tagcode='FIELD_CONTRATO'), '') as contracto,
								ifnull(z.inner_title, ifnull(b3.title_import,ifnull(b2.title_import,ifnull(b2.details,'')))) as nameobject,
								ifnull(j2.title, '') as techname, ifnull(j2.reference, '') as technumber, ifnull(j2.jobtitle, '') as jobtitle, j3.title as department
								from dta_requests_relations As z 
								inner join dta_requests As a on (a.tagcode=z.request_tagcode)
								inner join dta_objects As b on (b.tagcode=a.entity_tagcode)
								inner join type_statustypes As d on (d.id=a.status_id)  
								inner join dta_typerequests_tasks as z1 on (z1.typerequest_tagcode=a.typerequest_tagcode and z1.task_tagcode=z.relation_tagcode)
								left join dta_typerequests As e on (e.tagcode=a.typerequest_tagcode) 
								left join dta_tasks As g on (g.tagcode= z.relation_tagcode)
								left join type_resulttypes As h on (h.tagcode= g.type_results)
								left join dta_technicals As j on (j.tagcode= a.technical_tagcode)
								left join dta_objects as b3 on (b3.tagcode=z.object_tagcode)
								left join dta_objects as b2 on (b2.tagcode=a.object_tagcode)
								left join dta_locations As c on (c.tagcode=b2.local_tagcode)
								left join dta_technicals As j1 on (j1.tagcode= z.sess_user)
								left join dta_technicals As j2 on (j2.tagcode= a.object_tagcode)
								left join dta_technicals As j2a on (j2a.tagcode= a.sess_user)
								left join dta_departments As j3 on (j3.tagcode in (select distinct tagcode from dta_departments_relations where relation_tagcode=j2.tagcode limit 1))
								where 1=1"$
								
													
	Public Const EVC_SQL_GETREQUESTS_DATA_TASKS_TAGS As String = $"select distinct a.request_tagcode from dta_requests_relations as a
													inner join dta_requests as a1 on (a.request_tagcode=a1.tagcode)
													inner join dta_objects as b on (b.tagcode=a1.entity_tagcode)
													left join dta_locations as c on (c.tagcode=a1.local_tagcode)
													inner join type_statustypes as d on (d.id=a.status_id)
													inner join dta_tasks as e on (e.tagcode=a.relation_tagcode)"$
	
													
													
	Public Const SQL_GETREQUESTS_CURRENT_TASK As String = $"select distinct a.* from requests_tasks as a where 1=1 "$
	Public Const EVC_SQL_GETREQUESTS_CURRENT_TASK As String = $"select distinct a.* from dta_requests_relations as a where 1=1 "$

	Public Const SQL_GETREQUESTS_CURRENT As String = $"select a.id, a.ascbus, ifnull(a.tagcode, '') as tagcode, a.request_type, ifnull(e.title, '') as request_desc, a.status_id, ifnull(a.status_notes,'') as status_notes,
													ifnull(a.request_date, '') as request_date, ifnull(a.request_stime, '') as request_stime, ifnull(a.request_etime,'') as request_etime,
													ifnull(a.requester_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.usertagcode, '') as usertagcode,
													ifnull(b.type_tagcode,'') as type_tagcode, ifnull(b.name,'') as name, ifnull(b.reference,'') as reference,
													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0020'), '') as nif,
													ifnull((select value from props2objects where object=b.tagcode and property='PRPTY_0021'), '') as phone,
													ifnull(b.local, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(c.postal_code, '') as postal_code, ifnull(c.city, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,
													ifnull(d.title,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, a.type as RequestType,
													a.run_date, a.run_start, a.run_end, a.run_time, n.points, a.risk,
													n.close_type, n.result_type, n.result_values, a.report_generated, a.report_file
													from requests as a
													inner join requests_tasks as n on (n.request_tagcode=a.tagcode)
													inner join objects as b on (b.tagcode=a.requester_tagcode)
													left join locals as c on (c.tagcode=b.local)
													inner join type_requestsstatus as d on (d.id=a.status_id)  
													inner join type_requesttype as e on (e.tagcode=a.request_type) where 1=1 "$
													
													
	Public Const EVC_SQL_GETREQUESTS_CURRENT As String = $"Select distinct a.id, ifnull(a.tagcode, '') as tagcode,
													a.typerequest_tagcode As request_type, ifnull(e.title, '') as request_desc, 
													a.status_id, ifnull(a.notes,'') as status_notes,
													ifnull(a.execute_date, '') as request_date, ifnull(a.execute_start, '') as request_stime, ifnull(a.execute_end,'') as request_etime,
													ifnull(a.entity_tagcode,'') as requester_tagcode, ifnull(a.object_tagcode,'') as object_tagcode, ifnull(a.technical_tagcode, '') as usertagcode,
													ifnull(b.object_type,'') as type_tagcode, ifnull(b.title_import,ifnull(b.details,'')) as name, ifnull(b.reference,'') as reference,
													ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_NIF'), '') as nif,
													ifnull((Select value from dta_objects_fields where object_tagcode=b.tagcode And field_tagcode='FIELD_PHONE'), '') as phone,
													ifnull(b.local_tagcode, '') as local_tagcode, ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(c.postalcode, '') as postal_code, ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, ifnull(c.longitude, '') as longitude,
													ifnull(d.tagdesc,'') as status_desc, ifnull(d.color, 'GRAY') as status_color, '' as contact_name, '' as contact_phone, 
													Case when e.tr_is_model = 1 Then 1 Else 2 end as RequestType,  n.repeatcounter,
													a.run_date, a.points, a.risk,
													ifnull(n.run_start,ifnull(a.run_start,'')) as run_start, 
													ifnull(n.run_end,ifnull(a.run_end,'')) as run_end, ifnull(n.run_time,ifnull(a.run_time,'')) as run_time,
													n.run_enddate,
													n1.task_close_mode As close_type, n2.id As result_type, n1.result_composed As result_values,
													Case when ifnull(a.file_report,'') <> '' then 1 else 0 end as report_generated, ifnull(a.file_report,'') as report_file	
													from dta_requests As a
													inner join dta_requests_relations As n on (n.request_tagcode=a.tagcode)
													inner join dta_tasks As n1 on (n1.tagcode=n.relation_tagcode)
													inner join dta_objects As b on (b.tagcode=a.entity_tagcode)
													left join dta_locations As c on (c.tagcode=b.local_tagcode)
													inner join type_statustypes As d on (d.id=a.status_id)  
													inner join dta_typerequests As e on (e.tagcode=a.typerequest_tagcode) 
													left join type_resulttypes As n2 on (n2.tagcode=n1.type_results)
													where 1=1"$
													
	Public Const SQL_KPIALL_STATUS As String = $"select distinct a.status_desc, b.color as status_color, a.status_id, count(a.status_id) as counter
													from requests as a
													inner join type_requestsstatus as b on (b.id=a.status_id)
													group by a.status_id order by a.status_id"$
	
	Public Const EVC_SQL_KPIALL_STATUS As String = $"select distinct b.tagdesc as status_desc, b.color as status_color, a.status_id, count(a.status_id) as counter
													from dta_requests as a
													inner join type_statustypes as b on (b.id=a.status_id) "$

	Public Const SQL_CURRENT_ADDRESS_TYPES As String = $"select distinct title from type_locals order by id"$
	
	Public Const SQL_CURRENT_CONTACT_TYPES As String = $"select distinct title from type_contacts order by id"$
	Public Const EVC_SQL_CURRENT_CONTACT_TYPES As String = $"select distinct tagdesc from type_contacttypes order by id"$
	
	Public Const SQL_CURRENT_CONTACTS As String = $"select a.type, a.ascbus, a.tagcode, a.name, a.title, a.phone, a.email, b.title as typedesc 
													from contacts as a left join type_contacts as b on (b.id=a.type)"$
	Public Const EVC_SQL_CURRENT_CONTACTS As String = $"select b.id as type, 1 as ascbus, a.tagcode, a.name, ifnull(a.reference,'') as title, a.phone, a.email, b.tagdesc as typedesc
													from dta_contacts as a left join type_contacttypes as b on (b.tagcode=a.type_contact)"$
										
	Public Const SQL_CURRENT_OBJECTS As String = $"select a.id, a.type, a.type_tagcode, b.title as typedesc, a.lastvisit, a.status_id, a.status_desc, a.status_color, a.ascbus, a.tagcode,
													a.name, a.local, a.contact_name, a.contact_phone, a.notes, a.have_contract, a.contract, a.nifnumber, a.main_contact, a.isgroup, 
													a.reference, a.last_execution, a.have_scheme, a.scheme_plant, a.parent,
													c.address, ifnull(c.address2,'') as address2, c.postal_code, c.city, c.latitude, c.longitude, 
													ifnull(c.region, '') region, ifnull(c.district, '') district, ifnull(c.country,0) as country,
													ifnull(d.name, '') as parent_name, ifnull(a.image, '') as image
													from objects as a
													inner join type_objects as b on (b.tagcode=a.type_tagcode)
													inner join locals as c on (c.tagcode=a.local)
													left join objects as d on (d.tagcode=a.parent)"$ 
													
	Public Const EVC_SQL_CURRENT_OBJECTS As String = $"select a.id, b.id as type, a.object_type as type_tagcode, b.title as typedesc,
													a.last_execution as lastvisit, a.active as status_id,
													ifnull(a.reference,'') as reference, ifnull(a.last_execution,'') as last_execution, 0 as have_scheme, '' as scheme_plant, 
													a.parent_tagcode as parent,
													a.obs as notes,
													CASE a.active WHEN 1 THEN 'Activo' ELSE 'Inactivo' END as status_desc, 
													CASE a.active WHEN 1 THEN 'GREEN' ELSE 'GRAY' END as status_color, 1 as ascbus, 
													a.tagcode, ifnull(a.title_import,ifnull(a.details,'')) as name, a.local_tagcode as local, 
													ifnull(c.address, '(Sem endereço)') as address, ifnull(c.address2,'') as address2, 
													ifnull(c.postalcode,'(Sem C. Postal)') as postal_code, ifnull(c.local,'(Sem Localidade)') as city, 
													ifnull(c.latitude,'') as latitude, ifnull(c.longitude,'') as longitude,
													ifnull(c.region_tagcode, '') region, ifnull(c.district_tagcode, '') district, 
													ifnull(c.country_id,0) as country, b.isgroup,
													b.have_contracts as have_contract, '' as contact_name, '' as contact_phone, 
													'' as contract, '' as nifnumber, '' as main_contact, ifnull(d.reference, '') as parent_reference,
													ifnull(d.title_import, '') as parent_name, ifnull(a.image, '') as image, ifnull(a.filename, '') as filename
													from dta_objects as a
													inner join dta_objecttypes as b on (b.tagcode=a.object_type)
													left join dta_locations as c on (c.tagcode=a.local_tagcode)
													left join dta_objects as d on (d.tagcode=a.parent_tagcode)"$


'	Public Const SQL_CURRENT_OBJECTS_ENT As String = $"select a.id, a.type, a.type_tagcode, b.title as typedesc, 
'													a.lastvisit, a.status_id, a.status_desc, a.status_color, a.ascbus, a.tagcode,
'													a.name, a.local, ifnull(a.contact_name,'') as contact_name, ifnull(a.contact_phone,'') as contact_phone, a.notes, a.have_contract, 
'													a.contract, a.nifnumber, a.main_contact, a.isgroup, 
'													a.reference, a.last_execution, a.have_scheme, a.scheme_plant, a.parent,
'													c.address, ifnull(c.address2,'') as address2, c.postal_code, c.city, c.latitude, c.longitude, 
'													ifnull(c.region, '') region, ifnull(c.district, '') district, ifnull(c.country,0) as country
'													from objects as a
'													inner join type_objects as b on (b.tagcode=a.type_tagcode)
'													inner join locals as c on (c.tagcode=a.local)
'													where 1=1"$

	Public Const EVC_SQL_CURRENT_OBJECTS_ENT As String = $"select a.id, b.id as type, a.object_type as type_tagcode, b.title as typedesc,
													a.last_execution as lastvisit, a.active as status_id,
													ifnull(a.reference,'') as reference, ifnull(a.last_execution,'') as last_execution, 0 as have_scheme, '' as scheme_plant, 
													a.parent_tagcode as parent,
													a.obs as notes,
													CASE a.active WHEN 1 THEN 'Activo' ELSE 'Inactivo' END as status_desc, 
													CASE a.active WHEN 1 THEN 'GREEN' ELSE 'GRAY' END as status_color, 1 as ascbus, 
													a.tagcode, ifnull(a.title_import,ifnull(a.details,'')) as name, a.local_tagcode as local, 
													ifnull(c.address, '(Sem endereço)') as address, ifnull(c.address2,'') as address2, 
													ifnull(c.postalcode,'(Sem C. Postal)') as postal_code, ifnull(c.local,'(Sem Localidade)') as city, 
													ifnull(c.latitude,'') as latitude, ifnull(c.longitude,'') as longitude,
													ifnull(c.region_tagcode, '') region, ifnull(c.district_tagcode, '') district, 
													ifnull(c.country_id,0) as country, b.isgroup,
													b.have_contracts as have_contract, '' as contact_name, '' as contact_phone, 
													'' as contract, '' as nifnumber, '' as main_contact,
													ifnull(d.title_import, '') as parent_name, ifnull(a.image, '') as image
													from dta_objects as a
													inner join dta_objecttypes as b on (b.tagcode=a.object_type)
													inner join dta_locations as c on (c.tagcode=a.local_tagcode)
													left join dta_objects as d on (d.tagcode=a.parent_tagcode) 
													where 1=1"$
												
	Public Const SQL_CURRENT_OBJECTS_LOCAL As String = $"select distinct b.city from objects as a left join locals as b on (b.tagcode=a.local) order by b.city"$
	Public Const EVC_SQL_CURRENT_OBJECTS_LOCAL As String = $"select distinct ifnull(b.local,'') as city from dta_objects as a left join dta_locations as b on (b.tagcode=a.local_tagcode) order by b.local"$
	
	Public Const SQL_CURRENT_OBJECTS_TYPE As String = $"select distinct id, tagcode, title from type_objects order by id"$
	Public Const EVC_SQL_CURRENT_OBJECTS_TYPE As String = $"select distinct id, tagcode, title from dta_objecttypes where active=1 order by id"$
	
	Public Const SQL_CURRENT_OBJECTS_PROPERTIES As String = $"select a.*, c.title from props2objects as a
													 inner join objects as b on (b.tagcode=a.object) 
													 inner join properties as c on (c.tagcode=a.property)"$
	Public Const EVC_QL_CURRENT_OBJECTS_PROPERTIES As String = $"select a.*, c.title
													from dta_objects_fields as a
													inner join dta_objects as b on (b.tagcode=a.object_tagcode) 
													inner join dta_fields as c on (c.tagcode=a.field_tagcode) where 1=1 "$
													
	Public Const EVC_QL_CURRENT_REQUEST_PROPERTIES As String = $"select a.*, c.title, b.tagcode
													from dta_requests_fields as a
													inner join dta_requests as b on (b.tagcode=a.request_tagcode) 
													inner join dta_fields as c on (c.tagcode=a.field_tagcode) where 1=1 "$
													
													
	Public Const EVC_QL_CURRENT_OBJECTS_IMAGES As String = $"select object_tagcode, image, filename, title, sess_user, created_at
														from dta_objects_images where 1=1 "$
										 
	Public Const SQL_ALL_CONTRACTS As String = $"select a.id, a.ascbus, a.tagcode, a.title, a.status_id, a.status_desc, a.status_color, a.document_tagcode, a.docfilename, a.creation_date, a.valid_from,
													a.valid_to, a.duration, a.confirmdays, a.periodicity, a.periodvisits, a.hourspervisit, a.dayperiod, 
													a.last_visit, a.daysweekvisit, a.daismonthvisit, a.intervention_type
													from contracts as a"$
													
	Public Const SQL_ALL_ENTITY_CONTRACTS As String = $"${SQL_ALL_CONTRACTS} inner join contracts2entities as b on (b.contract=a.tagcode) "$
	Public Const SQL_ALL_OBJECT_CONTRACTS As String = $"${SQL_ALL_CONTRACTS} inner join contracts2objects as b on (b.contract=a.tagcode) "$
	
	
	Public Const SQL_PERIODICITY_TYPE As String = $"select distinct title from type_periodicity order by id"$
	Public Const EVC_SQL_PERIODICITY_TYPE As String = $"select distinct tagdesc from type_periodicitytypes order by id"$
	
	Public Const SQL_DAYPERIOD_TYPE As String = $"select distinct title from type_dayperiods order by id"$
	Public Const EVC_SQL_DAYPERIOD_TYPE As String = $"select distinct tagdesc from type_perioddaytypes order by id"$
	
	
	Public Const SQL_ALL_DOCUMENTS As String = $"Select a.*, b.title As categorytitle from documents As a left join documents_categories As b on (b.id=a.category)"$
	Public Const EVC_SQL_ALL_DOCUMENTS As String = $"Select a.*, ifnull(b.tagdesc,'') As categorytitle from dta_documents As a left join type_documenttypes As b on (b.tagcode=a.document_type)"$
	
	Public Const EVC_SQL_OBJ_DOCUMENTS As String = $"SELECT a.tagcode, a.title, a.document_type, a.valid_from, a.valid_to, a.doc_filename from dta_documents AS a
													LEFT JOIN dta_objects_documents AS od on (od.document_tagcode = a.tagcode)
													LEFT JOIN dta_objects AS o ON (o.tagcode = od.object_tagcode)"$
												
	Public Const EVC_SQL_CURRENT_TASKS As String = $"select a.id, b.tagdesc, b.id as type, 1 as user_id, 1 as ascbus, a.tagcode, a.title as name, a.details,
													1 as version_id, a.version, '' as version_date, a.have_posis_numbers as include_numerators, 0 as sublevel_letters,
													a.signature_required as signingrequest, a.report_generate_required as reportgeneration, a.task_close_mode as fast_close,
													a.active, ifnull(a.updated_at, '1970-01-01') as last_update, a.cla_obs as task_obs,
													round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate,
													a.have_results, a.result_composed
													from dta_tasks as a
													inner join type_taskstypes as b on (b.tagcode=a.task_type) where 1=1 "$	
													
	Public Const EVC_V2_SQL_CURRENT_TASKS As String = $"select a.id, b.tagdesc, b.id as type, 1 as user_id, 1 as ascbus, a.tagcode, a.title as name, a.details,
													1 as version_id, a.version, '' as version_date, a.have_posis_numbers as include_numerators, 0 as sublevel_letters,
													a.signature_required as signingrequest, a.report_generate_required as reportgeneration, a.task_close_mode as fast_close,
													a.active, ifnull(a.updated_at, '1970-01-01') as last_update, a.cla_obs as task_obs,
													round(ifnull((julianday('now') - julianday(ifnull(a.updated_at, '1970-01-01'))), 0)) as dayslastupdate,
													a.have_results, a.result_composed,
													a1.new_objecttype, a1.link_to_request, a1.validate_new_object, a1.update_if_exists, 
													a1.show_history, a1.history_from_task
													from dta_tasks as a
													left join dta_tasks_adds as a1 on (a1.tagcode=a.tagcode)
													inner join type_taskstypes as b on (b.tagcode=a.task_type) where 1=1 "$	
																			
												
	Public Const WHERE_DAYSBETWEEN_CONDITION As String = $"Round(ifnull((julianday('now') - julianday(ifnull(a.last_update, '1970-01-01'))), 0))"$
	
	'incluido o c.repeatcounter
	Public Const EVC_V1_SQL_GET_TASK_ITEMS As String = $"select distinct 0 as fieldval_05, c.title as title2, b.title as name, b.have_posis_numbers as include_numerators,
													b.connectmode, b.can_pause, b.title_override, b.time_control,
													b.generate_report, b.generate_report_list,
													b.signature_required as signingrequest, b.report_generate_required as reportgeneration, 
													b.task_close_mode as fast_close, 0 as doobjectimage, a.*, c.repeatfieldcounter,
													(select count(0) as v from  dta_tasks_items_answers as d where
													d.task_tagcode=a.task_tagcode and d.item_tagcode=a.item_tagcode 
													and d.unique_key=a.unique_key) as rowitems, c.repeatcounter 
													from dta_tasks_items as a 
													inner join dta_tasks as b on (b.tagcode=a.task_tagcode),
													dta_requests_values AS c 
													where 1=1 
													and c.task_tagcode=a.task_tagcode and c.item_tagcode=a.item_tagcode and c.unique_key=a.unique_key "$ 
	'incluido o c.repeatcounter, passei o fieldval_04 e _05 de ifnull '' para ifnull 0
	Public Const EVC_V2_SQL_GET_TASK_ITEMS As String = $"select distinct 
													ifnull(e.fieldval_05, 0) as fieldval_05, 
													ifnull(e.fieldval_04, 0) as fieldval_04, 
													ifnull(c.title, '') as title2, 
													ifnull(c.object_tagcode, '') as object_tagcode, 
													ifnull(b.title, '') as name, 
													ifnull(b.have_posis_numbers, '0') as include_numerators,
													ifnull(b.connectmode, '0') as connectmode, 
													ifnull(b.can_pause, '0') as can_pause, 
													ifnull(b.title_override, '') as title_override, 
													ifnull(b.time_control, '0') as time_control,
													ifnull(b.generate_report, '') as generate_report, 
													ifnull(b.generate_report_list, '') as generate_report_list,
													ifnull(b.signature_required, '0') as signingrequest, 
													ifnull(b.report_generate_required, '0') as reportgeneration, 
													ifnull(b.task_close_mode, '0') as fast_close, 
													ifnull(a1.do_object_image, '') as doobjectimage, 
													a.*,  0 as val_format, 
													ifnull(c.repeatfieldcounter, '0') as repeatfieldcounter,
													ifnull((select count(0) as v from  dta_tasks_items_answers as d where
														d.task_tagcode=a.task_tagcode and d.item_tagcode=a.item_tagcode 
														and d.unique_key=a.unique_key), '0') as rowitems, 
													ifnull(c.repeatcounter, '0') as repeatcounter 
													from dta_tasks_items as a 
													left join dta_tasks_items_adds as a1 on (a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key)
													inner join dta_tasks as b on (b.tagcode=a.task_tagcode),
													dta_requests_values AS c 
													left join dta_requests_values_adds as e on (e.request_tagcode=c.request_tagcode
															and e.inner_request_tagcode=c.inner_request_tagcode
															and e.task_tagcode=c.task_tagcode 
															and e.item_tagcode=c.item_tagcode
															and e.unique_key=c.unique_key
															and e.repeatcounter=c.repeatcounter
															and e.repeatfieldcounter=c.repeatfieldcounter)
													where 1=1 
													and c.task_tagcode=a.task_tagcode and c.item_tagcode=a.item_tagcode and c.unique_key=a.unique_key "$ 
													


''	TASKS
''  title,details,image,connect2data,connectmode,onenct2requests,connect2nconformity
''	last_execution,version,created_at,updated_at,sid_id,cbr_id,active,status, published
''	generate_report,generate_report_list,signature_required,report_generate_required,task_close_mode
''	task_is_model,task_model_modes,
''	have_results,have_history,have_posis_numbers,xls_import,force_xls
''	title_override,time_control,can_pause,duration,
''	type_results,result_composed,validate_execution,validate_type,group_tags,cla_obs
	
	'where task_tagcode='CHKLST_00001' order by position
	Public Const EVC_SQL_GET_TASK_ITEMS_TWO As String = $"select distinct  a.parent_tagcode 
													from dta_tasks_items as a 
													inner join dta_tasks as b on (b.tagcode=a.task_tagcode)
													where 1=1 "$ 
													
	Public Const EVC_V1_SQL_GET_TASK_ITEMS_TWO As String = $"select distinct  a.parent_tagcode
													from dta_tasks_items as a 
													inner join dta_tasks as b on (b.tagcode=a.task_tagcode)
													where 1=1 "$ 
													
	Public Const EVC_V2_SQL_GET_TASK_ITEMS_TWO As String = $"select distinct  a.parent_tagcode
													from dta_tasks_items as a 
													left join dta_tasks_items_adds as a1 on (a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key)
													inner join dta_tasks as b on (b.tagcode=a.task_tagcode)
													where 1=1 "$ 
	
												
												
												
	'Public Const SQL_GET_TASK_RECHEIGTH As String = $"select count(0) as items, sum(CASE WHEN a.value_type=2 THEN 115 ELSE 70 END) as total from  tasks_items as a where 1=1"$
	Public Const SQL_GET_TASK_RECHEIGTH As String = $"select count(0) as items, sum(CASE WHEN a.value_type=2 THEN 70 ELSE 60 END) as total from  tasks_items as a where 1=1"$
	Public Const SQL_GET_TASK_RECHEIGTHGRID As String = $"select count(0) as items, sum(60) as total from  requests_itemsgrid as a where 1=1"$
	
	Public Const SQL_GET_TASK_WITH_INFO_VAL As String = $"select count(0) as total from tasks_items where (info is not null) and (info<>'')"$
	
	Public Const SQL_GET_TASK_RECHEIGTH_VAL As String = $"select count(0) as items, sum(CASE WHEN a.value_type=2 THEN :V1 ELSE :V2 END) as total from  tasks_items as a where 1=1"$
	Public Const EVC_SQL_GET_TASK_RECHEIGTH_VAL As String = $"select count(0) as items, sum(CASE WHEN a.data_type=2 THEN :V1 ELSE :V2 END) as total from  dta_tasks_items as a where 1=1"$
	Public Const EVC_SQL_GET_TASK_RECHEIGTH_ITEMS As String = $"select count(0) as items from  dta_tasks_items as a where 1=1"$
#if B4i
	Public Const EVC_SQL_GET_TASK_RECHEIGTH_ITEMS_SUM As String = $"select sum(height_land) as height_land, sum(height_port) as height_port from  dta_tasks_items as a where 1=1"$
#else
	Public Const EVC_SQL_GET_TASK_RECHEIGTH_ITEMS_SUM As String = $"select sum(a.height_land) as height_land, sum(a.height_port) as height_port,
													sum(a.height_land_sp) as height_land_sp, sum(a.height_port_sp) as height_port_sp,
													count(0) as total, (SUM((select count(0) as v from  dta_tasks_items_answers as b where
													b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode 
													and b.unique_key=a.unique_key))-100)*60 as totalitemsheight
													from dta_tasks_items as a where 1=1"$
#end if
	
	Public Const EVC_SQL_GET_TASK_WITH_INFO_VAL As String = $"select count(0) as total from dta_tasks_items where (info_notes is not null) and (info_notes<>'')"$

	
	Public Const SQL_GET_TASK_RECHEIGTHGRID_VAL As String = $"select count(0) as items, sum(:V1) as total from  requests_itemsgrid as a where 1=1"$
	Public Const SQL_GET_TASK_GRIDITEMS As String = $"select * from  requests_itemsgrid as a where 1=1"$
	
	Public Const SQL_GET_TASK_ITEM_VALUE As String = $"select distinct a.id, a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode, a.status, 
													a.value, b.val_datatype, b.val_format, a.value_options, b.conform_type, b.val_title, b.value_default, 
													a.points, a.risk, a.val_min, a.val_max
													from  requests_values as a 
													inner join tasks_itemsvalues as b on 
													(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode) 
													where 1=1"$
													
'	Public Const EVC_SQL_GET_TASK_ITEM_VALUE As String = $"select distinct a.id, a.request_tagcode, a.inner_request_tagcode, a.task_tagcode, a.item_tagcode, a.unique_key,
'													a.tagcode, 
'													a.execute_status as status, ifnull(a.execute_value_title, ifnull(b.default_value,'')) as execute_value_title, 
'													a.execute_value as value, b.data_type as val_datatype, b.icon, b.printout_type,
'													b.data_format as val_format, c.id as conform_type, b.title as val_title, ifnull(b.default_value,'') as value_default, 
'													b.points, b.risk, b.valmin as val_min, b.valmax as val_max, ifnull(b.data_list,'') as value_options, 
'													a.repeated, a.repeatcounter, a.repeatitemcounter, a.repeatfieldcounter,  a.id, b.`position`,
'													a1.do_origin, a1.do_origin_group, a1.do_origin_titlefield, a1.do_tagcode, a.object_tagcode
'													from  dta_requests_values as a 
'													inner join dta_tasks_items AS a1 on
'													(a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key) 
'													inner join dta_tasks_items_answers as b on
'													(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
'													left join type_conformitytypes as c on (c.tagcode=b.type_conformity)
'													where 1=1"$	
	Public Const EVC_SQL_GET_TASK_ITEM_VALUE As String = $"select distinct a.request_tagcode, a.inner_request_tagcode, a.task_tagcode, a.item_tagcode, a.unique_key,
													ifnull(a.tagcode,'') as tagcode, 
													ifnull(a.execute_status, '0') as status, 
													ifnull(a.execute_value_title, ifnull(b.default_value,'')) as execute_value_title, 
													ifnull(a.execute_value,'') as value, 
													ifnull(b.data_type,'0') as val_datatype, 
													ifnull(b.icon,'') as icon, 
													ifnull(b.printout_type,'') as printout_type,
													ifnull(b.data_format,'0') as val_format, 
													ifnull(c.id,'0') as conform_type, 
													ifnull(b.title,'') as val_title, 
													ifnull(b.default_value,'') as value_default, 
													ifnull(b.points,'0') as points, 
													ifnull(b.risk,'0') as risk, 
													ifnull(b.valmin,'0') as val_min, 
													ifnull(b.valmax,'0') as val_max, 
													ifnull(b.data_list,'') as value_options, 
													ifnull(a.repeated,'') as repeated, 
													ifnull(a.repeatcounter,'') as repeatcounter, 
													ifnull(a.repeatitemcounter,'') as repeatitemcounter, 
													ifnull(a.repeatfieldcounter,'') as repeatfieldcounter,  
													ifnull(a.id,'0') as id, 
													ifnull(b.`position`,'0') as position,
													ifnull(a1.do_origin,'') as do_origin, 
													ifnull(a1.do_origin_group,'') as do_origin_group, 
													ifnull(a1.do_origin_titlefield,'') as do_origin_titlefield, 
													ifnull(a1.do_tagcode,'') as do_tagcode, 
													ifnull(a1.do_subgroup,'') as do_subgroup, 
													ifnull(a1.do_subsubgroup,'') as do_subsubgroup, 
													ifnull(a1.do_name,'') as do_name, 
													ifnull(a1.do_is_additional,'') as do_is_additional, 
													ifnull(a1.reference,'') as reference, 
													ifnull(a.object_tagcode,'') as object_tagcode, 
													ifnull(a1.do_associate_type,'') as do_associate_type, 
													ifnull(a1.do_affected_table,'') as do_affected_table, 
													ifnull(a1.do_affected_tagcode,'') as do_affected_tagcode,
													ifnull(a1.do_affected_field,'') as do_affected_field, 
													ifnull(a1.change_title_totime,'') as change_title_totime, 
													ifnull(a1.force_control,'') as force_control, 
													ifnull(a1.type_control,'') as type_control, 
													ifnull(a1.dependent_key,'') as dependent_key,
													ifnull(a1.can_search,'') as can_search,
													ifnull(a2.do_object_image,'') as doobjectimage, 
													ifnull(a2.level3_table,'') as level3_table, 
													ifnull(a2.level3_level,'') as level3_level, 
													ifnull(a2.level3_tagcode,'') as level3_tagcode, 
													ifnull(a2.level3_parent,'') as level3_parent, 
													ifnull(a2.level3_child,'') as level3_child,
													ifnull(a2.reference,'') as adds_reference, 
													ifnull(a2.object_table,'') as object_table, 
													ifnull(a2.object_type_tagcode,'') as object_type_tagcode, 
													ifnull(a2.object_type_group,'') as object_type_group,
													ifnull(a2.object_type_relation,'') as object_type_relation, 
													ifnull(a2.object_type_parent,'') as object_type_parent, 
													ifnull(a2.object_type_child,'') as object_type_child, 
													ifnull(a2.object_type_addrelation,'') as object_type_addrelation,
													ifnull(a2.object_type_delrelation,'') as object_type_delrelation, 
													ifnull(a2.paramters,'') as paramters
													from dta_requests_values as a 
													inner join dta_tasks_items AS a1 on
													(a1.task_tagcode=a.task_tagcode and a1.item_tagcode=a.item_tagcode and a1.unique_key=a.unique_key) 
													inner join dta_tasks_items_adds AS a2 on
													(a2.task_tagcode=a1.task_tagcode and a2.item_tagcode=a1.item_tagcode and a2.unique_key=a1.unique_key) 
													inner join dta_tasks_items_answers as b on
													(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key and b.tagcode=a.tagcode) 
													left join type_conformitytypes as c on (c.tagcode=b.type_conformity)
													where 1=1 "$	
	' left join dta_tasks_items_adds AS a2 on
	Public Const EVC_SQL_GET_TASK_ITEM_VALUE_EVENTS As String = $"SELECT DISTINCT event_tagcode,`position`,type_item,active,`value`,formula,have_formula,have_condition,
													have_status,is_jump,is_status,is_alert,is_email,is_more,is_foto,is_action,inc_object_contacts,
													team_tagcode,email_to,email_cc,use_internal_image,default_typerequest,resobsgrp_tagcode,add_entity_email,
													add_object_email,request_signature
													FROM dta_tasks_items_answers_events
													where 1=1 "$	
'													And task_tagcode='TSKS_2019_222538'
'													And item_tagcode='TSIT0024'
'													And unique_key='bb32a254-3195-5094-94df-3ae6ddb28552'
'													And tagcode='TSKSITMR_2019_222913_18'"$													
													
													'(b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey and b.tagcode=a.tagcode)
	Public Const SQL_GET_TASK_ITEM_VALUE_GRID As String = $"Select a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.tagcode, ifnull(b.status, 0) as status  
													from  requests_itemsgrid As a left join requests_values As b on (b.request_tagcode=a.request_tagcode And b.action_tagcode=a.action_tagcode And 
													b.task_tagcode=a.task_tagcode And b.item_tagcode=a.item_tagcode And b.uniquekey=a.uniquekey And b.tagcode=a.tagcode)
													where 1=1"$
													
	Public Const SQL_GET_TASK_MORE_AS As String = $"select ifnull(b.title,'') as status_desc, ifnull(c.title,'') as priority_desc, ifnull(d.title,'') as urgency_desc, a.id, a.request_tagcode,
													a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, a.posis, a.status, 
													ifnull(a.details,'') as details, ifnull(a.actiondatetime,'') as actiondatetime, ifnull(a.assigned_to, '') as assigned_to,
													a.assigned_type, ifnull(a.email_datetime,'') as email_datetime, a.email_sent, ifnull(a.email_to, '') as email_to, 
													a.priority, ifnull(a.related_task,'') as related_task, ifnull(a.take_action,'') as take_action, ifnull(a.title,'') as title, a.urgency, a.user_tagcode,
													a.repeatcounter, a.repeatitemcounter, a.due_date
													from requests_actions_history as a 
													left join type_asstatus as b on (b.id=a.status)
													left join type_priorities as c on (c.id=a.priority)
													left join type_urgency as d on (d.id=a.urgency)
													where 1=1"$
													
'	Public Const EVC_SQL_GET_TASK_MORE_AS As String = $"select ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,
'													ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode,
'													a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,
'													ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,
'													ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,
'													a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, a.operation_type
'													from dta_actions as a 
'													left join type_operationtypes as b ON (b.tagcode=a.operation_type)
'													left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)
'													left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)
'													where 1=1"$
													
'	Public Const EVC_SQL_GET_TASK_MORE_AS As String = $"SELECT x.* FROM
'												(
'												SELECT 1 AS masterid, ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,
'													ifnull(d.tagdesc,'') as urgency_desc, a.id, a.request_tagcode,
'													a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.updated_at as actiondatetime,
'													ifnull(a.iu_tagcode,'') as iu_tagcode, a.tagcode, ifnull(a.email_to, '') as email_to,
'													ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,
'													a.priority_tagcode,  ifnull(a.title,'') as title, a.gravity_tagcode,  a.due_date, a.operation_type, 
'													a.repeatcounter
'													from dta_actions as a 
'													left join type_operationtypes as b ON (b.tagcode=a.operation_type)
'													left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)
'													left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)
'												UNION
'												SELECT 0 AS masterid, ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,
'													ifnull(d.tagdesc,'') as urgency_desc, a.id, a1.request_tagcode,
'													a1.action_tagcode, a1.task_tagcode, a1.item_tagcode, a1.uniquekey, a.updated_at as actiondatetime,
'													IFNULL(a1.iu_tagcode,'') as iu_tagcode, a.actions_tagcode, ifnull(a.email_to, '') as email_to,
'													ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,
'													a.priority_tagcode,  '' as title, a.gravity_tagcode,  a.due_date, a.operation_type, 
'													a.repeatcounter
'													from dta_actions_items as a 
'													INNER JOIN  dta_actions AS a1 ON (a1.tagcode=a.actions_tagcode)
'													left join type_operationtypes as b ON (b.tagcode=a.operation_type)
'													left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)
'													left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)
'												) AS x
'												where 1=1"$

	Public Const EVC_SQL_GET_TASK_MORE_AS As String = $"SELECT x.* FROM
												(
												SELECT 0 AS masterid, ifnull(b.tagdesc,'') as status_desc, ifnull(c.tagdesc,'') as priority_desc,
													ifnull(d.tagdesc,'') as urgency_desc, a.id, a1.request_tagcode,
													a1.action_tagcode, a1.task_tagcode, a1.item_tagcode, a1.uniquekey, a.updated_at as actiondatetime,
													IFNULL(a1.iu_tagcode,'') as iu_tagcode, a1.tagcode, ifnull(a.email_to, '') as email_to,
													ifnull(a.details,'') as details, ifnull(a.technical_tagcode, '') as assigned_to,
													a.priority_tagcode,  IFNULL(a1.title,'') as title, a.gravity_tagcode,  
													ifnull(a.due_date, IFNULL(a1.due_date, '')) AS due_date, a.operation_type, 
													a.repeatcounter, a.repeatitemcounter, a.repeatfieldcounter, a.email_sent, a.send_email
													from dta_actions_items as a 
													INNER JOIN  dta_actions AS a1 ON (a1.tagcode=a.actions_tagcode 
															AND a1.repeatcounter=a.repeatcounter
															AND a1.repeatitemcounter=a.repeatitemcounter)
													left join type_operationtypes as b ON (b.tagcode=a.operation_type)
													left join type_prioritytypes as c ON (c.tagcode=a.priority_tagcode)
													left join type_gravitytypes as d ON (d.tagcode=a.gravity_tagcode)
												) AS x
												where 1=1"$												
			
	'where 1=1 and a.request_tagcode='R2019-0001' and a.task_tagcode='CHKLST_00001' and a.item_tagcode='TGGRP-011' and a.uniquekey='TGGRP-011'"$
	
	
	Public Const REQUESTS_GET_CURRENT_TASK_ITEMS As String =$"select distinct a.request_tagcode, a.action_tagcode, a.task_tagcode, a.item_tagcode, a.uniquekey, a.status,
					b.mandatory, b.critical, b.multi, b.repeat, b.on_report, b.info, b.title, b.parent, b.value_type, b.value_options, b.level, b.type from  requests_values as a 
					inner join tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.uniquekey=a.uniquekey) where 1=1"$
					
	Public Const REQUESTS_GET_CURRENT_TASK_ITEMS_V2 As String =$"select distinct a.request_tagcode, a.inner_request_tagcode, a.task_tagcode, a.item_tagcode, a.unique_key, 
					a.tagcode, a.execute_value, a.execute_value_title, a.execute_datetime, a.execute_longitude, a.execute_latitude, a.execute_notes, a.execute_action,
					b.position, b.level, b.parent_tagcode, b.item_type, b.points, b.risk, b.title, b.details, b.image, b.type_answer, b.typified_answers, 
					b.mandatory, b.critical, b.multiple, b.repeated, b.on_report, b.info, b.ta_jump_tagcode, b.defobj_tagcode, b.info_notes, b.asw_notes, 
					b.asw_as_task, a.repeated, a.repeatcounter, b.repeated as item_repeated, a.repeatitemcounter
					from  dta_requests_values as a 
					inner join dta_tasks_items as b on (b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode and b.unique_key=a.unique_key) where 1=1"$
					
					
	Public Const EVC_SQL_GETTASKITEMS As String = $"select distinct a.* from dta_tasks_items as a  where 1=1 "$
														
	Public Const EVC_SQL_GETREQUESTTASK_ITEMVALUE As String = $"select distinct a.* from  dta_requests_values as a where 1=1"$
	
	Public Const EVC_SQL_GETREQUEST_DATA_INFO As String = $"select distinct a.id, a.tagcode, a.reference, a.request_obs, a.details,
													ifnull(e.title, '') as typerequest_desc, IFNULL(g.title, '') AS task_desc,
													IFNULL(b.title_import, '') AS entity_desc, IFNULL(o.tagdesc, '') AS origin_desc,
													ifnull(c.address, '') as address, ifnull(c.address2, '') as address2,
													ifnull(c.postalcode, '') as postal_code, 
													ifnull(c.`local`, '') as city, ifnull(c.latitude, '') as latitude, 
													ifnull(c.longitude, '') as longitude
													from dta_requests_relations as z 
													inner join dta_requests as a on (a.tagcode=z.request_tagcode)
													inner join dta_objects as b on (b.tagcode=a.entity_tagcode)  
													left join dta_locations As c on (c.tagcode=a.local_tagcode)
													left join dta_typerequests as e on (e.tagcode=a.typerequest_tagcode)  
													left join dta_tasks as g on (g.tagcode= z.relation_tagcode)
													left join type_originstypes as o ON (o.tagcode=a.origin_tagcode)
													where 1=1 "$
	
	Public Const EVC_SQL_GET_TESK_ITEM_VALUE_EVENTS As String = $"SELECT DISTINCT event_tagcode,`position`,type_item,active,`value`,formula,have_formula,have_condition,
													have_status,is_jump,is_status,is_alert,is_email,is_more,is_foto,is_action,inc_object_contacts,
													team_tagcode,email_to,email_cc,use_internal_image,default_typerequest,resobsgrp_tagcode,add_entity_email,
													add_object_email,request_signature
													FROM dta_tasks_items_answers_events
													WHERE 1=1"$	
	
End Sub

Sub getSelectScriptField(script As String, field As String, position As Int, noZero As Boolean) As String
	Dim ret As String = ""	
	Dim Counter As Int = 0
	If (noZero = True) Then
		Counter = 1
	End If
	Dim record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
	Do While record.NextRow
		If (Counter = position) Then
			ret = Utils.IfNullOrEmpty(record.GetString(field), "")
			Exit
		End If
		Counter = Counter +1
	Loop
	record.Close
	Return ret
End Sub

Sub getRequestValuesValueFrom(request As String, action As String, task As String, item As String, uniquekey As String, field As String) As String
	Dim ret As String = ""
	Dim sSQL As String = $"${EVC_SQL_GETREQUESTTASK_ITEMVALUE}
				and a.request_tagcode='${request}' 
				and a.inner_request_tagcode='${action}' 
				and a.task_tagcode='${task}' 
				and a.item_tagcode='${item}' 
				and a.unique_key='${uniquekey}' 
				and a.execute_status=1
				and a.execute_value<>''"$
	Dim record As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While record.NextRow
		ret = Utils.IfNullOrEmpty(record.GetString(field), "")
		Exit
	Loop
	record.Close
	Return ret
End Sub

Sub getRequestInfo(request As String) As RequestInfo
	Dim ret As RequestInfo : ret.Initialize
	Dim Rows As Int = 0
	Dim sSQL As String = $"select entity_tagcode, object_tagcode, typerequest_tagcode, technical_tagcode, 
						team_tagcode, vehicle_tagcode, notes, route_tagcode, reference, details
						from dta_requests 
						where tagcode='${request}'"$
	Dim record As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While record.NextRow
		ret = Types.MakeRequestInfo(request, record.GetString("entity_tagcode"), record.GetString("object_tagcode"), _
						record.GetString("typerequest_tagcode"), record.GetString("technical_tagcode"), record.GetString("team_tagcode"), _
						record.GetString("vehicle_tagcode"), record.GetString("notes"), record.GetString("route_tagcode"), _
						record.GetString("reference"), record.GetString("details"))
		Rows = Rows + 1
	Loop
	If Rows = 0 Then
		ret = Types.MakeRequestInfoClear
	End If
	record.Close
	Return ret
End Sub

Sub DB2CLATaskItem(task As String, ukey As String) As CLATaskItem
	' EVC_SQL_GETTASKITEMS
	Dim ret As CLATaskItem
	ret.Initialize
	
	If Utils.NNE(task) And Utils.NNE(ukey) Then
		Dim sSQL As String = $"${EVC_SQL_GETTASKITEMS} and a.task_tagcode='${task}' and a.unique_key='${ukey}'"$
		Dim record As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
		Do While record.NextRow
			ret.task_tagcode = Utils.ifnullorempty(record.GetString("task_tagcode"), "")
			ret.item_tagcode = Utils.ifnullorempty(record.GetString("item_tagcode"), "")
			ret.unique_key = Utils.ifnullorempty(record.GetString("unique_key"), "")
			ret.position = record.GetInt("position")
			ret.level = record.GetInt("level")
			ret.parent_tagcode = Utils.ifnullorempty(record.GetString("parent_tagcode"), "")
			ret.item_type = record.GetInt("item_type")
			ret.points = record.GetInt("points")
			ret.risk = record.GetInt("risk")
			ret.data_type = record.GetInt("data_type")
			ret.bullet_master = record.GetInt("bullet_master")
			ret.bullet_child = record.GetInt("bullet_child")
			ret.type_answer = Utils.ifnullorempty(record.GetString("type_answer"), "")
			ret.typified_answers = record.GetInt("typified_answers")
			ret.mandatory = record.GetInt("mandatory")
			ret.critical = record.GetInt("critical")
			ret.repeated = record.GetInt("repeated")
			ret.multiple = record.GetInt("multiple")
			ret.on_report = record.GetInt("on_report")
			ret.has_signature = record.GetInt("has_signature")
			ret.has_articles = record.GetInt("has_articles")
			ret.type_nonconformity = Utils.ifnullorempty(record.GetString("type_nonconformity"), "")
			ret.ta_tagcode = Utils.ifnullorempty(record.GetString("ta_tagcode"), "")
			ret.ta_override_result = record.GetInt("ta_override_result")
			ret.ta_jump_tagcode = Utils.ifnullorempty(record.GetString("ta_jump_tagcode"), "")
			ret.defobj_tagcode = Utils.ifnullorempty(record.GetString("defobj_tagcode"), "")
			ret.info_notes = Utils.ifnullorempty(record.GetString("info_notes"), "")
			ret.asw_notes = Utils.ifnullorempty(record.GetString("asw_notes"), "")
			ret.validate_execution = record.GetInt("validate_execution")
			ret.cla_obs = Utils.ifnullorempty(record.GetString("cla_obs"), "")
			ret.force_signature = record.GetInt("force_signature")
			ret.force_picture = record.GetInt("force_picture")
			ret.force_time = record.GetInt("force_time")
			ret.type_time_control = record.GetInt("type_time_control")
			ret.time_run_anyway = record.GetInt("time_run_anyway")
			ret.dependent_key = Utils.ifnullorempty(record.GetString("dependent_key"), "")
			ret.time_duration = Utils.ifnullorempty(record.GetString("time_duration"), "")
			ret.force_control = record.GetString("force_control")
			ret.type_control = record.GetString("type_control")
			ret.control_run_anyway = record.GetString("control_run_anyway")
			ret.control_condition = Utils.ifnullorempty(record.GetString("control_condition"), "")
			ret.do_tagcode = Utils.ifnullorempty(record.GetString("do_tagcode"), "")
			ret.do_associate_type = record.GetString("do_associate_type")
			ret.do_object_image = Utils.ifnullorempty(record.GetString("do_object_image"), "")
			ret.reference = Utils.ifnullorempty(record.GetString("reference"), "")
			ret.do_subgroup = Utils.ifnullorempty(record.GetString("do_subgroup"), "")
			ret.do_subsubgroup = Utils.ifnullorempty(record.GetString("do_subsubgroup"), "")
			ret.do_affected_table = Utils.ifnullorempty(record.GetString("do_affected_table"), "")
			ret.do_affected_tagcode = Utils.ifnullorempty(record.GetString("do_affected_tagcode"), "")
			ret.do_affected_field = Utils.ifnullorempty(record.GetString("do_affected_field"), "")
			ret.change_title_totime = record.GetString("change_title_totime")
			ret.answer_change_title = record.GetString("answer_change_title")
			Exit
		Loop
		record.Close
	Else
		ret.task_tagcode = ""
		ret.item_tagcode = ""
		ret.unique_key = ""
		ret.position = 0
		ret.level = 0
		ret.parent_tagcode = ""
		ret.item_type = 0
		ret.points = 0
		ret.risk = 0
		ret.data_type = 0
		ret.bullet_master = 0
		ret.bullet_child = 0
		ret.type_answer = ""
		ret.typified_answers = 0
		ret.mandatory = 0
		ret.critical = 0
		ret.repeated = 0
		ret.multiple = 0
		ret.on_report = 0
		ret.has_signature = 0
		ret.has_articles = 0
		ret.type_nonconformity = ""
		ret.ta_tagcode = ""
		ret.ta_override_result = 0
		ret.ta_jump_tagcode = ""
		ret.defobj_tagcode = ""
		ret.info_notes = ""
		ret.asw_notes = ""
		ret.validate_execution = 0
		ret.cla_obs = ""
		ret.force_signature = 0
		ret.force_picture = 0
		ret.force_time = 0
		ret.type_time_control = 0
		ret.time_run_anyway = 0
		ret.dependent_key = ""
		ret.time_duration = ""
		ret.force_control = 0
		ret.type_control = 0
		ret.control_run_anyway = 0
		ret.control_condition = ""
		ret.do_tagcode = ""
		ret.do_associate_type = 0
		ret.do_object_image = ""
		ret.reference = ""
		ret.do_subgroup = ""
		ret.do_subsubgroup = ""
		ret.do_affected_table = ""
		ret.do_affected_tagcode = ""
		ret.do_affected_field = ""
		ret.change_title_totime = 0
		ret.answer_change_title = 0
	End If
	
	Return ret
End Sub


Sub EventRecord2CLAIEvent(record As ResultSet) As CLAIEvent
	Dim ret As CLAIEvent = Types.MakeCLAIEvent( record.GetString("event_tagcode"), _
	record.GetInt("position"), _
	record.GetInt("type_item"), _
	record.GetInt("active"), _
	record.GetString("value"), _
	record.GetString("formula"), _
	record.GetInt("have_formula"), _
	record.GetInt("have_condition"), _
	record.GetInt("have_status"), _
	record.GetInt("is_jump"), _
	record.GetInt("is_status"), _
	record.GetInt("is_alert"), _
	record.GetInt("is_email"), _
	record.GetInt("is_more"), _
	record.GetInt("is_foto"), _
	record.GetInt("is_action"), _
	record.GetInt("inc_object_contacts"), _
	record.GetString("team_tagcode"), _
	record.GetString("email_to"), _
	record.GetString("email_cc"), _
	record.GetInt("use_internal_image"), _
	record.GetString("default_typerequest"), _
	record.GetString("resobsgrp_tagcode"), _
	record.GetInt("add_entity_email"), _
	record.GetInt("add_object_email"), _
	record.GetInt("request_signature"))
	Return ret
End Sub

Sub SetUserTeamDate(Tagcode As String, datein As String, dateout As String) As String
	Dim lstString As String = ""
	If (Utils.Int2Bool(ShareCode.DEVICE_DEFAULT_ROUTE)) Then
		Dim sSQL As String  = $"SELECT a.team_tagcode as tagcode
								from dta_teams_routes_users AS a
								INNER JOIN dta_technicals AS b ON (b.user_tagcode=a.user_tagcode)
								WHERE b.tagcode='${Tagcode}' AND (a.date>='${datein}' and a.date<='${dateout}' AND a.active=1)"$
	Else
		Dim sSQL As String  = $"SELECT a.tagcode from dta_teams_relations AS a
								INNER JOIN dta_technicals AS b ON (b.tagcode=a.relation_tagcode)
								WHERE b.tagcode='${Tagcode}' AND a.active=1"$
	End If
	
'	Log(sSQL)
	Dim RecordTech As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While RecordTech.NextRow
		If Utils.NNE(lstString) Then lstString = $"${lstString},"$
		lstString = $"${lstString}'${RecordTech.GetString("tagcode")}'"$
	Loop
	If Utils.NNE(lstString) Then
		ShareCode.SESS_UserTeam = lstString
	End If
	Return lstString
End Sub

Sub SetUserRouteDate(Tagcode As String, datein As String, dateout As String) As String
	Dim lstString As String = ""	
	Dim sSQL As String  = $"SELECT route_tagcode as tagcode FROM dta_teams_routes WHERE team_tagcode IN (
												SELECT a.team_tagcode as tagcode
												from dta_teams_routes_users AS a
												INNER JOIN dta_technicals AS b ON (b.user_tagcode=a.user_tagcode)
												WHERE b.tagcode='${Tagcode}' AND (a.date>='${datein}' and a.date<='${dateout}' AND a.active=1))"$
'	Log(sSQL)
	Dim RecordTech As ResultSet = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While RecordTech.NextRow
	If Utils.NNE(lstString) Then lstString = $"${lstString},"$
		lstString = $"${lstString}'${RecordTech.GetString("tagcode")}'"$
	Loop
	If Utils.NNE(lstString) Then
		ShareCode.SESS_UserRoute = lstString
	End If
	Return lstString
End Sub

Sub RemoveRecsFromTable(tblName As String, tblKey As String, TblChildKey As String, Child_Id As String, FullkeyId As String) As ResumableSub
	
	If (Utils.NNE(tblName) And Utils.NNE(tblName) And Utils.NNE(FullkeyId)) Then
		
		Try
			If FullkeyId.Contains(";") Then
				Dim ListKeysChild As List = Regex.Split(";", FullkeyId)
				Dim keyId As String = ListKeysChild.Get(0)
				Dim ChildId As String = ListKeysChild.Get(1)
				If TblChildKey <> "" Then
					Starter.LocalSQLEVC.ExecNonQuery($"DELETE FROM ${tblName} WHERE ${tblKey}='${keyId}' and ${TblChildKey} = '${ChildId}'"$)
					Log($"DELETE FROM ${tblName} WHERE ${tblKey}='${keyId}' and ${TblChildKey} = '${ChildId}'"$)
				Else
					Starter.LocalSQLEVC.ExecNonQuery($"DELETE FROM ${tblName} WHERE ${tblKey}='${keyId}'"$)
					Log($"DELETE FROM ${tblName} WHERE ${tblKey}='${keyId}"$)
				End If
				
			Else
				Starter.LocalSQLEVC.ExecNonQuery($"DELETE FROM ${tblName} WHERE ${tblKey}='${FullkeyId}'"$)
				Log($"DELETE FROM ${tblName} WHERE ${tblKey}='${FullkeyId}'"$)
			End If
			
		Catch
			Log(LastException)
		End Try

	End If
		
	Return True
End Sub

Sub RemoveRecsFromTableBulk(tblName As String, tblKey As String, keyId As String) As ResumableSub
	
	If (Utils.NNE(tblName) And Utils.NNE(tblName) And Utils.NNE(keyId)) Then
		Dim sSQL As String = $"DELETE FROM ${tblName} WHERE ${tblKey} in ${keyId}"$
		Try
			Starter.LocalSQLEVC.ExecNonQuery(sSQL)
			Log(sSQL)
		Catch
			Log(LastException)
		End Try

	End If
	
	Return True
End Sub


Sub DeleteFromLocalDatabase
	Dim where As String = $"select distinct tagcode from dta_requests where execute_date>='${DateTime.Date(DateTime.Now)}' and execute_date<='${DateTime.Date(DateTime.Add(DateTime.Now,0,0,2))}'"$
	Log("DeleteFromLocalDatabase Where " & where)
	Dim Lista As List = GetListOfFromScriptEVC("tagcode", where)
	If (Lista.Size >=1)Then
		
		Dim request_tagcode As String = Utils.MakeFileName
		Dim ListaStr As String = Utils.StrList2SQLArray(Lista)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests where tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_values_images where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_values where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_signatures where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_relations where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_output_actions where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_output where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_objects where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_notes where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_fields where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_entities where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_documents where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_contacts where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_alerts where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_adds where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_relations_adds where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_values_adds where request_tagcode in ${ListaStr}"$, request_tagcode)
		Utils.SaveSQLToLog("DataUpdate",$"delete from dta_requests_values_images_adds where request_tagcode in ${ListaStr}"$, request_tagcode)
	End If
End Sub


Sub DeleteFromLocalDatabaseFromList(Lista As List)
	If (Lista.Size >=1)Then
		Log("Delete Tagcodes From dta_requests and sub ")
		Dim ListaStr As String = Utils.StrList2SQLArray(Lista)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_signatures where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output_actions where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_objects where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_notes where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_fields where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_entities where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_documents where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_contacts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_alerts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_adds where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations_adds where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_adds where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images_adds where request_tagcode in ${ListaStr}"$)
	End If
End Sub

Sub DeleteFromLocalDatabaseFromList2(Lista As List, action As String, repeatcounter As Int)
	If (Lista.Size >=1)Then
		Log("Delete Tagcodes From dta_requests and sub ")
		Dim ListaStr As String = Utils.StrList2SQLArray(Lista)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images where request_tagcode in ${ListaStr} and inner_request_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values where request_tagcode in ${ListaStr} and inner_request_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_signatures where request_tagcode in ${ListaStr} and inner_request_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations where request_tagcode in ${ListaStr} and relation_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images_adds where request_tagcode in ${ListaStr} and inner_request_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_adds where request_tagcode in ${ListaStr} and inner_request_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations_adds where request_tagcode in ${ListaStr} and relation_tagcode='${action}' and repeatcounter=${repeatcounter}"$)
	End If
End Sub

Sub DeleteFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	
	'Error occurred on line: 1072 (DBStructures)
	'android.database.sqlite.SQLiteException: no such column: _ (code 1 SQLITE_ERROR): , while compiling: delete from dta_requests where tagcode in (_)
		
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_requests and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_signatures where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output_actions where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_output where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_objects where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_notes where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_fields where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_entities where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_documents where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_contacts where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_alerts where request_tagcode in ${ListaStr}"$)
		
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_adds where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_relations_adds where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_adds where request_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_requests_values_images_adds where request_tagcode in ${ListaStr}"$)
	End If
	Return True
End Sub

Sub DeleteTasksFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_tasks and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_adds where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_documents where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_events where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_items where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_items_adds where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_items_answers where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_items_answers_events where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_obsnotes where task_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_tasks_routes where task_tagcode in ${ListaStr}"$)
	End If
	Return True
End Sub

Sub DeleteTPRequestsFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_typerequests and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_fields where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_reports where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_routes where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_tasks where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_tpr where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_signature where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_adds where typerequest_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_typerequests_tasks_adds where typerequest_tagcode in ${ListaStr}"$)
		
	End If
	Return True
End Sub

Sub DeleteObjectsFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	
	'Error occurred on line: 1147 (DBStructures)
	'android.database.sqlite.SQLiteException: no such column: _ (code 1 SQLITE_ERROR): , while compiling: delete from dta_objects where tagcode in (_)
	
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_objects and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_contacts where object_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_documents where object_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_fields where object_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_images where object_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_locations where object_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_warehouses where object_tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_objects_relations where parent_tagcode in ${ListaStr}"$)
	End If
	Return True
End Sub

Sub DeleteContactsFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	
	'Error occurred on line: 1147 (DBStructures)
	'android.database.sqlite.SQLiteException: no such column: _ (code 1 SQLITE_ERROR): , while compiling: delete from dta_objects where tagcode in (_)
	
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_contacts and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_contacts where tagcode in ${ListaStr}"$)
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_contacts_adds where object_tagcode in ${ListaStr}"$)
		
	End If
	Return True
End Sub

Sub DeleteLocationsFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	
	'Error occurred on line: 1147 (DBStructures)
	'android.database.sqlite.SQLiteException: no such column: _ (code 1 SQLITE_ERROR): , while compiling: delete from dta_objects where tagcode in (_)
	
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_locations and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_locations where tagcode in ${ListaStr}"$)

	End If
	Return True
End Sub

Sub DeleteWarehousesFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	
	'Error occurred on line: 1147 (DBStructures)
	'android.database.sqlite.SQLiteException: no such column: _ (code 1 SQLITE_ERROR): , while compiling: delete from dta_objects where tagcode in (_)
	
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_warehouses and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_warehouses where tagcode in ${ListaStr}"$)

	End If
	Return True
End Sub

Sub DeleteArticlesFromLocalDatabaseFromString(ListaStr As String) As ResumableSub
	
	'Error occurred on line: 1147 (DBStructures)
	'android.database.sqlite.SQLiteException: no such column: _ (code 1 SQLITE_ERROR): , while compiling: delete from dta_objects where tagcode in (_)
	
	If Utils.NNE(ListaStr) Then
		Log("Delete Tagcodes From dta_articles and sub ")
		If Not(ListaStr.StartsWith("(")) And Not(ListaStr.EndsWith(")")) Then
			ListaStr = $"(${ListaStr})"$
		End If
		
		Starter.LocalSQLEVC.ExecNonQuery($"delete from dta_articles where tagcode in ${ListaStr}"$)

	End If
	Return True
End Sub

Sub getParamState(Tagcode As String) As Int
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select value_state from dta_device_params where tagcode='${Tagcode}'"$)
	Do While Record.NextRow
		Ret = Record.GetInt("value_state")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub getParamStateField(Tagcode As String, Column As String) As String
	Private Ret As String = ""
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select ${Column} from dta_device_params where tagcode='${Tagcode}'"$)
	Do While Record.NextRow
		Ret = Record.GetString(Column)
		Exit
	Loop
	Record.Close
	Return Ret
End Sub


Sub getMainRequestStatus(Request As String) As Int
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select status_id from dta_requests where tagcode='${Request}'"$)
	Do While Record.NextRow
		Ret = Record.GetInt("status_id")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub getChildRequestStatus(Request As String, Action As String, Counter As Int) As Int
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"select status_id from dta_requests_relations where request_tagcode='${Request}'
					and relation_tagcode='${Action}' and repeatcounter=${Counter}"$)
	Do While Record.NextRow
		Ret = Record.GetInt("status_id")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub getITCTable(DBScript As String) As List
	Private Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"${DBScript}"$)
	Do While Record.NextRow
		Ret.Add( Types.MakeDB_ITC(Record.GetInt("id"), Record.Getstring("tagcode"), Record.GetString("tagdesc"), Record.GetString("color")) )
		'Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub getITCTablePos(DBScript As String, Tagcode As String) As Int
	Private n As Int = 0, Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"${DBScript}"$)
	Do While Record.NextRow
		Dim nTag As String = Utils.IfNullOrEmpty(Record.GetString("tagcode"), "")
		If (Utils.NNE(nTag)) Then
			If (nTag = Tagcode) Then
				Ret = n+1
				Exit
			End If
		End If
		n = n + 1
	Loop
	Record.Close
	Return Ret
End Sub

Sub getASStatus As List
	Return getITCTable(SQL_DATA_TYPE_ASSTATUS)
End Sub

Sub getPriority As List
	Return getITCTable(SQL_DATA_TYPE_PRIORITY)
End Sub

Sub getUrgency As List
	Return getITCTable(SQL_DATA_TYPE_URGENCY)
End Sub

Sub getASModes As List
	Return getITCTable(SQL_DATA_TYPE_ASMODES)
End Sub

Sub getASTypes As List
	If DBUtils.TableExists(Starter.LocalSQLEVC, "dta_actiontypes") Then
		Return getITCTable(SQL_DATA_TYPE_ASTYPES)
	Else
		Return Utils.MakeNullList
	End If
End Sub

Sub GetScriptCountEVC(Script As String) As Int
	Dim Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(Script)
	Do While Record.NextRow
		Ret = Ret + 1
	Loop
	Record.Close
	Return Ret
End Sub

Sub getTaskInfoTotal As Int
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"${EVC_SQL_GET_TASK_WITH_INFO_VAL}"$)
	Do While Record.NextRow
		Ret = Record.GetInt("total")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

'Sub getTaskRecordGroupItemsCount(Condition As String) As Int 
#if B4A
Sub getTaskRecordGroupItemsCount(Condition As String, Orientation As Int, isPhone As Boolean) As Int 
	Private Ret As Int = 0
	Private Record As Cursor
'	'Dim SSQL As String = $"${EVC_SQL_GET_TASK_RECHEIGTH_ITEMS} ${Condition}"$
''	Dim SSQL As String = $"${EVC_SQL_GET_TASK_RECHEIGTH_ITEMS_SUM} ${Condition}"$
''	Log(SSQL)

	Dim SSQL As String = $"select sum(a.height_land) as height_land, sum(a.height_port) as height_port,
													sum(a.height_land_sp) as height_land_sp, sum(a.height_port_sp) as height_port_sp,
													count(0) as total, 
													(SUM((select count(0) as v from  dta_tasks_items_answers as b where
															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode 
															and b.unique_key=a.unique_key))-count(0))*60 as totalitemsheight,
													case 
														when SUM((select count(0) as v from  dta_tasks_items_answers as b where
															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode 
															and b.unique_key=a.unique_key)) = 1 then 0
														when SUM((select count(0) as v from  dta_tasks_items_answers as b where
															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode 
															and b.unique_key=a.unique_key)) = 2 then 1*60
														when SUM((select count(0) as v from  dta_tasks_items_answers as b where
															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode 
															and b.unique_key=a.unique_key)) > 2 then (SUM((select count(0) as v from  dta_tasks_items_answers as b where
															b.task_tagcode=a.task_tagcode and b.item_tagcode=a.item_tagcode 
															and b.unique_key=a.unique_key))-2)*60
														else 0
													end as totalitemsheightcheck
													from dta_tasks_items as a where 1=1  ${Condition}"$
	Log( SSQL )
	Dim col_land As String = "height_land"
	Dim col_port As String = "height_port"
	Dim totalitemsheight As String = "totalitemsheight"
	If (isPhone) Then
		Dim col_land As String = "height_land_sp"
		Dim col_port As String = "height_port_sp"
	End If

	Record = Starter.LocalSQLEVC.ExecQuery(SSQL)
	If Record.RowCount > 0 Then
		Record.Position = 0
		If (Orientation = 0) Then
			Ret = Record.GetInt(col_land)
			If Not(isPhone) And Ret < 150 Then
				Ret = 150
			End If
		Else
			Ret = Record.GetInt(col_port)
		End If
		
		Dim vv As Int = Record.GetInt(totalitemsheight)
		If (isPhone) Then
			If Ret < 230 Then Ret = 230
			Ret = Ret + vv
		End If
	End If
	Record.Close
	Log($"Tamanho de pergunta ${Ret}"$)
	Return Ret
End Sub
#else
Sub getTaskRecordGroupItemsCount(Condition As String, Orientation As Int) As Int
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"${EVC_SQL_GET_TASK_RECHEIGTH_ITEMS_SUM} ${Condition}"$)
	Do While Record.NextRow
		If (Orientation = 0) Then
			Ret = Record.GetInt("height_land")
		Else
			Ret = Record.GetInt("height_port")
		End If
		Exit
	Loop
	Record.Close
	Return Ret
End Sub
#end if


Sub getTaskRecordGroupHeight_VAL(Condition As String, v1 As Int, v2 As Int) As Int
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"${EVC_SQL_GET_TASK_RECHEIGTH_VAL.Replace(":V1", v1).Replace(":V2", v2)} ${Condition}"$)
	Do While Record.NextRow
		Ret = Record.GetInt("items")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub getCurrentConfigValues As ResumableSub
	'Sleep(100)
	Private Record As ResultSet = Starter.LocalSQLWRK.ExecQuery(SQL_GETCONFIG_DATA)
	Do While Record.NextRow
		ShareCode.APP_Instance = Utils.IfNullOrEmpty(Record.GetString("instance"), "")
		ShareCode.APP_Authorization = Utils.IfNullOrEmpty(Record.GetString("authorization"), "")
		'ShareCode.APP_Version = Record.GetString("version")
		'ShareCode.APP_VersionID = Record.GetInt("versionid")
		Dim APIs As String = Utils.IfNullOrEmpty(Record.GetString("api"), "")
		'ShareCode.APP_URL = Record.GetString("api")
		ShareCode.APP_DOMAIN = Utils.IfNullOrEmpty(Record.GetString("subdomain"), "")
		ShareCode.APPL_CONFIRMED = Record.GetInt("confirmed")
		ShareCode.APP_TOKEN = Utils.IfNullOrEmpty(Record.GetString("token"), "")
		'ShareCode.DEVICE_ORIENTATION = Record.GetInt("orientation")
		ShareCode.APP_URL  = "https://" & ShareCode.APP_DOMAIN & "." & APIs '".${ShareCode.APPL_HOST}/api/"
		Exit
	Loop
	Record.Close
	Return True
End Sub

Sub getConfigValuesExists As Boolean
	Private Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLWRK.ExecQuery(SQL_GETCONFIG_DATA)
	Do While Record.NextRow
		Ret = Ret + 1
		Exit
	Loop
	Record.Close
	Dim exists As Boolean = Ret > 0
	Return exists
End Sub

Sub getConfigApp(Token As String)
	If (Utils.isNullOrEmpty(Token)) Then
		Token = "DEFAULT_"
	End If
	Private Record As ResultSet = Starter.LocalSQL.ExecQuery($"select * from config_appl where tagcode='${Token}'"$)
	Do While Record.NextRow
		Dim c1 As Int = Record.GetInt("colormain")
		Dim c2 As Int = Record.GetInt("colorsub")
		If (c1 > 0) Then Consts.ColorMain = c1
		If (c2 > 0) Then Consts.ColorSub = c2
		Exit
	Loop
	Record.Close
End Sub

Sub updateConfigApp(Token As String)
	Dim sqlScript As String = $"update config_appl set colormain=${Consts.ColorMain}, colorsub=${Consts.ColorSub} where tagcode='${Token}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub getDBObjectTypeEVC(Tagcode As String) As ObjectType
	Dim ret As ObjectType = Types.MakeObjectType("", "", "", 0, 0, 0, 0, 0, "")
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"Select distinct * from dta_objecttypes
									where tagcode IN (SELECT DISTINCT object_type FROM dta_objects WHERE tagcode='${Tagcode}')"$)
	Do While Record.NextRow
		ret = Types.MakeObjectType(Record.GetString("tagcode"), _
				Record.GetString("title"), _
				"GREEN", _
				Record.GetInt("have_contracts"), _
				Record.GetInt("have_warehouses"), _
				Record.GetInt("have_documents"), _
				Record.GetInt("isgroup"), _
				Record.GetInt("documents_template"), _
				"")
		Exit
	Loop
	Record.Close
	Return ret
End Sub

Sub GetListOfDayPeriodTypesEVC As List  '
	Dim Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(EVC_SQL_DAYPERIOD_TYPE)
	Do While Record.NextRow
		Ret.Add(Record.GetString("tagdesc"))
	Loop
	Record.Close
	Return Ret
End Sub 

Sub GetListOfPeriodicityTypesEVC As List
	Dim Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(EVC_SQL_PERIODICITY_TYPE)
	Do While Record.NextRow
		Ret.Add(Record.GetString("tagdesc"))
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetListOfObjectsTypesEVC(incAll As Boolean) As List
	Dim Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(EVC_SQL_CURRENT_OBJECTS_TYPE)
	If (incAll) Then
		Ret.Add(Types.MakeObjectTypes(0, "","(Todos)"))
	End If
	
	Do While Record.NextRow
		Ret.Add(Types.MakeObjectTypes(Record.GetInt("id"), Record.GetString("tagcode"),Record.GetString("title")))
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetListOfContactTypesEVC As List
	Dim Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(EVC_SQL_CURRENT_CONTACT_TYPES)
	Do While Record.NextRow
		Ret.Add(Record.GetString("tagdesc"))
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetListOfAddresseTypesEVC As List
	Dim Ret As List
	Ret.Initialize
	Ret.Add("Geral")
	Return Ret
End Sub

Sub GetListOfLocalEVC As List 
	Dim Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(EVC_SQL_CURRENT_OBJECTS_LOCAL)
	Do While Record.NextRow
		Ret.Add(Record.GetString("city"))
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetListOfFromScript(field As String, script As String) As List
	Dim Ret As List
	Ret.Initialize
	Private Row As Int = 0
	Private Record As Cursor
	If Not(Utils.isNull(script)) Then
		'where = $"where ${where}"$
	
		Record = Starter.LocalSQL.ExecQuery(script)
		If Record.RowCount > 0 Then
			For Row = 0 To Record.RowCount-1
				Record.Position = Row
				Ret.Add(Record.GetString(field))
			Next
		End If
		Record.Close
	End If
	Return Ret
End Sub

Sub GetListOfFromScriptEVC(field As String, script As String) As List
	Dim Ret As List : Ret.Initialize
	If Not(Utils.isNull(script)) Then
		Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
		Do While Record.NextRow
			Ret.Add(Record.GetString(field))
		Loop
		Record.Close
	End If
	Return Ret
End Sub

Sub GetListOfFromScriptCNLEVC(fieldCode As String, fieldName As String, script As String) As List 'CodeNameList
	Dim Ret As List : Ret.Initialize
	If Not(Utils.isNull(script)) Then
		Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
		Do While Record.NextRow
			Dim CNL As CodeNameList = Types.MakeCodeNameList(Record.GetString(fieldCode), Record.GetString(fieldName))
			Ret.Add(CNL)
		Loop
		Record.Close
	End If
	Return Ret
End Sub


Sub GetListOfFromEVC(fromtable As String, field As String) As List
	Dim Ret As List : Ret.Initialize
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"Select ${field} from ${fromtable}"$)
	Do While Record.NextRow
		Ret.Add(Record.GetString(field))
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetEVCIDFrom(table As String, field As String, value As String) As Int
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery($"Select id from ${table} where ${field}='${value}'"$)
	Dim ret As Int = 0
	Do While Record.NextRow
		ret = Record.GetInt("id")
		Exit
	Loop
	Record.Close
	Return ret
End Sub

Sub GetIDFrom(table As String, field As String, value As String) As Int
	Private Record As ResultSet = Starter.LocalSQL.ExecQuery($"Select id from ${table} where ${field}='${value}'"$)
	Dim ret As Int = 0
	Do While Record.NextRow
		ret = Record.GetInt("id")
		Exit
	Loop
	Record.Close
	Return ret
End Sub

Sub getNotifyUserStock As Int
	Private Record As ResultSet = Starter.LocalSQL.ExecQuery($"select * from warehouses_items where qtd=0 and warehouse='${ShareCode.SESS_WareHouse}'"$)
	Dim ret As Int = 0
	Do While Record.NextRow
		ret = ret + 1
	Loop
	Record.Close
	Return ret
End Sub

Sub updateNotifyUserStock(code As String, qtd As Int, warehouse As String)
	Starter.LocalSQLEVC.ExecNonQuery($"update dta_warehouses_articles set qtd=${qtd} where article_tagcode='${code}' and warehouse_tagcode = '${warehouse}'"$)
End Sub

Sub updateUserAvailableState(code As String, state As Int)
'	Dim ssql As String = $"update user set available=${state} where tagcode='${code}'"$
'	Log(ssql)
'	Starter.LocalSQL.ExecNonQuery(ssql)
End Sub

Sub insertUserUnavailable(code As String, startDate As String, endDate As String, reason As String)
'	DateTime.DateFormat = "yyyy-MM-dd"
'	DateTime.TimeFormat = "HH:mm:ss"
'	Dim CurrDateTime As String = $"$date{DateTime.Now} $time{DateTime.Now}"$
'	Dim sqlScript As String = $"insert into userexits (tagcode, datetime, reason, valid_from, valid_to, active) values ('${code}', '${CurrDateTime}', '${reason}', '${startDate}', '${endDate}', 1)"$
'	Log(sqlScript)
'	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub CheckWorkingDayTasks
	Dim SQL As String = $"select * from userinnertasks where ukey='${ShareCode.SESS_UWDUKEY}' and tagcode='${ShareCode.SESS_User}'"$
	Private Record As ResultSet = Starter.LocalSQL.ExecQuery(SQL)
	Dim ret As Int = 0
	Do While Record.NextRow
		ShareCode.UWDUKEY_DETAILS = Record.GetInt("status")
		ShareCode.UWDUKEY_PRODUCTS = Record.GetInt("prodcheck")
		ret = 1
		Exit
	Loop

	If ret = 0 Then
		CreateWorkingDayTask(ShareCode.SESS_User, ShareCode.SESS_UWDUKEY, 0)
		ShareCode.UWDUKEY_DETAILS = 0
		ShareCode.UWDUKEY_PRODUCTS = 0
	End If
	Record.Close
#if B4A
	CallSub(MainMenu, "BadgeCheckUpdate")
#end if
End Sub

Sub CreateWorkingDayTask(userTagcode As String, uniqueKey As String, Status As Int)
	DateTime.DateFormat = "yyyy-MM-dd"
	DateTime.TimeFormat = "HH:mm:ss"
	Dim CurrDateTime As String = $"$date{DateTime.Now} $time{DateTime.Now}"$
	Dim sqlScript As String = $"insert into userinnertasks (tagcode, datetime, ukey, status, prodcheck) values ('${userTagcode}', '${CurrDateTime}', '${uniqueKey}', '${Status}', 0)"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub insertUserEquipment(userTagcode As String, equipTagcode As String)
	'CREATE TABLE equipment2user (user_tagcode TEXT , equipment_tagcode TEXT, state INTEGER, PRIMARY KEY (user_tagcode, equipment_tagcode))
	'Dim sqlScript As String = $"insert into equipment2user (user_tagcode, equipment_tagcode, state) values ('${userTagcode}', '${equipTagcode}', 1)"$
	Dim newID As Int = GetMaxOfEVC("dta_equipments_technicals","id","")
	Dim sqlScript As String = $"insert into dta_equipments_technicals ( id, equipment_tagcode, technical_tagcode, active) values (${newID+1}, '${equipTagcode}', '${userTagcode}', 1)"$
	
	Utils.SaveSQLToLog("insertUserEquipment",sqlScript, "")
	'Starter.LocalSQLEVC.ExecNonQuery(sqlScript)
End Sub

Sub deleteUserEquipment(userTagcode As String, equipTagcode As String)
	'CREATE TABLE equipment2user (user_tagcode TEXT , equipment_tagcode TEXT, state INTEGER, PRIMARY KEY (user_tagcode, equipment_tagcode))
	Dim sqlScript As String = $"delete from dta_equipments_technicals where technical_tagcode='${userTagcode}' and equipment_tagcode='${equipTagcode}'"$
	Utils.SaveSQLToLog("deleteUserEquipment",sqlScript, "")
	'Starter.LocalSQLEVC.ExecNonQuery(sqlScript)
End Sub

Sub updateUserEquipment(userTagcode As String, equipTagcode As String, oldequitagcode As String)
	Dim sqlScript As String = $"update dta_equipments_technicals set equipment_tagcode='${equipTagcode}' where technical_tagcode='${userTagcode}' and  equipment_tagcode='${oldequitagcode}'"$
	Utils.SaveSQLToLog("updateUserEquipment",sqlScript, "")
	'Starter.LocalSQLEVC.ExecNonQuery(sqlScript)
End Sub

Sub updateUserVehicle(tagcode As String, objTagcode As String)
	Dim sqlScript As String = $"update dta_technicals set vehicle_tagcode='${objTagcode}' where tagcode='${tagcode}'"$
	Utils.SaveSQLToLog("updateUserVehicle",sqlScript, "")
	'Starter.LocalSQLEVC.ExecNonQuery(sqlScript)
End Sub


Sub UpdateOrCreateWorkDayProduct(UniqueWorkingDayID As String, productTagcode As String, productStatus As Int, notes As String)
	Private Record As ResultSet = Starter.LocalSQL.ExecQuery($"select * from userinnertasksnolines where ukey='${UniqueWorkingDayID}' and product_tagcode='${productTagcode}'"$)
	Dim ret As Int = 0
	Do While Record.NextRow
		ret = ret + 1
	Loop
	Record.Close
	
	If (ret >=1 ) Then
		Dim sqlScript As String = $"update userinnertasksnolines set status=${productStatus}, notes='${notes}' where ukey='${UniqueWorkingDayID}' and product_tagcode='${productTagcode}'"$
		Starter.LocalSQL.ExecNonQuery(sqlScript)
	Else
		Dim sqlScript As String = $"insert into  userinnertasksnolines (tagcode, ukey, product_tagcode, status, notes) values('${ShareCode.SESS_User}', '${UniqueWorkingDayID}', '${productTagcode}', ${productStatus}, '${notes}')"$
		Starter.LocalSQL.ExecNonQuery(sqlScript)
	End If
End Sub

Sub UpdateWorkingDayStatus(ukey As String, uuser As String, ustatus As Int, uproduct As Int)
	Dim sqlScript As String = $"update userinnertasks set status=${ustatus}, prodcheck=${uproduct} where ukey='${ukey}' and tagcode='${uuser}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
	ShareCode.UWDUKEY_DETAILS = ustatus
	ShareCode.UWDUKEY_PRODUCTS = uproduct
End Sub

#if B4i
Sub UpdateAddress(entity As String, local As String, adrs As AddressType)
#else
Sub UpdateAddress(entity As String, local As String, adrs As Address)
#end if
	Dim sqlScript As String = $"update locals set address='${adrs.AddressName}', address2='${adrs.AddressName2}', postal_code='${adrs.AddressPostalCode}', city='${adrs.AddressCity}', latitude='${adrs.AddressLatitude}', longitude='${adrs.AddressLongitude}' where tagcode='${local}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
	Dim sqlScript As String = $"update locals2entities set localtype=${adrs.AddressType+1} where entity='${entity}' and locality='${local}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

#if B4i
Sub InsertAddress(entity As String, local As String, adrs As AddressType)
#else
Sub InsertAddress(entity As String, local As String, adrs As Address)
#end if

	Dim sqlScript As String = $"insert into locals (ascbus, tagcode, address_tagcode, address, address2, postal_code, city, latitude, longitude) values (1, '${local}', '${local}', '${adrs.AddressName}', '${adrs.AddressName2}', '${adrs.AddressPostalCode}', '${adrs.AddressCity}', '${adrs.AddressLatitude}', '${adrs.AddressLongitude}')"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
	Dim sqlScript As String = $"insert into locals2entities (entity, locality, localtype) values ('${entity}', '${local}', ${adrs.AddressType+1})"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub UpdateAddressGeoReference(entity As String, local As String, geo As GeoReference)
	Dim sqlScript As String = $"update locals set latitude='${geo.Latitude}', longitude='${geo.Longitude}' where tagcode='${local}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub UpdateContact(cnt As ContactRecord)
	Dim sqlScript As String = $"update contacts set type=${cnt.contactType}, name='${cnt.contactName}', phone='${cnt.contactPhone}', email='${cnt.contactEmail}', title='${cnt.contactTitle}' where tagcode='${cnt.tagcode}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub UpdateEntityProperty(entity As String, property As String, value As String)
	Dim sqlScript As String = $"update props2entities set value='${value}' where entity='${entity}' and property='${property}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub InsertEntityProperty(entity As String, property As String, value As String)
	Dim sqlScript As String = $"insert into props2entities (entity, property, value) values ('${entity}', '${property}', '${value}')"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub UpdateObjectProperty(sobject As String, property As String, value As String)
	Dim sqlScript As String = $"update props2objects set value='${value}' where object='${sobject}' and property='${property}'"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub InsertObjectProperty(sobject As String, property As String, value As String)
	Dim sqlScript As String = $"insert into props2objects (object, property, value) values ('${sobject}', '${property}', '${value}')"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub InsertWorkingFiles(sUser As String, tagcode As String, filename As String, folder As String, dtime As String, latitude As String, longitude As String)
	Dim sqlScript As String = $"INSERT INTO workingfiles ( ascbus, usertagcode, tagcode, folder, filename, datetime, latitude, longitude) VALUES (1,'${sUser}','${tagcode}','${folder}','${filename}','${dtime}','${latitude}','${longitude}');"$
	Starter.LocalSQL.ExecNonQuery(sqlScript)
End Sub

Sub GetCountOf(Table As String, Condition As String) As Int
	Dim Ret As Int = 0
	Dim SQL As String = $"select count(0) as Total from ${Table} where 1=1 ${Condition}"$
	
	Private Record As ResultSet = Starter.LocalSQL.ExecQuery(SQL)
	Do While Record.NextRow
		Ret = Record.GetInt("Total")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetCountOfEVC(Table As String, Condition As String) As Int
	Dim Ret As Int = 0
	Dim SQL As String = $"select count(0) as Total from ${Table} where 1=1 ${Condition}"$
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(SQL)
	Do While Record.NextRow
		Ret = Record.GetInt("Total")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetMaxOfEVC(Table As String, field As String, Condition As String) As Int
	Dim Ret As Int = 0
	Dim SQL As String = $"select max(${field}) as Maxi from ${Table} where 1=1 ${Condition}"$
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(SQL)
	Do While Record.NextRow
		Ret = Record.GetInt("Maxi")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetScriptCountWRK(Script As String) As Int
	Dim Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLWRK.ExecQuery(Script)
	Do While Record.NextRow
		Ret = Ret +1
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetScriptColumnDoubleEVC(script As String, column As String) As Double
	Dim Ret As Double = 0.00
	'Private Record As Cursor = Starter.LocalSQLEVC.ExecQuery(script)
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
	Do While Record.NextRow
		Try
			Ret = Record.GetDouble(column)
		Catch
			Ret = 0.00
		End Try
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetScriptColumnIntEVC(script As String, column As String) As Int
	Dim Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
'	Log(script)
	Do While Record.NextRow
		Ret = Record.GetInt(column)
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetScriptColumnIntWRK(script As String, column As String) As Int
	Dim Ret As Int = 0
	Private Record As ResultSet = Starter.LocalSQLWRK.ExecQuery(script)
'	Log(script)
	Do While Record.NextRow
		Ret = Record.GetInt(column)
		Exit
	Loop
	Record.Close
	Return Ret
End Sub


Sub GetScriptColumnStrEVC(script As String, column As String) As String
	Dim Ret As String = ""
	Try
		Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
		Do While Record.NextRow
			Ret = Record.GetString(column)
			Exit
		Loop
		Record.Close
	Catch
		Log(LastException)
	End Try
	Return Ret
End Sub


Sub GetScriptColumnStrEVCLSTMAP(script As String, column As String, lst As List) As String
	Dim Ret As String = ""
	For n=0 To lst.Size-1
		Dim mmm As Map = lst.Get(n)
		script = script.Replace(mmm.Get(0), mmm.Get(1))
	Next
	Private Record As ResultSet = Starter.LocalSQLEVC.ExecQuery(script)
	Do While Record.NextRow
		Ret = Record.GetString(column)
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub GetScriptColumnStrEVCJSON(script As String, column As String, jsoncolumn As String) As String
	Dim Ret As String = ""
	Dim Paramters As String = GetScriptColumnStrEVC(script, column)
	If Utils.NNE(Paramters) Then
		Dim JSON1 As JSONParser
		Dim ContinuaJSON As Boolean = True
		Try
			JSON1.Initialize(Paramters)
			Dim MapJSON As Map = JSON1.NextObject
		Catch
			Log(LastException)
			ContinuaJSON = False
		End Try

		If (ContinuaJSON) Then
			Ret = Utils.IfNullOrEmpty(MapJSON.Get(jsoncolumn), Ret)
		End If
	
	End If
	Return Ret
End Sub

Sub GetScriptColumnStrEVCJSONMAP(script As String, column As String) As Map
	Dim Ret As Map : Ret.initialize
	Dim Paramters As String = GetScriptColumnStrEVC(script, column)
	If Utils.NNE(Paramters) Then
		Dim JSON1 As JSONParser
		Dim ContinuaJSON As Boolean = True
		Try
			JSON1.Initialize(Paramters)
			Dim Ret As Map = JSON1.NextObject
		Catch
			Log(LastException)
		End Try
	End If
	Return Ret
End Sub

Sub InsertRequestAS(clai As RequestCLAItem, asTagcode As String, status As Int, priority As Int, urgency As Int, _
		assign As Int, details As String, emails As String, emsent As Boolean, due_date As String) As String
		
'		
'	`id` INT(10) UNSIGNED Not Null AUTO_INCREMENT,
'	`actions_tagcode` VARCHAR(50) Not Null COMMENT '(Vindo da execução)',
'	`operation_type` VARCHAR(50) Null DEFAULT Null COMMENT '(Novo, Seguimento, Fecho)',
'	`typerequest_type` VARCHAR(50) Null DEFAULT Null COMMENT 'Tipo de Intervenção seguinte',
'	`details` VARCHAR(500) Null DEFAULT Null,
'	`priority_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`gravity_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`team_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`technical_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`commercial_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`close_date` DateTime Null DEFAULT Null,
'	`due_date` DateTime Null DEFAULT Null,
'	`send_email` TINYINT(4) Not Null DEFAULT '0',
'	`email_sent` TINYINT(4) Not Null DEFAULT '0',
'	`email_to` VARCHAR(200) Null DEFAULT Null,
'	`email_cc` VARCHAR(200) Null DEFAULT Null,
'	`sid_id` INT(11) Not Null DEFAULT '0',
'	`cbr_id` INT(11) Not Null DEFAULT '0' COMMENT 'Company, Business Root',
'	`created_at` TIMESTAMP Null DEFAULT Null,
'	`updated_at` TIMESTAMP Null DEFAULT Null,
'	`active` TINYINT(4) Not Null DEFAULT '1',
		
	Dim NewID As Int =  GetCountOf("requests_actions_history", $" and request_tagcode='${clai.Request}' and tagcode='${asTagcode}'"$ ) + 1
	Dim newAS As Boolean = False
	If (asTagcode = "") Then 
		asTagcode = Utils.GenerateTagcode("AS0")
		newAS = True
	End If
	Dim actiondatetime As String = Utils.GetCurrDatetime
	Dim emailsentdate As String = ""
	If (emsent) Then emailsentdate = actiondatetime
	
'	
'	`id` INT(10) UNSIGNED Not Null AUTO_INCREMENT,
'	`tagcode` VARCHAR(50) Not Null DEFAULT 'ALERTINF_' COMMENT '(Vindo da execução)',
'	`request_tagcode` VARCHAR(50) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`action_tagcode` VARCHAR(50) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`task_tagcode` VARCHAR(50) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`item_tagcode` VARCHAR(50) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`uniquekey` VARCHAR(50) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`iu_tagcode` VARCHAR(50) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`internal` INT(11) Not Null DEFAULT '0' COMMENT '(Vindo da execução)',
'	`title` VARCHAR(100) Null DEFAULT Null COMMENT '(Vindo da execução)',
'	`operation_type` VARCHAR(50) Null DEFAULT Null COMMENT '(Novo, Seguimento, Fecho)',
'	`typerequest_type` VARCHAR(50) Null DEFAULT Null COMMENT 'Tipo de Intervenção seguinte',
'	`details` VARCHAR(500) Null DEFAULT Null,
'	`priority_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`gravity_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`team_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`technical_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`commercial_tagcode` VARCHAR(50) Null DEFAULT Null,
'	`close_date` DateTime Null DEFAULT Null,
'	`due_date` DateTime Null DEFAULT Null,
'	`send_email` TINYINT(4) Not Null DEFAULT '0',
'	`email_sent` TINYINT(4) Not Null DEFAULT '0',
'	`email_to` VARCHAR(200) Null DEFAULT Null,
'	`email_cc` VARCHAR(200) Null DEFAULT Null,
'	`sid_id` INT(11) Not Null DEFAULT '0',
'	`cbr_id` INT(11) Not Null DEFAULT '0' COMMENT 'Company, Business Root',
'	`created_at` TIMESTAMP Null DEFAULT Null,
'	`updated_at` TIMESTAMP Null DEFAULT Null,
'	`active` TINYINT(4) Not Null DEFAULT '1',
'	
'	
	
	Dim ssqlScript As String = $"INSERT INTO requests_actions_history (id, request_tagcode, action_tagcode, task_tagcode,
		item_tagcode, uniquekey, iu_tagcode, tagcode, posis, status, details, actiondatetime, assigned_to, assigned_type, 
		email_datetime, email_sent, email_to, priority, related_task, take_action, title, urgency, user_tagcode, repeatcounter, 
		repeatitemcounter, due_date) values 
		(${NewID}, '${clai.Request}', '${clai.Action}', '${clai.Task}', '${clai.Item}', '${clai.UniqueKey}', '${clai.Tagcode}', '${asTagcode}', 0, 
		${status}, '${details}', '${actiondatetime}', 'USR_PALPEDRINHA', 0, '${emailsentdate}', 
		${Utils.Bool2Int(emsent)}, '${emails}', ${priority}, '', '', '${clai.Title}', ${urgency}, 'USR_PALPEDRINHA', 
		${clai.RepeatCounter}, ${clai.RepeatItemCounter}, '${due_date}')"$
	Log(ssqlScript) 
	Try
		Starter.LocalSQL.ExecNonQuery(ssqlScript)
	Catch
		Log(LastException)
	End Try
	
	If (newAS) Then
		Dim NewID As Int =  GetCountOf("requests_actions", $" and request_tagcode='${clai.Request}' and tagcode='${asTagcode}'"$ ) + 1
		ssqlScript = $"INSERT INTO requests_actions (id, request_tagcode, action_tagcode, task_tagcode,
			item_tagcode, uniquekey, iu_tagcode, tagcode, posis, status, details, actiondatetime, assigned_to, assigned_type, 
			email_datetime, email_sent, email_to, priority, related_task, take_action, title, urgency, user_tagcode, repeatcounter, 
			repeatitemcounter,due_date) values 
			(${NewID}, '${clai.Request}', '${clai.Action}', '${clai.Task}', '${clai.Item}', '${clai.UniqueKey}', '${clai.Tagcode}', '${asTagcode}', 0, 
			${status}, '${details}', '${actiondatetime}', 'USR_PALPEDRINHA', 0, '${emailsentdate}', 
			${Utils.Bool2Int(emsent)}, '${emails}', ${priority}, '', '', '${clai.Title}', ${urgency}, 'USR_PALPEDRINHA', 
			${clai.RepeatCounter}, ${clai.RepeatItemCounter}, '${due_date}')"$
		Try
			Starter.LocalSQL.ExecNonQuery(ssqlScript)
		Catch
			Log(LastException)
		End Try
	End If
	
'	Dim params As Map
'	params.Initialize
'	params.Clear
'	params.Put("_token", ShareCode.APP_TOKEN)
'	params.Put("ACLARequest", clai.Request)
'	params.Put("ACLAAction", clai.Action)
'	params.Put("ACLATask", clai.Task)
'	params.Put("ACLAItem", clai.Item)
'	params.Put("ACLAUniqueKey", clai.UniqueKey)
'	params.Put("ACLAExecuteAction", asTagcode)
'
'	Utils.CallApi(0, params, activ, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/as/update"$)
'
'	Dim params As Map
'	params.Initialize
'	params.Clear
'	params.Put("_token", ShareCode.APP_TOKEN)
'	params.Put("ASRequest", clai.Request)
'	params.Put("ASAction", clai.Action)
'	params.Put("ASTask", clai.Task)
'	params.Put("ASItem", clai.Item)
'	params.Put("ASUniqueKey", clai.UniqueKey)
'	params.Put("ASUITagcode", asTagcode)
'	params.Put("ASTagcode", asTagcode)
'	params.Put("ASTitle", asTagcode)
'	params.Put("ASDetails", asTagcode)
'	params.Put("ASPriority", Utils.getASPriority(priority))
'	params.Put("ASUrgency", Utils.getASUrgency(urgency))
'	params.Put("ASAssigned", ShareCode.SESS_OPER_User)
'	params.Put("ASAssignedType", 0)
'	params.Put("ASStatus", Utils.getASStatus(status))
'	params.Put("ASEmailDatetime", emailsentdate)
'	params.Put("ASEmailSent", Utils.Bool2Int(emsent))
'	params.Put("ASEmailTo", emails)
'	params.Put("ASEmailRelatedTask", "")
'	params.Put("ASEmailRelatedAction", "")
'
'	Utils.CallApi(0, params, activ, $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/clai-more/as/insert"$)
'	
	Return asTagcode
End Sub

Sub InsertRequestASEVC(asTagcode As String, Request As String, Action As String, Task As String, Item As String, UniqueKey As String, _
					Tagcode As String, dlgASSubject As String, dlgASDetails As String, dlgASPriority As String, _
					dlgASUrgency As String, SESS_OPER_User As String, _
					dlgASStatus As String, emailsentdate As String, EmailSentOnNewAS As String, _
					dlgASEmails As String, dlgASDueDate As String, _
					repeatcounter As Int, repeatitemcounter As Int, repeatfieldcounter As Int, DateTimecreation As String, _
					tagcodeTPA As String, groupTPA As String, obs As String, sendTheEmail As Int) As String
					
	Dim NewID As Int =  GetMaxOfEVC("dta_actions", "id", "" ) + 2
	Dim ssql As String = $"INSERT INTO dta_actions (id,tagcode,request_tagcode,action_tagcode,task_tagcode,item_tagcode,uniquekey,iu_tagcode,
				internal,title,operation_type,details,priority_tagcode,gravity_tagcode,technical_tagcode,due_date,
				send_email,email_sent,email_to,email_cc,active, 
				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at, created_at)
				values
				('${NewID}','${asTagcode}','${Request}','${Action}','${Task}', '${Item}','${UniqueKey}', '${Tagcode}',
				'1','${dlgASSubject}','${dlgASStatus}','${dlgASDetails}','${dlgASPriority}','${dlgASUrgency}','${SESS_OPER_User}','${dlgASDueDate}',
				${sendTheEmail},${sendTheEmail},'${dlgASEmails}','',1, ${repeatcounter}, ${repeatitemcounter}, ${repeatfieldcounter}, 
				'${DateTimecreation}', '${DateTimecreation}')"$
	Try
		'Starter.LocalSQLEVC.ExecNonQuery(ssql)
		Utils.SaveSQLToLog("NewAS",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try
				
	Dim NewID As Int =  GetMaxOfEVC("dta_actions_items", "id", "" ) + 2
	Dim ssql As String = $"INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,
				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,
				send_email,email_sent,email_to,active, 
				repeatcounter, repeatitemcounter, repeatfieldcounter)
				values
				('${NewID}','${asTagcode}','${dlgASStatus}','${dlgASDetails}','${dlgASPriority}','${dlgASUrgency}','${SESS_OPER_User}',
				'${dlgASDueDate}',
				${sendTheEmail},${sendTheEmail},'${dlgASEmails}',1, ${repeatcounter}, ${repeatitemcounter}, ${repeatfieldcounter})"$

	Try
		'Starter.LocalSQLEVC.ExecNonQuery(ssql)
		Utils.SaveSQLToLog("NewASItem",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try
	
	If (DBUtils.TableExists(Starter.LocalSQLEVC, "dta_actions_adds")) Then
		If (Utils.NE(tagcodeTPA)) Then
			tagcodeTPA = "TACTTT_001"
		End If
		
		Dim NewID As Int =  GetMaxOfEVC("dta_actions_adds", "id", "" ) + 1
		Dim ssql As String = $"INSERT INTO dta_actions_adds (id,actions_tagcode,action_type,fieldref_01) values
				('${NewID}','${asTagcode}','${tagcodeTPA}','${groupTPA}')"$
		Try
			'Starter.LocalSQLEVC.ExecNonQuery(ssql)
			Utils.SaveSQLToLog("NewASItemAdds",ssql, asTagcode)
		Catch
			Log(LastException)
		End Try
	End If
	
	Dim additional As String = ""
	If (Utils.NNE(obs) And Utils.NE(dlgASDetails)) Then
		additional = $", execute_notes='${obs}'"$
	End If

	Dim ssql As String = $"UPDATE dta_requests_values SET execute_action='${asTagcode}'${additional} 
							WHERE request_tagcode='${Request.Trim}'
								And inner_request_tagcode='${Action.Trim}'
								And task_tagcode='${Task.Trim}'
								And item_tagcode='${Item.Trim}'
								And unique_key='${UniqueKey.Trim}'
								And tagcode='${Tagcode}'
								And repeatcounter=${repeatcounter} "$
	Try
		'Starter.LocalSQLEVC.ExecNonQuery(ssql)
		Utils.SaveSQLToLog("UpdateRequest",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try

	Return asTagcode
End Sub

Sub InsertRequestASEVCDetails(asTagcode As String, Request As String, Action As String, Task As String, Item As String, UniqueKey As String, _
					Tagcode As String, dlgASSubject As String, dlgASDetails As String, dlgASPriority As String, _
					dlgASUrgency As String, SESS_OPER_User As String, _
					dlgASStatus As String, emailsentdate As String, EmailSentOnNewAS As String, _
					dlgASEmails As String, dlgASDueDate As String, _
					repeatcounter As Int, repeatitemcounter As Int, repeatfieldcounter As Int, DateTimecreation As String, _
					sendTheEmail As Int) As String

	Dim NewID As Int =  GetMaxOfEVC("dta_actions_items", "id", "" ) + 2
	Dim ssql As String = $"INSERT INTO dta_actions_items (id,actions_tagcode,operation_type,
				details, priority_tagcode, gravity_tagcode, technical_tagcode, due_date,
				send_email,email_sent,email_to,active, 
				repeatcounter, repeatitemcounter, repeatfieldcounter, updated_at)
				values
				('${NewID}','${asTagcode}','${dlgASStatus}','${dlgASDetails}','${dlgASPriority}','${dlgASUrgency}','${SESS_OPER_User}','${dlgASDueDate}',
				${sendTheEmail},${sendTheEmail},'${dlgASEmails}',1, ${repeatcounter}, ${repeatitemcounter}, ${repeatfieldcounter}, '${DateTimecreation}')"$

	Try
		'Starter.LocalSQLEVC.ExecNonQuery(ssql)
		Utils.SaveSQLToLog("NewASItem",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try

	Return asTagcode
End Sub

Sub UpdateRequestASEVC(asTagcode As String, Request As String, Action As String, Task As String, Item As String, UniqueKey As String, _
					Tagcode As String, dlgASSubject As String, dlgASDetails As String, dlgASPriority As String, _
					dlgASUrgency As String, SESS_OPER_User As String, _
					dlgASStatus As String, emailsentdate As String, EmailSentOnNewAS As String, _
					dlgASEmails As String, dlgASDueDate As String, _
					repeatcounter As Int, repeatitemcounter As Int, repeatfieldcounter As Int, DateTimecreation As String, _
					tagcodeTPA As String, groupTPA As String, obs As String, EmailSent As Int) As String
					
	Dim ssql As String = $"update dta_actions set
				title='${dlgASSubject}',
				operation_type='${dlgASStatus}',
				details='${dlgASDetails}',
				priority_tagcode='${dlgASPriority}',
				gravity_tagcode='${dlgASUrgency}',
				due_date='${dlgASDueDate}',
				send_email='${EmailSent}',
				email_sent='${EmailSent}',
				email_to='${dlgASEmails}',
				email_cc=''
				where tagcode='${asTagcode}'"$
	Try
		Utils.SaveSQLToLog("EditAS",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try
	
	Dim ssql As String = $"update dta_actions_items set
				operation_type='${dlgASStatus}',
				details='${dlgASDetails}',
				priority_tagcode='${dlgASPriority}',
				gravity_tagcode='${dlgASUrgency}',
				due_date='${dlgASDueDate}',
				send_email='${EmailSent}',
				email_sent='${EmailSent}',
				email_to='${dlgASEmails}',
				email_cc=''
				where actions_tagcode='${asTagcode}'
				and repeatcounter=${repeatcounter}
				and repeatitemcounter=${repeatitemcounter}
				and repeatfieldcounter=${repeatfieldcounter}"$
				
	Try
		Utils.SaveSQLToLog("NewASItem",ssql, asTagcode)
	Catch
		Log(LastException)
	End Try
	Return asTagcode
End Sub


Sub GetWorkerDbLastUpdate() As String
	Private Ret As String = ""
	Private Record As ResultSet = Starter.LocalSQLWRK.ExecQuery($"select * from loc_updates"$)
	Do While Record.NextRow
		Ret = Record.GetString("last_update")
		Exit
	Loop
	Record.Close
	Return Ret
End Sub

Sub UpdateWorkerDbLastUpdate(date As String)
	If Not(Utils.isValidDate(date)) Then
		date = Utils.GetCurrDatetime
	End If
	Dim sqlScript As String = $"update loc_updates set last_update='${date}'"$
	Starter.LocalSQLWRK.ExecNonQuery(sqlScript)
	Log(date)
End Sub

Sub AddVersionsDataMap(LocalSQL As SQL, mapping As Map)
	AddDataMap2Table(LocalSQL, "versions", mapping )
End Sub

'**********************************************************************************
'	GENERAL FUNCS
'**********************************************************************************
Sub AddDataMap2Table(LocalSQL As SQL, Tablename As String, mapping As Map)
	Dim Data As List
	Data.Initialize
	Data.Add( mapping )
	DBUtils.InsertMaps(LocalSQL, Tablename, Data )
End Sub

Sub AddDataList2Table(LocalSQL As SQL, Tablename As String, Data As List)
	DBUtils.InsertMaps(LocalSQL, Tablename, Data )
End Sub

Sub getObjectGroups As List
	Return getITCTable(SQL_DATA_OBJECT_GROUP)
End Sub

Sub getObjectTypes As List
	Return getITCTable(SQL_DATA_OBJECT_TYPE)
End Sub

Sub getTASKGroups As List
	Return getITCTable(SQL_DATA_TASK_GROUPS)
End Sub

Sub getTASKRequests As List
	Return getITCTable(SQL_DATA_TASK_REQUESTS)
End Sub


'***********************************************************************************************************************
' TIP: CRIAÇÃO DE TABELAS AUXILIARES ADICIONAIS CASO NÃO EXISTAM
'***********************************************************************************************************************
Sub CreateTablesThatDoNotExists
	If Not(DBUtils.TableExists(Starter.LocalSQLEVC, "dta_tablecontrol")) Then
		Dim dta_tablecontrol As String = $"CREATE TABLE `dta_tablecontrol` (
						`id` BIGINT(20) NOT NULL,
						`tagcode` VARCHAR(50) NOT NULL DEFAULT 'TABCTRL_',
						`title` VARCHAR(100) NOT NULL,
						`reference` VARCHAR(50) NULL DEFAULT NULL,
						`color` VARCHAR(50) NULL DEFAULT NULL,
						`codeid` INT(11) NULL DEFAULT '0',
						`level` INT(11) NULL DEFAULT '0',
						`position` INT(11) NULL DEFAULT '0',
						`created_at` TIMESTAMP NULL DEFAULT NULL,
						`updated_at` TIMESTAMP NULL DEFAULT NULL,
						`sid_id` INT(11) NOT NULL DEFAULT '0',
						`cbr_id` INT(11) NOT NULL DEFAULT '0',
						`active` TINYINT(1) NOT NULL DEFAULT '1',
						`paramters` TEXT NULL,
						PRIMARY KEY (`id`, `tagcode`)
					);"$
		Starter.LocalSQLEVC.ExecNonQuery(dta_tablecontrol)
	End If
	If Not(DBUtils.TableExists(Starter.LocalSQLEVC, "dta_tablecontrol_items")) Then
		Dim dta_tablecontrol_items As String = $"CREATE TABLE `dta_tablecontrol_items` (
					`id` BIGINT(20) NOT NULL,
					`tabctrl_tagcode` VARCHAR(50) NOT NULL DEFAULT 'TABCTRL_',
					`fieldstr_01` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_02` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_03` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_04` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_05` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_06` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_07` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_08` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_09` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_10` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_11` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_12` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_13` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_14` VARCHAR(100) NULL DEFAULT NULL,
					`fieldstr_15` VARCHAR(100) NULL DEFAULT NULL,
					`title` VARCHAR(100) NULL DEFAULT NULL,
					`reference` VARCHAR(50) NULL DEFAULT NULL,
					`color` VARCHAR(50) NULL DEFAULT NULL,
					`codeid` INT(11) NULL DEFAULT '0',
					`level` INT(11) NULL DEFAULT '0',
					`position` INT(11) NULL DEFAULT '0',
					`created_at` TIMESTAMP NULL DEFAULT NULL,
					`updated_at` TIMESTAMP NULL DEFAULT NULL,
					`sid_id` INT(11) NOT NULL DEFAULT '0',
					`cbr_id` INT(11) NOT NULL DEFAULT '0',
					`active` TINYINT(1) NOT NULL DEFAULT '1',
					PRIMARY KEY (`id`, `tabctrl_tagcode`)
				);"$
		Starter.LocalSQLEVC.ExecNonQuery(dta_tablecontrol_items)
	End If
	
	If Not(DBUtils.TableExists(Starter.LocalSQLEVC, "dta_tabledinamic")) Then
		Dim dta_tabledinamic As String = $"CREATE TABLE If Not EXISTS `dta_tabledinamic` (
				  `id` bigint(20) Not Null,
				  `tagcode` varchar(50) Not Null DEFAULT 'TABDIN_',
				  `title` varchar(100) Not Null,
				  `reference` varchar(50) DEFAULT Null,
				  `color` varchar(50) DEFAULT Null,
				  `codeid` int(11) DEFAULT '0',
				  `level` int(11) DEFAULT '0',
				  `position` int(11) DEFAULT '0',
				  `created_at` timestamp Null DEFAULT Null,
				  `updated_at` timestamp Null DEFAULT Null,
				  `sid_id` int(11) Not Null DEFAULT '0',
				  `cbr_id` int(11) Not Null DEFAULT '0',
				  `active` tinyint(1) Not Null DEFAULT '1',
				  `is_level` tinyint(4) DEFAULT '0',
				  PRIMARY KEY (`id`,`tagcode`)
				);"$
		Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinamic)
	End If
		
	If Not(DBUtils.TableExists(Starter.LocalSQLEVC, "dta_tabledinamic_groups")) Then
		Dim dta_tabledinamic_groups As String = $"CREATE TABLE If Not EXISTS `dta_tabledinamic_groups` (
				  `id` bigint(20) Not Null,
				  `tabdin_tagcode` varchar(50) Not Null,
				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINGRP_',
				  `title` varchar(100) Not Null,
				  `reference` varchar(50) DEFAULT Null,
				  `color` varchar(50) DEFAULT Null,
				  `codeid` int(11) DEFAULT '0',
				  `level` int(11) DEFAULT '0',
				  `position` int(11) DEFAULT '0',
				  `origin` int(11) DEFAULT '0',
				  `created_at` timestamp Null DEFAULT Null,
				  `updated_at` timestamp Null DEFAULT Null,
				  `sid_id` int(11) Not Null DEFAULT '0',
				  `cbr_id` int(11) Not Null DEFAULT '0',
				  `active` tinyint(1) Not Null DEFAULT '1',
				  PRIMARY KEY (`id`,`tabdin_tagcode`,`tagcode`)
				);"$
		Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinamic_groups)
	End If
		
	If Not(DBUtils.TableExists(Starter.LocalSQLEVC, "dta_tabledinamic_items")) Then
		Dim dta_tabledinamic_items As String = $"CREATE TABLE If Not EXISTS `dta_tabledinamic_items` (
				  `id` bigint(20) Not Null,
				  `tabdingroup_tagcode` varchar(50) Not Null,
				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINITEM_',
				  `title` varchar(100) Not Null,
				  `reference` varchar(50) DEFAULT Null,
				  `color` varchar(50) DEFAULT Null,
				  `codeid` int(11) DEFAULT '0',
				  `level` int(11) DEFAULT '0',
				  `position` int(11) DEFAULT '0',
				  `origin` int(11) DEFAULT '0',
				  `created_at` timestamp Null DEFAULT Null,
				  `updated_at` timestamp Null DEFAULT Null,
				  `sid_id` int(11) Not Null DEFAULT '0',
				  `cbr_id` int(11) Not Null DEFAULT '0',
				  `active` tinyint(1) Not Null DEFAULT '1',
				  PRIMARY KEY (`id`,`tabdingroup_tagcode`,`tagcode`)
				);"$
		Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinamic_items)
	End If
		
	If Not(DBUtils.TableExists(Starter.LocalSQLEVC, "dta_tabledinamic_subs")) Then
		Dim dta_tabledinamic_subs As String = $"CREATE TABLE If Not EXISTS `dta_tabledinamic_subs` (
				  `id` bigint(20) Not Null,
				  `tabdinitem_tagcode` varchar(50) Not Null,
				  `tagcode` varchar(50) Not Null DEFAULT 'TABDINSUBS_',
				  `title` varchar(100) Not Null,
				  `reference` varchar(50) DEFAULT Null,
				  `color` varchar(50) DEFAULT Null,
				  `codeid` int(11) DEFAULT '0',
				  `level` int(11) DEFAULT '0',
				  `position` int(11) DEFAULT '0',
				  `origin` int(11) DEFAULT '0',
				  `created_at` timestamp Null DEFAULT Null,
				  `updated_at` timestamp Null DEFAULT Null,
				  `sid_id` int(11) Not Null DEFAULT '0',
				  `cbr_id` int(11) Not Null DEFAULT '0',
				  `active` tinyint(1) Not Null DEFAULT '1',
				  PRIMARY KEY (`id`,`tabdinitem_tagcode`,`tagcode`)
				);"$
		Starter.LocalSQLEVC.ExecNonQuery(dta_tabledinamic_subs)
	End If

End Sub

Sub InsertIntoScript(script As String)
	If Utils.NNE(script) Then
		Starter.LocalSQLEVC.ExecNonQuery(script)
	End If
End Sub

