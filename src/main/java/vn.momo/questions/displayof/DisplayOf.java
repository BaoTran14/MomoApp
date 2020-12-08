package vn.momo.questions.displayof;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import vn.momo.ui.AndroidPermissionPopup;

public class DisplayOf {
    public static Question<Boolean> permissionRequest() {
        return new DisplayOfPermissionReq();
    }

    public static Question<Boolean> pictureAppSelection() {
        return new DisplayOfPictureAppSelect();
    }

    public static boolean androidPermissionPopupViewBy(Actor theUser) {
        return Visibility.of(AndroidPermissionPopup.ALLOW_BUTTON)
                .viewedBy(theUser)
                .resolve();
    }

    public static Question<Boolean> successfulUpdateMessage() {
        return new DisplayOfSuccessUpdateMessage();
    }

    public static class PhoneRequestScreen {

        public static Question<String> withTitle() {
            return new PhoneRequestScreenTitle();
        }

        public static Question<String> withContent() {
            return new PhoneRequestScreenContent();
        }
    }

    public static class WelcomeScreen {

        public static Question<String> withTitle() {
            return new TitleOfWelcomeScreen();
        }
    }
}
