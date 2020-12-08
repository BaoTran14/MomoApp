package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AndroidPermissionPopup {
    public static Target ALLOW_BUTTON = Target.the("allow button").located(By.id("com.android.packageinstaller:id/permission_allow_button"));
}
