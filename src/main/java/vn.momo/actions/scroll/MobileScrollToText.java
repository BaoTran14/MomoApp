package vn.momo.actions.scroll;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import vn.momo.model.GetCurrentDriver;

public class MobileScrollToText implements Interaction {
    private final String text;

    public MobileScrollToText(String text) {
        this.text = text;
    }

    @Override
    @Step("{0} scroll to #text")
    public <T extends Actor> void performAs(T theUser) {
        WebDriver driver = GetCurrentDriver.usedBy(theUser);
        MobileElement mobileElement = (MobileElement) ((AndroidDriver) driver).findElementByAndroidUIAutomator("new UiScrollable("
                + "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"))");
    }
}
