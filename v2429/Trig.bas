Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=2.02
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Type Point(X As Int, Y As Int) 'UNCOMMENT IF USED ELSEWHERE
	Dim Pi As Double ,RadPi As Double
	Pi = 3.14159265358979 
	RadPi=180 / Pi
End Sub
Sub SetPoint(X As Int, Y As Int) As Point 
	Dim temp As Point
	temp.Initialize
	temp.X=X
	temp.Y=Y
	Return temp
End Sub
Sub SetRect(X As Int, Y As Int, Width As Int, Height As Int)As Rect 
	Dim temp As Rect 
	temp.Initialize(X,Y,Width,Height)
	Return temp
End Sub
Sub MaxSizeOfOval(Width As Int, Height As Int, Angle As Int) As Int'method fails for corners
	Dim Middle As Point, EndOfCircle As Point , StartofLine As Point, EndofLine As Point, PointB As Point  
	Middle=SetPoint(Width/2, Height/2)
	Angle = Angle Mod 180'since it's symetrical
	EndOfCircle=SetPoint( findXYAngle(Middle.X,Middle.Y, Width, Angle,True), findXYAngle(Middle.X,Middle.Y, Width, Angle,False) )
	If Angle>=45 And Angle <=135 Then'vertical
		StartofLine=SetPoint(Width,0)
		EndofLine=SetPoint(Width,Height)
	Else If Angle<45 Then'horizontal
		StartofLine=SetPoint(0,0)
		EndofLine=SetPoint(Width,0)
	Else
		StartofLine=SetPoint(0,Height)
		EndofLine=SetPoint(Width,Height)
	End If
	PointB= LineLineIntercept(Middle.X,Middle.Y,  EndOfCircle.X, EndOfCircle.Y, StartofLine.X, StartofLine.Y, EndofLine.X,EndofLine.Y) 
	Return FindDistance(Middle.X,Middle.Y, PointB.X,PointB.Y)*2
End Sub

Sub MaxSizeOfOval2(Width As Int, Height As Int, Angle As Int)
	Dim Middle As Point, EndOfCircle As Point   
	Middle=SetPoint(Width/2, Height/2)
	EndOfCircle=SetPoint( findXYAngle(Middle.X,Middle.Y, Width, Angle,True), findXYAngle(Middle.X,Middle.Y, Height, Angle,False) )
	Return FindDistance(Middle.X,Middle.Y, EndOfCircle.X,EndOfCircle.Y)
End Sub

Sub LineAngleIntercept(X As Int, Y As Int, Angle As Int, X3 As Int, Y3 As Int, X4 As Int, Y4 As Int) As Point
	Dim X2 As Int, Y2 As Int
	X2=findXY(X,Y,1024,Angle,True)
	Y2=findXY(X,Y,1024,Angle,False)
	Return LineLineIntercept(X,Y,X2,Y2,X3,Y3,X4,Y4)
End Sub

Sub LineAngledistance(X As Int, Y As Int, Angle As Int, X3 As Int, Y3 As Int, X4 As Int, Y4 As Int) As Int
	Dim temp As Point 
	temp=LineAngleIntercept(X,Y,Angle,X3,Y3,X4,Y4)
	If temp.IsInitialized Then Return FindDistance(X,Y, temp.X,temp.Y)
End Sub

Sub LineLineIntercept(X1 As Int, Y1 As Int, X2 As Int, Y2 As Int, X3 As Int, Y3 As Int, X4 As Int, Y4 As Int) As Point 
    Dim a1 As Int, a2 As Int, b1 As Int, b2 As Int, c1 As Int, c2 As Int, denom As Int, ret As Point 
    'Translated from Pascal, lost source
    a1 = Y2 - Y1
    b1 = X1 - X2
    c1 = X2 * Y1 - X1 * Y2 '  { a1*x + b1*y + c1 = 0 is line 1 }

    a2 = Y4 - Y3
    b2 = X3 - X4
    c2 = X4 * Y3 - X3 * Y4 '  { a2*x + b2*y + c2 = 0 is line 2 }

    denom = a1 * b2 - a2 * b1

    If denom <> 0 Then
        ret.initialize
        ret.X = (b1 * c2 - b2 * c1) / denom
        ret.Y = (a2 * c1 - a1 * c2) / denom
		Return ret 
    End If
End Sub

