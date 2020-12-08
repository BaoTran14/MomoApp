package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PhoneRequestScreen {
    public static Target TITLE = Target.the("title of phone request screen").located(By.xpath("(//android.widget.TextView)[1]"));
    public static Target CONTENT = Target.the("title of phone request screen").located(By.xpath("(//android.widget.TextView)[2]"));
}
