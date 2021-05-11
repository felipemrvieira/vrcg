B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=10.2
@EndOfDesignText@
Private Sub Class_Globals

	Private t As Thread
	Private r As Reflector

End Sub

Public Sub Initialize()

End Sub

Public Sub Fire

	'Set up forced OOM thread
	t.Initialise("t")

	'Start thread to force OOM
	Dim args(0) As Object
	t.Start(Me, "t_process", args)

	'This loop keeps control here until thread dies, should take a couple millisec
	Do While t.Running
 
	Loop

End Sub

Private Sub t_process

	'Find maximum memory process can use
	r.Target = r.RunStaticMethod("java.lang.Runtime", "getRuntime", Null, Null)
	Private maxmemory As Long = r.RunMethod("maxMemory")

	'Attempt to create an array that would fill maximum memory - will force a garbage
	'collection then bomb with OOM which will be caught by t_Ended
	Private bomb(maxmemory / 8) As Double

End Sub

Private Sub t_Ended(Fail As Boolean, Error As String)

End Sub