package vn.momo.model;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;

public class GetCurrentDriver {
    public static <T extends Actor> WebDriver usedBy(T theUser) {
        WebDriver webDriver = BrowseTheWeb.as(theUser).getDriver();
        return ((WebDriverFacade) webDriver).getProxiedDriver();
    }
}
