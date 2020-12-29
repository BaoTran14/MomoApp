package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import vn.momo.ui.PermissionRequestPopup;

public class DisplayOfPermissionReq implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor theUser) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Visibility.of(PermissionRequestPopup.ALLOW_ACCESS_BUTTON)
                .viewedBy(theUser).resolve();
    }
}
