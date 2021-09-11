package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.waits.WaitUntil;
import vn.momo.ui.ProfileScreen;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DisplayOfSuccessUpdateMessage implements Question<Boolean> {
    @Subject("display of successful update message")
    @Override
    public Boolean answeredBy(Actor theUser) {
        WaitUntil.the(ProfileScreen.SUCCESS_NOTIFICATION, isVisible()).forNoMoreThan(60).seconds();
//        ProfileScreen.SUCCESS_NOTIFICATION.resolveFor(theUser).waitUntilVisible();
        return true;
    }
}
