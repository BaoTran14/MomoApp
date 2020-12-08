package vn.momo.tasks.navigate;

import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate {
    public static Task toProfileScreen() {
        return instrumented(NavigateToProfileScreen.class);
    }

    public static Task toIntroduceHerSelfScreen() {
        return instrumented(NavigateToIntroduceHerSelfScreen.class);
    }
}
