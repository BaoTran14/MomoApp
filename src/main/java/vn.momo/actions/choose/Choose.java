package vn.momo.actions.choose;

import net.serenitybdd.screenplay.Interaction;
import vn.momo.model.Mode;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Choose {
    public static Interaction imageToUpdate() {
        return instrumented(ChooseImageToUpdate.class);
    }

    public static Interaction photoApp() {
        return instrumented(ChoosePhotoApp.class);
    }

    public static Interaction privacyAs(Mode mode) {
        return instrumented(ChoosePrivacy.class, mode);
    }
}
