package vn.momo.tasks.update;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.choose.Choose;
import vn.momo.model.Mode;
import vn.momo.ui.AboutMeScreen;

public class UpdateIntimateName implements Task {
    private final String intimateName;
    private final Mode mode;

    public UpdateIntimateName(String intimateName, Mode mode) {
        this.intimateName = intimateName;
        this.mode = mode;
    }

    @Override
    @Step("{0} update intimate name as #intimateName to #mode")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                Enter.theValue(intimateName).into(AboutMeScreen.INTIMATE_NAME_FIELD),
                Click.on(AboutMeScreen.INTIMATE_NAME_SELECT_MODE_BUTTON),
                Choose.privacyAs(mode),
                Click.on(AboutMeScreen.SAVE_BUTTON)
        );
    }
}
