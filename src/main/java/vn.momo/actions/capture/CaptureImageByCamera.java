package vn.momo.actions.capture;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import vn.momo.model.GetCurrentDriver;

public class CaptureImageByCamera implements Interaction {
    @Override
    @Step("{0} captures image")
    public <T extends Actor> void performAs(T theUser) {
        WebDriver driver = GetCurrentDriver.usedBy(theUser);
        AndroidDriver mobileDriver = (AndroidDriver) driver;
        mobileDriver.pressKey(new KeyEvent(AndroidKey.CAMERA));
    }
}
