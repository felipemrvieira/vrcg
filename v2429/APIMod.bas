Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=2.02
@EndOfDesignText@
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
End Sub

Sub IIFIndex(Index As Int, Values As List) As String 
	If Index<Values.Size And Index>-1 Then Return Values.Get(Index)
	Return ""
End Sub

Sub IIF(Value As Boolean , IfTrue As String , IfFalse As String ) As String
	If Value Then 
		Return IfTrue 
	Else 
		Return IfFalse
	End If
End Sub


Sub Hex(Number As Int) As String 
	Dim temp As Int
	temp = Floor(Number / 16)
	Return ToHex(temp) & ToHex(Number - temp*16)
End Sub
Sub ToHex(Number As Int) As String 
	If Number < 10 Then 
		Return Number 
	Else
		Return Chr(Number-10+ Asc("A"))
	End If
End Sub

Sub GetSide(Text As String, Delimeter As String, LeftSide As Boolean,DoRightSide As Boolean  ) As String 
	Dim temp As Int
	If Text.Contains(Delimeter) Then
		temp=Text.LastIndexOf(Delimeter)
		If LeftSide Then
			Return Left(Text,temp)
		Else
			Return Right(Text, Text.Length-temp-1)
		End If
	Else
		If LeftSide Or DoRightSide Then Return Text
	End If
End Sub

Sub GetBetween(Text As String, Start As String, Finish As String) As String 
	Dim temp As Int,temp2 As Int
	temp=Text.IndexOf(Start)
	If temp>-1 Then
		temp2=Text.IndexOf2(Finish, temp+ Start.Length  +1)
		Return Mid(Text, temp+Start.Length,temp2-temp-Start.Length)
	End If
End Sub


Sub Instr(Text As String, TextToFind As String, Start As Int) As Int
	Return Text.IndexOf2(TextToFind,Start)
End Sub
Sub InstrRev(Text As String, TextToFind As String) As Int
	Return Text.LastIndexOf(TextToFind)
End Sub
Sub Instr2(Text As String, Start As Int, TextsToFind As List) As Int 
	Dim temp As Int, temp2 As Int, temp3 As Int
	temp2=Text.Length 
	For temp = 0 To TextsToFind.Size -1
		temp3 = Instr(Text, TextsToFind.Get(temp), Start)
		If temp3<temp2 And temp3>-1 Then temp2=temp3
	Next
	Return temp2
End Sub


Sub Left(Text As String, Length As Long)As String 
	If Length>Text.Length Then Length=Text.Length 
	Return Text.SubString2(0, Length)
End Sub
Sub Right(Text As String, Length As Long) As String
	If Length>Text.Length Then Length=Text.Length 
	Return Text.SubString(Text.Length-Length)
End Sub
Sub Mid(Text As String, Start As Int, Length As Int) As String 
	If Length>0 And Start>-1 And Start< Text.Length Then Return Text.SubString2(Start,Start+Length)
End Sub


Sub GetTime(Seconds As Int) As String 
	Dim Hour As Int, Minute As Int :Hour=3600: Minute=60
	Dim Hours As Int, Minutes As Int , Time As String 
	
	Hours = Floor(Seconds / Hour)
	Seconds = Seconds - (Hours*Hour)
	If Hours>0 Then Time = Hours & ":"
	
	Minutes = Floor(Seconds / Minute)
	Seconds = Seconds - (Minutes*Minute)
	Time=Time & ForceLength(Minutes, 2, "0",False) & ":" & ForceLength(Seconds, 2, "0",False)
	Return Time
End Sub

Sub Containsword(Text() As String , TextToFind As String) As Boolean 
	Dim temp As Int, tempstr() As String ,temp2 As Int , Found As Boolean ,Start As Int
	tempstr = Regex.Split(" ", TextToFind.ToLowerCase)
	For temp2 = 0 To tempstr.Length-1
		Found=False
		For temp = Start To Text.Length -1
			If Text(temp) = tempstr(temp2) Then 
				Found = True
				Start=temp+1
				temp=Text.Length 
			End If
		Next
		If Not(Found) Then Return False
	Next	
	Return True
End Sub

Sub IsTime(Text As String) As Boolean 
	'00:00 00:00:00
	Dim ret As Boolean 
	If Text.Length = 5 Or Text.Length=8 Then
		If IsNumber(Left(Text,2)) And IsNumber(Right(Text,2)) And Mid(Text, 2, 1) = ":" Then
			If Text.Length = 8 Then
				ret = IsNumber(Mid(Text,3,2)) And Mid(Text,5,1) = ":" 
			Else
				ret=True 
			End If
		End If
	End If
	Return ret
