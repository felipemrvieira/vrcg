B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	
	' ****************  USER ****************
	Public MapUser As Map
	Public Track_User As List
	
	' ****************  REPORTS ****************
	Public MapReports As Map
	Public Track_Reports As List
	
	' ****************  REQUESTS ****************
	Public MapRequests As Map
	Public TrackRequests As List
	Public RequestsTypes As List
	Public TypeRequestsStatus As List
	
	' ****************  ENTITIES ****************
	Public MapEntities As Map
	Public Track_Entities As List
	Public Entities_Types As List
	
	' ****************  OBJECTS ****************
	Public MapObjects As Map
	Public Track_Objects As List
	Public Objects_Types As List
	
	' ****************  TASKS ****************
	Public MapTasks As Map
	Public Track_Tasks As List
	Public Alerts_Types As List 
	Public Alerts_Status As List
	Public Alerts_ItemStatus As List
	Public Alerts_Priorities As List
	Public Alerts_Urgency As List
	
	
End Sub

Public Sub UpdateTracker( ObjectMap As List, InputObject As Object)
	ObjectMap = InputObject
End Sub

Public Sub GetTrackerDesc(ObjectMap As List, ID As Int) As String
	Dim ret As String = ""
	If (ObjectMap.Size > 0) And ((ID >= 0) And (ID+1 <ObjectMap.Size)) Then 
		Dim mData As Map = ObjectMap.Get(ID)
		ret = mData.Get("tracker")
	End If
	Return ret
End Sub

Public Sub GetTrackerPos(ObjectMap As List, str As String) As Int
	Dim ret As Int = -1
	Dim counter As Int = 0
	If (ObjectMap.Size > 0) And (str <> "") Then
		For Each mData As Map In ObjectMap
			Dim s As String = mData.Get("tracker")
			If (s = str) Then
				ret = counter
				Exit
			End If
			counter = counter + 1
		Next
	End If
	Return ret
End Sub

Public Sub GetMapTitleByID(ObjectMap As List, ID As Int) As String
	Dim ret As String = ""
	If (ObjectMap.Size > 0) Then 
		For i=0 To ObjectMap.size-1
			Dim mData As Map = ObjectMap.Get(i)
			If (mData.Get("id") = ID) Then
				ret = mData.Get("title")
				Exit
			End If
		Next
	End If
	Return ret
End Sub

Public Sub GetMapColorByID(ObjectMap As List, ID As Int) As String
	Dim ret As String = ""
	If (ObjectMap.Size > 0) Then 
		For i=0 To ObjectMap.size-1
			Dim mData As Map = ObjectMap.Get(i)
			If (mData.Get("id") = ID) Then
				ret = mData.Get("color")
				Exit
			End If
		Next
	End If
	Return ret
End Sub

Public Sub GetMapDescByPos(ObjectMap As List, pos As Int) As String
	Dim ret As String = ""
	If (ObjectMap.Size > 0) And ((pos >= 0) And (pos+1 <ObjectMap.Size)) Then
		Dim mData As Map = ObjectMap.Get(pos)
		ret = mData.Get("title")
	End If
	Return ret
End Sub
