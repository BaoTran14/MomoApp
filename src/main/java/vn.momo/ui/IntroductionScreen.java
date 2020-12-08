package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IntroductionScreen {
    public static Target EXPLORE_NOW_BUTTON = Target.the("explore now button").located(By.xpath("//android.widget.TextView[@text='KHÁM PHÁ NGAY']"));
}
