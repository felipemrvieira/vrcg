package xevolution.vrcg.devdemov2400.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_maps_layout{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("progressbar").vw.setLeft((int)((50d / 100 * width) - (views.get("progressbar").vw.getWidth() / 2)));
views.get("progressbar").vw.setTop((int)((50d / 100 * height) - (views.get("progressbar").vw.getHeight() / 2)));

}
}