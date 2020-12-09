package vn.momo.actions.scroll;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import vn.momo.model.GetCurrentDriver;
import vn.momo.ui.AboutMeScreen;

import java.util.List;

public class ScrollInsideModalToText implements Interaction {
    private final String text;

    @Override
    @Step("{0} scroll inside modal to option #text")
    public <T extends Actor> void performAs(T theUser) {
        // Get and case mobile driver
        WebDriver driver = GetCurrentDriver.usedBy(theUser);
        MobileDriver mobileDriver = (MobileDriver) driver;
        // Declare touch action
        TouchAction touchAction = new TouchAction(mobileDriver);
        // Get default option list when open modal
        List<MobileElement> defaultList = mobileDriver.findElements(AboutMeScreen.SelectModalScroll.ALL_DEFAULT_OPTION);
        /* Get last position element of option list
          Calculate point to scroll from - to:
          point from = point of last position element of list
          point to with xOffset = xOffset of point from
          point to with yOffset = (yOffset of point from - (height of a option)*(number of option))
         */
        /* After every scroll, get new option list then check whether it has option to select
          If not:
          Compare list after scroll to list before scroll
          If after list same as before list then:
          Scrolled to end but not found option to select
          =>Option to select is not existed
         */
        MobileElement lastElmOfList = defaultList.get(defaultList.size()-1);
        int heightRow = lastElmOfList.getSize().height;
        Point fromElmLocation = lastElmOfList.getLocation();
        List<String> beforeScroll = Text.of(AboutMeScreen.SelectModalScroll.ALL_OPTION).viewedBy(theUser).asList();
        boolean optionToSelectIsExisted = false;
        boolean optionToSelectIsNotExist = false;
        if (!beforeScroll.contains(text)) {
            do {
                touchAction
                        .longPress(PointOption.point(fromElmLocation))
                        .moveTo(PointOption.point(fromElmLocation.x, (fromElmLocation.y - heightRow * defaultList.size())))
                        .release()
                        .perform();
                List<String> afterScroll = Text.of(AboutMeScreen.SelectModalScroll.ALL_OPTION).viewedBy(theUser).asList();
                if (afterScroll.contains(text)) {
                    optionToSelectIsExisted = true;
                } else {
                    optionToSelectIsNotExist = afterScroll.equals(beforeScroll);
                    beforeScroll = afterScroll;
                    System.out.println(text + "is not existed");
                }
            }while (!optionToSelectIsExisted && !optionToSelectIsNotExist);
        }
    }

    public ScrollInsideModalToText(String text){
        this.text=text;
    }
}
