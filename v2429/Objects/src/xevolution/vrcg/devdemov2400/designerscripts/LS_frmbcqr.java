package xevolution.vrcg.devdemov2400.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmbcqr{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[frmBCQR/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 3;BA.debugLine="fundo.SetLeftAndRight(0,100%x)"[frmBCQR/General script]
views.get("fundo").vw.setLeft((int)(0d));
views.get("fundo").vw.setWidth((int)((100d / 100 * width) - (0d)));
//BA.debugLineNum = 4;BA.debugLine="fundo.SetTopAndBottom(0,100%y)"[frmBCQR/General script]
views.get("fundo").vw.setTop((int)(0d));
views.get("fundo").vw.setHeight((int)((100d / 100 * height) - (0d)));
//BA.debugLineNum = 5;BA.debugLine="BCQR_Camera.SetLeftAndRight(10,72%x)"[frmBCQR/General script]
views.get("bcqr_camera").vw.setLeft((int)(10d));
views.get("bcqr_camera").vw.setWidth((int)((72d / 100 * width) - (10d)));
//BA.debugLineNum = 6;BA.debugLine="BCQR_Camera.SetTopAndBottom(10,97%y)"[frmBCQR/General script]
views.get("bcqr_camera").vw.setTop((int)(10d));
views.get("bcqr_camera").vw.setHeight((int)((97d / 100 * height) - (10d)));
//BA.debugLineNum = 7;BA.debugLine="BCQR_ListView.Top = BCQR_Camera.Top"[frmBCQR/General script]
views.get("bcqr_listview").vw.setTop((int)((views.get("bcqr_camera").vw.getTop())));
//BA.debugLineNum = 8;BA.debugLine="BCQR_ListView.SetLeftAndRight(74%x,98%x)"[frmBCQR/General script]
views.get("bcqr_listview").vw.setLeft((int)((74d / 100 * width)));
views.get("bcqr_listview").vw.setWidth((int)((98d / 100 * width) - ((74d / 100 * width))));
//BA.debugLineNum = 9;BA.debugLine="btnBCQR_OK.Left = BCQR_ListView.Left"[frmBCQR/General script]
views.get("btnbcqr_ok").vw.setLeft((int)((views.get("bcqr_listview").vw.getLeft())));
//BA.debugLineNum = 10;BA.debugLine="btnBCQR_OK.Top = BCQR_ListView.Height + 20dip"[frmBCQR/General script]
views.get("btnbcqr_ok").vw.setTop((int)((views.get("bcqr_listview").vw.getHeight())+(20d * scale)));
//BA.debugLineNum = 11;BA.debugLine="btnBCQR_OK.Height = 15%y"[frmBCQR/General script]
views.get("btnbcqr_ok").vw.setHeight((int)((15d / 100 * height)));
//BA.debugLineNum = 12;BA.debugLine="btnBCQR_OK.Width = BCQR_ListView.Width / 2 - 4dip"[frmBCQR/General script]
views.get("btnbcqr_ok").vw.setWidth((int)((views.get("bcqr_listview").vw.getWidth())/2d-(4d * scale)));
//BA.debugLineNum = 13;BA.debugLine="btnBCQR_Cancel.Width = btnBCQR_OK.Width"[frmBCQR/General script]
views.get("btnbcqr_cancel").vw.setWidth((int)((views.get("btnbcqr_ok").vw.getWidth())));
//BA.debugLineNum = 14;BA.debugLine="btnBCQR_Cancel.Top = btnBCQR_OK.Top"[frmBCQR/General script]
views.get("btnbcqr_cancel").vw.setTop((int)((views.get("btnbcqr_ok").vw.getTop())));
//BA.debugLineNum = 15;BA.debugLine="btnBCQR_Cancel.Left = btnBCQR_OK.Left + btnBCQR_OK.Width + 6dip"[frmBCQR/General script]
views.get("btnbcqr_cancel").vw.setLeft((int)((views.get("btnbcqr_ok").vw.getLeft())+(views.get("btnbcqr_ok").vw.getWidth())+(6d * scale)));

}
}