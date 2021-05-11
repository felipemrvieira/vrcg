B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=10.2
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Informa
'*****************************************************************************************************************
' NOTA : Campos dos requests_values_adds 
'*****************************************************************************************************************
'fieldval_01 : Usado
'fieldval_02 : Stk
'fieldval_03 : ERP ForceExternalRequest2
'fieldval_04 : Checklist Artigos (controlo de capitulo)
'fieldval_05 : Usado

'fieldref_02 : Enable/Disable da View
'*****************************************************************************************************************
' NOTA #002 - ADIÇÃO DE CONTROLO DE VISUALIZAÇÃO DE TIPOS DE INTERVENÇÃO AFECTAS AO DEPARTAMENTO DO UTILIZADOR
'*****************************************************************************************************************
'	PEDRO ALPEDRINHA - 2020-11-15 19:22
'	FICHEIRO: TASKCL2.BAS
' 	FUNÇÃO: StartTasksActivity


'*******************************************************************************************************************
' NOTA #003 - CRIAÇÃO DE INTERVENÇÃO/CHECKLIST POR PARAMETROS DE TYPEREQUEST_TASKS_ADDS
'*******************************************************************************************************************
'	PEDRO ALPEDRINHA - 2020-11-18 09:00
'	FICHEIRO: REQUESTS3.BAS, CHECKLIST3.BAS
' 	FUNÇÃO: CheckTypeRequestTaskParamters4
'	RELACIONADOS: CallCreateNewChecklistToRequest, CallCreateNewRequest
'	ESTRUTURA DE CONTROLO: dta_typerequests_tasks_adds->paramters
'		"create_additional_task":0,
'	    "create_additional_settings":[
'	        {
'	            "whentocreate":0,					0-OnDemand, 1-OnStart (firsttime CL exec), 2-OnClose (End CL exec), 3-OnExit (CL exec), 4-OnObject Associate,
'	            "is_child_task":0,					0-Não (é novo req), 1-Sim (Mesma req - Intervenção agrupadora)
'	            "dependent_request":0,				0-Não, 1-Sim (Quando is_child_task=0) grava numero de req atual no campo dependent_request Do novo req
'				"condition_based":0,				0-Não, 1-Formula=True, 2-Formula=False, 3-Script Return True in formula, 4-Script Return False in formula
'				"condition_based_formula":"",
'				"condition_based_script":"",
'	            "typerequest_tagcode":"",
'	            "checklist_tagcode":"",
'				"global_code_based":0,				0-Não, 1-Sim (subentende que typerequest_tagcode e/ou checklist_tagcode 
'													podem não estar identificados e desta forma vai pesquisar por tudo o que esteja relacionado
'				"global_code_from":0,				0-Identificado em "global_code", 1-Tipo de Intervenção, 2-Checklist, 3-Tipo de Objecto, 4-Armazém, 5-Artigo
'				"global_code":""
'	        }
'	    ]
'
'	RETORNO DE SCRIPT DEVE TER "RESULT"
'	FORMULA COM RETORNO DE SCRIPT DEVE TER [__SCRIPT__]
'
'	EXEMPLO DE CHAMADA:				
'	Dim CTRTP4 As ResumableSub = CheckTypeRequestTaskParamters4(request_tagcode, task_tagcode, typerequest, object_tagcode, whento, globalcode) 
'	wait for (CTRTP4) Complete (Finished As Boolean)



'*******************************************************************************************************************
' NOTA #004 - RECOLHA DE CONTADOR PARA O ITEM EM QUESTÃO
'*******************************************************************************************************************
'	PEDRO ALPEDRINHA - 2020-11-30 09:00
'	FICHEIRO: CHECKLIST3.BAS
' 	FUNÇÃO: CLAIGetSetExternalCounter
'	RELACIONADOS: 
'	ESTRUTURA DE CONTROLO: 
'	RETORNO DE CHAMADA: JSON { "status": "", "message": "", "counter": "" }
End Sub

Sub Merges
	
	' Versao 2.4.21 de 02/12/2020
	' Merge da v2.4.20H (PC) de 27/11/2020 com a v2.4.20 (PA) de 02/12/2020
	
End Sub