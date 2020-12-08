package vn.momo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import vn.momo.ui.WelcomeScreen;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private final String phoneNumber;
    private final String password;

    public Login(String phoneNumber, String password) {
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public static LoginBuilder withPhoneNumber(String phone_number) {
        return new LoginBuilder(phone_number);
    }

    @Step("{0} logs in her momo account")
    @Override
    public <T extends Actor> void performAs(T theUser) {
        theUser.attemptsTo(
                WaitUntil.the(WelcomeScreen.PASSWORD_FIELD, isVisible()).forNoMoreThan(60).seconds(),
                Enter.theValue(password).into(WelcomeScreen.PASSWORD_FIELD)
//                Click.on(WelcomeScreen.LOGIN_BUTTON)
        );
    }

    public static class LoginBuilder {

        private final String phoneNumber;

        LoginBuilder(String phone_number) {
            this.phoneNumber = phone_number;
        }

        public Login andPassword(String password) {
            return instrumented(Login.class, phoneNumber, password);
        }
    }
}
