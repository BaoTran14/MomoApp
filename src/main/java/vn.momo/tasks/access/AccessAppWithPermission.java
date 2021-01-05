package vn.momo.tasks.access;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import vn.momo.questions.displayof.DisplayOf;
import vn.momo.tasks.allow.Allow;
import vn.momo.ui.AndroidPermissionPopup;
import vn.momo.ui.PermissionRequestPopup;
import vn.momo.ui.PictureAppSelectionGrid;

import static org.hamcrest.Matchers.is;


public class AccessAppWithPermission implements Task {
    @Override
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                Check.whether(DisplayOf.permissionRequest(), is(true))
                        .andIfSo(
                                Click.on(PermissionRequestPopup.ALLOW_ACCESS_BUTTON),
                                Click.on(AndroidPermissionPopup.ALLOW_BUTTON)
                        ),
                Check.whether(DisplayOf.pictureAppSelection(), is(true))
                        .andIfSo(
                                Click.on(PictureAppSelectionGrid.PHOTOS_OPTION)
//                                Choose.photoApp()
                        ),
                Allow.accessAllPermission()
        );
    }
}
