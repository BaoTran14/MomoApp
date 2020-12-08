package vn.momo.actions.scroll;

import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollInsideModal {
    public static Interaction to(String location) {
        return instrumented(ScrollInsideModalToText.class, location);
    }
}
