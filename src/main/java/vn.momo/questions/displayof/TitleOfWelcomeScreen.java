package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import vn.momo.ui.WelcomeScreen;

public class TitleOfWelcomeScreen implements Question<String> {
    @Override
    public String answeredBy(Actor theUser) {
        return Text.of(WelcomeScreen.TITLE)
                .viewedBy(theUser)
                .asString();
    }
}
