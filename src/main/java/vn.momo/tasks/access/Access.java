package vn.momo.tasks.access;

import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Access {
    public static Task photosApp() {
        return instrumented(AccessGalleryApp.class);
    }
}
