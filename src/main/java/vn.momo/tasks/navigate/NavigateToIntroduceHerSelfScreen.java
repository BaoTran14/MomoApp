package vn.momo.tasks.navigate;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.ui.ProfileScreen;

public class NavigateToIntroduceHerSelfScreen implements Task {
    @Override
    @Step("{0} navigates to introduce herself screen")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                Navigate.toProfileScreen(),
                MobileScrollTo.text("Giới thiệu"),
                Click.on(ProfileScreen.INTRODUCTION_EDIT_BUTTON)
        );
    }
}
