package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmCapturedImageScreen {
    public static Target OK_BUTTON = Target.the("ok button").located(By.xpath("(//android.widget.Button)[2]"));
}
