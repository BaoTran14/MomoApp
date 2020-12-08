package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PictureAppSelectionGrid {
    public static Target PHOTOS_OPTION = Target.the("photos option").located(By.xpath("//android.widget.GridView//android.widget.TextView[@text='Ảnh']"));
    public static Target GRID_VIEW = Target.the("grid view of app selection").located(By.id("android:id/tw_resolver_pagemode_page_list"));
    public static Target GALLERY_OPTION = Target.the("gallery option").located(By.xpath("(//android.widget.GridView/android.widget.LinearLayout)[1]"));
}
