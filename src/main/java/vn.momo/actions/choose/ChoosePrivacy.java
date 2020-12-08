package vn.momo.actions.choose;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;
import vn.momo.model.Mode;
import vn.momo.ui.SelectModeFrame;

public class ChoosePrivacy implements Interaction {
    private final Mode mode;

    public ChoosePrivacy(Mode mode) {
        this.mode = mode;
    }

    @Override
    @Step("{0} choose privacy mode as #mode")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                Check.whether(mode.equals(Mode.PUBLIC))
                        .andIfSo(
                                Click.on(SelectModeFrame.PUBLIC_MODE)
                        ),
                Check.whether(mode.equals(Mode.FRIENDS))
                        .andIfSo(
                                Click.on(SelectModeFrame.FRIENDS_MODE)
                        ),
                Check.whether(mode.equals(Mode.ONLY_ME))
                        .andIfSo(
                                Click.on(SelectModeFrame.ONLY_ME_MODE)
                        )
        );
    }
}
