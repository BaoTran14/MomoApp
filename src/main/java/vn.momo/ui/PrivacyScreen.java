package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrivacyScreen {
    public static Target FRIEND_LIST_SELECT_MODE_BOX = Target.the("friend list select mode box")
            .located(By.xpath("(//android.widget.ScrollView)[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]"));
    public static Target SAVE_BUTTON = Target.the("save button").located(By.xpath("//android.widget.TextView[@text='Lưu']"));
}
