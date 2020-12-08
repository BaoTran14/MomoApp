package vn.momo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutMeScreen {
    public static Target INTIMATE_NAME_FIELD = Target.the("intimate name field")
            .located(By.xpath("(//android.widget.ScrollView)[3]//android.widget.EditText"));
    public static Target INTIMATE_NAME_SELECT_MODE_BUTTON = Target.the("select mode button of intimate name")
            .located(By.xpath("(//android.widget.ScrollView)[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]"));
    public static Target SAVE_BUTTON = Target.the("save button")
            .located(By.xpath("//android.widget.TextView[@text='Lưu']"));
    public static Target CURRENT_HOME_LOCATION_SELECT_BOX = Target.the("current home location box")
            .located(By.xpath("(//android.widget.ScrollView)[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
    public static Target CURRENT_HOME_LOCATION_SELECT_MODE_BUTTON = Target.the("select mode button current home location ")
            .located(By.xpath("(//android.widget.ScrollView)[3]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]"));
}
