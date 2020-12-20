package vn.momo.tasks.start;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.actions.scroll.ScrollInsideModal;
import vn.momo.ui.AboutMeScreen;
import vn.momo.ui.ProfileScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StartWithHomeLocation implements Task {
    private final String location;

    @Override
    @Step("{0} starts with home location is #location")
    public <T extends Actor> void performAs(T theUser) {
        Target LOCATION_TO_SELECT = Target.the("location to be updated").located(By.xpath("(//*[@text='"+location+"'])[last()]"));
        theUser.attemptsTo(
                Click.on(AboutMeScreen.CURRENT_HOME_LOCATION_SELECT_BOX),
                ScrollInsideModal.to(location),
                Click.on(LOCATION_TO_SELECT),
                Click.on(AboutMeScreen.SAVE_BUTTON),
                WaitUntil.the(ProfileScreen.SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(30).seconds(),
                MobileScrollTo.text("Giới thiệu"),
                Click.on(ProfileScreen.INTRODUCTION_EDIT_BUTTON)
        );
    }

    public StartWithHomeLocation(String location){
        this.location=location;
    }
}
