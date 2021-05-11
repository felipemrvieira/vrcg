B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	
	Public UPUser As Int = 1, UPDate As Int = 2, UPType As Int = 3, UPValues As Int = 4, UPTable As Int = 5, UPState As Int = 6
	
	'BARCODES
	Public SingleScan As Boolean = True
	Public AllowScanDuplicates As Boolean = False
	Public ClearBarcodeList As Boolean = True
	Public ScanList As List
	Public ListOfCodes2Compare As List
	Public Flag2CompareCodes As Boolean = False
	Public BarCode_request_control_field As String
	Public BarCode_normalColor As String
	Public BarCode_FoundColor As String
	Public BarCode_NotFoundColor As String
	Public Barcode_CompareWithList As Boolean
	Public Barcode_SetConfirmButton As Boolean
	Public BarCode_CountEquals As Boolean
	Public BarCode_AffectedField As String
	
	Public EmailOldModel As Boolean = False
'	Public IsInCheckExecution As Boolean = False
	Public TaskTPRActive As Boolean = True
	Public TaskTPRInactive As Boolean = True
	Public TaskTPRSingular As Boolean = True
	Public TaskTPRPlural As Boolean = True
	Public Installed_Date As String = ""
	
	Public STS001 As Boolean = True
	Public STS002 As Boolean = True
	Public STS003 As Boolean = True
	Public STS004 As Boolean = True
	Public STS005 As Boolean = True
	
	Public APP_Company_Name As String = "VRCG"
	Public MainLockPanel As Boolean = True
	Public UPDATING_RUNNING As Boolean = False
	Public FLAGCOMPLETEDJOB60LAST7NEXT As Boolean = False
	Public UserLanguage As String = "PT"
	Public CancelAllServices As Boolean = False
	Public ISPHONE As Boolean = False
	Public newpass As String = ""
	Public btnPassword As Boolean = True
	Public AlreadyDeleted As Boolean = True
	Public Types_AlreadyDeleted As Boolean = False
	Public IntensiveWorkLoad As Boolean = False
	
	'**************************************************************************
	'  DEVICE SPECIFIC PARAMTERS
	'**************************************************************************
	Public DEVICE_BRAND As String
	Public DEVICE_MODEL As String
	Public DEVICE_TYPE As String
	Public DEVICE_MAC As String
	'**************************************************************************
	'  DEVICE PARAMTERS
	'**************************************************************************
	
	Public DEVICE_DEF_FONT_SIZE As Int = 12
	Public DEVICE_DEF_FONT_SIZE_PHONE As Int = 4
	Public DEVICE_DEF_QUALITY As Int = 90
	Public DEVICE_DEF_IMG_FILETYPE As String = "PNG"
	Public DEVICE_DEF_IMG_WIDTH As Int = 410 '820 '1024
	Public DEVICE_DEF_IMG_HEIGHT As Int = 320 '615 '768
	Public DEVICE_PARAM_AS_OBS2DETAILS As Int = 0
	Public DEVICE_SHOW_REQUEST_TEAM As Int = 0
	Public DEVICE_ONLY_TECHORUSER As Int = 0
	Public DEVICE_SHOW_REQUEST_ID As Int = 0
	Public DEVICE_PARAM_DATA_CONFIRM As Int = 0
	Public DEVICE_PARAM_AVAILABILITY As Int = 0
	Public DEVICE_PARAM_FAVORITES As Int = 0
	Public DEVICE_PARAM_PAUSE_REQUEST As Int = 0
	Public DEVICE_PARAM_PAUSE_TECH As Int = 0
	Public DEVICE_REQUEST_UPLOAD_ONEXECUTION As Int = 0
	Public DEVICE_REQUEST_AUTOUPDT_ONALERT As Int = 0
	Public DEVICE_AS_SEND_IMMEDIATLY As Int = 0
	Public DEVICE_REQUEST_HIDECANCELED As Int = 0
	Public DEVICE_AUTOUPDATE_ONLOGIN As Int = 0
	Public DEVICE_AUTO_EXPAND_FIRST As Int = 0
	Public DEVICE_AUTO_EXPAND_CHECKLIST As Int = 0
	Public DEVICE_DEFAULT_ROUTE As Int = 0
	Public DEVICE_AS_INCLUDE_OBS_FIRST As Int = 0
	Public DEVICE_PARAM_PRINT_DRAFT As Int = 0
	Public DEVICE_SHOW_REQUEST_ROUTE As Int = 0
	Public DEVICE_REQUEST_PUSH_OTHER As Int = 0
	Public DEVICE_PARAM_PHOTO_QUALITY As Int = 0
	Public DEVICE_REOPEN_CHECKLISTS As Int = 0
	Public REQUEST_REOPEN_ONLY_ORANGE As Int = 0
	
	Public DEVICE_REQUEST_SIGNATURE_TRG As Int = 0
	Public DEVICE_REQUEST_PUSH_OTHER_AUTH As Int = 0
	Public DEVICE_PARAM_ORIENTATION As Int = 0
	Public DEVICE_PARAM_PHOTO_FONTSIZE As Int = 12
	Public DEVICE_PARAM_PHOTO_HEIGHT As Int = 615
	Public DEVICE_PARAM_PHOTO_WIDTH As Int = 820
	Public DEVICE_REQUEST_CAN_DELETE_OWNED As Int = 1
	Public DEVICE_PARAM_PHOTO_FILETYPE As String = "PNG"
	Public DEVICE_PARAM_PULL As Int = 0
	Public DEVICE_PARAM_ROUTES As Int = 0
	Public DEVICE_PARAM_GENERATEREPORT As Int = 1
	Public DEVICE_PARAM_RESYNC_REQUESTS As Int = 1
	Public DEVICE_PARAM_RUNCL_NOTYPEREQUEST As Int = 1
	Public DEVICE_PARAM_FOTO_EVIDENCE As Int = 1
	Public DEVICE_PARAM_DRAW_EVIDENCE As Int = 1
	Public DEVICE_PARAM_SENDREPORT As Int = 1
	Public DEVICE_PARAM_CANCHANGE_OBJECT As Int = 0
	Public DEVICE_PARAM_CANCHANGE_ENTITY As Int = 0
	Public DEVICE_PARAM_REQUEST_CANDUPLICATE As Int = 0
	Public DEVICE_PARAM_REQUEST_ASSIGNTO As Int = 0
	Public DEVICE_PARAM_REQUEST_ASSTO_MUSTACCEPT As Int = 1
	Public DEVICE_PARAM_REQUEST_INFOTITLE_CANCHANGE As Int = 0
	Public DEVICE_PARAM_REQUEST_CLTITLE_CANCHANGE As Int = 0
	Public DEVICE_PARAM_ADDITIONAL_USERS_REGISTER As Int = 1
	Public DEVICE_PARAM_LOGIN_MUSTSELECT_COMAPNY As Int = 0
	Public DEVICE_PARAM_LOGIN_MUSTSELECT_ENVIRONMENT As Int = 0
	Public DEVICE_PARAM_LOGIN_PASSWORDCHANGE_FIRSTTIME As Int = 0
	Public DEVICE_PARAM_LOGIN_ALLOW_QRCODE_CONTROL As Int = 0
	Public DEVICE_PARAM_LOGIN_ALLOW_FACIAL_CONTROL As Int = 0
	Public DEVICE_PARAM_REQUEST_ENDDATE_CONTROL As Int = 0
	Public DEVICE_PARAM_REQUEST_ENDDATE_INDAY_SHOW As Int = 0
	'OPCOES NOVAS : RE-AGENDAR E DUPLICAR
	Public DEVICE_PARAM_CANRESCHEDULE_REQUESTS As Int = 0
'	Public DEVICE_PARAM_CANDUPLICATE_REQUESTS As Int = 0
	
	Public DEVICE_REQUEST_SHOWNEWICON_ONALERT As Int = 0
	Public DEVICE_PARAM_OBJECT_ALLOW_NEW_REQUEST As Int = 0
	Public DEVICE_PARAM_OBJECT_ALLOW_VIEW_ALL As Int = 0
	Public DEVICE_PARAM_OBJECT_ALLOW_EVIDENCE_ASSOCIATE As Int = 0
	Public DEVICE_PARAM_OBJECT_ALLOW_REQUESTS_TAB As Int = 0
	Public DEVICE_PARAM_OBJECT_ALLOW_RELATIONS_JUMP As Int = 0
	Public DEVICE_REQUEST_UPDATE_SERVER_ONCLOSE As Int = 0
	Public DEVICE_CHECKLIST_ALLDOCS_IN_OBJECT As Int = 0
	Public DEVICE_PARAM_DEFAULT_DATE_PERIOD As Int = 0
	Public DEVICE_REQUEST_SHOW_DATE_DIVIDER As Int = 0

	Public DEVICE_CHECKLIST_SVRIMGUDP_ONCLOSE As Int = 0
	Public DEVICE_CHECKLIST_SVRIMGUDP_WIDTH_TRIGGER As Int = 0
	Public DEVICE_ASKTOUPDATE_ONLOGIN As Int = 0
	Public DEVICE_CHECKLIST_INCLUDE_PUBLIC_GALLERY As Int = 0
	Public DEVICE_PARAM_ACCESS_REQUESTS As Int = 1
	Public DEVICE_PARAM_ACCESS_REPORTS As Int = 1
	Public DEVICE_PARAM_ACCESS_ALERTS As Int = 1
	Public DEVICE_PARAM_ACCESS_OBJECTS As Int = 1
	Public DEVICE_PARAM_ACCESS_TASKS As Int = 1
	Public DEVICE_PARAM_ACCESS_MYDATA As Int = 1
	Public DEVICE_REQUEST_CUSTOMORDER As Int = 0
	
	Public DEVICE_CHECKLIST_STARTON_MYDATA As Int = 0
	Public DEVICE_CHECKLIST_MYDATA_DOCS_ONTOP As Int = 0
	
	Public DEVICE_CHECKLIST_OBJECTMANDATORY_ONEND As Int = 0
	Public DEVICE_CHECKLIST_SIGANTUREMANDATORY_ONEND As Int = 0
	Public DEVICE_PARAM_ACTIVATE_PRINTMODULE As Int = 0
	Public DEVICE_PARAM_TESTCONNECTED_PRINT_ONLOGIN As Int = 0
	Public SYNC_COMPONENTS As String = ""
	
	Public DEVICE_CHECKLIST_AUTORETURN_AFTER_FOTOSHOT As Int = 0
	Public DEVICE_CHECKLIST_AUTORETURN_AFTER_SUBSACTION As Int = 0
	Public DEVICE_CHECKLIST_COPY_ASDETAILS_TO_OBS As Int = 0
	Public DEVICE_CHECKLIST_AUTORETURN_AFTER_SIGNATURE As Int = 0
	
	Public DEVICE_PARAM_INVERTED_FOTO_DEVICE As Int = 0
	Public DEVICE_PARAM_INVERTED_HORIZ_FOTO_DEVICE As Int = 0
	Public DEVICE_REPORT_DATE_FROM_CHECKLIST As Int = 1
		
	Public DEVICE_TYPEREQUEST_START_NEWWAY As Int = 0
	Public DEVICE_TYPEREQUEST_DEFINE_START_NEWWAY As Int = 0
	
	Public DEVICE_EMAIL_OLD_MODEL As Int = 1
	Public DEVICE_FIELDREPORTDATETIME_SYSOREXEC As Int = 0
	
	Public DEVICE_SHOW_GLOBAL_SEARCH As Int = 0