Sub CorrectAngle(Angle As Int) As Int
    Do While Angle < 0
        Angle = Angle + 360
    Loop
    Return Angle Mod 360
End Sub

Sub AngleBySection(X1 As Int, Y1 As Int, X2 As Int, Y2 As Int, Angle As Int) As Int
    Angle=CorrectAngle(Angle)

    If X1 < X2 Then 'the point is at the left of Center
        If Y1 = Y2 Then
            Return 90 'Corrected
        Else If Y1 < Y2 Then
            If 270 + Angle = 360 Then
                Return 0 'Corrected
            Else
                Return 180- (Angle -270)  'Corrected
            End If
        Else If Y1 > Y2 Then
            Return 90 - Angle 'Corrected
        End If
    Else
        If X1 > X2 Then 'the point is at the right of Center
            If Y1 > Y2 Then 'point is below center
                'Return 90 + Angle 'Corrected
				Return 360- (Angle-270)
            Else If Y1 < Y2 Then
                Return 270 - Angle 'Corrected
            End If
        Else
            If X1 = X2 Then
                If Y1 < Y2 Then
                    Return 180 'Corrected
                Else If Y1 > Y2 Then
                    Return 0 'Corrected
                End If
            End If
        End If
    End If
	
	Return 90'Corrected
End Sub

Sub FindSection(Angle As Int) As Int
	If Angle<=45 OR Angle >= 315 Then
		Return 0
	Else If Angle <= 135 Then
		Return 1
	Else If Angle <= 225 Then 
		Return 2
	Else
		Return 3
	End If
End Sub



Sub AngleSection(Angle As Int) As Int
	Return Floor(Angle/90)
End Sub

Sub FindAngle(X1 As Int, Y1 As Int, X2 As Int, Y2 As Int) As Double
    Return ATan((Y2 - Y1) / (X1 - X2))
End Sub

Sub findXY(X As Int, Y As Int, Distance As Int, Angle As Int, IsX As Boolean) As Int
	Angle = CorrectAngle( 180-Angle)
    If IsX Then 
		Return X + Sin(Angle) * Distance 
	Else 
		Return Y + Cos(Angle) * Distance
	End If
End Sub

Sub DegToRad(Deg As Int) As Double
    Return (Deg / 180) * Pi
End Sub
Sub RadToDeg(Rad As Double) As Int
    Return Rad * RadPi
End Sub
Sub GradtoRad(Grad As Double) As Double
    Return Grad * (200 / Pi)
End Sub


Sub FindAnglePoint(X As Int, Y As Int, Distance As Int, Angle As Int) As Point
	Dim temp As Point 
	temp.Initialize 
	temp.X=findXYAngle(X,Y,Distance,Angle,True)
	temp.Y=findXYAngle(X,Y,Distance,Angle,False)
	Return temp
End Sub

Sub findXYAngle(X As Int, Y As Int, Distance As Int, Angle As Int, IsX As Boolean ) As Int
    'Return findXY(X, Y, Distance, DegToRad(CorrectAngle(180 - Angle)), IsX)'
	Angle = CorrectAngle( 180-Angle)
	If IsX Then
		Return X + Distance * SinD(Angle)
	Else
		Return Y + Distance * CosD(Angle)
	End If
End Sub

Sub GetCorrectAngle(X1 As Int, Y1 As Int, X2 As Int, Y2 As Int) As Int
    Return AngleBySection(X1, Y1, X2, Y2,  RadToDeg(	FindAngle(X1, Y1, X2, Y2)    )	 )
End Sub

Sub FindDistance(X1 As Int, Y1 As Int, X2 As Int, Y2 As Int) As Int
    If Y2 - Y1 = 0 Then Return Abs(X2 - X1)
    If X2 - X1 = 0 Then Return Abs(Y2 - Y1)
    Return Abs(Y2 - Y1) / Sin(ATan(Abs(Y2 - Y1) / Abs(X2 - X1)))
End Sub

Sub AngleDifference(Angle1 As Int, Angle2 As Int, Absolute As Boolean) As Int
    Dim temp As Int
    temp = Angle2 - Angle1
    If temp > 180 Then temp = -360 + temp
    If Absolute Then temp = Abs(temp)
    Return temp
End Sub

