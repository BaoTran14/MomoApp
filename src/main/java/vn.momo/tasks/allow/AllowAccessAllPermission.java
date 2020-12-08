package vn.momo.tasks.allow;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import vn.momo.questions.displayof.DisplayOf;
import vn.momo.ui.AndroidPermissionPopup;

public class AllowAccessAllPermission implements Task {
    @Override
    public <T extends Actor> void performAs(T theUser) {
        boolean displayOfAndroidPermissionIsTrue = DisplayOf.androidPermissionPopupViewBy(theUser);
        while (displayOfAndroidPermissionIsTrue) {
            AndroidPermissionPopup.ALLOW_BUTTON.resolveFor(theUser).click();
            displayOfAndroidPermissionIsTrue = DisplayOf.androidPermissionPopupViewBy(theUser);
        }
    }
}
