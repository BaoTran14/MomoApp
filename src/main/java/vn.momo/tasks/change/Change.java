package vn.momo.tasks.change;

import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Change {
    public static Task profileImage() {
        return instrumented(ChangeProfileImage.class);
    }

    public static Task profileImageCapturedByCamera() {
        return instrumented(ChangeProfileImageCapturedByCamera.class);
    }
}
