package vn.momo.actions.scroll;

import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MobileScrollTo {
    public static Interaction text(String text) {
        return instrumented(MobileScrollToText.class, text);
    }
}
