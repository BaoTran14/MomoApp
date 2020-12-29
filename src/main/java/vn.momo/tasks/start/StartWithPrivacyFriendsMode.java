package vn.momo.tasks.start;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.choose.Choose;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.model.Mode;
import vn.momo.ui.PrivacyScreen;
import vn.momo.ui.ProfileScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class StartWithPrivacyFriendsMode implements Task {
    private final Mode mode;

    @Override
    @Step("{0} starts with privacy friend mode is #mode")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                WaitUntil.the(ProfileScreen.SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(30).seconds(),
                MobileScrollTo.text("Riêng tư"),
                Click.on(ProfileScreen.PRIVACY_EDIT_BUTTON),
                Click.on(PrivacyScreen.FRIEND_LIST_SELECT_MODE_BOX),
                Choose.privacyAs(mode),
                Click.on(PrivacyScreen.SAVE_BUTTON),
                WaitUntil.the(ProfileScreen.SCREEN_TITLE_LABEL, isVisible()).forNoMoreThan(30).seconds()
        );
    }

    public StartWithPrivacyFriendsMode(Mode mode){
        this.mode=mode;
    }
}
