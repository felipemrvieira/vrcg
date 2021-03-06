B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=5.8
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
#if B4i
	Private UtilsHUD As HUD
#else
'	Type PointApi(X As Float, Y As Float)
#end if
	Private xui As XUI
	
End Sub

Sub JSON2MAP(script As String) As Map
	Dim Ret As Map : Ret.initialize
	If NNE(script) Then
		Dim JSON1 As JSONParser
		Try
			JSON1.Initialize(script)
			Dim Ret As Map = JSON1.NextObject
		Catch
			Log(LastException)
			WriteErrors2Log(LastException)
		End Try
	End If
	Return Ret
End Sub

Sub ShowProcinLog(Module2Show As String, Procedure2Show As String, Data2Show As String)
	
	Log($"========================================================="$)
	Log($"Modulo : ${Module2Show}"$)
	Log($"Sub : ${Procedure2Show}"$)
	Log($"Dados : ${Data2Show}"$)
	Log($"========================================================="$)
	
End Sub

Sub GetColorByName(colorname As String) As Int
	Select Case colorname.ToLowerCase
		Case "white"
			Dim ColorRet As Int = Colors.White
		Case "black"
			Dim ColorRet As Int = Colors.Black
		Case "red"
			Dim ColorRet As Int = Colors.Red
		Case "green"
			Dim ColorRet As Int = Colors.Green
		Case "blue"
			Dim ColorRet As Int = Colors.Blue
		Case "yellow"
			Dim ColorRet As Int = Colors.Yellow
		Case "lightgray"
			Dim ColorRet As Int = Colors.LightGray
		Case Else
			Dim ColorRet As Int = Colors.Black
	End Select
	
	Return ColorRet
End Sub

Sub Color2Hex (inStr As String) As String
	
	If NNE(inStr) Then
		Select Case inStr.ToLowerCase
			Case "red"
				Return "#ff5c33"
			Case "green"
				Return "#b3ff66"
			Case "blue"
				Return "#3399ff"
			Case "orange"
				Return "#ffc333"
			Case "white"
				Return "#ffffff"
			Case "black"
				Return "#000000"
			Case Else
				Return inStr
		End Select
	Else
		Return "#ffffff"
		
	End If
	
End Sub

'===================================================================================================================
'	TIPO: EVENTO
'	RETORNA: MAP da Chamada iniciada por JOB
'	Job - referência ao JOB que origina o evento 
'===================================================================================================================
Sub JobAPIMAP(job  As HttpJob) As Map
	Dim ResultStr As String = job.GetString
	Dim JSON1 As JSONParser
	If (Starter.StrFunc.Left(ResultStr, 1) = "[") Then
		ResultStr = Starter.StrFunc.Trim(Starter.StrFunc.Mid(ResultStr, 2, Starter.StrFunc.Len(ResultStr)-1))
	End If
	JSON1.Initialize(ResultStr)
	Dim MapJSON As Map = JSON1.NextObject
	Return MapJSON
End Sub

Sub TextJSON2MAP(ResultStr As String) As Map
	Dim JSON1 As JSONParser
	If (Starter.StrFunc.Left(ResultStr, 1) = "[") Then
		ResultStr = Starter.StrFunc.Trim(Starter.StrFunc.Mid(ResultStr, 2, Starter.StrFunc.Len(ResultStr)-1))
	End If
	JSON1.Initialize(ResultStr)
	Dim MapJSON As Map = JSON1.NextObject
	Return MapJSON
End Sub

Sub NegativeToPositive(val As Int) As Int
	Dim s As String = val
	s = s.Replace("-", "")
	Return s
End Sub

Sub ZeroLeft(StrText As String, StrLength As Int) As String
	Dim difnum As Int = StrLength - StrText.Length
	If (difnum > 0) Then
		For n=0 To difnum-1
			StrText = $"0${StrText}"$
		Next
	End If
	Return StrText
End Sub

Sub Left(StrText As String, StrLength As Int) As String
	Private strfunc As StringFunctions
	strfunc.Initialize
	Return strfunc.Left(StrText, StrLength)
End Sub

Sub Right(StrText As String, StrLength As Int) As String
	Private strfunc As StringFunctions
	strfunc.Initialize
	Return strfunc.Right(StrText, StrLength)
End Sub

Sub Mid(StrText As String, StrStart As Int, StrLength As Int) As String
	Private strfunc As StringFunctions
	strfunc.Initialize
	Return strfunc.Mid(StrText, StrStart, StrLength)
End Sub

#if B4i
Sub NullBitmap(imgvw As ImageView) As ImageView
	Dim no As NativeObject
	imgvw.Bitmap = no.Initialize ("UIImage").RunMethod ("new", Null)
	Return imgvw
End Sub
#end if

Sub MakeNullList As List
	Dim retList As List
	retList.Initialize
	Return retList
End Sub

Sub IntToDIP(Integer As Int) As Int
	Dim r As Reflector
	Dim scale As Float
	r.Target = r.GetContext
	r.Target = r.RunMethod("getResources")
	r.Target = r.RunMethod("getDisplayMetrics")
	scale = r.GetField("density")
   
	Dim DIP As Int
	DIP = Integer * scale + 0.5
	Return DIP
End Sub

Sub FieldInList(do_field As String, inList As String) As Boolean
	Dim ret As Boolean = False
	If (NNE(do_field) And NNE(inList)) Then
		Dim Lista As List = Regex.Split("\|", inList )
		ret = (Lista.IndexOf(do_field) >= 0)
	End If
	Return ret
End Sub

Sub FieldResultSet2SQLArray(inList As ResultSet, inField As String) As String
	Dim sRet As String = ""
	Do While inList.NextRow
		Dim TgCode As String = inList.GetString(inField)
		If (NNE(sRet)) Then
			sRet = $"${sRet},"$
		End If
		sRet = $"${sRet}'${TgCode}'"$
	Loop
	If (NNE(sRet)) Then
		sRet = $"(${sRet})"$
	Else
		sRet = $"('')"$
	End If
	Return sRet
End Sub

Sub FormulaInBlocks(Formula As String) As List
	Dim Blocks As List : Blocks.initialize
	Dim BlocksAnd As List = Regex.Split("\&&", Formula )
	If (BlocksAnd.Size >0) Then
		For i = 0 To BlocksAnd.Size-1
			Dim BlocksOr As List = Regex.Split("\|\|", BlocksAnd.Get(i) )
			If (BlocksOr.Size >0) Then
				Blocks.AddAll(BlocksOr)
			Else
				Blocks.Add(BlocksAnd.Get(i))
			End If
		Next
	Else
		Dim BlocksOr As List = Regex.Split("\|\|", Formula )
		If (BlocksOr.Size >0) Then
			For i = 0 To BlocksOr.Size-1
				Blocks.Add(BlocksOr.Get(i))
			Next
		Else
			Blocks.Add(Formula)
		End If
	End If
	Return Blocks
End Sub

Sub Test4TrueList(tv As String, cv As List, Formula As String, this As B4XView) As Boolean
	For n=0 To cv.Size
		Formula = Formula.Replace($"[cv${n}]"$, cv.Get(n)).Replace($"cv${n}"$, cv.Get(n))
	Next
	Return Test4True(tv, Formula,this)
End Sub


'	[tv]>=[cv0]&&[tv]<=[cv1]
'	Test4True(tv As String, Formula As String)
'	[tv]>=2&&[tv]<=3

Sub Test4True(tv As String, Formula As String, this As B4XView) As Boolean
	Dim ret As Boolean = False
	Formula = Formula.ToLowerCase.Replace("[tv]", tv).Replace("tv", tv)
	Dim Blocks As List = FormulaInBlocks(Formula)
	If (Blocks.Size >= 1) Then
		ret = True
		For n = 0 To Blocks.Size-1
			Dim str As String = Blocks.Get(n)
			Dim vbool As Boolean = CompareValuesCondition(str,this)
			ret = ret And vbool
		Next
	End If
	
	Return ret
End Sub

