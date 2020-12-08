package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MomoScreen {
    public static Target MONEY_ANNOUCE_TEXT = Target.the("money annouce text").located(By.xpath("//android.widget.TextView[@text='Số dư trong ví']"));
    public static Target LOGOUT_ICON = Target.the("log out icon").located(By.xpath("//android.widget.ImageView[@content-desc='iconDangXuat']"));
}
