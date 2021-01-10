package vn.momo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import vn.momo.ui.MomoScreen;

public class AnnouceText implements Question<String> {
    public static AnnouceText ofMoney() {
        return new AnnouceText();
    }

    @Override
    public String answeredBy(Actor theUser) {
        MomoScreen.MONEY_ANNOUCE_TEXT.resolveFor(theUser).waitUntilVisible();
        return Text.of(MomoScreen.MONEY_ANNOUCE_TEXT)
                .viewedBy(theUser)
                .asString();
    }
}
