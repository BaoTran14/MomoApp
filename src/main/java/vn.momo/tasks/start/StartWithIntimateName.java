package vn.momo.tasks.start;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.ui.AboutMeScreen;
import vn.momo.ui.ProfileScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class StartWithIntimateName implements Task {
    private final String intimateName;

    @Override
    @Step("{0} starts with intimate name #intimateName")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                Enter.theValue(intimateName).into(AboutMeScreen.INTIMATE_NAME_FIELD),
                Click.on(AboutMeScreen.SAVE_BUTTON),
                WaitUntil.the(ProfileScreen.SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(30).seconds(),
                MobileScrollTo.text("Giới thiệu"),
                Click.on(ProfileScreen.INTRODUCTION_EDIT_BUTTON)
        );
    }

    public StartWithIntimateName(String intimateName){
        this.intimateName=intimateName;
    }
}
