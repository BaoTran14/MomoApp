package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import vn.momo.ui.ProfileScreen;

public class DisplayOfSuccessUpdateMessage implements Question<Boolean> {
    @Subject("display of successful update message")
    @Override
    public Boolean answeredBy(Actor theUser) {
        return Visibility.of(ProfileScreen.SUCCESS_NOTIFICATION)
                .viewedBy(theUser)
                .resolve();
    }
}
