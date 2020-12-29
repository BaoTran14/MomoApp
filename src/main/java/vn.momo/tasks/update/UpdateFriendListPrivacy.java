package vn.momo.tasks.update;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.choose.Choose;
import vn.momo.actions.scroll.MobileScrollTo;
import vn.momo.model.Mode;
import vn.momo.ui.PrivacyScreen;
import vn.momo.ui.ProfileScreen;

public class UpdateFriendListPrivacy implements Task {
    private final Mode mode;

    @Override
    @Step("{0} updates friend list privacy to #mode")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                MobileScrollTo.text("Riêng tư"),
                Click.on(ProfileScreen.PRIVACY_EDIT_BUTTON),
                Click.on(PrivacyScreen.FRIEND_LIST_SELECT_MODE_BOX),
                Choose.privacyAs(mode),
                Click.on(PrivacyScreen.SAVE_BUTTON)
        );
    }

    public UpdateFriendListPrivacy(Mode mode){
        this.mode=mode;
    }
}