End Sub

Sub ParseTime(Time As String) As Int 
	Dim Multiplier As Int , Value As Int , Total As Int 
	Do Until Time.Length = 0 
		Value = Right(Time,2)
		Time = Left(Time , Time.Length - 2)
		If Time.Length>0 Then
			If Right(Time, 1) = ":" Then 
				Time = Left(Time , Time.Length - 1)
			End If
		End If
		Total = Total + Value * IIFIndex(Multiplier, Array As Int(1, 60, 3600))
		Multiplier=Multiplier+1
	Loop
	Return Total
End Sub

Sub ForceLength(Text As String, Length As Int, Character As String, AtEnd As Boolean  )As String 
	Dim temp As Int 
	For temp = Text.Length +1 To Length
	'Do Until text.Length=>length
		If AtEnd Then Text=Text & Character Else Text = Character & Text
	'Loop
	Next
	Return Text
End Sub

Sub CountInstances(Text As String, Substring As String) As Int
	Return Regex.Split(Substring, Text).Length 
End Sub

Sub KillAllExceptNumbers(Text As String) As Int
	Dim tempstr As String, temp As Int , Letter As String 
	For temp = 0 To Text.Length-1 
		Letter= Mid(Text, temp,1)
		Select Case Letter
			Case "0","1","2","3","4","5","6","7","8","9"
				tempstr=tempstr & Letter
		End Select
	Next
	If IsNumber(tempstr) Then
		Return tempstr
	Else
		Return 0
	End If
End Sub


Sub HSLtoRGB(Hue As Int, Saturation As Int, Luminance As Int, Alpha As Int ) As Int 
   Dim temp3(3) As Double , Red As Int, Green As Int, Blue As Int ,temp1 As Double, temp2 As Double ,n As Int 
   Dim pHue As Double, pSat As Double, pLum As Double , pRed As Double, pGreen As Double, pBlue As Double 
   
   pHue = Min(239, Hue) / 239
   pSat = Min(239, Saturation) / 239
   pLum = Min(239, Luminance) / 239

   If pSat = 0 Then
      pRed = pLum
      pGreen = pLum
      pBlue = pLum
   Else
      If pLum < 0.5 Then
         temp2 = pLum * (1 + pSat)
      Else
         temp2 = pLum + pSat - pLum * pSat
      End If
      temp1 = 2 * pLum - temp2
   
      temp3(0) = pHue + 1 / 3
      temp3(1) = pHue
      temp3(2) = pHue - 1 / 3
      
      For n = 0 To 2
         If temp3(n) < 0 Then temp3(n) = temp3(n) + 1
         If temp3(n) > 1 Then temp3(n) = temp3(n) - 1
      
         If 6 * temp3(n) < 1 Then
            temp3(n) = temp1 + (temp2 - temp1) * 6 * temp3(n)
         Else
            If 2 * temp3(n) < 1 Then
               temp3(n) = temp2
            Else
               If 3 * temp3(n) < 2 Then
                  temp3(n) = temp1 + (temp2 - temp1) * ((2 / 3) - temp3(n)) * 6
               Else
                  temp3(n) = temp1
                End If
             End If
          End If
       Next 

       pRed = temp3(0)
       pGreen = temp3(1)
       pBlue = temp3(2)
    End If

    Red = pRed * 255
    Green = pGreen * 255
    Blue = pBlue * 255

	Return Colors.ARGB(Alpha, Red,Green,Blue)
End Sub


Sub uCase(Text As String)As String 
	Return Text.ToUpperCase 
End Sub
Sub lCase(Text As String) As String 
	Return Text.ToLowerCase 
End Sub
Sub Trim(Text As String) As String 
	Return Text.Trim 
End Sub
Sub Replace(Text As String, TextToReplace As String, ReplaceWith As String) As String 
	Return Text.Replace(TextToReplace,ReplaceWith)
End Sub

Sub Clipboard(Op As Int, Text As String) As String 
	Dim temp As BClipboard 
	Select Case Op
		Case 0'copy
			temp.clrText 
			temp.settext(Text)
		Case 1: Return temp.getText'paste
		Case 2: Return temp.hasText'return if has text
	End Select
End Sub