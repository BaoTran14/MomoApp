package vn.momo.actions.scroll;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import vn.momo.model.GetCurrentDriver;

public class ScrollInsideModalToText implements Interaction {
    private final String text;

    @Override
    public <T extends Actor> void performAs(T theUser) {
        WebDriver driver = GetCurrentDriver.usedBy(theUser);
        MobileElement element = (MobileElement) driver.findElement(By.xpath("//*[@text='Hà Nội']"));
        Point x = element.getLocation();
        TouchAction action = new TouchAction((MobileDriver)driver);
        action.longPress(PointOption.point(x.x, x.y)).moveTo(PointOption.point(x.x, 100)).release().perform();
    }

    public ScrollInsideModalToText(String text){
        this.text=text;
    }
}
