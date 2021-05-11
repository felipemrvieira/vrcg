B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=6.8
@EndOfDesignText@
' ---------------------------------------------------------------
' TIniFile
' v1.0
' 
' B4A class for handling INI file like in Windows. Use Delphi's naming.
' Distributed freely for B4A community.
'
' 2018, broto_suseno@msn.com
' ---------------------------------------------------------------


Sub Class_Globals
	Private FMap As Map
	Private FDirName As String
	Private FFileName As String
	Private FAutoFlush As Boolean = False
End Sub


'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(prmDirName As String, prmFileName As String)
	FDirName = prmDirName
	FFileName = prmFileName
	
	FMap.Initialize
	
	OpenIniFile
End Sub


' Open and read INI file
Private Sub OpenIniFile	
	Dim Reader As TextReader
	
	FMap.Clear
	
	If (File.Exists(FDirName, FFileName)) Then
		Reader.Initialize(File.OpenInput(FDirName, FFileName))
		
		Dim line As String = ""
		Dim prevSectName As String = ""
		Dim sectName As String = ""
		Dim keyName As String = ""
		Dim value As String = ""
		Dim equalSignPos As Int = -1
		Dim Map2 As Map
		
		line = Reader.ReadLine
		
		Do While (line <> Null)
			line = line.Trim
			
			If (line.Length > 2) Then
				If (line.SubString2(0, 1) = "[") Then
					If (line.EndsWith("]")) Then
						sectName = line.SubString2(1, line.Length - 1)
						If (prevSectName <> sectName) Then
							If (prevSectName <> "") Then
								FMap.Put(prevSectName.ToUpperCase, Map2)
							End If
							Map2.Initialize
						End If
						prevSectName = sectName		 
					End If
				Else
					equalSignPos = line.IndexOf("=")
					If (equalSignPos > -1) Then
						keyName = line.SubString2(0, equalSignPos)
						value = line.SubString(equalSignPos + 1)
						Map2.Put(keyName.ToUpperCase, value)
					End If
				End If
			End If

			line = Reader.ReadLine
		Loop
		
		If (prevSectName <> "") Then
			FMap.Put(prevSectName.ToUpperCase, Map2)
		End If
		
		Reader.Close
	End If
End Sub


' Write INI contents to file
Private Sub DoFlush	
	Dim Writer As TextWriter
	Dim i, j As Int
	
	Writer.Initialize(File.OpenOutput(FDirName, FFileName, False))
	
	For i = 0 To FMap.Size - 1
		Dim SectName As String = FMap.GetKeyAt(i)
		Dim SectValues As Map = FMap.GetValueAt(i)
		
		Writer.WriteLine("[" & SectName & "]")
		
		For j = 0 To SectValues.Size - 1
			Writer.WriteLine(SectValues.GetKeyAt(j) & "=" & SectValues.GetValueAt(j))
		Next
	Next
	
	Writer.Close
End Sub


Public Sub GetDirName As String
	Return FDirName
End Sub


Public Sub GetFileName As String
	Return FFileName
End Sub


Public Sub GetAutoFlush As Boolean
	Return FAutoFlush
End Sub


Public Sub SetAutoFlush(prmValue As Boolean)
	FAutoFlush = prmValue
End Sub


Public Sub Flush
	DoFlush	
End Sub


Public Sub ReadString(prmSectionName As String, prmKeyName As String, prmDefault As String) As String
	Dim Result As String = prmDefault
	
	If (FMap.ContainsKey(prmSectionName.ToUpperCase)) Then
		Dim Sect As Map
		Sect = FMap.Get(prmSectionName.ToUpperCase)
		If (Sect.ContainsKey(prmKeyName.ToUpperCase)) Then
			Result = Sect.GetDefault(prmKeyName.ToUpperCase, prmDefault)
		End If
	End If
	
	Return Result
End Sub


Public Sub ReadInteger(prmSectionName As String, prmKeyName As String, prmDefault As Int) As Int
	Dim Result As Int = prmDefault
	Dim ResultStr As String = ReadString(prmSectionName, prmKeyName, prmDefault)
	
	If (ResultStr <> prmDefault) Then
		Result = ResultStr
	End If
	
	Return Result
End Sub


Public Sub ReadBool(prmSectionName As String, prmKeyName As String, prmDefault As Boolean) As Boolean
	Dim Result As Boolean = prmDefault
	Dim DefaultInt As Int
	Dim ResultInt As Int
	
	If (prmDefault) Then
		DefaultInt = 1
	Else
		DefaultInt = 0
	End If
	
	ResultInt = ReadInteger(prmSectionName, prmKeyName, DefaultInt)
	Result = (ResultInt = 1)
	
	Return Result
End Sub


Public Sub WriteString(prmSectionName As String, prmKeyName As String, prmValue As String) As Boolean
	Dim Result As Boolean 
	Dim Values As Map
	
	' No exception raising for simplicity
	Result = Not(prmSectionName.Contains(CRLF) Or prmKeyName.Contains(CRLF) Or prmValue.Contains(CRLF)) 
	
	If (Result) Then		
		If (FMap.ContainsKey(prmSectionName)) Then
			Values = FMap.Get(prmSectionName)
		Else
			Values.Initialize
		End If
		
		Values.Put(prmKeyName, prmValue)
		FMap.Put(prmSectionName, Values)
		
		If (FAutoFlush) Then
			DoFlush
		End If
	End If
	
	Return Result
End Sub


Public Sub WriteInteger(prmSectionName As String, prmKeyName As String, prmValue As Int) As Boolean
	Return WriteString(prmSectionName, prmKeyName, prmValue)
End Sub


Public Sub WriteBool(prmSectionName As String, prmKeyName As String, prmValue As Boolean) As Boolean
	Dim ValueInt As Int
	
	If (prmValue) Then
		ValueInt = 1
	Else
		ValueInt = 0
	End If
	
	Return WriteInteger(prmSectionName, prmKeyName, ValueInt)
End Sub

' EOF