'	Public DEVICE_SYNC_NEWWAY As Int = 0
	
	'**************************************************************************
	'  DEVICE PARAMTERS
	'**************************************************************************
	
	Public FullText As String = ""
	Public APP_WORKING_LOCAL As Boolean = False
	Public APP_Instance As String = ""
	Public APP_Authorization As String = ""
	Public APP_VERSION As String = ""
	Public VERSION_BUILD As String = ""
	Public VERSION_DATE As String = ""
	Public APP_VersionNocodeName As String = ""
	Public APP_EntityBrand As String = "X-Evolution,Lda"
	Public APP_VersionID As Int = 0
	Public APPL_CONFIRMED As Int = 0
	Public FIRST_INSTALL As Int = 0
	Public APP_URL As String = ""
	Public APP_DOMAIN As String = "demo"
	Public APP_LAST_LITE_UPDATE_DATETIME As String = ""
	Public APPL_ACCOUNT As String = "demo"
	Public APP_ConfirmLink As String = "orion/mobile"
	Public APP_ConfirmLinkMainLogo As String = "orion/mobile/logo"
	Public APP_ConfirmLinkMainLogoMini As String = "orion/mobile/logo/mini"
	Public APP_ConfirmLinkReset As String = "orion/mobile/auth/reset"
	Public APP_ConfirmUser As String = "orion/mobile/user"
	Public APP_ResetUser As String = "orion/mobile/user/reset"
	Public APP_PwdChangeUser As String = "orion/mobile/user/pwdchange"
	Public APP_AvailableUser As String = "orion/mobile/user/available"
	Public APP_RegisterDevice As String = "orion/mobile/auth/register"
	Public APP_ResetDevice As String = "orion/mobile/auth/reset"
	Public APP_LogsUpload As String = "orion/mobile/logs/upload"
	Public APP_FTP_USER As String = "EvolutionCheck"
	Public APP_MAIN_LOGO As String = $""$
	Public APP_MAIN_LOGO_MINI As String = $""$
	Public APP_TOKEN As String = ""
	Public APP_Start As String = ""
	Public SESS_User As String = ""
	Public SESS_UserProfile As String = ""
	Public SESS_UserTeam As String = ""
	Public SESS_UserRoute As String = ""
	Public SESS_UserName As String = ""
	Public SESS_UWDUKEY As String = ""
	Public SESS_WareHouse As String = ""
	Public SESS_Key As String = ""
	Public APPL_HOST As String = "vrcg.pt" 
	Public newreturn As Int = 1
	Public IsDevelopment As Boolean = False
	Public FirstInstallBD As Int = 1
	Public GlobalEventsTimer As Int = 1
	Public DownloadDocsFromFTP As Boolean = False
	Public SESS_VEHICLE_OBJECT As String = ""
	Public SESS_VEHICLE_PLATE As String = ""
	Public SESS_CurrentCarObject As CarObject
	Public USER_LOCAL_MAP As Map
	Public CalledFromAlerts As Boolean = False
	Public FIRSTLOGININDEVICE As Boolean = False
	Public LOGINJORNADA As Boolean = False
	Public NewRequestsList As List
	Public APP_ComboValues As List
	Public USR_STATE As Int = 1
	Public CLA_STATE As Int = 0
	Public DEVICE_ORIENTATION As Int = 0
	Public DEVICE_LANGUAGE As Int = 0
	Public DEVICE_LANGUAGE_STR As String = "PT"
	Public SESS_OPER_User As String = ""
	Public SESS_OPER_UserName As String = ""
	Public SESS_OPER_UWDUKEY As String = ""
	Public APP_LAST_USER As String = ""
	Public FIRSTDAILYLOGIN As Boolean = False
	Public PREVIOUS_STATUS As String = "OFF"
	Public APPDATE_STARTRANGE As String = ""
	Public APPDATE_ENDRANGE As String = ""

	Public OBJ_DefaultType As Int = 0
	Public OBJ_DefaultZone As Int = 0
	
	Public SESS_IN_PAUSE As Int = 0
	Public SESS_BLOCK_OPTIONS As Boolean = False
	
	
	Public UWDUKEY_DETAILS As Int = 0
	Public UWDUKEY_PRODUCTS As Int = 0
	Public CURRENT_APPDATE As String = ""
	Public TRANSLATION_FILE As Map
	Public SyncManualComponents As List
	Public SyncManualDates As String
	Public LatencyTime As Long
	'*******************************************************
	' VARIAVEIS DO EMAIL PARA OS ALERTAS
	'*******************************************************
	Public EML_RESULT As String
	Public EML_SUBJECT As String
	Public EML_DETAIL As String
	Public EML_REQUEST As String
	Public EML_TO As String
	Public AltertType As String
	
	'*******************************************************
	' VARIAVEIS DIVERSAS
	'*******************************************************
	Public ITEM_RETURNED_FROM_SEARCHLIST As String = ""
	Public TAG_RETURNED_FROM_SEARCHLIST As String = ""
	Public Current29Map As Map
	Public SearchFromQuery As Boolean = False
	Public CurrentRequestClickedIndex As Int = 0
	Public CurrentExtraInfo As String = ""
	Public TasksAlertsCount As Int = 0
	Public SystemAlertsCount As Int = 0
	Public RequestsAlertsCount As Int = 0
	Public TCF As String = ""
	'*******************************************************
	' VARIAVEIS PARA TRADUCAO, INICIALIZADAS NA SUB CHECKTRANSLATIONS
	'*******************************************************
	
	Public NoChecklistInTypeRequest As String = "Não existe checklist disponível na intervenção selecionada. Confirma com o administrador de sistema."
	
	
	Public MainOption_Request As String '= "Intervenções"
	Public MainOption_Alerts As String '= "Alertas"
	Public MainOption_KPI As String '= "Relatórios"
	Public MainOption_Tasks As String '= "Tarefas"
	Public MainOption_Objects As String '= "Objectos"
	Public MainOption_User As String '= "Meus dados"
	Public MainOption_Planning As String '= "Planeamento"
	
	Public TABGeneral_ListingTitle As String '= "Listagem"
	Public TABGeneral_Requests As String '= "Pedidos"
	Public TABGeneral_MapTitle As String '= "Mapa"
	Public TABGeneral_CalendarTitle As String '= "Calendário"
	Public TABGeneral_TypeRequestsTitle As String '= "Intervenções"
	Public TABGeneral_ChecklistTitle As String '= "Checklists"
	Public TABGeneral_ActionsTitle As String '= "Acções"
	
	Public CurrentRequestFilter As String '= ""
	Public CurrentObjectFilter As String '= ""
	
	Public Option_YES As String '= "Sim"
	Public Option_YESEXEC As String '= "Sim e executa"
	Public Option_NO As String '= "Não"
	Public Option_VIEW As String '= "Visualizar"
	Public Option_CANCEL As String '= "Cancelar"
	Public Option_AUTOMATICO As String '= "Automático"
	Public Option_MANUAL As String '= "Manual"
	Public Option_CREATE As String '= "Criar"
	Public Option_DUPLICATE As String '= "Duplicar"
	Public Option_CONFIRM As String '= "Confirmar"
	Public Option_CONTINUE As String '= "Continuar"
	Public Option_TRY As String '= "Tentar"
	Public Option_CANCELEXIT As String '= "Cancelar e Sair"
	Public Option_BACKLOGIN As String '= "Voltar ao login"
	Public Option_MAKE_REPORT As String '= "Gerar relatório"
	Public Option_ADD_TASK As String '= "Adicionar Tarefa"
	Public Option_CLOSE_REQUEST As String '= "Concluir intervenção"
	Public Option_RESOURCE As String '= "Repositório"
	Public Option_ACTION As String '= "Acção"
	Public Option_EXITSAVE As String '= "Gravar"
	Public Option_EXITNOSAVE As String '= "Não gravar"
	Public Option_BACK As String '= "Voltar"
	Public Option_SENDEMAIL As String '= "Enviar email"
	Public Option_MAKEALERT As String '= "Criar alerta"
	Public Option_REOPEN As String '= "Reabrir"
	Public Option_VIEW As String '= "Visualizar"
	Public Option_REQUESTS As String '= "Intervenções"
	Public Option_SAVEEXIT As String '= "Gravar e Sair"
	Public Option_COMPLIANT As String = "Conforme"
	Public Option_NOTCOMPLIANT As String = "Não Conforme"
	Public Option_NOTAPPLICABLE As String = "Não Aplicável"
	
	Public GeneralLoadingMessage As String '= "A carregar informação ..."
	Public GeneralCheckUpdates As String '= "A verificar/descarregar actualizações. Aguarde por favor. "
	Public GeneralVerificationMessage As String '= "Em verificação ... aguarde!"
	
	Public GeneralAlertTitle As String '= "Alerta!"
	Public GeneralErrorTitle As String '= "Erro!"
	Public GeneralNoteTitle As String '= "Nota!"
	Public GeneralInfoTitle As String '= "Informação!"
	Public GeneralAtentionTitle As String '= "Atenção!"
	Public GeneralWaitPlease As String '= "Aguarde por favor!"
	
	Public OffLineMessage_Confirm As String '= "Está a operar em OFFLINE. Deseja continuar mesmo assim?"
	Public UpdateAvailableMessage As String '= "Foram detectadas actualizações disponíveis, deseja fazer a actualização? "
	Public ConnectionBreak As String '= "O dispositivo detectou falha de comunicação. Poderá não ter rede ou acesso à Internet. A aplicação irá rodar em modo LOCAL até ao restabelecimento da comunicação."
	Public AuthorizationData_NoConnection_Validate As String '= "Não existe comunicação à Internet e a aplicação não está licenciada. Sugerimos que verifique e confirme a ligação à Internet para poder proceguir com o registo da mesma."
	Public AuthorizationData_Registered As String '= "Já exise um equipamento registado com esta chave de Autorização. Confirme com o Administrador de sistema e tente novamente."
	Public AuthorizationData_RegisteredError As String '= "Ocurreu um erro no processo de registo da chave de Autorização. Por favor tente novamente. Em caso de persistência contacte o Administrador de sistema."
	Public AuthorizationData_Reset As String '= "Está a proceder ao Reset/Reiniciar o Regsito da Alpicação. Este processo irá re-iniciar as tabelas locais e apagar todos os ficheiros gerados pela execução da aplicação. Tem a certeza de que deseja continuar com este procedimento?"
	Public AuthorizationData_Invalid As String '= "Os dados introduzidos não estão correctos ou autorizados! Contacte o administrador de sistema ou tente novamente."
	Public AuthorizationData_NoServer As String '= "A comunicação com o servidor devolveu um erro! Tente novamente ou contacte o administrador de sistema."
	Public AuthorizationData_NoData As String '= "A informação de Instância e Autorização são obrigatórias! Por favor preencha os respectivos campos para continuar."
	Public LoginResetNoConnection As String '= "Não existe comunicação com o servidor! Devderá tentar executar esta acção mais tarde ."
	Public LoginResetMessage_OK As String '= "O pedido de reset foi efectuado com sucesso! Verifique o seu email para continuar."
	Public LoginResetMessage_REJECTED As String '= "Pedido rejeitado/inválido! Deseja tentar novamente?"
	Public LoginResetMessage_NOTOK As String '= "A alteração da palavra chave não foi bem sucedida! Deseja tentar novamente?"
	Public LoginResetServerError As String '= "Houve erro de comunicação com o servidor e não foi possível proceder ao pedido de reset de password. Tente novamente."
	Public LoginResetExists As String '= "Existe um pedido de RESET de password. Por favor aguarde por email de confirmação."
	Public RemoveRecordConfirm As String '= "Deseja remover o registo seleccionado?"
	
	Public LoginMessage_OK As String '= "Ok"
	Public LoginMessage_NOTOK As String '= "As credênciais introduzidas estão erradas, deseja tentar novamente?"
	Public LoginServerError As String '= "Houve erro de comunicação com o servidor e não foi possível confirmar as credênciais. Tente novamente."
	Public Login_NoData As String '= "O Código de Utilizador e respectiva palavra Chave são obrigatórias! Por favor preencha os respectivos campos para continuar."
	
	Public AllFieldsMandatoryMessage As String '= "Todos os campos são obrigatórios! Preencha os campos e tente novamente."
	Public NoItemsFoundMessage As String '= "No items found"
	
	Public UserGoAvailableMessage As String '= "Deseja voltar ao estado de disponível?. Escolha SIM para continuar, NÃO para cancelar a operação."
	Public RUN_Action_Confirm As String '= "Deseja iniciar/executar a tarefa?"
	
	Public ExitEditNotSaved As String '= "Quaisquer alterações efectuadas não serão gravadas. Deseja continuar?"
	Public SavePictureToResoucesFolder As String '= "Indique a operação que pretende realizar com a(s) imagem(ens) que acabou de tirar. REPOSITÓRIO - Grava cópia da(s) imagem(ns) no repositório local para posterior utilização (Uma notificação de alerta vai ser gerada)."
	Public SavePictureToCLAItem As String '= "Escolha uma das opções disponíveis."
	
	Public TopRequestActionMessage As String '= "Escolha uma das opções disponíveis."
	
	Public LoadingRequestMessage As String '= "A carregar intervenção ..."
	
	Public ActionSubEditTitle As String '= "Edição de Acção Subsequente"
	Public ActionSubNewTitle As String '= "Nova de Acção Subsequente"
	
	'tarefas
	Public tarefasLabelTitulos As String' = "Título da Checklist/Acção"
	Public tarefasLabelUltimoUpd As String' = "Última actualização"
	Public tarefasLabelTResultado As String' = "Tipo Resultado"
	Public tarefasavisoInfoDescritiva As String '= "Informação descritiva da Tarefa"
	
	'requests
	Public RequestStartCLAExecution As String '= "A Tarefa seleccionada ainda não foi iniciada. Deseja proceder à sua inicialização?"
	Public RequestStartCLAClosed As String '= "A Tarefa seleccionada já foi concluída! Deseja reabrir a Tarefa ou apenas visualiza-la?"
	Public RequestStartCLAClosedView As String '= "A Tarefa seleccionada já foi concluída! Deseja visualiza-la?"
	Public CLAImageRemove As String '= "Selecionou a funcionalidade para remover imagem. Deseja remover a imagem selecionada?"
	
	Public OrientationChange As String '= "A orientação do dispositivo foi alterada! Para proceder à alteração deverá re-iniciar a aplicação. Deseja efectuar o re-iniciar da aplicação já?"
	Public UserWorkSessionChange As String '= "Confirma a alteração do utilizador em sessão?"
	Public ApplicationExit As String '= "Escolheu a opção para sair da aplicação. Deseja continuar?"
	
	Public LocalizationErrorText As String '= "Não foi possível detectar a sua localização," & CRLF & "Por favor active o GPS....."
	Public LocalizationErrorTitle As String '= "Erro de Localização"
	
	'ToastMessages
	Public AvisoToastSemInfoTarefa As String' = "Erro !! Sem informação da tarefa"
	Public AvisoToastNoUpdateServer As String '= "Não foi possível actualizar o Servidor"
	Public AvisoToastEmailSent As String' = "Email enviado !"
	Public AvisoToastEmailNotSent As String' = "Email não enviado !"
	
	'Mainmenu
	Public POPUPMENU_SyncManual As String '= "Escolha o metodo de Sincronização"
	Public POPUPMENU_MainPopMenuSync As String '= "Sincronizar"
	Public POPUPMENU_MainDataValidation As String '= "Validar dados"
	Public POPUPMENU_MainPopMenuCompany As String '= "Parametros do dispositivo"
	Public POPUPMENU_MainPopMenuPushRequest As String '= "Puxar intervenção"
	Public POPUPMENU_MainPopMenuLoginChange As String '= "Mudar de utilizador"
	Public POPUPMENU_MainDeviceInfoPopMenu  As String '= "Informação do dispositivo"
	Public POPUPMENU_MainInstallApk As String' = "Instalação Sistema"
	Public POPUPMENU_MainDevicePrint As String '= "Impressão"
	Public POPUPMENU_MainPopMenuExit As String '= "Sair"
	Public TAB_tasks_procedures As String ' = ""
	
	'checklists
	Public AvisoPrepararChecklist As String '= "A criar/preparar execução de Checklist. Aguarde ..."
	Public AvisoAguarde As String '= "APP_TRANSLATION","AVISOAGUARDE","Aguarde por favor ..."
	Public AvisoErroComms As String '= "Erro de comunicação! Operação cancelada."
	Public AvisoIniciarPausa As String '= "Escolheu a opção de pausa. Com esta opção activa não será possível realizar qualquer operação de Interveção até que volte ao estado normal. Deseja continuar?"
	Public AvisoPararPausa As String '= "Deseja parar a pausa e voltar ao estado normal de operação?"
	Public AvisoEnviarDadosCheck As String '= "A enviar dados de verificação. Aguarde por favor..."
	Public AvisoErroEnviarDadosCheck As String '= "Erro ao enviar dados de verificação Tente Novamente.... "
	Public AvisoNoSync As String '= "Não é possível sincronizar dados com o servidor pois não existe rede de acesso!"
	Public AvisoOperacaoConcluida As String '= "Operação concluída!"
	Public AvisoIntervencaoSemDados As String '= "Esta intervenção não tem dados. Deseja descarregá-los ?"
	'Dataupdate
	Public MsgUpdateTitlePasso1PrimeiraInstalacao As String' = "Configuração do sistema : Mestres"
	Public MsgUpdateTitlePasso2PrimeiraInstalacao  As String' = "Configuração do sistema : Cabeçalhos"
	Public MsgUpdateTitlePasso3PrimeiraInstalacao  As String' = "Configuração do sistema : Diários"
	Public MsgUpdateTitleSincronizacao As String' = "A Sincronizar dados,  aguarde por favor."
	Public MsgUpdateTitleActualizacao As String' = "A actualizar dados,  aguarde por favor."
	Public MsgUpdateTitleObterInfo As String' = "A obter informação do servidor ..."
	Public MsgExecProcAct As String '= "A executar procedimentos de actualização ..."
	Public MsgUpdateTitleDownloadDados As String' = "A descarregar ficheiros de dados do servidor ..."
	Public MsgUpdateTitleDownloadDadosExtra As String '= "A descarregar ficheiros complementares do servidor ..."
	Public MsgUpdateTitleUploadDados As String '= "Upload de ficheiros"
	Public MsgUpdateTitleCarregarDados As String' = "A carregar dados na BD local ..."
	Public MsgDeleteTypeTabelas As String '= "A eliminar dados antigos das tabelas..."
	Public MsgDataUpdateProcessInicial As String' = "Processo 1/3 concluído!"
	Public MsgDataUpdateProcessIntermedio As String' = "Processo 2/3 concluído!"
	Public MsgDataUpdateProcessFinal As String' = "Processo 3/3 concluído!"
	Public MsgDataUpdateProcessConcluido As String' = "Processo concluído!"
	Public MsgDataUpdateProcessSync As String' = "Sincronização concluída!"
	Public MsgNaoExistemActualizacoes As String' = "Não foram encontradas actualizações.."
	Public AvisoDadospersistemNaoUpd As String '= "Alguns dados persistem em não actualizar o servidor. Esta operação vai finalizar! Por favor contacte o administrador de sistema para verificação da situação."
	Public MsgUpdateErroActualizar As String '= "Erro ao actualizar..........."
	Public MsgSendDataServer As String '="Enviar dados para o servidor"
	Public MsgErroProc60last7new As String '= "O servidor não gerou o ficheiros para Download"
	Public MsgDataUpdateProcedimentos As String' = "Procedimentos"
	Public MsgInstalacaoInicialBD As String' = "Instalação inicial da base de dados"
	Public MsgAvisoEmailAlerta As String' = "Envio de email registado. Confirme o estado de envio em Alertas da página principal"
	
	'User
	Public AvisoNaoFoiPossivelActServer As String '= "Não foi possível actualizar o Servidor"
	
	'main
	Public AvisoDownloadAPK As String '= "Aguarde ! a transferir nova versão...."
	Public AvisoNotSDCard As String '= "Cartão de armazenamento não está disponível. Certifique-se de que seu dispositivo não esteja conectado no modo de armazenamento USB."
	Public AvisoInstalarApp As String '= "Por favor, permita instalar aplicações."
	Public AvisoInstalarFontes1 As String '= "Por favor, permita a instalação de aplicações a partir de fontes desconhecidas"
	Public AvisoInstalarFontes2 As String '= "Vai a Definições - Segurança - Fontes desconhecidas"
	Public AvisoInstalarFontes3 As String '= "Ou Definições - Aplicações - Fontes desconhecidas"
	Public AvisoIniciarApp As String '= "A iniciar a aplicação. Aguarde por favor."
	Public AvisoSMSSent As String' = "SMS Enviado"
	Public AvisoSMSNotSent As String' = "O SMS não foi enviado"
	
	'mainlayout
	Public mainlayoutmainFirstInstall As String' = "Primeira Instalação! Aguarde por favor, esta operação poderá demorar alguns minutos."
	Public mainlayoutButtonLoginEnter As String' = "Continuar"
	Public mainlayoutButtonLoginExit As String' = "Sair"
	Public mainlayoutButtonLoginReset As String' = "Password"
	Public mainlayoutLabelTituloCredenciais As String' = "Introduza as suas credênciais de acesso para aceder à aplicação ReadyCheckGo."
	Public mainlayoutLabelControloAcesso As String' = "Controlo de Acesso"
	Public mainlayoutLabelNomeUtilizador As String' = "Nome Utilizador"
	Public mainlayoutLabelPasswordUtilizador As String' = "Palavra"
	Public mainlayoutLabelWelcomeWarning As String' = "Antes de poder executar e utilizar a aplicação, deverá verificar e confirmar algumas definições e autorizações.	Por favor indique a língua e a orientação Do dispositivo que deseja/pretende utilizar. Note que estas definições poderão ser alteradas posteriormente em : 'Menu->Configurações de Sistema'."
	Public mainlayoutLabelWelcomeEvolutionCheck As String' = "Bem vindo ao Vodafone ReadyCheckGo!"
	Public mainlayoutButtonAuthBack As String' = "Voltar"
	Public mainlayoutButtonAuthNext As String' = "Continuar"
	Public mainlayoutButtonWelcomeNext As String' = "Continuar"
	Public mainlayoutLabelHelpAutorizacao As String' = "Introduza nos campos respectivos o código da Instância e o código de Autorização. Estes dados deverão ser submetidos pela plataforma ReadyCheckGo através da aplicação 'BackOffice' e enviados por email para cada utilizador/dispositivo móvel. Em caso de dúvida contacte o Administrador de sistema para facultar a respectiva informação."
	Public mainlayoutLabelAutorizacao As String' = "Código de Autorização"
	Public mainlayoutLabelCodigoInstancia As String' = "Código da Instância"
	Public mainlayoutLabelCodigoAutorizacao As String' = "Autorização da aplicação"
	Public mainlayoutLabelValidacaoLogin  As String' = "Aguarde por favor! A validar o código de Utilizador e a palavra Chave submetidas."
	Public mainlayoutLabelValidacaoAcesso  As String' = "Validação de Acesso"
	Public mainlayoutLabelCheckValidacao As String' = "Aguarde por favor! A aplicação está a validar os dados de Verificação e Autorização na plataforma ReadyCheckGo. Uma vez submetidos e validados, esta informação deixará de ser apresentada."
	Public mainlayoutLabelVerificacao As String' = "Verificação"
	Public mainlayoutAskSair As String' = "Deseja sair da aplicação ?"
	
	'Requests
	Public requestsEditSearch As String' = "Pesquisar"
	Public requestslistview As String' = "Listagem"
	Public Requestslistviewrequest As String' = "Intervenção"
	Public requestsMapview As String' = "Mapa"
	Public requestsLabelButtonTitleAction As String' = "Local/Acção"
	Public requestsLabelReferenciasDescritivos As String' = "Referências/Descritivos"
	Public requestsLabelStatus As String' ="Status"
	Public requestsErroCriarChecklist As String' = "Erro na criação da tarefa/checklist seleccionada! Se o problema persistir, contacte o administrador de sistema para uma rapida resolução Do problema."
	Public requestsErroDownalodIntervencao As String' = "Erro ao efectuar o download dos dados da intervenção"
	Public requestsavisosemdados As String' = "Esta intervenção não tem dados. Deseja descarregá-los ?"
	
	'DataUpdate
	Public DataUpdateLabelCopyData As String' = "Cópia de Dados"
	Public DataUpdateLabelLoadData As String' = "Carregamento"
	Public DataUpdateLabelDownloadData As String' = "Downloads"
	Public DataUpdateLabelUpdateProcess As String' = "Processo"
	Public DataUpdateButtonWelcomeNext As String' = "Continuar"
	
	'Checklist
	Public checklistmainLabelOptLists As String' = "EXECUÇÃO DE TAREFA"
	Public checklistTabButtonChangeObject  As String' = "Dados Gerais"
	Public checklistTabButtonChangeChecklist As String' = "Checklist"
	Public checklistTabButtonChangeTerminate As String' = "Concluir"
	Public checklistbutChecklistRunEnd As String' = "Terminar"
	Public checklistbutChecklistReport As String' = "Gerar relatório"
	Public checklistbutChecklistSendReport As String' = "Enviar relatório"
	Public checklistavisoterminarchecklist As String '= "A terminar a checklist ...""
	Public checklistavisonaoterminada As String '= "A Checklist não foi Terminada com a opção devida! Deseja proceder à Terminação da execução da Checklist?"
	Public checklistavisogeracaorelatorio As String '= "A geração do relatório é obrigatória! Deseja proceder à sua geração?"
	Public checklistavisosemobjectos As String' = "Não existem objectos Associados !"
	Public checklisterrodesassociar As String' = "Não foi possivel desassociar o objecto !"
	Public checklistobjectodesassociado As String' = "O Objecto foi Desassociado da checklist !"
	Public checklistavisonaoepossivelremover As String' = "Não é possivel desassociar objectos na checklist principal !"
	Public checklistimagembasenaopode As String' = "A imagem seleccionada é uma imagem BASE e não pode ser apagada!"
	Public checklistassinaturasobrigatorias As String' = "Têm de existir assinatura(s) para poder concluir a intervenção !"
	Public checklistavisonaopermitealteracao As String' = "A Checklist não permite a alteração de Objectos !"
	Public checklistavisonaopermiteremocao As String' = "A Checklist não permite a remoção de Objectos !"
	Public checklistperguntaassociarobjecto1 As String' = "Deseja associar "
	Public checklistperguntaassociarobjecto2 As String' = " à Checklist?"
	Public checklistperguntaassociarobjecto As String' = "Associar Objecto"
	Public checklistselecaoobjecto As String' = "Selecção de Objecto"
	Public checklistlistnaoconformidades As String '= "Lista de Não Conformidades"
	Public checklistllblTemposExecucao As String' = "Tempos de execução"
	Public checklistllblInicio As String' = "Inicio"
	Public checklistllblFim As String' = "Fim"
	Public checklistllblDuracao As String' = "Duração"
	Public checklistllblPausa As String' = "Pausa"
	Public checklistllblResultado As String' = "Resultado"
	Public checklistllblTotal As String' = "Total"
	Public checklistlFinalObsHint As String' = "Observações"
	Public checklistlButtonFINSignatures As String' = "Assinaturas"
	Public checklistlButtonFINActionButton As String' = "Criar Acção"
	Public checklistclFinaltopTitle As String' = "Resumo Final"
	Public checklistLabelGrupo  As String' = "Grupo"
	Public checklistLabelTipoObjecto As String' = "Tipo de Objecto"
	Public checklistLabelDescritivo As String' = "Descritivo
	Public checklistbutChangeObject As String' = "Mudar Objecto Associado"
	Public checklistbutDessociateObject As String' = "Desassociar Objecto"
	Public checklistbutAssociateObject As String' = "Associar Objecto"
	Public checklistLabelSeleccioneObjecto As String' = "Selecione o Objecto"
	Public checklistDadosObjectoMoradas As String' = "Moradas"
	Public checklistDadosObjectoContactos As String' = "Contactos"
	Public checklistDadosObjectoCamposObjecto As String' = "Campos do objecto"
	Public checklistDadosObjectoDocumentosObjecto As String' = "Documentos do objecto"
	Public checklistLabelReferenciaObjecto As String' = "Referência"
	Public checklistLabelCodigoInternObjecto As String' = "Designação"
	Public checklistLabelImagemObjecto As String' = "Imagem"
	Public checklistLabelEscolhaTipoObjecto As String' = "Escolha o tipo de objecto"
	Public checklistErroacesso As String' = "Erro no acesso da Checklist! Efectue um sincronização e tente novamente."
	Public checklistenviardados2BO As String' = "A enviar dados para o servidor. Por favor aguarde !"
	'filtros - Appdialogs
	Public AppDialogsFilterLabelTipoIntervencao As String' = "Tipo Intervenção"
	Public AppDialogsFilterLabelEntidade As String' = "Entidade"
	Public AppDialogsFilterLabelEstadosIntervencao As String' = "Estados intervenção"
	Public AppDialogsFilterLabelDataInicio As String' = "Data ínicio"
	Public AppDialogsFilterLabelDataFim As String' = "Data fim"
	Public AppDialogsFilterLabelTipoChecklist As String' = "Tipo checklist"
	Public AppDialogsFilterLabelRota As String' = "Rota/Volta"
	Public AppDialogsCriadasIntervencoesObjectos As String' = "Foram criadas as intervenções para os objectos seleccionados! Deseja ir para as intervenções para  verificação/execução?"
	Public AppDialogsNaoVerificadoTipoIntervencao As String' = "Não foi possível verificar o tipo de intervenção/serviço associado à Checklist. Efectue a actualização/sincronização de dados e tente novamente."
	Public AppDialogsEdicao As String' = "Edição"
	Public AppDialogsNovo As String' = "Novo"
	
	'mainmenu
	Public mainmenuLabelAvisoProcessamento As String' = "Em processamento. Aguarde por favor !"
	Public maimenuproblemaatribuicao As String' = "Houve um problema na atribuição da Intervenção seleccionada. Repita o processo novamente. Se o problema persistir por favor contacte o administrador de sistema."
	
	'UpdateAPK
	Public AvisoNovoAPK As String' = "Existe uma versão mais recente da aplicação. Deseja Actualizar?"
	
	'Reportview
	Public reportsMsgProcessar  As String' = "A processar. Aguarde por favor ..."
	Public reportsErroLerFicheiro As String' = "Erro ao tentar ler o ficheiro do directório local! Se o erro persistir informe o administrador de sistema para verificação do problema"
	Public reportsMsgPrepararPDF As String' = "A preparar ficheiro PDF ..."
	Public reportsErroEnviarEmail As String' = "Não foi possível enviar o relatório por email devido a erro de comunicação. Tente novamente ou contacte o administrador de sistema."
	Public reportsMsgEnviarEmail As String' = "Email Enviado com sucesso!"
	Public reportsErroEmail As String' = "Email Nao enviado! Erro: "
	Public reportsMsgGeralRelatorio As String' = "A gerar o relatório ..."
	Public reportsMsgGeralRelatorioCarregaFicheiro As String' = "A gerar o relatório, Carregamento do ficheiro ..."
	Public reportsErroTamanhoExcessivo As String' = "Não é possível apresentar o relatório! O tamanho do ficheiro excede a capaciade de memória do equipamento."
	Public reportsErroAbrirTemplate As String' = "Não foi possivel abrir o template de impressão! Por favor efectue a sincronização e tente novamente. Em caso de persistência, contacte o administrador de sistema."
	Public reportsMsgGerarEquipamentos As String' = "A gerar o relatório, Equipamentos ..."
	Public reportsMsgGerarGeral As String' = "A gerar o relatório, Geral ..."
	Public reportsMsgGerarNaoConformidades As String' = "A gerar o relatório, Não conformidades..."
	Public reportsMsgGerarSumario As String' = "A gerar o relatório, Sumário ..."
	Public reportsMsgGerarArquivo As String' = "A gerar o relatório, Criação do arquivo ..."
	Public reportsMsgFuncionalidadeNCFG As String' = "Funcionalidade por configurar!"
	
	'User
	Public usermakeavalilable As String' = "Tornar Disponível"
	Public userfilenoindentified As String' = "O ficheiro não foi identificado localmente! Deseja descarrega-lo do servidor?"
	Public userfilewithproblems As String' = "O ficheiro encontra-se com problemas! Deseja descarrega-lo do servidor?"
	Public userfileunavailable As String' = "Não foi possivel aceder ao ficheiro"
	Public userErroRemoveOwnUser As String' = "Não pode remover o seu próprio utilizador!"
	Public userSelectedUserNoRemove As String' = "O utilizador seleccionado não pode ser removido da lista, porque é o utilizador de inicio de sessão."
	Public userAskRemoveUser As String' = "Deseja remover o utilizador seleccionado da equipa em funções?"
	Public userNoEquipments As String' = "Não existem equipamentos disponíveis para substitução!"
	Public userNoVehicles As String' = "Não existem Veículos disponíveis!"
	Public userAskRemoveEquipment As String' = "Deseja remover o equipamento seleccionado da lista de equipamentos do utilizador?"
	Public userAskConfirmProducts As String' = "Existem produtos por confirmar! Irá proceder à confirmação dos dados do utilizador apenas. Para confirmar os produtos, execute novamente esta operação e escolha a opção 'Confirmar produtos'."
	Public userOptionConfirmProduct As String' = "Confirmar produtos"
	Public userAskConfirmUserData As String' = "Irá proceder à confirmação dos dados de utilizador e dos produtos do armazém. Deseja continuar?"
	Public userAguardeumMomento As String' = "Aguarde um momento ..."
	Public userAskProductAusente As String' = "O produto/equipamento encontra-se ausente?"
	Public userOptionSimAusente As String' = "Sim, produto ausente"
	Public userOptionOutrasRazoes As String' = "Outras razões"
	Public userNoEquipmentsReplace As String' = "Não existem equipamentos disponíveis para substitução!"
	Public userOptionVerAccao As String' = "Ver acção"
	Public userOptionReExecuteAccao As String' = "Re-Executar acção"
	Public userChoiceOptionAvailable As String' = "Escolha uma das opções disponíveis."
	Public userAlreadyRegistered As String' = "O utilizador já se encontra registado!"
	Public userIncorrectInfo As String' = "A informação na base de dados local não se encontra correcta! Verifique um ponto de rede para proceder à actualização dos dados e de seguida tente novamente."
	Public userInvalidLogin As String' = "Login de utilizador inválido! Deseja tentar novamente?"
	Public userCodeandPasswordMandatory As String' = "Tanto o código de utilizador como a chave de acesso são obrigatórias para efectuar o registo de novo utilizador!"
	Public usermainLabelOptListsUser As String' = "Utilizador"
	Public usermainLabelOptListsDocs As String' = "Documentos"
	Public usermainLabelOptListsCons As String' = "Consumíveis"
	Public usermainLabelOptListsOper As String' = "Operacionais"
	Public userchapterEquip As String' = "Equipamentos em uso"
	Public userchapterViatura As String' = "Viatura"
	Public userchapterUsers As String' = "Utilizadores registados"
	Public userbutUserConfirmData As String' = "Clique para confirmar os dados"
	Public userbutUserPauseAction As String' = "Efectuar pausa"
	Public userbutUserUnavailable As String' = "Tornar indisponível"
	Public useruserLabelFoto As String' = "Fotografia"
	Public useruserLabelNome As String' ="Nome"
	Public useruserLabelOrganizacao As String' = "Organização"
	Public useruserLabelCategoria As String' = "Categoria profissional"
	Public useruserLabelCodigoUser As String' = "Código de utilizador"
	Public userlayoutpanelOper As String' = "Operador"
	Public userlayoutpanelDocsOrg As String' = "Doc da Organização"
	Public userlayoutpanelConsum As String' = "Consumíveis"
	Public userdurationsHoje As String' = "Dia de hoje"
	Public userdurationsVarios As String' = "Vários dias"
	Public userreasonsMedico As String' = "Consulta médica"
	Public userreasonsAssist As String' = "Assistência à família"
	Public userreasonsDoente As String' = "Doente/Mal estar"
	Public userreasonsOutras As String' = "Outras razões"
	
	'Report
	Public reportsLabelEstadoPedidos As String' = "Estados de Pedidos"
	Public reportsLabelPeriodo As String' = "Período"
	Public reportsLabelKPIDescricao As String' = "KPI - Descrição"
	Public reportsLabelValor As String' = "Valor"
	Public reportsLabelKPIOutrosIndicadores As String' = "Outros indicadores"
	Public reportsLabelKPIComparacao As String' = "Comparação"
	Public reportsIndicadoresDia As String' = "Indicadores do dia"
	Public reportsIndicadoresComparacao As String '= "Indicadores de comparação"

	'Alertas
	Public alertslabeln As String' = "Informação/Prioridades"
	Public alertsLabelStatus As String' = "Status"
	Public alertsLabelDescricaoAlerta As String' = "Descrição do Alerta/Acção"
	Public alertslabelTypeObjectFilter As String' = "Acção"
	Public alertsChapterSistema As String' = "Sistema"
	Public alertsChapterTarefas As String' = "Tarefas"
	Public alertsChapterInter As String' = "Intervenções"
	
	'Objects
	Public objectsAvisoPedidoSemInfo As String' = "Não foi possível apresentar informação do pedido seleccionado! Tente sincronizar os dados e posteriormente tentar novamente."
	Public objectsMsgConfirmaatribuicaoasi As String' = "Confirma a atribuição do Pedido para si mesmo?"
	Public objectMsgPrepararInter As String' = "A preparar a Intervenção ..."
	Public objectObjLabelObjectos As String' = "Objecto/Contacto/Estado"
	Public objectObjLabelMorada As String' = "Morada/Tipo"
	Public objectObjLabelStatus As String' = "Status"
	Public objectObjLabelLocal As String' = "Local"
	Public ObjLabelObjRequestTipoInter As String' = "Tipo de Intervenção"
	Public ObjLabelObjRequestConcelho As String' = "Concelho"
	Public ObjLabelObjRequestDistrito As String' = "Distrito"
	Public ObjLabelObjRequestPLivre As String' = "Pesquisa livre"
	Public ObjLabelObjRequestTipoGrupoInter As String' = "Tipo/Grupo de Inspecção"
	Public ObjListItemRequestHeader As String' = "Descritivo"
	Public ObjListItemActionHeader As String' = "Ações"
	Public ObjLayoutsGeral As String' = "Geral"
	Public ObjLayoutsRelacoes As String' = "Relações"
	Public ObjLayoutsDocumentos As String' = "Documentos"
	Public ObjLayoutsIntervencoes As String' = "Intervenções"
	Public ObjLayoutDocsDescritivo As String' = "Descritivo/Tipo de documento"
	Public ObjLayoutDocsValidade As String' = "Validade"
	Public ObjLayoutDocsDataAlerta As String' = "Data Alerta"
	