Sub CompareValuesCondition(inStr As String, this As B4XView) As Boolean
	
	Dim ret As Boolean = False
	Log(inStr)
	If NNE(this.Tag) Then

		Try
			Dim thisTag As List = Regex.Split("\|",this.Tag)
			Dim request As String = thisTag.Get(0)
			Dim action_tagcode As String = thisTag.Get(1)
			Dim task_tagcode As String = thisTag.Get(2)
			Dim item_tagcode As String = thisTag.Get(3)
			Dim unique_key As String = thisTag.Get(4)
			Dim tagcode As String = thisTag.Get(5)
			Dim execute_status As Int = thisTag.Get(6)
			Dim repeatcounter As Int = thisTag.Get(7)
			Dim repeatitemcounter As Int = thisTag.Get(8)
			Dim repeatfieldcounter As Int = thisTag.Get(9)
		Catch
			Log(LastException)
			WriteErrors2Log(LastException)
		End Try
	End If
	
	
	
	If inStr.Contains(">=") Then
		Dim vValues As List = Regex.Split("\>=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) >= vValues.Get(1))
	else If inStr.Contains("<=") Then
		Dim vValues As List = Regex.Split("\<=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) <= vValues.Get(1))
	else If inStr.Contains("!=") Then
		Dim vValues As List = Regex.Split("\!=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) <> vValues.Get(1))
	else If inStr.Contains("<>") Then
		Dim vValues As List = Regex.Split("\<>", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) <> vValues.Get(1))
	else If inStr.Contains("<") Then
		Dim vValues As List = Regex.Split("\<", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) < vValues.Get(1))
	else If inStr.Contains(">") Then
		Dim vValues As List = Regex.Split("\>", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) > vValues.Get(1))
	else If inStr.Contains("=") Then
		Dim vValues As List = Regex.Split("\=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		If Parcela1.Contains("[") And Parcela1.Contains("]") Then
			Parcela1 = Parcela1.Replace("[","")
			Parcela1 = Parcela1.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela1}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(0,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		If Parcela2.Contains("[") And Parcela2.Contains("]") Then
			Parcela2 = Parcela2.Replace("[","")
			Parcela2 = Parcela2.Replace("]","")
			Try
				Dim val2get As String = DBStructures.GetScriptColumnStrEVC($"select execute_value from dta_requests_values where 1=1
				and request_tagcode = '${request.Trim}'
				and task_tagcode = '${task_tagcode.Trim}'
				And item_tagcode = '${Parcela2}'
				And repeatcounter = ${repeatcounter}
				and repeatfieldcounter = ${repeatfieldcounter}
				And repeatitemcounter = ${repeatitemcounter}"$, "execute_value")
				vValues.Set(1,val2get)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
			End Try
		End If
		
		ret = (vValues.Get(0) = vValues.Get(1))
	End If
	Return ret
End Sub


Sub Test4TrueOnlyValues(Formula As String) As Boolean
	Dim ret As Boolean = False
	Dim Blocks As List = FormulaInBlocks(Formula)
	If (Blocks.Size >= 1) Then
		ret = True
		For n = 0 To Blocks.Size-1
			Dim str As String = Blocks.Get(n)
			Dim vbool As Boolean = CompareOnlyValuesCondition(str)
			ret = ret And vbool
		Next
	End If
	
	Return ret
End Sub

Sub CompareOnlyValuesCondition(inStr As String) As Boolean
	
	Dim ret As Boolean = False
	Log(inStr)

	If inStr.Contains(">=") Then
		Dim vValues As List = Regex.Split("\>=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)

		ret = (vValues.Get(0) >= vValues.Get(1))
	else If inStr.Contains("<=") Then
		Dim vValues As List = Regex.Split("\<=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		ret = (vValues.Get(0) <= vValues.Get(1))
	else If inStr.Contains("!=") Then
		Dim vValues As List = Regex.Split("\!=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		ret = (vValues.Get(0) <> vValues.Get(1))
	else If inStr.Contains("<>") Then
		Dim vValues As List = Regex.Split("\<>", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		ret = (vValues.Get(0) <> vValues.Get(1))
	else If inStr.Contains("<") Then
		Dim vValues As List = Regex.Split("\<", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		ret = (vValues.Get(0) < vValues.Get(1))
	else If inStr.Contains(">") Then
		Dim vValues As List = Regex.Split("\>", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		ret = (vValues.Get(0) > vValues.Get(1))
	else If inStr.Contains("=") Then
		Dim vValues As List = Regex.Split("\=", inStr )
		
		Dim Parcela1 As String = vValues.Get(0)
		Dim Parcela2 As String = vValues.Get(1)
		
		ret = (vValues.Get(0) = vValues.Get(1))
	End If
	Return ret
End Sub

Sub concatWith(base As String, newstr As String, divider As String) As String
	Dim ret As String = base
	If NNE(newstr) Then
		'
		'ret = $"${ret}${divider}${newstr}"$
		ret = $"${ret}${IfTrue(NE(ret), "", divider)}${newstr}"$
	End If
	Return ret
End Sub

Sub SelectFieldFromLocalSQLWRKConfigTable(columnName As String) As String
	Dim retStr As String = ""
	Dim SQL As String = $"select ${columnName} from config where id=1"$
	Private Record As ResultSet = Starter.LocalSQLWRK.ExecQuery(SQL)
	Do While Record.NextRow
		retStr = Record.GetString($"${columnName}"$)
		Exit
	Loop
	Record.Close
	Return retStr
End Sub

#if B4i
Sub SetButtonTextColor(btn As Button, clr As Int, state As Int)
	Dim no As NativeObject = btn
	no.RunMethod("setTitleColor:forState:", Array(no.ColorToUIColor(clr), state))
End Sub

Sub SetBackgroundImage(b As B4XView, bmp As B4XBitmap)
	Try
		Dim no As NativeObject = b
		no.RunMethod("setBackgroundImage", Array(bmp))
	Catch
		Log(LastException)
	End Try
End Sub

Sub SetBackgroundImageState(b As B4XView, bmp As B4XBitmap, state As Int)
	Try
		Dim no As NativeObject = b
		no.RunMethod("setBackgroundImage:forState:", Array(bmp, state))
	Catch
		Log(LastException)
	End Try
End Sub

Sub SetTitleColor(b As B4XView, cr1 As Int , state As Int)
	Try
		Dim no As NativeObject = b
		no.RunMethod("setTitleColor:forState:", Array(no.ColorToUIColor(cr1), state))
	Catch
		Log(LastException)
	End Try
End Sub

Sub AddTabPageCS(pageList As List, pageTab As Page, pageLayout As String, pageTitle As String, pageColor As Int)
	pageTab.Initialize("tabpages")
	pageTab.RootPanel.LoadLayout(pageLayout)
	Dim lbl As Label
	lbl.Initialize("")
	lbl.Text = pageTitle
	lbl.TextColor = pageColor
'	lbl.Color = Consts.ColorWhite
	pageTab.TitleView = lbl
	pageTab.Title = pageTitle
	pageList.Add(pageTab)
End Sub

Sub EditTabPageCS(pageList As List, pageColor As Int, pageNOColor As Int, index As Int) As List
	Dim ret As List = pageList
	For n=0 To ret.Size-1
		Dim p As Page = ret.Get(n)
		'Log(p.Title)
		Dim lbl As Label : lbl.Initialize("")
		If (n = index) Then
			lbl.TextColor = pageColor
			lbl.Font = Font.CreateNewBold(18)
		Else
			lbl.TextColor = pageNOColor
			lbl.Font = Font.CreateNew(18)
		End If
		lbl.Text = p.Title
		p.TitleView = lbl
	Next
	Return ret
End Sub

Sub ShowPage(NavigationControl As NavigationController,PageToShow As Page,TransType As Int, Direction As Int)
	Dim TransitionType As String
	Select TransType
		Case 0
			TransitionType = "cameraIris"
		Case 1
			TransitionType = "cameraIrisHollowOpen"
		Case 2
			TransitionType = "cameraIrisHollowClose"
		Case 3
			TransitionType = "cube"
		Case 4
			TransitionType = "alignedCube"
		Case 5
			TransitionType = "flip"
		Case 6
			TransitionType = "alignedFlip"
		Case 7
			TransitionType = "oglFlip"
		Case 8
			TransitionType = "rotate"
		Case 9
			TransitionType = "pageCurl"
		Case 10
			TransitionType = "pageUnCurl"
		Case 11
			TransitionType = "rippleEffect"
		Case 12
			TransitionType = "suckEffect"
	End Select
  
	Dim FromDirection As String
	Select Direction
		Case 0
			FromDirection = "fromTop"
		Case 1
			FromDirection = "fromBottom"
		Case 2
			FromDirection = "fromLeft"
		Case 3
			FromDirection = "fromRight"
	End Select
  
	Dim no As NativeObject=Me
	no.RunMethod("trans:::",Array(NavigationControl,TransitionType,FromDirection))
	NavigationControl.ShowPage2(PageToShow,False)
End Sub
#End If

#if OBJC

-(void) trans: (UINavigationController*)nav :(NSString*)tp :(NSString*)from
{
CATransition *transition = [CATransition animation];
transition.duration = 0.6f;
transition.timingFunction = [CAMediaTimingFunction functionWithName:kCAMediaTimingFunctionEaseInEaseOut];
transition.type = tp;
transition.subtype = from;
[nav.view.layer addAnimation:transition forKey:nil];
}
#End If

#if B4i
Sub ShowProgress (Title As String, Detail As String)
	UtilsHUD.ProgressDialogShow(Title)
	Dim no As NativeObject = UtilsHUD
	no.GetField("progress").SetField("detailsLabelText",Detail)
End Sub

Sub CloseProgress 
	UtilsHUD.ProgressDialogHide
End Sub
#end if

Sub FormatFileSize(Bytes As Float) As String
	Private Unit() As String = Array As String(" Byte", " Kb", " Mb", " Gb", " Tb", " Pb", " Eb", " Zb", " Yb")
	If Bytes = 0 Then
		Return "0 Bytes"
	Else
		Private Po, Si As Double
		Private I As Int
		Bytes = Abs(Bytes)
		I = Floor(Logarithm(Bytes, 1024))
		Po = Power(1024, I)
		Si = Bytes / Po
		Return NumberFormat(Si, 1, 1) & Unit(I)
	End If
End Sub

Sub logall(title As String, values() As String)
	Dim ss As String 
	For Each lg As String In values
		ss = addthis(ss, lg, ",", True)
	Next
	Log(title & ss)
End Sub

Sub addthis(str As String, new As String, sep As String, space As Boolean) As String
	Dim ret As String = str
	sep = IfNullOrEmpty(sep, ",")
	If (space = True) Then sep = sep & " "
	If NNE(ret) Then
		ret = ret & sep
	End If
	ret = ret & new
	Return ret
End Sub

Sub DTGEOSave2Canvas(cvs As B4XCanvas, la As String, lo As String) As B4XCanvas
	Private xui As XUI
	Dim DateTimeName As String = $"${MakeDateTimeSlash2}  -  ${la}/${lo}"$
	Dim f As B4XFont = xui.CreateDefaultFont(ShareCode.DEVICE_DEF_FONT_SIZE)
	Dim dRect As B4XRect
	dRect.Initialize(cvs.TargetRect.Left+10dip, cvs.TargetRect.Height-18dip, cvs.TargetRect.Left+350dip, cvs.TargetRect.Height)
	DrawTextWithBorder2(cvs, DateTimeName, f, Consts.ColorDarkGray, (dRect.left+dRect.Right)/2, (dRect.Top+dRect.Bottom)/2, 1, 0)
	cvs.Invalidate
	Return cvs
End Sub

Sub DrawTextWithBorder2 (cvs1 As B4XCanvas, Text As String, Fnt As B4XFont, Clr As Int, CenterX As Int, CenterY As Int, border As Int, bline As Int)
	'CenterX = (DrawingRect.left+DrawingRect.Right)/2, CenterY = (DrawingRect.Top+DrawingRect.Bottom)/2
	Dim r As B4XRect = cvs1.MeasureText(Text, Fnt)
	r.Height = r.Height + (r.Height /2) + 5dip
	r.Width = r.Width + (r.Width /2) + 5dip ' * 2
	
	Dim baseline As Int = CenterY - ((r.Height - Fnt.Size)/2) - r.Top 'CenterY - r.Height / 2 - r.Top
	'cvs1.DrawCircle(CenterX, CenterY, 3dip, xui.Color_Blue, True, 0)
	r.Initialize(CenterX - r.Width / 2, CenterY - r.Height / 2, CenterX + r.Width / 2, CenterY + r.Height / 2)
	If (bline >=1) Then
		cvs1.DrawLine(r.Left, baseline, r.Right, baseline, Clr, bline)
	End If
	If (border >=1) Then
		Dim ro As B4XRect
		ro.Initialize(r.Left-border, r.Top-border, r.Right+border, r.Bottom+border)
		cvs1.DrawRect(ro, Clr, True, border)
		cvs1.DrawRect(r, Consts.ColorWhite, True, border)
	End If
	'cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
	cvs1.DrawText(Text, CenterX, baseline, Fnt, Clr, "CENTER")
End Sub

Sub isValidDate(mDate As String) As Boolean
	Try
		DateTime.DateParse(mDate)
	Catch
		Return False
	End Try
	Return True
End Sub

Sub ConvertImageSize(image As String, ImageCounter As Int, percent As Double) As String
	Dim bmp As B4XBitmap = B64ToBitmap(image)
	Dim abcFile As String = $"ABC${ImageCounter}.png"$
	Dim defFile As String = $"DEF${ImageCounter}.png"$
	Bitmap2File(bmp, Starter.SharedFolder, abcFile)
	Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH - (ShareCode.DEVICE_DEF_IMG_WIDTH /percent)
	Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT - (ShareCode.DEVICE_DEF_IMG_HEIGHT /percent)
	Dim newbmp As B4XBitmap = LoadBitmapResize(Starter.SharedFolder, abcFile, bw, bh, True)
	Bitmap2File(newbmp, Starter.SharedFolder, defFile)
#if B4A
	Dim Base64Con As Base64Convert : Base64Con.Initialize
	Dim image As String = Base64Con.EncodeFromImage(Starter.SharedFolder, defFile)
#else
	Dim image As String = ImageToBase64(Starter.Provider.SharedFolder, defFile)
#end if
	File.Delete(Starter.SharedFolder, abcFile)
	File.Delete(Starter.SharedFolder, defFile)
	Return image
End Sub

Sub ConvertImageSizeFromFile(image As String, ImageCounter As Int, percent As Double) As String
	Dim defFile As String = $"DEF${ImageCounter}.png"$
	Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH - (ShareCode.DEVICE_DEF_IMG_WIDTH /percent)
	Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT - (ShareCode.DEVICE_DEF_IMG_HEIGHT /percent)
	Dim newbmp As B4XBitmap = LoadBitmapResize(Starter.SharedFolder, image, bw, bh, True)
	Bitmap2File(newbmp, Starter.SharedFolder, defFile)
#if B4A
	Dim Base64Con As Base64Convert : Base64Con.Initialize
	Dim image As String = Base64Con.EncodeFromImage(Starter.SharedFolder, defFile)
#else
	Dim image As String = ImageToBase64(Starter.Provider.SharedFolder, defFile)
#end if
	File.Delete(Starter.SharedFolder, defFile)
	Return image
End Sub

Sub ConvertImageSizeWH(image As String, ImageCounter As Int, bw As Int, bh As Int) As String
	Dim bmp As B4XBitmap = B64ToBitmap(image)
	Dim abcFile As String = $"ABC${ImageCounter}.png"$
	Dim defFile As String = $"DEF${ImageCounter}.png"$
	Bitmap2File(bmp, Starter.SharedFolder, abcFile)
	Dim newbmp As B4XBitmap = LoadBitmapResize(Starter.SharedFolder, abcFile, bw, bh, True)
	Bitmap2File(newbmp, Starter.SharedFolder, defFile)
#if B4A
	Dim Base64Con As Base64Convert : Base64Con.Initialize
	Dim image As String = Base64Con.EncodeFromImage(Starter.SharedFolder, defFile)
#else
	Dim image As String = ImageToBase64(Starter.Provider.SharedFolder, defFile)
#end if
	File.Delete(Starter.SharedFolder, abcFile)
	File.Delete(Starter.SharedFolder, defFile)
	Return image
End Sub

Sub ConvertImageSizeFromFileWH(image As String, ImageCounter As Int, bw As Int, bh As Int) As String
	Dim defFile As String = $"DEF${ImageCounter}.png"$
	Dim newbmp As B4XBitmap = LoadBitmapResize(Starter.SharedFolder, image, bw, bh, True)
	Bitmap2File(newbmp, Starter.SharedFolder, defFile)
#if B4A
	Dim Base64Con As Base64Convert : Base64Con.Initialize
	Dim image As String = Base64Con.EncodeFromImage(Starter.SharedFolder, defFile)
#else
	Dim image As String = ImageToBase64(Starter.Provider.SharedFolder, defFile)
#end if
	File.Delete(Starter.SharedFolder, defFile)
	Return image
End Sub

Sub ConvertImage(image As String, ImageCounter As Int, percent As Double) As String
	Dim bmp As B4XBitmap = B64ToBitmap(image)
	Dim abcFile As String = $"ABC${ImageCounter}.png"$
	Dim defFile As String = $"DEF${ImageCounter}.png"$
#if B4A
	Bitmap2File(bmp, Starter.SharedFolder, abcFile)
#else
	Bitmap2File(bmp, Starter.Provider.SharedFolder, abcFile)
#end if

	Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH - (ShareCode.DEVICE_DEF_IMG_WIDTH /percent)
	Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT - (ShareCode.DEVICE_DEF_IMG_HEIGHT /percent)
	Dim newbmp As B4XBitmap = LoadBitmapSample(Starter.Provider.SharedFolder, abcFile, bw, bh)
	Bitmap2File(newbmp, Starter.Provider.SharedFolder, defFile)
#if B4A
	Dim Base64Con As Base64Convert : Base64Con.Initialize
	Dim image As String = Base64Con.EncodeFromImage(Starter.SharedFolder, defFile)
#else
	Dim image As String = ImageToBase64(Starter.Provider.SharedFolder, defFile)
#end if
	File.Delete(Starter.Provider.SharedFolder, abcFile)
	File.Delete(Starter.Provider.SharedFolder, defFile)
	Return image
End Sub

Sub ConvertImageFromFile(image As String, ImageCounter As Int, percent As Double) As String
'	Dim bmp As B4XBitmap = B64ToBitmap(image)
'	Dim abcFile As String = $"ABC${ImageCounter}.png"$
	Dim defFile As String = $"DEF${ImageCounter}.png"$
'	Bitmap2File(bmp, Starter.SharedFolder, abcFile)
	Dim bw As Int = ShareCode.DEVICE_DEF_IMG_WIDTH - (ShareCode.DEVICE_DEF_IMG_WIDTH /percent)
	Dim bh As Int = ShareCode.DEVICE_DEF_IMG_HEIGHT - (ShareCode.DEVICE_DEF_IMG_HEIGHT /percent)
	Dim newbmp As B4XBitmap = LoadBitmapSample(Starter.SharedFolder, image, bw, bh)
	Bitmap2File(newbmp, Starter.SharedFolder, defFile)
#if B4A
	Dim Base64Con As Base64Convert : Base64Con.Initialize
	Dim image As String = Base64Con.EncodeFromImage(Starter.SharedFolder, defFile)
#else
	Dim image As String = ImageToBase64(Starter.Provider.SharedFolder, defFile)
#end if
	File.Delete(Starter.SharedFolder, defFile)
	Return image
End Sub




'Sub Bitmap2File(BMP As B4XBitmap, Folder As String, Filename As String)
'	Dim Out As OutputStream
'	Out = File.OpenOutput(Folder, Filename, False)
'	BMP.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
'	Out.Close
'End Sub

Sub SIToBoolean(v As String) As Boolean
	If (v.ToUpperCase = "NO") Or (v = "0") Then
		Return False
	Else
		Return True
	End If
End Sub

Sub ShowLog(Text As String, Value As String, Division As Boolean)
	If Division Then
		Dim StrDiv As String = IncChars(Text.Length+Value.Length+2, "=", True)
		Log($"${StrDiv}"$)
	End If
	Log($"${Text}: ${Value}"$)
End Sub

Sub IncChars(len As Int, charstr As String, toLeft As Boolean) As String
	Dim ret As String = ""
	For n=0 To len-1
		If (toLeft = True) Then
			ret = $"${charstr}${ret}"$
		Else
			ret = $"${ret}${charstr}"$
		End If
	Next
	Return ret
End Sub

Sub ShowLogList(Text As String, Value As List)
	Log($"${Text}: Lista de valores"$)
	Dim StrDiv As String = IncChars(Text.Length+2, "=", True)
	If (Value.Size >= 1) Then
		For n=0 To Value.Size-1
			Log($"${StrDiv}- ${Value.Get(n)}"$)
		Next
	Else
		Log($"${StrDiv}- Sem valores"$)
	End If
End Sub

Sub logFile(filename As String, origin As Int, uploaded As Int, changed As Int, filedate As String)
	Dim params As Map
	params.Initialize
	params.Put("filename", filename)
	params.Put("origin", origin)
	params.Put("uploaded", uploaded)
	params.Put("changed", changed)
	params.Put("filedate", filedate)
	Dim InsertList As List
	InsertList.Initialize
	InsertList.Add(params)
	DBUtils.InsertMaps(Starter.LocalSQLWRK, "log_files", InsertList)
End Sub

Sub logChangeFile(filename As String, origin As Int, updated As Int, changed As Int, filedate As String)
	Dim doUpdate As Boolean = DBDataExists(Starter.LocalSQLWRK, $"select * from log_files where filename='${filename}'"$)
	If (doUpdate) Then
		Dim sqlScript As String = $"update log_files set origin=${origin}, changed=${changed}, filedate='${filedate}' where filename='${filename}'"$
		Starter.LocalSQLWRK.ExecNonQuery(sqlScript)
	Else
		logFile(filename, origin, updated, changed, filedate)
	End If
End Sub

Sub logFileList As List
	Dim InsertList As List
	InsertList.Initialize
	Return InsertList
End Sub

Sub SaveSQLToLog(Local As String, SQLScript As String, request As String) As Boolean
	Dim ret As Boolean = True
	Try
		Starter.LocalSQLEVC.ExecNonQuery(SQLScript)
		Log(SQLScript)
	Catch
		Log(LastException)
		WriteErrors2Log(LastException)
		logError(Local, ShareCode.SESS_OPER_User, $"${SQLScript} :: ${LastException}"$)
		Log("ERROR : " & SQLScript)
		ret = False
	End Try
'	Log($"--> Saved script: ${SQLScript}"$)
	If NNE(request) Then
		If Not(SQLScript.EndsWith(";")) Then
			SQLScript = $"${SQLScript};"$
		End If
		SaveScriptToLog(request, SQLScript)
	End If
	Return ret
End Sub


Sub SaveScriptToLog(request As String, script As String)
#if B4A
	Dim tSave As TextWriter
	Dim dt As String = GetCurrDatetimeT2("")
	tSave.Initialize(File.OpenOutput(Starter.SharedFolder, $"request_${request.trim}_${dt}.log"$, True))
	tSave.WriteLine(script)
	tSave.Close
#else 	
	Dim dt As String = GetCurrDatetimeT2("")
	Dim filename As String = $"request_${request.trim}_${dt}.log"$
	If File.Exists(File.DirDocuments, filename) Then
		Dim UpList As List = File.ReadList(File.DirDocuments, filename)
	Else
		Dim UpList As List : UpList.Initialize
	End If
	If Not(script.EndsWith(";")) Then
		script = $"${script};"$
	End If
	UpList.Add(script)
	File.WriteList(File.DirDocuments, filename, UpList)
#end if
End Sub

Sub logError(logaction As String, loguser As String, logmessage As String)
#if B4A
	Dim logLocations As String = getGeoLocationFormat
#else 
	Dim logLocations As String = getGeoLocationFormat(Starter.LocationLatitude, Starter.LocationLongitude)
#end if
	Dim params As Map
	params.Initialize
	params.Put("logdatetime", GetCurrDatetime)
	params.Put("logaction", logaction)
	params.Put("loguser", loguser)
	params.Put("loglocation", logLocations)
	params.Put("logmessage", logmessage)
	params.Put("logdevice", ShareCode.APP_Authorization)
	params.Put("reported", 0)
	Dim InsertList As List
	InsertList.Initialize
	InsertList.Add(params)
	DBUtils.InsertMaps(Starter.LocalSQLWRK, "log_errors", InsertList)
End Sub

Sub logLocation(loglatitude As String, loglongitude As String, loguser As String)
	Dim params As Map
	params.Initialize
	params.Put("logdatetime", GetCurrDatetime)
	params.Put("loguser", loguser)
	params.Put("loglatitude", loglatitude)
	params.Put("loglongitude", loglongitude)
	params.Put("logdevice", ShareCode.APP_Authorization)
	params.Put("reported", 0)
	Dim InsertList As List
	InsertList.Initialize
	InsertList.Add(params)
	DBUtils.InsertMaps(Starter.LocalSQLWRK, "log_positions", InsertList)
End Sub

#if B4A
Sub getGeoLocationFormat As String
	Private sACLALatitude As String = ""
	Private sACLALongitude As String = ""
	If Not(isNullOrEmpty(LocationService.GeoLocal.lat)) Then
		Try
			sACLALatitude = LocationService.GeoLocal.lat
		Catch
			Log(LastException)
			WriteErrors2Log(LastException)
		End Try
	End If
	If Not(isNullOrEmpty(LocationService.GeoLocal.lon)) Then
		Try
			sACLALongitude = LocationService.GeoLocal.lon
		Catch
			Log(LastException)
			WriteErrors2Log(LastException)
		End Try
	End If
	Return $"${sACLALatitude},${sACLALongitude}"$
End Sub
#else
Sub getGeoLocationFormat(lat As String, lon As String) As String
	Private sACLALatitude As String = ""
	Private sACLALongitude As String = ""
	If Not(isNullOrEmpty(lat)) Then
		Try
			sACLALatitude = lat
		Catch
			Log(LastException)
		End Try
	End If
	If Not(isNullOrEmpty(lon)) Then
		Try
			sACLALongitude = lon
		Catch
			Log(LastException)
		End Try
	End If
	Return $"${sACLALatitude},${sACLALongitude}"$
End Sub
#end if

Sub getLogErrorsList As List
	Dim StrList As List
	StrList.Initialize
	
	Private Record As ResultSet
	Dim sSQL As String = $"select * from log_errors where reported=0"$
	Record = Starter.LocalSQLWRK.ExecQuery(sSQL)
	Do While Record.NextRow
'	If Record.RowCount > 0 Then
'		For Row = 0 To Record.RowCount-1
'			Record.Position = Row
			Dim params As Map
			params.Initialize
			params.Put("logdatetime", Record.GetString("logdatetime"))
			params.Put("logaction", Record.GetString("logaction"))
			params.Put("loguser", Record.GetString("loguser"))
			params.Put("loglocation", Record.GetString("loglocation"))
			params.Put("logmessage", Record.GetString("logmessage"))
			params.Put("logdevice", Record.GetString("logdevice"))
			params.Put("reported", 1)
			StrList.Add(params)
			
			Dim Mapping As Map
			Mapping.Initialize
			Mapping.Put("reported", 1)
			Dim Condition As Map
			Condition.Initialize
			Condition.Put("logdatetime", Record.GetString("logdatetime"))
			Condition.Put("loglocation", Record.GetString("loglocation"))
			Condition.Put("reported", 0)
		DBUtils.UpdateRecord2(Starter.LocalSQLWRK, "log_errors", Mapping, Condition)
'		Next
'	End If
	Loop
	Record.Close
	Return StrList
End Sub

Sub getLogPositionsList As List
	Dim StrList As List
	StrList.Initialize
	
	Private Record As ResultSet
	Dim sSQL As String = $"select * from log_positions where reported=0"$
	Record = Starter.LocalSQLWRK.ExecQuery(sSQL)
	Do While Record.NextRow
'	If Record.RowCount > 0 Then
'		For Row = 0 To Record.RowCount-1
'			Record.Position = Row
			Dim params As Map
			params.Initialize
			params.Put("logdatetime", Record.GetString("logdatetime"))
			params.Put("loguser", Record.GetString("loguser"))
			params.Put("loglatitude", Record.GetString("loglatitude"))
			params.Put("loglongitude", Record.GetString("loglongitude"))
			params.Put("logdevice", Record.GetString("logdevice"))
			params.Put("reported", 1)
			StrList.Add(params)
			
			Dim Mapping As Map
			Mapping.Initialize
			Mapping.Put("reported", 1)
			Dim Condition As Map
			Condition.Initialize
			Condition.Put("logdatetime", Record.GetString("logdatetime"))
			Condition.Put("loglatitude", Record.GetString("loglatitude"))
			Condition.Put("loglongitude", Record.GetString("loglongitude"))
			Condition.Put("reported", 0)
		DBUtils.UpdateRecord2(Starter.LocalSQLWRK, "log_positions", Mapping, Condition)
'		Next
'	End If
	Loop
	Record.Close
	Return StrList
End Sub

Sub Logs2Server As List 
	Dim BigList As List
	BigList.Initialize
	
	Dim params As Map
	params.Initialize
	params.Put("errors", getLogErrorsList)
	'params.Put("positions", getLogPositionsList)
	BigList.Add(params)
	
	Dim params As Map
	params.Initialize
	params.Put("positions", getLogPositionsList)
	BigList.Add(params)
	
	
	Return BigList
End Sub

' updates multiple fields in a record
' in the Fields map the keys are the column names
Public Sub UpdateRecord2WithLog(SQL As SQL, TableName As String, Fields As Map, WhereFieldEquals As Map, request As String, Local As String)
	If WhereFieldEquals.Size = 0 Then
		Log("WhereFieldEquals map empty!")
		Return
	End If
	If Fields.Size = 0 Then
		Log("Fields empty")
		Return
	End If
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append("UPDATE ").Append(TableName).Append(" SET ")
	Dim args As List
	args.Initialize
	For Each col As String In Fields.Keys
		sb.Append(col).Append($"='${Fields.Get(col)}',"$)
'		sb.Append(",")
'		args.Add(Fields.Get(col))
	Next
	sb.Remove(sb.Length - 1, sb.Length)
	sb.Append(" WHERE ")
	For Each col As String In WhereFieldEquals.Keys
		sb.Append(col).Append($"='${Fields.Get(col)}' AND "$) '    " = ?")
'		sb.Append(" AND ")
'		args.Add(WhereFieldEquals.Get(col))
	Next
	sb.Remove(sb.Length - " AND ".Length, sb.Length)
	Log("UpdateRecord: " & sb.ToString)
'	SQL.ExecNonQuery2(sb.ToString, args)
	Try
		SQL.ExecNonQuery(sb.ToString)
	Catch
		Log(LastException)
		WriteErrors2Log(LastException)
		logError(Local, ShareCode.SESS_OPER_User, $"${sb.ToString} :: ${LastException}"$)
				
	End Try
	
	If NNE(request) Then
		Dim ss As String = sb.ToString
		If Not(ss.EndsWith(";")) Then
			ss = $"${ss};"$
		End If
		SaveScriptToLog(request, ss)
	End If
End Sub

Public Sub InsertMapsWithLog(SQL As SQL, TypeLog As Int, TableName As String, ListOfMaps As List, request As String, Local As String)
	Dim sb, columns, values As StringBuilder
	'Small check for a common error where the same map is used in a loop
	If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = ListOfMaps.Get(1) Then
		Log("Same Map found twice in list. Each item in the list should include a different map object.")
		Return
	End If
	SQL.BeginTransaction
	Try
		For i1 = 0 To ListOfMaps.Size - 1
			sb.Initialize
			columns.Initialize
			values.Initialize
			Dim listOfValues As List
			listOfValues.Initialize
			sb.Append("INSERT INTO " & TableName & " (")
			Dim m As Map = ListOfMaps.Get(i1)
			For Each col As String In m.Keys
				Dim value As Object = m.Get(col)
				'***********************************************************************
				' ALTERACAO PC
				' SQLite ConstraintException NO id
				' SE A COLUNA FOR id O VALOR É O MAXID
				'***********************************************************************
				
				If col = "id" Then
					Dim maxid As Int = DBStructures.GetMaxOfEVC(TableName, "id", "") +1 + 1000000
					value = maxid
				End If
				
				If listOfValues.Size > 0 Then
					columns.Append(", ")
					values.Append(", ")
				End If
				columns.Append(col)
				values.Append($"'${value}'"$)
				listOfValues.Add(value)
			Next
			sb.Append(columns.ToString).Append(") VALUES (").Append(values.ToString).Append(")")
			If i1 = 0 Then Log("InsertMaps (first query out of " & ListOfMaps.Size & "): " & sb.ToString)
			'SQL.ExecNonQuery2(sb.ToString, listOfValues)
			Log(sb.ToString)
			Try
				SQL.ExecNonQuery(sb.ToString)
			Catch
				Log(LastException)
				WriteErrors2Log(LastException)
				logError(Local, ShareCode.SESS_OPER_User, $"${sb.ToString} :: ${LastException}"$)
			End Try
	
			If NNE(request) Then
				Dim ss As String = sb.ToString
				If Not(ss.EndsWith(";")) Then
					ss = $"${ss};"$
				End If
				SaveScriptToLog(request, ss)
				Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, request.trim, "", "")
				save2updateFile(TableName, ss, TypeLog, request, WorkerND)
			End If
		Next
		SQL.TransactionSuccessful
	Catch
		Log(LastException)
		WriteErrors2Log(LastException)
#If B4i OR B4J
		SQL.Rollback
#End If
	End Try
#If B4A
	SQL.EndTransaction
#End If
End Sub

Private Sub EscapeField(f As String) As String
	Return "[" & f & "]"
End Sub


Sub getASStatus(id As Int) As String
	Dim retStr As String = ""
	Private Record As ResultSet
	Dim sSQL As String = $"select tagcode from type_operationtypes where id=${id}"$
	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While Record.NextRow
		retStr = Record.GetString("tagcode")
		Exit
	Loop
	Record.Close
	Return retStr
End Sub

Sub getASPriority(id As Int) As String
	Dim retStr As String = ""
	Private inRecord As ResultSet
	Dim sSQL As String = $"select tagcode from type_prioritytypes where id=${id}"$
	inRecord = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While inRecord.NextRow
		retStr = inRecord.GetString("tagcode")
		Exit
	Loop
	
	inRecord.Close
	Return retStr
End Sub


Sub getASUrgency(id As Int) As String
	Dim retStr As String = ""
	Private Record As ResultSet
'#if B4A
'	Dim sSQL As String = $"select tagcode from type_urgency where id=${id}"$
'#else
'	Dim sSQL As String = $"select tagcode from type_gravitytypes where id=${id}"$
'#end if

	Dim sSQL As String = $"select tagcode from type_gravitytypes where id=${id}"$
	
	Record = Starter.LocalSQLEVC.ExecQuery(sSQL)
	Do While Record.NextRow
		retStr = Record.GetString("tagcode")
		Exit
	Loop
	Record.Close
	Return retStr
End Sub


Sub udid As String
	Dim sr As SecureRandom
	Dim data(16) As Byte
	sr.GetRandomBytes(data)
	Dim bc As ByteConverter
	Dim hex As String = bc.HexFromBytes(data)
	Dim sb As StringBuilder
	sb.Initialize
	Dim i As Int
	For Each stp As Int In Array(8, 4, 4, 4, 12)
		If sb.Length > 0 Then sb.Append("-")
		sb.Append(hex.SubString2(i, i + stp))
		i = i + stp
	Next
	Dim Ret As String = ""
	If (sb.Length >= 1) Then
		Ret = sb.ToString
	Else
		Ret = GenerateTagcode("PRE_" )
	End If
	Return Ret
End Sub

Sub SecureRandomGenerator(Minimum As Int, Maximum As Int) As Int
	Dim sr As SecureRandom
	Dim data(4) As Byte
	sr.GetRandomBytes(data)
	Dim bc As ByteConverter
	Dim random As Int = bc.IntsFromBytes(data)(0)
	Maximum = Maximum - 1
	Dim d As Double = random / 0x7FFFFFFF
	Dim res As Int = Round(d * (Maximum - Minimum + 1) / 2 + (Minimum + Maximum) / 2)
	'Log(res & ", " & random & ", " & d)
	Return res
End Sub

Sub CreateFileProviderUri (FileName As String) As Object    'Dir As String,
#if B4A
	Return Starter.Provider.GetFileUri(FileName)
#else
	Return Starter.Provider.InternalFolder & "/" & FileName
#end if
	
'	Dim FileProvider1 As JavaObject
'	Dim context As JavaObject
'	context.InitializeContext
'	FileProvider1.InitializeStatic("android.support.v4.content.FileProvider")
'	Dim f As JavaObject
'	f.InitializeNewInstance("java.io.File", Array(Dir, FileName))
'	Return FileProvider1.RunMethod("getUriForFile", Array(context, Application.PackageName & ".provider", f))
	
End Sub


Sub RandomString() As String
	Dim length As Int = 15
	Dim abc As String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
	Dim RandomStr As StringBuilder
	RandomStr.Initialize
	For i = 0 To length - 1
		RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))
	Next
	Return MakeFileName & RandomStr.ToString
End Sub


Sub RandomString2(length As Int) As String
	'Dim length As Int = 15
	Dim abc As String = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
	Dim RandomStr As StringBuilder
	RandomStr.Initialize
	For i = 0 To length - 1
		RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))
	Next
	Return RandomStr.ToString
End Sub

Sub RandomInt2(length As Int) As String
	Dim abc As String = "0123456789"
	Dim RandomStr As StringBuilder
	RandomStr.Initialize
	For i = 0 To length - 1
		RandomStr.Append(abc.CharAt(Rnd(0,abc.Length)))
	Next
	Return RandomStr.ToString
End Sub

#if B4a
Sub ViewPDFFile(filename As String)
	Dim Intent1 As Intent
	'Intent1.Initialize(Intent1.ACTION_VIEW, Starter.Provider.GetFileUri(filename))
	
	Intent1.Initialize(Intent1.ACTION_VIEW, Starter.Provider.GetFileUri(filename))
	Dim ApplicationType As String = GetDocType(filename)
	Intent1.SetType(ApplicationType)
	Intent1.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
	Dim pdfAppsList As List
	pdfAppsList = QueryIntent(Intent1)
	If pdfAppsList.size>0 Then
		StartActivity(Intent1)
	End If
End Sub
#else if b4i
Sub ViewPDFFile(filename As String, Wv  As WKWebView)
	Wv.LoadUrl("file://" & Starter.Provider.InternalFolder & "/" & filename)
End Sub
#end if

Sub ViewFile(filename As String)
	Dim IntentFile As Intent
	IntentFile.Initialize(IntentFile.ACTION_VIEW, Starter.Provider.GetFileUri(filename))
	Dim IntentFileType As String = GetIntentFileType(filename)
	Log(IntentFileType)
	IntentFile.SetType(IntentFileType)
	IntentFile.Flags = 1 'FLAG_GRANT_READ_URI_PERMISSION
	Try
		StartActivity(IntentFile)
	Catch
		ToastMessageShow("Você nao tem aplicação para abrir este tipo de arquivo", True)
	End Try
End Sub

Sub GetIntentFileType(filename As String)
	Dim Filetype As String
	Filetype = filename.Substring(filename.LastIndexOf(".")+1)
	Log(filename)
	
	Select Filetype
		Case "doc"
			Return "application/msword"
		Case "docx"
			Return "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
		Case "jpg"
			Return "image/jpeg"
		Case "mp3"
			Return "audio/mpeg"
		Case "mpeg"
			Return "video/mpeg"
		Case "ppt"
			Return "application/vnd.ms-powerpointtd>"
		Case "pptx" 
			Return "application/vnd.openxmlformats-officedocument.presentationml.presentation"
		Case "pdf"
			Return "application/pdf"
		Case "xls"
			Return "application/vnd.ms-excel"
		Case "xlsx"
			Return "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
		Case "txt"
			Return "text/plain"
		Case "xml"
			Return "application/xml"
		Case Else 
			Return "application/vnd.android.package-archive"
	End Select
End Sub

Sub GetDocType(FileName As String) As String
	Dim DOC As String = ".doc"
	Dim DOCX As String = ".docx"
	Dim PDF As String = ".pdf"	
	Dim PPT As String = ".ppt"
	Dim PPTX As String = ".pptx"	
	Dim XLS As String = ".xls"
	Dim XLSX As String = ".xlsx"		
	Dim PNG As String = ".png"
	Dim JPEG As String = ".jpeg"
	Dim JPG As String = ".jpg"
	Dim TXT As String = ".txt"
	Dim GIF As String = ".gif"
	Dim ZIP As String = ".zip"
	Dim RAR As String = ".rar"
	Dim RTF As String = ".rtf"
	Dim WAV As String = ".wav"
	Dim MP3 As String = ".mp3"

	Dim Ext As String = GetFileExt(FileName)
	
	If(Ext.EqualsIgnoreCase(DOC) Or Ext.EqualsIgnoreCase(DOCX)) Then
		Return "application/msword"
	Else If	(Ext.EqualsIgnoreCase(PDF)) Then
		Return "application/pdf"
	Else If(Ext.EqualsIgnoreCase(PPT) Or Ext.EqualsIgnoreCase(PPTX)) Then
		Return "application/vnd.ms-powerpoint"
	Else If(Ext.EqualsIgnoreCase(XLS) Or Ext.EqualsIgnoreCase(XLSX)) Then
		Return "application/vnd.ms-excel"
	Else If(Ext.EqualsIgnoreCase(PNG) Or Ext.EqualsIgnoreCase(JPEG) Or Ext.EqualsIgnoreCase(JPG)) Then
		Return "image/jpeg"
	Else If	(Ext.EqualsIgnoreCase(TXT)) Then
		Return "text/plain"
	Else If	(Ext.EqualsIgnoreCase(GIF)) Then
		Return "image/gif"
	Else If	(Ext.EqualsIgnoreCase(ZIP)) Then
		Return "application/zip"
	Else If	(Ext.EqualsIgnoreCase(RAR)) Then
		Return "application/x-rar-compressed"
	Else If	(Ext.EqualsIgnoreCase(RTF)) Then
		Return "application/rtf"
	Else If(Ext.EqualsIgnoreCase(WAV) Or Ext.EqualsIgnoreCase(MP3)) Then
		Return "audio/x-wav"
	End If
		Return ""
End Sub

Sub GetFileExt(FileName As String) As String
	If NNE(FileName) Then
		Return FileName.SubString2(FileName.LastIndexof("."), FileName.Length)
	Else 
		Return "" 
	End If
End Sub

'Sub isOnLine(v As Application) As Boolean
'	Dim b As Boolean = v.CanOpenURL("https://www.google.com")
'	Return b
'End Sub

Sub DBDataExists(DBSQL As SQL, script As String) As Boolean
	Dim val As Int = 0
	Dim Record As ResultSet
	Record = DBSQL.ExecQuery(script)
	Do While Record.NextRow
		val = val + 1
	Loop
	Dim hasData As Boolean = val >= 1
	Record.Close
	Return hasData
End Sub

Sub DBDataCount(DBSQL As SQL, script As String) As Int
	'Dim Record As Cursor
	'Record = DBSQL.ExecQuery(script)
	'Dim hasData As Boolean = Record.RowCount > 0
	'Dim val As Int = 0
	'If (hasData) Then
	'	Record.Position = 0
    '
	'	val = Record.GetInt("COUNTER")
	'End If
	Dim val As Int = 0
	Dim Record As ResultSet
	Record = DBSQL.ExecQuery(script)
	Do While Record.NextRow
		val = Record.GetInt("COUNTER")
	Loop
	Record.Close
	Return val
End Sub

Sub JsonToMap(strJSON As String) As Map
	' convert a json string to a map
	Dim jMap As Map
	jMap.Initialize
	Dim JSON As JSONParser
	JSON.Initialize(strJSON)
	jMap = JSON.NextObject
	Return jMap
End Sub

Sub MapToJson(mMap As Map) As String
	Dim JSON As JSONGenerator
	JSON.Initialize(mMap)
	Dim Data As String =   JSON.ToPrettyString(1)
	Return Data
End Sub

Sub saveEmail2update(request As String, data As String, typelog As Int, WND As WorkerNewData)
	
	Dim tablename As String = "loc_updateemails"
	Dim params As Map
	
	params.Initialize
	params.Put("up_date", GetCurrDatetimeExt)
	params.Put("up_state", 0)
	params.Put("up_type", typelog)
	params.Put("up_tableurl", tablename)
	params.Put("up_values", data)
	params.Put("up_typeoper",WND.up_typeoper)
	params.Put("up_tagcode",WND.up_tagcode)
	params.Put("up_task",WND.up_task)
	params.Put("up_itemtagcode",WND.up_itemtagcode)
	
	Dim InsertList As List
	InsertList.Initialize
	InsertList.Add(params)

	Try
		DBUtils.InsertMaps(Starter.LocalSQLWRK, tablename, InsertList)
	Catch
		Log(LastException)
	End Try
	
End Sub

Sub save2update(tablename As String, Data As String, typelog As Int, WND As WorkerNewData)
	save2updateFile(tablename, Data, typelog, "OFFLINE", WND)
	
'	up_typeoper    0 = PEDIDO ou INTERVENCAO / 1 = CHECKLIST / 2 = AS / 3 = OBJECTO / 4 = Outros
'	up_tagcode
'	up_task SO SE FOR PEDIDO
'	up_itemtagcode SO SE FOR CHECKLIST
'	
	
	Dim params As Map
	params.Initialize
	params.Put("up_date", GetCurrDatetimeExt)
	params.Put("up_state", 0)
	params.Put("up_type", typelog)
	params.Put("up_tableurl", tablename)
	params.Put("up_values", Data)
	params.Put("up_typeoper",WND.up_typeoper)
	params.Put("up_tagcode",WND.up_tagcode)
	params.Put("up_task",WND.up_task)
	params.Put("up_itemtagcode",WND.up_itemtagcode)
	
	Dim InsertList As List
	InsertList.Initialize
	InsertList.Add(params)
'	For Each p As Map In params
'		InsertList.Add(p)
'	Next
	Try
		DBUtils.InsertMaps(Starter.LocalSQLWRK, "loc_updatesrever", InsertList)
	Catch
		Dim params As Map
		params.Initialize
		params.Put("up_date", GetCurrDatetimeExt)
		params.Put("up_state", 0)
		params.Put("up_tableurl", tablename)
		params.Put("up_values", Data)
		params.Put("up_typeoper",WND.up_typeoper)
		params.Put("up_tagcode",WND.up_tagcode)
		params.Put("up_task",WND.up_task)
		params.Put("up_itemtagcode",WND.up_itemtagcode)
		InsertList.Clear
		InsertList.Add(params)
		DBUtils.InsertMaps(Starter.LocalSQLWRK, "loc_updatesrever", InsertList)
	End Try
	
	' PEDRO ALPEDRINHA, PORQUE ESTA A FORCAR O WORKING LOCAL = TRUE ?
'	ShareCode.APP_WORKING_LOCAL = True
End Sub

Sub save2updateFile(tablename As String, Data As String, typelog As Int, request As String, WND As WorkerNewData)
	'typelog 0-standard, 1-request_creation, 2-relation-create, 3-values-create
	Dim RequestStr As String = IfNotNullOrEmptyAdd(request, "_")
	Dim FileName As String = $"APICALL_${RequestStr}_${ShareCode.SESS_OPER_User}__${GetCurrDatetimeT2Ext("_")}.svrlog"$
	Dim params As Map
	params.Initialize
	params.Put("up_user", ShareCode.SESS_OPER_User)
	params.Put("up_date", GetCurrDatetimeExt)
	params.Put("up_state", 0)
	params.Put("up_type", typelog)
	params.Put("up_tableurl", tablename)
	params.Put("up_values", Data)
	params.Put("up_typeoper",WND.up_typeoper)
	params.Put("up_tagcode",WND.up_tagcode)
	params.Put("up_task",WND.up_task)
	params.Put("up_itemtagcode",WND.up_itemtagcode)
	File.WriteMap(Starter.SharedFolder, FileName, params)
End Sub

Sub Decimal(value As Double, decimalPlaces As Int) As Double
	Dim multiplier = Power(10, decimalPlaces) As Int
	Dim result = value * multiplier As Int
	Return (result / multiplier)
End Sub

#if B4a
Sub IsLandscapeDefaultOrientation As Boolean
	Dim context As JavaObject
	context = context.InitializeStatic("anywheresoftware.b4a.BA").GetField("applicationContext")
	Dim rotation As Int = context.RunMethodJO("getSystemService", Array As Object("window")) _
     .RunMethodJO("getDefaultDisplay", Null).RunMethod("getRotation", Null)
	Dim configOrientation As Int = context.RunMethodJO("getResources", Null).RunMethodJO("getConfiguration", Null) _
     .GetField("orientation")
	If ((rotation = 0 Or rotation = 2) And configOrientation = 2) Or _
     ((rotation = 1 Or rotation = 3) And configOrientation = 1) Then
		Return True
	Else
		Return False
	End If
End Sub
#end if

#if B4a
'**************************************************************
'*    Returns the type of the device
'*    0 = phone, 1=tablet, 2=watch
'*
Sub GetDeviceType As Int
	Dim LayVal As LayoutValues = GetDeviceLayoutValues
	Dim Rot As Int = DisplayGetRotation
  
	If LayVal.Height = LayVal.Width Then
		Return 2
	Else If Rot = 0 Or Rot = 2 Then
		If LayVal.Height > LayVal.Width Then Return 0
		Return 1
	Else
		If LayVal.Height < LayVal.Width Then Return 0
		Return 1
	End If
End Sub


'**************************************************************
'*    Returns the current screen rotation
'*    0 = normal, 1=turned left, 2=upside down, 3= turned right
'*    (Thanks to joseluis)
Sub DisplayGetRotation As Int
	Dim r As Reflector
	r.Target = r.GetActivity
	r.Target = r.RunMethod("getWindowManager")
	r.Target = r.RunMethod("getDefaultDisplay")
	Return r.RunMethod("getRotation")
End Sub
#end if

'(Out, 100, "PNG")
#if B4a
Sub SaveImageviewToFile(img As Bitmap, filename As String, filetype As String)
#else
Sub SaveImageviewToFile(img As B4XBitmap, filename As String, filetype As String)
#end if
	'Dim Bitmap1 As Bitmap = img
	Dim Out As OutputStream
#if B4a
	Out = File.OpenOutput(Starter.InternalFolder, filename, False)
#else
	Out = File.OpenOutput(Starter.Provider.InternalFolder, filename, False)
#end if
	img.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, filetype)
	Out.Close
End Sub

Sub SaveImageFromB64ToFile( b64 As String, filename As String, filetype As String)
	Dim img As Bitmap = B64ToBitmap(b64)
	SaveImageviewToFile(img, filename, filetype)
End Sub

Sub Bool2Int(inBool As Boolean) As Int
	Dim ret As Int = 0
	If inBool Then ret = 1
	Return ret
End Sub

Sub Bool2String(inBool As Boolean) As String
	Dim ret As String = "False"
	If inBool Then ret = "True"
	Return ret
End Sub

Sub Int2Bool(inInt As Int) As Boolean
	Dim ret As Boolean = False
	If inInt=1 Then ret = True
	Return ret
End Sub

Sub String2Bool(inStr As String) As Boolean
	Dim ret As Boolean = False
	If inStr = "True" Then ret = True
	Return ret
End Sub

Sub GenerateTagcode(prefix As String) As String
	DateTime.TimeFormat = "HHmmss"
	DateTime.DateFormat = "yyyyMMdd"
	Dim DateName As String = $"$date{DateTime.Now}_$time{DateTime.Now}${RandomInt2(2)}"$
	If Not(isNullOrEmpty(prefix)) Then
		DateName = $"${prefix}${DateName}"$
	End If
	Return DateName
End Sub

Sub MakeTagcode(prefix As String) As String
	DateTime.TimeFormat = "HHmmss"
	'DateTime.DateFormat = "yyyy"
	DateTime.DateFormat = "yyyyMMdd"
	Return $"${prefix}_$date{DateTime.Now}_$time{DateTime.Now}${RandomInt2(2)}"$
End Sub

Sub MakeRequestTagcode As String
	DateTime.TimeFormat = "HHmmss"
	'DateTime.DateFormat = "yyyy"
	DateTime.DateFormat = "yyyyMMdd"
	Return $"IE_$date{DateTime.Now}_$time{DateTime.Now}${RandomInt2(2)}"$
End Sub

Sub MakeFileName As String
	DateTime.TimeFormat = "HHmmss"
	DateTime.DateFormat = "yyyyMMdd"
	Return $"$date{DateTime.Now}$time{DateTime.Now}${RandomInt2(2)}"$
End Sub

Sub MakeDateTimeSlash As String
	DateTime.TimeFormat = "HH:mm:ss"
	DateTime.DateFormat = "yyyy/MM/dd"
	Return $"$date{DateTime.Now}$time{DateTime.Now}"$
End Sub

Sub MakeDateTimeSlash2 As String
	DateTime.TimeFormat = "HH:mm:ss"
	DateTime.DateFormat = "yyyy/MM/dd"
	Return $"$date{DateTime.Now}  -  $time{DateTime.Now}"$
End Sub

#if B4a
Sub DeviceInfo As DeviceInformation
	Dim DevicescreenSize As Int = DeviceType
	Dim StrDeviceType As String = "Tablet"
	If DevicescreenSize < 7 Then
		StrDeviceType = "Smart Phone"
	End If
	Return Types.MakeDeviceInformation(StrDeviceType, DevicescreenSize, HasFeature("android.hardware.telephony"))
End Sub

Sub HasFeature(Feature As String) As Boolean
	Dim r As Reflector		
	r.Target = r.GetContext
	r.Target = r.RunMethod("getPackageManager")
	Return r.RunMethod2("hasSystemFeature", Feature, "java.lang.String")
End Sub

Sub HexToColor(Hex As String) As Int
	Dim bc As ByteConverter
	If Hex.StartsWith("#") Then
		Hex = Hex.SubString(1)
	Else If Hex.StartsWith("0x") Then
		Hex = Hex.SubString(2)
	End If
	Dim ints() As Int = bc.IntsFromBytes(bc.HexToBytes(Hex))
	Return ints(0)
End Sub

Sub DeviceInfoString As String
	Dim DevicescreenSize As Int = 0
	Dim StrDeviceType As String = ""
	DevicescreenSize = DeviceType
	If DevicescreenSize < 7 Then
		StrDeviceType = "Smart Phone"
	Else
		StrDeviceType = "Tablet"
	End If
	Return "Device= " & StrDeviceType & CRLF & "Screen Size= " & DevicescreenSize & CRLF & "Telephony capable= " & HasFeature("android.hardware.telephony")
End Sub

Sub DeviceType As Int
	Return Ceil(GetDeviceLayoutValues.ApproximateScreenSize)
End Sub

Sub IsSmartPhone As Boolean
	Return DeviceType < 7
End Sub
#end if

Sub MakeComposedButtonExt(CPPanel As Panel, Icon As String, Texto As String, CPDefs As ComposedButtonDefs)
#if B4a	
	If (ShareCode.ISPHONE) Then
		CPPanel.LoadLayout("CP_ComposedButton_devices_2")
	Else
		CPPanel.LoadLayout("CP_ComposedButton")
	End If
#else if B4i
	If Not(Main.App.iPadDevice) Then
		CPPanel.LoadLayout("CP_ComposedButton_devices_2")
	Else
		CPPanel.LoadLayout("CP_ComposedButton")
	End If
#end if
	Dim CPLabelIcon As Label = CPPanel.GetView(0)
	Dim CPLabelText As Label = CPPanel.GetView(1)
	CPLabelIcon.Text = Icon
#if B4a
	CPLabelIcon.Color = CPDefs.IconBKColor
	CPLabelIcon.TextColor = CPDefs.IconColor
#else if B4i
	If Not(Main.App.iPadDevice) Then
		CPLabelIcon.Color = CPDefs.TextSBKColor
		CPLabelIcon.TextColor = CPDefs.TextColor
	Else
		CPLabelIcon.Color = CPDefs.IconBKColor
		CPLabelIcon.TextColor = CPDefs.IconColor
	End If
#end if
	CPLabelText.Text = Texto
#if B4a
	CPLabelText.Color = CPDefs.TextSBKColor
	CPLabelText.TextColor = CPDefs.TextColor
#else if B4i
	If Not(Main.App.iPadDevice) Then
		CPLabelText.Color = CPDefs.IconBKColor
		CPLabelText.TextColor = CPDefs.IconColor
	Else
		CPLabelText.Color = CPDefs.TextSBKColor
		CPLabelText.TextColor = CPDefs.TextColor
	End If
#end if
	If (CPDefs.TextSBKColor <> CPDefs.TextEBKColor) Then
#if B4a
		Dim gc As GradientDrawable
		gc.Initialize("TOP_BOTTOM", Array As Int(CPDefs.TextSBKColor, CPDefs.TextEBKColor))
		CPLabelText.Background = gc
#end if
	End If
#if B4a
	Dim cdw As ColorDrawable
	cdw.Initialize2(CPDefs.PanelColor, CPDefs.BorderRadius, CPDefs.BorderWidth, CPDefs.BorderColor)
	CPPanel.Background = cdw
#else if B4i
	CPPanel.Color = CPDefs.PanelColor
	CPPanel.SetBorder(CPDefs.BorderWidth, CPDefs.BorderColor, CPDefs.BorderRadius)
#end if
	
End Sub

Sub MakeTabPanelEffect(CPPanel As Panel, ColorStart As Int, ColorEnd As Int)

#if B4a
	Dim gc As GradientDrawable
	gc.Initialize("TOP_BOTTOM", Array As Int(ColorStart, ColorEnd))
	CPPanel.Background = gc
#else if B4i
	SetGradient(CPPanel, ColorStart, ColorEnd)
#end if
End Sub

Sub MakeComposedButton(CPPanel As Panel, Icon As String, Texto As String)
#if B4a	
	If (ShareCode.ISPHONE) Then
		CPPanel.LoadLayout("CP_ComposedButton_devices_2")
	Else
		CPPanel.LoadLayout("CP_ComposedButton")
	End If
#else if B4i
	If Not(Main.App.iPadDevice) Then
		CPPanel.LoadLayout("CP_ComposedButton_devices_2")
	Else
		CPPanel.LoadLayout("CP_ComposedButton")
	End If
#end if
	Dim CPLabelIcon As Label = CPPanel.GetView(0)
	Dim CPLabelText As Label = CPPanel.GetView(1)
	CPLabelIcon.Text = Icon
	CPLabelText.Text = Texto
	Dim bColor As Int = Colors.ARGB(255, 0, 120, 200)
	Dim fColor As Int = Colors.ARGB(255, 240, 240, 240)

#if B4a
	Dim cdw As ColorDrawable
	cdw.Initialize2(fColor, 5, 1, bColor)
	CPPanel.Background = cdw
#else if B4i
	CPPanel.Color = fColor
	CPPanel.SetBorder(1, bColor, 5)
#end if
End Sub

Sub SetDialogColors(dialog As Object, backColor As Int, borderColor As Int, borderWidth As Int, borderRadius As Int)
	
#if B4a
	Dim jo As JavaObject = dialog
	Dim cd As ColorDrawable
	cd.Initialize2(backColor, borderRadius, borderWidth, borderColor)
	jo.RunMethodJO("getWindow", Null).RunMethod("setBackgroundDrawable", Array(cd))
#else if B4i
'
#end if
End Sub


Sub SetDialogtitle(dialog As Object, Title As String)
	Dim cs As CSBuilder
#if b4a
	Dim jo As JavaObject = dialog
	jo.RunMethod("setTitle", Array(cs.Initialize.Append(Title).PopAll))
#else if b4i
'	Dim no As NativeObject = dialog    
'	no.RunMethod("setTitle", Array(cs.Initialize.Append(Title).PopAll))
	
#End If
End Sub

'GetListOfFromScriptCNL(fieldCode As String, fieldName As String, script As String) As List 'CodeNameList
Sub StrCNLList2SQLArray(inList As List, isName As Boolean) As String
	Dim sRet As String = ""
	For i=0 To inList.Size-1
		Dim r As CodeNameList = inList.Get(i)
		Dim value As String = r.TagCode
		If isName=True Then value = r.Name
		If (sRet <> "") Then sRet = $"${sRet},"$
		sRet = $"${sRet}'${value}'"$
	Next
	'If (sRet <> "") Then sRet = $"(${sRet})"$
	sRet = $"(${sRet})"$
	Return sRet
End Sub

Sub StrList2SQLArray(inList As List) As String
	Dim sRet As String = ""
	For i=0 To inList.Size-1
		If (sRet <> "") Then sRet = $"${sRet},"$
		sRet = $"${sRet}'${inList.Get(i)}'"$
	Next
	'If (sRet <> "") Then sRet = $"(${sRet})"$
	If (NNE(sRet)) Then
		sRet = $"(${sRet})"$
	Else
		sRet = $"('')"$
	End If
	Return sRet
End Sub

Sub List2Str(inList As List, divider As String) As String
	Dim sRet As String = ""
	If (divider="") Then divider = "|"
	For i=0 To inList.Size-1
		If (sRet <> "") Then sRet = $"${sRet}${divider}"$
		sRet = $"${sRet}${inList.Get(i)}"$
	Next
	Return sRet
End Sub

'DateUtils.StrList2SQLArray(DateUtils.Str2List(Bool2String, "|"))
Sub Str2List(inList As String, divider As String) As List
	If NNE(inList) Then
		Dim sRet As List = Regex.Split($"\${divider}"$, inList )
	Else
		Dim sRet As List : sRet.Initialize
	End If
	Return sRet
End Sub


#if b4a
Sub CreateMapIcon(Counter As Int, ColorStr As String) As B4XBitmap
	'Dim Icon As BitmapDrawable
	Dim xui As XUI
	
	Dim pbd As Panel
	pbd.Initialize("")
	pbd.Width = 37dip
	pbd.Height = 64dip
	pbd.SetBackgroundImage(LoadBitmap(File.DirAssets, $"p_${ColorStr}.png"$))
	Dim cvs As B4XCanvas
	cvs.Initialize(pbd)
	Dim cvsRect As B4XRect
	cvsRect.Initialize(0, 0, 37dip, 37dip)
	Dim fnt As B4XFont = xui.CreateFont(Typeface.DEFAULT, ShareCode.DEVICE_DEF_FONT_SIZE)
	Dim CenterX As Int = (cvsRect.left+cvsRect.Right)/2
	Dim CenterY As Int = (cvsRect.Top+cvsRect.Bottom)/2
	Dim r As B4XRect = cvs.MeasureText(Counter, fnt)
	Dim baseline As Int = CenterY - r.Height / 2 - r.Top
	cvs.DrawText(Counter, CenterX, baseline, fnt, Colors.Black, "CENTER")
	cvs.Invalidate
	Return cvs.CreateBitmap
End Sub
#else
Sub CreateMapIcon(Counter As Int, ColorStr As String) As B4XBitmap
	'Dim Icon As BitmapDrawable
	Dim xui As XUI
	
	Dim pbd As Panel
	pbd.Initialize("")
	pbd.Width = 37dip
	pbd.Height = 64dip
	pbd.SetBackgroundImage(LoadBitmap(File.DirAssets, $"p_${ColorStr}.png"$))

	Dim cvs As B4XCanvas
	cvs.Initialize(pbd)
	Dim cvsRect As B4XRect
	cvsRect.Initialize(0, 0, 37dip, 37dip)
	Dim fnt As B4XFont = xui.CreateFont(Font.DEFAULT, ShareCode.DEVICE_DEF_FONT_SIZE)
	Dim CenterX As Int = (cvsRect.left+cvsRect.Right)/2
	Dim CenterY As Int = (cvsRect.Top+cvsRect.Bottom)/2
	Dim r As B4XRect = cvs.MeasureText(Counter, fnt)
	Dim baseline As Int = CenterY - r.Height / 2 - r.Top
	cvs.DrawText(Counter, CenterX, baseline, fnt, Colors.Black, "CENTER")
	cvs.Invalidate
	Return cvs.CreateBitmap
End Sub
#end if

Sub getViewText(v As B4XView) As String
	Dim ret As String = v.Text
	Return ret
End Sub

Sub isNumeric(inStr As String) As Boolean
	Dim r As Boolean = False
	If Not( isNullOrEmpty(inStr) ) Then
		Dim n As Int = 0
		Try
			n = n + inStr
			r = True
		Catch
			Log(LastException)
		End Try
	End If
	Return r
End Sub

Sub isNull(inStr As String) As Boolean
	Dim r As Boolean = False
	If (inStr = Null) Then
		r = True
	Else if (inStr = "null") Then
		r = True
	End If
	Return r
End Sub

Sub isNullOrEmpty(inStr As String) As Boolean
	Dim r As Boolean = False
	If (inStr = Null) Then
		r = True
	Else if (inStr.ToLowerCase = "null") Then
		r = True
	Else if (inStr = "") Then
		r = True
	End If
	Return r
End Sub

Sub NNE(inStr As String) As Boolean
	Return Not( isNullOrEmpty(inStr) )
End Sub

Sub NE(inStr As String) As Boolean
	Return isNullOrEmpty(inStr)
End Sub

Sub IfTrue(condition As Boolean, sTrue As String, sFalse As String) As String
	If (condition) Then
		Return sTrue
	Else
		Return sFalse
	End If
End Sub

Sub IfNullOrEmpty(inStr As String, nullStr As String) As String
	Try
		If (isNullOrEmpty(inStr) = True) Then
			Return nullStr
		Else
			Return inStr
		End If
	Catch
		Return nullStr
	End Try
End Sub

Sub IfNullOrEmptyInt(inStr As String, nullStr As Int) As Int
	If ((isNullOrEmpty(inStr) = True) Or Not(IsNumber(inStr))) Then
		Return nullStr
	Else 
		Return inStr
	End If
End Sub

Sub TestNumber(s As String) As Boolean
	Return IsNumber(s) And Regex.IsMatch("[\d\.]+", s)
End Sub

Sub IfNullOrEmptyDouble(inStr As String, nullStr As Double) As Double
	If ((isNullOrEmpty(inStr) = True) Or Not(TestNumber(inStr))) Then
		Return nullStr
	Else 
		Return inStr
	End If
End Sub

Sub IfNotNullOrEmpty(inStr As String, notStr As String) As String
	If NNE(inStr) Then
		Return notStr
	Else 
		Return inStr
	End If
End Sub

Sub IfNotNullOrEmptyAdd(inStr As String, addStr As String) As String
	If NNE(inStr) Then
		Return $"${inStr}${addStr}"$
	Else 
		Return inStr
	End If
End Sub

Sub ListOfPairs(pairs() As String, splitter As String) As List
	Dim retList As List
	retList.Initialize
	Dim splt As String = splitter
	If (splt = "") Then splt = "=>"
	For i=0 To pairs.Length-1
		Dim lst As List = Regex.Split(("\"&splt), pairs(i))
		Dim map As Map
		map.Initialize
		map.Put(lst.Get(0), lst.Get(1))
		retList.Add(map)
	Next
	Return retList
End Sub

Sub ListOfPairsList(pairs As List, splitter As String) As List
	Dim retList As List
	retList.Initialize
	Dim splt As String = splitter
	If (splt = "") Then splt = "=>"
	For i=0 To pairs.size-1
		Dim lst As List = Regex.Split(("\"&splt), pairs.get(i))
		Dim map As Map 
		map.Initialize
		map.Put(lst.Get(0), lst.Get(1))
		retList.Add(map)
	Next
	Return retList
End Sub

Sub FindKeyForValue(m As Map, v As Object) As Object
	For Each k As Object In m.Keys
		If m.Get(k) = v Then Return k
	Next
	Return ""
End Sub

Sub GetMapKeyIndex(mm As Map, index As Int) As Object
	Dim idx As Int = 0
	Dim v As Object = ""
	For Each k As String In mm.Keys
		If idx = index Then
			v = k 'mm.Get(k)
			Exit
		End If
		idx = idx + 1
	Next
	Return v
End Sub


'===================================================================================================================
'	TIPO: FUNÇÃO
'	RETORNA: Retorna o JOB instanciado
'	JobApi - URL do caminho para a chamada da API ex: "orion/mobile/logs/upload"
'	JobParams - Lista de parâmetros passados no formato KEY=>VALUE (map)
' 	JobObject - O objecto de inicialização, normalmente7default = Me
'	JobName	- Nome de referência do Job que poderá instanciar o evento de Job ex: "JobAPIStatus"
'===================================================================================================================
#if b4a
Sub CallJobAPI(JobAPI As String, jobParams As List, jobObject As Object, jobName As String) As HttpJob
#else
Sub CallJobAPI(JobAPI As String, jobParams As List, jobObject As Object) As HttpJob
#end if
	Dim params As Map
	params.Initialize
	params.Clear
	params.Put("_token",ShareCode.APP_TOKEN)
#if b4a
	For i=0 To jobParams.Size-1
		Dim m As Map = jobParams.Get(i)
		params.Put(m.GetKeyAt(0), m.GetValueAt(0))
	Next
#else
	For i=0 To jobParams.Size-1
		Dim m As Map = jobParams.Get(i)
		Dim k As String = GetMapKeyIndex(m, 0)
		params.Put(k, m.Get(k))
	Next
#end if	
	Dim JSON As JSONGenerator
	JSON.Initialize(params)
	Dim data As String =   JSON.ToPrettyString(1)
	Log("DATA:" & data)
        
	Dim Job As HttpJob
	'Job.Initialize(jobName, jobObject)
	Job.Initialize("", jobObject)
	'Job.PostString(ShareCode.APP_URL & "api/" & JobAPI, data )
	Dim URLpath As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/${JobAPI}"$
	
	'Job.PostString(ShareCode.APP_URL & JobAPI, data )
	Job.PostString(URLpath, data )
	Log( URLpath )
	Job.GetRequest.SetContentType("application/json")
	Return Job
End Sub

'===================================================================================================================
'	TIPO: EVENTO
'	RETORNA: Estado da Chamada iniciada por JOB
'	Job - referência ao JOB que origina o evento 
'===================================================================================================================
Sub JobAPIStatus(job  As HttpJob) As Int
	Dim ResultStr As String = job.GetString
'	Log(ResultStr)
	Dim JSON1 As JSONParser
	If (Starter.StrFunc.Left(ResultStr, 1) = "[") Then
		ResultStr = Starter.StrFunc.Trim(Starter.StrFunc.Mid(ResultStr, 2, Starter.StrFunc.Len(ResultStr)-1))
	End If
	
	If ResultStr.StartsWith("Array") Then
		If ResultStr.SubString(8).StartsWith(")") Then
			ResultStr = ResultStr.SubString(9)
		End If
	End If
	
	JSON1.Initialize(ResultStr)
	Try
		Dim MapJSON As Map = JSON1.NextObject
		Dim status As Int = MapJSON.Get("status")
	Catch
		Dim status As Int = 1
		Log(LastException)
	End Try
	
	Return status
End Sub

'===================================================================================================================
'	TIPO: FUNÇÃO
'	RETORNA: JOB da chamada (Resultado da chamada)
'	Callback - O objecto de inicialização, normalmente7default = Me
'	link - URL do caminho para a chamada da API ex: "orion/mobile/logs/upload"
'===================================================================================================================
Sub Download (Callback As Object, link As String) As HttpJob
	Dim j As HttpJob
	j.Initialize("", Callback)
	j.Download(link)
	Return j
End Sub

'===================================================================================================================
'	TIPO: FUNÇÃO
'	RETORNA: Imagem no formato BitMap
'	b64str - Converte uma string no formato Base64 numa imagem BitMap
'===================================================================================================================
Sub B64ToBitmap(b64str As String) As B4XBitmap
#if b4a
	Dim Base64Con As Base64Convert
	Base64Con.Initialize
	Dim dc As BitmapDrawable
	If (NNE(b64str)) Then
		Try
			dc.Initialize(Base64Con.DecodeToImage(b64str))
		Catch
			Log(LastException)
		End Try
	End If
	If Not(dc.IsInitialized) Then
		Dim bmp As Bitmap
		'bmp.Initialize(Main.InternalFolder, "vazio.png")
		bmp.Initialize(Starter.InternalFolder, "vazio.png")
		dc.Initialize(bmp)
	End If
	Return dc.Bitmap
#else if b4i
	Dim su As StringUtils
	Dim i As InputStream
	i.InitializeFromBytesArray(su.DecodeBase64(b64str), 0, su.DecodeBase64(b64str).Length)
	Dim p As Bitmap
	p.Initialize2(i)
	Return p
#end if
End Sub

Sub Bitmap2File(BMP As B4XBitmap, Folder As String, Filename As String)
	Dim Out As OutputStream
	Out = File.OpenOutput(Folder, Filename, False)
	BMP.WriteToStream(Out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
	Out.Close
End Sub

Sub SetFontSizeList(fontsize As Int, inList As List) As List
	Dim cs As CSBuilder
	Dim Items As List
	Items.Initialize
#if B4A
	For i = 0 To inList.Size-1
		Items.Add( cs.Initialize.Typeface(Typeface.DEFAULT).Append(inList.Get(i)).PopAll )
	Next
#else
	Dim fnt As Font = Font.CreateNew(fontsize)
	For i = 0 To inList.Size-1
		Items.Add( cs.Initialize.Font(fnt).Append(inList.Get(i)).PopAll )
	Next
#end if
	Return Items
End Sub

Sub ResizeBitmap(bmp As Bitmap, scale As Float) As Bitmap
	Dim img As ImageView
	img.Initialize("")
	img.Width = bmp.Width * scale
	img.Height = bmp.Height * scale
	Dim ss As B4XCanvas
	ss.Initialize(img)
	ss.DrawBitmap(bmp, ss.TargetRect)
	Dim res As Bitmap = ss.CreateBitmap
	ss.Release
	Return res
End Sub

'===================================================================================================================
'	TIPO: FUNÇÃO
'	RETORNA: Lista de Nomes
'	tabstrip - Lista de TABS do tipo tabStrip
'===================================================================================================================
#if b4a
Public Sub GetAllTabLabels (tabstrip As TabStrip) As List
	Dim jo As JavaObject = tabstrip
	Dim r As Reflector
	r.Target = jo.GetField("tabStrip")
	Dim tc As Panel = r.GetField("tabsContainer")
	Dim res As List
	res.Initialize
	For Each v As View In tc
		If v Is Label Then res.Add(v)
	Next
	Return res
End Sub
#else if b4i
Public Sub GetAllTabLabels (tabstrip As List) As List
	Dim res As List = tabstrip
	
'	res.Initialize
'	For i = 0 To TabPages.Size - 1
'		Dim p As Page = TabPages.Get(i)
'		Dim lbl As Label = p.TitleView
'     
'		Dim clr As Int
'		If i = Position Then clr = Colors.Red Else clr = Colors.Black
'		Dim cs As CSBuilder
'		SetAttributedTitle(p, cs.Initialize.Color(clr).Append(lbl.AttributedText.ToString).PopAll)
'	Next
'   
'	Dim no As NativeObject = TabStrip1
'	Sleep(50)
'	no.RunMethod("reloadPagerTabStripView", Null)
	
	
	Return res
End Sub

Public Sub SetAllTabLabelsWidth (TabPanel As TabStrip, TabPages As List, wLabel As Double, selColor As Int, selIndex As Int)
	
	For i = 0 To TabPages.Size - 1
		Dim p As Page = TabPages.Get(i)
		p.RootPanel.Color = selColor
		Dim lbl As Label : lbl.Initialize("")
		lbl.SetLayoutAnimated(0, 1, 0, 0, wLabel, 150)
		'lbl.Width = wLabel
		
		
		Dim cs As CSBuilder
		cs.Initialize.BackgroundColor(selColor).Color(Consts.ColorWhite).Pop.Pop
		If selIndex = i Then
			cs.BackgroundColor(selColor).Pop
		End If
		cs.Append(p.Title).PopAll
'		cs.Initialize.Alignment("ALIGN_CENTER").Color(Consts.ColorWhite).Append(p.Title).VerticalAlign(5).BackgroundColor(selColor).PopAll
		lbl.AttributedText = cs
		
''		Page1.TitleView = lbl
''		lbl.Text = p.Title & " Teste"
''		
''		'lbl.Color = Colors.ARGB(0, 255, 255, 255)
''		lbl.Color = selColor
''		lbl.TextAlignment = lbl.ALIGNMENT_RIGHT
''		If selIndex = i Then
''			lbl.Color = selColor
''		End If
		p.TitleView = lbl
		p.TitleView.Alpha = 255
		p.TitleView.Color = selColor
		p.TitleView.Width = 50dip
		
	Next
   
	Dim no As NativeObject = TabPanel
	Sleep(50)
	no.RunMethod("reloadPagerTabStripView", Null)
End Sub
#end if

Public Sub GetAllTabPanels (tabstrip As TabStrip) As List
	Dim res As List
	res.Initialize
#if b4a
	Dim jo As JavaObject = tabstrip
	Dim r As Reflector
	r.Target = jo.GetField("tabStrip")
	Dim tc As Panel = r.GetField("tabsContainer")
	Dim res As List
	res.Initialize
	For Each v As View In tc
		If v Is Panel Then res.Add(v)
	Next
#else if b4i
	Dim no As NativeObject = tabstrip
	Dim tc As Panel = no.GetField("tabStrip").GetField("tabsContainer")
	For Each v As View In tc
		If v Is Panel Then res.Add(v)
	Next
#end if
	Return res
End Sub

'===================================================================================================================
'	TIPO: FUNÇÃO
'	RETORNA: Retorna data de 7 dias atrás
'===================================================================================================================

Sub GetLastMonthDateLong As Long
	Dim CurrentDate As Long = DateTime.Now
	Dim LastMonthDate  As Long
	Dim p1 As Period
	p1.Days = -30
	LastMonthDate = DateUtils.AddPeriod(CurrentDate, p1)
	Return LastMonthDate
End Sub

Sub GetLastMonthDate As String
	DateTime.DateFormat = "yyyy-MM-dd"
'	Dim CurrentDate As Long = DateTime.Now
'	Dim LastMonthDate  As Long
'	Dim p1 As Period
'	p1.Days = -30
'	LastMonthDate = DateUtils.AddPeriod(CurrentDate, p1)
'	Return DateTime.Date(LastMonthDate)
	Return DateTime.Date(GetLastMonthDateLong)
End Sub

Sub GetLastWeekDate As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim CurrentDate As Long = DateTime.Now
	Dim LastWeekDate  As Long
	Dim p1 As Period
	p1.Days = -7
	LastWeekDate = DateUtils.AddPeriod(CurrentDate, p1)
	Return DateTime.Date(LastWeekDate)
End Sub

Sub GetLastNDays(days As Int) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim CurrentDate As Long = DateTime.Now
	Dim LastWeekDate  As Long
	Dim p1 As Period
	p1.Days = -days
	LastWeekDate = DateUtils.AddPeriod(CurrentDate, p1)
	Return DateTime.Date(LastWeekDate)
End Sub

Sub SetNHours(hours As Int, CurrHora As String) As String
	DateTime.timeFormat = "HH:mm"
	If NNE(CurrHora) Then
		Dim Currentime As Long = DateTime.TimeParse(CurrHora)
	Else
		Dim Currentime As Long = DateTime.Now
	End If
	
	Dim NewTime As Long
	Dim p1 As Period
	p1.Hours = hours
	NewTime = DateUtils.AddPeriod(Currentime, p1)
	Return DateTime.time(NewTime)
End Sub

Sub GetLastNDaysLong(days As Int) As Long
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim CurrentDate As Long = DateTime.Now
	Dim LastWeekDate  As Long
	Dim p1 As Period
	p1.Days = -days
	LastWeekDate = DateUtils.AddPeriod(CurrentDate, p1)
	Return LastWeekDate
End Sub

Sub GetNextWeekDate As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim CurrentDate As Long = DateTime.Now
	Dim NextWeekDate  As Long
	Dim p1 As Period
	p1.Days = 7
	NextWeekDate = DateUtils.AddPeriod(CurrentDate, p1)
	Return DateTime.Date(NextWeekDate)
End Sub

Sub GetNextNDays(days As Int) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim CurrentDate As Long = DateTime.Now
	Dim LastWeekDate  As Long
	Dim p1 As Period
	p1.Days = days
	LastWeekDate = DateUtils.AddPeriod(CurrentDate, p1)
	Return DateTime.Date(LastWeekDate)
End Sub

Sub GetCurrentDate As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Return DateTime.Date(DateTime.Now)
End Sub

Sub GetCurrentDateFormat(form As String) As String
	DateTime.DateFormat = form
	Return DateTime.Date(DateTime.Now)
End Sub

Sub GetDate(dt As Long) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Return DateTime.Date(dt)
End Sub

Sub GetDateFormat(dt As Long, form As String) As String
	DateTime.DateFormat = form
	Return DateTime.Date(dt)
End Sub

Sub GetCurrDatetimeFormat(formDate As String, formTime As String, space As Boolean) As String
	DateTime.DateFormat = formDate
	DateTime.TimeFormat = formTime
	Dim ret As String = ""
	If space Then ret = " "
	ret = $"${DateTime.Date(DateTime.Now)}${ret}${DateTime.Time(DateTime.Now)}"$
	Return ret
End Sub

Sub GetCurrDatetimeFrom(fromDate As String, fromTime As String) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	DateTime.TimeFormat = "HH:mm:ss"
	Dim ret As String = ""
	ret = $"${fromDate} ${fromTime}"$
	Return ret
End Sub

Sub GetCurrentTime As String
	DateTime.TimeFormat = "HH:mm"
	Return DateTime.Time(DateTime.Now)
End Sub

Sub GetCurrentTimeExt As String
	DateTime.TimeFormat = "HH:mm:ss"
	Return DateTime.Time(DateTime.Now)
End Sub

Sub GetCurrentTimeExt2 As String
	DateTime.TimeFormat = "HHmmss"
	Return DateTime.Time(DateTime.Now)
End Sub

Sub GetCurrentTicks As String
	Return DateTime.Now
End Sub

Sub GetYesterday As String
	Dim p1 As Period
	p1.days = -1
	DateTime.TimeFormat = "HH:mm"
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim NewDate As Long = DateUtils.AddPeriod(DateTime.Now, p1)
	Return $"$date{NewDate} 00:10"$
End Sub

Sub GetLast60Days As String
	Dim p60 As Period
	p60.days = -60
	DateTime.TimeFormat = "HH:mm"
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim NewDate As Long = DateUtils.AddPeriod(DateTime.Now, p60)
	Return $"$date{NewDate} 00:10"$
End Sub

Sub GetCurrDatetime As String
	DateTime.TimeFormat = "HH:mm"
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim DateName As String = $"$date{DateTime.Now} $time{DateTime.Now}"$
	Return DateName
End Sub

Sub GetCurrDatetimeT(Separator As String) As String
	If (Separator = "") Then Separator = " "
	DateTime.TimeFormat = "HH:mm"
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim DateName As String = $"$date{DateTime.Now}${Separator}$time{DateTime.Now}"$
	Return DateName
End Sub

Sub GetCurrDatetimeT2(Separator As String) As String
	If (Separator = "") Then Separator = " "
	DateTime.TimeFormat = "HHmm"
	DateTime.DateFormat = "yyyyMMdd"
	Dim DateName As String = $"$date{DateTime.Now}${Separator}$time{DateTime.Now}"$
	Return DateName
End Sub

Sub GetCurrDatetimeT2Ext(Separator As String) As String
	DateTime.TimeFormat = "HHmmss"
	DateTime.DateFormat = "yyyyMMdd"
	Dim DateName As String = $"$date{DateTime.Now}${Separator}$time{DateTime.Now}"$
	Return DateName
End Sub

Sub GetCurrDatetimeExt As String
	DateTime.TimeFormat = "HH:mm:ss"
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim DateName As String = $"$date{DateTime.Now} $time{DateTime.Now}"$
	Return DateName
End Sub

Sub GetCurrDatetimeFixed As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim DateName As String = $"$date{DateTime.Now} 00:00:01"$
	Return DateName
End Sub

'******************************************************************************************
' Datetime String to Long
'******************************************************************************************
Sub DTS2L(inStr As String, isTime As Boolean) As Long
	Dim spliter As List = Regex.Split(" ", inStr)
	Dim ret As Long = 0
	If (spliter.Size >= 1) Then
		If Not(isTime) Then
			ret = DateTime.DateParse(spliter.get(0))
		Else
			If (spliter.Size = 2) Then
				ret = DateTime.TimeParse(spliter.get(1))
			End If
		End If
	End If
	Return ret
End Sub

'******************************************************************************************
' Datetime String to List Long
'******************************************************************************************
Sub DTS2LSTL(inStr As String) As List
	Dim spliter As List = Regex.Split(" ", inStr)
	Dim ret As List : ret.initialize
	For n=0 To spliter.Size-1
		If n=0 Then
			ret.Add(DateTime.DateParse(spliter.get(0)))
		Else
			ret.Add(DateTime.TimeParse(spliter.get(1)))
		End If
	Next
	Return ret
End Sub

'******************************************************************************************
' Datetime String to List String
'******************************************************************************************
Sub DTS2LSTS(inStr As String) As List
	Dim spliter As List = Regex.Split(" ", inStr)
	Return spliter
End Sub

Sub DTP(inStr As String) As Long
	Dim ret As Long = 0
	Dim retL As List = DTS2LSTS(inStr)
	If (retL.Size = 1) Then
		ret = DateTime.DateParse(retL.Get(0))
	else If (retL.Size = 2) Then
		ret = DateTime.DateTimeParse(retL.Get(0), retL.Get(1))
	End If
	Return ret 
End Sub

'******************************************************************************************
' Datetime String to datetime between MM:SS
'******************************************************************************************
Sub DTSBTW(inStr1 As String, inStr2 As String) As String
	Dim ret As String = ""
	If NNE(inStr1) And NNE(inStr2) Then
		Dim per As Period = DateUtils.PeriodBetween(DTP(inStr1), DTP(inStr2))
		Dim ret As String = $"${per.Minutes}:${per.Seconds}"$
	End If
	Return ret
End Sub

'******************************************************************************************
' Datetime String to datetime between MM:SS
'******************************************************************************************
Sub DTSBTWL(inVal1 As Long, inVal2 As Long) As String
	Dim ret As String = ""
	Dim per As Period = DateUtils.PeriodBetween(inVal1, inVal2)
	Dim ret As String = $"${per.Minutes}:${per.Seconds}"$
	Return ret
End Sub

Sub StripTime(Ticks As Long) As Long
	Return(DateTime.DateParse(DateTime.Date(Ticks)))
End Sub

Sub QueryIntent(Intent1 As Intent) As List
#If B4A
	Dim r As Reflector
	r.Target = r.GetContext
	r.Target = r.RunMethod("getPackageManager")
	Dim list1 As List
	list1 = r.RunMethod4("queryIntentActivities", Array As Object(Intent1, 0), Array As String("android.content.Intent", "java.lang.int"))
#end if
	Dim listRes As List
	listRes.Initialize
#If B4A
	For i = 0 To list1.Size - 1
		r.Target = list1.Get(i)
		r.Target = r.GetField("activityInfo")
		'listRes.Add(r.GetField("name")) 'return the activity full name
		listRes.Add(r.GetField("packageName"))
	Next
#end if
	Return listRes
End Sub

Sub LoadJSONFile( Folder As String, FileArg As String ) As String
	Dim JSONData As String = File.ReadString(Folder,FileArg)
	
								
'	ShowReportView.LoadHtml(File.ReadString2(Starter.Provider.SharedFolder ,$"${repFile}"$, "UTF8"))
		
		
		
	'Dim StrFunc As StringFunctions
	Starter.StrFunc.Initialize
	If (Starter.StrFunc.Left(JSONData, 1) = "[") Then
		JSONData = Starter.StrFunc.Trim(Starter.StrFunc.Mid(JSONData, 2, Starter.StrFunc.Len(JSONData)-1))
	End If
	Return JSONData
End Sub

Sub GetListStrArrayItems(arr() As String) As List
	Dim lst As List = arr
	Return lst
End Sub

Sub GetListAsStr(arr As List) As String
	Dim sRet As String = ""
	If (arr.IsInitialized) Then
		If (arr.Size >0) Then
			For n=0 To arr.Size-1
				If NNE(sRet) Then
					sRet = $"${sRet}, "$
				End If
				sRet = $"${sRet}${arr.Get(n)}"$
			Next
		End If
	End If
	Return sRet
End Sub

Sub ColorString( str As String) As Int
	Dim ret As Int = 0
	If isNullOrEmpty(str) Then str = "BLUE"
	If str.ToUpperCase = "BLUE" Then
		ret = Colors.Blue
	else if str.ToUpperCase = "YELLOW" Then
		ret = Colors.Yellow
	Else If str.ToUpperCase = "GREEN" Then
		ret = Colors.Green
	Else If str.ToUpperCase = "RED" Then
		ret = Colors.Red
	Else If str.ToUpperCase = "ORANGE" Then
		ret = Colors.Red
	Else If str.ToUpperCase = "GRAY" Then
		ret = Colors.Gray
	End If
	Return ret
End Sub

Sub ColorInt( iint As Int) As Int
	Dim ret As Int = 0
	If iint = 0 Then
		ret = Colors.Blue
	else if iint = 1 Then
		ret = Colors.Yellow
	Else If iint = 2 Then
		ret = Colors.Green
	Else If iint = 3 Then
		ret = Colors.Red
	Else If iint = 4 Then
		ret = Colors.Red
	Else If iint = 5 Then
		ret = Colors.Gray
	End If
	Return ret
End Sub


#if b4i
Sub SetGradient(v As View, color1 As Int, color2 As Int)
	Dim NaObj As NativeObject = Me
	NaObj.RunMethod("SetGradient:::",Array(v,NaObj.ColorToUIColor(color1),NaObj.ColorToUIColor(color2)))
End Sub
#end if

#If OBJC
- (void)SetGradient: (UIView*) View :(UIColor*) Color1 :(UIColor*) Color2{
	CAGradientLayer *gradient = [CAGradientLayer layer];
	gradient.colors = [NSArray arrayWithObjects:(id)Color1.CGColor, (id)Color2.CGColor, nil];
	gradient.frame = View.bounds;
	[View.layer insertSublayer:gradient atIndex:0];
}
#end if

Sub SetViewBackgroundColorToMainGradientColor(view As View)
#If B4A
	Dim GDrawable As GradientDrawable
	GDrawable.Initialize("TOP_BOTTOM", Array As Int(Consts.ColorMain, Consts.ColorSub))
	view.Background = GDrawable
#Else If B4i
	'lbl.SetBorder(2dip, Colors.Red, 15dip)
	SetGradient(view, Consts.ColorMain, Consts.ColorSub)
#End if
	
End Sub

Sub SetViewBackgroundColorToMainColor(view As View)
#If B4A
	Dim CDrawable As ColorDrawable
	CDrawable.Initialize(Consts.ColorMain, 0)
	view.Background = CDrawable
#Else If B4i
	view.Color = Consts.ColorMain
#End if
End Sub

Sub SetButtonBackgroundColorToMainColorWithRadius(view As View, radius As Int)
#If B4A
	Dim CDrawable As ColorDrawable
	CDrawable.Initialize(Consts.ColorMain, radius)
	view.Background = CDrawable
#Else If B4i
	view.Color = Consts.ColorMain
	view.SetBorder(1dip, Consts.ColorMain, radius)
#End if
End Sub

#If B4A
Sub SetProgressDrawableExt(p As ProgressBar, posis As String, colrs() As Int, radcorner As Int)
	Dim gd As GradientDrawable
	gd.Initialize(posis, colrs)
	gd.CornerRadius = radcorner
	SetProgressDrawable(p, gd)
End Sub

Sub SetProgressDrawable(p As ProgressBar, drawable As Object)
	Dim r As Reflector
	Dim clipDrawable As Object
	clipDrawable = r.CreateObject2("android.graphics.drawable.ClipDrawable", Array As Object(drawable, Gravity.LEFT, 1), _
      	Array As String("android.graphics.drawable.Drawable", "java.lang.int", "java.lang.int"))
	r.Target = p
	r.Target = r.RunMethod("getProgressDrawable") 'Gets the layerDrawable
	r.RunMethod4("setDrawableByLayerId", Array As Object(r.GetStaticField("android.R$id", "progress"), clipDrawable), _
      	Array As String("java.lang.int", "android.graphics.drawable.Drawable"))
End Sub
#End if

Public Sub Distance(fromPoint As PointApi, toPoint As PointApi) As Float
	Dim d As Float
	d = Sqrt(Power(Abs(toPoint.x - fromPoint.x),2) + Power(Abs(toPoint.y - fromPoint.y),2))
	Return d
End Sub

#If B4A
Public Sub New_Point(nAngle As Float, nRadius As Float, CenterX  As Float, CenterY As Float ) As PointApi 
	Dim pt As PointApi 
    pt.x = CenterX + (nRadius) * CosD(nAngle)
    pt.Y  = CenterY - (nRadius) * SinD(nAngle)
    Return pt
End Sub
#else
Public Sub NewPoint(nAngle As Float, nRadius As Float, CenterX  As Float, CenterY As Float ) As PointApi 
	Dim pt As PointApi 
    pt.x = CenterX + (nRadius) * CosD(nAngle)
    pt.Y  = CenterY - (nRadius) * SinD(nAngle)
    Return pt
End Sub
#End if

Public Sub CalcAngleD(fromPoint As PointApi, toPoint As PointApi) As Float
    Dim dirX = toPoint.X - fromPoint.X As Float
    Dim dirY = toPoint.Y - fromPoint.Y As Float
	Return ATan2D(dirY, dirX)
End Sub

Public Sub dotLine(vw As ImageView, fromPoint As PointApi, toPoint As PointApi, strokeWdt As Float, dotSpc As Float, clr As Int)
	Dim NewPt As PointApi 
	Dim stp As Int 
	Dim Angle, lng As Double
	Dim ct As Double 
	Dim cvs As Canvas
	cvs.Initialize(vw)
#if b4a
	Dim Obj1 As Reflector
	Obj1.Target = cvs
   	Obj1.Target = Obj1.GetField("paint")
   	Obj1.RunMethod2("setAntiAlias", True, "java.lang.boolean")	
#end if
	Angle =  90 - CalcAngleD(fromPoint, toPoint) 
	lng = Distance(fromPoint, toPoint)
	stp = lng / dotSpc
	dotSpc = lng / stp
	lng = lng + dotSpc / 4
	For ct = 0 To stp
		NewPt.x = fromPoint.x + ct * dotSpc * SinD(Angle)
    	NewPt.y = fromPoint.y + ct * dotSpc * CosD(Angle)
		cvs.drawCircle(NewPt.x, NewPt.y, strokeWdt / 2, clr, True, 0)
	Next
End Sub

Public Sub dashLine(vw As ImageView, fromPoint As PointApi, toPoint As PointApi, strokeWdt As Float, dotSpc As Float, clr As Int)
	Dim NewPt(2) As PointApi 
	Dim stp As Int 
	Dim BlankSpc As Float = 1.75	'Percent
	Dim Angle, lng As Double
	Dim ct As Double 
	Dim cvs As Canvas
	cvs.Initialize(vw)
#if b4a
	Dim Obj1 As Reflector
	Obj1.Target = cvs
   	Obj1.Target = Obj1.GetField("paint")
   	Obj1.RunMethod2("setAntiAlias", True, "java.lang.boolean")	
#end if
	Angle = 90 - CalcAngleD(fromPoint, toPoint) 
	lng = Distance(fromPoint, toPoint)
	If lng < dotSpc * 2.75 Then
		cvs.drawline(fromPoint.x, fromPoint.y, toPoint.x, toPoint.y, clr, strokeWdt)
		Return
	End If
	lng = lng - dotSpc
	dotSpc = dotSpc * BlankSpc
	stp = lng / dotSpc
	dotSpc = lng / stp
	lng = lng + dotSpc / 2
	For ct = 0 To lng Step dotSpc
		NewPt(0).x   = fromPoint.x + ct * SinD(Angle)
    	NewPt(0).y = fromPoint.y + ct * CosD(Angle)
		NewPt(1).x = fromPoint.x + (ct+dotSpc/BlankSpc) * SinD(Angle)
		NewPt(1).y =  fromPoint.y + (ct+dotSpc/BlankSpc) * CosD(Angle)
		cvs.drawline(NewPt(0).x, NewPt(0).y,NewPt(1).x, NewPt(1).y,clr,strokeWdt)
	Next
End Sub

Public Sub dashdotLine(vw As ImageView, fromPoint As PointApi, toPoint As PointApi, strokeWdt As Float, dotSpc As Float, clr As Int)
	Dim NewPt(3) As PointApi 
	Dim stp As Int 
	Dim BlankSpc As Float 
	Dim Angle, lng As Double
	Dim ct As Double 
	Dim cvs As Canvas
	cvs.Initialize(vw)
#if B4a
	Dim Obj1 As Reflector
	Obj1.Target = cvs
   	Obj1.Target = Obj1.GetField("paint")
   	Obj1.RunMethod2("setAntiAlias", True, "java.lang.boolean")	
#end if
	Angle = 90 - CalcAngleD(fromPoint, toPoint) 
	lng = Distance(fromPoint, toPoint)
	lng = lng - dotSpc 
	BlankSpc = dotSpc + strokeWdt 
	dotSpc = dotSpc + BlankSpc
	stp = lng / dotSpc
	dotSpc = lng / stp
	lng = lng - dotSpc / 2
	For ct = 0 To lng Step dotSpc
		NewPt(0).x   = fromPoint.x + ct * SinD(Angle)
    	NewPt(0).y = fromPoint.y + ct * CosD(Angle)
		NewPt(1).x = fromPoint.x + (ct + dotSpc - BlankSpc) * SinD(Angle)
		NewPt(1).y = fromPoint.y + (ct + dotSpc - BlankSpc) * CosD(Angle)
		NewPt(2).x = fromPoint.x + (ct + dotSpc - BlankSpc / 2) * SinD(Angle)
		NewPt(2).y = fromPoint.y + (ct + dotSpc - BlankSpc / 2) * CosD(Angle)
		cvs.drawline(NewPt(0).x, NewPt(0).y, NewPt(1).x, NewPt(1).y, clr, strokeWdt)
		cvs.drawCircle(NewPt(2).x, NewPt(2).y, strokeWdt / 2, clr, True, 0)
	Next
	NewPt(0).x = fromPoint.x + ct * SinD(Angle)
	NewPt(0).y = fromPoint.y + ct * CosD(Angle)
	cvs.drawline(NewPt(0).x, NewPt(0).y, toPoint.x, toPoint.y, clr, strokeWdt)
End Sub

Public Sub drawPoints(vw As ImageView, fromPoint As PointApi, clr As Int)
	Dim cvs As Canvas
	cvs.Initialize(vw)
#if B4a
	Dim Obj1 As Reflector
	Obj1.Target = cvs
   	Obj1.Target = Obj1.GetField("paint")
   	Obj1.RunMethod2("setAntiAlias", True, "java.lang.boolean")	
#end if
	cvs.DrawLine(fromPoint.x, fromPoint.y - 10, fromPoint.x, fromPoint.y + 10, clr, 1dip)
	cvs.DrawLine(fromPoint.x - 10, fromPoint.y, fromPoint.x + 10, fromPoint.y, clr, 1dip)	
	cvs.drawCircle(fromPoint.x , fromPoint.y, 10, clr, False, 0.5)	
End Sub

Sub GetFreeMem As String
#if b4a
'	Dim r As Reflector
'	Dim MM, TM, FM, Total As Int
'	r.Target = r.RunStaticMethod("java.lang.Runtime", "getRuntime", Null, Null)
'	MM = r.RunMethod("maxMemory")
'	FM = r.RunMethod("freeMemory")
'	TM = r.RunMethod("totalMemory")
'	Total = MM + FM - TM
	Return "" '"F:" & Round2(FM,2) & ",  T:" & Round2(Total / 1024, 2)
#else
	Dim r As Reflector
	Dim MM, TM, FM, Total As Int
	r.Target = r.RunStaticMethod("java.lang.Runtime", "getRuntime", Null, Null)
	MM = r.RunMethod("maxMemory")
	FM = r.RunMethod("freeMemory")
	TM = r.RunMethod("totalMemory")
	Total = MM + FM - TM
	Return "F:" & Round2(FM,2) & ",  T:" & Round2(Total / 1024, 2)
#end if
End Sub

Sub SendEmail(EmailTo As String, Subject As String, Details As String)
	Dim eSMTP As SMTP
	eSMTP.Initialize($"mail.${ShareCode.APPL_HOST}"$, 587, $"alertas@${ShareCode.APPL_HOST}"$, "..Alertas@VRCG_20!9", "")
	eSMTP.StartTLSMode = True
	
	If  (ShareCode.APP_DOMAIN.ToLowerCase.Contains("grandative")) Then
		eSMTP.MailFrom = "apoioaocliente@grandative.pt"
	else If  (ShareCode.APP_DOMAIN.ToLowerCase = "brasfone") Then
		eSMTP.MailFrom = "info@vehiclestoragefaro.com"
	End If
	
	eSMTP.HtmlBody = True
	eSMTP.To.AddAll(Regex.Split("\;", EmailTo ))
	eSMTP.BCC.Add("palpedrinha@gmail.com")
	eSMTP.Subject = Subject
	eSMTP.Body = Details
	eSMTP.Send
End Sub

Sub SendEmailExt(EmailTo As String, EmailCC As String, Subject As String, Details As String, imgList As List)
	

	Starter.RequestEmailFromBO("",EmailTo,EmailCC, Subject,"")
	
'	
'		
'	Dim eSMTP As SMTP
'	eSMTP.Initialize($"mail.${ShareCode.APPL_HOST}"$, 587, $"alertas@${ShareCode.APPL_HOST}"$, "..Alertas@VRCG_20!9", "")
'	eSMTP.StartTLSMode = True
	
'	If  (ShareCode.APP_DOMAIN.ToLowerCase.contains("grandative")) Then
'		eSMTP.MailFrom = "apoioaocliente@grandative.pt"
'	else If  (ShareCode.APP_DOMAIN.ToLowerCase = "brasfone") Then
'		eSMTP.MailFrom = "info@vehiclestoragefaro.com"
'   else If  (ShareCode.APP_DOMAIN.ToLowerCase = "edp") Then
'		eSMTP.Sender = bcc
'	End If
'	End If
		
'	eSMTP.HtmlBody = True
'	eSMTP.To.AddAll(Regex.Split("\;", EmailTo ))
'	eSMTP.CC.AddAll(Regex.Split("\;", EmailCC ))
''	eSMTP.BCC.Add("palpedrinha@gmail.com")
'	eSMTP.Subject = Subject
'	eSMTP.Body = Details
'	If (imgList.Size >= 1) Then
'		For n=0 To imgList.Size-1
'			Dim sFile As String = $"${imgList.Get(n)}.png"$
'# if B4A
'			eSMTP.AddAttachment(Starter.InternalFolder, sFile)
'# else
'			eSMTP.AddAttachment(Starter.Provider.InternalFolder, sFile)
'# end if
'		Next
'	End If
'	eSMTP.Send
End Sub

Sub eSMTPReturn_MessageSent(Success As Boolean)
	Log("SMTP send: " & Success )
	If Success Then
		#if b4a
		ToastMessageShow("Email Enviado !",True)
		#else
		UtilsHUD.ToastMessageShow("Email Sent !",True)
		#end if
	Else
		
		#if b4a
		ToastMessageShow("Email NÃO enviado !",True)
		#else
		UtilsHUD.ToastMessageShow("Email NOT Sent !",True)
		#end if
		Log(LastException.Message)
	End If
End Sub

Sub CallApi(TypeLog As Int, params As Map, target As Object, url As String, funcReturn As String, request As String)
	
	Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, request.trim, "", "")
	save2updateFile(url, MapToJson(params), TypeLog, request,WorkerND)
'	Dim ApiCall As Api
	
	Try
		Starter.ApiCall.UpdateData2Server(params, target, url, funcReturn, True)
	Catch
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, request.trim, "", "")
		save2update(url, MapToJson(params), TypeLog, WorkerND)
	End Try
End Sub

Sub CallApiLocalSaved(filedata As String, target As Object, funcReturn As String)
	
	Dim Continua As Boolean = False
	If File.Exists(Starter.SharedFolder, filedata) Then
		
		Dim Reader As TextReader
		Reader.Initialize(File.OpenInput(Starter.SharedFolder, filedata))
		Dim lineText As List = Reader.ReadList
		Reader.Close
		
		If (lineText.Size > 1) Then
			Dim lst As List = Regex.Split("\=", lineText.Get(ShareCode.UPValues))
			Log($"${lst.Get(0)}:${lst.Get(1)}"$)
			Dim paramsmap As Map '= lineText.Get(ShareCode.UPValues)
			paramsmap.Initialize
			paramsmap.Put(lst.Get(0), lst.Get(1))
'			Dim urlmap As Map = lineText.Get(ShareCode.UPTable)
			Continua = True
		End If
		
		If (Continua) Then
'			Log(urlmap.Get("up_tableurl"))
			Log(paramsmap.Get("up_values"))
'			Dim ApiCall As Api
'			ApiCall.Initialize
'			Try
'				ApiCall.UpdateData2Server(paramsmap.Get("up_values"), target, urlmap.Get("up_tableurl"), funcReturn, True)
'			Catch
'				Log("ERROR")
'			End Try
		End If
		
	End If
	

End Sub

#if b4a
Sub MeasureMultilineTextHeight (ActMe As Object, Font As B4XFont, Width As Double, Text As String) As Double
	Dim jo As JavaObject = ActMe
	Return jo.RunMethod("MeasureMultilineTextHeight", Array(Font, Text, Width))
End Sub
#end if

#if B4i
Sub SetAccuracty(lm As LocationManager, accuracy As Double)
	Dim no As NativeObject = lm
	no = no.GetField("manager")
	no.SetField("desiredAccuracy", accuracy)
End Sub
'The supported values are:
'Best (default): -1
'Best For navigation: -2
'10, 100, 1000 And 3000 (meters).
#End If

#if b4i
'ProgressView
'SetScaleTransformation (DataUpdateIndicator, 1, 3)
Sub SetScaleTransformation(v As View, x As Float, y As Float)
	Dim no As NativeObject = Me
	no.RunMethod("SetScaleTransformation:::", Array(v, x, y))
End Sub

#if ObjC
- (void) SetScaleTransformation:(UIView*) view :(float)x :(float)y {
   view.transform = CGAffineTransformMakeScale(x, y);
}
#End if


Sub GetCurrencySymbol As String
	Dim no As NativeObject
	Return no.Initialize("NSLocale").RunMethod("currentLocale", Null).GetField("currencySymbol").AsString
End Sub
#End If

Sub ImageToBase64(Folder As String, Filename As String) As String
	Dim Continuar As Boolean = True
	Try
		Dim img As B4XBitmap = xui.LoadBitmap(Folder, Filename)
	Catch
		Log(LastException)
		WriteErrors2Log(LastException)
		Continuar = False
	End Try
	If Continuar Then
		Dim su As StringUtils
		Dim out As OutputStream
		out.InitializeToBytesArray(0)
		img.WriteToStream(out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
		Return su.EncodeBase64(out.ToBytesArray)
	End If
End Sub

Sub ImageToBase642(img As B4XBitmap) As String
	If img.IsInitialized Then
		
		Dim su As StringUtils
		Dim out As OutputStream
		out.InitializeToBytesArray(0)
		img.WriteToStream(out, ShareCode.DEVICE_DEF_QUALITY, ShareCode.DEVICE_DEF_IMG_FILETYPE)
		Return su.EncodeBase64(out.ToBytesArray)
	End If
End Sub

'Sub LoadBitmapSample(Folder As String, Filename As String, bw As Int, bh As Int) As B4XBitmap
'	Dim bmp As B4XBitmap = xui.LoadBitmap(Folder, Filename)
'	Dim img As ImageView
'	img.Initialize("")
'	img.Width = bw
'	img.Height = bh
'	Dim cvs As Canvas
'	cvs.Initialize(img)
'	cvs.DrawBitmap(bmp, cvs.TargetRect)
'	Dim res As B4XBitmap = cvs.CreateBitmap
'	cvs.Release
'	Return res
'End Sub

#if objc
@import CoreMedia;
@import AVFoundation;
- (UIImage*)thumbnail:(NSString*) FilePath {
   AVURLAsset *asset = [[AVURLAsset alloc] initWithURL:[NSURL fileURLWithPath:FilePath] options:nil];
   AVAssetImageGenerator *gen = [[AVAssetImageGenerator alloc] initWithAsset:asset];
   gen.appliesPreferredTrackTransform = YES;
   CMTime time = CMTimeMakeWithSeconds(0.0, 600);
   NSError *error = nil;
   CMTime actualTime;

   CGImageRef image = [gen copyCGImageAtTime:time actualTime:&actualTime error:&error];
   UIImage *thumb = [[UIImage alloc] initWithCGImage:image];
   CGImageRelease(image);
   return thumb;
}
#end if

#if b4i
Sub GetPixelColor(Bitm As Bitmap, x As Int, y As Int) As Int
	Dim NativeMe As NativeObject = Me
	Dim UIColor As Object = NativeMe.RunMethod("GetPixelColor:::", Array (Bitm,x,y))
	Return NativeMe.UIColorToColor(UIColor)
End Sub
#end if

#If OBJC

- (UIColor *)GetPixelColor:(UIImage *)bitmap :(int)x :(int)y {
  
    CFDataRef pixelData = CGDataProviderCopyData(CGImageGetDataProvider(bitmap.CGImage));
    const UInt8* data = CFDataGetBytePtr(pixelData);
  
    int pixelInfo = ((bitmap.size.width  * y) + x ) * 4;

    UInt8 red = data[pixelInfo];
    UInt8 green = data[(pixelInfo + 1)];
    UInt8 blue = data[pixelInfo + 2];
    UInt8 alpha = data[pixelInfo + 3];
    CFRelease(pixelData);

    return [UIColor colorWithRed:red/255.0f green:green/255.0f blue:blue/255.0f alpha:alpha/255.0f];
}
#End If



' EX: LogUserAction("TUSRLGOT_1", Me)
Sub LogUserAction(tagcode As String, MeObject As Object)
	
'	TUSRLGOT_1	Login
'	TUSRLGOT_2	Logout
'	TUSRLGOT_3	Entrada de Pausa
'	TUSRLGOT_4	Saída de Pausa
'	TUSRLGOT_5	Indisponibilidade
'	TUSRLGOT_6	Disponibilidade
'	TUSRLGOT_7	Confirmação de equipamento
'	TUSRLGOT_8	Confirmação de Artigos
'	TUSRLGOT_9	Confirmação de Viatura
'	TUSRLGOT_10	Entrada na Equipa
'	TUSRLGOT_11	Sáida da Equipa
'	TUSRLGOT_12	Entrada em execução
'	TUSRLGOT_13	Saída de Execução
'	TUSRLGOT_14	Criação de Intervenção
'	TUSRLGOT_15	Criação de evidência fotográfica
'	TUSRLGOT_16	Criação de nota pictugráfica
'	TUSRLGOT_17	Sincronização de dados
'	TUSRLGOT_18	Envio de dados para verificação
'	TUSRLGOT_19	Verificação de Alertas
'	TUSRLGOT_20	Inicio de Jornada
'	TUSRLGOT_21	Fim de Jornada
#if b4i
	Private sACLALatitude As String = IfNullOrEmpty(Starter.LocationLatitude, "")
	Private sACLALongitude As String = IfNullOrEmpty(Starter.LocationLongitude, "")
#else
	Private sACLALatitude As String = IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private sACLALongitude As String = IfNullOrEmpty(LocationService.GeoLocal.lon, "")
#end if
	Private sACLADatetime As String = GetCurrDatetime
	
	Dim params As Map
	params.Initialize
	params.Put("_token", ShareCode.APP_TOKEN)
	params.Put("ACLAAuthorization", ShareCode.APP_Authorization)
	params.Put("ACLASessUser", ShareCode.SESS_OPER_User)
	params.Put("ACLADatetime", sACLADatetime)
	params.Put("ACLALatitude", sACLALatitude)
	params.Put("ACLALongitude", sACLALongitude)
	params.Put("ACLAType", tagcode)
	params.Put("versionTagcode", Main.VersionTagcode)
	params.Put("_authorization", Main.DeviceAuthorization)
	params.Put("_instance", Main.DeviceInstance)
	params.put("_deviceBrand", Main.DeviceBrand)
	params.put("_deviceModel", Main.DeviceModel)
	params.put("_deviceMacAddress", Main.DeviceMacAddress)
	Dim Url As String = $"https://${ShareCode.APP_DOMAIN}.${ShareCode.APPL_HOST}/api/orion/mobile/user/update"$
	If Not(ShareCode.APP_WORKING_LOCAL) Then
		CallApi(0, params, MeObject, Url, "", "")
	Else
		Dim WorkerND As WorkerNewData = Types.MakeWorkerNewData(4, "", "", "")
		save2update(Url, MapToJson(params), 0, WorkerND)
	End If

	'**********************************************************************
	' ALTERACAO PC - ALEM DE ACTUALIZAR O ESTADO DO TECNICO NO SERVIDOR, 
	' TAMBEM ACTUALIZA O MESMO ESTADO EM UM FICHEIRO LOCAL E UMA LISTA 
	' COM OS DIFERENTES ESTADOS DO TECNICO, COM OS PARAMETROS:
	' TECNICO, DATA, COORDENADAS, ESTADO
	'**********************************************************************
	
		If ShareCode.USER_LOCAL_MAP.IsInitialized Then
			ShareCode.USER_LOCAL_MAP.Clear
		Else
			ShareCode.USER_LOCAL_MAP.Initialize
		End If
		
		ShareCode.USER_LOCAL_MAP.Put(ShareCode.SESS_OPER_User,tagcode)
		File.WriteMap(Starter.InternalFolder,"USER_STATUS.MAP",ShareCode.USER_LOCAL_MAP)
		
		Dim Writer As TextWriter
		Writer.Initialize(File.OpenOutput(Starter.InternalFolder, $"${ShareCode.SESS_OPER_User}_status.lst"$, True))
		Writer.WriteLine($"${ShareCode.SESS_OPER_User}|${sACLADatetime}|${sACLALatitude}|${sACLALongitude}|${tagcode}"$)
		Writer.WriteLine("This is the second line.")
		Writer.Close
	'**********************************************************************
	
	Sleep(250)

End Sub


Sub GetLocalUserStatus As String
	
	If ShareCode.USER_LOCAL_MAP.IsInitialized Then
		ShareCode.USER_LOCAL_MAP.Clear
	Else
		ShareCode.USER_LOCAL_MAP.Initialize
	End If
	
	If File.Exists(	Starter.InternalFolder,"USER_STATUS.MAP") Then
		ShareCode.USER_LOCAL_MAP = File.readMap(Starter.InternalFolder,"USER_STATUS.MAP")
		Dim ret As String = ShareCode.USER_LOCAL_MAP.Get(ShareCode.SESS_OPER_User)
	Else
		ret = ""
	End If

	Return ret

End Sub

Sub UpdateLiteUpdateDateTime(dateT As String)
	Starter.AppState.WriteString("APP_START", "APP_LITE_LAST_UPDATE", dateT)
	Starter.AppState.Flush
	ShareCode.APP_LAST_LITE_UPDATE_DATETIME = Starter.AppState.ReadString("APP_START", "APP_LITE_LAST_UPDATE", "")
End Sub

Sub ChangeButtonWithColorMain(btn As Button, State As Boolean)
	btn = Sender
	If Not(btn.IsInitialized) Then
		btn.Initialize("")
	End If
	
	btn.Enabled = State

	If (btn.Enabled) Then
		btn.Color = Consts.ColorMain
		Else
		btn.Color = Colors.Gray
	End If
End Sub


Sub GetAppName(Upper As Boolean) As String
	#if B4i
	Dim no As NativeObject
	no = no.Initialize("NSBundle").RunMethod("mainBundle", Null)
	Dim name As Object = no.RunMethod("objectForInfoDictionaryKey:", Array("CFBundleDisplayName"))
	#else
	Dim name As Object = Application.LabelName
	#End If
	If (Upper) Then
		Dim sName As String = name
		Return sName.ToUpperCase
	Else
		Return name
	End If
End Sub

Sub GetVersion As String
	#if B4i
	Dim no As NativeObject
	no = no.Initialize("NSBundle").RunMethod("mainBundle", Null)
	Dim name As Object = no.RunMethod("objectForInfoDictionaryKey:", Array("CFBundleShortVersionString"))
	#else
	Dim name As Object = Application.VersionCode
	#End If
	Return name
End Sub

Sub GetTableColumnsValues(table As String) As String
	Dim MainScript As String = ""
	Dim Columns As String = ""
	Dim Script As String = $"select * from ${table} limit 1"$
	
	Private RecordOri As ResultSet = Starter.LocalSQLEVC.ExecQuery(Script)
	For n=0 To RecordOri.ColumnCount-1
		If NNE(Columns) Then
			Columns = $"${Columns},"$
		End If
		Columns = $"${Columns} ${ RecordOri.GetColumnName(n)}"$
	Next
	Dim ValuesList As List : ValuesList.Initialize
	If NNE(Columns) Then
		Do While RecordOri.NextRow
			Dim Values As String = ""
			For n=0 To RecordOri.ColumnCount-1
				If NNE(Values) Then
					Values = $"${Values},"$
				End If
				Values = $"${Values} '${RecordOri.GetString(RecordOri.GetColumnName(n))}'"$
			Next
			If NNE(Values) Then
				Values = $"(${Values})"$
				ValuesList.Add(Values)
			End If
		Loop
	End If
	
	If (ValuesList.Size > 0) Then
		For n=0 To ValuesList.Size-1
			If NNE(MainScript) Then
				MainScript = $"${MainScript},"$
			End If
			MainScript = $"${MainScript} '${ValuesList.get(n)}'"$
		Next
		If NNE(MainScript) Then
			MainScript = $"insert into ${table} (${Columns}) values ${MainScript};"$
		End If
	End If
	Return MainScript
End Sub

Sub SaveSQL2FileAndDelete(table As String, ContinueJob As Boolean) As Boolean
	Dim ret As Boolean = ContinueJob
	If (ret) Then
		Dim Script As String = GetTableColumnsValues(table)
		If NNE(Script) Then
			Dim filename As String = $"sql_${table}.recover"$
			File.WriteString(Starter.InternalFolder, filename, Script)
			If (File.Exists(Starter.InternalFolder, filename)) Then
				Starter.LocalSQLEVC.ExecNonQuery($"delete from ${table}"$)
				ret = True
			End If
		End If
	End If
	Return ret
End Sub

Sub ReverSQLFromFilesAndDelete
	Dim FileList As List = File.ListFiles(Starter.InternalFolder)
	For n=0 To FileList.Size-1
		Dim filename As String = FileList.Get(n)
		If (filename.StartsWith("sql_") And filename.EndsWith(".recover")) Then
			Dim Script As String = File.ReadString(Starter.InternalFolder, filename)
			If NNE(Script) Then
				Starter.LocalSQLEVC.ExecNonQuery(Script)
				File.Delete(Starter.InternalFolder, filename)
			End If
		End If
	Next
End Sub

Sub ShowCustomToast(Text As Object, LongDuration As Boolean,Times2Show As Int ,BackgroundColor As Int)
		
	Dim ctxt As JavaObject
	ctxt.InitializeContext
	Dim duration As Int
	If LongDuration Then duration = 1 Else duration = 0
	Dim toast As JavaObject
	toast = toast.InitializeStatic("android.widget.Toast").RunMethod("makeText", Array(ctxt, Text, duration))
	Dim v As View = toast.RunMethod("getView", Null)
	Dim cd As ColorDrawable
	cd.Initialize(BackgroundColor, 20dip)
	v.Background = cd
	'uncomment to show toast in the center:
	toast.RunMethod("setGravity", Array(Bit.Or(Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL), 0, 0))
	toast.RunMethod("show", Null)
	
	If Times2Show > 0 Then
		For x=1 To Times2Show
			Sleep(3750)
			toast.RunMethod("show", Null)
		Next
	End If
	
End Sub

Sub HtmlColor2Int(Hcolor As String) As Int
	
	Dim ResultInt As Int = 0
	
	If Hcolor = "#02b8c5" Or Hcolor = "blue" Then
		ResultInt = Consts.ColorBlue
	else if Hcolor = "#febb03" Or Hcolor = "yellow" Then
		ResultInt = Consts.ColorYellow
	else if Hcolor = "#0d893c" Or Hcolor = "green" Then
		ResultInt = Consts.ColorGreen
	else if Hcolor = "#d13339" Or Hcolor = "red" Then
		ResultInt = Consts.ColorRed
	else if Hcolor ="#717a8e" Or Hcolor = "gray" Then
		ResultInt = Consts.ColorGray
	else if Hcolor = "#0b7030" Or Hcolor = "darkgreen" Then
		ResultInt = Consts.DarkGreen
	else if Hcolor = "#000000" Or Hcolor = "black" Then
		ResultInt = Colors.Black
	else if Hcolor = "#ffffff" Or Hcolor = "white" Then
		ResultInt = Colors.white
	Else
		ResultInt = Colors.Black
	End If
	
	Return ResultInt
End Sub


Sub ReplaceFormulaFields(request_tagcode As String, task_tagcode As String, item_tagcode As String,  _
	repeatcounter As Int, repeatitemcounter As Int, repeatfieldcounter As Int, Formula As String, thisText As String) As String
	
	Log("ENTROU EM : ReplaceFormulaFields")
	Dim FormulaResult As String = Formula.ToUpperCase.Replace("[TV]", thisText)
		
	Dim PosisStart As Int = FormulaResult.IndexOf("[")
	Dim counter As Int = 0
	Do While PosisStart >=0
		Dim PosisEnd As Int = FormulaResult.IndexOf("]")
		Log($"${PosisStart}, ${PosisEnd}"$)
		If (PosisEnd >= 0) Then
			Dim Valor As String = FormulaResult.SubString2(PosisStart+1, PosisEnd)

			Dim getResultValor As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, 0) as valor
						from dta_requests_values where request_tagcode='${request_tagcode}' 
						and task_tagcode='${task_tagcode}'
						and item_tagcode='${Valor}' 
						and repeatcounter=${repeatcounter}
						and repeatitemcounter=${repeatitemcounter}
						and repeatfieldcounter=${repeatfieldcounter}
						limit 1"$, "valor")
			
			If getResultValor ="" Then
				Dim getResultValor As String = DBStructures.GetScriptColumnStrEVC($"select ifnull(execute_value, 0) as valor
						from dta_requests_values where request_tagcode='${request_tagcode}' 
						and task_tagcode='${task_tagcode}'
						and item_tagcode='${Valor}' 
						and repeatcounter=${repeatcounter}
						and repeatitemcounter=0
						and repeatfieldcounter=${repeatfieldcounter}
						limit 1"$, "valor")
				If  getResultValor = "" Then getResultValor = "0"
			End If
			
			
				
			FormulaResult = FormulaResult.Replace($"[${Valor}]"$, getResultValor)
			Dim PosisStart As Int = FormulaResult.IndexOf("[")
			counter = counter + 1
		Else
			Exit
		End If
	Loop

	Return FormulaResult
	
End Sub

Sub InsideGeoFence(lat As Double, lon As Double, offset As Int) As Boolean
	
	Private CurrentLatitude As Double = IfNullOrEmpty(LocationService.GeoLocal.lat, "")
	Private CurrentLongitude As Double = IfNullOrEmpty(LocationService.GeoLocal.lon, "")
	
	Dim EvalLat As Boolean = False
	Dim EvalLon As Boolean = False
	
	If lat = 0 Then	lat = CurrentLatitude
	If lon = 0 Then lon = CurrentLongitude
	
	If offset < = 0 Then offset = 2
	
	Try
		Dim pi As Float = 3.14159
		Dim Minuslat As Double = lat - (180/pi)*(offset/6378137)
		Dim Minuslon As Double = lon - (180/pi)*(offset/6378137)/Cos(lat)
	
		Dim Pluslat As Double = lat + (180/pi)*(offset/6378137)
		Dim Pluslon As Double = lon + (180/pi)*(offset/6378137)/Cos(lat)
		
		If CurrentLatitude >= Minuslat And CurrentLatitude <= Pluslat Then
			EvalLat = True
		End If
	
		If CurrentLongitude >= Minuslon And CurrentLongitude <= Pluslon Then
			EvalLon = True
		End If
	Catch
		Log(LastException)
		WriteErrors2Log(LastException)
	End Try
	
	If EvalLat = True And EvalLon = True Then
		Return True
	Else
		Return False
	End If
	
End Sub

Sub RemoveDuplicates(pList As List) As List
	If pList = Null Or Not(pList.IsInitialized) Then Return pList
 
	Dim lstNew As List : lstNew.Initialize
	Dim objItem As Object
	
	For i = 0 To pList.Size - 1
		objItem = pList.Get(i)
		If lstNew.IndexOf(objItem) = - 1 Then
			lstNew.Add(objItem)
		End If
	Next
 
	Return lstNew
End Sub

Sub WriteErrors2Log(Error2log As String)
	If NNE(Error2log) Then
		Dim Writer As TextWriter
		
		Dim dtf As String = DateTime.DateFormat
		DateTime.DateFormat = "yyyyMMdd"
		Dim date2name As String = DateTime.Date(DateTime.Now)
		DateTime.DateFormat = dtf
		
		Writer.Initialize(File.OpenOutput(Starter.SharedFolder, $"${date2name}-ErrorsLog.txt"$, True))
		Writer.WriteLine($"[${DateTime.Date(DateTime.Now)} - ${DateTime.Time(DateTime.Now)}]${CRLF}${Error2log}"$)
		Writer.Close
	End If
End Sub