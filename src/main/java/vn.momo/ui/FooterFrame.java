package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FooterFrame {
    public static Target MY_WALLET_CATEGORY = Target.the("my wallet category").located(By.xpath("//android.widget.Button[@content-desc='VÍ CỦA TÔI, tab, 5 of 5']"));
}
