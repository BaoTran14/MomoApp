package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PermissionRequestPopup {
    public static Target ALLOW_ACCESS_BUTTON = Target.the("allow access button").located(By.xpath("//android.widget.TextView[@text='Cho phép truy cập']"));
}
