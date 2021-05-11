B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	Public Const DateTimeFormat As String = "yyyy-MM-dd"
	Public Const DateTimeFormatTime As String = "HH:mm:ss"
	Public Const KPILast30Days As Int = 0
	Public Const KPILastMonth As Int = 1
	Public Const KPISinceBeginning As Int = 2
	Public Const KPIBetweenDates As Int = 3
	
	Public Const TASKTYPE_UNKNOWN As Int = 0
	Public Const TASKTYPE_ALERT As Int = 1
	Public Const TASKTYPE_TASK As Int = 2
	Public Const TASKTYPE_ACTION As Int = 3

	Public Const NoColor As Int = Colors.ARGB(1,255,255,255) 'Colors.Transparent
	Public Const ColorRed As Int = 0xFFD13339  'Colors.ARGB(255,215,0,0)   
	Public Const ColorGreen As Int = 0xFF0D893C  'Colors.ARGB(255,5,215,0)
	Public Const ColorBlue As Int = 0xFF02B8C5  'Colors.ARGB(255,0,155,255)
	Public Const ColorYellow As Int = 0xFFFEBB03  'Colors.ARGB(255,255,255,0)
	Public const DarkGreen As Int = 0xFF006400
	Public Const ColorGray As Int = Colors.ARGB(255,169,169,169)
	'Public Const ColorBlue As Int = Colors.ARGB(255,240,0,0)
	Public Const ColorOrange As Int = Colors.ARGB(255,255,110,0)
	Public Const ColorLightSilver As Int = Colors.ARGB(255,220,220,220)
	Public Const ColorWhiteSilverLight As Int = Colors.ARGB(255, 240, 240, 240)
	Public Const ColorDarkGray As Int = Colors.ARGB(255,50,50,50)
	Public Const ColorBlueSoftDark As Int = Colors.ARGB(255, 240, 90, 90)
	Public Const ColorBlueDark As Int = Colors.ARGB(255, 240, 0, 0)
	'Public Const ColorBlueSoftDark As Int = Colors.ARGB(255, 0, 115, 190)
	'Public Const ColorBlueDark As Int = Colors.ARGB(255, 0, 90, 150)
	Public Const ColorRedOrange As Int = Colors.ARGB(255,255,55,0)
	Public Const ColorCianSoftLight As Int = Colors.ARGB(255,200,230,230)
	Public Const ColorWhite As Int = Colors.ARGB(255,255,255,255)
	Public const ColorLightRed As Int =0xFFF9D6D5
	Public Const ColorSelecSelected As Int = Colors.ARGB(255,225, 255, 245)
	Public Const ColorSelecNotSelected As Int = Colors.ARGB(255,239, 239, 239)
	
	Public Const WhiteSoftDusk As Int = Colors.ARGB(255, 240,240,240)
	Public Const WhiteSoftDuskBlue As Int = Colors.ARGB(255, 230,240,250)
	Public Const DarkGray As Int = Colors.ARGB(255, 85,85,85)
	Public Const BlackNoAlpha As Int = Colors.ARGB(0, 0,0,0)
	
	'   VRCG Colors
	Public ColorMain As Int = Colors.ARGB(255,240,0,0)
	Public ColorMainDarker As Int = Colors.ARGB(255,210,0,0)
	Public ColorSub As Int = Colors.ARGB(255, 140, 0, 0)

'	 VRCG Images 
	Public AppLogo As Bitmap = LoadBitmap(File.DirAssets, "icon_100px.png")
	Public CompanyImage As Bitmap = LoadBitmap(File.DirAssets, "vrcg_business_logo.png")

'	VRCG Strings
	Public AppVersionCodeName As String = "Vodafone RCG v.2.01"
	Public AppTitle As String = "Vodafone ReadyCheckGo"
	Public AppWebSiteLink As String = "https://www.vrcg.pt"
	Public ApkName As String = "vrcg_demo.apk"



''	Evolution Check Colors
'	Public ColorMain As Int = Colors.ARGB(255,0,155,255)
'	Public ColorMainDarker As Int = Colors.ARGB(255, 0, 90, 150)
'	Public ColorSub As Int = Colors.ARGB(255, 0, 90, 150)
'
''	Evolution Check Images
'	Public AppLogo As Bitmap = LoadBitmap(File.DirAssets, "logotipo.png")
'	Public CompanyImage As Bitmap = LoadBitmap(File.DirAssets, "evolutionCheck.png")
'	
''	Evolution Check Strings
'	Public AppVersionCodeName As String = "EvolutionCheck v.2.01"
'	Public AppTitle As String = "Evolution Check"
'	Public AppWebSiteLink As String = "https://www.evolutioncheck.pt"
'	Public ApkName As String = "evc_demo.apk"
	
	Public LogoWidth As Int = 60
	Public LogoMobileHeight As Int = 40
	Public LogoFill As Int = Gravity.FILL

	Public Const CLOptionType_Buttons As Int = 0
	Public Const CLOptionType_MultiButtons As Int = 1
	Public Const CLOptionType_TextEdit As Int = 2
	Public Const CLOptionType_SelectionList As Int = 3
	
	Public Const ARR_FIRSTITEM As Int = 0
	Public Const ARR_SECONDITEM As Int = 1
	Public Const ARR_THIRDITEM As Int = 2
	Public Const ARR_FOURTHITEM As Int = 3
	Public Const ARR_FIFTHITEM As Int = 4
	
	'**************************************************************************
	' VARIÁVEIS CONSTANTES DE CONTROLO DE PROPRIEDADES DAS QUESTÕES
	'**************************************************************************
	Public Const POSOPTION_REPEAT As Int = 0
	Public Const POSOPTION_CRITICAL As Int = 1
	Public Const POSOPTION_MANDATORY As Int = 2
	Public Const POSOPTION_MULTIOP As Int = 3
	
	'**************************************************************************
	' VARIÁVEIS CONSTANTES DE CONTROLO DE POSIÇÃO DE INDICE DE LISTA OU
	' ARRAY DE DADOS COM INFORMAÇÃO DE TAGCODES SEQUÊNCIAL DE NIDENTIFICAÇÃO
	' DE ITEMS NUMA LISTA DE VERIFICAÇÃO. 
	' EXEMPLO: REQUEST|OBJECT|CHECKLIST|UNIQUEKEY
	'**************************************************************************
	Public Const ITKEY_REQUEST As Int = 0
	Public Const ITKEY_OBJECT As Int = 1
	Public Const ITKEY_CHECKLIST As Int = 2
	Public Const ITKEY_UNIQUEKEY As Int = 3
	Public Const ITKEY_TAGCODE As Int = 3
	Public Const ITKEY_QUEST As Int = 4
	
	
	Public Const ITEM_SELECTED As Int = 1
	
	
End Sub