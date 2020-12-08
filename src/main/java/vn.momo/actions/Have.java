package vn.momo.actions;

import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Have {
    public static Interaction imageToUpdate(String imgPath) {
        return instrumented(PushFileToRemoteDevice.class, imgPath);
    }
}