'	felipe
	'ItemAddress
	Public ItemAddressTipoMorada As String' = "Tipo morada"
	Public ItemAddressEndereco As String' = "Endereço"
	Public ItemAddressContinua As String' = "(Continuação)"
	Public ItemAddressCPostal As String' = "Código postal"
	Public ItemAddressLatitude As String' = "Latitude"
	Public ItemAddressLongitude As String' = "Longitude"
	Public ItemAddressLocalidade As String' = "Localidade"
	
	'Vendas
	Public MsgStockActual As String' = "Stock Actual : "
	Public MsgStockHistorico As String' = "Stock Existente"
	
	'Alpedrinha
	Public noObjectForceExternalRequest As String 
	Public noMandatoryDataForceExternalRequest As String
	Public noMandatorySignaturesRequest As String
	
	Public ASExistsEditItQuestion As String' = "A Ação Subsequente já existe! Deseja alterar a mesma?"
	Public ASExistsNoEditInformation As String' = "A Ação Subsequente já existe e não é possível alterar a mesma!"
	
	'ProgressFialog2
	Public Pg2MsgProcessFotos As String' = "A processar fotos, aguarde por favor ..."
	Public Pg2MsgProcessDocs As String' = "A processar documento. Aguarde por favor ..."
	Public Pg2MsgEnviarDadosVerificacao As String' = "A enviar dados de verificação. Aguarde por favor..."
	Public Pg2MsgTerminarChk As String' = "A terminar checklist!"
	Public Pg2MsgProcessar As String' = "A processar..."
	
	'Jornada
	Public MsgUserStartJornada As String' = "Iniciar a jornada ?"
	Public MsgUserStopJornada As String' = "Terminar a jornada ?"
	Public MsgUserMessageJornadaActivo As String' = "Activo"
	Public MsgUserMessageJornadaInactivo As String' = "Inactivo"
	Public MsgUserMessageJornadaIndisponivel As String' = "Indisponível"
	
	'AppDialogs
	Public RevalidarIntervencao As String' = "Actualizar a Intervenção/Checklist no Back-Office ?"
	
	'Variaveis diversas
	Public Sync_DisclaimerMestres As String' = "Esta opção vai efectuar uma re-instalação inicial, repondo todos os dados. Deve efectuar um Upload de dados antes de prosseguir."
	Public Intervencaoabertaduplicacao As String' = "A Intervenção tem de estar concluída para poder ser duplicada."
	Public CurrentSerchquery As String = ""
	Public AutoSyncFromLogin As Boolean = False
	Public GlobalReportviewSleepTimer As Int = 50
