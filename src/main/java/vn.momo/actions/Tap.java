package vn.momo.actions;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;
import vn.momo.model.GetCurrentDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Tap implements Interaction {
    private final int x;
    private final int y;

    public Tap(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Interaction onPoint(int x, int y) {
        return instrumented(Tap.class, x, y);
    }

    @Override
    public <T extends Actor> void performAs(T theUser) {
        WebDriver driver = GetCurrentDriver.usedBy(theUser);
        TouchAction action = new TouchAction((MobileDriver) driver);
        action.tap(PointOption.point(x, y)).release().perform();
    }
}
