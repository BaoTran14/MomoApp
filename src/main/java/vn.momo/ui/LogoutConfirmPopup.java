package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogoutConfirmPopup {
    public static Target AGREE_BUTTON = Target.the("agree button").located(By.xpath("//android.widget.TextView[@text='ĐỒNG Ý']"));
}
