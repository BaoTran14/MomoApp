package vn.momo.tasks.update;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import vn.momo.actions.choose.Choose;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.actions.scroll.ScrollInsideModal;
import vn.momo.model.Mode;
import vn.momo.ui.AboutMeScreen;

public class UpdateCurrentHomeLocation implements Task {
    private final String location;
    private final Mode mode;

    @Override
    @Step("{0} updates current home location at #location to #mode")
    public <T extends Actor> void performAs(T theUser) {
        Target LOCATION_TO_SELECT = Target.the("location to be updated").located(By.xpath("//*[@text='"+location+"']"));
        theUser.attemptsTo(
                Click.on(AboutMeScreen.CURRENT_HOME_LOCATION_SELECT_BOX),

                ScrollInsideModal.to(location),
                MobileScrollTo.text(location),
                Click.on(LOCATION_TO_SELECT),
                Click.on(AboutMeScreen.CURRENT_HOME_LOCATION_SELECT_MODE_BUTTON),
                Choose.privacyAs(mode),
                Click.on(AboutMeScreen.SAVE_BUTTON)
        );
    }

    public UpdateCurrentHomeLocation(String location, Mode mode){
        this.location=location;
        this.mode=mode;
    }
}
