package vn.momo.tasks.change;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vn.momo.actions.Tap;
import vn.momo.actions.capture.Capture;
import vn.momo.tasks.access.Access;
import vn.momo.ui.ConfirmCapturedImageScreen;
import vn.momo.ui.ProfileScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChangeProfileImageCapturedByCamera implements Task {
    @Override
    @Step("{0} changes her profile image captured by camera")
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                WaitUntil.the(ProfileScreen.INTRODUCTION_LABEL, isVisible()).forNoMoreThan(30).seconds(),
                Tap.onPoint(366, 346),
                WaitUntil.the(ProfileScreen.SELECT_GALLERY, isClickable()).forNoMoreThan(30).seconds(),
                Click.on(ProfileScreen.SELECT_CAMERA),
                Access.appWithPermission(),
                Capture.imageByCamera(),
                WaitUntil.the(ConfirmCapturedImageScreen.OK_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ConfirmCapturedImageScreen.OK_BUTTON)
        );
    }
}
