package vn.momo.tasks.allow;

import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Allow {
    public static Task accessAllPermission() {
        return instrumented(AllowAccessAllPermission.class);
    }
}
