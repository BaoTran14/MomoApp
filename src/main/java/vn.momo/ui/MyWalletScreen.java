package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import vn.momo.model.Environment;

public class MyWalletScreen {
    public static Target PROFILE = Target.the(("profile")).located(By.xpath("//android.widget.TextView[@text='" + Environment.instance().PHONE_NUMBER + "']"));
}
