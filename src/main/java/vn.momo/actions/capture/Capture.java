package vn.momo.actions.capture;

import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Capture {
    public static Interaction imageByCamera() {
        return instrumented(CaptureImageByCamera.class);
    }
}