End Sub

Sub SetAnimation(InAnimation As String, OutAnimation As String)
	
#if b4a
	Dim r As Reflector
	Dim package As String
	Dim In, out As Int
	package = r.GetStaticField("anywheresoftware.b4a.BA", "packageName")
	In = r.GetStaticField(package & ".R$anim", InAnimation)
	out = r.GetStaticField(package & ".R$anim", OutAnimation)
	r.Target = r.GetActivity
	r.RunMethod4("overridePendingTransition", Array As Object(In, out), Array As String("java.lang.int", "java.lang.int"))
#end if
End Sub

Sub AwakeDevice(activate As Boolean)
	
	Dim phk As PhoneWakeState
	phk.ReleaseKeepAlive
	
	If activate Then
		phk.KeepAlive(True)
	End If
	
End Sub

Sub FadeInFadeOutAnimation
	SetAnimation("fade_in", "fade_out")
End Sub


Sub CheckTranslations(Language As String)
	
	Dim DictionaryFile As String = $"dictionary.${Language.ToLowerCase}"$
	Dim TranslationEncoding As String = "Windows-1252"
	
	'*******************************************************************************************************
	' DEFINIR A LINGUAGEM DO UTILIZADOR, PASSADA NA ESTRUTURA DO USER
	' LENDO O FICHEIRO dictionary.XX para o MAP TRANSLATION_FILE
	' E ATRIBUINDO AS KEYS AS VARIAVEIS DE TEXTO DO SHARECODE PARA PREENCHIMENTO DAS VIEWS E MENSAGENS
	' VERIFICAR SE O FICHEIRO PERTINENTE EXISTE EM DirInternal, SE NAO COPIAR DO DirAssets
	' SE NAO EXISTIR USA OS VALOR POR DEFEITO
	'*******************************************************************************************************
	'DictionaryFile = "dictionary.es"
	
	If Not(File.Exists(File.DirInternal, DictionaryFile)) Then
		
		If Not(File.Exists(File.DirAssets, DictionaryFile)) Then
			DictionaryFile = "dictionary.pt"
			File.Copy(File.DirAssets, DictionaryFile, File.DirInternal, DictionaryFile )
		Else
			File.Copy(File.DirAssets, DictionaryFile, File.DirInternal, DictionaryFile )
		End If

	End If
	
	If File.Exists(File.DirInternal,DictionaryFile) Then
		TRANSLATION_FILE = File.ReadMap(File.DirInternal,DictionaryFile)
		Dim TRFILE_SIZE As Int = TRANSLATION_FILE.Size + 1
		
		Log("==================================================================")
		Log($" DIC : ${DictionaryFile} com ${TRFILE_SIZE} ENTRADAS"$)
		Log("==================================================================")
		
		MainOption_Request=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_REQUEST"),"")
		MainOption_Alerts=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_ALERTS"),"")
		MainOption_KPI=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_KPI"),"")
		MainOption_Tasks=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_TASKS"),"")
		MainOption_Objects=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_OBJECTS"),"")
		MainOption_User=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_USER"),"")
		MainOption_Planning=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINOPTION_PLANNING"),"")
		
		TABGeneral_ListingTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_LISTINGTITLE"),"")
		TABGeneral_Requests=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_REQUESTS"),"")
		TABGeneral_MapTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_MAPTITLE"),"")
		TABGeneral_CalendarTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_CALENDARTITLE"),"")
		TABGeneral_TypeRequestsTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_TYPEREQUESTSTITLE"),"")
		TABGeneral_ChecklistTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_CHECKLISTTITLE"),"")
		TABGeneral_ActionsTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TABGENERAL_ACTIONSTITLE"),"")

		CurrentRequestFilter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CURRENTREQUESTFILTER"),"")
		CurrentObjectFilter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CURRENTOBJECTFILTER"),"")

		Option_YES=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_YES"),"")
		Option_YESEXEC=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_YESEXEC"),"")
		Option_NO=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_NO"),"")
		Option_VIEW=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_VIEW"),"")
		Option_CANCEL=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_CANCEL"),"")
		
		Option_MANUAL=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_MANUAL"),"Manual")
		Option_AUTOMATICO=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_AUTOMATICO"),"Automático")
		
		Option_CREATE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_CREATE"),"")
		Option_DUPLICATE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_DUPLICATE"),"")
		Option_CONFIRM=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_CONFIRM"),"")
		Option_CONTINUE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_CONTINUE"),"")
		Option_TRY=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_TRY"),"")
		Option_CANCELEXIT=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_CANCELEXIT"),"")
		Option_BACKLOGIN=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_BACKLOGIN"),"")
		Option_MAKE_REPORT=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_MAKE_REPORT"),"")
		Option_ADD_TASK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_ADD_TASK"),"")
		Option_CLOSE_REQUEST=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_CLOSE_REQUEST"),"")
		Option_RESOURCE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_RESOURCE"),"")
		Option_ACTION=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_ACTION"),"")
		Option_EXITSAVE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_EXITSAVE"),"")
		Option_EXITNOSAVE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_EXITNOSAVE"),"")
		Option_BACK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_BACK"),"")
		Option_SENDEMAIL=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_SENDEMAIL"),"")
		Option_MAKEALERT=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_MAKEALERT"),"")
		Option_REOPEN=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_REOPEN"),"")
		Option_VIEW=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_VIEW"),"")
		Option_REQUESTS=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_REQUESTS"),"")
		Option_SAVEEXIT=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_SAVEEXIT"),"")
		
		
		Option_COMPLIANT=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_COMPLIANT"),"")
		Option_NOTCOMPLIANT=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_NOTCOMPLIANT"),"")
		Option_NOTAPPLICABLE=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OPTION_NOTAPPLICABLE"),"")

		GeneralLoadingMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALLOADINGMESSAGE"),"")
		GeneralCheckUpdates=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALCHECKUPDATES"),"")
		GeneralVerificationMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALVERIFICATIONMESSAGE"),"")

		GeneralAlertTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALALERTTITLE"),"")
		GeneralErrorTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALERRORTITLE"),"")
		GeneralNoteTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALNOTETITLE"),"")
		GeneralInfoTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALINFOTITLE"),"")
		GeneralAtentionTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALATTENTIONTITLE"),"")
		GeneralWaitPlease=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("GENERALWAITPLEASE"),"Aguarde por favor !")
		

		OffLineMessage_Confirm=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OFFLINEMESSAGE_CONFIRM"),"")
		UpdateAvailableMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("UPDATEAVAILABLEMESSAGE"),"")
		ConnectionBreak=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CONNECTIONBREAK"),"")

		AuthorizationData_NoConnection_Validate=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_NOCONNECTION_VALIDATE"),"")
		AuthorizationData_Registered=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_REGISTERED"),"")
		AuthorizationData_RegisteredError=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_REGISTEREDERROR"),"")
		AuthorizationData_Reset=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_RESET"),"")
		AuthorizationData_Invalid=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_INVALID"),"")
		AuthorizationData_NoServer=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_NOSERVER"),"")
		AuthorizationData_NoData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AUTHORIZATIONDATA_NODATA"),"")

		LoginResetNoConnection=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINRESETNOCONNECTION"),"")
		LoginResetMessage_OK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINRESETMESSAGE_OK"),"")
		LoginResetMessage_REJECTED=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINRESETMESSAGE_REJECTED"),"")
		LoginResetMessage_NOTOK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINRESETMESSAGE_NOTOK"),"")
		LoginResetServerError=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINRESETSERVERERROR"),"")
		LoginResetExists=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINRESETEXISTS"),"")

		RemoveRecordConfirm=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REMOVERECORDCONFIRM"),"")

		LoginMessage_OK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINMESSAGE_OK"),"")
		LoginMessage_NOTOK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINMESSAGE_NOTOK"),"")
		LoginServerError=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGINSERVERERROR"),"")
		Login_NoData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOGIN_NODATA"),"")

		AllFieldsMandatoryMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALLFIELDSMANDATORYMESSAGE"),"")
		NoItemsFoundMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("NOITEMSFOUNDMESSAGE"),"")
		UserGoAvailableMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERGOAVAILABLEMESSAGE"),"")
		RUN_Action_Confirm=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("RUN_ACTION_CONFIRM"),"")
		ExitEditNotSaved=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("EXITEDITNOTSAVED"),"")

		SavePictureToResoucesFolder=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("SAVEPICTURETORESOUCESFOLDER"),"")
		SavePictureToCLAItem=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("SAVEPICTURETOCLAITEM"),"")

		TopRequestActionMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TOPREQUESTACTIONMESSAGE"),"")
		LoadingRequestMessage=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOADINGREQUESTMESSAGE"),"")

		ActionSubEditTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ACTIONSUBEDITTITLE"),"")
		ActionSubNewTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ACTIONSUBNEWTITLE"),"")

		RequestStartCLAExecution=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSTARTCLAEXECUTION"),"")
		RequestStartCLAClosed=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSTARTCLACLOSED"),"")
		RequestStartCLAClosedView=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSTARTCLACLOSEDVIEW"),"")

		CLAImageRemove=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CLAIMAGEREMOVE"),"")
		OrientationChange=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ORIENTATIONCHANGE"),"")
		UserWorkSessionChange=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERWORKSESSIONCHANGE"),"")
		ApplicationExit=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPLICATIONEXIT"),"")

		LocalizationErrorText=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOCALIZATIONERRORTEXT"),"")
		LocalizationErrorTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("LOCALIZATIONERRORTITLE"),"")
		POPUPMENU_SyncManual=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_SYNCMANUAL"),"Escolha o metodo de Sincronização")
		POPUPMENU_MainPopMenuSync=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINPOPMENUSYNC"),"")
		POPUPMENU_MainDataValidation=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINDATAVALIDATION"),"")
		POPUPMENU_MainPopMenuCompany=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINPOPMENUCOMPANY"),"")
		POPUPMENU_MainPopMenuPushRequest=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINPOPMENUPUSHREQUEST"),"")
		POPUPMENU_MainPopMenuLoginChange=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINPOPMENULOGINCHANGE"),"")
		POPUPMENU_MainDeviceInfoPopMenu=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINDEVICEINFOPOPMENU"),"")
		POPUPMENU_MainInstallApk=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAININSTALLAPK"),"")
		MsgNaoExistemActualizacoes=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGNAOEXISTEMACTUALIZACOES"),"Não foram encontradas actualizações..")
		POPUPMENU_MainDevicePrint=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINDEVICEPRINT"),"")
		POPUPMENU_MainPopMenuExit=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("POPUPMENU_MAINPOPMENUEXIT"),"")

		AvisoPrepararChecklist=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOPREPARARCHECKLIST"),"")
		AvisoAguarde=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOAGUARDE"),"")
		AvisoErroComms=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOERROCOMMS"),"")
		AvisoIniciarPausa=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINICIARPAUSA"),"")
		AvisoPararPausa=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOPARARPAUSA"),"")
		AvisoEnviarDadosCheck=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOENVIARDADOSCHECK"),"")
		AvisoErroEnviarDadosCheck=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOERROENVIARDADOSCHECK"),"")
		AvisoNoSync=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISONOSYNC"),"")
		AvisoOperacaoConcluida=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOOPERACAOCONCLUIDA"),"")
		AvisoIntervencaoSemDados=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINTERVENCAOSEMDADOS"),"")
		
		MsgUpdateTitlePasso1PrimeiraInstalacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEPASSO1PRIMEIRAINSTALACAO"),"Configuração do sistema : Mestres")
		MsgUpdateTitlePasso2PrimeiraInstalacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEPASSO2PRIMEIRAINSTALACAO"), "Configuração do sistema : Cabeçalhos")
		MsgUpdateTitlePasso3PrimeiraInstalacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEPASSO3PRIMEIRAINSTALACAO"),"Configuração do sistema : Diários")
		MsgUpdateTitleSincronizacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLESINCRONIZACAO"),"Configuração do sistema : Mestres")
		MsgUpdateTitleActualizacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEACTUALIZACAO"),"A actualizar dados,  aguarde por favor.")
		MsgUpdateTitleObterInfo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEOBTERINFO"),"A obter informação do servidor ...")
		MsgUpdateTitleDownloadDados=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEDOWNLOADDADOS"), "A descarregar ficheiros de dados do servidor ...")
		MsgUpdateTitleDownloadDadosExtra=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEDOWNLOADDADOSEXTRA"),"")
		MsgUpdateTitleCarregarDados=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLECARREGARDADOS"), "A carregar dados na BD local ...")
		MsgDeleteTypeTabelas=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDELETETYPETABELAS"),"A eliminar dados antigos das tabelas...")
		MsgUpdateTitleUploadDados=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATETITLEUPLOADDADOS"),"")
		MsgDataUpdateProcessInicial=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDATAUPDATEPROCESSINICIAL"),"")
		MsgDataUpdateProcessIntermedio=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDATAUPDATEPROCESSINTERMEDIO"),"")
		MsgDataUpdateProcessFinal=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDATAUPDATEPROCESSFINAL"),"")
		MsgDataUpdateProcessConcluido=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDATAUPDATEPROCESSCONCLUIDO"),"")
		MsgDataUpdateProcessSync=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDATAUPDATEPROCESSSYNC"),"")
		MsgDataUpdateProcedimentos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGDATAUPDATEPROCEDIMENTOS"),"")
		MsgInstalacaoInicialBD=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGINSTALACAOINICIALBD"),"Instalação inicial da base de dados")
		MsgErroProc60last7new=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGERROPROC00LAST7NEW"),"")
		MsgAvisoEmailAlerta=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGAVISOEMAILALERTA"),"Envio de email registado. Confirme o estado de envio em Alertas da página principal")
				
		AvisoNaoFoiPossivelActServer=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISONAOFOIPOSSIVELACTSERVER"),"")
		MsgUpdateErroActualizar=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUPDATEERROACTUALIZAR"),"")
		MsgSendDataServer=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGSENDDATASERVER"),"Enviando dados para o Servidor")
		MsgExecProcAct=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGEXECPROCACT"),"")
		AvisoDadospersistemNaoUpd=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISODADOSPERSISTEMNAOUPD"),"")
		
		AvisoDownloadAPK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISODOWNLOADAPK"),"")
		AvisoNotSDCard=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISONOTSDCARD"),"")
		AvisoInstalarApp=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINSTALARAPP"),"")
		AvisoInstalarFontes1=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINSTALARFONTES1"),"")
		AvisoInstalarFontes2=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINSTALARFONTES2"),"")
		AvisoInstalarFontes3=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINSTALARFONTES3"),"")
		AvisoIniciarApp=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOINICIARAPP"),"")
		AvisoSMSSent=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOSMSSENT"),"")
		AvisoSMSNotSent=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOSMSNOTSENT"),"")
		
		AvisoToastSemInfoTarefa=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOTOASTSEMINFOTAREFA"),"")
		AvisoToastNoUpdateServer=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOTOASTNOUPDATESERVE"),"")
		AvisoToastEmailSent=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOTOASTEMAILSENT"),"")
		AvisoToastEmailNotSent=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISOTOASTEMAILNOTSENT"),"")
		
		DataUpdateLabelCopyData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("DATAUPDATELABELCOPYDATA"),"")
		DataUpdateLabelLoadData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("DATAUPDATELABELLOADDATA"),"")
		DataUpdateLabelDownloadData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("DATAUPDATELABELDOWNLOADDATA"),"")
		DataUpdateLabelUpdateProcess=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("DATAUPDATELABELUPDATEPROCESS"),"")
		DataUpdateButtonWelcomeNext=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("DATAUPDATEBUTTONWELCOMENEXT"),"")
		
		mainlayoutmainFirstInstall=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTMAINFIRSTINSTALL"),"")
		mainlayoutButtonLoginEnter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTBUTTONLOGINENTER"),"")
		mainlayoutButtonLoginExit=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTBUTTONLOGINEXIT"),"")
		mainlayoutButtonLoginReset=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTBUTTONLOGINRESET"),"")
		
		mainlayoutLabelTituloCredenciais=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELTITULOCREDENCIAIS"),"")
		mainlayoutLabelControloAcesso=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELCONTROLOACESSO"),"")
		mainlayoutLabelNomeUtilizador=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELNOMEUTILIZADOR"),"")
		mainlayoutLabelPasswordUtilizador=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELPASSWORSUTILIZADOR"),"")
		
		mainlayoutLabelWelcomeWarning=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELWELCOMEWARNING"),"")
		mainlayoutLabelWelcomeEvolutionCheck=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLAVELWELCOMEEVOLUTIONCHECK"),"")
		mainlayoutButtonAuthBack=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTBUTTONAUTHBACK"),"")
		mainlayoutButtonAuthNext=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTBUTTONAUTHNEXT"),"")
		mainlayoutButtonWelcomeNext=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTBUTTONWELCOMENEXT"),"")
		mainlayoutLabelHelpAutorizacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELHELPAUTORIZACAO"),"")
		mainlayoutLabelAutorizacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELAUTORIZACAO"),"")
		mainlayoutLabelCodigoInstancia=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELCODIGOINSTANCIA"),"")
		mainlayoutLabelCodigoAutorizacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELCODIGOAUTORIZACAO"),"")
		mainlayoutLabelValidacaoLogin=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELVALIDACAOLOGIN"),"")
		mainlayoutLabelValidacaoAcesso=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELVALIDACAOACESSO"),"")
		mainlayoutLabelCheckValidacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELCHECKVALIDACAO"),"")
		mainlayoutLabelVerificacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTLABELVERIFICACAO"),"")
		mainlayoutAskSair=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINLAYOUTASKSAIR"),"")
		
		requestsEditSearch=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSEDITSEARCH"),"")
		requestslistview=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSLISTVIEW"),"")
		Requestslistviewrequest=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSLISTVIEWREQUEST"),"")
		requestsMapview=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSMAPVIEW"),"")
		requestsLabelButtonTitleAction=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSLABELBUTTONTITLEACTION"),"")
		requestsLabelReferenciasDescritivos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSLABELREFERENCIASDESCRITIVOS"),"")
		requestsLabelStatus=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSLABELSTATUS"),"")
		requestsErroCriarChecklist=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSERROCRIARCHECKLIST"),"")
		requestsErroDownalodIntervencao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSERRODOWNLOADINTERCAOCAO"),"")
		requestsavisosemdados=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REQUESTSAVISOSEMDADOS"),"")
		
		tarefasLabelTitulos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TAREFASLABELTITULOS"),"")
		tarefasLabelUltimoUpd=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TAREFASLABELULTIMOUPD"),"")
		tarefasLabelTResultado=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TAREFASLABELTRESULTADO"),"")
		tarefasavisoInfoDescritiva=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TAREFASAVISOINFODESCRITIVA"),"")
		
		mainmenuLabelAvisoProcessamento=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAINMENULABELAVISOPROCESSAMENTO"),"")
		maimenuproblemaatribuicao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MAIMENUPROBLEMAATRIBUICAO"),"")
		TAB_tasks_procedures=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("TAB_TASKS_PROCEDURES"),"")
		
		checklistmainLabelOptLists=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTMAINLABELOPTLISTS"),"")
		checklistTabButtonChangeObject=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTTABBUTTONCHANGEOBJECT"),"")
		checklistTabButtonChangeChecklist=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTTABBUTTONCHANGECHECKLIST"),"")
		checklistTabButtonChangeTerminate=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTTABBUTTONCHANGETERMINATE"),"")
		checklistbutChecklistRunEnd=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTBUTCHECKLISTRUNEND"),"")
		checklistbutChecklistReport=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTBUTCHECKLISTREPORT"),"")
		checklistbutChecklistSendReport=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTBUTCHECKLISTSENDREPORT"),"")
		checklistavisoterminarchecklist=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISOTERMINARCHECKLIST"),"")
		checklistavisonaoterminada=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISONAOTERMINADA"),"")
		checklistavisogeracaorelatorio=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISOGERACAORELATORIO"),"")
		checklistavisosemobjectos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISOSEMOBJECTOS"),"")
		checklisterrodesassociar=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTERRODESASSOCIAR"),"")
		checklistobjectodesassociado=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTOBJECTODESASSOCIADO"),"")
		checklistimagembasenaopode=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTIMAGEMBASENAOPODE"),"")
		checklistavisonaopermitealteracao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISONAOPERMITEALTERACAO"),"")
		checklistavisonaopermiteremocao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISONAOPERMITEREMOCAO"),"")
		checklistavisonaoepossivelremover=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTAVISONAOEPOSSIVELREMOVER"),"")
		checklistperguntaassociarobjecto1=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTPERGUNTAASSOCIAROBJECTO1"),"")
		checklistperguntaassociarobjecto2=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTPERGUNTAASSOCIAROBJECTO2"),"")
		checklistperguntaassociarobjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTPERGUNTAASSOCIAROBJECTO"),"")
		checklistselecaoobjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTSELECAOOBJECTO"),"")
		checklistlistnaoconformidades=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLISTNAOCONFORMIDADES"),"")
		checklistllblTemposExecucao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLTEMPOSEXECUCAO"),"")
		checklistllblInicio=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLINICIO"),"")
		checklistllblFim=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLFIM"),"")
		checklistllblDuracao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLDURACAO"),"")
		checklistllblPausa=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLPAUSA"),"")
		checklistllblResultado=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLRESULTADO"),"")
		checklistllblTotal=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLLBLTOTAL"),"")
		checklistlFinalObsHint=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLFINALOBSHINT"),"")
		checklistlButtonFINSignatures=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLBUTTONFINSIGNATURES"),"")
		checklistlButtonFINActionButton=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLBUTTONFINACTIONBUTTON"),"")
		checklistclFinaltopTitle=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTCLFINALTOPTITLE"),"")
		checklistLabelGrupo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELGRUPO"),"")
		checklistLabelTipoObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELTIPOOBJECTO"),"")
		checklistLabelDescritivo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELDESCRITIVO"),"")
		checklistLabelReferenciaObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELREFERENCIAOBJECTO"),"")
		checklistLabelCodigoInternObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELCODIGOINTERNOBJECTO"),"")
		checklistbutChangeObject=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTBUTCHANGEOBJECT"),"")
		checklistbutDessociateObject=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTBUTDESSOCIATEOBJECT"),"")
		checklistbutAssociateObject=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTBUTASSOCIATEOBJECT"),"")
		checklistLabelSeleccioneObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELSELECCIONEOBJECTO"),"")
		checklistErroacesso=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTERROACESSO"),"")
		checklistDadosObjectoMoradas=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTDADOSOBJECTOMORADAS"),"")
		checklistDadosObjectoContactos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTDADOSOBJECTOCONTACTOS"),"")
		checklistDadosObjectoCamposObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTDADOSOBJECTOCAMPOSOBJECTO"),"")
		checklistDadosObjectoDocumentosObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTDADOSOBJECTODOCUMENTOSOBJECTO"),"")
		checklistLabelImagemObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELIMAGEMOBJECTO"),"")
		checklistLabelEscolhaTipoObjecto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTLABELESCOLHATIPOOBJECTO"),"")
		checklistassinaturasobrigatorias=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTASSINATURASOBRIGATORIAS"),"Têm de existir assinatura(s) para poder concluir a intervenção !")
		checklistenviardados2BO =Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("CHECKLISTENVIARDADOS2BO"),"A enviar dados para o servidor. Por favor aguarde !")
		AppDialogsFilterLabelTipoIntervencao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELTIPOINTERVENCAO"),"")
		AppDialogsFilterLabelEntidade=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELENTIDADE"),"")
		AppDialogsFilterLabelEstadosIntervencao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELESTADOSINTERVENCAO"),"")
		AppDialogsFilterLabelDataInicio=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELDATAINICIO"),"")
		AppDialogsFilterLabelDataFim=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELDATAFIM"),"")
		AppDialogsFilterLabelTipoChecklist=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELTIPOCHECKLIST"),"")
		AppDialogsFilterLabelRota=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSFILTERLABELROTA"),"")
		AppDialogsCriadasIntervencoesObjectos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSCRIADASINTERVENCOESOBJECTOS"),"")
		AppDialogsNaoVerificadoTipoIntervencao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSNAOVERIFICADOTIPOINTERVENCAO"),"")
		AppDialogsEdicao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSEDICAO"),"")
		AppDialogsNovo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("APPDIALOGSNOVO"),"")
	
		AvisoNovoAPK=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("AVISONOVOAPK"),"")
		
		reportsMsgProcessar=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGPROCESSAR"),"")
		reportsErroLerFicheiro=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSERROLERFICHEIRO"),"")
		reportsMsgPrepararPDF=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGPREPARARPDF"),"")
		reportsErroEnviarEmail=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSERROENVIAREMAIL"),"")
		reportsMsgEnviarEmail=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGENVIAREMAIL"),"")
		reportsErroEmail=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSERROEMAIL"),"")
		reportsMsgGeralRelatorio=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERALRELATORIO"),"")
		reportsMsgGeralRelatorioCarregaFicheiro=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERALRELATORIOCARREGAFICHEIRO"),"")
		reportsErroTamanhoExcessivo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSERROTAMANHOEXCESSIVO"),"")
		reportsErroAbrirTemplate=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSERROABRIRTEMPLATE"),"")
		reportsMsgGerarEquipamentos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERAREQUIPAMENTOS"),"")
		reportsMsgGerarGeral=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERARGERAL"),"")
		reportsMsgGerarNaoConformidades=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERARNAOCONFORMIDADES"),"")
		reportsMsgGerarSumario=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERARSUMARIO"),"")
		reportsMsgGerarArquivo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGGERARARQUIVO"),"")
		reportsMsgFuncionalidadeNCFG=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSMSGFUNCIONALIDADENCFG"),"")
		
		
		usermakeavalilable=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERMAKEAVALILABLE"),"")
		userfilenoindentified=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERFILENOINDENTIFIED"),"")
		userfilewithproblems=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERFILEWITHPROBLEMS"),"")
		userfileunavailable=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERFILEUNAVAILABLE"),"")
		userErroRemoveOwnUser=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERERROREMOVEOWNUSER"),"")
		userSelectedUserNoRemove=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERSELECTEDUSERNOREMOVE"),"")
		userAskRemoveUser=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERASKREMOVEUSER"),"")
		userNoEquipments=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERNOEQUIPMENTS"),"")
		userNoVehicles=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERNOVEHICLES"),"")
		userAskRemoveEquipment=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERASKREMOVEEQUIPMENT"),"")
		userAskConfirmProducts=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERASKCONFIRMPRODUCTS"),"")
		userOptionConfirmProduct=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USEROPTIONCONFIRMPRODUCT"),"")
		userAskConfirmUserData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERASKCONFIRMUSERDATA"),"")
		userAguardeumMomento=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERAGUARDEUMMOMENTO"),"")
		userAskProductAusente=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERASKPRODUCTAUSENTE"),"")
		userOptionSimAusente=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USEROPTIONSIMAUSENTE"),"")
		userOptionOutrasRazoes=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USEROPTIONOUTRASRAZOES"),"")
		userNoEquipmentsReplace=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERNOEQUIPMENTSREPLACE"),"")
		userOptionVerAccao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USEROPTIONVERACCAO"),"")
		userOptionReExecuteAccao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USEROPTIONREEXECUTEACCAO"),"")
		userChoiceOptionAvailable=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERCHOICEOPTIONAVAILABLE"),"")
		userAlreadyRegistered=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERALREADYREGISTERED"),"")
		userIncorrectInfo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERINCORRECTINFO"),"")
		userInvalidLogin=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERINVALIDLOGIN"),"")
		userCodeandPasswordMandatory=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERCODEANDPASSWORDMANDATORY"),"")
		usermainLabelOptListsUser=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERMAINLABELOPTLISTSUSER"),"")
		usermainLabelOptListsDocs=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERMAINLABELOPTLISTSDOCS"),"")
		usermainLabelOptListsCons=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERMAINLABELOPTLISTSCONS"),"")
		usermainLabelOptListsOper=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERMAINLABELOPTLISTSOPER"),"")
		userchapterEquip=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERCHAPTEREQUIP"),"")
		userchapterViatura=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERCHAPTERVIATURA"),"")
		userchapterUsers=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERCHAPTERUSERS"),"")
		userbutUserConfirmData=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERBUTUSERCONFIRMDATA"),"")
		userbutUserPauseAction=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERBUTUSERPAUSEACTION"),"")
		userbutUserUnavailable=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERBUTUSERUNAVAILABLE"),"")
		useruserLabelFoto=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERUSERLABELFOTO"),"")
		useruserLabelNome=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERUSERLABELNOME"),"")
		useruserLabelOrganizacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERUSERLABELORGANIZACAO"),"")
		useruserLabelCategoria=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERUSERLABELCATEGORIA"),"")
		useruserLabelCodigoUser=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERUSERLABELCODIGOUSER"),"")
		userlayoutpanelOper=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERLAYOUTPANELOPER"),"")
		userlayoutpanelDocsOrg=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERLAYOUTPANELDOCSORG"),"")
		userlayoutpanelConsum=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERLAYOUTPANELCONSUM"),"")
		
		userdurationsHoje=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERDURATIONSHOJE"),"")
		userdurationsVarios=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERDURATIONSVARIOS"),"")
		userreasonsMedico=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERREASONSMEDICO"),"")
		userreasonsAssist=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERREASONSASSIST"),"")
		userreasonsDoente=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERREASONSDOENTE"),"")
		userreasonsOutras=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("USERREASONSOUTRAS"),"")
		
		reportsLabelEstadoPedidos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSLABELESTADOPEDIDOS"),"")
		reportsLabelPeriodo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSLABELPERIODO"),"")
		reportsLabelKPIDescricao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSLABELKPIDESCRICAO"),"")
		reportsLabelValor=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSLABELVALOR"),"")
		reportsLabelKPIOutrosIndicadores=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSLABELKPIOUTROSINDICADORES"),"")
		reportsLabelKPIComparacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSLABELKPICOMPARACAO"),"")
		reportsIndicadoresDia=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSINDICADORESDIA"),"")
		reportsIndicadoresComparacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REPORTSINDICADORESCOMPARACAO"),"")
		
		alertslabeln=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSLABELN"),"")
		alertsLabelStatus=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSLABELSTATUS"),"")
		alertsLabelDescricaoAlerta=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSLABELDESCRICAOALERTA"),"")
		alertslabelTypeObjectFilter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSLABELTYPEOBJECTFILTER"),"")
		alertsChapterSistema=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSCHAPTERSISTEMA"),"")
		alertsChapterTarefas=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSCHAPTERTAREFAS"),"")
		alertsChapterInter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ALERTSCHAPTERINTER"),"")
		
		objectsAvisoPedidoSemInfo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTSAVISOPEDIDOSEMINFO"),"")
		objectsMsgConfirmaatribuicaoasi=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTSMSGCONFIRMAATRIBUICAOASI"),"")
		objectMsgPrepararInter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTMSGPREPARARINTER"),"")
		objectObjLabelObjectos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTOBJLABELOBJECTOS"),"")
		objectObjLabelMorada=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTOBJLABELMORADA"),"")
		objectObjLabelStatus=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTOBJLABELSTATUS"),"")
		objectObjLabelLocal=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJECTOBJLABELLOCAL"),"")
		ObjLabelObjRequestTipoInter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLABELOBJREQUESTTIPOINTER"),"")
		ObjLabelObjRequestConcelho=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLABELOBJREQUESTCONCELHO"),"")
		ObjLabelObjRequestDistrito=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLABELOBJREQUESTDISTRITO"),"")
		ObjLabelObjRequestPLivre=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLABELOBJREQUESTPLIVRE"),"")
		ObjLabelObjRequestTipoGrupoInter=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLABELOBJREQUESTTIPOGRUPOINTER"),"")
		ObjListItemRequestHeader=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLISTITEMREQUESTHEADER"),"")
		ObjListItemActionHeader=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLISTITEMACTIONHEADER"),"")
		ObjLayoutsGeral=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTSGERAL"),"")
		ObjLayoutsRelacoes=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTSRELACOES"),"")
		ObjLayoutsDocumentos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTSDOCUMENTOS"),"")
		ObjLayoutsIntervencoes=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTSINTERVENCOES"),"")
		ObjLayoutDocsDescritivo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTDOCSDESCRITIVO"),"")
		ObjLayoutDocsValidade=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTDOCSVALIDADE"),"")
		ObjLayoutDocsDataAlerta=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("OBJLAYOUTDOCSDATAALERTA"),"")
		
		ItemAddressTipoMorada=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSTIPOMORADA"),"")
		ItemAddressEndereco=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSENDERECO"),"")
		ItemAddressContinua=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSCONTINUA"),"")
		ItemAddressCPostal=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSCPOSTAL"),"")
		ItemAddressLatitude=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSLATITUDE"),"")
		ItemAddressLongitude=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSLONGITUDE"),"")
		ItemAddressLocalidade=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ITEMADDRESSLOCALIDADE"),"")
		
		MsgStockActual=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGSTOCKACTUAL"),"")
		MsgStockHistorico=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGSTOCKHISTORICO"),"")

		noObjectForceExternalRequest=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("NOOBJECTFORCEEXTERNALREQUEST"), "Não existe objecto de análise associado (cliente, equipamento, ...)!")
		noMandatoryDataForceExternalRequest=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("NOMANDATORYDATAFORCEEXTERNALREQUEST"), "Existem dados obrigatórios por responder! Verifique e tente novamente.")
		noMandatorySignaturesRequest=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("NOMANDATORYSIGNATUREREQUEST"), "É necessário assinar para concluir a intervenção/checklist!")
								
		Pg2MsgProcessFotos=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("PG2MSGPROCESSFOTOS"), "A processar fotos, aguarde por favor ...")
		Pg2MsgProcessDocs=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("PG2MSGPROCESSDOCS"), "A processar documento. Aguarde por favor ...")
		Pg2MsgEnviarDadosVerificacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("PG2MSGENVIARDADOSVERIFICACAO"), "A enviar dados de verificação. Aguarde por favor...")
		Pg2MsgTerminarChk=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("PG2MSGTERMINARCHK"), "A terminar checklist!")
		Pg2MsgProcessar=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("PG2MSGPROCESSAR"), "A processar...")
		
		MsgUserStartJornada=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUSERSTARTJORNADA"),"Iniciar a jornada ?")
		MsgUserStopJornada=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUSERSTOPJORNADA"),"Terminar a jornada ?")
		MsgUserMessageJornadaActivo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUSERMESSAGEJORNADAACTIVO"),"Activo")
		MsgUserMessageJornadaInactivo=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUSERMESSAGEJORNADAINACTIVO"),"Inactivo")
		MsgUserMessageJornadaIndisponivel=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("MSGUSERMESSAGEJORNADAINDISPONIVEL"),"Indisponível")
		RevalidarIntervencao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("REVALIDARINTERVENCAO"),"Revalidar Intervenção/Checklist")
		Sync_DisclaimerMestres=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("SYNC_DISCLAIMERMESTRES"),"Esta opção vai efectuar uma re-instalação inicial, repondo todos os dados. Deve efectuar um Upload de dados antes de prosseguir.")
		Intervencaoabertaduplicacao=Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("INTERVENCAOABERTADUPLICACAO"),"A Intervenção tem de estar concluída para poder ser duplicada.")
		
		ASExistsEditItQuestion = Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ASEXISTSEDITITQUESTION"), _
								"A Ação Subsequente já existe! Deseja alterar a mesma?")
		ASExistsNoEditInformation = Utils.IfNullOrEmpty(TRANSLATION_FILE.Get("ASEXISTSNOEDITINFORMATION"), _
								"A Ação Subsequente já existe e não é possível alterar a mesma!")
	Else
		
		MainOption_Request = "Intervenções"
		MainOption_Alerts = "Alertas"
		MainOption_KPI = "Relatórios"
		MainOption_Tasks = "Tarefas"
		MainOption_Objects = "Objectos"
		MainOption_User = "Meus dados"
		MainOption_Planning = "Planeamento"
	
		TABGeneral_ListingTitle = "Listagem"
		TABGeneral_Requests = "Pedidos"
		TABGeneral_MapTitle = "Mapa"
		TABGeneral_CalendarTitle = "Calendário"
		TABGeneral_TypeRequestsTitle = "Intervenções"
		TABGeneral_ChecklistTitle = "Checklists"
		TABGeneral_ActionsTitle = "Acções"
		
		CurrentRequestFilter = ""
		CurrentObjectFilter = ""
	
		Option_YES = "Sim"
		Option_YESEXEC = "Sim e executa"
		Option_NO = "Não"
		Option_VIEW = "Visualizar"
		Option_CANCEL = "Cancelar"
		Option_AUTOMATICO = "Automático"
		Option_MANUAL = "Manual"
		Option_CREATE = "Criar"
		Option_DUPLICATE = "Duplicar"
		Option_CONFIRM = "Confirmar"
		Option_CONTINUE = "Continuar"
		Option_TRY = "Tentar"
		Option_CANCELEXIT = "Cancelar e Sair"
		Option_BACKLOGIN = "Voltar ao login"
		Option_MAKE_REPORT = "Gerar relatório"
		Option_ADD_TASK = "Adicionar Tarefa"
		Option_CLOSE_REQUEST = "Concluir intervenção"
		Option_RESOURCE = "Repositório"
		Option_ACTION = "Acção"
		Option_EXITSAVE = "Gravar"
		Option_EXITNOSAVE = "Não gravar"
		Option_BACK = "Voltar"
		Option_SENDEMAIL = "Enviar email"
		Option_MAKEALERT = "Criar alerta"
		Option_REOPEN = "Reabrir"
		Option_VIEW = "Visualizar"
		Option_REQUESTS = "Intervenções"
		Option_SAVEEXIT = "Gravar e Sair"
		
		Option_COMPLIANT = "Conforme"
		Option_NOTCOMPLIANT = "Não Conforme"
		Option_NOTAPPLICABLE = "Não Aplicável"
	
		GeneralLoadingMessage = "A carregar informação ..."
		GeneralCheckUpdates = "A verificar/descarregar actualizações. Aguarde por favor. "
		GeneralVerificationMessage = "Em verificação ... aguarde!"
	
		GeneralAlertTitle = "Alerta!"
		GeneralErrorTitle = "Erro!"
		GeneralNoteTitle = "Nota!"
		GeneralInfoTitle = "Informação!"
		GeneralAtentionTitle = "Atenção!"
		GeneralWaitPlease = "Aguarde por favor!"
		
		OffLineMessage_Confirm = "Está a operar em OFFLINE. Deseja continuar mesmo assim?"
		UpdateAvailableMessage = "Foram detectadas actualizações disponíveis, deseja fazer a actualização? "
		ConnectionBreak = "O dispositivo detectou falha de comunicação. Poderá não ter rede ou acesso à Internet. A aplicação irá rodar em modo LOCAL até ao restabelecimento da comunicação."
		AuthorizationData_NoConnection_Validate = "Não existe comunicação à Internet e a aplicação não está licenciada. Sugerimos que verifique e confirme a ligação à Internet para poder proceguir com o registo da mesma."
		AuthorizationData_Registered = "Já exise um equipamento registado com esta chave de Autorização. Confirme com o Administrador de sistema e tente novamente."
		AuthorizationData_RegisteredError = "Ocurreu um erro no processo de registo da chave de Autorização. Por favor tente novamente. Em caso de persistência contacte o Administrador de sistema."
		AuthorizationData_Reset = "Está a proceder ao Reset/Reiniciar o Regsito da Alpicação. Este processo irá re-iniciar as tabelas locais e apagar todos os ficheiros gerados pela execução da aplicação. Tem a certeza de que deseja continuar com este procedimento?"
		AuthorizationData_Invalid = "Os dados introduzidos não estão correctos ou autorizados! Contacte o administrador de sistema ou tente novamente."
		AuthorizationData_NoServer = "A comunicação com o servidor devolveu um erro! Tente novamente ou contacte o administrador de sistema."
		AuthorizationData_NoData = "A informação de Instância e Autorização são obrigatórias! Por favor preencha os respectivos campos para continuar."
		LoginResetNoConnection = "Não existe comunicação com o servidor! Devderá tentar executar esta acção mais tarde ."
		LoginResetMessage_OK = "O pedido de reset foi efectuado com sucesso! Verifique o seu email para continuar."
		LoginResetMessage_REJECTED = "Pedido rejeitado/inválido! Deseja tentar novamente?"
		LoginResetMessage_NOTOK = "A alteração da palavra chave não foi bem sucedida! Deseja tentar novamente?"
		LoginResetServerError = "Houve erro de comunicação com o servidor e não foi possível proceder ao pedido de reset de password. Tente novamente."
		LoginResetExists = "Existe um pedido de RESET de password. Por favor aguarde por email de confirmação."
		RemoveRecordConfirm = "Deseja remover o registo seleccionado?"
	
		LoginMessage_OK = "OK"
		LoginMessage_NOTOK = "As credenciais introduzidas estão erradas, deseja tentar novamente?"
		LoginServerError = "Houve erro de comunicação com o servidor e não foi possível confirmar as credênciais. Tente novamente."
		Login_NoData = "O Código de Utilizador e respectiva palavra Chave são obrigatórias! Por favor preencha os respectivos campos para continuar."
	
		AllFieldsMandatoryMessage = "Todos os campos são obrigatórios! Preencha os campos e tente novamente."
		NoItemsFoundMessage = "No items found"
	
		UserGoAvailableMessage = "Deseja voltar ao estado de disponível?. Escolha SIM para continuar, NÃO para cancelar a operação."
		RUN_Action_Confirm = "Deseja iniciar/executar a tarefa?"
	
		ExitEditNotSaved = "Quaisquer alterações efectuadas não serão gravadas. Deseja continuar?"
		SavePictureToResoucesFolder = "Indique a operação que pretende realizar com a(s) imagem(ens) que acabou de tirar. REPOSITÓRIO - Grava cópia da(s) imagem(ns) no repositório local para posterior utilização (Uma notificação de alerta vai ser gerada)."
		SavePictureToCLAItem = "Escolha uma das opções disponíveis."
	
		TopRequestActionMessage = "Escolha uma das opções disponíveis."
	
		LoadingRequestMessage = "A carregar intervenção ..."
	
		ActionSubEditTitle = "Edição de Acção Subsequente"
		ActionSubNewTitle = "Nova de Acção Subsequente"
	
		RequestStartCLAExecution = "A Tarefa seleccionada ainda não foi iniciada. Deseja proceder à sua inicialização?"
		RequestStartCLAClosed = "A Tarefa seleccionada já foi concluída! Deseja reabrir a Tarefa ou apenas visualiza-la?"
		RequestStartCLAClosedView = "A Tarefa seleccionada já foi concluída! Deseja visualiza-la?"
		CLAImageRemove = "Selecionou a funcionalidade para remover imagem. Deseja remover a imagem selecionada?"
	
		OrientationChange = "A orientação do dispositivo foi alterada! Para proceder à alteração deverá re-iniciar a aplicação. Deseja efectuar o re-iniciar da aplicação já?"
		UserWorkSessionChange = "Confirma a alteração do utilizador em sessão?"
		ApplicationExit = "Escolheu a opção para sair da aplicação. Deseja continuar?"
	
		LocalizationErrorText = "Não foi possível detectar a sua localização," & CRLF & "Por favor active o GPS....."
		LocalizationErrorTitle = "Erro de Localização"
		
		'******************************************************************
		' TEXTOS DO MAIN / MAINMENU / USER / DATAUPDATE
		'******************************************************************
		POPUPMENU_SyncManual = "Escolha o metodo de Sincronização"
		POPUPMENU_MainPopMenuSync = "Sincronizar"
		POPUPMENU_MainDataValidation="Validar dados"
		POPUPMENU_MainPopMenuCompany = "Parametros do dispositivo"
		POPUPMENU_MainPopMenuPushRequest = "Puxar intervenção"
		POPUPMENU_MainPopMenuLoginChange = "Mudar de utilizador"
		POPUPMENU_MainDeviceInfoPopMenu = "Informação do dispositivo"
		POPUPMENU_MainInstallApk = "Instalação de Sistema"
		POPUPMENU_MainDevicePrint = "Impressão"
		POPUPMENU_MainPopMenuExit = "Sair"
		
		
		AvisoPrepararChecklist = "A criar/preparar execução de Checklist. Aguarde ..."
		AvisoAguarde = "Aguarde por favor ..."
		AvisoErroComms = "Erro de comunicação! Operação cancelada."
		AvisoIniciarPausa = "Escolheu a opção de pausa. Com esta opção activa não será possível realizar qualquer operação de Intervenção até que volte ao estado normal. Deseja continuar?"
		AvisoPararPausa = "Deseja parar a pausa e voltar ao estado normal de operação?"
		AvisoEnviarDadosCheck = "A enviar dados de verificação. Aguarde por favor..."
		AvisoErroEnviarDadosCheck = "Erro ao enviar dados de verificação Tente Novamente.... "
		AvisoNoSync = "Não é possível sincronizar dados com o servidor pois não existe rede de acesso!"
		AvisoOperacaoConcluida = "Operação concluída!"
		AvisoIntervencaoSemDados = "Esta intervenção não tem dados. Deseja descarregá-los ?"
		
		MsgUpdateTitleSincronizacao = "A Sincronizar dados,  aguarde por favor."
		MsgUpdateTitleActualizacao = "A actualizar dados,  aguarde por favor."
		MsgUpdateTitleObterInfo = "A obter informação do servidor ..."
		MsgSendDataServer = "Enviar dados para o servidor"
		MsgExecProcAct = "A executar procedimentos de actualização ..."
		MsgUpdateErroActualizar = "Erro ao actualizar..........."
		MsgUpdateTitleDownloadDados = "A descarregar ficheiros de dados do servidor ..."
		MsgUpdateTitleUploadDados = "Upload de ficheiros"
		MsgUpdateTitleDownloadDadosExtra = "A descarregar ficheiros complementares do servidor ..."
		MsgUpdateTitleCarregarDados = "A carregar dados na BD local ..."
		MsgDeleteTypeTabelas = "A eliminar dados antigos das tabelas..."
		MsgDataUpdateProcessInicial = "Processo 1/3 concluído!"
		MsgDataUpdateProcessIntermedio  = "Processo 2/3 concluído!"
		MsgDataUpdateProcessFinal = "Processo 3/3 concluído!"
		MsgUpdateTitlePasso1PrimeiraInstalacao = "Configuração do sistema : Mestres"
		MsgUpdateTitlePasso2PrimeiraInstalacao = "Configuração do sistema : Cabeçalhos"
		MsgUpdateTitlePasso3PrimeiraInstalacao = "Configuração do sistema : Diários"
		MsgDataUpdateProcessConcluido = "Processo concluído!"
		MsgDataUpdateProcessSync = "Sincronização concluída!"
		MsgDataUpdateProcedimentos  = "Procedimentos"
		MsgErroProc60last7new = "O servidor não gerou os ficheiros para Download"
		MsgNaoExistemActualizacoes = "Não foram encontradas actualizações.."
		MsgInstalacaoInicialBD = "Instalação inicial da base de dados"
		MsgAvisoEmailAlerta = "Envio de email registado. Confirme o estado de envio em Alertas da página principal"
		
		AvisoDadospersistemNaoUpd = "Alguns dados persistem em não actualizar o servidor. Esta operação vai finalizar! Por favor contacte o administrador de sistema para verificação da situação."
		AvisoNaoFoiPossivelActServer = "Não foi possível actualizar o Servidor"
		
		AvisoDownloadAPK = "Aguarde ! a transferir nova versão...."
		AvisoNotSDCard = "Cartão de armazenamento não está disponível. Certifique-se de que seu dispositivo não esteja conectado no modo de armazenamento USB."
		AvisoInstalarApp = "Por favor, permita instalar aplicações."
		AvisoInstalarFontes1 = "Por favor, permita a instalação de aplicações a partir de fontes desconhecidas"
		AvisoInstalarFontes2 = "Vai a Definições - Segurança - Fontes desconhecidas"
		AvisoInstalarFontes3 = "Ou Definições - Aplicações - Fontes desconhecidas"
		AvisoIniciarApp = "A iniciar a aplicação. Aguarde por favor."
		
		'ToastMessages
		AvisoToastSemInfoTarefa = "Erro !! Sem informação da tarefa"
		AvisoToastNoUpdateServer = "Não foi possível actualizar o Servidor"
		AvisoToastEmailSent = "Email enviado !"
		AvisoToastEmailNotSent = "Email não enviado !"
		
		AvisoSMSSent="SMS Enviado"
		AvisoSMSNotSent="O SMS não foi enviado"
		
		'Layouts
		'DataUpdate
		DataUpdateLabelCopyData = "Cópia de Dados"
		DataUpdateLabelLoadData = "Carregamento"
		DataUpdateLabelDownloadData = "Downloads"
		DataUpdateLabelUpdateProcess = "Processo"
		DataUpdateButtonWelcomeNext = "Continuar"
		
		'mainlayout_v2

		mainlayoutmainFirstInstall = "Primeira Instalação! Aguarde por favor, esta operação poderá demorar alguns minutos."
		mainlayoutButtonLoginEnter = "Continuar"
		mainlayoutButtonLoginExit = "Sair"
		mainlayoutButtonLoginReset = "Password"
		mainlayoutLabelTituloCredenciais = "Introduza as suas credenciais de acesso para aceder à aplicação ReadyCheckGo."
		mainlayoutLabelControloAcesso = "Controlo de Acesso"
		mainlayoutLabelNomeUtilizador = "Nome Utilizador"
		mainlayoutLabelPasswordUtilizador = "Palavra Passe"
		mainlayoutLabelWelcomeWarning = "Antes de poder executar e utilizar a aplicação, deverá verificar e confirmar algumas definições e autorizações.Por favor indique a língua e a orientação Do dispositivo que deseja/pretende utilizar.Note que estas definições poderão ser alteradas posteriormente em : 'Menu->Configurações de Sistema'."
		mainlayoutLabelWelcomeEvolutionCheck = "Bem vindo ao Vodafone ReadyCheckGo!"
		mainlayoutButtonAuthBack = "Voltar"
		mainlayoutButtonWelcomeNext = "Continuar"
		mainlayoutButtonAuthNext = "Continuar"
		mainlayoutLabelValidacaoLogin = "Aguarde por favor! A validar o código de Utilizador e a palavra Chave submetidas."
		mainlayoutLabelValidacaoAcesso = "Validação de Acesso"
		mainlayoutLabelCheckValidacao = "Aguarde por favor! A aplicação está a validar os dados de Verificação e Autorização na plataforma ReadyCheckGo. Uma vez submetidos e validados, esta informação deixará de ser apresentada."
		mainlayoutLabelVerificacao = "Verificação"
		mainlayoutAskSair = "Deseja sair da aplicação ?"

		'Requests
		requestsEditSearch = "Pesquisar"
		requestslistview = "Listagem"
		Requestslistviewrequest = "Intervenção"
		requestsMapview = "Mapa"
		requestsLabelButtonTitleAction = "Local/Acção"
		requestsLabelReferenciasDescritivos = "Referências/Descritivos"
		requestsLabelStatus = "Status"
		requestsErroCriarChecklist = "Erro na criação da tarefa/checklist seleccionada! Se o problema persistir, contacte o administrador de sistema para uma rapida resolução Do problema."
		requestsErroDownalodIntervencao = "Erro ao efectuar o download dos dados da intervenção"
		requestsavisosemdados = "Esta intervenção não tem dados. Deseja descarregá-los ?"
		
		'mainmenu
		mainmenuLabelAvisoProcessamento = "Em processamento. Aguarde por favor !"
		maimenuproblemaatribuicao = "Houve um problema na atribuição da Intervenção seleccionada. Repita o processo novamente. Se o problema persistir por favor contacte o administrador de sistema."
	
		'tarefas
		tarefasLabelTitulos = "Título da Checklist/Acção"
		tarefasLabelUltimoUpd = "Última actualização"
		tarefasavisoInfoDescritiva = "Informação descritiva da Tarefa"
		TAB_tasks_procedures = "Procedimentos"
		
		'checklist
		checklistmainLabelOptLists = "EXECUÇÃO DE TAREFA"
		checklistTabButtonChangeObject = "Dados Gerais"
		checklistTabButtonChangeChecklist = "Checklist"
		checklistTabButtonChangeTerminate = "Concluir"
		checklistbutChecklistRunEnd = "Terminar"
		checklistbutChecklistReport = "Gerar relatório"
		checklistbutChecklistSendReport = "Enviar relatório"
		checklistavisoterminarchecklist = "A terminar a checklist ..."
		checklistavisonaoterminada = "A Checklist não foi Terminada com a opção devida! Deseja proceder à Terminação da execução da Checklist?"
		checklistavisogeracaorelatorio = "A geração do relatório é obrigatória! Deseja proceder à sua geração?"
		checklistavisosemobjectos = "Não existem objectos Associados !"
		checklisterrodesassociar = "Não foi possivel desassociar o objecto !"
		checklistobjectodesassociado = "O Objecto foi Desassociado da checklist !"
		checklistimagembasenaopode = "A imagem seleccionada é uma imagem BASE e não pode ser apagada!"
		checklistavisonaopermitealteracao = "A Checklist não permite a alteração de Objectos !"
		checklistavisonaopermiteremocao = "A Checklist não permite a remoção de Objectos !"
		checklistavisonaoepossivelremover = "Não é possivel desassociar objectos na checklist principal !"
		checklistperguntaassociarobjecto1 = "Deseja associar "
		checklistperguntaassociarobjecto2 = " à Checklist?"
		checklistperguntaassociarobjecto = "Associar Objecto"
		checklistselecaoobjecto = "Selecção de Objecto"
		checklistlistnaoconformidades = "Lista de Não Conformidades"
		checklistclFinaltopTitle = "Resumo Final"
		checklistllblTemposExecucao = "Tempos de execução"
		checklistllblInicio = "Inicio"
		checklistllblFim = "Fim"
		checklistllblDuracao = "Duração"
		checklistllblPausa = "Pausa"
		checklistllblResultado = "Resultado"
		checklistllblTotal = "Total"
		checklistlFinalObsHint = "Observações"
		checklistlButtonFINSignatures = "Assinaturas"
		checklistlButtonFINActionButton = "Criar Acção"
		checklistLabelGrupo = "Grupo"
		tarefasLabelTResultado = "Tipo Resultado"
		checklistLabelTipoObjecto = "Tipo de Objecto"
		checklistLabelDescritivo = "Descritivo"
		checklistbutChangeObject = "Mudar Objecto Associado"
		checklistbutDessociateObject = "Desassociar Objecto"
		checklistbutAssociateObject = "Associar Objecto"
		checklistLabelSeleccioneObjecto = "Selecione o Objecto"
		checklistDadosObjectoMoradas = "Moradas"
		checklistDadosObjectoContactos = "Contactos"
		checklistDadosObjectoCamposObjecto = "Campos do objecto"
		checklistDadosObjectoDocumentosObjecto = "Documentos do objecto"
		checklistLabelReferenciaObjecto = "Referência"
		checklistLabelCodigoInternObjecto = "Designação"
		checklistLabelImagemObjecto = "Imagem"
		checklistLabelEscolhaTipoObjecto = "Escolha o tipo de objecto"
		checklistErroacesso = "Erro no acesso da Checklist! Efectue um sincronização e tente novamente."
		checklistassinaturasobrigatorias = "Têm de existir assinatura(s) para poder concluir a intervenção !"
		checklistenviardados2BO = "A enviar dados para o servidor. Por favor aguarde !"		
				
		'AppDialogs Requests
		AppDialogsFilterLabelTipoIntervencao = "Tipo Intervenção"
		AppDialogsFilterLabelEntidade = "Entidade"
		AppDialogsFilterLabelEstadosIntervencao = "Estados intervenção"
		AppDialogsFilterLabelDataInicio = "Data ínicio"
		AppDialogsFilterLabelDataFim = "Data fim"
		AppDialogsFilterLabelTipoChecklist = "Tipo checklist"
		AppDialogsFilterLabelRota = "Rota/Volta"
		AppDialogsCriadasIntervencoesObjectos = "Foram criadas as intervenções para os objectos seleccionados! Deseja ir para as intervenções para  verificação/execução?"
		AppDialogsNaoVerificadoTipoIntervencao = "Não foi possível verificar o tipo de intervenção/serviço associado à Checklist. Efectue a actualização/sincronização de dados e tente novamente."
		AppDialogsEdicao = "Edição"
		AppDialogsNovo = "Novo"
		
		'ReportsView
		reportsMsgProcessar = "A processar. Aguarde por favor ..."
		reportsErroLerFicheiro = "Erro ao tentar ler o ficheiro do directório local! Teste 'Re-Gerar relatório'. Se o erro persistir informe o administrador de sistema para verificação do problema"
		reportsMsgPrepararPDF = "A preparar ficheiro PDF ..."
		reportsErroEnviarEmail = "Não foi possível enviar o relatório por email devido a erro de comunicação. Tente novamente ou contacte o administrador de sistema."
		reportsMsgEnviarEmail = "Email Enviado com sucesso!"
		reportsErroEmail = "Email Nao enviado! Erro: "
		reportsMsgGeralRelatorio = "A gerar o relatório ..."
		reportsMsgGeralRelatorioCarregaFicheiro = "A gerar o relatório, Carregamento do ficheiro ..."
		reportsErroTamanhoExcessivo = "Não é possível apresentar o relatório! O tamanho do ficheiro excede a capaciade de memória do equipamento."
		reportsErroAbrirTemplate = "Não foi possivel abrir o template de impressão! Por favor efectue a sincronização e tente novamente. Em caso de persistência, contacte o administrador de sistema."
		reportsMsgGerarEquipamentos = "A gerar o relatório, Equipamentos ..."
		reportsMsgGerarGeral = "A gerar o relatório, Geral ..."
		reportsMsgGerarNaoConformidades = "A gerar o relatório, Não conformidades..."
		reportsMsgGerarSumario = "A gerar o relatório, Sumário ..."
		reportsMsgGerarArquivo = "A gerar o relatório, Criação do arquivo ..."
		reportsMsgFuncionalidadeNCFG = "Funcionalidade por configurar!"
		
		'UpdateAPK
		AvisoNovoAPK = "Existe uma versão mais recente da aplicação. Deseja Actualizar?"
		
		'User
		usermakeavalilable = "Tornar Disponível"
		userfilenoindentified = "O ficheiro não foi identificado localmente! Deseja descarrega-lo do servidor?"
		userfilewithproblems = "O ficheiro encontra-se com problemas! Deseja descarrega-lo do servidor?"
		userfileunavailable = "Não foi possivel aceder ao ficheiro"
		userErroRemoveOwnUser = "Não pode remover o seu próprio utilizador!"
		userSelectedUserNoRemove = "O utilizador seleccionado não pode ser removido da lista, porque é o utilizador de inicio de sessão."
		userAskRemoveUser = "Deseja remover o utilizador seleccionado da equipa em funções?"
		userNoEquipments = "Não existem equipamentos disponíveis para substitução!"
		userNoVehicles = "Não existem Veículos disponíveis!"
		userAskRemoveEquipment = "Deseja remover o equipamento seleccionado da lista de equipamentos do utilizador?"
		userAskConfirmProducts = "Existem produtos por confirmar! Irá proceder à confirmação dos dados do utilizador apenas. Para confirmar os produtos, execute novamente esta operação e escolha a opção 'Confirmar produtos'."
		userOptionConfirmProduct = "Confirmar produtos"
		userAskConfirmUserData = "Irá proceder à confirmação dos dados de utilizador e dos produtos do armazém. Deseja continuar?"
		userAguardeumMomento = "Aguarde um momento ..."
		userAskProductAusente = "O produto/equipamento encontra-se ausente?"
		userOptionSimAusente = "Sim, produto ausente"
		userOptionOutrasRazoes = "Outras razões"
		userNoEquipmentsReplace = "Não existem equipamentos disponíveis para substitução!"
		userOptionVerAccao = "Ver acção"
		userOptionReExecuteAccao = "Re-Executar acção"
		userChoiceOptionAvailable = "Escolha uma das opções disponíveis."
		userAlreadyRegistered = "O utilizador já se encontra registado!"
		userIncorrectInfo = "A informação na base de dados local não se encontra correcta! Verifique um ponto de rede para proceder à actualização dos dados e de seguida tente novamente."
		userInvalidLogin = "Login de utilizador inválido! Deseja tentar novamente?"
		userCodeandPasswordMandatory = "Tanto o código de utilizador como a chave de acesso são obrigatórias para efectuar o registo de novo utilizador!"
		usermainLabelOptListsUser = "Utilizador"
		usermainLabelOptListsDocs = "Documentos"
		usermainLabelOptListsCons = "Consumíveis"
		usermainLabelOptListsOper = "Operacionais"
		userchapterEquip = "Equipamentos em uso"
		userchapterViatura = "Viatura"
		userchapterUsers = "Utilizadores registados"
		userbutUserConfirmData = "Clique para confirmar os dados"
		userbutUserPauseAction = "Efectuar pausa"
		userbutUserUnavailable = "Tornar indisponível"
		useruserLabelFoto = "Fotografia"
		useruserLabelNome ="Nome"
		useruserLabelOrganizacao = "Organização"
		useruserLabelCategoria = "Categoria profissional"
		useruserLabelCodigoUser = "Código de utilizador"
		userlayoutpanelOper = "Operador"
		userlayoutpanelDocsOrg = "Doc da Organização"
		userlayoutpanelConsum = "Consumíveis"
		userdurationsHoje = "Dia de hoje"
		userdurationsVarios = "Vários dias"
		userreasonsMedico = "Consulta médica"
		userreasonsAssist = "Assistência à família"
		userreasonsDoente = "Doente/Mal estar"
		userreasonsOutras = "Outras razões"
		
		'Reports
		reportsLabelEstadoPedidos = "Estados de Pedidos"
		reportsLabelPeriodo = "Período"
		reportsLabelKPIDescricao = "KPI - Descrição"
		reportsLabelValor = "Valor"
		reportsLabelKPIOutrosIndicadores = "Outros indicadores"
		reportsLabelKPIComparacao = "Comparação"
		reportsIndicadoresDia = "Indicadores do dia"
		reportsIndicadoresComparacao = "Indicadores de comparação"
		
		'Alerts
		alertslabeln = "Informação/Prioridades"
		alertsLabelStatus = "Status"
		alertsLabelDescricaoAlerta = "Descrição do Alerta/Acção"
		alertslabelTypeObjectFilter = "Acção"
		alertsChapterSistema = "Sistema"
		alertsChapterTarefas = "Tarefas"
		alertsChapterInter = "Intervenções"
		
		'Objects
		objectsAvisoPedidoSemInfo = "Não foi possível apresentar informação do pedido seleccionado! Tente sincronizar os dados e posteriormente tentar novamente."
		objectsMsgConfirmaatribuicaoasi = "Confirma a atribuição do Pedido para si mesmo?"
		objectMsgPrepararInter = "A preparar a Intervenção ..."
		objectObjLabelObjectos = "Objecto/Contacto/Estado"
		objectObjLabelMorada = "Morada/Tipo"
		objectObjLabelStatus = "Status"
		objectObjLabelLocal = "Local"
		objectObjLabelObjectos = "Objecto/Contacto/Estado"
		objectObjLabelMorada = "Morada/Tipo"
		objectObjLabelStatus = "Status"
		objectObjLabelLocal = "Local"
		ObjLabelObjRequestTipoInter = "Tipo de Intervenção"
		ObjLabelObjRequestConcelho = "Concelho"
		ObjLabelObjRequestDistrito = "Distrito"
		ObjLabelObjRequestPLivre = "Pesquisa livre"
		ObjLabelObjRequestTipoGrupoInter = "Tipo/Grupo de Inspecção"
		ObjListItemRequestHeader = "Descritivo"
		ObjListItemActionHeader = "Ações"
		ObjLayoutsGeral = "Geral"
		ObjLayoutsRelacoes = "Relações"
		ObjLayoutsDocumentos = "Documentos"
		ObjLayoutsIntervencoes = "Intervenções"
		ObjLayoutDocsDescritivo = "Descritivo/Tipo de documento"
		ObjLayoutDocsValidade = "Validade"
		ObjLayoutDocsDataAlerta = "Data Alerta"
		
		'ItemLayout
		ItemAddressTipoMorada = "Tipo morada"
		ItemAddressEndereco = "Endereço"
		ItemAddressContinua = "(Continuação)"
		ItemAddressCPostal = "Código postal"
		ItemAddressLatitude = "Latitude"
		ItemAddressLongitude = "Longitude"
		ItemAddressLocalidade = "Localidade"
		
		'Vendas
		MsgStockActual = "Stock Actual"
		MsgStockHistorico = "Stock Existente"
		
		noObjectForceExternalRequest = "Não existe objecto de análise associado (ex: cliente, equipamento, ...)!"
		noMandatoryDataForceExternalRequest = "Existem dados obrigatórios por responder! Verifique e tente novamente."
		noMandatorySignaturesRequest = "É necessário assinar para concluir a intervenção/checklist!"
		
		ASExistsEditItQuestion = "A Ação Subsequente já existe! Deseja alterar a mesma?"
		ASExistsNoEditInformation = "A Ação Subsequente já existe e não é possível alterar a mesma!"
		
		
		'ProgressDialog2
		Pg2MsgProcessFotos = "A processar fotos, aguarde por favor ..."
		Pg2MsgProcessDocs = "A processar documento. Aguarde por favor ..."
		Pg2MsgEnviarDadosVerificacao = "A enviar dados de verificação. Aguarde por favor..."
		Pg2MsgTerminarChk = "A terminar checklist!"
		Pg2MsgProcessar = "A processar..."
		
		'Jornada
		MsgUserStartJornada = "Iniciar a jornada ?"
		MsgUserStopJornada = "Terminar a jornada ?"
		MsgUserMessageJornadaActivo = "Activo"
		MsgUserMessageJornadaInactivo = "Inactivo"
		MsgUserMessageJornadaIndisponivel = "Indisponível"
		
		'Appdialogs
		RevalidarIntervencao = "Revalidar Intervenção/Checklist"
		Sync_DisclaimerMestres  = "Esta opção vai efectuar uma re-instalação inicial, repondo todos os dados. Deve efectuar um Upload de dados antes de prosseguir."
		Intervencaoabertaduplicacao = "A Intervenção tem de estar concluída para poder ser duplicada."
	End If
	
End Sub
