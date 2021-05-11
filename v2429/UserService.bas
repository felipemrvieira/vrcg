B4A=true
Group=Services
ModulesStructureVersion=1
Type=Service
Version=8.5
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Sub Service_Create
	'These
End Sub

Sub Service_Start (StartingIntent As Intent)
	'Log("UserService Service_Start@" &DateTime.Time(DateTime.Now))
'	DBStructures.CheckWorkingDayTasks
'	StartServiceAt("", DateTime.Now + 10 * 1000, False)
'	StopService("")
'	
	'Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
	'CREATE TABLE "userinnertasks" ( `id` INTEGER, `tagcode` TEXT, `datetime` TEXT, `ukey` TEXT, `status`, prodcheck INTEGER, PRIMARY KEY(`id`,`tagcode`,`datetime`,`ukey`) )
	'CREATE TABLE userinnertasksnolines (id INTEGER, tagcode TEXT, ukey TEXT, product_tagcode text, PRIMARY KEY (id, tagcode, ukey, product_tagcode))
End Sub

Sub Service_Destroy
	
End Sub