Sub ClosestAngle(CurrentAngle As Int, AngleIncrement As Int)As Int 
	Dim temp As Int, Angle As Int ,Diff As Int ,temp2 As Int 
	Angle=-1
	Diff=360
	For temp = 0 To 359 Step AngleIncrement
		temp2 =  AngleDifference(CurrentAngle, temp, True)
		If temp2<Diff Then
			Angle=temp
			Diff=temp2
		End If
	Next
	Return Angle
End Sub


Sub IsWithinAngle(Angle1 As Int, Angle2 As Int, Angle As Int) As Boolean
    Return AngleDifference(Angle1, Angle2,True) <= Abs(Angle)
End Sub

Sub RoundAngle(Angle1 As Int, Angle As Int) As Int
    Dim temp As Int, rAngle As Int, rDistance As Int, temp2 As Int
    rDistance = 360
    'temp = Angle
    'Do While temp <= 360
    For temp = 0 To 360 Step Angle
        temp2 = AngleDifference(Angle1, temp,True)
        If Abs(temp2) < rDistance Then
            rDistance = Abs(temp2)
            rAngle = temp
        End If
        'temp = temp + Angle
    Next
    'Loop
    Return rAngle
End Sub






Sub Sgn(Value As Double) As Int 
	If Value=0 Then
		Return 0
	Else If Value < 0 Then
		Return -1
	Else
		Return 1
	End If
End Sub
Sub Exp(Value As Double) As Double 
	Return Power(cE, Value)
End Sub 
Sub aLog(Value As Double) As Double 
	Return Logarithm(Value,cE)
End Sub



Sub Sec(Radians As Double) As Double
	Return 1 / Cos(Radians)
End Sub
Sub CoSec(Radians As Double) As Double
    Return 1 / Sin(Radians)
End Sub
Sub CoTan(Radians As Double) As Double
    Return 1 / Tan(Radians)
End Sub
Sub ArcSin(Radians As Double) As Double
    Return ATan(Radians / Sqrt(-Radians * Radians + 1))
End Sub
Sub ArcCos(Radians As Double) As Double 
	Return ATan(-Radians / Sqrt(-Radians * Radians + 1)) + 2 * ATan(1)
End Sub
Sub ArcSec(Radians As Double) As Double 
	Return ATan(Radians / Sqrt(Radians * Radians - 1)) + Sgn((Radians) - 1) * (2 * ATan(1))
End Sub
Sub ArcCoSec(Radians As Double) As Double 
	Return ATan(Radians / Sqrt(Radians * Radians - 1)) + (Sgn(Radians) - 1) * (2 * ATan(1))
End Sub
Sub ArcCoTan(Radians As Double) As Double 
	Return ATan(Radians) + 2 * ATan(1)
End Sub
Sub HSin(Radians As Double) As Double 
	Return (Exp(Radians) - Exp(-Radians)) / 2
End Sub
Sub HCos(Radians As Double) As Double
    Return (Exp(Radians) + Exp(-Radians)) / 2
End Sub
Sub HTan(Radians As Double) As Double
	Return (Exp(Radians) - Exp(-Radians)) / (Exp(Radians) + Exp(-Radians))
End Sub
Sub HSec(Radians As Double) As Double
	Return 2 / (Exp(Radians) + Exp(-Radians))
End Sub
Sub HCoSec(Radians As Double) As Double
	Return 2 / (Exp(Radians) - Exp(-Radians))
End Sub
Sub HCoTan(Radians As Double) As Double
	Return (Exp(Radians) + Exp(-Radians)) / (Exp(Radians) - Exp(-Radians))
End Sub

Sub HArcSin(Radians As Double) As Double
	Return aLog(Radians + Sqrt(Radians * Radians + 1))
End Sub
Sub HArcCos(Radians As Double) As Double
	Return aLog(Radians + Sqrt(Radians * Radians - 1))
End Sub
Sub HArcTan(Radians As Double) As Double
	Return aLog((1 + Radians) / (1 - Radians)) / 2
End Sub
Sub HArcSec(Radians As Double) As Double
	Return aLog((Sqrt(-Radians * Radians + 1) + 1) / Radians)
End Sub
Sub HArcCoSec(Radians As Double) As Double
	Return aLog((Sgn(Radians) * Sqrt(Radians * Radians + 1) + 1) / Radians)
End Sub
Sub HArcCoTan(Radians As Double) As Double
	Return aLog((Radians + 1) / (Radians - 1)) / 2
End Sub
Sub LogN(Radians As Double, BaseN As Int) As Double
	Return aLog(Radians) / aLog(BaseN)
End Sub







