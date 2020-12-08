package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import vn.momo.ui.PhoneRequestScreen;

public class PhoneRequestScreenContent implements Question<String> {
    @Override
    public String answeredBy(Actor theUser) {
        return Text.of(PhoneRequestScreen.CONTENT)
                .viewedBy(theUser)
                .asString();
    }
}
