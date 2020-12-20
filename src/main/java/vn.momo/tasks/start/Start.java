package vn.momo.tasks.start;

import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Start {
    public static Task withHomeLocationIs(String location) {
        return instrumented(StartWithHomeLocation.class, location);
    }

    public static Task withIntimateName(String intimateName) {
        return instrumented(StartWithIntimateName.class, intimateName);
    }
}
