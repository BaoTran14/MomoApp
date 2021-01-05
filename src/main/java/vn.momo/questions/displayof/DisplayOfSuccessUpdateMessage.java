package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import vn.momo.ui.ProfileScreen;

public class DisplayOfSuccessUpdateMessage implements Question<Boolean> {
    @Subject("display of successful update message")
    @Override
    public Boolean answeredBy(Actor theUser) {
        ProfileScreen.SUCCESS_NOTIFICATION.resolveFor(theUser).waitUntilVisible();
        return true;
    }
}
